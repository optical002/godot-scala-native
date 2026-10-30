package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `XRBodyTracker`, extends `XRPositionalTracker`. */
abstract class XRBodyTracker extends XRPositionalTracker {
  override def godotClassName: String = "XRBodyTracker"

  /** XRBodyTracker.set_has_tracking_data */
  final def setHasTrackingData(hasData: Boolean): Unit = {
    if (gdext.classes.XRBodyTracker.mb_set_has_tracking_data == null) gdext.classes.XRBodyTracker.mb_set_has_tracking_data = MethodBind.get("XRBodyTracker", "set_has_tracking_data", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.XRBodyTracker.mb_set_has_tracking_data, livePtr, hasData)
  }

  /** XRBodyTracker.get_has_tracking_data */
  final def getHasTrackingData(): Boolean = {
    if (gdext.classes.XRBodyTracker.mb_get_has_tracking_data == null) gdext.classes.XRBodyTracker.mb_get_has_tracking_data = MethodBind.get("XRBodyTracker", "get_has_tracking_data", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.XRBodyTracker.mb_get_has_tracking_data, livePtr)
  }

  /** XRBodyTracker.set_body_flags */
  final def setBodyFlags(flags: gdext.classes.XRBodyTracker.BodyFlags): Unit = {
    if (gdext.classes.XRBodyTracker.mb_set_body_flags == null) gdext.classes.XRBodyTracker.mb_set_body_flags = MethodBind.get("XRBodyTracker", "set_body_flags", 2103235750L)
    Ptrcall.callVoid1(gdext.classes.XRBodyTracker.mb_set_body_flags, livePtr, flags.asInstanceOf[Long])
  }

  /** XRBodyTracker.get_body_flags */
  final def getBodyFlags(): gdext.classes.XRBodyTracker.BodyFlags = {
    if (gdext.classes.XRBodyTracker.mb_get_body_flags == null) gdext.classes.XRBodyTracker.mb_get_body_flags = MethodBind.get("XRBodyTracker", "get_body_flags", 3543166366L)
    gdext.classes.XRBodyTracker.BodyFlags(Ptrcall.call0[Long](gdext.classes.XRBodyTracker.mb_get_body_flags, livePtr))
  }

  /** XRBodyTracker.set_joint_flags */
  final def setJointFlags(joint: gdext.classes.XRBodyTracker.Joint, flags: gdext.classes.XRBodyTracker.JointFlags): Unit = {
    if (gdext.classes.XRBodyTracker.mb_set_joint_flags == null) gdext.classes.XRBodyTracker.mb_set_joint_flags = MethodBind.get("XRBodyTracker", "set_joint_flags", 592144999L)
    Ptrcall.callVoid2(gdext.classes.XRBodyTracker.mb_set_joint_flags, livePtr, joint, flags.asInstanceOf[Long])
  }

  /** XRBodyTracker.get_joint_flags */
  final def getJointFlags(joint: gdext.classes.XRBodyTracker.Joint): gdext.classes.XRBodyTracker.JointFlags = {
    if (gdext.classes.XRBodyTracker.mb_get_joint_flags == null) gdext.classes.XRBodyTracker.mb_get_joint_flags = MethodBind.get("XRBodyTracker", "get_joint_flags", 1030162609L)
    gdext.classes.XRBodyTracker.JointFlags(Ptrcall.call1[Long, Long](gdext.classes.XRBodyTracker.mb_get_joint_flags, livePtr, joint))
  }

  /** XRBodyTracker.set_joint_transform */
  final def setJointTransform(joint: gdext.classes.XRBodyTracker.Joint, transform: gdext.builtin.Transform3D): Unit = {
    if (gdext.classes.XRBodyTracker.mb_set_joint_transform == null) gdext.classes.XRBodyTracker.mb_set_joint_transform = MethodBind.get("XRBodyTracker", "set_joint_transform", 2635424328L)
    Ptrcall.callVoid2(gdext.classes.XRBodyTracker.mb_set_joint_transform, livePtr, joint, transform)
  }

