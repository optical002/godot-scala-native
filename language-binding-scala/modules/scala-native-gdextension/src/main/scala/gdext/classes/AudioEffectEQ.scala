package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioEffectEQ`, extends `AudioEffect`. */
abstract class AudioEffectEQ extends AudioEffect {

  /** AudioEffectEQ.set_band_gain_db */
  final def setBandGainDb(band_idx: Long, volume_db: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("AudioEffectEQ", "set_band_gain_db", 1602489585L), hostObject.objectPtr, band_idx, volume_db)

  /** AudioEffectEQ.get_band_gain_db */
  final def getBandGainDb(band_idx: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("AudioEffectEQ", "get_band_gain_db", 2339986948L), hostObject.objectPtr, band_idx)

  /** AudioEffectEQ.get_band_count */
  final def getBandCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("AudioEffectEQ", "get_band_count", 3905245786L), hostObject.objectPtr)

}

object AudioEffectEQ {
  /** Class metadata for Gd[AudioEffectEQ] lifetime management and casting. */
  given GodotClass[AudioEffectEQ] with {
    def className = "AudioEffectEQ"
    def isRefCounted = true
    def wrap(o: GodotObject): AudioEffectEQ = new AudioEffectEQ {}.withHost(o.objectPtr)
    def unwrap(t: AudioEffectEQ): GodotObject = t.hostObject
  }
}
