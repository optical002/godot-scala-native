package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `MeshInstance3D`, extends `GeometryInstance3D`. */
abstract class MeshInstance3D extends GeometryInstance3D {
  override def godotClassName: String = "MeshInstance3D"

  /** MeshInstance3D.set_mesh */
  final def setMesh(mesh: Mesh): Unit = {
    if (gdext.classes.MeshInstance3D.mb_set_mesh == null) gdext.classes.MeshInstance3D.mb_set_mesh = MethodBind.get("MeshInstance3D", "set_mesh", 194775623L)
    Ptrcall.callVoid1(gdext.classes.MeshInstance3D.mb_set_mesh, livePtr, Wrappers.handle(mesh))
  }

  /** MeshInstance3D.get_mesh. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getMesh(): Mesh = {
    if (gdext.classes.MeshInstance3D.mb_get_mesh == null) gdext.classes.MeshInstance3D.mb_get_mesh = MethodBind.get("MeshInstance3D", "get_mesh", 1808005922L)
    Wrappers.owned[Mesh](Ptrcall.call0[Long](gdext.classes.MeshInstance3D.mb_get_mesh, livePtr))
  }

  /** MeshInstance3D.set_skin */
  final def setSkin(skin: Skin): Unit = {
    if (gdext.classes.MeshInstance3D.mb_set_skin == null) gdext.classes.MeshInstance3D.mb_set_skin = MethodBind.get("MeshInstance3D", "set_skin", 3971435618L)
    Ptrcall.callVoid1(gdext.classes.MeshInstance3D.mb_set_skin, livePtr, Wrappers.handle(skin))
  }

