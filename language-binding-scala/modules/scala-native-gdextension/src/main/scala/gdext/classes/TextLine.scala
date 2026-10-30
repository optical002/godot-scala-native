package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `TextLine`, extends `RefCounted`. */
abstract class TextLine extends RefCounted {
  override def godotClassName: String = "TextLine"

  /** TextLine.clear */
  final def clear(): Unit = {
    if (gdext.classes.TextLine.mb_clear == null) gdext.classes.TextLine.mb_clear = MethodBind.get("TextLine", "clear", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.TextLine.mb_clear, livePtr)
  }

  /** TextLine.duplicate. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def duplicate(): TextLine = {
    if (gdext.classes.TextLine.mb_duplicate == null) gdext.classes.TextLine.mb_duplicate = MethodBind.get("TextLine", "duplicate", 1912703884L)
    Wrappers.owned[TextLine](Ptrcall.call0[Long](gdext.classes.TextLine.mb_duplicate, livePtr))
  }

  /** TextLine.set_direction */
  final def setDirection(direction: gdext.classes.TextServer.Direction): Unit = {
    if (gdext.classes.TextLine.mb_set_direction == null) gdext.classes.TextLine.mb_set_direction = MethodBind.get("TextLine", "set_direction", 1418190634L)
    Ptrcall.callVoid1(gdext.classes.TextLine.mb_set_direction, livePtr, direction)
  }

  /** TextLine.get_direction */
  final def getDirection(): gdext.classes.TextServer.Direction = {
    if (gdext.classes.TextLine.mb_get_direction == null) gdext.classes.TextLine.mb_get_direction = MethodBind.get("TextLine", "get_direction", 2516697328L)
    gdext.classes.TextServer.Direction(Ptrcall.call0[Long](gdext.classes.TextLine.mb_get_direction, livePtr))
  }

  /** TextLine.get_inferred_direction */
  final def getInferredDirection(): gdext.classes.TextServer.Direction = {
    if (gdext.classes.TextLine.mb_get_inferred_direction == null) gdext.classes.TextLine.mb_get_inferred_direction = MethodBind.get("TextLine", "get_inferred_direction", 2516697328L)
    gdext.classes.TextServer.Direction(Ptrcall.call0[Long](gdext.classes.TextLine.mb_get_inferred_direction, livePtr))
  }

  /** TextLine.set_orientation */
  final def setOrientation(orientation: gdext.classes.TextServer.Orientation): Unit = {
    if (gdext.classes.TextLine.mb_set_orientation == null) gdext.classes.TextLine.mb_set_orientation = MethodBind.get("TextLine", "set_orientation", 42823726L)
    Ptrcall.callVoid1(gdext.classes.TextLine.mb_set_orientation, livePtr, orientation)
  }

  /** TextLine.get_orientation */
  final def getOrientation(): gdext.classes.TextServer.Orientation = {
    if (gdext.classes.TextLine.mb_get_orientation == null) gdext.classes.TextLine.mb_get_orientation = MethodBind.get("TextLine", "get_orientation", 175768116L)
    gdext.classes.TextServer.Orientation(Ptrcall.call0[Long](gdext.classes.TextLine.mb_get_orientation, livePtr))
  }

  /** TextLine.set_preserve_invalid */
  final def setPreserveInvalid(enabled: Boolean): Unit = {
    if (gdext.classes.TextLine.mb_set_preserve_invalid == null) gdext.classes.TextLine.mb_set_preserve_invalid = MethodBind.get("TextLine", "set_preserve_invalid", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TextLine.mb_set_preserve_invalid, livePtr, enabled)
  }

  /** TextLine.get_preserve_invalid */
  final def getPreserveInvalid(): Boolean = {
    if (gdext.classes.TextLine.mb_get_preserve_invalid == null) gdext.classes.TextLine.mb_get_preserve_invalid = MethodBind.get("TextLine", "get_preserve_invalid", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TextLine.mb_get_preserve_invalid, livePtr)
  }

