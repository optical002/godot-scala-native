package gdext.internal.register

import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import scala.scalanative.libc.stdlib
import gdext.Godot
import gdext.builtin.StringNames
import gdext.internal.ffi.types.*

/**
 * Registers a user-defined Scala class with Godot's ClassDB.
 *
 * This is the explicit builder substrate the macro layer (and hand-written
 * code) targets. It fills a [[GDExtensionClassCreationInfo4]] with *static*
 * trampolines — the GDExtension callbacks cannot capture closures — that defer
 * all per-class/per-instance behaviour to [[ClassRegistry]] via integer tokens
 * (see [[Tokens]]).
 *
 * Lifecycle wired here:
 *  - **create**: construct the parent engine object, build the Scala instance,
 *    link them with `object_set_instance`, and return the engine handle.
 *  - **free**: drop the Scala instance from the registry.
 *  - **get_virtual**: report which engine virtuals (`_ready`/`_process`/
 *    `_physics_process`) the subclass overrides, handing Godot the matching
 *    static dispatcher.
 */
object ClassRegistration {

  // Set by `register` whenever a class is found already present in ClassDB —
  // the signature of an editor hot-reload (the previous library image had
  // registered it and has not been deinitialized yet; a clean first load finds
  // nothing). Per-image static, so it starts false in each freshly loaded
  // image. `consumeReloadDetected` reads-and-clears it.
  private var reloadDetected: Boolean = false

  /**
   * True iff this registration pass replaced a class left over from a prior
   * library image (i.e. we are in a hot-reload, not a first load). Clears the
   * flag so a later call does not see a stale `true`.
   */
  def consumeReloadDetected(): Boolean = {
    val r = reloadDetected
    reloadDetected = false
    r
  }

  /** Register `desc` so Godot can instantiate and drive instances of it. */
  def register(desc: ClassDescriptor): Unit = {
    // Hot-reload detection only. A non-null class tag here means the class was
    // already in ClassDB, i.e. we are in an editor hot-reload (a clean first
    // load finds nothing).
    //
    // We deliberately do NOT manually unregister the stale class. On reload Godot
    // tears down the previous image's classes itself (verified: by the time our
    // new image registers, every probe already reads null). Calling
    // classdb_unregister_extension_class ourselves races that teardown — and when
    // the class still has a live instance (a node or a custom Resource held by
    // the open scene/inspector) the two collide and DEADLOCK the editor. The
    // freeze is timing-sensitive (adding logging moves where it hangs), the
    // signature of a cross-thread race. Letting Godot own the old-class lifecycle
    // and only (re)registering our fresh class avoids it.
    gdext.Log.trace(
      s"register: BEGIN ${desc.className} (parent=${desc.parentClassName}, " +
        s"isRuntime=${desc.isRuntime}, virtuals=${desc.overriddenVirtuals.mkString(",")})"
    )
    val nameSn = StringNames.cached(desc.className).ptr
    val existingTag = Godot.interface.classdb_get_class_tag(nameSn)
    gdext.Log.trace(
      s"register: ${desc.className} probe tag=${if (existingTag == null) "null" else "PRESENT"}"
    )
    if (existingTag != null)
      reloadDetected = true

    val classToken = ClassRegistry.registerClass(desc)
    gdext.Log.trace(s"register: ${desc.className} classToken=$classToken")

    // Allocate the creation-info struct with malloc: Godot keeps a pointer to
    // it for the class's lifetime, so it must not be stack- or GC-managed.
    val info = stdlib
      .malloc(sizeof[GDExtensionClassCreationInfo4])
      .asInstanceOf[Ptr[GDExtensionClassCreationInfo4]]
    // Zero it so all the optional callbacks we don't set are null.
    val raw = info.asInstanceOf[Ptr[Byte]]
    var i = 0
    val n = sizeof[GDExtensionClassCreationInfo4].toInt
    while (i < n) { raw(i) = 0.toByte; i += 1 }

    // Field-pointer writes so the assignments land in the malloc'd struct.
    !(!info).at_is_virtual = 0.toUByte
    !(!info).at_is_abstract = 0.toUByte
    !(!info).at_is_exposed = 1.toUByte
    // is_runtime = true marks the class as a runtime-only (non-tool) class, so
    // the editor does not instantiate/process it while merely editing a scene;
    // its virtuals (_ready/_process) then run only in the running game. Editor
    // tool classes (inspector plugins) set this false (see ClassDescriptor).
    !(!info).at_is_runtime = (if (desc.isRuntime) 1 else 0).toUByte
    !(!info).at_create_instance_func = createInstance
    !(!info).at_free_instance_func = freeInstance
    !(!info).at_recreate_instance_func = recreateInstance
    !(!info).at_get_virtual_func = getVirtual
    // Rewrites comp-reference String properties into ENUM dropdowns at inspect
    // time (see CompEnumRegistry). Safe to set unconditionally: the trampoline
    // returns "not handled" for every property without a registered builder.
    !(!info).at_validate_property_func = validateProperty
    !(!info).at_class_userdata = Tokens.toPtr(classToken)

    gdext.Log.trace(s"register: ${desc.className} classdb_register_extension_class4 begin")
    Godot.interface.classdb_register_extension_class4(
      Godot.library,
      StringNames.cached(desc.className).ptr,
      StringNames.cached(desc.parentClassName).ptr,
      info
    )
    gdext.Log.trace(s"register: END ${desc.className}")
  }

