package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorCommandPalette`, extends `ConfirmationDialog`. */
abstract class EditorCommandPalette extends ConfirmationDialog {

  /** EditorCommandPalette.remove_command */
  final def removeCommand(key_name: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorCommandPalette", "remove_command", 83702148L), hostObject.objectPtr, key_name)

}

object EditorCommandPalette {
  /** Class metadata for Gd[EditorCommandPalette] lifetime management and casting. */
  given GodotClass[EditorCommandPalette] with {
    def className = "EditorCommandPalette"
    def isRefCounted = false
    def wrap(o: GodotObject): EditorCommandPalette = new EditorCommandPalette {}.withHost(o.objectPtr)
    def unwrap(t: EditorCommandPalette): GodotObject = t.hostObject
  }
}
