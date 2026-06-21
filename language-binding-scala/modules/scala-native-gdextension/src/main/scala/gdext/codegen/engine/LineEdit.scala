package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `LineEdit`, extends `Control`. */
abstract class LineEdit extends Control {

  /** LineEdit.has_ime_text */
  final def hasImeText(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("LineEdit", "has_ime_text", 36873697L), hostObject.objectPtr)

  /** LineEdit.cancel_ime */
  final def cancelIme(): Unit =
    Ptrcall.callVoid0(MethodBind.get("LineEdit", "cancel_ime", 3218959716L), hostObject.objectPtr)

  /** LineEdit.apply_ime */
  final def applyIme(): Unit =
    Ptrcall.callVoid0(MethodBind.get("LineEdit", "apply_ime", 3218959716L), hostObject.objectPtr)

  /** LineEdit.set_horizontal_alignment */
  final def setHorizontalAlignment(alignment: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("LineEdit", "set_horizontal_alignment", 2312603777L), hostObject.objectPtr, alignment)

  /** LineEdit.get_horizontal_alignment */
  final def getHorizontalAlignment(): Long =
    Ptrcall.call0[Long](MethodBind.get("LineEdit", "get_horizontal_alignment", 341400642L), hostObject.objectPtr)

  /** LineEdit.edit */
  final def edit(hide_focus: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("LineEdit", "edit", 107499316L), hostObject.objectPtr, hide_focus)

  /** LineEdit.unedit */
  final def unedit(): Unit =
    Ptrcall.callVoid0(MethodBind.get("LineEdit", "unedit", 3218959716L), hostObject.objectPtr)

  /** LineEdit.is_editing */
  final def isEditing(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("LineEdit", "is_editing", 36873697L), hostObject.objectPtr)

  /** LineEdit.set_keep_editing_on_text_submit */
  final def setKeepEditingOnTextSubmit(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("LineEdit", "set_keep_editing_on_text_submit", 2586408642L), hostObject.objectPtr, enable)

  /** LineEdit.is_editing_kept_on_text_submit */
  final def isEditingKeptOnTextSubmit(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("LineEdit", "is_editing_kept_on_text_submit", 36873697L), hostObject.objectPtr)

  /** LineEdit.clear */
  final def clear(): Unit =
    Ptrcall.callVoid0(MethodBind.get("LineEdit", "clear", 3218959716L), hostObject.objectPtr)

  /** LineEdit.select */
  final def select(from: Long, to: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("LineEdit", "select", 1328111411L), hostObject.objectPtr, from, to)

  /** LineEdit.select_all */
  final def selectAll(): Unit =
    Ptrcall.callVoid0(MethodBind.get("LineEdit", "select_all", 3218959716L), hostObject.objectPtr)

  /** LineEdit.deselect */
  final def deselect(): Unit =
    Ptrcall.callVoid0(MethodBind.get("LineEdit", "deselect", 3218959716L), hostObject.objectPtr)

  /** LineEdit.has_undo */
  final def hasUndo(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("LineEdit", "has_undo", 36873697L), hostObject.objectPtr)

  /** LineEdit.has_redo */
  final def hasRedo(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("LineEdit", "has_redo", 36873697L), hostObject.objectPtr)

  /** LineEdit.has_selection */
  final def hasSelection(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("LineEdit", "has_selection", 36873697L), hostObject.objectPtr)

  /** LineEdit.get_selected_text */
  final def getSelectedText(): String =
    Ptrcall.call0[String](MethodBind.get("LineEdit", "get_selected_text", 2841200299L), hostObject.objectPtr)

  /** LineEdit.get_selection_from_column */
  final def getSelectionFromColumn(): Long =
    Ptrcall.call0[Long](MethodBind.get("LineEdit", "get_selection_from_column", 3905245786L), hostObject.objectPtr)

  /** LineEdit.get_selection_to_column */
  final def getSelectionToColumn(): Long =
    Ptrcall.call0[Long](MethodBind.get("LineEdit", "get_selection_to_column", 3905245786L), hostObject.objectPtr)

  /** LineEdit.set_text */
  final def setText(text: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("LineEdit", "set_text", 83702148L), hostObject.objectPtr, text)

  /** LineEdit.get_text */
  final def getText(): String =
    Ptrcall.call0[String](MethodBind.get("LineEdit", "get_text", 201670096L), hostObject.objectPtr)

  /** LineEdit.get_draw_control_chars */
  final def getDrawControlChars(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("LineEdit", "get_draw_control_chars", 36873697L), hostObject.objectPtr)

  /** LineEdit.set_draw_control_chars */
  final def setDrawControlChars(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("LineEdit", "set_draw_control_chars", 2586408642L), hostObject.objectPtr, enable)

