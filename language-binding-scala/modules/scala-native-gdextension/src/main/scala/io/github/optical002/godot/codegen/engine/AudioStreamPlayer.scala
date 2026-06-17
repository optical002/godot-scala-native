package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioStreamPlayer`, extends `Node`. */
abstract class AudioStreamPlayer extends Node {

  /** AudioStreamPlayer.set_stream */
  final def setStream(stream: AudioStream): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamPlayer", "set_stream", 2210767741L), hostObject.objectPtr, stream.hostObject)

  /** AudioStreamPlayer.get_stream */
  final def getStream(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("AudioStreamPlayer", "get_stream", 160907539L), hostObject.objectPtr)

  /** AudioStreamPlayer.set_volume_db */
  final def setVolumeDb(volume_db: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamPlayer", "set_volume_db", 373806689L), hostObject.objectPtr, volume_db)

  /** AudioStreamPlayer.get_volume_db */
  final def getVolumeDb(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioStreamPlayer", "get_volume_db", 1740695150L), hostObject.objectPtr)

  /** AudioStreamPlayer.set_volume_linear */
  final def setVolumeLinear(volume_linear: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamPlayer", "set_volume_linear", 373806689L), hostObject.objectPtr, volume_linear)

  /** AudioStreamPlayer.get_volume_linear */
  final def getVolumeLinear(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioStreamPlayer", "get_volume_linear", 1740695150L), hostObject.objectPtr)

  /** AudioStreamPlayer.set_pitch_scale */
  final def setPitchScale(pitch_scale: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamPlayer", "set_pitch_scale", 373806689L), hostObject.objectPtr, pitch_scale)

  /** AudioStreamPlayer.get_pitch_scale */
  final def getPitchScale(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioStreamPlayer", "get_pitch_scale", 1740695150L), hostObject.objectPtr)

  /** AudioStreamPlayer.play */
  final def play(from_position: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamPlayer", "play", 1958160172L), hostObject.objectPtr, from_position)

  /** AudioStreamPlayer.seek */
  final def seek(to_position: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamPlayer", "seek", 373806689L), hostObject.objectPtr, to_position)

  /** AudioStreamPlayer.stop */
  final def stop(): Unit =
    Ptrcall.callVoid0(MethodBind.get("AudioStreamPlayer", "stop", 3218959716L), hostObject.objectPtr)

  /** AudioStreamPlayer.is_playing */
  final def isPlaying(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AudioStreamPlayer", "is_playing", 36873697L), hostObject.objectPtr)

  /** AudioStreamPlayer.get_playback_position */
  final def getPlaybackPosition(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioStreamPlayer", "get_playback_position", 191475506L), hostObject.objectPtr)

  /** AudioStreamPlayer.set_bus */
  final def setBus(bus: io.github.optical002.godot.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamPlayer", "set_bus", 3304788590L), hostObject.objectPtr, bus)

  /** AudioStreamPlayer.get_bus */
  final def getBus(): io.github.optical002.godot.builtin.StringName =
    Ptrcall.call0[io.github.optical002.godot.builtin.StringName](MethodBind.get("AudioStreamPlayer", "get_bus", 2002593661L), hostObject.objectPtr)

  /** AudioStreamPlayer.set_autoplay */
  final def setAutoplay(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamPlayer", "set_autoplay", 2586408642L), hostObject.objectPtr, enable)

  /** AudioStreamPlayer.is_autoplay_enabled */
  final def isAutoplayEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AudioStreamPlayer", "is_autoplay_enabled", 36873697L), hostObject.objectPtr)

  /** AudioStreamPlayer.set_mix_target */
  final def setMixTarget(mix_target: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamPlayer", "set_mix_target", 2300306138L), hostObject.objectPtr, mix_target)

  /** AudioStreamPlayer.get_mix_target */
  final def getMixTarget(): Long =
    Ptrcall.call0[Long](MethodBind.get("AudioStreamPlayer", "get_mix_target", 172807476L), hostObject.objectPtr)

  /** AudioStreamPlayer.set_playing */
  final def setPlaying(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamPlayer", "set_playing", 2586408642L), hostObject.objectPtr, enable)

  /** AudioStreamPlayer.set_stream_paused */
  final def setStreamPaused(pause: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamPlayer", "set_stream_paused", 2586408642L), hostObject.objectPtr, pause)

  /** AudioStreamPlayer.get_stream_paused */
  final def getStreamPaused(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AudioStreamPlayer", "get_stream_paused", 36873697L), hostObject.objectPtr)

  /** AudioStreamPlayer.set_max_polyphony */
  final def setMaxPolyphony(max_polyphony: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamPlayer", "set_max_polyphony", 1286410249L), hostObject.objectPtr, max_polyphony)

  /** AudioStreamPlayer.get_max_polyphony */
  final def getMaxPolyphony(): Long =
    Ptrcall.call0[Long](MethodBind.get("AudioStreamPlayer", "get_max_polyphony", 3905245786L), hostObject.objectPtr)

  /** AudioStreamPlayer.has_stream_playback */
  final def hasStreamPlayback(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AudioStreamPlayer", "has_stream_playback", 2240911060L), hostObject.objectPtr)

  /** AudioStreamPlayer.get_stream_playback */
  final def getStreamPlayback(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("AudioStreamPlayer", "get_stream_playback", 210135309L), hostObject.objectPtr)

  /** AudioStreamPlayer.set_playback_type */
  final def setPlaybackType(playback_type: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamPlayer", "set_playback_type", 725473817L), hostObject.objectPtr, playback_type)

  /** AudioStreamPlayer.get_playback_type */
  final def getPlaybackType(): Long =
    Ptrcall.call0[Long](MethodBind.get("AudioStreamPlayer", "get_playback_type", 4011264623L), hostObject.objectPtr)

}

object AudioStreamPlayer {
  /** Class metadata for Gd[AudioStreamPlayer] lifetime management and casting. */
  given GodotClass[AudioStreamPlayer] with {
    def className = "AudioStreamPlayer"
    def isRefCounted = false
    def wrap(o: GodotObject): AudioStreamPlayer = new AudioStreamPlayer {}.withHost(o.objectPtr)
    def unwrap(t: AudioStreamPlayer): GodotObject = t.hostObject
  }
}
