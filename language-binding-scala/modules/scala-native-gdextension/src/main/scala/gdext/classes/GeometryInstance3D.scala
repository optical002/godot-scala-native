package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `GeometryInstance3D`, extends `VisualInstance3D`. */
abstract class GeometryInstance3D extends VisualInstance3D {
  override def godotClassName: String = "GeometryInstance3D"

  /** GeometryInstance3D.set_material_override */
  final def setMaterialOverride(material: Material): Unit = {
    if (gdext.classes.GeometryInstance3D.mb_set_material_override == null) gdext.classes.GeometryInstance3D.mb_set_material_override = MethodBind.get("GeometryInstance3D", "set_material_override", 2757459619L)
    Ptrcall.callVoid1(gdext.classes.GeometryInstance3D.mb_set_material_override, livePtr, Wrappers.handle(material))
  }

  /** GeometryInstance3D.get_material_override. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getMaterialOverride(): Material = {
    if (gdext.classes.GeometryInstance3D.mb_get_material_override == null) gdext.classes.GeometryInstance3D.mb_get_material_override = MethodBind.get("GeometryInstance3D", "get_material_override", 5934680L)
    Wrappers.owned[Material](Ptrcall.call0[Long](gdext.classes.GeometryInstance3D.mb_get_material_override, livePtr))
  }

  /** GeometryInstance3D.set_material_overlay */
  final def setMaterialOverlay(material: Material): Unit = {
    if (gdext.classes.GeometryInstance3D.mb_set_material_overlay == null) gdext.classes.GeometryInstance3D.mb_set_material_overlay = MethodBind.get("GeometryInstance3D", "set_material_overlay", 2757459619L)
    Ptrcall.callVoid1(gdext.classes.GeometryInstance3D.mb_set_material_overlay, livePtr, Wrappers.handle(material))
  }

  /** GeometryInstance3D.get_material_overlay. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getMaterialOverlay(): Material = {
    if (gdext.classes.GeometryInstance3D.mb_get_material_overlay == null) gdext.classes.GeometryInstance3D.mb_get_material_overlay = MethodBind.get("GeometryInstance3D", "get_material_overlay", 5934680L)
    Wrappers.owned[Material](Ptrcall.call0[Long](gdext.classes.GeometryInstance3D.mb_get_material_overlay, livePtr))
  }

  /** GeometryInstance3D.set_cast_shadows_setting */
  final def setCastShadowsSetting(shadowCastingSetting: gdext.classes.GeometryInstance3D.ShadowCastingSetting): Unit = {
    if (gdext.classes.GeometryInstance3D.mb_set_cast_shadows_setting == null) gdext.classes.GeometryInstance3D.mb_set_cast_shadows_setting = MethodBind.get("GeometryInstance3D", "set_cast_shadows_setting", 856677339L)
    Ptrcall.callVoid1(gdext.classes.GeometryInstance3D.mb_set_cast_shadows_setting, livePtr, shadowCastingSetting)
  }

  /** GeometryInstance3D.get_cast_shadows_setting */
  final def getCastShadowsSetting(): gdext.classes.GeometryInstance3D.ShadowCastingSetting = {
    if (gdext.classes.GeometryInstance3D.mb_get_cast_shadows_setting == null) gdext.classes.GeometryInstance3D.mb_get_cast_shadows_setting = MethodBind.get("GeometryInstance3D", "get_cast_shadows_setting", 3383019359L)
    gdext.classes.GeometryInstance3D.ShadowCastingSetting(Ptrcall.call0[Long](gdext.classes.GeometryInstance3D.mb_get_cast_shadows_setting, livePtr))
  }

  /** GeometryInstance3D.set_lod_bias */
  final def setLodBias(bias: Double): Unit = {
    if (gdext.classes.GeometryInstance3D.mb_set_lod_bias == null) gdext.classes.GeometryInstance3D.mb_set_lod_bias = MethodBind.get("GeometryInstance3D", "set_lod_bias", 373806689L)
    Ptrcall.callVoid1(gdext.classes.GeometryInstance3D.mb_set_lod_bias, livePtr, bias)
  }

