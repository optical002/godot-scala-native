package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `ReflectionProbe`, extends `VisualInstance3D`. */
abstract class ReflectionProbe extends VisualInstance3D {
  override def godotClassName: String = "ReflectionProbe"

  /** ReflectionProbe.set_intensity */
  final def setIntensity(intensity: Double): Unit = {
    if (gdext.classes.ReflectionProbe.mb_set_intensity == null) gdext.classes.ReflectionProbe.mb_set_intensity = MethodBind.get("ReflectionProbe", "set_intensity", 373806689L)
    Ptrcall.callVoid1(gdext.classes.ReflectionProbe.mb_set_intensity, livePtr, intensity)
  }

  /** ReflectionProbe.get_intensity */
  final def getIntensity(): Double = {
    if (gdext.classes.ReflectionProbe.mb_get_intensity == null) gdext.classes.ReflectionProbe.mb_get_intensity = MethodBind.get("ReflectionProbe", "get_intensity", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.ReflectionProbe.mb_get_intensity, livePtr)
  }

  /** ReflectionProbe.set_blend_distance */
  final def setBlendDistance(blendDistance: Double): Unit = {
    if (gdext.classes.ReflectionProbe.mb_set_blend_distance == null) gdext.classes.ReflectionProbe.mb_set_blend_distance = MethodBind.get("ReflectionProbe", "set_blend_distance", 373806689L)
    Ptrcall.callVoid1(gdext.classes.ReflectionProbe.mb_set_blend_distance, livePtr, blendDistance)
  }

  /** ReflectionProbe.get_blend_distance */
  final def getBlendDistance(): Double = {
    if (gdext.classes.ReflectionProbe.mb_get_blend_distance == null) gdext.classes.ReflectionProbe.mb_get_blend_distance = MethodBind.get("ReflectionProbe", "get_blend_distance", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.ReflectionProbe.mb_get_blend_distance, livePtr)
  }

  /** ReflectionProbe.set_ambient_mode */
  final def setAmbientMode(ambient: gdext.classes.ReflectionProbe.AmbientMode): Unit = {
    if (gdext.classes.ReflectionProbe.mb_set_ambient_mode == null) gdext.classes.ReflectionProbe.mb_set_ambient_mode = MethodBind.get("ReflectionProbe", "set_ambient_mode", 1748981278L)
    Ptrcall.callVoid1(gdext.classes.ReflectionProbe.mb_set_ambient_mode, livePtr, ambient)
  }

  /** ReflectionProbe.get_ambient_mode */
  final def getAmbientMode(): gdext.classes.ReflectionProbe.AmbientMode = {
    if (gdext.classes.ReflectionProbe.mb_get_ambient_mode == null) gdext.classes.ReflectionProbe.mb_get_ambient_mode = MethodBind.get("ReflectionProbe", "get_ambient_mode", 1014607621L)
    gdext.classes.ReflectionProbe.AmbientMode(Ptrcall.call0[Long](gdext.classes.ReflectionProbe.mb_get_ambient_mode, livePtr))
  }

  /** ReflectionProbe.set_ambient_color */
  final def setAmbientColor(ambient: gdext.builtin.Color): Unit = {
    if (gdext.classes.ReflectionProbe.mb_set_ambient_color == null) gdext.classes.ReflectionProbe.mb_set_ambient_color = MethodBind.get("ReflectionProbe", "set_ambient_color", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.ReflectionProbe.mb_set_ambient_color, livePtr, ambient)
  }

  /** ReflectionProbe.get_ambient_color */
  final def getAmbientColor(): gdext.builtin.Color = {
    if (gdext.classes.ReflectionProbe.mb_get_ambient_color == null) gdext.classes.ReflectionProbe.mb_get_ambient_color = MethodBind.get("ReflectionProbe", "get_ambient_color", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.ReflectionProbe.mb_get_ambient_color, livePtr)
  }

  /** ReflectionProbe.set_ambient_color_energy */
  final def setAmbientColorEnergy(ambientEnergy: Double): Unit = {
    if (gdext.classes.ReflectionProbe.mb_set_ambient_color_energy == null) gdext.classes.ReflectionProbe.mb_set_ambient_color_energy = MethodBind.get("ReflectionProbe", "set_ambient_color_energy", 373806689L)
    Ptrcall.callVoid1(gdext.classes.ReflectionProbe.mb_set_ambient_color_energy, livePtr, ambientEnergy)
  }

  /** ReflectionProbe.get_ambient_color_energy */
  final def getAmbientColorEnergy(): Double = {
    if (gdext.classes.ReflectionProbe.mb_get_ambient_color_energy == null) gdext.classes.ReflectionProbe.mb_get_ambient_color_energy = MethodBind.get("ReflectionProbe", "get_ambient_color_energy", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.ReflectionProbe.mb_get_ambient_color_energy, livePtr)
  }

  /** ReflectionProbe.set_max_distance */
  final def setMaxDistance(maxDistance: Double): Unit = {
    if (gdext.classes.ReflectionProbe.mb_set_max_distance == null) gdext.classes.ReflectionProbe.mb_set_max_distance = MethodBind.get("ReflectionProbe", "set_max_distance", 373806689L)
    Ptrcall.callVoid1(gdext.classes.ReflectionProbe.mb_set_max_distance, livePtr, maxDistance)
  }

