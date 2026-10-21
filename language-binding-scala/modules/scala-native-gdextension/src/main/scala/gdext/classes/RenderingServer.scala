package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `RenderingServer`, extends `Object`. */
abstract class RenderingServer extends Object {
  override def godotClassName: String = "RenderingServer"

  /** RenderingServer.material_set_use_debanding */
  final def materialSetUseDebanding(enable: Boolean): Unit = {
    if (gdext.classes.RenderingServer.mb_material_set_use_debanding == null) gdext.classes.RenderingServer.mb_material_set_use_debanding = MethodBind.get("RenderingServer", "material_set_use_debanding", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RenderingServer.mb_material_set_use_debanding, livePtr, enable)
  }

  /** RenderingServer.mesh_surface_get_format_offset */
  final def meshSurfaceGetFormatOffset(format: Long, vertex_count: Long, array_index: Long): Long = {
    if (gdext.classes.RenderingServer.mb_mesh_surface_get_format_offset == null) gdext.classes.RenderingServer.mb_mesh_surface_get_format_offset = MethodBind.get("RenderingServer", "mesh_surface_get_format_offset", 2981368685L)
    Ptrcall.call3[Long, Long, Long, Long](gdext.classes.RenderingServer.mb_mesh_surface_get_format_offset, livePtr, format, vertex_count, array_index)
  }

  /** RenderingServer.mesh_surface_get_format_vertex_stride */
  final def meshSurfaceGetFormatVertexStride(format: Long, vertex_count: Long): Long = {
    if (gdext.classes.RenderingServer.mb_mesh_surface_get_format_vertex_stride == null) gdext.classes.RenderingServer.mb_mesh_surface_get_format_vertex_stride = MethodBind.get("RenderingServer", "mesh_surface_get_format_vertex_stride", 3188363337L)
    Ptrcall.call2[Long, Long, Long](gdext.classes.RenderingServer.mb_mesh_surface_get_format_vertex_stride, livePtr, format, vertex_count)
  }

  /** RenderingServer.mesh_surface_get_format_normal_tangent_stride */
  final def meshSurfaceGetFormatNormalTangentStride(format: Long, vertex_count: Long): Long = {
    if (gdext.classes.RenderingServer.mb_mesh_surface_get_format_normal_tangent_stride == null) gdext.classes.RenderingServer.mb_mesh_surface_get_format_normal_tangent_stride = MethodBind.get("RenderingServer", "mesh_surface_get_format_normal_tangent_stride", 3188363337L)
    Ptrcall.call2[Long, Long, Long](gdext.classes.RenderingServer.mb_mesh_surface_get_format_normal_tangent_stride, livePtr, format, vertex_count)
  }

  /** RenderingServer.mesh_surface_get_format_attribute_stride */
  final def meshSurfaceGetFormatAttributeStride(format: Long, vertex_count: Long): Long = {
    if (gdext.classes.RenderingServer.mb_mesh_surface_get_format_attribute_stride == null) gdext.classes.RenderingServer.mb_mesh_surface_get_format_attribute_stride = MethodBind.get("RenderingServer", "mesh_surface_get_format_attribute_stride", 3188363337L)
    Ptrcall.call2[Long, Long, Long](gdext.classes.RenderingServer.mb_mesh_surface_get_format_attribute_stride, livePtr, format, vertex_count)
  }

  /** RenderingServer.mesh_surface_get_format_skin_stride */
  final def meshSurfaceGetFormatSkinStride(format: Long, vertex_count: Long): Long = {
    if (gdext.classes.RenderingServer.mb_mesh_surface_get_format_skin_stride == null) gdext.classes.RenderingServer.mb_mesh_surface_get_format_skin_stride = MethodBind.get("RenderingServer", "mesh_surface_get_format_skin_stride", 3188363337L)
    Ptrcall.call2[Long, Long, Long](gdext.classes.RenderingServer.mb_mesh_surface_get_format_skin_stride, livePtr, format, vertex_count)
  }

  /** RenderingServer.mesh_surface_get_format_index_stride */
  final def meshSurfaceGetFormatIndexStride(format: Long, vertex_count: Long): Long = {
    if (gdext.classes.RenderingServer.mb_mesh_surface_get_format_index_stride == null) gdext.classes.RenderingServer.mb_mesh_surface_get_format_index_stride = MethodBind.get("RenderingServer", "mesh_surface_get_format_index_stride", 3188363337L)
    Ptrcall.call2[Long, Long, Long](gdext.classes.RenderingServer.mb_mesh_surface_get_format_index_stride, livePtr, format, vertex_count)
  }

