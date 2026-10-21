package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `XRPositionalTracker`, extends `XRTracker`. */
abstract class XRPositionalTracker extends XRTracker {
  override def godotClassName: String = "XRPositionalTracker"

  /** XRPositionalTracker.get_tracker_profile */
  final def getTrackerProfile(): String = {
    if (gdext.classes.XRPositionalTracker.mb_get_tracker_profile == null) gdext.classes.XRPositionalTracker.mb_get_tracker_profile = MethodBind.get("XRPositionalTracker", "get_tracker_profile", 201670096L)
    Ptrcall.call0[String](gdext.classes.XRPositionalTracker.mb_get_tracker_profile, livePtr)
  }

  /** XRPositionalTracker.set_tracker_profile */
  final def setTrackerProfile(profile: String): Unit = {
    if (gdext.classes.XRPositionalTracker.mb_set_tracker_profile == null) gdext.classes.XRPositionalTracker.mb_set_tracker_profile = MethodBind.get("XRPositionalTracker", "set_tracker_profile", 83702148L)
    Ptrcall.callVoid1(gdext.classes.XRPositionalTracker.mb_set_tracker_profile, livePtr, profile)
  }

  /** XRPositionalTracker.get_tracker_hand */
  final def getTrackerHand(): Long = {
    if (gdext.classes.XRPositionalTracker.mb_get_tracker_hand == null) gdext.classes.XRPositionalTracker.mb_get_tracker_hand = MethodBind.get("XRPositionalTracker", "get_tracker_hand", 4181770860L)
    Ptrcall.call0[Long](gdext.classes.XRPositionalTracker.mb_get_tracker_hand, livePtr)
  }

  /** XRPositionalTracker.set_tracker_hand */
  final def setTrackerHand(hand: Long): Unit = {
    if (gdext.classes.XRPositionalTracker.mb_set_tracker_hand == null) gdext.classes.XRPositionalTracker.mb_set_tracker_hand = MethodBind.get("XRPositionalTracker", "set_tracker_hand", 3904108980L)
    Ptrcall.callVoid1(gdext.classes.XRPositionalTracker.mb_set_tracker_hand, livePtr, hand)
  }

  /** XRPositionalTracker.has_pose */
  final def hasPose(name: gdext.builtin.StringName): Boolean = {
    if (gdext.classes.XRPositionalTracker.mb_has_pose == null) gdext.classes.XRPositionalTracker.mb_has_pose = MethodBind.get("XRPositionalTracker", "has_pose", 2619796661L)
    Ptrcall.call1[gdext.builtin.StringName, Boolean](gdext.classes.XRPositionalTracker.mb_has_pose, livePtr, name)
  }

  /** XRPositionalTracker.get_pose. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getPose(name: gdext.builtin.StringName): XRPose = {
    if (gdext.classes.XRPositionalTracker.mb_get_pose == null) gdext.classes.XRPositionalTracker.mb_get_pose = MethodBind.get("XRPositionalTracker", "get_pose", 4099720006L)
    Wrappers.owned[XRPose](Ptrcall.call1[gdext.builtin.StringName, Long](gdext.classes.XRPositionalTracker.mb_get_pose, livePtr, name))
  }

  /** XRPositionalTracker.invalidate_pose */
  final def invalidatePose(name: gdext.builtin.StringName): Unit = {
    if (gdext.classes.XRPositionalTracker.mb_invalidate_pose == null) gdext.classes.XRPositionalTracker.mb_invalidate_pose = MethodBind.get("XRPositionalTracker", "invalidate_pose", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.XRPositionalTracker.mb_invalidate_pose, livePtr, name)
  }

  /** XRPositionalTracker.set_pose */
  final def setPose(name: gdext.builtin.StringName, transform: gdext.builtin.Transform3D, linear_velocity: gdext.builtin.Vector3, angular_velocity: gdext.builtin.Vector3, tracking_confidence: Long): Unit = {
    if (gdext.classes.XRPositionalTracker.mb_set_pose == null) gdext.classes.XRPositionalTracker.mb_set_pose = MethodBind.get("XRPositionalTracker", "set_pose", 3451230163L)
    Ptrcall.callVoid5(gdext.classes.XRPositionalTracker.mb_set_pose, livePtr, name, transform, linear_velocity, angular_velocity, tracking_confidence)
  }

}

object XRPositionalTracker {
  private[classes] var mb_get_tracker_profile: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tracker_profile: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tracker_hand: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tracker_hand: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_pose: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_pose: GDExtensionMethodBindPtr = null
  private[classes] var mb_invalidate_pose: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_pose: GDExtensionMethodBindPtr = null
}
