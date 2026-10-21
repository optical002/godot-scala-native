package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `RichTextLabel`, extends `Control`. */
abstract class RichTextLabel extends Control {
  override def godotClassName: String = "RichTextLabel"

  /** RichTextLabel.get_parsed_text */
  final def getParsedText(): String = {
    if (gdext.classes.RichTextLabel.mb_get_parsed_text == null) gdext.classes.RichTextLabel.mb_get_parsed_text = MethodBind.get("RichTextLabel", "get_parsed_text", 201670096L)
    Ptrcall.call0[String](gdext.classes.RichTextLabel.mb_get_parsed_text, livePtr)
  }

  /** RichTextLabel.add_text */
  final def addText(text: String): Unit = {
    if (gdext.classes.RichTextLabel.mb_add_text == null) gdext.classes.RichTextLabel.mb_add_text = MethodBind.get("RichTextLabel", "add_text", 83702148L)
    Ptrcall.callVoid1(gdext.classes.RichTextLabel.mb_add_text, livePtr, text)
  }

  /** RichTextLabel.set_text */
  final def setText(text: String): Unit = {
    if (gdext.classes.RichTextLabel.mb_set_text == null) gdext.classes.RichTextLabel.mb_set_text = MethodBind.get("RichTextLabel", "set_text", 83702148L)
    Ptrcall.callVoid1(gdext.classes.RichTextLabel.mb_set_text, livePtr, text)
  }

  /** RichTextLabel.add_hr */
  final def addHr(width: Long, height: Long, color: gdext.builtin.Color, alignment: Long, width_in_percent: Boolean, height_in_percent: Boolean): Unit = {
    if (gdext.classes.RichTextLabel.mb_add_hr == null) gdext.classes.RichTextLabel.mb_add_hr = MethodBind.get("RichTextLabel", "add_hr", 16816895L)
    Ptrcall.callVoid6(gdext.classes.RichTextLabel.mb_add_hr, livePtr, width, height, color, alignment, width_in_percent, height_in_percent)
  }

  /** RichTextLabel.newline */
  final def newline(): Unit = {
    if (gdext.classes.RichTextLabel.mb_newline == null) gdext.classes.RichTextLabel.mb_newline = MethodBind.get("RichTextLabel", "newline", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.RichTextLabel.mb_newline, livePtr)
  }

  /** RichTextLabel.remove_paragraph */
  final def removeParagraph(paragraph: Long, no_invalidate: Boolean): Boolean = {
    if (gdext.classes.RichTextLabel.mb_remove_paragraph == null) gdext.classes.RichTextLabel.mb_remove_paragraph = MethodBind.get("RichTextLabel", "remove_paragraph", 3262369265L)
    Ptrcall.call2[Long, Boolean, Boolean](gdext.classes.RichTextLabel.mb_remove_paragraph, livePtr, paragraph, no_invalidate)
  }

  /** RichTextLabel.invalidate_paragraph */
  final def invalidateParagraph(paragraph: Long): Boolean = {
    if (gdext.classes.RichTextLabel.mb_invalidate_paragraph == null) gdext.classes.RichTextLabel.mb_invalidate_paragraph = MethodBind.get("RichTextLabel", "invalidate_paragraph", 3067735520L)
    Ptrcall.call1[Long, Boolean](gdext.classes.RichTextLabel.mb_invalidate_paragraph, livePtr, paragraph)
  }

  /** RichTextLabel.push_font */
  final def pushFont(font: Font, font_size: Long): Unit = {
    if (gdext.classes.RichTextLabel.mb_push_font == null) gdext.classes.RichTextLabel.mb_push_font = MethodBind.get("RichTextLabel", "push_font", 2347424842L)
    Ptrcall.callVoid2(gdext.classes.RichTextLabel.mb_push_font, livePtr, Wrappers.handle(font), font_size)
  }

  /** RichTextLabel.push_font_size */
  final def pushFontSize(font_size: Long): Unit = {
    if (gdext.classes.RichTextLabel.mb_push_font_size == null) gdext.classes.RichTextLabel.mb_push_font_size = MethodBind.get("RichTextLabel", "push_font_size", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.RichTextLabel.mb_push_font_size, livePtr, font_size)
  }

  /** RichTextLabel.push_normal */
  final def pushNormal(): Unit = {
    if (gdext.classes.RichTextLabel.mb_push_normal == null) gdext.classes.RichTextLabel.mb_push_normal = MethodBind.get("RichTextLabel", "push_normal", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.RichTextLabel.mb_push_normal, livePtr)
  }

  /** RichTextLabel.push_bold */
  final def pushBold(): Unit = {
    if (gdext.classes.RichTextLabel.mb_push_bold == null) gdext.classes.RichTextLabel.mb_push_bold = MethodBind.get("RichTextLabel", "push_bold", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.RichTextLabel.mb_push_bold, livePtr)
  }

  /** RichTextLabel.push_bold_italics */
  final def pushBoldItalics(): Unit = {
    if (gdext.classes.RichTextLabel.mb_push_bold_italics == null) gdext.classes.RichTextLabel.mb_push_bold_italics = MethodBind.get("RichTextLabel", "push_bold_italics", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.RichTextLabel.mb_push_bold_italics, livePtr)
  }

  /** RichTextLabel.push_italics */
  final def pushItalics(): Unit = {
    if (gdext.classes.RichTextLabel.mb_push_italics == null) gdext.classes.RichTextLabel.mb_push_italics = MethodBind.get("RichTextLabel", "push_italics", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.RichTextLabel.mb_push_italics, livePtr)
  }

  /** RichTextLabel.push_mono */
  final def pushMono(): Unit = {
    if (gdext.classes.RichTextLabel.mb_push_mono == null) gdext.classes.RichTextLabel.mb_push_mono = MethodBind.get("RichTextLabel", "push_mono", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.RichTextLabel.mb_push_mono, livePtr)
  }

  /** RichTextLabel.push_color */
  final def pushColor(color: gdext.builtin.Color): Unit = {
    if (gdext.classes.RichTextLabel.mb_push_color == null) gdext.classes.RichTextLabel.mb_push_color = MethodBind.get("RichTextLabel", "push_color", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.RichTextLabel.mb_push_color, livePtr, color)
  }

  /** RichTextLabel.push_outline_size */
  final def pushOutlineSize(outline_size: Long): Unit = {
    if (gdext.classes.RichTextLabel.mb_push_outline_size == null) gdext.classes.RichTextLabel.mb_push_outline_size = MethodBind.get("RichTextLabel", "push_outline_size", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.RichTextLabel.mb_push_outline_size, livePtr, outline_size)
  }

  /** RichTextLabel.push_outline_color */
  final def pushOutlineColor(color: gdext.builtin.Color): Unit = {
    if (gdext.classes.RichTextLabel.mb_push_outline_color == null) gdext.classes.RichTextLabel.mb_push_outline_color = MethodBind.get("RichTextLabel", "push_outline_color", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.RichTextLabel.mb_push_outline_color, livePtr, color)
  }