  /** RenderingServer.light_projectors_set_filter */
  final def lightProjectorsSetFilter(filter: Long): Unit = {
    if (gdext.classes.RenderingServer.mb_light_projectors_set_filter == null) gdext.classes.RenderingServer.mb_light_projectors_set_filter = MethodBind.get("RenderingServer", "light_projectors_set_filter", 43944325L)
    Ptrcall.callVoid1(gdext.classes.RenderingServer.mb_light_projectors_set_filter, livePtr, filter)
  }

  /** RenderingServer.lightmaps_set_bicubic_filter */
  final def lightmapsSetBicubicFilter(enable: Boolean): Unit = {
    if (gdext.classes.RenderingServer.mb_lightmaps_set_bicubic_filter == null) gdext.classes.RenderingServer.mb_lightmaps_set_bicubic_filter = MethodBind.get("RenderingServer", "lightmaps_set_bicubic_filter", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RenderingServer.mb_lightmaps_set_bicubic_filter, livePtr, enable)
  }

  /** RenderingServer.positional_soft_shadow_filter_set_quality */
  final def positionalSoftShadowFilterSetQuality(quality: Long): Unit = {
    if (gdext.classes.RenderingServer.mb_positional_soft_shadow_filter_set_quality == null) gdext.classes.RenderingServer.mb_positional_soft_shadow_filter_set_quality = MethodBind.get("RenderingServer", "positional_soft_shadow_filter_set_quality", 3613045266L)
    Ptrcall.callVoid1(gdext.classes.RenderingServer.mb_positional_soft_shadow_filter_set_quality, livePtr, quality)
  }

  /** RenderingServer.directional_soft_shadow_filter_set_quality */
  final def directionalSoftShadowFilterSetQuality(quality: Long): Unit = {
    if (gdext.classes.RenderingServer.mb_directional_soft_shadow_filter_set_quality == null) gdext.classes.RenderingServer.mb_directional_soft_shadow_filter_set_quality = MethodBind.get("RenderingServer", "directional_soft_shadow_filter_set_quality", 3613045266L)
    Ptrcall.callVoid1(gdext.classes.RenderingServer.mb_directional_soft_shadow_filter_set_quality, livePtr, quality)
  }

  /** RenderingServer.directional_shadow_atlas_set_size */
  final def directionalShadowAtlasSetSize(size: Long, is_16bits: Boolean): Unit = {
    if (gdext.classes.RenderingServer.mb_directional_shadow_atlas_set_size == null) gdext.classes.RenderingServer.mb_directional_shadow_atlas_set_size = MethodBind.get("RenderingServer", "directional_shadow_atlas_set_size", 300928843L)
    Ptrcall.callVoid2(gdext.classes.RenderingServer.mb_directional_shadow_atlas_set_size, livePtr, size, is_16bits)
  }

  /** RenderingServer.decals_set_filter */
  final def decalsSetFilter(filter: Long): Unit = {
    if (gdext.classes.RenderingServer.mb_decals_set_filter == null) gdext.classes.RenderingServer.mb_decals_set_filter = MethodBind.get("RenderingServer", "decals_set_filter", 3519875702L)
    Ptrcall.callVoid1(gdext.classes.RenderingServer.mb_decals_set_filter, livePtr, filter)
  }

  /** RenderingServer.gi_set_use_half_resolution */
  final def giSetUseHalfResolution(half_resolution: Boolean): Unit = {
    if (gdext.classes.RenderingServer.mb_gi_set_use_half_resolution == null) gdext.classes.RenderingServer.mb_gi_set_use_half_resolution = MethodBind.get("RenderingServer", "gi_set_use_half_resolution", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RenderingServer.mb_gi_set_use_half_resolution, livePtr, half_resolution)
  }

  /** RenderingServer.voxel_gi_set_quality */
  final def voxelGiSetQuality(quality: Long): Unit = {
    if (gdext.classes.RenderingServer.mb_voxel_gi_set_quality == null) gdext.classes.RenderingServer.mb_voxel_gi_set_quality = MethodBind.get("RenderingServer", "voxel_gi_set_quality", 1538689978L)
    Ptrcall.callVoid1(gdext.classes.RenderingServer.mb_voxel_gi_set_quality, livePtr, quality)
  }

  /** RenderingServer.lightmap_set_probe_capture_update_speed */
  final def lightmapSetProbeCaptureUpdateSpeed(speed: Double): Unit = {
    if (gdext.classes.RenderingServer.mb_lightmap_set_probe_capture_update_speed == null) gdext.classes.RenderingServer.mb_lightmap_set_probe_capture_update_speed = MethodBind.get("RenderingServer", "lightmap_set_probe_capture_update_speed", 373806689L)
    Ptrcall.callVoid1(gdext.classes.RenderingServer.mb_lightmap_set_probe_capture_update_speed, livePtr, speed)
  }

