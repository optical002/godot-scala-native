package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `ResourceFormatSaver`, extends `RefCounted`. */
abstract class ResourceFormatSaver extends RefCounted {

}

object ResourceFormatSaver {
  /** Class metadata for Gd[ResourceFormatSaver] lifetime management and casting. */
  given GodotClass[ResourceFormatSaver] with {
    def className = "ResourceFormatSaver"
    def isRefCounted = true
    def wrap(o: GodotObject): ResourceFormatSaver = new ResourceFormatSaver {}.withHost(o.objectPtr)
    def unwrap(t: ResourceFormatSaver): GodotObject = t.hostObject
  }
}
