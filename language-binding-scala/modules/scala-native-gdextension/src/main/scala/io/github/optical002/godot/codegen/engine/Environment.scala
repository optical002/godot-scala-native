package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `Environment`, extends `Resource`. */
abstract class Environment extends Resource {

  /** Environment.set_background */
  final def setBackground(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_background", 4071623990L), hostObject.objectPtr, mode)

  /** Environment.get_background */
  final def getBackground(): Long =
    Ptrcall.call0[Long](MethodBind.get("Environment", "get_background", 1843210413L), hostObject.objectPtr)

  /** Environment.set_sky */
  final def setSky(sky: Sky): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_sky", 3336722921L), hostObject.objectPtr, sky.hostObject)

  /** Environment.get_sky */
  final def getSky(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Environment", "get_sky", 1177136966L), hostObject.objectPtr)

  /** Environment.set_sky_custom_fov */
  final def setSkyCustomFov(scale: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_sky_custom_fov", 373806689L), hostObject.objectPtr, scale)

  /** Environment.get_sky_custom_fov */
  final def getSkyCustomFov(): Double =
    Ptrcall.call0[Double](MethodBind.get("Environment", "get_sky_custom_fov", 1740695150L), hostObject.objectPtr)

  /** Environment.set_sky_rotation */
  final def setSkyRotation(euler_radians: io.github.optical002.godot.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_sky_rotation", 3460891852L), hostObject.objectPtr, euler_radians)

  /** Environment.get_sky_rotation */
  final def getSkyRotation(): io.github.optical002.godot.builtin.Vector3 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector3](MethodBind.get("Environment", "get_sky_rotation", 3360562783L), hostObject.objectPtr)

  /** Environment.set_bg_color */
  final def setBgColor(color: io.github.optical002.godot.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_bg_color", 2920490490L), hostObject.objectPtr, color)

  /** Environment.get_bg_color */
  final def getBgColor(): io.github.optical002.godot.builtin.Color =
    Ptrcall.call0[io.github.optical002.godot.builtin.Color](MethodBind.get("Environment", "get_bg_color", 3444240500L), hostObject.objectPtr)

  /** Environment.set_bg_energy_multiplier */
  final def setBgEnergyMultiplier(energy: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_bg_energy_multiplier", 373806689L), hostObject.objectPtr, energy)

  /** Environment.get_bg_energy_multiplier */
  final def getBgEnergyMultiplier(): Double =
    Ptrcall.call0[Double](MethodBind.get("Environment", "get_bg_energy_multiplier", 1740695150L), hostObject.objectPtr)

  /** Environment.set_bg_intensity */
  final def setBgIntensity(energy: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_bg_intensity", 373806689L), hostObject.objectPtr, energy)

  /** Environment.get_bg_intensity */
  final def getBgIntensity(): Double =
    Ptrcall.call0[Double](MethodBind.get("Environment", "get_bg_intensity", 1740695150L), hostObject.objectPtr)

  /** Environment.set_canvas_max_layer */
  final def setCanvasMaxLayer(layer: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_canvas_max_layer", 1286410249L), hostObject.objectPtr, layer)

  /** Environment.get_canvas_max_layer */
  final def getCanvasMaxLayer(): Long =
    Ptrcall.call0[Long](MethodBind.get("Environment", "get_canvas_max_layer", 3905245786L), hostObject.objectPtr)

  /** Environment.set_camera_feed_id */
  final def setCameraFeedId(id: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_camera_feed_id", 1286410249L), hostObject.objectPtr, id)

  /** Environment.get_camera_feed_id */
  final def getCameraFeedId(): Long =
    Ptrcall.call0[Long](MethodBind.get("Environment", "get_camera_feed_id", 3905245786L), hostObject.objectPtr)

  /** Environment.set_ambient_light_color */
  final def setAmbientLightColor(color: io.github.optical002.godot.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_ambient_light_color", 2920490490L), hostObject.objectPtr, color)

  /** Environment.get_ambient_light_color */
  final def getAmbientLightColor(): io.github.optical002.godot.builtin.Color =
    Ptrcall.call0[io.github.optical002.godot.builtin.Color](MethodBind.get("Environment", "get_ambient_light_color", 3444240500L), hostObject.objectPtr)

  /** Environment.set_ambient_source */
  final def setAmbientSource(source: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_ambient_source", 2607780160L), hostObject.objectPtr, source)

  /** Environment.get_ambient_source */
  final def getAmbientSource(): Long =
    Ptrcall.call0[Long](MethodBind.get("Environment", "get_ambient_source", 67453933L), hostObject.objectPtr)

  /** Environment.set_ambient_light_energy */
  final def setAmbientLightEnergy(energy: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_ambient_light_energy", 373806689L), hostObject.objectPtr, energy)

  /** Environment.get_ambient_light_energy */
  final def getAmbientLightEnergy(): Double =
    Ptrcall.call0[Double](MethodBind.get("Environment", "get_ambient_light_energy", 1740695150L), hostObject.objectPtr)

  /** Environment.set_ambient_light_sky_contribution */
  final def setAmbientLightSkyContribution(ratio: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_ambient_light_sky_contribution", 373806689L), hostObject.objectPtr, ratio)

  /** Environment.get_ambient_light_sky_contribution */
  final def getAmbientLightSkyContribution(): Double =
    Ptrcall.call0[Double](MethodBind.get("Environment", "get_ambient_light_sky_contribution", 1740695150L), hostObject.objectPtr)

  /** Environment.set_reflection_source */
  final def setReflectionSource(source: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_reflection_source", 299673197L), hostObject.objectPtr, source)

  /** Environment.get_reflection_source */
  final def getReflectionSource(): Long =
    Ptrcall.call0[Long](MethodBind.get("Environment", "get_reflection_source", 777700713L), hostObject.objectPtr)

  /** Environment.set_tonemapper */
  final def setTonemapper(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_tonemapper", 1509116664L), hostObject.objectPtr, mode)

  /** Environment.get_tonemapper */
  final def getTonemapper(): Long =
    Ptrcall.call0[Long](MethodBind.get("Environment", "get_tonemapper", 2908408137L), hostObject.objectPtr)

  /** Environment.set_tonemap_exposure */
  final def setTonemapExposure(exposure: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_tonemap_exposure", 373806689L), hostObject.objectPtr, exposure)

  /** Environment.get_tonemap_exposure */
  final def getTonemapExposure(): Double =
    Ptrcall.call0[Double](MethodBind.get("Environment", "get_tonemap_exposure", 1740695150L), hostObject.objectPtr)

  /** Environment.set_tonemap_white */
  final def setTonemapWhite(white: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_tonemap_white", 373806689L), hostObject.objectPtr, white)

  /** Environment.get_tonemap_white */
  final def getTonemapWhite(): Double =
    Ptrcall.call0[Double](MethodBind.get("Environment", "get_tonemap_white", 1740695150L), hostObject.objectPtr)

  /** Environment.set_tonemap_agx_white */
  final def setTonemapAgxWhite(white: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_tonemap_agx_white", 373806689L), hostObject.objectPtr, white)

  /** Environment.get_tonemap_agx_white */
  final def getTonemapAgxWhite(): Double =
    Ptrcall.call0[Double](MethodBind.get("Environment", "get_tonemap_agx_white", 1740695150L), hostObject.objectPtr)

  /** Environment.set_tonemap_agx_contrast */
  final def setTonemapAgxContrast(contrast: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_tonemap_agx_contrast", 373806689L), hostObject.objectPtr, contrast)

  /** Environment.get_tonemap_agx_contrast */
  final def getTonemapAgxContrast(): Double =
    Ptrcall.call0[Double](MethodBind.get("Environment", "get_tonemap_agx_contrast", 1740695150L), hostObject.objectPtr)

  /** Environment.set_ssr_enabled */
  final def setSsrEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_ssr_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** Environment.is_ssr_enabled */
  final def isSsrEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Environment", "is_ssr_enabled", 36873697L), hostObject.objectPtr)

  /** Environment.set_ssr_max_steps */
  final def setSsrMaxSteps(max_steps: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_ssr_max_steps", 1286410249L), hostObject.objectPtr, max_steps)

  /** Environment.get_ssr_max_steps */
  final def getSsrMaxSteps(): Long =
    Ptrcall.call0[Long](MethodBind.get("Environment", "get_ssr_max_steps", 3905245786L), hostObject.objectPtr)

  /** Environment.set_ssr_fade_in */
  final def setSsrFadeIn(fade_in: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_ssr_fade_in", 373806689L), hostObject.objectPtr, fade_in)

  /** Environment.get_ssr_fade_in */
  final def getSsrFadeIn(): Double =
    Ptrcall.call0[Double](MethodBind.get("Environment", "get_ssr_fade_in", 1740695150L), hostObject.objectPtr)

  /** Environment.set_ssr_fade_out */
  final def setSsrFadeOut(fade_out: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_ssr_fade_out", 373806689L), hostObject.objectPtr, fade_out)

  /** Environment.get_ssr_fade_out */
  final def getSsrFadeOut(): Double =
    Ptrcall.call0[Double](MethodBind.get("Environment", "get_ssr_fade_out", 1740695150L), hostObject.objectPtr)

  /** Environment.set_ssr_depth_tolerance */
  final def setSsrDepthTolerance(depth_tolerance: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_ssr_depth_tolerance", 373806689L), hostObject.objectPtr, depth_tolerance)

  /** Environment.get_ssr_depth_tolerance */
  final def getSsrDepthTolerance(): Double =
    Ptrcall.call0[Double](MethodBind.get("Environment", "get_ssr_depth_tolerance", 1740695150L), hostObject.objectPtr)

  /** Environment.set_ssao_enabled */
  final def setSsaoEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_ssao_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** Environment.is_ssao_enabled */
  final def isSsaoEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Environment", "is_ssao_enabled", 36873697L), hostObject.objectPtr)

  /** Environment.set_ssao_radius */
  final def setSsaoRadius(radius: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_ssao_radius", 373806689L), hostObject.objectPtr, radius)

  /** Environment.get_ssao_radius */
  final def getSsaoRadius(): Double =
    Ptrcall.call0[Double](MethodBind.get("Environment", "get_ssao_radius", 1740695150L), hostObject.objectPtr)

  /** Environment.set_ssao_intensity */
  final def setSsaoIntensity(intensity: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_ssao_intensity", 373806689L), hostObject.objectPtr, intensity)

  /** Environment.get_ssao_intensity */
  final def getSsaoIntensity(): Double =
    Ptrcall.call0[Double](MethodBind.get("Environment", "get_ssao_intensity", 1740695150L), hostObject.objectPtr)

  /** Environment.set_ssao_power */
  final def setSsaoPower(power: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_ssao_power", 373806689L), hostObject.objectPtr, power)

  /** Environment.get_ssao_power */
  final def getSsaoPower(): Double =
    Ptrcall.call0[Double](MethodBind.get("Environment", "get_ssao_power", 1740695150L), hostObject.objectPtr)

  /** Environment.set_ssao_detail */
  final def setSsaoDetail(detail: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_ssao_detail", 373806689L), hostObject.objectPtr, detail)

  /** Environment.get_ssao_detail */
  final def getSsaoDetail(): Double =
    Ptrcall.call0[Double](MethodBind.get("Environment", "get_ssao_detail", 1740695150L), hostObject.objectPtr)

  /** Environment.set_ssao_horizon */
  final def setSsaoHorizon(horizon: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_ssao_horizon", 373806689L), hostObject.objectPtr, horizon)

  /** Environment.get_ssao_horizon */
  final def getSsaoHorizon(): Double =
    Ptrcall.call0[Double](MethodBind.get("Environment", "get_ssao_horizon", 1740695150L), hostObject.objectPtr)

  /** Environment.set_ssao_sharpness */
  final def setSsaoSharpness(sharpness: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_ssao_sharpness", 373806689L), hostObject.objectPtr, sharpness)

  /** Environment.get_ssao_sharpness */
  final def getSsaoSharpness(): Double =
    Ptrcall.call0[Double](MethodBind.get("Environment", "get_ssao_sharpness", 1740695150L), hostObject.objectPtr)

  /** Environment.set_ssao_direct_light_affect */
  final def setSsaoDirectLightAffect(amount: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_ssao_direct_light_affect", 373806689L), hostObject.objectPtr, amount)

  /** Environment.get_ssao_direct_light_affect */
  final def getSsaoDirectLightAffect(): Double =
    Ptrcall.call0[Double](MethodBind.get("Environment", "get_ssao_direct_light_affect", 1740695150L), hostObject.objectPtr)

  /** Environment.set_ssao_ao_channel_affect */
  final def setSsaoAoChannelAffect(amount: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_ssao_ao_channel_affect", 373806689L), hostObject.objectPtr, amount)

  /** Environment.get_ssao_ao_channel_affect */
  final def getSsaoAoChannelAffect(): Double =
    Ptrcall.call0[Double](MethodBind.get("Environment", "get_ssao_ao_channel_affect", 1740695150L), hostObject.objectPtr)

  /** Environment.set_ssil_enabled */
  final def setSsilEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_ssil_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** Environment.is_ssil_enabled */
  final def isSsilEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Environment", "is_ssil_enabled", 36873697L), hostObject.objectPtr)

  /** Environment.set_ssil_radius */
  final def setSsilRadius(radius: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_ssil_radius", 373806689L), hostObject.objectPtr, radius)

  /** Environment.get_ssil_radius */
  final def getSsilRadius(): Double =
    Ptrcall.call0[Double](MethodBind.get("Environment", "get_ssil_radius", 1740695150L), hostObject.objectPtr)

  /** Environment.set_ssil_intensity */
  final def setSsilIntensity(intensity: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_ssil_intensity", 373806689L), hostObject.objectPtr, intensity)

  /** Environment.get_ssil_intensity */
  final def getSsilIntensity(): Double =
    Ptrcall.call0[Double](MethodBind.get("Environment", "get_ssil_intensity", 1740695150L), hostObject.objectPtr)

  /** Environment.set_ssil_sharpness */
  final def setSsilSharpness(sharpness: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_ssil_sharpness", 373806689L), hostObject.objectPtr, sharpness)

  /** Environment.get_ssil_sharpness */
  final def getSsilSharpness(): Double =
    Ptrcall.call0[Double](MethodBind.get("Environment", "get_ssil_sharpness", 1740695150L), hostObject.objectPtr)

  /** Environment.set_ssil_normal_rejection */
  final def setSsilNormalRejection(normal_rejection: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_ssil_normal_rejection", 373806689L), hostObject.objectPtr, normal_rejection)

  /** Environment.get_ssil_normal_rejection */
  final def getSsilNormalRejection(): Double =
    Ptrcall.call0[Double](MethodBind.get("Environment", "get_ssil_normal_rejection", 1740695150L), hostObject.objectPtr)

  /** Environment.set_sdfgi_enabled */
  final def setSdfgiEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_sdfgi_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** Environment.is_sdfgi_enabled */
  final def isSdfgiEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Environment", "is_sdfgi_enabled", 36873697L), hostObject.objectPtr)

  /** Environment.set_sdfgi_cascades */
  final def setSdfgiCascades(amount: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_sdfgi_cascades", 1286410249L), hostObject.objectPtr, amount)

  /** Environment.get_sdfgi_cascades */
  final def getSdfgiCascades(): Long =
    Ptrcall.call0[Long](MethodBind.get("Environment", "get_sdfgi_cascades", 3905245786L), hostObject.objectPtr)

  /** Environment.set_sdfgi_min_cell_size */
  final def setSdfgiMinCellSize(size: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_sdfgi_min_cell_size", 373806689L), hostObject.objectPtr, size)

  /** Environment.get_sdfgi_min_cell_size */
  final def getSdfgiMinCellSize(): Double =
    Ptrcall.call0[Double](MethodBind.get("Environment", "get_sdfgi_min_cell_size", 1740695150L), hostObject.objectPtr)

  /** Environment.set_sdfgi_max_distance */
  final def setSdfgiMaxDistance(distance: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_sdfgi_max_distance", 373806689L), hostObject.objectPtr, distance)

  /** Environment.get_sdfgi_max_distance */
  final def getSdfgiMaxDistance(): Double =
    Ptrcall.call0[Double](MethodBind.get("Environment", "get_sdfgi_max_distance", 1740695150L), hostObject.objectPtr)

  /** Environment.set_sdfgi_cascade0_distance */
  final def setSdfgiCascade0Distance(distance: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_sdfgi_cascade0_distance", 373806689L), hostObject.objectPtr, distance)

  /** Environment.get_sdfgi_cascade0_distance */
  final def getSdfgiCascade0Distance(): Double =
    Ptrcall.call0[Double](MethodBind.get("Environment", "get_sdfgi_cascade0_distance", 1740695150L), hostObject.objectPtr)

  /** Environment.set_sdfgi_y_scale */
  final def setSdfgiYScale(scale: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_sdfgi_y_scale", 3608608372L), hostObject.objectPtr, scale)

  /** Environment.get_sdfgi_y_scale */
  final def getSdfgiYScale(): Long =
    Ptrcall.call0[Long](MethodBind.get("Environment", "get_sdfgi_y_scale", 2568002245L), hostObject.objectPtr)

  /** Environment.set_sdfgi_use_occlusion */
  final def setSdfgiUseOcclusion(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_sdfgi_use_occlusion", 2586408642L), hostObject.objectPtr, enable)

  /** Environment.is_sdfgi_using_occlusion */
  final def isSdfgiUsingOcclusion(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Environment", "is_sdfgi_using_occlusion", 36873697L), hostObject.objectPtr)

  /** Environment.set_sdfgi_bounce_feedback */
  final def setSdfgiBounceFeedback(amount: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_sdfgi_bounce_feedback", 373806689L), hostObject.objectPtr, amount)

  /** Environment.get_sdfgi_bounce_feedback */
  final def getSdfgiBounceFeedback(): Double =
    Ptrcall.call0[Double](MethodBind.get("Environment", "get_sdfgi_bounce_feedback", 1740695150L), hostObject.objectPtr)

  /** Environment.set_sdfgi_read_sky_light */
  final def setSdfgiReadSkyLight(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_sdfgi_read_sky_light", 2586408642L), hostObject.objectPtr, enable)

  /** Environment.is_sdfgi_reading_sky_light */
  final def isSdfgiReadingSkyLight(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Environment", "is_sdfgi_reading_sky_light", 36873697L), hostObject.objectPtr)

  /** Environment.set_sdfgi_energy */
  final def setSdfgiEnergy(amount: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_sdfgi_energy", 373806689L), hostObject.objectPtr, amount)

  /** Environment.get_sdfgi_energy */
  final def getSdfgiEnergy(): Double =
    Ptrcall.call0[Double](MethodBind.get("Environment", "get_sdfgi_energy", 1740695150L), hostObject.objectPtr)

  /** Environment.set_sdfgi_normal_bias */
  final def setSdfgiNormalBias(bias: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_sdfgi_normal_bias", 373806689L), hostObject.objectPtr, bias)

  /** Environment.get_sdfgi_normal_bias */
  final def getSdfgiNormalBias(): Double =
    Ptrcall.call0[Double](MethodBind.get("Environment", "get_sdfgi_normal_bias", 1740695150L), hostObject.objectPtr)

  /** Environment.set_sdfgi_probe_bias */
  final def setSdfgiProbeBias(bias: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_sdfgi_probe_bias", 373806689L), hostObject.objectPtr, bias)

  /** Environment.get_sdfgi_probe_bias */
  final def getSdfgiProbeBias(): Double =
    Ptrcall.call0[Double](MethodBind.get("Environment", "get_sdfgi_probe_bias", 1740695150L), hostObject.objectPtr)

  /** Environment.set_glow_enabled */
  final def setGlowEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_glow_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** Environment.is_glow_enabled */
  final def isGlowEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Environment", "is_glow_enabled", 36873697L), hostObject.objectPtr)

  /** Environment.set_glow_level */
  final def setGlowLevel(idx: Long, intensity: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("Environment", "set_glow_level", 1602489585L), hostObject.objectPtr, idx, intensity)

  /** Environment.get_glow_level */
  final def getGlowLevel(idx: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("Environment", "get_glow_level", 2339986948L), hostObject.objectPtr, idx)

  /** Environment.set_glow_normalized */
  final def setGlowNormalized(normalize: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_glow_normalized", 2586408642L), hostObject.objectPtr, normalize)

  /** Environment.is_glow_normalized */
  final def isGlowNormalized(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Environment", "is_glow_normalized", 36873697L), hostObject.objectPtr)

  /** Environment.set_glow_intensity */
  final def setGlowIntensity(intensity: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_glow_intensity", 373806689L), hostObject.objectPtr, intensity)

  /** Environment.get_glow_intensity */
  final def getGlowIntensity(): Double =
    Ptrcall.call0[Double](MethodBind.get("Environment", "get_glow_intensity", 1740695150L), hostObject.objectPtr)

  /** Environment.set_glow_strength */
  final def setGlowStrength(strength: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_glow_strength", 373806689L), hostObject.objectPtr, strength)

  /** Environment.get_glow_strength */
  final def getGlowStrength(): Double =
    Ptrcall.call0[Double](MethodBind.get("Environment", "get_glow_strength", 1740695150L), hostObject.objectPtr)

  /** Environment.set_glow_mix */
  final def setGlowMix(mix: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_glow_mix", 373806689L), hostObject.objectPtr, mix)

  /** Environment.get_glow_mix */
  final def getGlowMix(): Double =
    Ptrcall.call0[Double](MethodBind.get("Environment", "get_glow_mix", 1740695150L), hostObject.objectPtr)

  /** Environment.set_glow_bloom */
  final def setGlowBloom(amount: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_glow_bloom", 373806689L), hostObject.objectPtr, amount)

  /** Environment.get_glow_bloom */
  final def getGlowBloom(): Double =
    Ptrcall.call0[Double](MethodBind.get("Environment", "get_glow_bloom", 1740695150L), hostObject.objectPtr)

  /** Environment.set_glow_blend_mode */
  final def setGlowBlendMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_glow_blend_mode", 2561587761L), hostObject.objectPtr, mode)

  /** Environment.get_glow_blend_mode */
  final def getGlowBlendMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("Environment", "get_glow_blend_mode", 1529667332L), hostObject.objectPtr)

  /** Environment.set_glow_hdr_bleed_threshold */
  final def setGlowHdrBleedThreshold(threshold: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_glow_hdr_bleed_threshold", 373806689L), hostObject.objectPtr, threshold)

  /** Environment.get_glow_hdr_bleed_threshold */
  final def getGlowHdrBleedThreshold(): Double =
    Ptrcall.call0[Double](MethodBind.get("Environment", "get_glow_hdr_bleed_threshold", 1740695150L), hostObject.objectPtr)

  /** Environment.set_glow_hdr_bleed_scale */
  final def setGlowHdrBleedScale(scale: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_glow_hdr_bleed_scale", 373806689L), hostObject.objectPtr, scale)

  /** Environment.get_glow_hdr_bleed_scale */
  final def getGlowHdrBleedScale(): Double =
    Ptrcall.call0[Double](MethodBind.get("Environment", "get_glow_hdr_bleed_scale", 1740695150L), hostObject.objectPtr)

  /** Environment.set_glow_hdr_luminance_cap */
  final def setGlowHdrLuminanceCap(amount: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_glow_hdr_luminance_cap", 373806689L), hostObject.objectPtr, amount)

  /** Environment.get_glow_hdr_luminance_cap */
  final def getGlowHdrLuminanceCap(): Double =
    Ptrcall.call0[Double](MethodBind.get("Environment", "get_glow_hdr_luminance_cap", 1740695150L), hostObject.objectPtr)

  /** Environment.set_glow_map_strength */
  final def setGlowMapStrength(strength: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_glow_map_strength", 373806689L), hostObject.objectPtr, strength)

  /** Environment.get_glow_map_strength */
  final def getGlowMapStrength(): Double =
    Ptrcall.call0[Double](MethodBind.get("Environment", "get_glow_map_strength", 1740695150L), hostObject.objectPtr)

  /** Environment.set_glow_map */
  final def setGlowMap(mode: Texture): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_glow_map", 1790811099L), hostObject.objectPtr, mode.hostObject)

  /** Environment.get_glow_map */
  final def getGlowMap(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Environment", "get_glow_map", 4037048985L), hostObject.objectPtr)

  /** Environment.set_fog_enabled */
  final def setFogEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_fog_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** Environment.is_fog_enabled */
  final def isFogEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Environment", "is_fog_enabled", 36873697L), hostObject.objectPtr)

  /** Environment.set_fog_mode */
  final def setFogMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_fog_mode", 3059806579L), hostObject.objectPtr, mode)

  /** Environment.get_fog_mode */
  final def getFogMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("Environment", "get_fog_mode", 2456062483L), hostObject.objectPtr)

  /** Environment.set_fog_light_color */
  final def setFogLightColor(light_color: io.github.optical002.godot.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_fog_light_color", 2920490490L), hostObject.objectPtr, light_color)

  /** Environment.get_fog_light_color */
  final def getFogLightColor(): io.github.optical002.godot.builtin.Color =
    Ptrcall.call0[io.github.optical002.godot.builtin.Color](MethodBind.get("Environment", "get_fog_light_color", 3444240500L), hostObject.objectPtr)

  /** Environment.set_fog_light_energy */
  final def setFogLightEnergy(light_energy: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_fog_light_energy", 373806689L), hostObject.objectPtr, light_energy)

  /** Environment.get_fog_light_energy */
  final def getFogLightEnergy(): Double =
    Ptrcall.call0[Double](MethodBind.get("Environment", "get_fog_light_energy", 1740695150L), hostObject.objectPtr)

  /** Environment.set_fog_sun_scatter */
  final def setFogSunScatter(sun_scatter: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_fog_sun_scatter", 373806689L), hostObject.objectPtr, sun_scatter)

  /** Environment.get_fog_sun_scatter */
  final def getFogSunScatter(): Double =
    Ptrcall.call0[Double](MethodBind.get("Environment", "get_fog_sun_scatter", 1740695150L), hostObject.objectPtr)

  /** Environment.set_fog_density */
  final def setFogDensity(density: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_fog_density", 373806689L), hostObject.objectPtr, density)

  /** Environment.get_fog_density */
  final def getFogDensity(): Double =
    Ptrcall.call0[Double](MethodBind.get("Environment", "get_fog_density", 1740695150L), hostObject.objectPtr)

  /** Environment.set_fog_height */
  final def setFogHeight(height: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_fog_height", 373806689L), hostObject.objectPtr, height)

  /** Environment.get_fog_height */
  final def getFogHeight(): Double =
    Ptrcall.call0[Double](MethodBind.get("Environment", "get_fog_height", 1740695150L), hostObject.objectPtr)

  /** Environment.set_fog_height_density */
  final def setFogHeightDensity(height_density: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_fog_height_density", 373806689L), hostObject.objectPtr, height_density)

  /** Environment.get_fog_height_density */
  final def getFogHeightDensity(): Double =
    Ptrcall.call0[Double](MethodBind.get("Environment", "get_fog_height_density", 1740695150L), hostObject.objectPtr)

  /** Environment.set_fog_aerial_perspective */
  final def setFogAerialPerspective(aerial_perspective: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_fog_aerial_perspective", 373806689L), hostObject.objectPtr, aerial_perspective)

  /** Environment.get_fog_aerial_perspective */
  final def getFogAerialPerspective(): Double =
    Ptrcall.call0[Double](MethodBind.get("Environment", "get_fog_aerial_perspective", 1740695150L), hostObject.objectPtr)

  /** Environment.set_fog_sky_affect */
  final def setFogSkyAffect(sky_affect: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_fog_sky_affect", 373806689L), hostObject.objectPtr, sky_affect)

  /** Environment.get_fog_sky_affect */
  final def getFogSkyAffect(): Double =
    Ptrcall.call0[Double](MethodBind.get("Environment", "get_fog_sky_affect", 1740695150L), hostObject.objectPtr)

  /** Environment.set_fog_depth_curve */
  final def setFogDepthCurve(curve: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_fog_depth_curve", 373806689L), hostObject.objectPtr, curve)

  /** Environment.get_fog_depth_curve */
  final def getFogDepthCurve(): Double =
    Ptrcall.call0[Double](MethodBind.get("Environment", "get_fog_depth_curve", 1740695150L), hostObject.objectPtr)

  /** Environment.set_fog_depth_begin */
  final def setFogDepthBegin(begin: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_fog_depth_begin", 373806689L), hostObject.objectPtr, begin)

  /** Environment.get_fog_depth_begin */
  final def getFogDepthBegin(): Double =
    Ptrcall.call0[Double](MethodBind.get("Environment", "get_fog_depth_begin", 1740695150L), hostObject.objectPtr)

  /** Environment.set_fog_depth_end */
  final def setFogDepthEnd(end: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_fog_depth_end", 373806689L), hostObject.objectPtr, end)

  /** Environment.get_fog_depth_end */
  final def getFogDepthEnd(): Double =
    Ptrcall.call0[Double](MethodBind.get("Environment", "get_fog_depth_end", 1740695150L), hostObject.objectPtr)

  /** Environment.set_volumetric_fog_enabled */
  final def setVolumetricFogEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_volumetric_fog_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** Environment.is_volumetric_fog_enabled */
  final def isVolumetricFogEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Environment", "is_volumetric_fog_enabled", 36873697L), hostObject.objectPtr)

  /** Environment.set_volumetric_fog_emission */
  final def setVolumetricFogEmission(color: io.github.optical002.godot.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_volumetric_fog_emission", 2920490490L), hostObject.objectPtr, color)

  /** Environment.get_volumetric_fog_emission */
  final def getVolumetricFogEmission(): io.github.optical002.godot.builtin.Color =
    Ptrcall.call0[io.github.optical002.godot.builtin.Color](MethodBind.get("Environment", "get_volumetric_fog_emission", 3444240500L), hostObject.objectPtr)

  /** Environment.set_volumetric_fog_albedo */
  final def setVolumetricFogAlbedo(color: io.github.optical002.godot.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_volumetric_fog_albedo", 2920490490L), hostObject.objectPtr, color)

  /** Environment.get_volumetric_fog_albedo */
  final def getVolumetricFogAlbedo(): io.github.optical002.godot.builtin.Color =
    Ptrcall.call0[io.github.optical002.godot.builtin.Color](MethodBind.get("Environment", "get_volumetric_fog_albedo", 3444240500L), hostObject.objectPtr)

  /** Environment.set_volumetric_fog_density */
  final def setVolumetricFogDensity(density: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_volumetric_fog_density", 373806689L), hostObject.objectPtr, density)

  /** Environment.get_volumetric_fog_density */
  final def getVolumetricFogDensity(): Double =
    Ptrcall.call0[Double](MethodBind.get("Environment", "get_volumetric_fog_density", 1740695150L), hostObject.objectPtr)

  /** Environment.set_volumetric_fog_emission_energy */
  final def setVolumetricFogEmissionEnergy(begin: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_volumetric_fog_emission_energy", 373806689L), hostObject.objectPtr, begin)

  /** Environment.get_volumetric_fog_emission_energy */
  final def getVolumetricFogEmissionEnergy(): Double =
    Ptrcall.call0[Double](MethodBind.get("Environment", "get_volumetric_fog_emission_energy", 1740695150L), hostObject.objectPtr)

  /** Environment.set_volumetric_fog_anisotropy */
  final def setVolumetricFogAnisotropy(anisotropy: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_volumetric_fog_anisotropy", 373806689L), hostObject.objectPtr, anisotropy)

  /** Environment.get_volumetric_fog_anisotropy */
  final def getVolumetricFogAnisotropy(): Double =
    Ptrcall.call0[Double](MethodBind.get("Environment", "get_volumetric_fog_anisotropy", 1740695150L), hostObject.objectPtr)

  /** Environment.set_volumetric_fog_length */
  final def setVolumetricFogLength(length: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_volumetric_fog_length", 373806689L), hostObject.objectPtr, length)

  /** Environment.get_volumetric_fog_length */
  final def getVolumetricFogLength(): Double =
    Ptrcall.call0[Double](MethodBind.get("Environment", "get_volumetric_fog_length", 1740695150L), hostObject.objectPtr)

  /** Environment.set_volumetric_fog_detail_spread */
  final def setVolumetricFogDetailSpread(detail_spread: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_volumetric_fog_detail_spread", 373806689L), hostObject.objectPtr, detail_spread)

  /** Environment.get_volumetric_fog_detail_spread */
  final def getVolumetricFogDetailSpread(): Double =
    Ptrcall.call0[Double](MethodBind.get("Environment", "get_volumetric_fog_detail_spread", 1740695150L), hostObject.objectPtr)

  /** Environment.set_volumetric_fog_gi_inject */
  final def setVolumetricFogGiInject(gi_inject: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_volumetric_fog_gi_inject", 373806689L), hostObject.objectPtr, gi_inject)

  /** Environment.get_volumetric_fog_gi_inject */
  final def getVolumetricFogGiInject(): Double =
    Ptrcall.call0[Double](MethodBind.get("Environment", "get_volumetric_fog_gi_inject", 1740695150L), hostObject.objectPtr)

  /** Environment.set_volumetric_fog_ambient_inject */
  final def setVolumetricFogAmbientInject(enabled: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_volumetric_fog_ambient_inject", 373806689L), hostObject.objectPtr, enabled)

  /** Environment.get_volumetric_fog_ambient_inject */
  final def getVolumetricFogAmbientInject(): Double =
    Ptrcall.call0[Double](MethodBind.get("Environment", "get_volumetric_fog_ambient_inject", 1740695150L), hostObject.objectPtr)

  /** Environment.set_volumetric_fog_sky_affect */
  final def setVolumetricFogSkyAffect(sky_affect: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_volumetric_fog_sky_affect", 373806689L), hostObject.objectPtr, sky_affect)

  /** Environment.get_volumetric_fog_sky_affect */
  final def getVolumetricFogSkyAffect(): Double =
    Ptrcall.call0[Double](MethodBind.get("Environment", "get_volumetric_fog_sky_affect", 1740695150L), hostObject.objectPtr)

  /** Environment.set_volumetric_fog_temporal_reprojection_enabled */
  final def setVolumetricFogTemporalReprojectionEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_volumetric_fog_temporal_reprojection_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** Environment.is_volumetric_fog_temporal_reprojection_enabled */
  final def isVolumetricFogTemporalReprojectionEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Environment", "is_volumetric_fog_temporal_reprojection_enabled", 36873697L), hostObject.objectPtr)

  /** Environment.set_volumetric_fog_temporal_reprojection_amount */
  final def setVolumetricFogTemporalReprojectionAmount(temporal_reprojection_amount: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_volumetric_fog_temporal_reprojection_amount", 373806689L), hostObject.objectPtr, temporal_reprojection_amount)

  /** Environment.get_volumetric_fog_temporal_reprojection_amount */
  final def getVolumetricFogTemporalReprojectionAmount(): Double =
    Ptrcall.call0[Double](MethodBind.get("Environment", "get_volumetric_fog_temporal_reprojection_amount", 1740695150L), hostObject.objectPtr)

  /** Environment.set_adjustment_enabled */
  final def setAdjustmentEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_adjustment_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** Environment.is_adjustment_enabled */
  final def isAdjustmentEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Environment", "is_adjustment_enabled", 36873697L), hostObject.objectPtr)

  /** Environment.set_adjustment_brightness */
  final def setAdjustmentBrightness(brightness: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_adjustment_brightness", 373806689L), hostObject.objectPtr, brightness)

  /** Environment.get_adjustment_brightness */
  final def getAdjustmentBrightness(): Double =
    Ptrcall.call0[Double](MethodBind.get("Environment", "get_adjustment_brightness", 1740695150L), hostObject.objectPtr)

  /** Environment.set_adjustment_contrast */
  final def setAdjustmentContrast(contrast: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_adjustment_contrast", 373806689L), hostObject.objectPtr, contrast)

  /** Environment.get_adjustment_contrast */
  final def getAdjustmentContrast(): Double =
    Ptrcall.call0[Double](MethodBind.get("Environment", "get_adjustment_contrast", 1740695150L), hostObject.objectPtr)

  /** Environment.set_adjustment_saturation */
  final def setAdjustmentSaturation(saturation: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_adjustment_saturation", 373806689L), hostObject.objectPtr, saturation)

  /** Environment.get_adjustment_saturation */
  final def getAdjustmentSaturation(): Double =
    Ptrcall.call0[Double](MethodBind.get("Environment", "get_adjustment_saturation", 1740695150L), hostObject.objectPtr)

  /** Environment.set_adjustment_color_correction */
  final def setAdjustmentColorCorrection(color_correction: Texture): Unit =
    Ptrcall.callVoid1(MethodBind.get("Environment", "set_adjustment_color_correction", 1790811099L), hostObject.objectPtr, color_correction.hostObject)

  /** Environment.get_adjustment_color_correction */
  final def getAdjustmentColorCorrection(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Environment", "get_adjustment_color_correction", 4037048985L), hostObject.objectPtr)

}

object Environment {
  /** Class metadata for Gd[Environment] lifetime management and casting. */
  given GodotClass[Environment] with {
    def className = "Environment"
    def isRefCounted = true
    def wrap(o: GodotObject): Environment = new Environment {}.withHost(o.objectPtr)
    def unwrap(t: Environment): GodotObject = t.hostObject
  }
}
