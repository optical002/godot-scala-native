package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OpenXRInterface`, extends `XRInterface`. */
abstract class OpenXRInterface extends XRInterface {
  override def godotClassName: String = "OpenXRInterface"

  /** OpenXRInterface.get_session_state */
  final def getSessionState(): Long = {
    if (gdext.classes.OpenXRInterface.mb_get_session_state == null) gdext.classes.OpenXRInterface.mb_get_session_state = MethodBind.get("OpenXRInterface", "get_session_state", 896364779L)
    Ptrcall.call0[Long](gdext.classes.OpenXRInterface.mb_get_session_state, livePtr)
  }

  /** OpenXRInterface.get_display_refresh_rate */
  final def getDisplayRefreshRate(): Double = {
    if (gdext.classes.OpenXRInterface.mb_get_display_refresh_rate == null) gdext.classes.OpenXRInterface.mb_get_display_refresh_rate = MethodBind.get("OpenXRInterface", "get_display_refresh_rate", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.OpenXRInterface.mb_get_display_refresh_rate, livePtr)
  }

  /** OpenXRInterface.set_display_refresh_rate */
  final def setDisplayRefreshRate(refresh_rate: Double): Unit = {
    if (gdext.classes.OpenXRInterface.mb_set_display_refresh_rate == null) gdext.classes.OpenXRInterface.mb_set_display_refresh_rate = MethodBind.get("OpenXRInterface", "set_display_refresh_rate", 373806689L)
    Ptrcall.callVoid1(gdext.classes.OpenXRInterface.mb_set_display_refresh_rate, livePtr, refresh_rate)
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
  final def setFoveationLevel(foveation_level: Long): Unit = {
    if (gdext.classes.OpenXRInterface.mb_set_foveation_level == null) gdext.classes.OpenXRInterface.mb_set_foveation_level = MethodBind.get("OpenXRInterface", "set_foveation_level", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.OpenXRInterface.mb_set_foveation_level, livePtr, foveation_level)
  }

  /** OpenXRInterface.get_foveation_dynamic */
  final def getFoveationDynamic(): Boolean = {
    if (gdext.classes.OpenXRInterface.mb_get_foveation_dynamic == null) gdext.classes.OpenXRInterface.mb_get_foveation_dynamic = MethodBind.get("OpenXRInterface", "get_foveation_dynamic", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.OpenXRInterface.mb_get_foveation_dynamic, livePtr)
  }

  /** OpenXRInterface.set_foveation_dynamic */
  final def setFoveationDynamic(foveation_dynamic: Boolean): Unit = {
    if (gdext.classes.OpenXRInterface.mb_set_foveation_dynamic == null) gdext.classes.OpenXRInterface.mb_set_foveation_dynamic = MethodBind.get("OpenXRInterface", "set_foveation_dynamic", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.OpenXRInterface.mb_set_foveation_dynamic, livePtr, foveation_dynamic)
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
  final def setMotionRange(hand: Long, motion_range: Long): Unit = {
    if (gdext.classes.OpenXRInterface.mb_set_motion_range == null) gdext.classes.OpenXRInterface.mb_set_motion_range = MethodBind.get("OpenXRInterface", "set_motion_range", 855158159L)
    Ptrcall.callVoid2(gdext.classes.OpenXRInterface.mb_set_motion_range, livePtr, hand, motion_range)
  }

  /** OpenXRInterface.get_motion_range */
  final def getMotionRange(hand: Long): Long = {
    if (gdext.classes.OpenXRInterface.mb_get_motion_range == null) gdext.classes.OpenXRInterface.mb_get_motion_range = MethodBind.get("OpenXRInterface", "get_motion_range", 3955838114L)
    Ptrcall.call1[Long, Long](gdext.classes.OpenXRInterface.mb_get_motion_range, livePtr, hand)
  }

  /** OpenXRInterface.get_hand_tracking_source */
  final def getHandTrackingSource(hand: Long): Long = {
    if (gdext.classes.OpenXRInterface.mb_get_hand_tracking_source == null) gdext.classes.OpenXRInterface.mb_get_hand_tracking_source = MethodBind.get("OpenXRInterface", "get_hand_tracking_source", 4092421202L)
    Ptrcall.call1[Long, Long](gdext.classes.OpenXRInterface.mb_get_hand_tracking_source, livePtr, hand)
  }

  /** OpenXRInterface.get_hand_joint_flags */
  final def getHandJointFlags(hand: Long, joint: Long): Long = {
    if (gdext.classes.OpenXRInterface.mb_get_hand_joint_flags == null) gdext.classes.OpenXRInterface.mb_get_hand_joint_flags = MethodBind.get("OpenXRInterface", "get_hand_joint_flags", 720567706L)
    Ptrcall.call2[Long, Long, Long](gdext.classes.OpenXRInterface.mb_get_hand_joint_flags, livePtr, hand, joint)
  }

  /** OpenXRInterface.get_hand_joint_rotation */
  final def getHandJointRotation(hand: Long, joint: Long): gdext.builtin.Quaternion = {
    if (gdext.classes.OpenXRInterface.mb_get_hand_joint_rotation == null) gdext.classes.OpenXRInterface.mb_get_hand_joint_rotation = MethodBind.get("OpenXRInterface", "get_hand_joint_rotation", 1974618321L)
    Ptrcall.call2[Long, Long, gdext.builtin.Quaternion](gdext.classes.OpenXRInterface.mb_get_hand_joint_rotation, livePtr, hand, joint)
  }

  /** OpenXRInterface.get_hand_joint_position */
  final def getHandJointPosition(hand: Long, joint: Long): gdext.builtin.Vector3 = {
    if (gdext.classes.OpenXRInterface.mb_get_hand_joint_position == null) gdext.classes.OpenXRInterface.mb_get_hand_joint_position = MethodBind.get("OpenXRInterface", "get_hand_joint_position", 3529194242L)
    Ptrcall.call2[Long, Long, gdext.builtin.Vector3](gdext.classes.OpenXRInterface.mb_get_hand_joint_position, livePtr, hand, joint)
  }

  /** OpenXRInterface.get_hand_joint_radius */
  final def getHandJointRadius(hand: Long, joint: Long): Double = {
    if (gdext.classes.OpenXRInterface.mb_get_hand_joint_radius == null) gdext.classes.OpenXRInterface.mb_get_hand_joint_radius = MethodBind.get("OpenXRInterface", "get_hand_joint_radius", 901522724L)
    Ptrcall.call2[Long, Long, Double](gdext.classes.OpenXRInterface.mb_get_hand_joint_radius, livePtr, hand, joint)
  }

  /** OpenXRInterface.get_hand_joint_linear_velocity */
  final def getHandJointLinearVelocity(hand: Long, joint: Long): gdext.builtin.Vector3 = {
    if (gdext.classes.OpenXRInterface.mb_get_hand_joint_linear_velocity == null) gdext.classes.OpenXRInterface.mb_get_hand_joint_linear_velocity = MethodBind.get("OpenXRInterface", "get_hand_joint_linear_velocity", 3529194242L)
    Ptrcall.call2[Long, Long, gdext.builtin.Vector3](gdext.classes.OpenXRInterface.mb_get_hand_joint_linear_velocity, livePtr, hand, joint)
  }

  /** OpenXRInterface.get_hand_joint_angular_velocity */
  final def getHandJointAngularVelocity(hand: Long, joint: Long): gdext.builtin.Vector3 = {
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
  final def setCpuLevel(level: Long): Unit = {
    if (gdext.classes.OpenXRInterface.mb_set_cpu_level == null) gdext.classes.OpenXRInterface.mb_set_cpu_level = MethodBind.get("OpenXRInterface", "set_cpu_level", 2940842095L)
    Ptrcall.callVoid1(gdext.classes.OpenXRInterface.mb_set_cpu_level, livePtr, level)
  }

  /** OpenXRInterface.set_gpu_level */
  final def setGpuLevel(level: Long): Unit = {
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
}
