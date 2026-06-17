package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `LightmapGI`, extends `VisualInstance3D`. */
abstract class LightmapGI extends VisualInstance3D {

  /** LightmapGI.set_light_data */
  final def setLightData(data: LightmapGIData): Unit =
    Ptrcall.callVoid1(MethodBind.get("LightmapGI", "set_light_data", 1790597277L), hostObject.objectPtr, data.hostObject)

  /** LightmapGI.get_light_data */
  final def getLightData(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("LightmapGI", "get_light_data", 290354153L), hostObject.objectPtr)

  /** LightmapGI.set_bake_quality */
  final def setBakeQuality(bake_quality: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("LightmapGI", "set_bake_quality", 1192215803L), hostObject.objectPtr, bake_quality)

  /** LightmapGI.get_bake_quality */
  final def getBakeQuality(): Long =
    Ptrcall.call0[Long](MethodBind.get("LightmapGI", "get_bake_quality", 688832735L), hostObject.objectPtr)

  /** LightmapGI.set_bounces */
  final def setBounces(bounces: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("LightmapGI", "set_bounces", 1286410249L), hostObject.objectPtr, bounces)

  /** LightmapGI.get_bounces */
  final def getBounces(): Long =
    Ptrcall.call0[Long](MethodBind.get("LightmapGI", "get_bounces", 3905245786L), hostObject.objectPtr)

  /** LightmapGI.set_bounce_indirect_energy */
  final def setBounceIndirectEnergy(bounce_indirect_energy: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("LightmapGI", "set_bounce_indirect_energy", 373806689L), hostObject.objectPtr, bounce_indirect_energy)

  /** LightmapGI.get_bounce_indirect_energy */
  final def getBounceIndirectEnergy(): Double =
    Ptrcall.call0[Double](MethodBind.get("LightmapGI", "get_bounce_indirect_energy", 1740695150L), hostObject.objectPtr)

  /** LightmapGI.set_generate_probes */
  final def setGenerateProbes(subdivision: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("LightmapGI", "set_generate_probes", 549981046L), hostObject.objectPtr, subdivision)

  /** LightmapGI.get_generate_probes */
  final def getGenerateProbes(): Long =
    Ptrcall.call0[Long](MethodBind.get("LightmapGI", "get_generate_probes", 3930596226L), hostObject.objectPtr)

  /** LightmapGI.set_bias */
  final def setBias(bias: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("LightmapGI", "set_bias", 373806689L), hostObject.objectPtr, bias)

  /** LightmapGI.get_bias */
  final def getBias(): Double =
    Ptrcall.call0[Double](MethodBind.get("LightmapGI", "get_bias", 1740695150L), hostObject.objectPtr)

