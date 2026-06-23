package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `SpringBoneSimulator3D`, extends `SkeletonModifier3D`. */
abstract class SpringBoneSimulator3D extends SkeletonModifier3D {

  /** SpringBoneSimulator3D.set_root_bone_name */
  final def setRootBoneName(index: Long, bone_name: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("SpringBoneSimulator3D", "set_root_bone_name", 501894301L), hostObject.objectPtr, index, bone_name)

  /** SpringBoneSimulator3D.get_root_bone_name */
  final def getRootBoneName(index: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("SpringBoneSimulator3D", "get_root_bone_name", 844755477L), hostObject.objectPtr, index)

  /** SpringBoneSimulator3D.set_root_bone */
  final def setRootBone(index: Long, bone: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("SpringBoneSimulator3D", "set_root_bone", 3937882851L), hostObject.objectPtr, index, bone)

  /** SpringBoneSimulator3D.get_root_bone */
  final def getRootBone(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("SpringBoneSimulator3D", "get_root_bone", 923996154L), hostObject.objectPtr, index)

  /** SpringBoneSimulator3D.set_end_bone_name */
  final def setEndBoneName(index: Long, bone_name: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("SpringBoneSimulator3D", "set_end_bone_name", 501894301L), hostObject.objectPtr, index, bone_name)

  /** SpringBoneSimulator3D.get_end_bone_name */
  final def getEndBoneName(index: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("SpringBoneSimulator3D", "get_end_bone_name", 844755477L), hostObject.objectPtr, index)

  /** SpringBoneSimulator3D.set_end_bone */
  final def setEndBone(index: Long, bone: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("SpringBoneSimulator3D", "set_end_bone", 3937882851L), hostObject.objectPtr, index, bone)

  /** SpringBoneSimulator3D.get_end_bone */
  final def getEndBone(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("SpringBoneSimulator3D", "get_end_bone", 923996154L), hostObject.objectPtr, index)

  /** SpringBoneSimulator3D.set_extend_end_bone */
  final def setExtendEndBone(index: Long, enabled: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("SpringBoneSimulator3D", "set_extend_end_bone", 300928843L), hostObject.objectPtr, index, enabled)

  /** SpringBoneSimulator3D.is_end_bone_extended */
  final def isEndBoneExtended(index: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("SpringBoneSimulator3D", "is_end_bone_extended", 1116898809L), hostObject.objectPtr, index)

  /** SpringBoneSimulator3D.set_end_bone_direction */
  final def setEndBoneDirection(index: Long, bone_direction: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("SpringBoneSimulator3D", "set_end_bone_direction", 2838484201L), hostObject.objectPtr, index, bone_direction)

  /** SpringBoneSimulator3D.get_end_bone_direction */
  final def getEndBoneDirection(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("SpringBoneSimulator3D", "get_end_bone_direction", 1843036459L), hostObject.objectPtr, index)

  /** SpringBoneSimulator3D.set_end_bone_length */
  final def setEndBoneLength(index: Long, length: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("SpringBoneSimulator3D", "set_end_bone_length", 1602489585L), hostObject.objectPtr, index, length)

  /** SpringBoneSimulator3D.get_end_bone_length */
  final def getEndBoneLength(index: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("SpringBoneSimulator3D", "get_end_bone_length", 2339986948L), hostObject.objectPtr, index)

  /** SpringBoneSimulator3D.set_center_from */
  final def setCenterFrom(index: Long, center_from: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("SpringBoneSimulator3D", "set_center_from", 2551505749L), hostObject.objectPtr, index, center_from)

  /** SpringBoneSimulator3D.get_center_from */
  final def getCenterFrom(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("SpringBoneSimulator3D", "get_center_from", 2721930813L), hostObject.objectPtr, index)

  /** SpringBoneSimulator3D.set_center_bone_name */
  final def setCenterBoneName(index: Long, bone_name: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("SpringBoneSimulator3D", "set_center_bone_name", 501894301L), hostObject.objectPtr, index, bone_name)

