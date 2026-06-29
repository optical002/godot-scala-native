package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `Node3D`, extends `Node`. */
abstract class Node3D extends Node {
  override def godotClassName: String = "Node3D"

  /** Node3D.set_transform */
  final def setTransform(local: gdext.builtin.Transform3D): Unit =
    Ptrcall.callVoid1(MethodBind.get("Node3D", "set_transform", 2952846383L), hostObject.objectPtr, local)

  /** Node3D.get_transform */
  final def getTransform(): gdext.builtin.Transform3D =
    Ptrcall.call0[gdext.builtin.Transform3D](MethodBind.get("Node3D", "get_transform", 3229777777L), hostObject.objectPtr)

  /** Node3D.set_position */
  final def setPosition(position: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("Node3D", "set_position", 3460891852L), hostObject.objectPtr, position)

  /** Node3D.get_position */
  final def getPosition(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("Node3D", "get_position", 3360562783L), hostObject.objectPtr)

  /** Node3D.set_rotation */
  final def setRotation(euler_radians: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("Node3D", "set_rotation", 3460891852L), hostObject.objectPtr, euler_radians)

  /** Node3D.get_rotation */
  final def getRotation(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("Node3D", "get_rotation", 3360562783L), hostObject.objectPtr)

  /** Node3D.set_rotation_degrees */
  final def setRotationDegrees(euler_degrees: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("Node3D", "set_rotation_degrees", 3460891852L), hostObject.objectPtr, euler_degrees)

  /** Node3D.get_rotation_degrees */
  final def getRotationDegrees(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("Node3D", "get_rotation_degrees", 3360562783L), hostObject.objectPtr)

