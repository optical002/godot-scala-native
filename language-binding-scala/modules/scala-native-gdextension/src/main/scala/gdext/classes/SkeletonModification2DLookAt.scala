package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `SkeletonModification2DLookAt`, extends `SkeletonModification2D`. */
abstract class SkeletonModification2DLookAt extends SkeletonModification2D {
  override def godotClassName: String = "SkeletonModification2DLookAt"

  /** SkeletonModification2DLookAt.set_bone_index */
  final def setBoneIndex(bone_idx: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("SkeletonModification2DLookAt", "set_bone_index", 1286410249L), hostObject.objectPtr, bone_idx)

  /** SkeletonModification2DLookAt.get_bone_index */
  final def getBoneIndex(): Long =
    Ptrcall.call0[Long](MethodBind.get("SkeletonModification2DLookAt", "get_bone_index", 3905245786L), hostObject.objectPtr)

  /** SkeletonModification2DLookAt.set_additional_rotation */
  final def setAdditionalRotation(rotation: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("SkeletonModification2DLookAt", "set_additional_rotation", 373806689L), hostObject.objectPtr, rotation)

  /** SkeletonModification2DLookAt.get_additional_rotation */
  final def getAdditionalRotation(): Double =
    Ptrcall.call0[Double](MethodBind.get("SkeletonModification2DLookAt", "get_additional_rotation", 1740695150L), hostObject.objectPtr)

  /** SkeletonModification2DLookAt.set_enable_constraint */
  final def setEnableConstraint(enable_constraint: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("SkeletonModification2DLookAt", "set_enable_constraint", 2586408642L), hostObject.objectPtr, enable_constraint)

  /** SkeletonModification2DLookAt.get_enable_constraint */
  final def getEnableConstraint(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("SkeletonModification2DLookAt", "get_enable_constraint", 36873697L), hostObject.objectPtr)

  /** SkeletonModification2DLookAt.set_constraint_angle_min */
  final def setConstraintAngleMin(angle_min: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("SkeletonModification2DLookAt", "set_constraint_angle_min", 373806689L), hostObject.objectPtr, angle_min)

  /** SkeletonModification2DLookAt.get_constraint_angle_min */
  final def getConstraintAngleMin(): Double =
    Ptrcall.call0[Double](MethodBind.get("SkeletonModification2DLookAt", "get_constraint_angle_min", 1740695150L), hostObject.objectPtr)

  /** SkeletonModification2DLookAt.set_constraint_angle_max */
  final def setConstraintAngleMax(angle_max: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("SkeletonModification2DLookAt", "set_constraint_angle_max", 373806689L), hostObject.objectPtr, angle_max)

  /** SkeletonModification2DLookAt.get_constraint_angle_max */
  final def getConstraintAngleMax(): Double =
    Ptrcall.call0[Double](MethodBind.get("SkeletonModification2DLookAt", "get_constraint_angle_max", 1740695150L), hostObject.objectPtr)

  /** SkeletonModification2DLookAt.set_constraint_angle_invert */
  final def setConstraintAngleInvert(invert: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("SkeletonModification2DLookAt", "set_constraint_angle_invert", 2586408642L), hostObject.objectPtr, invert)

  /** SkeletonModification2DLookAt.get_constraint_angle_invert */
  final def getConstraintAngleInvert(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("SkeletonModification2DLookAt", "get_constraint_angle_invert", 36873697L), hostObject.objectPtr)

}
