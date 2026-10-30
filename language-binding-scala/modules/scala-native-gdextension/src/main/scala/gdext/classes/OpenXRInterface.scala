package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OpenXRInterface`, extends `XRInterface`. */
abstract class OpenXRInterface extends XRInterface {
  override def godotClassName: String = "OpenXRInterface"

  /** OpenXRInterface.get_session_state */
  final def getSessionState(): gdext.classes.OpenXRInterface.SessionState = {
    if (gdext.classes.OpenXRInterface.mb_get_session_state == null) gdext.classes.OpenXRInterface.mb_get_session_state = MethodBind.get("OpenXRInterface", "get_session_state", 896364779L)
    gdext.classes.OpenXRInterface.SessionState(Ptrcall.call0[Long](gdext.classes.OpenXRInterface.mb_get_session_state, livePtr))
  }

  /** OpenXRInterface.get_display_refresh_rate */
  final def getDisplayRefreshRate(): Double = {
    if (gdext.classes.OpenXRInterface.mb_get_display_refresh_rate == null) gdext.classes.OpenXRInterface.mb_get_display_refresh_rate = MethodBind.get("OpenXRInterface", "get_display_refresh_rate", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.OpenXRInterface.mb_get_display_refresh_rate, livePtr)
  }

  /** OpenXRInterface.set_display_refresh_rate */
  final def setDisplayRefreshRate(refreshRate: Double): Unit = {
    if (gdext.classes.OpenXRInterface.mb_set_display_refresh_rate == null) gdext.classes.OpenXRInterface.mb_set_display_refresh_rate = MethodBind.get("OpenXRInterface", "set_display_refresh_rate", 373806689L)
    Ptrcall.callVoid1(gdext.classes.OpenXRInterface.mb_set_display_refresh_rate, livePtr, refreshRate)
  }

  /** OpenXRInterface.get_render_target_size_multiplier */
  final def getRenderTargetSizeMultiplier(): Double = {
    if (gdext.classes.OpenXRInterface.mb_get_render_target_size_multiplier == null) gdext.classes.OpenXRInterface.mb_get_render_target_size_multiplier = MethodBind.get("OpenXRInterface", "get_render_target_size_multiplier", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.OpenXRInterface.mb_get_render_target_size_multiplier, livePtr)
  }

  /** OpenXRInterface.set_render_target_size_multiplier */
  final def setRenderTargetSizeMultiplier(multiplier: Double): Unit = {
    if (gdext.classes.OpenXRInterface.mb_set_render_target_size_multiplier == null) gdext.classes.OpenXRInterface.mb_set_render_target_size_multiplier = MethodBind.get("OpenXRInterface", "set_render_target_size_multiplier", 373806689L)
    Ptrcall.callVoid1(gdext.classes.OpenXRInterface.mb_set_render_target_size_multiplier, livePtr, multiplier)
  }

  /** OpenXRInterface.is_foveation_supported */
  final def isFoveationSupported(): Boolean = {
    if (gdext.classes.OpenXRInterface.mb_is_foveation_supported == null) gdext.classes.OpenXRInterface.mb_is_foveation_supported = MethodBind.get("OpenXRInterface", "is_foveation_supported", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.OpenXRInterface.mb_is_foveation_supported, livePtr)
  }

  /** OpenXRInterface.get_foveation_level */
  final def getFoveationLevel(): Long = {
    if (gdext.classes.OpenXRInterface.mb_get_foveation_level == null) gdext.classes.OpenXRInterface.mb_get_foveation_level = MethodBind.get("OpenXRInterface", "get_foveation_level", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.OpenXRInterface.mb_get_foveation_level, livePtr)
  }

  /** OpenXRInterface.set_foveation_level */
  final def setFoveationLevel(foveationLevel: Long): Unit = {
    if (gdext.classes.OpenXRInterface.mb_set_foveation_level == null) gdext.classes.OpenXRInterface.mb_set_foveation_level = MethodBind.get("OpenXRInterface", "set_foveation_level", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.OpenXRInterface.mb_set_foveation_level, livePtr, foveationLevel)
  }

  /** OpenXRInterface.get_foveation_dynamic */
  final def getFoveationDynamic(): Boolean = {
    if (gdext.classes.OpenXRInterface.mb_get_foveation_dynamic == null) gdext.classes.OpenXRInterface.mb_get_foveation_dynamic = MethodBind.get("OpenXRInterface", "get_foveation_dynamic", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.OpenXRInterface.mb_get_foveation_dynamic, livePtr)
  }

  /** OpenXRInterface.set_foveation_dynamic */
  final def setFoveationDynamic(foveationDynamic: Boolean): Unit = {
    if (gdext.classes.OpenXRInterface.mb_set_foveation_dynamic == null) gdext.classes.OpenXRInterface.mb_set_foveation_dynamic = MethodBind.get("OpenXRInterface", "set_foveation_dynamic", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.OpenXRInterface.mb_set_foveation_dynamic, livePtr, foveationDynamic)
  }

  /** OpenXRInterface.is_action_set_active */
  final def isActionSetActive(name: String): Boolean = {
    if (gdext.classes.OpenXRInterface.mb_is_action_set_active == null) gdext.classes.OpenXRInterface.mb_is_action_set_active = MethodBind.get("OpenXRInterface", "is_action_set_active", 3927539163L)
    Ptrcall.call1[String, Boolean](gdext.classes.OpenXRInterface.mb_is_action_set_active, livePtr, name)
  }

  /** OpenXRInterface.set_action_set_active */
  final def setActionSetActive(name: String, active: Boolean): Unit = {
    if (gdext.classes.OpenXRInterface.mb_set_action_set_active == null) gdext.classes.OpenXRInterface.mb_set_action_set_active = MethodBind.get("OpenXRInterface", "set_action_set_active", 2678287736L)
    Ptrcall.callVoid2(gdext.classes.OpenXRInterface.mb_set_action_set_active, livePtr, name, active)
  }

  /** OpenXRInterface.set_motion_range */
  final def setMotionRange(hand: gdext.classes.OpenXRInterface.Hand, motionRange: gdext.classes.OpenXRInterface.HandMotionRange): Unit = {
    if (gdext.classes.OpenXRInterface.mb_set_motion_range == null) gdext.classes.OpenXRInterface.mb_set_motion_range = MethodBind.get("OpenXRInterface", "set_motion_range", 855158159L)
    Ptrcall.callVoid2(gdext.classes.OpenXRInterface.mb_set_motion_range, livePtr, hand, motionRange)
  }

  /** OpenXRInterface.get_motion_range */
  final def getMotionRange(hand: gdext.classes.OpenXRInterface.Hand): gdext.classes.OpenXRInterface.HandMotionRange = {
    if (gdext.classes.OpenXRInterface.mb_get_motion_range == null) gdext.classes.OpenXRInterface.mb_get_motion_range = MethodBind.get("OpenXRInterface", "get_motion_range", 3955838114L)
    gdext.classes.OpenXRInterface.HandMotionRange(Ptrcall.call1[Long, Long](gdext.classes.OpenXRInterface.mb_get_motion_range, livePtr, hand))
  }

  /** OpenXRInterface.get_hand_tracking_source */
  final def getHandTrackingSource(hand: gdext.classes.OpenXRInterface.Hand): gdext.classes.OpenXRInterface.HandTrackedSource = {
    if (gdext.classes.OpenXRInterface.mb_get_hand_tracking_source == null) gdext.classes.OpenXRInterface.mb_get_hand_tracking_source = MethodBind.get("OpenXRInterface", "get_hand_tracking_source", 4092421202L)
    gdext.classes.OpenXRInterface.HandTrackedSource(Ptrcall.call1[Long, Long](gdext.classes.OpenXRInterface.mb_get_hand_tracking_source, livePtr, hand))
  }

  /** OpenXRInterface.get_hand_joint_flags */
  final def getHandJointFlags(hand: gdext.classes.OpenXRInterface.Hand, joint: gdext.classes.OpenXRInterface.HandJoints): gdext.classes.OpenXRInterface.HandJointFlags = {
    if (gdext.classes.OpenXRInterface.mb_get_hand_joint_flags == null) gdext.classes.OpenXRInterface.mb_get_hand_joint_flags = MethodBind.get("OpenXRInterface", "get_hand_joint_flags", 720567706L)
    gdext.classes.OpenXRInterface.HandJointFlags(Ptrcall.call2[Long, Long, Long](gdext.classes.OpenXRInterface.mb_get_hand_joint_flags, livePtr, hand, joint))
  }

  /** OpenXRInterface.get_hand_joint_rotation */
  final def getHandJointRotation(hand: gdext.classes.OpenXRInterface.Hand, joint: gdext.classes.OpenXRInterface.HandJoints): gdext.builtin.Quaternion = {
    if (gdext.classes.OpenXRInterface.mb_get_hand_joint_rotation == null) gdext.classes.OpenXRInterface.mb_get_hand_joint_rotation = MethodBind.get("OpenXRInterface", "get_hand_joint_rotation", 1974618321L)
    Ptrcall.call2[Long, Long, gdext.builtin.Quaternion](gdext.classes.OpenXRInterface.mb_get_hand_joint_rotation, livePtr, hand, joint)
  }

  /** OpenXRInterface.get_hand_joint_position */
  final def getHandJointPosition(hand: gdext.classes.OpenXRInterface.Hand, joint: gdext.classes.OpenXRInterface.HandJoints): gdext.builtin.Vector3 = {
    if (gdext.classes.OpenXRInterface.mb_get_hand_joint_position == null) gdext.classes.OpenXRInterface.mb_get_hand_joint_position = MethodBind.get("OpenXRInterface", "get_hand_joint_position", 3529194242L)
    Ptrcall.call2[Long, Long, gdext.builtin.Vector3](gdext.classes.OpenXRInterface.mb_get_hand_joint_position, livePtr, hand, joint)
  }

  /** OpenXRInterface.get_hand_joint_radius */
  final def getHandJointRadius(hand: gdext.classes.OpenXRInterface.Hand, joint: gdext.classes.OpenXRInterface.HandJoints): Double = {
    if (gdext.classes.OpenXRInterface.mb_get_hand_joint_radius == null) gdext.classes.OpenXRInterface.mb_get_hand_joint_radius = MethodBind.get("OpenXRInterface", "get_hand_joint_radius", 901522724L)
    Ptrcall.call2[Long, Long, Double](gdext.classes.OpenXRInterface.mb_get_hand_joint_radius, livePtr, hand, joint)
  }

  /** OpenXRInterface.get_hand_joint_linear_velocity */
  final def getHandJointLinearVelocity(hand: gdext.classes.OpenXRInterface.Hand, joint: gdext.classes.OpenXRInterface.HandJoints): gdext.builtin.Vector3 = {
    if (gdext.classes.OpenXRInterface.mb_get_hand_joint_linear_velocity == null) gdext.classes.OpenXRInterface.mb_get_hand_joint_linear_velocity = MethodBind.get("OpenXRInterface", "get_hand_joint_linear_velocity", 3529194242L)
    Ptrcall.call2[Long, Long, gdext.builtin.Vector3](gdext.classes.OpenXRInterface.mb_get_hand_joint_linear_velocity, livePtr, hand, joint)
  }

  /** OpenXRInterface.get_hand_joint_angular_velocity */
  final def getHandJointAngularVelocity(hand: gdext.classes.OpenXRInterface.Hand, joint: gdext.classes.OpenXRInterface.HandJoints): gdext.builtin.Vector3 = {
    if (gdext.classes.OpenXRInterface.mb_get_hand_joint_angular_velocity == null) gdext.classes.OpenXRInterface.mb_get_hand_joint_angular_velocity = MethodBind.get("OpenXRInterface", "get_hand_joint_angular_velocity", 3529194242L)
    Ptrcall.call2[Long, Long, gdext.builtin.Vector3](gdext.classes.OpenXRInterface.mb_get_hand_joint_angular_velocity, livePtr, hand, joint)
  }

  /** OpenXRInterface.is_hand_tracking_supported */
  final def isHandTrackingSupported(): Boolean = {
    if (gdext.classes.OpenXRInterface.mb_is_hand_tracking_supported == null) gdext.classes.OpenXRInterface.mb_is_hand_tracking_supported = MethodBind.get("OpenXRInterface", "is_hand_tracking_supported", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.OpenXRInterface.mb_is_hand_tracking_supported, livePtr)
  }

  /** OpenXRInterface.is_hand_interaction_supported */
  final def isHandInteractionSupported(): Boolean = {
    if (gdext.classes.OpenXRInterface.mb_is_hand_interaction_supported == null) gdext.classes.OpenXRInterface.mb_is_hand_interaction_supported = MethodBind.get("OpenXRInterface", "is_hand_interaction_supported", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.OpenXRInterface.mb_is_hand_interaction_supported, livePtr)
  }

  /** OpenXRInterface.is_eye_gaze_interaction_supported */
  final def isEyeGazeInteractionSupported(): Boolean = {
    if (gdext.classes.OpenXRInterface.mb_is_eye_gaze_interaction_supported == null) gdext.classes.OpenXRInterface.mb_is_eye_gaze_interaction_supported = MethodBind.get("OpenXRInterface", "is_eye_gaze_interaction_supported", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.OpenXRInterface.mb_is_eye_gaze_interaction_supported, livePtr)
  }

  /** OpenXRInterface.get_vrs_min_radius */
  final def getVrsMinRadius(): Double = {
    if (gdext.classes.OpenXRInterface.mb_get_vrs_min_radius == null) gdext.classes.OpenXRInterface.mb_get_vrs_min_radius = MethodBind.get("OpenXRInterface", "get_vrs_min_radius", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.OpenXRInterface.mb_get_vrs_min_radius, livePtr)
  }

  /** OpenXRInterface.set_vrs_min_radius */
  final def setVrsMinRadius(radius: Double): Unit = {
    if (gdext.classes.OpenXRInterface.mb_set_vrs_min_radius == null) gdext.classes.OpenXRInterface.mb_set_vrs_min_radius = MethodBind.get("OpenXRInterface", "set_vrs_min_radius", 373806689L)
    Ptrcall.callVoid1(gdext.classes.OpenXRInterface.mb_set_vrs_min_radius, livePtr, radius)
  }

  /** OpenXRInterface.get_vrs_strength */
  final def getVrsStrength(): Double = {
    if (gdext.classes.OpenXRInterface.mb_get_vrs_strength == null) gdext.classes.OpenXRInterface.mb_get_vrs_strength = MethodBind.get("OpenXRInterface", "get_vrs_strength", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.OpenXRInterface.mb_get_vrs_strength, livePtr)
  }

  /** OpenXRInterface.set_vrs_strength */
  final def setVrsStrength(strength: Double): Unit = {
    if (gdext.classes.OpenXRInterface.mb_set_vrs_strength == null) gdext.classes.OpenXRInterface.mb_set_vrs_strength = MethodBind.get("OpenXRInterface", "set_vrs_strength", 373806689L)
    Ptrcall.callVoid1(gdext.classes.OpenXRInterface.mb_set_vrs_strength, livePtr, strength)
  }

  /** OpenXRInterface.set_cpu_level */
  final def setCpuLevel(level: gdext.classes.OpenXRInterface.PerfSettingsLevel): Unit = {
    if (gdext.classes.OpenXRInterface.mb_set_cpu_level == null) gdext.classes.OpenXRInterface.mb_set_cpu_level = MethodBind.get("OpenXRInterface", "set_cpu_level", 2940842095L)
    Ptrcall.callVoid1(gdext.classes.OpenXRInterface.mb_set_cpu_level, livePtr, level)
  }

  /** OpenXRInterface.set_gpu_level */
  final def setGpuLevel(level: gdext.classes.OpenXRInterface.PerfSettingsLevel): Unit = {
    if (gdext.classes.OpenXRInterface.mb_set_gpu_level == null) gdext.classes.OpenXRInterface.mb_set_gpu_level = MethodBind.get("OpenXRInterface", "set_gpu_level", 2940842095L)
    Ptrcall.callVoid1(gdext.classes.OpenXRInterface.mb_set_gpu_level, livePtr, level)
  }

}

object OpenXRInterface {
  private[classes] var mb_get_session_state: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_display_refresh_rate: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_display_refresh_rate: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_render_target_size_multiplier: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_render_target_size_multiplier: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_foveation_supported: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_foveation_level: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_foveation_level: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_foveation_dynamic: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_foveation_dynamic: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_action_set_active: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_action_set_active: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_motion_range: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_motion_range: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_hand_tracking_source: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_hand_joint_flags: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_hand_joint_rotation: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_hand_joint_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_hand_joint_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_hand_joint_linear_velocity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_hand_joint_angular_velocity: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_hand_tracking_supported: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_hand_interaction_supported: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_eye_gaze_interaction_supported: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_vrs_min_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_vrs_min_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_vrs_strength: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_vrs_strength: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_cpu_level: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_gpu_level: GDExtensionMethodBindPtr = null

  /** Godot enum `OpenXRInterface.SessionState`. */
  opaque type SessionState <: Long = Long

  object SessionState {
    final val Unknown: SessionState = 0L.asInstanceOf[SessionState]
    final val Idle: SessionState = 1L.asInstanceOf[SessionState]
    final val Ready: SessionState = 2L.asInstanceOf[SessionState]
    final val Synchronized: SessionState = 3L.asInstanceOf[SessionState]
    final val Visible: SessionState = 4L.asInstanceOf[SessionState]
    final val Focused: SessionState = 5L.asInstanceOf[SessionState]
    final val Stopping: SessionState = 6L.asInstanceOf[SessionState]
    final val LossPending: SessionState = 7L.asInstanceOf[SessionState]
    final val Exiting: SessionState = 8L.asInstanceOf[SessionState]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): SessionState = value.asInstanceOf[SessionState]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[SessionState] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L).asInstanceOf[scala.IArray[SessionState]]

    extension (self: SessionState)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Unknown"
        case 1L => "Idle"
        case 2L => "Ready"
        case 3L => "Synchronized"
        case 4L => "Visible"
        case 5L => "Focused"
        case 6L => "Stopping"
        case 7L => "LossPending"
        case 8L => "Exiting"
        case other => other.toString
      }
  }

  /** Godot enum `OpenXRInterface.Hand`. */
  opaque type Hand <: Long = Long

  object Hand {
    final val Left: Hand = 0L.asInstanceOf[Hand]
    final val Right: Hand = 1L.asInstanceOf[Hand]
    final val Max: Hand = 2L.asInstanceOf[Hand]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Hand = value.asInstanceOf[Hand]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Hand] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[Hand]]

    extension (self: Hand)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Left"
        case 1L => "Right"
        case 2L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `OpenXRInterface.HandMotionRange`. */
  opaque type HandMotionRange <: Long = Long

  object HandMotionRange {
    final val Unobstructed: HandMotionRange = 0L.asInstanceOf[HandMotionRange]
    final val ConformToController: HandMotionRange = 1L.asInstanceOf[HandMotionRange]
    final val Max: HandMotionRange = 2L.asInstanceOf[HandMotionRange]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): HandMotionRange = value.asInstanceOf[HandMotionRange]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[HandMotionRange] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[HandMotionRange]]

    extension (self: HandMotionRange)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Unobstructed"
        case 1L => "ConformToController"
        case 2L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `OpenXRInterface.HandTrackedSource`. */
  opaque type HandTrackedSource <: Long = Long

  object HandTrackedSource {
    final val Unknown: HandTrackedSource = 0L.asInstanceOf[HandTrackedSource]
    final val Unobstructed: HandTrackedSource = 1L.asInstanceOf[HandTrackedSource]
    final val Controller: HandTrackedSource = 2L.asInstanceOf[HandTrackedSource]
    final val Max: HandTrackedSource = 3L.asInstanceOf[HandTrackedSource]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): HandTrackedSource = value.asInstanceOf[HandTrackedSource]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[HandTrackedSource] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[HandTrackedSource]]

    extension (self: HandTrackedSource)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Unknown"
        case 1L => "Unobstructed"
        case 2L => "Controller"
        case 3L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `OpenXRInterface.HandJoints`. */
  opaque type HandJoints <: Long = Long

  object HandJoints {
    final val Palm: HandJoints = 0L.asInstanceOf[HandJoints]
    final val Wrist: HandJoints = 1L.asInstanceOf[HandJoints]
    final val ThumbMetacarpal: HandJoints = 2L.asInstanceOf[HandJoints]
    final val ThumbProximal: HandJoints = 3L.asInstanceOf[HandJoints]
    final val ThumbDistal: HandJoints = 4L.asInstanceOf[HandJoints]
    final val ThumbTip: HandJoints = 5L.asInstanceOf[HandJoints]
    final val IndexMetacarpal: HandJoints = 6L.asInstanceOf[HandJoints]
    final val IndexProximal: HandJoints = 7L.asInstanceOf[HandJoints]
    final val IndexIntermediate: HandJoints = 8L.asInstanceOf[HandJoints]
    final val IndexDistal: HandJoints = 9L.asInstanceOf[HandJoints]
    final val IndexTip: HandJoints = 10L.asInstanceOf[HandJoints]
    final val MiddleMetacarpal: HandJoints = 11L.asInstanceOf[HandJoints]
    final val MiddleProximal: HandJoints = 12L.asInstanceOf[HandJoints]
    final val MiddleIntermediate: HandJoints = 13L.asInstanceOf[HandJoints]
    final val MiddleDistal: HandJoints = 14L.asInstanceOf[HandJoints]
    final val MiddleTip: HandJoints = 15L.asInstanceOf[HandJoints]
    final val RingMetacarpal: HandJoints = 16L.asInstanceOf[HandJoints]
    final val RingProximal: HandJoints = 17L.asInstanceOf[HandJoints]
    final val RingIntermediate: HandJoints = 18L.asInstanceOf[HandJoints]
    final val RingDistal: HandJoints = 19L.asInstanceOf[HandJoints]
    final val RingTip: HandJoints = 20L.asInstanceOf[HandJoints]
    final val LittleMetacarpal: HandJoints = 21L.asInstanceOf[HandJoints]
    final val LittleProximal: HandJoints = 22L.asInstanceOf[HandJoints]
    final val LittleIntermediate: HandJoints = 23L.asInstanceOf[HandJoints]
    final val LittleDistal: HandJoints = 24L.asInstanceOf[HandJoints]
    final val LittleTip: HandJoints = 25L.asInstanceOf[HandJoints]
    final val Max: HandJoints = 26L.asInstanceOf[HandJoints]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): HandJoints = value.asInstanceOf[HandJoints]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[HandJoints] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 11L, 12L, 13L, 14L, 15L, 16L, 17L, 18L, 19L, 20L, 21L, 22L, 23L, 24L, 25L, 26L).asInstanceOf[scala.IArray[HandJoints]]

    extension (self: HandJoints)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Palm"
        case 1L => "Wrist"
        case 2L => "ThumbMetacarpal"
        case 3L => "ThumbProximal"
        case 4L => "ThumbDistal"
        case 5L => "ThumbTip"
        case 6L => "IndexMetacarpal"
        case 7L => "IndexProximal"
        case 8L => "IndexIntermediate"
        case 9L => "IndexDistal"
        case 10L => "IndexTip"
        case 11L => "MiddleMetacarpal"
        case 12L => "MiddleProximal"
        case 13L => "MiddleIntermediate"
        case 14L => "MiddleDistal"
        case 15L => "MiddleTip"
        case 16L => "RingMetacarpal"
        case 17L => "RingProximal"
        case 18L => "RingIntermediate"
        case 19L => "RingDistal"
        case 20L => "RingTip"
        case 21L => "LittleMetacarpal"
        case 22L => "LittleProximal"
        case 23L => "LittleIntermediate"
        case 24L => "LittleDistal"
        case 25L => "LittleTip"
        case 26L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `OpenXRInterface.PerfSettingsLevel`. */
  opaque type PerfSettingsLevel <: Long = Long

  object PerfSettingsLevel {
    final val PowerSavings: PerfSettingsLevel = 0L.asInstanceOf[PerfSettingsLevel]
    final val SustainedLow: PerfSettingsLevel = 1L.asInstanceOf[PerfSettingsLevel]
    final val SustainedHigh: PerfSettingsLevel = 2L.asInstanceOf[PerfSettingsLevel]
    final val Boost: PerfSettingsLevel = 3L.asInstanceOf[PerfSettingsLevel]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): PerfSettingsLevel = value.asInstanceOf[PerfSettingsLevel]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[PerfSettingsLevel] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[PerfSettingsLevel]]

    extension (self: PerfSettingsLevel)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "PowerSavings"
        case 1L => "SustainedLow"
        case 2L => "SustainedHigh"
        case 3L => "Boost"
        case other => other.toString
      }
  }

  /** Godot enum `OpenXRInterface.PerfSettingsSubDomain`. */
  opaque type PerfSettingsSubDomain <: Long = Long

  object PerfSettingsSubDomain {
    final val Compositing: PerfSettingsSubDomain = 0L.asInstanceOf[PerfSettingsSubDomain]
    final val Rendering: PerfSettingsSubDomain = 1L.asInstanceOf[PerfSettingsSubDomain]
    final val Thermal: PerfSettingsSubDomain = 2L.asInstanceOf[PerfSettingsSubDomain]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): PerfSettingsSubDomain = value.asInstanceOf[PerfSettingsSubDomain]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[PerfSettingsSubDomain] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[PerfSettingsSubDomain]]

    extension (self: PerfSettingsSubDomain)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Compositing"
        case 1L => "Rendering"
        case 2L => "Thermal"
        case other => other.toString
      }
  }

  /** Godot enum `OpenXRInterface.PerfSettingsNotificationLevel`. */
  opaque type PerfSettingsNotificationLevel <: Long = Long

  object PerfSettingsNotificationLevel {
    final val Normal: PerfSettingsNotificationLevel = 0L.asInstanceOf[PerfSettingsNotificationLevel]
    final val Warning: PerfSettingsNotificationLevel = 1L.asInstanceOf[PerfSettingsNotificationLevel]
    final val Impaired: PerfSettingsNotificationLevel = 2L.asInstanceOf[PerfSettingsNotificationLevel]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): PerfSettingsNotificationLevel = value.asInstanceOf[PerfSettingsNotificationLevel]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[PerfSettingsNotificationLevel] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[PerfSettingsNotificationLevel]]

    extension (self: PerfSettingsNotificationLevel)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Normal"
        case 1L => "Warning"
        case 2L => "Impaired"
        case other => other.toString
      }
  }

  /** Godot bitfield `OpenXRInterface.HandJointFlags`. */
  opaque type HandJointFlags = Long

  object HandJointFlags {
    final val None: HandJointFlags = 0L.asInstanceOf[HandJointFlags]
    final val OrientationValid: HandJointFlags = 1L.asInstanceOf[HandJointFlags]
    final val OrientationTracked: HandJointFlags = 2L.asInstanceOf[HandJointFlags]
    final val PositionValid: HandJointFlags = 4L.asInstanceOf[HandJointFlags]
    final val PositionTracked: HandJointFlags = 8L.asInstanceOf[HandJointFlags]
    final val LinearVelocityValid: HandJointFlags = 16L.asInstanceOf[HandJointFlags]
    final val AngularVelocityValid: HandJointFlags = 32L.asInstanceOf[HandJointFlags]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): HandJointFlags = value.asInstanceOf[HandJointFlags]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[HandJointFlags] = scala.IArray[Long](0L, 1L, 2L, 4L, 8L, 16L, 32L).asInstanceOf[scala.IArray[HandJointFlags]]

    extension (self: HandJointFlags)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "None"
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
