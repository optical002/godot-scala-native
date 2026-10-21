package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `SystemFont`, extends `Font`. */
abstract class SystemFont extends Font {
  override def godotClassName: String = "SystemFont"

  /** SystemFont.set_antialiasing */
  final def setAntialiasing(antialiasing: Long): Unit = {
    if (gdext.classes.SystemFont.mb_set_antialiasing == null) gdext.classes.SystemFont.mb_set_antialiasing = MethodBind.get("SystemFont", "set_antialiasing", 1669900L)
    Ptrcall.callVoid1(gdext.classes.SystemFont.mb_set_antialiasing, livePtr, antialiasing)
  }

  /** SystemFont.get_antialiasing */
  final def getAntialiasing(): Long = {
    if (gdext.classes.SystemFont.mb_get_antialiasing == null) gdext.classes.SystemFont.mb_get_antialiasing = MethodBind.get("SystemFont", "get_antialiasing", 4262718649L)
    Ptrcall.call0[Long](gdext.classes.SystemFont.mb_get_antialiasing, livePtr)
  }

  /** SystemFont.set_disable_embedded_bitmaps */
  final def setDisableEmbeddedBitmaps(disable_embedded_bitmaps: Boolean): Unit = {
    if (gdext.classes.SystemFont.mb_set_disable_embedded_bitmaps == null) gdext.classes.SystemFont.mb_set_disable_embedded_bitmaps = MethodBind.get("SystemFont", "set_disable_embedded_bitmaps", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.SystemFont.mb_set_disable_embedded_bitmaps, livePtr, disable_embedded_bitmaps)
  }

  /** SystemFont.get_disable_embedded_bitmaps */
  final def getDisableEmbeddedBitmaps(): Boolean = {
    if (gdext.classes.SystemFont.mb_get_disable_embedded_bitmaps == null) gdext.classes.SystemFont.mb_get_disable_embedded_bitmaps = MethodBind.get("SystemFont", "get_disable_embedded_bitmaps", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.SystemFont.mb_get_disable_embedded_bitmaps, livePtr)
  }

  /** SystemFont.set_generate_mipmaps */
  final def setGenerateMipmaps(generate_mipmaps: Boolean): Unit = {
    if (gdext.classes.SystemFont.mb_set_generate_mipmaps == null) gdext.classes.SystemFont.mb_set_generate_mipmaps = MethodBind.get("SystemFont", "set_generate_mipmaps", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.SystemFont.mb_set_generate_mipmaps, livePtr, generate_mipmaps)
  }

  /** SystemFont.get_generate_mipmaps */
  final def getGenerateMipmaps(): Boolean = {
    if (gdext.classes.SystemFont.mb_get_generate_mipmaps == null) gdext.classes.SystemFont.mb_get_generate_mipmaps = MethodBind.get("SystemFont", "get_generate_mipmaps", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.SystemFont.mb_get_generate_mipmaps, livePtr)
  }

  /** SystemFont.set_allow_system_fallback */
  final def setAllowSystemFallback(allow_system_fallback: Boolean): Unit = {
    if (gdext.classes.SystemFont.mb_set_allow_system_fallback == null) gdext.classes.SystemFont.mb_set_allow_system_fallback = MethodBind.get("SystemFont", "set_allow_system_fallback", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.SystemFont.mb_set_allow_system_fallback, livePtr, allow_system_fallback)
  }

  /** SystemFont.is_allow_system_fallback */
  final def isAllowSystemFallback(): Boolean = {
    if (gdext.classes.SystemFont.mb_is_allow_system_fallback == null) gdext.classes.SystemFont.mb_is_allow_system_fallback = MethodBind.get("SystemFont", "is_allow_system_fallback", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.SystemFont.mb_is_allow_system_fallback, livePtr)
  }

  /** SystemFont.set_force_autohinter */
  final def setForceAutohinter(force_autohinter: Boolean): Unit = {
    if (gdext.classes.SystemFont.mb_set_force_autohinter == null) gdext.classes.SystemFont.mb_set_force_autohinter = MethodBind.get("SystemFont", "set_force_autohinter", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.SystemFont.mb_set_force_autohinter, livePtr, force_autohinter)
  }

  /** SystemFont.is_force_autohinter */
  final def isForceAutohinter(): Boolean = {
    if (gdext.classes.SystemFont.mb_is_force_autohinter == null) gdext.classes.SystemFont.mb_is_force_autohinter = MethodBind.get("SystemFont", "is_force_autohinter", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.SystemFont.mb_is_force_autohinter, livePtr)
  }

