package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `MeshLibrary`, extends `Resource`. */
abstract class MeshLibrary extends Resource {

  /** MeshLibrary.create_item */
  final def createItem(id: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("MeshLibrary", "create_item", 1286410249L), hostObject.objectPtr, id)

  /** MeshLibrary.set_item_name */
  final def setItemName(id: Long, name: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("MeshLibrary", "set_item_name", 501894301L), hostObject.objectPtr, id, name)

  /** MeshLibrary.set_item_mesh */
  final def setItemMesh(id: Long, mesh: Mesh): Unit =
    Ptrcall.callVoid2(MethodBind.get("MeshLibrary", "set_item_mesh", 969122797L), hostObject.objectPtr, id, mesh.hostObject)

  /** MeshLibrary.set_item_mesh_transform */
  final def setItemMeshTransform(id: Long, mesh_transform: gdext.builtin.Transform3D): Unit =
    Ptrcall.callVoid2(MethodBind.get("MeshLibrary", "set_item_mesh_transform", 3616898986L), hostObject.objectPtr, id, mesh_transform)

  /** MeshLibrary.set_item_mesh_cast_shadow */
  final def setItemMeshCastShadow(id: Long, shadow_casting_setting: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("MeshLibrary", "set_item_mesh_cast_shadow", 3923400443L), hostObject.objectPtr, id, shadow_casting_setting)

  /** MeshLibrary.set_item_navigation_mesh */
  final def setItemNavigationMesh(id: Long, navigation_mesh: NavigationMesh): Unit =
    Ptrcall.callVoid2(MethodBind.get("MeshLibrary", "set_item_navigation_mesh", 3483353960L), hostObject.objectPtr, id, navigation_mesh.hostObject)

  /** MeshLibrary.set_item_navigation_mesh_transform */
  final def setItemNavigationMeshTransform(id: Long, navigation_mesh: gdext.builtin.Transform3D): Unit =
    Ptrcall.callVoid2(MethodBind.get("MeshLibrary", "set_item_navigation_mesh_transform", 3616898986L), hostObject.objectPtr, id, navigation_mesh)

  /** MeshLibrary.set_item_navigation_layers */
  final def setItemNavigationLayers(id: Long, navigation_layers: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("MeshLibrary", "set_item_navigation_layers", 3937882851L), hostObject.objectPtr, id, navigation_layers)

  /** MeshLibrary.set_item_preview */
  final def setItemPreview(id: Long, texture: Texture2D): Unit =
    Ptrcall.callVoid2(MethodBind.get("MeshLibrary", "set_item_preview", 666127730L), hostObject.objectPtr, id, texture.hostObject)

  /** MeshLibrary.get_item_name */
  final def getItemName(id: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("MeshLibrary", "get_item_name", 844755477L), hostObject.objectPtr, id)

  /** MeshLibrary.get_item_mesh */
  final def getItemMesh(id: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("MeshLibrary", "get_item_mesh", 1576363275L), hostObject.objectPtr, id)

  /** MeshLibrary.get_item_mesh_transform */
  final def getItemMeshTransform(id: Long): gdext.builtin.Transform3D =
    Ptrcall.call1[Long, gdext.builtin.Transform3D](MethodBind.get("MeshLibrary", "get_item_mesh_transform", 1965739696L), hostObject.objectPtr, id)

  /** MeshLibrary.get_item_mesh_cast_shadow */
  final def getItemMeshCastShadow(id: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("MeshLibrary", "get_item_mesh_cast_shadow", 1841766007L), hostObject.objectPtr, id)

  /** MeshLibrary.get_item_navigation_mesh */
  final def getItemNavigationMesh(id: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("MeshLibrary", "get_item_navigation_mesh", 2729647406L), hostObject.objectPtr, id)

  /** MeshLibrary.get_item_navigation_mesh_transform */
  final def getItemNavigationMeshTransform(id: Long): gdext.builtin.Transform3D =
    Ptrcall.call1[Long, gdext.builtin.Transform3D](MethodBind.get("MeshLibrary", "get_item_navigation_mesh_transform", 1965739696L), hostObject.objectPtr, id)

  /** MeshLibrary.get_item_navigation_layers */
  final def getItemNavigationLayers(id: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("MeshLibrary", "get_item_navigation_layers", 923996154L), hostObject.objectPtr, id)

  /** MeshLibrary.get_item_preview */
  final def getItemPreview(id: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("MeshLibrary", "get_item_preview", 3536238170L), hostObject.objectPtr, id)

  /** MeshLibrary.remove_item */
  final def removeItem(id: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("MeshLibrary", "remove_item", 1286410249L), hostObject.objectPtr, id)

  /** MeshLibrary.find_item_by_name */
  final def findItemByName(name: String): Long =
    Ptrcall.call1[String, Long](MethodBind.get("MeshLibrary", "find_item_by_name", 1321353865L), hostObject.objectPtr, name)

  /** MeshLibrary.clear */
  final def clear(): Unit =
    Ptrcall.callVoid0(MethodBind.get("MeshLibrary", "clear", 3218959716L), hostObject.objectPtr)

  /** MeshLibrary.get_last_unused_item_id */
  final def getLastUnusedItemId(): Long =
    Ptrcall.call0[Long](MethodBind.get("MeshLibrary", "get_last_unused_item_id", 3905245786L), hostObject.objectPtr)

}

object MeshLibrary {
  /** Class metadata for Gd[MeshLibrary] lifetime management and casting. */
  given GodotClass[MeshLibrary] with {
    def className = "MeshLibrary"
    def isRefCounted = true
    def wrap(o: GodotObject): MeshLibrary = new MeshLibrary {}.withHost(o.objectPtr)
    def unwrap(t: MeshLibrary): GodotObject = t.hostObject
  }
}
