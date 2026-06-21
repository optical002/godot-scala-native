package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `OptionButton`, extends `Button`. */
abstract class OptionButton extends Button {

  /** OptionButton.add_item */
  final def addItem(label: String, id: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("OptionButton", "add_item", 2697778442L), hostObject.objectPtr, label, id)

  /** OptionButton.add_icon_item */
  final def addIconItem(texture: Texture2D, label: String, id: Long): Unit =
    Ptrcall.callVoid3(MethodBind.get("OptionButton", "add_icon_item", 3781678508L), hostObject.objectPtr, texture.hostObject, label, id)

  /** OptionButton.set_item_text */
  final def setItemText(idx: Long, text: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("OptionButton", "set_item_text", 501894301L), hostObject.objectPtr, idx, text)

  /** OptionButton.set_item_icon */
  final def setItemIcon(idx: Long, texture: Texture2D): Unit =
    Ptrcall.callVoid2(MethodBind.get("OptionButton", "set_item_icon", 666127730L), hostObject.objectPtr, idx, texture.hostObject)

  /** OptionButton.set_item_disabled */
  final def setItemDisabled(idx: Long, disabled: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("OptionButton", "set_item_disabled", 300928843L), hostObject.objectPtr, idx, disabled)

  /** OptionButton.set_item_id */
  final def setItemId(idx: Long, id: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("OptionButton", "set_item_id", 3937882851L), hostObject.objectPtr, idx, id)

  /** OptionButton.set_item_tooltip */
  final def setItemTooltip(idx: Long, tooltip: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("OptionButton", "set_item_tooltip", 501894301L), hostObject.objectPtr, idx, tooltip)

  /** OptionButton.set_item_auto_translate_mode */
  final def setItemAutoTranslateMode(idx: Long, mode: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("OptionButton", "set_item_auto_translate_mode", 287402019L), hostObject.objectPtr, idx, mode)

  /** OptionButton.get_item_text */
  final def getItemText(idx: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("OptionButton", "get_item_text", 844755477L), hostObject.objectPtr, idx)

  /** OptionButton.get_item_icon */
  final def getItemIcon(idx: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("OptionButton", "get_item_icon", 3536238170L), hostObject.objectPtr, idx)

  /** OptionButton.get_item_id */
  final def getItemId(idx: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("OptionButton", "get_item_id", 923996154L), hostObject.objectPtr, idx)

  /** OptionButton.get_item_index */
  final def getItemIndex(id: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("OptionButton", "get_item_index", 923996154L), hostObject.objectPtr, id)

  /** OptionButton.get_item_tooltip */
  final def getItemTooltip(idx: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("OptionButton", "get_item_tooltip", 844755477L), hostObject.objectPtr, idx)

  /** OptionButton.get_item_auto_translate_mode */
  final def getItemAutoTranslateMode(idx: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("OptionButton", "get_item_auto_translate_mode", 906302372L), hostObject.objectPtr, idx)

  /** OptionButton.is_item_disabled */
  final def isItemDisabled(idx: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("OptionButton", "is_item_disabled", 1116898809L), hostObject.objectPtr, idx)

  /** OptionButton.is_item_separator */
  final def isItemSeparator(idx: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("OptionButton", "is_item_separator", 1116898809L), hostObject.objectPtr, idx)

  /** OptionButton.add_separator */
  final def addSeparator(text: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("OptionButton", "add_separator", 3005725572L), hostObject.objectPtr, text)

  /** OptionButton.clear */
  final def clear(): Unit =
    Ptrcall.callVoid0(MethodBind.get("OptionButton", "clear", 3218959716L), hostObject.objectPtr)

  /** OptionButton.select */
  final def select(idx: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("OptionButton", "select", 1286410249L), hostObject.objectPtr, idx)

  /** OptionButton.get_selected */
  final def getSelected(): Long =
    Ptrcall.call0[Long](MethodBind.get("OptionButton", "get_selected", 3905245786L), hostObject.objectPtr)

  /** OptionButton.get_selected_id */
  final def getSelectedId(): Long =
    Ptrcall.call0[Long](MethodBind.get("OptionButton", "get_selected_id", 3905245786L), hostObject.objectPtr)

  /** OptionButton.remove_item */
  final def removeItem(idx: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("OptionButton", "remove_item", 1286410249L), hostObject.objectPtr, idx)

  /** OptionButton.get_popup */
  final def getPopup(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("OptionButton", "get_popup", 229722558L), hostObject.objectPtr)

  /** OptionButton.show_popup */
  final def showPopup(): Unit =
    Ptrcall.callVoid0(MethodBind.get("OptionButton", "show_popup", 3218959716L), hostObject.objectPtr)

  /** OptionButton.set_item_count */
  final def setItemCount(count: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("OptionButton", "set_item_count", 1286410249L), hostObject.objectPtr, count)

  /** OptionButton.get_item_count */
  final def getItemCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("OptionButton", "get_item_count", 3905245786L), hostObject.objectPtr)

  /** OptionButton.has_selectable_items */
  final def hasSelectableItems(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("OptionButton", "has_selectable_items", 36873697L), hostObject.objectPtr)

  /** OptionButton.get_selectable_item */
  final def getSelectableItem(from_last: Boolean): Long =
    Ptrcall.call1[Boolean, Long](MethodBind.get("OptionButton", "get_selectable_item", 894402480L), hostObject.objectPtr, from_last)

  /** OptionButton.set_fit_to_longest_item */
  final def setFitToLongestItem(fit: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("OptionButton", "set_fit_to_longest_item", 2586408642L), hostObject.objectPtr, fit)

  /** OptionButton.is_fit_to_longest_item */
  final def isFitToLongestItem(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("OptionButton", "is_fit_to_longest_item", 36873697L), hostObject.objectPtr)

  /** OptionButton.set_allow_reselect */
  final def setAllowReselect(allow: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("OptionButton", "set_allow_reselect", 2586408642L), hostObject.objectPtr, allow)

  /** OptionButton.get_allow_reselect */
  final def getAllowReselect(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("OptionButton", "get_allow_reselect", 36873697L), hostObject.objectPtr)

  /** OptionButton.set_disable_shortcuts */
  final def setDisableShortcuts(disabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("OptionButton", "set_disable_shortcuts", 2586408642L), hostObject.objectPtr, disabled)

}

object OptionButton {
  /** Class metadata for Gd[OptionButton] lifetime management and casting. */
  given GodotClass[OptionButton] with {
    def className = "OptionButton"
    def isRefCounted = false
    def wrap(o: GodotObject): OptionButton = new OptionButton {}.withHost(o.objectPtr)
    def unwrap(t: OptionButton): GodotObject = t.hostObject
  }
}
