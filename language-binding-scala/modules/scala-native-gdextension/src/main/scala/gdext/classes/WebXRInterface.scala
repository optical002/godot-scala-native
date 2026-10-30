package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `WebXRInterface`, extends `XRInterface`. */
abstract class WebXRInterface extends XRInterface {
  override def godotClassName: String = "WebXRInterface"

  /** WebXRInterface.is_session_supported */
  final def isSessionSupported(sessionMode: String): Unit = {
    if (gdext.classes.WebXRInterface.mb_is_session_supported == null) gdext.classes.WebXRInterface.mb_is_session_supported = MethodBind.get("WebXRInterface", "is_session_supported", 83702148L)
    Ptrcall.callVoid1(gdext.classes.WebXRInterface.mb_is_session_supported, livePtr, sessionMode)
  }

  /** WebXRInterface.set_session_mode */
  final def setSessionMode(sessionMode: String): Unit = {
    if (gdext.classes.WebXRInterface.mb_set_session_mode == null) gdext.classes.WebXRInterface.mb_set_session_mode = MethodBind.get("WebXRInterface", "set_session_mode", 83702148L)
    Ptrcall.callVoid1(gdext.classes.WebXRInterface.mb_set_session_mode, livePtr, sessionMode)
  }

  /** WebXRInterface.get_session_mode */
  final def getSessionMode(): String = {
    if (gdext.classes.WebXRInterface.mb_get_session_mode == null) gdext.classes.WebXRInterface.mb_get_session_mode = MethodBind.get("WebXRInterface", "get_session_mode", 201670096L)
    Ptrcall.call0[String](gdext.classes.WebXRInterface.mb_get_session_mode, livePtr)
  }

  /** WebXRInterface.set_required_features */
  final def setRequiredFeatures(requiredFeatures: String): Unit = {
    if (gdext.classes.WebXRInterface.mb_set_required_features == null) gdext.classes.WebXRInterface.mb_set_required_features = MethodBind.get("WebXRInterface", "set_required_features", 83702148L)
    Ptrcall.callVoid1(gdext.classes.WebXRInterface.mb_set_required_features, livePtr, requiredFeatures)
  }

  /** WebXRInterface.get_required_features */
  final def getRequiredFeatures(): String = {
    if (gdext.classes.WebXRInterface.mb_get_required_features == null) gdext.classes.WebXRInterface.mb_get_required_features = MethodBind.get("WebXRInterface", "get_required_features", 201670096L)
    Ptrcall.call0[String](gdext.classes.WebXRInterface.mb_get_required_features, livePtr)
  }

  /** WebXRInterface.set_optional_features */
  final def setOptionalFeatures(optionalFeatures: String): Unit = {
    if (gdext.classes.WebXRInterface.mb_set_optional_features == null) gdext.classes.WebXRInterface.mb_set_optional_features = MethodBind.get("WebXRInterface", "set_optional_features", 83702148L)
    Ptrcall.callVoid1(gdext.classes.WebXRInterface.mb_set_optional_features, livePtr, optionalFeatures)
  }

  /** WebXRInterface.get_optional_features */
  final def getOptionalFeatures(): String = {
    if (gdext.classes.WebXRInterface.mb_get_optional_features == null) gdext.classes.WebXRInterface.mb_get_optional_features = MethodBind.get("WebXRInterface", "get_optional_features", 201670096L)
    Ptrcall.call0[String](gdext.classes.WebXRInterface.mb_get_optional_features, livePtr)
  }

  /** WebXRInterface.get_reference_space_type */
  final def getReferenceSpaceType(): String = {
    if (gdext.classes.WebXRInterface.mb_get_reference_space_type == null) gdext.classes.WebXRInterface.mb_get_reference_space_type = MethodBind.get("WebXRInterface", "get_reference_space_type", 201670096L)
    Ptrcall.call0[String](gdext.classes.WebXRInterface.mb_get_reference_space_type, livePtr)
  }

  /** WebXRInterface.get_enabled_features */
  final def getEnabledFeatures(): String = {
    if (gdext.classes.WebXRInterface.mb_get_enabled_features == null) gdext.classes.WebXRInterface.mb_get_enabled_features = MethodBind.get("WebXRInterface", "get_enabled_features", 201670096L)
    Ptrcall.call0[String](gdext.classes.WebXRInterface.mb_get_enabled_features, livePtr)
  }

  /** WebXRInterface.set_requested_reference_space_types */
  final def setRequestedReferenceSpaceTypes(requestedReferenceSpaceTypes: String): Unit = {
    if (gdext.classes.WebXRInterface.mb_set_requested_reference_space_types == null) gdext.classes.WebXRInterface.mb_set_requested_reference_space_types = MethodBind.get("WebXRInterface", "set_requested_reference_space_types", 83702148L)
    Ptrcall.callVoid1(gdext.classes.WebXRInterface.mb_set_requested_reference_space_types, livePtr, requestedReferenceSpaceTypes)
  }

