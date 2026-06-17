package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioStreamWAV`, extends `AudioStream`. */
abstract class AudioStreamWAV extends AudioStream {

  /** AudioStreamWAV.set_format */
  final def setFormat(format: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamWAV", "set_format", 60648488L), hostObject.objectPtr, format)

  /** AudioStreamWAV.get_format */
  final def getFormat(): Long =
    Ptrcall.call0[Long](MethodBind.get("AudioStreamWAV", "get_format", 3151724922L), hostObject.objectPtr)

  /** AudioStreamWAV.set_loop_mode */
  final def setLoopMode(loop_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamWAV", "set_loop_mode", 2444882972L), hostObject.objectPtr, loop_mode)

  /** AudioStreamWAV.get_loop_mode */
  final def getLoopMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("AudioStreamWAV", "get_loop_mode", 393560655L), hostObject.objectPtr)

  /** AudioStreamWAV.set_loop_begin */
  final def setLoopBegin(loop_begin: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamWAV", "set_loop_begin", 1286410249L), hostObject.objectPtr, loop_begin)

  /** AudioStreamWAV.get_loop_begin */
  final def getLoopBegin(): Long =
    Ptrcall.call0[Long](MethodBind.get("AudioStreamWAV", "get_loop_begin", 3905245786L), hostObject.objectPtr)

  /** AudioStreamWAV.set_loop_end */
  final def setLoopEnd(loop_end: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamWAV", "set_loop_end", 1286410249L), hostObject.objectPtr, loop_end)

  /** AudioStreamWAV.get_loop_end */
  final def getLoopEnd(): Long =
    Ptrcall.call0[Long](MethodBind.get("AudioStreamWAV", "get_loop_end", 3905245786L), hostObject.objectPtr)

  /** AudioStreamWAV.set_mix_rate */
  final def setMixRate(mix_rate: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamWAV", "set_mix_rate", 1286410249L), hostObject.objectPtr, mix_rate)

  /** AudioStreamWAV.get_mix_rate */
  final def getMixRate(): Long =
    Ptrcall.call0[Long](MethodBind.get("AudioStreamWAV", "get_mix_rate", 3905245786L), hostObject.objectPtr)

  /** AudioStreamWAV.set_stereo */
  final def setStereo(stereo: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamWAV", "set_stereo", 2586408642L), hostObject.objectPtr, stereo)

  /** AudioStreamWAV.is_stereo */
  final def isStereo(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AudioStreamWAV", "is_stereo", 36873697L), hostObject.objectPtr)

  /** AudioStreamWAV.save_to_wav */
  final def saveToWav(path: String): Long =
    Ptrcall.call1[String, Long](MethodBind.get("AudioStreamWAV", "save_to_wav", 166001499L), hostObject.objectPtr, path)

}

object AudioStreamWAV {
  /** Class metadata for Gd[AudioStreamWAV] lifetime management and casting. */
  given GodotClass[AudioStreamWAV] with {
    def className = "AudioStreamWAV"
    def isRefCounted = true
    def wrap(o: GodotObject): AudioStreamWAV = new AudioStreamWAV {}.withHost(o.objectPtr)
    def unwrap(t: AudioStreamWAV): GodotObject = t.hostObject
  }
}
