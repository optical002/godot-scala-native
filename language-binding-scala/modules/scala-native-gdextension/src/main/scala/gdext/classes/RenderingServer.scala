package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
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
  final def meshSurfaceGetFormatOffset(format: gdext.classes.RenderingServer.ArrayFormat, vertexCount: Long, arrayIndex: Long): Long = {
    if (gdext.classes.RenderingServer.mb_mesh_surface_get_format_offset == null) gdext.classes.RenderingServer.mb_mesh_surface_get_format_offset = MethodBind.get("RenderingServer", "mesh_surface_get_format_offset", 2981368685L)
    Ptrcall.call3[Long, Long, Long, Long](gdext.classes.RenderingServer.mb_mesh_surface_get_format_offset, livePtr, format.asInstanceOf[Long], vertexCount, arrayIndex)
  }

  /** RenderingServer.mesh_surface_get_format_vertex_stride */
  final def meshSurfaceGetFormatVertexStride(format: gdext.classes.RenderingServer.ArrayFormat, vertexCount: Long): Long = {
    if (gdext.classes.RenderingServer.mb_mesh_surface_get_format_vertex_stride == null) gdext.classes.RenderingServer.mb_mesh_surface_get_format_vertex_stride = MethodBind.get("RenderingServer", "mesh_surface_get_format_vertex_stride", 3188363337L)
    Ptrcall.call2[Long, Long, Long](gdext.classes.RenderingServer.mb_mesh_surface_get_format_vertex_stride, livePtr, format.asInstanceOf[Long], vertexCount)
  }

  /** RenderingServer.mesh_surface_get_format_normal_tangent_stride */
  final def meshSurfaceGetFormatNormalTangentStride(format: gdext.classes.RenderingServer.ArrayFormat, vertexCount: Long): Long = {
    if (gdext.classes.RenderingServer.mb_mesh_surface_get_format_normal_tangent_stride == null) gdext.classes.RenderingServer.mb_mesh_surface_get_format_normal_tangent_stride = MethodBind.get("RenderingServer", "mesh_surface_get_format_normal_tangent_stride", 3188363337L)
    Ptrcall.call2[Long, Long, Long](gdext.classes.RenderingServer.mb_mesh_surface_get_format_normal_tangent_stride, livePtr, format.asInstanceOf[Long], vertexCount)
  }

  /** RenderingServer.mesh_surface_get_format_attribute_stride */
  final def meshSurfaceGetFormatAttributeStride(format: gdext.classes.RenderingServer.ArrayFormat, vertexCount: Long): Long = {
    if (gdext.classes.RenderingServer.mb_mesh_surface_get_format_attribute_stride == null) gdext.classes.RenderingServer.mb_mesh_surface_get_format_attribute_stride = MethodBind.get("RenderingServer", "mesh_surface_get_format_attribute_stride", 3188363337L)
    Ptrcall.call2[Long, Long, Long](gdext.classes.RenderingServer.mb_mesh_surface_get_format_attribute_stride, livePtr, format.asInstanceOf[Long], vertexCount)
  }

  /** RenderingServer.mesh_surface_get_format_skin_stride */
  final def meshSurfaceGetFormatSkinStride(format: gdext.classes.RenderingServer.ArrayFormat, vertexCount: Long): Long = {
    if (gdext.classes.RenderingServer.mb_mesh_surface_get_format_skin_stride == null) gdext.classes.RenderingServer.mb_mesh_surface_get_format_skin_stride = MethodBind.get("RenderingServer", "mesh_surface_get_format_skin_stride", 3188363337L)
    Ptrcall.call2[Long, Long, Long](gdext.classes.RenderingServer.mb_mesh_surface_get_format_skin_stride, livePtr, format.asInstanceOf[Long], vertexCount)
  }

  /** RenderingServer.mesh_surface_get_format_index_stride */
  final def meshSurfaceGetFormatIndexStride(format: gdext.classes.RenderingServer.ArrayFormat, vertexCount: Long): Long = {
    if (gdext.classes.RenderingServer.mb_mesh_surface_get_format_index_stride == null) gdext.classes.RenderingServer.mb_mesh_surface_get_format_index_stride = MethodBind.get("RenderingServer", "mesh_surface_get_format_index_stride", 3188363337L)
    Ptrcall.call2[Long, Long, Long](gdext.classes.RenderingServer.mb_mesh_surface_get_format_index_stride, livePtr, format.asInstanceOf[Long], vertexCount)
  }

  /** RenderingServer.light_projectors_set_filter */
  final def lightProjectorsSetFilter(filter: gdext.classes.RenderingServer.LightProjectorFilter): Unit = {
    if (gdext.classes.RenderingServer.mb_light_projectors_set_filter == null) gdext.classes.RenderingServer.mb_light_projectors_set_filter = MethodBind.get("RenderingServer", "light_projectors_set_filter", 43944325L)
    Ptrcall.callVoid1(gdext.classes.RenderingServer.mb_light_projectors_set_filter, livePtr, filter)
  }

  /** RenderingServer.lightmaps_set_bicubic_filter */
  final def lightmapsSetBicubicFilter(enable: Boolean): Unit = {
    if (gdext.classes.RenderingServer.mb_lightmaps_set_bicubic_filter == null) gdext.classes.RenderingServer.mb_lightmaps_set_bicubic_filter = MethodBind.get("RenderingServer", "lightmaps_set_bicubic_filter", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RenderingServer.mb_lightmaps_set_bicubic_filter, livePtr, enable)
  }

  /** RenderingServer.positional_soft_shadow_filter_set_quality */
  final def positionalSoftShadowFilterSetQuality(quality: gdext.classes.RenderingServer.ShadowQuality): Unit = {
    if (gdext.classes.RenderingServer.mb_positional_soft_shadow_filter_set_quality == null) gdext.classes.RenderingServer.mb_positional_soft_shadow_filter_set_quality = MethodBind.get("RenderingServer", "positional_soft_shadow_filter_set_quality", 3613045266L)
    Ptrcall.callVoid1(gdext.classes.RenderingServer.mb_positional_soft_shadow_filter_set_quality, livePtr, quality)
  }

  /** RenderingServer.directional_soft_shadow_filter_set_quality */
  final def directionalSoftShadowFilterSetQuality(quality: gdext.classes.RenderingServer.ShadowQuality): Unit = {
    if (gdext.classes.RenderingServer.mb_directional_soft_shadow_filter_set_quality == null) gdext.classes.RenderingServer.mb_directional_soft_shadow_filter_set_quality = MethodBind.get("RenderingServer", "directional_soft_shadow_filter_set_quality", 3613045266L)
    Ptrcall.callVoid1(gdext.classes.RenderingServer.mb_directional_soft_shadow_filter_set_quality, livePtr, quality)
  }

  /** RenderingServer.directional_shadow_atlas_set_size */
  final def directionalShadowAtlasSetSize(size: Long, is16bits: Boolean): Unit = {
    if (gdext.classes.RenderingServer.mb_directional_shadow_atlas_set_size == null) gdext.classes.RenderingServer.mb_directional_shadow_atlas_set_size = MethodBind.get("RenderingServer", "directional_shadow_atlas_set_size", 300928843L)
    Ptrcall.callVoid2(gdext.classes.RenderingServer.mb_directional_shadow_atlas_set_size, livePtr, size, is16bits)
  }

  /** RenderingServer.decals_set_filter */
  final def decalsSetFilter(filter: gdext.classes.RenderingServer.DecalFilter): Unit = {
    if (gdext.classes.RenderingServer.mb_decals_set_filter == null) gdext.classes.RenderingServer.mb_decals_set_filter = MethodBind.get("RenderingServer", "decals_set_filter", 3519875702L)
    Ptrcall.callVoid1(gdext.classes.RenderingServer.mb_decals_set_filter, livePtr, filter)
  }

  /** RenderingServer.gi_set_use_half_resolution */
  final def giSetUseHalfResolution(halfResolution: Boolean): Unit = {
    if (gdext.classes.RenderingServer.mb_gi_set_use_half_resolution == null) gdext.classes.RenderingServer.mb_gi_set_use_half_resolution = MethodBind.get("RenderingServer", "gi_set_use_half_resolution", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RenderingServer.mb_gi_set_use_half_resolution, livePtr, halfResolution)
  }

  /** RenderingServer.voxel_gi_set_quality */
  final def voxelGiSetQuality(quality: gdext.classes.RenderingServer.VoxelGIQuality): Unit = {
    if (gdext.classes.RenderingServer.mb_voxel_gi_set_quality == null) gdext.classes.RenderingServer.mb_voxel_gi_set_quality = MethodBind.get("RenderingServer", "voxel_gi_set_quality", 1538689978L)
    Ptrcall.callVoid1(gdext.classes.RenderingServer.mb_voxel_gi_set_quality, livePtr, quality)
  }

  /** RenderingServer.lightmap_set_probe_capture_update_speed */
  final def lightmapSetProbeCaptureUpdateSpeed(speed: Double): Unit = {
    if (gdext.classes.RenderingServer.mb_lightmap_set_probe_capture_update_speed == null) gdext.classes.RenderingServer.mb_lightmap_set_probe_capture_update_speed = MethodBind.get("RenderingServer", "lightmap_set_probe_capture_update_speed", 373806689L)
    Ptrcall.callVoid1(gdext.classes.RenderingServer.mb_lightmap_set_probe_capture_update_speed, livePtr, speed)
  }

  /** RenderingServer.viewport_set_occlusion_rays_per_thread */
  final def viewportSetOcclusionRaysPerThread(raysPerThread: Long): Unit = {
    if (gdext.classes.RenderingServer.mb_viewport_set_occlusion_rays_per_thread == null) gdext.classes.RenderingServer.mb_viewport_set_occlusion_rays_per_thread = MethodBind.get("RenderingServer", "viewport_set_occlusion_rays_per_thread", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.RenderingServer.mb_viewport_set_occlusion_rays_per_thread, livePtr, raysPerThread)
  }

  /** RenderingServer.viewport_set_occlusion_culling_build_quality */
  final def viewportSetOcclusionCullingBuildQuality(quality: gdext.classes.RenderingServer.ViewportOcclusionCullingBuildQuality): Unit = {
    if (gdext.classes.RenderingServer.mb_viewport_set_occlusion_culling_build_quality == null) gdext.classes.RenderingServer.mb_viewport_set_occlusion_culling_build_quality = MethodBind.get("RenderingServer", "viewport_set_occlusion_culling_build_quality", 2069725696L)
    Ptrcall.callVoid1(gdext.classes.RenderingServer.mb_viewport_set_occlusion_culling_build_quality, livePtr, quality)
  }

  /** RenderingServer.environment_glow_set_use_bicubic_upscale */
  final def environmentGlowSetUseBicubicUpscale(enable: Boolean): Unit = {
    if (gdext.classes.RenderingServer.mb_environment_glow_set_use_bicubic_upscale == null) gdext.classes.RenderingServer.mb_environment_glow_set_use_bicubic_upscale = MethodBind.get("RenderingServer", "environment_glow_set_use_bicubic_upscale", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RenderingServer.mb_environment_glow_set_use_bicubic_upscale, livePtr, enable)
  }

  /** RenderingServer.environment_set_ssr_half_size */
  final def environmentSetSsrHalfSize(halfSize: Boolean): Unit = {
    if (gdext.classes.RenderingServer.mb_environment_set_ssr_half_size == null) gdext.classes.RenderingServer.mb_environment_set_ssr_half_size = MethodBind.get("RenderingServer", "environment_set_ssr_half_size", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RenderingServer.mb_environment_set_ssr_half_size, livePtr, halfSize)
  }

  /** RenderingServer.environment_set_ssr_roughness_quality */
  final def environmentSetSsrRoughnessQuality(quality: gdext.classes.RenderingServer.EnvironmentSSRRoughnessQuality): Unit = {
    if (gdext.classes.RenderingServer.mb_environment_set_ssr_roughness_quality == null) gdext.classes.RenderingServer.mb_environment_set_ssr_roughness_quality = MethodBind.get("RenderingServer", "environment_set_ssr_roughness_quality", 1190026788L)
    Ptrcall.callVoid1(gdext.classes.RenderingServer.mb_environment_set_ssr_roughness_quality, livePtr, quality)
  }

  /** RenderingServer.environment_set_ssao_quality */
  final def environmentSetSsaoQuality(quality: gdext.classes.RenderingServer.EnvironmentSSAOQuality, halfSize: Boolean, adaptiveTarget: Double, blurPasses: Long, fadeoutFrom: Double, fadeoutTo: Double): Unit = {
    if (gdext.classes.RenderingServer.mb_environment_set_ssao_quality == null) gdext.classes.RenderingServer.mb_environment_set_ssao_quality = MethodBind.get("RenderingServer", "environment_set_ssao_quality", 189753569L)
    Ptrcall.callVoid6(gdext.classes.RenderingServer.mb_environment_set_ssao_quality, livePtr, quality, halfSize, adaptiveTarget, blurPasses, fadeoutFrom, fadeoutTo)
  }

  /** RenderingServer.environment_set_ssil_quality */
  final def environmentSetSsilQuality(quality: gdext.classes.RenderingServer.EnvironmentSSILQuality, halfSize: Boolean, adaptiveTarget: Double, blurPasses: Long, fadeoutFrom: Double, fadeoutTo: Double): Unit = {
    if (gdext.classes.RenderingServer.mb_environment_set_ssil_quality == null) gdext.classes.RenderingServer.mb_environment_set_ssil_quality = MethodBind.get("RenderingServer", "environment_set_ssil_quality", 1713836683L)
    Ptrcall.callVoid6(gdext.classes.RenderingServer.mb_environment_set_ssil_quality, livePtr, quality, halfSize, adaptiveTarget, blurPasses, fadeoutFrom, fadeoutTo)
  }

  /** RenderingServer.environment_set_sdfgi_ray_count */
  final def environmentSetSdfgiRayCount(rayCount: gdext.classes.RenderingServer.EnvironmentSDFGIRayCount): Unit = {
    if (gdext.classes.RenderingServer.mb_environment_set_sdfgi_ray_count == null) gdext.classes.RenderingServer.mb_environment_set_sdfgi_ray_count = MethodBind.get("RenderingServer", "environment_set_sdfgi_ray_count", 340137951L)
    Ptrcall.callVoid1(gdext.classes.RenderingServer.mb_environment_set_sdfgi_ray_count, livePtr, rayCount)
  }

  /** RenderingServer.environment_set_sdfgi_frames_to_converge */
  final def environmentSetSdfgiFramesToConverge(frames: gdext.classes.RenderingServer.EnvironmentSDFGIFramesToConverge): Unit = {
    if (gdext.classes.RenderingServer.mb_environment_set_sdfgi_frames_to_converge == null) gdext.classes.RenderingServer.mb_environment_set_sdfgi_frames_to_converge = MethodBind.get("RenderingServer", "environment_set_sdfgi_frames_to_converge", 2182444374L)
    Ptrcall.callVoid1(gdext.classes.RenderingServer.mb_environment_set_sdfgi_frames_to_converge, livePtr, frames)
  }

  /** RenderingServer.environment_set_sdfgi_frames_to_update_light */
  final def environmentSetSdfgiFramesToUpdateLight(frames: gdext.classes.RenderingServer.EnvironmentSDFGIFramesToUpdateLight): Unit = {
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
  final def subSurfaceScatteringSetQuality(quality: gdext.classes.RenderingServer.SubSurfaceScatteringQuality): Unit = {
    if (gdext.classes.RenderingServer.mb_sub_surface_scattering_set_quality == null) gdext.classes.RenderingServer.mb_sub_surface_scattering_set_quality = MethodBind.get("RenderingServer", "sub_surface_scattering_set_quality", 64571803L)
    Ptrcall.callVoid1(gdext.classes.RenderingServer.mb_sub_surface_scattering_set_quality, livePtr, quality)
  }

  /** RenderingServer.sub_surface_scattering_set_scale */
  final def subSurfaceScatteringSetScale(scale: Double, depthScale: Double): Unit = {
    if (gdext.classes.RenderingServer.mb_sub_surface_scattering_set_scale == null) gdext.classes.RenderingServer.mb_sub_surface_scattering_set_scale = MethodBind.get("RenderingServer", "sub_surface_scattering_set_scale", 1017552074L)
    Ptrcall.callVoid2(gdext.classes.RenderingServer.mb_sub_surface_scattering_set_scale, livePtr, scale, depthScale)
  }

  /** RenderingServer.camera_attributes_set_dof_blur_quality */
  final def cameraAttributesSetDofBlurQuality(quality: gdext.classes.RenderingServer.DOFBlurQuality, useJitter: Boolean): Unit = {
    if (gdext.classes.RenderingServer.mb_camera_attributes_set_dof_blur_quality == null) gdext.classes.RenderingServer.mb_camera_attributes_set_dof_blur_quality = MethodBind.get("RenderingServer", "camera_attributes_set_dof_blur_quality", 2220136795L)
    Ptrcall.callVoid2(gdext.classes.RenderingServer.mb_camera_attributes_set_dof_blur_quality, livePtr, quality, useJitter)
  }

  /** RenderingServer.camera_attributes_set_dof_blur_bokeh_shape */
  final def cameraAttributesSetDofBlurBokehShape(shape: gdext.classes.RenderingServer.DOFBokehShape): Unit = {
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
  final def globalShaderParameterRemove(name: String): Unit = {
    if (gdext.classes.RenderingServer.mb_global_shader_parameter_remove == null) gdext.classes.RenderingServer.mb_global_shader_parameter_remove = MethodBind.get("RenderingServer", "global_shader_parameter_remove", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.RenderingServer.mb_global_shader_parameter_remove, livePtr, SnArg(name))
  }

  /** RenderingServer.global_shader_parameter_get_type */
  final def globalShaderParameterGetType(name: String): gdext.classes.RenderingServer.GlobalShaderParameterType = {
    if (gdext.classes.RenderingServer.mb_global_shader_parameter_get_type == null) gdext.classes.RenderingServer.mb_global_shader_parameter_get_type = MethodBind.get("RenderingServer", "global_shader_parameter_get_type", 1601414142L)
    gdext.classes.RenderingServer.GlobalShaderParameterType(Ptrcall.call1[SnArg, Long](gdext.classes.RenderingServer.mb_global_shader_parameter_get_type, livePtr, SnArg(name)))
  }

  /** RenderingServer.has_changed */
  final def hasChanged(): Boolean = {
    if (gdext.classes.RenderingServer.mb_has_changed == null) gdext.classes.RenderingServer.mb_has_changed = MethodBind.get("RenderingServer", "has_changed", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RenderingServer.mb_has_changed, livePtr)
  }

  /** RenderingServer.get_rendering_info */
  final def getRenderingInfo(info: gdext.classes.RenderingServer.RenderingInfo): Long = {
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
  final def getVideoAdapterType(): gdext.classes.RenderingDevice.DeviceType = {
    if (gdext.classes.RenderingServer.mb_get_video_adapter_type == null) gdext.classes.RenderingServer.mb_get_video_adapter_type = MethodBind.get("RenderingServer", "get_video_adapter_type", 3099547011L)
    gdext.classes.RenderingDevice.DeviceType(Ptrcall.call0[Long](gdext.classes.RenderingServer.mb_get_video_adapter_type, livePtr))
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
  final def setBootImageWithStretch(image: Image, color: gdext.builtin.Color, stretchMode: gdext.classes.RenderingServer.SplashStretchMode, useFilter: Boolean = true): Unit = {
    if (gdext.classes.RenderingServer.mb_set_boot_image_with_stretch == null) gdext.classes.RenderingServer.mb_set_boot_image_with_stretch = MethodBind.get("RenderingServer", "set_boot_image_with_stretch", 1104470771L)
    Ptrcall.callVoid4(gdext.classes.RenderingServer.mb_set_boot_image_with_stretch, livePtr, Wrappers.handle(image), color, stretchMode, useFilter)
  }

  /** RenderingServer.set_boot_image */
  final def setBootImage(image: Image, color: gdext.builtin.Color, scale: Boolean, useFilter: Boolean = true): Unit = {
    if (gdext.classes.RenderingServer.mb_set_boot_image == null) gdext.classes.RenderingServer.mb_set_boot_image = MethodBind.get("RenderingServer", "set_boot_image", 3759744527L)
    Ptrcall.callVoid4(gdext.classes.RenderingServer.mb_set_boot_image, livePtr, Wrappers.handle(image), color, scale, useFilter)
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
  final def forceDraw(swapBuffers: Boolean = true, frameStep: Double = 0.0): Unit = {
    if (gdext.classes.RenderingServer.mb_force_draw == null) gdext.classes.RenderingServer.mb_force_draw = MethodBind.get("RenderingServer", "force_draw", 1076185472L)
    Ptrcall.callVoid2(gdext.classes.RenderingServer.mb_force_draw, livePtr, swapBuffers, frameStep)
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
  final def hasFeature(feature: gdext.classes.RenderingServer.Features): Boolean = {
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

  /** Forwards to [[singleton]]: RenderingServer.material_set_use_debanding */
  final def materialSetUseDebanding(enable: Boolean): Unit =
    singleton.materialSetUseDebanding(enable)

  /** Forwards to [[singleton]]: RenderingServer.mesh_surface_get_format_offset */
  final def meshSurfaceGetFormatOffset(format: gdext.classes.RenderingServer.ArrayFormat, vertexCount: Long, arrayIndex: Long): Long =
    singleton.meshSurfaceGetFormatOffset(format, vertexCount, arrayIndex)

  /** Forwards to [[singleton]]: RenderingServer.mesh_surface_get_format_vertex_stride */
  final def meshSurfaceGetFormatVertexStride(format: gdext.classes.RenderingServer.ArrayFormat, vertexCount: Long): Long =
    singleton.meshSurfaceGetFormatVertexStride(format, vertexCount)

  /** Forwards to [[singleton]]: RenderingServer.mesh_surface_get_format_normal_tangent_stride */
  final def meshSurfaceGetFormatNormalTangentStride(format: gdext.classes.RenderingServer.ArrayFormat, vertexCount: Long): Long =
    singleton.meshSurfaceGetFormatNormalTangentStride(format, vertexCount)

  /** Forwards to [[singleton]]: RenderingServer.mesh_surface_get_format_attribute_stride */
  final def meshSurfaceGetFormatAttributeStride(format: gdext.classes.RenderingServer.ArrayFormat, vertexCount: Long): Long =
    singleton.meshSurfaceGetFormatAttributeStride(format, vertexCount)

  /** Forwards to [[singleton]]: RenderingServer.mesh_surface_get_format_skin_stride */
  final def meshSurfaceGetFormatSkinStride(format: gdext.classes.RenderingServer.ArrayFormat, vertexCount: Long): Long =
    singleton.meshSurfaceGetFormatSkinStride(format, vertexCount)

  /** Forwards to [[singleton]]: RenderingServer.mesh_surface_get_format_index_stride */
  final def meshSurfaceGetFormatIndexStride(format: gdext.classes.RenderingServer.ArrayFormat, vertexCount: Long): Long =
    singleton.meshSurfaceGetFormatIndexStride(format, vertexCount)

  /** Forwards to [[singleton]]: RenderingServer.light_projectors_set_filter */
  final def lightProjectorsSetFilter(filter: gdext.classes.RenderingServer.LightProjectorFilter): Unit =
    singleton.lightProjectorsSetFilter(filter)

  /** Forwards to [[singleton]]: RenderingServer.lightmaps_set_bicubic_filter */
  final def lightmapsSetBicubicFilter(enable: Boolean): Unit =
    singleton.lightmapsSetBicubicFilter(enable)

  /** Forwards to [[singleton]]: RenderingServer.positional_soft_shadow_filter_set_quality */
  final def positionalSoftShadowFilterSetQuality(quality: gdext.classes.RenderingServer.ShadowQuality): Unit =
    singleton.positionalSoftShadowFilterSetQuality(quality)

  /** Forwards to [[singleton]]: RenderingServer.directional_soft_shadow_filter_set_quality */
  final def directionalSoftShadowFilterSetQuality(quality: gdext.classes.RenderingServer.ShadowQuality): Unit =
    singleton.directionalSoftShadowFilterSetQuality(quality)

  /** Forwards to [[singleton]]: RenderingServer.directional_shadow_atlas_set_size */
  final def directionalShadowAtlasSetSize(size: Long, is16bits: Boolean): Unit =
    singleton.directionalShadowAtlasSetSize(size, is16bits)

  /** Forwards to [[singleton]]: RenderingServer.decals_set_filter */
  final def decalsSetFilter(filter: gdext.classes.RenderingServer.DecalFilter): Unit =
    singleton.decalsSetFilter(filter)

  /** Forwards to [[singleton]]: RenderingServer.gi_set_use_half_resolution */
  final def giSetUseHalfResolution(halfResolution: Boolean): Unit =
    singleton.giSetUseHalfResolution(halfResolution)

  /** Forwards to [[singleton]]: RenderingServer.voxel_gi_set_quality */
  final def voxelGiSetQuality(quality: gdext.classes.RenderingServer.VoxelGIQuality): Unit =
    singleton.voxelGiSetQuality(quality)

  /** Forwards to [[singleton]]: RenderingServer.lightmap_set_probe_capture_update_speed */
  final def lightmapSetProbeCaptureUpdateSpeed(speed: Double): Unit =
    singleton.lightmapSetProbeCaptureUpdateSpeed(speed)

  /** Forwards to [[singleton]]: RenderingServer.viewport_set_occlusion_rays_per_thread */
  final def viewportSetOcclusionRaysPerThread(raysPerThread: Long): Unit =
    singleton.viewportSetOcclusionRaysPerThread(raysPerThread)

  /** Forwards to [[singleton]]: RenderingServer.viewport_set_occlusion_culling_build_quality */
  final def viewportSetOcclusionCullingBuildQuality(quality: gdext.classes.RenderingServer.ViewportOcclusionCullingBuildQuality): Unit =
    singleton.viewportSetOcclusionCullingBuildQuality(quality)

  /** Forwards to [[singleton]]: RenderingServer.environment_glow_set_use_bicubic_upscale */
  final def environmentGlowSetUseBicubicUpscale(enable: Boolean): Unit =
    singleton.environmentGlowSetUseBicubicUpscale(enable)

  /** Forwards to [[singleton]]: RenderingServer.environment_set_ssr_half_size */
  final def environmentSetSsrHalfSize(halfSize: Boolean): Unit =
    singleton.environmentSetSsrHalfSize(halfSize)

  /** Forwards to [[singleton]]: RenderingServer.environment_set_ssr_roughness_quality */
  final def environmentSetSsrRoughnessQuality(quality: gdext.classes.RenderingServer.EnvironmentSSRRoughnessQuality): Unit =
    singleton.environmentSetSsrRoughnessQuality(quality)

  /** Forwards to [[singleton]]: RenderingServer.environment_set_ssao_quality */
  final def environmentSetSsaoQuality(quality: gdext.classes.RenderingServer.EnvironmentSSAOQuality, halfSize: Boolean, adaptiveTarget: Double, blurPasses: Long, fadeoutFrom: Double, fadeoutTo: Double): Unit =
    singleton.environmentSetSsaoQuality(quality, halfSize, adaptiveTarget, blurPasses, fadeoutFrom, fadeoutTo)

  /** Forwards to [[singleton]]: RenderingServer.environment_set_ssil_quality */
  final def environmentSetSsilQuality(quality: gdext.classes.RenderingServer.EnvironmentSSILQuality, halfSize: Boolean, adaptiveTarget: Double, blurPasses: Long, fadeoutFrom: Double, fadeoutTo: Double): Unit =
    singleton.environmentSetSsilQuality(quality, halfSize, adaptiveTarget, blurPasses, fadeoutFrom, fadeoutTo)

  /** Forwards to [[singleton]]: RenderingServer.environment_set_sdfgi_ray_count */
  final def environmentSetSdfgiRayCount(rayCount: gdext.classes.RenderingServer.EnvironmentSDFGIRayCount): Unit =
    singleton.environmentSetSdfgiRayCount(rayCount)

  /** Forwards to [[singleton]]: RenderingServer.environment_set_sdfgi_frames_to_converge */
  final def environmentSetSdfgiFramesToConverge(frames: gdext.classes.RenderingServer.EnvironmentSDFGIFramesToConverge): Unit =
    singleton.environmentSetSdfgiFramesToConverge(frames)

  /** Forwards to [[singleton]]: RenderingServer.environment_set_sdfgi_frames_to_update_light */
  final def environmentSetSdfgiFramesToUpdateLight(frames: gdext.classes.RenderingServer.EnvironmentSDFGIFramesToUpdateLight): Unit =
    singleton.environmentSetSdfgiFramesToUpdateLight(frames)

  /** Forwards to [[singleton]]: RenderingServer.environment_set_volumetric_fog_volume_size */
  final def environmentSetVolumetricFogVolumeSize(size: Long, depth: Long): Unit =
    singleton.environmentSetVolumetricFogVolumeSize(size, depth)

  /** Forwards to [[singleton]]: RenderingServer.environment_set_volumetric_fog_filter_active */
  final def environmentSetVolumetricFogFilterActive(active: Boolean): Unit =
    singleton.environmentSetVolumetricFogFilterActive(active)

  /** Forwards to [[singleton]]: RenderingServer.screen_space_roughness_limiter_set_active */
  final def screenSpaceRoughnessLimiterSetActive(enable: Boolean, amount: Double, limit: Double): Unit =
    singleton.screenSpaceRoughnessLimiterSetActive(enable, amount, limit)

  /** Forwards to [[singleton]]: RenderingServer.sub_surface_scattering_set_quality */
  final def subSurfaceScatteringSetQuality(quality: gdext.classes.RenderingServer.SubSurfaceScatteringQuality): Unit =
    singleton.subSurfaceScatteringSetQuality(quality)

  /** Forwards to [[singleton]]: RenderingServer.sub_surface_scattering_set_scale */
  final def subSurfaceScatteringSetScale(scale: Double, depthScale: Double): Unit =
    singleton.subSurfaceScatteringSetScale(scale, depthScale)

  /** Forwards to [[singleton]]: RenderingServer.camera_attributes_set_dof_blur_quality */
  final def cameraAttributesSetDofBlurQuality(quality: gdext.classes.RenderingServer.DOFBlurQuality, useJitter: Boolean): Unit =
    singleton.cameraAttributesSetDofBlurQuality(quality, useJitter)

  /** Forwards to [[singleton]]: RenderingServer.camera_attributes_set_dof_blur_bokeh_shape */
  final def cameraAttributesSetDofBlurBokehShape(shape: gdext.classes.RenderingServer.DOFBokehShape): Unit =
    singleton.cameraAttributesSetDofBlurBokehShape(shape)

  /** Forwards to [[singleton]]: RenderingServer.canvas_set_disable_scale */
  final def canvasSetDisableScale(disable: Boolean): Unit =
    singleton.canvasSetDisableScale(disable)

  /** Forwards to [[singleton]]: RenderingServer.canvas_set_shadow_texture_size */
  final def canvasSetShadowTextureSize(size: Long): Unit =
    singleton.canvasSetShadowTextureSize(size)

  /** Forwards to [[singleton]]: RenderingServer.global_shader_parameter_remove */
  final def globalShaderParameterRemove(name: String): Unit =
    singleton.globalShaderParameterRemove(name)

  /** Forwards to [[singleton]]: RenderingServer.global_shader_parameter_get_type */
  final def globalShaderParameterGetType(name: String): gdext.classes.RenderingServer.GlobalShaderParameterType =
    singleton.globalShaderParameterGetType(name)

  /** Forwards to [[singleton]]: RenderingServer.has_changed */
  final def hasChanged(): Boolean =
    singleton.hasChanged()

  /** Forwards to [[singleton]]: RenderingServer.get_rendering_info */
  final def getRenderingInfo(info: gdext.classes.RenderingServer.RenderingInfo): Long =
    singleton.getRenderingInfo(info)

  /** Forwards to [[singleton]]: RenderingServer.get_video_adapter_name */
  final def getVideoAdapterName(): String =
    singleton.getVideoAdapterName()

  /** Forwards to [[singleton]]: RenderingServer.get_video_adapter_vendor */
  final def getVideoAdapterVendor(): String =
    singleton.getVideoAdapterVendor()

  /** Forwards to [[singleton]]: RenderingServer.get_video_adapter_type */
  final def getVideoAdapterType(): gdext.classes.RenderingDevice.DeviceType =
    singleton.getVideoAdapterType()

  /** Forwards to [[singleton]]: RenderingServer.get_video_adapter_api_version */
  final def getVideoAdapterApiVersion(): String =
    singleton.getVideoAdapterApiVersion()

  /** Forwards to [[singleton]]: RenderingServer.get_current_rendering_driver_name */
  final def getCurrentRenderingDriverName(): String =
    singleton.getCurrentRenderingDriverName()

  /** Forwards to [[singleton]]: RenderingServer.get_current_rendering_method */
  final def getCurrentRenderingMethod(): String =
    singleton.getCurrentRenderingMethod()

  /** Forwards to [[singleton]]: RenderingServer.set_boot_image_with_stretch */
  final def setBootImageWithStretch(image: Image, color: gdext.builtin.Color, stretchMode: gdext.classes.RenderingServer.SplashStretchMode, useFilter: Boolean = true): Unit =
    singleton.setBootImageWithStretch(image, color, stretchMode, useFilter)

  /** Forwards to [[singleton]]: RenderingServer.set_boot_image */
  final def setBootImage(image: Image, color: gdext.builtin.Color, scale: Boolean, useFilter: Boolean = true): Unit =
    singleton.setBootImage(image, color, scale, useFilter)

  /** Forwards to [[singleton]]: RenderingServer.get_default_clear_color */
  final def getDefaultClearColor(): gdext.builtin.Color =
    singleton.getDefaultClearColor()

  /** Forwards to [[singleton]]: RenderingServer.set_default_clear_color */
  final def setDefaultClearColor(color: gdext.builtin.Color): Unit =
    singleton.setDefaultClearColor(color)

  /** Forwards to [[singleton]]: RenderingServer.has_os_feature */
  final def hasOsFeature(feature: String): Boolean =
    singleton.hasOsFeature(feature)

  /** Forwards to [[singleton]]: RenderingServer.set_debug_generate_wireframes */
  final def setDebugGenerateWireframes(generate: Boolean): Unit =
    singleton.setDebugGenerateWireframes(generate)

  /** Forwards to [[singleton]]: RenderingServer.is_render_loop_enabled */
  final def isRenderLoopEnabled(): Boolean =
    singleton.isRenderLoopEnabled()

  /** Forwards to [[singleton]]: RenderingServer.set_render_loop_enabled */
  final def setRenderLoopEnabled(enabled: Boolean): Unit =
    singleton.setRenderLoopEnabled(enabled)

  /** Forwards to [[singleton]]: RenderingServer.get_frame_setup_time_cpu */
  final def getFrameSetupTimeCpu(): Double =
    singleton.getFrameSetupTimeCpu()

  /** Forwards to [[singleton]]: RenderingServer.force_sync */
  final def forceSync(): Unit =
    singleton.forceSync()

  /** Forwards to [[singleton]]: RenderingServer.force_draw */
  final def forceDraw(swapBuffers: Boolean = true, frameStep: Double = 0.0): Unit =
    singleton.forceDraw(swapBuffers, frameStep)

  /** Forwards to [[singleton]]: RenderingServer.get_rendering_device */
  final def getRenderingDevice(): RenderingDevice =
    singleton.getRenderingDevice()

  /** Forwards to [[singleton]]: RenderingServer.create_local_rendering_device */
  final def createLocalRenderingDevice(): RenderingDevice =
    singleton.createLocalRenderingDevice()

  /** Forwards to [[singleton]]: RenderingServer.is_on_render_thread */
  final def isOnRenderThread(): Boolean =
    singleton.isOnRenderThread()

  /** Forwards to [[singleton]]: RenderingServer.has_feature */
  final def hasFeature(feature: gdext.classes.RenderingServer.Features): Boolean =
    singleton.hasFeature(feature)

  /** Godot enum `RenderingServer.TextureType`. */
  opaque type TextureType <: Long = Long

  object TextureType {
    final val Type2d: TextureType = 0L.asInstanceOf[TextureType]
    final val Layered: TextureType = 1L.asInstanceOf[TextureType]
    final val Type3d: TextureType = 2L.asInstanceOf[TextureType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): TextureType = value.asInstanceOf[TextureType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[TextureType] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[TextureType]]

    extension (self: TextureType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Type2d"
        case 1L => "Layered"
        case 2L => "Type3d"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.TextureLayeredType`. */
  opaque type TextureLayeredType <: Long = Long

  object TextureLayeredType {
    final val Layered2dArray: TextureLayeredType = 0L.asInstanceOf[TextureLayeredType]
    final val Cubemap: TextureLayeredType = 1L.asInstanceOf[TextureLayeredType]
    final val CubemapArray: TextureLayeredType = 2L.asInstanceOf[TextureLayeredType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): TextureLayeredType = value.asInstanceOf[TextureLayeredType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[TextureLayeredType] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[TextureLayeredType]]

    extension (self: TextureLayeredType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Layered2dArray"
        case 1L => "Cubemap"
        case 2L => "CubemapArray"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.CubeMapLayer`. */
  opaque type CubeMapLayer <: Long = Long

  object CubeMapLayer {
    final val Left: CubeMapLayer = 0L.asInstanceOf[CubeMapLayer]
    final val Right: CubeMapLayer = 1L.asInstanceOf[CubeMapLayer]
    final val Bottom: CubeMapLayer = 2L.asInstanceOf[CubeMapLayer]
    final val Top: CubeMapLayer = 3L.asInstanceOf[CubeMapLayer]
    final val Front: CubeMapLayer = 4L.asInstanceOf[CubeMapLayer]
    final val Back: CubeMapLayer = 5L.asInstanceOf[CubeMapLayer]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): CubeMapLayer = value.asInstanceOf[CubeMapLayer]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[CubeMapLayer] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L).asInstanceOf[scala.IArray[CubeMapLayer]]

    extension (self: CubeMapLayer)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Left"
        case 1L => "Right"
        case 2L => "Bottom"
        case 3L => "Top"
        case 4L => "Front"
        case 5L => "Back"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.ShaderMode`. */
  opaque type ShaderMode <: Long = Long

  object ShaderMode {
    final val Spatial: ShaderMode = 0L.asInstanceOf[ShaderMode]
    final val CanvasItem: ShaderMode = 1L.asInstanceOf[ShaderMode]
    final val Particles: ShaderMode = 2L.asInstanceOf[ShaderMode]
    final val Sky: ShaderMode = 3L.asInstanceOf[ShaderMode]
    final val Fog: ShaderMode = 4L.asInstanceOf[ShaderMode]
    final val Max: ShaderMode = 5L.asInstanceOf[ShaderMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ShaderMode = value.asInstanceOf[ShaderMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ShaderMode] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L).asInstanceOf[scala.IArray[ShaderMode]]

    extension (self: ShaderMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Spatial"
        case 1L => "CanvasItem"
        case 2L => "Particles"
        case 3L => "Sky"
        case 4L => "Fog"
        case 5L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.ArrayType`. */
  opaque type ArrayType <: Long = Long

  object ArrayType {
    final val Vertex: ArrayType = 0L.asInstanceOf[ArrayType]
    final val Normal: ArrayType = 1L.asInstanceOf[ArrayType]
    final val Tangent: ArrayType = 2L.asInstanceOf[ArrayType]
    final val Color: ArrayType = 3L.asInstanceOf[ArrayType]
    final val TexUv: ArrayType = 4L.asInstanceOf[ArrayType]
    final val TexUv2: ArrayType = 5L.asInstanceOf[ArrayType]
    final val Custom0: ArrayType = 6L.asInstanceOf[ArrayType]
    final val Custom1: ArrayType = 7L.asInstanceOf[ArrayType]
    final val Custom2: ArrayType = 8L.asInstanceOf[ArrayType]
    final val Custom3: ArrayType = 9L.asInstanceOf[ArrayType]
    final val Bones: ArrayType = 10L.asInstanceOf[ArrayType]
    final val Weights: ArrayType = 11L.asInstanceOf[ArrayType]
    final val Index: ArrayType = 12L.asInstanceOf[ArrayType]
    final val Max: ArrayType = 13L.asInstanceOf[ArrayType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ArrayType = value.asInstanceOf[ArrayType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ArrayType] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 11L, 12L, 13L).asInstanceOf[scala.IArray[ArrayType]]

    extension (self: ArrayType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Vertex"
        case 1L => "Normal"
        case 2L => "Tangent"
        case 3L => "Color"
        case 4L => "TexUv"
        case 5L => "TexUv2"
        case 6L => "Custom0"
        case 7L => "Custom1"
        case 8L => "Custom2"
        case 9L => "Custom3"
        case 10L => "Bones"
        case 11L => "Weights"
        case 12L => "Index"
        case 13L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.ArrayCustomFormat`. */
  opaque type ArrayCustomFormat <: Long = Long

  object ArrayCustomFormat {
    final val Rgba8Unorm: ArrayCustomFormat = 0L.asInstanceOf[ArrayCustomFormat]
    final val Rgba8Snorm: ArrayCustomFormat = 1L.asInstanceOf[ArrayCustomFormat]
    final val RgHalf: ArrayCustomFormat = 2L.asInstanceOf[ArrayCustomFormat]
    final val RgbaHalf: ArrayCustomFormat = 3L.asInstanceOf[ArrayCustomFormat]
    final val RFloat: ArrayCustomFormat = 4L.asInstanceOf[ArrayCustomFormat]
    final val RgFloat: ArrayCustomFormat = 5L.asInstanceOf[ArrayCustomFormat]
    final val RgbFloat: ArrayCustomFormat = 6L.asInstanceOf[ArrayCustomFormat]
    final val RgbaFloat: ArrayCustomFormat = 7L.asInstanceOf[ArrayCustomFormat]
    final val Max: ArrayCustomFormat = 8L.asInstanceOf[ArrayCustomFormat]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ArrayCustomFormat = value.asInstanceOf[ArrayCustomFormat]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ArrayCustomFormat] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L).asInstanceOf[scala.IArray[ArrayCustomFormat]]

    extension (self: ArrayCustomFormat)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Rgba8Unorm"
        case 1L => "Rgba8Snorm"
        case 2L => "RgHalf"
        case 3L => "RgbaHalf"
        case 4L => "RFloat"
        case 5L => "RgFloat"
        case 6L => "RgbFloat"
        case 7L => "RgbaFloat"
        case 8L => "Max"
        case other => other.toString
      }
  }

  /** Godot bitfield `RenderingServer.ArrayFormat`. */
  opaque type ArrayFormat = Long

  object ArrayFormat {
    final val FormatVertex: ArrayFormat = 1L.asInstanceOf[ArrayFormat]
    final val FormatNormal: ArrayFormat = 2L.asInstanceOf[ArrayFormat]
    final val FormatTangent: ArrayFormat = 4L.asInstanceOf[ArrayFormat]
    final val FormatColor: ArrayFormat = 8L.asInstanceOf[ArrayFormat]
    final val FormatTexUv: ArrayFormat = 16L.asInstanceOf[ArrayFormat]
    final val FormatTexUv2: ArrayFormat = 32L.asInstanceOf[ArrayFormat]
    final val FormatCustom0: ArrayFormat = 64L.asInstanceOf[ArrayFormat]
    final val FormatCustom1: ArrayFormat = 128L.asInstanceOf[ArrayFormat]
    final val FormatCustom2: ArrayFormat = 256L.asInstanceOf[ArrayFormat]
    final val FormatCustom3: ArrayFormat = 512L.asInstanceOf[ArrayFormat]
    final val FormatBones: ArrayFormat = 1024L.asInstanceOf[ArrayFormat]
    final val FormatWeights: ArrayFormat = 2048L.asInstanceOf[ArrayFormat]
    final val FormatIndex: ArrayFormat = 4096L.asInstanceOf[ArrayFormat]
    final val FormatBlendShapeMask: ArrayFormat = 7L.asInstanceOf[ArrayFormat]
    final val FormatCustomBase: ArrayFormat = 13L.asInstanceOf[ArrayFormat]
    final val FormatCustomBits: ArrayFormat = 3L.asInstanceOf[ArrayFormat]
    final val FormatCustom0Shift: ArrayFormat = 13L.asInstanceOf[ArrayFormat]
    final val FormatCustom1Shift: ArrayFormat = 16L.asInstanceOf[ArrayFormat]
    final val FormatCustom2Shift: ArrayFormat = 19L.asInstanceOf[ArrayFormat]
    final val FormatCustom3Shift: ArrayFormat = 22L.asInstanceOf[ArrayFormat]
    final val FormatCustomMask: ArrayFormat = 7L.asInstanceOf[ArrayFormat]
    final val CompressFlagsBase: ArrayFormat = 25L.asInstanceOf[ArrayFormat]
    final val FlagUse2dVertices: ArrayFormat = 33554432L.asInstanceOf[ArrayFormat]
    final val FlagUseDynamicUpdate: ArrayFormat = 67108864L.asInstanceOf[ArrayFormat]
    final val FlagUse8BoneWeights: ArrayFormat = 134217728L.asInstanceOf[ArrayFormat]
    final val FlagUsesEmptyVertexArray: ArrayFormat = 268435456L.asInstanceOf[ArrayFormat]
    final val FlagCompressAttributes: ArrayFormat = 536870912L.asInstanceOf[ArrayFormat]
    final val FlagFormatVersionBase: ArrayFormat = 35L.asInstanceOf[ArrayFormat]
    final val FlagFormatVersionShift: ArrayFormat = 35L.asInstanceOf[ArrayFormat]
    final val FlagFormatVersion1: ArrayFormat = 0L.asInstanceOf[ArrayFormat]
    final val FlagFormatVersion2: ArrayFormat = 34359738368L.asInstanceOf[ArrayFormat]
    final val FlagFormatCurrentVersion: ArrayFormat = 34359738368L.asInstanceOf[ArrayFormat]
    final val FlagFormatVersionMask: ArrayFormat = 255L.asInstanceOf[ArrayFormat]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ArrayFormat = value.asInstanceOf[ArrayFormat]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ArrayFormat] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 7L, 8L, 13L, 16L, 19L, 22L, 25L, 32L, 35L, 64L, 128L, 255L, 256L, 512L, 1024L, 2048L, 4096L, 33554432L, 67108864L, 134217728L, 268435456L, 536870912L, 34359738368L).asInstanceOf[scala.IArray[ArrayFormat]]

    extension (self: ArrayFormat)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "FlagFormatVersion1"
        case 1L => "FormatVertex"
        case 2L => "FormatNormal"
        case 3L => "FormatCustomBits"
        case 4L => "FormatTangent"
        case 7L => "FormatBlendShapeMask"
        case 8L => "FormatColor"
        case 13L => "FormatCustomBase"
        case 16L => "FormatTexUv"
        case 19L => "FormatCustom2Shift"
        case 22L => "FormatCustom3Shift"
        case 25L => "CompressFlagsBase"
        case 32L => "FormatTexUv2"
        case 35L => "FlagFormatVersionBase"
        case 64L => "FormatCustom0"
        case 128L => "FormatCustom1"
        case 255L => "FlagFormatVersionMask"
        case 256L => "FormatCustom2"
        case 512L => "FormatCustom3"
        case 1024L => "FormatBones"
        case 2048L => "FormatWeights"
        case 4096L => "FormatIndex"
        case 33554432L => "FlagUse2dVertices"
        case 67108864L => "FlagUseDynamicUpdate"
        case 134217728L => "FlagUse8BoneWeights"
        case 268435456L => "FlagUsesEmptyVertexArray"
        case 536870912L => "FlagCompressAttributes"
        case 34359738368L => "FlagFormatVersion2"
        case other => other.toString
      }
    extension (self: ArrayFormat) {
      inline def value: Long = self.asInstanceOf[Long]
      inline def |(other: ArrayFormat): ArrayFormat = (self.value | other.value).asInstanceOf[ArrayFormat]
      inline def &(other: ArrayFormat): ArrayFormat = (self.value & other.value).asInstanceOf[ArrayFormat]
      /** Every bit of `flag` is set. */
      inline def has(flag: ArrayFormat): Boolean = (self.value & flag.value) == flag.value
    }
  }

  /** Godot enum `RenderingServer.PrimitiveType`. */
  opaque type PrimitiveType <: Long = Long

  object PrimitiveType {
    final val Points: PrimitiveType = 0L.asInstanceOf[PrimitiveType]
    final val Lines: PrimitiveType = 1L.asInstanceOf[PrimitiveType]
    final val LineStrip: PrimitiveType = 2L.asInstanceOf[PrimitiveType]
    final val Triangles: PrimitiveType = 3L.asInstanceOf[PrimitiveType]
    final val TriangleStrip: PrimitiveType = 4L.asInstanceOf[PrimitiveType]
    final val Max: PrimitiveType = 5L.asInstanceOf[PrimitiveType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): PrimitiveType = value.asInstanceOf[PrimitiveType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[PrimitiveType] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L).asInstanceOf[scala.IArray[PrimitiveType]]

    extension (self: PrimitiveType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Points"
        case 1L => "Lines"
        case 2L => "LineStrip"
        case 3L => "Triangles"
        case 4L => "TriangleStrip"
        case 5L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.BlendShapeMode`. */
  opaque type BlendShapeMode <: Long = Long

  object BlendShapeMode {
    final val Normalized: BlendShapeMode = 0L.asInstanceOf[BlendShapeMode]
    final val Relative: BlendShapeMode = 1L.asInstanceOf[BlendShapeMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): BlendShapeMode = value.asInstanceOf[BlendShapeMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[BlendShapeMode] = scala.IArray[Long](0L, 1L).asInstanceOf[scala.IArray[BlendShapeMode]]

    extension (self: BlendShapeMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Normalized"
        case 1L => "Relative"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.MultimeshTransformFormat`. */
  opaque type MultimeshTransformFormat <: Long = Long

  object MultimeshTransformFormat {
    final val Transform2d: MultimeshTransformFormat = 0L.asInstanceOf[MultimeshTransformFormat]
    final val Transform3d: MultimeshTransformFormat = 1L.asInstanceOf[MultimeshTransformFormat]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): MultimeshTransformFormat = value.asInstanceOf[MultimeshTransformFormat]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[MultimeshTransformFormat] = scala.IArray[Long](0L, 1L).asInstanceOf[scala.IArray[MultimeshTransformFormat]]

    extension (self: MultimeshTransformFormat)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Transform2d"
        case 1L => "Transform3d"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.MultimeshPhysicsInterpolationQuality`. */
  opaque type MultimeshPhysicsInterpolationQuality <: Long = Long

  object MultimeshPhysicsInterpolationQuality {
    final val Fast: MultimeshPhysicsInterpolationQuality = 0L.asInstanceOf[MultimeshPhysicsInterpolationQuality]
    final val High: MultimeshPhysicsInterpolationQuality = 1L.asInstanceOf[MultimeshPhysicsInterpolationQuality]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): MultimeshPhysicsInterpolationQuality = value.asInstanceOf[MultimeshPhysicsInterpolationQuality]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[MultimeshPhysicsInterpolationQuality] = scala.IArray[Long](0L, 1L).asInstanceOf[scala.IArray[MultimeshPhysicsInterpolationQuality]]

    extension (self: MultimeshPhysicsInterpolationQuality)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Fast"
        case 1L => "High"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.LightProjectorFilter`. */
  opaque type LightProjectorFilter <: Long = Long

  object LightProjectorFilter {
    final val Nearest: LightProjectorFilter = 0L.asInstanceOf[LightProjectorFilter]
    final val Linear: LightProjectorFilter = 1L.asInstanceOf[LightProjectorFilter]
    final val NearestMipmaps: LightProjectorFilter = 2L.asInstanceOf[LightProjectorFilter]
    final val LinearMipmaps: LightProjectorFilter = 3L.asInstanceOf[LightProjectorFilter]
    final val NearestMipmapsAnisotropic: LightProjectorFilter = 4L.asInstanceOf[LightProjectorFilter]
    final val LinearMipmapsAnisotropic: LightProjectorFilter = 5L.asInstanceOf[LightProjectorFilter]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): LightProjectorFilter = value.asInstanceOf[LightProjectorFilter]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[LightProjectorFilter] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L).asInstanceOf[scala.IArray[LightProjectorFilter]]

    extension (self: LightProjectorFilter)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Nearest"
        case 1L => "Linear"
        case 2L => "NearestMipmaps"
        case 3L => "LinearMipmaps"
        case 4L => "NearestMipmapsAnisotropic"
        case 5L => "LinearMipmapsAnisotropic"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.LightType`. */
  opaque type LightType <: Long = Long

  object LightType {
    final val Directional: LightType = 0L.asInstanceOf[LightType]
    final val Omni: LightType = 1L.asInstanceOf[LightType]
    final val Spot: LightType = 2L.asInstanceOf[LightType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): LightType = value.asInstanceOf[LightType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[LightType] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[LightType]]

    extension (self: LightType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Directional"
        case 1L => "Omni"
        case 2L => "Spot"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.LightParam`. */
  opaque type LightParam <: Long = Long

  object LightParam {
    final val Energy: LightParam = 0L.asInstanceOf[LightParam]
    final val IndirectEnergy: LightParam = 1L.asInstanceOf[LightParam]
    final val VolumetricFogEnergy: LightParam = 2L.asInstanceOf[LightParam]
    final val Specular: LightParam = 3L.asInstanceOf[LightParam]
    final val Range: LightParam = 4L.asInstanceOf[LightParam]
    final val Size: LightParam = 5L.asInstanceOf[LightParam]
    final val Attenuation: LightParam = 6L.asInstanceOf[LightParam]
    final val SpotAngle: LightParam = 7L.asInstanceOf[LightParam]
    final val SpotAttenuation: LightParam = 8L.asInstanceOf[LightParam]
    final val ShadowMaxDistance: LightParam = 9L.asInstanceOf[LightParam]
    final val ShadowSplit1Offset: LightParam = 10L.asInstanceOf[LightParam]
    final val ShadowSplit2Offset: LightParam = 11L.asInstanceOf[LightParam]
    final val ShadowSplit3Offset: LightParam = 12L.asInstanceOf[LightParam]
    final val ShadowFadeStart: LightParam = 13L.asInstanceOf[LightParam]
    final val ShadowNormalBias: LightParam = 14L.asInstanceOf[LightParam]
    final val ShadowBias: LightParam = 15L.asInstanceOf[LightParam]
    final val ShadowPancakeSize: LightParam = 16L.asInstanceOf[LightParam]
    final val ShadowOpacity: LightParam = 17L.asInstanceOf[LightParam]
    final val ShadowBlur: LightParam = 18L.asInstanceOf[LightParam]
    final val TransmittanceBias: LightParam = 19L.asInstanceOf[LightParam]
    final val Intensity: LightParam = 20L.asInstanceOf[LightParam]
    final val Max: LightParam = 21L.asInstanceOf[LightParam]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): LightParam = value.asInstanceOf[LightParam]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[LightParam] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 11L, 12L, 13L, 14L, 15L, 16L, 17L, 18L, 19L, 20L, 21L).asInstanceOf[scala.IArray[LightParam]]

    extension (self: LightParam)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Energy"
        case 1L => "IndirectEnergy"
        case 2L => "VolumetricFogEnergy"
        case 3L => "Specular"
        case 4L => "Range"
        case 5L => "Size"
        case 6L => "Attenuation"
        case 7L => "SpotAngle"
        case 8L => "SpotAttenuation"
        case 9L => "ShadowMaxDistance"
        case 10L => "ShadowSplit1Offset"
        case 11L => "ShadowSplit2Offset"
        case 12L => "ShadowSplit3Offset"
        case 13L => "ShadowFadeStart"
        case 14L => "ShadowNormalBias"
        case 15L => "ShadowBias"
        case 16L => "ShadowPancakeSize"
        case 17L => "ShadowOpacity"
        case 18L => "ShadowBlur"
        case 19L => "TransmittanceBias"
        case 20L => "Intensity"
        case 21L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.LightBakeMode`. */
  opaque type LightBakeMode <: Long = Long

  object LightBakeMode {
    final val Disabled: LightBakeMode = 0L.asInstanceOf[LightBakeMode]
    final val Static: LightBakeMode = 1L.asInstanceOf[LightBakeMode]
    final val Dynamic: LightBakeMode = 2L.asInstanceOf[LightBakeMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): LightBakeMode = value.asInstanceOf[LightBakeMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[LightBakeMode] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[LightBakeMode]]

    extension (self: LightBakeMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Disabled"
        case 1L => "Static"
        case 2L => "Dynamic"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.LightOmniShadowMode`. */
  opaque type LightOmniShadowMode <: Long = Long

  object LightOmniShadowMode {
    final val DualParaboloid: LightOmniShadowMode = 0L.asInstanceOf[LightOmniShadowMode]
    final val Cube: LightOmniShadowMode = 1L.asInstanceOf[LightOmniShadowMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): LightOmniShadowMode = value.asInstanceOf[LightOmniShadowMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[LightOmniShadowMode] = scala.IArray[Long](0L, 1L).asInstanceOf[scala.IArray[LightOmniShadowMode]]

    extension (self: LightOmniShadowMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "DualParaboloid"
        case 1L => "Cube"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.LightDirectionalShadowMode`. */
  opaque type LightDirectionalShadowMode <: Long = Long

  object LightDirectionalShadowMode {
    final val Orthogonal: LightDirectionalShadowMode = 0L.asInstanceOf[LightDirectionalShadowMode]
    final val Parallel2Splits: LightDirectionalShadowMode = 1L.asInstanceOf[LightDirectionalShadowMode]
    final val Parallel4Splits: LightDirectionalShadowMode = 2L.asInstanceOf[LightDirectionalShadowMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): LightDirectionalShadowMode = value.asInstanceOf[LightDirectionalShadowMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[LightDirectionalShadowMode] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[LightDirectionalShadowMode]]

    extension (self: LightDirectionalShadowMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Orthogonal"
        case 1L => "Parallel2Splits"
        case 2L => "Parallel4Splits"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.LightDirectionalSkyMode`. */
  opaque type LightDirectionalSkyMode <: Long = Long

  object LightDirectionalSkyMode {
    final val LightAndSky: LightDirectionalSkyMode = 0L.asInstanceOf[LightDirectionalSkyMode]
    final val LightOnly: LightDirectionalSkyMode = 1L.asInstanceOf[LightDirectionalSkyMode]
    final val SkyOnly: LightDirectionalSkyMode = 2L.asInstanceOf[LightDirectionalSkyMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): LightDirectionalSkyMode = value.asInstanceOf[LightDirectionalSkyMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[LightDirectionalSkyMode] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[LightDirectionalSkyMode]]

    extension (self: LightDirectionalSkyMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "LightAndSky"
        case 1L => "LightOnly"
        case 2L => "SkyOnly"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.ShadowQuality`. */
  opaque type ShadowQuality <: Long = Long

  object ShadowQuality {
    final val Hard: ShadowQuality = 0L.asInstanceOf[ShadowQuality]
    final val SoftVeryLow: ShadowQuality = 1L.asInstanceOf[ShadowQuality]
    final val SoftLow: ShadowQuality = 2L.asInstanceOf[ShadowQuality]
    final val SoftMedium: ShadowQuality = 3L.asInstanceOf[ShadowQuality]
    final val SoftHigh: ShadowQuality = 4L.asInstanceOf[ShadowQuality]
    final val SoftUltra: ShadowQuality = 5L.asInstanceOf[ShadowQuality]
    final val Max: ShadowQuality = 6L.asInstanceOf[ShadowQuality]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ShadowQuality = value.asInstanceOf[ShadowQuality]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ShadowQuality] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L).asInstanceOf[scala.IArray[ShadowQuality]]

    extension (self: ShadowQuality)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Hard"
        case 1L => "SoftVeryLow"
        case 2L => "SoftLow"
        case 3L => "SoftMedium"
        case 4L => "SoftHigh"
        case 5L => "SoftUltra"
        case 6L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.ReflectionProbeUpdateMode`. */
  opaque type ReflectionProbeUpdateMode <: Long = Long

  object ReflectionProbeUpdateMode {
    final val Once: ReflectionProbeUpdateMode = 0L.asInstanceOf[ReflectionProbeUpdateMode]
    final val Always: ReflectionProbeUpdateMode = 1L.asInstanceOf[ReflectionProbeUpdateMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ReflectionProbeUpdateMode = value.asInstanceOf[ReflectionProbeUpdateMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ReflectionProbeUpdateMode] = scala.IArray[Long](0L, 1L).asInstanceOf[scala.IArray[ReflectionProbeUpdateMode]]

    extension (self: ReflectionProbeUpdateMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Once"
        case 1L => "Always"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.ReflectionProbeAmbientMode`. */
  opaque type ReflectionProbeAmbientMode <: Long = Long

  object ReflectionProbeAmbientMode {
    final val Disabled: ReflectionProbeAmbientMode = 0L.asInstanceOf[ReflectionProbeAmbientMode]
    final val Environment: ReflectionProbeAmbientMode = 1L.asInstanceOf[ReflectionProbeAmbientMode]
    final val Color: ReflectionProbeAmbientMode = 2L.asInstanceOf[ReflectionProbeAmbientMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ReflectionProbeAmbientMode = value.asInstanceOf[ReflectionProbeAmbientMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ReflectionProbeAmbientMode] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[ReflectionProbeAmbientMode]]

    extension (self: ReflectionProbeAmbientMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Disabled"
        case 1L => "Environment"
        case 2L => "Color"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.DecalTexture`. */
  opaque type DecalTexture <: Long = Long

  object DecalTexture {
    final val Albedo: DecalTexture = 0L.asInstanceOf[DecalTexture]
    final val Normal: DecalTexture = 1L.asInstanceOf[DecalTexture]
    final val Orm: DecalTexture = 2L.asInstanceOf[DecalTexture]
    final val Emission: DecalTexture = 3L.asInstanceOf[DecalTexture]
    final val Max: DecalTexture = 4L.asInstanceOf[DecalTexture]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): DecalTexture = value.asInstanceOf[DecalTexture]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[DecalTexture] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L).asInstanceOf[scala.IArray[DecalTexture]]

    extension (self: DecalTexture)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Albedo"
        case 1L => "Normal"
        case 2L => "Orm"
        case 3L => "Emission"
        case 4L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.DecalFilter`. */
  opaque type DecalFilter <: Long = Long

  object DecalFilter {
    final val Nearest: DecalFilter = 0L.asInstanceOf[DecalFilter]
    final val Linear: DecalFilter = 1L.asInstanceOf[DecalFilter]
    final val NearestMipmaps: DecalFilter = 2L.asInstanceOf[DecalFilter]
    final val LinearMipmaps: DecalFilter = 3L.asInstanceOf[DecalFilter]
    final val NearestMipmapsAnisotropic: DecalFilter = 4L.asInstanceOf[DecalFilter]
    final val LinearMipmapsAnisotropic: DecalFilter = 5L.asInstanceOf[DecalFilter]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): DecalFilter = value.asInstanceOf[DecalFilter]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[DecalFilter] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L).asInstanceOf[scala.IArray[DecalFilter]]

    extension (self: DecalFilter)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Nearest"
        case 1L => "Linear"
        case 2L => "NearestMipmaps"
        case 3L => "LinearMipmaps"
        case 4L => "NearestMipmapsAnisotropic"
        case 5L => "LinearMipmapsAnisotropic"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.VoxelGIQuality`. */
  opaque type VoxelGIQuality <: Long = Long

  object VoxelGIQuality {
    final val Low: VoxelGIQuality = 0L.asInstanceOf[VoxelGIQuality]
    final val High: VoxelGIQuality = 1L.asInstanceOf[VoxelGIQuality]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): VoxelGIQuality = value.asInstanceOf[VoxelGIQuality]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[VoxelGIQuality] = scala.IArray[Long](0L, 1L).asInstanceOf[scala.IArray[VoxelGIQuality]]

    extension (self: VoxelGIQuality)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Low"
        case 1L => "High"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.ParticlesMode`. */
  opaque type ParticlesMode <: Long = Long

  object ParticlesMode {
    final val Mode2d: ParticlesMode = 0L.asInstanceOf[ParticlesMode]
    final val Mode3d: ParticlesMode = 1L.asInstanceOf[ParticlesMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ParticlesMode = value.asInstanceOf[ParticlesMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ParticlesMode] = scala.IArray[Long](0L, 1L).asInstanceOf[scala.IArray[ParticlesMode]]

    extension (self: ParticlesMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Mode2d"
        case 1L => "Mode3d"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.ParticlesTransformAlign`. */
  opaque type ParticlesTransformAlign <: Long = Long

  object ParticlesTransformAlign {
    final val Disabled: ParticlesTransformAlign = 0L.asInstanceOf[ParticlesTransformAlign]
    final val ZBillboard: ParticlesTransformAlign = 1L.asInstanceOf[ParticlesTransformAlign]
    final val YToVelocity: ParticlesTransformAlign = 2L.asInstanceOf[ParticlesTransformAlign]
    final val ZBillboardYToVelocity: ParticlesTransformAlign = 3L.asInstanceOf[ParticlesTransformAlign]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ParticlesTransformAlign = value.asInstanceOf[ParticlesTransformAlign]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ParticlesTransformAlign] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[ParticlesTransformAlign]]

    extension (self: ParticlesTransformAlign)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Disabled"
        case 1L => "ZBillboard"
        case 2L => "YToVelocity"
        case 3L => "ZBillboardYToVelocity"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.ParticlesDrawOrder`. */
  opaque type ParticlesDrawOrder <: Long = Long

  object ParticlesDrawOrder {
    final val Index: ParticlesDrawOrder = 0L.asInstanceOf[ParticlesDrawOrder]
    final val Lifetime: ParticlesDrawOrder = 1L.asInstanceOf[ParticlesDrawOrder]
    final val ReverseLifetime: ParticlesDrawOrder = 2L.asInstanceOf[ParticlesDrawOrder]
    final val ViewDepth: ParticlesDrawOrder = 3L.asInstanceOf[ParticlesDrawOrder]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ParticlesDrawOrder = value.asInstanceOf[ParticlesDrawOrder]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ParticlesDrawOrder] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[ParticlesDrawOrder]]

    extension (self: ParticlesDrawOrder)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Index"
        case 1L => "Lifetime"
        case 2L => "ReverseLifetime"
        case 3L => "ViewDepth"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.ParticlesCollisionType`. */
  opaque type ParticlesCollisionType <: Long = Long

  object ParticlesCollisionType {
    final val SphereAttract: ParticlesCollisionType = 0L.asInstanceOf[ParticlesCollisionType]
    final val BoxAttract: ParticlesCollisionType = 1L.asInstanceOf[ParticlesCollisionType]
    final val VectorFieldAttract: ParticlesCollisionType = 2L.asInstanceOf[ParticlesCollisionType]
    final val SphereCollide: ParticlesCollisionType = 3L.asInstanceOf[ParticlesCollisionType]
    final val BoxCollide: ParticlesCollisionType = 4L.asInstanceOf[ParticlesCollisionType]
    final val SdfCollide: ParticlesCollisionType = 5L.asInstanceOf[ParticlesCollisionType]
    final val HeightfieldCollide: ParticlesCollisionType = 6L.asInstanceOf[ParticlesCollisionType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ParticlesCollisionType = value.asInstanceOf[ParticlesCollisionType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ParticlesCollisionType] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L).asInstanceOf[scala.IArray[ParticlesCollisionType]]

    extension (self: ParticlesCollisionType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "SphereAttract"
        case 1L => "BoxAttract"
        case 2L => "VectorFieldAttract"
        case 3L => "SphereCollide"
        case 4L => "BoxCollide"
        case 5L => "SdfCollide"
        case 6L => "HeightfieldCollide"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.ParticlesCollisionHeightfieldResolution`. */
  opaque type ParticlesCollisionHeightfieldResolution <: Long = Long

  object ParticlesCollisionHeightfieldResolution {
    final val Resolution256: ParticlesCollisionHeightfieldResolution = 0L.asInstanceOf[ParticlesCollisionHeightfieldResolution]
    final val Resolution512: ParticlesCollisionHeightfieldResolution = 1L.asInstanceOf[ParticlesCollisionHeightfieldResolution]
    final val Resolution1024: ParticlesCollisionHeightfieldResolution = 2L.asInstanceOf[ParticlesCollisionHeightfieldResolution]
    final val Resolution2048: ParticlesCollisionHeightfieldResolution = 3L.asInstanceOf[ParticlesCollisionHeightfieldResolution]
    final val Resolution4096: ParticlesCollisionHeightfieldResolution = 4L.asInstanceOf[ParticlesCollisionHeightfieldResolution]
    final val Resolution8192: ParticlesCollisionHeightfieldResolution = 5L.asInstanceOf[ParticlesCollisionHeightfieldResolution]
    final val Max: ParticlesCollisionHeightfieldResolution = 6L.asInstanceOf[ParticlesCollisionHeightfieldResolution]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ParticlesCollisionHeightfieldResolution = value.asInstanceOf[ParticlesCollisionHeightfieldResolution]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ParticlesCollisionHeightfieldResolution] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L).asInstanceOf[scala.IArray[ParticlesCollisionHeightfieldResolution]]

    extension (self: ParticlesCollisionHeightfieldResolution)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Resolution256"
        case 1L => "Resolution512"
        case 2L => "Resolution1024"
        case 3L => "Resolution2048"
        case 4L => "Resolution4096"
        case 5L => "Resolution8192"
        case 6L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.FogVolumeShape`. */
  opaque type FogVolumeShape <: Long = Long

  object FogVolumeShape {
    final val Ellipsoid: FogVolumeShape = 0L.asInstanceOf[FogVolumeShape]
    final val Cone: FogVolumeShape = 1L.asInstanceOf[FogVolumeShape]
    final val Cylinder: FogVolumeShape = 2L.asInstanceOf[FogVolumeShape]
    final val Box: FogVolumeShape = 3L.asInstanceOf[FogVolumeShape]
    final val World: FogVolumeShape = 4L.asInstanceOf[FogVolumeShape]
    final val Max: FogVolumeShape = 5L.asInstanceOf[FogVolumeShape]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): FogVolumeShape = value.asInstanceOf[FogVolumeShape]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[FogVolumeShape] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L).asInstanceOf[scala.IArray[FogVolumeShape]]

    extension (self: FogVolumeShape)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Ellipsoid"
        case 1L => "Cone"
        case 2L => "Cylinder"
        case 3L => "Box"
        case 4L => "World"
        case 5L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.ViewportScaling3DMode`. */
  opaque type ViewportScaling3DMode <: Long = Long

  object ViewportScaling3DMode {
    final val Bilinear: ViewportScaling3DMode = 0L.asInstanceOf[ViewportScaling3DMode]
    final val Fsr: ViewportScaling3DMode = 1L.asInstanceOf[ViewportScaling3DMode]
    final val Fsr2: ViewportScaling3DMode = 2L.asInstanceOf[ViewportScaling3DMode]
    final val MetalfxSpatial: ViewportScaling3DMode = 3L.asInstanceOf[ViewportScaling3DMode]
    final val MetalfxTemporal: ViewportScaling3DMode = 4L.asInstanceOf[ViewportScaling3DMode]
    final val Max: ViewportScaling3DMode = 5L.asInstanceOf[ViewportScaling3DMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ViewportScaling3DMode = value.asInstanceOf[ViewportScaling3DMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ViewportScaling3DMode] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L).asInstanceOf[scala.IArray[ViewportScaling3DMode]]

    extension (self: ViewportScaling3DMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Bilinear"
        case 1L => "Fsr"
        case 2L => "Fsr2"
        case 3L => "MetalfxSpatial"
        case 4L => "MetalfxTemporal"
        case 5L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.ViewportUpdateMode`. */
  opaque type ViewportUpdateMode <: Long = Long

  object ViewportUpdateMode {
    final val Disabled: ViewportUpdateMode = 0L.asInstanceOf[ViewportUpdateMode]
    final val Once: ViewportUpdateMode = 1L.asInstanceOf[ViewportUpdateMode]
    final val WhenVisible: ViewportUpdateMode = 2L.asInstanceOf[ViewportUpdateMode]
    final val WhenParentVisible: ViewportUpdateMode = 3L.asInstanceOf[ViewportUpdateMode]
    final val Always: ViewportUpdateMode = 4L.asInstanceOf[ViewportUpdateMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ViewportUpdateMode = value.asInstanceOf[ViewportUpdateMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ViewportUpdateMode] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L).asInstanceOf[scala.IArray[ViewportUpdateMode]]

    extension (self: ViewportUpdateMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Disabled"
        case 1L => "Once"
        case 2L => "WhenVisible"
        case 3L => "WhenParentVisible"
        case 4L => "Always"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.ViewportClearMode`. */
  opaque type ViewportClearMode <: Long = Long

  object ViewportClearMode {
    final val Always: ViewportClearMode = 0L.asInstanceOf[ViewportClearMode]
    final val Never: ViewportClearMode = 1L.asInstanceOf[ViewportClearMode]
    final val OnlyNextFrame: ViewportClearMode = 2L.asInstanceOf[ViewportClearMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ViewportClearMode = value.asInstanceOf[ViewportClearMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ViewportClearMode] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[ViewportClearMode]]

    extension (self: ViewportClearMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Always"
        case 1L => "Never"
        case 2L => "OnlyNextFrame"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.ViewportEnvironmentMode`. */
  opaque type ViewportEnvironmentMode <: Long = Long

  object ViewportEnvironmentMode {
    final val Disabled: ViewportEnvironmentMode = 0L.asInstanceOf[ViewportEnvironmentMode]
    final val Enabled: ViewportEnvironmentMode = 1L.asInstanceOf[ViewportEnvironmentMode]
    final val Inherit: ViewportEnvironmentMode = 2L.asInstanceOf[ViewportEnvironmentMode]
    final val Max: ViewportEnvironmentMode = 3L.asInstanceOf[ViewportEnvironmentMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ViewportEnvironmentMode = value.asInstanceOf[ViewportEnvironmentMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ViewportEnvironmentMode] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[ViewportEnvironmentMode]]

    extension (self: ViewportEnvironmentMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Disabled"
        case 1L => "Enabled"
        case 2L => "Inherit"
        case 3L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.ViewportSDFOversize`. */
  opaque type ViewportSDFOversize <: Long = Long

  object ViewportSDFOversize {
    final val Oversize100Percent: ViewportSDFOversize = 0L.asInstanceOf[ViewportSDFOversize]
    final val Oversize120Percent: ViewportSDFOversize = 1L.asInstanceOf[ViewportSDFOversize]
    final val Oversize150Percent: ViewportSDFOversize = 2L.asInstanceOf[ViewportSDFOversize]
    final val Oversize200Percent: ViewportSDFOversize = 3L.asInstanceOf[ViewportSDFOversize]
    final val Max: ViewportSDFOversize = 4L.asInstanceOf[ViewportSDFOversize]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ViewportSDFOversize = value.asInstanceOf[ViewportSDFOversize]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ViewportSDFOversize] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L).asInstanceOf[scala.IArray[ViewportSDFOversize]]

    extension (self: ViewportSDFOversize)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Oversize100Percent"
        case 1L => "Oversize120Percent"
        case 2L => "Oversize150Percent"
        case 3L => "Oversize200Percent"
        case 4L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.ViewportSDFScale`. */
  opaque type ViewportSDFScale <: Long = Long

  object ViewportSDFScale {
    final val Scale100Percent: ViewportSDFScale = 0L.asInstanceOf[ViewportSDFScale]
    final val Scale50Percent: ViewportSDFScale = 1L.asInstanceOf[ViewportSDFScale]
    final val Scale25Percent: ViewportSDFScale = 2L.asInstanceOf[ViewportSDFScale]
    final val Max: ViewportSDFScale = 3L.asInstanceOf[ViewportSDFScale]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ViewportSDFScale = value.asInstanceOf[ViewportSDFScale]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ViewportSDFScale] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[ViewportSDFScale]]

    extension (self: ViewportSDFScale)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Scale100Percent"
        case 1L => "Scale50Percent"
        case 2L => "Scale25Percent"
        case 3L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.ViewportMSAA`. */
  opaque type ViewportMSAA <: Long = Long

  object ViewportMSAA {
    final val Disabled: ViewportMSAA = 0L.asInstanceOf[ViewportMSAA]
    final val Msaa2x: ViewportMSAA = 1L.asInstanceOf[ViewportMSAA]
    final val Msaa4x: ViewportMSAA = 2L.asInstanceOf[ViewportMSAA]
    final val Msaa8x: ViewportMSAA = 3L.asInstanceOf[ViewportMSAA]
    final val Max: ViewportMSAA = 4L.asInstanceOf[ViewportMSAA]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ViewportMSAA = value.asInstanceOf[ViewportMSAA]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ViewportMSAA] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L).asInstanceOf[scala.IArray[ViewportMSAA]]

    extension (self: ViewportMSAA)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Disabled"
        case 1L => "Msaa2x"
        case 2L => "Msaa4x"
        case 3L => "Msaa8x"
        case 4L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.ViewportAnisotropicFiltering`. */
  opaque type ViewportAnisotropicFiltering <: Long = Long

  object ViewportAnisotropicFiltering {
    final val Disabled: ViewportAnisotropicFiltering = 0L.asInstanceOf[ViewportAnisotropicFiltering]
    final val Anisotropy2x: ViewportAnisotropicFiltering = 1L.asInstanceOf[ViewportAnisotropicFiltering]
    final val Anisotropy4x: ViewportAnisotropicFiltering = 2L.asInstanceOf[ViewportAnisotropicFiltering]
    final val Anisotropy8x: ViewportAnisotropicFiltering = 3L.asInstanceOf[ViewportAnisotropicFiltering]
    final val Anisotropy16x: ViewportAnisotropicFiltering = 4L.asInstanceOf[ViewportAnisotropicFiltering]
    final val Max: ViewportAnisotropicFiltering = 5L.asInstanceOf[ViewportAnisotropicFiltering]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ViewportAnisotropicFiltering = value.asInstanceOf[ViewportAnisotropicFiltering]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ViewportAnisotropicFiltering] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L).asInstanceOf[scala.IArray[ViewportAnisotropicFiltering]]

    extension (self: ViewportAnisotropicFiltering)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Disabled"
        case 1L => "Anisotropy2x"
        case 2L => "Anisotropy4x"
        case 3L => "Anisotropy8x"
        case 4L => "Anisotropy16x"
        case 5L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.ViewportScreenSpaceAA`. */
  opaque type ViewportScreenSpaceAA <: Long = Long

  object ViewportScreenSpaceAA {
    final val Disabled: ViewportScreenSpaceAA = 0L.asInstanceOf[ViewportScreenSpaceAA]
    final val Fxaa: ViewportScreenSpaceAA = 1L.asInstanceOf[ViewportScreenSpaceAA]
    final val Smaa: ViewportScreenSpaceAA = 2L.asInstanceOf[ViewportScreenSpaceAA]
    final val Max: ViewportScreenSpaceAA = 3L.asInstanceOf[ViewportScreenSpaceAA]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ViewportScreenSpaceAA = value.asInstanceOf[ViewportScreenSpaceAA]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ViewportScreenSpaceAA] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[ViewportScreenSpaceAA]]

    extension (self: ViewportScreenSpaceAA)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Disabled"
        case 1L => "Fxaa"
        case 2L => "Smaa"
        case 3L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.ViewportOcclusionCullingBuildQuality`. */
  opaque type ViewportOcclusionCullingBuildQuality <: Long = Long

  object ViewportOcclusionCullingBuildQuality {
    final val Low: ViewportOcclusionCullingBuildQuality = 0L.asInstanceOf[ViewportOcclusionCullingBuildQuality]
    final val Medium: ViewportOcclusionCullingBuildQuality = 1L.asInstanceOf[ViewportOcclusionCullingBuildQuality]
    final val High: ViewportOcclusionCullingBuildQuality = 2L.asInstanceOf[ViewportOcclusionCullingBuildQuality]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ViewportOcclusionCullingBuildQuality = value.asInstanceOf[ViewportOcclusionCullingBuildQuality]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ViewportOcclusionCullingBuildQuality] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[ViewportOcclusionCullingBuildQuality]]

    extension (self: ViewportOcclusionCullingBuildQuality)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Low"
        case 1L => "Medium"
        case 2L => "High"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.ViewportRenderInfo`. */
  opaque type ViewportRenderInfo <: Long = Long

  object ViewportRenderInfo {
    final val ObjectsInFrame: ViewportRenderInfo = 0L.asInstanceOf[ViewportRenderInfo]
    final val PrimitivesInFrame: ViewportRenderInfo = 1L.asInstanceOf[ViewportRenderInfo]
    final val DrawCallsInFrame: ViewportRenderInfo = 2L.asInstanceOf[ViewportRenderInfo]
    final val Max: ViewportRenderInfo = 3L.asInstanceOf[ViewportRenderInfo]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ViewportRenderInfo = value.asInstanceOf[ViewportRenderInfo]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ViewportRenderInfo] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[ViewportRenderInfo]]

    extension (self: ViewportRenderInfo)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "ObjectsInFrame"
        case 1L => "PrimitivesInFrame"
        case 2L => "DrawCallsInFrame"
        case 3L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.ViewportRenderInfoType`. */
  opaque type ViewportRenderInfoType <: Long = Long

  object ViewportRenderInfoType {
    final val Visible: ViewportRenderInfoType = 0L.asInstanceOf[ViewportRenderInfoType]
    final val Shadow: ViewportRenderInfoType = 1L.asInstanceOf[ViewportRenderInfoType]
    final val Canvas: ViewportRenderInfoType = 2L.asInstanceOf[ViewportRenderInfoType]
    final val Max: ViewportRenderInfoType = 3L.asInstanceOf[ViewportRenderInfoType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ViewportRenderInfoType = value.asInstanceOf[ViewportRenderInfoType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ViewportRenderInfoType] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[ViewportRenderInfoType]]

    extension (self: ViewportRenderInfoType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Visible"
        case 1L => "Shadow"
        case 2L => "Canvas"
        case 3L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.ViewportDebugDraw`. */
  opaque type ViewportDebugDraw <: Long = Long

  object ViewportDebugDraw {
    final val Disabled: ViewportDebugDraw = 0L.asInstanceOf[ViewportDebugDraw]
    final val Unshaded: ViewportDebugDraw = 1L.asInstanceOf[ViewportDebugDraw]
    final val Lighting: ViewportDebugDraw = 2L.asInstanceOf[ViewportDebugDraw]
    final val Overdraw: ViewportDebugDraw = 3L.asInstanceOf[ViewportDebugDraw]
    final val Wireframe: ViewportDebugDraw = 4L.asInstanceOf[ViewportDebugDraw]
    final val NormalBuffer: ViewportDebugDraw = 5L.asInstanceOf[ViewportDebugDraw]
    final val VoxelGiAlbedo: ViewportDebugDraw = 6L.asInstanceOf[ViewportDebugDraw]
    final val VoxelGiLighting: ViewportDebugDraw = 7L.asInstanceOf[ViewportDebugDraw]
    final val VoxelGiEmission: ViewportDebugDraw = 8L.asInstanceOf[ViewportDebugDraw]
    final val ShadowAtlas: ViewportDebugDraw = 9L.asInstanceOf[ViewportDebugDraw]
    final val DirectionalShadowAtlas: ViewportDebugDraw = 10L.asInstanceOf[ViewportDebugDraw]
    final val SceneLuminance: ViewportDebugDraw = 11L.asInstanceOf[ViewportDebugDraw]
    final val Ssao: ViewportDebugDraw = 12L.asInstanceOf[ViewportDebugDraw]
    final val Ssil: ViewportDebugDraw = 13L.asInstanceOf[ViewportDebugDraw]
    final val PssmSplits: ViewportDebugDraw = 14L.asInstanceOf[ViewportDebugDraw]
    final val DecalAtlas: ViewportDebugDraw = 15L.asInstanceOf[ViewportDebugDraw]
    final val Sdfgi: ViewportDebugDraw = 16L.asInstanceOf[ViewportDebugDraw]
    final val SdfgiProbes: ViewportDebugDraw = 17L.asInstanceOf[ViewportDebugDraw]
    final val GiBuffer: ViewportDebugDraw = 18L.asInstanceOf[ViewportDebugDraw]
    final val DisableLod: ViewportDebugDraw = 19L.asInstanceOf[ViewportDebugDraw]
    final val ClusterOmniLights: ViewportDebugDraw = 20L.asInstanceOf[ViewportDebugDraw]
    final val ClusterSpotLights: ViewportDebugDraw = 21L.asInstanceOf[ViewportDebugDraw]
    final val ClusterDecals: ViewportDebugDraw = 22L.asInstanceOf[ViewportDebugDraw]
    final val ClusterReflectionProbes: ViewportDebugDraw = 23L.asInstanceOf[ViewportDebugDraw]
    final val Occluders: ViewportDebugDraw = 24L.asInstanceOf[ViewportDebugDraw]
    final val MotionVectors: ViewportDebugDraw = 25L.asInstanceOf[ViewportDebugDraw]
    final val InternalBuffer: ViewportDebugDraw = 26L.asInstanceOf[ViewportDebugDraw]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ViewportDebugDraw = value.asInstanceOf[ViewportDebugDraw]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ViewportDebugDraw] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 11L, 12L, 13L, 14L, 15L, 16L, 17L, 18L, 19L, 20L, 21L, 22L, 23L, 24L, 25L, 26L).asInstanceOf[scala.IArray[ViewportDebugDraw]]

    extension (self: ViewportDebugDraw)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Disabled"
        case 1L => "Unshaded"
        case 2L => "Lighting"
        case 3L => "Overdraw"
        case 4L => "Wireframe"
        case 5L => "NormalBuffer"
        case 6L => "VoxelGiAlbedo"
        case 7L => "VoxelGiLighting"
        case 8L => "VoxelGiEmission"
        case 9L => "ShadowAtlas"
        case 10L => "DirectionalShadowAtlas"
        case 11L => "SceneLuminance"
        case 12L => "Ssao"
        case 13L => "Ssil"
        case 14L => "PssmSplits"
        case 15L => "DecalAtlas"
        case 16L => "Sdfgi"
        case 17L => "SdfgiProbes"
        case 18L => "GiBuffer"
        case 19L => "DisableLod"
        case 20L => "ClusterOmniLights"
        case 21L => "ClusterSpotLights"
        case 22L => "ClusterDecals"
        case 23L => "ClusterReflectionProbes"
        case 24L => "Occluders"
        case 25L => "MotionVectors"
        case 26L => "InternalBuffer"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.ViewportVRSMode`. */
  opaque type ViewportVRSMode <: Long = Long

  object ViewportVRSMode {
    final val Disabled: ViewportVRSMode = 0L.asInstanceOf[ViewportVRSMode]
    final val Texture: ViewportVRSMode = 1L.asInstanceOf[ViewportVRSMode]
    final val Xr: ViewportVRSMode = 2L.asInstanceOf[ViewportVRSMode]
    final val Max: ViewportVRSMode = 3L.asInstanceOf[ViewportVRSMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ViewportVRSMode = value.asInstanceOf[ViewportVRSMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ViewportVRSMode] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[ViewportVRSMode]]

    extension (self: ViewportVRSMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Disabled"
        case 1L => "Texture"
        case 2L => "Xr"
        case 3L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.ViewportVRSUpdateMode`. */
  opaque type ViewportVRSUpdateMode <: Long = Long

  object ViewportVRSUpdateMode {
    final val Disabled: ViewportVRSUpdateMode = 0L.asInstanceOf[ViewportVRSUpdateMode]
    final val Once: ViewportVRSUpdateMode = 1L.asInstanceOf[ViewportVRSUpdateMode]
    final val Always: ViewportVRSUpdateMode = 2L.asInstanceOf[ViewportVRSUpdateMode]
    final val Max: ViewportVRSUpdateMode = 3L.asInstanceOf[ViewportVRSUpdateMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ViewportVRSUpdateMode = value.asInstanceOf[ViewportVRSUpdateMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ViewportVRSUpdateMode] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[ViewportVRSUpdateMode]]

    extension (self: ViewportVRSUpdateMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Disabled"
        case 1L => "Once"
        case 2L => "Always"
        case 3L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.SkyMode`. */
  opaque type SkyMode <: Long = Long

  object SkyMode {
    final val Automatic: SkyMode = 0L.asInstanceOf[SkyMode]
    final val Quality: SkyMode = 1L.asInstanceOf[SkyMode]
    final val Incremental: SkyMode = 2L.asInstanceOf[SkyMode]
    final val Realtime: SkyMode = 3L.asInstanceOf[SkyMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): SkyMode = value.asInstanceOf[SkyMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[SkyMode] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[SkyMode]]

    extension (self: SkyMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Automatic"
        case 1L => "Quality"
        case 2L => "Incremental"
        case 3L => "Realtime"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.CompositorEffectFlags`. */
  opaque type CompositorEffectFlags <: Long = Long

  object CompositorEffectFlags {
    final val AccessResolvedColor: CompositorEffectFlags = 1L.asInstanceOf[CompositorEffectFlags]
    final val AccessResolvedDepth: CompositorEffectFlags = 2L.asInstanceOf[CompositorEffectFlags]
    final val NeedsMotionVectors: CompositorEffectFlags = 4L.asInstanceOf[CompositorEffectFlags]
    final val NeedsRoughness: CompositorEffectFlags = 8L.asInstanceOf[CompositorEffectFlags]
    final val NeedsSeparateSpecular: CompositorEffectFlags = 16L.asInstanceOf[CompositorEffectFlags]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): CompositorEffectFlags = value.asInstanceOf[CompositorEffectFlags]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[CompositorEffectFlags] = scala.IArray[Long](1L, 2L, 4L, 8L, 16L).asInstanceOf[scala.IArray[CompositorEffectFlags]]

    extension (self: CompositorEffectFlags)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 1L => "AccessResolvedColor"
        case 2L => "AccessResolvedDepth"
        case 4L => "NeedsMotionVectors"
        case 8L => "NeedsRoughness"
        case 16L => "NeedsSeparateSpecular"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.CompositorEffectCallbackType`. */
  opaque type CompositorEffectCallbackType <: Long = Long

  object CompositorEffectCallbackType {
    final val PreOpaque: CompositorEffectCallbackType = 0L.asInstanceOf[CompositorEffectCallbackType]
    final val PostOpaque: CompositorEffectCallbackType = 1L.asInstanceOf[CompositorEffectCallbackType]
    final val PostSky: CompositorEffectCallbackType = 2L.asInstanceOf[CompositorEffectCallbackType]
    final val PreTransparent: CompositorEffectCallbackType = 3L.asInstanceOf[CompositorEffectCallbackType]
    final val PostTransparent: CompositorEffectCallbackType = 4L.asInstanceOf[CompositorEffectCallbackType]
    final val Any: CompositorEffectCallbackType = -1L.asInstanceOf[CompositorEffectCallbackType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): CompositorEffectCallbackType = value.asInstanceOf[CompositorEffectCallbackType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[CompositorEffectCallbackType] = scala.IArray[Long](-1L, 0L, 1L, 2L, 3L, 4L).asInstanceOf[scala.IArray[CompositorEffectCallbackType]]

    extension (self: CompositorEffectCallbackType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case -1L => "Any"
        case 0L => "PreOpaque"
        case 1L => "PostOpaque"
        case 2L => "PostSky"
        case 3L => "PreTransparent"
        case 4L => "PostTransparent"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.EnvironmentBG`. */
  opaque type EnvironmentBG <: Long = Long

  object EnvironmentBG {
    final val ClearColor: EnvironmentBG = 0L.asInstanceOf[EnvironmentBG]
    final val Color: EnvironmentBG = 1L.asInstanceOf[EnvironmentBG]
    final val Sky: EnvironmentBG = 2L.asInstanceOf[EnvironmentBG]
    final val Canvas: EnvironmentBG = 3L.asInstanceOf[EnvironmentBG]
    final val Keep: EnvironmentBG = 4L.asInstanceOf[EnvironmentBG]
    final val CameraFeed: EnvironmentBG = 5L.asInstanceOf[EnvironmentBG]
    final val Max: EnvironmentBG = 6L.asInstanceOf[EnvironmentBG]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): EnvironmentBG = value.asInstanceOf[EnvironmentBG]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[EnvironmentBG] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L).asInstanceOf[scala.IArray[EnvironmentBG]]

    extension (self: EnvironmentBG)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "ClearColor"
        case 1L => "Color"
        case 2L => "Sky"
        case 3L => "Canvas"
        case 4L => "Keep"
        case 5L => "CameraFeed"
        case 6L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.EnvironmentAmbientSource`. */
  opaque type EnvironmentAmbientSource <: Long = Long

  object EnvironmentAmbientSource {
    final val Bg: EnvironmentAmbientSource = 0L.asInstanceOf[EnvironmentAmbientSource]
    final val Disabled: EnvironmentAmbientSource = 1L.asInstanceOf[EnvironmentAmbientSource]
    final val Color: EnvironmentAmbientSource = 2L.asInstanceOf[EnvironmentAmbientSource]
    final val Sky: EnvironmentAmbientSource = 3L.asInstanceOf[EnvironmentAmbientSource]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): EnvironmentAmbientSource = value.asInstanceOf[EnvironmentAmbientSource]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[EnvironmentAmbientSource] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[EnvironmentAmbientSource]]

    extension (self: EnvironmentAmbientSource)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Bg"
        case 1L => "Disabled"
        case 2L => "Color"
        case 3L => "Sky"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.EnvironmentReflectionSource`. */
  opaque type EnvironmentReflectionSource <: Long = Long

  object EnvironmentReflectionSource {
    final val Bg: EnvironmentReflectionSource = 0L.asInstanceOf[EnvironmentReflectionSource]
    final val Disabled: EnvironmentReflectionSource = 1L.asInstanceOf[EnvironmentReflectionSource]
    final val Sky: EnvironmentReflectionSource = 2L.asInstanceOf[EnvironmentReflectionSource]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): EnvironmentReflectionSource = value.asInstanceOf[EnvironmentReflectionSource]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[EnvironmentReflectionSource] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[EnvironmentReflectionSource]]

    extension (self: EnvironmentReflectionSource)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Bg"
        case 1L => "Disabled"
        case 2L => "Sky"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.EnvironmentGlowBlendMode`. */
  opaque type EnvironmentGlowBlendMode <: Long = Long

  object EnvironmentGlowBlendMode {
    final val Additive: EnvironmentGlowBlendMode = 0L.asInstanceOf[EnvironmentGlowBlendMode]
    final val Screen: EnvironmentGlowBlendMode = 1L.asInstanceOf[EnvironmentGlowBlendMode]
    final val Softlight: EnvironmentGlowBlendMode = 2L.asInstanceOf[EnvironmentGlowBlendMode]
    final val Replace: EnvironmentGlowBlendMode = 3L.asInstanceOf[EnvironmentGlowBlendMode]
    final val Mix: EnvironmentGlowBlendMode = 4L.asInstanceOf[EnvironmentGlowBlendMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): EnvironmentGlowBlendMode = value.asInstanceOf[EnvironmentGlowBlendMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[EnvironmentGlowBlendMode] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L).asInstanceOf[scala.IArray[EnvironmentGlowBlendMode]]

    extension (self: EnvironmentGlowBlendMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Additive"
        case 1L => "Screen"
        case 2L => "Softlight"
        case 3L => "Replace"
        case 4L => "Mix"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.EnvironmentFogMode`. */
  opaque type EnvironmentFogMode <: Long = Long

  object EnvironmentFogMode {
    final val Exponential: EnvironmentFogMode = 0L.asInstanceOf[EnvironmentFogMode]
    final val Depth: EnvironmentFogMode = 1L.asInstanceOf[EnvironmentFogMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): EnvironmentFogMode = value.asInstanceOf[EnvironmentFogMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[EnvironmentFogMode] = scala.IArray[Long](0L, 1L).asInstanceOf[scala.IArray[EnvironmentFogMode]]

    extension (self: EnvironmentFogMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Exponential"
        case 1L => "Depth"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.EnvironmentToneMapper`. */
  opaque type EnvironmentToneMapper <: Long = Long

  object EnvironmentToneMapper {
    final val Linear: EnvironmentToneMapper = 0L.asInstanceOf[EnvironmentToneMapper]
    final val Reinhard: EnvironmentToneMapper = 1L.asInstanceOf[EnvironmentToneMapper]
    final val Filmic: EnvironmentToneMapper = 2L.asInstanceOf[EnvironmentToneMapper]
    final val Aces: EnvironmentToneMapper = 3L.asInstanceOf[EnvironmentToneMapper]
    final val Agx: EnvironmentToneMapper = 4L.asInstanceOf[EnvironmentToneMapper]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): EnvironmentToneMapper = value.asInstanceOf[EnvironmentToneMapper]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[EnvironmentToneMapper] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L).asInstanceOf[scala.IArray[EnvironmentToneMapper]]

    extension (self: EnvironmentToneMapper)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Linear"
        case 1L => "Reinhard"
        case 2L => "Filmic"
        case 3L => "Aces"
        case 4L => "Agx"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.EnvironmentSSRRoughnessQuality`. */
  opaque type EnvironmentSSRRoughnessQuality <: Long = Long

  object EnvironmentSSRRoughnessQuality {
    final val Disabled: EnvironmentSSRRoughnessQuality = 0L.asInstanceOf[EnvironmentSSRRoughnessQuality]
    final val Low: EnvironmentSSRRoughnessQuality = 1L.asInstanceOf[EnvironmentSSRRoughnessQuality]
    final val Medium: EnvironmentSSRRoughnessQuality = 2L.asInstanceOf[EnvironmentSSRRoughnessQuality]
    final val High: EnvironmentSSRRoughnessQuality = 3L.asInstanceOf[EnvironmentSSRRoughnessQuality]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): EnvironmentSSRRoughnessQuality = value.asInstanceOf[EnvironmentSSRRoughnessQuality]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[EnvironmentSSRRoughnessQuality] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[EnvironmentSSRRoughnessQuality]]

    extension (self: EnvironmentSSRRoughnessQuality)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Disabled"
        case 1L => "Low"
        case 2L => "Medium"
        case 3L => "High"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.EnvironmentSSAOQuality`. */
  opaque type EnvironmentSSAOQuality <: Long = Long

  object EnvironmentSSAOQuality {
    final val VeryLow: EnvironmentSSAOQuality = 0L.asInstanceOf[EnvironmentSSAOQuality]
    final val Low: EnvironmentSSAOQuality = 1L.asInstanceOf[EnvironmentSSAOQuality]
    final val Medium: EnvironmentSSAOQuality = 2L.asInstanceOf[EnvironmentSSAOQuality]
    final val High: EnvironmentSSAOQuality = 3L.asInstanceOf[EnvironmentSSAOQuality]
    final val Ultra: EnvironmentSSAOQuality = 4L.asInstanceOf[EnvironmentSSAOQuality]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): EnvironmentSSAOQuality = value.asInstanceOf[EnvironmentSSAOQuality]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[EnvironmentSSAOQuality] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L).asInstanceOf[scala.IArray[EnvironmentSSAOQuality]]

    extension (self: EnvironmentSSAOQuality)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "VeryLow"
        case 1L => "Low"
        case 2L => "Medium"
        case 3L => "High"
        case 4L => "Ultra"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.EnvironmentSSILQuality`. */
  opaque type EnvironmentSSILQuality <: Long = Long

  object EnvironmentSSILQuality {
    final val VeryLow: EnvironmentSSILQuality = 0L.asInstanceOf[EnvironmentSSILQuality]
    final val Low: EnvironmentSSILQuality = 1L.asInstanceOf[EnvironmentSSILQuality]
    final val Medium: EnvironmentSSILQuality = 2L.asInstanceOf[EnvironmentSSILQuality]
    final val High: EnvironmentSSILQuality = 3L.asInstanceOf[EnvironmentSSILQuality]
    final val Ultra: EnvironmentSSILQuality = 4L.asInstanceOf[EnvironmentSSILQuality]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): EnvironmentSSILQuality = value.asInstanceOf[EnvironmentSSILQuality]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[EnvironmentSSILQuality] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L).asInstanceOf[scala.IArray[EnvironmentSSILQuality]]

    extension (self: EnvironmentSSILQuality)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "VeryLow"
        case 1L => "Low"
        case 2L => "Medium"
        case 3L => "High"
        case 4L => "Ultra"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.EnvironmentSDFGIYScale`. */
  opaque type EnvironmentSDFGIYScale <: Long = Long

  object EnvironmentSDFGIYScale {
    final val Scale50Percent: EnvironmentSDFGIYScale = 0L.asInstanceOf[EnvironmentSDFGIYScale]
    final val Scale75Percent: EnvironmentSDFGIYScale = 1L.asInstanceOf[EnvironmentSDFGIYScale]
    final val Scale100Percent: EnvironmentSDFGIYScale = 2L.asInstanceOf[EnvironmentSDFGIYScale]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): EnvironmentSDFGIYScale = value.asInstanceOf[EnvironmentSDFGIYScale]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[EnvironmentSDFGIYScale] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[EnvironmentSDFGIYScale]]

    extension (self: EnvironmentSDFGIYScale)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Scale50Percent"
        case 1L => "Scale75Percent"
        case 2L => "Scale100Percent"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.EnvironmentSDFGIRayCount`. */
  opaque type EnvironmentSDFGIRayCount <: Long = Long

  object EnvironmentSDFGIRayCount {
    final val Count4: EnvironmentSDFGIRayCount = 0L.asInstanceOf[EnvironmentSDFGIRayCount]
    final val Count8: EnvironmentSDFGIRayCount = 1L.asInstanceOf[EnvironmentSDFGIRayCount]
    final val Count16: EnvironmentSDFGIRayCount = 2L.asInstanceOf[EnvironmentSDFGIRayCount]
    final val Count32: EnvironmentSDFGIRayCount = 3L.asInstanceOf[EnvironmentSDFGIRayCount]
    final val Count64: EnvironmentSDFGIRayCount = 4L.asInstanceOf[EnvironmentSDFGIRayCount]
    final val Count96: EnvironmentSDFGIRayCount = 5L.asInstanceOf[EnvironmentSDFGIRayCount]
    final val Count128: EnvironmentSDFGIRayCount = 6L.asInstanceOf[EnvironmentSDFGIRayCount]
    final val Max: EnvironmentSDFGIRayCount = 7L.asInstanceOf[EnvironmentSDFGIRayCount]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): EnvironmentSDFGIRayCount = value.asInstanceOf[EnvironmentSDFGIRayCount]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[EnvironmentSDFGIRayCount] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L).asInstanceOf[scala.IArray[EnvironmentSDFGIRayCount]]

    extension (self: EnvironmentSDFGIRayCount)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Count4"
        case 1L => "Count8"
        case 2L => "Count16"
        case 3L => "Count32"
        case 4L => "Count64"
        case 5L => "Count96"
        case 6L => "Count128"
        case 7L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.EnvironmentSDFGIFramesToConverge`. */
  opaque type EnvironmentSDFGIFramesToConverge <: Long = Long

  object EnvironmentSDFGIFramesToConverge {
    final val In5Frames: EnvironmentSDFGIFramesToConverge = 0L.asInstanceOf[EnvironmentSDFGIFramesToConverge]
    final val In10Frames: EnvironmentSDFGIFramesToConverge = 1L.asInstanceOf[EnvironmentSDFGIFramesToConverge]
    final val In15Frames: EnvironmentSDFGIFramesToConverge = 2L.asInstanceOf[EnvironmentSDFGIFramesToConverge]
    final val In20Frames: EnvironmentSDFGIFramesToConverge = 3L.asInstanceOf[EnvironmentSDFGIFramesToConverge]
    final val In25Frames: EnvironmentSDFGIFramesToConverge = 4L.asInstanceOf[EnvironmentSDFGIFramesToConverge]
    final val In30Frames: EnvironmentSDFGIFramesToConverge = 5L.asInstanceOf[EnvironmentSDFGIFramesToConverge]
    final val Max: EnvironmentSDFGIFramesToConverge = 6L.asInstanceOf[EnvironmentSDFGIFramesToConverge]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): EnvironmentSDFGIFramesToConverge = value.asInstanceOf[EnvironmentSDFGIFramesToConverge]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[EnvironmentSDFGIFramesToConverge] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L).asInstanceOf[scala.IArray[EnvironmentSDFGIFramesToConverge]]

    extension (self: EnvironmentSDFGIFramesToConverge)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "In5Frames"
        case 1L => "In10Frames"
        case 2L => "In15Frames"
        case 3L => "In20Frames"
        case 4L => "In25Frames"
        case 5L => "In30Frames"
        case 6L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.EnvironmentSDFGIFramesToUpdateLight`. */
  opaque type EnvironmentSDFGIFramesToUpdateLight <: Long = Long

  object EnvironmentSDFGIFramesToUpdateLight {
    final val In1Frame: EnvironmentSDFGIFramesToUpdateLight = 0L.asInstanceOf[EnvironmentSDFGIFramesToUpdateLight]
    final val In2Frames: EnvironmentSDFGIFramesToUpdateLight = 1L.asInstanceOf[EnvironmentSDFGIFramesToUpdateLight]
    final val In4Frames: EnvironmentSDFGIFramesToUpdateLight = 2L.asInstanceOf[EnvironmentSDFGIFramesToUpdateLight]
    final val In8Frames: EnvironmentSDFGIFramesToUpdateLight = 3L.asInstanceOf[EnvironmentSDFGIFramesToUpdateLight]
    final val In16Frames: EnvironmentSDFGIFramesToUpdateLight = 4L.asInstanceOf[EnvironmentSDFGIFramesToUpdateLight]
    final val Max: EnvironmentSDFGIFramesToUpdateLight = 5L.asInstanceOf[EnvironmentSDFGIFramesToUpdateLight]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): EnvironmentSDFGIFramesToUpdateLight = value.asInstanceOf[EnvironmentSDFGIFramesToUpdateLight]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[EnvironmentSDFGIFramesToUpdateLight] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L).asInstanceOf[scala.IArray[EnvironmentSDFGIFramesToUpdateLight]]

    extension (self: EnvironmentSDFGIFramesToUpdateLight)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "In1Frame"
        case 1L => "In2Frames"
        case 2L => "In4Frames"
        case 3L => "In8Frames"
        case 4L => "In16Frames"
        case 5L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.SubSurfaceScatteringQuality`. */
  opaque type SubSurfaceScatteringQuality <: Long = Long

  object SubSurfaceScatteringQuality {
    final val Disabled: SubSurfaceScatteringQuality = 0L.asInstanceOf[SubSurfaceScatteringQuality]
    final val Low: SubSurfaceScatteringQuality = 1L.asInstanceOf[SubSurfaceScatteringQuality]
    final val Medium: SubSurfaceScatteringQuality = 2L.asInstanceOf[SubSurfaceScatteringQuality]
    final val High: SubSurfaceScatteringQuality = 3L.asInstanceOf[SubSurfaceScatteringQuality]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): SubSurfaceScatteringQuality = value.asInstanceOf[SubSurfaceScatteringQuality]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[SubSurfaceScatteringQuality] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[SubSurfaceScatteringQuality]]

    extension (self: SubSurfaceScatteringQuality)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Disabled"
        case 1L => "Low"
        case 2L => "Medium"
        case 3L => "High"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.DOFBokehShape`. */
  opaque type DOFBokehShape <: Long = Long

  object DOFBokehShape {
    final val Box: DOFBokehShape = 0L.asInstanceOf[DOFBokehShape]
    final val Hexagon: DOFBokehShape = 1L.asInstanceOf[DOFBokehShape]
    final val Circle: DOFBokehShape = 2L.asInstanceOf[DOFBokehShape]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): DOFBokehShape = value.asInstanceOf[DOFBokehShape]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[DOFBokehShape] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[DOFBokehShape]]

    extension (self: DOFBokehShape)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Box"
        case 1L => "Hexagon"
        case 2L => "Circle"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.DOFBlurQuality`. */
  opaque type DOFBlurQuality <: Long = Long

  object DOFBlurQuality {
    final val VeryLow: DOFBlurQuality = 0L.asInstanceOf[DOFBlurQuality]
    final val Low: DOFBlurQuality = 1L.asInstanceOf[DOFBlurQuality]
    final val Medium: DOFBlurQuality = 2L.asInstanceOf[DOFBlurQuality]
    final val High: DOFBlurQuality = 3L.asInstanceOf[DOFBlurQuality]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): DOFBlurQuality = value.asInstanceOf[DOFBlurQuality]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[DOFBlurQuality] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[DOFBlurQuality]]

    extension (self: DOFBlurQuality)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "VeryLow"
        case 1L => "Low"
        case 2L => "Medium"
        case 3L => "High"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.InstanceType`. */
  opaque type InstanceType <: Long = Long

  object InstanceType {
    final val None: InstanceType = 0L.asInstanceOf[InstanceType]
    final val Mesh: InstanceType = 1L.asInstanceOf[InstanceType]
    final val Multimesh: InstanceType = 2L.asInstanceOf[InstanceType]
    final val Particles: InstanceType = 3L.asInstanceOf[InstanceType]
    final val ParticlesCollision: InstanceType = 4L.asInstanceOf[InstanceType]
    final val Light: InstanceType = 5L.asInstanceOf[InstanceType]
    final val ReflectionProbe: InstanceType = 6L.asInstanceOf[InstanceType]
    final val Decal: InstanceType = 7L.asInstanceOf[InstanceType]
    final val VoxelGi: InstanceType = 8L.asInstanceOf[InstanceType]
    final val Lightmap: InstanceType = 9L.asInstanceOf[InstanceType]
    final val Occluder: InstanceType = 10L.asInstanceOf[InstanceType]
    final val VisiblityNotifier: InstanceType = 11L.asInstanceOf[InstanceType]
    final val FogVolume: InstanceType = 12L.asInstanceOf[InstanceType]
    final val Max: InstanceType = 13L.asInstanceOf[InstanceType]
    final val GeometryMask: InstanceType = 14L.asInstanceOf[InstanceType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): InstanceType = value.asInstanceOf[InstanceType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[InstanceType] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 11L, 12L, 13L, 14L).asInstanceOf[scala.IArray[InstanceType]]

    extension (self: InstanceType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "None"
        case 1L => "Mesh"
        case 2L => "Multimesh"
        case 3L => "Particles"
        case 4L => "ParticlesCollision"
        case 5L => "Light"
        case 6L => "ReflectionProbe"
        case 7L => "Decal"
        case 8L => "VoxelGi"
        case 9L => "Lightmap"
        case 10L => "Occluder"
        case 11L => "VisiblityNotifier"
        case 12L => "FogVolume"
        case 13L => "Max"
        case 14L => "GeometryMask"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.InstanceFlags`. */
  opaque type InstanceFlags <: Long = Long

  object InstanceFlags {
    final val UseBakedLight: InstanceFlags = 0L.asInstanceOf[InstanceFlags]
    final val UseDynamicGi: InstanceFlags = 1L.asInstanceOf[InstanceFlags]
    final val DrawNextFrameIfVisible: InstanceFlags = 2L.asInstanceOf[InstanceFlags]
    final val IgnoreOcclusionCulling: InstanceFlags = 3L.asInstanceOf[InstanceFlags]
    final val Max: InstanceFlags = 4L.asInstanceOf[InstanceFlags]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): InstanceFlags = value.asInstanceOf[InstanceFlags]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[InstanceFlags] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L).asInstanceOf[scala.IArray[InstanceFlags]]

    extension (self: InstanceFlags)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "UseBakedLight"
        case 1L => "UseDynamicGi"
        case 2L => "DrawNextFrameIfVisible"
        case 3L => "IgnoreOcclusionCulling"
        case 4L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.ShadowCastingSetting`. */
  opaque type ShadowCastingSetting <: Long = Long

  object ShadowCastingSetting {
    final val Off: ShadowCastingSetting = 0L.asInstanceOf[ShadowCastingSetting]
    final val On: ShadowCastingSetting = 1L.asInstanceOf[ShadowCastingSetting]
    final val DoubleSided: ShadowCastingSetting = 2L.asInstanceOf[ShadowCastingSetting]
    final val ShadowsOnly: ShadowCastingSetting = 3L.asInstanceOf[ShadowCastingSetting]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ShadowCastingSetting = value.asInstanceOf[ShadowCastingSetting]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ShadowCastingSetting] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[ShadowCastingSetting]]

    extension (self: ShadowCastingSetting)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Off"
        case 1L => "On"
        case 2L => "DoubleSided"
        case 3L => "ShadowsOnly"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.VisibilityRangeFadeMode`. */
  opaque type VisibilityRangeFadeMode <: Long = Long

  object VisibilityRangeFadeMode {
    final val Disabled: VisibilityRangeFadeMode = 0L.asInstanceOf[VisibilityRangeFadeMode]
    final val Self: VisibilityRangeFadeMode = 1L.asInstanceOf[VisibilityRangeFadeMode]
    final val Dependencies: VisibilityRangeFadeMode = 2L.asInstanceOf[VisibilityRangeFadeMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): VisibilityRangeFadeMode = value.asInstanceOf[VisibilityRangeFadeMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[VisibilityRangeFadeMode] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[VisibilityRangeFadeMode]]

    extension (self: VisibilityRangeFadeMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Disabled"
        case 1L => "Self"
        case 2L => "Dependencies"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.BakeChannels`. */
  opaque type BakeChannels <: Long = Long

  object BakeChannels {
    final val AlbedoAlpha: BakeChannels = 0L.asInstanceOf[BakeChannels]
    final val Normal: BakeChannels = 1L.asInstanceOf[BakeChannels]
    final val Orm: BakeChannels = 2L.asInstanceOf[BakeChannels]
    final val Emission: BakeChannels = 3L.asInstanceOf[BakeChannels]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): BakeChannels = value.asInstanceOf[BakeChannels]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[BakeChannels] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[BakeChannels]]

    extension (self: BakeChannels)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "AlbedoAlpha"
        case 1L => "Normal"
        case 2L => "Orm"
        case 3L => "Emission"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.CanvasTextureChannel`. */
  opaque type CanvasTextureChannel <: Long = Long

  object CanvasTextureChannel {
    final val Diffuse: CanvasTextureChannel = 0L.asInstanceOf[CanvasTextureChannel]
    final val Normal: CanvasTextureChannel = 1L.asInstanceOf[CanvasTextureChannel]
    final val Specular: CanvasTextureChannel = 2L.asInstanceOf[CanvasTextureChannel]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): CanvasTextureChannel = value.asInstanceOf[CanvasTextureChannel]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[CanvasTextureChannel] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[CanvasTextureChannel]]

    extension (self: CanvasTextureChannel)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Diffuse"
        case 1L => "Normal"
        case 2L => "Specular"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.NinePatchAxisMode`. */
  opaque type NinePatchAxisMode <: Long = Long

  object NinePatchAxisMode {
    final val Stretch: NinePatchAxisMode = 0L.asInstanceOf[NinePatchAxisMode]
    final val Tile: NinePatchAxisMode = 1L.asInstanceOf[NinePatchAxisMode]
    final val TileFit: NinePatchAxisMode = 2L.asInstanceOf[NinePatchAxisMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): NinePatchAxisMode = value.asInstanceOf[NinePatchAxisMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[NinePatchAxisMode] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[NinePatchAxisMode]]

    extension (self: NinePatchAxisMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Stretch"
        case 1L => "Tile"
        case 2L => "TileFit"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.CanvasItemTextureFilter`. */
  opaque type CanvasItemTextureFilter <: Long = Long

  object CanvasItemTextureFilter {
    final val Default: CanvasItemTextureFilter = 0L.asInstanceOf[CanvasItemTextureFilter]
    final val Nearest: CanvasItemTextureFilter = 1L.asInstanceOf[CanvasItemTextureFilter]
    final val Linear: CanvasItemTextureFilter = 2L.asInstanceOf[CanvasItemTextureFilter]
    final val NearestWithMipmaps: CanvasItemTextureFilter = 3L.asInstanceOf[CanvasItemTextureFilter]
    final val LinearWithMipmaps: CanvasItemTextureFilter = 4L.asInstanceOf[CanvasItemTextureFilter]
    final val NearestWithMipmapsAnisotropic: CanvasItemTextureFilter = 5L.asInstanceOf[CanvasItemTextureFilter]
    final val LinearWithMipmapsAnisotropic: CanvasItemTextureFilter = 6L.asInstanceOf[CanvasItemTextureFilter]
    final val Max: CanvasItemTextureFilter = 7L.asInstanceOf[CanvasItemTextureFilter]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): CanvasItemTextureFilter = value.asInstanceOf[CanvasItemTextureFilter]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[CanvasItemTextureFilter] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L).asInstanceOf[scala.IArray[CanvasItemTextureFilter]]

    extension (self: CanvasItemTextureFilter)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Default"
        case 1L => "Nearest"
        case 2L => "Linear"
        case 3L => "NearestWithMipmaps"
        case 4L => "LinearWithMipmaps"
        case 5L => "NearestWithMipmapsAnisotropic"
        case 6L => "LinearWithMipmapsAnisotropic"
        case 7L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.CanvasItemTextureRepeat`. */
  opaque type CanvasItemTextureRepeat <: Long = Long

  object CanvasItemTextureRepeat {
    final val Default: CanvasItemTextureRepeat = 0L.asInstanceOf[CanvasItemTextureRepeat]
    final val Disabled: CanvasItemTextureRepeat = 1L.asInstanceOf[CanvasItemTextureRepeat]
    final val Enabled: CanvasItemTextureRepeat = 2L.asInstanceOf[CanvasItemTextureRepeat]
    final val Mirror: CanvasItemTextureRepeat = 3L.asInstanceOf[CanvasItemTextureRepeat]
    final val Max: CanvasItemTextureRepeat = 4L.asInstanceOf[CanvasItemTextureRepeat]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): CanvasItemTextureRepeat = value.asInstanceOf[CanvasItemTextureRepeat]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[CanvasItemTextureRepeat] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L).asInstanceOf[scala.IArray[CanvasItemTextureRepeat]]

    extension (self: CanvasItemTextureRepeat)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Default"
        case 1L => "Disabled"
        case 2L => "Enabled"
        case 3L => "Mirror"
        case 4L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.CanvasGroupMode`. */
  opaque type CanvasGroupMode <: Long = Long

  object CanvasGroupMode {
    final val Disabled: CanvasGroupMode = 0L.asInstanceOf[CanvasGroupMode]
    final val ClipOnly: CanvasGroupMode = 1L.asInstanceOf[CanvasGroupMode]
    final val ClipAndDraw: CanvasGroupMode = 2L.asInstanceOf[CanvasGroupMode]
    final val Transparent: CanvasGroupMode = 3L.asInstanceOf[CanvasGroupMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): CanvasGroupMode = value.asInstanceOf[CanvasGroupMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[CanvasGroupMode] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[CanvasGroupMode]]

    extension (self: CanvasGroupMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Disabled"
        case 1L => "ClipOnly"
        case 2L => "ClipAndDraw"
        case 3L => "Transparent"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.CanvasLightMode`. */
  opaque type CanvasLightMode <: Long = Long

  object CanvasLightMode {
    final val Point: CanvasLightMode = 0L.asInstanceOf[CanvasLightMode]
    final val Directional: CanvasLightMode = 1L.asInstanceOf[CanvasLightMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): CanvasLightMode = value.asInstanceOf[CanvasLightMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[CanvasLightMode] = scala.IArray[Long](0L, 1L).asInstanceOf[scala.IArray[CanvasLightMode]]

    extension (self: CanvasLightMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Point"
        case 1L => "Directional"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.CanvasLightBlendMode`. */
  opaque type CanvasLightBlendMode <: Long = Long

  object CanvasLightBlendMode {
    final val Add: CanvasLightBlendMode = 0L.asInstanceOf[CanvasLightBlendMode]
    final val Sub: CanvasLightBlendMode = 1L.asInstanceOf[CanvasLightBlendMode]
    final val Mix: CanvasLightBlendMode = 2L.asInstanceOf[CanvasLightBlendMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): CanvasLightBlendMode = value.asInstanceOf[CanvasLightBlendMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[CanvasLightBlendMode] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[CanvasLightBlendMode]]

    extension (self: CanvasLightBlendMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Add"
        case 1L => "Sub"
        case 2L => "Mix"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.CanvasLightShadowFilter`. */
  opaque type CanvasLightShadowFilter <: Long = Long

  object CanvasLightShadowFilter {
    final val None: CanvasLightShadowFilter = 0L.asInstanceOf[CanvasLightShadowFilter]
    final val Pcf5: CanvasLightShadowFilter = 1L.asInstanceOf[CanvasLightShadowFilter]
    final val Pcf13: CanvasLightShadowFilter = 2L.asInstanceOf[CanvasLightShadowFilter]
    final val Max: CanvasLightShadowFilter = 3L.asInstanceOf[CanvasLightShadowFilter]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): CanvasLightShadowFilter = value.asInstanceOf[CanvasLightShadowFilter]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[CanvasLightShadowFilter] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[CanvasLightShadowFilter]]

    extension (self: CanvasLightShadowFilter)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "None"
        case 1L => "Pcf5"
        case 2L => "Pcf13"
        case 3L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.CanvasOccluderPolygonCullMode`. */
  opaque type CanvasOccluderPolygonCullMode <: Long = Long

  object CanvasOccluderPolygonCullMode {
    final val Disabled: CanvasOccluderPolygonCullMode = 0L.asInstanceOf[CanvasOccluderPolygonCullMode]
    final val Clockwise: CanvasOccluderPolygonCullMode = 1L.asInstanceOf[CanvasOccluderPolygonCullMode]
    final val CounterClockwise: CanvasOccluderPolygonCullMode = 2L.asInstanceOf[CanvasOccluderPolygonCullMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): CanvasOccluderPolygonCullMode = value.asInstanceOf[CanvasOccluderPolygonCullMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[CanvasOccluderPolygonCullMode] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[CanvasOccluderPolygonCullMode]]

    extension (self: CanvasOccluderPolygonCullMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Disabled"
        case 1L => "Clockwise"
        case 2L => "CounterClockwise"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.GlobalShaderParameterType`. */
  opaque type GlobalShaderParameterType <: Long = Long

  object GlobalShaderParameterType {
    final val Bool: GlobalShaderParameterType = 0L.asInstanceOf[GlobalShaderParameterType]
    final val Bvec2: GlobalShaderParameterType = 1L.asInstanceOf[GlobalShaderParameterType]
    final val Bvec3: GlobalShaderParameterType = 2L.asInstanceOf[GlobalShaderParameterType]
    final val Bvec4: GlobalShaderParameterType = 3L.asInstanceOf[GlobalShaderParameterType]
    final val Int: GlobalShaderParameterType = 4L.asInstanceOf[GlobalShaderParameterType]
    final val Ivec2: GlobalShaderParameterType = 5L.asInstanceOf[GlobalShaderParameterType]
    final val Ivec3: GlobalShaderParameterType = 6L.asInstanceOf[GlobalShaderParameterType]
    final val Ivec4: GlobalShaderParameterType = 7L.asInstanceOf[GlobalShaderParameterType]
    final val Rect2i: GlobalShaderParameterType = 8L.asInstanceOf[GlobalShaderParameterType]
    final val Uint: GlobalShaderParameterType = 9L.asInstanceOf[GlobalShaderParameterType]
    final val Uvec2: GlobalShaderParameterType = 10L.asInstanceOf[GlobalShaderParameterType]
    final val Uvec3: GlobalShaderParameterType = 11L.asInstanceOf[GlobalShaderParameterType]
    final val Uvec4: GlobalShaderParameterType = 12L.asInstanceOf[GlobalShaderParameterType]
    final val Float: GlobalShaderParameterType = 13L.asInstanceOf[GlobalShaderParameterType]
    final val Vec2: GlobalShaderParameterType = 14L.asInstanceOf[GlobalShaderParameterType]
    final val Vec3: GlobalShaderParameterType = 15L.asInstanceOf[GlobalShaderParameterType]
    final val Vec4: GlobalShaderParameterType = 16L.asInstanceOf[GlobalShaderParameterType]
    final val Color: GlobalShaderParameterType = 17L.asInstanceOf[GlobalShaderParameterType]
    final val Rect2: GlobalShaderParameterType = 18L.asInstanceOf[GlobalShaderParameterType]
    final val Mat2: GlobalShaderParameterType = 19L.asInstanceOf[GlobalShaderParameterType]
    final val Mat3: GlobalShaderParameterType = 20L.asInstanceOf[GlobalShaderParameterType]
    final val Mat4: GlobalShaderParameterType = 21L.asInstanceOf[GlobalShaderParameterType]
    final val Transform2d: GlobalShaderParameterType = 22L.asInstanceOf[GlobalShaderParameterType]
    final val Transform: GlobalShaderParameterType = 23L.asInstanceOf[GlobalShaderParameterType]
    final val Sampler2d: GlobalShaderParameterType = 24L.asInstanceOf[GlobalShaderParameterType]
    final val Sampler2darray: GlobalShaderParameterType = 25L.asInstanceOf[GlobalShaderParameterType]
    final val Sampler3d: GlobalShaderParameterType = 26L.asInstanceOf[GlobalShaderParameterType]
    final val Samplercube: GlobalShaderParameterType = 27L.asInstanceOf[GlobalShaderParameterType]
    final val Samplerext: GlobalShaderParameterType = 28L.asInstanceOf[GlobalShaderParameterType]
    final val Max: GlobalShaderParameterType = 29L.asInstanceOf[GlobalShaderParameterType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): GlobalShaderParameterType = value.asInstanceOf[GlobalShaderParameterType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[GlobalShaderParameterType] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 11L, 12L, 13L, 14L, 15L, 16L, 17L, 18L, 19L, 20L, 21L, 22L, 23L, 24L, 25L, 26L, 27L, 28L, 29L).asInstanceOf[scala.IArray[GlobalShaderParameterType]]

    extension (self: GlobalShaderParameterType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Bool"
        case 1L => "Bvec2"
        case 2L => "Bvec3"
        case 3L => "Bvec4"
        case 4L => "Int"
        case 5L => "Ivec2"
        case 6L => "Ivec3"
        case 7L => "Ivec4"
        case 8L => "Rect2i"
        case 9L => "Uint"
        case 10L => "Uvec2"
        case 11L => "Uvec3"
        case 12L => "Uvec4"
        case 13L => "Float"
        case 14L => "Vec2"
        case 15L => "Vec3"
        case 16L => "Vec4"
        case 17L => "Color"
        case 18L => "Rect2"
        case 19L => "Mat2"
        case 20L => "Mat3"
        case 21L => "Mat4"
        case 22L => "Transform2d"
        case 23L => "Transform"
        case 24L => "Sampler2d"
        case 25L => "Sampler2darray"
        case 26L => "Sampler3d"
        case 27L => "Samplercube"
        case 28L => "Samplerext"
        case 29L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.RenderingInfo`. */
  opaque type RenderingInfo <: Long = Long

  object RenderingInfo {
    final val TotalObjectsInFrame: RenderingInfo = 0L.asInstanceOf[RenderingInfo]
    final val TotalPrimitivesInFrame: RenderingInfo = 1L.asInstanceOf[RenderingInfo]
    final val TotalDrawCallsInFrame: RenderingInfo = 2L.asInstanceOf[RenderingInfo]
    final val TextureMemUsed: RenderingInfo = 3L.asInstanceOf[RenderingInfo]
    final val BufferMemUsed: RenderingInfo = 4L.asInstanceOf[RenderingInfo]
    final val VideoMemUsed: RenderingInfo = 5L.asInstanceOf[RenderingInfo]
    final val PipelineCompilationsCanvas: RenderingInfo = 6L.asInstanceOf[RenderingInfo]
    final val PipelineCompilationsMesh: RenderingInfo = 7L.asInstanceOf[RenderingInfo]
    final val PipelineCompilationsSurface: RenderingInfo = 8L.asInstanceOf[RenderingInfo]
    final val PipelineCompilationsDraw: RenderingInfo = 9L.asInstanceOf[RenderingInfo]
    final val PipelineCompilationsSpecialization: RenderingInfo = 10L.asInstanceOf[RenderingInfo]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): RenderingInfo = value.asInstanceOf[RenderingInfo]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[RenderingInfo] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L).asInstanceOf[scala.IArray[RenderingInfo]]

    extension (self: RenderingInfo)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "TotalObjectsInFrame"
        case 1L => "TotalPrimitivesInFrame"
        case 2L => "TotalDrawCallsInFrame"
        case 3L => "TextureMemUsed"
        case 4L => "BufferMemUsed"
        case 5L => "VideoMemUsed"
        case 6L => "PipelineCompilationsCanvas"
        case 7L => "PipelineCompilationsMesh"
        case 8L => "PipelineCompilationsSurface"
        case 9L => "PipelineCompilationsDraw"
        case 10L => "PipelineCompilationsSpecialization"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.PipelineSource`. */
  opaque type PipelineSource <: Long = Long

  object PipelineSource {
    final val Canvas: PipelineSource = 0L.asInstanceOf[PipelineSource]
    final val Mesh: PipelineSource = 1L.asInstanceOf[PipelineSource]
    final val Surface: PipelineSource = 2L.asInstanceOf[PipelineSource]
    final val Draw: PipelineSource = 3L.asInstanceOf[PipelineSource]
    final val Specialization: PipelineSource = 4L.asInstanceOf[PipelineSource]
    final val Max: PipelineSource = 5L.asInstanceOf[PipelineSource]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): PipelineSource = value.asInstanceOf[PipelineSource]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[PipelineSource] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L).asInstanceOf[scala.IArray[PipelineSource]]

    extension (self: PipelineSource)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Canvas"
        case 1L => "Mesh"
        case 2L => "Surface"
        case 3L => "Draw"
        case 4L => "Specialization"
        case 5L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.SplashStretchMode`. */
  opaque type SplashStretchMode <: Long = Long

  object SplashStretchMode {
    final val Disabled: SplashStretchMode = 0L.asInstanceOf[SplashStretchMode]
    final val Keep: SplashStretchMode = 1L.asInstanceOf[SplashStretchMode]
    final val KeepWidth: SplashStretchMode = 2L.asInstanceOf[SplashStretchMode]
    final val KeepHeight: SplashStretchMode = 3L.asInstanceOf[SplashStretchMode]
    final val Cover: SplashStretchMode = 4L.asInstanceOf[SplashStretchMode]
    final val Ignore: SplashStretchMode = 5L.asInstanceOf[SplashStretchMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): SplashStretchMode = value.asInstanceOf[SplashStretchMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[SplashStretchMode] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L).asInstanceOf[scala.IArray[SplashStretchMode]]

    extension (self: SplashStretchMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Disabled"
        case 1L => "Keep"
        case 2L => "KeepWidth"
        case 3L => "KeepHeight"
        case 4L => "Cover"
        case 5L => "Ignore"
        case other => other.toString
      }
  }

  /** Godot enum `RenderingServer.Features`. */
  opaque type Features <: Long = Long

  object Features {
    final val Shaders: Features = 0L.asInstanceOf[Features]
    final val Multithreaded: Features = 1L.asInstanceOf[Features]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Features = value.asInstanceOf[Features]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Features] = scala.IArray[Long](0L, 1L).asInstanceOf[scala.IArray[Features]]

    extension (self: Features)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Shaders"
        case 1L => "Multithreaded"
        case other => other.toString
      }
  }
}
