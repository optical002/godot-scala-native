package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `XRHandTracker`, extends `XRPositionalTracker`. */
abstract class XRHandTracker extends XRPositionalTracker {
  override def godotClassName: String = "XRHandTracker"

  /** XRHandTracker.set_has_tracking_data */
  final def setHasTrackingData(hasData: Boolean): Unit = {
    if (gdext.classes.XRHandTracker.mb_set_has_tracking_data == null) gdext.classes.XRHandTracker.mb_set_has_tracking_data = MethodBind.get("XRHandTracker", "set_has_tracking_data", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.XRHandTracker.mb_set_has_tracking_data, livePtr, hasData)
  }

  /** XRHandTracker.get_has_tracking_data */
  final def getHasTrackingData(): Boolean = {
    if (gdext.classes.XRHandTracker.mb_get_has_tracking_data == null) gdext.classes.XRHandTracker.mb_get_has_tracking_data = MethodBind.get("XRHandTracker", "get_has_tracking_data", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.XRHandTracker.mb_get_has_tracking_data, livePtr)
  }

  /** XRHandTracker.set_hand_tracking_source */
  final def setHandTrackingSource(source: gdext.classes.XRHandTracker.HandTrackingSource): Unit = {
    if (gdext.classes.XRHandTracker.mb_set_hand_tracking_source == null) gdext.classes.XRHandTracker.mb_set_hand_tracking_source = MethodBind.get("XRHandTracker", "set_hand_tracking_source", 2958308861L)
    Ptrcall.callVoid1(gdext.classes.XRHandTracker.mb_set_hand_tracking_source, livePtr, source)
  }

  /** XRHandTracker.get_hand_tracking_source */
  final def getHandTrackingSource(): gdext.classes.XRHandTracker.HandTrackingSource = {
    if (gdext.classes.XRHandTracker.mb_get_hand_tracking_source == null) gdext.classes.XRHandTracker.mb_get_hand_tracking_source = MethodBind.get("XRHandTracker", "get_hand_tracking_source", 2475045250L)
    gdext.classes.XRHandTracker.HandTrackingSource(Ptrcall.call0[Long](gdext.classes.XRHandTracker.mb_get_hand_tracking_source, livePtr))
  }

  /** XRHandTracker.set_hand_joint_flags */
  final def setHandJointFlags(joint: gdext.classes.XRHandTracker.HandJoint, flags: gdext.classes.XRHandTracker.HandJointFlags): Unit = {
    if (gdext.classes.XRHandTracker.mb_set_hand_joint_flags == null) gdext.classes.XRHandTracker.mb_set_hand_joint_flags = MethodBind.get("XRHandTracker", "set_hand_joint_flags", 3028437365L)
    Ptrcall.callVoid2(gdext.classes.XRHandTracker.mb_set_hand_joint_flags, livePtr, joint, flags.asInstanceOf[Long])
  }

  /** XRHandTracker.get_hand_joint_flags */
  final def getHandJointFlags(joint: gdext.classes.XRHandTracker.HandJoint): gdext.classes.XRHandTracker.HandJointFlags = {
    if (gdext.classes.XRHandTracker.mb_get_hand_joint_flags == null) gdext.classes.XRHandTracker.mb_get_hand_joint_flags = MethodBind.get("XRHandTracker", "get_hand_joint_flags", 1730972401L)
    gdext.classes.XRHandTracker.HandJointFlags(Ptrcall.call1[Long, Long](gdext.classes.XRHandTracker.mb_get_hand_joint_flags, livePtr, joint))
  }

  /** XRHandTracker.set_hand_joint_transform */
  final def setHandJointTransform(joint: gdext.classes.XRHandTracker.HandJoint, transform: gdext.builtin.Transform3D): Unit = {
    if (gdext.classes.XRHandTracker.mb_set_hand_joint_transform == null) gdext.classes.XRHandTracker.mb_set_hand_joint_transform = MethodBind.get("XRHandTracker", "set_hand_joint_transform", 2529959613L)
    Ptrcall.callVoid2(gdext.classes.XRHandTracker.mb_set_hand_joint_transform, livePtr, joint, transform)
  }

