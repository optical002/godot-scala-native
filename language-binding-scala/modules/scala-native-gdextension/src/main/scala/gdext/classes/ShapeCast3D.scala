package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `ShapeCast3D`, extends `Node3D`. */
abstract class ShapeCast3D extends Node3D {
  override def godotClassName: String = "ShapeCast3D"

  /** ShapeCast3D.resource_changed */
  final def resourceChanged(resource: Resource): Unit = {
    if (gdext.classes.ShapeCast3D.mb_resource_changed == null) gdext.classes.ShapeCast3D.mb_resource_changed = MethodBind.get("ShapeCast3D", "resource_changed", 968641751L)
    Ptrcall.callVoid1(gdext.classes.ShapeCast3D.mb_resource_changed, livePtr, Wrappers.handle(resource))
  }

  /** ShapeCast3D.set_enabled */
  final def setEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.ShapeCast3D.mb_set_enabled == null) gdext.classes.ShapeCast3D.mb_set_enabled = MethodBind.get("ShapeCast3D", "set_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.ShapeCast3D.mb_set_enabled, livePtr, enabled)
  }

  /** ShapeCast3D.is_enabled */
  final def isEnabled(): Boolean = {
    if (gdext.classes.ShapeCast3D.mb_is_enabled == null) gdext.classes.ShapeCast3D.mb_is_enabled = MethodBind.get("ShapeCast3D", "is_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.ShapeCast3D.mb_is_enabled, livePtr)
  }

  /** ShapeCast3D.set_shape */
  final def setShape(shape: Shape3D): Unit = {
    if (gdext.classes.ShapeCast3D.mb_set_shape == null) gdext.classes.ShapeCast3D.mb_set_shape = MethodBind.get("ShapeCast3D", "set_shape", 1549710052L)
    Ptrcall.callVoid1(gdext.classes.ShapeCast3D.mb_set_shape, livePtr, Wrappers.handle(shape))
  }

  /** ShapeCast3D.get_shape. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getShape(): Shape3D = {
    if (gdext.classes.ShapeCast3D.mb_get_shape == null) gdext.classes.ShapeCast3D.mb_get_shape = MethodBind.get("ShapeCast3D", "get_shape", 3214262478L)
    Wrappers.owned[Shape3D](Ptrcall.call0[Long](gdext.classes.ShapeCast3D.mb_get_shape, livePtr))
  }

  /** ShapeCast3D.set_target_position */
  final def setTargetPosition(localPoint: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.ShapeCast3D.mb_set_target_position == null) gdext.classes.ShapeCast3D.mb_set_target_position = MethodBind.get("ShapeCast3D", "set_target_position", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.ShapeCast3D.mb_set_target_position, livePtr, localPoint)
  }

  /** ShapeCast3D.get_target_position */
  final def getTargetPosition(): gdext.builtin.Vector3 = {
    if (gdext.classes.ShapeCast3D.mb_get_target_position == null) gdext.classes.ShapeCast3D.mb_get_target_position = MethodBind.get("ShapeCast3D", "get_target_position", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.ShapeCast3D.mb_get_target_position, livePtr)
  }

  /** ShapeCast3D.set_margin */
  final def setMargin(margin: Double): Unit = {
    if (gdext.classes.ShapeCast3D.mb_set_margin == null) gdext.classes.ShapeCast3D.mb_set_margin = MethodBind.get("ShapeCast3D", "set_margin", 373806689L)
    Ptrcall.callVoid1(gdext.classes.ShapeCast3D.mb_set_margin, livePtr, margin)
  }

  /** ShapeCast3D.get_margin */
  final def getMargin(): Double = {
    if (gdext.classes.ShapeCast3D.mb_get_margin == null) gdext.classes.ShapeCast3D.mb_get_margin = MethodBind.get("ShapeCast3D", "get_margin", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.ShapeCast3D.mb_get_margin, livePtr)
  }

  /** ShapeCast3D.set_max_results */
  final def setMaxResults(maxResults: Long): Unit = {
    if (gdext.classes.ShapeCast3D.mb_set_max_results == null) gdext.classes.ShapeCast3D.mb_set_max_results = MethodBind.get("ShapeCast3D", "set_max_results", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.ShapeCast3D.mb_set_max_results, livePtr, maxResults)
  }

  /** ShapeCast3D.get_max_results */
  final def getMaxResults(): Long = {
    if (gdext.classes.ShapeCast3D.mb_get_max_results == null) gdext.classes.ShapeCast3D.mb_get_max_results = MethodBind.get("ShapeCast3D", "get_max_results", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.ShapeCast3D.mb_get_max_results, livePtr)
  }

  /** ShapeCast3D.is_colliding */
  final def isColliding(): Boolean = {
    if (gdext.classes.ShapeCast3D.mb_is_colliding == null) gdext.classes.ShapeCast3D.mb_is_colliding = MethodBind.get("ShapeCast3D", "is_colliding", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.ShapeCast3D.mb_is_colliding, livePtr)
  }

  /** ShapeCast3D.get_collision_count */
  final def getCollisionCount(): Long = {
    if (gdext.classes.ShapeCast3D.mb_get_collision_count == null) gdext.classes.ShapeCast3D.mb_get_collision_count = MethodBind.get("ShapeCast3D", "get_collision_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.ShapeCast3D.mb_get_collision_count, livePtr)
  }

  /** ShapeCast3D.force_shapecast_update */
  final def forceShapecastUpdate(): Unit = {
    if (gdext.classes.ShapeCast3D.mb_force_shapecast_update == null) gdext.classes.ShapeCast3D.mb_force_shapecast_update = MethodBind.get("ShapeCast3D", "force_shapecast_update", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.ShapeCast3D.mb_force_shapecast_update, livePtr)
  }

  /** ShapeCast3D.get_collider */
  final def getCollider(index: Long): Object = {
    if (gdext.classes.ShapeCast3D.mb_get_collider == null) gdext.classes.ShapeCast3D.mb_get_collider = MethodBind.get("ShapeCast3D", "get_collider", 3332903315L)
    Wrappers.borrowed[Object](Ptrcall.call1[Long, Long](gdext.classes.ShapeCast3D.mb_get_collider, livePtr, index))
  }

  /** ShapeCast3D.get_collider_shape */
  final def getColliderShape(index: Long): Long = {
    if (gdext.classes.ShapeCast3D.mb_get_collider_shape == null) gdext.classes.ShapeCast3D.mb_get_collider_shape = MethodBind.get("ShapeCast3D", "get_collider_shape", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.ShapeCast3D.mb_get_collider_shape, livePtr, index)
  }

  /** ShapeCast3D.get_collision_point */
  final def getCollisionPoint(index: Long): gdext.builtin.Vector3 = {
    if (gdext.classes.ShapeCast3D.mb_get_collision_point == null) gdext.classes.ShapeCast3D.mb_get_collision_point = MethodBind.get("ShapeCast3D", "get_collision_point", 711720468L)
    Ptrcall.call1[Long, gdext.builtin.Vector3](gdext.classes.ShapeCast3D.mb_get_collision_point, livePtr, index)
  }

  /** ShapeCast3D.get_collision_normal */
  final def getCollisionNormal(index: Long): gdext.builtin.Vector3 = {
    if (gdext.classes.ShapeCast3D.mb_get_collision_normal == null) gdext.classes.ShapeCast3D.mb_get_collision_normal = MethodBind.get("ShapeCast3D", "get_collision_normal", 711720468L)
    Ptrcall.call1[Long, gdext.builtin.Vector3](gdext.classes.ShapeCast3D.mb_get_collision_normal, livePtr, index)
  }

  /** ShapeCast3D.get_closest_collision_safe_fraction */
  final def getClosestCollisionSafeFraction(): Double = {
    if (gdext.classes.ShapeCast3D.mb_get_closest_collision_safe_fraction == null) gdext.classes.ShapeCast3D.mb_get_closest_collision_safe_fraction = MethodBind.get("ShapeCast3D", "get_closest_collision_safe_fraction", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.ShapeCast3D.mb_get_closest_collision_safe_fraction, livePtr)
  }

  /** ShapeCast3D.get_closest_collision_unsafe_fraction */
  final def getClosestCollisionUnsafeFraction(): Double = {
    if (gdext.classes.ShapeCast3D.mb_get_closest_collision_unsafe_fraction == null) gdext.classes.ShapeCast3D.mb_get_closest_collision_unsafe_fraction = MethodBind.get("ShapeCast3D", "get_closest_collision_unsafe_fraction", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.ShapeCast3D.mb_get_closest_collision_unsafe_fraction, livePtr)
  }

  /** ShapeCast3D.add_exception */
  final def addException(node: CollisionObject3D): Unit = {
    if (gdext.classes.ShapeCast3D.mb_add_exception == null) gdext.classes.ShapeCast3D.mb_add_exception = MethodBind.get("ShapeCast3D", "add_exception", 1976431078L)
    Ptrcall.callVoid1(gdext.classes.ShapeCast3D.mb_add_exception, livePtr, Wrappers.handle(node))
  }

  /** ShapeCast3D.remove_exception */
  final def removeException(node: CollisionObject3D): Unit = {
    if (gdext.classes.ShapeCast3D.mb_remove_exception == null) gdext.classes.ShapeCast3D.mb_remove_exception = MethodBind.get("ShapeCast3D", "remove_exception", 1976431078L)
    Ptrcall.callVoid1(gdext.classes.ShapeCast3D.mb_remove_exception, livePtr, Wrappers.handle(node))
  }

  /** ShapeCast3D.clear_exceptions */
  final def clearExceptions(): Unit = {
    if (gdext.classes.ShapeCast3D.mb_clear_exceptions == null) gdext.classes.ShapeCast3D.mb_clear_exceptions = MethodBind.get("ShapeCast3D", "clear_exceptions", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.ShapeCast3D.mb_clear_exceptions, livePtr)
  }

  /** ShapeCast3D.set_collision_mask */
  final def setCollisionMask(mask: Long): Unit = {
    if (gdext.classes.ShapeCast3D.mb_set_collision_mask == null) gdext.classes.ShapeCast3D.mb_set_collision_mask = MethodBind.get("ShapeCast3D", "set_collision_mask", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.ShapeCast3D.mb_set_collision_mask, livePtr, mask)
  }

  /** ShapeCast3D.get_collision_mask */
  final def getCollisionMask(): Long = {
    if (gdext.classes.ShapeCast3D.mb_get_collision_mask == null) gdext.classes.ShapeCast3D.mb_get_collision_mask = MethodBind.get("ShapeCast3D", "get_collision_mask", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.ShapeCast3D.mb_get_collision_mask, livePtr)
  }

  /** ShapeCast3D.set_collision_mask_value */
  final def setCollisionMaskValue(layerNumber: Long, value: Boolean): Unit = {
    if (gdext.classes.ShapeCast3D.mb_set_collision_mask_value == null) gdext.classes.ShapeCast3D.mb_set_collision_mask_value = MethodBind.get("ShapeCast3D", "set_collision_mask_value", 300928843L)
    Ptrcall.callVoid2(gdext.classes.ShapeCast3D.mb_set_collision_mask_value, livePtr, layerNumber, value)
  }

  /** ShapeCast3D.get_collision_mask_value */
  final def getCollisionMaskValue(layerNumber: Long): Boolean = {
    if (gdext.classes.ShapeCast3D.mb_get_collision_mask_value == null) gdext.classes.ShapeCast3D.mb_get_collision_mask_value = MethodBind.get("ShapeCast3D", "get_collision_mask_value", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.ShapeCast3D.mb_get_collision_mask_value, livePtr, layerNumber)
  }

  /** ShapeCast3D.set_exclude_parent_body */
  final def setExcludeParentBody(mask: Boolean): Unit = {
    if (gdext.classes.ShapeCast3D.mb_set_exclude_parent_body == null) gdext.classes.ShapeCast3D.mb_set_exclude_parent_body = MethodBind.get("ShapeCast3D", "set_exclude_parent_body", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.ShapeCast3D.mb_set_exclude_parent_body, livePtr, mask)
  }

  /** ShapeCast3D.get_exclude_parent_body */
  final def getExcludeParentBody(): Boolean = {
    if (gdext.classes.ShapeCast3D.mb_get_exclude_parent_body == null) gdext.classes.ShapeCast3D.mb_get_exclude_parent_body = MethodBind.get("ShapeCast3D", "get_exclude_parent_body", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.ShapeCast3D.mb_get_exclude_parent_body, livePtr)
  }

  /** ShapeCast3D.set_collide_with_areas */
  final def setCollideWithAreas(enable: Boolean): Unit = {
    if (gdext.classes.ShapeCast3D.mb_set_collide_with_areas == null) gdext.classes.ShapeCast3D.mb_set_collide_with_areas = MethodBind.get("ShapeCast3D", "set_collide_with_areas", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.ShapeCast3D.mb_set_collide_with_areas, livePtr, enable)
  }

  /** ShapeCast3D.is_collide_with_areas_enabled */
  final def isCollideWithAreasEnabled(): Boolean = {
    if (gdext.classes.ShapeCast3D.mb_is_collide_with_areas_enabled == null) gdext.classes.ShapeCast3D.mb_is_collide_with_areas_enabled = MethodBind.get("ShapeCast3D", "is_collide_with_areas_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.ShapeCast3D.mb_is_collide_with_areas_enabled, livePtr)
  }

  /** ShapeCast3D.set_collide_with_bodies */
  final def setCollideWithBodies(enable: Boolean): Unit = {
    if (gdext.classes.ShapeCast3D.mb_set_collide_with_bodies == null) gdext.classes.ShapeCast3D.mb_set_collide_with_bodies = MethodBind.get("ShapeCast3D", "set_collide_with_bodies", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.ShapeCast3D.mb_set_collide_with_bodies, livePtr, enable)
  }

  /** ShapeCast3D.is_collide_with_bodies_enabled */
  final def isCollideWithBodiesEnabled(): Boolean = {
    if (gdext.classes.ShapeCast3D.mb_is_collide_with_bodies_enabled == null) gdext.classes.ShapeCast3D.mb_is_collide_with_bodies_enabled = MethodBind.get("ShapeCast3D", "is_collide_with_bodies_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.ShapeCast3D.mb_is_collide_with_bodies_enabled, livePtr)
  }

  /** ShapeCast3D.set_debug_shape_custom_color */
  final def setDebugShapeCustomColor(debugShapeCustomColor: gdext.builtin.Color): Unit = {
    if (gdext.classes.ShapeCast3D.mb_set_debug_shape_custom_color == null) gdext.classes.ShapeCast3D.mb_set_debug_shape_custom_color = MethodBind.get("ShapeCast3D", "set_debug_shape_custom_color", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.ShapeCast3D.mb_set_debug_shape_custom_color, livePtr, debugShapeCustomColor)
  }

  /** ShapeCast3D.get_debug_shape_custom_color */
  final def getDebugShapeCustomColor(): gdext.builtin.Color = {
    if (gdext.classes.ShapeCast3D.mb_get_debug_shape_custom_color == null) gdext.classes.ShapeCast3D.mb_get_debug_shape_custom_color = MethodBind.get("ShapeCast3D", "get_debug_shape_custom_color", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.ShapeCast3D.mb_get_debug_shape_custom_color, livePtr)
  }

}

object ShapeCast3D {
  private[classes] var mb_resource_changed: GDExtensionMethodBindPtr = null
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
  private[classes] var mb_set_debug_shape_custom_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_debug_shape_custom_color: GDExtensionMethodBindPtr = null
}
