package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRFutureExtension`, extends `OpenXRExtensionWrapper`. */
abstract class OpenXRFutureExtension extends OpenXRExtensionWrapper {

  /** OpenXRFutureExtension.is_active */
  final def isActive(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("OpenXRFutureExtension", "is_active", 36873697L), hostObject.objectPtr)

  /** OpenXRFutureExtension.cancel_future */
  final def cancelFuture(future: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRFutureExtension", "cancel_future", 1286410249L), hostObject.objectPtr, future)

}

object OpenXRFutureExtension {
  /** Class metadata for Gd[OpenXRFutureExtension] lifetime management and casting. */
  given GodotClass[OpenXRFutureExtension] with {
    def className = "OpenXRFutureExtension"
    def isRefCounted = false
    def wrap(o: GodotObject): OpenXRFutureExtension = new OpenXRFutureExtension {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRFutureExtension): GodotObject = t.hostObject
  }
}
