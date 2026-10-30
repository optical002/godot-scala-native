package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `TextEdit`, extends `Control`. */
abstract class TextEdit extends Control {
  override def godotClassName: String = "TextEdit"

  /** TextEdit.has_ime_text */
  final def hasImeText(): Boolean = {
    if (gdext.classes.TextEdit.mb_has_ime_text == null) gdext.classes.TextEdit.mb_has_ime_text = MethodBind.get("TextEdit", "has_ime_text", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TextEdit.mb_has_ime_text, livePtr)
  }

  /** TextEdit.cancel_ime */
  final def cancelIme(): Unit = {
    if (gdext.classes.TextEdit.mb_cancel_ime == null) gdext.classes.TextEdit.mb_cancel_ime = MethodBind.get("TextEdit", "cancel_ime", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.TextEdit.mb_cancel_ime, livePtr)
  }

  /** TextEdit.apply_ime */
  final def applyIme(): Unit = {
    if (gdext.classes.TextEdit.mb_apply_ime == null) gdext.classes.TextEdit.mb_apply_ime = MethodBind.get("TextEdit", "apply_ime", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.TextEdit.mb_apply_ime, livePtr)
  }

  /** TextEdit.set_editable */
  final def setEditable(enabled: Boolean): Unit = {
    if (gdext.classes.TextEdit.mb_set_editable == null) gdext.classes.TextEdit.mb_set_editable = MethodBind.get("TextEdit", "set_editable", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TextEdit.mb_set_editable, livePtr, enabled)
  }

  /** TextEdit.is_editable */
  final def isEditable(): Boolean = {
    if (gdext.classes.TextEdit.mb_is_editable == null) gdext.classes.TextEdit.mb_is_editable = MethodBind.get("TextEdit", "is_editable", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TextEdit.mb_is_editable, livePtr)
  }

  /** TextEdit.set_text_direction */
  final def setTextDirection(direction: gdext.classes.Control.TextDirection): Unit = {
    if (gdext.classes.TextEdit.mb_set_text_direction == null) gdext.classes.TextEdit.mb_set_text_direction = MethodBind.get("TextEdit", "set_text_direction", 119160795L)
    Ptrcall.callVoid1(gdext.classes.TextEdit.mb_set_text_direction, livePtr, direction)
  }

  /** TextEdit.get_text_direction */
  final def getTextDirection(): gdext.classes.Control.TextDirection = {
    if (gdext.classes.TextEdit.mb_get_text_direction == null) gdext.classes.TextEdit.mb_get_text_direction = MethodBind.get("TextEdit", "get_text_direction", 797257663L)
    gdext.classes.Control.TextDirection(Ptrcall.call0[Long](gdext.classes.TextEdit.mb_get_text_direction, livePtr))
  }

  /** TextEdit.set_language */
  final def setLanguage(language: String): Unit = {
    if (gdext.classes.TextEdit.mb_set_language == null) gdext.classes.TextEdit.mb_set_language = MethodBind.get("TextEdit", "set_language", 83702148L)
    Ptrcall.callVoid1(gdext.classes.TextEdit.mb_set_language, livePtr, language)
  }

  /** TextEdit.get_language */
  final def getLanguage(): String = {
    if (gdext.classes.TextEdit.mb_get_language == null) gdext.classes.TextEdit.mb_get_language = MethodBind.get("TextEdit", "get_language", 201670096L)
    Ptrcall.call0[String](gdext.classes.TextEdit.mb_get_language, livePtr)
  }

  /** TextEdit.set_structured_text_bidi_override */
  final def setStructuredTextBidiOverride(parser: gdext.classes.TextServer.StructuredTextParser): Unit = {
    if (gdext.classes.TextEdit.mb_set_structured_text_bidi_override == null) gdext.classes.TextEdit.mb_set_structured_text_bidi_override = MethodBind.get("TextEdit", "set_structured_text_bidi_override", 55961453L)
    Ptrcall.callVoid1(gdext.classes.TextEdit.mb_set_structured_text_bidi_override, livePtr, parser)
  }

  /** TextEdit.get_structured_text_bidi_override */
  final def getStructuredTextBidiOverride(): gdext.classes.TextServer.StructuredTextParser = {
    if (gdext.classes.TextEdit.mb_get_structured_text_bidi_override == null) gdext.classes.TextEdit.mb_get_structured_text_bidi_override = MethodBind.get("TextEdit", "get_structured_text_bidi_override", 3385126229L)
    gdext.classes.TextServer.StructuredTextParser(Ptrcall.call0[Long](gdext.classes.TextEdit.mb_get_structured_text_bidi_override, livePtr))
  }

  /** TextEdit.set_tab_size */
  final def setTabSize(size: Long): Unit = {
    if (gdext.classes.TextEdit.mb_set_tab_size == null) gdext.classes.TextEdit.mb_set_tab_size = MethodBind.get("TextEdit", "set_tab_size", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.TextEdit.mb_set_tab_size, livePtr, size)
  }

  /** TextEdit.get_tab_size */
  final def getTabSize(): Long = {
    if (gdext.classes.TextEdit.mb_get_tab_size == null) gdext.classes.TextEdit.mb_get_tab_size = MethodBind.get("TextEdit", "get_tab_size", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.TextEdit.mb_get_tab_size, livePtr)
  }

  /** TextEdit.set_indent_wrapped_lines */
  final def setIndentWrappedLines(enabled: Boolean): Unit = {
    if (gdext.classes.TextEdit.mb_set_indent_wrapped_lines == null) gdext.classes.TextEdit.mb_set_indent_wrapped_lines = MethodBind.get("TextEdit", "set_indent_wrapped_lines", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TextEdit.mb_set_indent_wrapped_lines, livePtr, enabled)
  }

  /** TextEdit.is_indent_wrapped_lines */
  final def isIndentWrappedLines(): Boolean = {
    if (gdext.classes.TextEdit.mb_is_indent_wrapped_lines == null) gdext.classes.TextEdit.mb_is_indent_wrapped_lines = MethodBind.get("TextEdit", "is_indent_wrapped_lines", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TextEdit.mb_is_indent_wrapped_lines, livePtr)
  }

  /** TextEdit.set_tab_input_mode */
  final def setTabInputMode(enabled: Boolean): Unit = {
    if (gdext.classes.TextEdit.mb_set_tab_input_mode == null) gdext.classes.TextEdit.mb_set_tab_input_mode = MethodBind.get("TextEdit", "set_tab_input_mode", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TextEdit.mb_set_tab_input_mode, livePtr, enabled)
  }

  /** TextEdit.get_tab_input_mode */
  final def getTabInputMode(): Boolean = {
    if (gdext.classes.TextEdit.mb_get_tab_input_mode == null) gdext.classes.TextEdit.mb_get_tab_input_mode = MethodBind.get("TextEdit", "get_tab_input_mode", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TextEdit.mb_get_tab_input_mode, livePtr)
  }

