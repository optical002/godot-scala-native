package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `CodeEdit`, extends `TextEdit`. */
abstract class CodeEdit extends TextEdit {
  override def godotClassName: String = "CodeEdit"

  /** CodeEdit.set_indent_size */
  final def setIndentSize(size: Long): Unit = {
    if (gdext.classes.CodeEdit.mb_set_indent_size == null) gdext.classes.CodeEdit.mb_set_indent_size = MethodBind.get("CodeEdit", "set_indent_size", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.CodeEdit.mb_set_indent_size, livePtr, size)
  }

  /** CodeEdit.get_indent_size */
  final def getIndentSize(): Long = {
    if (gdext.classes.CodeEdit.mb_get_indent_size == null) gdext.classes.CodeEdit.mb_get_indent_size = MethodBind.get("CodeEdit", "get_indent_size", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.CodeEdit.mb_get_indent_size, livePtr)
  }

  /** CodeEdit.set_indent_using_spaces */
  final def setIndentUsingSpaces(useSpaces: Boolean): Unit = {
    if (gdext.classes.CodeEdit.mb_set_indent_using_spaces == null) gdext.classes.CodeEdit.mb_set_indent_using_spaces = MethodBind.get("CodeEdit", "set_indent_using_spaces", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CodeEdit.mb_set_indent_using_spaces, livePtr, useSpaces)
  }

  /** CodeEdit.is_indent_using_spaces */
  final def isIndentUsingSpaces(): Boolean = {
    if (gdext.classes.CodeEdit.mb_is_indent_using_spaces == null) gdext.classes.CodeEdit.mb_is_indent_using_spaces = MethodBind.get("CodeEdit", "is_indent_using_spaces", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CodeEdit.mb_is_indent_using_spaces, livePtr)
  }

