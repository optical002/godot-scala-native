package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `CollisionObject3D`, extends `Node3D`. */
abstract class CollisionObject3D extends Node3D {
  override def godotClassName: String = "CollisionObject3D"

  /** CollisionObject3D.set_collision_layer */
  final def setCollisionLayer(layer: Long): Unit = {
    if (gdext.classes.CollisionObject3D.mb_set_collision_layer == null) gdext.classes.CollisionObject3D.mb_set_collision_layer = MethodBind.get("CollisionObject3D", "set_collision_layer", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.CollisionObject3D.mb_set_collision_layer, livePtr, layer)
  }

  /** CollisionObject3D.get_collision_layer */
  final def getCollisionLayer(): Long = {
    if (gdext.classes.CollisionObject3D.mb_get_collision_layer == null) gdext.classes.CollisionObject3D.mb_get_collision_layer = MethodBind.get("CollisionObject3D", "get_collision_layer", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.CollisionObject3D.mb_get_collision_layer, livePtr)
  }

  /** CollisionObject3D.set_collision_mask */
  final def setCollisionMask(mask: Long): Unit = {
    if (gdext.classes.CollisionObject3D.mb_set_collision_mask == null) gdext.classes.CollisionObject3D.mb_set_collision_mask = MethodBind.get("CollisionObject3D", "set_collision_mask", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.CollisionObject3D.mb_set_collision_mask, livePtr, mask)
  }

  /** CollisionObject3D.get_collision_mask */
  final def getCollisionMask(): Long = {
    if (gdext.classes.CollisionObject3D.mb_get_collision_mask == null) gdext.classes.CollisionObject3D.mb_get_collision_mask = MethodBind.get("CollisionObject3D", "get_collision_mask", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.CollisionObject3D.mb_get_collision_mask, livePtr)
  }

  /** CollisionObject3D.set_collision_layer_value */
  final def setCollisionLayerValue(layer_number: Long, value: Boolean): Unit = {
    if (gdext.classes.CollisionObject3D.mb_set_collision_layer_value == null) gdext.classes.CollisionObject3D.mb_set_collision_layer_value = MethodBind.get("CollisionObject3D", "set_collision_layer_value", 300928843L)
    Ptrcall.callVoid2(gdext.classes.CollisionObject3D.mb_set_collision_layer_value, livePtr, layer_number, value)
  }

  /** CollisionObject3D.get_collision_layer_value */
  final def getCollisionLayerValue(layer_number: Long): Boolean = {
    if (gdext.classes.CollisionObject3D.mb_get_collision_layer_value == null) gdext.classes.CollisionObject3D.mb_get_collision_layer_value = MethodBind.get("CollisionObject3D", "get_collision_layer_value", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.CollisionObject3D.mb_get_collision_layer_value, livePtr, layer_number)
  }

  /** CollisionObject3D.set_collision_mask_value */
  final def setCollisionMaskValue(layer_number: Long, value: Boolean): Unit = {
    if (gdext.classes.CollisionObject3D.mb_set_collision_mask_value == null) gdext.classes.CollisionObject3D.mb_set_collision_mask_value = MethodBind.get("CollisionObject3D", "set_collision_mask_value", 300928843L)
    Ptrcall.callVoid2(gdext.classes.CollisionObject3D.mb_set_collision_mask_value, livePtr, layer_number, value)
  }

  /** CollisionObject3D.get_collision_mask_value */
  final def getCollisionMaskValue(layer_number: Long): Boolean = {
    if (gdext.classes.CollisionObject3D.mb_get_collision_mask_value == null) gdext.classes.CollisionObject3D.mb_get_collision_mask_value = MethodBind.get("CollisionObject3D", "get_collision_mask_value", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.CollisionObject3D.mb_get_collision_mask_value, livePtr, layer_number)
  }

  /** CollisionObject3D.set_collision_priority */
  final def setCollisionPriority(priority: Double): Unit = {
    if (gdext.classes.CollisionObject3D.mb_set_collision_priority == null) gdext.classes.CollisionObject3D.mb_set_collision_priority = MethodBind.get("CollisionObject3D", "set_collision_priority", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CollisionObject3D.mb_set_collision_priority, livePtr, priority)
  }

