package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `TextParagraph`, extends `RefCounted`. */
abstract class TextParagraph extends RefCounted {
  override def godotClassName: String = "TextParagraph"

  /** TextParagraph.clear */
  final def clear(): Unit = {
    if (gdext.classes.TextParagraph.mb_clear == null) gdext.classes.TextParagraph.mb_clear = MethodBind.get("TextParagraph", "clear", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.TextParagraph.mb_clear, livePtr)
  }

  /** TextParagraph.duplicate. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def duplicate(): TextParagraph = {
    if (gdext.classes.TextParagraph.mb_duplicate == null) gdext.classes.TextParagraph.mb_duplicate = MethodBind.get("TextParagraph", "duplicate", 3607706709L)
    Wrappers.owned[TextParagraph](Ptrcall.call0[Long](gdext.classes.TextParagraph.mb_duplicate, livePtr))
  }

  /** TextParagraph.set_direction */
  final def setDirection(direction: Long): Unit = {
    if (gdext.classes.TextParagraph.mb_set_direction == null) gdext.classes.TextParagraph.mb_set_direction = MethodBind.get("TextParagraph", "set_direction", 1418190634L)
    Ptrcall.callVoid1(gdext.classes.TextParagraph.mb_set_direction, livePtr, direction)
  }

  /** TextParagraph.get_direction */
  final def getDirection(): Long = {
    if (gdext.classes.TextParagraph.mb_get_direction == null) gdext.classes.TextParagraph.mb_get_direction = MethodBind.get("TextParagraph", "get_direction", 2516697328L)
    Ptrcall.call0[Long](gdext.classes.TextParagraph.mb_get_direction, livePtr)
  }

  /** TextParagraph.get_inferred_direction */
  final def getInferredDirection(): Long = {
    if (gdext.classes.TextParagraph.mb_get_inferred_direction == null) gdext.classes.TextParagraph.mb_get_inferred_direction = MethodBind.get("TextParagraph", "get_inferred_direction", 2516697328L)
    Ptrcall.call0[Long](gdext.classes.TextParagraph.mb_get_inferred_direction, livePtr)
  }

  /** TextParagraph.set_custom_punctuation */
  final def setCustomPunctuation(custom_punctuation: String): Unit = {
    if (gdext.classes.TextParagraph.mb_set_custom_punctuation == null) gdext.classes.TextParagraph.mb_set_custom_punctuation = MethodBind.get("TextParagraph", "set_custom_punctuation", 83702148L)
    Ptrcall.callVoid1(gdext.classes.TextParagraph.mb_set_custom_punctuation, livePtr, custom_punctuation)
  }

  /** TextParagraph.get_custom_punctuation */
  final def getCustomPunctuation(): String = {
    if (gdext.classes.TextParagraph.mb_get_custom_punctuation == null) gdext.classes.TextParagraph.mb_get_custom_punctuation = MethodBind.get("TextParagraph", "get_custom_punctuation", 201670096L)
    Ptrcall.call0[String](gdext.classes.TextParagraph.mb_get_custom_punctuation, livePtr)
  }

  /** TextParagraph.set_orientation */
  final def setOrientation(orientation: Long): Unit = {
    if (gdext.classes.TextParagraph.mb_set_orientation == null) gdext.classes.TextParagraph.mb_set_orientation = MethodBind.get("TextParagraph", "set_orientation", 42823726L)
    Ptrcall.callVoid1(gdext.classes.TextParagraph.mb_set_orientation, livePtr, orientation)
  }

  /** TextParagraph.get_orientation */
  final def getOrientation(): Long = {
    if (gdext.classes.TextParagraph.mb_get_orientation == null) gdext.classes.TextParagraph.mb_get_orientation = MethodBind.get("TextParagraph", "get_orientation", 175768116L)
    Ptrcall.call0[Long](gdext.classes.TextParagraph.mb_get_orientation, livePtr)
  }

