package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `LightmapGI`, extends `VisualInstance3D`. */
abstract class LightmapGI extends VisualInstance3D {
  override def godotClassName: String = "LightmapGI"

  /** LightmapGI.set_light_data */
  final def setLightData(data: LightmapGIData): Unit = {
    if (gdext.classes.LightmapGI.mb_set_light_data == null) gdext.classes.LightmapGI.mb_set_light_data = MethodBind.get("LightmapGI", "set_light_data", 1790597277L)
    Ptrcall.callVoid1(gdext.classes.LightmapGI.mb_set_light_data, livePtr, Wrappers.handle(data))
  }

  /** LightmapGI.get_light_data. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getLightData(): LightmapGIData = {
    if (gdext.classes.LightmapGI.mb_get_light_data == null) gdext.classes.LightmapGI.mb_get_light_data = MethodBind.get("LightmapGI", "get_light_data", 290354153L)
    Wrappers.owned[LightmapGIData](Ptrcall.call0[Long](gdext.classes.LightmapGI.mb_get_light_data, livePtr))
  }

  /** LightmapGI.set_bake_quality */
  final def setBakeQuality(bakeQuality: gdext.classes.LightmapGI.BakeQuality): Unit = {
    if (gdext.classes.LightmapGI.mb_set_bake_quality == null) gdext.classes.LightmapGI.mb_set_bake_quality = MethodBind.get("LightmapGI", "set_bake_quality", 1192215803L)
    Ptrcall.callVoid1(gdext.classes.LightmapGI.mb_set_bake_quality, livePtr, bakeQuality)
  }

  /** LightmapGI.get_bake_quality */
  final def getBakeQuality(): gdext.classes.LightmapGI.BakeQuality = {
    if (gdext.classes.LightmapGI.mb_get_bake_quality == null) gdext.classes.LightmapGI.mb_get_bake_quality = MethodBind.get("LightmapGI", "get_bake_quality", 688832735L)
    gdext.classes.LightmapGI.BakeQuality(Ptrcall.call0[Long](gdext.classes.LightmapGI.mb_get_bake_quality, livePtr))
  }

  /** LightmapGI.set_bounces */
  final def setBounces(bounces: Long): Unit = {
    if (gdext.classes.LightmapGI.mb_set_bounces == null) gdext.classes.LightmapGI.mb_set_bounces = MethodBind.get("LightmapGI", "set_bounces", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.LightmapGI.mb_set_bounces, livePtr, bounces)
  }

  /** LightmapGI.get_bounces */
  final def getBounces(): Long = {
    if (gdext.classes.LightmapGI.mb_get_bounces == null) gdext.classes.LightmapGI.mb_get_bounces = MethodBind.get("LightmapGI", "get_bounces", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.LightmapGI.mb_get_bounces, livePtr)
  }

  /** LightmapGI.set_bounce_indirect_energy */
  final def setBounceIndirectEnergy(bounceIndirectEnergy: Double): Unit = {
    if (gdext.classes.LightmapGI.mb_set_bounce_indirect_energy == null) gdext.classes.LightmapGI.mb_set_bounce_indirect_energy = MethodBind.get("LightmapGI", "set_bounce_indirect_energy", 373806689L)
    Ptrcall.callVoid1(gdext.classes.LightmapGI.mb_set_bounce_indirect_energy, livePtr, bounceIndirectEnergy)
  }

  /** LightmapGI.get_bounce_indirect_energy */
  final def getBounceIndirectEnergy(): Double = {
    if (gdext.classes.LightmapGI.mb_get_bounce_indirect_energy == null) gdext.classes.LightmapGI.mb_get_bounce_indirect_energy = MethodBind.get("LightmapGI", "get_bounce_indirect_energy", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.LightmapGI.mb_get_bounce_indirect_energy, livePtr)
  }

  /** LightmapGI.set_generate_probes */
  final def setGenerateProbes(subdivision: gdext.classes.LightmapGI.GenerateProbes): Unit = {
    if (gdext.classes.LightmapGI.mb_set_generate_probes == null) gdext.classes.LightmapGI.mb_set_generate_probes = MethodBind.get("LightmapGI", "set_generate_probes", 549981046L)
    Ptrcall.callVoid1(gdext.classes.LightmapGI.mb_set_generate_probes, livePtr, subdivision)
  }

