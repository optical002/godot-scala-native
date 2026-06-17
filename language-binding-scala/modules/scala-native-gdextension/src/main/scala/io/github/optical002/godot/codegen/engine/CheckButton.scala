package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `CheckButton`, extends `Button`. */
abstract class CheckButton extends Button {

}

object CheckButton {
  /** Class metadata for Gd[CheckButton] lifetime management and casting. */
  given GodotClass[CheckButton] with {
    def className = "CheckButton"
    def isRefCounted = false
    def wrap(o: GodotObject): CheckButton = new CheckButton {}.withHost(o.objectPtr)
    def unwrap(t: CheckButton): GodotObject = t.hostObject
  }
}
