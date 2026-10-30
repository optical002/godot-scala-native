package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `LineEdit`, extends `Control`. */
abstract class LineEdit extends Control {
  override def godotClassName: String = "LineEdit"

  /** LineEdit.has_ime_text */
  final def hasImeText(): Boolean = {
    if (gdext.classes.LineEdit.mb_has_ime_text == null) gdext.classes.LineEdit.mb_has_ime_text = MethodBind.get("LineEdit", "has_ime_text", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.LineEdit.mb_has_ime_text, livePtr)
  }

  /** LineEdit.cancel_ime */
  final def cancelIme(): Unit = {
    if (gdext.classes.LineEdit.mb_cancel_ime == null) gdext.classes.LineEdit.mb_cancel_ime = MethodBind.get("LineEdit", "cancel_ime", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.LineEdit.mb_cancel_ime, livePtr)
  }

  /** LineEdit.apply_ime */
  final def applyIme(): Unit = {
    if (gdext.classes.LineEdit.mb_apply_ime == null) gdext.classes.LineEdit.mb_apply_ime = MethodBind.get("LineEdit", "apply_ime", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.LineEdit.mb_apply_ime, livePtr)
  }

  /** LineEdit.set_horizontal_alignment */
  final def setHorizontalAlignment(alignment: gdext.classes.HorizontalAlignment): Unit = {
    if (gdext.classes.LineEdit.mb_set_horizontal_alignment == null) gdext.classes.LineEdit.mb_set_horizontal_alignment = MethodBind.get("LineEdit", "set_horizontal_alignment", 2312603777L)
    Ptrcall.callVoid1(gdext.classes.LineEdit.mb_set_horizontal_alignment, livePtr, alignment)
  }

  /** LineEdit.get_horizontal_alignment */
  final def getHorizontalAlignment(): gdext.classes.HorizontalAlignment = {
    if (gdext.classes.LineEdit.mb_get_horizontal_alignment == null) gdext.classes.LineEdit.mb_get_horizontal_alignment = MethodBind.get("LineEdit", "get_horizontal_alignment", 341400642L)
    gdext.classes.HorizontalAlignment(Ptrcall.call0[Long](gdext.classes.LineEdit.mb_get_horizontal_alignment, livePtr))
  }

  /** LineEdit.edit */
  final def edit(hideFocus: Boolean = false): Unit = {
    if (gdext.classes.LineEdit.mb_edit == null) gdext.classes.LineEdit.mb_edit = MethodBind.get("LineEdit", "edit", 107499316L)
    Ptrcall.callVoid1(gdext.classes.LineEdit.mb_edit, livePtr, hideFocus)
  }

  /** LineEdit.unedit */
  final def unedit(): Unit = {
    if (gdext.classes.LineEdit.mb_unedit == null) gdext.classes.LineEdit.mb_unedit = MethodBind.get("LineEdit", "unedit", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.LineEdit.mb_unedit, livePtr)
  }

  /** LineEdit.is_editing */
  final def isEditing(): Boolean = {
    if (gdext.classes.LineEdit.mb_is_editing == null) gdext.classes.LineEdit.mb_is_editing = MethodBind.get("LineEdit", "is_editing", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.LineEdit.mb_is_editing, livePtr)
  }

  /** LineEdit.set_keep_editing_on_text_submit */
  final def setKeepEditingOnTextSubmit(enable: Boolean): Unit = {
    if (gdext.classes.LineEdit.mb_set_keep_editing_on_text_submit == null) gdext.classes.LineEdit.mb_set_keep_editing_on_text_submit = MethodBind.get("LineEdit", "set_keep_editing_on_text_submit", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.LineEdit.mb_set_keep_editing_on_text_submit, livePtr, enable)
  }

  /** LineEdit.is_editing_kept_on_text_submit */
  final def isEditingKeptOnTextSubmit(): Boolean = {
    if (gdext.classes.LineEdit.mb_is_editing_kept_on_text_submit == null) gdext.classes.LineEdit.mb_is_editing_kept_on_text_submit = MethodBind.get("LineEdit", "is_editing_kept_on_text_submit", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.LineEdit.mb_is_editing_kept_on_text_submit, livePtr)
  }

  /** LineEdit.clear */
  final def clear(): Unit = {
    if (gdext.classes.LineEdit.mb_clear == null) gdext.classes.LineEdit.mb_clear = MethodBind.get("LineEdit", "clear", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.LineEdit.mb_clear, livePtr)
  }

  /** LineEdit.select */
  final def select(from: Long = 0L, to: Long = -1L): Unit = {
    if (gdext.classes.LineEdit.mb_select == null) gdext.classes.LineEdit.mb_select = MethodBind.get("LineEdit", "select", 1328111411L)
    Ptrcall.callVoid2(gdext.classes.LineEdit.mb_select, livePtr, from, to)
  }

  /** LineEdit.select_all */
  final def selectAll(): Unit = {
    if (gdext.classes.LineEdit.mb_select_all == null) gdext.classes.LineEdit.mb_select_all = MethodBind.get("LineEdit", "select_all", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.LineEdit.mb_select_all, livePtr)
  }

  /** LineEdit.deselect */
  final def deselect(): Unit = {
    if (gdext.classes.LineEdit.mb_deselect == null) gdext.classes.LineEdit.mb_deselect = MethodBind.get("LineEdit", "deselect", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.LineEdit.mb_deselect, livePtr)
  }

