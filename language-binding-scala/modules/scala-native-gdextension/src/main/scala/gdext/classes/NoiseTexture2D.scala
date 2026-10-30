package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `NoiseTexture2D`, extends `Texture2D`. */
abstract class NoiseTexture2D extends Texture2D {
  override def godotClassName: String = "NoiseTexture2D"

  /** NoiseTexture2D.set_width */
  final def setWidth(width: Long): Unit = {
    if (gdext.classes.NoiseTexture2D.mb_set_width == null) gdext.classes.NoiseTexture2D.mb_set_width = MethodBind.get("NoiseTexture2D", "set_width", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.NoiseTexture2D.mb_set_width, livePtr, width)
  }

  /** NoiseTexture2D.set_height */
  final def setHeight(height: Long): Unit = {
    if (gdext.classes.NoiseTexture2D.mb_set_height == null) gdext.classes.NoiseTexture2D.mb_set_height = MethodBind.get("NoiseTexture2D", "set_height", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.NoiseTexture2D.mb_set_height, livePtr, height)
  }

  /** NoiseTexture2D.set_generate_mipmaps */
  final def setGenerateMipmaps(invert: Boolean): Unit = {
    if (gdext.classes.NoiseTexture2D.mb_set_generate_mipmaps == null) gdext.classes.NoiseTexture2D.mb_set_generate_mipmaps = MethodBind.get("NoiseTexture2D", "set_generate_mipmaps", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.NoiseTexture2D.mb_set_generate_mipmaps, livePtr, invert)
  }

  /** NoiseTexture2D.is_generating_mipmaps */
  final def isGeneratingMipmaps(): Boolean = {
    if (gdext.classes.NoiseTexture2D.mb_is_generating_mipmaps == null) gdext.classes.NoiseTexture2D.mb_is_generating_mipmaps = MethodBind.get("NoiseTexture2D", "is_generating_mipmaps", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.NoiseTexture2D.mb_is_generating_mipmaps, livePtr)
  }

  /** NoiseTexture2D.set_noise */
  final def setNoise(noise: Noise): Unit = {
    if (gdext.classes.NoiseTexture2D.mb_set_noise == null) gdext.classes.NoiseTexture2D.mb_set_noise = MethodBind.get("NoiseTexture2D", "set_noise", 4135492439L)
    Ptrcall.callVoid1(gdext.classes.NoiseTexture2D.mb_set_noise, livePtr, Wrappers.handle(noise))
  }

  /** NoiseTexture2D.get_noise. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getNoise(): Noise = {
    if (gdext.classes.NoiseTexture2D.mb_get_noise == null) gdext.classes.NoiseTexture2D.mb_get_noise = MethodBind.get("NoiseTexture2D", "get_noise", 185851837L)
    Wrappers.owned[Noise](Ptrcall.call0[Long](gdext.classes.NoiseTexture2D.mb_get_noise, livePtr))
  }

  /** NoiseTexture2D.set_color_ramp */
  final def setColorRamp(gradient: Gradient): Unit = {
    if (gdext.classes.NoiseTexture2D.mb_set_color_ramp == null) gdext.classes.NoiseTexture2D.mb_set_color_ramp = MethodBind.get("NoiseTexture2D", "set_color_ramp", 2756054477L)
    Ptrcall.callVoid1(gdext.classes.NoiseTexture2D.mb_set_color_ramp, livePtr, Wrappers.handle(gradient))
  }

  /** NoiseTexture2D.get_color_ramp. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getColorRamp(): Gradient = {
    if (gdext.classes.NoiseTexture2D.mb_get_color_ramp == null) gdext.classes.NoiseTexture2D.mb_get_color_ramp = MethodBind.get("NoiseTexture2D", "get_color_ramp", 132272999L)
    Wrappers.owned[Gradient](Ptrcall.call0[Long](gdext.classes.NoiseTexture2D.mb_get_color_ramp, livePtr))
  }

  /** NoiseTexture2D.set_seamless */
  final def setSeamless(seamless: Boolean): Unit = {
    if (gdext.classes.NoiseTexture2D.mb_set_seamless == null) gdext.classes.NoiseTexture2D.mb_set_seamless = MethodBind.get("NoiseTexture2D", "set_seamless", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.NoiseTexture2D.mb_set_seamless, livePtr, seamless)
  }

  /** NoiseTexture2D.get_seamless */
  final def getSeamless(): Boolean = {
    if (gdext.classes.NoiseTexture2D.mb_get_seamless == null) gdext.classes.NoiseTexture2D.mb_get_seamless = MethodBind.get("NoiseTexture2D", "get_seamless", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.NoiseTexture2D.mb_get_seamless, livePtr)
  }

  /** NoiseTexture2D.set_invert */
  final def setInvert(invert: Boolean): Unit = {
    if (gdext.classes.NoiseTexture2D.mb_set_invert == null) gdext.classes.NoiseTexture2D.mb_set_invert = MethodBind.get("NoiseTexture2D", "set_invert", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.NoiseTexture2D.mb_set_invert, livePtr, invert)
  }

