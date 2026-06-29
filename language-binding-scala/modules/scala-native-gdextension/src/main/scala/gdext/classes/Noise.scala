package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `Noise`, extends `Resource`. */
abstract class Noise extends Resource {
  override def godotClassName: String = "Noise"

  /** Noise.get_noise_1d */
  final def getNoise1d(x: Double): Double =
    Ptrcall.call1[Double, Double](MethodBind.get("Noise", "get_noise_1d", 3919130443L), hostObject.objectPtr, x)

  /** Noise.get_noise_2d */
  final def getNoise2d(x: Double, y: Double): Double =
    Ptrcall.call2[Double, Double, Double](MethodBind.get("Noise", "get_noise_2d", 2753205203L), hostObject.objectPtr, x, y)

  /** Noise.get_noise_2dv */
  final def getNoise2dv(v: gdext.builtin.Vector2): Double =
    Ptrcall.call1[gdext.builtin.Vector2, Double](MethodBind.get("Noise", "get_noise_2dv", 2276447920L), hostObject.objectPtr, v)

  /** Noise.get_noise_3d */
  final def getNoise3d(x: Double, y: Double, z: Double): Double =
    Ptrcall.call3[Double, Double, Double, Double](MethodBind.get("Noise", "get_noise_3d", 973811851L), hostObject.objectPtr, x, y, z)

  /** Noise.get_noise_3dv */
  final def getNoise3dv(v: gdext.builtin.Vector3): Double =
    Ptrcall.call1[gdext.builtin.Vector3, Double](MethodBind.get("Noise", "get_noise_3dv", 1109078154L), hostObject.objectPtr, v)

  /** Noise.get_image */
  final def getImage(width: Long, height: Long, invert: Boolean, in_3d_space: Boolean, normalize: Boolean): GodotObject =
    Ptrcall.call5[Long, Long, Boolean, Boolean, Boolean, GodotObject](MethodBind.get("Noise", "get_image", 3180683109L), hostObject.objectPtr, width, height, invert, in_3d_space, normalize)

  /** Noise.get_seamless_image */
  final def getSeamlessImage(width: Long, height: Long, invert: Boolean, in_3d_space: Boolean, skirt: Double, normalize: Boolean): GodotObject =
    Ptrcall.call6[Long, Long, Boolean, Boolean, Double, Boolean, GodotObject](MethodBind.get("Noise", "get_seamless_image", 2770743602L), hostObject.objectPtr, width, height, invert, in_3d_space, skirt, normalize)

}
