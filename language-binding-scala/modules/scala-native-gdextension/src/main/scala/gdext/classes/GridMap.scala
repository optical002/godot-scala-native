package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `GridMap`, extends `Node3D`. */
abstract class GridMap extends Node3D {
  override def godotClassName: String = "GridMap"

  /** GridMap.set_collision_layer */
  final def setCollisionLayer(layer: Long): Unit = {
    if (gdext.classes.GridMap.mb_set_collision_layer == null) gdext.classes.GridMap.mb_set_collision_layer = MethodBind.get("GridMap", "set_collision_layer", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GridMap.mb_set_collision_layer, livePtr, layer)
  }

  /** GridMap.get_collision_layer */
  final def getCollisionLayer(): Long = {
    if (gdext.classes.GridMap.mb_get_collision_layer == null) gdext.classes.GridMap.mb_get_collision_layer = MethodBind.get("GridMap", "get_collision_layer", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.GridMap.mb_get_collision_layer, livePtr)
  }

  /** GridMap.set_collision_mask */
  final def setCollisionMask(mask: Long): Unit = {
    if (gdext.classes.GridMap.mb_set_collision_mask == null) gdext.classes.GridMap.mb_set_collision_mask = MethodBind.get("GridMap", "set_collision_mask", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GridMap.mb_set_collision_mask, livePtr, mask)
  }

  /** GridMap.get_collision_mask */
  final def getCollisionMask(): Long = {
    if (gdext.classes.GridMap.mb_get_collision_mask == null) gdext.classes.GridMap.mb_get_collision_mask = MethodBind.get("GridMap", "get_collision_mask", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.GridMap.mb_get_collision_mask, livePtr)
  }

  /** GridMap.set_collision_mask_value */
  final def setCollisionMaskValue(layer_number: Long, value: Boolean): Unit = {
    if (gdext.classes.GridMap.mb_set_collision_mask_value == null) gdext.classes.GridMap.mb_set_collision_mask_value = MethodBind.get("GridMap", "set_collision_mask_value", 300928843L)
    Ptrcall.callVoid2(gdext.classes.GridMap.mb_set_collision_mask_value, livePtr, layer_number, value)
  }

  /** GridMap.get_collision_mask_value */
  final def getCollisionMaskValue(layer_number: Long): Boolean = {
    if (gdext.classes.GridMap.mb_get_collision_mask_value == null) gdext.classes.GridMap.mb_get_collision_mask_value = MethodBind.get("GridMap", "get_collision_mask_value", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.GridMap.mb_get_collision_mask_value, livePtr, layer_number)
  }

  /** GridMap.set_collision_layer_value */
  final def setCollisionLayerValue(layer_number: Long, value: Boolean): Unit = {
    if (gdext.classes.GridMap.mb_set_collision_layer_value == null) gdext.classes.GridMap.mb_set_collision_layer_value = MethodBind.get("GridMap", "set_collision_layer_value", 300928843L)
    Ptrcall.callVoid2(gdext.classes.GridMap.mb_set_collision_layer_value, livePtr, layer_number, value)
  }

  /** GridMap.get_collision_layer_value */
  final def getCollisionLayerValue(layer_number: Long): Boolean = {
    if (gdext.classes.GridMap.mb_get_collision_layer_value == null) gdext.classes.GridMap.mb_get_collision_layer_value = MethodBind.get("GridMap", "get_collision_layer_value", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.GridMap.mb_get_collision_layer_value, livePtr, layer_number)
  }

  /** GridMap.set_collision_priority */
  final def setCollisionPriority(priority: Double): Unit = {
    if (gdext.classes.GridMap.mb_set_collision_priority == null) gdext.classes.GridMap.mb_set_collision_priority = MethodBind.get("GridMap", "set_collision_priority", 373806689L)
    Ptrcall.callVoid1(gdext.classes.GridMap.mb_set_collision_priority, livePtr, priority)
  }

  /** GridMap.get_collision_priority */
  final def getCollisionPriority(): Double = {
    if (gdext.classes.GridMap.mb_get_collision_priority == null) gdext.classes.GridMap.mb_get_collision_priority = MethodBind.get("GridMap", "get_collision_priority", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.GridMap.mb_get_collision_priority, livePtr)
  }

