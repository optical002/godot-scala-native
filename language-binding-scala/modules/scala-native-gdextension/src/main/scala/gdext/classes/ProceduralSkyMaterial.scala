package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `ProceduralSkyMaterial`, extends `Material`. */
abstract class ProceduralSkyMaterial extends Material {

  /** ProceduralSkyMaterial.set_sky_top_color */
  final def setSkyTopColor(color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("ProceduralSkyMaterial", "set_sky_top_color", 2920490490L), hostObject.objectPtr, color)

  /** ProceduralSkyMaterial.get_sky_top_color */
  final def getSkyTopColor(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("ProceduralSkyMaterial", "get_sky_top_color", 3444240500L), hostObject.objectPtr)

  /** ProceduralSkyMaterial.set_sky_horizon_color */
  final def setSkyHorizonColor(color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("ProceduralSkyMaterial", "set_sky_horizon_color", 2920490490L), hostObject.objectPtr, color)

  /** ProceduralSkyMaterial.get_sky_horizon_color */
  final def getSkyHorizonColor(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("ProceduralSkyMaterial", "get_sky_horizon_color", 3444240500L), hostObject.objectPtr)

  /** ProceduralSkyMaterial.set_sky_curve */
  final def setSkyCurve(curve: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("ProceduralSkyMaterial", "set_sky_curve", 373806689L), hostObject.objectPtr, curve)

  /** ProceduralSkyMaterial.get_sky_curve */
  final def getSkyCurve(): Double =
    Ptrcall.call0[Double](MethodBind.get("ProceduralSkyMaterial", "get_sky_curve", 1740695150L), hostObject.objectPtr)

  /** ProceduralSkyMaterial.set_sky_energy_multiplier */
  final def setSkyEnergyMultiplier(multiplier: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("ProceduralSkyMaterial", "set_sky_energy_multiplier", 373806689L), hostObject.objectPtr, multiplier)

  /** ProceduralSkyMaterial.get_sky_energy_multiplier */
  final def getSkyEnergyMultiplier(): Double =
    Ptrcall.call0[Double](MethodBind.get("ProceduralSkyMaterial", "get_sky_energy_multiplier", 1740695150L), hostObject.objectPtr)

  /** ProceduralSkyMaterial.set_sky_cover */
  final def setSkyCover(sky_cover: Texture2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("ProceduralSkyMaterial", "set_sky_cover", 4051416890L), hostObject.objectPtr, sky_cover.hostObject)

  /** ProceduralSkyMaterial.get_sky_cover */
  final def getSkyCover(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("ProceduralSkyMaterial", "get_sky_cover", 3635182373L), hostObject.objectPtr)

  /** ProceduralSkyMaterial.set_sky_cover_modulate */
  final def setSkyCoverModulate(color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("ProceduralSkyMaterial", "set_sky_cover_modulate", 2920490490L), hostObject.objectPtr, color)

  /** ProceduralSkyMaterial.get_sky_cover_modulate */
  final def getSkyCoverModulate(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("ProceduralSkyMaterial", "get_sky_cover_modulate", 3444240500L), hostObject.objectPtr)

  /** ProceduralSkyMaterial.set_ground_bottom_color */
  final def setGroundBottomColor(color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("ProceduralSkyMaterial", "set_ground_bottom_color", 2920490490L), hostObject.objectPtr, color)

  /** ProceduralSkyMaterial.get_ground_bottom_color */
  final def getGroundBottomColor(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("ProceduralSkyMaterial", "get_ground_bottom_color", 3444240500L), hostObject.objectPtr)

  /** ProceduralSkyMaterial.set_ground_horizon_color */
  final def setGroundHorizonColor(color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("ProceduralSkyMaterial", "set_ground_horizon_color", 2920490490L), hostObject.objectPtr, color)

  /** ProceduralSkyMaterial.get_ground_horizon_color */
  final def getGroundHorizonColor(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("ProceduralSkyMaterial", "get_ground_horizon_color", 3444240500L), hostObject.objectPtr)

  /** ProceduralSkyMaterial.set_ground_curve */
  final def setGroundCurve(curve: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("ProceduralSkyMaterial", "set_ground_curve", 373806689L), hostObject.objectPtr, curve)

  /** ProceduralSkyMaterial.get_ground_curve */
  final def getGroundCurve(): Double =
    Ptrcall.call0[Double](MethodBind.get("ProceduralSkyMaterial", "get_ground_curve", 1740695150L), hostObject.objectPtr)

  /** ProceduralSkyMaterial.set_ground_energy_multiplier */
  final def setGroundEnergyMultiplier(energy: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("ProceduralSkyMaterial", "set_ground_energy_multiplier", 373806689L), hostObject.objectPtr, energy)

  /** ProceduralSkyMaterial.get_ground_energy_multiplier */
  final def getGroundEnergyMultiplier(): Double =
    Ptrcall.call0[Double](MethodBind.get("ProceduralSkyMaterial", "get_ground_energy_multiplier", 1740695150L), hostObject.objectPtr)

  /** ProceduralSkyMaterial.set_sun_angle_max */
  final def setSunAngleMax(degrees: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("ProceduralSkyMaterial", "set_sun_angle_max", 373806689L), hostObject.objectPtr, degrees)

  /** ProceduralSkyMaterial.get_sun_angle_max */
  final def getSunAngleMax(): Double =
    Ptrcall.call0[Double](MethodBind.get("ProceduralSkyMaterial", "get_sun_angle_max", 1740695150L), hostObject.objectPtr)

  /** ProceduralSkyMaterial.set_sun_curve */
  final def setSunCurve(curve: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("ProceduralSkyMaterial", "set_sun_curve", 373806689L), hostObject.objectPtr, curve)

  /** ProceduralSkyMaterial.get_sun_curve */
  final def getSunCurve(): Double =
    Ptrcall.call0[Double](MethodBind.get("ProceduralSkyMaterial", "get_sun_curve", 1740695150L), hostObject.objectPtr)

  /** ProceduralSkyMaterial.set_use_debanding */
  final def setUseDebanding(use_debanding: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("ProceduralSkyMaterial", "set_use_debanding", 2586408642L), hostObject.objectPtr, use_debanding)

  /** ProceduralSkyMaterial.get_use_debanding */
  final def getUseDebanding(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("ProceduralSkyMaterial", "get_use_debanding", 36873697L), hostObject.objectPtr)

  /** ProceduralSkyMaterial.set_energy_multiplier */
  final def setEnergyMultiplier(multiplier: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("ProceduralSkyMaterial", "set_energy_multiplier", 373806689L), hostObject.objectPtr, multiplier)

  /** ProceduralSkyMaterial.get_energy_multiplier */
  final def getEnergyMultiplier(): Double =
    Ptrcall.call0[Double](MethodBind.get("ProceduralSkyMaterial", "get_energy_multiplier", 1740695150L), hostObject.objectPtr)

}

object ProceduralSkyMaterial {
  /** Class metadata for Gd[ProceduralSkyMaterial] lifetime management and casting. */
  given GodotClass[ProceduralSkyMaterial] with {
    def className = "ProceduralSkyMaterial"
    def isRefCounted = true
    def wrap(o: GodotObject): ProceduralSkyMaterial = new ProceduralSkyMaterial {}.withHost(o.objectPtr)
    def unwrap(t: ProceduralSkyMaterial): GodotObject = t.hostObject
  }
}
