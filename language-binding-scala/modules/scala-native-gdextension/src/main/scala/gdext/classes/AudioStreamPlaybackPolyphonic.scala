package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AudioStreamPlaybackPolyphonic`, extends `AudioStreamPlayback`. */
abstract class AudioStreamPlaybackPolyphonic extends AudioStreamPlayback {
  override def godotClassName: String = "AudioStreamPlaybackPolyphonic"

  /** AudioStreamPlaybackPolyphonic.play_stream */
  final def playStream(stream: AudioStream, from_offset: Double, volume_db: Double, pitch_scale: Double, playback_type: Long, bus: gdext.builtin.StringName): Long = {
    if (gdext.classes.AudioStreamPlaybackPolyphonic.mb_play_stream == null) gdext.classes.AudioStreamPlaybackPolyphonic.mb_play_stream = MethodBind.get("AudioStreamPlaybackPolyphonic", "play_stream", 1846744803L)
    Ptrcall.call6[GodotObject, Double, Double, Double, Long, gdext.builtin.StringName, Long](gdext.classes.AudioStreamPlaybackPolyphonic.mb_play_stream, livePtr, Wrappers.handle(stream), from_offset, volume_db, pitch_scale, playback_type, bus)
  }

  /** AudioStreamPlaybackPolyphonic.set_stream_volume */
  final def setStreamVolume(stream: Long, volume_db: Double): Unit = {
    if (gdext.classes.AudioStreamPlaybackPolyphonic.mb_set_stream_volume == null) gdext.classes.AudioStreamPlaybackPolyphonic.mb_set_stream_volume = MethodBind.get("AudioStreamPlaybackPolyphonic", "set_stream_volume", 1602489585L)
    Ptrcall.callVoid2(gdext.classes.AudioStreamPlaybackPolyphonic.mb_set_stream_volume, livePtr, stream, volume_db)
  }

  /** AudioStreamPlaybackPolyphonic.set_stream_pitch_scale */
  final def setStreamPitchScale(stream: Long, pitch_scale: Double): Unit = {
    if (gdext.classes.AudioStreamPlaybackPolyphonic.mb_set_stream_pitch_scale == null) gdext.classes.AudioStreamPlaybackPolyphonic.mb_set_stream_pitch_scale = MethodBind.get("AudioStreamPlaybackPolyphonic", "set_stream_pitch_scale", 1602489585L)
    Ptrcall.callVoid2(gdext.classes.AudioStreamPlaybackPolyphonic.mb_set_stream_pitch_scale, livePtr, stream, pitch_scale)
  }

  /** AudioStreamPlaybackPolyphonic.is_stream_playing */
  final def isStreamPlaying(stream: Long): Boolean = {
    if (gdext.classes.AudioStreamPlaybackPolyphonic.mb_is_stream_playing == null) gdext.classes.AudioStreamPlaybackPolyphonic.mb_is_stream_playing = MethodBind.get("AudioStreamPlaybackPolyphonic", "is_stream_playing", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.AudioStreamPlaybackPolyphonic.mb_is_stream_playing, livePtr, stream)
  }

  /** AudioStreamPlaybackPolyphonic.stop_stream */
  final def stopStream(stream: Long): Unit = {
    if (gdext.classes.AudioStreamPlaybackPolyphonic.mb_stop_stream == null) gdext.classes.AudioStreamPlaybackPolyphonic.mb_stop_stream = MethodBind.get("AudioStreamPlaybackPolyphonic", "stop_stream", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamPlaybackPolyphonic.mb_stop_stream, livePtr, stream)
  }

}

object AudioStreamPlaybackPolyphonic {
  private[classes] var mb_play_stream: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_stream_volume: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_stream_pitch_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_stream_playing: GDExtensionMethodBindPtr = null
  private[classes] var mb_stop_stream: GDExtensionMethodBindPtr = null
}