  /** LineEdit.set_text_direction */
  final def setTextDirection(direction: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("LineEdit", "set_text_direction", 119160795L), hostObject.objectPtr, direction)

  /** LineEdit.get_text_direction */
  final def getTextDirection(): Long =
    Ptrcall.call0[Long](MethodBind.get("LineEdit", "get_text_direction", 797257663L), hostObject.objectPtr)

  /** LineEdit.set_language */
  final def setLanguage(language: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("LineEdit", "set_language", 83702148L), hostObject.objectPtr, language)

  /** LineEdit.get_language */
  final def getLanguage(): String =
    Ptrcall.call0[String](MethodBind.get("LineEdit", "get_language", 201670096L), hostObject.objectPtr)

  /** LineEdit.set_structured_text_bidi_override */
  final def setStructuredTextBidiOverride(parser: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("LineEdit", "set_structured_text_bidi_override", 55961453L), hostObject.objectPtr, parser)

  /** LineEdit.get_structured_text_bidi_override */
  final def getStructuredTextBidiOverride(): Long =
    Ptrcall.call0[Long](MethodBind.get("LineEdit", "get_structured_text_bidi_override", 3385126229L), hostObject.objectPtr)

  /** LineEdit.set_placeholder */
  final def setPlaceholder(text: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("LineEdit", "set_placeholder", 83702148L), hostObject.objectPtr, text)

  /** LineEdit.get_placeholder */
  final def getPlaceholder(): String =
    Ptrcall.call0[String](MethodBind.get("LineEdit", "get_placeholder", 201670096L), hostObject.objectPtr)

  /** LineEdit.set_caret_column */
  final def setCaretColumn(position: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("LineEdit", "set_caret_column", 1286410249L), hostObject.objectPtr, position)

  /** LineEdit.get_caret_column */
  final def getCaretColumn(): Long =
    Ptrcall.call0[Long](MethodBind.get("LineEdit", "get_caret_column", 3905245786L), hostObject.objectPtr)

  /** LineEdit.get_next_composite_character_column */
  final def getNextCompositeCharacterColumn(column: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("LineEdit", "get_next_composite_character_column", 923996154L), hostObject.objectPtr, column)

  /** LineEdit.get_previous_composite_character_column */
  final def getPreviousCompositeCharacterColumn(column: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("LineEdit", "get_previous_composite_character_column", 923996154L), hostObject.objectPtr, column)

  /** LineEdit.get_scroll_offset */
  final def getScrollOffset(): Double =
    Ptrcall.call0[Double](MethodBind.get("LineEdit", "get_scroll_offset", 1740695150L), hostObject.objectPtr)

  /** LineEdit.set_expand_to_text_length_enabled */
  final def setExpandToTextLengthEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("LineEdit", "set_expand_to_text_length_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** LineEdit.is_expand_to_text_length_enabled */
  final def isExpandToTextLengthEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("LineEdit", "is_expand_to_text_length_enabled", 36873697L), hostObject.objectPtr)

  /** LineEdit.set_caret_blink_enabled */
  final def setCaretBlinkEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("LineEdit", "set_caret_blink_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** LineEdit.is_caret_blink_enabled */
  final def isCaretBlinkEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("LineEdit", "is_caret_blink_enabled", 36873697L), hostObject.objectPtr)

  /** LineEdit.set_caret_mid_grapheme_enabled */
  final def setCaretMidGraphemeEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("LineEdit", "set_caret_mid_grapheme_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** LineEdit.is_caret_mid_grapheme_enabled */
  final def isCaretMidGraphemeEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("LineEdit", "is_caret_mid_grapheme_enabled", 36873697L), hostObject.objectPtr)

  /** LineEdit.set_caret_force_displayed */
  final def setCaretForceDisplayed(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("LineEdit", "set_caret_force_displayed", 2586408642L), hostObject.objectPtr, enabled)

  /** LineEdit.is_caret_force_displayed */
  final def isCaretForceDisplayed(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("LineEdit", "is_caret_force_displayed", 36873697L), hostObject.objectPtr)

  /** LineEdit.set_caret_blink_interval */
  final def setCaretBlinkInterval(interval: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("LineEdit", "set_caret_blink_interval", 373806689L), hostObject.objectPtr, interval)

  /** LineEdit.get_caret_blink_interval */
  final def getCaretBlinkInterval(): Double =
    Ptrcall.call0[Double](MethodBind.get("LineEdit", "get_caret_blink_interval", 1740695150L), hostObject.objectPtr)

  /** LineEdit.set_max_length */
  final def setMaxLength(chars: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("LineEdit", "set_max_length", 1286410249L), hostObject.objectPtr, chars)

  /** LineEdit.get_max_length */
  final def getMaxLength(): Long =
    Ptrcall.call0[Long](MethodBind.get("LineEdit", "get_max_length", 3905245786L), hostObject.objectPtr)

