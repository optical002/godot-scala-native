package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `HScrollBar`, extends `ScrollBar`. */
abstract class HScrollBar extends ScrollBar {

}

object HScrollBar {
  /** Class metadata for Gd[HScrollBar] lifetime management and casting. */
  given GodotClass[HScrollBar] with {
    def className = "HScrollBar"
    def isRefCounted = false
    def wrap(o: GodotObject): HScrollBar = new HScrollBar {}.withHost(o.objectPtr)
    def unwrap(t: HScrollBar): GodotObject = t.hostObject
  }
}
