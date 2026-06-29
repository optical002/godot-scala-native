package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `ShapeCast3D`, extends `Node3D`. */
abstract class ShapeCast3D extends Node3D {
  override def godotClassName: String = "ShapeCast3D"

  /** ShapeCast3D.resource_changed */
  final def resourceChanged(resource: Resource): Unit =
    Ptrcall.callVoid1(MethodBind.get("ShapeCast3D", "resource_changed", 968641751L), hostObject.objectPtr, resource.hostObject)

  /** ShapeCast3D.set_enabled */
  final def setEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("ShapeCast3D", "set_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** ShapeCast3D.is_enabled */
  final def isEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("ShapeCast3D", "is_enabled", 36873697L), hostObject.objectPtr)

  /** ShapeCast3D.set_shape */
  final def setShape(shape: Shape3D): Unit =
    Ptrcall.callVoid1(MethodBind.get("ShapeCast3D", "set_shape", 1549710052L), hostObject.objectPtr, shape.hostObject)

  /** ShapeCast3D.get_shape */
  final def getShape(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("ShapeCast3D", "get_shape", 3214262478L), hostObject.objectPtr)

  /** ShapeCast3D.set_target_position */
  final def setTargetPosition(local_point: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("ShapeCast3D", "set_target_position", 3460891852L), hostObject.objectPtr, local_point)

  /** ShapeCast3D.get_target_position */
  final def getTargetPosition(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("ShapeCast3D", "get_target_position", 3360562783L), hostObject.objectPtr)

  /** ShapeCast3D.set_margin */
  final def setMargin(margin: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("ShapeCast3D", "set_margin", 373806689L), hostObject.objectPtr, margin)

  /** ShapeCast3D.get_margin */
  final def getMargin(): Double =
    Ptrcall.call0[Double](MethodBind.get("ShapeCast3D", "get_margin", 1740695150L), hostObject.objectPtr)

  /** ShapeCast3D.set_max_results */
  final def setMaxResults(max_results: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("ShapeCast3D", "set_max_results", 1286410249L), hostObject.objectPtr, max_results)

  /** ShapeCast3D.get_max_results */
  final def getMaxResults(): Long =
    Ptrcall.call0[Long](MethodBind.get("ShapeCast3D", "get_max_results", 3905245786L), hostObject.objectPtr)

  /** ShapeCast3D.is_colliding */
  final def isColliding(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("ShapeCast3D", "is_colliding", 36873697L), hostObject.objectPtr)

