package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `ShapeCast2D`, extends `Node2D`. */
abstract class ShapeCast2D extends Node2D {
  override def godotClassName: String = "ShapeCast2D"

  /** ShapeCast2D.set_enabled */
  final def setEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.ShapeCast2D.mb_set_enabled == null) gdext.classes.ShapeCast2D.mb_set_enabled = MethodBind.get("ShapeCast2D", "set_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.ShapeCast2D.mb_set_enabled, livePtr, enabled)
  }

  /** ShapeCast2D.is_enabled */
  final def isEnabled(): Boolean = {
    if (gdext.classes.ShapeCast2D.mb_is_enabled == null) gdext.classes.ShapeCast2D.mb_is_enabled = MethodBind.get("ShapeCast2D", "is_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.ShapeCast2D.mb_is_enabled, livePtr)
  }

  /** ShapeCast2D.set_shape */
  final def setShape(shape: Shape2D): Unit = {
    if (gdext.classes.ShapeCast2D.mb_set_shape == null) gdext.classes.ShapeCast2D.mb_set_shape = MethodBind.get("ShapeCast2D", "set_shape", 771364740L)
    Ptrcall.callVoid1(gdext.classes.ShapeCast2D.mb_set_shape, livePtr, Wrappers.handle(shape))
  }

  /** ShapeCast2D.get_shape. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getShape(): Shape2D = {
    if (gdext.classes.ShapeCast2D.mb_get_shape == null) gdext.classes.ShapeCast2D.mb_get_shape = MethodBind.get("ShapeCast2D", "get_shape", 522005891L)
    Wrappers.owned[Shape2D](Ptrcall.call0[Long](gdext.classes.ShapeCast2D.mb_get_shape, livePtr))
  }

  /** ShapeCast2D.set_target_position */
  final def setTargetPosition(local_point: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.ShapeCast2D.mb_set_target_position == null) gdext.classes.ShapeCast2D.mb_set_target_position = MethodBind.get("ShapeCast2D", "set_target_position", 743155724L)
    Ptrcall.callVoid1(gdext.classes.ShapeCast2D.mb_set_target_position, livePtr, local_point)
  }

  /** ShapeCast2D.get_target_position */
  final def getTargetPosition(): gdext.builtin.Vector2 = {
    if (gdext.classes.ShapeCast2D.mb_get_target_position == null) gdext.classes.ShapeCast2D.mb_get_target_position = MethodBind.get("ShapeCast2D", "get_target_position", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.ShapeCast2D.mb_get_target_position, livePtr)
  }

  /** ShapeCast2D.set_margin */
  final def setMargin(margin: Double): Unit = {
    if (gdext.classes.ShapeCast2D.mb_set_margin == null) gdext.classes.ShapeCast2D.mb_set_margin = MethodBind.get("ShapeCast2D", "set_margin", 373806689L)
    Ptrcall.callVoid1(gdext.classes.ShapeCast2D.mb_set_margin, livePtr, margin)
  }

  /** ShapeCast2D.get_margin */
  final def getMargin(): Double = {
    if (gdext.classes.ShapeCast2D.mb_get_margin == null) gdext.classes.ShapeCast2D.mb_get_margin = MethodBind.get("ShapeCast2D", "get_margin", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.ShapeCast2D.mb_get_margin, livePtr)
  }

  /** ShapeCast2D.set_max_results */
  final def setMaxResults(max_results: Long): Unit = {
    if (gdext.classes.ShapeCast2D.mb_set_max_results == null) gdext.classes.ShapeCast2D.mb_set_max_results = MethodBind.get("ShapeCast2D", "set_max_results", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.ShapeCast2D.mb_set_max_results, livePtr, max_results)
  }

  /** ShapeCast2D.get_max_results */
  final def getMaxResults(): Long = {
    if (gdext.classes.ShapeCast2D.mb_get_max_results == null) gdext.classes.ShapeCast2D.mb_get_max_results = MethodBind.get("ShapeCast2D", "get_max_results", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.ShapeCast2D.mb_get_max_results, livePtr)
  }

  /** ShapeCast2D.is_colliding */
  final def isColliding(): Boolean = {
    if (gdext.classes.ShapeCast2D.mb_is_colliding == null) gdext.classes.ShapeCast2D.mb_is_colliding = MethodBind.get("ShapeCast2D", "is_colliding", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.ShapeCast2D.mb_is_colliding, livePtr)
  }

  /** ShapeCast2D.get_collision_count */
  final def getCollisionCount(): Long = {
    if (gdext.classes.ShapeCast2D.mb_get_collision_count == null) gdext.classes.ShapeCast2D.mb_get_collision_count = MethodBind.get("ShapeCast2D", "get_collision_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.ShapeCast2D.mb_get_collision_count, livePtr)
  }

  /** ShapeCast2D.force_shapecast_update */
  final def forceShapecastUpdate(): Unit = {
    if (gdext.classes.ShapeCast2D.mb_force_shapecast_update == null) gdext.classes.ShapeCast2D.mb_force_shapecast_update = MethodBind.get("ShapeCast2D", "force_shapecast_update", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.ShapeCast2D.mb_force_shapecast_update, livePtr)
  }

  /** ShapeCast2D.get_collider */
  final def getCollider(index: Long): Object = {
    if (gdext.classes.ShapeCast2D.mb_get_collider == null) gdext.classes.ShapeCast2D.mb_get_collider = MethodBind.get("ShapeCast2D", "get_collider", 3332903315L)
    Wrappers.borrowed[Object](Ptrcall.call1[Long, Long](gdext.classes.ShapeCast2D.mb_get_collider, livePtr, index))
  }

  /** ShapeCast2D.get_collider_shape */
  final def getColliderShape(index: Long): Long = {
    if (gdext.classes.ShapeCast2D.mb_get_collider_shape == null) gdext.classes.ShapeCast2D.mb_get_collider_shape = MethodBind.get("ShapeCast2D", "get_collider_shape", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.ShapeCast2D.mb_get_collider_shape, livePtr, index)
  }

  /** ShapeCast2D.get_collision_point */
  final def getCollisionPoint(index: Long): gdext.builtin.Vector2 = {
    if (gdext.classes.ShapeCast2D.mb_get_collision_point == null) gdext.classes.ShapeCast2D.mb_get_collision_point = MethodBind.get("ShapeCast2D", "get_collision_point", 2299179447L)
    Ptrcall.call1[Long, gdext.builtin.Vector2](gdext.classes.ShapeCast2D.mb_get_collision_point, livePtr, index)
  }

  /** ShapeCast2D.get_collision_normal */
  final def getCollisionNormal(index: Long): gdext.builtin.Vector2 = {
    if (gdext.classes.ShapeCast2D.mb_get_collision_normal == null) gdext.classes.ShapeCast2D.mb_get_collision_normal = MethodBind.get("ShapeCast2D", "get_collision_normal", 2299179447L)
    Ptrcall.call1[Long, gdext.builtin.Vector2](gdext.classes.ShapeCast2D.mb_get_collision_normal, livePtr, index)
  }

  /** ShapeCast2D.get_closest_collision_safe_fraction */
  final def getClosestCollisionSafeFraction(): Double = {
    if (gdext.classes.ShapeCast2D.mb_get_closest_collision_safe_fraction == null) gdext.classes.ShapeCast2D.mb_get_closest_collision_safe_fraction = MethodBind.get("ShapeCast2D", "get_closest_collision_safe_fraction", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.ShapeCast2D.mb_get_closest_collision_safe_fraction, livePtr)
  }

  /** ShapeCast2D.get_closest_collision_unsafe_fraction */
  final def getClosestCollisionUnsafeFraction(): Double = {
    if (gdext.classes.ShapeCast2D.mb_get_closest_collision_unsafe_fraction == null) gdext.classes.ShapeCast2D.mb_get_closest_collision_unsafe_fraction = MethodBind.get("ShapeCast2D", "get_closest_collision_unsafe_fraction", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.ShapeCast2D.mb_get_closest_collision_unsafe_fraction, livePtr)
  }

  /** ShapeCast2D.add_exception */
  final def addException(node: CollisionObject2D): Unit = {
    if (gdext.classes.ShapeCast2D.mb_add_exception == null) gdext.classes.ShapeCast2D.mb_add_exception = MethodBind.get("ShapeCast2D", "add_exception", 3090941106L)
    Ptrcall.callVoid1(gdext.classes.ShapeCast2D.mb_add_exception, livePtr, Wrappers.handle(node))
  }

  /** ShapeCast2D.remove_exception */
  final def removeException(node: CollisionObject2D): Unit = {
    if (gdext.classes.ShapeCast2D.mb_remove_exception == null) gdext.classes.ShapeCast2D.mb_remove_exception = MethodBind.get("ShapeCast2D", "remove_exception", 3090941106L)
    Ptrcall.callVoid1(gdext.classes.ShapeCast2D.mb_remove_exception, livePtr, Wrappers.handle(node))
  }

  /** ShapeCast2D.clear_exceptions */
  final def clearExceptions(): Unit = {
    if (gdext.classes.ShapeCast2D.mb_clear_exceptions == null) gdext.classes.ShapeCast2D.mb_clear_exceptions = MethodBind.get("ShapeCast2D", "clear_exceptions", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.ShapeCast2D.mb_clear_exceptions, livePtr)
  }

  /** ShapeCast2D.set_collision_mask */
  final def setCollisionMask(mask: Long): Unit = {
    if (gdext.classes.ShapeCast2D.mb_set_collision_mask == null) gdext.classes.ShapeCast2D.mb_set_collision_mask = MethodBind.get("ShapeCast2D", "set_collision_mask", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.ShapeCast2D.mb_set_collision_mask, livePtr, mask)
  }

  /** ShapeCast2D.get_collision_mask */
  final def getCollisionMask(): Long = {
    if (gdext.classes.ShapeCast2D.mb_get_collision_mask == null) gdext.classes.ShapeCast2D.mb_get_collision_mask = MethodBind.get("ShapeCast2D", "get_collision_mask", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.ShapeCast2D.mb_get_collision_mask, livePtr)
  }

  /** ShapeCast2D.set_collision_mask_value */
  final def setCollisionMaskValue(layer_number: Long, value: Boolean): Unit = {
    if (gdext.classes.ShapeCast2D.mb_set_collision_mask_value == null) gdext.classes.ShapeCast2D.mb_set_collision_mask_value = MethodBind.get("ShapeCast2D", "set_collision_mask_value", 300928843L)
    Ptrcall.callVoid2(gdext.classes.ShapeCast2D.mb_set_collision_mask_value, livePtr, layer_number, value)
  }

  /** ShapeCast2D.get_collision_mask_value */
  final def getCollisionMaskValue(layer_number: Long): Boolean = {
    if (gdext.classes.ShapeCast2D.mb_get_collision_mask_value == null) gdext.classes.ShapeCast2D.mb_get_collision_mask_value = MethodBind.get("ShapeCast2D", "get_collision_mask_value", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.ShapeCast2D.mb_get_collision_mask_value, livePtr, layer_number)
  }

  /** ShapeCast2D.set_exclude_parent_body */
  final def setExcludeParentBody(mask: Boolean): Unit = {
    if (gdext.classes.ShapeCast2D.mb_set_exclude_parent_body == null) gdext.classes.ShapeCast2D.mb_set_exclude_parent_body = MethodBind.get("ShapeCast2D", "set_exclude_parent_body", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.ShapeCast2D.mb_set_exclude_parent_body, livePtr, mask)
  }

  /** ShapeCast2D.get_exclude_parent_body */
  final def getExcludeParentBody(): Boolean = {
    if (gdext.classes.ShapeCast2D.mb_get_exclude_parent_body == null) gdext.classes.ShapeCast2D.mb_get_exclude_parent_body = MethodBind.get("ShapeCast2D", "get_exclude_parent_body", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.ShapeCast2D.mb_get_exclude_parent_body, livePtr)
  }

  /** ShapeCast2D.set_collide_with_areas */
  final def setCollideWithAreas(enable: Boolean): Unit = {
    if (gdext.classes.ShapeCast2D.mb_set_collide_with_areas == null) gdext.classes.ShapeCast2D.mb_set_collide_with_areas = MethodBind.get("ShapeCast2D", "set_collide_with_areas", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.ShapeCast2D.mb_set_collide_with_areas, livePtr, enable)
  }

  /** ShapeCast2D.is_collide_with_areas_enabled */
  final def isCollideWithAreasEnabled(): Boolean = {
    if (gdext.classes.ShapeCast2D.mb_is_collide_with_areas_enabled == null) gdext.classes.ShapeCast2D.mb_is_collide_with_areas_enabled = MethodBind.get("ShapeCast2D", "is_collide_with_areas_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.ShapeCast2D.mb_is_collide_with_areas_enabled, livePtr)
  }

  /** ShapeCast2D.set_collide_with_bodies */
  final def setCollideWithBodies(enable: Boolean): Unit = {
    if (gdext.classes.ShapeCast2D.mb_set_collide_with_bodies == null) gdext.classes.ShapeCast2D.mb_set_collide_with_bodies = MethodBind.get("ShapeCast2D", "set_collide_with_bodies", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.ShapeCast2D.mb_set_collide_with_bodies, livePtr, enable)
  }

  /** ShapeCast2D.is_collide_with_bodies_enabled */
  final def isCollideWithBodiesEnabled(): Boolean = {
    if (gdext.classes.ShapeCast2D.mb_is_collide_with_bodies_enabled == null) gdext.classes.ShapeCast2D.mb_is_collide_with_bodies_enabled = MethodBind.get("ShapeCast2D", "is_collide_with_bodies_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.ShapeCast2D.mb_is_collide_with_bodies_enabled, livePtr)
  }

}

object ShapeCast2D {
  private[classes] var mb_set_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_shape: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_shape: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_target_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_target_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_margin: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_margin: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_max_results: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_max_results: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_colliding: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collision_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_force_shapecast_update: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collider: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collider_shape: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collision_point: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collision_normal: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_closest_collision_safe_fraction: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_closest_collision_unsafe_fraction: GDExtensionMethodBindPtr = null
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
}
