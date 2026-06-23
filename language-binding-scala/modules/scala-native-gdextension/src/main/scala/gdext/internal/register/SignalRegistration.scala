package gdext.internal.register

import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.{GodotObject, MethodBind, Ptrcall}
import gdext.internal.ffi.types.*
import gdext.internal.ffi.types.GDExtensionVariantType.*

/**
 * Registers signals on a registered class and emits them.
 *
 * Registration uses `classdb_register_extension_class_signal`. Emission goes
 * through `Object.emit_signal`, which is a vararg method, so it uses the
 * Variant call path (`object_method_bind_call`) with the signal name as the
 * first Variant argument followed by the signal's payload Variants.
 *
 * This first cut covers the most common case — a **no-argument signal** — which
 * is enough to prove registration + connect + emit end to end. Adding typed
 * payload arguments is a matter of extending the argument-info array and the
 * emit arg list.
 */
object SignalRegistration {

  // Object.emit_signal hash (Godot 4.6.1).
  private final val EmitSignalHash = 4047867050L

  /** Register a no-argument signal `signalName` on `className`. */
  def registerSignal(className: String, signalName: String): Unit = {
    gdext.Log.trace(s"registerSignal: $className.$signalName")
    Godot.interface.classdb_register_extension_class_signal(
      Godot.library,
      StringNames.cached(className).ptr,
      StringNames.cached(signalName).ptr,
      null, // no argument info
      0L
    )
  }

  /** Emit a no-argument signal from `host`. */
  def emit(host: GodotObject, signalName: String): Unit = {
    val bind = MethodBind.get("Object", "emit_signal", EmitSignalHash)
    if (bind == null) return

    // Build a Variant holding the signal name (as a StringName Variant) using
    // the cached from-type constructor.
    val nameVarBuf = stackalloc[Byte](BuiltinSizes.Variant.toCSize)
    val nameVar = Variant.fromPtr(nameVarBuf)
    val fromType =
      VariantConstructors.fromType(GDEXTENSION_VARIANT_TYPE_STRING_NAME)
    fromType(nameVar.ptr, StringNames.cached(signalName).ptr)

    val args = stackalloc[GDExtensionConstVariantPtr](1)
    args(0) = nameVar.ptr

    val retBuf = stackalloc[Byte](BuiltinSizes.Variant.toCSize)
    val err = stackalloc[GDExtensionCallError]()
    Godot.interface.object_method_bind_call(
      bind,
      host.objectPtr,
      args,
      1L,
      retBuf,
      err
    )
    nameVar.destroy()
  }

  // Object.call_deferred(method, ...) hash (Godot 4.6.1).
  private final val CallDeferredHash = 3400424181L

  /**
   * Defer a no-argument call to `methodName` on `host` to the next idle frame
   * (`Object.call_deferred`). Used to delay editor UI construction until a
   * control is fully in-tree and themed — building children during `_ready`
   * accesses theme "too early" and crashes.
   */
  def callDeferred(host: GodotObject, methodName: String): Unit = {
    val bind = MethodBind.get("Object", "call_deferred", CallDeferredHash)
    if (bind == null) return

    val nameVarBuf = stackalloc[Byte](BuiltinSizes.Variant.toCSize)
    val nameVar = Variant.fromPtr(nameVarBuf)
    val fromType =
      VariantConstructors.fromType(GDEXTENSION_VARIANT_TYPE_STRING_NAME)
    fromType(nameVar.ptr, StringNames.cached(methodName).ptr)

    val args = stackalloc[GDExtensionConstVariantPtr](1)
    args(0) = nameVar.ptr

    val retBuf = stackalloc[Byte](BuiltinSizes.Variant.toCSize)
    val err = stackalloc[GDExtensionCallError]()
    Godot.interface.object_method_bind_call(
      bind,
      host.objectPtr,
      args,
      1L,
      retBuf,
      err
    )
    nameVar.destroy()
  }
}
