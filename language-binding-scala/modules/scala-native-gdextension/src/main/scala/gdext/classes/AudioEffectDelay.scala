package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AudioEffectDelay`, extends `AudioEffect`. */
abstract class AudioEffectDelay extends AudioEffect {
  override def godotClassName: String = "AudioEffectDelay"

  /** AudioEffectDelay.set_dry */
  final def setDry(amount: Double): Unit = {
    if (gdext.classes.AudioEffectDelay.mb_set_dry == null) gdext.classes.AudioEffectDelay.mb_set_dry = MethodBind.get("AudioEffectDelay", "set_dry", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectDelay.mb_set_dry, livePtr, amount)
  }

  /** AudioEffectDelay.get_dry */
  final def getDry(): Double = {
    if (gdext.classes.AudioEffectDelay.mb_get_dry == null) gdext.classes.AudioEffectDelay.mb_get_dry = MethodBind.get("AudioEffectDelay", "get_dry", 191475506L)
    Ptrcall.call0[Double](gdext.classes.AudioEffectDelay.mb_get_dry, livePtr)
  }

  /** AudioEffectDelay.set_tap1_active */
  final def setTap1Active(amount: Boolean): Unit = {
    if (gdext.classes.AudioEffectDelay.mb_set_tap1_active == null) gdext.classes.AudioEffectDelay.mb_set_tap1_active = MethodBind.get("AudioEffectDelay", "set_tap1_active", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectDelay.mb_set_tap1_active, livePtr, amount)
  }

  /** AudioEffectDelay.is_tap1_active */
  final def isTap1Active(): Boolean = {
    if (gdext.classes.AudioEffectDelay.mb_is_tap1_active == null) gdext.classes.AudioEffectDelay.mb_is_tap1_active = MethodBind.get("AudioEffectDelay", "is_tap1_active", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.AudioEffectDelay.mb_is_tap1_active, livePtr)
  }

  /** AudioEffectDelay.set_tap1_delay_ms */
  final def setTap1DelayMs(amount: Double): Unit = {
    if (gdext.classes.AudioEffectDelay.mb_set_tap1_delay_ms == null) gdext.classes.AudioEffectDelay.mb_set_tap1_delay_ms = MethodBind.get("AudioEffectDelay", "set_tap1_delay_ms", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectDelay.mb_set_tap1_delay_ms, livePtr, amount)
  }

  /** AudioEffectDelay.get_tap1_delay_ms */
  final def getTap1DelayMs(): Double = {
    if (gdext.classes.AudioEffectDelay.mb_get_tap1_delay_ms == null) gdext.classes.AudioEffectDelay.mb_get_tap1_delay_ms = MethodBind.get("AudioEffectDelay", "get_tap1_delay_ms", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioEffectDelay.mb_get_tap1_delay_ms, livePtr)
  }

  /** AudioEffectDelay.set_tap1_level_db */
  final def setTap1LevelDb(amount: Double): Unit = {
    if (gdext.classes.AudioEffectDelay.mb_set_tap1_level_db == null) gdext.classes.AudioEffectDelay.mb_set_tap1_level_db = MethodBind.get("AudioEffectDelay", "set_tap1_level_db", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectDelay.mb_set_tap1_level_db, livePtr, amount)
  }

  /** AudioEffectDelay.get_tap1_level_db */
  final def getTap1LevelDb(): Double = {
    if (gdext.classes.AudioEffectDelay.mb_get_tap1_level_db == null) gdext.classes.AudioEffectDelay.mb_get_tap1_level_db = MethodBind.get("AudioEffectDelay", "get_tap1_level_db", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioEffectDelay.mb_get_tap1_level_db, livePtr)
  }

  /** AudioEffectDelay.set_tap1_pan */
  final def setTap1Pan(amount: Double): Unit = {
    if (gdext.classes.AudioEffectDelay.mb_set_tap1_pan == null) gdext.classes.AudioEffectDelay.mb_set_tap1_pan = MethodBind.get("AudioEffectDelay", "set_tap1_pan", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectDelay.mb_set_tap1_pan, livePtr, amount)
  }

  /** AudioEffectDelay.get_tap1_pan */
  final def getTap1Pan(): Double = {
    if (gdext.classes.AudioEffectDelay.mb_get_tap1_pan == null) gdext.classes.AudioEffectDelay.mb_get_tap1_pan = MethodBind.get("AudioEffectDelay", "get_tap1_pan", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioEffectDelay.mb_get_tap1_pan, livePtr)
  }

  /** AudioEffectDelay.set_tap2_active */
  final def setTap2Active(amount: Boolean): Unit = {
    if (gdext.classes.AudioEffectDelay.mb_set_tap2_active == null) gdext.classes.AudioEffectDelay.mb_set_tap2_active = MethodBind.get("AudioEffectDelay", "set_tap2_active", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectDelay.mb_set_tap2_active, livePtr, amount)
  }

  /** AudioEffectDelay.is_tap2_active */
  final def isTap2Active(): Boolean = {
    if (gdext.classes.AudioEffectDelay.mb_is_tap2_active == null) gdext.classes.AudioEffectDelay.mb_is_tap2_active = MethodBind.get("AudioEffectDelay", "is_tap2_active", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.AudioEffectDelay.mb_is_tap2_active, livePtr)
  }

  /** AudioEffectDelay.set_tap2_delay_ms */
  final def setTap2DelayMs(amount: Double): Unit = {
    if (gdext.classes.AudioEffectDelay.mb_set_tap2_delay_ms == null) gdext.classes.AudioEffectDelay.mb_set_tap2_delay_ms = MethodBind.get("AudioEffectDelay", "set_tap2_delay_ms", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectDelay.mb_set_tap2_delay_ms, livePtr, amount)
  }

  /** AudioEffectDelay.get_tap2_delay_ms */
  final def getTap2DelayMs(): Double = {
    if (gdext.classes.AudioEffectDelay.mb_get_tap2_delay_ms == null) gdext.classes.AudioEffectDelay.mb_get_tap2_delay_ms = MethodBind.get("AudioEffectDelay", "get_tap2_delay_ms", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioEffectDelay.mb_get_tap2_delay_ms, livePtr)
  }

  /** AudioEffectDelay.set_tap2_level_db */
  final def setTap2LevelDb(amount: Double): Unit = {
    if (gdext.classes.AudioEffectDelay.mb_set_tap2_level_db == null) gdext.classes.AudioEffectDelay.mb_set_tap2_level_db = MethodBind.get("AudioEffectDelay", "set_tap2_level_db", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectDelay.mb_set_tap2_level_db, livePtr, amount)
  }

  /** AudioEffectDelay.get_tap2_level_db */
  final def getTap2LevelDb(): Double = {
    if (gdext.classes.AudioEffectDelay.mb_get_tap2_level_db == null) gdext.classes.AudioEffectDelay.mb_get_tap2_level_db = MethodBind.get("AudioEffectDelay", "get_tap2_level_db", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioEffectDelay.mb_get_tap2_level_db, livePtr)
  }

  /** AudioEffectDelay.set_tap2_pan */
  final def setTap2Pan(amount: Double): Unit = {
    if (gdext.classes.AudioEffectDelay.mb_set_tap2_pan == null) gdext.classes.AudioEffectDelay.mb_set_tap2_pan = MethodBind.get("AudioEffectDelay", "set_tap2_pan", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectDelay.mb_set_tap2_pan, livePtr, amount)
  }

  /** AudioEffectDelay.get_tap2_pan */
  final def getTap2Pan(): Double = {
    if (gdext.classes.AudioEffectDelay.mb_get_tap2_pan == null) gdext.classes.AudioEffectDelay.mb_get_tap2_pan = MethodBind.get("AudioEffectDelay", "get_tap2_pan", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioEffectDelay.mb_get_tap2_pan, livePtr)
  }

  /** AudioEffectDelay.set_feedback_active */
  final def setFeedbackActive(amount: Boolean): Unit = {
    if (gdext.classes.AudioEffectDelay.mb_set_feedback_active == null) gdext.classes.AudioEffectDelay.mb_set_feedback_active = MethodBind.get("AudioEffectDelay", "set_feedback_active", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectDelay.mb_set_feedback_active, livePtr, amount)
  }

  /** AudioEffectDelay.is_feedback_active */
  final def isFeedbackActive(): Boolean = {
    if (gdext.classes.AudioEffectDelay.mb_is_feedback_active == null) gdext.classes.AudioEffectDelay.mb_is_feedback_active = MethodBind.get("AudioEffectDelay", "is_feedback_active", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.AudioEffectDelay.mb_is_feedback_active, livePtr)
  }

  /** AudioEffectDelay.set_feedback_delay_ms */
  final def setFeedbackDelayMs(amount: Double): Unit = {
    if (gdext.classes.AudioEffectDelay.mb_set_feedback_delay_ms == null) gdext.classes.AudioEffectDelay.mb_set_feedback_delay_ms = MethodBind.get("AudioEffectDelay", "set_feedback_delay_ms", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectDelay.mb_set_feedback_delay_ms, livePtr, amount)
  }

  /** AudioEffectDelay.get_feedback_delay_ms */
  final def getFeedbackDelayMs(): Double = {
    if (gdext.classes.AudioEffectDelay.mb_get_feedback_delay_ms == null) gdext.classes.AudioEffectDelay.mb_get_feedback_delay_ms = MethodBind.get("AudioEffectDelay", "get_feedback_delay_ms", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioEffectDelay.mb_get_feedback_delay_ms, livePtr)
  }

  /** AudioEffectDelay.set_feedback_level_db */
  final def setFeedbackLevelDb(amount: Double): Unit = {
    if (gdext.classes.AudioEffectDelay.mb_set_feedback_level_db == null) gdext.classes.AudioEffectDelay.mb_set_feedback_level_db = MethodBind.get("AudioEffectDelay", "set_feedback_level_db", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectDelay.mb_set_feedback_level_db, livePtr, amount)
  }

  /** AudioEffectDelay.get_feedback_level_db */
  final def getFeedbackLevelDb(): Double = {
    if (gdext.classes.AudioEffectDelay.mb_get_feedback_level_db == null) gdext.classes.AudioEffectDelay.mb_get_feedback_level_db = MethodBind.get("AudioEffectDelay", "get_feedback_level_db", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioEffectDelay.mb_get_feedback_level_db, livePtr)
  }

  /** AudioEffectDelay.set_feedback_lowpass */
  final def setFeedbackLowpass(amount: Double): Unit = {
    if (gdext.classes.AudioEffectDelay.mb_set_feedback_lowpass == null) gdext.classes.AudioEffectDelay.mb_set_feedback_lowpass = MethodBind.get("AudioEffectDelay", "set_feedback_lowpass", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectDelay.mb_set_feedback_lowpass, livePtr, amount)
  }

  /** AudioEffectDelay.get_feedback_lowpass */
  final def getFeedbackLowpass(): Double = {
    if (gdext.classes.AudioEffectDelay.mb_get_feedback_lowpass == null) gdext.classes.AudioEffectDelay.mb_get_feedback_lowpass = MethodBind.get("AudioEffectDelay", "get_feedback_lowpass", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioEffectDelay.mb_get_feedback_lowpass, livePtr)
  }

}

object AudioEffectDelay {
  private[classes] var mb_set_dry: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_dry: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tap1_active: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_tap1_active: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tap1_delay_ms: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tap1_delay_ms: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tap1_level_db: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tap1_level_db: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tap1_pan: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tap1_pan: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tap2_active: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_tap2_active: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tap2_delay_ms: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tap2_delay_ms: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tap2_level_db: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tap2_level_db: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tap2_pan: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tap2_pan: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_feedback_active: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_feedback_active: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_feedback_delay_ms: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_feedback_delay_ms: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_feedback_level_db: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_feedback_level_db: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_feedback_lowpass: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_feedback_lowpass: GDExtensionMethodBindPtr = null
}
