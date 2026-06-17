package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `VBoxContainer`, extends `BoxContainer`. */
abstract class VBoxContainer extends BoxContainer {

}

object VBoxContainer {
  /** Class metadata for Gd[VBoxContainer] lifetime management and casting. */
  given GodotClass[VBoxContainer] with {
    def className = "VBoxContainer"
    def isRefCounted = false
    def wrap(o: GodotObject): VBoxContainer = new VBoxContainer {}.withHost(o.objectPtr)
    def unwrap(t: VBoxContainer): GodotObject = t.hostObject
  }
}
