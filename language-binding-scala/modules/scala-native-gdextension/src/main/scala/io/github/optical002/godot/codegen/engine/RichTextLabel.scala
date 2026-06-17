package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `RichTextLabel`, extends `Control`. */
abstract class RichTextLabel extends Control {

  /** RichTextLabel.get_parsed_text */
  final def getParsedText(): String =
    Ptrcall.call0[String](MethodBind.get("RichTextLabel", "get_parsed_text", 201670096L), hostObject.objectPtr)

  /** RichTextLabel.add_text */
  final def addText(text: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("RichTextLabel", "add_text", 83702148L), hostObject.objectPtr, text)

  /** RichTextLabel.set_text */
  final def setText(text: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("RichTextLabel", "set_text", 83702148L), hostObject.objectPtr, text)

  /** RichTextLabel.add_hr */
  final def addHr(width: Long, height: Long, color: io.github.optical002.godot.builtin.Color, alignment: Long, width_in_percent: Boolean, height_in_percent: Boolean): Unit =
    Ptrcall.callVoid6(MethodBind.get("RichTextLabel", "add_hr", 16816895L), hostObject.objectPtr, width, height, color, alignment, width_in_percent, height_in_percent)

  /** RichTextLabel.newline */
  final def newline(): Unit =
    Ptrcall.callVoid0(MethodBind.get("RichTextLabel", "newline", 3218959716L), hostObject.objectPtr)

  /** RichTextLabel.remove_paragraph */
  final def removeParagraph(paragraph: Long, no_invalidate: Boolean): Boolean =
    Ptrcall.call2[Long, Boolean, Boolean](MethodBind.get("RichTextLabel", "remove_paragraph", 3262369265L), hostObject.objectPtr, paragraph, no_invalidate)

  /** RichTextLabel.invalidate_paragraph */
  final def invalidateParagraph(paragraph: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("RichTextLabel", "invalidate_paragraph", 3067735520L), hostObject.objectPtr, paragraph)

  /** RichTextLabel.push_font */
  final def pushFont(font: Font, font_size: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("RichTextLabel", "push_font", 2347424842L), hostObject.objectPtr, font.hostObject, font_size)

