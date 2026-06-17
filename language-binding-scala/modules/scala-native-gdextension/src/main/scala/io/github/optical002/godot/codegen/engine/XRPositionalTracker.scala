package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `XRPositionalTracker`, extends `XRTracker`. */
abstract class XRPositionalTracker extends XRTracker {

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
  final def hasPose(name: io.github.optical002.godot.builtin.StringName): Boolean =
    Ptrcall.call1[io.github.optical002.godot.builtin.StringName, Boolean](MethodBind.get("XRPositionalTracker", "has_pose", 2619796661L), hostObject.objectPtr, name)

  /** XRPositionalTracker.get_pose */
  final def getPose(name: io.github.optical002.godot.builtin.StringName): GodotObject =
    Ptrcall.call1[io.github.optical002.godot.builtin.StringName, GodotObject](MethodBind.get("XRPositionalTracker", "get_pose", 4099720006L), hostObject.objectPtr, name)

  /** XRPositionalTracker.invalidate_pose */
  final def invalidatePose(name: io.github.optical002.godot.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("XRPositionalTracker", "invalidate_pose", 3304788590L), hostObject.objectPtr, name)

  /** XRPositionalTracker.set_pose */
  final def setPose(name: io.github.optical002.godot.builtin.StringName, transform: io.github.optical002.godot.builtin.Transform3D, linear_velocity: io.github.optical002.godot.builtin.Vector3, angular_velocity: io.github.optical002.godot.builtin.Vector3, tracking_confidence: Long): Unit =
    Ptrcall.callVoid5(MethodBind.get("XRPositionalTracker", "set_pose", 3451230163L), hostObject.objectPtr, name, transform, linear_velocity, angular_velocity, tracking_confidence)

}

object XRPositionalTracker {
  /** Class metadata for Gd[XRPositionalTracker] lifetime management and casting. */
  given GodotClass[XRPositionalTracker] with {
    def className = "XRPositionalTracker"
    def isRefCounted = true
    def wrap(o: GodotObject): XRPositionalTracker = new XRPositionalTracker {}.withHost(o.objectPtr)
    def unwrap(t: XRPositionalTracker): GodotObject = t.hostObject
  }
}
