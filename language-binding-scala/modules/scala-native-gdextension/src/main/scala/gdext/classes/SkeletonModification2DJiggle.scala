package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `SkeletonModification2DJiggle`, extends `SkeletonModification2D`. */
abstract class SkeletonModification2DJiggle extends SkeletonModification2D {
  override def godotClassName: String = "SkeletonModification2DJiggle"

  /** SkeletonModification2DJiggle.set_jiggle_data_chain_length */
  final def setJiggleDataChainLength(length: Long): Unit = {
    if (gdext.classes.SkeletonModification2DJiggle.mb_set_jiggle_data_chain_length == null) gdext.classes.SkeletonModification2DJiggle.mb_set_jiggle_data_chain_length = MethodBind.get("SkeletonModification2DJiggle", "set_jiggle_data_chain_length", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.SkeletonModification2DJiggle.mb_set_jiggle_data_chain_length, livePtr, length)
  }

  /** SkeletonModification2DJiggle.get_jiggle_data_chain_length */
  final def getJiggleDataChainLength(): Long = {
    if (gdext.classes.SkeletonModification2DJiggle.mb_get_jiggle_data_chain_length == null) gdext.classes.SkeletonModification2DJiggle.mb_get_jiggle_data_chain_length = MethodBind.get("SkeletonModification2DJiggle", "get_jiggle_data_chain_length", 2455072627L)
    Ptrcall.call0[Long](gdext.classes.SkeletonModification2DJiggle.mb_get_jiggle_data_chain_length, livePtr)
  }

  /** SkeletonModification2DJiggle.set_stiffness */
  final def setStiffness(stiffness: Double): Unit = {
    if (gdext.classes.SkeletonModification2DJiggle.mb_set_stiffness == null) gdext.classes.SkeletonModification2DJiggle.mb_set_stiffness = MethodBind.get("SkeletonModification2DJiggle", "set_stiffness", 373806689L)
    Ptrcall.callVoid1(gdext.classes.SkeletonModification2DJiggle.mb_set_stiffness, livePtr, stiffness)
  }

  /** SkeletonModification2DJiggle.get_stiffness */
  final def getStiffness(): Double = {
    if (gdext.classes.SkeletonModification2DJiggle.mb_get_stiffness == null) gdext.classes.SkeletonModification2DJiggle.mb_get_stiffness = MethodBind.get("SkeletonModification2DJiggle", "get_stiffness", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.SkeletonModification2DJiggle.mb_get_stiffness, livePtr)
  }

  /** SkeletonModification2DJiggle.set_mass */
  final def setMass(mass: Double): Unit = {
    if (gdext.classes.SkeletonModification2DJiggle.mb_set_mass == null) gdext.classes.SkeletonModification2DJiggle.mb_set_mass = MethodBind.get("SkeletonModification2DJiggle", "set_mass", 373806689L)
    Ptrcall.callVoid1(gdext.classes.SkeletonModification2DJiggle.mb_set_mass, livePtr, mass)
  }

  /** SkeletonModification2DJiggle.get_mass */
  final def getMass(): Double = {
    if (gdext.classes.SkeletonModification2DJiggle.mb_get_mass == null) gdext.classes.SkeletonModification2DJiggle.mb_get_mass = MethodBind.get("SkeletonModification2DJiggle", "get_mass", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.SkeletonModification2DJiggle.mb_get_mass, livePtr)
  }

  /** SkeletonModification2DJiggle.set_damping */
  final def setDamping(damping: Double): Unit = {
    if (gdext.classes.SkeletonModification2DJiggle.mb_set_damping == null) gdext.classes.SkeletonModification2DJiggle.mb_set_damping = MethodBind.get("SkeletonModification2DJiggle", "set_damping", 373806689L)
    Ptrcall.callVoid1(gdext.classes.SkeletonModification2DJiggle.mb_set_damping, livePtr, damping)
  }

  /** SkeletonModification2DJiggle.get_damping */
  final def getDamping(): Double = {
    if (gdext.classes.SkeletonModification2DJiggle.mb_get_damping == null) gdext.classes.SkeletonModification2DJiggle.mb_get_damping = MethodBind.get("SkeletonModification2DJiggle", "get_damping", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.SkeletonModification2DJiggle.mb_get_damping, livePtr)
  }

