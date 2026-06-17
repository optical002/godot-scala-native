package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `HFlowContainer`, extends `FlowContainer`. */
abstract class HFlowContainer extends FlowContainer {

}

object HFlowContainer {
  /** Class metadata for Gd[HFlowContainer] lifetime management and casting. */
  given GodotClass[HFlowContainer] with {
    def className = "HFlowContainer"
    def isRefCounted = false
    def wrap(o: GodotObject): HFlowContainer = new HFlowContainer {}.withHost(o.objectPtr)
    def unwrap(t: HFlowContainer): GodotObject = t.hostObject
  }
}
