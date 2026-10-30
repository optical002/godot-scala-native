package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `XRInterface`, extends `RefCounted`. */
abstract class XRInterface extends RefCounted {
  override def godotClassName: String = "XRInterface"

  /** XRInterface.get_name */
  final def getName(): String = {
    if (gdext.classes.XRInterface.mb_get_name == null) gdext.classes.XRInterface.mb_get_name = MethodBind.get("XRInterface", "get_name", 2002593661L)
    Ptrcall.call0[SnArg](gdext.classes.XRInterface.mb_get_name, livePtr)
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
  final def getTrackingStatus(): gdext.classes.XRInterface.TrackingStatus = {
    if (gdext.classes.XRInterface.mb_get_tracking_status == null) gdext.classes.XRInterface.mb_get_tracking_status = MethodBind.get("XRInterface", "get_tracking_status", 167423259L)
    gdext.classes.XRInterface.TrackingStatus(Ptrcall.call0[Long](gdext.classes.XRInterface.mb_get_tracking_status, livePtr))
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
  final def triggerHapticPulse(actionName: String, trackerName: String, frequency: Double, amplitude: Double, durationSec: Double, delaySec: Double): Unit = {
    if (gdext.classes.XRInterface.mb_trigger_haptic_pulse == null) gdext.classes.XRInterface.mb_trigger_haptic_pulse = MethodBind.get("XRInterface", "trigger_haptic_pulse", 3752640163L)
    Ptrcall.callVoid6(gdext.classes.XRInterface.mb_trigger_haptic_pulse, livePtr, actionName, SnArg(trackerName), frequency, amplitude, durationSec, delaySec)
  }

  /** XRInterface.supports_play_area_mode */
  final def supportsPlayAreaMode(mode: gdext.classes.XRInterface.PlayAreaMode): Boolean = {
    if (gdext.classes.XRInterface.mb_supports_play_area_mode == null) gdext.classes.XRInterface.mb_supports_play_area_mode = MethodBind.get("XRInterface", "supports_play_area_mode", 3429955281L)
    Ptrcall.call1[Long, Boolean](gdext.classes.XRInterface.mb_supports_play_area_mode, livePtr, mode)
  }

  /** XRInterface.get_play_area_mode */
  final def getPlayAreaMode(): gdext.classes.XRInterface.PlayAreaMode = {
    if (gdext.classes.XRInterface.mb_get_play_area_mode == null) gdext.classes.XRInterface.mb_get_play_area_mode = MethodBind.get("XRInterface", "get_play_area_mode", 1615132885L)
    gdext.classes.XRInterface.PlayAreaMode(Ptrcall.call0[Long](gdext.classes.XRInterface.mb_get_play_area_mode, livePtr))
  }

  /** XRInterface.set_play_area_mode */
  final def setPlayAreaMode(mode: gdext.classes.XRInterface.PlayAreaMode): Boolean = {
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
  final def getTransformForView(view: Long, camTransform: gdext.builtin.Transform3D): gdext.builtin.Transform3D = {
    if (gdext.classes.XRInterface.mb_get_transform_for_view == null) gdext.classes.XRInterface.mb_get_transform_for_view = MethodBind.get("XRInterface", "get_transform_for_view", 518934792L)
    Ptrcall.call2[Long, gdext.builtin.Transform3D, gdext.builtin.Transform3D](gdext.classes.XRInterface.mb_get_transform_for_view, livePtr, view, camTransform)
  }

  /** XRInterface.get_projection_for_view */
  final def getProjectionForView(view: Long, aspect: Double, near: Double, far: Double): gdext.builtin.Projection = {
    if (gdext.classes.XRInterface.mb_get_projection_for_view == null) gdext.classes.XRInterface.mb_get_projection_for_view = MethodBind.get("XRInterface", "get_projection_for_view", 3766090294L)
    Ptrcall.call4[Long, Double, Double, Double, gdext.builtin.Projection](gdext.classes.XRInterface.mb_get_projection_for_view, livePtr, view, aspect, near, far)
  }

  /** XRInterface.set_environment_blend_mode */
  final def setEnvironmentBlendMode(mode: gdext.classes.XRInterface.EnvironmentBlendMode): Boolean = {
    if (gdext.classes.XRInterface.mb_set_environment_blend_mode == null) gdext.classes.XRInterface.mb_set_environment_blend_mode = MethodBind.get("XRInterface", "set_environment_blend_mode", 551152418L)
    Ptrcall.call1[Long, Boolean](gdext.classes.XRInterface.mb_set_environment_blend_mode, livePtr, mode)
  }

  /** XRInterface.get_environment_blend_mode */
  final def getEnvironmentBlendMode(): gdext.classes.XRInterface.EnvironmentBlendMode = {
    if (gdext.classes.XRInterface.mb_get_environment_blend_mode == null) gdext.classes.XRInterface.mb_get_environment_blend_mode = MethodBind.get("XRInterface", "get_environment_blend_mode", 1984334071L)
    gdext.classes.XRInterface.EnvironmentBlendMode(Ptrcall.call0[Long](gdext.classes.XRInterface.mb_get_environment_blend_mode, livePtr))
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

  /** Godot enum `XRInterface.Capabilities`. */
  opaque type Capabilities <: Long = Long

  object Capabilities {
    final val None: Capabilities = 0L.asInstanceOf[Capabilities]
    final val Mono: Capabilities = 1L.asInstanceOf[Capabilities]
    final val Stereo: Capabilities = 2L.asInstanceOf[Capabilities]
    final val Quad: Capabilities = 4L.asInstanceOf[Capabilities]
    final val Vr: Capabilities = 8L.asInstanceOf[Capabilities]
    final val Ar: Capabilities = 16L.asInstanceOf[Capabilities]
    final val External: Capabilities = 32L.asInstanceOf[Capabilities]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Capabilities = value.asInstanceOf[Capabilities]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Capabilities] = scala.IArray[Long](0L, 1L, 2L, 4L, 8L, 16L, 32L).asInstanceOf[scala.IArray[Capabilities]]

    extension (self: Capabilities)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "None"
        case 1L => "Mono"
        case 2L => "Stereo"
        case 4L => "Quad"
        case 8L => "Vr"
        case 16L => "Ar"
        case 32L => "External"
        case other => other.toString
      }
  }

  /** Godot enum `XRInterface.TrackingStatus`. */
  opaque type TrackingStatus <: Long = Long

  object TrackingStatus {
    final val NormalTracking: TrackingStatus = 0L.asInstanceOf[TrackingStatus]
    final val ExcessiveMotion: TrackingStatus = 1L.asInstanceOf[TrackingStatus]
    final val InsufficientFeatures: TrackingStatus = 2L.asInstanceOf[TrackingStatus]
    final val UnknownTracking: TrackingStatus = 3L.asInstanceOf[TrackingStatus]
    final val NotTracking: TrackingStatus = 4L.asInstanceOf[TrackingStatus]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): TrackingStatus = value.asInstanceOf[TrackingStatus]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[TrackingStatus] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L).asInstanceOf[scala.IArray[TrackingStatus]]

    extension (self: TrackingStatus)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "NormalTracking"
        case 1L => "ExcessiveMotion"
        case 2L => "InsufficientFeatures"
        case 3L => "UnknownTracking"
        case 4L => "NotTracking"
        case other => other.toString
      }
  }

  /** Godot enum `XRInterface.PlayAreaMode`. */
  opaque type PlayAreaMode <: Long = Long

  object PlayAreaMode {
    final val Unknown: PlayAreaMode = 0L.asInstanceOf[PlayAreaMode]
    final val Area3dof: PlayAreaMode = 1L.asInstanceOf[PlayAreaMode]
    final val Sitting: PlayAreaMode = 2L.asInstanceOf[PlayAreaMode]
    final val Roomscale: PlayAreaMode = 3L.asInstanceOf[PlayAreaMode]
    final val Stage: PlayAreaMode = 4L.asInstanceOf[PlayAreaMode]
    final val Custom: PlayAreaMode = 2147483647L.asInstanceOf[PlayAreaMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): PlayAreaMode = value.asInstanceOf[PlayAreaMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[PlayAreaMode] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 2147483647L).asInstanceOf[scala.IArray[PlayAreaMode]]

    extension (self: PlayAreaMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Unknown"
        case 1L => "Area3dof"
        case 2L => "Sitting"
        case 3L => "Roomscale"
        case 4L => "Stage"
        case 2147483647L => "Custom"
        case other => other.toString
      }
  }

  /** Godot enum `XRInterface.EnvironmentBlendMode`. */
  opaque type EnvironmentBlendMode <: Long = Long

  object EnvironmentBlendMode {
    final val Opaque: EnvironmentBlendMode = 0L.asInstanceOf[EnvironmentBlendMode]
    final val Additive: EnvironmentBlendMode = 1L.asInstanceOf[EnvironmentBlendMode]
    final val AlphaBlend: EnvironmentBlendMode = 2L.asInstanceOf[EnvironmentBlendMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): EnvironmentBlendMode = value.asInstanceOf[EnvironmentBlendMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[EnvironmentBlendMode] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[EnvironmentBlendMode]]

    extension (self: EnvironmentBlendMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Opaque"
        case 1L => "Additive"
        case 2L => "AlphaBlend"
        case other => other.toString
      }
  }

  /** Godot enum `XRInterface.VRSTextureFormat`. */
  opaque type VRSTextureFormat <: Long = Long

  object VRSTextureFormat {
    final val Unified: VRSTextureFormat = 0L.asInstanceOf[VRSTextureFormat]
    final val FragmentShadingRate: VRSTextureFormat = 1L.asInstanceOf[VRSTextureFormat]
    final val FragmentDensityMap: VRSTextureFormat = 2L.asInstanceOf[VRSTextureFormat]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): VRSTextureFormat = value.asInstanceOf[VRSTextureFormat]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[VRSTextureFormat] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[VRSTextureFormat]]

    extension (self: VRSTextureFormat)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Unified"
        case 1L => "FragmentShadingRate"
        case 2L => "FragmentDensityMap"
        case other => other.toString
      }
  }
}
