package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

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
