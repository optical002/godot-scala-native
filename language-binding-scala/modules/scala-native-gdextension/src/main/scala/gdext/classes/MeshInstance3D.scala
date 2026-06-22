package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `MeshInstance3D`, extends `GeometryInstance3D`. */
abstract class MeshInstance3D extends GeometryInstance3D {

  /** MeshInstance3D.set_mesh */
  final def setMesh(mesh: Mesh): Unit =
    Ptrcall.callVoid1(MethodBind.get("MeshInstance3D", "set_mesh", 194775623L), hostObject.objectPtr, mesh.hostObject)

  /** MeshInstance3D.get_mesh */
  final def getMesh(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("MeshInstance3D", "get_mesh", 1808005922L), hostObject.objectPtr)

  /** MeshInstance3D.set_skin */
  final def setSkin(skin: Skin): Unit =
    Ptrcall.callVoid1(MethodBind.get("MeshInstance3D", "set_skin", 3971435618L), hostObject.objectPtr, skin.hostObject)

  /** MeshInstance3D.get_skin */
  final def getSkin(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("MeshInstance3D", "get_skin", 2074563878L), hostObject.objectPtr)

  /** MeshInstance3D.get_skin_reference */
  final def getSkinReference(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("MeshInstance3D", "get_skin_reference", 2060603409L), hostObject.objectPtr)

  /** MeshInstance3D.get_surface_override_material_count */
  final def getSurfaceOverrideMaterialCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("MeshInstance3D", "get_surface_override_material_count", 3905245786L), hostObject.objectPtr)

  /** MeshInstance3D.set_surface_override_material */
  final def setSurfaceOverrideMaterial(surface: Long, material: Material): Unit =
    Ptrcall.callVoid2(MethodBind.get("MeshInstance3D", "set_surface_override_material", 3671737478L), hostObject.objectPtr, surface, material.hostObject)

  /** MeshInstance3D.get_surface_override_material */
  final def getSurfaceOverrideMaterial(surface: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("MeshInstance3D", "get_surface_override_material", 2897466400L), hostObject.objectPtr, surface)

  /** MeshInstance3D.get_active_material */
  final def getActiveMaterial(surface: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("MeshInstance3D", "get_active_material", 2897466400L), hostObject.objectPtr, surface)

  /** MeshInstance3D.create_trimesh_collision */
  final def createTrimeshCollision(): Unit =
    Ptrcall.callVoid0(MethodBind.get("MeshInstance3D", "create_trimesh_collision", 3218959716L), hostObject.objectPtr)

  /** MeshInstance3D.create_convex_collision */
  final def createConvexCollision(clean: Boolean, simplify: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("MeshInstance3D", "create_convex_collision", 2751962654L), hostObject.objectPtr, clean, simplify)

  /** MeshInstance3D.create_multiple_convex_collisions */
  final def createMultipleConvexCollisions(settings: MeshConvexDecompositionSettings): Unit =
    Ptrcall.callVoid1(MethodBind.get("MeshInstance3D", "create_multiple_convex_collisions", 628789669L), hostObject.objectPtr, settings.hostObject)

  /** MeshInstance3D.get_blend_shape_count */
  final def getBlendShapeCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("MeshInstance3D", "get_blend_shape_count", 3905245786L), hostObject.objectPtr)

  /** MeshInstance3D.find_blend_shape_by_name */
  final def findBlendShapeByName(name: gdext.builtin.StringName): Long =
    Ptrcall.call1[gdext.builtin.StringName, Long](MethodBind.get("MeshInstance3D", "find_blend_shape_by_name", 4150868206L), hostObject.objectPtr, name)

  /** MeshInstance3D.get_blend_shape_value */
  final def getBlendShapeValue(blend_shape_idx: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("MeshInstance3D", "get_blend_shape_value", 2339986948L), hostObject.objectPtr, blend_shape_idx)

  /** MeshInstance3D.set_blend_shape_value */
  final def setBlendShapeValue(blend_shape_idx: Long, value: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("MeshInstance3D", "set_blend_shape_value", 1602489585L), hostObject.objectPtr, blend_shape_idx, value)

  /** MeshInstance3D.create_debug_tangents */
  final def createDebugTangents(): Unit =
    Ptrcall.callVoid0(MethodBind.get("MeshInstance3D", "create_debug_tangents", 3218959716L), hostObject.objectPtr)

  /** MeshInstance3D.bake_mesh_from_current_blend_shape_mix */
  final def bakeMeshFromCurrentBlendShapeMix(existing: ArrayMesh): GodotObject =
    Ptrcall.call1[GodotObject, GodotObject](MethodBind.get("MeshInstance3D", "bake_mesh_from_current_blend_shape_mix", 1457573577L), hostObject.objectPtr, existing.hostObject)

  /** MeshInstance3D.bake_mesh_from_current_skeleton_pose */
  final def bakeMeshFromCurrentSkeletonPose(existing: ArrayMesh): GodotObject =
    Ptrcall.call1[GodotObject, GodotObject](MethodBind.get("MeshInstance3D", "bake_mesh_from_current_skeleton_pose", 1457573577L), hostObject.objectPtr, existing.hostObject)

}

object MeshInstance3D {
  /** Class metadata for Gd[MeshInstance3D] lifetime management and casting. */
  given GodotClass[MeshInstance3D] with {
    def className = "MeshInstance3D"
    def isRefCounted = false
    def wrap(o: GodotObject): MeshInstance3D = new MeshInstance3D {}.withHost(o.objectPtr)
    def unwrap(t: MeshInstance3D): GodotObject = t.hostObject
  }
}