  /** CollisionObject3D.get_collision_priority */
  final def getCollisionPriority(): Double = {
    if (gdext.classes.CollisionObject3D.mb_get_collision_priority == null) gdext.classes.CollisionObject3D.mb_get_collision_priority = MethodBind.get("CollisionObject3D", "get_collision_priority", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CollisionObject3D.mb_get_collision_priority, livePtr)
  }

  /** CollisionObject3D.set_disable_mode */
  final def setDisableMode(mode: Long): Unit = {
    if (gdext.classes.CollisionObject3D.mb_set_disable_mode == null) gdext.classes.CollisionObject3D.mb_set_disable_mode = MethodBind.get("CollisionObject3D", "set_disable_mode", 1623620376L)
    Ptrcall.callVoid1(gdext.classes.CollisionObject3D.mb_set_disable_mode, livePtr, mode)
  }

  /** CollisionObject3D.get_disable_mode */
  final def getDisableMode(): Long = {
    if (gdext.classes.CollisionObject3D.mb_get_disable_mode == null) gdext.classes.CollisionObject3D.mb_get_disable_mode = MethodBind.get("CollisionObject3D", "get_disable_mode", 410164780L)
    Ptrcall.call0[Long](gdext.classes.CollisionObject3D.mb_get_disable_mode, livePtr)
  }

  /** CollisionObject3D.set_ray_pickable */
  final def setRayPickable(ray_pickable: Boolean): Unit = {
    if (gdext.classes.CollisionObject3D.mb_set_ray_pickable == null) gdext.classes.CollisionObject3D.mb_set_ray_pickable = MethodBind.get("CollisionObject3D", "set_ray_pickable", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CollisionObject3D.mb_set_ray_pickable, livePtr, ray_pickable)
  }

  /** CollisionObject3D.is_ray_pickable */
  final def isRayPickable(): Boolean = {
    if (gdext.classes.CollisionObject3D.mb_is_ray_pickable == null) gdext.classes.CollisionObject3D.mb_is_ray_pickable = MethodBind.get("CollisionObject3D", "is_ray_pickable", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CollisionObject3D.mb_is_ray_pickable, livePtr)
  }

  /** CollisionObject3D.set_capture_input_on_drag */
  final def setCaptureInputOnDrag(enable: Boolean): Unit = {
    if (gdext.classes.CollisionObject3D.mb_set_capture_input_on_drag == null) gdext.classes.CollisionObject3D.mb_set_capture_input_on_drag = MethodBind.get("CollisionObject3D", "set_capture_input_on_drag", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CollisionObject3D.mb_set_capture_input_on_drag, livePtr, enable)
  }

  /** CollisionObject3D.get_capture_input_on_drag */
  final def getCaptureInputOnDrag(): Boolean = {
    if (gdext.classes.CollisionObject3D.mb_get_capture_input_on_drag == null) gdext.classes.CollisionObject3D.mb_get_capture_input_on_drag = MethodBind.get("CollisionObject3D", "get_capture_input_on_drag", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CollisionObject3D.mb_get_capture_input_on_drag, livePtr)
  }

  /** CollisionObject3D.create_shape_owner */
  final def createShapeOwner(owner: Object): Long = {
    if (gdext.classes.CollisionObject3D.mb_create_shape_owner == null) gdext.classes.CollisionObject3D.mb_create_shape_owner = MethodBind.get("CollisionObject3D", "create_shape_owner", 3429307534L)
    Ptrcall.call1[GodotObject, Long](gdext.classes.CollisionObject3D.mb_create_shape_owner, livePtr, Wrappers.handle(owner))
  }

  /** CollisionObject3D.remove_shape_owner */
  final def removeShapeOwner(owner_id: Long): Unit = {
    if (gdext.classes.CollisionObject3D.mb_remove_shape_owner == null) gdext.classes.CollisionObject3D.mb_remove_shape_owner = MethodBind.get("CollisionObject3D", "remove_shape_owner", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.CollisionObject3D.mb_remove_shape_owner, livePtr, owner_id)
  }

