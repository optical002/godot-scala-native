package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `RenderingDevice`, extends `Object`. */
abstract class RenderingDevice extends Object {
  override def godotClassName: String = "RenderingDevice"

  /** RenderingDevice.texture_is_format_supported_for_usage */
  final def textureIsFormatSupportedForUsage(format: gdext.classes.RenderingDevice.DataFormat, usageFlags: gdext.classes.RenderingDevice.TextureUsageBits): Boolean = {
    if (gdext.classes.RenderingDevice.mb_texture_is_format_supported_for_usage == null) gdext.classes.RenderingDevice.mb_texture_is_format_supported_for_usage = MethodBind.get("RenderingDevice", "texture_is_format_supported_for_usage", 2592520478L)
    Ptrcall.call2[Long, Long, Boolean](gdext.classes.RenderingDevice.mb_texture_is_format_supported_for_usage, livePtr, format, usageFlags.asInstanceOf[Long])
  }

  /** RenderingDevice.framebuffer_format_create_empty */
  final def framebufferFormatCreateEmpty(samples: gdext.classes.RenderingDevice.TextureSamples = gdext.classes.RenderingDevice.TextureSamples(0L)): Long = {
    if (gdext.classes.RenderingDevice.mb_framebuffer_format_create_empty == null) gdext.classes.RenderingDevice.mb_framebuffer_format_create_empty = MethodBind.get("RenderingDevice", "framebuffer_format_create_empty", 555930169L)
    Ptrcall.call1[Long, Long](gdext.classes.RenderingDevice.mb_framebuffer_format_create_empty, livePtr, samples)
  }

  /** RenderingDevice.framebuffer_format_get_texture_samples */
  final def framebufferFormatGetTextureSamples(format: Long, renderPass: Long = 0L): gdext.classes.RenderingDevice.TextureSamples = {
    if (gdext.classes.RenderingDevice.mb_framebuffer_format_get_texture_samples == null) gdext.classes.RenderingDevice.mb_framebuffer_format_get_texture_samples = MethodBind.get("RenderingDevice", "framebuffer_format_get_texture_samples", 4223391010L)
    gdext.classes.RenderingDevice.TextureSamples(Ptrcall.call2[Long, Long, Long](gdext.classes.RenderingDevice.mb_framebuffer_format_get_texture_samples, livePtr, format, renderPass))
  }

  /** RenderingDevice.sampler_is_format_supported_for_filter */
  final def samplerIsFormatSupportedForFilter(format: gdext.classes.RenderingDevice.DataFormat, samplerFilter: gdext.classes.RenderingDevice.SamplerFilter): Boolean = {
    if (gdext.classes.RenderingDevice.mb_sampler_is_format_supported_for_filter == null) gdext.classes.RenderingDevice.mb_sampler_is_format_supported_for_filter = MethodBind.get("RenderingDevice", "sampler_is_format_supported_for_filter", 2247922238L)
    Ptrcall.call2[Long, Long, Boolean](gdext.classes.RenderingDevice.mb_sampler_is_format_supported_for_filter, livePtr, format, samplerFilter)
  }

  /** RenderingDevice.shader_compile_spirv_from_source. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def shaderCompileSpirvFromSource(shaderSource: RDShaderSource, allowCache: Boolean = true): RDShaderSPIRV = {
    if (gdext.classes.RenderingDevice.mb_shader_compile_spirv_from_source == null) gdext.classes.RenderingDevice.mb_shader_compile_spirv_from_source = MethodBind.get("RenderingDevice", "shader_compile_spirv_from_source", 1178973306L)
    Wrappers.owned[RDShaderSPIRV](Ptrcall.call2[GodotObject, Boolean, Long](gdext.classes.RenderingDevice.mb_shader_compile_spirv_from_source, livePtr, Wrappers.handle(shaderSource), allowCache))
  }

  /** RenderingDevice.screen_get_width */
  final def screenGetWidth(screen: Long = 0L): Long = {
    if (gdext.classes.RenderingDevice.mb_screen_get_width == null) gdext.classes.RenderingDevice.mb_screen_get_width = MethodBind.get("RenderingDevice", "screen_get_width", 1591665591L)
    Ptrcall.call1[Long, Long](gdext.classes.RenderingDevice.mb_screen_get_width, livePtr, screen)
  }

  /** RenderingDevice.screen_get_height */
  final def screenGetHeight(screen: Long = 0L): Long = {
    if (gdext.classes.RenderingDevice.mb_screen_get_height == null) gdext.classes.RenderingDevice.mb_screen_get_height = MethodBind.get("RenderingDevice", "screen_get_height", 1591665591L)
    Ptrcall.call1[Long, Long](gdext.classes.RenderingDevice.mb_screen_get_height, livePtr, screen)
  }

  /** RenderingDevice.screen_get_framebuffer_format */
  final def screenGetFramebufferFormat(screen: Long = 0L): Long = {
    if (gdext.classes.RenderingDevice.mb_screen_get_framebuffer_format == null) gdext.classes.RenderingDevice.mb_screen_get_framebuffer_format = MethodBind.get("RenderingDevice", "screen_get_framebuffer_format", 1591665591L)
    Ptrcall.call1[Long, Long](gdext.classes.RenderingDevice.mb_screen_get_framebuffer_format, livePtr, screen)
  }

  /** RenderingDevice.draw_list_begin_for_screen */
  final def drawListBeginForScreen(screen: Long = 0L, clearColor: gdext.builtin.Color = gdext.builtin.Color(0f, 0f, 0f, 1f)): Long = {
    if (gdext.classes.RenderingDevice.mb_draw_list_begin_for_screen == null) gdext.classes.RenderingDevice.mb_draw_list_begin_for_screen = MethodBind.get("RenderingDevice", "draw_list_begin_for_screen", 3988079995L)
    Ptrcall.call2[Long, gdext.builtin.Color, Long](gdext.classes.RenderingDevice.mb_draw_list_begin_for_screen, livePtr, screen, clearColor)
  }

  /** RenderingDevice.draw_list_set_blend_constants */
  final def drawListSetBlendConstants(drawList: Long, color: gdext.builtin.Color): Unit = {
    if (gdext.classes.RenderingDevice.mb_draw_list_set_blend_constants == null) gdext.classes.RenderingDevice.mb_draw_list_set_blend_constants = MethodBind.get("RenderingDevice", "draw_list_set_blend_constants", 2878471219L)
    Ptrcall.callVoid2(gdext.classes.RenderingDevice.mb_draw_list_set_blend_constants, livePtr, drawList, color)
  }

  /** RenderingDevice.draw_list_draw */
  final def drawListDraw(drawList: Long, useIndices: Boolean, instances: Long, proceduralVertexCount: Long = 0L): Unit = {
    if (gdext.classes.RenderingDevice.mb_draw_list_draw == null) gdext.classes.RenderingDevice.mb_draw_list_draw = MethodBind.get("RenderingDevice", "draw_list_draw", 4230067973L)
    Ptrcall.callVoid4(gdext.classes.RenderingDevice.mb_draw_list_draw, livePtr, drawList, useIndices, instances, proceduralVertexCount)
  }

  /** RenderingDevice.draw_list_enable_scissor */
  final def drawListEnableScissor(drawList: Long, rect: gdext.builtin.Rect2 = gdext.builtin.Rect2(0f, 0f, 0f, 0f)): Unit = {
    if (gdext.classes.RenderingDevice.mb_draw_list_enable_scissor == null) gdext.classes.RenderingDevice.mb_draw_list_enable_scissor = MethodBind.get("RenderingDevice", "draw_list_enable_scissor", 244650101L)
    Ptrcall.callVoid2(gdext.classes.RenderingDevice.mb_draw_list_enable_scissor, livePtr, drawList, rect)
  }

