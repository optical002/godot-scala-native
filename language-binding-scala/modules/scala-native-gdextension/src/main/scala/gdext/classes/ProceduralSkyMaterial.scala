package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `ProceduralSkyMaterial`, extends `Material`. */
abstract class ProceduralSkyMaterial extends Material {
  override def godotClassName: String = "ProceduralSkyMaterial"

  /** ProceduralSkyMaterial.set_sky_top_color */
  final def setSkyTopColor(color: gdext.builtin.Color): Unit = {
    if (gdext.classes.ProceduralSkyMaterial.mb_set_sky_top_color == null) gdext.classes.ProceduralSkyMaterial.mb_set_sky_top_color = MethodBind.get("ProceduralSkyMaterial", "set_sky_top_color", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.ProceduralSkyMaterial.mb_set_sky_top_color, livePtr, color)
  }

  /** ProceduralSkyMaterial.get_sky_top_color */
  final def getSkyTopColor(): gdext.builtin.Color = {
    if (gdext.classes.ProceduralSkyMaterial.mb_get_sky_top_color == null) gdext.classes.ProceduralSkyMaterial.mb_get_sky_top_color = MethodBind.get("ProceduralSkyMaterial", "get_sky_top_color", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.ProceduralSkyMaterial.mb_get_sky_top_color, livePtr)
  }

  /** ProceduralSkyMaterial.set_sky_horizon_color */
  final def setSkyHorizonColor(color: gdext.builtin.Color): Unit = {
    if (gdext.classes.ProceduralSkyMaterial.mb_set_sky_horizon_color == null) gdext.classes.ProceduralSkyMaterial.mb_set_sky_horizon_color = MethodBind.get("ProceduralSkyMaterial", "set_sky_horizon_color", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.ProceduralSkyMaterial.mb_set_sky_horizon_color, livePtr, color)
  }

  /** ProceduralSkyMaterial.get_sky_horizon_color */
  final def getSkyHorizonColor(): gdext.builtin.Color = {
    if (gdext.classes.ProceduralSkyMaterial.mb_get_sky_horizon_color == null) gdext.classes.ProceduralSkyMaterial.mb_get_sky_horizon_color = MethodBind.get("ProceduralSkyMaterial", "get_sky_horizon_color", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.ProceduralSkyMaterial.mb_get_sky_horizon_color, livePtr)
  }

  /** ProceduralSkyMaterial.set_sky_curve */
  final def setSkyCurve(curve: Double): Unit = {
    if (gdext.classes.ProceduralSkyMaterial.mb_set_sky_curve == null) gdext.classes.ProceduralSkyMaterial.mb_set_sky_curve = MethodBind.get("ProceduralSkyMaterial", "set_sky_curve", 373806689L)
    Ptrcall.callVoid1(gdext.classes.ProceduralSkyMaterial.mb_set_sky_curve, livePtr, curve)
  }

  /** ProceduralSkyMaterial.get_sky_curve */
  final def getSkyCurve(): Double = {
    if (gdext.classes.ProceduralSkyMaterial.mb_get_sky_curve == null) gdext.classes.ProceduralSkyMaterial.mb_get_sky_curve = MethodBind.get("ProceduralSkyMaterial", "get_sky_curve", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.ProceduralSkyMaterial.mb_get_sky_curve, livePtr)
  }

  /** ProceduralSkyMaterial.set_sky_energy_multiplier */
  final def setSkyEnergyMultiplier(multiplier: Double): Unit = {
    if (gdext.classes.ProceduralSkyMaterial.mb_set_sky_energy_multiplier == null) gdext.classes.ProceduralSkyMaterial.mb_set_sky_energy_multiplier = MethodBind.get("ProceduralSkyMaterial", "set_sky_energy_multiplier", 373806689L)
    Ptrcall.callVoid1(gdext.classes.ProceduralSkyMaterial.mb_set_sky_energy_multiplier, livePtr, multiplier)
  }

  /** ProceduralSkyMaterial.get_sky_energy_multiplier */
  final def getSkyEnergyMultiplier(): Double = {
    if (gdext.classes.ProceduralSkyMaterial.mb_get_sky_energy_multiplier == null) gdext.classes.ProceduralSkyMaterial.mb_get_sky_energy_multiplier = MethodBind.get("ProceduralSkyMaterial", "get_sky_energy_multiplier", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.ProceduralSkyMaterial.mb_get_sky_energy_multiplier, livePtr)
  }

  /** ProceduralSkyMaterial.set_sky_cover */
  final def setSkyCover(sky_cover: Texture2D): Unit = {
    if (gdext.classes.ProceduralSkyMaterial.mb_set_sky_cover == null) gdext.classes.ProceduralSkyMaterial.mb_set_sky_cover = MethodBind.get("ProceduralSkyMaterial", "set_sky_cover", 4051416890L)
    Ptrcall.callVoid1(gdext.classes.ProceduralSkyMaterial.mb_set_sky_cover, livePtr, Wrappers.handle(sky_cover))
  }

