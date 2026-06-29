package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `CollisionObject3D`, extends `Node3D`. */
abstract class CollisionObject3D extends Node3D {
  override def godotClassName: String = "CollisionObject3D"

  /** CollisionObject3D.set_collision_layer */
  final def setCollisionLayer(layer: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CollisionObject3D", "set_collision_layer", 1286410249L), hostObject.objectPtr, layer)

  /** CollisionObject3D.get_collision_layer */
  final def getCollisionLayer(): Long =
    Ptrcall.call0[Long](MethodBind.get("CollisionObject3D", "get_collision_layer", 3905245786L), hostObject.objectPtr)

  /** CollisionObject3D.set_collision_mask */
  final def setCollisionMask(mask: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CollisionObject3D", "set_collision_mask", 1286410249L), hostObject.objectPtr, mask)

  /** CollisionObject3D.get_collision_mask */
  final def getCollisionMask(): Long =
    Ptrcall.call0[Long](MethodBind.get("CollisionObject3D", "get_collision_mask", 3905245786L), hostObject.objectPtr)

  /** CollisionObject3D.set_collision_layer_value */
  final def setCollisionLayerValue(layer_number: Long, value: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("CollisionObject3D", "set_collision_layer_value", 300928843L), hostObject.objectPtr, layer_number, value)

  /** CollisionObject3D.get_collision_layer_value */
  final def getCollisionLayerValue(layer_number: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("CollisionObject3D", "get_collision_layer_value", 1116898809L), hostObject.objectPtr, layer_number)

  /** CollisionObject3D.set_collision_mask_value */
  final def setCollisionMaskValue(layer_number: Long, value: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("CollisionObject3D", "set_collision_mask_value", 300928843L), hostObject.objectPtr, layer_number, value)

  /** CollisionObject3D.get_collision_mask_value */
  final def getCollisionMaskValue(layer_number: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("CollisionObject3D", "get_collision_mask_value", 1116898809L), hostObject.objectPtr, layer_number)

  /** CollisionObject3D.set_collision_priority */
  final def setCollisionPriority(priority: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CollisionObject3D", "set_collision_priority", 373806689L), hostObject.objectPtr, priority)

  /** CollisionObject3D.get_collision_priority */
  final def getCollisionPriority(): Double =
    Ptrcall.call0[Double](MethodBind.get("CollisionObject3D", "get_collision_priority", 1740695150L), hostObject.objectPtr)

  /** CollisionObject3D.set_disable_mode */
  final def setDisableMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CollisionObject3D", "set_disable_mode", 1623620376L), hostObject.objectPtr, mode)

  /** CollisionObject3D.get_disable_mode */
  final def getDisableMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("CollisionObject3D", "get_disable_mode", 410164780L), hostObject.objectPtr)

  /** CollisionObject3D.set_ray_pickable */
  final def setRayPickable(ray_pickable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CollisionObject3D", "set_ray_pickable", 2586408642L), hostObject.objectPtr, ray_pickable)

  /** CollisionObject3D.is_ray_pickable */
  final def isRayPickable(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CollisionObject3D", "is_ray_pickable", 36873697L), hostObject.objectPtr)

  /** CollisionObject3D.set_capture_input_on_drag */
  final def setCaptureInputOnDrag(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CollisionObject3D", "set_capture_input_on_drag", 2586408642L), hostObject.objectPtr, enable)

  /** CollisionObject3D.get_capture_input_on_drag */
  final def getCaptureInputOnDrag(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CollisionObject3D", "get_capture_input_on_drag", 36873697L), hostObject.objectPtr)

  /** CollisionObject3D.create_shape_owner */
  final def createShapeOwner(owner: Object): Long =
    Ptrcall.call1[GodotObject, Long](MethodBind.get("CollisionObject3D", "create_shape_owner", 3429307534L), hostObject.objectPtr, owner.hostObject)

  /** CollisionObject3D.remove_shape_owner */
  final def removeShapeOwner(owner_id: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CollisionObject3D", "remove_shape_owner", 1286410249L), hostObject.objectPtr, owner_id)

  /** CollisionObject3D.shape_owner_set_transform */
  final def shapeOwnerSetTransform(owner_id: Long, transform: gdext.builtin.Transform3D): Unit =
    Ptrcall.callVoid2(MethodBind.get("CollisionObject3D", "shape_owner_set_transform", 3616898986L), hostObject.objectPtr, owner_id, transform)

  /** CollisionObject3D.shape_owner_get_transform */
  final def shapeOwnerGetTransform(owner_id: Long): gdext.builtin.Transform3D =
    Ptrcall.call1[Long, gdext.builtin.Transform3D](MethodBind.get("CollisionObject3D", "shape_owner_get_transform", 1965739696L), hostObject.objectPtr, owner_id)

  /** CollisionObject3D.shape_owner_get_owner */
  final def shapeOwnerGetOwner(owner_id: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("CollisionObject3D", "shape_owner_get_owner", 3332903315L), hostObject.objectPtr, owner_id)

  /** CollisionObject3D.shape_owner_set_disabled */
  final def shapeOwnerSetDisabled(owner_id: Long, disabled: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("CollisionObject3D", "shape_owner_set_disabled", 300928843L), hostObject.objectPtr, owner_id, disabled)

  /** CollisionObject3D.is_shape_owner_disabled */
  final def isShapeOwnerDisabled(owner_id: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("CollisionObject3D", "is_shape_owner_disabled", 1116898809L), hostObject.objectPtr, owner_id)

  /** CollisionObject3D.shape_owner_add_shape */
  final def shapeOwnerAddShape(owner_id: Long, shape: Shape3D): Unit =
    Ptrcall.callVoid2(MethodBind.get("CollisionObject3D", "shape_owner_add_shape", 2566676345L), hostObject.objectPtr, owner_id, shape.hostObject)

  /** CollisionObject3D.shape_owner_get_shape_count */
  final def shapeOwnerGetShapeCount(owner_id: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("CollisionObject3D", "shape_owner_get_shape_count", 923996154L), hostObject.objectPtr, owner_id)

  /** CollisionObject3D.shape_owner_get_shape */
  final def shapeOwnerGetShape(owner_id: Long, shape_id: Long): GodotObject =
    Ptrcall.call2[Long, Long, GodotObject](MethodBind.get("CollisionObject3D", "shape_owner_get_shape", 4015519174L), hostObject.objectPtr, owner_id, shape_id)

  /** CollisionObject3D.shape_owner_get_shape_index */
  final def shapeOwnerGetShapeIndex(owner_id: Long, shape_id: Long): Long =
    Ptrcall.call2[Long, Long, Long](MethodBind.get("CollisionObject3D", "shape_owner_get_shape_index", 3175239445L), hostObject.objectPtr, owner_id, shape_id)

  /** CollisionObject3D.shape_owner_remove_shape */
  final def shapeOwnerRemoveShape(owner_id: Long, shape_id: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("CollisionObject3D", "shape_owner_remove_shape", 3937882851L), hostObject.objectPtr, owner_id, shape_id)

  /** CollisionObject3D.shape_owner_clear_shapes */
  final def shapeOwnerClearShapes(owner_id: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CollisionObject3D", "shape_owner_clear_shapes", 1286410249L), hostObject.objectPtr, owner_id)

  /** CollisionObject3D.shape_find_owner */
  final def shapeFindOwner(shape_index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("CollisionObject3D", "shape_find_owner", 923996154L), hostObject.objectPtr, shape_index)

}
