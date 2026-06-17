package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `TextLine`, extends `RefCounted`. */
abstract class TextLine extends RefCounted {

  /** TextLine.clear */
  final def clear(): Unit =
    Ptrcall.callVoid0(MethodBind.get("TextLine", "clear", 3218959716L), hostObject.objectPtr)

  /** TextLine.duplicate */
  final def duplicate(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("TextLine", "duplicate", 1912703884L), hostObject.objectPtr)

  /** TextLine.set_direction */
  final def setDirection(direction: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextLine", "set_direction", 1418190634L), hostObject.objectPtr, direction)

  /** TextLine.get_direction */
  final def getDirection(): Long =
    Ptrcall.call0[Long](MethodBind.get("TextLine", "get_direction", 2516697328L), hostObject.objectPtr)

  /** TextLine.get_inferred_direction */
  final def getInferredDirection(): Long =
    Ptrcall.call0[Long](MethodBind.get("TextLine", "get_inferred_direction", 2516697328L), hostObject.objectPtr)

  /** TextLine.set_orientation */
  final def setOrientation(orientation: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextLine", "set_orientation", 42823726L), hostObject.objectPtr, orientation)

  /** TextLine.get_orientation */
  final def getOrientation(): Long =
    Ptrcall.call0[Long](MethodBind.get("TextLine", "get_orientation", 175768116L), hostObject.objectPtr)

  /** TextLine.set_preserve_invalid */
  final def setPreserveInvalid(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextLine", "set_preserve_invalid", 2586408642L), hostObject.objectPtr, enabled)

  /** TextLine.get_preserve_invalid */
  final def getPreserveInvalid(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TextLine", "get_preserve_invalid", 36873697L), hostObject.objectPtr)

  /** TextLine.set_preserve_control */
  final def setPreserveControl(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextLine", "set_preserve_control", 2586408642L), hostObject.objectPtr, enabled)

  /** TextLine.get_preserve_control */
  final def getPreserveControl(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TextLine", "get_preserve_control", 36873697L), hostObject.objectPtr)

  /** TextLine.set_width */
  final def setWidth(width: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextLine", "set_width", 373806689L), hostObject.objectPtr, width)

  /** TextLine.get_width */
  final def getWidth(): Double =
    Ptrcall.call0[Double](MethodBind.get("TextLine", "get_width", 1740695150L), hostObject.objectPtr)

  /** TextLine.set_horizontal_alignment */
  final def setHorizontalAlignment(alignment: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextLine", "set_horizontal_alignment", 2312603777L), hostObject.objectPtr, alignment)

  /** TextLine.get_horizontal_alignment */
  final def getHorizontalAlignment(): Long =
    Ptrcall.call0[Long](MethodBind.get("TextLine", "get_horizontal_alignment", 341400642L), hostObject.objectPtr)

  /** TextLine.set_flags */
  final def setFlags(flags: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextLine", "set_flags", 2877345813L), hostObject.objectPtr, flags)

  /** TextLine.get_flags */
  final def getFlags(): Long =
    Ptrcall.call0[Long](MethodBind.get("TextLine", "get_flags", 1583363614L), hostObject.objectPtr)

  /** TextLine.set_text_overrun_behavior */
  final def setTextOverrunBehavior(overrun_behavior: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextLine", "set_text_overrun_behavior", 1008890932L), hostObject.objectPtr, overrun_behavior)

  /** TextLine.get_text_overrun_behavior */
  final def getTextOverrunBehavior(): Long =
    Ptrcall.call0[Long](MethodBind.get("TextLine", "get_text_overrun_behavior", 3779142101L), hostObject.objectPtr)

  /** TextLine.set_ellipsis_char */
  final def setEllipsisChar(char: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextLine", "set_ellipsis_char", 83702148L), hostObject.objectPtr, char)

  /** TextLine.get_ellipsis_char */
  final def getEllipsisChar(): String =
    Ptrcall.call0[String](MethodBind.get("TextLine", "get_ellipsis_char", 201670096L), hostObject.objectPtr)

  /** TextLine.get_size */
  final def getSize(): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector2](MethodBind.get("TextLine", "get_size", 3341600327L), hostObject.objectPtr)

  /** TextLine.get_line_ascent */
  final def getLineAscent(): Double =
    Ptrcall.call0[Double](MethodBind.get("TextLine", "get_line_ascent", 1740695150L), hostObject.objectPtr)

  /** TextLine.get_line_descent */
  final def getLineDescent(): Double =
    Ptrcall.call0[Double](MethodBind.get("TextLine", "get_line_descent", 1740695150L), hostObject.objectPtr)

  /** TextLine.get_line_width */
  final def getLineWidth(): Double =
    Ptrcall.call0[Double](MethodBind.get("TextLine", "get_line_width", 1740695150L), hostObject.objectPtr)

  /** TextLine.get_line_underline_position */
  final def getLineUnderlinePosition(): Double =
    Ptrcall.call0[Double](MethodBind.get("TextLine", "get_line_underline_position", 1740695150L), hostObject.objectPtr)

  /** TextLine.get_line_underline_thickness */
  final def getLineUnderlineThickness(): Double =
    Ptrcall.call0[Double](MethodBind.get("TextLine", "get_line_underline_thickness", 1740695150L), hostObject.objectPtr)

  /** TextLine.hit_test */
  final def hitTest(coords: Double): Long =
    Ptrcall.call1[Double, Long](MethodBind.get("TextLine", "hit_test", 2401831903L), hostObject.objectPtr, coords)

}

object TextLine {
  /** Class metadata for Gd[TextLine] lifetime management and casting. */
  given GodotClass[TextLine] with {
    def className = "TextLine"
    def isRefCounted = true
    def wrap(o: GodotObject): TextLine = new TextLine {}.withHost(o.objectPtr)
    def unwrap(t: TextLine): GodotObject = t.hostObject
  }
}