  /** Node3D.set_rotation_order */
  final def setRotationOrder(order: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Node3D", "set_rotation_order", 1820889989L), hostObject.objectPtr, order)

  /** Node3D.get_rotation_order */
  final def getRotationOrder(): Long =
    Ptrcall.call0[Long](MethodBind.get("Node3D", "get_rotation_order", 916939469L), hostObject.objectPtr)

  /** Node3D.set_rotation_edit_mode */
  final def setRotationEditMode(edit_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Node3D", "set_rotation_edit_mode", 141483330L), hostObject.objectPtr, edit_mode)

  /** Node3D.get_rotation_edit_mode */
  final def getRotationEditMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("Node3D", "get_rotation_edit_mode", 1572188370L), hostObject.objectPtr)

  /** Node3D.set_scale */
  final def setScale(scale: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("Node3D", "set_scale", 3460891852L), hostObject.objectPtr, scale)

  /** Node3D.get_scale */
  final def getScale(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("Node3D", "get_scale", 3360562783L), hostObject.objectPtr)

  /** Node3D.set_quaternion */
  final def setQuaternion(quaternion: gdext.builtin.Quaternion): Unit =
    Ptrcall.callVoid1(MethodBind.get("Node3D", "set_quaternion", 1727505552L), hostObject.objectPtr, quaternion)

  /** Node3D.get_quaternion */
  final def getQuaternion(): gdext.builtin.Quaternion =
    Ptrcall.call0[gdext.builtin.Quaternion](MethodBind.get("Node3D", "get_quaternion", 1222331677L), hostObject.objectPtr)

  /** Node3D.set_basis */
  final def setBasis(basis: gdext.builtin.Basis): Unit =
    Ptrcall.callVoid1(MethodBind.get("Node3D", "set_basis", 1055510324L), hostObject.objectPtr, basis)

  /** Node3D.get_basis */
  final def getBasis(): gdext.builtin.Basis =
    Ptrcall.call0[gdext.builtin.Basis](MethodBind.get("Node3D", "get_basis", 2716978435L), hostObject.objectPtr)

  /** Node3D.set_global_transform */
  final def setGlobalTransform(global: gdext.builtin.Transform3D): Unit =
    Ptrcall.callVoid1(MethodBind.get("Node3D", "set_global_transform", 2952846383L), hostObject.objectPtr, global)

  /** Node3D.get_global_transform */
  final def getGlobalTransform(): gdext.builtin.Transform3D =
    Ptrcall.call0[gdext.builtin.Transform3D](MethodBind.get("Node3D", "get_global_transform", 3229777777L), hostObject.objectPtr)

  /** Node3D.get_global_transform_interpolated */
  final def getGlobalTransformInterpolated(): gdext.builtin.Transform3D =
    Ptrcall.call0[gdext.builtin.Transform3D](MethodBind.get("Node3D", "get_global_transform_interpolated", 4183770049L), hostObject.objectPtr)

  /** Node3D.set_global_position */
  final def setGlobalPosition(position: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("Node3D", "set_global_position", 3460891852L), hostObject.objectPtr, position)

  /** Node3D.get_global_position */
  final def getGlobalPosition(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("Node3D", "get_global_position", 3360562783L), hostObject.objectPtr)

  /** Node3D.set_global_basis */
  final def setGlobalBasis(basis: gdext.builtin.Basis): Unit =
    Ptrcall.callVoid1(MethodBind.get("Node3D", "set_global_basis", 1055510324L), hostObject.objectPtr, basis)

  /** Node3D.get_global_basis */
  final def getGlobalBasis(): gdext.builtin.Basis =
    Ptrcall.call0[gdext.builtin.Basis](MethodBind.get("Node3D", "get_global_basis", 2716978435L), hostObject.objectPtr)

  /** Node3D.set_global_rotation */
  final def setGlobalRotation(euler_radians: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("Node3D", "set_global_rotation", 3460891852L), hostObject.objectPtr, euler_radians)

  /** Node3D.get_global_rotation */
  final def getGlobalRotation(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("Node3D", "get_global_rotation", 3360562783L), hostObject.objectPtr)

  /** Node3D.set_global_rotation_degrees */
  final def setGlobalRotationDegrees(euler_degrees: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("Node3D", "set_global_rotation_degrees", 3460891852L), hostObject.objectPtr, euler_degrees)

  /** Node3D.get_global_rotation_degrees */
  final def getGlobalRotationDegrees(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("Node3D", "get_global_rotation_degrees", 3360562783L), hostObject.objectPtr)

  /** Node3D.get_parent_node_3d */
  final def getParentNode3d(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Node3D", "get_parent_node_3d", 151077316L), hostObject.objectPtr)

  /** Node3D.set_ignore_transform_notification */
  final def setIgnoreTransformNotification(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Node3D", "set_ignore_transform_notification", 2586408642L), hostObject.objectPtr, enabled)

  /** Node3D.set_as_top_level */
  final def setAsTopLevel(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Node3D", "set_as_top_level", 2586408642L), hostObject.objectPtr, enable)

  /** Node3D.is_set_as_top_level */
  final def isSetAsTopLevel(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Node3D", "is_set_as_top_level", 36873697L), hostObject.objectPtr)

  /** Node3D.set_disable_scale */
  final def setDisableScale(disable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Node3D", "set_disable_scale", 2586408642L), hostObject.objectPtr, disable)

  /** Node3D.is_scale_disabled */
  final def isScaleDisabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Node3D", "is_scale_disabled", 36873697L), hostObject.objectPtr)

  /** Node3D.get_world_3d */
  final def getWorld3d(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Node3D", "get_world_3d", 317588385L), hostObject.objectPtr)

  /** Node3D.force_update_transform */
  final def forceUpdateTransform(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Node3D", "force_update_transform", 3218959716L), hostObject.objectPtr)

  /** Node3D.update_gizmos */
  final def updateGizmos(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Node3D", "update_gizmos", 3218959716L), hostObject.objectPtr)

  /** Node3D.add_gizmo */
  final def addGizmo(gizmo: Node3DGizmo): Unit =
    Ptrcall.callVoid1(MethodBind.get("Node3D", "add_gizmo", 1544533845L), hostObject.objectPtr, gizmo.hostObject)

  /** Node3D.clear_gizmos */
  final def clearGizmos(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Node3D", "clear_gizmos", 3218959716L), hostObject.objectPtr)

  /** Node3D.set_subgizmo_selection */
  final def setSubgizmoSelection(gizmo: Node3DGizmo, id: Long, transform: gdext.builtin.Transform3D): Unit =
    Ptrcall.callVoid3(MethodBind.get("Node3D", "set_subgizmo_selection", 3317607635L), hostObject.objectPtr, gizmo.hostObject, id, transform)

  /** Node3D.clear_subgizmo_selection */
  final def clearSubgizmoSelection(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Node3D", "clear_subgizmo_selection", 3218959716L), hostObject.objectPtr)

  /** Node3D.set_visible */
  final def setVisible(visible: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Node3D", "set_visible", 2586408642L), hostObject.objectPtr, visible)

  /** Node3D.is_visible */
  final def isVisible(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Node3D", "is_visible", 36873697L), hostObject.objectPtr)

  /** Node3D.is_visible_in_tree */
  final def isVisibleInTree(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Node3D", "is_visible_in_tree", 36873697L), hostObject.objectPtr)

  /** Node3D.show */
  final def show(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Node3D", "show", 3218959716L), hostObject.objectPtr)

  /** Node3D.hide */
  final def hide(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Node3D", "hide", 3218959716L), hostObject.objectPtr)

  /** Node3D.set_notify_local_transform */
  final def setNotifyLocalTransform(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Node3D", "set_notify_local_transform", 2586408642L), hostObject.objectPtr, enable)

  /** Node3D.is_local_transform_notification_enabled */
  final def isLocalTransformNotificationEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Node3D", "is_local_transform_notification_enabled", 36873697L), hostObject.objectPtr)

  /** Node3D.set_notify_transform */
  final def setNotifyTransform(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Node3D", "set_notify_transform", 2586408642L), hostObject.objectPtr, enable)

  /** Node3D.is_transform_notification_enabled */
  final def isTransformNotificationEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Node3D", "is_transform_notification_enabled", 36873697L), hostObject.objectPtr)

  /** Node3D.rotate */
  final def rotate(axis: gdext.builtin.Vector3, angle: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("Node3D", "rotate", 3436291937L), hostObject.objectPtr, axis, angle)

  /** Node3D.global_rotate */
  final def globalRotate(axis: gdext.builtin.Vector3, angle: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("Node3D", "global_rotate", 3436291937L), hostObject.objectPtr, axis, angle)

  /** Node3D.global_scale */
  final def globalScale(scale: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("Node3D", "global_scale", 3460891852L), hostObject.objectPtr, scale)

  /** Node3D.global_translate */
  final def globalTranslate(offset: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("Node3D", "global_translate", 3460891852L), hostObject.objectPtr, offset)

  /** Node3D.rotate_object_local */
  final def rotateObjectLocal(axis: gdext.builtin.Vector3, angle: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("Node3D", "rotate_object_local", 3436291937L), hostObject.objectPtr, axis, angle)

  /** Node3D.scale_object_local */
  final def scaleObjectLocal(scale: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("Node3D", "scale_object_local", 3460891852L), hostObject.objectPtr, scale)

  /** Node3D.translate_object_local */
  final def translateObjectLocal(offset: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("Node3D", "translate_object_local", 3460891852L), hostObject.objectPtr, offset)

  /** Node3D.rotate_x */
  final def rotateX(angle: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Node3D", "rotate_x", 373806689L), hostObject.objectPtr, angle)

  /** Node3D.rotate_y */
  final def rotateY(angle: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Node3D", "rotate_y", 373806689L), hostObject.objectPtr, angle)

  /** Node3D.rotate_z */
  final def rotateZ(angle: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Node3D", "rotate_z", 373806689L), hostObject.objectPtr, angle)

  /** Node3D.translate */
  final def translate(offset: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("Node3D", "translate", 3460891852L), hostObject.objectPtr, offset)

  /** Node3D.orthonormalize */
  final def orthonormalize(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Node3D", "orthonormalize", 3218959716L), hostObject.objectPtr)

  /** Node3D.set_identity */
  final def setIdentity(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Node3D", "set_identity", 3218959716L), hostObject.objectPtr)

  /** Node3D.look_at */
  final def lookAt(target: gdext.builtin.Vector3, up: gdext.builtin.Vector3, use_model_front: Boolean): Unit =
    Ptrcall.callVoid3(MethodBind.get("Node3D", "look_at", 2882425029L), hostObject.objectPtr, target, up, use_model_front)

  /** Node3D.look_at_from_position */
  final def lookAtFromPosition(position: gdext.builtin.Vector3, target: gdext.builtin.Vector3, up: gdext.builtin.Vector3, use_model_front: Boolean): Unit =
    Ptrcall.callVoid4(MethodBind.get("Node3D", "look_at_from_position", 2086826090L), hostObject.objectPtr, position, target, up, use_model_front)

  /** Node3D.to_local */
  final def toLocal(global_point: gdext.builtin.Vector3): gdext.builtin.Vector3 =
    Ptrcall.call1[gdext.builtin.Vector3, gdext.builtin.Vector3](MethodBind.get("Node3D", "to_local", 192990374L), hostObject.objectPtr, global_point)

  /** Node3D.to_global */
  final def toGlobal(local_point: gdext.builtin.Vector3): gdext.builtin.Vector3 =
    Ptrcall.call1[gdext.builtin.Vector3, gdext.builtin.Vector3](MethodBind.get("Node3D", "to_global", 192990374L), hostObject.objectPtr, local_point)

}