  /** RenderingServer.viewport_set_occlusion_rays_per_thread */
  final def viewportSetOcclusionRaysPerThread(rays_per_thread: Long): Unit = {
    if (gdext.classes.RenderingServer.mb_viewport_set_occlusion_rays_per_thread == null) gdext.classes.RenderingServer.mb_viewport_set_occlusion_rays_per_thread = MethodBind.get("RenderingServer", "viewport_set_occlusion_rays_per_thread", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.RenderingServer.mb_viewport_set_occlusion_rays_per_thread, livePtr, rays_per_thread)
  }

  /** RenderingServer.viewport_set_occlusion_culling_build_quality */
  final def viewportSetOcclusionCullingBuildQuality(quality: Long): Unit = {
    if (gdext.classes.RenderingServer.mb_viewport_set_occlusion_culling_build_quality == null) gdext.classes.RenderingServer.mb_viewport_set_occlusion_culling_build_quality = MethodBind.get("RenderingServer", "viewport_set_occlusion_culling_build_quality", 2069725696L)
    Ptrcall.callVoid1(gdext.classes.RenderingServer.mb_viewport_set_occlusion_culling_build_quality, livePtr, quality)
  }

  /** RenderingServer.environment_glow_set_use_bicubic_upscale */
  final def environmentGlowSetUseBicubicUpscale(enable: Boolean): Unit = {
    if (gdext.classes.RenderingServer.mb_environment_glow_set_use_bicubic_upscale == null) gdext.classes.RenderingServer.mb_environment_glow_set_use_bicubic_upscale = MethodBind.get("RenderingServer", "environment_glow_set_use_bicubic_upscale", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RenderingServer.mb_environment_glow_set_use_bicubic_upscale, livePtr, enable)
  }

  /** RenderingServer.environment_set_ssr_half_size */
  final def environmentSetSsrHalfSize(half_size: Boolean): Unit = {
    if (gdext.classes.RenderingServer.mb_environment_set_ssr_half_size == null) gdext.classes.RenderingServer.mb_environment_set_ssr_half_size = MethodBind.get("RenderingServer", "environment_set_ssr_half_size", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RenderingServer.mb_environment_set_ssr_half_size, livePtr, half_size)
  }

  /** RenderingServer.environment_set_ssr_roughness_quality */
  final def environmentSetSsrRoughnessQuality(quality: Long): Unit = {
    if (gdext.classes.RenderingServer.mb_environment_set_ssr_roughness_quality == null) gdext.classes.RenderingServer.mb_environment_set_ssr_roughness_quality = MethodBind.get("RenderingServer", "environment_set_ssr_roughness_quality", 1190026788L)
    Ptrcall.callVoid1(gdext.classes.RenderingServer.mb_environment_set_ssr_roughness_quality, livePtr, quality)
  }

  /** RenderingServer.environment_set_ssao_quality */
  final def environmentSetSsaoQuality(quality: Long, half_size: Boolean, adaptive_target: Double, blur_passes: Long, fadeout_from: Double, fadeout_to: Double): Unit = {
    if (gdext.classes.RenderingServer.mb_environment_set_ssao_quality == null) gdext.classes.RenderingServer.mb_environment_set_ssao_quality = MethodBind.get("RenderingServer", "environment_set_ssao_quality", 189753569L)
    Ptrcall.callVoid6(gdext.classes.RenderingServer.mb_environment_set_ssao_quality, livePtr, quality, half_size, adaptive_target, blur_passes, fadeout_from, fadeout_to)
  }

  /** RenderingServer.environment_set_ssil_quality */
  final def environmentSetSsilQuality(quality: Long, half_size: Boolean, adaptive_target: Double, blur_passes: Long, fadeout_from: Double, fadeout_to: Double): Unit = {
    if (gdext.classes.RenderingServer.mb_environment_set_ssil_quality == null) gdext.classes.RenderingServer.mb_environment_set_ssil_quality = MethodBind.get("RenderingServer", "environment_set_ssil_quality", 1713836683L)
    Ptrcall.callVoid6(gdext.classes.RenderingServer.mb_environment_set_ssil_quality, livePtr, quality, half_size, adaptive_target, blur_passes, fadeout_from, fadeout_to)
  }

