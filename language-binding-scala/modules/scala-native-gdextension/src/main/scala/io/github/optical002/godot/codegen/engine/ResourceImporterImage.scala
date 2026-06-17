package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `ResourceImporterImage`, extends `ResourceImporter`. */
abstract class ResourceImporterImage extends ResourceImporter {

}

object ResourceImporterImage {
  /** Class metadata for Gd[ResourceImporterImage] lifetime management and casting. */
  given GodotClass[ResourceImporterImage] with {
    def className = "ResourceImporterImage"
    def isRefCounted = true
    def wrap(o: GodotObject): ResourceImporterImage = new ResourceImporterImage {}.withHost(o.objectPtr)
    def unwrap(t: ResourceImporterImage): GodotObject = t.hostObject
  }
}
