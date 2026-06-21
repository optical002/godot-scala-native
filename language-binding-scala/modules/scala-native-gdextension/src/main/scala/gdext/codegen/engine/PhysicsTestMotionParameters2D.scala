package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `PhysicsTestMotionParameters2D`, extends `RefCounted`. */
abstract class PhysicsTestMotionParameters2D extends RefCounted {

  /** PhysicsTestMotionParameters2D.get_from */
  final def getFrom(): gdext.builtin.Transform2D =
    Ptrcall.call0[gdext.builtin.Transform2D](MethodBind.get("PhysicsTestMotionParameters2D", "get_from", 3814499831L), hostObject.objectPtr)

  /** PhysicsTestMotionParameters2D.set_from */
  final def setFrom(from: gdext.builtin.Transform2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsTestMotionParameters2D", "set_from", 2761652528L), hostObject.objectPtr, from)

  /** PhysicsTestMotionParameters2D.get_motion */
  final def getMotion(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("PhysicsTestMotionParameters2D", "get_motion", 3341600327L), hostObject.objectPtr)

  /** PhysicsTestMotionParameters2D.set_motion */
  final def setMotion(motion: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsTestMotionParameters2D", "set_motion", 743155724L), hostObject.objectPtr, motion)

  /** PhysicsTestMotionParameters2D.get_margin */
  final def getMargin(): Double =
    Ptrcall.call0[Double](MethodBind.get("PhysicsTestMotionParameters2D", "get_margin", 1740695150L), hostObject.objectPtr)

  /** PhysicsTestMotionParameters2D.set_margin */
  final def setMargin(margin: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsTestMotionParameters2D", "set_margin", 373806689L), hostObject.objectPtr, margin)

  /** PhysicsTestMotionParameters2D.is_collide_separation_ray_enabled */
  final def isCollideSeparationRayEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("PhysicsTestMotionParameters2D", "is_collide_separation_ray_enabled", 36873697L), hostObject.objectPtr)

  /** PhysicsTestMotionParameters2D.set_collide_separation_ray_enabled */
  final def setCollideSeparationRayEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsTestMotionParameters2D", "set_collide_separation_ray_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** PhysicsTestMotionParameters2D.is_recovery_as_collision_enabled */
  final def isRecoveryAsCollisionEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("PhysicsTestMotionParameters2D", "is_recovery_as_collision_enabled", 36873697L), hostObject.objectPtr)

  /** PhysicsTestMotionParameters2D.set_recovery_as_collision_enabled */
  final def setRecoveryAsCollisionEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsTestMotionParameters2D", "set_recovery_as_collision_enabled", 2586408642L), hostObject.objectPtr, enabled)

}

object PhysicsTestMotionParameters2D {
  /** Class metadata for Gd[PhysicsTestMotionParameters2D] lifetime management and casting. */
  given GodotClass[PhysicsTestMotionParameters2D] with {
    def className = "PhysicsTestMotionParameters2D"
    def isRefCounted = true
    def wrap(o: GodotObject): PhysicsTestMotionParameters2D = new PhysicsTestMotionParameters2D {}.withHost(o.objectPtr)
    def unwrap(t: PhysicsTestMotionParameters2D): GodotObject = t.hostObject
  }
}
