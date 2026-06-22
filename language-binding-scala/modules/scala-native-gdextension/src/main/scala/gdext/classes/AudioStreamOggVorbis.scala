package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioStreamOggVorbis`, extends `AudioStream`. */
abstract class AudioStreamOggVorbis extends AudioStream {

  /** AudioStreamOggVorbis.set_packet_sequence */
  final def setPacketSequence(packet_sequence: OggPacketSequence): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamOggVorbis", "set_packet_sequence", 438882457L), hostObject.objectPtr, packet_sequence.hostObject)

  /** AudioStreamOggVorbis.get_packet_sequence */
  final def getPacketSequence(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("AudioStreamOggVorbis", "get_packet_sequence", 2801636033L), hostObject.objectPtr)

  /** AudioStreamOggVorbis.set_loop */
  final def setLoop(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamOggVorbis", "set_loop", 2586408642L), hostObject.objectPtr, enable)

  /** AudioStreamOggVorbis.has_loop */
  final def hasLoop(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AudioStreamOggVorbis", "has_loop", 36873697L), hostObject.objectPtr)

  /** AudioStreamOggVorbis.set_loop_offset */
  final def setLoopOffset(seconds: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamOggVorbis", "set_loop_offset", 373806689L), hostObject.objectPtr, seconds)

  /** AudioStreamOggVorbis.get_loop_offset */
  final def getLoopOffset(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioStreamOggVorbis", "get_loop_offset", 1740695150L), hostObject.objectPtr)

  /** AudioStreamOggVorbis.set_bpm */
  final def setBpm(bpm: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamOggVorbis", "set_bpm", 373806689L), hostObject.objectPtr, bpm)

  /** AudioStreamOggVorbis.get_bpm */
  final def getBpm(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioStreamOggVorbis", "get_bpm", 1740695150L), hostObject.objectPtr)

  /** AudioStreamOggVorbis.set_beat_count */
  final def setBeatCount(count: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamOggVorbis", "set_beat_count", 1286410249L), hostObject.objectPtr, count)

  /** AudioStreamOggVorbis.get_beat_count */
  final def getBeatCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("AudioStreamOggVorbis", "get_beat_count", 3905245786L), hostObject.objectPtr)

  /** AudioStreamOggVorbis.set_bar_beats */
  final def setBarBeats(count: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamOggVorbis", "set_bar_beats", 1286410249L), hostObject.objectPtr, count)

  /** AudioStreamOggVorbis.get_bar_beats */
  final def getBarBeats(): Long =
    Ptrcall.call0[Long](MethodBind.get("AudioStreamOggVorbis", "get_bar_beats", 3905245786L), hostObject.objectPtr)

}

object AudioStreamOggVorbis {
  /** Class metadata for Gd[AudioStreamOggVorbis] lifetime management and casting. */
  given GodotClass[AudioStreamOggVorbis] with {
    def className = "AudioStreamOggVorbis"
    def isRefCounted = true
    def wrap(o: GodotObject): AudioStreamOggVorbis = new AudioStreamOggVorbis {}.withHost(o.objectPtr)
    def unwrap(t: AudioStreamOggVorbis): GodotObject = t.hostObject
  }
}
