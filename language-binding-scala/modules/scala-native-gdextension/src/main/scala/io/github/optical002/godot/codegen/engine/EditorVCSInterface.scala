package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorVCSInterface`, extends `Object`. */
abstract class EditorVCSInterface extends Object {

  /** EditorVCSInterface.popup_error */
  final def popupError(msg: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorVCSInterface", "popup_error", 83702148L), hostObject.objectPtr, msg)

}

object EditorVCSInterface {
  /** Class metadata for Gd[EditorVCSInterface] lifetime management and casting. */
  given GodotClass[EditorVCSInterface] with {
    def className = "EditorVCSInterface"
    def isRefCounted = false
    def wrap(o: GodotObject): EditorVCSInterface = new EditorVCSInterface {}.withHost(o.objectPtr)
    def unwrap(t: EditorVCSInterface): GodotObject = t.hostObject
  }
}