  /** RenderingServer.environment_set_sdfgi_ray_count */
  final def environmentSetSdfgiRayCount(ray_count: Long): Unit = {
    if (gdext.classes.RenderingServer.mb_environment_set_sdfgi_ray_count == null) gdext.classes.RenderingServer.mb_environment_set_sdfgi_ray_count = MethodBind.get("RenderingServer", "environment_set_sdfgi_ray_count", 340137951L)
    Ptrcall.callVoid1(gdext.classes.RenderingServer.mb_environment_set_sdfgi_ray_count, livePtr, ray_count)
  }

  /** RenderingServer.environment_set_sdfgi_frames_to_converge */
  final def environmentSetSdfgiFramesToConverge(frames: Long): Unit = {
    if (gdext.classes.RenderingServer.mb_environment_set_sdfgi_frames_to_converge == null) gdext.classes.RenderingServer.mb_environment_set_sdfgi_frames_to_converge = MethodBind.get("RenderingServer", "environment_set_sdfgi_frames_to_converge", 2182444374L)
    Ptrcall.callVoid1(gdext.classes.RenderingServer.mb_environment_set_sdfgi_frames_to_converge, livePtr, frames)
  }

  /** RenderingServer.environment_set_sdfgi_frames_to_update_light */
  final def environmentSetSdfgiFramesToUpdateLight(frames: Long): Unit = {
    if (gdext.classes.RenderingServer.mb_environment_set_sdfgi_frames_to_update_light == null) gdext.classes.RenderingServer.mb_environment_set_sdfgi_frames_to_update_light = MethodBind.get("RenderingServer", "environment_set_sdfgi_frames_to_update_light", 1251144068L)
    Ptrcall.callVoid1(gdext.classes.RenderingServer.mb_environment_set_sdfgi_frames_to_update_light, livePtr, frames)
  }

  /** RenderingServer.environment_set_volumetric_fog_volume_size */
  final def environmentSetVolumetricFogVolumeSize(size: Long, depth: Long): Unit = {
    if (gdext.classes.RenderingServer.mb_environment_set_volumetric_fog_volume_size == null) gdext.classes.RenderingServer.mb_environment_set_volumetric_fog_volume_size = MethodBind.get("RenderingServer", "environment_set_volumetric_fog_volume_size", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.RenderingServer.mb_environment_set_volumetric_fog_volume_size, livePtr, size, depth)
  }

  /** RenderingServer.environment_set_volumetric_fog_filter_active */
  final def environmentSetVolumetricFogFilterActive(active: Boolean): Unit = {
    if (gdext.classes.RenderingServer.mb_environment_set_volumetric_fog_filter_active == null) gdext.classes.RenderingServer.mb_environment_set_volumetric_fog_filter_active = MethodBind.get("RenderingServer", "environment_set_volumetric_fog_filter_active", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RenderingServer.mb_environment_set_volumetric_fog_filter_active, livePtr, active)
  }

  /** RenderingServer.screen_space_roughness_limiter_set_active */
  final def screenSpaceRoughnessLimiterSetActive(enable: Boolean, amount: Double, limit: Double): Unit = {
    if (gdext.classes.RenderingServer.mb_screen_space_roughness_limiter_set_active == null) gdext.classes.RenderingServer.mb_screen_space_roughness_limiter_set_active = MethodBind.get("RenderingServer", "screen_space_roughness_limiter_set_active", 916716790L)
    Ptrcall.callVoid3(gdext.classes.RenderingServer.mb_screen_space_roughness_limiter_set_active, livePtr, enable, amount, limit)
  }

  /** RenderingServer.sub_surface_scattering_set_quality */
  final def subSurfaceScatteringSetQuality(quality: Long): Unit = {
    if (gdext.classes.RenderingServer.mb_sub_surface_scattering_set_quality == null) gdext.classes.RenderingServer.mb_sub_surface_scattering_set_quality = MethodBind.get("RenderingServer", "sub_surface_scattering_set_quality", 64571803L)
    Ptrcall.callVoid1(gdext.classes.RenderingServer.mb_sub_surface_scattering_set_quality, livePtr, quality)
  }

  /** RenderingServer.sub_surface_scattering_set_scale */
  final def subSurfaceScatteringSetScale(scale: Double, depth_scale: Double): Unit = {
    if (gdext.classes.RenderingServer.mb_sub_surface_scattering_set_scale == null) gdext.classes.RenderingServer.mb_sub_surface_scattering_set_scale = MethodBind.get("RenderingServer", "sub_surface_scattering_set_scale", 1017552074L)
    Ptrcall.callVoid2(gdext.classes.RenderingServer.mb_sub_surface_scattering_set_scale, livePtr, scale, depth_scale)
  }

