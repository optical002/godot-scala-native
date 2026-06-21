package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `NoiseTexture3D`, extends `Texture3D`. */
abstract class NoiseTexture3D extends Texture3D {

  /** NoiseTexture3D.set_width */
  final def setWidth(width: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("NoiseTexture3D", "set_width", 1286410249L), hostObject.objectPtr, width)

  /** NoiseTexture3D.set_height */
  final def setHeight(height: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("NoiseTexture3D", "set_height", 1286410249L), hostObject.objectPtr, height)

  /** NoiseTexture3D.set_depth */
  final def setDepth(depth: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("NoiseTexture3D", "set_depth", 1286410249L), hostObject.objectPtr, depth)

  /** NoiseTexture3D.set_noise */
  final def setNoise(noise: Noise): Unit =
    Ptrcall.callVoid1(MethodBind.get("NoiseTexture3D", "set_noise", 4135492439L), hostObject.objectPtr, noise.hostObject)

  /** NoiseTexture3D.get_noise */
  final def getNoise(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("NoiseTexture3D", "get_noise", 185851837L), hostObject.objectPtr)

  /** NoiseTexture3D.set_color_ramp */
  final def setColorRamp(gradient: Gradient): Unit =
    Ptrcall.callVoid1(MethodBind.get("NoiseTexture3D", "set_color_ramp", 2756054477L), hostObject.objectPtr, gradient.hostObject)

  /** NoiseTexture3D.get_color_ramp */
  final def getColorRamp(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("NoiseTexture3D", "get_color_ramp", 132272999L), hostObject.objectPtr)

  /** NoiseTexture3D.set_seamless */
  final def setSeamless(seamless: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("NoiseTexture3D", "set_seamless", 2586408642L), hostObject.objectPtr, seamless)

  /** NoiseTexture3D.get_seamless */
  final def getSeamless(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("NoiseTexture3D", "get_seamless", 2240911060L), hostObject.objectPtr)

  /** NoiseTexture3D.set_invert */
  final def setInvert(invert: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("NoiseTexture3D", "set_invert", 2586408642L), hostObject.objectPtr, invert)

  /** NoiseTexture3D.get_invert */
  final def getInvert(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("NoiseTexture3D", "get_invert", 36873697L), hostObject.objectPtr)

  /** NoiseTexture3D.set_normalize */
  final def setNormalize(normalize: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("NoiseTexture3D", "set_normalize", 2586408642L), hostObject.objectPtr, normalize)

  /** NoiseTexture3D.is_normalized */
  final def isNormalized(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("NoiseTexture3D", "is_normalized", 36873697L), hostObject.objectPtr)

  /** NoiseTexture3D.set_seamless_blend_skirt */
  final def setSeamlessBlendSkirt(seamless_blend_skirt: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("NoiseTexture3D", "set_seamless_blend_skirt", 373806689L), hostObject.objectPtr, seamless_blend_skirt)

  /** NoiseTexture3D.get_seamless_blend_skirt */
  final def getSeamlessBlendSkirt(): Double =
    Ptrcall.call0[Double](MethodBind.get("NoiseTexture3D", "get_seamless_blend_skirt", 191475506L), hostObject.objectPtr)

}

object NoiseTexture3D {
  /** Class metadata for Gd[NoiseTexture3D] lifetime management and casting. */
  given GodotClass[NoiseTexture3D] with {
    def className = "NoiseTexture3D"
    def isRefCounted = true
    def wrap(o: GodotObject): NoiseTexture3D = new NoiseTexture3D {}.withHost(o.objectPtr)
    def unwrap(t: NoiseTexture3D): GodotObject = t.hostObject
  }
}
