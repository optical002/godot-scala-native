package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `LookAtModifier3D`, extends `SkeletonModifier3D`. */
abstract class LookAtModifier3D extends SkeletonModifier3D {
  override def godotClassName: String = "LookAtModifier3D"

  /** LookAtModifier3D.set_bone_name */
  final def setBoneName(bone_name: String): Unit = {
    if (gdext.classes.LookAtModifier3D.mb_set_bone_name == null) gdext.classes.LookAtModifier3D.mb_set_bone_name = MethodBind.get("LookAtModifier3D", "set_bone_name", 83702148L)
    Ptrcall.callVoid1(gdext.classes.LookAtModifier3D.mb_set_bone_name, livePtr, bone_name)
  }

  /** LookAtModifier3D.get_bone_name */
  final def getBoneName(): String = {
    if (gdext.classes.LookAtModifier3D.mb_get_bone_name == null) gdext.classes.LookAtModifier3D.mb_get_bone_name = MethodBind.get("LookAtModifier3D", "get_bone_name", 201670096L)
    Ptrcall.call0[String](gdext.classes.LookAtModifier3D.mb_get_bone_name, livePtr)
  }

  /** LookAtModifier3D.set_bone */
  final def setBone(bone: Long): Unit = {
    if (gdext.classes.LookAtModifier3D.mb_set_bone == null) gdext.classes.LookAtModifier3D.mb_set_bone = MethodBind.get("LookAtModifier3D", "set_bone", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.LookAtModifier3D.mb_set_bone, livePtr, bone)
  }

  /** LookAtModifier3D.get_bone */
  final def getBone(): Long = {
    if (gdext.classes.LookAtModifier3D.mb_get_bone == null) gdext.classes.LookAtModifier3D.mb_get_bone = MethodBind.get("LookAtModifier3D", "get_bone", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.LookAtModifier3D.mb_get_bone, livePtr)
  }

  /** LookAtModifier3D.set_forward_axis */
  final def setForwardAxis(forward_axis: Long): Unit = {
    if (gdext.classes.LookAtModifier3D.mb_set_forward_axis == null) gdext.classes.LookAtModifier3D.mb_set_forward_axis = MethodBind.get("LookAtModifier3D", "set_forward_axis", 3199955933L)
    Ptrcall.callVoid1(gdext.classes.LookAtModifier3D.mb_set_forward_axis, livePtr, forward_axis)
  }

  /** LookAtModifier3D.get_forward_axis */
  final def getForwardAxis(): Long = {
    if (gdext.classes.LookAtModifier3D.mb_get_forward_axis == null) gdext.classes.LookAtModifier3D.mb_get_forward_axis = MethodBind.get("LookAtModifier3D", "get_forward_axis", 4076020284L)
    Ptrcall.call0[Long](gdext.classes.LookAtModifier3D.mb_get_forward_axis, livePtr)
  }

  /** LookAtModifier3D.set_primary_rotation_axis */
  final def setPrimaryRotationAxis(axis: Long): Unit = {
    if (gdext.classes.LookAtModifier3D.mb_set_primary_rotation_axis == null) gdext.classes.LookAtModifier3D.mb_set_primary_rotation_axis = MethodBind.get("LookAtModifier3D", "set_primary_rotation_axis", 1144690656L)
    Ptrcall.callVoid1(gdext.classes.LookAtModifier3D.mb_set_primary_rotation_axis, livePtr, axis)
  }

  /** LookAtModifier3D.get_primary_rotation_axis */
  final def getPrimaryRotationAxis(): Long = {
    if (gdext.classes.LookAtModifier3D.mb_get_primary_rotation_axis == null) gdext.classes.LookAtModifier3D.mb_get_primary_rotation_axis = MethodBind.get("LookAtModifier3D", "get_primary_rotation_axis", 3050976882L)
    Ptrcall.call0[Long](gdext.classes.LookAtModifier3D.mb_get_primary_rotation_axis, livePtr)
  }

  /** LookAtModifier3D.set_use_secondary_rotation */
  final def setUseSecondaryRotation(enabled: Boolean): Unit = {
    if (gdext.classes.LookAtModifier3D.mb_set_use_secondary_rotation == null) gdext.classes.LookAtModifier3D.mb_set_use_secondary_rotation = MethodBind.get("LookAtModifier3D", "set_use_secondary_rotation", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.LookAtModifier3D.mb_set_use_secondary_rotation, livePtr, enabled)
  }