  /** CollisionObject3D.shape_owner_set_transform */
  final def shapeOwnerSetTransform(owner_id: Long, transform: gdext.builtin.Transform3D): Unit = {
    if (gdext.classes.CollisionObject3D.mb_shape_owner_set_transform == null) gdext.classes.CollisionObject3D.mb_shape_owner_set_transform = MethodBind.get("CollisionObject3D", "shape_owner_set_transform", 3616898986L)
    Ptrcall.callVoid2(gdext.classes.CollisionObject3D.mb_shape_owner_set_transform, livePtr, owner_id, transform)
  }

  /** CollisionObject3D.shape_owner_get_transform */
  final def shapeOwnerGetTransform(owner_id: Long): gdext.builtin.Transform3D = {
    if (gdext.classes.CollisionObject3D.mb_shape_owner_get_transform == null) gdext.classes.CollisionObject3D.mb_shape_owner_get_transform = MethodBind.get("CollisionObject3D", "shape_owner_get_transform", 1965739696L)
    Ptrcall.call1[Long, gdext.builtin.Transform3D](gdext.classes.CollisionObject3D.mb_shape_owner_get_transform, livePtr, owner_id)
  }

  /** CollisionObject3D.shape_owner_get_owner */
  final def shapeOwnerGetOwner(owner_id: Long): Object = {
    if (gdext.classes.CollisionObject3D.mb_shape_owner_get_owner == null) gdext.classes.CollisionObject3D.mb_shape_owner_get_owner = MethodBind.get("CollisionObject3D", "shape_owner_get_owner", 3332903315L)
    Wrappers.borrowed[Object](Ptrcall.call1[Long, Long](gdext.classes.CollisionObject3D.mb_shape_owner_get_owner, livePtr, owner_id))
  }

  /** CollisionObject3D.shape_owner_set_disabled */
  final def shapeOwnerSetDisabled(owner_id: Long, disabled: Boolean): Unit = {
    if (gdext.classes.CollisionObject3D.mb_shape_owner_set_disabled == null) gdext.classes.CollisionObject3D.mb_shape_owner_set_disabled = MethodBind.get("CollisionObject3D", "shape_owner_set_disabled", 300928843L)
    Ptrcall.callVoid2(gdext.classes.CollisionObject3D.mb_shape_owner_set_disabled, livePtr, owner_id, disabled)
  }

  /** CollisionObject3D.is_shape_owner_disabled */
  final def isShapeOwnerDisabled(owner_id: Long): Boolean = {
    if (gdext.classes.CollisionObject3D.mb_is_shape_owner_disabled == null) gdext.classes.CollisionObject3D.mb_is_shape_owner_disabled = MethodBind.get("CollisionObject3D", "is_shape_owner_disabled", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.CollisionObject3D.mb_is_shape_owner_disabled, livePtr, owner_id)
  }

  /** CollisionObject3D.shape_owner_add_shape */
  final def shapeOwnerAddShape(owner_id: Long, shape: Shape3D): Unit = {
    if (gdext.classes.CollisionObject3D.mb_shape_owner_add_shape == null) gdext.classes.CollisionObject3D.mb_shape_owner_add_shape = MethodBind.get("CollisionObject3D", "shape_owner_add_shape", 2566676345L)
    Ptrcall.callVoid2(gdext.classes.CollisionObject3D.mb_shape_owner_add_shape, livePtr, owner_id, Wrappers.handle(shape))
  }

  /** CollisionObject3D.shape_owner_get_shape_count */
  final def shapeOwnerGetShapeCount(owner_id: Long): Long = {
    if (gdext.classes.CollisionObject3D.mb_shape_owner_get_shape_count == null) gdext.classes.CollisionObject3D.mb_shape_owner_get_shape_count = MethodBind.get("CollisionObject3D", "shape_owner_get_shape_count", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.CollisionObject3D.mb_shape_owner_get_shape_count, livePtr, owner_id)
  }

