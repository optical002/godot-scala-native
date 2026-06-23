package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `SystemFont`, extends `Font`. */
abstract class SystemFont extends Font {

  /** SystemFont.set_antialiasing */
  final def setAntialiasing(antialiasing: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("SystemFont", "set_antialiasing", 1669900L), hostObject.objectPtr, antialiasing)

  /** SystemFont.get_antialiasing */
  final def getAntialiasing(): Long =
    Ptrcall.call0[Long](MethodBind.get("SystemFont", "get_antialiasing", 4262718649L), hostObject.objectPtr)

  /** SystemFont.set_disable_embedded_bitmaps */
  final def setDisableEmbeddedBitmaps(disable_embedded_bitmaps: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("SystemFont", "set_disable_embedded_bitmaps", 2586408642L), hostObject.objectPtr, disable_embedded_bitmaps)

  /** SystemFont.get_disable_embedded_bitmaps */
  final def getDisableEmbeddedBitmaps(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("SystemFont", "get_disable_embedded_bitmaps", 36873697L), hostObject.objectPtr)

  /** SystemFont.set_generate_mipmaps */
  final def setGenerateMipmaps(generate_mipmaps: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("SystemFont", "set_generate_mipmaps", 2586408642L), hostObject.objectPtr, generate_mipmaps)

  /** SystemFont.get_generate_mipmaps */
  final def getGenerateMipmaps(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("SystemFont", "get_generate_mipmaps", 36873697L), hostObject.objectPtr)

  /** SystemFont.set_allow_system_fallback */
  final def setAllowSystemFallback(allow_system_fallback: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("SystemFont", "set_allow_system_fallback", 2586408642L), hostObject.objectPtr, allow_system_fallback)

  /** SystemFont.is_allow_system_fallback */
  final def isAllowSystemFallback(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("SystemFont", "is_allow_system_fallback", 36873697L), hostObject.objectPtr)

  /** SystemFont.set_force_autohinter */
  final def setForceAutohinter(force_autohinter: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("SystemFont", "set_force_autohinter", 2586408642L), hostObject.objectPtr, force_autohinter)

  /** SystemFont.is_force_autohinter */
  final def isForceAutohinter(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("SystemFont", "is_force_autohinter", 36873697L), hostObject.objectPtr)

  /** SystemFont.set_modulate_color_glyphs */
  final def setModulateColorGlyphs(modulate: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("SystemFont", "set_modulate_color_glyphs", 2586408642L), hostObject.objectPtr, modulate)

  /** SystemFont.is_modulate_color_glyphs */
  final def isModulateColorGlyphs(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("SystemFont", "is_modulate_color_glyphs", 36873697L), hostObject.objectPtr)

  /** SystemFont.set_hinting */
  final def setHinting(hinting: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("SystemFont", "set_hinting", 1827459492L), hostObject.objectPtr, hinting)

  /** SystemFont.get_hinting */
  final def getHinting(): Long =
    Ptrcall.call0[Long](MethodBind.get("SystemFont", "get_hinting", 3683214614L), hostObject.objectPtr)

  /** SystemFont.set_subpixel_positioning */
  final def setSubpixelPositioning(subpixel_positioning: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("SystemFont", "set_subpixel_positioning", 4225742182L), hostObject.objectPtr, subpixel_positioning)

  /** SystemFont.get_subpixel_positioning */
  final def getSubpixelPositioning(): Long =
    Ptrcall.call0[Long](MethodBind.get("SystemFont", "get_subpixel_positioning", 1069238588L), hostObject.objectPtr)

  /** SystemFont.set_keep_rounding_remainders */
  final def setKeepRoundingRemainders(keep_rounding_remainders: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("SystemFont", "set_keep_rounding_remainders", 2586408642L), hostObject.objectPtr, keep_rounding_remainders)

  /** SystemFont.get_keep_rounding_remainders */
  final def getKeepRoundingRemainders(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("SystemFont", "get_keep_rounding_remainders", 36873697L), hostObject.objectPtr)

  /** SystemFont.set_multichannel_signed_distance_field */
  final def setMultichannelSignedDistanceField(msdf: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("SystemFont", "set_multichannel_signed_distance_field", 2586408642L), hostObject.objectPtr, msdf)

  /** SystemFont.is_multichannel_signed_distance_field */
  final def isMultichannelSignedDistanceField(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("SystemFont", "is_multichannel_signed_distance_field", 36873697L), hostObject.objectPtr)

  /** SystemFont.set_msdf_pixel_range */
  final def setMsdfPixelRange(msdf_pixel_range: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("SystemFont", "set_msdf_pixel_range", 1286410249L), hostObject.objectPtr, msdf_pixel_range)

  /** SystemFont.get_msdf_pixel_range */
  final def getMsdfPixelRange(): Long =
    Ptrcall.call0[Long](MethodBind.get("SystemFont", "get_msdf_pixel_range", 3905245786L), hostObject.objectPtr)

  /** SystemFont.set_msdf_size */
  final def setMsdfSize(msdf_size: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("SystemFont", "set_msdf_size", 1286410249L), hostObject.objectPtr, msdf_size)

  /** SystemFont.get_msdf_size */
  final def getMsdfSize(): Long =
    Ptrcall.call0[Long](MethodBind.get("SystemFont", "get_msdf_size", 3905245786L), hostObject.objectPtr)

  /** SystemFont.set_oversampling */
  final def setOversampling(oversampling: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("SystemFont", "set_oversampling", 373806689L), hostObject.objectPtr, oversampling)

  /** SystemFont.get_oversampling */
  final def getOversampling(): Double =
    Ptrcall.call0[Double](MethodBind.get("SystemFont", "get_oversampling", 1740695150L), hostObject.objectPtr)

  /** SystemFont.get_font_italic */
  final def getFontItalic(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("SystemFont", "get_font_italic", 36873697L), hostObject.objectPtr)

  /** SystemFont.set_font_italic */
  final def setFontItalic(italic: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("SystemFont", "set_font_italic", 2586408642L), hostObject.objectPtr, italic)

  /** SystemFont.set_font_weight */
  final def setFontWeight(weight: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("SystemFont", "set_font_weight", 1286410249L), hostObject.objectPtr, weight)

  /** SystemFont.set_font_stretch */
  final def setFontStretch(stretch: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("SystemFont", "set_font_stretch", 1286410249L), hostObject.objectPtr, stretch)

}

object SystemFont {
  /** Class metadata for Gd[SystemFont] lifetime management and casting. */
  given GodotClass[SystemFont] with {
    def className = "SystemFont"
    def isRefCounted = true
    def wrap(o: GodotObject): SystemFont = new SystemFont {}.withHost(o.objectPtr)
    def unwrap(t: SystemFont): GodotObject = t.hostObject
  }
}
