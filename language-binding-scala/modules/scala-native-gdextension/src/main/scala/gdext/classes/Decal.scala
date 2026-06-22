package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `Decal`, extends `VisualInstance3D`. */
abstract class Decal extends VisualInstance3D {

  /** Decal.set_size */
  final def setSize(size: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("Decal", "set_size", 3460891852L), hostObject.objectPtr, size)

  /** Decal.get_size */
  final def getSize(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("Decal", "get_size", 3360562783L), hostObject.objectPtr)

  /** Decal.set_texture */
  final def setTexture(`type`: Long, texture: Texture2D): Unit =
    Ptrcall.callVoid2(MethodBind.get("Decal", "set_texture", 2086764391L), hostObject.objectPtr, `type`, texture.hostObject)

  /** Decal.get_texture */
  final def getTexture(`type`: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("Decal", "get_texture", 3244119503L), hostObject.objectPtr, `type`)

  /** Decal.set_emission_energy */
  final def setEmissionEnergy(energy: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Decal", "set_emission_energy", 373806689L), hostObject.objectPtr, energy)

  /** Decal.get_emission_energy */
  final def getEmissionEnergy(): Double =
    Ptrcall.call0[Double](MethodBind.get("Decal", "get_emission_energy", 1740695150L), hostObject.objectPtr)

  /** Decal.set_albedo_mix */
  final def setAlbedoMix(energy: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Decal", "set_albedo_mix", 373806689L), hostObject.objectPtr, energy)

  /** Decal.get_albedo_mix */
  final def getAlbedoMix(): Double =
    Ptrcall.call0[Double](MethodBind.get("Decal", "get_albedo_mix", 1740695150L), hostObject.objectPtr)

  /** Decal.set_modulate */
  final def setModulate(color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("Decal", "set_modulate", 2920490490L), hostObject.objectPtr, color)

  /** Decal.get_modulate */
  final def getModulate(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("Decal", "get_modulate", 3444240500L), hostObject.objectPtr)

  /** Decal.set_upper_fade */
  final def setUpperFade(fade: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Decal", "set_upper_fade", 373806689L), hostObject.objectPtr, fade)

  /** Decal.get_upper_fade */
  final def getUpperFade(): Double =
    Ptrcall.call0[Double](MethodBind.get("Decal", "get_upper_fade", 1740695150L), hostObject.objectPtr)

  /** Decal.set_lower_fade */
  final def setLowerFade(fade: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Decal", "set_lower_fade", 373806689L), hostObject.objectPtr, fade)

  /** Decal.get_lower_fade */
  final def getLowerFade(): Double =
    Ptrcall.call0[Double](MethodBind.get("Decal", "get_lower_fade", 1740695150L), hostObject.objectPtr)

  /** Decal.set_normal_fade */
  final def setNormalFade(fade: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Decal", "set_normal_fade", 373806689L), hostObject.objectPtr, fade)

  /** Decal.get_normal_fade */
  final def getNormalFade(): Double =
    Ptrcall.call0[Double](MethodBind.get("Decal", "get_normal_fade", 1740695150L), hostObject.objectPtr)

  /** Decal.set_enable_distance_fade */
  final def setEnableDistanceFade(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Decal", "set_enable_distance_fade", 2586408642L), hostObject.objectPtr, enable)

  /** Decal.is_distance_fade_enabled */
  final def isDistanceFadeEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Decal", "is_distance_fade_enabled", 36873697L), hostObject.objectPtr)

  /** Decal.set_distance_fade_begin */
  final def setDistanceFadeBegin(distance: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Decal", "set_distance_fade_begin", 373806689L), hostObject.objectPtr, distance)

  /** Decal.get_distance_fade_begin */
  final def getDistanceFadeBegin(): Double =
    Ptrcall.call0[Double](MethodBind.get("Decal", "get_distance_fade_begin", 1740695150L), hostObject.objectPtr)

  /** Decal.set_distance_fade_length */
  final def setDistanceFadeLength(distance: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Decal", "set_distance_fade_length", 373806689L), hostObject.objectPtr, distance)

  /** Decal.get_distance_fade_length */
  final def getDistanceFadeLength(): Double =
    Ptrcall.call0[Double](MethodBind.get("Decal", "get_distance_fade_length", 1740695150L), hostObject.objectPtr)

  /** Decal.set_cull_mask */
  final def setCullMask(mask: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Decal", "set_cull_mask", 1286410249L), hostObject.objectPtr, mask)

  /** Decal.get_cull_mask */
  final def getCullMask(): Long =
    Ptrcall.call0[Long](MethodBind.get("Decal", "get_cull_mask", 3905245786L), hostObject.objectPtr)

}

object Decal {
  /** Class metadata for Gd[Decal] lifetime management and casting. */
  given GodotClass[Decal] with {
    def className = "Decal"
    def isRefCounted = false
    def wrap(o: GodotObject): Decal = new Decal {}.withHost(o.objectPtr)
    def unwrap(t: Decal): GodotObject = t.hostObject
  }
}
