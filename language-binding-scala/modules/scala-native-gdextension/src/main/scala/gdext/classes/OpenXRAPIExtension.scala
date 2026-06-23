package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRAPIExtension`, extends `RefCounted`. */
abstract class OpenXRAPIExtension extends RefCounted {

  /** OpenXRAPIExtension.get_openxr_version */
  final def getOpenxrVersion(): Long =
    Ptrcall.call0[Long](MethodBind.get("OpenXRAPIExtension", "get_openxr_version", 2455072627L), hostObject.objectPtr)

  /** OpenXRAPIExtension.get_instance */
  final def getInstance(): Long =
    Ptrcall.call0[Long](MethodBind.get("OpenXRAPIExtension", "get_instance", 2455072627L), hostObject.objectPtr)

  /** OpenXRAPIExtension.get_system_id */
  final def getSystemId(): Long =
    Ptrcall.call0[Long](MethodBind.get("OpenXRAPIExtension", "get_system_id", 2455072627L), hostObject.objectPtr)

  /** OpenXRAPIExtension.get_session */
  final def getSession(): Long =
    Ptrcall.call0[Long](MethodBind.get("OpenXRAPIExtension", "get_session", 2455072627L), hostObject.objectPtr)

  /** OpenXRAPIExtension.get_instance_proc_addr */
  final def getInstanceProcAddr(name: String): Long =
    Ptrcall.call1[String, Long](MethodBind.get("OpenXRAPIExtension", "get_instance_proc_addr", 1597066294L), hostObject.objectPtr, name)

  /** OpenXRAPIExtension.get_error_string */
  final def getErrorString(result: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("OpenXRAPIExtension", "get_error_string", 990163283L), hostObject.objectPtr, result)

  /** OpenXRAPIExtension.get_swapchain_format_name */
  final def getSwapchainFormatName(swapchain_format: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("OpenXRAPIExtension", "get_swapchain_format_name", 990163283L), hostObject.objectPtr, swapchain_format)

  /** OpenXRAPIExtension.set_object_name */
  final def setObjectName(object_type: Long, object_handle: Long, object_name: String): Unit =
    Ptrcall.callVoid3(MethodBind.get("OpenXRAPIExtension", "set_object_name", 2285447957L), hostObject.objectPtr, object_type, object_handle, object_name)

  /** OpenXRAPIExtension.begin_debug_label_region */
  final def beginDebugLabelRegion(label_name: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRAPIExtension", "begin_debug_label_region", 83702148L), hostObject.objectPtr, label_name)

  /** OpenXRAPIExtension.end_debug_label_region */
  final def endDebugLabelRegion(): Unit =
    Ptrcall.callVoid0(MethodBind.get("OpenXRAPIExtension", "end_debug_label_region", 3218959716L), hostObject.objectPtr)

  /** OpenXRAPIExtension.insert_debug_label */
  final def insertDebugLabel(label_name: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRAPIExtension", "insert_debug_label", 83702148L), hostObject.objectPtr, label_name)

  /** OpenXRAPIExtension.is_initialized */
  final def isInitialized(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("OpenXRAPIExtension", "is_initialized", 2240911060L), hostObject.objectPtr)

  /** OpenXRAPIExtension.is_running */
  final def isRunning(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("OpenXRAPIExtension", "is_running", 2240911060L), hostObject.objectPtr)

  /** OpenXRAPIExtension.get_play_space */
  final def getPlaySpace(): Long =
    Ptrcall.call0[Long](MethodBind.get("OpenXRAPIExtension", "get_play_space", 2455072627L), hostObject.objectPtr)

  /** OpenXRAPIExtension.get_predicted_display_time */
  final def getPredictedDisplayTime(): Long =
    Ptrcall.call0[Long](MethodBind.get("OpenXRAPIExtension", "get_predicted_display_time", 2455072627L), hostObject.objectPtr)

  /** OpenXRAPIExtension.get_next_frame_time */
  final def getNextFrameTime(): Long =
    Ptrcall.call0[Long](MethodBind.get("OpenXRAPIExtension", "get_next_frame_time", 2455072627L), hostObject.objectPtr)

  /** OpenXRAPIExtension.can_render */
  final def canRender(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("OpenXRAPIExtension", "can_render", 2240911060L), hostObject.objectPtr)

  /** OpenXRAPIExtension.get_hand_tracker */
  final def getHandTracker(hand_index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("OpenXRAPIExtension", "get_hand_tracker", 3744713108L), hostObject.objectPtr, hand_index)

  /** OpenXRAPIExtension.register_composition_layer_provider */
  final def registerCompositionLayerProvider(extension: OpenXRExtensionWrapper): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRAPIExtension", "register_composition_layer_provider", 1477360496L), hostObject.objectPtr, extension.hostObject)

  /** OpenXRAPIExtension.unregister_composition_layer_provider */
  final def unregisterCompositionLayerProvider(extension: OpenXRExtensionWrapper): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRAPIExtension", "unregister_composition_layer_provider", 1477360496L), hostObject.objectPtr, extension.hostObject)

  /** OpenXRAPIExtension.register_projection_views_extension */
  final def registerProjectionViewsExtension(extension: OpenXRExtensionWrapper): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRAPIExtension", "register_projection_views_extension", 1477360496L), hostObject.objectPtr, extension.hostObject)

  /** OpenXRAPIExtension.unregister_projection_views_extension */
  final def unregisterProjectionViewsExtension(extension: OpenXRExtensionWrapper): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRAPIExtension", "unregister_projection_views_extension", 1477360496L), hostObject.objectPtr, extension.hostObject)

  /** OpenXRAPIExtension.register_frame_info_extension */
  final def registerFrameInfoExtension(extension: OpenXRExtensionWrapper): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRAPIExtension", "register_frame_info_extension", 1477360496L), hostObject.objectPtr, extension.hostObject)

  /** OpenXRAPIExtension.unregister_frame_info_extension */
  final def unregisterFrameInfoExtension(extension: OpenXRExtensionWrapper): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRAPIExtension", "unregister_frame_info_extension", 1477360496L), hostObject.objectPtr, extension.hostObject)

  /** OpenXRAPIExtension.get_render_state_z_near */
  final def getRenderStateZNear(): Double =
    Ptrcall.call0[Double](MethodBind.get("OpenXRAPIExtension", "get_render_state_z_near", 191475506L), hostObject.objectPtr)

  /** OpenXRAPIExtension.get_render_state_z_far */
  final def getRenderStateZFar(): Double =
    Ptrcall.call0[Double](MethodBind.get("OpenXRAPIExtension", "get_render_state_z_far", 191475506L), hostObject.objectPtr)

  /** OpenXRAPIExtension.set_velocity_target_size */
  final def setVelocityTargetSize(target_size: gdext.builtin.Vector2i): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRAPIExtension", "set_velocity_target_size", 1130785943L), hostObject.objectPtr, target_size)

  /** OpenXRAPIExtension.openxr_swapchain_free */
  final def openxrSwapchainFree(swapchain: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRAPIExtension", "openxr_swapchain_free", 1286410249L), hostObject.objectPtr, swapchain)

  /** OpenXRAPIExtension.openxr_swapchain_get_swapchain */
  final def openxrSwapchainGetSwapchain(swapchain: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("OpenXRAPIExtension", "openxr_swapchain_get_swapchain", 3744713108L), hostObject.objectPtr, swapchain)

  /** OpenXRAPIExtension.openxr_swapchain_acquire */
  final def openxrSwapchainAcquire(swapchain: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRAPIExtension", "openxr_swapchain_acquire", 1286410249L), hostObject.objectPtr, swapchain)

  /** OpenXRAPIExtension.openxr_swapchain_release */
  final def openxrSwapchainRelease(swapchain: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRAPIExtension", "openxr_swapchain_release", 1286410249L), hostObject.objectPtr, swapchain)

  /** OpenXRAPIExtension.get_projection_layer */
  final def getProjectionLayer(): Long =
    Ptrcall.call0[Long](MethodBind.get("OpenXRAPIExtension", "get_projection_layer", 2455072627L), hostObject.objectPtr)

  /** OpenXRAPIExtension.set_render_region */
  final def setRenderRegion(render_region: gdext.builtin.Rect2i): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRAPIExtension", "set_render_region", 1763793166L), hostObject.objectPtr, render_region)

  /** OpenXRAPIExtension.set_emulate_environment_blend_mode_alpha_blend */
  final def setEmulateEnvironmentBlendModeAlphaBlend(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRAPIExtension", "set_emulate_environment_blend_mode_alpha_blend", 2586408642L), hostObject.objectPtr, enabled)

  /** OpenXRAPIExtension.is_environment_blend_mode_alpha_supported */
  final def isEnvironmentBlendModeAlphaSupported(): Long =
    Ptrcall.call0[Long](MethodBind.get("OpenXRAPIExtension", "is_environment_blend_mode_alpha_supported", 1579290861L), hostObject.objectPtr)

  /** OpenXRAPIExtension.update_main_swapchain_size */
  final def updateMainSwapchainSize(): Unit =
    Ptrcall.callVoid0(MethodBind.get("OpenXRAPIExtension", "update_main_swapchain_size", 3218959716L), hostObject.objectPtr)

}

object OpenXRAPIExtension {
  /** Class metadata for Gd[OpenXRAPIExtension] lifetime management and casting. */
  given GodotClass[OpenXRAPIExtension] with {
    def className = "OpenXRAPIExtension"
    def isRefCounted = true
    def wrap(o: GodotObject): OpenXRAPIExtension = new OpenXRAPIExtension {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRAPIExtension): GodotObject = t.hostObject
  }
}
