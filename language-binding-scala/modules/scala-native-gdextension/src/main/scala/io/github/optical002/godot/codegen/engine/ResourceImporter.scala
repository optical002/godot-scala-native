package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `ResourceImporter`, extends `RefCounted`. */
abstract class ResourceImporter extends RefCounted {

}

object ResourceImporter {
  /** Class metadata for Gd[ResourceImporter] lifetime management and casting. */
  given GodotClass[ResourceImporter] with {
    def className = "ResourceImporter"
    def isRefCounted = true
    def wrap(o: GodotObject): ResourceImporter = new ResourceImporter {}.withHost(o.objectPtr)
    def unwrap(t: ResourceImporter): GodotObject = t.hostObject
  }
}
