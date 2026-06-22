package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioEffectPitchShift`, extends `AudioEffect`. */
abstract class AudioEffectPitchShift extends AudioEffect {

  /** AudioEffectPitchShift.set_pitch_scale */
  final def setPitchScale(rate: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioEffectPitchShift", "set_pitch_scale", 373806689L), hostObject.objectPtr, rate)

  /** AudioEffectPitchShift.get_pitch_scale */
  final def getPitchScale(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioEffectPitchShift", "get_pitch_scale", 1740695150L), hostObject.objectPtr)

  /** AudioEffectPitchShift.set_oversampling */
  final def setOversampling(amount: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioEffectPitchShift", "set_oversampling", 1286410249L), hostObject.objectPtr, amount)

  /** AudioEffectPitchShift.get_oversampling */
  final def getOversampling(): Long =
    Ptrcall.call0[Long](MethodBind.get("AudioEffectPitchShift", "get_oversampling", 3905245786L), hostObject.objectPtr)

  /** AudioEffectPitchShift.set_fft_size */
  final def setFftSize(size: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioEffectPitchShift", "set_fft_size", 2323518741L), hostObject.objectPtr, size)

  /** AudioEffectPitchShift.get_fft_size */
  final def getFftSize(): Long =
    Ptrcall.call0[Long](MethodBind.get("AudioEffectPitchShift", "get_fft_size", 2361246789L), hostObject.objectPtr)

}

object AudioEffectPitchShift {
  /** Class metadata for Gd[AudioEffectPitchShift] lifetime management and casting. */
  given GodotClass[AudioEffectPitchShift] with {
    def className = "AudioEffectPitchShift"
    def isRefCounted = true
    def wrap(o: GodotObject): AudioEffectPitchShift = new AudioEffectPitchShift {}.withHost(o.objectPtr)
    def unwrap(t: AudioEffectPitchShift): GodotObject = t.hostObject
  }
}