  /** CollisionObject3D.shape_owner_get_shape. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def shapeOwnerGetShape(owner_id: Long, shape_id: Long): Shape3D = {
    if (gdext.classes.CollisionObject3D.mb_shape_owner_get_shape == null) gdext.classes.CollisionObject3D.mb_shape_owner_get_shape = MethodBind.get("CollisionObject3D", "shape_owner_get_shape", 4015519174L)
    Wrappers.owned[Shape3D](Ptrcall.call2[Long, Long, Long](gdext.classes.CollisionObject3D.mb_shape_owner_get_shape, livePtr, owner_id, shape_id))
  }

  /** CollisionObject3D.shape_owner_get_shape_index */
  final def shapeOwnerGetShapeIndex(owner_id: Long, shape_id: Long): Long = {
    if (gdext.classes.CollisionObject3D.mb_shape_owner_get_shape_index == null) gdext.classes.CollisionObject3D.mb_shape_owner_get_shape_index = MethodBind.get("CollisionObject3D", "shape_owner_get_shape_index", 3175239445L)
    Ptrcall.call2[Long, Long, Long](gdext.classes.CollisionObject3D.mb_shape_owner_get_shape_index, livePtr, owner_id, shape_id)
  }

  /** CollisionObject3D.shape_owner_remove_shape */
  final def shapeOwnerRemoveShape(owner_id: Long, shape_id: Long): Unit = {
    if (gdext.classes.CollisionObject3D.mb_shape_owner_remove_shape == null) gdext.classes.CollisionObject3D.mb_shape_owner_remove_shape = MethodBind.get("CollisionObject3D", "shape_owner_remove_shape", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.CollisionObject3D.mb_shape_owner_remove_shape, livePtr, owner_id, shape_id)
  }

  /** CollisionObject3D.shape_owner_clear_shapes */
  final def shapeOwnerClearShapes(owner_id: Long): Unit = {
    if (gdext.classes.CollisionObject3D.mb_shape_owner_clear_shapes == null) gdext.classes.CollisionObject3D.mb_shape_owner_clear_shapes = MethodBind.get("CollisionObject3D", "shape_owner_clear_shapes", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.CollisionObject3D.mb_shape_owner_clear_shapes, livePtr, owner_id)
  }

  /** CollisionObject3D.shape_find_owner */
  final def shapeFindOwner(shape_index: Long): Long = {
    if (gdext.classes.CollisionObject3D.mb_shape_find_owner == null) gdext.classes.CollisionObject3D.mb_shape_find_owner = MethodBind.get("CollisionObject3D", "shape_find_owner", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.CollisionObject3D.mb_shape_find_owner, livePtr, shape_index)
  }

}

object CollisionObject3D {
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
  private[classes] var mb_set_ray_pickable: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_ray_pickable: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_capture_input_on_drag: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_capture_input_on_drag: GDExtensionMethodBindPtr = null
  private[classes] var mb_create_shape_owner: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_shape_owner: GDExtensionMethodBindPtr = null
  private[classes] var mb_shape_owner_set_transform: GDExtensionMethodBindPtr = null
  private[classes] var mb_shape_owner_get_transform: GDExtensionMethodBindPtr = null
  private[classes] var mb_shape_owner_get_owner: GDExtensionMethodBindPtr = null
  private[classes] var mb_shape_owner_set_disabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_shape_owner_disabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_shape_owner_add_shape: GDExtensionMethodBindPtr = null
  private[classes] var mb_shape_owner_get_shape_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_shape_owner_get_shape: GDExtensionMethodBindPtr = null
  private[classes] var mb_shape_owner_get_shape_index: GDExtensionMethodBindPtr = null
  private[classes] var mb_shape_owner_remove_shape: GDExtensionMethodBindPtr = null
  private[classes] var mb_shape_owner_clear_shapes: GDExtensionMethodBindPtr = null
  private[classes] var mb_shape_find_owner: GDExtensionMethodBindPtr = null
}
