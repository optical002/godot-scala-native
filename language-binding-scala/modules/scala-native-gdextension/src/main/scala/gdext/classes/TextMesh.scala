package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `TextMesh`, extends `PrimitiveMesh`. */
abstract class TextMesh extends PrimitiveMesh {
  override def godotClassName: String = "TextMesh"

  /** TextMesh.set_horizontal_alignment */
  final def setHorizontalAlignment(alignment: gdext.classes.HorizontalAlignment): Unit = {
    if (gdext.classes.TextMesh.mb_set_horizontal_alignment == null) gdext.classes.TextMesh.mb_set_horizontal_alignment = MethodBind.get("TextMesh", "set_horizontal_alignment", 2312603777L)
    Ptrcall.callVoid1(gdext.classes.TextMesh.mb_set_horizontal_alignment, livePtr, alignment)
  }

  /** TextMesh.get_horizontal_alignment */
  final def getHorizontalAlignment(): gdext.classes.HorizontalAlignment = {
    if (gdext.classes.TextMesh.mb_get_horizontal_alignment == null) gdext.classes.TextMesh.mb_get_horizontal_alignment = MethodBind.get("TextMesh", "get_horizontal_alignment", 341400642L)
    gdext.classes.HorizontalAlignment(Ptrcall.call0[Long](gdext.classes.TextMesh.mb_get_horizontal_alignment, livePtr))
  }

  /** TextMesh.set_vertical_alignment */
  final def setVerticalAlignment(alignment: gdext.classes.VerticalAlignment): Unit = {
    if (gdext.classes.TextMesh.mb_set_vertical_alignment == null) gdext.classes.TextMesh.mb_set_vertical_alignment = MethodBind.get("TextMesh", "set_vertical_alignment", 1796458609L)
    Ptrcall.callVoid1(gdext.classes.TextMesh.mb_set_vertical_alignment, livePtr, alignment)
  }

  /** TextMesh.get_vertical_alignment */
  final def getVerticalAlignment(): gdext.classes.VerticalAlignment = {
    if (gdext.classes.TextMesh.mb_get_vertical_alignment == null) gdext.classes.TextMesh.mb_get_vertical_alignment = MethodBind.get("TextMesh", "get_vertical_alignment", 3274884059L)
    gdext.classes.VerticalAlignment(Ptrcall.call0[Long](gdext.classes.TextMesh.mb_get_vertical_alignment, livePtr))
  }

  /** TextMesh.set_text */
  final def setText(text: String): Unit = {
    if (gdext.classes.TextMesh.mb_set_text == null) gdext.classes.TextMesh.mb_set_text = MethodBind.get("TextMesh", "set_text", 83702148L)
    Ptrcall.callVoid1(gdext.classes.TextMesh.mb_set_text, livePtr, text)
  }

  /** TextMesh.get_text */
  final def getText(): String = {
    if (gdext.classes.TextMesh.mb_get_text == null) gdext.classes.TextMesh.mb_get_text = MethodBind.get("TextMesh", "get_text", 201670096L)
    Ptrcall.call0[String](gdext.classes.TextMesh.mb_get_text, livePtr)
  }

  /** TextMesh.set_font */
  final def setFont(font: Font): Unit = {
    if (gdext.classes.TextMesh.mb_set_font == null) gdext.classes.TextMesh.mb_set_font = MethodBind.get("TextMesh", "set_font", 1262170328L)
    Ptrcall.callVoid1(gdext.classes.TextMesh.mb_set_font, livePtr, Wrappers.handle(font))
  }

  /** TextMesh.get_font. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getFont(): Font = {
    if (gdext.classes.TextMesh.mb_get_font == null) gdext.classes.TextMesh.mb_get_font = MethodBind.get("TextMesh", "get_font", 3229501585L)
    Wrappers.owned[Font](Ptrcall.call0[Long](gdext.classes.TextMesh.mb_get_font, livePtr))
  }

  /** TextMesh.set_font_size */
  final def setFontSize(fontSize: Long): Unit = {
    if (gdext.classes.TextMesh.mb_set_font_size == null) gdext.classes.TextMesh.mb_set_font_size = MethodBind.get("TextMesh", "set_font_size", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.TextMesh.mb_set_font_size, livePtr, fontSize)
  }

  /** TextMesh.get_font_size */
  final def getFontSize(): Long = {
    if (gdext.classes.TextMesh.mb_get_font_size == null) gdext.classes.TextMesh.mb_get_font_size = MethodBind.get("TextMesh", "get_font_size", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.TextMesh.mb_get_font_size, livePtr)
  }

  /** TextMesh.set_line_spacing */
  final def setLineSpacing(lineSpacing: Double): Unit = {
    if (gdext.classes.TextMesh.mb_set_line_spacing == null) gdext.classes.TextMesh.mb_set_line_spacing = MethodBind.get("TextMesh", "set_line_spacing", 373806689L)
    Ptrcall.callVoid1(gdext.classes.TextMesh.mb_set_line_spacing, livePtr, lineSpacing)
  }

