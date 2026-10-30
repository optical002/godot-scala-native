package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Bone2D`, extends `Node2D`. */
abstract class Bone2D extends Node2D {
  override def godotClassName: String = "Bone2D"

  /** Bone2D.set_rest */
  final def setRest(rest: gdext.builtin.Transform2D): Unit = {
    if (gdext.classes.Bone2D.mb_set_rest == null) gdext.classes.Bone2D.mb_set_rest = MethodBind.get("Bone2D", "set_rest", 2761652528L)
    Ptrcall.callVoid1(gdext.classes.Bone2D.mb_set_rest, livePtr, rest)
  }

  /** Bone2D.get_rest */
  final def getRest(): gdext.builtin.Transform2D = {
    if (gdext.classes.Bone2D.mb_get_rest == null) gdext.classes.Bone2D.mb_get_rest = MethodBind.get("Bone2D", "get_rest", 3814499831L)
    Ptrcall.call0[gdext.builtin.Transform2D](gdext.classes.Bone2D.mb_get_rest, livePtr)
  }

  /** Bone2D.apply_rest */
  final def applyRest(): Unit = {
    if (gdext.classes.Bone2D.mb_apply_rest == null) gdext.classes.Bone2D.mb_apply_rest = MethodBind.get("Bone2D", "apply_rest", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Bone2D.mb_apply_rest, livePtr)
  }

  /** Bone2D.get_skeleton_rest */
  final def getSkeletonRest(): gdext.builtin.Transform2D = {
    if (gdext.classes.Bone2D.mb_get_skeleton_rest == null) gdext.classes.Bone2D.mb_get_skeleton_rest = MethodBind.get("Bone2D", "get_skeleton_rest", 3814499831L)
    Ptrcall.call0[gdext.builtin.Transform2D](gdext.classes.Bone2D.mb_get_skeleton_rest, livePtr)
  }

  /** Bone2D.get_index_in_skeleton */
  final def getIndexInSkeleton(): Long = {
    if (gdext.classes.Bone2D.mb_get_index_in_skeleton == null) gdext.classes.Bone2D.mb_get_index_in_skeleton = MethodBind.get("Bone2D", "get_index_in_skeleton", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Bone2D.mb_get_index_in_skeleton, livePtr)
  }

  /** Bone2D.set_autocalculate_length_and_angle */
  final def setAutocalculateLengthAndAngle(autoCalculate: Boolean): Unit = {
    if (gdext.classes.Bone2D.mb_set_autocalculate_length_and_angle == null) gdext.classes.Bone2D.mb_set_autocalculate_length_and_angle = MethodBind.get("Bone2D", "set_autocalculate_length_and_angle", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Bone2D.mb_set_autocalculate_length_and_angle, livePtr, autoCalculate)
  }

  /** Bone2D.get_autocalculate_length_and_angle */
  final def getAutocalculateLengthAndAngle(): Boolean = {
    if (gdext.classes.Bone2D.mb_get_autocalculate_length_and_angle == null) gdext.classes.Bone2D.mb_get_autocalculate_length_and_angle = MethodBind.get("Bone2D", "get_autocalculate_length_and_angle", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Bone2D.mb_get_autocalculate_length_and_angle, livePtr)
  }

  /** Bone2D.set_length */
  final def setLength(length: Double): Unit = {
    if (gdext.classes.Bone2D.mb_set_length == null) gdext.classes.Bone2D.mb_set_length = MethodBind.get("Bone2D", "set_length", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Bone2D.mb_set_length, livePtr, length)
  }

  /** Bone2D.get_length */
  final def getLength(): Double = {
    if (gdext.classes.Bone2D.mb_get_length == null) gdext.classes.Bone2D.mb_get_length = MethodBind.get("Bone2D", "get_length", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Bone2D.mb_get_length, livePtr)
  }

  /** Bone2D.set_bone_angle */
  final def setBoneAngle(angle: Double): Unit = {
    if (gdext.classes.Bone2D.mb_set_bone_angle == null) gdext.classes.Bone2D.mb_set_bone_angle = MethodBind.get("Bone2D", "set_bone_angle", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Bone2D.mb_set_bone_angle, livePtr, angle)
  }

  /** Bone2D.get_bone_angle */
  final def getBoneAngle(): Double = {
    if (gdext.classes.Bone2D.mb_get_bone_angle == null) gdext.classes.Bone2D.mb_get_bone_angle = MethodBind.get("Bone2D", "get_bone_angle", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Bone2D.mb_get_bone_angle, livePtr)
  }

}

object Bone2D {
  private[classes] var mb_set_rest: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_rest: GDExtensionMethodBindPtr = null
  private[classes] var mb_apply_rest: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_skeleton_rest: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_index_in_skeleton: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_autocalculate_length_and_angle: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_autocalculate_length_and_angle: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bone_angle: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bone_angle: GDExtensionMethodBindPtr = null
}
