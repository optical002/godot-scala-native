package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `ConfirmationDialog`, extends `AcceptDialog`. */
abstract class ConfirmationDialog extends AcceptDialog {
  override def godotClassName: String = "ConfirmationDialog"

  /** ConfirmationDialog.get_cancel_button */
  final def getCancelButton(): Button = {
    if (gdext.classes.ConfirmationDialog.mb_get_cancel_button == null) gdext.classes.ConfirmationDialog.mb_get_cancel_button = MethodBind.get("ConfirmationDialog", "get_cancel_button", 1856205918L)
    Wrappers.borrowed[Button](Ptrcall.call0[Long](gdext.classes.ConfirmationDialog.mb_get_cancel_button, livePtr))
  }

  /** ConfirmationDialog.set_cancel_button_text */
  final def setCancelButtonText(text: String): Unit = {
    if (gdext.classes.ConfirmationDialog.mb_set_cancel_button_text == null) gdext.classes.ConfirmationDialog.mb_set_cancel_button_text = MethodBind.get("ConfirmationDialog", "set_cancel_button_text", 83702148L)
    Ptrcall.callVoid1(gdext.classes.ConfirmationDialog.mb_set_cancel_button_text, livePtr, text)
  }

  /** ConfirmationDialog.get_cancel_button_text */
  final def getCancelButtonText(): String = {
    if (gdext.classes.ConfirmationDialog.mb_get_cancel_button_text == null) gdext.classes.ConfirmationDialog.mb_get_cancel_button_text = MethodBind.get("ConfirmationDialog", "get_cancel_button_text", 201670096L)
    Ptrcall.call0[String](gdext.classes.ConfirmationDialog.mb_get_cancel_button_text, livePtr)
  }

}

object ConfirmationDialog {
  private[classes] var mb_get_cancel_button: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_cancel_button_text: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_cancel_button_text: GDExtensionMethodBindPtr = null
}