  /** GridMap.set_physics_material */
  final def setPhysicsMaterial(material: PhysicsMaterial): Unit = {
    if (gdext.classes.GridMap.mb_set_physics_material == null) gdext.classes.GridMap.mb_set_physics_material = MethodBind.get("GridMap", "set_physics_material", 1784508650L)
    Ptrcall.callVoid1(gdext.classes.GridMap.mb_set_physics_material, livePtr, Wrappers.handle(material))
  }

  /** GridMap.get_physics_material. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getPhysicsMaterial(): PhysicsMaterial = {
    if (gdext.classes.GridMap.mb_get_physics_material == null) gdext.classes.GridMap.mb_get_physics_material = MethodBind.get("GridMap", "get_physics_material", 2521850424L)
    Wrappers.owned[PhysicsMaterial](Ptrcall.call0[Long](gdext.classes.GridMap.mb_get_physics_material, livePtr))
  }

  /** GridMap.set_bake_navigation */
  final def setBakeNavigation(bake_navigation: Boolean): Unit = {
    if (gdext.classes.GridMap.mb_set_bake_navigation == null) gdext.classes.GridMap.mb_set_bake_navigation = MethodBind.get("GridMap", "set_bake_navigation", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.GridMap.mb_set_bake_navigation, livePtr, bake_navigation)
  }

  /** GridMap.is_baking_navigation */
  final def isBakingNavigation(): Boolean = {
    if (gdext.classes.GridMap.mb_is_baking_navigation == null) gdext.classes.GridMap.mb_is_baking_navigation = MethodBind.get("GridMap", "is_baking_navigation", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.GridMap.mb_is_baking_navigation, livePtr)
  }

  /** GridMap.set_mesh_library */
  final def setMeshLibrary(mesh_library: MeshLibrary): Unit = {
    if (gdext.classes.GridMap.mb_set_mesh_library == null) gdext.classes.GridMap.mb_set_mesh_library = MethodBind.get("GridMap", "set_mesh_library", 1488083439L)
    Ptrcall.callVoid1(gdext.classes.GridMap.mb_set_mesh_library, livePtr, Wrappers.handle(mesh_library))
  }

