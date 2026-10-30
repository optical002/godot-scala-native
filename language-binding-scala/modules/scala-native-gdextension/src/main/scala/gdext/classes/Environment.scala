package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Environment`, extends `Resource`. */
abstract class Environment extends Resource {
  override def godotClassName: String = "Environment"

  /** Environment.set_background */
  final def setBackground(mode: gdext.classes.Environment.BGMode): Unit = {
    if (gdext.classes.Environment.mb_set_background == null) gdext.classes.Environment.mb_set_background = MethodBind.get("Environment", "set_background", 4071623990L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_background, livePtr, mode)
  }

  /** Environment.get_background */
  final def getBackground(): gdext.classes.Environment.BGMode = {
    if (gdext.classes.Environment.mb_get_background == null) gdext.classes.Environment.mb_get_background = MethodBind.get("Environment", "get_background", 1843210413L)
    gdext.classes.Environment.BGMode(Ptrcall.call0[Long](gdext.classes.Environment.mb_get_background, livePtr))
  }

  /** Environment.set_sky */
  final def setSky(sky: Sky): Unit = {
    if (gdext.classes.Environment.mb_set_sky == null) gdext.classes.Environment.mb_set_sky = MethodBind.get("Environment", "set_sky", 3336722921L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_sky, livePtr, Wrappers.handle(sky))
  }

  /** Environment.get_sky. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getSky(): Sky = {
    if (gdext.classes.Environment.mb_get_sky == null) gdext.classes.Environment.mb_get_sky = MethodBind.get("Environment", "get_sky", 1177136966L)
    Wrappers.owned[Sky](Ptrcall.call0[Long](gdext.classes.Environment.mb_get_sky, livePtr))
  }

  /** Environment.set_sky_custom_fov */
  final def setSkyCustomFov(scale: Double): Unit = {
    if (gdext.classes.Environment.mb_set_sky_custom_fov == null) gdext.classes.Environment.mb_set_sky_custom_fov = MethodBind.get("Environment", "set_sky_custom_fov", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_sky_custom_fov, livePtr, scale)
  }

  /** Environment.get_sky_custom_fov */
  final def getSkyCustomFov(): Double = {
    if (gdext.classes.Environment.mb_get_sky_custom_fov == null) gdext.classes.Environment.mb_get_sky_custom_fov = MethodBind.get("Environment", "get_sky_custom_fov", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Environment.mb_get_sky_custom_fov, livePtr)
  }

  /** Environment.set_sky_rotation */
  final def setSkyRotation(eulerRadians: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.Environment.mb_set_sky_rotation == null) gdext.classes.Environment.mb_set_sky_rotation = MethodBind.get("Environment", "set_sky_rotation", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_sky_rotation, livePtr, eulerRadians)
  }

  /** Environment.get_sky_rotation */
  final def getSkyRotation(): gdext.builtin.Vector3 = {
    if (gdext.classes.Environment.mb_get_sky_rotation == null) gdext.classes.Environment.mb_get_sky_rotation = MethodBind.get("Environment", "get_sky_rotation", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.Environment.mb_get_sky_rotation, livePtr)
  }

  /** Environment.set_bg_color */
  final def setBgColor(color: gdext.builtin.Color): Unit = {
    if (gdext.classes.Environment.mb_set_bg_color == null) gdext.classes.Environment.mb_set_bg_color = MethodBind.get("Environment", "set_bg_color", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_bg_color, livePtr, color)
  }

  /** Environment.get_bg_color */
  final def getBgColor(): gdext.builtin.Color = {
    if (gdext.classes.Environment.mb_get_bg_color == null) gdext.classes.Environment.mb_get_bg_color = MethodBind.get("Environment", "get_bg_color", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.Environment.mb_get_bg_color, livePtr)
  }

  /** Environment.set_bg_energy_multiplier */
  final def setBgEnergyMultiplier(energy: Double): Unit = {
    if (gdext.classes.Environment.mb_set_bg_energy_multiplier == null) gdext.classes.Environment.mb_set_bg_energy_multiplier = MethodBind.get("Environment", "set_bg_energy_multiplier", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_bg_energy_multiplier, livePtr, energy)
  }

  /** Environment.get_bg_energy_multiplier */
  final def getBgEnergyMultiplier(): Double = {
    if (gdext.classes.Environment.mb_get_bg_energy_multiplier == null) gdext.classes.Environment.mb_get_bg_energy_multiplier = MethodBind.get("Environment", "get_bg_energy_multiplier", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Environment.mb_get_bg_energy_multiplier, livePtr)
  }

  /** Environment.set_bg_intensity */
  final def setBgIntensity(energy: Double): Unit = {
    if (gdext.classes.Environment.mb_set_bg_intensity == null) gdext.classes.Environment.mb_set_bg_intensity = MethodBind.get("Environment", "set_bg_intensity", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_bg_intensity, livePtr, energy)
  }

  /** Environment.get_bg_intensity */
  final def getBgIntensity(): Double = {
    if (gdext.classes.Environment.mb_get_bg_intensity == null) gdext.classes.Environment.mb_get_bg_intensity = MethodBind.get("Environment", "get_bg_intensity", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Environment.mb_get_bg_intensity, livePtr)
  }

  /** Environment.set_canvas_max_layer */
  final def setCanvasMaxLayer(layer: Long): Unit = {
    if (gdext.classes.Environment.mb_set_canvas_max_layer == null) gdext.classes.Environment.mb_set_canvas_max_layer = MethodBind.get("Environment", "set_canvas_max_layer", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_canvas_max_layer, livePtr, layer)
  }

  /** Environment.get_canvas_max_layer */
  final def getCanvasMaxLayer(): Long = {
    if (gdext.classes.Environment.mb_get_canvas_max_layer == null) gdext.classes.Environment.mb_get_canvas_max_layer = MethodBind.get("Environment", "get_canvas_max_layer", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Environment.mb_get_canvas_max_layer, livePtr)
  }

  /** Environment.set_camera_feed_id */
  final def setCameraFeedId(id: Long): Unit = {
    if (gdext.classes.Environment.mb_set_camera_feed_id == null) gdext.classes.Environment.mb_set_camera_feed_id = MethodBind.get("Environment", "set_camera_feed_id", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_camera_feed_id, livePtr, id)
  }

  /** Environment.get_camera_feed_id */
  final def getCameraFeedId(): Long = {
    if (gdext.classes.Environment.mb_get_camera_feed_id == null) gdext.classes.Environment.mb_get_camera_feed_id = MethodBind.get("Environment", "get_camera_feed_id", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Environment.mb_get_camera_feed_id, livePtr)
  }

  /** Environment.set_ambient_light_color */
  final def setAmbientLightColor(color: gdext.builtin.Color): Unit = {
    if (gdext.classes.Environment.mb_set_ambient_light_color == null) gdext.classes.Environment.mb_set_ambient_light_color = MethodBind.get("Environment", "set_ambient_light_color", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_ambient_light_color, livePtr, color)
  }

  /** Environment.get_ambient_light_color */
  final def getAmbientLightColor(): gdext.builtin.Color = {
    if (gdext.classes.Environment.mb_get_ambient_light_color == null) gdext.classes.Environment.mb_get_ambient_light_color = MethodBind.get("Environment", "get_ambient_light_color", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.Environment.mb_get_ambient_light_color, livePtr)
  }

  /** Environment.set_ambient_source */
  final def setAmbientSource(source: gdext.classes.Environment.AmbientSource): Unit = {
    if (gdext.classes.Environment.mb_set_ambient_source == null) gdext.classes.Environment.mb_set_ambient_source = MethodBind.get("Environment", "set_ambient_source", 2607780160L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_ambient_source, livePtr, source)
  }

  /** Environment.get_ambient_source */
  final def getAmbientSource(): gdext.classes.Environment.AmbientSource = {
    if (gdext.classes.Environment.mb_get_ambient_source == null) gdext.classes.Environment.mb_get_ambient_source = MethodBind.get("Environment", "get_ambient_source", 67453933L)
    gdext.classes.Environment.AmbientSource(Ptrcall.call0[Long](gdext.classes.Environment.mb_get_ambient_source, livePtr))
  }

  /** Environment.set_ambient_light_energy */
  final def setAmbientLightEnergy(energy: Double): Unit = {
    if (gdext.classes.Environment.mb_set_ambient_light_energy == null) gdext.classes.Environment.mb_set_ambient_light_energy = MethodBind.get("Environment", "set_ambient_light_energy", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_ambient_light_energy, livePtr, energy)
  }

  /** Environment.get_ambient_light_energy */
  final def getAmbientLightEnergy(): Double = {
    if (gdext.classes.Environment.mb_get_ambient_light_energy == null) gdext.classes.Environment.mb_get_ambient_light_energy = MethodBind.get("Environment", "get_ambient_light_energy", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Environment.mb_get_ambient_light_energy, livePtr)
  }

  /** Environment.set_ambient_light_sky_contribution */
  final def setAmbientLightSkyContribution(ratio: Double): Unit = {
    if (gdext.classes.Environment.mb_set_ambient_light_sky_contribution == null) gdext.classes.Environment.mb_set_ambient_light_sky_contribution = MethodBind.get("Environment", "set_ambient_light_sky_contribution", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_ambient_light_sky_contribution, livePtr, ratio)
  }

  /** Environment.get_ambient_light_sky_contribution */
  final def getAmbientLightSkyContribution(): Double = {
    if (gdext.classes.Environment.mb_get_ambient_light_sky_contribution == null) gdext.classes.Environment.mb_get_ambient_light_sky_contribution = MethodBind.get("Environment", "get_ambient_light_sky_contribution", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Environment.mb_get_ambient_light_sky_contribution, livePtr)
  }

  /** Environment.set_reflection_source */
  final def setReflectionSource(source: gdext.classes.Environment.ReflectionSource): Unit = {
    if (gdext.classes.Environment.mb_set_reflection_source == null) gdext.classes.Environment.mb_set_reflection_source = MethodBind.get("Environment", "set_reflection_source", 299673197L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_reflection_source, livePtr, source)
  }

  /** Environment.get_reflection_source */
  final def getReflectionSource(): gdext.classes.Environment.ReflectionSource = {
    if (gdext.classes.Environment.mb_get_reflection_source == null) gdext.classes.Environment.mb_get_reflection_source = MethodBind.get("Environment", "get_reflection_source", 777700713L)
    gdext.classes.Environment.ReflectionSource(Ptrcall.call0[Long](gdext.classes.Environment.mb_get_reflection_source, livePtr))
  }

  /** Environment.set_tonemapper */
  final def setTonemapper(mode: gdext.classes.Environment.ToneMapper): Unit = {
    if (gdext.classes.Environment.mb_set_tonemapper == null) gdext.classes.Environment.mb_set_tonemapper = MethodBind.get("Environment", "set_tonemapper", 1509116664L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_tonemapper, livePtr, mode)
  }

  /** Environment.get_tonemapper */
  final def getTonemapper(): gdext.classes.Environment.ToneMapper = {
    if (gdext.classes.Environment.mb_get_tonemapper == null) gdext.classes.Environment.mb_get_tonemapper = MethodBind.get("Environment", "get_tonemapper", 2908408137L)
    gdext.classes.Environment.ToneMapper(Ptrcall.call0[Long](gdext.classes.Environment.mb_get_tonemapper, livePtr))
  }

  /** Environment.set_tonemap_exposure */
  final def setTonemapExposure(exposure: Double): Unit = {
    if (gdext.classes.Environment.mb_set_tonemap_exposure == null) gdext.classes.Environment.mb_set_tonemap_exposure = MethodBind.get("Environment", "set_tonemap_exposure", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_tonemap_exposure, livePtr, exposure)
  }

  /** Environment.get_tonemap_exposure */
  final def getTonemapExposure(): Double = {
    if (gdext.classes.Environment.mb_get_tonemap_exposure == null) gdext.classes.Environment.mb_get_tonemap_exposure = MethodBind.get("Environment", "get_tonemap_exposure", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Environment.mb_get_tonemap_exposure, livePtr)
  }

  /** Environment.set_tonemap_white */
  final def setTonemapWhite(white: Double): Unit = {
    if (gdext.classes.Environment.mb_set_tonemap_white == null) gdext.classes.Environment.mb_set_tonemap_white = MethodBind.get("Environment", "set_tonemap_white", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_tonemap_white, livePtr, white)
  }

  /** Environment.get_tonemap_white */
  final def getTonemapWhite(): Double = {
    if (gdext.classes.Environment.mb_get_tonemap_white == null) gdext.classes.Environment.mb_get_tonemap_white = MethodBind.get("Environment", "get_tonemap_white", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Environment.mb_get_tonemap_white, livePtr)
  }

  /** Environment.set_tonemap_agx_white */
  final def setTonemapAgxWhite(white: Double): Unit = {
    if (gdext.classes.Environment.mb_set_tonemap_agx_white == null) gdext.classes.Environment.mb_set_tonemap_agx_white = MethodBind.get("Environment", "set_tonemap_agx_white", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_tonemap_agx_white, livePtr, white)
  }

  /** Environment.get_tonemap_agx_white */
  final def getTonemapAgxWhite(): Double = {
    if (gdext.classes.Environment.mb_get_tonemap_agx_white == null) gdext.classes.Environment.mb_get_tonemap_agx_white = MethodBind.get("Environment", "get_tonemap_agx_white", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Environment.mb_get_tonemap_agx_white, livePtr)
  }

  /** Environment.set_tonemap_agx_contrast */
  final def setTonemapAgxContrast(contrast: Double): Unit = {
    if (gdext.classes.Environment.mb_set_tonemap_agx_contrast == null) gdext.classes.Environment.mb_set_tonemap_agx_contrast = MethodBind.get("Environment", "set_tonemap_agx_contrast", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_tonemap_agx_contrast, livePtr, contrast)
  }

  /** Environment.get_tonemap_agx_contrast */
  final def getTonemapAgxContrast(): Double = {
    if (gdext.classes.Environment.mb_get_tonemap_agx_contrast == null) gdext.classes.Environment.mb_get_tonemap_agx_contrast = MethodBind.get("Environment", "get_tonemap_agx_contrast", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Environment.mb_get_tonemap_agx_contrast, livePtr)
  }

  /** Environment.set_ssr_enabled */
  final def setSsrEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.Environment.mb_set_ssr_enabled == null) gdext.classes.Environment.mb_set_ssr_enabled = MethodBind.get("Environment", "set_ssr_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_ssr_enabled, livePtr, enabled)
  }

  /** Environment.is_ssr_enabled */
  final def isSsrEnabled(): Boolean = {
    if (gdext.classes.Environment.mb_is_ssr_enabled == null) gdext.classes.Environment.mb_is_ssr_enabled = MethodBind.get("Environment", "is_ssr_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Environment.mb_is_ssr_enabled, livePtr)
  }

  /** Environment.set_ssr_max_steps */
  final def setSsrMaxSteps(maxSteps: Long): Unit = {
    if (gdext.classes.Environment.mb_set_ssr_max_steps == null) gdext.classes.Environment.mb_set_ssr_max_steps = MethodBind.get("Environment", "set_ssr_max_steps", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_ssr_max_steps, livePtr, maxSteps)
  }

  /** Environment.get_ssr_max_steps */
  final def getSsrMaxSteps(): Long = {
    if (gdext.classes.Environment.mb_get_ssr_max_steps == null) gdext.classes.Environment.mb_get_ssr_max_steps = MethodBind.get("Environment", "get_ssr_max_steps", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Environment.mb_get_ssr_max_steps, livePtr)
  }

  /** Environment.set_ssr_fade_in */
  final def setSsrFadeIn(fadeIn: Double): Unit = {
    if (gdext.classes.Environment.mb_set_ssr_fade_in == null) gdext.classes.Environment.mb_set_ssr_fade_in = MethodBind.get("Environment", "set_ssr_fade_in", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_ssr_fade_in, livePtr, fadeIn)
  }

  /** Environment.get_ssr_fade_in */
  final def getSsrFadeIn(): Double = {
    if (gdext.classes.Environment.mb_get_ssr_fade_in == null) gdext.classes.Environment.mb_get_ssr_fade_in = MethodBind.get("Environment", "get_ssr_fade_in", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Environment.mb_get_ssr_fade_in, livePtr)
  }

  /** Environment.set_ssr_fade_out */
  final def setSsrFadeOut(fadeOut: Double): Unit = {
    if (gdext.classes.Environment.mb_set_ssr_fade_out == null) gdext.classes.Environment.mb_set_ssr_fade_out = MethodBind.get("Environment", "set_ssr_fade_out", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_ssr_fade_out, livePtr, fadeOut)
  }

  /** Environment.get_ssr_fade_out */
  final def getSsrFadeOut(): Double = {
    if (gdext.classes.Environment.mb_get_ssr_fade_out == null) gdext.classes.Environment.mb_get_ssr_fade_out = MethodBind.get("Environment", "get_ssr_fade_out", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Environment.mb_get_ssr_fade_out, livePtr)
  }

  /** Environment.set_ssr_depth_tolerance */
  final def setSsrDepthTolerance(depthTolerance: Double): Unit = {
    if (gdext.classes.Environment.mb_set_ssr_depth_tolerance == null) gdext.classes.Environment.mb_set_ssr_depth_tolerance = MethodBind.get("Environment", "set_ssr_depth_tolerance", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_ssr_depth_tolerance, livePtr, depthTolerance)
  }

  /** Environment.get_ssr_depth_tolerance */
  final def getSsrDepthTolerance(): Double = {
    if (gdext.classes.Environment.mb_get_ssr_depth_tolerance == null) gdext.classes.Environment.mb_get_ssr_depth_tolerance = MethodBind.get("Environment", "get_ssr_depth_tolerance", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Environment.mb_get_ssr_depth_tolerance, livePtr)
  }

  /** Environment.set_ssao_enabled */
  final def setSsaoEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.Environment.mb_set_ssao_enabled == null) gdext.classes.Environment.mb_set_ssao_enabled = MethodBind.get("Environment", "set_ssao_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_ssao_enabled, livePtr, enabled)
  }

  /** Environment.is_ssao_enabled */
  final def isSsaoEnabled(): Boolean = {
    if (gdext.classes.Environment.mb_is_ssao_enabled == null) gdext.classes.Environment.mb_is_ssao_enabled = MethodBind.get("Environment", "is_ssao_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Environment.mb_is_ssao_enabled, livePtr)
  }

  /** Environment.set_ssao_radius */
  final def setSsaoRadius(radius: Double): Unit = {
    if (gdext.classes.Environment.mb_set_ssao_radius == null) gdext.classes.Environment.mb_set_ssao_radius = MethodBind.get("Environment", "set_ssao_radius", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_ssao_radius, livePtr, radius)
  }

  /** Environment.get_ssao_radius */
  final def getSsaoRadius(): Double = {
    if (gdext.classes.Environment.mb_get_ssao_radius == null) gdext.classes.Environment.mb_get_ssao_radius = MethodBind.get("Environment", "get_ssao_radius", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Environment.mb_get_ssao_radius, livePtr)
  }

  /** Environment.set_ssao_intensity */
  final def setSsaoIntensity(intensity: Double): Unit = {
    if (gdext.classes.Environment.mb_set_ssao_intensity == null) gdext.classes.Environment.mb_set_ssao_intensity = MethodBind.get("Environment", "set_ssao_intensity", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_ssao_intensity, livePtr, intensity)
  }

  /** Environment.get_ssao_intensity */
  final def getSsaoIntensity(): Double = {
    if (gdext.classes.Environment.mb_get_ssao_intensity == null) gdext.classes.Environment.mb_get_ssao_intensity = MethodBind.get("Environment", "get_ssao_intensity", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Environment.mb_get_ssao_intensity, livePtr)
  }

  /** Environment.set_ssao_power */
  final def setSsaoPower(power: Double): Unit = {
    if (gdext.classes.Environment.mb_set_ssao_power == null) gdext.classes.Environment.mb_set_ssao_power = MethodBind.get("Environment", "set_ssao_power", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_ssao_power, livePtr, power)
  }

  /** Environment.get_ssao_power */
  final def getSsaoPower(): Double = {
    if (gdext.classes.Environment.mb_get_ssao_power == null) gdext.classes.Environment.mb_get_ssao_power = MethodBind.get("Environment", "get_ssao_power", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Environment.mb_get_ssao_power, livePtr)
  }

  /** Environment.set_ssao_detail */
  final def setSsaoDetail(detail: Double): Unit = {
    if (gdext.classes.Environment.mb_set_ssao_detail == null) gdext.classes.Environment.mb_set_ssao_detail = MethodBind.get("Environment", "set_ssao_detail", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_ssao_detail, livePtr, detail)
  }

  /** Environment.get_ssao_detail */
  final def getSsaoDetail(): Double = {
    if (gdext.classes.Environment.mb_get_ssao_detail == null) gdext.classes.Environment.mb_get_ssao_detail = MethodBind.get("Environment", "get_ssao_detail", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Environment.mb_get_ssao_detail, livePtr)
  }

  /** Environment.set_ssao_horizon */
  final def setSsaoHorizon(horizon: Double): Unit = {
    if (gdext.classes.Environment.mb_set_ssao_horizon == null) gdext.classes.Environment.mb_set_ssao_horizon = MethodBind.get("Environment", "set_ssao_horizon", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_ssao_horizon, livePtr, horizon)
  }

  /** Environment.get_ssao_horizon */
  final def getSsaoHorizon(): Double = {
    if (gdext.classes.Environment.mb_get_ssao_horizon == null) gdext.classes.Environment.mb_get_ssao_horizon = MethodBind.get("Environment", "get_ssao_horizon", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Environment.mb_get_ssao_horizon, livePtr)
  }

  /** Environment.set_ssao_sharpness */
  final def setSsaoSharpness(sharpness: Double): Unit = {
    if (gdext.classes.Environment.mb_set_ssao_sharpness == null) gdext.classes.Environment.mb_set_ssao_sharpness = MethodBind.get("Environment", "set_ssao_sharpness", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_ssao_sharpness, livePtr, sharpness)
  }

  /** Environment.get_ssao_sharpness */
  final def getSsaoSharpness(): Double = {
    if (gdext.classes.Environment.mb_get_ssao_sharpness == null) gdext.classes.Environment.mb_get_ssao_sharpness = MethodBind.get("Environment", "get_ssao_sharpness", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Environment.mb_get_ssao_sharpness, livePtr)
  }

  /** Environment.set_ssao_direct_light_affect */
  final def setSsaoDirectLightAffect(amount: Double): Unit = {
    if (gdext.classes.Environment.mb_set_ssao_direct_light_affect == null) gdext.classes.Environment.mb_set_ssao_direct_light_affect = MethodBind.get("Environment", "set_ssao_direct_light_affect", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_ssao_direct_light_affect, livePtr, amount)
  }

  /** Environment.get_ssao_direct_light_affect */
  final def getSsaoDirectLightAffect(): Double = {
    if (gdext.classes.Environment.mb_get_ssao_direct_light_affect == null) gdext.classes.Environment.mb_get_ssao_direct_light_affect = MethodBind.get("Environment", "get_ssao_direct_light_affect", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Environment.mb_get_ssao_direct_light_affect, livePtr)
  }

  /** Environment.set_ssao_ao_channel_affect */
  final def setSsaoAoChannelAffect(amount: Double): Unit = {
    if (gdext.classes.Environment.mb_set_ssao_ao_channel_affect == null) gdext.classes.Environment.mb_set_ssao_ao_channel_affect = MethodBind.get("Environment", "set_ssao_ao_channel_affect", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_ssao_ao_channel_affect, livePtr, amount)
  }

  /** Environment.get_ssao_ao_channel_affect */
  final def getSsaoAoChannelAffect(): Double = {
    if (gdext.classes.Environment.mb_get_ssao_ao_channel_affect == null) gdext.classes.Environment.mb_get_ssao_ao_channel_affect = MethodBind.get("Environment", "get_ssao_ao_channel_affect", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Environment.mb_get_ssao_ao_channel_affect, livePtr)
  }

  /** Environment.set_ssil_enabled */
  final def setSsilEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.Environment.mb_set_ssil_enabled == null) gdext.classes.Environment.mb_set_ssil_enabled = MethodBind.get("Environment", "set_ssil_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_ssil_enabled, livePtr, enabled)
  }

  /** Environment.is_ssil_enabled */
  final def isSsilEnabled(): Boolean = {
    if (gdext.classes.Environment.mb_is_ssil_enabled == null) gdext.classes.Environment.mb_is_ssil_enabled = MethodBind.get("Environment", "is_ssil_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Environment.mb_is_ssil_enabled, livePtr)
  }

  /** Environment.set_ssil_radius */
  final def setSsilRadius(radius: Double): Unit = {
    if (gdext.classes.Environment.mb_set_ssil_radius == null) gdext.classes.Environment.mb_set_ssil_radius = MethodBind.get("Environment", "set_ssil_radius", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_ssil_radius, livePtr, radius)
  }

  /** Environment.get_ssil_radius */
  final def getSsilRadius(): Double = {
    if (gdext.classes.Environment.mb_get_ssil_radius == null) gdext.classes.Environment.mb_get_ssil_radius = MethodBind.get("Environment", "get_ssil_radius", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Environment.mb_get_ssil_radius, livePtr)
  }

  /** Environment.set_ssil_intensity */
  final def setSsilIntensity(intensity: Double): Unit = {
    if (gdext.classes.Environment.mb_set_ssil_intensity == null) gdext.classes.Environment.mb_set_ssil_intensity = MethodBind.get("Environment", "set_ssil_intensity", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_ssil_intensity, livePtr, intensity)
  }

  /** Environment.get_ssil_intensity */
  final def getSsilIntensity(): Double = {
    if (gdext.classes.Environment.mb_get_ssil_intensity == null) gdext.classes.Environment.mb_get_ssil_intensity = MethodBind.get("Environment", "get_ssil_intensity", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Environment.mb_get_ssil_intensity, livePtr)
  }

  /** Environment.set_ssil_sharpness */
  final def setSsilSharpness(sharpness: Double): Unit = {
    if (gdext.classes.Environment.mb_set_ssil_sharpness == null) gdext.classes.Environment.mb_set_ssil_sharpness = MethodBind.get("Environment", "set_ssil_sharpness", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_ssil_sharpness, livePtr, sharpness)
  }

  /** Environment.get_ssil_sharpness */
  final def getSsilSharpness(): Double = {
    if (gdext.classes.Environment.mb_get_ssil_sharpness == null) gdext.classes.Environment.mb_get_ssil_sharpness = MethodBind.get("Environment", "get_ssil_sharpness", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Environment.mb_get_ssil_sharpness, livePtr)
  }

  /** Environment.set_ssil_normal_rejection */
  final def setSsilNormalRejection(normalRejection: Double): Unit = {
    if (gdext.classes.Environment.mb_set_ssil_normal_rejection == null) gdext.classes.Environment.mb_set_ssil_normal_rejection = MethodBind.get("Environment", "set_ssil_normal_rejection", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_ssil_normal_rejection, livePtr, normalRejection)
  }

  /** Environment.get_ssil_normal_rejection */
  final def getSsilNormalRejection(): Double = {
    if (gdext.classes.Environment.mb_get_ssil_normal_rejection == null) gdext.classes.Environment.mb_get_ssil_normal_rejection = MethodBind.get("Environment", "get_ssil_normal_rejection", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Environment.mb_get_ssil_normal_rejection, livePtr)
  }

  /** Environment.set_sdfgi_enabled */
  final def setSdfgiEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.Environment.mb_set_sdfgi_enabled == null) gdext.classes.Environment.mb_set_sdfgi_enabled = MethodBind.get("Environment", "set_sdfgi_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_sdfgi_enabled, livePtr, enabled)
  }

  /** Environment.is_sdfgi_enabled */
  final def isSdfgiEnabled(): Boolean = {
    if (gdext.classes.Environment.mb_is_sdfgi_enabled == null) gdext.classes.Environment.mb_is_sdfgi_enabled = MethodBind.get("Environment", "is_sdfgi_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Environment.mb_is_sdfgi_enabled, livePtr)
  }

  /** Environment.set_sdfgi_cascades */
  final def setSdfgiCascades(amount: Long): Unit = {
    if (gdext.classes.Environment.mb_set_sdfgi_cascades == null) gdext.classes.Environment.mb_set_sdfgi_cascades = MethodBind.get("Environment", "set_sdfgi_cascades", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_sdfgi_cascades, livePtr, amount)
  }

  /** Environment.get_sdfgi_cascades */
  final def getSdfgiCascades(): Long = {
    if (gdext.classes.Environment.mb_get_sdfgi_cascades == null) gdext.classes.Environment.mb_get_sdfgi_cascades = MethodBind.get("Environment", "get_sdfgi_cascades", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Environment.mb_get_sdfgi_cascades, livePtr)
  }

  /** Environment.set_sdfgi_min_cell_size */
  final def setSdfgiMinCellSize(size: Double): Unit = {
    if (gdext.classes.Environment.mb_set_sdfgi_min_cell_size == null) gdext.classes.Environment.mb_set_sdfgi_min_cell_size = MethodBind.get("Environment", "set_sdfgi_min_cell_size", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_sdfgi_min_cell_size, livePtr, size)
  }

  /** Environment.get_sdfgi_min_cell_size */
  final def getSdfgiMinCellSize(): Double = {
    if (gdext.classes.Environment.mb_get_sdfgi_min_cell_size == null) gdext.classes.Environment.mb_get_sdfgi_min_cell_size = MethodBind.get("Environment", "get_sdfgi_min_cell_size", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Environment.mb_get_sdfgi_min_cell_size, livePtr)
  }

  /** Environment.set_sdfgi_max_distance */
  final def setSdfgiMaxDistance(distance: Double): Unit = {
    if (gdext.classes.Environment.mb_set_sdfgi_max_distance == null) gdext.classes.Environment.mb_set_sdfgi_max_distance = MethodBind.get("Environment", "set_sdfgi_max_distance", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_sdfgi_max_distance, livePtr, distance)
  }

  /** Environment.get_sdfgi_max_distance */
  final def getSdfgiMaxDistance(): Double = {
    if (gdext.classes.Environment.mb_get_sdfgi_max_distance == null) gdext.classes.Environment.mb_get_sdfgi_max_distance = MethodBind.get("Environment", "get_sdfgi_max_distance", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Environment.mb_get_sdfgi_max_distance, livePtr)
  }

  /** Environment.set_sdfgi_cascade0_distance */
  final def setSdfgiCascade0Distance(distance: Double): Unit = {
    if (gdext.classes.Environment.mb_set_sdfgi_cascade0_distance == null) gdext.classes.Environment.mb_set_sdfgi_cascade0_distance = MethodBind.get("Environment", "set_sdfgi_cascade0_distance", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_sdfgi_cascade0_distance, livePtr, distance)
  }

  /** Environment.get_sdfgi_cascade0_distance */
  final def getSdfgiCascade0Distance(): Double = {
    if (gdext.classes.Environment.mb_get_sdfgi_cascade0_distance == null) gdext.classes.Environment.mb_get_sdfgi_cascade0_distance = MethodBind.get("Environment", "get_sdfgi_cascade0_distance", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Environment.mb_get_sdfgi_cascade0_distance, livePtr)
  }

  /** Environment.set_sdfgi_y_scale */
  final def setSdfgiYScale(scale: gdext.classes.Environment.SDFGIYScale): Unit = {
    if (gdext.classes.Environment.mb_set_sdfgi_y_scale == null) gdext.classes.Environment.mb_set_sdfgi_y_scale = MethodBind.get("Environment", "set_sdfgi_y_scale", 3608608372L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_sdfgi_y_scale, livePtr, scale)
  }

  /** Environment.get_sdfgi_y_scale */
  final def getSdfgiYScale(): gdext.classes.Environment.SDFGIYScale = {
    if (gdext.classes.Environment.mb_get_sdfgi_y_scale == null) gdext.classes.Environment.mb_get_sdfgi_y_scale = MethodBind.get("Environment", "get_sdfgi_y_scale", 2568002245L)
    gdext.classes.Environment.SDFGIYScale(Ptrcall.call0[Long](gdext.classes.Environment.mb_get_sdfgi_y_scale, livePtr))
  }

  /** Environment.set_sdfgi_use_occlusion */
  final def setSdfgiUseOcclusion(enable: Boolean): Unit = {
    if (gdext.classes.Environment.mb_set_sdfgi_use_occlusion == null) gdext.classes.Environment.mb_set_sdfgi_use_occlusion = MethodBind.get("Environment", "set_sdfgi_use_occlusion", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_sdfgi_use_occlusion, livePtr, enable)
  }

  /** Environment.is_sdfgi_using_occlusion */
  final def isSdfgiUsingOcclusion(): Boolean = {
    if (gdext.classes.Environment.mb_is_sdfgi_using_occlusion == null) gdext.classes.Environment.mb_is_sdfgi_using_occlusion = MethodBind.get("Environment", "is_sdfgi_using_occlusion", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Environment.mb_is_sdfgi_using_occlusion, livePtr)
  }

  /** Environment.set_sdfgi_bounce_feedback */
  final def setSdfgiBounceFeedback(amount: Double): Unit = {
    if (gdext.classes.Environment.mb_set_sdfgi_bounce_feedback == null) gdext.classes.Environment.mb_set_sdfgi_bounce_feedback = MethodBind.get("Environment", "set_sdfgi_bounce_feedback", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_sdfgi_bounce_feedback, livePtr, amount)
  }

  /** Environment.get_sdfgi_bounce_feedback */
  final def getSdfgiBounceFeedback(): Double = {
    if (gdext.classes.Environment.mb_get_sdfgi_bounce_feedback == null) gdext.classes.Environment.mb_get_sdfgi_bounce_feedback = MethodBind.get("Environment", "get_sdfgi_bounce_feedback", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Environment.mb_get_sdfgi_bounce_feedback, livePtr)
  }

  /** Environment.set_sdfgi_read_sky_light */
  final def setSdfgiReadSkyLight(enable: Boolean): Unit = {
    if (gdext.classes.Environment.mb_set_sdfgi_read_sky_light == null) gdext.classes.Environment.mb_set_sdfgi_read_sky_light = MethodBind.get("Environment", "set_sdfgi_read_sky_light", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_sdfgi_read_sky_light, livePtr, enable)
  }

  /** Environment.is_sdfgi_reading_sky_light */
  final def isSdfgiReadingSkyLight(): Boolean = {
    if (gdext.classes.Environment.mb_is_sdfgi_reading_sky_light == null) gdext.classes.Environment.mb_is_sdfgi_reading_sky_light = MethodBind.get("Environment", "is_sdfgi_reading_sky_light", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Environment.mb_is_sdfgi_reading_sky_light, livePtr)
  }

  /** Environment.set_sdfgi_energy */
  final def setSdfgiEnergy(amount: Double): Unit = {
    if (gdext.classes.Environment.mb_set_sdfgi_energy == null) gdext.classes.Environment.mb_set_sdfgi_energy = MethodBind.get("Environment", "set_sdfgi_energy", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_sdfgi_energy, livePtr, amount)
  }

  /** Environment.get_sdfgi_energy */
  final def getSdfgiEnergy(): Double = {
    if (gdext.classes.Environment.mb_get_sdfgi_energy == null) gdext.classes.Environment.mb_get_sdfgi_energy = MethodBind.get("Environment", "get_sdfgi_energy", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Environment.mb_get_sdfgi_energy, livePtr)
  }

  /** Environment.set_sdfgi_normal_bias */
  final def setSdfgiNormalBias(bias: Double): Unit = {
    if (gdext.classes.Environment.mb_set_sdfgi_normal_bias == null) gdext.classes.Environment.mb_set_sdfgi_normal_bias = MethodBind.get("Environment", "set_sdfgi_normal_bias", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_sdfgi_normal_bias, livePtr, bias)
  }

  /** Environment.get_sdfgi_normal_bias */
  final def getSdfgiNormalBias(): Double = {
    if (gdext.classes.Environment.mb_get_sdfgi_normal_bias == null) gdext.classes.Environment.mb_get_sdfgi_normal_bias = MethodBind.get("Environment", "get_sdfgi_normal_bias", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Environment.mb_get_sdfgi_normal_bias, livePtr)
  }

  /** Environment.set_sdfgi_probe_bias */
  final def setSdfgiProbeBias(bias: Double): Unit = {
    if (gdext.classes.Environment.mb_set_sdfgi_probe_bias == null) gdext.classes.Environment.mb_set_sdfgi_probe_bias = MethodBind.get("Environment", "set_sdfgi_probe_bias", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_sdfgi_probe_bias, livePtr, bias)
  }

  /** Environment.get_sdfgi_probe_bias */
  final def getSdfgiProbeBias(): Double = {
    if (gdext.classes.Environment.mb_get_sdfgi_probe_bias == null) gdext.classes.Environment.mb_get_sdfgi_probe_bias = MethodBind.get("Environment", "get_sdfgi_probe_bias", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Environment.mb_get_sdfgi_probe_bias, livePtr)
  }

  /** Environment.set_glow_enabled */
  final def setGlowEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.Environment.mb_set_glow_enabled == null) gdext.classes.Environment.mb_set_glow_enabled = MethodBind.get("Environment", "set_glow_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_glow_enabled, livePtr, enabled)
  }

  /** Environment.is_glow_enabled */
  final def isGlowEnabled(): Boolean = {
    if (gdext.classes.Environment.mb_is_glow_enabled == null) gdext.classes.Environment.mb_is_glow_enabled = MethodBind.get("Environment", "is_glow_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Environment.mb_is_glow_enabled, livePtr)
  }

  /** Environment.set_glow_level */
  final def setGlowLevel(idx: Long, intensity: Double): Unit = {
    if (gdext.classes.Environment.mb_set_glow_level == null) gdext.classes.Environment.mb_set_glow_level = MethodBind.get("Environment", "set_glow_level", 1602489585L)
    Ptrcall.callVoid2(gdext.classes.Environment.mb_set_glow_level, livePtr, idx, intensity)
  }

  /** Environment.get_glow_level */
  final def getGlowLevel(idx: Long): Double = {
    if (gdext.classes.Environment.mb_get_glow_level == null) gdext.classes.Environment.mb_get_glow_level = MethodBind.get("Environment", "get_glow_level", 2339986948L)
    Ptrcall.call1[Long, Double](gdext.classes.Environment.mb_get_glow_level, livePtr, idx)
  }

  /** Environment.set_glow_normalized */
  final def setGlowNormalized(normalize: Boolean): Unit = {
    if (gdext.classes.Environment.mb_set_glow_normalized == null) gdext.classes.Environment.mb_set_glow_normalized = MethodBind.get("Environment", "set_glow_normalized", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_glow_normalized, livePtr, normalize)
  }

  /** Environment.is_glow_normalized */
  final def isGlowNormalized(): Boolean = {
    if (gdext.classes.Environment.mb_is_glow_normalized == null) gdext.classes.Environment.mb_is_glow_normalized = MethodBind.get("Environment", "is_glow_normalized", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Environment.mb_is_glow_normalized, livePtr)
  }

  /** Environment.set_glow_intensity */
  final def setGlowIntensity(intensity: Double): Unit = {
    if (gdext.classes.Environment.mb_set_glow_intensity == null) gdext.classes.Environment.mb_set_glow_intensity = MethodBind.get("Environment", "set_glow_intensity", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_glow_intensity, livePtr, intensity)
  }

  /** Environment.get_glow_intensity */
  final def getGlowIntensity(): Double = {
    if (gdext.classes.Environment.mb_get_glow_intensity == null) gdext.classes.Environment.mb_get_glow_intensity = MethodBind.get("Environment", "get_glow_intensity", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Environment.mb_get_glow_intensity, livePtr)
  }

  /** Environment.set_glow_strength */
  final def setGlowStrength(strength: Double): Unit = {
    if (gdext.classes.Environment.mb_set_glow_strength == null) gdext.classes.Environment.mb_set_glow_strength = MethodBind.get("Environment", "set_glow_strength", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_glow_strength, livePtr, strength)
  }

  /** Environment.get_glow_strength */
  final def getGlowStrength(): Double = {
    if (gdext.classes.Environment.mb_get_glow_strength == null) gdext.classes.Environment.mb_get_glow_strength = MethodBind.get("Environment", "get_glow_strength", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Environment.mb_get_glow_strength, livePtr)
  }

  /** Environment.set_glow_mix */
  final def setGlowMix(mix: Double): Unit = {
    if (gdext.classes.Environment.mb_set_glow_mix == null) gdext.classes.Environment.mb_set_glow_mix = MethodBind.get("Environment", "set_glow_mix", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_glow_mix, livePtr, mix)
  }

  /** Environment.get_glow_mix */
  final def getGlowMix(): Double = {
    if (gdext.classes.Environment.mb_get_glow_mix == null) gdext.classes.Environment.mb_get_glow_mix = MethodBind.get("Environment", "get_glow_mix", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Environment.mb_get_glow_mix, livePtr)
  }

  /** Environment.set_glow_bloom */
  final def setGlowBloom(amount: Double): Unit = {
    if (gdext.classes.Environment.mb_set_glow_bloom == null) gdext.classes.Environment.mb_set_glow_bloom = MethodBind.get("Environment", "set_glow_bloom", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_glow_bloom, livePtr, amount)
  }

  /** Environment.get_glow_bloom */
  final def getGlowBloom(): Double = {
    if (gdext.classes.Environment.mb_get_glow_bloom == null) gdext.classes.Environment.mb_get_glow_bloom = MethodBind.get("Environment", "get_glow_bloom", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Environment.mb_get_glow_bloom, livePtr)
  }

  /** Environment.set_glow_blend_mode */
  final def setGlowBlendMode(mode: gdext.classes.Environment.GlowBlendMode): Unit = {
    if (gdext.classes.Environment.mb_set_glow_blend_mode == null) gdext.classes.Environment.mb_set_glow_blend_mode = MethodBind.get("Environment", "set_glow_blend_mode", 2561587761L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_glow_blend_mode, livePtr, mode)
  }

  /** Environment.get_glow_blend_mode */
  final def getGlowBlendMode(): gdext.classes.Environment.GlowBlendMode = {
    if (gdext.classes.Environment.mb_get_glow_blend_mode == null) gdext.classes.Environment.mb_get_glow_blend_mode = MethodBind.get("Environment", "get_glow_blend_mode", 1529667332L)
    gdext.classes.Environment.GlowBlendMode(Ptrcall.call0[Long](gdext.classes.Environment.mb_get_glow_blend_mode, livePtr))
  }

  /** Environment.set_glow_hdr_bleed_threshold */
  final def setGlowHdrBleedThreshold(threshold: Double): Unit = {
    if (gdext.classes.Environment.mb_set_glow_hdr_bleed_threshold == null) gdext.classes.Environment.mb_set_glow_hdr_bleed_threshold = MethodBind.get("Environment", "set_glow_hdr_bleed_threshold", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_glow_hdr_bleed_threshold, livePtr, threshold)
  }

  /** Environment.get_glow_hdr_bleed_threshold */
  final def getGlowHdrBleedThreshold(): Double = {
    if (gdext.classes.Environment.mb_get_glow_hdr_bleed_threshold == null) gdext.classes.Environment.mb_get_glow_hdr_bleed_threshold = MethodBind.get("Environment", "get_glow_hdr_bleed_threshold", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Environment.mb_get_glow_hdr_bleed_threshold, livePtr)
  }

  /** Environment.set_glow_hdr_bleed_scale */
  final def setGlowHdrBleedScale(scale: Double): Unit = {
    if (gdext.classes.Environment.mb_set_glow_hdr_bleed_scale == null) gdext.classes.Environment.mb_set_glow_hdr_bleed_scale = MethodBind.get("Environment", "set_glow_hdr_bleed_scale", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_glow_hdr_bleed_scale, livePtr, scale)
  }

  /** Environment.get_glow_hdr_bleed_scale */
  final def getGlowHdrBleedScale(): Double = {
    if (gdext.classes.Environment.mb_get_glow_hdr_bleed_scale == null) gdext.classes.Environment.mb_get_glow_hdr_bleed_scale = MethodBind.get("Environment", "get_glow_hdr_bleed_scale", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Environment.mb_get_glow_hdr_bleed_scale, livePtr)
  }

  /** Environment.set_glow_hdr_luminance_cap */
  final def setGlowHdrLuminanceCap(amount: Double): Unit = {
    if (gdext.classes.Environment.mb_set_glow_hdr_luminance_cap == null) gdext.classes.Environment.mb_set_glow_hdr_luminance_cap = MethodBind.get("Environment", "set_glow_hdr_luminance_cap", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_glow_hdr_luminance_cap, livePtr, amount)
  }

  /** Environment.get_glow_hdr_luminance_cap */
  final def getGlowHdrLuminanceCap(): Double = {
    if (gdext.classes.Environment.mb_get_glow_hdr_luminance_cap == null) gdext.classes.Environment.mb_get_glow_hdr_luminance_cap = MethodBind.get("Environment", "get_glow_hdr_luminance_cap", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Environment.mb_get_glow_hdr_luminance_cap, livePtr)
  }

  /** Environment.set_glow_map_strength */
  final def setGlowMapStrength(strength: Double): Unit = {
    if (gdext.classes.Environment.mb_set_glow_map_strength == null) gdext.classes.Environment.mb_set_glow_map_strength = MethodBind.get("Environment", "set_glow_map_strength", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_glow_map_strength, livePtr, strength)
  }

  /** Environment.get_glow_map_strength */
  final def getGlowMapStrength(): Double = {
    if (gdext.classes.Environment.mb_get_glow_map_strength == null) gdext.classes.Environment.mb_get_glow_map_strength = MethodBind.get("Environment", "get_glow_map_strength", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Environment.mb_get_glow_map_strength, livePtr)
  }

  /** Environment.set_glow_map */
  final def setGlowMap(mode: Texture): Unit = {
    if (gdext.classes.Environment.mb_set_glow_map == null) gdext.classes.Environment.mb_set_glow_map = MethodBind.get("Environment", "set_glow_map", 1790811099L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_glow_map, livePtr, Wrappers.handle(mode))
  }

  /** Environment.get_glow_map. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getGlowMap(): Texture = {
    if (gdext.classes.Environment.mb_get_glow_map == null) gdext.classes.Environment.mb_get_glow_map = MethodBind.get("Environment", "get_glow_map", 4037048985L)
    Wrappers.owned[Texture](Ptrcall.call0[Long](gdext.classes.Environment.mb_get_glow_map, livePtr))
  }

  /** Environment.set_fog_enabled */
  final def setFogEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.Environment.mb_set_fog_enabled == null) gdext.classes.Environment.mb_set_fog_enabled = MethodBind.get("Environment", "set_fog_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_fog_enabled, livePtr, enabled)
  }

  /** Environment.is_fog_enabled */
  final def isFogEnabled(): Boolean = {
    if (gdext.classes.Environment.mb_is_fog_enabled == null) gdext.classes.Environment.mb_is_fog_enabled = MethodBind.get("Environment", "is_fog_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Environment.mb_is_fog_enabled, livePtr)
  }

  /** Environment.set_fog_mode */
  final def setFogMode(mode: gdext.classes.Environment.FogMode): Unit = {
    if (gdext.classes.Environment.mb_set_fog_mode == null) gdext.classes.Environment.mb_set_fog_mode = MethodBind.get("Environment", "set_fog_mode", 3059806579L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_fog_mode, livePtr, mode)
  }

  /** Environment.get_fog_mode */
  final def getFogMode(): gdext.classes.Environment.FogMode = {
    if (gdext.classes.Environment.mb_get_fog_mode == null) gdext.classes.Environment.mb_get_fog_mode = MethodBind.get("Environment", "get_fog_mode", 2456062483L)
    gdext.classes.Environment.FogMode(Ptrcall.call0[Long](gdext.classes.Environment.mb_get_fog_mode, livePtr))
  }

  /** Environment.set_fog_light_color */
  final def setFogLightColor(lightColor: gdext.builtin.Color): Unit = {
    if (gdext.classes.Environment.mb_set_fog_light_color == null) gdext.classes.Environment.mb_set_fog_light_color = MethodBind.get("Environment", "set_fog_light_color", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_fog_light_color, livePtr, lightColor)
  }

  /** Environment.get_fog_light_color */
  final def getFogLightColor(): gdext.builtin.Color = {
    if (gdext.classes.Environment.mb_get_fog_light_color == null) gdext.classes.Environment.mb_get_fog_light_color = MethodBind.get("Environment", "get_fog_light_color", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.Environment.mb_get_fog_light_color, livePtr)
  }

  /** Environment.set_fog_light_energy */
  final def setFogLightEnergy(lightEnergy: Double): Unit = {
    if (gdext.classes.Environment.mb_set_fog_light_energy == null) gdext.classes.Environment.mb_set_fog_light_energy = MethodBind.get("Environment", "set_fog_light_energy", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_fog_light_energy, livePtr, lightEnergy)
  }

  /** Environment.get_fog_light_energy */
  final def getFogLightEnergy(): Double = {
    if (gdext.classes.Environment.mb_get_fog_light_energy == null) gdext.classes.Environment.mb_get_fog_light_energy = MethodBind.get("Environment", "get_fog_light_energy", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Environment.mb_get_fog_light_energy, livePtr)
  }

  /** Environment.set_fog_sun_scatter */
  final def setFogSunScatter(sunScatter: Double): Unit = {
    if (gdext.classes.Environment.mb_set_fog_sun_scatter == null) gdext.classes.Environment.mb_set_fog_sun_scatter = MethodBind.get("Environment", "set_fog_sun_scatter", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_fog_sun_scatter, livePtr, sunScatter)
  }

  /** Environment.get_fog_sun_scatter */
  final def getFogSunScatter(): Double = {
    if (gdext.classes.Environment.mb_get_fog_sun_scatter == null) gdext.classes.Environment.mb_get_fog_sun_scatter = MethodBind.get("Environment", "get_fog_sun_scatter", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Environment.mb_get_fog_sun_scatter, livePtr)
  }

  /** Environment.set_fog_density */
  final def setFogDensity(density: Double): Unit = {
    if (gdext.classes.Environment.mb_set_fog_density == null) gdext.classes.Environment.mb_set_fog_density = MethodBind.get("Environment", "set_fog_density", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_fog_density, livePtr, density)
  }

  /** Environment.get_fog_density */
  final def getFogDensity(): Double = {
    if (gdext.classes.Environment.mb_get_fog_density == null) gdext.classes.Environment.mb_get_fog_density = MethodBind.get("Environment", "get_fog_density", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Environment.mb_get_fog_density, livePtr)
  }

  /** Environment.set_fog_height */
  final def setFogHeight(height: Double): Unit = {
    if (gdext.classes.Environment.mb_set_fog_height == null) gdext.classes.Environment.mb_set_fog_height = MethodBind.get("Environment", "set_fog_height", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_fog_height, livePtr, height)
  }

  /** Environment.get_fog_height */
  final def getFogHeight(): Double = {
    if (gdext.classes.Environment.mb_get_fog_height == null) gdext.classes.Environment.mb_get_fog_height = MethodBind.get("Environment", "get_fog_height", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Environment.mb_get_fog_height, livePtr)
  }

  /** Environment.set_fog_height_density */
  final def setFogHeightDensity(heightDensity: Double): Unit = {
    if (gdext.classes.Environment.mb_set_fog_height_density == null) gdext.classes.Environment.mb_set_fog_height_density = MethodBind.get("Environment", "set_fog_height_density", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_fog_height_density, livePtr, heightDensity)
  }

  /** Environment.get_fog_height_density */
  final def getFogHeightDensity(): Double = {
    if (gdext.classes.Environment.mb_get_fog_height_density == null) gdext.classes.Environment.mb_get_fog_height_density = MethodBind.get("Environment", "get_fog_height_density", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Environment.mb_get_fog_height_density, livePtr)
  }

  /** Environment.set_fog_aerial_perspective */
  final def setFogAerialPerspective(aerialPerspective: Double): Unit = {
    if (gdext.classes.Environment.mb_set_fog_aerial_perspective == null) gdext.classes.Environment.mb_set_fog_aerial_perspective = MethodBind.get("Environment", "set_fog_aerial_perspective", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_fog_aerial_perspective, livePtr, aerialPerspective)
  }

  /** Environment.get_fog_aerial_perspective */
  final def getFogAerialPerspective(): Double = {
    if (gdext.classes.Environment.mb_get_fog_aerial_perspective == null) gdext.classes.Environment.mb_get_fog_aerial_perspective = MethodBind.get("Environment", "get_fog_aerial_perspective", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Environment.mb_get_fog_aerial_perspective, livePtr)
  }

  /** Environment.set_fog_sky_affect */
  final def setFogSkyAffect(skyAffect: Double): Unit = {
    if (gdext.classes.Environment.mb_set_fog_sky_affect == null) gdext.classes.Environment.mb_set_fog_sky_affect = MethodBind.get("Environment", "set_fog_sky_affect", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_fog_sky_affect, livePtr, skyAffect)
  }

  /** Environment.get_fog_sky_affect */
  final def getFogSkyAffect(): Double = {
    if (gdext.classes.Environment.mb_get_fog_sky_affect == null) gdext.classes.Environment.mb_get_fog_sky_affect = MethodBind.get("Environment", "get_fog_sky_affect", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Environment.mb_get_fog_sky_affect, livePtr)
  }

  /** Environment.set_fog_depth_curve */
  final def setFogDepthCurve(curve: Double): Unit = {
    if (gdext.classes.Environment.mb_set_fog_depth_curve == null) gdext.classes.Environment.mb_set_fog_depth_curve = MethodBind.get("Environment", "set_fog_depth_curve", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_fog_depth_curve, livePtr, curve)
  }

  /** Environment.get_fog_depth_curve */
  final def getFogDepthCurve(): Double = {
    if (gdext.classes.Environment.mb_get_fog_depth_curve == null) gdext.classes.Environment.mb_get_fog_depth_curve = MethodBind.get("Environment", "get_fog_depth_curve", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Environment.mb_get_fog_depth_curve, livePtr)
  }

  /** Environment.set_fog_depth_begin */
  final def setFogDepthBegin(begin: Double): Unit = {
    if (gdext.classes.Environment.mb_set_fog_depth_begin == null) gdext.classes.Environment.mb_set_fog_depth_begin = MethodBind.get("Environment", "set_fog_depth_begin", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_fog_depth_begin, livePtr, begin)
  }

  /** Environment.get_fog_depth_begin */
  final def getFogDepthBegin(): Double = {
    if (gdext.classes.Environment.mb_get_fog_depth_begin == null) gdext.classes.Environment.mb_get_fog_depth_begin = MethodBind.get("Environment", "get_fog_depth_begin", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Environment.mb_get_fog_depth_begin, livePtr)
  }

  /** Environment.set_fog_depth_end */
  final def setFogDepthEnd(end: Double): Unit = {
    if (gdext.classes.Environment.mb_set_fog_depth_end == null) gdext.classes.Environment.mb_set_fog_depth_end = MethodBind.get("Environment", "set_fog_depth_end", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_fog_depth_end, livePtr, end)
  }

  /** Environment.get_fog_depth_end */
  final def getFogDepthEnd(): Double = {
    if (gdext.classes.Environment.mb_get_fog_depth_end == null) gdext.classes.Environment.mb_get_fog_depth_end = MethodBind.get("Environment", "get_fog_depth_end", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Environment.mb_get_fog_depth_end, livePtr)
  }

  /** Environment.set_volumetric_fog_enabled */
  final def setVolumetricFogEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.Environment.mb_set_volumetric_fog_enabled == null) gdext.classes.Environment.mb_set_volumetric_fog_enabled = MethodBind.get("Environment", "set_volumetric_fog_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_volumetric_fog_enabled, livePtr, enabled)
  }

  /** Environment.is_volumetric_fog_enabled */
  final def isVolumetricFogEnabled(): Boolean = {
    if (gdext.classes.Environment.mb_is_volumetric_fog_enabled == null) gdext.classes.Environment.mb_is_volumetric_fog_enabled = MethodBind.get("Environment", "is_volumetric_fog_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Environment.mb_is_volumetric_fog_enabled, livePtr)
  }

  /** Environment.set_volumetric_fog_emission */
  final def setVolumetricFogEmission(color: gdext.builtin.Color): Unit = {
    if (gdext.classes.Environment.mb_set_volumetric_fog_emission == null) gdext.classes.Environment.mb_set_volumetric_fog_emission = MethodBind.get("Environment", "set_volumetric_fog_emission", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_volumetric_fog_emission, livePtr, color)
  }

  /** Environment.get_volumetric_fog_emission */
  final def getVolumetricFogEmission(): gdext.builtin.Color = {
    if (gdext.classes.Environment.mb_get_volumetric_fog_emission == null) gdext.classes.Environment.mb_get_volumetric_fog_emission = MethodBind.get("Environment", "get_volumetric_fog_emission", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.Environment.mb_get_volumetric_fog_emission, livePtr)
  }

  /** Environment.set_volumetric_fog_albedo */
  final def setVolumetricFogAlbedo(color: gdext.builtin.Color): Unit = {
    if (gdext.classes.Environment.mb_set_volumetric_fog_albedo == null) gdext.classes.Environment.mb_set_volumetric_fog_albedo = MethodBind.get("Environment", "set_volumetric_fog_albedo", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_volumetric_fog_albedo, livePtr, color)
  }

  /** Environment.get_volumetric_fog_albedo */
  final def getVolumetricFogAlbedo(): gdext.builtin.Color = {
    if (gdext.classes.Environment.mb_get_volumetric_fog_albedo == null) gdext.classes.Environment.mb_get_volumetric_fog_albedo = MethodBind.get("Environment", "get_volumetric_fog_albedo", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.Environment.mb_get_volumetric_fog_albedo, livePtr)
  }

  /** Environment.set_volumetric_fog_density */
  final def setVolumetricFogDensity(density: Double): Unit = {
    if (gdext.classes.Environment.mb_set_volumetric_fog_density == null) gdext.classes.Environment.mb_set_volumetric_fog_density = MethodBind.get("Environment", "set_volumetric_fog_density", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_volumetric_fog_density, livePtr, density)
  }

  /** Environment.get_volumetric_fog_density */
  final def getVolumetricFogDensity(): Double = {
    if (gdext.classes.Environment.mb_get_volumetric_fog_density == null) gdext.classes.Environment.mb_get_volumetric_fog_density = MethodBind.get("Environment", "get_volumetric_fog_density", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Environment.mb_get_volumetric_fog_density, livePtr)
  }

  /** Environment.set_volumetric_fog_emission_energy */
  final def setVolumetricFogEmissionEnergy(begin: Double): Unit = {
    if (gdext.classes.Environment.mb_set_volumetric_fog_emission_energy == null) gdext.classes.Environment.mb_set_volumetric_fog_emission_energy = MethodBind.get("Environment", "set_volumetric_fog_emission_energy", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_volumetric_fog_emission_energy, livePtr, begin)
  }

  /** Environment.get_volumetric_fog_emission_energy */
  final def getVolumetricFogEmissionEnergy(): Double = {
    if (gdext.classes.Environment.mb_get_volumetric_fog_emission_energy == null) gdext.classes.Environment.mb_get_volumetric_fog_emission_energy = MethodBind.get("Environment", "get_volumetric_fog_emission_energy", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Environment.mb_get_volumetric_fog_emission_energy, livePtr)
  }

  /** Environment.set_volumetric_fog_anisotropy */
  final def setVolumetricFogAnisotropy(anisotropy: Double): Unit = {
    if (gdext.classes.Environment.mb_set_volumetric_fog_anisotropy == null) gdext.classes.Environment.mb_set_volumetric_fog_anisotropy = MethodBind.get("Environment", "set_volumetric_fog_anisotropy", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_volumetric_fog_anisotropy, livePtr, anisotropy)
  }

  /** Environment.get_volumetric_fog_anisotropy */
  final def getVolumetricFogAnisotropy(): Double = {
    if (gdext.classes.Environment.mb_get_volumetric_fog_anisotropy == null) gdext.classes.Environment.mb_get_volumetric_fog_anisotropy = MethodBind.get("Environment", "get_volumetric_fog_anisotropy", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Environment.mb_get_volumetric_fog_anisotropy, livePtr)
  }

  /** Environment.set_volumetric_fog_length */
  final def setVolumetricFogLength(length: Double): Unit = {
    if (gdext.classes.Environment.mb_set_volumetric_fog_length == null) gdext.classes.Environment.mb_set_volumetric_fog_length = MethodBind.get("Environment", "set_volumetric_fog_length", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_volumetric_fog_length, livePtr, length)
  }

  /** Environment.get_volumetric_fog_length */
  final def getVolumetricFogLength(): Double = {
    if (gdext.classes.Environment.mb_get_volumetric_fog_length == null) gdext.classes.Environment.mb_get_volumetric_fog_length = MethodBind.get("Environment", "get_volumetric_fog_length", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Environment.mb_get_volumetric_fog_length, livePtr)
  }

  /** Environment.set_volumetric_fog_detail_spread */
  final def setVolumetricFogDetailSpread(detailSpread: Double): Unit = {
    if (gdext.classes.Environment.mb_set_volumetric_fog_detail_spread == null) gdext.classes.Environment.mb_set_volumetric_fog_detail_spread = MethodBind.get("Environment", "set_volumetric_fog_detail_spread", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_volumetric_fog_detail_spread, livePtr, detailSpread)
  }

  /** Environment.get_volumetric_fog_detail_spread */
  final def getVolumetricFogDetailSpread(): Double = {
    if (gdext.classes.Environment.mb_get_volumetric_fog_detail_spread == null) gdext.classes.Environment.mb_get_volumetric_fog_detail_spread = MethodBind.get("Environment", "get_volumetric_fog_detail_spread", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Environment.mb_get_volumetric_fog_detail_spread, livePtr)
  }

  /** Environment.set_volumetric_fog_gi_inject */
  final def setVolumetricFogGiInject(giInject: Double): Unit = {
    if (gdext.classes.Environment.mb_set_volumetric_fog_gi_inject == null) gdext.classes.Environment.mb_set_volumetric_fog_gi_inject = MethodBind.get("Environment", "set_volumetric_fog_gi_inject", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_volumetric_fog_gi_inject, livePtr, giInject)
  }

  /** Environment.get_volumetric_fog_gi_inject */
  final def getVolumetricFogGiInject(): Double = {
    if (gdext.classes.Environment.mb_get_volumetric_fog_gi_inject == null) gdext.classes.Environment.mb_get_volumetric_fog_gi_inject = MethodBind.get("Environment", "get_volumetric_fog_gi_inject", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Environment.mb_get_volumetric_fog_gi_inject, livePtr)
  }

  /** Environment.set_volumetric_fog_ambient_inject */
  final def setVolumetricFogAmbientInject(enabled: Double): Unit = {
    if (gdext.classes.Environment.mb_set_volumetric_fog_ambient_inject == null) gdext.classes.Environment.mb_set_volumetric_fog_ambient_inject = MethodBind.get("Environment", "set_volumetric_fog_ambient_inject", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_volumetric_fog_ambient_inject, livePtr, enabled)
  }

  /** Environment.get_volumetric_fog_ambient_inject */
  final def getVolumetricFogAmbientInject(): Double = {
    if (gdext.classes.Environment.mb_get_volumetric_fog_ambient_inject == null) gdext.classes.Environment.mb_get_volumetric_fog_ambient_inject = MethodBind.get("Environment", "get_volumetric_fog_ambient_inject", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Environment.mb_get_volumetric_fog_ambient_inject, livePtr)
  }

  /** Environment.set_volumetric_fog_sky_affect */
  final def setVolumetricFogSkyAffect(skyAffect: Double): Unit = {
    if (gdext.classes.Environment.mb_set_volumetric_fog_sky_affect == null) gdext.classes.Environment.mb_set_volumetric_fog_sky_affect = MethodBind.get("Environment", "set_volumetric_fog_sky_affect", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_volumetric_fog_sky_affect, livePtr, skyAffect)
  }

  /** Environment.get_volumetric_fog_sky_affect */
  final def getVolumetricFogSkyAffect(): Double = {
    if (gdext.classes.Environment.mb_get_volumetric_fog_sky_affect == null) gdext.classes.Environment.mb_get_volumetric_fog_sky_affect = MethodBind.get("Environment", "get_volumetric_fog_sky_affect", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Environment.mb_get_volumetric_fog_sky_affect, livePtr)
  }

  /** Environment.set_volumetric_fog_temporal_reprojection_enabled */
  final def setVolumetricFogTemporalReprojectionEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.Environment.mb_set_volumetric_fog_temporal_reprojection_enabled == null) gdext.classes.Environment.mb_set_volumetric_fog_temporal_reprojection_enabled = MethodBind.get("Environment", "set_volumetric_fog_temporal_reprojection_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_volumetric_fog_temporal_reprojection_enabled, livePtr, enabled)
  }

  /** Environment.is_volumetric_fog_temporal_reprojection_enabled */
  final def isVolumetricFogTemporalReprojectionEnabled(): Boolean = {
    if (gdext.classes.Environment.mb_is_volumetric_fog_temporal_reprojection_enabled == null) gdext.classes.Environment.mb_is_volumetric_fog_temporal_reprojection_enabled = MethodBind.get("Environment", "is_volumetric_fog_temporal_reprojection_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Environment.mb_is_volumetric_fog_temporal_reprojection_enabled, livePtr)
  }

  /** Environment.set_volumetric_fog_temporal_reprojection_amount */
  final def setVolumetricFogTemporalReprojectionAmount(temporalReprojectionAmount: Double): Unit = {
    if (gdext.classes.Environment.mb_set_volumetric_fog_temporal_reprojection_amount == null) gdext.classes.Environment.mb_set_volumetric_fog_temporal_reprojection_amount = MethodBind.get("Environment", "set_volumetric_fog_temporal_reprojection_amount", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_volumetric_fog_temporal_reprojection_amount, livePtr, temporalReprojectionAmount)
  }

  /** Environment.get_volumetric_fog_temporal_reprojection_amount */
  final def getVolumetricFogTemporalReprojectionAmount(): Double = {
    if (gdext.classes.Environment.mb_get_volumetric_fog_temporal_reprojection_amount == null) gdext.classes.Environment.mb_get_volumetric_fog_temporal_reprojection_amount = MethodBind.get("Environment", "get_volumetric_fog_temporal_reprojection_amount", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Environment.mb_get_volumetric_fog_temporal_reprojection_amount, livePtr)
  }

  /** Environment.set_adjustment_enabled */
  final def setAdjustmentEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.Environment.mb_set_adjustment_enabled == null) gdext.classes.Environment.mb_set_adjustment_enabled = MethodBind.get("Environment", "set_adjustment_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_adjustment_enabled, livePtr, enabled)
  }

  /** Environment.is_adjustment_enabled */
  final def isAdjustmentEnabled(): Boolean = {
    if (gdext.classes.Environment.mb_is_adjustment_enabled == null) gdext.classes.Environment.mb_is_adjustment_enabled = MethodBind.get("Environment", "is_adjustment_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Environment.mb_is_adjustment_enabled, livePtr)
  }

  /** Environment.set_adjustment_brightness */
  final def setAdjustmentBrightness(brightness: Double): Unit = {
    if (gdext.classes.Environment.mb_set_adjustment_brightness == null) gdext.classes.Environment.mb_set_adjustment_brightness = MethodBind.get("Environment", "set_adjustment_brightness", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_adjustment_brightness, livePtr, brightness)
  }

  /** Environment.get_adjustment_brightness */
  final def getAdjustmentBrightness(): Double = {
    if (gdext.classes.Environment.mb_get_adjustment_brightness == null) gdext.classes.Environment.mb_get_adjustment_brightness = MethodBind.get("Environment", "get_adjustment_brightness", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Environment.mb_get_adjustment_brightness, livePtr)
  }

  /** Environment.set_adjustment_contrast */
  final def setAdjustmentContrast(contrast: Double): Unit = {
    if (gdext.classes.Environment.mb_set_adjustment_contrast == null) gdext.classes.Environment.mb_set_adjustment_contrast = MethodBind.get("Environment", "set_adjustment_contrast", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_adjustment_contrast, livePtr, contrast)
  }

  /** Environment.get_adjustment_contrast */
  final def getAdjustmentContrast(): Double = {
    if (gdext.classes.Environment.mb_get_adjustment_contrast == null) gdext.classes.Environment.mb_get_adjustment_contrast = MethodBind.get("Environment", "get_adjustment_contrast", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Environment.mb_get_adjustment_contrast, livePtr)
  }

  /** Environment.set_adjustment_saturation */
  final def setAdjustmentSaturation(saturation: Double): Unit = {
    if (gdext.classes.Environment.mb_set_adjustment_saturation == null) gdext.classes.Environment.mb_set_adjustment_saturation = MethodBind.get("Environment", "set_adjustment_saturation", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_adjustment_saturation, livePtr, saturation)
  }

  /** Environment.get_adjustment_saturation */
  final def getAdjustmentSaturation(): Double = {
    if (gdext.classes.Environment.mb_get_adjustment_saturation == null) gdext.classes.Environment.mb_get_adjustment_saturation = MethodBind.get("Environment", "get_adjustment_saturation", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Environment.mb_get_adjustment_saturation, livePtr)
  }

  /** Environment.set_adjustment_color_correction */
  final def setAdjustmentColorCorrection(colorCorrection: Texture): Unit = {
    if (gdext.classes.Environment.mb_set_adjustment_color_correction == null) gdext.classes.Environment.mb_set_adjustment_color_correction = MethodBind.get("Environment", "set_adjustment_color_correction", 1790811099L)
    Ptrcall.callVoid1(gdext.classes.Environment.mb_set_adjustment_color_correction, livePtr, Wrappers.handle(colorCorrection))
  }

  /** Environment.get_adjustment_color_correction. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getAdjustmentColorCorrection(): Texture = {
    if (gdext.classes.Environment.mb_get_adjustment_color_correction == null) gdext.classes.Environment.mb_get_adjustment_color_correction = MethodBind.get("Environment", "get_adjustment_color_correction", 4037048985L)
    Wrappers.owned[Texture](Ptrcall.call0[Long](gdext.classes.Environment.mb_get_adjustment_color_correction, livePtr))
  }

}

object Environment {
  private[classes] var mb_set_background: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_background: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_sky: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_sky: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_sky_custom_fov: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_sky_custom_fov: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_sky_rotation: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_sky_rotation: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bg_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bg_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bg_energy_multiplier: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bg_energy_multiplier: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bg_intensity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bg_intensity: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_canvas_max_layer: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_canvas_max_layer: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_camera_feed_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_camera_feed_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_ambient_light_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_ambient_light_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_ambient_source: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_ambient_source: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_ambient_light_energy: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_ambient_light_energy: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_ambient_light_sky_contribution: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_ambient_light_sky_contribution: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_reflection_source: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_reflection_source: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tonemapper: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tonemapper: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tonemap_exposure: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tonemap_exposure: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tonemap_white: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tonemap_white: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tonemap_agx_white: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tonemap_agx_white: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tonemap_agx_contrast: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tonemap_agx_contrast: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_ssr_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_ssr_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_ssr_max_steps: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_ssr_max_steps: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_ssr_fade_in: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_ssr_fade_in: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_ssr_fade_out: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_ssr_fade_out: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_ssr_depth_tolerance: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_ssr_depth_tolerance: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_ssao_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_ssao_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_ssao_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_ssao_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_ssao_intensity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_ssao_intensity: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_ssao_power: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_ssao_power: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_ssao_detail: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_ssao_detail: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_ssao_horizon: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_ssao_horizon: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_ssao_sharpness: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_ssao_sharpness: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_ssao_direct_light_affect: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_ssao_direct_light_affect: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_ssao_ao_channel_affect: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_ssao_ao_channel_affect: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_ssil_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_ssil_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_ssil_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_ssil_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_ssil_intensity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_ssil_intensity: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_ssil_sharpness: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_ssil_sharpness: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_ssil_normal_rejection: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_ssil_normal_rejection: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_sdfgi_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_sdfgi_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_sdfgi_cascades: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_sdfgi_cascades: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_sdfgi_min_cell_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_sdfgi_min_cell_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_sdfgi_max_distance: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_sdfgi_max_distance: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_sdfgi_cascade0_distance: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_sdfgi_cascade0_distance: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_sdfgi_y_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_sdfgi_y_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_sdfgi_use_occlusion: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_sdfgi_using_occlusion: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_sdfgi_bounce_feedback: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_sdfgi_bounce_feedback: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_sdfgi_read_sky_light: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_sdfgi_reading_sky_light: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_sdfgi_energy: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_sdfgi_energy: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_sdfgi_normal_bias: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_sdfgi_normal_bias: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_sdfgi_probe_bias: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_sdfgi_probe_bias: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_glow_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_glow_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_glow_level: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_glow_level: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_glow_normalized: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_glow_normalized: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_glow_intensity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_glow_intensity: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_glow_strength: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_glow_strength: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_glow_mix: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_glow_mix: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_glow_bloom: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_glow_bloom: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_glow_blend_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_glow_blend_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_glow_hdr_bleed_threshold: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_glow_hdr_bleed_threshold: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_glow_hdr_bleed_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_glow_hdr_bleed_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_glow_hdr_luminance_cap: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_glow_hdr_luminance_cap: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_glow_map_strength: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_glow_map_strength: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_glow_map: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_glow_map: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_fog_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_fog_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_fog_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fog_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_fog_light_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fog_light_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_fog_light_energy: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fog_light_energy: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_fog_sun_scatter: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fog_sun_scatter: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_fog_density: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fog_density: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_fog_height: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fog_height: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_fog_height_density: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fog_height_density: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_fog_aerial_perspective: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fog_aerial_perspective: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_fog_sky_affect: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fog_sky_affect: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_fog_depth_curve: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fog_depth_curve: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_fog_depth_begin: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fog_depth_begin: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_fog_depth_end: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fog_depth_end: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_volumetric_fog_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_volumetric_fog_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_volumetric_fog_emission: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_volumetric_fog_emission: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_volumetric_fog_albedo: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_volumetric_fog_albedo: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_volumetric_fog_density: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_volumetric_fog_density: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_volumetric_fog_emission_energy: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_volumetric_fog_emission_energy: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_volumetric_fog_anisotropy: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_volumetric_fog_anisotropy: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_volumetric_fog_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_volumetric_fog_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_volumetric_fog_detail_spread: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_volumetric_fog_detail_spread: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_volumetric_fog_gi_inject: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_volumetric_fog_gi_inject: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_volumetric_fog_ambient_inject: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_volumetric_fog_ambient_inject: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_volumetric_fog_sky_affect: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_volumetric_fog_sky_affect: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_volumetric_fog_temporal_reprojection_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_volumetric_fog_temporal_reprojection_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_volumetric_fog_temporal_reprojection_amount: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_volumetric_fog_temporal_reprojection_amount: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_adjustment_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_adjustment_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_adjustment_brightness: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_adjustment_brightness: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_adjustment_contrast: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_adjustment_contrast: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_adjustment_saturation: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_adjustment_saturation: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_adjustment_color_correction: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_adjustment_color_correction: GDExtensionMethodBindPtr = null

  /** Godot enum `Environment.BGMode`. */
  opaque type BGMode <: Long = Long

  object BGMode {
    final val ClearColor: BGMode = 0L.asInstanceOf[BGMode]
    final val Color: BGMode = 1L.asInstanceOf[BGMode]
    final val Sky: BGMode = 2L.asInstanceOf[BGMode]
    final val Canvas: BGMode = 3L.asInstanceOf[BGMode]
    final val Keep: BGMode = 4L.asInstanceOf[BGMode]
    final val CameraFeed: BGMode = 5L.asInstanceOf[BGMode]
    final val Max: BGMode = 6L.asInstanceOf[BGMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): BGMode = value.asInstanceOf[BGMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[BGMode] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L).asInstanceOf[scala.IArray[BGMode]]

    extension (self: BGMode)
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

  /** Godot enum `Environment.AmbientSource`. */
  opaque type AmbientSource <: Long = Long

  object AmbientSource {
    final val Bg: AmbientSource = 0L.asInstanceOf[AmbientSource]
    final val Disabled: AmbientSource = 1L.asInstanceOf[AmbientSource]
    final val Color: AmbientSource = 2L.asInstanceOf[AmbientSource]
    final val Sky: AmbientSource = 3L.asInstanceOf[AmbientSource]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): AmbientSource = value.asInstanceOf[AmbientSource]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[AmbientSource] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[AmbientSource]]

    extension (self: AmbientSource)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Bg"
        case 1L => "Disabled"
        case 2L => "Color"
        case 3L => "Sky"
        case other => other.toString
      }
  }

  /** Godot enum `Environment.ReflectionSource`. */
  opaque type ReflectionSource <: Long = Long

  object ReflectionSource {
    final val Bg: ReflectionSource = 0L.asInstanceOf[ReflectionSource]
    final val Disabled: ReflectionSource = 1L.asInstanceOf[ReflectionSource]
    final val Sky: ReflectionSource = 2L.asInstanceOf[ReflectionSource]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ReflectionSource = value.asInstanceOf[ReflectionSource]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ReflectionSource] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[ReflectionSource]]

    extension (self: ReflectionSource)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Bg"
        case 1L => "Disabled"
        case 2L => "Sky"
        case other => other.toString
      }
  }

  /** Godot enum `Environment.ToneMapper`. */
  opaque type ToneMapper <: Long = Long

  object ToneMapper {
    final val Linear: ToneMapper = 0L.asInstanceOf[ToneMapper]
    final val Reinhardt: ToneMapper = 1L.asInstanceOf[ToneMapper]
    final val Filmic: ToneMapper = 2L.asInstanceOf[ToneMapper]
    final val Aces: ToneMapper = 3L.asInstanceOf[ToneMapper]
    final val Agx: ToneMapper = 4L.asInstanceOf[ToneMapper]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ToneMapper = value.asInstanceOf[ToneMapper]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ToneMapper] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L).asInstanceOf[scala.IArray[ToneMapper]]

    extension (self: ToneMapper)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Linear"
        case 1L => "Reinhardt"
        case 2L => "Filmic"
        case 3L => "Aces"
        case 4L => "Agx"
        case other => other.toString
      }
  }

  /** Godot enum `Environment.GlowBlendMode`. */
  opaque type GlowBlendMode <: Long = Long

  object GlowBlendMode {
    final val Additive: GlowBlendMode = 0L.asInstanceOf[GlowBlendMode]
    final val Screen: GlowBlendMode = 1L.asInstanceOf[GlowBlendMode]
    final val Softlight: GlowBlendMode = 2L.asInstanceOf[GlowBlendMode]
    final val Replace: GlowBlendMode = 3L.asInstanceOf[GlowBlendMode]
    final val Mix: GlowBlendMode = 4L.asInstanceOf[GlowBlendMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): GlowBlendMode = value.asInstanceOf[GlowBlendMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[GlowBlendMode] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L).asInstanceOf[scala.IArray[GlowBlendMode]]

    extension (self: GlowBlendMode)
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

  /** Godot enum `Environment.FogMode`. */
  opaque type FogMode <: Long = Long

  object FogMode {
    final val Exponential: FogMode = 0L.asInstanceOf[FogMode]
    final val Depth: FogMode = 1L.asInstanceOf[FogMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): FogMode = value.asInstanceOf[FogMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[FogMode] = scala.IArray[Long](0L, 1L).asInstanceOf[scala.IArray[FogMode]]

    extension (self: FogMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Exponential"
        case 1L => "Depth"
        case other => other.toString
      }
  }

  /** Godot enum `Environment.SDFGIYScale`. */
  opaque type SDFGIYScale <: Long = Long

  object SDFGIYScale {
    final val Scale50Percent: SDFGIYScale = 0L.asInstanceOf[SDFGIYScale]
    final val Scale75Percent: SDFGIYScale = 1L.asInstanceOf[SDFGIYScale]
    final val Scale100Percent: SDFGIYScale = 2L.asInstanceOf[SDFGIYScale]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): SDFGIYScale = value.asInstanceOf[SDFGIYScale]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[SDFGIYScale] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[SDFGIYScale]]

    extension (self: SDFGIYScale)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Scale50Percent"
        case 1L => "Scale75Percent"
        case 2L => "Scale100Percent"
        case other => other.toString
      }
  }
}
