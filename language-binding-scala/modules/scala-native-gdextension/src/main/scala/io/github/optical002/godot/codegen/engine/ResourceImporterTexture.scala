package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `ResourceImporterTexture`, extends `ResourceImporter`. */
abstract class ResourceImporterTexture extends ResourceImporter {

}

object ResourceImporterTexture {
  /** Class metadata for Gd[ResourceImporterTexture] lifetime management and casting. */
  given GodotClass[ResourceImporterTexture] with {
    def className = "ResourceImporterTexture"
    def isRefCounted = true
    def wrap(o: GodotObject): ResourceImporterTexture = new ResourceImporterTexture {}.withHost(o.objectPtr)
    def unwrap(t: ResourceImporterTexture): GodotObject = t.hostObject
  }
}