  /** SpringBoneSimulator3D.get_center_bone_name */
  final def getCenterBoneName(index: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("SpringBoneSimulator3D", "get_center_bone_name", 844755477L), hostObject.objectPtr, index)

  /** SpringBoneSimulator3D.set_center_bone */
  final def setCenterBone(index: Long, bone: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("SpringBoneSimulator3D", "set_center_bone", 3937882851L), hostObject.objectPtr, index, bone)

  /** SpringBoneSimulator3D.get_center_bone */
  final def getCenterBone(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("SpringBoneSimulator3D", "get_center_bone", 923996154L), hostObject.objectPtr, index)

  /** SpringBoneSimulator3D.set_radius */
  final def setRadius(index: Long, radius: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("SpringBoneSimulator3D", "set_radius", 1602489585L), hostObject.objectPtr, index, radius)

  /** SpringBoneSimulator3D.get_radius */
  final def getRadius(index: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("SpringBoneSimulator3D", "get_radius", 2339986948L), hostObject.objectPtr, index)

  /** SpringBoneSimulator3D.set_rotation_axis */
  final def setRotationAxis(index: Long, axis: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("SpringBoneSimulator3D", "set_rotation_axis", 1539703856L), hostObject.objectPtr, index, axis)

  /** SpringBoneSimulator3D.get_rotation_axis */
  final def getRotationAxis(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("SpringBoneSimulator3D", "get_rotation_axis", 2844851118L), hostObject.objectPtr, index)

