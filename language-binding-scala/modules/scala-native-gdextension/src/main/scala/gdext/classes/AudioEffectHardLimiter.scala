package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioEffectHardLimiter`, extends `AudioEffect`. */
abstract class AudioEffectHardLimiter extends AudioEffect {

  /** AudioEffectHardLimiter.set_ceiling_db */
  final def setCeilingDb(ceiling: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioEffectHardLimiter", "set_ceiling_db", 373806689L), hostObject.objectPtr, ceiling)

  /** AudioEffectHardLimiter.get_ceiling_db */
  final def getCeilingDb(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioEffectHardLimiter", "get_ceiling_db", 1740695150L), hostObject.objectPtr)

  /** AudioEffectHardLimiter.set_pre_gain_db */
  final def setPreGainDb(p_pre_gain: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioEffectHardLimiter", "set_pre_gain_db", 373806689L), hostObject.objectPtr, p_pre_gain)

  /** AudioEffectHardLimiter.get_pre_gain_db */
  final def getPreGainDb(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioEffectHardLimiter", "get_pre_gain_db", 1740695150L), hostObject.objectPtr)

  /** AudioEffectHardLimiter.set_release */
  final def setRelease(p_release: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioEffectHardLimiter", "set_release", 373806689L), hostObject.objectPtr, p_release)

  /** AudioEffectHardLimiter.get_release */
  final def getRelease(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioEffectHardLimiter", "get_release", 1740695150L), hostObject.objectPtr)

}

object AudioEffectHardLimiter {
  /** Class metadata for Gd[AudioEffectHardLimiter] lifetime management and casting. */
  given GodotClass[AudioEffectHardLimiter] with {
    def className = "AudioEffectHardLimiter"
    def isRefCounted = true
    def wrap(o: GodotObject): AudioEffectHardLimiter = new AudioEffectHardLimiter {}.withHost(o.objectPtr)
    def unwrap(t: AudioEffectHardLimiter): GodotObject = t.hostObject
  }
}