  /** GeometryInstance3D.get_lod_bias */
  final def getLodBias(): Double = {
    if (gdext.classes.GeometryInstance3D.mb_get_lod_bias == null) gdext.classes.GeometryInstance3D.mb_get_lod_bias = MethodBind.get("GeometryInstance3D", "get_lod_bias", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.GeometryInstance3D.mb_get_lod_bias, livePtr)
  }

  /** GeometryInstance3D.set_transparency */
  final def setTransparency(transparency: Double): Unit = {
    if (gdext.classes.GeometryInstance3D.mb_set_transparency == null) gdext.classes.GeometryInstance3D.mb_set_transparency = MethodBind.get("GeometryInstance3D", "set_transparency", 373806689L)
    Ptrcall.callVoid1(gdext.classes.GeometryInstance3D.mb_set_transparency, livePtr, transparency)
  }

  /** GeometryInstance3D.get_transparency */
  final def getTransparency(): Double = {
    if (gdext.classes.GeometryInstance3D.mb_get_transparency == null) gdext.classes.GeometryInstance3D.mb_get_transparency = MethodBind.get("GeometryInstance3D", "get_transparency", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.GeometryInstance3D.mb_get_transparency, livePtr)
  }

  /** GeometryInstance3D.set_visibility_range_end_margin */
  final def setVisibilityRangeEndMargin(distance: Double): Unit = {
    if (gdext.classes.GeometryInstance3D.mb_set_visibility_range_end_margin == null) gdext.classes.GeometryInstance3D.mb_set_visibility_range_end_margin = MethodBind.get("GeometryInstance3D", "set_visibility_range_end_margin", 373806689L)
    Ptrcall.callVoid1(gdext.classes.GeometryInstance3D.mb_set_visibility_range_end_margin, livePtr, distance)
  }

  /** GeometryInstance3D.get_visibility_range_end_margin */
  final def getVisibilityRangeEndMargin(): Double = {
    if (gdext.classes.GeometryInstance3D.mb_get_visibility_range_end_margin == null) gdext.classes.GeometryInstance3D.mb_get_visibility_range_end_margin = MethodBind.get("GeometryInstance3D", "get_visibility_range_end_margin", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.GeometryInstance3D.mb_get_visibility_range_end_margin, livePtr)
  }

  /** GeometryInstance3D.set_visibility_range_end */
  final def setVisibilityRangeEnd(distance: Double): Unit = {
    if (gdext.classes.GeometryInstance3D.mb_set_visibility_range_end == null) gdext.classes.GeometryInstance3D.mb_set_visibility_range_end = MethodBind.get("GeometryInstance3D", "set_visibility_range_end", 373806689L)
    Ptrcall.callVoid1(gdext.classes.GeometryInstance3D.mb_set_visibility_range_end, livePtr, distance)
  }

  /** GeometryInstance3D.get_visibility_range_end */
  final def getVisibilityRangeEnd(): Double = {
    if (gdext.classes.GeometryInstance3D.mb_get_visibility_range_end == null) gdext.classes.GeometryInstance3D.mb_get_visibility_range_end = MethodBind.get("GeometryInstance3D", "get_visibility_range_end", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.GeometryInstance3D.mb_get_visibility_range_end, livePtr)
  }

  /** GeometryInstance3D.set_visibility_range_begin_margin */
  final def setVisibilityRangeBeginMargin(distance: Double): Unit = {
    if (gdext.classes.GeometryInstance3D.mb_set_visibility_range_begin_margin == null) gdext.classes.GeometryInstance3D.mb_set_visibility_range_begin_margin = MethodBind.get("GeometryInstance3D", "set_visibility_range_begin_margin", 373806689L)
    Ptrcall.callVoid1(gdext.classes.GeometryInstance3D.mb_set_visibility_range_begin_margin, livePtr, distance)
  }

  /** GeometryInstance3D.get_visibility_range_begin_margin */
  final def getVisibilityRangeBeginMargin(): Double = {
    if (gdext.classes.GeometryInstance3D.mb_get_visibility_range_begin_margin == null) gdext.classes.GeometryInstance3D.mb_get_visibility_range_begin_margin = MethodBind.get("GeometryInstance3D", "get_visibility_range_begin_margin", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.GeometryInstance3D.mb_get_visibility_range_begin_margin, livePtr)
  }