  /** LineEdit.insert_text_at_caret */
  final def insertTextAtCaret(text: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("LineEdit", "insert_text_at_caret", 83702148L), hostObject.objectPtr, text)

  /** LineEdit.delete_char_at_caret */
  final def deleteCharAtCaret(): Unit =
    Ptrcall.callVoid0(MethodBind.get("LineEdit", "delete_char_at_caret", 3218959716L), hostObject.objectPtr)

  /** LineEdit.delete_text */
  final def deleteText(from_column: Long, to_column: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("LineEdit", "delete_text", 3937882851L), hostObject.objectPtr, from_column, to_column)

  /** LineEdit.set_editable */
  final def setEditable(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("LineEdit", "set_editable", 2586408642L), hostObject.objectPtr, enabled)

  /** LineEdit.is_editable */
  final def isEditable(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("LineEdit", "is_editable", 36873697L), hostObject.objectPtr)

  /** LineEdit.set_secret */
  final def setSecret(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("LineEdit", "set_secret", 2586408642L), hostObject.objectPtr, enabled)

  /** LineEdit.is_secret */
  final def isSecret(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("LineEdit", "is_secret", 36873697L), hostObject.objectPtr)

  /** LineEdit.set_secret_character */
  final def setSecretCharacter(character: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("LineEdit", "set_secret_character", 83702148L), hostObject.objectPtr, character)

  /** LineEdit.get_secret_character */
  final def getSecretCharacter(): String =
    Ptrcall.call0[String](MethodBind.get("LineEdit", "get_secret_character", 201670096L), hostObject.objectPtr)

  /** LineEdit.menu_option */
  final def menuOption(option: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("LineEdit", "menu_option", 1286410249L), hostObject.objectPtr, option)

  /** LineEdit.get_menu */
  final def getMenu(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("LineEdit", "get_menu", 229722558L), hostObject.objectPtr)

  /** LineEdit.is_menu_visible */
  final def isMenuVisible(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("LineEdit", "is_menu_visible", 36873697L), hostObject.objectPtr)

  /** LineEdit.set_context_menu_enabled */
  final def setContextMenuEnabled(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("LineEdit", "set_context_menu_enabled", 2586408642L), hostObject.objectPtr, enable)

