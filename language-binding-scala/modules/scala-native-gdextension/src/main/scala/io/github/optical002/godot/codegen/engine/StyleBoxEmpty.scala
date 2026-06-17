package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `StyleBoxEmpty`, extends `StyleBox`. */
abstract class StyleBoxEmpty extends StyleBox {

}

object StyleBoxEmpty {
  /** Class metadata for Gd[StyleBoxEmpty] lifetime management and casting. */
  given GodotClass[StyleBoxEmpty] with {
    def className = "StyleBoxEmpty"
    def isRefCounted = true
    def wrap(o: GodotObject): StyleBoxEmpty = new StyleBoxEmpty {}.withHost(o.objectPtr)
    def unwrap(t: StyleBoxEmpty): GodotObject = t.hostObject
  }
}