  /** GeometryInstance3D.set_visibility_range_begin */
  final def setVisibilityRangeBegin(distance: Double): Unit = {
    if (gdext.classes.GeometryInstance3D.mb_set_visibility_range_begin == null) gdext.classes.GeometryInstance3D.mb_set_visibility_range_begin = MethodBind.get("GeometryInstance3D", "set_visibility_range_begin", 373806689L)
    Ptrcall.callVoid1(gdext.classes.GeometryInstance3D.mb_set_visibility_range_begin, livePtr, distance)
  }

  /** GeometryInstance3D.get_visibility_range_begin */
  final def getVisibilityRangeBegin(): Double = {
    if (gdext.classes.GeometryInstance3D.mb_get_visibility_range_begin == null) gdext.classes.GeometryInstance3D.mb_get_visibility_range_begin = MethodBind.get("GeometryInstance3D", "get_visibility_range_begin", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.GeometryInstance3D.mb_get_visibility_range_begin, livePtr)
  }

  /** GeometryInstance3D.set_visibility_range_fade_mode */
  final def setVisibilityRangeFadeMode(mode: gdext.classes.GeometryInstance3D.VisibilityRangeFadeMode): Unit = {
    if (gdext.classes.GeometryInstance3D.mb_set_visibility_range_fade_mode == null) gdext.classes.GeometryInstance3D.mb_set_visibility_range_fade_mode = MethodBind.get("GeometryInstance3D", "set_visibility_range_fade_mode", 1440117808L)
    Ptrcall.callVoid1(gdext.classes.GeometryInstance3D.mb_set_visibility_range_fade_mode, livePtr, mode)
  }

  /** GeometryInstance3D.get_visibility_range_fade_mode */
  final def getVisibilityRangeFadeMode(): gdext.classes.GeometryInstance3D.VisibilityRangeFadeMode = {
    if (gdext.classes.GeometryInstance3D.mb_get_visibility_range_fade_mode == null) gdext.classes.GeometryInstance3D.mb_get_visibility_range_fade_mode = MethodBind.get("GeometryInstance3D", "get_visibility_range_fade_mode", 2067221882L)
    gdext.classes.GeometryInstance3D.VisibilityRangeFadeMode(Ptrcall.call0[Long](gdext.classes.GeometryInstance3D.mb_get_visibility_range_fade_mode, livePtr))
  }

  /** GeometryInstance3D.set_extra_cull_margin */
  final def setExtraCullMargin(margin: Double): Unit = {
    if (gdext.classes.GeometryInstance3D.mb_set_extra_cull_margin == null) gdext.classes.GeometryInstance3D.mb_set_extra_cull_margin = MethodBind.get("GeometryInstance3D", "set_extra_cull_margin", 373806689L)
    Ptrcall.callVoid1(gdext.classes.GeometryInstance3D.mb_set_extra_cull_margin, livePtr, margin)
  }

  /** GeometryInstance3D.get_extra_cull_margin */
  final def getExtraCullMargin(): Double = {
    if (gdext.classes.GeometryInstance3D.mb_get_extra_cull_margin == null) gdext.classes.GeometryInstance3D.mb_get_extra_cull_margin = MethodBind.get("GeometryInstance3D", "get_extra_cull_margin", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.GeometryInstance3D.mb_get_extra_cull_margin, livePtr)
  }

  /** GeometryInstance3D.set_lightmap_texel_scale */
  final def setLightmapTexelScale(scale: Double): Unit = {
    if (gdext.classes.GeometryInstance3D.mb_set_lightmap_texel_scale == null) gdext.classes.GeometryInstance3D.mb_set_lightmap_texel_scale = MethodBind.get("GeometryInstance3D", "set_lightmap_texel_scale", 373806689L)
    Ptrcall.callVoid1(gdext.classes.GeometryInstance3D.mb_set_lightmap_texel_scale, livePtr, scale)
  }

  /** GeometryInstance3D.get_lightmap_texel_scale */
  final def getLightmapTexelScale(): Double = {
    if (gdext.classes.GeometryInstance3D.mb_get_lightmap_texel_scale == null) gdext.classes.GeometryInstance3D.mb_get_lightmap_texel_scale = MethodBind.get("GeometryInstance3D", "get_lightmap_texel_scale", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.GeometryInstance3D.mb_get_lightmap_texel_scale, livePtr)
  }

