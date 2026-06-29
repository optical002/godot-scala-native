package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRSpatialEntityExtension`, extends `OpenXRExtensionWrapper`. */
abstract class OpenXRSpatialEntityExtension extends OpenXRExtensionWrapper {
  override def godotClassName: String = "OpenXRSpatialEntityExtension"

  /** OpenXRSpatialEntityExtension.supports_capability */
  final def supportsCapability(capability: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("OpenXRSpatialEntityExtension", "supports_capability", 1940837202L), hostObject.objectPtr, capability)

  /** OpenXRSpatialEntityExtension.supports_component_type */
  final def supportsComponentType(capability: Long, component_type: Long): Boolean =
    Ptrcall.call2[Long, Long, Boolean](MethodBind.get("OpenXRSpatialEntityExtension", "supports_component_type", 26842779L), hostObject.objectPtr, capability, component_type)

}
