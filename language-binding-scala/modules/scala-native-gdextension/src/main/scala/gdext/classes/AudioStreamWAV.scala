package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AudioStreamWAV`, extends `AudioStream`. */
abstract class AudioStreamWAV extends AudioStream {
  override def godotClassName: String = "AudioStreamWAV"

  /** AudioStreamWAV.set_format */
  final def setFormat(format: Long): Unit = {
    if (gdext.classes.AudioStreamWAV.mb_set_format == null) gdext.classes.AudioStreamWAV.mb_set_format = MethodBind.get("AudioStreamWAV", "set_format", 60648488L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamWAV.mb_set_format, livePtr, format)
  }

  /** AudioStreamWAV.get_format */
  final def getFormat(): Long = {
    if (gdext.classes.AudioStreamWAV.mb_get_format == null) gdext.classes.AudioStreamWAV.mb_get_format = MethodBind.get("AudioStreamWAV", "get_format", 3151724922L)
    Ptrcall.call0[Long](gdext.classes.AudioStreamWAV.mb_get_format, livePtr)
  }

  /** AudioStreamWAV.set_loop_mode */
  final def setLoopMode(loop_mode: Long): Unit = {
    if (gdext.classes.AudioStreamWAV.mb_set_loop_mode == null) gdext.classes.AudioStreamWAV.mb_set_loop_mode = MethodBind.get("AudioStreamWAV", "set_loop_mode", 2444882972L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamWAV.mb_set_loop_mode, livePtr, loop_mode)
  }

  /** AudioStreamWAV.get_loop_mode */
  final def getLoopMode(): Long = {
    if (gdext.classes.AudioStreamWAV.mb_get_loop_mode == null) gdext.classes.AudioStreamWAV.mb_get_loop_mode = MethodBind.get("AudioStreamWAV", "get_loop_mode", 393560655L)
    Ptrcall.call0[Long](gdext.classes.AudioStreamWAV.mb_get_loop_mode, livePtr)
  }

  /** AudioStreamWAV.set_loop_begin */
  final def setLoopBegin(loop_begin: Long): Unit = {
    if (gdext.classes.AudioStreamWAV.mb_set_loop_begin == null) gdext.classes.AudioStreamWAV.mb_set_loop_begin = MethodBind.get("AudioStreamWAV", "set_loop_begin", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamWAV.mb_set_loop_begin, livePtr, loop_begin)
  }

  /** AudioStreamWAV.get_loop_begin */
  final def getLoopBegin(): Long = {
    if (gdext.classes.AudioStreamWAV.mb_get_loop_begin == null) gdext.classes.AudioStreamWAV.mb_get_loop_begin = MethodBind.get("AudioStreamWAV", "get_loop_begin", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.AudioStreamWAV.mb_get_loop_begin, livePtr)
  }

  /** AudioStreamWAV.set_loop_end */
  final def setLoopEnd(loop_end: Long): Unit = {
    if (gdext.classes.AudioStreamWAV.mb_set_loop_end == null) gdext.classes.AudioStreamWAV.mb_set_loop_end = MethodBind.get("AudioStreamWAV", "set_loop_end", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamWAV.mb_set_loop_end, livePtr, loop_end)
  }

  /** AudioStreamWAV.get_loop_end */
  final def getLoopEnd(): Long = {
    if (gdext.classes.AudioStreamWAV.mb_get_loop_end == null) gdext.classes.AudioStreamWAV.mb_get_loop_end = MethodBind.get("AudioStreamWAV", "get_loop_end", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.AudioStreamWAV.mb_get_loop_end, livePtr)
  }

  /** AudioStreamWAV.set_mix_rate */
  final def setMixRate(mix_rate: Long): Unit = {
    if (gdext.classes.AudioStreamWAV.mb_set_mix_rate == null) gdext.classes.AudioStreamWAV.mb_set_mix_rate = MethodBind.get("AudioStreamWAV", "set_mix_rate", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamWAV.mb_set_mix_rate, livePtr, mix_rate)
  }

  /** AudioStreamWAV.get_mix_rate */
  final def getMixRate(): Long = {
    if (gdext.classes.AudioStreamWAV.mb_get_mix_rate == null) gdext.classes.AudioStreamWAV.mb_get_mix_rate = MethodBind.get("AudioStreamWAV", "get_mix_rate", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.AudioStreamWAV.mb_get_mix_rate, livePtr)
  }

  /** AudioStreamWAV.set_stereo */
  final def setStereo(stereo: Boolean): Unit = {
    if (gdext.classes.AudioStreamWAV.mb_set_stereo == null) gdext.classes.AudioStreamWAV.mb_set_stereo = MethodBind.get("AudioStreamWAV", "set_stereo", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamWAV.mb_set_stereo, livePtr, stereo)
  }

  /** AudioStreamWAV.is_stereo */
  final def isStereo(): Boolean = {
    if (gdext.classes.AudioStreamWAV.mb_is_stereo == null) gdext.classes.AudioStreamWAV.mb_is_stereo = MethodBind.get("AudioStreamWAV", "is_stereo", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.AudioStreamWAV.mb_is_stereo, livePtr)
  }

  /** AudioStreamWAV.save_to_wav */
  final def saveToWav(path: String): Long = {
    if (gdext.classes.AudioStreamWAV.mb_save_to_wav == null) gdext.classes.AudioStreamWAV.mb_save_to_wav = MethodBind.get("AudioStreamWAV", "save_to_wav", 166001499L)
    Ptrcall.call1[String, Long](gdext.classes.AudioStreamWAV.mb_save_to_wav, livePtr, path)
  }

}

object AudioStreamWAV {
  private[classes] var mb_set_format: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_format: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_loop_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_loop_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_loop_begin: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_loop_begin: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_loop_end: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_loop_end: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_mix_rate: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_mix_rate: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_stereo: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_stereo: GDExtensionMethodBindPtr = null
  private[classes] var mb_save_to_wav: GDExtensionMethodBindPtr = null
}
