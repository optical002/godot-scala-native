package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `RayCast2D`, extends `Node2D`. */
abstract class RayCast2D extends Node2D {
  override def godotClassName: String = "RayCast2D"

  /** RayCast2D.set_enabled */
  final def setEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.RayCast2D.mb_set_enabled == null) gdext.classes.RayCast2D.mb_set_enabled = MethodBind.get("RayCast2D", "set_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RayCast2D.mb_set_enabled, livePtr, enabled)
  }

  /** RayCast2D.is_enabled */
  final def isEnabled(): Boolean = {
    if (gdext.classes.RayCast2D.mb_is_enabled == null) gdext.classes.RayCast2D.mb_is_enabled = MethodBind.get("RayCast2D", "is_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RayCast2D.mb_is_enabled, livePtr)
  }

  /** RayCast2D.set_target_position */
  final def setTargetPosition(localPoint: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.RayCast2D.mb_set_target_position == null) gdext.classes.RayCast2D.mb_set_target_position = MethodBind.get("RayCast2D", "set_target_position", 743155724L)
    Ptrcall.callVoid1(gdext.classes.RayCast2D.mb_set_target_position, livePtr, localPoint)
  }

  /** RayCast2D.get_target_position */
  final def getTargetPosition(): gdext.builtin.Vector2 = {
    if (gdext.classes.RayCast2D.mb_get_target_position == null) gdext.classes.RayCast2D.mb_get_target_position = MethodBind.get("RayCast2D", "get_target_position", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.RayCast2D.mb_get_target_position, livePtr)
  }

  /** RayCast2D.is_colliding */
  final def isColliding(): Boolean = {
    if (gdext.classes.RayCast2D.mb_is_colliding == null) gdext.classes.RayCast2D.mb_is_colliding = MethodBind.get("RayCast2D", "is_colliding", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RayCast2D.mb_is_colliding, livePtr)
  }

  /** RayCast2D.force_raycast_update */
  final def forceRaycastUpdate(): Unit = {
    if (gdext.classes.RayCast2D.mb_force_raycast_update == null) gdext.classes.RayCast2D.mb_force_raycast_update = MethodBind.get("RayCast2D", "force_raycast_update", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.RayCast2D.mb_force_raycast_update, livePtr)
  }

  /** RayCast2D.get_collider */
  final def getCollider(): Object = {
    if (gdext.classes.RayCast2D.mb_get_collider == null) gdext.classes.RayCast2D.mb_get_collider = MethodBind.get("RayCast2D", "get_collider", 1981248198L)
    Wrappers.borrowed[Object](Ptrcall.call0[Long](gdext.classes.RayCast2D.mb_get_collider, livePtr))
  }

  /** RayCast2D.get_collider_shape */
  final def getColliderShape(): Long = {
    if (gdext.classes.RayCast2D.mb_get_collider_shape == null) gdext.classes.RayCast2D.mb_get_collider_shape = MethodBind.get("RayCast2D", "get_collider_shape", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.RayCast2D.mb_get_collider_shape, livePtr)
  }

  /** RayCast2D.get_collision_point */
  final def getCollisionPoint(): gdext.builtin.Vector2 = {
    if (gdext.classes.RayCast2D.mb_get_collision_point == null) gdext.classes.RayCast2D.mb_get_collision_point = MethodBind.get("RayCast2D", "get_collision_point", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.RayCast2D.mb_get_collision_point, livePtr)
  }

  /** RayCast2D.get_collision_normal */
  final def getCollisionNormal(): gdext.builtin.Vector2 = {
    if (gdext.classes.RayCast2D.mb_get_collision_normal == null) gdext.classes.RayCast2D.mb_get_collision_normal = MethodBind.get("RayCast2D", "get_collision_normal", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.RayCast2D.mb_get_collision_normal, livePtr)
  }

  /** RayCast2D.add_exception */
  final def addException(node: CollisionObject2D): Unit = {
    if (gdext.classes.RayCast2D.mb_add_exception == null) gdext.classes.RayCast2D.mb_add_exception = MethodBind.get("RayCast2D", "add_exception", 3090941106L)
    Ptrcall.callVoid1(gdext.classes.RayCast2D.mb_add_exception, livePtr, Wrappers.handle(node))
  }

  /** RayCast2D.remove_exception */
  final def removeException(node: CollisionObject2D): Unit = {
    if (gdext.classes.RayCast2D.mb_remove_exception == null) gdext.classes.RayCast2D.mb_remove_exception = MethodBind.get("RayCast2D", "remove_exception", 3090941106L)
    Ptrcall.callVoid1(gdext.classes.RayCast2D.mb_remove_exception, livePtr, Wrappers.handle(node))
  }

  /** RayCast2D.clear_exceptions */
  final def clearExceptions(): Unit = {
    if (gdext.classes.RayCast2D.mb_clear_exceptions == null) gdext.classes.RayCast2D.mb_clear_exceptions = MethodBind.get("RayCast2D", "clear_exceptions", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.RayCast2D.mb_clear_exceptions, livePtr)
  }

  /** RayCast2D.set_collision_mask */
  final def setCollisionMask(mask: Long): Unit = {
    if (gdext.classes.RayCast2D.mb_set_collision_mask == null) gdext.classes.RayCast2D.mb_set_collision_mask = MethodBind.get("RayCast2D", "set_collision_mask", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.RayCast2D.mb_set_collision_mask, livePtr, mask)
  }

  /** RayCast2D.get_collision_mask */
  final def getCollisionMask(): Long = {
    if (gdext.classes.RayCast2D.mb_get_collision_mask == null) gdext.classes.RayCast2D.mb_get_collision_mask = MethodBind.get("RayCast2D", "get_collision_mask", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.RayCast2D.mb_get_collision_mask, livePtr)
  }

  /** RayCast2D.set_collision_mask_value */
  final def setCollisionMaskValue(layerNumber: Long, value: Boolean): Unit = {
    if (gdext.classes.RayCast2D.mb_set_collision_mask_value == null) gdext.classes.RayCast2D.mb_set_collision_mask_value = MethodBind.get("RayCast2D", "set_collision_mask_value", 300928843L)
    Ptrcall.callVoid2(gdext.classes.RayCast2D.mb_set_collision_mask_value, livePtr, layerNumber, value)
  }

  /** RayCast2D.get_collision_mask_value */
  final def getCollisionMaskValue(layerNumber: Long): Boolean = {
    if (gdext.classes.RayCast2D.mb_get_collision_mask_value == null) gdext.classes.RayCast2D.mb_get_collision_mask_value = MethodBind.get("RayCast2D", "get_collision_mask_value", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.RayCast2D.mb_get_collision_mask_value, livePtr, layerNumber)
  }

  /** RayCast2D.set_exclude_parent_body */
  final def setExcludeParentBody(mask: Boolean): Unit = {
    if (gdext.classes.RayCast2D.mb_set_exclude_parent_body == null) gdext.classes.RayCast2D.mb_set_exclude_parent_body = MethodBind.get("RayCast2D", "set_exclude_parent_body", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RayCast2D.mb_set_exclude_parent_body, livePtr, mask)
  }

  /** RayCast2D.get_exclude_parent_body */
  final def getExcludeParentBody(): Boolean = {
    if (gdext.classes.RayCast2D.mb_get_exclude_parent_body == null) gdext.classes.RayCast2D.mb_get_exclude_parent_body = MethodBind.get("RayCast2D", "get_exclude_parent_body", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RayCast2D.mb_get_exclude_parent_body, livePtr)
  }

  /** RayCast2D.set_collide_with_areas */
  final def setCollideWithAreas(enable: Boolean): Unit = {
    if (gdext.classes.RayCast2D.mb_set_collide_with_areas == null) gdext.classes.RayCast2D.mb_set_collide_with_areas = MethodBind.get("RayCast2D", "set_collide_with_areas", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RayCast2D.mb_set_collide_with_areas, livePtr, enable)
  }

  /** RayCast2D.is_collide_with_areas_enabled */
  final def isCollideWithAreasEnabled(): Boolean = {
    if (gdext.classes.RayCast2D.mb_is_collide_with_areas_enabled == null) gdext.classes.RayCast2D.mb_is_collide_with_areas_enabled = MethodBind.get("RayCast2D", "is_collide_with_areas_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RayCast2D.mb_is_collide_with_areas_enabled, livePtr)
  }

  /** RayCast2D.set_collide_with_bodies */
  final def setCollideWithBodies(enable: Boolean): Unit = {
    if (gdext.classes.RayCast2D.mb_set_collide_with_bodies == null) gdext.classes.RayCast2D.mb_set_collide_with_bodies = MethodBind.get("RayCast2D", "set_collide_with_bodies", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RayCast2D.mb_set_collide_with_bodies, livePtr, enable)
  }

  /** RayCast2D.is_collide_with_bodies_enabled */
  final def isCollideWithBodiesEnabled(): Boolean = {
    if (gdext.classes.RayCast2D.mb_is_collide_with_bodies_enabled == null) gdext.classes.RayCast2D.mb_is_collide_with_bodies_enabled = MethodBind.get("RayCast2D", "is_collide_with_bodies_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RayCast2D.mb_is_collide_with_bodies_enabled, livePtr)
  }

  /** RayCast2D.set_hit_from_inside */
  final def setHitFromInside(enable: Boolean): Unit = {
    if (gdext.classes.RayCast2D.mb_set_hit_from_inside == null) gdext.classes.RayCast2D.mb_set_hit_from_inside = MethodBind.get("RayCast2D", "set_hit_from_inside", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RayCast2D.mb_set_hit_from_inside, livePtr, enable)
  }

  /** RayCast2D.is_hit_from_inside_enabled */
  final def isHitFromInsideEnabled(): Boolean = {
    if (gdext.classes.RayCast2D.mb_is_hit_from_inside_enabled == null) gdext.classes.RayCast2D.mb_is_hit_from_inside_enabled = MethodBind.get("RayCast2D", "is_hit_from_inside_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RayCast2D.mb_is_hit_from_inside_enabled, livePtr)
  }

}

object RayCast2D {
  private[classes] var mb_set_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_target_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_target_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_colliding: GDExtensionMethodBindPtr = null
  private[classes] var mb_force_raycast_update: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collider: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collider_shape: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collision_point: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collision_normal: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_exception: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_exception: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_exceptions: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_collision_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collision_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_collision_mask_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collision_mask_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_exclude_parent_body: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_exclude_parent_body: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_collide_with_areas: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_collide_with_areas_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_collide_with_bodies: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_collide_with_bodies_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_hit_from_inside: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_hit_from_inside_enabled: GDExtensionMethodBindPtr = null
}
