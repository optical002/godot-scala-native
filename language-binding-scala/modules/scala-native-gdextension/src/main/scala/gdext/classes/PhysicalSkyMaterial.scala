package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `PhysicalSkyMaterial`, extends `Material`. */
abstract class PhysicalSkyMaterial extends Material {
  override def godotClassName: String = "PhysicalSkyMaterial"

  /** PhysicalSkyMaterial.set_rayleigh_coefficient */
  final def setRayleighCoefficient(rayleigh: Double): Unit = {
    if (gdext.classes.PhysicalSkyMaterial.mb_set_rayleigh_coefficient == null) gdext.classes.PhysicalSkyMaterial.mb_set_rayleigh_coefficient = MethodBind.get("PhysicalSkyMaterial", "set_rayleigh_coefficient", 373806689L)
    Ptrcall.callVoid1(gdext.classes.PhysicalSkyMaterial.mb_set_rayleigh_coefficient, livePtr, rayleigh)
  }

  /** PhysicalSkyMaterial.get_rayleigh_coefficient */
  final def getRayleighCoefficient(): Double = {
    if (gdext.classes.PhysicalSkyMaterial.mb_get_rayleigh_coefficient == null) gdext.classes.PhysicalSkyMaterial.mb_get_rayleigh_coefficient = MethodBind.get("PhysicalSkyMaterial", "get_rayleigh_coefficient", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.PhysicalSkyMaterial.mb_get_rayleigh_coefficient, livePtr)
  }

  /** PhysicalSkyMaterial.set_rayleigh_color */
  final def setRayleighColor(color: gdext.builtin.Color): Unit = {
    if (gdext.classes.PhysicalSkyMaterial.mb_set_rayleigh_color == null) gdext.classes.PhysicalSkyMaterial.mb_set_rayleigh_color = MethodBind.get("PhysicalSkyMaterial", "set_rayleigh_color", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.PhysicalSkyMaterial.mb_set_rayleigh_color, livePtr, color)
  }

  /** PhysicalSkyMaterial.get_rayleigh_color */
  final def getRayleighColor(): gdext.builtin.Color = {
    if (gdext.classes.PhysicalSkyMaterial.mb_get_rayleigh_color == null) gdext.classes.PhysicalSkyMaterial.mb_get_rayleigh_color = MethodBind.get("PhysicalSkyMaterial", "get_rayleigh_color", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.PhysicalSkyMaterial.mb_get_rayleigh_color, livePtr)
  }

  /** PhysicalSkyMaterial.set_mie_coefficient */
  final def setMieCoefficient(mie: Double): Unit = {
    if (gdext.classes.PhysicalSkyMaterial.mb_set_mie_coefficient == null) gdext.classes.PhysicalSkyMaterial.mb_set_mie_coefficient = MethodBind.get("PhysicalSkyMaterial", "set_mie_coefficient", 373806689L)
    Ptrcall.callVoid1(gdext.classes.PhysicalSkyMaterial.mb_set_mie_coefficient, livePtr, mie)
  }

  /** PhysicalSkyMaterial.get_mie_coefficient */
  final def getMieCoefficient(): Double = {
    if (gdext.classes.PhysicalSkyMaterial.mb_get_mie_coefficient == null) gdext.classes.PhysicalSkyMaterial.mb_get_mie_coefficient = MethodBind.get("PhysicalSkyMaterial", "get_mie_coefficient", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.PhysicalSkyMaterial.mb_get_mie_coefficient, livePtr)
  }

  /** PhysicalSkyMaterial.set_mie_eccentricity */
  final def setMieEccentricity(eccentricity: Double): Unit = {
    if (gdext.classes.PhysicalSkyMaterial.mb_set_mie_eccentricity == null) gdext.classes.PhysicalSkyMaterial.mb_set_mie_eccentricity = MethodBind.get("PhysicalSkyMaterial", "set_mie_eccentricity", 373806689L)
    Ptrcall.callVoid1(gdext.classes.PhysicalSkyMaterial.mb_set_mie_eccentricity, livePtr, eccentricity)
  }

