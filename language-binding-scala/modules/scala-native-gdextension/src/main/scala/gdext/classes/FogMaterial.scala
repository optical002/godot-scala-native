package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `FogMaterial`, extends `Material`. */
abstract class FogMaterial extends Material {
  override def godotClassName: String = "FogMaterial"

  /** FogMaterial.set_density */
  final def setDensity(density: Double): Unit = {
    if (gdext.classes.FogMaterial.mb_set_density == null) gdext.classes.FogMaterial.mb_set_density = MethodBind.get("FogMaterial", "set_density", 373806689L)
    Ptrcall.callVoid1(gdext.classes.FogMaterial.mb_set_density, livePtr, density)
  }

  /** FogMaterial.get_density */
  final def getDensity(): Double = {
    if (gdext.classes.FogMaterial.mb_get_density == null) gdext.classes.FogMaterial.mb_get_density = MethodBind.get("FogMaterial", "get_density", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.FogMaterial.mb_get_density, livePtr)
  }

  /** FogMaterial.set_albedo */
  final def setAlbedo(albedo: gdext.builtin.Color): Unit = {
    if (gdext.classes.FogMaterial.mb_set_albedo == null) gdext.classes.FogMaterial.mb_set_albedo = MethodBind.get("FogMaterial", "set_albedo", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.FogMaterial.mb_set_albedo, livePtr, albedo)
  }

  /** FogMaterial.get_albedo */
  final def getAlbedo(): gdext.builtin.Color = {
    if (gdext.classes.FogMaterial.mb_get_albedo == null) gdext.classes.FogMaterial.mb_get_albedo = MethodBind.get("FogMaterial", "get_albedo", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.FogMaterial.mb_get_albedo, livePtr)
  }

  /** FogMaterial.set_emission */
  final def setEmission(emission: gdext.builtin.Color): Unit = {
    if (gdext.classes.FogMaterial.mb_set_emission == null) gdext.classes.FogMaterial.mb_set_emission = MethodBind.get("FogMaterial", "set_emission", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.FogMaterial.mb_set_emission, livePtr, emission)
  }

  /** FogMaterial.get_emission */
  final def getEmission(): gdext.builtin.Color = {
    if (gdext.classes.FogMaterial.mb_get_emission == null) gdext.classes.FogMaterial.mb_get_emission = MethodBind.get("FogMaterial", "get_emission", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.FogMaterial.mb_get_emission, livePtr)
  }

  /** FogMaterial.set_height_falloff */
  final def setHeightFalloff(heightFalloff: Double): Unit = {
    if (gdext.classes.FogMaterial.mb_set_height_falloff == null) gdext.classes.FogMaterial.mb_set_height_falloff = MethodBind.get("FogMaterial", "set_height_falloff", 373806689L)
    Ptrcall.callVoid1(gdext.classes.FogMaterial.mb_set_height_falloff, livePtr, heightFalloff)
  }

  /** FogMaterial.get_height_falloff */
  final def getHeightFalloff(): Double = {
    if (gdext.classes.FogMaterial.mb_get_height_falloff == null) gdext.classes.FogMaterial.mb_get_height_falloff = MethodBind.get("FogMaterial", "get_height_falloff", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.FogMaterial.mb_get_height_falloff, livePtr)
  }

  /** FogMaterial.set_edge_fade */
  final def setEdgeFade(edgeFade: Double): Unit = {
    if (gdext.classes.FogMaterial.mb_set_edge_fade == null) gdext.classes.FogMaterial.mb_set_edge_fade = MethodBind.get("FogMaterial", "set_edge_fade", 373806689L)
    Ptrcall.callVoid1(gdext.classes.FogMaterial.mb_set_edge_fade, livePtr, edgeFade)
  }

  /** FogMaterial.get_edge_fade */
  final def getEdgeFade(): Double = {
    if (gdext.classes.FogMaterial.mb_get_edge_fade == null) gdext.classes.FogMaterial.mb_get_edge_fade = MethodBind.get("FogMaterial", "get_edge_fade", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.FogMaterial.mb_get_edge_fade, livePtr)
  }

  /** FogMaterial.set_density_texture */
  final def setDensityTexture(densityTexture: Texture3D): Unit = {
    if (gdext.classes.FogMaterial.mb_set_density_texture == null) gdext.classes.FogMaterial.mb_set_density_texture = MethodBind.get("FogMaterial", "set_density_texture", 1188404210L)
    Ptrcall.callVoid1(gdext.classes.FogMaterial.mb_set_density_texture, livePtr, Wrappers.handle(densityTexture))
  }

  /** FogMaterial.get_density_texture. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getDensityTexture(): Texture3D = {
    if (gdext.classes.FogMaterial.mb_get_density_texture == null) gdext.classes.FogMaterial.mb_get_density_texture = MethodBind.get("FogMaterial", "get_density_texture", 373985333L)
    Wrappers.owned[Texture3D](Ptrcall.call0[Long](gdext.classes.FogMaterial.mb_get_density_texture, livePtr))
  }

}

object FogMaterial {
  private[classes] var mb_set_density: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_density: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_albedo: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_albedo: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_emission: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_emission: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_height_falloff: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_height_falloff: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_edge_fade: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_edge_fade: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_density_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_density_texture: GDExtensionMethodBindPtr = null
}
