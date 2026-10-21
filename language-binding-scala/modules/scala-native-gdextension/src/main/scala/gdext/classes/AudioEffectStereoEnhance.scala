package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AudioEffectStereoEnhance`, extends `AudioEffect`. */
abstract class AudioEffectStereoEnhance extends AudioEffect {
  override def godotClassName: String = "AudioEffectStereoEnhance"

  /** AudioEffectStereoEnhance.set_pan_pullout */
  final def setPanPullout(amount: Double): Unit = {
    if (gdext.classes.AudioEffectStereoEnhance.mb_set_pan_pullout == null) gdext.classes.AudioEffectStereoEnhance.mb_set_pan_pullout = MethodBind.get("AudioEffectStereoEnhance", "set_pan_pullout", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectStereoEnhance.mb_set_pan_pullout, livePtr, amount)
  }

  /** AudioEffectStereoEnhance.get_pan_pullout */
  final def getPanPullout(): Double = {
    if (gdext.classes.AudioEffectStereoEnhance.mb_get_pan_pullout == null) gdext.classes.AudioEffectStereoEnhance.mb_get_pan_pullout = MethodBind.get("AudioEffectStereoEnhance", "get_pan_pullout", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioEffectStereoEnhance.mb_get_pan_pullout, livePtr)
  }

  /** AudioEffectStereoEnhance.set_time_pullout */
  final def setTimePullout(amount: Double): Unit = {
    if (gdext.classes.AudioEffectStereoEnhance.mb_set_time_pullout == null) gdext.classes.AudioEffectStereoEnhance.mb_set_time_pullout = MethodBind.get("AudioEffectStereoEnhance", "set_time_pullout", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectStereoEnhance.mb_set_time_pullout, livePtr, amount)
  }

  /** AudioEffectStereoEnhance.get_time_pullout */
  final def getTimePullout(): Double = {
    if (gdext.classes.AudioEffectStereoEnhance.mb_get_time_pullout == null) gdext.classes.AudioEffectStereoEnhance.mb_get_time_pullout = MethodBind.get("AudioEffectStereoEnhance", "get_time_pullout", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioEffectStereoEnhance.mb_get_time_pullout, livePtr)
  }

  /** AudioEffectStereoEnhance.set_surround */
  final def setSurround(amount: Double): Unit = {
    if (gdext.classes.AudioEffectStereoEnhance.mb_set_surround == null) gdext.classes.AudioEffectStereoEnhance.mb_set_surround = MethodBind.get("AudioEffectStereoEnhance", "set_surround", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectStereoEnhance.mb_set_surround, livePtr, amount)
  }

  /** AudioEffectStereoEnhance.get_surround */
  final def getSurround(): Double = {
    if (gdext.classes.AudioEffectStereoEnhance.mb_get_surround == null) gdext.classes.AudioEffectStereoEnhance.mb_get_surround = MethodBind.get("AudioEffectStereoEnhance", "get_surround", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioEffectStereoEnhance.mb_get_surround, livePtr)
  }

}

object AudioEffectStereoEnhance {
  private[classes] var mb_set_pan_pullout: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_pan_pullout: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_time_pullout: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_time_pullout: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_surround: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_surround: GDExtensionMethodBindPtr = null
}
