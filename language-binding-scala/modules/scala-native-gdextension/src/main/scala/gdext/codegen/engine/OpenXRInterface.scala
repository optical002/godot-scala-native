package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRInterface`, extends `XRInterface`. */
abstract class OpenXRInterface extends XRInterface {

  /** OpenXRInterface.get_session_state */
  final def getSessionState(): Long =
    Ptrcall.call0[Long](MethodBind.get("OpenXRInterface", "get_session_state", 896364779L), hostObject.objectPtr)

  /** OpenXRInterface.get_display_refresh_rate */
  final def getDisplayRefreshRate(): Double =
    Ptrcall.call0[Double](MethodBind.get("OpenXRInterface", "get_display_refresh_rate", 1740695150L), hostObject.objectPtr)

  /** OpenXRInterface.set_display_refresh_rate */
  final def setDisplayRefreshRate(refresh_rate: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRInterface", "set_display_refresh_rate", 373806689L), hostObject.objectPtr, refresh_rate)

  /** OpenXRInterface.get_render_target_size_multiplier */
  final def getRenderTargetSizeMultiplier(): Double =
    Ptrcall.call0[Double](MethodBind.get("OpenXRInterface", "get_render_target_size_multiplier", 1740695150L), hostObject.objectPtr)

  /** OpenXRInterface.set_render_target_size_multiplier */
  final def setRenderTargetSizeMultiplier(multiplier: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRInterface", "set_render_target_size_multiplier", 373806689L), hostObject.objectPtr, multiplier)

  /** OpenXRInterface.is_foveation_supported */
  final def isFoveationSupported(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("OpenXRInterface", "is_foveation_supported", 36873697L), hostObject.objectPtr)

  /** OpenXRInterface.get_foveation_level */
  final def getFoveationLevel(): Long =
    Ptrcall.call0[Long](MethodBind.get("OpenXRInterface", "get_foveation_level", 3905245786L), hostObject.objectPtr)

  /** OpenXRInterface.set_foveation_level */
  final def setFoveationLevel(foveation_level: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRInterface", "set_foveation_level", 1286410249L), hostObject.objectPtr, foveation_level)

  /** OpenXRInterface.get_foveation_dynamic */
  final def getFoveationDynamic(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("OpenXRInterface", "get_foveation_dynamic", 36873697L), hostObject.objectPtr)

  /** OpenXRInterface.set_foveation_dynamic */
  final def setFoveationDynamic(foveation_dynamic: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRInterface", "set_foveation_dynamic", 2586408642L), hostObject.objectPtr, foveation_dynamic)

  /** OpenXRInterface.is_action_set_active */
  final def isActionSetActive(name: String): Boolean =
    Ptrcall.call1[String, Boolean](MethodBind.get("OpenXRInterface", "is_action_set_active", 3927539163L), hostObject.objectPtr, name)

  /** OpenXRInterface.set_action_set_active */
  final def setActionSetActive(name: String, active: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("OpenXRInterface", "set_action_set_active", 2678287736L), hostObject.objectPtr, name, active)

  /** OpenXRInterface.set_motion_range */
  final def setMotionRange(hand: Long, motion_range: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("OpenXRInterface", "set_motion_range", 855158159L), hostObject.objectPtr, hand, motion_range)

  /** OpenXRInterface.get_motion_range */
  final def getMotionRange(hand: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("OpenXRInterface", "get_motion_range", 3955838114L), hostObject.objectPtr, hand)

  /** OpenXRInterface.get_hand_tracking_source */
  final def getHandTrackingSource(hand: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("OpenXRInterface", "get_hand_tracking_source", 4092421202L), hostObject.objectPtr, hand)

  /** OpenXRInterface.get_hand_joint_flags */
  final def getHandJointFlags(hand: Long, joint: Long): Long =
    Ptrcall.call2[Long, Long, Long](MethodBind.get("OpenXRInterface", "get_hand_joint_flags", 720567706L), hostObject.objectPtr, hand, joint)

  /** OpenXRInterface.get_hand_joint_rotation */
  final def getHandJointRotation(hand: Long, joint: Long): gdext.builtin.Quaternion =
    Ptrcall.call2[Long, Long, gdext.builtin.Quaternion](MethodBind.get("OpenXRInterface", "get_hand_joint_rotation", 1974618321L), hostObject.objectPtr, hand, joint)

  /** OpenXRInterface.get_hand_joint_position */
  final def getHandJointPosition(hand: Long, joint: Long): gdext.builtin.Vector3 =
    Ptrcall.call2[Long, Long, gdext.builtin.Vector3](MethodBind.get("OpenXRInterface", "get_hand_joint_position", 3529194242L), hostObject.objectPtr, hand, joint)

  /** OpenXRInterface.get_hand_joint_radius */
  final def getHandJointRadius(hand: Long, joint: Long): Double =
    Ptrcall.call2[Long, Long, Double](MethodBind.get("OpenXRInterface", "get_hand_joint_radius", 901522724L), hostObject.objectPtr, hand, joint)

  /** OpenXRInterface.get_hand_joint_linear_velocity */
  final def getHandJointLinearVelocity(hand: Long, joint: Long): gdext.builtin.Vector3 =
    Ptrcall.call2[Long, Long, gdext.builtin.Vector3](MethodBind.get("OpenXRInterface", "get_hand_joint_linear_velocity", 3529194242L), hostObject.objectPtr, hand, joint)

  /** OpenXRInterface.get_hand_joint_angular_velocity */
  final def getHandJointAngularVelocity(hand: Long, joint: Long): gdext.builtin.Vector3 =
    Ptrcall.call2[Long, Long, gdext.builtin.Vector3](MethodBind.get("OpenXRInterface", "get_hand_joint_angular_velocity", 3529194242L), hostObject.objectPtr, hand, joint)

  /** OpenXRInterface.is_hand_tracking_supported */
  final def isHandTrackingSupported(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("OpenXRInterface", "is_hand_tracking_supported", 2240911060L), hostObject.objectPtr)

  /** OpenXRInterface.is_hand_interaction_supported */
  final def isHandInteractionSupported(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("OpenXRInterface", "is_hand_interaction_supported", 36873697L), hostObject.objectPtr)

  /** OpenXRInterface.is_eye_gaze_interaction_supported */
  final def isEyeGazeInteractionSupported(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("OpenXRInterface", "is_eye_gaze_interaction_supported", 2240911060L), hostObject.objectPtr)

  /** OpenXRInterface.get_vrs_min_radius */
  final def getVrsMinRadius(): Double =
    Ptrcall.call0[Double](MethodBind.get("OpenXRInterface", "get_vrs_min_radius", 1740695150L), hostObject.objectPtr)

  /** OpenXRInterface.set_vrs_min_radius */
  final def setVrsMinRadius(radius: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRInterface", "set_vrs_min_radius", 373806689L), hostObject.objectPtr, radius)

  /** OpenXRInterface.get_vrs_strength */
  final def getVrsStrength(): Double =
    Ptrcall.call0[Double](MethodBind.get("OpenXRInterface", "get_vrs_strength", 1740695150L), hostObject.objectPtr)

  /** OpenXRInterface.set_vrs_strength */
  final def setVrsStrength(strength: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRInterface", "set_vrs_strength", 373806689L), hostObject.objectPtr, strength)

  /** OpenXRInterface.set_cpu_level */
  final def setCpuLevel(level: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRInterface", "set_cpu_level", 2940842095L), hostObject.objectPtr, level)

  /** OpenXRInterface.set_gpu_level */
  final def setGpuLevel(level: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRInterface", "set_gpu_level", 2940842095L), hostObject.objectPtr, level)

}

object OpenXRInterface {
  /** Class metadata for Gd[OpenXRInterface] lifetime management and casting. */
  given GodotClass[OpenXRInterface] with {
    def className = "OpenXRInterface"
    def isRefCounted = true
    def wrap(o: GodotObject): OpenXRInterface = new OpenXRInterface {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRInterface): GodotObject = t.hostObject
  }
}
