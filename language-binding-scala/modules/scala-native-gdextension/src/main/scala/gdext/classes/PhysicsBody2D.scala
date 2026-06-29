package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `PhysicsBody2D`, extends `CollisionObject2D`. */
abstract class PhysicsBody2D extends CollisionObject2D {
  override def godotClassName: String = "PhysicsBody2D"

  /** PhysicsBody2D.move_and_collide */
  final def moveAndCollide(motion: gdext.builtin.Vector2, test_only: Boolean, safe_margin: Double, recovery_as_collision: Boolean): GodotObject =
    Ptrcall.call4[gdext.builtin.Vector2, Boolean, Double, Boolean, GodotObject](MethodBind.get("PhysicsBody2D", "move_and_collide", 3681923724L), hostObject.objectPtr, motion, test_only, safe_margin, recovery_as_collision)

  /** PhysicsBody2D.test_move */
  final def testMove(from: gdext.builtin.Transform2D, motion: gdext.builtin.Vector2, collision: KinematicCollision2D, safe_margin: Double, recovery_as_collision: Boolean): Boolean =
    Ptrcall.call5[gdext.builtin.Transform2D, gdext.builtin.Vector2, GodotObject, Double, Boolean, Boolean](MethodBind.get("PhysicsBody2D", "test_move", 3324464701L), hostObject.objectPtr, from, motion, collision.hostObject, safe_margin, recovery_as_collision)

  /** PhysicsBody2D.get_gravity */
  final def getGravity(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("PhysicsBody2D", "get_gravity", 3341600327L), hostObject.objectPtr)

  /** PhysicsBody2D.add_collision_exception_with */
  final def addCollisionExceptionWith(body: Node): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsBody2D", "add_collision_exception_with", 1078189570L), hostObject.objectPtr, body.hostObject)

  /** PhysicsBody2D.remove_collision_exception_with */
  final def removeCollisionExceptionWith(body: Node): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsBody2D", "remove_collision_exception_with", 1078189570L), hostObject.objectPtr, body.hostObject)

}
