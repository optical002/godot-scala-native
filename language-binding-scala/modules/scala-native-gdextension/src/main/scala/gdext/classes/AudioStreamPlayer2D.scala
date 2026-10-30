package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AudioStreamPlayer2D`, extends `Node2D`. */
abstract class AudioStreamPlayer2D extends Node2D {
  override def godotClassName: String = "AudioStreamPlayer2D"

  /** AudioStreamPlayer2D.set_stream */
  final def setStream(stream: AudioStream): Unit = {
    if (gdext.classes.AudioStreamPlayer2D.mb_set_stream == null) gdext.classes.AudioStreamPlayer2D.mb_set_stream = MethodBind.get("AudioStreamPlayer2D", "set_stream", 2210767741L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamPlayer2D.mb_set_stream, livePtr, Wrappers.handle(stream))
  }

  /** AudioStreamPlayer2D.get_stream. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getStream(): AudioStream = {
    if (gdext.classes.AudioStreamPlayer2D.mb_get_stream == null) gdext.classes.AudioStreamPlayer2D.mb_get_stream = MethodBind.get("AudioStreamPlayer2D", "get_stream", 160907539L)
    Wrappers.owned[AudioStream](Ptrcall.call0[Long](gdext.classes.AudioStreamPlayer2D.mb_get_stream, livePtr))
  }

  /** AudioStreamPlayer2D.set_volume_db */
  final def setVolumeDb(volumeDb: Double): Unit = {
    if (gdext.classes.AudioStreamPlayer2D.mb_set_volume_db == null) gdext.classes.AudioStreamPlayer2D.mb_set_volume_db = MethodBind.get("AudioStreamPlayer2D", "set_volume_db", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamPlayer2D.mb_set_volume_db, livePtr, volumeDb)
  }

  /** AudioStreamPlayer2D.get_volume_db */
  final def getVolumeDb(): Double = {
    if (gdext.classes.AudioStreamPlayer2D.mb_get_volume_db == null) gdext.classes.AudioStreamPlayer2D.mb_get_volume_db = MethodBind.get("AudioStreamPlayer2D", "get_volume_db", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioStreamPlayer2D.mb_get_volume_db, livePtr)
  }

  /** AudioStreamPlayer2D.set_volume_linear */
  final def setVolumeLinear(volumeLinear: Double): Unit = {
    if (gdext.classes.AudioStreamPlayer2D.mb_set_volume_linear == null) gdext.classes.AudioStreamPlayer2D.mb_set_volume_linear = MethodBind.get("AudioStreamPlayer2D", "set_volume_linear", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamPlayer2D.mb_set_volume_linear, livePtr, volumeLinear)
  }

  /** AudioStreamPlayer2D.get_volume_linear */
  final def getVolumeLinear(): Double = {
    if (gdext.classes.AudioStreamPlayer2D.mb_get_volume_linear == null) gdext.classes.AudioStreamPlayer2D.mb_get_volume_linear = MethodBind.get("AudioStreamPlayer2D", "get_volume_linear", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioStreamPlayer2D.mb_get_volume_linear, livePtr)
  }

  /** AudioStreamPlayer2D.set_pitch_scale */
  final def setPitchScale(pitchScale: Double): Unit = {
    if (gdext.classes.AudioStreamPlayer2D.mb_set_pitch_scale == null) gdext.classes.AudioStreamPlayer2D.mb_set_pitch_scale = MethodBind.get("AudioStreamPlayer2D", "set_pitch_scale", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamPlayer2D.mb_set_pitch_scale, livePtr, pitchScale)
  }

  /** AudioStreamPlayer2D.get_pitch_scale */
  final def getPitchScale(): Double = {
    if (gdext.classes.AudioStreamPlayer2D.mb_get_pitch_scale == null) gdext.classes.AudioStreamPlayer2D.mb_get_pitch_scale = MethodBind.get("AudioStreamPlayer2D", "get_pitch_scale", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioStreamPlayer2D.mb_get_pitch_scale, livePtr)
  }

  /** AudioStreamPlayer2D.play */
  final def play(fromPosition: Double = 0.0): Unit = {
    if (gdext.classes.AudioStreamPlayer2D.mb_play == null) gdext.classes.AudioStreamPlayer2D.mb_play = MethodBind.get("AudioStreamPlayer2D", "play", 1958160172L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamPlayer2D.mb_play, livePtr, fromPosition)
  }

  /** AudioStreamPlayer2D.seek */
  final def seek(toPosition: Double): Unit = {
    if (gdext.classes.AudioStreamPlayer2D.mb_seek == null) gdext.classes.AudioStreamPlayer2D.mb_seek = MethodBind.get("AudioStreamPlayer2D", "seek", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamPlayer2D.mb_seek, livePtr, toPosition)
  }

  /** AudioStreamPlayer2D.stop */
  final def stop(): Unit = {
    if (gdext.classes.AudioStreamPlayer2D.mb_stop == null) gdext.classes.AudioStreamPlayer2D.mb_stop = MethodBind.get("AudioStreamPlayer2D", "stop", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.AudioStreamPlayer2D.mb_stop, livePtr)
  }

  /** AudioStreamPlayer2D.is_playing */
  final def isPlaying(): Boolean = {
    if (gdext.classes.AudioStreamPlayer2D.mb_is_playing == null) gdext.classes.AudioStreamPlayer2D.mb_is_playing = MethodBind.get("AudioStreamPlayer2D", "is_playing", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.AudioStreamPlayer2D.mb_is_playing, livePtr)
  }

  /** AudioStreamPlayer2D.get_playback_position */
  final def getPlaybackPosition(): Double = {
    if (gdext.classes.AudioStreamPlayer2D.mb_get_playback_position == null) gdext.classes.AudioStreamPlayer2D.mb_get_playback_position = MethodBind.get("AudioStreamPlayer2D", "get_playback_position", 191475506L)
    Ptrcall.call0[Double](gdext.classes.AudioStreamPlayer2D.mb_get_playback_position, livePtr)
  }

  /** AudioStreamPlayer2D.set_bus */
  final def setBus(bus: String): Unit = {
    if (gdext.classes.AudioStreamPlayer2D.mb_set_bus == null) gdext.classes.AudioStreamPlayer2D.mb_set_bus = MethodBind.get("AudioStreamPlayer2D", "set_bus", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamPlayer2D.mb_set_bus, livePtr, SnArg(bus))
  }

  /** AudioStreamPlayer2D.get_bus */
  final def getBus(): String = {
    if (gdext.classes.AudioStreamPlayer2D.mb_get_bus == null) gdext.classes.AudioStreamPlayer2D.mb_get_bus = MethodBind.get("AudioStreamPlayer2D", "get_bus", 2002593661L)
    Ptrcall.call0[SnArg](gdext.classes.AudioStreamPlayer2D.mb_get_bus, livePtr)
  }

  /** AudioStreamPlayer2D.set_autoplay */
  final def setAutoplay(enable: Boolean): Unit = {
    if (gdext.classes.AudioStreamPlayer2D.mb_set_autoplay == null) gdext.classes.AudioStreamPlayer2D.mb_set_autoplay = MethodBind.get("AudioStreamPlayer2D", "set_autoplay", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamPlayer2D.mb_set_autoplay, livePtr, enable)
  }

  /** AudioStreamPlayer2D.is_autoplay_enabled */
  final def isAutoplayEnabled(): Boolean = {
    if (gdext.classes.AudioStreamPlayer2D.mb_is_autoplay_enabled == null) gdext.classes.AudioStreamPlayer2D.mb_is_autoplay_enabled = MethodBind.get("AudioStreamPlayer2D", "is_autoplay_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.AudioStreamPlayer2D.mb_is_autoplay_enabled, livePtr)
  }

  /** AudioStreamPlayer2D.set_playing */
  final def setPlaying(enable: Boolean): Unit = {
    if (gdext.classes.AudioStreamPlayer2D.mb_set_playing == null) gdext.classes.AudioStreamPlayer2D.mb_set_playing = MethodBind.get("AudioStreamPlayer2D", "set_playing", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamPlayer2D.mb_set_playing, livePtr, enable)
  }

  /** AudioStreamPlayer2D.set_max_distance */
  final def setMaxDistance(pixels: Double): Unit = {
    if (gdext.classes.AudioStreamPlayer2D.mb_set_max_distance == null) gdext.classes.AudioStreamPlayer2D.mb_set_max_distance = MethodBind.get("AudioStreamPlayer2D", "set_max_distance", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamPlayer2D.mb_set_max_distance, livePtr, pixels)
  }

  /** AudioStreamPlayer2D.get_max_distance */
  final def getMaxDistance(): Double = {
    if (gdext.classes.AudioStreamPlayer2D.mb_get_max_distance == null) gdext.classes.AudioStreamPlayer2D.mb_get_max_distance = MethodBind.get("AudioStreamPlayer2D", "get_max_distance", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioStreamPlayer2D.mb_get_max_distance, livePtr)
  }

  /** AudioStreamPlayer2D.set_attenuation */
  final def setAttenuation(curve: Double): Unit = {
    if (gdext.classes.AudioStreamPlayer2D.mb_set_attenuation == null) gdext.classes.AudioStreamPlayer2D.mb_set_attenuation = MethodBind.get("AudioStreamPlayer2D", "set_attenuation", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamPlayer2D.mb_set_attenuation, livePtr, curve)
  }

  /** AudioStreamPlayer2D.get_attenuation */
  final def getAttenuation(): Double = {
    if (gdext.classes.AudioStreamPlayer2D.mb_get_attenuation == null) gdext.classes.AudioStreamPlayer2D.mb_get_attenuation = MethodBind.get("AudioStreamPlayer2D", "get_attenuation", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioStreamPlayer2D.mb_get_attenuation, livePtr)
  }

  /** AudioStreamPlayer2D.set_area_mask */
  final def setAreaMask(mask: Long): Unit = {
    if (gdext.classes.AudioStreamPlayer2D.mb_set_area_mask == null) gdext.classes.AudioStreamPlayer2D.mb_set_area_mask = MethodBind.get("AudioStreamPlayer2D", "set_area_mask", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamPlayer2D.mb_set_area_mask, livePtr, mask)
  }

  /** AudioStreamPlayer2D.get_area_mask */
  final def getAreaMask(): Long = {
    if (gdext.classes.AudioStreamPlayer2D.mb_get_area_mask == null) gdext.classes.AudioStreamPlayer2D.mb_get_area_mask = MethodBind.get("AudioStreamPlayer2D", "get_area_mask", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.AudioStreamPlayer2D.mb_get_area_mask, livePtr)
  }

  /** AudioStreamPlayer2D.set_stream_paused */
  final def setStreamPaused(pause: Boolean): Unit = {
    if (gdext.classes.AudioStreamPlayer2D.mb_set_stream_paused == null) gdext.classes.AudioStreamPlayer2D.mb_set_stream_paused = MethodBind.get("AudioStreamPlayer2D", "set_stream_paused", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamPlayer2D.mb_set_stream_paused, livePtr, pause)
  }

  /** AudioStreamPlayer2D.get_stream_paused */
  final def getStreamPaused(): Boolean = {
    if (gdext.classes.AudioStreamPlayer2D.mb_get_stream_paused == null) gdext.classes.AudioStreamPlayer2D.mb_get_stream_paused = MethodBind.get("AudioStreamPlayer2D", "get_stream_paused", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.AudioStreamPlayer2D.mb_get_stream_paused, livePtr)
  }

  /** AudioStreamPlayer2D.set_max_polyphony */
  final def setMaxPolyphony(maxPolyphony: Long): Unit = {
    if (gdext.classes.AudioStreamPlayer2D.mb_set_max_polyphony == null) gdext.classes.AudioStreamPlayer2D.mb_set_max_polyphony = MethodBind.get("AudioStreamPlayer2D", "set_max_polyphony", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamPlayer2D.mb_set_max_polyphony, livePtr, maxPolyphony)
  }

  /** AudioStreamPlayer2D.get_max_polyphony */
  final def getMaxPolyphony(): Long = {
    if (gdext.classes.AudioStreamPlayer2D.mb_get_max_polyphony == null) gdext.classes.AudioStreamPlayer2D.mb_get_max_polyphony = MethodBind.get("AudioStreamPlayer2D", "get_max_polyphony", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.AudioStreamPlayer2D.mb_get_max_polyphony, livePtr)
  }

  /** AudioStreamPlayer2D.set_panning_strength */
  final def setPanningStrength(panningStrength: Double): Unit = {
    if (gdext.classes.AudioStreamPlayer2D.mb_set_panning_strength == null) gdext.classes.AudioStreamPlayer2D.mb_set_panning_strength = MethodBind.get("AudioStreamPlayer2D", "set_panning_strength", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamPlayer2D.mb_set_panning_strength, livePtr, panningStrength)
  }

  /** AudioStreamPlayer2D.get_panning_strength */
  final def getPanningStrength(): Double = {
    if (gdext.classes.AudioStreamPlayer2D.mb_get_panning_strength == null) gdext.classes.AudioStreamPlayer2D.mb_get_panning_strength = MethodBind.get("AudioStreamPlayer2D", "get_panning_strength", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioStreamPlayer2D.mb_get_panning_strength, livePtr)
  }

  /** AudioStreamPlayer2D.has_stream_playback */
  final def hasStreamPlayback(): Boolean = {
    if (gdext.classes.AudioStreamPlayer2D.mb_has_stream_playback == null) gdext.classes.AudioStreamPlayer2D.mb_has_stream_playback = MethodBind.get("AudioStreamPlayer2D", "has_stream_playback", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.AudioStreamPlayer2D.mb_has_stream_playback, livePtr)
  }

  /** AudioStreamPlayer2D.get_stream_playback. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getStreamPlayback(): AudioStreamPlayback = {
    if (gdext.classes.AudioStreamPlayer2D.mb_get_stream_playback == null) gdext.classes.AudioStreamPlayer2D.mb_get_stream_playback = MethodBind.get("AudioStreamPlayer2D", "get_stream_playback", 210135309L)
    Wrappers.owned[AudioStreamPlayback](Ptrcall.call0[Long](gdext.classes.AudioStreamPlayer2D.mb_get_stream_playback, livePtr))
  }

  /** AudioStreamPlayer2D.set_playback_type */
  final def setPlaybackType(playbackType: gdext.classes.AudioServer.PlaybackType): Unit = {
    if (gdext.classes.AudioStreamPlayer2D.mb_set_playback_type == null) gdext.classes.AudioStreamPlayer2D.mb_set_playback_type = MethodBind.get("AudioStreamPlayer2D", "set_playback_type", 725473817L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamPlayer2D.mb_set_playback_type, livePtr, playbackType)
  }

  /** AudioStreamPlayer2D.get_playback_type */
  final def getPlaybackType(): gdext.classes.AudioServer.PlaybackType = {
    if (gdext.classes.AudioStreamPlayer2D.mb_get_playback_type == null) gdext.classes.AudioStreamPlayer2D.mb_get_playback_type = MethodBind.get("AudioStreamPlayer2D", "get_playback_type", 4011264623L)
    gdext.classes.AudioServer.PlaybackType(Ptrcall.call0[Long](gdext.classes.AudioStreamPlayer2D.mb_get_playback_type, livePtr))
  }

}

object AudioStreamPlayer2D {
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
  private[classes] var mb_set_playing: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_max_distance: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_max_distance: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_attenuation: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_attenuation: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_area_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_area_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_stream_paused: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_stream_paused: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_max_polyphony: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_max_polyphony: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_panning_strength: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_panning_strength: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_stream_playback: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_stream_playback: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_playback_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_playback_type: GDExtensionMethodBindPtr = null
}
