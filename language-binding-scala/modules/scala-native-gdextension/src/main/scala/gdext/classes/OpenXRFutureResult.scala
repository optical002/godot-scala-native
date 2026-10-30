package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OpenXRFutureResult`, extends `RefCounted`. */
abstract class OpenXRFutureResult extends RefCounted {
  override def godotClassName: String = "OpenXRFutureResult"

  /** OpenXRFutureResult.get_status */
  final def getStatus(): gdext.classes.OpenXRFutureResult.ResultStatus = {
    if (gdext.classes.OpenXRFutureResult.mb_get_status == null) gdext.classes.OpenXRFutureResult.mb_get_status = MethodBind.get("OpenXRFutureResult", "get_status", 2023607463L)
    gdext.classes.OpenXRFutureResult.ResultStatus(Ptrcall.call0[Long](gdext.classes.OpenXRFutureResult.mb_get_status, livePtr))
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

  /** Godot enum `OpenXRFutureResult.ResultStatus`. */
  opaque type ResultStatus <: Long = Long

  object ResultStatus {
    final val Running: ResultStatus = 0L.asInstanceOf[ResultStatus]
    final val Finished: ResultStatus = 1L.asInstanceOf[ResultStatus]
    final val Cancelled: ResultStatus = 2L.asInstanceOf[ResultStatus]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ResultStatus = value.asInstanceOf[ResultStatus]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ResultStatus] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[ResultStatus]]

    extension (self: ResultStatus)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Running"
        case 1L => "Finished"
        case 2L => "Cancelled"
        case other => other.toString
      }
  }
}
