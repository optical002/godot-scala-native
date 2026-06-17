package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRSpatialContextPersistenceConfig`, extends `OpenXRStructureBase`. */
abstract class OpenXRSpatialContextPersistenceConfig extends OpenXRStructureBase {

}

object OpenXRSpatialContextPersistenceConfig {
  /** Class metadata for Gd[OpenXRSpatialContextPersistenceConfig] lifetime management and casting. */
  given GodotClass[OpenXRSpatialContextPersistenceConfig] with {
    def className = "OpenXRSpatialContextPersistenceConfig"
    def isRefCounted = true
    def wrap(o: GodotObject): OpenXRSpatialContextPersistenceConfig = new OpenXRSpatialContextPersistenceConfig {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRSpatialContextPersistenceConfig): GodotObject = t.hostObject
  }
}
