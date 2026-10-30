package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `MenuButton`, extends `Button`. */
abstract class MenuButton extends Button {
  override def godotClassName: String = "MenuButton"

  /** MenuButton.get_popup */
  final def getPopup(): PopupMenu = {
    if (gdext.classes.MenuButton.mb_get_popup == null) gdext.classes.MenuButton.mb_get_popup = MethodBind.get("MenuButton", "get_popup", 229722558L)
    Wrappers.borrowed[PopupMenu](Ptrcall.call0[Long](gdext.classes.MenuButton.mb_get_popup, livePtr))
  }

  /** MenuButton.show_popup */
  final def showPopup(): Unit = {
    if (gdext.classes.MenuButton.mb_show_popup == null) gdext.classes.MenuButton.mb_show_popup = MethodBind.get("MenuButton", "show_popup", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.MenuButton.mb_show_popup, livePtr)
  }

  /** MenuButton.set_switch_on_hover */
  final def setSwitchOnHover(enable: Boolean): Unit = {
    if (gdext.classes.MenuButton.mb_set_switch_on_hover == null) gdext.classes.MenuButton.mb_set_switch_on_hover = MethodBind.get("MenuButton", "set_switch_on_hover", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.MenuButton.mb_set_switch_on_hover, livePtr, enable)
  }

  /** MenuButton.is_switch_on_hover */
  final def isSwitchOnHover(): Boolean = {
    if (gdext.classes.MenuButton.mb_is_switch_on_hover == null) gdext.classes.MenuButton.mb_is_switch_on_hover = MethodBind.get("MenuButton", "is_switch_on_hover", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.MenuButton.mb_is_switch_on_hover, livePtr)
  }

  /** MenuButton.set_disable_shortcuts */
  final def setDisableShortcuts(disabled: Boolean): Unit = {
    if (gdext.classes.MenuButton.mb_set_disable_shortcuts == null) gdext.classes.MenuButton.mb_set_disable_shortcuts = MethodBind.get("MenuButton", "set_disable_shortcuts", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.MenuButton.mb_set_disable_shortcuts, livePtr, disabled)
  }

  /** MenuButton.set_item_count */
  final def setItemCount(count: Long): Unit = {
    if (gdext.classes.MenuButton.mb_set_item_count == null) gdext.classes.MenuButton.mb_set_item_count = MethodBind.get("MenuButton", "set_item_count", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.MenuButton.mb_set_item_count, livePtr, count)
  }

  /** MenuButton.get_item_count */
  final def getItemCount(): Long = {
    if (gdext.classes.MenuButton.mb_get_item_count == null) gdext.classes.MenuButton.mb_get_item_count = MethodBind.get("MenuButton", "get_item_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.MenuButton.mb_get_item_count, livePtr)
  }

}

object MenuButton {
  private[classes] var mb_get_popup: GDExtensionMethodBindPtr = null
  private[classes] var mb_show_popup: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_switch_on_hover: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_switch_on_hover: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_disable_shortcuts: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_item_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_item_count: GDExtensionMethodBindPtr = null
}
