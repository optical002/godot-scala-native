package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorFileDialog`, extends `FileDialog`. */
abstract class EditorFileDialog extends FileDialog {
  override def godotClassName: String = "EditorFileDialog"

  /** EditorFileDialog.add_side_menu */
  final def addSideMenu(menu: Control, title: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("EditorFileDialog", "add_side_menu", 402368861L), hostObject.objectPtr, menu.hostObject, title)

  /** EditorFileDialog.set_disable_overwrite_warning */
  final def setDisableOverwriteWarning(disable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorFileDialog", "set_disable_overwrite_warning", 2586408642L), hostObject.objectPtr, disable)

  /** EditorFileDialog.is_overwrite_warning_disabled */
  final def isOverwriteWarningDisabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("EditorFileDialog", "is_overwrite_warning_disabled", 36873697L), hostObject.objectPtr)

}
