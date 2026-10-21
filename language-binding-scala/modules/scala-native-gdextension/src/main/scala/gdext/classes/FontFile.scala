package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `FontFile`, extends `Font`. */
abstract class FontFile extends Font {
  override def godotClassName: String = "FontFile"

  /** FontFile.load_bitmap_font */
  final def loadBitmapFont(path: String): Long = {
    if (gdext.classes.FontFile.mb_load_bitmap_font == null) gdext.classes.FontFile.mb_load_bitmap_font = MethodBind.get("FontFile", "load_bitmap_font", 166001499L)
    Ptrcall.call1[String, Long](gdext.classes.FontFile.mb_load_bitmap_font, livePtr, path)
  }

  /** FontFile.load_dynamic_font */
  final def loadDynamicFont(path: String): Long = {
    if (gdext.classes.FontFile.mb_load_dynamic_font == null) gdext.classes.FontFile.mb_load_dynamic_font = MethodBind.get("FontFile", "load_dynamic_font", 166001499L)
    Ptrcall.call1[String, Long](gdext.classes.FontFile.mb_load_dynamic_font, livePtr, path)
  }

  /** FontFile.set_font_name */
  final def setFontName(name: String): Unit = {
    if (gdext.classes.FontFile.mb_set_font_name == null) gdext.classes.FontFile.mb_set_font_name = MethodBind.get("FontFile", "set_font_name", 83702148L)
    Ptrcall.callVoid1(gdext.classes.FontFile.mb_set_font_name, livePtr, name)
  }

  /** FontFile.set_font_style_name */
  final def setFontStyleName(name: String): Unit = {
    if (gdext.classes.FontFile.mb_set_font_style_name == null) gdext.classes.FontFile.mb_set_font_style_name = MethodBind.get("FontFile", "set_font_style_name", 83702148L)
    Ptrcall.callVoid1(gdext.classes.FontFile.mb_set_font_style_name, livePtr, name)
  }

  /** FontFile.set_font_style */
  final def setFontStyle(style: Long): Unit = {
    if (gdext.classes.FontFile.mb_set_font_style == null) gdext.classes.FontFile.mb_set_font_style = MethodBind.get("FontFile", "set_font_style", 918070724L)
    Ptrcall.callVoid1(gdext.classes.FontFile.mb_set_font_style, livePtr, style)
  }

  /** FontFile.set_font_weight */
  final def setFontWeight(weight: Long): Unit = {
    if (gdext.classes.FontFile.mb_set_font_weight == null) gdext.classes.FontFile.mb_set_font_weight = MethodBind.get("FontFile", "set_font_weight", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.FontFile.mb_set_font_weight, livePtr, weight)
  }

  /** FontFile.set_font_stretch */
  final def setFontStretch(stretch: Long): Unit = {
    if (gdext.classes.FontFile.mb_set_font_stretch == null) gdext.classes.FontFile.mb_set_font_stretch = MethodBind.get("FontFile", "set_font_stretch", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.FontFile.mb_set_font_stretch, livePtr, stretch)
  }

  /** FontFile.set_antialiasing */
  final def setAntialiasing(antialiasing: Long): Unit = {
    if (gdext.classes.FontFile.mb_set_antialiasing == null) gdext.classes.FontFile.mb_set_antialiasing = MethodBind.get("FontFile", "set_antialiasing", 1669900L)
    Ptrcall.callVoid1(gdext.classes.FontFile.mb_set_antialiasing, livePtr, antialiasing)
  }

  /** FontFile.get_antialiasing */
  final def getAntialiasing(): Long = {
    if (gdext.classes.FontFile.mb_get_antialiasing == null) gdext.classes.FontFile.mb_get_antialiasing = MethodBind.get("FontFile", "get_antialiasing", 4262718649L)
    Ptrcall.call0[Long](gdext.classes.FontFile.mb_get_antialiasing, livePtr)
  }

  /** FontFile.set_disable_embedded_bitmaps */
  final def setDisableEmbeddedBitmaps(disable_embedded_bitmaps: Boolean): Unit = {
    if (gdext.classes.FontFile.mb_set_disable_embedded_bitmaps == null) gdext.classes.FontFile.mb_set_disable_embedded_bitmaps = MethodBind.get("FontFile", "set_disable_embedded_bitmaps", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.FontFile.mb_set_disable_embedded_bitmaps, livePtr, disable_embedded_bitmaps)
  }

  /** FontFile.get_disable_embedded_bitmaps */
  final def getDisableEmbeddedBitmaps(): Boolean = {
    if (gdext.classes.FontFile.mb_get_disable_embedded_bitmaps == null) gdext.classes.FontFile.mb_get_disable_embedded_bitmaps = MethodBind.get("FontFile", "get_disable_embedded_bitmaps", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.FontFile.mb_get_disable_embedded_bitmaps, livePtr)
  }

  /** FontFile.set_generate_mipmaps */
  final def setGenerateMipmaps(generate_mipmaps: Boolean): Unit = {
    if (gdext.classes.FontFile.mb_set_generate_mipmaps == null) gdext.classes.FontFile.mb_set_generate_mipmaps = MethodBind.get("FontFile", "set_generate_mipmaps", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.FontFile.mb_set_generate_mipmaps, livePtr, generate_mipmaps)
  }

  /** FontFile.get_generate_mipmaps */
  final def getGenerateMipmaps(): Boolean = {
    if (gdext.classes.FontFile.mb_get_generate_mipmaps == null) gdext.classes.FontFile.mb_get_generate_mipmaps = MethodBind.get("FontFile", "get_generate_mipmaps", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.FontFile.mb_get_generate_mipmaps, livePtr)
  }

