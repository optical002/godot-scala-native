package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `SkeletonModification2DJiggle`, extends `SkeletonModification2D`. */
abstract class SkeletonModification2DJiggle extends SkeletonModification2D {

  /** SkeletonModification2DJiggle.set_jiggle_data_chain_length */
  final def setJiggleDataChainLength(length: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("SkeletonModification2DJiggle", "set_jiggle_data_chain_length", 1286410249L), hostObject.objectPtr, length)

  /** SkeletonModification2DJiggle.get_jiggle_data_chain_length */
  final def getJiggleDataChainLength(): Long =
    Ptrcall.call0[Long](MethodBind.get("SkeletonModification2DJiggle", "get_jiggle_data_chain_length", 2455072627L), hostObject.objectPtr)

  /** SkeletonModification2DJiggle.set_stiffness */
  final def setStiffness(stiffness: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("SkeletonModification2DJiggle", "set_stiffness", 373806689L), hostObject.objectPtr, stiffness)

  /** SkeletonModification2DJiggle.get_stiffness */
  final def getStiffness(): Double =
    Ptrcall.call0[Double](MethodBind.get("SkeletonModification2DJiggle", "get_stiffness", 1740695150L), hostObject.objectPtr)

  /** SkeletonModification2DJiggle.set_mass */
  final def setMass(mass: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("SkeletonModification2DJiggle", "set_mass", 373806689L), hostObject.objectPtr, mass)

  /** SkeletonModification2DJiggle.get_mass */
  final def getMass(): Double =
    Ptrcall.call0[Double](MethodBind.get("SkeletonModification2DJiggle", "get_mass", 1740695150L), hostObject.objectPtr)

  /** SkeletonModification2DJiggle.set_damping */
  final def setDamping(damping: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("SkeletonModification2DJiggle", "set_damping", 373806689L), hostObject.objectPtr, damping)

  /** SkeletonModification2DJiggle.get_damping */
  final def getDamping(): Double =
    Ptrcall.call0[Double](MethodBind.get("SkeletonModification2DJiggle", "get_damping", 1740695150L), hostObject.objectPtr)

  /** SkeletonModification2DJiggle.set_use_gravity */
  final def setUseGravity(use_gravity: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("SkeletonModification2DJiggle", "set_use_gravity", 2586408642L), hostObject.objectPtr, use_gravity)

  /** SkeletonModification2DJiggle.get_use_gravity */
  final def getUseGravity(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("SkeletonModification2DJiggle", "get_use_gravity", 36873697L), hostObject.objectPtr)

  /** SkeletonModification2DJiggle.set_gravity */
  final def setGravity(gravity: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("SkeletonModification2DJiggle", "set_gravity", 743155724L), hostObject.objectPtr, gravity)

  /** SkeletonModification2DJiggle.get_gravity */
  final def getGravity(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("SkeletonModification2DJiggle", "get_gravity", 3341600327L), hostObject.objectPtr)

  /** SkeletonModification2DJiggle.set_use_colliders */
  final def setUseColliders(use_colliders: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("SkeletonModification2DJiggle", "set_use_colliders", 2586408642L), hostObject.objectPtr, use_colliders)

  /** SkeletonModification2DJiggle.get_use_colliders */
  final def getUseColliders(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("SkeletonModification2DJiggle", "get_use_colliders", 36873697L), hostObject.objectPtr)

  /** SkeletonModification2DJiggle.set_collision_mask */
  final def setCollisionMask(collision_mask: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("SkeletonModification2DJiggle", "set_collision_mask", 1286410249L), hostObject.objectPtr, collision_mask)

  /** SkeletonModification2DJiggle.get_collision_mask */
  final def getCollisionMask(): Long =
    Ptrcall.call0[Long](MethodBind.get("SkeletonModification2DJiggle", "get_collision_mask", 3905245786L), hostObject.objectPtr)

  /** SkeletonModification2DJiggle.set_jiggle_joint_bone_index */
  final def setJiggleJointBoneIndex(joint_idx: Long, bone_idx: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("SkeletonModification2DJiggle", "set_jiggle_joint_bone_index", 3937882851L), hostObject.objectPtr, joint_idx, bone_idx)

