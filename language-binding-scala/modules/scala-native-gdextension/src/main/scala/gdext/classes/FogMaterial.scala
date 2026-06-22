package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `FogMaterial`, extends `Material`. */
abstract class FogMaterial extends Material {

  /** FogMaterial.set_density */
  final def setDensity(density: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("FogMaterial", "set_density", 373806689L), hostObject.objectPtr, density)

  /** FogMaterial.get_density */
  final def getDensity(): Double =
    Ptrcall.call0[Double](MethodBind.get("FogMaterial", "get_density", 1740695150L), hostObject.objectPtr)

  /** FogMaterial.set_albedo */
  final def setAlbedo(albedo: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("FogMaterial", "set_albedo", 2920490490L), hostObject.objectPtr, albedo)

  /** FogMaterial.get_albedo */
  final def getAlbedo(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("FogMaterial", "get_albedo", 3444240500L), hostObject.objectPtr)

  /** FogMaterial.set_emission */
  final def setEmission(emission: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("FogMaterial", "set_emission", 2920490490L), hostObject.objectPtr, emission)

  /** FogMaterial.get_emission */
  final def getEmission(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("FogMaterial", "get_emission", 3444240500L), hostObject.objectPtr)

  /** FogMaterial.set_height_falloff */
  final def setHeightFalloff(height_falloff: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("FogMaterial", "set_height_falloff", 373806689L), hostObject.objectPtr, height_falloff)

  /** FogMaterial.get_height_falloff */
  final def getHeightFalloff(): Double =
    Ptrcall.call0[Double](MethodBind.get("FogMaterial", "get_height_falloff", 1740695150L), hostObject.objectPtr)

  /** FogMaterial.set_edge_fade */
  final def setEdgeFade(edge_fade: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("FogMaterial", "set_edge_fade", 373806689L), hostObject.objectPtr, edge_fade)

  /** FogMaterial.get_edge_fade */
  final def getEdgeFade(): Double =
    Ptrcall.call0[Double](MethodBind.get("FogMaterial", "get_edge_fade", 1740695150L), hostObject.objectPtr)

  /** FogMaterial.set_density_texture */
  final def setDensityTexture(density_texture: Texture3D): Unit =
    Ptrcall.callVoid1(MethodBind.get("FogMaterial", "set_density_texture", 1188404210L), hostObject.objectPtr, density_texture.hostObject)

  /** FogMaterial.get_density_texture */
  final def getDensityTexture(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("FogMaterial", "get_density_texture", 373985333L), hostObject.objectPtr)

}

object FogMaterial {
  /** Class metadata for Gd[FogMaterial] lifetime management and casting. */
  given GodotClass[FogMaterial] with {
    def className = "FogMaterial"
    def isRefCounted = true
    def wrap(o: GodotObject): FogMaterial = new FogMaterial {}.withHost(o.objectPtr)
    def unwrap(t: FogMaterial): GodotObject = t.hostObject
  }
}
