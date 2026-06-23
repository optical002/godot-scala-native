package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VideoStreamPlayer`, extends `Control`. */
abstract class VideoStreamPlayer extends Control {

  /** VideoStreamPlayer.set_stream */
  final def setStream(stream: VideoStream): Unit =
    Ptrcall.callVoid1(MethodBind.get("VideoStreamPlayer", "set_stream", 2317102564L), hostObject.objectPtr, stream.hostObject)

  /** VideoStreamPlayer.get_stream */
  final def getStream(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("VideoStreamPlayer", "get_stream", 438621487L), hostObject.objectPtr)

  /** VideoStreamPlayer.play */
  final def play(): Unit =
    Ptrcall.callVoid0(MethodBind.get("VideoStreamPlayer", "play", 3218959716L), hostObject.objectPtr)

  /** VideoStreamPlayer.stop */
  final def stop(): Unit =
    Ptrcall.callVoid0(MethodBind.get("VideoStreamPlayer", "stop", 3218959716L), hostObject.objectPtr)

  /** VideoStreamPlayer.is_playing */
  final def isPlaying(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("VideoStreamPlayer", "is_playing", 36873697L), hostObject.objectPtr)

  /** VideoStreamPlayer.set_paused */
  final def setPaused(paused: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("VideoStreamPlayer", "set_paused", 2586408642L), hostObject.objectPtr, paused)

  /** VideoStreamPlayer.is_paused */
  final def isPaused(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("VideoStreamPlayer", "is_paused", 36873697L), hostObject.objectPtr)

  /** VideoStreamPlayer.set_loop */
  final def setLoop(loop: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("VideoStreamPlayer", "set_loop", 2586408642L), hostObject.objectPtr, loop)

  /** VideoStreamPlayer.has_loop */
  final def hasLoop(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("VideoStreamPlayer", "has_loop", 36873697L), hostObject.objectPtr)

  /** VideoStreamPlayer.set_volume */
  final def setVolume(volume: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("VideoStreamPlayer", "set_volume", 373806689L), hostObject.objectPtr, volume)

  /** VideoStreamPlayer.get_volume */
  final def getVolume(): Double =
    Ptrcall.call0[Double](MethodBind.get("VideoStreamPlayer", "get_volume", 1740695150L), hostObject.objectPtr)

  /** VideoStreamPlayer.set_volume_db */
  final def setVolumeDb(db: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("VideoStreamPlayer", "set_volume_db", 373806689L), hostObject.objectPtr, db)

  /** VideoStreamPlayer.get_volume_db */
  final def getVolumeDb(): Double =
    Ptrcall.call0[Double](MethodBind.get("VideoStreamPlayer", "get_volume_db", 1740695150L), hostObject.objectPtr)

  /** VideoStreamPlayer.set_speed_scale */
  final def setSpeedScale(speed_scale: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("VideoStreamPlayer", "set_speed_scale", 373806689L), hostObject.objectPtr, speed_scale)

  /** VideoStreamPlayer.get_speed_scale */
  final def getSpeedScale(): Double =
    Ptrcall.call0[Double](MethodBind.get("VideoStreamPlayer", "get_speed_scale", 1740695150L), hostObject.objectPtr)

  /** VideoStreamPlayer.set_audio_track */
  final def setAudioTrack(track: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VideoStreamPlayer", "set_audio_track", 1286410249L), hostObject.objectPtr, track)

  /** VideoStreamPlayer.get_audio_track */
  final def getAudioTrack(): Long =
    Ptrcall.call0[Long](MethodBind.get("VideoStreamPlayer", "get_audio_track", 3905245786L), hostObject.objectPtr)

  /** VideoStreamPlayer.get_stream_name */
  final def getStreamName(): String =
    Ptrcall.call0[String](MethodBind.get("VideoStreamPlayer", "get_stream_name", 201670096L), hostObject.objectPtr)

  /** VideoStreamPlayer.get_stream_length */
  final def getStreamLength(): Double =
    Ptrcall.call0[Double](MethodBind.get("VideoStreamPlayer", "get_stream_length", 1740695150L), hostObject.objectPtr)

  /** VideoStreamPlayer.set_stream_position */
  final def setStreamPosition(position: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("VideoStreamPlayer", "set_stream_position", 373806689L), hostObject.objectPtr, position)

  /** VideoStreamPlayer.get_stream_position */
  final def getStreamPosition(): Double =
    Ptrcall.call0[Double](MethodBind.get("VideoStreamPlayer", "get_stream_position", 1740695150L), hostObject.objectPtr)

  /** VideoStreamPlayer.set_autoplay */
  final def setAutoplay(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("VideoStreamPlayer", "set_autoplay", 2586408642L), hostObject.objectPtr, enabled)

  /** VideoStreamPlayer.has_autoplay */
  final def hasAutoplay(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("VideoStreamPlayer", "has_autoplay", 36873697L), hostObject.objectPtr)

  /** VideoStreamPlayer.set_expand */
  final def setExpand(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("VideoStreamPlayer", "set_expand", 2586408642L), hostObject.objectPtr, enable)

  /** VideoStreamPlayer.has_expand */
  final def hasExpand(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("VideoStreamPlayer", "has_expand", 36873697L), hostObject.objectPtr)

  /** VideoStreamPlayer.set_buffering_msec */
  final def setBufferingMsec(msec: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VideoStreamPlayer", "set_buffering_msec", 1286410249L), hostObject.objectPtr, msec)

  /** VideoStreamPlayer.get_buffering_msec */
  final def getBufferingMsec(): Long =
    Ptrcall.call0[Long](MethodBind.get("VideoStreamPlayer", "get_buffering_msec", 3905245786L), hostObject.objectPtr)

  /** VideoStreamPlayer.set_bus */
  final def setBus(bus: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("VideoStreamPlayer", "set_bus", 3304788590L), hostObject.objectPtr, bus)

  /** VideoStreamPlayer.get_bus */
  final def getBus(): gdext.builtin.StringName =
    Ptrcall.call0[gdext.builtin.StringName](MethodBind.get("VideoStreamPlayer", "get_bus", 2002593661L), hostObject.objectPtr)

  /** VideoStreamPlayer.get_video_texture */
  final def getVideoTexture(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("VideoStreamPlayer", "get_video_texture", 3635182373L), hostObject.objectPtr)

}

object VideoStreamPlayer {
  /** Class metadata for Gd[VideoStreamPlayer] lifetime management and casting. */
  given GodotClass[VideoStreamPlayer] with {
    def className = "VideoStreamPlayer"
    def isRefCounted = false
    def wrap(o: GodotObject): VideoStreamPlayer = new VideoStreamPlayer {}.withHost(o.objectPtr)
    def unwrap(t: VideoStreamPlayer): GodotObject = t.hostObject
  }
}
