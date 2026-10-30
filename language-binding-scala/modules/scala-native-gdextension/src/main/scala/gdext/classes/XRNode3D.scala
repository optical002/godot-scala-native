package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `XRNode3D`, extends `Node3D`. */
abstract class XRNode3D extends Node3D {
  override def godotClassName: String = "XRNode3D"

  /** XRNode3D.set_tracker */
  final def setTracker(trackerName: String): Unit = {
    if (gdext.classes.XRNode3D.mb_set_tracker == null) gdext.classes.XRNode3D.mb_set_tracker = MethodBind.get("XRNode3D", "set_tracker", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.XRNode3D.mb_set_tracker, livePtr, SnArg(trackerName))
  }

  /** XRNode3D.get_tracker */
  final def getTracker(): String = {
    if (gdext.classes.XRNode3D.mb_get_tracker == null) gdext.classes.XRNode3D.mb_get_tracker = MethodBind.get("XRNode3D", "get_tracker", 2002593661L)
    Ptrcall.call0[SnArg](gdext.classes.XRNode3D.mb_get_tracker, livePtr)
  }

  /** XRNode3D.set_pose_name */
  final def setPoseName(pose: String): Unit = {
    if (gdext.classes.XRNode3D.mb_set_pose_name == null) gdext.classes.XRNode3D.mb_set_pose_name = MethodBind.get("XRNode3D", "set_pose_name", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.XRNode3D.mb_set_pose_name, livePtr, SnArg(pose))
  }

  /** XRNode3D.get_pose_name */
  final def getPoseName(): String = {
    if (gdext.classes.XRNode3D.mb_get_pose_name == null) gdext.classes.XRNode3D.mb_get_pose_name = MethodBind.get("XRNode3D", "get_pose_name", 2002593661L)
    Ptrcall.call0[SnArg](gdext.classes.XRNode3D.mb_get_pose_name, livePtr)
  }

  /** XRNode3D.set_show_when_tracked */
  final def setShowWhenTracked(show: Boolean): Unit = {
    if (gdext.classes.XRNode3D.mb_set_show_when_tracked == null) gdext.classes.XRNode3D.mb_set_show_when_tracked = MethodBind.get("XRNode3D", "set_show_when_tracked", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.XRNode3D.mb_set_show_when_tracked, livePtr, show)
  }

  /** XRNode3D.get_show_when_tracked */
  final def getShowWhenTracked(): Boolean = {
    if (gdext.classes.XRNode3D.mb_get_show_when_tracked == null) gdext.classes.XRNode3D.mb_get_show_when_tracked = MethodBind.get("XRNode3D", "get_show_when_tracked", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.XRNode3D.mb_get_show_when_tracked, livePtr)
  }

  /** XRNode3D.get_is_active */
  final def getIsActive(): Boolean = {
    if (gdext.classes.XRNode3D.mb_get_is_active == null) gdext.classes.XRNode3D.mb_get_is_active = MethodBind.get("XRNode3D", "get_is_active", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.XRNode3D.mb_get_is_active, livePtr)
  }

  /** XRNode3D.get_has_tracking_data */
  final def getHasTrackingData(): Boolean = {
    if (gdext.classes.XRNode3D.mb_get_has_tracking_data == null) gdext.classes.XRNode3D.mb_get_has_tracking_data = MethodBind.get("XRNode3D", "get_has_tracking_data", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.XRNode3D.mb_get_has_tracking_data, livePtr)
  }

  /** XRNode3D.get_pose. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getPose(): XRPose = {
    if (gdext.classes.XRNode3D.mb_get_pose == null) gdext.classes.XRNode3D.mb_get_pose = MethodBind.get("XRNode3D", "get_pose", 2806551826L)
    Wrappers.owned[XRPose](Ptrcall.call0[Long](gdext.classes.XRNode3D.mb_get_pose, livePtr))
  }

  /** XRNode3D.trigger_haptic_pulse */
  final def triggerHapticPulse(actionName: String, frequency: Double, amplitude: Double, durationSec: Double, delaySec: Double): Unit = {
    if (gdext.classes.XRNode3D.mb_trigger_haptic_pulse == null) gdext.classes.XRNode3D.mb_trigger_haptic_pulse = MethodBind.get("XRNode3D", "trigger_haptic_pulse", 508576839L)
    Ptrcall.callVoid5(gdext.classes.XRNode3D.mb_trigger_haptic_pulse, livePtr, actionName, frequency, amplitude, durationSec, delaySec)
  }

}

object XRNode3D {
  private[classes] var mb_set_tracker: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tracker: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_pose_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_pose_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_show_when_tracked: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_show_when_tracked: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_is_active: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_has_tracking_data: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_pose: GDExtensionMethodBindPtr = null
  private[classes] var mb_trigger_haptic_pulse: GDExtensionMethodBindPtr = null
}
