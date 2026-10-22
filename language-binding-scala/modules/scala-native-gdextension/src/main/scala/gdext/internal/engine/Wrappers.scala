package gdext.internal.engine

import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import scala.scalanative.libc.stdlib
import gdext.Godot
import gdext.builtin.{StringName, StringNames, BuiltinSizes}
import gdext.internal.ffi.types.*
import gdext.internal.register.{ClassRegistry, GodotScriptClass, Tokens}

/** One Scala wrapper per engine object, cached on the object itself through
  * Godot's instance bindings (the godot-cpp mechanism).
  *
  * The first time an object is wrapped, Godot calls [[createCallback]]: it
  * returns the object's bound user instance if it has one, else a fresh wrapper
  * of the object's lowest ancestor class the installed factory knows (see
  * [[installFactory]]). Later wraps are a single
  * `object_get_instance_binding` call: no allocation, and the same wrapper
  * every time. When the engine frees the object, Godot calls [[freeCallback]],
  * which clears the wrapper's handle, so calling a method on it throws instead
  * of touching freed memory.
  *
  * The binding is a [[gdext.internal.SlotTable]] token, never a raw Scala
  * address, so the GC always sees the wrapper through the table.
  */
object Wrappers {
  private val table = new gdext.internal.SlotTable[GodotScriptClass]

  /** Engine class name -> fresh wrapper of that class, or null if unknown.
    * Installed by the generated entry point before anything is wrapped. The
    * build generates it for just the engine classes the game can observe (the
    * classes it names, plus every class reachable from them through method
    * return types), so the other ~900 classes are never linked. Every cast the
    * program can make targets one of those classes, and a wrapper is always of
    * the object's lowest such ancestor, so it satisfies all of them. */
  private var factory: String => GodotScriptClass = null

  def installFactory(f: String => GodotScriptClass): Unit = factory = f
  private var callbacksPtr: Ptr[GDExtensionInstanceBindingCallbacks] = null

  private def callbacks: Ptr[GDExtensionInstanceBindingCallbacks] = {
    if (callbacksPtr == null) {
      val p = stdlib
        .malloc(sizeof[GDExtensionInstanceBindingCallbacks])
        .asInstanceOf[Ptr[GDExtensionInstanceBindingCallbacks]]
      !(!p).at_create_callback = createCallback
      !(!p).at_free_callback = freeCallback
      !(!p).at_reference_callback = referenceCallback
      callbacksPtr = p
    }
    callbacksPtr
  }

  private def token: CVoidPtr = Godot.library.asInstanceOf[CVoidPtr]

  // `object_get_instance_binding` re-typed over addresses: a `Ptr` returned
  // from an FFI call is boxed, a `Long` is not. Pointers and 64-bit integers
  // travel in the same registers, so the C call is unchanged.
  private var getBindingFn: CFuncPtr3[Long, Long, Long, Long] = null
  private def getBinding: CFuncPtr3[Long, Long, Long, Long] = {
    if (getBindingFn == null)
      getBindingFn = CFuncPtr.fromPtr[CFuncPtr3[Long, Long, Long, Long]](
        CFuncPtr.toPtr(Godot.interface.object_get_instance_binding)
      )
    getBindingFn
  }
  private var tokenAddr: Long = 0L
  private var callbacksAddr: Long = 0L

  /** The wrapper for engine object `p` (null for a null handle). */
  def of(p: GDExtensionObjectPtr): GodotScriptClass =
    if (p == null) null else at(p.toLong)

  /** The wrapper for the engine object at address `addr` (0 for none). Takes
    * the address, not a `Ptr`, so the call does not box (see `Addr`).
    */
  def at(addr: Long): GodotScriptClass =
    if (addr == 0L) null
    else {
      if (callbacksAddr == 0L) {
        callbacksAddr = callbacks.toLong
        tokenAddr = token.toLong
      }
      val w = table(getBinding(addr, tokenAddr, callbacksAddr))
      if (w != null && w.hostPtr != null && w.hostPtr.toLong == addr) w
      else {
        val p = gdext.internal.Addr.ptr[Byte](addr)
        // A binding we cannot resolve (e.g. one left by an earlier library
        // image): wrap without caching.
        val fresh = newWrapper(p)
        if (fresh != null) fresh.setHostObject(p)
        fresh
      }
    }