  /** ProceduralSkyMaterial.get_sky_cover. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getSkyCover(): Texture2D = {
    if (gdext.classes.ProceduralSkyMaterial.mb_get_sky_cover == null) gdext.classes.ProceduralSkyMaterial.mb_get_sky_cover = MethodBind.get("ProceduralSkyMaterial", "get_sky_cover", 3635182373L)
    Wrappers.owned[Texture2D](Ptrcall.call0[Long](gdext.classes.ProceduralSkyMaterial.mb_get_sky_cover, livePtr))
  }

  /** ProceduralSkyMaterial.set_sky_cover_modulate */
  final def setSkyCoverModulate(color: gdext.builtin.Color): Unit = {
    if (gdext.classes.ProceduralSkyMaterial.mb_set_sky_cover_modulate == null) gdext.classes.ProceduralSkyMaterial.mb_set_sky_cover_modulate = MethodBind.get("ProceduralSkyMaterial", "set_sky_cover_modulate", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.ProceduralSkyMaterial.mb_set_sky_cover_modulate, livePtr, color)
  }

  /** ProceduralSkyMaterial.get_sky_cover_modulate */
  final def getSkyCoverModulate(): gdext.builtin.Color = {
    if (gdext.classes.ProceduralSkyMaterial.mb_get_sky_cover_modulate == null) gdext.classes.ProceduralSkyMaterial.mb_get_sky_cover_modulate = MethodBind.get("ProceduralSkyMaterial", "get_sky_cover_modulate", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.ProceduralSkyMaterial.mb_get_sky_cover_modulate, livePtr)
  }

  /** ProceduralSkyMaterial.set_ground_bottom_color */
  final def setGroundBottomColor(color: gdext.builtin.Color): Unit = {
    if (gdext.classes.ProceduralSkyMaterial.mb_set_ground_bottom_color == null) gdext.classes.ProceduralSkyMaterial.mb_set_ground_bottom_color = MethodBind.get("ProceduralSkyMaterial", "set_ground_bottom_color", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.ProceduralSkyMaterial.mb_set_ground_bottom_color, livePtr, color)
  }

  /** ProceduralSkyMaterial.get_ground_bottom_color */
  final def getGroundBottomColor(): gdext.builtin.Color = {
    if (gdext.classes.ProceduralSkyMaterial.mb_get_ground_bottom_color == null) gdext.classes.ProceduralSkyMaterial.mb_get_ground_bottom_color = MethodBind.get("ProceduralSkyMaterial", "get_ground_bottom_color", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.ProceduralSkyMaterial.mb_get_ground_bottom_color, livePtr)
  }

  /** ProceduralSkyMaterial.set_ground_horizon_color */
  final def setGroundHorizonColor(color: gdext.builtin.Color): Unit = {
    if (gdext.classes.ProceduralSkyMaterial.mb_set_ground_horizon_color == null) gdext.classes.ProceduralSkyMaterial.mb_set_ground_horizon_color = MethodBind.get("ProceduralSkyMaterial", "set_ground_horizon_color", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.ProceduralSkyMaterial.mb_set_ground_horizon_color, livePtr, color)
  }

  /** ProceduralSkyMaterial.get_ground_horizon_color */
  final def getGroundHorizonColor(): gdext.builtin.Color = {
    if (gdext.classes.ProceduralSkyMaterial.mb_get_ground_horizon_color == null) gdext.classes.ProceduralSkyMaterial.mb_get_ground_horizon_color = MethodBind.get("ProceduralSkyMaterial", "get_ground_horizon_color", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.ProceduralSkyMaterial.mb_get_ground_horizon_color, livePtr)
  }

  /** ProceduralSkyMaterial.set_ground_curve */
  final def setGroundCurve(curve: Double): Unit = {
    if (gdext.classes.ProceduralSkyMaterial.mb_set_ground_curve == null) gdext.classes.ProceduralSkyMaterial.mb_set_ground_curve = MethodBind.get("ProceduralSkyMaterial", "set_ground_curve", 373806689L)
    Ptrcall.callVoid1(gdext.classes.ProceduralSkyMaterial.mb_set_ground_curve, livePtr, curve)
  }

  /** ProceduralSkyMaterial.get_ground_curve */
  final def getGroundCurve(): Double = {
    if (gdext.classes.ProceduralSkyMaterial.mb_get_ground_curve == null) gdext.classes.ProceduralSkyMaterial.mb_get_ground_curve = MethodBind.get("ProceduralSkyMaterial", "get_ground_curve", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.ProceduralSkyMaterial.mb_get_ground_curve, livePtr)
  }

  /** ProceduralSkyMaterial.set_ground_energy_multiplier */
  final def setGroundEnergyMultiplier(energy: Double): Unit = {
    if (gdext.classes.ProceduralSkyMaterial.mb_set_ground_energy_multiplier == null) gdext.classes.ProceduralSkyMaterial.mb_set_ground_energy_multiplier = MethodBind.get("ProceduralSkyMaterial", "set_ground_energy_multiplier", 373806689L)
    Ptrcall.callVoid1(gdext.classes.ProceduralSkyMaterial.mb_set_ground_energy_multiplier, livePtr, energy)
  }

