package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `PhysicsRayQueryParameters3D`, extends `RefCounted`. */
abstract class PhysicsRayQueryParameters3D extends RefCounted {

  /** PhysicsRayQueryParameters3D.set_from */
  final def setFrom(from: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsRayQueryParameters3D", "set_from", 3460891852L), hostObject.objectPtr, from)

  /** PhysicsRayQueryParameters3D.get_from */
  final def getFrom(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("PhysicsRayQueryParameters3D", "get_from", 3360562783L), hostObject.objectPtr)

  /** PhysicsRayQueryParameters3D.set_to */
  final def setTo(to: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsRayQueryParameters3D", "set_to", 3460891852L), hostObject.objectPtr, to)

  /** PhysicsRayQueryParameters3D.get_to */
  final def getTo(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("PhysicsRayQueryParameters3D", "get_to", 3360562783L), hostObject.objectPtr)

  /** PhysicsRayQueryParameters3D.set_collision_mask */
  final def setCollisionMask(collision_mask: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsRayQueryParameters3D", "set_collision_mask", 1286410249L), hostObject.objectPtr, collision_mask)

  /** PhysicsRayQueryParameters3D.get_collision_mask */
  final def getCollisionMask(): Long =
    Ptrcall.call0[Long](MethodBind.get("PhysicsRayQueryParameters3D", "get_collision_mask", 3905245786L), hostObject.objectPtr)

  /** PhysicsRayQueryParameters3D.set_collide_with_bodies */
  final def setCollideWithBodies(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsRayQueryParameters3D", "set_collide_with_bodies", 2586408642L), hostObject.objectPtr, enable)

  /** PhysicsRayQueryParameters3D.is_collide_with_bodies_enabled */
  final def isCollideWithBodiesEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("PhysicsRayQueryParameters3D", "is_collide_with_bodies_enabled", 36873697L), hostObject.objectPtr)

  /** PhysicsRayQueryParameters3D.set_collide_with_areas */
  final def setCollideWithAreas(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsRayQueryParameters3D", "set_collide_with_areas", 2586408642L), hostObject.objectPtr, enable)

  /** PhysicsRayQueryParameters3D.is_collide_with_areas_enabled */
  final def isCollideWithAreasEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("PhysicsRayQueryParameters3D", "is_collide_with_areas_enabled", 36873697L), hostObject.objectPtr)

  /** PhysicsRayQueryParameters3D.set_hit_from_inside */
  final def setHitFromInside(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsRayQueryParameters3D", "set_hit_from_inside", 2586408642L), hostObject.objectPtr, enable)

  /** PhysicsRayQueryParameters3D.is_hit_from_inside_enabled */
  final def isHitFromInsideEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("PhysicsRayQueryParameters3D", "is_hit_from_inside_enabled", 36873697L), hostObject.objectPtr)

  /** PhysicsRayQueryParameters3D.set_hit_back_faces */
  final def setHitBackFaces(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsRayQueryParameters3D", "set_hit_back_faces", 2586408642L), hostObject.objectPtr, enable)

  /** PhysicsRayQueryParameters3D.is_hit_back_faces_enabled */
  final def isHitBackFacesEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("PhysicsRayQueryParameters3D", "is_hit_back_faces_enabled", 36873697L), hostObject.objectPtr)

}

object PhysicsRayQueryParameters3D {
  /** Class metadata for Gd[PhysicsRayQueryParameters3D] lifetime management and casting. */
  given GodotClass[PhysicsRayQueryParameters3D] with {
    def className = "PhysicsRayQueryParameters3D"
    def isRefCounted = true
    def wrap(o: GodotObject): PhysicsRayQueryParameters3D = new PhysicsRayQueryParameters3D {}.withHost(o.objectPtr)
    def unwrap(t: PhysicsRayQueryParameters3D): GodotObject = t.hostObject
  }
}
