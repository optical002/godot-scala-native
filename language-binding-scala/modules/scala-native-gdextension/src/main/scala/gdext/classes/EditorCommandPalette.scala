package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorCommandPalette`, extends `ConfirmationDialog`. */
abstract class EditorCommandPalette extends ConfirmationDialog {
  override def godotClassName: String = "EditorCommandPalette"

  /** EditorCommandPalette.remove_command */
  final def removeCommand(key_name: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorCommandPalette", "remove_command", 83702148L), hostObject.objectPtr, key_name)

}
