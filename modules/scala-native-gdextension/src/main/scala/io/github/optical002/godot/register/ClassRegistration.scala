package io.github.optical002.godot.register

import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import scala.scalanative.libc.stdlib
import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.StringNames
import io.github.optical002.godot.codegen.gdextensioninterface.types.*

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

  /** Register `desc` so Godot can instantiate and drive instances of it. */
  def register(desc: ClassDescriptor): Unit = {
    // If this class is somehow still registered (a reload where the previous
    // image was not cleanly deinitialized), unregister the stale copy first so
    // the fresh registration below does not hit "already registered". The probe
    // (non-null class tag) means we never call unregister on a class Godot does
    // not have, avoiding "unregister unexisting class" on a clean first load.
    val nameSn = StringNames.cached(desc.className).ptr
    if (Godot.interface.classdb_get_class_tag(nameSn) != null)
      Godot.interface.classdb_unregister_extension_class(Godot.library, nameSn)

    val classToken = ClassRegistry.registerClass(desc)

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
    // its virtuals (_ready/_process) then run only in the running game.
    !(!info).at_is_runtime = 1.toUByte
    !(!info).at_create_instance_func = createInstance
    !(!info).at_free_instance_func = freeInstance
    !(!info).at_recreate_instance_func = recreateInstance
    !(!info).at_get_virtual_func = getVirtual
    !(!info).at_class_userdata = Tokens.toPtr(classToken)

    Godot.interface.classdb_register_extension_class4(
      Godot.library,
      StringNames.cached(desc.className).ptr,
      StringNames.cached(desc.parentClassName).ptr,
      info
    )
  }

  /**
   * Unregister every class we registered with Godot. Called on deinitialize so
   * a hot-reload starts from a clean slate; re-registering then succeeds
   * instead of hitting Godot's "already registered" error.
   */
  def unregisterAll(): Unit = {
    ClassRegistry.registeredClassNames.foreach { name =>
      val sn = StringNames.cached(name).ptr
      if (Godot.interface.classdb_get_class_tag(sn) != null)
        Godot.interface.classdb_unregister_extension_class(Godot.library, sn)
    }
    ClassRegistry.clearClasses()
  }

  // --- static trampolines -------------------------------------------------

  /** Build a Scala instance for `desc` and bind it to the engine `obj`. */
  private def bindInstance(
    desc: ClassDescriptor,
    obj: GDExtensionObjectPtr
  ): GDExtensionClassInstancePtr = {
    val scala = desc.factory()
    scala.setHostObject(obj)
    val instanceToken = ClassRegistry.addInstance(scala)
    val instancePtr =
      Tokens.toPtr(instanceToken).asInstanceOf[GDExtensionClassInstancePtr]
    Godot.interface.object_set_instance(
      obj,
      StringNames.cached(desc.className).ptr,
      instancePtr
    )
    instancePtr
  }

  private val createInstance: GDExtensionClassCreateInstance2 =
    (classUserdata: CVoidPtr, _notifyPostInit: GDExtensionBool) => {
      val desc = ClassRegistry.classFor(Tokens.fromPtr(classUserdata))
      // Construct the underlying engine object of the parent class, then bind.
      val obj = Godot.interface.classdb_construct_object2(
        StringNames.cached(desc.parentClassName).ptr
      )
      bindInstance(desc, obj)
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
      bindInstance(desc, obj)
    }

  private val freeInstance: GDExtensionClassFreeInstance =
    (_classUserdata: CVoidPtr, instance: GDExtensionClassInstancePtr) => {
      ClassRegistry.removeInstance(Tokens.fromPtr(instance))
      ()
    }

  private val getVirtual: GDExtensionClassGetVirtual2 =
    (classUserdata: CVoidPtr, name: GDExtensionConstStringNamePtr, _hash: CUnsignedInt) => {
      val desc = ClassRegistry.classFor(Tokens.fromPtr(classUserdata))
      // Match by the StringName's text. Two StringName *handles* for the same
      // text are not pointer-equal, so we decode and compare the string.
      val vname = io.github.optical002.godot.builtin.StringName.toScala(name)
      val dispatcher =
        if (desc.overriddenVirtuals.contains(vname))
          vname match {
            case "_process"         => processDispatch
            case "_physics_process" => physicsProcessDispatch
            case "_ready"           => readyDispatch
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
      }
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
      val scala = ClassRegistry.instanceFor(Tokens.fromPtr(instance))
      if (scala != null) scala._ready()
    }
}