  /** MeshInstance3D.get_skin. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getSkin(): Skin = {
    if (gdext.classes.MeshInstance3D.mb_get_skin == null) gdext.classes.MeshInstance3D.mb_get_skin = MethodBind.get("MeshInstance3D", "get_skin", 2074563878L)
    Wrappers.owned[Skin](Ptrcall.call0[Long](gdext.classes.MeshInstance3D.mb_get_skin, livePtr))
  }

  /** MeshInstance3D.get_skin_reference. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getSkinReference(): SkinReference = {
    if (gdext.classes.MeshInstance3D.mb_get_skin_reference == null) gdext.classes.MeshInstance3D.mb_get_skin_reference = MethodBind.get("MeshInstance3D", "get_skin_reference", 2060603409L)
    Wrappers.owned[SkinReference](Ptrcall.call0[Long](gdext.classes.MeshInstance3D.mb_get_skin_reference, livePtr))
  }

  /** MeshInstance3D.get_surface_override_material_count */
  final def getSurfaceOverrideMaterialCount(): Long = {
    if (gdext.classes.MeshInstance3D.mb_get_surface_override_material_count == null) gdext.classes.MeshInstance3D.mb_get_surface_override_material_count = MethodBind.get("MeshInstance3D", "get_surface_override_material_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.MeshInstance3D.mb_get_surface_override_material_count, livePtr)
  }

  /** MeshInstance3D.set_surface_override_material */
  final def setSurfaceOverrideMaterial(surface: Long, material: Material): Unit = {
    if (gdext.classes.MeshInstance3D.mb_set_surface_override_material == null) gdext.classes.MeshInstance3D.mb_set_surface_override_material = MethodBind.get("MeshInstance3D", "set_surface_override_material", 3671737478L)
    Ptrcall.callVoid2(gdext.classes.MeshInstance3D.mb_set_surface_override_material, livePtr, surface, Wrappers.handle(material))
  }

  /** MeshInstance3D.get_surface_override_material. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getSurfaceOverrideMaterial(surface: Long): Material = {
    if (gdext.classes.MeshInstance3D.mb_get_surface_override_material == null) gdext.classes.MeshInstance3D.mb_get_surface_override_material = MethodBind.get("MeshInstance3D", "get_surface_override_material", 2897466400L)
    Wrappers.owned[Material](Ptrcall.call1[Long, Long](gdext.classes.MeshInstance3D.mb_get_surface_override_material, livePtr, surface))
  }

  /** MeshInstance3D.get_active_material. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getActiveMaterial(surface: Long): Material = {
    if (gdext.classes.MeshInstance3D.mb_get_active_material == null) gdext.classes.MeshInstance3D.mb_get_active_material = MethodBind.get("MeshInstance3D", "get_active_material", 2897466400L)
    Wrappers.owned[Material](Ptrcall.call1[Long, Long](gdext.classes.MeshInstance3D.mb_get_active_material, livePtr, surface))
  }

  /** MeshInstance3D.create_trimesh_collision */
  final def createTrimeshCollision(): Unit = {
    if (gdext.classes.MeshInstance3D.mb_create_trimesh_collision == null) gdext.classes.MeshInstance3D.mb_create_trimesh_collision = MethodBind.get("MeshInstance3D", "create_trimesh_collision", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.MeshInstance3D.mb_create_trimesh_collision, livePtr)
  }

  /** MeshInstance3D.create_convex_collision */
  final def createConvexCollision(clean: Boolean, simplify: Boolean): Unit = {
    if (gdext.classes.MeshInstance3D.mb_create_convex_collision == null) gdext.classes.MeshInstance3D.mb_create_convex_collision = MethodBind.get("MeshInstance3D", "create_convex_collision", 2751962654L)
    Ptrcall.callVoid2(gdext.classes.MeshInstance3D.mb_create_convex_collision, livePtr, clean, simplify)
  }

  /** MeshInstance3D.create_multiple_convex_collisions */
  final def createMultipleConvexCollisions(settings: MeshConvexDecompositionSettings): Unit = {
    if (gdext.classes.MeshInstance3D.mb_create_multiple_convex_collisions == null) gdext.classes.MeshInstance3D.mb_create_multiple_convex_collisions = MethodBind.get("MeshInstance3D", "create_multiple_convex_collisions", 628789669L)
    Ptrcall.callVoid1(gdext.classes.MeshInstance3D.mb_create_multiple_convex_collisions, livePtr, Wrappers.handle(settings))
  }

  /** MeshInstance3D.get_blend_shape_count */
  final def getBlendShapeCount(): Long = {
    if (gdext.classes.MeshInstance3D.mb_get_blend_shape_count == null) gdext.classes.MeshInstance3D.mb_get_blend_shape_count = MethodBind.get("MeshInstance3D", "get_blend_shape_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.MeshInstance3D.mb_get_blend_shape_count, livePtr)
  }

  /** MeshInstance3D.find_blend_shape_by_name */
  final def findBlendShapeByName(name: gdext.builtin.StringName): Long = {
    if (gdext.classes.MeshInstance3D.mb_find_blend_shape_by_name == null) gdext.classes.MeshInstance3D.mb_find_blend_shape_by_name = MethodBind.get("MeshInstance3D", "find_blend_shape_by_name", 4150868206L)
    Ptrcall.call1[gdext.builtin.StringName, Long](gdext.classes.MeshInstance3D.mb_find_blend_shape_by_name, livePtr, name)
  }

  /** MeshInstance3D.get_blend_shape_value */
  final def getBlendShapeValue(blend_shape_idx: Long): Double = {
    if (gdext.classes.MeshInstance3D.mb_get_blend_shape_value == null) gdext.classes.MeshInstance3D.mb_get_blend_shape_value = MethodBind.get("MeshInstance3D", "get_blend_shape_value", 2339986948L)
    Ptrcall.call1[Long, Double](gdext.classes.MeshInstance3D.mb_get_blend_shape_value, livePtr, blend_shape_idx)
  }

  /** MeshInstance3D.set_blend_shape_value */
  final def setBlendShapeValue(blend_shape_idx: Long, value: Double): Unit = {
    if (gdext.classes.MeshInstance3D.mb_set_blend_shape_value == null) gdext.classes.MeshInstance3D.mb_set_blend_shape_value = MethodBind.get("MeshInstance3D", "set_blend_shape_value", 1602489585L)
    Ptrcall.callVoid2(gdext.classes.MeshInstance3D.mb_set_blend_shape_value, livePtr, blend_shape_idx, value)
  }

  /** MeshInstance3D.create_debug_tangents */
  final def createDebugTangents(): Unit = {
    if (gdext.classes.MeshInstance3D.mb_create_debug_tangents == null) gdext.classes.MeshInstance3D.mb_create_debug_tangents = MethodBind.get("MeshInstance3D", "create_debug_tangents", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.MeshInstance3D.mb_create_debug_tangents, livePtr)
  }

  /** MeshInstance3D.bake_mesh_from_current_blend_shape_mix. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def bakeMeshFromCurrentBlendShapeMix(existing: ArrayMesh): ArrayMesh = {
    if (gdext.classes.MeshInstance3D.mb_bake_mesh_from_current_blend_shape_mix == null) gdext.classes.MeshInstance3D.mb_bake_mesh_from_current_blend_shape_mix = MethodBind.get("MeshInstance3D", "bake_mesh_from_current_blend_shape_mix", 1457573577L)
    Wrappers.owned[ArrayMesh](Ptrcall.call1[GodotObject, Long](gdext.classes.MeshInstance3D.mb_bake_mesh_from_current_blend_shape_mix, livePtr, Wrappers.handle(existing)))
  }

  /** MeshInstance3D.bake_mesh_from_current_skeleton_pose. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def bakeMeshFromCurrentSkeletonPose(existing: ArrayMesh): ArrayMesh = {
    if (gdext.classes.MeshInstance3D.mb_bake_mesh_from_current_skeleton_pose == null) gdext.classes.MeshInstance3D.mb_bake_mesh_from_current_skeleton_pose = MethodBind.get("MeshInstance3D", "bake_mesh_from_current_skeleton_pose", 1457573577L)
    Wrappers.owned[ArrayMesh](Ptrcall.call1[GodotObject, Long](gdext.classes.MeshInstance3D.mb_bake_mesh_from_current_skeleton_pose, livePtr, Wrappers.handle(existing)))
  }

}

object MeshInstance3D {
  private[classes] var mb_set_mesh: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_mesh: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_skin: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_skin: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_skin_reference: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_surface_override_material_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_surface_override_material: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_surface_override_material: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_active_material: GDExtensionMethodBindPtr = null
  private[classes] var mb_create_trimesh_collision: GDExtensionMethodBindPtr = null
  private[classes] var mb_create_convex_collision: GDExtensionMethodBindPtr = null
  private[classes] var mb_create_multiple_convex_collisions: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_blend_shape_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_find_blend_shape_by_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_blend_shape_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_blend_shape_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_create_debug_tangents: GDExtensionMethodBindPtr = null
  private[classes] var mb_bake_mesh_from_current_blend_shape_mix: GDExtensionMethodBindPtr = null
  private[classes] var mb_bake_mesh_from_current_skeleton_pose: GDExtensionMethodBindPtr = null
}
