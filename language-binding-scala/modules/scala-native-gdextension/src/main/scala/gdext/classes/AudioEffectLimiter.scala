package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioEffectLimiter`, extends `AudioEffect`. */
abstract class AudioEffectLimiter extends AudioEffect {
  override def godotClassName: String = "AudioEffectLimiter"

  /** AudioEffectLimiter.set_ceiling_db */
  final def setCeilingDb(ceiling: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioEffectLimiter", "set_ceiling_db", 373806689L), hostObject.objectPtr, ceiling)

  /** AudioEffectLimiter.get_ceiling_db */
  final def getCeilingDb(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioEffectLimiter", "get_ceiling_db", 1740695150L), hostObject.objectPtr)

  /** AudioEffectLimiter.set_threshold_db */
  final def setThresholdDb(threshold: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioEffectLimiter", "set_threshold_db", 373806689L), hostObject.objectPtr, threshold)

  /** AudioEffectLimiter.get_threshold_db */
  final def getThresholdDb(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioEffectLimiter", "get_threshold_db", 1740695150L), hostObject.objectPtr)

  /** AudioEffectLimiter.set_soft_clip_db */
  final def setSoftClipDb(soft_clip: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioEffectLimiter", "set_soft_clip_db", 373806689L), hostObject.objectPtr, soft_clip)

  /** AudioEffectLimiter.get_soft_clip_db */
  final def getSoftClipDb(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioEffectLimiter", "get_soft_clip_db", 1740695150L), hostObject.objectPtr)

  /** AudioEffectLimiter.set_soft_clip_ratio */
  final def setSoftClipRatio(soft_clip: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioEffectLimiter", "set_soft_clip_ratio", 373806689L), hostObject.objectPtr, soft_clip)

  /** AudioEffectLimiter.get_soft_clip_ratio */
  final def getSoftClipRatio(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioEffectLimiter", "get_soft_clip_ratio", 1740695150L), hostObject.objectPtr)

}
