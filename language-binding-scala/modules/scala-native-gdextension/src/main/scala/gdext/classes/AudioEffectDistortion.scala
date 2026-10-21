package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AudioEffectDistortion`, extends `AudioEffect`. */
abstract class AudioEffectDistortion extends AudioEffect {
  override def godotClassName: String = "AudioEffectDistortion"

  /** AudioEffectDistortion.set_mode */
  final def setMode(mode: Long): Unit = {
    if (gdext.classes.AudioEffectDistortion.mb_set_mode == null) gdext.classes.AudioEffectDistortion.mb_set_mode = MethodBind.get("AudioEffectDistortion", "set_mode", 1314744793L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectDistortion.mb_set_mode, livePtr, mode)
  }

  /** AudioEffectDistortion.get_mode */
  final def getMode(): Long = {
    if (gdext.classes.AudioEffectDistortion.mb_get_mode == null) gdext.classes.AudioEffectDistortion.mb_get_mode = MethodBind.get("AudioEffectDistortion", "get_mode", 809118343L)
    Ptrcall.call0[Long](gdext.classes.AudioEffectDistortion.mb_get_mode, livePtr)
  }

  /** AudioEffectDistortion.set_pre_gain */
  final def setPreGain(pre_gain: Double): Unit = {
    if (gdext.classes.AudioEffectDistortion.mb_set_pre_gain == null) gdext.classes.AudioEffectDistortion.mb_set_pre_gain = MethodBind.get("AudioEffectDistortion", "set_pre_gain", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectDistortion.mb_set_pre_gain, livePtr, pre_gain)
  }

  /** AudioEffectDistortion.get_pre_gain */
  final def getPreGain(): Double = {
    if (gdext.classes.AudioEffectDistortion.mb_get_pre_gain == null) gdext.classes.AudioEffectDistortion.mb_get_pre_gain = MethodBind.get("AudioEffectDistortion", "get_pre_gain", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioEffectDistortion.mb_get_pre_gain, livePtr)
  }

  /** AudioEffectDistortion.set_keep_hf_hz */
  final def setKeepHfHz(keep_hf_hz: Double): Unit = {
    if (gdext.classes.AudioEffectDistortion.mb_set_keep_hf_hz == null) gdext.classes.AudioEffectDistortion.mb_set_keep_hf_hz = MethodBind.get("AudioEffectDistortion", "set_keep_hf_hz", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectDistortion.mb_set_keep_hf_hz, livePtr, keep_hf_hz)
  }

  /** AudioEffectDistortion.get_keep_hf_hz */
  final def getKeepHfHz(): Double = {
    if (gdext.classes.AudioEffectDistortion.mb_get_keep_hf_hz == null) gdext.classes.AudioEffectDistortion.mb_get_keep_hf_hz = MethodBind.get("AudioEffectDistortion", "get_keep_hf_hz", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioEffectDistortion.mb_get_keep_hf_hz, livePtr)
  }

  /** AudioEffectDistortion.set_drive */
  final def setDrive(drive: Double): Unit = {
    if (gdext.classes.AudioEffectDistortion.mb_set_drive == null) gdext.classes.AudioEffectDistortion.mb_set_drive = MethodBind.get("AudioEffectDistortion", "set_drive", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectDistortion.mb_set_drive, livePtr, drive)
  }

  /** AudioEffectDistortion.get_drive */
  final def getDrive(): Double = {
    if (gdext.classes.AudioEffectDistortion.mb_get_drive == null) gdext.classes.AudioEffectDistortion.mb_get_drive = MethodBind.get("AudioEffectDistortion", "get_drive", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioEffectDistortion.mb_get_drive, livePtr)
  }

  /** AudioEffectDistortion.set_post_gain */
  final def setPostGain(post_gain: Double): Unit = {
    if (gdext.classes.AudioEffectDistortion.mb_set_post_gain == null) gdext.classes.AudioEffectDistortion.mb_set_post_gain = MethodBind.get("AudioEffectDistortion", "set_post_gain", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectDistortion.mb_set_post_gain, livePtr, post_gain)
  }

  /** AudioEffectDistortion.get_post_gain */
  final def getPostGain(): Double = {
    if (gdext.classes.AudioEffectDistortion.mb_get_post_gain == null) gdext.classes.AudioEffectDistortion.mb_get_post_gain = MethodBind.get("AudioEffectDistortion", "get_post_gain", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioEffectDistortion.mb_get_post_gain, livePtr)
  }

}

object AudioEffectDistortion {
  private[classes] var mb_set_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_pre_gain: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_pre_gain: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_keep_hf_hz: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_keep_hf_hz: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_drive: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_drive: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_post_gain: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_post_gain: GDExtensionMethodBindPtr = null
}