  /** XRHandTracker.get_hand_joint_transform */
  final def getHandJointTransform(joint: gdext.classes.XRHandTracker.HandJoint): gdext.builtin.Transform3D = {
    if (gdext.classes.XRHandTracker.mb_get_hand_joint_transform == null) gdext.classes.XRHandTracker.mb_get_hand_joint_transform = MethodBind.get("XRHandTracker", "get_hand_joint_transform", 1090840196L)
    Ptrcall.call1[Long, gdext.builtin.Transform3D](gdext.classes.XRHandTracker.mb_get_hand_joint_transform, livePtr, joint)
  }

  /** XRHandTracker.set_hand_joint_radius */
  final def setHandJointRadius(joint: gdext.classes.XRHandTracker.HandJoint, radius: Double): Unit = {
    if (gdext.classes.XRHandTracker.mb_set_hand_joint_radius == null) gdext.classes.XRHandTracker.mb_set_hand_joint_radius = MethodBind.get("XRHandTracker", "set_hand_joint_radius", 2723659615L)
    Ptrcall.callVoid2(gdext.classes.XRHandTracker.mb_set_hand_joint_radius, livePtr, joint, radius)
  }

  /** XRHandTracker.get_hand_joint_radius */
  final def getHandJointRadius(joint: gdext.classes.XRHandTracker.HandJoint): Double = {
    if (gdext.classes.XRHandTracker.mb_get_hand_joint_radius == null) gdext.classes.XRHandTracker.mb_get_hand_joint_radius = MethodBind.get("XRHandTracker", "get_hand_joint_radius", 3400025734L)
    Ptrcall.call1[Long, Double](gdext.classes.XRHandTracker.mb_get_hand_joint_radius, livePtr, joint)
  }

  /** XRHandTracker.set_hand_joint_linear_velocity */
  final def setHandJointLinearVelocity(joint: gdext.classes.XRHandTracker.HandJoint, linearVelocity: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.XRHandTracker.mb_set_hand_joint_linear_velocity == null) gdext.classes.XRHandTracker.mb_set_hand_joint_linear_velocity = MethodBind.get("XRHandTracker", "set_hand_joint_linear_velocity", 1978646737L)
    Ptrcall.callVoid2(gdext.classes.XRHandTracker.mb_set_hand_joint_linear_velocity, livePtr, joint, linearVelocity)
  }

  /** XRHandTracker.get_hand_joint_linear_velocity */
  final def getHandJointLinearVelocity(joint: gdext.classes.XRHandTracker.HandJoint): gdext.builtin.Vector3 = {
    if (gdext.classes.XRHandTracker.mb_get_hand_joint_linear_velocity == null) gdext.classes.XRHandTracker.mb_get_hand_joint_linear_velocity = MethodBind.get("XRHandTracker", "get_hand_joint_linear_velocity", 547240792L)
    Ptrcall.call1[Long, gdext.builtin.Vector3](gdext.classes.XRHandTracker.mb_get_hand_joint_linear_velocity, livePtr, joint)
  }

  /** XRHandTracker.set_hand_joint_angular_velocity */
  final def setHandJointAngularVelocity(joint: gdext.classes.XRHandTracker.HandJoint, angularVelocity: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.XRHandTracker.mb_set_hand_joint_angular_velocity == null) gdext.classes.XRHandTracker.mb_set_hand_joint_angular_velocity = MethodBind.get("XRHandTracker", "set_hand_joint_angular_velocity", 1978646737L)
    Ptrcall.callVoid2(gdext.classes.XRHandTracker.mb_set_hand_joint_angular_velocity, livePtr, joint, angularVelocity)
  }

  /** XRHandTracker.get_hand_joint_angular_velocity */
  final def getHandJointAngularVelocity(joint: gdext.classes.XRHandTracker.HandJoint): gdext.builtin.Vector3 = {
    if (gdext.classes.XRHandTracker.mb_get_hand_joint_angular_velocity == null) gdext.classes.XRHandTracker.mb_get_hand_joint_angular_velocity = MethodBind.get("XRHandTracker", "get_hand_joint_angular_velocity", 547240792L)
    Ptrcall.call1[Long, gdext.builtin.Vector3](gdext.classes.XRHandTracker.mb_get_hand_joint_angular_velocity, livePtr, joint)
  }

}