  /** RenderingServer.camera_attributes_set_dof_blur_quality */
  final def cameraAttributesSetDofBlurQuality(quality: Long, use_jitter: Boolean): Unit = {
    if (gdext.classes.RenderingServer.mb_camera_attributes_set_dof_blur_quality == null) gdext.classes.RenderingServer.mb_camera_attributes_set_dof_blur_quality = MethodBind.get("RenderingServer", "camera_attributes_set_dof_blur_quality", 2220136795L)
    Ptrcall.callVoid2(gdext.classes.RenderingServer.mb_camera_attributes_set_dof_blur_quality, livePtr, quality, use_jitter)
  }

  /** RenderingServer.camera_attributes_set_dof_blur_bokeh_shape */
  final def cameraAttributesSetDofBlurBokehShape(shape: Long): Unit = {
    if (gdext.classes.RenderingServer.mb_camera_attributes_set_dof_blur_bokeh_shape == null) gdext.classes.RenderingServer.mb_camera_attributes_set_dof_blur_bokeh_shape = MethodBind.get("RenderingServer", "camera_attributes_set_dof_blur_bokeh_shape", 1205058394L)
    Ptrcall.callVoid1(gdext.classes.RenderingServer.mb_camera_attributes_set_dof_blur_bokeh_shape, livePtr, shape)
  }

  /** RenderingServer.canvas_set_disable_scale */
  final def canvasSetDisableScale(disable: Boolean): Unit = {
    if (gdext.classes.RenderingServer.mb_canvas_set_disable_scale == null) gdext.classes.RenderingServer.mb_canvas_set_disable_scale = MethodBind.get("RenderingServer", "canvas_set_disable_scale", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RenderingServer.mb_canvas_set_disable_scale, livePtr, disable)
  }

  /** RenderingServer.canvas_set_shadow_texture_size */
  final def canvasSetShadowTextureSize(size: Long): Unit = {
    if (gdext.classes.RenderingServer.mb_canvas_set_shadow_texture_size == null) gdext.classes.RenderingServer.mb_canvas_set_shadow_texture_size = MethodBind.get("RenderingServer", "canvas_set_shadow_texture_size", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.RenderingServer.mb_canvas_set_shadow_texture_size, livePtr, size)
  }

  /** RenderingServer.global_shader_parameter_remove */
  final def globalShaderParameterRemove(name: gdext.builtin.StringName): Unit = {
    if (gdext.classes.RenderingServer.mb_global_shader_parameter_remove == null) gdext.classes.RenderingServer.mb_global_shader_parameter_remove = MethodBind.get("RenderingServer", "global_shader_parameter_remove", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.RenderingServer.mb_global_shader_parameter_remove, livePtr, name)
  }

  /** RenderingServer.global_shader_parameter_get_type */
  final def globalShaderParameterGetType(name: gdext.builtin.StringName): Long = {
    if (gdext.classes.RenderingServer.mb_global_shader_parameter_get_type == null) gdext.classes.RenderingServer.mb_global_shader_parameter_get_type = MethodBind.get("RenderingServer", "global_shader_parameter_get_type", 1601414142L)
    Ptrcall.call1[gdext.builtin.StringName, Long](gdext.classes.RenderingServer.mb_global_shader_parameter_get_type, livePtr, name)
  }

  /** RenderingServer.has_changed */
  final def hasChanged(): Boolean = {
    if (gdext.classes.RenderingServer.mb_has_changed == null) gdext.classes.RenderingServer.mb_has_changed = MethodBind.get("RenderingServer", "has_changed", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RenderingServer.mb_has_changed, livePtr)
  }

  /** RenderingServer.get_rendering_info */
  final def getRenderingInfo(info: Long): Long = {
    if (gdext.classes.RenderingServer.mb_get_rendering_info == null) gdext.classes.RenderingServer.mb_get_rendering_info = MethodBind.get("RenderingServer", "get_rendering_info", 3763192241L)
    Ptrcall.call1[Long, Long](gdext.classes.RenderingServer.mb_get_rendering_info, livePtr, info)
  }

  /** RenderingServer.get_video_adapter_name */
  final def getVideoAdapterName(): String = {
    if (gdext.classes.RenderingServer.mb_get_video_adapter_name == null) gdext.classes.RenderingServer.mb_get_video_adapter_name = MethodBind.get("RenderingServer", "get_video_adapter_name", 201670096L)
    Ptrcall.call0[String](gdext.classes.RenderingServer.mb_get_video_adapter_name, livePtr)
  }

