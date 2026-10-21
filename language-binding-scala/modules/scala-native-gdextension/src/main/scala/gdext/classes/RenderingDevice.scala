package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `RenderingDevice`, extends `Object`. */
abstract class RenderingDevice extends Object {
  override def godotClassName: String = "RenderingDevice"

  /** RenderingDevice.texture_is_format_supported_for_usage */
  final def textureIsFormatSupportedForUsage(format: Long, usage_flags: Long): Boolean = {
    if (gdext.classes.RenderingDevice.mb_texture_is_format_supported_for_usage == null) gdext.classes.RenderingDevice.mb_texture_is_format_supported_for_usage = MethodBind.get("RenderingDevice", "texture_is_format_supported_for_usage", 2592520478L)
    Ptrcall.call2[Long, Long, Boolean](gdext.classes.RenderingDevice.mb_texture_is_format_supported_for_usage, livePtr, format, usage_flags)
  }

  /** RenderingDevice.framebuffer_format_create_empty */
  final def framebufferFormatCreateEmpty(samples: Long): Long = {
    if (gdext.classes.RenderingDevice.mb_framebuffer_format_create_empty == null) gdext.classes.RenderingDevice.mb_framebuffer_format_create_empty = MethodBind.get("RenderingDevice", "framebuffer_format_create_empty", 555930169L)
    Ptrcall.call1[Long, Long](gdext.classes.RenderingDevice.mb_framebuffer_format_create_empty, livePtr, samples)
  }

  /** RenderingDevice.framebuffer_format_get_texture_samples */
  final def framebufferFormatGetTextureSamples(format: Long, render_pass: Long): Long = {
    if (gdext.classes.RenderingDevice.mb_framebuffer_format_get_texture_samples == null) gdext.classes.RenderingDevice.mb_framebuffer_format_get_texture_samples = MethodBind.get("RenderingDevice", "framebuffer_format_get_texture_samples", 4223391010L)
    Ptrcall.call2[Long, Long, Long](gdext.classes.RenderingDevice.mb_framebuffer_format_get_texture_samples, livePtr, format, render_pass)
  }

  /** RenderingDevice.sampler_is_format_supported_for_filter */
  final def samplerIsFormatSupportedForFilter(format: Long, sampler_filter: Long): Boolean = {
    if (gdext.classes.RenderingDevice.mb_sampler_is_format_supported_for_filter == null) gdext.classes.RenderingDevice.mb_sampler_is_format_supported_for_filter = MethodBind.get("RenderingDevice", "sampler_is_format_supported_for_filter", 2247922238L)
    Ptrcall.call2[Long, Long, Boolean](gdext.classes.RenderingDevice.mb_sampler_is_format_supported_for_filter, livePtr, format, sampler_filter)
  }

  /** RenderingDevice.shader_compile_spirv_from_source. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def shaderCompileSpirvFromSource(shader_source: RDShaderSource, allow_cache: Boolean): RDShaderSPIRV = {
    if (gdext.classes.RenderingDevice.mb_shader_compile_spirv_from_source == null) gdext.classes.RenderingDevice.mb_shader_compile_spirv_from_source = MethodBind.get("RenderingDevice", "shader_compile_spirv_from_source", 1178973306L)
    Wrappers.owned[RDShaderSPIRV](Ptrcall.call2[GodotObject, Boolean, Long](gdext.classes.RenderingDevice.mb_shader_compile_spirv_from_source, livePtr, Wrappers.handle(shader_source), allow_cache))
  }

  /** RenderingDevice.screen_get_width */
  final def screenGetWidth(screen: Long): Long = {
    if (gdext.classes.RenderingDevice.mb_screen_get_width == null) gdext.classes.RenderingDevice.mb_screen_get_width = MethodBind.get("RenderingDevice", "screen_get_width", 1591665591L)
    Ptrcall.call1[Long, Long](gdext.classes.RenderingDevice.mb_screen_get_width, livePtr, screen)
  }

