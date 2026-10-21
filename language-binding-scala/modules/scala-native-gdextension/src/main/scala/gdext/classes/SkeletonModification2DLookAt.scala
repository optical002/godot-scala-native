package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `SkeletonModification2DLookAt`, extends `SkeletonModification2D`. */
abstract class SkeletonModification2DLookAt extends SkeletonModification2D {
  override def godotClassName: String = "SkeletonModification2DLookAt"

  /** SkeletonModification2DLookAt.set_bone_index */
  final def setBoneIndex(bone_idx: Long): Unit = {
    if (gdext.classes.SkeletonModification2DLookAt.mb_set_bone_index == null) gdext.classes.SkeletonModification2DLookAt.mb_set_bone_index = MethodBind.get("SkeletonModification2DLookAt", "set_bone_index", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.SkeletonModification2DLookAt.mb_set_bone_index, livePtr, bone_idx)
  }

  /** SkeletonModification2DLookAt.get_bone_index */
  final def getBoneIndex(): Long = {
    if (gdext.classes.SkeletonModification2DLookAt.mb_get_bone_index == null) gdext.classes.SkeletonModification2DLookAt.mb_get_bone_index = MethodBind.get("SkeletonModification2DLookAt", "get_bone_index", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.SkeletonModification2DLookAt.mb_get_bone_index, livePtr)
  }

  /** SkeletonModification2DLookAt.set_additional_rotation */
  final def setAdditionalRotation(rotation: Double): Unit = {
    if (gdext.classes.SkeletonModification2DLookAt.mb_set_additional_rotation == null) gdext.classes.SkeletonModification2DLookAt.mb_set_additional_rotation = MethodBind.get("SkeletonModification2DLookAt", "set_additional_rotation", 373806689L)
    Ptrcall.callVoid1(gdext.classes.SkeletonModification2DLookAt.mb_set_additional_rotation, livePtr, rotation)
  }

  /** SkeletonModification2DLookAt.get_additional_rotation */
  final def getAdditionalRotation(): Double = {
    if (gdext.classes.SkeletonModification2DLookAt.mb_get_additional_rotation == null) gdext.classes.SkeletonModification2DLookAt.mb_get_additional_rotation = MethodBind.get("SkeletonModification2DLookAt", "get_additional_rotation", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.SkeletonModification2DLookAt.mb_get_additional_rotation, livePtr)
  }

  /** SkeletonModification2DLookAt.set_enable_constraint */
  final def setEnableConstraint(enable_constraint: Boolean): Unit = {
    if (gdext.classes.SkeletonModification2DLookAt.mb_set_enable_constraint == null) gdext.classes.SkeletonModification2DLookAt.mb_set_enable_constraint = MethodBind.get("SkeletonModification2DLookAt", "set_enable_constraint", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.SkeletonModification2DLookAt.mb_set_enable_constraint, livePtr, enable_constraint)
  }

  /** SkeletonModification2DLookAt.get_enable_constraint */
  final def getEnableConstraint(): Boolean = {
    if (gdext.classes.SkeletonModification2DLookAt.mb_get_enable_constraint == null) gdext.classes.SkeletonModification2DLookAt.mb_get_enable_constraint = MethodBind.get("SkeletonModification2DLookAt", "get_enable_constraint", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.SkeletonModification2DLookAt.mb_get_enable_constraint, livePtr)
  }

  /** SkeletonModification2DLookAt.set_constraint_angle_min */
  final def setConstraintAngleMin(angle_min: Double): Unit = {
    if (gdext.classes.SkeletonModification2DLookAt.mb_set_constraint_angle_min == null) gdext.classes.SkeletonModification2DLookAt.mb_set_constraint_angle_min = MethodBind.get("SkeletonModification2DLookAt", "set_constraint_angle_min", 373806689L)
    Ptrcall.callVoid1(gdext.classes.SkeletonModification2DLookAt.mb_set_constraint_angle_min, livePtr, angle_min)
  }

  /** SkeletonModification2DLookAt.get_constraint_angle_min */
  final def getConstraintAngleMin(): Double = {
    if (gdext.classes.SkeletonModification2DLookAt.mb_get_constraint_angle_min == null) gdext.classes.SkeletonModification2DLookAt.mb_get_constraint_angle_min = MethodBind.get("SkeletonModification2DLookAt", "get_constraint_angle_min", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.SkeletonModification2DLookAt.mb_get_constraint_angle_min, livePtr)
  }

  /** SkeletonModification2DLookAt.set_constraint_angle_max */
  final def setConstraintAngleMax(angle_max: Double): Unit = {
    if (gdext.classes.SkeletonModification2DLookAt.mb_set_constraint_angle_max == null) gdext.classes.SkeletonModification2DLookAt.mb_set_constraint_angle_max = MethodBind.get("SkeletonModification2DLookAt", "set_constraint_angle_max", 373806689L)
    Ptrcall.callVoid1(gdext.classes.SkeletonModification2DLookAt.mb_set_constraint_angle_max, livePtr, angle_max)
  }

  /** SkeletonModification2DLookAt.get_constraint_angle_max */
  final def getConstraintAngleMax(): Double = {
    if (gdext.classes.SkeletonModification2DLookAt.mb_get_constraint_angle_max == null) gdext.classes.SkeletonModification2DLookAt.mb_get_constraint_angle_max = MethodBind.get("SkeletonModification2DLookAt", "get_constraint_angle_max", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.SkeletonModification2DLookAt.mb_get_constraint_angle_max, livePtr)
  }

  /** SkeletonModification2DLookAt.set_constraint_angle_invert */
  final def setConstraintAngleInvert(invert: Boolean): Unit = {
    if (gdext.classes.SkeletonModification2DLookAt.mb_set_constraint_angle_invert == null) gdext.classes.SkeletonModification2DLookAt.mb_set_constraint_angle_invert = MethodBind.get("SkeletonModification2DLookAt", "set_constraint_angle_invert", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.SkeletonModification2DLookAt.mb_set_constraint_angle_invert, livePtr, invert)
  }

  /** SkeletonModification2DLookAt.get_constraint_angle_invert */
  final def getConstraintAngleInvert(): Boolean = {
    if (gdext.classes.SkeletonModification2DLookAt.mb_get_constraint_angle_invert == null) gdext.classes.SkeletonModification2DLookAt.mb_get_constraint_angle_invert = MethodBind.get("SkeletonModification2DLookAt", "get_constraint_angle_invert", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.SkeletonModification2DLookAt.mb_get_constraint_angle_invert, livePtr)
  }

}

object SkeletonModification2DLookAt {
  private[classes] var mb_set_bone_index: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bone_index: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_additional_rotation: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_additional_rotation: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_enable_constraint: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_enable_constraint: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_constraint_angle_min: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_constraint_angle_min: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_constraint_angle_max: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_constraint_angle_max: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_constraint_angle_invert: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_constraint_angle_invert: GDExtensionMethodBindPtr = null
}