  /** RichTextLabel.push_indent */
  final def pushIndent(level: Long): Unit = {
    if (gdext.classes.RichTextLabel.mb_push_indent == null) gdext.classes.RichTextLabel.mb_push_indent = MethodBind.get("RichTextLabel", "push_indent", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.RichTextLabel.mb_push_indent, livePtr, level)
  }

  /** RichTextLabel.push_list */
  final def pushList(level: Long, `type`: Long, capitalize: Boolean, bullet: String): Unit = {
    if (gdext.classes.RichTextLabel.mb_push_list == null) gdext.classes.RichTextLabel.mb_push_list = MethodBind.get("RichTextLabel", "push_list", 3017143144L)
    Ptrcall.callVoid4(gdext.classes.RichTextLabel.mb_push_list, livePtr, level, `type`, capitalize, bullet)
  }

  /** RichTextLabel.push_hint */
  final def pushHint(description: String): Unit = {
    if (gdext.classes.RichTextLabel.mb_push_hint == null) gdext.classes.RichTextLabel.mb_push_hint = MethodBind.get("RichTextLabel", "push_hint", 83702148L)
    Ptrcall.callVoid1(gdext.classes.RichTextLabel.mb_push_hint, livePtr, description)
  }

  /** RichTextLabel.push_language */
  final def pushLanguage(language: String): Unit = {
    if (gdext.classes.RichTextLabel.mb_push_language == null) gdext.classes.RichTextLabel.mb_push_language = MethodBind.get("RichTextLabel", "push_language", 83702148L)
    Ptrcall.callVoid1(gdext.classes.RichTextLabel.mb_push_language, livePtr, language)
  }

  /** RichTextLabel.push_underline */
  final def pushUnderline(color: gdext.builtin.Color): Unit = {
    if (gdext.classes.RichTextLabel.mb_push_underline == null) gdext.classes.RichTextLabel.mb_push_underline = MethodBind.get("RichTextLabel", "push_underline", 1458098034L)
    Ptrcall.callVoid1(gdext.classes.RichTextLabel.mb_push_underline, livePtr, color)
  }

  /** RichTextLabel.push_strikethrough */
  final def pushStrikethrough(color: gdext.builtin.Color): Unit = {
    if (gdext.classes.RichTextLabel.mb_push_strikethrough == null) gdext.classes.RichTextLabel.mb_push_strikethrough = MethodBind.get("RichTextLabel", "push_strikethrough", 1458098034L)
    Ptrcall.callVoid1(gdext.classes.RichTextLabel.mb_push_strikethrough, livePtr, color)
  }

  /** RichTextLabel.push_table */
  final def pushTable(columns: Long, inline_align: Long, align_to_row: Long, name: String): Unit = {
    if (gdext.classes.RichTextLabel.mb_push_table == null) gdext.classes.RichTextLabel.mb_push_table = MethodBind.get("RichTextLabel", "push_table", 3426862026L)
    Ptrcall.callVoid4(gdext.classes.RichTextLabel.mb_push_table, livePtr, columns, inline_align, align_to_row, name)
  }

  /** RichTextLabel.set_table_column_expand */
  final def setTableColumnExpand(column: Long, expand: Boolean, ratio: Long, shrink: Boolean): Unit = {
    if (gdext.classes.RichTextLabel.mb_set_table_column_expand == null) gdext.classes.RichTextLabel.mb_set_table_column_expand = MethodBind.get("RichTextLabel", "set_table_column_expand", 117236061L)
    Ptrcall.callVoid4(gdext.classes.RichTextLabel.mb_set_table_column_expand, livePtr, column, expand, ratio, shrink)
  }

  /** RichTextLabel.set_table_column_name */
  final def setTableColumnName(column: Long, name: String): Unit = {
    if (gdext.classes.RichTextLabel.mb_set_table_column_name == null) gdext.classes.RichTextLabel.mb_set_table_column_name = MethodBind.get("RichTextLabel", "set_table_column_name", 501894301L)
    Ptrcall.callVoid2(gdext.classes.RichTextLabel.mb_set_table_column_name, livePtr, column, name)
  }

  /** RichTextLabel.set_cell_row_background_color */
  final def setCellRowBackgroundColor(odd_row_bg: gdext.builtin.Color, even_row_bg: gdext.builtin.Color): Unit = {
    if (gdext.classes.RichTextLabel.mb_set_cell_row_background_color == null) gdext.classes.RichTextLabel.mb_set_cell_row_background_color = MethodBind.get("RichTextLabel", "set_cell_row_background_color", 3465483165L)
    Ptrcall.callVoid2(gdext.classes.RichTextLabel.mb_set_cell_row_background_color, livePtr, odd_row_bg, even_row_bg)
  }

  /** RichTextLabel.set_cell_border_color */
  final def setCellBorderColor(color: gdext.builtin.Color): Unit = {
    if (gdext.classes.RichTextLabel.mb_set_cell_border_color == null) gdext.classes.RichTextLabel.mb_set_cell_border_color = MethodBind.get("RichTextLabel", "set_cell_border_color", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.RichTextLabel.mb_set_cell_border_color, livePtr, color)
  }

