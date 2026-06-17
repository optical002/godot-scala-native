package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `Lightmapper`, extends `RefCounted`. */
abstract class Lightmapper extends RefCounted {

}

object Lightmapper {
  /** Class metadata for Gd[Lightmapper] lifetime management and casting. */
  given GodotClass[Lightmapper] with {
    def className = "Lightmapper"
    def isRefCounted = true
    def wrap(o: GodotObject): Lightmapper = new Lightmapper {}.withHost(o.objectPtr)
    def unwrap(t: Lightmapper): GodotObject = t.hostObject
  }
}
