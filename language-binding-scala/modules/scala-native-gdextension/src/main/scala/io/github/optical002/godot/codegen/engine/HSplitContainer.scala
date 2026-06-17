package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `HSplitContainer`, extends `SplitContainer`. */
abstract class HSplitContainer extends SplitContainer {

}

object HSplitContainer {
  /** Class metadata for Gd[HSplitContainer] lifetime management and casting. */
  given GodotClass[HSplitContainer] with {
    def className = "HSplitContainer"
    def isRefCounted = false
    def wrap(o: GodotObject): HSplitContainer = new HSplitContainer {}.withHost(o.objectPtr)
    def unwrap(t: HSplitContainer): GodotObject = t.hostObject
  }
}
