package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `TextEdit`, extends `Control`. */
abstract class TextEdit extends Control {

  /** TextEdit.has_ime_text */
  final def hasImeText(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TextEdit", "has_ime_text", 36873697L), hostObject.objectPtr)

  /** TextEdit.cancel_ime */
  final def cancelIme(): Unit =
    Ptrcall.callVoid0(MethodBind.get("TextEdit", "cancel_ime", 3218959716L), hostObject.objectPtr)

  /** TextEdit.apply_ime */
  final def applyIme(): Unit =
    Ptrcall.callVoid0(MethodBind.get("TextEdit", "apply_ime", 3218959716L), hostObject.objectPtr)

  /** TextEdit.set_editable */
  final def setEditable(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextEdit", "set_editable", 2586408642L), hostObject.objectPtr, enabled)

  /** TextEdit.is_editable */
  final def isEditable(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TextEdit", "is_editable", 36873697L), hostObject.objectPtr)

  /** TextEdit.set_text_direction */
  final def setTextDirection(direction: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextEdit", "set_text_direction", 119160795L), hostObject.objectPtr, direction)

  /** TextEdit.get_text_direction */
  final def getTextDirection(): Long =
    Ptrcall.call0[Long](MethodBind.get("TextEdit", "get_text_direction", 797257663L), hostObject.objectPtr)

  /** TextEdit.set_language */
  final def setLanguage(language: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextEdit", "set_language", 83702148L), hostObject.objectPtr, language)

  /** TextEdit.get_language */
  final def getLanguage(): String =
    Ptrcall.call0[String](MethodBind.get("TextEdit", "get_language", 201670096L), hostObject.objectPtr)

  /** TextEdit.set_structured_text_bidi_override */
  final def setStructuredTextBidiOverride(parser: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextEdit", "set_structured_text_bidi_override", 55961453L), hostObject.objectPtr, parser)

  /** TextEdit.get_structured_text_bidi_override */
  final def getStructuredTextBidiOverride(): Long =
    Ptrcall.call0[Long](MethodBind.get("TextEdit", "get_structured_text_bidi_override", 3385126229L), hostObject.objectPtr)

  /** TextEdit.set_tab_size */
  final def setTabSize(size: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextEdit", "set_tab_size", 1286410249L), hostObject.objectPtr, size)

  /** TextEdit.get_tab_size */
  final def getTabSize(): Long =
    Ptrcall.call0[Long](MethodBind.get("TextEdit", "get_tab_size", 3905245786L), hostObject.objectPtr)

  /** TextEdit.set_indent_wrapped_lines */
  final def setIndentWrappedLines(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextEdit", "set_indent_wrapped_lines", 2586408642L), hostObject.objectPtr, enabled)

  /** TextEdit.is_indent_wrapped_lines */
  final def isIndentWrappedLines(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TextEdit", "is_indent_wrapped_lines", 36873697L), hostObject.objectPtr)

  /** TextEdit.set_tab_input_mode */
  final def setTabInputMode(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextEdit", "set_tab_input_mode", 2586408642L), hostObject.objectPtr, enabled)

  /** TextEdit.get_tab_input_mode */
  final def getTabInputMode(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TextEdit", "get_tab_input_mode", 36873697L), hostObject.objectPtr)

  /** TextEdit.set_overtype_mode_enabled */
  final def setOvertypeModeEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextEdit", "set_overtype_mode_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** TextEdit.is_overtype_mode_enabled */
  final def isOvertypeModeEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TextEdit", "is_overtype_mode_enabled", 36873697L), hostObject.objectPtr)

  /** TextEdit.set_context_menu_enabled */
  final def setContextMenuEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextEdit", "set_context_menu_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** TextEdit.is_context_menu_enabled */
  final def isContextMenuEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TextEdit", "is_context_menu_enabled", 36873697L), hostObject.objectPtr)

  /** TextEdit.set_emoji_menu_enabled */
  final def setEmojiMenuEnabled(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextEdit", "set_emoji_menu_enabled", 2586408642L), hostObject.objectPtr, enable)

  /** TextEdit.is_emoji_menu_enabled */
  final def isEmojiMenuEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TextEdit", "is_emoji_menu_enabled", 36873697L), hostObject.objectPtr)

  /** TextEdit.set_backspace_deletes_composite_character_enabled */
  final def setBackspaceDeletesCompositeCharacterEnabled(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextEdit", "set_backspace_deletes_composite_character_enabled", 2586408642L), hostObject.objectPtr, enable)

  /** TextEdit.is_backspace_deletes_composite_character_enabled */
  final def isBackspaceDeletesCompositeCharacterEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TextEdit", "is_backspace_deletes_composite_character_enabled", 36873697L), hostObject.objectPtr)

  /** TextEdit.set_shortcut_keys_enabled */
  final def setShortcutKeysEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextEdit", "set_shortcut_keys_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** TextEdit.is_shortcut_keys_enabled */
  final def isShortcutKeysEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TextEdit", "is_shortcut_keys_enabled", 36873697L), hostObject.objectPtr)

  /** TextEdit.set_virtual_keyboard_enabled */
  final def setVirtualKeyboardEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextEdit", "set_virtual_keyboard_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** TextEdit.is_virtual_keyboard_enabled */
  final def isVirtualKeyboardEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TextEdit", "is_virtual_keyboard_enabled", 36873697L), hostObject.objectPtr)

  /** TextEdit.set_virtual_keyboard_show_on_focus */
  final def setVirtualKeyboardShowOnFocus(show_on_focus: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextEdit", "set_virtual_keyboard_show_on_focus", 2586408642L), hostObject.objectPtr, show_on_focus)

  /** TextEdit.get_virtual_keyboard_show_on_focus */
  final def getVirtualKeyboardShowOnFocus(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TextEdit", "get_virtual_keyboard_show_on_focus", 36873697L), hostObject.objectPtr)

  /** TextEdit.set_middle_mouse_paste_enabled */
  final def setMiddleMousePasteEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextEdit", "set_middle_mouse_paste_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** TextEdit.is_middle_mouse_paste_enabled */
  final def isMiddleMousePasteEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TextEdit", "is_middle_mouse_paste_enabled", 36873697L), hostObject.objectPtr)

  /** TextEdit.set_empty_selection_clipboard_enabled */
  final def setEmptySelectionClipboardEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextEdit", "set_empty_selection_clipboard_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** TextEdit.is_empty_selection_clipboard_enabled */
  final def isEmptySelectionClipboardEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TextEdit", "is_empty_selection_clipboard_enabled", 36873697L), hostObject.objectPtr)

  /** TextEdit.clear */
  final def clear(): Unit =
    Ptrcall.callVoid0(MethodBind.get("TextEdit", "clear", 3218959716L), hostObject.objectPtr)

  /** TextEdit.set_text */
  final def setText(text: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextEdit", "set_text", 83702148L), hostObject.objectPtr, text)

  /** TextEdit.get_text */
  final def getText(): String =
    Ptrcall.call0[String](MethodBind.get("TextEdit", "get_text", 201670096L), hostObject.objectPtr)

  /** TextEdit.get_line_count */
  final def getLineCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("TextEdit", "get_line_count", 3905245786L), hostObject.objectPtr)

  /** TextEdit.set_placeholder */
  final def setPlaceholder(text: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextEdit", "set_placeholder", 83702148L), hostObject.objectPtr, text)

  /** TextEdit.get_placeholder */
  final def getPlaceholder(): String =
    Ptrcall.call0[String](MethodBind.get("TextEdit", "get_placeholder", 201670096L), hostObject.objectPtr)

  /** TextEdit.set_line */
  final def setLine(line: Long, new_text: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("TextEdit", "set_line", 501894301L), hostObject.objectPtr, line, new_text)

  /** TextEdit.get_line */
  final def getLine(line: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("TextEdit", "get_line", 844755477L), hostObject.objectPtr, line)

  /** TextEdit.get_line_with_ime */
  final def getLineWithIme(line: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("TextEdit", "get_line_with_ime", 844755477L), hostObject.objectPtr, line)

  /** TextEdit.get_line_width */
  final def getLineWidth(line: Long, wrap_index: Long): Long =
    Ptrcall.call2[Long, Long, Long](MethodBind.get("TextEdit", "get_line_width", 688195400L), hostObject.objectPtr, line, wrap_index)

  /** TextEdit.get_line_height */
  final def getLineHeight(): Long =
    Ptrcall.call0[Long](MethodBind.get("TextEdit", "get_line_height", 3905245786L), hostObject.objectPtr)

  /** TextEdit.get_indent_level */
  final def getIndentLevel(line: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("TextEdit", "get_indent_level", 923996154L), hostObject.objectPtr, line)

  /** TextEdit.get_first_non_whitespace_column */
  final def getFirstNonWhitespaceColumn(line: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("TextEdit", "get_first_non_whitespace_column", 923996154L), hostObject.objectPtr, line)

  /** TextEdit.swap_lines */
  final def swapLines(from_line: Long, to_line: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("TextEdit", "swap_lines", 3937882851L), hostObject.objectPtr, from_line, to_line)

  /** TextEdit.insert_line_at */
  final def insertLineAt(line: Long, text: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("TextEdit", "insert_line_at", 501894301L), hostObject.objectPtr, line, text)

  /** TextEdit.remove_line_at */
  final def removeLineAt(line: Long, move_carets_down: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("TextEdit", "remove_line_at", 972357352L), hostObject.objectPtr, line, move_carets_down)

  /** TextEdit.insert_text_at_caret */
  final def insertTextAtCaret(text: String, caret_index: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("TextEdit", "insert_text_at_caret", 2697778442L), hostObject.objectPtr, text, caret_index)

  /** TextEdit.insert_text */
  final def insertText(text: String, line: Long, column: Long, before_selection_begin: Boolean, before_selection_end: Boolean): Unit =
    Ptrcall.callVoid5(MethodBind.get("TextEdit", "insert_text", 1881564334L), hostObject.objectPtr, text, line, column, before_selection_begin, before_selection_end)

  /** TextEdit.remove_text */
  final def removeText(from_line: Long, from_column: Long, to_line: Long, to_column: Long): Unit =
    Ptrcall.callVoid4(MethodBind.get("TextEdit", "remove_text", 4275841770L), hostObject.objectPtr, from_line, from_column, to_line, to_column)

  /** TextEdit.get_last_unhidden_line */
  final def getLastUnhiddenLine(): Long =
    Ptrcall.call0[Long](MethodBind.get("TextEdit", "get_last_unhidden_line", 3905245786L), hostObject.objectPtr)

  /** TextEdit.get_next_visible_line_offset_from */
  final def getNextVisibleLineOffsetFrom(line: Long, visible_amount: Long): Long =
    Ptrcall.call2[Long, Long, Long](MethodBind.get("TextEdit", "get_next_visible_line_offset_from", 3175239445L), hostObject.objectPtr, line, visible_amount)

  /** TextEdit.get_next_visible_line_index_offset_from */
  final def getNextVisibleLineIndexOffsetFrom(line: Long, wrap_index: Long, visible_amount: Long): gdext.builtin.Vector2i =
    Ptrcall.call3[Long, Long, Long, gdext.builtin.Vector2i](MethodBind.get("TextEdit", "get_next_visible_line_index_offset_from", 3386475622L), hostObject.objectPtr, line, wrap_index, visible_amount)

  /** TextEdit.backspace */
  final def backspace(caret_index: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextEdit", "backspace", 1025054187L), hostObject.objectPtr, caret_index)

  /** TextEdit.cut */
  final def cut(caret_index: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextEdit", "cut", 1025054187L), hostObject.objectPtr, caret_index)

  /** TextEdit.copy */
  final def copy(caret_index: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextEdit", "copy", 1025054187L), hostObject.objectPtr, caret_index)

  /** TextEdit.paste */
  final def paste(caret_index: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextEdit", "paste", 1025054187L), hostObject.objectPtr, caret_index)

  /** TextEdit.paste_primary_clipboard */
  final def pastePrimaryClipboard(caret_index: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextEdit", "paste_primary_clipboard", 1025054187L), hostObject.objectPtr, caret_index)

  /** TextEdit.start_action */
  final def startAction(action: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextEdit", "start_action", 2834827583L), hostObject.objectPtr, action)

  /** TextEdit.end_action */
  final def endAction(): Unit =
    Ptrcall.callVoid0(MethodBind.get("TextEdit", "end_action", 3218959716L), hostObject.objectPtr)

  /** TextEdit.begin_complex_operation */
  final def beginComplexOperation(): Unit =
    Ptrcall.callVoid0(MethodBind.get("TextEdit", "begin_complex_operation", 3218959716L), hostObject.objectPtr)

  /** TextEdit.end_complex_operation */
  final def endComplexOperation(): Unit =
    Ptrcall.callVoid0(MethodBind.get("TextEdit", "end_complex_operation", 3218959716L), hostObject.objectPtr)

  /** TextEdit.has_undo */
  final def hasUndo(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TextEdit", "has_undo", 36873697L), hostObject.objectPtr)

  /** TextEdit.has_redo */
  final def hasRedo(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TextEdit", "has_redo", 36873697L), hostObject.objectPtr)

  /** TextEdit.undo */
  final def undo(): Unit =
    Ptrcall.callVoid0(MethodBind.get("TextEdit", "undo", 3218959716L), hostObject.objectPtr)

  /** TextEdit.redo */
  final def redo(): Unit =
    Ptrcall.callVoid0(MethodBind.get("TextEdit", "redo", 3218959716L), hostObject.objectPtr)

  /** TextEdit.clear_undo_history */
  final def clearUndoHistory(): Unit =
    Ptrcall.callVoid0(MethodBind.get("TextEdit", "clear_undo_history", 3218959716L), hostObject.objectPtr)

  /** TextEdit.tag_saved_version */
  final def tagSavedVersion(): Unit =
    Ptrcall.callVoid0(MethodBind.get("TextEdit", "tag_saved_version", 3218959716L), hostObject.objectPtr)

  /** TextEdit.get_version */
  final def getVersion(): Long =
    Ptrcall.call0[Long](MethodBind.get("TextEdit", "get_version", 3905245786L), hostObject.objectPtr)

  /** TextEdit.get_saved_version */
  final def getSavedVersion(): Long =
    Ptrcall.call0[Long](MethodBind.get("TextEdit", "get_saved_version", 3905245786L), hostObject.objectPtr)

  /** TextEdit.set_search_text */
  final def setSearchText(search_text: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextEdit", "set_search_text", 83702148L), hostObject.objectPtr, search_text)

  /** TextEdit.set_search_flags */
  final def setSearchFlags(flags: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextEdit", "set_search_flags", 1286410249L), hostObject.objectPtr, flags)

  /** TextEdit.search */
  final def search(text: String, flags: Long, from_line: Long, from_column: Long): gdext.builtin.Vector2i =
    Ptrcall.call4[String, Long, Long, Long, gdext.builtin.Vector2i](MethodBind.get("TextEdit", "search", 1203739136L), hostObject.objectPtr, text, flags, from_line, from_column)

  /** TextEdit.get_local_mouse_pos */
  final def getLocalMousePos(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("TextEdit", "get_local_mouse_pos", 3341600327L), hostObject.objectPtr)

  /** TextEdit.get_word_at_pos */
  final def getWordAtPos(position: gdext.builtin.Vector2): String =
    Ptrcall.call1[gdext.builtin.Vector2, String](MethodBind.get("TextEdit", "get_word_at_pos", 3674420000L), hostObject.objectPtr, position)

  /** TextEdit.get_line_column_at_pos */
  final def getLineColumnAtPos(position: gdext.builtin.Vector2i, clamp_line: Boolean, clamp_column: Boolean): gdext.builtin.Vector2i =
    Ptrcall.call3[gdext.builtin.Vector2i, Boolean, Boolean, gdext.builtin.Vector2i](MethodBind.get("TextEdit", "get_line_column_at_pos", 3472935744L), hostObject.objectPtr, position, clamp_line, clamp_column)

  /** TextEdit.get_pos_at_line_column */
  final def getPosAtLineColumn(line: Long, column: Long): gdext.builtin.Vector2i =
    Ptrcall.call2[Long, Long, gdext.builtin.Vector2i](MethodBind.get("TextEdit", "get_pos_at_line_column", 410388347L), hostObject.objectPtr, line, column)

  /** TextEdit.get_rect_at_line_column */
  final def getRectAtLineColumn(line: Long, column: Long): gdext.builtin.Rect2i =
    Ptrcall.call2[Long, Long, gdext.builtin.Rect2i](MethodBind.get("TextEdit", "get_rect_at_line_column", 3256618057L), hostObject.objectPtr, line, column)

  /** TextEdit.get_minimap_line_at_pos */
  final def getMinimapLineAtPos(position: gdext.builtin.Vector2i): Long =
    Ptrcall.call1[gdext.builtin.Vector2i, Long](MethodBind.get("TextEdit", "get_minimap_line_at_pos", 2485466453L), hostObject.objectPtr, position)

  /** TextEdit.is_dragging_cursor */
  final def isDraggingCursor(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TextEdit", "is_dragging_cursor", 36873697L), hostObject.objectPtr)

  /** TextEdit.is_mouse_over_selection */
  final def isMouseOverSelection(edges: Boolean, caret_index: Long): Boolean =
    Ptrcall.call2[Boolean, Long, Boolean](MethodBind.get("TextEdit", "is_mouse_over_selection", 1840282309L), hostObject.objectPtr, edges, caret_index)

  /** TextEdit.set_caret_type */
  final def setCaretType(`type`: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextEdit", "set_caret_type", 1211596914L), hostObject.objectPtr, `type`)

  /** TextEdit.get_caret_type */
  final def getCaretType(): Long =
    Ptrcall.call0[Long](MethodBind.get("TextEdit", "get_caret_type", 2830252959L), hostObject.objectPtr)

  /** TextEdit.set_caret_blink_enabled */
  final def setCaretBlinkEnabled(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextEdit", "set_caret_blink_enabled", 2586408642L), hostObject.objectPtr, enable)

  /** TextEdit.is_caret_blink_enabled */
  final def isCaretBlinkEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TextEdit", "is_caret_blink_enabled", 36873697L), hostObject.objectPtr)

  /** TextEdit.set_caret_blink_interval */
  final def setCaretBlinkInterval(interval: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextEdit", "set_caret_blink_interval", 373806689L), hostObject.objectPtr, interval)

  /** TextEdit.get_caret_blink_interval */
  final def getCaretBlinkInterval(): Double =
    Ptrcall.call0[Double](MethodBind.get("TextEdit", "get_caret_blink_interval", 1740695150L), hostObject.objectPtr)

  /** TextEdit.set_draw_caret_when_editable_disabled */
  final def setDrawCaretWhenEditableDisabled(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextEdit", "set_draw_caret_when_editable_disabled", 2586408642L), hostObject.objectPtr, enable)

  /** TextEdit.is_drawing_caret_when_editable_disabled */
  final def isDrawingCaretWhenEditableDisabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TextEdit", "is_drawing_caret_when_editable_disabled", 36873697L), hostObject.objectPtr)

  /** TextEdit.set_move_caret_on_right_click_enabled */
  final def setMoveCaretOnRightClickEnabled(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextEdit", "set_move_caret_on_right_click_enabled", 2586408642L), hostObject.objectPtr, enable)

  /** TextEdit.is_move_caret_on_right_click_enabled */
  final def isMoveCaretOnRightClickEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TextEdit", "is_move_caret_on_right_click_enabled", 36873697L), hostObject.objectPtr)

  /** TextEdit.set_caret_mid_grapheme_enabled */
  final def setCaretMidGraphemeEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextEdit", "set_caret_mid_grapheme_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** TextEdit.is_caret_mid_grapheme_enabled */
  final def isCaretMidGraphemeEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TextEdit", "is_caret_mid_grapheme_enabled", 36873697L), hostObject.objectPtr)

  /** TextEdit.set_multiple_carets_enabled */
  final def setMultipleCaretsEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextEdit", "set_multiple_carets_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** TextEdit.is_multiple_carets_enabled */
  final def isMultipleCaretsEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TextEdit", "is_multiple_carets_enabled", 36873697L), hostObject.objectPtr)

  /** TextEdit.add_caret */
  final def addCaret(line: Long, column: Long): Long =
    Ptrcall.call2[Long, Long, Long](MethodBind.get("TextEdit", "add_caret", 50157827L), hostObject.objectPtr, line, column)

  /** TextEdit.remove_caret */
  final def removeCaret(caret: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextEdit", "remove_caret", 1286410249L), hostObject.objectPtr, caret)

  /** TextEdit.remove_secondary_carets */
  final def removeSecondaryCarets(): Unit =
    Ptrcall.callVoid0(MethodBind.get("TextEdit", "remove_secondary_carets", 3218959716L), hostObject.objectPtr)

  /** TextEdit.get_caret_count */
  final def getCaretCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("TextEdit", "get_caret_count", 3905245786L), hostObject.objectPtr)

  /** TextEdit.add_caret_at_carets */
  final def addCaretAtCarets(below: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextEdit", "add_caret_at_carets", 2586408642L), hostObject.objectPtr, below)

  /** TextEdit.collapse_carets */
  final def collapseCarets(from_line: Long, from_column: Long, to_line: Long, to_column: Long, inclusive: Boolean): Unit =
    Ptrcall.callVoid5(MethodBind.get("TextEdit", "collapse_carets", 228654177L), hostObject.objectPtr, from_line, from_column, to_line, to_column, inclusive)

  /** TextEdit.merge_overlapping_carets */
  final def mergeOverlappingCarets(): Unit =
    Ptrcall.callVoid0(MethodBind.get("TextEdit", "merge_overlapping_carets", 3218959716L), hostObject.objectPtr)

  /** TextEdit.begin_multicaret_edit */
  final def beginMulticaretEdit(): Unit =
    Ptrcall.callVoid0(MethodBind.get("TextEdit", "begin_multicaret_edit", 3218959716L), hostObject.objectPtr)

  /** TextEdit.end_multicaret_edit */
  final def endMulticaretEdit(): Unit =
    Ptrcall.callVoid0(MethodBind.get("TextEdit", "end_multicaret_edit", 3218959716L), hostObject.objectPtr)

  /** TextEdit.is_in_mulitcaret_edit */
  final def isInMulitcaretEdit(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TextEdit", "is_in_mulitcaret_edit", 36873697L), hostObject.objectPtr)

  /** TextEdit.multicaret_edit_ignore_caret */
  final def multicaretEditIgnoreCaret(caret_index: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("TextEdit", "multicaret_edit_ignore_caret", 1116898809L), hostObject.objectPtr, caret_index)

  /** TextEdit.is_caret_visible */
  final def isCaretVisible(caret_index: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("TextEdit", "is_caret_visible", 1051549951L), hostObject.objectPtr, caret_index)

  /** TextEdit.get_caret_draw_pos */
  final def getCaretDrawPos(caret_index: Long): gdext.builtin.Vector2 =
    Ptrcall.call1[Long, gdext.builtin.Vector2](MethodBind.get("TextEdit", "get_caret_draw_pos", 478253731L), hostObject.objectPtr, caret_index)

  /** TextEdit.set_caret_line */
  final def setCaretLine(line: Long, adjust_viewport: Boolean, can_be_hidden: Boolean, wrap_index: Long, caret_index: Long): Unit =
    Ptrcall.callVoid5(MethodBind.get("TextEdit", "set_caret_line", 1302582944L), hostObject.objectPtr, line, adjust_viewport, can_be_hidden, wrap_index, caret_index)

  /** TextEdit.get_caret_line */
  final def getCaretLine(caret_index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("TextEdit", "get_caret_line", 1591665591L), hostObject.objectPtr, caret_index)

  /** TextEdit.set_caret_column */
  final def setCaretColumn(column: Long, adjust_viewport: Boolean, caret_index: Long): Unit =
    Ptrcall.callVoid3(MethodBind.get("TextEdit", "set_caret_column", 3796796178L), hostObject.objectPtr, column, adjust_viewport, caret_index)

  /** TextEdit.get_caret_column */
  final def getCaretColumn(caret_index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("TextEdit", "get_caret_column", 1591665591L), hostObject.objectPtr, caret_index)

  /** TextEdit.get_next_composite_character_column */
  final def getNextCompositeCharacterColumn(line: Long, column: Long): Long =
    Ptrcall.call2[Long, Long, Long](MethodBind.get("TextEdit", "get_next_composite_character_column", 3175239445L), hostObject.objectPtr, line, column)

  /** TextEdit.get_previous_composite_character_column */
  final def getPreviousCompositeCharacterColumn(line: Long, column: Long): Long =
    Ptrcall.call2[Long, Long, Long](MethodBind.get("TextEdit", "get_previous_composite_character_column", 3175239445L), hostObject.objectPtr, line, column)

  /** TextEdit.get_caret_wrap_index */
  final def getCaretWrapIndex(caret_index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("TextEdit", "get_caret_wrap_index", 1591665591L), hostObject.objectPtr, caret_index)

  /** TextEdit.get_word_under_caret */
  final def getWordUnderCaret(caret_index: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("TextEdit", "get_word_under_caret", 3929349208L), hostObject.objectPtr, caret_index)

  /** TextEdit.set_use_default_word_separators */
  final def setUseDefaultWordSeparators(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextEdit", "set_use_default_word_separators", 2586408642L), hostObject.objectPtr, enabled)

  /** TextEdit.is_default_word_separators_enabled */
  final def isDefaultWordSeparatorsEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TextEdit", "is_default_word_separators_enabled", 36873697L), hostObject.objectPtr)

  /** TextEdit.set_use_custom_word_separators */
  final def setUseCustomWordSeparators(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextEdit", "set_use_custom_word_separators", 2586408642L), hostObject.objectPtr, enabled)

  /** TextEdit.is_custom_word_separators_enabled */
  final def isCustomWordSeparatorsEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TextEdit", "is_custom_word_separators_enabled", 36873697L), hostObject.objectPtr)

  /** TextEdit.set_custom_word_separators */
  final def setCustomWordSeparators(custom_word_separators: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextEdit", "set_custom_word_separators", 83702148L), hostObject.objectPtr, custom_word_separators)

  /** TextEdit.get_custom_word_separators */
  final def getCustomWordSeparators(): String =
    Ptrcall.call0[String](MethodBind.get("TextEdit", "get_custom_word_separators", 201670096L), hostObject.objectPtr)

  /** TextEdit.set_selecting_enabled */
  final def setSelectingEnabled(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextEdit", "set_selecting_enabled", 2586408642L), hostObject.objectPtr, enable)

  /** TextEdit.is_selecting_enabled */
  final def isSelectingEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TextEdit", "is_selecting_enabled", 36873697L), hostObject.objectPtr)

  /** TextEdit.set_deselect_on_focus_loss_enabled */
  final def setDeselectOnFocusLossEnabled(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextEdit", "set_deselect_on_focus_loss_enabled", 2586408642L), hostObject.objectPtr, enable)

  /** TextEdit.is_deselect_on_focus_loss_enabled */
  final def isDeselectOnFocusLossEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TextEdit", "is_deselect_on_focus_loss_enabled", 36873697L), hostObject.objectPtr)

  /** TextEdit.set_drag_and_drop_selection_enabled */
  final def setDragAndDropSelectionEnabled(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextEdit", "set_drag_and_drop_selection_enabled", 2586408642L), hostObject.objectPtr, enable)

  /** TextEdit.is_drag_and_drop_selection_enabled */
  final def isDragAndDropSelectionEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TextEdit", "is_drag_and_drop_selection_enabled", 36873697L), hostObject.objectPtr)

  /** TextEdit.set_selection_mode */
  final def setSelectionMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextEdit", "set_selection_mode", 1658801786L), hostObject.objectPtr, mode)

  /** TextEdit.get_selection_mode */
  final def getSelectionMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("TextEdit", "get_selection_mode", 3750106938L), hostObject.objectPtr)

  /** TextEdit.select_all */
  final def selectAll(): Unit =
    Ptrcall.callVoid0(MethodBind.get("TextEdit", "select_all", 3218959716L), hostObject.objectPtr)

  /** TextEdit.select_word_under_caret */
  final def selectWordUnderCaret(caret_index: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextEdit", "select_word_under_caret", 1025054187L), hostObject.objectPtr, caret_index)

  /** TextEdit.add_selection_for_next_occurrence */
  final def addSelectionForNextOccurrence(): Unit =
    Ptrcall.callVoid0(MethodBind.get("TextEdit", "add_selection_for_next_occurrence", 3218959716L), hostObject.objectPtr)

  /** TextEdit.skip_selection_for_next_occurrence */
  final def skipSelectionForNextOccurrence(): Unit =
    Ptrcall.callVoid0(MethodBind.get("TextEdit", "skip_selection_for_next_occurrence", 3218959716L), hostObject.objectPtr)

  /** TextEdit.select */
  final def select(origin_line: Long, origin_column: Long, caret_line: Long, caret_column: Long, caret_index: Long): Unit =
    Ptrcall.callVoid5(MethodBind.get("TextEdit", "select", 2560984452L), hostObject.objectPtr, origin_line, origin_column, caret_line, caret_column, caret_index)

  /** TextEdit.has_selection */
  final def hasSelection(caret_index: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("TextEdit", "has_selection", 2824505868L), hostObject.objectPtr, caret_index)

  /** TextEdit.get_selected_text */
  final def getSelectedText(caret_index: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("TextEdit", "get_selected_text", 2309358862L), hostObject.objectPtr, caret_index)

  /** TextEdit.get_selection_at_line_column */
  final def getSelectionAtLineColumn(line: Long, column: Long, include_edges: Boolean, only_selections: Boolean): Long =
    Ptrcall.call4[Long, Long, Boolean, Boolean, Long](MethodBind.get("TextEdit", "get_selection_at_line_column", 1810224333L), hostObject.objectPtr, line, column, include_edges, only_selections)

  /** TextEdit.get_selection_origin_line */
  final def getSelectionOriginLine(caret_index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("TextEdit", "get_selection_origin_line", 1591665591L), hostObject.objectPtr, caret_index)

  /** TextEdit.get_selection_origin_column */
  final def getSelectionOriginColumn(caret_index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("TextEdit", "get_selection_origin_column", 1591665591L), hostObject.objectPtr, caret_index)

  /** TextEdit.set_selection_origin_line */
  final def setSelectionOriginLine(line: Long, can_be_hidden: Boolean, wrap_index: Long, caret_index: Long): Unit =
    Ptrcall.callVoid4(MethodBind.get("TextEdit", "set_selection_origin_line", 195434140L), hostObject.objectPtr, line, can_be_hidden, wrap_index, caret_index)

  /** TextEdit.set_selection_origin_column */
  final def setSelectionOriginColumn(column: Long, caret_index: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("TextEdit", "set_selection_origin_column", 2230941749L), hostObject.objectPtr, column, caret_index)

  /** TextEdit.get_selection_from_line */
  final def getSelectionFromLine(caret_index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("TextEdit", "get_selection_from_line", 1591665591L), hostObject.objectPtr, caret_index)

  /** TextEdit.get_selection_from_column */
  final def getSelectionFromColumn(caret_index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("TextEdit", "get_selection_from_column", 1591665591L), hostObject.objectPtr, caret_index)

  /** TextEdit.get_selection_to_line */
  final def getSelectionToLine(caret_index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("TextEdit", "get_selection_to_line", 1591665591L), hostObject.objectPtr, caret_index)

  /** TextEdit.get_selection_to_column */
  final def getSelectionToColumn(caret_index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("TextEdit", "get_selection_to_column", 1591665591L), hostObject.objectPtr, caret_index)

  /** TextEdit.is_caret_after_selection_origin */
  final def isCaretAfterSelectionOrigin(caret_index: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("TextEdit", "is_caret_after_selection_origin", 1051549951L), hostObject.objectPtr, caret_index)

  /** TextEdit.deselect */
  final def deselect(caret_index: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextEdit", "deselect", 1025054187L), hostObject.objectPtr, caret_index)

  /** TextEdit.delete_selection */
  final def deleteSelection(caret_index: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextEdit", "delete_selection", 1025054187L), hostObject.objectPtr, caret_index)

  /** TextEdit.set_line_wrapping_mode */
  final def setLineWrappingMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextEdit", "set_line_wrapping_mode", 2525115309L), hostObject.objectPtr, mode)

  /** TextEdit.get_line_wrapping_mode */
  final def getLineWrappingMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("TextEdit", "get_line_wrapping_mode", 3562716114L), hostObject.objectPtr)

  /** TextEdit.set_autowrap_mode */
  final def setAutowrapMode(autowrap_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextEdit", "set_autowrap_mode", 3289138044L), hostObject.objectPtr, autowrap_mode)

  /** TextEdit.get_autowrap_mode */
  final def getAutowrapMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("TextEdit", "get_autowrap_mode", 1549071663L), hostObject.objectPtr)

  /** TextEdit.is_line_wrapped */
  final def isLineWrapped(line: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("TextEdit", "is_line_wrapped", 1116898809L), hostObject.objectPtr, line)

  /** TextEdit.get_line_wrap_count */
  final def getLineWrapCount(line: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("TextEdit", "get_line_wrap_count", 923996154L), hostObject.objectPtr, line)

  /** TextEdit.get_line_wrap_index_at_column */
  final def getLineWrapIndexAtColumn(line: Long, column: Long): Long =
    Ptrcall.call2[Long, Long, Long](MethodBind.get("TextEdit", "get_line_wrap_index_at_column", 3175239445L), hostObject.objectPtr, line, column)

  /** TextEdit.set_smooth_scroll_enabled */
  final def setSmoothScrollEnabled(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextEdit", "set_smooth_scroll_enabled", 2586408642L), hostObject.objectPtr, enable)

  /** TextEdit.is_smooth_scroll_enabled */
  final def isSmoothScrollEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TextEdit", "is_smooth_scroll_enabled", 36873697L), hostObject.objectPtr)

  /** TextEdit.get_v_scroll_bar */
  final def getVScrollBar(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("TextEdit", "get_v_scroll_bar", 3226026593L), hostObject.objectPtr)

  /** TextEdit.get_h_scroll_bar */
  final def getHScrollBar(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("TextEdit", "get_h_scroll_bar", 3774687988L), hostObject.objectPtr)

  /** TextEdit.set_v_scroll */
  final def setVScroll(value: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextEdit", "set_v_scroll", 373806689L), hostObject.objectPtr, value)

  /** TextEdit.get_v_scroll */
  final def getVScroll(): Double =
    Ptrcall.call0[Double](MethodBind.get("TextEdit", "get_v_scroll", 1740695150L), hostObject.objectPtr)

  /** TextEdit.set_h_scroll */
  final def setHScroll(value: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextEdit", "set_h_scroll", 1286410249L), hostObject.objectPtr, value)

  /** TextEdit.get_h_scroll */
  final def getHScroll(): Long =
    Ptrcall.call0[Long](MethodBind.get("TextEdit", "get_h_scroll", 3905245786L), hostObject.objectPtr)

  /** TextEdit.set_scroll_past_end_of_file_enabled */
  final def setScrollPastEndOfFileEnabled(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextEdit", "set_scroll_past_end_of_file_enabled", 2586408642L), hostObject.objectPtr, enable)

  /** TextEdit.is_scroll_past_end_of_file_enabled */
  final def isScrollPastEndOfFileEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TextEdit", "is_scroll_past_end_of_file_enabled", 36873697L), hostObject.objectPtr)

  /** TextEdit.set_v_scroll_speed */
  final def setVScrollSpeed(speed: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextEdit", "set_v_scroll_speed", 373806689L), hostObject.objectPtr, speed)

  /** TextEdit.get_v_scroll_speed */
  final def getVScrollSpeed(): Double =
    Ptrcall.call0[Double](MethodBind.get("TextEdit", "get_v_scroll_speed", 1740695150L), hostObject.objectPtr)

  /** TextEdit.set_fit_content_height_enabled */
  final def setFitContentHeightEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextEdit", "set_fit_content_height_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** TextEdit.is_fit_content_height_enabled */
  final def isFitContentHeightEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TextEdit", "is_fit_content_height_enabled", 36873697L), hostObject.objectPtr)

  /** TextEdit.set_fit_content_width_enabled */
  final def setFitContentWidthEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextEdit", "set_fit_content_width_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** TextEdit.is_fit_content_width_enabled */
  final def isFitContentWidthEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TextEdit", "is_fit_content_width_enabled", 36873697L), hostObject.objectPtr)

  /** TextEdit.get_scroll_pos_for_line */
  final def getScrollPosForLine(line: Long, wrap_index: Long): Double =
    Ptrcall.call2[Long, Long, Double](MethodBind.get("TextEdit", "get_scroll_pos_for_line", 3929084198L), hostObject.objectPtr, line, wrap_index)

  /** TextEdit.set_line_as_first_visible */
  final def setLineAsFirstVisible(line: Long, wrap_index: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("TextEdit", "set_line_as_first_visible", 2230941749L), hostObject.objectPtr, line, wrap_index)

  /** TextEdit.get_first_visible_line */
  final def getFirstVisibleLine(): Long =
    Ptrcall.call0[Long](MethodBind.get("TextEdit", "get_first_visible_line", 3905245786L), hostObject.objectPtr)

  /** TextEdit.set_line_as_center_visible */
  final def setLineAsCenterVisible(line: Long, wrap_index: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("TextEdit", "set_line_as_center_visible", 2230941749L), hostObject.objectPtr, line, wrap_index)

  /** TextEdit.set_line_as_last_visible */
  final def setLineAsLastVisible(line: Long, wrap_index: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("TextEdit", "set_line_as_last_visible", 2230941749L), hostObject.objectPtr, line, wrap_index)

  /** TextEdit.get_last_full_visible_line */
  final def getLastFullVisibleLine(): Long =
    Ptrcall.call0[Long](MethodBind.get("TextEdit", "get_last_full_visible_line", 3905245786L), hostObject.objectPtr)

  /** TextEdit.get_last_full_visible_line_wrap_index */
  final def getLastFullVisibleLineWrapIndex(): Long =
    Ptrcall.call0[Long](MethodBind.get("TextEdit", "get_last_full_visible_line_wrap_index", 3905245786L), hostObject.objectPtr)

  /** TextEdit.get_visible_line_count */
  final def getVisibleLineCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("TextEdit", "get_visible_line_count", 3905245786L), hostObject.objectPtr)

  /** TextEdit.get_visible_line_count_in_range */
  final def getVisibleLineCountInRange(from_line: Long, to_line: Long): Long =
    Ptrcall.call2[Long, Long, Long](MethodBind.get("TextEdit", "get_visible_line_count_in_range", 3175239445L), hostObject.objectPtr, from_line, to_line)

  /** TextEdit.get_total_visible_line_count */
  final def getTotalVisibleLineCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("TextEdit", "get_total_visible_line_count", 3905245786L), hostObject.objectPtr)

  /** TextEdit.adjust_viewport_to_caret */
  final def adjustViewportToCaret(caret_index: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextEdit", "adjust_viewport_to_caret", 1995695955L), hostObject.objectPtr, caret_index)

  /** TextEdit.center_viewport_to_caret */
  final def centerViewportToCaret(caret_index: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextEdit", "center_viewport_to_caret", 1995695955L), hostObject.objectPtr, caret_index)

  /** TextEdit.set_draw_minimap */
  final def setDrawMinimap(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextEdit", "set_draw_minimap", 2586408642L), hostObject.objectPtr, enabled)

  /** TextEdit.is_drawing_minimap */
  final def isDrawingMinimap(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TextEdit", "is_drawing_minimap", 36873697L), hostObject.objectPtr)

  /** TextEdit.set_minimap_width */
  final def setMinimapWidth(width: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextEdit", "set_minimap_width", 1286410249L), hostObject.objectPtr, width)

  /** TextEdit.get_minimap_width */
  final def getMinimapWidth(): Long =
    Ptrcall.call0[Long](MethodBind.get("TextEdit", "get_minimap_width", 3905245786L), hostObject.objectPtr)

  /** TextEdit.get_minimap_visible_lines */
  final def getMinimapVisibleLines(): Long =
    Ptrcall.call0[Long](MethodBind.get("TextEdit", "get_minimap_visible_lines", 3905245786L), hostObject.objectPtr)

  /** TextEdit.add_gutter */
  final def addGutter(at: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextEdit", "add_gutter", 1025054187L), hostObject.objectPtr, at)

  /** TextEdit.remove_gutter */
  final def removeGutter(gutter: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextEdit", "remove_gutter", 1286410249L), hostObject.objectPtr, gutter)

  /** TextEdit.get_gutter_count */
  final def getGutterCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("TextEdit", "get_gutter_count", 3905245786L), hostObject.objectPtr)

  /** TextEdit.set_gutter_name */
  final def setGutterName(gutter: Long, name: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("TextEdit", "set_gutter_name", 501894301L), hostObject.objectPtr, gutter, name)

  /** TextEdit.get_gutter_name */
  final def getGutterName(gutter: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("TextEdit", "get_gutter_name", 844755477L), hostObject.objectPtr, gutter)

  /** TextEdit.set_gutter_type */
  final def setGutterType(gutter: Long, `type`: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("TextEdit", "set_gutter_type", 1088959071L), hostObject.objectPtr, gutter, `type`)

  /** TextEdit.get_gutter_type */
  final def getGutterType(gutter: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("TextEdit", "get_gutter_type", 1159699127L), hostObject.objectPtr, gutter)

  /** TextEdit.set_gutter_width */
  final def setGutterWidth(gutter: Long, width: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("TextEdit", "set_gutter_width", 3937882851L), hostObject.objectPtr, gutter, width)

  /** TextEdit.get_gutter_width */
  final def getGutterWidth(gutter: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("TextEdit", "get_gutter_width", 923996154L), hostObject.objectPtr, gutter)

  /** TextEdit.set_gutter_draw */
  final def setGutterDraw(gutter: Long, draw: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("TextEdit", "set_gutter_draw", 300928843L), hostObject.objectPtr, gutter, draw)

  /** TextEdit.is_gutter_drawn */
  final def isGutterDrawn(gutter: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("TextEdit", "is_gutter_drawn", 1116898809L), hostObject.objectPtr, gutter)

  /** TextEdit.set_gutter_clickable */
  final def setGutterClickable(gutter: Long, clickable: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("TextEdit", "set_gutter_clickable", 300928843L), hostObject.objectPtr, gutter, clickable)

  /** TextEdit.is_gutter_clickable */
  final def isGutterClickable(gutter: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("TextEdit", "is_gutter_clickable", 1116898809L), hostObject.objectPtr, gutter)

  /** TextEdit.set_gutter_overwritable */
  final def setGutterOverwritable(gutter: Long, overwritable: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("TextEdit", "set_gutter_overwritable", 300928843L), hostObject.objectPtr, gutter, overwritable)

  /** TextEdit.is_gutter_overwritable */
  final def isGutterOverwritable(gutter: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("TextEdit", "is_gutter_overwritable", 1116898809L), hostObject.objectPtr, gutter)

  /** TextEdit.merge_gutters */
  final def mergeGutters(from_line: Long, to_line: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("TextEdit", "merge_gutters", 3937882851L), hostObject.objectPtr, from_line, to_line)

  /** TextEdit.get_total_gutter_width */
  final def getTotalGutterWidth(): Long =
    Ptrcall.call0[Long](MethodBind.get("TextEdit", "get_total_gutter_width", 3905245786L), hostObject.objectPtr)

  /** TextEdit.set_line_gutter_text */
  final def setLineGutterText(line: Long, gutter: Long, text: String): Unit =
    Ptrcall.callVoid3(MethodBind.get("TextEdit", "set_line_gutter_text", 2285447957L), hostObject.objectPtr, line, gutter, text)

  /** TextEdit.get_line_gutter_text */
  final def getLineGutterText(line: Long, gutter: Long): String =
    Ptrcall.call2[Long, Long, String](MethodBind.get("TextEdit", "get_line_gutter_text", 1391810591L), hostObject.objectPtr, line, gutter)

  /** TextEdit.set_line_gutter_icon */
  final def setLineGutterIcon(line: Long, gutter: Long, icon: Texture2D): Unit =
    Ptrcall.callVoid3(MethodBind.get("TextEdit", "set_line_gutter_icon", 176101966L), hostObject.objectPtr, line, gutter, icon.hostObject)

  /** TextEdit.get_line_gutter_icon */
  final def getLineGutterIcon(line: Long, gutter: Long): GodotObject =
    Ptrcall.call2[Long, Long, GodotObject](MethodBind.get("TextEdit", "get_line_gutter_icon", 2584904275L), hostObject.objectPtr, line, gutter)

  /** TextEdit.set_line_gutter_item_color */
  final def setLineGutterItemColor(line: Long, gutter: Long, color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid3(MethodBind.get("TextEdit", "set_line_gutter_item_color", 3733378741L), hostObject.objectPtr, line, gutter, color)

  /** TextEdit.get_line_gutter_item_color */
  final def getLineGutterItemColor(line: Long, gutter: Long): gdext.builtin.Color =
    Ptrcall.call2[Long, Long, gdext.builtin.Color](MethodBind.get("TextEdit", "get_line_gutter_item_color", 2165839948L), hostObject.objectPtr, line, gutter)

  /** TextEdit.set_line_gutter_clickable */
  final def setLineGutterClickable(line: Long, gutter: Long, clickable: Boolean): Unit =
    Ptrcall.callVoid3(MethodBind.get("TextEdit", "set_line_gutter_clickable", 1383440665L), hostObject.objectPtr, line, gutter, clickable)

  /** TextEdit.is_line_gutter_clickable */
  final def isLineGutterClickable(line: Long, gutter: Long): Boolean =
    Ptrcall.call2[Long, Long, Boolean](MethodBind.get("TextEdit", "is_line_gutter_clickable", 2522259332L), hostObject.objectPtr, line, gutter)

  /** TextEdit.set_line_background_color */
  final def setLineBackgroundColor(line: Long, color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid2(MethodBind.get("TextEdit", "set_line_background_color", 2878471219L), hostObject.objectPtr, line, color)

  /** TextEdit.get_line_background_color */
  final def getLineBackgroundColor(line: Long): gdext.builtin.Color =
    Ptrcall.call1[Long, gdext.builtin.Color](MethodBind.get("TextEdit", "get_line_background_color", 3457211756L), hostObject.objectPtr, line)

  /** TextEdit.set_syntax_highlighter */
  final def setSyntaxHighlighter(syntax_highlighter: SyntaxHighlighter): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextEdit", "set_syntax_highlighter", 2765644541L), hostObject.objectPtr, syntax_highlighter.hostObject)

  /** TextEdit.get_syntax_highlighter */
  final def getSyntaxHighlighter(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("TextEdit", "get_syntax_highlighter", 2721131626L), hostObject.objectPtr)

  /** TextEdit.set_highlight_current_line */
  final def setHighlightCurrentLine(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextEdit", "set_highlight_current_line", 2586408642L), hostObject.objectPtr, enabled)

  /** TextEdit.is_highlight_current_line_enabled */
  final def isHighlightCurrentLineEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TextEdit", "is_highlight_current_line_enabled", 36873697L), hostObject.objectPtr)

  /** TextEdit.set_highlight_all_occurrences */
  final def setHighlightAllOccurrences(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextEdit", "set_highlight_all_occurrences", 2586408642L), hostObject.objectPtr, enabled)

  /** TextEdit.is_highlight_all_occurrences_enabled */
  final def isHighlightAllOccurrencesEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TextEdit", "is_highlight_all_occurrences_enabled", 36873697L), hostObject.objectPtr)

  /** TextEdit.get_draw_control_chars */
  final def getDrawControlChars(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TextEdit", "get_draw_control_chars", 36873697L), hostObject.objectPtr)

  /** TextEdit.set_draw_control_chars */
  final def setDrawControlChars(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextEdit", "set_draw_control_chars", 2586408642L), hostObject.objectPtr, enabled)

  /** TextEdit.set_draw_tabs */
  final def setDrawTabs(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextEdit", "set_draw_tabs", 2586408642L), hostObject.objectPtr, enabled)

  /** TextEdit.is_drawing_tabs */
  final def isDrawingTabs(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TextEdit", "is_drawing_tabs", 36873697L), hostObject.objectPtr)

  /** TextEdit.set_draw_spaces */
  final def setDrawSpaces(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextEdit", "set_draw_spaces", 2586408642L), hostObject.objectPtr, enabled)

  /** TextEdit.is_drawing_spaces */
  final def isDrawingSpaces(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TextEdit", "is_drawing_spaces", 36873697L), hostObject.objectPtr)

  /** TextEdit.get_menu */
  final def getMenu(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("TextEdit", "get_menu", 229722558L), hostObject.objectPtr)

  /** TextEdit.is_menu_visible */
  final def isMenuVisible(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TextEdit", "is_menu_visible", 36873697L), hostObject.objectPtr)

  /** TextEdit.menu_option */
  final def menuOption(option: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextEdit", "menu_option", 1286410249L), hostObject.objectPtr, option)

  /** TextEdit.adjust_carets_after_edit */
  final def adjustCaretsAfterEdit(caret: Long, from_line: Long, from_col: Long, to_line: Long, to_col: Long): Unit =
    Ptrcall.callVoid5(MethodBind.get("TextEdit", "adjust_carets_after_edit", 1770277138L), hostObject.objectPtr, caret, from_line, from_col, to_line, to_col)

  /** TextEdit.get_selection_line */
  final def getSelectionLine(caret_index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("TextEdit", "get_selection_line", 1591665591L), hostObject.objectPtr, caret_index)

  /** TextEdit.get_selection_column */
  final def getSelectionColumn(caret_index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("TextEdit", "get_selection_column", 1591665591L), hostObject.objectPtr, caret_index)

}

object TextEdit {
  /** Class metadata for Gd[TextEdit] lifetime management and casting. */
  given GodotClass[TextEdit] with {
    def className = "TextEdit"
    def isRefCounted = false
    def wrap(o: GodotObject): TextEdit = new TextEdit {}.withHost(o.objectPtr)
    def unwrap(t: TextEdit): GodotObject = t.hostObject
  }
}
