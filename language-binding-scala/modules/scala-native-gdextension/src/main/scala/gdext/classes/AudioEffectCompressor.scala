package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AudioEffectCompressor`, extends `AudioEffect`. */
abstract class AudioEffectCompressor extends AudioEffect {
  override def godotClassName: String = "AudioEffectCompressor"

  /** AudioEffectCompressor.set_threshold */
  final def setThreshold(threshold: Double): Unit = {
    if (gdext.classes.AudioEffectCompressor.mb_set_threshold == null) gdext.classes.AudioEffectCompressor.mb_set_threshold = MethodBind.get("AudioEffectCompressor", "set_threshold", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectCompressor.mb_set_threshold, livePtr, threshold)
  }

  /** AudioEffectCompressor.get_threshold */
  final def getThreshold(): Double = {
    if (gdext.classes.AudioEffectCompressor.mb_get_threshold == null) gdext.classes.AudioEffectCompressor.mb_get_threshold = MethodBind.get("AudioEffectCompressor", "get_threshold", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioEffectCompressor.mb_get_threshold, livePtr)
  }

  /** AudioEffectCompressor.set_ratio */
  final def setRatio(ratio: Double): Unit = {
    if (gdext.classes.AudioEffectCompressor.mb_set_ratio == null) gdext.classes.AudioEffectCompressor.mb_set_ratio = MethodBind.get("AudioEffectCompressor", "set_ratio", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectCompressor.mb_set_ratio, livePtr, ratio)
  }

  /** AudioEffectCompressor.get_ratio */
  final def getRatio(): Double = {
    if (gdext.classes.AudioEffectCompressor.mb_get_ratio == null) gdext.classes.AudioEffectCompressor.mb_get_ratio = MethodBind.get("AudioEffectCompressor", "get_ratio", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioEffectCompressor.mb_get_ratio, livePtr)
  }

  /** AudioEffectCompressor.set_gain */
  final def setGain(gain: Double): Unit = {
    if (gdext.classes.AudioEffectCompressor.mb_set_gain == null) gdext.classes.AudioEffectCompressor.mb_set_gain = MethodBind.get("AudioEffectCompressor", "set_gain", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectCompressor.mb_set_gain, livePtr, gain)
  }

  /** AudioEffectCompressor.get_gain */
  final def getGain(): Double = {
    if (gdext.classes.AudioEffectCompressor.mb_get_gain == null) gdext.classes.AudioEffectCompressor.mb_get_gain = MethodBind.get("AudioEffectCompressor", "get_gain", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioEffectCompressor.mb_get_gain, livePtr)
  }

  /** AudioEffectCompressor.set_attack_us */
  final def setAttackUs(attack_us: Double): Unit = {
    if (gdext.classes.AudioEffectCompressor.mb_set_attack_us == null) gdext.classes.AudioEffectCompressor.mb_set_attack_us = MethodBind.get("AudioEffectCompressor", "set_attack_us", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectCompressor.mb_set_attack_us, livePtr, attack_us)
  }

  /** AudioEffectCompressor.get_attack_us */
  final def getAttackUs(): Double = {
    if (gdext.classes.AudioEffectCompressor.mb_get_attack_us == null) gdext.classes.AudioEffectCompressor.mb_get_attack_us = MethodBind.get("AudioEffectCompressor", "get_attack_us", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioEffectCompressor.mb_get_attack_us, livePtr)
  }

  /** AudioEffectCompressor.set_release_ms */
  final def setReleaseMs(release_ms: Double): Unit = {
    if (gdext.classes.AudioEffectCompressor.mb_set_release_ms == null) gdext.classes.AudioEffectCompressor.mb_set_release_ms = MethodBind.get("AudioEffectCompressor", "set_release_ms", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectCompressor.mb_set_release_ms, livePtr, release_ms)
  }

  /** AudioEffectCompressor.get_release_ms */
  final def getReleaseMs(): Double = {
    if (gdext.classes.AudioEffectCompressor.mb_get_release_ms == null) gdext.classes.AudioEffectCompressor.mb_get_release_ms = MethodBind.get("AudioEffectCompressor", "get_release_ms", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioEffectCompressor.mb_get_release_ms, livePtr)
  }

  /** AudioEffectCompressor.set_mix */
  final def setMix(mix: Double): Unit = {
    if (gdext.classes.AudioEffectCompressor.mb_set_mix == null) gdext.classes.AudioEffectCompressor.mb_set_mix = MethodBind.get("AudioEffectCompressor", "set_mix", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectCompressor.mb_set_mix, livePtr, mix)
  }

  /** AudioEffectCompressor.get_mix */
  final def getMix(): Double = {
    if (gdext.classes.AudioEffectCompressor.mb_get_mix == null) gdext.classes.AudioEffectCompressor.mb_get_mix = MethodBind.get("AudioEffectCompressor", "get_mix", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioEffectCompressor.mb_get_mix, livePtr)
  }

  /** AudioEffectCompressor.set_sidechain */
  final def setSidechain(sidechain: gdext.builtin.StringName): Unit = {
    if (gdext.classes.AudioEffectCompressor.mb_set_sidechain == null) gdext.classes.AudioEffectCompressor.mb_set_sidechain = MethodBind.get("AudioEffectCompressor", "set_sidechain", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectCompressor.mb_set_sidechain, livePtr, sidechain)
  }

  /** AudioEffectCompressor.get_sidechain */
  final def getSidechain(): gdext.builtin.StringName = {
    if (gdext.classes.AudioEffectCompressor.mb_get_sidechain == null) gdext.classes.AudioEffectCompressor.mb_get_sidechain = MethodBind.get("AudioEffectCompressor", "get_sidechain", 2002593661L)
    Ptrcall.call0[gdext.builtin.StringName](gdext.classes.AudioEffectCompressor.mb_get_sidechain, livePtr)
  }

}

object AudioEffectCompressor {
  private[classes] var mb_set_threshold: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_threshold: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_ratio: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_ratio: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_gain: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_gain: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_attack_us: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_attack_us: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_release_ms: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_release_ms: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_mix: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_mix: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_sidechain: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_sidechain: GDExtensionMethodBindPtr = null
}
