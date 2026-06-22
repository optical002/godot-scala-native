package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRSpatialEntityExtension`, extends `OpenXRExtensionWrapper`. */
abstract class OpenXRSpatialEntityExtension extends OpenXRExtensionWrapper {

  /** OpenXRSpatialEntityExtension.supports_capability */
  final def supportsCapability(capability: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("OpenXRSpatialEntityExtension", "supports_capability", 1940837202L), hostObject.objectPtr, capability)

  /** OpenXRSpatialEntityExtension.supports_component_type */
  final def supportsComponentType(capability: Long, component_type: Long): Boolean =
    Ptrcall.call2[Long, Long, Boolean](MethodBind.get("OpenXRSpatialEntityExtension", "supports_component_type", 26842779L), hostObject.objectPtr, capability, component_type)

}

object OpenXRSpatialEntityExtension {
  /** Class metadata for Gd[OpenXRSpatialEntityExtension] lifetime management and casting. */
  given GodotClass[OpenXRSpatialEntityExtension] with {
    def className = "OpenXRSpatialEntityExtension"
    def isRefCounted = false
    def wrap(o: GodotObject): OpenXRSpatialEntityExtension = new OpenXRSpatialEntityExtension {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRSpatialEntityExtension): GodotObject = t.hostObject
  }
}
