package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `MeshLibrary`, extends `Resource`. */
abstract class MeshLibrary extends Resource {
  override def godotClassName: String = "MeshLibrary"

  /** MeshLibrary.create_item */
  final def createItem(id: Long): Unit = {
    if (gdext.classes.MeshLibrary.mb_create_item == null) gdext.classes.MeshLibrary.mb_create_item = MethodBind.get("MeshLibrary", "create_item", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.MeshLibrary.mb_create_item, livePtr, id)
  }

  /** MeshLibrary.set_item_name */
  final def setItemName(id: Long, name: String): Unit = {
    if (gdext.classes.MeshLibrary.mb_set_item_name == null) gdext.classes.MeshLibrary.mb_set_item_name = MethodBind.get("MeshLibrary", "set_item_name", 501894301L)
    Ptrcall.callVoid2(gdext.classes.MeshLibrary.mb_set_item_name, livePtr, id, name)
  }

  /** MeshLibrary.set_item_mesh */
  final def setItemMesh(id: Long, mesh: Mesh): Unit = {
    if (gdext.classes.MeshLibrary.mb_set_item_mesh == null) gdext.classes.MeshLibrary.mb_set_item_mesh = MethodBind.get("MeshLibrary", "set_item_mesh", 969122797L)
    Ptrcall.callVoid2(gdext.classes.MeshLibrary.mb_set_item_mesh, livePtr, id, Wrappers.handle(mesh))
  }

  /** MeshLibrary.set_item_mesh_transform */
  final def setItemMeshTransform(id: Long, mesh_transform: gdext.builtin.Transform3D): Unit = {
    if (gdext.classes.MeshLibrary.mb_set_item_mesh_transform == null) gdext.classes.MeshLibrary.mb_set_item_mesh_transform = MethodBind.get("MeshLibrary", "set_item_mesh_transform", 3616898986L)
    Ptrcall.callVoid2(gdext.classes.MeshLibrary.mb_set_item_mesh_transform, livePtr, id, mesh_transform)
  }

  /** MeshLibrary.set_item_mesh_cast_shadow */
  final def setItemMeshCastShadow(id: Long, shadow_casting_setting: Long): Unit = {
    if (gdext.classes.MeshLibrary.mb_set_item_mesh_cast_shadow == null) gdext.classes.MeshLibrary.mb_set_item_mesh_cast_shadow = MethodBind.get("MeshLibrary", "set_item_mesh_cast_shadow", 3923400443L)
    Ptrcall.callVoid2(gdext.classes.MeshLibrary.mb_set_item_mesh_cast_shadow, livePtr, id, shadow_casting_setting)
  }

  /** MeshLibrary.set_item_navigation_mesh */
  final def setItemNavigationMesh(id: Long, navigation_mesh: NavigationMesh): Unit = {
    if (gdext.classes.MeshLibrary.mb_set_item_navigation_mesh == null) gdext.classes.MeshLibrary.mb_set_item_navigation_mesh = MethodBind.get("MeshLibrary", "set_item_navigation_mesh", 3483353960L)
    Ptrcall.callVoid2(gdext.classes.MeshLibrary.mb_set_item_navigation_mesh, livePtr, id, Wrappers.handle(navigation_mesh))
  }

  /** MeshLibrary.set_item_navigation_mesh_transform */
  final def setItemNavigationMeshTransform(id: Long, navigation_mesh: gdext.builtin.Transform3D): Unit = {
    if (gdext.classes.MeshLibrary.mb_set_item_navigation_mesh_transform == null) gdext.classes.MeshLibrary.mb_set_item_navigation_mesh_transform = MethodBind.get("MeshLibrary", "set_item_navigation_mesh_transform", 3616898986L)
    Ptrcall.callVoid2(gdext.classes.MeshLibrary.mb_set_item_navigation_mesh_transform, livePtr, id, navigation_mesh)
  }

  /** MeshLibrary.set_item_navigation_layers */
  final def setItemNavigationLayers(id: Long, navigation_layers: Long): Unit = {
    if (gdext.classes.MeshLibrary.mb_set_item_navigation_layers == null) gdext.classes.MeshLibrary.mb_set_item_navigation_layers = MethodBind.get("MeshLibrary", "set_item_navigation_layers", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.MeshLibrary.mb_set_item_navigation_layers, livePtr, id, navigation_layers)
  }

  /** MeshLibrary.set_item_preview */
  final def setItemPreview(id: Long, texture: Texture2D): Unit = {
    if (gdext.classes.MeshLibrary.mb_set_item_preview == null) gdext.classes.MeshLibrary.mb_set_item_preview = MethodBind.get("MeshLibrary", "set_item_preview", 666127730L)
    Ptrcall.callVoid2(gdext.classes.MeshLibrary.mb_set_item_preview, livePtr, id, Wrappers.handle(texture))
  }

  /** MeshLibrary.get_item_name */
  final def getItemName(id: Long): String = {
    if (gdext.classes.MeshLibrary.mb_get_item_name == null) gdext.classes.MeshLibrary.mb_get_item_name = MethodBind.get("MeshLibrary", "get_item_name", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.MeshLibrary.mb_get_item_name, livePtr, id)
  }

