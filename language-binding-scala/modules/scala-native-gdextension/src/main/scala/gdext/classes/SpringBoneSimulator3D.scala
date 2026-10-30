package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `SpringBoneSimulator3D`, extends `SkeletonModifier3D`. */
abstract class SpringBoneSimulator3D extends SkeletonModifier3D {
  override def godotClassName: String = "SpringBoneSimulator3D"

  /** SpringBoneSimulator3D.set_root_bone_name */
  final def setRootBoneName(index: Long, boneName: String): Unit = {
    if (gdext.classes.SpringBoneSimulator3D.mb_set_root_bone_name == null) gdext.classes.SpringBoneSimulator3D.mb_set_root_bone_name = MethodBind.get("SpringBoneSimulator3D", "set_root_bone_name", 501894301L)
    Ptrcall.callVoid2(gdext.classes.SpringBoneSimulator3D.mb_set_root_bone_name, livePtr, index, boneName)
  }

  /** SpringBoneSimulator3D.get_root_bone_name */
  final def getRootBoneName(index: Long): String = {
    if (gdext.classes.SpringBoneSimulator3D.mb_get_root_bone_name == null) gdext.classes.SpringBoneSimulator3D.mb_get_root_bone_name = MethodBind.get("SpringBoneSimulator3D", "get_root_bone_name", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.SpringBoneSimulator3D.mb_get_root_bone_name, livePtr, index)
  }

  /** SpringBoneSimulator3D.set_root_bone */
  final def setRootBone(index: Long, bone: Long): Unit = {
    if (gdext.classes.SpringBoneSimulator3D.mb_set_root_bone == null) gdext.classes.SpringBoneSimulator3D.mb_set_root_bone = MethodBind.get("SpringBoneSimulator3D", "set_root_bone", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.SpringBoneSimulator3D.mb_set_root_bone, livePtr, index, bone)
  }

  /** SpringBoneSimulator3D.get_root_bone */
  final def getRootBone(index: Long): Long = {
    if (gdext.classes.SpringBoneSimulator3D.mb_get_root_bone == null) gdext.classes.SpringBoneSimulator3D.mb_get_root_bone = MethodBind.get("SpringBoneSimulator3D", "get_root_bone", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.SpringBoneSimulator3D.mb_get_root_bone, livePtr, index)
  }

  /** SpringBoneSimulator3D.set_end_bone_name */
  final def setEndBoneName(index: Long, boneName: String): Unit = {
    if (gdext.classes.SpringBoneSimulator3D.mb_set_end_bone_name == null) gdext.classes.SpringBoneSimulator3D.mb_set_end_bone_name = MethodBind.get("SpringBoneSimulator3D", "set_end_bone_name", 501894301L)
    Ptrcall.callVoid2(gdext.classes.SpringBoneSimulator3D.mb_set_end_bone_name, livePtr, index, boneName)
  }

  /** SpringBoneSimulator3D.get_end_bone_name */
  final def getEndBoneName(index: Long): String = {
    if (gdext.classes.SpringBoneSimulator3D.mb_get_end_bone_name == null) gdext.classes.SpringBoneSimulator3D.mb_get_end_bone_name = MethodBind.get("SpringBoneSimulator3D", "get_end_bone_name", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.SpringBoneSimulator3D.mb_get_end_bone_name, livePtr, index)
  }

  /** SpringBoneSimulator3D.set_end_bone */
  final def setEndBone(index: Long, bone: Long): Unit = {
    if (gdext.classes.SpringBoneSimulator3D.mb_set_end_bone == null) gdext.classes.SpringBoneSimulator3D.mb_set_end_bone = MethodBind.get("SpringBoneSimulator3D", "set_end_bone", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.SpringBoneSimulator3D.mb_set_end_bone, livePtr, index, bone)
  }

  /** SpringBoneSimulator3D.get_end_bone */
  final def getEndBone(index: Long): Long = {
    if (gdext.classes.SpringBoneSimulator3D.mb_get_end_bone == null) gdext.classes.SpringBoneSimulator3D.mb_get_end_bone = MethodBind.get("SpringBoneSimulator3D", "get_end_bone", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.SpringBoneSimulator3D.mb_get_end_bone, livePtr, index)
  }

  /** SpringBoneSimulator3D.set_extend_end_bone */
  final def setExtendEndBone(index: Long, enabled: Boolean): Unit = {
    if (gdext.classes.SpringBoneSimulator3D.mb_set_extend_end_bone == null) gdext.classes.SpringBoneSimulator3D.mb_set_extend_end_bone = MethodBind.get("SpringBoneSimulator3D", "set_extend_end_bone", 300928843L)
    Ptrcall.callVoid2(gdext.classes.SpringBoneSimulator3D.mb_set_extend_end_bone, livePtr, index, enabled)
  }

  /** SpringBoneSimulator3D.is_end_bone_extended */
  final def isEndBoneExtended(index: Long): Boolean = {
    if (gdext.classes.SpringBoneSimulator3D.mb_is_end_bone_extended == null) gdext.classes.SpringBoneSimulator3D.mb_is_end_bone_extended = MethodBind.get("SpringBoneSimulator3D", "is_end_bone_extended", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.SpringBoneSimulator3D.mb_is_end_bone_extended, livePtr, index)
  }