  /** TextParagraph.set_preserve_invalid */
  final def setPreserveInvalid(enabled: Boolean): Unit = {
    if (gdext.classes.TextParagraph.mb_set_preserve_invalid == null) gdext.classes.TextParagraph.mb_set_preserve_invalid = MethodBind.get("TextParagraph", "set_preserve_invalid", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TextParagraph.mb_set_preserve_invalid, livePtr, enabled)
  }

  /** TextParagraph.get_preserve_invalid */
  final def getPreserveInvalid(): Boolean = {
    if (gdext.classes.TextParagraph.mb_get_preserve_invalid == null) gdext.classes.TextParagraph.mb_get_preserve_invalid = MethodBind.get("TextParagraph", "get_preserve_invalid", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TextParagraph.mb_get_preserve_invalid, livePtr)
  }

  /** TextParagraph.set_preserve_control */
  final def setPreserveControl(enabled: Boolean): Unit = {
    if (gdext.classes.TextParagraph.mb_set_preserve_control == null) gdext.classes.TextParagraph.mb_set_preserve_control = MethodBind.get("TextParagraph", "set_preserve_control", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TextParagraph.mb_set_preserve_control, livePtr, enabled)
  }

  /** TextParagraph.get_preserve_control */
  final def getPreserveControl(): Boolean = {
    if (gdext.classes.TextParagraph.mb_get_preserve_control == null) gdext.classes.TextParagraph.mb_get_preserve_control = MethodBind.get("TextParagraph", "get_preserve_control", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TextParagraph.mb_get_preserve_control, livePtr)
  }

  /** TextParagraph.set_dropcap */
  final def setDropcap(text: String, font: Font, font_size: Long, dropcap_margins: gdext.builtin.Rect2, language: String): Boolean = {
    if (gdext.classes.TextParagraph.mb_set_dropcap == null) gdext.classes.TextParagraph.mb_set_dropcap = MethodBind.get("TextParagraph", "set_dropcap", 2498990330L)
    Ptrcall.call5[String, GodotObject, Long, gdext.builtin.Rect2, String, Boolean](gdext.classes.TextParagraph.mb_set_dropcap, livePtr, text, Wrappers.handle(font), font_size, dropcap_margins, language)
  }

  /** TextParagraph.clear_dropcap */
  final def clearDropcap(): Unit = {
    if (gdext.classes.TextParagraph.mb_clear_dropcap == null) gdext.classes.TextParagraph.mb_clear_dropcap = MethodBind.get("TextParagraph", "clear_dropcap", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.TextParagraph.mb_clear_dropcap, livePtr)
  }

  /** TextParagraph.set_alignment */
  final def setAlignment(alignment: Long): Unit = {
    if (gdext.classes.TextParagraph.mb_set_alignment == null) gdext.classes.TextParagraph.mb_set_alignment = MethodBind.get("TextParagraph", "set_alignment", 2312603777L)
    Ptrcall.callVoid1(gdext.classes.TextParagraph.mb_set_alignment, livePtr, alignment)
  }

  /** TextParagraph.get_alignment */
  final def getAlignment(): Long = {
    if (gdext.classes.TextParagraph.mb_get_alignment == null) gdext.classes.TextParagraph.mb_get_alignment = MethodBind.get("TextParagraph", "get_alignment", 341400642L)
    Ptrcall.call0[Long](gdext.classes.TextParagraph.mb_get_alignment, livePtr)
  }

  /** TextParagraph.set_break_flags */
  final def setBreakFlags(flags: Long): Unit = {
    if (gdext.classes.TextParagraph.mb_set_break_flags == null) gdext.classes.TextParagraph.mb_set_break_flags = MethodBind.get("TextParagraph", "set_break_flags", 2809697122L)
    Ptrcall.callVoid1(gdext.classes.TextParagraph.mb_set_break_flags, livePtr, flags)
  }

  /** TextParagraph.get_break_flags */
  final def getBreakFlags(): Long = {
    if (gdext.classes.TextParagraph.mb_get_break_flags == null) gdext.classes.TextParagraph.mb_get_break_flags = MethodBind.get("TextParagraph", "get_break_flags", 2340632602L)
    Ptrcall.call0[Long](gdext.classes.TextParagraph.mb_get_break_flags, livePtr)
  }

