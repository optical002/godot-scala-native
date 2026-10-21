package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OptionButton`, extends `Button`. */
abstract class OptionButton extends Button {
  override def godotClassName: String = "OptionButton"

  /** OptionButton.add_item */
  final def addItem(label: String, id: Long): Unit = {
    if (gdext.classes.OptionButton.mb_add_item == null) gdext.classes.OptionButton.mb_add_item = MethodBind.get("OptionButton", "add_item", 2697778442L)
    Ptrcall.callVoid2(gdext.classes.OptionButton.mb_add_item, livePtr, label, id)
  }

  /** OptionButton.add_icon_item */
  final def addIconItem(texture: Texture2D, label: String, id: Long): Unit = {
    if (gdext.classes.OptionButton.mb_add_icon_item == null) gdext.classes.OptionButton.mb_add_icon_item = MethodBind.get("OptionButton", "add_icon_item", 3781678508L)
    Ptrcall.callVoid3(gdext.classes.OptionButton.mb_add_icon_item, livePtr, Wrappers.handle(texture), label, id)
  }

  /** OptionButton.set_item_text */
  final def setItemText(idx: Long, text: String): Unit = {
    if (gdext.classes.OptionButton.mb_set_item_text == null) gdext.classes.OptionButton.mb_set_item_text = MethodBind.get("OptionButton", "set_item_text", 501894301L)
    Ptrcall.callVoid2(gdext.classes.OptionButton.mb_set_item_text, livePtr, idx, text)
  }

  /** OptionButton.set_item_icon */
  final def setItemIcon(idx: Long, texture: Texture2D): Unit = {
    if (gdext.classes.OptionButton.mb_set_item_icon == null) gdext.classes.OptionButton.mb_set_item_icon = MethodBind.get("OptionButton", "set_item_icon", 666127730L)
    Ptrcall.callVoid2(gdext.classes.OptionButton.mb_set_item_icon, livePtr, idx, Wrappers.handle(texture))
  }

  /** OptionButton.set_item_disabled */
  final def setItemDisabled(idx: Long, disabled: Boolean): Unit = {
    if (gdext.classes.OptionButton.mb_set_item_disabled == null) gdext.classes.OptionButton.mb_set_item_disabled = MethodBind.get("OptionButton", "set_item_disabled", 300928843L)
    Ptrcall.callVoid2(gdext.classes.OptionButton.mb_set_item_disabled, livePtr, idx, disabled)
  }

  /** OptionButton.set_item_id */
  final def setItemId(idx: Long, id: Long): Unit = {
    if (gdext.classes.OptionButton.mb_set_item_id == null) gdext.classes.OptionButton.mb_set_item_id = MethodBind.get("OptionButton", "set_item_id", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.OptionButton.mb_set_item_id, livePtr, idx, id)
  }

  /** OptionButton.set_item_tooltip */
  final def setItemTooltip(idx: Long, tooltip: String): Unit = {
    if (gdext.classes.OptionButton.mb_set_item_tooltip == null) gdext.classes.OptionButton.mb_set_item_tooltip = MethodBind.get("OptionButton", "set_item_tooltip", 501894301L)
    Ptrcall.callVoid2(gdext.classes.OptionButton.mb_set_item_tooltip, livePtr, idx, tooltip)
  }

  /** OptionButton.set_item_auto_translate_mode */
  final def setItemAutoTranslateMode(idx: Long, mode: Long): Unit = {
    if (gdext.classes.OptionButton.mb_set_item_auto_translate_mode == null) gdext.classes.OptionButton.mb_set_item_auto_translate_mode = MethodBind.get("OptionButton", "set_item_auto_translate_mode", 287402019L)
    Ptrcall.callVoid2(gdext.classes.OptionButton.mb_set_item_auto_translate_mode, livePtr, idx, mode)
  }

  /** OptionButton.get_item_text */
  final def getItemText(idx: Long): String = {
    if (gdext.classes.OptionButton.mb_get_item_text == null) gdext.classes.OptionButton.mb_get_item_text = MethodBind.get("OptionButton", "get_item_text", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.OptionButton.mb_get_item_text, livePtr, idx)
  }

  /** OptionButton.get_item_icon. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getItemIcon(idx: Long): Texture2D = {
    if (gdext.classes.OptionButton.mb_get_item_icon == null) gdext.classes.OptionButton.mb_get_item_icon = MethodBind.get("OptionButton", "get_item_icon", 3536238170L)
    Wrappers.owned[Texture2D](Ptrcall.call1[Long, Long](gdext.classes.OptionButton.mb_get_item_icon, livePtr, idx))
  }

  /** OptionButton.get_item_id */
  final def getItemId(idx: Long): Long = {
    if (gdext.classes.OptionButton.mb_get_item_id == null) gdext.classes.OptionButton.mb_get_item_id = MethodBind.get("OptionButton", "get_item_id", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.OptionButton.mb_get_item_id, livePtr, idx)
  }

  /** OptionButton.get_item_index */
  final def getItemIndex(id: Long): Long = {
    if (gdext.classes.OptionButton.mb_get_item_index == null) gdext.classes.OptionButton.mb_get_item_index = MethodBind.get("OptionButton", "get_item_index", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.OptionButton.mb_get_item_index, livePtr, id)
  }

  /** OptionButton.get_item_tooltip */
  final def getItemTooltip(idx: Long): String = {
    if (gdext.classes.OptionButton.mb_get_item_tooltip == null) gdext.classes.OptionButton.mb_get_item_tooltip = MethodBind.get("OptionButton", "get_item_tooltip", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.OptionButton.mb_get_item_tooltip, livePtr, idx)
  }

  /** OptionButton.get_item_auto_translate_mode */
  final def getItemAutoTranslateMode(idx: Long): Long = {
    if (gdext.classes.OptionButton.mb_get_item_auto_translate_mode == null) gdext.classes.OptionButton.mb_get_item_auto_translate_mode = MethodBind.get("OptionButton", "get_item_auto_translate_mode", 906302372L)
    Ptrcall.call1[Long, Long](gdext.classes.OptionButton.mb_get_item_auto_translate_mode, livePtr, idx)
  }

  /** OptionButton.is_item_disabled */
  final def isItemDisabled(idx: Long): Boolean = {
    if (gdext.classes.OptionButton.mb_is_item_disabled == null) gdext.classes.OptionButton.mb_is_item_disabled = MethodBind.get("OptionButton", "is_item_disabled", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.OptionButton.mb_is_item_disabled, livePtr, idx)
  }

  /** OptionButton.is_item_separator */
  final def isItemSeparator(idx: Long): Boolean = {
    if (gdext.classes.OptionButton.mb_is_item_separator == null) gdext.classes.OptionButton.mb_is_item_separator = MethodBind.get("OptionButton", "is_item_separator", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.OptionButton.mb_is_item_separator, livePtr, idx)
  }

  /** OptionButton.add_separator */
  final def addSeparator(text: String): Unit = {
    if (gdext.classes.OptionButton.mb_add_separator == null) gdext.classes.OptionButton.mb_add_separator = MethodBind.get("OptionButton", "add_separator", 3005725572L)
    Ptrcall.callVoid1(gdext.classes.OptionButton.mb_add_separator, livePtr, text)
  }

  /** OptionButton.clear */
  final def clear(): Unit = {
    if (gdext.classes.OptionButton.mb_clear == null) gdext.classes.OptionButton.mb_clear = MethodBind.get("OptionButton", "clear", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.OptionButton.mb_clear, livePtr)
  }

  /** OptionButton.select */
  final def select(idx: Long): Unit = {
    if (gdext.classes.OptionButton.mb_select == null) gdext.classes.OptionButton.mb_select = MethodBind.get("OptionButton", "select", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.OptionButton.mb_select, livePtr, idx)
  }

  /** OptionButton.get_selected */
  final def getSelected(): Long = {
    if (gdext.classes.OptionButton.mb_get_selected == null) gdext.classes.OptionButton.mb_get_selected = MethodBind.get("OptionButton", "get_selected", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.OptionButton.mb_get_selected, livePtr)
  }

  /** OptionButton.get_selected_id */
  final def getSelectedId(): Long = {
    if (gdext.classes.OptionButton.mb_get_selected_id == null) gdext.classes.OptionButton.mb_get_selected_id = MethodBind.get("OptionButton", "get_selected_id", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.OptionButton.mb_get_selected_id, livePtr)
  }

  /** OptionButton.remove_item */
  final def removeItem(idx: Long): Unit = {
    if (gdext.classes.OptionButton.mb_remove_item == null) gdext.classes.OptionButton.mb_remove_item = MethodBind.get("OptionButton", "remove_item", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.OptionButton.mb_remove_item, livePtr, idx)
  }

  /** OptionButton.get_popup */
  final def getPopup(): PopupMenu = {
    if (gdext.classes.OptionButton.mb_get_popup == null) gdext.classes.OptionButton.mb_get_popup = MethodBind.get("OptionButton", "get_popup", 229722558L)
    Wrappers.borrowed[PopupMenu](Ptrcall.call0[Long](gdext.classes.OptionButton.mb_get_popup, livePtr))
  }

  /** OptionButton.show_popup */
  final def showPopup(): Unit = {
    if (gdext.classes.OptionButton.mb_show_popup == null) gdext.classes.OptionButton.mb_show_popup = MethodBind.get("OptionButton", "show_popup", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.OptionButton.mb_show_popup, livePtr)
  }

  /** OptionButton.set_item_count */
  final def setItemCount(count: Long): Unit = {
    if (gdext.classes.OptionButton.mb_set_item_count == null) gdext.classes.OptionButton.mb_set_item_count = MethodBind.get("OptionButton", "set_item_count", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.OptionButton.mb_set_item_count, livePtr, count)
  }

  /** OptionButton.get_item_count */
  final def getItemCount(): Long = {
    if (gdext.classes.OptionButton.mb_get_item_count == null) gdext.classes.OptionButton.mb_get_item_count = MethodBind.get("OptionButton", "get_item_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.OptionButton.mb_get_item_count, livePtr)
  }

  /** OptionButton.has_selectable_items */
  final def hasSelectableItems(): Boolean = {
    if (gdext.classes.OptionButton.mb_has_selectable_items == null) gdext.classes.OptionButton.mb_has_selectable_items = MethodBind.get("OptionButton", "has_selectable_items", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.OptionButton.mb_has_selectable_items, livePtr)
  }

  /** OptionButton.get_selectable_item */
  final def getSelectableItem(from_last: Boolean): Long = {
    if (gdext.classes.OptionButton.mb_get_selectable_item == null) gdext.classes.OptionButton.mb_get_selectable_item = MethodBind.get("OptionButton", "get_selectable_item", 894402480L)
    Ptrcall.call1[Boolean, Long](gdext.classes.OptionButton.mb_get_selectable_item, livePtr, from_last)
  }

  /** OptionButton.set_fit_to_longest_item */
  final def setFitToLongestItem(fit: Boolean): Unit = {
    if (gdext.classes.OptionButton.mb_set_fit_to_longest_item == null) gdext.classes.OptionButton.mb_set_fit_to_longest_item = MethodBind.get("OptionButton", "set_fit_to_longest_item", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.OptionButton.mb_set_fit_to_longest_item, livePtr, fit)
  }

  /** OptionButton.is_fit_to_longest_item */
  final def isFitToLongestItem(): Boolean = {
    if (gdext.classes.OptionButton.mb_is_fit_to_longest_item == null) gdext.classes.OptionButton.mb_is_fit_to_longest_item = MethodBind.get("OptionButton", "is_fit_to_longest_item", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.OptionButton.mb_is_fit_to_longest_item, livePtr)
  }

  /** OptionButton.set_allow_reselect */
  final def setAllowReselect(allow: Boolean): Unit = {
    if (gdext.classes.OptionButton.mb_set_allow_reselect == null) gdext.classes.OptionButton.mb_set_allow_reselect = MethodBind.get("OptionButton", "set_allow_reselect", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.OptionButton.mb_set_allow_reselect, livePtr, allow)
  }

  /** OptionButton.get_allow_reselect */
  final def getAllowReselect(): Boolean = {
    if (gdext.classes.OptionButton.mb_get_allow_reselect == null) gdext.classes.OptionButton.mb_get_allow_reselect = MethodBind.get("OptionButton", "get_allow_reselect", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.OptionButton.mb_get_allow_reselect, livePtr)
  }

  /** OptionButton.set_disable_shortcuts */
  final def setDisableShortcuts(disabled: Boolean): Unit = {
    if (gdext.classes.OptionButton.mb_set_disable_shortcuts == null) gdext.classes.OptionButton.mb_set_disable_shortcuts = MethodBind.get("OptionButton", "set_disable_shortcuts", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.OptionButton.mb_set_disable_shortcuts, livePtr, disabled)
  }

}

object OptionButton {
  private[classes] var mb_add_item: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_icon_item: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_item_text: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_item_icon: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_item_disabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_item_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_item_tooltip: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_item_auto_translate_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_item_text: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_item_icon: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_item_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_item_index: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_item_tooltip: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_item_auto_translate_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_item_disabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_item_separator: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_separator: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear: GDExtensionMethodBindPtr = null
  private[classes] var mb_select: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_selected: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_selected_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_item: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_popup: GDExtensionMethodBindPtr = null
  private[classes] var mb_show_popup: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_item_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_item_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_selectable_items: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_selectable_item: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_fit_to_longest_item: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_fit_to_longest_item: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_allow_reselect: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_allow_reselect: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_disable_shortcuts: GDExtensionMethodBindPtr = null
}
