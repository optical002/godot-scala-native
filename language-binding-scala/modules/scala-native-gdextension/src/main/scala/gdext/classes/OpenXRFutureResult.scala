package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRFutureResult`, extends `RefCounted`. */
abstract class OpenXRFutureResult extends RefCounted {

  /** OpenXRFutureResult.get_status */
  final def getStatus(): Long =
    Ptrcall.call0[Long](MethodBind.get("OpenXRFutureResult", "get_status", 2023607463L), hostObject.objectPtr)

  /** OpenXRFutureResult.get_future */
  final def getFuture(): Long =
    Ptrcall.call0[Long](MethodBind.get("OpenXRFutureResult", "get_future", 3905245786L), hostObject.objectPtr)

  /** OpenXRFutureResult.cancel_future */
  final def cancelFuture(): Unit =
    Ptrcall.callVoid0(MethodBind.get("OpenXRFutureResult", "cancel_future", 3218959716L), hostObject.objectPtr)

}

object OpenXRFutureResult {
  /** Class metadata for Gd[OpenXRFutureResult] lifetime management and casting. */
  given GodotClass[OpenXRFutureResult] with {
    def className = "OpenXRFutureResult"
    def isRefCounted = true
    def wrap(o: GodotObject): OpenXRFutureResult = new OpenXRFutureResult {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRFutureResult): GodotObject = t.hostObject
  }
}