  /** LightmapGI.get_generate_probes */
  final def getGenerateProbes(): gdext.classes.LightmapGI.GenerateProbes = {
    if (gdext.classes.LightmapGI.mb_get_generate_probes == null) gdext.classes.LightmapGI.mb_get_generate_probes = MethodBind.get("LightmapGI", "get_generate_probes", 3930596226L)
    gdext.classes.LightmapGI.GenerateProbes(Ptrcall.call0[Long](gdext.classes.LightmapGI.mb_get_generate_probes, livePtr))
  }

  /** LightmapGI.set_bias */
  final def setBias(bias: Double): Unit = {
    if (gdext.classes.LightmapGI.mb_set_bias == null) gdext.classes.LightmapGI.mb_set_bias = MethodBind.get("LightmapGI", "set_bias", 373806689L)
    Ptrcall.callVoid1(gdext.classes.LightmapGI.mb_set_bias, livePtr, bias)
  }

  /** LightmapGI.get_bias */
  final def getBias(): Double = {
    if (gdext.classes.LightmapGI.mb_get_bias == null) gdext.classes.LightmapGI.mb_get_bias = MethodBind.get("LightmapGI", "get_bias", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.LightmapGI.mb_get_bias, livePtr)
  }

  /** LightmapGI.set_environment_mode */
  final def setEnvironmentMode(mode: gdext.classes.LightmapGI.EnvironmentMode): Unit = {
    if (gdext.classes.LightmapGI.mb_set_environment_mode == null) gdext.classes.LightmapGI.mb_set_environment_mode = MethodBind.get("LightmapGI", "set_environment_mode", 2282650285L)
    Ptrcall.callVoid1(gdext.classes.LightmapGI.mb_set_environment_mode, livePtr, mode)
  }

  /** LightmapGI.get_environment_mode */
  final def getEnvironmentMode(): gdext.classes.LightmapGI.EnvironmentMode = {
    if (gdext.classes.LightmapGI.mb_get_environment_mode == null) gdext.classes.LightmapGI.mb_get_environment_mode = MethodBind.get("LightmapGI", "get_environment_mode", 4128646479L)
    gdext.classes.LightmapGI.EnvironmentMode(Ptrcall.call0[Long](gdext.classes.LightmapGI.mb_get_environment_mode, livePtr))
  }

  /** LightmapGI.set_environment_custom_sky */
  final def setEnvironmentCustomSky(sky: Sky): Unit = {
    if (gdext.classes.LightmapGI.mb_set_environment_custom_sky == null) gdext.classes.LightmapGI.mb_set_environment_custom_sky = MethodBind.get("LightmapGI", "set_environment_custom_sky", 3336722921L)
    Ptrcall.callVoid1(gdext.classes.LightmapGI.mb_set_environment_custom_sky, livePtr, Wrappers.handle(sky))
  }

  /** LightmapGI.get_environment_custom_sky. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getEnvironmentCustomSky(): Sky = {
    if (gdext.classes.LightmapGI.mb_get_environment_custom_sky == null) gdext.classes.LightmapGI.mb_get_environment_custom_sky = MethodBind.get("LightmapGI", "get_environment_custom_sky", 1177136966L)
    Wrappers.owned[Sky](Ptrcall.call0[Long](gdext.classes.LightmapGI.mb_get_environment_custom_sky, livePtr))
  }

  /** LightmapGI.set_environment_custom_color */
  final def setEnvironmentCustomColor(color: gdext.builtin.Color): Unit = {
    if (gdext.classes.LightmapGI.mb_set_environment_custom_color == null) gdext.classes.LightmapGI.mb_set_environment_custom_color = MethodBind.get("LightmapGI", "set_environment_custom_color", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.LightmapGI.mb_set_environment_custom_color, livePtr, color)
  }

  /** LightmapGI.get_environment_custom_color */
  final def getEnvironmentCustomColor(): gdext.builtin.Color = {
    if (gdext.classes.LightmapGI.mb_get_environment_custom_color == null) gdext.classes.LightmapGI.mb_get_environment_custom_color = MethodBind.get("LightmapGI", "get_environment_custom_color", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.LightmapGI.mb_get_environment_custom_color, livePtr)
  }

