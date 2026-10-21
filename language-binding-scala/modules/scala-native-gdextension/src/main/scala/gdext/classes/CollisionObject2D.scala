package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `CollisionObject2D`, extends `Node2D`. */
abstract class CollisionObject2D extends Node2D {
  override def godotClassName: String = "CollisionObject2D"

  /** CollisionObject2D.set_collision_layer */
  final def setCollisionLayer(layer: Long): Unit = {
    if (gdext.classes.CollisionObject2D.mb_set_collision_layer == null) gdext.classes.CollisionObject2D.mb_set_collision_layer = MethodBind.get("CollisionObject2D", "set_collision_layer", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.CollisionObject2D.mb_set_collision_layer, livePtr, layer)
  }

  /** CollisionObject2D.get_collision_layer */
  final def getCollisionLayer(): Long = {
    if (gdext.classes.CollisionObject2D.mb_get_collision_layer == null) gdext.classes.CollisionObject2D.mb_get_collision_layer = MethodBind.get("CollisionObject2D", "get_collision_layer", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.CollisionObject2D.mb_get_collision_layer, livePtr)
  }

  /** CollisionObject2D.set_collision_mask */
  final def setCollisionMask(mask: Long): Unit = {
    if (gdext.classes.CollisionObject2D.mb_set_collision_mask == null) gdext.classes.CollisionObject2D.mb_set_collision_mask = MethodBind.get("CollisionObject2D", "set_collision_mask", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.CollisionObject2D.mb_set_collision_mask, livePtr, mask)
  }

  /** CollisionObject2D.get_collision_mask */
  final def getCollisionMask(): Long = {
    if (gdext.classes.CollisionObject2D.mb_get_collision_mask == null) gdext.classes.CollisionObject2D.mb_get_collision_mask = MethodBind.get("CollisionObject2D", "get_collision_mask", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.CollisionObject2D.mb_get_collision_mask, livePtr)
  }

  /** CollisionObject2D.set_collision_layer_value */
  final def setCollisionLayerValue(layer_number: Long, value: Boolean): Unit = {
    if (gdext.classes.CollisionObject2D.mb_set_collision_layer_value == null) gdext.classes.CollisionObject2D.mb_set_collision_layer_value = MethodBind.get("CollisionObject2D", "set_collision_layer_value", 300928843L)
    Ptrcall.callVoid2(gdext.classes.CollisionObject2D.mb_set_collision_layer_value, livePtr, layer_number, value)
  }

  /** CollisionObject2D.get_collision_layer_value */
  final def getCollisionLayerValue(layer_number: Long): Boolean = {
    if (gdext.classes.CollisionObject2D.mb_get_collision_layer_value == null) gdext.classes.CollisionObject2D.mb_get_collision_layer_value = MethodBind.get("CollisionObject2D", "get_collision_layer_value", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.CollisionObject2D.mb_get_collision_layer_value, livePtr, layer_number)
  }

  /** CollisionObject2D.set_collision_mask_value */
  final def setCollisionMaskValue(layer_number: Long, value: Boolean): Unit = {
    if (gdext.classes.CollisionObject2D.mb_set_collision_mask_value == null) gdext.classes.CollisionObject2D.mb_set_collision_mask_value = MethodBind.get("CollisionObject2D", "set_collision_mask_value", 300928843L)
    Ptrcall.callVoid2(gdext.classes.CollisionObject2D.mb_set_collision_mask_value, livePtr, layer_number, value)
  }

  /** CollisionObject2D.get_collision_mask_value */
  final def getCollisionMaskValue(layer_number: Long): Boolean = {
    if (gdext.classes.CollisionObject2D.mb_get_collision_mask_value == null) gdext.classes.CollisionObject2D.mb_get_collision_mask_value = MethodBind.get("CollisionObject2D", "get_collision_mask_value", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.CollisionObject2D.mb_get_collision_mask_value, livePtr, layer_number)
  }

  /** CollisionObject2D.set_collision_priority */
  final def setCollisionPriority(priority: Double): Unit = {
    if (gdext.classes.CollisionObject2D.mb_set_collision_priority == null) gdext.classes.CollisionObject2D.mb_set_collision_priority = MethodBind.get("CollisionObject2D", "set_collision_priority", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CollisionObject2D.mb_set_collision_priority, livePtr, priority)
  }

  /** CollisionObject2D.get_collision_priority */
  final def getCollisionPriority(): Double = {
    if (gdext.classes.CollisionObject2D.mb_get_collision_priority == null) gdext.classes.CollisionObject2D.mb_get_collision_priority = MethodBind.get("CollisionObject2D", "get_collision_priority", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CollisionObject2D.mb_get_collision_priority, livePtr)
  }

