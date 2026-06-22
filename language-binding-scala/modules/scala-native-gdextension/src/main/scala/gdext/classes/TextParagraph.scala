package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `TextParagraph`, extends `RefCounted`. */
abstract class TextParagraph extends RefCounted {

  /** TextParagraph.clear */
  final def clear(): Unit =
    Ptrcall.callVoid0(MethodBind.get("TextParagraph", "clear", 3218959716L), hostObject.objectPtr)

  /** TextParagraph.duplicate */
  final def duplicate(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("TextParagraph", "duplicate", 3607706709L), hostObject.objectPtr)

  /** TextParagraph.set_direction */
  final def setDirection(direction: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextParagraph", "set_direction", 1418190634L), hostObject.objectPtr, direction)

  /** TextParagraph.get_direction */
  final def getDirection(): Long =
    Ptrcall.call0[Long](MethodBind.get("TextParagraph", "get_direction", 2516697328L), hostObject.objectPtr)

  /** TextParagraph.get_inferred_direction */
  final def getInferredDirection(): Long =
    Ptrcall.call0[Long](MethodBind.get("TextParagraph", "get_inferred_direction", 2516697328L), hostObject.objectPtr)

  /** TextParagraph.set_custom_punctuation */
  final def setCustomPunctuation(custom_punctuation: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextParagraph", "set_custom_punctuation", 83702148L), hostObject.objectPtr, custom_punctuation)

  /** TextParagraph.get_custom_punctuation */
  final def getCustomPunctuation(): String =
    Ptrcall.call0[String](MethodBind.get("TextParagraph", "get_custom_punctuation", 201670096L), hostObject.objectPtr)

  /** TextParagraph.set_orientation */
  final def setOrientation(orientation: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextParagraph", "set_orientation", 42823726L), hostObject.objectPtr, orientation)

  /** TextParagraph.get_orientation */
  final def getOrientation(): Long =
    Ptrcall.call0[Long](MethodBind.get("TextParagraph", "get_orientation", 175768116L), hostObject.objectPtr)

  /** TextParagraph.set_preserve_invalid */
  final def setPreserveInvalid(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextParagraph", "set_preserve_invalid", 2586408642L), hostObject.objectPtr, enabled)

  /** TextParagraph.get_preserve_invalid */
  final def getPreserveInvalid(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TextParagraph", "get_preserve_invalid", 36873697L), hostObject.objectPtr)

  /** TextParagraph.set_preserve_control */
  final def setPreserveControl(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextParagraph", "set_preserve_control", 2586408642L), hostObject.objectPtr, enabled)

  /** TextParagraph.get_preserve_control */
  final def getPreserveControl(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TextParagraph", "get_preserve_control", 36873697L), hostObject.objectPtr)

  /** TextParagraph.set_dropcap */
  final def setDropcap(text: String, font: Font, font_size: Long, dropcap_margins: gdext.builtin.Rect2, language: String): Boolean =
    Ptrcall.call5[String, GodotObject, Long, gdext.builtin.Rect2, String, Boolean](MethodBind.get("TextParagraph", "set_dropcap", 2498990330L), hostObject.objectPtr, text, font.hostObject, font_size, dropcap_margins, language)

  /** TextParagraph.clear_dropcap */
  final def clearDropcap(): Unit =
    Ptrcall.callVoid0(MethodBind.get("TextParagraph", "clear_dropcap", 3218959716L), hostObject.objectPtr)

  /** TextParagraph.set_alignment */
  final def setAlignment(alignment: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextParagraph", "set_alignment", 2312603777L), hostObject.objectPtr, alignment)

  /** TextParagraph.get_alignment */
  final def getAlignment(): Long =
    Ptrcall.call0[Long](MethodBind.get("TextParagraph", "get_alignment", 341400642L), hostObject.objectPtr)

  /** TextParagraph.set_break_flags */
  final def setBreakFlags(flags: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextParagraph", "set_break_flags", 2809697122L), hostObject.objectPtr, flags)

  /** TextParagraph.get_break_flags */
  final def getBreakFlags(): Long =
    Ptrcall.call0[Long](MethodBind.get("TextParagraph", "get_break_flags", 2340632602L), hostObject.objectPtr)

  /** TextParagraph.set_justification_flags */
  final def setJustificationFlags(flags: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextParagraph", "set_justification_flags", 2877345813L), hostObject.objectPtr, flags)

  /** TextParagraph.get_justification_flags */
  final def getJustificationFlags(): Long =
    Ptrcall.call0[Long](MethodBind.get("TextParagraph", "get_justification_flags", 1583363614L), hostObject.objectPtr)

  /** TextParagraph.set_text_overrun_behavior */
  final def setTextOverrunBehavior(overrun_behavior: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextParagraph", "set_text_overrun_behavior", 1008890932L), hostObject.objectPtr, overrun_behavior)

  /** TextParagraph.get_text_overrun_behavior */
  final def getTextOverrunBehavior(): Long =
    Ptrcall.call0[Long](MethodBind.get("TextParagraph", "get_text_overrun_behavior", 3779142101L), hostObject.objectPtr)

  /** TextParagraph.set_ellipsis_char */
  final def setEllipsisChar(char: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextParagraph", "set_ellipsis_char", 83702148L), hostObject.objectPtr, char)

  /** TextParagraph.get_ellipsis_char */
  final def getEllipsisChar(): String =
    Ptrcall.call0[String](MethodBind.get("TextParagraph", "get_ellipsis_char", 201670096L), hostObject.objectPtr)

  /** TextParagraph.set_width */
  final def setWidth(width: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextParagraph", "set_width", 373806689L), hostObject.objectPtr, width)

  /** TextParagraph.get_width */
  final def getWidth(): Double =
    Ptrcall.call0[Double](MethodBind.get("TextParagraph", "get_width", 1740695150L), hostObject.objectPtr)

  /** TextParagraph.get_non_wrapped_size */
  final def getNonWrappedSize(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("TextParagraph", "get_non_wrapped_size", 3341600327L), hostObject.objectPtr)

  /** TextParagraph.get_size */
  final def getSize(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("TextParagraph", "get_size", 3341600327L), hostObject.objectPtr)

  /** TextParagraph.get_range */
  final def getRange(): gdext.builtin.Vector2i =
    Ptrcall.call0[gdext.builtin.Vector2i](MethodBind.get("TextParagraph", "get_range", 3690982128L), hostObject.objectPtr)

  /** TextParagraph.get_line_count */
  final def getLineCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("TextParagraph", "get_line_count", 3905245786L), hostObject.objectPtr)

  /** TextParagraph.set_max_lines_visible */
  final def setMaxLinesVisible(max_lines_visible: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextParagraph", "set_max_lines_visible", 1286410249L), hostObject.objectPtr, max_lines_visible)

  /** TextParagraph.get_max_lines_visible */
  final def getMaxLinesVisible(): Long =
    Ptrcall.call0[Long](MethodBind.get("TextParagraph", "get_max_lines_visible", 3905245786L), hostObject.objectPtr)

  /** TextParagraph.set_line_spacing */
  final def setLineSpacing(line_spacing: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextParagraph", "set_line_spacing", 373806689L), hostObject.objectPtr, line_spacing)

  /** TextParagraph.get_line_spacing */
  final def getLineSpacing(): Double =
    Ptrcall.call0[Double](MethodBind.get("TextParagraph", "get_line_spacing", 1740695150L), hostObject.objectPtr)

  /** TextParagraph.get_line_size */
  final def getLineSize(line: Long): gdext.builtin.Vector2 =
    Ptrcall.call1[Long, gdext.builtin.Vector2](MethodBind.get("TextParagraph", "get_line_size", 2299179447L), hostObject.objectPtr, line)

  /** TextParagraph.get_line_range */
  final def getLineRange(line: Long): gdext.builtin.Vector2i =
    Ptrcall.call1[Long, gdext.builtin.Vector2i](MethodBind.get("TextParagraph", "get_line_range", 880721226L), hostObject.objectPtr, line)

  /** TextParagraph.get_line_ascent */
  final def getLineAscent(line: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("TextParagraph", "get_line_ascent", 2339986948L), hostObject.objectPtr, line)

  /** TextParagraph.get_line_descent */
  final def getLineDescent(line: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("TextParagraph", "get_line_descent", 2339986948L), hostObject.objectPtr, line)

  /** TextParagraph.get_line_width */
  final def getLineWidth(line: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("TextParagraph", "get_line_width", 2339986948L), hostObject.objectPtr, line)

  /** TextParagraph.get_line_underline_position */
  final def getLineUnderlinePosition(line: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("TextParagraph", "get_line_underline_position", 2339986948L), hostObject.objectPtr, line)

  /** TextParagraph.get_line_underline_thickness */
  final def getLineUnderlineThickness(line: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("TextParagraph", "get_line_underline_thickness", 2339986948L), hostObject.objectPtr, line)

  /** TextParagraph.get_dropcap_size */
  final def getDropcapSize(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("TextParagraph", "get_dropcap_size", 3341600327L), hostObject.objectPtr)

  /** TextParagraph.get_dropcap_lines */
  final def getDropcapLines(): Long =
    Ptrcall.call0[Long](MethodBind.get("TextParagraph", "get_dropcap_lines", 3905245786L), hostObject.objectPtr)

  /** TextParagraph.hit_test */
  final def hitTest(coords: gdext.builtin.Vector2): Long =
    Ptrcall.call1[gdext.builtin.Vector2, Long](MethodBind.get("TextParagraph", "hit_test", 3820158470L), hostObject.objectPtr, coords)

}

object TextParagraph {
  /** Class metadata for Gd[TextParagraph] lifetime management and casting. */
  given GodotClass[TextParagraph] with {
    def className = "TextParagraph"
    def isRefCounted = true
    def wrap(o: GodotObject): TextParagraph = new TextParagraph {}.withHost(o.objectPtr)
    def unwrap(t: TextParagraph): GodotObject = t.hostObject
  }
}
