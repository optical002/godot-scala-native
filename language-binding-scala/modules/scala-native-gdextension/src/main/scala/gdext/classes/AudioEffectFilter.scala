package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioEffectFilter`, extends `AudioEffect`. */
abstract class AudioEffectFilter extends AudioEffect {

  /** AudioEffectFilter.set_cutoff */
  final def setCutoff(freq: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioEffectFilter", "set_cutoff", 373806689L), hostObject.objectPtr, freq)

  /** AudioEffectFilter.get_cutoff */
  final def getCutoff(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioEffectFilter", "get_cutoff", 1740695150L), hostObject.objectPtr)

  /** AudioEffectFilter.set_resonance */
  final def setResonance(amount: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioEffectFilter", "set_resonance", 373806689L), hostObject.objectPtr, amount)

  /** AudioEffectFilter.get_resonance */
  final def getResonance(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioEffectFilter", "get_resonance", 1740695150L), hostObject.objectPtr)

  /** AudioEffectFilter.set_gain */
  final def setGain(amount: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioEffectFilter", "set_gain", 373806689L), hostObject.objectPtr, amount)

  /** AudioEffectFilter.get_gain */
  final def getGain(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioEffectFilter", "get_gain", 1740695150L), hostObject.objectPtr)

  /** AudioEffectFilter.set_db */
  final def setDb(amount: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioEffectFilter", "set_db", 771740901L), hostObject.objectPtr, amount)

  /** AudioEffectFilter.get_db */
  final def getDb(): Long =
    Ptrcall.call0[Long](MethodBind.get("AudioEffectFilter", "get_db", 3981721890L), hostObject.objectPtr)

}

object AudioEffectFilter {
  /** Class metadata for Gd[AudioEffectFilter] lifetime management and casting. */
  given GodotClass[AudioEffectFilter] with {
    def className = "AudioEffectFilter"
    def isRefCounted = true
    def wrap(o: GodotObject): AudioEffectFilter = new AudioEffectFilter {}.withHost(o.objectPtr)
    def unwrap(t: AudioEffectFilter): GodotObject = t.hostObject
  }
}