  /**
   * Unregister every class we registered with Godot. Called on deinitialize so
   * a hot-reload starts from a clean slate; re-registering then succeeds
   * instead of hitting Godot's "already registered" error.
   */
  def unregisterAll(): Unit = {
    val names = ClassRegistry.registeredClassNames
    // Godot refuses to unregister a class while a registered extension class
    // still inherits from it, so unregister children before parents. `depth`
    // counts hops up the chain of still-registered parents; ordering by
    // descending depth puts the deepest subclasses first.
    val present = names.toSet
    def depth(n: String, seen: Set[String]): Int = {
      val p = ClassRegistry.parentNameOf(n)
      if (p != null && present.contains(p) && !seen.contains(p)) 1 + depth(p, seen + n)
      else 0
    }
    val ordered = names.sortBy(n => -depth(n, Set(n)))
    gdext.Log.trace(s"unregisterAll: ${ordered.length} classes")
    ordered.foreach { name =>
      val sn = StringNames.cached(name).ptr
      if (Godot.interface.classdb_get_class_tag(sn) != null) {
        gdext.Log.trace(s"unregisterAll: unregister $name")
        Godot.interface.classdb_unregister_extension_class(Godot.library, sn)
      }
    }
    gdext.Log.trace("unregisterAll: clearClasses")
    ClassRegistry.clearClasses()
    gdext.Log.trace("unregisterAll: done")
  }

  // --- static trampolines -------------------------------------------------

  /** Build a Scala instance for `desc` and bind it to the engine `obj`. */
  private def bindInstance(
    desc: ClassDescriptor,
    obj: GDExtensionObjectPtr
  ): GDExtensionClassInstancePtr = {
    gdext.Log.trace(s"bind: ${desc.className} factory() begin")
    val scala = desc.factory()
    scala.setHostObject(obj)
    val instanceToken = ClassRegistry.addInstance(scala)
    gdext.Log.trace(
      s"bind: ${desc.className} instanceToken=$instanceToken object_set_instance begin"
    )
    val instancePtr =
      Tokens.toPtr(instanceToken).asInstanceOf[GDExtensionClassInstancePtr]
    Godot.interface.object_set_instance(
      obj,
      StringNames.cached(desc.className).ptr,
      instancePtr
    )
    gdext.Log.trace(s"bind: ${desc.className} DONE (token=$instanceToken)")
    instancePtr
  }

  private val createInstance: GDExtensionClassCreateInstance2 =
    (classUserdata: CVoidPtr, _notifyPostInit: GDExtensionBool) => {
      val desc = ClassRegistry.classFor(Tokens.fromPtr(classUserdata))
      gdext.Log.trace(s"createInstance: ENTER ${desc.className}")
      // Construct the underlying engine object of the parent class, then bind.
      gdext.Log.trace(s"createInstance: ${desc.className} construct parent ${desc.parentClassName} begin")
      val obj = Godot.interface.classdb_construct_object2(
        StringNames.cached(desc.parentClassName).ptr
      )
      gdext.Log.trace(s"createInstance: ${desc.className} parent constructed, binding")
      bindInstance(desc, obj)
      gdext.Log.trace(s"createInstance: EXIT ${desc.className}")
      obj
    }

  /**
   * Called by Godot during a hot-reload of the library: the engine object
   * already exists, so we only rebuild the Scala instance and re-bind it (no
   * new engine object). Returning a fresh instance pointer lets the editor keep
   * the node alive across a rebuild without a restart.
   */
  private val recreateInstance: GDExtensionClassRecreateInstance =
    (classUserdata: CVoidPtr, obj: GDExtensionObjectPtr) => {
      val desc = ClassRegistry.classFor(Tokens.fromPtr(classUserdata))
      gdext.Log.trace(s"recreateInstance: ENTER ${desc.className}")
      val r = bindInstance(desc, obj)
      gdext.Log.trace(s"recreateInstance: EXIT ${desc.className}")
      r
    }