  /** LineEdit.is_context_menu_enabled */
  final def isContextMenuEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("LineEdit", "is_context_menu_enabled", 2240911060L), hostObject.objectPtr)

  /** LineEdit.set_emoji_menu_enabled */
  final def setEmojiMenuEnabled(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("LineEdit", "set_emoji_menu_enabled", 2586408642L), hostObject.objectPtr, enable)

  /** LineEdit.is_emoji_menu_enabled */
  final def isEmojiMenuEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("LineEdit", "is_emoji_menu_enabled", 36873697L), hostObject.objectPtr)

  /** LineEdit.set_backspace_deletes_composite_character_enabled */
  final def setBackspaceDeletesCompositeCharacterEnabled(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("LineEdit", "set_backspace_deletes_composite_character_enabled", 2586408642L), hostObject.objectPtr, enable)

  /** LineEdit.is_backspace_deletes_composite_character_enabled */
  final def isBackspaceDeletesCompositeCharacterEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("LineEdit", "is_backspace_deletes_composite_character_enabled", 36873697L), hostObject.objectPtr)

  /** LineEdit.set_virtual_keyboard_enabled */
  final def setVirtualKeyboardEnabled(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("LineEdit", "set_virtual_keyboard_enabled", 2586408642L), hostObject.objectPtr, enable)

  /** LineEdit.is_virtual_keyboard_enabled */
  final def isVirtualKeyboardEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("LineEdit", "is_virtual_keyboard_enabled", 36873697L), hostObject.objectPtr)

  /** LineEdit.set_virtual_keyboard_show_on_focus */
  final def setVirtualKeyboardShowOnFocus(show_on_focus: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("LineEdit", "set_virtual_keyboard_show_on_focus", 2586408642L), hostObject.objectPtr, show_on_focus)

  /** LineEdit.get_virtual_keyboard_show_on_focus */
  final def getVirtualKeyboardShowOnFocus(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("LineEdit", "get_virtual_keyboard_show_on_focus", 36873697L), hostObject.objectPtr)

  /** LineEdit.set_virtual_keyboard_type */
  final def setVirtualKeyboardType(`type`: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("LineEdit", "set_virtual_keyboard_type", 2696893573L), hostObject.objectPtr, `type`)

  /** LineEdit.get_virtual_keyboard_type */
  final def getVirtualKeyboardType(): Long =
    Ptrcall.call0[Long](MethodBind.get("LineEdit", "get_virtual_keyboard_type", 1928699316L), hostObject.objectPtr)

  /** LineEdit.set_clear_button_enabled */
  final def setClearButtonEnabled(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("LineEdit", "set_clear_button_enabled", 2586408642L), hostObject.objectPtr, enable)

  /** LineEdit.is_clear_button_enabled */
  final def isClearButtonEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("LineEdit", "is_clear_button_enabled", 36873697L), hostObject.objectPtr)

  /** LineEdit.set_shortcut_keys_enabled */
  final def setShortcutKeysEnabled(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("LineEdit", "set_shortcut_keys_enabled", 2586408642L), hostObject.objectPtr, enable)

  /** LineEdit.is_shortcut_keys_enabled */
  final def isShortcutKeysEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("LineEdit", "is_shortcut_keys_enabled", 36873697L), hostObject.objectPtr)

  /** LineEdit.set_middle_mouse_paste_enabled */
  final def setMiddleMousePasteEnabled(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("LineEdit", "set_middle_mouse_paste_enabled", 2586408642L), hostObject.objectPtr, enable)

  /** LineEdit.is_middle_mouse_paste_enabled */
  final def isMiddleMousePasteEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("LineEdit", "is_middle_mouse_paste_enabled", 36873697L), hostObject.objectPtr)

  /** LineEdit.set_selecting_enabled */
  final def setSelectingEnabled(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("LineEdit", "set_selecting_enabled", 2586408642L), hostObject.objectPtr, enable)

  /** LineEdit.is_selecting_enabled */
  final def isSelectingEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("LineEdit", "is_selecting_enabled", 36873697L), hostObject.objectPtr)

  /** LineEdit.set_deselect_on_focus_loss_enabled */
  final def setDeselectOnFocusLossEnabled(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("LineEdit", "set_deselect_on_focus_loss_enabled", 2586408642L), hostObject.objectPtr, enable)

  /** LineEdit.is_deselect_on_focus_loss_enabled */
  final def isDeselectOnFocusLossEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("LineEdit", "is_deselect_on_focus_loss_enabled", 36873697L), hostObject.objectPtr)

  /** LineEdit.set_drag_and_drop_selection_enabled */
  final def setDragAndDropSelectionEnabled(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("LineEdit", "set_drag_and_drop_selection_enabled", 2586408642L), hostObject.objectPtr, enable)

  /** LineEdit.is_drag_and_drop_selection_enabled */
  final def isDragAndDropSelectionEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("LineEdit", "is_drag_and_drop_selection_enabled", 36873697L), hostObject.objectPtr)

  /** LineEdit.set_right_icon */
  final def setRightIcon(icon: Texture2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("LineEdit", "set_right_icon", 4051416890L), hostObject.objectPtr, icon.hostObject)

  /** LineEdit.get_right_icon */
  final def getRightIcon(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("LineEdit", "get_right_icon", 255860311L), hostObject.objectPtr)

  /** LineEdit.set_icon_expand_mode */
  final def setIconExpandMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("LineEdit", "set_icon_expand_mode", 3019903192L), hostObject.objectPtr, mode)

  /** LineEdit.get_icon_expand_mode */
  final def getIconExpandMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("LineEdit", "get_icon_expand_mode", 3273584435L), hostObject.objectPtr)

  /** LineEdit.set_right_icon_scale */
  final def setRightIconScale(scale: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("LineEdit", "set_right_icon_scale", 373806689L), hostObject.objectPtr, scale)

  /** LineEdit.get_right_icon_scale */
  final def getRightIconScale(): Double =
    Ptrcall.call0[Double](MethodBind.get("LineEdit", "get_right_icon_scale", 1740695150L), hostObject.objectPtr)

  /** LineEdit.set_flat */
  final def setFlat(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("LineEdit", "set_flat", 2586408642L), hostObject.objectPtr, enabled)

  /** LineEdit.is_flat */
  final def isFlat(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("LineEdit", "is_flat", 36873697L), hostObject.objectPtr)

  /** LineEdit.set_select_all_on_focus */
  final def setSelectAllOnFocus(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("LineEdit", "set_select_all_on_focus", 2586408642L), hostObject.objectPtr, enabled)

  /** LineEdit.is_select_all_on_focus */
  final def isSelectAllOnFocus(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("LineEdit", "is_select_all_on_focus", 36873697L), hostObject.objectPtr)

}

object LineEdit {
  /** Class metadata for Gd[LineEdit] lifetime management and casting. */
  given GodotClass[LineEdit] with {
    def className = "LineEdit"
    def isRefCounted = false
    def wrap(o: GodotObject): LineEdit = new LineEdit {}.withHost(o.objectPtr)
    def unwrap(t: LineEdit): GodotObject = t.hostObject
  }
}
