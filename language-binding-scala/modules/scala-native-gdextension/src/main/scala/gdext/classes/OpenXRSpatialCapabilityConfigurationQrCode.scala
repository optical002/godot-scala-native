package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRSpatialCapabilityConfigurationQrCode`, extends `OpenXRSpatialCapabilityConfigurationBaseHeader`. */
abstract class OpenXRSpatialCapabilityConfigurationQrCode extends OpenXRSpatialCapabilityConfigurationBaseHeader {

}

object OpenXRSpatialCapabilityConfigurationQrCode {
  /** Class metadata for Gd[OpenXRSpatialCapabilityConfigurationQrCode] lifetime management and casting. */
  given GodotClass[OpenXRSpatialCapabilityConfigurationQrCode] with {
    def className = "OpenXRSpatialCapabilityConfigurationQrCode"
    def isRefCounted = true
    def wrap(o: GodotObject): OpenXRSpatialCapabilityConfigurationQrCode = new OpenXRSpatialCapabilityConfigurationQrCode {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRSpatialCapabilityConfigurationQrCode): GodotObject = t.hostObject
  }
}
