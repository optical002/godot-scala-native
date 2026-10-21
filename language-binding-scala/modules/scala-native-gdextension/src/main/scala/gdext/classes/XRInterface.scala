package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `XRInterface`, extends `RefCounted`. */
abstract class XRInterface extends RefCounted {
  override def godotClassName: String = "XRInterface"

  /** XRInterface.get_name */
  final def getName(): gdext.builtin.StringName = {
    if (gdext.classes.XRInterface.mb_get_name == null) gdext.classes.XRInterface.mb_get_name = MethodBind.get("XRInterface", "get_name", 2002593661L)
    Ptrcall.call0[gdext.builtin.StringName](gdext.classes.XRInterface.mb_get_name, livePtr)
  }

  /** XRInterface.get_capabilities */
  final def getCapabilities(): Long = {
    if (gdext.classes.XRInterface.mb_get_capabilities == null) gdext.classes.XRInterface.mb_get_capabilities = MethodBind.get("XRInterface", "get_capabilities", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.XRInterface.mb_get_capabilities, livePtr)
  }

  /** XRInterface.is_primary */
  final def isPrimary(): Boolean = {
    if (gdext.classes.XRInterface.mb_is_primary == null) gdext.classes.XRInterface.mb_is_primary = MethodBind.get("XRInterface", "is_primary", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.XRInterface.mb_is_primary, livePtr)
  }

  /** XRInterface.set_primary */
  final def setPrimary(primary: Boolean): Unit = {
    if (gdext.classes.XRInterface.mb_set_primary == null) gdext.classes.XRInterface.mb_set_primary = MethodBind.get("XRInterface", "set_primary", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.XRInterface.mb_set_primary, livePtr, primary)
  }

  /** XRInterface.is_initialized */
  final def isInitialized(): Boolean = {
    if (gdext.classes.XRInterface.mb_is_initialized == null) gdext.classes.XRInterface.mb_is_initialized = MethodBind.get("XRInterface", "is_initialized", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.XRInterface.mb_is_initialized, livePtr)
  }

  /** XRInterface.initialize */
  final def initialize(): Boolean = {
    if (gdext.classes.XRInterface.mb_initialize == null) gdext.classes.XRInterface.mb_initialize = MethodBind.get("XRInterface", "initialize", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.XRInterface.mb_initialize, livePtr)
  }

  /** XRInterface.uninitialize */
  final def uninitialize(): Unit = {
    if (gdext.classes.XRInterface.mb_uninitialize == null) gdext.classes.XRInterface.mb_uninitialize = MethodBind.get("XRInterface", "uninitialize", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.XRInterface.mb_uninitialize, livePtr)
  }

  /** XRInterface.get_tracking_status */
  final def getTrackingStatus(): Long = {
    if (gdext.classes.XRInterface.mb_get_tracking_status == null) gdext.classes.XRInterface.mb_get_tracking_status = MethodBind.get("XRInterface", "get_tracking_status", 167423259L)
    Ptrcall.call0[Long](gdext.classes.XRInterface.mb_get_tracking_status, livePtr)
  }

  /** XRInterface.get_render_target_size */
  final def getRenderTargetSize(): gdext.builtin.Vector2 = {
    if (gdext.classes.XRInterface.mb_get_render_target_size == null) gdext.classes.XRInterface.mb_get_render_target_size = MethodBind.get("XRInterface", "get_render_target_size", 1497962370L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.XRInterface.mb_get_render_target_size, livePtr)
  }

  /** XRInterface.get_view_count */
  final def getViewCount(): Long = {
    if (gdext.classes.XRInterface.mb_get_view_count == null) gdext.classes.XRInterface.mb_get_view_count = MethodBind.get("XRInterface", "get_view_count", 2455072627L)
    Ptrcall.call0[Long](gdext.classes.XRInterface.mb_get_view_count, livePtr)
  }