  /** CollisionObject2D.set_disable_mode */
  final def setDisableMode(mode: Long): Unit = {
    if (gdext.classes.CollisionObject2D.mb_set_disable_mode == null) gdext.classes.CollisionObject2D.mb_set_disable_mode = MethodBind.get("CollisionObject2D", "set_disable_mode", 1919204045L)
    Ptrcall.callVoid1(gdext.classes.CollisionObject2D.mb_set_disable_mode, livePtr, mode)
  }

  /** CollisionObject2D.get_disable_mode */
  final def getDisableMode(): Long = {
    if (gdext.classes.CollisionObject2D.mb_get_disable_mode == null) gdext.classes.CollisionObject2D.mb_get_disable_mode = MethodBind.get("CollisionObject2D", "get_disable_mode", 3172846349L)
    Ptrcall.call0[Long](gdext.classes.CollisionObject2D.mb_get_disable_mode, livePtr)
  }

  /** CollisionObject2D.set_pickable */
  final def setPickable(enabled: Boolean): Unit = {
    if (gdext.classes.CollisionObject2D.mb_set_pickable == null) gdext.classes.CollisionObject2D.mb_set_pickable = MethodBind.get("CollisionObject2D", "set_pickable", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CollisionObject2D.mb_set_pickable, livePtr, enabled)
  }

  /** CollisionObject2D.is_pickable */
  final def isPickable(): Boolean = {
    if (gdext.classes.CollisionObject2D.mb_is_pickable == null) gdext.classes.CollisionObject2D.mb_is_pickable = MethodBind.get("CollisionObject2D", "is_pickable", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CollisionObject2D.mb_is_pickable, livePtr)
  }

  /** CollisionObject2D.create_shape_owner */
  final def createShapeOwner(owner: Object): Long = {
    if (gdext.classes.CollisionObject2D.mb_create_shape_owner == null) gdext.classes.CollisionObject2D.mb_create_shape_owner = MethodBind.get("CollisionObject2D", "create_shape_owner", 3429307534L)
    Ptrcall.call1[GodotObject, Long](gdext.classes.CollisionObject2D.mb_create_shape_owner, livePtr, Wrappers.handle(owner))
  }

  /** CollisionObject2D.remove_shape_owner */
  final def removeShapeOwner(owner_id: Long): Unit = {
    if (gdext.classes.CollisionObject2D.mb_remove_shape_owner == null) gdext.classes.CollisionObject2D.mb_remove_shape_owner = MethodBind.get("CollisionObject2D", "remove_shape_owner", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.CollisionObject2D.mb_remove_shape_owner, livePtr, owner_id)
  }

  /** CollisionObject2D.shape_owner_set_transform */
  final def shapeOwnerSetTransform(owner_id: Long, transform: gdext.builtin.Transform2D): Unit = {
    if (gdext.classes.CollisionObject2D.mb_shape_owner_set_transform == null) gdext.classes.CollisionObject2D.mb_shape_owner_set_transform = MethodBind.get("CollisionObject2D", "shape_owner_set_transform", 30160968L)
    Ptrcall.callVoid2(gdext.classes.CollisionObject2D.mb_shape_owner_set_transform, livePtr, owner_id, transform)
  }

  /** CollisionObject2D.shape_owner_get_transform */
  final def shapeOwnerGetTransform(owner_id: Long): gdext.builtin.Transform2D = {
    if (gdext.classes.CollisionObject2D.mb_shape_owner_get_transform == null) gdext.classes.CollisionObject2D.mb_shape_owner_get_transform = MethodBind.get("CollisionObject2D", "shape_owner_get_transform", 3836996910L)
    Ptrcall.call1[Long, gdext.builtin.Transform2D](gdext.classes.CollisionObject2D.mb_shape_owner_get_transform, livePtr, owner_id)
  }

  /** CollisionObject2D.shape_owner_get_owner */
  final def shapeOwnerGetOwner(owner_id: Long): Object = {
    if (gdext.classes.CollisionObject2D.mb_shape_owner_get_owner == null) gdext.classes.CollisionObject2D.mb_shape_owner_get_owner = MethodBind.get("CollisionObject2D", "shape_owner_get_owner", 3332903315L)
    Wrappers.borrowed[Object](Ptrcall.call1[Long, Long](gdext.classes.CollisionObject2D.mb_shape_owner_get_owner, livePtr, owner_id))
  }

