package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `FastNoiseLite`, extends `Noise`. */
abstract class FastNoiseLite extends Noise {

  /** FastNoiseLite.set_noise_type */
  final def setNoiseType(`type`: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("FastNoiseLite", "set_noise_type", 2624461392L), hostObject.objectPtr, `type`)

  /** FastNoiseLite.get_noise_type */
  final def getNoiseType(): Long =
    Ptrcall.call0[Long](MethodBind.get("FastNoiseLite", "get_noise_type", 1458108610L), hostObject.objectPtr)

  /** FastNoiseLite.set_seed */
  final def setSeed(seed: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("FastNoiseLite", "set_seed", 1286410249L), hostObject.objectPtr, seed)

  /** FastNoiseLite.get_seed */
  final def getSeed(): Long =
    Ptrcall.call0[Long](MethodBind.get("FastNoiseLite", "get_seed", 3905245786L), hostObject.objectPtr)

  /** FastNoiseLite.set_frequency */
  final def setFrequency(freq: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("FastNoiseLite", "set_frequency", 373806689L), hostObject.objectPtr, freq)

  /** FastNoiseLite.get_frequency */
  final def getFrequency(): Double =
    Ptrcall.call0[Double](MethodBind.get("FastNoiseLite", "get_frequency", 1740695150L), hostObject.objectPtr)

  /** FastNoiseLite.set_offset */
  final def setOffset(offset: io.github.optical002.godot.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("FastNoiseLite", "set_offset", 3460891852L), hostObject.objectPtr, offset)