  /** GeometryInstance3D.set_lightmap_scale */
  final def setLightmapScale(scale: gdext.classes.GeometryInstance3D.LightmapScale): Unit = {
    if (gdext.classes.GeometryInstance3D.mb_set_lightmap_scale == null) gdext.classes.GeometryInstance3D.mb_set_lightmap_scale = MethodBind.get("GeometryInstance3D", "set_lightmap_scale", 2462696582L)
    Ptrcall.callVoid1(gdext.classes.GeometryInstance3D.mb_set_lightmap_scale, livePtr, scale)
  }

  /** GeometryInstance3D.get_lightmap_scale */
  final def getLightmapScale(): gdext.classes.GeometryInstance3D.LightmapScale = {
    if (gdext.classes.GeometryInstance3D.mb_get_lightmap_scale == null) gdext.classes.GeometryInstance3D.mb_get_lightmap_scale = MethodBind.get("GeometryInstance3D", "get_lightmap_scale", 798767852L)
    gdext.classes.GeometryInstance3D.LightmapScale(Ptrcall.call0[Long](gdext.classes.GeometryInstance3D.mb_get_lightmap_scale, livePtr))
  }

  /** GeometryInstance3D.set_gi_mode */
  final def setGiMode(mode: gdext.classes.GeometryInstance3D.GIMode): Unit = {
    if (gdext.classes.GeometryInstance3D.mb_set_gi_mode == null) gdext.classes.GeometryInstance3D.mb_set_gi_mode = MethodBind.get("GeometryInstance3D", "set_gi_mode", 2548557163L)
    Ptrcall.callVoid1(gdext.classes.GeometryInstance3D.mb_set_gi_mode, livePtr, mode)
  }

  /** GeometryInstance3D.get_gi_mode */
  final def getGiMode(): gdext.classes.GeometryInstance3D.GIMode = {
    if (gdext.classes.GeometryInstance3D.mb_get_gi_mode == null) gdext.classes.GeometryInstance3D.mb_get_gi_mode = MethodBind.get("GeometryInstance3D", "get_gi_mode", 2188566509L)
    gdext.classes.GeometryInstance3D.GIMode(Ptrcall.call0[Long](gdext.classes.GeometryInstance3D.mb_get_gi_mode, livePtr))
  }

  /** GeometryInstance3D.set_ignore_occlusion_culling */
  final def setIgnoreOcclusionCulling(ignoreCulling: Boolean): Unit = {
    if (gdext.classes.GeometryInstance3D.mb_set_ignore_occlusion_culling == null) gdext.classes.GeometryInstance3D.mb_set_ignore_occlusion_culling = MethodBind.get("GeometryInstance3D", "set_ignore_occlusion_culling", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.GeometryInstance3D.mb_set_ignore_occlusion_culling, livePtr, ignoreCulling)
  }

  /** GeometryInstance3D.is_ignoring_occlusion_culling */
  final def isIgnoringOcclusionCulling(): Boolean = {
    if (gdext.classes.GeometryInstance3D.mb_is_ignoring_occlusion_culling == null) gdext.classes.GeometryInstance3D.mb_is_ignoring_occlusion_culling = MethodBind.get("GeometryInstance3D", "is_ignoring_occlusion_culling", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.GeometryInstance3D.mb_is_ignoring_occlusion_culling, livePtr)
  }

  /** GeometryInstance3D.set_custom_aabb */
  final def setCustomAabb(aabb: gdext.builtin.AABB): Unit = {
    if (gdext.classes.GeometryInstance3D.mb_set_custom_aabb == null) gdext.classes.GeometryInstance3D.mb_set_custom_aabb = MethodBind.get("GeometryInstance3D", "set_custom_aabb", 259215842L)
    Ptrcall.callVoid1(gdext.classes.GeometryInstance3D.mb_set_custom_aabb, livePtr, aabb)
  }

  /** GeometryInstance3D.get_custom_aabb */
  final def getCustomAabb(): gdext.builtin.AABB = {
    if (gdext.classes.GeometryInstance3D.mb_get_custom_aabb == null) gdext.classes.GeometryInstance3D.mb_get_custom_aabb = MethodBind.get("GeometryInstance3D", "get_custom_aabb", 1068685055L)
    Ptrcall.call0[gdext.builtin.AABB](gdext.classes.GeometryInstance3D.mb_get_custom_aabb, livePtr)
  }

}

