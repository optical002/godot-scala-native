package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `EditorFileDialog`, extends `FileDialog`. */
abstract class EditorFileDialog extends FileDialog {
  override def godotClassName: String = "EditorFileDialog"

  /** EditorFileDialog.add_side_menu */
  final def addSideMenu(menu: Control, title: String): Unit = {
    if (gdext.classes.EditorFileDialog.mb_add_side_menu == null) gdext.classes.EditorFileDialog.mb_add_side_menu = MethodBind.get("EditorFileDialog", "add_side_menu", 402368861L)
    Ptrcall.callVoid2(gdext.classes.EditorFileDialog.mb_add_side_menu, livePtr, Wrappers.handle(menu), title)
  }

  /** EditorFileDialog.set_disable_overwrite_warning */
  final def setDisableOverwriteWarning(disable: Boolean): Unit = {
    if (gdext.classes.EditorFileDialog.mb_set_disable_overwrite_warning == null) gdext.classes.EditorFileDialog.mb_set_disable_overwrite_warning = MethodBind.get("EditorFileDialog", "set_disable_overwrite_warning", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.EditorFileDialog.mb_set_disable_overwrite_warning, livePtr, disable)
  }

  /** EditorFileDialog.is_overwrite_warning_disabled */
  final def isOverwriteWarningDisabled(): Boolean = {
    if (gdext.classes.EditorFileDialog.mb_is_overwrite_warning_disabled == null) gdext.classes.EditorFileDialog.mb_is_overwrite_warning_disabled = MethodBind.get("EditorFileDialog", "is_overwrite_warning_disabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.EditorFileDialog.mb_is_overwrite_warning_disabled, livePtr)
  }

}

object EditorFileDialog {
  private[classes] var mb_add_side_menu: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_disable_overwrite_warning: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_overwrite_warning_disabled: GDExtensionMethodBindPtr = null
}
