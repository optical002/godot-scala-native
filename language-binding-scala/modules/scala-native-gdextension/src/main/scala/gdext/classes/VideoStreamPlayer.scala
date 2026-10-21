package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VideoStreamPlayer`, extends `Control`. */
abstract class VideoStreamPlayer extends Control {
  override def godotClassName: String = "VideoStreamPlayer"

  /** VideoStreamPlayer.set_stream */
  final def setStream(stream: VideoStream): Unit = {
    if (gdext.classes.VideoStreamPlayer.mb_set_stream == null) gdext.classes.VideoStreamPlayer.mb_set_stream = MethodBind.get("VideoStreamPlayer", "set_stream", 2317102564L)
    Ptrcall.callVoid1(gdext.classes.VideoStreamPlayer.mb_set_stream, livePtr, Wrappers.handle(stream))
  }

  /** VideoStreamPlayer.get_stream. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getStream(): VideoStream = {
    if (gdext.classes.VideoStreamPlayer.mb_get_stream == null) gdext.classes.VideoStreamPlayer.mb_get_stream = MethodBind.get("VideoStreamPlayer", "get_stream", 438621487L)
    Wrappers.owned[VideoStream](Ptrcall.call0[Long](gdext.classes.VideoStreamPlayer.mb_get_stream, livePtr))
  }

  /** VideoStreamPlayer.play */
  final def play(): Unit = {
    if (gdext.classes.VideoStreamPlayer.mb_play == null) gdext.classes.VideoStreamPlayer.mb_play = MethodBind.get("VideoStreamPlayer", "play", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.VideoStreamPlayer.mb_play, livePtr)
  }

  /** VideoStreamPlayer.stop */
  final def stop(): Unit = {
    if (gdext.classes.VideoStreamPlayer.mb_stop == null) gdext.classes.VideoStreamPlayer.mb_stop = MethodBind.get("VideoStreamPlayer", "stop", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.VideoStreamPlayer.mb_stop, livePtr)
  }

  /** VideoStreamPlayer.is_playing */
  final def isPlaying(): Boolean = {
    if (gdext.classes.VideoStreamPlayer.mb_is_playing == null) gdext.classes.VideoStreamPlayer.mb_is_playing = MethodBind.get("VideoStreamPlayer", "is_playing", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.VideoStreamPlayer.mb_is_playing, livePtr)
  }

  /** VideoStreamPlayer.set_paused */
  final def setPaused(paused: Boolean): Unit = {
    if (gdext.classes.VideoStreamPlayer.mb_set_paused == null) gdext.classes.VideoStreamPlayer.mb_set_paused = MethodBind.get("VideoStreamPlayer", "set_paused", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.VideoStreamPlayer.mb_set_paused, livePtr, paused)
  }

  /** VideoStreamPlayer.is_paused */
  final def isPaused(): Boolean = {
    if (gdext.classes.VideoStreamPlayer.mb_is_paused == null) gdext.classes.VideoStreamPlayer.mb_is_paused = MethodBind.get("VideoStreamPlayer", "is_paused", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.VideoStreamPlayer.mb_is_paused, livePtr)
  }

  /** VideoStreamPlayer.set_loop */
  final def setLoop(loop: Boolean): Unit = {
    if (gdext.classes.VideoStreamPlayer.mb_set_loop == null) gdext.classes.VideoStreamPlayer.mb_set_loop = MethodBind.get("VideoStreamPlayer", "set_loop", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.VideoStreamPlayer.mb_set_loop, livePtr, loop)
  }

  /** VideoStreamPlayer.has_loop */
  final def hasLoop(): Boolean = {
    if (gdext.classes.VideoStreamPlayer.mb_has_loop == null) gdext.classes.VideoStreamPlayer.mb_has_loop = MethodBind.get("VideoStreamPlayer", "has_loop", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.VideoStreamPlayer.mb_has_loop, livePtr)
  }

  /** VideoStreamPlayer.set_volume */
  final def setVolume(volume: Double): Unit = {
    if (gdext.classes.VideoStreamPlayer.mb_set_volume == null) gdext.classes.VideoStreamPlayer.mb_set_volume = MethodBind.get("VideoStreamPlayer", "set_volume", 373806689L)
    Ptrcall.callVoid1(gdext.classes.VideoStreamPlayer.mb_set_volume, livePtr, volume)
  }

  /** VideoStreamPlayer.get_volume */
  final def getVolume(): Double = {
    if (gdext.classes.VideoStreamPlayer.mb_get_volume == null) gdext.classes.VideoStreamPlayer.mb_get_volume = MethodBind.get("VideoStreamPlayer", "get_volume", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.VideoStreamPlayer.mb_get_volume, livePtr)
  }

  /** VideoStreamPlayer.set_volume_db */
  final def setVolumeDb(db: Double): Unit = {
    if (gdext.classes.VideoStreamPlayer.mb_set_volume_db == null) gdext.classes.VideoStreamPlayer.mb_set_volume_db = MethodBind.get("VideoStreamPlayer", "set_volume_db", 373806689L)
    Ptrcall.callVoid1(gdext.classes.VideoStreamPlayer.mb_set_volume_db, livePtr, db)
  }

  /** VideoStreamPlayer.get_volume_db */
  final def getVolumeDb(): Double = {
    if (gdext.classes.VideoStreamPlayer.mb_get_volume_db == null) gdext.classes.VideoStreamPlayer.mb_get_volume_db = MethodBind.get("VideoStreamPlayer", "get_volume_db", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.VideoStreamPlayer.mb_get_volume_db, livePtr)
  }

  /** VideoStreamPlayer.set_speed_scale */
  final def setSpeedScale(speed_scale: Double): Unit = {
    if (gdext.classes.VideoStreamPlayer.mb_set_speed_scale == null) gdext.classes.VideoStreamPlayer.mb_set_speed_scale = MethodBind.get("VideoStreamPlayer", "set_speed_scale", 373806689L)
    Ptrcall.callVoid1(gdext.classes.VideoStreamPlayer.mb_set_speed_scale, livePtr, speed_scale)
  }

  /** VideoStreamPlayer.get_speed_scale */
  final def getSpeedScale(): Double = {
    if (gdext.classes.VideoStreamPlayer.mb_get_speed_scale == null) gdext.classes.VideoStreamPlayer.mb_get_speed_scale = MethodBind.get("VideoStreamPlayer", "get_speed_scale", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.VideoStreamPlayer.mb_get_speed_scale, livePtr)
  }

  /** VideoStreamPlayer.set_audio_track */
  final def setAudioTrack(track: Long): Unit = {
    if (gdext.classes.VideoStreamPlayer.mb_set_audio_track == null) gdext.classes.VideoStreamPlayer.mb_set_audio_track = MethodBind.get("VideoStreamPlayer", "set_audio_track", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.VideoStreamPlayer.mb_set_audio_track, livePtr, track)
  }

  /** VideoStreamPlayer.get_audio_track */
  final def getAudioTrack(): Long = {
    if (gdext.classes.VideoStreamPlayer.mb_get_audio_track == null) gdext.classes.VideoStreamPlayer.mb_get_audio_track = MethodBind.get("VideoStreamPlayer", "get_audio_track", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.VideoStreamPlayer.mb_get_audio_track, livePtr)
  }

  /** VideoStreamPlayer.get_stream_name */
  final def getStreamName(): String = {
    if (gdext.classes.VideoStreamPlayer.mb_get_stream_name == null) gdext.classes.VideoStreamPlayer.mb_get_stream_name = MethodBind.get("VideoStreamPlayer", "get_stream_name", 201670096L)
    Ptrcall.call0[String](gdext.classes.VideoStreamPlayer.mb_get_stream_name, livePtr)
  }

  /** VideoStreamPlayer.get_stream_length */
  final def getStreamLength(): Double = {
    if (gdext.classes.VideoStreamPlayer.mb_get_stream_length == null) gdext.classes.VideoStreamPlayer.mb_get_stream_length = MethodBind.get("VideoStreamPlayer", "get_stream_length", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.VideoStreamPlayer.mb_get_stream_length, livePtr)
  }

  /** VideoStreamPlayer.set_stream_position */
  final def setStreamPosition(position: Double): Unit = {
    if (gdext.classes.VideoStreamPlayer.mb_set_stream_position == null) gdext.classes.VideoStreamPlayer.mb_set_stream_position = MethodBind.get("VideoStreamPlayer", "set_stream_position", 373806689L)
    Ptrcall.callVoid1(gdext.classes.VideoStreamPlayer.mb_set_stream_position, livePtr, position)
  }

  /** VideoStreamPlayer.get_stream_position */
  final def getStreamPosition(): Double = {
    if (gdext.classes.VideoStreamPlayer.mb_get_stream_position == null) gdext.classes.VideoStreamPlayer.mb_get_stream_position = MethodBind.get("VideoStreamPlayer", "get_stream_position", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.VideoStreamPlayer.mb_get_stream_position, livePtr)
  }

  /** VideoStreamPlayer.set_autoplay */
  final def setAutoplay(enabled: Boolean): Unit = {
    if (gdext.classes.VideoStreamPlayer.mb_set_autoplay == null) gdext.classes.VideoStreamPlayer.mb_set_autoplay = MethodBind.get("VideoStreamPlayer", "set_autoplay", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.VideoStreamPlayer.mb_set_autoplay, livePtr, enabled)
  }

  /** VideoStreamPlayer.has_autoplay */
  final def hasAutoplay(): Boolean = {
    if (gdext.classes.VideoStreamPlayer.mb_has_autoplay == null) gdext.classes.VideoStreamPlayer.mb_has_autoplay = MethodBind.get("VideoStreamPlayer", "has_autoplay", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.VideoStreamPlayer.mb_has_autoplay, livePtr)
  }

  /** VideoStreamPlayer.set_expand */
  final def setExpand(enable: Boolean): Unit = {
    if (gdext.classes.VideoStreamPlayer.mb_set_expand == null) gdext.classes.VideoStreamPlayer.mb_set_expand = MethodBind.get("VideoStreamPlayer", "set_expand", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.VideoStreamPlayer.mb_set_expand, livePtr, enable)
  }

  /** VideoStreamPlayer.has_expand */
  final def hasExpand(): Boolean = {
    if (gdext.classes.VideoStreamPlayer.mb_has_expand == null) gdext.classes.VideoStreamPlayer.mb_has_expand = MethodBind.get("VideoStreamPlayer", "has_expand", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.VideoStreamPlayer.mb_has_expand, livePtr)
  }

  /** VideoStreamPlayer.set_buffering_msec */
  final def setBufferingMsec(msec: Long): Unit = {
    if (gdext.classes.VideoStreamPlayer.mb_set_buffering_msec == null) gdext.classes.VideoStreamPlayer.mb_set_buffering_msec = MethodBind.get("VideoStreamPlayer", "set_buffering_msec", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.VideoStreamPlayer.mb_set_buffering_msec, livePtr, msec)
  }

  /** VideoStreamPlayer.get_buffering_msec */
  final def getBufferingMsec(): Long = {
    if (gdext.classes.VideoStreamPlayer.mb_get_buffering_msec == null) gdext.classes.VideoStreamPlayer.mb_get_buffering_msec = MethodBind.get("VideoStreamPlayer", "get_buffering_msec", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.VideoStreamPlayer.mb_get_buffering_msec, livePtr)
  }

  /** VideoStreamPlayer.set_bus */
  final def setBus(bus: gdext.builtin.StringName): Unit = {
    if (gdext.classes.VideoStreamPlayer.mb_set_bus == null) gdext.classes.VideoStreamPlayer.mb_set_bus = MethodBind.get("VideoStreamPlayer", "set_bus", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.VideoStreamPlayer.mb_set_bus, livePtr, bus)
  }

  /** VideoStreamPlayer.get_bus */
  final def getBus(): gdext.builtin.StringName = {
    if (gdext.classes.VideoStreamPlayer.mb_get_bus == null) gdext.classes.VideoStreamPlayer.mb_get_bus = MethodBind.get("VideoStreamPlayer", "get_bus", 2002593661L)
    Ptrcall.call0[gdext.builtin.StringName](gdext.classes.VideoStreamPlayer.mb_get_bus, livePtr)
  }

  /** VideoStreamPlayer.get_video_texture. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getVideoTexture(): Texture2D = {
    if (gdext.classes.VideoStreamPlayer.mb_get_video_texture == null) gdext.classes.VideoStreamPlayer.mb_get_video_texture = MethodBind.get("VideoStreamPlayer", "get_video_texture", 3635182373L)
    Wrappers.owned[Texture2D](Ptrcall.call0[Long](gdext.classes.VideoStreamPlayer.mb_get_video_texture, livePtr))
  }

}

object VideoStreamPlayer {
  private[classes] var mb_set_stream: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_stream: GDExtensionMethodBindPtr = null
  private[classes] var mb_play: GDExtensionMethodBindPtr = null
  private[classes] var mb_stop: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_playing: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_paused: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_paused: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_loop: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_loop: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_volume: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_volume: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_volume_db: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_volume_db: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_speed_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_speed_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_audio_track: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_audio_track: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_stream_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_stream_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_stream_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_stream_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_autoplay: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_autoplay: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_expand: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_expand: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_buffering_msec: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_buffering_msec: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bus: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bus: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_video_texture: GDExtensionMethodBindPtr = null
}