  /** RenderingDevice.screen_get_height */
  final def screenGetHeight(screen: Long): Long = {
    if (gdext.classes.RenderingDevice.mb_screen_get_height == null) gdext.classes.RenderingDevice.mb_screen_get_height = MethodBind.get("RenderingDevice", "screen_get_height", 1591665591L)
    Ptrcall.call1[Long, Long](gdext.classes.RenderingDevice.mb_screen_get_height, livePtr, screen)
  }

  /** RenderingDevice.screen_get_framebuffer_format */
  final def screenGetFramebufferFormat(screen: Long): Long = {
    if (gdext.classes.RenderingDevice.mb_screen_get_framebuffer_format == null) gdext.classes.RenderingDevice.mb_screen_get_framebuffer_format = MethodBind.get("RenderingDevice", "screen_get_framebuffer_format", 1591665591L)
    Ptrcall.call1[Long, Long](gdext.classes.RenderingDevice.mb_screen_get_framebuffer_format, livePtr, screen)
  }

  /** RenderingDevice.draw_list_begin_for_screen */
  final def drawListBeginForScreen(screen: Long, clear_color: gdext.builtin.Color): Long = {
    if (gdext.classes.RenderingDevice.mb_draw_list_begin_for_screen == null) gdext.classes.RenderingDevice.mb_draw_list_begin_for_screen = MethodBind.get("RenderingDevice", "draw_list_begin_for_screen", 3988079995L)
    Ptrcall.call2[Long, gdext.builtin.Color, Long](gdext.classes.RenderingDevice.mb_draw_list_begin_for_screen, livePtr, screen, clear_color)
  }

  /** RenderingDevice.draw_list_set_blend_constants */
  final def drawListSetBlendConstants(draw_list: Long, color: gdext.builtin.Color): Unit = {
    if (gdext.classes.RenderingDevice.mb_draw_list_set_blend_constants == null) gdext.classes.RenderingDevice.mb_draw_list_set_blend_constants = MethodBind.get("RenderingDevice", "draw_list_set_blend_constants", 2878471219L)
    Ptrcall.callVoid2(gdext.classes.RenderingDevice.mb_draw_list_set_blend_constants, livePtr, draw_list, color)
  }

  /** RenderingDevice.draw_list_draw */
  final def drawListDraw(draw_list: Long, use_indices: Boolean, instances: Long, procedural_vertex_count: Long): Unit = {
    if (gdext.classes.RenderingDevice.mb_draw_list_draw == null) gdext.classes.RenderingDevice.mb_draw_list_draw = MethodBind.get("RenderingDevice", "draw_list_draw", 4230067973L)
    Ptrcall.callVoid4(gdext.classes.RenderingDevice.mb_draw_list_draw, livePtr, draw_list, use_indices, instances, procedural_vertex_count)
  }

  /** RenderingDevice.draw_list_enable_scissor */
  final def drawListEnableScissor(draw_list: Long, rect: gdext.builtin.Rect2): Unit = {
    if (gdext.classes.RenderingDevice.mb_draw_list_enable_scissor == null) gdext.classes.RenderingDevice.mb_draw_list_enable_scissor = MethodBind.get("RenderingDevice", "draw_list_enable_scissor", 244650101L)
    Ptrcall.callVoid2(gdext.classes.RenderingDevice.mb_draw_list_enable_scissor, livePtr, draw_list, rect)
  }

  /** RenderingDevice.draw_list_disable_scissor */
  final def drawListDisableScissor(draw_list: Long): Unit = {
    if (gdext.classes.RenderingDevice.mb_draw_list_disable_scissor == null) gdext.classes.RenderingDevice.mb_draw_list_disable_scissor = MethodBind.get("RenderingDevice", "draw_list_disable_scissor", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.RenderingDevice.mb_draw_list_disable_scissor, livePtr, draw_list)
  }

  /** RenderingDevice.draw_list_switch_to_next_pass */
  final def drawListSwitchToNextPass(): Long = {
    if (gdext.classes.RenderingDevice.mb_draw_list_switch_to_next_pass == null) gdext.classes.RenderingDevice.mb_draw_list_switch_to_next_pass = MethodBind.get("RenderingDevice", "draw_list_switch_to_next_pass", 2455072627L)
    Ptrcall.call0[Long](gdext.classes.RenderingDevice.mb_draw_list_switch_to_next_pass, livePtr)
  }