  /** TextParagraph.set_justification_flags */
  final def setJustificationFlags(flags: Long): Unit = {
    if (gdext.classes.TextParagraph.mb_set_justification_flags == null) gdext.classes.TextParagraph.mb_set_justification_flags = MethodBind.get("TextParagraph", "set_justification_flags", 2877345813L)
    Ptrcall.callVoid1(gdext.classes.TextParagraph.mb_set_justification_flags, livePtr, flags)
  }

  /** TextParagraph.get_justification_flags */
  final def getJustificationFlags(): Long = {
    if (gdext.classes.TextParagraph.mb_get_justification_flags == null) gdext.classes.TextParagraph.mb_get_justification_flags = MethodBind.get("TextParagraph", "get_justification_flags", 1583363614L)
    Ptrcall.call0[Long](gdext.classes.TextParagraph.mb_get_justification_flags, livePtr)
  }

  /** TextParagraph.set_text_overrun_behavior */
  final def setTextOverrunBehavior(overrun_behavior: Long): Unit = {
    if (gdext.classes.TextParagraph.mb_set_text_overrun_behavior == null) gdext.classes.TextParagraph.mb_set_text_overrun_behavior = MethodBind.get("TextParagraph", "set_text_overrun_behavior", 1008890932L)
    Ptrcall.callVoid1(gdext.classes.TextParagraph.mb_set_text_overrun_behavior, livePtr, overrun_behavior)
  }

  /** TextParagraph.get_text_overrun_behavior */
  final def getTextOverrunBehavior(): Long = {
    if (gdext.classes.TextParagraph.mb_get_text_overrun_behavior == null) gdext.classes.TextParagraph.mb_get_text_overrun_behavior = MethodBind.get("TextParagraph", "get_text_overrun_behavior", 3779142101L)
    Ptrcall.call0[Long](gdext.classes.TextParagraph.mb_get_text_overrun_behavior, livePtr)
  }

  /** TextParagraph.set_ellipsis_char */
  final def setEllipsisChar(char: String): Unit = {
    if (gdext.classes.TextParagraph.mb_set_ellipsis_char == null) gdext.classes.TextParagraph.mb_set_ellipsis_char = MethodBind.get("TextParagraph", "set_ellipsis_char", 83702148L)
    Ptrcall.callVoid1(gdext.classes.TextParagraph.mb_set_ellipsis_char, livePtr, char)
  }

  /** TextParagraph.get_ellipsis_char */
  final def getEllipsisChar(): String = {
    if (gdext.classes.TextParagraph.mb_get_ellipsis_char == null) gdext.classes.TextParagraph.mb_get_ellipsis_char = MethodBind.get("TextParagraph", "get_ellipsis_char", 201670096L)
    Ptrcall.call0[String](gdext.classes.TextParagraph.mb_get_ellipsis_char, livePtr)
  }

  /** TextParagraph.set_width */
  final def setWidth(width: Double): Unit = {
    if (gdext.classes.TextParagraph.mb_set_width == null) gdext.classes.TextParagraph.mb_set_width = MethodBind.get("TextParagraph", "set_width", 373806689L)
    Ptrcall.callVoid1(gdext.classes.TextParagraph.mb_set_width, livePtr, width)
  }

  /** TextParagraph.get_width */
  final def getWidth(): Double = {
    if (gdext.classes.TextParagraph.mb_get_width == null) gdext.classes.TextParagraph.mb_get_width = MethodBind.get("TextParagraph", "get_width", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.TextParagraph.mb_get_width, livePtr)
  }

  /** TextParagraph.get_non_wrapped_size */
  final def getNonWrappedSize(): gdext.builtin.Vector2 = {
    if (gdext.classes.TextParagraph.mb_get_non_wrapped_size == null) gdext.classes.TextParagraph.mb_get_non_wrapped_size = MethodBind.get("TextParagraph", "get_non_wrapped_size", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.TextParagraph.mb_get_non_wrapped_size, livePtr)
  }