object XRHandTracker {
  private[classes] var mb_set_has_tracking_data: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_has_tracking_data: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_hand_tracking_source: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_hand_tracking_source: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_hand_joint_flags: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_hand_joint_flags: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_hand_joint_transform: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_hand_joint_transform: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_hand_joint_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_hand_joint_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_hand_joint_linear_velocity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_hand_joint_linear_velocity: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_hand_joint_angular_velocity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_hand_joint_angular_velocity: GDExtensionMethodBindPtr = null

  /** Godot enum `XRHandTracker.HandTrackingSource`. */
  opaque type HandTrackingSource <: Long = Long

  object HandTrackingSource {
    final val Unknown: HandTrackingSource = 0L.asInstanceOf[HandTrackingSource]
    final val Unobstructed: HandTrackingSource = 1L.asInstanceOf[HandTrackingSource]
    final val Controller: HandTrackingSource = 2L.asInstanceOf[HandTrackingSource]
    final val NotTracked: HandTrackingSource = 3L.asInstanceOf[HandTrackingSource]
    final val Max: HandTrackingSource = 4L.asInstanceOf[HandTrackingSource]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): HandTrackingSource = value.asInstanceOf[HandTrackingSource]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[HandTrackingSource] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L).asInstanceOf[scala.IArray[HandTrackingSource]]

    extension (self: HandTrackingSource)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Unknown"
        case 1L => "Unobstructed"
        case 2L => "Controller"
        case 3L => "NotTracked"
        case 4L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `XRHandTracker.HandJoint`. */
  opaque type HandJoint <: Long = Long

  object HandJoint {
    final val Palm: HandJoint = 0L.asInstanceOf[HandJoint]
    final val Wrist: HandJoint = 1L.asInstanceOf[HandJoint]
    final val ThumbMetacarpal: HandJoint = 2L.asInstanceOf[HandJoint]
    final val ThumbPhalanxProximal: HandJoint = 3L.asInstanceOf[HandJoint]
    final val ThumbPhalanxDistal: HandJoint = 4L.asInstanceOf[HandJoint]
    final val ThumbTip: HandJoint = 5L.asInstanceOf[HandJoint]
    final val IndexFingerMetacarpal: HandJoint = 6L.asInstanceOf[HandJoint]
    final val IndexFingerPhalanxProximal: HandJoint = 7L.asInstanceOf[HandJoint]
    final val IndexFingerPhalanxIntermediate: HandJoint = 8L.asInstanceOf[HandJoint]
    final val IndexFingerPhalanxDistal: HandJoint = 9L.asInstanceOf[HandJoint]
    final val IndexFingerTip: HandJoint = 10L.asInstanceOf[HandJoint]
    final val MiddleFingerMetacarpal: HandJoint = 11L.asInstanceOf[HandJoint]
    final val MiddleFingerPhalanxProximal: HandJoint = 12L.asInstanceOf[HandJoint]
    final val MiddleFingerPhalanxIntermediate: HandJoint = 13L.asInstanceOf[HandJoint]
    final val MiddleFingerPhalanxDistal: HandJoint = 14L.asInstanceOf[HandJoint]
    final val MiddleFingerTip: HandJoint = 15L.asInstanceOf[HandJoint]
    final val RingFingerMetacarpal: HandJoint = 16L.asInstanceOf[HandJoint]
    final val RingFingerPhalanxProximal: HandJoint = 17L.asInstanceOf[HandJoint]
    final val RingFingerPhalanxIntermediate: HandJoint = 18L.asInstanceOf[HandJoint]
    final val RingFingerPhalanxDistal: HandJoint = 19L.asInstanceOf[HandJoint]
    final val RingFingerTip: HandJoint = 20L.asInstanceOf[HandJoint]
    final val PinkyFingerMetacarpal: HandJoint = 21L.asInstanceOf[HandJoint]
    final val PinkyFingerPhalanxProximal: HandJoint = 22L.asInstanceOf[HandJoint]
    final val PinkyFingerPhalanxIntermediate: HandJoint = 23L.asInstanceOf[HandJoint]
    final val PinkyFingerPhalanxDistal: HandJoint = 24L.asInstanceOf[HandJoint]
    final val PinkyFingerTip: HandJoint = 25L.asInstanceOf[HandJoint]
    final val Max: HandJoint = 26L.asInstanceOf[HandJoint]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): HandJoint = value.asInstanceOf[HandJoint]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[HandJoint] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 11L, 12L, 13L, 14L, 15L, 16L, 17L, 18L, 19L, 20L, 21L, 22L, 23L, 24L, 25L, 26L).asInstanceOf[scala.IArray[HandJoint]]

    extension (self: HandJoint)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Palm"
        case 1L => "Wrist"
        case 2L => "ThumbMetacarpal"
        case 3L => "ThumbPhalanxProximal"
        case 4L => "ThumbPhalanxDistal"
        case 5L => "ThumbTip"
        case 6L => "IndexFingerMetacarpal"
        case 7L => "IndexFingerPhalanxProximal"
        case 8L => "IndexFingerPhalanxIntermediate"
        case 9L => "IndexFingerPhalanxDistal"
        case 10L => "IndexFingerTip"
        case 11L => "MiddleFingerMetacarpal"
        case 12L => "MiddleFingerPhalanxProximal"
        case 13L => "MiddleFingerPhalanxIntermediate"
        case 14L => "MiddleFingerPhalanxDistal"
        case 15L => "MiddleFingerTip"
        case 16L => "RingFingerMetacarpal"
        case 17L => "RingFingerPhalanxProximal"
        case 18L => "RingFingerPhalanxIntermediate"
        case 19L => "RingFingerPhalanxDistal"
        case 20L => "RingFingerTip"
        case 21L => "PinkyFingerMetacarpal"
        case 22L => "PinkyFingerPhalanxProximal"
        case 23L => "PinkyFingerPhalanxIntermediate"
        case 24L => "PinkyFingerPhalanxDistal"
        case 25L => "PinkyFingerTip"
        case 26L => "Max"
        case other => other.toString
      }
  }

  /** Godot bitfield `XRHandTracker.HandJointFlags`. */
  opaque type HandJointFlags = Long

  object HandJointFlags {
    final val OrientationValid: HandJointFlags = 1L.asInstanceOf[HandJointFlags]
    final val OrientationTracked: HandJointFlags = 2L.asInstanceOf[HandJointFlags]
    final val PositionValid: HandJointFlags = 4L.asInstanceOf[HandJointFlags]
    final val PositionTracked: HandJointFlags = 8L.asInstanceOf[HandJointFlags]
    final val LinearVelocityValid: HandJointFlags = 16L.asInstanceOf[HandJointFlags]
    final val AngularVelocityValid: HandJointFlags = 32L.asInstanceOf[HandJointFlags]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): HandJointFlags = value.asInstanceOf[HandJointFlags]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[HandJointFlags] = scala.IArray[Long](1L, 2L, 4L, 8L, 16L, 32L).asInstanceOf[scala.IArray[HandJointFlags]]

    extension (self: HandJointFlags)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 1L => "OrientationValid"
        case 2L => "OrientationTracked"
        case 4L => "PositionValid"
        case 8L => "PositionTracked"
        case 16L => "LinearVelocityValid"
        case 32L => "AngularVelocityValid"
        case other => other.toString
      }
    extension (self: HandJointFlags) {
      inline def value: Long = self.asInstanceOf[Long]
      inline def |(other: HandJointFlags): HandJointFlags = (self.value | other.value).asInstanceOf[HandJointFlags]
      inline def &(other: HandJointFlags): HandJointFlags = (self.value & other.value).asInstanceOf[HandJointFlags]
      /** Every bit of `flag` is set. */
      inline def has(flag: HandJointFlags): Boolean = (self.value & flag.value) == flag.value
    }
  }
}