  /** RichTextLabel.push_font_size */
  final def pushFontSize(font_size: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RichTextLabel", "push_font_size", 1286410249L), hostObject.objectPtr, font_size)

  /** RichTextLabel.push_normal */
  final def pushNormal(): Unit =
    Ptrcall.callVoid0(MethodBind.get("RichTextLabel", "push_normal", 3218959716L), hostObject.objectPtr)

  /** RichTextLabel.push_bold */
  final def pushBold(): Unit =
    Ptrcall.callVoid0(MethodBind.get("RichTextLabel", "push_bold", 3218959716L), hostObject.objectPtr)

  /** RichTextLabel.push_bold_italics */
  final def pushBoldItalics(): Unit =
    Ptrcall.callVoid0(MethodBind.get("RichTextLabel", "push_bold_italics", 3218959716L), hostObject.objectPtr)

  /** RichTextLabel.push_italics */
  final def pushItalics(): Unit =
    Ptrcall.callVoid0(MethodBind.get("RichTextLabel", "push_italics", 3218959716L), hostObject.objectPtr)

  /** RichTextLabel.push_mono */
  final def pushMono(): Unit =
    Ptrcall.callVoid0(MethodBind.get("RichTextLabel", "push_mono", 3218959716L), hostObject.objectPtr)

  /** RichTextLabel.push_color */
  final def pushColor(color: io.github.optical002.godot.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("RichTextLabel", "push_color", 2920490490L), hostObject.objectPtr, color)

  /** RichTextLabel.push_outline_size */
  final def pushOutlineSize(outline_size: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RichTextLabel", "push_outline_size", 1286410249L), hostObject.objectPtr, outline_size)

  /** RichTextLabel.push_outline_color */
  final def pushOutlineColor(color: io.github.optical002.godot.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("RichTextLabel", "push_outline_color", 2920490490L), hostObject.objectPtr, color)

  /** RichTextLabel.push_indent */
  final def pushIndent(level: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RichTextLabel", "push_indent", 1286410249L), hostObject.objectPtr, level)

  /** RichTextLabel.push_list */
  final def pushList(level: Long, `type`: Long, capitalize: Boolean, bullet: String): Unit =
    Ptrcall.callVoid4(MethodBind.get("RichTextLabel", "push_list", 3017143144L), hostObject.objectPtr, level, `type`, capitalize, bullet)

  /** RichTextLabel.push_hint */
  final def pushHint(description: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("RichTextLabel", "push_hint", 83702148L), hostObject.objectPtr, description)

  /** RichTextLabel.push_language */
  final def pushLanguage(language: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("RichTextLabel", "push_language", 83702148L), hostObject.objectPtr, language)

  /** RichTextLabel.push_underline */
  final def pushUnderline(color: io.github.optical002.godot.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("RichTextLabel", "push_underline", 1458098034L), hostObject.objectPtr, color)

  /** RichTextLabel.push_strikethrough */
  final def pushStrikethrough(color: io.github.optical002.godot.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("RichTextLabel", "push_strikethrough", 1458098034L), hostObject.objectPtr, color)

  /** RichTextLabel.push_table */
  final def pushTable(columns: Long, inline_align: Long, align_to_row: Long, name: String): Unit =
    Ptrcall.callVoid4(MethodBind.get("RichTextLabel", "push_table", 3426862026L), hostObject.objectPtr, columns, inline_align, align_to_row, name)

  /** RichTextLabel.set_table_column_expand */
  final def setTableColumnExpand(column: Long, expand: Boolean, ratio: Long, shrink: Boolean): Unit =
    Ptrcall.callVoid4(MethodBind.get("RichTextLabel", "set_table_column_expand", 117236061L), hostObject.objectPtr, column, expand, ratio, shrink)

  /** RichTextLabel.set_table_column_name */
  final def setTableColumnName(column: Long, name: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("RichTextLabel", "set_table_column_name", 501894301L), hostObject.objectPtr, column, name)

  /** RichTextLabel.set_cell_row_background_color */
  final def setCellRowBackgroundColor(odd_row_bg: io.github.optical002.godot.builtin.Color, even_row_bg: io.github.optical002.godot.builtin.Color): Unit =
    Ptrcall.callVoid2(MethodBind.get("RichTextLabel", "set_cell_row_background_color", 3465483165L), hostObject.objectPtr, odd_row_bg, even_row_bg)

  /** RichTextLabel.set_cell_border_color */
  final def setCellBorderColor(color: io.github.optical002.godot.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("RichTextLabel", "set_cell_border_color", 2920490490L), hostObject.objectPtr, color)

  /** RichTextLabel.set_cell_size_override */
  final def setCellSizeOverride(min_size: io.github.optical002.godot.builtin.Vector2, max_size: io.github.optical002.godot.builtin.Vector2): Unit =
    Ptrcall.callVoid2(MethodBind.get("RichTextLabel", "set_cell_size_override", 3108078480L), hostObject.objectPtr, min_size, max_size)

  /** RichTextLabel.set_cell_padding */
  final def setCellPadding(padding: io.github.optical002.godot.builtin.Rect2): Unit =
    Ptrcall.callVoid1(MethodBind.get("RichTextLabel", "set_cell_padding", 2046264180L), hostObject.objectPtr, padding)

  /** RichTextLabel.push_cell */
  final def pushCell(): Unit =
    Ptrcall.callVoid0(MethodBind.get("RichTextLabel", "push_cell", 3218959716L), hostObject.objectPtr)

  /** RichTextLabel.push_fgcolor */
  final def pushFgcolor(fgcolor: io.github.optical002.godot.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("RichTextLabel", "push_fgcolor", 2920490490L), hostObject.objectPtr, fgcolor)

  /** RichTextLabel.push_bgcolor */
  final def pushBgcolor(bgcolor: io.github.optical002.godot.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("RichTextLabel", "push_bgcolor", 2920490490L), hostObject.objectPtr, bgcolor)

  /** RichTextLabel.push_context */
  final def pushContext(): Unit =
    Ptrcall.callVoid0(MethodBind.get("RichTextLabel", "push_context", 3218959716L), hostObject.objectPtr)

  /** RichTextLabel.pop_context */
  final def popContext(): Unit =
    Ptrcall.callVoid0(MethodBind.get("RichTextLabel", "pop_context", 3218959716L), hostObject.objectPtr)

  /** RichTextLabel.pop */
  final def pop(): Unit =
    Ptrcall.callVoid0(MethodBind.get("RichTextLabel", "pop", 3218959716L), hostObject.objectPtr)

  /** RichTextLabel.pop_all */
  final def popAll(): Unit =
    Ptrcall.callVoid0(MethodBind.get("RichTextLabel", "pop_all", 3218959716L), hostObject.objectPtr)

  /** RichTextLabel.clear */
  final def clear(): Unit =
    Ptrcall.callVoid0(MethodBind.get("RichTextLabel", "clear", 3218959716L), hostObject.objectPtr)

  /** RichTextLabel.set_structured_text_bidi_override */
  final def setStructuredTextBidiOverride(parser: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RichTextLabel", "set_structured_text_bidi_override", 55961453L), hostObject.objectPtr, parser)

  /** RichTextLabel.get_structured_text_bidi_override */
  final def getStructuredTextBidiOverride(): Long =
    Ptrcall.call0[Long](MethodBind.get("RichTextLabel", "get_structured_text_bidi_override", 3385126229L), hostObject.objectPtr)

  /** RichTextLabel.set_text_direction */
  final def setTextDirection(direction: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RichTextLabel", "set_text_direction", 119160795L), hostObject.objectPtr, direction)

  /** RichTextLabel.get_text_direction */
  final def getTextDirection(): Long =
    Ptrcall.call0[Long](MethodBind.get("RichTextLabel", "get_text_direction", 797257663L), hostObject.objectPtr)

  /** RichTextLabel.set_language */
  final def setLanguage(language: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("RichTextLabel", "set_language", 83702148L), hostObject.objectPtr, language)

  /** RichTextLabel.get_language */
  final def getLanguage(): String =
    Ptrcall.call0[String](MethodBind.get("RichTextLabel", "get_language", 201670096L), hostObject.objectPtr)

  /** RichTextLabel.set_horizontal_alignment */
  final def setHorizontalAlignment(alignment: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RichTextLabel", "set_horizontal_alignment", 2312603777L), hostObject.objectPtr, alignment)

  /** RichTextLabel.get_horizontal_alignment */
  final def getHorizontalAlignment(): Long =
    Ptrcall.call0[Long](MethodBind.get("RichTextLabel", "get_horizontal_alignment", 341400642L), hostObject.objectPtr)

  /** RichTextLabel.set_vertical_alignment */
  final def setVerticalAlignment(alignment: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RichTextLabel", "set_vertical_alignment", 1796458609L), hostObject.objectPtr, alignment)

  /** RichTextLabel.get_vertical_alignment */
  final def getVerticalAlignment(): Long =
    Ptrcall.call0[Long](MethodBind.get("RichTextLabel", "get_vertical_alignment", 3274884059L), hostObject.objectPtr)

  /** RichTextLabel.set_justification_flags */
  final def setJustificationFlags(justification_flags: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RichTextLabel", "set_justification_flags", 2877345813L), hostObject.objectPtr, justification_flags)

  /** RichTextLabel.get_justification_flags */
  final def getJustificationFlags(): Long =
    Ptrcall.call0[Long](MethodBind.get("RichTextLabel", "get_justification_flags", 1583363614L), hostObject.objectPtr)

  /** RichTextLabel.set_autowrap_mode */
  final def setAutowrapMode(autowrap_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RichTextLabel", "set_autowrap_mode", 3289138044L), hostObject.objectPtr, autowrap_mode)

  /** RichTextLabel.get_autowrap_mode */
  final def getAutowrapMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("RichTextLabel", "get_autowrap_mode", 1549071663L), hostObject.objectPtr)

  /** RichTextLabel.set_autowrap_trim_flags */
  final def setAutowrapTrimFlags(autowrap_trim_flags: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RichTextLabel", "set_autowrap_trim_flags", 2809697122L), hostObject.objectPtr, autowrap_trim_flags)

  /** RichTextLabel.get_autowrap_trim_flags */
  final def getAutowrapTrimFlags(): Long =
    Ptrcall.call0[Long](MethodBind.get("RichTextLabel", "get_autowrap_trim_flags", 2340632602L), hostObject.objectPtr)

  /** RichTextLabel.set_meta_underline */
  final def setMetaUnderline(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RichTextLabel", "set_meta_underline", 2586408642L), hostObject.objectPtr, enable)

  /** RichTextLabel.is_meta_underlined */
  final def isMetaUnderlined(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RichTextLabel", "is_meta_underlined", 36873697L), hostObject.objectPtr)

  /** RichTextLabel.set_hint_underline */
  final def setHintUnderline(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RichTextLabel", "set_hint_underline", 2586408642L), hostObject.objectPtr, enable)

  /** RichTextLabel.is_hint_underlined */
  final def isHintUnderlined(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RichTextLabel", "is_hint_underlined", 36873697L), hostObject.objectPtr)

  /** RichTextLabel.set_scroll_active */
  final def setScrollActive(active: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RichTextLabel", "set_scroll_active", 2586408642L), hostObject.objectPtr, active)

  /** RichTextLabel.is_scroll_active */
  final def isScrollActive(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RichTextLabel", "is_scroll_active", 36873697L), hostObject.objectPtr)

  /** RichTextLabel.set_scroll_follow_visible_characters */
  final def setScrollFollowVisibleCharacters(follow: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RichTextLabel", "set_scroll_follow_visible_characters", 2586408642L), hostObject.objectPtr, follow)

  /** RichTextLabel.is_scroll_following_visible_characters */
  final def isScrollFollowingVisibleCharacters(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RichTextLabel", "is_scroll_following_visible_characters", 36873697L), hostObject.objectPtr)

  /** RichTextLabel.set_scroll_follow */
  final def setScrollFollow(follow: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RichTextLabel", "set_scroll_follow", 2586408642L), hostObject.objectPtr, follow)

  /** RichTextLabel.is_scroll_following */
  final def isScrollFollowing(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RichTextLabel", "is_scroll_following", 36873697L), hostObject.objectPtr)

  /** RichTextLabel.get_v_scroll_bar */
  final def getVScrollBar(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("RichTextLabel", "get_v_scroll_bar", 2630340773L), hostObject.objectPtr)

  /** RichTextLabel.scroll_to_line */
  final def scrollToLine(line: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RichTextLabel", "scroll_to_line", 1286410249L), hostObject.objectPtr, line)

  /** RichTextLabel.scroll_to_paragraph */
  final def scrollToParagraph(paragraph: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RichTextLabel", "scroll_to_paragraph", 1286410249L), hostObject.objectPtr, paragraph)

  /** RichTextLabel.scroll_to_selection */
  final def scrollToSelection(): Unit =
    Ptrcall.callVoid0(MethodBind.get("RichTextLabel", "scroll_to_selection", 3218959716L), hostObject.objectPtr)

  /** RichTextLabel.set_tab_size */
  final def setTabSize(spaces: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RichTextLabel", "set_tab_size", 1286410249L), hostObject.objectPtr, spaces)

  /** RichTextLabel.get_tab_size */
  final def getTabSize(): Long =
    Ptrcall.call0[Long](MethodBind.get("RichTextLabel", "get_tab_size", 3905245786L), hostObject.objectPtr)

  /** RichTextLabel.set_fit_content */
  final def setFitContent(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RichTextLabel", "set_fit_content", 2586408642L), hostObject.objectPtr, enabled)

  /** RichTextLabel.is_fit_content_enabled */
  final def isFitContentEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RichTextLabel", "is_fit_content_enabled", 36873697L), hostObject.objectPtr)

  /** RichTextLabel.set_selection_enabled */
  final def setSelectionEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RichTextLabel", "set_selection_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** RichTextLabel.is_selection_enabled */
  final def isSelectionEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RichTextLabel", "is_selection_enabled", 36873697L), hostObject.objectPtr)

  /** RichTextLabel.set_context_menu_enabled */
  final def setContextMenuEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RichTextLabel", "set_context_menu_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** RichTextLabel.is_context_menu_enabled */
  final def isContextMenuEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RichTextLabel", "is_context_menu_enabled", 36873697L), hostObject.objectPtr)

  /** RichTextLabel.set_shortcut_keys_enabled */
  final def setShortcutKeysEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RichTextLabel", "set_shortcut_keys_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** RichTextLabel.is_shortcut_keys_enabled */
  final def isShortcutKeysEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RichTextLabel", "is_shortcut_keys_enabled", 36873697L), hostObject.objectPtr)

  /** RichTextLabel.set_deselect_on_focus_loss_enabled */
  final def setDeselectOnFocusLossEnabled(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RichTextLabel", "set_deselect_on_focus_loss_enabled", 2586408642L), hostObject.objectPtr, enable)

  /** RichTextLabel.is_deselect_on_focus_loss_enabled */
  final def isDeselectOnFocusLossEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RichTextLabel", "is_deselect_on_focus_loss_enabled", 36873697L), hostObject.objectPtr)

  /** RichTextLabel.set_drag_and_drop_selection_enabled */
  final def setDragAndDropSelectionEnabled(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RichTextLabel", "set_drag_and_drop_selection_enabled", 2586408642L), hostObject.objectPtr, enable)

  /** RichTextLabel.is_drag_and_drop_selection_enabled */
  final def isDragAndDropSelectionEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RichTextLabel", "is_drag_and_drop_selection_enabled", 36873697L), hostObject.objectPtr)

  /** RichTextLabel.get_selection_from */
  final def getSelectionFrom(): Long =
    Ptrcall.call0[Long](MethodBind.get("RichTextLabel", "get_selection_from", 3905245786L), hostObject.objectPtr)

  /** RichTextLabel.get_selection_to */
  final def getSelectionTo(): Long =
    Ptrcall.call0[Long](MethodBind.get("RichTextLabel", "get_selection_to", 3905245786L), hostObject.objectPtr)

  /** RichTextLabel.get_selection_line_offset */
  final def getSelectionLineOffset(): Double =
    Ptrcall.call0[Double](MethodBind.get("RichTextLabel", "get_selection_line_offset", 1740695150L), hostObject.objectPtr)

  /** RichTextLabel.select_all */
  final def selectAll(): Unit =
    Ptrcall.callVoid0(MethodBind.get("RichTextLabel", "select_all", 3218959716L), hostObject.objectPtr)

  /** RichTextLabel.get_selected_text */
  final def getSelectedText(): String =
    Ptrcall.call0[String](MethodBind.get("RichTextLabel", "get_selected_text", 201670096L), hostObject.objectPtr)

  /** RichTextLabel.deselect */
  final def deselect(): Unit =
    Ptrcall.callVoid0(MethodBind.get("RichTextLabel", "deselect", 3218959716L), hostObject.objectPtr)

  /** RichTextLabel.parse_bbcode */
  final def parseBbcode(bbcode: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("RichTextLabel", "parse_bbcode", 83702148L), hostObject.objectPtr, bbcode)

  /** RichTextLabel.append_text */
  final def appendText(bbcode: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("RichTextLabel", "append_text", 83702148L), hostObject.objectPtr, bbcode)

  /** RichTextLabel.get_text */
  final def getText(): String =
    Ptrcall.call0[String](MethodBind.get("RichTextLabel", "get_text", 201670096L), hostObject.objectPtr)

  /** RichTextLabel.is_ready */
  final def isReady(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RichTextLabel", "is_ready", 36873697L), hostObject.objectPtr)

  /** RichTextLabel.is_finished */
  final def isFinished(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RichTextLabel", "is_finished", 36873697L), hostObject.objectPtr)

  /** RichTextLabel.set_threaded */
  final def setThreaded(threaded: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RichTextLabel", "set_threaded", 2586408642L), hostObject.objectPtr, threaded)

  /** RichTextLabel.is_threaded */
  final def isThreaded(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RichTextLabel", "is_threaded", 36873697L), hostObject.objectPtr)

  /** RichTextLabel.set_progress_bar_delay */
  final def setProgressBarDelay(delay_ms: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RichTextLabel", "set_progress_bar_delay", 1286410249L), hostObject.objectPtr, delay_ms)

  /** RichTextLabel.get_progress_bar_delay */
  final def getProgressBarDelay(): Long =
    Ptrcall.call0[Long](MethodBind.get("RichTextLabel", "get_progress_bar_delay", 3905245786L), hostObject.objectPtr)

  /** RichTextLabel.set_visible_characters */
  final def setVisibleCharacters(amount: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RichTextLabel", "set_visible_characters", 1286410249L), hostObject.objectPtr, amount)

  /** RichTextLabel.get_visible_characters */
  final def getVisibleCharacters(): Long =
    Ptrcall.call0[Long](MethodBind.get("RichTextLabel", "get_visible_characters", 3905245786L), hostObject.objectPtr)

  /** RichTextLabel.get_visible_characters_behavior */
  final def getVisibleCharactersBehavior(): Long =
    Ptrcall.call0[Long](MethodBind.get("RichTextLabel", "get_visible_characters_behavior", 258789322L), hostObject.objectPtr)

  /** RichTextLabel.set_visible_characters_behavior */
  final def setVisibleCharactersBehavior(behavior: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RichTextLabel", "set_visible_characters_behavior", 3383839701L), hostObject.objectPtr, behavior)

  /** RichTextLabel.set_visible_ratio */
  final def setVisibleRatio(ratio: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("RichTextLabel", "set_visible_ratio", 373806689L), hostObject.objectPtr, ratio)

  /** RichTextLabel.get_visible_ratio */
  final def getVisibleRatio(): Double =
    Ptrcall.call0[Double](MethodBind.get("RichTextLabel", "get_visible_ratio", 1740695150L), hostObject.objectPtr)

  /** RichTextLabel.get_character_line */
  final def getCharacterLine(character: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("RichTextLabel", "get_character_line", 3744713108L), hostObject.objectPtr, character)

  /** RichTextLabel.get_character_paragraph */
  final def getCharacterParagraph(character: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("RichTextLabel", "get_character_paragraph", 3744713108L), hostObject.objectPtr, character)

  /** RichTextLabel.get_total_character_count */
  final def getTotalCharacterCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("RichTextLabel", "get_total_character_count", 3905245786L), hostObject.objectPtr)

  /** RichTextLabel.set_use_bbcode */
  final def setUseBbcode(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RichTextLabel", "set_use_bbcode", 2586408642L), hostObject.objectPtr, enable)

  /** RichTextLabel.is_using_bbcode */
  final def isUsingBbcode(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RichTextLabel", "is_using_bbcode", 36873697L), hostObject.objectPtr)

  /** RichTextLabel.get_line_count */
  final def getLineCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("RichTextLabel", "get_line_count", 3905245786L), hostObject.objectPtr)

  /** RichTextLabel.get_line_range */
  final def getLineRange(line: Long): io.github.optical002.godot.builtin.Vector2i =
    Ptrcall.call1[Long, io.github.optical002.godot.builtin.Vector2i](MethodBind.get("RichTextLabel", "get_line_range", 3665014314L), hostObject.objectPtr, line)

  /** RichTextLabel.get_visible_line_count */
  final def getVisibleLineCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("RichTextLabel", "get_visible_line_count", 3905245786L), hostObject.objectPtr)

  /** RichTextLabel.get_paragraph_count */
  final def getParagraphCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("RichTextLabel", "get_paragraph_count", 3905245786L), hostObject.objectPtr)

  /** RichTextLabel.get_visible_paragraph_count */
  final def getVisibleParagraphCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("RichTextLabel", "get_visible_paragraph_count", 3905245786L), hostObject.objectPtr)

  /** RichTextLabel.get_content_height */
  final def getContentHeight(): Long =
    Ptrcall.call0[Long](MethodBind.get("RichTextLabel", "get_content_height", 3905245786L), hostObject.objectPtr)

  /** RichTextLabel.get_content_width */
  final def getContentWidth(): Long =
    Ptrcall.call0[Long](MethodBind.get("RichTextLabel", "get_content_width", 3905245786L), hostObject.objectPtr)

  /** RichTextLabel.get_line_height */
  final def getLineHeight(line: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("RichTextLabel", "get_line_height", 923996154L), hostObject.objectPtr, line)

  /** RichTextLabel.get_line_width */
  final def getLineWidth(line: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("RichTextLabel", "get_line_width", 923996154L), hostObject.objectPtr, line)

  /** RichTextLabel.get_visible_content_rect */
  final def getVisibleContentRect(): io.github.optical002.godot.builtin.Rect2i =
    Ptrcall.call0[io.github.optical002.godot.builtin.Rect2i](MethodBind.get("RichTextLabel", "get_visible_content_rect", 410525958L), hostObject.objectPtr)

  /** RichTextLabel.get_line_offset */
  final def getLineOffset(line: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("RichTextLabel", "get_line_offset", 4025615559L), hostObject.objectPtr, line)

  /** RichTextLabel.get_paragraph_offset */
  final def getParagraphOffset(paragraph: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("RichTextLabel", "get_paragraph_offset", 4025615559L), hostObject.objectPtr, paragraph)

  /** RichTextLabel.reload_effects */
  final def reloadEffects(): Unit =
    Ptrcall.callVoid0(MethodBind.get("RichTextLabel", "reload_effects", 3218959716L), hostObject.objectPtr)

  /** RichTextLabel.get_menu */
  final def getMenu(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("RichTextLabel", "get_menu", 229722558L), hostObject.objectPtr)

  /** RichTextLabel.is_menu_visible */
  final def isMenuVisible(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RichTextLabel", "is_menu_visible", 36873697L), hostObject.objectPtr)

  /** RichTextLabel.menu_option */
  final def menuOption(option: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RichTextLabel", "menu_option", 1286410249L), hostObject.objectPtr, option)

}

object RichTextLabel {
  /** Class metadata for Gd[RichTextLabel] lifetime management and casting. */
  given GodotClass[RichTextLabel] with {
    def className = "RichTextLabel"
    def isRefCounted = false
    def wrap(o: GodotObject): RichTextLabel = new RichTextLabel {}.withHost(o.objectPtr)
    def unwrap(t: RichTextLabel): GodotObject = t.hostObject
  }
}