  /** RenderingServer.get_video_adapter_vendor */
  final def getVideoAdapterVendor(): String = {
    if (gdext.classes.RenderingServer.mb_get_video_adapter_vendor == null) gdext.classes.RenderingServer.mb_get_video_adapter_vendor = MethodBind.get("RenderingServer", "get_video_adapter_vendor", 201670096L)
    Ptrcall.call0[String](gdext.classes.RenderingServer.mb_get_video_adapter_vendor, livePtr)
  }

  /** RenderingServer.get_video_adapter_type */
  final def getVideoAdapterType(): Long = {
    if (gdext.classes.RenderingServer.mb_get_video_adapter_type == null) gdext.classes.RenderingServer.mb_get_video_adapter_type = MethodBind.get("RenderingServer", "get_video_adapter_type", 3099547011L)
    Ptrcall.call0[Long](gdext.classes.RenderingServer.mb_get_video_adapter_type, livePtr)
  }

  /** RenderingServer.get_video_adapter_api_version */
  final def getVideoAdapterApiVersion(): String = {
    if (gdext.classes.RenderingServer.mb_get_video_adapter_api_version == null) gdext.classes.RenderingServer.mb_get_video_adapter_api_version = MethodBind.get("RenderingServer", "get_video_adapter_api_version", 201670096L)
    Ptrcall.call0[String](gdext.classes.RenderingServer.mb_get_video_adapter_api_version, livePtr)
  }

  /** RenderingServer.get_current_rendering_driver_name */
  final def getCurrentRenderingDriverName(): String = {
    if (gdext.classes.RenderingServer.mb_get_current_rendering_driver_name == null) gdext.classes.RenderingServer.mb_get_current_rendering_driver_name = MethodBind.get("RenderingServer", "get_current_rendering_driver_name", 201670096L)
    Ptrcall.call0[String](gdext.classes.RenderingServer.mb_get_current_rendering_driver_name, livePtr)
  }

  /** RenderingServer.get_current_rendering_method */
  final def getCurrentRenderingMethod(): String = {
    if (gdext.classes.RenderingServer.mb_get_current_rendering_method == null) gdext.classes.RenderingServer.mb_get_current_rendering_method = MethodBind.get("RenderingServer", "get_current_rendering_method", 201670096L)
    Ptrcall.call0[String](gdext.classes.RenderingServer.mb_get_current_rendering_method, livePtr)
  }

  /** RenderingServer.set_boot_image_with_stretch */
  final def setBootImageWithStretch(image: Image, color: gdext.builtin.Color, stretch_mode: Long, use_filter: Boolean): Unit = {
    if (gdext.classes.RenderingServer.mb_set_boot_image_with_stretch == null) gdext.classes.RenderingServer.mb_set_boot_image_with_stretch = MethodBind.get("RenderingServer", "set_boot_image_with_stretch", 1104470771L)
    Ptrcall.callVoid4(gdext.classes.RenderingServer.mb_set_boot_image_with_stretch, livePtr, Wrappers.handle(image), color, stretch_mode, use_filter)
  }

  /** RenderingServer.set_boot_image */
  final def setBootImage(image: Image, color: gdext.builtin.Color, scale: Boolean, use_filter: Boolean): Unit = {
    if (gdext.classes.RenderingServer.mb_set_boot_image == null) gdext.classes.RenderingServer.mb_set_boot_image = MethodBind.get("RenderingServer", "set_boot_image", 3759744527L)
    Ptrcall.callVoid4(gdext.classes.RenderingServer.mb_set_boot_image, livePtr, Wrappers.handle(image), color, scale, use_filter)
  }

  /** RenderingServer.get_default_clear_color */
  final def getDefaultClearColor(): gdext.builtin.Color = {
    if (gdext.classes.RenderingServer.mb_get_default_clear_color == null) gdext.classes.RenderingServer.mb_get_default_clear_color = MethodBind.get("RenderingServer", "get_default_clear_color", 3200896285L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.RenderingServer.mb_get_default_clear_color, livePtr)
  }

  /** RenderingServer.set_default_clear_color */
  final def setDefaultClearColor(color: gdext.builtin.Color): Unit = {
    if (gdext.classes.RenderingServer.mb_set_default_clear_color == null) gdext.classes.RenderingServer.mb_set_default_clear_color = MethodBind.get("RenderingServer", "set_default_clear_color", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.RenderingServer.mb_set_default_clear_color, livePtr, color)
  }

