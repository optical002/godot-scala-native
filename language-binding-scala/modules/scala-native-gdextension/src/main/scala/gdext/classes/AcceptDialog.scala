package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `AcceptDialog`, extends `Window`. */
abstract class AcceptDialog extends Window {
  override def godotClassName: String = "AcceptDialog"

  /** AcceptDialog.get_ok_button */
  final def getOkButton(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("AcceptDialog", "get_ok_button", 1856205918L), hostObject.objectPtr)

  /** AcceptDialog.get_label */
  final def getLabel(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("AcceptDialog", "get_label", 566733104L), hostObject.objectPtr)

  /** AcceptDialog.set_hide_on_ok */
  final def setHideOnOk(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("AcceptDialog", "set_hide_on_ok", 2586408642L), hostObject.objectPtr, enabled)

  /** AcceptDialog.get_hide_on_ok */
  final def getHideOnOk(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AcceptDialog", "get_hide_on_ok", 36873697L), hostObject.objectPtr)

  /** AcceptDialog.set_close_on_escape */
  final def setCloseOnEscape(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("AcceptDialog", "set_close_on_escape", 2586408642L), hostObject.objectPtr, enabled)

  /** AcceptDialog.get_close_on_escape */
  final def getCloseOnEscape(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AcceptDialog", "get_close_on_escape", 36873697L), hostObject.objectPtr)

  /** AcceptDialog.add_button */
  final def addButton(text: String, right: Boolean, action: String): GodotObject =
    Ptrcall.call3[String, Boolean, String, GodotObject](MethodBind.get("AcceptDialog", "add_button", 3328440682L), hostObject.objectPtr, text, right, action)

  /** AcceptDialog.add_cancel_button */
  final def addCancelButton(name: String): GodotObject =
    Ptrcall.call1[String, GodotObject](MethodBind.get("AcceptDialog", "add_cancel_button", 242045556L), hostObject.objectPtr, name)

  /** AcceptDialog.remove_button */
  final def removeButton(button: Button): Unit =
    Ptrcall.callVoid1(MethodBind.get("AcceptDialog", "remove_button", 2068354942L), hostObject.objectPtr, button.hostObject)

  /** AcceptDialog.register_text_enter */
  final def registerTextEnter(line_edit: LineEdit): Unit =
    Ptrcall.callVoid1(MethodBind.get("AcceptDialog", "register_text_enter", 3714008017L), hostObject.objectPtr, line_edit.hostObject)

  /** AcceptDialog.set_text */
  final def setText(text: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("AcceptDialog", "set_text", 83702148L), hostObject.objectPtr, text)

  /** AcceptDialog.get_text */
  final def getText(): String =
    Ptrcall.call0[String](MethodBind.get("AcceptDialog", "get_text", 201670096L), hostObject.objectPtr)

  /** AcceptDialog.set_autowrap */
  final def setAutowrap(autowrap: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("AcceptDialog", "set_autowrap", 2586408642L), hostObject.objectPtr, autowrap)

  /** AcceptDialog.has_autowrap */
  final def hasAutowrap(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AcceptDialog", "has_autowrap", 2240911060L), hostObject.objectPtr)

  /** AcceptDialog.set_ok_button_text */
  final def setOkButtonText(text: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("AcceptDialog", "set_ok_button_text", 83702148L), hostObject.objectPtr, text)

  /** AcceptDialog.get_ok_button_text */
  final def getOkButtonText(): String =
    Ptrcall.call0[String](MethodBind.get("AcceptDialog", "get_ok_button_text", 201670096L), hostObject.objectPtr)

}
