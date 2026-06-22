package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `SkeletonModification2DTwoBoneIK`, extends `SkeletonModification2D`. */
abstract class SkeletonModification2DTwoBoneIK extends SkeletonModification2D {

  /** SkeletonModification2DTwoBoneIK.set_target_minimum_distance */
  final def setTargetMinimumDistance(minimum_distance: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("SkeletonModification2DTwoBoneIK", "set_target_minimum_distance", 373806689L), hostObject.objectPtr, minimum_distance)

  /** SkeletonModification2DTwoBoneIK.get_target_minimum_distance */
  final def getTargetMinimumDistance(): Double =
    Ptrcall.call0[Double](MethodBind.get("SkeletonModification2DTwoBoneIK", "get_target_minimum_distance", 1740695150L), hostObject.objectPtr)

  /** SkeletonModification2DTwoBoneIK.set_target_maximum_distance */
  final def setTargetMaximumDistance(maximum_distance: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("SkeletonModification2DTwoBoneIK", "set_target_maximum_distance", 373806689L), hostObject.objectPtr, maximum_distance)

  /** SkeletonModification2DTwoBoneIK.get_target_maximum_distance */
  final def getTargetMaximumDistance(): Double =
    Ptrcall.call0[Double](MethodBind.get("SkeletonModification2DTwoBoneIK", "get_target_maximum_distance", 1740695150L), hostObject.objectPtr)

  /** SkeletonModification2DTwoBoneIK.set_flip_bend_direction */
  final def setFlipBendDirection(flip_direction: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("SkeletonModification2DTwoBoneIK", "set_flip_bend_direction", 2586408642L), hostObject.objectPtr, flip_direction)

  /** SkeletonModification2DTwoBoneIK.get_flip_bend_direction */
  final def getFlipBendDirection(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("SkeletonModification2DTwoBoneIK", "get_flip_bend_direction", 36873697L), hostObject.objectPtr)

  /** SkeletonModification2DTwoBoneIK.set_joint_one_bone_idx */
  final def setJointOneBoneIdx(bone_idx: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("SkeletonModification2DTwoBoneIK", "set_joint_one_bone_idx", 1286410249L), hostObject.objectPtr, bone_idx)

  /** SkeletonModification2DTwoBoneIK.get_joint_one_bone_idx */
  final def getJointOneBoneIdx(): Long =
    Ptrcall.call0[Long](MethodBind.get("SkeletonModification2DTwoBoneIK", "get_joint_one_bone_idx", 3905245786L), hostObject.objectPtr)

  /** SkeletonModification2DTwoBoneIK.set_joint_two_bone_idx */
  final def setJointTwoBoneIdx(bone_idx: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("SkeletonModification2DTwoBoneIK", "set_joint_two_bone_idx", 1286410249L), hostObject.objectPtr, bone_idx)

  /** SkeletonModification2DTwoBoneIK.get_joint_two_bone_idx */
  final def getJointTwoBoneIdx(): Long =
    Ptrcall.call0[Long](MethodBind.get("SkeletonModification2DTwoBoneIK", "get_joint_two_bone_idx", 3905245786L), hostObject.objectPtr)

}

object SkeletonModification2DTwoBoneIK {
  /** Class metadata for Gd[SkeletonModification2DTwoBoneIK] lifetime management and casting. */
  given GodotClass[SkeletonModification2DTwoBoneIK] with {
    def className = "SkeletonModification2DTwoBoneIK"
    def isRefCounted = true
    def wrap(o: GodotObject): SkeletonModification2DTwoBoneIK = new SkeletonModification2DTwoBoneIK {}.withHost(o.objectPtr)
    def unwrap(t: SkeletonModification2DTwoBoneIK): GodotObject = t.hostObject
  }
}
