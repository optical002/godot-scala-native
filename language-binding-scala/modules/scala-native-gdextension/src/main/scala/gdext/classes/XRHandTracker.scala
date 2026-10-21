package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `XRHandTracker`, extends `XRPositionalTracker`. */
abstract class XRHandTracker extends XRPositionalTracker {
  override def godotClassName: String = "XRHandTracker"

  /** XRHandTracker.set_has_tracking_data */
  final def setHasTrackingData(has_data: Boolean): Unit = {
    if (gdext.classes.XRHandTracker.mb_set_has_tracking_data == null) gdext.classes.XRHandTracker.mb_set_has_tracking_data = MethodBind.get("XRHandTracker", "set_has_tracking_data", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.XRHandTracker.mb_set_has_tracking_data, livePtr, has_data)
  }

  /** XRHandTracker.get_has_tracking_data */
  final def getHasTrackingData(): Boolean = {
    if (gdext.classes.XRHandTracker.mb_get_has_tracking_data == null) gdext.classes.XRHandTracker.mb_get_has_tracking_data = MethodBind.get("XRHandTracker", "get_has_tracking_data", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.XRHandTracker.mb_get_has_tracking_data, livePtr)
  }

  /** XRHandTracker.set_hand_tracking_source */
  final def setHandTrackingSource(source: Long): Unit = {
    if (gdext.classes.XRHandTracker.mb_set_hand_tracking_source == null) gdext.classes.XRHandTracker.mb_set_hand_tracking_source = MethodBind.get("XRHandTracker", "set_hand_tracking_source", 2958308861L)
    Ptrcall.callVoid1(gdext.classes.XRHandTracker.mb_set_hand_tracking_source, livePtr, source)
  }

  /** XRHandTracker.get_hand_tracking_source */
  final def getHandTrackingSource(): Long = {
    if (gdext.classes.XRHandTracker.mb_get_hand_tracking_source == null) gdext.classes.XRHandTracker.mb_get_hand_tracking_source = MethodBind.get("XRHandTracker", "get_hand_tracking_source", 2475045250L)
    Ptrcall.call0[Long](gdext.classes.XRHandTracker.mb_get_hand_tracking_source, livePtr)
  }

  /** XRHandTracker.set_hand_joint_flags */
  final def setHandJointFlags(joint: Long, flags: Long): Unit = {
    if (gdext.classes.XRHandTracker.mb_set_hand_joint_flags == null) gdext.classes.XRHandTracker.mb_set_hand_joint_flags = MethodBind.get("XRHandTracker", "set_hand_joint_flags", 3028437365L)
    Ptrcall.callVoid2(gdext.classes.XRHandTracker.mb_set_hand_joint_flags, livePtr, joint, flags)
  }

  /** XRHandTracker.get_hand_joint_flags */
  final def getHandJointFlags(joint: Long): Long = {
    if (gdext.classes.XRHandTracker.mb_get_hand_joint_flags == null) gdext.classes.XRHandTracker.mb_get_hand_joint_flags = MethodBind.get("XRHandTracker", "get_hand_joint_flags", 1730972401L)
    Ptrcall.call1[Long, Long](gdext.classes.XRHandTracker.mb_get_hand_joint_flags, livePtr, joint)
  }

  /** XRHandTracker.set_hand_joint_transform */
  final def setHandJointTransform(joint: Long, transform: gdext.builtin.Transform3D): Unit = {
    if (gdext.classes.XRHandTracker.mb_set_hand_joint_transform == null) gdext.classes.XRHandTracker.mb_set_hand_joint_transform = MethodBind.get("XRHandTracker", "set_hand_joint_transform", 2529959613L)
    Ptrcall.callVoid2(gdext.classes.XRHandTracker.mb_set_hand_joint_transform, livePtr, joint, transform)
  }

  /** XRHandTracker.get_hand_joint_transform */
  final def getHandJointTransform(joint: Long): gdext.builtin.Transform3D = {
    if (gdext.classes.XRHandTracker.mb_get_hand_joint_transform == null) gdext.classes.XRHandTracker.mb_get_hand_joint_transform = MethodBind.get("XRHandTracker", "get_hand_joint_transform", 1090840196L)
    Ptrcall.call1[Long, gdext.builtin.Transform3D](gdext.classes.XRHandTracker.mb_get_hand_joint_transform, livePtr, joint)
  }

  /** XRHandTracker.set_hand_joint_radius */
  final def setHandJointRadius(joint: Long, radius: Double): Unit = {
    if (gdext.classes.XRHandTracker.mb_set_hand_joint_radius == null) gdext.classes.XRHandTracker.mb_set_hand_joint_radius = MethodBind.get("XRHandTracker", "set_hand_joint_radius", 2723659615L)
    Ptrcall.callVoid2(gdext.classes.XRHandTracker.mb_set_hand_joint_radius, livePtr, joint, radius)
  }

  /** XRHandTracker.get_hand_joint_radius */
  final def getHandJointRadius(joint: Long): Double = {
    if (gdext.classes.XRHandTracker.mb_get_hand_joint_radius == null) gdext.classes.XRHandTracker.mb_get_hand_joint_radius = MethodBind.get("XRHandTracker", "get_hand_joint_radius", 3400025734L)
    Ptrcall.call1[Long, Double](gdext.classes.XRHandTracker.mb_get_hand_joint_radius, livePtr, joint)
  }

  /** XRHandTracker.set_hand_joint_linear_velocity */
  final def setHandJointLinearVelocity(joint: Long, linear_velocity: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.XRHandTracker.mb_set_hand_joint_linear_velocity == null) gdext.classes.XRHandTracker.mb_set_hand_joint_linear_velocity = MethodBind.get("XRHandTracker", "set_hand_joint_linear_velocity", 1978646737L)
    Ptrcall.callVoid2(gdext.classes.XRHandTracker.mb_set_hand_joint_linear_velocity, livePtr, joint, linear_velocity)
  }

  /** XRHandTracker.get_hand_joint_linear_velocity */
  final def getHandJointLinearVelocity(joint: Long): gdext.builtin.Vector3 = {
    if (gdext.classes.XRHandTracker.mb_get_hand_joint_linear_velocity == null) gdext.classes.XRHandTracker.mb_get_hand_joint_linear_velocity = MethodBind.get("XRHandTracker", "get_hand_joint_linear_velocity", 547240792L)
    Ptrcall.call1[Long, gdext.builtin.Vector3](gdext.classes.XRHandTracker.mb_get_hand_joint_linear_velocity, livePtr, joint)
  }

  /** XRHandTracker.set_hand_joint_angular_velocity */
  final def setHandJointAngularVelocity(joint: Long, angular_velocity: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.XRHandTracker.mb_set_hand_joint_angular_velocity == null) gdext.classes.XRHandTracker.mb_set_hand_joint_angular_velocity = MethodBind.get("XRHandTracker", "set_hand_joint_angular_velocity", 1978646737L)
    Ptrcall.callVoid2(gdext.classes.XRHandTracker.mb_set_hand_joint_angular_velocity, livePtr, joint, angular_velocity)
  }

  /** XRHandTracker.get_hand_joint_angular_velocity */
  final def getHandJointAngularVelocity(joint: Long): gdext.builtin.Vector3 = {
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
}