  /** LookAtModifier3D.is_using_secondary_rotation */
  final def isUsingSecondaryRotation(): Boolean = {
    if (gdext.classes.LookAtModifier3D.mb_is_using_secondary_rotation == null) gdext.classes.LookAtModifier3D.mb_is_using_secondary_rotation = MethodBind.get("LookAtModifier3D", "is_using_secondary_rotation", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.LookAtModifier3D.mb_is_using_secondary_rotation, livePtr)
  }

  /** LookAtModifier3D.set_relative */
  final def setRelative(enabled: Boolean): Unit = {
    if (gdext.classes.LookAtModifier3D.mb_set_relative == null) gdext.classes.LookAtModifier3D.mb_set_relative = MethodBind.get("LookAtModifier3D", "set_relative", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.LookAtModifier3D.mb_set_relative, livePtr, enabled)
  }

  /** LookAtModifier3D.is_relative */
  final def isRelative(): Boolean = {
    if (gdext.classes.LookAtModifier3D.mb_is_relative == null) gdext.classes.LookAtModifier3D.mb_is_relative = MethodBind.get("LookAtModifier3D", "is_relative", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.LookAtModifier3D.mb_is_relative, livePtr)
  }

  /** LookAtModifier3D.set_origin_safe_margin */
  final def setOriginSafeMargin(margin: Double): Unit = {
    if (gdext.classes.LookAtModifier3D.mb_set_origin_safe_margin == null) gdext.classes.LookAtModifier3D.mb_set_origin_safe_margin = MethodBind.get("LookAtModifier3D", "set_origin_safe_margin", 373806689L)
    Ptrcall.callVoid1(gdext.classes.LookAtModifier3D.mb_set_origin_safe_margin, livePtr, margin)
  }

  /** LookAtModifier3D.get_origin_safe_margin */
  final def getOriginSafeMargin(): Double = {
    if (gdext.classes.LookAtModifier3D.mb_get_origin_safe_margin == null) gdext.classes.LookAtModifier3D.mb_get_origin_safe_margin = MethodBind.get("LookAtModifier3D", "get_origin_safe_margin", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.LookAtModifier3D.mb_get_origin_safe_margin, livePtr)
  }

  /** LookAtModifier3D.set_origin_from */
  final def setOriginFrom(origin_from: Long): Unit = {
    if (gdext.classes.LookAtModifier3D.mb_set_origin_from == null) gdext.classes.LookAtModifier3D.mb_set_origin_from = MethodBind.get("LookAtModifier3D", "set_origin_from", 4254695669L)
    Ptrcall.callVoid1(gdext.classes.LookAtModifier3D.mb_set_origin_from, livePtr, origin_from)
  }

  /** LookAtModifier3D.get_origin_from */
  final def getOriginFrom(): Long = {
    if (gdext.classes.LookAtModifier3D.mb_get_origin_from == null) gdext.classes.LookAtModifier3D.mb_get_origin_from = MethodBind.get("LookAtModifier3D", "get_origin_from", 4057166297L)
    Ptrcall.call0[Long](gdext.classes.LookAtModifier3D.mb_get_origin_from, livePtr)
  }

  /** LookAtModifier3D.set_origin_bone_name */
  final def setOriginBoneName(bone_name: String): Unit = {
    if (gdext.classes.LookAtModifier3D.mb_set_origin_bone_name == null) gdext.classes.LookAtModifier3D.mb_set_origin_bone_name = MethodBind.get("LookAtModifier3D", "set_origin_bone_name", 83702148L)
    Ptrcall.callVoid1(gdext.classes.LookAtModifier3D.mb_set_origin_bone_name, livePtr, bone_name)
  }

  /** LookAtModifier3D.get_origin_bone_name */
  final def getOriginBoneName(): String = {
    if (gdext.classes.LookAtModifier3D.mb_get_origin_bone_name == null) gdext.classes.LookAtModifier3D.mb_get_origin_bone_name = MethodBind.get("LookAtModifier3D", "get_origin_bone_name", 201670096L)
    Ptrcall.call0[String](gdext.classes.LookAtModifier3D.mb_get_origin_bone_name, livePtr)
  }

