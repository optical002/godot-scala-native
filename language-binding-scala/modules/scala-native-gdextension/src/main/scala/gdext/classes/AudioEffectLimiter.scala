package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AudioEffectLimiter`, extends `AudioEffect`. */
abstract class AudioEffectLimiter extends AudioEffect {
  override def godotClassName: String = "AudioEffectLimiter"

  /** AudioEffectLimiter.set_ceiling_db */
  final def setCeilingDb(ceiling: Double): Unit = {
    if (gdext.classes.AudioEffectLimiter.mb_set_ceiling_db == null) gdext.classes.AudioEffectLimiter.mb_set_ceiling_db = MethodBind.get("AudioEffectLimiter", "set_ceiling_db", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectLimiter.mb_set_ceiling_db, livePtr, ceiling)
  }

  /** AudioEffectLimiter.get_ceiling_db */
  final def getCeilingDb(): Double = {
    if (gdext.classes.AudioEffectLimiter.mb_get_ceiling_db == null) gdext.classes.AudioEffectLimiter.mb_get_ceiling_db = MethodBind.get("AudioEffectLimiter", "get_ceiling_db", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioEffectLimiter.mb_get_ceiling_db, livePtr)
  }

  /** AudioEffectLimiter.set_threshold_db */
  final def setThresholdDb(threshold: Double): Unit = {
    if (gdext.classes.AudioEffectLimiter.mb_set_threshold_db == null) gdext.classes.AudioEffectLimiter.mb_set_threshold_db = MethodBind.get("AudioEffectLimiter", "set_threshold_db", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectLimiter.mb_set_threshold_db, livePtr, threshold)
  }

  /** AudioEffectLimiter.get_threshold_db */
  final def getThresholdDb(): Double = {
    if (gdext.classes.AudioEffectLimiter.mb_get_threshold_db == null) gdext.classes.AudioEffectLimiter.mb_get_threshold_db = MethodBind.get("AudioEffectLimiter", "get_threshold_db", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioEffectLimiter.mb_get_threshold_db, livePtr)
  }

  /** AudioEffectLimiter.set_soft_clip_db */
  final def setSoftClipDb(soft_clip: Double): Unit = {
    if (gdext.classes.AudioEffectLimiter.mb_set_soft_clip_db == null) gdext.classes.AudioEffectLimiter.mb_set_soft_clip_db = MethodBind.get("AudioEffectLimiter", "set_soft_clip_db", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectLimiter.mb_set_soft_clip_db, livePtr, soft_clip)
  }

  /** AudioEffectLimiter.get_soft_clip_db */
  final def getSoftClipDb(): Double = {
    if (gdext.classes.AudioEffectLimiter.mb_get_soft_clip_db == null) gdext.classes.AudioEffectLimiter.mb_get_soft_clip_db = MethodBind.get("AudioEffectLimiter", "get_soft_clip_db", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioEffectLimiter.mb_get_soft_clip_db, livePtr)
  }

  /** AudioEffectLimiter.set_soft_clip_ratio */
  final def setSoftClipRatio(soft_clip: Double): Unit = {
    if (gdext.classes.AudioEffectLimiter.mb_set_soft_clip_ratio == null) gdext.classes.AudioEffectLimiter.mb_set_soft_clip_ratio = MethodBind.get("AudioEffectLimiter", "set_soft_clip_ratio", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectLimiter.mb_set_soft_clip_ratio, livePtr, soft_clip)
  }

  /** AudioEffectLimiter.get_soft_clip_ratio */
  final def getSoftClipRatio(): Double = {
    if (gdext.classes.AudioEffectLimiter.mb_get_soft_clip_ratio == null) gdext.classes.AudioEffectLimiter.mb_get_soft_clip_ratio = MethodBind.get("AudioEffectLimiter", "get_soft_clip_ratio", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioEffectLimiter.mb_get_soft_clip_ratio, livePtr)
  }

}

object AudioEffectLimiter {
  private[classes] var mb_set_ceiling_db: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_ceiling_db: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_threshold_db: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_threshold_db: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_soft_clip_db: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_soft_clip_db: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_soft_clip_ratio: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_soft_clip_ratio: GDExtensionMethodBindPtr = null
}
