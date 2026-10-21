package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OpenXRAPIExtension`, extends `RefCounted`. */
abstract class OpenXRAPIExtension extends RefCounted {
  override def godotClassName: String = "OpenXRAPIExtension"

  /** OpenXRAPIExtension.get_openxr_version */
  final def getOpenxrVersion(): Long = {
    if (gdext.classes.OpenXRAPIExtension.mb_get_openxr_version == null) gdext.classes.OpenXRAPIExtension.mb_get_openxr_version = MethodBind.get("OpenXRAPIExtension", "get_openxr_version", 2455072627L)
    Ptrcall.call0[Long](gdext.classes.OpenXRAPIExtension.mb_get_openxr_version, livePtr)
  }

  /** OpenXRAPIExtension.get_instance */
  final def getInstance(): Long = {
    if (gdext.classes.OpenXRAPIExtension.mb_get_instance == null) gdext.classes.OpenXRAPIExtension.mb_get_instance = MethodBind.get("OpenXRAPIExtension", "get_instance", 2455072627L)
    Ptrcall.call0[Long](gdext.classes.OpenXRAPIExtension.mb_get_instance, livePtr)
  }

  /** OpenXRAPIExtension.get_system_id */
  final def getSystemId(): Long = {
    if (gdext.classes.OpenXRAPIExtension.mb_get_system_id == null) gdext.classes.OpenXRAPIExtension.mb_get_system_id = MethodBind.get("OpenXRAPIExtension", "get_system_id", 2455072627L)
    Ptrcall.call0[Long](gdext.classes.OpenXRAPIExtension.mb_get_system_id, livePtr)
  }

  /** OpenXRAPIExtension.get_session */
  final def getSession(): Long = {
    if (gdext.classes.OpenXRAPIExtension.mb_get_session == null) gdext.classes.OpenXRAPIExtension.mb_get_session = MethodBind.get("OpenXRAPIExtension", "get_session", 2455072627L)
    Ptrcall.call0[Long](gdext.classes.OpenXRAPIExtension.mb_get_session, livePtr)
  }

  /** OpenXRAPIExtension.get_instance_proc_addr */
  final def getInstanceProcAddr(name: String): Long = {
    if (gdext.classes.OpenXRAPIExtension.mb_get_instance_proc_addr == null) gdext.classes.OpenXRAPIExtension.mb_get_instance_proc_addr = MethodBind.get("OpenXRAPIExtension", "get_instance_proc_addr", 1597066294L)
    Ptrcall.call1[String, Long](gdext.classes.OpenXRAPIExtension.mb_get_instance_proc_addr, livePtr, name)
  }

  /** OpenXRAPIExtension.get_error_string */
  final def getErrorString(result: Long): String = {
    if (gdext.classes.OpenXRAPIExtension.mb_get_error_string == null) gdext.classes.OpenXRAPIExtension.mb_get_error_string = MethodBind.get("OpenXRAPIExtension", "get_error_string", 990163283L)
    Ptrcall.call1[Long, String](gdext.classes.OpenXRAPIExtension.mb_get_error_string, livePtr, result)
  }

  /** OpenXRAPIExtension.get_swapchain_format_name */
  final def getSwapchainFormatName(swapchain_format: Long): String = {
    if (gdext.classes.OpenXRAPIExtension.mb_get_swapchain_format_name == null) gdext.classes.OpenXRAPIExtension.mb_get_swapchain_format_name = MethodBind.get("OpenXRAPIExtension", "get_swapchain_format_name", 990163283L)
    Ptrcall.call1[Long, String](gdext.classes.OpenXRAPIExtension.mb_get_swapchain_format_name, livePtr, swapchain_format)
  }

  /** OpenXRAPIExtension.set_object_name */
  final def setObjectName(object_type: Long, object_handle: Long, object_name: String): Unit = {
    if (gdext.classes.OpenXRAPIExtension.mb_set_object_name == null) gdext.classes.OpenXRAPIExtension.mb_set_object_name = MethodBind.get("OpenXRAPIExtension", "set_object_name", 2285447957L)
    Ptrcall.callVoid3(gdext.classes.OpenXRAPIExtension.mb_set_object_name, livePtr, object_type, object_handle, object_name)
  }

  /** OpenXRAPIExtension.begin_debug_label_region */
  final def beginDebugLabelRegion(label_name: String): Unit = {
    if (gdext.classes.OpenXRAPIExtension.mb_begin_debug_label_region == null) gdext.classes.OpenXRAPIExtension.mb_begin_debug_label_region = MethodBind.get("OpenXRAPIExtension", "begin_debug_label_region", 83702148L)
    Ptrcall.callVoid1(gdext.classes.OpenXRAPIExtension.mb_begin_debug_label_region, livePtr, label_name)
  }

  /** OpenXRAPIExtension.end_debug_label_region */
  final def endDebugLabelRegion(): Unit = {
    if (gdext.classes.OpenXRAPIExtension.mb_end_debug_label_region == null) gdext.classes.OpenXRAPIExtension.mb_end_debug_label_region = MethodBind.get("OpenXRAPIExtension", "end_debug_label_region", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.OpenXRAPIExtension.mb_end_debug_label_region, livePtr)
  }

  /** OpenXRAPIExtension.insert_debug_label */
  final def insertDebugLabel(label_name: String): Unit = {
    if (gdext.classes.OpenXRAPIExtension.mb_insert_debug_label == null) gdext.classes.OpenXRAPIExtension.mb_insert_debug_label = MethodBind.get("OpenXRAPIExtension", "insert_debug_label", 83702148L)
    Ptrcall.callVoid1(gdext.classes.OpenXRAPIExtension.mb_insert_debug_label, livePtr, label_name)
  }

  /** OpenXRAPIExtension.is_initialized */
  final def isInitialized(): Boolean = {
    if (gdext.classes.OpenXRAPIExtension.mb_is_initialized == null) gdext.classes.OpenXRAPIExtension.mb_is_initialized = MethodBind.get("OpenXRAPIExtension", "is_initialized", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.OpenXRAPIExtension.mb_is_initialized, livePtr)
  }

  /** OpenXRAPIExtension.is_running */
  final def isRunning(): Boolean = {
    if (gdext.classes.OpenXRAPIExtension.mb_is_running == null) gdext.classes.OpenXRAPIExtension.mb_is_running = MethodBind.get("OpenXRAPIExtension", "is_running", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.OpenXRAPIExtension.mb_is_running, livePtr)
  }

  /** OpenXRAPIExtension.get_play_space */
  final def getPlaySpace(): Long = {
    if (gdext.classes.OpenXRAPIExtension.mb_get_play_space == null) gdext.classes.OpenXRAPIExtension.mb_get_play_space = MethodBind.get("OpenXRAPIExtension", "get_play_space", 2455072627L)
    Ptrcall.call0[Long](gdext.classes.OpenXRAPIExtension.mb_get_play_space, livePtr)
  }

  /** OpenXRAPIExtension.get_predicted_display_time */
  final def getPredictedDisplayTime(): Long = {
    if (gdext.classes.OpenXRAPIExtension.mb_get_predicted_display_time == null) gdext.classes.OpenXRAPIExtension.mb_get_predicted_display_time = MethodBind.get("OpenXRAPIExtension", "get_predicted_display_time", 2455072627L)
    Ptrcall.call0[Long](gdext.classes.OpenXRAPIExtension.mb_get_predicted_display_time, livePtr)
  }

  /** OpenXRAPIExtension.get_next_frame_time */
  final def getNextFrameTime(): Long = {
    if (gdext.classes.OpenXRAPIExtension.mb_get_next_frame_time == null) gdext.classes.OpenXRAPIExtension.mb_get_next_frame_time = MethodBind.get("OpenXRAPIExtension", "get_next_frame_time", 2455072627L)
    Ptrcall.call0[Long](gdext.classes.OpenXRAPIExtension.mb_get_next_frame_time, livePtr)
  }

  /** OpenXRAPIExtension.can_render */
  final def canRender(): Boolean = {
    if (gdext.classes.OpenXRAPIExtension.mb_can_render == null) gdext.classes.OpenXRAPIExtension.mb_can_render = MethodBind.get("OpenXRAPIExtension", "can_render", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.OpenXRAPIExtension.mb_can_render, livePtr)
  }

  /** OpenXRAPIExtension.get_hand_tracker */
  final def getHandTracker(hand_index: Long): Long = {
    if (gdext.classes.OpenXRAPIExtension.mb_get_hand_tracker == null) gdext.classes.OpenXRAPIExtension.mb_get_hand_tracker = MethodBind.get("OpenXRAPIExtension", "get_hand_tracker", 3744713108L)
    Ptrcall.call1[Long, Long](gdext.classes.OpenXRAPIExtension.mb_get_hand_tracker, livePtr, hand_index)
  }

  /** OpenXRAPIExtension.register_composition_layer_provider */
  final def registerCompositionLayerProvider(extension: OpenXRExtensionWrapper): Unit = {
    if (gdext.classes.OpenXRAPIExtension.mb_register_composition_layer_provider == null) gdext.classes.OpenXRAPIExtension.mb_register_composition_layer_provider = MethodBind.get("OpenXRAPIExtension", "register_composition_layer_provider", 1477360496L)
    Ptrcall.callVoid1(gdext.classes.OpenXRAPIExtension.mb_register_composition_layer_provider, livePtr, Wrappers.handle(extension))
  }

  /** OpenXRAPIExtension.unregister_composition_layer_provider */
  final def unregisterCompositionLayerProvider(extension: OpenXRExtensionWrapper): Unit = {
    if (gdext.classes.OpenXRAPIExtension.mb_unregister_composition_layer_provider == null) gdext.classes.OpenXRAPIExtension.mb_unregister_composition_layer_provider = MethodBind.get("OpenXRAPIExtension", "unregister_composition_layer_provider", 1477360496L)
    Ptrcall.callVoid1(gdext.classes.OpenXRAPIExtension.mb_unregister_composition_layer_provider, livePtr, Wrappers.handle(extension))
  }

  /** OpenXRAPIExtension.register_projection_views_extension */
  final def registerProjectionViewsExtension(extension: OpenXRExtensionWrapper): Unit = {
    if (gdext.classes.OpenXRAPIExtension.mb_register_projection_views_extension == null) gdext.classes.OpenXRAPIExtension.mb_register_projection_views_extension = MethodBind.get("OpenXRAPIExtension", "register_projection_views_extension", 1477360496L)
    Ptrcall.callVoid1(gdext.classes.OpenXRAPIExtension.mb_register_projection_views_extension, livePtr, Wrappers.handle(extension))
  }

  /** OpenXRAPIExtension.unregister_projection_views_extension */
  final def unregisterProjectionViewsExtension(extension: OpenXRExtensionWrapper): Unit = {
    if (gdext.classes.OpenXRAPIExtension.mb_unregister_projection_views_extension == null) gdext.classes.OpenXRAPIExtension.mb_unregister_projection_views_extension = MethodBind.get("OpenXRAPIExtension", "unregister_projection_views_extension", 1477360496L)
    Ptrcall.callVoid1(gdext.classes.OpenXRAPIExtension.mb_unregister_projection_views_extension, livePtr, Wrappers.handle(extension))
  }

  /** OpenXRAPIExtension.register_frame_info_extension */
  final def registerFrameInfoExtension(extension: OpenXRExtensionWrapper): Unit = {
    if (gdext.classes.OpenXRAPIExtension.mb_register_frame_info_extension == null) gdext.classes.OpenXRAPIExtension.mb_register_frame_info_extension = MethodBind.get("OpenXRAPIExtension", "register_frame_info_extension", 1477360496L)
    Ptrcall.callVoid1(gdext.classes.OpenXRAPIExtension.mb_register_frame_info_extension, livePtr, Wrappers.handle(extension))
  }

  /** OpenXRAPIExtension.unregister_frame_info_extension */
  final def unregisterFrameInfoExtension(extension: OpenXRExtensionWrapper): Unit = {
    if (gdext.classes.OpenXRAPIExtension.mb_unregister_frame_info_extension == null) gdext.classes.OpenXRAPIExtension.mb_unregister_frame_info_extension = MethodBind.get("OpenXRAPIExtension", "unregister_frame_info_extension", 1477360496L)
    Ptrcall.callVoid1(gdext.classes.OpenXRAPIExtension.mb_unregister_frame_info_extension, livePtr, Wrappers.handle(extension))
  }

  /** OpenXRAPIExtension.get_render_state_z_near */
  final def getRenderStateZNear(): Double = {
    if (gdext.classes.OpenXRAPIExtension.mb_get_render_state_z_near == null) gdext.classes.OpenXRAPIExtension.mb_get_render_state_z_near = MethodBind.get("OpenXRAPIExtension", "get_render_state_z_near", 191475506L)
    Ptrcall.call0[Double](gdext.classes.OpenXRAPIExtension.mb_get_render_state_z_near, livePtr)
  }

  /** OpenXRAPIExtension.get_render_state_z_far */
  final def getRenderStateZFar(): Double = {
    if (gdext.classes.OpenXRAPIExtension.mb_get_render_state_z_far == null) gdext.classes.OpenXRAPIExtension.mb_get_render_state_z_far = MethodBind.get("OpenXRAPIExtension", "get_render_state_z_far", 191475506L)
    Ptrcall.call0[Double](gdext.classes.OpenXRAPIExtension.mb_get_render_state_z_far, livePtr)
  }

  /** OpenXRAPIExtension.set_velocity_target_size */
  final def setVelocityTargetSize(target_size: gdext.builtin.Vector2i): Unit = {
    if (gdext.classes.OpenXRAPIExtension.mb_set_velocity_target_size == null) gdext.classes.OpenXRAPIExtension.mb_set_velocity_target_size = MethodBind.get("OpenXRAPIExtension", "set_velocity_target_size", 1130785943L)
    Ptrcall.callVoid1(gdext.classes.OpenXRAPIExtension.mb_set_velocity_target_size, livePtr, target_size)
  }

  /** OpenXRAPIExtension.openxr_swapchain_free */
  final def openxrSwapchainFree(swapchain: Long): Unit = {
    if (gdext.classes.OpenXRAPIExtension.mb_openxr_swapchain_free == null) gdext.classes.OpenXRAPIExtension.mb_openxr_swapchain_free = MethodBind.get("OpenXRAPIExtension", "openxr_swapchain_free", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.OpenXRAPIExtension.mb_openxr_swapchain_free, livePtr, swapchain)
  }

  /** OpenXRAPIExtension.openxr_swapchain_get_swapchain */
  final def openxrSwapchainGetSwapchain(swapchain: Long): Long = {
    if (gdext.classes.OpenXRAPIExtension.mb_openxr_swapchain_get_swapchain == null) gdext.classes.OpenXRAPIExtension.mb_openxr_swapchain_get_swapchain = MethodBind.get("OpenXRAPIExtension", "openxr_swapchain_get_swapchain", 3744713108L)
    Ptrcall.call1[Long, Long](gdext.classes.OpenXRAPIExtension.mb_openxr_swapchain_get_swapchain, livePtr, swapchain)
  }

  /** OpenXRAPIExtension.openxr_swapchain_acquire */
  final def openxrSwapchainAcquire(swapchain: Long): Unit = {
    if (gdext.classes.OpenXRAPIExtension.mb_openxr_swapchain_acquire == null) gdext.classes.OpenXRAPIExtension.mb_openxr_swapchain_acquire = MethodBind.get("OpenXRAPIExtension", "openxr_swapchain_acquire", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.OpenXRAPIExtension.mb_openxr_swapchain_acquire, livePtr, swapchain)
  }

  /** OpenXRAPIExtension.openxr_swapchain_release */
  final def openxrSwapchainRelease(swapchain: Long): Unit = {
    if (gdext.classes.OpenXRAPIExtension.mb_openxr_swapchain_release == null) gdext.classes.OpenXRAPIExtension.mb_openxr_swapchain_release = MethodBind.get("OpenXRAPIExtension", "openxr_swapchain_release", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.OpenXRAPIExtension.mb_openxr_swapchain_release, livePtr, swapchain)
  }

  /** OpenXRAPIExtension.get_projection_layer */
  final def getProjectionLayer(): Long = {
    if (gdext.classes.OpenXRAPIExtension.mb_get_projection_layer == null) gdext.classes.OpenXRAPIExtension.mb_get_projection_layer = MethodBind.get("OpenXRAPIExtension", "get_projection_layer", 2455072627L)
    Ptrcall.call0[Long](gdext.classes.OpenXRAPIExtension.mb_get_projection_layer, livePtr)
  }

  /** OpenXRAPIExtension.set_render_region */
  final def setRenderRegion(render_region: gdext.builtin.Rect2i): Unit = {
    if (gdext.classes.OpenXRAPIExtension.mb_set_render_region == null) gdext.classes.OpenXRAPIExtension.mb_set_render_region = MethodBind.get("OpenXRAPIExtension", "set_render_region", 1763793166L)
    Ptrcall.callVoid1(gdext.classes.OpenXRAPIExtension.mb_set_render_region, livePtr, render_region)
  }

  /** OpenXRAPIExtension.set_emulate_environment_blend_mode_alpha_blend */
  final def setEmulateEnvironmentBlendModeAlphaBlend(enabled: Boolean): Unit = {
    if (gdext.classes.OpenXRAPIExtension.mb_set_emulate_environment_blend_mode_alpha_blend == null) gdext.classes.OpenXRAPIExtension.mb_set_emulate_environment_blend_mode_alpha_blend = MethodBind.get("OpenXRAPIExtension", "set_emulate_environment_blend_mode_alpha_blend", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.OpenXRAPIExtension.mb_set_emulate_environment_blend_mode_alpha_blend, livePtr, enabled)
  }

  /** OpenXRAPIExtension.is_environment_blend_mode_alpha_supported */
  final def isEnvironmentBlendModeAlphaSupported(): Long = {
    if (gdext.classes.OpenXRAPIExtension.mb_is_environment_blend_mode_alpha_supported == null) gdext.classes.OpenXRAPIExtension.mb_is_environment_blend_mode_alpha_supported = MethodBind.get("OpenXRAPIExtension", "is_environment_blend_mode_alpha_supported", 1579290861L)
    Ptrcall.call0[Long](gdext.classes.OpenXRAPIExtension.mb_is_environment_blend_mode_alpha_supported, livePtr)
  }

  /** OpenXRAPIExtension.update_main_swapchain_size */
  final def updateMainSwapchainSize(): Unit = {
    if (gdext.classes.OpenXRAPIExtension.mb_update_main_swapchain_size == null) gdext.classes.OpenXRAPIExtension.mb_update_main_swapchain_size = MethodBind.get("OpenXRAPIExtension", "update_main_swapchain_size", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.OpenXRAPIExtension.mb_update_main_swapchain_size, livePtr)
  }

}

object OpenXRAPIExtension {
  private[classes] var mb_get_openxr_version: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_instance: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_system_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_session: GDExtensionMethodBindPtr = null
  private[classes] var mb_openxr_is_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_instance_proc_addr: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_error_string: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_swapchain_format_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_object_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_begin_debug_label_region: GDExtensionMethodBindPtr = null
  private[classes] var mb_end_debug_label_region: GDExtensionMethodBindPtr = null
  private[classes] var mb_insert_debug_label: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_initialized: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_running: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_play_space: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_predicted_display_time: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_next_frame_time: GDExtensionMethodBindPtr = null
  private[classes] var mb_can_render: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_hand_tracker: GDExtensionMethodBindPtr = null
  private[classes] var mb_register_composition_layer_provider: GDExtensionMethodBindPtr = null
  private[classes] var mb_unregister_composition_layer_provider: GDExtensionMethodBindPtr = null
  private[classes] var mb_register_projection_views_extension: GDExtensionMethodBindPtr = null
  private[classes] var mb_unregister_projection_views_extension: GDExtensionMethodBindPtr = null
  private[classes] var mb_register_frame_info_extension: GDExtensionMethodBindPtr = null
  private[classes] var mb_unregister_frame_info_extension: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_render_state_z_near: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_render_state_z_far: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_velocity_target_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_openxr_swapchain_free: GDExtensionMethodBindPtr = null
  private[classes] var mb_openxr_swapchain_get_swapchain: GDExtensionMethodBindPtr = null
  private[classes] var mb_openxr_swapchain_acquire: GDExtensionMethodBindPtr = null
  private[classes] var mb_openxr_swapchain_release: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_projection_layer: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_render_region: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_emulate_environment_blend_mode_alpha_blend: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_environment_blend_mode_alpha_supported: GDExtensionMethodBindPtr = null
  private[classes] var mb_update_main_swapchain_size: GDExtensionMethodBindPtr = null

  /** OpenXRAPIExtension.openxr_is_enabled */
  final def openxrIsEnabled(check_run_in_editor: Boolean): Boolean = {
    if (gdext.classes.OpenXRAPIExtension.mb_openxr_is_enabled == null) gdext.classes.OpenXRAPIExtension.mb_openxr_is_enabled = MethodBind.get("OpenXRAPIExtension", "openxr_is_enabled", 2703660260L)
    Ptrcall.call1[Boolean, Boolean](gdext.classes.OpenXRAPIExtension.mb_openxr_is_enabled, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr], check_run_in_editor)
  }
}