  /** SkeletonModification2DJiggle.get_jiggle_joint_bone_index */
  final def getJiggleJointBoneIndex(joint_idx: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("SkeletonModification2DJiggle", "get_jiggle_joint_bone_index", 923996154L), hostObject.objectPtr, joint_idx)

  /** SkeletonModification2DJiggle.set_jiggle_joint_override */
  final def setJiggleJointOverride(joint_idx: Long, `override`: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("SkeletonModification2DJiggle", "set_jiggle_joint_override", 300928843L), hostObject.objectPtr, joint_idx, `override`)

  /** SkeletonModification2DJiggle.get_jiggle_joint_override */
  final def getJiggleJointOverride(joint_idx: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("SkeletonModification2DJiggle", "get_jiggle_joint_override", 1116898809L), hostObject.objectPtr, joint_idx)

  /** SkeletonModification2DJiggle.set_jiggle_joint_stiffness */
  final def setJiggleJointStiffness(joint_idx: Long, stiffness: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("SkeletonModification2DJiggle", "set_jiggle_joint_stiffness", 1602489585L), hostObject.objectPtr, joint_idx, stiffness)

  /** SkeletonModification2DJiggle.get_jiggle_joint_stiffness */
  final def getJiggleJointStiffness(joint_idx: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("SkeletonModification2DJiggle", "get_jiggle_joint_stiffness", 2339986948L), hostObject.objectPtr, joint_idx)

  /** SkeletonModification2DJiggle.set_jiggle_joint_mass */
  final def setJiggleJointMass(joint_idx: Long, mass: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("SkeletonModification2DJiggle", "set_jiggle_joint_mass", 1602489585L), hostObject.objectPtr, joint_idx, mass)

  /** SkeletonModification2DJiggle.get_jiggle_joint_mass */
  final def getJiggleJointMass(joint_idx: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("SkeletonModification2DJiggle", "get_jiggle_joint_mass", 2339986948L), hostObject.objectPtr, joint_idx)

  /** SkeletonModification2DJiggle.set_jiggle_joint_damping */
  final def setJiggleJointDamping(joint_idx: Long, damping: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("SkeletonModification2DJiggle", "set_jiggle_joint_damping", 1602489585L), hostObject.objectPtr, joint_idx, damping)

  /** SkeletonModification2DJiggle.get_jiggle_joint_damping */
  final def getJiggleJointDamping(joint_idx: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("SkeletonModification2DJiggle", "get_jiggle_joint_damping", 2339986948L), hostObject.objectPtr, joint_idx)

  /** SkeletonModification2DJiggle.set_jiggle_joint_use_gravity */
  final def setJiggleJointUseGravity(joint_idx: Long, use_gravity: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("SkeletonModification2DJiggle", "set_jiggle_joint_use_gravity", 300928843L), hostObject.objectPtr, joint_idx, use_gravity)

  /** SkeletonModification2DJiggle.get_jiggle_joint_use_gravity */
  final def getJiggleJointUseGravity(joint_idx: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("SkeletonModification2DJiggle", "get_jiggle_joint_use_gravity", 1116898809L), hostObject.objectPtr, joint_idx)

  /** SkeletonModification2DJiggle.set_jiggle_joint_gravity */
  final def setJiggleJointGravity(joint_idx: Long, gravity: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid2(MethodBind.get("SkeletonModification2DJiggle", "set_jiggle_joint_gravity", 163021252L), hostObject.objectPtr, joint_idx, gravity)

  /** SkeletonModification2DJiggle.get_jiggle_joint_gravity */
  final def getJiggleJointGravity(joint_idx: Long): gdext.builtin.Vector2 =
    Ptrcall.call1[Long, gdext.builtin.Vector2](MethodBind.get("SkeletonModification2DJiggle", "get_jiggle_joint_gravity", 2299179447L), hostObject.objectPtr, joint_idx)

}

object SkeletonModification2DJiggle {
  /** Class metadata for Gd[SkeletonModification2DJiggle] lifetime management and casting. */
  given GodotClass[SkeletonModification2DJiggle] with {
    def className = "SkeletonModification2DJiggle"
    def isRefCounted = true
    def wrap(o: GodotObject): SkeletonModification2DJiggle = new SkeletonModification2DJiggle {}.withHost(o.objectPtr)
    def unwrap(t: SkeletonModification2DJiggle): GodotObject = t.hostObject
  }
}
