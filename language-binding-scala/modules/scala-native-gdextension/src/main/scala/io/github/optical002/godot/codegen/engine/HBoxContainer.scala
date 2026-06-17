package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `HBoxContainer`, extends `BoxContainer`. */
abstract class HBoxContainer extends BoxContainer {

}

object HBoxContainer {
  /** Class metadata for Gd[HBoxContainer] lifetime management and casting. */
  given GodotClass[HBoxContainer] with {
    def className = "HBoxContainer"
    def isRefCounted = false
    def wrap(o: GodotObject): HBoxContainer = new HBoxContainer {}.withHost(o.objectPtr)
    def unwrap(t: HBoxContainer): GodotObject = t.hostObject
  }
}
