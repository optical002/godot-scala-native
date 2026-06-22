package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioStreamRandomizer`, extends `AudioStream`. */
abstract class AudioStreamRandomizer extends AudioStream {

  /** AudioStreamRandomizer.add_stream */
  final def addStream(index: Long, stream: AudioStream, weight: Double): Unit =
    Ptrcall.callVoid3(MethodBind.get("AudioStreamRandomizer", "add_stream", 1892018854L), hostObject.objectPtr, index, stream.hostObject, weight)

  /** AudioStreamRandomizer.move_stream */
  final def moveStream(index_from: Long, index_to: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("AudioStreamRandomizer", "move_stream", 3937882851L), hostObject.objectPtr, index_from, index_to)

  /** AudioStreamRandomizer.remove_stream */
  final def removeStream(index: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamRandomizer", "remove_stream", 1286410249L), hostObject.objectPtr, index)

  /** AudioStreamRandomizer.set_stream */
  final def setStream(index: Long, stream: AudioStream): Unit =
    Ptrcall.callVoid2(MethodBind.get("AudioStreamRandomizer", "set_stream", 111075094L), hostObject.objectPtr, index, stream.hostObject)

  /** AudioStreamRandomizer.get_stream */
  final def getStream(index: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("AudioStreamRandomizer", "get_stream", 2739380747L), hostObject.objectPtr, index)

  /** AudioStreamRandomizer.set_stream_probability_weight */
  final def setStreamProbabilityWeight(index: Long, weight: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("AudioStreamRandomizer", "set_stream_probability_weight", 1602489585L), hostObject.objectPtr, index, weight)

  /** AudioStreamRandomizer.get_stream_probability_weight */
  final def getStreamProbabilityWeight(index: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("AudioStreamRandomizer", "get_stream_probability_weight", 2339986948L), hostObject.objectPtr, index)

  /** AudioStreamRandomizer.set_streams_count */
  final def setStreamsCount(count: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamRandomizer", "set_streams_count", 1286410249L), hostObject.objectPtr, count)

  /** AudioStreamRandomizer.get_streams_count */
  final def getStreamsCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("AudioStreamRandomizer", "get_streams_count", 3905245786L), hostObject.objectPtr)

  /** AudioStreamRandomizer.set_random_pitch */
  final def setRandomPitch(scale: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamRandomizer", "set_random_pitch", 373806689L), hostObject.objectPtr, scale)

  /** AudioStreamRandomizer.get_random_pitch */
  final def getRandomPitch(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioStreamRandomizer", "get_random_pitch", 1740695150L), hostObject.objectPtr)

  /** AudioStreamRandomizer.set_random_pitch_semitones */
  final def setRandomPitchSemitones(semitones: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamRandomizer", "set_random_pitch_semitones", 373806689L), hostObject.objectPtr, semitones)

  /** AudioStreamRandomizer.get_random_pitch_semitones */
  final def getRandomPitchSemitones(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioStreamRandomizer", "get_random_pitch_semitones", 1740695150L), hostObject.objectPtr)

  /** AudioStreamRandomizer.set_random_volume_offset_db */
  final def setRandomVolumeOffsetDb(db_offset: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamRandomizer", "set_random_volume_offset_db", 373806689L), hostObject.objectPtr, db_offset)

  /** AudioStreamRandomizer.get_random_volume_offset_db */
  final def getRandomVolumeOffsetDb(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioStreamRandomizer", "get_random_volume_offset_db", 1740695150L), hostObject.objectPtr)

  /** AudioStreamRandomizer.set_playback_mode */
  final def setPlaybackMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamRandomizer", "set_playback_mode", 3950967023L), hostObject.objectPtr, mode)

  /** AudioStreamRandomizer.get_playback_mode */
  final def getPlaybackMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("AudioStreamRandomizer", "get_playback_mode", 3943055077L), hostObject.objectPtr)

}

object AudioStreamRandomizer {
  /** Class metadata for Gd[AudioStreamRandomizer] lifetime management and casting. */
  given GodotClass[AudioStreamRandomizer] with {
    def className = "AudioStreamRandomizer"
    def isRefCounted = true
    def wrap(o: GodotObject): AudioStreamRandomizer = new AudioStreamRandomizer {}.withHost(o.objectPtr)
    def unwrap(t: AudioStreamRandomizer): GodotObject = t.hostObject
  }
}