  /** RenderingDevice.draw_list_end */
  final def drawListEnd(): Unit = {
    if (gdext.classes.RenderingDevice.mb_draw_list_end == null) gdext.classes.RenderingDevice.mb_draw_list_end = MethodBind.get("RenderingDevice", "draw_list_end", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.RenderingDevice.mb_draw_list_end, livePtr)
  }

  /** RenderingDevice.compute_list_begin */
  final def computeListBegin(): Long = {
    if (gdext.classes.RenderingDevice.mb_compute_list_begin == null) gdext.classes.RenderingDevice.mb_compute_list_begin = MethodBind.get("RenderingDevice", "compute_list_begin", 2455072627L)
    Ptrcall.call0[Long](gdext.classes.RenderingDevice.mb_compute_list_begin, livePtr)
  }

  /** RenderingDevice.compute_list_dispatch */
  final def computeListDispatch(compute_list: Long, x_groups: Long, y_groups: Long, z_groups: Long): Unit = {
    if (gdext.classes.RenderingDevice.mb_compute_list_dispatch == null) gdext.classes.RenderingDevice.mb_compute_list_dispatch = MethodBind.get("RenderingDevice", "compute_list_dispatch", 4275841770L)
    Ptrcall.callVoid4(gdext.classes.RenderingDevice.mb_compute_list_dispatch, livePtr, compute_list, x_groups, y_groups, z_groups)
  }

  /** RenderingDevice.compute_list_add_barrier */
  final def computeListAddBarrier(compute_list: Long): Unit = {
    if (gdext.classes.RenderingDevice.mb_compute_list_add_barrier == null) gdext.classes.RenderingDevice.mb_compute_list_add_barrier = MethodBind.get("RenderingDevice", "compute_list_add_barrier", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.RenderingDevice.mb_compute_list_add_barrier, livePtr, compute_list)
  }

  /** RenderingDevice.compute_list_end */
  final def computeListEnd(): Unit = {
    if (gdext.classes.RenderingDevice.mb_compute_list_end == null) gdext.classes.RenderingDevice.mb_compute_list_end = MethodBind.get("RenderingDevice", "compute_list_end", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.RenderingDevice.mb_compute_list_end, livePtr)
  }

  /** RenderingDevice.capture_timestamp */
  final def captureTimestamp(name: String): Unit = {
    if (gdext.classes.RenderingDevice.mb_capture_timestamp == null) gdext.classes.RenderingDevice.mb_capture_timestamp = MethodBind.get("RenderingDevice", "capture_timestamp", 83702148L)
    Ptrcall.callVoid1(gdext.classes.RenderingDevice.mb_capture_timestamp, livePtr, name)
  }

