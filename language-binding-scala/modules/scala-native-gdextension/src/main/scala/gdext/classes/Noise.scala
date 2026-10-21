package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Noise`, extends `Resource`. */
abstract class Noise extends Resource {
  override def godotClassName: String = "Noise"

  /** Noise.get_noise_1d */
  final def getNoise1d(x: Double): Double = {
    if (gdext.classes.Noise.mb_get_noise_1d == null) gdext.classes.Noise.mb_get_noise_1d = MethodBind.get("Noise", "get_noise_1d", 3919130443L)
    Ptrcall.call1[Double, Double](gdext.classes.Noise.mb_get_noise_1d, livePtr, x)
  }

  /** Noise.get_noise_2d */
  final def getNoise2d(x: Double, y: Double): Double = {
    if (gdext.classes.Noise.mb_get_noise_2d == null) gdext.classes.Noise.mb_get_noise_2d = MethodBind.get("Noise", "get_noise_2d", 2753205203L)
    Ptrcall.call2[Double, Double, Double](gdext.classes.Noise.mb_get_noise_2d, livePtr, x, y)
  }

  /** Noise.get_noise_2dv */
  final def getNoise2dv(v: gdext.builtin.Vector2): Double = {
    if (gdext.classes.Noise.mb_get_noise_2dv == null) gdext.classes.Noise.mb_get_noise_2dv = MethodBind.get("Noise", "get_noise_2dv", 2276447920L)
    Ptrcall.call1[gdext.builtin.Vector2, Double](gdext.classes.Noise.mb_get_noise_2dv, livePtr, v)
  }

  /** Noise.get_noise_3d */
  final def getNoise3d(x: Double, y: Double, z: Double): Double = {
    if (gdext.classes.Noise.mb_get_noise_3d == null) gdext.classes.Noise.mb_get_noise_3d = MethodBind.get("Noise", "get_noise_3d", 973811851L)
    Ptrcall.call3[Double, Double, Double, Double](gdext.classes.Noise.mb_get_noise_3d, livePtr, x, y, z)
  }

  /** Noise.get_noise_3dv */
  final def getNoise3dv(v: gdext.builtin.Vector3): Double = {
    if (gdext.classes.Noise.mb_get_noise_3dv == null) gdext.classes.Noise.mb_get_noise_3dv = MethodBind.get("Noise", "get_noise_3dv", 1109078154L)
    Ptrcall.call1[gdext.builtin.Vector3, Double](gdext.classes.Noise.mb_get_noise_3dv, livePtr, v)
  }

  /** Noise.get_image. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getImage(width: Long, height: Long, invert: Boolean, in_3d_space: Boolean, normalize: Boolean): Image = {
    if (gdext.classes.Noise.mb_get_image == null) gdext.classes.Noise.mb_get_image = MethodBind.get("Noise", "get_image", 3180683109L)
    Wrappers.owned[Image](Ptrcall.call5[Long, Long, Boolean, Boolean, Boolean, Long](gdext.classes.Noise.mb_get_image, livePtr, width, height, invert, in_3d_space, normalize))
  }

  /** Noise.get_seamless_image. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getSeamlessImage(width: Long, height: Long, invert: Boolean, in_3d_space: Boolean, skirt: Double, normalize: Boolean): Image = {
    if (gdext.classes.Noise.mb_get_seamless_image == null) gdext.classes.Noise.mb_get_seamless_image = MethodBind.get("Noise", "get_seamless_image", 2770743602L)
    Wrappers.owned[Image](Ptrcall.call6[Long, Long, Boolean, Boolean, Double, Boolean, Long](gdext.classes.Noise.mb_get_seamless_image, livePtr, width, height, invert, in_3d_space, skirt, normalize))
  }

}

object Noise {
  private[classes] var mb_get_noise_1d: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_noise_2d: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_noise_2dv: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_noise_3d: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_noise_3dv: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_image: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_seamless_image: GDExtensionMethodBindPtr = null
}
