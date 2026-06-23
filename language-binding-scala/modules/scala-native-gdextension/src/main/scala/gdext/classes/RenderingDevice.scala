package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `RenderingDevice`, extends `Object`. */
abstract class RenderingDevice extends Object {

  /** RenderingDevice.texture_is_format_supported_for_usage */
  final def textureIsFormatSupportedForUsage(format: Long, usage_flags: Long): Boolean =
    Ptrcall.call2[Long, Long, Boolean](MethodBind.get("RenderingDevice", "texture_is_format_supported_for_usage", 2592520478L), hostObject.objectPtr, format, usage_flags)

  /** RenderingDevice.framebuffer_format_create_empty */
  final def framebufferFormatCreateEmpty(samples: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("RenderingDevice", "framebuffer_format_create_empty", 555930169L), hostObject.objectPtr, samples)

  /** RenderingDevice.framebuffer_format_get_texture_samples */
  final def framebufferFormatGetTextureSamples(format: Long, render_pass: Long): Long =
    Ptrcall.call2[Long, Long, Long](MethodBind.get("RenderingDevice", "framebuffer_format_get_texture_samples", 4223391010L), hostObject.objectPtr, format, render_pass)

  /** RenderingDevice.sampler_is_format_supported_for_filter */
  final def samplerIsFormatSupportedForFilter(format: Long, sampler_filter: Long): Boolean =
    Ptrcall.call2[Long, Long, Boolean](MethodBind.get("RenderingDevice", "sampler_is_format_supported_for_filter", 2247922238L), hostObject.objectPtr, format, sampler_filter)

  /** RenderingDevice.shader_compile_spirv_from_source */
  final def shaderCompileSpirvFromSource(shader_source: RDShaderSource, allow_cache: Boolean): GodotObject =
    Ptrcall.call2[GodotObject, Boolean, GodotObject](MethodBind.get("RenderingDevice", "shader_compile_spirv_from_source", 1178973306L), hostObject.objectPtr, shader_source.hostObject, allow_cache)

  /** RenderingDevice.screen_get_width */
  final def screenGetWidth(screen: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("RenderingDevice", "screen_get_width", 1591665591L), hostObject.objectPtr, screen)

  /** RenderingDevice.screen_get_height */
  final def screenGetHeight(screen: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("RenderingDevice", "screen_get_height", 1591665591L), hostObject.objectPtr, screen)

  /** RenderingDevice.screen_get_framebuffer_format */
  final def screenGetFramebufferFormat(screen: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("RenderingDevice", "screen_get_framebuffer_format", 1591665591L), hostObject.objectPtr, screen)

  /** RenderingDevice.draw_list_begin_for_screen */
  final def drawListBeginForScreen(screen: Long, clear_color: gdext.builtin.Color): Long =
    Ptrcall.call2[Long, gdext.builtin.Color, Long](MethodBind.get("RenderingDevice", "draw_list_begin_for_screen", 3988079995L), hostObject.objectPtr, screen, clear_color)