  /** LightmapGI.set_environment_custom_energy */
  final def setEnvironmentCustomEnergy(energy: Double): Unit = {
    if (gdext.classes.LightmapGI.mb_set_environment_custom_energy == null) gdext.classes.LightmapGI.mb_set_environment_custom_energy = MethodBind.get("LightmapGI", "set_environment_custom_energy", 373806689L)
    Ptrcall.callVoid1(gdext.classes.LightmapGI.mb_set_environment_custom_energy, livePtr, energy)
  }

  /** LightmapGI.get_environment_custom_energy */
  final def getEnvironmentCustomEnergy(): Double = {
    if (gdext.classes.LightmapGI.mb_get_environment_custom_energy == null) gdext.classes.LightmapGI.mb_get_environment_custom_energy = MethodBind.get("LightmapGI", "get_environment_custom_energy", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.LightmapGI.mb_get_environment_custom_energy, livePtr)
  }

  /** LightmapGI.set_texel_scale */
  final def setTexelScale(texelScale: Double): Unit = {
    if (gdext.classes.LightmapGI.mb_set_texel_scale == null) gdext.classes.LightmapGI.mb_set_texel_scale = MethodBind.get("LightmapGI", "set_texel_scale", 373806689L)
    Ptrcall.callVoid1(gdext.classes.LightmapGI.mb_set_texel_scale, livePtr, texelScale)
  }

  /** LightmapGI.get_texel_scale */
  final def getTexelScale(): Double = {
    if (gdext.classes.LightmapGI.mb_get_texel_scale == null) gdext.classes.LightmapGI.mb_get_texel_scale = MethodBind.get("LightmapGI", "get_texel_scale", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.LightmapGI.mb_get_texel_scale, livePtr)
  }

  /** LightmapGI.set_max_texture_size */
  final def setMaxTextureSize(maxTextureSize: Long): Unit = {
    if (gdext.classes.LightmapGI.mb_set_max_texture_size == null) gdext.classes.LightmapGI.mb_set_max_texture_size = MethodBind.get("LightmapGI", "set_max_texture_size", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.LightmapGI.mb_set_max_texture_size, livePtr, maxTextureSize)
  }

  /** LightmapGI.get_max_texture_size */
  final def getMaxTextureSize(): Long = {
    if (gdext.classes.LightmapGI.mb_get_max_texture_size == null) gdext.classes.LightmapGI.mb_get_max_texture_size = MethodBind.get("LightmapGI", "get_max_texture_size", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.LightmapGI.mb_get_max_texture_size, livePtr)
  }

