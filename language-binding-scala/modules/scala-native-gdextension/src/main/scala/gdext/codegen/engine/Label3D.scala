package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `Label3D`, extends `GeometryInstance3D`. */
abstract class Label3D extends GeometryInstance3D {

  /** Label3D.set_horizontal_alignment */
  final def setHorizontalAlignment(alignment: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Label3D", "set_horizontal_alignment", 2312603777L), hostObject.objectPtr, alignment)

  /** Label3D.get_horizontal_alignment */
  final def getHorizontalAlignment(): Long =
    Ptrcall.call0[Long](MethodBind.get("Label3D", "get_horizontal_alignment", 341400642L), hostObject.objectPtr)

  /** Label3D.set_vertical_alignment */
  final def setVerticalAlignment(alignment: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Label3D", "set_vertical_alignment", 1796458609L), hostObject.objectPtr, alignment)

  /** Label3D.get_vertical_alignment */
  final def getVerticalAlignment(): Long =
    Ptrcall.call0[Long](MethodBind.get("Label3D", "get_vertical_alignment", 3274884059L), hostObject.objectPtr)

  /** Label3D.set_modulate */
  final def setModulate(modulate: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("Label3D", "set_modulate", 2920490490L), hostObject.objectPtr, modulate)

  /** Label3D.get_modulate */
  final def getModulate(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("Label3D", "get_modulate", 3444240500L), hostObject.objectPtr)

  /** Label3D.set_outline_modulate */
  final def setOutlineModulate(modulate: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("Label3D", "set_outline_modulate", 2920490490L), hostObject.objectPtr, modulate)

  /** Label3D.get_outline_modulate */
  final def getOutlineModulate(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("Label3D", "get_outline_modulate", 3444240500L), hostObject.objectPtr)

  /** Label3D.set_text */
  final def setText(text: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("Label3D", "set_text", 83702148L), hostObject.objectPtr, text)

  /** Label3D.get_text */
  final def getText(): String =
    Ptrcall.call0[String](MethodBind.get("Label3D", "get_text", 201670096L), hostObject.objectPtr)

  /** Label3D.set_text_direction */
  final def setTextDirection(direction: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Label3D", "set_text_direction", 1418190634L), hostObject.objectPtr, direction)

  /** Label3D.get_text_direction */
  final def getTextDirection(): Long =
    Ptrcall.call0[Long](MethodBind.get("Label3D", "get_text_direction", 2516697328L), hostObject.objectPtr)

  /** Label3D.set_language */
  final def setLanguage(language: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("Label3D", "set_language", 83702148L), hostObject.objectPtr, language)

  /** Label3D.get_language */
  final def getLanguage(): String =
    Ptrcall.call0[String](MethodBind.get("Label3D", "get_language", 201670096L), hostObject.objectPtr)

  /** Label3D.set_structured_text_bidi_override */
  final def setStructuredTextBidiOverride(parser: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Label3D", "set_structured_text_bidi_override", 55961453L), hostObject.objectPtr, parser)

  /** Label3D.get_structured_text_bidi_override */
  final def getStructuredTextBidiOverride(): Long =
    Ptrcall.call0[Long](MethodBind.get("Label3D", "get_structured_text_bidi_override", 3385126229L), hostObject.objectPtr)

  /** Label3D.set_uppercase */
  final def setUppercase(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Label3D", "set_uppercase", 2586408642L), hostObject.objectPtr, enable)

  /** Label3D.is_uppercase */
  final def isUppercase(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Label3D", "is_uppercase", 36873697L), hostObject.objectPtr)

  /** Label3D.set_render_priority */
  final def setRenderPriority(priority: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Label3D", "set_render_priority", 1286410249L), hostObject.objectPtr, priority)

  /** Label3D.get_render_priority */
  final def getRenderPriority(): Long =
    Ptrcall.call0[Long](MethodBind.get("Label3D", "get_render_priority", 3905245786L), hostObject.objectPtr)

  /** Label3D.set_outline_render_priority */
  final def setOutlineRenderPriority(priority: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Label3D", "set_outline_render_priority", 1286410249L), hostObject.objectPtr, priority)

  /** Label3D.get_outline_render_priority */
  final def getOutlineRenderPriority(): Long =
    Ptrcall.call0[Long](MethodBind.get("Label3D", "get_outline_render_priority", 3905245786L), hostObject.objectPtr)

  /** Label3D.set_font */
  final def setFont(font: Font): Unit =
    Ptrcall.callVoid1(MethodBind.get("Label3D", "set_font", 1262170328L), hostObject.objectPtr, font.hostObject)

  /** Label3D.get_font */
  final def getFont(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Label3D", "get_font", 3229501585L), hostObject.objectPtr)

  /** Label3D.set_font_size */
  final def setFontSize(size: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Label3D", "set_font_size", 1286410249L), hostObject.objectPtr, size)

  /** Label3D.get_font_size */
  final def getFontSize(): Long =
    Ptrcall.call0[Long](MethodBind.get("Label3D", "get_font_size", 3905245786L), hostObject.objectPtr)

  /** Label3D.set_outline_size */
  final def setOutlineSize(outline_size: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Label3D", "set_outline_size", 1286410249L), hostObject.objectPtr, outline_size)

  /** Label3D.get_outline_size */
  final def getOutlineSize(): Long =
    Ptrcall.call0[Long](MethodBind.get("Label3D", "get_outline_size", 3905245786L), hostObject.objectPtr)

  /** Label3D.set_line_spacing */
  final def setLineSpacing(line_spacing: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Label3D", "set_line_spacing", 373806689L), hostObject.objectPtr, line_spacing)

  /** Label3D.get_line_spacing */
  final def getLineSpacing(): Double =
    Ptrcall.call0[Double](MethodBind.get("Label3D", "get_line_spacing", 1740695150L), hostObject.objectPtr)

  /** Label3D.set_autowrap_mode */
  final def setAutowrapMode(autowrap_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Label3D", "set_autowrap_mode", 3289138044L), hostObject.objectPtr, autowrap_mode)

  /** Label3D.get_autowrap_mode */
  final def getAutowrapMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("Label3D", "get_autowrap_mode", 1549071663L), hostObject.objectPtr)

  /** Label3D.set_autowrap_trim_flags */
  final def setAutowrapTrimFlags(autowrap_trim_flags: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Label3D", "set_autowrap_trim_flags", 2809697122L), hostObject.objectPtr, autowrap_trim_flags)

  /** Label3D.get_autowrap_trim_flags */
  final def getAutowrapTrimFlags(): Long =
    Ptrcall.call0[Long](MethodBind.get("Label3D", "get_autowrap_trim_flags", 2340632602L), hostObject.objectPtr)

  /** Label3D.set_justification_flags */
  final def setJustificationFlags(justification_flags: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Label3D", "set_justification_flags", 2877345813L), hostObject.objectPtr, justification_flags)

  /** Label3D.get_justification_flags */
  final def getJustificationFlags(): Long =
    Ptrcall.call0[Long](MethodBind.get("Label3D", "get_justification_flags", 1583363614L), hostObject.objectPtr)

  /** Label3D.set_width */
  final def setWidth(width: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Label3D", "set_width", 373806689L), hostObject.objectPtr, width)

  /** Label3D.get_width */
  final def getWidth(): Double =
    Ptrcall.call0[Double](MethodBind.get("Label3D", "get_width", 1740695150L), hostObject.objectPtr)

  /** Label3D.set_pixel_size */
  final def setPixelSize(pixel_size: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Label3D", "set_pixel_size", 373806689L), hostObject.objectPtr, pixel_size)

  /** Label3D.get_pixel_size */
  final def getPixelSize(): Double =
    Ptrcall.call0[Double](MethodBind.get("Label3D", "get_pixel_size", 1740695150L), hostObject.objectPtr)

  /** Label3D.set_offset */
  final def setOffset(offset: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("Label3D", "set_offset", 743155724L), hostObject.objectPtr, offset)

  /** Label3D.get_offset */
  final def getOffset(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("Label3D", "get_offset", 3341600327L), hostObject.objectPtr)

  /** Label3D.set_draw_flag */
  final def setDrawFlag(flag: Long, enabled: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("Label3D", "set_draw_flag", 1285833066L), hostObject.objectPtr, flag, enabled)

  /** Label3D.get_draw_flag */
  final def getDrawFlag(flag: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("Label3D", "get_draw_flag", 259226453L), hostObject.objectPtr, flag)

  /** Label3D.set_billboard_mode */
  final def setBillboardMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Label3D", "set_billboard_mode", 4202036497L), hostObject.objectPtr, mode)

  /** Label3D.get_billboard_mode */
  final def getBillboardMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("Label3D", "get_billboard_mode", 1283840139L), hostObject.objectPtr)

  /** Label3D.set_alpha_cut_mode */
  final def setAlphaCutMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Label3D", "set_alpha_cut_mode", 2549142916L), hostObject.objectPtr, mode)

  /** Label3D.get_alpha_cut_mode */
  final def getAlphaCutMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("Label3D", "get_alpha_cut_mode", 219468601L), hostObject.objectPtr)

  /** Label3D.set_alpha_scissor_threshold */
  final def setAlphaScissorThreshold(threshold: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Label3D", "set_alpha_scissor_threshold", 373806689L), hostObject.objectPtr, threshold)

  /** Label3D.get_alpha_scissor_threshold */
  final def getAlphaScissorThreshold(): Double =
    Ptrcall.call0[Double](MethodBind.get("Label3D", "get_alpha_scissor_threshold", 1740695150L), hostObject.objectPtr)

  /** Label3D.set_alpha_hash_scale */
  final def setAlphaHashScale(threshold: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Label3D", "set_alpha_hash_scale", 373806689L), hostObject.objectPtr, threshold)

  /** Label3D.get_alpha_hash_scale */
  final def getAlphaHashScale(): Double =
    Ptrcall.call0[Double](MethodBind.get("Label3D", "get_alpha_hash_scale", 1740695150L), hostObject.objectPtr)

  /** Label3D.set_alpha_antialiasing */
  final def setAlphaAntialiasing(alpha_aa: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Label3D", "set_alpha_antialiasing", 3212649852L), hostObject.objectPtr, alpha_aa)

  /** Label3D.get_alpha_antialiasing */
  final def getAlphaAntialiasing(): Long =
    Ptrcall.call0[Long](MethodBind.get("Label3D", "get_alpha_antialiasing", 2889939400L), hostObject.objectPtr)

  /** Label3D.set_alpha_antialiasing_edge */
  final def setAlphaAntialiasingEdge(edge: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Label3D", "set_alpha_antialiasing_edge", 373806689L), hostObject.objectPtr, edge)

  /** Label3D.get_alpha_antialiasing_edge */
  final def getAlphaAntialiasingEdge(): Double =
    Ptrcall.call0[Double](MethodBind.get("Label3D", "get_alpha_antialiasing_edge", 1740695150L), hostObject.objectPtr)

  /** Label3D.set_texture_filter */
  final def setTextureFilter(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Label3D", "set_texture_filter", 22904437L), hostObject.objectPtr, mode)

  /** Label3D.get_texture_filter */
  final def getTextureFilter(): Long =
    Ptrcall.call0[Long](MethodBind.get("Label3D", "get_texture_filter", 3289213076L), hostObject.objectPtr)

  /** Label3D.generate_triangle_mesh */
  final def generateTriangleMesh(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Label3D", "generate_triangle_mesh", 3476533166L), hostObject.objectPtr)

}

object Label3D {
  /** Class metadata for Gd[Label3D] lifetime management and casting. */
  given GodotClass[Label3D] with {
    def className = "Label3D"
    def isRefCounted = false
    def wrap(o: GodotObject): Label3D = new Label3D {}.withHost(o.objectPtr)
    def unwrap(t: Label3D): GodotObject = t.hostObject
  }
}