  /** LineEdit.has_undo */
  final def hasUndo(): Boolean = {
    if (gdext.classes.LineEdit.mb_has_undo == null) gdext.classes.LineEdit.mb_has_undo = MethodBind.get("LineEdit", "has_undo", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.LineEdit.mb_has_undo, livePtr)
  }

  /** LineEdit.has_redo */
  final def hasRedo(): Boolean = {
    if (gdext.classes.LineEdit.mb_has_redo == null) gdext.classes.LineEdit.mb_has_redo = MethodBind.get("LineEdit", "has_redo", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.LineEdit.mb_has_redo, livePtr)
  }

  /** LineEdit.has_selection */
  final def hasSelection(): Boolean = {
    if (gdext.classes.LineEdit.mb_has_selection == null) gdext.classes.LineEdit.mb_has_selection = MethodBind.get("LineEdit", "has_selection", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.LineEdit.mb_has_selection, livePtr)
  }

  /** LineEdit.get_selected_text */
  final def getSelectedText(): String = {
    if (gdext.classes.LineEdit.mb_get_selected_text == null) gdext.classes.LineEdit.mb_get_selected_text = MethodBind.get("LineEdit", "get_selected_text", 2841200299L)
    Ptrcall.call0[String](gdext.classes.LineEdit.mb_get_selected_text, livePtr)
  }

  /** LineEdit.get_selection_from_column */
  final def getSelectionFromColumn(): Long = {
    if (gdext.classes.LineEdit.mb_get_selection_from_column == null) gdext.classes.LineEdit.mb_get_selection_from_column = MethodBind.get("LineEdit", "get_selection_from_column", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.LineEdit.mb_get_selection_from_column, livePtr)
  }

  /** LineEdit.get_selection_to_column */
  final def getSelectionToColumn(): Long = {
    if (gdext.classes.LineEdit.mb_get_selection_to_column == null) gdext.classes.LineEdit.mb_get_selection_to_column = MethodBind.get("LineEdit", "get_selection_to_column", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.LineEdit.mb_get_selection_to_column, livePtr)
  }

  /** LineEdit.set_text */
  final def setText(text: String): Unit = {
    if (gdext.classes.LineEdit.mb_set_text == null) gdext.classes.LineEdit.mb_set_text = MethodBind.get("LineEdit", "set_text", 83702148L)
    Ptrcall.callVoid1(gdext.classes.LineEdit.mb_set_text, livePtr, text)
  }

  /** LineEdit.get_text */
  final def getText(): String = {
    if (gdext.classes.LineEdit.mb_get_text == null) gdext.classes.LineEdit.mb_get_text = MethodBind.get("LineEdit", "get_text", 201670096L)
    Ptrcall.call0[String](gdext.classes.LineEdit.mb_get_text, livePtr)
  }

  /** LineEdit.get_draw_control_chars */
  final def getDrawControlChars(): Boolean = {
    if (gdext.classes.LineEdit.mb_get_draw_control_chars == null) gdext.classes.LineEdit.mb_get_draw_control_chars = MethodBind.get("LineEdit", "get_draw_control_chars", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.LineEdit.mb_get_draw_control_chars, livePtr)
  }

  /** LineEdit.set_draw_control_chars */
  final def setDrawControlChars(enable: Boolean): Unit = {
    if (gdext.classes.LineEdit.mb_set_draw_control_chars == null) gdext.classes.LineEdit.mb_set_draw_control_chars = MethodBind.get("LineEdit", "set_draw_control_chars", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.LineEdit.mb_set_draw_control_chars, livePtr, enable)
  }

  /** LineEdit.set_text_direction */
  final def setTextDirection(direction: gdext.classes.Control.TextDirection): Unit = {
    if (gdext.classes.LineEdit.mb_set_text_direction == null) gdext.classes.LineEdit.mb_set_text_direction = MethodBind.get("LineEdit", "set_text_direction", 119160795L)
    Ptrcall.callVoid1(gdext.classes.LineEdit.mb_set_text_direction, livePtr, direction)
  }

  /** LineEdit.get_text_direction */
  final def getTextDirection(): gdext.classes.Control.TextDirection = {
    if (gdext.classes.LineEdit.mb_get_text_direction == null) gdext.classes.LineEdit.mb_get_text_direction = MethodBind.get("LineEdit", "get_text_direction", 797257663L)
    gdext.classes.Control.TextDirection(Ptrcall.call0[Long](gdext.classes.LineEdit.mb_get_text_direction, livePtr))
  }

  /** LineEdit.set_language */
  final def setLanguage(language: String): Unit = {
    if (gdext.classes.LineEdit.mb_set_language == null) gdext.classes.LineEdit.mb_set_language = MethodBind.get("LineEdit", "set_language", 83702148L)
    Ptrcall.callVoid1(gdext.classes.LineEdit.mb_set_language, livePtr, language)
  }

  /** LineEdit.get_language */
  final def getLanguage(): String = {
    if (gdext.classes.LineEdit.mb_get_language == null) gdext.classes.LineEdit.mb_get_language = MethodBind.get("LineEdit", "get_language", 201670096L)
    Ptrcall.call0[String](gdext.classes.LineEdit.mb_get_language, livePtr)
  }

  /** LineEdit.set_structured_text_bidi_override */
  final def setStructuredTextBidiOverride(parser: gdext.classes.TextServer.StructuredTextParser): Unit = {
    if (gdext.classes.LineEdit.mb_set_structured_text_bidi_override == null) gdext.classes.LineEdit.mb_set_structured_text_bidi_override = MethodBind.get("LineEdit", "set_structured_text_bidi_override", 55961453L)
    Ptrcall.callVoid1(gdext.classes.LineEdit.mb_set_structured_text_bidi_override, livePtr, parser)
  }

