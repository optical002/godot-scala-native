package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `LookAtModifier3D`, extends `SkeletonModifier3D`. */
abstract class LookAtModifier3D extends SkeletonModifier3D {

  /** LookAtModifier3D.set_bone_name */
  final def setBoneName(bone_name: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("LookAtModifier3D", "set_bone_name", 83702148L), hostObject.objectPtr, bone_name)

  /** LookAtModifier3D.get_bone_name */
  final def getBoneName(): String =
    Ptrcall.call0[String](MethodBind.get("LookAtModifier3D", "get_bone_name", 201670096L), hostObject.objectPtr)

  /** LookAtModifier3D.set_bone */
  final def setBone(bone: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("LookAtModifier3D", "set_bone", 1286410249L), hostObject.objectPtr, bone)

  /** LookAtModifier3D.get_bone */
  final def getBone(): Long =
    Ptrcall.call0[Long](MethodBind.get("LookAtModifier3D", "get_bone", 3905245786L), hostObject.objectPtr)

  /** LookAtModifier3D.set_forward_axis */
  final def setForwardAxis(forward_axis: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("LookAtModifier3D", "set_forward_axis", 3199955933L), hostObject.objectPtr, forward_axis)

  /** LookAtModifier3D.get_forward_axis */
  final def getForwardAxis(): Long =
    Ptrcall.call0[Long](MethodBind.get("LookAtModifier3D", "get_forward_axis", 4076020284L), hostObject.objectPtr)

  /** LookAtModifier3D.set_primary_rotation_axis */
  final def setPrimaryRotationAxis(axis: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("LookAtModifier3D", "set_primary_rotation_axis", 1144690656L), hostObject.objectPtr, axis)

  /** LookAtModifier3D.get_primary_rotation_axis */
  final def getPrimaryRotationAxis(): Long =
    Ptrcall.call0[Long](MethodBind.get("LookAtModifier3D", "get_primary_rotation_axis", 3050976882L), hostObject.objectPtr)

  /** LookAtModifier3D.set_use_secondary_rotation */
  final def setUseSecondaryRotation(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("LookAtModifier3D", "set_use_secondary_rotation", 2586408642L), hostObject.objectPtr, enabled)

  /** LookAtModifier3D.is_using_secondary_rotation */
  final def isUsingSecondaryRotation(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("LookAtModifier3D", "is_using_secondary_rotation", 36873697L), hostObject.objectPtr)

  /** LookAtModifier3D.set_relative */
  final def setRelative(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("LookAtModifier3D", "set_relative", 2586408642L), hostObject.objectPtr, enabled)

  /** LookAtModifier3D.is_relative */
  final def isRelative(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("LookAtModifier3D", "is_relative", 36873697L), hostObject.objectPtr)

  /** LookAtModifier3D.set_origin_safe_margin */
  final def setOriginSafeMargin(margin: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("LookAtModifier3D", "set_origin_safe_margin", 373806689L), hostObject.objectPtr, margin)

  /** LookAtModifier3D.get_origin_safe_margin */
  final def getOriginSafeMargin(): Double =
    Ptrcall.call0[Double](MethodBind.get("LookAtModifier3D", "get_origin_safe_margin", 1740695150L), hostObject.objectPtr)

  /** LookAtModifier3D.set_origin_from */
  final def setOriginFrom(origin_from: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("LookAtModifier3D", "set_origin_from", 4254695669L), hostObject.objectPtr, origin_from)

  /** LookAtModifier3D.get_origin_from */
  final def getOriginFrom(): Long =
    Ptrcall.call0[Long](MethodBind.get("LookAtModifier3D", "get_origin_from", 4057166297L), hostObject.objectPtr)

  /** LookAtModifier3D.set_origin_bone_name */
  final def setOriginBoneName(bone_name: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("LookAtModifier3D", "set_origin_bone_name", 83702148L), hostObject.objectPtr, bone_name)

  /** LookAtModifier3D.get_origin_bone_name */
  final def getOriginBoneName(): String =
    Ptrcall.call0[String](MethodBind.get("LookAtModifier3D", "get_origin_bone_name", 201670096L), hostObject.objectPtr)

  /** LookAtModifier3D.set_origin_bone */
  final def setOriginBone(bone: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("LookAtModifier3D", "set_origin_bone", 1286410249L), hostObject.objectPtr, bone)

  /** LookAtModifier3D.get_origin_bone */
  final def getOriginBone(): Long =
    Ptrcall.call0[Long](MethodBind.get("LookAtModifier3D", "get_origin_bone", 3905245786L), hostObject.objectPtr)

  /** LookAtModifier3D.set_origin_offset */
  final def setOriginOffset(offset: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("LookAtModifier3D", "set_origin_offset", 3460891852L), hostObject.objectPtr, offset)

  /** LookAtModifier3D.get_origin_offset */
  final def getOriginOffset(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("LookAtModifier3D", "get_origin_offset", 3360562783L), hostObject.objectPtr)