  /** FastNoiseLite.get_offset */
  final def getOffset(): io.github.optical002.godot.builtin.Vector3 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector3](MethodBind.get("FastNoiseLite", "get_offset", 3360562783L), hostObject.objectPtr)

  /** FastNoiseLite.set_fractal_type */
  final def setFractalType(`type`: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("FastNoiseLite", "set_fractal_type", 4132731174L), hostObject.objectPtr, `type`)

  /** FastNoiseLite.get_fractal_type */
  final def getFractalType(): Long =
    Ptrcall.call0[Long](MethodBind.get("FastNoiseLite", "get_fractal_type", 1036889279L), hostObject.objectPtr)

  /** FastNoiseLite.set_fractal_octaves */
  final def setFractalOctaves(octave_count: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("FastNoiseLite", "set_fractal_octaves", 1286410249L), hostObject.objectPtr, octave_count)

  /** FastNoiseLite.get_fractal_octaves */
  final def getFractalOctaves(): Long =
    Ptrcall.call0[Long](MethodBind.get("FastNoiseLite", "get_fractal_octaves", 3905245786L), hostObject.objectPtr)

  /** FastNoiseLite.set_fractal_lacunarity */
  final def setFractalLacunarity(lacunarity: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("FastNoiseLite", "set_fractal_lacunarity", 373806689L), hostObject.objectPtr, lacunarity)

  /** FastNoiseLite.get_fractal_lacunarity */
  final def getFractalLacunarity(): Double =
    Ptrcall.call0[Double](MethodBind.get("FastNoiseLite", "get_fractal_lacunarity", 1740695150L), hostObject.objectPtr)

  /** FastNoiseLite.set_fractal_gain */
  final def setFractalGain(gain: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("FastNoiseLite", "set_fractal_gain", 373806689L), hostObject.objectPtr, gain)

  /** FastNoiseLite.get_fractal_gain */
  final def getFractalGain(): Double =
    Ptrcall.call0[Double](MethodBind.get("FastNoiseLite", "get_fractal_gain", 1740695150L), hostObject.objectPtr)

  /** FastNoiseLite.set_fractal_weighted_strength */
  final def setFractalWeightedStrength(weighted_strength: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("FastNoiseLite", "set_fractal_weighted_strength", 373806689L), hostObject.objectPtr, weighted_strength)

  /** FastNoiseLite.get_fractal_weighted_strength */
  final def getFractalWeightedStrength(): Double =
    Ptrcall.call0[Double](MethodBind.get("FastNoiseLite", "get_fractal_weighted_strength", 1740695150L), hostObject.objectPtr)

  /** FastNoiseLite.set_fractal_ping_pong_strength */
  final def setFractalPingPongStrength(ping_pong_strength: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("FastNoiseLite", "set_fractal_ping_pong_strength", 373806689L), hostObject.objectPtr, ping_pong_strength)

  /** FastNoiseLite.get_fractal_ping_pong_strength */
  final def getFractalPingPongStrength(): Double =
    Ptrcall.call0[Double](MethodBind.get("FastNoiseLite", "get_fractal_ping_pong_strength", 1740695150L), hostObject.objectPtr)

  /** FastNoiseLite.set_cellular_distance_function */
  final def setCellularDistanceFunction(func: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("FastNoiseLite", "set_cellular_distance_function", 1006013267L), hostObject.objectPtr, func)

  /** FastNoiseLite.get_cellular_distance_function */
  final def getCellularDistanceFunction(): Long =
    Ptrcall.call0[Long](MethodBind.get("FastNoiseLite", "get_cellular_distance_function", 2021274088L), hostObject.objectPtr)

  /** FastNoiseLite.set_cellular_jitter */
  final def setCellularJitter(jitter: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("FastNoiseLite", "set_cellular_jitter", 373806689L), hostObject.objectPtr, jitter)

  /** FastNoiseLite.get_cellular_jitter */
  final def getCellularJitter(): Double =
    Ptrcall.call0[Double](MethodBind.get("FastNoiseLite", "get_cellular_jitter", 1740695150L), hostObject.objectPtr)

  /** FastNoiseLite.set_cellular_return_type */
  final def setCellularReturnType(ret: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("FastNoiseLite", "set_cellular_return_type", 2654169698L), hostObject.objectPtr, ret)

  /** FastNoiseLite.get_cellular_return_type */
  final def getCellularReturnType(): Long =
    Ptrcall.call0[Long](MethodBind.get("FastNoiseLite", "get_cellular_return_type", 3699796343L), hostObject.objectPtr)

  /** FastNoiseLite.set_domain_warp_enabled */
  final def setDomainWarpEnabled(domain_warp_enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("FastNoiseLite", "set_domain_warp_enabled", 2586408642L), hostObject.objectPtr, domain_warp_enabled)

  /** FastNoiseLite.is_domain_warp_enabled */
  final def isDomainWarpEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("FastNoiseLite", "is_domain_warp_enabled", 36873697L), hostObject.objectPtr)

  /** FastNoiseLite.set_domain_warp_type */
  final def setDomainWarpType(domain_warp_type: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("FastNoiseLite", "set_domain_warp_type", 3629692980L), hostObject.objectPtr, domain_warp_type)

  /** FastNoiseLite.get_domain_warp_type */
  final def getDomainWarpType(): Long =
    Ptrcall.call0[Long](MethodBind.get("FastNoiseLite", "get_domain_warp_type", 2980162020L), hostObject.objectPtr)

  /** FastNoiseLite.set_domain_warp_amplitude */
  final def setDomainWarpAmplitude(domain_warp_amplitude: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("FastNoiseLite", "set_domain_warp_amplitude", 373806689L), hostObject.objectPtr, domain_warp_amplitude)

  /** FastNoiseLite.get_domain_warp_amplitude */
  final def getDomainWarpAmplitude(): Double =
    Ptrcall.call0[Double](MethodBind.get("FastNoiseLite", "get_domain_warp_amplitude", 1740695150L), hostObject.objectPtr)

  /** FastNoiseLite.set_domain_warp_frequency */
  final def setDomainWarpFrequency(domain_warp_frequency: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("FastNoiseLite", "set_domain_warp_frequency", 373806689L), hostObject.objectPtr, domain_warp_frequency)

  /** FastNoiseLite.get_domain_warp_frequency */
  final def getDomainWarpFrequency(): Double =
    Ptrcall.call0[Double](MethodBind.get("FastNoiseLite", "get_domain_warp_frequency", 1740695150L), hostObject.objectPtr)

  /** FastNoiseLite.set_domain_warp_fractal_type */
  final def setDomainWarpFractalType(domain_warp_fractal_type: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("FastNoiseLite", "set_domain_warp_fractal_type", 3999408287L), hostObject.objectPtr, domain_warp_fractal_type)

  /** FastNoiseLite.get_domain_warp_fractal_type */
  final def getDomainWarpFractalType(): Long =
    Ptrcall.call0[Long](MethodBind.get("FastNoiseLite", "get_domain_warp_fractal_type", 407716934L), hostObject.objectPtr)

  /** FastNoiseLite.set_domain_warp_fractal_octaves */
  final def setDomainWarpFractalOctaves(domain_warp_octave_count: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("FastNoiseLite", "set_domain_warp_fractal_octaves", 1286410249L), hostObject.objectPtr, domain_warp_octave_count)

  /** FastNoiseLite.get_domain_warp_fractal_octaves */
  final def getDomainWarpFractalOctaves(): Long =
    Ptrcall.call0[Long](MethodBind.get("FastNoiseLite", "get_domain_warp_fractal_octaves", 3905245786L), hostObject.objectPtr)

  /** FastNoiseLite.set_domain_warp_fractal_lacunarity */
  final def setDomainWarpFractalLacunarity(domain_warp_lacunarity: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("FastNoiseLite", "set_domain_warp_fractal_lacunarity", 373806689L), hostObject.objectPtr, domain_warp_lacunarity)

  /** FastNoiseLite.get_domain_warp_fractal_lacunarity */
  final def getDomainWarpFractalLacunarity(): Double =
    Ptrcall.call0[Double](MethodBind.get("FastNoiseLite", "get_domain_warp_fractal_lacunarity", 1740695150L), hostObject.objectPtr)

  /** FastNoiseLite.set_domain_warp_fractal_gain */
  final def setDomainWarpFractalGain(domain_warp_gain: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("FastNoiseLite", "set_domain_warp_fractal_gain", 373806689L), hostObject.objectPtr, domain_warp_gain)

  /** FastNoiseLite.get_domain_warp_fractal_gain */
  final def getDomainWarpFractalGain(): Double =
    Ptrcall.call0[Double](MethodBind.get("FastNoiseLite", "get_domain_warp_fractal_gain", 1740695150L), hostObject.objectPtr)

}

object FastNoiseLite {
  /** Class metadata for Gd[FastNoiseLite] lifetime management and casting. */
  given GodotClass[FastNoiseLite] with {
    def className = "FastNoiseLite"
    def isRefCounted = true
    def wrap(o: GodotObject): FastNoiseLite = new FastNoiseLite {}.withHost(o.objectPtr)
    def unwrap(t: FastNoiseLite): GodotObject = t.hostObject
  }
}