  /** SpringBoneSimulator3D.set_end_bone_direction */
  final def setEndBoneDirection(index: Long, boneDirection: gdext.classes.SkeletonModifier3D.BoneDirection): Unit = {
    if (gdext.classes.SpringBoneSimulator3D.mb_set_end_bone_direction == null) gdext.classes.SpringBoneSimulator3D.mb_set_end_bone_direction = MethodBind.get("SpringBoneSimulator3D", "set_end_bone_direction", 2838484201L)
    Ptrcall.callVoid2(gdext.classes.SpringBoneSimulator3D.mb_set_end_bone_direction, livePtr, index, boneDirection)
  }

  /** SpringBoneSimulator3D.get_end_bone_direction */
  final def getEndBoneDirection(index: Long): gdext.classes.SkeletonModifier3D.BoneDirection = {
    if (gdext.classes.SpringBoneSimulator3D.mb_get_end_bone_direction == null) gdext.classes.SpringBoneSimulator3D.mb_get_end_bone_direction = MethodBind.get("SpringBoneSimulator3D", "get_end_bone_direction", 1843036459L)
    gdext.classes.SkeletonModifier3D.BoneDirection(Ptrcall.call1[Long, Long](gdext.classes.SpringBoneSimulator3D.mb_get_end_bone_direction, livePtr, index))
  }

  /** SpringBoneSimulator3D.set_end_bone_length */
  final def setEndBoneLength(index: Long, length: Double): Unit = {
    if (gdext.classes.SpringBoneSimulator3D.mb_set_end_bone_length == null) gdext.classes.SpringBoneSimulator3D.mb_set_end_bone_length = MethodBind.get("SpringBoneSimulator3D", "set_end_bone_length", 1602489585L)
    Ptrcall.callVoid2(gdext.classes.SpringBoneSimulator3D.mb_set_end_bone_length, livePtr, index, length)
  }

  /** SpringBoneSimulator3D.get_end_bone_length */
  final def getEndBoneLength(index: Long): Double = {
    if (gdext.classes.SpringBoneSimulator3D.mb_get_end_bone_length == null) gdext.classes.SpringBoneSimulator3D.mb_get_end_bone_length = MethodBind.get("SpringBoneSimulator3D", "get_end_bone_length", 2339986948L)
    Ptrcall.call1[Long, Double](gdext.classes.SpringBoneSimulator3D.mb_get_end_bone_length, livePtr, index)
  }

  /** SpringBoneSimulator3D.set_center_from */
  final def setCenterFrom(index: Long, centerFrom: gdext.classes.SpringBoneSimulator3D.CenterFrom): Unit = {
    if (gdext.classes.SpringBoneSimulator3D.mb_set_center_from == null) gdext.classes.SpringBoneSimulator3D.mb_set_center_from = MethodBind.get("SpringBoneSimulator3D", "set_center_from", 2551505749L)
    Ptrcall.callVoid2(gdext.classes.SpringBoneSimulator3D.mb_set_center_from, livePtr, index, centerFrom)
  }

  /** SpringBoneSimulator3D.get_center_from */
  final def getCenterFrom(index: Long): gdext.classes.SpringBoneSimulator3D.CenterFrom = {
    if (gdext.classes.SpringBoneSimulator3D.mb_get_center_from == null) gdext.classes.SpringBoneSimulator3D.mb_get_center_from = MethodBind.get("SpringBoneSimulator3D", "get_center_from", 2721930813L)
    gdext.classes.SpringBoneSimulator3D.CenterFrom(Ptrcall.call1[Long, Long](gdext.classes.SpringBoneSimulator3D.mb_get_center_from, livePtr, index))
  }

  /** SpringBoneSimulator3D.set_center_bone_name */
  final def setCenterBoneName(index: Long, boneName: String): Unit = {
    if (gdext.classes.SpringBoneSimulator3D.mb_set_center_bone_name == null) gdext.classes.SpringBoneSimulator3D.mb_set_center_bone_name = MethodBind.get("SpringBoneSimulator3D", "set_center_bone_name", 501894301L)
    Ptrcall.callVoid2(gdext.classes.SpringBoneSimulator3D.mb_set_center_bone_name, livePtr, index, boneName)
  }

  /** SpringBoneSimulator3D.get_center_bone_name */
  final def getCenterBoneName(index: Long): String = {
    if (gdext.classes.SpringBoneSimulator3D.mb_get_center_bone_name == null) gdext.classes.SpringBoneSimulator3D.mb_get_center_bone_name = MethodBind.get("SpringBoneSimulator3D", "get_center_bone_name", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.SpringBoneSimulator3D.mb_get_center_bone_name, livePtr, index)
  }

  /** SpringBoneSimulator3D.set_center_bone */
  final def setCenterBone(index: Long, bone: Long): Unit = {
    if (gdext.classes.SpringBoneSimulator3D.mb_set_center_bone == null) gdext.classes.SpringBoneSimulator3D.mb_set_center_bone = MethodBind.get("SpringBoneSimulator3D", "set_center_bone", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.SpringBoneSimulator3D.mb_set_center_bone, livePtr, index, bone)
  }

  /** SpringBoneSimulator3D.get_center_bone */
  final def getCenterBone(index: Long): Long = {
    if (gdext.classes.SpringBoneSimulator3D.mb_get_center_bone == null) gdext.classes.SpringBoneSimulator3D.mb_get_center_bone = MethodBind.get("SpringBoneSimulator3D", "get_center_bone", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.SpringBoneSimulator3D.mb_get_center_bone, livePtr, index)
  }

  /** SpringBoneSimulator3D.set_radius */
  final def setRadius(index: Long, radius: Double): Unit = {
    if (gdext.classes.SpringBoneSimulator3D.mb_set_radius == null) gdext.classes.SpringBoneSimulator3D.mb_set_radius = MethodBind.get("SpringBoneSimulator3D", "set_radius", 1602489585L)
    Ptrcall.callVoid2(gdext.classes.SpringBoneSimulator3D.mb_set_radius, livePtr, index, radius)
  }