  /** CollisionObject2D.shape_owner_set_disabled */
  final def shapeOwnerSetDisabled(owner_id: Long, disabled: Boolean): Unit = {
    if (gdext.classes.CollisionObject2D.mb_shape_owner_set_disabled == null) gdext.classes.CollisionObject2D.mb_shape_owner_set_disabled = MethodBind.get("CollisionObject2D", "shape_owner_set_disabled", 300928843L)
    Ptrcall.callVoid2(gdext.classes.CollisionObject2D.mb_shape_owner_set_disabled, livePtr, owner_id, disabled)
  }

  /** CollisionObject2D.is_shape_owner_disabled */
  final def isShapeOwnerDisabled(owner_id: Long): Boolean = {
    if (gdext.classes.CollisionObject2D.mb_is_shape_owner_disabled == null) gdext.classes.CollisionObject2D.mb_is_shape_owner_disabled = MethodBind.get("CollisionObject2D", "is_shape_owner_disabled", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.CollisionObject2D.mb_is_shape_owner_disabled, livePtr, owner_id)
  }

  /** CollisionObject2D.shape_owner_set_one_way_collision */
  final def shapeOwnerSetOneWayCollision(owner_id: Long, enable: Boolean): Unit = {
    if (gdext.classes.CollisionObject2D.mb_shape_owner_set_one_way_collision == null) gdext.classes.CollisionObject2D.mb_shape_owner_set_one_way_collision = MethodBind.get("CollisionObject2D", "shape_owner_set_one_way_collision", 300928843L)
    Ptrcall.callVoid2(gdext.classes.CollisionObject2D.mb_shape_owner_set_one_way_collision, livePtr, owner_id, enable)
  }

  /** CollisionObject2D.is_shape_owner_one_way_collision_enabled */
  final def isShapeOwnerOneWayCollisionEnabled(owner_id: Long): Boolean = {
    if (gdext.classes.CollisionObject2D.mb_is_shape_owner_one_way_collision_enabled == null) gdext.classes.CollisionObject2D.mb_is_shape_owner_one_way_collision_enabled = MethodBind.get("CollisionObject2D", "is_shape_owner_one_way_collision_enabled", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.CollisionObject2D.mb_is_shape_owner_one_way_collision_enabled, livePtr, owner_id)
  }

  /** CollisionObject2D.shape_owner_set_one_way_collision_margin */
  final def shapeOwnerSetOneWayCollisionMargin(owner_id: Long, margin: Double): Unit = {
    if (gdext.classes.CollisionObject2D.mb_shape_owner_set_one_way_collision_margin == null) gdext.classes.CollisionObject2D.mb_shape_owner_set_one_way_collision_margin = MethodBind.get("CollisionObject2D", "shape_owner_set_one_way_collision_margin", 1602489585L)
    Ptrcall.callVoid2(gdext.classes.CollisionObject2D.mb_shape_owner_set_one_way_collision_margin, livePtr, owner_id, margin)
  }

  /** CollisionObject2D.get_shape_owner_one_way_collision_margin */
  final def getShapeOwnerOneWayCollisionMargin(owner_id: Long): Double = {
    if (gdext.classes.CollisionObject2D.mb_get_shape_owner_one_way_collision_margin == null) gdext.classes.CollisionObject2D.mb_get_shape_owner_one_way_collision_margin = MethodBind.get("CollisionObject2D", "get_shape_owner_one_way_collision_margin", 2339986948L)
    Ptrcall.call1[Long, Double](gdext.classes.CollisionObject2D.mb_get_shape_owner_one_way_collision_margin, livePtr, owner_id)
  }

  /** CollisionObject2D.shape_owner_add_shape */
  final def shapeOwnerAddShape(owner_id: Long, shape: Shape2D): Unit = {
    if (gdext.classes.CollisionObject2D.mb_shape_owner_add_shape == null) gdext.classes.CollisionObject2D.mb_shape_owner_add_shape = MethodBind.get("CollisionObject2D", "shape_owner_add_shape", 2077425081L)
    Ptrcall.callVoid2(gdext.classes.CollisionObject2D.mb_shape_owner_add_shape, livePtr, owner_id, Wrappers.handle(shape))
  }

  /** CollisionObject2D.shape_owner_get_shape_count */
  final def shapeOwnerGetShapeCount(owner_id: Long): Long = {
    if (gdext.classes.CollisionObject2D.mb_shape_owner_get_shape_count == null) gdext.classes.CollisionObject2D.mb_shape_owner_get_shape_count = MethodBind.get("CollisionObject2D", "shape_owner_get_shape_count", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.CollisionObject2D.mb_shape_owner_get_shape_count, livePtr, owner_id)
  }