  /** RenderingServer.has_os_feature */
  final def hasOsFeature(feature: String): Boolean = {
    if (gdext.classes.RenderingServer.mb_has_os_feature == null) gdext.classes.RenderingServer.mb_has_os_feature = MethodBind.get("RenderingServer", "has_os_feature", 3927539163L)
    Ptrcall.call1[String, Boolean](gdext.classes.RenderingServer.mb_has_os_feature, livePtr, feature)
  }

  /** RenderingServer.set_debug_generate_wireframes */
  final def setDebugGenerateWireframes(generate: Boolean): Unit = {
    if (gdext.classes.RenderingServer.mb_set_debug_generate_wireframes == null) gdext.classes.RenderingServer.mb_set_debug_generate_wireframes = MethodBind.get("RenderingServer", "set_debug_generate_wireframes", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RenderingServer.mb_set_debug_generate_wireframes, livePtr, generate)
  }

  /** RenderingServer.is_render_loop_enabled */
  final def isRenderLoopEnabled(): Boolean = {
    if (gdext.classes.RenderingServer.mb_is_render_loop_enabled == null) gdext.classes.RenderingServer.mb_is_render_loop_enabled = MethodBind.get("RenderingServer", "is_render_loop_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RenderingServer.mb_is_render_loop_enabled, livePtr)
  }

  /** RenderingServer.set_render_loop_enabled */
  final def setRenderLoopEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.RenderingServer.mb_set_render_loop_enabled == null) gdext.classes.RenderingServer.mb_set_render_loop_enabled = MethodBind.get("RenderingServer", "set_render_loop_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RenderingServer.mb_set_render_loop_enabled, livePtr, enabled)
  }

  /** RenderingServer.get_frame_setup_time_cpu */
  final def getFrameSetupTimeCpu(): Double = {
    if (gdext.classes.RenderingServer.mb_get_frame_setup_time_cpu == null) gdext.classes.RenderingServer.mb_get_frame_setup_time_cpu = MethodBind.get("RenderingServer", "get_frame_setup_time_cpu", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.RenderingServer.mb_get_frame_setup_time_cpu, livePtr)
  }

  /** RenderingServer.force_sync */
  final def forceSync(): Unit = {
    if (gdext.classes.RenderingServer.mb_force_sync == null) gdext.classes.RenderingServer.mb_force_sync = MethodBind.get("RenderingServer", "force_sync", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.RenderingServer.mb_force_sync, livePtr)
  }

  /** RenderingServer.force_draw */
  final def forceDraw(swap_buffers: Boolean, frame_step: Double): Unit = {
    if (gdext.classes.RenderingServer.mb_force_draw == null) gdext.classes.RenderingServer.mb_force_draw = MethodBind.get("RenderingServer", "force_draw", 1076185472L)
    Ptrcall.callVoid2(gdext.classes.RenderingServer.mb_force_draw, livePtr, swap_buffers, frame_step)
  }

  /** RenderingServer.get_rendering_device */
  final def getRenderingDevice(): RenderingDevice = {
    if (gdext.classes.RenderingServer.mb_get_rendering_device == null) gdext.classes.RenderingServer.mb_get_rendering_device = MethodBind.get("RenderingServer", "get_rendering_device", 1405107940L)
    Wrappers.borrowed[RenderingDevice](Ptrcall.call0[Long](gdext.classes.RenderingServer.mb_get_rendering_device, livePtr))
  }

  /** RenderingServer.create_local_rendering_device */
  final def createLocalRenderingDevice(): RenderingDevice = {
    if (gdext.classes.RenderingServer.mb_create_local_rendering_device == null) gdext.classes.RenderingServer.mb_create_local_rendering_device = MethodBind.get("RenderingServer", "create_local_rendering_device", 1405107940L)
    Wrappers.borrowed[RenderingDevice](Ptrcall.call0[Long](gdext.classes.RenderingServer.mb_create_local_rendering_device, livePtr))
  }

  /** RenderingServer.is_on_render_thread */
  final def isOnRenderThread(): Boolean = {
    if (gdext.classes.RenderingServer.mb_is_on_render_thread == null) gdext.classes.RenderingServer.mb_is_on_render_thread = MethodBind.get("RenderingServer", "is_on_render_thread", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.RenderingServer.mb_is_on_render_thread, livePtr)
  }

  /** RenderingServer.has_feature */
  final def hasFeature(feature: Long): Boolean = {
    if (gdext.classes.RenderingServer.mb_has_feature == null) gdext.classes.RenderingServer.mb_has_feature = MethodBind.get("RenderingServer", "has_feature", 598462696L)
    Ptrcall.call1[Long, Boolean](gdext.classes.RenderingServer.mb_has_feature, livePtr, feature)
  }

}