  /** SpringBoneSimulator3D.get_radius */
  final def getRadius(index: Long): Double = {
    if (gdext.classes.SpringBoneSimulator3D.mb_get_radius == null) gdext.classes.SpringBoneSimulator3D.mb_get_radius = MethodBind.get("SpringBoneSimulator3D", "get_radius", 2339986948L)
    Ptrcall.call1[Long, Double](gdext.classes.SpringBoneSimulator3D.mb_get_radius, livePtr, index)
  }

  /** SpringBoneSimulator3D.set_rotation_axis */
  final def setRotationAxis(index: Long, axis: gdext.classes.SkeletonModifier3D.RotationAxis): Unit = {
    if (gdext.classes.SpringBoneSimulator3D.mb_set_rotation_axis == null) gdext.classes.SpringBoneSimulator3D.mb_set_rotation_axis = MethodBind.get("SpringBoneSimulator3D", "set_rotation_axis", 1539703856L)
    Ptrcall.callVoid2(gdext.classes.SpringBoneSimulator3D.mb_set_rotation_axis, livePtr, index, axis)
  }

  /** SpringBoneSimulator3D.get_rotation_axis */
  final def getRotationAxis(index: Long): gdext.classes.SkeletonModifier3D.RotationAxis = {
    if (gdext.classes.SpringBoneSimulator3D.mb_get_rotation_axis == null) gdext.classes.SpringBoneSimulator3D.mb_get_rotation_axis = MethodBind.get("SpringBoneSimulator3D", "get_rotation_axis", 2844851118L)
    gdext.classes.SkeletonModifier3D.RotationAxis(Ptrcall.call1[Long, Long](gdext.classes.SpringBoneSimulator3D.mb_get_rotation_axis, livePtr, index))
  }

