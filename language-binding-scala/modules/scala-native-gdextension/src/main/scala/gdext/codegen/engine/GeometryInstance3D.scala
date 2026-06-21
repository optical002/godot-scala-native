package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `GeometryInstance3D`, extends `VisualInstance3D`. */
abstract class GeometryInstance3D extends VisualInstance3D {

  /** GeometryInstance3D.set_material_override */
  final def setMaterialOverride(material: Material): Unit =
    Ptrcall.callVoid1(MethodBind.get("GeometryInstance3D", "set_material_override", 2757459619L), hostObject.objectPtr, material.hostObject)

  /** GeometryInstance3D.get_material_override */
  final def getMaterialOverride(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("GeometryInstance3D", "get_material_override", 5934680L), hostObject.objectPtr)

  /** GeometryInstance3D.set_material_overlay */
  final def setMaterialOverlay(material: Material): Unit =
    Ptrcall.callVoid1(MethodBind.get("GeometryInstance3D", "set_material_overlay", 2757459619L), hostObject.objectPtr, material.hostObject)

  /** GeometryInstance3D.get_material_overlay */
  final def getMaterialOverlay(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("GeometryInstance3D", "get_material_overlay", 5934680L), hostObject.objectPtr)

  /** GeometryInstance3D.set_cast_shadows_setting */
  final def setCastShadowsSetting(shadow_casting_setting: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GeometryInstance3D", "set_cast_shadows_setting", 856677339L), hostObject.objectPtr, shadow_casting_setting)

  /** GeometryInstance3D.get_cast_shadows_setting */
  final def getCastShadowsSetting(): Long =
    Ptrcall.call0[Long](MethodBind.get("GeometryInstance3D", "get_cast_shadows_setting", 3383019359L), hostObject.objectPtr)

  /** GeometryInstance3D.set_lod_bias */
  final def setLodBias(bias: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("GeometryInstance3D", "set_lod_bias", 373806689L), hostObject.objectPtr, bias)

  /** GeometryInstance3D.get_lod_bias */
  final def getLodBias(): Double =
    Ptrcall.call0[Double](MethodBind.get("GeometryInstance3D", "get_lod_bias", 1740695150L), hostObject.objectPtr)

  /** GeometryInstance3D.set_transparency */
  final def setTransparency(transparency: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("GeometryInstance3D", "set_transparency", 373806689L), hostObject.objectPtr, transparency)

  /** GeometryInstance3D.get_transparency */
  final def getTransparency(): Double =
    Ptrcall.call0[Double](MethodBind.get("GeometryInstance3D", "get_transparency", 1740695150L), hostObject.objectPtr)

  /** GeometryInstance3D.set_visibility_range_end_margin */
  final def setVisibilityRangeEndMargin(distance: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("GeometryInstance3D", "set_visibility_range_end_margin", 373806689L), hostObject.objectPtr, distance)

  /** GeometryInstance3D.get_visibility_range_end_margin */
  final def getVisibilityRangeEndMargin(): Double =
    Ptrcall.call0[Double](MethodBind.get("GeometryInstance3D", "get_visibility_range_end_margin", 1740695150L), hostObject.objectPtr)

  /** GeometryInstance3D.set_visibility_range_end */
  final def setVisibilityRangeEnd(distance: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("GeometryInstance3D", "set_visibility_range_end", 373806689L), hostObject.objectPtr, distance)

  /** GeometryInstance3D.get_visibility_range_end */
  final def getVisibilityRangeEnd(): Double =
    Ptrcall.call0[Double](MethodBind.get("GeometryInstance3D", "get_visibility_range_end", 1740695150L), hostObject.objectPtr)

  /** GeometryInstance3D.set_visibility_range_begin_margin */
  final def setVisibilityRangeBeginMargin(distance: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("GeometryInstance3D", "set_visibility_range_begin_margin", 373806689L), hostObject.objectPtr, distance)

  /** GeometryInstance3D.get_visibility_range_begin_margin */
  final def getVisibilityRangeBeginMargin(): Double =
    Ptrcall.call0[Double](MethodBind.get("GeometryInstance3D", "get_visibility_range_begin_margin", 1740695150L), hostObject.objectPtr)

  /** GeometryInstance3D.set_visibility_range_begin */
  final def setVisibilityRangeBegin(distance: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("GeometryInstance3D", "set_visibility_range_begin", 373806689L), hostObject.objectPtr, distance)

  /** GeometryInstance3D.get_visibility_range_begin */
  final def getVisibilityRangeBegin(): Double =
    Ptrcall.call0[Double](MethodBind.get("GeometryInstance3D", "get_visibility_range_begin", 1740695150L), hostObject.objectPtr)

  /** GeometryInstance3D.set_visibility_range_fade_mode */
  final def setVisibilityRangeFadeMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GeometryInstance3D", "set_visibility_range_fade_mode", 1440117808L), hostObject.objectPtr, mode)

  /** GeometryInstance3D.get_visibility_range_fade_mode */
  final def getVisibilityRangeFadeMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("GeometryInstance3D", "get_visibility_range_fade_mode", 2067221882L), hostObject.objectPtr)

