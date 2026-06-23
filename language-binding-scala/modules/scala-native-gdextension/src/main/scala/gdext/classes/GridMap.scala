package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `GridMap`, extends `Node3D`. */
abstract class GridMap extends Node3D {

  /** GridMap.set_collision_layer */
  final def setCollisionLayer(layer: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GridMap", "set_collision_layer", 1286410249L), hostObject.objectPtr, layer)

  /** GridMap.get_collision_layer */
  final def getCollisionLayer(): Long =
    Ptrcall.call0[Long](MethodBind.get("GridMap", "get_collision_layer", 3905245786L), hostObject.objectPtr)

  /** GridMap.set_collision_mask */
  final def setCollisionMask(mask: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GridMap", "set_collision_mask", 1286410249L), hostObject.objectPtr, mask)

  /** GridMap.get_collision_mask */
  final def getCollisionMask(): Long =
    Ptrcall.call0[Long](MethodBind.get("GridMap", "get_collision_mask", 3905245786L), hostObject.objectPtr)

  /** GridMap.set_collision_mask_value */
  final def setCollisionMaskValue(layer_number: Long, value: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("GridMap", "set_collision_mask_value", 300928843L), hostObject.objectPtr, layer_number, value)

  /** GridMap.get_collision_mask_value */
  final def getCollisionMaskValue(layer_number: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("GridMap", "get_collision_mask_value", 1116898809L), hostObject.objectPtr, layer_number)

  /** GridMap.set_collision_layer_value */
  final def setCollisionLayerValue(layer_number: Long, value: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("GridMap", "set_collision_layer_value", 300928843L), hostObject.objectPtr, layer_number, value)

  /** GridMap.get_collision_layer_value */
  final def getCollisionLayerValue(layer_number: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("GridMap", "get_collision_layer_value", 1116898809L), hostObject.objectPtr, layer_number)

  /** GridMap.set_collision_priority */
  final def setCollisionPriority(priority: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("GridMap", "set_collision_priority", 373806689L), hostObject.objectPtr, priority)

  /** GridMap.get_collision_priority */
  final def getCollisionPriority(): Double =
    Ptrcall.call0[Double](MethodBind.get("GridMap", "get_collision_priority", 1740695150L), hostObject.objectPtr)

  /** GridMap.set_physics_material */
  final def setPhysicsMaterial(material: PhysicsMaterial): Unit =
    Ptrcall.callVoid1(MethodBind.get("GridMap", "set_physics_material", 1784508650L), hostObject.objectPtr, material.hostObject)

  /** GridMap.get_physics_material */
  final def getPhysicsMaterial(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("GridMap", "get_physics_material", 2521850424L), hostObject.objectPtr)

  /** GridMap.set_bake_navigation */
  final def setBakeNavigation(bake_navigation: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("GridMap", "set_bake_navigation", 2586408642L), hostObject.objectPtr, bake_navigation)

  /** GridMap.is_baking_navigation */
  final def isBakingNavigation(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("GridMap", "is_baking_navigation", 2240911060L), hostObject.objectPtr)

  /** GridMap.set_mesh_library */
  final def setMeshLibrary(mesh_library: MeshLibrary): Unit =
    Ptrcall.callVoid1(MethodBind.get("GridMap", "set_mesh_library", 1488083439L), hostObject.objectPtr, mesh_library.hostObject)

  /** GridMap.get_mesh_library */
  final def getMeshLibrary(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("GridMap", "get_mesh_library", 3350993772L), hostObject.objectPtr)

  /** GridMap.set_cell_size */
  final def setCellSize(size: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("GridMap", "set_cell_size", 3460891852L), hostObject.objectPtr, size)

  /** GridMap.get_cell_size */
  final def getCellSize(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("GridMap", "get_cell_size", 3360562783L), hostObject.objectPtr)

  /** GridMap.set_cell_scale */
  final def setCellScale(scale: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("GridMap", "set_cell_scale", 373806689L), hostObject.objectPtr, scale)

  /** GridMap.get_cell_scale */
  final def getCellScale(): Double =
    Ptrcall.call0[Double](MethodBind.get("GridMap", "get_cell_scale", 1740695150L), hostObject.objectPtr)

  /** GridMap.set_octant_size */
  final def setOctantSize(size: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GridMap", "set_octant_size", 1286410249L), hostObject.objectPtr, size)

  /** GridMap.get_octant_size */
  final def getOctantSize(): Long =
    Ptrcall.call0[Long](MethodBind.get("GridMap", "get_octant_size", 3905245786L), hostObject.objectPtr)

  /** GridMap.set_cell_item */
  final def setCellItem(position: gdext.builtin.Vector3i, item: Long, orientation: Long): Unit =
    Ptrcall.callVoid3(MethodBind.get("GridMap", "set_cell_item", 3449088946L), hostObject.objectPtr, position, item, orientation)

  /** GridMap.get_cell_item */
  final def getCellItem(position: gdext.builtin.Vector3i): Long =
    Ptrcall.call1[gdext.builtin.Vector3i, Long](MethodBind.get("GridMap", "get_cell_item", 3724960147L), hostObject.objectPtr, position)

  /** GridMap.get_cell_item_orientation */
  final def getCellItemOrientation(position: gdext.builtin.Vector3i): Long =
    Ptrcall.call1[gdext.builtin.Vector3i, Long](MethodBind.get("GridMap", "get_cell_item_orientation", 3724960147L), hostObject.objectPtr, position)

  /** GridMap.get_cell_item_basis */
  final def getCellItemBasis(position: gdext.builtin.Vector3i): gdext.builtin.Basis =
    Ptrcall.call1[gdext.builtin.Vector3i, gdext.builtin.Basis](MethodBind.get("GridMap", "get_cell_item_basis", 3493604918L), hostObject.objectPtr, position)

  /** GridMap.get_basis_with_orthogonal_index */
  final def getBasisWithOrthogonalIndex(index: Long): gdext.builtin.Basis =
    Ptrcall.call1[Long, gdext.builtin.Basis](MethodBind.get("GridMap", "get_basis_with_orthogonal_index", 2816196998L), hostObject.objectPtr, index)

  /** GridMap.get_orthogonal_index_from_basis */
  final def getOrthogonalIndexFromBasis(basis: gdext.builtin.Basis): Long =
    Ptrcall.call1[gdext.builtin.Basis, Long](MethodBind.get("GridMap", "get_orthogonal_index_from_basis", 4210359952L), hostObject.objectPtr, basis)

  /** GridMap.local_to_map */
  final def localToMap(local_position: gdext.builtin.Vector3): gdext.builtin.Vector3i =
    Ptrcall.call1[gdext.builtin.Vector3, gdext.builtin.Vector3i](MethodBind.get("GridMap", "local_to_map", 1257687843L), hostObject.objectPtr, local_position)

  /** GridMap.map_to_local */
  final def mapToLocal(map_position: gdext.builtin.Vector3i): gdext.builtin.Vector3 =
    Ptrcall.call1[gdext.builtin.Vector3i, gdext.builtin.Vector3](MethodBind.get("GridMap", "map_to_local", 1088329196L), hostObject.objectPtr, map_position)

  /** GridMap.resource_changed */
  final def resourceChanged(resource: Resource): Unit =
    Ptrcall.callVoid1(MethodBind.get("GridMap", "resource_changed", 968641751L), hostObject.objectPtr, resource.hostObject)

  /** GridMap.set_center_x */
  final def setCenterX(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("GridMap", "set_center_x", 2586408642L), hostObject.objectPtr, enable)

  /** GridMap.get_center_x */
  final def getCenterX(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("GridMap", "get_center_x", 36873697L), hostObject.objectPtr)

  /** GridMap.set_center_y */
  final def setCenterY(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("GridMap", "set_center_y", 2586408642L), hostObject.objectPtr, enable)

  /** GridMap.get_center_y */
  final def getCenterY(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("GridMap", "get_center_y", 36873697L), hostObject.objectPtr)

  /** GridMap.set_center_z */
  final def setCenterZ(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("GridMap", "set_center_z", 2586408642L), hostObject.objectPtr, enable)

  /** GridMap.get_center_z */
  final def getCenterZ(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("GridMap", "get_center_z", 36873697L), hostObject.objectPtr)

  /** GridMap.clear */
  final def clear(): Unit =
    Ptrcall.callVoid0(MethodBind.get("GridMap", "clear", 3218959716L), hostObject.objectPtr)

  /** GridMap.clear_baked_meshes */
  final def clearBakedMeshes(): Unit =
    Ptrcall.callVoid0(MethodBind.get("GridMap", "clear_baked_meshes", 3218959716L), hostObject.objectPtr)

  /** GridMap.make_baked_meshes */
  final def makeBakedMeshes(gen_lightmap_uv: Boolean, lightmap_uv_texel_size: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("GridMap", "make_baked_meshes", 3609286057L), hostObject.objectPtr, gen_lightmap_uv, lightmap_uv_texel_size)

}

object GridMap {
  /** Class metadata for Gd[GridMap] lifetime management and casting. */
  given GodotClass[GridMap] with {
    def className = "GridMap"
    def isRefCounted = false
    def wrap(o: GodotObject): GridMap = new GridMap {}.withHost(o.objectPtr)
    def unwrap(t: GridMap): GodotObject = t.hostObject
  }
}
