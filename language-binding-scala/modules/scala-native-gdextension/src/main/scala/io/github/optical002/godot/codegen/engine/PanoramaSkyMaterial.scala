package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `PanoramaSkyMaterial`, extends `Material`. */
abstract class PanoramaSkyMaterial extends Material {

  /** PanoramaSkyMaterial.set_panorama */
  final def setPanorama(texture: Texture2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("PanoramaSkyMaterial", "set_panorama", 4051416890L), hostObject.objectPtr, texture.hostObject)

  /** PanoramaSkyMaterial.get_panorama */
  final def getPanorama(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("PanoramaSkyMaterial", "get_panorama", 3635182373L), hostObject.objectPtr)

  /** PanoramaSkyMaterial.set_filtering_enabled */
  final def setFilteringEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("PanoramaSkyMaterial", "set_filtering_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** PanoramaSkyMaterial.is_filtering_enabled */
  final def isFilteringEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("PanoramaSkyMaterial", "is_filtering_enabled", 36873697L), hostObject.objectPtr)

  /** PanoramaSkyMaterial.set_energy_multiplier */
  final def setEnergyMultiplier(multiplier: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("PanoramaSkyMaterial", "set_energy_multiplier", 373806689L), hostObject.objectPtr, multiplier)

  /** PanoramaSkyMaterial.get_energy_multiplier */
  final def getEnergyMultiplier(): Double =
    Ptrcall.call0[Double](MethodBind.get("PanoramaSkyMaterial", "get_energy_multiplier", 1740695150L), hostObject.objectPtr)

}

object PanoramaSkyMaterial {
  /** Class metadata for Gd[PanoramaSkyMaterial] lifetime management and casting. */
  given GodotClass[PanoramaSkyMaterial] with {
    def className = "PanoramaSkyMaterial"
    def isRefCounted = true
    def wrap(o: GodotObject): PanoramaSkyMaterial = new PanoramaSkyMaterial {}.withHost(o.objectPtr)
    def unwrap(t: PanoramaSkyMaterial): GodotObject = t.hostObject
  }
}
