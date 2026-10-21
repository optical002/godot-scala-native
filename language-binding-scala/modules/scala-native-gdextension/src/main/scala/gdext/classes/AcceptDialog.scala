package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AcceptDialog`, extends `Window`. */
abstract class AcceptDialog extends Window {
  override def godotClassName: String = "AcceptDialog"

  /** AcceptDialog.get_ok_button */
  final def getOkButton(): Button = {
    if (gdext.classes.AcceptDialog.mb_get_ok_button == null) gdext.classes.AcceptDialog.mb_get_ok_button = MethodBind.get("AcceptDialog", "get_ok_button", 1856205918L)
    Wrappers.borrowed[Button](Ptrcall.call0[Long](gdext.classes.AcceptDialog.mb_get_ok_button, livePtr))
  }

  /** AcceptDialog.get_label */
  final def getLabel(): Label = {
    if (gdext.classes.AcceptDialog.mb_get_label == null) gdext.classes.AcceptDialog.mb_get_label = MethodBind.get("AcceptDialog", "get_label", 566733104L)
    Wrappers.borrowed[Label](Ptrcall.call0[Long](gdext.classes.AcceptDialog.mb_get_label, livePtr))
  }

  /** AcceptDialog.set_hide_on_ok */
  final def setHideOnOk(enabled: Boolean): Unit = {
    if (gdext.classes.AcceptDialog.mb_set_hide_on_ok == null) gdext.classes.AcceptDialog.mb_set_hide_on_ok = MethodBind.get("AcceptDialog", "set_hide_on_ok", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.AcceptDialog.mb_set_hide_on_ok, livePtr, enabled)
  }

  /** AcceptDialog.get_hide_on_ok */
  final def getHideOnOk(): Boolean = {
    if (gdext.classes.AcceptDialog.mb_get_hide_on_ok == null) gdext.classes.AcceptDialog.mb_get_hide_on_ok = MethodBind.get("AcceptDialog", "get_hide_on_ok", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.AcceptDialog.mb_get_hide_on_ok, livePtr)
  }

  /** AcceptDialog.set_close_on_escape */
  final def setCloseOnEscape(enabled: Boolean): Unit = {
    if (gdext.classes.AcceptDialog.mb_set_close_on_escape == null) gdext.classes.AcceptDialog.mb_set_close_on_escape = MethodBind.get("AcceptDialog", "set_close_on_escape", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.AcceptDialog.mb_set_close_on_escape, livePtr, enabled)
  }

  /** AcceptDialog.get_close_on_escape */
  final def getCloseOnEscape(): Boolean = {
    if (gdext.classes.AcceptDialog.mb_get_close_on_escape == null) gdext.classes.AcceptDialog.mb_get_close_on_escape = MethodBind.get("AcceptDialog", "get_close_on_escape", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.AcceptDialog.mb_get_close_on_escape, livePtr)
  }

  /** AcceptDialog.add_button */
  final def addButton(text: String, right: Boolean, action: String): Button = {
    if (gdext.classes.AcceptDialog.mb_add_button == null) gdext.classes.AcceptDialog.mb_add_button = MethodBind.get("AcceptDialog", "add_button", 3328440682L)
    Wrappers.borrowed[Button](Ptrcall.call3[String, Boolean, String, Long](gdext.classes.AcceptDialog.mb_add_button, livePtr, text, right, action))
  }

  /** AcceptDialog.add_cancel_button */
  final def addCancelButton(name: String): Button = {
    if (gdext.classes.AcceptDialog.mb_add_cancel_button == null) gdext.classes.AcceptDialog.mb_add_cancel_button = MethodBind.get("AcceptDialog", "add_cancel_button", 242045556L)
    Wrappers.borrowed[Button](Ptrcall.call1[String, Long](gdext.classes.AcceptDialog.mb_add_cancel_button, livePtr, name))
  }

  /** AcceptDialog.remove_button */
  final def removeButton(button: Button): Unit = {
    if (gdext.classes.AcceptDialog.mb_remove_button == null) gdext.classes.AcceptDialog.mb_remove_button = MethodBind.get("AcceptDialog", "remove_button", 2068354942L)
    Ptrcall.callVoid1(gdext.classes.AcceptDialog.mb_remove_button, livePtr, Wrappers.handle(button))
  }

  /** AcceptDialog.register_text_enter */
  final def registerTextEnter(line_edit: LineEdit): Unit = {
    if (gdext.classes.AcceptDialog.mb_register_text_enter == null) gdext.classes.AcceptDialog.mb_register_text_enter = MethodBind.get("AcceptDialog", "register_text_enter", 3714008017L)
    Ptrcall.callVoid1(gdext.classes.AcceptDialog.mb_register_text_enter, livePtr, Wrappers.handle(line_edit))
  }

  /** AcceptDialog.set_text */
  final def setText(text: String): Unit = {
    if (gdext.classes.AcceptDialog.mb_set_text == null) gdext.classes.AcceptDialog.mb_set_text = MethodBind.get("AcceptDialog", "set_text", 83702148L)
    Ptrcall.callVoid1(gdext.classes.AcceptDialog.mb_set_text, livePtr, text)
  }

  /** AcceptDialog.get_text */
  final def getText(): String = {
    if (gdext.classes.AcceptDialog.mb_get_text == null) gdext.classes.AcceptDialog.mb_get_text = MethodBind.get("AcceptDialog", "get_text", 201670096L)
    Ptrcall.call0[String](gdext.classes.AcceptDialog.mb_get_text, livePtr)
  }

  /** AcceptDialog.set_autowrap */
  final def setAutowrap(autowrap: Boolean): Unit = {
    if (gdext.classes.AcceptDialog.mb_set_autowrap == null) gdext.classes.AcceptDialog.mb_set_autowrap = MethodBind.get("AcceptDialog", "set_autowrap", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.AcceptDialog.mb_set_autowrap, livePtr, autowrap)
  }

  /** AcceptDialog.has_autowrap */
  final def hasAutowrap(): Boolean = {
    if (gdext.classes.AcceptDialog.mb_has_autowrap == null) gdext.classes.AcceptDialog.mb_has_autowrap = MethodBind.get("AcceptDialog", "has_autowrap", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.AcceptDialog.mb_has_autowrap, livePtr)
  }

  /** AcceptDialog.set_ok_button_text */
  final def setOkButtonText(text: String): Unit = {
    if (gdext.classes.AcceptDialog.mb_set_ok_button_text == null) gdext.classes.AcceptDialog.mb_set_ok_button_text = MethodBind.get("AcceptDialog", "set_ok_button_text", 83702148L)
    Ptrcall.callVoid1(gdext.classes.AcceptDialog.mb_set_ok_button_text, livePtr, text)
  }

  /** AcceptDialog.get_ok_button_text */
  final def getOkButtonText(): String = {
    if (gdext.classes.AcceptDialog.mb_get_ok_button_text == null) gdext.classes.AcceptDialog.mb_get_ok_button_text = MethodBind.get("AcceptDialog", "get_ok_button_text", 201670096L)
    Ptrcall.call0[String](gdext.classes.AcceptDialog.mb_get_ok_button_text, livePtr)
  }

}

object AcceptDialog {
  private[classes] var mb_get_ok_button: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_label: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_hide_on_ok: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_hide_on_ok: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_close_on_escape: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_close_on_escape: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_button: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_cancel_button: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_button: GDExtensionMethodBindPtr = null
  private[classes] var mb_register_text_enter: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_text: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_text: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_autowrap: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_autowrap: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_ok_button_text: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_ok_button_text: GDExtensionMethodBindPtr = null
}
