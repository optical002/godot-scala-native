package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AudioStreamPlayer`, extends `Node`. */
abstract class AudioStreamPlayer extends Node {
  override def godotClassName: String = "AudioStreamPlayer"

  /** AudioStreamPlayer.set_stream */
  final def setStream(stream: AudioStream): Unit = {
    if (gdext.classes.AudioStreamPlayer.mb_set_stream == null) gdext.classes.AudioStreamPlayer.mb_set_stream = MethodBind.get("AudioStreamPlayer", "set_stream", 2210767741L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamPlayer.mb_set_stream, livePtr, Wrappers.handle(stream))
  }

  /** AudioStreamPlayer.get_stream. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getStream(): AudioStream = {
    if (gdext.classes.AudioStreamPlayer.mb_get_stream == null) gdext.classes.AudioStreamPlayer.mb_get_stream = MethodBind.get("AudioStreamPlayer", "get_stream", 160907539L)
    Wrappers.owned[AudioStream](Ptrcall.call0[Long](gdext.classes.AudioStreamPlayer.mb_get_stream, livePtr))
  }

  /** AudioStreamPlayer.set_volume_db */
  final def setVolumeDb(volume_db: Double): Unit = {
    if (gdext.classes.AudioStreamPlayer.mb_set_volume_db == null) gdext.classes.AudioStreamPlayer.mb_set_volume_db = MethodBind.get("AudioStreamPlayer", "set_volume_db", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamPlayer.mb_set_volume_db, livePtr, volume_db)
  }

  /** AudioStreamPlayer.get_volume_db */
  final def getVolumeDb(): Double = {
    if (gdext.classes.AudioStreamPlayer.mb_get_volume_db == null) gdext.classes.AudioStreamPlayer.mb_get_volume_db = MethodBind.get("AudioStreamPlayer", "get_volume_db", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioStreamPlayer.mb_get_volume_db, livePtr)
  }

  /** AudioStreamPlayer.set_volume_linear */
  final def setVolumeLinear(volume_linear: Double): Unit = {
    if (gdext.classes.AudioStreamPlayer.mb_set_volume_linear == null) gdext.classes.AudioStreamPlayer.mb_set_volume_linear = MethodBind.get("AudioStreamPlayer", "set_volume_linear", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamPlayer.mb_set_volume_linear, livePtr, volume_linear)
  }

  /** AudioStreamPlayer.get_volume_linear */
  final def getVolumeLinear(): Double = {
    if (gdext.classes.AudioStreamPlayer.mb_get_volume_linear == null) gdext.classes.AudioStreamPlayer.mb_get_volume_linear = MethodBind.get("AudioStreamPlayer", "get_volume_linear", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioStreamPlayer.mb_get_volume_linear, livePtr)
  }

  /** AudioStreamPlayer.set_pitch_scale */
  final def setPitchScale(pitch_scale: Double): Unit = {
    if (gdext.classes.AudioStreamPlayer.mb_set_pitch_scale == null) gdext.classes.AudioStreamPlayer.mb_set_pitch_scale = MethodBind.get("AudioStreamPlayer", "set_pitch_scale", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamPlayer.mb_set_pitch_scale, livePtr, pitch_scale)
  }

  /** AudioStreamPlayer.get_pitch_scale */
  final def getPitchScale(): Double = {
    if (gdext.classes.AudioStreamPlayer.mb_get_pitch_scale == null) gdext.classes.AudioStreamPlayer.mb_get_pitch_scale = MethodBind.get("AudioStreamPlayer", "get_pitch_scale", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioStreamPlayer.mb_get_pitch_scale, livePtr)
  }

  /** AudioStreamPlayer.play */
  final def play(from_position: Double): Unit = {
    if (gdext.classes.AudioStreamPlayer.mb_play == null) gdext.classes.AudioStreamPlayer.mb_play = MethodBind.get("AudioStreamPlayer", "play", 1958160172L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamPlayer.mb_play, livePtr, from_position)
  }

  /** AudioStreamPlayer.seek */
  final def seek(to_position: Double): Unit = {
    if (gdext.classes.AudioStreamPlayer.mb_seek == null) gdext.classes.AudioStreamPlayer.mb_seek = MethodBind.get("AudioStreamPlayer", "seek", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamPlayer.mb_seek, livePtr, to_position)
  }

  /** AudioStreamPlayer.stop */
  final def stop(): Unit = {
    if (gdext.classes.AudioStreamPlayer.mb_stop == null) gdext.classes.AudioStreamPlayer.mb_stop = MethodBind.get("AudioStreamPlayer", "stop", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.AudioStreamPlayer.mb_stop, livePtr)
  }

  /** AudioStreamPlayer.is_playing */
  final def isPlaying(): Boolean = {
    if (gdext.classes.AudioStreamPlayer.mb_is_playing == null) gdext.classes.AudioStreamPlayer.mb_is_playing = MethodBind.get("AudioStreamPlayer", "is_playing", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.AudioStreamPlayer.mb_is_playing, livePtr)
  }

  /** AudioStreamPlayer.get_playback_position */
  final def getPlaybackPosition(): Double = {
    if (gdext.classes.AudioStreamPlayer.mb_get_playback_position == null) gdext.classes.AudioStreamPlayer.mb_get_playback_position = MethodBind.get("AudioStreamPlayer", "get_playback_position", 191475506L)
    Ptrcall.call0[Double](gdext.classes.AudioStreamPlayer.mb_get_playback_position, livePtr)
  }

  /** AudioStreamPlayer.set_bus */
  final def setBus(bus: gdext.builtin.StringName): Unit = {
    if (gdext.classes.AudioStreamPlayer.mb_set_bus == null) gdext.classes.AudioStreamPlayer.mb_set_bus = MethodBind.get("AudioStreamPlayer", "set_bus", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamPlayer.mb_set_bus, livePtr, bus)
  }

  /** AudioStreamPlayer.get_bus */
  final def getBus(): gdext.builtin.StringName = {
    if (gdext.classes.AudioStreamPlayer.mb_get_bus == null) gdext.classes.AudioStreamPlayer.mb_get_bus = MethodBind.get("AudioStreamPlayer", "get_bus", 2002593661L)
    Ptrcall.call0[gdext.builtin.StringName](gdext.classes.AudioStreamPlayer.mb_get_bus, livePtr)
  }

  /** AudioStreamPlayer.set_autoplay */
  final def setAutoplay(enable: Boolean): Unit = {
    if (gdext.classes.AudioStreamPlayer.mb_set_autoplay == null) gdext.classes.AudioStreamPlayer.mb_set_autoplay = MethodBind.get("AudioStreamPlayer", "set_autoplay", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamPlayer.mb_set_autoplay, livePtr, enable)
  }

  /** AudioStreamPlayer.is_autoplay_enabled */
  final def isAutoplayEnabled(): Boolean = {
    if (gdext.classes.AudioStreamPlayer.mb_is_autoplay_enabled == null) gdext.classes.AudioStreamPlayer.mb_is_autoplay_enabled = MethodBind.get("AudioStreamPlayer", "is_autoplay_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.AudioStreamPlayer.mb_is_autoplay_enabled, livePtr)
  }

  /** AudioStreamPlayer.set_mix_target */
  final def setMixTarget(mix_target: Long): Unit = {
    if (gdext.classes.AudioStreamPlayer.mb_set_mix_target == null) gdext.classes.AudioStreamPlayer.mb_set_mix_target = MethodBind.get("AudioStreamPlayer", "set_mix_target", 2300306138L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamPlayer.mb_set_mix_target, livePtr, mix_target)
  }

  /** AudioStreamPlayer.get_mix_target */
  final def getMixTarget(): Long = {
    if (gdext.classes.AudioStreamPlayer.mb_get_mix_target == null) gdext.classes.AudioStreamPlayer.mb_get_mix_target = MethodBind.get("AudioStreamPlayer", "get_mix_target", 172807476L)
    Ptrcall.call0[Long](gdext.classes.AudioStreamPlayer.mb_get_mix_target, livePtr)
  }

  /** AudioStreamPlayer.set_playing */
  final def setPlaying(enable: Boolean): Unit = {
    if (gdext.classes.AudioStreamPlayer.mb_set_playing == null) gdext.classes.AudioStreamPlayer.mb_set_playing = MethodBind.get("AudioStreamPlayer", "set_playing", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamPlayer.mb_set_playing, livePtr, enable)
  }

  /** AudioStreamPlayer.set_stream_paused */
  final def setStreamPaused(pause: Boolean): Unit = {
    if (gdext.classes.AudioStreamPlayer.mb_set_stream_paused == null) gdext.classes.AudioStreamPlayer.mb_set_stream_paused = MethodBind.get("AudioStreamPlayer", "set_stream_paused", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamPlayer.mb_set_stream_paused, livePtr, pause)
  }

  /** AudioStreamPlayer.get_stream_paused */
  final def getStreamPaused(): Boolean = {
    if (gdext.classes.AudioStreamPlayer.mb_get_stream_paused == null) gdext.classes.AudioStreamPlayer.mb_get_stream_paused = MethodBind.get("AudioStreamPlayer", "get_stream_paused", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.AudioStreamPlayer.mb_get_stream_paused, livePtr)
  }

  /** AudioStreamPlayer.set_max_polyphony */
  final def setMaxPolyphony(max_polyphony: Long): Unit = {
    if (gdext.classes.AudioStreamPlayer.mb_set_max_polyphony == null) gdext.classes.AudioStreamPlayer.mb_set_max_polyphony = MethodBind.get("AudioStreamPlayer", "set_max_polyphony", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamPlayer.mb_set_max_polyphony, livePtr, max_polyphony)
  }

  /** AudioStreamPlayer.get_max_polyphony */
  final def getMaxPolyphony(): Long = {
    if (gdext.classes.AudioStreamPlayer.mb_get_max_polyphony == null) gdext.classes.AudioStreamPlayer.mb_get_max_polyphony = MethodBind.get("AudioStreamPlayer", "get_max_polyphony", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.AudioStreamPlayer.mb_get_max_polyphony, livePtr)
  }

  /** AudioStreamPlayer.has_stream_playback */
  final def hasStreamPlayback(): Boolean = {
    if (gdext.classes.AudioStreamPlayer.mb_has_stream_playback == null) gdext.classes.AudioStreamPlayer.mb_has_stream_playback = MethodBind.get("AudioStreamPlayer", "has_stream_playback", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.AudioStreamPlayer.mb_has_stream_playback, livePtr)
  }

  /** AudioStreamPlayer.get_stream_playback. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getStreamPlayback(): AudioStreamPlayback = {
    if (gdext.classes.AudioStreamPlayer.mb_get_stream_playback == null) gdext.classes.AudioStreamPlayer.mb_get_stream_playback = MethodBind.get("AudioStreamPlayer", "get_stream_playback", 210135309L)
    Wrappers.owned[AudioStreamPlayback](Ptrcall.call0[Long](gdext.classes.AudioStreamPlayer.mb_get_stream_playback, livePtr))
  }

  /** AudioStreamPlayer.set_playback_type */
  final def setPlaybackType(playback_type: Long): Unit = {
    if (gdext.classes.AudioStreamPlayer.mb_set_playback_type == null) gdext.classes.AudioStreamPlayer.mb_set_playback_type = MethodBind.get("AudioStreamPlayer", "set_playback_type", 725473817L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamPlayer.mb_set_playback_type, livePtr, playback_type)
  }

  /** AudioStreamPlayer.get_playback_type */
  final def getPlaybackType(): Long = {
    if (gdext.classes.AudioStreamPlayer.mb_get_playback_type == null) gdext.classes.AudioStreamPlayer.mb_get_playback_type = MethodBind.get("AudioStreamPlayer", "get_playback_type", 4011264623L)
    Ptrcall.call0[Long](gdext.classes.AudioStreamPlayer.mb_get_playback_type, livePtr)
  }

}

object AudioStreamPlayer {
  private[classes] var mb_set_stream: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_stream: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_volume_db: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_volume_db: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_volume_linear: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_volume_linear: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_pitch_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_pitch_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_play: GDExtensionMethodBindPtr = null
  private[classes] var mb_seek: GDExtensionMethodBindPtr = null
  private[classes] var mb_stop: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_playing: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_playback_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bus: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bus: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_autoplay: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_autoplay_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_mix_target: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_mix_target: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_playing: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_stream_paused: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_stream_paused: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_max_polyphony: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_max_polyphony: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_stream_playback: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_stream_playback: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_playback_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_playback_type: GDExtensionMethodBindPtr = null
}
