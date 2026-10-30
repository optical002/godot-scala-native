package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
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
  final def setMixRateMode(mode: gdext.classes.AudioStreamGenerator.AudioStreamGeneratorMixRate): Unit = {
    if (gdext.classes.AudioStreamGenerator.mb_set_mix_rate_mode == null) gdext.classes.AudioStreamGenerator.mb_set_mix_rate_mode = MethodBind.get("AudioStreamGenerator", "set_mix_rate_mode", 3354885803L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamGenerator.mb_set_mix_rate_mode, livePtr, mode)
  }

  /** AudioStreamGenerator.get_mix_rate_mode */
  final def getMixRateMode(): gdext.classes.AudioStreamGenerator.AudioStreamGeneratorMixRate = {
    if (gdext.classes.AudioStreamGenerator.mb_get_mix_rate_mode == null) gdext.classes.AudioStreamGenerator.mb_get_mix_rate_mode = MethodBind.get("AudioStreamGenerator", "get_mix_rate_mode", 3537132591L)
    gdext.classes.AudioStreamGenerator.AudioStreamGeneratorMixRate(Ptrcall.call0[Long](gdext.classes.AudioStreamGenerator.mb_get_mix_rate_mode, livePtr))
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

  /** Godot enum `AudioStreamGenerator.AudioStreamGeneratorMixRate`. */
  opaque type AudioStreamGeneratorMixRate <: Long = Long

  object AudioStreamGeneratorMixRate {
    final val Output: AudioStreamGeneratorMixRate = 0L.asInstanceOf[AudioStreamGeneratorMixRate]
    final val Input: AudioStreamGeneratorMixRate = 1L.asInstanceOf[AudioStreamGeneratorMixRate]
    final val Custom: AudioStreamGeneratorMixRate = 2L.asInstanceOf[AudioStreamGeneratorMixRate]
    final val Max: AudioStreamGeneratorMixRate = 3L.asInstanceOf[AudioStreamGeneratorMixRate]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): AudioStreamGeneratorMixRate = value.asInstanceOf[AudioStreamGeneratorMixRate]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[AudioStreamGeneratorMixRate] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[AudioStreamGeneratorMixRate]]

    extension (self: AudioStreamGeneratorMixRate)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Output"
        case 1L => "Input"
        case 2L => "Custom"
        case 3L => "Max"
        case other => other.toString
      }
  }
}
