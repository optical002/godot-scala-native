package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `PhysicsPointQueryParameters3D`, extends `RefCounted`. */
abstract class PhysicsPointQueryParameters3D extends RefCounted {

  /** PhysicsPointQueryParameters3D.set_position */
  final def setPosition(position: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsPointQueryParameters3D", "set_position", 3460891852L), hostObject.objectPtr, position)

  /** PhysicsPointQueryParameters3D.get_position */
  final def getPosition(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("PhysicsPointQueryParameters3D", "get_position", 3360562783L), hostObject.objectPtr)

  /** PhysicsPointQueryParameters3D.set_collision_mask */
  final def setCollisionMask(collision_mask: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsPointQueryParameters3D", "set_collision_mask", 1286410249L), hostObject.objectPtr, collision_mask)

  /** PhysicsPointQueryParameters3D.get_collision_mask */
  final def getCollisionMask(): Long =
    Ptrcall.call0[Long](MethodBind.get("PhysicsPointQueryParameters3D", "get_collision_mask", 3905245786L), hostObject.objectPtr)

  /** PhysicsPointQueryParameters3D.set_collide_with_bodies */
  final def setCollideWithBodies(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsPointQueryParameters3D", "set_collide_with_bodies", 2586408642L), hostObject.objectPtr, enable)

  /** PhysicsPointQueryParameters3D.is_collide_with_bodies_enabled */
  final def isCollideWithBodiesEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("PhysicsPointQueryParameters3D", "is_collide_with_bodies_enabled", 36873697L), hostObject.objectPtr)

  /** PhysicsPointQueryParameters3D.set_collide_with_areas */
  final def setCollideWithAreas(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsPointQueryParameters3D", "set_collide_with_areas", 2586408642L), hostObject.objectPtr, enable)

  /** PhysicsPointQueryParameters3D.is_collide_with_areas_enabled */
  final def isCollideWithAreasEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("PhysicsPointQueryParameters3D", "is_collide_with_areas_enabled", 36873697L), hostObject.objectPtr)

}

object PhysicsPointQueryParameters3D {
  /** Class metadata for Gd[PhysicsPointQueryParameters3D] lifetime management and casting. */
  given GodotClass[PhysicsPointQueryParameters3D] with {
    def className = "PhysicsPointQueryParameters3D"
    def isRefCounted = true
    def wrap(o: GodotObject): PhysicsPointQueryParameters3D = new PhysicsPointQueryParameters3D {}.withHost(o.objectPtr)
    def unwrap(t: PhysicsPointQueryParameters3D): GodotObject = t.hostObject
  }
}