  /** RenderingDevice.get_captured_timestamps_count */
  final def getCapturedTimestampsCount(): Long = {
    if (gdext.classes.RenderingDevice.mb_get_captured_timestamps_count == null) gdext.classes.RenderingDevice.mb_get_captured_timestamps_count = MethodBind.get("RenderingDevice", "get_captured_timestamps_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.RenderingDevice.mb_get_captured_timestamps_count, livePtr)
  }

  /** RenderingDevice.get_captured_timestamps_frame */
  final def getCapturedTimestampsFrame(): Long = {
    if (gdext.classes.RenderingDevice.mb_get_captured_timestamps_frame == null) gdext.classes.RenderingDevice.mb_get_captured_timestamps_frame = MethodBind.get("RenderingDevice", "get_captured_timestamps_frame", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.RenderingDevice.mb_get_captured_timestamps_frame, livePtr)
  }

  /** RenderingDevice.get_captured_timestamp_gpu_time */
  final def getCapturedTimestampGpuTime(index: Long): Long = {
    if (gdext.classes.RenderingDevice.mb_get_captured_timestamp_gpu_time == null) gdext.classes.RenderingDevice.mb_get_captured_timestamp_gpu_time = MethodBind.get("RenderingDevice", "get_captured_timestamp_gpu_time", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.RenderingDevice.mb_get_captured_timestamp_gpu_time, livePtr, index)
  }

  /** RenderingDevice.get_captured_timestamp_cpu_time */
  final def getCapturedTimestampCpuTime(index: Long): Long = {
    if (gdext.classes.RenderingDevice.mb_get_captured_timestamp_cpu_time == null) gdext.classes.RenderingDevice.mb_get_captured_timestamp_cpu_time = MethodBind.get("RenderingDevice", "get_captured_timestamp_cpu_time", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.RenderingDevice.mb_get_captured_timestamp_cpu_time, livePtr, index)
  }

  /** RenderingDevice.get_captured_timestamp_name */
  final def getCapturedTimestampName(index: Long): String = {
    if (gdext.classes.RenderingDevice.mb_get_captured_timestamp_name == null) gdext.classes.RenderingDevice.mb_get_captured_timestamp_name = MethodBind.get("RenderingDevice", "get_captured_timestamp_name", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.RenderingDevice.mb_get_captured_timestamp_name, livePtr, index)
  }

  /** RenderingDevice.has_feature */
  final def hasFeature(feature: Long): Boolean = {
    if (gdext.classes.RenderingDevice.mb_has_feature == null) gdext.classes.RenderingDevice.mb_has_feature = MethodBind.get("RenderingDevice", "has_feature", 1772728326L)
    Ptrcall.call1[Long, Boolean](gdext.classes.RenderingDevice.mb_has_feature, livePtr, feature)
  }

  /** RenderingDevice.limit_get */
  final def limitGet(limit: Long): Long = {
    if (gdext.classes.RenderingDevice.mb_limit_get == null) gdext.classes.RenderingDevice.mb_limit_get = MethodBind.get("RenderingDevice", "limit_get", 1559202131L)
    Ptrcall.call1[Long, Long](gdext.classes.RenderingDevice.mb_limit_get, livePtr, limit)
  }

  /** RenderingDevice.get_frame_delay */
  final def getFrameDelay(): Long = {
    if (gdext.classes.RenderingDevice.mb_get_frame_delay == null) gdext.classes.RenderingDevice.mb_get_frame_delay = MethodBind.get("RenderingDevice", "get_frame_delay", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.RenderingDevice.mb_get_frame_delay, livePtr)
  }

  /** RenderingDevice.submit */
  final def submit(): Unit = {
    if (gdext.classes.RenderingDevice.mb_submit == null) gdext.classes.RenderingDevice.mb_submit = MethodBind.get("RenderingDevice", "submit", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.RenderingDevice.mb_submit, livePtr)
  }

  /** RenderingDevice.sync */
  final def sync(): Unit = {
    if (gdext.classes.RenderingDevice.mb_sync == null) gdext.classes.RenderingDevice.mb_sync = MethodBind.get("RenderingDevice", "sync", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.RenderingDevice.mb_sync, livePtr)
  }

  /** RenderingDevice.barrier */
  final def barrier(from: Long, to: Long): Unit = {
    if (gdext.classes.RenderingDevice.mb_barrier == null) gdext.classes.RenderingDevice.mb_barrier = MethodBind.get("RenderingDevice", "barrier", 3718155691L)
    Ptrcall.callVoid2(gdext.classes.RenderingDevice.mb_barrier, livePtr, from, to)
  }

  /** RenderingDevice.full_barrier */
  final def fullBarrier(): Unit = {
    if (gdext.classes.RenderingDevice.mb_full_barrier == null) gdext.classes.RenderingDevice.mb_full_barrier = MethodBind.get("RenderingDevice", "full_barrier", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.RenderingDevice.mb_full_barrier, livePtr)
  }

  /** RenderingDevice.create_local_device */
  final def createLocalDevice(): RenderingDevice = {
    if (gdext.classes.RenderingDevice.mb_create_local_device == null) gdext.classes.RenderingDevice.mb_create_local_device = MethodBind.get("RenderingDevice", "create_local_device", 2846302423L)
    Wrappers.borrowed[RenderingDevice](Ptrcall.call0[Long](gdext.classes.RenderingDevice.mb_create_local_device, livePtr))
  }

  /** RenderingDevice.draw_command_begin_label */
  final def drawCommandBeginLabel(name: String, color: gdext.builtin.Color): Unit = {
    if (gdext.classes.RenderingDevice.mb_draw_command_begin_label == null) gdext.classes.RenderingDevice.mb_draw_command_begin_label = MethodBind.get("RenderingDevice", "draw_command_begin_label", 1636512886L)
    Ptrcall.callVoid2(gdext.classes.RenderingDevice.mb_draw_command_begin_label, livePtr, name, color)
  }

  /** RenderingDevice.draw_command_insert_label */
  final def drawCommandInsertLabel(name: String, color: gdext.builtin.Color): Unit = {
    if (gdext.classes.RenderingDevice.mb_draw_command_insert_label == null) gdext.classes.RenderingDevice.mb_draw_command_insert_label = MethodBind.get("RenderingDevice", "draw_command_insert_label", 1636512886L)
    Ptrcall.callVoid2(gdext.classes.RenderingDevice.mb_draw_command_insert_label, livePtr, name, color)
  }

  /** RenderingDevice.draw_command_end_label */
  final def drawCommandEndLabel(): Unit = {
    if (gdext.classes.RenderingDevice.mb_draw_command_end_label == null) gdext.classes.RenderingDevice.mb_draw_command_end_label = MethodBind.get("RenderingDevice", "draw_command_end_label", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.RenderingDevice.mb_draw_command_end_label, livePtr)
  }

  /** RenderingDevice.get_device_vendor_name */
  final def getDeviceVendorName(): String = {
    if (gdext.classes.RenderingDevice.mb_get_device_vendor_name == null) gdext.classes.RenderingDevice.mb_get_device_vendor_name = MethodBind.get("RenderingDevice", "get_device_vendor_name", 201670096L)
    Ptrcall.call0[String](gdext.classes.RenderingDevice.mb_get_device_vendor_name, livePtr)
  }

  /** RenderingDevice.get_device_name */
  final def getDeviceName(): String = {
    if (gdext.classes.RenderingDevice.mb_get_device_name == null) gdext.classes.RenderingDevice.mb_get_device_name = MethodBind.get("RenderingDevice", "get_device_name", 201670096L)
    Ptrcall.call0[String](gdext.classes.RenderingDevice.mb_get_device_name, livePtr)
  }

  /** RenderingDevice.get_device_pipeline_cache_uuid */
  final def getDevicePipelineCacheUuid(): String = {
    if (gdext.classes.RenderingDevice.mb_get_device_pipeline_cache_uuid == null) gdext.classes.RenderingDevice.mb_get_device_pipeline_cache_uuid = MethodBind.get("RenderingDevice", "get_device_pipeline_cache_uuid", 201670096L)
    Ptrcall.call0[String](gdext.classes.RenderingDevice.mb_get_device_pipeline_cache_uuid, livePtr)
  }

  /** RenderingDevice.get_memory_usage */
  final def getMemoryUsage(`type`: Long): Long = {
    if (gdext.classes.RenderingDevice.mb_get_memory_usage == null) gdext.classes.RenderingDevice.mb_get_memory_usage = MethodBind.get("RenderingDevice", "get_memory_usage", 251690689L)
    Ptrcall.call1[Long, Long](gdext.classes.RenderingDevice.mb_get_memory_usage, livePtr, `type`)
  }

  /** RenderingDevice.get_perf_report */
  final def getPerfReport(): String = {
    if (gdext.classes.RenderingDevice.mb_get_perf_report == null) gdext.classes.RenderingDevice.mb_get_perf_report = MethodBind.get("RenderingDevice", "get_perf_report", 201670096L)
    Ptrcall.call0[String](gdext.classes.RenderingDevice.mb_get_perf_report, livePtr)
  }

  /** RenderingDevice.get_driver_and_device_memory_report */
  final def getDriverAndDeviceMemoryReport(): String = {
    if (gdext.classes.RenderingDevice.mb_get_driver_and_device_memory_report == null) gdext.classes.RenderingDevice.mb_get_driver_and_device_memory_report = MethodBind.get("RenderingDevice", "get_driver_and_device_memory_report", 201670096L)
    Ptrcall.call0[String](gdext.classes.RenderingDevice.mb_get_driver_and_device_memory_report, livePtr)
  }

  /** RenderingDevice.get_tracked_object_name */
  final def getTrackedObjectName(type_index: Long): String = {
    if (gdext.classes.RenderingDevice.mb_get_tracked_object_name == null) gdext.classes.RenderingDevice.mb_get_tracked_object_name = MethodBind.get("RenderingDevice", "get_tracked_object_name", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.RenderingDevice.mb_get_tracked_object_name, livePtr, type_index)
  }

  /** RenderingDevice.get_tracked_object_type_count */
  final def getTrackedObjectTypeCount(): Long = {
    if (gdext.classes.RenderingDevice.mb_get_tracked_object_type_count == null) gdext.classes.RenderingDevice.mb_get_tracked_object_type_count = MethodBind.get("RenderingDevice", "get_tracked_object_type_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.RenderingDevice.mb_get_tracked_object_type_count, livePtr)
  }

  /** RenderingDevice.get_driver_total_memory */
  final def getDriverTotalMemory(): Long = {
    if (gdext.classes.RenderingDevice.mb_get_driver_total_memory == null) gdext.classes.RenderingDevice.mb_get_driver_total_memory = MethodBind.get("RenderingDevice", "get_driver_total_memory", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.RenderingDevice.mb_get_driver_total_memory, livePtr)
  }

  /** RenderingDevice.get_driver_allocation_count */
  final def getDriverAllocationCount(): Long = {
    if (gdext.classes.RenderingDevice.mb_get_driver_allocation_count == null) gdext.classes.RenderingDevice.mb_get_driver_allocation_count = MethodBind.get("RenderingDevice", "get_driver_allocation_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.RenderingDevice.mb_get_driver_allocation_count, livePtr)
  }

  /** RenderingDevice.get_driver_memory_by_object_type */
  final def getDriverMemoryByObjectType(`type`: Long): Long = {
    if (gdext.classes.RenderingDevice.mb_get_driver_memory_by_object_type == null) gdext.classes.RenderingDevice.mb_get_driver_memory_by_object_type = MethodBind.get("RenderingDevice", "get_driver_memory_by_object_type", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.RenderingDevice.mb_get_driver_memory_by_object_type, livePtr, `type`)
  }

  /** RenderingDevice.get_driver_allocs_by_object_type */
  final def getDriverAllocsByObjectType(`type`: Long): Long = {
    if (gdext.classes.RenderingDevice.mb_get_driver_allocs_by_object_type == null) gdext.classes.RenderingDevice.mb_get_driver_allocs_by_object_type = MethodBind.get("RenderingDevice", "get_driver_allocs_by_object_type", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.RenderingDevice.mb_get_driver_allocs_by_object_type, livePtr, `type`)
  }

  /** RenderingDevice.get_device_total_memory */
  final def getDeviceTotalMemory(): Long = {
    if (gdext.classes.RenderingDevice.mb_get_device_total_memory == null) gdext.classes.RenderingDevice.mb_get_device_total_memory = MethodBind.get("RenderingDevice", "get_device_total_memory", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.RenderingDevice.mb_get_device_total_memory, livePtr)
  }

  /** RenderingDevice.get_device_allocation_count */
  final def getDeviceAllocationCount(): Long = {
    if (gdext.classes.RenderingDevice.mb_get_device_allocation_count == null) gdext.classes.RenderingDevice.mb_get_device_allocation_count = MethodBind.get("RenderingDevice", "get_device_allocation_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.RenderingDevice.mb_get_device_allocation_count, livePtr)
  }

  /** RenderingDevice.get_device_memory_by_object_type */
  final def getDeviceMemoryByObjectType(`type`: Long): Long = {
    if (gdext.classes.RenderingDevice.mb_get_device_memory_by_object_type == null) gdext.classes.RenderingDevice.mb_get_device_memory_by_object_type = MethodBind.get("RenderingDevice", "get_device_memory_by_object_type", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.RenderingDevice.mb_get_device_memory_by_object_type, livePtr, `type`)
  }

  /** RenderingDevice.get_device_allocs_by_object_type */
  final def getDeviceAllocsByObjectType(`type`: Long): Long = {
    if (gdext.classes.RenderingDevice.mb_get_device_allocs_by_object_type == null) gdext.classes.RenderingDevice.mb_get_device_allocs_by_object_type = MethodBind.get("RenderingDevice", "get_device_allocs_by_object_type", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.RenderingDevice.mb_get_device_allocs_by_object_type, livePtr, `type`)
  }

}

object RenderingDevice {
  private[classes] var mb_texture_is_format_supported_for_usage: GDExtensionMethodBindPtr = null
  private[classes] var mb_framebuffer_format_create_empty: GDExtensionMethodBindPtr = null
  private[classes] var mb_framebuffer_format_get_texture_samples: GDExtensionMethodBindPtr = null
  private[classes] var mb_sampler_is_format_supported_for_filter: GDExtensionMethodBindPtr = null
  private[classes] var mb_shader_compile_spirv_from_source: GDExtensionMethodBindPtr = null
  private[classes] var mb_screen_get_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_screen_get_height: GDExtensionMethodBindPtr = null
  private[classes] var mb_screen_get_framebuffer_format: GDExtensionMethodBindPtr = null
  private[classes] var mb_draw_list_begin_for_screen: GDExtensionMethodBindPtr = null
  private[classes] var mb_draw_list_set_blend_constants: GDExtensionMethodBindPtr = null
  private[classes] var mb_draw_list_draw: GDExtensionMethodBindPtr = null
  private[classes] var mb_draw_list_enable_scissor: GDExtensionMethodBindPtr = null
  private[classes] var mb_draw_list_disable_scissor: GDExtensionMethodBindPtr = null
  private[classes] var mb_draw_list_switch_to_next_pass: GDExtensionMethodBindPtr = null
  private[classes] var mb_draw_list_end: GDExtensionMethodBindPtr = null
  private[classes] var mb_compute_list_begin: GDExtensionMethodBindPtr = null
  private[classes] var mb_compute_list_dispatch: GDExtensionMethodBindPtr = null
  private[classes] var mb_compute_list_add_barrier: GDExtensionMethodBindPtr = null
  private[classes] var mb_compute_list_end: GDExtensionMethodBindPtr = null
  private[classes] var mb_capture_timestamp: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_captured_timestamps_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_captured_timestamps_frame: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_captured_timestamp_gpu_time: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_captured_timestamp_cpu_time: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_captured_timestamp_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_feature: GDExtensionMethodBindPtr = null
  private[classes] var mb_limit_get: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_frame_delay: GDExtensionMethodBindPtr = null
  private[classes] var mb_submit: GDExtensionMethodBindPtr = null
  private[classes] var mb_sync: GDExtensionMethodBindPtr = null
  private[classes] var mb_barrier: GDExtensionMethodBindPtr = null
  private[classes] var mb_full_barrier: GDExtensionMethodBindPtr = null
  private[classes] var mb_create_local_device: GDExtensionMethodBindPtr = null
  private[classes] var mb_draw_command_begin_label: GDExtensionMethodBindPtr = null
  private[classes] var mb_draw_command_insert_label: GDExtensionMethodBindPtr = null
  private[classes] var mb_draw_command_end_label: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_device_vendor_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_device_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_device_pipeline_cache_uuid: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_memory_usage: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_perf_report: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_driver_and_device_memory_report: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tracked_object_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tracked_object_type_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_driver_total_memory: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_driver_allocation_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_driver_memory_by_object_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_driver_allocs_by_object_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_device_total_memory: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_device_allocation_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_device_memory_by_object_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_device_allocs_by_object_type: GDExtensionMethodBindPtr = null
}
