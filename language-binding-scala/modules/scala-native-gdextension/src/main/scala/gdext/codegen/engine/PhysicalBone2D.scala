package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `PhysicalBone2D`, extends `RigidBody2D`. */
abstract class PhysicalBone2D extends RigidBody2D {

  /** PhysicalBone2D.get_joint */
  final def getJoint(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("PhysicalBone2D", "get_joint", 3582132112L), hostObject.objectPtr)

  /** PhysicalBone2D.get_auto_configure_joint */
  final def getAutoConfigureJoint(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("PhysicalBone2D", "get_auto_configure_joint", 36873697L), hostObject.objectPtr)

  /** PhysicalBone2D.set_auto_configure_joint */
  final def setAutoConfigureJoint(auto_configure_joint: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicalBone2D", "set_auto_configure_joint", 2586408642L), hostObject.objectPtr, auto_configure_joint)

  /** PhysicalBone2D.set_simulate_physics */
  final def setSimulatePhysics(simulate_physics: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicalBone2D", "set_simulate_physics", 2586408642L), hostObject.objectPtr, simulate_physics)

  /** PhysicalBone2D.get_simulate_physics */
  final def getSimulatePhysics(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("PhysicalBone2D", "get_simulate_physics", 36873697L), hostObject.objectPtr)

  /** PhysicalBone2D.is_simulating_physics */
  final def isSimulatingPhysics(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("PhysicalBone2D", "is_simulating_physics", 36873697L), hostObject.objectPtr)

  /** PhysicalBone2D.set_bone2d_index */
  final def setBone2dIndex(bone_index: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicalBone2D", "set_bone2d_index", 1286410249L), hostObject.objectPtr, bone_index)

  /** PhysicalBone2D.get_bone2d_index */
  final def getBone2dIndex(): Long =
    Ptrcall.call0[Long](MethodBind.get("PhysicalBone2D", "get_bone2d_index", 3905245786L), hostObject.objectPtr)

  /** PhysicalBone2D.set_follow_bone_when_simulating */
  final def setFollowBoneWhenSimulating(follow_bone: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicalBone2D", "set_follow_bone_when_simulating", 2586408642L), hostObject.objectPtr, follow_bone)

  /** PhysicalBone2D.get_follow_bone_when_simulating */
  final def getFollowBoneWhenSimulating(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("PhysicalBone2D", "get_follow_bone_when_simulating", 36873697L), hostObject.objectPtr)

}

object PhysicalBone2D {
  /** Class metadata for Gd[PhysicalBone2D] lifetime management and casting. */
  given GodotClass[PhysicalBone2D] with {
    def className = "PhysicalBone2D"
    def isRefCounted = false
    def wrap(o: GodotObject): PhysicalBone2D = new PhysicalBone2D {}.withHost(o.objectPtr)
    def unwrap(t: PhysicalBone2D): GodotObject = t.hostObject
  }
}
