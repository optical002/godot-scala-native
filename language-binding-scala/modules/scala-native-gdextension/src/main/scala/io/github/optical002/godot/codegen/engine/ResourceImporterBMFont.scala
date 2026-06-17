package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `ResourceImporterBMFont`, extends `ResourceImporter`. */
abstract class ResourceImporterBMFont extends ResourceImporter {

}

object ResourceImporterBMFont {
  /** Class metadata for Gd[ResourceImporterBMFont] lifetime management and casting. */
  given GodotClass[ResourceImporterBMFont] with {
    def className = "ResourceImporterBMFont"
    def isRefCounted = true
    def wrap(o: GodotObject): ResourceImporterBMFont = new ResourceImporterBMFont {}.withHost(o.objectPtr)
    def unwrap(t: ResourceImporterBMFont): GodotObject = t.hostObject
  }
}
