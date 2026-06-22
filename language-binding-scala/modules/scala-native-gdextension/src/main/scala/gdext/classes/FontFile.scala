package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `FontFile`, extends `Font`. */
abstract class FontFile extends Font {

  /** FontFile.load_bitmap_font */
  final def loadBitmapFont(path: String): Long =
    Ptrcall.call1[String, Long](MethodBind.get("FontFile", "load_bitmap_font", 166001499L), hostObject.objectPtr, path)

  /** FontFile.load_dynamic_font */
  final def loadDynamicFont(path: String): Long =
    Ptrcall.call1[String, Long](MethodBind.get("FontFile", "load_dynamic_font", 166001499L), hostObject.objectPtr, path)

  /** FontFile.set_font_name */
  final def setFontName(name: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("FontFile", "set_font_name", 83702148L), hostObject.objectPtr, name)

  /** FontFile.set_font_style_name */
  final def setFontStyleName(name: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("FontFile", "set_font_style_name", 83702148L), hostObject.objectPtr, name)

  /** FontFile.set_font_style */
  final def setFontStyle(style: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("FontFile", "set_font_style", 918070724L), hostObject.objectPtr, style)

  /** FontFile.set_font_weight */
  final def setFontWeight(weight: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("FontFile", "set_font_weight", 1286410249L), hostObject.objectPtr, weight)

  /** FontFile.set_font_stretch */
  final def setFontStretch(stretch: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("FontFile", "set_font_stretch", 1286410249L), hostObject.objectPtr, stretch)

  /** FontFile.set_antialiasing */
  final def setAntialiasing(antialiasing: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("FontFile", "set_antialiasing", 1669900L), hostObject.objectPtr, antialiasing)

  /** FontFile.get_antialiasing */
  final def getAntialiasing(): Long =
    Ptrcall.call0[Long](MethodBind.get("FontFile", "get_antialiasing", 4262718649L), hostObject.objectPtr)

  /** FontFile.set_disable_embedded_bitmaps */
  final def setDisableEmbeddedBitmaps(disable_embedded_bitmaps: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("FontFile", "set_disable_embedded_bitmaps", 2586408642L), hostObject.objectPtr, disable_embedded_bitmaps)

  /** FontFile.get_disable_embedded_bitmaps */
  final def getDisableEmbeddedBitmaps(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("FontFile", "get_disable_embedded_bitmaps", 36873697L), hostObject.objectPtr)

  /** FontFile.set_generate_mipmaps */
  final def setGenerateMipmaps(generate_mipmaps: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("FontFile", "set_generate_mipmaps", 2586408642L), hostObject.objectPtr, generate_mipmaps)

  /** FontFile.get_generate_mipmaps */
  final def getGenerateMipmaps(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("FontFile", "get_generate_mipmaps", 36873697L), hostObject.objectPtr)

  /** FontFile.set_multichannel_signed_distance_field */
  final def setMultichannelSignedDistanceField(msdf: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("FontFile", "set_multichannel_signed_distance_field", 2586408642L), hostObject.objectPtr, msdf)

  /** FontFile.is_multichannel_signed_distance_field */
  final def isMultichannelSignedDistanceField(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("FontFile", "is_multichannel_signed_distance_field", 36873697L), hostObject.objectPtr)

  /** FontFile.set_msdf_pixel_range */
  final def setMsdfPixelRange(msdf_pixel_range: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("FontFile", "set_msdf_pixel_range", 1286410249L), hostObject.objectPtr, msdf_pixel_range)

  /** FontFile.get_msdf_pixel_range */
  final def getMsdfPixelRange(): Long =
    Ptrcall.call0[Long](MethodBind.get("FontFile", "get_msdf_pixel_range", 3905245786L), hostObject.objectPtr)

  /** FontFile.set_msdf_size */
  final def setMsdfSize(msdf_size: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("FontFile", "set_msdf_size", 1286410249L), hostObject.objectPtr, msdf_size)

  /** FontFile.get_msdf_size */
  final def getMsdfSize(): Long =
    Ptrcall.call0[Long](MethodBind.get("FontFile", "get_msdf_size", 3905245786L), hostObject.objectPtr)

