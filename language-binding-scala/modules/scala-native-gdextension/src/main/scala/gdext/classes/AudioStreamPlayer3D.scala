package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AudioStreamPlayer3D`, extends `Node3D`. */
abstract class AudioStreamPlayer3D extends Node3D {
  override def godotClassName: String = "AudioStreamPlayer3D"

  /** AudioStreamPlayer3D.set_stream */
  final def setStream(stream: AudioStream): Unit = {
    if (gdext.classes.AudioStreamPlayer3D.mb_set_stream == null) gdext.classes.AudioStreamPlayer3D.mb_set_stream = MethodBind.get("AudioStreamPlayer3D", "set_stream", 2210767741L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamPlayer3D.mb_set_stream, livePtr, Wrappers.handle(stream))
  }

  /** AudioStreamPlayer3D.get_stream. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getStream(): AudioStream = {
    if (gdext.classes.AudioStreamPlayer3D.mb_get_stream == null) gdext.classes.AudioStreamPlayer3D.mb_get_stream = MethodBind.get("AudioStreamPlayer3D", "get_stream", 160907539L)
    Wrappers.owned[AudioStream](Ptrcall.call0[Long](gdext.classes.AudioStreamPlayer3D.mb_get_stream, livePtr))
  }

  /** AudioStreamPlayer3D.set_volume_db */
  final def setVolumeDb(volume_db: Double): Unit = {
    if (gdext.classes.AudioStreamPlayer3D.mb_set_volume_db == null) gdext.classes.AudioStreamPlayer3D.mb_set_volume_db = MethodBind.get("AudioStreamPlayer3D", "set_volume_db", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamPlayer3D.mb_set_volume_db, livePtr, volume_db)
  }

  /** AudioStreamPlayer3D.get_volume_db */
  final def getVolumeDb(): Double = {
    if (gdext.classes.AudioStreamPlayer3D.mb_get_volume_db == null) gdext.classes.AudioStreamPlayer3D.mb_get_volume_db = MethodBind.get("AudioStreamPlayer3D", "get_volume_db", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioStreamPlayer3D.mb_get_volume_db, livePtr)
  }

  /** AudioStreamPlayer3D.set_volume_linear */
  final def setVolumeLinear(volume_linear: Double): Unit = {
    if (gdext.classes.AudioStreamPlayer3D.mb_set_volume_linear == null) gdext.classes.AudioStreamPlayer3D.mb_set_volume_linear = MethodBind.get("AudioStreamPlayer3D", "set_volume_linear", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamPlayer3D.mb_set_volume_linear, livePtr, volume_linear)
  }

  /** AudioStreamPlayer3D.get_volume_linear */
  final def getVolumeLinear(): Double = {
    if (gdext.classes.AudioStreamPlayer3D.mb_get_volume_linear == null) gdext.classes.AudioStreamPlayer3D.mb_get_volume_linear = MethodBind.get("AudioStreamPlayer3D", "get_volume_linear", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioStreamPlayer3D.mb_get_volume_linear, livePtr)
  }

  /** AudioStreamPlayer3D.set_unit_size */
  final def setUnitSize(unit_size: Double): Unit = {
    if (gdext.classes.AudioStreamPlayer3D.mb_set_unit_size == null) gdext.classes.AudioStreamPlayer3D.mb_set_unit_size = MethodBind.get("AudioStreamPlayer3D", "set_unit_size", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamPlayer3D.mb_set_unit_size, livePtr, unit_size)
  }

  /** AudioStreamPlayer3D.get_unit_size */
  final def getUnitSize(): Double = {
    if (gdext.classes.AudioStreamPlayer3D.mb_get_unit_size == null) gdext.classes.AudioStreamPlayer3D.mb_get_unit_size = MethodBind.get("AudioStreamPlayer3D", "get_unit_size", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioStreamPlayer3D.mb_get_unit_size, livePtr)
  }

  /** AudioStreamPlayer3D.set_max_db */
  final def setMaxDb(max_db: Double): Unit = {
    if (gdext.classes.AudioStreamPlayer3D.mb_set_max_db == null) gdext.classes.AudioStreamPlayer3D.mb_set_max_db = MethodBind.get("AudioStreamPlayer3D", "set_max_db", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamPlayer3D.mb_set_max_db, livePtr, max_db)
  }

  /** AudioStreamPlayer3D.get_max_db */
  final def getMaxDb(): Double = {
    if (gdext.classes.AudioStreamPlayer3D.mb_get_max_db == null) gdext.classes.AudioStreamPlayer3D.mb_get_max_db = MethodBind.get("AudioStreamPlayer3D", "get_max_db", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioStreamPlayer3D.mb_get_max_db, livePtr)
  }

  /** AudioStreamPlayer3D.set_pitch_scale */
  final def setPitchScale(pitch_scale: Double): Unit = {
    if (gdext.classes.AudioStreamPlayer3D.mb_set_pitch_scale == null) gdext.classes.AudioStreamPlayer3D.mb_set_pitch_scale = MethodBind.get("AudioStreamPlayer3D", "set_pitch_scale", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamPlayer3D.mb_set_pitch_scale, livePtr, pitch_scale)
  }

  /** AudioStreamPlayer3D.get_pitch_scale */
  final def getPitchScale(): Double = {
    if (gdext.classes.AudioStreamPlayer3D.mb_get_pitch_scale == null) gdext.classes.AudioStreamPlayer3D.mb_get_pitch_scale = MethodBind.get("AudioStreamPlayer3D", "get_pitch_scale", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioStreamPlayer3D.mb_get_pitch_scale, livePtr)
  }

  /** AudioStreamPlayer3D.play */
  final def play(from_position: Double): Unit = {
    if (gdext.classes.AudioStreamPlayer3D.mb_play == null) gdext.classes.AudioStreamPlayer3D.mb_play = MethodBind.get("AudioStreamPlayer3D", "play", 1958160172L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamPlayer3D.mb_play, livePtr, from_position)
  }

  /** AudioStreamPlayer3D.seek */
  final def seek(to_position: Double): Unit = {
    if (gdext.classes.AudioStreamPlayer3D.mb_seek == null) gdext.classes.AudioStreamPlayer3D.mb_seek = MethodBind.get("AudioStreamPlayer3D", "seek", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamPlayer3D.mb_seek, livePtr, to_position)
  }

  /** AudioStreamPlayer3D.stop */
  final def stop(): Unit = {
    if (gdext.classes.AudioStreamPlayer3D.mb_stop == null) gdext.classes.AudioStreamPlayer3D.mb_stop = MethodBind.get("AudioStreamPlayer3D", "stop", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.AudioStreamPlayer3D.mb_stop, livePtr)
  }

  /** AudioStreamPlayer3D.is_playing */
  final def isPlaying(): Boolean = {
    if (gdext.classes.AudioStreamPlayer3D.mb_is_playing == null) gdext.classes.AudioStreamPlayer3D.mb_is_playing = MethodBind.get("AudioStreamPlayer3D", "is_playing", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.AudioStreamPlayer3D.mb_is_playing, livePtr)
  }

  /** AudioStreamPlayer3D.get_playback_position */
  final def getPlaybackPosition(): Double = {
    if (gdext.classes.AudioStreamPlayer3D.mb_get_playback_position == null) gdext.classes.AudioStreamPlayer3D.mb_get_playback_position = MethodBind.get("AudioStreamPlayer3D", "get_playback_position", 191475506L)
    Ptrcall.call0[Double](gdext.classes.AudioStreamPlayer3D.mb_get_playback_position, livePtr)
  }

  /** AudioStreamPlayer3D.set_bus */
  final def setBus(bus: gdext.builtin.StringName): Unit = {
    if (gdext.classes.AudioStreamPlayer3D.mb_set_bus == null) gdext.classes.AudioStreamPlayer3D.mb_set_bus = MethodBind.get("AudioStreamPlayer3D", "set_bus", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamPlayer3D.mb_set_bus, livePtr, bus)
  }

  /** AudioStreamPlayer3D.get_bus */
  final def getBus(): gdext.builtin.StringName = {
    if (gdext.classes.AudioStreamPlayer3D.mb_get_bus == null) gdext.classes.AudioStreamPlayer3D.mb_get_bus = MethodBind.get("AudioStreamPlayer3D", "get_bus", 2002593661L)
    Ptrcall.call0[gdext.builtin.StringName](gdext.classes.AudioStreamPlayer3D.mb_get_bus, livePtr)
  }

  /** AudioStreamPlayer3D.set_autoplay */
  final def setAutoplay(enable: Boolean): Unit = {
    if (gdext.classes.AudioStreamPlayer3D.mb_set_autoplay == null) gdext.classes.AudioStreamPlayer3D.mb_set_autoplay = MethodBind.get("AudioStreamPlayer3D", "set_autoplay", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamPlayer3D.mb_set_autoplay, livePtr, enable)
  }

  /** AudioStreamPlayer3D.is_autoplay_enabled */
  final def isAutoplayEnabled(): Boolean = {
    if (gdext.classes.AudioStreamPlayer3D.mb_is_autoplay_enabled == null) gdext.classes.AudioStreamPlayer3D.mb_is_autoplay_enabled = MethodBind.get("AudioStreamPlayer3D", "is_autoplay_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.AudioStreamPlayer3D.mb_is_autoplay_enabled, livePtr)
  }

  /** AudioStreamPlayer3D.set_playing */
  final def setPlaying(enable: Boolean): Unit = {
    if (gdext.classes.AudioStreamPlayer3D.mb_set_playing == null) gdext.classes.AudioStreamPlayer3D.mb_set_playing = MethodBind.get("AudioStreamPlayer3D", "set_playing", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamPlayer3D.mb_set_playing, livePtr, enable)
  }

  /** AudioStreamPlayer3D.set_max_distance */
  final def setMaxDistance(meters: Double): Unit = {
    if (gdext.classes.AudioStreamPlayer3D.mb_set_max_distance == null) gdext.classes.AudioStreamPlayer3D.mb_set_max_distance = MethodBind.get("AudioStreamPlayer3D", "set_max_distance", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamPlayer3D.mb_set_max_distance, livePtr, meters)
  }

  /** AudioStreamPlayer3D.get_max_distance */
  final def getMaxDistance(): Double = {
    if (gdext.classes.AudioStreamPlayer3D.mb_get_max_distance == null) gdext.classes.AudioStreamPlayer3D.mb_get_max_distance = MethodBind.get("AudioStreamPlayer3D", "get_max_distance", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioStreamPlayer3D.mb_get_max_distance, livePtr)
  }

  /** AudioStreamPlayer3D.set_area_mask */
  final def setAreaMask(mask: Long): Unit = {
    if (gdext.classes.AudioStreamPlayer3D.mb_set_area_mask == null) gdext.classes.AudioStreamPlayer3D.mb_set_area_mask = MethodBind.get("AudioStreamPlayer3D", "set_area_mask", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamPlayer3D.mb_set_area_mask, livePtr, mask)
  }

  /** AudioStreamPlayer3D.get_area_mask */
  final def getAreaMask(): Long = {
    if (gdext.classes.AudioStreamPlayer3D.mb_get_area_mask == null) gdext.classes.AudioStreamPlayer3D.mb_get_area_mask = MethodBind.get("AudioStreamPlayer3D", "get_area_mask", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.AudioStreamPlayer3D.mb_get_area_mask, livePtr)
  }

  /** AudioStreamPlayer3D.set_emission_angle */
  final def setEmissionAngle(degrees: Double): Unit = {
    if (gdext.classes.AudioStreamPlayer3D.mb_set_emission_angle == null) gdext.classes.AudioStreamPlayer3D.mb_set_emission_angle = MethodBind.get("AudioStreamPlayer3D", "set_emission_angle", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamPlayer3D.mb_set_emission_angle, livePtr, degrees)
  }

  /** AudioStreamPlayer3D.get_emission_angle */
  final def getEmissionAngle(): Double = {
    if (gdext.classes.AudioStreamPlayer3D.mb_get_emission_angle == null) gdext.classes.AudioStreamPlayer3D.mb_get_emission_angle = MethodBind.get("AudioStreamPlayer3D", "get_emission_angle", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioStreamPlayer3D.mb_get_emission_angle, livePtr)
  }

  /** AudioStreamPlayer3D.set_emission_angle_enabled */
  final def setEmissionAngleEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.AudioStreamPlayer3D.mb_set_emission_angle_enabled == null) gdext.classes.AudioStreamPlayer3D.mb_set_emission_angle_enabled = MethodBind.get("AudioStreamPlayer3D", "set_emission_angle_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamPlayer3D.mb_set_emission_angle_enabled, livePtr, enabled)
  }

  /** AudioStreamPlayer3D.is_emission_angle_enabled */
  final def isEmissionAngleEnabled(): Boolean = {
    if (gdext.classes.AudioStreamPlayer3D.mb_is_emission_angle_enabled == null) gdext.classes.AudioStreamPlayer3D.mb_is_emission_angle_enabled = MethodBind.get("AudioStreamPlayer3D", "is_emission_angle_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.AudioStreamPlayer3D.mb_is_emission_angle_enabled, livePtr)
  }

  /** AudioStreamPlayer3D.set_emission_angle_filter_attenuation_db */
  final def setEmissionAngleFilterAttenuationDb(db: Double): Unit = {
    if (gdext.classes.AudioStreamPlayer3D.mb_set_emission_angle_filter_attenuation_db == null) gdext.classes.AudioStreamPlayer3D.mb_set_emission_angle_filter_attenuation_db = MethodBind.get("AudioStreamPlayer3D", "set_emission_angle_filter_attenuation_db", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamPlayer3D.mb_set_emission_angle_filter_attenuation_db, livePtr, db)
  }

  /** AudioStreamPlayer3D.get_emission_angle_filter_attenuation_db */
  final def getEmissionAngleFilterAttenuationDb(): Double = {
    if (gdext.classes.AudioStreamPlayer3D.mb_get_emission_angle_filter_attenuation_db == null) gdext.classes.AudioStreamPlayer3D.mb_get_emission_angle_filter_attenuation_db = MethodBind.get("AudioStreamPlayer3D", "get_emission_angle_filter_attenuation_db", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioStreamPlayer3D.mb_get_emission_angle_filter_attenuation_db, livePtr)
  }

  /** AudioStreamPlayer3D.set_attenuation_filter_cutoff_hz */
  final def setAttenuationFilterCutoffHz(degrees: Double): Unit = {
    if (gdext.classes.AudioStreamPlayer3D.mb_set_attenuation_filter_cutoff_hz == null) gdext.classes.AudioStreamPlayer3D.mb_set_attenuation_filter_cutoff_hz = MethodBind.get("AudioStreamPlayer3D", "set_attenuation_filter_cutoff_hz", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamPlayer3D.mb_set_attenuation_filter_cutoff_hz, livePtr, degrees)
  }

  /** AudioStreamPlayer3D.get_attenuation_filter_cutoff_hz */
  final def getAttenuationFilterCutoffHz(): Double = {
    if (gdext.classes.AudioStreamPlayer3D.mb_get_attenuation_filter_cutoff_hz == null) gdext.classes.AudioStreamPlayer3D.mb_get_attenuation_filter_cutoff_hz = MethodBind.get("AudioStreamPlayer3D", "get_attenuation_filter_cutoff_hz", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioStreamPlayer3D.mb_get_attenuation_filter_cutoff_hz, livePtr)
  }

  /** AudioStreamPlayer3D.set_attenuation_filter_db */
  final def setAttenuationFilterDb(db: Double): Unit = {
    if (gdext.classes.AudioStreamPlayer3D.mb_set_attenuation_filter_db == null) gdext.classes.AudioStreamPlayer3D.mb_set_attenuation_filter_db = MethodBind.get("AudioStreamPlayer3D", "set_attenuation_filter_db", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamPlayer3D.mb_set_attenuation_filter_db, livePtr, db)
  }

  /** AudioStreamPlayer3D.get_attenuation_filter_db */
  final def getAttenuationFilterDb(): Double = {
    if (gdext.classes.AudioStreamPlayer3D.mb_get_attenuation_filter_db == null) gdext.classes.AudioStreamPlayer3D.mb_get_attenuation_filter_db = MethodBind.get("AudioStreamPlayer3D", "get_attenuation_filter_db", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioStreamPlayer3D.mb_get_attenuation_filter_db, livePtr)
  }

  /** AudioStreamPlayer3D.set_attenuation_model */
  final def setAttenuationModel(model: Long): Unit = {
    if (gdext.classes.AudioStreamPlayer3D.mb_set_attenuation_model == null) gdext.classes.AudioStreamPlayer3D.mb_set_attenuation_model = MethodBind.get("AudioStreamPlayer3D", "set_attenuation_model", 2988086229L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamPlayer3D.mb_set_attenuation_model, livePtr, model)
  }

  /** AudioStreamPlayer3D.get_attenuation_model */
  final def getAttenuationModel(): Long = {
    if (gdext.classes.AudioStreamPlayer3D.mb_get_attenuation_model == null) gdext.classes.AudioStreamPlayer3D.mb_get_attenuation_model = MethodBind.get("AudioStreamPlayer3D", "get_attenuation_model", 3035106060L)
    Ptrcall.call0[Long](gdext.classes.AudioStreamPlayer3D.mb_get_attenuation_model, livePtr)
  }

  /** AudioStreamPlayer3D.set_doppler_tracking */
  final def setDopplerTracking(mode: Long): Unit = {
    if (gdext.classes.AudioStreamPlayer3D.mb_set_doppler_tracking == null) gdext.classes.AudioStreamPlayer3D.mb_set_doppler_tracking = MethodBind.get("AudioStreamPlayer3D", "set_doppler_tracking", 3968161450L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamPlayer3D.mb_set_doppler_tracking, livePtr, mode)
  }

  /** AudioStreamPlayer3D.get_doppler_tracking */
  final def getDopplerTracking(): Long = {
    if (gdext.classes.AudioStreamPlayer3D.mb_get_doppler_tracking == null) gdext.classes.AudioStreamPlayer3D.mb_get_doppler_tracking = MethodBind.get("AudioStreamPlayer3D", "get_doppler_tracking", 1702418664L)
    Ptrcall.call0[Long](gdext.classes.AudioStreamPlayer3D.mb_get_doppler_tracking, livePtr)
  }

  /** AudioStreamPlayer3D.set_stream_paused */
  final def setStreamPaused(pause: Boolean): Unit = {
    if (gdext.classes.AudioStreamPlayer3D.mb_set_stream_paused == null) gdext.classes.AudioStreamPlayer3D.mb_set_stream_paused = MethodBind.get("AudioStreamPlayer3D", "set_stream_paused", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamPlayer3D.mb_set_stream_paused, livePtr, pause)
  }

  /** AudioStreamPlayer3D.get_stream_paused */
  final def getStreamPaused(): Boolean = {
    if (gdext.classes.AudioStreamPlayer3D.mb_get_stream_paused == null) gdext.classes.AudioStreamPlayer3D.mb_get_stream_paused = MethodBind.get("AudioStreamPlayer3D", "get_stream_paused", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.AudioStreamPlayer3D.mb_get_stream_paused, livePtr)
  }

  /** AudioStreamPlayer3D.set_max_polyphony */
  final def setMaxPolyphony(max_polyphony: Long): Unit = {
    if (gdext.classes.AudioStreamPlayer3D.mb_set_max_polyphony == null) gdext.classes.AudioStreamPlayer3D.mb_set_max_polyphony = MethodBind.get("AudioStreamPlayer3D", "set_max_polyphony", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamPlayer3D.mb_set_max_polyphony, livePtr, max_polyphony)
  }

  /** AudioStreamPlayer3D.get_max_polyphony */
  final def getMaxPolyphony(): Long = {
    if (gdext.classes.AudioStreamPlayer3D.mb_get_max_polyphony == null) gdext.classes.AudioStreamPlayer3D.mb_get_max_polyphony = MethodBind.get("AudioStreamPlayer3D", "get_max_polyphony", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.AudioStreamPlayer3D.mb_get_max_polyphony, livePtr)
  }

  /** AudioStreamPlayer3D.set_panning_strength */
  final def setPanningStrength(panning_strength: Double): Unit = {
    if (gdext.classes.AudioStreamPlayer3D.mb_set_panning_strength == null) gdext.classes.AudioStreamPlayer3D.mb_set_panning_strength = MethodBind.get("AudioStreamPlayer3D", "set_panning_strength", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamPlayer3D.mb_set_panning_strength, livePtr, panning_strength)
  }

  /** AudioStreamPlayer3D.get_panning_strength */
  final def getPanningStrength(): Double = {
    if (gdext.classes.AudioStreamPlayer3D.mb_get_panning_strength == null) gdext.classes.AudioStreamPlayer3D.mb_get_panning_strength = MethodBind.get("AudioStreamPlayer3D", "get_panning_strength", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioStreamPlayer3D.mb_get_panning_strength, livePtr)
  }

  /** AudioStreamPlayer3D.has_stream_playback */
  final def hasStreamPlayback(): Boolean = {
    if (gdext.classes.AudioStreamPlayer3D.mb_has_stream_playback == null) gdext.classes.AudioStreamPlayer3D.mb_has_stream_playback = MethodBind.get("AudioStreamPlayer3D", "has_stream_playback", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.AudioStreamPlayer3D.mb_has_stream_playback, livePtr)
  }

  /** AudioStreamPlayer3D.get_stream_playback. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getStreamPlayback(): AudioStreamPlayback = {
    if (gdext.classes.AudioStreamPlayer3D.mb_get_stream_playback == null) gdext.classes.AudioStreamPlayer3D.mb_get_stream_playback = MethodBind.get("AudioStreamPlayer3D", "get_stream_playback", 210135309L)
    Wrappers.owned[AudioStreamPlayback](Ptrcall.call0[Long](gdext.classes.AudioStreamPlayer3D.mb_get_stream_playback, livePtr))
  }

  /** AudioStreamPlayer3D.set_playback_type */
  final def setPlaybackType(playback_type: Long): Unit = {
    if (gdext.classes.AudioStreamPlayer3D.mb_set_playback_type == null) gdext.classes.AudioStreamPlayer3D.mb_set_playback_type = MethodBind.get("AudioStreamPlayer3D", "set_playback_type", 725473817L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamPlayer3D.mb_set_playback_type, livePtr, playback_type)
  }

  /** AudioStreamPlayer3D.get_playback_type */
  final def getPlaybackType(): Long = {
    if (gdext.classes.AudioStreamPlayer3D.mb_get_playback_type == null) gdext.classes.AudioStreamPlayer3D.mb_get_playback_type = MethodBind.get("AudioStreamPlayer3D", "get_playback_type", 4011264623L)
    Ptrcall.call0[Long](gdext.classes.AudioStreamPlayer3D.mb_get_playback_type, livePtr)
  }

}

object AudioStreamPlayer3D {
  private[classes] var mb_set_stream: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_stream: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_volume_db: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_volume_db: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_volume_linear: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_volume_linear: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_unit_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_unit_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_max_db: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_max_db: GDExtensionMethodBindPtr = null
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
  private[classes] var mb_set_area_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_area_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_emission_angle: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_emission_angle: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_emission_angle_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_emission_angle_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_emission_angle_filter_attenuation_db: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_emission_angle_filter_attenuation_db: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_attenuation_filter_cutoff_hz: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_attenuation_filter_cutoff_hz: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_attenuation_filter_db: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_attenuation_filter_db: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_attenuation_model: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_attenuation_model: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_doppler_tracking: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_doppler_tracking: GDExtensionMethodBindPtr = null
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
