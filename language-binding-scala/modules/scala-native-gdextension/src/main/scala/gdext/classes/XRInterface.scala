package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `XRInterface`, extends `RefCounted`. */
abstract class XRInterface extends RefCounted {

  /** XRInterface.get_name */
  final def getName(): gdext.builtin.StringName =
    Ptrcall.call0[gdext.builtin.StringName](MethodBind.get("XRInterface", "get_name", 2002593661L), hostObject.objectPtr)

  /** XRInterface.get_capabilities */
  final def getCapabilities(): Long =
    Ptrcall.call0[Long](MethodBind.get("XRInterface", "get_capabilities", 3905245786L), hostObject.objectPtr)

  /** XRInterface.is_primary */
  final def isPrimary(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("XRInterface", "is_primary", 2240911060L), hostObject.objectPtr)

  /** XRInterface.set_primary */
  final def setPrimary(primary: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("XRInterface", "set_primary", 2586408642L), hostObject.objectPtr, primary)

  /** XRInterface.is_initialized */
  final def isInitialized(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("XRInterface", "is_initialized", 36873697L), hostObject.objectPtr)

  /** XRInterface.initialize */
  final def initialize(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("XRInterface", "initialize", 2240911060L), hostObject.objectPtr)

  /** XRInterface.uninitialize */
  final def uninitialize(): Unit =
    Ptrcall.callVoid0(MethodBind.get("XRInterface", "uninitialize", 3218959716L), hostObject.objectPtr)

  /** XRInterface.get_tracking_status */
  final def getTrackingStatus(): Long =
    Ptrcall.call0[Long](MethodBind.get("XRInterface", "get_tracking_status", 167423259L), hostObject.objectPtr)

  /** XRInterface.get_render_target_size */
  final def getRenderTargetSize(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("XRInterface", "get_render_target_size", 1497962370L), hostObject.objectPtr)

  /** XRInterface.get_view_count */
  final def getViewCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("XRInterface", "get_view_count", 2455072627L), hostObject.objectPtr)

  /** XRInterface.trigger_haptic_pulse */
  final def triggerHapticPulse(action_name: String, tracker_name: gdext.builtin.StringName, frequency: Double, amplitude: Double, duration_sec: Double, delay_sec: Double): Unit =
    Ptrcall.callVoid6(MethodBind.get("XRInterface", "trigger_haptic_pulse", 3752640163L), hostObject.objectPtr, action_name, tracker_name, frequency, amplitude, duration_sec, delay_sec)

  /** XRInterface.supports_play_area_mode */
  final def supportsPlayAreaMode(mode: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("XRInterface", "supports_play_area_mode", 3429955281L), hostObject.objectPtr, mode)

  /** XRInterface.get_play_area_mode */
  final def getPlayAreaMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("XRInterface", "get_play_area_mode", 1615132885L), hostObject.objectPtr)

  /** XRInterface.set_play_area_mode */
  final def setPlayAreaMode(mode: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("XRInterface", "set_play_area_mode", 3429955281L), hostObject.objectPtr, mode)

  /** XRInterface.get_anchor_detection_is_enabled */
  final def getAnchorDetectionIsEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("XRInterface", "get_anchor_detection_is_enabled", 36873697L), hostObject.objectPtr)

  /** XRInterface.set_anchor_detection_is_enabled */
  final def setAnchorDetectionIsEnabled(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("XRInterface", "set_anchor_detection_is_enabled", 2586408642L), hostObject.objectPtr, enable)

  /** XRInterface.get_camera_feed_id */
  final def getCameraFeedId(): Long =
    Ptrcall.call0[Long](MethodBind.get("XRInterface", "get_camera_feed_id", 2455072627L), hostObject.objectPtr)

  /** XRInterface.is_passthrough_supported */
  final def isPassthroughSupported(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("XRInterface", "is_passthrough_supported", 2240911060L), hostObject.objectPtr)

  /** XRInterface.is_passthrough_enabled */
  final def isPassthroughEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("XRInterface", "is_passthrough_enabled", 2240911060L), hostObject.objectPtr)

  /** XRInterface.start_passthrough */
  final def startPassthrough(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("XRInterface", "start_passthrough", 2240911060L), hostObject.objectPtr)

  /** XRInterface.stop_passthrough */
  final def stopPassthrough(): Unit =
    Ptrcall.callVoid0(MethodBind.get("XRInterface", "stop_passthrough", 3218959716L), hostObject.objectPtr)

  /** XRInterface.get_transform_for_view */
  final def getTransformForView(view: Long, cam_transform: gdext.builtin.Transform3D): gdext.builtin.Transform3D =
    Ptrcall.call2[Long, gdext.builtin.Transform3D, gdext.builtin.Transform3D](MethodBind.get("XRInterface", "get_transform_for_view", 518934792L), hostObject.objectPtr, view, cam_transform)

  /** XRInterface.get_projection_for_view */
  final def getProjectionForView(view: Long, aspect: Double, near: Double, far: Double): gdext.builtin.Projection =
    Ptrcall.call4[Long, Double, Double, Double, gdext.builtin.Projection](MethodBind.get("XRInterface", "get_projection_for_view", 3766090294L), hostObject.objectPtr, view, aspect, near, far)

  /** XRInterface.set_environment_blend_mode */
  final def setEnvironmentBlendMode(mode: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("XRInterface", "set_environment_blend_mode", 551152418L), hostObject.objectPtr, mode)

  /** XRInterface.get_environment_blend_mode */
  final def getEnvironmentBlendMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("XRInterface", "get_environment_blend_mode", 1984334071L), hostObject.objectPtr)

}

object XRInterface {
  /** Class metadata for Gd[XRInterface] lifetime management and casting. */
  given GodotClass[XRInterface] with {
    def className = "XRInterface"
    def isRefCounted = true
    def wrap(o: GodotObject): XRInterface = new XRInterface {}.withHost(o.objectPtr)
    def unwrap(t: XRInterface): GodotObject = t.hostObject
  }
}