  /** PhysicalSkyMaterial.get_mie_eccentricity */
  final def getMieEccentricity(): Double = {
    if (gdext.classes.PhysicalSkyMaterial.mb_get_mie_eccentricity == null) gdext.classes.PhysicalSkyMaterial.mb_get_mie_eccentricity = MethodBind.get("PhysicalSkyMaterial", "get_mie_eccentricity", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.PhysicalSkyMaterial.mb_get_mie_eccentricity, livePtr)
  }

  /** PhysicalSkyMaterial.set_mie_color */
  final def setMieColor(color: gdext.builtin.Color): Unit = {
    if (gdext.classes.PhysicalSkyMaterial.mb_set_mie_color == null) gdext.classes.PhysicalSkyMaterial.mb_set_mie_color = MethodBind.get("PhysicalSkyMaterial", "set_mie_color", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.PhysicalSkyMaterial.mb_set_mie_color, livePtr, color)
  }

  /** PhysicalSkyMaterial.get_mie_color */
  final def getMieColor(): gdext.builtin.Color = {
    if (gdext.classes.PhysicalSkyMaterial.mb_get_mie_color == null) gdext.classes.PhysicalSkyMaterial.mb_get_mie_color = MethodBind.get("PhysicalSkyMaterial", "get_mie_color", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.PhysicalSkyMaterial.mb_get_mie_color, livePtr)
  }

  /** PhysicalSkyMaterial.set_turbidity */
  final def setTurbidity(turbidity: Double): Unit = {
    if (gdext.classes.PhysicalSkyMaterial.mb_set_turbidity == null) gdext.classes.PhysicalSkyMaterial.mb_set_turbidity = MethodBind.get("PhysicalSkyMaterial", "set_turbidity", 373806689L)
    Ptrcall.callVoid1(gdext.classes.PhysicalSkyMaterial.mb_set_turbidity, livePtr, turbidity)
  }

  /** PhysicalSkyMaterial.get_turbidity */
  final def getTurbidity(): Double = {
    if (gdext.classes.PhysicalSkyMaterial.mb_get_turbidity == null) gdext.classes.PhysicalSkyMaterial.mb_get_turbidity = MethodBind.get("PhysicalSkyMaterial", "get_turbidity", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.PhysicalSkyMaterial.mb_get_turbidity, livePtr)
  }

  /** PhysicalSkyMaterial.set_sun_disk_scale */
  final def setSunDiskScale(scale: Double): Unit = {
    if (gdext.classes.PhysicalSkyMaterial.mb_set_sun_disk_scale == null) gdext.classes.PhysicalSkyMaterial.mb_set_sun_disk_scale = MethodBind.get("PhysicalSkyMaterial", "set_sun_disk_scale", 373806689L)
    Ptrcall.callVoid1(gdext.classes.PhysicalSkyMaterial.mb_set_sun_disk_scale, livePtr, scale)
  }

  /** PhysicalSkyMaterial.get_sun_disk_scale */
  final def getSunDiskScale(): Double = {
    if (gdext.classes.PhysicalSkyMaterial.mb_get_sun_disk_scale == null) gdext.classes.PhysicalSkyMaterial.mb_get_sun_disk_scale = MethodBind.get("PhysicalSkyMaterial", "get_sun_disk_scale", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.PhysicalSkyMaterial.mb_get_sun_disk_scale, livePtr)
  }

  /** PhysicalSkyMaterial.set_ground_color */
  final def setGroundColor(color: gdext.builtin.Color): Unit = {
    if (gdext.classes.PhysicalSkyMaterial.mb_set_ground_color == null) gdext.classes.PhysicalSkyMaterial.mb_set_ground_color = MethodBind.get("PhysicalSkyMaterial", "set_ground_color", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.PhysicalSkyMaterial.mb_set_ground_color, livePtr, color)
  }

