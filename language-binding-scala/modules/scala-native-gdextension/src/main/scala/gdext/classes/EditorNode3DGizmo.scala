package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorNode3DGizmo`, extends `Node3DGizmo`. */
abstract class EditorNode3DGizmo extends Node3DGizmo {
  override def godotClassName: String = "EditorNode3DGizmo"

  /** EditorNode3DGizmo.add_mesh */
  final def addMesh(mesh: Mesh, material: Material, transform: gdext.builtin.Transform3D, skeleton: SkinReference): Unit =
    Ptrcall.callVoid4(MethodBind.get("EditorNode3DGizmo", "add_mesh", 1579955111L), hostObject.objectPtr, mesh.hostObject, material.hostObject, transform, skeleton.hostObject)

  /** EditorNode3DGizmo.add_collision_triangles */
  final def addCollisionTriangles(triangles: TriangleMesh): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorNode3DGizmo", "add_collision_triangles", 54901064L), hostObject.objectPtr, triangles.hostObject)

  /** EditorNode3DGizmo.add_unscaled_billboard */
  final def addUnscaledBillboard(material: Material, default_scale: Double, modulate: gdext.builtin.Color): Unit =
    Ptrcall.callVoid3(MethodBind.get("EditorNode3DGizmo", "add_unscaled_billboard", 520007164L), hostObject.objectPtr, material.hostObject, default_scale, modulate)

  /** EditorNode3DGizmo.set_node_3d */
  final def setNode3d(node: Node): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorNode3DGizmo", "set_node_3d", 1078189570L), hostObject.objectPtr, node.hostObject)

  /** EditorNode3DGizmo.get_node_3d */
  final def getNode3d(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("EditorNode3DGizmo", "get_node_3d", 151077316L), hostObject.objectPtr)

  /** EditorNode3DGizmo.get_plugin */
  final def getPlugin(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("EditorNode3DGizmo", "get_plugin", 4250544552L), hostObject.objectPtr)

  /** EditorNode3DGizmo.clear */
  final def clear(): Unit =
    Ptrcall.callVoid0(MethodBind.get("EditorNode3DGizmo", "clear", 3218959716L), hostObject.objectPtr)

  /** EditorNode3DGizmo.set_hidden */
  final def setHidden(hidden: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorNode3DGizmo", "set_hidden", 2586408642L), hostObject.objectPtr, hidden)

  /** EditorNode3DGizmo.is_subgizmo_selected */
  final def isSubgizmoSelected(id: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("EditorNode3DGizmo", "is_subgizmo_selected", 1116898809L), hostObject.objectPtr, id)

}