  private val freeInstance: GDExtensionClassFreeInstance =
    (_classUserdata: CVoidPtr, instance: GDExtensionClassInstancePtr) => {
      val tok = Tokens.fromPtr(instance)
      gdext.Log.trace(s"freeInstance: ENTER token=$tok")
      val removed = ClassRegistry.removeInstance(tok)
      gdext.Log.trace(
        s"freeInstance: EXIT token=$tok removed=${if (removed == null) "null" else removed.getClass.getSimpleName}"
      )
      ()
    }

  private val getVirtual: GDExtensionClassGetVirtual2 =
    (classUserdata: CVoidPtr, name: GDExtensionConstStringNamePtr, _hash: CUnsignedInt) => {
      val desc = ClassRegistry.classFor(Tokens.fromPtr(classUserdata))
      // Match by the StringName's text. Two StringName *handles* for the same
      // text are not pointer-equal, so we decode and compare the string.
      val vname = gdext.builtin.StringName.toScala(name)
      val overridden = desc.overriddenVirtuals.contains(vname)
      gdext.Log.trace(
        s"getVirtual: ${desc.className} '$vname' overridden=$overridden"
      )
      val dispatcher =
        if (overridden)
          vname match {
            case "_process"         => processDispatch
            case "_physics_process" => physicsProcessDispatch
            case "_ready"           => readyDispatch
            case "_enter_tree"      => enterTreeDispatch
            case "_exit_tree"       => exitTreeDispatch
            case "_update_property" => updatePropertyDispatch
            case "_can_handle"      => canHandleDispatch
            case "_parse_property"  => parsePropertyDispatch
            case _ => null.asInstanceOf[GDExtensionClassCallVirtual]
          }
        else null.asInstanceOf[GDExtensionClassCallVirtual]
      dispatcher
    }

  // --- virtual dispatchers (one per supported virtual) -------------------

  private val processDispatch: GDExtensionClassCallVirtual =
    (instance: GDExtensionClassInstancePtr, args: Ptr[GDExtensionConstTypePtr], _ret: GDExtensionTypePtr) => {
      val scala = ClassRegistry.instanceFor(Tokens.fromPtr(instance))
      if (scala != null) {
        val delta = !args(0).asInstanceOf[Ptr[CDouble]]
        scala._process(delta)
      } else gdext.Log.trace(s"_process: token=${Tokens.fromPtr(instance)} scala=null (stale?)")
    }

  private val physicsProcessDispatch: GDExtensionClassCallVirtual =
    (instance: GDExtensionClassInstancePtr, args: Ptr[GDExtensionConstTypePtr], _ret: GDExtensionTypePtr) => {
      val scala = ClassRegistry.instanceFor(Tokens.fromPtr(instance))
      if (scala != null) {
        val delta = !args(0).asInstanceOf[Ptr[CDouble]]
        scala._physics_process(delta)
      }
    }

  private val readyDispatch: GDExtensionClassCallVirtual =
    (instance: GDExtensionClassInstancePtr, _args: Ptr[GDExtensionConstTypePtr], _ret: GDExtensionTypePtr) => {
      val tok = Tokens.fromPtr(instance)
      val scala = ClassRegistry.instanceFor(tok)
      gdext.Log.trace(s"_ready: token=$tok scala=${if (scala == null) "null" else scala.getClass.getSimpleName}")
      if (scala != null) scala._ready()
    }

  // --- editor virtual dispatchers ----------------------------------------

  private val enterTreeDispatch: GDExtensionClassCallVirtual =
    (instance: GDExtensionClassInstancePtr, _args: Ptr[GDExtensionConstTypePtr], _ret: GDExtensionTypePtr) => {
      val tok = Tokens.fromPtr(instance)
      val scala = ClassRegistry.instanceFor(tok)
      gdext.Log.trace(s"_enter_tree: ENTER token=$tok scala=${if (scala == null) "null" else scala.getClass.getSimpleName}")
      if (scala != null) scala._enter_tree()
      gdext.Log.trace(s"_enter_tree: EXIT token=$tok")
    }

  private val exitTreeDispatch: GDExtensionClassCallVirtual =
    (instance: GDExtensionClassInstancePtr, _args: Ptr[GDExtensionConstTypePtr], _ret: GDExtensionTypePtr) => {
      val tok = Tokens.fromPtr(instance)
      val scala = ClassRegistry.instanceFor(tok)
      gdext.Log.trace(s"_exit_tree: ENTER token=$tok scala=${if (scala == null) "null" else scala.getClass.getSimpleName}")
      if (scala != null) scala._exit_tree()
      gdext.Log.trace(s"_exit_tree: EXIT token=$tok")
    }