  /** PhysicalSkyMaterial.get_ground_color */
  final def getGroundColor(): gdext.builtin.Color = {
    if (gdext.classes.PhysicalSkyMaterial.mb_get_ground_color == null) gdext.classes.PhysicalSkyMaterial.mb_get_ground_color = MethodBind.get("PhysicalSkyMaterial", "get_ground_color", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.PhysicalSkyMaterial.mb_get_ground_color, livePtr)
  }

  /** PhysicalSkyMaterial.set_energy_multiplier */
  final def setEnergyMultiplier(multiplier: Double): Unit = {
    if (gdext.classes.PhysicalSkyMaterial.mb_set_energy_multiplier == null) gdext.classes.PhysicalSkyMaterial.mb_set_energy_multiplier = MethodBind.get("PhysicalSkyMaterial", "set_energy_multiplier", 373806689L)
    Ptrcall.callVoid1(gdext.classes.PhysicalSkyMaterial.mb_set_energy_multiplier, livePtr, multiplier)
  }

  /** PhysicalSkyMaterial.get_energy_multiplier */
  final def getEnergyMultiplier(): Double = {
    if (gdext.classes.PhysicalSkyMaterial.mb_get_energy_multiplier == null) gdext.classes.PhysicalSkyMaterial.mb_get_energy_multiplier = MethodBind.get("PhysicalSkyMaterial", "get_energy_multiplier", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.PhysicalSkyMaterial.mb_get_energy_multiplier, livePtr)
  }

  /** PhysicalSkyMaterial.set_use_debanding */
  final def setUseDebanding(use_debanding: Boolean): Unit = {
    if (gdext.classes.PhysicalSkyMaterial.mb_set_use_debanding == null) gdext.classes.PhysicalSkyMaterial.mb_set_use_debanding = MethodBind.get("PhysicalSkyMaterial", "set_use_debanding", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.PhysicalSkyMaterial.mb_set_use_debanding, livePtr, use_debanding)
  }

  /** PhysicalSkyMaterial.get_use_debanding */
  final def getUseDebanding(): Boolean = {
    if (gdext.classes.PhysicalSkyMaterial.mb_get_use_debanding == null) gdext.classes.PhysicalSkyMaterial.mb_get_use_debanding = MethodBind.get("PhysicalSkyMaterial", "get_use_debanding", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.PhysicalSkyMaterial.mb_get_use_debanding, livePtr)
  }

  /** PhysicalSkyMaterial.set_night_sky */
  final def setNightSky(night_sky: Texture2D): Unit = {
    if (gdext.classes.PhysicalSkyMaterial.mb_set_night_sky == null) gdext.classes.PhysicalSkyMaterial.mb_set_night_sky = MethodBind.get("PhysicalSkyMaterial", "set_night_sky", 4051416890L)
    Ptrcall.callVoid1(gdext.classes.PhysicalSkyMaterial.mb_set_night_sky, livePtr, Wrappers.handle(night_sky))
  }

  /** PhysicalSkyMaterial.get_night_sky. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getNightSky(): Texture2D = {
    if (gdext.classes.PhysicalSkyMaterial.mb_get_night_sky == null) gdext.classes.PhysicalSkyMaterial.mb_get_night_sky = MethodBind.get("PhysicalSkyMaterial", "get_night_sky", 3635182373L)
    Wrappers.owned[Texture2D](Ptrcall.call0[Long](gdext.classes.PhysicalSkyMaterial.mb_get_night_sky, livePtr))
  }

}

object PhysicalSkyMaterial {
  private[classes] var mb_set_rayleigh_coefficient: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_rayleigh_coefficient: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_rayleigh_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_rayleigh_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_mie_coefficient: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_mie_coefficient: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_mie_eccentricity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_mie_eccentricity: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_mie_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_mie_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_turbidity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_turbidity: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_sun_disk_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_sun_disk_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_ground_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_ground_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_energy_multiplier: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_energy_multiplier: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_use_debanding: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_use_debanding: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_night_sky: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_night_sky: GDExtensionMethodBindPtr = null
}