  /** SystemFont.set_modulate_color_glyphs */
  final def setModulateColorGlyphs(modulate: Boolean): Unit = {
    if (gdext.classes.SystemFont.mb_set_modulate_color_glyphs == null) gdext.classes.SystemFont.mb_set_modulate_color_glyphs = MethodBind.get("SystemFont", "set_modulate_color_glyphs", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.SystemFont.mb_set_modulate_color_glyphs, livePtr, modulate)
  }

  /** SystemFont.is_modulate_color_glyphs */
  final def isModulateColorGlyphs(): Boolean = {
    if (gdext.classes.SystemFont.mb_is_modulate_color_glyphs == null) gdext.classes.SystemFont.mb_is_modulate_color_glyphs = MethodBind.get("SystemFont", "is_modulate_color_glyphs", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.SystemFont.mb_is_modulate_color_glyphs, livePtr)
  }

  /** SystemFont.set_hinting */
  final def setHinting(hinting: Long): Unit = {
    if (gdext.classes.SystemFont.mb_set_hinting == null) gdext.classes.SystemFont.mb_set_hinting = MethodBind.get("SystemFont", "set_hinting", 1827459492L)
    Ptrcall.callVoid1(gdext.classes.SystemFont.mb_set_hinting, livePtr, hinting)
  }

  /** SystemFont.get_hinting */
  final def getHinting(): Long = {
    if (gdext.classes.SystemFont.mb_get_hinting == null) gdext.classes.SystemFont.mb_get_hinting = MethodBind.get("SystemFont", "get_hinting", 3683214614L)
    Ptrcall.call0[Long](gdext.classes.SystemFont.mb_get_hinting, livePtr)
  }

  /** SystemFont.set_subpixel_positioning */
  final def setSubpixelPositioning(subpixel_positioning: Long): Unit = {
    if (gdext.classes.SystemFont.mb_set_subpixel_positioning == null) gdext.classes.SystemFont.mb_set_subpixel_positioning = MethodBind.get("SystemFont", "set_subpixel_positioning", 4225742182L)
    Ptrcall.callVoid1(gdext.classes.SystemFont.mb_set_subpixel_positioning, livePtr, subpixel_positioning)
  }

  /** SystemFont.get_subpixel_positioning */
  final def getSubpixelPositioning(): Long = {
    if (gdext.classes.SystemFont.mb_get_subpixel_positioning == null) gdext.classes.SystemFont.mb_get_subpixel_positioning = MethodBind.get("SystemFont", "get_subpixel_positioning", 1069238588L)
    Ptrcall.call0[Long](gdext.classes.SystemFont.mb_get_subpixel_positioning, livePtr)
  }

  /** SystemFont.set_keep_rounding_remainders */
  final def setKeepRoundingRemainders(keep_rounding_remainders: Boolean): Unit = {
    if (gdext.classes.SystemFont.mb_set_keep_rounding_remainders == null) gdext.classes.SystemFont.mb_set_keep_rounding_remainders = MethodBind.get("SystemFont", "set_keep_rounding_remainders", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.SystemFont.mb_set_keep_rounding_remainders, livePtr, keep_rounding_remainders)
  }

  /** SystemFont.get_keep_rounding_remainders */
  final def getKeepRoundingRemainders(): Boolean = {
    if (gdext.classes.SystemFont.mb_get_keep_rounding_remainders == null) gdext.classes.SystemFont.mb_get_keep_rounding_remainders = MethodBind.get("SystemFont", "get_keep_rounding_remainders", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.SystemFont.mb_get_keep_rounding_remainders, livePtr)
  }

  /** SystemFont.set_multichannel_signed_distance_field */
  final def setMultichannelSignedDistanceField(msdf: Boolean): Unit = {
    if (gdext.classes.SystemFont.mb_set_multichannel_signed_distance_field == null) gdext.classes.SystemFont.mb_set_multichannel_signed_distance_field = MethodBind.get("SystemFont", "set_multichannel_signed_distance_field", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.SystemFont.mb_set_multichannel_signed_distance_field, livePtr, msdf)
  }

  /** SystemFont.is_multichannel_signed_distance_field */
  final def isMultichannelSignedDistanceField(): Boolean = {
    if (gdext.classes.SystemFont.mb_is_multichannel_signed_distance_field == null) gdext.classes.SystemFont.mb_is_multichannel_signed_distance_field = MethodBind.get("SystemFont", "is_multichannel_signed_distance_field", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.SystemFont.mb_is_multichannel_signed_distance_field, livePtr)
  }

