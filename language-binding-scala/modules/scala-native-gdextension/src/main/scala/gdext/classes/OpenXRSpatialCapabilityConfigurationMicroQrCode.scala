package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRSpatialCapabilityConfigurationMicroQrCode`, extends `OpenXRSpatialCapabilityConfigurationBaseHeader`. */
abstract class OpenXRSpatialCapabilityConfigurationMicroQrCode extends OpenXRSpatialCapabilityConfigurationBaseHeader {

}

object OpenXRSpatialCapabilityConfigurationMicroQrCode {
  /** Class metadata for Gd[OpenXRSpatialCapabilityConfigurationMicroQrCode] lifetime management and casting. */
  given GodotClass[OpenXRSpatialCapabilityConfigurationMicroQrCode] with {
    def className = "OpenXRSpatialCapabilityConfigurationMicroQrCode"
    def isRefCounted = true
    def wrap(o: GodotObject): OpenXRSpatialCapabilityConfigurationMicroQrCode = new OpenXRSpatialCapabilityConfigurationMicroQrCode {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRSpatialCapabilityConfigurationMicroQrCode): GodotObject = t.hostObject
  }
}
