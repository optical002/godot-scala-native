package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

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