  /** LookAtModifier3D.set_duration */
  final def setDuration(duration: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("LookAtModifier3D", "set_duration", 373806689L), hostObject.objectPtr, duration)

  /** LookAtModifier3D.get_duration */
  final def getDuration(): Double =
    Ptrcall.call0[Double](MethodBind.get("LookAtModifier3D", "get_duration", 1740695150L), hostObject.objectPtr)

  /** LookAtModifier3D.set_transition_type */
  final def setTransitionType(transition_type: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("LookAtModifier3D", "set_transition_type", 1058637742L), hostObject.objectPtr, transition_type)

  /** LookAtModifier3D.get_transition_type */
  final def getTransitionType(): Long =
    Ptrcall.call0[Long](MethodBind.get("LookAtModifier3D", "get_transition_type", 3842314528L), hostObject.objectPtr)

  /** LookAtModifier3D.set_ease_type */
  final def setEaseType(ease_type: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("LookAtModifier3D", "set_ease_type", 1208105857L), hostObject.objectPtr, ease_type)

  /** LookAtModifier3D.get_ease_type */
  final def getEaseType(): Long =
    Ptrcall.call0[Long](MethodBind.get("LookAtModifier3D", "get_ease_type", 631880200L), hostObject.objectPtr)

  /** LookAtModifier3D.set_use_angle_limitation */
  final def setUseAngleLimitation(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("LookAtModifier3D", "set_use_angle_limitation", 2586408642L), hostObject.objectPtr, enabled)

  /** LookAtModifier3D.is_using_angle_limitation */
  final def isUsingAngleLimitation(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("LookAtModifier3D", "is_using_angle_limitation", 36873697L), hostObject.objectPtr)

  /** LookAtModifier3D.set_symmetry_limitation */
  final def setSymmetryLimitation(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("LookAtModifier3D", "set_symmetry_limitation", 2586408642L), hostObject.objectPtr, enabled)

  /** LookAtModifier3D.is_limitation_symmetry */
  final def isLimitationSymmetry(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("LookAtModifier3D", "is_limitation_symmetry", 36873697L), hostObject.objectPtr)

  /** LookAtModifier3D.set_primary_limit_angle */
  final def setPrimaryLimitAngle(angle: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("LookAtModifier3D", "set_primary_limit_angle", 373806689L), hostObject.objectPtr, angle)

  /** LookAtModifier3D.get_primary_limit_angle */
  final def getPrimaryLimitAngle(): Double =
    Ptrcall.call0[Double](MethodBind.get("LookAtModifier3D", "get_primary_limit_angle", 1740695150L), hostObject.objectPtr)

  /** LookAtModifier3D.set_primary_damp_threshold */
  final def setPrimaryDampThreshold(power: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("LookAtModifier3D", "set_primary_damp_threshold", 373806689L), hostObject.objectPtr, power)

  /** LookAtModifier3D.get_primary_damp_threshold */
  final def getPrimaryDampThreshold(): Double =
    Ptrcall.call0[Double](MethodBind.get("LookAtModifier3D", "get_primary_damp_threshold", 1740695150L), hostObject.objectPtr)

  /** LookAtModifier3D.set_primary_positive_limit_angle */
  final def setPrimaryPositiveLimitAngle(angle: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("LookAtModifier3D", "set_primary_positive_limit_angle", 373806689L), hostObject.objectPtr, angle)

  /** LookAtModifier3D.get_primary_positive_limit_angle */
  final def getPrimaryPositiveLimitAngle(): Double =
    Ptrcall.call0[Double](MethodBind.get("LookAtModifier3D", "get_primary_positive_limit_angle", 1740695150L), hostObject.objectPtr)

  /** LookAtModifier3D.set_primary_positive_damp_threshold */
  final def setPrimaryPositiveDampThreshold(power: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("LookAtModifier3D", "set_primary_positive_damp_threshold", 373806689L), hostObject.objectPtr, power)

  /** LookAtModifier3D.get_primary_positive_damp_threshold */
  final def getPrimaryPositiveDampThreshold(): Double =
    Ptrcall.call0[Double](MethodBind.get("LookAtModifier3D", "get_primary_positive_damp_threshold", 1740695150L), hostObject.objectPtr)

  /** LookAtModifier3D.set_primary_negative_limit_angle */
  final def setPrimaryNegativeLimitAngle(angle: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("LookAtModifier3D", "set_primary_negative_limit_angle", 373806689L), hostObject.objectPtr, angle)

  /** LookAtModifier3D.get_primary_negative_limit_angle */
  final def getPrimaryNegativeLimitAngle(): Double =
    Ptrcall.call0[Double](MethodBind.get("LookAtModifier3D", "get_primary_negative_limit_angle", 1740695150L), hostObject.objectPtr)

