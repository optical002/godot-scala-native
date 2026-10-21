package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OpenXRFutureExtension`, extends `OpenXRExtensionWrapper`. */
abstract class OpenXRFutureExtension extends OpenXRExtensionWrapper {
  override def godotClassName: String = "OpenXRFutureExtension"

  /** OpenXRFutureExtension.is_active */
  final def isActive(): Boolean = {
    if (gdext.classes.OpenXRFutureExtension.mb_is_active == null) gdext.classes.OpenXRFutureExtension.mb_is_active = MethodBind.get("OpenXRFutureExtension", "is_active", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.OpenXRFutureExtension.mb_is_active, livePtr)
  }

  /** OpenXRFutureExtension.cancel_future */
  final def cancelFuture(future: Long): Unit = {
    if (gdext.classes.OpenXRFutureExtension.mb_cancel_future == null) gdext.classes.OpenXRFutureExtension.mb_cancel_future = MethodBind.get("OpenXRFutureExtension", "cancel_future", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.OpenXRFutureExtension.mb_cancel_future, livePtr, future)
  }

}

object OpenXRFutureExtension {
  private[classes] var mb_is_active: GDExtensionMethodBindPtr = null
  private[classes] var mb_cancel_future: GDExtensionMethodBindPtr = null
}
