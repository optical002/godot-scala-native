package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
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
  final def setTransparency(transparency: gdext.classes.BaseMaterial3D.Transparency): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_transparency == null) gdext.classes.BaseMaterial3D.mb_set_transparency = MethodBind.get("BaseMaterial3D", "set_transparency", 3435651667L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_transparency, livePtr, transparency)
  }

  /** BaseMaterial3D.get_transparency */
  final def getTransparency(): gdext.classes.BaseMaterial3D.Transparency = {
    if (gdext.classes.BaseMaterial3D.mb_get_transparency == null) gdext.classes.BaseMaterial3D.mb_get_transparency = MethodBind.get("BaseMaterial3D", "get_transparency", 990903061L)
    gdext.classes.BaseMaterial3D.Transparency(Ptrcall.call0[Long](gdext.classes.BaseMaterial3D.mb_get_transparency, livePtr))
  }

  /** BaseMaterial3D.set_alpha_antialiasing */
  final def setAlphaAntialiasing(alphaAa: gdext.classes.BaseMaterial3D.AlphaAntiAliasing): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_alpha_antialiasing == null) gdext.classes.BaseMaterial3D.mb_set_alpha_antialiasing = MethodBind.get("BaseMaterial3D", "set_alpha_antialiasing", 3212649852L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_alpha_antialiasing, livePtr, alphaAa)
  }

  /** BaseMaterial3D.get_alpha_antialiasing */
  final def getAlphaAntialiasing(): gdext.classes.BaseMaterial3D.AlphaAntiAliasing = {
    if (gdext.classes.BaseMaterial3D.mb_get_alpha_antialiasing == null) gdext.classes.BaseMaterial3D.mb_get_alpha_antialiasing = MethodBind.get("BaseMaterial3D", "get_alpha_antialiasing", 2889939400L)
    gdext.classes.BaseMaterial3D.AlphaAntiAliasing(Ptrcall.call0[Long](gdext.classes.BaseMaterial3D.mb_get_alpha_antialiasing, livePtr))
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
  final def setShadingMode(shadingMode: gdext.classes.BaseMaterial3D.ShadingMode): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_shading_mode == null) gdext.classes.BaseMaterial3D.mb_set_shading_mode = MethodBind.get("BaseMaterial3D", "set_shading_mode", 3368750322L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_shading_mode, livePtr, shadingMode)
  }

  /** BaseMaterial3D.get_shading_mode */
  final def getShadingMode(): gdext.classes.BaseMaterial3D.ShadingMode = {
    if (gdext.classes.BaseMaterial3D.mb_get_shading_mode == null) gdext.classes.BaseMaterial3D.mb_get_shading_mode = MethodBind.get("BaseMaterial3D", "get_shading_mode", 2132070559L)
    gdext.classes.BaseMaterial3D.ShadingMode(Ptrcall.call0[Long](gdext.classes.BaseMaterial3D.mb_get_shading_mode, livePtr))
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
  final def setEmissionEnergyMultiplier(emissionEnergyMultiplier: Double): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_emission_energy_multiplier == null) gdext.classes.BaseMaterial3D.mb_set_emission_energy_multiplier = MethodBind.get("BaseMaterial3D", "set_emission_energy_multiplier", 373806689L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_emission_energy_multiplier, livePtr, emissionEnergyMultiplier)
  }

  /** BaseMaterial3D.get_emission_energy_multiplier */
  final def getEmissionEnergyMultiplier(): Double = {
    if (gdext.classes.BaseMaterial3D.mb_get_emission_energy_multiplier == null) gdext.classes.BaseMaterial3D.mb_get_emission_energy_multiplier = MethodBind.get("BaseMaterial3D", "get_emission_energy_multiplier", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.BaseMaterial3D.mb_get_emission_energy_multiplier, livePtr)
  }

  /** BaseMaterial3D.set_emission_intensity */
  final def setEmissionIntensity(emissionEnergyMultiplier: Double): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_emission_intensity == null) gdext.classes.BaseMaterial3D.mb_set_emission_intensity = MethodBind.get("BaseMaterial3D", "set_emission_intensity", 373806689L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_emission_intensity, livePtr, emissionEnergyMultiplier)
  }

  /** BaseMaterial3D.get_emission_intensity */
  final def getEmissionIntensity(): Double = {
    if (gdext.classes.BaseMaterial3D.mb_get_emission_intensity == null) gdext.classes.BaseMaterial3D.mb_get_emission_intensity = MethodBind.get("BaseMaterial3D", "get_emission_intensity", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.BaseMaterial3D.mb_get_emission_intensity, livePtr)
  }

  /** BaseMaterial3D.set_normal_scale */
  final def setNormalScale(normalScale: Double): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_normal_scale == null) gdext.classes.BaseMaterial3D.mb_set_normal_scale = MethodBind.get("BaseMaterial3D", "set_normal_scale", 373806689L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_normal_scale, livePtr, normalScale)
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
  final def setRimTint(rimTint: Double): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_rim_tint == null) gdext.classes.BaseMaterial3D.mb_set_rim_tint = MethodBind.get("BaseMaterial3D", "set_rim_tint", 373806689L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_rim_tint, livePtr, rimTint)
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
  final def setClearcoatRoughness(clearcoatRoughness: Double): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_clearcoat_roughness == null) gdext.classes.BaseMaterial3D.mb_set_clearcoat_roughness = MethodBind.get("BaseMaterial3D", "set_clearcoat_roughness", 373806689L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_clearcoat_roughness, livePtr, clearcoatRoughness)
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
  final def setHeightmapScale(heightmapScale: Double): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_heightmap_scale == null) gdext.classes.BaseMaterial3D.mb_set_heightmap_scale = MethodBind.get("BaseMaterial3D", "set_heightmap_scale", 373806689L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_heightmap_scale, livePtr, heightmapScale)
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
  final def setPointSize(pointSize: Double): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_point_size == null) gdext.classes.BaseMaterial3D.mb_set_point_size = MethodBind.get("BaseMaterial3D", "set_point_size", 373806689L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_point_size, livePtr, pointSize)
  }

  /** BaseMaterial3D.get_point_size */
  final def getPointSize(): Double = {
    if (gdext.classes.BaseMaterial3D.mb_get_point_size == null) gdext.classes.BaseMaterial3D.mb_get_point_size = MethodBind.get("BaseMaterial3D", "get_point_size", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.BaseMaterial3D.mb_get_point_size, livePtr)
  }

  /** BaseMaterial3D.set_detail_uv */
  final def setDetailUv(detailUv: gdext.classes.BaseMaterial3D.DetailUV): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_detail_uv == null) gdext.classes.BaseMaterial3D.mb_set_detail_uv = MethodBind.get("BaseMaterial3D", "set_detail_uv", 456801921L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_detail_uv, livePtr, detailUv)
  }

  /** BaseMaterial3D.get_detail_uv */
  final def getDetailUv(): gdext.classes.BaseMaterial3D.DetailUV = {
    if (gdext.classes.BaseMaterial3D.mb_get_detail_uv == null) gdext.classes.BaseMaterial3D.mb_get_detail_uv = MethodBind.get("BaseMaterial3D", "get_detail_uv", 2306920512L)
    gdext.classes.BaseMaterial3D.DetailUV(Ptrcall.call0[Long](gdext.classes.BaseMaterial3D.mb_get_detail_uv, livePtr))
  }

  /** BaseMaterial3D.set_blend_mode */
  final def setBlendMode(blendMode: gdext.classes.BaseMaterial3D.BlendMode): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_blend_mode == null) gdext.classes.BaseMaterial3D.mb_set_blend_mode = MethodBind.get("BaseMaterial3D", "set_blend_mode", 2830186259L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_blend_mode, livePtr, blendMode)
  }

  /** BaseMaterial3D.get_blend_mode */
  final def getBlendMode(): gdext.classes.BaseMaterial3D.BlendMode = {
    if (gdext.classes.BaseMaterial3D.mb_get_blend_mode == null) gdext.classes.BaseMaterial3D.mb_get_blend_mode = MethodBind.get("BaseMaterial3D", "get_blend_mode", 4022690962L)
    gdext.classes.BaseMaterial3D.BlendMode(Ptrcall.call0[Long](gdext.classes.BaseMaterial3D.mb_get_blend_mode, livePtr))
  }

  /** BaseMaterial3D.set_depth_draw_mode */
  final def setDepthDrawMode(depthDrawMode: gdext.classes.BaseMaterial3D.DepthDrawMode): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_depth_draw_mode == null) gdext.classes.BaseMaterial3D.mb_set_depth_draw_mode = MethodBind.get("BaseMaterial3D", "set_depth_draw_mode", 1456584748L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_depth_draw_mode, livePtr, depthDrawMode)
  }

  /** BaseMaterial3D.get_depth_draw_mode */
  final def getDepthDrawMode(): gdext.classes.BaseMaterial3D.DepthDrawMode = {
    if (gdext.classes.BaseMaterial3D.mb_get_depth_draw_mode == null) gdext.classes.BaseMaterial3D.mb_get_depth_draw_mode = MethodBind.get("BaseMaterial3D", "get_depth_draw_mode", 2578197639L)
    gdext.classes.BaseMaterial3D.DepthDrawMode(Ptrcall.call0[Long](gdext.classes.BaseMaterial3D.mb_get_depth_draw_mode, livePtr))
  }

  /** BaseMaterial3D.set_depth_test */
  final def setDepthTest(depthTest: gdext.classes.BaseMaterial3D.DepthTest): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_depth_test == null) gdext.classes.BaseMaterial3D.mb_set_depth_test = MethodBind.get("BaseMaterial3D", "set_depth_test", 3918692338L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_depth_test, livePtr, depthTest)
  }

  /** BaseMaterial3D.get_depth_test */
  final def getDepthTest(): gdext.classes.BaseMaterial3D.DepthTest = {
    if (gdext.classes.BaseMaterial3D.mb_get_depth_test == null) gdext.classes.BaseMaterial3D.mb_get_depth_test = MethodBind.get("BaseMaterial3D", "get_depth_test", 3434785811L)
    gdext.classes.BaseMaterial3D.DepthTest(Ptrcall.call0[Long](gdext.classes.BaseMaterial3D.mb_get_depth_test, livePtr))
  }

  /** BaseMaterial3D.set_cull_mode */
  final def setCullMode(cullMode: gdext.classes.BaseMaterial3D.CullMode): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_cull_mode == null) gdext.classes.BaseMaterial3D.mb_set_cull_mode = MethodBind.get("BaseMaterial3D", "set_cull_mode", 2338909218L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_cull_mode, livePtr, cullMode)
  }

  /** BaseMaterial3D.get_cull_mode */
  final def getCullMode(): gdext.classes.BaseMaterial3D.CullMode = {
    if (gdext.classes.BaseMaterial3D.mb_get_cull_mode == null) gdext.classes.BaseMaterial3D.mb_get_cull_mode = MethodBind.get("BaseMaterial3D", "get_cull_mode", 1941499586L)
    gdext.classes.BaseMaterial3D.CullMode(Ptrcall.call0[Long](gdext.classes.BaseMaterial3D.mb_get_cull_mode, livePtr))
  }

  /** BaseMaterial3D.set_diffuse_mode */
  final def setDiffuseMode(diffuseMode: gdext.classes.BaseMaterial3D.DiffuseMode): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_diffuse_mode == null) gdext.classes.BaseMaterial3D.mb_set_diffuse_mode = MethodBind.get("BaseMaterial3D", "set_diffuse_mode", 1045299638L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_diffuse_mode, livePtr, diffuseMode)
  }

  /** BaseMaterial3D.get_diffuse_mode */
  final def getDiffuseMode(): gdext.classes.BaseMaterial3D.DiffuseMode = {
    if (gdext.classes.BaseMaterial3D.mb_get_diffuse_mode == null) gdext.classes.BaseMaterial3D.mb_get_diffuse_mode = MethodBind.get("BaseMaterial3D", "get_diffuse_mode", 3973617136L)
    gdext.classes.BaseMaterial3D.DiffuseMode(Ptrcall.call0[Long](gdext.classes.BaseMaterial3D.mb_get_diffuse_mode, livePtr))
  }

  /** BaseMaterial3D.set_specular_mode */
  final def setSpecularMode(specularMode: gdext.classes.BaseMaterial3D.SpecularMode): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_specular_mode == null) gdext.classes.BaseMaterial3D.mb_set_specular_mode = MethodBind.get("BaseMaterial3D", "set_specular_mode", 584737147L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_specular_mode, livePtr, specularMode)
  }

  /** BaseMaterial3D.get_specular_mode */
  final def getSpecularMode(): gdext.classes.BaseMaterial3D.SpecularMode = {
    if (gdext.classes.BaseMaterial3D.mb_get_specular_mode == null) gdext.classes.BaseMaterial3D.mb_get_specular_mode = MethodBind.get("BaseMaterial3D", "get_specular_mode", 2569953298L)
    gdext.classes.BaseMaterial3D.SpecularMode(Ptrcall.call0[Long](gdext.classes.BaseMaterial3D.mb_get_specular_mode, livePtr))
  }

  /** BaseMaterial3D.set_flag */
  final def setFlag(flag: gdext.classes.BaseMaterial3D.Flags, enable: Boolean): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_flag == null) gdext.classes.BaseMaterial3D.mb_set_flag = MethodBind.get("BaseMaterial3D", "set_flag", 3070159527L)
    Ptrcall.callVoid2(gdext.classes.BaseMaterial3D.mb_set_flag, livePtr, flag, enable)
  }

  /** BaseMaterial3D.get_flag */
  final def getFlag(flag: gdext.classes.BaseMaterial3D.Flags): Boolean = {
    if (gdext.classes.BaseMaterial3D.mb_get_flag == null) gdext.classes.BaseMaterial3D.mb_get_flag = MethodBind.get("BaseMaterial3D", "get_flag", 1286410065L)
    Ptrcall.call1[Long, Boolean](gdext.classes.BaseMaterial3D.mb_get_flag, livePtr, flag)
  }

  /** BaseMaterial3D.set_texture_filter */
  final def setTextureFilter(mode: gdext.classes.BaseMaterial3D.TextureFilter): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_texture_filter == null) gdext.classes.BaseMaterial3D.mb_set_texture_filter = MethodBind.get("BaseMaterial3D", "set_texture_filter", 22904437L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_texture_filter, livePtr, mode)
  }

  /** BaseMaterial3D.get_texture_filter */
  final def getTextureFilter(): gdext.classes.BaseMaterial3D.TextureFilter = {
    if (gdext.classes.BaseMaterial3D.mb_get_texture_filter == null) gdext.classes.BaseMaterial3D.mb_get_texture_filter = MethodBind.get("BaseMaterial3D", "get_texture_filter", 3289213076L)
    gdext.classes.BaseMaterial3D.TextureFilter(Ptrcall.call0[Long](gdext.classes.BaseMaterial3D.mb_get_texture_filter, livePtr))
  }

  /** BaseMaterial3D.set_feature */
  final def setFeature(feature: gdext.classes.BaseMaterial3D.Feature, enable: Boolean): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_feature == null) gdext.classes.BaseMaterial3D.mb_set_feature = MethodBind.get("BaseMaterial3D", "set_feature", 2819288693L)
    Ptrcall.callVoid2(gdext.classes.BaseMaterial3D.mb_set_feature, livePtr, feature, enable)
  }

  /** BaseMaterial3D.get_feature */
  final def getFeature(feature: gdext.classes.BaseMaterial3D.Feature): Boolean = {
    if (gdext.classes.BaseMaterial3D.mb_get_feature == null) gdext.classes.BaseMaterial3D.mb_get_feature = MethodBind.get("BaseMaterial3D", "get_feature", 1965241794L)
    Ptrcall.call1[Long, Boolean](gdext.classes.BaseMaterial3D.mb_get_feature, livePtr, feature)
  }

  /** BaseMaterial3D.set_texture */
  final def setTexture(param: gdext.classes.BaseMaterial3D.TextureParam, texture: Texture2D): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_texture == null) gdext.classes.BaseMaterial3D.mb_set_texture = MethodBind.get("BaseMaterial3D", "set_texture", 464208135L)
    Ptrcall.callVoid2(gdext.classes.BaseMaterial3D.mb_set_texture, livePtr, param, Wrappers.handle(texture))
  }

  /** BaseMaterial3D.get_texture. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getTexture(param: gdext.classes.BaseMaterial3D.TextureParam): Texture2D = {
    if (gdext.classes.BaseMaterial3D.mb_get_texture == null) gdext.classes.BaseMaterial3D.mb_get_texture = MethodBind.get("BaseMaterial3D", "get_texture", 329605813L)
    Wrappers.owned[Texture2D](Ptrcall.call1[Long, Long](gdext.classes.BaseMaterial3D.mb_get_texture, livePtr, param))
  }

  /** BaseMaterial3D.set_detail_blend_mode */
  final def setDetailBlendMode(detailBlendMode: gdext.classes.BaseMaterial3D.BlendMode): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_detail_blend_mode == null) gdext.classes.BaseMaterial3D.mb_set_detail_blend_mode = MethodBind.get("BaseMaterial3D", "set_detail_blend_mode", 2830186259L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_detail_blend_mode, livePtr, detailBlendMode)
  }

  /** BaseMaterial3D.get_detail_blend_mode */
  final def getDetailBlendMode(): gdext.classes.BaseMaterial3D.BlendMode = {
    if (gdext.classes.BaseMaterial3D.mb_get_detail_blend_mode == null) gdext.classes.BaseMaterial3D.mb_get_detail_blend_mode = MethodBind.get("BaseMaterial3D", "get_detail_blend_mode", 4022690962L)
    gdext.classes.BaseMaterial3D.BlendMode(Ptrcall.call0[Long](gdext.classes.BaseMaterial3D.mb_get_detail_blend_mode, livePtr))
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
  final def setBillboardMode(mode: gdext.classes.BaseMaterial3D.BillboardMode): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_billboard_mode == null) gdext.classes.BaseMaterial3D.mb_set_billboard_mode = MethodBind.get("BaseMaterial3D", "set_billboard_mode", 4202036497L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_billboard_mode, livePtr, mode)
  }

  /** BaseMaterial3D.get_billboard_mode */
  final def getBillboardMode(): gdext.classes.BaseMaterial3D.BillboardMode = {
    if (gdext.classes.BaseMaterial3D.mb_get_billboard_mode == null) gdext.classes.BaseMaterial3D.mb_get_billboard_mode = MethodBind.get("BaseMaterial3D", "get_billboard_mode", 1283840139L)
    gdext.classes.BaseMaterial3D.BillboardMode(Ptrcall.call0[Long](gdext.classes.BaseMaterial3D.mb_get_billboard_mode, livePtr))
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
  final def setEmissionOperator(operator: gdext.classes.BaseMaterial3D.EmissionOperator): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_emission_operator == null) gdext.classes.BaseMaterial3D.mb_set_emission_operator = MethodBind.get("BaseMaterial3D", "set_emission_operator", 3825128922L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_emission_operator, livePtr, operator)
  }

  /** BaseMaterial3D.get_emission_operator */
  final def getEmissionOperator(): gdext.classes.BaseMaterial3D.EmissionOperator = {
    if (gdext.classes.BaseMaterial3D.mb_get_emission_operator == null) gdext.classes.BaseMaterial3D.mb_get_emission_operator = MethodBind.get("BaseMaterial3D", "get_emission_operator", 974205018L)
    gdext.classes.BaseMaterial3D.EmissionOperator(Ptrcall.call0[Long](gdext.classes.BaseMaterial3D.mb_get_emission_operator, livePtr))
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
  final def setMetallicTextureChannel(channel: gdext.classes.BaseMaterial3D.TextureChannel): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_metallic_texture_channel == null) gdext.classes.BaseMaterial3D.mb_set_metallic_texture_channel = MethodBind.get("BaseMaterial3D", "set_metallic_texture_channel", 744167988L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_metallic_texture_channel, livePtr, channel)
  }

  /** BaseMaterial3D.get_metallic_texture_channel */
  final def getMetallicTextureChannel(): gdext.classes.BaseMaterial3D.TextureChannel = {
    if (gdext.classes.BaseMaterial3D.mb_get_metallic_texture_channel == null) gdext.classes.BaseMaterial3D.mb_get_metallic_texture_channel = MethodBind.get("BaseMaterial3D", "get_metallic_texture_channel", 568133867L)
    gdext.classes.BaseMaterial3D.TextureChannel(Ptrcall.call0[Long](gdext.classes.BaseMaterial3D.mb_get_metallic_texture_channel, livePtr))
  }

  /** BaseMaterial3D.set_roughness_texture_channel */
  final def setRoughnessTextureChannel(channel: gdext.classes.BaseMaterial3D.TextureChannel): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_roughness_texture_channel == null) gdext.classes.BaseMaterial3D.mb_set_roughness_texture_channel = MethodBind.get("BaseMaterial3D", "set_roughness_texture_channel", 744167988L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_roughness_texture_channel, livePtr, channel)
  }

  /** BaseMaterial3D.get_roughness_texture_channel */
  final def getRoughnessTextureChannel(): gdext.classes.BaseMaterial3D.TextureChannel = {
    if (gdext.classes.BaseMaterial3D.mb_get_roughness_texture_channel == null) gdext.classes.BaseMaterial3D.mb_get_roughness_texture_channel = MethodBind.get("BaseMaterial3D", "get_roughness_texture_channel", 568133867L)
    gdext.classes.BaseMaterial3D.TextureChannel(Ptrcall.call0[Long](gdext.classes.BaseMaterial3D.mb_get_roughness_texture_channel, livePtr))
  }

  /** BaseMaterial3D.set_ao_texture_channel */
  final def setAoTextureChannel(channel: gdext.classes.BaseMaterial3D.TextureChannel): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_ao_texture_channel == null) gdext.classes.BaseMaterial3D.mb_set_ao_texture_channel = MethodBind.get("BaseMaterial3D", "set_ao_texture_channel", 744167988L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_ao_texture_channel, livePtr, channel)
  }

  /** BaseMaterial3D.get_ao_texture_channel */
  final def getAoTextureChannel(): gdext.classes.BaseMaterial3D.TextureChannel = {
    if (gdext.classes.BaseMaterial3D.mb_get_ao_texture_channel == null) gdext.classes.BaseMaterial3D.mb_get_ao_texture_channel = MethodBind.get("BaseMaterial3D", "get_ao_texture_channel", 568133867L)
    gdext.classes.BaseMaterial3D.TextureChannel(Ptrcall.call0[Long](gdext.classes.BaseMaterial3D.mb_get_ao_texture_channel, livePtr))
  }

  /** BaseMaterial3D.set_refraction_texture_channel */
  final def setRefractionTextureChannel(channel: gdext.classes.BaseMaterial3D.TextureChannel): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_refraction_texture_channel == null) gdext.classes.BaseMaterial3D.mb_set_refraction_texture_channel = MethodBind.get("BaseMaterial3D", "set_refraction_texture_channel", 744167988L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_refraction_texture_channel, livePtr, channel)
  }

  /** BaseMaterial3D.get_refraction_texture_channel */
  final def getRefractionTextureChannel(): gdext.classes.BaseMaterial3D.TextureChannel = {
    if (gdext.classes.BaseMaterial3D.mb_get_refraction_texture_channel == null) gdext.classes.BaseMaterial3D.mb_get_refraction_texture_channel = MethodBind.get("BaseMaterial3D", "get_refraction_texture_channel", 568133867L)
    gdext.classes.BaseMaterial3D.TextureChannel(Ptrcall.call0[Long](gdext.classes.BaseMaterial3D.mb_get_refraction_texture_channel, livePtr))
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
  final def setDistanceFade(mode: gdext.classes.BaseMaterial3D.DistanceFadeMode): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_distance_fade == null) gdext.classes.BaseMaterial3D.mb_set_distance_fade = MethodBind.get("BaseMaterial3D", "set_distance_fade", 1379478617L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_distance_fade, livePtr, mode)
  }

  /** BaseMaterial3D.get_distance_fade */
  final def getDistanceFade(): gdext.classes.BaseMaterial3D.DistanceFadeMode = {
    if (gdext.classes.BaseMaterial3D.mb_get_distance_fade == null) gdext.classes.BaseMaterial3D.mb_get_distance_fade = MethodBind.get("BaseMaterial3D", "get_distance_fade", 2694575734L)
    gdext.classes.BaseMaterial3D.DistanceFadeMode(Ptrcall.call0[Long](gdext.classes.BaseMaterial3D.mb_get_distance_fade, livePtr))
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
  final def setStencilMode(stencilMode: gdext.classes.BaseMaterial3D.StencilMode): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_stencil_mode == null) gdext.classes.BaseMaterial3D.mb_set_stencil_mode = MethodBind.get("BaseMaterial3D", "set_stencil_mode", 2272367200L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_stencil_mode, livePtr, stencilMode)
  }

  /** BaseMaterial3D.get_stencil_mode */
  final def getStencilMode(): gdext.classes.BaseMaterial3D.StencilMode = {
    if (gdext.classes.BaseMaterial3D.mb_get_stencil_mode == null) gdext.classes.BaseMaterial3D.mb_get_stencil_mode = MethodBind.get("BaseMaterial3D", "get_stencil_mode", 2908443456L)
    gdext.classes.BaseMaterial3D.StencilMode(Ptrcall.call0[Long](gdext.classes.BaseMaterial3D.mb_get_stencil_mode, livePtr))
  }

  /** BaseMaterial3D.set_stencil_flags */
  final def setStencilFlags(stencilFlags: Long): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_stencil_flags == null) gdext.classes.BaseMaterial3D.mb_set_stencil_flags = MethodBind.get("BaseMaterial3D", "set_stencil_flags", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_stencil_flags, livePtr, stencilFlags)
  }

  /** BaseMaterial3D.get_stencil_flags */
  final def getStencilFlags(): Long = {
    if (gdext.classes.BaseMaterial3D.mb_get_stencil_flags == null) gdext.classes.BaseMaterial3D.mb_get_stencil_flags = MethodBind.get("BaseMaterial3D", "get_stencil_flags", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.BaseMaterial3D.mb_get_stencil_flags, livePtr)
  }

  /** BaseMaterial3D.set_stencil_compare */
  final def setStencilCompare(stencilCompare: gdext.classes.BaseMaterial3D.StencilCompare): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_stencil_compare == null) gdext.classes.BaseMaterial3D.mb_set_stencil_compare = MethodBind.get("BaseMaterial3D", "set_stencil_compare", 3741726481L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_stencil_compare, livePtr, stencilCompare)
  }

  /** BaseMaterial3D.get_stencil_compare */
  final def getStencilCompare(): gdext.classes.BaseMaterial3D.StencilCompare = {
    if (gdext.classes.BaseMaterial3D.mb_get_stencil_compare == null) gdext.classes.BaseMaterial3D.mb_get_stencil_compare = MethodBind.get("BaseMaterial3D", "get_stencil_compare", 2824600492L)
    gdext.classes.BaseMaterial3D.StencilCompare(Ptrcall.call0[Long](gdext.classes.BaseMaterial3D.mb_get_stencil_compare, livePtr))
  }

  /** BaseMaterial3D.set_stencil_reference */
  final def setStencilReference(stencilReference: Long): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_stencil_reference == null) gdext.classes.BaseMaterial3D.mb_set_stencil_reference = MethodBind.get("BaseMaterial3D", "set_stencil_reference", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_stencil_reference, livePtr, stencilReference)
  }

  /** BaseMaterial3D.get_stencil_reference */
  final def getStencilReference(): Long = {
    if (gdext.classes.BaseMaterial3D.mb_get_stencil_reference == null) gdext.classes.BaseMaterial3D.mb_get_stencil_reference = MethodBind.get("BaseMaterial3D", "get_stencil_reference", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.BaseMaterial3D.mb_get_stencil_reference, livePtr)
  }

  /** BaseMaterial3D.set_stencil_effect_color */
  final def setStencilEffectColor(stencilColor: gdext.builtin.Color): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_stencil_effect_color == null) gdext.classes.BaseMaterial3D.mb_set_stencil_effect_color = MethodBind.get("BaseMaterial3D", "set_stencil_effect_color", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_stencil_effect_color, livePtr, stencilColor)
  }

  /** BaseMaterial3D.get_stencil_effect_color */
  final def getStencilEffectColor(): gdext.builtin.Color = {
    if (gdext.classes.BaseMaterial3D.mb_get_stencil_effect_color == null) gdext.classes.BaseMaterial3D.mb_get_stencil_effect_color = MethodBind.get("BaseMaterial3D", "get_stencil_effect_color", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.BaseMaterial3D.mb_get_stencil_effect_color, livePtr)
  }

  /** BaseMaterial3D.set_stencil_effect_outline_thickness */
  final def setStencilEffectOutlineThickness(stencilOutlineThickness: Double): Unit = {
    if (gdext.classes.BaseMaterial3D.mb_set_stencil_effect_outline_thickness == null) gdext.classes.BaseMaterial3D.mb_set_stencil_effect_outline_thickness = MethodBind.get("BaseMaterial3D", "set_stencil_effect_outline_thickness", 373806689L)
    Ptrcall.callVoid1(gdext.classes.BaseMaterial3D.mb_set_stencil_effect_outline_thickness, livePtr, stencilOutlineThickness)
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

  /** Godot enum `BaseMaterial3D.TextureParam`. */
  opaque type TextureParam <: Long = Long

  object TextureParam {
    final val Albedo: TextureParam = 0L.asInstanceOf[TextureParam]
    final val Metallic: TextureParam = 1L.asInstanceOf[TextureParam]
    final val Roughness: TextureParam = 2L.asInstanceOf[TextureParam]
    final val Emission: TextureParam = 3L.asInstanceOf[TextureParam]
    final val Normal: TextureParam = 4L.asInstanceOf[TextureParam]
    final val BentNormal: TextureParam = 18L.asInstanceOf[TextureParam]
    final val Rim: TextureParam = 5L.asInstanceOf[TextureParam]
    final val Clearcoat: TextureParam = 6L.asInstanceOf[TextureParam]
    final val Flowmap: TextureParam = 7L.asInstanceOf[TextureParam]
    final val AmbientOcclusion: TextureParam = 8L.asInstanceOf[TextureParam]
    final val Heightmap: TextureParam = 9L.asInstanceOf[TextureParam]
    final val SubsurfaceScattering: TextureParam = 10L.asInstanceOf[TextureParam]
    final val SubsurfaceTransmittance: TextureParam = 11L.asInstanceOf[TextureParam]
    final val Backlight: TextureParam = 12L.asInstanceOf[TextureParam]
    final val Refraction: TextureParam = 13L.asInstanceOf[TextureParam]
    final val DetailMask: TextureParam = 14L.asInstanceOf[TextureParam]
    final val DetailAlbedo: TextureParam = 15L.asInstanceOf[TextureParam]
    final val DetailNormal: TextureParam = 16L.asInstanceOf[TextureParam]
    final val Orm: TextureParam = 17L.asInstanceOf[TextureParam]
    final val Max: TextureParam = 19L.asInstanceOf[TextureParam]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): TextureParam = value.asInstanceOf[TextureParam]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[TextureParam] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 11L, 12L, 13L, 14L, 15L, 16L, 17L, 18L, 19L).asInstanceOf[scala.IArray[TextureParam]]

    extension (self: TextureParam)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Albedo"
        case 1L => "Metallic"
        case 2L => "Roughness"
        case 3L => "Emission"
        case 4L => "Normal"
        case 5L => "Rim"
        case 6L => "Clearcoat"
        case 7L => "Flowmap"
        case 8L => "AmbientOcclusion"
        case 9L => "Heightmap"
        case 10L => "SubsurfaceScattering"
        case 11L => "SubsurfaceTransmittance"
        case 12L => "Backlight"
        case 13L => "Refraction"
        case 14L => "DetailMask"
        case 15L => "DetailAlbedo"
        case 16L => "DetailNormal"
        case 17L => "Orm"
        case 18L => "BentNormal"
        case 19L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `BaseMaterial3D.TextureFilter`. */
  opaque type TextureFilter <: Long = Long

  object TextureFilter {
    final val Nearest: TextureFilter = 0L.asInstanceOf[TextureFilter]
    final val Linear: TextureFilter = 1L.asInstanceOf[TextureFilter]
    final val NearestWithMipmaps: TextureFilter = 2L.asInstanceOf[TextureFilter]
    final val LinearWithMipmaps: TextureFilter = 3L.asInstanceOf[TextureFilter]
    final val NearestWithMipmapsAnisotropic: TextureFilter = 4L.asInstanceOf[TextureFilter]
    final val LinearWithMipmapsAnisotropic: TextureFilter = 5L.asInstanceOf[TextureFilter]
    final val Max: TextureFilter = 6L.asInstanceOf[TextureFilter]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): TextureFilter = value.asInstanceOf[TextureFilter]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[TextureFilter] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L).asInstanceOf[scala.IArray[TextureFilter]]

    extension (self: TextureFilter)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Nearest"
        case 1L => "Linear"
        case 2L => "NearestWithMipmaps"
        case 3L => "LinearWithMipmaps"
        case 4L => "NearestWithMipmapsAnisotropic"
        case 5L => "LinearWithMipmapsAnisotropic"
        case 6L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `BaseMaterial3D.DetailUV`. */
  opaque type DetailUV <: Long = Long

  object DetailUV {
    final val Uv1: DetailUV = 0L.asInstanceOf[DetailUV]
    final val Uv2: DetailUV = 1L.asInstanceOf[DetailUV]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): DetailUV = value.asInstanceOf[DetailUV]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[DetailUV] = scala.IArray[Long](0L, 1L).asInstanceOf[scala.IArray[DetailUV]]

    extension (self: DetailUV)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Uv1"
        case 1L => "Uv2"
        case other => other.toString
      }
  }

  /** Godot enum `BaseMaterial3D.Transparency`. */
  opaque type Transparency <: Long = Long

  object Transparency {
    final val Disabled: Transparency = 0L.asInstanceOf[Transparency]
    final val Alpha: Transparency = 1L.asInstanceOf[Transparency]
    final val AlphaScissor: Transparency = 2L.asInstanceOf[Transparency]
    final val AlphaHash: Transparency = 3L.asInstanceOf[Transparency]
    final val AlphaDepthPrePass: Transparency = 4L.asInstanceOf[Transparency]
    final val Max: Transparency = 5L.asInstanceOf[Transparency]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Transparency = value.asInstanceOf[Transparency]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Transparency] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L).asInstanceOf[scala.IArray[Transparency]]

    extension (self: Transparency)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Disabled"
        case 1L => "Alpha"
        case 2L => "AlphaScissor"
        case 3L => "AlphaHash"
        case 4L => "AlphaDepthPrePass"
        case 5L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `BaseMaterial3D.ShadingMode`. */
  opaque type ShadingMode <: Long = Long

  object ShadingMode {
    final val Unshaded: ShadingMode = 0L.asInstanceOf[ShadingMode]
    final val PerPixel: ShadingMode = 1L.asInstanceOf[ShadingMode]
    final val PerVertex: ShadingMode = 2L.asInstanceOf[ShadingMode]
    final val Max: ShadingMode = 3L.asInstanceOf[ShadingMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ShadingMode = value.asInstanceOf[ShadingMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ShadingMode] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[ShadingMode]]

    extension (self: ShadingMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Unshaded"
        case 1L => "PerPixel"
        case 2L => "PerVertex"
        case 3L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `BaseMaterial3D.Feature`. */
  opaque type Feature <: Long = Long

  object Feature {
    final val Emission: Feature = 0L.asInstanceOf[Feature]
    final val NormalMapping: Feature = 1L.asInstanceOf[Feature]
    final val Rim: Feature = 2L.asInstanceOf[Feature]
    final val Clearcoat: Feature = 3L.asInstanceOf[Feature]
    final val Anisotropy: Feature = 4L.asInstanceOf[Feature]
    final val AmbientOcclusion: Feature = 5L.asInstanceOf[Feature]
    final val HeightMapping: Feature = 6L.asInstanceOf[Feature]
    final val SubsurfaceScattering: Feature = 7L.asInstanceOf[Feature]
    final val SubsurfaceTransmittance: Feature = 8L.asInstanceOf[Feature]
    final val Backlight: Feature = 9L.asInstanceOf[Feature]
    final val Refraction: Feature = 10L.asInstanceOf[Feature]
    final val Detail: Feature = 11L.asInstanceOf[Feature]
    final val BentNormalMapping: Feature = 12L.asInstanceOf[Feature]
    final val Max: Feature = 13L.asInstanceOf[Feature]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Feature = value.asInstanceOf[Feature]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Feature] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 11L, 12L, 13L).asInstanceOf[scala.IArray[Feature]]

    extension (self: Feature)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Emission"
        case 1L => "NormalMapping"
        case 2L => "Rim"
        case 3L => "Clearcoat"
        case 4L => "Anisotropy"
        case 5L => "AmbientOcclusion"
        case 6L => "HeightMapping"
        case 7L => "SubsurfaceScattering"
        case 8L => "SubsurfaceTransmittance"
        case 9L => "Backlight"
        case 10L => "Refraction"
        case 11L => "Detail"
        case 12L => "BentNormalMapping"
        case 13L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `BaseMaterial3D.BlendMode`. */
  opaque type BlendMode <: Long = Long

  object BlendMode {
    final val Mix: BlendMode = 0L.asInstanceOf[BlendMode]
    final val Add: BlendMode = 1L.asInstanceOf[BlendMode]
    final val Sub: BlendMode = 2L.asInstanceOf[BlendMode]
    final val Mul: BlendMode = 3L.asInstanceOf[BlendMode]
    final val PremultAlpha: BlendMode = 4L.asInstanceOf[BlendMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): BlendMode = value.asInstanceOf[BlendMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[BlendMode] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L).asInstanceOf[scala.IArray[BlendMode]]

    extension (self: BlendMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Mix"
        case 1L => "Add"
        case 2L => "Sub"
        case 3L => "Mul"
        case 4L => "PremultAlpha"
        case other => other.toString
      }
  }

  /** Godot enum `BaseMaterial3D.AlphaAntiAliasing`. */
  opaque type AlphaAntiAliasing <: Long = Long

  object AlphaAntiAliasing {
    final val Off: AlphaAntiAliasing = 0L.asInstanceOf[AlphaAntiAliasing]
    final val AlphaToCoverage: AlphaAntiAliasing = 1L.asInstanceOf[AlphaAntiAliasing]
    final val AlphaToCoverageAndToOne: AlphaAntiAliasing = 2L.asInstanceOf[AlphaAntiAliasing]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): AlphaAntiAliasing = value.asInstanceOf[AlphaAntiAliasing]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[AlphaAntiAliasing] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[AlphaAntiAliasing]]

    extension (self: AlphaAntiAliasing)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Off"
        case 1L => "AlphaToCoverage"
        case 2L => "AlphaToCoverageAndToOne"
        case other => other.toString
      }
  }

  /** Godot enum `BaseMaterial3D.DepthDrawMode`. */
  opaque type DepthDrawMode <: Long = Long

  object DepthDrawMode {
    final val OpaqueOnly: DepthDrawMode = 0L.asInstanceOf[DepthDrawMode]
    final val Always: DepthDrawMode = 1L.asInstanceOf[DepthDrawMode]
    final val Disabled: DepthDrawMode = 2L.asInstanceOf[DepthDrawMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): DepthDrawMode = value.asInstanceOf[DepthDrawMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[DepthDrawMode] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[DepthDrawMode]]

    extension (self: DepthDrawMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "OpaqueOnly"
        case 1L => "Always"
        case 2L => "Disabled"
        case other => other.toString
      }
  }

  /** Godot enum `BaseMaterial3D.DepthTest`. */
  opaque type DepthTest <: Long = Long

  object DepthTest {
    final val Default: DepthTest = 0L.asInstanceOf[DepthTest]
    final val Inverted: DepthTest = 1L.asInstanceOf[DepthTest]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): DepthTest = value.asInstanceOf[DepthTest]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[DepthTest] = scala.IArray[Long](0L, 1L).asInstanceOf[scala.IArray[DepthTest]]

    extension (self: DepthTest)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Default"
        case 1L => "Inverted"
        case other => other.toString
      }
  }

  /** Godot enum `BaseMaterial3D.CullMode`. */
  opaque type CullMode <: Long = Long

  object CullMode {
    final val Back: CullMode = 0L.asInstanceOf[CullMode]
    final val Front: CullMode = 1L.asInstanceOf[CullMode]
    final val Disabled: CullMode = 2L.asInstanceOf[CullMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): CullMode = value.asInstanceOf[CullMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[CullMode] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[CullMode]]

    extension (self: CullMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Back"
        case 1L => "Front"
        case 2L => "Disabled"
        case other => other.toString
      }
  }

  /** Godot enum `BaseMaterial3D.Flags`. */
  opaque type Flags <: Long = Long

  object Flags {
    final val DisableDepthTest: Flags = 0L.asInstanceOf[Flags]
    final val AlbedoFromVertexColor: Flags = 1L.asInstanceOf[Flags]
    final val SrgbVertexColor: Flags = 2L.asInstanceOf[Flags]
    final val UsePointSize: Flags = 3L.asInstanceOf[Flags]
    final val FixedSize: Flags = 4L.asInstanceOf[Flags]
    final val BillboardKeepScale: Flags = 5L.asInstanceOf[Flags]
    final val Uv1UseTriplanar: Flags = 6L.asInstanceOf[Flags]
    final val Uv2UseTriplanar: Flags = 7L.asInstanceOf[Flags]
    final val Uv1UseWorldTriplanar: Flags = 8L.asInstanceOf[Flags]
    final val Uv2UseWorldTriplanar: Flags = 9L.asInstanceOf[Flags]
    final val AoOnUv2: Flags = 10L.asInstanceOf[Flags]
    final val EmissionOnUv2: Flags = 11L.asInstanceOf[Flags]
    final val AlbedoTextureForceSrgb: Flags = 12L.asInstanceOf[Flags]
    final val DontReceiveShadows: Flags = 13L.asInstanceOf[Flags]
    final val DisableAmbientLight: Flags = 14L.asInstanceOf[Flags]
    final val UseShadowToOpacity: Flags = 15L.asInstanceOf[Flags]
    final val UseTextureRepeat: Flags = 16L.asInstanceOf[Flags]
    final val InvertHeightmap: Flags = 17L.asInstanceOf[Flags]
    final val SubsurfaceModeSkin: Flags = 18L.asInstanceOf[Flags]
    final val ParticleTrailsMode: Flags = 19L.asInstanceOf[Flags]
    final val AlbedoTextureMsdf: Flags = 20L.asInstanceOf[Flags]
    final val DisableFog: Flags = 21L.asInstanceOf[Flags]
    final val DisableSpecularOcclusion: Flags = 22L.asInstanceOf[Flags]
    final val UseZClipScale: Flags = 23L.asInstanceOf[Flags]
    final val UseFovOverride: Flags = 24L.asInstanceOf[Flags]
    final val Max: Flags = 25L.asInstanceOf[Flags]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Flags = value.asInstanceOf[Flags]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Flags] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 11L, 12L, 13L, 14L, 15L, 16L, 17L, 18L, 19L, 20L, 21L, 22L, 23L, 24L, 25L).asInstanceOf[scala.IArray[Flags]]

    extension (self: Flags)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "DisableDepthTest"
        case 1L => "AlbedoFromVertexColor"
        case 2L => "SrgbVertexColor"
        case 3L => "UsePointSize"
        case 4L => "FixedSize"
        case 5L => "BillboardKeepScale"
        case 6L => "Uv1UseTriplanar"
        case 7L => "Uv2UseTriplanar"
        case 8L => "Uv1UseWorldTriplanar"
        case 9L => "Uv2UseWorldTriplanar"
        case 10L => "AoOnUv2"
        case 11L => "EmissionOnUv2"
        case 12L => "AlbedoTextureForceSrgb"
        case 13L => "DontReceiveShadows"
        case 14L => "DisableAmbientLight"
        case 15L => "UseShadowToOpacity"
        case 16L => "UseTextureRepeat"
        case 17L => "InvertHeightmap"
        case 18L => "SubsurfaceModeSkin"
        case 19L => "ParticleTrailsMode"
        case 20L => "AlbedoTextureMsdf"
        case 21L => "DisableFog"
        case 22L => "DisableSpecularOcclusion"
        case 23L => "UseZClipScale"
        case 24L => "UseFovOverride"
        case 25L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `BaseMaterial3D.DiffuseMode`. */
  opaque type DiffuseMode <: Long = Long

  object DiffuseMode {
    final val Burley: DiffuseMode = 0L.asInstanceOf[DiffuseMode]
    final val Lambert: DiffuseMode = 1L.asInstanceOf[DiffuseMode]
    final val LambertWrap: DiffuseMode = 2L.asInstanceOf[DiffuseMode]
    final val Toon: DiffuseMode = 3L.asInstanceOf[DiffuseMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): DiffuseMode = value.asInstanceOf[DiffuseMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[DiffuseMode] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[DiffuseMode]]

    extension (self: DiffuseMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Burley"
        case 1L => "Lambert"
        case 2L => "LambertWrap"
        case 3L => "Toon"
        case other => other.toString
      }
  }

  /** Godot enum `BaseMaterial3D.SpecularMode`. */
  opaque type SpecularMode <: Long = Long

  object SpecularMode {
    final val SchlickGgx: SpecularMode = 0L.asInstanceOf[SpecularMode]
    final val Toon: SpecularMode = 1L.asInstanceOf[SpecularMode]
    final val Disabled: SpecularMode = 2L.asInstanceOf[SpecularMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): SpecularMode = value.asInstanceOf[SpecularMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[SpecularMode] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[SpecularMode]]

    extension (self: SpecularMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "SchlickGgx"
        case 1L => "Toon"
        case 2L => "Disabled"
        case other => other.toString
      }
  }

  /** Godot enum `BaseMaterial3D.BillboardMode`. */
  opaque type BillboardMode <: Long = Long

  object BillboardMode {
    final val Disabled: BillboardMode = 0L.asInstanceOf[BillboardMode]
    final val Enabled: BillboardMode = 1L.asInstanceOf[BillboardMode]
    final val FixedY: BillboardMode = 2L.asInstanceOf[BillboardMode]
    final val Particles: BillboardMode = 3L.asInstanceOf[BillboardMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): BillboardMode = value.asInstanceOf[BillboardMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[BillboardMode] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[BillboardMode]]

    extension (self: BillboardMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Disabled"
        case 1L => "Enabled"
        case 2L => "FixedY"
        case 3L => "Particles"
        case other => other.toString
      }
  }

  /** Godot enum `BaseMaterial3D.TextureChannel`. */
  opaque type TextureChannel <: Long = Long

  object TextureChannel {
    final val Red: TextureChannel = 0L.asInstanceOf[TextureChannel]
    final val Green: TextureChannel = 1L.asInstanceOf[TextureChannel]
    final val Blue: TextureChannel = 2L.asInstanceOf[TextureChannel]
    final val Alpha: TextureChannel = 3L.asInstanceOf[TextureChannel]
    final val Grayscale: TextureChannel = 4L.asInstanceOf[TextureChannel]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): TextureChannel = value.asInstanceOf[TextureChannel]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[TextureChannel] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L).asInstanceOf[scala.IArray[TextureChannel]]

    extension (self: TextureChannel)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Red"
        case 1L => "Green"
        case 2L => "Blue"
        case 3L => "Alpha"
        case 4L => "Grayscale"
        case other => other.toString
      }
  }

  /** Godot enum `BaseMaterial3D.EmissionOperator`. */
  opaque type EmissionOperator <: Long = Long

  object EmissionOperator {
    final val Add: EmissionOperator = 0L.asInstanceOf[EmissionOperator]
    final val Multiply: EmissionOperator = 1L.asInstanceOf[EmissionOperator]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): EmissionOperator = value.asInstanceOf[EmissionOperator]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[EmissionOperator] = scala.IArray[Long](0L, 1L).asInstanceOf[scala.IArray[EmissionOperator]]

    extension (self: EmissionOperator)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Add"
        case 1L => "Multiply"
        case other => other.toString
      }
  }

  /** Godot enum `BaseMaterial3D.DistanceFadeMode`. */
  opaque type DistanceFadeMode <: Long = Long

  object DistanceFadeMode {
    final val Disabled: DistanceFadeMode = 0L.asInstanceOf[DistanceFadeMode]
    final val PixelAlpha: DistanceFadeMode = 1L.asInstanceOf[DistanceFadeMode]
    final val PixelDither: DistanceFadeMode = 2L.asInstanceOf[DistanceFadeMode]
    final val ObjectDither: DistanceFadeMode = 3L.asInstanceOf[DistanceFadeMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): DistanceFadeMode = value.asInstanceOf[DistanceFadeMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[DistanceFadeMode] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[DistanceFadeMode]]

    extension (self: DistanceFadeMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Disabled"
        case 1L => "PixelAlpha"
        case 2L => "PixelDither"
        case 3L => "ObjectDither"
        case other => other.toString
      }
  }

  /** Godot enum `BaseMaterial3D.StencilMode`. */
  opaque type StencilMode <: Long = Long

  object StencilMode {
    final val Disabled: StencilMode = 0L.asInstanceOf[StencilMode]
    final val Outline: StencilMode = 1L.asInstanceOf[StencilMode]
    final val Xray: StencilMode = 2L.asInstanceOf[StencilMode]
    final val Custom: StencilMode = 3L.asInstanceOf[StencilMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): StencilMode = value.asInstanceOf[StencilMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[StencilMode] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[StencilMode]]

    extension (self: StencilMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Disabled"
        case 1L => "Outline"
        case 2L => "Xray"
        case 3L => "Custom"
        case other => other.toString
      }
  }

  /** Godot enum `BaseMaterial3D.StencilFlags`. */
  opaque type StencilFlags <: Long = Long

  object StencilFlags {
    final val Read: StencilFlags = 1L.asInstanceOf[StencilFlags]
    final val Write: StencilFlags = 2L.asInstanceOf[StencilFlags]
    final val WriteDepthFail: StencilFlags = 4L.asInstanceOf[StencilFlags]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): StencilFlags = value.asInstanceOf[StencilFlags]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[StencilFlags] = scala.IArray[Long](1L, 2L, 4L).asInstanceOf[scala.IArray[StencilFlags]]

    extension (self: StencilFlags)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 1L => "Read"
        case 2L => "Write"
        case 4L => "WriteDepthFail"
        case other => other.toString
      }
  }

  /** Godot enum `BaseMaterial3D.StencilCompare`. */
  opaque type StencilCompare <: Long = Long

  object StencilCompare {
    final val Always: StencilCompare = 0L.asInstanceOf[StencilCompare]
    final val Less: StencilCompare = 1L.asInstanceOf[StencilCompare]
    final val Equal: StencilCompare = 2L.asInstanceOf[StencilCompare]
    final val LessOrEqual: StencilCompare = 3L.asInstanceOf[StencilCompare]
    final val Greater: StencilCompare = 4L.asInstanceOf[StencilCompare]
    final val NotEqual: StencilCompare = 5L.asInstanceOf[StencilCompare]
    final val GreaterOrEqual: StencilCompare = 6L.asInstanceOf[StencilCompare]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): StencilCompare = value.asInstanceOf[StencilCompare]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[StencilCompare] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L).asInstanceOf[scala.IArray[StencilCompare]]

    extension (self: StencilCompare)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Always"
        case 1L => "Less"
        case 2L => "Equal"
        case 3L => "LessOrEqual"
        case 4L => "Greater"
        case 5L => "NotEqual"
        case 6L => "GreaterOrEqual"
        case other => other.toString
      }
  }
}
