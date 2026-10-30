package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `PhysicsBody3D`, extends `CollisionObject3D`. */
abstract class PhysicsBody3D extends CollisionObject3D {
  override def godotClassName: String = "PhysicsBody3D"

  /** PhysicsBody3D.move_and_collide. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def moveAndCollide(motion: gdext.builtin.Vector3, testOnly: Boolean = false, safeMargin: Double = 0.001, recoveryAsCollision: Boolean = false, maxCollisions: Long = 1L): KinematicCollision3D = {
    if (gdext.classes.PhysicsBody3D.mb_move_and_collide == null) gdext.classes.PhysicsBody3D.mb_move_and_collide = MethodBind.get("PhysicsBody3D", "move_and_collide", 3208792678L)
    Wrappers.owned[KinematicCollision3D](Ptrcall.call5[gdext.builtin.Vector3, Boolean, Double, Boolean, Long, Long](gdext.classes.PhysicsBody3D.mb_move_and_collide, livePtr, motion, testOnly, safeMargin, recoveryAsCollision, maxCollisions))
  }

  /** PhysicsBody3D.test_move */
  final def testMove(from: gdext.builtin.Transform3D, motion: gdext.builtin.Vector3, collision: KinematicCollision3D = null, safeMargin: Double = 0.001, recoveryAsCollision: Boolean = false, maxCollisions: Long = 1L): Boolean = {
    if (gdext.classes.PhysicsBody3D.mb_test_move == null) gdext.classes.PhysicsBody3D.mb_test_move = MethodBind.get("PhysicsBody3D", "test_move", 2481691619L)
    Ptrcall.call6[gdext.builtin.Transform3D, gdext.builtin.Vector3, GodotObject, Double, Boolean, Long, Boolean](gdext.classes.PhysicsBody3D.mb_test_move, livePtr, from, motion, Wrappers.handle(collision), safeMargin, recoveryAsCollision, maxCollisions)
  }

  /** PhysicsBody3D.get_gravity */
  final def getGravity(): gdext.builtin.Vector3 = {
    if (gdext.classes.PhysicsBody3D.mb_get_gravity == null) gdext.classes.PhysicsBody3D.mb_get_gravity = MethodBind.get("PhysicsBody3D", "get_gravity", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.PhysicsBody3D.mb_get_gravity, livePtr)
  }

  /** PhysicsBody3D.set_axis_lock */
  final def setAxisLock(axis: gdext.classes.PhysicsServer3D.BodyAxis, lock: Boolean): Unit = {
    if (gdext.classes.PhysicsBody3D.mb_set_axis_lock == null) gdext.classes.PhysicsBody3D.mb_set_axis_lock = MethodBind.get("PhysicsBody3D", "set_axis_lock", 1787895195L)
    Ptrcall.callVoid2(gdext.classes.PhysicsBody3D.mb_set_axis_lock, livePtr, axis, lock)
  }

  /** PhysicsBody3D.get_axis_lock */
  final def getAxisLock(axis: gdext.classes.PhysicsServer3D.BodyAxis): Boolean = {
    if (gdext.classes.PhysicsBody3D.mb_get_axis_lock == null) gdext.classes.PhysicsBody3D.mb_get_axis_lock = MethodBind.get("PhysicsBody3D", "get_axis_lock", 2264617709L)
    Ptrcall.call1[Long, Boolean](gdext.classes.PhysicsBody3D.mb_get_axis_lock, livePtr, axis)
  }

  /** PhysicsBody3D.add_collision_exception_with */
  final def addCollisionExceptionWith(body: Node): Unit = {
    if (gdext.classes.PhysicsBody3D.mb_add_collision_exception_with == null) gdext.classes.PhysicsBody3D.mb_add_collision_exception_with = MethodBind.get("PhysicsBody3D", "add_collision_exception_with", 1078189570L)
    Ptrcall.callVoid1(gdext.classes.PhysicsBody3D.mb_add_collision_exception_with, livePtr, Wrappers.handle(body))
  }

  /** PhysicsBody3D.remove_collision_exception_with */
  final def removeCollisionExceptionWith(body: Node): Unit = {
    if (gdext.classes.PhysicsBody3D.mb_remove_collision_exception_with == null) gdext.classes.PhysicsBody3D.mb_remove_collision_exception_with = MethodBind.get("PhysicsBody3D", "remove_collision_exception_with", 1078189570L)
    Ptrcall.callVoid1(gdext.classes.PhysicsBody3D.mb_remove_collision_exception_with, livePtr, Wrappers.handle(body))
  }

}

object PhysicsBody3D {
  private[classes] var mb_move_and_collide: GDExtensionMethodBindPtr = null
  private[classes] var mb_test_move: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_gravity: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_axis_lock: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_axis_lock: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_collision_exception_with: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_collision_exception_with: GDExtensionMethodBindPtr = null
}
