package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `XRBodyTracker`, extends `XRPositionalTracker`. */
abstract class XRBodyTracker extends XRPositionalTracker {

  /** XRBodyTracker.set_has_tracking_data */
  final def setHasTrackingData(has_data: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("XRBodyTracker", "set_has_tracking_data", 2586408642L), hostObject.objectPtr, has_data)

  /** XRBodyTracker.get_has_tracking_data */
  final def getHasTrackingData(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("XRBodyTracker", "get_has_tracking_data", 36873697L), hostObject.objectPtr)

  /** XRBodyTracker.set_body_flags */
  final def setBodyFlags(flags: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("XRBodyTracker", "set_body_flags", 2103235750L), hostObject.objectPtr, flags)

  /** XRBodyTracker.get_body_flags */
  final def getBodyFlags(): Long =
    Ptrcall.call0[Long](MethodBind.get("XRBodyTracker", "get_body_flags", 3543166366L), hostObject.objectPtr)

  /** XRBodyTracker.set_joint_flags */
  final def setJointFlags(joint: Long, flags: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("XRBodyTracker", "set_joint_flags", 592144999L), hostObject.objectPtr, joint, flags)

  /** XRBodyTracker.get_joint_flags */
  final def getJointFlags(joint: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("XRBodyTracker", "get_joint_flags", 1030162609L), hostObject.objectPtr, joint)

  /** XRBodyTracker.set_joint_transform */
  final def setJointTransform(joint: Long, transform: gdext.builtin.Transform3D): Unit =
    Ptrcall.callVoid2(MethodBind.get("XRBodyTracker", "set_joint_transform", 2635424328L), hostObject.objectPtr, joint, transform)

  /** XRBodyTracker.get_joint_transform */
  final def getJointTransform(joint: Long): gdext.builtin.Transform3D =
    Ptrcall.call1[Long, gdext.builtin.Transform3D](MethodBind.get("XRBodyTracker", "get_joint_transform", 3474811534L), hostObject.objectPtr, joint)

}

object XRBodyTracker {
  /** Class metadata for Gd[XRBodyTracker] lifetime management and casting. */
  given GodotClass[XRBodyTracker] with {
    def className = "XRBodyTracker"
    def isRefCounted = true
    def wrap(o: GodotObject): XRBodyTracker = new XRBodyTracker {}.withHost(o.objectPtr)
    def unwrap(t: XRBodyTracker): GodotObject = t.hostObject
  }
}