  /** LineEdit.get_structured_text_bidi_override */
  final def getStructuredTextBidiOverride(): gdext.classes.TextServer.StructuredTextParser = {
    if (gdext.classes.LineEdit.mb_get_structured_text_bidi_override == null) gdext.classes.LineEdit.mb_get_structured_text_bidi_override = MethodBind.get("LineEdit", "get_structured_text_bidi_override", 3385126229L)
    gdext.classes.TextServer.StructuredTextParser(Ptrcall.call0[Long](gdext.classes.LineEdit.mb_get_structured_text_bidi_override, livePtr))
  }

  /** LineEdit.set_placeholder */
  final def setPlaceholder(text: String): Unit = {
    if (gdext.classes.LineEdit.mb_set_placeholder == null) gdext.classes.LineEdit.mb_set_placeholder = MethodBind.get("LineEdit", "set_placeholder", 83702148L)
    Ptrcall.callVoid1(gdext.classes.LineEdit.mb_set_placeholder, livePtr, text)
  }

  /** LineEdit.get_placeholder */
  final def getPlaceholder(): String = {
    if (gdext.classes.LineEdit.mb_get_placeholder == null) gdext.classes.LineEdit.mb_get_placeholder = MethodBind.get("LineEdit", "get_placeholder", 201670096L)
    Ptrcall.call0[String](gdext.classes.LineEdit.mb_get_placeholder, livePtr)
  }

  /** LineEdit.set_caret_column */
  final def setCaretColumn(position: Long): Unit = {
    if (gdext.classes.LineEdit.mb_set_caret_column == null) gdext.classes.LineEdit.mb_set_caret_column = MethodBind.get("LineEdit", "set_caret_column", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.LineEdit.mb_set_caret_column, livePtr, position)
  }

  /** LineEdit.get_caret_column */
  final def getCaretColumn(): Long = {
    if (gdext.classes.LineEdit.mb_get_caret_column == null) gdext.classes.LineEdit.mb_get_caret_column = MethodBind.get("LineEdit", "get_caret_column", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.LineEdit.mb_get_caret_column, livePtr)
  }

  /** LineEdit.get_next_composite_character_column */
  final def getNextCompositeCharacterColumn(column: Long): Long = {
    if (gdext.classes.LineEdit.mb_get_next_composite_character_column == null) gdext.classes.LineEdit.mb_get_next_composite_character_column = MethodBind.get("LineEdit", "get_next_composite_character_column", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.LineEdit.mb_get_next_composite_character_column, livePtr, column)
  }

  /** LineEdit.get_previous_composite_character_column */
  final def getPreviousCompositeCharacterColumn(column: Long): Long = {
    if (gdext.classes.LineEdit.mb_get_previous_composite_character_column == null) gdext.classes.LineEdit.mb_get_previous_composite_character_column = MethodBind.get("LineEdit", "get_previous_composite_character_column", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.LineEdit.mb_get_previous_composite_character_column, livePtr, column)
  }

  /** LineEdit.get_scroll_offset */
  final def getScrollOffset(): Double = {
    if (gdext.classes.LineEdit.mb_get_scroll_offset == null) gdext.classes.LineEdit.mb_get_scroll_offset = MethodBind.get("LineEdit", "get_scroll_offset", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.LineEdit.mb_get_scroll_offset, livePtr)
  }

