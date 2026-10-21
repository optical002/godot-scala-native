package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `BaseMaterial3D`, extends `Material`. */
abstract class BaseMaterial3D extends Material {
  override def godotClassName: String = "BaseMaterial3D"

  /** BaseMaterial3D.set_albedo */
  final def setAlbedo(albedo: gdext.builtin.Color): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_albedo == null) gdext.classes.BaseMaterial3D.mb_set_albedo = MethodBind.get("BaseMaterial3D", "set_albedo", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_albedo, livePtr, albedo)
  }

  /** BaseMaterial3D.get_albedo */
  final def getAlbedo(): gdext.builtin.Color = {
    if (gdext.classes.BaseMaterial3D.mb_get_albedo == null) gdext.classes.BaseMaterial3D.mb_get_albedo = MethodBind.get("BaseMaterial3D", "get_albedo", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.BaseMaterial3D.mb_get_albedo, livePtr)
  }

  /** BaseMaterial3D.set_transparency */
  final def setTransparency(transparency: Long): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_transparency == null) gdext.classes.BaseMaterial3D.mb_set_transparency = MethodBind.get("BaseMaterial3D", "set_transparency", 3435651667L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_transparency, livePtr, transparency)
  }

  /** BaseMaterial3D.get_transparency */
  final def getTransparency(): Long = {
    if (gdext.classes.BaseMaterial3D.mb_get_transparency == null) gdext.classes.BaseMaterial3D.mb_get_transparency = MethodBind.get("BaseMaterial3D", "get_transparency", 990903061L)
    Ptrcall.call0[Long](gdext.classes.BaseMaterial3D.mb_get_transparency, livePtr)
  }

  /** BaseMaterial3D.set_alpha_antialiasing */
  final def setAlphaAntialiasing(alpha_aa: Long): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_alpha_antialiasing == null) gdext.classes.BaseMaterial3D.mb_set_alpha_antialiasing = MethodBind.get("BaseMaterial3D", "set_alpha_antialiasing", 3212649852L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_alpha_antialiasing, livePtr, alpha_aa)
  }

  /** BaseMaterial3D.get_alpha_antialiasing */
  final def getAlphaAntialiasing(): Long = {
    if (gdext.classes.BaseMaterial3D.mb_get_alpha_antialiasing == null) gdext.classes.BaseMaterial3D.mb_get_alpha_antialiasing = MethodBind.get("BaseMaterial3D", "get_alpha_antialiasing", 2889939400L)
    Ptrcall.call0[Long](gdext.classes.BaseMaterial3D.mb_get_alpha_antialiasing, livePtr)
  }

  /** BaseMaterial3D.set_alpha_antialiasing_edge */
  final def setAlphaAntialiasingEdge(edge: Double): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_alpha_antialiasing_edge == null) gdext.classes.BaseMaterial3D.mb_set_alpha_antialiasing_edge = MethodBind.get("BaseMaterial3D", "set_alpha_antialiasing_edge", 373806689L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_alpha_antialiasing_edge, livePtr, edge)
  }

  /** BaseMaterial3D.get_alpha_antialiasing_edge */
  final def getAlphaAntialiasingEdge(): Double = {
    if (gdext.classes.BaseMaterial3D.mb_get_alpha_antialiasing_edge == null) gdext.classes.BaseMaterial3D.mb_get_alpha_antialiasing_edge = MethodBind.get("BaseMaterial3D", "get_alpha_antialiasing_edge", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.BaseMaterial3D.mb_get_alpha_antialiasing_edge, livePtr)
  }

  /** BaseMaterial3D.set_shading_mode */
  final def setShadingMode(shading_mode: Long): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_shading_mode == null) gdext.classes.BaseMaterial3D.mb_set_shading_mode = MethodBind.get("BaseMaterial3D", "set_shading_mode", 3368750322L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_shading_mode, livePtr, shading_mode)
  }

  /** BaseMaterial3D.get_shading_mode */
  final def getShadingMode(): Long = {
    if (gdext.classes.BaseMaterial3D.mb_get_shading_mode == null) gdext.classes.BaseMaterial3D.mb_get_shading_mode = MethodBind.get("BaseMaterial3D", "get_shading_mode", 2132070559L)
    Ptrcall.call0[Long](gdext.classes.BaseMaterial3D.mb_get_shading_mode, livePtr)
  }

  /** BaseMaterial3D.set_specular */
  final def setSpecular(specular: Double): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_specular == null) gdext.classes.BaseMaterial3D.mb_set_specular = MethodBind.get("BaseMaterial3D", "set_specular", 373806689L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_specular, livePtr, specular)
  }

  /** BaseMaterial3D.get_specular */
  final def getSpecular(): Double = {
    if (gdext.classes.BaseMaterial3D.mb_get_specular == null) gdext.classes.BaseMaterial3D.mb_get_specular = MethodBind.get("BaseMaterial3D", "get_specular", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.BaseMaterial3D.mb_get_specular, livePtr)
  }

  /** BaseMaterial3D.set_metallic */
  final def setMetallic(metallic: Double): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_metallic == null) gdext.classes.BaseMaterial3D.mb_set_metallic = MethodBind.get("BaseMaterial3D", "set_metallic", 373806689L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_metallic, livePtr, metallic)
  }

  /** BaseMaterial3D.get_metallic */
  final def getMetallic(): Double = {
    if (gdext.classes.BaseMaterial3D.mb_get_metallic == null) gdext.classes.BaseMaterial3D.mb_get_metallic = MethodBind.get("BaseMaterial3D", "get_metallic", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.BaseMaterial3D.mb_get_metallic, livePtr)
  }

  /** BaseMaterial3D.set_roughness */
  final def setRoughness(roughness: Double): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_roughness == null) gdext.classes.BaseMaterial3D.mb_set_roughness = MethodBind.get("BaseMaterial3D", "set_roughness", 373806689L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_roughness, livePtr, roughness)
  }

  /** BaseMaterial3D.get_roughness */
  final def getRoughness(): Double = {
    if (gdext.classes.BaseMaterial3D.mb_get_roughness == null) gdext.classes.BaseMaterial3D.mb_get_roughness = MethodBind.get("BaseMaterial3D", "get_roughness", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.BaseMaterial3D.mb_get_roughness, livePtr)
  }

  /** BaseMaterial3D.set_emission */
  final def setEmission(emission: gdext.builtin.Color): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_emission == null) gdext.classes.BaseMaterial3D.mb_set_emission = MethodBind.get("BaseMaterial3D", "set_emission", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_emission, livePtr, emission)
  }

  /** BaseMaterial3D.get_emission */
  final def getEmission(): gdext.builtin.Color = {
    if (gdext.classes.BaseMaterial3D.mb_get_emission == null) gdext.classes.BaseMaterial3D.mb_get_emission = MethodBind.get("BaseMaterial3D", "get_emission", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.BaseMaterial3D.mb_get_emission, livePtr)
  }

  /** BaseMaterial3D.set_emission_energy_multiplier */
  final def setEmissionEnergyMultiplier(emission_energy_multiplier: Double): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_emission_energy_multiplier == null) gdext.classes.BaseMaterial3D.mb_set_emission_energy_multiplier = MethodBind.get("BaseMaterial3D", "set_emission_energy_multiplier", 373806689L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_emission_energy_multiplier, livePtr, emission_energy_multiplier)
  }

  /** BaseMaterial3D.get_emission_energy_multiplier */
  final def getEmissionEnergyMultiplier(): Double = {
    if (gdext.classes.BaseMaterial3D.mb_get_emission_energy_multiplier == null) gdext.classes.BaseMaterial3D.mb_get_emission_energy_multiplier = MethodBind.get("BaseMaterial3D", "get_emission_energy_multiplier", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.BaseMaterial3D.mb_get_emission_energy_multiplier, livePtr)
  }

  /** BaseMaterial3D.set_emission_intensity */
  final def setEmissionIntensity(emission_energy_multiplier: Double): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_emission_intensity == null) gdext.classes.BaseMaterial3D.mb_set_emission_intensity = MethodBind.get("BaseMaterial3D", "set_emission_intensity", 373806689L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_emission_intensity, livePtr, emission_energy_multiplier)
  }

  /** BaseMaterial3D.get_emission_intensity */
  final def getEmissionIntensity(): Double = {
    if (gdext.classes.BaseMaterial3D.mb_get_emission_intensity == null) gdext.classes.BaseMaterial3D.mb_get_emission_intensity = MethodBind.get("BaseMaterial3D", "get_emission_intensity", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.BaseMaterial3D.mb_get_emission_intensity, livePtr)
  }

  /** BaseMaterial3D.set_normal_scale */
  final def setNormalScale(normal_scale: Double): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_normal_scale == null) gdext.classes.BaseMaterial3D.mb_set_normal_scale = MethodBind.get("BaseMaterial3D", "set_normal_scale", 373806689L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_normal_scale, livePtr, normal_scale)
  }

  /** BaseMaterial3D.get_normal_scale */
  final def getNormalScale(): Double = {
    if (gdext.classes.BaseMaterial3D.mb_get_normal_scale == null) gdext.classes.BaseMaterial3D.mb_get_normal_scale = MethodBind.get("BaseMaterial3D", "get_normal_scale", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.BaseMaterial3D.mb_get_normal_scale, livePtr)
  }

  /** BaseMaterial3D.set_rim */
  final def setRim(rim: Double): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_rim == null) gdext.classes.BaseMaterial3D.mb_set_rim = MethodBind.get("BaseMaterial3D", "set_rim", 373806689L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_rim, livePtr, rim)
  }

  /** BaseMaterial3D.get_rim */
  final def getRim(): Double = {
    if (gdext.classes.BaseMaterial3D.mb_get_rim == null) gdext.classes.BaseMaterial3D.mb_get_rim = MethodBind.get("BaseMaterial3D", "get_rim", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.BaseMaterial3D.mb_get_rim, livePtr)
  }

  /** BaseMaterial3D.set_rim_tint */
  final def setRimTint(rim_tint: Double): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_rim_tint == null) gdext.classes.BaseMaterial3D.mb_set_rim_tint = MethodBind.get("BaseMaterial3D", "set_rim_tint", 373806689L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_rim_tint, livePtr, rim_tint)
  }

  /** BaseMaterial3D.get_rim_tint */
  final def getRimTint(): Double = {
    if (gdext.classes.BaseMaterial3D.mb_get_rim_tint == null) gdext.classes.BaseMaterial3D.mb_get_rim_tint = MethodBind.get("BaseMaterial3D", "get_rim_tint", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.BaseMaterial3D.mb_get_rim_tint, livePtr)
  }

  /** BaseMaterial3D.set_clearcoat */
  final def setClearcoat(clearcoat: Double): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_clearcoat == null) gdext.classes.BaseMaterial3D.mb_set_clearcoat = MethodBind.get("BaseMaterial3D", "set_clearcoat", 373806689L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_clearcoat, livePtr, clearcoat)
  }

  /** BaseMaterial3D.get_clearcoat */
  final def getClearcoat(): Double = {
    if (gdext.classes.BaseMaterial3D.mb_get_clearcoat == null) gdext.classes.BaseMaterial3D.mb_get_clearcoat = MethodBind.get("BaseMaterial3D", "get_clearcoat", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.BaseMaterial3D.mb_get_clearcoat, livePtr)
  }

  /** BaseMaterial3D.set_clearcoat_roughness */
  final def setClearcoatRoughness(clearcoat_roughness: Double): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_clearcoat_roughness == null) gdext.classes.BaseMaterial3D.mb_set_clearcoat_roughness = MethodBind.get("BaseMaterial3D", "set_clearcoat_roughness", 373806689L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_clearcoat_roughness, livePtr, clearcoat_roughness)
  }

  /** BaseMaterial3D.get_clearcoat_roughness */
  final def getClearcoatRoughness(): Double = {
    if (gdext.classes.BaseMaterial3D.mb_get_clearcoat_roughness == null) gdext.classes.BaseMaterial3D.mb_get_clearcoat_roughness = MethodBind.get("BaseMaterial3D", "get_clearcoat_roughness", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.BaseMaterial3D.mb_get_clearcoat_roughness, livePtr)
  }

  /** BaseMaterial3D.set_anisotropy */
  final def setAnisotropy(anisotropy: Double): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_anisotropy == null) gdext.classes.BaseMaterial3D.mb_set_anisotropy = MethodBind.get("BaseMaterial3D", "set_anisotropy", 373806689L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_anisotropy, livePtr, anisotropy)
  }

  /** BaseMaterial3D.get_anisotropy */
  final def getAnisotropy(): Double = {
    if (gdext.classes.BaseMaterial3D.mb_get_anisotropy == null) gdext.classes.BaseMaterial3D.mb_get_anisotropy = MethodBind.get("BaseMaterial3D", "get_anisotropy", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.BaseMaterial3D.mb_get_anisotropy, livePtr)
  }

  /** BaseMaterial3D.set_heightmap_scale */
  final def setHeightmapScale(heightmap_scale: Double): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_heightmap_scale == null) gdext.classes.BaseMaterial3D.mb_set_heightmap_scale = MethodBind.get("BaseMaterial3D", "set_heightmap_scale", 373806689L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_heightmap_scale, livePtr, heightmap_scale)
  }

  /** BaseMaterial3D.get_heightmap_scale */
  final def getHeightmapScale(): Double = {
    if (gdext.classes.BaseMaterial3D.mb_get_heightmap_scale == null) gdext.classes.BaseMaterial3D.mb_get_heightmap_scale = MethodBind.get("BaseMaterial3D", "get_heightmap_scale", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.BaseMaterial3D.mb_get_heightmap_scale, livePtr)
  }

  /** BaseMaterial3D.set_subsurface_scattering_strength */
  final def setSubsurfaceScatteringStrength(strength: Double): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_subsurface_scattering_strength == null) gdext.classes.BaseMaterial3D.mb_set_subsurface_scattering_strength = MethodBind.get("BaseMaterial3D", "set_subsurface_scattering_strength", 373806689L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_subsurface_scattering_strength, livePtr, strength)
  }

  /** BaseMaterial3D.get_subsurface_scattering_strength */
  final def getSubsurfaceScatteringStrength(): Double = {
    if (gdext.classes.BaseMaterial3D.mb_get_subsurface_scattering_strength == null) gdext.classes.BaseMaterial3D.mb_get_subsurface_scattering_strength = MethodBind.get("BaseMaterial3D", "get_subsurface_scattering_strength", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.BaseMaterial3D.mb_get_subsurface_scattering_strength, livePtr)
  }

  /** BaseMaterial3D.set_transmittance_color */
  final def setTransmittanceColor(color: gdext.builtin.Color): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_transmittance_color == null) gdext.classes.BaseMaterial3D.mb_set_transmittance_color = MethodBind.get("BaseMaterial3D", "set_transmittance_color", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_transmittance_color, livePtr, color)
  }

  /** BaseMaterial3D.get_transmittance_color */
  final def getTransmittanceColor(): gdext.builtin.Color = {
    if (gdext.classes.BaseMaterial3D.mb_get_transmittance_color == null) gdext.classes.BaseMaterial3D.mb_get_transmittance_color = MethodBind.get("BaseMaterial3D", "get_transmittance_color", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.BaseMaterial3D.mb_get_transmittance_color, livePtr)
  }

  /** BaseMaterial3D.set_transmittance_depth */
  final def setTransmittanceDepth(depth: Double): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_transmittance_depth == null) gdext.classes.BaseMaterial3D.mb_set_transmittance_depth = MethodBind.get("BaseMaterial3D", "set_transmittance_depth", 373806689L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_transmittance_depth, livePtr, depth)
  }

  /** BaseMaterial3D.get_transmittance_depth */
  final def getTransmittanceDepth(): Double = {
    if (gdext.classes.BaseMaterial3D.mb_get_transmittance_depth == null) gdext.classes.BaseMaterial3D.mb_get_transmittance_depth = MethodBind.get("BaseMaterial3D", "get_transmittance_depth", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.BaseMaterial3D.mb_get_transmittance_depth, livePtr)
  }

  /** BaseMaterial3D.set_transmittance_boost */
  final def setTransmittanceBoost(boost: Double): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_transmittance_boost == null) gdext.classes.BaseMaterial3D.mb_set_transmittance_boost = MethodBind.get("BaseMaterial3D", "set_transmittance_boost", 373806689L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_transmittance_boost, livePtr, boost)
  }

  /** BaseMaterial3D.get_transmittance_boost */
  final def getTransmittanceBoost(): Double = {
    if (gdext.classes.BaseMaterial3D.mb_get_transmittance_boost == null) gdext.classes.BaseMaterial3D.mb_get_transmittance_boost = MethodBind.get("BaseMaterial3D", "get_transmittance_boost", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.BaseMaterial3D.mb_get_transmittance_boost, livePtr)
  }

  /** BaseMaterial3D.set_backlight */
  final def setBacklight(backlight: gdext.builtin.Color): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_backlight == null) gdext.classes.BaseMaterial3D.mb_set_backlight = MethodBind.get("BaseMaterial3D", "set_backlight", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_backlight, livePtr, backlight)
  }

  /** BaseMaterial3D.get_backlight */
  final def getBacklight(): gdext.builtin.Color = {
    if (gdext.classes.BaseMaterial3D.mb_get_backlight == null) gdext.classes.BaseMaterial3D.mb_get_backlight = MethodBind.get("BaseMaterial3D", "get_backlight", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.BaseMaterial3D.mb_get_backlight, livePtr)
  }

  /** BaseMaterial3D.set_refraction */
  final def setRefraction(refraction: Double): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_refraction == null) gdext.classes.BaseMaterial3D.mb_set_refraction = MethodBind.get("BaseMaterial3D", "set_refraction", 373806689L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_refraction, livePtr, refraction)
  }

  /** BaseMaterial3D.get_refraction */
  final def getRefraction(): Double = {
    if (gdext.classes.BaseMaterial3D.mb_get_refraction == null) gdext.classes.BaseMaterial3D.mb_get_refraction = MethodBind.get("BaseMaterial3D", "get_refraction", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.BaseMaterial3D.mb_get_refraction, livePtr)
  }

  /** BaseMaterial3D.set_point_size */
  final def setPointSize(point_size: Double): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_point_size == null) gdext.classes.BaseMaterial3D.mb_set_point_size = MethodBind.get("BaseMaterial3D", "set_point_size", 373806689L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_point_size, livePtr, point_size)
  }

  /** BaseMaterial3D.get_point_size */
  final def getPointSize(): Double = {
    if (gdext.classes.BaseMaterial3D.mb_get_point_size == null) gdext.classes.BaseMaterial3D.mb_get_point_size = MethodBind.get("BaseMaterial3D", "get_point_size", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.BaseMaterial3D.mb_get_point_size, livePtr)
  }

  /** BaseMaterial3D.set_detail_uv */
  final def setDetailUv(detail_uv: Long): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_detail_uv == null) gdext.classes.BaseMaterial3D.mb_set_detail_uv = MethodBind.get("BaseMaterial3D", "set_detail_uv", 456801921L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_detail_uv, livePtr, detail_uv)
  }

  /** BaseMaterial3D.get_detail_uv */
  final def getDetailUv(): Long = {
    if (gdext.classes.BaseMaterial3D.mb_get_detail_uv == null) gdext.classes.BaseMaterial3D.mb_get_detail_uv = MethodBind.get("BaseMaterial3D", "get_detail_uv", 2306920512L)
    Ptrcall.call0[Long](gdext.classes.BaseMaterial3D.mb_get_detail_uv, livePtr)
  }

  /** BaseMaterial3D.set_blend_mode */
  final def setBlendMode(blend_mode: Long): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_blend_mode == null) gdext.classes.BaseMaterial3D.mb_set_blend_mode = MethodBind.get("BaseMaterial3D", "set_blend_mode", 2830186259L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_blend_mode, livePtr, blend_mode)
  }

  /** BaseMaterial3D.get_blend_mode */
  final def getBlendMode(): Long = {
    if (gdext.classes.BaseMaterial3D.mb_get_blend_mode == null) gdext.classes.BaseMaterial3D.mb_get_blend_mode = MethodBind.get("BaseMaterial3D", "get_blend_mode", 4022690962L)
    Ptrcall.call0[Long](gdext.classes.BaseMaterial3D.mb_get_blend_mode, livePtr)
  }

  /** BaseMaterial3D.set_depth_draw_mode */
  final def setDepthDrawMode(depth_draw_mode: Long): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_depth_draw_mode == null) gdext.classes.BaseMaterial3D.mb_set_depth_draw_mode = MethodBind.get("BaseMaterial3D", "set_depth_draw_mode", 1456584748L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_depth_draw_mode, livePtr, depth_draw_mode)
  }

  /** BaseMaterial3D.get_depth_draw_mode */
  final def getDepthDrawMode(): Long = {
    if (gdext.classes.BaseMaterial3D.mb_get_depth_draw_mode == null) gdext.classes.BaseMaterial3D.mb_get_depth_draw_mode = MethodBind.get("BaseMaterial3D", "get_depth_draw_mode", 2578197639L)
    Ptrcall.call0[Long](gdext.classes.BaseMaterial3D.mb_get_depth_draw_mode, livePtr)
  }

  /** BaseMaterial3D.set_depth_test */
  final def setDepthTest(depth_test: Long): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_depth_test == null) gdext.classes.BaseMaterial3D.mb_set_depth_test = MethodBind.get("BaseMaterial3D", "set_depth_test", 3918692338L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_depth_test, livePtr, depth_test)
  }

  /** BaseMaterial3D.get_depth_test */
  final def getDepthTest(): Long = {
    if (gdext.classes.BaseMaterial3D.mb_get_depth_test == null) gdext.classes.BaseMaterial3D.mb_get_depth_test = MethodBind.get("BaseMaterial3D", "get_depth_test", 3434785811L)
    Ptrcall.call0[Long](gdext.classes.BaseMaterial3D.mb_get_depth_test, livePtr)
  }

  /** BaseMaterial3D.set_cull_mode */
  final def setCullMode(cull_mode: Long): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_cull_mode == null) gdext.classes.BaseMaterial3D.mb_set_cull_mode = MethodBind.get("BaseMaterial3D", "set_cull_mode", 2338909218L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_cull_mode, livePtr, cull_mode)
  }

  /** BaseMaterial3D.get_cull_mode */
  final def getCullMode(): Long = {
    if (gdext.classes.BaseMaterial3D.mb_get_cull_mode == null) gdext.classes.BaseMaterial3D.mb_get_cull_mode = MethodBind.get("BaseMaterial3D", "get_cull_mode", 1941499586L)
    Ptrcall.call0[Long](gdext.classes.BaseMaterial3D.mb_get_cull_mode, livePtr)
  }

  /** BaseMaterial3D.set_diffuse_mode */
  final def setDiffuseMode(diffuse_mode: Long): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_diffuse_mode == null) gdext.classes.BaseMaterial3D.mb_set_diffuse_mode = MethodBind.get("BaseMaterial3D", "set_diffuse_mode", 1045299638L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_diffuse_mode, livePtr, diffuse_mode)
  }

  /** BaseMaterial3D.get_diffuse_mode */
  final def getDiffuseMode(): Long = {
    if (gdext.classes.BaseMaterial3D.mb_get_diffuse_mode == null) gdext.classes.BaseMaterial3D.mb_get_diffuse_mode = MethodBind.get("BaseMaterial3D", "get_diffuse_mode", 3973617136L)
    Ptrcall.call0[Long](gdext.classes.BaseMaterial3D.mb_get_diffuse_mode, livePtr)
  }

  /** BaseMaterial3D.set_specular_mode */
  final def setSpecularMode(specular_mode: Long): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_specular_mode == null) gdext.classes.BaseMaterial3D.mb_set_specular_mode = MethodBind.get("BaseMaterial3D", "set_specular_mode", 584737147L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_specular_mode, livePtr, specular_mode)
  }

  /** BaseMaterial3D.get_specular_mode */
  final def getSpecularMode(): Long = {
    if (gdext.classes.BaseMaterial3D.mb_get_specular_mode == null) gdext.classes.BaseMaterial3D.mb_get_specular_mode = MethodBind.get("BaseMaterial3D", "get_specular_mode", 2569953298L)
    Ptrcall.call0[Long](gdext.classes.BaseMaterial3D.mb_get_specular_mode, livePtr)
  }

  /** BaseMaterial3D.set_flag */
  final def setFlag(flag: Long, enable: Boolean): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_flag == null) gdext.classes.BaseMaterial3D.mb_set_flag = MethodBind.get("BaseMaterial3D", "set_flag", 3070159527L)
    Ptrcall.callVoid2(gdext.classes.BaseMaterial3D.mb_set_flag, livePtr, flag, enable)
  }

  /** BaseMaterial3D.get_flag */
  final def getFlag(flag: Long): Boolean = {
    if (gdext.classes.BaseMaterial3D.mb_get_flag == null) gdext.classes.BaseMaterial3D.mb_get_flag = MethodBind.get("BaseMaterial3D", "get_flag", 1286410065L)
    Ptrcall.call1[Long, Boolean](gdext.classes.BaseMaterial3D.mb_get_flag, livePtr, flag)
  }

  /** BaseMaterial3D.set_texture_filter */
  final def setTextureFilter(mode: Long): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_texture_filter == null) gdext.classes.BaseMaterial3D.mb_set_texture_filter = MethodBind.get("BaseMaterial3D", "set_texture_filter", 22904437L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_texture_filter, livePtr, mode)
  }

  /** BaseMaterial3D.get_texture_filter */
  final def getTextureFilter(): Long = {
    if (gdext.classes.BaseMaterial3D.mb_get_texture_filter == null) gdext.classes.BaseMaterial3D.mb_get_texture_filter = MethodBind.get("BaseMaterial3D", "get_texture_filter", 3289213076L)
    Ptrcall.call0[Long](gdext.classes.BaseMaterial3D.mb_get_texture_filter, livePtr)
  }

  /** BaseMaterial3D.set_feature */
  final def setFeature(feature: Long, enable: Boolean): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_feature == null) gdext.classes.BaseMaterial3D.mb_set_feature = MethodBind.get("BaseMaterial3D", "set_feature", 2819288693L)
    Ptrcall.callVoid2(gdext.classes.BaseMaterial3D.mb_set_feature, livePtr, feature, enable)
  }

  /** BaseMaterial3D.get_feature */
  final def getFeature(feature: Long): Boolean = {
    if (gdext.classes.BaseMaterial3D.mb_get_feature == null) gdext.classes.BaseMaterial3D.mb_get_feature = MethodBind.get("BaseMaterial3D", "get_feature", 1965241794L)
    Ptrcall.call1[Long, Boolean](gdext.classes.BaseMaterial3D.mb_get_feature, livePtr, feature)
  }

  /** BaseMaterial3D.set_texture */
  final def setTexture(param: Long, texture: Texture2D): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_texture == null) gdext.classes.BaseMaterial3D.mb_set_texture = MethodBind.get("BaseMaterial3D", "set_texture", 464208135L)
    Ptrcall.callVoid2(gdext.classes.BaseMaterial3D.mb_set_texture, livePtr, param, Wrappers.handle(texture))
  }

  /** BaseMaterial3D.get_texture. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getTexture(param: Long): Texture2D = {
    if (gdext.classes.BaseMaterial3D.mb_get_texture == null) gdext.classes.BaseMaterial3D.mb_get_texture = MethodBind.get("BaseMaterial3D", "get_texture", 329605813L)
    Wrappers.owned[Texture2D](Ptrcall.call1[Long, Long](gdext.classes.BaseMaterial3D.mb_get_texture, livePtr, param))
  }

  /** BaseMaterial3D.set_detail_blend_mode */
  final def setDetailBlendMode(detail_blend_mode: Long): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_detail_blend_mode == null) gdext.classes.BaseMaterial3D.mb_set_detail_blend_mode = MethodBind.get("BaseMaterial3D", "set_detail_blend_mode", 2830186259L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_detail_blend_mode, livePtr, detail_blend_mode)
  }

  /** BaseMaterial3D.get_detail_blend_mode */
  final def getDetailBlendMode(): Long = {
    if (gdext.classes.BaseMaterial3D.mb_get_detail_blend_mode == null) gdext.classes.BaseMaterial3D.mb_get_detail_blend_mode = MethodBind.get("BaseMaterial3D", "get_detail_blend_mode", 4022690962L)
    Ptrcall.call0[Long](gdext.classes.BaseMaterial3D.mb_get_detail_blend_mode, livePtr)
  }

  /** BaseMaterial3D.set_uv1_scale */
  final def setUv1Scale(scale: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_uv1_scale == null) gdext.classes.BaseMaterial3D.mb_set_uv1_scale = MethodBind.get("BaseMaterial3D", "set_uv1_scale", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_uv1_scale, livePtr, scale)
  }

  /** BaseMaterial3D.get_uv1_scale */
  final def getUv1Scale(): gdext.builtin.Vector3 = {
    if (gdext.classes.BaseMaterial3D.mb_get_uv1_scale == null) gdext.classes.BaseMaterial3D.mb_get_uv1_scale = MethodBind.get("BaseMaterial3D", "get_uv1_scale", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.BaseMaterial3D.mb_get_uv1_scale, livePtr)
  }

  /** BaseMaterial3D.set_uv1_offset */
  final def setUv1Offset(offset: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_uv1_offset == null) gdext.classes.BaseMaterial3D.mb_set_uv1_offset = MethodBind.get("BaseMaterial3D", "set_uv1_offset", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_uv1_offset, livePtr, offset)
  }

  /** BaseMaterial3D.get_uv1_offset */
  final def getUv1Offset(): gdext.builtin.Vector3 = {
    if (gdext.classes.BaseMaterial3D.mb_get_uv1_offset == null) gdext.classes.BaseMaterial3D.mb_get_uv1_offset = MethodBind.get("BaseMaterial3D", "get_uv1_offset", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.BaseMaterial3D.mb_get_uv1_offset, livePtr)
  }

  /** BaseMaterial3D.set_uv1_triplanar_blend_sharpness */
  final def setUv1TriplanarBlendSharpness(sharpness: Double): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_uv1_triplanar_blend_sharpness == null) gdext.classes.BaseMaterial3D.mb_set_uv1_triplanar_blend_sharpness = MethodBind.get("BaseMaterial3D", "set_uv1_triplanar_blend_sharpness", 373806689L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_uv1_triplanar_blend_sharpness, livePtr, sharpness)
  }

  /** BaseMaterial3D.get_uv1_triplanar_blend_sharpness */
  final def getUv1TriplanarBlendSharpness(): Double = {
    if (gdext.classes.BaseMaterial3D.mb_get_uv1_triplanar_blend_sharpness == null) gdext.classes.BaseMaterial3D.mb_get_uv1_triplanar_blend_sharpness = MethodBind.get("BaseMaterial3D", "get_uv1_triplanar_blend_sharpness", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.BaseMaterial3D.mb_get_uv1_triplanar_blend_sharpness, livePtr)
  }

  /** BaseMaterial3D.set_uv2_scale */
  final def setUv2Scale(scale: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_uv2_scale == null) gdext.classes.BaseMaterial3D.mb_set_uv2_scale = MethodBind.get("BaseMaterial3D", "set_uv2_scale", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_uv2_scale, livePtr, scale)
  }

  /** BaseMaterial3D.get_uv2_scale */
  final def getUv2Scale(): gdext.builtin.Vector3 = {
    if (gdext.classes.BaseMaterial3D.mb_get_uv2_scale == null) gdext.classes.BaseMaterial3D.mb_get_uv2_scale = MethodBind.get("BaseMaterial3D", "get_uv2_scale", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.BaseMaterial3D.mb_get_uv2_scale, livePtr)
  }

  /** BaseMaterial3D.set_uv2_offset */
  final def setUv2Offset(offset: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_uv2_offset == null) gdext.classes.BaseMaterial3D.mb_set_uv2_offset = MethodBind.get("BaseMaterial3D", "set_uv2_offset", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_uv2_offset, livePtr, offset)
  }

  /** BaseMaterial3D.get_uv2_offset */
  final def getUv2Offset(): gdext.builtin.Vector3 = {
    if (gdext.classes.BaseMaterial3D.mb_get_uv2_offset == null) gdext.classes.BaseMaterial3D.mb_get_uv2_offset = MethodBind.get("BaseMaterial3D", "get_uv2_offset", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.BaseMaterial3D.mb_get_uv2_offset, livePtr)
  }

  /** BaseMaterial3D.set_uv2_triplanar_blend_sharpness */
  final def setUv2TriplanarBlendSharpness(sharpness: Double): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_uv2_triplanar_blend_sharpness == null) gdext.classes.BaseMaterial3D.mb_set_uv2_triplanar_blend_sharpness = MethodBind.get("BaseMaterial3D", "set_uv2_triplanar_blend_sharpness", 373806689L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_uv2_triplanar_blend_sharpness, livePtr, sharpness)
  }

  /** BaseMaterial3D.get_uv2_triplanar_blend_sharpness */
  final def getUv2TriplanarBlendSharpness(): Double = {
    if (gdext.classes.BaseMaterial3D.mb_get_uv2_triplanar_blend_sharpness == null) gdext.classes.BaseMaterial3D.mb_get_uv2_triplanar_blend_sharpness = MethodBind.get("BaseMaterial3D", "get_uv2_triplanar_blend_sharpness", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.BaseMaterial3D.mb_get_uv2_triplanar_blend_sharpness, livePtr)
  }

  /** BaseMaterial3D.set_billboard_mode */
  final def setBillboardMode(mode: Long): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_billboard_mode == null) gdext.classes.BaseMaterial3D.mb_set_billboard_mode = MethodBind.get("BaseMaterial3D", "set_billboard_mode", 4202036497L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_billboard_mode, livePtr, mode)
  }

  /** BaseMaterial3D.get_billboard_mode */
  final def getBillboardMode(): Long = {
    if (gdext.classes.BaseMaterial3D.mb_get_billboard_mode == null) gdext.classes.BaseMaterial3D.mb_get_billboard_mode = MethodBind.get("BaseMaterial3D", "get_billboard_mode", 1283840139L)
    Ptrcall.call0[Long](gdext.classes.BaseMaterial3D.mb_get_billboard_mode, livePtr)
  }

  /** BaseMaterial3D.set_particles_anim_h_frames */
  final def setParticlesAnimHFrames(frames: Long): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_particles_anim_h_frames == null) gdext.classes.BaseMaterial3D.mb_set_particles_anim_h_frames = MethodBind.get("BaseMaterial3D", "set_particles_anim_h_frames", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_particles_anim_h_frames, livePtr, frames)
  }

  /** BaseMaterial3D.get_particles_anim_h_frames */
  final def getParticlesAnimHFrames(): Long = {
    if (gdext.classes.BaseMaterial3D.mb_get_particles_anim_h_frames == null) gdext.classes.BaseMaterial3D.mb_get_particles_anim_h_frames = MethodBind.get("BaseMaterial3D", "get_particles_anim_h_frames", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.BaseMaterial3D.mb_get_particles_anim_h_frames, livePtr)
  }

  /** BaseMaterial3D.set_particles_anim_v_frames */
  final def setParticlesAnimVFrames(frames: Long): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_particles_anim_v_frames == null) gdext.classes.BaseMaterial3D.mb_set_particles_anim_v_frames = MethodBind.get("BaseMaterial3D", "set_particles_anim_v_frames", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_particles_anim_v_frames, livePtr, frames)
  }

  /** BaseMaterial3D.get_particles_anim_v_frames */
  final def getParticlesAnimVFrames(): Long = {
    if (gdext.classes.BaseMaterial3D.mb_get_particles_anim_v_frames == null) gdext.classes.BaseMaterial3D.mb_get_particles_anim_v_frames = MethodBind.get("BaseMaterial3D", "get_particles_anim_v_frames", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.BaseMaterial3D.mb_get_particles_anim_v_frames, livePtr)
  }

  /** BaseMaterial3D.set_particles_anim_loop */
  final def setParticlesAnimLoop(loop: Boolean): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_particles_anim_loop == null) gdext.classes.BaseMaterial3D.mb_set_particles_anim_loop = MethodBind.get("BaseMaterial3D", "set_particles_anim_loop", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_particles_anim_loop, livePtr, loop)
  }

  /** BaseMaterial3D.get_particles_anim_loop */
  final def getParticlesAnimLoop(): Boolean = {
    if (gdext.classes.BaseMaterial3D.mb_get_particles_anim_loop == null) gdext.classes.BaseMaterial3D.mb_get_particles_anim_loop = MethodBind.get("BaseMaterial3D", "get_particles_anim_loop", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.BaseMaterial3D.mb_get_particles_anim_loop, livePtr)
  }

  /** BaseMaterial3D.set_heightmap_deep_parallax */
  final def setHeightmapDeepParallax(enable: Boolean): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_heightmap_deep_parallax == null) gdext.classes.BaseMaterial3D.mb_set_heightmap_deep_parallax = MethodBind.get("BaseMaterial3D", "set_heightmap_deep_parallax", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_heightmap_deep_parallax, livePtr, enable)
  }

  /** BaseMaterial3D.is_heightmap_deep_parallax_enabled */
  final def isHeightmapDeepParallaxEnabled(): Boolean = {
    if (gdext.classes.BaseMaterial3D.mb_is_heightmap_deep_parallax_enabled == null) gdext.classes.BaseMaterial3D.mb_is_heightmap_deep_parallax_enabled = MethodBind.get("BaseMaterial3D", "is_heightmap_deep_parallax_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.BaseMaterial3D.mb_is_heightmap_deep_parallax_enabled, livePtr)
  }

  /** BaseMaterial3D.set_heightmap_deep_parallax_min_layers */
  final def setHeightmapDeepParallaxMinLayers(layer: Long): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_heightmap_deep_parallax_min_layers == null) gdext.classes.BaseMaterial3D.mb_set_heightmap_deep_parallax_min_layers = MethodBind.get("BaseMaterial3D", "set_heightmap_deep_parallax_min_layers", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_heightmap_deep_parallax_min_layers, livePtr, layer)
  }

  /** BaseMaterial3D.get_heightmap_deep_parallax_min_layers */
  final def getHeightmapDeepParallaxMinLayers(): Long = {
    if (gdext.classes.BaseMaterial3D.mb_get_heightmap_deep_parallax_min_layers == null) gdext.classes.BaseMaterial3D.mb_get_heightmap_deep_parallax_min_layers = MethodBind.get("BaseMaterial3D", "get_heightmap_deep_parallax_min_layers", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.BaseMaterial3D.mb_get_heightmap_deep_parallax_min_layers, livePtr)
  }

  /** BaseMaterial3D.set_heightmap_deep_parallax_max_layers */
  final def setHeightmapDeepParallaxMaxLayers(layer: Long): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_heightmap_deep_parallax_max_layers == null) gdext.classes.BaseMaterial3D.mb_set_heightmap_deep_parallax_max_layers = MethodBind.get("BaseMaterial3D", "set_heightmap_deep_parallax_max_layers", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_heightmap_deep_parallax_max_layers, livePtr, layer)
  }

  /** BaseMaterial3D.get_heightmap_deep_parallax_max_layers */
  final def getHeightmapDeepParallaxMaxLayers(): Long = {
    if (gdext.classes.BaseMaterial3D.mb_get_heightmap_deep_parallax_max_layers == null) gdext.classes.BaseMaterial3D.mb_get_heightmap_deep_parallax_max_layers = MethodBind.get("BaseMaterial3D", "get_heightmap_deep_parallax_max_layers", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.BaseMaterial3D.mb_get_heightmap_deep_parallax_max_layers, livePtr)
  }

  /** BaseMaterial3D.set_heightmap_deep_parallax_flip_tangent */
  final def setHeightmapDeepParallaxFlipTangent(flip: Boolean): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_heightmap_deep_parallax_flip_tangent == null) gdext.classes.BaseMaterial3D.mb_set_heightmap_deep_parallax_flip_tangent = MethodBind.get("BaseMaterial3D", "set_heightmap_deep_parallax_flip_tangent", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_heightmap_deep_parallax_flip_tangent, livePtr, flip)
  }

  /** BaseMaterial3D.get_heightmap_deep_parallax_flip_tangent */
  final def getHeightmapDeepParallaxFlipTangent(): Boolean = {
    if (gdext.classes.BaseMaterial3D.mb_get_heightmap_deep_parallax_flip_tangent == null) gdext.classes.BaseMaterial3D.mb_get_heightmap_deep_parallax_flip_tangent = MethodBind.get("BaseMaterial3D", "get_heightmap_deep_parallax_flip_tangent", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.BaseMaterial3D.mb_get_heightmap_deep_parallax_flip_tangent, livePtr)
  }

  /** BaseMaterial3D.set_heightmap_deep_parallax_flip_binormal */
  final def setHeightmapDeepParallaxFlipBinormal(flip: Boolean): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_heightmap_deep_parallax_flip_binormal == null) gdext.classes.BaseMaterial3D.mb_set_heightmap_deep_parallax_flip_binormal = MethodBind.get("BaseMaterial3D", "set_heightmap_deep_parallax_flip_binormal", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_heightmap_deep_parallax_flip_binormal, livePtr, flip)
  }

  /** BaseMaterial3D.get_heightmap_deep_parallax_flip_binormal */
  final def getHeightmapDeepParallaxFlipBinormal(): Boolean = {
    if (gdext.classes.BaseMaterial3D.mb_get_heightmap_deep_parallax_flip_binormal == null) gdext.classes.BaseMaterial3D.mb_get_heightmap_deep_parallax_flip_binormal = MethodBind.get("BaseMaterial3D", "get_heightmap_deep_parallax_flip_binormal", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.BaseMaterial3D.mb_get_heightmap_deep_parallax_flip_binormal, livePtr)
  }

  /** BaseMaterial3D.set_grow */
  final def setGrow(amount: Double): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_grow == null) gdext.classes.BaseMaterial3D.mb_set_grow = MethodBind.get("BaseMaterial3D", "set_grow", 373806689L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_grow, livePtr, amount)
  }

  /** BaseMaterial3D.get_grow */
  final def getGrow(): Double = {
    if (gdext.classes.BaseMaterial3D.mb_get_grow == null) gdext.classes.BaseMaterial3D.mb_get_grow = MethodBind.get("BaseMaterial3D", "get_grow", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.BaseMaterial3D.mb_get_grow, livePtr)
  }

  /** BaseMaterial3D.set_emission_operator */
  final def setEmissionOperator(operator: Long): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_emission_operator == null) gdext.classes.BaseMaterial3D.mb_set_emission_operator = MethodBind.get("BaseMaterial3D", "set_emission_operator", 3825128922L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_emission_operator, livePtr, operator)
  }

  /** BaseMaterial3D.get_emission_operator */
  final def getEmissionOperator(): Long = {
    if (gdext.classes.BaseMaterial3D.mb_get_emission_operator == null) gdext.classes.BaseMaterial3D.mb_get_emission_operator = MethodBind.get("BaseMaterial3D", "get_emission_operator", 974205018L)
    Ptrcall.call0[Long](gdext.classes.BaseMaterial3D.mb_get_emission_operator, livePtr)
  }

  /** BaseMaterial3D.set_ao_light_affect */
  final def setAoLightAffect(amount: Double): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_ao_light_affect == null) gdext.classes.BaseMaterial3D.mb_set_ao_light_affect = MethodBind.get("BaseMaterial3D", "set_ao_light_affect", 373806689L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_ao_light_affect, livePtr, amount)
  }

  /** BaseMaterial3D.get_ao_light_affect */
  final def getAoLightAffect(): Double = {
    if (gdext.classes.BaseMaterial3D.mb_get_ao_light_affect == null) gdext.classes.BaseMaterial3D.mb_get_ao_light_affect = MethodBind.get("BaseMaterial3D", "get_ao_light_affect", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.BaseMaterial3D.mb_get_ao_light_affect, livePtr)
  }

  /** BaseMaterial3D.set_alpha_scissor_threshold */
  final def setAlphaScissorThreshold(threshold: Double): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_alpha_scissor_threshold == null) gdext.classes.BaseMaterial3D.mb_set_alpha_scissor_threshold = MethodBind.get("BaseMaterial3D", "set_alpha_scissor_threshold", 373806689L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_alpha_scissor_threshold, livePtr, threshold)
  }

  /** BaseMaterial3D.get_alpha_scissor_threshold */
  final def getAlphaScissorThreshold(): Double = {
    if (gdext.classes.BaseMaterial3D.mb_get_alpha_scissor_threshold == null) gdext.classes.BaseMaterial3D.mb_get_alpha_scissor_threshold = MethodBind.get("BaseMaterial3D", "get_alpha_scissor_threshold", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.BaseMaterial3D.mb_get_alpha_scissor_threshold, livePtr)
  }

  /** BaseMaterial3D.set_alpha_hash_scale */
  final def setAlphaHashScale(threshold: Double): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_alpha_hash_scale == null) gdext.classes.BaseMaterial3D.mb_set_alpha_hash_scale = MethodBind.get("BaseMaterial3D", "set_alpha_hash_scale", 373806689L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_alpha_hash_scale, livePtr, threshold)
  }

  /** BaseMaterial3D.get_alpha_hash_scale */
  final def getAlphaHashScale(): Double = {
    if (gdext.classes.BaseMaterial3D.mb_get_alpha_hash_scale == null) gdext.classes.BaseMaterial3D.mb_get_alpha_hash_scale = MethodBind.get("BaseMaterial3D", "get_alpha_hash_scale", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.BaseMaterial3D.mb_get_alpha_hash_scale, livePtr)
  }

  /** BaseMaterial3D.set_grow_enabled */
  final def setGrowEnabled(enable: Boolean): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_grow_enabled == null) gdext.classes.BaseMaterial3D.mb_set_grow_enabled = MethodBind.get("BaseMaterial3D", "set_grow_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_grow_enabled, livePtr, enable)
  }

  /** BaseMaterial3D.is_grow_enabled */
  final def isGrowEnabled(): Boolean = {
    if (gdext.classes.BaseMaterial3D.mb_is_grow_enabled == null) gdext.classes.BaseMaterial3D.mb_is_grow_enabled = MethodBind.get("BaseMaterial3D", "is_grow_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.BaseMaterial3D.mb_is_grow_enabled, livePtr)
  }

  /** BaseMaterial3D.set_metallic_texture_channel */
  final def setMetallicTextureChannel(channel: Long): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_metallic_texture_channel == null) gdext.classes.BaseMaterial3D.mb_set_metallic_texture_channel = MethodBind.get("BaseMaterial3D", "set_metallic_texture_channel", 744167988L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_metallic_texture_channel, livePtr, channel)
  }

  /** BaseMaterial3D.get_metallic_texture_channel */
  final def getMetallicTextureChannel(): Long = {
    if (gdext.classes.BaseMaterial3D.mb_get_metallic_texture_channel == null) gdext.classes.BaseMaterial3D.mb_get_metallic_texture_channel = MethodBind.get("BaseMaterial3D", "get_metallic_texture_channel", 568133867L)
    Ptrcall.call0[Long](gdext.classes.BaseMaterial3D.mb_get_metallic_texture_channel, livePtr)
  }

  /** BaseMaterial3D.set_roughness_texture_channel */
  final def setRoughnessTextureChannel(channel: Long): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_roughness_texture_channel == null) gdext.classes.BaseMaterial3D.mb_set_roughness_texture_channel = MethodBind.get("BaseMaterial3D", "set_roughness_texture_channel", 744167988L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_roughness_texture_channel, livePtr, channel)
  }

  /** BaseMaterial3D.get_roughness_texture_channel */
  final def getRoughnessTextureChannel(): Long = {
    if (gdext.classes.BaseMaterial3D.mb_get_roughness_texture_channel == null) gdext.classes.BaseMaterial3D.mb_get_roughness_texture_channel = MethodBind.get("BaseMaterial3D", "get_roughness_texture_channel", 568133867L)
    Ptrcall.call0[Long](gdext.classes.BaseMaterial3D.mb_get_roughness_texture_channel, livePtr)
  }

  /** BaseMaterial3D.set_ao_texture_channel */
  final def setAoTextureChannel(channel: Long): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_ao_texture_channel == null) gdext.classes.BaseMaterial3D.mb_set_ao_texture_channel = MethodBind.get("BaseMaterial3D", "set_ao_texture_channel", 744167988L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_ao_texture_channel, livePtr, channel)
  }

  /** BaseMaterial3D.get_ao_texture_channel */
  final def getAoTextureChannel(): Long = {
    if (gdext.classes.BaseMaterial3D.mb_get_ao_texture_channel == null) gdext.classes.BaseMaterial3D.mb_get_ao_texture_channel = MethodBind.get("BaseMaterial3D", "get_ao_texture_channel", 568133867L)
    Ptrcall.call0[Long](gdext.classes.BaseMaterial3D.mb_get_ao_texture_channel, livePtr)
  }

  /** BaseMaterial3D.set_refraction_texture_channel */
  final def setRefractionTextureChannel(channel: Long): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_refraction_texture_channel == null) gdext.classes.BaseMaterial3D.mb_set_refraction_texture_channel = MethodBind.get("BaseMaterial3D", "set_refraction_texture_channel", 744167988L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_refraction_texture_channel, livePtr, channel)
  }

  /** BaseMaterial3D.get_refraction_texture_channel */
  final def getRefractionTextureChannel(): Long = {
    if (gdext.classes.BaseMaterial3D.mb_get_refraction_texture_channel == null) gdext.classes.BaseMaterial3D.mb_get_refraction_texture_channel = MethodBind.get("BaseMaterial3D", "get_refraction_texture_channel", 568133867L)
    Ptrcall.call0[Long](gdext.classes.BaseMaterial3D.mb_get_refraction_texture_channel, livePtr)
  }

  /** BaseMaterial3D.set_proximity_fade_enabled */
  final def setProximityFadeEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_proximity_fade_enabled == null) gdext.classes.BaseMaterial3D.mb_set_proximity_fade_enabled = MethodBind.get("BaseMaterial3D", "set_proximity_fade_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_proximity_fade_enabled, livePtr, enabled)
  }

  /** BaseMaterial3D.is_proximity_fade_enabled */
  final def isProximityFadeEnabled(): Boolean = {
    if (gdext.classes.BaseMaterial3D.mb_is_proximity_fade_enabled == null) gdext.classes.BaseMaterial3D.mb_is_proximity_fade_enabled = MethodBind.get("BaseMaterial3D", "is_proximity_fade_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.BaseMaterial3D.mb_is_proximity_fade_enabled, livePtr)
  }

  /** BaseMaterial3D.set_proximity_fade_distance */
  final def setProximityFadeDistance(distance: Double): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_proximity_fade_distance == null) gdext.classes.BaseMaterial3D.mb_set_proximity_fade_distance = MethodBind.get("BaseMaterial3D", "set_proximity_fade_distance", 373806689L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_proximity_fade_distance, livePtr, distance)
  }

  /** BaseMaterial3D.get_proximity_fade_distance */
  final def getProximityFadeDistance(): Double = {
    if (gdext.classes.BaseMaterial3D.mb_get_proximity_fade_distance == null) gdext.classes.BaseMaterial3D.mb_get_proximity_fade_distance = MethodBind.get("BaseMaterial3D", "get_proximity_fade_distance", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.BaseMaterial3D.mb_get_proximity_fade_distance, livePtr)
  }

  /** BaseMaterial3D.set_msdf_pixel_range */
  final def setMsdfPixelRange(range: Double): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_msdf_pixel_range == null) gdext.classes.BaseMaterial3D.mb_set_msdf_pixel_range = MethodBind.get("BaseMaterial3D", "set_msdf_pixel_range", 373806689L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_msdf_pixel_range, livePtr, range)
  }

  /** BaseMaterial3D.get_msdf_pixel_range */
  final def getMsdfPixelRange(): Double = {
    if (gdext.classes.BaseMaterial3D.mb_get_msdf_pixel_range == null) gdext.classes.BaseMaterial3D.mb_get_msdf_pixel_range = MethodBind.get("BaseMaterial3D", "get_msdf_pixel_range", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.BaseMaterial3D.mb_get_msdf_pixel_range, livePtr)
  }

  /** BaseMaterial3D.set_msdf_outline_size */
  final def setMsdfOutlineSize(size: Double): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_msdf_outline_size == null) gdext.classes.BaseMaterial3D.mb_set_msdf_outline_size = MethodBind.get("BaseMaterial3D", "set_msdf_outline_size", 373806689L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_msdf_outline_size, livePtr, size)
  }

  /** BaseMaterial3D.get_msdf_outline_size */
  final def getMsdfOutlineSize(): Double = {
    if (gdext.classes.BaseMaterial3D.mb_get_msdf_outline_size == null) gdext.classes.BaseMaterial3D.mb_get_msdf_outline_size = MethodBind.get("BaseMaterial3D", "get_msdf_outline_size", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.BaseMaterial3D.mb_get_msdf_outline_size, livePtr)
  }

  /** BaseMaterial3D.set_distance_fade */
  final def setDistanceFade(mode: Long): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_distance_fade == null) gdext.classes.BaseMaterial3D.mb_set_distance_fade = MethodBind.get("BaseMaterial3D", "set_distance_fade", 1379478617L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_distance_fade, livePtr, mode)
  }

  /** BaseMaterial3D.get_distance_fade */
  final def getDistanceFade(): Long = {
    if (gdext.classes.BaseMaterial3D.mb_get_distance_fade == null) gdext.classes.BaseMaterial3D.mb_get_distance_fade = MethodBind.get("BaseMaterial3D", "get_distance_fade", 2694575734L)
    Ptrcall.call0[Long](gdext.classes.BaseMaterial3D.mb_get_distance_fade, livePtr)
  }

  /** BaseMaterial3D.set_distance_fade_max_distance */
  final def setDistanceFadeMaxDistance(distance: Double): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_distance_fade_max_distance == null) gdext.classes.BaseMaterial3D.mb_set_distance_fade_max_distance = MethodBind.get("BaseMaterial3D", "set_distance_fade_max_distance", 373806689L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_distance_fade_max_distance, livePtr, distance)
  }

  /** BaseMaterial3D.get_distance_fade_max_distance */
  final def getDistanceFadeMaxDistance(): Double = {
    if (gdext.classes.BaseMaterial3D.mb_get_distance_fade_max_distance == null) gdext.classes.BaseMaterial3D.mb_get_distance_fade_max_distance = MethodBind.get("BaseMaterial3D", "get_distance_fade_max_distance", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.BaseMaterial3D.mb_get_distance_fade_max_distance, livePtr)
  }

  /** BaseMaterial3D.set_distance_fade_min_distance */
  final def setDistanceFadeMinDistance(distance: Double): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_distance_fade_min_distance == null) gdext.classes.BaseMaterial3D.mb_set_distance_fade_min_distance = MethodBind.get("BaseMaterial3D", "set_distance_fade_min_distance", 373806689L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_distance_fade_min_distance, livePtr, distance)
  }

  /** BaseMaterial3D.get_distance_fade_min_distance */
  final def getDistanceFadeMinDistance(): Double = {
    if (gdext.classes.BaseMaterial3D.mb_get_distance_fade_min_distance == null) gdext.classes.BaseMaterial3D.mb_get_distance_fade_min_distance = MethodBind.get("BaseMaterial3D", "get_distance_fade_min_distance", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.BaseMaterial3D.mb_get_distance_fade_min_distance, livePtr)
  }

  /** BaseMaterial3D.set_z_clip_scale */
  final def setZClipScale(scale: Double): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_z_clip_scale == null) gdext.classes.BaseMaterial3D.mb_set_z_clip_scale = MethodBind.get("BaseMaterial3D", "set_z_clip_scale", 373806689L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_z_clip_scale, livePtr, scale)
  }

  /** BaseMaterial3D.get_z_clip_scale */
  final def getZClipScale(): Double = {
    if (gdext.classes.BaseMaterial3D.mb_get_z_clip_scale == null) gdext.classes.BaseMaterial3D.mb_get_z_clip_scale = MethodBind.get("BaseMaterial3D", "get_z_clip_scale", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.BaseMaterial3D.mb_get_z_clip_scale, livePtr)
  }

  /** BaseMaterial3D.set_fov_override */
  final def setFovOverride(scale: Double): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_fov_override == null) gdext.classes.BaseMaterial3D.mb_set_fov_override = MethodBind.get("BaseMaterial3D", "set_fov_override", 373806689L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_fov_override, livePtr, scale)
  }

  /** BaseMaterial3D.get_fov_override */
  final def getFovOverride(): Double = {
    if (gdext.classes.BaseMaterial3D.mb_get_fov_override == null) gdext.classes.BaseMaterial3D.mb_get_fov_override = MethodBind.get("BaseMaterial3D", "get_fov_override", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.BaseMaterial3D.mb_get_fov_override, livePtr)
  }

  /** BaseMaterial3D.set_stencil_mode */
  final def setStencilMode(stencil_mode: Long): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_stencil_mode == null) gdext.classes.BaseMaterial3D.mb_set_stencil_mode = MethodBind.get("BaseMaterial3D", "set_stencil_mode", 2272367200L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_stencil_mode, livePtr, stencil_mode)
  }

  /** BaseMaterial3D.get_stencil_mode */
  final def getStencilMode(): Long = {
    if (gdext.classes.BaseMaterial3D.mb_get_stencil_mode == null) gdext.classes.BaseMaterial3D.mb_get_stencil_mode = MethodBind.get("BaseMaterial3D", "get_stencil_mode", 2908443456L)
    Ptrcall.call0[Long](gdext.classes.BaseMaterial3D.mb_get_stencil_mode, livePtr)
  }

  /** BaseMaterial3D.set_stencil_flags */
  final def setStencilFlags(stencil_flags: Long): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_stencil_flags == null) gdext.classes.BaseMaterial3D.mb_set_stencil_flags = MethodBind.get("BaseMaterial3D", "set_stencil_flags", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_stencil_flags, livePtr, stencil_flags)
  }

  /** BaseMaterial3D.get_stencil_flags */
  final def getStencilFlags(): Long = {
    if (gdext.classes.BaseMaterial3D.mb_get_stencil_flags == null) gdext.classes.BaseMaterial3D.mb_get_stencil_flags = MethodBind.get("BaseMaterial3D", "get_stencil_flags", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.BaseMaterial3D.mb_get_stencil_flags, livePtr)
  }

  /** BaseMaterial3D.set_stencil_compare */
  final def setStencilCompare(stencil_compare: Long): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_stencil_compare == null) gdext.classes.BaseMaterial3D.mb_set_stencil_compare = MethodBind.get("BaseMaterial3D", "set_stencil_compare", 3741726481L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_stencil_compare, livePtr, stencil_compare)
  }

  /** BaseMaterial3D.get_stencil_compare */
  final def getStencilCompare(): Long = {
    if (gdext.classes.BaseMaterial3D.mb_get_stencil_compare == null) gdext.classes.BaseMaterial3D.mb_get_stencil_compare = MethodBind.get("BaseMaterial3D", "get_stencil_compare", 2824600492L)
    Ptrcall.call0[Long](gdext.classes.BaseMaterial3D.mb_get_stencil_compare, livePtr)
  }

  /** BaseMaterial3D.set_stencil_reference */
  final def setStencilReference(stencil_reference: Long): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_stencil_reference == null) gdext.classes.BaseMaterial3D.mb_set_stencil_reference = MethodBind.get("BaseMaterial3D", "set_stencil_reference", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_stencil_reference, livePtr, stencil_reference)
  }

  /** BaseMaterial3D.get_stencil_reference */
  final def getStencilReference(): Long = {
    if (gdext.classes.BaseMaterial3D.mb_get_stencil_reference == null) gdext.classes.BaseMaterial3D.mb_get_stencil_reference = MethodBind.get("BaseMaterial3D", "get_stencil_reference", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.BaseMaterial3D.mb_get_stencil_reference, livePtr)
  }

  /** BaseMaterial3D.set_stencil_effect_color */
  final def setStencilEffectColor(stencil_color: gdext.builtin.Color): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_stencil_effect_color == null) gdext.classes.BaseMaterial3D.mb_set_stencil_effect_color = MethodBind.get("BaseMaterial3D", "set_stencil_effect_color", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_stencil_effect_color, livePtr, stencil_color)
  }

  /** BaseMaterial3D.get_stencil_effect_color */
  final def getStencilEffectColor(): gdext.builtin.Color = {
    if (gdext.classes.BaseMaterial3D.mb_get_stencil_effect_color == null) gdext.classes.BaseMaterial3D.mb_get_stencil_effect_color = MethodBind.get("BaseMaterial3D", "get_stencil_effect_color", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.BaseMaterial3D.mb_get_stencil_effect_color, livePtr)
  }

  /** BaseMaterial3D.set_stencil_effect_outline_thickness */
  final def setStencilEffectOutlineThickness(stencil_outline_thickness: Double): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_stencil_effect_outline_thickness == null) gdext.classes.BaseMaterial3D.mb_set_stencil_effect_outline_thickness = MethodBind.get("BaseMaterial3D", "set_stencil_effect_outline_thickness", 373806689L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_stencil_effect_outline_thickness, livePtr, stencil_outline_thickness)
  }

  /** BaseMaterial3D.get_stencil_effect_outline_thickness */
  final def getStencilEffectOutlineThickness(): Double = {
    if (gdext.classes.BaseMaterial3D.mb_get_stencil_effect_outline_thickness == null) gdext.classes.BaseMaterial3D.mb_get_stencil_effect_outline_thickness = MethodBind.get("BaseMaterial3D", "get_stencil_effect_outline_thickness", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.BaseMaterial3D.mb_get_stencil_effect_outline_thickness, livePtr)
  }

}

