package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `CodeEdit`, extends `TextEdit`. */
abstract class CodeEdit extends TextEdit {

  /** CodeEdit.set_indent_size */
  final def setIndentSize(size: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CodeEdit", "set_indent_size", 1286410249L), hostObject.objectPtr, size)

  /** CodeEdit.get_indent_size */
  final def getIndentSize(): Long =
    Ptrcall.call0[Long](MethodBind.get("CodeEdit", "get_indent_size", 3905245786L), hostObject.objectPtr)

  /** CodeEdit.set_indent_using_spaces */
  final def setIndentUsingSpaces(use_spaces: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CodeEdit", "set_indent_using_spaces", 2586408642L), hostObject.objectPtr, use_spaces)

  /** CodeEdit.is_indent_using_spaces */
  final def isIndentUsingSpaces(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CodeEdit", "is_indent_using_spaces", 36873697L), hostObject.objectPtr)

  /** CodeEdit.set_auto_indent_enabled */
  final def setAutoIndentEnabled(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CodeEdit", "set_auto_indent_enabled", 2586408642L), hostObject.objectPtr, enable)

  /** CodeEdit.is_auto_indent_enabled */
  final def isAutoIndentEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CodeEdit", "is_auto_indent_enabled", 36873697L), hostObject.objectPtr)

  /** CodeEdit.do_indent */
  final def doIndent(): Unit =
    Ptrcall.callVoid0(MethodBind.get("CodeEdit", "do_indent", 3218959716L), hostObject.objectPtr)

  /** CodeEdit.indent_lines */
  final def indentLines(): Unit =
    Ptrcall.callVoid0(MethodBind.get("CodeEdit", "indent_lines", 3218959716L), hostObject.objectPtr)

  /** CodeEdit.unindent_lines */
  final def unindentLines(): Unit =
    Ptrcall.callVoid0(MethodBind.get("CodeEdit", "unindent_lines", 3218959716L), hostObject.objectPtr)

  /** CodeEdit.convert_indent */
  final def convertIndent(from_line: Long, to_line: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("CodeEdit", "convert_indent", 423910286L), hostObject.objectPtr, from_line, to_line)

  /** CodeEdit.set_auto_brace_completion_enabled */
  final def setAutoBraceCompletionEnabled(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CodeEdit", "set_auto_brace_completion_enabled", 2586408642L), hostObject.objectPtr, enable)

  /** CodeEdit.is_auto_brace_completion_enabled */
  final def isAutoBraceCompletionEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CodeEdit", "is_auto_brace_completion_enabled", 36873697L), hostObject.objectPtr)

  /** CodeEdit.set_highlight_matching_braces_enabled */
  final def setHighlightMatchingBracesEnabled(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CodeEdit", "set_highlight_matching_braces_enabled", 2586408642L), hostObject.objectPtr, enable)

  /** CodeEdit.is_highlight_matching_braces_enabled */
  final def isHighlightMatchingBracesEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CodeEdit", "is_highlight_matching_braces_enabled", 36873697L), hostObject.objectPtr)

  /** CodeEdit.add_auto_brace_completion_pair */
  final def addAutoBraceCompletionPair(start_key: String, end_key: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("CodeEdit", "add_auto_brace_completion_pair", 3186203200L), hostObject.objectPtr, start_key, end_key)

  /** CodeEdit.has_auto_brace_completion_open_key */
  final def hasAutoBraceCompletionOpenKey(open_key: String): Boolean =
    Ptrcall.call1[String, Boolean](MethodBind.get("CodeEdit", "has_auto_brace_completion_open_key", 3927539163L), hostObject.objectPtr, open_key)

  /** CodeEdit.has_auto_brace_completion_close_key */
  final def hasAutoBraceCompletionCloseKey(close_key: String): Boolean =
    Ptrcall.call1[String, Boolean](MethodBind.get("CodeEdit", "has_auto_brace_completion_close_key", 3927539163L), hostObject.objectPtr, close_key)

  /** CodeEdit.get_auto_brace_completion_close_key */
  final def getAutoBraceCompletionCloseKey(open_key: String): String =
    Ptrcall.call1[String, String](MethodBind.get("CodeEdit", "get_auto_brace_completion_close_key", 3135753539L), hostObject.objectPtr, open_key)

  /** CodeEdit.set_draw_breakpoints_gutter */
  final def setDrawBreakpointsGutter(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CodeEdit", "set_draw_breakpoints_gutter", 2586408642L), hostObject.objectPtr, enable)

  /** CodeEdit.is_drawing_breakpoints_gutter */
  final def isDrawingBreakpointsGutter(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CodeEdit", "is_drawing_breakpoints_gutter", 36873697L), hostObject.objectPtr)

  /** CodeEdit.set_draw_bookmarks_gutter */
  final def setDrawBookmarksGutter(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CodeEdit", "set_draw_bookmarks_gutter", 2586408642L), hostObject.objectPtr, enable)

  /** CodeEdit.is_drawing_bookmarks_gutter */
  final def isDrawingBookmarksGutter(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CodeEdit", "is_drawing_bookmarks_gutter", 36873697L), hostObject.objectPtr)

  /** CodeEdit.set_draw_executing_lines_gutter */
  final def setDrawExecutingLinesGutter(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CodeEdit", "set_draw_executing_lines_gutter", 2586408642L), hostObject.objectPtr, enable)

  /** CodeEdit.is_drawing_executing_lines_gutter */
  final def isDrawingExecutingLinesGutter(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CodeEdit", "is_drawing_executing_lines_gutter", 36873697L), hostObject.objectPtr)

  /** CodeEdit.set_line_as_breakpoint */
  final def setLineAsBreakpoint(line: Long, breakpointed: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("CodeEdit", "set_line_as_breakpoint", 300928843L), hostObject.objectPtr, line, breakpointed)

  /** CodeEdit.is_line_breakpointed */
  final def isLineBreakpointed(line: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("CodeEdit", "is_line_breakpointed", 1116898809L), hostObject.objectPtr, line)

  /** CodeEdit.clear_breakpointed_lines */
  final def clearBreakpointedLines(): Unit =
    Ptrcall.callVoid0(MethodBind.get("CodeEdit", "clear_breakpointed_lines", 3218959716L), hostObject.objectPtr)

  /** CodeEdit.set_line_as_bookmarked */
  final def setLineAsBookmarked(line: Long, bookmarked: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("CodeEdit", "set_line_as_bookmarked", 300928843L), hostObject.objectPtr, line, bookmarked)

  /** CodeEdit.is_line_bookmarked */
  final def isLineBookmarked(line: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("CodeEdit", "is_line_bookmarked", 1116898809L), hostObject.objectPtr, line)

  /** CodeEdit.clear_bookmarked_lines */
  final def clearBookmarkedLines(): Unit =
    Ptrcall.callVoid0(MethodBind.get("CodeEdit", "clear_bookmarked_lines", 3218959716L), hostObject.objectPtr)

  /** CodeEdit.set_line_as_executing */
  final def setLineAsExecuting(line: Long, executing: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("CodeEdit", "set_line_as_executing", 300928843L), hostObject.objectPtr, line, executing)

  /** CodeEdit.is_line_executing */
  final def isLineExecuting(line: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("CodeEdit", "is_line_executing", 1116898809L), hostObject.objectPtr, line)

  /** CodeEdit.clear_executing_lines */
  final def clearExecutingLines(): Unit =
    Ptrcall.callVoid0(MethodBind.get("CodeEdit", "clear_executing_lines", 3218959716L), hostObject.objectPtr)

  /** CodeEdit.set_draw_line_numbers */
  final def setDrawLineNumbers(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CodeEdit", "set_draw_line_numbers", 2586408642L), hostObject.objectPtr, enable)

  /** CodeEdit.is_draw_line_numbers_enabled */
  final def isDrawLineNumbersEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CodeEdit", "is_draw_line_numbers_enabled", 36873697L), hostObject.objectPtr)

  /** CodeEdit.set_line_numbers_zero_padded */
  final def setLineNumbersZeroPadded(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CodeEdit", "set_line_numbers_zero_padded", 2586408642L), hostObject.objectPtr, enable)

  /** CodeEdit.is_line_numbers_zero_padded */
  final def isLineNumbersZeroPadded(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CodeEdit", "is_line_numbers_zero_padded", 36873697L), hostObject.objectPtr)

  /** CodeEdit.set_line_numbers_min_digits */
  final def setLineNumbersMinDigits(count: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CodeEdit", "set_line_numbers_min_digits", 1286410249L), hostObject.objectPtr, count)

  /** CodeEdit.get_line_numbers_min_digits */
  final def getLineNumbersMinDigits(): Long =
    Ptrcall.call0[Long](MethodBind.get("CodeEdit", "get_line_numbers_min_digits", 3905245786L), hostObject.objectPtr)

  /** CodeEdit.set_draw_fold_gutter */
  final def setDrawFoldGutter(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CodeEdit", "set_draw_fold_gutter", 2586408642L), hostObject.objectPtr, enable)

  /** CodeEdit.is_drawing_fold_gutter */
  final def isDrawingFoldGutter(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CodeEdit", "is_drawing_fold_gutter", 36873697L), hostObject.objectPtr)

  /** CodeEdit.set_line_folding_enabled */
  final def setLineFoldingEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CodeEdit", "set_line_folding_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** CodeEdit.is_line_folding_enabled */
  final def isLineFoldingEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CodeEdit", "is_line_folding_enabled", 36873697L), hostObject.objectPtr)

  /** CodeEdit.can_fold_line */
  final def canFoldLine(line: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("CodeEdit", "can_fold_line", 1116898809L), hostObject.objectPtr, line)

  /** CodeEdit.fold_line */
  final def foldLine(line: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CodeEdit", "fold_line", 1286410249L), hostObject.objectPtr, line)

  /** CodeEdit.unfold_line */
  final def unfoldLine(line: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CodeEdit", "unfold_line", 1286410249L), hostObject.objectPtr, line)

  /** CodeEdit.fold_all_lines */
  final def foldAllLines(): Unit =
    Ptrcall.callVoid0(MethodBind.get("CodeEdit", "fold_all_lines", 3218959716L), hostObject.objectPtr)

  /** CodeEdit.unfold_all_lines */
  final def unfoldAllLines(): Unit =
    Ptrcall.callVoid0(MethodBind.get("CodeEdit", "unfold_all_lines", 3218959716L), hostObject.objectPtr)

  /** CodeEdit.toggle_foldable_line */
  final def toggleFoldableLine(line: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CodeEdit", "toggle_foldable_line", 1286410249L), hostObject.objectPtr, line)

  /** CodeEdit.toggle_foldable_lines_at_carets */
  final def toggleFoldableLinesAtCarets(): Unit =
    Ptrcall.callVoid0(MethodBind.get("CodeEdit", "toggle_foldable_lines_at_carets", 3218959716L), hostObject.objectPtr)

  /** CodeEdit.is_line_folded */
  final def isLineFolded(line: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("CodeEdit", "is_line_folded", 1116898809L), hostObject.objectPtr, line)

  /** CodeEdit.create_code_region */
  final def createCodeRegion(): Unit =
    Ptrcall.callVoid0(MethodBind.get("CodeEdit", "create_code_region", 3218959716L), hostObject.objectPtr)

  /** CodeEdit.get_code_region_start_tag */
  final def getCodeRegionStartTag(): String =
    Ptrcall.call0[String](MethodBind.get("CodeEdit", "get_code_region_start_tag", 201670096L), hostObject.objectPtr)

  /** CodeEdit.get_code_region_end_tag */
  final def getCodeRegionEndTag(): String =
    Ptrcall.call0[String](MethodBind.get("CodeEdit", "get_code_region_end_tag", 201670096L), hostObject.objectPtr)

  /** CodeEdit.set_code_region_tags */
  final def setCodeRegionTags(start: String, end: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("CodeEdit", "set_code_region_tags", 708800718L), hostObject.objectPtr, start, end)

  /** CodeEdit.is_line_code_region_start */
  final def isLineCodeRegionStart(line: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("CodeEdit", "is_line_code_region_start", 1116898809L), hostObject.objectPtr, line)

  /** CodeEdit.is_line_code_region_end */
  final def isLineCodeRegionEnd(line: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("CodeEdit", "is_line_code_region_end", 1116898809L), hostObject.objectPtr, line)

  /** CodeEdit.add_string_delimiter */
  final def addStringDelimiter(start_key: String, end_key: String, line_only: Boolean): Unit =
    Ptrcall.callVoid3(MethodBind.get("CodeEdit", "add_string_delimiter", 3146098955L), hostObject.objectPtr, start_key, end_key, line_only)

  /** CodeEdit.remove_string_delimiter */
  final def removeStringDelimiter(start_key: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("CodeEdit", "remove_string_delimiter", 83702148L), hostObject.objectPtr, start_key)

  /** CodeEdit.has_string_delimiter */
  final def hasStringDelimiter(start_key: String): Boolean =
    Ptrcall.call1[String, Boolean](MethodBind.get("CodeEdit", "has_string_delimiter", 3927539163L), hostObject.objectPtr, start_key)

  /** CodeEdit.clear_string_delimiters */
  final def clearStringDelimiters(): Unit =
    Ptrcall.callVoid0(MethodBind.get("CodeEdit", "clear_string_delimiters", 3218959716L), hostObject.objectPtr)

  /** CodeEdit.is_in_string */
  final def isInString(line: Long, column: Long): Long =
    Ptrcall.call2[Long, Long, Long](MethodBind.get("CodeEdit", "is_in_string", 688195400L), hostObject.objectPtr, line, column)

  /** CodeEdit.add_comment_delimiter */
  final def addCommentDelimiter(start_key: String, end_key: String, line_only: Boolean): Unit =
    Ptrcall.callVoid3(MethodBind.get("CodeEdit", "add_comment_delimiter", 3146098955L), hostObject.objectPtr, start_key, end_key, line_only)

  /** CodeEdit.remove_comment_delimiter */
  final def removeCommentDelimiter(start_key: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("CodeEdit", "remove_comment_delimiter", 83702148L), hostObject.objectPtr, start_key)

  /** CodeEdit.has_comment_delimiter */
  final def hasCommentDelimiter(start_key: String): Boolean =
    Ptrcall.call1[String, Boolean](MethodBind.get("CodeEdit", "has_comment_delimiter", 3927539163L), hostObject.objectPtr, start_key)

  /** CodeEdit.clear_comment_delimiters */
  final def clearCommentDelimiters(): Unit =
    Ptrcall.callVoid0(MethodBind.get("CodeEdit", "clear_comment_delimiters", 3218959716L), hostObject.objectPtr)

  /** CodeEdit.is_in_comment */
  final def isInComment(line: Long, column: Long): Long =
    Ptrcall.call2[Long, Long, Long](MethodBind.get("CodeEdit", "is_in_comment", 688195400L), hostObject.objectPtr, line, column)

  /** CodeEdit.get_delimiter_start_key */
  final def getDelimiterStartKey(delimiter_index: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("CodeEdit", "get_delimiter_start_key", 844755477L), hostObject.objectPtr, delimiter_index)

  /** CodeEdit.get_delimiter_end_key */
  final def getDelimiterEndKey(delimiter_index: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("CodeEdit", "get_delimiter_end_key", 844755477L), hostObject.objectPtr, delimiter_index)

  /** CodeEdit.get_delimiter_start_position */
  final def getDelimiterStartPosition(line: Long, column: Long): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call2[Long, Long, io.github.optical002.godot.builtin.Vector2](MethodBind.get("CodeEdit", "get_delimiter_start_position", 3016396712L), hostObject.objectPtr, line, column)

  /** CodeEdit.get_delimiter_end_position */
  final def getDelimiterEndPosition(line: Long, column: Long): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call2[Long, Long, io.github.optical002.godot.builtin.Vector2](MethodBind.get("CodeEdit", "get_delimiter_end_position", 3016396712L), hostObject.objectPtr, line, column)

  /** CodeEdit.set_code_hint */
  final def setCodeHint(code_hint: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("CodeEdit", "set_code_hint", 83702148L), hostObject.objectPtr, code_hint)

  /** CodeEdit.set_code_hint_draw_below */
  final def setCodeHintDrawBelow(draw_below: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CodeEdit", "set_code_hint_draw_below", 2586408642L), hostObject.objectPtr, draw_below)

  /** CodeEdit.get_text_for_code_completion */
  final def getTextForCodeCompletion(): String =
    Ptrcall.call0[String](MethodBind.get("CodeEdit", "get_text_for_code_completion", 201670096L), hostObject.objectPtr)

  /** CodeEdit.request_code_completion */
  final def requestCodeCompletion(force: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CodeEdit", "request_code_completion", 107499316L), hostObject.objectPtr, force)

  /** CodeEdit.update_code_completion_options */
  final def updateCodeCompletionOptions(force: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CodeEdit", "update_code_completion_options", 2586408642L), hostObject.objectPtr, force)

  /** CodeEdit.get_code_completion_selected_index */
  final def getCodeCompletionSelectedIndex(): Long =
    Ptrcall.call0[Long](MethodBind.get("CodeEdit", "get_code_completion_selected_index", 3905245786L), hostObject.objectPtr)

  /** CodeEdit.set_code_completion_selected_index */
  final def setCodeCompletionSelectedIndex(index: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CodeEdit", "set_code_completion_selected_index", 1286410249L), hostObject.objectPtr, index)

  /** CodeEdit.confirm_code_completion */
  final def confirmCodeCompletion(replace: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CodeEdit", "confirm_code_completion", 107499316L), hostObject.objectPtr, replace)

  /** CodeEdit.cancel_code_completion */
  final def cancelCodeCompletion(): Unit =
    Ptrcall.callVoid0(MethodBind.get("CodeEdit", "cancel_code_completion", 3218959716L), hostObject.objectPtr)

  /** CodeEdit.set_code_completion_enabled */
  final def setCodeCompletionEnabled(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CodeEdit", "set_code_completion_enabled", 2586408642L), hostObject.objectPtr, enable)

  /** CodeEdit.is_code_completion_enabled */
  final def isCodeCompletionEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CodeEdit", "is_code_completion_enabled", 36873697L), hostObject.objectPtr)

  /** CodeEdit.set_symbol_lookup_on_click_enabled */
  final def setSymbolLookupOnClickEnabled(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CodeEdit", "set_symbol_lookup_on_click_enabled", 2586408642L), hostObject.objectPtr, enable)

  /** CodeEdit.is_symbol_lookup_on_click_enabled */
  final def isSymbolLookupOnClickEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CodeEdit", "is_symbol_lookup_on_click_enabled", 36873697L), hostObject.objectPtr)

  /** CodeEdit.get_text_for_symbol_lookup */
  final def getTextForSymbolLookup(): String =
    Ptrcall.call0[String](MethodBind.get("CodeEdit", "get_text_for_symbol_lookup", 201670096L), hostObject.objectPtr)

  /** CodeEdit.get_text_with_cursor_char */
  final def getTextWithCursorChar(line: Long, column: Long): String =
    Ptrcall.call2[Long, Long, String](MethodBind.get("CodeEdit", "get_text_with_cursor_char", 1391810591L), hostObject.objectPtr, line, column)

  /** CodeEdit.set_symbol_lookup_word_as_valid */
  final def setSymbolLookupWordAsValid(valid: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CodeEdit", "set_symbol_lookup_word_as_valid", 2586408642L), hostObject.objectPtr, valid)

  /** CodeEdit.set_symbol_tooltip_on_hover_enabled */
  final def setSymbolTooltipOnHoverEnabled(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CodeEdit", "set_symbol_tooltip_on_hover_enabled", 2586408642L), hostObject.objectPtr, enable)

  /** CodeEdit.is_symbol_tooltip_on_hover_enabled */
  final def isSymbolTooltipOnHoverEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CodeEdit", "is_symbol_tooltip_on_hover_enabled", 36873697L), hostObject.objectPtr)

  /** CodeEdit.move_lines_up */
  final def moveLinesUp(): Unit =
    Ptrcall.callVoid0(MethodBind.get("CodeEdit", "move_lines_up", 3218959716L), hostObject.objectPtr)

  /** CodeEdit.move_lines_down */
  final def moveLinesDown(): Unit =
    Ptrcall.callVoid0(MethodBind.get("CodeEdit", "move_lines_down", 3218959716L), hostObject.objectPtr)

  /** CodeEdit.delete_lines */
  final def deleteLines(): Unit =
    Ptrcall.callVoid0(MethodBind.get("CodeEdit", "delete_lines", 3218959716L), hostObject.objectPtr)

  /** CodeEdit.duplicate_selection */
  final def duplicateSelection(): Unit =
    Ptrcall.callVoid0(MethodBind.get("CodeEdit", "duplicate_selection", 3218959716L), hostObject.objectPtr)

  /** CodeEdit.duplicate_lines */
  final def duplicateLines(): Unit =
    Ptrcall.callVoid0(MethodBind.get("CodeEdit", "duplicate_lines", 3218959716L), hostObject.objectPtr)

}

object CodeEdit {
  /** Class metadata for Gd[CodeEdit] lifetime management and casting. */
  given GodotClass[CodeEdit] with {
    def className = "CodeEdit"
    def isRefCounted = false
    def wrap(o: GodotObject): CodeEdit = new CodeEdit {}.withHost(o.objectPtr)
    def unwrap(t: CodeEdit): GodotObject = t.hostObject
  }
}