  /** TextEdit.set_overtype_mode_enabled */
  final def setOvertypeModeEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.TextEdit.mb_set_overtype_mode_enabled == null) gdext.classes.TextEdit.mb_set_overtype_mode_enabled = MethodBind.get("TextEdit", "set_overtype_mode_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TextEdit.mb_set_overtype_mode_enabled, livePtr, enabled)
  }

  /** TextEdit.is_overtype_mode_enabled */
  final def isOvertypeModeEnabled(): Boolean = {
    if (gdext.classes.TextEdit.mb_is_overtype_mode_enabled == null) gdext.classes.TextEdit.mb_is_overtype_mode_enabled = MethodBind.get("TextEdit", "is_overtype_mode_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TextEdit.mb_is_overtype_mode_enabled, livePtr)
  }

  /** TextEdit.set_context_menu_enabled */
  final def setContextMenuEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.TextEdit.mb_set_context_menu_enabled == null) gdext.classes.TextEdit.mb_set_context_menu_enabled = MethodBind.get("TextEdit", "set_context_menu_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TextEdit.mb_set_context_menu_enabled, livePtr, enabled)
  }

  /** TextEdit.is_context_menu_enabled */
  final def isContextMenuEnabled(): Boolean = {
    if (gdext.classes.TextEdit.mb_is_context_menu_enabled == null) gdext.classes.TextEdit.mb_is_context_menu_enabled = MethodBind.get("TextEdit", "is_context_menu_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TextEdit.mb_is_context_menu_enabled, livePtr)
  }

  /** TextEdit.set_emoji_menu_enabled */
  final def setEmojiMenuEnabled(enable: Boolean): Unit = {
    if (gdext.classes.TextEdit.mb_set_emoji_menu_enabled == null) gdext.classes.TextEdit.mb_set_emoji_menu_enabled = MethodBind.get("TextEdit", "set_emoji_menu_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TextEdit.mb_set_emoji_menu_enabled, livePtr, enable)
  }

  /** TextEdit.is_emoji_menu_enabled */
  final def isEmojiMenuEnabled(): Boolean = {
    if (gdext.classes.TextEdit.mb_is_emoji_menu_enabled == null) gdext.classes.TextEdit.mb_is_emoji_menu_enabled = MethodBind.get("TextEdit", "is_emoji_menu_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TextEdit.mb_is_emoji_menu_enabled, livePtr)
  }

  /** TextEdit.set_backspace_deletes_composite_character_enabled */
  final def setBackspaceDeletesCompositeCharacterEnabled(enable: Boolean): Unit = {
    if (gdext.classes.TextEdit.mb_set_backspace_deletes_composite_character_enabled == null) gdext.classes.TextEdit.mb_set_backspace_deletes_composite_character_enabled = MethodBind.get("TextEdit", "set_backspace_deletes_composite_character_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TextEdit.mb_set_backspace_deletes_composite_character_enabled, livePtr, enable)
  }

  /** TextEdit.is_backspace_deletes_composite_character_enabled */
  final def isBackspaceDeletesCompositeCharacterEnabled(): Boolean = {
    if (gdext.classes.TextEdit.mb_is_backspace_deletes_composite_character_enabled == null) gdext.classes.TextEdit.mb_is_backspace_deletes_composite_character_enabled = MethodBind.get("TextEdit", "is_backspace_deletes_composite_character_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TextEdit.mb_is_backspace_deletes_composite_character_enabled, livePtr)
  }

  /** TextEdit.set_shortcut_keys_enabled */
  final def setShortcutKeysEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.TextEdit.mb_set_shortcut_keys_enabled == null) gdext.classes.TextEdit.mb_set_shortcut_keys_enabled = MethodBind.get("TextEdit", "set_shortcut_keys_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TextEdit.mb_set_shortcut_keys_enabled, livePtr, enabled)
  }

  /** TextEdit.is_shortcut_keys_enabled */
  final def isShortcutKeysEnabled(): Boolean = {
    if (gdext.classes.TextEdit.mb_is_shortcut_keys_enabled == null) gdext.classes.TextEdit.mb_is_shortcut_keys_enabled = MethodBind.get("TextEdit", "is_shortcut_keys_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TextEdit.mb_is_shortcut_keys_enabled, livePtr)
  }

  /** TextEdit.set_virtual_keyboard_enabled */
  final def setVirtualKeyboardEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.TextEdit.mb_set_virtual_keyboard_enabled == null) gdext.classes.TextEdit.mb_set_virtual_keyboard_enabled = MethodBind.get("TextEdit", "set_virtual_keyboard_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TextEdit.mb_set_virtual_keyboard_enabled, livePtr, enabled)
  }

  /** TextEdit.is_virtual_keyboard_enabled */
  final def isVirtualKeyboardEnabled(): Boolean = {
    if (gdext.classes.TextEdit.mb_is_virtual_keyboard_enabled == null) gdext.classes.TextEdit.mb_is_virtual_keyboard_enabled = MethodBind.get("TextEdit", "is_virtual_keyboard_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TextEdit.mb_is_virtual_keyboard_enabled, livePtr)
  }

  /** TextEdit.set_virtual_keyboard_show_on_focus */
  final def setVirtualKeyboardShowOnFocus(showOnFocus: Boolean): Unit = {
    if (gdext.classes.TextEdit.mb_set_virtual_keyboard_show_on_focus == null) gdext.classes.TextEdit.mb_set_virtual_keyboard_show_on_focus = MethodBind.get("TextEdit", "set_virtual_keyboard_show_on_focus", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TextEdit.mb_set_virtual_keyboard_show_on_focus, livePtr, showOnFocus)
  }

  /** TextEdit.get_virtual_keyboard_show_on_focus */
  final def getVirtualKeyboardShowOnFocus(): Boolean = {
    if (gdext.classes.TextEdit.mb_get_virtual_keyboard_show_on_focus == null) gdext.classes.TextEdit.mb_get_virtual_keyboard_show_on_focus = MethodBind.get("TextEdit", "get_virtual_keyboard_show_on_focus", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TextEdit.mb_get_virtual_keyboard_show_on_focus, livePtr)
  }

  /** TextEdit.set_middle_mouse_paste_enabled */
  final def setMiddleMousePasteEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.TextEdit.mb_set_middle_mouse_paste_enabled == null) gdext.classes.TextEdit.mb_set_middle_mouse_paste_enabled = MethodBind.get("TextEdit", "set_middle_mouse_paste_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TextEdit.mb_set_middle_mouse_paste_enabled, livePtr, enabled)
  }

  /** TextEdit.is_middle_mouse_paste_enabled */
  final def isMiddleMousePasteEnabled(): Boolean = {
    if (gdext.classes.TextEdit.mb_is_middle_mouse_paste_enabled == null) gdext.classes.TextEdit.mb_is_middle_mouse_paste_enabled = MethodBind.get("TextEdit", "is_middle_mouse_paste_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TextEdit.mb_is_middle_mouse_paste_enabled, livePtr)
  }

  /** TextEdit.set_empty_selection_clipboard_enabled */
  final def setEmptySelectionClipboardEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.TextEdit.mb_set_empty_selection_clipboard_enabled == null) gdext.classes.TextEdit.mb_set_empty_selection_clipboard_enabled = MethodBind.get("TextEdit", "set_empty_selection_clipboard_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TextEdit.mb_set_empty_selection_clipboard_enabled, livePtr, enabled)
  }

  /** TextEdit.is_empty_selection_clipboard_enabled */
  final def isEmptySelectionClipboardEnabled(): Boolean = {
    if (gdext.classes.TextEdit.mb_is_empty_selection_clipboard_enabled == null) gdext.classes.TextEdit.mb_is_empty_selection_clipboard_enabled = MethodBind.get("TextEdit", "is_empty_selection_clipboard_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TextEdit.mb_is_empty_selection_clipboard_enabled, livePtr)
  }

  /** TextEdit.clear */
  final def clear(): Unit = {
    if (gdext.classes.TextEdit.mb_clear == null) gdext.classes.TextEdit.mb_clear = MethodBind.get("TextEdit", "clear", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.TextEdit.mb_clear, livePtr)
  }

  /** TextEdit.set_text */
  final def setText(text: String): Unit = {
    if (gdext.classes.TextEdit.mb_set_text == null) gdext.classes.TextEdit.mb_set_text = MethodBind.get("TextEdit", "set_text", 83702148L)
    Ptrcall.callVoid1(gdext.classes.TextEdit.mb_set_text, livePtr, text)
  }

  /** TextEdit.get_text */
  final def getText(): String = {
    if (gdext.classes.TextEdit.mb_get_text == null) gdext.classes.TextEdit.mb_get_text = MethodBind.get("TextEdit", "get_text", 201670096L)
    Ptrcall.call0[String](gdext.classes.TextEdit.mb_get_text, livePtr)
  }

  /** TextEdit.get_line_count */
  final def getLineCount(): Long = {
    if (gdext.classes.TextEdit.mb_get_line_count == null) gdext.classes.TextEdit.mb_get_line_count = MethodBind.get("TextEdit", "get_line_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.TextEdit.mb_get_line_count, livePtr)
  }

  /** TextEdit.set_placeholder */
  final def setPlaceholder(text: String): Unit = {
    if (gdext.classes.TextEdit.mb_set_placeholder == null) gdext.classes.TextEdit.mb_set_placeholder = MethodBind.get("TextEdit", "set_placeholder", 83702148L)
    Ptrcall.callVoid1(gdext.classes.TextEdit.mb_set_placeholder, livePtr, text)
  }

  /** TextEdit.get_placeholder */
  final def getPlaceholder(): String = {
    if (gdext.classes.TextEdit.mb_get_placeholder == null) gdext.classes.TextEdit.mb_get_placeholder = MethodBind.get("TextEdit", "get_placeholder", 201670096L)
    Ptrcall.call0[String](gdext.classes.TextEdit.mb_get_placeholder, livePtr)
  }

  /** TextEdit.set_line */
  final def setLine(line: Long, newText: String): Unit = {
    if (gdext.classes.TextEdit.mb_set_line == null) gdext.classes.TextEdit.mb_set_line = MethodBind.get("TextEdit", "set_line", 501894301L)
    Ptrcall.callVoid2(gdext.classes.TextEdit.mb_set_line, livePtr, line, newText)
  }

  /** TextEdit.get_line */
  final def getLine(line: Long): String = {
    if (gdext.classes.TextEdit.mb_get_line == null) gdext.classes.TextEdit.mb_get_line = MethodBind.get("TextEdit", "get_line", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.TextEdit.mb_get_line, livePtr, line)
  }

  /** TextEdit.get_line_with_ime */
  final def getLineWithIme(line: Long): String = {
    if (gdext.classes.TextEdit.mb_get_line_with_ime == null) gdext.classes.TextEdit.mb_get_line_with_ime = MethodBind.get("TextEdit", "get_line_with_ime", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.TextEdit.mb_get_line_with_ime, livePtr, line)
  }

  /** TextEdit.get_line_width */
  final def getLineWidth(line: Long, wrapIndex: Long = -1L): Long = {
    if (gdext.classes.TextEdit.mb_get_line_width == null) gdext.classes.TextEdit.mb_get_line_width = MethodBind.get("TextEdit", "get_line_width", 688195400L)
    Ptrcall.call2[Long, Long, Long](gdext.classes.TextEdit.mb_get_line_width, livePtr, line, wrapIndex)
  }

  /** TextEdit.get_line_height */
  final def getLineHeight(): Long = {
    if (gdext.classes.TextEdit.mb_get_line_height == null) gdext.classes.TextEdit.mb_get_line_height = MethodBind.get("TextEdit", "get_line_height", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.TextEdit.mb_get_line_height, livePtr)
  }

  /** TextEdit.get_indent_level */
  final def getIndentLevel(line: Long): Long = {
    if (gdext.classes.TextEdit.mb_get_indent_level == null) gdext.classes.TextEdit.mb_get_indent_level = MethodBind.get("TextEdit", "get_indent_level", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.TextEdit.mb_get_indent_level, livePtr, line)
  }

  /** TextEdit.get_first_non_whitespace_column */
  final def getFirstNonWhitespaceColumn(line: Long): Long = {
    if (gdext.classes.TextEdit.mb_get_first_non_whitespace_column == null) gdext.classes.TextEdit.mb_get_first_non_whitespace_column = MethodBind.get("TextEdit", "get_first_non_whitespace_column", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.TextEdit.mb_get_first_non_whitespace_column, livePtr, line)
  }

  /** TextEdit.swap_lines */
  final def swapLines(fromLine: Long, toLine: Long): Unit = {
    if (gdext.classes.TextEdit.mb_swap_lines == null) gdext.classes.TextEdit.mb_swap_lines = MethodBind.get("TextEdit", "swap_lines", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.TextEdit.mb_swap_lines, livePtr, fromLine, toLine)
  }

  /** TextEdit.insert_line_at */
  final def insertLineAt(line: Long, text: String): Unit = {
    if (gdext.classes.TextEdit.mb_insert_line_at == null) gdext.classes.TextEdit.mb_insert_line_at = MethodBind.get("TextEdit", "insert_line_at", 501894301L)
    Ptrcall.callVoid2(gdext.classes.TextEdit.mb_insert_line_at, livePtr, line, text)
  }

  /** TextEdit.remove_line_at */
  final def removeLineAt(line: Long, moveCaretsDown: Boolean = true): Unit = {
    if (gdext.classes.TextEdit.mb_remove_line_at == null) gdext.classes.TextEdit.mb_remove_line_at = MethodBind.get("TextEdit", "remove_line_at", 972357352L)
    Ptrcall.callVoid2(gdext.classes.TextEdit.mb_remove_line_at, livePtr, line, moveCaretsDown)
  }

  /** TextEdit.insert_text_at_caret */
  final def insertTextAtCaret(text: String, caretIndex: Long = -1L): Unit = {
    if (gdext.classes.TextEdit.mb_insert_text_at_caret == null) gdext.classes.TextEdit.mb_insert_text_at_caret = MethodBind.get("TextEdit", "insert_text_at_caret", 2697778442L)
    Ptrcall.callVoid2(gdext.classes.TextEdit.mb_insert_text_at_caret, livePtr, text, caretIndex)
  }

  /** TextEdit.insert_text */
  final def insertText(text: String, line: Long, column: Long, beforeSelectionBegin: Boolean = true, beforeSelectionEnd: Boolean = false): Unit = {
    if (gdext.classes.TextEdit.mb_insert_text == null) gdext.classes.TextEdit.mb_insert_text = MethodBind.get("TextEdit", "insert_text", 1881564334L)
    Ptrcall.callVoid5(gdext.classes.TextEdit.mb_insert_text, livePtr, text, line, column, beforeSelectionBegin, beforeSelectionEnd)
  }

  /** TextEdit.remove_text */
  final def removeText(fromLine: Long, fromColumn: Long, toLine: Long, toColumn: Long): Unit = {
    if (gdext.classes.TextEdit.mb_remove_text == null) gdext.classes.TextEdit.mb_remove_text = MethodBind.get("TextEdit", "remove_text", 4275841770L)
    Ptrcall.callVoid4(gdext.classes.TextEdit.mb_remove_text, livePtr, fromLine, fromColumn, toLine, toColumn)
  }

  /** TextEdit.get_last_unhidden_line */
  final def getLastUnhiddenLine(): Long = {
    if (gdext.classes.TextEdit.mb_get_last_unhidden_line == null) gdext.classes.TextEdit.mb_get_last_unhidden_line = MethodBind.get("TextEdit", "get_last_unhidden_line", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.TextEdit.mb_get_last_unhidden_line, livePtr)
  }

  /** TextEdit.get_next_visible_line_offset_from */
  final def getNextVisibleLineOffsetFrom(line: Long, visibleAmount: Long): Long = {
    if (gdext.classes.TextEdit.mb_get_next_visible_line_offset_from == null) gdext.classes.TextEdit.mb_get_next_visible_line_offset_from = MethodBind.get("TextEdit", "get_next_visible_line_offset_from", 3175239445L)
    Ptrcall.call2[Long, Long, Long](gdext.classes.TextEdit.mb_get_next_visible_line_offset_from, livePtr, line, visibleAmount)
  }

  /** TextEdit.get_next_visible_line_index_offset_from */
  final def getNextVisibleLineIndexOffsetFrom(line: Long, wrapIndex: Long, visibleAmount: Long): gdext.builtin.Vector2i = {
    if (gdext.classes.TextEdit.mb_get_next_visible_line_index_offset_from == null) gdext.classes.TextEdit.mb_get_next_visible_line_index_offset_from = MethodBind.get("TextEdit", "get_next_visible_line_index_offset_from", 3386475622L)
    Ptrcall.call3[Long, Long, Long, gdext.builtin.Vector2i](gdext.classes.TextEdit.mb_get_next_visible_line_index_offset_from, livePtr, line, wrapIndex, visibleAmount)
  }

  /** TextEdit.backspace */
  final def backspace(caretIndex: Long = -1L): Unit = {
    if (gdext.classes.TextEdit.mb_backspace == null) gdext.classes.TextEdit.mb_backspace = MethodBind.get("TextEdit", "backspace", 1025054187L)
    Ptrcall.callVoid1(gdext.classes.TextEdit.mb_backspace, livePtr, caretIndex)
  }

  /** TextEdit.cut */
  final def cut(caretIndex: Long = -1L): Unit = {
    if (gdext.classes.TextEdit.mb_cut == null) gdext.classes.TextEdit.mb_cut = MethodBind.get("TextEdit", "cut", 1025054187L)
    Ptrcall.callVoid1(gdext.classes.TextEdit.mb_cut, livePtr, caretIndex)
  }

  /** TextEdit.copy */
  final def copy(caretIndex: Long = -1L): Unit = {
    if (gdext.classes.TextEdit.mb_copy == null) gdext.classes.TextEdit.mb_copy = MethodBind.get("TextEdit", "copy", 1025054187L)
    Ptrcall.callVoid1(gdext.classes.TextEdit.mb_copy, livePtr, caretIndex)
  }

  /** TextEdit.paste */
  final def paste(caretIndex: Long = -1L): Unit = {
    if (gdext.classes.TextEdit.mb_paste == null) gdext.classes.TextEdit.mb_paste = MethodBind.get("TextEdit", "paste", 1025054187L)
    Ptrcall.callVoid1(gdext.classes.TextEdit.mb_paste, livePtr, caretIndex)
  }

  /** TextEdit.paste_primary_clipboard */
  final def pastePrimaryClipboard(caretIndex: Long = -1L): Unit = {
    if (gdext.classes.TextEdit.mb_paste_primary_clipboard == null) gdext.classes.TextEdit.mb_paste_primary_clipboard = MethodBind.get("TextEdit", "paste_primary_clipboard", 1025054187L)
    Ptrcall.callVoid1(gdext.classes.TextEdit.mb_paste_primary_clipboard, livePtr, caretIndex)
  }

  /** TextEdit.start_action */
  final def startAction(action: gdext.classes.TextEdit.EditAction): Unit = {
    if (gdext.classes.TextEdit.mb_start_action == null) gdext.classes.TextEdit.mb_start_action = MethodBind.get("TextEdit", "start_action", 2834827583L)
    Ptrcall.callVoid1(gdext.classes.TextEdit.mb_start_action, livePtr, action)
  }

  /** TextEdit.end_action */
  final def endAction(): Unit = {
    if (gdext.classes.TextEdit.mb_end_action == null) gdext.classes.TextEdit.mb_end_action = MethodBind.get("TextEdit", "end_action", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.TextEdit.mb_end_action, livePtr)
  }

  /** TextEdit.begin_complex_operation */
  final def beginComplexOperation(): Unit = {
    if (gdext.classes.TextEdit.mb_begin_complex_operation == null) gdext.classes.TextEdit.mb_begin_complex_operation = MethodBind.get("TextEdit", "begin_complex_operation", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.TextEdit.mb_begin_complex_operation, livePtr)
  }

  /** TextEdit.end_complex_operation */
  final def endComplexOperation(): Unit = {
    if (gdext.classes.TextEdit.mb_end_complex_operation == null) gdext.classes.TextEdit.mb_end_complex_operation = MethodBind.get("TextEdit", "end_complex_operation", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.TextEdit.mb_end_complex_operation, livePtr)
  }

  /** TextEdit.has_undo */
  final def hasUndo(): Boolean = {
    if (gdext.classes.TextEdit.mb_has_undo == null) gdext.classes.TextEdit.mb_has_undo = MethodBind.get("TextEdit", "has_undo", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TextEdit.mb_has_undo, livePtr)
  }

  /** TextEdit.has_redo */
  final def hasRedo(): Boolean = {
    if (gdext.classes.TextEdit.mb_has_redo == null) gdext.classes.TextEdit.mb_has_redo = MethodBind.get("TextEdit", "has_redo", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TextEdit.mb_has_redo, livePtr)
  }

  /** TextEdit.undo */
  final def undo(): Unit = {
    if (gdext.classes.TextEdit.mb_undo == null) gdext.classes.TextEdit.mb_undo = MethodBind.get("TextEdit", "undo", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.TextEdit.mb_undo, livePtr)
  }

  /** TextEdit.redo */
  final def redo(): Unit = {
    if (gdext.classes.TextEdit.mb_redo == null) gdext.classes.TextEdit.mb_redo = MethodBind.get("TextEdit", "redo", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.TextEdit.mb_redo, livePtr)
  }

  /** TextEdit.clear_undo_history */
  final def clearUndoHistory(): Unit = {
    if (gdext.classes.TextEdit.mb_clear_undo_history == null) gdext.classes.TextEdit.mb_clear_undo_history = MethodBind.get("TextEdit", "clear_undo_history", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.TextEdit.mb_clear_undo_history, livePtr)
  }

  /** TextEdit.tag_saved_version */
  final def tagSavedVersion(): Unit = {
    if (gdext.classes.TextEdit.mb_tag_saved_version == null) gdext.classes.TextEdit.mb_tag_saved_version = MethodBind.get("TextEdit", "tag_saved_version", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.TextEdit.mb_tag_saved_version, livePtr)
  }

  /** TextEdit.get_version */
  final def getVersion(): Long = {
    if (gdext.classes.TextEdit.mb_get_version == null) gdext.classes.TextEdit.mb_get_version = MethodBind.get("TextEdit", "get_version", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.TextEdit.mb_get_version, livePtr)
  }

  /** TextEdit.get_saved_version */
  final def getSavedVersion(): Long = {
    if (gdext.classes.TextEdit.mb_get_saved_version == null) gdext.classes.TextEdit.mb_get_saved_version = MethodBind.get("TextEdit", "get_saved_version", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.TextEdit.mb_get_saved_version, livePtr)
  }

  /** TextEdit.set_search_text */
  final def setSearchText(searchText: String): Unit = {
    if (gdext.classes.TextEdit.mb_set_search_text == null) gdext.classes.TextEdit.mb_set_search_text = MethodBind.get("TextEdit", "set_search_text", 83702148L)
    Ptrcall.callVoid1(gdext.classes.TextEdit.mb_set_search_text, livePtr, searchText)
  }

  /** TextEdit.set_search_flags */
  final def setSearchFlags(flags: Long): Unit = {
    if (gdext.classes.TextEdit.mb_set_search_flags == null) gdext.classes.TextEdit.mb_set_search_flags = MethodBind.get("TextEdit", "set_search_flags", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.TextEdit.mb_set_search_flags, livePtr, flags)
  }

  /** TextEdit.search */
  final def search(text: String, flags: Long, fromLine: Long, fromColumn: Long): gdext.builtin.Vector2i = {
    if (gdext.classes.TextEdit.mb_search == null) gdext.classes.TextEdit.mb_search = MethodBind.get("TextEdit", "search", 1203739136L)
    Ptrcall.call4[String, Long, Long, Long, gdext.builtin.Vector2i](gdext.classes.TextEdit.mb_search, livePtr, text, flags, fromLine, fromColumn)
  }

  /** TextEdit.get_local_mouse_pos */
  final def getLocalMousePos(): gdext.builtin.Vector2 = {
    if (gdext.classes.TextEdit.mb_get_local_mouse_pos == null) gdext.classes.TextEdit.mb_get_local_mouse_pos = MethodBind.get("TextEdit", "get_local_mouse_pos", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.TextEdit.mb_get_local_mouse_pos, livePtr)
  }

  /** TextEdit.get_word_at_pos */
  final def getWordAtPos(position: gdext.builtin.Vector2): String = {
    if (gdext.classes.TextEdit.mb_get_word_at_pos == null) gdext.classes.TextEdit.mb_get_word_at_pos = MethodBind.get("TextEdit", "get_word_at_pos", 3674420000L)
    Ptrcall.call1[gdext.builtin.Vector2, String](gdext.classes.TextEdit.mb_get_word_at_pos, livePtr, position)
  }

  /** TextEdit.get_line_column_at_pos */
  final def getLineColumnAtPos(position: gdext.builtin.Vector2i, clampLine: Boolean = true, clampColumn: Boolean = true): gdext.builtin.Vector2i = {
    if (gdext.classes.TextEdit.mb_get_line_column_at_pos == null) gdext.classes.TextEdit.mb_get_line_column_at_pos = MethodBind.get("TextEdit", "get_line_column_at_pos", 3472935744L)
    Ptrcall.call3[gdext.builtin.Vector2i, Boolean, Boolean, gdext.builtin.Vector2i](gdext.classes.TextEdit.mb_get_line_column_at_pos, livePtr, position, clampLine, clampColumn)
  }

  /** TextEdit.get_pos_at_line_column */
  final def getPosAtLineColumn(line: Long, column: Long): gdext.builtin.Vector2i = {
    if (gdext.classes.TextEdit.mb_get_pos_at_line_column == null) gdext.classes.TextEdit.mb_get_pos_at_line_column = MethodBind.get("TextEdit", "get_pos_at_line_column", 410388347L)
    Ptrcall.call2[Long, Long, gdext.builtin.Vector2i](gdext.classes.TextEdit.mb_get_pos_at_line_column, livePtr, line, column)
  }

  /** TextEdit.get_rect_at_line_column */
  final def getRectAtLineColumn(line: Long, column: Long): gdext.builtin.Rect2i = {
    if (gdext.classes.TextEdit.mb_get_rect_at_line_column == null) gdext.classes.TextEdit.mb_get_rect_at_line_column = MethodBind.get("TextEdit", "get_rect_at_line_column", 3256618057L)
    Ptrcall.call2[Long, Long, gdext.builtin.Rect2i](gdext.classes.TextEdit.mb_get_rect_at_line_column, livePtr, line, column)
  }

  /** TextEdit.get_minimap_line_at_pos */
  final def getMinimapLineAtPos(position: gdext.builtin.Vector2i): Long = {
    if (gdext.classes.TextEdit.mb_get_minimap_line_at_pos == null) gdext.classes.TextEdit.mb_get_minimap_line_at_pos = MethodBind.get("TextEdit", "get_minimap_line_at_pos", 2485466453L)
    Ptrcall.call1[gdext.builtin.Vector2i, Long](gdext.classes.TextEdit.mb_get_minimap_line_at_pos, livePtr, position)
  }

  /** TextEdit.is_dragging_cursor */
  final def isDraggingCursor(): Boolean = {
    if (gdext.classes.TextEdit.mb_is_dragging_cursor == null) gdext.classes.TextEdit.mb_is_dragging_cursor = MethodBind.get("TextEdit", "is_dragging_cursor", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TextEdit.mb_is_dragging_cursor, livePtr)
  }

  /** TextEdit.is_mouse_over_selection */
  final def isMouseOverSelection(edges: Boolean, caretIndex: Long = -1L): Boolean = {
    if (gdext.classes.TextEdit.mb_is_mouse_over_selection == null) gdext.classes.TextEdit.mb_is_mouse_over_selection = MethodBind.get("TextEdit", "is_mouse_over_selection", 1840282309L)
    Ptrcall.call2[Boolean, Long, Boolean](gdext.classes.TextEdit.mb_is_mouse_over_selection, livePtr, edges, caretIndex)
  }

  /** TextEdit.set_caret_type */
  final def setCaretType(`type`: gdext.classes.TextEdit.CaretType): Unit = {
    if (gdext.classes.TextEdit.mb_set_caret_type == null) gdext.classes.TextEdit.mb_set_caret_type = MethodBind.get("TextEdit", "set_caret_type", 1211596914L)
    Ptrcall.callVoid1(gdext.classes.TextEdit.mb_set_caret_type, livePtr, `type`)
  }

  /** TextEdit.get_caret_type */
  final def getCaretType(): gdext.classes.TextEdit.CaretType = {
    if (gdext.classes.TextEdit.mb_get_caret_type == null) gdext.classes.TextEdit.mb_get_caret_type = MethodBind.get("TextEdit", "get_caret_type", 2830252959L)
    gdext.classes.TextEdit.CaretType(Ptrcall.call0[Long](gdext.classes.TextEdit.mb_get_caret_type, livePtr))
  }

  /** TextEdit.set_caret_blink_enabled */
  final def setCaretBlinkEnabled(enable: Boolean): Unit = {
    if (gdext.classes.TextEdit.mb_set_caret_blink_enabled == null) gdext.classes.TextEdit.mb_set_caret_blink_enabled = MethodBind.get("TextEdit", "set_caret_blink_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TextEdit.mb_set_caret_blink_enabled, livePtr, enable)
  }

  /** TextEdit.is_caret_blink_enabled */
  final def isCaretBlinkEnabled(): Boolean = {
    if (gdext.classes.TextEdit.mb_is_caret_blink_enabled == null) gdext.classes.TextEdit.mb_is_caret_blink_enabled = MethodBind.get("TextEdit", "is_caret_blink_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TextEdit.mb_is_caret_blink_enabled, livePtr)
  }

  /** TextEdit.set_caret_blink_interval */
  final def setCaretBlinkInterval(interval: Double): Unit = {
    if (gdext.classes.TextEdit.mb_set_caret_blink_interval == null) gdext.classes.TextEdit.mb_set_caret_blink_interval = MethodBind.get("TextEdit", "set_caret_blink_interval", 373806689L)
    Ptrcall.callVoid1(gdext.classes.TextEdit.mb_set_caret_blink_interval, livePtr, interval)
  }

  /** TextEdit.get_caret_blink_interval */
  final def getCaretBlinkInterval(): Double = {
    if (gdext.classes.TextEdit.mb_get_caret_blink_interval == null) gdext.classes.TextEdit.mb_get_caret_blink_interval = MethodBind.get("TextEdit", "get_caret_blink_interval", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.TextEdit.mb_get_caret_blink_interval, livePtr)
  }

  /** TextEdit.set_draw_caret_when_editable_disabled */
  final def setDrawCaretWhenEditableDisabled(enable: Boolean): Unit = {
    if (gdext.classes.TextEdit.mb_set_draw_caret_when_editable_disabled == null) gdext.classes.TextEdit.mb_set_draw_caret_when_editable_disabled = MethodBind.get("TextEdit", "set_draw_caret_when_editable_disabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TextEdit.mb_set_draw_caret_when_editable_disabled, livePtr, enable)
  }

  /** TextEdit.is_drawing_caret_when_editable_disabled */
  final def isDrawingCaretWhenEditableDisabled(): Boolean = {
    if (gdext.classes.TextEdit.mb_is_drawing_caret_when_editable_disabled == null) gdext.classes.TextEdit.mb_is_drawing_caret_when_editable_disabled = MethodBind.get("TextEdit", "is_drawing_caret_when_editable_disabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TextEdit.mb_is_drawing_caret_when_editable_disabled, livePtr)
  }

  /** TextEdit.set_move_caret_on_right_click_enabled */
  final def setMoveCaretOnRightClickEnabled(enable: Boolean): Unit = {
    if (gdext.classes.TextEdit.mb_set_move_caret_on_right_click_enabled == null) gdext.classes.TextEdit.mb_set_move_caret_on_right_click_enabled = MethodBind.get("TextEdit", "set_move_caret_on_right_click_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TextEdit.mb_set_move_caret_on_right_click_enabled, livePtr, enable)
  }

  /** TextEdit.is_move_caret_on_right_click_enabled */
  final def isMoveCaretOnRightClickEnabled(): Boolean = {
    if (gdext.classes.TextEdit.mb_is_move_caret_on_right_click_enabled == null) gdext.classes.TextEdit.mb_is_move_caret_on_right_click_enabled = MethodBind.get("TextEdit", "is_move_caret_on_right_click_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TextEdit.mb_is_move_caret_on_right_click_enabled, livePtr)
  }

  /** TextEdit.set_caret_mid_grapheme_enabled */
  final def setCaretMidGraphemeEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.TextEdit.mb_set_caret_mid_grapheme_enabled == null) gdext.classes.TextEdit.mb_set_caret_mid_grapheme_enabled = MethodBind.get("TextEdit", "set_caret_mid_grapheme_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TextEdit.mb_set_caret_mid_grapheme_enabled, livePtr, enabled)
  }

  /** TextEdit.is_caret_mid_grapheme_enabled */
  final def isCaretMidGraphemeEnabled(): Boolean = {
    if (gdext.classes.TextEdit.mb_is_caret_mid_grapheme_enabled == null) gdext.classes.TextEdit.mb_is_caret_mid_grapheme_enabled = MethodBind.get("TextEdit", "is_caret_mid_grapheme_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TextEdit.mb_is_caret_mid_grapheme_enabled, livePtr)
  }

  /** TextEdit.set_multiple_carets_enabled */
  final def setMultipleCaretsEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.TextEdit.mb_set_multiple_carets_enabled == null) gdext.classes.TextEdit.mb_set_multiple_carets_enabled = MethodBind.get("TextEdit", "set_multiple_carets_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TextEdit.mb_set_multiple_carets_enabled, livePtr, enabled)
  }

  /** TextEdit.is_multiple_carets_enabled */
  final def isMultipleCaretsEnabled(): Boolean = {
    if (gdext.classes.TextEdit.mb_is_multiple_carets_enabled == null) gdext.classes.TextEdit.mb_is_multiple_carets_enabled = MethodBind.get("TextEdit", "is_multiple_carets_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TextEdit.mb_is_multiple_carets_enabled, livePtr)
  }

  /** TextEdit.add_caret */
  final def addCaret(line: Long, column: Long): Long = {
    if (gdext.classes.TextEdit.mb_add_caret == null) gdext.classes.TextEdit.mb_add_caret = MethodBind.get("TextEdit", "add_caret", 50157827L)
    Ptrcall.call2[Long, Long, Long](gdext.classes.TextEdit.mb_add_caret, livePtr, line, column)
  }

  /** TextEdit.remove_caret */
  final def removeCaret(caret: Long): Unit = {
    if (gdext.classes.TextEdit.mb_remove_caret == null) gdext.classes.TextEdit.mb_remove_caret = MethodBind.get("TextEdit", "remove_caret", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.TextEdit.mb_remove_caret, livePtr, caret)
  }

  /** TextEdit.remove_secondary_carets */
  final def removeSecondaryCarets(): Unit = {
    if (gdext.classes.TextEdit.mb_remove_secondary_carets == null) gdext.classes.TextEdit.mb_remove_secondary_carets = MethodBind.get("TextEdit", "remove_secondary_carets", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.TextEdit.mb_remove_secondary_carets, livePtr)
  }

  /** TextEdit.get_caret_count */
  final def getCaretCount(): Long = {
    if (gdext.classes.TextEdit.mb_get_caret_count == null) gdext.classes.TextEdit.mb_get_caret_count = MethodBind.get("TextEdit", "get_caret_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.TextEdit.mb_get_caret_count, livePtr)
  }

  /** TextEdit.add_caret_at_carets */
  final def addCaretAtCarets(below: Boolean): Unit = {
    if (gdext.classes.TextEdit.mb_add_caret_at_carets == null) gdext.classes.TextEdit.mb_add_caret_at_carets = MethodBind.get("TextEdit", "add_caret_at_carets", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TextEdit.mb_add_caret_at_carets, livePtr, below)
  }

  /** TextEdit.collapse_carets */
  final def collapseCarets(fromLine: Long, fromColumn: Long, toLine: Long, toColumn: Long, inclusive: Boolean = false): Unit = {
    if (gdext.classes.TextEdit.mb_collapse_carets == null) gdext.classes.TextEdit.mb_collapse_carets = MethodBind.get("TextEdit", "collapse_carets", 228654177L)
    Ptrcall.callVoid5(gdext.classes.TextEdit.mb_collapse_carets, livePtr, fromLine, fromColumn, toLine, toColumn, inclusive)
  }

  /** TextEdit.merge_overlapping_carets */
  final def mergeOverlappingCarets(): Unit = {
    if (gdext.classes.TextEdit.mb_merge_overlapping_carets == null) gdext.classes.TextEdit.mb_merge_overlapping_carets = MethodBind.get("TextEdit", "merge_overlapping_carets", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.TextEdit.mb_merge_overlapping_carets, livePtr)
  }

  /** TextEdit.begin_multicaret_edit */
  final def beginMulticaretEdit(): Unit = {
    if (gdext.classes.TextEdit.mb_begin_multicaret_edit == null) gdext.classes.TextEdit.mb_begin_multicaret_edit = MethodBind.get("TextEdit", "begin_multicaret_edit", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.TextEdit.mb_begin_multicaret_edit, livePtr)
  }

  /** TextEdit.end_multicaret_edit */
  final def endMulticaretEdit(): Unit = {
    if (gdext.classes.TextEdit.mb_end_multicaret_edit == null) gdext.classes.TextEdit.mb_end_multicaret_edit = MethodBind.get("TextEdit", "end_multicaret_edit", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.TextEdit.mb_end_multicaret_edit, livePtr)
  }

  /** TextEdit.is_in_mulitcaret_edit */
  final def isInMulitcaretEdit(): Boolean = {
    if (gdext.classes.TextEdit.mb_is_in_mulitcaret_edit == null) gdext.classes.TextEdit.mb_is_in_mulitcaret_edit = MethodBind.get("TextEdit", "is_in_mulitcaret_edit", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TextEdit.mb_is_in_mulitcaret_edit, livePtr)
  }

  /** TextEdit.multicaret_edit_ignore_caret */
  final def multicaretEditIgnoreCaret(caretIndex: Long): Boolean = {
    if (gdext.classes.TextEdit.mb_multicaret_edit_ignore_caret == null) gdext.classes.TextEdit.mb_multicaret_edit_ignore_caret = MethodBind.get("TextEdit", "multicaret_edit_ignore_caret", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.TextEdit.mb_multicaret_edit_ignore_caret, livePtr, caretIndex)
  }

  /** TextEdit.is_caret_visible */
  final def isCaretVisible(caretIndex: Long = 0L): Boolean = {
    if (gdext.classes.TextEdit.mb_is_caret_visible == null) gdext.classes.TextEdit.mb_is_caret_visible = MethodBind.get("TextEdit", "is_caret_visible", 1051549951L)
    Ptrcall.call1[Long, Boolean](gdext.classes.TextEdit.mb_is_caret_visible, livePtr, caretIndex)
  }

  /** TextEdit.get_caret_draw_pos */
  final def getCaretDrawPos(caretIndex: Long = 0L): gdext.builtin.Vector2 = {
    if (gdext.classes.TextEdit.mb_get_caret_draw_pos == null) gdext.classes.TextEdit.mb_get_caret_draw_pos = MethodBind.get("TextEdit", "get_caret_draw_pos", 478253731L)
    Ptrcall.call1[Long, gdext.builtin.Vector2](gdext.classes.TextEdit.mb_get_caret_draw_pos, livePtr, caretIndex)
  }

  /** TextEdit.set_caret_line */
  final def setCaretLine(line: Long, adjustViewport: Boolean = true, canBeHidden: Boolean = true, wrapIndex: Long = 0L, caretIndex: Long = 0L): Unit = {
    if (gdext.classes.TextEdit.mb_set_caret_line == null) gdext.classes.TextEdit.mb_set_caret_line = MethodBind.get("TextEdit", "set_caret_line", 1302582944L)
    Ptrcall.callVoid5(gdext.classes.TextEdit.mb_set_caret_line, livePtr, line, adjustViewport, canBeHidden, wrapIndex, caretIndex)
  }

  /** TextEdit.get_caret_line */
  final def getCaretLine(caretIndex: Long = 0L): Long = {
    if (gdext.classes.TextEdit.mb_get_caret_line == null) gdext.classes.TextEdit.mb_get_caret_line = MethodBind.get("TextEdit", "get_caret_line", 1591665591L)
    Ptrcall.call1[Long, Long](gdext.classes.TextEdit.mb_get_caret_line, livePtr, caretIndex)
  }

  /** TextEdit.set_caret_column */
  final def setCaretColumn(column: Long, adjustViewport: Boolean = true, caretIndex: Long = 0L): Unit = {
    if (gdext.classes.TextEdit.mb_set_caret_column == null) gdext.classes.TextEdit.mb_set_caret_column = MethodBind.get("TextEdit", "set_caret_column", 3796796178L)
    Ptrcall.callVoid3(gdext.classes.TextEdit.mb_set_caret_column, livePtr, column, adjustViewport, caretIndex)
  }

  /** TextEdit.get_caret_column */
  final def getCaretColumn(caretIndex: Long = 0L): Long = {
    if (gdext.classes.TextEdit.mb_get_caret_column == null) gdext.classes.TextEdit.mb_get_caret_column = MethodBind.get("TextEdit", "get_caret_column", 1591665591L)
    Ptrcall.call1[Long, Long](gdext.classes.TextEdit.mb_get_caret_column, livePtr, caretIndex)
  }

  /** TextEdit.get_next_composite_character_column */
  final def getNextCompositeCharacterColumn(line: Long, column: Long): Long = {
    if (gdext.classes.TextEdit.mb_get_next_composite_character_column == null) gdext.classes.TextEdit.mb_get_next_composite_character_column = MethodBind.get("TextEdit", "get_next_composite_character_column", 3175239445L)
    Ptrcall.call2[Long, Long, Long](gdext.classes.TextEdit.mb_get_next_composite_character_column, livePtr, line, column)
  }

  /** TextEdit.get_previous_composite_character_column */
  final def getPreviousCompositeCharacterColumn(line: Long, column: Long): Long = {
    if (gdext.classes.TextEdit.mb_get_previous_composite_character_column == null) gdext.classes.TextEdit.mb_get_previous_composite_character_column = MethodBind.get("TextEdit", "get_previous_composite_character_column", 3175239445L)
    Ptrcall.call2[Long, Long, Long](gdext.classes.TextEdit.mb_get_previous_composite_character_column, livePtr, line, column)
  }

  /** TextEdit.get_caret_wrap_index */
  final def getCaretWrapIndex(caretIndex: Long = 0L): Long = {
    if (gdext.classes.TextEdit.mb_get_caret_wrap_index == null) gdext.classes.TextEdit.mb_get_caret_wrap_index = MethodBind.get("TextEdit", "get_caret_wrap_index", 1591665591L)
    Ptrcall.call1[Long, Long](gdext.classes.TextEdit.mb_get_caret_wrap_index, livePtr, caretIndex)
  }

  /** TextEdit.get_word_under_caret */
  final def getWordUnderCaret(caretIndex: Long = -1L): String = {
    if (gdext.classes.TextEdit.mb_get_word_under_caret == null) gdext.classes.TextEdit.mb_get_word_under_caret = MethodBind.get("TextEdit", "get_word_under_caret", 3929349208L)
    Ptrcall.call1[Long, String](gdext.classes.TextEdit.mb_get_word_under_caret, livePtr, caretIndex)
  }

  /** TextEdit.set_use_default_word_separators */
  final def setUseDefaultWordSeparators(enabled: Boolean): Unit = {
    if (gdext.classes.TextEdit.mb_set_use_default_word_separators == null) gdext.classes.TextEdit.mb_set_use_default_word_separators = MethodBind.get("TextEdit", "set_use_default_word_separators", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TextEdit.mb_set_use_default_word_separators, livePtr, enabled)
  }

  /** TextEdit.is_default_word_separators_enabled */
  final def isDefaultWordSeparatorsEnabled(): Boolean = {
    if (gdext.classes.TextEdit.mb_is_default_word_separators_enabled == null) gdext.classes.TextEdit.mb_is_default_word_separators_enabled = MethodBind.get("TextEdit", "is_default_word_separators_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TextEdit.mb_is_default_word_separators_enabled, livePtr)
  }

  /** TextEdit.set_use_custom_word_separators */
  final def setUseCustomWordSeparators(enabled: Boolean): Unit = {
    if (gdext.classes.TextEdit.mb_set_use_custom_word_separators == null) gdext.classes.TextEdit.mb_set_use_custom_word_separators = MethodBind.get("TextEdit", "set_use_custom_word_separators", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TextEdit.mb_set_use_custom_word_separators, livePtr, enabled)
  }

  /** TextEdit.is_custom_word_separators_enabled */
  final def isCustomWordSeparatorsEnabled(): Boolean = {
    if (gdext.classes.TextEdit.mb_is_custom_word_separators_enabled == null) gdext.classes.TextEdit.mb_is_custom_word_separators_enabled = MethodBind.get("TextEdit", "is_custom_word_separators_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TextEdit.mb_is_custom_word_separators_enabled, livePtr)
  }

  /** TextEdit.set_custom_word_separators */
  final def setCustomWordSeparators(customWordSeparators: String): Unit = {
    if (gdext.classes.TextEdit.mb_set_custom_word_separators == null) gdext.classes.TextEdit.mb_set_custom_word_separators = MethodBind.get("TextEdit", "set_custom_word_separators", 83702148L)
    Ptrcall.callVoid1(gdext.classes.TextEdit.mb_set_custom_word_separators, livePtr, customWordSeparators)
  }

  /** TextEdit.get_custom_word_separators */
  final def getCustomWordSeparators(): String = {
    if (gdext.classes.TextEdit.mb_get_custom_word_separators == null) gdext.classes.TextEdit.mb_get_custom_word_separators = MethodBind.get("TextEdit", "get_custom_word_separators", 201670096L)
    Ptrcall.call0[String](gdext.classes.TextEdit.mb_get_custom_word_separators, livePtr)
  }

  /** TextEdit.set_selecting_enabled */
  final def setSelectingEnabled(enable: Boolean): Unit = {
    if (gdext.classes.TextEdit.mb_set_selecting_enabled == null) gdext.classes.TextEdit.mb_set_selecting_enabled = MethodBind.get("TextEdit", "set_selecting_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TextEdit.mb_set_selecting_enabled, livePtr, enable)
  }

  /** TextEdit.is_selecting_enabled */
  final def isSelectingEnabled(): Boolean = {
    if (gdext.classes.TextEdit.mb_is_selecting_enabled == null) gdext.classes.TextEdit.mb_is_selecting_enabled = MethodBind.get("TextEdit", "is_selecting_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TextEdit.mb_is_selecting_enabled, livePtr)
  }

  /** TextEdit.set_deselect_on_focus_loss_enabled */
  final def setDeselectOnFocusLossEnabled(enable: Boolean): Unit = {
    if (gdext.classes.TextEdit.mb_set_deselect_on_focus_loss_enabled == null) gdext.classes.TextEdit.mb_set_deselect_on_focus_loss_enabled = MethodBind.get("TextEdit", "set_deselect_on_focus_loss_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TextEdit.mb_set_deselect_on_focus_loss_enabled, livePtr, enable)
  }

  /** TextEdit.is_deselect_on_focus_loss_enabled */
  final def isDeselectOnFocusLossEnabled(): Boolean = {
    if (gdext.classes.TextEdit.mb_is_deselect_on_focus_loss_enabled == null) gdext.classes.TextEdit.mb_is_deselect_on_focus_loss_enabled = MethodBind.get("TextEdit", "is_deselect_on_focus_loss_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TextEdit.mb_is_deselect_on_focus_loss_enabled, livePtr)
  }

  /** TextEdit.set_drag_and_drop_selection_enabled */
  final def setDragAndDropSelectionEnabled(enable: Boolean): Unit = {
    if (gdext.classes.TextEdit.mb_set_drag_and_drop_selection_enabled == null) gdext.classes.TextEdit.mb_set_drag_and_drop_selection_enabled = MethodBind.get("TextEdit", "set_drag_and_drop_selection_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TextEdit.mb_set_drag_and_drop_selection_enabled, livePtr, enable)
  }

  /** TextEdit.is_drag_and_drop_selection_enabled */
  final def isDragAndDropSelectionEnabled(): Boolean = {
    if (gdext.classes.TextEdit.mb_is_drag_and_drop_selection_enabled == null) gdext.classes.TextEdit.mb_is_drag_and_drop_selection_enabled = MethodBind.get("TextEdit", "is_drag_and_drop_selection_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TextEdit.mb_is_drag_and_drop_selection_enabled, livePtr)
  }

  /** TextEdit.set_selection_mode */
  final def setSelectionMode(mode: gdext.classes.TextEdit.SelectionMode): Unit = {
    if (gdext.classes.TextEdit.mb_set_selection_mode == null) gdext.classes.TextEdit.mb_set_selection_mode = MethodBind.get("TextEdit", "set_selection_mode", 1658801786L)
    Ptrcall.callVoid1(gdext.classes.TextEdit.mb_set_selection_mode, livePtr, mode)
  }

  /** TextEdit.get_selection_mode */
  final def getSelectionMode(): gdext.classes.TextEdit.SelectionMode = {
    if (gdext.classes.TextEdit.mb_get_selection_mode == null) gdext.classes.TextEdit.mb_get_selection_mode = MethodBind.get("TextEdit", "get_selection_mode", 3750106938L)
    gdext.classes.TextEdit.SelectionMode(Ptrcall.call0[Long](gdext.classes.TextEdit.mb_get_selection_mode, livePtr))
  }

  /** TextEdit.select_all */
  final def selectAll(): Unit = {
    if (gdext.classes.TextEdit.mb_select_all == null) gdext.classes.TextEdit.mb_select_all = MethodBind.get("TextEdit", "select_all", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.TextEdit.mb_select_all, livePtr)
  }

  /** TextEdit.select_word_under_caret */
  final def selectWordUnderCaret(caretIndex: Long = -1L): Unit = {
    if (gdext.classes.TextEdit.mb_select_word_under_caret == null) gdext.classes.TextEdit.mb_select_word_under_caret = MethodBind.get("TextEdit", "select_word_under_caret", 1025054187L)
    Ptrcall.callVoid1(gdext.classes.TextEdit.mb_select_word_under_caret, livePtr, caretIndex)
  }

  /** TextEdit.add_selection_for_next_occurrence */
  final def addSelectionForNextOccurrence(): Unit = {
    if (gdext.classes.TextEdit.mb_add_selection_for_next_occurrence == null) gdext.classes.TextEdit.mb_add_selection_for_next_occurrence = MethodBind.get("TextEdit", "add_selection_for_next_occurrence", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.TextEdit.mb_add_selection_for_next_occurrence, livePtr)
  }

  /** TextEdit.skip_selection_for_next_occurrence */
  final def skipSelectionForNextOccurrence(): Unit = {
    if (gdext.classes.TextEdit.mb_skip_selection_for_next_occurrence == null) gdext.classes.TextEdit.mb_skip_selection_for_next_occurrence = MethodBind.get("TextEdit", "skip_selection_for_next_occurrence", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.TextEdit.mb_skip_selection_for_next_occurrence, livePtr)
  }

  /** TextEdit.select */
  final def select(originLine: Long, originColumn: Long, caretLine: Long, caretColumn: Long, caretIndex: Long = 0L): Unit = {
    if (gdext.classes.TextEdit.mb_select == null) gdext.classes.TextEdit.mb_select = MethodBind.get("TextEdit", "select", 2560984452L)
    Ptrcall.callVoid5(gdext.classes.TextEdit.mb_select, livePtr, originLine, originColumn, caretLine, caretColumn, caretIndex)
  }

  /** TextEdit.has_selection */
  final def hasSelection(caretIndex: Long = -1L): Boolean = {
    if (gdext.classes.TextEdit.mb_has_selection == null) gdext.classes.TextEdit.mb_has_selection = MethodBind.get("TextEdit", "has_selection", 2824505868L)
    Ptrcall.call1[Long, Boolean](gdext.classes.TextEdit.mb_has_selection, livePtr, caretIndex)
  }

  /** TextEdit.get_selected_text */
  final def getSelectedText(caretIndex: Long = -1L): String = {
    if (gdext.classes.TextEdit.mb_get_selected_text == null) gdext.classes.TextEdit.mb_get_selected_text = MethodBind.get("TextEdit", "get_selected_text", 2309358862L)
    Ptrcall.call1[Long, String](gdext.classes.TextEdit.mb_get_selected_text, livePtr, caretIndex)
  }

  /** TextEdit.get_selection_at_line_column */
  final def getSelectionAtLineColumn(line: Long, column: Long, includeEdges: Boolean = true, onlySelections: Boolean = true): Long = {
    if (gdext.classes.TextEdit.mb_get_selection_at_line_column == null) gdext.classes.TextEdit.mb_get_selection_at_line_column = MethodBind.get("TextEdit", "get_selection_at_line_column", 1810224333L)
    Ptrcall.call4[Long, Long, Boolean, Boolean, Long](gdext.classes.TextEdit.mb_get_selection_at_line_column, livePtr, line, column, includeEdges, onlySelections)
  }

  /** TextEdit.get_selection_origin_line */
  final def getSelectionOriginLine(caretIndex: Long = 0L): Long = {
    if (gdext.classes.TextEdit.mb_get_selection_origin_line == null) gdext.classes.TextEdit.mb_get_selection_origin_line = MethodBind.get("TextEdit", "get_selection_origin_line", 1591665591L)
    Ptrcall.call1[Long, Long](gdext.classes.TextEdit.mb_get_selection_origin_line, livePtr, caretIndex)
  }

  /** TextEdit.get_selection_origin_column */
  final def getSelectionOriginColumn(caretIndex: Long = 0L): Long = {
    if (gdext.classes.TextEdit.mb_get_selection_origin_column == null) gdext.classes.TextEdit.mb_get_selection_origin_column = MethodBind.get("TextEdit", "get_selection_origin_column", 1591665591L)
    Ptrcall.call1[Long, Long](gdext.classes.TextEdit.mb_get_selection_origin_column, livePtr, caretIndex)
  }

  /** TextEdit.set_selection_origin_line */
  final def setSelectionOriginLine(line: Long, canBeHidden: Boolean = true, wrapIndex: Long = -1L, caretIndex: Long = 0L): Unit = {
    if (gdext.classes.TextEdit.mb_set_selection_origin_line == null) gdext.classes.TextEdit.mb_set_selection_origin_line = MethodBind.get("TextEdit", "set_selection_origin_line", 195434140L)
    Ptrcall.callVoid4(gdext.classes.TextEdit.mb_set_selection_origin_line, livePtr, line, canBeHidden, wrapIndex, caretIndex)
  }

  /** TextEdit.set_selection_origin_column */
  final def setSelectionOriginColumn(column: Long, caretIndex: Long = 0L): Unit = {
    if (gdext.classes.TextEdit.mb_set_selection_origin_column == null) gdext.classes.TextEdit.mb_set_selection_origin_column = MethodBind.get("TextEdit", "set_selection_origin_column", 2230941749L)
    Ptrcall.callVoid2(gdext.classes.TextEdit.mb_set_selection_origin_column, livePtr, column, caretIndex)
  }

  /** TextEdit.get_selection_from_line */
  final def getSelectionFromLine(caretIndex: Long = 0L): Long = {
    if (gdext.classes.TextEdit.mb_get_selection_from_line == null) gdext.classes.TextEdit.mb_get_selection_from_line = MethodBind.get("TextEdit", "get_selection_from_line", 1591665591L)
    Ptrcall.call1[Long, Long](gdext.classes.TextEdit.mb_get_selection_from_line, livePtr, caretIndex)
  }

  /** TextEdit.get_selection_from_column */
  final def getSelectionFromColumn(caretIndex: Long = 0L): Long = {
    if (gdext.classes.TextEdit.mb_get_selection_from_column == null) gdext.classes.TextEdit.mb_get_selection_from_column = MethodBind.get("TextEdit", "get_selection_from_column", 1591665591L)
    Ptrcall.call1[Long, Long](gdext.classes.TextEdit.mb_get_selection_from_column, livePtr, caretIndex)
  }

  /** TextEdit.get_selection_to_line */
  final def getSelectionToLine(caretIndex: Long = 0L): Long = {
    if (gdext.classes.TextEdit.mb_get_selection_to_line == null) gdext.classes.TextEdit.mb_get_selection_to_line = MethodBind.get("TextEdit", "get_selection_to_line", 1591665591L)
    Ptrcall.call1[Long, Long](gdext.classes.TextEdit.mb_get_selection_to_line, livePtr, caretIndex)
  }

  /** TextEdit.get_selection_to_column */
  final def getSelectionToColumn(caretIndex: Long = 0L): Long = {
    if (gdext.classes.TextEdit.mb_get_selection_to_column == null) gdext.classes.TextEdit.mb_get_selection_to_column = MethodBind.get("TextEdit", "get_selection_to_column", 1591665591L)
    Ptrcall.call1[Long, Long](gdext.classes.TextEdit.mb_get_selection_to_column, livePtr, caretIndex)
  }

  /** TextEdit.is_caret_after_selection_origin */
  final def isCaretAfterSelectionOrigin(caretIndex: Long = 0L): Boolean = {
    if (gdext.classes.TextEdit.mb_is_caret_after_selection_origin == null) gdext.classes.TextEdit.mb_is_caret_after_selection_origin = MethodBind.get("TextEdit", "is_caret_after_selection_origin", 1051549951L)
    Ptrcall.call1[Long, Boolean](gdext.classes.TextEdit.mb_is_caret_after_selection_origin, livePtr, caretIndex)
  }

  /** TextEdit.deselect */
  final def deselect(caretIndex: Long = -1L): Unit = {
    if (gdext.classes.TextEdit.mb_deselect == null) gdext.classes.TextEdit.mb_deselect = MethodBind.get("TextEdit", "deselect", 1025054187L)
    Ptrcall.callVoid1(gdext.classes.TextEdit.mb_deselect, livePtr, caretIndex)
  }

  /** TextEdit.delete_selection */
  final def deleteSelection(caretIndex: Long = -1L): Unit = {
    if (gdext.classes.TextEdit.mb_delete_selection == null) gdext.classes.TextEdit.mb_delete_selection = MethodBind.get("TextEdit", "delete_selection", 1025054187L)
    Ptrcall.callVoid1(gdext.classes.TextEdit.mb_delete_selection, livePtr, caretIndex)
  }

  /** TextEdit.set_line_wrapping_mode */
  final def setLineWrappingMode(mode: gdext.classes.TextEdit.LineWrappingMode): Unit = {
    if (gdext.classes.TextEdit.mb_set_line_wrapping_mode == null) gdext.classes.TextEdit.mb_set_line_wrapping_mode = MethodBind.get("TextEdit", "set_line_wrapping_mode", 2525115309L)
    Ptrcall.callVoid1(gdext.classes.TextEdit.mb_set_line_wrapping_mode, livePtr, mode)
  }

  /** TextEdit.get_line_wrapping_mode */
  final def getLineWrappingMode(): gdext.classes.TextEdit.LineWrappingMode = {
    if (gdext.classes.TextEdit.mb_get_line_wrapping_mode == null) gdext.classes.TextEdit.mb_get_line_wrapping_mode = MethodBind.get("TextEdit", "get_line_wrapping_mode", 3562716114L)
    gdext.classes.TextEdit.LineWrappingMode(Ptrcall.call0[Long](gdext.classes.TextEdit.mb_get_line_wrapping_mode, livePtr))
  }

  /** TextEdit.set_autowrap_mode */
  final def setAutowrapMode(autowrapMode: gdext.classes.TextServer.AutowrapMode): Unit = {
    if (gdext.classes.TextEdit.mb_set_autowrap_mode == null) gdext.classes.TextEdit.mb_set_autowrap_mode = MethodBind.get("TextEdit", "set_autowrap_mode", 3289138044L)
    Ptrcall.callVoid1(gdext.classes.TextEdit.mb_set_autowrap_mode, livePtr, autowrapMode)
  }

  /** TextEdit.get_autowrap_mode */
  final def getAutowrapMode(): gdext.classes.TextServer.AutowrapMode = {
    if (gdext.classes.TextEdit.mb_get_autowrap_mode == null) gdext.classes.TextEdit.mb_get_autowrap_mode = MethodBind.get("TextEdit", "get_autowrap_mode", 1549071663L)
    gdext.classes.TextServer.AutowrapMode(Ptrcall.call0[Long](gdext.classes.TextEdit.mb_get_autowrap_mode, livePtr))
  }

  /** TextEdit.is_line_wrapped */
  final def isLineWrapped(line: Long): Boolean = {
    if (gdext.classes.TextEdit.mb_is_line_wrapped == null) gdext.classes.TextEdit.mb_is_line_wrapped = MethodBind.get("TextEdit", "is_line_wrapped", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.TextEdit.mb_is_line_wrapped, livePtr, line)
  }

  /** TextEdit.get_line_wrap_count */
  final def getLineWrapCount(line: Long): Long = {
    if (gdext.classes.TextEdit.mb_get_line_wrap_count == null) gdext.classes.TextEdit.mb_get_line_wrap_count = MethodBind.get("TextEdit", "get_line_wrap_count", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.TextEdit.mb_get_line_wrap_count, livePtr, line)
  }

  /** TextEdit.get_line_wrap_index_at_column */
  final def getLineWrapIndexAtColumn(line: Long, column: Long): Long = {
    if (gdext.classes.TextEdit.mb_get_line_wrap_index_at_column == null) gdext.classes.TextEdit.mb_get_line_wrap_index_at_column = MethodBind.get("TextEdit", "get_line_wrap_index_at_column", 3175239445L)
    Ptrcall.call2[Long, Long, Long](gdext.classes.TextEdit.mb_get_line_wrap_index_at_column, livePtr, line, column)
  }

  /** TextEdit.set_smooth_scroll_enabled */
  final def setSmoothScrollEnabled(enable: Boolean): Unit = {
    if (gdext.classes.TextEdit.mb_set_smooth_scroll_enabled == null) gdext.classes.TextEdit.mb_set_smooth_scroll_enabled = MethodBind.get("TextEdit", "set_smooth_scroll_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TextEdit.mb_set_smooth_scroll_enabled, livePtr, enable)
  }

  /** TextEdit.is_smooth_scroll_enabled */
  final def isSmoothScrollEnabled(): Boolean = {
    if (gdext.classes.TextEdit.mb_is_smooth_scroll_enabled == null) gdext.classes.TextEdit.mb_is_smooth_scroll_enabled = MethodBind.get("TextEdit", "is_smooth_scroll_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TextEdit.mb_is_smooth_scroll_enabled, livePtr)
  }

  /** TextEdit.get_v_scroll_bar */
  final def getVScrollBar(): VScrollBar = {
    if (gdext.classes.TextEdit.mb_get_v_scroll_bar == null) gdext.classes.TextEdit.mb_get_v_scroll_bar = MethodBind.get("TextEdit", "get_v_scroll_bar", 3226026593L)
    Wrappers.borrowed[VScrollBar](Ptrcall.call0[Long](gdext.classes.TextEdit.mb_get_v_scroll_bar, livePtr))
  }

  /** TextEdit.get_h_scroll_bar */
  final def getHScrollBar(): HScrollBar = {
    if (gdext.classes.TextEdit.mb_get_h_scroll_bar == null) gdext.classes.TextEdit.mb_get_h_scroll_bar = MethodBind.get("TextEdit", "get_h_scroll_bar", 3774687988L)
    Wrappers.borrowed[HScrollBar](Ptrcall.call0[Long](gdext.classes.TextEdit.mb_get_h_scroll_bar, livePtr))
  }

  /** TextEdit.set_v_scroll */
  final def setVScroll(value: Double): Unit = {
    if (gdext.classes.TextEdit.mb_set_v_scroll == null) gdext.classes.TextEdit.mb_set_v_scroll = MethodBind.get("TextEdit", "set_v_scroll", 373806689L)
    Ptrcall.callVoid1(gdext.classes.TextEdit.mb_set_v_scroll, livePtr, value)
  }

  /** TextEdit.get_v_scroll */
  final def getVScroll(): Double = {
    if (gdext.classes.TextEdit.mb_get_v_scroll == null) gdext.classes.TextEdit.mb_get_v_scroll = MethodBind.get("TextEdit", "get_v_scroll", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.TextEdit.mb_get_v_scroll, livePtr)
  }

  /** TextEdit.set_h_scroll */
  final def setHScroll(value: Long): Unit = {
    if (gdext.classes.TextEdit.mb_set_h_scroll == null) gdext.classes.TextEdit.mb_set_h_scroll = MethodBind.get("TextEdit", "set_h_scroll", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.TextEdit.mb_set_h_scroll, livePtr, value)
  }

  /** TextEdit.get_h_scroll */
  final def getHScroll(): Long = {
    if (gdext.classes.TextEdit.mb_get_h_scroll == null) gdext.classes.TextEdit.mb_get_h_scroll = MethodBind.get("TextEdit", "get_h_scroll", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.TextEdit.mb_get_h_scroll, livePtr)
  }

  /** TextEdit.set_scroll_past_end_of_file_enabled */
  final def setScrollPastEndOfFileEnabled(enable: Boolean): Unit = {
    if (gdext.classes.TextEdit.mb_set_scroll_past_end_of_file_enabled == null) gdext.classes.TextEdit.mb_set_scroll_past_end_of_file_enabled = MethodBind.get("TextEdit", "set_scroll_past_end_of_file_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TextEdit.mb_set_scroll_past_end_of_file_enabled, livePtr, enable)
  }

  /** TextEdit.is_scroll_past_end_of_file_enabled */
  final def isScrollPastEndOfFileEnabled(): Boolean = {
    if (gdext.classes.TextEdit.mb_is_scroll_past_end_of_file_enabled == null) gdext.classes.TextEdit.mb_is_scroll_past_end_of_file_enabled = MethodBind.get("TextEdit", "is_scroll_past_end_of_file_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TextEdit.mb_is_scroll_past_end_of_file_enabled, livePtr)
  }

  /** TextEdit.set_v_scroll_speed */
  final def setVScrollSpeed(speed: Double): Unit = {
    if (gdext.classes.TextEdit.mb_set_v_scroll_speed == null) gdext.classes.TextEdit.mb_set_v_scroll_speed = MethodBind.get("TextEdit", "set_v_scroll_speed", 373806689L)
    Ptrcall.callVoid1(gdext.classes.TextEdit.mb_set_v_scroll_speed, livePtr, speed)
  }

  /** TextEdit.get_v_scroll_speed */
  final def getVScrollSpeed(): Double = {
    if (gdext.classes.TextEdit.mb_get_v_scroll_speed == null) gdext.classes.TextEdit.mb_get_v_scroll_speed = MethodBind.get("TextEdit", "get_v_scroll_speed", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.TextEdit.mb_get_v_scroll_speed, livePtr)
  }

  /** TextEdit.set_fit_content_height_enabled */
  final def setFitContentHeightEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.TextEdit.mb_set_fit_content_height_enabled == null) gdext.classes.TextEdit.mb_set_fit_content_height_enabled = MethodBind.get("TextEdit", "set_fit_content_height_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TextEdit.mb_set_fit_content_height_enabled, livePtr, enabled)
  }

  /** TextEdit.is_fit_content_height_enabled */
  final def isFitContentHeightEnabled(): Boolean = {
    if (gdext.classes.TextEdit.mb_is_fit_content_height_enabled == null) gdext.classes.TextEdit.mb_is_fit_content_height_enabled = MethodBind.get("TextEdit", "is_fit_content_height_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TextEdit.mb_is_fit_content_height_enabled, livePtr)
  }

  /** TextEdit.set_fit_content_width_enabled */
  final def setFitContentWidthEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.TextEdit.mb_set_fit_content_width_enabled == null) gdext.classes.TextEdit.mb_set_fit_content_width_enabled = MethodBind.get("TextEdit", "set_fit_content_width_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TextEdit.mb_set_fit_content_width_enabled, livePtr, enabled)
  }

  /** TextEdit.is_fit_content_width_enabled */
  final def isFitContentWidthEnabled(): Boolean = {
    if (gdext.classes.TextEdit.mb_is_fit_content_width_enabled == null) gdext.classes.TextEdit.mb_is_fit_content_width_enabled = MethodBind.get("TextEdit", "is_fit_content_width_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TextEdit.mb_is_fit_content_width_enabled, livePtr)
  }

  /** TextEdit.get_scroll_pos_for_line */
  final def getScrollPosForLine(line: Long, wrapIndex: Long = 0L): Double = {
    if (gdext.classes.TextEdit.mb_get_scroll_pos_for_line == null) gdext.classes.TextEdit.mb_get_scroll_pos_for_line = MethodBind.get("TextEdit", "get_scroll_pos_for_line", 3929084198L)
    Ptrcall.call2[Long, Long, Double](gdext.classes.TextEdit.mb_get_scroll_pos_for_line, livePtr, line, wrapIndex)
  }

  /** TextEdit.set_line_as_first_visible */
  final def setLineAsFirstVisible(line: Long, wrapIndex: Long = 0L): Unit = {
    if (gdext.classes.TextEdit.mb_set_line_as_first_visible == null) gdext.classes.TextEdit.mb_set_line_as_first_visible = MethodBind.get("TextEdit", "set_line_as_first_visible", 2230941749L)
    Ptrcall.callVoid2(gdext.classes.TextEdit.mb_set_line_as_first_visible, livePtr, line, wrapIndex)
  }

  /** TextEdit.get_first_visible_line */
  final def getFirstVisibleLine(): Long = {
    if (gdext.classes.TextEdit.mb_get_first_visible_line == null) gdext.classes.TextEdit.mb_get_first_visible_line = MethodBind.get("TextEdit", "get_first_visible_line", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.TextEdit.mb_get_first_visible_line, livePtr)
  }

  /** TextEdit.set_line_as_center_visible */
  final def setLineAsCenterVisible(line: Long, wrapIndex: Long = 0L): Unit = {
    if (gdext.classes.TextEdit.mb_set_line_as_center_visible == null) gdext.classes.TextEdit.mb_set_line_as_center_visible = MethodBind.get("TextEdit", "set_line_as_center_visible", 2230941749L)
    Ptrcall.callVoid2(gdext.classes.TextEdit.mb_set_line_as_center_visible, livePtr, line, wrapIndex)
  }

  /** TextEdit.set_line_as_last_visible */
  final def setLineAsLastVisible(line: Long, wrapIndex: Long = 0L): Unit = {
    if (gdext.classes.TextEdit.mb_set_line_as_last_visible == null) gdext.classes.TextEdit.mb_set_line_as_last_visible = MethodBind.get("TextEdit", "set_line_as_last_visible", 2230941749L)
    Ptrcall.callVoid2(gdext.classes.TextEdit.mb_set_line_as_last_visible, livePtr, line, wrapIndex)
  }

  /** TextEdit.get_last_full_visible_line */
  final def getLastFullVisibleLine(): Long = {
    if (gdext.classes.TextEdit.mb_get_last_full_visible_line == null) gdext.classes.TextEdit.mb_get_last_full_visible_line = MethodBind.get("TextEdit", "get_last_full_visible_line", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.TextEdit.mb_get_last_full_visible_line, livePtr)
  }

  /** TextEdit.get_last_full_visible_line_wrap_index */
  final def getLastFullVisibleLineWrapIndex(): Long = {
    if (gdext.classes.TextEdit.mb_get_last_full_visible_line_wrap_index == null) gdext.classes.TextEdit.mb_get_last_full_visible_line_wrap_index = MethodBind.get("TextEdit", "get_last_full_visible_line_wrap_index", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.TextEdit.mb_get_last_full_visible_line_wrap_index, livePtr)
  }

  /** TextEdit.get_visible_line_count */
  final def getVisibleLineCount(): Long = {
    if (gdext.classes.TextEdit.mb_get_visible_line_count == null) gdext.classes.TextEdit.mb_get_visible_line_count = MethodBind.get("TextEdit", "get_visible_line_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.TextEdit.mb_get_visible_line_count, livePtr)
  }

  /** TextEdit.get_visible_line_count_in_range */
  final def getVisibleLineCountInRange(fromLine: Long, toLine: Long): Long = {
    if (gdext.classes.TextEdit.mb_get_visible_line_count_in_range == null) gdext.classes.TextEdit.mb_get_visible_line_count_in_range = MethodBind.get("TextEdit", "get_visible_line_count_in_range", 3175239445L)
    Ptrcall.call2[Long, Long, Long](gdext.classes.TextEdit.mb_get_visible_line_count_in_range, livePtr, fromLine, toLine)
  }

  /** TextEdit.get_total_visible_line_count */
  final def getTotalVisibleLineCount(): Long = {
    if (gdext.classes.TextEdit.mb_get_total_visible_line_count == null) gdext.classes.TextEdit.mb_get_total_visible_line_count = MethodBind.get("TextEdit", "get_total_visible_line_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.TextEdit.mb_get_total_visible_line_count, livePtr)
  }

  /** TextEdit.adjust_viewport_to_caret */
  final def adjustViewportToCaret(caretIndex: Long = 0L): Unit = {
    if (gdext.classes.TextEdit.mb_adjust_viewport_to_caret == null) gdext.classes.TextEdit.mb_adjust_viewport_to_caret = MethodBind.get("TextEdit", "adjust_viewport_to_caret", 1995695955L)
    Ptrcall.callVoid1(gdext.classes.TextEdit.mb_adjust_viewport_to_caret, livePtr, caretIndex)
  }

  /** TextEdit.center_viewport_to_caret */
  final def centerViewportToCaret(caretIndex: Long = 0L): Unit = {
    if (gdext.classes.TextEdit.mb_center_viewport_to_caret == null) gdext.classes.TextEdit.mb_center_viewport_to_caret = MethodBind.get("TextEdit", "center_viewport_to_caret", 1995695955L)
    Ptrcall.callVoid1(gdext.classes.TextEdit.mb_center_viewport_to_caret, livePtr, caretIndex)
  }

  /** TextEdit.set_draw_minimap */
  final def setDrawMinimap(enabled: Boolean): Unit = {
    if (gdext.classes.TextEdit.mb_set_draw_minimap == null) gdext.classes.TextEdit.mb_set_draw_minimap = MethodBind.get("TextEdit", "set_draw_minimap", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TextEdit.mb_set_draw_minimap, livePtr, enabled)
  }

  /** TextEdit.is_drawing_minimap */
  final def isDrawingMinimap(): Boolean = {
    if (gdext.classes.TextEdit.mb_is_drawing_minimap == null) gdext.classes.TextEdit.mb_is_drawing_minimap = MethodBind.get("TextEdit", "is_drawing_minimap", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TextEdit.mb_is_drawing_minimap, livePtr)
  }

  /** TextEdit.set_minimap_width */
  final def setMinimapWidth(width: Long): Unit = {
    if (gdext.classes.TextEdit.mb_set_minimap_width == null) gdext.classes.TextEdit.mb_set_minimap_width = MethodBind.get("TextEdit", "set_minimap_width", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.TextEdit.mb_set_minimap_width, livePtr, width)
  }

  /** TextEdit.get_minimap_width */
  final def getMinimapWidth(): Long = {
    if (gdext.classes.TextEdit.mb_get_minimap_width == null) gdext.classes.TextEdit.mb_get_minimap_width = MethodBind.get("TextEdit", "get_minimap_width", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.TextEdit.mb_get_minimap_width, livePtr)
  }

  /** TextEdit.get_minimap_visible_lines */
  final def getMinimapVisibleLines(): Long = {
    if (gdext.classes.TextEdit.mb_get_minimap_visible_lines == null) gdext.classes.TextEdit.mb_get_minimap_visible_lines = MethodBind.get("TextEdit", "get_minimap_visible_lines", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.TextEdit.mb_get_minimap_visible_lines, livePtr)
  }

  /** TextEdit.add_gutter */
  final def addGutter(at: Long = -1L): Unit = {
    if (gdext.classes.TextEdit.mb_add_gutter == null) gdext.classes.TextEdit.mb_add_gutter = MethodBind.get("TextEdit", "add_gutter", 1025054187L)
    Ptrcall.callVoid1(gdext.classes.TextEdit.mb_add_gutter, livePtr, at)
  }

  /** TextEdit.remove_gutter */
  final def removeGutter(gutter: Long): Unit = {
    if (gdext.classes.TextEdit.mb_remove_gutter == null) gdext.classes.TextEdit.mb_remove_gutter = MethodBind.get("TextEdit", "remove_gutter", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.TextEdit.mb_remove_gutter, livePtr, gutter)
  }

  /** TextEdit.get_gutter_count */
  final def getGutterCount(): Long = {
    if (gdext.classes.TextEdit.mb_get_gutter_count == null) gdext.classes.TextEdit.mb_get_gutter_count = MethodBind.get("TextEdit", "get_gutter_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.TextEdit.mb_get_gutter_count, livePtr)
  }

  /** TextEdit.set_gutter_name */
  final def setGutterName(gutter: Long, name: String): Unit = {
    if (gdext.classes.TextEdit.mb_set_gutter_name == null) gdext.classes.TextEdit.mb_set_gutter_name = MethodBind.get("TextEdit", "set_gutter_name", 501894301L)
    Ptrcall.callVoid2(gdext.classes.TextEdit.mb_set_gutter_name, livePtr, gutter, name)
  }

  /** TextEdit.get_gutter_name */
  final def getGutterName(gutter: Long): String = {
    if (gdext.classes.TextEdit.mb_get_gutter_name == null) gdext.classes.TextEdit.mb_get_gutter_name = MethodBind.get("TextEdit", "get_gutter_name", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.TextEdit.mb_get_gutter_name, livePtr, gutter)
  }

  /** TextEdit.set_gutter_type */
  final def setGutterType(gutter: Long, `type`: gdext.classes.TextEdit.GutterType): Unit = {
    if (gdext.classes.TextEdit.mb_set_gutter_type == null) gdext.classes.TextEdit.mb_set_gutter_type = MethodBind.get("TextEdit", "set_gutter_type", 1088959071L)
    Ptrcall.callVoid2(gdext.classes.TextEdit.mb_set_gutter_type, livePtr, gutter, `type`)
  }

  /** TextEdit.get_gutter_type */
  final def getGutterType(gutter: Long): gdext.classes.TextEdit.GutterType = {
    if (gdext.classes.TextEdit.mb_get_gutter_type == null) gdext.classes.TextEdit.mb_get_gutter_type = MethodBind.get("TextEdit", "get_gutter_type", 1159699127L)
    gdext.classes.TextEdit.GutterType(Ptrcall.call1[Long, Long](gdext.classes.TextEdit.mb_get_gutter_type, livePtr, gutter))
  }

  /** TextEdit.set_gutter_width */
  final def setGutterWidth(gutter: Long, width: Long): Unit = {
    if (gdext.classes.TextEdit.mb_set_gutter_width == null) gdext.classes.TextEdit.mb_set_gutter_width = MethodBind.get("TextEdit", "set_gutter_width", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.TextEdit.mb_set_gutter_width, livePtr, gutter, width)
  }

  /** TextEdit.get_gutter_width */
  final def getGutterWidth(gutter: Long): Long = {
    if (gdext.classes.TextEdit.mb_get_gutter_width == null) gdext.classes.TextEdit.mb_get_gutter_width = MethodBind.get("TextEdit", "get_gutter_width", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.TextEdit.mb_get_gutter_width, livePtr, gutter)
  }

  /** TextEdit.set_gutter_draw */
  final def setGutterDraw(gutter: Long, draw: Boolean): Unit = {
    if (gdext.classes.TextEdit.mb_set_gutter_draw == null) gdext.classes.TextEdit.mb_set_gutter_draw = MethodBind.get("TextEdit", "set_gutter_draw", 300928843L)
    Ptrcall.callVoid2(gdext.classes.TextEdit.mb_set_gutter_draw, livePtr, gutter, draw)
  }

  /** TextEdit.is_gutter_drawn */
  final def isGutterDrawn(gutter: Long): Boolean = {
    if (gdext.classes.TextEdit.mb_is_gutter_drawn == null) gdext.classes.TextEdit.mb_is_gutter_drawn = MethodBind.get("TextEdit", "is_gutter_drawn", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.TextEdit.mb_is_gutter_drawn, livePtr, gutter)
  }

  /** TextEdit.set_gutter_clickable */
  final def setGutterClickable(gutter: Long, clickable: Boolean): Unit = {
    if (gdext.classes.TextEdit.mb_set_gutter_clickable == null) gdext.classes.TextEdit.mb_set_gutter_clickable = MethodBind.get("TextEdit", "set_gutter_clickable", 300928843L)
    Ptrcall.callVoid2(gdext.classes.TextEdit.mb_set_gutter_clickable, livePtr, gutter, clickable)
  }

  /** TextEdit.is_gutter_clickable */
  final def isGutterClickable(gutter: Long): Boolean = {
    if (gdext.classes.TextEdit.mb_is_gutter_clickable == null) gdext.classes.TextEdit.mb_is_gutter_clickable = MethodBind.get("TextEdit", "is_gutter_clickable", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.TextEdit.mb_is_gutter_clickable, livePtr, gutter)
  }

  /** TextEdit.set_gutter_overwritable */
  final def setGutterOverwritable(gutter: Long, overwritable: Boolean): Unit = {
    if (gdext.classes.TextEdit.mb_set_gutter_overwritable == null) gdext.classes.TextEdit.mb_set_gutter_overwritable = MethodBind.get("TextEdit", "set_gutter_overwritable", 300928843L)
    Ptrcall.callVoid2(gdext.classes.TextEdit.mb_set_gutter_overwritable, livePtr, gutter, overwritable)
  }

  /** TextEdit.is_gutter_overwritable */
  final def isGutterOverwritable(gutter: Long): Boolean = {
    if (gdext.classes.TextEdit.mb_is_gutter_overwritable == null) gdext.classes.TextEdit.mb_is_gutter_overwritable = MethodBind.get("TextEdit", "is_gutter_overwritable", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.TextEdit.mb_is_gutter_overwritable, livePtr, gutter)
  }

  /** TextEdit.merge_gutters */
  final def mergeGutters(fromLine: Long, toLine: Long): Unit = {
    if (gdext.classes.TextEdit.mb_merge_gutters == null) gdext.classes.TextEdit.mb_merge_gutters = MethodBind.get("TextEdit", "merge_gutters", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.TextEdit.mb_merge_gutters, livePtr, fromLine, toLine)
  }

  /** TextEdit.get_total_gutter_width */
  final def getTotalGutterWidth(): Long = {
    if (gdext.classes.TextEdit.mb_get_total_gutter_width == null) gdext.classes.TextEdit.mb_get_total_gutter_width = MethodBind.get("TextEdit", "get_total_gutter_width", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.TextEdit.mb_get_total_gutter_width, livePtr)
  }

  /** TextEdit.set_line_gutter_text */
  final def setLineGutterText(line: Long, gutter: Long, text: String): Unit = {
    if (gdext.classes.TextEdit.mb_set_line_gutter_text == null) gdext.classes.TextEdit.mb_set_line_gutter_text = MethodBind.get("TextEdit", "set_line_gutter_text", 2285447957L)
    Ptrcall.callVoid3(gdext.classes.TextEdit.mb_set_line_gutter_text, livePtr, line, gutter, text)
  }

  /** TextEdit.get_line_gutter_text */
  final def getLineGutterText(line: Long, gutter: Long): String = {
    if (gdext.classes.TextEdit.mb_get_line_gutter_text == null) gdext.classes.TextEdit.mb_get_line_gutter_text = MethodBind.get("TextEdit", "get_line_gutter_text", 1391810591L)
    Ptrcall.call2[Long, Long, String](gdext.classes.TextEdit.mb_get_line_gutter_text, livePtr, line, gutter)
  }

  /** TextEdit.set_line_gutter_icon */
  final def setLineGutterIcon(line: Long, gutter: Long, icon: Texture2D): Unit = {
    if (gdext.classes.TextEdit.mb_set_line_gutter_icon == null) gdext.classes.TextEdit.mb_set_line_gutter_icon = MethodBind.get("TextEdit", "set_line_gutter_icon", 176101966L)
    Ptrcall.callVoid3(gdext.classes.TextEdit.mb_set_line_gutter_icon, livePtr, line, gutter, Wrappers.handle(icon))
  }

  /** TextEdit.get_line_gutter_icon. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getLineGutterIcon(line: Long, gutter: Long): Texture2D = {
    if (gdext.classes.TextEdit.mb_get_line_gutter_icon == null) gdext.classes.TextEdit.mb_get_line_gutter_icon = MethodBind.get("TextEdit", "get_line_gutter_icon", 2584904275L)
    Wrappers.owned[Texture2D](Ptrcall.call2[Long, Long, Long](gdext.classes.TextEdit.mb_get_line_gutter_icon, livePtr, line, gutter))
  }

  /** TextEdit.set_line_gutter_item_color */
  final def setLineGutterItemColor(line: Long, gutter: Long, color: gdext.builtin.Color): Unit = {
    if (gdext.classes.TextEdit.mb_set_line_gutter_item_color == null) gdext.classes.TextEdit.mb_set_line_gutter_item_color = MethodBind.get("TextEdit", "set_line_gutter_item_color", 3733378741L)
    Ptrcall.callVoid3(gdext.classes.TextEdit.mb_set_line_gutter_item_color, livePtr, line, gutter, color)
  }

  /** TextEdit.get_line_gutter_item_color */
  final def getLineGutterItemColor(line: Long, gutter: Long): gdext.builtin.Color = {
    if (gdext.classes.TextEdit.mb_get_line_gutter_item_color == null) gdext.classes.TextEdit.mb_get_line_gutter_item_color = MethodBind.get("TextEdit", "get_line_gutter_item_color", 2165839948L)
    Ptrcall.call2[Long, Long, gdext.builtin.Color](gdext.classes.TextEdit.mb_get_line_gutter_item_color, livePtr, line, gutter)
  }

  /** TextEdit.set_line_gutter_clickable */
  final def setLineGutterClickable(line: Long, gutter: Long, clickable: Boolean): Unit = {
    if (gdext.classes.TextEdit.mb_set_line_gutter_clickable == null) gdext.classes.TextEdit.mb_set_line_gutter_clickable = MethodBind.get("TextEdit", "set_line_gutter_clickable", 1383440665L)
    Ptrcall.callVoid3(gdext.classes.TextEdit.mb_set_line_gutter_clickable, livePtr, line, gutter, clickable)
  }

  /** TextEdit.is_line_gutter_clickable */
  final def isLineGutterClickable(line: Long, gutter: Long): Boolean = {
    if (gdext.classes.TextEdit.mb_is_line_gutter_clickable == null) gdext.classes.TextEdit.mb_is_line_gutter_clickable = MethodBind.get("TextEdit", "is_line_gutter_clickable", 2522259332L)
    Ptrcall.call2[Long, Long, Boolean](gdext.classes.TextEdit.mb_is_line_gutter_clickable, livePtr, line, gutter)
  }

  /** TextEdit.set_line_background_color */
  final def setLineBackgroundColor(line: Long, color: gdext.builtin.Color): Unit = {
    if (gdext.classes.TextEdit.mb_set_line_background_color == null) gdext.classes.TextEdit.mb_set_line_background_color = MethodBind.get("TextEdit", "set_line_background_color", 2878471219L)
    Ptrcall.callVoid2(gdext.classes.TextEdit.mb_set_line_background_color, livePtr, line, color)
  }

  /** TextEdit.get_line_background_color */
  final def getLineBackgroundColor(line: Long): gdext.builtin.Color = {
    if (gdext.classes.TextEdit.mb_get_line_background_color == null) gdext.classes.TextEdit.mb_get_line_background_color = MethodBind.get("TextEdit", "get_line_background_color", 3457211756L)
    Ptrcall.call1[Long, gdext.builtin.Color](gdext.classes.TextEdit.mb_get_line_background_color, livePtr, line)
  }

  /** TextEdit.set_syntax_highlighter */
  final def setSyntaxHighlighter(syntaxHighlighter: SyntaxHighlighter): Unit = {
    if (gdext.classes.TextEdit.mb_set_syntax_highlighter == null) gdext.classes.TextEdit.mb_set_syntax_highlighter = MethodBind.get("TextEdit", "set_syntax_highlighter", 2765644541L)
    Ptrcall.callVoid1(gdext.classes.TextEdit.mb_set_syntax_highlighter, livePtr, Wrappers.handle(syntaxHighlighter))
  }

  /** TextEdit.get_syntax_highlighter. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getSyntaxHighlighter(): SyntaxHighlighter = {
    if (gdext.classes.TextEdit.mb_get_syntax_highlighter == null) gdext.classes.TextEdit.mb_get_syntax_highlighter = MethodBind.get("TextEdit", "get_syntax_highlighter", 2721131626L)
    Wrappers.owned[SyntaxHighlighter](Ptrcall.call0[Long](gdext.classes.TextEdit.mb_get_syntax_highlighter, livePtr))
  }

  /** TextEdit.set_highlight_current_line */
  final def setHighlightCurrentLine(enabled: Boolean): Unit = {
    if (gdext.classes.TextEdit.mb_set_highlight_current_line == null) gdext.classes.TextEdit.mb_set_highlight_current_line = MethodBind.get("TextEdit", "set_highlight_current_line", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TextEdit.mb_set_highlight_current_line, livePtr, enabled)
  }

  /** TextEdit.is_highlight_current_line_enabled */
  final def isHighlightCurrentLineEnabled(): Boolean = {
    if (gdext.classes.TextEdit.mb_is_highlight_current_line_enabled == null) gdext.classes.TextEdit.mb_is_highlight_current_line_enabled = MethodBind.get("TextEdit", "is_highlight_current_line_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TextEdit.mb_is_highlight_current_line_enabled, livePtr)
  }

  /** TextEdit.set_highlight_all_occurrences */
  final def setHighlightAllOccurrences(enabled: Boolean): Unit = {
    if (gdext.classes.TextEdit.mb_set_highlight_all_occurrences == null) gdext.classes.TextEdit.mb_set_highlight_all_occurrences = MethodBind.get("TextEdit", "set_highlight_all_occurrences", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TextEdit.mb_set_highlight_all_occurrences, livePtr, enabled)
  }

  /** TextEdit.is_highlight_all_occurrences_enabled */
  final def isHighlightAllOccurrencesEnabled(): Boolean = {
    if (gdext.classes.TextEdit.mb_is_highlight_all_occurrences_enabled == null) gdext.classes.TextEdit.mb_is_highlight_all_occurrences_enabled = MethodBind.get("TextEdit", "is_highlight_all_occurrences_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TextEdit.mb_is_highlight_all_occurrences_enabled, livePtr)
  }

  /** TextEdit.get_draw_control_chars */
  final def getDrawControlChars(): Boolean = {
    if (gdext.classes.TextEdit.mb_get_draw_control_chars == null) gdext.classes.TextEdit.mb_get_draw_control_chars = MethodBind.get("TextEdit", "get_draw_control_chars", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TextEdit.mb_get_draw_control_chars, livePtr)
  }

  /** TextEdit.set_draw_control_chars */
  final def setDrawControlChars(enabled: Boolean): Unit = {
    if (gdext.classes.TextEdit.mb_set_draw_control_chars == null) gdext.classes.TextEdit.mb_set_draw_control_chars = MethodBind.get("TextEdit", "set_draw_control_chars", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TextEdit.mb_set_draw_control_chars, livePtr, enabled)
  }

  /** TextEdit.set_draw_tabs */
  final def setDrawTabs(enabled: Boolean): Unit = {
    if (gdext.classes.TextEdit.mb_set_draw_tabs == null) gdext.classes.TextEdit.mb_set_draw_tabs = MethodBind.get("TextEdit", "set_draw_tabs", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TextEdit.mb_set_draw_tabs, livePtr, enabled)
  }

  /** TextEdit.is_drawing_tabs */
  final def isDrawingTabs(): Boolean = {
    if (gdext.classes.TextEdit.mb_is_drawing_tabs == null) gdext.classes.TextEdit.mb_is_drawing_tabs = MethodBind.get("TextEdit", "is_drawing_tabs", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TextEdit.mb_is_drawing_tabs, livePtr)
  }

  /** TextEdit.set_draw_spaces */
  final def setDrawSpaces(enabled: Boolean): Unit = {
    if (gdext.classes.TextEdit.mb_set_draw_spaces == null) gdext.classes.TextEdit.mb_set_draw_spaces = MethodBind.get("TextEdit", "set_draw_spaces", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TextEdit.mb_set_draw_spaces, livePtr, enabled)
  }

  /** TextEdit.is_drawing_spaces */
  final def isDrawingSpaces(): Boolean = {
    if (gdext.classes.TextEdit.mb_is_drawing_spaces == null) gdext.classes.TextEdit.mb_is_drawing_spaces = MethodBind.get("TextEdit", "is_drawing_spaces", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TextEdit.mb_is_drawing_spaces, livePtr)
  }

  /** TextEdit.get_menu */
  final def getMenu(): PopupMenu = {
    if (gdext.classes.TextEdit.mb_get_menu == null) gdext.classes.TextEdit.mb_get_menu = MethodBind.get("TextEdit", "get_menu", 229722558L)
    Wrappers.borrowed[PopupMenu](Ptrcall.call0[Long](gdext.classes.TextEdit.mb_get_menu, livePtr))
  }

  /** TextEdit.is_menu_visible */
  final def isMenuVisible(): Boolean = {
    if (gdext.classes.TextEdit.mb_is_menu_visible == null) gdext.classes.TextEdit.mb_is_menu_visible = MethodBind.get("TextEdit", "is_menu_visible", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TextEdit.mb_is_menu_visible, livePtr)
  }

  /** TextEdit.menu_option */
  final def menuOption(option: Long): Unit = {
    if (gdext.classes.TextEdit.mb_menu_option == null) gdext.classes.TextEdit.mb_menu_option = MethodBind.get("TextEdit", "menu_option", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.TextEdit.mb_menu_option, livePtr, option)
  }

  /** TextEdit.adjust_carets_after_edit */
  final def adjustCaretsAfterEdit(caret: Long, fromLine: Long, fromCol: Long, toLine: Long, toCol: Long): Unit = {
    if (gdext.classes.TextEdit.mb_adjust_carets_after_edit == null) gdext.classes.TextEdit.mb_adjust_carets_after_edit = MethodBind.get("TextEdit", "adjust_carets_after_edit", 1770277138L)
    Ptrcall.callVoid5(gdext.classes.TextEdit.mb_adjust_carets_after_edit, livePtr, caret, fromLine, fromCol, toLine, toCol)
  }

  /** TextEdit.get_selection_line */
  final def getSelectionLine(caretIndex: Long = 0L): Long = {
    if (gdext.classes.TextEdit.mb_get_selection_line == null) gdext.classes.TextEdit.mb_get_selection_line = MethodBind.get("TextEdit", "get_selection_line", 1591665591L)
    Ptrcall.call1[Long, Long](gdext.classes.TextEdit.mb_get_selection_line, livePtr, caretIndex)
  }

  /** TextEdit.get_selection_column */
  final def getSelectionColumn(caretIndex: Long = 0L): Long = {
    if (gdext.classes.TextEdit.mb_get_selection_column == null) gdext.classes.TextEdit.mb_get_selection_column = MethodBind.get("TextEdit", "get_selection_column", 1591665591L)
    Ptrcall.call1[Long, Long](gdext.classes.TextEdit.mb_get_selection_column, livePtr, caretIndex)
  }

}

object TextEdit {
  private[classes] var mb_has_ime_text: GDExtensionMethodBindPtr = null
  private[classes] var mb_cancel_ime: GDExtensionMethodBindPtr = null
  private[classes] var mb_apply_ime: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_editable: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_editable: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_text_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_text_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_language: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_language: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_structured_text_bidi_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_structured_text_bidi_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tab_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tab_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_indent_wrapped_lines: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_indent_wrapped_lines: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tab_input_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tab_input_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_overtype_mode_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_overtype_mode_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_context_menu_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_context_menu_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_emoji_menu_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_emoji_menu_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_backspace_deletes_composite_character_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_backspace_deletes_composite_character_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_shortcut_keys_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_shortcut_keys_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_virtual_keyboard_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_virtual_keyboard_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_virtual_keyboard_show_on_focus: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_virtual_keyboard_show_on_focus: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_middle_mouse_paste_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_middle_mouse_paste_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_empty_selection_clipboard_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_empty_selection_clipboard_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_text: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_text: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_line_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_placeholder: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_placeholder: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_line: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_line: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_line_with_ime: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_line_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_line_height: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_indent_level: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_first_non_whitespace_column: GDExtensionMethodBindPtr = null
  private[classes] var mb_swap_lines: GDExtensionMethodBindPtr = null
  private[classes] var mb_insert_line_at: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_line_at: GDExtensionMethodBindPtr = null
  private[classes] var mb_insert_text_at_caret: GDExtensionMethodBindPtr = null
  private[classes] var mb_insert_text: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_text: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_last_unhidden_line: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_next_visible_line_offset_from: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_next_visible_line_index_offset_from: GDExtensionMethodBindPtr = null
  private[classes] var mb_backspace: GDExtensionMethodBindPtr = null
  private[classes] var mb_cut: GDExtensionMethodBindPtr = null
  private[classes] var mb_copy: GDExtensionMethodBindPtr = null
  private[classes] var mb_paste: GDExtensionMethodBindPtr = null
  private[classes] var mb_paste_primary_clipboard: GDExtensionMethodBindPtr = null
  private[classes] var mb_start_action: GDExtensionMethodBindPtr = null
  private[classes] var mb_end_action: GDExtensionMethodBindPtr = null
  private[classes] var mb_begin_complex_operation: GDExtensionMethodBindPtr = null
  private[classes] var mb_end_complex_operation: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_undo: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_redo: GDExtensionMethodBindPtr = null
  private[classes] var mb_undo: GDExtensionMethodBindPtr = null
  private[classes] var mb_redo: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_undo_history: GDExtensionMethodBindPtr = null
  private[classes] var mb_tag_saved_version: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_version: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_saved_version: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_search_text: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_search_flags: GDExtensionMethodBindPtr = null
  private[classes] var mb_search: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_local_mouse_pos: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_word_at_pos: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_line_column_at_pos: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_pos_at_line_column: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_rect_at_line_column: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_minimap_line_at_pos: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_dragging_cursor: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_mouse_over_selection: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_caret_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_caret_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_caret_blink_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_caret_blink_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_caret_blink_interval: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_caret_blink_interval: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_draw_caret_when_editable_disabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_drawing_caret_when_editable_disabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_move_caret_on_right_click_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_move_caret_on_right_click_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_caret_mid_grapheme_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_caret_mid_grapheme_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_multiple_carets_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_multiple_carets_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_caret: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_caret: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_secondary_carets: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_caret_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_caret_at_carets: GDExtensionMethodBindPtr = null
  private[classes] var mb_collapse_carets: GDExtensionMethodBindPtr = null
  private[classes] var mb_merge_overlapping_carets: GDExtensionMethodBindPtr = null
  private[classes] var mb_begin_multicaret_edit: GDExtensionMethodBindPtr = null
  private[classes] var mb_end_multicaret_edit: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_in_mulitcaret_edit: GDExtensionMethodBindPtr = null
  private[classes] var mb_multicaret_edit_ignore_caret: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_caret_visible: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_caret_draw_pos: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_caret_line: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_caret_line: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_caret_column: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_caret_column: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_next_composite_character_column: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_previous_composite_character_column: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_caret_wrap_index: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_word_under_caret: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_use_default_word_separators: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_default_word_separators_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_use_custom_word_separators: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_custom_word_separators_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_custom_word_separators: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_custom_word_separators: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_selecting_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_selecting_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_deselect_on_focus_loss_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_deselect_on_focus_loss_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_drag_and_drop_selection_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_drag_and_drop_selection_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_selection_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_selection_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_select_all: GDExtensionMethodBindPtr = null
  private[classes] var mb_select_word_under_caret: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_selection_for_next_occurrence: GDExtensionMethodBindPtr = null
  private[classes] var mb_skip_selection_for_next_occurrence: GDExtensionMethodBindPtr = null
  private[classes] var mb_select: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_selection: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_selected_text: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_selection_at_line_column: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_selection_origin_line: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_selection_origin_column: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_selection_origin_line: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_selection_origin_column: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_selection_from_line: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_selection_from_column: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_selection_to_line: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_selection_to_column: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_caret_after_selection_origin: GDExtensionMethodBindPtr = null
  private[classes] var mb_deselect: GDExtensionMethodBindPtr = null
  private[classes] var mb_delete_selection: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_line_wrapping_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_line_wrapping_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_autowrap_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_autowrap_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_line_wrapped: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_line_wrap_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_line_wrap_index_at_column: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_smooth_scroll_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_smooth_scroll_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_v_scroll_bar: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_h_scroll_bar: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_v_scroll: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_v_scroll: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_h_scroll: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_h_scroll: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_scroll_past_end_of_file_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_scroll_past_end_of_file_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_v_scroll_speed: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_v_scroll_speed: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_fit_content_height_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_fit_content_height_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_fit_content_width_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_fit_content_width_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_scroll_pos_for_line: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_line_as_first_visible: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_first_visible_line: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_line_as_center_visible: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_line_as_last_visible: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_last_full_visible_line: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_last_full_visible_line_wrap_index: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_visible_line_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_visible_line_count_in_range: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_total_visible_line_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_adjust_viewport_to_caret: GDExtensionMethodBindPtr = null
  private[classes] var mb_center_viewport_to_caret: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_draw_minimap: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_drawing_minimap: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_minimap_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_minimap_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_minimap_visible_lines: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_gutter: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_gutter: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_gutter_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_gutter_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_gutter_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_gutter_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_gutter_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_gutter_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_gutter_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_gutter_draw: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_gutter_drawn: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_gutter_clickable: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_gutter_clickable: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_gutter_overwritable: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_gutter_overwritable: GDExtensionMethodBindPtr = null
  private[classes] var mb_merge_gutters: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_total_gutter_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_line_gutter_text: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_line_gutter_text: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_line_gutter_icon: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_line_gutter_icon: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_line_gutter_item_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_line_gutter_item_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_line_gutter_clickable: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_line_gutter_clickable: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_line_background_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_line_background_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_syntax_highlighter: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_syntax_highlighter: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_highlight_current_line: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_highlight_current_line_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_highlight_all_occurrences: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_highlight_all_occurrences_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_draw_control_chars: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_draw_control_chars: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_draw_tabs: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_drawing_tabs: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_draw_spaces: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_drawing_spaces: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_menu: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_menu_visible: GDExtensionMethodBindPtr = null
  private[classes] var mb_menu_option: GDExtensionMethodBindPtr = null
  private[classes] var mb_adjust_carets_after_edit: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_selection_line: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_selection_column: GDExtensionMethodBindPtr = null

  /** Godot enum `TextEdit.MenuItems`. */
  opaque type MenuItems <: Long = Long

  object MenuItems {
    final val Cut: MenuItems = 0L.asInstanceOf[MenuItems]
    final val Copy: MenuItems = 1L.asInstanceOf[MenuItems]
    final val Paste: MenuItems = 2L.asInstanceOf[MenuItems]
    final val Clear: MenuItems = 3L.asInstanceOf[MenuItems]
    final val SelectAll: MenuItems = 4L.asInstanceOf[MenuItems]
    final val Undo: MenuItems = 5L.asInstanceOf[MenuItems]
    final val Redo: MenuItems = 6L.asInstanceOf[MenuItems]
    final val SubmenuTextDir: MenuItems = 7L.asInstanceOf[MenuItems]
    final val DirInherited: MenuItems = 8L.asInstanceOf[MenuItems]
    final val DirAuto: MenuItems = 9L.asInstanceOf[MenuItems]
    final val DirLtr: MenuItems = 10L.asInstanceOf[MenuItems]
    final val DirRtl: MenuItems = 11L.asInstanceOf[MenuItems]
    final val DisplayUcc: MenuItems = 12L.asInstanceOf[MenuItems]
    final val SubmenuInsertUcc: MenuItems = 13L.asInstanceOf[MenuItems]
    final val InsertLrm: MenuItems = 14L.asInstanceOf[MenuItems]
    final val InsertRlm: MenuItems = 15L.asInstanceOf[MenuItems]
    final val InsertLre: MenuItems = 16L.asInstanceOf[MenuItems]
    final val InsertRle: MenuItems = 17L.asInstanceOf[MenuItems]
    final val InsertLro: MenuItems = 18L.asInstanceOf[MenuItems]
    final val InsertRlo: MenuItems = 19L.asInstanceOf[MenuItems]
    final val InsertPdf: MenuItems = 20L.asInstanceOf[MenuItems]
    final val InsertAlm: MenuItems = 21L.asInstanceOf[MenuItems]
    final val InsertLri: MenuItems = 22L.asInstanceOf[MenuItems]
    final val InsertRli: MenuItems = 23L.asInstanceOf[MenuItems]
    final val InsertFsi: MenuItems = 24L.asInstanceOf[MenuItems]
    final val InsertPdi: MenuItems = 25L.asInstanceOf[MenuItems]
    final val InsertZwj: MenuItems = 26L.asInstanceOf[MenuItems]
    final val InsertZwnj: MenuItems = 27L.asInstanceOf[MenuItems]
    final val InsertWj: MenuItems = 28L.asInstanceOf[MenuItems]
    final val InsertShy: MenuItems = 29L.asInstanceOf[MenuItems]
    final val EmojiAndSymbol: MenuItems = 30L.asInstanceOf[MenuItems]
    final val Max: MenuItems = 31L.asInstanceOf[MenuItems]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): MenuItems = value.asInstanceOf[MenuItems]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[MenuItems] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 11L, 12L, 13L, 14L, 15L, 16L, 17L, 18L, 19L, 20L, 21L, 22L, 23L, 24L, 25L, 26L, 27L, 28L, 29L, 30L, 31L).asInstanceOf[scala.IArray[MenuItems]]

    extension (self: MenuItems)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Cut"
        case 1L => "Copy"
        case 2L => "Paste"
        case 3L => "Clear"
        case 4L => "SelectAll"
        case 5L => "Undo"
        case 6L => "Redo"
        case 7L => "SubmenuTextDir"
        case 8L => "DirInherited"
        case 9L => "DirAuto"
        case 10L => "DirLtr"
        case 11L => "DirRtl"
        case 12L => "DisplayUcc"
        case 13L => "SubmenuInsertUcc"
        case 14L => "InsertLrm"
        case 15L => "InsertRlm"
        case 16L => "InsertLre"
        case 17L => "InsertRle"
        case 18L => "InsertLro"
        case 19L => "InsertRlo"
        case 20L => "InsertPdf"
        case 21L => "InsertAlm"
        case 22L => "InsertLri"
        case 23L => "InsertRli"
        case 24L => "InsertFsi"
        case 25L => "InsertPdi"
        case 26L => "InsertZwj"
        case 27L => "InsertZwnj"
        case 28L => "InsertWj"
        case 29L => "InsertShy"
        case 30L => "EmojiAndSymbol"
        case 31L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `TextEdit.EditAction`. */
  opaque type EditAction <: Long = Long

  object EditAction {
    final val None: EditAction = 0L.asInstanceOf[EditAction]
    final val Typing: EditAction = 1L.asInstanceOf[EditAction]
    final val Backspace: EditAction = 2L.asInstanceOf[EditAction]
    final val Delete: EditAction = 3L.asInstanceOf[EditAction]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): EditAction = value.asInstanceOf[EditAction]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[EditAction] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[EditAction]]

    extension (self: EditAction)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "None"
        case 1L => "Typing"
        case 2L => "Backspace"
        case 3L => "Delete"
        case other => other.toString
      }
  }

  /** Godot enum `TextEdit.SearchFlags`. */
  opaque type SearchFlags <: Long = Long

  object SearchFlags {
    final val MatchCase: SearchFlags = 1L.asInstanceOf[SearchFlags]
    final val WholeWords: SearchFlags = 2L.asInstanceOf[SearchFlags]
    final val Backwards: SearchFlags = 4L.asInstanceOf[SearchFlags]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): SearchFlags = value.asInstanceOf[SearchFlags]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[SearchFlags] = scala.IArray[Long](1L, 2L, 4L).asInstanceOf[scala.IArray[SearchFlags]]

    extension (self: SearchFlags)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 1L => "MatchCase"
        case 2L => "WholeWords"
        case 4L => "Backwards"
        case other => other.toString
      }
  }

  /** Godot enum `TextEdit.CaretType`. */
  opaque type CaretType <: Long = Long

  object CaretType {
    final val Line: CaretType = 0L.asInstanceOf[CaretType]
    final val Block: CaretType = 1L.asInstanceOf[CaretType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): CaretType = value.asInstanceOf[CaretType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[CaretType] = scala.IArray[Long](0L, 1L).asInstanceOf[scala.IArray[CaretType]]

    extension (self: CaretType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Line"
        case 1L => "Block"
        case other => other.toString
      }
  }

  /** Godot enum `TextEdit.SelectionMode`. */
  opaque type SelectionMode <: Long = Long

  object SelectionMode {
    final val None: SelectionMode = 0L.asInstanceOf[SelectionMode]
    final val Shift: SelectionMode = 1L.asInstanceOf[SelectionMode]
    final val Pointer: SelectionMode = 2L.asInstanceOf[SelectionMode]
    final val Word: SelectionMode = 3L.asInstanceOf[SelectionMode]
    final val Line: SelectionMode = 4L.asInstanceOf[SelectionMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): SelectionMode = value.asInstanceOf[SelectionMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[SelectionMode] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L).asInstanceOf[scala.IArray[SelectionMode]]

    extension (self: SelectionMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "None"
        case 1L => "Shift"
        case 2L => "Pointer"
        case 3L => "Word"
        case 4L => "Line"
        case other => other.toString
      }
  }

  /** Godot enum `TextEdit.LineWrappingMode`. */
  opaque type LineWrappingMode <: Long = Long

  object LineWrappingMode {
    final val None: LineWrappingMode = 0L.asInstanceOf[LineWrappingMode]
    final val Boundary: LineWrappingMode = 1L.asInstanceOf[LineWrappingMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): LineWrappingMode = value.asInstanceOf[LineWrappingMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[LineWrappingMode] = scala.IArray[Long](0L, 1L).asInstanceOf[scala.IArray[LineWrappingMode]]

    extension (self: LineWrappingMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "None"
        case 1L => "Boundary"
        case other => other.toString
      }
  }

  /** Godot enum `TextEdit.GutterType`. */
  opaque type GutterType <: Long = Long

  object GutterType {
    final val String: GutterType = 0L.asInstanceOf[GutterType]
    final val Icon: GutterType = 1L.asInstanceOf[GutterType]
    final val Custom: GutterType = 2L.asInstanceOf[GutterType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): GutterType = value.asInstanceOf[GutterType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[GutterType] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[GutterType]]

    extension (self: GutterType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "String"
        case 1L => "Icon"
        case 2L => "Custom"
        case other => other.toString
      }
  }
}
