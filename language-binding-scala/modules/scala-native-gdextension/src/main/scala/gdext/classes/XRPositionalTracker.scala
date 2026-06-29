package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `XRPositionalTracker`, extends `XRTracker`. */
abstract class XRPositionalTracker extends XRTracker {
  override def godotClassName: String = "XRPositionalTracker"

  /** XRPositionalTracker.get_tracker_profile */
  final def getTrackerProfile(): String =
    Ptrcall.call0[String](MethodBind.get("XRPositionalTracker", "get_tracker_profile", 201670096L), hostObject.objectPtr)

  /** XRPositionalTracker.set_tracker_profile */
  final def setTrackerProfile(profile: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("XRPositionalTracker", "set_tracker_profile", 83702148L), hostObject.objectPtr, profile)

  /** XRPositionalTracker.get_tracker_hand */
  final def getTrackerHand(): Long =
    Ptrcall.call0[Long](MethodBind.get("XRPositionalTracker", "get_tracker_hand", 4181770860L), hostObject.objectPtr)

  /** XRPositionalTracker.set_tracker_hand */
  final def setTrackerHand(hand: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("XRPositionalTracker", "set_tracker_hand", 3904108980L), hostObject.objectPtr, hand)

  /** XRPositionalTracker.has_pose */
  final def hasPose(name: gdext.builtin.StringName): Boolean =
    Ptrcall.call1[gdext.builtin.StringName, Boolean](MethodBind.get("XRPositionalTracker", "has_pose", 2619796661L), hostObject.objectPtr, name)

  /** XRPositionalTracker.get_pose */
  final def getPose(name: gdext.builtin.StringName): GodotObject =
    Ptrcall.call1[gdext.builtin.StringName, GodotObject](MethodBind.get("XRPositionalTracker", "get_pose", 4099720006L), hostObject.objectPtr, name)

  /** XRPositionalTracker.invalidate_pose */
  final def invalidatePose(name: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("XRPositionalTracker", "invalidate_pose", 3304788590L), hostObject.objectPtr, name)

  /** XRPositionalTracker.set_pose */
  final def setPose(name: gdext.builtin.StringName, transform: gdext.builtin.Transform3D, linear_velocity: gdext.builtin.Vector3, angular_velocity: gdext.builtin.Vector3, tracking_confidence: Long): Unit =
    Ptrcall.callVoid5(MethodBind.get("XRPositionalTracker", "set_pose", 3451230163L), hostObject.objectPtr, name, transform, linear_velocity, angular_velocity, tracking_confidence)

}