  /** XRBodyTracker.get_joint_transform */
  final def getJointTransform(joint: gdext.classes.XRBodyTracker.Joint): gdext.builtin.Transform3D = {
    if (gdext.classes.XRBodyTracker.mb_get_joint_transform == null) gdext.classes.XRBodyTracker.mb_get_joint_transform = MethodBind.get("XRBodyTracker", "get_joint_transform", 3474811534L)
    Ptrcall.call1[Long, gdext.builtin.Transform3D](gdext.classes.XRBodyTracker.mb_get_joint_transform, livePtr, joint)
  }

}

object XRBodyTracker {
  private[classes] var mb_set_has_tracking_data: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_has_tracking_data: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_body_flags: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_body_flags: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_joint_flags: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_joint_flags: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_joint_transform: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_joint_transform: GDExtensionMethodBindPtr = null

  /** Godot bitfield `XRBodyTracker.BodyFlags`. */
  opaque type BodyFlags = Long

  object BodyFlags {
    final val UpperBodySupported: BodyFlags = 1L.asInstanceOf[BodyFlags]
    final val LowerBodySupported: BodyFlags = 2L.asInstanceOf[BodyFlags]
    final val HandsSupported: BodyFlags = 4L.asInstanceOf[BodyFlags]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): BodyFlags = value.asInstanceOf[BodyFlags]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[BodyFlags] = scala.IArray[Long](1L, 2L, 4L).asInstanceOf[scala.IArray[BodyFlags]]