  /** RenderingDevice.draw_list_disable_scissor */
  final def drawListDisableScissor(drawList: Long): Unit = {
    if (gdext.classes.RenderingDevice.mb_draw_list_disable_scissor == null) gdext.classes.RenderingDevice.mb_draw_list_disable_scissor = MethodBind.get("RenderingDevice", "draw_list_disable_scissor", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.RenderingDevice.mb_draw_list_disable_scissor, livePtr, drawList)
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
  final def computeListDispatch(computeList: Long, xGroups: Long, yGroups: Long, zGroups: Long): Unit = {
    if (gdext.classes.RenderingDevice.mb_compute_list_dispatch == null) gdext.classes.RenderingDevice.mb_compute_list_dispatch = MethodBind.get("RenderingDevice", "compute_list_dispatch", 4275841770L)
    Ptrcall.callVoid4(gdext.classes.RenderingDevice.mb_compute_list_dispatch, livePtr, computeList, xGroups, yGroups, zGroups)
  }

  /** RenderingDevice.compute_list_add_barrier */
  final def computeListAddBarrier(computeList: Long): Unit = {
    if (gdext.classes.RenderingDevice.mb_compute_list_add_barrier == null) gdext.classes.RenderingDevice.mb_compute_list_add_barrier = MethodBind.get("RenderingDevice", "compute_list_add_barrier", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.RenderingDevice.mb_compute_list_add_barrier, livePtr, computeList)
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
  final def hasFeature(feature: gdext.classes.RenderingDevice.Features): Boolean = {
    if (gdext.classes.RenderingDevice.mb_has_feature == null) gdext.classes.RenderingDevice.mb_has_feature = MethodBind.get("RenderingDevice", "has_feature", 1772728326L)
    Ptrcall.call1[Long, Boolean](gdext.classes.RenderingDevice.mb_has_feature, livePtr, feature)
  }

  /** RenderingDevice.limit_get */
  final def limitGet(limit: gdext.classes.RenderingDevice.Limit): Long = {
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
  final def barrier(from: gdext.classes.RenderingDevice.BarrierMask = gdext.classes.RenderingDevice.BarrierMask(32767L), to: gdext.classes.RenderingDevice.BarrierMask = gdext.classes.RenderingDevice.BarrierMask(32767L)): Unit = {
    if (gdext.classes.RenderingDevice.mb_barrier == null) gdext.classes.RenderingDevice.mb_barrier = MethodBind.get("RenderingDevice", "barrier", 3718155691L)
    Ptrcall.callVoid2(gdext.classes.RenderingDevice.mb_barrier, livePtr, from.asInstanceOf[Long], to.asInstanceOf[Long])
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
  final def getMemoryUsage(`type`: gdext.classes.RenderingDevice.MemoryType): Long = {
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
  final def getTrackedObjectName(typeIndex: Long): String = {
    if (gdext.classes.RenderingDevice.mb_get_tracked_object_name == null) gdext.classes.RenderingDevice.mb_get_tracked_object_name = MethodBind.get("RenderingDevice", "get_tracked_object_name", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.RenderingDevice.mb_get_tracked_object_name, livePtr, typeIndex)
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

  /** Godot enum `RenderingDevice.DeviceType`. */
  opaque type DeviceType <: Long = Long

  object DeviceType {
    final val Other: DeviceType = 0L.asInstanceOf[DeviceType]
    final val IntegratedGpu: DeviceType = 1L.asInstanceOf[DeviceType]
    final val DiscreteGpu: DeviceType = 2L.asInstanceOf[DeviceType]
    final val VirtualGpu: DeviceType = 3L.asInstanceOf[DeviceType]
    final val Cpu: DeviceType = 4L.asInstanceOf[DeviceType]
    final val Max: DeviceType = 5L.asInstanceOf[DeviceType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): DeviceType = value.asInstanceOf[DeviceType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[DeviceType] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L).asInstanceOf[scala.IArray[DeviceType]]

    extension (self: DeviceType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Other"
        case 1L => "IntegratedGpu"
        case 2L => "DiscreteGpu"
        case 3L => "VirtualGpu"
        case 4L => "Cpu"
        case 5L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingDevice.DriverResource`. */
  opaque type DriverResource <: Long = Long

  object DriverResource {
    final val LogicalDevice: DriverResource = 0L.asInstanceOf[DriverResource]
    final val PhysicalDevice: DriverResource = 1L.asInstanceOf[DriverResource]
    final val TopmostObject: DriverResource = 2L.asInstanceOf[DriverResource]
    final val CommandQueue: DriverResource = 3L.asInstanceOf[DriverResource]
    final val QueueFamily: DriverResource = 4L.asInstanceOf[DriverResource]
    final val Texture: DriverResource = 5L.asInstanceOf[DriverResource]
    final val TextureView: DriverResource = 6L.asInstanceOf[DriverResource]
    final val TextureDataFormat: DriverResource = 7L.asInstanceOf[DriverResource]
    final val Sampler: DriverResource = 8L.asInstanceOf[DriverResource]
    final val UniformSet: DriverResource = 9L.asInstanceOf[DriverResource]
    final val Buffer: DriverResource = 10L.asInstanceOf[DriverResource]
    final val ComputePipeline: DriverResource = 11L.asInstanceOf[DriverResource]
    final val RenderPipeline: DriverResource = 12L.asInstanceOf[DriverResource]
    final val VulkanDevice: DriverResource = 0L.asInstanceOf[DriverResource]
    final val VulkanPhysicalDevice: DriverResource = 1L.asInstanceOf[DriverResource]
    final val VulkanInstance: DriverResource = 2L.asInstanceOf[DriverResource]
    final val VulkanQueue: DriverResource = 3L.asInstanceOf[DriverResource]
    final val VulkanQueueFamilyIndex: DriverResource = 4L.asInstanceOf[DriverResource]
    final val VulkanImage: DriverResource = 5L.asInstanceOf[DriverResource]
    final val VulkanImageView: DriverResource = 6L.asInstanceOf[DriverResource]
    final val VulkanImageNativeTextureFormat: DriverResource = 7L.asInstanceOf[DriverResource]
    final val VulkanSampler: DriverResource = 8L.asInstanceOf[DriverResource]
    final val VulkanDescriptorSet: DriverResource = 9L.asInstanceOf[DriverResource]
    final val VulkanBuffer: DriverResource = 10L.asInstanceOf[DriverResource]
    final val VulkanComputePipeline: DriverResource = 11L.asInstanceOf[DriverResource]
    final val VulkanRenderPipeline: DriverResource = 12L.asInstanceOf[DriverResource]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): DriverResource = value.asInstanceOf[DriverResource]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[DriverResource] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 11L, 12L).asInstanceOf[scala.IArray[DriverResource]]

    extension (self: DriverResource)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "LogicalDevice"
        case 1L => "PhysicalDevice"
        case 2L => "TopmostObject"
        case 3L => "CommandQueue"
        case 4L => "QueueFamily"
        case 5L => "Texture"
        case 6L => "TextureView"
        case 7L => "TextureDataFormat"
        case 8L => "Sampler"
        case 9L => "UniformSet"
        case 10L => "Buffer"
        case 11L => "ComputePipeline"
        case 12L => "RenderPipeline"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingDevice.DataFormat`. */
  opaque type DataFormat <: Long = Long

  object DataFormat {
    final val R4g4UnormPack8: DataFormat = 0L.asInstanceOf[DataFormat]
    final val R4g4b4a4UnormPack16: DataFormat = 1L.asInstanceOf[DataFormat]
    final val B4g4r4a4UnormPack16: DataFormat = 2L.asInstanceOf[DataFormat]
    final val R5g6b5UnormPack16: DataFormat = 3L.asInstanceOf[DataFormat]
    final val B5g6r5UnormPack16: DataFormat = 4L.asInstanceOf[DataFormat]
    final val R5g5b5a1UnormPack16: DataFormat = 5L.asInstanceOf[DataFormat]
    final val B5g5r5a1UnormPack16: DataFormat = 6L.asInstanceOf[DataFormat]
    final val A1r5g5b5UnormPack16: DataFormat = 7L.asInstanceOf[DataFormat]
    final val R8Unorm: DataFormat = 8L.asInstanceOf[DataFormat]
    final val R8Snorm: DataFormat = 9L.asInstanceOf[DataFormat]
    final val R8Uscaled: DataFormat = 10L.asInstanceOf[DataFormat]
    final val R8Sscaled: DataFormat = 11L.asInstanceOf[DataFormat]
    final val R8Uint: DataFormat = 12L.asInstanceOf[DataFormat]
    final val R8Sint: DataFormat = 13L.asInstanceOf[DataFormat]
    final val R8Srgb: DataFormat = 14L.asInstanceOf[DataFormat]
    final val R8g8Unorm: DataFormat = 15L.asInstanceOf[DataFormat]
    final val R8g8Snorm: DataFormat = 16L.asInstanceOf[DataFormat]
    final val R8g8Uscaled: DataFormat = 17L.asInstanceOf[DataFormat]
    final val R8g8Sscaled: DataFormat = 18L.asInstanceOf[DataFormat]
    final val R8g8Uint: DataFormat = 19L.asInstanceOf[DataFormat]
    final val R8g8Sint: DataFormat = 20L.asInstanceOf[DataFormat]
    final val R8g8Srgb: DataFormat = 21L.asInstanceOf[DataFormat]
    final val R8g8b8Unorm: DataFormat = 22L.asInstanceOf[DataFormat]
    final val R8g8b8Snorm: DataFormat = 23L.asInstanceOf[DataFormat]
    final val R8g8b8Uscaled: DataFormat = 24L.asInstanceOf[DataFormat]
    final val R8g8b8Sscaled: DataFormat = 25L.asInstanceOf[DataFormat]
    final val R8g8b8Uint: DataFormat = 26L.asInstanceOf[DataFormat]
    final val R8g8b8Sint: DataFormat = 27L.asInstanceOf[DataFormat]
    final val R8g8b8Srgb: DataFormat = 28L.asInstanceOf[DataFormat]
    final val B8g8r8Unorm: DataFormat = 29L.asInstanceOf[DataFormat]
    final val B8g8r8Snorm: DataFormat = 30L.asInstanceOf[DataFormat]
    final val B8g8r8Uscaled: DataFormat = 31L.asInstanceOf[DataFormat]
    final val B8g8r8Sscaled: DataFormat = 32L.asInstanceOf[DataFormat]
    final val B8g8r8Uint: DataFormat = 33L.asInstanceOf[DataFormat]
    final val B8g8r8Sint: DataFormat = 34L.asInstanceOf[DataFormat]
    final val B8g8r8Srgb: DataFormat = 35L.asInstanceOf[DataFormat]
    final val R8g8b8a8Unorm: DataFormat = 36L.asInstanceOf[DataFormat]
    final val R8g8b8a8Snorm: DataFormat = 37L.asInstanceOf[DataFormat]
    final val R8g8b8a8Uscaled: DataFormat = 38L.asInstanceOf[DataFormat]
    final val R8g8b8a8Sscaled: DataFormat = 39L.asInstanceOf[DataFormat]
    final val R8g8b8a8Uint: DataFormat = 40L.asInstanceOf[DataFormat]
    final val R8g8b8a8Sint: DataFormat = 41L.asInstanceOf[DataFormat]
    final val R8g8b8a8Srgb: DataFormat = 42L.asInstanceOf[DataFormat]
    final val B8g8r8a8Unorm: DataFormat = 43L.asInstanceOf[DataFormat]
    final val B8g8r8a8Snorm: DataFormat = 44L.asInstanceOf[DataFormat]
    final val B8g8r8a8Uscaled: DataFormat = 45L.asInstanceOf[DataFormat]
    final val B8g8r8a8Sscaled: DataFormat = 46L.asInstanceOf[DataFormat]
    final val B8g8r8a8Uint: DataFormat = 47L.asInstanceOf[DataFormat]
    final val B8g8r8a8Sint: DataFormat = 48L.asInstanceOf[DataFormat]
    final val B8g8r8a8Srgb: DataFormat = 49L.asInstanceOf[DataFormat]
    final val A8b8g8r8UnormPack32: DataFormat = 50L.asInstanceOf[DataFormat]
    final val A8b8g8r8SnormPack32: DataFormat = 51L.asInstanceOf[DataFormat]
    final val A8b8g8r8UscaledPack32: DataFormat = 52L.asInstanceOf[DataFormat]
    final val A8b8g8r8SscaledPack32: DataFormat = 53L.asInstanceOf[DataFormat]
    final val A8b8g8r8UintPack32: DataFormat = 54L.asInstanceOf[DataFormat]
    final val A8b8g8r8SintPack32: DataFormat = 55L.asInstanceOf[DataFormat]
    final val A8b8g8r8SrgbPack32: DataFormat = 56L.asInstanceOf[DataFormat]
    final val A2r10g10b10UnormPack32: DataFormat = 57L.asInstanceOf[DataFormat]
    final val A2r10g10b10SnormPack32: DataFormat = 58L.asInstanceOf[DataFormat]
    final val A2r10g10b10UscaledPack32: DataFormat = 59L.asInstanceOf[DataFormat]
    final val A2r10g10b10SscaledPack32: DataFormat = 60L.asInstanceOf[DataFormat]
    final val A2r10g10b10UintPack32: DataFormat = 61L.asInstanceOf[DataFormat]
    final val A2r10g10b10SintPack32: DataFormat = 62L.asInstanceOf[DataFormat]
    final val A2b10g10r10UnormPack32: DataFormat = 63L.asInstanceOf[DataFormat]
    final val A2b10g10r10SnormPack32: DataFormat = 64L.asInstanceOf[DataFormat]
    final val A2b10g10r10UscaledPack32: DataFormat = 65L.asInstanceOf[DataFormat]
    final val A2b10g10r10SscaledPack32: DataFormat = 66L.asInstanceOf[DataFormat]
    final val A2b10g10r10UintPack32: DataFormat = 67L.asInstanceOf[DataFormat]
    final val A2b10g10r10SintPack32: DataFormat = 68L.asInstanceOf[DataFormat]
    final val R16Unorm: DataFormat = 69L.asInstanceOf[DataFormat]
    final val R16Snorm: DataFormat = 70L.asInstanceOf[DataFormat]
    final val R16Uscaled: DataFormat = 71L.asInstanceOf[DataFormat]
    final val R16Sscaled: DataFormat = 72L.asInstanceOf[DataFormat]
    final val R16Uint: DataFormat = 73L.asInstanceOf[DataFormat]
    final val R16Sint: DataFormat = 74L.asInstanceOf[DataFormat]
    final val R16Sfloat: DataFormat = 75L.asInstanceOf[DataFormat]
    final val R16g16Unorm: DataFormat = 76L.asInstanceOf[DataFormat]
    final val R16g16Snorm: DataFormat = 77L.asInstanceOf[DataFormat]
    final val R16g16Uscaled: DataFormat = 78L.asInstanceOf[DataFormat]
    final val R16g16Sscaled: DataFormat = 79L.asInstanceOf[DataFormat]
    final val R16g16Uint: DataFormat = 80L.asInstanceOf[DataFormat]
    final val R16g16Sint: DataFormat = 81L.asInstanceOf[DataFormat]
    final val R16g16Sfloat: DataFormat = 82L.asInstanceOf[DataFormat]
    final val R16g16b16Unorm: DataFormat = 83L.asInstanceOf[DataFormat]
    final val R16g16b16Snorm: DataFormat = 84L.asInstanceOf[DataFormat]
    final val R16g16b16Uscaled: DataFormat = 85L.asInstanceOf[DataFormat]
    final val R16g16b16Sscaled: DataFormat = 86L.asInstanceOf[DataFormat]
    final val R16g16b16Uint: DataFormat = 87L.asInstanceOf[DataFormat]
    final val R16g16b16Sint: DataFormat = 88L.asInstanceOf[DataFormat]
    final val R16g16b16Sfloat: DataFormat = 89L.asInstanceOf[DataFormat]
    final val R16g16b16a16Unorm: DataFormat = 90L.asInstanceOf[DataFormat]
    final val R16g16b16a16Snorm: DataFormat = 91L.asInstanceOf[DataFormat]
    final val R16g16b16a16Uscaled: DataFormat = 92L.asInstanceOf[DataFormat]
    final val R16g16b16a16Sscaled: DataFormat = 93L.asInstanceOf[DataFormat]
    final val R16g16b16a16Uint: DataFormat = 94L.asInstanceOf[DataFormat]
    final val R16g16b16a16Sint: DataFormat = 95L.asInstanceOf[DataFormat]
    final val R16g16b16a16Sfloat: DataFormat = 96L.asInstanceOf[DataFormat]
    final val R32Uint: DataFormat = 97L.asInstanceOf[DataFormat]
    final val R32Sint: DataFormat = 98L.asInstanceOf[DataFormat]
    final val R32Sfloat: DataFormat = 99L.asInstanceOf[DataFormat]
    final val R32g32Uint: DataFormat = 100L.asInstanceOf[DataFormat]
    final val R32g32Sint: DataFormat = 101L.asInstanceOf[DataFormat]
    final val R32g32Sfloat: DataFormat = 102L.asInstanceOf[DataFormat]
    final val R32g32b32Uint: DataFormat = 103L.asInstanceOf[DataFormat]
    final val R32g32b32Sint: DataFormat = 104L.asInstanceOf[DataFormat]
    final val R32g32b32Sfloat: DataFormat = 105L.asInstanceOf[DataFormat]
    final val R32g32b32a32Uint: DataFormat = 106L.asInstanceOf[DataFormat]
    final val R32g32b32a32Sint: DataFormat = 107L.asInstanceOf[DataFormat]
    final val R32g32b32a32Sfloat: DataFormat = 108L.asInstanceOf[DataFormat]
    final val R64Uint: DataFormat = 109L.asInstanceOf[DataFormat]
    final val R64Sint: DataFormat = 110L.asInstanceOf[DataFormat]
    final val R64Sfloat: DataFormat = 111L.asInstanceOf[DataFormat]
    final val R64g64Uint: DataFormat = 112L.asInstanceOf[DataFormat]
    final val R64g64Sint: DataFormat = 113L.asInstanceOf[DataFormat]
    final val R64g64Sfloat: DataFormat = 114L.asInstanceOf[DataFormat]
    final val R64g64b64Uint: DataFormat = 115L.asInstanceOf[DataFormat]
    final val R64g64b64Sint: DataFormat = 116L.asInstanceOf[DataFormat]
    final val R64g64b64Sfloat: DataFormat = 117L.asInstanceOf[DataFormat]
    final val R64g64b64a64Uint: DataFormat = 118L.asInstanceOf[DataFormat]
    final val R64g64b64a64Sint: DataFormat = 119L.asInstanceOf[DataFormat]
    final val R64g64b64a64Sfloat: DataFormat = 120L.asInstanceOf[DataFormat]
    final val B10g11r11UfloatPack32: DataFormat = 121L.asInstanceOf[DataFormat]
    final val E5b9g9r9UfloatPack32: DataFormat = 122L.asInstanceOf[DataFormat]
    final val D16Unorm: DataFormat = 123L.asInstanceOf[DataFormat]
    final val X8D24UnormPack32: DataFormat = 124L.asInstanceOf[DataFormat]
    final val D32Sfloat: DataFormat = 125L.asInstanceOf[DataFormat]
    final val S8Uint: DataFormat = 126L.asInstanceOf[DataFormat]
    final val D16UnormS8Uint: DataFormat = 127L.asInstanceOf[DataFormat]
    final val D24UnormS8Uint: DataFormat = 128L.asInstanceOf[DataFormat]
    final val D32SfloatS8Uint: DataFormat = 129L.asInstanceOf[DataFormat]
    final val Bc1RgbUnormBlock: DataFormat = 130L.asInstanceOf[DataFormat]
    final val Bc1RgbSrgbBlock: DataFormat = 131L.asInstanceOf[DataFormat]
    final val Bc1RgbaUnormBlock: DataFormat = 132L.asInstanceOf[DataFormat]
    final val Bc1RgbaSrgbBlock: DataFormat = 133L.asInstanceOf[DataFormat]
    final val Bc2UnormBlock: DataFormat = 134L.asInstanceOf[DataFormat]
    final val Bc2SrgbBlock: DataFormat = 135L.asInstanceOf[DataFormat]
    final val Bc3UnormBlock: DataFormat = 136L.asInstanceOf[DataFormat]
    final val Bc3SrgbBlock: DataFormat = 137L.asInstanceOf[DataFormat]
    final val Bc4UnormBlock: DataFormat = 138L.asInstanceOf[DataFormat]
    final val Bc4SnormBlock: DataFormat = 139L.asInstanceOf[DataFormat]
    final val Bc5UnormBlock: DataFormat = 140L.asInstanceOf[DataFormat]
    final val Bc5SnormBlock: DataFormat = 141L.asInstanceOf[DataFormat]
    final val Bc6hUfloatBlock: DataFormat = 142L.asInstanceOf[DataFormat]
    final val Bc6hSfloatBlock: DataFormat = 143L.asInstanceOf[DataFormat]
    final val Bc7UnormBlock: DataFormat = 144L.asInstanceOf[DataFormat]
    final val Bc7SrgbBlock: DataFormat = 145L.asInstanceOf[DataFormat]
    final val Etc2R8g8b8UnormBlock: DataFormat = 146L.asInstanceOf[DataFormat]
    final val Etc2R8g8b8SrgbBlock: DataFormat = 147L.asInstanceOf[DataFormat]
    final val Etc2R8g8b8a1UnormBlock: DataFormat = 148L.asInstanceOf[DataFormat]
    final val Etc2R8g8b8a1SrgbBlock: DataFormat = 149L.asInstanceOf[DataFormat]
    final val Etc2R8g8b8a8UnormBlock: DataFormat = 150L.asInstanceOf[DataFormat]
    final val Etc2R8g8b8a8SrgbBlock: DataFormat = 151L.asInstanceOf[DataFormat]
    final val EacR11UnormBlock: DataFormat = 152L.asInstanceOf[DataFormat]
    final val EacR11SnormBlock: DataFormat = 153L.asInstanceOf[DataFormat]
    final val EacR11g11UnormBlock: DataFormat = 154L.asInstanceOf[DataFormat]
    final val EacR11g11SnormBlock: DataFormat = 155L.asInstanceOf[DataFormat]
    final val Astc4x4UnormBlock: DataFormat = 156L.asInstanceOf[DataFormat]
    final val Astc4x4SrgbBlock: DataFormat = 157L.asInstanceOf[DataFormat]
    final val Astc5x4UnormBlock: DataFormat = 158L.asInstanceOf[DataFormat]
    final val Astc5x4SrgbBlock: DataFormat = 159L.asInstanceOf[DataFormat]
    final val Astc5x5UnormBlock: DataFormat = 160L.asInstanceOf[DataFormat]
    final val Astc5x5SrgbBlock: DataFormat = 161L.asInstanceOf[DataFormat]
    final val Astc6x5UnormBlock: DataFormat = 162L.asInstanceOf[DataFormat]
    final val Astc6x5SrgbBlock: DataFormat = 163L.asInstanceOf[DataFormat]
    final val Astc6x6UnormBlock: DataFormat = 164L.asInstanceOf[DataFormat]
    final val Astc6x6SrgbBlock: DataFormat = 165L.asInstanceOf[DataFormat]
    final val Astc8x5UnormBlock: DataFormat = 166L.asInstanceOf[DataFormat]
    final val Astc8x5SrgbBlock: DataFormat = 167L.asInstanceOf[DataFormat]
    final val Astc8x6UnormBlock: DataFormat = 168L.asInstanceOf[DataFormat]
    final val Astc8x6SrgbBlock: DataFormat = 169L.asInstanceOf[DataFormat]
    final val Astc8x8UnormBlock: DataFormat = 170L.asInstanceOf[DataFormat]
    final val Astc8x8SrgbBlock: DataFormat = 171L.asInstanceOf[DataFormat]
    final val Astc10x5UnormBlock: DataFormat = 172L.asInstanceOf[DataFormat]
    final val Astc10x5SrgbBlock: DataFormat = 173L.asInstanceOf[DataFormat]
    final val Astc10x6UnormBlock: DataFormat = 174L.asInstanceOf[DataFormat]
    final val Astc10x6SrgbBlock: DataFormat = 175L.asInstanceOf[DataFormat]
    final val Astc10x8UnormBlock: DataFormat = 176L.asInstanceOf[DataFormat]
    final val Astc10x8SrgbBlock: DataFormat = 177L.asInstanceOf[DataFormat]
    final val Astc10x10UnormBlock: DataFormat = 178L.asInstanceOf[DataFormat]
    final val Astc10x10SrgbBlock: DataFormat = 179L.asInstanceOf[DataFormat]
    final val Astc12x10UnormBlock: DataFormat = 180L.asInstanceOf[DataFormat]
    final val Astc12x10SrgbBlock: DataFormat = 181L.asInstanceOf[DataFormat]
    final val Astc12x12UnormBlock: DataFormat = 182L.asInstanceOf[DataFormat]
    final val Astc12x12SrgbBlock: DataFormat = 183L.asInstanceOf[DataFormat]
    final val G8b8g8r8422Unorm: DataFormat = 184L.asInstanceOf[DataFormat]
    final val B8g8r8g8422Unorm: DataFormat = 185L.asInstanceOf[DataFormat]
    final val G8B8R83plane420Unorm: DataFormat = 186L.asInstanceOf[DataFormat]
    final val G8B8r82plane420Unorm: DataFormat = 187L.asInstanceOf[DataFormat]
    final val G8B8R83plane422Unorm: DataFormat = 188L.asInstanceOf[DataFormat]
    final val G8B8r82plane422Unorm: DataFormat = 189L.asInstanceOf[DataFormat]
    final val G8B8R83plane444Unorm: DataFormat = 190L.asInstanceOf[DataFormat]
    final val R10x6UnormPack16: DataFormat = 191L.asInstanceOf[DataFormat]
    final val R10x6g10x6Unorm2pack16: DataFormat = 192L.asInstanceOf[DataFormat]
    final val R10x6g10x6b10x6a10x6Unorm4pack16: DataFormat = 193L.asInstanceOf[DataFormat]
    final val G10x6b10x6g10x6r10x6422Unorm4pack16: DataFormat = 194L.asInstanceOf[DataFormat]
    final val B10x6g10x6r10x6g10x6422Unorm4pack16: DataFormat = 195L.asInstanceOf[DataFormat]
    final val G10x6B10x6R10x63plane420Unorm3pack16: DataFormat = 196L.asInstanceOf[DataFormat]
    final val G10x6B10x6r10x62plane420Unorm3pack16: DataFormat = 197L.asInstanceOf[DataFormat]
    final val G10x6B10x6R10x63plane422Unorm3pack16: DataFormat = 198L.asInstanceOf[DataFormat]
    final val G10x6B10x6r10x62plane422Unorm3pack16: DataFormat = 199L.asInstanceOf[DataFormat]
    final val G10x6B10x6R10x63plane444Unorm3pack16: DataFormat = 200L.asInstanceOf[DataFormat]
    final val R12x4UnormPack16: DataFormat = 201L.asInstanceOf[DataFormat]
    final val R12x4g12x4Unorm2pack16: DataFormat = 202L.asInstanceOf[DataFormat]
    final val R12x4g12x4b12x4a12x4Unorm4pack16: DataFormat = 203L.asInstanceOf[DataFormat]
    final val G12x4b12x4g12x4r12x4422Unorm4pack16: DataFormat = 204L.asInstanceOf[DataFormat]
    final val B12x4g12x4r12x4g12x4422Unorm4pack16: DataFormat = 205L.asInstanceOf[DataFormat]
    final val G12x4B12x4R12x43plane420Unorm3pack16: DataFormat = 206L.asInstanceOf[DataFormat]
    final val G12x4B12x4r12x42plane420Unorm3pack16: DataFormat = 207L.asInstanceOf[DataFormat]
    final val G12x4B12x4R12x43plane422Unorm3pack16: DataFormat = 208L.asInstanceOf[DataFormat]
    final val G12x4B12x4r12x42plane422Unorm3pack16: DataFormat = 209L.asInstanceOf[DataFormat]
    final val G12x4B12x4R12x43plane444Unorm3pack16: DataFormat = 210L.asInstanceOf[DataFormat]
    final val G16b16g16r16422Unorm: DataFormat = 211L.asInstanceOf[DataFormat]
    final val B16g16r16g16422Unorm: DataFormat = 212L.asInstanceOf[DataFormat]
    final val G16B16R163plane420Unorm: DataFormat = 213L.asInstanceOf[DataFormat]
    final val G16B16r162plane420Unorm: DataFormat = 214L.asInstanceOf[DataFormat]
    final val G16B16R163plane422Unorm: DataFormat = 215L.asInstanceOf[DataFormat]
    final val G16B16r162plane422Unorm: DataFormat = 216L.asInstanceOf[DataFormat]
    final val G16B16R163plane444Unorm: DataFormat = 217L.asInstanceOf[DataFormat]
    final val Astc4x4SfloatBlock: DataFormat = 218L.asInstanceOf[DataFormat]
    final val Astc5x4SfloatBlock: DataFormat = 219L.asInstanceOf[DataFormat]
    final val Astc5x5SfloatBlock: DataFormat = 220L.asInstanceOf[DataFormat]
    final val Astc6x5SfloatBlock: DataFormat = 221L.asInstanceOf[DataFormat]
    final val Astc6x6SfloatBlock: DataFormat = 222L.asInstanceOf[DataFormat]
    final val Astc8x5SfloatBlock: DataFormat = 223L.asInstanceOf[DataFormat]
    final val Astc8x6SfloatBlock: DataFormat = 224L.asInstanceOf[DataFormat]
    final val Astc8x8SfloatBlock: DataFormat = 225L.asInstanceOf[DataFormat]
    final val Astc10x5SfloatBlock: DataFormat = 226L.asInstanceOf[DataFormat]
    final val Astc10x6SfloatBlock: DataFormat = 227L.asInstanceOf[DataFormat]
    final val Astc10x8SfloatBlock: DataFormat = 228L.asInstanceOf[DataFormat]
    final val Astc10x10SfloatBlock: DataFormat = 229L.asInstanceOf[DataFormat]
    final val Astc12x10SfloatBlock: DataFormat = 230L.asInstanceOf[DataFormat]
    final val Astc12x12SfloatBlock: DataFormat = 231L.asInstanceOf[DataFormat]
    final val Max: DataFormat = 232L.asInstanceOf[DataFormat]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): DataFormat = value.asInstanceOf[DataFormat]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[DataFormat] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 11L, 12L, 13L, 14L, 15L, 16L, 17L, 18L, 19L, 20L, 21L, 22L, 23L, 24L, 25L, 26L, 27L, 28L, 29L, 30L, 31L, 32L, 33L, 34L, 35L, 36L, 37L, 38L, 39L, 40L, 41L, 42L, 43L, 44L, 45L, 46L, 47L, 48L, 49L, 50L, 51L, 52L, 53L, 54L, 55L, 56L, 57L, 58L, 59L, 60L, 61L, 62L, 63L, 64L, 65L, 66L, 67L, 68L, 69L, 70L, 71L, 72L, 73L, 74L, 75L, 76L, 77L, 78L, 79L, 80L, 81L, 82L, 83L, 84L, 85L, 86L, 87L, 88L, 89L, 90L, 91L, 92L, 93L, 94L, 95L, 96L, 97L, 98L, 99L, 100L, 101L, 102L, 103L, 104L, 105L, 106L, 107L, 108L, 109L, 110L, 111L, 112L, 113L, 114L, 115L, 116L, 117L, 118L, 119L, 120L, 121L, 122L, 123L, 124L, 125L, 126L, 127L, 128L, 129L, 130L, 131L, 132L, 133L, 134L, 135L, 136L, 137L, 138L, 139L, 140L, 141L, 142L, 143L, 144L, 145L, 146L, 147L, 148L, 149L, 150L, 151L, 152L, 153L, 154L, 155L, 156L, 157L, 158L, 159L, 160L, 161L, 162L, 163L, 164L, 165L, 166L, 167L, 168L, 169L, 170L, 171L, 172L, 173L, 174L, 175L, 176L, 177L, 178L, 179L, 180L, 181L, 182L, 183L, 184L, 185L, 186L, 187L, 188L, 189L, 190L, 191L, 192L, 193L, 194L, 195L, 196L, 197L, 198L, 199L, 200L, 201L, 202L, 203L, 204L, 205L, 206L, 207L, 208L, 209L, 210L, 211L, 212L, 213L, 214L, 215L, 216L, 217L, 218L, 219L, 220L, 221L, 222L, 223L, 224L, 225L, 226L, 227L, 228L, 229L, 230L, 231L, 232L).asInstanceOf[scala.IArray[DataFormat]]

    extension (self: DataFormat)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "R4g4UnormPack8"
        case 1L => "R4g4b4a4UnormPack16"
        case 2L => "B4g4r4a4UnormPack16"
        case 3L => "R5g6b5UnormPack16"
        case 4L => "B5g6r5UnormPack16"
        case 5L => "R5g5b5a1UnormPack16"
        case 6L => "B5g5r5a1UnormPack16"
        case 7L => "A1r5g5b5UnormPack16"
        case 8L => "R8Unorm"
        case 9L => "R8Snorm"
        case 10L => "R8Uscaled"
        case 11L => "R8Sscaled"
        case 12L => "R8Uint"
        case 13L => "R8Sint"
        case 14L => "R8Srgb"
        case 15L => "R8g8Unorm"
        case 16L => "R8g8Snorm"
        case 17L => "R8g8Uscaled"
        case 18L => "R8g8Sscaled"
        case 19L => "R8g8Uint"
        case 20L => "R8g8Sint"
        case 21L => "R8g8Srgb"
        case 22L => "R8g8b8Unorm"
        case 23L => "R8g8b8Snorm"
        case 24L => "R8g8b8Uscaled"
        case 25L => "R8g8b8Sscaled"
        case 26L => "R8g8b8Uint"
        case 27L => "R8g8b8Sint"
        case 28L => "R8g8b8Srgb"
        case 29L => "B8g8r8Unorm"
        case 30L => "B8g8r8Snorm"
        case 31L => "B8g8r8Uscaled"
        case 32L => "B8g8r8Sscaled"
        case 33L => "B8g8r8Uint"
        case 34L => "B8g8r8Sint"
        case 35L => "B8g8r8Srgb"
        case 36L => "R8g8b8a8Unorm"
        case 37L => "R8g8b8a8Snorm"
        case 38L => "R8g8b8a8Uscaled"
        case 39L => "R8g8b8a8Sscaled"
        case 40L => "R8g8b8a8Uint"
        case 41L => "R8g8b8a8Sint"
        case 42L => "R8g8b8a8Srgb"
        case 43L => "B8g8r8a8Unorm"
        case 44L => "B8g8r8a8Snorm"
        case 45L => "B8g8r8a8Uscaled"
        case 46L => "B8g8r8a8Sscaled"
        case 47L => "B8g8r8a8Uint"
        case 48L => "B8g8r8a8Sint"
        case 49L => "B8g8r8a8Srgb"
        case 50L => "A8b8g8r8UnormPack32"
        case 51L => "A8b8g8r8SnormPack32"
        case 52L => "A8b8g8r8UscaledPack32"
        case 53L => "A8b8g8r8SscaledPack32"
        case 54L => "A8b8g8r8UintPack32"
        case 55L => "A8b8g8r8SintPack32"
        case 56L => "A8b8g8r8SrgbPack32"
        case 57L => "A2r10g10b10UnormPack32"
        case 58L => "A2r10g10b10SnormPack32"
        case 59L => "A2r10g10b10UscaledPack32"
        case 60L => "A2r10g10b10SscaledPack32"
        case 61L => "A2r10g10b10UintPack32"
        case 62L => "A2r10g10b10SintPack32"
        case 63L => "A2b10g10r10UnormPack32"
        case 64L => "A2b10g10r10SnormPack32"
        case 65L => "A2b10g10r10UscaledPack32"
        case 66L => "A2b10g10r10SscaledPack32"
        case 67L => "A2b10g10r10UintPack32"
        case 68L => "A2b10g10r10SintPack32"
        case 69L => "R16Unorm"
        case 70L => "R16Snorm"
        case 71L => "R16Uscaled"
        case 72L => "R16Sscaled"
        case 73L => "R16Uint"
        case 74L => "R16Sint"
        case 75L => "R16Sfloat"
        case 76L => "R16g16Unorm"
        case 77L => "R16g16Snorm"
        case 78L => "R16g16Uscaled"
        case 79L => "R16g16Sscaled"
        case 80L => "R16g16Uint"
        case 81L => "R16g16Sint"
        case 82L => "R16g16Sfloat"
        case 83L => "R16g16b16Unorm"
        case 84L => "R16g16b16Snorm"
        case 85L => "R16g16b16Uscaled"
        case 86L => "R16g16b16Sscaled"
        case 87L => "R16g16b16Uint"
        case 88L => "R16g16b16Sint"
        case 89L => "R16g16b16Sfloat"
        case 90L => "R16g16b16a16Unorm"
        case 91L => "R16g16b16a16Snorm"
        case 92L => "R16g16b16a16Uscaled"
        case 93L => "R16g16b16a16Sscaled"
        case 94L => "R16g16b16a16Uint"
        case 95L => "R16g16b16a16Sint"
        case 96L => "R16g16b16a16Sfloat"
        case 97L => "R32Uint"
        case 98L => "R32Sint"
        case 99L => "R32Sfloat"
        case 100L => "R32g32Uint"
        case 101L => "R32g32Sint"
        case 102L => "R32g32Sfloat"
        case 103L => "R32g32b32Uint"
        case 104L => "R32g32b32Sint"
        case 105L => "R32g32b32Sfloat"
        case 106L => "R32g32b32a32Uint"
        case 107L => "R32g32b32a32Sint"
        case 108L => "R32g32b32a32Sfloat"
        case 109L => "R64Uint"
        case 110L => "R64Sint"
        case 111L => "R64Sfloat"
        case 112L => "R64g64Uint"
        case 113L => "R64g64Sint"
        case 114L => "R64g64Sfloat"
        case 115L => "R64g64b64Uint"
        case 116L => "R64g64b64Sint"
        case 117L => "R64g64b64Sfloat"
        case 118L => "R64g64b64a64Uint"
        case 119L => "R64g64b64a64Sint"
        case 120L => "R64g64b64a64Sfloat"
        case 121L => "B10g11r11UfloatPack32"
        case 122L => "E5b9g9r9UfloatPack32"
        case 123L => "D16Unorm"
        case 124L => "X8D24UnormPack32"
        case 125L => "D32Sfloat"
        case 126L => "S8Uint"
        case 127L => "D16UnormS8Uint"
        case 128L => "D24UnormS8Uint"
        case 129L => "D32SfloatS8Uint"
        case 130L => "Bc1RgbUnormBlock"
        case 131L => "Bc1RgbSrgbBlock"
        case 132L => "Bc1RgbaUnormBlock"
        case 133L => "Bc1RgbaSrgbBlock"
        case 134L => "Bc2UnormBlock"
        case 135L => "Bc2SrgbBlock"
        case 136L => "Bc3UnormBlock"
        case 137L => "Bc3SrgbBlock"
        case 138L => "Bc4UnormBlock"
        case 139L => "Bc4SnormBlock"
        case 140L => "Bc5UnormBlock"
        case 141L => "Bc5SnormBlock"
        case 142L => "Bc6hUfloatBlock"
        case 143L => "Bc6hSfloatBlock"
        case 144L => "Bc7UnormBlock"
        case 145L => "Bc7SrgbBlock"
        case 146L => "Etc2R8g8b8UnormBlock"
        case 147L => "Etc2R8g8b8SrgbBlock"
        case 148L => "Etc2R8g8b8a1UnormBlock"
        case 149L => "Etc2R8g8b8a1SrgbBlock"
        case 150L => "Etc2R8g8b8a8UnormBlock"
        case 151L => "Etc2R8g8b8a8SrgbBlock"
        case 152L => "EacR11UnormBlock"
        case 153L => "EacR11SnormBlock"
        case 154L => "EacR11g11UnormBlock"
        case 155L => "EacR11g11SnormBlock"
        case 156L => "Astc4x4UnormBlock"
        case 157L => "Astc4x4SrgbBlock"
        case 158L => "Astc5x4UnormBlock"
        case 159L => "Astc5x4SrgbBlock"
        case 160L => "Astc5x5UnormBlock"
        case 161L => "Astc5x5SrgbBlock"
        case 162L => "Astc6x5UnormBlock"
        case 163L => "Astc6x5SrgbBlock"
        case 164L => "Astc6x6UnormBlock"
        case 165L => "Astc6x6SrgbBlock"
        case 166L => "Astc8x5UnormBlock"
        case 167L => "Astc8x5SrgbBlock"
        case 168L => "Astc8x6UnormBlock"
        case 169L => "Astc8x6SrgbBlock"
        case 170L => "Astc8x8UnormBlock"
        case 171L => "Astc8x8SrgbBlock"
        case 172L => "Astc10x5UnormBlock"
        case 173L => "Astc10x5SrgbBlock"
        case 174L => "Astc10x6UnormBlock"
        case 175L => "Astc10x6SrgbBlock"
        case 176L => "Astc10x8UnormBlock"
        case 177L => "Astc10x8SrgbBlock"
        case 178L => "Astc10x10UnormBlock"
        case 179L => "Astc10x10SrgbBlock"
        case 180L => "Astc12x10UnormBlock"
        case 181L => "Astc12x10SrgbBlock"
        case 182L => "Astc12x12UnormBlock"
        case 183L => "Astc12x12SrgbBlock"
        case 184L => "G8b8g8r8422Unorm"
        case 185L => "B8g8r8g8422Unorm"
        case 186L => "G8B8R83plane420Unorm"
        case 187L => "G8B8r82plane420Unorm"
        case 188L => "G8B8R83plane422Unorm"
        case 189L => "G8B8r82plane422Unorm"
        case 190L => "G8B8R83plane444Unorm"
        case 191L => "R10x6UnormPack16"
        case 192L => "R10x6g10x6Unorm2pack16"
        case 193L => "R10x6g10x6b10x6a10x6Unorm4pack16"
        case 194L => "G10x6b10x6g10x6r10x6422Unorm4pack16"
        case 195L => "B10x6g10x6r10x6g10x6422Unorm4pack16"
        case 196L => "G10x6B10x6R10x63plane420Unorm3pack16"
        case 197L => "G10x6B10x6r10x62plane420Unorm3pack16"
        case 198L => "G10x6B10x6R10x63plane422Unorm3pack16"
        case 199L => "G10x6B10x6r10x62plane422Unorm3pack16"
        case 200L => "G10x6B10x6R10x63plane444Unorm3pack16"
        case 201L => "R12x4UnormPack16"
        case 202L => "R12x4g12x4Unorm2pack16"
        case 203L => "R12x4g12x4b12x4a12x4Unorm4pack16"
        case 204L => "G12x4b12x4g12x4r12x4422Unorm4pack16"
        case 205L => "B12x4g12x4r12x4g12x4422Unorm4pack16"
        case 206L => "G12x4B12x4R12x43plane420Unorm3pack16"
        case 207L => "G12x4B12x4r12x42plane420Unorm3pack16"
        case 208L => "G12x4B12x4R12x43plane422Unorm3pack16"
        case 209L => "G12x4B12x4r12x42plane422Unorm3pack16"
        case 210L => "G12x4B12x4R12x43plane444Unorm3pack16"
        case 211L => "G16b16g16r16422Unorm"
        case 212L => "B16g16r16g16422Unorm"
        case 213L => "G16B16R163plane420Unorm"
        case 214L => "G16B16r162plane420Unorm"
        case 215L => "G16B16R163plane422Unorm"
        case 216L => "G16B16r162plane422Unorm"
        case 217L => "G16B16R163plane444Unorm"
        case 218L => "Astc4x4SfloatBlock"
        case 219L => "Astc5x4SfloatBlock"
        case 220L => "Astc5x5SfloatBlock"
        case 221L => "Astc6x5SfloatBlock"
        case 222L => "Astc6x6SfloatBlock"
        case 223L => "Astc8x5SfloatBlock"
        case 224L => "Astc8x6SfloatBlock"
        case 225L => "Astc8x8SfloatBlock"
        case 226L => "Astc10x5SfloatBlock"
        case 227L => "Astc10x6SfloatBlock"
        case 228L => "Astc10x8SfloatBlock"
        case 229L => "Astc10x10SfloatBlock"
        case 230L => "Astc12x10SfloatBlock"
        case 231L => "Astc12x12SfloatBlock"
        case 232L => "Max"
        case other => other.toString
      }
  }

  /** Godot bitfield `RenderingDevice.BarrierMask`. */
  opaque type BarrierMask = Long

  object BarrierMask {
    final val Vertex: BarrierMask = 1L.asInstanceOf[BarrierMask]
    final val Fragment: BarrierMask = 8L.asInstanceOf[BarrierMask]
    final val Compute: BarrierMask = 2L.asInstanceOf[BarrierMask]
    final val Transfer: BarrierMask = 4L.asInstanceOf[BarrierMask]
    final val Raster: BarrierMask = 9L.asInstanceOf[BarrierMask]
    final val AllBarriers: BarrierMask = 32767L.asInstanceOf[BarrierMask]
    final val NoBarrier: BarrierMask = 32768L.asInstanceOf[BarrierMask]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): BarrierMask = value.asInstanceOf[BarrierMask]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[BarrierMask] = scala.IArray[Long](1L, 2L, 4L, 8L, 9L, 32767L, 32768L).asInstanceOf[scala.IArray[BarrierMask]]

    extension (self: BarrierMask)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 1L => "Vertex"
        case 2L => "Compute"
        case 4L => "Transfer"
        case 8L => "Fragment"
        case 9L => "Raster"
        case 32767L => "AllBarriers"
        case 32768L => "NoBarrier"
        case other => other.toString
      }
    extension (self: BarrierMask) {
      inline def value: Long = self.asInstanceOf[Long]
      inline def |(other: BarrierMask): BarrierMask = (self.value | other.value).asInstanceOf[BarrierMask]
      inline def &(other: BarrierMask): BarrierMask = (self.value & other.value).asInstanceOf[BarrierMask]
      /** Every bit of `flag` is set. */
      inline def has(flag: BarrierMask): Boolean = (self.value & flag.value) == flag.value
    }
  }

  /** Godot enum `RenderingDevice.TextureType`. */
  opaque type TextureType <: Long = Long

  object TextureType {
    final val Type1d: TextureType = 0L.asInstanceOf[TextureType]
    final val Type2d: TextureType = 1L.asInstanceOf[TextureType]
    final val Type3d: TextureType = 2L.asInstanceOf[TextureType]
    final val Cube: TextureType = 3L.asInstanceOf[TextureType]
    final val Type1dArray: TextureType = 4L.asInstanceOf[TextureType]
    final val Type2dArray: TextureType = 5L.asInstanceOf[TextureType]
    final val CubeArray: TextureType = 6L.asInstanceOf[TextureType]
    final val Max: TextureType = 7L.asInstanceOf[TextureType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): TextureType = value.asInstanceOf[TextureType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[TextureType] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L).asInstanceOf[scala.IArray[TextureType]]

    extension (self: TextureType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Type1d"
        case 1L => "Type2d"
        case 2L => "Type3d"
        case 3L => "Cube"
        case 4L => "Type1dArray"
        case 5L => "Type2dArray"
        case 6L => "CubeArray"
        case 7L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingDevice.TextureSamples`. */
  opaque type TextureSamples <: Long = Long

  object TextureSamples {
    final val Samples1: TextureSamples = 0L.asInstanceOf[TextureSamples]
    final val Samples2: TextureSamples = 1L.asInstanceOf[TextureSamples]
    final val Samples4: TextureSamples = 2L.asInstanceOf[TextureSamples]
    final val Samples8: TextureSamples = 3L.asInstanceOf[TextureSamples]
    final val Samples16: TextureSamples = 4L.asInstanceOf[TextureSamples]
    final val Samples32: TextureSamples = 5L.asInstanceOf[TextureSamples]
    final val Samples64: TextureSamples = 6L.asInstanceOf[TextureSamples]
    final val Max: TextureSamples = 7L.asInstanceOf[TextureSamples]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): TextureSamples = value.asInstanceOf[TextureSamples]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[TextureSamples] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L).asInstanceOf[scala.IArray[TextureSamples]]

    extension (self: TextureSamples)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Samples1"
        case 1L => "Samples2"
        case 2L => "Samples4"
        case 3L => "Samples8"
        case 4L => "Samples16"
        case 5L => "Samples32"
        case 6L => "Samples64"
        case 7L => "Max"
        case other => other.toString
      }
  }

  /** Godot bitfield `RenderingDevice.TextureUsageBits`. */
  opaque type TextureUsageBits = Long

  object TextureUsageBits {
    final val SamplingBit: TextureUsageBits = 1L.asInstanceOf[TextureUsageBits]
    final val ColorAttachmentBit: TextureUsageBits = 2L.asInstanceOf[TextureUsageBits]
    final val DepthStencilAttachmentBit: TextureUsageBits = 4L.asInstanceOf[TextureUsageBits]
    final val DepthResolveAttachmentBit: TextureUsageBits = 4096L.asInstanceOf[TextureUsageBits]
    final val StorageBit: TextureUsageBits = 8L.asInstanceOf[TextureUsageBits]
    final val StorageAtomicBit: TextureUsageBits = 16L.asInstanceOf[TextureUsageBits]
    final val CpuReadBit: TextureUsageBits = 32L.asInstanceOf[TextureUsageBits]
    final val CanUpdateBit: TextureUsageBits = 64L.asInstanceOf[TextureUsageBits]
    final val CanCopyFromBit: TextureUsageBits = 128L.asInstanceOf[TextureUsageBits]
    final val CanCopyToBit: TextureUsageBits = 256L.asInstanceOf[TextureUsageBits]
    final val InputAttachmentBit: TextureUsageBits = 512L.asInstanceOf[TextureUsageBits]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): TextureUsageBits = value.asInstanceOf[TextureUsageBits]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[TextureUsageBits] = scala.IArray[Long](1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 512L, 4096L).asInstanceOf[scala.IArray[TextureUsageBits]]

    extension (self: TextureUsageBits)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 1L => "SamplingBit"
        case 2L => "ColorAttachmentBit"
        case 4L => "DepthStencilAttachmentBit"
        case 8L => "StorageBit"
        case 16L => "StorageAtomicBit"
        case 32L => "CpuReadBit"
        case 64L => "CanUpdateBit"
        case 128L => "CanCopyFromBit"
        case 256L => "CanCopyToBit"
        case 512L => "InputAttachmentBit"
        case 4096L => "DepthResolveAttachmentBit"
        case other => other.toString
      }
    extension (self: TextureUsageBits) {
      inline def value: Long = self.asInstanceOf[Long]
      inline def |(other: TextureUsageBits): TextureUsageBits = (self.value | other.value).asInstanceOf[TextureUsageBits]
      inline def &(other: TextureUsageBits): TextureUsageBits = (self.value & other.value).asInstanceOf[TextureUsageBits]
      /** Every bit of `flag` is set. */
      inline def has(flag: TextureUsageBits): Boolean = (self.value & flag.value) == flag.value
    }
  }

  /** Godot enum `RenderingDevice.TextureSwizzle`. */
  opaque type TextureSwizzle <: Long = Long

  object TextureSwizzle {
    final val Identity: TextureSwizzle = 0L.asInstanceOf[TextureSwizzle]
    final val Zero: TextureSwizzle = 1L.asInstanceOf[TextureSwizzle]
    final val One: TextureSwizzle = 2L.asInstanceOf[TextureSwizzle]
    final val R: TextureSwizzle = 3L.asInstanceOf[TextureSwizzle]
    final val G: TextureSwizzle = 4L.asInstanceOf[TextureSwizzle]
    final val B: TextureSwizzle = 5L.asInstanceOf[TextureSwizzle]
    final val A: TextureSwizzle = 6L.asInstanceOf[TextureSwizzle]
    final val Max: TextureSwizzle = 7L.asInstanceOf[TextureSwizzle]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): TextureSwizzle = value.asInstanceOf[TextureSwizzle]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[TextureSwizzle] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L).asInstanceOf[scala.IArray[TextureSwizzle]]

    extension (self: TextureSwizzle)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Identity"
        case 1L => "Zero"
        case 2L => "One"
        case 3L => "R"
        case 4L => "G"
        case 5L => "B"
        case 6L => "A"
        case 7L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingDevice.TextureSliceType`. */
  opaque type TextureSliceType <: Long = Long

  object TextureSliceType {
    final val Slice2d: TextureSliceType = 0L.asInstanceOf[TextureSliceType]
    final val Cubemap: TextureSliceType = 1L.asInstanceOf[TextureSliceType]
    final val Slice3d: TextureSliceType = 2L.asInstanceOf[TextureSliceType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): TextureSliceType = value.asInstanceOf[TextureSliceType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[TextureSliceType] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[TextureSliceType]]

    extension (self: TextureSliceType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Slice2d"
        case 1L => "Cubemap"
        case 2L => "Slice3d"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingDevice.SamplerFilter`. */
  opaque type SamplerFilter <: Long = Long

  object SamplerFilter {
    final val Nearest: SamplerFilter = 0L.asInstanceOf[SamplerFilter]
    final val Linear: SamplerFilter = 1L.asInstanceOf[SamplerFilter]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): SamplerFilter = value.asInstanceOf[SamplerFilter]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[SamplerFilter] = scala.IArray[Long](0L, 1L).asInstanceOf[scala.IArray[SamplerFilter]]

    extension (self: SamplerFilter)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Nearest"
        case 1L => "Linear"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingDevice.SamplerRepeatMode`. */
  opaque type SamplerRepeatMode <: Long = Long

  object SamplerRepeatMode {
    final val Repeat: SamplerRepeatMode = 0L.asInstanceOf[SamplerRepeatMode]
    final val MirroredRepeat: SamplerRepeatMode = 1L.asInstanceOf[SamplerRepeatMode]
    final val ClampToEdge: SamplerRepeatMode = 2L.asInstanceOf[SamplerRepeatMode]
    final val ClampToBorder: SamplerRepeatMode = 3L.asInstanceOf[SamplerRepeatMode]
    final val MirrorClampToEdge: SamplerRepeatMode = 4L.asInstanceOf[SamplerRepeatMode]
    final val Max: SamplerRepeatMode = 5L.asInstanceOf[SamplerRepeatMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): SamplerRepeatMode = value.asInstanceOf[SamplerRepeatMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[SamplerRepeatMode] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L).asInstanceOf[scala.IArray[SamplerRepeatMode]]

    extension (self: SamplerRepeatMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Repeat"
        case 1L => "MirroredRepeat"
        case 2L => "ClampToEdge"
        case 3L => "ClampToBorder"
        case 4L => "MirrorClampToEdge"
        case 5L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingDevice.SamplerBorderColor`. */
  opaque type SamplerBorderColor <: Long = Long

  object SamplerBorderColor {
    final val FloatTransparentBlack: SamplerBorderColor = 0L.asInstanceOf[SamplerBorderColor]
    final val IntTransparentBlack: SamplerBorderColor = 1L.asInstanceOf[SamplerBorderColor]
    final val FloatOpaqueBlack: SamplerBorderColor = 2L.asInstanceOf[SamplerBorderColor]
    final val IntOpaqueBlack: SamplerBorderColor = 3L.asInstanceOf[SamplerBorderColor]
    final val FloatOpaqueWhite: SamplerBorderColor = 4L.asInstanceOf[SamplerBorderColor]
    final val IntOpaqueWhite: SamplerBorderColor = 5L.asInstanceOf[SamplerBorderColor]
    final val Max: SamplerBorderColor = 6L.asInstanceOf[SamplerBorderColor]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): SamplerBorderColor = value.asInstanceOf[SamplerBorderColor]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[SamplerBorderColor] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L).asInstanceOf[scala.IArray[SamplerBorderColor]]

    extension (self: SamplerBorderColor)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "FloatTransparentBlack"
        case 1L => "IntTransparentBlack"
        case 2L => "FloatOpaqueBlack"
        case 3L => "IntOpaqueBlack"
        case 4L => "FloatOpaqueWhite"
        case 5L => "IntOpaqueWhite"
        case 6L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingDevice.VertexFrequency`. */
  opaque type VertexFrequency <: Long = Long

  object VertexFrequency {
    final val Vertex: VertexFrequency = 0L.asInstanceOf[VertexFrequency]
    final val Instance: VertexFrequency = 1L.asInstanceOf[VertexFrequency]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): VertexFrequency = value.asInstanceOf[VertexFrequency]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[VertexFrequency] = scala.IArray[Long](0L, 1L).asInstanceOf[scala.IArray[VertexFrequency]]

    extension (self: VertexFrequency)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Vertex"
        case 1L => "Instance"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingDevice.IndexBufferFormat`. */
  opaque type IndexBufferFormat <: Long = Long

  object IndexBufferFormat {
    final val Uint16: IndexBufferFormat = 0L.asInstanceOf[IndexBufferFormat]
    final val Uint32: IndexBufferFormat = 1L.asInstanceOf[IndexBufferFormat]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): IndexBufferFormat = value.asInstanceOf[IndexBufferFormat]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[IndexBufferFormat] = scala.IArray[Long](0L, 1L).asInstanceOf[scala.IArray[IndexBufferFormat]]

    extension (self: IndexBufferFormat)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Uint16"
        case 1L => "Uint32"
        case other => other.toString
      }
  }

  /** Godot bitfield `RenderingDevice.StorageBufferUsage`. */
  opaque type StorageBufferUsage = Long

  object StorageBufferUsage {
    final val StorageBufferUsageDispatchIndirect: StorageBufferUsage = 1L.asInstanceOf[StorageBufferUsage]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): StorageBufferUsage = value.asInstanceOf[StorageBufferUsage]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[StorageBufferUsage] = scala.IArray[Long](1L).asInstanceOf[scala.IArray[StorageBufferUsage]]

    extension (self: StorageBufferUsage)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 1L => "StorageBufferUsageDispatchIndirect"
        case other => other.toString
      }
    extension (self: StorageBufferUsage) {
      inline def value: Long = self.asInstanceOf[Long]
      inline def |(other: StorageBufferUsage): StorageBufferUsage = (self.value | other.value).asInstanceOf[StorageBufferUsage]
      inline def &(other: StorageBufferUsage): StorageBufferUsage = (self.value & other.value).asInstanceOf[StorageBufferUsage]
      /** Every bit of `flag` is set. */
      inline def has(flag: StorageBufferUsage): Boolean = (self.value & flag.value) == flag.value
    }
  }

  /** Godot bitfield `RenderingDevice.BufferCreationBits`. */
  opaque type BufferCreationBits = Long

  object BufferCreationBits {
    final val DeviceAddressBit: BufferCreationBits = 1L.asInstanceOf[BufferCreationBits]
    final val AsStorageBit: BufferCreationBits = 2L.asInstanceOf[BufferCreationBits]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): BufferCreationBits = value.asInstanceOf[BufferCreationBits]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[BufferCreationBits] = scala.IArray[Long](1L, 2L).asInstanceOf[scala.IArray[BufferCreationBits]]

    extension (self: BufferCreationBits)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 1L => "DeviceAddressBit"
        case 2L => "AsStorageBit"
        case other => other.toString
      }
    extension (self: BufferCreationBits) {
      inline def value: Long = self.asInstanceOf[Long]
      inline def |(other: BufferCreationBits): BufferCreationBits = (self.value | other.value).asInstanceOf[BufferCreationBits]
      inline def &(other: BufferCreationBits): BufferCreationBits = (self.value & other.value).asInstanceOf[BufferCreationBits]
      /** Every bit of `flag` is set. */
      inline def has(flag: BufferCreationBits): Boolean = (self.value & flag.value) == flag.value
    }
  }

  /** Godot enum `RenderingDevice.UniformType`. */
  opaque type UniformType <: Long = Long

  object UniformType {
    final val Sampler: UniformType = 0L.asInstanceOf[UniformType]
    final val SamplerWithTexture: UniformType = 1L.asInstanceOf[UniformType]
    final val Texture: UniformType = 2L.asInstanceOf[UniformType]
    final val Image: UniformType = 3L.asInstanceOf[UniformType]
    final val TextureBuffer: UniformType = 4L.asInstanceOf[UniformType]
    final val SamplerWithTextureBuffer: UniformType = 5L.asInstanceOf[UniformType]
    final val ImageBuffer: UniformType = 6L.asInstanceOf[UniformType]
    final val UniformBuffer: UniformType = 7L.asInstanceOf[UniformType]
    final val StorageBuffer: UniformType = 8L.asInstanceOf[UniformType]
    final val InputAttachment: UniformType = 9L.asInstanceOf[UniformType]
    final val UniformBufferDynamic: UniformType = 10L.asInstanceOf[UniformType]
    final val StorageBufferDynamic: UniformType = 11L.asInstanceOf[UniformType]
    final val Max: UniformType = 12L.asInstanceOf[UniformType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): UniformType = value.asInstanceOf[UniformType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[UniformType] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 11L, 12L).asInstanceOf[scala.IArray[UniformType]]

    extension (self: UniformType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Sampler"
        case 1L => "SamplerWithTexture"
        case 2L => "Texture"
        case 3L => "Image"
        case 4L => "TextureBuffer"
        case 5L => "SamplerWithTextureBuffer"
        case 6L => "ImageBuffer"
        case 7L => "UniformBuffer"
        case 8L => "StorageBuffer"
        case 9L => "InputAttachment"
        case 10L => "UniformBufferDynamic"
        case 11L => "StorageBufferDynamic"
        case 12L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingDevice.RenderPrimitive`. */
  opaque type RenderPrimitive <: Long = Long

  object RenderPrimitive {
    final val Points: RenderPrimitive = 0L.asInstanceOf[RenderPrimitive]
    final val Lines: RenderPrimitive = 1L.asInstanceOf[RenderPrimitive]
    final val LinesWithAdjacency: RenderPrimitive = 2L.asInstanceOf[RenderPrimitive]
    final val Linestrips: RenderPrimitive = 3L.asInstanceOf[RenderPrimitive]
    final val LinestripsWithAdjacency: RenderPrimitive = 4L.asInstanceOf[RenderPrimitive]
    final val Triangles: RenderPrimitive = 5L.asInstanceOf[RenderPrimitive]
    final val TrianglesWithAdjacency: RenderPrimitive = 6L.asInstanceOf[RenderPrimitive]
    final val TriangleStrips: RenderPrimitive = 7L.asInstanceOf[RenderPrimitive]
    final val TriangleStripsWithAjacency: RenderPrimitive = 8L.asInstanceOf[RenderPrimitive]
    final val TriangleStripsWithRestartIndex: RenderPrimitive = 9L.asInstanceOf[RenderPrimitive]
    final val TesselationPatch: RenderPrimitive = 10L.asInstanceOf[RenderPrimitive]
    final val Max: RenderPrimitive = 11L.asInstanceOf[RenderPrimitive]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): RenderPrimitive = value.asInstanceOf[RenderPrimitive]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[RenderPrimitive] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 11L).asInstanceOf[scala.IArray[RenderPrimitive]]

    extension (self: RenderPrimitive)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Points"
        case 1L => "Lines"
        case 2L => "LinesWithAdjacency"
        case 3L => "Linestrips"
        case 4L => "LinestripsWithAdjacency"
        case 5L => "Triangles"
        case 6L => "TrianglesWithAdjacency"
        case 7L => "TriangleStrips"
        case 8L => "TriangleStripsWithAjacency"
        case 9L => "TriangleStripsWithRestartIndex"
        case 10L => "TesselationPatch"
        case 11L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingDevice.PolygonCullMode`. */
  opaque type PolygonCullMode <: Long = Long

  object PolygonCullMode {
    final val Disabled: PolygonCullMode = 0L.asInstanceOf[PolygonCullMode]
    final val Front: PolygonCullMode = 1L.asInstanceOf[PolygonCullMode]
    final val Back: PolygonCullMode = 2L.asInstanceOf[PolygonCullMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): PolygonCullMode = value.asInstanceOf[PolygonCullMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[PolygonCullMode] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[PolygonCullMode]]

    extension (self: PolygonCullMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Disabled"
        case 1L => "Front"
        case 2L => "Back"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingDevice.PolygonFrontFace`. */
  opaque type PolygonFrontFace <: Long = Long

  object PolygonFrontFace {
    final val Clockwise: PolygonFrontFace = 0L.asInstanceOf[PolygonFrontFace]
    final val CounterClockwise: PolygonFrontFace = 1L.asInstanceOf[PolygonFrontFace]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): PolygonFrontFace = value.asInstanceOf[PolygonFrontFace]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[PolygonFrontFace] = scala.IArray[Long](0L, 1L).asInstanceOf[scala.IArray[PolygonFrontFace]]

    extension (self: PolygonFrontFace)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Clockwise"
        case 1L => "CounterClockwise"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingDevice.StencilOperation`. */
  opaque type StencilOperation <: Long = Long

  object StencilOperation {
    final val Keep: StencilOperation = 0L.asInstanceOf[StencilOperation]
    final val Zero: StencilOperation = 1L.asInstanceOf[StencilOperation]
    final val Replace: StencilOperation = 2L.asInstanceOf[StencilOperation]
    final val IncrementAndClamp: StencilOperation = 3L.asInstanceOf[StencilOperation]
    final val DecrementAndClamp: StencilOperation = 4L.asInstanceOf[StencilOperation]
    final val Invert: StencilOperation = 5L.asInstanceOf[StencilOperation]
    final val IncrementAndWrap: StencilOperation = 6L.asInstanceOf[StencilOperation]
    final val DecrementAndWrap: StencilOperation = 7L.asInstanceOf[StencilOperation]
    final val Max: StencilOperation = 8L.asInstanceOf[StencilOperation]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): StencilOperation = value.asInstanceOf[StencilOperation]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[StencilOperation] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L).asInstanceOf[scala.IArray[StencilOperation]]

    extension (self: StencilOperation)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Keep"
        case 1L => "Zero"
        case 2L => "Replace"
        case 3L => "IncrementAndClamp"
        case 4L => "DecrementAndClamp"
        case 5L => "Invert"
        case 6L => "IncrementAndWrap"
        case 7L => "DecrementAndWrap"
        case 8L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingDevice.CompareOperator`. */
  opaque type CompareOperator <: Long = Long

  object CompareOperator {
    final val Never: CompareOperator = 0L.asInstanceOf[CompareOperator]
    final val Less: CompareOperator = 1L.asInstanceOf[CompareOperator]
    final val Equal: CompareOperator = 2L.asInstanceOf[CompareOperator]
    final val LessOrEqual: CompareOperator = 3L.asInstanceOf[CompareOperator]
    final val Greater: CompareOperator = 4L.asInstanceOf[CompareOperator]
    final val NotEqual: CompareOperator = 5L.asInstanceOf[CompareOperator]
    final val GreaterOrEqual: CompareOperator = 6L.asInstanceOf[CompareOperator]
    final val Always: CompareOperator = 7L.asInstanceOf[CompareOperator]
    final val Max: CompareOperator = 8L.asInstanceOf[CompareOperator]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): CompareOperator = value.asInstanceOf[CompareOperator]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[CompareOperator] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L).asInstanceOf[scala.IArray[CompareOperator]]

    extension (self: CompareOperator)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Never"
        case 1L => "Less"
        case 2L => "Equal"
        case 3L => "LessOrEqual"
        case 4L => "Greater"
        case 5L => "NotEqual"
        case 6L => "GreaterOrEqual"
        case 7L => "Always"
        case 8L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingDevice.LogicOperation`. */
  opaque type LogicOperation <: Long = Long

  object LogicOperation {
    final val Clear: LogicOperation = 0L.asInstanceOf[LogicOperation]
    final val And: LogicOperation = 1L.asInstanceOf[LogicOperation]
    final val AndReverse: LogicOperation = 2L.asInstanceOf[LogicOperation]
    final val Copy: LogicOperation = 3L.asInstanceOf[LogicOperation]
    final val AndInverted: LogicOperation = 4L.asInstanceOf[LogicOperation]
    final val NoOp: LogicOperation = 5L.asInstanceOf[LogicOperation]
    final val Xor: LogicOperation = 6L.asInstanceOf[LogicOperation]
    final val Or: LogicOperation = 7L.asInstanceOf[LogicOperation]
    final val Nor: LogicOperation = 8L.asInstanceOf[LogicOperation]
    final val Equivalent: LogicOperation = 9L.asInstanceOf[LogicOperation]
    final val Invert: LogicOperation = 10L.asInstanceOf[LogicOperation]
    final val OrReverse: LogicOperation = 11L.asInstanceOf[LogicOperation]
    final val CopyInverted: LogicOperation = 12L.asInstanceOf[LogicOperation]
    final val OrInverted: LogicOperation = 13L.asInstanceOf[LogicOperation]
    final val Nand: LogicOperation = 14L.asInstanceOf[LogicOperation]
    final val Set: LogicOperation = 15L.asInstanceOf[LogicOperation]
    final val Max: LogicOperation = 16L.asInstanceOf[LogicOperation]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): LogicOperation = value.asInstanceOf[LogicOperation]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[LogicOperation] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 11L, 12L, 13L, 14L, 15L, 16L).asInstanceOf[scala.IArray[LogicOperation]]

    extension (self: LogicOperation)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Clear"
        case 1L => "And"
        case 2L => "AndReverse"
        case 3L => "Copy"
        case 4L => "AndInverted"
        case 5L => "NoOp"
        case 6L => "Xor"
        case 7L => "Or"
        case 8L => "Nor"
        case 9L => "Equivalent"
        case 10L => "Invert"
        case 11L => "OrReverse"
        case 12L => "CopyInverted"
        case 13L => "OrInverted"
        case 14L => "Nand"
        case 15L => "Set"
        case 16L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingDevice.BlendFactor`. */
  opaque type BlendFactor <: Long = Long

  object BlendFactor {
    final val Zero: BlendFactor = 0L.asInstanceOf[BlendFactor]
    final val One: BlendFactor = 1L.asInstanceOf[BlendFactor]
    final val SrcColor: BlendFactor = 2L.asInstanceOf[BlendFactor]
    final val OneMinusSrcColor: BlendFactor = 3L.asInstanceOf[BlendFactor]
    final val DstColor: BlendFactor = 4L.asInstanceOf[BlendFactor]
    final val OneMinusDstColor: BlendFactor = 5L.asInstanceOf[BlendFactor]
    final val SrcAlpha: BlendFactor = 6L.asInstanceOf[BlendFactor]
    final val OneMinusSrcAlpha: BlendFactor = 7L.asInstanceOf[BlendFactor]
    final val DstAlpha: BlendFactor = 8L.asInstanceOf[BlendFactor]
    final val OneMinusDstAlpha: BlendFactor = 9L.asInstanceOf[BlendFactor]
    final val ConstantColor: BlendFactor = 10L.asInstanceOf[BlendFactor]
    final val OneMinusConstantColor: BlendFactor = 11L.asInstanceOf[BlendFactor]
    final val ConstantAlpha: BlendFactor = 12L.asInstanceOf[BlendFactor]
    final val OneMinusConstantAlpha: BlendFactor = 13L.asInstanceOf[BlendFactor]
    final val SrcAlphaSaturate: BlendFactor = 14L.asInstanceOf[BlendFactor]
    final val Src1Color: BlendFactor = 15L.asInstanceOf[BlendFactor]
    final val OneMinusSrc1Color: BlendFactor = 16L.asInstanceOf[BlendFactor]
    final val Src1Alpha: BlendFactor = 17L.asInstanceOf[BlendFactor]
    final val OneMinusSrc1Alpha: BlendFactor = 18L.asInstanceOf[BlendFactor]
    final val Max: BlendFactor = 19L.asInstanceOf[BlendFactor]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): BlendFactor = value.asInstanceOf[BlendFactor]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[BlendFactor] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 11L, 12L, 13L, 14L, 15L, 16L, 17L, 18L, 19L).asInstanceOf[scala.IArray[BlendFactor]]

    extension (self: BlendFactor)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Zero"
        case 1L => "One"
        case 2L => "SrcColor"
        case 3L => "OneMinusSrcColor"
        case 4L => "DstColor"
        case 5L => "OneMinusDstColor"
        case 6L => "SrcAlpha"
        case 7L => "OneMinusSrcAlpha"
        case 8L => "DstAlpha"
        case 9L => "OneMinusDstAlpha"
        case 10L => "ConstantColor"
        case 11L => "OneMinusConstantColor"
        case 12L => "ConstantAlpha"
        case 13L => "OneMinusConstantAlpha"
        case 14L => "SrcAlphaSaturate"
        case 15L => "Src1Color"
        case 16L => "OneMinusSrc1Color"
        case 17L => "Src1Alpha"
        case 18L => "OneMinusSrc1Alpha"
        case 19L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingDevice.BlendOperation`. */
  opaque type BlendOperation <: Long = Long

  object BlendOperation {
    final val Add: BlendOperation = 0L.asInstanceOf[BlendOperation]
    final val Subtract: BlendOperation = 1L.asInstanceOf[BlendOperation]
    final val ReverseSubtract: BlendOperation = 2L.asInstanceOf[BlendOperation]
    final val Minimum: BlendOperation = 3L.asInstanceOf[BlendOperation]
    final val Maximum: BlendOperation = 4L.asInstanceOf[BlendOperation]
    final val Max: BlendOperation = 5L.asInstanceOf[BlendOperation]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): BlendOperation = value.asInstanceOf[BlendOperation]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[BlendOperation] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L).asInstanceOf[scala.IArray[BlendOperation]]

    extension (self: BlendOperation)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Add"
        case 1L => "Subtract"
        case 2L => "ReverseSubtract"
        case 3L => "Minimum"
        case 4L => "Maximum"
        case 5L => "Max"
        case other => other.toString
      }
  }

  /** Godot bitfield `RenderingDevice.PipelineDynamicStateFlags`. */
  opaque type PipelineDynamicStateFlags = Long

  object PipelineDynamicStateFlags {
    final val LineWidth: PipelineDynamicStateFlags = 1L.asInstanceOf[PipelineDynamicStateFlags]
    final val DepthBias: PipelineDynamicStateFlags = 2L.asInstanceOf[PipelineDynamicStateFlags]
    final val BlendConstants: PipelineDynamicStateFlags = 4L.asInstanceOf[PipelineDynamicStateFlags]
    final val DepthBounds: PipelineDynamicStateFlags = 8L.asInstanceOf[PipelineDynamicStateFlags]
    final val StencilCompareMask: PipelineDynamicStateFlags = 16L.asInstanceOf[PipelineDynamicStateFlags]
    final val StencilWriteMask: PipelineDynamicStateFlags = 32L.asInstanceOf[PipelineDynamicStateFlags]
    final val StencilReference: PipelineDynamicStateFlags = 64L.asInstanceOf[PipelineDynamicStateFlags]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): PipelineDynamicStateFlags = value.asInstanceOf[PipelineDynamicStateFlags]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[PipelineDynamicStateFlags] = scala.IArray[Long](1L, 2L, 4L, 8L, 16L, 32L, 64L).asInstanceOf[scala.IArray[PipelineDynamicStateFlags]]

    extension (self: PipelineDynamicStateFlags)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 1L => "LineWidth"
        case 2L => "DepthBias"
        case 4L => "BlendConstants"
        case 8L => "DepthBounds"
        case 16L => "StencilCompareMask"
        case 32L => "StencilWriteMask"
        case 64L => "StencilReference"
        case other => other.toString
      }
    extension (self: PipelineDynamicStateFlags) {
      inline def value: Long = self.asInstanceOf[Long]
      inline def |(other: PipelineDynamicStateFlags): PipelineDynamicStateFlags = (self.value | other.value).asInstanceOf[PipelineDynamicStateFlags]
      inline def &(other: PipelineDynamicStateFlags): PipelineDynamicStateFlags = (self.value & other.value).asInstanceOf[PipelineDynamicStateFlags]
      /** Every bit of `flag` is set. */
      inline def has(flag: PipelineDynamicStateFlags): Boolean = (self.value & flag.value) == flag.value
    }
  }

  /** Godot enum `RenderingDevice.InitialAction`. */
  opaque type InitialAction <: Long = Long

  object InitialAction {
    final val Load: InitialAction = 0L.asInstanceOf[InitialAction]
    final val Clear: InitialAction = 1L.asInstanceOf[InitialAction]
    final val Discard: InitialAction = 2L.asInstanceOf[InitialAction]
    final val Max: InitialAction = 3L.asInstanceOf[InitialAction]
    final val ClearRegion: InitialAction = 1L.asInstanceOf[InitialAction]
    final val ClearRegionContinue: InitialAction = 1L.asInstanceOf[InitialAction]
    final val Keep: InitialAction = 0L.asInstanceOf[InitialAction]
    final val Drop: InitialAction = 2L.asInstanceOf[InitialAction]
    final val Continue: InitialAction = 0L.asInstanceOf[InitialAction]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): InitialAction = value.asInstanceOf[InitialAction]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[InitialAction] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[InitialAction]]

    extension (self: InitialAction)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Load"
        case 1L => "Clear"
        case 2L => "Discard"
        case 3L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingDevice.FinalAction`. */
  opaque type FinalAction <: Long = Long

  object FinalAction {
    final val Store: FinalAction = 0L.asInstanceOf[FinalAction]
    final val Discard: FinalAction = 1L.asInstanceOf[FinalAction]
    final val Max: FinalAction = 2L.asInstanceOf[FinalAction]
    final val Read: FinalAction = 0L.asInstanceOf[FinalAction]
    final val Continue: FinalAction = 0L.asInstanceOf[FinalAction]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): FinalAction = value.asInstanceOf[FinalAction]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[FinalAction] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[FinalAction]]

    extension (self: FinalAction)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Store"
        case 1L => "Discard"
        case 2L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingDevice.ShaderStage`. */
  opaque type ShaderStage <: Long = Long

  object ShaderStage {
    final val Vertex: ShaderStage = 0L.asInstanceOf[ShaderStage]
    final val Fragment: ShaderStage = 1L.asInstanceOf[ShaderStage]
    final val TesselationControl: ShaderStage = 2L.asInstanceOf[ShaderStage]
    final val TesselationEvaluation: ShaderStage = 3L.asInstanceOf[ShaderStage]
    final val Compute: ShaderStage = 4L.asInstanceOf[ShaderStage]
    final val Max: ShaderStage = 5L.asInstanceOf[ShaderStage]
    final val VertexBit: ShaderStage = 1L.asInstanceOf[ShaderStage]
    final val FragmentBit: ShaderStage = 2L.asInstanceOf[ShaderStage]
    final val TesselationControlBit: ShaderStage = 4L.asInstanceOf[ShaderStage]
    final val TesselationEvaluationBit: ShaderStage = 8L.asInstanceOf[ShaderStage]
    final val ComputeBit: ShaderStage = 16L.asInstanceOf[ShaderStage]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ShaderStage = value.asInstanceOf[ShaderStage]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ShaderStage] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 8L, 16L).asInstanceOf[scala.IArray[ShaderStage]]

    extension (self: ShaderStage)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Vertex"
        case 1L => "Fragment"
        case 2L => "TesselationControl"
        case 3L => "TesselationEvaluation"
        case 4L => "Compute"
        case 5L => "Max"
        case 8L => "TesselationEvaluationBit"
        case 16L => "ComputeBit"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingDevice.ShaderLanguage`. */
  opaque type ShaderLanguage <: Long = Long

  object ShaderLanguage {
    final val Glsl: ShaderLanguage = 0L.asInstanceOf[ShaderLanguage]
    final val Hlsl: ShaderLanguage = 1L.asInstanceOf[ShaderLanguage]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ShaderLanguage = value.asInstanceOf[ShaderLanguage]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ShaderLanguage] = scala.IArray[Long](0L, 1L).asInstanceOf[scala.IArray[ShaderLanguage]]

    extension (self: ShaderLanguage)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Glsl"
        case 1L => "Hlsl"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingDevice.PipelineSpecializationConstantType`. */
  opaque type PipelineSpecializationConstantType <: Long = Long

  object PipelineSpecializationConstantType {
    final val Bool: PipelineSpecializationConstantType = 0L.asInstanceOf[PipelineSpecializationConstantType]
    final val Int: PipelineSpecializationConstantType = 1L.asInstanceOf[PipelineSpecializationConstantType]
    final val Float: PipelineSpecializationConstantType = 2L.asInstanceOf[PipelineSpecializationConstantType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): PipelineSpecializationConstantType = value.asInstanceOf[PipelineSpecializationConstantType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[PipelineSpecializationConstantType] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[PipelineSpecializationConstantType]]

    extension (self: PipelineSpecializationConstantType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Bool"
        case 1L => "Int"
        case 2L => "Float"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingDevice.Features`. */
  opaque type Features <: Long = Long

  object Features {
    final val MetalfxSpatial: Features = 3L.asInstanceOf[Features]
    final val MetalfxTemporal: Features = 4L.asInstanceOf[Features]
    final val BufferDeviceAddress: Features = 6L.asInstanceOf[Features]
    final val ImageAtomic32Bit: Features = 7L.asInstanceOf[Features]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Features = value.asInstanceOf[Features]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Features] = scala.IArray[Long](3L, 4L, 6L, 7L).asInstanceOf[scala.IArray[Features]]

    extension (self: Features)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 3L => "MetalfxSpatial"
        case 4L => "MetalfxTemporal"
        case 6L => "BufferDeviceAddress"
        case 7L => "ImageAtomic32Bit"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingDevice.Limit`. */
  opaque type Limit <: Long = Long

  object Limit {
    final val MaxBoundUniformSets: Limit = 0L.asInstanceOf[Limit]
    final val MaxFramebufferColorAttachments: Limit = 1L.asInstanceOf[Limit]
    final val MaxTexturesPerUniformSet: Limit = 2L.asInstanceOf[Limit]
    final val MaxSamplersPerUniformSet: Limit = 3L.asInstanceOf[Limit]
    final val MaxStorageBuffersPerUniformSet: Limit = 4L.asInstanceOf[Limit]
    final val MaxStorageImagesPerUniformSet: Limit = 5L.asInstanceOf[Limit]
    final val MaxUniformBuffersPerUniformSet: Limit = 6L.asInstanceOf[Limit]
    final val MaxDrawIndexedIndex: Limit = 7L.asInstanceOf[Limit]
    final val MaxFramebufferHeight: Limit = 8L.asInstanceOf[Limit]
    final val MaxFramebufferWidth: Limit = 9L.asInstanceOf[Limit]
    final val MaxTextureArrayLayers: Limit = 10L.asInstanceOf[Limit]
    final val MaxTextureSize1d: Limit = 11L.asInstanceOf[Limit]
    final val MaxTextureSize2d: Limit = 12L.asInstanceOf[Limit]
    final val MaxTextureSize3d: Limit = 13L.asInstanceOf[Limit]
    final val MaxTextureSizeCube: Limit = 14L.asInstanceOf[Limit]
    final val MaxTexturesPerShaderStage: Limit = 15L.asInstanceOf[Limit]
    final val MaxSamplersPerShaderStage: Limit = 16L.asInstanceOf[Limit]
    final val MaxStorageBuffersPerShaderStage: Limit = 17L.asInstanceOf[Limit]
    final val MaxStorageImagesPerShaderStage: Limit = 18L.asInstanceOf[Limit]
    final val MaxUniformBuffersPerShaderStage: Limit = 19L.asInstanceOf[Limit]
    final val MaxPushConstantSize: Limit = 20L.asInstanceOf[Limit]
    final val MaxUniformBufferSize: Limit = 21L.asInstanceOf[Limit]
    final val MaxVertexInputAttributeOffset: Limit = 22L.asInstanceOf[Limit]
    final val MaxVertexInputAttributes: Limit = 23L.asInstanceOf[Limit]
    final val MaxVertexInputBindings: Limit = 24L.asInstanceOf[Limit]
    final val MaxVertexInputBindingStride: Limit = 25L.asInstanceOf[Limit]
    final val MinUniformBufferOffsetAlignment: Limit = 26L.asInstanceOf[Limit]
    final val MaxComputeSharedMemorySize: Limit = 27L.asInstanceOf[Limit]
    final val MaxComputeWorkgroupCountX: Limit = 28L.asInstanceOf[Limit]
    final val MaxComputeWorkgroupCountY: Limit = 29L.asInstanceOf[Limit]
    final val MaxComputeWorkgroupCountZ: Limit = 30L.asInstanceOf[Limit]
    final val MaxComputeWorkgroupInvocations: Limit = 31L.asInstanceOf[Limit]
    final val MaxComputeWorkgroupSizeX: Limit = 32L.asInstanceOf[Limit]
    final val MaxComputeWorkgroupSizeY: Limit = 33L.asInstanceOf[Limit]
    final val MaxComputeWorkgroupSizeZ: Limit = 34L.asInstanceOf[Limit]
    final val MaxViewportDimensionsX: Limit = 35L.asInstanceOf[Limit]
    final val MaxViewportDimensionsY: Limit = 36L.asInstanceOf[Limit]
    final val MetalfxTemporalScalerMinScale: Limit = 46L.asInstanceOf[Limit]
    final val MetalfxTemporalScalerMaxScale: Limit = 47L.asInstanceOf[Limit]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Limit = value.asInstanceOf[Limit]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Limit] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 11L, 12L, 13L, 14L, 15L, 16L, 17L, 18L, 19L, 20L, 21L, 22L, 23L, 24L, 25L, 26L, 27L, 28L, 29L, 30L, 31L, 32L, 33L, 34L, 35L, 36L, 46L, 47L).asInstanceOf[scala.IArray[Limit]]

    extension (self: Limit)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "MaxBoundUniformSets"
        case 1L => "MaxFramebufferColorAttachments"
        case 2L => "MaxTexturesPerUniformSet"
        case 3L => "MaxSamplersPerUniformSet"
        case 4L => "MaxStorageBuffersPerUniformSet"
        case 5L => "MaxStorageImagesPerUniformSet"
        case 6L => "MaxUniformBuffersPerUniformSet"
        case 7L => "MaxDrawIndexedIndex"
        case 8L => "MaxFramebufferHeight"
        case 9L => "MaxFramebufferWidth"
        case 10L => "MaxTextureArrayLayers"
        case 11L => "MaxTextureSize1d"
        case 12L => "MaxTextureSize2d"
        case 13L => "MaxTextureSize3d"
        case 14L => "MaxTextureSizeCube"
        case 15L => "MaxTexturesPerShaderStage"
        case 16L => "MaxSamplersPerShaderStage"
        case 17L => "MaxStorageBuffersPerShaderStage"
        case 18L => "MaxStorageImagesPerShaderStage"
        case 19L => "MaxUniformBuffersPerShaderStage"
        case 20L => "MaxPushConstantSize"
        case 21L => "MaxUniformBufferSize"
        case 22L => "MaxVertexInputAttributeOffset"
        case 23L => "MaxVertexInputAttributes"
        case 24L => "MaxVertexInputBindings"
        case 25L => "MaxVertexInputBindingStride"
        case 26L => "MinUniformBufferOffsetAlignment"
        case 27L => "MaxComputeSharedMemorySize"
        case 28L => "MaxComputeWorkgroupCountX"
        case 29L => "MaxComputeWorkgroupCountY"
        case 30L => "MaxComputeWorkgroupCountZ"
        case 31L => "MaxComputeWorkgroupInvocations"
        case 32L => "MaxComputeWorkgroupSizeX"
        case 33L => "MaxComputeWorkgroupSizeY"
        case 34L => "MaxComputeWorkgroupSizeZ"
        case 35L => "MaxViewportDimensionsX"
        case 36L => "MaxViewportDimensionsY"
        case 46L => "MetalfxTemporalScalerMinScale"
        case 47L => "MetalfxTemporalScalerMaxScale"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingDevice.MemoryType`. */
  opaque type MemoryType <: Long = Long

  object MemoryType {
    final val Textures: MemoryType = 0L.asInstanceOf[MemoryType]
    final val Buffers: MemoryType = 1L.asInstanceOf[MemoryType]
    final val Total: MemoryType = 2L.asInstanceOf[MemoryType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): MemoryType = value.asInstanceOf[MemoryType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[MemoryType] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[MemoryType]]

    extension (self: MemoryType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Textures"
        case 1L => "Buffers"
        case 2L => "Total"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingDevice.BreadcrumbMarker`. */
  opaque type BreadcrumbMarker <: Long = Long

  object BreadcrumbMarker {
    final val None: BreadcrumbMarker = 0L.asInstanceOf[BreadcrumbMarker]
    final val ReflectionProbes: BreadcrumbMarker = 65536L.asInstanceOf[BreadcrumbMarker]
    final val SkyPass: BreadcrumbMarker = 131072L.asInstanceOf[BreadcrumbMarker]
    final val LightmapperPass: BreadcrumbMarker = 196608L.asInstanceOf[BreadcrumbMarker]
    final val ShadowPassDirectional: BreadcrumbMarker = 262144L.asInstanceOf[BreadcrumbMarker]
    final val ShadowPassCube: BreadcrumbMarker = 327680L.asInstanceOf[BreadcrumbMarker]
    final val OpaquePass: BreadcrumbMarker = 393216L.asInstanceOf[BreadcrumbMarker]
    final val AlphaPass: BreadcrumbMarker = 458752L.asInstanceOf[BreadcrumbMarker]
    final val TransparentPass: BreadcrumbMarker = 524288L.asInstanceOf[BreadcrumbMarker]
    final val PostProcessingPass: BreadcrumbMarker = 589824L.asInstanceOf[BreadcrumbMarker]
    final val BlitPass: BreadcrumbMarker = 655360L.asInstanceOf[BreadcrumbMarker]
    final val UiPass: BreadcrumbMarker = 720896L.asInstanceOf[BreadcrumbMarker]
    final val DebugPass: BreadcrumbMarker = 786432L.asInstanceOf[BreadcrumbMarker]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): BreadcrumbMarker = value.asInstanceOf[BreadcrumbMarker]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[BreadcrumbMarker] = scala.IArray[Long](0L, 65536L, 131072L, 196608L, 262144L, 327680L, 393216L, 458752L, 524288L, 589824L, 655360L, 720896L, 786432L).asInstanceOf[scala.IArray[BreadcrumbMarker]]

    extension (self: BreadcrumbMarker)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "None"
        case 65536L => "ReflectionProbes"
        case 131072L => "SkyPass"
        case 196608L => "LightmapperPass"
        case 262144L => "ShadowPassDirectional"
        case 327680L => "ShadowPassCube"
        case 393216L => "OpaquePass"
        case 458752L => "AlphaPass"
        case 524288L => "TransparentPass"
        case 589824L => "PostProcessingPass"
        case 655360L => "BlitPass"
        case 720896L => "UiPass"
        case 786432L => "DebugPass"
        case other => other.toString
      }
  }

  /** Godot bitfield `RenderingDevice.DrawFlags`. */
  opaque type DrawFlags = Long

  object DrawFlags {
    final val DefaultAll: DrawFlags = 0L.asInstanceOf[DrawFlags]
    final val ClearColor0: DrawFlags = 1L.asInstanceOf[DrawFlags]
    final val ClearColor1: DrawFlags = 2L.asInstanceOf[DrawFlags]
    final val ClearColor2: DrawFlags = 4L.asInstanceOf[DrawFlags]
    final val ClearColor3: DrawFlags = 8L.asInstanceOf[DrawFlags]
    final val ClearColor4: DrawFlags = 16L.asInstanceOf[DrawFlags]
    final val ClearColor5: DrawFlags = 32L.asInstanceOf[DrawFlags]
    final val ClearColor6: DrawFlags = 64L.asInstanceOf[DrawFlags]
    final val ClearColor7: DrawFlags = 128L.asInstanceOf[DrawFlags]
    final val ClearColorMask: DrawFlags = 255L.asInstanceOf[DrawFlags]
    final val ClearColorAll: DrawFlags = 255L.asInstanceOf[DrawFlags]
    final val IgnoreColor0: DrawFlags = 256L.asInstanceOf[DrawFlags]
    final val IgnoreColor1: DrawFlags = 512L.asInstanceOf[DrawFlags]
    final val IgnoreColor2: DrawFlags = 1024L.asInstanceOf[DrawFlags]
    final val IgnoreColor3: DrawFlags = 2048L.asInstanceOf[DrawFlags]
    final val IgnoreColor4: DrawFlags = 4096L.asInstanceOf[DrawFlags]
    final val IgnoreColor5: DrawFlags = 8192L.asInstanceOf[DrawFlags]
    final val IgnoreColor6: DrawFlags = 16384L.asInstanceOf[DrawFlags]
    final val IgnoreColor7: DrawFlags = 32768L.asInstanceOf[DrawFlags]
    final val IgnoreColorMask: DrawFlags = 65280L.asInstanceOf[DrawFlags]
    final val IgnoreColorAll: DrawFlags = 65280L.asInstanceOf[DrawFlags]
    final val ClearDepth: DrawFlags = 65536L.asInstanceOf[DrawFlags]
    final val IgnoreDepth: DrawFlags = 131072L.asInstanceOf[DrawFlags]
    final val ClearStencil: DrawFlags = 262144L.asInstanceOf[DrawFlags]
    final val IgnoreStencil: DrawFlags = 524288L.asInstanceOf[DrawFlags]
    final val ClearAll: DrawFlags = 327935L.asInstanceOf[DrawFlags]
    final val IgnoreAll: DrawFlags = 720640L.asInstanceOf[DrawFlags]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): DrawFlags = value.asInstanceOf[DrawFlags]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[DrawFlags] = scala.IArray[Long](0L, 1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 255L, 256L, 512L, 1024L, 2048L, 4096L, 8192L, 16384L, 32768L, 65280L, 65536L, 131072L, 262144L, 327935L, 524288L, 720640L).asInstanceOf[scala.IArray[DrawFlags]]

    extension (self: DrawFlags)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "DefaultAll"
        case 1L => "ClearColor0"
        case 2L => "ClearColor1"
        case 4L => "ClearColor2"
        case 8L => "ClearColor3"
        case 16L => "ClearColor4"
        case 32L => "ClearColor5"
        case 64L => "ClearColor6"
        case 128L => "ClearColor7"
        case 255L => "ClearColorMask"
        case 256L => "IgnoreColor0"
        case 512L => "IgnoreColor1"
        case 1024L => "IgnoreColor2"
        case 2048L => "IgnoreColor3"
        case 4096L => "IgnoreColor4"
        case 8192L => "IgnoreColor5"
        case 16384L => "IgnoreColor6"
        case 32768L => "IgnoreColor7"
        case 65280L => "IgnoreColorMask"
        case 65536L => "ClearDepth"
        case 131072L => "IgnoreDepth"
        case 262144L => "ClearStencil"
        case 327935L => "ClearAll"
        case 524288L => "IgnoreStencil"
        case 720640L => "IgnoreAll"
        case other => other.toString
      }
    extension (self: DrawFlags) {
      inline def value: Long = self.asInstanceOf[Long]
      inline def |(other: DrawFlags): DrawFlags = (self.value | other.value).asInstanceOf[DrawFlags]
      inline def &(other: DrawFlags): DrawFlags = (self.value & other.value).asInstanceOf[DrawFlags]
      /** Every bit of `flag` is set. */
      inline def has(flag: DrawFlags): Boolean = (self.value & flag.value) == flag.value
    }
  }
}
