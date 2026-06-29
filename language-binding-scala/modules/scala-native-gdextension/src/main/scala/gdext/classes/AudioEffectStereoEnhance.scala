package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioEffectStereoEnhance`, extends `AudioEffect`. */
abstract class AudioEffectStereoEnhance extends AudioEffect {
  override def godotClassName: String = "AudioEffectStereoEnhance"

  /** AudioEffectStereoEnhance.set_pan_pullout */
  final def setPanPullout(amount: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioEffectStereoEnhance", "set_pan_pullout", 373806689L), hostObject.objectPtr, amount)

  /** AudioEffectStereoEnhance.get_pan_pullout */
  final def getPanPullout(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioEffectStereoEnhance", "get_pan_pullout", 1740695150L), hostObject.objectPtr)

  /** AudioEffectStereoEnhance.set_time_pullout */
  final def setTimePullout(amount: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioEffectStereoEnhance", "set_time_pullout", 373806689L), hostObject.objectPtr, amount)

  /** AudioEffectStereoEnhance.get_time_pullout */
  final def getTimePullout(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioEffectStereoEnhance", "get_time_pullout", 1740695150L), hostObject.objectPtr)

  /** AudioEffectStereoEnhance.set_surround */
  final def setSurround(amount: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioEffectStereoEnhance", "set_surround", 373806689L), hostObject.objectPtr, amount)

  /** AudioEffectStereoEnhance.get_surround */
  final def getSurround(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioEffectStereoEnhance", "get_surround", 1740695150L), hostObject.objectPtr)

}