  /** The typed wrapper for a borrowed `Object*` return (its address). */
  inline def borrowed[T <: GodotScriptClass](addr: Long): T =
    at(addr).asInstanceOf[T]

  /** The typed wrapper for a borrowed object handle. */
  inline def borrowed[T <: GodotScriptClass](o: GodotObject): T =
    of(GodotObject.objectPtr(o)).asInstanceOf[T]

  /** The typed wrapper for a `Ref<T>` return (its address): the engine handed
    * over one reference, which the wrapper now owns (see [[Ownership]]).
    */
  inline def owned[T <: GodotScriptClass](addr: Long): T = {
    val w = at(addr)
    if (w != null) Ownership.adopt(w)
    w.asInstanceOf[T]
  }

  /** The engine handle to pass for an object argument (null passes null). */
  inline def handle(w: GodotScriptClass): GodotObject =
    if (w == null) GodotObject.Null else w.hostObject

  /** Make `scala` (a just-bound user instance) the wrapper for `obj`, so wraps
    * of `obj` return it directly.
    */
  def bindUser(obj: GDExtensionObjectPtr, scala: GodotScriptClass): Unit = {
    val existing = Godot.interface.object_get_instance_binding(obj, token, null)
    if (existing != null) {
      // Godot keeps the existing binding pointer; point its token at `scala`.
      table.put(Tokens.fromPtr(existing), scala)
    } else {
      val tok = table.add(scala)
      Godot.interface.object_set_instance_binding(
        obj,
        token,
        Tokens.toPtr(tok),
        callbacks
      )
    }
  }

  private def newWrapper(p: GDExtensionObjectPtr): GodotScriptClass = {
    val id = Godot.interface.object_get_instance_id(p).toLong
    val user = ClassRegistry.instanceForObjectId(id)
    if (user != null) user
    else {
      val w = engineWrapperFor(p)
      w.setHostObject(p)
      w
    }
  }

  /** A wrapper of the most-derived class of `p` that has a generated one. */
  private def engineWrapperFor(p: GDExtensionObjectPtr): GodotScriptClass = {
    val sn = stackalloc[Byte](BuiltinSizes.StringName.toCSize)
    Godot.interface.object_get_class_name(p, Godot.library, sn)
    var name = StringNames.adopt(sn.toLong)
    var text = StringName.toScala(name.ptr)
    val f = factory
    if (f == null)
      throw new IllegalStateException(
        "no engine wrapper factory installed (GodotEntry.useEngineClasses)"
      )
    var w = f(text)
    while (w == null && text.nonEmpty) {
      name = gdext.classes.ClassDB.singleton.getParentClass(name)
      text = StringName.toScala(name.ptr)
      w = f(text)
    }
    if (w == null) f("Object") else w
  }

  private val createCallback: GDExtensionInstanceBindingCreateCallback =
    (_token: CVoidPtr, instance: CVoidPtr) => {
      gdext.internal.GcThread.ensureRegistered()
      val w = newWrapper(instance.asInstanceOf[GDExtensionObjectPtr])
      if (w == null) null
      else Tokens.toPtr(table.add(w))
    }

  private val freeCallback: GDExtensionInstanceBindingFreeCallback =
    (_token: CVoidPtr, instance: CVoidPtr, binding: CVoidPtr) => {
      gdext.internal.GcThread.ensureRegistered()
      val w = table.remove(Tokens.fromPtr(binding))
      if (w != null && w.hostPtr == instance.asInstanceOf[GDExtensionObjectPtr])
        w.setHostObject(null)
    }

  // Called on every reference/unreference of a RefCounted that has a binding.
  // The wrapper never keeps the object alive (ownership is explicit), so the
  // object may always die.
  private val referenceCallback: GDExtensionInstanceBindingReferenceCallback =
    (_token: CVoidPtr, _binding: CVoidPtr, _reference: GDExtensionBool) =>
      1.toUByte
}