  /** XRInterface.trigger_haptic_pulse */
  final def triggerHapticPulse(action_name: String, tracker_name: gdext.builtin.StringName, frequency: Double, amplitude: Double, duration_sec: Double, delay_sec: Double): Unit = {
    if (gdext.classes.XRInterface.mb_trigger_haptic_pulse == null) gdext.classes.XRInterface.mb_trigger_haptic_pulse = MethodBind.get("XRInterface", "trigger_haptic_pulse", 3752640163L)
    Ptrcall.callVoid6(gdext.classes.XRInterface.mb_trigger_haptic_pulse, livePtr, action_name, tracker_name, frequency, amplitude, duration_sec, delay_sec)
  }

  /** XRInterface.supports_play_area_mode */
  final def supportsPlayAreaMode(mode: Long): Boolean = {
    if (gdext.classes.XRInterface.mb_supports_play_area_mode == null) gdext.classes.XRInterface.mb_supports_play_area_mode = MethodBind.get("XRInterface", "supports_play_area_mode", 3429955281L)
    Ptrcall.call1[Long, Boolean](gdext.classes.XRInterface.mb_supports_play_area_mode, livePtr, mode)
  }

  /** XRInterface.get_play_area_mode */
  final def getPlayAreaMode(): Long = {
    if (gdext.classes.XRInterface.mb_get_play_area_mode == null) gdext.classes.XRInterface.mb_get_play_area_mode = MethodBind.get("XRInterface", "get_play_area_mode", 1615132885L)
    Ptrcall.call0[Long](gdext.classes.XRInterface.mb_get_play_area_mode, livePtr)
  }

  /** XRInterface.set_play_area_mode */
  final def setPlayAreaMode(mode: Long): Boolean = {
    if (gdext.classes.XRInterface.mb_set_play_area_mode == null) gdext.classes.XRInterface.mb_set_play_area_mode = MethodBind.get("XRInterface", "set_play_area_mode", 3429955281L)
    Ptrcall.call1[Long, Boolean](gdext.classes.XRInterface.mb_set_play_area_mode, livePtr, mode)
  }

