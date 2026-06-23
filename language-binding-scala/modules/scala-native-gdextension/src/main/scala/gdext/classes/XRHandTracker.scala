package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `XRHandTracker`, extends `XRPositionalTracker`. */
abstract class XRHandTracker extends XRPositionalTracker {

  /** XRHandTracker.set_has_tracking_data */
  final def setHasTrackingData(has_data: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("XRHandTracker", "set_has_tracking_data", 2586408642L), hostObject.objectPtr, has_data)

  /** XRHandTracker.get_has_tracking_data */
  final def getHasTrackingData(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("XRHandTracker", "get_has_tracking_data", 36873697L), hostObject.objectPtr)

  /** XRHandTracker.set_hand_tracking_source */
  final def setHandTrackingSource(source: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("XRHandTracker", "set_hand_tracking_source", 2958308861L), hostObject.objectPtr, source)

  /** XRHandTracker.get_hand_tracking_source */
  final def getHandTrackingSource(): Long =
    Ptrcall.call0[Long](MethodBind.get("XRHandTracker", "get_hand_tracking_source", 2475045250L), hostObject.objectPtr)

  /** XRHandTracker.set_hand_joint_flags */
  final def setHandJointFlags(joint: Long, flags: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("XRHandTracker", "set_hand_joint_flags", 3028437365L), hostObject.objectPtr, joint, flags)

  /** XRHandTracker.get_hand_joint_flags */
  final def getHandJointFlags(joint: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("XRHandTracker", "get_hand_joint_flags", 1730972401L), hostObject.objectPtr, joint)

  /** XRHandTracker.set_hand_joint_transform */
  final def setHandJointTransform(joint: Long, transform: gdext.builtin.Transform3D): Unit =
    Ptrcall.callVoid2(MethodBind.get("XRHandTracker", "set_hand_joint_transform", 2529959613L), hostObject.objectPtr, joint, transform)

  /** XRHandTracker.get_hand_joint_transform */
  final def getHandJointTransform(joint: Long): gdext.builtin.Transform3D =
    Ptrcall.call1[Long, gdext.builtin.Transform3D](MethodBind.get("XRHandTracker", "get_hand_joint_transform", 1090840196L), hostObject.objectPtr, joint)

  /** XRHandTracker.set_hand_joint_radius */
  final def setHandJointRadius(joint: Long, radius: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("XRHandTracker", "set_hand_joint_radius", 2723659615L), hostObject.objectPtr, joint, radius)

  /** XRHandTracker.get_hand_joint_radius */
  final def getHandJointRadius(joint: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("XRHandTracker", "get_hand_joint_radius", 3400025734L), hostObject.objectPtr, joint)

  /** XRHandTracker.set_hand_joint_linear_velocity */
  final def setHandJointLinearVelocity(joint: Long, linear_velocity: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid2(MethodBind.get("XRHandTracker", "set_hand_joint_linear_velocity", 1978646737L), hostObject.objectPtr, joint, linear_velocity)

  /** XRHandTracker.get_hand_joint_linear_velocity */
  final def getHandJointLinearVelocity(joint: Long): gdext.builtin.Vector3 =
    Ptrcall.call1[Long, gdext.builtin.Vector3](MethodBind.get("XRHandTracker", "get_hand_joint_linear_velocity", 547240792L), hostObject.objectPtr, joint)

  /** XRHandTracker.set_hand_joint_angular_velocity */
  final def setHandJointAngularVelocity(joint: Long, angular_velocity: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid2(MethodBind.get("XRHandTracker", "set_hand_joint_angular_velocity", 1978646737L), hostObject.objectPtr, joint, angular_velocity)

  /** XRHandTracker.get_hand_joint_angular_velocity */
  final def getHandJointAngularVelocity(joint: Long): gdext.builtin.Vector3 =
    Ptrcall.call1[Long, gdext.builtin.Vector3](MethodBind.get("XRHandTracker", "get_hand_joint_angular_velocity", 547240792L), hostObject.objectPtr, joint)

}

object XRHandTracker {
  /** Class metadata for Gd[XRHandTracker] lifetime management and casting. */
  given GodotClass[XRHandTracker] with {
    def className = "XRHandTracker"
    def isRefCounted = true
    def wrap(o: GodotObject): XRHandTracker = new XRHandTracker {}.withHost(o.objectPtr)
    def unwrap(t: XRHandTracker): GodotObject = t.hostObject
  }
}
