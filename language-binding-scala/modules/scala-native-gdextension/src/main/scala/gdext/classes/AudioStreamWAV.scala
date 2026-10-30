package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AudioStreamWAV`, extends `AudioStream`. */
abstract class AudioStreamWAV extends AudioStream {
  override def godotClassName: String = "AudioStreamWAV"

  /** AudioStreamWAV.set_format */
  final def setFormat(format: gdext.classes.AudioStreamWAV.Format): Unit = {
    if (gdext.classes.AudioStreamWAV.mb_set_format == null) gdext.classes.AudioStreamWAV.mb_set_format = MethodBind.get("AudioStreamWAV", "set_format", 60648488L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamWAV.mb_set_format, livePtr, format)
  }

  /** AudioStreamWAV.get_format */
  final def getFormat(): gdext.classes.AudioStreamWAV.Format = {
    if (gdext.classes.AudioStreamWAV.mb_get_format == null) gdext.classes.AudioStreamWAV.mb_get_format = MethodBind.get("AudioStreamWAV", "get_format", 3151724922L)
    gdext.classes.AudioStreamWAV.Format(Ptrcall.call0[Long](gdext.classes.AudioStreamWAV.mb_get_format, livePtr))
  }

  /** AudioStreamWAV.set_loop_mode */
  final def setLoopMode(loopMode: gdext.classes.AudioStreamWAV.LoopMode): Unit = {
    if (gdext.classes.AudioStreamWAV.mb_set_loop_mode == null) gdext.classes.AudioStreamWAV.mb_set_loop_mode = MethodBind.get("AudioStreamWAV", "set_loop_mode", 2444882972L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamWAV.mb_set_loop_mode, livePtr, loopMode)
  }

  /** AudioStreamWAV.get_loop_mode */
  final def getLoopMode(): gdext.classes.AudioStreamWAV.LoopMode = {
    if (gdext.classes.AudioStreamWAV.mb_get_loop_mode == null) gdext.classes.AudioStreamWAV.mb_get_loop_mode = MethodBind.get("AudioStreamWAV", "get_loop_mode", 393560655L)
    gdext.classes.AudioStreamWAV.LoopMode(Ptrcall.call0[Long](gdext.classes.AudioStreamWAV.mb_get_loop_mode, livePtr))
  }

  /** AudioStreamWAV.set_loop_begin */
  final def setLoopBegin(loopBegin: Long): Unit = {
    if (gdext.classes.AudioStreamWAV.mb_set_loop_begin == null) gdext.classes.AudioStreamWAV.mb_set_loop_begin = MethodBind.get("AudioStreamWAV", "set_loop_begin", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamWAV.mb_set_loop_begin, livePtr, loopBegin)
  }

  /** AudioStreamWAV.get_loop_begin */
  final def getLoopBegin(): Long = {
    if (gdext.classes.AudioStreamWAV.mb_get_loop_begin == null) gdext.classes.AudioStreamWAV.mb_get_loop_begin = MethodBind.get("AudioStreamWAV", "get_loop_begin", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.AudioStreamWAV.mb_get_loop_begin, livePtr)
  }

  /** AudioStreamWAV.set_loop_end */
  final def setLoopEnd(loopEnd: Long): Unit = {
    if (gdext.classes.AudioStreamWAV.mb_set_loop_end == null) gdext.classes.AudioStreamWAV.mb_set_loop_end = MethodBind.get("AudioStreamWAV", "set_loop_end", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamWAV.mb_set_loop_end, livePtr, loopEnd)
  }

  /** AudioStreamWAV.get_loop_end */
  final def getLoopEnd(): Long = {
    if (gdext.classes.AudioStreamWAV.mb_get_loop_end == null) gdext.classes.AudioStreamWAV.mb_get_loop_end = MethodBind.get("AudioStreamWAV", "get_loop_end", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.AudioStreamWAV.mb_get_loop_end, livePtr)
  }

  /** AudioStreamWAV.set_mix_rate */
  final def setMixRate(mixRate: Long): Unit = {
    if (gdext.classes.AudioStreamWAV.mb_set_mix_rate == null) gdext.classes.AudioStreamWAV.mb_set_mix_rate = MethodBind.get("AudioStreamWAV", "set_mix_rate", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamWAV.mb_set_mix_rate, livePtr, mixRate)
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
  final def saveToWav(path: String): gdext.classes.Error = {
    if (gdext.classes.AudioStreamWAV.mb_save_to_wav == null) gdext.classes.AudioStreamWAV.mb_save_to_wav = MethodBind.get("AudioStreamWAV", "save_to_wav", 166001499L)
    gdext.classes.Error(Ptrcall.call1[String, Long](gdext.classes.AudioStreamWAV.mb_save_to_wav, livePtr, path))
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

  /** Godot enum `AudioStreamWAV.Format`. */
  opaque type Format <: Long = Long

  object Format {
    final val Format8Bits: Format = 0L.asInstanceOf[Format]
    final val Format16Bits: Format = 1L.asInstanceOf[Format]
    final val ImaAdpcm: Format = 2L.asInstanceOf[Format]
    final val Qoa: Format = 3L.asInstanceOf[Format]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Format = value.asInstanceOf[Format]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Format] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[Format]]

    extension (self: Format)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Format8Bits"
        case 1L => "Format16Bits"
        case 2L => "ImaAdpcm"
        case 3L => "Qoa"
        case other => other.toString
      }
  }

  /** Godot enum `AudioStreamWAV.LoopMode`. */
  opaque type LoopMode <: Long = Long

  object LoopMode {
    final val Disabled: LoopMode = 0L.asInstanceOf[LoopMode]
    final val Forward: LoopMode = 1L.asInstanceOf[LoopMode]
    final val Pingpong: LoopMode = 2L.asInstanceOf[LoopMode]
    final val Backward: LoopMode = 3L.asInstanceOf[LoopMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): LoopMode = value.asInstanceOf[LoopMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[LoopMode] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[LoopMode]]

    extension (self: LoopMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Disabled"
        case 1L => "Forward"
        case 2L => "Pingpong"
        case 3L => "Backward"
        case other => other.toString
      }
  }
}
