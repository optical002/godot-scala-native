package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `WebXRInterface`, extends `XRInterface`. */
abstract class WebXRInterface extends XRInterface {
  override def godotClassName: String = "WebXRInterface"

  /** WebXRInterface.is_session_supported */
  final def isSessionSupported(session_mode: String): Unit = {
    if (gdext.classes.WebXRInterface.mb_is_session_supported == null) gdext.classes.WebXRInterface.mb_is_session_supported = MethodBind.get("WebXRInterface", "is_session_supported", 83702148L)
    Ptrcall.callVoid1(gdext.classes.WebXRInterface.mb_is_session_supported, livePtr, session_mode)
  }

  /** WebXRInterface.set_session_mode */
  final def setSessionMode(session_mode: String): Unit = {
    if (gdext.classes.WebXRInterface.mb_set_session_mode == null) gdext.classes.WebXRInterface.mb_set_session_mode = MethodBind.get("WebXRInterface", "set_session_mode", 83702148L)
    Ptrcall.callVoid1(gdext.classes.WebXRInterface.mb_set_session_mode, livePtr, session_mode)
  }

  /** WebXRInterface.get_session_mode */
  final def getSessionMode(): String = {
    if (gdext.classes.WebXRInterface.mb_get_session_mode == null) gdext.classes.WebXRInterface.mb_get_session_mode = MethodBind.get("WebXRInterface", "get_session_mode", 201670096L)
    Ptrcall.call0[String](gdext.classes.WebXRInterface.mb_get_session_mode, livePtr)
  }

  /** WebXRInterface.set_required_features */
  final def setRequiredFeatures(required_features: String): Unit = {
    if (gdext.classes.WebXRInterface.mb_set_required_features == null) gdext.classes.WebXRInterface.mb_set_required_features = MethodBind.get("WebXRInterface", "set_required_features", 83702148L)
    Ptrcall.callVoid1(gdext.classes.WebXRInterface.mb_set_required_features, livePtr, required_features)
  }

  /** WebXRInterface.get_required_features */
  final def getRequiredFeatures(): String = {
    if (gdext.classes.WebXRInterface.mb_get_required_features == null) gdext.classes.WebXRInterface.mb_get_required_features = MethodBind.get("WebXRInterface", "get_required_features", 201670096L)
    Ptrcall.call0[String](gdext.classes.WebXRInterface.mb_get_required_features, livePtr)
  }

  /** WebXRInterface.set_optional_features */
  final def setOptionalFeatures(optional_features: String): Unit = {
    if (gdext.classes.WebXRInterface.mb_set_optional_features == null) gdext.classes.WebXRInterface.mb_set_optional_features = MethodBind.get("WebXRInterface", "set_optional_features", 83702148L)
    Ptrcall.callVoid1(gdext.classes.WebXRInterface.mb_set_optional_features, livePtr, optional_features)
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
  final def setRequestedReferenceSpaceTypes(requested_reference_space_types: String): Unit = {
    if (gdext.classes.WebXRInterface.mb_set_requested_reference_space_types == null) gdext.classes.WebXRInterface.mb_set_requested_reference_space_types = MethodBind.get("WebXRInterface", "set_requested_reference_space_types", 83702148L)
    Ptrcall.callVoid1(gdext.classes.WebXRInterface.mb_set_requested_reference_space_types, livePtr, requested_reference_space_types)
  }

  /** WebXRInterface.get_requested_reference_space_types */
  final def getRequestedReferenceSpaceTypes(): String = {
    if (gdext.classes.WebXRInterface.mb_get_requested_reference_space_types == null) gdext.classes.WebXRInterface.mb_get_requested_reference_space_types = MethodBind.get("WebXRInterface", "get_requested_reference_space_types", 201670096L)
    Ptrcall.call0[String](gdext.classes.WebXRInterface.mb_get_requested_reference_space_types, livePtr)
  }

  /** WebXRInterface.is_input_source_active */
  final def isInputSourceActive(input_source_id: Long): Boolean = {
    if (gdext.classes.WebXRInterface.mb_is_input_source_active == null) gdext.classes.WebXRInterface.mb_is_input_source_active = MethodBind.get("WebXRInterface", "is_input_source_active", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.WebXRInterface.mb_is_input_source_active, livePtr, input_source_id)
  }

  /** WebXRInterface.get_input_source_tracker. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getInputSourceTracker(input_source_id: Long): XRControllerTracker = {
    if (gdext.classes.WebXRInterface.mb_get_input_source_tracker == null) gdext.classes.WebXRInterface.mb_get_input_source_tracker = MethodBind.get("WebXRInterface", "get_input_source_tracker", 399776966L)
    Wrappers.owned[XRControllerTracker](Ptrcall.call1[Long, Long](gdext.classes.WebXRInterface.mb_get_input_source_tracker, livePtr, input_source_id))
  }

  /** WebXRInterface.get_input_source_target_ray_mode */
  final def getInputSourceTargetRayMode(input_source_id: Long): Long = {
    if (gdext.classes.WebXRInterface.mb_get_input_source_target_ray_mode == null) gdext.classes.WebXRInterface.mb_get_input_source_target_ray_mode = MethodBind.get("WebXRInterface", "get_input_source_target_ray_mode", 2852387453L)
    Ptrcall.call1[Long, Long](gdext.classes.WebXRInterface.mb_get_input_source_target_ray_mode, livePtr, input_source_id)
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
  final def setDisplayRefreshRate(refresh_rate: Double): Unit = {
    if (gdext.classes.WebXRInterface.mb_set_display_refresh_rate == null) gdext.classes.WebXRInterface.mb_set_display_refresh_rate = MethodBind.get("WebXRInterface", "set_display_refresh_rate", 373806689L)
    Ptrcall.callVoid1(gdext.classes.WebXRInterface.mb_set_display_refresh_rate, livePtr, refresh_rate)
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
}