  /** ReflectionProbe.get_max_distance */
  final def getMaxDistance(): Double = {
    if (gdext.classes.ReflectionProbe.mb_get_max_distance == null) gdext.classes.ReflectionProbe.mb_get_max_distance = MethodBind.get("ReflectionProbe", "get_max_distance", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.ReflectionProbe.mb_get_max_distance, livePtr)
  }

  /** ReflectionProbe.set_mesh_lod_threshold */
  final def setMeshLodThreshold(ratio: Double): Unit = {
    if (gdext.classes.ReflectionProbe.mb_set_mesh_lod_threshold == null) gdext.classes.ReflectionProbe.mb_set_mesh_lod_threshold = MethodBind.get("ReflectionProbe", "set_mesh_lod_threshold", 373806689L)
    Ptrcall.callVoid1(gdext.classes.ReflectionProbe.mb_set_mesh_lod_threshold, livePtr, ratio)
  }

  /** ReflectionProbe.get_mesh_lod_threshold */
  final def getMeshLodThreshold(): Double = {
    if (gdext.classes.ReflectionProbe.mb_get_mesh_lod_threshold == null) gdext.classes.ReflectionProbe.mb_get_mesh_lod_threshold = MethodBind.get("ReflectionProbe", "get_mesh_lod_threshold", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.ReflectionProbe.mb_get_mesh_lod_threshold, livePtr)
  }

