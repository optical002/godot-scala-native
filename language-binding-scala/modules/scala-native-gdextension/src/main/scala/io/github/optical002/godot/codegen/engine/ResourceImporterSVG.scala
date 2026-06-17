package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `ResourceImporterSVG`, extends `ResourceImporter`. */
abstract class ResourceImporterSVG extends ResourceImporter {

}

object ResourceImporterSVG {
  /** Class metadata for Gd[ResourceImporterSVG] lifetime management and casting. */
  given GodotClass[ResourceImporterSVG] with {
    def className = "ResourceImporterSVG"
    def isRefCounted = true
    def wrap(o: GodotObject): ResourceImporterSVG = new ResourceImporterSVG {}.withHost(o.objectPtr)
    def unwrap(t: ResourceImporterSVG): GodotObject = t.hostObject
  }
}
