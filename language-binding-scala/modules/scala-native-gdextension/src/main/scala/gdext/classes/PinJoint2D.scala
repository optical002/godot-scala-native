package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `PinJoint2D`, extends `Joint2D`. */
abstract class PinJoint2D extends Joint2D {
  override def godotClassName: String = "PinJoint2D"

  /** PinJoint2D.set_softness */
  final def setSoftness(softness: Double): Unit = {
    if (gdext.classes.PinJoint2D.mb_set_softness == null) gdext.classes.PinJoint2D.mb_set_softness = MethodBind.get("PinJoint2D", "set_softness", 373806689L)
    Ptrcall.callVoid1(gdext.classes.PinJoint2D.mb_set_softness, livePtr, softness)
  }

  /** PinJoint2D.get_softness */
  final def getSoftness(): Double = {
    if (gdext.classes.PinJoint2D.mb_get_softness == null) gdext.classes.PinJoint2D.mb_get_softness = MethodBind.get("PinJoint2D", "get_softness", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.PinJoint2D.mb_get_softness, livePtr)
  }

  /** PinJoint2D.set_angular_limit_lower */
  final def setAngularLimitLower(angular_limit_lower: Double): Unit = {
    if (gdext.classes.PinJoint2D.mb_set_angular_limit_lower == null) gdext.classes.PinJoint2D.mb_set_angular_limit_lower = MethodBind.get("PinJoint2D", "set_angular_limit_lower", 373806689L)
    Ptrcall.callVoid1(gdext.classes.PinJoint2D.mb_set_angular_limit_lower, livePtr, angular_limit_lower)
  }

  /** PinJoint2D.get_angular_limit_lower */
  final def getAngularLimitLower(): Double = {
    if (gdext.classes.PinJoint2D.mb_get_angular_limit_lower == null) gdext.classes.PinJoint2D.mb_get_angular_limit_lower = MethodBind.get("PinJoint2D", "get_angular_limit_lower", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.PinJoint2D.mb_get_angular_limit_lower, livePtr)
  }

  /** PinJoint2D.set_angular_limit_upper */
  final def setAngularLimitUpper(angular_limit_upper: Double): Unit = {
    if (gdext.classes.PinJoint2D.mb_set_angular_limit_upper == null) gdext.classes.PinJoint2D.mb_set_angular_limit_upper = MethodBind.get("PinJoint2D", "set_angular_limit_upper", 373806689L)
    Ptrcall.callVoid1(gdext.classes.PinJoint2D.mb_set_angular_limit_upper, livePtr, angular_limit_upper)
  }

  /** PinJoint2D.get_angular_limit_upper */
  final def getAngularLimitUpper(): Double = {
    if (gdext.classes.PinJoint2D.mb_get_angular_limit_upper == null) gdext.classes.PinJoint2D.mb_get_angular_limit_upper = MethodBind.get("PinJoint2D", "get_angular_limit_upper", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.PinJoint2D.mb_get_angular_limit_upper, livePtr)
  }

  /** PinJoint2D.set_motor_target_velocity */
  final def setMotorTargetVelocity(motor_target_velocity: Double): Unit = {
    if (gdext.classes.PinJoint2D.mb_set_motor_target_velocity == null) gdext.classes.PinJoint2D.mb_set_motor_target_velocity = MethodBind.get("PinJoint2D", "set_motor_target_velocity", 373806689L)
    Ptrcall.callVoid1(gdext.classes.PinJoint2D.mb_set_motor_target_velocity, livePtr, motor_target_velocity)
  }

  /** PinJoint2D.get_motor_target_velocity */
  final def getMotorTargetVelocity(): Double = {
    if (gdext.classes.PinJoint2D.mb_get_motor_target_velocity == null) gdext.classes.PinJoint2D.mb_get_motor_target_velocity = MethodBind.get("PinJoint2D", "get_motor_target_velocity", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.PinJoint2D.mb_get_motor_target_velocity, livePtr)
  }

  /** PinJoint2D.set_motor_enabled */
  final def setMotorEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.PinJoint2D.mb_set_motor_enabled == null) gdext.classes.PinJoint2D.mb_set_motor_enabled = MethodBind.get("PinJoint2D", "set_motor_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.PinJoint2D.mb_set_motor_enabled, livePtr, enabled)
  }

  /** PinJoint2D.is_motor_enabled */
  final def isMotorEnabled(): Boolean = {
    if (gdext.classes.PinJoint2D.mb_is_motor_enabled == null) gdext.classes.PinJoint2D.mb_is_motor_enabled = MethodBind.get("PinJoint2D", "is_motor_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.PinJoint2D.mb_is_motor_enabled, livePtr)
  }

  /** PinJoint2D.set_angular_limit_enabled */
  final def setAngularLimitEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.PinJoint2D.mb_set_angular_limit_enabled == null) gdext.classes.PinJoint2D.mb_set_angular_limit_enabled = MethodBind.get("PinJoint2D", "set_angular_limit_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.PinJoint2D.mb_set_angular_limit_enabled, livePtr, enabled)
  }

  /** PinJoint2D.is_angular_limit_enabled */
  final def isAngularLimitEnabled(): Boolean = {
    if (gdext.classes.PinJoint2D.mb_is_angular_limit_enabled == null) gdext.classes.PinJoint2D.mb_is_angular_limit_enabled = MethodBind.get("PinJoint2D", "is_angular_limit_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.PinJoint2D.mb_is_angular_limit_enabled, livePtr)
  }

}

object PinJoint2D {
  private[classes] var mb_set_softness: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_softness: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_angular_limit_lower: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_angular_limit_lower: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_angular_limit_upper: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_angular_limit_upper: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_motor_target_velocity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_motor_target_velocity: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_motor_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_motor_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_angular_limit_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_angular_limit_enabled: GDExtensionMethodBindPtr = null
}
