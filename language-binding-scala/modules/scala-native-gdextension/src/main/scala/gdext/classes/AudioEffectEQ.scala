package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AudioEffectEQ`, extends `AudioEffect`. */
abstract class AudioEffectEQ extends AudioEffect {
  override def godotClassName: String = "AudioEffectEQ"

  /** AudioEffectEQ.set_band_gain_db */
  final def setBandGainDb(band_idx: Long, volume_db: Double): Unit = {
    if (gdext.classes.AudioEffectEQ.mb_set_band_gain_db == null) gdext.classes.AudioEffectEQ.mb_set_band_gain_db = MethodBind.get("AudioEffectEQ", "set_band_gain_db", 1602489585L)
    Ptrcall.callVoid2(gdext.classes.AudioEffectEQ.mb_set_band_gain_db, livePtr, band_idx, volume_db)
  }

  /** AudioEffectEQ.get_band_gain_db */
  final def getBandGainDb(band_idx: Long): Double = {
    if (gdext.classes.AudioEffectEQ.mb_get_band_gain_db == null) gdext.classes.AudioEffectEQ.mb_get_band_gain_db = MethodBind.get("AudioEffectEQ", "get_band_gain_db", 2339986948L)
    Ptrcall.call1[Long, Double](gdext.classes.AudioEffectEQ.mb_get_band_gain_db, livePtr, band_idx)
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
