package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `MultiMesh`, extends `Resource`. */
abstract class MultiMesh extends Resource {

  /** MultiMesh.set_mesh */
  final def setMesh(mesh: Mesh): Unit =
    Ptrcall.callVoid1(MethodBind.get("MultiMesh", "set_mesh", 194775623L), hostObject.objectPtr, mesh.hostObject)

  /** MultiMesh.get_mesh */
  final def getMesh(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("MultiMesh", "get_mesh", 1808005922L), hostObject.objectPtr)

  /** MultiMesh.set_use_colors */
  final def setUseColors(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("MultiMesh", "set_use_colors", 2586408642L), hostObject.objectPtr, enable)

  /** MultiMesh.is_using_colors */
  final def isUsingColors(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("MultiMesh", "is_using_colors", 36873697L), hostObject.objectPtr)

  /** MultiMesh.set_use_custom_data */
  final def setUseCustomData(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("MultiMesh", "set_use_custom_data", 2586408642L), hostObject.objectPtr, enable)

  /** MultiMesh.is_using_custom_data */
  final def isUsingCustomData(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("MultiMesh", "is_using_custom_data", 36873697L), hostObject.objectPtr)

  /** MultiMesh.set_transform_format */
  final def setTransformFormat(format: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("MultiMesh", "set_transform_format", 2404750322L), hostObject.objectPtr, format)

  /** MultiMesh.get_transform_format */
  final def getTransformFormat(): Long =
    Ptrcall.call0[Long](MethodBind.get("MultiMesh", "get_transform_format", 2444156481L), hostObject.objectPtr)

  /** MultiMesh.set_instance_count */
  final def setInstanceCount(count: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("MultiMesh", "set_instance_count", 1286410249L), hostObject.objectPtr, count)

  /** MultiMesh.get_instance_count */
  final def getInstanceCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("MultiMesh", "get_instance_count", 3905245786L), hostObject.objectPtr)

  /** MultiMesh.set_visible_instance_count */
  final def setVisibleInstanceCount(count: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("MultiMesh", "set_visible_instance_count", 1286410249L), hostObject.objectPtr, count)

  /** MultiMesh.get_visible_instance_count */
  final def getVisibleInstanceCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("MultiMesh", "get_visible_instance_count", 3905245786L), hostObject.objectPtr)

  /** MultiMesh.set_physics_interpolation_quality */
  final def setPhysicsInterpolationQuality(quality: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("MultiMesh", "set_physics_interpolation_quality", 1819488408L), hostObject.objectPtr, quality)

  /** MultiMesh.get_physics_interpolation_quality */
  final def getPhysicsInterpolationQuality(): Long =
    Ptrcall.call0[Long](MethodBind.get("MultiMesh", "get_physics_interpolation_quality", 1465701882L), hostObject.objectPtr)

  /** MultiMesh.set_instance_transform */
  final def setInstanceTransform(instance: Long, transform: gdext.builtin.Transform3D): Unit =
    Ptrcall.callVoid2(MethodBind.get("MultiMesh", "set_instance_transform", 3616898986L), hostObject.objectPtr, instance, transform)

  /** MultiMesh.set_instance_transform_2d */
  final def setInstanceTransform2d(instance: Long, transform: gdext.builtin.Transform2D): Unit =
    Ptrcall.callVoid2(MethodBind.get("MultiMesh", "set_instance_transform_2d", 30160968L), hostObject.objectPtr, instance, transform)

  /** MultiMesh.get_instance_transform */
  final def getInstanceTransform(instance: Long): gdext.builtin.Transform3D =
    Ptrcall.call1[Long, gdext.builtin.Transform3D](MethodBind.get("MultiMesh", "get_instance_transform", 1965739696L), hostObject.objectPtr, instance)

  /** MultiMesh.get_instance_transform_2d */
  final def getInstanceTransform2d(instance: Long): gdext.builtin.Transform2D =
    Ptrcall.call1[Long, gdext.builtin.Transform2D](MethodBind.get("MultiMesh", "get_instance_transform_2d", 3836996910L), hostObject.objectPtr, instance)

  /** MultiMesh.set_instance_color */
  final def setInstanceColor(instance: Long, color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid2(MethodBind.get("MultiMesh", "set_instance_color", 2878471219L), hostObject.objectPtr, instance, color)

  /** MultiMesh.get_instance_color */
  final def getInstanceColor(instance: Long): gdext.builtin.Color =
    Ptrcall.call1[Long, gdext.builtin.Color](MethodBind.get("MultiMesh", "get_instance_color", 3457211756L), hostObject.objectPtr, instance)

  /** MultiMesh.set_instance_custom_data */
  final def setInstanceCustomData(instance: Long, custom_data: gdext.builtin.Color): Unit =
    Ptrcall.callVoid2(MethodBind.get("MultiMesh", "set_instance_custom_data", 2878471219L), hostObject.objectPtr, instance, custom_data)

  /** MultiMesh.get_instance_custom_data */
  final def getInstanceCustomData(instance: Long): gdext.builtin.Color =
    Ptrcall.call1[Long, gdext.builtin.Color](MethodBind.get("MultiMesh", "get_instance_custom_data", 3457211756L), hostObject.objectPtr, instance)

  /** MultiMesh.reset_instance_physics_interpolation */
  final def resetInstancePhysicsInterpolation(instance: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("MultiMesh", "reset_instance_physics_interpolation", 1286410249L), hostObject.objectPtr, instance)

  /** MultiMesh.reset_instances_physics_interpolation */
  final def resetInstancesPhysicsInterpolation(): Unit =
    Ptrcall.callVoid0(MethodBind.get("MultiMesh", "reset_instances_physics_interpolation", 3218959716L), hostObject.objectPtr)

  /** MultiMesh.set_custom_aabb */
  final def setCustomAabb(aabb: gdext.builtin.AABB): Unit =
    Ptrcall.callVoid1(MethodBind.get("MultiMesh", "set_custom_aabb", 259215842L), hostObject.objectPtr, aabb)

  /** MultiMesh.get_custom_aabb */
  final def getCustomAabb(): gdext.builtin.AABB =
    Ptrcall.call0[gdext.builtin.AABB](MethodBind.get("MultiMesh", "get_custom_aabb", 1068685055L), hostObject.objectPtr)

  /** MultiMesh.get_aabb */
  final def getAabb(): gdext.builtin.AABB =
    Ptrcall.call0[gdext.builtin.AABB](MethodBind.get("MultiMesh", "get_aabb", 1068685055L), hostObject.objectPtr)

}

object MultiMesh {
  /** Class metadata for Gd[MultiMesh] lifetime management and casting. */
  given GodotClass[MultiMesh] with {
    def className = "MultiMesh"
    def isRefCounted = true
    def wrap(o: GodotObject): MultiMesh = new MultiMesh {}.withHost(o.objectPtr)
    def unwrap(t: MultiMesh): GodotObject = t.hostObject
  }
}
