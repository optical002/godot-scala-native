package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRRenderModelExtension`, extends `OpenXRExtensionWrapper`. */
abstract class OpenXRRenderModelExtension extends OpenXRExtensionWrapper {

  /** OpenXRRenderModelExtension.is_active */
  final def isActive(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("OpenXRRenderModelExtension", "is_active", 36873697L), hostObject.objectPtr)

}

object OpenXRRenderModelExtension {
  /** Class metadata for Gd[OpenXRRenderModelExtension] lifetime management and casting. */
  given GodotClass[OpenXRRenderModelExtension] with {
    def className = "OpenXRRenderModelExtension"
    def isRefCounted = false
    def wrap(o: GodotObject): OpenXRRenderModelExtension = new OpenXRRenderModelExtension {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRRenderModelExtension): GodotObject = t.hostObject
  }
}
