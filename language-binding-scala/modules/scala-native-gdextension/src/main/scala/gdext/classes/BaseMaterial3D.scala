package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `BaseMaterial3D`, extends `Material`. */
abstract class BaseMaterial3D extends Material {

  /** BaseMaterial3D.set_albedo */
  final def setAlbedo(albedo: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_albedo", 2920490490L), hostObject.objectPtr, albedo)

  /** BaseMaterial3D.get_albedo */
  final def getAlbedo(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("BaseMaterial3D", "get_albedo", 3444240500L), hostObject.objectPtr)

  /** BaseMaterial3D.set_transparency */
  final def setTransparency(transparency: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_transparency", 3435651667L), hostObject.objectPtr, transparency)

  /** BaseMaterial3D.get_transparency */
  final def getTransparency(): Long =
    Ptrcall.call0[Long](MethodBind.get("BaseMaterial3D", "get_transparency", 990903061L), hostObject.objectPtr)

  /** BaseMaterial3D.set_alpha_antialiasing */
  final def setAlphaAntialiasing(alpha_aa: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_alpha_antialiasing", 3212649852L), hostObject.objectPtr, alpha_aa)

  /** BaseMaterial3D.get_alpha_antialiasing */
  final def getAlphaAntialiasing(): Long =
    Ptrcall.call0[Long](MethodBind.get("BaseMaterial3D", "get_alpha_antialiasing", 2889939400L), hostObject.objectPtr)

  /** BaseMaterial3D.set_alpha_antialiasing_edge */
  final def setAlphaAntialiasingEdge(edge: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_alpha_antialiasing_edge", 373806689L), hostObject.objectPtr, edge)

  /** BaseMaterial3D.get_alpha_antialiasing_edge */
  final def getAlphaAntialiasingEdge(): Double =
    Ptrcall.call0[Double](MethodBind.get("BaseMaterial3D", "get_alpha_antialiasing_edge", 1740695150L), hostObject.objectPtr)

  /** BaseMaterial3D.set_shading_mode */
  final def setShadingMode(shading_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_shading_mode", 3368750322L), hostObject.objectPtr, shading_mode)

  /** BaseMaterial3D.get_shading_mode */
  final def getShadingMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("BaseMaterial3D", "get_shading_mode", 2132070559L), hostObject.objectPtr)

  /** BaseMaterial3D.set_specular */
  final def setSpecular(specular: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_specular", 373806689L), hostObject.objectPtr, specular)

  /** BaseMaterial3D.get_specular */
  final def getSpecular(): Double =
    Ptrcall.call0[Double](MethodBind.get("BaseMaterial3D", "get_specular", 1740695150L), hostObject.objectPtr)

  /** BaseMaterial3D.set_metallic */
  final def setMetallic(metallic: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_metallic", 373806689L), hostObject.objectPtr, metallic)

  /** BaseMaterial3D.get_metallic */
  final def getMetallic(): Double =
    Ptrcall.call0[Double](MethodBind.get("BaseMaterial3D", "get_metallic", 1740695150L), hostObject.objectPtr)

  /** BaseMaterial3D.set_roughness */
  final def setRoughness(roughness: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_roughness", 373806689L), hostObject.objectPtr, roughness)

  /** BaseMaterial3D.get_roughness */
  final def getRoughness(): Double =
    Ptrcall.call0[Double](MethodBind.get("BaseMaterial3D", "get_roughness", 1740695150L), hostObject.objectPtr)

  /** BaseMaterial3D.set_emission */
  final def setEmission(emission: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_emission", 2920490490L), hostObject.objectPtr, emission)

  /** BaseMaterial3D.get_emission */
  final def getEmission(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("BaseMaterial3D", "get_emission", 3444240500L), hostObject.objectPtr)

  /** BaseMaterial3D.set_emission_energy_multiplier */
  final def setEmissionEnergyMultiplier(emission_energy_multiplier: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_emission_energy_multiplier", 373806689L), hostObject.objectPtr, emission_energy_multiplier)

  /** BaseMaterial3D.get_emission_energy_multiplier */
  final def getEmissionEnergyMultiplier(): Double =
    Ptrcall.call0[Double](MethodBind.get("BaseMaterial3D", "get_emission_energy_multiplier", 1740695150L), hostObject.objectPtr)

  /** BaseMaterial3D.set_emission_intensity */
  final def setEmissionIntensity(emission_energy_multiplier: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_emission_intensity", 373806689L), hostObject.objectPtr, emission_energy_multiplier)

  /** BaseMaterial3D.get_emission_intensity */
  final def getEmissionIntensity(): Double =
    Ptrcall.call0[Double](MethodBind.get("BaseMaterial3D", "get_emission_intensity", 1740695150L), hostObject.objectPtr)

  /** BaseMaterial3D.set_normal_scale */
  final def setNormalScale(normal_scale: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_normal_scale", 373806689L), hostObject.objectPtr, normal_scale)

  /** BaseMaterial3D.get_normal_scale */
  final def getNormalScale(): Double =
    Ptrcall.call0[Double](MethodBind.get("BaseMaterial3D", "get_normal_scale", 1740695150L), hostObject.objectPtr)

  /** BaseMaterial3D.set_rim */
  final def setRim(rim: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_rim", 373806689L), hostObject.objectPtr, rim)

  /** BaseMaterial3D.get_rim */
  final def getRim(): Double =
    Ptrcall.call0[Double](MethodBind.get("BaseMaterial3D", "get_rim", 1740695150L), hostObject.objectPtr)

  /** BaseMaterial3D.set_rim_tint */
  final def setRimTint(rim_tint: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_rim_tint", 373806689L), hostObject.objectPtr, rim_tint)

  /** BaseMaterial3D.get_rim_tint */
  final def getRimTint(): Double =
    Ptrcall.call0[Double](MethodBind.get("BaseMaterial3D", "get_rim_tint", 1740695150L), hostObject.objectPtr)

  /** BaseMaterial3D.set_clearcoat */
  final def setClearcoat(clearcoat: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_clearcoat", 373806689L), hostObject.objectPtr, clearcoat)

  /** BaseMaterial3D.get_clearcoat */
  final def getClearcoat(): Double =
    Ptrcall.call0[Double](MethodBind.get("BaseMaterial3D", "get_clearcoat", 1740695150L), hostObject.objectPtr)

  /** BaseMaterial3D.set_clearcoat_roughness */
  final def setClearcoatRoughness(clearcoat_roughness: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_clearcoat_roughness", 373806689L), hostObject.objectPtr, clearcoat_roughness)

  /** BaseMaterial3D.get_clearcoat_roughness */
  final def getClearcoatRoughness(): Double =
    Ptrcall.call0[Double](MethodBind.get("BaseMaterial3D", "get_clearcoat_roughness", 1740695150L), hostObject.objectPtr)

  /** BaseMaterial3D.set_anisotropy */
  final def setAnisotropy(anisotropy: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_anisotropy", 373806689L), hostObject.objectPtr, anisotropy)

  /** BaseMaterial3D.get_anisotropy */
  final def getAnisotropy(): Double =
    Ptrcall.call0[Double](MethodBind.get("BaseMaterial3D", "get_anisotropy", 1740695150L), hostObject.objectPtr)

  /** BaseMaterial3D.set_heightmap_scale */
  final def setHeightmapScale(heightmap_scale: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_heightmap_scale", 373806689L), hostObject.objectPtr, heightmap_scale)

  /** BaseMaterial3D.get_heightmap_scale */
  final def getHeightmapScale(): Double =
    Ptrcall.call0[Double](MethodBind.get("BaseMaterial3D", "get_heightmap_scale", 1740695150L), hostObject.objectPtr)

  /** BaseMaterial3D.set_subsurface_scattering_strength */
  final def setSubsurfaceScatteringStrength(strength: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_subsurface_scattering_strength", 373806689L), hostObject.objectPtr, strength)

  /** BaseMaterial3D.get_subsurface_scattering_strength */
  final def getSubsurfaceScatteringStrength(): Double =
    Ptrcall.call0[Double](MethodBind.get("BaseMaterial3D", "get_subsurface_scattering_strength", 1740695150L), hostObject.objectPtr)

  /** BaseMaterial3D.set_transmittance_color */
  final def setTransmittanceColor(color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_transmittance_color", 2920490490L), hostObject.objectPtr, color)

  /** BaseMaterial3D.get_transmittance_color */
  final def getTransmittanceColor(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("BaseMaterial3D", "get_transmittance_color", 3444240500L), hostObject.objectPtr)

  /** BaseMaterial3D.set_transmittance_depth */
  final def setTransmittanceDepth(depth: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_transmittance_depth", 373806689L), hostObject.objectPtr, depth)

  /** BaseMaterial3D.get_transmittance_depth */
  final def getTransmittanceDepth(): Double =
    Ptrcall.call0[Double](MethodBind.get("BaseMaterial3D", "get_transmittance_depth", 1740695150L), hostObject.objectPtr)

  /** BaseMaterial3D.set_transmittance_boost */
  final def setTransmittanceBoost(boost: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_transmittance_boost", 373806689L), hostObject.objectPtr, boost)

  /** BaseMaterial3D.get_transmittance_boost */
  final def getTransmittanceBoost(): Double =
    Ptrcall.call0[Double](MethodBind.get("BaseMaterial3D", "get_transmittance_boost", 1740695150L), hostObject.objectPtr)

  /** BaseMaterial3D.set_backlight */
  final def setBacklight(backlight: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_backlight", 2920490490L), hostObject.objectPtr, backlight)

  /** BaseMaterial3D.get_backlight */
  final def getBacklight(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("BaseMaterial3D", "get_backlight", 3444240500L), hostObject.objectPtr)

  /** BaseMaterial3D.set_refraction */
  final def setRefraction(refraction: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_refraction", 373806689L), hostObject.objectPtr, refraction)

  /** BaseMaterial3D.get_refraction */
  final def getRefraction(): Double =
    Ptrcall.call0[Double](MethodBind.get("BaseMaterial3D", "get_refraction", 1740695150L), hostObject.objectPtr)

  /** BaseMaterial3D.set_point_size */
  final def setPointSize(point_size: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_point_size", 373806689L), hostObject.objectPtr, point_size)

  /** BaseMaterial3D.get_point_size */
  final def getPointSize(): Double =
    Ptrcall.call0[Double](MethodBind.get("BaseMaterial3D", "get_point_size", 1740695150L), hostObject.objectPtr)

  /** BaseMaterial3D.set_detail_uv */
  final def setDetailUv(detail_uv: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_detail_uv", 456801921L), hostObject.objectPtr, detail_uv)

  /** BaseMaterial3D.get_detail_uv */
  final def getDetailUv(): Long =
    Ptrcall.call0[Long](MethodBind.get("BaseMaterial3D", "get_detail_uv", 2306920512L), hostObject.objectPtr)

  /** BaseMaterial3D.set_blend_mode */
  final def setBlendMode(blend_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_blend_mode", 2830186259L), hostObject.objectPtr, blend_mode)

  /** BaseMaterial3D.get_blend_mode */
  final def getBlendMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("BaseMaterial3D", "get_blend_mode", 4022690962L), hostObject.objectPtr)

  /** BaseMaterial3D.set_depth_draw_mode */
  final def setDepthDrawMode(depth_draw_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_depth_draw_mode", 1456584748L), hostObject.objectPtr, depth_draw_mode)

  /** BaseMaterial3D.get_depth_draw_mode */
  final def getDepthDrawMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("BaseMaterial3D", "get_depth_draw_mode", 2578197639L), hostObject.objectPtr)

  /** BaseMaterial3D.set_depth_test */
  final def setDepthTest(depth_test: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_depth_test", 3918692338L), hostObject.objectPtr, depth_test)

  /** BaseMaterial3D.get_depth_test */
  final def getDepthTest(): Long =
    Ptrcall.call0[Long](MethodBind.get("BaseMaterial3D", "get_depth_test", 3434785811L), hostObject.objectPtr)

  /** BaseMaterial3D.set_cull_mode */
  final def setCullMode(cull_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_cull_mode", 2338909218L), hostObject.objectPtr, cull_mode)

  /** BaseMaterial3D.get_cull_mode */
  final def getCullMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("BaseMaterial3D", "get_cull_mode", 1941499586L), hostObject.objectPtr)

  /** BaseMaterial3D.set_diffuse_mode */
  final def setDiffuseMode(diffuse_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_diffuse_mode", 1045299638L), hostObject.objectPtr, diffuse_mode)

  /** BaseMaterial3D.get_diffuse_mode */
  final def getDiffuseMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("BaseMaterial3D", "get_diffuse_mode", 3973617136L), hostObject.objectPtr)

  /** BaseMaterial3D.set_specular_mode */
  final def setSpecularMode(specular_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_specular_mode", 584737147L), hostObject.objectPtr, specular_mode)

  /** BaseMaterial3D.get_specular_mode */
  final def getSpecularMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("BaseMaterial3D", "get_specular_mode", 2569953298L), hostObject.objectPtr)

  /** BaseMaterial3D.set_flag */
  final def setFlag(flag: Long, enable: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("BaseMaterial3D", "set_flag", 3070159527L), hostObject.objectPtr, flag, enable)

  /** BaseMaterial3D.get_flag */
  final def getFlag(flag: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("BaseMaterial3D", "get_flag", 1286410065L), hostObject.objectPtr, flag)

  /** BaseMaterial3D.set_texture_filter */
  final def setTextureFilter(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_texture_filter", 22904437L), hostObject.objectPtr, mode)

  /** BaseMaterial3D.get_texture_filter */
  final def getTextureFilter(): Long =
    Ptrcall.call0[Long](MethodBind.get("BaseMaterial3D", "get_texture_filter", 3289213076L), hostObject.objectPtr)

  /** BaseMaterial3D.set_feature */
  final def setFeature(feature: Long, enable: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("BaseMaterial3D", "set_feature", 2819288693L), hostObject.objectPtr, feature, enable)

  /** BaseMaterial3D.get_feature */
  final def getFeature(feature: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("BaseMaterial3D", "get_feature", 1965241794L), hostObject.objectPtr, feature)

  /** BaseMaterial3D.set_texture */
  final def setTexture(param: Long, texture: Texture2D): Unit =
    Ptrcall.callVoid2(MethodBind.get("BaseMaterial3D", "set_texture", 464208135L), hostObject.objectPtr, param, texture.hostObject)

  /** BaseMaterial3D.get_texture */
  final def getTexture(param: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("BaseMaterial3D", "get_texture", 329605813L), hostObject.objectPtr, param)

  /** BaseMaterial3D.set_detail_blend_mode */
  final def setDetailBlendMode(detail_blend_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_detail_blend_mode", 2830186259L), hostObject.objectPtr, detail_blend_mode)

  /** BaseMaterial3D.get_detail_blend_mode */
  final def getDetailBlendMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("BaseMaterial3D", "get_detail_blend_mode", 4022690962L), hostObject.objectPtr)

  /** BaseMaterial3D.set_uv1_scale */
  final def setUv1Scale(scale: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_uv1_scale", 3460891852L), hostObject.objectPtr, scale)

  /** BaseMaterial3D.get_uv1_scale */
  final def getUv1Scale(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("BaseMaterial3D", "get_uv1_scale", 3360562783L), hostObject.objectPtr)

  /** BaseMaterial3D.set_uv1_offset */
  final def setUv1Offset(offset: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_uv1_offset", 3460891852L), hostObject.objectPtr, offset)

  /** BaseMaterial3D.get_uv1_offset */
  final def getUv1Offset(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("BaseMaterial3D", "get_uv1_offset", 3360562783L), hostObject.objectPtr)

  /** BaseMaterial3D.set_uv1_triplanar_blend_sharpness */
  final def setUv1TriplanarBlendSharpness(sharpness: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_uv1_triplanar_blend_sharpness", 373806689L), hostObject.objectPtr, sharpness)

  /** BaseMaterial3D.get_uv1_triplanar_blend_sharpness */
  final def getUv1TriplanarBlendSharpness(): Double =
    Ptrcall.call0[Double](MethodBind.get("BaseMaterial3D", "get_uv1_triplanar_blend_sharpness", 1740695150L), hostObject.objectPtr)

  /** BaseMaterial3D.set_uv2_scale */
  final def setUv2Scale(scale: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_uv2_scale", 3460891852L), hostObject.objectPtr, scale)

  /** BaseMaterial3D.get_uv2_scale */
  final def getUv2Scale(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("BaseMaterial3D", "get_uv2_scale", 3360562783L), hostObject.objectPtr)

  /** BaseMaterial3D.set_uv2_offset */
  final def setUv2Offset(offset: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_uv2_offset", 3460891852L), hostObject.objectPtr, offset)

  /** BaseMaterial3D.get_uv2_offset */
  final def getUv2Offset(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("BaseMaterial3D", "get_uv2_offset", 3360562783L), hostObject.objectPtr)

  /** BaseMaterial3D.set_uv2_triplanar_blend_sharpness */
  final def setUv2TriplanarBlendSharpness(sharpness: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_uv2_triplanar_blend_sharpness", 373806689L), hostObject.objectPtr, sharpness)

  /** BaseMaterial3D.get_uv2_triplanar_blend_sharpness */
  final def getUv2TriplanarBlendSharpness(): Double =
    Ptrcall.call0[Double](MethodBind.get("BaseMaterial3D", "get_uv2_triplanar_blend_sharpness", 1740695150L), hostObject.objectPtr)

  /** BaseMaterial3D.set_billboard_mode */
  final def setBillboardMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_billboard_mode", 4202036497L), hostObject.objectPtr, mode)

  /** BaseMaterial3D.get_billboard_mode */
  final def getBillboardMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("BaseMaterial3D", "get_billboard_mode", 1283840139L), hostObject.objectPtr)

  /** BaseMaterial3D.set_particles_anim_h_frames */
  final def setParticlesAnimHFrames(frames: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_particles_anim_h_frames", 1286410249L), hostObject.objectPtr, frames)

  /** BaseMaterial3D.get_particles_anim_h_frames */
  final def getParticlesAnimHFrames(): Long =
    Ptrcall.call0[Long](MethodBind.get("BaseMaterial3D", "get_particles_anim_h_frames", 3905245786L), hostObject.objectPtr)

  /** BaseMaterial3D.set_particles_anim_v_frames */
  final def setParticlesAnimVFrames(frames: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_particles_anim_v_frames", 1286410249L), hostObject.objectPtr, frames)

  /** BaseMaterial3D.get_particles_anim_v_frames */
  final def getParticlesAnimVFrames(): Long =
    Ptrcall.call0[Long](MethodBind.get("BaseMaterial3D", "get_particles_anim_v_frames", 3905245786L), hostObject.objectPtr)

  /** BaseMaterial3D.set_particles_anim_loop */
  final def setParticlesAnimLoop(loop: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_particles_anim_loop", 2586408642L), hostObject.objectPtr, loop)

  /** BaseMaterial3D.get_particles_anim_loop */
  final def getParticlesAnimLoop(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("BaseMaterial3D", "get_particles_anim_loop", 36873697L), hostObject.objectPtr)

  /** BaseMaterial3D.set_heightmap_deep_parallax */
  final def setHeightmapDeepParallax(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_heightmap_deep_parallax", 2586408642L), hostObject.objectPtr, enable)

  /** BaseMaterial3D.is_heightmap_deep_parallax_enabled */
  final def isHeightmapDeepParallaxEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("BaseMaterial3D", "is_heightmap_deep_parallax_enabled", 36873697L), hostObject.objectPtr)

  /** BaseMaterial3D.set_heightmap_deep_parallax_min_layers */
  final def setHeightmapDeepParallaxMinLayers(layer: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_heightmap_deep_parallax_min_layers", 1286410249L), hostObject.objectPtr, layer)

  /** BaseMaterial3D.get_heightmap_deep_parallax_min_layers */
  final def getHeightmapDeepParallaxMinLayers(): Long =
    Ptrcall.call0[Long](MethodBind.get("BaseMaterial3D", "get_heightmap_deep_parallax_min_layers", 3905245786L), hostObject.objectPtr)

  /** BaseMaterial3D.set_heightmap_deep_parallax_max_layers */
  final def setHeightmapDeepParallaxMaxLayers(layer: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_heightmap_deep_parallax_max_layers", 1286410249L), hostObject.objectPtr, layer)

  /** BaseMaterial3D.get_heightmap_deep_parallax_max_layers */
  final def getHeightmapDeepParallaxMaxLayers(): Long =
    Ptrcall.call0[Long](MethodBind.get("BaseMaterial3D", "get_heightmap_deep_parallax_max_layers", 3905245786L), hostObject.objectPtr)

  /** BaseMaterial3D.set_heightmap_deep_parallax_flip_tangent */
  final def setHeightmapDeepParallaxFlipTangent(flip: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_heightmap_deep_parallax_flip_tangent", 2586408642L), hostObject.objectPtr, flip)

  /** BaseMaterial3D.get_heightmap_deep_parallax_flip_tangent */
  final def getHeightmapDeepParallaxFlipTangent(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("BaseMaterial3D", "get_heightmap_deep_parallax_flip_tangent", 36873697L), hostObject.objectPtr)

  /** BaseMaterial3D.set_heightmap_deep_parallax_flip_binormal */
  final def setHeightmapDeepParallaxFlipBinormal(flip: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_heightmap_deep_parallax_flip_binormal", 2586408642L), hostObject.objectPtr, flip)

  /** BaseMaterial3D.get_heightmap_deep_parallax_flip_binormal */
  final def getHeightmapDeepParallaxFlipBinormal(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("BaseMaterial3D", "get_heightmap_deep_parallax_flip_binormal", 36873697L), hostObject.objectPtr)

  /** BaseMaterial3D.set_grow */
  final def setGrow(amount: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_grow", 373806689L), hostObject.objectPtr, amount)

  /** BaseMaterial3D.get_grow */
  final def getGrow(): Double =
    Ptrcall.call0[Double](MethodBind.get("BaseMaterial3D", "get_grow", 1740695150L), hostObject.objectPtr)

  /** BaseMaterial3D.set_emission_operator */
  final def setEmissionOperator(operator: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_emission_operator", 3825128922L), hostObject.objectPtr, operator)

  /** BaseMaterial3D.get_emission_operator */
  final def getEmissionOperator(): Long =
    Ptrcall.call0[Long](MethodBind.get("BaseMaterial3D", "get_emission_operator", 974205018L), hostObject.objectPtr)

  /** BaseMaterial3D.set_ao_light_affect */
  final def setAoLightAffect(amount: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_ao_light_affect", 373806689L), hostObject.objectPtr, amount)

  /** BaseMaterial3D.get_ao_light_affect */
  final def getAoLightAffect(): Double =
    Ptrcall.call0[Double](MethodBind.get("BaseMaterial3D", "get_ao_light_affect", 1740695150L), hostObject.objectPtr)

  /** BaseMaterial3D.set_alpha_scissor_threshold */
  final def setAlphaScissorThreshold(threshold: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_alpha_scissor_threshold", 373806689L), hostObject.objectPtr, threshold)

  /** BaseMaterial3D.get_alpha_scissor_threshold */
  final def getAlphaScissorThreshold(): Double =
    Ptrcall.call0[Double](MethodBind.get("BaseMaterial3D", "get_alpha_scissor_threshold", 1740695150L), hostObject.objectPtr)

  /** BaseMaterial3D.set_alpha_hash_scale */
  final def setAlphaHashScale(threshold: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_alpha_hash_scale", 373806689L), hostObject.objectPtr, threshold)

  /** BaseMaterial3D.get_alpha_hash_scale */
  final def getAlphaHashScale(): Double =
    Ptrcall.call0[Double](MethodBind.get("BaseMaterial3D", "get_alpha_hash_scale", 1740695150L), hostObject.objectPtr)

  /** BaseMaterial3D.set_grow_enabled */
  final def setGrowEnabled(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_grow_enabled", 2586408642L), hostObject.objectPtr, enable)

  /** BaseMaterial3D.is_grow_enabled */
  final def isGrowEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("BaseMaterial3D", "is_grow_enabled", 36873697L), hostObject.objectPtr)

  /** BaseMaterial3D.set_metallic_texture_channel */
  final def setMetallicTextureChannel(channel: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_metallic_texture_channel", 744167988L), hostObject.objectPtr, channel)

  /** BaseMaterial3D.get_metallic_texture_channel */
  final def getMetallicTextureChannel(): Long =
    Ptrcall.call0[Long](MethodBind.get("BaseMaterial3D", "get_metallic_texture_channel", 568133867L), hostObject.objectPtr)

  /** BaseMaterial3D.set_roughness_texture_channel */
  final def setRoughnessTextureChannel(channel: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_roughness_texture_channel", 744167988L), hostObject.objectPtr, channel)

  /** BaseMaterial3D.get_roughness_texture_channel */
  final def getRoughnessTextureChannel(): Long =
    Ptrcall.call0[Long](MethodBind.get("BaseMaterial3D", "get_roughness_texture_channel", 568133867L), hostObject.objectPtr)

  /** BaseMaterial3D.set_ao_texture_channel */
  final def setAoTextureChannel(channel: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_ao_texture_channel", 744167988L), hostObject.objectPtr, channel)

  /** BaseMaterial3D.get_ao_texture_channel */
  final def getAoTextureChannel(): Long =
    Ptrcall.call0[Long](MethodBind.get("BaseMaterial3D", "get_ao_texture_channel", 568133867L), hostObject.objectPtr)

  /** BaseMaterial3D.set_refraction_texture_channel */
  final def setRefractionTextureChannel(channel: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_refraction_texture_channel", 744167988L), hostObject.objectPtr, channel)

  /** BaseMaterial3D.get_refraction_texture_channel */
  final def getRefractionTextureChannel(): Long =
    Ptrcall.call0[Long](MethodBind.get("BaseMaterial3D", "get_refraction_texture_channel", 568133867L), hostObject.objectPtr)

  /** BaseMaterial3D.set_proximity_fade_enabled */
  final def setProximityFadeEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_proximity_fade_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** BaseMaterial3D.is_proximity_fade_enabled */
  final def isProximityFadeEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("BaseMaterial3D", "is_proximity_fade_enabled", 36873697L), hostObject.objectPtr)

  /** BaseMaterial3D.set_proximity_fade_distance */
  final def setProximityFadeDistance(distance: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_proximity_fade_distance", 373806689L), hostObject.objectPtr, distance)

  /** BaseMaterial3D.get_proximity_fade_distance */
  final def getProximityFadeDistance(): Double =
    Ptrcall.call0[Double](MethodBind.get("BaseMaterial3D", "get_proximity_fade_distance", 1740695150L), hostObject.objectPtr)

  /** BaseMaterial3D.set_msdf_pixel_range */
  final def setMsdfPixelRange(range: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_msdf_pixel_range", 373806689L), hostObject.objectPtr, range)

  /** BaseMaterial3D.get_msdf_pixel_range */
  final def getMsdfPixelRange(): Double =
    Ptrcall.call0[Double](MethodBind.get("BaseMaterial3D", "get_msdf_pixel_range", 1740695150L), hostObject.objectPtr)

  /** BaseMaterial3D.set_msdf_outline_size */
  final def setMsdfOutlineSize(size: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_msdf_outline_size", 373806689L), hostObject.objectPtr, size)

  /** BaseMaterial3D.get_msdf_outline_size */
  final def getMsdfOutlineSize(): Double =
    Ptrcall.call0[Double](MethodBind.get("BaseMaterial3D", "get_msdf_outline_size", 1740695150L), hostObject.objectPtr)

  /** BaseMaterial3D.set_distance_fade */
  final def setDistanceFade(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_distance_fade", 1379478617L), hostObject.objectPtr, mode)

  /** BaseMaterial3D.get_distance_fade */
  final def getDistanceFade(): Long =
    Ptrcall.call0[Long](MethodBind.get("BaseMaterial3D", "get_distance_fade", 2694575734L), hostObject.objectPtr)

  /** BaseMaterial3D.set_distance_fade_max_distance */
  final def setDistanceFadeMaxDistance(distance: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_distance_fade_max_distance", 373806689L), hostObject.objectPtr, distance)

  /** BaseMaterial3D.get_distance_fade_max_distance */
  final def getDistanceFadeMaxDistance(): Double =
    Ptrcall.call0[Double](MethodBind.get("BaseMaterial3D", "get_distance_fade_max_distance", 1740695150L), hostObject.objectPtr)

  /** BaseMaterial3D.set_distance_fade_min_distance */
  final def setDistanceFadeMinDistance(distance: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_distance_fade_min_distance", 373806689L), hostObject.objectPtr, distance)

  /** BaseMaterial3D.get_distance_fade_min_distance */
  final def getDistanceFadeMinDistance(): Double =
    Ptrcall.call0[Double](MethodBind.get("BaseMaterial3D", "get_distance_fade_min_distance", 1740695150L), hostObject.objectPtr)

  /** BaseMaterial3D.set_z_clip_scale */
  final def setZClipScale(scale: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_z_clip_scale", 373806689L), hostObject.objectPtr, scale)

  /** BaseMaterial3D.get_z_clip_scale */
  final def getZClipScale(): Double =
    Ptrcall.call0[Double](MethodBind.get("BaseMaterial3D", "get_z_clip_scale", 1740695150L), hostObject.objectPtr)

  /** BaseMaterial3D.set_fov_override */
  final def setFovOverride(scale: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_fov_override", 373806689L), hostObject.objectPtr, scale)

  /** BaseMaterial3D.get_fov_override */
  final def getFovOverride(): Double =
    Ptrcall.call0[Double](MethodBind.get("BaseMaterial3D", "get_fov_override", 1740695150L), hostObject.objectPtr)

  /** BaseMaterial3D.set_stencil_mode */
  final def setStencilMode(stencil_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_stencil_mode", 2272367200L), hostObject.objectPtr, stencil_mode)

  /** BaseMaterial3D.get_stencil_mode */
  final def getStencilMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("BaseMaterial3D", "get_stencil_mode", 2908443456L), hostObject.objectPtr)

  /** BaseMaterial3D.set_stencil_flags */
  final def setStencilFlags(stencil_flags: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_stencil_flags", 1286410249L), hostObject.objectPtr, stencil_flags)

  /** BaseMaterial3D.get_stencil_flags */
  final def getStencilFlags(): Long =
    Ptrcall.call0[Long](MethodBind.get("BaseMaterial3D", "get_stencil_flags", 3905245786L), hostObject.objectPtr)

  /** BaseMaterial3D.set_stencil_compare */
  final def setStencilCompare(stencil_compare: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_stencil_compare", 3741726481L), hostObject.objectPtr, stencil_compare)

  /** BaseMaterial3D.get_stencil_compare */
  final def getStencilCompare(): Long =
    Ptrcall.call0[Long](MethodBind.get("BaseMaterial3D", "get_stencil_compare", 2824600492L), hostObject.objectPtr)

  /** BaseMaterial3D.set_stencil_reference */
  final def setStencilReference(stencil_reference: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_stencil_reference", 1286410249L), hostObject.objectPtr, stencil_reference)

  /** BaseMaterial3D.get_stencil_reference */
  final def getStencilReference(): Long =
    Ptrcall.call0[Long](MethodBind.get("BaseMaterial3D", "get_stencil_reference", 3905245786L), hostObject.objectPtr)

  /** BaseMaterial3D.set_stencil_effect_color */
  final def setStencilEffectColor(stencil_color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_stencil_effect_color", 2920490490L), hostObject.objectPtr, stencil_color)

  /** BaseMaterial3D.get_stencil_effect_color */
  final def getStencilEffectColor(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("BaseMaterial3D", "get_stencil_effect_color", 3444240500L), hostObject.objectPtr)

  /** BaseMaterial3D.set_stencil_effect_outline_thickness */
  final def setStencilEffectOutlineThickness(stencil_outline_thickness: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("BaseMaterial3D", "set_stencil_effect_outline_thickness", 373806689L), hostObject.objectPtr, stencil_outline_thickness)

  /** BaseMaterial3D.get_stencil_effect_outline_thickness */
  final def getStencilEffectOutlineThickness(): Double =
    Ptrcall.call0[Double](MethodBind.get("BaseMaterial3D", "get_stencil_effect_outline_thickness", 1740695150L), hostObject.objectPtr)

}

object BaseMaterial3D {
  /** Class metadata for Gd[BaseMaterial3D] lifetime management and casting. */
  given GodotClass[BaseMaterial3D] with {
    def className = "BaseMaterial3D"
    def isRefCounted = true
    def wrap(o: GodotObject): BaseMaterial3D = new BaseMaterial3D {}.withHost(o.objectPtr)
    def unwrap(t: BaseMaterial3D): GodotObject = t.hostObject
  }
}
