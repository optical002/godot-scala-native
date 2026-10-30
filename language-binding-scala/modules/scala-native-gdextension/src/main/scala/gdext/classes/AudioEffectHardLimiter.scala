package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AudioEffectHardLimiter`, extends `AudioEffect`. */
abstract class AudioEffectHardLimiter extends AudioEffect {
  override def godotClassName: String = "AudioEffectHardLimiter"

  /** AudioEffectHardLimiter.set_ceiling_db */
  final def setCeilingDb(ceiling: Double): Unit = {
    if (gdext.classes.AudioEffectHardLimiter.mb_set_ceiling_db == null) gdext.classes.AudioEffectHardLimiter.mb_set_ceiling_db = MethodBind.get("AudioEffectHardLimiter", "set_ceiling_db", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectHardLimiter.mb_set_ceiling_db, livePtr, ceiling)
  }

  /** AudioEffectHardLimiter.get_ceiling_db */
  final def getCeilingDb(): Double = {
    if (gdext.classes.AudioEffectHardLimiter.mb_get_ceiling_db == null) gdext.classes.AudioEffectHardLimiter.mb_get_ceiling_db = MethodBind.get("AudioEffectHardLimiter", "get_ceiling_db", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioEffectHardLimiter.mb_get_ceiling_db, livePtr)
  }

  /** AudioEffectHardLimiter.set_pre_gain_db */
  final def setPreGainDb(pPreGain: Double): Unit = {
    if (gdext.classes.AudioEffectHardLimiter.mb_set_pre_gain_db == null) gdext.classes.AudioEffectHardLimiter.mb_set_pre_gain_db = MethodBind.get("AudioEffectHardLimiter", "set_pre_gain_db", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectHardLimiter.mb_set_pre_gain_db, livePtr, pPreGain)
  }

  /** AudioEffectHardLimiter.get_pre_gain_db */
  final def getPreGainDb(): Double = {
    if (gdext.classes.AudioEffectHardLimiter.mb_get_pre_gain_db == null) gdext.classes.AudioEffectHardLimiter.mb_get_pre_gain_db = MethodBind.get("AudioEffectHardLimiter", "get_pre_gain_db", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioEffectHardLimiter.mb_get_pre_gain_db, livePtr)
  }

  /** AudioEffectHardLimiter.set_release */
  final def setRelease(pRelease: Double): Unit = {
    if (gdext.classes.AudioEffectHardLimiter.mb_set_release == null) gdext.classes.AudioEffectHardLimiter.mb_set_release = MethodBind.get("AudioEffectHardLimiter", "set_release", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectHardLimiter.mb_set_release, livePtr, pRelease)
  }

  /** AudioEffectHardLimiter.get_release */
  final def getRelease(): Double = {
    if (gdext.classes.AudioEffectHardLimiter.mb_get_release == null) gdext.classes.AudioEffectHardLimiter.mb_get_release = MethodBind.get("AudioEffectHardLimiter", "get_release", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioEffectHardLimiter.mb_get_release, livePtr)
  }

}

object AudioEffectHardLimiter {
  private[classes] var mb_set_ceiling_db: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_ceiling_db: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_pre_gain_db: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_pre_gain_db: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_release: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_release: GDExtensionMethodBindPtr = null
}