  /** GridMap.get_mesh_library. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getMeshLibrary(): MeshLibrary = {
    if (gdext.classes.GridMap.mb_get_mesh_library == null) gdext.classes.GridMap.mb_get_mesh_library = MethodBind.get("GridMap", "get_mesh_library", 3350993772L)
    Wrappers.owned[MeshLibrary](Ptrcall.call0[Long](gdext.classes.GridMap.mb_get_mesh_library, livePtr))
  }

  /** GridMap.set_cell_size */
  final def setCellSize(size: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.GridMap.mb_set_cell_size == null) gdext.classes.GridMap.mb_set_cell_size = MethodBind.get("GridMap", "set_cell_size", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.GridMap.mb_set_cell_size, livePtr, size)
  }

  /** GridMap.get_cell_size */
  final def getCellSize(): gdext.builtin.Vector3 = {
    if (gdext.classes.GridMap.mb_get_cell_size == null) gdext.classes.GridMap.mb_get_cell_size = MethodBind.get("GridMap", "get_cell_size", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.GridMap.mb_get_cell_size, livePtr)
  }

  /** GridMap.set_cell_scale */
  final def setCellScale(scale: Double): Unit = {
    if (gdext.classes.GridMap.mb_set_cell_scale == null) gdext.classes.GridMap.mb_set_cell_scale = MethodBind.get("GridMap", "set_cell_scale", 373806689L)
    Ptrcall.callVoid1(gdext.classes.GridMap.mb_set_cell_scale, livePtr, scale)
  }

  /** GridMap.get_cell_scale */
  final def getCellScale(): Double = {
    if (gdext.classes.GridMap.mb_get_cell_scale == null) gdext.classes.GridMap.mb_get_cell_scale = MethodBind.get("GridMap", "get_cell_scale", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.GridMap.mb_get_cell_scale, livePtr)
  }

  /** GridMap.set_octant_size */
  final def setOctantSize(size: Long): Unit = {
    if (gdext.classes.GridMap.mb_set_octant_size == null) gdext.classes.GridMap.mb_set_octant_size = MethodBind.get("GridMap", "set_octant_size", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GridMap.mb_set_octant_size, livePtr, size)
  }

  /** GridMap.get_octant_size */
  final def getOctantSize(): Long = {
    if (gdext.classes.GridMap.mb_get_octant_size == null) gdext.classes.GridMap.mb_get_octant_size = MethodBind.get("GridMap", "get_octant_size", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.GridMap.mb_get_octant_size, livePtr)
  }

  /** GridMap.set_cell_item */
  final def setCellItem(position: gdext.builtin.Vector3i, item: Long, orientation: Long): Unit = {
    if (gdext.classes.GridMap.mb_set_cell_item == null) gdext.classes.GridMap.mb_set_cell_item = MethodBind.get("GridMap", "set_cell_item", 3449088946L)
    Ptrcall.callVoid3(gdext.classes.GridMap.mb_set_cell_item, livePtr, position, item, orientation)
  }

  /** GridMap.get_cell_item */
  final def getCellItem(position: gdext.builtin.Vector3i): Long = {
    if (gdext.classes.GridMap.mb_get_cell_item == null) gdext.classes.GridMap.mb_get_cell_item = MethodBind.get("GridMap", "get_cell_item", 3724960147L)
    Ptrcall.call1[gdext.builtin.Vector3i, Long](gdext.classes.GridMap.mb_get_cell_item, livePtr, position)
  }

  /** GridMap.get_cell_item_orientation */
  final def getCellItemOrientation(position: gdext.builtin.Vector3i): Long = {
    if (gdext.classes.GridMap.mb_get_cell_item_orientation == null) gdext.classes.GridMap.mb_get_cell_item_orientation = MethodBind.get("GridMap", "get_cell_item_orientation", 3724960147L)
    Ptrcall.call1[gdext.builtin.Vector3i, Long](gdext.classes.GridMap.mb_get_cell_item_orientation, livePtr, position)
  }

  /** GridMap.get_cell_item_basis */
  final def getCellItemBasis(position: gdext.builtin.Vector3i): gdext.builtin.Basis = {
    if (gdext.classes.GridMap.mb_get_cell_item_basis == null) gdext.classes.GridMap.mb_get_cell_item_basis = MethodBind.get("GridMap", "get_cell_item_basis", 3493604918L)
    Ptrcall.call1[gdext.builtin.Vector3i, gdext.builtin.Basis](gdext.classes.GridMap.mb_get_cell_item_basis, livePtr, position)
  }

  /** GridMap.get_basis_with_orthogonal_index */
  final def getBasisWithOrthogonalIndex(index: Long): gdext.builtin.Basis = {
    if (gdext.classes.GridMap.mb_get_basis_with_orthogonal_index == null) gdext.classes.GridMap.mb_get_basis_with_orthogonal_index = MethodBind.get("GridMap", "get_basis_with_orthogonal_index", 2816196998L)
    Ptrcall.call1[Long, gdext.builtin.Basis](gdext.classes.GridMap.mb_get_basis_with_orthogonal_index, livePtr, index)
  }

  /** GridMap.get_orthogonal_index_from_basis */
  final def getOrthogonalIndexFromBasis(basis: gdext.builtin.Basis): Long = {
    if (gdext.classes.GridMap.mb_get_orthogonal_index_from_basis == null) gdext.classes.GridMap.mb_get_orthogonal_index_from_basis = MethodBind.get("GridMap", "get_orthogonal_index_from_basis", 4210359952L)
    Ptrcall.call1[gdext.builtin.Basis, Long](gdext.classes.GridMap.mb_get_orthogonal_index_from_basis, livePtr, basis)
  }

  /** GridMap.local_to_map */
  final def localToMap(local_position: gdext.builtin.Vector3): gdext.builtin.Vector3i = {
    if (gdext.classes.GridMap.mb_local_to_map == null) gdext.classes.GridMap.mb_local_to_map = MethodBind.get("GridMap", "local_to_map", 1257687843L)
    Ptrcall.call1[gdext.builtin.Vector3, gdext.builtin.Vector3i](gdext.classes.GridMap.mb_local_to_map, livePtr, local_position)
  }

  /** GridMap.map_to_local */
  final def mapToLocal(map_position: gdext.builtin.Vector3i): gdext.builtin.Vector3 = {
    if (gdext.classes.GridMap.mb_map_to_local == null) gdext.classes.GridMap.mb_map_to_local = MethodBind.get("GridMap", "map_to_local", 1088329196L)
    Ptrcall.call1[gdext.builtin.Vector3i, gdext.builtin.Vector3](gdext.classes.GridMap.mb_map_to_local, livePtr, map_position)
  }

  /** GridMap.resource_changed */
  final def resourceChanged(resource: Resource): Unit = {
    if (gdext.classes.GridMap.mb_resource_changed == null) gdext.classes.GridMap.mb_resource_changed = MethodBind.get("GridMap", "resource_changed", 968641751L)
    Ptrcall.callVoid1(gdext.classes.GridMap.mb_resource_changed, livePtr, Wrappers.handle(resource))
  }

  /** GridMap.set_center_x */
  final def setCenterX(enable: Boolean): Unit = {
    if (gdext.classes.GridMap.mb_set_center_x == null) gdext.classes.GridMap.mb_set_center_x = MethodBind.get("GridMap", "set_center_x", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.GridMap.mb_set_center_x, livePtr, enable)
  }

  /** GridMap.get_center_x */
  final def getCenterX(): Boolean = {
    if (gdext.classes.GridMap.mb_get_center_x == null) gdext.classes.GridMap.mb_get_center_x = MethodBind.get("GridMap", "get_center_x", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.GridMap.mb_get_center_x, livePtr)
  }

  /** GridMap.set_center_y */
  final def setCenterY(enable: Boolean): Unit = {
    if (gdext.classes.GridMap.mb_set_center_y == null) gdext.classes.GridMap.mb_set_center_y = MethodBind.get("GridMap", "set_center_y", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.GridMap.mb_set_center_y, livePtr, enable)
  }

  /** GridMap.get_center_y */
  final def getCenterY(): Boolean = {
    if (gdext.classes.GridMap.mb_get_center_y == null) gdext.classes.GridMap.mb_get_center_y = MethodBind.get("GridMap", "get_center_y", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.GridMap.mb_get_center_y, livePtr)
  }

  /** GridMap.set_center_z */
  final def setCenterZ(enable: Boolean): Unit = {
    if (gdext.classes.GridMap.mb_set_center_z == null) gdext.classes.GridMap.mb_set_center_z = MethodBind.get("GridMap", "set_center_z", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.GridMap.mb_set_center_z, livePtr, enable)
  }

  /** GridMap.get_center_z */
  final def getCenterZ(): Boolean = {
    if (gdext.classes.GridMap.mb_get_center_z == null) gdext.classes.GridMap.mb_get_center_z = MethodBind.get("GridMap", "get_center_z", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.GridMap.mb_get_center_z, livePtr)
  }

  /** GridMap.clear */
  final def clear(): Unit = {
    if (gdext.classes.GridMap.mb_clear == null) gdext.classes.GridMap.mb_clear = MethodBind.get("GridMap", "clear", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.GridMap.mb_clear, livePtr)
  }

  /** GridMap.clear_baked_meshes */
  final def clearBakedMeshes(): Unit = {
    if (gdext.classes.GridMap.mb_clear_baked_meshes == null) gdext.classes.GridMap.mb_clear_baked_meshes = MethodBind.get("GridMap", "clear_baked_meshes", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.GridMap.mb_clear_baked_meshes, livePtr)
  }

  /** GridMap.make_baked_meshes */
  final def makeBakedMeshes(gen_lightmap_uv: Boolean, lightmap_uv_texel_size: Double): Unit = {
    if (gdext.classes.GridMap.mb_make_baked_meshes == null) gdext.classes.GridMap.mb_make_baked_meshes = MethodBind.get("GridMap", "make_baked_meshes", 3609286057L)
    Ptrcall.callVoid2(gdext.classes.GridMap.mb_make_baked_meshes, livePtr, gen_lightmap_uv, lightmap_uv_texel_size)
  }

}

object GridMap {
  private[classes] var mb_set_collision_layer: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collision_layer: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_collision_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collision_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_collision_mask_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collision_mask_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_collision_layer_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collision_layer_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_collision_priority: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collision_priority: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_physics_material: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_physics_material: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bake_navigation: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_baking_navigation: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_mesh_library: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_mesh_library: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_cell_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_cell_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_cell_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_cell_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_octant_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_octant_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_cell_item: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_cell_item: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_cell_item_orientation: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_cell_item_basis: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_basis_with_orthogonal_index: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_orthogonal_index_from_basis: GDExtensionMethodBindPtr = null
  private[classes] var mb_local_to_map: GDExtensionMethodBindPtr = null
  private[classes] var mb_map_to_local: GDExtensionMethodBindPtr = null
  private[classes] var mb_resource_changed: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_center_x: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_center_x: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_center_y: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_center_y: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_center_z: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_center_z: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_baked_meshes: GDExtensionMethodBindPtr = null
  private[classes] var mb_make_baked_meshes: GDExtensionMethodBindPtr = null
}