  /** TextMesh.get_line_spacing */
  final def getLineSpacing(): Double = {
    if (gdext.classes.TextMesh.mb_get_line_spacing == null) gdext.classes.TextMesh.mb_get_line_spacing = MethodBind.get("TextMesh", "get_line_spacing", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.TextMesh.mb_get_line_spacing, livePtr)
  }

  /** TextMesh.set_autowrap_mode */
  final def setAutowrapMode(autowrapMode: gdext.classes.TextServer.AutowrapMode): Unit = {
    if (gdext.classes.TextMesh.mb_set_autowrap_mode == null) gdext.classes.TextMesh.mb_set_autowrap_mode = MethodBind.get("TextMesh", "set_autowrap_mode", 3289138044L)
    Ptrcall.callVoid1(gdext.classes.TextMesh.mb_set_autowrap_mode, livePtr, autowrapMode)
  }

  /** TextMesh.get_autowrap_mode */
  final def getAutowrapMode(): gdext.classes.TextServer.AutowrapMode = {
    if (gdext.classes.TextMesh.mb_get_autowrap_mode == null) gdext.classes.TextMesh.mb_get_autowrap_mode = MethodBind.get("TextMesh", "get_autowrap_mode", 1549071663L)
    gdext.classes.TextServer.AutowrapMode(Ptrcall.call0[Long](gdext.classes.TextMesh.mb_get_autowrap_mode, livePtr))
  }

  /** TextMesh.set_justification_flags */
  final def setJustificationFlags(justificationFlags: gdext.classes.TextServer.JustificationFlag): Unit = {
    if (gdext.classes.TextMesh.mb_set_justification_flags == null) gdext.classes.TextMesh.mb_set_justification_flags = MethodBind.get("TextMesh", "set_justification_flags", 2877345813L)
    Ptrcall.callVoid1(gdext.classes.TextMesh.mb_set_justification_flags, livePtr, justificationFlags.asInstanceOf[Long])
  }

  /** TextMesh.get_justification_flags */
  final def getJustificationFlags(): gdext.classes.TextServer.JustificationFlag = {
    if (gdext.classes.TextMesh.mb_get_justification_flags == null) gdext.classes.TextMesh.mb_get_justification_flags = MethodBind.get("TextMesh", "get_justification_flags", 1583363614L)
    gdext.classes.TextServer.JustificationFlag(Ptrcall.call0[Long](gdext.classes.TextMesh.mb_get_justification_flags, livePtr))
  }

  /** TextMesh.set_depth */
  final def setDepth(depth: Double): Unit = {
    if (gdext.classes.TextMesh.mb_set_depth == null) gdext.classes.TextMesh.mb_set_depth = MethodBind.get("TextMesh", "set_depth", 373806689L)
    Ptrcall.callVoid1(gdext.classes.TextMesh.mb_set_depth, livePtr, depth)
  }

  /** TextMesh.get_depth */
  final def getDepth(): Double = {
    if (gdext.classes.TextMesh.mb_get_depth == null) gdext.classes.TextMesh.mb_get_depth = MethodBind.get("TextMesh", "get_depth", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.TextMesh.mb_get_depth, livePtr)
  }

  /** TextMesh.set_width */
  final def setWidth(width: Double): Unit = {
    if (gdext.classes.TextMesh.mb_set_width == null) gdext.classes.TextMesh.mb_set_width = MethodBind.get("TextMesh", "set_width", 373806689L)
    Ptrcall.callVoid1(gdext.classes.TextMesh.mb_set_width, livePtr, width)
  }

  /** TextMesh.get_width */
  final def getWidth(): Double = {
    if (gdext.classes.TextMesh.mb_get_width == null) gdext.classes.TextMesh.mb_get_width = MethodBind.get("TextMesh", "get_width", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.TextMesh.mb_get_width, livePtr)
  }

  /** TextMesh.set_pixel_size */
  final def setPixelSize(pixelSize: Double): Unit = {
    if (gdext.classes.TextMesh.mb_set_pixel_size == null) gdext.classes.TextMesh.mb_set_pixel_size = MethodBind.get("TextMesh", "set_pixel_size", 373806689L)
    Ptrcall.callVoid1(gdext.classes.TextMesh.mb_set_pixel_size, livePtr, pixelSize)
  }

  /** TextMesh.get_pixel_size */
  final def getPixelSize(): Double = {
    if (gdext.classes.TextMesh.mb_get_pixel_size == null) gdext.classes.TextMesh.mb_get_pixel_size = MethodBind.get("TextMesh", "get_pixel_size", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.TextMesh.mb_get_pixel_size, livePtr)
  }

