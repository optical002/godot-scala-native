package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OpenXRFutureResult`, extends `RefCounted`. */
abstract class OpenXRFutureResult extends RefCounted {
  override def godotClassName: String = "OpenXRFutureResult"

  /** OpenXRFutureResult.get_status */
  final def getStatus(): Long = {
    if (gdext.classes.OpenXRFutureResult.mb_get_status == null) gdext.classes.OpenXRFutureResult.mb_get_status = MethodBind.get("OpenXRFutureResult", "get_status", 2023607463L)
    Ptrcall.call0[Long](gdext.classes.OpenXRFutureResult.mb_get_status, livePtr)
  }

  /** OpenXRFutureResult.get_future */
  final def getFuture(): Long = {
    if (gdext.classes.OpenXRFutureResult.mb_get_future == null) gdext.classes.OpenXRFutureResult.mb_get_future = MethodBind.get("OpenXRFutureResult", "get_future", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.OpenXRFutureResult.mb_get_future, livePtr)
  }

  /** OpenXRFutureResult.cancel_future */
  final def cancelFuture(): Unit = {
    if (gdext.classes.OpenXRFutureResult.mb_cancel_future == null) gdext.classes.OpenXRFutureResult.mb_cancel_future = MethodBind.get("OpenXRFutureResult", "cancel_future", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.OpenXRFutureResult.mb_cancel_future, livePtr)
  }

}

object OpenXRFutureResult {
  private[classes] var mb_get_status: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_future: GDExtensionMethodBindPtr = null
  private[classes] var mb_cancel_future: GDExtensionMethodBindPtr = null
}