  /** CollisionObject2D.shape_owner_get_shape. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def shapeOwnerGetShape(owner_id: Long, shape_id: Long): Shape2D = {
    if (gdext.classes.CollisionObject2D.mb_shape_owner_get_shape == null) gdext.classes.CollisionObject2D.mb_shape_owner_get_shape = MethodBind.get("CollisionObject2D", "shape_owner_get_shape", 3106725749L)
    Wrappers.owned[Shape2D](Ptrcall.call2[Long, Long, Long](gdext.classes.CollisionObject2D.mb_shape_owner_get_shape, livePtr, owner_id, shape_id))
  }

  /** CollisionObject2D.shape_owner_get_shape_index */
  final def shapeOwnerGetShapeIndex(owner_id: Long, shape_id: Long): Long = {
    if (gdext.classes.CollisionObject2D.mb_shape_owner_get_shape_index == null) gdext.classes.CollisionObject2D.mb_shape_owner_get_shape_index = MethodBind.get("CollisionObject2D", "shape_owner_get_shape_index", 3175239445L)
    Ptrcall.call2[Long, Long, Long](gdext.classes.CollisionObject2D.mb_shape_owner_get_shape_index, livePtr, owner_id, shape_id)
  }

  /** CollisionObject2D.shape_owner_remove_shape */
  final def shapeOwnerRemoveShape(owner_id: Long, shape_id: Long): Unit = {
    if (gdext.classes.CollisionObject2D.mb_shape_owner_remove_shape == null) gdext.classes.CollisionObject2D.mb_shape_owner_remove_shape = MethodBind.get("CollisionObject2D", "shape_owner_remove_shape", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.CollisionObject2D.mb_shape_owner_remove_shape, livePtr, owner_id, shape_id)
  }

  /** CollisionObject2D.shape_owner_clear_shapes */
  final def shapeOwnerClearShapes(owner_id: Long): Unit = {
    if (gdext.classes.CollisionObject2D.mb_shape_owner_clear_shapes == null) gdext.classes.CollisionObject2D.mb_shape_owner_clear_shapes = MethodBind.get("CollisionObject2D", "shape_owner_clear_shapes", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.CollisionObject2D.mb_shape_owner_clear_shapes, livePtr, owner_id)
  }

  /** CollisionObject2D.shape_find_owner */
  final def shapeFindOwner(shape_index: Long): Long = {
    if (gdext.classes.CollisionObject2D.mb_shape_find_owner == null) gdext.classes.CollisionObject2D.mb_shape_find_owner = MethodBind.get("CollisionObject2D", "shape_find_owner", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.CollisionObject2D.mb_shape_find_owner, livePtr, shape_index)
  }

}

object CollisionObject2D {
  private[classes] var mb_set_collision_layer: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collision_layer: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_collision_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collision_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_collision_layer_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collision_layer_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_collision_mask_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collision_mask_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_collision_priority: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collision_priority: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_disable_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_disable_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_pickable: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_pickable: GDExtensionMethodBindPtr = null
  private[classes] var mb_create_shape_owner: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_shape_owner: GDExtensionMethodBindPtr = null
  private[classes] var mb_shape_owner_set_transform: GDExtensionMethodBindPtr = null
  private[classes] var mb_shape_owner_get_transform: GDExtensionMethodBindPtr = null
  private[classes] var mb_shape_owner_get_owner: GDExtensionMethodBindPtr = null
  private[classes] var mb_shape_owner_set_disabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_shape_owner_disabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_shape_owner_set_one_way_collision: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_shape_owner_one_way_collision_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_shape_owner_set_one_way_collision_margin: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_shape_owner_one_way_collision_margin: GDExtensionMethodBindPtr = null
  private[classes] var mb_shape_owner_add_shape: GDExtensionMethodBindPtr = null
  private[classes] var mb_shape_owner_get_shape_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_shape_owner_get_shape: GDExtensionMethodBindPtr = null
  private[classes] var mb_shape_owner_get_shape_index: GDExtensionMethodBindPtr = null
  private[classes] var mb_shape_owner_remove_shape: GDExtensionMethodBindPtr = null
  private[classes] var mb_shape_owner_clear_shapes: GDExtensionMethodBindPtr = null
  private[classes] var mb_shape_find_owner: GDExtensionMethodBindPtr = null
}
