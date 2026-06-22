package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `XRNode3D`, extends `Node3D`. */
abstract class XRNode3D extends Node3D {

  /** XRNode3D.set_tracker */
  final def setTracker(tracker_name: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("XRNode3D", "set_tracker", 3304788590L), hostObject.objectPtr, tracker_name)

  /** XRNode3D.get_tracker */
  final def getTracker(): gdext.builtin.StringName =
    Ptrcall.call0[gdext.builtin.StringName](MethodBind.get("XRNode3D", "get_tracker", 2002593661L), hostObject.objectPtr)

  /** XRNode3D.set_pose_name */
  final def setPoseName(pose: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("XRNode3D", "set_pose_name", 3304788590L), hostObject.objectPtr, pose)

  /** XRNode3D.get_pose_name */
  final def getPoseName(): gdext.builtin.StringName =
    Ptrcall.call0[gdext.builtin.StringName](MethodBind.get("XRNode3D", "get_pose_name", 2002593661L), hostObject.objectPtr)

  /** XRNode3D.set_show_when_tracked */
  final def setShowWhenTracked(show: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("XRNode3D", "set_show_when_tracked", 2586408642L), hostObject.objectPtr, show)

  /** XRNode3D.get_show_when_tracked */
  final def getShowWhenTracked(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("XRNode3D", "get_show_when_tracked", 36873697L), hostObject.objectPtr)

  /** XRNode3D.get_is_active */
  final def getIsActive(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("XRNode3D", "get_is_active", 36873697L), hostObject.objectPtr)

  /** XRNode3D.get_has_tracking_data */
  final def getHasTrackingData(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("XRNode3D", "get_has_tracking_data", 36873697L), hostObject.objectPtr)

  /** XRNode3D.get_pose */
  final def getPose(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("XRNode3D", "get_pose", 2806551826L), hostObject.objectPtr)

  /** XRNode3D.trigger_haptic_pulse */
  final def triggerHapticPulse(action_name: String, frequency: Double, amplitude: Double, duration_sec: Double, delay_sec: Double): Unit =
    Ptrcall.callVoid5(MethodBind.get("XRNode3D", "trigger_haptic_pulse", 508576839L), hostObject.objectPtr, action_name, frequency, amplitude, duration_sec, delay_sec)

}

object XRNode3D {
  /** Class metadata for Gd[XRNode3D] lifetime management and casting. */
  given GodotClass[XRNode3D] with {
    def className = "XRNode3D"
    def isRefCounted = false
    def wrap(o: GodotObject): XRNode3D = new XRNode3D {}.withHost(o.objectPtr)
    def unwrap(t: XRNode3D): GodotObject = t.hostObject
  }
}
