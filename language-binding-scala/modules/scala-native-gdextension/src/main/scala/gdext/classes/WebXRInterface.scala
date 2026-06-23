package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `WebXRInterface`, extends `XRInterface`. */
abstract class WebXRInterface extends XRInterface {

  /** WebXRInterface.is_session_supported */
  final def isSessionSupported(session_mode: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("WebXRInterface", "is_session_supported", 83702148L), hostObject.objectPtr, session_mode)

  /** WebXRInterface.set_session_mode */
  final def setSessionMode(session_mode: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("WebXRInterface", "set_session_mode", 83702148L), hostObject.objectPtr, session_mode)

  /** WebXRInterface.get_session_mode */
  final def getSessionMode(): String =
    Ptrcall.call0[String](MethodBind.get("WebXRInterface", "get_session_mode", 201670096L), hostObject.objectPtr)

  /** WebXRInterface.set_required_features */
  final def setRequiredFeatures(required_features: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("WebXRInterface", "set_required_features", 83702148L), hostObject.objectPtr, required_features)

  /** WebXRInterface.get_required_features */
  final def getRequiredFeatures(): String =
    Ptrcall.call0[String](MethodBind.get("WebXRInterface", "get_required_features", 201670096L), hostObject.objectPtr)

  /** WebXRInterface.set_optional_features */
  final def setOptionalFeatures(optional_features: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("WebXRInterface", "set_optional_features", 83702148L), hostObject.objectPtr, optional_features)

  /** WebXRInterface.get_optional_features */
  final def getOptionalFeatures(): String =
    Ptrcall.call0[String](MethodBind.get("WebXRInterface", "get_optional_features", 201670096L), hostObject.objectPtr)

  /** WebXRInterface.get_reference_space_type */
  final def getReferenceSpaceType(): String =
    Ptrcall.call0[String](MethodBind.get("WebXRInterface", "get_reference_space_type", 201670096L), hostObject.objectPtr)

  /** WebXRInterface.get_enabled_features */
  final def getEnabledFeatures(): String =
    Ptrcall.call0[String](MethodBind.get("WebXRInterface", "get_enabled_features", 201670096L), hostObject.objectPtr)

  /** WebXRInterface.set_requested_reference_space_types */
  final def setRequestedReferenceSpaceTypes(requested_reference_space_types: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("WebXRInterface", "set_requested_reference_space_types", 83702148L), hostObject.objectPtr, requested_reference_space_types)

  /** WebXRInterface.get_requested_reference_space_types */
  final def getRequestedReferenceSpaceTypes(): String =
    Ptrcall.call0[String](MethodBind.get("WebXRInterface", "get_requested_reference_space_types", 201670096L), hostObject.objectPtr)

  /** WebXRInterface.is_input_source_active */
  final def isInputSourceActive(input_source_id: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("WebXRInterface", "is_input_source_active", 1116898809L), hostObject.objectPtr, input_source_id)

  /** WebXRInterface.get_input_source_tracker */
  final def getInputSourceTracker(input_source_id: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("WebXRInterface", "get_input_source_tracker", 399776966L), hostObject.objectPtr, input_source_id)

  /** WebXRInterface.get_input_source_target_ray_mode */
  final def getInputSourceTargetRayMode(input_source_id: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("WebXRInterface", "get_input_source_target_ray_mode", 2852387453L), hostObject.objectPtr, input_source_id)

  /** WebXRInterface.get_visibility_state */
  final def getVisibilityState(): String =
    Ptrcall.call0[String](MethodBind.get("WebXRInterface", "get_visibility_state", 201670096L), hostObject.objectPtr)

  /** WebXRInterface.get_display_refresh_rate */
  final def getDisplayRefreshRate(): Double =
    Ptrcall.call0[Double](MethodBind.get("WebXRInterface", "get_display_refresh_rate", 1740695150L), hostObject.objectPtr)

  /** WebXRInterface.set_display_refresh_rate */
  final def setDisplayRefreshRate(refresh_rate: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("WebXRInterface", "set_display_refresh_rate", 373806689L), hostObject.objectPtr, refresh_rate)

}

object WebXRInterface {
  /** Class metadata for Gd[WebXRInterface] lifetime management and casting. */
  given GodotClass[WebXRInterface] with {
    def className = "WebXRInterface"
    def isRefCounted = true
    def wrap(o: GodotObject): WebXRInterface = new WebXRInterface {}.withHost(o.objectPtr)
    def unwrap(t: WebXRInterface): GodotObject = t.hostObject
  }
}
