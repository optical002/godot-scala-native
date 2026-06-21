package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRSpatialCapabilityConfigurationBaseHeader`, extends `RefCounted`. */
abstract class OpenXRSpatialCapabilityConfigurationBaseHeader extends RefCounted {

  /** OpenXRSpatialCapabilityConfigurationBaseHeader.has_valid_configuration */
  final def hasValidConfiguration(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("OpenXRSpatialCapabilityConfigurationBaseHeader", "has_valid_configuration", 36873697L), hostObject.objectPtr)

}

object OpenXRSpatialCapabilityConfigurationBaseHeader {
  /** Class metadata for Gd[OpenXRSpatialCapabilityConfigurationBaseHeader] lifetime management and casting. */
  given GodotClass[OpenXRSpatialCapabilityConfigurationBaseHeader] with {
    def className = "OpenXRSpatialCapabilityConfigurationBaseHeader"
    def isRefCounted = true
    def wrap(o: GodotObject): OpenXRSpatialCapabilityConfigurationBaseHeader = new OpenXRSpatialCapabilityConfigurationBaseHeader {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRSpatialCapabilityConfigurationBaseHeader): GodotObject = t.hostObject
  }
}