object RenderingServer {
  private[classes] var mb_material_set_use_debanding: GDExtensionMethodBindPtr = null
  private[classes] var mb_mesh_surface_get_format_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_mesh_surface_get_format_vertex_stride: GDExtensionMethodBindPtr = null
  private[classes] var mb_mesh_surface_get_format_normal_tangent_stride: GDExtensionMethodBindPtr = null
  private[classes] var mb_mesh_surface_get_format_attribute_stride: GDExtensionMethodBindPtr = null
  private[classes] var mb_mesh_surface_get_format_skin_stride: GDExtensionMethodBindPtr = null
  private[classes] var mb_mesh_surface_get_format_index_stride: GDExtensionMethodBindPtr = null
  private[classes] var mb_light_projectors_set_filter: GDExtensionMethodBindPtr = null
  private[classes] var mb_lightmaps_set_bicubic_filter: GDExtensionMethodBindPtr = null
  private[classes] var mb_positional_soft_shadow_filter_set_quality: GDExtensionMethodBindPtr = null
  private[classes] var mb_directional_soft_shadow_filter_set_quality: GDExtensionMethodBindPtr = null
  private[classes] var mb_directional_shadow_atlas_set_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_decals_set_filter: GDExtensionMethodBindPtr = null
  private[classes] var mb_gi_set_use_half_resolution: GDExtensionMethodBindPtr = null
  private[classes] var mb_voxel_gi_set_quality: GDExtensionMethodBindPtr = null
  private[classes] var mb_lightmap_set_probe_capture_update_speed: GDExtensionMethodBindPtr = null
  private[classes] var mb_viewport_set_occlusion_rays_per_thread: GDExtensionMethodBindPtr = null
  private[classes] var mb_viewport_set_occlusion_culling_build_quality: GDExtensionMethodBindPtr = null
  private[classes] var mb_environment_glow_set_use_bicubic_upscale: GDExtensionMethodBindPtr = null
  private[classes] var mb_environment_set_ssr_half_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_environment_set_ssr_roughness_quality: GDExtensionMethodBindPtr = null
  private[classes] var mb_environment_set_ssao_quality: GDExtensionMethodBindPtr = null
  private[classes] var mb_environment_set_ssil_quality: GDExtensionMethodBindPtr = null
  private[classes] var mb_environment_set_sdfgi_ray_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_environment_set_sdfgi_frames_to_converge: GDExtensionMethodBindPtr = null
  private[classes] var mb_environment_set_sdfgi_frames_to_update_light: GDExtensionMethodBindPtr = null
  private[classes] var mb_environment_set_volumetric_fog_volume_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_environment_set_volumetric_fog_filter_active: GDExtensionMethodBindPtr = null
  private[classes] var mb_screen_space_roughness_limiter_set_active: GDExtensionMethodBindPtr = null
  private[classes] var mb_sub_surface_scattering_set_quality: GDExtensionMethodBindPtr = null
  private[classes] var mb_sub_surface_scattering_set_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_camera_attributes_set_dof_blur_quality: GDExtensionMethodBindPtr = null
  private[classes] var mb_camera_attributes_set_dof_blur_bokeh_shape: GDExtensionMethodBindPtr = null
  private[classes] var mb_canvas_set_disable_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_canvas_set_shadow_texture_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_global_shader_parameter_remove: GDExtensionMethodBindPtr = null
  private[classes] var mb_global_shader_parameter_get_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_changed: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_rendering_info: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_video_adapter_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_video_adapter_vendor: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_video_adapter_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_video_adapter_api_version: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_current_rendering_driver_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_current_rendering_method: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_boot_image_with_stretch: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_boot_image: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_default_clear_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_default_clear_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_os_feature: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_debug_generate_wireframes: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_render_loop_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_render_loop_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_frame_setup_time_cpu: GDExtensionMethodBindPtr = null
  private[classes] var mb_force_sync: GDExtensionMethodBindPtr = null
  private[classes] var mb_force_draw: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_rendering_device: GDExtensionMethodBindPtr = null
  private[classes] var mb_create_local_rendering_device: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_on_render_thread: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_feature: GDExtensionMethodBindPtr = null

  private var instance: RenderingServer = null

  /** The process-global RenderingServer singleton instance. */
  def singleton: RenderingServer = {
    if (instance == null)
      instance = Wrappers.borrowed[RenderingServer](GodotObject.fromPtr(
        Godot.interface.global_get_singleton(StringNames.cached("RenderingServer").ptr)))
    instance
  }
}
