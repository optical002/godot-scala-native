package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `VScrollBar`, extends `ScrollBar`. */
abstract class VScrollBar extends ScrollBar {

}

object VScrollBar {
  /** Class metadata for Gd[VScrollBar] lifetime management and casting. */
  given GodotClass[VScrollBar] with {
    def className = "VScrollBar"
    def isRefCounted = false
    def wrap(o: GodotObject): VScrollBar = new VScrollBar {}.withHost(o.objectPtr)
    def unwrap(t: VScrollBar): GodotObject = t.hostObject
  }
}
