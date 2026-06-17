package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `ResourceImporterWAV`, extends `ResourceImporter`. */
abstract class ResourceImporterWAV extends ResourceImporter {

}

object ResourceImporterWAV {
  /** Class metadata for Gd[ResourceImporterWAV] lifetime management and casting. */
  given GodotClass[ResourceImporterWAV] with {
    def className = "ResourceImporterWAV"
    def isRefCounted = true
    def wrap(o: GodotObject): ResourceImporterWAV = new ResourceImporterWAV {}.withHost(o.objectPtr)
    def unwrap(t: ResourceImporterWAV): GodotObject = t.hostObject
  }
}
