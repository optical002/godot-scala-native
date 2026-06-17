package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `PanelContainer`, extends `Container`. */
abstract class PanelContainer extends Container {

}

object PanelContainer {
  /** Class metadata for Gd[PanelContainer] lifetime management and casting. */
  given GodotClass[PanelContainer] with {
    def className = "PanelContainer"
    def isRefCounted = false
    def wrap(o: GodotObject): PanelContainer = new PanelContainer {}.withHost(o.objectPtr)
    def unwrap(t: PanelContainer): GodotObject = t.hostObject
  }
}
