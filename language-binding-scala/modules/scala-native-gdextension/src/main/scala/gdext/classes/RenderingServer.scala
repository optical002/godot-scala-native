package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `RenderingServer`, extends `Object`. */
abstract class RenderingServer extends Object {
  override def godotClassName: String = "RenderingServer"

  /** RenderingServer.material_set_use_debanding */
  final def materialSetUseDebanding(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RenderingServer", "material_set_use_debanding", 2586408642L), hostObject.objectPtr, enable)

  /** RenderingServer.mesh_surface_get_format_offset */
  final def meshSurfaceGetFormatOffset(format: Long, vertex_count: Long, array_index: Long): Long =
    Ptrcall.call3[Long, Long, Long, Long](MethodBind.get("RenderingServer", "mesh_surface_get_format_offset", 2981368685L), hostObject.objectPtr, format, vertex_count, array_index)

  /** RenderingServer.mesh_surface_get_format_vertex_stride */
  final def meshSurfaceGetFormatVertexStride(format: Long, vertex_count: Long): Long =
    Ptrcall.call2[Long, Long, Long](MethodBind.get("RenderingServer", "mesh_surface_get_format_vertex_stride", 3188363337L), hostObject.objectPtr, format, vertex_count)

  /** RenderingServer.mesh_surface_get_format_normal_tangent_stride */
  final def meshSurfaceGetFormatNormalTangentStride(format: Long, vertex_count: Long): Long =
    Ptrcall.call2[Long, Long, Long](MethodBind.get("RenderingServer", "mesh_surface_get_format_normal_tangent_stride", 3188363337L), hostObject.objectPtr, format, vertex_count)

  /** RenderingServer.mesh_surface_get_format_attribute_stride */
  final def meshSurfaceGetFormatAttributeStride(format: Long, vertex_count: Long): Long =
    Ptrcall.call2[Long, Long, Long](MethodBind.get("RenderingServer", "mesh_surface_get_format_attribute_stride", 3188363337L), hostObject.objectPtr, format, vertex_count)

  /** RenderingServer.mesh_surface_get_format_skin_stride */
  final def meshSurfaceGetFormatSkinStride(format: Long, vertex_count: Long): Long =
    Ptrcall.call2[Long, Long, Long](MethodBind.get("RenderingServer", "mesh_surface_get_format_skin_stride", 3188363337L), hostObject.objectPtr, format, vertex_count)

  /** RenderingServer.mesh_surface_get_format_index_stride */
  final def meshSurfaceGetFormatIndexStride(format: Long, vertex_count: Long): Long =
    Ptrcall.call2[Long, Long, Long](MethodBind.get("RenderingServer", "mesh_surface_get_format_index_stride", 3188363337L), hostObject.objectPtr, format, vertex_count)

  /** RenderingServer.light_projectors_set_filter */
  final def lightProjectorsSetFilter(filter: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RenderingServer", "light_projectors_set_filter", 43944325L), hostObject.objectPtr, filter)

  /** RenderingServer.lightmaps_set_bicubic_filter */
  final def lightmapsSetBicubicFilter(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RenderingServer", "lightmaps_set_bicubic_filter", 2586408642L), hostObject.objectPtr, enable)

  /** RenderingServer.positional_soft_shadow_filter_set_quality */
  final def positionalSoftShadowFilterSetQuality(quality: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RenderingServer", "positional_soft_shadow_filter_set_quality", 3613045266L), hostObject.objectPtr, quality)

  /** RenderingServer.directional_soft_shadow_filter_set_quality */
  final def directionalSoftShadowFilterSetQuality(quality: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RenderingServer", "directional_soft_shadow_filter_set_quality", 3613045266L), hostObject.objectPtr, quality)

  /** RenderingServer.directional_shadow_atlas_set_size */
  final def directionalShadowAtlasSetSize(size: Long, is_16bits: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("RenderingServer", "directional_shadow_atlas_set_size", 300928843L), hostObject.objectPtr, size, is_16bits)

  /** RenderingServer.decals_set_filter */
  final def decalsSetFilter(filter: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RenderingServer", "decals_set_filter", 3519875702L), hostObject.objectPtr, filter)

  /** RenderingServer.gi_set_use_half_resolution */
  final def giSetUseHalfResolution(half_resolution: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RenderingServer", "gi_set_use_half_resolution", 2586408642L), hostObject.objectPtr, half_resolution)

  /** RenderingServer.voxel_gi_set_quality */
  final def voxelGiSetQuality(quality: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RenderingServer", "voxel_gi_set_quality", 1538689978L), hostObject.objectPtr, quality)

  /** RenderingServer.lightmap_set_probe_capture_update_speed */
  final def lightmapSetProbeCaptureUpdateSpeed(speed: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("RenderingServer", "lightmap_set_probe_capture_update_speed", 373806689L), hostObject.objectPtr, speed)

  /** RenderingServer.viewport_set_occlusion_rays_per_thread */
  final def viewportSetOcclusionRaysPerThread(rays_per_thread: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RenderingServer", "viewport_set_occlusion_rays_per_thread", 1286410249L), hostObject.objectPtr, rays_per_thread)

  /** RenderingServer.viewport_set_occlusion_culling_build_quality */
  final def viewportSetOcclusionCullingBuildQuality(quality: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RenderingServer", "viewport_set_occlusion_culling_build_quality", 2069725696L), hostObject.objectPtr, quality)

  /** RenderingServer.environment_glow_set_use_bicubic_upscale */
  final def environmentGlowSetUseBicubicUpscale(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RenderingServer", "environment_glow_set_use_bicubic_upscale", 2586408642L), hostObject.objectPtr, enable)

  /** RenderingServer.environment_set_ssr_half_size */
  final def environmentSetSsrHalfSize(half_size: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RenderingServer", "environment_set_ssr_half_size", 2586408642L), hostObject.objectPtr, half_size)

  /** RenderingServer.environment_set_ssr_roughness_quality */
  final def environmentSetSsrRoughnessQuality(quality: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RenderingServer", "environment_set_ssr_roughness_quality", 1190026788L), hostObject.objectPtr, quality)

  /** RenderingServer.environment_set_ssao_quality */
  final def environmentSetSsaoQuality(quality: Long, half_size: Boolean, adaptive_target: Double, blur_passes: Long, fadeout_from: Double, fadeout_to: Double): Unit =
    Ptrcall.callVoid6(MethodBind.get("RenderingServer", "environment_set_ssao_quality", 189753569L), hostObject.objectPtr, quality, half_size, adaptive_target, blur_passes, fadeout_from, fadeout_to)

  /** RenderingServer.environment_set_ssil_quality */
  final def environmentSetSsilQuality(quality: Long, half_size: Boolean, adaptive_target: Double, blur_passes: Long, fadeout_from: Double, fadeout_to: Double): Unit =
    Ptrcall.callVoid6(MethodBind.get("RenderingServer", "environment_set_ssil_quality", 1713836683L), hostObject.objectPtr, quality, half_size, adaptive_target, blur_passes, fadeout_from, fadeout_to)

  /** RenderingServer.environment_set_sdfgi_ray_count */
  final def environmentSetSdfgiRayCount(ray_count: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RenderingServer", "environment_set_sdfgi_ray_count", 340137951L), hostObject.objectPtr, ray_count)

  /** RenderingServer.environment_set_sdfgi_frames_to_converge */
  final def environmentSetSdfgiFramesToConverge(frames: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RenderingServer", "environment_set_sdfgi_frames_to_converge", 2182444374L), hostObject.objectPtr, frames)

  /** RenderingServer.environment_set_sdfgi_frames_to_update_light */
  final def environmentSetSdfgiFramesToUpdateLight(frames: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RenderingServer", "environment_set_sdfgi_frames_to_update_light", 1251144068L), hostObject.objectPtr, frames)

  /** RenderingServer.environment_set_volumetric_fog_volume_size */
  final def environmentSetVolumetricFogVolumeSize(size: Long, depth: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("RenderingServer", "environment_set_volumetric_fog_volume_size", 3937882851L), hostObject.objectPtr, size, depth)

  /** RenderingServer.environment_set_volumetric_fog_filter_active */
  final def environmentSetVolumetricFogFilterActive(active: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RenderingServer", "environment_set_volumetric_fog_filter_active", 2586408642L), hostObject.objectPtr, active)

  /** RenderingServer.screen_space_roughness_limiter_set_active */
  final def screenSpaceRoughnessLimiterSetActive(enable: Boolean, amount: Double, limit: Double): Unit =
    Ptrcall.callVoid3(MethodBind.get("RenderingServer", "screen_space_roughness_limiter_set_active", 916716790L), hostObject.objectPtr, enable, amount, limit)

  /** RenderingServer.sub_surface_scattering_set_quality */
  final def subSurfaceScatteringSetQuality(quality: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RenderingServer", "sub_surface_scattering_set_quality", 64571803L), hostObject.objectPtr, quality)

  /** RenderingServer.sub_surface_scattering_set_scale */
  final def subSurfaceScatteringSetScale(scale: Double, depth_scale: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("RenderingServer", "sub_surface_scattering_set_scale", 1017552074L), hostObject.objectPtr, scale, depth_scale)

  /** RenderingServer.camera_attributes_set_dof_blur_quality */
  final def cameraAttributesSetDofBlurQuality(quality: Long, use_jitter: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("RenderingServer", "camera_attributes_set_dof_blur_quality", 2220136795L), hostObject.objectPtr, quality, use_jitter)

  /** RenderingServer.camera_attributes_set_dof_blur_bokeh_shape */
  final def cameraAttributesSetDofBlurBokehShape(shape: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RenderingServer", "camera_attributes_set_dof_blur_bokeh_shape", 1205058394L), hostObject.objectPtr, shape)

  /** RenderingServer.canvas_set_disable_scale */
  final def canvasSetDisableScale(disable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RenderingServer", "canvas_set_disable_scale", 2586408642L), hostObject.objectPtr, disable)

  /** RenderingServer.canvas_set_shadow_texture_size */
  final def canvasSetShadowTextureSize(size: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RenderingServer", "canvas_set_shadow_texture_size", 1286410249L), hostObject.objectPtr, size)

  /** RenderingServer.global_shader_parameter_remove */
  final def globalShaderParameterRemove(name: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("RenderingServer", "global_shader_parameter_remove", 3304788590L), hostObject.objectPtr, name)

  /** RenderingServer.global_shader_parameter_get_type */
  final def globalShaderParameterGetType(name: gdext.builtin.StringName): Long =
    Ptrcall.call1[gdext.builtin.StringName, Long](MethodBind.get("RenderingServer", "global_shader_parameter_get_type", 1601414142L), hostObject.objectPtr, name)

  /** RenderingServer.has_changed */
  final def hasChanged(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RenderingServer", "has_changed", 36873697L), hostObject.objectPtr)

  /** RenderingServer.get_rendering_info */
  final def getRenderingInfo(info: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("RenderingServer", "get_rendering_info", 3763192241L), hostObject.objectPtr, info)

  /** RenderingServer.get_video_adapter_name */
  final def getVideoAdapterName(): String =
    Ptrcall.call0[String](MethodBind.get("RenderingServer", "get_video_adapter_name", 201670096L), hostObject.objectPtr)

  /** RenderingServer.get_video_adapter_vendor */
  final def getVideoAdapterVendor(): String =
    Ptrcall.call0[String](MethodBind.get("RenderingServer", "get_video_adapter_vendor", 201670096L), hostObject.objectPtr)

  /** RenderingServer.get_video_adapter_type */
  final def getVideoAdapterType(): Long =
    Ptrcall.call0[Long](MethodBind.get("RenderingServer", "get_video_adapter_type", 3099547011L), hostObject.objectPtr)

  /** RenderingServer.get_video_adapter_api_version */
  final def getVideoAdapterApiVersion(): String =
    Ptrcall.call0[String](MethodBind.get("RenderingServer", "get_video_adapter_api_version", 201670096L), hostObject.objectPtr)

  /** RenderingServer.get_current_rendering_driver_name */
  final def getCurrentRenderingDriverName(): String =
    Ptrcall.call0[String](MethodBind.get("RenderingServer", "get_current_rendering_driver_name", 201670096L), hostObject.objectPtr)

  /** RenderingServer.get_current_rendering_method */
  final def getCurrentRenderingMethod(): String =
    Ptrcall.call0[String](MethodBind.get("RenderingServer", "get_current_rendering_method", 201670096L), hostObject.objectPtr)

  /** RenderingServer.set_boot_image_with_stretch */
  final def setBootImageWithStretch(image: Image, color: gdext.builtin.Color, stretch_mode: Long, use_filter: Boolean): Unit =
    Ptrcall.callVoid4(MethodBind.get("RenderingServer", "set_boot_image_with_stretch", 1104470771L), hostObject.objectPtr, image.hostObject, color, stretch_mode, use_filter)

  /** RenderingServer.set_boot_image */
  final def setBootImage(image: Image, color: gdext.builtin.Color, scale: Boolean, use_filter: Boolean): Unit =
    Ptrcall.callVoid4(MethodBind.get("RenderingServer", "set_boot_image", 3759744527L), hostObject.objectPtr, image.hostObject, color, scale, use_filter)

  /** RenderingServer.get_default_clear_color */
  final def getDefaultClearColor(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("RenderingServer", "get_default_clear_color", 3200896285L), hostObject.objectPtr)

  /** RenderingServer.set_default_clear_color */
  final def setDefaultClearColor(color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("RenderingServer", "set_default_clear_color", 2920490490L), hostObject.objectPtr, color)

  /** RenderingServer.has_os_feature */
  final def hasOsFeature(feature: String): Boolean =
    Ptrcall.call1[String, Boolean](MethodBind.get("RenderingServer", "has_os_feature", 3927539163L), hostObject.objectPtr, feature)

  /** RenderingServer.set_debug_generate_wireframes */
  final def setDebugGenerateWireframes(generate: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RenderingServer", "set_debug_generate_wireframes", 2586408642L), hostObject.objectPtr, generate)

  /** RenderingServer.is_render_loop_enabled */
  final def isRenderLoopEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RenderingServer", "is_render_loop_enabled", 36873697L), hostObject.objectPtr)

  /** RenderingServer.set_render_loop_enabled */
  final def setRenderLoopEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RenderingServer", "set_render_loop_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** RenderingServer.get_frame_setup_time_cpu */
  final def getFrameSetupTimeCpu(): Double =
    Ptrcall.call0[Double](MethodBind.get("RenderingServer", "get_frame_setup_time_cpu", 1740695150L), hostObject.objectPtr)

  /** RenderingServer.force_sync */
  final def forceSync(): Unit =
    Ptrcall.callVoid0(MethodBind.get("RenderingServer", "force_sync", 3218959716L), hostObject.objectPtr)

  /** RenderingServer.force_draw */
  final def forceDraw(swap_buffers: Boolean, frame_step: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("RenderingServer", "force_draw", 1076185472L), hostObject.objectPtr, swap_buffers, frame_step)

  /** RenderingServer.get_rendering_device */
  final def getRenderingDevice(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("RenderingServer", "get_rendering_device", 1405107940L), hostObject.objectPtr)

  /** RenderingServer.create_local_rendering_device */
  final def createLocalRenderingDevice(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("RenderingServer", "create_local_rendering_device", 1405107940L), hostObject.objectPtr)

  /** RenderingServer.is_on_render_thread */
  final def isOnRenderThread(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RenderingServer", "is_on_render_thread", 2240911060L), hostObject.objectPtr)

  /** RenderingServer.has_feature */
  final def hasFeature(feature: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("RenderingServer", "has_feature", 598462696L), hostObject.objectPtr, feature)

}

object RenderingServer {
  /** The process-global RenderingServer singleton instance. */
  def singleton: RenderingServer = new RenderingServer {}
    .withHost(Godot.interface.global_get_singleton(
      StringNames.cached("RenderingServer").ptr))
}
