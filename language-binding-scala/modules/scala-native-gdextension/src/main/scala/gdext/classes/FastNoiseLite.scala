package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `FastNoiseLite`, extends `Noise`. */
abstract class FastNoiseLite extends Noise {
  override def godotClassName: String = "FastNoiseLite"

  /** FastNoiseLite.set_noise_type */
  final def setNoiseType(`type`: gdext.classes.FastNoiseLite.NoiseType): Unit = {
    if (gdext.classes.FastNoiseLite.mb_set_noise_type == null) gdext.classes.FastNoiseLite.mb_set_noise_type = MethodBind.get("FastNoiseLite", "set_noise_type", 2624461392L)
    Ptrcall.callVoid1(gdext.classes.FastNoiseLite.mb_set_noise_type, livePtr, `type`)
  }

  /** FastNoiseLite.get_noise_type */
  final def getNoiseType(): gdext.classes.FastNoiseLite.NoiseType = {
    if (gdext.classes.FastNoiseLite.mb_get_noise_type == null) gdext.classes.FastNoiseLite.mb_get_noise_type = MethodBind.get("FastNoiseLite", "get_noise_type", 1458108610L)
    gdext.classes.FastNoiseLite.NoiseType(Ptrcall.call0[Long](gdext.classes.FastNoiseLite.mb_get_noise_type, livePtr))
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
  final def setFractalType(`type`: gdext.classes.FastNoiseLite.FractalType): Unit = {
    if (gdext.classes.FastNoiseLite.mb_set_fractal_type == null) gdext.classes.FastNoiseLite.mb_set_fractal_type = MethodBind.get("FastNoiseLite", "set_fractal_type", 4132731174L)
    Ptrcall.callVoid1(gdext.classes.FastNoiseLite.mb_set_fractal_type, livePtr, `type`)
  }

  /** FastNoiseLite.get_fractal_type */
  final def getFractalType(): gdext.classes.FastNoiseLite.FractalType = {
    if (gdext.classes.FastNoiseLite.mb_get_fractal_type == null) gdext.classes.FastNoiseLite.mb_get_fractal_type = MethodBind.get("FastNoiseLite", "get_fractal_type", 1036889279L)
    gdext.classes.FastNoiseLite.FractalType(Ptrcall.call0[Long](gdext.classes.FastNoiseLite.mb_get_fractal_type, livePtr))
  }

  /** FastNoiseLite.set_fractal_octaves */
  final def setFractalOctaves(octaveCount: Long): Unit = {
    if (gdext.classes.FastNoiseLite.mb_set_fractal_octaves == null) gdext.classes.FastNoiseLite.mb_set_fractal_octaves = MethodBind.get("FastNoiseLite", "set_fractal_octaves", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.FastNoiseLite.mb_set_fractal_octaves, livePtr, octaveCount)
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
  final def setFractalWeightedStrength(weightedStrength: Double): Unit = {
    if (gdext.classes.FastNoiseLite.mb_set_fractal_weighted_strength == null) gdext.classes.FastNoiseLite.mb_set_fractal_weighted_strength = MethodBind.get("FastNoiseLite", "set_fractal_weighted_strength", 373806689L)
    Ptrcall.callVoid1(gdext.classes.FastNoiseLite.mb_set_fractal_weighted_strength, livePtr, weightedStrength)
  }

  /** FastNoiseLite.get_fractal_weighted_strength */
  final def getFractalWeightedStrength(): Double = {
    if (gdext.classes.FastNoiseLite.mb_get_fractal_weighted_strength == null) gdext.classes.FastNoiseLite.mb_get_fractal_weighted_strength = MethodBind.get("FastNoiseLite", "get_fractal_weighted_strength", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.FastNoiseLite.mb_get_fractal_weighted_strength, livePtr)
  }

  /** FastNoiseLite.set_fractal_ping_pong_strength */
  final def setFractalPingPongStrength(pingPongStrength: Double): Unit = {
    if (gdext.classes.FastNoiseLite.mb_set_fractal_ping_pong_strength == null) gdext.classes.FastNoiseLite.mb_set_fractal_ping_pong_strength = MethodBind.get("FastNoiseLite", "set_fractal_ping_pong_strength", 373806689L)
    Ptrcall.callVoid1(gdext.classes.FastNoiseLite.mb_set_fractal_ping_pong_strength, livePtr, pingPongStrength)
  }

  /** FastNoiseLite.get_fractal_ping_pong_strength */
  final def getFractalPingPongStrength(): Double = {
    if (gdext.classes.FastNoiseLite.mb_get_fractal_ping_pong_strength == null) gdext.classes.FastNoiseLite.mb_get_fractal_ping_pong_strength = MethodBind.get("FastNoiseLite", "get_fractal_ping_pong_strength", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.FastNoiseLite.mb_get_fractal_ping_pong_strength, livePtr)
  }

  /** FastNoiseLite.set_cellular_distance_function */
  final def setCellularDistanceFunction(func: gdext.classes.FastNoiseLite.CellularDistanceFunction): Unit = {
    if (gdext.classes.FastNoiseLite.mb_set_cellular_distance_function == null) gdext.classes.FastNoiseLite.mb_set_cellular_distance_function = MethodBind.get("FastNoiseLite", "set_cellular_distance_function", 1006013267L)
    Ptrcall.callVoid1(gdext.classes.FastNoiseLite.mb_set_cellular_distance_function, livePtr, func)
  }

  /** FastNoiseLite.get_cellular_distance_function */
  final def getCellularDistanceFunction(): gdext.classes.FastNoiseLite.CellularDistanceFunction = {
    if (gdext.classes.FastNoiseLite.mb_get_cellular_distance_function == null) gdext.classes.FastNoiseLite.mb_get_cellular_distance_function = MethodBind.get("FastNoiseLite", "get_cellular_distance_function", 2021274088L)
    gdext.classes.FastNoiseLite.CellularDistanceFunction(Ptrcall.call0[Long](gdext.classes.FastNoiseLite.mb_get_cellular_distance_function, livePtr))
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
  final def setCellularReturnType(ret: gdext.classes.FastNoiseLite.CellularReturnType): Unit = {
    if (gdext.classes.FastNoiseLite.mb_set_cellular_return_type == null) gdext.classes.FastNoiseLite.mb_set_cellular_return_type = MethodBind.get("FastNoiseLite", "set_cellular_return_type", 2654169698L)
    Ptrcall.callVoid1(gdext.classes.FastNoiseLite.mb_set_cellular_return_type, livePtr, ret)
  }

  /** FastNoiseLite.get_cellular_return_type */
  final def getCellularReturnType(): gdext.classes.FastNoiseLite.CellularReturnType = {
    if (gdext.classes.FastNoiseLite.mb_get_cellular_return_type == null) gdext.classes.FastNoiseLite.mb_get_cellular_return_type = MethodBind.get("FastNoiseLite", "get_cellular_return_type", 3699796343L)
    gdext.classes.FastNoiseLite.CellularReturnType(Ptrcall.call0[Long](gdext.classes.FastNoiseLite.mb_get_cellular_return_type, livePtr))
  }

  /** FastNoiseLite.set_domain_warp_enabled */
  final def setDomainWarpEnabled(domainWarpEnabled: Boolean): Unit = {
    if (gdext.classes.FastNoiseLite.mb_set_domain_warp_enabled == null) gdext.classes.FastNoiseLite.mb_set_domain_warp_enabled = MethodBind.get("FastNoiseLite", "set_domain_warp_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.FastNoiseLite.mb_set_domain_warp_enabled, livePtr, domainWarpEnabled)
  }

  /** FastNoiseLite.is_domain_warp_enabled */
  final def isDomainWarpEnabled(): Boolean = {
    if (gdext.classes.FastNoiseLite.mb_is_domain_warp_enabled == null) gdext.classes.FastNoiseLite.mb_is_domain_warp_enabled = MethodBind.get("FastNoiseLite", "is_domain_warp_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.FastNoiseLite.mb_is_domain_warp_enabled, livePtr)
  }

  /** FastNoiseLite.set_domain_warp_type */
  final def setDomainWarpType(domainWarpType: gdext.classes.FastNoiseLite.DomainWarpType): Unit = {
    if (gdext.classes.FastNoiseLite.mb_set_domain_warp_type == null) gdext.classes.FastNoiseLite.mb_set_domain_warp_type = MethodBind.get("FastNoiseLite", "set_domain_warp_type", 3629692980L)
    Ptrcall.callVoid1(gdext.classes.FastNoiseLite.mb_set_domain_warp_type, livePtr, domainWarpType)
  }

  /** FastNoiseLite.get_domain_warp_type */
  final def getDomainWarpType(): gdext.classes.FastNoiseLite.DomainWarpType = {
    if (gdext.classes.FastNoiseLite.mb_get_domain_warp_type == null) gdext.classes.FastNoiseLite.mb_get_domain_warp_type = MethodBind.get("FastNoiseLite", "get_domain_warp_type", 2980162020L)
    gdext.classes.FastNoiseLite.DomainWarpType(Ptrcall.call0[Long](gdext.classes.FastNoiseLite.mb_get_domain_warp_type, livePtr))
  }

  /** FastNoiseLite.set_domain_warp_amplitude */
  final def setDomainWarpAmplitude(domainWarpAmplitude: Double): Unit = {
    if (gdext.classes.FastNoiseLite.mb_set_domain_warp_amplitude == null) gdext.classes.FastNoiseLite.mb_set_domain_warp_amplitude = MethodBind.get("FastNoiseLite", "set_domain_warp_amplitude", 373806689L)
    Ptrcall.callVoid1(gdext.classes.FastNoiseLite.mb_set_domain_warp_amplitude, livePtr, domainWarpAmplitude)
  }

  /** FastNoiseLite.get_domain_warp_amplitude */
  final def getDomainWarpAmplitude(): Double = {
    if (gdext.classes.FastNoiseLite.mb_get_domain_warp_amplitude == null) gdext.classes.FastNoiseLite.mb_get_domain_warp_amplitude = MethodBind.get("FastNoiseLite", "get_domain_warp_amplitude", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.FastNoiseLite.mb_get_domain_warp_amplitude, livePtr)
  }

  /** FastNoiseLite.set_domain_warp_frequency */
  final def setDomainWarpFrequency(domainWarpFrequency: Double): Unit = {
    if (gdext.classes.FastNoiseLite.mb_set_domain_warp_frequency == null) gdext.classes.FastNoiseLite.mb_set_domain_warp_frequency = MethodBind.get("FastNoiseLite", "set_domain_warp_frequency", 373806689L)
    Ptrcall.callVoid1(gdext.classes.FastNoiseLite.mb_set_domain_warp_frequency, livePtr, domainWarpFrequency)
  }

  /** FastNoiseLite.get_domain_warp_frequency */
  final def getDomainWarpFrequency(): Double = {
    if (gdext.classes.FastNoiseLite.mb_get_domain_warp_frequency == null) gdext.classes.FastNoiseLite.mb_get_domain_warp_frequency = MethodBind.get("FastNoiseLite", "get_domain_warp_frequency", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.FastNoiseLite.mb_get_domain_warp_frequency, livePtr)
  }

  /** FastNoiseLite.set_domain_warp_fractal_type */
  final def setDomainWarpFractalType(domainWarpFractalType: gdext.classes.FastNoiseLite.DomainWarpFractalType): Unit = {
    if (gdext.classes.FastNoiseLite.mb_set_domain_warp_fractal_type == null) gdext.classes.FastNoiseLite.mb_set_domain_warp_fractal_type = MethodBind.get("FastNoiseLite", "set_domain_warp_fractal_type", 3999408287L)
    Ptrcall.callVoid1(gdext.classes.FastNoiseLite.mb_set_domain_warp_fractal_type, livePtr, domainWarpFractalType)
  }

  /** FastNoiseLite.get_domain_warp_fractal_type */
  final def getDomainWarpFractalType(): gdext.classes.FastNoiseLite.DomainWarpFractalType = {
    if (gdext.classes.FastNoiseLite.mb_get_domain_warp_fractal_type == null) gdext.classes.FastNoiseLite.mb_get_domain_warp_fractal_type = MethodBind.get("FastNoiseLite", "get_domain_warp_fractal_type", 407716934L)
    gdext.classes.FastNoiseLite.DomainWarpFractalType(Ptrcall.call0[Long](gdext.classes.FastNoiseLite.mb_get_domain_warp_fractal_type, livePtr))
  }

  /** FastNoiseLite.set_domain_warp_fractal_octaves */
  final def setDomainWarpFractalOctaves(domainWarpOctaveCount: Long): Unit = {
    if (gdext.classes.FastNoiseLite.mb_set_domain_warp_fractal_octaves == null) gdext.classes.FastNoiseLite.mb_set_domain_warp_fractal_octaves = MethodBind.get("FastNoiseLite", "set_domain_warp_fractal_octaves", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.FastNoiseLite.mb_set_domain_warp_fractal_octaves, livePtr, domainWarpOctaveCount)
  }

  /** FastNoiseLite.get_domain_warp_fractal_octaves */
  final def getDomainWarpFractalOctaves(): Long = {
    if (gdext.classes.FastNoiseLite.mb_get_domain_warp_fractal_octaves == null) gdext.classes.FastNoiseLite.mb_get_domain_warp_fractal_octaves = MethodBind.get("FastNoiseLite", "get_domain_warp_fractal_octaves", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.FastNoiseLite.mb_get_domain_warp_fractal_octaves, livePtr)
  }

  /** FastNoiseLite.set_domain_warp_fractal_lacunarity */
  final def setDomainWarpFractalLacunarity(domainWarpLacunarity: Double): Unit = {
    if (gdext.classes.FastNoiseLite.mb_set_domain_warp_fractal_lacunarity == null) gdext.classes.FastNoiseLite.mb_set_domain_warp_fractal_lacunarity = MethodBind.get("FastNoiseLite", "set_domain_warp_fractal_lacunarity", 373806689L)
    Ptrcall.callVoid1(gdext.classes.FastNoiseLite.mb_set_domain_warp_fractal_lacunarity, livePtr, domainWarpLacunarity)
  }

  /** FastNoiseLite.get_domain_warp_fractal_lacunarity */
  final def getDomainWarpFractalLacunarity(): Double = {
    if (gdext.classes.FastNoiseLite.mb_get_domain_warp_fractal_lacunarity == null) gdext.classes.FastNoiseLite.mb_get_domain_warp_fractal_lacunarity = MethodBind.get("FastNoiseLite", "get_domain_warp_fractal_lacunarity", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.FastNoiseLite.mb_get_domain_warp_fractal_lacunarity, livePtr)
  }

  /** FastNoiseLite.set_domain_warp_fractal_gain */
  final def setDomainWarpFractalGain(domainWarpGain: Double): Unit = {
    if (gdext.classes.FastNoiseLite.mb_set_domain_warp_fractal_gain == null) gdext.classes.FastNoiseLite.mb_set_domain_warp_fractal_gain = MethodBind.get("FastNoiseLite", "set_domain_warp_fractal_gain", 373806689L)
    Ptrcall.callVoid1(gdext.classes.FastNoiseLite.mb_set_domain_warp_fractal_gain, livePtr, domainWarpGain)
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

  /** Godot enum `FastNoiseLite.NoiseType`. */
  opaque type NoiseType <: Long = Long

  object NoiseType {
    final val Value: NoiseType = 5L.asInstanceOf[NoiseType]
    final val ValueCubic: NoiseType = 4L.asInstanceOf[NoiseType]
    final val Perlin: NoiseType = 3L.asInstanceOf[NoiseType]
    final val Cellular: NoiseType = 2L.asInstanceOf[NoiseType]
    final val Simplex: NoiseType = 0L.asInstanceOf[NoiseType]
    final val SimplexSmooth: NoiseType = 1L.asInstanceOf[NoiseType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): NoiseType = value.asInstanceOf[NoiseType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[NoiseType] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L).asInstanceOf[scala.IArray[NoiseType]]

    extension (self: NoiseType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Simplex"
        case 1L => "SimplexSmooth"
        case 2L => "Cellular"
        case 3L => "Perlin"
        case 4L => "ValueCubic"
        case 5L => "Value"
        case other => other.toString
      }
  }

  /** Godot enum `FastNoiseLite.FractalType`. */
  opaque type FractalType <: Long = Long

  object FractalType {
    final val None: FractalType = 0L.asInstanceOf[FractalType]
    final val Fbm: FractalType = 1L.asInstanceOf[FractalType]
    final val Ridged: FractalType = 2L.asInstanceOf[FractalType]
    final val PingPong: FractalType = 3L.asInstanceOf[FractalType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): FractalType = value.asInstanceOf[FractalType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[FractalType] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[FractalType]]

    extension (self: FractalType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "None"
        case 1L => "Fbm"
        case 2L => "Ridged"
        case 3L => "PingPong"
        case other => other.toString
      }
  }

  /** Godot enum `FastNoiseLite.CellularDistanceFunction`. */
  opaque type CellularDistanceFunction <: Long = Long

  object CellularDistanceFunction {
    final val Euclidean: CellularDistanceFunction = 0L.asInstanceOf[CellularDistanceFunction]
    final val EuclideanSquared: CellularDistanceFunction = 1L.asInstanceOf[CellularDistanceFunction]
    final val Manhattan: CellularDistanceFunction = 2L.asInstanceOf[CellularDistanceFunction]
    final val Hybrid: CellularDistanceFunction = 3L.asInstanceOf[CellularDistanceFunction]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): CellularDistanceFunction = value.asInstanceOf[CellularDistanceFunction]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[CellularDistanceFunction] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[CellularDistanceFunction]]

    extension (self: CellularDistanceFunction)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Euclidean"
        case 1L => "EuclideanSquared"
        case 2L => "Manhattan"
        case 3L => "Hybrid"
        case other => other.toString
      }
  }

  /** Godot enum `FastNoiseLite.CellularReturnType`. */
  opaque type CellularReturnType <: Long = Long

  object CellularReturnType {
    final val CellValue: CellularReturnType = 0L.asInstanceOf[CellularReturnType]
    final val Distance: CellularReturnType = 1L.asInstanceOf[CellularReturnType]
    final val Distance2: CellularReturnType = 2L.asInstanceOf[CellularReturnType]
    final val Distance2Add: CellularReturnType = 3L.asInstanceOf[CellularReturnType]
    final val Distance2Sub: CellularReturnType = 4L.asInstanceOf[CellularReturnType]
    final val Distance2Mul: CellularReturnType = 5L.asInstanceOf[CellularReturnType]
    final val Distance2Div: CellularReturnType = 6L.asInstanceOf[CellularReturnType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): CellularReturnType = value.asInstanceOf[CellularReturnType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[CellularReturnType] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L).asInstanceOf[scala.IArray[CellularReturnType]]

    extension (self: CellularReturnType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "CellValue"
        case 1L => "Distance"
        case 2L => "Distance2"
        case 3L => "Distance2Add"
        case 4L => "Distance2Sub"
        case 5L => "Distance2Mul"
        case 6L => "Distance2Div"
        case other => other.toString
      }
  }

  /** Godot enum `FastNoiseLite.DomainWarpType`. */
  opaque type DomainWarpType <: Long = Long

  object DomainWarpType {
    final val Simplex: DomainWarpType = 0L.asInstanceOf[DomainWarpType]
    final val SimplexReduced: DomainWarpType = 1L.asInstanceOf[DomainWarpType]
    final val BasicGrid: DomainWarpType = 2L.asInstanceOf[DomainWarpType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): DomainWarpType = value.asInstanceOf[DomainWarpType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[DomainWarpType] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[DomainWarpType]]

    extension (self: DomainWarpType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Simplex"
        case 1L => "SimplexReduced"
        case 2L => "BasicGrid"
        case other => other.toString
      }
  }

  /** Godot enum `FastNoiseLite.DomainWarpFractalType`. */
  opaque type DomainWarpFractalType <: Long = Long

  object DomainWarpFractalType {
    final val None: DomainWarpFractalType = 0L.asInstanceOf[DomainWarpFractalType]
    final val Progressive: DomainWarpFractalType = 1L.asInstanceOf[DomainWarpFractalType]
    final val Independent: DomainWarpFractalType = 2L.asInstanceOf[DomainWarpFractalType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): DomainWarpFractalType = value.asInstanceOf[DomainWarpFractalType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[DomainWarpFractalType] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[DomainWarpFractalType]]

    extension (self: DomainWarpFractalType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "None"
        case 1L => "Progressive"
        case 2L => "Independent"
        case other => other.toString
      }
  }
}