  /** WebXRInterface.get_requested_reference_space_types */
  final def getRequestedReferenceSpaceTypes(): String = {
    if (gdext.classes.WebXRInterface.mb_get_requested_reference_space_types == null) gdext.classes.WebXRInterface.mb_get_requested_reference_space_types = MethodBind.get("WebXRInterface", "get_requested_reference_space_types", 201670096L)
    Ptrcall.call0[String](gdext.classes.WebXRInterface.mb_get_requested_reference_space_types, livePtr)
  }

  /** WebXRInterface.is_input_source_active */
  final def isInputSourceActive(inputSourceId: Long): Boolean = {
    if (gdext.classes.WebXRInterface.mb_is_input_source_active == null) gdext.classes.WebXRInterface.mb_is_input_source_active = MethodBind.get("WebXRInterface", "is_input_source_active", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.WebXRInterface.mb_is_input_source_active, livePtr, inputSourceId)
  }

  /** WebXRInterface.get_input_source_tracker. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getInputSourceTracker(inputSourceId: Long): XRControllerTracker = {
    if (gdext.classes.WebXRInterface.mb_get_input_source_tracker == null) gdext.classes.WebXRInterface.mb_get_input_source_tracker = MethodBind.get("WebXRInterface", "get_input_source_tracker", 399776966L)
    Wrappers.owned[XRControllerTracker](Ptrcall.call1[Long, Long](gdext.classes.WebXRInterface.mb_get_input_source_tracker, livePtr, inputSourceId))
  }

  /** WebXRInterface.get_input_source_target_ray_mode */
  final def getInputSourceTargetRayMode(inputSourceId: Long): gdext.classes.WebXRInterface.TargetRayMode = {
    if (gdext.classes.WebXRInterface.mb_get_input_source_target_ray_mode == null) gdext.classes.WebXRInterface.mb_get_input_source_target_ray_mode = MethodBind.get("WebXRInterface", "get_input_source_target_ray_mode", 2852387453L)
    gdext.classes.WebXRInterface.TargetRayMode(Ptrcall.call1[Long, Long](gdext.classes.WebXRInterface.mb_get_input_source_target_ray_mode, livePtr, inputSourceId))
  }

  /** WebXRInterface.get_visibility_state */
  final def getVisibilityState(): String = {
    if (gdext.classes.WebXRInterface.mb_get_visibility_state == null) gdext.classes.WebXRInterface.mb_get_visibility_state = MethodBind.get("WebXRInterface", "get_visibility_state", 201670096L)
    Ptrcall.call0[String](gdext.classes.WebXRInterface.mb_get_visibility_state, livePtr)
  }

  /** WebXRInterface.get_display_refresh_rate */
  final def getDisplayRefreshRate(): Double = {
    if (gdext.classes.WebXRInterface.mb_get_display_refresh_rate == null) gdext.classes.WebXRInterface.mb_get_display_refresh_rate = MethodBind.get("WebXRInterface", "get_display_refresh_rate", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.WebXRInterface.mb_get_display_refresh_rate, livePtr)
  }

  /** WebXRInterface.set_display_refresh_rate */
  final def setDisplayRefreshRate(refreshRate: Double): Unit = {
    if (gdext.classes.WebXRInterface.mb_set_display_refresh_rate == null) gdext.classes.WebXRInterface.mb_set_display_refresh_rate = MethodBind.get("WebXRInterface", "set_display_refresh_rate", 373806689L)
    Ptrcall.callVoid1(gdext.classes.WebXRInterface.mb_set_display_refresh_rate, livePtr, refreshRate)
  }

}

object WebXRInterface {
  private[classes] var mb_is_session_supported: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_session_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_session_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_required_features: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_required_features: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_optional_features: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_optional_features: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_reference_space_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_enabled_features: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_requested_reference_space_types: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_requested_reference_space_types: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_input_source_active: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_input_source_tracker: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_input_source_target_ray_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_visibility_state: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_display_refresh_rate: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_display_refresh_rate: GDExtensionMethodBindPtr = null

  /** Godot enum `WebXRInterface.TargetRayMode`. */
  opaque type TargetRayMode <: Long = Long

  object TargetRayMode {
    final val Unknown: TargetRayMode = 0L.asInstanceOf[TargetRayMode]
    final val Gaze: TargetRayMode = 1L.asInstanceOf[TargetRayMode]
    final val TrackedPointer: TargetRayMode = 2L.asInstanceOf[TargetRayMode]
    final val Screen: TargetRayMode = 3L.asInstanceOf[TargetRayMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): TargetRayMode = value.asInstanceOf[TargetRayMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[TargetRayMode] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[TargetRayMode]]

    extension (self: TargetRayMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Unknown"
        case 1L => "Gaze"
        case 2L => "TrackedPointer"
        case 3L => "Screen"
        case other => other.toString
      }
  }
}
