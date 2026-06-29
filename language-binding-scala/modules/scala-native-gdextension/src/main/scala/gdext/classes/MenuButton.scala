package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `MenuButton`, extends `Button`. */
abstract class MenuButton extends Button {
  override def godotClassName: String = "MenuButton"

  /** MenuButton.get_popup */
  final def getPopup(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("MenuButton", "get_popup", 229722558L), hostObject.objectPtr)

  /** MenuButton.show_popup */
  final def showPopup(): Unit =
    Ptrcall.callVoid0(MethodBind.get("MenuButton", "show_popup", 3218959716L), hostObject.objectPtr)

  /** MenuButton.set_switch_on_hover */
  final def setSwitchOnHover(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("MenuButton", "set_switch_on_hover", 2586408642L), hostObject.objectPtr, enable)

  /** MenuButton.is_switch_on_hover */
  final def isSwitchOnHover(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("MenuButton", "is_switch_on_hover", 2240911060L), hostObject.objectPtr)

  /** MenuButton.set_disable_shortcuts */
  final def setDisableShortcuts(disabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("MenuButton", "set_disable_shortcuts", 2586408642L), hostObject.objectPtr, disabled)

  /** MenuButton.set_item_count */
  final def setItemCount(count: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("MenuButton", "set_item_count", 1286410249L), hostObject.objectPtr, count)

  /** MenuButton.get_item_count */
  final def getItemCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("MenuButton", "get_item_count", 3905245786L), hostObject.objectPtr)

}