  /** TextParagraph.get_size */
  final def getSize(): gdext.builtin.Vector2 = {
    if (gdext.classes.TextParagraph.mb_get_size == null) gdext.classes.TextParagraph.mb_get_size = MethodBind.get("TextParagraph", "get_size", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.TextParagraph.mb_get_size, livePtr)
  }

  /** TextParagraph.get_range */
  final def getRange(): gdext.builtin.Vector2i = {
    if (gdext.classes.TextParagraph.mb_get_range == null) gdext.classes.TextParagraph.mb_get_range = MethodBind.get("TextParagraph", "get_range", 3690982128L)
    Ptrcall.call0[gdext.builtin.Vector2i](gdext.classes.TextParagraph.mb_get_range, livePtr)
  }

  /** TextParagraph.get_line_count */
  final def getLineCount(): Long = {
    if (gdext.classes.TextParagraph.mb_get_line_count == null) gdext.classes.TextParagraph.mb_get_line_count = MethodBind.get("TextParagraph", "get_line_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.TextParagraph.mb_get_line_count, livePtr)
  }

  /** TextParagraph.set_max_lines_visible */
  final def setMaxLinesVisible(max_lines_visible: Long): Unit = {
    if (gdext.classes.TextParagraph.mb_set_max_lines_visible == null) gdext.classes.TextParagraph.mb_set_max_lines_visible = MethodBind.get("TextParagraph", "set_max_lines_visible", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.TextParagraph.mb_set_max_lines_visible, livePtr, max_lines_visible)
  }

  /** TextParagraph.get_max_lines_visible */
  final def getMaxLinesVisible(): Long = {
    if (gdext.classes.TextParagraph.mb_get_max_lines_visible == null) gdext.classes.TextParagraph.mb_get_max_lines_visible = MethodBind.get("TextParagraph", "get_max_lines_visible", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.TextParagraph.mb_get_max_lines_visible, livePtr)
  }

  /** TextParagraph.set_line_spacing */
  final def setLineSpacing(line_spacing: Double): Unit = {
    if (gdext.classes.TextParagraph.mb_set_line_spacing == null) gdext.classes.TextParagraph.mb_set_line_spacing = MethodBind.get("TextParagraph", "set_line_spacing", 373806689L)
    Ptrcall.callVoid1(gdext.classes.TextParagraph.mb_set_line_spacing, livePtr, line_spacing)
  }

  /** TextParagraph.get_line_spacing */
  final def getLineSpacing(): Double = {
    if (gdext.classes.TextParagraph.mb_get_line_spacing == null) gdext.classes.TextParagraph.mb_get_line_spacing = MethodBind.get("TextParagraph", "get_line_spacing", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.TextParagraph.mb_get_line_spacing, livePtr)
  }

  /** TextParagraph.get_line_size */
  final def getLineSize(line: Long): gdext.builtin.Vector2 = {
    if (gdext.classes.TextParagraph.mb_get_line_size == null) gdext.classes.TextParagraph.mb_get_line_size = MethodBind.get("TextParagraph", "get_line_size", 2299179447L)
    Ptrcall.call1[Long, gdext.builtin.Vector2](gdext.classes.TextParagraph.mb_get_line_size, livePtr, line)
  }

  /** TextParagraph.get_line_range */
  final def getLineRange(line: Long): gdext.builtin.Vector2i = {
    if (gdext.classes.TextParagraph.mb_get_line_range == null) gdext.classes.TextParagraph.mb_get_line_range = MethodBind.get("TextParagraph", "get_line_range", 880721226L)
    Ptrcall.call1[Long, gdext.builtin.Vector2i](gdext.classes.TextParagraph.mb_get_line_range, livePtr, line)
  }

  /** TextParagraph.get_line_ascent */
  final def getLineAscent(line: Long): Double = {
    if (gdext.classes.TextParagraph.mb_get_line_ascent == null) gdext.classes.TextParagraph.mb_get_line_ascent = MethodBind.get("TextParagraph", "get_line_ascent", 2339986948L)
    Ptrcall.call1[Long, Double](gdext.classes.TextParagraph.mb_get_line_ascent, livePtr, line)
  }

  /** TextParagraph.get_line_descent */
  final def getLineDescent(line: Long): Double = {
    if (gdext.classes.TextParagraph.mb_get_line_descent == null) gdext.classes.TextParagraph.mb_get_line_descent = MethodBind.get("TextParagraph", "get_line_descent", 2339986948L)
    Ptrcall.call1[Long, Double](gdext.classes.TextParagraph.mb_get_line_descent, livePtr, line)
  }

  /** TextParagraph.get_line_width */
  final def getLineWidth(line: Long): Double = {
    if (gdext.classes.TextParagraph.mb_get_line_width == null) gdext.classes.TextParagraph.mb_get_line_width = MethodBind.get("TextParagraph", "get_line_width", 2339986948L)
    Ptrcall.call1[Long, Double](gdext.classes.TextParagraph.mb_get_line_width, livePtr, line)
  }

  /** TextParagraph.get_line_underline_position */
  final def getLineUnderlinePosition(line: Long): Double = {
    if (gdext.classes.TextParagraph.mb_get_line_underline_position == null) gdext.classes.TextParagraph.mb_get_line_underline_position = MethodBind.get("TextParagraph", "get_line_underline_position", 2339986948L)
    Ptrcall.call1[Long, Double](gdext.classes.TextParagraph.mb_get_line_underline_position, livePtr, line)
  }

  /** TextParagraph.get_line_underline_thickness */
  final def getLineUnderlineThickness(line: Long): Double = {
    if (gdext.classes.TextParagraph.mb_get_line_underline_thickness == null) gdext.classes.TextParagraph.mb_get_line_underline_thickness = MethodBind.get("TextParagraph", "get_line_underline_thickness", 2339986948L)
    Ptrcall.call1[Long, Double](gdext.classes.TextParagraph.mb_get_line_underline_thickness, livePtr, line)
  }

  /** TextParagraph.get_dropcap_size */
  final def getDropcapSize(): gdext.builtin.Vector2 = {
    if (gdext.classes.TextParagraph.mb_get_dropcap_size == null) gdext.classes.TextParagraph.mb_get_dropcap_size = MethodBind.get("TextParagraph", "get_dropcap_size", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.TextParagraph.mb_get_dropcap_size, livePtr)
  }

  /** TextParagraph.get_dropcap_lines */
  final def getDropcapLines(): Long = {
    if (gdext.classes.TextParagraph.mb_get_dropcap_lines == null) gdext.classes.TextParagraph.mb_get_dropcap_lines = MethodBind.get("TextParagraph", "get_dropcap_lines", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.TextParagraph.mb_get_dropcap_lines, livePtr)
  }

  /** TextParagraph.hit_test */
  final def hitTest(coords: gdext.builtin.Vector2): Long = {
    if (gdext.classes.TextParagraph.mb_hit_test == null) gdext.classes.TextParagraph.mb_hit_test = MethodBind.get("TextParagraph", "hit_test", 3820158470L)
    Ptrcall.call1[gdext.builtin.Vector2, Long](gdext.classes.TextParagraph.mb_hit_test, livePtr, coords)
  }

}

object TextParagraph {
  private[classes] var mb_clear: GDExtensionMethodBindPtr = null
  private[classes] var mb_duplicate: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_inferred_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_custom_punctuation: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_custom_punctuation: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_orientation: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_orientation: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_preserve_invalid: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_preserve_invalid: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_preserve_control: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_preserve_control: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_dropcap: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_dropcap: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_alignment: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_alignment: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_break_flags: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_break_flags: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_justification_flags: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_justification_flags: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_text_overrun_behavior: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_text_overrun_behavior: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_ellipsis_char: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_ellipsis_char: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_non_wrapped_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_range: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_line_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_max_lines_visible: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_max_lines_visible: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_line_spacing: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_line_spacing: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_line_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_line_range: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_line_ascent: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_line_descent: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_line_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_line_underline_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_line_underline_thickness: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_dropcap_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_dropcap_lines: GDExtensionMethodBindPtr = null
  private[classes] var mb_hit_test: GDExtensionMethodBindPtr = null
}
