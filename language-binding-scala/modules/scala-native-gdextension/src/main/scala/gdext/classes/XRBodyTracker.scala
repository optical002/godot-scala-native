package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `XRBodyTracker`, extends `XRPositionalTracker`. */
abstract class XRBodyTracker extends XRPositionalTracker {
  override def godotClassName: String = "XRBodyTracker"

  /** XRBodyTracker.set_has_tracking_data */
  final def setHasTrackingData(has_data: Boolean): Unit = {
    if (gdext.classes.XRBodyTracker.mb_set_has_tracking_data == null) gdext.classes.XRBodyTracker.mb_set_has_tracking_data = MethodBind.get("XRBodyTracker", "set_has_tracking_data", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.XRBodyTracker.mb_set_has_tracking_data, livePtr, has_data)
  }

  /** XRBodyTracker.get_has_tracking_data */
  final def getHasTrackingData(): Boolean = {
    if (gdext.classes.XRBodyTracker.mb_get_has_tracking_data == null) gdext.classes.XRBodyTracker.mb_get_has_tracking_data = MethodBind.get("XRBodyTracker", "get_has_tracking_data", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.XRBodyTracker.mb_get_has_tracking_data, livePtr)
  }

  /** XRBodyTracker.set_body_flags */
  final def setBodyFlags(flags: Long): Unit = {
    if (gdext.classes.XRBodyTracker.mb_set_body_flags == null) gdext.classes.XRBodyTracker.mb_set_body_flags = MethodBind.get("XRBodyTracker", "set_body_flags", 2103235750L)
    Ptrcall.callVoid1(gdext.classes.XRBodyTracker.mb_set_body_flags, livePtr, flags)
  }

  /** XRBodyTracker.get_body_flags */
  final def getBodyFlags(): Long = {
    if (gdext.classes.XRBodyTracker.mb_get_body_flags == null) gdext.classes.XRBodyTracker.mb_get_body_flags = MethodBind.get("XRBodyTracker", "get_body_flags", 3543166366L)
    Ptrcall.call0[Long](gdext.classes.XRBodyTracker.mb_get_body_flags, livePtr)
  }

  /** XRBodyTracker.set_joint_flags */
  final def setJointFlags(joint: Long, flags: Long): Unit = {
    if (gdext.classes.XRBodyTracker.mb_set_joint_flags == null) gdext.classes.XRBodyTracker.mb_set_joint_flags = MethodBind.get("XRBodyTracker", "set_joint_flags", 592144999L)
    Ptrcall.callVoid2(gdext.classes.XRBodyTracker.mb_set_joint_flags, livePtr, joint, flags)
  }

  /** XRBodyTracker.get_joint_flags */
  final def getJointFlags(joint: Long): Long = {
    if (gdext.classes.XRBodyTracker.mb_get_joint_flags == null) gdext.classes.XRBodyTracker.mb_get_joint_flags = MethodBind.get("XRBodyTracker", "get_joint_flags", 1030162609L)
    Ptrcall.call1[Long, Long](gdext.classes.XRBodyTracker.mb_get_joint_flags, livePtr, joint)
  }

  /** XRBodyTracker.set_joint_transform */
  final def setJointTransform(joint: Long, transform: gdext.builtin.Transform3D): Unit = {
    if (gdext.classes.XRBodyTracker.mb_set_joint_transform == null) gdext.classes.XRBodyTracker.mb_set_joint_transform = MethodBind.get("XRBodyTracker", "set_joint_transform", 2635424328L)
    Ptrcall.callVoid2(gdext.classes.XRBodyTracker.mb_set_joint_transform, livePtr, joint, transform)
  }

  /** XRBodyTracker.get_joint_transform */
  final def getJointTransform(joint: Long): gdext.builtin.Transform3D = {
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
}