  /** NoiseTexture2D.get_invert */
  final def getInvert(): Boolean = {
    if (gdext.classes.NoiseTexture2D.mb_get_invert == null) gdext.classes.NoiseTexture2D.mb_get_invert = MethodBind.get("NoiseTexture2D", "get_invert", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.NoiseTexture2D.mb_get_invert, livePtr)
  }

  /** NoiseTexture2D.set_in_3d_space */
  final def setIn3dSpace(enable: Boolean): Unit = {
    if (gdext.classes.NoiseTexture2D.mb_set_in_3d_space == null) gdext.classes.NoiseTexture2D.mb_set_in_3d_space = MethodBind.get("NoiseTexture2D", "set_in_3d_space", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.NoiseTexture2D.mb_set_in_3d_space, livePtr, enable)
  }

  /** NoiseTexture2D.is_in_3d_space */
  final def isIn3dSpace(): Boolean = {
    if (gdext.classes.NoiseTexture2D.mb_is_in_3d_space == null) gdext.classes.NoiseTexture2D.mb_is_in_3d_space = MethodBind.get("NoiseTexture2D", "is_in_3d_space", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.NoiseTexture2D.mb_is_in_3d_space, livePtr)
  }

  /** NoiseTexture2D.set_as_normal_map */
  final def setAsNormalMap(asNormalMap: Boolean): Unit = {
    if (gdext.classes.NoiseTexture2D.mb_set_as_normal_map == null) gdext.classes.NoiseTexture2D.mb_set_as_normal_map = MethodBind.get("NoiseTexture2D", "set_as_normal_map", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.NoiseTexture2D.mb_set_as_normal_map, livePtr, asNormalMap)
  }

  /** NoiseTexture2D.is_normal_map */
  final def isNormalMap(): Boolean = {
    if (gdext.classes.NoiseTexture2D.mb_is_normal_map == null) gdext.classes.NoiseTexture2D.mb_is_normal_map = MethodBind.get("NoiseTexture2D", "is_normal_map", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.NoiseTexture2D.mb_is_normal_map, livePtr)
  }

  /** NoiseTexture2D.set_normalize */
  final def setNormalize(normalize: Boolean): Unit = {
    if (gdext.classes.NoiseTexture2D.mb_set_normalize == null) gdext.classes.NoiseTexture2D.mb_set_normalize = MethodBind.get("NoiseTexture2D", "set_normalize", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.NoiseTexture2D.mb_set_normalize, livePtr, normalize)
  }

  /** NoiseTexture2D.is_normalized */
  final def isNormalized(): Boolean = {
    if (gdext.classes.NoiseTexture2D.mb_is_normalized == null) gdext.classes.NoiseTexture2D.mb_is_normalized = MethodBind.get("NoiseTexture2D", "is_normalized", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.NoiseTexture2D.mb_is_normalized, livePtr)
  }

  /** NoiseTexture2D.set_seamless_blend_skirt */
  final def setSeamlessBlendSkirt(seamlessBlendSkirt: Double): Unit = {
    if (gdext.classes.NoiseTexture2D.mb_set_seamless_blend_skirt == null) gdext.classes.NoiseTexture2D.mb_set_seamless_blend_skirt = MethodBind.get("NoiseTexture2D", "set_seamless_blend_skirt", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NoiseTexture2D.mb_set_seamless_blend_skirt, livePtr, seamlessBlendSkirt)
  }

  /** NoiseTexture2D.get_seamless_blend_skirt */
  final def getSeamlessBlendSkirt(): Double = {
    if (gdext.classes.NoiseTexture2D.mb_get_seamless_blend_skirt == null) gdext.classes.NoiseTexture2D.mb_get_seamless_blend_skirt = MethodBind.get("NoiseTexture2D", "get_seamless_blend_skirt", 191475506L)
    Ptrcall.call0[Double](gdext.classes.NoiseTexture2D.mb_get_seamless_blend_skirt, livePtr)
  }

  /** NoiseTexture2D.set_bump_strength */
  final def setBumpStrength(bumpStrength: Double): Unit = {
    if (gdext.classes.NoiseTexture2D.mb_set_bump_strength == null) gdext.classes.NoiseTexture2D.mb_set_bump_strength = MethodBind.get("NoiseTexture2D", "set_bump_strength", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NoiseTexture2D.mb_set_bump_strength, livePtr, bumpStrength)
  }

  /** NoiseTexture2D.get_bump_strength */
  final def getBumpStrength(): Double = {
    if (gdext.classes.NoiseTexture2D.mb_get_bump_strength == null) gdext.classes.NoiseTexture2D.mb_get_bump_strength = MethodBind.get("NoiseTexture2D", "get_bump_strength", 191475506L)
    Ptrcall.call0[Double](gdext.classes.NoiseTexture2D.mb_get_bump_strength, livePtr)
  }

}

object NoiseTexture2D {
  private[classes] var mb_set_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_height: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_generate_mipmaps: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_generating_mipmaps: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_noise: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_noise: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_color_ramp: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_color_ramp: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_seamless: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_seamless: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_invert: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_invert: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_in_3d_space: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_in_3d_space: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_as_normal_map: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_normal_map: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_normalize: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_normalized: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_seamless_blend_skirt: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_seamless_blend_skirt: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bump_strength: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bump_strength: GDExtensionMethodBindPtr = null
}