  /** CodeEdit.set_auto_indent_enabled */
  final def setAutoIndentEnabled(enable: Boolean): Unit = {
    if (gdext.classes.CodeEdit.mb_set_auto_indent_enabled == null) gdext.classes.CodeEdit.mb_set_auto_indent_enabled = MethodBind.get("CodeEdit", "set_auto_indent_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CodeEdit.mb_set_auto_indent_enabled, livePtr, enable)
  }

  /** CodeEdit.is_auto_indent_enabled */
  final def isAutoIndentEnabled(): Boolean = {
    if (gdext.classes.CodeEdit.mb_is_auto_indent_enabled == null) gdext.classes.CodeEdit.mb_is_auto_indent_enabled = MethodBind.get("CodeEdit", "is_auto_indent_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CodeEdit.mb_is_auto_indent_enabled, livePtr)
  }

  /** CodeEdit.do_indent */
  final def doIndent(): Unit = {
    if (gdext.classes.CodeEdit.mb_do_indent == null) gdext.classes.CodeEdit.mb_do_indent = MethodBind.get("CodeEdit", "do_indent", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.CodeEdit.mb_do_indent, livePtr)
  }

  /** CodeEdit.indent_lines */
  final def indentLines(): Unit = {
    if (gdext.classes.CodeEdit.mb_indent_lines == null) gdext.classes.CodeEdit.mb_indent_lines = MethodBind.get("CodeEdit", "indent_lines", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.CodeEdit.mb_indent_lines, livePtr)
  }

  /** CodeEdit.unindent_lines */
  final def unindentLines(): Unit = {
    if (gdext.classes.CodeEdit.mb_unindent_lines == null) gdext.classes.CodeEdit.mb_unindent_lines = MethodBind.get("CodeEdit", "unindent_lines", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.CodeEdit.mb_unindent_lines, livePtr)
  }

  /** CodeEdit.convert_indent */
  final def convertIndent(fromLine: Long = -1L, toLine: Long = -1L): Unit = {
    if (gdext.classes.CodeEdit.mb_convert_indent == null) gdext.classes.CodeEdit.mb_convert_indent = MethodBind.get("CodeEdit", "convert_indent", 423910286L)
    Ptrcall.callVoid2(gdext.classes.CodeEdit.mb_convert_indent, livePtr, fromLine, toLine)
  }

  /** CodeEdit.set_auto_brace_completion_enabled */
  final def setAutoBraceCompletionEnabled(enable: Boolean): Unit = {
    if (gdext.classes.CodeEdit.mb_set_auto_brace_completion_enabled == null) gdext.classes.CodeEdit.mb_set_auto_brace_completion_enabled = MethodBind.get("CodeEdit", "set_auto_brace_completion_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CodeEdit.mb_set_auto_brace_completion_enabled, livePtr, enable)
  }

  /** CodeEdit.is_auto_brace_completion_enabled */
  final def isAutoBraceCompletionEnabled(): Boolean = {
    if (gdext.classes.CodeEdit.mb_is_auto_brace_completion_enabled == null) gdext.classes.CodeEdit.mb_is_auto_brace_completion_enabled = MethodBind.get("CodeEdit", "is_auto_brace_completion_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CodeEdit.mb_is_auto_brace_completion_enabled, livePtr)
  }

  /** CodeEdit.set_highlight_matching_braces_enabled */
  final def setHighlightMatchingBracesEnabled(enable: Boolean): Unit = {
    if (gdext.classes.CodeEdit.mb_set_highlight_matching_braces_enabled == null) gdext.classes.CodeEdit.mb_set_highlight_matching_braces_enabled = MethodBind.get("CodeEdit", "set_highlight_matching_braces_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CodeEdit.mb_set_highlight_matching_braces_enabled, livePtr, enable)
  }

  /** CodeEdit.is_highlight_matching_braces_enabled */
  final def isHighlightMatchingBracesEnabled(): Boolean = {
    if (gdext.classes.CodeEdit.mb_is_highlight_matching_braces_enabled == null) gdext.classes.CodeEdit.mb_is_highlight_matching_braces_enabled = MethodBind.get("CodeEdit", "is_highlight_matching_braces_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CodeEdit.mb_is_highlight_matching_braces_enabled, livePtr)
  }

  /** CodeEdit.add_auto_brace_completion_pair */
  final def addAutoBraceCompletionPair(startKey: String, endKey: String): Unit = {
    if (gdext.classes.CodeEdit.mb_add_auto_brace_completion_pair == null) gdext.classes.CodeEdit.mb_add_auto_brace_completion_pair = MethodBind.get("CodeEdit", "add_auto_brace_completion_pair", 3186203200L)
    Ptrcall.callVoid2(gdext.classes.CodeEdit.mb_add_auto_brace_completion_pair, livePtr, startKey, endKey)
  }

  /** CodeEdit.has_auto_brace_completion_open_key */
  final def hasAutoBraceCompletionOpenKey(openKey: String): Boolean = {
    if (gdext.classes.CodeEdit.mb_has_auto_brace_completion_open_key == null) gdext.classes.CodeEdit.mb_has_auto_brace_completion_open_key = MethodBind.get("CodeEdit", "has_auto_brace_completion_open_key", 3927539163L)
    Ptrcall.call1[String, Boolean](gdext.classes.CodeEdit.mb_has_auto_brace_completion_open_key, livePtr, openKey)
  }

  /** CodeEdit.has_auto_brace_completion_close_key */
  final def hasAutoBraceCompletionCloseKey(closeKey: String): Boolean = {
    if (gdext.classes.CodeEdit.mb_has_auto_brace_completion_close_key == null) gdext.classes.CodeEdit.mb_has_auto_brace_completion_close_key = MethodBind.get("CodeEdit", "has_auto_brace_completion_close_key", 3927539163L)
    Ptrcall.call1[String, Boolean](gdext.classes.CodeEdit.mb_has_auto_brace_completion_close_key, livePtr, closeKey)
  }

  /** CodeEdit.get_auto_brace_completion_close_key */
  final def getAutoBraceCompletionCloseKey(openKey: String): String = {
    if (gdext.classes.CodeEdit.mb_get_auto_brace_completion_close_key == null) gdext.classes.CodeEdit.mb_get_auto_brace_completion_close_key = MethodBind.get("CodeEdit", "get_auto_brace_completion_close_key", 3135753539L)
    Ptrcall.call1[String, String](gdext.classes.CodeEdit.mb_get_auto_brace_completion_close_key, livePtr, openKey)
  }

  /** CodeEdit.set_draw_breakpoints_gutter */
  final def setDrawBreakpointsGutter(enable: Boolean): Unit = {
    if (gdext.classes.CodeEdit.mb_set_draw_breakpoints_gutter == null) gdext.classes.CodeEdit.mb_set_draw_breakpoints_gutter = MethodBind.get("CodeEdit", "set_draw_breakpoints_gutter", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CodeEdit.mb_set_draw_breakpoints_gutter, livePtr, enable)
  }

  /** CodeEdit.is_drawing_breakpoints_gutter */
  final def isDrawingBreakpointsGutter(): Boolean = {
    if (gdext.classes.CodeEdit.mb_is_drawing_breakpoints_gutter == null) gdext.classes.CodeEdit.mb_is_drawing_breakpoints_gutter = MethodBind.get("CodeEdit", "is_drawing_breakpoints_gutter", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CodeEdit.mb_is_drawing_breakpoints_gutter, livePtr)
  }

  /** CodeEdit.set_draw_bookmarks_gutter */
  final def setDrawBookmarksGutter(enable: Boolean): Unit = {
    if (gdext.classes.CodeEdit.mb_set_draw_bookmarks_gutter == null) gdext.classes.CodeEdit.mb_set_draw_bookmarks_gutter = MethodBind.get("CodeEdit", "set_draw_bookmarks_gutter", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CodeEdit.mb_set_draw_bookmarks_gutter, livePtr, enable)
  }

  /** CodeEdit.is_drawing_bookmarks_gutter */
  final def isDrawingBookmarksGutter(): Boolean = {
    if (gdext.classes.CodeEdit.mb_is_drawing_bookmarks_gutter == null) gdext.classes.CodeEdit.mb_is_drawing_bookmarks_gutter = MethodBind.get("CodeEdit", "is_drawing_bookmarks_gutter", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CodeEdit.mb_is_drawing_bookmarks_gutter, livePtr)
  }

  /** CodeEdit.set_draw_executing_lines_gutter */
  final def setDrawExecutingLinesGutter(enable: Boolean): Unit = {
    if (gdext.classes.CodeEdit.mb_set_draw_executing_lines_gutter == null) gdext.classes.CodeEdit.mb_set_draw_executing_lines_gutter = MethodBind.get("CodeEdit", "set_draw_executing_lines_gutter", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CodeEdit.mb_set_draw_executing_lines_gutter, livePtr, enable)
  }

  /** CodeEdit.is_drawing_executing_lines_gutter */
  final def isDrawingExecutingLinesGutter(): Boolean = {
    if (gdext.classes.CodeEdit.mb_is_drawing_executing_lines_gutter == null) gdext.classes.CodeEdit.mb_is_drawing_executing_lines_gutter = MethodBind.get("CodeEdit", "is_drawing_executing_lines_gutter", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CodeEdit.mb_is_drawing_executing_lines_gutter, livePtr)
  }

  /** CodeEdit.set_line_as_breakpoint */
  final def setLineAsBreakpoint(line: Long, breakpointed: Boolean): Unit = {
    if (gdext.classes.CodeEdit.mb_set_line_as_breakpoint == null) gdext.classes.CodeEdit.mb_set_line_as_breakpoint = MethodBind.get("CodeEdit", "set_line_as_breakpoint", 300928843L)
    Ptrcall.callVoid2(gdext.classes.CodeEdit.mb_set_line_as_breakpoint, livePtr, line, breakpointed)
  }

  /** CodeEdit.is_line_breakpointed */
  final def isLineBreakpointed(line: Long): Boolean = {
    if (gdext.classes.CodeEdit.mb_is_line_breakpointed == null) gdext.classes.CodeEdit.mb_is_line_breakpointed = MethodBind.get("CodeEdit", "is_line_breakpointed", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.CodeEdit.mb_is_line_breakpointed, livePtr, line)
  }

  /** CodeEdit.clear_breakpointed_lines */
  final def clearBreakpointedLines(): Unit = {
    if (gdext.classes.CodeEdit.mb_clear_breakpointed_lines == null) gdext.classes.CodeEdit.mb_clear_breakpointed_lines = MethodBind.get("CodeEdit", "clear_breakpointed_lines", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.CodeEdit.mb_clear_breakpointed_lines, livePtr)
  }

  /** CodeEdit.set_line_as_bookmarked */
  final def setLineAsBookmarked(line: Long, bookmarked: Boolean): Unit = {
    if (gdext.classes.CodeEdit.mb_set_line_as_bookmarked == null) gdext.classes.CodeEdit.mb_set_line_as_bookmarked = MethodBind.get("CodeEdit", "set_line_as_bookmarked", 300928843L)
    Ptrcall.callVoid2(gdext.classes.CodeEdit.mb_set_line_as_bookmarked, livePtr, line, bookmarked)
  }

  /** CodeEdit.is_line_bookmarked */
  final def isLineBookmarked(line: Long): Boolean = {
    if (gdext.classes.CodeEdit.mb_is_line_bookmarked == null) gdext.classes.CodeEdit.mb_is_line_bookmarked = MethodBind.get("CodeEdit", "is_line_bookmarked", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.CodeEdit.mb_is_line_bookmarked, livePtr, line)
  }

  /** CodeEdit.clear_bookmarked_lines */
  final def clearBookmarkedLines(): Unit = {
    if (gdext.classes.CodeEdit.mb_clear_bookmarked_lines == null) gdext.classes.CodeEdit.mb_clear_bookmarked_lines = MethodBind.get("CodeEdit", "clear_bookmarked_lines", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.CodeEdit.mb_clear_bookmarked_lines, livePtr)
  }

  /** CodeEdit.set_line_as_executing */
  final def setLineAsExecuting(line: Long, executing: Boolean): Unit = {
    if (gdext.classes.CodeEdit.mb_set_line_as_executing == null) gdext.classes.CodeEdit.mb_set_line_as_executing = MethodBind.get("CodeEdit", "set_line_as_executing", 300928843L)
    Ptrcall.callVoid2(gdext.classes.CodeEdit.mb_set_line_as_executing, livePtr, line, executing)
  }

  /** CodeEdit.is_line_executing */
  final def isLineExecuting(line: Long): Boolean = {
    if (gdext.classes.CodeEdit.mb_is_line_executing == null) gdext.classes.CodeEdit.mb_is_line_executing = MethodBind.get("CodeEdit", "is_line_executing", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.CodeEdit.mb_is_line_executing, livePtr, line)
  }

  /** CodeEdit.clear_executing_lines */
  final def clearExecutingLines(): Unit = {
    if (gdext.classes.CodeEdit.mb_clear_executing_lines == null) gdext.classes.CodeEdit.mb_clear_executing_lines = MethodBind.get("CodeEdit", "clear_executing_lines", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.CodeEdit.mb_clear_executing_lines, livePtr)
  }

  /** CodeEdit.set_draw_line_numbers */
  final def setDrawLineNumbers(enable: Boolean): Unit = {
    if (gdext.classes.CodeEdit.mb_set_draw_line_numbers == null) gdext.classes.CodeEdit.mb_set_draw_line_numbers = MethodBind.get("CodeEdit", "set_draw_line_numbers", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CodeEdit.mb_set_draw_line_numbers, livePtr, enable)
  }

  /** CodeEdit.is_draw_line_numbers_enabled */
  final def isDrawLineNumbersEnabled(): Boolean = {
    if (gdext.classes.CodeEdit.mb_is_draw_line_numbers_enabled == null) gdext.classes.CodeEdit.mb_is_draw_line_numbers_enabled = MethodBind.get("CodeEdit", "is_draw_line_numbers_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CodeEdit.mb_is_draw_line_numbers_enabled, livePtr)
  }

  /** CodeEdit.set_line_numbers_zero_padded */
  final def setLineNumbersZeroPadded(enable: Boolean): Unit = {
    if (gdext.classes.CodeEdit.mb_set_line_numbers_zero_padded == null) gdext.classes.CodeEdit.mb_set_line_numbers_zero_padded = MethodBind.get("CodeEdit", "set_line_numbers_zero_padded", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CodeEdit.mb_set_line_numbers_zero_padded, livePtr, enable)
  }

  /** CodeEdit.is_line_numbers_zero_padded */
  final def isLineNumbersZeroPadded(): Boolean = {
    if (gdext.classes.CodeEdit.mb_is_line_numbers_zero_padded == null) gdext.classes.CodeEdit.mb_is_line_numbers_zero_padded = MethodBind.get("CodeEdit", "is_line_numbers_zero_padded", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CodeEdit.mb_is_line_numbers_zero_padded, livePtr)
  }

  /** CodeEdit.set_line_numbers_min_digits */
  final def setLineNumbersMinDigits(count: Long): Unit = {
    if (gdext.classes.CodeEdit.mb_set_line_numbers_min_digits == null) gdext.classes.CodeEdit.mb_set_line_numbers_min_digits = MethodBind.get("CodeEdit", "set_line_numbers_min_digits", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.CodeEdit.mb_set_line_numbers_min_digits, livePtr, count)
  }

  /** CodeEdit.get_line_numbers_min_digits */
  final def getLineNumbersMinDigits(): Long = {
    if (gdext.classes.CodeEdit.mb_get_line_numbers_min_digits == null) gdext.classes.CodeEdit.mb_get_line_numbers_min_digits = MethodBind.get("CodeEdit", "get_line_numbers_min_digits", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.CodeEdit.mb_get_line_numbers_min_digits, livePtr)
  }

  /** CodeEdit.set_draw_fold_gutter */
  final def setDrawFoldGutter(enable: Boolean): Unit = {
    if (gdext.classes.CodeEdit.mb_set_draw_fold_gutter == null) gdext.classes.CodeEdit.mb_set_draw_fold_gutter = MethodBind.get("CodeEdit", "set_draw_fold_gutter", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CodeEdit.mb_set_draw_fold_gutter, livePtr, enable)
  }

  /** CodeEdit.is_drawing_fold_gutter */
  final def isDrawingFoldGutter(): Boolean = {
    if (gdext.classes.CodeEdit.mb_is_drawing_fold_gutter == null) gdext.classes.CodeEdit.mb_is_drawing_fold_gutter = MethodBind.get("CodeEdit", "is_drawing_fold_gutter", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CodeEdit.mb_is_drawing_fold_gutter, livePtr)
  }

  /** CodeEdit.set_line_folding_enabled */
  final def setLineFoldingEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.CodeEdit.mb_set_line_folding_enabled == null) gdext.classes.CodeEdit.mb_set_line_folding_enabled = MethodBind.get("CodeEdit", "set_line_folding_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CodeEdit.mb_set_line_folding_enabled, livePtr, enabled)
  }

  /** CodeEdit.is_line_folding_enabled */
  final def isLineFoldingEnabled(): Boolean = {
    if (gdext.classes.CodeEdit.mb_is_line_folding_enabled == null) gdext.classes.CodeEdit.mb_is_line_folding_enabled = MethodBind.get("CodeEdit", "is_line_folding_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CodeEdit.mb_is_line_folding_enabled, livePtr)
  }

  /** CodeEdit.can_fold_line */
  final def canFoldLine(line: Long): Boolean = {
    if (gdext.classes.CodeEdit.mb_can_fold_line == null) gdext.classes.CodeEdit.mb_can_fold_line = MethodBind.get("CodeEdit", "can_fold_line", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.CodeEdit.mb_can_fold_line, livePtr, line)
  }

  /** CodeEdit.fold_line */
  final def foldLine(line: Long): Unit = {
    if (gdext.classes.CodeEdit.mb_fold_line == null) gdext.classes.CodeEdit.mb_fold_line = MethodBind.get("CodeEdit", "fold_line", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.CodeEdit.mb_fold_line, livePtr, line)
  }

  /** CodeEdit.unfold_line */
  final def unfoldLine(line: Long): Unit = {
    if (gdext.classes.CodeEdit.mb_unfold_line == null) gdext.classes.CodeEdit.mb_unfold_line = MethodBind.get("CodeEdit", "unfold_line", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.CodeEdit.mb_unfold_line, livePtr, line)
  }

  /** CodeEdit.fold_all_lines */
  final def foldAllLines(): Unit = {
    if (gdext.classes.CodeEdit.mb_fold_all_lines == null) gdext.classes.CodeEdit.mb_fold_all_lines = MethodBind.get("CodeEdit", "fold_all_lines", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.CodeEdit.mb_fold_all_lines, livePtr)
  }

  /** CodeEdit.unfold_all_lines */
  final def unfoldAllLines(): Unit = {
    if (gdext.classes.CodeEdit.mb_unfold_all_lines == null) gdext.classes.CodeEdit.mb_unfold_all_lines = MethodBind.get("CodeEdit", "unfold_all_lines", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.CodeEdit.mb_unfold_all_lines, livePtr)
  }

  /** CodeEdit.toggle_foldable_line */
  final def toggleFoldableLine(line: Long): Unit = {
    if (gdext.classes.CodeEdit.mb_toggle_foldable_line == null) gdext.classes.CodeEdit.mb_toggle_foldable_line = MethodBind.get("CodeEdit", "toggle_foldable_line", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.CodeEdit.mb_toggle_foldable_line, livePtr, line)
  }

  /** CodeEdit.toggle_foldable_lines_at_carets */
  final def toggleFoldableLinesAtCarets(): Unit = {
    if (gdext.classes.CodeEdit.mb_toggle_foldable_lines_at_carets == null) gdext.classes.CodeEdit.mb_toggle_foldable_lines_at_carets = MethodBind.get("CodeEdit", "toggle_foldable_lines_at_carets", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.CodeEdit.mb_toggle_foldable_lines_at_carets, livePtr)
  }

  /** CodeEdit.is_line_folded */
  final def isLineFolded(line: Long): Boolean = {
    if (gdext.classes.CodeEdit.mb_is_line_folded == null) gdext.classes.CodeEdit.mb_is_line_folded = MethodBind.get("CodeEdit", "is_line_folded", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.CodeEdit.mb_is_line_folded, livePtr, line)
  }

  /** CodeEdit.create_code_region */
  final def createCodeRegion(): Unit = {
    if (gdext.classes.CodeEdit.mb_create_code_region == null) gdext.classes.CodeEdit.mb_create_code_region = MethodBind.get("CodeEdit", "create_code_region", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.CodeEdit.mb_create_code_region, livePtr)
  }

  /** CodeEdit.get_code_region_start_tag */
  final def getCodeRegionStartTag(): String = {
    if (gdext.classes.CodeEdit.mb_get_code_region_start_tag == null) gdext.classes.CodeEdit.mb_get_code_region_start_tag = MethodBind.get("CodeEdit", "get_code_region_start_tag", 201670096L)
    Ptrcall.call0[String](gdext.classes.CodeEdit.mb_get_code_region_start_tag, livePtr)
  }

  /** CodeEdit.get_code_region_end_tag */
  final def getCodeRegionEndTag(): String = {
    if (gdext.classes.CodeEdit.mb_get_code_region_end_tag == null) gdext.classes.CodeEdit.mb_get_code_region_end_tag = MethodBind.get("CodeEdit", "get_code_region_end_tag", 201670096L)
    Ptrcall.call0[String](gdext.classes.CodeEdit.mb_get_code_region_end_tag, livePtr)
  }

  /** CodeEdit.set_code_region_tags */
  final def setCodeRegionTags(start: String = "region", end: String = "endregion"): Unit = {
    if (gdext.classes.CodeEdit.mb_set_code_region_tags == null) gdext.classes.CodeEdit.mb_set_code_region_tags = MethodBind.get("CodeEdit", "set_code_region_tags", 708800718L)
    Ptrcall.callVoid2(gdext.classes.CodeEdit.mb_set_code_region_tags, livePtr, start, end)
  }

  /** CodeEdit.is_line_code_region_start */
  final def isLineCodeRegionStart(line: Long): Boolean = {
    if (gdext.classes.CodeEdit.mb_is_line_code_region_start == null) gdext.classes.CodeEdit.mb_is_line_code_region_start = MethodBind.get("CodeEdit", "is_line_code_region_start", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.CodeEdit.mb_is_line_code_region_start, livePtr, line)
  }

  /** CodeEdit.is_line_code_region_end */
  final def isLineCodeRegionEnd(line: Long): Boolean = {
    if (gdext.classes.CodeEdit.mb_is_line_code_region_end == null) gdext.classes.CodeEdit.mb_is_line_code_region_end = MethodBind.get("CodeEdit", "is_line_code_region_end", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.CodeEdit.mb_is_line_code_region_end, livePtr, line)
  }

  /** CodeEdit.add_string_delimiter */
  final def addStringDelimiter(startKey: String, endKey: String, lineOnly: Boolean = false): Unit = {
    if (gdext.classes.CodeEdit.mb_add_string_delimiter == null) gdext.classes.CodeEdit.mb_add_string_delimiter = MethodBind.get("CodeEdit", "add_string_delimiter", 3146098955L)
    Ptrcall.callVoid3(gdext.classes.CodeEdit.mb_add_string_delimiter, livePtr, startKey, endKey, lineOnly)
  }

  /** CodeEdit.remove_string_delimiter */
  final def removeStringDelimiter(startKey: String): Unit = {
    if (gdext.classes.CodeEdit.mb_remove_string_delimiter == null) gdext.classes.CodeEdit.mb_remove_string_delimiter = MethodBind.get("CodeEdit", "remove_string_delimiter", 83702148L)
    Ptrcall.callVoid1(gdext.classes.CodeEdit.mb_remove_string_delimiter, livePtr, startKey)
  }

  /** CodeEdit.has_string_delimiter */
  final def hasStringDelimiter(startKey: String): Boolean = {
    if (gdext.classes.CodeEdit.mb_has_string_delimiter == null) gdext.classes.CodeEdit.mb_has_string_delimiter = MethodBind.get("CodeEdit", "has_string_delimiter", 3927539163L)
    Ptrcall.call1[String, Boolean](gdext.classes.CodeEdit.mb_has_string_delimiter, livePtr, startKey)
  }

  /** CodeEdit.clear_string_delimiters */
  final def clearStringDelimiters(): Unit = {
    if (gdext.classes.CodeEdit.mb_clear_string_delimiters == null) gdext.classes.CodeEdit.mb_clear_string_delimiters = MethodBind.get("CodeEdit", "clear_string_delimiters", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.CodeEdit.mb_clear_string_delimiters, livePtr)
  }

  /** CodeEdit.is_in_string */
  final def isInString(line: Long, column: Long = -1L): Long = {
    if (gdext.classes.CodeEdit.mb_is_in_string == null) gdext.classes.CodeEdit.mb_is_in_string = MethodBind.get("CodeEdit", "is_in_string", 688195400L)
    Ptrcall.call2[Long, Long, Long](gdext.classes.CodeEdit.mb_is_in_string, livePtr, line, column)
  }

  /** CodeEdit.add_comment_delimiter */
  final def addCommentDelimiter(startKey: String, endKey: String, lineOnly: Boolean = false): Unit = {
    if (gdext.classes.CodeEdit.mb_add_comment_delimiter == null) gdext.classes.CodeEdit.mb_add_comment_delimiter = MethodBind.get("CodeEdit", "add_comment_delimiter", 3146098955L)
    Ptrcall.callVoid3(gdext.classes.CodeEdit.mb_add_comment_delimiter, livePtr, startKey, endKey, lineOnly)
  }

  /** CodeEdit.remove_comment_delimiter */
  final def removeCommentDelimiter(startKey: String): Unit = {
    if (gdext.classes.CodeEdit.mb_remove_comment_delimiter == null) gdext.classes.CodeEdit.mb_remove_comment_delimiter = MethodBind.get("CodeEdit", "remove_comment_delimiter", 83702148L)
    Ptrcall.callVoid1(gdext.classes.CodeEdit.mb_remove_comment_delimiter, livePtr, startKey)
  }

  /** CodeEdit.has_comment_delimiter */
  final def hasCommentDelimiter(startKey: String): Boolean = {
    if (gdext.classes.CodeEdit.mb_has_comment_delimiter == null) gdext.classes.CodeEdit.mb_has_comment_delimiter = MethodBind.get("CodeEdit", "has_comment_delimiter", 3927539163L)
    Ptrcall.call1[String, Boolean](gdext.classes.CodeEdit.mb_has_comment_delimiter, livePtr, startKey)
  }

  /** CodeEdit.clear_comment_delimiters */
  final def clearCommentDelimiters(): Unit = {
    if (gdext.classes.CodeEdit.mb_clear_comment_delimiters == null) gdext.classes.CodeEdit.mb_clear_comment_delimiters = MethodBind.get("CodeEdit", "clear_comment_delimiters", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.CodeEdit.mb_clear_comment_delimiters, livePtr)
  }

  /** CodeEdit.is_in_comment */
  final def isInComment(line: Long, column: Long = -1L): Long = {
    if (gdext.classes.CodeEdit.mb_is_in_comment == null) gdext.classes.CodeEdit.mb_is_in_comment = MethodBind.get("CodeEdit", "is_in_comment", 688195400L)
    Ptrcall.call2[Long, Long, Long](gdext.classes.CodeEdit.mb_is_in_comment, livePtr, line, column)
  }

  /** CodeEdit.get_delimiter_start_key */
  final def getDelimiterStartKey(delimiterIndex: Long): String = {
    if (gdext.classes.CodeEdit.mb_get_delimiter_start_key == null) gdext.classes.CodeEdit.mb_get_delimiter_start_key = MethodBind.get("CodeEdit", "get_delimiter_start_key", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.CodeEdit.mb_get_delimiter_start_key, livePtr, delimiterIndex)
  }

  /** CodeEdit.get_delimiter_end_key */
  final def getDelimiterEndKey(delimiterIndex: Long): String = {
    if (gdext.classes.CodeEdit.mb_get_delimiter_end_key == null) gdext.classes.CodeEdit.mb_get_delimiter_end_key = MethodBind.get("CodeEdit", "get_delimiter_end_key", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.CodeEdit.mb_get_delimiter_end_key, livePtr, delimiterIndex)
  }

  /** CodeEdit.get_delimiter_start_position */
  final def getDelimiterStartPosition(line: Long, column: Long): gdext.builtin.Vector2 = {
    if (gdext.classes.CodeEdit.mb_get_delimiter_start_position == null) gdext.classes.CodeEdit.mb_get_delimiter_start_position = MethodBind.get("CodeEdit", "get_delimiter_start_position", 3016396712L)
    Ptrcall.call2[Long, Long, gdext.builtin.Vector2](gdext.classes.CodeEdit.mb_get_delimiter_start_position, livePtr, line, column)
  }

  /** CodeEdit.get_delimiter_end_position */
  final def getDelimiterEndPosition(line: Long, column: Long): gdext.builtin.Vector2 = {
    if (gdext.classes.CodeEdit.mb_get_delimiter_end_position == null) gdext.classes.CodeEdit.mb_get_delimiter_end_position = MethodBind.get("CodeEdit", "get_delimiter_end_position", 3016396712L)
    Ptrcall.call2[Long, Long, gdext.builtin.Vector2](gdext.classes.CodeEdit.mb_get_delimiter_end_position, livePtr, line, column)
  }

  /** CodeEdit.set_code_hint */
  final def setCodeHint(codeHint: String): Unit = {
    if (gdext.classes.CodeEdit.mb_set_code_hint == null) gdext.classes.CodeEdit.mb_set_code_hint = MethodBind.get("CodeEdit", "set_code_hint", 83702148L)
    Ptrcall.callVoid1(gdext.classes.CodeEdit.mb_set_code_hint, livePtr, codeHint)
  }

  /** CodeEdit.set_code_hint_draw_below */
  final def setCodeHintDrawBelow(drawBelow: Boolean): Unit = {
    if (gdext.classes.CodeEdit.mb_set_code_hint_draw_below == null) gdext.classes.CodeEdit.mb_set_code_hint_draw_below = MethodBind.get("CodeEdit", "set_code_hint_draw_below", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CodeEdit.mb_set_code_hint_draw_below, livePtr, drawBelow)
  }

  /** CodeEdit.get_text_for_code_completion */
  final def getTextForCodeCompletion(): String = {
    if (gdext.classes.CodeEdit.mb_get_text_for_code_completion == null) gdext.classes.CodeEdit.mb_get_text_for_code_completion = MethodBind.get("CodeEdit", "get_text_for_code_completion", 201670096L)
    Ptrcall.call0[String](gdext.classes.CodeEdit.mb_get_text_for_code_completion, livePtr)
  }

  /** CodeEdit.request_code_completion */
  final def requestCodeCompletion(force: Boolean = false): Unit = {
    if (gdext.classes.CodeEdit.mb_request_code_completion == null) gdext.classes.CodeEdit.mb_request_code_completion = MethodBind.get("CodeEdit", "request_code_completion", 107499316L)
    Ptrcall.callVoid1(gdext.classes.CodeEdit.mb_request_code_completion, livePtr, force)
  }

  /** CodeEdit.update_code_completion_options */
  final def updateCodeCompletionOptions(force: Boolean): Unit = {
    if (gdext.classes.CodeEdit.mb_update_code_completion_options == null) gdext.classes.CodeEdit.mb_update_code_completion_options = MethodBind.get("CodeEdit", "update_code_completion_options", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CodeEdit.mb_update_code_completion_options, livePtr, force)
  }

  /** CodeEdit.get_code_completion_selected_index */
  final def getCodeCompletionSelectedIndex(): Long = {
    if (gdext.classes.CodeEdit.mb_get_code_completion_selected_index == null) gdext.classes.CodeEdit.mb_get_code_completion_selected_index = MethodBind.get("CodeEdit", "get_code_completion_selected_index", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.CodeEdit.mb_get_code_completion_selected_index, livePtr)
  }

  /** CodeEdit.set_code_completion_selected_index */
  final def setCodeCompletionSelectedIndex(index: Long): Unit = {
    if (gdext.classes.CodeEdit.mb_set_code_completion_selected_index == null) gdext.classes.CodeEdit.mb_set_code_completion_selected_index = MethodBind.get("CodeEdit", "set_code_completion_selected_index", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.CodeEdit.mb_set_code_completion_selected_index, livePtr, index)
  }

  /** CodeEdit.confirm_code_completion */
  final def confirmCodeCompletion(replace: Boolean = false): Unit = {
    if (gdext.classes.CodeEdit.mb_confirm_code_completion == null) gdext.classes.CodeEdit.mb_confirm_code_completion = MethodBind.get("CodeEdit", "confirm_code_completion", 107499316L)
    Ptrcall.callVoid1(gdext.classes.CodeEdit.mb_confirm_code_completion, livePtr, replace)
  }

  /** CodeEdit.cancel_code_completion */
  final def cancelCodeCompletion(): Unit = {
    if (gdext.classes.CodeEdit.mb_cancel_code_completion == null) gdext.classes.CodeEdit.mb_cancel_code_completion = MethodBind.get("CodeEdit", "cancel_code_completion", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.CodeEdit.mb_cancel_code_completion, livePtr)
  }

  /** CodeEdit.set_code_completion_enabled */
  final def setCodeCompletionEnabled(enable: Boolean): Unit = {
    if (gdext.classes.CodeEdit.mb_set_code_completion_enabled == null) gdext.classes.CodeEdit.mb_set_code_completion_enabled = MethodBind.get("CodeEdit", "set_code_completion_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CodeEdit.mb_set_code_completion_enabled, livePtr, enable)
  }

  /** CodeEdit.is_code_completion_enabled */
  final def isCodeCompletionEnabled(): Boolean = {
    if (gdext.classes.CodeEdit.mb_is_code_completion_enabled == null) gdext.classes.CodeEdit.mb_is_code_completion_enabled = MethodBind.get("CodeEdit", "is_code_completion_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CodeEdit.mb_is_code_completion_enabled, livePtr)
  }

  /** CodeEdit.set_symbol_lookup_on_click_enabled */
  final def setSymbolLookupOnClickEnabled(enable: Boolean): Unit = {
    if (gdext.classes.CodeEdit.mb_set_symbol_lookup_on_click_enabled == null) gdext.classes.CodeEdit.mb_set_symbol_lookup_on_click_enabled = MethodBind.get("CodeEdit", "set_symbol_lookup_on_click_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CodeEdit.mb_set_symbol_lookup_on_click_enabled, livePtr, enable)
  }

  /** CodeEdit.is_symbol_lookup_on_click_enabled */
  final def isSymbolLookupOnClickEnabled(): Boolean = {
    if (gdext.classes.CodeEdit.mb_is_symbol_lookup_on_click_enabled == null) gdext.classes.CodeEdit.mb_is_symbol_lookup_on_click_enabled = MethodBind.get("CodeEdit", "is_symbol_lookup_on_click_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CodeEdit.mb_is_symbol_lookup_on_click_enabled, livePtr)
  }

  /** CodeEdit.get_text_for_symbol_lookup */
  final def getTextForSymbolLookup(): String = {
    if (gdext.classes.CodeEdit.mb_get_text_for_symbol_lookup == null) gdext.classes.CodeEdit.mb_get_text_for_symbol_lookup = MethodBind.get("CodeEdit", "get_text_for_symbol_lookup", 201670096L)
    Ptrcall.call0[String](gdext.classes.CodeEdit.mb_get_text_for_symbol_lookup, livePtr)
  }

  /** CodeEdit.get_text_with_cursor_char */
  final def getTextWithCursorChar(line: Long, column: Long): String = {
    if (gdext.classes.CodeEdit.mb_get_text_with_cursor_char == null) gdext.classes.CodeEdit.mb_get_text_with_cursor_char = MethodBind.get("CodeEdit", "get_text_with_cursor_char", 1391810591L)
    Ptrcall.call2[Long, Long, String](gdext.classes.CodeEdit.mb_get_text_with_cursor_char, livePtr, line, column)
  }

  /** CodeEdit.set_symbol_lookup_word_as_valid */
  final def setSymbolLookupWordAsValid(valid: Boolean): Unit = {
    if (gdext.classes.CodeEdit.mb_set_symbol_lookup_word_as_valid == null) gdext.classes.CodeEdit.mb_set_symbol_lookup_word_as_valid = MethodBind.get("CodeEdit", "set_symbol_lookup_word_as_valid", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CodeEdit.mb_set_symbol_lookup_word_as_valid, livePtr, valid)
  }

  /** CodeEdit.set_symbol_tooltip_on_hover_enabled */
  final def setSymbolTooltipOnHoverEnabled(enable: Boolean): Unit = {
    if (gdext.classes.CodeEdit.mb_set_symbol_tooltip_on_hover_enabled == null) gdext.classes.CodeEdit.mb_set_symbol_tooltip_on_hover_enabled = MethodBind.get("CodeEdit", "set_symbol_tooltip_on_hover_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CodeEdit.mb_set_symbol_tooltip_on_hover_enabled, livePtr, enable)
  }

  /** CodeEdit.is_symbol_tooltip_on_hover_enabled */
  final def isSymbolTooltipOnHoverEnabled(): Boolean = {
    if (gdext.classes.CodeEdit.mb_is_symbol_tooltip_on_hover_enabled == null) gdext.classes.CodeEdit.mb_is_symbol_tooltip_on_hover_enabled = MethodBind.get("CodeEdit", "is_symbol_tooltip_on_hover_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CodeEdit.mb_is_symbol_tooltip_on_hover_enabled, livePtr)
  }

  /** CodeEdit.move_lines_up */
  final def moveLinesUp(): Unit = {
    if (gdext.classes.CodeEdit.mb_move_lines_up == null) gdext.classes.CodeEdit.mb_move_lines_up = MethodBind.get("CodeEdit", "move_lines_up", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.CodeEdit.mb_move_lines_up, livePtr)
  }

  /** CodeEdit.move_lines_down */
  final def moveLinesDown(): Unit = {
    if (gdext.classes.CodeEdit.mb_move_lines_down == null) gdext.classes.CodeEdit.mb_move_lines_down = MethodBind.get("CodeEdit", "move_lines_down", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.CodeEdit.mb_move_lines_down, livePtr)
  }

  /** CodeEdit.delete_lines */
  final def deleteLines(): Unit = {
    if (gdext.classes.CodeEdit.mb_delete_lines == null) gdext.classes.CodeEdit.mb_delete_lines = MethodBind.get("CodeEdit", "delete_lines", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.CodeEdit.mb_delete_lines, livePtr)
  }

  /** CodeEdit.duplicate_selection */
  final def duplicateSelection(): Unit = {
    if (gdext.classes.CodeEdit.mb_duplicate_selection == null) gdext.classes.CodeEdit.mb_duplicate_selection = MethodBind.get("CodeEdit", "duplicate_selection", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.CodeEdit.mb_duplicate_selection, livePtr)
  }

  /** CodeEdit.duplicate_lines */
  final def duplicateLines(): Unit = {
    if (gdext.classes.CodeEdit.mb_duplicate_lines == null) gdext.classes.CodeEdit.mb_duplicate_lines = MethodBind.get("CodeEdit", "duplicate_lines", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.CodeEdit.mb_duplicate_lines, livePtr)
  }

}

object CodeEdit {
  private[classes] var mb_set_indent_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_indent_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_indent_using_spaces: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_indent_using_spaces: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_auto_indent_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_auto_indent_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_do_indent: GDExtensionMethodBindPtr = null
  private[classes] var mb_indent_lines: GDExtensionMethodBindPtr = null
  private[classes] var mb_unindent_lines: GDExtensionMethodBindPtr = null
  private[classes] var mb_convert_indent: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_auto_brace_completion_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_auto_brace_completion_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_highlight_matching_braces_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_highlight_matching_braces_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_auto_brace_completion_pair: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_auto_brace_completion_open_key: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_auto_brace_completion_close_key: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_auto_brace_completion_close_key: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_draw_breakpoints_gutter: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_drawing_breakpoints_gutter: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_draw_bookmarks_gutter: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_drawing_bookmarks_gutter: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_draw_executing_lines_gutter: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_drawing_executing_lines_gutter: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_line_as_breakpoint: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_line_breakpointed: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_breakpointed_lines: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_line_as_bookmarked: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_line_bookmarked: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_bookmarked_lines: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_line_as_executing: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_line_executing: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_executing_lines: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_draw_line_numbers: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_draw_line_numbers_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_line_numbers_zero_padded: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_line_numbers_zero_padded: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_line_numbers_min_digits: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_line_numbers_min_digits: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_draw_fold_gutter: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_drawing_fold_gutter: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_line_folding_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_line_folding_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_can_fold_line: GDExtensionMethodBindPtr = null
  private[classes] var mb_fold_line: GDExtensionMethodBindPtr = null
  private[classes] var mb_unfold_line: GDExtensionMethodBindPtr = null
  private[classes] var mb_fold_all_lines: GDExtensionMethodBindPtr = null
  private[classes] var mb_unfold_all_lines: GDExtensionMethodBindPtr = null
  private[classes] var mb_toggle_foldable_line: GDExtensionMethodBindPtr = null
  private[classes] var mb_toggle_foldable_lines_at_carets: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_line_folded: GDExtensionMethodBindPtr = null
  private[classes] var mb_create_code_region: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_code_region_start_tag: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_code_region_end_tag: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_code_region_tags: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_line_code_region_start: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_line_code_region_end: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_string_delimiter: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_string_delimiter: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_string_delimiter: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_string_delimiters: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_in_string: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_comment_delimiter: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_comment_delimiter: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_comment_delimiter: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_comment_delimiters: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_in_comment: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_delimiter_start_key: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_delimiter_end_key: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_delimiter_start_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_delimiter_end_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_code_hint: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_code_hint_draw_below: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_text_for_code_completion: GDExtensionMethodBindPtr = null
  private[classes] var mb_request_code_completion: GDExtensionMethodBindPtr = null
  private[classes] var mb_update_code_completion_options: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_code_completion_selected_index: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_code_completion_selected_index: GDExtensionMethodBindPtr = null
  private[classes] var mb_confirm_code_completion: GDExtensionMethodBindPtr = null
  private[classes] var mb_cancel_code_completion: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_code_completion_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_code_completion_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_symbol_lookup_on_click_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_symbol_lookup_on_click_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_text_for_symbol_lookup: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_text_with_cursor_char: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_symbol_lookup_word_as_valid: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_symbol_tooltip_on_hover_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_symbol_tooltip_on_hover_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_move_lines_up: GDExtensionMethodBindPtr = null
  private[classes] var mb_move_lines_down: GDExtensionMethodBindPtr = null
  private[classes] var mb_delete_lines: GDExtensionMethodBindPtr = null
  private[classes] var mb_duplicate_selection: GDExtensionMethodBindPtr = null
  private[classes] var mb_duplicate_lines: GDExtensionMethodBindPtr = null

  /** Godot enum `CodeEdit.CodeCompletionKind`. */
  opaque type CodeCompletionKind <: Long = Long

  object CodeCompletionKind {
    final val Class: CodeCompletionKind = 0L.asInstanceOf[CodeCompletionKind]
    final val Function: CodeCompletionKind = 1L.asInstanceOf[CodeCompletionKind]
    final val Signal: CodeCompletionKind = 2L.asInstanceOf[CodeCompletionKind]
    final val Variable: CodeCompletionKind = 3L.asInstanceOf[CodeCompletionKind]
    final val Member: CodeCompletionKind = 4L.asInstanceOf[CodeCompletionKind]
    final val Enum: CodeCompletionKind = 5L.asInstanceOf[CodeCompletionKind]
    final val Constant: CodeCompletionKind = 6L.asInstanceOf[CodeCompletionKind]
    final val NodePath: CodeCompletionKind = 7L.asInstanceOf[CodeCompletionKind]
    final val FilePath: CodeCompletionKind = 8L.asInstanceOf[CodeCompletionKind]
    final val PlainText: CodeCompletionKind = 9L.asInstanceOf[CodeCompletionKind]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): CodeCompletionKind = value.asInstanceOf[CodeCompletionKind]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[CodeCompletionKind] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L).asInstanceOf[scala.IArray[CodeCompletionKind]]

    extension (self: CodeCompletionKind)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Class"
        case 1L => "Function"
        case 2L => "Signal"
        case 3L => "Variable"
        case 4L => "Member"
        case 5L => "Enum"
        case 6L => "Constant"
        case 7L => "NodePath"
        case 8L => "FilePath"
        case 9L => "PlainText"
        case other => other.toString
      }
  }

  /** Godot enum `CodeEdit.CodeCompletionLocation`. */
  opaque type CodeCompletionLocation <: Long = Long

  object CodeCompletionLocation {
    final val Local: CodeCompletionLocation = 0L.asInstanceOf[CodeCompletionLocation]
    final val ParentMask: CodeCompletionLocation = 256L.asInstanceOf[CodeCompletionLocation]
    final val OtherUserCode: CodeCompletionLocation = 512L.asInstanceOf[CodeCompletionLocation]
    final val Other: CodeCompletionLocation = 1024L.asInstanceOf[CodeCompletionLocation]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): CodeCompletionLocation = value.asInstanceOf[CodeCompletionLocation]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[CodeCompletionLocation] = scala.IArray[Long](0L, 256L, 512L, 1024L).asInstanceOf[scala.IArray[CodeCompletionLocation]]

    extension (self: CodeCompletionLocation)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Local"
        case 256L => "ParentMask"
        case 512L => "OtherUserCode"
        case 1024L => "Other"
        case other => other.toString
      }
  }
}