  /** SkeletonModification2DJiggle.set_use_gravity */
  final def setUseGravity(use_gravity: Boolean): Unit = {
    if (gdext.classes.SkeletonModification2DJiggle.mb_set_use_gravity == null) gdext.classes.SkeletonModification2DJiggle.mb_set_use_gravity = MethodBind.get("SkeletonModification2DJiggle", "set_use_gravity", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.SkeletonModification2DJiggle.mb_set_use_gravity, livePtr, use_gravity)
  }

  /** SkeletonModification2DJiggle.get_use_gravity */
  final def getUseGravity(): Boolean = {
    if (gdext.classes.SkeletonModification2DJiggle.mb_get_use_gravity == null) gdext.classes.SkeletonModification2DJiggle.mb_get_use_gravity = MethodBind.get("SkeletonModification2DJiggle", "get_use_gravity", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.SkeletonModification2DJiggle.mb_get_use_gravity, livePtr)
  }

  /** SkeletonModification2DJiggle.set_gravity */
  final def setGravity(gravity: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.SkeletonModification2DJiggle.mb_set_gravity == null) gdext.classes.SkeletonModification2DJiggle.mb_set_gravity = MethodBind.get("SkeletonModification2DJiggle", "set_gravity", 743155724L)
    Ptrcall.callVoid1(gdext.classes.SkeletonModification2DJiggle.mb_set_gravity, livePtr, gravity)
  }

  /** SkeletonModification2DJiggle.get_gravity */
  final def getGravity(): gdext.builtin.Vector2 = {
    if (gdext.classes.SkeletonModification2DJiggle.mb_get_gravity == null) gdext.classes.SkeletonModification2DJiggle.mb_get_gravity = MethodBind.get("SkeletonModification2DJiggle", "get_gravity", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.SkeletonModification2DJiggle.mb_get_gravity, livePtr)
  }

  /** SkeletonModification2DJiggle.set_use_colliders */
  final def setUseColliders(use_colliders: Boolean): Unit = {
    if (gdext.classes.SkeletonModification2DJiggle.mb_set_use_colliders == null) gdext.classes.SkeletonModification2DJiggle.mb_set_use_colliders = MethodBind.get("SkeletonModification2DJiggle", "set_use_colliders", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.SkeletonModification2DJiggle.mb_set_use_colliders, livePtr, use_colliders)
  }

  /** SkeletonModification2DJiggle.get_use_colliders */
  final def getUseColliders(): Boolean = {
    if (gdext.classes.SkeletonModification2DJiggle.mb_get_use_colliders == null) gdext.classes.SkeletonModification2DJiggle.mb_get_use_colliders = MethodBind.get("SkeletonModification2DJiggle", "get_use_colliders", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.SkeletonModification2DJiggle.mb_get_use_colliders, livePtr)
  }

  /** SkeletonModification2DJiggle.set_collision_mask */
  final def setCollisionMask(collision_mask: Long): Unit = {
    if (gdext.classes.SkeletonModification2DJiggle.mb_set_collision_mask == null) gdext.classes.SkeletonModification2DJiggle.mb_set_collision_mask = MethodBind.get("SkeletonModification2DJiggle", "set_collision_mask", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.SkeletonModification2DJiggle.mb_set_collision_mask, livePtr, collision_mask)
  }

  /** SkeletonModification2DJiggle.get_collision_mask */
  final def getCollisionMask(): Long = {
    if (gdext.classes.SkeletonModification2DJiggle.mb_get_collision_mask == null) gdext.classes.SkeletonModification2DJiggle.mb_get_collision_mask = MethodBind.get("SkeletonModification2DJiggle", "get_collision_mask", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.SkeletonModification2DJiggle.mb_get_collision_mask, livePtr)
  }

  /** SkeletonModification2DJiggle.set_jiggle_joint_bone_index */
  final def setJiggleJointBoneIndex(joint_idx: Long, bone_idx: Long): Unit = {
    if (gdext.classes.SkeletonModification2DJiggle.mb_set_jiggle_joint_bone_index == null) gdext.classes.SkeletonModification2DJiggle.mb_set_jiggle_joint_bone_index = MethodBind.get("SkeletonModification2DJiggle", "set_jiggle_joint_bone_index", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.SkeletonModification2DJiggle.mb_set_jiggle_joint_bone_index, livePtr, joint_idx, bone_idx)
  }

  /** SkeletonModification2DJiggle.get_jiggle_joint_bone_index */
  final def getJiggleJointBoneIndex(joint_idx: Long): Long = {
    if (gdext.classes.SkeletonModification2DJiggle.mb_get_jiggle_joint_bone_index == null) gdext.classes.SkeletonModification2DJiggle.mb_get_jiggle_joint_bone_index = MethodBind.get("SkeletonModification2DJiggle", "get_jiggle_joint_bone_index", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.SkeletonModification2DJiggle.mb_get_jiggle_joint_bone_index, livePtr, joint_idx)
  }

  /** SkeletonModification2DJiggle.set_jiggle_joint_override */
  final def setJiggleJointOverride(joint_idx: Long, `override`: Boolean): Unit = {
    if (gdext.classes.SkeletonModification2DJiggle.mb_set_jiggle_joint_override == null) gdext.classes.SkeletonModification2DJiggle.mb_set_jiggle_joint_override = MethodBind.get("SkeletonModification2DJiggle", "set_jiggle_joint_override", 300928843L)
    Ptrcall.callVoid2(gdext.classes.SkeletonModification2DJiggle.mb_set_jiggle_joint_override, livePtr, joint_idx, `override`)
  }

  /** SkeletonModification2DJiggle.get_jiggle_joint_override */
  final def getJiggleJointOverride(joint_idx: Long): Boolean = {
    if (gdext.classes.SkeletonModification2DJiggle.mb_get_jiggle_joint_override == null) gdext.classes.SkeletonModification2DJiggle.mb_get_jiggle_joint_override = MethodBind.get("SkeletonModification2DJiggle", "get_jiggle_joint_override", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.SkeletonModification2DJiggle.mb_get_jiggle_joint_override, livePtr, joint_idx)
  }

  /** SkeletonModification2DJiggle.set_jiggle_joint_stiffness */
  final def setJiggleJointStiffness(joint_idx: Long, stiffness: Double): Unit = {
    if (gdext.classes.SkeletonModification2DJiggle.mb_set_jiggle_joint_stiffness == null) gdext.classes.SkeletonModification2DJiggle.mb_set_jiggle_joint_stiffness = MethodBind.get("SkeletonModification2DJiggle", "set_jiggle_joint_stiffness", 1602489585L)
    Ptrcall.callVoid2(gdext.classes.SkeletonModification2DJiggle.mb_set_jiggle_joint_stiffness, livePtr, joint_idx, stiffness)
  }

  /** SkeletonModification2DJiggle.get_jiggle_joint_stiffness */
  final def getJiggleJointStiffness(joint_idx: Long): Double = {
    if (gdext.classes.SkeletonModification2DJiggle.mb_get_jiggle_joint_stiffness == null) gdext.classes.SkeletonModification2DJiggle.mb_get_jiggle_joint_stiffness = MethodBind.get("SkeletonModification2DJiggle", "get_jiggle_joint_stiffness", 2339986948L)
    Ptrcall.call1[Long, Double](gdext.classes.SkeletonModification2DJiggle.mb_get_jiggle_joint_stiffness, livePtr, joint_idx)
  }

  /** SkeletonModification2DJiggle.set_jiggle_joint_mass */
  final def setJiggleJointMass(joint_idx: Long, mass: Double): Unit = {
    if (gdext.classes.SkeletonModification2DJiggle.mb_set_jiggle_joint_mass == null) gdext.classes.SkeletonModification2DJiggle.mb_set_jiggle_joint_mass = MethodBind.get("SkeletonModification2DJiggle", "set_jiggle_joint_mass", 1602489585L)
    Ptrcall.callVoid2(gdext.classes.SkeletonModification2DJiggle.mb_set_jiggle_joint_mass, livePtr, joint_idx, mass)
  }

  /** SkeletonModification2DJiggle.get_jiggle_joint_mass */
  final def getJiggleJointMass(joint_idx: Long): Double = {
    if (gdext.classes.SkeletonModification2DJiggle.mb_get_jiggle_joint_mass == null) gdext.classes.SkeletonModification2DJiggle.mb_get_jiggle_joint_mass = MethodBind.get("SkeletonModification2DJiggle", "get_jiggle_joint_mass", 2339986948L)
    Ptrcall.call1[Long, Double](gdext.classes.SkeletonModification2DJiggle.mb_get_jiggle_joint_mass, livePtr, joint_idx)
  }

  /** SkeletonModification2DJiggle.set_jiggle_joint_damping */
  final def setJiggleJointDamping(joint_idx: Long, damping: Double): Unit = {
    if (gdext.classes.SkeletonModification2DJiggle.mb_set_jiggle_joint_damping == null) gdext.classes.SkeletonModification2DJiggle.mb_set_jiggle_joint_damping = MethodBind.get("SkeletonModification2DJiggle", "set_jiggle_joint_damping", 1602489585L)
    Ptrcall.callVoid2(gdext.classes.SkeletonModification2DJiggle.mb_set_jiggle_joint_damping, livePtr, joint_idx, damping)
  }

  /** SkeletonModification2DJiggle.get_jiggle_joint_damping */
  final def getJiggleJointDamping(joint_idx: Long): Double = {
    if (gdext.classes.SkeletonModification2DJiggle.mb_get_jiggle_joint_damping == null) gdext.classes.SkeletonModification2DJiggle.mb_get_jiggle_joint_damping = MethodBind.get("SkeletonModification2DJiggle", "get_jiggle_joint_damping", 2339986948L)
    Ptrcall.call1[Long, Double](gdext.classes.SkeletonModification2DJiggle.mb_get_jiggle_joint_damping, livePtr, joint_idx)
  }

  /** SkeletonModification2DJiggle.set_jiggle_joint_use_gravity */
  final def setJiggleJointUseGravity(joint_idx: Long, use_gravity: Boolean): Unit = {
    if (gdext.classes.SkeletonModification2DJiggle.mb_set_jiggle_joint_use_gravity == null) gdext.classes.SkeletonModification2DJiggle.mb_set_jiggle_joint_use_gravity = MethodBind.get("SkeletonModification2DJiggle", "set_jiggle_joint_use_gravity", 300928843L)
    Ptrcall.callVoid2(gdext.classes.SkeletonModification2DJiggle.mb_set_jiggle_joint_use_gravity, livePtr, joint_idx, use_gravity)
  }

  /** SkeletonModification2DJiggle.get_jiggle_joint_use_gravity */
  final def getJiggleJointUseGravity(joint_idx: Long): Boolean = {
    if (gdext.classes.SkeletonModification2DJiggle.mb_get_jiggle_joint_use_gravity == null) gdext.classes.SkeletonModification2DJiggle.mb_get_jiggle_joint_use_gravity = MethodBind.get("SkeletonModification2DJiggle", "get_jiggle_joint_use_gravity", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.SkeletonModification2DJiggle.mb_get_jiggle_joint_use_gravity, livePtr, joint_idx)
  }

  /** SkeletonModification2DJiggle.set_jiggle_joint_gravity */
  final def setJiggleJointGravity(joint_idx: Long, gravity: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.SkeletonModification2DJiggle.mb_set_jiggle_joint_gravity == null) gdext.classes.SkeletonModification2DJiggle.mb_set_jiggle_joint_gravity = MethodBind.get("SkeletonModification2DJiggle", "set_jiggle_joint_gravity", 163021252L)
    Ptrcall.callVoid2(gdext.classes.SkeletonModification2DJiggle.mb_set_jiggle_joint_gravity, livePtr, joint_idx, gravity)
  }

  /** SkeletonModification2DJiggle.get_jiggle_joint_gravity */
  final def getJiggleJointGravity(joint_idx: Long): gdext.builtin.Vector2 = {
    if (gdext.classes.SkeletonModification2DJiggle.mb_get_jiggle_joint_gravity == null) gdext.classes.SkeletonModification2DJiggle.mb_get_jiggle_joint_gravity = MethodBind.get("SkeletonModification2DJiggle", "get_jiggle_joint_gravity", 2299179447L)
    Ptrcall.call1[Long, gdext.builtin.Vector2](gdext.classes.SkeletonModification2DJiggle.mb_get_jiggle_joint_gravity, livePtr, joint_idx)
  }

}

object SkeletonModification2DJiggle {
  private[classes] var mb_set_jiggle_data_chain_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_jiggle_data_chain_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_stiffness: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_stiffness: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_mass: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_mass: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_damping: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_damping: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_use_gravity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_use_gravity: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_gravity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_gravity: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_use_colliders: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_use_colliders: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_collision_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collision_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_jiggle_joint_bone_index: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_jiggle_joint_bone_index: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_jiggle_joint_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_jiggle_joint_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_jiggle_joint_stiffness: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_jiggle_joint_stiffness: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_jiggle_joint_mass: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_jiggle_joint_mass: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_jiggle_joint_damping: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_jiggle_joint_damping: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_jiggle_joint_use_gravity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_jiggle_joint_use_gravity: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_jiggle_joint_gravity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_jiggle_joint_gravity: GDExtensionMethodBindPtr = null
}