  /** ReflectionProbe.set_size */
  final def setSize(size: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.ReflectionProbe.mb_set_size == null) gdext.classes.ReflectionProbe.mb_set_size = MethodBind.get("ReflectionProbe", "set_size", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.ReflectionProbe.mb_set_size, livePtr, size)
  }

  /** ReflectionProbe.get_size */
  final def getSize(): gdext.builtin.Vector3 = {
    if (gdext.classes.ReflectionProbe.mb_get_size == null) gdext.classes.ReflectionProbe.mb_get_size = MethodBind.get("ReflectionProbe", "get_size", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.ReflectionProbe.mb_get_size, livePtr)
  }

  /** ReflectionProbe.set_origin_offset */
  final def setOriginOffset(originOffset: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.ReflectionProbe.mb_set_origin_offset == null) gdext.classes.ReflectionProbe.mb_set_origin_offset = MethodBind.get("ReflectionProbe", "set_origin_offset", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.ReflectionProbe.mb_set_origin_offset, livePtr, originOffset)
  }

  /** ReflectionProbe.get_origin_offset */
  final def getOriginOffset(): gdext.builtin.Vector3 = {
    if (gdext.classes.ReflectionProbe.mb_get_origin_offset == null) gdext.classes.ReflectionProbe.mb_get_origin_offset = MethodBind.get("ReflectionProbe", "get_origin_offset", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.ReflectionProbe.mb_get_origin_offset, livePtr)
  }

  /** ReflectionProbe.set_as_interior */
  final def setAsInterior(enable: Boolean): Unit = {
    if (gdext.classes.ReflectionProbe.mb_set_as_interior == null) gdext.classes.ReflectionProbe.mb_set_as_interior = MethodBind.get("ReflectionProbe", "set_as_interior", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.ReflectionProbe.mb_set_as_interior, livePtr, enable)
  }

  /** ReflectionProbe.is_set_as_interior */
  final def isSetAsInterior(): Boolean = {
    if (gdext.classes.ReflectionProbe.mb_is_set_as_interior == null) gdext.classes.ReflectionProbe.mb_is_set_as_interior = MethodBind.get("ReflectionProbe", "is_set_as_interior", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.ReflectionProbe.mb_is_set_as_interior, livePtr)
  }

  /** ReflectionProbe.set_enable_box_projection */
  final def setEnableBoxProjection(enable: Boolean): Unit = {
    if (gdext.classes.ReflectionProbe.mb_set_enable_box_projection == null) gdext.classes.ReflectionProbe.mb_set_enable_box_projection = MethodBind.get("ReflectionProbe", "set_enable_box_projection", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.ReflectionProbe.mb_set_enable_box_projection, livePtr, enable)
  }

  /** ReflectionProbe.is_box_projection_enabled */
  final def isBoxProjectionEnabled(): Boolean = {
    if (gdext.classes.ReflectionProbe.mb_is_box_projection_enabled == null) gdext.classes.ReflectionProbe.mb_is_box_projection_enabled = MethodBind.get("ReflectionProbe", "is_box_projection_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.ReflectionProbe.mb_is_box_projection_enabled, livePtr)
  }

  /** ReflectionProbe.set_enable_shadows */
  final def setEnableShadows(enable: Boolean): Unit = {
    if (gdext.classes.ReflectionProbe.mb_set_enable_shadows == null) gdext.classes.ReflectionProbe.mb_set_enable_shadows = MethodBind.get("ReflectionProbe", "set_enable_shadows", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.ReflectionProbe.mb_set_enable_shadows, livePtr, enable)
  }

  /** ReflectionProbe.are_shadows_enabled */
  final def areShadowsEnabled(): Boolean = {
    if (gdext.classes.ReflectionProbe.mb_are_shadows_enabled == null) gdext.classes.ReflectionProbe.mb_are_shadows_enabled = MethodBind.get("ReflectionProbe", "are_shadows_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.ReflectionProbe.mb_are_shadows_enabled, livePtr)
  }

  /** ReflectionProbe.set_cull_mask */
  final def setCullMask(layers: Long): Unit = {
    if (gdext.classes.ReflectionProbe.mb_set_cull_mask == null) gdext.classes.ReflectionProbe.mb_set_cull_mask = MethodBind.get("ReflectionProbe", "set_cull_mask", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.ReflectionProbe.mb_set_cull_mask, livePtr, layers)
  }

  /** ReflectionProbe.get_cull_mask */
  final def getCullMask(): Long = {
    if (gdext.classes.ReflectionProbe.mb_get_cull_mask == null) gdext.classes.ReflectionProbe.mb_get_cull_mask = MethodBind.get("ReflectionProbe", "get_cull_mask", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.ReflectionProbe.mb_get_cull_mask, livePtr)
  }

  /** ReflectionProbe.set_reflection_mask */
  final def setReflectionMask(layers: Long): Unit = {
    if (gdext.classes.ReflectionProbe.mb_set_reflection_mask == null) gdext.classes.ReflectionProbe.mb_set_reflection_mask = MethodBind.get("ReflectionProbe", "set_reflection_mask", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.ReflectionProbe.mb_set_reflection_mask, livePtr, layers)
  }

  /** ReflectionProbe.get_reflection_mask */
  final def getReflectionMask(): Long = {
    if (gdext.classes.ReflectionProbe.mb_get_reflection_mask == null) gdext.classes.ReflectionProbe.mb_get_reflection_mask = MethodBind.get("ReflectionProbe", "get_reflection_mask", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.ReflectionProbe.mb_get_reflection_mask, livePtr)
  }

  /** ReflectionProbe.set_update_mode */
  final def setUpdateMode(mode: gdext.classes.ReflectionProbe.UpdateMode): Unit = {
    if (gdext.classes.ReflectionProbe.mb_set_update_mode == null) gdext.classes.ReflectionProbe.mb_set_update_mode = MethodBind.get("ReflectionProbe", "set_update_mode", 4090221187L)
    Ptrcall.callVoid1(gdext.classes.ReflectionProbe.mb_set_update_mode, livePtr, mode)
  }

  /** ReflectionProbe.get_update_mode */
  final def getUpdateMode(): gdext.classes.ReflectionProbe.UpdateMode = {
    if (gdext.classes.ReflectionProbe.mb_get_update_mode == null) gdext.classes.ReflectionProbe.mb_get_update_mode = MethodBind.get("ReflectionProbe", "get_update_mode", 2367550552L)
    gdext.classes.ReflectionProbe.UpdateMode(Ptrcall.call0[Long](gdext.classes.ReflectionProbe.mb_get_update_mode, livePtr))
  }

}

object ReflectionProbe {
  private[classes] var mb_set_intensity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_intensity: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_blend_distance: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_blend_distance: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_ambient_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_ambient_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_ambient_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_ambient_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_ambient_color_energy: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_ambient_color_energy: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_max_distance: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_max_distance: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_mesh_lod_threshold: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_mesh_lod_threshold: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_origin_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_origin_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_as_interior: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_set_as_interior: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_enable_box_projection: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_box_projection_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_enable_shadows: GDExtensionMethodBindPtr = null
  private[classes] var mb_are_shadows_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_cull_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_cull_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_reflection_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_reflection_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_update_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_update_mode: GDExtensionMethodBindPtr = null

  /** Godot enum `ReflectionProbe.UpdateMode`. */
  opaque type UpdateMode <: Long = Long

  object UpdateMode {
    final val Once: UpdateMode = 0L.asInstanceOf[UpdateMode]
    final val Always: UpdateMode = 1L.asInstanceOf[UpdateMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): UpdateMode = value.asInstanceOf[UpdateMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[UpdateMode] = scala.IArray[Long](0L, 1L).asInstanceOf[scala.IArray[UpdateMode]]

    extension (self: UpdateMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Once"
        case 1L => "Always"
        case other => other.toString
      }
  }

  /** Godot enum `ReflectionProbe.AmbientMode`. */
  opaque type AmbientMode <: Long = Long

  object AmbientMode {
    final val Disabled: AmbientMode = 0L.asInstanceOf[AmbientMode]
    final val Environment: AmbientMode = 1L.asInstanceOf[AmbientMode]
    final val Color: AmbientMode = 2L.asInstanceOf[AmbientMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): AmbientMode = value.asInstanceOf[AmbientMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[AmbientMode] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[AmbientMode]]

    extension (self: AmbientMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Disabled"
        case 1L => "Environment"
        case 2L => "Color"
        case other => other.toString
      }
  }
}
