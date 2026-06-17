package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `CheckBox`, extends `Button`. */
abstract class CheckBox extends Button {

}

object CheckBox {
  /** Class metadata for Gd[CheckBox] lifetime management and casting. */
  given GodotClass[CheckBox] with {
    def className = "CheckBox"
    def isRefCounted = false
    def wrap(o: GodotObject): CheckBox = new CheckBox {}.withHost(o.objectPtr)
    def unwrap(t: CheckBox): GodotObject = t.hostObject
  }
}