  /** FontFile.set_multichannel_signed_distance_field */
  final def setMultichannelSignedDistanceField(msdf: Boolean): Unit = {
    if (gdext.classes.FontFile.mb_set_multichannel_signed_distance_field == null) gdext.classes.FontFile.mb_set_multichannel_signed_distance_field = MethodBind.get("FontFile", "set_multichannel_signed_distance_field", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.FontFile.mb_set_multichannel_signed_distance_field, livePtr, msdf)
  }

  /** FontFile.is_multichannel_signed_distance_field */
  final def isMultichannelSignedDistanceField(): Boolean = {
    if (gdext.classes.FontFile.mb_is_multichannel_signed_distance_field == null) gdext.classes.FontFile.mb_is_multichannel_signed_distance_field = MethodBind.get("FontFile", "is_multichannel_signed_distance_field", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.FontFile.mb_is_multichannel_signed_distance_field, livePtr)
  }

  /** FontFile.set_msdf_pixel_range */
  final def setMsdfPixelRange(msdf_pixel_range: Long): Unit = {
    if (gdext.classes.FontFile.mb_set_msdf_pixel_range == null) gdext.classes.FontFile.mb_set_msdf_pixel_range = MethodBind.get("FontFile", "set_msdf_pixel_range", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.FontFile.mb_set_msdf_pixel_range, livePtr, msdf_pixel_range)
  }

  /** FontFile.get_msdf_pixel_range */
  final def getMsdfPixelRange(): Long = {
    if (gdext.classes.FontFile.mb_get_msdf_pixel_range == null) gdext.classes.FontFile.mb_get_msdf_pixel_range = MethodBind.get("FontFile", "get_msdf_pixel_range", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.FontFile.mb_get_msdf_pixel_range, livePtr)
  }

  /** FontFile.set_msdf_size */
  final def setMsdfSize(msdf_size: Long): Unit = {
    if (gdext.classes.FontFile.mb_set_msdf_size == null) gdext.classes.FontFile.mb_set_msdf_size = MethodBind.get("FontFile", "set_msdf_size", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.FontFile.mb_set_msdf_size, livePtr, msdf_size)
  }

  /** FontFile.get_msdf_size */
  final def getMsdfSize(): Long = {
    if (gdext.classes.FontFile.mb_get_msdf_size == null) gdext.classes.FontFile.mb_get_msdf_size = MethodBind.get("FontFile", "get_msdf_size", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.FontFile.mb_get_msdf_size, livePtr)
  }

  /** FontFile.set_fixed_size */
  final def setFixedSize(fixed_size: Long): Unit = {
    if (gdext.classes.FontFile.mb_set_fixed_size == null) gdext.classes.FontFile.mb_set_fixed_size = MethodBind.get("FontFile", "set_fixed_size", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.FontFile.mb_set_fixed_size, livePtr, fixed_size)
  }

  /** FontFile.get_fixed_size */
  final def getFixedSize(): Long = {
    if (gdext.classes.FontFile.mb_get_fixed_size == null) gdext.classes.FontFile.mb_get_fixed_size = MethodBind.get("FontFile", "get_fixed_size", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.FontFile.mb_get_fixed_size, livePtr)
  }

  /** FontFile.set_fixed_size_scale_mode */
  final def setFixedSizeScaleMode(fixed_size_scale_mode: Long): Unit = {
    if (gdext.classes.FontFile.mb_set_fixed_size_scale_mode == null) gdext.classes.FontFile.mb_set_fixed_size_scale_mode = MethodBind.get("FontFile", "set_fixed_size_scale_mode", 1660989956L)
    Ptrcall.callVoid1(gdext.classes.FontFile.mb_set_fixed_size_scale_mode, livePtr, fixed_size_scale_mode)
  }

  /** FontFile.get_fixed_size_scale_mode */
  final def getFixedSizeScaleMode(): Long = {
    if (gdext.classes.FontFile.mb_get_fixed_size_scale_mode == null) gdext.classes.FontFile.mb_get_fixed_size_scale_mode = MethodBind.get("FontFile", "get_fixed_size_scale_mode", 753873478L)
    Ptrcall.call0[Long](gdext.classes.FontFile.mb_get_fixed_size_scale_mode, livePtr)
  }

  /** FontFile.set_allow_system_fallback */
  final def setAllowSystemFallback(allow_system_fallback: Boolean): Unit = {
    if (gdext.classes.FontFile.mb_set_allow_system_fallback == null) gdext.classes.FontFile.mb_set_allow_system_fallback = MethodBind.get("FontFile", "set_allow_system_fallback", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.FontFile.mb_set_allow_system_fallback, livePtr, allow_system_fallback)
  }

  /** FontFile.is_allow_system_fallback */
  final def isAllowSystemFallback(): Boolean = {
    if (gdext.classes.FontFile.mb_is_allow_system_fallback == null) gdext.classes.FontFile.mb_is_allow_system_fallback = MethodBind.get("FontFile", "is_allow_system_fallback", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.FontFile.mb_is_allow_system_fallback, livePtr)
  }

  /** FontFile.set_force_autohinter */
  final def setForceAutohinter(force_autohinter: Boolean): Unit = {
    if (gdext.classes.FontFile.mb_set_force_autohinter == null) gdext.classes.FontFile.mb_set_force_autohinter = MethodBind.get("FontFile", "set_force_autohinter", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.FontFile.mb_set_force_autohinter, livePtr, force_autohinter)
  }