    extension (self: BodyFlags)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 1L => "UpperBodySupported"
        case 2L => "LowerBodySupported"
        case 4L => "HandsSupported"
        case other => other.toString
      }
    extension (self: BodyFlags) {
      inline def value: Long = self.asInstanceOf[Long]
      inline def |(other: BodyFlags): BodyFlags = (self.value | other.value).asInstanceOf[BodyFlags]
      inline def &(other: BodyFlags): BodyFlags = (self.value & other.value).asInstanceOf[BodyFlags]
      /** Every bit of `flag` is set. */
      inline def has(flag: BodyFlags): Boolean = (self.value & flag.value) == flag.value
    }
  }

  /** Godot enum `XRBodyTracker.Joint`. */
  opaque type Joint <: Long = Long

  object Joint {
    final val Root: Joint = 0L.asInstanceOf[Joint]
    final val Hips: Joint = 1L.asInstanceOf[Joint]
    final val Spine: Joint = 2L.asInstanceOf[Joint]
    final val Chest: Joint = 3L.asInstanceOf[Joint]
    final val UpperChest: Joint = 4L.asInstanceOf[Joint]
    final val Neck: Joint = 5L.asInstanceOf[Joint]
    final val Head: Joint = 6L.asInstanceOf[Joint]
    final val HeadTip: Joint = 7L.asInstanceOf[Joint]
    final val LeftShoulder: Joint = 8L.asInstanceOf[Joint]
    final val LeftUpperArm: Joint = 9L.asInstanceOf[Joint]
    final val LeftLowerArm: Joint = 10L.asInstanceOf[Joint]
    final val RightShoulder: Joint = 11L.asInstanceOf[Joint]
    final val RightUpperArm: Joint = 12L.asInstanceOf[Joint]
    final val RightLowerArm: Joint = 13L.asInstanceOf[Joint]
    final val LeftUpperLeg: Joint = 14L.asInstanceOf[Joint]
    final val LeftLowerLeg: Joint = 15L.asInstanceOf[Joint]
    final val LeftFoot: Joint = 16L.asInstanceOf[Joint]
    final val LeftToes: Joint = 17L.asInstanceOf[Joint]
    final val RightUpperLeg: Joint = 18L.asInstanceOf[Joint]
    final val RightLowerLeg: Joint = 19L.asInstanceOf[Joint]
    final val RightFoot: Joint = 20L.asInstanceOf[Joint]
    final val RightToes: Joint = 21L.asInstanceOf[Joint]
    final val LeftHand: Joint = 22L.asInstanceOf[Joint]
    final val LeftPalm: Joint = 23L.asInstanceOf[Joint]
    final val LeftWrist: Joint = 24L.asInstanceOf[Joint]
    final val LeftThumbMetacarpal: Joint = 25L.asInstanceOf[Joint]
    final val LeftThumbPhalanxProximal: Joint = 26L.asInstanceOf[Joint]
    final val LeftThumbPhalanxDistal: Joint = 27L.asInstanceOf[Joint]
    final val LeftThumbTip: Joint = 28L.asInstanceOf[Joint]
    final val LeftIndexFingerMetacarpal: Joint = 29L.asInstanceOf[Joint]
    final val LeftIndexFingerPhalanxProximal: Joint = 30L.asInstanceOf[Joint]
    final val LeftIndexFingerPhalanxIntermediate: Joint = 31L.asInstanceOf[Joint]
    final val LeftIndexFingerPhalanxDistal: Joint = 32L.asInstanceOf[Joint]
    final val LeftIndexFingerTip: Joint = 33L.asInstanceOf[Joint]
    final val LeftMiddleFingerMetacarpal: Joint = 34L.asInstanceOf[Joint]
    final val LeftMiddleFingerPhalanxProximal: Joint = 35L.asInstanceOf[Joint]
    final val LeftMiddleFingerPhalanxIntermediate: Joint = 36L.asInstanceOf[Joint]
    final val LeftMiddleFingerPhalanxDistal: Joint = 37L.asInstanceOf[Joint]
    final val LeftMiddleFingerTip: Joint = 38L.asInstanceOf[Joint]
    final val LeftRingFingerMetacarpal: Joint = 39L.asInstanceOf[Joint]
    final val LeftRingFingerPhalanxProximal: Joint = 40L.asInstanceOf[Joint]
    final val LeftRingFingerPhalanxIntermediate: Joint = 41L.asInstanceOf[Joint]
    final val LeftRingFingerPhalanxDistal: Joint = 42L.asInstanceOf[Joint]
    final val LeftRingFingerTip: Joint = 43L.asInstanceOf[Joint]
    final val LeftPinkyFingerMetacarpal: Joint = 44L.asInstanceOf[Joint]
    final val LeftPinkyFingerPhalanxProximal: Joint = 45L.asInstanceOf[Joint]
    final val LeftPinkyFingerPhalanxIntermediate: Joint = 46L.asInstanceOf[Joint]
    final val LeftPinkyFingerPhalanxDistal: Joint = 47L.asInstanceOf[Joint]
    final val LeftPinkyFingerTip: Joint = 48L.asInstanceOf[Joint]
    final val RightHand: Joint = 49L.asInstanceOf[Joint]
    final val RightPalm: Joint = 50L.asInstanceOf[Joint]
    final val RightWrist: Joint = 51L.asInstanceOf[Joint]
    final val RightThumbMetacarpal: Joint = 52L.asInstanceOf[Joint]
    final val RightThumbPhalanxProximal: Joint = 53L.asInstanceOf[Joint]
    final val RightThumbPhalanxDistal: Joint = 54L.asInstanceOf[Joint]
    final val RightThumbTip: Joint = 55L.asInstanceOf[Joint]
    final val RightIndexFingerMetacarpal: Joint = 56L.asInstanceOf[Joint]
    final val RightIndexFingerPhalanxProximal: Joint = 57L.asInstanceOf[Joint]
    final val RightIndexFingerPhalanxIntermediate: Joint = 58L.asInstanceOf[Joint]
    final val RightIndexFingerPhalanxDistal: Joint = 59L.asInstanceOf[Joint]
    final val RightIndexFingerTip: Joint = 60L.asInstanceOf[Joint]
    final val RightMiddleFingerMetacarpal: Joint = 61L.asInstanceOf[Joint]
    final val RightMiddleFingerPhalanxProximal: Joint = 62L.asInstanceOf[Joint]
    final val RightMiddleFingerPhalanxIntermediate: Joint = 63L.asInstanceOf[Joint]
    final val RightMiddleFingerPhalanxDistal: Joint = 64L.asInstanceOf[Joint]
    final val RightMiddleFingerTip: Joint = 65L.asInstanceOf[Joint]
    final val RightRingFingerMetacarpal: Joint = 66L.asInstanceOf[Joint]
    final val RightRingFingerPhalanxProximal: Joint = 67L.asInstanceOf[Joint]
    final val RightRingFingerPhalanxIntermediate: Joint = 68L.asInstanceOf[Joint]
    final val RightRingFingerPhalanxDistal: Joint = 69L.asInstanceOf[Joint]
    final val RightRingFingerTip: Joint = 70L.asInstanceOf[Joint]
    final val RightPinkyFingerMetacarpal: Joint = 71L.asInstanceOf[Joint]
    final val RightPinkyFingerPhalanxProximal: Joint = 72L.asInstanceOf[Joint]
    final val RightPinkyFingerPhalanxIntermediate: Joint = 73L.asInstanceOf[Joint]
    final val RightPinkyFingerPhalanxDistal: Joint = 74L.asInstanceOf[Joint]
    final val RightPinkyFingerTip: Joint = 75L.asInstanceOf[Joint]
    final val LowerChest: Joint = 76L.asInstanceOf[Joint]
    final val LeftScapula: Joint = 77L.asInstanceOf[Joint]
    final val LeftWristTwist: Joint = 78L.asInstanceOf[Joint]
    final val RightScapula: Joint = 79L.asInstanceOf[Joint]
    final val RightWristTwist: Joint = 80L.asInstanceOf[Joint]
    final val LeftFootTwist: Joint = 81L.asInstanceOf[Joint]
    final val LeftHeel: Joint = 82L.asInstanceOf[Joint]
    final val LeftMiddleFoot: Joint = 83L.asInstanceOf[Joint]
    final val RightFootTwist: Joint = 84L.asInstanceOf[Joint]
    final val RightHeel: Joint = 85L.asInstanceOf[Joint]
    final val RightMiddleFoot: Joint = 86L.asInstanceOf[Joint]
    final val Max: Joint = 87L.asInstanceOf[Joint]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Joint = value.asInstanceOf[Joint]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Joint] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 11L, 12L, 13L, 14L, 15L, 16L, 17L, 18L, 19L, 20L, 21L, 22L, 23L, 24L, 25L, 26L, 27L, 28L, 29L, 30L, 31L, 32L, 33L, 34L, 35L, 36L, 37L, 38L, 39L, 40L, 41L, 42L, 43L, 44L, 45L, 46L, 47L, 48L, 49L, 50L, 51L, 52L, 53L, 54L, 55L, 56L, 57L, 58L, 59L, 60L, 61L, 62L, 63L, 64L, 65L, 66L, 67L, 68L, 69L, 70L, 71L, 72L, 73L, 74L, 75L, 76L, 77L, 78L, 79L, 80L, 81L, 82L, 83L, 84L, 85L, 86L, 87L).asInstanceOf[scala.IArray[Joint]]

    extension (self: Joint)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Root"
        case 1L => "Hips"
        case 2L => "Spine"
        case 3L => "Chest"
        case 4L => "UpperChest"
        case 5L => "Neck"
        case 6L => "Head"
        case 7L => "HeadTip"
        case 8L => "LeftShoulder"
        case 9L => "LeftUpperArm"
        case 10L => "LeftLowerArm"
        case 11L => "RightShoulder"
        case 12L => "RightUpperArm"
        case 13L => "RightLowerArm"
        case 14L => "LeftUpperLeg"
        case 15L => "LeftLowerLeg"
        case 16L => "LeftFoot"
        case 17L => "LeftToes"
        case 18L => "RightUpperLeg"
        case 19L => "RightLowerLeg"
        case 20L => "RightFoot"
        case 21L => "RightToes"
        case 22L => "LeftHand"
        case 23L => "LeftPalm"
        case 24L => "LeftWrist"
        case 25L => "LeftThumbMetacarpal"
        case 26L => "LeftThumbPhalanxProximal"
        case 27L => "LeftThumbPhalanxDistal"
        case 28L => "LeftThumbTip"
        case 29L => "LeftIndexFingerMetacarpal"
        case 30L => "LeftIndexFingerPhalanxProximal"
        case 31L => "LeftIndexFingerPhalanxIntermediate"
        case 32L => "LeftIndexFingerPhalanxDistal"
        case 33L => "LeftIndexFingerTip"
        case 34L => "LeftMiddleFingerMetacarpal"
        case 35L => "LeftMiddleFingerPhalanxProximal"
        case 36L => "LeftMiddleFingerPhalanxIntermediate"
        case 37L => "LeftMiddleFingerPhalanxDistal"
        case 38L => "LeftMiddleFingerTip"
        case 39L => "LeftRingFingerMetacarpal"
        case 40L => "LeftRingFingerPhalanxProximal"
        case 41L => "LeftRingFingerPhalanxIntermediate"
        case 42L => "LeftRingFingerPhalanxDistal"
        case 43L => "LeftRingFingerTip"
        case 44L => "LeftPinkyFingerMetacarpal"
        case 45L => "LeftPinkyFingerPhalanxProximal"
        case 46L => "LeftPinkyFingerPhalanxIntermediate"
        case 47L => "LeftPinkyFingerPhalanxDistal"
        case 48L => "LeftPinkyFingerTip"
        case 49L => "RightHand"
        case 50L => "RightPalm"
        case 51L => "RightWrist"
        case 52L => "RightThumbMetacarpal"
        case 53L => "RightThumbPhalanxProximal"
        case 54L => "RightThumbPhalanxDistal"
        case 55L => "RightThumbTip"
        case 56L => "RightIndexFingerMetacarpal"
        case 57L => "RightIndexFingerPhalanxProximal"
        case 58L => "RightIndexFingerPhalanxIntermediate"
        case 59L => "RightIndexFingerPhalanxDistal"
        case 60L => "RightIndexFingerTip"
        case 61L => "RightMiddleFingerMetacarpal"
        case 62L => "RightMiddleFingerPhalanxProximal"
        case 63L => "RightMiddleFingerPhalanxIntermediate"
        case 64L => "RightMiddleFingerPhalanxDistal"
        case 65L => "RightMiddleFingerTip"
        case 66L => "RightRingFingerMetacarpal"
        case 67L => "RightRingFingerPhalanxProximal"
        case 68L => "RightRingFingerPhalanxIntermediate"
        case 69L => "RightRingFingerPhalanxDistal"
        case 70L => "RightRingFingerTip"
        case 71L => "RightPinkyFingerMetacarpal"
        case 72L => "RightPinkyFingerPhalanxProximal"
        case 73L => "RightPinkyFingerPhalanxIntermediate"
        case 74L => "RightPinkyFingerPhalanxDistal"
        case 75L => "RightPinkyFingerTip"
        case 76L => "LowerChest"
        case 77L => "LeftScapula"
        case 78L => "LeftWristTwist"
        case 79L => "RightScapula"
        case 80L => "RightWristTwist"
        case 81L => "LeftFootTwist"
        case 82L => "LeftHeel"
        case 83L => "LeftMiddleFoot"
        case 84L => "RightFootTwist"
        case 85L => "RightHeel"
        case 86L => "RightMiddleFoot"
        case 87L => "Max"
        case other => other.toString
      }
  }

  /** Godot bitfield `XRBodyTracker.JointFlags`. */
  opaque type JointFlags = Long

  object JointFlags {
    final val OrientationValid: JointFlags = 1L.asInstanceOf[JointFlags]
    final val OrientationTracked: JointFlags = 2L.asInstanceOf[JointFlags]
    final val PositionValid: JointFlags = 4L.asInstanceOf[JointFlags]
    final val PositionTracked: JointFlags = 8L.asInstanceOf[JointFlags]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): JointFlags = value.asInstanceOf[JointFlags]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[JointFlags] = scala.IArray[Long](1L, 2L, 4L, 8L).asInstanceOf[scala.IArray[JointFlags]]

    extension (self: JointFlags)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 1L => "OrientationValid"
        case 2L => "OrientationTracked"
        case 4L => "PositionValid"
        case 8L => "PositionTracked"
        case other => other.toString
      }
    extension (self: JointFlags) {
      inline def value: Long = self.asInstanceOf[Long]
      inline def |(other: JointFlags): JointFlags = (self.value | other.value).asInstanceOf[JointFlags]
      inline def &(other: JointFlags): JointFlags = (self.value & other.value).asInstanceOf[JointFlags]
      /** Every bit of `flag` is set. */
      inline def has(flag: JointFlags): Boolean = (self.value & flag.value) == flag.value
    }
  }
}
