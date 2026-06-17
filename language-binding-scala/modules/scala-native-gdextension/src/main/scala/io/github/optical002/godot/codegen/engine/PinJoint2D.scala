package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `PinJoint2D`, extends `Joint2D`. */
abstract class PinJoint2D extends Joint2D {

  /** PinJoint2D.set_softness */
  final def setSoftness(softness: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("PinJoint2D", "set_softness", 373806689L), hostObject.objectPtr, softness)

  /** PinJoint2D.get_softness */
  final def getSoftness(): Double =
    Ptrcall.call0[Double](MethodBind.get("PinJoint2D", "get_softness", 1740695150L), hostObject.objectPtr)

  /** PinJoint2D.set_angular_limit_lower */
  final def setAngularLimitLower(angular_limit_lower: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("PinJoint2D", "set_angular_limit_lower", 373806689L), hostObject.objectPtr, angular_limit_lower)

  /** PinJoint2D.get_angular_limit_lower */
  final def getAngularLimitLower(): Double =
    Ptrcall.call0[Double](MethodBind.get("PinJoint2D", "get_angular_limit_lower", 1740695150L), hostObject.objectPtr)

  /** PinJoint2D.set_angular_limit_upper */
  final def setAngularLimitUpper(angular_limit_upper: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("PinJoint2D", "set_angular_limit_upper", 373806689L), hostObject.objectPtr, angular_limit_upper)

  /** PinJoint2D.get_angular_limit_upper */
  final def getAngularLimitUpper(): Double =
    Ptrcall.call0[Double](MethodBind.get("PinJoint2D", "get_angular_limit_upper", 1740695150L), hostObject.objectPtr)

  /** PinJoint2D.set_motor_target_velocity */
  final def setMotorTargetVelocity(motor_target_velocity: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("PinJoint2D", "set_motor_target_velocity", 373806689L), hostObject.objectPtr, motor_target_velocity)

  /** PinJoint2D.get_motor_target_velocity */
  final def getMotorTargetVelocity(): Double =
    Ptrcall.call0[Double](MethodBind.get("PinJoint2D", "get_motor_target_velocity", 1740695150L), hostObject.objectPtr)

  /** PinJoint2D.set_motor_enabled */
  final def setMotorEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("PinJoint2D", "set_motor_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** PinJoint2D.is_motor_enabled */
  final def isMotorEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("PinJoint2D", "is_motor_enabled", 36873697L), hostObject.objectPtr)

  /** PinJoint2D.set_angular_limit_enabled */
  final def setAngularLimitEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("PinJoint2D", "set_angular_limit_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** PinJoint2D.is_angular_limit_enabled */
  final def isAngularLimitEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("PinJoint2D", "is_angular_limit_enabled", 36873697L), hostObject.objectPtr)

}

object PinJoint2D {
  /** Class metadata for Gd[PinJoint2D] lifetime management and casting. */
  given GodotClass[PinJoint2D] with {
    def className = "PinJoint2D"
    def isRefCounted = false
    def wrap(o: GodotObject): PinJoint2D = new PinJoint2D {}.withHost(o.objectPtr)
    def unwrap(t: PinJoint2D): GodotObject = t.hostObject
  }
}
