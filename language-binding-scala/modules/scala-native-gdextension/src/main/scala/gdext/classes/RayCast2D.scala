package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `RayCast2D`, extends `Node2D`. */
abstract class RayCast2D extends Node2D {

  /** RayCast2D.set_enabled */
  final def setEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RayCast2D", "set_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** RayCast2D.is_enabled */
  final def isEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RayCast2D", "is_enabled", 36873697L), hostObject.objectPtr)

  /** RayCast2D.set_target_position */
  final def setTargetPosition(local_point: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("RayCast2D", "set_target_position", 743155724L), hostObject.objectPtr, local_point)

  /** RayCast2D.get_target_position */
  final def getTargetPosition(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("RayCast2D", "get_target_position", 3341600327L), hostObject.objectPtr)

  /** RayCast2D.is_colliding */
  final def isColliding(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RayCast2D", "is_colliding", 36873697L), hostObject.objectPtr)

  /** RayCast2D.force_raycast_update */
  final def forceRaycastUpdate(): Unit =
    Ptrcall.callVoid0(MethodBind.get("RayCast2D", "force_raycast_update", 3218959716L), hostObject.objectPtr)

  /** RayCast2D.get_collider */
  final def getCollider(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("RayCast2D", "get_collider", 1981248198L), hostObject.objectPtr)

  /** RayCast2D.get_collider_shape */
  final def getColliderShape(): Long =
    Ptrcall.call0[Long](MethodBind.get("RayCast2D", "get_collider_shape", 3905245786L), hostObject.objectPtr)

  /** RayCast2D.get_collision_point */
  final def getCollisionPoint(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("RayCast2D", "get_collision_point", 3341600327L), hostObject.objectPtr)

  /** RayCast2D.get_collision_normal */
  final def getCollisionNormal(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("RayCast2D", "get_collision_normal", 3341600327L), hostObject.objectPtr)

  /** RayCast2D.add_exception */
  final def addException(node: CollisionObject2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("RayCast2D", "add_exception", 3090941106L), hostObject.objectPtr, node.hostObject)

  /** RayCast2D.remove_exception */
  final def removeException(node: CollisionObject2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("RayCast2D", "remove_exception", 3090941106L), hostObject.objectPtr, node.hostObject)

  /** RayCast2D.clear_exceptions */
  final def clearExceptions(): Unit =
    Ptrcall.callVoid0(MethodBind.get("RayCast2D", "clear_exceptions", 3218959716L), hostObject.objectPtr)

  /** RayCast2D.set_collision_mask */
  final def setCollisionMask(mask: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RayCast2D", "set_collision_mask", 1286410249L), hostObject.objectPtr, mask)

  /** RayCast2D.get_collision_mask */
  final def getCollisionMask(): Long =
    Ptrcall.call0[Long](MethodBind.get("RayCast2D", "get_collision_mask", 3905245786L), hostObject.objectPtr)

  /** RayCast2D.set_collision_mask_value */
  final def setCollisionMaskValue(layer_number: Long, value: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("RayCast2D", "set_collision_mask_value", 300928843L), hostObject.objectPtr, layer_number, value)

  /** RayCast2D.get_collision_mask_value */
  final def getCollisionMaskValue(layer_number: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("RayCast2D", "get_collision_mask_value", 1116898809L), hostObject.objectPtr, layer_number)

  /** RayCast2D.set_exclude_parent_body */
  final def setExcludeParentBody(mask: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RayCast2D", "set_exclude_parent_body", 2586408642L), hostObject.objectPtr, mask)

  /** RayCast2D.get_exclude_parent_body */
  final def getExcludeParentBody(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RayCast2D", "get_exclude_parent_body", 36873697L), hostObject.objectPtr)

  /** RayCast2D.set_collide_with_areas */
  final def setCollideWithAreas(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RayCast2D", "set_collide_with_areas", 2586408642L), hostObject.objectPtr, enable)

  /** RayCast2D.is_collide_with_areas_enabled */
  final def isCollideWithAreasEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RayCast2D", "is_collide_with_areas_enabled", 36873697L), hostObject.objectPtr)

  /** RayCast2D.set_collide_with_bodies */
  final def setCollideWithBodies(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RayCast2D", "set_collide_with_bodies", 2586408642L), hostObject.objectPtr, enable)

  /** RayCast2D.is_collide_with_bodies_enabled */
  final def isCollideWithBodiesEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RayCast2D", "is_collide_with_bodies_enabled", 36873697L), hostObject.objectPtr)

  /** RayCast2D.set_hit_from_inside */
  final def setHitFromInside(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RayCast2D", "set_hit_from_inside", 2586408642L), hostObject.objectPtr, enable)

  /** RayCast2D.is_hit_from_inside_enabled */
  final def isHitFromInsideEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RayCast2D", "is_hit_from_inside_enabled", 36873697L), hostObject.objectPtr)

}

object RayCast2D {
  /** Class metadata for Gd[RayCast2D] lifetime management and casting. */
  given GodotClass[RayCast2D] with {
    def className = "RayCast2D"
    def isRefCounted = false
    def wrap(o: GodotObject): RayCast2D = new RayCast2D {}.withHost(o.objectPtr)
    def unwrap(t: RayCast2D): GodotObject = t.hostObject
  }
}
