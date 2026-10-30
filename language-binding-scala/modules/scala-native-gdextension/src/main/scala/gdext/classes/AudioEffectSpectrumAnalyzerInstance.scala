package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AudioEffectSpectrumAnalyzerInstance`, extends `AudioEffectInstance`. */
abstract class AudioEffectSpectrumAnalyzerInstance extends AudioEffectInstance {
  override def godotClassName: String = "AudioEffectSpectrumAnalyzerInstance"

  /** AudioEffectSpectrumAnalyzerInstance.get_magnitude_for_frequency_range */
  final def getMagnitudeForFrequencyRange(fromHz: Double, toHz: Double, mode: gdext.classes.AudioEffectSpectrumAnalyzerInstance.MagnitudeMode = gdext.classes.AudioEffectSpectrumAnalyzerInstance.MagnitudeMode(1L)): gdext.builtin.Vector2 = {
    if (gdext.classes.AudioEffectSpectrumAnalyzerInstance.mb_get_magnitude_for_frequency_range == null) gdext.classes.AudioEffectSpectrumAnalyzerInstance.mb_get_magnitude_for_frequency_range = MethodBind.get("AudioEffectSpectrumAnalyzerInstance", "get_magnitude_for_frequency_range", 797993915L)
    Ptrcall.call3[Double, Double, Long, gdext.builtin.Vector2](gdext.classes.AudioEffectSpectrumAnalyzerInstance.mb_get_magnitude_for_frequency_range, livePtr, fromHz, toHz, mode)
  }

}

object AudioEffectSpectrumAnalyzerInstance {
  private[classes] var mb_get_magnitude_for_frequency_range: GDExtensionMethodBindPtr = null

  /** Godot enum `AudioEffectSpectrumAnalyzerInstance.MagnitudeMode`. */
  opaque type MagnitudeMode <: Long = Long

  object MagnitudeMode {
    final val Average: MagnitudeMode = 0L.asInstanceOf[MagnitudeMode]
    final val Max: MagnitudeMode = 1L.asInstanceOf[MagnitudeMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): MagnitudeMode = value.asInstanceOf[MagnitudeMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[MagnitudeMode] = scala.IArray[Long](0L, 1L).asInstanceOf[scala.IArray[MagnitudeMode]]

    extension (self: MagnitudeMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Average"
        case 1L => "Max"
        case other => other.toString
      }
  }
}