  /** SpringBoneSimulator3D.set_rotation_axis_vector */
  final def setRotationAxisVector(index: Long, vector: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.SpringBoneSimulator3D.mb_set_rotation_axis_vector == null) gdext.classes.SpringBoneSimulator3D.mb_set_rotation_axis_vector = MethodBind.get("SpringBoneSimulator3D", "set_rotation_axis_vector", 1530502735L)
    Ptrcall.callVoid2(gdext.classes.SpringBoneSimulator3D.mb_set_rotation_axis_vector, livePtr, index, vector)
  }

  /** SpringBoneSimulator3D.get_rotation_axis_vector */
  final def getRotationAxisVector(index: Long): gdext.builtin.Vector3 = {
    if (gdext.classes.SpringBoneSimulator3D.mb_get_rotation_axis_vector == null) gdext.classes.SpringBoneSimulator3D.mb_get_rotation_axis_vector = MethodBind.get("SpringBoneSimulator3D", "get_rotation_axis_vector", 711720468L)
    Ptrcall.call1[Long, gdext.builtin.Vector3](gdext.classes.SpringBoneSimulator3D.mb_get_rotation_axis_vector, livePtr, index)
  }

  /** SpringBoneSimulator3D.set_radius_damping_curve */
  final def setRadiusDampingCurve(index: Long, curve: Curve): Unit = {
    if (gdext.classes.SpringBoneSimulator3D.mb_set_radius_damping_curve == null) gdext.classes.SpringBoneSimulator3D.mb_set_radius_damping_curve = MethodBind.get("SpringBoneSimulator3D", "set_radius_damping_curve", 1447180063L)
    Ptrcall.callVoid2(gdext.classes.SpringBoneSimulator3D.mb_set_radius_damping_curve, livePtr, index, Wrappers.handle(curve))
  }

  /** SpringBoneSimulator3D.get_radius_damping_curve. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getRadiusDampingCurve(index: Long): Curve = {
    if (gdext.classes.SpringBoneSimulator3D.mb_get_radius_damping_curve == null) gdext.classes.SpringBoneSimulator3D.mb_get_radius_damping_curve = MethodBind.get("SpringBoneSimulator3D", "get_radius_damping_curve", 747537754L)
    Wrappers.owned[Curve](Ptrcall.call1[Long, Long](gdext.classes.SpringBoneSimulator3D.mb_get_radius_damping_curve, livePtr, index))
  }

  /** SpringBoneSimulator3D.set_stiffness */
  final def setStiffness(index: Long, stiffness: Double): Unit = {
    if (gdext.classes.SpringBoneSimulator3D.mb_set_stiffness == null) gdext.classes.SpringBoneSimulator3D.mb_set_stiffness = MethodBind.get("SpringBoneSimulator3D", "set_stiffness", 1602489585L)
    Ptrcall.callVoid2(gdext.classes.SpringBoneSimulator3D.mb_set_stiffness, livePtr, index, stiffness)
  }

  /** SpringBoneSimulator3D.get_stiffness */
  final def getStiffness(index: Long): Double = {
    if (gdext.classes.SpringBoneSimulator3D.mb_get_stiffness == null) gdext.classes.SpringBoneSimulator3D.mb_get_stiffness = MethodBind.get("SpringBoneSimulator3D", "get_stiffness", 2339986948L)
    Ptrcall.call1[Long, Double](gdext.classes.SpringBoneSimulator3D.mb_get_stiffness, livePtr, index)
  }

  /** SpringBoneSimulator3D.set_stiffness_damping_curve */
  final def setStiffnessDampingCurve(index: Long, curve: Curve): Unit = {
    if (gdext.classes.SpringBoneSimulator3D.mb_set_stiffness_damping_curve == null) gdext.classes.SpringBoneSimulator3D.mb_set_stiffness_damping_curve = MethodBind.get("SpringBoneSimulator3D", "set_stiffness_damping_curve", 1447180063L)
    Ptrcall.callVoid2(gdext.classes.SpringBoneSimulator3D.mb_set_stiffness_damping_curve, livePtr, index, Wrappers.handle(curve))
  }

  /** SpringBoneSimulator3D.get_stiffness_damping_curve. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getStiffnessDampingCurve(index: Long): Curve = {
    if (gdext.classes.SpringBoneSimulator3D.mb_get_stiffness_damping_curve == null) gdext.classes.SpringBoneSimulator3D.mb_get_stiffness_damping_curve = MethodBind.get("SpringBoneSimulator3D", "get_stiffness_damping_curve", 747537754L)
    Wrappers.owned[Curve](Ptrcall.call1[Long, Long](gdext.classes.SpringBoneSimulator3D.mb_get_stiffness_damping_curve, livePtr, index))
  }

  /** SpringBoneSimulator3D.set_drag */
  final def setDrag(index: Long, drag: Double): Unit = {
    if (gdext.classes.SpringBoneSimulator3D.mb_set_drag == null) gdext.classes.SpringBoneSimulator3D.mb_set_drag = MethodBind.get("SpringBoneSimulator3D", "set_drag", 1602489585L)
    Ptrcall.callVoid2(gdext.classes.SpringBoneSimulator3D.mb_set_drag, livePtr, index, drag)
  }

  /** SpringBoneSimulator3D.get_drag */
  final def getDrag(index: Long): Double = {
    if (gdext.classes.SpringBoneSimulator3D.mb_get_drag == null) gdext.classes.SpringBoneSimulator3D.mb_get_drag = MethodBind.get("SpringBoneSimulator3D", "get_drag", 2339986948L)
    Ptrcall.call1[Long, Double](gdext.classes.SpringBoneSimulator3D.mb_get_drag, livePtr, index)
  }

  /** SpringBoneSimulator3D.set_drag_damping_curve */
  final def setDragDampingCurve(index: Long, curve: Curve): Unit = {
    if (gdext.classes.SpringBoneSimulator3D.mb_set_drag_damping_curve == null) gdext.classes.SpringBoneSimulator3D.mb_set_drag_damping_curve = MethodBind.get("SpringBoneSimulator3D", "set_drag_damping_curve", 1447180063L)
    Ptrcall.callVoid2(gdext.classes.SpringBoneSimulator3D.mb_set_drag_damping_curve, livePtr, index, Wrappers.handle(curve))
  }

  /** SpringBoneSimulator3D.get_drag_damping_curve. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getDragDampingCurve(index: Long): Curve = {
    if (gdext.classes.SpringBoneSimulator3D.mb_get_drag_damping_curve == null) gdext.classes.SpringBoneSimulator3D.mb_get_drag_damping_curve = MethodBind.get("SpringBoneSimulator3D", "get_drag_damping_curve", 747537754L)
    Wrappers.owned[Curve](Ptrcall.call1[Long, Long](gdext.classes.SpringBoneSimulator3D.mb_get_drag_damping_curve, livePtr, index))
  }

  /** SpringBoneSimulator3D.set_gravity */
  final def setGravity(index: Long, gravity: Double): Unit = {
    if (gdext.classes.SpringBoneSimulator3D.mb_set_gravity == null) gdext.classes.SpringBoneSimulator3D.mb_set_gravity = MethodBind.get("SpringBoneSimulator3D", "set_gravity", 1602489585L)
    Ptrcall.callVoid2(gdext.classes.SpringBoneSimulator3D.mb_set_gravity, livePtr, index, gravity)
  }

  /** SpringBoneSimulator3D.get_gravity */
  final def getGravity(index: Long): Double = {
    if (gdext.classes.SpringBoneSimulator3D.mb_get_gravity == null) gdext.classes.SpringBoneSimulator3D.mb_get_gravity = MethodBind.get("SpringBoneSimulator3D", "get_gravity", 2339986948L)
    Ptrcall.call1[Long, Double](gdext.classes.SpringBoneSimulator3D.mb_get_gravity, livePtr, index)
  }

  /** SpringBoneSimulator3D.set_gravity_damping_curve */
  final def setGravityDampingCurve(index: Long, curve: Curve): Unit = {
    if (gdext.classes.SpringBoneSimulator3D.mb_set_gravity_damping_curve == null) gdext.classes.SpringBoneSimulator3D.mb_set_gravity_damping_curve = MethodBind.get("SpringBoneSimulator3D", "set_gravity_damping_curve", 1447180063L)
    Ptrcall.callVoid2(gdext.classes.SpringBoneSimulator3D.mb_set_gravity_damping_curve, livePtr, index, Wrappers.handle(curve))
  }

  /** SpringBoneSimulator3D.get_gravity_damping_curve. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getGravityDampingCurve(index: Long): Curve = {
    if (gdext.classes.SpringBoneSimulator3D.mb_get_gravity_damping_curve == null) gdext.classes.SpringBoneSimulator3D.mb_get_gravity_damping_curve = MethodBind.get("SpringBoneSimulator3D", "get_gravity_damping_curve", 747537754L)
    Wrappers.owned[Curve](Ptrcall.call1[Long, Long](gdext.classes.SpringBoneSimulator3D.mb_get_gravity_damping_curve, livePtr, index))
  }

  /** SpringBoneSimulator3D.set_gravity_direction */
  final def setGravityDirection(index: Long, gravityDirection: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.SpringBoneSimulator3D.mb_set_gravity_direction == null) gdext.classes.SpringBoneSimulator3D.mb_set_gravity_direction = MethodBind.get("SpringBoneSimulator3D", "set_gravity_direction", 1530502735L)
    Ptrcall.callVoid2(gdext.classes.SpringBoneSimulator3D.mb_set_gravity_direction, livePtr, index, gravityDirection)
  }

  /** SpringBoneSimulator3D.get_gravity_direction */
  final def getGravityDirection(index: Long): gdext.builtin.Vector3 = {
    if (gdext.classes.SpringBoneSimulator3D.mb_get_gravity_direction == null) gdext.classes.SpringBoneSimulator3D.mb_get_gravity_direction = MethodBind.get("SpringBoneSimulator3D", "get_gravity_direction", 711720468L)
    Ptrcall.call1[Long, gdext.builtin.Vector3](gdext.classes.SpringBoneSimulator3D.mb_get_gravity_direction, livePtr, index)
  }

  /** SpringBoneSimulator3D.set_setting_count */
  final def setSettingCount(count: Long): Unit = {
    if (gdext.classes.SpringBoneSimulator3D.mb_set_setting_count == null) gdext.classes.SpringBoneSimulator3D.mb_set_setting_count = MethodBind.get("SpringBoneSimulator3D", "set_setting_count", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.SpringBoneSimulator3D.mb_set_setting_count, livePtr, count)
  }

  /** SpringBoneSimulator3D.get_setting_count */
  final def getSettingCount(): Long = {
    if (gdext.classes.SpringBoneSimulator3D.mb_get_setting_count == null) gdext.classes.SpringBoneSimulator3D.mb_get_setting_count = MethodBind.get("SpringBoneSimulator3D", "get_setting_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.SpringBoneSimulator3D.mb_get_setting_count, livePtr)
  }

  /** SpringBoneSimulator3D.clear_settings */
  final def clearSettings(): Unit = {
    if (gdext.classes.SpringBoneSimulator3D.mb_clear_settings == null) gdext.classes.SpringBoneSimulator3D.mb_clear_settings = MethodBind.get("SpringBoneSimulator3D", "clear_settings", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.SpringBoneSimulator3D.mb_clear_settings, livePtr)
  }

  /** SpringBoneSimulator3D.set_individual_config */
  final def setIndividualConfig(index: Long, enabled: Boolean): Unit = {
    if (gdext.classes.SpringBoneSimulator3D.mb_set_individual_config == null) gdext.classes.SpringBoneSimulator3D.mb_set_individual_config = MethodBind.get("SpringBoneSimulator3D", "set_individual_config", 300928843L)
    Ptrcall.callVoid2(gdext.classes.SpringBoneSimulator3D.mb_set_individual_config, livePtr, index, enabled)
  }

  /** SpringBoneSimulator3D.is_config_individual */
  final def isConfigIndividual(index: Long): Boolean = {
    if (gdext.classes.SpringBoneSimulator3D.mb_is_config_individual == null) gdext.classes.SpringBoneSimulator3D.mb_is_config_individual = MethodBind.get("SpringBoneSimulator3D", "is_config_individual", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.SpringBoneSimulator3D.mb_is_config_individual, livePtr, index)
  }

  /** SpringBoneSimulator3D.get_joint_bone_name */
  final def getJointBoneName(index: Long, joint: Long): String = {
    if (gdext.classes.SpringBoneSimulator3D.mb_get_joint_bone_name == null) gdext.classes.SpringBoneSimulator3D.mb_get_joint_bone_name = MethodBind.get("SpringBoneSimulator3D", "get_joint_bone_name", 1391810591L)
    Ptrcall.call2[Long, Long, String](gdext.classes.SpringBoneSimulator3D.mb_get_joint_bone_name, livePtr, index, joint)
  }

  /** SpringBoneSimulator3D.get_joint_bone */
  final def getJointBone(index: Long, joint: Long): Long = {
    if (gdext.classes.SpringBoneSimulator3D.mb_get_joint_bone == null) gdext.classes.SpringBoneSimulator3D.mb_get_joint_bone = MethodBind.get("SpringBoneSimulator3D", "get_joint_bone", 3175239445L)
    Ptrcall.call2[Long, Long, Long](gdext.classes.SpringBoneSimulator3D.mb_get_joint_bone, livePtr, index, joint)
  }

  /** SpringBoneSimulator3D.set_joint_rotation_axis */
  final def setJointRotationAxis(index: Long, joint: Long, axis: gdext.classes.SkeletonModifier3D.RotationAxis): Unit = {
    if (gdext.classes.SpringBoneSimulator3D.mb_set_joint_rotation_axis == null) gdext.classes.SpringBoneSimulator3D.mb_set_joint_rotation_axis = MethodBind.get("SpringBoneSimulator3D", "set_joint_rotation_axis", 1391134969L)
    Ptrcall.callVoid3(gdext.classes.SpringBoneSimulator3D.mb_set_joint_rotation_axis, livePtr, index, joint, axis)
  }

  /** SpringBoneSimulator3D.get_joint_rotation_axis */
  final def getJointRotationAxis(index: Long, joint: Long): gdext.classes.SkeletonModifier3D.RotationAxis = {
    if (gdext.classes.SpringBoneSimulator3D.mb_get_joint_rotation_axis == null) gdext.classes.SpringBoneSimulator3D.mb_get_joint_rotation_axis = MethodBind.get("SpringBoneSimulator3D", "get_joint_rotation_axis", 3312594080L)
    gdext.classes.SkeletonModifier3D.RotationAxis(Ptrcall.call2[Long, Long, Long](gdext.classes.SpringBoneSimulator3D.mb_get_joint_rotation_axis, livePtr, index, joint))
  }

  /** SpringBoneSimulator3D.set_joint_rotation_axis_vector */
  final def setJointRotationAxisVector(index: Long, joint: Long, vector: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.SpringBoneSimulator3D.mb_set_joint_rotation_axis_vector == null) gdext.classes.SpringBoneSimulator3D.mb_set_joint_rotation_axis_vector = MethodBind.get("SpringBoneSimulator3D", "set_joint_rotation_axis_vector", 2866752138L)
    Ptrcall.callVoid3(gdext.classes.SpringBoneSimulator3D.mb_set_joint_rotation_axis_vector, livePtr, index, joint, vector)
  }

  /** SpringBoneSimulator3D.get_joint_rotation_axis_vector */
  final def getJointRotationAxisVector(index: Long, joint: Long): gdext.builtin.Vector3 = {
    if (gdext.classes.SpringBoneSimulator3D.mb_get_joint_rotation_axis_vector == null) gdext.classes.SpringBoneSimulator3D.mb_get_joint_rotation_axis_vector = MethodBind.get("SpringBoneSimulator3D", "get_joint_rotation_axis_vector", 1592972041L)
    Ptrcall.call2[Long, Long, gdext.builtin.Vector3](gdext.classes.SpringBoneSimulator3D.mb_get_joint_rotation_axis_vector, livePtr, index, joint)
  }

  /** SpringBoneSimulator3D.set_joint_radius */
  final def setJointRadius(index: Long, joint: Long, radius: Double): Unit = {
    if (gdext.classes.SpringBoneSimulator3D.mb_set_joint_radius == null) gdext.classes.SpringBoneSimulator3D.mb_set_joint_radius = MethodBind.get("SpringBoneSimulator3D", "set_joint_radius", 3506521499L)
    Ptrcall.callVoid3(gdext.classes.SpringBoneSimulator3D.mb_set_joint_radius, livePtr, index, joint, radius)
  }

  /** SpringBoneSimulator3D.get_joint_radius */
  final def getJointRadius(index: Long, joint: Long): Double = {
    if (gdext.classes.SpringBoneSimulator3D.mb_get_joint_radius == null) gdext.classes.SpringBoneSimulator3D.mb_get_joint_radius = MethodBind.get("SpringBoneSimulator3D", "get_joint_radius", 3085491603L)
    Ptrcall.call2[Long, Long, Double](gdext.classes.SpringBoneSimulator3D.mb_get_joint_radius, livePtr, index, joint)
  }

  /** SpringBoneSimulator3D.set_joint_stiffness */
  final def setJointStiffness(index: Long, joint: Long, stiffness: Double): Unit = {
    if (gdext.classes.SpringBoneSimulator3D.mb_set_joint_stiffness == null) gdext.classes.SpringBoneSimulator3D.mb_set_joint_stiffness = MethodBind.get("SpringBoneSimulator3D", "set_joint_stiffness", 3506521499L)
    Ptrcall.callVoid3(gdext.classes.SpringBoneSimulator3D.mb_set_joint_stiffness, livePtr, index, joint, stiffness)
  }

  /** SpringBoneSimulator3D.get_joint_stiffness */
  final def getJointStiffness(index: Long, joint: Long): Double = {
    if (gdext.classes.SpringBoneSimulator3D.mb_get_joint_stiffness == null) gdext.classes.SpringBoneSimulator3D.mb_get_joint_stiffness = MethodBind.get("SpringBoneSimulator3D", "get_joint_stiffness", 3085491603L)
    Ptrcall.call2[Long, Long, Double](gdext.classes.SpringBoneSimulator3D.mb_get_joint_stiffness, livePtr, index, joint)
  }

  /** SpringBoneSimulator3D.set_joint_drag */
  final def setJointDrag(index: Long, joint: Long, drag: Double): Unit = {
    if (gdext.classes.SpringBoneSimulator3D.mb_set_joint_drag == null) gdext.classes.SpringBoneSimulator3D.mb_set_joint_drag = MethodBind.get("SpringBoneSimulator3D", "set_joint_drag", 3506521499L)
    Ptrcall.callVoid3(gdext.classes.SpringBoneSimulator3D.mb_set_joint_drag, livePtr, index, joint, drag)
  }

  /** SpringBoneSimulator3D.get_joint_drag */
  final def getJointDrag(index: Long, joint: Long): Double = {
    if (gdext.classes.SpringBoneSimulator3D.mb_get_joint_drag == null) gdext.classes.SpringBoneSimulator3D.mb_get_joint_drag = MethodBind.get("SpringBoneSimulator3D", "get_joint_drag", 3085491603L)
    Ptrcall.call2[Long, Long, Double](gdext.classes.SpringBoneSimulator3D.mb_get_joint_drag, livePtr, index, joint)
  }

  /** SpringBoneSimulator3D.set_joint_gravity */
  final def setJointGravity(index: Long, joint: Long, gravity: Double): Unit = {
    if (gdext.classes.SpringBoneSimulator3D.mb_set_joint_gravity == null) gdext.classes.SpringBoneSimulator3D.mb_set_joint_gravity = MethodBind.get("SpringBoneSimulator3D", "set_joint_gravity", 3506521499L)
    Ptrcall.callVoid3(gdext.classes.SpringBoneSimulator3D.mb_set_joint_gravity, livePtr, index, joint, gravity)
  }

  /** SpringBoneSimulator3D.get_joint_gravity */
  final def getJointGravity(index: Long, joint: Long): Double = {
    if (gdext.classes.SpringBoneSimulator3D.mb_get_joint_gravity == null) gdext.classes.SpringBoneSimulator3D.mb_get_joint_gravity = MethodBind.get("SpringBoneSimulator3D", "get_joint_gravity", 3085491603L)
    Ptrcall.call2[Long, Long, Double](gdext.classes.SpringBoneSimulator3D.mb_get_joint_gravity, livePtr, index, joint)
  }

  /** SpringBoneSimulator3D.set_joint_gravity_direction */
  final def setJointGravityDirection(index: Long, joint: Long, gravityDirection: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.SpringBoneSimulator3D.mb_set_joint_gravity_direction == null) gdext.classes.SpringBoneSimulator3D.mb_set_joint_gravity_direction = MethodBind.get("SpringBoneSimulator3D", "set_joint_gravity_direction", 2866752138L)
    Ptrcall.callVoid3(gdext.classes.SpringBoneSimulator3D.mb_set_joint_gravity_direction, livePtr, index, joint, gravityDirection)
  }

  /** SpringBoneSimulator3D.get_joint_gravity_direction */
  final def getJointGravityDirection(index: Long, joint: Long): gdext.builtin.Vector3 = {
    if (gdext.classes.SpringBoneSimulator3D.mb_get_joint_gravity_direction == null) gdext.classes.SpringBoneSimulator3D.mb_get_joint_gravity_direction = MethodBind.get("SpringBoneSimulator3D", "get_joint_gravity_direction", 1592972041L)
    Ptrcall.call2[Long, Long, gdext.builtin.Vector3](gdext.classes.SpringBoneSimulator3D.mb_get_joint_gravity_direction, livePtr, index, joint)
  }

  /** SpringBoneSimulator3D.get_joint_count */
  final def getJointCount(index: Long): Long = {
    if (gdext.classes.SpringBoneSimulator3D.mb_get_joint_count == null) gdext.classes.SpringBoneSimulator3D.mb_get_joint_count = MethodBind.get("SpringBoneSimulator3D", "get_joint_count", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.SpringBoneSimulator3D.mb_get_joint_count, livePtr, index)
  }

  /** SpringBoneSimulator3D.set_enable_all_child_collisions */
  final def setEnableAllChildCollisions(index: Long, enabled: Boolean): Unit = {
    if (gdext.classes.SpringBoneSimulator3D.mb_set_enable_all_child_collisions == null) gdext.classes.SpringBoneSimulator3D.mb_set_enable_all_child_collisions = MethodBind.get("SpringBoneSimulator3D", "set_enable_all_child_collisions", 300928843L)
    Ptrcall.callVoid2(gdext.classes.SpringBoneSimulator3D.mb_set_enable_all_child_collisions, livePtr, index, enabled)
  }

  /** SpringBoneSimulator3D.are_all_child_collisions_enabled */
  final def areAllChildCollisionsEnabled(index: Long): Boolean = {
    if (gdext.classes.SpringBoneSimulator3D.mb_are_all_child_collisions_enabled == null) gdext.classes.SpringBoneSimulator3D.mb_are_all_child_collisions_enabled = MethodBind.get("SpringBoneSimulator3D", "are_all_child_collisions_enabled", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.SpringBoneSimulator3D.mb_are_all_child_collisions_enabled, livePtr, index)
  }

  /** SpringBoneSimulator3D.set_exclude_collision_count */
  final def setExcludeCollisionCount(index: Long, count: Long): Unit = {
    if (gdext.classes.SpringBoneSimulator3D.mb_set_exclude_collision_count == null) gdext.classes.SpringBoneSimulator3D.mb_set_exclude_collision_count = MethodBind.get("SpringBoneSimulator3D", "set_exclude_collision_count", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.SpringBoneSimulator3D.mb_set_exclude_collision_count, livePtr, index, count)
  }

  /** SpringBoneSimulator3D.get_exclude_collision_count */
  final def getExcludeCollisionCount(index: Long): Long = {
    if (gdext.classes.SpringBoneSimulator3D.mb_get_exclude_collision_count == null) gdext.classes.SpringBoneSimulator3D.mb_get_exclude_collision_count = MethodBind.get("SpringBoneSimulator3D", "get_exclude_collision_count", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.SpringBoneSimulator3D.mb_get_exclude_collision_count, livePtr, index)
  }

  /** SpringBoneSimulator3D.clear_exclude_collisions */
  final def clearExcludeCollisions(index: Long): Unit = {
    if (gdext.classes.SpringBoneSimulator3D.mb_clear_exclude_collisions == null) gdext.classes.SpringBoneSimulator3D.mb_clear_exclude_collisions = MethodBind.get("SpringBoneSimulator3D", "clear_exclude_collisions", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.SpringBoneSimulator3D.mb_clear_exclude_collisions, livePtr, index)
  }

  /** SpringBoneSimulator3D.set_collision_count */
  final def setCollisionCount(index: Long, count: Long): Unit = {
    if (gdext.classes.SpringBoneSimulator3D.mb_set_collision_count == null) gdext.classes.SpringBoneSimulator3D.mb_set_collision_count = MethodBind.get("SpringBoneSimulator3D", "set_collision_count", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.SpringBoneSimulator3D.mb_set_collision_count, livePtr, index, count)
  }

  /** SpringBoneSimulator3D.get_collision_count */
  final def getCollisionCount(index: Long): Long = {
    if (gdext.classes.SpringBoneSimulator3D.mb_get_collision_count == null) gdext.classes.SpringBoneSimulator3D.mb_get_collision_count = MethodBind.get("SpringBoneSimulator3D", "get_collision_count", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.SpringBoneSimulator3D.mb_get_collision_count, livePtr, index)
  }

  /** SpringBoneSimulator3D.clear_collisions */
  final def clearCollisions(index: Long): Unit = {
    if (gdext.classes.SpringBoneSimulator3D.mb_clear_collisions == null) gdext.classes.SpringBoneSimulator3D.mb_clear_collisions = MethodBind.get("SpringBoneSimulator3D", "clear_collisions", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.SpringBoneSimulator3D.mb_clear_collisions, livePtr, index)
  }

  /** SpringBoneSimulator3D.set_external_force */
  final def setExternalForce(force: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.SpringBoneSimulator3D.mb_set_external_force == null) gdext.classes.SpringBoneSimulator3D.mb_set_external_force = MethodBind.get("SpringBoneSimulator3D", "set_external_force", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.SpringBoneSimulator3D.mb_set_external_force, livePtr, force)
  }

  /** SpringBoneSimulator3D.get_external_force */
  final def getExternalForce(): gdext.builtin.Vector3 = {
    if (gdext.classes.SpringBoneSimulator3D.mb_get_external_force == null) gdext.classes.SpringBoneSimulator3D.mb_get_external_force = MethodBind.get("SpringBoneSimulator3D", "get_external_force", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.SpringBoneSimulator3D.mb_get_external_force, livePtr)
  }

  /** SpringBoneSimulator3D.set_mutable_bone_axes */
  final def setMutableBoneAxes(enabled: Boolean): Unit = {
    if (gdext.classes.SpringBoneSimulator3D.mb_set_mutable_bone_axes == null) gdext.classes.SpringBoneSimulator3D.mb_set_mutable_bone_axes = MethodBind.get("SpringBoneSimulator3D", "set_mutable_bone_axes", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.SpringBoneSimulator3D.mb_set_mutable_bone_axes, livePtr, enabled)
  }

  /** SpringBoneSimulator3D.are_bone_axes_mutable */
  final def areBoneAxesMutable(): Boolean = {
    if (gdext.classes.SpringBoneSimulator3D.mb_are_bone_axes_mutable == null) gdext.classes.SpringBoneSimulator3D.mb_are_bone_axes_mutable = MethodBind.get("SpringBoneSimulator3D", "are_bone_axes_mutable", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.SpringBoneSimulator3D.mb_are_bone_axes_mutable, livePtr)
  }

  /** SpringBoneSimulator3D.reset */
  final def reset(): Unit = {
    if (gdext.classes.SpringBoneSimulator3D.mb_reset == null) gdext.classes.SpringBoneSimulator3D.mb_reset = MethodBind.get("SpringBoneSimulator3D", "reset", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.SpringBoneSimulator3D.mb_reset, livePtr)
  }

}

