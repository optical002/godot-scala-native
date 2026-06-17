package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `TextMesh`, extends `PrimitiveMesh`. */
abstract class TextMesh extends PrimitiveMesh {

  /** TextMesh.set_horizontal_alignment */
  final def setHorizontalAlignment(alignment: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextMesh", "set_horizontal_alignment", 2312603777L), hostObject.objectPtr, alignment)

  /** TextMesh.get_horizontal_alignment */
  final def getHorizontalAlignment(): Long =
    Ptrcall.call0[Long](MethodBind.get("TextMesh", "get_horizontal_alignment", 341400642L), hostObject.objectPtr)

  /** TextMesh.set_vertical_alignment */
  final def setVerticalAlignment(alignment: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextMesh", "set_vertical_alignment", 1796458609L), hostObject.objectPtr, alignment)

  /** TextMesh.get_vertical_alignment */
  final def getVerticalAlignment(): Long =
    Ptrcall.call0[Long](MethodBind.get("TextMesh", "get_vertical_alignment", 3274884059L), hostObject.objectPtr)

  /** TextMesh.set_text */
  final def setText(text: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextMesh", "set_text", 83702148L), hostObject.objectPtr, text)

  /** TextMesh.get_text */
  final def getText(): String =
    Ptrcall.call0[String](MethodBind.get("TextMesh", "get_text", 201670096L), hostObject.objectPtr)

  /** TextMesh.set_font */
  final def setFont(font: Font): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextMesh", "set_font", 1262170328L), hostObject.objectPtr, font.hostObject)

  /** TextMesh.get_font */
  final def getFont(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("TextMesh", "get_font", 3229501585L), hostObject.objectPtr)

  /** TextMesh.set_font_size */
  final def setFontSize(font_size: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextMesh", "set_font_size", 1286410249L), hostObject.objectPtr, font_size)

  /** TextMesh.get_font_size */
  final def getFontSize(): Long =
    Ptrcall.call0[Long](MethodBind.get("TextMesh", "get_font_size", 3905245786L), hostObject.objectPtr)

  /** TextMesh.set_line_spacing */
  final def setLineSpacing(line_spacing: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextMesh", "set_line_spacing", 373806689L), hostObject.objectPtr, line_spacing)

  /** TextMesh.get_line_spacing */
  final def getLineSpacing(): Double =
    Ptrcall.call0[Double](MethodBind.get("TextMesh", "get_line_spacing", 1740695150L), hostObject.objectPtr)

  /** TextMesh.set_autowrap_mode */
  final def setAutowrapMode(autowrap_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextMesh", "set_autowrap_mode", 3289138044L), hostObject.objectPtr, autowrap_mode)

  /** TextMesh.get_autowrap_mode */
  final def getAutowrapMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("TextMesh", "get_autowrap_mode", 1549071663L), hostObject.objectPtr)

  /** TextMesh.set_justification_flags */
  final def setJustificationFlags(justification_flags: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextMesh", "set_justification_flags", 2877345813L), hostObject.objectPtr, justification_flags)

  /** TextMesh.get_justification_flags */
  final def getJustificationFlags(): Long =
    Ptrcall.call0[Long](MethodBind.get("TextMesh", "get_justification_flags", 1583363614L), hostObject.objectPtr)

  /** TextMesh.set_depth */
  final def setDepth(depth: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextMesh", "set_depth", 373806689L), hostObject.objectPtr, depth)

  /** TextMesh.get_depth */
  final def getDepth(): Double =
    Ptrcall.call0[Double](MethodBind.get("TextMesh", "get_depth", 1740695150L), hostObject.objectPtr)

  /** TextMesh.set_width */
  final def setWidth(width: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextMesh", "set_width", 373806689L), hostObject.objectPtr, width)

  /** TextMesh.get_width */
  final def getWidth(): Double =
    Ptrcall.call0[Double](MethodBind.get("TextMesh", "get_width", 1740695150L), hostObject.objectPtr)

  /** TextMesh.set_pixel_size */
  final def setPixelSize(pixel_size: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextMesh", "set_pixel_size", 373806689L), hostObject.objectPtr, pixel_size)

  /** TextMesh.get_pixel_size */
  final def getPixelSize(): Double =
    Ptrcall.call0[Double](MethodBind.get("TextMesh", "get_pixel_size", 1740695150L), hostObject.objectPtr)

  /** TextMesh.set_offset */
  final def setOffset(offset: io.github.optical002.godot.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextMesh", "set_offset", 743155724L), hostObject.objectPtr, offset)

  /** TextMesh.get_offset */
  final def getOffset(): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector2](MethodBind.get("TextMesh", "get_offset", 3341600327L), hostObject.objectPtr)

  /** TextMesh.set_curve_step */
  final def setCurveStep(curve_step: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextMesh", "set_curve_step", 373806689L), hostObject.objectPtr, curve_step)

  /** TextMesh.get_curve_step */
  final def getCurveStep(): Double =
    Ptrcall.call0[Double](MethodBind.get("TextMesh", "get_curve_step", 1740695150L), hostObject.objectPtr)

  /** TextMesh.set_text_direction */
  final def setTextDirection(direction: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextMesh", "set_text_direction", 1418190634L), hostObject.objectPtr, direction)

  /** TextMesh.get_text_direction */
  final def getTextDirection(): Long =
    Ptrcall.call0[Long](MethodBind.get("TextMesh", "get_text_direction", 2516697328L), hostObject.objectPtr)

  /** TextMesh.set_language */
  final def setLanguage(language: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextMesh", "set_language", 83702148L), hostObject.objectPtr, language)

  /** TextMesh.get_language */
  final def getLanguage(): String =
    Ptrcall.call0[String](MethodBind.get("TextMesh", "get_language", 201670096L), hostObject.objectPtr)

  /** TextMesh.set_structured_text_bidi_override */
  final def setStructuredTextBidiOverride(parser: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextMesh", "set_structured_text_bidi_override", 55961453L), hostObject.objectPtr, parser)

  /** TextMesh.get_structured_text_bidi_override */
  final def getStructuredTextBidiOverride(): Long =
    Ptrcall.call0[Long](MethodBind.get("TextMesh", "get_structured_text_bidi_override", 3385126229L), hostObject.objectPtr)

  /** TextMesh.set_uppercase */
  final def setUppercase(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("TextMesh", "set_uppercase", 2586408642L), hostObject.objectPtr, enable)

  /** TextMesh.is_uppercase */
  final def isUppercase(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TextMesh", "is_uppercase", 36873697L), hostObject.objectPtr)

}

object TextMesh {
  /** Class metadata for Gd[TextMesh] lifetime management and casting. */
  given GodotClass[TextMesh] with {
    def className = "TextMesh"
    def isRefCounted = true
    def wrap(o: GodotObject): TextMesh = new TextMesh {}.withHost(o.objectPtr)
    def unwrap(t: TextMesh): GodotObject = t.hostObject
  }
}
