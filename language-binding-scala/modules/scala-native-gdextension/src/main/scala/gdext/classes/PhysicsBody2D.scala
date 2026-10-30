package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `PhysicsBody2D`, extends `CollisionObject2D`. */
abstract class PhysicsBody2D extends CollisionObject2D {
  override def godotClassName: String = "PhysicsBody2D"

  /** PhysicsBody2D.move_and_collide. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def moveAndCollide(motion: gdext.builtin.Vector2, testOnly: Boolean = false, safeMargin: Double = 0.08, recoveryAsCollision: Boolean = false): KinematicCollision2D = {
    if (gdext.classes.PhysicsBody2D.mb_move_and_collide == null) gdext.classes.PhysicsBody2D.mb_move_and_collide = MethodBind.get("PhysicsBody2D", "move_and_collide", 3681923724L)
    Wrappers.owned[KinematicCollision2D](Ptrcall.call4[gdext.builtin.Vector2, Boolean, Double, Boolean, Long](gdext.classes.PhysicsBody2D.mb_move_and_collide, livePtr, motion, testOnly, safeMargin, recoveryAsCollision))
  }

  /** PhysicsBody2D.test_move */
  final def testMove(from: gdext.builtin.Transform2D, motion: gdext.builtin.Vector2, collision: KinematicCollision2D = null, safeMargin: Double = 0.08, recoveryAsCollision: Boolean = false): Boolean = {
    if (gdext.classes.PhysicsBody2D.mb_test_move == null) gdext.classes.PhysicsBody2D.mb_test_move = MethodBind.get("PhysicsBody2D", "test_move", 3324464701L)
    Ptrcall.call5[gdext.builtin.Transform2D, gdext.builtin.Vector2, GodotObject, Double, Boolean, Boolean](gdext.classes.PhysicsBody2D.mb_test_move, livePtr, from, motion, Wrappers.handle(collision), safeMargin, recoveryAsCollision)
  }

  /** PhysicsBody2D.get_gravity */
  final def getGravity(): gdext.builtin.Vector2 = {
    if (gdext.classes.PhysicsBody2D.mb_get_gravity == null) gdext.classes.PhysicsBody2D.mb_get_gravity = MethodBind.get("PhysicsBody2D", "get_gravity", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.PhysicsBody2D.mb_get_gravity, livePtr)
  }

  /** PhysicsBody2D.add_collision_exception_with */
  final def addCollisionExceptionWith(body: Node): Unit = {
    if (gdext.classes.PhysicsBody2D.mb_add_collision_exception_with == null) gdext.classes.PhysicsBody2D.mb_add_collision_exception_with = MethodBind.get("PhysicsBody2D", "add_collision_exception_with", 1078189570L)
    Ptrcall.callVoid1(gdext.classes.PhysicsBody2D.mb_add_collision_exception_with, livePtr, Wrappers.handle(body))
  }

  /** PhysicsBody2D.remove_collision_exception_with */
  final def removeCollisionExceptionWith(body: Node): Unit = {
    if (gdext.classes.PhysicsBody2D.mb_remove_collision_exception_with == null) gdext.classes.PhysicsBody2D.mb_remove_collision_exception_with = MethodBind.get("PhysicsBody2D", "remove_collision_exception_with", 1078189570L)
    Ptrcall.callVoid1(gdext.classes.PhysicsBody2D.mb_remove_collision_exception_with, livePtr, Wrappers.handle(body))
  }

}

object PhysicsBody2D {
  private[classes] var mb_move_and_collide: GDExtensionMethodBindPtr = null
  private[classes] var mb_test_move: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_gravity: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_collision_exception_with: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_collision_exception_with: GDExtensionMethodBindPtr = null
}
