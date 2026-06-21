package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioEffectChorus`, extends `AudioEffect`. */
abstract class AudioEffectChorus extends AudioEffect {

  /** AudioEffectChorus.set_voice_count */
  final def setVoiceCount(voices: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioEffectChorus", "set_voice_count", 1286410249L), hostObject.objectPtr, voices)

  /** AudioEffectChorus.get_voice_count */
  final def getVoiceCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("AudioEffectChorus", "get_voice_count", 3905245786L), hostObject.objectPtr)

  /** AudioEffectChorus.set_voice_delay_ms */
  final def setVoiceDelayMs(voice_idx: Long, delay_ms: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("AudioEffectChorus", "set_voice_delay_ms", 1602489585L), hostObject.objectPtr, voice_idx, delay_ms)

  /** AudioEffectChorus.get_voice_delay_ms */
  final def getVoiceDelayMs(voice_idx: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("AudioEffectChorus", "get_voice_delay_ms", 2339986948L), hostObject.objectPtr, voice_idx)

  /** AudioEffectChorus.set_voice_rate_hz */
  final def setVoiceRateHz(voice_idx: Long, rate_hz: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("AudioEffectChorus", "set_voice_rate_hz", 1602489585L), hostObject.objectPtr, voice_idx, rate_hz)

  /** AudioEffectChorus.get_voice_rate_hz */
  final def getVoiceRateHz(voice_idx: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("AudioEffectChorus", "get_voice_rate_hz", 2339986948L), hostObject.objectPtr, voice_idx)

  /** AudioEffectChorus.set_voice_depth_ms */
  final def setVoiceDepthMs(voice_idx: Long, depth_ms: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("AudioEffectChorus", "set_voice_depth_ms", 1602489585L), hostObject.objectPtr, voice_idx, depth_ms)

  /** AudioEffectChorus.get_voice_depth_ms */
  final def getVoiceDepthMs(voice_idx: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("AudioEffectChorus", "get_voice_depth_ms", 2339986948L), hostObject.objectPtr, voice_idx)

  /** AudioEffectChorus.set_voice_level_db */
  final def setVoiceLevelDb(voice_idx: Long, level_db: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("AudioEffectChorus", "set_voice_level_db", 1602489585L), hostObject.objectPtr, voice_idx, level_db)

  /** AudioEffectChorus.get_voice_level_db */
  final def getVoiceLevelDb(voice_idx: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("AudioEffectChorus", "get_voice_level_db", 2339986948L), hostObject.objectPtr, voice_idx)

  /** AudioEffectChorus.set_voice_cutoff_hz */
  final def setVoiceCutoffHz(voice_idx: Long, cutoff_hz: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("AudioEffectChorus", "set_voice_cutoff_hz", 1602489585L), hostObject.objectPtr, voice_idx, cutoff_hz)

  /** AudioEffectChorus.get_voice_cutoff_hz */
  final def getVoiceCutoffHz(voice_idx: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("AudioEffectChorus", "get_voice_cutoff_hz", 2339986948L), hostObject.objectPtr, voice_idx)

  /** AudioEffectChorus.set_voice_pan */
  final def setVoicePan(voice_idx: Long, pan: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("AudioEffectChorus", "set_voice_pan", 1602489585L), hostObject.objectPtr, voice_idx, pan)

  /** AudioEffectChorus.get_voice_pan */
  final def getVoicePan(voice_idx: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("AudioEffectChorus", "get_voice_pan", 2339986948L), hostObject.objectPtr, voice_idx)

  /** AudioEffectChorus.set_wet */
  final def setWet(amount: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioEffectChorus", "set_wet", 373806689L), hostObject.objectPtr, amount)

  /** AudioEffectChorus.get_wet */
  final def getWet(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioEffectChorus", "get_wet", 1740695150L), hostObject.objectPtr)

  /** AudioEffectChorus.set_dry */
  final def setDry(amount: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioEffectChorus", "set_dry", 373806689L), hostObject.objectPtr, amount)

  /** AudioEffectChorus.get_dry */
  final def getDry(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioEffectChorus", "get_dry", 1740695150L), hostObject.objectPtr)

}

object AudioEffectChorus {
  /** Class metadata for Gd[AudioEffectChorus] lifetime management and casting. */
  given GodotClass[AudioEffectChorus] with {
    def className = "AudioEffectChorus"
    def isRefCounted = true
    def wrap(o: GodotObject): AudioEffectChorus = new AudioEffectChorus {}.withHost(o.objectPtr)
    def unwrap(t: AudioEffectChorus): GodotObject = t.hostObject
  }
}
