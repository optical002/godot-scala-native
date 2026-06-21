package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `ReflectionProbe`, extends `VisualInstance3D`. */
abstract class ReflectionProbe extends VisualInstance3D {

  /** ReflectionProbe.set_intensity */
  final def setIntensity(intensity: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("ReflectionProbe", "set_intensity", 373806689L), hostObject.objectPtr, intensity)

  /** ReflectionProbe.get_intensity */
  final def getIntensity(): Double =
    Ptrcall.call0[Double](MethodBind.get("ReflectionProbe", "get_intensity", 1740695150L), hostObject.objectPtr)

  /** ReflectionProbe.set_blend_distance */
  final def setBlendDistance(blend_distance: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("ReflectionProbe", "set_blend_distance", 373806689L), hostObject.objectPtr, blend_distance)

  /** ReflectionProbe.get_blend_distance */
  final def getBlendDistance(): Double =
    Ptrcall.call0[Double](MethodBind.get("ReflectionProbe", "get_blend_distance", 1740695150L), hostObject.objectPtr)

  /** ReflectionProbe.set_ambient_mode */
  final def setAmbientMode(ambient: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("ReflectionProbe", "set_ambient_mode", 1748981278L), hostObject.objectPtr, ambient)

  /** ReflectionProbe.get_ambient_mode */
  final def getAmbientMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("ReflectionProbe", "get_ambient_mode", 1014607621L), hostObject.objectPtr)

  /** ReflectionProbe.set_ambient_color */
  final def setAmbientColor(ambient: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("ReflectionProbe", "set_ambient_color", 2920490490L), hostObject.objectPtr, ambient)

  /** ReflectionProbe.get_ambient_color */
  final def getAmbientColor(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("ReflectionProbe", "get_ambient_color", 3444240500L), hostObject.objectPtr)

  /** ReflectionProbe.set_ambient_color_energy */
  final def setAmbientColorEnergy(ambient_energy: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("ReflectionProbe", "set_ambient_color_energy", 373806689L), hostObject.objectPtr, ambient_energy)

  /** ReflectionProbe.get_ambient_color_energy */
  final def getAmbientColorEnergy(): Double =
    Ptrcall.call0[Double](MethodBind.get("ReflectionProbe", "get_ambient_color_energy", 1740695150L), hostObject.objectPtr)

  /** ReflectionProbe.set_max_distance */
  final def setMaxDistance(max_distance: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("ReflectionProbe", "set_max_distance", 373806689L), hostObject.objectPtr, max_distance)

  /** ReflectionProbe.get_max_distance */
  final def getMaxDistance(): Double =
    Ptrcall.call0[Double](MethodBind.get("ReflectionProbe", "get_max_distance", 1740695150L), hostObject.objectPtr)

  /** ReflectionProbe.set_mesh_lod_threshold */
  final def setMeshLodThreshold(ratio: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("ReflectionProbe", "set_mesh_lod_threshold", 373806689L), hostObject.objectPtr, ratio)

  /** ReflectionProbe.get_mesh_lod_threshold */
  final def getMeshLodThreshold(): Double =
    Ptrcall.call0[Double](MethodBind.get("ReflectionProbe", "get_mesh_lod_threshold", 1740695150L), hostObject.objectPtr)

  /** ReflectionProbe.set_size */
  final def setSize(size: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("ReflectionProbe", "set_size", 3460891852L), hostObject.objectPtr, size)

  /** ReflectionProbe.get_size */
  final def getSize(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("ReflectionProbe", "get_size", 3360562783L), hostObject.objectPtr)

  /** ReflectionProbe.set_origin_offset */
  final def setOriginOffset(origin_offset: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("ReflectionProbe", "set_origin_offset", 3460891852L), hostObject.objectPtr, origin_offset)

  /** ReflectionProbe.get_origin_offset */
  final def getOriginOffset(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("ReflectionProbe", "get_origin_offset", 3360562783L), hostObject.objectPtr)

  /** ReflectionProbe.set_as_interior */
  final def setAsInterior(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("ReflectionProbe", "set_as_interior", 2586408642L), hostObject.objectPtr, enable)

  /** ReflectionProbe.is_set_as_interior */
  final def isSetAsInterior(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("ReflectionProbe", "is_set_as_interior", 36873697L), hostObject.objectPtr)

  /** ReflectionProbe.set_enable_box_projection */
  final def setEnableBoxProjection(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("ReflectionProbe", "set_enable_box_projection", 2586408642L), hostObject.objectPtr, enable)

  /** ReflectionProbe.is_box_projection_enabled */
  final def isBoxProjectionEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("ReflectionProbe", "is_box_projection_enabled", 36873697L), hostObject.objectPtr)

  /** ReflectionProbe.set_enable_shadows */
  final def setEnableShadows(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("ReflectionProbe", "set_enable_shadows", 2586408642L), hostObject.objectPtr, enable)

  /** ReflectionProbe.are_shadows_enabled */
  final def areShadowsEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("ReflectionProbe", "are_shadows_enabled", 36873697L), hostObject.objectPtr)

  /** ReflectionProbe.set_cull_mask */
  final def setCullMask(layers: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("ReflectionProbe", "set_cull_mask", 1286410249L), hostObject.objectPtr, layers)

  /** ReflectionProbe.get_cull_mask */
  final def getCullMask(): Long =
    Ptrcall.call0[Long](MethodBind.get("ReflectionProbe", "get_cull_mask", 3905245786L), hostObject.objectPtr)

  /** ReflectionProbe.set_reflection_mask */
  final def setReflectionMask(layers: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("ReflectionProbe", "set_reflection_mask", 1286410249L), hostObject.objectPtr, layers)

  /** ReflectionProbe.get_reflection_mask */
  final def getReflectionMask(): Long =
    Ptrcall.call0[Long](MethodBind.get("ReflectionProbe", "get_reflection_mask", 3905245786L), hostObject.objectPtr)

  /** ReflectionProbe.set_update_mode */
  final def setUpdateMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("ReflectionProbe", "set_update_mode", 4090221187L), hostObject.objectPtr, mode)

  /** ReflectionProbe.get_update_mode */
  final def getUpdateMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("ReflectionProbe", "get_update_mode", 2367550552L), hostObject.objectPtr)

}

object ReflectionProbe {
  /** Class metadata for Gd[ReflectionProbe] lifetime management and casting. */
  given GodotClass[ReflectionProbe] with {
    def className = "ReflectionProbe"
    def isRefCounted = false
    def wrap(o: GodotObject): ReflectionProbe = new ReflectionProbe {}.withHost(o.objectPtr)
    def unwrap(t: ReflectionProbe): GodotObject = t.hostObject
  }
}
