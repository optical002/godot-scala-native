package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioEffectDistortion`, extends `AudioEffect`. */
abstract class AudioEffectDistortion extends AudioEffect {
  override def godotClassName: String = "AudioEffectDistortion"

  /** AudioEffectDistortion.set_mode */
  final def setMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioEffectDistortion", "set_mode", 1314744793L), hostObject.objectPtr, mode)

  /** AudioEffectDistortion.get_mode */
  final def getMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("AudioEffectDistortion", "get_mode", 809118343L), hostObject.objectPtr)

  /** AudioEffectDistortion.set_pre_gain */
  final def setPreGain(pre_gain: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioEffectDistortion", "set_pre_gain", 373806689L), hostObject.objectPtr, pre_gain)

  /** AudioEffectDistortion.get_pre_gain */
  final def getPreGain(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioEffectDistortion", "get_pre_gain", 1740695150L), hostObject.objectPtr)

  /** AudioEffectDistortion.set_keep_hf_hz */
  final def setKeepHfHz(keep_hf_hz: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioEffectDistortion", "set_keep_hf_hz", 373806689L), hostObject.objectPtr, keep_hf_hz)

  /** AudioEffectDistortion.get_keep_hf_hz */
  final def getKeepHfHz(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioEffectDistortion", "get_keep_hf_hz", 1740695150L), hostObject.objectPtr)

  /** AudioEffectDistortion.set_drive */
  final def setDrive(drive: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioEffectDistortion", "set_drive", 373806689L), hostObject.objectPtr, drive)

  /** AudioEffectDistortion.get_drive */
  final def getDrive(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioEffectDistortion", "get_drive", 1740695150L), hostObject.objectPtr)

  /** AudioEffectDistortion.set_post_gain */
  final def setPostGain(post_gain: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioEffectDistortion", "set_post_gain", 373806689L), hostObject.objectPtr, post_gain)

  /** AudioEffectDistortion.get_post_gain */
  final def getPostGain(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioEffectDistortion", "get_post_gain", 1740695150L), hostObject.objectPtr)

}
