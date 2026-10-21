package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `PanoramaSkyMaterial`, extends `Material`. */
abstract class PanoramaSkyMaterial extends Material {
  override def godotClassName: String = "PanoramaSkyMaterial"

  /** PanoramaSkyMaterial.set_panorama */
  final def setPanorama(texture: Texture2D): Unit = {
    if (gdext.classes.PanoramaSkyMaterial.mb_set_panorama == null) gdext.classes.PanoramaSkyMaterial.mb_set_panorama = MethodBind.get("PanoramaSkyMaterial", "set_panorama", 4051416890L)
    Ptrcall.callVoid1(gdext.classes.PanoramaSkyMaterial.mb_set_panorama, livePtr, Wrappers.handle(texture))
  }

  /** PanoramaSkyMaterial.get_panorama. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getPanorama(): Texture2D = {
    if (gdext.classes.PanoramaSkyMaterial.mb_get_panorama == null) gdext.classes.PanoramaSkyMaterial.mb_get_panorama = MethodBind.get("PanoramaSkyMaterial", "get_panorama", 3635182373L)
    Wrappers.owned[Texture2D](Ptrcall.call0[Long](gdext.classes.PanoramaSkyMaterial.mb_get_panorama, livePtr))
  }

  /** PanoramaSkyMaterial.set_filtering_enabled */
  final def setFilteringEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.PanoramaSkyMaterial.mb_set_filtering_enabled == null) gdext.classes.PanoramaSkyMaterial.mb_set_filtering_enabled = MethodBind.get("PanoramaSkyMaterial", "set_filtering_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.PanoramaSkyMaterial.mb_set_filtering_enabled, livePtr, enabled)
  }

  /** PanoramaSkyMaterial.is_filtering_enabled */
  final def isFilteringEnabled(): Boolean = {
    if (gdext.classes.PanoramaSkyMaterial.mb_is_filtering_enabled == null) gdext.classes.PanoramaSkyMaterial.mb_is_filtering_enabled = MethodBind.get("PanoramaSkyMaterial", "is_filtering_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.PanoramaSkyMaterial.mb_is_filtering_enabled, livePtr)
  }

  /** PanoramaSkyMaterial.set_energy_multiplier */
  final def setEnergyMultiplier(multiplier: Double): Unit = {
    if (gdext.classes.PanoramaSkyMaterial.mb_set_energy_multiplier == null) gdext.classes.PanoramaSkyMaterial.mb_set_energy_multiplier = MethodBind.get("PanoramaSkyMaterial", "set_energy_multiplier", 373806689L)
    Ptrcall.callVoid1(gdext.classes.PanoramaSkyMaterial.mb_set_energy_multiplier, livePtr, multiplier)
  }

  /** PanoramaSkyMaterial.get_energy_multiplier */
  final def getEnergyMultiplier(): Double = {
    if (gdext.classes.PanoramaSkyMaterial.mb_get_energy_multiplier == null) gdext.classes.PanoramaSkyMaterial.mb_get_energy_multiplier = MethodBind.get("PanoramaSkyMaterial", "get_energy_multiplier", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.PanoramaSkyMaterial.mb_get_energy_multiplier, livePtr)
  }

}

object PanoramaSkyMaterial {
  private[classes] var mb_set_panorama: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_panorama: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_filtering_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_filtering_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_energy_multiplier: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_energy_multiplier: GDExtensionMethodBindPtr = null
}