  /** RenderingDevice.draw_list_set_blend_constants */
  final def drawListSetBlendConstants(draw_list: Long, color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid2(MethodBind.get("RenderingDevice", "draw_list_set_blend_constants", 2878471219L), hostObject.objectPtr, draw_list, color)

  /** RenderingDevice.draw_list_draw */
  final def drawListDraw(draw_list: Long, use_indices: Boolean, instances: Long, procedural_vertex_count: Long): Unit =
    Ptrcall.callVoid4(MethodBind.get("RenderingDevice", "draw_list_draw", 4230067973L), hostObject.objectPtr, draw_list, use_indices, instances, procedural_vertex_count)

  /** RenderingDevice.draw_list_enable_scissor */
  final def drawListEnableScissor(draw_list: Long, rect: gdext.builtin.Rect2): Unit =
    Ptrcall.callVoid2(MethodBind.get("RenderingDevice", "draw_list_enable_scissor", 244650101L), hostObject.objectPtr, draw_list, rect)

  /** RenderingDevice.draw_list_disable_scissor */
  final def drawListDisableScissor(draw_list: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RenderingDevice", "draw_list_disable_scissor", 1286410249L), hostObject.objectPtr, draw_list)

  /** RenderingDevice.draw_list_switch_to_next_pass */
  final def drawListSwitchToNextPass(): Long =
    Ptrcall.call0[Long](MethodBind.get("RenderingDevice", "draw_list_switch_to_next_pass", 2455072627L), hostObject.objectPtr)

  /** RenderingDevice.draw_list_end */
  final def drawListEnd(): Unit =
    Ptrcall.callVoid0(MethodBind.get("RenderingDevice", "draw_list_end", 3218959716L), hostObject.objectPtr)

  /** RenderingDevice.compute_list_begin */
  final def computeListBegin(): Long =
    Ptrcall.call0[Long](MethodBind.get("RenderingDevice", "compute_list_begin", 2455072627L), hostObject.objectPtr)

  /** RenderingDevice.compute_list_dispatch */
  final def computeListDispatch(compute_list: Long, x_groups: Long, y_groups: Long, z_groups: Long): Unit =
    Ptrcall.callVoid4(MethodBind.get("RenderingDevice", "compute_list_dispatch", 4275841770L), hostObject.objectPtr, compute_list, x_groups, y_groups, z_groups)

  /** RenderingDevice.compute_list_add_barrier */
  final def computeListAddBarrier(compute_list: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RenderingDevice", "compute_list_add_barrier", 1286410249L), hostObject.objectPtr, compute_list)

  /** RenderingDevice.compute_list_end */
  final def computeListEnd(): Unit =
    Ptrcall.callVoid0(MethodBind.get("RenderingDevice", "compute_list_end", 3218959716L), hostObject.objectPtr)

  /** RenderingDevice.capture_timestamp */
  final def captureTimestamp(name: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("RenderingDevice", "capture_timestamp", 83702148L), hostObject.objectPtr, name)

  /** RenderingDevice.get_captured_timestamps_count */
  final def getCapturedTimestampsCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("RenderingDevice", "get_captured_timestamps_count", 3905245786L), hostObject.objectPtr)

  /** RenderingDevice.get_captured_timestamps_frame */
  final def getCapturedTimestampsFrame(): Long =
    Ptrcall.call0[Long](MethodBind.get("RenderingDevice", "get_captured_timestamps_frame", 3905245786L), hostObject.objectPtr)

  /** RenderingDevice.get_captured_timestamp_gpu_time */
  final def getCapturedTimestampGpuTime(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("RenderingDevice", "get_captured_timestamp_gpu_time", 923996154L), hostObject.objectPtr, index)

  /** RenderingDevice.get_captured_timestamp_cpu_time */
  final def getCapturedTimestampCpuTime(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("RenderingDevice", "get_captured_timestamp_cpu_time", 923996154L), hostObject.objectPtr, index)

  /** RenderingDevice.get_captured_timestamp_name */
  final def getCapturedTimestampName(index: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("RenderingDevice", "get_captured_timestamp_name", 844755477L), hostObject.objectPtr, index)

  /** RenderingDevice.has_feature */
  final def hasFeature(feature: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("RenderingDevice", "has_feature", 1772728326L), hostObject.objectPtr, feature)

  /** RenderingDevice.limit_get */
  final def limitGet(limit: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("RenderingDevice", "limit_get", 1559202131L), hostObject.objectPtr, limit)

  /** RenderingDevice.get_frame_delay */
  final def getFrameDelay(): Long =
    Ptrcall.call0[Long](MethodBind.get("RenderingDevice", "get_frame_delay", 3905245786L), hostObject.objectPtr)

  /** RenderingDevice.submit */
  final def submit(): Unit =
    Ptrcall.callVoid0(MethodBind.get("RenderingDevice", "submit", 3218959716L), hostObject.objectPtr)

  /** RenderingDevice.sync */
  final def sync(): Unit =
    Ptrcall.callVoid0(MethodBind.get("RenderingDevice", "sync", 3218959716L), hostObject.objectPtr)

  /** RenderingDevice.barrier */
  final def barrier(from: Long, to: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("RenderingDevice", "barrier", 3718155691L), hostObject.objectPtr, from, to)

  /** RenderingDevice.full_barrier */
  final def fullBarrier(): Unit =
    Ptrcall.callVoid0(MethodBind.get("RenderingDevice", "full_barrier", 3218959716L), hostObject.objectPtr)

  /** RenderingDevice.create_local_device */
  final def createLocalDevice(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("RenderingDevice", "create_local_device", 2846302423L), hostObject.objectPtr)

  /** RenderingDevice.draw_command_begin_label */
  final def drawCommandBeginLabel(name: String, color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid2(MethodBind.get("RenderingDevice", "draw_command_begin_label", 1636512886L), hostObject.objectPtr, name, color)

  /** RenderingDevice.draw_command_insert_label */
  final def drawCommandInsertLabel(name: String, color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid2(MethodBind.get("RenderingDevice", "draw_command_insert_label", 1636512886L), hostObject.objectPtr, name, color)

  /** RenderingDevice.draw_command_end_label */
  final def drawCommandEndLabel(): Unit =
    Ptrcall.callVoid0(MethodBind.get("RenderingDevice", "draw_command_end_label", 3218959716L), hostObject.objectPtr)

  /** RenderingDevice.get_device_vendor_name */
  final def getDeviceVendorName(): String =
    Ptrcall.call0[String](MethodBind.get("RenderingDevice", "get_device_vendor_name", 201670096L), hostObject.objectPtr)

  /** RenderingDevice.get_device_name */
  final def getDeviceName(): String =
    Ptrcall.call0[String](MethodBind.get("RenderingDevice", "get_device_name", 201670096L), hostObject.objectPtr)

  /** RenderingDevice.get_device_pipeline_cache_uuid */
  final def getDevicePipelineCacheUuid(): String =
    Ptrcall.call0[String](MethodBind.get("RenderingDevice", "get_device_pipeline_cache_uuid", 201670096L), hostObject.objectPtr)

  /** RenderingDevice.get_memory_usage */
  final def getMemoryUsage(`type`: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("RenderingDevice", "get_memory_usage", 251690689L), hostObject.objectPtr, `type`)

  /** RenderingDevice.get_perf_report */
  final def getPerfReport(): String =
    Ptrcall.call0[String](MethodBind.get("RenderingDevice", "get_perf_report", 201670096L), hostObject.objectPtr)

  /** RenderingDevice.get_driver_and_device_memory_report */
  final def getDriverAndDeviceMemoryReport(): String =
    Ptrcall.call0[String](MethodBind.get("RenderingDevice", "get_driver_and_device_memory_report", 201670096L), hostObject.objectPtr)

  /** RenderingDevice.get_tracked_object_name */
  final def getTrackedObjectName(type_index: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("RenderingDevice", "get_tracked_object_name", 844755477L), hostObject.objectPtr, type_index)

  /** RenderingDevice.get_tracked_object_type_count */
  final def getTrackedObjectTypeCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("RenderingDevice", "get_tracked_object_type_count", 3905245786L), hostObject.objectPtr)

  /** RenderingDevice.get_driver_total_memory */
  final def getDriverTotalMemory(): Long =
    Ptrcall.call0[Long](MethodBind.get("RenderingDevice", "get_driver_total_memory", 3905245786L), hostObject.objectPtr)

  /** RenderingDevice.get_driver_allocation_count */
  final def getDriverAllocationCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("RenderingDevice", "get_driver_allocation_count", 3905245786L), hostObject.objectPtr)

  /** RenderingDevice.get_driver_memory_by_object_type */
  final def getDriverMemoryByObjectType(`type`: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("RenderingDevice", "get_driver_memory_by_object_type", 923996154L), hostObject.objectPtr, `type`)

  /** RenderingDevice.get_driver_allocs_by_object_type */
  final def getDriverAllocsByObjectType(`type`: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("RenderingDevice", "get_driver_allocs_by_object_type", 923996154L), hostObject.objectPtr, `type`)

  /** RenderingDevice.get_device_total_memory */
  final def getDeviceTotalMemory(): Long =
    Ptrcall.call0[Long](MethodBind.get("RenderingDevice", "get_device_total_memory", 3905245786L), hostObject.objectPtr)

  /** RenderingDevice.get_device_allocation_count */
  final def getDeviceAllocationCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("RenderingDevice", "get_device_allocation_count", 3905245786L), hostObject.objectPtr)

  /** RenderingDevice.get_device_memory_by_object_type */
  final def getDeviceMemoryByObjectType(`type`: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("RenderingDevice", "get_device_memory_by_object_type", 923996154L), hostObject.objectPtr, `type`)

  /** RenderingDevice.get_device_allocs_by_object_type */
  final def getDeviceAllocsByObjectType(`type`: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("RenderingDevice", "get_device_allocs_by_object_type", 923996154L), hostObject.objectPtr, `type`)

}

object RenderingDevice {
  /** Class metadata for Gd[RenderingDevice] lifetime management and casting. */
  given GodotClass[RenderingDevice] with {
    def className = "RenderingDevice"
    def isRefCounted = false
    def wrap(o: GodotObject): RenderingDevice = new RenderingDevice {}.withHost(o.objectPtr)
    def unwrap(t: RenderingDevice): GodotObject = t.hostObject
  }
}