  /** LookAtModifier3D.set_origin_bone */
  final def setOriginBone(bone: Long): Unit = {
    if (gdext.classes.LookAtModifier3D.mb_set_origin_bone == null) gdext.classes.LookAtModifier3D.mb_set_origin_bone = MethodBind.get("LookAtModifier3D", "set_origin_bone", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.LookAtModifier3D.mb_set_origin_bone, livePtr, bone)
  }

  /** LookAtModifier3D.get_origin_bone */
  final def getOriginBone(): Long = {
    if (gdext.classes.LookAtModifier3D.mb_get_origin_bone == null) gdext.classes.LookAtModifier3D.mb_get_origin_bone = MethodBind.get("LookAtModifier3D", "get_origin_bone", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.LookAtModifier3D.mb_get_origin_bone, livePtr)
  }

  /** LookAtModifier3D.set_origin_offset */
  final def setOriginOffset(offset: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.LookAtModifier3D.mb_set_origin_offset == null) gdext.classes.LookAtModifier3D.mb_set_origin_offset = MethodBind.get("LookAtModifier3D", "set_origin_offset", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.LookAtModifier3D.mb_set_origin_offset, livePtr, offset)
  }

  /** LookAtModifier3D.get_origin_offset */
  final def getOriginOffset(): gdext.builtin.Vector3 = {
    if (gdext.classes.LookAtModifier3D.mb_get_origin_offset == null) gdext.classes.LookAtModifier3D.mb_get_origin_offset = MethodBind.get("LookAtModifier3D", "get_origin_offset", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.LookAtModifier3D.mb_get_origin_offset, livePtr)
  }

  /** LookAtModifier3D.set_duration */
  final def setDuration(duration: Double): Unit = {
    if (gdext.classes.LookAtModifier3D.mb_set_duration == null) gdext.classes.LookAtModifier3D.mb_set_duration = MethodBind.get("LookAtModifier3D", "set_duration", 373806689L)
    Ptrcall.callVoid1(gdext.classes.LookAtModifier3D.mb_set_duration, livePtr, duration)
  }

  /** LookAtModifier3D.get_duration */
  final def getDuration(): Double = {
    if (gdext.classes.LookAtModifier3D.mb_get_duration == null) gdext.classes.LookAtModifier3D.mb_get_duration = MethodBind.get("LookAtModifier3D", "get_duration", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.LookAtModifier3D.mb_get_duration, livePtr)
  }

  /** LookAtModifier3D.set_transition_type */
  final def setTransitionType(transition_type: Long): Unit = {
    if (gdext.classes.LookAtModifier3D.mb_set_transition_type == null) gdext.classes.LookAtModifier3D.mb_set_transition_type = MethodBind.get("LookAtModifier3D", "set_transition_type", 1058637742L)
    Ptrcall.callVoid1(gdext.classes.LookAtModifier3D.mb_set_transition_type, livePtr, transition_type)
  }

  /** LookAtModifier3D.get_transition_type */
  final def getTransitionType(): Long = {
    if (gdext.classes.LookAtModifier3D.mb_get_transition_type == null) gdext.classes.LookAtModifier3D.mb_get_transition_type = MethodBind.get("LookAtModifier3D", "get_transition_type", 3842314528L)
    Ptrcall.call0[Long](gdext.classes.LookAtModifier3D.mb_get_transition_type, livePtr)
  }

  /** LookAtModifier3D.set_ease_type */
  final def setEaseType(ease_type: Long): Unit = {
    if (gdext.classes.LookAtModifier3D.mb_set_ease_type == null) gdext.classes.LookAtModifier3D.mb_set_ease_type = MethodBind.get("LookAtModifier3D", "set_ease_type", 1208105857L)
    Ptrcall.callVoid1(gdext.classes.LookAtModifier3D.mb_set_ease_type, livePtr, ease_type)
  }

  /** LookAtModifier3D.get_ease_type */
  final def getEaseType(): Long = {
    if (gdext.classes.LookAtModifier3D.mb_get_ease_type == null) gdext.classes.LookAtModifier3D.mb_get_ease_type = MethodBind.get("LookAtModifier3D", "get_ease_type", 631880200L)
    Ptrcall.call0[Long](gdext.classes.LookAtModifier3D.mb_get_ease_type, livePtr)
  }

  /** LookAtModifier3D.set_use_angle_limitation */
  final def setUseAngleLimitation(enabled: Boolean): Unit = {
    if (gdext.classes.LookAtModifier3D.mb_set_use_angle_limitation == null) gdext.classes.LookAtModifier3D.mb_set_use_angle_limitation = MethodBind.get("LookAtModifier3D", "set_use_angle_limitation", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.LookAtModifier3D.mb_set_use_angle_limitation, livePtr, enabled)
  }

  /** LookAtModifier3D.is_using_angle_limitation */
  final def isUsingAngleLimitation(): Boolean = {
    if (gdext.classes.LookAtModifier3D.mb_is_using_angle_limitation == null) gdext.classes.LookAtModifier3D.mb_is_using_angle_limitation = MethodBind.get("LookAtModifier3D", "is_using_angle_limitation", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.LookAtModifier3D.mb_is_using_angle_limitation, livePtr)
  }

  /** LookAtModifier3D.set_symmetry_limitation */
  final def setSymmetryLimitation(enabled: Boolean): Unit = {
    if (gdext.classes.LookAtModifier3D.mb_set_symmetry_limitation == null) gdext.classes.LookAtModifier3D.mb_set_symmetry_limitation = MethodBind.get("LookAtModifier3D", "set_symmetry_limitation", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.LookAtModifier3D.mb_set_symmetry_limitation, livePtr, enabled)
  }

  /** LookAtModifier3D.is_limitation_symmetry */
  final def isLimitationSymmetry(): Boolean = {
    if (gdext.classes.LookAtModifier3D.mb_is_limitation_symmetry == null) gdext.classes.LookAtModifier3D.mb_is_limitation_symmetry = MethodBind.get("LookAtModifier3D", "is_limitation_symmetry", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.LookAtModifier3D.mb_is_limitation_symmetry, livePtr)
  }

  /** LookAtModifier3D.set_primary_limit_angle */
  final def setPrimaryLimitAngle(angle: Double): Unit = {
    if (gdext.classes.LookAtModifier3D.mb_set_primary_limit_angle == null) gdext.classes.LookAtModifier3D.mb_set_primary_limit_angle = MethodBind.get("LookAtModifier3D", "set_primary_limit_angle", 373806689L)
    Ptrcall.callVoid1(gdext.classes.LookAtModifier3D.mb_set_primary_limit_angle, livePtr, angle)
  }

  /** LookAtModifier3D.get_primary_limit_angle */
  final def getPrimaryLimitAngle(): Double = {
    if (gdext.classes.LookAtModifier3D.mb_get_primary_limit_angle == null) gdext.classes.LookAtModifier3D.mb_get_primary_limit_angle = MethodBind.get("LookAtModifier3D", "get_primary_limit_angle", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.LookAtModifier3D.mb_get_primary_limit_angle, livePtr)
  }

  /** LookAtModifier3D.set_primary_damp_threshold */
  final def setPrimaryDampThreshold(power: Double): Unit = {
    if (gdext.classes.LookAtModifier3D.mb_set_primary_damp_threshold == null) gdext.classes.LookAtModifier3D.mb_set_primary_damp_threshold = MethodBind.get("LookAtModifier3D", "set_primary_damp_threshold", 373806689L)
    Ptrcall.callVoid1(gdext.classes.LookAtModifier3D.mb_set_primary_damp_threshold, livePtr, power)
  }

  /** LookAtModifier3D.get_primary_damp_threshold */
  final def getPrimaryDampThreshold(): Double = {
    if (gdext.classes.LookAtModifier3D.mb_get_primary_damp_threshold == null) gdext.classes.LookAtModifier3D.mb_get_primary_damp_threshold = MethodBind.get("LookAtModifier3D", "get_primary_damp_threshold", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.LookAtModifier3D.mb_get_primary_damp_threshold, livePtr)
  }

  /** LookAtModifier3D.set_primary_positive_limit_angle */
  final def setPrimaryPositiveLimitAngle(angle: Double): Unit = {
    if (gdext.classes.LookAtModifier3D.mb_set_primary_positive_limit_angle == null) gdext.classes.LookAtModifier3D.mb_set_primary_positive_limit_angle = MethodBind.get("LookAtModifier3D", "set_primary_positive_limit_angle", 373806689L)
    Ptrcall.callVoid1(gdext.classes.LookAtModifier3D.mb_set_primary_positive_limit_angle, livePtr, angle)
  }

  /** LookAtModifier3D.get_primary_positive_limit_angle */
  final def getPrimaryPositiveLimitAngle(): Double = {
    if (gdext.classes.LookAtModifier3D.mb_get_primary_positive_limit_angle == null) gdext.classes.LookAtModifier3D.mb_get_primary_positive_limit_angle = MethodBind.get("LookAtModifier3D", "get_primary_positive_limit_angle", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.LookAtModifier3D.mb_get_primary_positive_limit_angle, livePtr)
  }

  /** LookAtModifier3D.set_primary_positive_damp_threshold */
  final def setPrimaryPositiveDampThreshold(power: Double): Unit = {
    if (gdext.classes.LookAtModifier3D.mb_set_primary_positive_damp_threshold == null) gdext.classes.LookAtModifier3D.mb_set_primary_positive_damp_threshold = MethodBind.get("LookAtModifier3D", "set_primary_positive_damp_threshold", 373806689L)
    Ptrcall.callVoid1(gdext.classes.LookAtModifier3D.mb_set_primary_positive_damp_threshold, livePtr, power)
  }

  /** LookAtModifier3D.get_primary_positive_damp_threshold */
  final def getPrimaryPositiveDampThreshold(): Double = {
    if (gdext.classes.LookAtModifier3D.mb_get_primary_positive_damp_threshold == null) gdext.classes.LookAtModifier3D.mb_get_primary_positive_damp_threshold = MethodBind.get("LookAtModifier3D", "get_primary_positive_damp_threshold", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.LookAtModifier3D.mb_get_primary_positive_damp_threshold, livePtr)
  }

  /** LookAtModifier3D.set_primary_negative_limit_angle */
  final def setPrimaryNegativeLimitAngle(angle: Double): Unit = {
    if (gdext.classes.LookAtModifier3D.mb_set_primary_negative_limit_angle == null) gdext.classes.LookAtModifier3D.mb_set_primary_negative_limit_angle = MethodBind.get("LookAtModifier3D", "set_primary_negative_limit_angle", 373806689L)
    Ptrcall.callVoid1(gdext.classes.LookAtModifier3D.mb_set_primary_negative_limit_angle, livePtr, angle)
  }

  /** LookAtModifier3D.get_primary_negative_limit_angle */
  final def getPrimaryNegativeLimitAngle(): Double = {
    if (gdext.classes.LookAtModifier3D.mb_get_primary_negative_limit_angle == null) gdext.classes.LookAtModifier3D.mb_get_primary_negative_limit_angle = MethodBind.get("LookAtModifier3D", "get_primary_negative_limit_angle", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.LookAtModifier3D.mb_get_primary_negative_limit_angle, livePtr)
  }

  /** LookAtModifier3D.set_primary_negative_damp_threshold */
  final def setPrimaryNegativeDampThreshold(power: Double): Unit = {
    if (gdext.classes.LookAtModifier3D.mb_set_primary_negative_damp_threshold == null) gdext.classes.LookAtModifier3D.mb_set_primary_negative_damp_threshold = MethodBind.get("LookAtModifier3D", "set_primary_negative_damp_threshold", 373806689L)
    Ptrcall.callVoid1(gdext.classes.LookAtModifier3D.mb_set_primary_negative_damp_threshold, livePtr, power)
  }

  /** LookAtModifier3D.get_primary_negative_damp_threshold */
  final def getPrimaryNegativeDampThreshold(): Double = {
    if (gdext.classes.LookAtModifier3D.mb_get_primary_negative_damp_threshold == null) gdext.classes.LookAtModifier3D.mb_get_primary_negative_damp_threshold = MethodBind.get("LookAtModifier3D", "get_primary_negative_damp_threshold", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.LookAtModifier3D.mb_get_primary_negative_damp_threshold, livePtr)
  }

  /** LookAtModifier3D.set_secondary_limit_angle */
  final def setSecondaryLimitAngle(angle: Double): Unit = {
    if (gdext.classes.LookAtModifier3D.mb_set_secondary_limit_angle == null) gdext.classes.LookAtModifier3D.mb_set_secondary_limit_angle = MethodBind.get("LookAtModifier3D", "set_secondary_limit_angle", 373806689L)
    Ptrcall.callVoid1(gdext.classes.LookAtModifier3D.mb_set_secondary_limit_angle, livePtr, angle)
  }

  /** LookAtModifier3D.get_secondary_limit_angle */
  final def getSecondaryLimitAngle(): Double = {
    if (gdext.classes.LookAtModifier3D.mb_get_secondary_limit_angle == null) gdext.classes.LookAtModifier3D.mb_get_secondary_limit_angle = MethodBind.get("LookAtModifier3D", "get_secondary_limit_angle", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.LookAtModifier3D.mb_get_secondary_limit_angle, livePtr)
  }

  /** LookAtModifier3D.set_secondary_damp_threshold */
  final def setSecondaryDampThreshold(power: Double): Unit = {
    if (gdext.classes.LookAtModifier3D.mb_set_secondary_damp_threshold == null) gdext.classes.LookAtModifier3D.mb_set_secondary_damp_threshold = MethodBind.get("LookAtModifier3D", "set_secondary_damp_threshold", 373806689L)
    Ptrcall.callVoid1(gdext.classes.LookAtModifier3D.mb_set_secondary_damp_threshold, livePtr, power)
  }

  /** LookAtModifier3D.get_secondary_damp_threshold */
  final def getSecondaryDampThreshold(): Double = {
    if (gdext.classes.LookAtModifier3D.mb_get_secondary_damp_threshold == null) gdext.classes.LookAtModifier3D.mb_get_secondary_damp_threshold = MethodBind.get("LookAtModifier3D", "get_secondary_damp_threshold", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.LookAtModifier3D.mb_get_secondary_damp_threshold, livePtr)
  }

  /** LookAtModifier3D.set_secondary_positive_limit_angle */
  final def setSecondaryPositiveLimitAngle(angle: Double): Unit = {
    if (gdext.classes.LookAtModifier3D.mb_set_secondary_positive_limit_angle == null) gdext.classes.LookAtModifier3D.mb_set_secondary_positive_limit_angle = MethodBind.get("LookAtModifier3D", "set_secondary_positive_limit_angle", 373806689L)
    Ptrcall.callVoid1(gdext.classes.LookAtModifier3D.mb_set_secondary_positive_limit_angle, livePtr, angle)
  }

  /** LookAtModifier3D.get_secondary_positive_limit_angle */
  final def getSecondaryPositiveLimitAngle(): Double = {
    if (gdext.classes.LookAtModifier3D.mb_get_secondary_positive_limit_angle == null) gdext.classes.LookAtModifier3D.mb_get_secondary_positive_limit_angle = MethodBind.get("LookAtModifier3D", "get_secondary_positive_limit_angle", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.LookAtModifier3D.mb_get_secondary_positive_limit_angle, livePtr)
  }

  /** LookAtModifier3D.set_secondary_positive_damp_threshold */
  final def setSecondaryPositiveDampThreshold(power: Double): Unit = {
    if (gdext.classes.LookAtModifier3D.mb_set_secondary_positive_damp_threshold == null) gdext.classes.LookAtModifier3D.mb_set_secondary_positive_damp_threshold = MethodBind.get("LookAtModifier3D", "set_secondary_positive_damp_threshold", 373806689L)
    Ptrcall.callVoid1(gdext.classes.LookAtModifier3D.mb_set_secondary_positive_damp_threshold, livePtr, power)
  }

  /** LookAtModifier3D.get_secondary_positive_damp_threshold */
  final def getSecondaryPositiveDampThreshold(): Double = {
    if (gdext.classes.LookAtModifier3D.mb_get_secondary_positive_damp_threshold == null) gdext.classes.LookAtModifier3D.mb_get_secondary_positive_damp_threshold = MethodBind.get("LookAtModifier3D", "get_secondary_positive_damp_threshold", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.LookAtModifier3D.mb_get_secondary_positive_damp_threshold, livePtr)
  }

  /** LookAtModifier3D.set_secondary_negative_limit_angle */
  final def setSecondaryNegativeLimitAngle(angle: Double): Unit = {
    if (gdext.classes.LookAtModifier3D.mb_set_secondary_negative_limit_angle == null) gdext.classes.LookAtModifier3D.mb_set_secondary_negative_limit_angle = MethodBind.get("LookAtModifier3D", "set_secondary_negative_limit_angle", 373806689L)
    Ptrcall.callVoid1(gdext.classes.LookAtModifier3D.mb_set_secondary_negative_limit_angle, livePtr, angle)
  }

  /** LookAtModifier3D.get_secondary_negative_limit_angle */
  final def getSecondaryNegativeLimitAngle(): Double = {
    if (gdext.classes.LookAtModifier3D.mb_get_secondary_negative_limit_angle == null) gdext.classes.LookAtModifier3D.mb_get_secondary_negative_limit_angle = MethodBind.get("LookAtModifier3D", "get_secondary_negative_limit_angle", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.LookAtModifier3D.mb_get_secondary_negative_limit_angle, livePtr)
  }

  /** LookAtModifier3D.set_secondary_negative_damp_threshold */
  final def setSecondaryNegativeDampThreshold(power: Double): Unit = {
    if (gdext.classes.LookAtModifier3D.mb_set_secondary_negative_damp_threshold == null) gdext.classes.LookAtModifier3D.mb_set_secondary_negative_damp_threshold = MethodBind.get("LookAtModifier3D", "set_secondary_negative_damp_threshold", 373806689L)
    Ptrcall.callVoid1(gdext.classes.LookAtModifier3D.mb_set_secondary_negative_damp_threshold, livePtr, power)
  }

  /** LookAtModifier3D.get_secondary_negative_damp_threshold */
  final def getSecondaryNegativeDampThreshold(): Double = {
    if (gdext.classes.LookAtModifier3D.mb_get_secondary_negative_damp_threshold == null) gdext.classes.LookAtModifier3D.mb_get_secondary_negative_damp_threshold = MethodBind.get("LookAtModifier3D", "get_secondary_negative_damp_threshold", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.LookAtModifier3D.mb_get_secondary_negative_damp_threshold, livePtr)
  }

  /** LookAtModifier3D.get_interpolation_remaining */
  final def getInterpolationRemaining(): Double = {
    if (gdext.classes.LookAtModifier3D.mb_get_interpolation_remaining == null) gdext.classes.LookAtModifier3D.mb_get_interpolation_remaining = MethodBind.get("LookAtModifier3D", "get_interpolation_remaining", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.LookAtModifier3D.mb_get_interpolation_remaining, livePtr)
  }

  /** LookAtModifier3D.is_interpolating */
  final def isInterpolating(): Boolean = {
    if (gdext.classes.LookAtModifier3D.mb_is_interpolating == null) gdext.classes.LookAtModifier3D.mb_is_interpolating = MethodBind.get("LookAtModifier3D", "is_interpolating", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.LookAtModifier3D.mb_is_interpolating, livePtr)
  }

  /** LookAtModifier3D.is_target_within_limitation */
  final def isTargetWithinLimitation(): Boolean = {
    if (gdext.classes.LookAtModifier3D.mb_is_target_within_limitation == null) gdext.classes.LookAtModifier3D.mb_is_target_within_limitation = MethodBind.get("LookAtModifier3D", "is_target_within_limitation", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.LookAtModifier3D.mb_is_target_within_limitation, livePtr)
  }

}

