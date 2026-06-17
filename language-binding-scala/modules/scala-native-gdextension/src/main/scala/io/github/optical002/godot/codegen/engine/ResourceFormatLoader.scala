package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `ResourceFormatLoader`, extends `RefCounted`. */
abstract class ResourceFormatLoader extends RefCounted {

}

object ResourceFormatLoader {
  /** Class metadata for Gd[ResourceFormatLoader] lifetime management and casting. */
  given GodotClass[ResourceFormatLoader] with {
    def className = "ResourceFormatLoader"
    def isRefCounted = true
    def wrap(o: GodotObject): ResourceFormatLoader = new ResourceFormatLoader {}.withHost(o.objectPtr)
    def unwrap(t: ResourceFormatLoader): GodotObject = t.hostObject
  }
}
