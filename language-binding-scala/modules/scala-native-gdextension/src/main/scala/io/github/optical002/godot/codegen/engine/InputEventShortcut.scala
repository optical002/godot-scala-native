package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `InputEventShortcut`, extends `InputEvent`. */
abstract class InputEventShortcut extends InputEvent {

  /** InputEventShortcut.set_shortcut */
  final def setShortcut(shortcut: Shortcut): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventShortcut", "set_shortcut", 857163497L), hostObject.objectPtr, shortcut.hostObject)

  /** InputEventShortcut.get_shortcut */
  final def getShortcut(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("InputEventShortcut", "get_shortcut", 3766804753L), hostObject.objectPtr)

}

object InputEventShortcut {
  /** Class metadata for Gd[InputEventShortcut] lifetime management and casting. */
  given GodotClass[InputEventShortcut] with {
    def className = "InputEventShortcut"
    def isRefCounted = true
    def wrap(o: GodotObject): InputEventShortcut = new InputEventShortcut {}.withHost(o.objectPtr)
    def unwrap(t: InputEventShortcut): GodotObject = t.hostObject
  }
}