  /** ProceduralSkyMaterial.get_ground_energy_multiplier */
  final def getGroundEnergyMultiplier(): Double = {
    if (gdext.classes.ProceduralSkyMaterial.mb_get_ground_energy_multiplier == null) gdext.classes.ProceduralSkyMaterial.mb_get_ground_energy_multiplier = MethodBind.get("ProceduralSkyMaterial", "get_ground_energy_multiplier", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.ProceduralSkyMaterial.mb_get_ground_energy_multiplier, livePtr)
  }

  /** ProceduralSkyMaterial.set_sun_angle_max */
  final def setSunAngleMax(degrees: Double): Unit = {
    if (gdext.classes.ProceduralSkyMaterial.mb_set_sun_angle_max == null) gdext.classes.ProceduralSkyMaterial.mb_set_sun_angle_max = MethodBind.get("ProceduralSkyMaterial", "set_sun_angle_max", 373806689L)
    Ptrcall.callVoid1(gdext.classes.ProceduralSkyMaterial.mb_set_sun_angle_max, livePtr, degrees)
  }

  /** ProceduralSkyMaterial.get_sun_angle_max */
  final def getSunAngleMax(): Double = {
    if (gdext.classes.ProceduralSkyMaterial.mb_get_sun_angle_max == null) gdext.classes.ProceduralSkyMaterial.mb_get_sun_angle_max = MethodBind.get("ProceduralSkyMaterial", "get_sun_angle_max", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.ProceduralSkyMaterial.mb_get_sun_angle_max, livePtr)
  }

  /** ProceduralSkyMaterial.set_sun_curve */
  final def setSunCurve(curve: Double): Unit = {
    if (gdext.classes.ProceduralSkyMaterial.mb_set_sun_curve == null) gdext.classes.ProceduralSkyMaterial.mb_set_sun_curve = MethodBind.get("ProceduralSkyMaterial", "set_sun_curve", 373806689L)
    Ptrcall.callVoid1(gdext.classes.ProceduralSkyMaterial.mb_set_sun_curve, livePtr, curve)
  }

  /** ProceduralSkyMaterial.get_sun_curve */
  final def getSunCurve(): Double = {
    if (gdext.classes.ProceduralSkyMaterial.mb_get_sun_curve == null) gdext.classes.ProceduralSkyMaterial.mb_get_sun_curve = MethodBind.get("ProceduralSkyMaterial", "get_sun_curve", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.ProceduralSkyMaterial.mb_get_sun_curve, livePtr)
  }

  /** ProceduralSkyMaterial.set_use_debanding */
  final def setUseDebanding(use_debanding: Boolean): Unit = {
    if (gdext.classes.ProceduralSkyMaterial.mb_set_use_debanding == null) gdext.classes.ProceduralSkyMaterial.mb_set_use_debanding = MethodBind.get("ProceduralSkyMaterial", "set_use_debanding", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.ProceduralSkyMaterial.mb_set_use_debanding, livePtr, use_debanding)
  }

  /** ProceduralSkyMaterial.get_use_debanding */
  final def getUseDebanding(): Boolean = {
    if (gdext.classes.ProceduralSkyMaterial.mb_get_use_debanding == null) gdext.classes.ProceduralSkyMaterial.mb_get_use_debanding = MethodBind.get("ProceduralSkyMaterial", "get_use_debanding", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.ProceduralSkyMaterial.mb_get_use_debanding, livePtr)
  }

  /** ProceduralSkyMaterial.set_energy_multiplier */
  final def setEnergyMultiplier(multiplier: Double): Unit = {
    if (gdext.classes.ProceduralSkyMaterial.mb_set_energy_multiplier == null) gdext.classes.ProceduralSkyMaterial.mb_set_energy_multiplier = MethodBind.get("ProceduralSkyMaterial", "set_energy_multiplier", 373806689L)
    Ptrcall.callVoid1(gdext.classes.ProceduralSkyMaterial.mb_set_energy_multiplier, livePtr, multiplier)
  }

  /** ProceduralSkyMaterial.get_energy_multiplier */
  final def getEnergyMultiplier(): Double = {
    if (gdext.classes.ProceduralSkyMaterial.mb_get_energy_multiplier == null) gdext.classes.ProceduralSkyMaterial.mb_get_energy_multiplier = MethodBind.get("ProceduralSkyMaterial", "get_energy_multiplier", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.ProceduralSkyMaterial.mb_get_energy_multiplier, livePtr)
  }

}

object ProceduralSkyMaterial {
  private[classes] var mb_set_sky_top_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_sky_top_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_sky_horizon_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_sky_horizon_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_sky_curve: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_sky_curve: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_sky_energy_multiplier: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_sky_energy_multiplier: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_sky_cover: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_sky_cover: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_sky_cover_modulate: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_sky_cover_modulate: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_ground_bottom_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_ground_bottom_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_ground_horizon_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_ground_horizon_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_ground_curve: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_ground_curve: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_ground_energy_multiplier: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_ground_energy_multiplier: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_sun_angle_max: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_sun_angle_max: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_sun_curve: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_sun_curve: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_use_debanding: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_use_debanding: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_energy_multiplier: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_energy_multiplier: GDExtensionMethodBindPtr = null
}
