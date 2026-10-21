package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AudioEffectPhaser`, extends `AudioEffect`. */
abstract class AudioEffectPhaser extends AudioEffect {
  override def godotClassName: String = "AudioEffectPhaser"

  /** AudioEffectPhaser.set_range_min_hz */
  final def setRangeMinHz(hz: Double): Unit = {
    if (gdext.classes.AudioEffectPhaser.mb_set_range_min_hz == null) gdext.classes.AudioEffectPhaser.mb_set_range_min_hz = MethodBind.get("AudioEffectPhaser", "set_range_min_hz", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectPhaser.mb_set_range_min_hz, livePtr, hz)
  }

  /** AudioEffectPhaser.get_range_min_hz */
  final def getRangeMinHz(): Double = {
    if (gdext.classes.AudioEffectPhaser.mb_get_range_min_hz == null) gdext.classes.AudioEffectPhaser.mb_get_range_min_hz = MethodBind.get("AudioEffectPhaser", "get_range_min_hz", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioEffectPhaser.mb_get_range_min_hz, livePtr)
  }

  /** AudioEffectPhaser.set_range_max_hz */
  final def setRangeMaxHz(hz: Double): Unit = {
    if (gdext.classes.AudioEffectPhaser.mb_set_range_max_hz == null) gdext.classes.AudioEffectPhaser.mb_set_range_max_hz = MethodBind.get("AudioEffectPhaser", "set_range_max_hz", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectPhaser.mb_set_range_max_hz, livePtr, hz)
  }

  /** AudioEffectPhaser.get_range_max_hz */
  final def getRangeMaxHz(): Double = {
    if (gdext.classes.AudioEffectPhaser.mb_get_range_max_hz == null) gdext.classes.AudioEffectPhaser.mb_get_range_max_hz = MethodBind.get("AudioEffectPhaser", "get_range_max_hz", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioEffectPhaser.mb_get_range_max_hz, livePtr)
  }

  /** AudioEffectPhaser.set_rate_hz */
  final def setRateHz(hz: Double): Unit = {
    if (gdext.classes.AudioEffectPhaser.mb_set_rate_hz == null) gdext.classes.AudioEffectPhaser.mb_set_rate_hz = MethodBind.get("AudioEffectPhaser", "set_rate_hz", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectPhaser.mb_set_rate_hz, livePtr, hz)
  }

  /** AudioEffectPhaser.get_rate_hz */
  final def getRateHz(): Double = {
    if (gdext.classes.AudioEffectPhaser.mb_get_rate_hz == null) gdext.classes.AudioEffectPhaser.mb_get_rate_hz = MethodBind.get("AudioEffectPhaser", "get_rate_hz", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioEffectPhaser.mb_get_rate_hz, livePtr)
  }

  /** AudioEffectPhaser.set_feedback */
  final def setFeedback(fbk: Double): Unit = {
    if (gdext.classes.AudioEffectPhaser.mb_set_feedback == null) gdext.classes.AudioEffectPhaser.mb_set_feedback = MethodBind.get("AudioEffectPhaser", "set_feedback", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectPhaser.mb_set_feedback, livePtr, fbk)
  }

  /** AudioEffectPhaser.get_feedback */
  final def getFeedback(): Double = {
    if (gdext.classes.AudioEffectPhaser.mb_get_feedback == null) gdext.classes.AudioEffectPhaser.mb_get_feedback = MethodBind.get("AudioEffectPhaser", "get_feedback", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioEffectPhaser.mb_get_feedback, livePtr)
  }

  /** AudioEffectPhaser.set_depth */
  final def setDepth(depth: Double): Unit = {
    if (gdext.classes.AudioEffectPhaser.mb_set_depth == null) gdext.classes.AudioEffectPhaser.mb_set_depth = MethodBind.get("AudioEffectPhaser", "set_depth", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectPhaser.mb_set_depth, livePtr, depth)
  }

  /** AudioEffectPhaser.get_depth */
  final def getDepth(): Double = {
    if (gdext.classes.AudioEffectPhaser.mb_get_depth == null) gdext.classes.AudioEffectPhaser.mb_get_depth = MethodBind.get("AudioEffectPhaser", "get_depth", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioEffectPhaser.mb_get_depth, livePtr)
  }

}

object AudioEffectPhaser {
  private[classes] var mb_set_range_min_hz: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_range_min_hz: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_range_max_hz: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_range_max_hz: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_rate_hz: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_rate_hz: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_feedback: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_feedback: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_depth: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_depth: GDExtensionMethodBindPtr = null
}
