package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRRenderModelExtension`, extends `OpenXRExtensionWrapper`. */
abstract class OpenXRRenderModelExtension extends OpenXRExtensionWrapper {
  override def godotClassName: String = "OpenXRRenderModelExtension"

  /** OpenXRRenderModelExtension.is_active */
  final def isActive(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("OpenXRRenderModelExtension", "is_active", 36873697L), hostObject.objectPtr)

}