  /** SpringBoneSimulator3D.set_rotation_axis_vector */
  final def setRotationAxisVector(index: Long, vector: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid2(MethodBind.get("SpringBoneSimulator3D", "set_rotation_axis_vector", 1530502735L), hostObject.objectPtr, index, vector)

  /** SpringBoneSimulator3D.get_rotation_axis_vector */
  final def getRotationAxisVector(index: Long): gdext.builtin.Vector3 =
    Ptrcall.call1[Long, gdext.builtin.Vector3](MethodBind.get("SpringBoneSimulator3D", "get_rotation_axis_vector", 711720468L), hostObject.objectPtr, index)

  /** SpringBoneSimulator3D.set_radius_damping_curve */
  final def setRadiusDampingCurve(index: Long, curve: Curve): Unit =
    Ptrcall.callVoid2(MethodBind.get("SpringBoneSimulator3D", "set_radius_damping_curve", 1447180063L), hostObject.objectPtr, index, curve.hostObject)

  /** SpringBoneSimulator3D.get_radius_damping_curve */
  final def getRadiusDampingCurve(index: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("SpringBoneSimulator3D", "get_radius_damping_curve", 747537754L), hostObject.objectPtr, index)

  /** SpringBoneSimulator3D.set_stiffness */
  final def setStiffness(index: Long, stiffness: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("SpringBoneSimulator3D", "set_stiffness", 1602489585L), hostObject.objectPtr, index, stiffness)

  /** SpringBoneSimulator3D.get_stiffness */
  final def getStiffness(index: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("SpringBoneSimulator3D", "get_stiffness", 2339986948L), hostObject.objectPtr, index)

  /** SpringBoneSimulator3D.set_stiffness_damping_curve */
  final def setStiffnessDampingCurve(index: Long, curve: Curve): Unit =
    Ptrcall.callVoid2(MethodBind.get("SpringBoneSimulator3D", "set_stiffness_damping_curve", 1447180063L), hostObject.objectPtr, index, curve.hostObject)

  /** SpringBoneSimulator3D.get_stiffness_damping_curve */
  final def getStiffnessDampingCurve(index: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("SpringBoneSimulator3D", "get_stiffness_damping_curve", 747537754L), hostObject.objectPtr, index)

  /** SpringBoneSimulator3D.set_drag */
  final def setDrag(index: Long, drag: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("SpringBoneSimulator3D", "set_drag", 1602489585L), hostObject.objectPtr, index, drag)

  /** SpringBoneSimulator3D.get_drag */
  final def getDrag(index: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("SpringBoneSimulator3D", "get_drag", 2339986948L), hostObject.objectPtr, index)

  /** SpringBoneSimulator3D.set_drag_damping_curve */
  final def setDragDampingCurve(index: Long, curve: Curve): Unit =
    Ptrcall.callVoid2(MethodBind.get("SpringBoneSimulator3D", "set_drag_damping_curve", 1447180063L), hostObject.objectPtr, index, curve.hostObject)

  /** SpringBoneSimulator3D.get_drag_damping_curve */
  final def getDragDampingCurve(index: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("SpringBoneSimulator3D", "get_drag_damping_curve", 747537754L), hostObject.objectPtr, index)

  /** SpringBoneSimulator3D.set_gravity */
  final def setGravity(index: Long, gravity: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("SpringBoneSimulator3D", "set_gravity", 1602489585L), hostObject.objectPtr, index, gravity)

  /** SpringBoneSimulator3D.get_gravity */
  final def getGravity(index: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("SpringBoneSimulator3D", "get_gravity", 2339986948L), hostObject.objectPtr, index)

  /** SpringBoneSimulator3D.set_gravity_damping_curve */
  final def setGravityDampingCurve(index: Long, curve: Curve): Unit =
    Ptrcall.callVoid2(MethodBind.get("SpringBoneSimulator3D", "set_gravity_damping_curve", 1447180063L), hostObject.objectPtr, index, curve.hostObject)

  /** SpringBoneSimulator3D.get_gravity_damping_curve */
  final def getGravityDampingCurve(index: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("SpringBoneSimulator3D", "get_gravity_damping_curve", 747537754L), hostObject.objectPtr, index)

  /** SpringBoneSimulator3D.set_gravity_direction */
  final def setGravityDirection(index: Long, gravity_direction: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid2(MethodBind.get("SpringBoneSimulator3D", "set_gravity_direction", 1530502735L), hostObject.objectPtr, index, gravity_direction)

  /** SpringBoneSimulator3D.get_gravity_direction */
  final def getGravityDirection(index: Long): gdext.builtin.Vector3 =
    Ptrcall.call1[Long, gdext.builtin.Vector3](MethodBind.get("SpringBoneSimulator3D", "get_gravity_direction", 711720468L), hostObject.objectPtr, index)

  /** SpringBoneSimulator3D.set_setting_count */
  final def setSettingCount(count: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("SpringBoneSimulator3D", "set_setting_count", 1286410249L), hostObject.objectPtr, count)

  /** SpringBoneSimulator3D.get_setting_count */
  final def getSettingCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("SpringBoneSimulator3D", "get_setting_count", 3905245786L), hostObject.objectPtr)

  /** SpringBoneSimulator3D.clear_settings */
  final def clearSettings(): Unit =
    Ptrcall.callVoid0(MethodBind.get("SpringBoneSimulator3D", "clear_settings", 3218959716L), hostObject.objectPtr)

  /** SpringBoneSimulator3D.set_individual_config */
  final def setIndividualConfig(index: Long, enabled: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("SpringBoneSimulator3D", "set_individual_config", 300928843L), hostObject.objectPtr, index, enabled)

  /** SpringBoneSimulator3D.is_config_individual */
  final def isConfigIndividual(index: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("SpringBoneSimulator3D", "is_config_individual", 1116898809L), hostObject.objectPtr, index)

  /** SpringBoneSimulator3D.get_joint_bone_name */
  final def getJointBoneName(index: Long, joint: Long): String =
    Ptrcall.call2[Long, Long, String](MethodBind.get("SpringBoneSimulator3D", "get_joint_bone_name", 1391810591L), hostObject.objectPtr, index, joint)

  /** SpringBoneSimulator3D.get_joint_bone */
  final def getJointBone(index: Long, joint: Long): Long =
    Ptrcall.call2[Long, Long, Long](MethodBind.get("SpringBoneSimulator3D", "get_joint_bone", 3175239445L), hostObject.objectPtr, index, joint)

  /** SpringBoneSimulator3D.set_joint_rotation_axis */
  final def setJointRotationAxis(index: Long, joint: Long, axis: Long): Unit =
    Ptrcall.callVoid3(MethodBind.get("SpringBoneSimulator3D", "set_joint_rotation_axis", 1391134969L), hostObject.objectPtr, index, joint, axis)

  /** SpringBoneSimulator3D.get_joint_rotation_axis */
  final def getJointRotationAxis(index: Long, joint: Long): Long =
    Ptrcall.call2[Long, Long, Long](MethodBind.get("SpringBoneSimulator3D", "get_joint_rotation_axis", 3312594080L), hostObject.objectPtr, index, joint)

  /** SpringBoneSimulator3D.set_joint_rotation_axis_vector */
  final def setJointRotationAxisVector(index: Long, joint: Long, vector: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid3(MethodBind.get("SpringBoneSimulator3D", "set_joint_rotation_axis_vector", 2866752138L), hostObject.objectPtr, index, joint, vector)

  /** SpringBoneSimulator3D.get_joint_rotation_axis_vector */
  final def getJointRotationAxisVector(index: Long, joint: Long): gdext.builtin.Vector3 =
    Ptrcall.call2[Long, Long, gdext.builtin.Vector3](MethodBind.get("SpringBoneSimulator3D", "get_joint_rotation_axis_vector", 1592972041L), hostObject.objectPtr, index, joint)

  /** SpringBoneSimulator3D.set_joint_radius */
  final def setJointRadius(index: Long, joint: Long, radius: Double): Unit =
    Ptrcall.callVoid3(MethodBind.get("SpringBoneSimulator3D", "set_joint_radius", 3506521499L), hostObject.objectPtr, index, joint, radius)

  /** SpringBoneSimulator3D.get_joint_radius */
  final def getJointRadius(index: Long, joint: Long): Double =
    Ptrcall.call2[Long, Long, Double](MethodBind.get("SpringBoneSimulator3D", "get_joint_radius", 3085491603L), hostObject.objectPtr, index, joint)

  /** SpringBoneSimulator3D.set_joint_stiffness */
  final def setJointStiffness(index: Long, joint: Long, stiffness: Double): Unit =
    Ptrcall.callVoid3(MethodBind.get("SpringBoneSimulator3D", "set_joint_stiffness", 3506521499L), hostObject.objectPtr, index, joint, stiffness)

  /** SpringBoneSimulator3D.get_joint_stiffness */
  final def getJointStiffness(index: Long, joint: Long): Double =
    Ptrcall.call2[Long, Long, Double](MethodBind.get("SpringBoneSimulator3D", "get_joint_stiffness", 3085491603L), hostObject.objectPtr, index, joint)

  /** SpringBoneSimulator3D.set_joint_drag */
  final def setJointDrag(index: Long, joint: Long, drag: Double): Unit =
    Ptrcall.callVoid3(MethodBind.get("SpringBoneSimulator3D", "set_joint_drag", 3506521499L), hostObject.objectPtr, index, joint, drag)

  /** SpringBoneSimulator3D.get_joint_drag */
  final def getJointDrag(index: Long, joint: Long): Double =
    Ptrcall.call2[Long, Long, Double](MethodBind.get("SpringBoneSimulator3D", "get_joint_drag", 3085491603L), hostObject.objectPtr, index, joint)

  /** SpringBoneSimulator3D.set_joint_gravity */
  final def setJointGravity(index: Long, joint: Long, gravity: Double): Unit =
    Ptrcall.callVoid3(MethodBind.get("SpringBoneSimulator3D", "set_joint_gravity", 3506521499L), hostObject.objectPtr, index, joint, gravity)

  /** SpringBoneSimulator3D.get_joint_gravity */
  final def getJointGravity(index: Long, joint: Long): Double =
    Ptrcall.call2[Long, Long, Double](MethodBind.get("SpringBoneSimulator3D", "get_joint_gravity", 3085491603L), hostObject.objectPtr, index, joint)

  /** SpringBoneSimulator3D.set_joint_gravity_direction */
  final def setJointGravityDirection(index: Long, joint: Long, gravity_direction: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid3(MethodBind.get("SpringBoneSimulator3D", "set_joint_gravity_direction", 2866752138L), hostObject.objectPtr, index, joint, gravity_direction)

  /** SpringBoneSimulator3D.get_joint_gravity_direction */
  final def getJointGravityDirection(index: Long, joint: Long): gdext.builtin.Vector3 =
    Ptrcall.call2[Long, Long, gdext.builtin.Vector3](MethodBind.get("SpringBoneSimulator3D", "get_joint_gravity_direction", 1592972041L), hostObject.objectPtr, index, joint)

  /** SpringBoneSimulator3D.get_joint_count */
  final def getJointCount(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("SpringBoneSimulator3D", "get_joint_count", 923996154L), hostObject.objectPtr, index)

  /** SpringBoneSimulator3D.set_enable_all_child_collisions */
  final def setEnableAllChildCollisions(index: Long, enabled: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("SpringBoneSimulator3D", "set_enable_all_child_collisions", 300928843L), hostObject.objectPtr, index, enabled)

  /** SpringBoneSimulator3D.are_all_child_collisions_enabled */
  final def areAllChildCollisionsEnabled(index: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("SpringBoneSimulator3D", "are_all_child_collisions_enabled", 1116898809L), hostObject.objectPtr, index)

  /** SpringBoneSimulator3D.set_exclude_collision_count */
  final def setExcludeCollisionCount(index: Long, count: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("SpringBoneSimulator3D", "set_exclude_collision_count", 3937882851L), hostObject.objectPtr, index, count)

  /** SpringBoneSimulator3D.get_exclude_collision_count */
  final def getExcludeCollisionCount(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("SpringBoneSimulator3D", "get_exclude_collision_count", 923996154L), hostObject.objectPtr, index)

  /** SpringBoneSimulator3D.clear_exclude_collisions */
  final def clearExcludeCollisions(index: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("SpringBoneSimulator3D", "clear_exclude_collisions", 1286410249L), hostObject.objectPtr, index)

  /** SpringBoneSimulator3D.set_collision_count */
  final def setCollisionCount(index: Long, count: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("SpringBoneSimulator3D", "set_collision_count", 3937882851L), hostObject.objectPtr, index, count)

  /** SpringBoneSimulator3D.get_collision_count */
  final def getCollisionCount(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("SpringBoneSimulator3D", "get_collision_count", 923996154L), hostObject.objectPtr, index)

  /** SpringBoneSimulator3D.clear_collisions */
  final def clearCollisions(index: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("SpringBoneSimulator3D", "clear_collisions", 1286410249L), hostObject.objectPtr, index)

  /** SpringBoneSimulator3D.set_external_force */
  final def setExternalForce(force: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("SpringBoneSimulator3D", "set_external_force", 3460891852L), hostObject.objectPtr, force)

  /** SpringBoneSimulator3D.get_external_force */
  final def getExternalForce(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("SpringBoneSimulator3D", "get_external_force", 3360562783L), hostObject.objectPtr)

  /** SpringBoneSimulator3D.set_mutable_bone_axes */
  final def setMutableBoneAxes(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("SpringBoneSimulator3D", "set_mutable_bone_axes", 2586408642L), hostObject.objectPtr, enabled)

  /** SpringBoneSimulator3D.are_bone_axes_mutable */
  final def areBoneAxesMutable(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("SpringBoneSimulator3D", "are_bone_axes_mutable", 36873697L), hostObject.objectPtr)

  /** SpringBoneSimulator3D.reset */
  final def reset(): Unit =
    Ptrcall.callVoid0(MethodBind.get("SpringBoneSimulator3D", "reset", 3218959716L), hostObject.objectPtr)

}

object SpringBoneSimulator3D {
  /** Class metadata for Gd[SpringBoneSimulator3D] lifetime management and casting. */
  given GodotClass[SpringBoneSimulator3D] with {
    def className = "SpringBoneSimulator3D"
    def isRefCounted = false
    def wrap(o: GodotObject): SpringBoneSimulator3D = new SpringBoneSimulator3D {}.withHost(o.objectPtr)
    def unwrap(t: SpringBoneSimulator3D): GodotObject = t.hostObject
  }
}
