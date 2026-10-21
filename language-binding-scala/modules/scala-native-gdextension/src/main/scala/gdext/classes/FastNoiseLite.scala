package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `FastNoiseLite`, extends `Noise`. */
abstract class FastNoiseLite extends Noise {
  override def godotClassName: String = "FastNoiseLite"

  /** FastNoiseLite.set_noise_type */
  final def setNoiseType(`type`: Long): Unit = {
    if (gdext.classes.FastNoiseLite.mb_set_noise_type == null) gdext.classes.FastNoiseLite.mb_set_noise_type = MethodBind.get("FastNoiseLite", "set_noise_type", 2624461392L)
    Ptrcall.callVoid1(gdext.classes.FastNoiseLite.mb_set_noise_type, livePtr, `type`)
  }

  /** FastNoiseLite.get_noise_type */
  final def getNoiseType(): Long = {
    if (gdext.classes.FastNoiseLite.mb_get_noise_type == null) gdext.classes.FastNoiseLite.mb_get_noise_type = MethodBind.get("FastNoiseLite", "get_noise_type", 1458108610L)
    Ptrcall.call0[Long](gdext.classes.FastNoiseLite.mb_get_noise_type, livePtr)
  }

  /** FastNoiseLite.set_seed */
  final def setSeed(seed: Long): Unit = {
    if (gdext.classes.FastNoiseLite.mb_set_seed == null) gdext.classes.FastNoiseLite.mb_set_seed = MethodBind.get("FastNoiseLite", "set_seed", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.FastNoiseLite.mb_set_seed, livePtr, seed)
  }

  /** FastNoiseLite.get_seed */
  final def getSeed(): Long = {
    if (gdext.classes.FastNoiseLite.mb_get_seed == null) gdext.classes.FastNoiseLite.mb_get_seed = MethodBind.get("FastNoiseLite", "get_seed", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.FastNoiseLite.mb_get_seed, livePtr)
  }

  /** FastNoiseLite.set_frequency */
  final def setFrequency(freq: Double): Unit = {
    if (gdext.classes.FastNoiseLite.mb_set_frequency == null) gdext.classes.FastNoiseLite.mb_set_frequency = MethodBind.get("FastNoiseLite", "set_frequency", 373806689L)
    Ptrcall.callVoid1(gdext.classes.FastNoiseLite.mb_set_frequency, livePtr, freq)
  }

  /** FastNoiseLite.get_frequency */
  final def getFrequency(): Double = {
    if (gdext.classes.FastNoiseLite.mb_get_frequency == null) gdext.classes.FastNoiseLite.mb_get_frequency = MethodBind.get("FastNoiseLite", "get_frequency", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.FastNoiseLite.mb_get_frequency, livePtr)
  }

