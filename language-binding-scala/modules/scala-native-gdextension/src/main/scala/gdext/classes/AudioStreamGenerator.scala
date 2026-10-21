package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AudioStreamGenerator`, extends `AudioStream`. */
abstract class AudioStreamGenerator extends AudioStream {
  override def godotClassName: String = "AudioStreamGenerator"

  /** AudioStreamGenerator.set_mix_rate */
  final def setMixRate(hz: Double): Unit = {
    if (gdext.classes.AudioStreamGenerator.mb_set_mix_rate == null) gdext.classes.AudioStreamGenerator.mb_set_mix_rate = MethodBind.get("AudioStreamGenerator", "set_mix_rate", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamGenerator.mb_set_mix_rate, livePtr, hz)
  }

  /** AudioStreamGenerator.get_mix_rate */
  final def getMixRate(): Double = {
    if (gdext.classes.AudioStreamGenerator.mb_get_mix_rate == null) gdext.classes.AudioStreamGenerator.mb_get_mix_rate = MethodBind.get("AudioStreamGenerator", "get_mix_rate", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioStreamGenerator.mb_get_mix_rate, livePtr)
  }

  /** AudioStreamGenerator.set_mix_rate_mode */
  final def setMixRateMode(mode: Long): Unit = {
    if (gdext.classes.AudioStreamGenerator.mb_set_mix_rate_mode == null) gdext.classes.AudioStreamGenerator.mb_set_mix_rate_mode = MethodBind.get("AudioStreamGenerator", "set_mix_rate_mode", 3354885803L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamGenerator.mb_set_mix_rate_mode, livePtr, mode)
  }

  /** AudioStreamGenerator.get_mix_rate_mode */
  final def getMixRateMode(): Long = {
    if (gdext.classes.AudioStreamGenerator.mb_get_mix_rate_mode == null) gdext.classes.AudioStreamGenerator.mb_get_mix_rate_mode = MethodBind.get("AudioStreamGenerator", "get_mix_rate_mode", 3537132591L)
    Ptrcall.call0[Long](gdext.classes.AudioStreamGenerator.mb_get_mix_rate_mode, livePtr)
  }

  /** AudioStreamGenerator.set_buffer_length */
  final def setBufferLength(seconds: Double): Unit = {
    if (gdext.classes.AudioStreamGenerator.mb_set_buffer_length == null) gdext.classes.AudioStreamGenerator.mb_set_buffer_length = MethodBind.get("AudioStreamGenerator", "set_buffer_length", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamGenerator.mb_set_buffer_length, livePtr, seconds)
  }

  /** AudioStreamGenerator.get_buffer_length */
  final def getBufferLength(): Double = {
    if (gdext.classes.AudioStreamGenerator.mb_get_buffer_length == null) gdext.classes.AudioStreamGenerator.mb_get_buffer_length = MethodBind.get("AudioStreamGenerator", "get_buffer_length", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioStreamGenerator.mb_get_buffer_length, livePtr)
  }

}

object AudioStreamGenerator {
  private[classes] var mb_set_mix_rate: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_mix_rate: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_mix_rate_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_mix_rate_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_buffer_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_buffer_length: GDExtensionMethodBindPtr = null
}