  /** TextMesh.set_offset */
  final def setOffset(offset: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.TextMesh.mb_set_offset == null) gdext.classes.TextMesh.mb_set_offset = MethodBind.get("TextMesh", "set_offset", 743155724L)
    Ptrcall.callVoid1(gdext.classes.TextMesh.mb_set_offset, livePtr, offset)
  }

  /** TextMesh.get_offset */
  final def getOffset(): gdext.builtin.Vector2 = {
    if (gdext.classes.TextMesh.mb_get_offset == null) gdext.classes.TextMesh.mb_get_offset = MethodBind.get("TextMesh", "get_offset", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.TextMesh.mb_get_offset, livePtr)
  }

  /** TextMesh.set_curve_step */
  final def setCurveStep(curveStep: Double): Unit = {
    if (gdext.classes.TextMesh.mb_set_curve_step == null) gdext.classes.TextMesh.mb_set_curve_step = MethodBind.get("TextMesh", "set_curve_step", 373806689L)
    Ptrcall.callVoid1(gdext.classes.TextMesh.mb_set_curve_step, livePtr, curveStep)
  }

  /** TextMesh.get_curve_step */
  final def getCurveStep(): Double = {
    if (gdext.classes.TextMesh.mb_get_curve_step == null) gdext.classes.TextMesh.mb_get_curve_step = MethodBind.get("TextMesh", "get_curve_step", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.TextMesh.mb_get_curve_step, livePtr)
  }

  /** TextMesh.set_text_direction */
  final def setTextDirection(direction: gdext.classes.TextServer.Direction): Unit = {
    if (gdext.classes.TextMesh.mb_set_text_direction == null) gdext.classes.TextMesh.mb_set_text_direction = MethodBind.get("TextMesh", "set_text_direction", 1418190634L)
    Ptrcall.callVoid1(gdext.classes.TextMesh.mb_set_text_direction, livePtr, direction)
  }

  /** TextMesh.get_text_direction */
  final def getTextDirection(): gdext.classes.TextServer.Direction = {
    if (gdext.classes.TextMesh.mb_get_text_direction == null) gdext.classes.TextMesh.mb_get_text_direction = MethodBind.get("TextMesh", "get_text_direction", 2516697328L)
    gdext.classes.TextServer.Direction(Ptrcall.call0[Long](gdext.classes.TextMesh.mb_get_text_direction, livePtr))
  }

  /** TextMesh.set_language */
  final def setLanguage(language: String): Unit = {
    if (gdext.classes.TextMesh.mb_set_language == null) gdext.classes.TextMesh.mb_set_language = MethodBind.get("TextMesh", "set_language", 83702148L)
    Ptrcall.callVoid1(gdext.classes.TextMesh.mb_set_language, livePtr, language)
  }

  /** TextMesh.get_language */
  final def getLanguage(): String = {
    if (gdext.classes.TextMesh.mb_get_language == null) gdext.classes.TextMesh.mb_get_language = MethodBind.get("TextMesh", "get_language", 201670096L)
    Ptrcall.call0[String](gdext.classes.TextMesh.mb_get_language, livePtr)
  }

  /** TextMesh.set_structured_text_bidi_override */
  final def setStructuredTextBidiOverride(parser: gdext.classes.TextServer.StructuredTextParser): Unit = {
    if (gdext.classes.TextMesh.mb_set_structured_text_bidi_override == null) gdext.classes.TextMesh.mb_set_structured_text_bidi_override = MethodBind.get("TextMesh", "set_structured_text_bidi_override", 55961453L)
    Ptrcall.callVoid1(gdext.classes.TextMesh.mb_set_structured_text_bidi_override, livePtr, parser)
  }

  /** TextMesh.get_structured_text_bidi_override */
  final def getStructuredTextBidiOverride(): gdext.classes.TextServer.StructuredTextParser = {
    if (gdext.classes.TextMesh.mb_get_structured_text_bidi_override == null) gdext.classes.TextMesh.mb_get_structured_text_bidi_override = MethodBind.get("TextMesh", "get_structured_text_bidi_override", 3385126229L)
    gdext.classes.TextServer.StructuredTextParser(Ptrcall.call0[Long](gdext.classes.TextMesh.mb_get_structured_text_bidi_override, livePtr))
  }

  /** TextMesh.set_uppercase */
  final def setUppercase(enable: Boolean): Unit = {
    if (gdext.classes.TextMesh.mb_set_uppercase == null) gdext.classes.TextMesh.mb_set_uppercase = MethodBind.get("TextMesh", "set_uppercase", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TextMesh.mb_set_uppercase, livePtr, enable)
  }

  /** TextMesh.is_uppercase */
  final def isUppercase(): Boolean = {
    if (gdext.classes.TextMesh.mb_is_uppercase == null) gdext.classes.TextMesh.mb_is_uppercase = MethodBind.get("TextMesh", "is_uppercase", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TextMesh.mb_is_uppercase, livePtr)
  }

}

object TextMesh {
  private[classes] var mb_set_horizontal_alignment: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_horizontal_alignment: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_vertical_alignment: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_vertical_alignment: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_text: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_text: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_font: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_font: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_font_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_font_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_line_spacing: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_line_spacing: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_autowrap_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_autowrap_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_justification_flags: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_justification_flags: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_depth: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_depth: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_pixel_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_pixel_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_curve_step: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_curve_step: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_text_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_text_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_language: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_language: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_structured_text_bidi_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_structured_text_bidi_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_uppercase: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_uppercase: GDExtensionMethodBindPtr = null
}
