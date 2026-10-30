package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Node3D`, extends `Node`. */
abstract class Node3D extends Node {
  override def godotClassName: String = "Node3D"

  /** Node3D.set_transform */
  final def setTransform(local: gdext.builtin.Transform3D): Unit = {
    if (gdext.classes.Node3D.mb_set_transform == null) gdext.classes.Node3D.mb_set_transform = MethodBind.get("Node3D", "set_transform", 2952846383L)
    Ptrcall.callVoid1(gdext.classes.Node3D.mb_set_transform, livePtr, local)
  }

  /** Node3D.get_transform */
  final def getTransform(): gdext.builtin.Transform3D = {
    if (gdext.classes.Node3D.mb_get_transform == null) gdext.classes.Node3D.mb_get_transform = MethodBind.get("Node3D", "get_transform", 3229777777L)
    Ptrcall.call0[gdext.builtin.Transform3D](gdext.classes.Node3D.mb_get_transform, livePtr)
  }

  /** Node3D.set_position */
  final def setPosition(position: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.Node3D.mb_set_position == null) gdext.classes.Node3D.mb_set_position = MethodBind.get("Node3D", "set_position", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.Node3D.mb_set_position, livePtr, position)
  }

  /** Node3D.get_position */
  final def getPosition(): gdext.builtin.Vector3 = {
    if (gdext.classes.Node3D.mb_get_position == null) gdext.classes.Node3D.mb_get_position = MethodBind.get("Node3D", "get_position", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.Node3D.mb_get_position, livePtr)
  }

  /** Node3D.set_rotation */
  final def setRotation(eulerRadians: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.Node3D.mb_set_rotation == null) gdext.classes.Node3D.mb_set_rotation = MethodBind.get("Node3D", "set_rotation", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.Node3D.mb_set_rotation, livePtr, eulerRadians)
  }

  /** Node3D.get_rotation */
  final def getRotation(): gdext.builtin.Vector3 = {
    if (gdext.classes.Node3D.mb_get_rotation == null) gdext.classes.Node3D.mb_get_rotation = MethodBind.get("Node3D", "get_rotation", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.Node3D.mb_get_rotation, livePtr)
  }

  /** Node3D.set_rotation_degrees */
  final def setRotationDegrees(eulerDegrees: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.Node3D.mb_set_rotation_degrees == null) gdext.classes.Node3D.mb_set_rotation_degrees = MethodBind.get("Node3D", "set_rotation_degrees", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.Node3D.mb_set_rotation_degrees, livePtr, eulerDegrees)
  }

  /** Node3D.get_rotation_degrees */
  final def getRotationDegrees(): gdext.builtin.Vector3 = {
    if (gdext.classes.Node3D.mb_get_rotation_degrees == null) gdext.classes.Node3D.mb_get_rotation_degrees = MethodBind.get("Node3D", "get_rotation_degrees", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.Node3D.mb_get_rotation_degrees, livePtr)
  }

  /** Node3D.set_rotation_order */
  final def setRotationOrder(order: gdext.classes.EulerOrder): Unit = {
    if (gdext.classes.Node3D.mb_set_rotation_order == null) gdext.classes.Node3D.mb_set_rotation_order = MethodBind.get("Node3D", "set_rotation_order", 1820889989L)
    Ptrcall.callVoid1(gdext.classes.Node3D.mb_set_rotation_order, livePtr, order)
  }

  /** Node3D.get_rotation_order */
  final def getRotationOrder(): gdext.classes.EulerOrder = {
    if (gdext.classes.Node3D.mb_get_rotation_order == null) gdext.classes.Node3D.mb_get_rotation_order = MethodBind.get("Node3D", "get_rotation_order", 916939469L)
    gdext.classes.EulerOrder(Ptrcall.call0[Long](gdext.classes.Node3D.mb_get_rotation_order, livePtr))
  }

  /** Node3D.set_rotation_edit_mode */
  final def setRotationEditMode(editMode: gdext.classes.Node3D.RotationEditMode): Unit = {
    if (gdext.classes.Node3D.mb_set_rotation_edit_mode == null) gdext.classes.Node3D.mb_set_rotation_edit_mode = MethodBind.get("Node3D", "set_rotation_edit_mode", 141483330L)
    Ptrcall.callVoid1(gdext.classes.Node3D.mb_set_rotation_edit_mode, livePtr, editMode)
  }

  /** Node3D.get_rotation_edit_mode */
  final def getRotationEditMode(): gdext.classes.Node3D.RotationEditMode = {
    if (gdext.classes.Node3D.mb_get_rotation_edit_mode == null) gdext.classes.Node3D.mb_get_rotation_edit_mode = MethodBind.get("Node3D", "get_rotation_edit_mode", 1572188370L)
    gdext.classes.Node3D.RotationEditMode(Ptrcall.call0[Long](gdext.classes.Node3D.mb_get_rotation_edit_mode, livePtr))
  }

  /** Node3D.set_scale */
  final def setScale(scale: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.Node3D.mb_set_scale == null) gdext.classes.Node3D.mb_set_scale = MethodBind.get("Node3D", "set_scale", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.Node3D.mb_set_scale, livePtr, scale)
  }

  /** Node3D.get_scale */
  final def getScale(): gdext.builtin.Vector3 = {
    if (gdext.classes.Node3D.mb_get_scale == null) gdext.classes.Node3D.mb_get_scale = MethodBind.get("Node3D", "get_scale", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.Node3D.mb_get_scale, livePtr)
  }

  /** Node3D.set_quaternion */
  final def setQuaternion(quaternion: gdext.builtin.Quaternion): Unit = {
    if (gdext.classes.Node3D.mb_set_quaternion == null) gdext.classes.Node3D.mb_set_quaternion = MethodBind.get("Node3D", "set_quaternion", 1727505552L)
    Ptrcall.callVoid1(gdext.classes.Node3D.mb_set_quaternion, livePtr, quaternion)
  }

  /** Node3D.get_quaternion */
  final def getQuaternion(): gdext.builtin.Quaternion = {
    if (gdext.classes.Node3D.mb_get_quaternion == null) gdext.classes.Node3D.mb_get_quaternion = MethodBind.get("Node3D", "get_quaternion", 1222331677L)
    Ptrcall.call0[gdext.builtin.Quaternion](gdext.classes.Node3D.mb_get_quaternion, livePtr)
  }

  /** Node3D.set_basis */
  final def setBasis(basis: gdext.builtin.Basis): Unit = {
    if (gdext.classes.Node3D.mb_set_basis == null) gdext.classes.Node3D.mb_set_basis = MethodBind.get("Node3D", "set_basis", 1055510324L)
    Ptrcall.callVoid1(gdext.classes.Node3D.mb_set_basis, livePtr, basis)
  }

  /** Node3D.get_basis */
  final def getBasis(): gdext.builtin.Basis = {
    if (gdext.classes.Node3D.mb_get_basis == null) gdext.classes.Node3D.mb_get_basis = MethodBind.get("Node3D", "get_basis", 2716978435L)
    Ptrcall.call0[gdext.builtin.Basis](gdext.classes.Node3D.mb_get_basis, livePtr)
  }

  /** Node3D.set_global_transform */
  final def setGlobalTransform(global: gdext.builtin.Transform3D): Unit = {
    if (gdext.classes.Node3D.mb_set_global_transform == null) gdext.classes.Node3D.mb_set_global_transform = MethodBind.get("Node3D", "set_global_transform", 2952846383L)
    Ptrcall.callVoid1(gdext.classes.Node3D.mb_set_global_transform, livePtr, global)
  }

  /** Node3D.get_global_transform */
  final def getGlobalTransform(): gdext.builtin.Transform3D = {
    if (gdext.classes.Node3D.mb_get_global_transform == null) gdext.classes.Node3D.mb_get_global_transform = MethodBind.get("Node3D", "get_global_transform", 3229777777L)
    Ptrcall.call0[gdext.builtin.Transform3D](gdext.classes.Node3D.mb_get_global_transform, livePtr)
  }

  /** Node3D.get_global_transform_interpolated */
  final def getGlobalTransformInterpolated(): gdext.builtin.Transform3D = {
    if (gdext.classes.Node3D.mb_get_global_transform_interpolated == null) gdext.classes.Node3D.mb_get_global_transform_interpolated = MethodBind.get("Node3D", "get_global_transform_interpolated", 4183770049L)
    Ptrcall.call0[gdext.builtin.Transform3D](gdext.classes.Node3D.mb_get_global_transform_interpolated, livePtr)
  }

  /** Node3D.set_global_position */
  final def setGlobalPosition(position: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.Node3D.mb_set_global_position == null) gdext.classes.Node3D.mb_set_global_position = MethodBind.get("Node3D", "set_global_position", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.Node3D.mb_set_global_position, livePtr, position)
  }

  /** Node3D.get_global_position */
  final def getGlobalPosition(): gdext.builtin.Vector3 = {
    if (gdext.classes.Node3D.mb_get_global_position == null) gdext.classes.Node3D.mb_get_global_position = MethodBind.get("Node3D", "get_global_position", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.Node3D.mb_get_global_position, livePtr)
  }

  /** Node3D.set_global_basis */
  final def setGlobalBasis(basis: gdext.builtin.Basis): Unit = {
    if (gdext.classes.Node3D.mb_set_global_basis == null) gdext.classes.Node3D.mb_set_global_basis = MethodBind.get("Node3D", "set_global_basis", 1055510324L)
    Ptrcall.callVoid1(gdext.classes.Node3D.mb_set_global_basis, livePtr, basis)
  }

  /** Node3D.get_global_basis */
  final def getGlobalBasis(): gdext.builtin.Basis = {
    if (gdext.classes.Node3D.mb_get_global_basis == null) gdext.classes.Node3D.mb_get_global_basis = MethodBind.get("Node3D", "get_global_basis", 2716978435L)
    Ptrcall.call0[gdext.builtin.Basis](gdext.classes.Node3D.mb_get_global_basis, livePtr)
  }

  /** Node3D.set_global_rotation */
  final def setGlobalRotation(eulerRadians: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.Node3D.mb_set_global_rotation == null) gdext.classes.Node3D.mb_set_global_rotation = MethodBind.get("Node3D", "set_global_rotation", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.Node3D.mb_set_global_rotation, livePtr, eulerRadians)
  }

  /** Node3D.get_global_rotation */
  final def getGlobalRotation(): gdext.builtin.Vector3 = {
    if (gdext.classes.Node3D.mb_get_global_rotation == null) gdext.classes.Node3D.mb_get_global_rotation = MethodBind.get("Node3D", "get_global_rotation", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.Node3D.mb_get_global_rotation, livePtr)
  }

  /** Node3D.set_global_rotation_degrees */
  final def setGlobalRotationDegrees(eulerDegrees: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.Node3D.mb_set_global_rotation_degrees == null) gdext.classes.Node3D.mb_set_global_rotation_degrees = MethodBind.get("Node3D", "set_global_rotation_degrees", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.Node3D.mb_set_global_rotation_degrees, livePtr, eulerDegrees)
  }

  /** Node3D.get_global_rotation_degrees */
  final def getGlobalRotationDegrees(): gdext.builtin.Vector3 = {
    if (gdext.classes.Node3D.mb_get_global_rotation_degrees == null) gdext.classes.Node3D.mb_get_global_rotation_degrees = MethodBind.get("Node3D", "get_global_rotation_degrees", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.Node3D.mb_get_global_rotation_degrees, livePtr)
  }

  /** Node3D.get_parent_node_3d */
  final def getParentNode3d(): Node3D = {
    if (gdext.classes.Node3D.mb_get_parent_node_3d == null) gdext.classes.Node3D.mb_get_parent_node_3d = MethodBind.get("Node3D", "get_parent_node_3d", 151077316L)
    Wrappers.borrowed[Node3D](Ptrcall.call0[Long](gdext.classes.Node3D.mb_get_parent_node_3d, livePtr))
  }

  /** Node3D.set_ignore_transform_notification */
  final def setIgnoreTransformNotification(enabled: Boolean): Unit = {
    if (gdext.classes.Node3D.mb_set_ignore_transform_notification == null) gdext.classes.Node3D.mb_set_ignore_transform_notification = MethodBind.get("Node3D", "set_ignore_transform_notification", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Node3D.mb_set_ignore_transform_notification, livePtr, enabled)
  }

  /** Node3D.set_as_top_level */
  final def setAsTopLevel(enable: Boolean): Unit = {
    if (gdext.classes.Node3D.mb_set_as_top_level == null) gdext.classes.Node3D.mb_set_as_top_level = MethodBind.get("Node3D", "set_as_top_level", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Node3D.mb_set_as_top_level, livePtr, enable)
  }

  /** Node3D.is_set_as_top_level */
  final def isSetAsTopLevel(): Boolean = {
    if (gdext.classes.Node3D.mb_is_set_as_top_level == null) gdext.classes.Node3D.mb_is_set_as_top_level = MethodBind.get("Node3D", "is_set_as_top_level", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Node3D.mb_is_set_as_top_level, livePtr)
  }

  /** Node3D.set_disable_scale */
  final def setDisableScale(disable: Boolean): Unit = {
    if (gdext.classes.Node3D.mb_set_disable_scale == null) gdext.classes.Node3D.mb_set_disable_scale = MethodBind.get("Node3D", "set_disable_scale", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Node3D.mb_set_disable_scale, livePtr, disable)
  }

  /** Node3D.is_scale_disabled */
  final def isScaleDisabled(): Boolean = {
    if (gdext.classes.Node3D.mb_is_scale_disabled == null) gdext.classes.Node3D.mb_is_scale_disabled = MethodBind.get("Node3D", "is_scale_disabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Node3D.mb_is_scale_disabled, livePtr)
  }

  /** Node3D.get_world_3d. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getWorld3d(): World3D = {
    if (gdext.classes.Node3D.mb_get_world_3d == null) gdext.classes.Node3D.mb_get_world_3d = MethodBind.get("Node3D", "get_world_3d", 317588385L)
    Wrappers.owned[World3D](Ptrcall.call0[Long](gdext.classes.Node3D.mb_get_world_3d, livePtr))
  }

  /** Node3D.force_update_transform */
  final def forceUpdateTransform(): Unit = {
    if (gdext.classes.Node3D.mb_force_update_transform == null) gdext.classes.Node3D.mb_force_update_transform = MethodBind.get("Node3D", "force_update_transform", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Node3D.mb_force_update_transform, livePtr)
  }

  /** Node3D.update_gizmos */
  final def updateGizmos(): Unit = {
    if (gdext.classes.Node3D.mb_update_gizmos == null) gdext.classes.Node3D.mb_update_gizmos = MethodBind.get("Node3D", "update_gizmos", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Node3D.mb_update_gizmos, livePtr)
  }

  /** Node3D.add_gizmo */
  final def addGizmo(gizmo: Node3DGizmo): Unit = {
    if (gdext.classes.Node3D.mb_add_gizmo == null) gdext.classes.Node3D.mb_add_gizmo = MethodBind.get("Node3D", "add_gizmo", 1544533845L)
    Ptrcall.callVoid1(gdext.classes.Node3D.mb_add_gizmo, livePtr, Wrappers.handle(gizmo))
  }

  /** Node3D.clear_gizmos */
  final def clearGizmos(): Unit = {
    if (gdext.classes.Node3D.mb_clear_gizmos == null) gdext.classes.Node3D.mb_clear_gizmos = MethodBind.get("Node3D", "clear_gizmos", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Node3D.mb_clear_gizmos, livePtr)
  }

  /** Node3D.set_subgizmo_selection */
  final def setSubgizmoSelection(gizmo: Node3DGizmo, id: Long, transform: gdext.builtin.Transform3D): Unit = {
    if (gdext.classes.Node3D.mb_set_subgizmo_selection == null) gdext.classes.Node3D.mb_set_subgizmo_selection = MethodBind.get("Node3D", "set_subgizmo_selection", 3317607635L)
    Ptrcall.callVoid3(gdext.classes.Node3D.mb_set_subgizmo_selection, livePtr, Wrappers.handle(gizmo), id, transform)
  }

  /** Node3D.clear_subgizmo_selection */
  final def clearSubgizmoSelection(): Unit = {
    if (gdext.classes.Node3D.mb_clear_subgizmo_selection == null) gdext.classes.Node3D.mb_clear_subgizmo_selection = MethodBind.get("Node3D", "clear_subgizmo_selection", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Node3D.mb_clear_subgizmo_selection, livePtr)
  }

  /** Node3D.set_visible */
  final def setVisible(visible: Boolean): Unit = {
    if (gdext.classes.Node3D.mb_set_visible == null) gdext.classes.Node3D.mb_set_visible = MethodBind.get("Node3D", "set_visible", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Node3D.mb_set_visible, livePtr, visible)
  }

  /** Node3D.is_visible */
  final def isVisible(): Boolean = {
    if (gdext.classes.Node3D.mb_is_visible == null) gdext.classes.Node3D.mb_is_visible = MethodBind.get("Node3D", "is_visible", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Node3D.mb_is_visible, livePtr)
  }

  /** Node3D.is_visible_in_tree */
  final def isVisibleInTree(): Boolean = {
    if (gdext.classes.Node3D.mb_is_visible_in_tree == null) gdext.classes.Node3D.mb_is_visible_in_tree = MethodBind.get("Node3D", "is_visible_in_tree", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Node3D.mb_is_visible_in_tree, livePtr)
  }

  /** Node3D.show */
  final def show(): Unit = {
    if (gdext.classes.Node3D.mb_show == null) gdext.classes.Node3D.mb_show = MethodBind.get("Node3D", "show", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Node3D.mb_show, livePtr)
  }

  /** Node3D.hide */
  final def hide(): Unit = {
    if (gdext.classes.Node3D.mb_hide == null) gdext.classes.Node3D.mb_hide = MethodBind.get("Node3D", "hide", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Node3D.mb_hide, livePtr)
  }

  /** Node3D.set_notify_local_transform */
  final def setNotifyLocalTransform(enable: Boolean): Unit = {
    if (gdext.classes.Node3D.mb_set_notify_local_transform == null) gdext.classes.Node3D.mb_set_notify_local_transform = MethodBind.get("Node3D", "set_notify_local_transform", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Node3D.mb_set_notify_local_transform, livePtr, enable)
  }

  /** Node3D.is_local_transform_notification_enabled */
  final def isLocalTransformNotificationEnabled(): Boolean = {
    if (gdext.classes.Node3D.mb_is_local_transform_notification_enabled == null) gdext.classes.Node3D.mb_is_local_transform_notification_enabled = MethodBind.get("Node3D", "is_local_transform_notification_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Node3D.mb_is_local_transform_notification_enabled, livePtr)
  }

  /** Node3D.set_notify_transform */
  final def setNotifyTransform(enable: Boolean): Unit = {
    if (gdext.classes.Node3D.mb_set_notify_transform == null) gdext.classes.Node3D.mb_set_notify_transform = MethodBind.get("Node3D", "set_notify_transform", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Node3D.mb_set_notify_transform, livePtr, enable)
  }

  /** Node3D.is_transform_notification_enabled */
  final def isTransformNotificationEnabled(): Boolean = {
    if (gdext.classes.Node3D.mb_is_transform_notification_enabled == null) gdext.classes.Node3D.mb_is_transform_notification_enabled = MethodBind.get("Node3D", "is_transform_notification_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Node3D.mb_is_transform_notification_enabled, livePtr)
  }

  /** Node3D.rotate */
  final def rotate(axis: gdext.builtin.Vector3, angle: Double): Unit = {
    if (gdext.classes.Node3D.mb_rotate == null) gdext.classes.Node3D.mb_rotate = MethodBind.get("Node3D", "rotate", 3436291937L)
    Ptrcall.callVoid2(gdext.classes.Node3D.mb_rotate, livePtr, axis, angle)
  }

  /** Node3D.global_rotate */
  final def globalRotate(axis: gdext.builtin.Vector3, angle: Double): Unit = {
    if (gdext.classes.Node3D.mb_global_rotate == null) gdext.classes.Node3D.mb_global_rotate = MethodBind.get("Node3D", "global_rotate", 3436291937L)
    Ptrcall.callVoid2(gdext.classes.Node3D.mb_global_rotate, livePtr, axis, angle)
  }

  /** Node3D.global_scale */
  final def globalScale(scale: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.Node3D.mb_global_scale == null) gdext.classes.Node3D.mb_global_scale = MethodBind.get("Node3D", "global_scale", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.Node3D.mb_global_scale, livePtr, scale)
  }

  /** Node3D.global_translate */
  final def globalTranslate(offset: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.Node3D.mb_global_translate == null) gdext.classes.Node3D.mb_global_translate = MethodBind.get("Node3D", "global_translate", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.Node3D.mb_global_translate, livePtr, offset)
  }

  /** Node3D.rotate_object_local */
  final def rotateObjectLocal(axis: gdext.builtin.Vector3, angle: Double): Unit = {
    if (gdext.classes.Node3D.mb_rotate_object_local == null) gdext.classes.Node3D.mb_rotate_object_local = MethodBind.get("Node3D", "rotate_object_local", 3436291937L)
    Ptrcall.callVoid2(gdext.classes.Node3D.mb_rotate_object_local, livePtr, axis, angle)
  }

  /** Node3D.scale_object_local */
  final def scaleObjectLocal(scale: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.Node3D.mb_scale_object_local == null) gdext.classes.Node3D.mb_scale_object_local = MethodBind.get("Node3D", "scale_object_local", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.Node3D.mb_scale_object_local, livePtr, scale)
  }

  /** Node3D.translate_object_local */
  final def translateObjectLocal(offset: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.Node3D.mb_translate_object_local == null) gdext.classes.Node3D.mb_translate_object_local = MethodBind.get("Node3D", "translate_object_local", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.Node3D.mb_translate_object_local, livePtr, offset)
  }

  /** Node3D.rotate_x */
  final def rotateX(angle: Double): Unit = {
    if (gdext.classes.Node3D.mb_rotate_x == null) gdext.classes.Node3D.mb_rotate_x = MethodBind.get("Node3D", "rotate_x", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Node3D.mb_rotate_x, livePtr, angle)
  }

  /** Node3D.rotate_y */
  final def rotateY(angle: Double): Unit = {
    if (gdext.classes.Node3D.mb_rotate_y == null) gdext.classes.Node3D.mb_rotate_y = MethodBind.get("Node3D", "rotate_y", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Node3D.mb_rotate_y, livePtr, angle)
  }

  /** Node3D.rotate_z */
  final def rotateZ(angle: Double): Unit = {
    if (gdext.classes.Node3D.mb_rotate_z == null) gdext.classes.Node3D.mb_rotate_z = MethodBind.get("Node3D", "rotate_z", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Node3D.mb_rotate_z, livePtr, angle)
  }

  /** Node3D.translate */
  final def translate(offset: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.Node3D.mb_translate == null) gdext.classes.Node3D.mb_translate = MethodBind.get("Node3D", "translate", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.Node3D.mb_translate, livePtr, offset)
  }

  /** Node3D.orthonormalize */
  final def orthonormalize(): Unit = {
    if (gdext.classes.Node3D.mb_orthonormalize == null) gdext.classes.Node3D.mb_orthonormalize = MethodBind.get("Node3D", "orthonormalize", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Node3D.mb_orthonormalize, livePtr)
  }

  /** Node3D.set_identity */
  final def setIdentity(): Unit = {
    if (gdext.classes.Node3D.mb_set_identity == null) gdext.classes.Node3D.mb_set_identity = MethodBind.get("Node3D", "set_identity", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Node3D.mb_set_identity, livePtr)
  }

  /** Node3D.look_at */
  final def lookAt(target: gdext.builtin.Vector3, up: gdext.builtin.Vector3 = gdext.builtin.Vector3(0f, 1f, 0f), useModelFront: Boolean = false): Unit = {
    if (gdext.classes.Node3D.mb_look_at == null) gdext.classes.Node3D.mb_look_at = MethodBind.get("Node3D", "look_at", 2882425029L)
    Ptrcall.callVoid3(gdext.classes.Node3D.mb_look_at, livePtr, target, up, useModelFront)
  }

  /** Node3D.look_at_from_position */
  final def lookAtFromPosition(position: gdext.builtin.Vector3, target: gdext.builtin.Vector3, up: gdext.builtin.Vector3 = gdext.builtin.Vector3(0f, 1f, 0f), useModelFront: Boolean = false): Unit = {
    if (gdext.classes.Node3D.mb_look_at_from_position == null) gdext.classes.Node3D.mb_look_at_from_position = MethodBind.get("Node3D", "look_at_from_position", 2086826090L)
    Ptrcall.callVoid4(gdext.classes.Node3D.mb_look_at_from_position, livePtr, position, target, up, useModelFront)
  }

  /** Node3D.to_local */
  final def toLocal(globalPoint: gdext.builtin.Vector3): gdext.builtin.Vector3 = {
    if (gdext.classes.Node3D.mb_to_local == null) gdext.classes.Node3D.mb_to_local = MethodBind.get("Node3D", "to_local", 192990374L)
    Ptrcall.call1[gdext.builtin.Vector3, gdext.builtin.Vector3](gdext.classes.Node3D.mb_to_local, livePtr, globalPoint)
  }

  /** Node3D.to_global */
  final def toGlobal(localPoint: gdext.builtin.Vector3): gdext.builtin.Vector3 = {
    if (gdext.classes.Node3D.mb_to_global == null) gdext.classes.Node3D.mb_to_global = MethodBind.get("Node3D", "to_global", 192990374L)
    Ptrcall.call1[gdext.builtin.Vector3, gdext.builtin.Vector3](gdext.classes.Node3D.mb_to_global, livePtr, localPoint)
  }

}

object Node3D {
  private[classes] var mb_set_transform: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_transform: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_rotation: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_rotation: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_rotation_degrees: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_rotation_degrees: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_rotation_order: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_rotation_order: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_rotation_edit_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_rotation_edit_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_quaternion: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_quaternion: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_basis: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_basis: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_global_transform: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_global_transform: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_global_transform_interpolated: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_global_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_global_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_global_basis: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_global_basis: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_global_rotation: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_global_rotation: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_global_rotation_degrees: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_global_rotation_degrees: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_parent_node_3d: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_ignore_transform_notification: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_as_top_level: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_set_as_top_level: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_disable_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_scale_disabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_world_3d: GDExtensionMethodBindPtr = null
  private[classes] var mb_force_update_transform: GDExtensionMethodBindPtr = null
  private[classes] var mb_update_gizmos: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_gizmo: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_gizmos: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_subgizmo_selection: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_subgizmo_selection: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_visible: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_visible: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_visible_in_tree: GDExtensionMethodBindPtr = null
  private[classes] var mb_show: GDExtensionMethodBindPtr = null
  private[classes] var mb_hide: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_notify_local_transform: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_local_transform_notification_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_notify_transform: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_transform_notification_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_rotate: GDExtensionMethodBindPtr = null
  private[classes] var mb_global_rotate: GDExtensionMethodBindPtr = null
  private[classes] var mb_global_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_global_translate: GDExtensionMethodBindPtr = null
  private[classes] var mb_rotate_object_local: GDExtensionMethodBindPtr = null
  private[classes] var mb_scale_object_local: GDExtensionMethodBindPtr = null
  private[classes] var mb_translate_object_local: GDExtensionMethodBindPtr = null
  private[classes] var mb_rotate_x: GDExtensionMethodBindPtr = null
  private[classes] var mb_rotate_y: GDExtensionMethodBindPtr = null
  private[classes] var mb_rotate_z: GDExtensionMethodBindPtr = null
  private[classes] var mb_translate: GDExtensionMethodBindPtr = null
  private[classes] var mb_orthonormalize: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_identity: GDExtensionMethodBindPtr = null
  private[classes] var mb_look_at: GDExtensionMethodBindPtr = null
  private[classes] var mb_look_at_from_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_to_local: GDExtensionMethodBindPtr = null
  private[classes] var mb_to_global: GDExtensionMethodBindPtr = null

  /** Godot enum `Node3D.RotationEditMode`. */
  opaque type RotationEditMode <: Long = Long

  object RotationEditMode {
    final val Euler: RotationEditMode = 0L.asInstanceOf[RotationEditMode]
    final val Quaternion: RotationEditMode = 1L.asInstanceOf[RotationEditMode]
    final val Basis: RotationEditMode = 2L.asInstanceOf[RotationEditMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): RotationEditMode = value.asInstanceOf[RotationEditMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[RotationEditMode] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[RotationEditMode]]

    extension (self: RotationEditMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Euler"
        case 1L => "Quaternion"
        case 2L => "Basis"
        case other => other.toString
      }
  }
}
