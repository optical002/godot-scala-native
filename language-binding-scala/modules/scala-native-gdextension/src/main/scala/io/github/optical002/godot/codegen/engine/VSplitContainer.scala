package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `VSplitContainer`, extends `SplitContainer`. */
abstract class VSplitContainer extends SplitContainer {

}

object VSplitContainer {
  /** Class metadata for Gd[VSplitContainer] lifetime management and casting. */
  given GodotClass[VSplitContainer] with {
    def className = "VSplitContainer"
    def isRefCounted = false
    def wrap(o: GodotObject): VSplitContainer = new VSplitContainer {}.withHost(o.objectPtr)
    def unwrap(t: VSplitContainer): GodotObject = t.hostObject
  }
}
