package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OpenXRRenderModelExtension`, extends `OpenXRExtensionWrapper`. */
abstract class OpenXRRenderModelExtension extends OpenXRExtensionWrapper {
  override def godotClassName: String = "OpenXRRenderModelExtension"

  /** OpenXRRenderModelExtension.is_active */
  final def isActive(): Boolean = {
    if (gdext.classes.OpenXRRenderModelExtension.mb_is_active == null) gdext.classes.OpenXRRenderModelExtension.mb_is_active = MethodBind.get("OpenXRRenderModelExtension", "is_active", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.OpenXRRenderModelExtension.mb_is_active, livePtr)
  }

}

object OpenXRRenderModelExtension {
  private[classes] var mb_is_active: GDExtensionMethodBindPtr = null
}
