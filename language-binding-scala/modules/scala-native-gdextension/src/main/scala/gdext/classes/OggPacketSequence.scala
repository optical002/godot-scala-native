package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OggPacketSequence`, extends `Resource`. */
abstract class OggPacketSequence extends Resource {
  override def godotClassName: String = "OggPacketSequence"

  /** OggPacketSequence.set_sampling_rate */
  final def setSamplingRate(samplingRate: Double): Unit = {
    if (gdext.classes.OggPacketSequence.mb_set_sampling_rate == null) gdext.classes.OggPacketSequence.mb_set_sampling_rate = MethodBind.get("OggPacketSequence", "set_sampling_rate", 373806689L)
    Ptrcall.callVoid1(gdext.classes.OggPacketSequence.mb_set_sampling_rate, livePtr, samplingRate)
  }

  /** OggPacketSequence.get_sampling_rate */
  final def getSamplingRate(): Double = {
    if (gdext.classes.OggPacketSequence.mb_get_sampling_rate == null) gdext.classes.OggPacketSequence.mb_get_sampling_rate = MethodBind.get("OggPacketSequence", "get_sampling_rate", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.OggPacketSequence.mb_get_sampling_rate, livePtr)
  }

  /** OggPacketSequence.get_length */
  final def getLength(): Double = {
    if (gdext.classes.OggPacketSequence.mb_get_length == null) gdext.classes.OggPacketSequence.mb_get_length = MethodBind.get("OggPacketSequence", "get_length", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.OggPacketSequence.mb_get_length, livePtr)
  }

}

object OggPacketSequence {
  private[classes] var mb_set_sampling_rate: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_sampling_rate: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_length: GDExtensionMethodBindPtr = null
}
