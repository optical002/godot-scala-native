package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `PhysicalSkyMaterial`, extends `Material`. */
abstract class PhysicalSkyMaterial extends Material {

  /** PhysicalSkyMaterial.set_rayleigh_coefficient */
  final def setRayleighCoefficient(rayleigh: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicalSkyMaterial", "set_rayleigh_coefficient", 373806689L), hostObject.objectPtr, rayleigh)

  /** PhysicalSkyMaterial.get_rayleigh_coefficient */
  final def getRayleighCoefficient(): Double =
    Ptrcall.call0[Double](MethodBind.get("PhysicalSkyMaterial", "get_rayleigh_coefficient", 1740695150L), hostObject.objectPtr)

  /** PhysicalSkyMaterial.set_rayleigh_color */
  final def setRayleighColor(color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicalSkyMaterial", "set_rayleigh_color", 2920490490L), hostObject.objectPtr, color)

  /** PhysicalSkyMaterial.get_rayleigh_color */
  final def getRayleighColor(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("PhysicalSkyMaterial", "get_rayleigh_color", 3444240500L), hostObject.objectPtr)

  /** PhysicalSkyMaterial.set_mie_coefficient */
  final def setMieCoefficient(mie: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicalSkyMaterial", "set_mie_coefficient", 373806689L), hostObject.objectPtr, mie)

  /** PhysicalSkyMaterial.get_mie_coefficient */
  final def getMieCoefficient(): Double =
    Ptrcall.call0[Double](MethodBind.get("PhysicalSkyMaterial", "get_mie_coefficient", 1740695150L), hostObject.objectPtr)

  /** PhysicalSkyMaterial.set_mie_eccentricity */
  final def setMieEccentricity(eccentricity: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicalSkyMaterial", "set_mie_eccentricity", 373806689L), hostObject.objectPtr, eccentricity)

  /** PhysicalSkyMaterial.get_mie_eccentricity */
  final def getMieEccentricity(): Double =
    Ptrcall.call0[Double](MethodBind.get("PhysicalSkyMaterial", "get_mie_eccentricity", 1740695150L), hostObject.objectPtr)

  /** PhysicalSkyMaterial.set_mie_color */
  final def setMieColor(color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicalSkyMaterial", "set_mie_color", 2920490490L), hostObject.objectPtr, color)

  /** PhysicalSkyMaterial.get_mie_color */
  final def getMieColor(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("PhysicalSkyMaterial", "get_mie_color", 3444240500L), hostObject.objectPtr)

  /** PhysicalSkyMaterial.set_turbidity */
  final def setTurbidity(turbidity: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicalSkyMaterial", "set_turbidity", 373806689L), hostObject.objectPtr, turbidity)

  /** PhysicalSkyMaterial.get_turbidity */
  final def getTurbidity(): Double =
    Ptrcall.call0[Double](MethodBind.get("PhysicalSkyMaterial", "get_turbidity", 1740695150L), hostObject.objectPtr)

  /** PhysicalSkyMaterial.set_sun_disk_scale */
  final def setSunDiskScale(scale: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicalSkyMaterial", "set_sun_disk_scale", 373806689L), hostObject.objectPtr, scale)

  /** PhysicalSkyMaterial.get_sun_disk_scale */
  final def getSunDiskScale(): Double =
    Ptrcall.call0[Double](MethodBind.get("PhysicalSkyMaterial", "get_sun_disk_scale", 1740695150L), hostObject.objectPtr)

  /** PhysicalSkyMaterial.set_ground_color */
  final def setGroundColor(color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicalSkyMaterial", "set_ground_color", 2920490490L), hostObject.objectPtr, color)

  /** PhysicalSkyMaterial.get_ground_color */
  final def getGroundColor(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("PhysicalSkyMaterial", "get_ground_color", 3444240500L), hostObject.objectPtr)

  /** PhysicalSkyMaterial.set_energy_multiplier */
  final def setEnergyMultiplier(multiplier: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicalSkyMaterial", "set_energy_multiplier", 373806689L), hostObject.objectPtr, multiplier)

  /** PhysicalSkyMaterial.get_energy_multiplier */
  final def getEnergyMultiplier(): Double =
    Ptrcall.call0[Double](MethodBind.get("PhysicalSkyMaterial", "get_energy_multiplier", 1740695150L), hostObject.objectPtr)

  /** PhysicalSkyMaterial.set_use_debanding */
  final def setUseDebanding(use_debanding: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicalSkyMaterial", "set_use_debanding", 2586408642L), hostObject.objectPtr, use_debanding)

  /** PhysicalSkyMaterial.get_use_debanding */
  final def getUseDebanding(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("PhysicalSkyMaterial", "get_use_debanding", 36873697L), hostObject.objectPtr)

  /** PhysicalSkyMaterial.set_night_sky */
  final def setNightSky(night_sky: Texture2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicalSkyMaterial", "set_night_sky", 4051416890L), hostObject.objectPtr, night_sky.hostObject)

  /** PhysicalSkyMaterial.get_night_sky */
  final def getNightSky(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("PhysicalSkyMaterial", "get_night_sky", 3635182373L), hostObject.objectPtr)

}

object PhysicalSkyMaterial {
  /** Class metadata for Gd[PhysicalSkyMaterial] lifetime management and casting. */
  given GodotClass[PhysicalSkyMaterial] with {
    def className = "PhysicalSkyMaterial"
    def isRefCounted = true
    def wrap(o: GodotObject): PhysicalSkyMaterial = new PhysicalSkyMaterial {}.withHost(o.objectPtr)
    def unwrap(t: PhysicalSkyMaterial): GodotObject = t.hostObject
  }
}