  /** LookAtModifier3D.set_primary_negative_damp_threshold */
  final def setPrimaryNegativeDampThreshold(power: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("LookAtModifier3D", "set_primary_negative_damp_threshold", 373806689L), hostObject.objectPtr, power)

  /** LookAtModifier3D.get_primary_negative_damp_threshold */
  final def getPrimaryNegativeDampThreshold(): Double =
    Ptrcall.call0[Double](MethodBind.get("LookAtModifier3D", "get_primary_negative_damp_threshold", 1740695150L), hostObject.objectPtr)

  /** LookAtModifier3D.set_secondary_limit_angle */
  final def setSecondaryLimitAngle(angle: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("LookAtModifier3D", "set_secondary_limit_angle", 373806689L), hostObject.objectPtr, angle)

  /** LookAtModifier3D.get_secondary_limit_angle */
  final def getSecondaryLimitAngle(): Double =
    Ptrcall.call0[Double](MethodBind.get("LookAtModifier3D", "get_secondary_limit_angle", 1740695150L), hostObject.objectPtr)

  /** LookAtModifier3D.set_secondary_damp_threshold */
  final def setSecondaryDampThreshold(power: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("LookAtModifier3D", "set_secondary_damp_threshold", 373806689L), hostObject.objectPtr, power)

  /** LookAtModifier3D.get_secondary_damp_threshold */
  final def getSecondaryDampThreshold(): Double =
    Ptrcall.call0[Double](MethodBind.get("LookAtModifier3D", "get_secondary_damp_threshold", 1740695150L), hostObject.objectPtr)

  /** LookAtModifier3D.set_secondary_positive_limit_angle */
  final def setSecondaryPositiveLimitAngle(angle: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("LookAtModifier3D", "set_secondary_positive_limit_angle", 373806689L), hostObject.objectPtr, angle)

  /** LookAtModifier3D.get_secondary_positive_limit_angle */
  final def getSecondaryPositiveLimitAngle(): Double =
    Ptrcall.call0[Double](MethodBind.get("LookAtModifier3D", "get_secondary_positive_limit_angle", 1740695150L), hostObject.objectPtr)

  /** LookAtModifier3D.set_secondary_positive_damp_threshold */
  final def setSecondaryPositiveDampThreshold(power: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("LookAtModifier3D", "set_secondary_positive_damp_threshold", 373806689L), hostObject.objectPtr, power)

  /** LookAtModifier3D.get_secondary_positive_damp_threshold */
  final def getSecondaryPositiveDampThreshold(): Double =
    Ptrcall.call0[Double](MethodBind.get("LookAtModifier3D", "get_secondary_positive_damp_threshold", 1740695150L), hostObject.objectPtr)

  /** LookAtModifier3D.set_secondary_negative_limit_angle */
  final def setSecondaryNegativeLimitAngle(angle: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("LookAtModifier3D", "set_secondary_negative_limit_angle", 373806689L), hostObject.objectPtr, angle)

  /** LookAtModifier3D.get_secondary_negative_limit_angle */
  final def getSecondaryNegativeLimitAngle(): Double =
    Ptrcall.call0[Double](MethodBind.get("LookAtModifier3D", "get_secondary_negative_limit_angle", 1740695150L), hostObject.objectPtr)

  /** LookAtModifier3D.set_secondary_negative_damp_threshold */
  final def setSecondaryNegativeDampThreshold(power: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("LookAtModifier3D", "set_secondary_negative_damp_threshold", 373806689L), hostObject.objectPtr, power)

  /** LookAtModifier3D.get_secondary_negative_damp_threshold */
  final def getSecondaryNegativeDampThreshold(): Double =
    Ptrcall.call0[Double](MethodBind.get("LookAtModifier3D", "get_secondary_negative_damp_threshold", 1740695150L), hostObject.objectPtr)

  /** LookAtModifier3D.get_interpolation_remaining */
  final def getInterpolationRemaining(): Double =
    Ptrcall.call0[Double](MethodBind.get("LookAtModifier3D", "get_interpolation_remaining", 1740695150L), hostObject.objectPtr)

  /** LookAtModifier3D.is_interpolating */
  final def isInterpolating(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("LookAtModifier3D", "is_interpolating", 36873697L), hostObject.objectPtr)

  /** LookAtModifier3D.is_target_within_limitation */
  final def isTargetWithinLimitation(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("LookAtModifier3D", "is_target_within_limitation", 36873697L), hostObject.objectPtr)

}

object LookAtModifier3D {
  /** Class metadata for Gd[LookAtModifier3D] lifetime management and casting. */
  given GodotClass[LookAtModifier3D] with {
    def className = "LookAtModifier3D"
    def isRefCounted = false
    def wrap(o: GodotObject): LookAtModifier3D = new LookAtModifier3D {}.withHost(o.objectPtr)
    def unwrap(t: LookAtModifier3D): GodotObject = t.hostObject
  }
}
