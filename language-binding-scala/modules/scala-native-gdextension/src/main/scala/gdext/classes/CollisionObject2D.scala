package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `CollisionObject2D`, extends `Node2D`. */
abstract class CollisionObject2D extends Node2D {

  /** CollisionObject2D.set_collision_layer */
  final def setCollisionLayer(layer: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CollisionObject2D", "set_collision_layer", 1286410249L), hostObject.objectPtr, layer)

  /** CollisionObject2D.get_collision_layer */
  final def getCollisionLayer(): Long =
    Ptrcall.call0[Long](MethodBind.get("CollisionObject2D", "get_collision_layer", 3905245786L), hostObject.objectPtr)

  /** CollisionObject2D.set_collision_mask */
  final def setCollisionMask(mask: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CollisionObject2D", "set_collision_mask", 1286410249L), hostObject.objectPtr, mask)

  /** CollisionObject2D.get_collision_mask */
  final def getCollisionMask(): Long =
    Ptrcall.call0[Long](MethodBind.get("CollisionObject2D", "get_collision_mask", 3905245786L), hostObject.objectPtr)

  /** CollisionObject2D.set_collision_layer_value */
  final def setCollisionLayerValue(layer_number: Long, value: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("CollisionObject2D", "set_collision_layer_value", 300928843L), hostObject.objectPtr, layer_number, value)

  /** CollisionObject2D.get_collision_layer_value */
  final def getCollisionLayerValue(layer_number: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("CollisionObject2D", "get_collision_layer_value", 1116898809L), hostObject.objectPtr, layer_number)

  /** CollisionObject2D.set_collision_mask_value */
  final def setCollisionMaskValue(layer_number: Long, value: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("CollisionObject2D", "set_collision_mask_value", 300928843L), hostObject.objectPtr, layer_number, value)

  /** CollisionObject2D.get_collision_mask_value */
  final def getCollisionMaskValue(layer_number: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("CollisionObject2D", "get_collision_mask_value", 1116898809L), hostObject.objectPtr, layer_number)

  /** CollisionObject2D.set_collision_priority */
  final def setCollisionPriority(priority: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CollisionObject2D", "set_collision_priority", 373806689L), hostObject.objectPtr, priority)

  /** CollisionObject2D.get_collision_priority */
  final def getCollisionPriority(): Double =
    Ptrcall.call0[Double](MethodBind.get("CollisionObject2D", "get_collision_priority", 1740695150L), hostObject.objectPtr)

  /** CollisionObject2D.set_disable_mode */
  final def setDisableMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CollisionObject2D", "set_disable_mode", 1919204045L), hostObject.objectPtr, mode)

  /** CollisionObject2D.get_disable_mode */
  final def getDisableMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("CollisionObject2D", "get_disable_mode", 3172846349L), hostObject.objectPtr)

  /** CollisionObject2D.set_pickable */
  final def setPickable(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CollisionObject2D", "set_pickable", 2586408642L), hostObject.objectPtr, enabled)

  /** CollisionObject2D.is_pickable */
  final def isPickable(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CollisionObject2D", "is_pickable", 36873697L), hostObject.objectPtr)

  /** CollisionObject2D.create_shape_owner */
  final def createShapeOwner(owner: Object): Long =
    Ptrcall.call1[GodotObject, Long](MethodBind.get("CollisionObject2D", "create_shape_owner", 3429307534L), hostObject.objectPtr, owner.hostObject)

  /** CollisionObject2D.remove_shape_owner */
  final def removeShapeOwner(owner_id: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CollisionObject2D", "remove_shape_owner", 1286410249L), hostObject.objectPtr, owner_id)

  /** CollisionObject2D.shape_owner_set_transform */
  final def shapeOwnerSetTransform(owner_id: Long, transform: gdext.builtin.Transform2D): Unit =
    Ptrcall.callVoid2(MethodBind.get("CollisionObject2D", "shape_owner_set_transform", 30160968L), hostObject.objectPtr, owner_id, transform)

  /** CollisionObject2D.shape_owner_get_transform */
  final def shapeOwnerGetTransform(owner_id: Long): gdext.builtin.Transform2D =
    Ptrcall.call1[Long, gdext.builtin.Transform2D](MethodBind.get("CollisionObject2D", "shape_owner_get_transform", 3836996910L), hostObject.objectPtr, owner_id)

  /** CollisionObject2D.shape_owner_get_owner */
  final def shapeOwnerGetOwner(owner_id: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("CollisionObject2D", "shape_owner_get_owner", 3332903315L), hostObject.objectPtr, owner_id)

  /** CollisionObject2D.shape_owner_set_disabled */
  final def shapeOwnerSetDisabled(owner_id: Long, disabled: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("CollisionObject2D", "shape_owner_set_disabled", 300928843L), hostObject.objectPtr, owner_id, disabled)

  /** CollisionObject2D.is_shape_owner_disabled */
  final def isShapeOwnerDisabled(owner_id: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("CollisionObject2D", "is_shape_owner_disabled", 1116898809L), hostObject.objectPtr, owner_id)

  /** CollisionObject2D.shape_owner_set_one_way_collision */
  final def shapeOwnerSetOneWayCollision(owner_id: Long, enable: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("CollisionObject2D", "shape_owner_set_one_way_collision", 300928843L), hostObject.objectPtr, owner_id, enable)

  /** CollisionObject2D.is_shape_owner_one_way_collision_enabled */
  final def isShapeOwnerOneWayCollisionEnabled(owner_id: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("CollisionObject2D", "is_shape_owner_one_way_collision_enabled", 1116898809L), hostObject.objectPtr, owner_id)

  /** CollisionObject2D.shape_owner_set_one_way_collision_margin */
  final def shapeOwnerSetOneWayCollisionMargin(owner_id: Long, margin: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("CollisionObject2D", "shape_owner_set_one_way_collision_margin", 1602489585L), hostObject.objectPtr, owner_id, margin)

  /** CollisionObject2D.get_shape_owner_one_way_collision_margin */
  final def getShapeOwnerOneWayCollisionMargin(owner_id: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("CollisionObject2D", "get_shape_owner_one_way_collision_margin", 2339986948L), hostObject.objectPtr, owner_id)

  /** CollisionObject2D.shape_owner_add_shape */
  final def shapeOwnerAddShape(owner_id: Long, shape: Shape2D): Unit =
    Ptrcall.callVoid2(MethodBind.get("CollisionObject2D", "shape_owner_add_shape", 2077425081L), hostObject.objectPtr, owner_id, shape.hostObject)

  /** CollisionObject2D.shape_owner_get_shape_count */
  final def shapeOwnerGetShapeCount(owner_id: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("CollisionObject2D", "shape_owner_get_shape_count", 923996154L), hostObject.objectPtr, owner_id)

  /** CollisionObject2D.shape_owner_get_shape */
  final def shapeOwnerGetShape(owner_id: Long, shape_id: Long): GodotObject =
    Ptrcall.call2[Long, Long, GodotObject](MethodBind.get("CollisionObject2D", "shape_owner_get_shape", 3106725749L), hostObject.objectPtr, owner_id, shape_id)

  /** CollisionObject2D.shape_owner_get_shape_index */
  final def shapeOwnerGetShapeIndex(owner_id: Long, shape_id: Long): Long =
    Ptrcall.call2[Long, Long, Long](MethodBind.get("CollisionObject2D", "shape_owner_get_shape_index", 3175239445L), hostObject.objectPtr, owner_id, shape_id)

  /** CollisionObject2D.shape_owner_remove_shape */
  final def shapeOwnerRemoveShape(owner_id: Long, shape_id: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("CollisionObject2D", "shape_owner_remove_shape", 3937882851L), hostObject.objectPtr, owner_id, shape_id)

  /** CollisionObject2D.shape_owner_clear_shapes */
  final def shapeOwnerClearShapes(owner_id: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CollisionObject2D", "shape_owner_clear_shapes", 1286410249L), hostObject.objectPtr, owner_id)

  /** CollisionObject2D.shape_find_owner */
  final def shapeFindOwner(shape_index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("CollisionObject2D", "shape_find_owner", 923996154L), hostObject.objectPtr, shape_index)

}

object CollisionObject2D {
  /** Class metadata for Gd[CollisionObject2D] lifetime management and casting. */
  given GodotClass[CollisionObject2D] with {
    def className = "CollisionObject2D"
    def isRefCounted = false
    def wrap(o: GodotObject): CollisionObject2D = new CollisionObject2D {}.withHost(o.objectPtr)
    def unwrap(t: CollisionObject2D): GodotObject = t.hostObject
  }
}