  /** SystemFont.set_msdf_pixel_range */
  final def setMsdfPixelRange(msdf_pixel_range: Long): Unit = {
    if (gdext.classes.SystemFont.mb_set_msdf_pixel_range == null) gdext.classes.SystemFont.mb_set_msdf_pixel_range = MethodBind.get("SystemFont", "set_msdf_pixel_range", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.SystemFont.mb_set_msdf_pixel_range, livePtr, msdf_pixel_range)
  }

  /** SystemFont.get_msdf_pixel_range */
  final def getMsdfPixelRange(): Long = {
    if (gdext.classes.SystemFont.mb_get_msdf_pixel_range == null) gdext.classes.SystemFont.mb_get_msdf_pixel_range = MethodBind.get("SystemFont", "get_msdf_pixel_range", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.SystemFont.mb_get_msdf_pixel_range, livePtr)
  }

  /** SystemFont.set_msdf_size */
  final def setMsdfSize(msdf_size: Long): Unit = {
    if (gdext.classes.SystemFont.mb_set_msdf_size == null) gdext.classes.SystemFont.mb_set_msdf_size = MethodBind.get("SystemFont", "set_msdf_size", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.SystemFont.mb_set_msdf_size, livePtr, msdf_size)
  }

  /** SystemFont.get_msdf_size */
  final def getMsdfSize(): Long = {
    if (gdext.classes.SystemFont.mb_get_msdf_size == null) gdext.classes.SystemFont.mb_get_msdf_size = MethodBind.get("SystemFont", "get_msdf_size", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.SystemFont.mb_get_msdf_size, livePtr)
  }

  /** SystemFont.set_oversampling */
  final def setOversampling(oversampling: Double): Unit = {
    if (gdext.classes.SystemFont.mb_set_oversampling == null) gdext.classes.SystemFont.mb_set_oversampling = MethodBind.get("SystemFont", "set_oversampling", 373806689L)
    Ptrcall.callVoid1(gdext.classes.SystemFont.mb_set_oversampling, livePtr, oversampling)
  }

  /** SystemFont.get_oversampling */
  final def getOversampling(): Double = {
    if (gdext.classes.SystemFont.mb_get_oversampling == null) gdext.classes.SystemFont.mb_get_oversampling = MethodBind.get("SystemFont", "get_oversampling", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.SystemFont.mb_get_oversampling, livePtr)
  }

  /** SystemFont.get_font_italic */
  final def getFontItalic(): Boolean = {
    if (gdext.classes.SystemFont.mb_get_font_italic == null) gdext.classes.SystemFont.mb_get_font_italic = MethodBind.get("SystemFont", "get_font_italic", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.SystemFont.mb_get_font_italic, livePtr)
  }

  /** SystemFont.set_font_italic */
  final def setFontItalic(italic: Boolean): Unit = {
    if (gdext.classes.SystemFont.mb_set_font_italic == null) gdext.classes.SystemFont.mb_set_font_italic = MethodBind.get("SystemFont", "set_font_italic", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.SystemFont.mb_set_font_italic, livePtr, italic)
  }

  /** SystemFont.set_font_weight */
  final def setFontWeight(weight: Long): Unit = {
    if (gdext.classes.SystemFont.mb_set_font_weight == null) gdext.classes.SystemFont.mb_set_font_weight = MethodBind.get("SystemFont", "set_font_weight", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.SystemFont.mb_set_font_weight, livePtr, weight)
  }

  /** SystemFont.set_font_stretch */
  final def setFontStretch(stretch: Long): Unit = {
    if (gdext.classes.SystemFont.mb_set_font_stretch == null) gdext.classes.SystemFont.mb_set_font_stretch = MethodBind.get("SystemFont", "set_font_stretch", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.SystemFont.mb_set_font_stretch, livePtr, stretch)
  }

}

object SystemFont {
  private[classes] var mb_set_antialiasing: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_antialiasing: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_disable_embedded_bitmaps: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_disable_embedded_bitmaps: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_generate_mipmaps: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_generate_mipmaps: GDExtensionMethodBindPtr = null
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
  private[classes] var mb_set_multichannel_signed_distance_field: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_multichannel_signed_distance_field: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_msdf_pixel_range: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_msdf_pixel_range: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_msdf_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_msdf_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_oversampling: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_oversampling: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_font_italic: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_font_italic: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_font_weight: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_font_stretch: GDExtensionMethodBindPtr = null
}