  /** FontFile.is_force_autohinter */
  final def isForceAutohinter(): Boolean = {
    if (gdext.classes.FontFile.mb_is_force_autohinter == null) gdext.classes.FontFile.mb_is_force_autohinter = MethodBind.get("FontFile", "is_force_autohinter", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.FontFile.mb_is_force_autohinter, livePtr)
  }

  /** FontFile.set_modulate_color_glyphs */
  final def setModulateColorGlyphs(modulate: Boolean): Unit = {
    if (gdext.classes.FontFile.mb_set_modulate_color_glyphs == null) gdext.classes.FontFile.mb_set_modulate_color_glyphs = MethodBind.get("FontFile", "set_modulate_color_glyphs", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.FontFile.mb_set_modulate_color_glyphs, livePtr, modulate)
  }

  /** FontFile.is_modulate_color_glyphs */
  final def isModulateColorGlyphs(): Boolean = {
    if (gdext.classes.FontFile.mb_is_modulate_color_glyphs == null) gdext.classes.FontFile.mb_is_modulate_color_glyphs = MethodBind.get("FontFile", "is_modulate_color_glyphs", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.FontFile.mb_is_modulate_color_glyphs, livePtr)
  }

  /** FontFile.set_hinting */
  final def setHinting(hinting: Long): Unit = {
    if (gdext.classes.FontFile.mb_set_hinting == null) gdext.classes.FontFile.mb_set_hinting = MethodBind.get("FontFile", "set_hinting", 1827459492L)
    Ptrcall.callVoid1(gdext.classes.FontFile.mb_set_hinting, livePtr, hinting)
  }

  /** FontFile.get_hinting */
  final def getHinting(): Long = {
    if (gdext.classes.FontFile.mb_get_hinting == null) gdext.classes.FontFile.mb_get_hinting = MethodBind.get("FontFile", "get_hinting", 3683214614L)
    Ptrcall.call0[Long](gdext.classes.FontFile.mb_get_hinting, livePtr)
  }

  /** FontFile.set_subpixel_positioning */
  final def setSubpixelPositioning(subpixel_positioning: Long): Unit = {
    if (gdext.classes.FontFile.mb_set_subpixel_positioning == null) gdext.classes.FontFile.mb_set_subpixel_positioning = MethodBind.get("FontFile", "set_subpixel_positioning", 4225742182L)
    Ptrcall.callVoid1(gdext.classes.FontFile.mb_set_subpixel_positioning, livePtr, subpixel_positioning)
  }

  /** FontFile.get_subpixel_positioning */
  final def getSubpixelPositioning(): Long = {
    if (gdext.classes.FontFile.mb_get_subpixel_positioning == null) gdext.classes.FontFile.mb_get_subpixel_positioning = MethodBind.get("FontFile", "get_subpixel_positioning", 1069238588L)
    Ptrcall.call0[Long](gdext.classes.FontFile.mb_get_subpixel_positioning, livePtr)
  }

  /** FontFile.set_keep_rounding_remainders */
  final def setKeepRoundingRemainders(keep_rounding_remainders: Boolean): Unit = {
    if (gdext.classes.FontFile.mb_set_keep_rounding_remainders == null) gdext.classes.FontFile.mb_set_keep_rounding_remainders = MethodBind.get("FontFile", "set_keep_rounding_remainders", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.FontFile.mb_set_keep_rounding_remainders, livePtr, keep_rounding_remainders)
  }

  /** FontFile.get_keep_rounding_remainders */
  final def getKeepRoundingRemainders(): Boolean = {
    if (gdext.classes.FontFile.mb_get_keep_rounding_remainders == null) gdext.classes.FontFile.mb_get_keep_rounding_remainders = MethodBind.get("FontFile", "get_keep_rounding_remainders", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.FontFile.mb_get_keep_rounding_remainders, livePtr)
  }

  /** FontFile.set_oversampling */
  final def setOversampling(oversampling: Double): Unit = {
    if (gdext.classes.FontFile.mb_set_oversampling == null) gdext.classes.FontFile.mb_set_oversampling = MethodBind.get("FontFile", "set_oversampling", 373806689L)
    Ptrcall.callVoid1(gdext.classes.FontFile.mb_set_oversampling, livePtr, oversampling)
  }

  /** FontFile.get_oversampling */
  final def getOversampling(): Double = {
    if (gdext.classes.FontFile.mb_get_oversampling == null) gdext.classes.FontFile.mb_get_oversampling = MethodBind.get("FontFile", "get_oversampling", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.FontFile.mb_get_oversampling, livePtr)
  }

