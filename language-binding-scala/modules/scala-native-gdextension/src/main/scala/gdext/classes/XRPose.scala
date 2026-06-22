package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `XRPose`, extends `RefCounted`. */
abstract class XRPose extends RefCounted {

  /** XRPose.set_has_tracking_data */
  final def setHasTrackingData(has_tracking_data: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("XRPose", "set_has_tracking_data", 2586408642L), hostObject.objectPtr, has_tracking_data)

  /** XRPose.get_has_tracking_data */
  final def getHasTrackingData(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("XRPose", "get_has_tracking_data", 36873697L), hostObject.objectPtr)

  /** XRPose.set_name */
  final def setName(name: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("XRPose", "set_name", 3304788590L), hostObject.objectPtr, name)

  /** XRPose.get_name */
  final def getName(): gdext.builtin.StringName =
    Ptrcall.call0[gdext.builtin.StringName](MethodBind.get("XRPose", "get_name", 2002593661L), hostObject.objectPtr)

  /** XRPose.set_transform */
  final def setTransform(transform: gdext.builtin.Transform3D): Unit =
    Ptrcall.callVoid1(MethodBind.get("XRPose", "set_transform", 2952846383L), hostObject.objectPtr, transform)

  /** XRPose.get_transform */
  final def getTransform(): gdext.builtin.Transform3D =
    Ptrcall.call0[gdext.builtin.Transform3D](MethodBind.get("XRPose", "get_transform", 3229777777L), hostObject.objectPtr)

  /** XRPose.get_adjusted_transform */
  final def getAdjustedTransform(): gdext.builtin.Transform3D =
    Ptrcall.call0[gdext.builtin.Transform3D](MethodBind.get("XRPose", "get_adjusted_transform", 3229777777L), hostObject.objectPtr)

  /** XRPose.set_linear_velocity */
  final def setLinearVelocity(velocity: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("XRPose", "set_linear_velocity", 3460891852L), hostObject.objectPtr, velocity)

  /** XRPose.get_linear_velocity */
  final def getLinearVelocity(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("XRPose", "get_linear_velocity", 3360562783L), hostObject.objectPtr)

  /** XRPose.set_angular_velocity */
  final def setAngularVelocity(velocity: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("XRPose", "set_angular_velocity", 3460891852L), hostObject.objectPtr, velocity)

  /** XRPose.get_angular_velocity */
  final def getAngularVelocity(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("XRPose", "get_angular_velocity", 3360562783L), hostObject.objectPtr)

  /** XRPose.set_tracking_confidence */
  final def setTrackingConfidence(tracking_confidence: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("XRPose", "set_tracking_confidence", 4171656666L), hostObject.objectPtr, tracking_confidence)

  /** XRPose.get_tracking_confidence */
  final def getTrackingConfidence(): Long =
    Ptrcall.call0[Long](MethodBind.get("XRPose", "get_tracking_confidence", 2064923680L), hostObject.objectPtr)

}

object XRPose {
  /** Class metadata for Gd[XRPose] lifetime management and casting. */
  given GodotClass[XRPose] with {
    def className = "XRPose"
    def isRefCounted = true
    def wrap(o: GodotObject): XRPose = new XRPose {}.withHost(o.objectPtr)
    def unwrap(t: XRPose): GodotObject = t.hostObject
  }
}