object SpringBoneSimulator3D {
  private[classes] var mb_set_root_bone_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_root_bone_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_root_bone: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_root_bone: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_end_bone_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_end_bone_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_end_bone: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_end_bone: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_extend_end_bone: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_end_bone_extended: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_end_bone_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_end_bone_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_end_bone_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_end_bone_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_center_from: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_center_from: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_center_bone_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_center_bone_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_center_bone: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_center_bone: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_rotation_axis: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_rotation_axis: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_rotation_axis_vector: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_rotation_axis_vector: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_radius_damping_curve: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_radius_damping_curve: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_stiffness: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_stiffness: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_stiffness_damping_curve: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_stiffness_damping_curve: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_drag: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_drag: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_drag_damping_curve: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_drag_damping_curve: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_gravity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_gravity: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_gravity_damping_curve: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_gravity_damping_curve: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_gravity_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_gravity_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_setting_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_setting_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_settings: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_individual_config: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_config_individual: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_joint_bone_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_joint_bone: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_joint_rotation_axis: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_joint_rotation_axis: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_joint_rotation_axis_vector: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_joint_rotation_axis_vector: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_joint_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_joint_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_joint_stiffness: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_joint_stiffness: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_joint_drag: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_joint_drag: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_joint_gravity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_joint_gravity: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_joint_gravity_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_joint_gravity_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_joint_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_enable_all_child_collisions: GDExtensionMethodBindPtr = null
  private[classes] var mb_are_all_child_collisions_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_exclude_collision_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_exclude_collision_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_exclude_collisions: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_collision_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collision_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_collisions: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_external_force: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_external_force: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_mutable_bone_axes: GDExtensionMethodBindPtr = null
  private[classes] var mb_are_bone_axes_mutable: GDExtensionMethodBindPtr = null
  private[classes] var mb_reset: GDExtensionMethodBindPtr = null

  /** Godot enum `SpringBoneSimulator3D.CenterFrom`. */
  opaque type CenterFrom <: Long = Long

  object CenterFrom {
    final val WorldOrigin: CenterFrom = 0L.asInstanceOf[CenterFrom]
    final val Node: CenterFrom = 1L.asInstanceOf[CenterFrom]
    final val Bone: CenterFrom = 2L.asInstanceOf[CenterFrom]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): CenterFrom = value.asInstanceOf[CenterFrom]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[CenterFrom] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[CenterFrom]]

    extension (self: CenterFrom)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "WorldOrigin"
        case 1L => "Node"
        case 2L => "Bone"
        case other => other.toString
      }
  }
}