  /** LineEdit.set_expand_to_text_length_enabled */
  final def setExpandToTextLengthEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.LineEdit.mb_set_expand_to_text_length_enabled == null) gdext.classes.LineEdit.mb_set_expand_to_text_length_enabled = MethodBind.get("LineEdit", "set_expand_to_text_length_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.LineEdit.mb_set_expand_to_text_length_enabled, livePtr, enabled)
  }

  /** LineEdit.is_expand_to_text_length_enabled */
  final def isExpandToTextLengthEnabled(): Boolean = {
    if (gdext.classes.LineEdit.mb_is_expand_to_text_length_enabled == null) gdext.classes.LineEdit.mb_is_expand_to_text_length_enabled = MethodBind.get("LineEdit", "is_expand_to_text_length_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.LineEdit.mb_is_expand_to_text_length_enabled, livePtr)
  }

  /** LineEdit.set_caret_blink_enabled */
  final def setCaretBlinkEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.LineEdit.mb_set_caret_blink_enabled == null) gdext.classes.LineEdit.mb_set_caret_blink_enabled = MethodBind.get("LineEdit", "set_caret_blink_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.LineEdit.mb_set_caret_blink_enabled, livePtr, enabled)
  }

  /** LineEdit.is_caret_blink_enabled */
  final def isCaretBlinkEnabled(): Boolean = {
    if (gdext.classes.LineEdit.mb_is_caret_blink_enabled == null) gdext.classes.LineEdit.mb_is_caret_blink_enabled = MethodBind.get("LineEdit", "is_caret_blink_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.LineEdit.mb_is_caret_blink_enabled, livePtr)
  }

  /** LineEdit.set_caret_mid_grapheme_enabled */
  final def setCaretMidGraphemeEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.LineEdit.mb_set_caret_mid_grapheme_enabled == null) gdext.classes.LineEdit.mb_set_caret_mid_grapheme_enabled = MethodBind.get("LineEdit", "set_caret_mid_grapheme_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.LineEdit.mb_set_caret_mid_grapheme_enabled, livePtr, enabled)
  }

  /** LineEdit.is_caret_mid_grapheme_enabled */
  final def isCaretMidGraphemeEnabled(): Boolean = {
    if (gdext.classes.LineEdit.mb_is_caret_mid_grapheme_enabled == null) gdext.classes.LineEdit.mb_is_caret_mid_grapheme_enabled = MethodBind.get("LineEdit", "is_caret_mid_grapheme_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.LineEdit.mb_is_caret_mid_grapheme_enabled, livePtr)
  }

  /** LineEdit.set_caret_force_displayed */
  final def setCaretForceDisplayed(enabled: Boolean): Unit = {
    if (gdext.classes.LineEdit.mb_set_caret_force_displayed == null) gdext.classes.LineEdit.mb_set_caret_force_displayed = MethodBind.get("LineEdit", "set_caret_force_displayed", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.LineEdit.mb_set_caret_force_displayed, livePtr, enabled)
  }

  /** LineEdit.is_caret_force_displayed */
  final def isCaretForceDisplayed(): Boolean = {
    if (gdext.classes.LineEdit.mb_is_caret_force_displayed == null) gdext.classes.LineEdit.mb_is_caret_force_displayed = MethodBind.get("LineEdit", "is_caret_force_displayed", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.LineEdit.mb_is_caret_force_displayed, livePtr)
  }

  /** LineEdit.set_caret_blink_interval */
  final def setCaretBlinkInterval(interval: Double): Unit = {
    if (gdext.classes.LineEdit.mb_set_caret_blink_interval == null) gdext.classes.LineEdit.mb_set_caret_blink_interval = MethodBind.get("LineEdit", "set_caret_blink_interval", 373806689L)
    Ptrcall.callVoid1(gdext.classes.LineEdit.mb_set_caret_blink_interval, livePtr, interval)
  }

  /** LineEdit.get_caret_blink_interval */
  final def getCaretBlinkInterval(): Double = {
    if (gdext.classes.LineEdit.mb_get_caret_blink_interval == null) gdext.classes.LineEdit.mb_get_caret_blink_interval = MethodBind.get("LineEdit", "get_caret_blink_interval", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.LineEdit.mb_get_caret_blink_interval, livePtr)
  }

  /** LineEdit.set_max_length */
  final def setMaxLength(chars: Long): Unit = {
    if (gdext.classes.LineEdit.mb_set_max_length == null) gdext.classes.LineEdit.mb_set_max_length = MethodBind.get("LineEdit", "set_max_length", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.LineEdit.mb_set_max_length, livePtr, chars)
  }

  /** LineEdit.get_max_length */
  final def getMaxLength(): Long = {
    if (gdext.classes.LineEdit.mb_get_max_length == null) gdext.classes.LineEdit.mb_get_max_length = MethodBind.get("LineEdit", "get_max_length", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.LineEdit.mb_get_max_length, livePtr)
  }

  /** LineEdit.insert_text_at_caret */
  final def insertTextAtCaret(text: String): Unit = {
    if (gdext.classes.LineEdit.mb_insert_text_at_caret == null) gdext.classes.LineEdit.mb_insert_text_at_caret = MethodBind.get("LineEdit", "insert_text_at_caret", 83702148L)
    Ptrcall.callVoid1(gdext.classes.LineEdit.mb_insert_text_at_caret, livePtr, text)
  }

  /** LineEdit.delete_char_at_caret */
  final def deleteCharAtCaret(): Unit = {
    if (gdext.classes.LineEdit.mb_delete_char_at_caret == null) gdext.classes.LineEdit.mb_delete_char_at_caret = MethodBind.get("LineEdit", "delete_char_at_caret", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.LineEdit.mb_delete_char_at_caret, livePtr)
  }

  /** LineEdit.delete_text */
  final def deleteText(fromColumn: Long, toColumn: Long): Unit = {
    if (gdext.classes.LineEdit.mb_delete_text == null) gdext.classes.LineEdit.mb_delete_text = MethodBind.get("LineEdit", "delete_text", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.LineEdit.mb_delete_text, livePtr, fromColumn, toColumn)
  }

  /** LineEdit.set_editable */
  final def setEditable(enabled: Boolean): Unit = {
    if (gdext.classes.LineEdit.mb_set_editable == null) gdext.classes.LineEdit.mb_set_editable = MethodBind.get("LineEdit", "set_editable", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.LineEdit.mb_set_editable, livePtr, enabled)
  }

  /** LineEdit.is_editable */
  final def isEditable(): Boolean = {
    if (gdext.classes.LineEdit.mb_is_editable == null) gdext.classes.LineEdit.mb_is_editable = MethodBind.get("LineEdit", "is_editable", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.LineEdit.mb_is_editable, livePtr)
  }

  /** LineEdit.set_secret */
  final def setSecret(enabled: Boolean): Unit = {
    if (gdext.classes.LineEdit.mb_set_secret == null) gdext.classes.LineEdit.mb_set_secret = MethodBind.get("LineEdit", "set_secret", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.LineEdit.mb_set_secret, livePtr, enabled)
  }

  /** LineEdit.is_secret */
  final def isSecret(): Boolean = {
    if (gdext.classes.LineEdit.mb_is_secret == null) gdext.classes.LineEdit.mb_is_secret = MethodBind.get("LineEdit", "is_secret", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.LineEdit.mb_is_secret, livePtr)
  }

  /** LineEdit.set_secret_character */
  final def setSecretCharacter(character: String): Unit = {
    if (gdext.classes.LineEdit.mb_set_secret_character == null) gdext.classes.LineEdit.mb_set_secret_character = MethodBind.get("LineEdit", "set_secret_character", 83702148L)
    Ptrcall.callVoid1(gdext.classes.LineEdit.mb_set_secret_character, livePtr, character)
  }

  /** LineEdit.get_secret_character */
  final def getSecretCharacter(): String = {
    if (gdext.classes.LineEdit.mb_get_secret_character == null) gdext.classes.LineEdit.mb_get_secret_character = MethodBind.get("LineEdit", "get_secret_character", 201670096L)
    Ptrcall.call0[String](gdext.classes.LineEdit.mb_get_secret_character, livePtr)
  }

  /** LineEdit.menu_option */
  final def menuOption(option: Long): Unit = {
    if (gdext.classes.LineEdit.mb_menu_option == null) gdext.classes.LineEdit.mb_menu_option = MethodBind.get("LineEdit", "menu_option", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.LineEdit.mb_menu_option, livePtr, option)
  }

  /** LineEdit.get_menu */
  final def getMenu(): PopupMenu = {
    if (gdext.classes.LineEdit.mb_get_menu == null) gdext.classes.LineEdit.mb_get_menu = MethodBind.get("LineEdit", "get_menu", 229722558L)
    Wrappers.borrowed[PopupMenu](Ptrcall.call0[Long](gdext.classes.LineEdit.mb_get_menu, livePtr))
  }

  /** LineEdit.is_menu_visible */
  final def isMenuVisible(): Boolean = {
    if (gdext.classes.LineEdit.mb_is_menu_visible == null) gdext.classes.LineEdit.mb_is_menu_visible = MethodBind.get("LineEdit", "is_menu_visible", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.LineEdit.mb_is_menu_visible, livePtr)
  }

  /** LineEdit.set_context_menu_enabled */
  final def setContextMenuEnabled(enable: Boolean): Unit = {
    if (gdext.classes.LineEdit.mb_set_context_menu_enabled == null) gdext.classes.LineEdit.mb_set_context_menu_enabled = MethodBind.get("LineEdit", "set_context_menu_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.LineEdit.mb_set_context_menu_enabled, livePtr, enable)
  }

  /** LineEdit.is_context_menu_enabled */
  final def isContextMenuEnabled(): Boolean = {
    if (gdext.classes.LineEdit.mb_is_context_menu_enabled == null) gdext.classes.LineEdit.mb_is_context_menu_enabled = MethodBind.get("LineEdit", "is_context_menu_enabled", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.LineEdit.mb_is_context_menu_enabled, livePtr)
  }

  /** LineEdit.set_emoji_menu_enabled */
  final def setEmojiMenuEnabled(enable: Boolean): Unit = {
    if (gdext.classes.LineEdit.mb_set_emoji_menu_enabled == null) gdext.classes.LineEdit.mb_set_emoji_menu_enabled = MethodBind.get("LineEdit", "set_emoji_menu_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.LineEdit.mb_set_emoji_menu_enabled, livePtr, enable)
  }

  /** LineEdit.is_emoji_menu_enabled */
  final def isEmojiMenuEnabled(): Boolean = {
    if (gdext.classes.LineEdit.mb_is_emoji_menu_enabled == null) gdext.classes.LineEdit.mb_is_emoji_menu_enabled = MethodBind.get("LineEdit", "is_emoji_menu_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.LineEdit.mb_is_emoji_menu_enabled, livePtr)
  }

  /** LineEdit.set_backspace_deletes_composite_character_enabled */
  final def setBackspaceDeletesCompositeCharacterEnabled(enable: Boolean): Unit = {
    if (gdext.classes.LineEdit.mb_set_backspace_deletes_composite_character_enabled == null) gdext.classes.LineEdit.mb_set_backspace_deletes_composite_character_enabled = MethodBind.get("LineEdit", "set_backspace_deletes_composite_character_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.LineEdit.mb_set_backspace_deletes_composite_character_enabled, livePtr, enable)
  }

  /** LineEdit.is_backspace_deletes_composite_character_enabled */
  final def isBackspaceDeletesCompositeCharacterEnabled(): Boolean = {
    if (gdext.classes.LineEdit.mb_is_backspace_deletes_composite_character_enabled == null) gdext.classes.LineEdit.mb_is_backspace_deletes_composite_character_enabled = MethodBind.get("LineEdit", "is_backspace_deletes_composite_character_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.LineEdit.mb_is_backspace_deletes_composite_character_enabled, livePtr)
  }

  /** LineEdit.set_virtual_keyboard_enabled */
  final def setVirtualKeyboardEnabled(enable: Boolean): Unit = {
    if (gdext.classes.LineEdit.mb_set_virtual_keyboard_enabled == null) gdext.classes.LineEdit.mb_set_virtual_keyboard_enabled = MethodBind.get("LineEdit", "set_virtual_keyboard_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.LineEdit.mb_set_virtual_keyboard_enabled, livePtr, enable)
  }

  /** LineEdit.is_virtual_keyboard_enabled */
  final def isVirtualKeyboardEnabled(): Boolean = {
    if (gdext.classes.LineEdit.mb_is_virtual_keyboard_enabled == null) gdext.classes.LineEdit.mb_is_virtual_keyboard_enabled = MethodBind.get("LineEdit", "is_virtual_keyboard_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.LineEdit.mb_is_virtual_keyboard_enabled, livePtr)
  }

  /** LineEdit.set_virtual_keyboard_show_on_focus */
  final def setVirtualKeyboardShowOnFocus(showOnFocus: Boolean): Unit = {
    if (gdext.classes.LineEdit.mb_set_virtual_keyboard_show_on_focus == null) gdext.classes.LineEdit.mb_set_virtual_keyboard_show_on_focus = MethodBind.get("LineEdit", "set_virtual_keyboard_show_on_focus", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.LineEdit.mb_set_virtual_keyboard_show_on_focus, livePtr, showOnFocus)
  }

  /** LineEdit.get_virtual_keyboard_show_on_focus */
  final def getVirtualKeyboardShowOnFocus(): Boolean = {
    if (gdext.classes.LineEdit.mb_get_virtual_keyboard_show_on_focus == null) gdext.classes.LineEdit.mb_get_virtual_keyboard_show_on_focus = MethodBind.get("LineEdit", "get_virtual_keyboard_show_on_focus", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.LineEdit.mb_get_virtual_keyboard_show_on_focus, livePtr)
  }

  /** LineEdit.set_virtual_keyboard_type */
  final def setVirtualKeyboardType(`type`: gdext.classes.LineEdit.VirtualKeyboardType): Unit = {
    if (gdext.classes.LineEdit.mb_set_virtual_keyboard_type == null) gdext.classes.LineEdit.mb_set_virtual_keyboard_type = MethodBind.get("LineEdit", "set_virtual_keyboard_type", 2696893573L)
    Ptrcall.callVoid1(gdext.classes.LineEdit.mb_set_virtual_keyboard_type, livePtr, `type`)
  }

  /** LineEdit.get_virtual_keyboard_type */
  final def getVirtualKeyboardType(): gdext.classes.LineEdit.VirtualKeyboardType = {
    if (gdext.classes.LineEdit.mb_get_virtual_keyboard_type == null) gdext.classes.LineEdit.mb_get_virtual_keyboard_type = MethodBind.get("LineEdit", "get_virtual_keyboard_type", 1928699316L)
    gdext.classes.LineEdit.VirtualKeyboardType(Ptrcall.call0[Long](gdext.classes.LineEdit.mb_get_virtual_keyboard_type, livePtr))
  }

  /** LineEdit.set_clear_button_enabled */
  final def setClearButtonEnabled(enable: Boolean): Unit = {
    if (gdext.classes.LineEdit.mb_set_clear_button_enabled == null) gdext.classes.LineEdit.mb_set_clear_button_enabled = MethodBind.get("LineEdit", "set_clear_button_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.LineEdit.mb_set_clear_button_enabled, livePtr, enable)
  }

  /** LineEdit.is_clear_button_enabled */
  final def isClearButtonEnabled(): Boolean = {
    if (gdext.classes.LineEdit.mb_is_clear_button_enabled == null) gdext.classes.LineEdit.mb_is_clear_button_enabled = MethodBind.get("LineEdit", "is_clear_button_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.LineEdit.mb_is_clear_button_enabled, livePtr)
  }

  /** LineEdit.set_shortcut_keys_enabled */
  final def setShortcutKeysEnabled(enable: Boolean): Unit = {
    if (gdext.classes.LineEdit.mb_set_shortcut_keys_enabled == null) gdext.classes.LineEdit.mb_set_shortcut_keys_enabled = MethodBind.get("LineEdit", "set_shortcut_keys_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.LineEdit.mb_set_shortcut_keys_enabled, livePtr, enable)
  }

  /** LineEdit.is_shortcut_keys_enabled */
  final def isShortcutKeysEnabled(): Boolean = {
    if (gdext.classes.LineEdit.mb_is_shortcut_keys_enabled == null) gdext.classes.LineEdit.mb_is_shortcut_keys_enabled = MethodBind.get("LineEdit", "is_shortcut_keys_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.LineEdit.mb_is_shortcut_keys_enabled, livePtr)
  }

  /** LineEdit.set_middle_mouse_paste_enabled */
  final def setMiddleMousePasteEnabled(enable: Boolean): Unit = {
    if (gdext.classes.LineEdit.mb_set_middle_mouse_paste_enabled == null) gdext.classes.LineEdit.mb_set_middle_mouse_paste_enabled = MethodBind.get("LineEdit", "set_middle_mouse_paste_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.LineEdit.mb_set_middle_mouse_paste_enabled, livePtr, enable)
  }

  /** LineEdit.is_middle_mouse_paste_enabled */
  final def isMiddleMousePasteEnabled(): Boolean = {
    if (gdext.classes.LineEdit.mb_is_middle_mouse_paste_enabled == null) gdext.classes.LineEdit.mb_is_middle_mouse_paste_enabled = MethodBind.get("LineEdit", "is_middle_mouse_paste_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.LineEdit.mb_is_middle_mouse_paste_enabled, livePtr)
  }

  /** LineEdit.set_selecting_enabled */
  final def setSelectingEnabled(enable: Boolean): Unit = {
    if (gdext.classes.LineEdit.mb_set_selecting_enabled == null) gdext.classes.LineEdit.mb_set_selecting_enabled = MethodBind.get("LineEdit", "set_selecting_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.LineEdit.mb_set_selecting_enabled, livePtr, enable)
  }

  /** LineEdit.is_selecting_enabled */
  final def isSelectingEnabled(): Boolean = {
    if (gdext.classes.LineEdit.mb_is_selecting_enabled == null) gdext.classes.LineEdit.mb_is_selecting_enabled = MethodBind.get("LineEdit", "is_selecting_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.LineEdit.mb_is_selecting_enabled, livePtr)
  }

  /** LineEdit.set_deselect_on_focus_loss_enabled */
  final def setDeselectOnFocusLossEnabled(enable: Boolean): Unit = {
    if (gdext.classes.LineEdit.mb_set_deselect_on_focus_loss_enabled == null) gdext.classes.LineEdit.mb_set_deselect_on_focus_loss_enabled = MethodBind.get("LineEdit", "set_deselect_on_focus_loss_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.LineEdit.mb_set_deselect_on_focus_loss_enabled, livePtr, enable)
  }

  /** LineEdit.is_deselect_on_focus_loss_enabled */
  final def isDeselectOnFocusLossEnabled(): Boolean = {
    if (gdext.classes.LineEdit.mb_is_deselect_on_focus_loss_enabled == null) gdext.classes.LineEdit.mb_is_deselect_on_focus_loss_enabled = MethodBind.get("LineEdit", "is_deselect_on_focus_loss_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.LineEdit.mb_is_deselect_on_focus_loss_enabled, livePtr)
  }

  /** LineEdit.set_drag_and_drop_selection_enabled */
  final def setDragAndDropSelectionEnabled(enable: Boolean): Unit = {
    if (gdext.classes.LineEdit.mb_set_drag_and_drop_selection_enabled == null) gdext.classes.LineEdit.mb_set_drag_and_drop_selection_enabled = MethodBind.get("LineEdit", "set_drag_and_drop_selection_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.LineEdit.mb_set_drag_and_drop_selection_enabled, livePtr, enable)
  }

  /** LineEdit.is_drag_and_drop_selection_enabled */
  final def isDragAndDropSelectionEnabled(): Boolean = {
    if (gdext.classes.LineEdit.mb_is_drag_and_drop_selection_enabled == null) gdext.classes.LineEdit.mb_is_drag_and_drop_selection_enabled = MethodBind.get("LineEdit", "is_drag_and_drop_selection_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.LineEdit.mb_is_drag_and_drop_selection_enabled, livePtr)
  }

  /** LineEdit.set_right_icon */
  final def setRightIcon(icon: Texture2D): Unit = {
    if (gdext.classes.LineEdit.mb_set_right_icon == null) gdext.classes.LineEdit.mb_set_right_icon = MethodBind.get("LineEdit", "set_right_icon", 4051416890L)
    Ptrcall.callVoid1(gdext.classes.LineEdit.mb_set_right_icon, livePtr, Wrappers.handle(icon))
  }

  /** LineEdit.get_right_icon. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getRightIcon(): Texture2D = {
    if (gdext.classes.LineEdit.mb_get_right_icon == null) gdext.classes.LineEdit.mb_get_right_icon = MethodBind.get("LineEdit", "get_right_icon", 255860311L)
    Wrappers.owned[Texture2D](Ptrcall.call0[Long](gdext.classes.LineEdit.mb_get_right_icon, livePtr))
  }

  /** LineEdit.set_icon_expand_mode */
  final def setIconExpandMode(mode: gdext.classes.LineEdit.ExpandMode): Unit = {
    if (gdext.classes.LineEdit.mb_set_icon_expand_mode == null) gdext.classes.LineEdit.mb_set_icon_expand_mode = MethodBind.get("LineEdit", "set_icon_expand_mode", 3019903192L)
    Ptrcall.callVoid1(gdext.classes.LineEdit.mb_set_icon_expand_mode, livePtr, mode)
  }

  /** LineEdit.get_icon_expand_mode */
  final def getIconExpandMode(): gdext.classes.LineEdit.ExpandMode = {
    if (gdext.classes.LineEdit.mb_get_icon_expand_mode == null) gdext.classes.LineEdit.mb_get_icon_expand_mode = MethodBind.get("LineEdit", "get_icon_expand_mode", 3273584435L)
    gdext.classes.LineEdit.ExpandMode(Ptrcall.call0[Long](gdext.classes.LineEdit.mb_get_icon_expand_mode, livePtr))
  }

  /** LineEdit.set_right_icon_scale */
  final def setRightIconScale(scale: Double): Unit = {
    if (gdext.classes.LineEdit.mb_set_right_icon_scale == null) gdext.classes.LineEdit.mb_set_right_icon_scale = MethodBind.get("LineEdit", "set_right_icon_scale", 373806689L)
    Ptrcall.callVoid1(gdext.classes.LineEdit.mb_set_right_icon_scale, livePtr, scale)
  }

  /** LineEdit.get_right_icon_scale */
  final def getRightIconScale(): Double = {
    if (gdext.classes.LineEdit.mb_get_right_icon_scale == null) gdext.classes.LineEdit.mb_get_right_icon_scale = MethodBind.get("LineEdit", "get_right_icon_scale", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.LineEdit.mb_get_right_icon_scale, livePtr)
  }

  /** LineEdit.set_flat */
  final def setFlat(enabled: Boolean): Unit = {
    if (gdext.classes.LineEdit.mb_set_flat == null) gdext.classes.LineEdit.mb_set_flat = MethodBind.get("LineEdit", "set_flat", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.LineEdit.mb_set_flat, livePtr, enabled)
  }

  /** LineEdit.is_flat */
  final def isFlat(): Boolean = {
    if (gdext.classes.LineEdit.mb_is_flat == null) gdext.classes.LineEdit.mb_is_flat = MethodBind.get("LineEdit", "is_flat", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.LineEdit.mb_is_flat, livePtr)
  }

  /** LineEdit.set_select_all_on_focus */
  final def setSelectAllOnFocus(enabled: Boolean): Unit = {
    if (gdext.classes.LineEdit.mb_set_select_all_on_focus == null) gdext.classes.LineEdit.mb_set_select_all_on_focus = MethodBind.get("LineEdit", "set_select_all_on_focus", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.LineEdit.mb_set_select_all_on_focus, livePtr, enabled)
  }

  /** LineEdit.is_select_all_on_focus */
  final def isSelectAllOnFocus(): Boolean = {
    if (gdext.classes.LineEdit.mb_is_select_all_on_focus == null) gdext.classes.LineEdit.mb_is_select_all_on_focus = MethodBind.get("LineEdit", "is_select_all_on_focus", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.LineEdit.mb_is_select_all_on_focus, livePtr)
  }

}

object LineEdit {
  private[classes] var mb_has_ime_text: GDExtensionMethodBindPtr = null
  private[classes] var mb_cancel_ime: GDExtensionMethodBindPtr = null
  private[classes] var mb_apply_ime: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_horizontal_alignment: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_horizontal_alignment: GDExtensionMethodBindPtr = null
  private[classes] var mb_edit: GDExtensionMethodBindPtr = null
  private[classes] var mb_unedit: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_editing: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_keep_editing_on_text_submit: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_editing_kept_on_text_submit: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear: GDExtensionMethodBindPtr = null
  private[classes] var mb_select: GDExtensionMethodBindPtr = null
  private[classes] var mb_select_all: GDExtensionMethodBindPtr = null
  private[classes] var mb_deselect: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_undo: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_redo: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_selection: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_selected_text: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_selection_from_column: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_selection_to_column: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_text: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_text: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_draw_control_chars: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_draw_control_chars: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_text_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_text_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_language: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_language: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_structured_text_bidi_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_structured_text_bidi_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_placeholder: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_placeholder: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_caret_column: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_caret_column: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_next_composite_character_column: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_previous_composite_character_column: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_scroll_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_expand_to_text_length_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_expand_to_text_length_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_caret_blink_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_caret_blink_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_caret_mid_grapheme_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_caret_mid_grapheme_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_caret_force_displayed: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_caret_force_displayed: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_caret_blink_interval: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_caret_blink_interval: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_max_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_max_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_insert_text_at_caret: GDExtensionMethodBindPtr = null
  private[classes] var mb_delete_char_at_caret: GDExtensionMethodBindPtr = null
  private[classes] var mb_delete_text: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_editable: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_editable: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_secret: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_secret: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_secret_character: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_secret_character: GDExtensionMethodBindPtr = null
  private[classes] var mb_menu_option: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_menu: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_menu_visible: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_context_menu_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_context_menu_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_emoji_menu_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_emoji_menu_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_backspace_deletes_composite_character_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_backspace_deletes_composite_character_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_virtual_keyboard_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_virtual_keyboard_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_virtual_keyboard_show_on_focus: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_virtual_keyboard_show_on_focus: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_virtual_keyboard_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_virtual_keyboard_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_clear_button_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_clear_button_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_shortcut_keys_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_shortcut_keys_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_middle_mouse_paste_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_middle_mouse_paste_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_selecting_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_selecting_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_deselect_on_focus_loss_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_deselect_on_focus_loss_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_drag_and_drop_selection_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_drag_and_drop_selection_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_right_icon: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_right_icon: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_icon_expand_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_icon_expand_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_right_icon_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_right_icon_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_flat: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_flat: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_select_all_on_focus: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_select_all_on_focus: GDExtensionMethodBindPtr = null

  /** Godot enum `LineEdit.MenuItems`. */
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

  /** Godot enum `LineEdit.VirtualKeyboardType`. */
  opaque type VirtualKeyboardType <: Long = Long

  object VirtualKeyboardType {
    final val Default: VirtualKeyboardType = 0L.asInstanceOf[VirtualKeyboardType]
    final val Multiline: VirtualKeyboardType = 1L.asInstanceOf[VirtualKeyboardType]
    final val Number: VirtualKeyboardType = 2L.asInstanceOf[VirtualKeyboardType]
    final val NumberDecimal: VirtualKeyboardType = 3L.asInstanceOf[VirtualKeyboardType]
    final val Phone: VirtualKeyboardType = 4L.asInstanceOf[VirtualKeyboardType]
    final val EmailAddress: VirtualKeyboardType = 5L.asInstanceOf[VirtualKeyboardType]
    final val Password: VirtualKeyboardType = 6L.asInstanceOf[VirtualKeyboardType]
    final val Url: VirtualKeyboardType = 7L.asInstanceOf[VirtualKeyboardType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): VirtualKeyboardType = value.asInstanceOf[VirtualKeyboardType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[VirtualKeyboardType] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L).asInstanceOf[scala.IArray[VirtualKeyboardType]]

    extension (self: VirtualKeyboardType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Default"
        case 1L => "Multiline"
        case 2L => "Number"
        case 3L => "NumberDecimal"
        case 4L => "Phone"
        case 5L => "EmailAddress"
        case 6L => "Password"
        case 7L => "Url"
        case other => other.toString
      }
  }

  /** Godot enum `LineEdit.ExpandMode`. */
  opaque type ExpandMode <: Long = Long

  object ExpandMode {
    final val OriginalSize: ExpandMode = 0L.asInstanceOf[ExpandMode]
    final val FitToText: ExpandMode = 1L.asInstanceOf[ExpandMode]
    final val FitToLineEdit: ExpandMode = 2L.asInstanceOf[ExpandMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ExpandMode = value.asInstanceOf[ExpandMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ExpandMode] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[ExpandMode]]

    extension (self: ExpandMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "OriginalSize"
        case 1L => "FitToText"
        case 2L => "FitToLineEdit"
        case other => other.toString
      }
  }
}
