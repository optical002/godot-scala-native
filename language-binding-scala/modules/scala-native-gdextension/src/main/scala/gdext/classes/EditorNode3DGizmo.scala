package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `EditorNode3DGizmo`, extends `Node3DGizmo`. */
abstract class EditorNode3DGizmo extends Node3DGizmo {
  override def godotClassName: String = "EditorNode3DGizmo"

  /** EditorNode3DGizmo.add_mesh */
  final def addMesh(mesh: Mesh, material: Material, transform: gdext.builtin.Transform3D, skeleton: SkinReference): Unit = {
    if (gdext.classes.EditorNode3DGizmo.mb_add_mesh == null) gdext.classes.EditorNode3DGizmo.mb_add_mesh = MethodBind.get("EditorNode3DGizmo", "add_mesh", 1579955111L)
    Ptrcall.callVoid4(gdext.classes.EditorNode3DGizmo.mb_add_mesh, livePtr, Wrappers.handle(mesh), Wrappers.handle(material), transform, Wrappers.handle(skeleton))
  }

  /** EditorNode3DGizmo.add_collision_triangles */
  final def addCollisionTriangles(triangles: TriangleMesh): Unit = {
    if (gdext.classes.EditorNode3DGizmo.mb_add_collision_triangles == null) gdext.classes.EditorNode3DGizmo.mb_add_collision_triangles = MethodBind.get("EditorNode3DGizmo", "add_collision_triangles", 54901064L)
    Ptrcall.callVoid1(gdext.classes.EditorNode3DGizmo.mb_add_collision_triangles, livePtr, Wrappers.handle(triangles))
  }

  /** EditorNode3DGizmo.add_unscaled_billboard */
  final def addUnscaledBillboard(material: Material, default_scale: Double, modulate: gdext.builtin.Color): Unit = {
    if (gdext.classes.EditorNode3DGizmo.mb_add_unscaled_billboard == null) gdext.classes.EditorNode3DGizmo.mb_add_unscaled_billboard = MethodBind.get("EditorNode3DGizmo", "add_unscaled_billboard", 520007164L)
    Ptrcall.callVoid3(gdext.classes.EditorNode3DGizmo.mb_add_unscaled_billboard, livePtr, Wrappers.handle(material), default_scale, modulate)
  }

  /** EditorNode3DGizmo.set_node_3d */
  final def setNode3d(node: Node): Unit = {
    if (gdext.classes.EditorNode3DGizmo.mb_set_node_3d == null) gdext.classes.EditorNode3DGizmo.mb_set_node_3d = MethodBind.get("EditorNode3DGizmo", "set_node_3d", 1078189570L)
    Ptrcall.callVoid1(gdext.classes.EditorNode3DGizmo.mb_set_node_3d, livePtr, Wrappers.handle(node))
  }

  /** EditorNode3DGizmo.get_node_3d */
  final def getNode3d(): Node3D = {
    if (gdext.classes.EditorNode3DGizmo.mb_get_node_3d == null) gdext.classes.EditorNode3DGizmo.mb_get_node_3d = MethodBind.get("EditorNode3DGizmo", "get_node_3d", 151077316L)
    Wrappers.borrowed[Node3D](Ptrcall.call0[Long](gdext.classes.EditorNode3DGizmo.mb_get_node_3d, livePtr))
  }

  /** EditorNode3DGizmo.get_plugin. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getPlugin(): EditorNode3DGizmoPlugin = {
    if (gdext.classes.EditorNode3DGizmo.mb_get_plugin == null) gdext.classes.EditorNode3DGizmo.mb_get_plugin = MethodBind.get("EditorNode3DGizmo", "get_plugin", 4250544552L)
    Wrappers.owned[EditorNode3DGizmoPlugin](Ptrcall.call0[Long](gdext.classes.EditorNode3DGizmo.mb_get_plugin, livePtr))
  }

  /** EditorNode3DGizmo.clear */
  final def clear(): Unit = {
    if (gdext.classes.EditorNode3DGizmo.mb_clear == null) gdext.classes.EditorNode3DGizmo.mb_clear = MethodBind.get("EditorNode3DGizmo", "clear", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.EditorNode3DGizmo.mb_clear, livePtr)
  }

  /** EditorNode3DGizmo.set_hidden */
  final def setHidden(hidden: Boolean): Unit = {
    if (gdext.classes.EditorNode3DGizmo.mb_set_hidden == null) gdext.classes.EditorNode3DGizmo.mb_set_hidden = MethodBind.get("EditorNode3DGizmo", "set_hidden", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.EditorNode3DGizmo.mb_set_hidden, livePtr, hidden)
  }

  /** EditorNode3DGizmo.is_subgizmo_selected */
  final def isSubgizmoSelected(id: Long): Boolean = {
    if (gdext.classes.EditorNode3DGizmo.mb_is_subgizmo_selected == null) gdext.classes.EditorNode3DGizmo.mb_is_subgizmo_selected = MethodBind.get("EditorNode3DGizmo", "is_subgizmo_selected", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.EditorNode3DGizmo.mb_is_subgizmo_selected, livePtr, id)
  }

}

object EditorNode3DGizmo {
  private[classes] var mb_add_mesh: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_collision_triangles: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_unscaled_billboard: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_node_3d: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_node_3d: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_plugin: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_hidden: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_subgizmo_selected: GDExtensionMethodBindPtr = null
}
