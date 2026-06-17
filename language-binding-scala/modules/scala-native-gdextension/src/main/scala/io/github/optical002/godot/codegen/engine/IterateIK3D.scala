package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `IterateIK3D`, extends `ChainIK3D`. */
abstract class IterateIK3D extends ChainIK3D {

  /** IterateIK3D.set_max_iterations */
  final def setMaxIterations(max_iterations: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("IterateIK3D", "set_max_iterations", 1286410249L), hostObject.objectPtr, max_iterations)

  /** IterateIK3D.get_max_iterations */
  final def getMaxIterations(): Long =
    Ptrcall.call0[Long](MethodBind.get("IterateIK3D", "get_max_iterations", 3905245786L), hostObject.objectPtr)

  /** IterateIK3D.set_min_distance */
  final def setMinDistance(min_distance: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("IterateIK3D", "set_min_distance", 373806689L), hostObject.objectPtr, min_distance)

  /** IterateIK3D.get_min_distance */
  final def getMinDistance(): Double =
    Ptrcall.call0[Double](MethodBind.get("IterateIK3D", "get_min_distance", 1740695150L), hostObject.objectPtr)

  /** IterateIK3D.set_angular_delta_limit */
  final def setAngularDeltaLimit(angular_delta_limit: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("IterateIK3D", "set_angular_delta_limit", 373806689L), hostObject.objectPtr, angular_delta_limit)

  /** IterateIK3D.get_angular_delta_limit */
  final def getAngularDeltaLimit(): Double =
    Ptrcall.call0[Double](MethodBind.get("IterateIK3D", "get_angular_delta_limit", 1740695150L), hostObject.objectPtr)

  /** IterateIK3D.set_deterministic */
  final def setDeterministic(deterministic: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("IterateIK3D", "set_deterministic", 2586408642L), hostObject.objectPtr, deterministic)

  /** IterateIK3D.is_deterministic */
  final def isDeterministic(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("IterateIK3D", "is_deterministic", 36873697L), hostObject.objectPtr)

  /** IterateIK3D.set_joint_rotation_axis */
  final def setJointRotationAxis(index: Long, joint: Long, axis: Long): Unit =
    Ptrcall.callVoid3(MethodBind.get("IterateIK3D", "set_joint_rotation_axis", 1391134969L), hostObject.objectPtr, index, joint, axis)

  /** IterateIK3D.get_joint_rotation_axis */
  final def getJointRotationAxis(index: Long, joint: Long): Long =
    Ptrcall.call2[Long, Long, Long](MethodBind.get("IterateIK3D", "get_joint_rotation_axis", 3312594080L), hostObject.objectPtr, index, joint)

  /** IterateIK3D.set_joint_rotation_axis_vector */
  final def setJointRotationAxisVector(index: Long, joint: Long, axis_vector: io.github.optical002.godot.builtin.Vector3): Unit =
    Ptrcall.callVoid3(MethodBind.get("IterateIK3D", "set_joint_rotation_axis_vector", 2866752138L), hostObject.objectPtr, index, joint, axis_vector)

  /** IterateIK3D.get_joint_rotation_axis_vector */
  final def getJointRotationAxisVector(index: Long, joint: Long): io.github.optical002.godot.builtin.Vector3 =
    Ptrcall.call2[Long, Long, io.github.optical002.godot.builtin.Vector3](MethodBind.get("IterateIK3D", "get_joint_rotation_axis_vector", 1592972041L), hostObject.objectPtr, index, joint)

  /** IterateIK3D.set_joint_limitation */
  final def setJointLimitation(index: Long, joint: Long, limitation: JointLimitation3D): Unit =
    Ptrcall.callVoid3(MethodBind.get("IterateIK3D", "set_joint_limitation", 1194636955L), hostObject.objectPtr, index, joint, limitation.hostObject)

  /** IterateIK3D.get_joint_limitation */
  final def getJointLimitation(index: Long, joint: Long): GodotObject =
    Ptrcall.call2[Long, Long, GodotObject](MethodBind.get("IterateIK3D", "get_joint_limitation", 91665146L), hostObject.objectPtr, index, joint)

  /** IterateIK3D.set_joint_limitation_right_axis */
  final def setJointLimitationRightAxis(index: Long, joint: Long, direction: Long): Unit =
    Ptrcall.callVoid3(MethodBind.get("IterateIK3D", "set_joint_limitation_right_axis", 3838967147L), hostObject.objectPtr, index, joint, direction)

  /** IterateIK3D.get_joint_limitation_right_axis */
  final def getJointLimitationRightAxis(index: Long, joint: Long): Long =
    Ptrcall.call2[Long, Long, Long](MethodBind.get("IterateIK3D", "get_joint_limitation_right_axis", 623936134L), hostObject.objectPtr, index, joint)

  /** IterateIK3D.set_joint_limitation_right_axis_vector */
  final def setJointLimitationRightAxisVector(index: Long, joint: Long, vector: io.github.optical002.godot.builtin.Vector3): Unit =
    Ptrcall.callVoid3(MethodBind.get("IterateIK3D", "set_joint_limitation_right_axis_vector", 2866752138L), hostObject.objectPtr, index, joint, vector)

  /** IterateIK3D.get_joint_limitation_right_axis_vector */
  final def getJointLimitationRightAxisVector(index: Long, joint: Long): io.github.optical002.godot.builtin.Vector3 =
    Ptrcall.call2[Long, Long, io.github.optical002.godot.builtin.Vector3](MethodBind.get("IterateIK3D", "get_joint_limitation_right_axis_vector", 1592972041L), hostObject.objectPtr, index, joint)

  /** IterateIK3D.set_joint_limitation_rotation_offset */
  final def setJointLimitationRotationOffset(index: Long, joint: Long, offset: io.github.optical002.godot.builtin.Quaternion): Unit =
    Ptrcall.callVoid3(MethodBind.get("IterateIK3D", "set_joint_limitation_rotation_offset", 4188936002L), hostObject.objectPtr, index, joint, offset)

  /** IterateIK3D.get_joint_limitation_rotation_offset */
  final def getJointLimitationRotationOffset(index: Long, joint: Long): io.github.optical002.godot.builtin.Quaternion =
    Ptrcall.call2[Long, Long, io.github.optical002.godot.builtin.Quaternion](MethodBind.get("IterateIK3D", "get_joint_limitation_rotation_offset", 2722473700L), hostObject.objectPtr, index, joint)

}

object IterateIK3D {
  /** Class metadata for Gd[IterateIK3D] lifetime management and casting. */
  given GodotClass[IterateIK3D] with {
    def className = "IterateIK3D"
    def isRefCounted = false
    def wrap(o: GodotObject): IterateIK3D = new IterateIK3D {}.withHost(o.objectPtr)
    def unwrap(t: IterateIK3D): GodotObject = t.hostObject
  }
}