  /** FastNoiseLite.set_offset */
  final def setOffset(offset: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.FastNoiseLite.mb_set_offset == null) gdext.classes.FastNoiseLite.mb_set_offset = MethodBind.get("FastNoiseLite", "set_offset", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.FastNoiseLite.mb_set_offset, livePtr, offset)
  }

  /** FastNoiseLite.get_offset */
  final def getOffset(): gdext.builtin.Vector3 = {
    if (gdext.classes.FastNoiseLite.mb_get_offset == null) gdext.classes.FastNoiseLite.mb_get_offset = MethodBind.get("FastNoiseLite", "get_offset", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.FastNoiseLite.mb_get_offset, livePtr)
  }

  /** FastNoiseLite.set_fractal_type */
  final def setFractalType(`type`: Long): Unit = {
    if (gdext.classes.FastNoiseLite.mb_set_fractal_type == null) gdext.classes.FastNoiseLite.mb_set_fractal_type = MethodBind.get("FastNoiseLite", "set_fractal_type", 4132731174L)
    Ptrcall.callVoid1(gdext.classes.FastNoiseLite.mb_set_fractal_type, livePtr, `type`)
  }

  /** FastNoiseLite.get_fractal_type */
  final def getFractalType(): Long = {
    if (gdext.classes.FastNoiseLite.mb_get_fractal_type == null) gdext.classes.FastNoiseLite.mb_get_fractal_type = MethodBind.get("FastNoiseLite", "get_fractal_type", 1036889279L)
    Ptrcall.call0[Long](gdext.classes.FastNoiseLite.mb_get_fractal_type, livePtr)
  }

  /** FastNoiseLite.set_fractal_octaves */
  final def setFractalOctaves(octave_count: Long): Unit = {
    if (gdext.classes.FastNoiseLite.mb_set_fractal_octaves == null) gdext.classes.FastNoiseLite.mb_set_fractal_octaves = MethodBind.get("FastNoiseLite", "set_fractal_octaves", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.FastNoiseLite.mb_set_fractal_octaves, livePtr, octave_count)
  }

  /** FastNoiseLite.get_fractal_octaves */
  final def getFractalOctaves(): Long = {
    if (gdext.classes.FastNoiseLite.mb_get_fractal_octaves == null) gdext.classes.FastNoiseLite.mb_get_fractal_octaves = MethodBind.get("FastNoiseLite", "get_fractal_octaves", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.FastNoiseLite.mb_get_fractal_octaves, livePtr)
  }

  /** FastNoiseLite.set_fractal_lacunarity */
  final def setFractalLacunarity(lacunarity: Double): Unit = {
    if (gdext.classes.FastNoiseLite.mb_set_fractal_lacunarity == null) gdext.classes.FastNoiseLite.mb_set_fractal_lacunarity = MethodBind.get("FastNoiseLite", "set_fractal_lacunarity", 373806689L)
    Ptrcall.callVoid1(gdext.classes.FastNoiseLite.mb_set_fractal_lacunarity, livePtr, lacunarity)
  }

  /** FastNoiseLite.get_fractal_lacunarity */
  final def getFractalLacunarity(): Double = {
    if (gdext.classes.FastNoiseLite.mb_get_fractal_lacunarity == null) gdext.classes.FastNoiseLite.mb_get_fractal_lacunarity = MethodBind.get("FastNoiseLite", "get_fractal_lacunarity", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.FastNoiseLite.mb_get_fractal_lacunarity, livePtr)
  }

  /** FastNoiseLite.set_fractal_gain */
  final def setFractalGain(gain: Double): Unit = {
    if (gdext.classes.FastNoiseLite.mb_set_fractal_gain == null) gdext.classes.FastNoiseLite.mb_set_fractal_gain = MethodBind.get("FastNoiseLite", "set_fractal_gain", 373806689L)
    Ptrcall.callVoid1(gdext.classes.FastNoiseLite.mb_set_fractal_gain, livePtr, gain)
  }

  /** FastNoiseLite.get_fractal_gain */
  final def getFractalGain(): Double = {
    if (gdext.classes.FastNoiseLite.mb_get_fractal_gain == null) gdext.classes.FastNoiseLite.mb_get_fractal_gain = MethodBind.get("FastNoiseLite", "get_fractal_gain", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.FastNoiseLite.mb_get_fractal_gain, livePtr)
  }

  /** FastNoiseLite.set_fractal_weighted_strength */
  final def setFractalWeightedStrength(weighted_strength: Double): Unit = {
    if (gdext.classes.FastNoiseLite.mb_set_fractal_weighted_strength == null) gdext.classes.FastNoiseLite.mb_set_fractal_weighted_strength = MethodBind.get("FastNoiseLite", "set_fractal_weighted_strength", 373806689L)
    Ptrcall.callVoid1(gdext.classes.FastNoiseLite.mb_set_fractal_weighted_strength, livePtr, weighted_strength)
  }

  /** FastNoiseLite.get_fractal_weighted_strength */
  final def getFractalWeightedStrength(): Double = {
    if (gdext.classes.FastNoiseLite.mb_get_fractal_weighted_strength == null) gdext.classes.FastNoiseLite.mb_get_fractal_weighted_strength = MethodBind.get("FastNoiseLite", "get_fractal_weighted_strength", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.FastNoiseLite.mb_get_fractal_weighted_strength, livePtr)
  }

  /** FastNoiseLite.set_fractal_ping_pong_strength */
  final def setFractalPingPongStrength(ping_pong_strength: Double): Unit = {
    if (gdext.classes.FastNoiseLite.mb_set_fractal_ping_pong_strength == null) gdext.classes.FastNoiseLite.mb_set_fractal_ping_pong_strength = MethodBind.get("FastNoiseLite", "set_fractal_ping_pong_strength", 373806689L)
    Ptrcall.callVoid1(gdext.classes.FastNoiseLite.mb_set_fractal_ping_pong_strength, livePtr, ping_pong_strength)
  }

  /** FastNoiseLite.get_fractal_ping_pong_strength */
  final def getFractalPingPongStrength(): Double = {
    if (gdext.classes.FastNoiseLite.mb_get_fractal_ping_pong_strength == null) gdext.classes.FastNoiseLite.mb_get_fractal_ping_pong_strength = MethodBind.get("FastNoiseLite", "get_fractal_ping_pong_strength", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.FastNoiseLite.mb_get_fractal_ping_pong_strength, livePtr)
  }

  /** FastNoiseLite.set_cellular_distance_function */
  final def setCellularDistanceFunction(func: Long): Unit = {
    if (gdext.classes.FastNoiseLite.mb_set_cellular_distance_function == null) gdext.classes.FastNoiseLite.mb_set_cellular_distance_function = MethodBind.get("FastNoiseLite", "set_cellular_distance_function", 1006013267L)
    Ptrcall.callVoid1(gdext.classes.FastNoiseLite.mb_set_cellular_distance_function, livePtr, func)
  }

  /** FastNoiseLite.get_cellular_distance_function */
  final def getCellularDistanceFunction(): Long = {
    if (gdext.classes.FastNoiseLite.mb_get_cellular_distance_function == null) gdext.classes.FastNoiseLite.mb_get_cellular_distance_function = MethodBind.get("FastNoiseLite", "get_cellular_distance_function", 2021274088L)
    Ptrcall.call0[Long](gdext.classes.FastNoiseLite.mb_get_cellular_distance_function, livePtr)
  }

  /** FastNoiseLite.set_cellular_jitter */
  final def setCellularJitter(jitter: Double): Unit = {
    if (gdext.classes.FastNoiseLite.mb_set_cellular_jitter == null) gdext.classes.FastNoiseLite.mb_set_cellular_jitter = MethodBind.get("FastNoiseLite", "set_cellular_jitter", 373806689L)
    Ptrcall.callVoid1(gdext.classes.FastNoiseLite.mb_set_cellular_jitter, livePtr, jitter)
  }

  /** FastNoiseLite.get_cellular_jitter */
  final def getCellularJitter(): Double = {
    if (gdext.classes.FastNoiseLite.mb_get_cellular_jitter == null) gdext.classes.FastNoiseLite.mb_get_cellular_jitter = MethodBind.get("FastNoiseLite", "get_cellular_jitter", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.FastNoiseLite.mb_get_cellular_jitter, livePtr)
  }

  /** FastNoiseLite.set_cellular_return_type */
  final def setCellularReturnType(ret: Long): Unit = {
    if (gdext.classes.FastNoiseLite.mb_set_cellular_return_type == null) gdext.classes.FastNoiseLite.mb_set_cellular_return_type = MethodBind.get("FastNoiseLite", "set_cellular_return_type", 2654169698L)
    Ptrcall.callVoid1(gdext.classes.FastNoiseLite.mb_set_cellular_return_type, livePtr, ret)
  }

  /** FastNoiseLite.get_cellular_return_type */
  final def getCellularReturnType(): Long = {
    if (gdext.classes.FastNoiseLite.mb_get_cellular_return_type == null) gdext.classes.FastNoiseLite.mb_get_cellular_return_type = MethodBind.get("FastNoiseLite", "get_cellular_return_type", 3699796343L)
    Ptrcall.call0[Long](gdext.classes.FastNoiseLite.mb_get_cellular_return_type, livePtr)
  }

  /** FastNoiseLite.set_domain_warp_enabled */
  final def setDomainWarpEnabled(domain_warp_enabled: Boolean): Unit = {
    if (gdext.classes.FastNoiseLite.mb_set_domain_warp_enabled == null) gdext.classes.FastNoiseLite.mb_set_domain_warp_enabled = MethodBind.get("FastNoiseLite", "set_domain_warp_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.FastNoiseLite.mb_set_domain_warp_enabled, livePtr, domain_warp_enabled)
  }

  /** FastNoiseLite.is_domain_warp_enabled */
  final def isDomainWarpEnabled(): Boolean = {
    if (gdext.classes.FastNoiseLite.mb_is_domain_warp_enabled == null) gdext.classes.FastNoiseLite.mb_is_domain_warp_enabled = MethodBind.get("FastNoiseLite", "is_domain_warp_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.FastNoiseLite.mb_is_domain_warp_enabled, livePtr)
  }

  /** FastNoiseLite.set_domain_warp_type */
  final def setDomainWarpType(domain_warp_type: Long): Unit = {
    if (gdext.classes.FastNoiseLite.mb_set_domain_warp_type == null) gdext.classes.FastNoiseLite.mb_set_domain_warp_type = MethodBind.get("FastNoiseLite", "set_domain_warp_type", 3629692980L)
    Ptrcall.callVoid1(gdext.classes.FastNoiseLite.mb_set_domain_warp_type, livePtr, domain_warp_type)
  }

  /** FastNoiseLite.get_domain_warp_type */
  final def getDomainWarpType(): Long = {
    if (gdext.classes.FastNoiseLite.mb_get_domain_warp_type == null) gdext.classes.FastNoiseLite.mb_get_domain_warp_type = MethodBind.get("FastNoiseLite", "get_domain_warp_type", 2980162020L)
    Ptrcall.call0[Long](gdext.classes.FastNoiseLite.mb_get_domain_warp_type, livePtr)
  }

  /** FastNoiseLite.set_domain_warp_amplitude */
  final def setDomainWarpAmplitude(domain_warp_amplitude: Double): Unit = {
    if (gdext.classes.FastNoiseLite.mb_set_domain_warp_amplitude == null) gdext.classes.FastNoiseLite.mb_set_domain_warp_amplitude = MethodBind.get("FastNoiseLite", "set_domain_warp_amplitude", 373806689L)
    Ptrcall.callVoid1(gdext.classes.FastNoiseLite.mb_set_domain_warp_amplitude, livePtr, domain_warp_amplitude)
  }

  /** FastNoiseLite.get_domain_warp_amplitude */
  final def getDomainWarpAmplitude(): Double = {
    if (gdext.classes.FastNoiseLite.mb_get_domain_warp_amplitude == null) gdext.classes.FastNoiseLite.mb_get_domain_warp_amplitude = MethodBind.get("FastNoiseLite", "get_domain_warp_amplitude", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.FastNoiseLite.mb_get_domain_warp_amplitude, livePtr)
  }

  /** FastNoiseLite.set_domain_warp_frequency */
  final def setDomainWarpFrequency(domain_warp_frequency: Double): Unit = {
    if (gdext.classes.FastNoiseLite.mb_set_domain_warp_frequency == null) gdext.classes.FastNoiseLite.mb_set_domain_warp_frequency = MethodBind.get("FastNoiseLite", "set_domain_warp_frequency", 373806689L)
    Ptrcall.callVoid1(gdext.classes.FastNoiseLite.mb_set_domain_warp_frequency, livePtr, domain_warp_frequency)
  }

  /** FastNoiseLite.get_domain_warp_frequency */
  final def getDomainWarpFrequency(): Double = {
    if (gdext.classes.FastNoiseLite.mb_get_domain_warp_frequency == null) gdext.classes.FastNoiseLite.mb_get_domain_warp_frequency = MethodBind.get("FastNoiseLite", "get_domain_warp_frequency", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.FastNoiseLite.mb_get_domain_warp_frequency, livePtr)
  }

  /** FastNoiseLite.set_domain_warp_fractal_type */
  final def setDomainWarpFractalType(domain_warp_fractal_type: Long): Unit = {
    if (gdext.classes.FastNoiseLite.mb_set_domain_warp_fractal_type == null) gdext.classes.FastNoiseLite.mb_set_domain_warp_fractal_type = MethodBind.get("FastNoiseLite", "set_domain_warp_fractal_type", 3999408287L)
    Ptrcall.callVoid1(gdext.classes.FastNoiseLite.mb_set_domain_warp_fractal_type, livePtr, domain_warp_fractal_type)
  }

  /** FastNoiseLite.get_domain_warp_fractal_type */
  final def getDomainWarpFractalType(): Long = {
    if (gdext.classes.FastNoiseLite.mb_get_domain_warp_fractal_type == null) gdext.classes.FastNoiseLite.mb_get_domain_warp_fractal_type = MethodBind.get("FastNoiseLite", "get_domain_warp_fractal_type", 407716934L)
    Ptrcall.call0[Long](gdext.classes.FastNoiseLite.mb_get_domain_warp_fractal_type, livePtr)
  }

  /** FastNoiseLite.set_domain_warp_fractal_octaves */
  final def setDomainWarpFractalOctaves(domain_warp_octave_count: Long): Unit = {
    if (gdext.classes.FastNoiseLite.mb_set_domain_warp_fractal_octaves == null) gdext.classes.FastNoiseLite.mb_set_domain_warp_fractal_octaves = MethodBind.get("FastNoiseLite", "set_domain_warp_fractal_octaves", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.FastNoiseLite.mb_set_domain_warp_fractal_octaves, livePtr, domain_warp_octave_count)
  }

  /** FastNoiseLite.get_domain_warp_fractal_octaves */
  final def getDomainWarpFractalOctaves(): Long = {
    if (gdext.classes.FastNoiseLite.mb_get_domain_warp_fractal_octaves == null) gdext.classes.FastNoiseLite.mb_get_domain_warp_fractal_octaves = MethodBind.get("FastNoiseLite", "get_domain_warp_fractal_octaves", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.FastNoiseLite.mb_get_domain_warp_fractal_octaves, livePtr)
  }

  /** FastNoiseLite.set_domain_warp_fractal_lacunarity */
  final def setDomainWarpFractalLacunarity(domain_warp_lacunarity: Double): Unit = {
    if (gdext.classes.FastNoiseLite.mb_set_domain_warp_fractal_lacunarity == null) gdext.classes.FastNoiseLite.mb_set_domain_warp_fractal_lacunarity = MethodBind.get("FastNoiseLite", "set_domain_warp_fractal_lacunarity", 373806689L)
    Ptrcall.callVoid1(gdext.classes.FastNoiseLite.mb_set_domain_warp_fractal_lacunarity, livePtr, domain_warp_lacunarity)
  }

  /** FastNoiseLite.get_domain_warp_fractal_lacunarity */
  final def getDomainWarpFractalLacunarity(): Double = {
    if (gdext.classes.FastNoiseLite.mb_get_domain_warp_fractal_lacunarity == null) gdext.classes.FastNoiseLite.mb_get_domain_warp_fractal_lacunarity = MethodBind.get("FastNoiseLite", "get_domain_warp_fractal_lacunarity", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.FastNoiseLite.mb_get_domain_warp_fractal_lacunarity, livePtr)
  }

  /** FastNoiseLite.set_domain_warp_fractal_gain */
  final def setDomainWarpFractalGain(domain_warp_gain: Double): Unit = {
    if (gdext.classes.FastNoiseLite.mb_set_domain_warp_fractal_gain == null) gdext.classes.FastNoiseLite.mb_set_domain_warp_fractal_gain = MethodBind.get("FastNoiseLite", "set_domain_warp_fractal_gain", 373806689L)
    Ptrcall.callVoid1(gdext.classes.FastNoiseLite.mb_set_domain_warp_fractal_gain, livePtr, domain_warp_gain)
  }

  /** FastNoiseLite.get_domain_warp_fractal_gain */
  final def getDomainWarpFractalGain(): Double = {
    if (gdext.classes.FastNoiseLite.mb_get_domain_warp_fractal_gain == null) gdext.classes.FastNoiseLite.mb_get_domain_warp_fractal_gain = MethodBind.get("FastNoiseLite", "get_domain_warp_fractal_gain", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.FastNoiseLite.mb_get_domain_warp_fractal_gain, livePtr)
  }

}

object FastNoiseLite {
  private[classes] var mb_set_noise_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_noise_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_seed: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_seed: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_frequency: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_frequency: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_fractal_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fractal_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_fractal_octaves: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fractal_octaves: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_fractal_lacunarity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fractal_lacunarity: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_fractal_gain: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fractal_gain: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_fractal_weighted_strength: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fractal_weighted_strength: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_fractal_ping_pong_strength: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fractal_ping_pong_strength: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_cellular_distance_function: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_cellular_distance_function: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_cellular_jitter: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_cellular_jitter: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_cellular_return_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_cellular_return_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_domain_warp_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_domain_warp_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_domain_warp_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_domain_warp_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_domain_warp_amplitude: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_domain_warp_amplitude: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_domain_warp_frequency: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_domain_warp_frequency: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_domain_warp_fractal_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_domain_warp_fractal_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_domain_warp_fractal_octaves: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_domain_warp_fractal_octaves: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_domain_warp_fractal_lacunarity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_domain_warp_fractal_lacunarity: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_domain_warp_fractal_gain: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_domain_warp_fractal_gain: GDExtensionMethodBindPtr = null
}
