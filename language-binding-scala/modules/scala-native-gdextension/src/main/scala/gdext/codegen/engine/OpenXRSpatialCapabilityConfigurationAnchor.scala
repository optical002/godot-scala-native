package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRSpatialCapabilityConfigurationAnchor`, extends `OpenXRSpatialCapabilityConfigurationBaseHeader`. */
abstract class OpenXRSpatialCapabilityConfigurationAnchor extends OpenXRSpatialCapabilityConfigurationBaseHeader {

}

object OpenXRSpatialCapabilityConfigurationAnchor {
  /** Class metadata for Gd[OpenXRSpatialCapabilityConfigurationAnchor] lifetime management and casting. */
  given GodotClass[OpenXRSpatialCapabilityConfigurationAnchor] with {
    def className = "OpenXRSpatialCapabilityConfigurationAnchor"
    def isRefCounted = true
    def wrap(o: GodotObject): OpenXRSpatialCapabilityConfigurationAnchor = new OpenXRSpatialCapabilityConfigurationAnchor {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRSpatialCapabilityConfigurationAnchor): GodotObject = t.hostObject
  }
}