  /** TextLine.set_preserve_control */
  final def setPreserveControl(enabled: Boolean): Unit = {
    if (gdext.classes.TextLine.mb_set_preserve_control == null) gdext.classes.TextLine.mb_set_preserve_control = MethodBind.get("TextLine", "set_preserve_control", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TextLine.mb_set_preserve_control, livePtr, enabled)
  }

  /** TextLine.get_preserve_control */
  final def getPreserveControl(): Boolean = {
    if (gdext.classes.TextLine.mb_get_preserve_control == null) gdext.classes.TextLine.mb_get_preserve_control = MethodBind.get("TextLine", "get_preserve_control", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TextLine.mb_get_preserve_control, livePtr)
  }

  /** TextLine.set_width */
  final def setWidth(width: Double): Unit = {
    if (gdext.classes.TextLine.mb_set_width == null) gdext.classes.TextLine.mb_set_width = MethodBind.get("TextLine", "set_width", 373806689L)
    Ptrcall.callVoid1(gdext.classes.TextLine.mb_set_width, livePtr, width)
  }

  /** TextLine.get_width */
  final def getWidth(): Double = {
    if (gdext.classes.TextLine.mb_get_width == null) gdext.classes.TextLine.mb_get_width = MethodBind.get("TextLine", "get_width", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.TextLine.mb_get_width, livePtr)
  }

  /** TextLine.set_horizontal_alignment */
  final def setHorizontalAlignment(alignment: gdext.classes.HorizontalAlignment): Unit = {
    if (gdext.classes.TextLine.mb_set_horizontal_alignment == null) gdext.classes.TextLine.mb_set_horizontal_alignment = MethodBind.get("TextLine", "set_horizontal_alignment", 2312603777L)
    Ptrcall.callVoid1(gdext.classes.TextLine.mb_set_horizontal_alignment, livePtr, alignment)
  }

  /** TextLine.get_horizontal_alignment */
  final def getHorizontalAlignment(): gdext.classes.HorizontalAlignment = {
    if (gdext.classes.TextLine.mb_get_horizontal_alignment == null) gdext.classes.TextLine.mb_get_horizontal_alignment = MethodBind.get("TextLine", "get_horizontal_alignment", 341400642L)
    gdext.classes.HorizontalAlignment(Ptrcall.call0[Long](gdext.classes.TextLine.mb_get_horizontal_alignment, livePtr))
  }

  /** TextLine.set_flags */
  final def setFlags(flags: gdext.classes.TextServer.JustificationFlag): Unit = {
    if (gdext.classes.TextLine.mb_set_flags == null) gdext.classes.TextLine.mb_set_flags = MethodBind.get("TextLine", "set_flags", 2877345813L)
    Ptrcall.callVoid1(gdext.classes.TextLine.mb_set_flags, livePtr, flags.asInstanceOf[Long])
  }

  /** TextLine.get_flags */
  final def getFlags(): gdext.classes.TextServer.JustificationFlag = {
    if (gdext.classes.TextLine.mb_get_flags == null) gdext.classes.TextLine.mb_get_flags = MethodBind.get("TextLine", "get_flags", 1583363614L)
    gdext.classes.TextServer.JustificationFlag(Ptrcall.call0[Long](gdext.classes.TextLine.mb_get_flags, livePtr))
  }

  /** TextLine.set_text_overrun_behavior */
  final def setTextOverrunBehavior(overrunBehavior: gdext.classes.TextServer.OverrunBehavior): Unit = {
    if (gdext.classes.TextLine.mb_set_text_overrun_behavior == null) gdext.classes.TextLine.mb_set_text_overrun_behavior = MethodBind.get("TextLine", "set_text_overrun_behavior", 1008890932L)
    Ptrcall.callVoid1(gdext.classes.TextLine.mb_set_text_overrun_behavior, livePtr, overrunBehavior)
  }

  /** TextLine.get_text_overrun_behavior */
  final def getTextOverrunBehavior(): gdext.classes.TextServer.OverrunBehavior = {
    if (gdext.classes.TextLine.mb_get_text_overrun_behavior == null) gdext.classes.TextLine.mb_get_text_overrun_behavior = MethodBind.get("TextLine", "get_text_overrun_behavior", 3779142101L)
    gdext.classes.TextServer.OverrunBehavior(Ptrcall.call0[Long](gdext.classes.TextLine.mb_get_text_overrun_behavior, livePtr))
  }

