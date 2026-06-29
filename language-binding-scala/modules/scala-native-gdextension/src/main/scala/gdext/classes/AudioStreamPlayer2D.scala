package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioStreamPlayer2D`, extends `Node2D`. */
abstract class AudioStreamPlayer2D extends Node2D {
  override def godotClassName: String = "AudioStreamPlayer2D"

  /** AudioStreamPlayer2D.set_stream */
  final def setStream(stream: AudioStream): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamPlayer2D", "set_stream", 2210767741L), hostObject.objectPtr, stream.hostObject)

  /** AudioStreamPlayer2D.get_stream */
  final def getStream(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("AudioStreamPlayer2D", "get_stream", 160907539L), hostObject.objectPtr)

  /** AudioStreamPlayer2D.set_volume_db */
  final def setVolumeDb(volume_db: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamPlayer2D", "set_volume_db", 373806689L), hostObject.objectPtr, volume_db)

  /** AudioStreamPlayer2D.get_volume_db */
  final def getVolumeDb(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioStreamPlayer2D", "get_volume_db", 1740695150L), hostObject.objectPtr)

  /** AudioStreamPlayer2D.set_volume_linear */
  final def setVolumeLinear(volume_linear: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamPlayer2D", "set_volume_linear", 373806689L), hostObject.objectPtr, volume_linear)

  /** AudioStreamPlayer2D.get_volume_linear */
  final def getVolumeLinear(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioStreamPlayer2D", "get_volume_linear", 1740695150L), hostObject.objectPtr)

  /** AudioStreamPlayer2D.set_pitch_scale */
  final def setPitchScale(pitch_scale: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamPlayer2D", "set_pitch_scale", 373806689L), hostObject.objectPtr, pitch_scale)

  /** AudioStreamPlayer2D.get_pitch_scale */
  final def getPitchScale(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioStreamPlayer2D", "get_pitch_scale", 1740695150L), hostObject.objectPtr)

  /** AudioStreamPlayer2D.play */
  final def play(from_position: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamPlayer2D", "play", 1958160172L), hostObject.objectPtr, from_position)

  /** AudioStreamPlayer2D.seek */
  final def seek(to_position: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamPlayer2D", "seek", 373806689L), hostObject.objectPtr, to_position)

  /** AudioStreamPlayer2D.stop */
  final def stop(): Unit =
    Ptrcall.callVoid0(MethodBind.get("AudioStreamPlayer2D", "stop", 3218959716L), hostObject.objectPtr)

  /** AudioStreamPlayer2D.is_playing */
  final def isPlaying(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AudioStreamPlayer2D", "is_playing", 36873697L), hostObject.objectPtr)

  /** AudioStreamPlayer2D.get_playback_position */
  final def getPlaybackPosition(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioStreamPlayer2D", "get_playback_position", 191475506L), hostObject.objectPtr)

  /** AudioStreamPlayer2D.set_bus */
  final def setBus(bus: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamPlayer2D", "set_bus", 3304788590L), hostObject.objectPtr, bus)

  /** AudioStreamPlayer2D.get_bus */
  final def getBus(): gdext.builtin.StringName =
    Ptrcall.call0[gdext.builtin.StringName](MethodBind.get("AudioStreamPlayer2D", "get_bus", 2002593661L), hostObject.objectPtr)

  /** AudioStreamPlayer2D.set_autoplay */
  final def setAutoplay(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamPlayer2D", "set_autoplay", 2586408642L), hostObject.objectPtr, enable)

  /** AudioStreamPlayer2D.is_autoplay_enabled */
  final def isAutoplayEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AudioStreamPlayer2D", "is_autoplay_enabled", 36873697L), hostObject.objectPtr)

  /** AudioStreamPlayer2D.set_playing */
  final def setPlaying(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamPlayer2D", "set_playing", 2586408642L), hostObject.objectPtr, enable)

  /** AudioStreamPlayer2D.set_max_distance */
  final def setMaxDistance(pixels: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamPlayer2D", "set_max_distance", 373806689L), hostObject.objectPtr, pixels)

  /** AudioStreamPlayer2D.get_max_distance */
  final def getMaxDistance(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioStreamPlayer2D", "get_max_distance", 1740695150L), hostObject.objectPtr)

  /** AudioStreamPlayer2D.set_attenuation */
  final def setAttenuation(curve: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamPlayer2D", "set_attenuation", 373806689L), hostObject.objectPtr, curve)

  /** AudioStreamPlayer2D.get_attenuation */
  final def getAttenuation(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioStreamPlayer2D", "get_attenuation", 1740695150L), hostObject.objectPtr)

  /** AudioStreamPlayer2D.set_area_mask */
  final def setAreaMask(mask: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamPlayer2D", "set_area_mask", 1286410249L), hostObject.objectPtr, mask)

  /** AudioStreamPlayer2D.get_area_mask */
  final def getAreaMask(): Long =
    Ptrcall.call0[Long](MethodBind.get("AudioStreamPlayer2D", "get_area_mask", 3905245786L), hostObject.objectPtr)

  /** AudioStreamPlayer2D.set_stream_paused */
  final def setStreamPaused(pause: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamPlayer2D", "set_stream_paused", 2586408642L), hostObject.objectPtr, pause)

  /** AudioStreamPlayer2D.get_stream_paused */
  final def getStreamPaused(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AudioStreamPlayer2D", "get_stream_paused", 36873697L), hostObject.objectPtr)

  /** AudioStreamPlayer2D.set_max_polyphony */
  final def setMaxPolyphony(max_polyphony: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamPlayer2D", "set_max_polyphony", 1286410249L), hostObject.objectPtr, max_polyphony)

  /** AudioStreamPlayer2D.get_max_polyphony */
  final def getMaxPolyphony(): Long =
    Ptrcall.call0[Long](MethodBind.get("AudioStreamPlayer2D", "get_max_polyphony", 3905245786L), hostObject.objectPtr)

  /** AudioStreamPlayer2D.set_panning_strength */
  final def setPanningStrength(panning_strength: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamPlayer2D", "set_panning_strength", 373806689L), hostObject.objectPtr, panning_strength)

  /** AudioStreamPlayer2D.get_panning_strength */
  final def getPanningStrength(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioStreamPlayer2D", "get_panning_strength", 1740695150L), hostObject.objectPtr)

  /** AudioStreamPlayer2D.has_stream_playback */
  final def hasStreamPlayback(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AudioStreamPlayer2D", "has_stream_playback", 2240911060L), hostObject.objectPtr)

  /** AudioStreamPlayer2D.get_stream_playback */
  final def getStreamPlayback(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("AudioStreamPlayer2D", "get_stream_playback", 210135309L), hostObject.objectPtr)

  /** AudioStreamPlayer2D.set_playback_type */
  final def setPlaybackType(playback_type: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamPlayer2D", "set_playback_type", 725473817L), hostObject.objectPtr, playback_type)

  /** AudioStreamPlayer2D.get_playback_type */
  final def getPlaybackType(): Long =
    Ptrcall.call0[Long](MethodBind.get("AudioStreamPlayer2D", "get_playback_type", 4011264623L), hostObject.objectPtr)

}