  /** ShapeCast3D.get_collision_count */
  final def getCollisionCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("ShapeCast3D", "get_collision_count", 3905245786L), hostObject.objectPtr)

  /** ShapeCast3D.force_shapecast_update */
  final def forceShapecastUpdate(): Unit =
    Ptrcall.callVoid0(MethodBind.get("ShapeCast3D", "force_shapecast_update", 3218959716L), hostObject.objectPtr)

  /** ShapeCast3D.get_collider */
  final def getCollider(index: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("ShapeCast3D", "get_collider", 3332903315L), hostObject.objectPtr, index)

  /** ShapeCast3D.get_collider_shape */
  final def getColliderShape(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("ShapeCast3D", "get_collider_shape", 923996154L), hostObject.objectPtr, index)

  /** ShapeCast3D.get_collision_point */
  final def getCollisionPoint(index: Long): gdext.builtin.Vector3 =
    Ptrcall.call1[Long, gdext.builtin.Vector3](MethodBind.get("ShapeCast3D", "get_collision_point", 711720468L), hostObject.objectPtr, index)

  /** ShapeCast3D.get_collision_normal */
  final def getCollisionNormal(index: Long): gdext.builtin.Vector3 =
    Ptrcall.call1[Long, gdext.builtin.Vector3](MethodBind.get("ShapeCast3D", "get_collision_normal", 711720468L), hostObject.objectPtr, index)

  /** ShapeCast3D.get_closest_collision_safe_fraction */
  final def getClosestCollisionSafeFraction(): Double =
    Ptrcall.call0[Double](MethodBind.get("ShapeCast3D", "get_closest_collision_safe_fraction", 1740695150L), hostObject.objectPtr)

  /** ShapeCast3D.get_closest_collision_unsafe_fraction */
  final def getClosestCollisionUnsafeFraction(): Double =
    Ptrcall.call0[Double](MethodBind.get("ShapeCast3D", "get_closest_collision_unsafe_fraction", 1740695150L), hostObject.objectPtr)

  /** ShapeCast3D.add_exception */
  final def addException(node: CollisionObject3D): Unit =
    Ptrcall.callVoid1(MethodBind.get("ShapeCast3D", "add_exception", 1976431078L), hostObject.objectPtr, node.hostObject)

  /** ShapeCast3D.remove_exception */
  final def removeException(node: CollisionObject3D): Unit =
    Ptrcall.callVoid1(MethodBind.get("ShapeCast3D", "remove_exception", 1976431078L), hostObject.objectPtr, node.hostObject)

  /** ShapeCast3D.clear_exceptions */
  final def clearExceptions(): Unit =
    Ptrcall.callVoid0(MethodBind.get("ShapeCast3D", "clear_exceptions", 3218959716L), hostObject.objectPtr)

  /** ShapeCast3D.set_collision_mask */
  final def setCollisionMask(mask: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("ShapeCast3D", "set_collision_mask", 1286410249L), hostObject.objectPtr, mask)

  /** ShapeCast3D.get_collision_mask */
  final def getCollisionMask(): Long =
    Ptrcall.call0[Long](MethodBind.get("ShapeCast3D", "get_collision_mask", 3905245786L), hostObject.objectPtr)

  /** ShapeCast3D.set_collision_mask_value */
  final def setCollisionMaskValue(layer_number: Long, value: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("ShapeCast3D", "set_collision_mask_value", 300928843L), hostObject.objectPtr, layer_number, value)

  /** ShapeCast3D.get_collision_mask_value */
  final def getCollisionMaskValue(layer_number: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("ShapeCast3D", "get_collision_mask_value", 1116898809L), hostObject.objectPtr, layer_number)

  /** ShapeCast3D.set_exclude_parent_body */
  final def setExcludeParentBody(mask: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("ShapeCast3D", "set_exclude_parent_body", 2586408642L), hostObject.objectPtr, mask)

  /** ShapeCast3D.get_exclude_parent_body */
  final def getExcludeParentBody(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("ShapeCast3D", "get_exclude_parent_body", 36873697L), hostObject.objectPtr)

  /** ShapeCast3D.set_collide_with_areas */
  final def setCollideWithAreas(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("ShapeCast3D", "set_collide_with_areas", 2586408642L), hostObject.objectPtr, enable)

  /** ShapeCast3D.is_collide_with_areas_enabled */
  final def isCollideWithAreasEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("ShapeCast3D", "is_collide_with_areas_enabled", 36873697L), hostObject.objectPtr)

  /** ShapeCast3D.set_collide_with_bodies */
  final def setCollideWithBodies(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("ShapeCast3D", "set_collide_with_bodies", 2586408642L), hostObject.objectPtr, enable)

  /** ShapeCast3D.is_collide_with_bodies_enabled */
  final def isCollideWithBodiesEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("ShapeCast3D", "is_collide_with_bodies_enabled", 36873697L), hostObject.objectPtr)

  /** ShapeCast3D.set_debug_shape_custom_color */
  final def setDebugShapeCustomColor(debug_shape_custom_color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("ShapeCast3D", "set_debug_shape_custom_color", 2920490490L), hostObject.objectPtr, debug_shape_custom_color)

  /** ShapeCast3D.get_debug_shape_custom_color */
  final def getDebugShapeCustomColor(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("ShapeCast3D", "get_debug_shape_custom_color", 3444240500L), hostObject.objectPtr)

}
