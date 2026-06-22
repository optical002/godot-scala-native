package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioEffectDelay`, extends `AudioEffect`. */
abstract class AudioEffectDelay extends AudioEffect {

  /** AudioEffectDelay.set_dry */
  final def setDry(amount: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioEffectDelay", "set_dry", 373806689L), hostObject.objectPtr, amount)

  /** AudioEffectDelay.get_dry */
  final def getDry(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioEffectDelay", "get_dry", 191475506L), hostObject.objectPtr)

  /** AudioEffectDelay.set_tap1_active */
  final def setTap1Active(amount: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioEffectDelay", "set_tap1_active", 2586408642L), hostObject.objectPtr, amount)

  /** AudioEffectDelay.is_tap1_active */
  final def isTap1Active(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AudioEffectDelay", "is_tap1_active", 36873697L), hostObject.objectPtr)

  /** AudioEffectDelay.set_tap1_delay_ms */
  final def setTap1DelayMs(amount: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioEffectDelay", "set_tap1_delay_ms", 373806689L), hostObject.objectPtr, amount)

  /** AudioEffectDelay.get_tap1_delay_ms */
  final def getTap1DelayMs(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioEffectDelay", "get_tap1_delay_ms", 1740695150L), hostObject.objectPtr)

  /** AudioEffectDelay.set_tap1_level_db */
  final def setTap1LevelDb(amount: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioEffectDelay", "set_tap1_level_db", 373806689L), hostObject.objectPtr, amount)

  /** AudioEffectDelay.get_tap1_level_db */
  final def getTap1LevelDb(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioEffectDelay", "get_tap1_level_db", 1740695150L), hostObject.objectPtr)

  /** AudioEffectDelay.set_tap1_pan */
  final def setTap1Pan(amount: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioEffectDelay", "set_tap1_pan", 373806689L), hostObject.objectPtr, amount)

  /** AudioEffectDelay.get_tap1_pan */
  final def getTap1Pan(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioEffectDelay", "get_tap1_pan", 1740695150L), hostObject.objectPtr)

  /** AudioEffectDelay.set_tap2_active */
  final def setTap2Active(amount: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioEffectDelay", "set_tap2_active", 2586408642L), hostObject.objectPtr, amount)

  /** AudioEffectDelay.is_tap2_active */
  final def isTap2Active(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AudioEffectDelay", "is_tap2_active", 36873697L), hostObject.objectPtr)

  /** AudioEffectDelay.set_tap2_delay_ms */
  final def setTap2DelayMs(amount: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioEffectDelay", "set_tap2_delay_ms", 373806689L), hostObject.objectPtr, amount)

  /** AudioEffectDelay.get_tap2_delay_ms */
  final def getTap2DelayMs(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioEffectDelay", "get_tap2_delay_ms", 1740695150L), hostObject.objectPtr)

  /** AudioEffectDelay.set_tap2_level_db */
  final def setTap2LevelDb(amount: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioEffectDelay", "set_tap2_level_db", 373806689L), hostObject.objectPtr, amount)

  /** AudioEffectDelay.get_tap2_level_db */
  final def getTap2LevelDb(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioEffectDelay", "get_tap2_level_db", 1740695150L), hostObject.objectPtr)

  /** AudioEffectDelay.set_tap2_pan */
  final def setTap2Pan(amount: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioEffectDelay", "set_tap2_pan", 373806689L), hostObject.objectPtr, amount)

  /** AudioEffectDelay.get_tap2_pan */
  final def getTap2Pan(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioEffectDelay", "get_tap2_pan", 1740695150L), hostObject.objectPtr)

  /** AudioEffectDelay.set_feedback_active */
  final def setFeedbackActive(amount: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioEffectDelay", "set_feedback_active", 2586408642L), hostObject.objectPtr, amount)

  /** AudioEffectDelay.is_feedback_active */
  final def isFeedbackActive(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AudioEffectDelay", "is_feedback_active", 36873697L), hostObject.objectPtr)

  /** AudioEffectDelay.set_feedback_delay_ms */
  final def setFeedbackDelayMs(amount: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioEffectDelay", "set_feedback_delay_ms", 373806689L), hostObject.objectPtr, amount)

  /** AudioEffectDelay.get_feedback_delay_ms */
  final def getFeedbackDelayMs(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioEffectDelay", "get_feedback_delay_ms", 1740695150L), hostObject.objectPtr)

  /** AudioEffectDelay.set_feedback_level_db */
  final def setFeedbackLevelDb(amount: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioEffectDelay", "set_feedback_level_db", 373806689L), hostObject.objectPtr, amount)

  /** AudioEffectDelay.get_feedback_level_db */
  final def getFeedbackLevelDb(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioEffectDelay", "get_feedback_level_db", 1740695150L), hostObject.objectPtr)

  /** AudioEffectDelay.set_feedback_lowpass */
  final def setFeedbackLowpass(amount: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioEffectDelay", "set_feedback_lowpass", 373806689L), hostObject.objectPtr, amount)

  /** AudioEffectDelay.get_feedback_lowpass */
  final def getFeedbackLowpass(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioEffectDelay", "get_feedback_lowpass", 1740695150L), hostObject.objectPtr)

}

object AudioEffectDelay {
  /** Class metadata for Gd[AudioEffectDelay] lifetime management and casting. */
  given GodotClass[AudioEffectDelay] with {
    def className = "AudioEffectDelay"
    def isRefCounted = true
    def wrap(o: GodotObject): AudioEffectDelay = new AudioEffectDelay {}.withHost(o.objectPtr)
    def unwrap(t: AudioEffectDelay): GodotObject = t.hostObject
  }
}
