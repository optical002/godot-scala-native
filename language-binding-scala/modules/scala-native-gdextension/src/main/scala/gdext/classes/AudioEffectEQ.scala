package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AudioEffectEQ`, extends `AudioEffect`. */
abstract class AudioEffectEQ extends AudioEffect {
  override def godotClassName: String = "AudioEffectEQ"

  /** AudioEffectEQ.set_band_gain_db */
  final def setBandGainDb(bandIdx: Long, volumeDb: Double): Unit = {
    if (gdext.classes.AudioEffectEQ.mb_set_band_gain_db == null) gdext.classes.AudioEffectEQ.mb_set_band_gain_db = MethodBind.get("AudioEffectEQ", "set_band_gain_db", 1602489585L)
    Ptrcall.callVoid2(gdext.classes.AudioEffectEQ.mb_set_band_gain_db, livePtr, bandIdx, volumeDb)
  }

  /** AudioEffectEQ.get_band_gain_db */
  final def getBandGainDb(bandIdx: Long): Double = {
    if (gdext.classes.AudioEffectEQ.mb_get_band_gain_db == null) gdext.classes.AudioEffectEQ.mb_get_band_gain_db = MethodBind.get("AudioEffectEQ", "get_band_gain_db", 2339986948L)
    Ptrcall.call1[Long, Double](gdext.classes.AudioEffectEQ.mb_get_band_gain_db, livePtr, bandIdx)
  }

  /** AudioEffectEQ.get_band_count */
  final def getBandCount(): Long = {
    if (gdext.classes.AudioEffectEQ.mb_get_band_count == null) gdext.classes.AudioEffectEQ.mb_get_band_count = MethodBind.get("AudioEffectEQ", "get_band_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.AudioEffectEQ.mb_get_band_count, livePtr)
  }

}

object AudioEffectEQ {
  private[classes] var mb_set_band_gain_db: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_band_gain_db: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_band_count: GDExtensionMethodBindPtr = null
}