object LookAtModifier3D {
  private[classes] var mb_set_bone_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bone_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bone: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bone: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_forward_axis: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_forward_axis: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_primary_rotation_axis: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_primary_rotation_axis: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_use_secondary_rotation: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_using_secondary_rotation: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_relative: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_relative: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_origin_safe_margin: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_origin_safe_margin: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_origin_from: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_origin_from: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_origin_bone_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_origin_bone_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_origin_bone: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_origin_bone: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_origin_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_origin_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_duration: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_duration: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_transition_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_transition_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_ease_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_ease_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_use_angle_limitation: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_using_angle_limitation: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_symmetry_limitation: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_limitation_symmetry: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_primary_limit_angle: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_primary_limit_angle: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_primary_damp_threshold: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_primary_damp_threshold: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_primary_positive_limit_angle: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_primary_positive_limit_angle: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_primary_positive_damp_threshold: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_primary_positive_damp_threshold: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_primary_negative_limit_angle: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_primary_negative_limit_angle: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_primary_negative_damp_threshold: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_primary_negative_damp_threshold: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_secondary_limit_angle: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_secondary_limit_angle: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_secondary_damp_threshold: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_secondary_damp_threshold: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_secondary_positive_limit_angle: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_secondary_positive_limit_angle: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_secondary_positive_damp_threshold: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_secondary_positive_damp_threshold: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_secondary_negative_limit_angle: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_secondary_negative_limit_angle: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_secondary_negative_damp_threshold: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_secondary_negative_damp_threshold: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_interpolation_remaining: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_interpolating: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_target_within_limitation: GDExtensionMethodBindPtr = null
}
