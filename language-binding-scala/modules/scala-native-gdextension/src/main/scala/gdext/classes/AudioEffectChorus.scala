package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AudioEffectChorus`, extends `AudioEffect`. */
abstract class AudioEffectChorus extends AudioEffect {
  override def godotClassName: String = "AudioEffectChorus"

  /** AudioEffectChorus.set_voice_count */
  final def setVoiceCount(voices: Long): Unit = {
    if (gdext.classes.AudioEffectChorus.mb_set_voice_count == null) gdext.classes.AudioEffectChorus.mb_set_voice_count = MethodBind.get("AudioEffectChorus", "set_voice_count", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectChorus.mb_set_voice_count, livePtr, voices)
  }

  /** AudioEffectChorus.get_voice_count */
  final def getVoiceCount(): Long = {
    if (gdext.classes.AudioEffectChorus.mb_get_voice_count == null) gdext.classes.AudioEffectChorus.mb_get_voice_count = MethodBind.get("AudioEffectChorus", "get_voice_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.AudioEffectChorus.mb_get_voice_count, livePtr)
  }

  /** AudioEffectChorus.set_voice_delay_ms */
  final def setVoiceDelayMs(voice_idx: Long, delay_ms: Double): Unit = {
    if (gdext.classes.AudioEffectChorus.mb_set_voice_delay_ms == null) gdext.classes.AudioEffectChorus.mb_set_voice_delay_ms = MethodBind.get("AudioEffectChorus", "set_voice_delay_ms", 1602489585L)
    Ptrcall.callVoid2(gdext.classes.AudioEffectChorus.mb_set_voice_delay_ms, livePtr, voice_idx, delay_ms)
  }

  /** AudioEffectChorus.get_voice_delay_ms */
  final def getVoiceDelayMs(voice_idx: Long): Double = {
    if (gdext.classes.AudioEffectChorus.mb_get_voice_delay_ms == null) gdext.classes.AudioEffectChorus.mb_get_voice_delay_ms = MethodBind.get("AudioEffectChorus", "get_voice_delay_ms", 2339986948L)
    Ptrcall.call1[Long, Double](gdext.classes.AudioEffectChorus.mb_get_voice_delay_ms, livePtr, voice_idx)
  }

  /** AudioEffectChorus.set_voice_rate_hz */
  final def setVoiceRateHz(voice_idx: Long, rate_hz: Double): Unit = {
    if (gdext.classes.AudioEffectChorus.mb_set_voice_rate_hz == null) gdext.classes.AudioEffectChorus.mb_set_voice_rate_hz = MethodBind.get("AudioEffectChorus", "set_voice_rate_hz", 1602489585L)
    Ptrcall.callVoid2(gdext.classes.AudioEffectChorus.mb_set_voice_rate_hz, livePtr, voice_idx, rate_hz)
  }

  /** AudioEffectChorus.get_voice_rate_hz */
  final def getVoiceRateHz(voice_idx: Long): Double = {
    if (gdext.classes.AudioEffectChorus.mb_get_voice_rate_hz == null) gdext.classes.AudioEffectChorus.mb_get_voice_rate_hz = MethodBind.get("AudioEffectChorus", "get_voice_rate_hz", 2339986948L)
    Ptrcall.call1[Long, Double](gdext.classes.AudioEffectChorus.mb_get_voice_rate_hz, livePtr, voice_idx)
  }

  /** AudioEffectChorus.set_voice_depth_ms */
  final def setVoiceDepthMs(voice_idx: Long, depth_ms: Double): Unit = {
    if (gdext.classes.AudioEffectChorus.mb_set_voice_depth_ms == null) gdext.classes.AudioEffectChorus.mb_set_voice_depth_ms = MethodBind.get("AudioEffectChorus", "set_voice_depth_ms", 1602489585L)
    Ptrcall.callVoid2(gdext.classes.AudioEffectChorus.mb_set_voice_depth_ms, livePtr, voice_idx, depth_ms)
  }

  /** AudioEffectChorus.get_voice_depth_ms */
  final def getVoiceDepthMs(voice_idx: Long): Double = {
    if (gdext.classes.AudioEffectChorus.mb_get_voice_depth_ms == null) gdext.classes.AudioEffectChorus.mb_get_voice_depth_ms = MethodBind.get("AudioEffectChorus", "get_voice_depth_ms", 2339986948L)
    Ptrcall.call1[Long, Double](gdext.classes.AudioEffectChorus.mb_get_voice_depth_ms, livePtr, voice_idx)
  }

  /** AudioEffectChorus.set_voice_level_db */
  final def setVoiceLevelDb(voice_idx: Long, level_db: Double): Unit = {
    if (gdext.classes.AudioEffectChorus.mb_set_voice_level_db == null) gdext.classes.AudioEffectChorus.mb_set_voice_level_db = MethodBind.get("AudioEffectChorus", "set_voice_level_db", 1602489585L)
    Ptrcall.callVoid2(gdext.classes.AudioEffectChorus.mb_set_voice_level_db, livePtr, voice_idx, level_db)
  }

  /** AudioEffectChorus.get_voice_level_db */
  final def getVoiceLevelDb(voice_idx: Long): Double = {
    if (gdext.classes.AudioEffectChorus.mb_get_voice_level_db == null) gdext.classes.AudioEffectChorus.mb_get_voice_level_db = MethodBind.get("AudioEffectChorus", "get_voice_level_db", 2339986948L)
    Ptrcall.call1[Long, Double](gdext.classes.AudioEffectChorus.mb_get_voice_level_db, livePtr, voice_idx)
  }

  /** AudioEffectChorus.set_voice_cutoff_hz */
  final def setVoiceCutoffHz(voice_idx: Long, cutoff_hz: Double): Unit = {
    if (gdext.classes.AudioEffectChorus.mb_set_voice_cutoff_hz == null) gdext.classes.AudioEffectChorus.mb_set_voice_cutoff_hz = MethodBind.get("AudioEffectChorus", "set_voice_cutoff_hz", 1602489585L)
    Ptrcall.callVoid2(gdext.classes.AudioEffectChorus.mb_set_voice_cutoff_hz, livePtr, voice_idx, cutoff_hz)
  }

  /** AudioEffectChorus.get_voice_cutoff_hz */
  final def getVoiceCutoffHz(voice_idx: Long): Double = {
    if (gdext.classes.AudioEffectChorus.mb_get_voice_cutoff_hz == null) gdext.classes.AudioEffectChorus.mb_get_voice_cutoff_hz = MethodBind.get("AudioEffectChorus", "get_voice_cutoff_hz", 2339986948L)
    Ptrcall.call1[Long, Double](gdext.classes.AudioEffectChorus.mb_get_voice_cutoff_hz, livePtr, voice_idx)
  }

  /** AudioEffectChorus.set_voice_pan */
  final def setVoicePan(voice_idx: Long, pan: Double): Unit = {
    if (gdext.classes.AudioEffectChorus.mb_set_voice_pan == null) gdext.classes.AudioEffectChorus.mb_set_voice_pan = MethodBind.get("AudioEffectChorus", "set_voice_pan", 1602489585L)
    Ptrcall.callVoid2(gdext.classes.AudioEffectChorus.mb_set_voice_pan, livePtr, voice_idx, pan)
  }

  /** AudioEffectChorus.get_voice_pan */
  final def getVoicePan(voice_idx: Long): Double = {
    if (gdext.classes.AudioEffectChorus.mb_get_voice_pan == null) gdext.classes.AudioEffectChorus.mb_get_voice_pan = MethodBind.get("AudioEffectChorus", "get_voice_pan", 2339986948L)
    Ptrcall.call1[Long, Double](gdext.classes.AudioEffectChorus.mb_get_voice_pan, livePtr, voice_idx)
  }

  /** AudioEffectChorus.set_wet */
  final def setWet(amount: Double): Unit = {
    if (gdext.classes.AudioEffectChorus.mb_set_wet == null) gdext.classes.AudioEffectChorus.mb_set_wet = MethodBind.get("AudioEffectChorus", "set_wet", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectChorus.mb_set_wet, livePtr, amount)
  }

  /** AudioEffectChorus.get_wet */
  final def getWet(): Double = {
    if (gdext.classes.AudioEffectChorus.mb_get_wet == null) gdext.classes.AudioEffectChorus.mb_get_wet = MethodBind.get("AudioEffectChorus", "get_wet", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioEffectChorus.mb_get_wet, livePtr)
  }

  /** AudioEffectChorus.set_dry */
  final def setDry(amount: Double): Unit = {
    if (gdext.classes.AudioEffectChorus.mb_set_dry == null) gdext.classes.AudioEffectChorus.mb_set_dry = MethodBind.get("AudioEffectChorus", "set_dry", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectChorus.mb_set_dry, livePtr, amount)
  }

  /** AudioEffectChorus.get_dry */
  final def getDry(): Double = {
    if (gdext.classes.AudioEffectChorus.mb_get_dry == null) gdext.classes.AudioEffectChorus.mb_get_dry = MethodBind.get("AudioEffectChorus", "get_dry", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioEffectChorus.mb_get_dry, livePtr)
  }

}

object AudioEffectChorus {
  private[classes] var mb_set_voice_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_voice_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_voice_delay_ms: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_voice_delay_ms: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_voice_rate_hz: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_voice_rate_hz: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_voice_depth_ms: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_voice_depth_ms: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_voice_level_db: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_voice_level_db: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_voice_cutoff_hz: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_voice_cutoff_hz: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_voice_pan: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_voice_pan: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_wet: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_wet: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_dry: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_dry: GDExtensionMethodBindPtr = null
}
