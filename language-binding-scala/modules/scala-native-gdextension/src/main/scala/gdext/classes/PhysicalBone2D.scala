package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `PhysicalBone2D`, extends `RigidBody2D`. */
abstract class PhysicalBone2D extends RigidBody2D {
  override def godotClassName: String = "PhysicalBone2D"

  /** PhysicalBone2D.get_joint */
  final def getJoint(): Joint2D = {
    if (gdext.classes.PhysicalBone2D.mb_get_joint == null) gdext.classes.PhysicalBone2D.mb_get_joint = MethodBind.get("PhysicalBone2D", "get_joint", 3582132112L)
    Wrappers.borrowed[Joint2D](Ptrcall.call0[Long](gdext.classes.PhysicalBone2D.mb_get_joint, livePtr))
  }

  /** PhysicalBone2D.get_auto_configure_joint */
  final def getAutoConfigureJoint(): Boolean = {
    if (gdext.classes.PhysicalBone2D.mb_get_auto_configure_joint == null) gdext.classes.PhysicalBone2D.mb_get_auto_configure_joint = MethodBind.get("PhysicalBone2D", "get_auto_configure_joint", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.PhysicalBone2D.mb_get_auto_configure_joint, livePtr)
  }

  /** PhysicalBone2D.set_auto_configure_joint */
  final def setAutoConfigureJoint(autoConfigureJoint: Boolean): Unit = {
    if (gdext.classes.PhysicalBone2D.mb_set_auto_configure_joint == null) gdext.classes.PhysicalBone2D.mb_set_auto_configure_joint = MethodBind.get("PhysicalBone2D", "set_auto_configure_joint", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.PhysicalBone2D.mb_set_auto_configure_joint, livePtr, autoConfigureJoint)
  }

  /** PhysicalBone2D.set_simulate_physics */
  final def setSimulatePhysics(simulatePhysics: Boolean): Unit = {
    if (gdext.classes.PhysicalBone2D.mb_set_simulate_physics == null) gdext.classes.PhysicalBone2D.mb_set_simulate_physics = MethodBind.get("PhysicalBone2D", "set_simulate_physics", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.PhysicalBone2D.mb_set_simulate_physics, livePtr, simulatePhysics)
  }

  /** PhysicalBone2D.get_simulate_physics */
  final def getSimulatePhysics(): Boolean = {
    if (gdext.classes.PhysicalBone2D.mb_get_simulate_physics == null) gdext.classes.PhysicalBone2D.mb_get_simulate_physics = MethodBind.get("PhysicalBone2D", "get_simulate_physics", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.PhysicalBone2D.mb_get_simulate_physics, livePtr)
  }

  /** PhysicalBone2D.is_simulating_physics */
  final def isSimulatingPhysics(): Boolean = {
    if (gdext.classes.PhysicalBone2D.mb_is_simulating_physics == null) gdext.classes.PhysicalBone2D.mb_is_simulating_physics = MethodBind.get("PhysicalBone2D", "is_simulating_physics", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.PhysicalBone2D.mb_is_simulating_physics, livePtr)
  }

  /** PhysicalBone2D.set_bone2d_index */
  final def setBone2dIndex(boneIndex: Long): Unit = {
    if (gdext.classes.PhysicalBone2D.mb_set_bone2d_index == null) gdext.classes.PhysicalBone2D.mb_set_bone2d_index = MethodBind.get("PhysicalBone2D", "set_bone2d_index", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.PhysicalBone2D.mb_set_bone2d_index, livePtr, boneIndex)
  }

  /** PhysicalBone2D.get_bone2d_index */
  final def getBone2dIndex(): Long = {
    if (gdext.classes.PhysicalBone2D.mb_get_bone2d_index == null) gdext.classes.PhysicalBone2D.mb_get_bone2d_index = MethodBind.get("PhysicalBone2D", "get_bone2d_index", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.PhysicalBone2D.mb_get_bone2d_index, livePtr)
  }

  /** PhysicalBone2D.set_follow_bone_when_simulating */
  final def setFollowBoneWhenSimulating(followBone: Boolean): Unit = {
    if (gdext.classes.PhysicalBone2D.mb_set_follow_bone_when_simulating == null) gdext.classes.PhysicalBone2D.mb_set_follow_bone_when_simulating = MethodBind.get("PhysicalBone2D", "set_follow_bone_when_simulating", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.PhysicalBone2D.mb_set_follow_bone_when_simulating, livePtr, followBone)
  }

  /** PhysicalBone2D.get_follow_bone_when_simulating */
  final def getFollowBoneWhenSimulating(): Boolean = {
    if (gdext.classes.PhysicalBone2D.mb_get_follow_bone_when_simulating == null) gdext.classes.PhysicalBone2D.mb_get_follow_bone_when_simulating = MethodBind.get("PhysicalBone2D", "get_follow_bone_when_simulating", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.PhysicalBone2D.mb_get_follow_bone_when_simulating, livePtr)
  }

}

object PhysicalBone2D {
  private[classes] var mb_get_joint: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_auto_configure_joint: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_auto_configure_joint: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_simulate_physics: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_simulate_physics: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_simulating_physics: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bone2d_index: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bone2d_index: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_follow_bone_when_simulating: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_follow_bone_when_simulating: GDExtensionMethodBindPtr = null
}
