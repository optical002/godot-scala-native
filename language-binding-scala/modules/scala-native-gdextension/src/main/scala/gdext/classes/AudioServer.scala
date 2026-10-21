package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AudioServer`, extends `Object`. */
abstract class AudioServer extends Object {
  override def godotClassName: String = "AudioServer"

  /** AudioServer.set_bus_count */
  final def setBusCount(amount: Long): Unit = {
    if (gdext.classes.AudioServer.mb_set_bus_count == null) gdext.classes.AudioServer.mb_set_bus_count = MethodBind.get("AudioServer", "set_bus_count", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.AudioServer.mb_set_bus_count, livePtr, amount)
  }

  /** AudioServer.get_bus_count */
  final def getBusCount(): Long = {
    if (gdext.classes.AudioServer.mb_get_bus_count == null) gdext.classes.AudioServer.mb_get_bus_count = MethodBind.get("AudioServer", "get_bus_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.AudioServer.mb_get_bus_count, livePtr)
  }

  /** AudioServer.remove_bus */
  final def removeBus(index: Long): Unit = {
    if (gdext.classes.AudioServer.mb_remove_bus == null) gdext.classes.AudioServer.mb_remove_bus = MethodBind.get("AudioServer", "remove_bus", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.AudioServer.mb_remove_bus, livePtr, index)
  }

  /** AudioServer.add_bus */
  final def addBus(at_position: Long): Unit = {
    if (gdext.classes.AudioServer.mb_add_bus == null) gdext.classes.AudioServer.mb_add_bus = MethodBind.get("AudioServer", "add_bus", 1025054187L)
    Ptrcall.callVoid1(gdext.classes.AudioServer.mb_add_bus, livePtr, at_position)
  }

  /** AudioServer.move_bus */
  final def moveBus(index: Long, to_index: Long): Unit = {
    if (gdext.classes.AudioServer.mb_move_bus == null) gdext.classes.AudioServer.mb_move_bus = MethodBind.get("AudioServer", "move_bus", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.AudioServer.mb_move_bus, livePtr, index, to_index)
  }

  /** AudioServer.set_bus_name */
  final def setBusName(bus_idx: Long, name: String): Unit = {
    if (gdext.classes.AudioServer.mb_set_bus_name == null) gdext.classes.AudioServer.mb_set_bus_name = MethodBind.get("AudioServer", "set_bus_name", 501894301L)
    Ptrcall.callVoid2(gdext.classes.AudioServer.mb_set_bus_name, livePtr, bus_idx, name)
  }

  /** AudioServer.get_bus_name */
  final def getBusName(bus_idx: Long): String = {
    if (gdext.classes.AudioServer.mb_get_bus_name == null) gdext.classes.AudioServer.mb_get_bus_name = MethodBind.get("AudioServer", "get_bus_name", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.AudioServer.mb_get_bus_name, livePtr, bus_idx)
  }

  /** AudioServer.get_bus_index */
  final def getBusIndex(bus_name: gdext.builtin.StringName): Long = {
    if (gdext.classes.AudioServer.mb_get_bus_index == null) gdext.classes.AudioServer.mb_get_bus_index = MethodBind.get("AudioServer", "get_bus_index", 2458036349L)
    Ptrcall.call1[gdext.builtin.StringName, Long](gdext.classes.AudioServer.mb_get_bus_index, livePtr, bus_name)
  }

  /** AudioServer.get_bus_channels */
  final def getBusChannels(bus_idx: Long): Long = {
    if (gdext.classes.AudioServer.mb_get_bus_channels == null) gdext.classes.AudioServer.mb_get_bus_channels = MethodBind.get("AudioServer", "get_bus_channels", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.AudioServer.mb_get_bus_channels, livePtr, bus_idx)
  }

  /** AudioServer.set_bus_volume_db */
  final def setBusVolumeDb(bus_idx: Long, volume_db: Double): Unit = {
    if (gdext.classes.AudioServer.mb_set_bus_volume_db == null) gdext.classes.AudioServer.mb_set_bus_volume_db = MethodBind.get("AudioServer", "set_bus_volume_db", 1602489585L)
    Ptrcall.callVoid2(gdext.classes.AudioServer.mb_set_bus_volume_db, livePtr, bus_idx, volume_db)
  }

  /** AudioServer.get_bus_volume_db */
  final def getBusVolumeDb(bus_idx: Long): Double = {
    if (gdext.classes.AudioServer.mb_get_bus_volume_db == null) gdext.classes.AudioServer.mb_get_bus_volume_db = MethodBind.get("AudioServer", "get_bus_volume_db", 2339986948L)
    Ptrcall.call1[Long, Double](gdext.classes.AudioServer.mb_get_bus_volume_db, livePtr, bus_idx)
  }

  /** AudioServer.set_bus_volume_linear */
  final def setBusVolumeLinear(bus_idx: Long, volume_linear: Double): Unit = {
    if (gdext.classes.AudioServer.mb_set_bus_volume_linear == null) gdext.classes.AudioServer.mb_set_bus_volume_linear = MethodBind.get("AudioServer", "set_bus_volume_linear", 1602489585L)
    Ptrcall.callVoid2(gdext.classes.AudioServer.mb_set_bus_volume_linear, livePtr, bus_idx, volume_linear)
  }

  /** AudioServer.get_bus_volume_linear */
  final def getBusVolumeLinear(bus_idx: Long): Double = {
    if (gdext.classes.AudioServer.mb_get_bus_volume_linear == null) gdext.classes.AudioServer.mb_get_bus_volume_linear = MethodBind.get("AudioServer", "get_bus_volume_linear", 2339986948L)
    Ptrcall.call1[Long, Double](gdext.classes.AudioServer.mb_get_bus_volume_linear, livePtr, bus_idx)
  }

  /** AudioServer.set_bus_send */
  final def setBusSend(bus_idx: Long, send: gdext.builtin.StringName): Unit = {
    if (gdext.classes.AudioServer.mb_set_bus_send == null) gdext.classes.AudioServer.mb_set_bus_send = MethodBind.get("AudioServer", "set_bus_send", 3780747571L)
    Ptrcall.callVoid2(gdext.classes.AudioServer.mb_set_bus_send, livePtr, bus_idx, send)
  }

  /** AudioServer.get_bus_send */
  final def getBusSend(bus_idx: Long): gdext.builtin.StringName = {
    if (gdext.classes.AudioServer.mb_get_bus_send == null) gdext.classes.AudioServer.mb_get_bus_send = MethodBind.get("AudioServer", "get_bus_send", 659327637L)
    Ptrcall.call1[Long, gdext.builtin.StringName](gdext.classes.AudioServer.mb_get_bus_send, livePtr, bus_idx)
  }

  /** AudioServer.set_bus_solo */
  final def setBusSolo(bus_idx: Long, enable: Boolean): Unit = {
    if (gdext.classes.AudioServer.mb_set_bus_solo == null) gdext.classes.AudioServer.mb_set_bus_solo = MethodBind.get("AudioServer", "set_bus_solo", 300928843L)
    Ptrcall.callVoid2(gdext.classes.AudioServer.mb_set_bus_solo, livePtr, bus_idx, enable)
  }

  /** AudioServer.is_bus_solo */
  final def isBusSolo(bus_idx: Long): Boolean = {
    if (gdext.classes.AudioServer.mb_is_bus_solo == null) gdext.classes.AudioServer.mb_is_bus_solo = MethodBind.get("AudioServer", "is_bus_solo", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.AudioServer.mb_is_bus_solo, livePtr, bus_idx)
  }

  /** AudioServer.set_bus_mute */
  final def setBusMute(bus_idx: Long, enable: Boolean): Unit = {
    if (gdext.classes.AudioServer.mb_set_bus_mute == null) gdext.classes.AudioServer.mb_set_bus_mute = MethodBind.get("AudioServer", "set_bus_mute", 300928843L)
    Ptrcall.callVoid2(gdext.classes.AudioServer.mb_set_bus_mute, livePtr, bus_idx, enable)
  }

  /** AudioServer.is_bus_mute */
  final def isBusMute(bus_idx: Long): Boolean = {
    if (gdext.classes.AudioServer.mb_is_bus_mute == null) gdext.classes.AudioServer.mb_is_bus_mute = MethodBind.get("AudioServer", "is_bus_mute", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.AudioServer.mb_is_bus_mute, livePtr, bus_idx)
  }

  /** AudioServer.set_bus_bypass_effects */
  final def setBusBypassEffects(bus_idx: Long, enable: Boolean): Unit = {
    if (gdext.classes.AudioServer.mb_set_bus_bypass_effects == null) gdext.classes.AudioServer.mb_set_bus_bypass_effects = MethodBind.get("AudioServer", "set_bus_bypass_effects", 300928843L)
    Ptrcall.callVoid2(gdext.classes.AudioServer.mb_set_bus_bypass_effects, livePtr, bus_idx, enable)
  }

  /** AudioServer.is_bus_bypassing_effects */
  final def isBusBypassingEffects(bus_idx: Long): Boolean = {
    if (gdext.classes.AudioServer.mb_is_bus_bypassing_effects == null) gdext.classes.AudioServer.mb_is_bus_bypassing_effects = MethodBind.get("AudioServer", "is_bus_bypassing_effects", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.AudioServer.mb_is_bus_bypassing_effects, livePtr, bus_idx)
  }

  /** AudioServer.add_bus_effect */
  final def addBusEffect(bus_idx: Long, effect: AudioEffect, at_position: Long): Unit = {
    if (gdext.classes.AudioServer.mb_add_bus_effect == null) gdext.classes.AudioServer.mb_add_bus_effect = MethodBind.get("AudioServer", "add_bus_effect", 4068819785L)
    Ptrcall.callVoid3(gdext.classes.AudioServer.mb_add_bus_effect, livePtr, bus_idx, Wrappers.handle(effect), at_position)
  }

  /** AudioServer.remove_bus_effect */
  final def removeBusEffect(bus_idx: Long, effect_idx: Long): Unit = {
    if (gdext.classes.AudioServer.mb_remove_bus_effect == null) gdext.classes.AudioServer.mb_remove_bus_effect = MethodBind.get("AudioServer", "remove_bus_effect", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.AudioServer.mb_remove_bus_effect, livePtr, bus_idx, effect_idx)
  }

  /** AudioServer.get_bus_effect_count */
  final def getBusEffectCount(bus_idx: Long): Long = {
    if (gdext.classes.AudioServer.mb_get_bus_effect_count == null) gdext.classes.AudioServer.mb_get_bus_effect_count = MethodBind.get("AudioServer", "get_bus_effect_count", 3744713108L)
    Ptrcall.call1[Long, Long](gdext.classes.AudioServer.mb_get_bus_effect_count, livePtr, bus_idx)
  }

  /** AudioServer.get_bus_effect. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getBusEffect(bus_idx: Long, effect_idx: Long): AudioEffect = {
    if (gdext.classes.AudioServer.mb_get_bus_effect == null) gdext.classes.AudioServer.mb_get_bus_effect = MethodBind.get("AudioServer", "get_bus_effect", 726064442L)
    Wrappers.owned[AudioEffect](Ptrcall.call2[Long, Long, Long](gdext.classes.AudioServer.mb_get_bus_effect, livePtr, bus_idx, effect_idx))
  }

  /** AudioServer.get_bus_effect_instance. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getBusEffectInstance(bus_idx: Long, effect_idx: Long, channel: Long): AudioEffectInstance = {
    if (gdext.classes.AudioServer.mb_get_bus_effect_instance == null) gdext.classes.AudioServer.mb_get_bus_effect_instance = MethodBind.get("AudioServer", "get_bus_effect_instance", 1829771234L)
    Wrappers.owned[AudioEffectInstance](Ptrcall.call3[Long, Long, Long, Long](gdext.classes.AudioServer.mb_get_bus_effect_instance, livePtr, bus_idx, effect_idx, channel))
  }

  /** AudioServer.swap_bus_effects */
  final def swapBusEffects(bus_idx: Long, effect_idx: Long, by_effect_idx: Long): Unit = {
    if (gdext.classes.AudioServer.mb_swap_bus_effects == null) gdext.classes.AudioServer.mb_swap_bus_effects = MethodBind.get("AudioServer", "swap_bus_effects", 1649997291L)
    Ptrcall.callVoid3(gdext.classes.AudioServer.mb_swap_bus_effects, livePtr, bus_idx, effect_idx, by_effect_idx)
  }

  /** AudioServer.set_bus_effect_enabled */
  final def setBusEffectEnabled(bus_idx: Long, effect_idx: Long, enabled: Boolean): Unit = {
    if (gdext.classes.AudioServer.mb_set_bus_effect_enabled == null) gdext.classes.AudioServer.mb_set_bus_effect_enabled = MethodBind.get("AudioServer", "set_bus_effect_enabled", 1383440665L)
    Ptrcall.callVoid3(gdext.classes.AudioServer.mb_set_bus_effect_enabled, livePtr, bus_idx, effect_idx, enabled)
  }

  /** AudioServer.is_bus_effect_enabled */
  final def isBusEffectEnabled(bus_idx: Long, effect_idx: Long): Boolean = {
    if (gdext.classes.AudioServer.mb_is_bus_effect_enabled == null) gdext.classes.AudioServer.mb_is_bus_effect_enabled = MethodBind.get("AudioServer", "is_bus_effect_enabled", 2522259332L)
    Ptrcall.call2[Long, Long, Boolean](gdext.classes.AudioServer.mb_is_bus_effect_enabled, livePtr, bus_idx, effect_idx)
  }

  /** AudioServer.get_bus_peak_volume_left_db */
  final def getBusPeakVolumeLeftDb(bus_idx: Long, channel: Long): Double = {
    if (gdext.classes.AudioServer.mb_get_bus_peak_volume_left_db == null) gdext.classes.AudioServer.mb_get_bus_peak_volume_left_db = MethodBind.get("AudioServer", "get_bus_peak_volume_left_db", 3085491603L)
    Ptrcall.call2[Long, Long, Double](gdext.classes.AudioServer.mb_get_bus_peak_volume_left_db, livePtr, bus_idx, channel)
  }

  /** AudioServer.get_bus_peak_volume_right_db */
  final def getBusPeakVolumeRightDb(bus_idx: Long, channel: Long): Double = {
    if (gdext.classes.AudioServer.mb_get_bus_peak_volume_right_db == null) gdext.classes.AudioServer.mb_get_bus_peak_volume_right_db = MethodBind.get("AudioServer", "get_bus_peak_volume_right_db", 3085491603L)
    Ptrcall.call2[Long, Long, Double](gdext.classes.AudioServer.mb_get_bus_peak_volume_right_db, livePtr, bus_idx, channel)
  }

  /** AudioServer.set_playback_speed_scale */
  final def setPlaybackSpeedScale(scale: Double): Unit = {
    if (gdext.classes.AudioServer.mb_set_playback_speed_scale == null) gdext.classes.AudioServer.mb_set_playback_speed_scale = MethodBind.get("AudioServer", "set_playback_speed_scale", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioServer.mb_set_playback_speed_scale, livePtr, scale)
  }

  /** AudioServer.get_playback_speed_scale */
  final def getPlaybackSpeedScale(): Double = {
    if (gdext.classes.AudioServer.mb_get_playback_speed_scale == null) gdext.classes.AudioServer.mb_get_playback_speed_scale = MethodBind.get("AudioServer", "get_playback_speed_scale", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioServer.mb_get_playback_speed_scale, livePtr)
  }

  /** AudioServer.lock */
  final def lock(): Unit = {
    if (gdext.classes.AudioServer.mb_lock == null) gdext.classes.AudioServer.mb_lock = MethodBind.get("AudioServer", "lock", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.AudioServer.mb_lock, livePtr)
  }

  /** AudioServer.unlock */
  final def unlock(): Unit = {
    if (gdext.classes.AudioServer.mb_unlock == null) gdext.classes.AudioServer.mb_unlock = MethodBind.get("AudioServer", "unlock", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.AudioServer.mb_unlock, livePtr)
  }

  /** AudioServer.get_speaker_mode */
  final def getSpeakerMode(): Long = {
    if (gdext.classes.AudioServer.mb_get_speaker_mode == null) gdext.classes.AudioServer.mb_get_speaker_mode = MethodBind.get("AudioServer", "get_speaker_mode", 2549190337L)
    Ptrcall.call0[Long](gdext.classes.AudioServer.mb_get_speaker_mode, livePtr)
  }

  /** AudioServer.get_mix_rate */
  final def getMixRate(): Double = {
    if (gdext.classes.AudioServer.mb_get_mix_rate == null) gdext.classes.AudioServer.mb_get_mix_rate = MethodBind.get("AudioServer", "get_mix_rate", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioServer.mb_get_mix_rate, livePtr)
  }

  /** AudioServer.get_input_mix_rate */
  final def getInputMixRate(): Double = {
    if (gdext.classes.AudioServer.mb_get_input_mix_rate == null) gdext.classes.AudioServer.mb_get_input_mix_rate = MethodBind.get("AudioServer", "get_input_mix_rate", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioServer.mb_get_input_mix_rate, livePtr)
  }

  /** AudioServer.get_driver_name */
  final def getDriverName(): String = {
    if (gdext.classes.AudioServer.mb_get_driver_name == null) gdext.classes.AudioServer.mb_get_driver_name = MethodBind.get("AudioServer", "get_driver_name", 201670096L)
    Ptrcall.call0[String](gdext.classes.AudioServer.mb_get_driver_name, livePtr)
  }

  /** AudioServer.get_output_device */
  final def getOutputDevice(): String = {
    if (gdext.classes.AudioServer.mb_get_output_device == null) gdext.classes.AudioServer.mb_get_output_device = MethodBind.get("AudioServer", "get_output_device", 2841200299L)
    Ptrcall.call0[String](gdext.classes.AudioServer.mb_get_output_device, livePtr)
  }

  /** AudioServer.set_output_device */
  final def setOutputDevice(name: String): Unit = {
    if (gdext.classes.AudioServer.mb_set_output_device == null) gdext.classes.AudioServer.mb_set_output_device = MethodBind.get("AudioServer", "set_output_device", 83702148L)
    Ptrcall.callVoid1(gdext.classes.AudioServer.mb_set_output_device, livePtr, name)
  }

  /** AudioServer.get_time_to_next_mix */
  final def getTimeToNextMix(): Double = {
    if (gdext.classes.AudioServer.mb_get_time_to_next_mix == null) gdext.classes.AudioServer.mb_get_time_to_next_mix = MethodBind.get("AudioServer", "get_time_to_next_mix", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioServer.mb_get_time_to_next_mix, livePtr)
  }

  /** AudioServer.get_time_since_last_mix */
  final def getTimeSinceLastMix(): Double = {
    if (gdext.classes.AudioServer.mb_get_time_since_last_mix == null) gdext.classes.AudioServer.mb_get_time_since_last_mix = MethodBind.get("AudioServer", "get_time_since_last_mix", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioServer.mb_get_time_since_last_mix, livePtr)
  }

  /** AudioServer.get_output_latency */
  final def getOutputLatency(): Double = {
    if (gdext.classes.AudioServer.mb_get_output_latency == null) gdext.classes.AudioServer.mb_get_output_latency = MethodBind.get("AudioServer", "get_output_latency", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioServer.mb_get_output_latency, livePtr)
  }

  /** AudioServer.get_input_device */
  final def getInputDevice(): String = {
    if (gdext.classes.AudioServer.mb_get_input_device == null) gdext.classes.AudioServer.mb_get_input_device = MethodBind.get("AudioServer", "get_input_device", 2841200299L)
    Ptrcall.call0[String](gdext.classes.AudioServer.mb_get_input_device, livePtr)
  }

  /** AudioServer.set_input_device */
  final def setInputDevice(name: String): Unit = {
    if (gdext.classes.AudioServer.mb_set_input_device == null) gdext.classes.AudioServer.mb_set_input_device = MethodBind.get("AudioServer", "set_input_device", 83702148L)
    Ptrcall.callVoid1(gdext.classes.AudioServer.mb_set_input_device, livePtr, name)
  }

  /** AudioServer.set_input_device_active */
  final def setInputDeviceActive(active: Boolean): Long = {
    if (gdext.classes.AudioServer.mb_set_input_device_active == null) gdext.classes.AudioServer.mb_set_input_device_active = MethodBind.get("AudioServer", "set_input_device_active", 1413768114L)
    Ptrcall.call1[Boolean, Long](gdext.classes.AudioServer.mb_set_input_device_active, livePtr, active)
  }

  /** AudioServer.get_input_frames_available */
  final def getInputFramesAvailable(): Long = {
    if (gdext.classes.AudioServer.mb_get_input_frames_available == null) gdext.classes.AudioServer.mb_get_input_frames_available = MethodBind.get("AudioServer", "get_input_frames_available", 2455072627L)
    Ptrcall.call0[Long](gdext.classes.AudioServer.mb_get_input_frames_available, livePtr)
  }

  /** AudioServer.get_input_buffer_length_frames */
  final def getInputBufferLengthFrames(): Long = {
    if (gdext.classes.AudioServer.mb_get_input_buffer_length_frames == null) gdext.classes.AudioServer.mb_get_input_buffer_length_frames = MethodBind.get("AudioServer", "get_input_buffer_length_frames", 2455072627L)
    Ptrcall.call0[Long](gdext.classes.AudioServer.mb_get_input_buffer_length_frames, livePtr)
  }

  /** AudioServer.set_bus_layout */
  final def setBusLayout(bus_layout: AudioBusLayout): Unit = {
    if (gdext.classes.AudioServer.mb_set_bus_layout == null) gdext.classes.AudioServer.mb_set_bus_layout = MethodBind.get("AudioServer", "set_bus_layout", 3319058824L)
    Ptrcall.callVoid1(gdext.classes.AudioServer.mb_set_bus_layout, livePtr, Wrappers.handle(bus_layout))
  }

  /** AudioServer.generate_bus_layout. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def generateBusLayout(): AudioBusLayout = {
    if (gdext.classes.AudioServer.mb_generate_bus_layout == null) gdext.classes.AudioServer.mb_generate_bus_layout = MethodBind.get("AudioServer", "generate_bus_layout", 3769973890L)
    Wrappers.owned[AudioBusLayout](Ptrcall.call0[Long](gdext.classes.AudioServer.mb_generate_bus_layout, livePtr))
  }

  /** AudioServer.set_enable_tagging_used_audio_streams */
  final def setEnableTaggingUsedAudioStreams(enable: Boolean): Unit = {
    if (gdext.classes.AudioServer.mb_set_enable_tagging_used_audio_streams == null) gdext.classes.AudioServer.mb_set_enable_tagging_used_audio_streams = MethodBind.get("AudioServer", "set_enable_tagging_used_audio_streams", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.AudioServer.mb_set_enable_tagging_used_audio_streams, livePtr, enable)
  }

  /** AudioServer.is_stream_registered_as_sample */
  final def isStreamRegisteredAsSample(stream: AudioStream): Boolean = {
    if (gdext.classes.AudioServer.mb_is_stream_registered_as_sample == null) gdext.classes.AudioServer.mb_is_stream_registered_as_sample = MethodBind.get("AudioServer", "is_stream_registered_as_sample", 500225754L)
    Ptrcall.call1[GodotObject, Boolean](gdext.classes.AudioServer.mb_is_stream_registered_as_sample, livePtr, Wrappers.handle(stream))
  }

  /** AudioServer.register_stream_as_sample */
  final def registerStreamAsSample(stream: AudioStream): Unit = {
    if (gdext.classes.AudioServer.mb_register_stream_as_sample == null) gdext.classes.AudioServer.mb_register_stream_as_sample = MethodBind.get("AudioServer", "register_stream_as_sample", 2210767741L)
    Ptrcall.callVoid1(gdext.classes.AudioServer.mb_register_stream_as_sample, livePtr, Wrappers.handle(stream))
  }

}

object AudioServer {
  private[classes] var mb_set_bus_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bus_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_bus: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_bus: GDExtensionMethodBindPtr = null
  private[classes] var mb_move_bus: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bus_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bus_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bus_index: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bus_channels: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bus_volume_db: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bus_volume_db: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bus_volume_linear: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bus_volume_linear: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bus_send: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bus_send: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bus_solo: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_bus_solo: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bus_mute: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_bus_mute: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bus_bypass_effects: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_bus_bypassing_effects: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_bus_effect: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_bus_effect: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bus_effect_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bus_effect: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bus_effect_instance: GDExtensionMethodBindPtr = null
  private[classes] var mb_swap_bus_effects: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bus_effect_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_bus_effect_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bus_peak_volume_left_db: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bus_peak_volume_right_db: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_playback_speed_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_playback_speed_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_lock: GDExtensionMethodBindPtr = null
  private[classes] var mb_unlock: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_speaker_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_mix_rate: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_input_mix_rate: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_driver_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_output_device: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_output_device: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_time_to_next_mix: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_time_since_last_mix: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_output_latency: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_input_device: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_input_device: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_input_device_active: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_input_frames_available: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_input_buffer_length_frames: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bus_layout: GDExtensionMethodBindPtr = null
  private[classes] var mb_generate_bus_layout: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_enable_tagging_used_audio_streams: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_stream_registered_as_sample: GDExtensionMethodBindPtr = null
  private[classes] var mb_register_stream_as_sample: GDExtensionMethodBindPtr = null

  private var instance: AudioServer = null

  /** The process-global AudioServer singleton instance. */
  def singleton: AudioServer = {
    if (instance == null)
      instance = Wrappers.borrowed[AudioServer](GodotObject.fromPtr(
        Godot.interface.global_get_singleton(StringNames.cached("AudioServer").ptr)))
    instance
  }
}