object BaseMaterial3D {
  private[classes] var mb_set_albedo: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_albedo: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_transparency: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_transparency: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_alpha_antialiasing: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_alpha_antialiasing: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_alpha_antialiasing_edge: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_alpha_antialiasing_edge: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_shading_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_shading_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_specular: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_specular: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_metallic: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_metallic: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_roughness: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_roughness: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_emission: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_emission: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_emission_energy_multiplier: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_emission_energy_multiplier: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_emission_intensity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_emission_intensity: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_normal_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_normal_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_rim: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_rim: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_rim_tint: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_rim_tint: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_clearcoat: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_clearcoat: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_clearcoat_roughness: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_clearcoat_roughness: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_anisotropy: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_anisotropy: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_heightmap_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_heightmap_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_subsurface_scattering_strength: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_subsurface_scattering_strength: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_transmittance_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_transmittance_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_transmittance_depth: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_transmittance_depth: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_transmittance_boost: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_transmittance_boost: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_backlight: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_backlight: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_refraction: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_refraction: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_point_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_point_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_detail_uv: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_detail_uv: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_blend_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_blend_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_depth_draw_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_depth_draw_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_depth_test: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_depth_test: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_cull_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_cull_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_diffuse_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_diffuse_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_specular_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_specular_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_flag: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_flag: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_texture_filter: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture_filter: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_feature: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_feature: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_detail_blend_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_detail_blend_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_uv1_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_uv1_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_uv1_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_uv1_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_uv1_triplanar_blend_sharpness: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_uv1_triplanar_blend_sharpness: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_uv2_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_uv2_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_uv2_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_uv2_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_uv2_triplanar_blend_sharpness: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_uv2_triplanar_blend_sharpness: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_billboard_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_billboard_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_particles_anim_h_frames: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_particles_anim_h_frames: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_particles_anim_v_frames: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_particles_anim_v_frames: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_particles_anim_loop: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_particles_anim_loop: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_heightmap_deep_parallax: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_heightmap_deep_parallax_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_heightmap_deep_parallax_min_layers: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_heightmap_deep_parallax_min_layers: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_heightmap_deep_parallax_max_layers: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_heightmap_deep_parallax_max_layers: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_heightmap_deep_parallax_flip_tangent: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_heightmap_deep_parallax_flip_tangent: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_heightmap_deep_parallax_flip_binormal: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_heightmap_deep_parallax_flip_binormal: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_grow: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_grow: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_emission_operator: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_emission_operator: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_ao_light_affect: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_ao_light_affect: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_alpha_scissor_threshold: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_alpha_scissor_threshold: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_alpha_hash_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_alpha_hash_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_grow_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_grow_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_metallic_texture_channel: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_metallic_texture_channel: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_roughness_texture_channel: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_roughness_texture_channel: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_ao_texture_channel: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_ao_texture_channel: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_refraction_texture_channel: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_refraction_texture_channel: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_proximity_fade_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_proximity_fade_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_proximity_fade_distance: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_proximity_fade_distance: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_msdf_pixel_range: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_msdf_pixel_range: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_msdf_outline_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_msdf_outline_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_distance_fade: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_distance_fade: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_distance_fade_max_distance: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_distance_fade_max_distance: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_distance_fade_min_distance: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_distance_fade_min_distance: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_z_clip_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_z_clip_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_fov_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fov_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_stencil_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_stencil_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_stencil_flags: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_stencil_flags: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_stencil_compare: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_stencil_compare: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_stencil_reference: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_stencil_reference: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_stencil_effect_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_stencil_effect_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_stencil_effect_outline_thickness: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_stencil_effect_outline_thickness: GDExtensionMethodBindPtr = null
}
