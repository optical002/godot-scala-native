package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AudioEffectReverb`, extends `AudioEffect`. */
abstract class AudioEffectReverb extends AudioEffect {
  override def godotClassName: String = "AudioEffectReverb"

  /** AudioEffectReverb.set_predelay_msec */
  final def setPredelayMsec(msec: Double): Unit = {
    if (gdext.classes.AudioEffectReverb.mb_set_predelay_msec == null) gdext.classes.AudioEffectReverb.mb_set_predelay_msec = MethodBind.get("AudioEffectReverb", "set_predelay_msec", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectReverb.mb_set_predelay_msec, livePtr, msec)
  }

  /** AudioEffectReverb.get_predelay_msec */
  final def getPredelayMsec(): Double = {
    if (gdext.classes.AudioEffectReverb.mb_get_predelay_msec == null) gdext.classes.AudioEffectReverb.mb_get_predelay_msec = MethodBind.get("AudioEffectReverb", "get_predelay_msec", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioEffectReverb.mb_get_predelay_msec, livePtr)
  }

  /** AudioEffectReverb.set_predelay_feedback */
  final def setPredelayFeedback(feedback: Double): Unit = {
    if (gdext.classes.AudioEffectReverb.mb_set_predelay_feedback == null) gdext.classes.AudioEffectReverb.mb_set_predelay_feedback = MethodBind.get("AudioEffectReverb", "set_predelay_feedback", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectReverb.mb_set_predelay_feedback, livePtr, feedback)
  }

  /** AudioEffectReverb.get_predelay_feedback */
  final def getPredelayFeedback(): Double = {
    if (gdext.classes.AudioEffectReverb.mb_get_predelay_feedback == null) gdext.classes.AudioEffectReverb.mb_get_predelay_feedback = MethodBind.get("AudioEffectReverb", "get_predelay_feedback", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioEffectReverb.mb_get_predelay_feedback, livePtr)
  }

  /** AudioEffectReverb.set_room_size */
  final def setRoomSize(size: Double): Unit = {
    if (gdext.classes.AudioEffectReverb.mb_set_room_size == null) gdext.classes.AudioEffectReverb.mb_set_room_size = MethodBind.get("AudioEffectReverb", "set_room_size", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectReverb.mb_set_room_size, livePtr, size)
  }

  /** AudioEffectReverb.get_room_size */
  final def getRoomSize(): Double = {
    if (gdext.classes.AudioEffectReverb.mb_get_room_size == null) gdext.classes.AudioEffectReverb.mb_get_room_size = MethodBind.get("AudioEffectReverb", "get_room_size", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioEffectReverb.mb_get_room_size, livePtr)
  }

  /** AudioEffectReverb.set_damping */
  final def setDamping(amount: Double): Unit = {
    if (gdext.classes.AudioEffectReverb.mb_set_damping == null) gdext.classes.AudioEffectReverb.mb_set_damping = MethodBind.get("AudioEffectReverb", "set_damping", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectReverb.mb_set_damping, livePtr, amount)
  }

  /** AudioEffectReverb.get_damping */
  final def getDamping(): Double = {
    if (gdext.classes.AudioEffectReverb.mb_get_damping == null) gdext.classes.AudioEffectReverb.mb_get_damping = MethodBind.get("AudioEffectReverb", "get_damping", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioEffectReverb.mb_get_damping, livePtr)
  }

  /** AudioEffectReverb.set_spread */
  final def setSpread(amount: Double): Unit = {
    if (gdext.classes.AudioEffectReverb.mb_set_spread == null) gdext.classes.AudioEffectReverb.mb_set_spread = MethodBind.get("AudioEffectReverb", "set_spread", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectReverb.mb_set_spread, livePtr, amount)
  }

  /** AudioEffectReverb.get_spread */
  final def getSpread(): Double = {
    if (gdext.classes.AudioEffectReverb.mb_get_spread == null) gdext.classes.AudioEffectReverb.mb_get_spread = MethodBind.get("AudioEffectReverb", "get_spread", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioEffectReverb.mb_get_spread, livePtr)
  }

  /** AudioEffectReverb.set_dry */
  final def setDry(amount: Double): Unit = {
    if (gdext.classes.AudioEffectReverb.mb_set_dry == null) gdext.classes.AudioEffectReverb.mb_set_dry = MethodBind.get("AudioEffectReverb", "set_dry", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectReverb.mb_set_dry, livePtr, amount)
  }

  /** AudioEffectReverb.get_dry */
  final def getDry(): Double = {
    if (gdext.classes.AudioEffectReverb.mb_get_dry == null) gdext.classes.AudioEffectReverb.mb_get_dry = MethodBind.get("AudioEffectReverb", "get_dry", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioEffectReverb.mb_get_dry, livePtr)
  }

  /** AudioEffectReverb.set_wet */
  final def setWet(amount: Double): Unit = {
    if (gdext.classes.AudioEffectReverb.mb_set_wet == null) gdext.classes.AudioEffectReverb.mb_set_wet = MethodBind.get("AudioEffectReverb", "set_wet", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectReverb.mb_set_wet, livePtr, amount)
  }

  /** AudioEffectReverb.get_wet */
  final def getWet(): Double = {
    if (gdext.classes.AudioEffectReverb.mb_get_wet == null) gdext.classes.AudioEffectReverb.mb_get_wet = MethodBind.get("AudioEffectReverb", "get_wet", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioEffectReverb.mb_get_wet, livePtr)
  }

  /** AudioEffectReverb.set_hpf */
  final def setHpf(amount: Double): Unit = {
    if (gdext.classes.AudioEffectReverb.mb_set_hpf == null) gdext.classes.AudioEffectReverb.mb_set_hpf = MethodBind.get("AudioEffectReverb", "set_hpf", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectReverb.mb_set_hpf, livePtr, amount)
  }

  /** AudioEffectReverb.get_hpf */
  final def getHpf(): Double = {
    if (gdext.classes.AudioEffectReverb.mb_get_hpf == null) gdext.classes.AudioEffectReverb.mb_get_hpf = MethodBind.get("AudioEffectReverb", "get_hpf", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioEffectReverb.mb_get_hpf, livePtr)
  }

}

object AudioEffectReverb {
  private[classes] var mb_set_predelay_msec: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_predelay_msec: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_predelay_feedback: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_predelay_feedback: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_room_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_room_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_damping: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_damping: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_spread: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_spread: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_dry: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_dry: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_wet: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_wet: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_hpf: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_hpf: GDExtensionMethodBindPtr = null
}