  /** FontFile.set_fixed_size */
  final def setFixedSize(fixed_size: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("FontFile", "set_fixed_size", 1286410249L), hostObject.objectPtr, fixed_size)

  /** FontFile.get_fixed_size */
  final def getFixedSize(): Long =
    Ptrcall.call0[Long](MethodBind.get("FontFile", "get_fixed_size", 3905245786L), hostObject.objectPtr)

  /** FontFile.set_fixed_size_scale_mode */
  final def setFixedSizeScaleMode(fixed_size_scale_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("FontFile", "set_fixed_size_scale_mode", 1660989956L), hostObject.objectPtr, fixed_size_scale_mode)

  /** FontFile.get_fixed_size_scale_mode */
  final def getFixedSizeScaleMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("FontFile", "get_fixed_size_scale_mode", 753873478L), hostObject.objectPtr)

  /** FontFile.set_allow_system_fallback */
  final def setAllowSystemFallback(allow_system_fallback: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("FontFile", "set_allow_system_fallback", 2586408642L), hostObject.objectPtr, allow_system_fallback)

  /** FontFile.is_allow_system_fallback */
  final def isAllowSystemFallback(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("FontFile", "is_allow_system_fallback", 36873697L), hostObject.objectPtr)

  /** FontFile.set_force_autohinter */
  final def setForceAutohinter(force_autohinter: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("FontFile", "set_force_autohinter", 2586408642L), hostObject.objectPtr, force_autohinter)

  /** FontFile.is_force_autohinter */
  final def isForceAutohinter(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("FontFile", "is_force_autohinter", 36873697L), hostObject.objectPtr)

  /** FontFile.set_modulate_color_glyphs */
  final def setModulateColorGlyphs(modulate: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("FontFile", "set_modulate_color_glyphs", 2586408642L), hostObject.objectPtr, modulate)

  /** FontFile.is_modulate_color_glyphs */
  final def isModulateColorGlyphs(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("FontFile", "is_modulate_color_glyphs", 36873697L), hostObject.objectPtr)

  /** FontFile.set_hinting */
  final def setHinting(hinting: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("FontFile", "set_hinting", 1827459492L), hostObject.objectPtr, hinting)

  /** FontFile.get_hinting */
  final def getHinting(): Long =
    Ptrcall.call0[Long](MethodBind.get("FontFile", "get_hinting", 3683214614L), hostObject.objectPtr)

  /** FontFile.set_subpixel_positioning */
  final def setSubpixelPositioning(subpixel_positioning: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("FontFile", "set_subpixel_positioning", 4225742182L), hostObject.objectPtr, subpixel_positioning)

  /** FontFile.get_subpixel_positioning */
  final def getSubpixelPositioning(): Long =
    Ptrcall.call0[Long](MethodBind.get("FontFile", "get_subpixel_positioning", 1069238588L), hostObject.objectPtr)

  /** FontFile.set_keep_rounding_remainders */
  final def setKeepRoundingRemainders(keep_rounding_remainders: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("FontFile", "set_keep_rounding_remainders", 2586408642L), hostObject.objectPtr, keep_rounding_remainders)

  /** FontFile.get_keep_rounding_remainders */
  final def getKeepRoundingRemainders(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("FontFile", "get_keep_rounding_remainders", 36873697L), hostObject.objectPtr)

  /** FontFile.set_oversampling */
  final def setOversampling(oversampling: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("FontFile", "set_oversampling", 373806689L), hostObject.objectPtr, oversampling)

  /** FontFile.get_oversampling */
  final def getOversampling(): Double =
    Ptrcall.call0[Double](MethodBind.get("FontFile", "get_oversampling", 1740695150L), hostObject.objectPtr)

  /** FontFile.get_cache_count */
  final def getCacheCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("FontFile", "get_cache_count", 3905245786L), hostObject.objectPtr)

  /** FontFile.clear_cache */
  final def clearCache(): Unit =
    Ptrcall.callVoid0(MethodBind.get("FontFile", "clear_cache", 3218959716L), hostObject.objectPtr)

  /** FontFile.remove_cache */
  final def removeCache(cache_index: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("FontFile", "remove_cache", 1286410249L), hostObject.objectPtr, cache_index)

  /** FontFile.clear_size_cache */
  final def clearSizeCache(cache_index: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("FontFile", "clear_size_cache", 1286410249L), hostObject.objectPtr, cache_index)

  /** FontFile.remove_size_cache */
  final def removeSizeCache(cache_index: Long, size: gdext.builtin.Vector2i): Unit =
    Ptrcall.callVoid2(MethodBind.get("FontFile", "remove_size_cache", 2311374912L), hostObject.objectPtr, cache_index, size)

  /** FontFile.set_embolden */
  final def setEmbolden(cache_index: Long, strength: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("FontFile", "set_embolden", 1602489585L), hostObject.objectPtr, cache_index, strength)

  /** FontFile.get_embolden */
  final def getEmbolden(cache_index: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("FontFile", "get_embolden", 2339986948L), hostObject.objectPtr, cache_index)

  /** FontFile.set_transform */
  final def setTransform(cache_index: Long, transform: gdext.builtin.Transform2D): Unit =
    Ptrcall.callVoid2(MethodBind.get("FontFile", "set_transform", 30160968L), hostObject.objectPtr, cache_index, transform)

  /** FontFile.get_transform */
  final def getTransform(cache_index: Long): gdext.builtin.Transform2D =
    Ptrcall.call1[Long, gdext.builtin.Transform2D](MethodBind.get("FontFile", "get_transform", 3836996910L), hostObject.objectPtr, cache_index)

  /** FontFile.set_extra_spacing */
  final def setExtraSpacing(cache_index: Long, spacing: Long, value: Long): Unit =
    Ptrcall.callVoid3(MethodBind.get("FontFile", "set_extra_spacing", 62942285L), hostObject.objectPtr, cache_index, spacing, value)

  /** FontFile.get_extra_spacing */
  final def getExtraSpacing(cache_index: Long, spacing: Long): Long =
    Ptrcall.call2[Long, Long, Long](MethodBind.get("FontFile", "get_extra_spacing", 1924257185L), hostObject.objectPtr, cache_index, spacing)

  /** FontFile.set_extra_baseline_offset */
  final def setExtraBaselineOffset(cache_index: Long, baseline_offset: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("FontFile", "set_extra_baseline_offset", 1602489585L), hostObject.objectPtr, cache_index, baseline_offset)

  /** FontFile.get_extra_baseline_offset */
  final def getExtraBaselineOffset(cache_index: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("FontFile", "get_extra_baseline_offset", 2339986948L), hostObject.objectPtr, cache_index)

  /** FontFile.set_face_index */
  final def setFaceIndex(cache_index: Long, face_index: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("FontFile", "set_face_index", 3937882851L), hostObject.objectPtr, cache_index, face_index)

  /** FontFile.get_face_index */
  final def getFaceIndex(cache_index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("FontFile", "get_face_index", 923996154L), hostObject.objectPtr, cache_index)

  /** FontFile.set_cache_ascent */
  final def setCacheAscent(cache_index: Long, size: Long, ascent: Double): Unit =
    Ptrcall.callVoid3(MethodBind.get("FontFile", "set_cache_ascent", 3506521499L), hostObject.objectPtr, cache_index, size, ascent)

  /** FontFile.get_cache_ascent */
  final def getCacheAscent(cache_index: Long, size: Long): Double =
    Ptrcall.call2[Long, Long, Double](MethodBind.get("FontFile", "get_cache_ascent", 3085491603L), hostObject.objectPtr, cache_index, size)

  /** FontFile.set_cache_descent */
  final def setCacheDescent(cache_index: Long, size: Long, descent: Double): Unit =
    Ptrcall.callVoid3(MethodBind.get("FontFile", "set_cache_descent", 3506521499L), hostObject.objectPtr, cache_index, size, descent)

  /** FontFile.get_cache_descent */
  final def getCacheDescent(cache_index: Long, size: Long): Double =
    Ptrcall.call2[Long, Long, Double](MethodBind.get("FontFile", "get_cache_descent", 3085491603L), hostObject.objectPtr, cache_index, size)

  /** FontFile.set_cache_underline_position */
  final def setCacheUnderlinePosition(cache_index: Long, size: Long, underline_position: Double): Unit =
    Ptrcall.callVoid3(MethodBind.get("FontFile", "set_cache_underline_position", 3506521499L), hostObject.objectPtr, cache_index, size, underline_position)

  /** FontFile.get_cache_underline_position */
  final def getCacheUnderlinePosition(cache_index: Long, size: Long): Double =
    Ptrcall.call2[Long, Long, Double](MethodBind.get("FontFile", "get_cache_underline_position", 3085491603L), hostObject.objectPtr, cache_index, size)

  /** FontFile.set_cache_underline_thickness */
  final def setCacheUnderlineThickness(cache_index: Long, size: Long, underline_thickness: Double): Unit =
    Ptrcall.callVoid3(MethodBind.get("FontFile", "set_cache_underline_thickness", 3506521499L), hostObject.objectPtr, cache_index, size, underline_thickness)

  /** FontFile.get_cache_underline_thickness */
  final def getCacheUnderlineThickness(cache_index: Long, size: Long): Double =
    Ptrcall.call2[Long, Long, Double](MethodBind.get("FontFile", "get_cache_underline_thickness", 3085491603L), hostObject.objectPtr, cache_index, size)

  /** FontFile.set_cache_scale */
  final def setCacheScale(cache_index: Long, size: Long, scale: Double): Unit =
    Ptrcall.callVoid3(MethodBind.get("FontFile", "set_cache_scale", 3506521499L), hostObject.objectPtr, cache_index, size, scale)

  /** FontFile.get_cache_scale */
  final def getCacheScale(cache_index: Long, size: Long): Double =
    Ptrcall.call2[Long, Long, Double](MethodBind.get("FontFile", "get_cache_scale", 3085491603L), hostObject.objectPtr, cache_index, size)

  /** FontFile.get_texture_count */
  final def getTextureCount(cache_index: Long, size: gdext.builtin.Vector2i): Long =
    Ptrcall.call2[Long, gdext.builtin.Vector2i, Long](MethodBind.get("FontFile", "get_texture_count", 1987661582L), hostObject.objectPtr, cache_index, size)

  /** FontFile.clear_textures */
  final def clearTextures(cache_index: Long, size: gdext.builtin.Vector2i): Unit =
    Ptrcall.callVoid2(MethodBind.get("FontFile", "clear_textures", 2311374912L), hostObject.objectPtr, cache_index, size)

  /** FontFile.remove_texture */
  final def removeTexture(cache_index: Long, size: gdext.builtin.Vector2i, texture_index: Long): Unit =
    Ptrcall.callVoid3(MethodBind.get("FontFile", "remove_texture", 2328951467L), hostObject.objectPtr, cache_index, size, texture_index)

  /** FontFile.set_texture_image */
  final def setTextureImage(cache_index: Long, size: gdext.builtin.Vector2i, texture_index: Long, image: Image): Unit =
    Ptrcall.callVoid4(MethodBind.get("FontFile", "set_texture_image", 4157974066L), hostObject.objectPtr, cache_index, size, texture_index, image.hostObject)

  /** FontFile.get_texture_image */
  final def getTextureImage(cache_index: Long, size: gdext.builtin.Vector2i, texture_index: Long): GodotObject =
    Ptrcall.call3[Long, gdext.builtin.Vector2i, Long, GodotObject](MethodBind.get("FontFile", "get_texture_image", 3878418953L), hostObject.objectPtr, cache_index, size, texture_index)

  /** FontFile.clear_glyphs */
  final def clearGlyphs(cache_index: Long, size: gdext.builtin.Vector2i): Unit =
    Ptrcall.callVoid2(MethodBind.get("FontFile", "clear_glyphs", 2311374912L), hostObject.objectPtr, cache_index, size)

  /** FontFile.remove_glyph */
  final def removeGlyph(cache_index: Long, size: gdext.builtin.Vector2i, glyph: Long): Unit =
    Ptrcall.callVoid3(MethodBind.get("FontFile", "remove_glyph", 2328951467L), hostObject.objectPtr, cache_index, size, glyph)

  /** FontFile.set_glyph_advance */
  final def setGlyphAdvance(cache_index: Long, size: Long, glyph: Long, advance: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid4(MethodBind.get("FontFile", "set_glyph_advance", 947991729L), hostObject.objectPtr, cache_index, size, glyph, advance)

  /** FontFile.get_glyph_advance */
  final def getGlyphAdvance(cache_index: Long, size: Long, glyph: Long): gdext.builtin.Vector2 =
    Ptrcall.call3[Long, Long, Long, gdext.builtin.Vector2](MethodBind.get("FontFile", "get_glyph_advance", 1601573536L), hostObject.objectPtr, cache_index, size, glyph)

  /** FontFile.set_glyph_offset */
  final def setGlyphOffset(cache_index: Long, size: gdext.builtin.Vector2i, glyph: Long, offset: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid4(MethodBind.get("FontFile", "set_glyph_offset", 921719850L), hostObject.objectPtr, cache_index, size, glyph, offset)

  /** FontFile.get_glyph_offset */
  final def getGlyphOffset(cache_index: Long, size: gdext.builtin.Vector2i, glyph: Long): gdext.builtin.Vector2 =
    Ptrcall.call3[Long, gdext.builtin.Vector2i, Long, gdext.builtin.Vector2](MethodBind.get("FontFile", "get_glyph_offset", 3205412300L), hostObject.objectPtr, cache_index, size, glyph)

  /** FontFile.set_glyph_size */
  final def setGlyphSize(cache_index: Long, size: gdext.builtin.Vector2i, glyph: Long, gl_size: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid4(MethodBind.get("FontFile", "set_glyph_size", 921719850L), hostObject.objectPtr, cache_index, size, glyph, gl_size)

  /** FontFile.get_glyph_size */
  final def getGlyphSize(cache_index: Long, size: gdext.builtin.Vector2i, glyph: Long): gdext.builtin.Vector2 =
    Ptrcall.call3[Long, gdext.builtin.Vector2i, Long, gdext.builtin.Vector2](MethodBind.get("FontFile", "get_glyph_size", 3205412300L), hostObject.objectPtr, cache_index, size, glyph)

  /** FontFile.set_glyph_uv_rect */
  final def setGlyphUvRect(cache_index: Long, size: gdext.builtin.Vector2i, glyph: Long, uv_rect: gdext.builtin.Rect2): Unit =
    Ptrcall.callVoid4(MethodBind.get("FontFile", "set_glyph_uv_rect", 3821620992L), hostObject.objectPtr, cache_index, size, glyph, uv_rect)

  /** FontFile.get_glyph_uv_rect */
  final def getGlyphUvRect(cache_index: Long, size: gdext.builtin.Vector2i, glyph: Long): gdext.builtin.Rect2 =
    Ptrcall.call3[Long, gdext.builtin.Vector2i, Long, gdext.builtin.Rect2](MethodBind.get("FontFile", "get_glyph_uv_rect", 3927917900L), hostObject.objectPtr, cache_index, size, glyph)

  /** FontFile.set_glyph_texture_idx */
  final def setGlyphTextureIdx(cache_index: Long, size: gdext.builtin.Vector2i, glyph: Long, texture_idx: Long): Unit =
    Ptrcall.callVoid4(MethodBind.get("FontFile", "set_glyph_texture_idx", 355564111L), hostObject.objectPtr, cache_index, size, glyph, texture_idx)

  /** FontFile.get_glyph_texture_idx */
  final def getGlyphTextureIdx(cache_index: Long, size: gdext.builtin.Vector2i, glyph: Long): Long =
    Ptrcall.call3[Long, gdext.builtin.Vector2i, Long, Long](MethodBind.get("FontFile", "get_glyph_texture_idx", 1629411054L), hostObject.objectPtr, cache_index, size, glyph)

  /** FontFile.clear_kerning_map */
  final def clearKerningMap(cache_index: Long, size: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("FontFile", "clear_kerning_map", 3937882851L), hostObject.objectPtr, cache_index, size)

  /** FontFile.remove_kerning */
  final def removeKerning(cache_index: Long, size: Long, glyph_pair: gdext.builtin.Vector2i): Unit =
    Ptrcall.callVoid3(MethodBind.get("FontFile", "remove_kerning", 3930204747L), hostObject.objectPtr, cache_index, size, glyph_pair)

  /** FontFile.set_kerning */
  final def setKerning(cache_index: Long, size: Long, glyph_pair: gdext.builtin.Vector2i, kerning: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid4(MethodBind.get("FontFile", "set_kerning", 3182200918L), hostObject.objectPtr, cache_index, size, glyph_pair, kerning)

  /** FontFile.get_kerning */
  final def getKerning(cache_index: Long, size: Long, glyph_pair: gdext.builtin.Vector2i): gdext.builtin.Vector2 =
    Ptrcall.call3[Long, Long, gdext.builtin.Vector2i, gdext.builtin.Vector2](MethodBind.get("FontFile", "get_kerning", 1611912865L), hostObject.objectPtr, cache_index, size, glyph_pair)

  /** FontFile.render_range */
  final def renderRange(cache_index: Long, size: gdext.builtin.Vector2i, start: Long, end: Long): Unit =
    Ptrcall.callVoid4(MethodBind.get("FontFile", "render_range", 355564111L), hostObject.objectPtr, cache_index, size, start, end)

  /** FontFile.render_glyph */
  final def renderGlyph(cache_index: Long, size: gdext.builtin.Vector2i, index: Long): Unit =
    Ptrcall.callVoid3(MethodBind.get("FontFile", "render_glyph", 2328951467L), hostObject.objectPtr, cache_index, size, index)

  /** FontFile.set_language_support_override */
  final def setLanguageSupportOverride(language: String, supported: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("FontFile", "set_language_support_override", 2678287736L), hostObject.objectPtr, language, supported)

  /** FontFile.get_language_support_override */
  final def getLanguageSupportOverride(language: String): Boolean =
    Ptrcall.call1[String, Boolean](MethodBind.get("FontFile", "get_language_support_override", 3927539163L), hostObject.objectPtr, language)

  /** FontFile.remove_language_support_override */
  final def removeLanguageSupportOverride(language: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("FontFile", "remove_language_support_override", 83702148L), hostObject.objectPtr, language)

  /** FontFile.set_script_support_override */
  final def setScriptSupportOverride(script: String, supported: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("FontFile", "set_script_support_override", 2678287736L), hostObject.objectPtr, script, supported)

  /** FontFile.get_script_support_override */
  final def getScriptSupportOverride(script: String): Boolean =
    Ptrcall.call1[String, Boolean](MethodBind.get("FontFile", "get_script_support_override", 3927539163L), hostObject.objectPtr, script)

  /** FontFile.remove_script_support_override */
  final def removeScriptSupportOverride(script: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("FontFile", "remove_script_support_override", 83702148L), hostObject.objectPtr, script)

  /** FontFile.get_glyph_index */
  final def getGlyphIndex(size: Long, char: Long, variation_selector: Long): Long =
    Ptrcall.call3[Long, Long, Long, Long](MethodBind.get("FontFile", "get_glyph_index", 864943070L), hostObject.objectPtr, size, char, variation_selector)

  /** FontFile.get_char_from_glyph_index */
  final def getCharFromGlyphIndex(size: Long, glyph_index: Long): Long =
    Ptrcall.call2[Long, Long, Long](MethodBind.get("FontFile", "get_char_from_glyph_index", 3175239445L), hostObject.objectPtr, size, glyph_index)

}

object FontFile {
  /** Class metadata for Gd[FontFile] lifetime management and casting. */
  given GodotClass[FontFile] with {
    def className = "FontFile"
    def isRefCounted = true
    def wrap(o: GodotObject): FontFile = new FontFile {}.withHost(o.objectPtr)
    def unwrap(t: FontFile): GodotObject = t.hostObject
  }
}
