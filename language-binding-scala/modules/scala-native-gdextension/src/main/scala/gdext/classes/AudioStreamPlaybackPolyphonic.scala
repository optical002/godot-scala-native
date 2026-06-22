package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioStreamPlaybackPolyphonic`, extends `AudioStreamPlayback`. */
abstract class AudioStreamPlaybackPolyphonic extends AudioStreamPlayback {

  /** AudioStreamPlaybackPolyphonic.play_stream */
  final def playStream(stream: AudioStream, from_offset: Double, volume_db: Double, pitch_scale: Double, playback_type: Long, bus: gdext.builtin.StringName): Long =
    Ptrcall.call6[GodotObject, Double, Double, Double, Long, gdext.builtin.StringName, Long](MethodBind.get("AudioStreamPlaybackPolyphonic", "play_stream", 1846744803L), hostObject.objectPtr, stream.hostObject, from_offset, volume_db, pitch_scale, playback_type, bus)

  /** AudioStreamPlaybackPolyphonic.set_stream_volume */
  final def setStreamVolume(stream: Long, volume_db: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("AudioStreamPlaybackPolyphonic", "set_stream_volume", 1602489585L), hostObject.objectPtr, stream, volume_db)

  /** AudioStreamPlaybackPolyphonic.set_stream_pitch_scale */
  final def setStreamPitchScale(stream: Long, pitch_scale: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("AudioStreamPlaybackPolyphonic", "set_stream_pitch_scale", 1602489585L), hostObject.objectPtr, stream, pitch_scale)

  /** AudioStreamPlaybackPolyphonic.is_stream_playing */
  final def isStreamPlaying(stream: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("AudioStreamPlaybackPolyphonic", "is_stream_playing", 1116898809L), hostObject.objectPtr, stream)

  /** AudioStreamPlaybackPolyphonic.stop_stream */
  final def stopStream(stream: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamPlaybackPolyphonic", "stop_stream", 1286410249L), hostObject.objectPtr, stream)

}

object AudioStreamPlaybackPolyphonic {
  /** Class metadata for Gd[AudioStreamPlaybackPolyphonic] lifetime management and casting. */
  given GodotClass[AudioStreamPlaybackPolyphonic] with {
    def className = "AudioStreamPlaybackPolyphonic"
    def isRefCounted = true
    def wrap(o: GodotObject): AudioStreamPlaybackPolyphonic = new AudioStreamPlaybackPolyphonic {}.withHost(o.objectPtr)
    def unwrap(t: AudioStreamPlaybackPolyphonic): GodotObject = t.hostObject
  }
}
