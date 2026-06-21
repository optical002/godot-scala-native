package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

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