  /** FontFile.get_cache_count */
  final def getCacheCount(): Long = {
    if (gdext.classes.FontFile.mb_get_cache_count == null) gdext.classes.FontFile.mb_get_cache_count = MethodBind.get("FontFile", "get_cache_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.FontFile.mb_get_cache_count, livePtr)
  }

  /** FontFile.clear_cache */
  final def clearCache(): Unit = {
    if (gdext.classes.FontFile.mb_clear_cache == null) gdext.classes.FontFile.mb_clear_cache = MethodBind.get("FontFile", "clear_cache", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.FontFile.mb_clear_cache, livePtr)
  }

  /** FontFile.remove_cache */
  final def removeCache(cache_index: Long): Unit = {
    if (gdext.classes.FontFile.mb_remove_cache == null) gdext.classes.FontFile.mb_remove_cache = MethodBind.get("FontFile", "remove_cache", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.FontFile.mb_remove_cache, livePtr, cache_index)
  }

  /** FontFile.clear_size_cache */
  final def clearSizeCache(cache_index: Long): Unit = {
    if (gdext.classes.FontFile.mb_clear_size_cache == null) gdext.classes.FontFile.mb_clear_size_cache = MethodBind.get("FontFile", "clear_size_cache", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.FontFile.mb_clear_size_cache, livePtr, cache_index)
  }

  /** FontFile.remove_size_cache */
  final def removeSizeCache(cache_index: Long, size: gdext.builtin.Vector2i): Unit = {
    if (gdext.classes.FontFile.mb_remove_size_cache == null) gdext.classes.FontFile.mb_remove_size_cache = MethodBind.get("FontFile", "remove_size_cache", 2311374912L)
    Ptrcall.callVoid2(gdext.classes.FontFile.mb_remove_size_cache, livePtr, cache_index, size)
  }

  /** FontFile.set_embolden */
  final def setEmbolden(cache_index: Long, strength: Double): Unit = {
    if (gdext.classes.FontFile.mb_set_embolden == null) gdext.classes.FontFile.mb_set_embolden = MethodBind.get("FontFile", "set_embolden", 1602489585L)
    Ptrcall.callVoid2(gdext.classes.FontFile.mb_set_embolden, livePtr, cache_index, strength)
  }

  /** FontFile.get_embolden */
  final def getEmbolden(cache_index: Long): Double = {
    if (gdext.classes.FontFile.mb_get_embolden == null) gdext.classes.FontFile.mb_get_embolden = MethodBind.get("FontFile", "get_embolden", 2339986948L)
    Ptrcall.call1[Long, Double](gdext.classes.FontFile.mb_get_embolden, livePtr, cache_index)
  }

  /** FontFile.set_transform */
  final def setTransform(cache_index: Long, transform: gdext.builtin.Transform2D): Unit = {
    if (gdext.classes.FontFile.mb_set_transform == null) gdext.classes.FontFile.mb_set_transform = MethodBind.get("FontFile", "set_transform", 30160968L)
    Ptrcall.callVoid2(gdext.classes.FontFile.mb_set_transform, livePtr, cache_index, transform)
  }

  /** FontFile.get_transform */
  final def getTransform(cache_index: Long): gdext.builtin.Transform2D = {
    if (gdext.classes.FontFile.mb_get_transform == null) gdext.classes.FontFile.mb_get_transform = MethodBind.get("FontFile", "get_transform", 3836996910L)
    Ptrcall.call1[Long, gdext.builtin.Transform2D](gdext.classes.FontFile.mb_get_transform, livePtr, cache_index)
  }

  /** FontFile.set_extra_spacing */
  final def setExtraSpacing(cache_index: Long, spacing: Long, value: Long): Unit = {
    if (gdext.classes.FontFile.mb_set_extra_spacing == null) gdext.classes.FontFile.mb_set_extra_spacing = MethodBind.get("FontFile", "set_extra_spacing", 62942285L)
    Ptrcall.callVoid3(gdext.classes.FontFile.mb_set_extra_spacing, livePtr, cache_index, spacing, value)
  }

  /** FontFile.get_extra_spacing */
  final def getExtraSpacing(cache_index: Long, spacing: Long): Long = {
    if (gdext.classes.FontFile.mb_get_extra_spacing == null) gdext.classes.FontFile.mb_get_extra_spacing = MethodBind.get("FontFile", "get_extra_spacing", 1924257185L)
    Ptrcall.call2[Long, Long, Long](gdext.classes.FontFile.mb_get_extra_spacing, livePtr, cache_index, spacing)
  }

  /** FontFile.set_extra_baseline_offset */
  final def setExtraBaselineOffset(cache_index: Long, baseline_offset: Double): Unit = {
    if (gdext.classes.FontFile.mb_set_extra_baseline_offset == null) gdext.classes.FontFile.mb_set_extra_baseline_offset = MethodBind.get("FontFile", "set_extra_baseline_offset", 1602489585L)
    Ptrcall.callVoid2(gdext.classes.FontFile.mb_set_extra_baseline_offset, livePtr, cache_index, baseline_offset)
  }

  /** FontFile.get_extra_baseline_offset */
  final def getExtraBaselineOffset(cache_index: Long): Double = {
    if (gdext.classes.FontFile.mb_get_extra_baseline_offset == null) gdext.classes.FontFile.mb_get_extra_baseline_offset = MethodBind.get("FontFile", "get_extra_baseline_offset", 2339986948L)
    Ptrcall.call1[Long, Double](gdext.classes.FontFile.mb_get_extra_baseline_offset, livePtr, cache_index)
  }

  /** FontFile.set_face_index */
  final def setFaceIndex(cache_index: Long, face_index: Long): Unit = {
    if (gdext.classes.FontFile.mb_set_face_index == null) gdext.classes.FontFile.mb_set_face_index = MethodBind.get("FontFile", "set_face_index", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.FontFile.mb_set_face_index, livePtr, cache_index, face_index)
  }

  /** FontFile.get_face_index */
  final def getFaceIndex(cache_index: Long): Long = {
    if (gdext.classes.FontFile.mb_get_face_index == null) gdext.classes.FontFile.mb_get_face_index = MethodBind.get("FontFile", "get_face_index", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.FontFile.mb_get_face_index, livePtr, cache_index)
  }

  /** FontFile.set_cache_ascent */
  final def setCacheAscent(cache_index: Long, size: Long, ascent: Double): Unit = {
    if (gdext.classes.FontFile.mb_set_cache_ascent == null) gdext.classes.FontFile.mb_set_cache_ascent = MethodBind.get("FontFile", "set_cache_ascent", 3506521499L)
    Ptrcall.callVoid3(gdext.classes.FontFile.mb_set_cache_ascent, livePtr, cache_index, size, ascent)
  }

  /** FontFile.get_cache_ascent */
  final def getCacheAscent(cache_index: Long, size: Long): Double = {
    if (gdext.classes.FontFile.mb_get_cache_ascent == null) gdext.classes.FontFile.mb_get_cache_ascent = MethodBind.get("FontFile", "get_cache_ascent", 3085491603L)
    Ptrcall.call2[Long, Long, Double](gdext.classes.FontFile.mb_get_cache_ascent, livePtr, cache_index, size)
  }

  /** FontFile.set_cache_descent */
  final def setCacheDescent(cache_index: Long, size: Long, descent: Double): Unit = {
    if (gdext.classes.FontFile.mb_set_cache_descent == null) gdext.classes.FontFile.mb_set_cache_descent = MethodBind.get("FontFile", "set_cache_descent", 3506521499L)
    Ptrcall.callVoid3(gdext.classes.FontFile.mb_set_cache_descent, livePtr, cache_index, size, descent)
  }

  /** FontFile.get_cache_descent */
  final def getCacheDescent(cache_index: Long, size: Long): Double = {
    if (gdext.classes.FontFile.mb_get_cache_descent == null) gdext.classes.FontFile.mb_get_cache_descent = MethodBind.get("FontFile", "get_cache_descent", 3085491603L)
    Ptrcall.call2[Long, Long, Double](gdext.classes.FontFile.mb_get_cache_descent, livePtr, cache_index, size)
  }

  /** FontFile.set_cache_underline_position */
  final def setCacheUnderlinePosition(cache_index: Long, size: Long, underline_position: Double): Unit = {
    if (gdext.classes.FontFile.mb_set_cache_underline_position == null) gdext.classes.FontFile.mb_set_cache_underline_position = MethodBind.get("FontFile", "set_cache_underline_position", 3506521499L)
    Ptrcall.callVoid3(gdext.classes.FontFile.mb_set_cache_underline_position, livePtr, cache_index, size, underline_position)
  }

  /** FontFile.get_cache_underline_position */
  final def getCacheUnderlinePosition(cache_index: Long, size: Long): Double = {
    if (gdext.classes.FontFile.mb_get_cache_underline_position == null) gdext.classes.FontFile.mb_get_cache_underline_position = MethodBind.get("FontFile", "get_cache_underline_position", 3085491603L)
    Ptrcall.call2[Long, Long, Double](gdext.classes.FontFile.mb_get_cache_underline_position, livePtr, cache_index, size)
  }

  /** FontFile.set_cache_underline_thickness */
  final def setCacheUnderlineThickness(cache_index: Long, size: Long, underline_thickness: Double): Unit = {
    if (gdext.classes.FontFile.mb_set_cache_underline_thickness == null) gdext.classes.FontFile.mb_set_cache_underline_thickness = MethodBind.get("FontFile", "set_cache_underline_thickness", 3506521499L)
    Ptrcall.callVoid3(gdext.classes.FontFile.mb_set_cache_underline_thickness, livePtr, cache_index, size, underline_thickness)
  }

  /** FontFile.get_cache_underline_thickness */
  final def getCacheUnderlineThickness(cache_index: Long, size: Long): Double = {
    if (gdext.classes.FontFile.mb_get_cache_underline_thickness == null) gdext.classes.FontFile.mb_get_cache_underline_thickness = MethodBind.get("FontFile", "get_cache_underline_thickness", 3085491603L)
    Ptrcall.call2[Long, Long, Double](gdext.classes.FontFile.mb_get_cache_underline_thickness, livePtr, cache_index, size)
  }

  /** FontFile.set_cache_scale */
  final def setCacheScale(cache_index: Long, size: Long, scale: Double): Unit = {
    if (gdext.classes.FontFile.mb_set_cache_scale == null) gdext.classes.FontFile.mb_set_cache_scale = MethodBind.get("FontFile", "set_cache_scale", 3506521499L)
    Ptrcall.callVoid3(gdext.classes.FontFile.mb_set_cache_scale, livePtr, cache_index, size, scale)
  }

  /** FontFile.get_cache_scale */
  final def getCacheScale(cache_index: Long, size: Long): Double = {
    if (gdext.classes.FontFile.mb_get_cache_scale == null) gdext.classes.FontFile.mb_get_cache_scale = MethodBind.get("FontFile", "get_cache_scale", 3085491603L)
    Ptrcall.call2[Long, Long, Double](gdext.classes.FontFile.mb_get_cache_scale, livePtr, cache_index, size)
  }

  /** FontFile.get_texture_count */
  final def getTextureCount(cache_index: Long, size: gdext.builtin.Vector2i): Long = {
    if (gdext.classes.FontFile.mb_get_texture_count == null) gdext.classes.FontFile.mb_get_texture_count = MethodBind.get("FontFile", "get_texture_count", 1987661582L)
    Ptrcall.call2[Long, gdext.builtin.Vector2i, Long](gdext.classes.FontFile.mb_get_texture_count, livePtr, cache_index, size)
  }

  /** FontFile.clear_textures */
  final def clearTextures(cache_index: Long, size: gdext.builtin.Vector2i): Unit = {
    if (gdext.classes.FontFile.mb_clear_textures == null) gdext.classes.FontFile.mb_clear_textures = MethodBind.get("FontFile", "clear_textures", 2311374912L)
    Ptrcall.callVoid2(gdext.classes.FontFile.mb_clear_textures, livePtr, cache_index, size)
  }

  /** FontFile.remove_texture */
  final def removeTexture(cache_index: Long, size: gdext.builtin.Vector2i, texture_index: Long): Unit = {
    if (gdext.classes.FontFile.mb_remove_texture == null) gdext.classes.FontFile.mb_remove_texture = MethodBind.get("FontFile", "remove_texture", 2328951467L)
    Ptrcall.callVoid3(gdext.classes.FontFile.mb_remove_texture, livePtr, cache_index, size, texture_index)
  }

  /** FontFile.set_texture_image */
  final def setTextureImage(cache_index: Long, size: gdext.builtin.Vector2i, texture_index: Long, image: Image): Unit = {
    if (gdext.classes.FontFile.mb_set_texture_image == null) gdext.classes.FontFile.mb_set_texture_image = MethodBind.get("FontFile", "set_texture_image", 4157974066L)
    Ptrcall.callVoid4(gdext.classes.FontFile.mb_set_texture_image, livePtr, cache_index, size, texture_index, Wrappers.handle(image))
  }

  /** FontFile.get_texture_image. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getTextureImage(cache_index: Long, size: gdext.builtin.Vector2i, texture_index: Long): Image = {
    if (gdext.classes.FontFile.mb_get_texture_image == null) gdext.classes.FontFile.mb_get_texture_image = MethodBind.get("FontFile", "get_texture_image", 3878418953L)
    Wrappers.owned[Image](Ptrcall.call3[Long, gdext.builtin.Vector2i, Long, Long](gdext.classes.FontFile.mb_get_texture_image, livePtr, cache_index, size, texture_index))
  }

  /** FontFile.clear_glyphs */
  final def clearGlyphs(cache_index: Long, size: gdext.builtin.Vector2i): Unit = {
    if (gdext.classes.FontFile.mb_clear_glyphs == null) gdext.classes.FontFile.mb_clear_glyphs = MethodBind.get("FontFile", "clear_glyphs", 2311374912L)
    Ptrcall.callVoid2(gdext.classes.FontFile.mb_clear_glyphs, livePtr, cache_index, size)
  }

  /** FontFile.remove_glyph */
  final def removeGlyph(cache_index: Long, size: gdext.builtin.Vector2i, glyph: Long): Unit = {
    if (gdext.classes.FontFile.mb_remove_glyph == null) gdext.classes.FontFile.mb_remove_glyph = MethodBind.get("FontFile", "remove_glyph", 2328951467L)
    Ptrcall.callVoid3(gdext.classes.FontFile.mb_remove_glyph, livePtr, cache_index, size, glyph)
  }

  /** FontFile.set_glyph_advance */
  final def setGlyphAdvance(cache_index: Long, size: Long, glyph: Long, advance: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.FontFile.mb_set_glyph_advance == null) gdext.classes.FontFile.mb_set_glyph_advance = MethodBind.get("FontFile", "set_glyph_advance", 947991729L)
    Ptrcall.callVoid4(gdext.classes.FontFile.mb_set_glyph_advance, livePtr, cache_index, size, glyph, advance)
  }

