package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `PhysicsBody3D`, extends `CollisionObject3D`. */
abstract class PhysicsBody3D extends CollisionObject3D {

  /** PhysicsBody3D.move_and_collide */
  final def moveAndCollide(motion: gdext.builtin.Vector3, test_only: Boolean, safe_margin: Double, recovery_as_collision: Boolean, max_collisions: Long): GodotObject =
    Ptrcall.call5[gdext.builtin.Vector3, Boolean, Double, Boolean, Long, GodotObject](MethodBind.get("PhysicsBody3D", "move_and_collide", 3208792678L), hostObject.objectPtr, motion, test_only, safe_margin, recovery_as_collision, max_collisions)

  /** PhysicsBody3D.test_move */
  final def testMove(from: gdext.builtin.Transform3D, motion: gdext.builtin.Vector3, collision: KinematicCollision3D, safe_margin: Double, recovery_as_collision: Boolean, max_collisions: Long): Boolean =
    Ptrcall.call6[gdext.builtin.Transform3D, gdext.builtin.Vector3, GodotObject, Double, Boolean, Long, Boolean](MethodBind.get("PhysicsBody3D", "test_move", 2481691619L), hostObject.objectPtr, from, motion, collision.hostObject, safe_margin, recovery_as_collision, max_collisions)

  /** PhysicsBody3D.get_gravity */
  final def getGravity(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("PhysicsBody3D", "get_gravity", 3360562783L), hostObject.objectPtr)

  /** PhysicsBody3D.set_axis_lock */
  final def setAxisLock(axis: Long, lock: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("PhysicsBody3D", "set_axis_lock", 1787895195L), hostObject.objectPtr, axis, lock)

  /** PhysicsBody3D.get_axis_lock */
  final def getAxisLock(axis: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("PhysicsBody3D", "get_axis_lock", 2264617709L), hostObject.objectPtr, axis)

  /** PhysicsBody3D.add_collision_exception_with */
  final def addCollisionExceptionWith(body: Node): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsBody3D", "add_collision_exception_with", 1078189570L), hostObject.objectPtr, body.hostObject)

  /** PhysicsBody3D.remove_collision_exception_with */
  final def removeCollisionExceptionWith(body: Node): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsBody3D", "remove_collision_exception_with", 1078189570L), hostObject.objectPtr, body.hostObject)

}

object PhysicsBody3D {
  /** Class metadata for Gd[PhysicsBody3D] lifetime management and casting. */
  given GodotClass[PhysicsBody3D] with {
    def className = "PhysicsBody3D"
    def isRefCounted = false
    def wrap(o: GodotObject): PhysicsBody3D = new PhysicsBody3D {}.withHost(o.objectPtr)
    def unwrap(t: PhysicsBody3D): GodotObject = t.hostObject
  }
}