  /** LightmapGI.set_supersampling_enabled */
  final def setSupersamplingEnabled(enable: Boolean): Unit = {
    if (gdext.classes.LightmapGI.mb_set_supersampling_enabled == null) gdext.classes.LightmapGI.mb_set_supersampling_enabled = MethodBind.get("LightmapGI", "set_supersampling_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.LightmapGI.mb_set_supersampling_enabled, livePtr, enable)
  }

  /** LightmapGI.is_supersampling_enabled */
  final def isSupersamplingEnabled(): Boolean = {
    if (gdext.classes.LightmapGI.mb_is_supersampling_enabled == null) gdext.classes.LightmapGI.mb_is_supersampling_enabled = MethodBind.get("LightmapGI", "is_supersampling_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.LightmapGI.mb_is_supersampling_enabled, livePtr)
  }

  /** LightmapGI.set_supersampling_factor */
  final def setSupersamplingFactor(factor: Double): Unit = {
    if (gdext.classes.LightmapGI.mb_set_supersampling_factor == null) gdext.classes.LightmapGI.mb_set_supersampling_factor = MethodBind.get("LightmapGI", "set_supersampling_factor", 373806689L)
    Ptrcall.callVoid1(gdext.classes.LightmapGI.mb_set_supersampling_factor, livePtr, factor)
  }

  /** LightmapGI.get_supersampling_factor */
  final def getSupersamplingFactor(): Double = {
    if (gdext.classes.LightmapGI.mb_get_supersampling_factor == null) gdext.classes.LightmapGI.mb_get_supersampling_factor = MethodBind.get("LightmapGI", "get_supersampling_factor", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.LightmapGI.mb_get_supersampling_factor, livePtr)
  }

  /** LightmapGI.set_use_denoiser */
  final def setUseDenoiser(useDenoiser: Boolean): Unit = {
    if (gdext.classes.LightmapGI.mb_set_use_denoiser == null) gdext.classes.LightmapGI.mb_set_use_denoiser = MethodBind.get("LightmapGI", "set_use_denoiser", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.LightmapGI.mb_set_use_denoiser, livePtr, useDenoiser)
  }

  /** LightmapGI.is_using_denoiser */
  final def isUsingDenoiser(): Boolean = {
    if (gdext.classes.LightmapGI.mb_is_using_denoiser == null) gdext.classes.LightmapGI.mb_is_using_denoiser = MethodBind.get("LightmapGI", "is_using_denoiser", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.LightmapGI.mb_is_using_denoiser, livePtr)
  }

  /** LightmapGI.set_denoiser_strength */
  final def setDenoiserStrength(denoiserStrength: Double): Unit = {
    if (gdext.classes.LightmapGI.mb_set_denoiser_strength == null) gdext.classes.LightmapGI.mb_set_denoiser_strength = MethodBind.get("LightmapGI", "set_denoiser_strength", 373806689L)
    Ptrcall.callVoid1(gdext.classes.LightmapGI.mb_set_denoiser_strength, livePtr, denoiserStrength)
  }

  /** LightmapGI.get_denoiser_strength */
  final def getDenoiserStrength(): Double = {
    if (gdext.classes.LightmapGI.mb_get_denoiser_strength == null) gdext.classes.LightmapGI.mb_get_denoiser_strength = MethodBind.get("LightmapGI", "get_denoiser_strength", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.LightmapGI.mb_get_denoiser_strength, livePtr)
  }

  /** LightmapGI.set_denoiser_range */
  final def setDenoiserRange(denoiserRange: Long): Unit = {
    if (gdext.classes.LightmapGI.mb_set_denoiser_range == null) gdext.classes.LightmapGI.mb_set_denoiser_range = MethodBind.get("LightmapGI", "set_denoiser_range", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.LightmapGI.mb_set_denoiser_range, livePtr, denoiserRange)
  }

  /** LightmapGI.get_denoiser_range */
  final def getDenoiserRange(): Long = {
    if (gdext.classes.LightmapGI.mb_get_denoiser_range == null) gdext.classes.LightmapGI.mb_get_denoiser_range = MethodBind.get("LightmapGI", "get_denoiser_range", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.LightmapGI.mb_get_denoiser_range, livePtr)
  }

  /** LightmapGI.set_interior */
  final def setInterior(enable: Boolean): Unit = {
    if (gdext.classes.LightmapGI.mb_set_interior == null) gdext.classes.LightmapGI.mb_set_interior = MethodBind.get("LightmapGI", "set_interior", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.LightmapGI.mb_set_interior, livePtr, enable)
  }

  /** LightmapGI.is_interior */
  final def isInterior(): Boolean = {
    if (gdext.classes.LightmapGI.mb_is_interior == null) gdext.classes.LightmapGI.mb_is_interior = MethodBind.get("LightmapGI", "is_interior", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.LightmapGI.mb_is_interior, livePtr)
  }

  /** LightmapGI.set_directional */
  final def setDirectional(directional: Boolean): Unit = {
    if (gdext.classes.LightmapGI.mb_set_directional == null) gdext.classes.LightmapGI.mb_set_directional = MethodBind.get("LightmapGI", "set_directional", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.LightmapGI.mb_set_directional, livePtr, directional)
  }

  /** LightmapGI.is_directional */
  final def isDirectional(): Boolean = {
    if (gdext.classes.LightmapGI.mb_is_directional == null) gdext.classes.LightmapGI.mb_is_directional = MethodBind.get("LightmapGI", "is_directional", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.LightmapGI.mb_is_directional, livePtr)
  }

  /** LightmapGI.set_shadowmask_mode */
  final def setShadowmaskMode(mode: gdext.classes.LightmapGIData.ShadowmaskMode): Unit = {
    if (gdext.classes.LightmapGI.mb_set_shadowmask_mode == null) gdext.classes.LightmapGI.mb_set_shadowmask_mode = MethodBind.get("LightmapGI", "set_shadowmask_mode", 3451066572L)
    Ptrcall.callVoid1(gdext.classes.LightmapGI.mb_set_shadowmask_mode, livePtr, mode)
  }

  /** LightmapGI.get_shadowmask_mode */
  final def getShadowmaskMode(): gdext.classes.LightmapGIData.ShadowmaskMode = {
    if (gdext.classes.LightmapGI.mb_get_shadowmask_mode == null) gdext.classes.LightmapGI.mb_get_shadowmask_mode = MethodBind.get("LightmapGI", "get_shadowmask_mode", 785478560L)
    gdext.classes.LightmapGIData.ShadowmaskMode(Ptrcall.call0[Long](gdext.classes.LightmapGI.mb_get_shadowmask_mode, livePtr))
  }

  /** LightmapGI.set_use_texture_for_bounces */
  final def setUseTextureForBounces(useTextureForBounces: Boolean): Unit = {
    if (gdext.classes.LightmapGI.mb_set_use_texture_for_bounces == null) gdext.classes.LightmapGI.mb_set_use_texture_for_bounces = MethodBind.get("LightmapGI", "set_use_texture_for_bounces", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.LightmapGI.mb_set_use_texture_for_bounces, livePtr, useTextureForBounces)
  }

  /** LightmapGI.is_using_texture_for_bounces */
  final def isUsingTextureForBounces(): Boolean = {
    if (gdext.classes.LightmapGI.mb_is_using_texture_for_bounces == null) gdext.classes.LightmapGI.mb_is_using_texture_for_bounces = MethodBind.get("LightmapGI", "is_using_texture_for_bounces", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.LightmapGI.mb_is_using_texture_for_bounces, livePtr)
  }

  /** LightmapGI.set_camera_attributes */
  final def setCameraAttributes(cameraAttributes: CameraAttributes): Unit = {
    if (gdext.classes.LightmapGI.mb_set_camera_attributes == null) gdext.classes.LightmapGI.mb_set_camera_attributes = MethodBind.get("LightmapGI", "set_camera_attributes", 2817810567L)
    Ptrcall.callVoid1(gdext.classes.LightmapGI.mb_set_camera_attributes, livePtr, Wrappers.handle(cameraAttributes))
  }

  /** LightmapGI.get_camera_attributes. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getCameraAttributes(): CameraAttributes = {
    if (gdext.classes.LightmapGI.mb_get_camera_attributes == null) gdext.classes.LightmapGI.mb_get_camera_attributes = MethodBind.get("LightmapGI", "get_camera_attributes", 3921283215L)
    Wrappers.owned[CameraAttributes](Ptrcall.call0[Long](gdext.classes.LightmapGI.mb_get_camera_attributes, livePtr))
  }

}

object LightmapGI {
  private[classes] var mb_set_light_data: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_light_data: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bake_quality: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bake_quality: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bounces: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bounces: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bounce_indirect_energy: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bounce_indirect_energy: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_generate_probes: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_generate_probes: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bias: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bias: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_environment_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_environment_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_environment_custom_sky: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_environment_custom_sky: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_environment_custom_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_environment_custom_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_environment_custom_energy: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_environment_custom_energy: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_texel_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texel_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_max_texture_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_max_texture_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_supersampling_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_supersampling_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_supersampling_factor: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_supersampling_factor: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_use_denoiser: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_using_denoiser: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_denoiser_strength: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_denoiser_strength: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_denoiser_range: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_denoiser_range: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_interior: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_interior: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_directional: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_directional: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_shadowmask_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_shadowmask_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_use_texture_for_bounces: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_using_texture_for_bounces: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_camera_attributes: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_camera_attributes: GDExtensionMethodBindPtr = null

  /** Godot enum `LightmapGI.BakeQuality`. */
  opaque type BakeQuality <: Long = Long

  object BakeQuality {
    final val Low: BakeQuality = 0L.asInstanceOf[BakeQuality]
    final val Medium: BakeQuality = 1L.asInstanceOf[BakeQuality]
    final val High: BakeQuality = 2L.asInstanceOf[BakeQuality]
    final val Ultra: BakeQuality = 3L.asInstanceOf[BakeQuality]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): BakeQuality = value.asInstanceOf[BakeQuality]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[BakeQuality] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[BakeQuality]]

    extension (self: BakeQuality)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Low"
        case 1L => "Medium"
        case 2L => "High"
        case 3L => "Ultra"
        case other => other.toString
      }
  }

  /** Godot enum `LightmapGI.GenerateProbes`. */
  opaque type GenerateProbes <: Long = Long

  object GenerateProbes {
    final val Disabled: GenerateProbes = 0L.asInstanceOf[GenerateProbes]
    final val Subdiv4: GenerateProbes = 1L.asInstanceOf[GenerateProbes]
    final val Subdiv8: GenerateProbes = 2L.asInstanceOf[GenerateProbes]
    final val Subdiv16: GenerateProbes = 3L.asInstanceOf[GenerateProbes]
    final val Subdiv32: GenerateProbes = 4L.asInstanceOf[GenerateProbes]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): GenerateProbes = value.asInstanceOf[GenerateProbes]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[GenerateProbes] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L).asInstanceOf[scala.IArray[GenerateProbes]]

    extension (self: GenerateProbes)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Disabled"
        case 1L => "Subdiv4"
        case 2L => "Subdiv8"
        case 3L => "Subdiv16"
        case 4L => "Subdiv32"
        case other => other.toString
      }
  }

  /** Godot enum `LightmapGI.BakeError`. */
  opaque type BakeError <: Long = Long

  object BakeError {
    final val Ok: BakeError = 0L.asInstanceOf[BakeError]
    final val NoSceneRoot: BakeError = 1L.asInstanceOf[BakeError]
    final val ForeignData: BakeError = 2L.asInstanceOf[BakeError]
    final val NoLightmapper: BakeError = 3L.asInstanceOf[BakeError]
    final val NoSavePath: BakeError = 4L.asInstanceOf[BakeError]
    final val NoMeshes: BakeError = 5L.asInstanceOf[BakeError]
    final val MeshesInvalid: BakeError = 6L.asInstanceOf[BakeError]
    final val CantCreateImage: BakeError = 7L.asInstanceOf[BakeError]
    final val UserAborted: BakeError = 8L.asInstanceOf[BakeError]
    final val TextureSizeTooSmall: BakeError = 9L.asInstanceOf[BakeError]
    final val LightmapTooSmall: BakeError = 10L.asInstanceOf[BakeError]
    final val AtlasTooSmall: BakeError = 11L.asInstanceOf[BakeError]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): BakeError = value.asInstanceOf[BakeError]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[BakeError] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 11L).asInstanceOf[scala.IArray[BakeError]]

    extension (self: BakeError)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Ok"
        case 1L => "NoSceneRoot"
        case 2L => "ForeignData"
        case 3L => "NoLightmapper"
        case 4L => "NoSavePath"
        case 5L => "NoMeshes"
        case 6L => "MeshesInvalid"
        case 7L => "CantCreateImage"
        case 8L => "UserAborted"
        case 9L => "TextureSizeTooSmall"
        case 10L => "LightmapTooSmall"
        case 11L => "AtlasTooSmall"
        case other => other.toString
      }
  }

  /** Godot enum `LightmapGI.EnvironmentMode`. */
  opaque type EnvironmentMode <: Long = Long

  object EnvironmentMode {
    final val Disabled: EnvironmentMode = 0L.asInstanceOf[EnvironmentMode]
    final val Scene: EnvironmentMode = 1L.asInstanceOf[EnvironmentMode]
    final val CustomSky: EnvironmentMode = 2L.asInstanceOf[EnvironmentMode]
    final val CustomColor: EnvironmentMode = 3L.asInstanceOf[EnvironmentMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): EnvironmentMode = value.asInstanceOf[EnvironmentMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[EnvironmentMode] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[EnvironmentMode]]

    extension (self: EnvironmentMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Disabled"
        case 1L => "Scene"
        case 2L => "CustomSky"
        case 3L => "CustomColor"
        case other => other.toString
      }
  }
}