  private val updatePropertyDispatch: GDExtensionClassCallVirtual =
    (instance: GDExtensionClassInstancePtr, _args: Ptr[GDExtensionConstTypePtr], _ret: GDExtensionTypePtr) => {
      val tok = Tokens.fromPtr(instance)
      val scala = ClassRegistry.instanceFor(tok)
      gdext.Log.trace(s"_update_property: token=$tok scala=${if (scala == null) "null" else scala.getClass.getSimpleName}")
      if (scala != null) scala._update_property()
    }

  private def writeBool(ret: GDExtensionTypePtr, v: Boolean): Unit =
    !ret.asInstanceOf[Ptr[GDExtensionBool]] = (if (v) 1 else 0).toUByte

  private def readString(p: GDExtensionConstTypePtr): String =
    gdext.builtin.GString
      .fromPtr(p.asInstanceOf[Ptr[Byte]])
      .toScala // borrowed engine String — do not destroy

  private val canHandleDispatch: GDExtensionClassCallVirtual =
    (instance: GDExtensionClassInstancePtr, args: Ptr[GDExtensionConstTypePtr], ret: GDExtensionTypePtr) => {
      val tok = Tokens.fromPtr(instance)
      val scala = ClassRegistry.instanceFor(tok)
      gdext.Log.trace(s"_can_handle: ENTER token=$tok scala=${if (scala == null) "null" else scala.getClass.getSimpleName}")
      if (scala != null) {
        val objPtr = !args(0).asInstanceOf[Ptr[GDExtensionObjectPtr]]
        val r = scala._can_handle(
          gdext.internal.engine.GodotObject.fromPtr(objPtr)
        )
        gdext.Log.trace(s"_can_handle: EXIT token=$tok result=$r")
        writeBool(ret, r)
      } else { gdext.Log.trace(s"_can_handle: EXIT token=$tok scala=null -> false"); writeBool(ret, false) }
    }

  private val parsePropertyDispatch: GDExtensionClassCallVirtual =
    (instance: GDExtensionClassInstancePtr, args: Ptr[GDExtensionConstTypePtr], ret: GDExtensionTypePtr) => {
      val tok = Tokens.fromPtr(instance)
      val scala = ClassRegistry.instanceFor(tok)
      gdext.Log.trace(s"_parse_property: ENTER token=$tok")
      if (scala != null) {
        val objPtr = !args(0).asInstanceOf[Ptr[GDExtensionObjectPtr]]
        val varType = !args(1).asInstanceOf[Ptr[GDExtensionInt]]
        val name = readString(args(2))
        val hintType = !args(3).asInstanceOf[Ptr[GDExtensionInt]]
        val hintString = readString(args(4))
        val usage = !args(5).asInstanceOf[Ptr[GDExtensionInt]]
        val wide = (!args(6).asInstanceOf[Ptr[GDExtensionBool]]).toInt != 0
        gdext.Log.trace(
          s"_parse_property: name='$name' varType=$varType hint=$hintType hintStr='$hintString' usage=$usage wide=$wide"
        )
        val r = scala._parse_property(
          gdext.internal.engine.GodotObject.fromPtr(objPtr),
          varType,
          name,
          hintType,
          hintString,
          usage,
          wide
        )
        gdext.Log.trace(s"_parse_property: EXIT name='$name' result=$r")
        writeBool(ret, r)
      } else { gdext.Log.trace(s"_parse_property: EXIT token=$tok scala=null -> false"); writeBool(ret, false) }
    }

  // --- validate_property (component-reference ENUM dropdowns) -------------
  // Unlike the editor virtuals above, this is a top-level class callback (not
  // routed through get_virtual). For each property Godot builds, we look up a
  // CompEnumRegistry builder by (className, propName); if one exists we rewrite
  // the PropertyInfo to a PROPERTY_HINT_ENUM whose hint_string is the names
  // enumerated from the comp's current value, and return true (handled).
  private val validateProperty: GDExtensionClassValidateProperty =
    (instance: GDExtensionClassInstancePtr, pi: Ptr[GDExtensionPropertyInfo]) => {
      val scala = ClassRegistry.instanceFor(Tokens.fromPtr(instance))
      if (scala == null) 0.toUByte
      else {
        val className = scala.getClass.getSimpleName
        val propName =
          gdext.builtin.StringName.toScala(!(!pi).at_name)
        CompEnumRegistry.namesFor(className, propName, scala) match {
          case Some(names) =>
            val joined = (if (names.isEmpty) Seq("") else names).mkString(",")
            gdext.Log.trace(
              s"validate_property: $className.$propName -> ENUM '$joined'"
            )
            !(!pi).at_hint = PropertyHint.Enum.toUInt
            !(!pi).at_hint_string = MethodRegistration.heapGString(joined)
            1.toUByte
          case None => 0.toUByte
        }
      }
    }
}