  /** TextLine.set_ellipsis_char */
  final def setEllipsisChar(char: String): Unit = {
    if (gdext.classes.TextLine.mb_set_ellipsis_char == null) gdext.classes.TextLine.mb_set_ellipsis_char = MethodBind.get("TextLine", "set_ellipsis_char", 83702148L)
    Ptrcall.callVoid1(gdext.classes.TextLine.mb_set_ellipsis_char, livePtr, char)
  }

  /** TextLine.get_ellipsis_char */
  final def getEllipsisChar(): String = {
    if (gdext.classes.TextLine.mb_get_ellipsis_char == null) gdext.classes.TextLine.mb_get_ellipsis_char = MethodBind.get("TextLine", "get_ellipsis_char", 201670096L)
    Ptrcall.call0[String](gdext.classes.TextLine.mb_get_ellipsis_char, livePtr)
  }

  /** TextLine.get_size */
  final def getSize(): gdext.builtin.Vector2 = {
    if (gdext.classes.TextLine.mb_get_size == null) gdext.classes.TextLine.mb_get_size = MethodBind.get("TextLine", "get_size", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.TextLine.mb_get_size, livePtr)
  }

  /** TextLine.get_line_ascent */
  final def getLineAscent(): Double = {
    if (gdext.classes.TextLine.mb_get_line_ascent == null) gdext.classes.TextLine.mb_get_line_ascent = MethodBind.get("TextLine", "get_line_ascent", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.TextLine.mb_get_line_ascent, livePtr)
  }

  /** TextLine.get_line_descent */
  final def getLineDescent(): Double = {
    if (gdext.classes.TextLine.mb_get_line_descent == null) gdext.classes.TextLine.mb_get_line_descent = MethodBind.get("TextLine", "get_line_descent", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.TextLine.mb_get_line_descent, livePtr)
  }

  /** TextLine.get_line_width */
  final def getLineWidth(): Double = {
    if (gdext.classes.TextLine.mb_get_line_width == null) gdext.classes.TextLine.mb_get_line_width = MethodBind.get("TextLine", "get_line_width", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.TextLine.mb_get_line_width, livePtr)
  }

  /** TextLine.get_line_underline_position */
  final def getLineUnderlinePosition(): Double = {
    if (gdext.classes.TextLine.mb_get_line_underline_position == null) gdext.classes.TextLine.mb_get_line_underline_position = MethodBind.get("TextLine", "get_line_underline_position", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.TextLine.mb_get_line_underline_position, livePtr)
  }

  /** TextLine.get_line_underline_thickness */
  final def getLineUnderlineThickness(): Double = {
    if (gdext.classes.TextLine.mb_get_line_underline_thickness == null) gdext.classes.TextLine.mb_get_line_underline_thickness = MethodBind.get("TextLine", "get_line_underline_thickness", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.TextLine.mb_get_line_underline_thickness, livePtr)
  }

  /** TextLine.hit_test */
  final def hitTest(coords: Double): Long = {
    if (gdext.classes.TextLine.mb_hit_test == null) gdext.classes.TextLine.mb_hit_test = MethodBind.get("TextLine", "hit_test", 2401831903L)
    Ptrcall.call1[Double, Long](gdext.classes.TextLine.mb_hit_test, livePtr, coords)
  }

}

object TextLine {
  private[classes] var mb_clear: GDExtensionMethodBindPtr = null
  private[classes] var mb_duplicate: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_inferred_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_orientation: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_orientation: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_preserve_invalid: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_preserve_invalid: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_preserve_control: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_preserve_control: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_horizontal_alignment: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_horizontal_alignment: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_flags: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_flags: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_text_overrun_behavior: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_text_overrun_behavior: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_ellipsis_char: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_ellipsis_char: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_line_ascent: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_line_descent: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_line_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_line_underline_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_line_underline_thickness: GDExtensionMethodBindPtr = null
  private[classes] var mb_hit_test: GDExtensionMethodBindPtr = null
}
