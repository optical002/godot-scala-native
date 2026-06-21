package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioEffectReverb`, extends `AudioEffect`. */
abstract class AudioEffectReverb extends AudioEffect {

  /** AudioEffectReverb.set_predelay_msec */
  final def setPredelayMsec(msec: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioEffectReverb", "set_predelay_msec", 373806689L), hostObject.objectPtr, msec)

  /** AudioEffectReverb.get_predelay_msec */
  final def getPredelayMsec(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioEffectReverb", "get_predelay_msec", 1740695150L), hostObject.objectPtr)

  /** AudioEffectReverb.set_predelay_feedback */
  final def setPredelayFeedback(feedback: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioEffectReverb", "set_predelay_feedback", 373806689L), hostObject.objectPtr, feedback)

  /** AudioEffectReverb.get_predelay_feedback */
  final def getPredelayFeedback(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioEffectReverb", "get_predelay_feedback", 1740695150L), hostObject.objectPtr)

  /** AudioEffectReverb.set_room_size */
  final def setRoomSize(size: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioEffectReverb", "set_room_size", 373806689L), hostObject.objectPtr, size)

  /** AudioEffectReverb.get_room_size */
  final def getRoomSize(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioEffectReverb", "get_room_size", 1740695150L), hostObject.objectPtr)

  /** AudioEffectReverb.set_damping */
  final def setDamping(amount: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioEffectReverb", "set_damping", 373806689L), hostObject.objectPtr, amount)

  /** AudioEffectReverb.get_damping */
  final def getDamping(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioEffectReverb", "get_damping", 1740695150L), hostObject.objectPtr)

  /** AudioEffectReverb.set_spread */
  final def setSpread(amount: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioEffectReverb", "set_spread", 373806689L), hostObject.objectPtr, amount)

  /** AudioEffectReverb.get_spread */
  final def getSpread(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioEffectReverb", "get_spread", 1740695150L), hostObject.objectPtr)

  /** AudioEffectReverb.set_dry */
  final def setDry(amount: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioEffectReverb", "set_dry", 373806689L), hostObject.objectPtr, amount)

  /** AudioEffectReverb.get_dry */
  final def getDry(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioEffectReverb", "get_dry", 1740695150L), hostObject.objectPtr)

  /** AudioEffectReverb.set_wet */
  final def setWet(amount: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioEffectReverb", "set_wet", 373806689L), hostObject.objectPtr, amount)

  /** AudioEffectReverb.get_wet */
  final def getWet(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioEffectReverb", "get_wet", 1740695150L), hostObject.objectPtr)

  /** AudioEffectReverb.set_hpf */
  final def setHpf(amount: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioEffectReverb", "set_hpf", 373806689L), hostObject.objectPtr, amount)

  /** AudioEffectReverb.get_hpf */
  final def getHpf(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioEffectReverb", "get_hpf", 1740695150L), hostObject.objectPtr)

}

object AudioEffectReverb {
  /** Class metadata for Gd[AudioEffectReverb] lifetime management and casting. */
  given GodotClass[AudioEffectReverb] with {
    def className = "AudioEffectReverb"
    def isRefCounted = true
    def wrap(o: GodotObject): AudioEffectReverb = new AudioEffectReverb {}.withHost(o.objectPtr)
    def unwrap(t: AudioEffectReverb): GodotObject = t.hostObject
  }
}