  /** MeshLibrary.get_item_mesh. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getItemMesh(id: Long): Mesh = {
    if (gdext.classes.MeshLibrary.mb_get_item_mesh == null) gdext.classes.MeshLibrary.mb_get_item_mesh = MethodBind.get("MeshLibrary", "get_item_mesh", 1576363275L)
    Wrappers.owned[Mesh](Ptrcall.call1[Long, Long](gdext.classes.MeshLibrary.mb_get_item_mesh, livePtr, id))
  }

  /** MeshLibrary.get_item_mesh_transform */
  final def getItemMeshTransform(id: Long): gdext.builtin.Transform3D = {
    if (gdext.classes.MeshLibrary.mb_get_item_mesh_transform == null) gdext.classes.MeshLibrary.mb_get_item_mesh_transform = MethodBind.get("MeshLibrary", "get_item_mesh_transform", 1965739696L)
    Ptrcall.call1[Long, gdext.builtin.Transform3D](gdext.classes.MeshLibrary.mb_get_item_mesh_transform, livePtr, id)
  }

  /** MeshLibrary.get_item_mesh_cast_shadow */
  final def getItemMeshCastShadow(id: Long): Long = {
    if (gdext.classes.MeshLibrary.mb_get_item_mesh_cast_shadow == null) gdext.classes.MeshLibrary.mb_get_item_mesh_cast_shadow = MethodBind.get("MeshLibrary", "get_item_mesh_cast_shadow", 1841766007L)
    Ptrcall.call1[Long, Long](gdext.classes.MeshLibrary.mb_get_item_mesh_cast_shadow, livePtr, id)
  }

  /** MeshLibrary.get_item_navigation_mesh. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getItemNavigationMesh(id: Long): NavigationMesh = {
    if (gdext.classes.MeshLibrary.mb_get_item_navigation_mesh == null) gdext.classes.MeshLibrary.mb_get_item_navigation_mesh = MethodBind.get("MeshLibrary", "get_item_navigation_mesh", 2729647406L)
    Wrappers.owned[NavigationMesh](Ptrcall.call1[Long, Long](gdext.classes.MeshLibrary.mb_get_item_navigation_mesh, livePtr, id))
  }

  /** MeshLibrary.get_item_navigation_mesh_transform */
  final def getItemNavigationMeshTransform(id: Long): gdext.builtin.Transform3D = {
    if (gdext.classes.MeshLibrary.mb_get_item_navigation_mesh_transform == null) gdext.classes.MeshLibrary.mb_get_item_navigation_mesh_transform = MethodBind.get("MeshLibrary", "get_item_navigation_mesh_transform", 1965739696L)
    Ptrcall.call1[Long, gdext.builtin.Transform3D](gdext.classes.MeshLibrary.mb_get_item_navigation_mesh_transform, livePtr, id)
  }

  /** MeshLibrary.get_item_navigation_layers */
  final def getItemNavigationLayers(id: Long): Long = {
    if (gdext.classes.MeshLibrary.mb_get_item_navigation_layers == null) gdext.classes.MeshLibrary.mb_get_item_navigation_layers = MethodBind.get("MeshLibrary", "get_item_navigation_layers", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.MeshLibrary.mb_get_item_navigation_layers, livePtr, id)
  }

  /** MeshLibrary.get_item_preview. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getItemPreview(id: Long): Texture2D = {
    if (gdext.classes.MeshLibrary.mb_get_item_preview == null) gdext.classes.MeshLibrary.mb_get_item_preview = MethodBind.get("MeshLibrary", "get_item_preview", 3536238170L)
    Wrappers.owned[Texture2D](Ptrcall.call1[Long, Long](gdext.classes.MeshLibrary.mb_get_item_preview, livePtr, id))
  }

  /** MeshLibrary.remove_item */
  final def removeItem(id: Long): Unit = {
    if (gdext.classes.MeshLibrary.mb_remove_item == null) gdext.classes.MeshLibrary.mb_remove_item = MethodBind.get("MeshLibrary", "remove_item", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.MeshLibrary.mb_remove_item, livePtr, id)
  }

  /** MeshLibrary.find_item_by_name */
  final def findItemByName(name: String): Long = {
    if (gdext.classes.MeshLibrary.mb_find_item_by_name == null) gdext.classes.MeshLibrary.mb_find_item_by_name = MethodBind.get("MeshLibrary", "find_item_by_name", 1321353865L)
    Ptrcall.call1[String, Long](gdext.classes.MeshLibrary.mb_find_item_by_name, livePtr, name)
  }

  /** MeshLibrary.clear */
  final def clear(): Unit = {
    if (gdext.classes.MeshLibrary.mb_clear == null) gdext.classes.MeshLibrary.mb_clear = MethodBind.get("MeshLibrary", "clear", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.MeshLibrary.mb_clear, livePtr)
  }

  /** MeshLibrary.get_last_unused_item_id */
  final def getLastUnusedItemId(): Long = {
    if (gdext.classes.MeshLibrary.mb_get_last_unused_item_id == null) gdext.classes.MeshLibrary.mb_get_last_unused_item_id = MethodBind.get("MeshLibrary", "get_last_unused_item_id", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.MeshLibrary.mb_get_last_unused_item_id, livePtr)
  }

}

object MeshLibrary {
  private[classes] var mb_create_item: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_item_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_item_mesh: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_item_mesh_transform: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_item_mesh_cast_shadow: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_item_navigation_mesh: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_item_navigation_mesh_transform: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_item_navigation_layers: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_item_preview: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_item_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_item_mesh: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_item_mesh_transform: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_item_mesh_cast_shadow: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_item_navigation_mesh: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_item_navigation_mesh_transform: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_item_navigation_layers: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_item_preview: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_item: GDExtensionMethodBindPtr = null
  private[classes] var mb_find_item_by_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_last_unused_item_id: GDExtensionMethodBindPtr = null
}
