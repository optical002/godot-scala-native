package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `PopupPanel`, extends `Popup`. */
abstract class PopupPanel extends Popup {

}

object PopupPanel {
  /** Class metadata for Gd[PopupPanel] lifetime management and casting. */
  given GodotClass[PopupPanel] with {
    def className = "PopupPanel"
    def isRefCounted = false
    def wrap(o: GodotObject): PopupPanel = new PopupPanel {}.withHost(o.objectPtr)
    def unwrap(t: PopupPanel): GodotObject = t.hostObject
  }
}