  /** LightmapGI.set_environment_mode */
  final def setEnvironmentMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("LightmapGI", "set_environment_mode", 2282650285L), hostObject.objectPtr, mode)

  /** LightmapGI.get_environment_mode */
  final def getEnvironmentMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("LightmapGI", "get_environment_mode", 4128646479L), hostObject.objectPtr)

  /** LightmapGI.set_environment_custom_sky */
  final def setEnvironmentCustomSky(sky: Sky): Unit =
    Ptrcall.callVoid1(MethodBind.get("LightmapGI", "set_environment_custom_sky", 3336722921L), hostObject.objectPtr, sky.hostObject)

  /** LightmapGI.get_environment_custom_sky */
  final def getEnvironmentCustomSky(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("LightmapGI", "get_environment_custom_sky", 1177136966L), hostObject.objectPtr)

  /** LightmapGI.set_environment_custom_color */
  final def setEnvironmentCustomColor(color: io.github.optical002.godot.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("LightmapGI", "set_environment_custom_color", 2920490490L), hostObject.objectPtr, color)

  /** LightmapGI.get_environment_custom_color */
  final def getEnvironmentCustomColor(): io.github.optical002.godot.builtin.Color =
    Ptrcall.call0[io.github.optical002.godot.builtin.Color](MethodBind.get("LightmapGI", "get_environment_custom_color", 3444240500L), hostObject.objectPtr)

  /** LightmapGI.set_environment_custom_energy */
  final def setEnvironmentCustomEnergy(energy: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("LightmapGI", "set_environment_custom_energy", 373806689L), hostObject.objectPtr, energy)

  /** LightmapGI.get_environment_custom_energy */
  final def getEnvironmentCustomEnergy(): Double =
    Ptrcall.call0[Double](MethodBind.get("LightmapGI", "get_environment_custom_energy", 1740695150L), hostObject.objectPtr)

  /** LightmapGI.set_texel_scale */
  final def setTexelScale(texel_scale: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("LightmapGI", "set_texel_scale", 373806689L), hostObject.objectPtr, texel_scale)

  /** LightmapGI.get_texel_scale */
  final def getTexelScale(): Double =
    Ptrcall.call0[Double](MethodBind.get("LightmapGI", "get_texel_scale", 1740695150L), hostObject.objectPtr)

  /** LightmapGI.set_max_texture_size */
  final def setMaxTextureSize(max_texture_size: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("LightmapGI", "set_max_texture_size", 1286410249L), hostObject.objectPtr, max_texture_size)

  /** LightmapGI.get_max_texture_size */
  final def getMaxTextureSize(): Long =
    Ptrcall.call0[Long](MethodBind.get("LightmapGI", "get_max_texture_size", 3905245786L), hostObject.objectPtr)

  /** LightmapGI.set_supersampling_enabled */
  final def setSupersamplingEnabled(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("LightmapGI", "set_supersampling_enabled", 2586408642L), hostObject.objectPtr, enable)

  /** LightmapGI.is_supersampling_enabled */
  final def isSupersamplingEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("LightmapGI", "is_supersampling_enabled", 36873697L), hostObject.objectPtr)

  /** LightmapGI.set_supersampling_factor */
  final def setSupersamplingFactor(factor: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("LightmapGI", "set_supersampling_factor", 373806689L), hostObject.objectPtr, factor)

  /** LightmapGI.get_supersampling_factor */
  final def getSupersamplingFactor(): Double =
    Ptrcall.call0[Double](MethodBind.get("LightmapGI", "get_supersampling_factor", 1740695150L), hostObject.objectPtr)

  /** LightmapGI.set_use_denoiser */
  final def setUseDenoiser(use_denoiser: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("LightmapGI", "set_use_denoiser", 2586408642L), hostObject.objectPtr, use_denoiser)

  /** LightmapGI.is_using_denoiser */
  final def isUsingDenoiser(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("LightmapGI", "is_using_denoiser", 36873697L), hostObject.objectPtr)

  /** LightmapGI.set_denoiser_strength */
  final def setDenoiserStrength(denoiser_strength: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("LightmapGI", "set_denoiser_strength", 373806689L), hostObject.objectPtr, denoiser_strength)

  /** LightmapGI.get_denoiser_strength */
  final def getDenoiserStrength(): Double =
    Ptrcall.call0[Double](MethodBind.get("LightmapGI", "get_denoiser_strength", 1740695150L), hostObject.objectPtr)

  /** LightmapGI.set_denoiser_range */
  final def setDenoiserRange(denoiser_range: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("LightmapGI", "set_denoiser_range", 1286410249L), hostObject.objectPtr, denoiser_range)

  /** LightmapGI.get_denoiser_range */
  final def getDenoiserRange(): Long =
    Ptrcall.call0[Long](MethodBind.get("LightmapGI", "get_denoiser_range", 3905245786L), hostObject.objectPtr)

  /** LightmapGI.set_interior */
  final def setInterior(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("LightmapGI", "set_interior", 2586408642L), hostObject.objectPtr, enable)

  /** LightmapGI.is_interior */
  final def isInterior(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("LightmapGI", "is_interior", 36873697L), hostObject.objectPtr)

  /** LightmapGI.set_directional */
  final def setDirectional(directional: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("LightmapGI", "set_directional", 2586408642L), hostObject.objectPtr, directional)

  /** LightmapGI.is_directional */
  final def isDirectional(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("LightmapGI", "is_directional", 36873697L), hostObject.objectPtr)

  /** LightmapGI.set_shadowmask_mode */
  final def setShadowmaskMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("LightmapGI", "set_shadowmask_mode", 3451066572L), hostObject.objectPtr, mode)

  /** LightmapGI.get_shadowmask_mode */
  final def getShadowmaskMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("LightmapGI", "get_shadowmask_mode", 785478560L), hostObject.objectPtr)

  /** LightmapGI.set_use_texture_for_bounces */
  final def setUseTextureForBounces(use_texture_for_bounces: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("LightmapGI", "set_use_texture_for_bounces", 2586408642L), hostObject.objectPtr, use_texture_for_bounces)

  /** LightmapGI.is_using_texture_for_bounces */
  final def isUsingTextureForBounces(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("LightmapGI", "is_using_texture_for_bounces", 36873697L), hostObject.objectPtr)

  /** LightmapGI.set_camera_attributes */
  final def setCameraAttributes(camera_attributes: CameraAttributes): Unit =
    Ptrcall.callVoid1(MethodBind.get("LightmapGI", "set_camera_attributes", 2817810567L), hostObject.objectPtr, camera_attributes.hostObject)

  /** LightmapGI.get_camera_attributes */
  final def getCameraAttributes(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("LightmapGI", "get_camera_attributes", 3921283215L), hostObject.objectPtr)

}

object LightmapGI {
  /** Class metadata for Gd[LightmapGI] lifetime management and casting. */
  given GodotClass[LightmapGI] with {
    def className = "LightmapGI"
    def isRefCounted = false
    def wrap(o: GodotObject): LightmapGI = new LightmapGI {}.withHost(o.objectPtr)
    def unwrap(t: LightmapGI): GodotObject = t.hostObject
  }
}
