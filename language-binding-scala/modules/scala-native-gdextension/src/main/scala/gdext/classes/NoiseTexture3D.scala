package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `NoiseTexture3D`, extends `Texture3D`. */
abstract class NoiseTexture3D extends Texture3D {
  override def godotClassName: String = "NoiseTexture3D"

  /** NoiseTexture3D.set_width */
  final def setWidth(width: Long): Unit = {
    if (gdext.classes.NoiseTexture3D.mb_set_width == null) gdext.classes.NoiseTexture3D.mb_set_width = MethodBind.get("NoiseTexture3D", "set_width", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.NoiseTexture3D.mb_set_width, livePtr, width)
  }

  /** NoiseTexture3D.set_height */
  final def setHeight(height: Long): Unit = {
    if (gdext.classes.NoiseTexture3D.mb_set_height == null) gdext.classes.NoiseTexture3D.mb_set_height = MethodBind.get("NoiseTexture3D", "set_height", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.NoiseTexture3D.mb_set_height, livePtr, height)
  }

  /** NoiseTexture3D.set_depth */
  final def setDepth(depth: Long): Unit = {
    if (gdext.classes.NoiseTexture3D.mb_set_depth == null) gdext.classes.NoiseTexture3D.mb_set_depth = MethodBind.get("NoiseTexture3D", "set_depth", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.NoiseTexture3D.mb_set_depth, livePtr, depth)
  }

  /** NoiseTexture3D.set_noise */
  final def setNoise(noise: Noise): Unit = {
    if (gdext.classes.NoiseTexture3D.mb_set_noise == null) gdext.classes.NoiseTexture3D.mb_set_noise = MethodBind.get("NoiseTexture3D", "set_noise", 4135492439L)
    Ptrcall.callVoid1(gdext.classes.NoiseTexture3D.mb_set_noise, livePtr, Wrappers.handle(noise))
  }

  /** NoiseTexture3D.get_noise. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getNoise(): Noise = {
    if (gdext.classes.NoiseTexture3D.mb_get_noise == null) gdext.classes.NoiseTexture3D.mb_get_noise = MethodBind.get("NoiseTexture3D", "get_noise", 185851837L)
    Wrappers.owned[Noise](Ptrcall.call0[Long](gdext.classes.NoiseTexture3D.mb_get_noise, livePtr))
  }

  /** NoiseTexture3D.set_color_ramp */
  final def setColorRamp(gradient: Gradient): Unit = {
    if (gdext.classes.NoiseTexture3D.mb_set_color_ramp == null) gdext.classes.NoiseTexture3D.mb_set_color_ramp = MethodBind.get("NoiseTexture3D", "set_color_ramp", 2756054477L)
    Ptrcall.callVoid1(gdext.classes.NoiseTexture3D.mb_set_color_ramp, livePtr, Wrappers.handle(gradient))
  }

  /** NoiseTexture3D.get_color_ramp. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getColorRamp(): Gradient = {
    if (gdext.classes.NoiseTexture3D.mb_get_color_ramp == null) gdext.classes.NoiseTexture3D.mb_get_color_ramp = MethodBind.get("NoiseTexture3D", "get_color_ramp", 132272999L)
    Wrappers.owned[Gradient](Ptrcall.call0[Long](gdext.classes.NoiseTexture3D.mb_get_color_ramp, livePtr))
  }

  /** NoiseTexture3D.set_seamless */
  final def setSeamless(seamless: Boolean): Unit = {
    if (gdext.classes.NoiseTexture3D.mb_set_seamless == null) gdext.classes.NoiseTexture3D.mb_set_seamless = MethodBind.get("NoiseTexture3D", "set_seamless", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.NoiseTexture3D.mb_set_seamless, livePtr, seamless)
  }

  /** NoiseTexture3D.get_seamless */
  final def getSeamless(): Boolean = {
    if (gdext.classes.NoiseTexture3D.mb_get_seamless == null) gdext.classes.NoiseTexture3D.mb_get_seamless = MethodBind.get("NoiseTexture3D", "get_seamless", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.NoiseTexture3D.mb_get_seamless, livePtr)
  }

  /** NoiseTexture3D.set_invert */
  final def setInvert(invert: Boolean): Unit = {
    if (gdext.classes.NoiseTexture3D.mb_set_invert == null) gdext.classes.NoiseTexture3D.mb_set_invert = MethodBind.get("NoiseTexture3D", "set_invert", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.NoiseTexture3D.mb_set_invert, livePtr, invert)
  }

  /** NoiseTexture3D.get_invert */
  final def getInvert(): Boolean = {
    if (gdext.classes.NoiseTexture3D.mb_get_invert == null) gdext.classes.NoiseTexture3D.mb_get_invert = MethodBind.get("NoiseTexture3D", "get_invert", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.NoiseTexture3D.mb_get_invert, livePtr)
  }

  /** NoiseTexture3D.set_normalize */
  final def setNormalize(normalize: Boolean): Unit = {
    if (gdext.classes.NoiseTexture3D.mb_set_normalize == null) gdext.classes.NoiseTexture3D.mb_set_normalize = MethodBind.get("NoiseTexture3D", "set_normalize", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.NoiseTexture3D.mb_set_normalize, livePtr, normalize)
  }

  /** NoiseTexture3D.is_normalized */
  final def isNormalized(): Boolean = {
    if (gdext.classes.NoiseTexture3D.mb_is_normalized == null) gdext.classes.NoiseTexture3D.mb_is_normalized = MethodBind.get("NoiseTexture3D", "is_normalized", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.NoiseTexture3D.mb_is_normalized, livePtr)
  }

  /** NoiseTexture3D.set_seamless_blend_skirt */
  final def setSeamlessBlendSkirt(seamless_blend_skirt: Double): Unit = {
    if (gdext.classes.NoiseTexture3D.mb_set_seamless_blend_skirt == null) gdext.classes.NoiseTexture3D.mb_set_seamless_blend_skirt = MethodBind.get("NoiseTexture3D", "set_seamless_blend_skirt", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NoiseTexture3D.mb_set_seamless_blend_skirt, livePtr, seamless_blend_skirt)
  }

  /** NoiseTexture3D.get_seamless_blend_skirt */
  final def getSeamlessBlendSkirt(): Double = {
    if (gdext.classes.NoiseTexture3D.mb_get_seamless_blend_skirt == null) gdext.classes.NoiseTexture3D.mb_get_seamless_blend_skirt = MethodBind.get("NoiseTexture3D", "get_seamless_blend_skirt", 191475506L)
    Ptrcall.call0[Double](gdext.classes.NoiseTexture3D.mb_get_seamless_blend_skirt, livePtr)
  }

}

object NoiseTexture3D {
  private[classes] var mb_set_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_height: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_depth: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_noise: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_noise: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_color_ramp: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_color_ramp: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_seamless: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_seamless: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_invert: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_invert: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_normalize: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_normalized: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_seamless_blend_skirt: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_seamless_blend_skirt: GDExtensionMethodBindPtr = null
}
