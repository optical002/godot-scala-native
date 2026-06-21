package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `PhysicsRayQueryParameters2D`, extends `RefCounted`. */
abstract class PhysicsRayQueryParameters2D extends RefCounted {

  /** PhysicsRayQueryParameters2D.set_from */
  final def setFrom(from: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsRayQueryParameters2D", "set_from", 743155724L), hostObject.objectPtr, from)

  /** PhysicsRayQueryParameters2D.get_from */
  final def getFrom(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("PhysicsRayQueryParameters2D", "get_from", 3341600327L), hostObject.objectPtr)

  /** PhysicsRayQueryParameters2D.set_to */
  final def setTo(to: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsRayQueryParameters2D", "set_to", 743155724L), hostObject.objectPtr, to)

  /** PhysicsRayQueryParameters2D.get_to */
  final def getTo(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("PhysicsRayQueryParameters2D", "get_to", 3341600327L), hostObject.objectPtr)

  /** PhysicsRayQueryParameters2D.set_collision_mask */
  final def setCollisionMask(collision_mask: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsRayQueryParameters2D", "set_collision_mask", 1286410249L), hostObject.objectPtr, collision_mask)

  /** PhysicsRayQueryParameters2D.get_collision_mask */
  final def getCollisionMask(): Long =
    Ptrcall.call0[Long](MethodBind.get("PhysicsRayQueryParameters2D", "get_collision_mask", 3905245786L), hostObject.objectPtr)

  /** PhysicsRayQueryParameters2D.set_collide_with_bodies */
  final def setCollideWithBodies(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsRayQueryParameters2D", "set_collide_with_bodies", 2586408642L), hostObject.objectPtr, enable)

  /** PhysicsRayQueryParameters2D.is_collide_with_bodies_enabled */
  final def isCollideWithBodiesEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("PhysicsRayQueryParameters2D", "is_collide_with_bodies_enabled", 36873697L), hostObject.objectPtr)

  /** PhysicsRayQueryParameters2D.set_collide_with_areas */
  final def setCollideWithAreas(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsRayQueryParameters2D", "set_collide_with_areas", 2586408642L), hostObject.objectPtr, enable)

  /** PhysicsRayQueryParameters2D.is_collide_with_areas_enabled */
  final def isCollideWithAreasEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("PhysicsRayQueryParameters2D", "is_collide_with_areas_enabled", 36873697L), hostObject.objectPtr)

  /** PhysicsRayQueryParameters2D.set_hit_from_inside */
  final def setHitFromInside(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsRayQueryParameters2D", "set_hit_from_inside", 2586408642L), hostObject.objectPtr, enable)

  /** PhysicsRayQueryParameters2D.is_hit_from_inside_enabled */
  final def isHitFromInsideEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("PhysicsRayQueryParameters2D", "is_hit_from_inside_enabled", 36873697L), hostObject.objectPtr)

}

object PhysicsRayQueryParameters2D {
  /** Class metadata for Gd[PhysicsRayQueryParameters2D] lifetime management and casting. */
  given GodotClass[PhysicsRayQueryParameters2D] with {
    def className = "PhysicsRayQueryParameters2D"
    def isRefCounted = true
    def wrap(o: GodotObject): PhysicsRayQueryParameters2D = new PhysicsRayQueryParameters2D {}.withHost(o.objectPtr)
    def unwrap(t: PhysicsRayQueryParameters2D): GodotObject = t.hostObject
  }
}
