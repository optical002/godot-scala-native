package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OpenXRHand`, extends `Node3D`. */
abstract class OpenXRHand extends Node3D {
  override def godotClassName: String = "OpenXRHand"

  /** OpenXRHand.set_hand */
  final def setHand(hand: gdext.classes.OpenXRHand.Hands): Unit = {
    if (gdext.classes.OpenXRHand.mb_set_hand == null) gdext.classes.OpenXRHand.mb_set_hand = MethodBind.get("OpenXRHand", "set_hand", 1849328560L)
    Ptrcall.callVoid1(gdext.classes.OpenXRHand.mb_set_hand, livePtr, hand)
  }

  /** OpenXRHand.get_hand */
  final def getHand(): gdext.classes.OpenXRHand.Hands = {
    if (gdext.classes.OpenXRHand.mb_get_hand == null) gdext.classes.OpenXRHand.mb_get_hand = MethodBind.get("OpenXRHand", "get_hand", 2850644561L)
    gdext.classes.OpenXRHand.Hands(Ptrcall.call0[Long](gdext.classes.OpenXRHand.mb_get_hand, livePtr))
  }

  /** OpenXRHand.set_motion_range */
  final def setMotionRange(motionRange: gdext.classes.OpenXRHand.MotionRange): Unit = {
    if (gdext.classes.OpenXRHand.mb_set_motion_range == null) gdext.classes.OpenXRHand.mb_set_motion_range = MethodBind.get("OpenXRHand", "set_motion_range", 3326516003L)
    Ptrcall.callVoid1(gdext.classes.OpenXRHand.mb_set_motion_range, livePtr, motionRange)
  }

  /** OpenXRHand.get_motion_range */
  final def getMotionRange(): gdext.classes.OpenXRHand.MotionRange = {
    if (gdext.classes.OpenXRHand.mb_get_motion_range == null) gdext.classes.OpenXRHand.mb_get_motion_range = MethodBind.get("OpenXRHand", "get_motion_range", 2191822314L)
    gdext.classes.OpenXRHand.MotionRange(Ptrcall.call0[Long](gdext.classes.OpenXRHand.mb_get_motion_range, livePtr))
  }

  /** OpenXRHand.set_skeleton_rig */
  final def setSkeletonRig(skeletonRig: gdext.classes.OpenXRHand.SkeletonRig): Unit = {
    if (gdext.classes.OpenXRHand.mb_set_skeleton_rig == null) gdext.classes.OpenXRHand.mb_set_skeleton_rig = MethodBind.get("OpenXRHand", "set_skeleton_rig", 1528072213L)
    Ptrcall.callVoid1(gdext.classes.OpenXRHand.mb_set_skeleton_rig, livePtr, skeletonRig)
  }

  /** OpenXRHand.get_skeleton_rig */
  final def getSkeletonRig(): gdext.classes.OpenXRHand.SkeletonRig = {
    if (gdext.classes.OpenXRHand.mb_get_skeleton_rig == null) gdext.classes.OpenXRHand.mb_get_skeleton_rig = MethodBind.get("OpenXRHand", "get_skeleton_rig", 968409338L)
    gdext.classes.OpenXRHand.SkeletonRig(Ptrcall.call0[Long](gdext.classes.OpenXRHand.mb_get_skeleton_rig, livePtr))
  }

  /** OpenXRHand.set_bone_update */
  final def setBoneUpdate(boneUpdate: gdext.classes.OpenXRHand.BoneUpdate): Unit = {
    if (gdext.classes.OpenXRHand.mb_set_bone_update == null) gdext.classes.OpenXRHand.mb_set_bone_update = MethodBind.get("OpenXRHand", "set_bone_update", 3144625444L)
    Ptrcall.callVoid1(gdext.classes.OpenXRHand.mb_set_bone_update, livePtr, boneUpdate)
  }

  /** OpenXRHand.get_bone_update */
  final def getBoneUpdate(): gdext.classes.OpenXRHand.BoneUpdate = {
    if (gdext.classes.OpenXRHand.mb_get_bone_update == null) gdext.classes.OpenXRHand.mb_get_bone_update = MethodBind.get("OpenXRHand", "get_bone_update", 1310695248L)
    gdext.classes.OpenXRHand.BoneUpdate(Ptrcall.call0[Long](gdext.classes.OpenXRHand.mb_get_bone_update, livePtr))
  }

}

object OpenXRHand {
  private[classes] var mb_set_hand: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_hand: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_motion_range: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_motion_range: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_skeleton_rig: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_skeleton_rig: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bone_update: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bone_update: GDExtensionMethodBindPtr = null

  /** Godot enum `OpenXRHand.Hands`. */
  opaque type Hands <: Long = Long

  object Hands {
    final val Left: Hands = 0L.asInstanceOf[Hands]
    final val Right: Hands = 1L.asInstanceOf[Hands]
    final val Max: Hands = 2L.asInstanceOf[Hands]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Hands = value.asInstanceOf[Hands]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Hands] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[Hands]]

    extension (self: Hands)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Left"
        case 1L => "Right"
        case 2L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `OpenXRHand.MotionRange`. */
  opaque type MotionRange <: Long = Long

  object MotionRange {
    final val Unobstructed: MotionRange = 0L.asInstanceOf[MotionRange]
    final val ConformToController: MotionRange = 1L.asInstanceOf[MotionRange]
    final val Max: MotionRange = 2L.asInstanceOf[MotionRange]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): MotionRange = value.asInstanceOf[MotionRange]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[MotionRange] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[MotionRange]]

    extension (self: MotionRange)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Unobstructed"
        case 1L => "ConformToController"
        case 2L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `OpenXRHand.SkeletonRig`. */
  opaque type SkeletonRig <: Long = Long

  object SkeletonRig {
    final val Openxr: SkeletonRig = 0L.asInstanceOf[SkeletonRig]
    final val Humanoid: SkeletonRig = 1L.asInstanceOf[SkeletonRig]
    final val Max: SkeletonRig = 2L.asInstanceOf[SkeletonRig]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): SkeletonRig = value.asInstanceOf[SkeletonRig]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[SkeletonRig] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[SkeletonRig]]

    extension (self: SkeletonRig)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Openxr"
        case 1L => "Humanoid"
        case 2L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `OpenXRHand.BoneUpdate`. */
  opaque type BoneUpdate <: Long = Long

  object BoneUpdate {
    final val Full: BoneUpdate = 0L.asInstanceOf[BoneUpdate]
    final val RotationOnly: BoneUpdate = 1L.asInstanceOf[BoneUpdate]
    final val Max: BoneUpdate = 2L.asInstanceOf[BoneUpdate]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): BoneUpdate = value.asInstanceOf[BoneUpdate]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[BoneUpdate] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[BoneUpdate]]

    extension (self: BoneUpdate)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Full"
        case 1L => "RotationOnly"
        case 2L => "Max"
        case other => other.toString
      }
  }
}
