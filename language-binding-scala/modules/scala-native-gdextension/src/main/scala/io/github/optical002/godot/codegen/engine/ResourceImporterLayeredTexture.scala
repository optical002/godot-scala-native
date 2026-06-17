package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `ResourceImporterLayeredTexture`, extends `ResourceImporter`. */
abstract class ResourceImporterLayeredTexture extends ResourceImporter {

}

object ResourceImporterLayeredTexture {
  /** Class metadata for Gd[ResourceImporterLayeredTexture] lifetime management and casting. */
  given GodotClass[ResourceImporterLayeredTexture] with {
    def className = "ResourceImporterLayeredTexture"
    def isRefCounted = true
    def wrap(o: GodotObject): ResourceImporterLayeredTexture = new ResourceImporterLayeredTexture {}.withHost(o.objectPtr)
    def unwrap(t: ResourceImporterLayeredTexture): GodotObject = t.hostObject
  }
}