  /** XRInterface.get_anchor_detection_is_enabled */
  final def getAnchorDetectionIsEnabled(): Boolean = {
    if (gdext.classes.XRInterface.mb_get_anchor_detection_is_enabled == null) gdext.classes.XRInterface.mb_get_anchor_detection_is_enabled = MethodBind.get("XRInterface", "get_anchor_detection_is_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.XRInterface.mb_get_anchor_detection_is_enabled, livePtr)
  }

  /** XRInterface.set_anchor_detection_is_enabled */
  final def setAnchorDetectionIsEnabled(enable: Boolean): Unit = {
    if (gdext.classes.XRInterface.mb_set_anchor_detection_is_enabled == null) gdext.classes.XRInterface.mb_set_anchor_detection_is_enabled = MethodBind.get("XRInterface", "set_anchor_detection_is_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.XRInterface.mb_set_anchor_detection_is_enabled, livePtr, enable)
  }

  /** XRInterface.get_camera_feed_id */
  final def getCameraFeedId(): Long = {
    if (gdext.classes.XRInterface.mb_get_camera_feed_id == null) gdext.classes.XRInterface.mb_get_camera_feed_id = MethodBind.get("XRInterface", "get_camera_feed_id", 2455072627L)
    Ptrcall.call0[Long](gdext.classes.XRInterface.mb_get_camera_feed_id, livePtr)
  }

  /** XRInterface.is_passthrough_supported */
  final def isPassthroughSupported(): Boolean = {
    if (gdext.classes.XRInterface.mb_is_passthrough_supported == null) gdext.classes.XRInterface.mb_is_passthrough_supported = MethodBind.get("XRInterface", "is_passthrough_supported", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.XRInterface.mb_is_passthrough_supported, livePtr)
  }

  /** XRInterface.is_passthrough_enabled */
  final def isPassthroughEnabled(): Boolean = {
    if (gdext.classes.XRInterface.mb_is_passthrough_enabled == null) gdext.classes.XRInterface.mb_is_passthrough_enabled = MethodBind.get("XRInterface", "is_passthrough_enabled", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.XRInterface.mb_is_passthrough_enabled, livePtr)
  }

  /** XRInterface.start_passthrough */
  final def startPassthrough(): Boolean = {
    if (gdext.classes.XRInterface.mb_start_passthrough == null) gdext.classes.XRInterface.mb_start_passthrough = MethodBind.get("XRInterface", "start_passthrough", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.XRInterface.mb_start_passthrough, livePtr)
  }

  /** XRInterface.stop_passthrough */
  final def stopPassthrough(): Unit = {
    if (gdext.classes.XRInterface.mb_stop_passthrough == null) gdext.classes.XRInterface.mb_stop_passthrough = MethodBind.get("XRInterface", "stop_passthrough", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.XRInterface.mb_stop_passthrough, livePtr)
  }

  /** XRInterface.get_transform_for_view */
  final def getTransformForView(view: Long, cam_transform: gdext.builtin.Transform3D): gdext.builtin.Transform3D = {
    if (gdext.classes.XRInterface.mb_get_transform_for_view == null) gdext.classes.XRInterface.mb_get_transform_for_view = MethodBind.get("XRInterface", "get_transform_for_view", 518934792L)
    Ptrcall.call2[Long, gdext.builtin.Transform3D, gdext.builtin.Transform3D](gdext.classes.XRInterface.mb_get_transform_for_view, livePtr, view, cam_transform)
  }

  /** XRInterface.get_projection_for_view */
  final def getProjectionForView(view: Long, aspect: Double, near: Double, far: Double): gdext.builtin.Projection = {
    if (gdext.classes.XRInterface.mb_get_projection_for_view == null) gdext.classes.XRInterface.mb_get_projection_for_view = MethodBind.get("XRInterface", "get_projection_for_view", 3766090294L)
    Ptrcall.call4[Long, Double, Double, Double, gdext.builtin.Projection](gdext.classes.XRInterface.mb_get_projection_for_view, livePtr, view, aspect, near, far)
  }

  /** XRInterface.set_environment_blend_mode */
  final def setEnvironmentBlendMode(mode: Long): Boolean = {
    if (gdext.classes.XRInterface.mb_set_environment_blend_mode == null) gdext.classes.XRInterface.mb_set_environment_blend_mode = MethodBind.get("XRInterface", "set_environment_blend_mode", 551152418L)
    Ptrcall.call1[Long, Boolean](gdext.classes.XRInterface.mb_set_environment_blend_mode, livePtr, mode)
  }

  /** XRInterface.get_environment_blend_mode */
  final def getEnvironmentBlendMode(): Long = {
    if (gdext.classes.XRInterface.mb_get_environment_blend_mode == null) gdext.classes.XRInterface.mb_get_environment_blend_mode = MethodBind.get("XRInterface", "get_environment_blend_mode", 1984334071L)
    Ptrcall.call0[Long](gdext.classes.XRInterface.mb_get_environment_blend_mode, livePtr)
  }

}

object XRInterface {
  private[classes] var mb_get_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_capabilities: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_primary: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_primary: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_initialized: GDExtensionMethodBindPtr = null
  private[classes] var mb_initialize: GDExtensionMethodBindPtr = null
  private[classes] var mb_uninitialize: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tracking_status: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_render_target_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_view_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_trigger_haptic_pulse: GDExtensionMethodBindPtr = null
  private[classes] var mb_supports_play_area_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_play_area_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_play_area_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_anchor_detection_is_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_anchor_detection_is_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_camera_feed_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_passthrough_supported: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_passthrough_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_start_passthrough: GDExtensionMethodBindPtr = null
  private[classes] var mb_stop_passthrough: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_transform_for_view: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_projection_for_view: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_environment_blend_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_environment_blend_mode: GDExtensionMethodBindPtr = null
}