  /** RichTextLabel.set_cell_size_override */
  final def setCellSizeOverride(min_size: gdext.builtin.Vector2, max_size: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.RichTextLabel.mb_set_cell_size_override == null) gdext.classes.RichTextLabel.mb_set_cell_size_override = MethodBind.get("RichTextLabel", "set_cell_size_override", 3108078480L)
    Ptrcall.callVoid2(gdext.classes.RichTextLabel.mb_set_cell_size_override, livePtr, min_size, max_size)
  }

  /** RichTextLabel.set_cell_padding */
  final def setCellPadding(padding: gdext.builtin.Rect2): Unit = {
    if (gdext.classes.RichTextLabel.mb_set_cell_padding == null) gdext.classes.RichTextLabel.mb_set_cell_padding = MethodBind.get("RichTextLabel", "set_cell_padding", 2046264180L)
    Ptrcall.callVoid1(gdext.classes.RichTextLabel.mb_set_cell_padding, livePtr, padding)
  }

  /** RichTextLabel.push_cell */
  final def pushCell(): Unit = {
    if (gdext.classes.RichTextLabel.mb_push_cell == null) gdext.classes.RichTextLabel.mb_push_cell = MethodBind.get("RichTextLabel", "push_cell", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.RichTextLabel.mb_push_cell, livePtr)
  }

  /** RichTextLabel.push_fgcolor */
  final def pushFgcolor(fgcolor: gdext.builtin.Color): Unit = {
    if (gdext.classes.RichTextLabel.mb_push_fgcolor == null) gdext.classes.RichTextLabel.mb_push_fgcolor = MethodBind.get("RichTextLabel", "push_fgcolor", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.RichTextLabel.mb_push_fgcolor, livePtr, fgcolor)
  }

  /** RichTextLabel.push_bgcolor */
  final def pushBgcolor(bgcolor: gdext.builtin.Color): Unit = {
    if (gdext.classes.RichTextLabel.mb_push_bgcolor == null) gdext.classes.RichTextLabel.mb_push_bgcolor = MethodBind.get("RichTextLabel", "push_bgcolor", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.RichTextLabel.mb_push_bgcolor, livePtr, bgcolor)
  }

  /** RichTextLabel.push_context */
  final def pushContext(): Unit = {
    if (gdext.classes.RichTextLabel.mb_push_context == null) gdext.classes.RichTextLabel.mb_push_context = MethodBind.get("RichTextLabel", "push_context", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.RichTextLabel.mb_push_context, livePtr)
  }

  /** RichTextLabel.pop_context */
  final def popContext(): Unit = {
    if (gdext.classes.RichTextLabel.mb_pop_context == null) gdext.classes.RichTextLabel.mb_pop_context = MethodBind.get("RichTextLabel", "pop_context", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.RichTextLabel.mb_pop_context, livePtr)
  }

  /** RichTextLabel.pop */
  final def pop(): Unit = {
    if (gdext.classes.RichTextLabel.mb_pop == null) gdext.classes.RichTextLabel.mb_pop = MethodBind.get("RichTextLabel", "pop", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.RichTextLabel.mb_pop, livePtr)
  }

  /** RichTextLabel.pop_all */
  final def popAll(): Unit = {
    if (gdext.classes.RichTextLabel.mb_pop_all == null) gdext.classes.RichTextLabel.mb_pop_all = MethodBind.get("RichTextLabel", "pop_all", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.RichTextLabel.mb_pop_all, livePtr)
  }

  /** RichTextLabel.clear */
  final def clear(): Unit = {
    if (gdext.classes.RichTextLabel.mb_clear == null) gdext.classes.RichTextLabel.mb_clear = MethodBind.get("RichTextLabel", "clear", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.RichTextLabel.mb_clear, livePtr)
  }

  /** RichTextLabel.set_structured_text_bidi_override */
  final def setStructuredTextBidiOverride(parser: Long): Unit = {
    if (gdext.classes.RichTextLabel.mb_set_structured_text_bidi_override == null) gdext.classes.RichTextLabel.mb_set_structured_text_bidi_override = MethodBind.get("RichTextLabel", "set_structured_text_bidi_override", 55961453L)
    Ptrcall.callVoid1(gdext.classes.RichTextLabel.mb_set_structured_text_bidi_override, livePtr, parser)
  }

  /** RichTextLabel.get_structured_text_bidi_override */
  final def getStructuredTextBidiOverride(): Long = {
    if (gdext.classes.RichTextLabel.mb_get_structured_text_bidi_override == null) gdext.classes.RichTextLabel.mb_get_structured_text_bidi_override = MethodBind.get("RichTextLabel", "get_structured_text_bidi_override", 3385126229L)
    Ptrcall.call0[Long](gdext.classes.RichTextLabel.mb_get_structured_text_bidi_override, livePtr)
  }

  /** RichTextLabel.set_text_direction */
  final def setTextDirection(direction: Long): Unit = {
    if (gdext.classes.RichTextLabel.mb_set_text_direction == null) gdext.classes.RichTextLabel.mb_set_text_direction = MethodBind.get("RichTextLabel", "set_text_direction", 119160795L)
    Ptrcall.callVoid1(gdext.classes.RichTextLabel.mb_set_text_direction, livePtr, direction)
  }

  /** RichTextLabel.get_text_direction */
  final def getTextDirection(): Long = {
    if (gdext.classes.RichTextLabel.mb_get_text_direction == null) gdext.classes.RichTextLabel.mb_get_text_direction = MethodBind.get("RichTextLabel", "get_text_direction", 797257663L)
    Ptrcall.call0[Long](gdext.classes.RichTextLabel.mb_get_text_direction, livePtr)
  }

  /** RichTextLabel.set_language */
  final def setLanguage(language: String): Unit = {
    if (gdext.classes.RichTextLabel.mb_set_language == null) gdext.classes.RichTextLabel.mb_set_language = MethodBind.get("RichTextLabel", "set_language", 83702148L)
    Ptrcall.callVoid1(gdext.classes.RichTextLabel.mb_set_language, livePtr, language)
  }

  /** RichTextLabel.get_language */
  final def getLanguage(): String = {
    if (gdext.classes.RichTextLabel.mb_get_language == null) gdext.classes.RichTextLabel.mb_get_language = MethodBind.get("RichTextLabel", "get_language", 201670096L)
    Ptrcall.call0[String](gdext.classes.RichTextLabel.mb_get_language, livePtr)
  }

  /** RichTextLabel.set_horizontal_alignment */
  final def setHorizontalAlignment(alignment: Long): Unit = {
    if (gdext.classes.RichTextLabel.mb_set_horizontal_alignment == null) gdext.classes.RichTextLabel.mb_set_horizontal_alignment = MethodBind.get("RichTextLabel", "set_horizontal_alignment", 2312603777L)
    Ptrcall.callVoid1(gdext.classes.RichTextLabel.mb_set_horizontal_alignment, livePtr, alignment)
  }

  /** RichTextLabel.get_horizontal_alignment */
  final def getHorizontalAlignment(): Long = {
    if (gdext.classes.RichTextLabel.mb_get_horizontal_alignment == null) gdext.classes.RichTextLabel.mb_get_horizontal_alignment = MethodBind.get("RichTextLabel", "get_horizontal_alignment", 341400642L)
    Ptrcall.call0[Long](gdext.classes.RichTextLabel.mb_get_horizontal_alignment, livePtr)
  }

  /** RichTextLabel.set_vertical_alignment */
  final def setVerticalAlignment(alignment: Long): Unit = {
    if (gdext.classes.RichTextLabel.mb_set_vertical_alignment == null) gdext.classes.RichTextLabel.mb_set_vertical_alignment = MethodBind.get("RichTextLabel", "set_vertical_alignment", 1796458609L)
    Ptrcall.callVoid1(gdext.classes.RichTextLabel.mb_set_vertical_alignment, livePtr, alignment)
  }

  /** RichTextLabel.get_vertical_alignment */
  final def getVerticalAlignment(): Long = {
    if (gdext.classes.RichTextLabel.mb_get_vertical_alignment == null) gdext.classes.RichTextLabel.mb_get_vertical_alignment = MethodBind.get("RichTextLabel", "get_vertical_alignment", 3274884059L)
    Ptrcall.call0[Long](gdext.classes.RichTextLabel.mb_get_vertical_alignment, livePtr)
  }

  /** RichTextLabel.set_justification_flags */
  final def setJustificationFlags(justification_flags: Long): Unit = {
    if (gdext.classes.RichTextLabel.mb_set_justification_flags == null) gdext.classes.RichTextLabel.mb_set_justification_flags = MethodBind.get("RichTextLabel", "set_justification_flags", 2877345813L)
    Ptrcall.callVoid1(gdext.classes.RichTextLabel.mb_set_justification_flags, livePtr, justification_flags)
  }

  /** RichTextLabel.get_justification_flags */
  final def getJustificationFlags(): Long = {
    if (gdext.classes.RichTextLabel.mb_get_justification_flags == null) gdext.classes.RichTextLabel.mb_get_justification_flags = MethodBind.get("RichTextLabel", "get_justification_flags", 1583363614L)
    Ptrcall.call0[Long](gdext.classes.RichTextLabel.mb_get_justification_flags, livePtr)
  }

  /** RichTextLabel.set_autowrap_mode */
  final def setAutowrapMode(autowrap_mode: Long): Unit = {
    if (gdext.classes.RichTextLabel.mb_set_autowrap_mode == null) gdext.classes.RichTextLabel.mb_set_autowrap_mode = MethodBind.get("RichTextLabel", "set_autowrap_mode", 3289138044L)
    Ptrcall.callVoid1(gdext.classes.RichTextLabel.mb_set_autowrap_mode, livePtr, autowrap_mode)
  }

  /** RichTextLabel.get_autowrap_mode */
  final def getAutowrapMode(): Long = {
    if (gdext.classes.RichTextLabel.mb_get_autowrap_mode == null) gdext.classes.RichTextLabel.mb_get_autowrap_mode = MethodBind.get("RichTextLabel", "get_autowrap_mode", 1549071663L)
    Ptrcall.call0[Long](gdext.classes.RichTextLabel.mb_get_autowrap_mode, livePtr)
  }

  /** RichTextLabel.set_autowrap_trim_flags */
  final def setAutowrapTrimFlags(autowrap_trim_flags: Long): Unit = {
    if (gdext.classes.RichTextLabel.mb_set_autowrap_trim_flags == null) gdext.classes.RichTextLabel.mb_set_autowrap_trim_flags = MethodBind.get("RichTextLabel", "set_autowrap_trim_flags", 2809697122L)
    Ptrcall.callVoid1(gdext.classes.RichTextLabel.mb_set_autowrap_trim_flags, livePtr, autowrap_trim_flags)
  }

  /** RichTextLabel.get_autowrap_trim_flags */
  final def getAutowrapTrimFlags(): Long = {
    if (gdext.classes.RichTextLabel.mb_get_autowrap_trim_flags == null) gdext.classes.RichTextLabel.mb_get_autowrap_trim_flags = MethodBind.get("RichTextLabel", "get_autowrap_trim_flags", 2340632602L)
    Ptrcall.call0[Long](gdext.classes.RichTextLabel.mb_get_autowrap_trim_flags, livePtr)
  }

  /** RichTextLabel.set_meta_underline */
  final def setMetaUnderline(enable: Boolean): Unit = {
    if (gdext.classes.RichTextLabel.mb_set_meta_underline == null) gdext.classes.RichTextLabel.mb_set_meta_underline = MethodBind.get("RichTextLabel", "set_meta_underline", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RichTextLabel.mb_set_meta_underline, livePtr, enable)
  }

  /** RichTextLabel.is_meta_underlined */
  final def isMetaUnderlined(): Boolean = {
    if (gdext.classes.RichTextLabel.mb_is_meta_underlined == null) gdext.classes.RichTextLabel.mb_is_meta_underlined = MethodBind.get("RichTextLabel", "is_meta_underlined", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RichTextLabel.mb_is_meta_underlined, livePtr)
  }

  /** RichTextLabel.set_hint_underline */
  final def setHintUnderline(enable: Boolean): Unit = {
    if (gdext.classes.RichTextLabel.mb_set_hint_underline == null) gdext.classes.RichTextLabel.mb_set_hint_underline = MethodBind.get("RichTextLabel", "set_hint_underline", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RichTextLabel.mb_set_hint_underline, livePtr, enable)
  }

  /** RichTextLabel.is_hint_underlined */
  final def isHintUnderlined(): Boolean = {
    if (gdext.classes.RichTextLabel.mb_is_hint_underlined == null) gdext.classes.RichTextLabel.mb_is_hint_underlined = MethodBind.get("RichTextLabel", "is_hint_underlined", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RichTextLabel.mb_is_hint_underlined, livePtr)
  }

  /** RichTextLabel.set_scroll_active */
  final def setScrollActive(active: Boolean): Unit = {
    if (gdext.classes.RichTextLabel.mb_set_scroll_active == null) gdext.classes.RichTextLabel.mb_set_scroll_active = MethodBind.get("RichTextLabel", "set_scroll_active", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RichTextLabel.mb_set_scroll_active, livePtr, active)
  }

  /** RichTextLabel.is_scroll_active */
  final def isScrollActive(): Boolean = {
    if (gdext.classes.RichTextLabel.mb_is_scroll_active == null) gdext.classes.RichTextLabel.mb_is_scroll_active = MethodBind.get("RichTextLabel", "is_scroll_active", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RichTextLabel.mb_is_scroll_active, livePtr)
  }

  /** RichTextLabel.set_scroll_follow_visible_characters */
  final def setScrollFollowVisibleCharacters(follow: Boolean): Unit = {
    if (gdext.classes.RichTextLabel.mb_set_scroll_follow_visible_characters == null) gdext.classes.RichTextLabel.mb_set_scroll_follow_visible_characters = MethodBind.get("RichTextLabel", "set_scroll_follow_visible_characters", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RichTextLabel.mb_set_scroll_follow_visible_characters, livePtr, follow)
  }

  /** RichTextLabel.is_scroll_following_visible_characters */
  final def isScrollFollowingVisibleCharacters(): Boolean = {
    if (gdext.classes.RichTextLabel.mb_is_scroll_following_visible_characters == null) gdext.classes.RichTextLabel.mb_is_scroll_following_visible_characters = MethodBind.get("RichTextLabel", "is_scroll_following_visible_characters", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RichTextLabel.mb_is_scroll_following_visible_characters, livePtr)
  }

  /** RichTextLabel.set_scroll_follow */
  final def setScrollFollow(follow: Boolean): Unit = {
    if (gdext.classes.RichTextLabel.mb_set_scroll_follow == null) gdext.classes.RichTextLabel.mb_set_scroll_follow = MethodBind.get("RichTextLabel", "set_scroll_follow", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RichTextLabel.mb_set_scroll_follow, livePtr, follow)
  }

  /** RichTextLabel.is_scroll_following */
  final def isScrollFollowing(): Boolean = {
    if (gdext.classes.RichTextLabel.mb_is_scroll_following == null) gdext.classes.RichTextLabel.mb_is_scroll_following = MethodBind.get("RichTextLabel", "is_scroll_following", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RichTextLabel.mb_is_scroll_following, livePtr)
  }

  /** RichTextLabel.get_v_scroll_bar */
  final def getVScrollBar(): VScrollBar = {
    if (gdext.classes.RichTextLabel.mb_get_v_scroll_bar == null) gdext.classes.RichTextLabel.mb_get_v_scroll_bar = MethodBind.get("RichTextLabel", "get_v_scroll_bar", 2630340773L)
    Wrappers.borrowed[VScrollBar](Ptrcall.call0[Long](gdext.classes.RichTextLabel.mb_get_v_scroll_bar, livePtr))
  }

  /** RichTextLabel.scroll_to_line */
  final def scrollToLine(line: Long): Unit = {
    if (gdext.classes.RichTextLabel.mb_scroll_to_line == null) gdext.classes.RichTextLabel.mb_scroll_to_line = MethodBind.get("RichTextLabel", "scroll_to_line", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.RichTextLabel.mb_scroll_to_line, livePtr, line)
  }

  /** RichTextLabel.scroll_to_paragraph */
  final def scrollToParagraph(paragraph: Long): Unit = {
    if (gdext.classes.RichTextLabel.mb_scroll_to_paragraph == null) gdext.classes.RichTextLabel.mb_scroll_to_paragraph = MethodBind.get("RichTextLabel", "scroll_to_paragraph", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.RichTextLabel.mb_scroll_to_paragraph, livePtr, paragraph)
  }

  /** RichTextLabel.scroll_to_selection */
  final def scrollToSelection(): Unit = {
    if (gdext.classes.RichTextLabel.mb_scroll_to_selection == null) gdext.classes.RichTextLabel.mb_scroll_to_selection = MethodBind.get("RichTextLabel", "scroll_to_selection", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.RichTextLabel.mb_scroll_to_selection, livePtr)
  }

  /** RichTextLabel.set_tab_size */
  final def setTabSize(spaces: Long): Unit = {
    if (gdext.classes.RichTextLabel.mb_set_tab_size == null) gdext.classes.RichTextLabel.mb_set_tab_size = MethodBind.get("RichTextLabel", "set_tab_size", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.RichTextLabel.mb_set_tab_size, livePtr, spaces)
  }

  /** RichTextLabel.get_tab_size */
  final def getTabSize(): Long = {
    if (gdext.classes.RichTextLabel.mb_get_tab_size == null) gdext.classes.RichTextLabel.mb_get_tab_size = MethodBind.get("RichTextLabel", "get_tab_size", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.RichTextLabel.mb_get_tab_size, livePtr)
  }

  /** RichTextLabel.set_fit_content */
  final def setFitContent(enabled: Boolean): Unit = {
    if (gdext.classes.RichTextLabel.mb_set_fit_content == null) gdext.classes.RichTextLabel.mb_set_fit_content = MethodBind.get("RichTextLabel", "set_fit_content", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RichTextLabel.mb_set_fit_content, livePtr, enabled)
  }

  /** RichTextLabel.is_fit_content_enabled */
  final def isFitContentEnabled(): Boolean = {
    if (gdext.classes.RichTextLabel.mb_is_fit_content_enabled == null) gdext.classes.RichTextLabel.mb_is_fit_content_enabled = MethodBind.get("RichTextLabel", "is_fit_content_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RichTextLabel.mb_is_fit_content_enabled, livePtr)
  }

  /** RichTextLabel.set_selection_enabled */
  final def setSelectionEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.RichTextLabel.mb_set_selection_enabled == null) gdext.classes.RichTextLabel.mb_set_selection_enabled = MethodBind.get("RichTextLabel", "set_selection_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RichTextLabel.mb_set_selection_enabled, livePtr, enabled)
  }

  /** RichTextLabel.is_selection_enabled */
  final def isSelectionEnabled(): Boolean = {
    if (gdext.classes.RichTextLabel.mb_is_selection_enabled == null) gdext.classes.RichTextLabel.mb_is_selection_enabled = MethodBind.get("RichTextLabel", "is_selection_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RichTextLabel.mb_is_selection_enabled, livePtr)
  }

  /** RichTextLabel.set_context_menu_enabled */
  final def setContextMenuEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.RichTextLabel.mb_set_context_menu_enabled == null) gdext.classes.RichTextLabel.mb_set_context_menu_enabled = MethodBind.get("RichTextLabel", "set_context_menu_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RichTextLabel.mb_set_context_menu_enabled, livePtr, enabled)
  }

  /** RichTextLabel.is_context_menu_enabled */
  final def isContextMenuEnabled(): Boolean = {
    if (gdext.classes.RichTextLabel.mb_is_context_menu_enabled == null) gdext.classes.RichTextLabel.mb_is_context_menu_enabled = MethodBind.get("RichTextLabel", "is_context_menu_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RichTextLabel.mb_is_context_menu_enabled, livePtr)
  }

  /** RichTextLabel.set_shortcut_keys_enabled */
  final def setShortcutKeysEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.RichTextLabel.mb_set_shortcut_keys_enabled == null) gdext.classes.RichTextLabel.mb_set_shortcut_keys_enabled = MethodBind.get("RichTextLabel", "set_shortcut_keys_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RichTextLabel.mb_set_shortcut_keys_enabled, livePtr, enabled)
  }

  /** RichTextLabel.is_shortcut_keys_enabled */
  final def isShortcutKeysEnabled(): Boolean = {
    if (gdext.classes.RichTextLabel.mb_is_shortcut_keys_enabled == null) gdext.classes.RichTextLabel.mb_is_shortcut_keys_enabled = MethodBind.get("RichTextLabel", "is_shortcut_keys_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RichTextLabel.mb_is_shortcut_keys_enabled, livePtr)
  }

  /** RichTextLabel.set_deselect_on_focus_loss_enabled */
  final def setDeselectOnFocusLossEnabled(enable: Boolean): Unit = {
    if (gdext.classes.RichTextLabel.mb_set_deselect_on_focus_loss_enabled == null) gdext.classes.RichTextLabel.mb_set_deselect_on_focus_loss_enabled = MethodBind.get("RichTextLabel", "set_deselect_on_focus_loss_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RichTextLabel.mb_set_deselect_on_focus_loss_enabled, livePtr, enable)
  }

  /** RichTextLabel.is_deselect_on_focus_loss_enabled */
  final def isDeselectOnFocusLossEnabled(): Boolean = {
    if (gdext.classes.RichTextLabel.mb_is_deselect_on_focus_loss_enabled == null) gdext.classes.RichTextLabel.mb_is_deselect_on_focus_loss_enabled = MethodBind.get("RichTextLabel", "is_deselect_on_focus_loss_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RichTextLabel.mb_is_deselect_on_focus_loss_enabled, livePtr)
  }

  /** RichTextLabel.set_drag_and_drop_selection_enabled */
  final def setDragAndDropSelectionEnabled(enable: Boolean): Unit = {
    if (gdext.classes.RichTextLabel.mb_set_drag_and_drop_selection_enabled == null) gdext.classes.RichTextLabel.mb_set_drag_and_drop_selection_enabled = MethodBind.get("RichTextLabel", "set_drag_and_drop_selection_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RichTextLabel.mb_set_drag_and_drop_selection_enabled, livePtr, enable)
  }

  /** RichTextLabel.is_drag_and_drop_selection_enabled */
  final def isDragAndDropSelectionEnabled(): Boolean = {
    if (gdext.classes.RichTextLabel.mb_is_drag_and_drop_selection_enabled == null) gdext.classes.RichTextLabel.mb_is_drag_and_drop_selection_enabled = MethodBind.get("RichTextLabel", "is_drag_and_drop_selection_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RichTextLabel.mb_is_drag_and_drop_selection_enabled, livePtr)
  }

  /** RichTextLabel.get_selection_from */
  final def getSelectionFrom(): Long = {
    if (gdext.classes.RichTextLabel.mb_get_selection_from == null) gdext.classes.RichTextLabel.mb_get_selection_from = MethodBind.get("RichTextLabel", "get_selection_from", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.RichTextLabel.mb_get_selection_from, livePtr)
  }

  /** RichTextLabel.get_selection_to */
  final def getSelectionTo(): Long = {
    if (gdext.classes.RichTextLabel.mb_get_selection_to == null) gdext.classes.RichTextLabel.mb_get_selection_to = MethodBind.get("RichTextLabel", "get_selection_to", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.RichTextLabel.mb_get_selection_to, livePtr)
  }

  /** RichTextLabel.get_selection_line_offset */
  final def getSelectionLineOffset(): Double = {
    if (gdext.classes.RichTextLabel.mb_get_selection_line_offset == null) gdext.classes.RichTextLabel.mb_get_selection_line_offset = MethodBind.get("RichTextLabel", "get_selection_line_offset", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.RichTextLabel.mb_get_selection_line_offset, livePtr)
  }

  /** RichTextLabel.select_all */
  final def selectAll(): Unit = {
    if (gdext.classes.RichTextLabel.mb_select_all == null) gdext.classes.RichTextLabel.mb_select_all = MethodBind.get("RichTextLabel", "select_all", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.RichTextLabel.mb_select_all, livePtr)
  }

  /** RichTextLabel.get_selected_text */
  final def getSelectedText(): String = {
    if (gdext.classes.RichTextLabel.mb_get_selected_text == null) gdext.classes.RichTextLabel.mb_get_selected_text = MethodBind.get("RichTextLabel", "get_selected_text", 201670096L)
    Ptrcall.call0[String](gdext.classes.RichTextLabel.mb_get_selected_text, livePtr)
  }

  /** RichTextLabel.deselect */
  final def deselect(): Unit = {
    if (gdext.classes.RichTextLabel.mb_deselect == null) gdext.classes.RichTextLabel.mb_deselect = MethodBind.get("RichTextLabel", "deselect", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.RichTextLabel.mb_deselect, livePtr)
  }

  /** RichTextLabel.parse_bbcode */
  final def parseBbcode(bbcode: String): Unit = {
    if (gdext.classes.RichTextLabel.mb_parse_bbcode == null) gdext.classes.RichTextLabel.mb_parse_bbcode = MethodBind.get("RichTextLabel", "parse_bbcode", 83702148L)
    Ptrcall.callVoid1(gdext.classes.RichTextLabel.mb_parse_bbcode, livePtr, bbcode)
  }

  /** RichTextLabel.append_text */
  final def appendText(bbcode: String): Unit = {
    if (gdext.classes.RichTextLabel.mb_append_text == null) gdext.classes.RichTextLabel.mb_append_text = MethodBind.get("RichTextLabel", "append_text", 83702148L)
    Ptrcall.callVoid1(gdext.classes.RichTextLabel.mb_append_text, livePtr, bbcode)
  }

  /** RichTextLabel.get_text */
  final def getText(): String = {
    if (gdext.classes.RichTextLabel.mb_get_text == null) gdext.classes.RichTextLabel.mb_get_text = MethodBind.get("RichTextLabel", "get_text", 201670096L)
    Ptrcall.call0[String](gdext.classes.RichTextLabel.mb_get_text, livePtr)
  }

  /** RichTextLabel.is_ready */
  final def isReady(): Boolean = {
    if (gdext.classes.RichTextLabel.mb_is_ready == null) gdext.classes.RichTextLabel.mb_is_ready = MethodBind.get("RichTextLabel", "is_ready", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RichTextLabel.mb_is_ready, livePtr)
  }

  /** RichTextLabel.is_finished */
  final def isFinished(): Boolean = {
    if (gdext.classes.RichTextLabel.mb_is_finished == null) gdext.classes.RichTextLabel.mb_is_finished = MethodBind.get("RichTextLabel", "is_finished", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RichTextLabel.mb_is_finished, livePtr)
  }

  /** RichTextLabel.set_threaded */
  final def setThreaded(threaded: Boolean): Unit = {
    if (gdext.classes.RichTextLabel.mb_set_threaded == null) gdext.classes.RichTextLabel.mb_set_threaded = MethodBind.get("RichTextLabel", "set_threaded", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RichTextLabel.mb_set_threaded, livePtr, threaded)
  }

  /** RichTextLabel.is_threaded */
  final def isThreaded(): Boolean = {
    if (gdext.classes.RichTextLabel.mb_is_threaded == null) gdext.classes.RichTextLabel.mb_is_threaded = MethodBind.get("RichTextLabel", "is_threaded", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RichTextLabel.mb_is_threaded, livePtr)
  }

  /** RichTextLabel.set_progress_bar_delay */
  final def setProgressBarDelay(delay_ms: Long): Unit = {
    if (gdext.classes.RichTextLabel.mb_set_progress_bar_delay == null) gdext.classes.RichTextLabel.mb_set_progress_bar_delay = MethodBind.get("RichTextLabel", "set_progress_bar_delay", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.RichTextLabel.mb_set_progress_bar_delay, livePtr, delay_ms)
  }

  /** RichTextLabel.get_progress_bar_delay */
  final def getProgressBarDelay(): Long = {
    if (gdext.classes.RichTextLabel.mb_get_progress_bar_delay == null) gdext.classes.RichTextLabel.mb_get_progress_bar_delay = MethodBind.get("RichTextLabel", "get_progress_bar_delay", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.RichTextLabel.mb_get_progress_bar_delay, livePtr)
  }

  /** RichTextLabel.set_visible_characters */
  final def setVisibleCharacters(amount: Long): Unit = {
    if (gdext.classes.RichTextLabel.mb_set_visible_characters == null) gdext.classes.RichTextLabel.mb_set_visible_characters = MethodBind.get("RichTextLabel", "set_visible_characters", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.RichTextLabel.mb_set_visible_characters, livePtr, amount)
  }

  /** RichTextLabel.get_visible_characters */
  final def getVisibleCharacters(): Long = {
    if (gdext.classes.RichTextLabel.mb_get_visible_characters == null) gdext.classes.RichTextLabel.mb_get_visible_characters = MethodBind.get("RichTextLabel", "get_visible_characters", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.RichTextLabel.mb_get_visible_characters, livePtr)
  }

  /** RichTextLabel.get_visible_characters_behavior */
  final def getVisibleCharactersBehavior(): Long = {
    if (gdext.classes.RichTextLabel.mb_get_visible_characters_behavior == null) gdext.classes.RichTextLabel.mb_get_visible_characters_behavior = MethodBind.get("RichTextLabel", "get_visible_characters_behavior", 258789322L)
    Ptrcall.call0[Long](gdext.classes.RichTextLabel.mb_get_visible_characters_behavior, livePtr)
  }

  /** RichTextLabel.set_visible_characters_behavior */
  final def setVisibleCharactersBehavior(behavior: Long): Unit = {
    if (gdext.classes.RichTextLabel.mb_set_visible_characters_behavior == null) gdext.classes.RichTextLabel.mb_set_visible_characters_behavior = MethodBind.get("RichTextLabel", "set_visible_characters_behavior", 3383839701L)
    Ptrcall.callVoid1(gdext.classes.RichTextLabel.mb_set_visible_characters_behavior, livePtr, behavior)
  }

  /** RichTextLabel.set_visible_ratio */
  final def setVisibleRatio(ratio: Double): Unit = {
    if (gdext.classes.RichTextLabel.mb_set_visible_ratio == null) gdext.classes.RichTextLabel.mb_set_visible_ratio = MethodBind.get("RichTextLabel", "set_visible_ratio", 373806689L)
    Ptrcall.callVoid1(gdext.classes.RichTextLabel.mb_set_visible_ratio, livePtr, ratio)
  }

  /** RichTextLabel.get_visible_ratio */
  final def getVisibleRatio(): Double = {
    if (gdext.classes.RichTextLabel.mb_get_visible_ratio == null) gdext.classes.RichTextLabel.mb_get_visible_ratio = MethodBind.get("RichTextLabel", "get_visible_ratio", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.RichTextLabel.mb_get_visible_ratio, livePtr)
  }

  /** RichTextLabel.get_character_line */
  final def getCharacterLine(character: Long): Long = {
    if (gdext.classes.RichTextLabel.mb_get_character_line == null) gdext.classes.RichTextLabel.mb_get_character_line = MethodBind.get("RichTextLabel", "get_character_line", 3744713108L)
    Ptrcall.call1[Long, Long](gdext.classes.RichTextLabel.mb_get_character_line, livePtr, character)
  }

  /** RichTextLabel.get_character_paragraph */
  final def getCharacterParagraph(character: Long): Long = {
    if (gdext.classes.RichTextLabel.mb_get_character_paragraph == null) gdext.classes.RichTextLabel.mb_get_character_paragraph = MethodBind.get("RichTextLabel", "get_character_paragraph", 3744713108L)
    Ptrcall.call1[Long, Long](gdext.classes.RichTextLabel.mb_get_character_paragraph, livePtr, character)
  }

  /** RichTextLabel.get_total_character_count */
  final def getTotalCharacterCount(): Long = {
    if (gdext.classes.RichTextLabel.mb_get_total_character_count == null) gdext.classes.RichTextLabel.mb_get_total_character_count = MethodBind.get("RichTextLabel", "get_total_character_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.RichTextLabel.mb_get_total_character_count, livePtr)
  }

  /** RichTextLabel.set_use_bbcode */
  final def setUseBbcode(enable: Boolean): Unit = {
    if (gdext.classes.RichTextLabel.mb_set_use_bbcode == null) gdext.classes.RichTextLabel.mb_set_use_bbcode = MethodBind.get("RichTextLabel", "set_use_bbcode", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RichTextLabel.mb_set_use_bbcode, livePtr, enable)
  }

  /** RichTextLabel.is_using_bbcode */
  final def isUsingBbcode(): Boolean = {
    if (gdext.classes.RichTextLabel.mb_is_using_bbcode == null) gdext.classes.RichTextLabel.mb_is_using_bbcode = MethodBind.get("RichTextLabel", "is_using_bbcode", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RichTextLabel.mb_is_using_bbcode, livePtr)
  }

  /** RichTextLabel.get_line_count */
  final def getLineCount(): Long = {
    if (gdext.classes.RichTextLabel.mb_get_line_count == null) gdext.classes.RichTextLabel.mb_get_line_count = MethodBind.get("RichTextLabel", "get_line_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.RichTextLabel.mb_get_line_count, livePtr)
  }

  /** RichTextLabel.get_line_range */
  final def getLineRange(line: Long): gdext.builtin.Vector2i = {
    if (gdext.classes.RichTextLabel.mb_get_line_range == null) gdext.classes.RichTextLabel.mb_get_line_range = MethodBind.get("RichTextLabel", "get_line_range", 3665014314L)
    Ptrcall.call1[Long, gdext.builtin.Vector2i](gdext.classes.RichTextLabel.mb_get_line_range, livePtr, line)
  }

  /** RichTextLabel.get_visible_line_count */
  final def getVisibleLineCount(): Long = {
    if (gdext.classes.RichTextLabel.mb_get_visible_line_count == null) gdext.classes.RichTextLabel.mb_get_visible_line_count = MethodBind.get("RichTextLabel", "get_visible_line_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.RichTextLabel.mb_get_visible_line_count, livePtr)
  }

  /** RichTextLabel.get_paragraph_count */
  final def getParagraphCount(): Long = {
    if (gdext.classes.RichTextLabel.mb_get_paragraph_count == null) gdext.classes.RichTextLabel.mb_get_paragraph_count = MethodBind.get("RichTextLabel", "get_paragraph_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.RichTextLabel.mb_get_paragraph_count, livePtr)
  }

  /** RichTextLabel.get_visible_paragraph_count */
  final def getVisibleParagraphCount(): Long = {
    if (gdext.classes.RichTextLabel.mb_get_visible_paragraph_count == null) gdext.classes.RichTextLabel.mb_get_visible_paragraph_count = MethodBind.get("RichTextLabel", "get_visible_paragraph_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.RichTextLabel.mb_get_visible_paragraph_count, livePtr)
  }

  /** RichTextLabel.get_content_height */
  final def getContentHeight(): Long = {
    if (gdext.classes.RichTextLabel.mb_get_content_height == null) gdext.classes.RichTextLabel.mb_get_content_height = MethodBind.get("RichTextLabel", "get_content_height", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.RichTextLabel.mb_get_content_height, livePtr)
  }

  /** RichTextLabel.get_content_width */
  final def getContentWidth(): Long = {
    if (gdext.classes.RichTextLabel.mb_get_content_width == null) gdext.classes.RichTextLabel.mb_get_content_width = MethodBind.get("RichTextLabel", "get_content_width", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.RichTextLabel.mb_get_content_width, livePtr)
  }

  /** RichTextLabel.get_line_height */
  final def getLineHeight(line: Long): Long = {
    if (gdext.classes.RichTextLabel.mb_get_line_height == null) gdext.classes.RichTextLabel.mb_get_line_height = MethodBind.get("RichTextLabel", "get_line_height", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.RichTextLabel.mb_get_line_height, livePtr, line)
  }

  /** RichTextLabel.get_line_width */
  final def getLineWidth(line: Long): Long = {
    if (gdext.classes.RichTextLabel.mb_get_line_width == null) gdext.classes.RichTextLabel.mb_get_line_width = MethodBind.get("RichTextLabel", "get_line_width", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.RichTextLabel.mb_get_line_width, livePtr, line)
  }

  /** RichTextLabel.get_visible_content_rect */
  final def getVisibleContentRect(): gdext.builtin.Rect2i = {
    if (gdext.classes.RichTextLabel.mb_get_visible_content_rect == null) gdext.classes.RichTextLabel.mb_get_visible_content_rect = MethodBind.get("RichTextLabel", "get_visible_content_rect", 410525958L)
    Ptrcall.call0[gdext.builtin.Rect2i](gdext.classes.RichTextLabel.mb_get_visible_content_rect, livePtr)
  }

  /** RichTextLabel.get_line_offset */
  final def getLineOffset(line: Long): Double = {
    if (gdext.classes.RichTextLabel.mb_get_line_offset == null) gdext.classes.RichTextLabel.mb_get_line_offset = MethodBind.get("RichTextLabel", "get_line_offset", 4025615559L)
    Ptrcall.call1[Long, Double](gdext.classes.RichTextLabel.mb_get_line_offset, livePtr, line)
  }

  /** RichTextLabel.get_paragraph_offset */
  final def getParagraphOffset(paragraph: Long): Double = {
    if (gdext.classes.RichTextLabel.mb_get_paragraph_offset == null) gdext.classes.RichTextLabel.mb_get_paragraph_offset = MethodBind.get("RichTextLabel", "get_paragraph_offset", 4025615559L)
    Ptrcall.call1[Long, Double](gdext.classes.RichTextLabel.mb_get_paragraph_offset, livePtr, paragraph)
  }

  /** RichTextLabel.reload_effects */
  final def reloadEffects(): Unit = {
    if (gdext.classes.RichTextLabel.mb_reload_effects == null) gdext.classes.RichTextLabel.mb_reload_effects = MethodBind.get("RichTextLabel", "reload_effects", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.RichTextLabel.mb_reload_effects, livePtr)
  }

  /** RichTextLabel.get_menu */
  final def getMenu(): PopupMenu = {
    if (gdext.classes.RichTextLabel.mb_get_menu == null) gdext.classes.RichTextLabel.mb_get_menu = MethodBind.get("RichTextLabel", "get_menu", 229722558L)
    Wrappers.borrowed[PopupMenu](Ptrcall.call0[Long](gdext.classes.RichTextLabel.mb_get_menu, livePtr))
  }

  /** RichTextLabel.is_menu_visible */
  final def isMenuVisible(): Boolean = {
    if (gdext.classes.RichTextLabel.mb_is_menu_visible == null) gdext.classes.RichTextLabel.mb_is_menu_visible = MethodBind.get("RichTextLabel", "is_menu_visible", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RichTextLabel.mb_is_menu_visible, livePtr)
  }

  /** RichTextLabel.menu_option */
  final def menuOption(option: Long): Unit = {
    if (gdext.classes.RichTextLabel.mb_menu_option == null) gdext.classes.RichTextLabel.mb_menu_option = MethodBind.get("RichTextLabel", "menu_option", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.RichTextLabel.mb_menu_option, livePtr, option)
  }

}

object RichTextLabel {
  private[classes] var mb_get_parsed_text: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_text: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_text: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_hr: GDExtensionMethodBindPtr = null
  private[classes] var mb_newline: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_paragraph: GDExtensionMethodBindPtr = null
  private[classes] var mb_invalidate_paragraph: GDExtensionMethodBindPtr = null
  private[classes] var mb_push_font: GDExtensionMethodBindPtr = null
  private[classes] var mb_push_font_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_push_normal: GDExtensionMethodBindPtr = null
  private[classes] var mb_push_bold: GDExtensionMethodBindPtr = null
  private[classes] var mb_push_bold_italics: GDExtensionMethodBindPtr = null
  private[classes] var mb_push_italics: GDExtensionMethodBindPtr = null
  private[classes] var mb_push_mono: GDExtensionMethodBindPtr = null
  private[classes] var mb_push_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_push_outline_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_push_outline_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_push_indent: GDExtensionMethodBindPtr = null
  private[classes] var mb_push_list: GDExtensionMethodBindPtr = null
  private[classes] var mb_push_hint: GDExtensionMethodBindPtr = null
  private[classes] var mb_push_language: GDExtensionMethodBindPtr = null
  private[classes] var mb_push_underline: GDExtensionMethodBindPtr = null
  private[classes] var mb_push_strikethrough: GDExtensionMethodBindPtr = null
  private[classes] var mb_push_table: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_table_column_expand: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_table_column_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_cell_row_background_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_cell_border_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_cell_size_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_cell_padding: GDExtensionMethodBindPtr = null
  private[classes] var mb_push_cell: GDExtensionMethodBindPtr = null
  private[classes] var mb_push_fgcolor: GDExtensionMethodBindPtr = null
  private[classes] var mb_push_bgcolor: GDExtensionMethodBindPtr = null
  private[classes] var mb_push_context: GDExtensionMethodBindPtr = null
  private[classes] var mb_pop_context: GDExtensionMethodBindPtr = null
  private[classes] var mb_pop: GDExtensionMethodBindPtr = null
  private[classes] var mb_pop_all: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_structured_text_bidi_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_structured_text_bidi_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_text_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_text_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_language: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_language: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_horizontal_alignment: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_horizontal_alignment: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_vertical_alignment: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_vertical_alignment: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_justification_flags: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_justification_flags: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_autowrap_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_autowrap_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_autowrap_trim_flags: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_autowrap_trim_flags: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_meta_underline: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_meta_underlined: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_hint_underline: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_hint_underlined: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_scroll_active: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_scroll_active: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_scroll_follow_visible_characters: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_scroll_following_visible_characters: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_scroll_follow: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_scroll_following: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_v_scroll_bar: GDExtensionMethodBindPtr = null
  private[classes] var mb_scroll_to_line: GDExtensionMethodBindPtr = null
  private[classes] var mb_scroll_to_paragraph: GDExtensionMethodBindPtr = null
  private[classes] var mb_scroll_to_selection: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tab_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tab_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_fit_content: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_fit_content_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_selection_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_selection_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_context_menu_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_context_menu_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_shortcut_keys_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_shortcut_keys_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_deselect_on_focus_loss_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_deselect_on_focus_loss_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_drag_and_drop_selection_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_drag_and_drop_selection_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_selection_from: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_selection_to: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_selection_line_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_select_all: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_selected_text: GDExtensionMethodBindPtr = null
  private[classes] var mb_deselect: GDExtensionMethodBindPtr = null
  private[classes] var mb_parse_bbcode: GDExtensionMethodBindPtr = null
  private[classes] var mb_append_text: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_text: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_ready: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_finished: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_threaded: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_threaded: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_progress_bar_delay: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_progress_bar_delay: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_visible_characters: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_visible_characters: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_visible_characters_behavior: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_visible_characters_behavior: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_visible_ratio: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_visible_ratio: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_character_line: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_character_paragraph: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_total_character_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_use_bbcode: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_using_bbcode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_line_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_line_range: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_visible_line_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_paragraph_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_visible_paragraph_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_content_height: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_content_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_line_height: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_line_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_visible_content_rect: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_line_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_paragraph_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_reload_effects: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_menu: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_menu_visible: GDExtensionMethodBindPtr = null
  private[classes] var mb_menu_option: GDExtensionMethodBindPtr = null
}
