package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRHand`, extends `Node3D`. */
abstract class OpenXRHand extends Node3D {

  /** OpenXRHand.set_hand */
  final def setHand(hand: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRHand", "set_hand", 1849328560L), hostObject.objectPtr, hand)

  /** OpenXRHand.get_hand */
  final def getHand(): Long =
    Ptrcall.call0[Long](MethodBind.get("OpenXRHand", "get_hand", 2850644561L), hostObject.objectPtr)

  /** OpenXRHand.set_motion_range */
  final def setMotionRange(motion_range: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRHand", "set_motion_range", 3326516003L), hostObject.objectPtr, motion_range)

  /** OpenXRHand.get_motion_range */
  final def getMotionRange(): Long =
    Ptrcall.call0[Long](MethodBind.get("OpenXRHand", "get_motion_range", 2191822314L), hostObject.objectPtr)

  /** OpenXRHand.set_skeleton_rig */
  final def setSkeletonRig(skeleton_rig: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRHand", "set_skeleton_rig", 1528072213L), hostObject.objectPtr, skeleton_rig)

  /** OpenXRHand.get_skeleton_rig */
  final def getSkeletonRig(): Long =
    Ptrcall.call0[Long](MethodBind.get("OpenXRHand", "get_skeleton_rig", 968409338L), hostObject.objectPtr)

  /** OpenXRHand.set_bone_update */
  final def setBoneUpdate(bone_update: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRHand", "set_bone_update", 3144625444L), hostObject.objectPtr, bone_update)

  /** OpenXRHand.get_bone_update */
  final def getBoneUpdate(): Long =
    Ptrcall.call0[Long](MethodBind.get("OpenXRHand", "get_bone_update", 1310695248L), hostObject.objectPtr)

}

object OpenXRHand {
  /** Class metadata for Gd[OpenXRHand] lifetime management and casting. */
  given GodotClass[OpenXRHand] with {
    def className = "OpenXRHand"
    def isRefCounted = false
    def wrap(o: GodotObject): OpenXRHand = new OpenXRHand {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRHand): GodotObject = t.hostObject
  }
}
