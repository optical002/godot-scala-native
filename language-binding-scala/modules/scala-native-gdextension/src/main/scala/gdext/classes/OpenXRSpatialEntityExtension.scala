package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OpenXRSpatialEntityExtension`, extends `OpenXRExtensionWrapper`. */
abstract class OpenXRSpatialEntityExtension extends OpenXRExtensionWrapper {
  override def godotClassName: String = "OpenXRSpatialEntityExtension"

  /** OpenXRSpatialEntityExtension.supports_capability */
  final def supportsCapability(capability: Long): Boolean = {
    if (gdext.classes.OpenXRSpatialEntityExtension.mb_supports_capability == null) gdext.classes.OpenXRSpatialEntityExtension.mb_supports_capability = MethodBind.get("OpenXRSpatialEntityExtension", "supports_capability", 1940837202L)
    Ptrcall.call1[Long, Boolean](gdext.classes.OpenXRSpatialEntityExtension.mb_supports_capability, livePtr, capability)
  }

  /** OpenXRSpatialEntityExtension.supports_component_type */
  final def supportsComponentType(capability: Long, component_type: Long): Boolean = {
    if (gdext.classes.OpenXRSpatialEntityExtension.mb_supports_component_type == null) gdext.classes.OpenXRSpatialEntityExtension.mb_supports_component_type = MethodBind.get("OpenXRSpatialEntityExtension", "supports_component_type", 26842779L)
    Ptrcall.call2[Long, Long, Boolean](gdext.classes.OpenXRSpatialEntityExtension.mb_supports_component_type, livePtr, capability, component_type)
  }

}

object OpenXRSpatialEntityExtension {
  private[classes] var mb_supports_capability: GDExtensionMethodBindPtr = null
  private[classes] var mb_supports_component_type: GDExtensionMethodBindPtr = null
}
