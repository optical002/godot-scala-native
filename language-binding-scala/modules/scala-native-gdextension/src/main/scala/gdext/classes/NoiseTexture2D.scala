package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `NoiseTexture2D`, extends `Texture2D`. */
abstract class NoiseTexture2D extends Texture2D {

  /** NoiseTexture2D.set_width */
  final def setWidth(width: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("NoiseTexture2D", "set_width", 1286410249L), hostObject.objectPtr, width)

  /** NoiseTexture2D.set_height */
  final def setHeight(height: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("NoiseTexture2D", "set_height", 1286410249L), hostObject.objectPtr, height)

  /** NoiseTexture2D.set_generate_mipmaps */
  final def setGenerateMipmaps(invert: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("NoiseTexture2D", "set_generate_mipmaps", 2586408642L), hostObject.objectPtr, invert)

  /** NoiseTexture2D.is_generating_mipmaps */
  final def isGeneratingMipmaps(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("NoiseTexture2D", "is_generating_mipmaps", 36873697L), hostObject.objectPtr)

  /** NoiseTexture2D.set_noise */
  final def setNoise(noise: Noise): Unit =
    Ptrcall.callVoid1(MethodBind.get("NoiseTexture2D", "set_noise", 4135492439L), hostObject.objectPtr, noise.hostObject)

  /** NoiseTexture2D.get_noise */
  final def getNoise(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("NoiseTexture2D", "get_noise", 185851837L), hostObject.objectPtr)

  /** NoiseTexture2D.set_color_ramp */
  final def setColorRamp(gradient: Gradient): Unit =
    Ptrcall.callVoid1(MethodBind.get("NoiseTexture2D", "set_color_ramp", 2756054477L), hostObject.objectPtr, gradient.hostObject)

  /** NoiseTexture2D.get_color_ramp */
  final def getColorRamp(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("NoiseTexture2D", "get_color_ramp", 132272999L), hostObject.objectPtr)

  /** NoiseTexture2D.set_seamless */
  final def setSeamless(seamless: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("NoiseTexture2D", "set_seamless", 2586408642L), hostObject.objectPtr, seamless)

  /** NoiseTexture2D.get_seamless */
  final def getSeamless(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("NoiseTexture2D", "get_seamless", 2240911060L), hostObject.objectPtr)

  /** NoiseTexture2D.set_invert */
  final def setInvert(invert: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("NoiseTexture2D", "set_invert", 2586408642L), hostObject.objectPtr, invert)

  /** NoiseTexture2D.get_invert */
  final def getInvert(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("NoiseTexture2D", "get_invert", 36873697L), hostObject.objectPtr)

  /** NoiseTexture2D.set_in_3d_space */
  final def setIn3dSpace(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("NoiseTexture2D", "set_in_3d_space", 2586408642L), hostObject.objectPtr, enable)

  /** NoiseTexture2D.is_in_3d_space */
  final def isIn3dSpace(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("NoiseTexture2D", "is_in_3d_space", 36873697L), hostObject.objectPtr)

  /** NoiseTexture2D.set_as_normal_map */
  final def setAsNormalMap(as_normal_map: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("NoiseTexture2D", "set_as_normal_map", 2586408642L), hostObject.objectPtr, as_normal_map)

  /** NoiseTexture2D.is_normal_map */
  final def isNormalMap(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("NoiseTexture2D", "is_normal_map", 2240911060L), hostObject.objectPtr)

  /** NoiseTexture2D.set_normalize */
  final def setNormalize(normalize: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("NoiseTexture2D", "set_normalize", 2586408642L), hostObject.objectPtr, normalize)

  /** NoiseTexture2D.is_normalized */
  final def isNormalized(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("NoiseTexture2D", "is_normalized", 36873697L), hostObject.objectPtr)

  /** NoiseTexture2D.set_seamless_blend_skirt */
  final def setSeamlessBlendSkirt(seamless_blend_skirt: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("NoiseTexture2D", "set_seamless_blend_skirt", 373806689L), hostObject.objectPtr, seamless_blend_skirt)

  /** NoiseTexture2D.get_seamless_blend_skirt */
  final def getSeamlessBlendSkirt(): Double =
    Ptrcall.call0[Double](MethodBind.get("NoiseTexture2D", "get_seamless_blend_skirt", 191475506L), hostObject.objectPtr)

  /** NoiseTexture2D.set_bump_strength */
  final def setBumpStrength(bump_strength: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("NoiseTexture2D", "set_bump_strength", 373806689L), hostObject.objectPtr, bump_strength)

  /** NoiseTexture2D.get_bump_strength */
  final def getBumpStrength(): Double =
    Ptrcall.call0[Double](MethodBind.get("NoiseTexture2D", "get_bump_strength", 191475506L), hostObject.objectPtr)

}

object NoiseTexture2D {
  /** Class metadata for Gd[NoiseTexture2D] lifetime management and casting. */
  given GodotClass[NoiseTexture2D] with {
    def className = "NoiseTexture2D"
    def isRefCounted = true
    def wrap(o: GodotObject): NoiseTexture2D = new NoiseTexture2D {}.withHost(o.objectPtr)
    def unwrap(t: NoiseTexture2D): GodotObject = t.hostObject
  }
}
