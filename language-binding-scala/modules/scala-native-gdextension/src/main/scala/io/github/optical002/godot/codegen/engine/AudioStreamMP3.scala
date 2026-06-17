package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioStreamMP3`, extends `AudioStream`. */
abstract class AudioStreamMP3 extends AudioStream {

  /** AudioStreamMP3.set_loop */
  final def setLoop(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamMP3", "set_loop", 2586408642L), hostObject.objectPtr, enable)

  /** AudioStreamMP3.has_loop */
  final def hasLoop(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AudioStreamMP3", "has_loop", 36873697L), hostObject.objectPtr)

  /** AudioStreamMP3.set_loop_offset */
  final def setLoopOffset(seconds: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamMP3", "set_loop_offset", 373806689L), hostObject.objectPtr, seconds)

  /** AudioStreamMP3.get_loop_offset */
  final def getLoopOffset(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioStreamMP3", "get_loop_offset", 1740695150L), hostObject.objectPtr)

  /** AudioStreamMP3.set_bpm */
  final def setBpm(bpm: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamMP3", "set_bpm", 373806689L), hostObject.objectPtr, bpm)

  /** AudioStreamMP3.get_bpm */
  final def getBpm(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioStreamMP3", "get_bpm", 1740695150L), hostObject.objectPtr)

  /** AudioStreamMP3.set_beat_count */
  final def setBeatCount(count: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamMP3", "set_beat_count", 1286410249L), hostObject.objectPtr, count)

  /** AudioStreamMP3.get_beat_count */
  final def getBeatCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("AudioStreamMP3", "get_beat_count", 3905245786L), hostObject.objectPtr)

  /** AudioStreamMP3.set_bar_beats */
  final def setBarBeats(count: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamMP3", "set_bar_beats", 1286410249L), hostObject.objectPtr, count)

  /** AudioStreamMP3.get_bar_beats */
  final def getBarBeats(): Long =
    Ptrcall.call0[Long](MethodBind.get("AudioStreamMP3", "get_bar_beats", 3905245786L), hostObject.objectPtr)

}

object AudioStreamMP3 {
  /** Class metadata for Gd[AudioStreamMP3] lifetime management and casting. */
  given GodotClass[AudioStreamMP3] with {
    def className = "AudioStreamMP3"
    def isRefCounted = true
    def wrap(o: GodotObject): AudioStreamMP3 = new AudioStreamMP3 {}.withHost(o.objectPtr)
    def unwrap(t: AudioStreamMP3): GodotObject = t.hostObject
  }
}