  /** FontFile.get_glyph_advance */
  final def getGlyphAdvance(cache_index: Long, size: Long, glyph: Long): gdext.builtin.Vector2 = {
    if (gdext.classes.FontFile.mb_get_glyph_advance == null) gdext.classes.FontFile.mb_get_glyph_advance = MethodBind.get("FontFile", "get_glyph_advance", 1601573536L)
    Ptrcall.call3[Long, Long, Long, gdext.builtin.Vector2](gdext.classes.FontFile.mb_get_glyph_advance, livePtr, cache_index, size, glyph)
  }

  /** FontFile.set_glyph_offset */
  final def setGlyphOffset(cache_index: Long, size: gdext.builtin.Vector2i, glyph: Long, offset: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.FontFile.mb_set_glyph_offset == null) gdext.classes.FontFile.mb_set_glyph_offset = MethodBind.get("FontFile", "set_glyph_offset", 921719850L)
    Ptrcall.callVoid4(gdext.classes.FontFile.mb_set_glyph_offset, livePtr, cache_index, size, glyph, offset)
  }

  /** FontFile.get_glyph_offset */
  final def getGlyphOffset(cache_index: Long, size: gdext.builtin.Vector2i, glyph: Long): gdext.builtin.Vector2 = {
    if (gdext.classes.FontFile.mb_get_glyph_offset == null) gdext.classes.FontFile.mb_get_glyph_offset = MethodBind.get("FontFile", "get_glyph_offset", 3205412300L)
    Ptrcall.call3[Long, gdext.builtin.Vector2i, Long, gdext.builtin.Vector2](gdext.classes.FontFile.mb_get_glyph_offset, livePtr, cache_index, size, glyph)
  }

  /** FontFile.set_glyph_size */
  final def setGlyphSize(cache_index: Long, size: gdext.builtin.Vector2i, glyph: Long, gl_size: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.FontFile.mb_set_glyph_size == null) gdext.classes.FontFile.mb_set_glyph_size = MethodBind.get("FontFile", "set_glyph_size", 921719850L)
    Ptrcall.callVoid4(gdext.classes.FontFile.mb_set_glyph_size, livePtr, cache_index, size, glyph, gl_size)
  }

  /** FontFile.get_glyph_size */
  final def getGlyphSize(cache_index: Long, size: gdext.builtin.Vector2i, glyph: Long): gdext.builtin.Vector2 = {
    if (gdext.classes.FontFile.mb_get_glyph_size == null) gdext.classes.FontFile.mb_get_glyph_size = MethodBind.get("FontFile", "get_glyph_size", 3205412300L)
    Ptrcall.call3[Long, gdext.builtin.Vector2i, Long, gdext.builtin.Vector2](gdext.classes.FontFile.mb_get_glyph_size, livePtr, cache_index, size, glyph)
  }

  /** FontFile.set_glyph_uv_rect */
  final def setGlyphUvRect(cache_index: Long, size: gdext.builtin.Vector2i, glyph: Long, uv_rect: gdext.builtin.Rect2): Unit = {
    if (gdext.classes.FontFile.mb_set_glyph_uv_rect == null) gdext.classes.FontFile.mb_set_glyph_uv_rect = MethodBind.get("FontFile", "set_glyph_uv_rect", 3821620992L)
    Ptrcall.callVoid4(gdext.classes.FontFile.mb_set_glyph_uv_rect, livePtr, cache_index, size, glyph, uv_rect)
  }

  /** FontFile.get_glyph_uv_rect */
  final def getGlyphUvRect(cache_index: Long, size: gdext.builtin.Vector2i, glyph: Long): gdext.builtin.Rect2 = {
    if (gdext.classes.FontFile.mb_get_glyph_uv_rect == null) gdext.classes.FontFile.mb_get_glyph_uv_rect = MethodBind.get("FontFile", "get_glyph_uv_rect", 3927917900L)
    Ptrcall.call3[Long, gdext.builtin.Vector2i, Long, gdext.builtin.Rect2](gdext.classes.FontFile.mb_get_glyph_uv_rect, livePtr, cache_index, size, glyph)
  }

  /** FontFile.set_glyph_texture_idx */
  final def setGlyphTextureIdx(cache_index: Long, size: gdext.builtin.Vector2i, glyph: Long, texture_idx: Long): Unit = {
    if (gdext.classes.FontFile.mb_set_glyph_texture_idx == null) gdext.classes.FontFile.mb_set_glyph_texture_idx = MethodBind.get("FontFile", "set_glyph_texture_idx", 355564111L)
    Ptrcall.callVoid4(gdext.classes.FontFile.mb_set_glyph_texture_idx, livePtr, cache_index, size, glyph, texture_idx)
  }

  /** FontFile.get_glyph_texture_idx */
  final def getGlyphTextureIdx(cache_index: Long, size: gdext.builtin.Vector2i, glyph: Long): Long = {
    if (gdext.classes.FontFile.mb_get_glyph_texture_idx == null) gdext.classes.FontFile.mb_get_glyph_texture_idx = MethodBind.get("FontFile", "get_glyph_texture_idx", 1629411054L)
    Ptrcall.call3[Long, gdext.builtin.Vector2i, Long, Long](gdext.classes.FontFile.mb_get_glyph_texture_idx, livePtr, cache_index, size, glyph)
  }

  /** FontFile.clear_kerning_map */
  final def clearKerningMap(cache_index: Long, size: Long): Unit = {
    if (gdext.classes.FontFile.mb_clear_kerning_map == null) gdext.classes.FontFile.mb_clear_kerning_map = MethodBind.get("FontFile", "clear_kerning_map", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.FontFile.mb_clear_kerning_map, livePtr, cache_index, size)
  }

  /** FontFile.remove_kerning */
  final def removeKerning(cache_index: Long, size: Long, glyph_pair: gdext.builtin.Vector2i): Unit = {
    if (gdext.classes.FontFile.mb_remove_kerning == null) gdext.classes.FontFile.mb_remove_kerning = MethodBind.get("FontFile", "remove_kerning", 3930204747L)
    Ptrcall.callVoid3(gdext.classes.FontFile.mb_remove_kerning, livePtr, cache_index, size, glyph_pair)
  }

  /** FontFile.set_kerning */
  final def setKerning(cache_index: Long, size: Long, glyph_pair: gdext.builtin.Vector2i, kerning: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.FontFile.mb_set_kerning == null) gdext.classes.FontFile.mb_set_kerning = MethodBind.get("FontFile", "set_kerning", 3182200918L)
    Ptrcall.callVoid4(gdext.classes.FontFile.mb_set_kerning, livePtr, cache_index, size, glyph_pair, kerning)
  }

  /** FontFile.get_kerning */
  final def getKerning(cache_index: Long, size: Long, glyph_pair: gdext.builtin.Vector2i): gdext.builtin.Vector2 = {
    if (gdext.classes.FontFile.mb_get_kerning == null) gdext.classes.FontFile.mb_get_kerning = MethodBind.get("FontFile", "get_kerning", 1611912865L)
    Ptrcall.call3[Long, Long, gdext.builtin.Vector2i, gdext.builtin.Vector2](gdext.classes.FontFile.mb_get_kerning, livePtr, cache_index, size, glyph_pair)
  }

  /** FontFile.render_range */
  final def renderRange(cache_index: Long, size: gdext.builtin.Vector2i, start: Long, end: Long): Unit = {
    if (gdext.classes.FontFile.mb_render_range == null) gdext.classes.FontFile.mb_render_range = MethodBind.get("FontFile", "render_range", 355564111L)
    Ptrcall.callVoid4(gdext.classes.FontFile.mb_render_range, livePtr, cache_index, size, start, end)
  }

  /** FontFile.render_glyph */
  final def renderGlyph(cache_index: Long, size: gdext.builtin.Vector2i, index: Long): Unit = {
    if (gdext.classes.FontFile.mb_render_glyph == null) gdext.classes.FontFile.mb_render_glyph = MethodBind.get("FontFile", "render_glyph", 2328951467L)
    Ptrcall.callVoid3(gdext.classes.FontFile.mb_render_glyph, livePtr, cache_index, size, index)
  }

  /** FontFile.set_language_support_override */
  final def setLanguageSupportOverride(language: String, supported: Boolean): Unit = {
    if (gdext.classes.FontFile.mb_set_language_support_override == null) gdext.classes.FontFile.mb_set_language_support_override = MethodBind.get("FontFile", "set_language_support_override", 2678287736L)
    Ptrcall.callVoid2(gdext.classes.FontFile.mb_set_language_support_override, livePtr, language, supported)
  }

  /** FontFile.get_language_support_override */
  final def getLanguageSupportOverride(language: String): Boolean = {
    if (gdext.classes.FontFile.mb_get_language_support_override == null) gdext.classes.FontFile.mb_get_language_support_override = MethodBind.get("FontFile", "get_language_support_override", 3927539163L)
    Ptrcall.call1[String, Boolean](gdext.classes.FontFile.mb_get_language_support_override, livePtr, language)
  }

  /** FontFile.remove_language_support_override */
  final def removeLanguageSupportOverride(language: String): Unit = {
    if (gdext.classes.FontFile.mb_remove_language_support_override == null) gdext.classes.FontFile.mb_remove_language_support_override = MethodBind.get("FontFile", "remove_language_support_override", 83702148L)
    Ptrcall.callVoid1(gdext.classes.FontFile.mb_remove_language_support_override, livePtr, language)
  }

  /** FontFile.set_script_support_override */
  final def setScriptSupportOverride(script: String, supported: Boolean): Unit = {
    if (gdext.classes.FontFile.mb_set_script_support_override == null) gdext.classes.FontFile.mb_set_script_support_override = MethodBind.get("FontFile", "set_script_support_override", 2678287736L)
    Ptrcall.callVoid2(gdext.classes.FontFile.mb_set_script_support_override, livePtr, script, supported)
  }

  /** FontFile.get_script_support_override */
  final def getScriptSupportOverride(script: String): Boolean = {
    if (gdext.classes.FontFile.mb_get_script_support_override == null) gdext.classes.FontFile.mb_get_script_support_override = MethodBind.get("FontFile", "get_script_support_override", 3927539163L)
    Ptrcall.call1[String, Boolean](gdext.classes.FontFile.mb_get_script_support_override, livePtr, script)
  }

  /** FontFile.remove_script_support_override */
  final def removeScriptSupportOverride(script: String): Unit = {
    if (gdext.classes.FontFile.mb_remove_script_support_override == null) gdext.classes.FontFile.mb_remove_script_support_override = MethodBind.get("FontFile", "remove_script_support_override", 83702148L)
    Ptrcall.callVoid1(gdext.classes.FontFile.mb_remove_script_support_override, livePtr, script)
  }

  /** FontFile.get_glyph_index */
  final def getGlyphIndex(size: Long, char: Long, variation_selector: Long): Long = {
    if (gdext.classes.FontFile.mb_get_glyph_index == null) gdext.classes.FontFile.mb_get_glyph_index = MethodBind.get("FontFile", "get_glyph_index", 864943070L)
    Ptrcall.call3[Long, Long, Long, Long](gdext.classes.FontFile.mb_get_glyph_index, livePtr, size, char, variation_selector)
  }

  /** FontFile.get_char_from_glyph_index */
  final def getCharFromGlyphIndex(size: Long, glyph_index: Long): Long = {
    if (gdext.classes.FontFile.mb_get_char_from_glyph_index == null) gdext.classes.FontFile.mb_get_char_from_glyph_index = MethodBind.get("FontFile", "get_char_from_glyph_index", 3175239445L)
    Ptrcall.call2[Long, Long, Long](gdext.classes.FontFile.mb_get_char_from_glyph_index, livePtr, size, glyph_index)
  }

}

