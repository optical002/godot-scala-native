package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `EditorCommandPalette`, extends `ConfirmationDialog`. */
abstract class EditorCommandPalette extends ConfirmationDialog {
  override def godotClassName: String = "EditorCommandPalette"

  /** EditorCommandPalette.remove_command */
  final def removeCommand(key_name: String): Unit = {
    if (gdext.classes.EditorCommandPalette.mb_remove_command == null) gdext.classes.EditorCommandPalette.mb_remove_command = MethodBind.get("EditorCommandPalette", "remove_command", 83702148L)
    Ptrcall.callVoid1(gdext.classes.EditorCommandPalette.mb_remove_command, livePtr, key_name)
  }

}

object EditorCommandPalette {
  private[classes] var mb_remove_command: GDExtensionMethodBindPtr = null
}
