package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `MarginContainer`, extends `Container`. */
abstract class MarginContainer extends Container {

}

object MarginContainer {
  /** Class metadata for Gd[MarginContainer] lifetime management and casting. */
  given GodotClass[MarginContainer] with {
    def className = "MarginContainer"
    def isRefCounted = false
    def wrap(o: GodotObject): MarginContainer = new MarginContainer {}.withHost(o.objectPtr)
    def unwrap(t: MarginContainer): GodotObject = t.hostObject
  }
}