object GeometryInstance3D {
  private[classes] var mb_set_material_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_material_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_material_overlay: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_material_overlay: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_cast_shadows_setting: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_cast_shadows_setting: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_lod_bias: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_lod_bias: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_transparency: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_transparency: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_visibility_range_end_margin: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_visibility_range_end_margin: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_visibility_range_end: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_visibility_range_end: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_visibility_range_begin_margin: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_visibility_range_begin_margin: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_visibility_range_begin: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_visibility_range_begin: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_visibility_range_fade_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_visibility_range_fade_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_extra_cull_margin: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_extra_cull_margin: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_lightmap_texel_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_lightmap_texel_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_lightmap_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_lightmap_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_gi_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_gi_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_ignore_occlusion_culling: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_ignoring_occlusion_culling: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_custom_aabb: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_custom_aabb: GDExtensionMethodBindPtr = null

  /** Godot enum `GeometryInstance3D.ShadowCastingSetting`. */
  opaque type ShadowCastingSetting <: Long = Long

  object ShadowCastingSetting {
    final val Off: ShadowCastingSetting = 0L.asInstanceOf[ShadowCastingSetting]
    final val On: ShadowCastingSetting = 1L.asInstanceOf[ShadowCastingSetting]
    final val DoubleSided: ShadowCastingSetting = 2L.asInstanceOf[ShadowCastingSetting]
    final val ShadowsOnly: ShadowCastingSetting = 3L.asInstanceOf[ShadowCastingSetting]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ShadowCastingSetting = value.asInstanceOf[ShadowCastingSetting]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ShadowCastingSetting] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[ShadowCastingSetting]]

    extension (self: ShadowCastingSetting)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Off"
        case 1L => "On"
        case 2L => "DoubleSided"
        case 3L => "ShadowsOnly"
        case other => other.toString
      }
  }

  /** Godot enum `GeometryInstance3D.GIMode`. */
  opaque type GIMode <: Long = Long

  object GIMode {
    final val Disabled: GIMode = 0L.asInstanceOf[GIMode]
    final val Static: GIMode = 1L.asInstanceOf[GIMode]
    final val Dynamic: GIMode = 2L.asInstanceOf[GIMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): GIMode = value.asInstanceOf[GIMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[GIMode] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[GIMode]]

    extension (self: GIMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Disabled"
        case 1L => "Static"
        case 2L => "Dynamic"
        case other => other.toString
      }
  }

  /** Godot enum `GeometryInstance3D.LightmapScale`. */
  opaque type LightmapScale <: Long = Long

  object LightmapScale {
    final val Scale1x: LightmapScale = 0L.asInstanceOf[LightmapScale]
    final val Scale2x: LightmapScale = 1L.asInstanceOf[LightmapScale]
    final val Scale4x: LightmapScale = 2L.asInstanceOf[LightmapScale]
    final val Scale8x: LightmapScale = 3L.asInstanceOf[LightmapScale]
    final val Max: LightmapScale = 4L.asInstanceOf[LightmapScale]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): LightmapScale = value.asInstanceOf[LightmapScale]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[LightmapScale] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L).asInstanceOf[scala.IArray[LightmapScale]]

    extension (self: LightmapScale)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Scale1x"
        case 1L => "Scale2x"
        case 2L => "Scale4x"
        case 3L => "Scale8x"
        case 4L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `GeometryInstance3D.VisibilityRangeFadeMode`. */
  opaque type VisibilityRangeFadeMode <: Long = Long

  object VisibilityRangeFadeMode {
    final val Disabled: VisibilityRangeFadeMode = 0L.asInstanceOf[VisibilityRangeFadeMode]
    final val Self: VisibilityRangeFadeMode = 1L.asInstanceOf[VisibilityRangeFadeMode]
    final val Dependencies: VisibilityRangeFadeMode = 2L.asInstanceOf[VisibilityRangeFadeMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): VisibilityRangeFadeMode = value.asInstanceOf[VisibilityRangeFadeMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[VisibilityRangeFadeMode] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[VisibilityRangeFadeMode]]

    extension (self: VisibilityRangeFadeMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Disabled"
        case 1L => "Self"
        case 2L => "Dependencies"
        case other => other.toString
      }
  }
}