object FontFile {
  private[classes] var mb_load_bitmap_font: GDExtensionMethodBindPtr = null
  private[classes] var mb_load_dynamic_font: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_font_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_font_style_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_font_style: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_font_weight: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_font_stretch: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_antialiasing: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_antialiasing: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_disable_embedded_bitmaps: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_disable_embedded_bitmaps: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_generate_mipmaps: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_generate_mipmaps: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_multichannel_signed_distance_field: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_multichannel_signed_distance_field: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_msdf_pixel_range: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_msdf_pixel_range: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_msdf_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_msdf_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_fixed_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fixed_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_fixed_size_scale_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fixed_size_scale_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_allow_system_fallback: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_allow_system_fallback: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_force_autohinter: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_force_autohinter: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_modulate_color_glyphs: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_modulate_color_glyphs: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_hinting: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_hinting: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_subpixel_positioning: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_subpixel_positioning: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_keep_rounding_remainders: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_keep_rounding_remainders: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_oversampling: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_oversampling: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_cache_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_cache: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_cache: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_size_cache: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_size_cache: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_embolden: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_embolden: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_transform: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_transform: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_extra_spacing: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_extra_spacing: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_extra_baseline_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_extra_baseline_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_face_index: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_face_index: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_cache_ascent: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_cache_ascent: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_cache_descent: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_cache_descent: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_cache_underline_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_cache_underline_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_cache_underline_thickness: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_cache_underline_thickness: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_cache_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_cache_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_textures: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_texture_image: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture_image: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_glyphs: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_glyph: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_glyph_advance: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_glyph_advance: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_glyph_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_glyph_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_glyph_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_glyph_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_glyph_uv_rect: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_glyph_uv_rect: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_glyph_texture_idx: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_glyph_texture_idx: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_kerning_map: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_kerning: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_kerning: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_kerning: GDExtensionMethodBindPtr = null
  private[classes] var mb_render_range: GDExtensionMethodBindPtr = null
  private[classes] var mb_render_glyph: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_language_support_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_language_support_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_language_support_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_script_support_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_script_support_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_script_support_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_glyph_index: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_char_from_glyph_index: GDExtensionMethodBindPtr = null
}
