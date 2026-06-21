package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioStreamGenerator`, extends `AudioStream`. */
abstract class AudioStreamGenerator extends AudioStream {

  /** AudioStreamGenerator.set_mix_rate */
  final def setMixRate(hz: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamGenerator", "set_mix_rate", 373806689L), hostObject.objectPtr, hz)

  /** AudioStreamGenerator.get_mix_rate */
  final def getMixRate(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioStreamGenerator", "get_mix_rate", 1740695150L), hostObject.objectPtr)

  /** AudioStreamGenerator.set_mix_rate_mode */
  final def setMixRateMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamGenerator", "set_mix_rate_mode", 3354885803L), hostObject.objectPtr, mode)

  /** AudioStreamGenerator.get_mix_rate_mode */
  final def getMixRateMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("AudioStreamGenerator", "get_mix_rate_mode", 3537132591L), hostObject.objectPtr)

  /** AudioStreamGenerator.set_buffer_length */
  final def setBufferLength(seconds: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamGenerator", "set_buffer_length", 373806689L), hostObject.objectPtr, seconds)

  /** AudioStreamGenerator.get_buffer_length */
  final def getBufferLength(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioStreamGenerator", "get_buffer_length", 1740695150L), hostObject.objectPtr)

}

object AudioStreamGenerator {
  /** Class metadata for Gd[AudioStreamGenerator] lifetime management and casting. */
  given GodotClass[AudioStreamGenerator] with {
    def className = "AudioStreamGenerator"
    def isRefCounted = true
    def wrap(o: GodotObject): AudioStreamGenerator = new AudioStreamGenerator {}.withHost(o.objectPtr)
    def unwrap(t: AudioStreamGenerator): GodotObject = t.hostObject
  }
}
