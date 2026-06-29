package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioEffectCompressor`, extends `AudioEffect`. */
abstract class AudioEffectCompressor extends AudioEffect {
  override def godotClassName: String = "AudioEffectCompressor"

  /** AudioEffectCompressor.set_threshold */
  final def setThreshold(threshold: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioEffectCompressor", "set_threshold", 373806689L), hostObject.objectPtr, threshold)

  /** AudioEffectCompressor.get_threshold */
  final def getThreshold(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioEffectCompressor", "get_threshold", 1740695150L), hostObject.objectPtr)

  /** AudioEffectCompressor.set_ratio */
  final def setRatio(ratio: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioEffectCompressor", "set_ratio", 373806689L), hostObject.objectPtr, ratio)

  /** AudioEffectCompressor.get_ratio */
  final def getRatio(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioEffectCompressor", "get_ratio", 1740695150L), hostObject.objectPtr)

  /** AudioEffectCompressor.set_gain */
  final def setGain(gain: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioEffectCompressor", "set_gain", 373806689L), hostObject.objectPtr, gain)

  /** AudioEffectCompressor.get_gain */
  final def getGain(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioEffectCompressor", "get_gain", 1740695150L), hostObject.objectPtr)

  /** AudioEffectCompressor.set_attack_us */
  final def setAttackUs(attack_us: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioEffectCompressor", "set_attack_us", 373806689L), hostObject.objectPtr, attack_us)

  /** AudioEffectCompressor.get_attack_us */
  final def getAttackUs(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioEffectCompressor", "get_attack_us", 1740695150L), hostObject.objectPtr)

  /** AudioEffectCompressor.set_release_ms */
  final def setReleaseMs(release_ms: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioEffectCompressor", "set_release_ms", 373806689L), hostObject.objectPtr, release_ms)

  /** AudioEffectCompressor.get_release_ms */
  final def getReleaseMs(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioEffectCompressor", "get_release_ms", 1740695150L), hostObject.objectPtr)

  /** AudioEffectCompressor.set_mix */
  final def setMix(mix: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioEffectCompressor", "set_mix", 373806689L), hostObject.objectPtr, mix)

  /** AudioEffectCompressor.get_mix */
  final def getMix(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioEffectCompressor", "get_mix", 1740695150L), hostObject.objectPtr)

  /** AudioEffectCompressor.set_sidechain */
  final def setSidechain(sidechain: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioEffectCompressor", "set_sidechain", 3304788590L), hostObject.objectPtr, sidechain)

  /** AudioEffectCompressor.get_sidechain */
  final def getSidechain(): gdext.builtin.StringName =
    Ptrcall.call0[gdext.builtin.StringName](MethodBind.get("AudioEffectCompressor", "get_sidechain", 2002593661L), hostObject.objectPtr)

}
