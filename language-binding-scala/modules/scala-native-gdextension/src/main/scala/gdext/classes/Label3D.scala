package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Label3D`, extends `GeometryInstance3D`. */
abstract class Label3D extends GeometryInstance3D {
  override def godotClassName: String = "Label3D"

  /** Label3D.set_horizontal_alignment */
  final def setHorizontalAlignment(alignment: Long): Unit = {
    if (gdext.classes.Label3D.mb_set_horizontal_alignment == null) gdext.classes.Label3D.mb_set_horizontal_alignment = MethodBind.get("Label3D", "set_horizontal_alignment", 2312603777L)
    Ptrcall.callVoid1(gdext.classes.Label3D.mb_set_horizontal_alignment, livePtr, alignment)
  }

  /** Label3D.get_horizontal_alignment */
  final def getHorizontalAlignment(): Long = {
    if (gdext.classes.Label3D.mb_get_horizontal_alignment == null) gdext.classes.Label3D.mb_get_horizontal_alignment = MethodBind.get("Label3D", "get_horizontal_alignment", 341400642L)
    Ptrcall.call0[Long](gdext.classes.Label3D.mb_get_horizontal_alignment, livePtr)
  }

  /** Label3D.set_vertical_alignment */
  final def setVerticalAlignment(alignment: Long): Unit = {
    if (gdext.classes.Label3D.mb_set_vertical_alignment == null) gdext.classes.Label3D.mb_set_vertical_alignment = MethodBind.get("Label3D", "set_vertical_alignment", 1796458609L)
    Ptrcall.callVoid1(gdext.classes.Label3D.mb_set_vertical_alignment, livePtr, alignment)
  }

  /** Label3D.get_vertical_alignment */
  final def getVerticalAlignment(): Long = {
    if (gdext.classes.Label3D.mb_get_vertical_alignment == null) gdext.classes.Label3D.mb_get_vertical_alignment = MethodBind.get("Label3D", "get_vertical_alignment", 3274884059L)
    Ptrcall.call0[Long](gdext.classes.Label3D.mb_get_vertical_alignment, livePtr)
  }

  /** Label3D.set_modulate */
  final def setModulate(modulate: gdext.builtin.Color): Unit = {
    if (gdext.classes.Label3D.mb_set_modulate == null) gdext.classes.Label3D.mb_set_modulate = MethodBind.get("Label3D", "set_modulate", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.Label3D.mb_set_modulate, livePtr, modulate)
  }

  /** Label3D.get_modulate */
  final def getModulate(): gdext.builtin.Color = {
    if (gdext.classes.Label3D.mb_get_modulate == null) gdext.classes.Label3D.mb_get_modulate = MethodBind.get("Label3D", "get_modulate", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.Label3D.mb_get_modulate, livePtr)
  }

  /** Label3D.set_outline_modulate */
  final def setOutlineModulate(modulate: gdext.builtin.Color): Unit = {
    if (gdext.classes.Label3D.mb_set_outline_modulate == null) gdext.classes.Label3D.mb_set_outline_modulate = MethodBind.get("Label3D", "set_outline_modulate", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.Label3D.mb_set_outline_modulate, livePtr, modulate)
  }

  /** Label3D.get_outline_modulate */
  final def getOutlineModulate(): gdext.builtin.Color = {
    if (gdext.classes.Label3D.mb_get_outline_modulate == null) gdext.classes.Label3D.mb_get_outline_modulate = MethodBind.get("Label3D", "get_outline_modulate", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.Label3D.mb_get_outline_modulate, livePtr)
  }

  /** Label3D.set_text */
  final def setText(text: String): Unit = {
    if (gdext.classes.Label3D.mb_set_text == null) gdext.classes.Label3D.mb_set_text = MethodBind.get("Label3D", "set_text", 83702148L)
    Ptrcall.callVoid1(gdext.classes.Label3D.mb_set_text, livePtr, text)
  }

  /** Label3D.get_text */
  final def getText(): String = {
    if (gdext.classes.Label3D.mb_get_text == null) gdext.classes.Label3D.mb_get_text = MethodBind.get("Label3D", "get_text", 201670096L)
    Ptrcall.call0[String](gdext.classes.Label3D.mb_get_text, livePtr)
  }

  /** Label3D.set_text_direction */
  final def setTextDirection(direction: Long): Unit = {
    if (gdext.classes.Label3D.mb_set_text_direction == null) gdext.classes.Label3D.mb_set_text_direction = MethodBind.get("Label3D", "set_text_direction", 1418190634L)
    Ptrcall.callVoid1(gdext.classes.Label3D.mb_set_text_direction, livePtr, direction)
  }

  /** Label3D.get_text_direction */
  final def getTextDirection(): Long = {
    if (gdext.classes.Label3D.mb_get_text_direction == null) gdext.classes.Label3D.mb_get_text_direction = MethodBind.get("Label3D", "get_text_direction", 2516697328L)
    Ptrcall.call0[Long](gdext.classes.Label3D.mb_get_text_direction, livePtr)
  }

  /** Label3D.set_language */
  final def setLanguage(language: String): Unit = {
    if (gdext.classes.Label3D.mb_set_language == null) gdext.classes.Label3D.mb_set_language = MethodBind.get("Label3D", "set_language", 83702148L)
    Ptrcall.callVoid1(gdext.classes.Label3D.mb_set_language, livePtr, language)
  }

  /** Label3D.get_language */
  final def getLanguage(): String = {
    if (gdext.classes.Label3D.mb_get_language == null) gdext.classes.Label3D.mb_get_language = MethodBind.get("Label3D", "get_language", 201670096L)
    Ptrcall.call0[String](gdext.classes.Label3D.mb_get_language, livePtr)
  }

  /** Label3D.set_structured_text_bidi_override */
  final def setStructuredTextBidiOverride(parser: Long): Unit = {
    if (gdext.classes.Label3D.mb_set_structured_text_bidi_override == null) gdext.classes.Label3D.mb_set_structured_text_bidi_override = MethodBind.get("Label3D", "set_structured_text_bidi_override", 55961453L)
    Ptrcall.callVoid1(gdext.classes.Label3D.mb_set_structured_text_bidi_override, livePtr, parser)
  }

  /** Label3D.get_structured_text_bidi_override */
  final def getStructuredTextBidiOverride(): Long = {
    if (gdext.classes.Label3D.mb_get_structured_text_bidi_override == null) gdext.classes.Label3D.mb_get_structured_text_bidi_override = MethodBind.get("Label3D", "get_structured_text_bidi_override", 3385126229L)
    Ptrcall.call0[Long](gdext.classes.Label3D.mb_get_structured_text_bidi_override, livePtr)
  }

  /** Label3D.set_uppercase */
  final def setUppercase(enable: Boolean): Unit = {
    if (gdext.classes.Label3D.mb_set_uppercase == null) gdext.classes.Label3D.mb_set_uppercase = MethodBind.get("Label3D", "set_uppercase", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Label3D.mb_set_uppercase, livePtr, enable)
  }

  /** Label3D.is_uppercase */
  final def isUppercase(): Boolean = {
    if (gdext.classes.Label3D.mb_is_uppercase == null) gdext.classes.Label3D.mb_is_uppercase = MethodBind.get("Label3D", "is_uppercase", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Label3D.mb_is_uppercase, livePtr)
  }

  /** Label3D.set_render_priority */
  final def setRenderPriority(priority: Long): Unit = {
    if (gdext.classes.Label3D.mb_set_render_priority == null) gdext.classes.Label3D.mb_set_render_priority = MethodBind.get("Label3D", "set_render_priority", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Label3D.mb_set_render_priority, livePtr, priority)
  }

  /** Label3D.get_render_priority */
  final def getRenderPriority(): Long = {
    if (gdext.classes.Label3D.mb_get_render_priority == null) gdext.classes.Label3D.mb_get_render_priority = MethodBind.get("Label3D", "get_render_priority", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Label3D.mb_get_render_priority, livePtr)
  }

  /** Label3D.set_outline_render_priority */
  final def setOutlineRenderPriority(priority: Long): Unit = {
    if (gdext.classes.Label3D.mb_set_outline_render_priority == null) gdext.classes.Label3D.mb_set_outline_render_priority = MethodBind.get("Label3D", "set_outline_render_priority", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Label3D.mb_set_outline_render_priority, livePtr, priority)
  }

  /** Label3D.get_outline_render_priority */
  final def getOutlineRenderPriority(): Long = {
    if (gdext.classes.Label3D.mb_get_outline_render_priority == null) gdext.classes.Label3D.mb_get_outline_render_priority = MethodBind.get("Label3D", "get_outline_render_priority", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Label3D.mb_get_outline_render_priority, livePtr)
  }

  /** Label3D.set_font */
  final def setFont(font: Font): Unit = {
    if (gdext.classes.Label3D.mb_set_font == null) gdext.classes.Label3D.mb_set_font = MethodBind.get("Label3D", "set_font", 1262170328L)
    Ptrcall.callVoid1(gdext.classes.Label3D.mb_set_font, livePtr, Wrappers.handle(font))
  }

  /** Label3D.get_font. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getFont(): Font = {
    if (gdext.classes.Label3D.mb_get_font == null) gdext.classes.Label3D.mb_get_font = MethodBind.get("Label3D", "get_font", 3229501585L)
    Wrappers.owned[Font](Ptrcall.call0[Long](gdext.classes.Label3D.mb_get_font, livePtr))
  }

  /** Label3D.set_font_size */
  final def setFontSize(size: Long): Unit = {
    if (gdext.classes.Label3D.mb_set_font_size == null) gdext.classes.Label3D.mb_set_font_size = MethodBind.get("Label3D", "set_font_size", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Label3D.mb_set_font_size, livePtr, size)
  }

  /** Label3D.get_font_size */
  final def getFontSize(): Long = {
    if (gdext.classes.Label3D.mb_get_font_size == null) gdext.classes.Label3D.mb_get_font_size = MethodBind.get("Label3D", "get_font_size", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Label3D.mb_get_font_size, livePtr)
  }

  /** Label3D.set_outline_size */
  final def setOutlineSize(outline_size: Long): Unit = {
    if (gdext.classes.Label3D.mb_set_outline_size == null) gdext.classes.Label3D.mb_set_outline_size = MethodBind.get("Label3D", "set_outline_size", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Label3D.mb_set_outline_size, livePtr, outline_size)
  }

  /** Label3D.get_outline_size */
  final def getOutlineSize(): Long = {
    if (gdext.classes.Label3D.mb_get_outline_size == null) gdext.classes.Label3D.mb_get_outline_size = MethodBind.get("Label3D", "get_outline_size", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Label3D.mb_get_outline_size, livePtr)
  }

  /** Label3D.set_line_spacing */
  final def setLineSpacing(line_spacing: Double): Unit = {
    if (gdext.classes.Label3D.mb_set_line_spacing == null) gdext.classes.Label3D.mb_set_line_spacing = MethodBind.get("Label3D", "set_line_spacing", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Label3D.mb_set_line_spacing, livePtr, line_spacing)
  }

  /** Label3D.get_line_spacing */
  final def getLineSpacing(): Double = {
    if (gdext.classes.Label3D.mb_get_line_spacing == null) gdext.classes.Label3D.mb_get_line_spacing = MethodBind.get("Label3D", "get_line_spacing", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Label3D.mb_get_line_spacing, livePtr)
  }

  /** Label3D.set_autowrap_mode */
  final def setAutowrapMode(autowrap_mode: Long): Unit = {
    if (gdext.classes.Label3D.mb_set_autowrap_mode == null) gdext.classes.Label3D.mb_set_autowrap_mode = MethodBind.get("Label3D", "set_autowrap_mode", 3289138044L)
    Ptrcall.callVoid1(gdext.classes.Label3D.mb_set_autowrap_mode, livePtr, autowrap_mode)
  }

  /** Label3D.get_autowrap_mode */
  final def getAutowrapMode(): Long = {
    if (gdext.classes.Label3D.mb_get_autowrap_mode == null) gdext.classes.Label3D.mb_get_autowrap_mode = MethodBind.get("Label3D", "get_autowrap_mode", 1549071663L)
    Ptrcall.call0[Long](gdext.classes.Label3D.mb_get_autowrap_mode, livePtr)
  }

  /** Label3D.set_autowrap_trim_flags */
  final def setAutowrapTrimFlags(autowrap_trim_flags: Long): Unit = {
    if (gdext.classes.Label3D.mb_set_autowrap_trim_flags == null) gdext.classes.Label3D.mb_set_autowrap_trim_flags = MethodBind.get("Label3D", "set_autowrap_trim_flags", 2809697122L)
    Ptrcall.callVoid1(gdext.classes.Label3D.mb_set_autowrap_trim_flags, livePtr, autowrap_trim_flags)
  }

  /** Label3D.get_autowrap_trim_flags */
  final def getAutowrapTrimFlags(): Long = {
    if (gdext.classes.Label3D.mb_get_autowrap_trim_flags == null) gdext.classes.Label3D.mb_get_autowrap_trim_flags = MethodBind.get("Label3D", "get_autowrap_trim_flags", 2340632602L)
    Ptrcall.call0[Long](gdext.classes.Label3D.mb_get_autowrap_trim_flags, livePtr)
  }

  /** Label3D.set_justification_flags */
  final def setJustificationFlags(justification_flags: Long): Unit = {
    if (gdext.classes.Label3D.mb_set_justification_flags == null) gdext.classes.Label3D.mb_set_justification_flags = MethodBind.get("Label3D", "set_justification_flags", 2877345813L)
    Ptrcall.callVoid1(gdext.classes.Label3D.mb_set_justification_flags, livePtr, justification_flags)
  }

  /** Label3D.get_justification_flags */
  final def getJustificationFlags(): Long = {
    if (gdext.classes.Label3D.mb_get_justification_flags == null) gdext.classes.Label3D.mb_get_justification_flags = MethodBind.get("Label3D", "get_justification_flags", 1583363614L)
    Ptrcall.call0[Long](gdext.classes.Label3D.mb_get_justification_flags, livePtr)
  }

  /** Label3D.set_width */
  final def setWidth(width: Double): Unit = {
    if (gdext.classes.Label3D.mb_set_width == null) gdext.classes.Label3D.mb_set_width = MethodBind.get("Label3D", "set_width", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Label3D.mb_set_width, livePtr, width)
  }

  /** Label3D.get_width */
  final def getWidth(): Double = {
    if (gdext.classes.Label3D.mb_get_width == null) gdext.classes.Label3D.mb_get_width = MethodBind.get("Label3D", "get_width", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Label3D.mb_get_width, livePtr)
  }

  /** Label3D.set_pixel_size */
  final def setPixelSize(pixel_size: Double): Unit = {
    if (gdext.classes.Label3D.mb_set_pixel_size == null) gdext.classes.Label3D.mb_set_pixel_size = MethodBind.get("Label3D", "set_pixel_size", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Label3D.mb_set_pixel_size, livePtr, pixel_size)
  }

  /** Label3D.get_pixel_size */
  final def getPixelSize(): Double = {
    if (gdext.classes.Label3D.mb_get_pixel_size == null) gdext.classes.Label3D.mb_get_pixel_size = MethodBind.get("Label3D", "get_pixel_size", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Label3D.mb_get_pixel_size, livePtr)
  }

  /** Label3D.set_offset */
  final def setOffset(offset: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.Label3D.mb_set_offset == null) gdext.classes.Label3D.mb_set_offset = MethodBind.get("Label3D", "set_offset", 743155724L)
    Ptrcall.callVoid1(gdext.classes.Label3D.mb_set_offset, livePtr, offset)
  }

  /** Label3D.get_offset */
  final def getOffset(): gdext.builtin.Vector2 = {
    if (gdext.classes.Label3D.mb_get_offset == null) gdext.classes.Label3D.mb_get_offset = MethodBind.get("Label3D", "get_offset", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.Label3D.mb_get_offset, livePtr)
  }

  /** Label3D.set_draw_flag */
  final def setDrawFlag(flag: Long, enabled: Boolean): Unit = {
    if (gdext.classes.Label3D.mb_set_draw_flag == null) gdext.classes.Label3D.mb_set_draw_flag = MethodBind.get("Label3D", "set_draw_flag", 1285833066L)
    Ptrcall.callVoid2(gdext.classes.Label3D.mb_set_draw_flag, livePtr, flag, enabled)
  }

  /** Label3D.get_draw_flag */
  final def getDrawFlag(flag: Long): Boolean = {
    if (gdext.classes.Label3D.mb_get_draw_flag == null) gdext.classes.Label3D.mb_get_draw_flag = MethodBind.get("Label3D", "get_draw_flag", 259226453L)
    Ptrcall.call1[Long, Boolean](gdext.classes.Label3D.mb_get_draw_flag, livePtr, flag)
  }

  /** Label3D.set_billboard_mode */
  final def setBillboardMode(mode: Long): Unit = {
    if (gdext.classes.Label3D.mb_set_billboard_mode == null) gdext.classes.Label3D.mb_set_billboard_mode = MethodBind.get("Label3D", "set_billboard_mode", 4202036497L)
    Ptrcall.callVoid1(gdext.classes.Label3D.mb_set_billboard_mode, livePtr, mode)
  }

  /** Label3D.get_billboard_mode */
  final def getBillboardMode(): Long = {
    if (gdext.classes.Label3D.mb_get_billboard_mode == null) gdext.classes.Label3D.mb_get_billboard_mode = MethodBind.get("Label3D", "get_billboard_mode", 1283840139L)
    Ptrcall.call0[Long](gdext.classes.Label3D.mb_get_billboard_mode, livePtr)
  }

  /** Label3D.set_alpha_cut_mode */
  final def setAlphaCutMode(mode: Long): Unit = {
    if (gdext.classes.Label3D.mb_set_alpha_cut_mode == null) gdext.classes.Label3D.mb_set_alpha_cut_mode = MethodBind.get("Label3D", "set_alpha_cut_mode", 2549142916L)
    Ptrcall.callVoid1(gdext.classes.Label3D.mb_set_alpha_cut_mode, livePtr, mode)
  }

  /** Label3D.get_alpha_cut_mode */
  final def getAlphaCutMode(): Long = {
    if (gdext.classes.Label3D.mb_get_alpha_cut_mode == null) gdext.classes.Label3D.mb_get_alpha_cut_mode = MethodBind.get("Label3D", "get_alpha_cut_mode", 219468601L)
    Ptrcall.call0[Long](gdext.classes.Label3D.mb_get_alpha_cut_mode, livePtr)
  }

  /** Label3D.set_alpha_scissor_threshold */
  final def setAlphaScissorThreshold(threshold: Double): Unit = {
    if (gdext.classes.Label3D.mb_set_alpha_scissor_threshold == null) gdext.classes.Label3D.mb_set_alpha_scissor_threshold = MethodBind.get("Label3D", "set_alpha_scissor_threshold", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Label3D.mb_set_alpha_scissor_threshold, livePtr, threshold)
  }

  /** Label3D.get_alpha_scissor_threshold */
  final def getAlphaScissorThreshold(): Double = {
    if (gdext.classes.Label3D.mb_get_alpha_scissor_threshold == null) gdext.classes.Label3D.mb_get_alpha_scissor_threshold = MethodBind.get("Label3D", "get_alpha_scissor_threshold", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Label3D.mb_get_alpha_scissor_threshold, livePtr)
  }

  /** Label3D.set_alpha_hash_scale */
  final def setAlphaHashScale(threshold: Double): Unit = {
    if (gdext.classes.Label3D.mb_set_alpha_hash_scale == null) gdext.classes.Label3D.mb_set_alpha_hash_scale = MethodBind.get("Label3D", "set_alpha_hash_scale", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Label3D.mb_set_alpha_hash_scale, livePtr, threshold)
  }

  /** Label3D.get_alpha_hash_scale */
  final def getAlphaHashScale(): Double = {
    if (gdext.classes.Label3D.mb_get_alpha_hash_scale == null) gdext.classes.Label3D.mb_get_alpha_hash_scale = MethodBind.get("Label3D", "get_alpha_hash_scale", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Label3D.mb_get_alpha_hash_scale, livePtr)
  }

  /** Label3D.set_alpha_antialiasing */
  final def setAlphaAntialiasing(alpha_aa: Long): Unit = {
    if (gdext.classes.Label3D.mb_set_alpha_antialiasing == null) gdext.classes.Label3D.mb_set_alpha_antialiasing = MethodBind.get("Label3D", "set_alpha_antialiasing", 3212649852L)
    Ptrcall.callVoid1(gdext.classes.Label3D.mb_set_alpha_antialiasing, livePtr, alpha_aa)
  }

  /** Label3D.get_alpha_antialiasing */
  final def getAlphaAntialiasing(): Long = {
    if (gdext.classes.Label3D.mb_get_alpha_antialiasing == null) gdext.classes.Label3D.mb_get_alpha_antialiasing = MethodBind.get("Label3D", "get_alpha_antialiasing", 2889939400L)
    Ptrcall.call0[Long](gdext.classes.Label3D.mb_get_alpha_antialiasing, livePtr)
  }

  /** Label3D.set_alpha_antialiasing_edge */
  final def setAlphaAntialiasingEdge(edge: Double): Unit = {
    if (gdext.classes.Label3D.mb_set_alpha_antialiasing_edge == null) gdext.classes.Label3D.mb_set_alpha_antialiasing_edge = MethodBind.get("Label3D", "set_alpha_antialiasing_edge", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Label3D.mb_set_alpha_antialiasing_edge, livePtr, edge)
  }

  /** Label3D.get_alpha_antialiasing_edge */
  final def getAlphaAntialiasingEdge(): Double = {
    if (gdext.classes.Label3D.mb_get_alpha_antialiasing_edge == null) gdext.classes.Label3D.mb_get_alpha_antialiasing_edge = MethodBind.get("Label3D", "get_alpha_antialiasing_edge", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Label3D.mb_get_alpha_antialiasing_edge, livePtr)
  }

  /** Label3D.set_texture_filter */
  final def setTextureFilter(mode: Long): Unit = {
    if (gdext.classes.Label3D.mb_set_texture_filter == null) gdext.classes.Label3D.mb_set_texture_filter = MethodBind.get("Label3D", "set_texture_filter", 22904437L)
    Ptrcall.callVoid1(gdext.classes.Label3D.mb_set_texture_filter, livePtr, mode)
  }

  /** Label3D.get_texture_filter */
  final def getTextureFilter(): Long = {
    if (gdext.classes.Label3D.mb_get_texture_filter == null) gdext.classes.Label3D.mb_get_texture_filter = MethodBind.get("Label3D", "get_texture_filter", 3289213076L)
    Ptrcall.call0[Long](gdext.classes.Label3D.mb_get_texture_filter, livePtr)
  }

  /** Label3D.generate_triangle_mesh. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def generateTriangleMesh(): TriangleMesh = {
    if (gdext.classes.Label3D.mb_generate_triangle_mesh == null) gdext.classes.Label3D.mb_generate_triangle_mesh = MethodBind.get("Label3D", "generate_triangle_mesh", 3476533166L)
    Wrappers.owned[TriangleMesh](Ptrcall.call0[Long](gdext.classes.Label3D.mb_generate_triangle_mesh, livePtr))
  }

}

object Label3D {
  private[classes] var mb_set_horizontal_alignment: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_horizontal_alignment: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_vertical_alignment: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_vertical_alignment: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_modulate: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_modulate: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_outline_modulate: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_outline_modulate: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_text: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_text: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_text_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_text_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_language: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_language: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_structured_text_bidi_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_structured_text_bidi_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_uppercase: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_uppercase: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_render_priority: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_render_priority: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_outline_render_priority: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_outline_render_priority: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_font: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_font: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_font_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_font_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_outline_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_outline_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_line_spacing: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_line_spacing: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_autowrap_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_autowrap_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_autowrap_trim_flags: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_autowrap_trim_flags: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_justification_flags: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_justification_flags: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_pixel_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_pixel_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_draw_flag: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_draw_flag: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_billboard_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_billboard_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_alpha_cut_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_alpha_cut_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_alpha_scissor_threshold: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_alpha_scissor_threshold: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_alpha_hash_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_alpha_hash_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_alpha_antialiasing: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_alpha_antialiasing: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_alpha_antialiasing_edge: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_alpha_antialiasing_edge: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_texture_filter: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture_filter: GDExtensionMethodBindPtr = null
  private[classes] var mb_generate_triangle_mesh: GDExtensionMethodBindPtr = null
}