  /** GeometryInstance3D.set_extra_cull_margin */
  final def setExtraCullMargin(margin: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("GeometryInstance3D", "set_extra_cull_margin", 373806689L), hostObject.objectPtr, margin)

  /** GeometryInstance3D.get_extra_cull_margin */
  final def getExtraCullMargin(): Double =
    Ptrcall.call0[Double](MethodBind.get("GeometryInstance3D", "get_extra_cull_margin", 1740695150L), hostObject.objectPtr)

  /** GeometryInstance3D.set_lightmap_texel_scale */
  final def setLightmapTexelScale(scale: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("GeometryInstance3D", "set_lightmap_texel_scale", 373806689L), hostObject.objectPtr, scale)

  /** GeometryInstance3D.get_lightmap_texel_scale */
  final def getLightmapTexelScale(): Double =
    Ptrcall.call0[Double](MethodBind.get("GeometryInstance3D", "get_lightmap_texel_scale", 1740695150L), hostObject.objectPtr)

  /** GeometryInstance3D.set_lightmap_scale */
  final def setLightmapScale(scale: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GeometryInstance3D", "set_lightmap_scale", 2462696582L), hostObject.objectPtr, scale)

  /** GeometryInstance3D.get_lightmap_scale */
  final def getLightmapScale(): Long =
    Ptrcall.call0[Long](MethodBind.get("GeometryInstance3D", "get_lightmap_scale", 798767852L), hostObject.objectPtr)

  /** GeometryInstance3D.set_gi_mode */
  final def setGiMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GeometryInstance3D", "set_gi_mode", 2548557163L), hostObject.objectPtr, mode)

  /** GeometryInstance3D.get_gi_mode */
  final def getGiMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("GeometryInstance3D", "get_gi_mode", 2188566509L), hostObject.objectPtr)

  /** GeometryInstance3D.set_ignore_occlusion_culling */
  final def setIgnoreOcclusionCulling(ignore_culling: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("GeometryInstance3D", "set_ignore_occlusion_culling", 2586408642L), hostObject.objectPtr, ignore_culling)

  /** GeometryInstance3D.is_ignoring_occlusion_culling */
  final def isIgnoringOcclusionCulling(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("GeometryInstance3D", "is_ignoring_occlusion_culling", 2240911060L), hostObject.objectPtr)

  /** GeometryInstance3D.set_custom_aabb */
  final def setCustomAabb(aabb: gdext.builtin.AABB): Unit =
    Ptrcall.callVoid1(MethodBind.get("GeometryInstance3D", "set_custom_aabb", 259215842L), hostObject.objectPtr, aabb)

  /** GeometryInstance3D.get_custom_aabb */
  final def getCustomAabb(): gdext.builtin.AABB =
    Ptrcall.call0[gdext.builtin.AABB](MethodBind.get("GeometryInstance3D", "get_custom_aabb", 1068685055L), hostObject.objectPtr)

}

object GeometryInstance3D {
  /** Class metadata for Gd[GeometryInstance3D] lifetime management and casting. */
  given GodotClass[GeometryInstance3D] with {
    def className = "GeometryInstance3D"
    def isRefCounted = false
    def wrap(o: GodotObject): GeometryInstance3D = new GeometryInstance3D {}.withHost(o.objectPtr)
    def unwrap(t: GeometryInstance3D): GodotObject = t.hostObject
  }
}
