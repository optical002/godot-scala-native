package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioServer`, extends `Object`. */
abstract class AudioServer extends Object {

  /** AudioServer.set_bus_count */
  final def setBusCount(amount: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioServer", "set_bus_count", 1286410249L), hostObject.objectPtr, amount)

  /** AudioServer.get_bus_count */
  final def getBusCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("AudioServer", "get_bus_count", 3905245786L), hostObject.objectPtr)

  /** AudioServer.remove_bus */
  final def removeBus(index: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioServer", "remove_bus", 1286410249L), hostObject.objectPtr, index)

  /** AudioServer.add_bus */
  final def addBus(at_position: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioServer", "add_bus", 1025054187L), hostObject.objectPtr, at_position)

  /** AudioServer.move_bus */
  final def moveBus(index: Long, to_index: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("AudioServer", "move_bus", 3937882851L), hostObject.objectPtr, index, to_index)

  /** AudioServer.set_bus_name */
  final def setBusName(bus_idx: Long, name: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("AudioServer", "set_bus_name", 501894301L), hostObject.objectPtr, bus_idx, name)

  /** AudioServer.get_bus_name */
  final def getBusName(bus_idx: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("AudioServer", "get_bus_name", 844755477L), hostObject.objectPtr, bus_idx)

  /** AudioServer.get_bus_index */
  final def getBusIndex(bus_name: gdext.builtin.StringName): Long =
    Ptrcall.call1[gdext.builtin.StringName, Long](MethodBind.get("AudioServer", "get_bus_index", 2458036349L), hostObject.objectPtr, bus_name)

  /** AudioServer.get_bus_channels */
  final def getBusChannels(bus_idx: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("AudioServer", "get_bus_channels", 923996154L), hostObject.objectPtr, bus_idx)

  /** AudioServer.set_bus_volume_db */
  final def setBusVolumeDb(bus_idx: Long, volume_db: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("AudioServer", "set_bus_volume_db", 1602489585L), hostObject.objectPtr, bus_idx, volume_db)

  /** AudioServer.get_bus_volume_db */
  final def getBusVolumeDb(bus_idx: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("AudioServer", "get_bus_volume_db", 2339986948L), hostObject.objectPtr, bus_idx)

  /** AudioServer.set_bus_volume_linear */
  final def setBusVolumeLinear(bus_idx: Long, volume_linear: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("AudioServer", "set_bus_volume_linear", 1602489585L), hostObject.objectPtr, bus_idx, volume_linear)

  /** AudioServer.get_bus_volume_linear */
  final def getBusVolumeLinear(bus_idx: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("AudioServer", "get_bus_volume_linear", 2339986948L), hostObject.objectPtr, bus_idx)

  /** AudioServer.set_bus_send */
  final def setBusSend(bus_idx: Long, send: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid2(MethodBind.get("AudioServer", "set_bus_send", 3780747571L), hostObject.objectPtr, bus_idx, send)

  /** AudioServer.get_bus_send */
  final def getBusSend(bus_idx: Long): gdext.builtin.StringName =
    Ptrcall.call1[Long, gdext.builtin.StringName](MethodBind.get("AudioServer", "get_bus_send", 659327637L), hostObject.objectPtr, bus_idx)

  /** AudioServer.set_bus_solo */
  final def setBusSolo(bus_idx: Long, enable: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("AudioServer", "set_bus_solo", 300928843L), hostObject.objectPtr, bus_idx, enable)

  /** AudioServer.is_bus_solo */
  final def isBusSolo(bus_idx: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("AudioServer", "is_bus_solo", 1116898809L), hostObject.objectPtr, bus_idx)

  /** AudioServer.set_bus_mute */
  final def setBusMute(bus_idx: Long, enable: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("AudioServer", "set_bus_mute", 300928843L), hostObject.objectPtr, bus_idx, enable)

  /** AudioServer.is_bus_mute */
  final def isBusMute(bus_idx: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("AudioServer", "is_bus_mute", 1116898809L), hostObject.objectPtr, bus_idx)

  /** AudioServer.set_bus_bypass_effects */
  final def setBusBypassEffects(bus_idx: Long, enable: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("AudioServer", "set_bus_bypass_effects", 300928843L), hostObject.objectPtr, bus_idx, enable)

  /** AudioServer.is_bus_bypassing_effects */
  final def isBusBypassingEffects(bus_idx: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("AudioServer", "is_bus_bypassing_effects", 1116898809L), hostObject.objectPtr, bus_idx)

  /** AudioServer.add_bus_effect */
  final def addBusEffect(bus_idx: Long, effect: AudioEffect, at_position: Long): Unit =
    Ptrcall.callVoid3(MethodBind.get("AudioServer", "add_bus_effect", 4068819785L), hostObject.objectPtr, bus_idx, effect.hostObject, at_position)

  /** AudioServer.remove_bus_effect */
  final def removeBusEffect(bus_idx: Long, effect_idx: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("AudioServer", "remove_bus_effect", 3937882851L), hostObject.objectPtr, bus_idx, effect_idx)

  /** AudioServer.get_bus_effect_count */
  final def getBusEffectCount(bus_idx: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("AudioServer", "get_bus_effect_count", 3744713108L), hostObject.objectPtr, bus_idx)

  /** AudioServer.get_bus_effect */
  final def getBusEffect(bus_idx: Long, effect_idx: Long): GodotObject =
    Ptrcall.call2[Long, Long, GodotObject](MethodBind.get("AudioServer", "get_bus_effect", 726064442L), hostObject.objectPtr, bus_idx, effect_idx)

  /** AudioServer.get_bus_effect_instance */
  final def getBusEffectInstance(bus_idx: Long, effect_idx: Long, channel: Long): GodotObject =
    Ptrcall.call3[Long, Long, Long, GodotObject](MethodBind.get("AudioServer", "get_bus_effect_instance", 1829771234L), hostObject.objectPtr, bus_idx, effect_idx, channel)

  /** AudioServer.swap_bus_effects */
  final def swapBusEffects(bus_idx: Long, effect_idx: Long, by_effect_idx: Long): Unit =
    Ptrcall.callVoid3(MethodBind.get("AudioServer", "swap_bus_effects", 1649997291L), hostObject.objectPtr, bus_idx, effect_idx, by_effect_idx)

  /** AudioServer.set_bus_effect_enabled */
  final def setBusEffectEnabled(bus_idx: Long, effect_idx: Long, enabled: Boolean): Unit =
    Ptrcall.callVoid3(MethodBind.get("AudioServer", "set_bus_effect_enabled", 1383440665L), hostObject.objectPtr, bus_idx, effect_idx, enabled)

  /** AudioServer.is_bus_effect_enabled */
  final def isBusEffectEnabled(bus_idx: Long, effect_idx: Long): Boolean =
    Ptrcall.call2[Long, Long, Boolean](MethodBind.get("AudioServer", "is_bus_effect_enabled", 2522259332L), hostObject.objectPtr, bus_idx, effect_idx)

  /** AudioServer.get_bus_peak_volume_left_db */
  final def getBusPeakVolumeLeftDb(bus_idx: Long, channel: Long): Double =
    Ptrcall.call2[Long, Long, Double](MethodBind.get("AudioServer", "get_bus_peak_volume_left_db", 3085491603L), hostObject.objectPtr, bus_idx, channel)

  /** AudioServer.get_bus_peak_volume_right_db */
  final def getBusPeakVolumeRightDb(bus_idx: Long, channel: Long): Double =
    Ptrcall.call2[Long, Long, Double](MethodBind.get("AudioServer", "get_bus_peak_volume_right_db", 3085491603L), hostObject.objectPtr, bus_idx, channel)

  /** AudioServer.set_playback_speed_scale */
  final def setPlaybackSpeedScale(scale: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioServer", "set_playback_speed_scale", 373806689L), hostObject.objectPtr, scale)

  /** AudioServer.get_playback_speed_scale */
  final def getPlaybackSpeedScale(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioServer", "get_playback_speed_scale", 1740695150L), hostObject.objectPtr)

  /** AudioServer.lock */
  final def lock(): Unit =
    Ptrcall.callVoid0(MethodBind.get("AudioServer", "lock", 3218959716L), hostObject.objectPtr)

  /** AudioServer.unlock */
  final def unlock(): Unit =
    Ptrcall.callVoid0(MethodBind.get("AudioServer", "unlock", 3218959716L), hostObject.objectPtr)

  /** AudioServer.get_speaker_mode */
  final def getSpeakerMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("AudioServer", "get_speaker_mode", 2549190337L), hostObject.objectPtr)

  /** AudioServer.get_mix_rate */
  final def getMixRate(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioServer", "get_mix_rate", 1740695150L), hostObject.objectPtr)

  /** AudioServer.get_input_mix_rate */
  final def getInputMixRate(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioServer", "get_input_mix_rate", 1740695150L), hostObject.objectPtr)

  /** AudioServer.get_driver_name */
  final def getDriverName(): String =
    Ptrcall.call0[String](MethodBind.get("AudioServer", "get_driver_name", 201670096L), hostObject.objectPtr)

  /** AudioServer.get_output_device */
  final def getOutputDevice(): String =
    Ptrcall.call0[String](MethodBind.get("AudioServer", "get_output_device", 2841200299L), hostObject.objectPtr)

  /** AudioServer.set_output_device */
  final def setOutputDevice(name: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioServer", "set_output_device", 83702148L), hostObject.objectPtr, name)

  /** AudioServer.get_time_to_next_mix */
  final def getTimeToNextMix(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioServer", "get_time_to_next_mix", 1740695150L), hostObject.objectPtr)

  /** AudioServer.get_time_since_last_mix */
  final def getTimeSinceLastMix(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioServer", "get_time_since_last_mix", 1740695150L), hostObject.objectPtr)

  /** AudioServer.get_output_latency */
  final def getOutputLatency(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioServer", "get_output_latency", 1740695150L), hostObject.objectPtr)

  /** AudioServer.get_input_device */
  final def getInputDevice(): String =
    Ptrcall.call0[String](MethodBind.get("AudioServer", "get_input_device", 2841200299L), hostObject.objectPtr)

  /** AudioServer.set_input_device */
  final def setInputDevice(name: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioServer", "set_input_device", 83702148L), hostObject.objectPtr, name)

  /** AudioServer.set_input_device_active */
  final def setInputDeviceActive(active: Boolean): Long =
    Ptrcall.call1[Boolean, Long](MethodBind.get("AudioServer", "set_input_device_active", 1413768114L), hostObject.objectPtr, active)

  /** AudioServer.get_input_frames_available */
  final def getInputFramesAvailable(): Long =
    Ptrcall.call0[Long](MethodBind.get("AudioServer", "get_input_frames_available", 2455072627L), hostObject.objectPtr)

  /** AudioServer.get_input_buffer_length_frames */
  final def getInputBufferLengthFrames(): Long =
    Ptrcall.call0[Long](MethodBind.get("AudioServer", "get_input_buffer_length_frames", 2455072627L), hostObject.objectPtr)

  /** AudioServer.set_bus_layout */
  final def setBusLayout(bus_layout: AudioBusLayout): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioServer", "set_bus_layout", 3319058824L), hostObject.objectPtr, bus_layout.hostObject)

  /** AudioServer.generate_bus_layout */
  final def generateBusLayout(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("AudioServer", "generate_bus_layout", 3769973890L), hostObject.objectPtr)

  /** AudioServer.set_enable_tagging_used_audio_streams */
  final def setEnableTaggingUsedAudioStreams(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioServer", "set_enable_tagging_used_audio_streams", 2586408642L), hostObject.objectPtr, enable)

  /** AudioServer.is_stream_registered_as_sample */
  final def isStreamRegisteredAsSample(stream: AudioStream): Boolean =
    Ptrcall.call1[GodotObject, Boolean](MethodBind.get("AudioServer", "is_stream_registered_as_sample", 500225754L), hostObject.objectPtr, stream.hostObject)

  /** AudioServer.register_stream_as_sample */
  final def registerStreamAsSample(stream: AudioStream): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioServer", "register_stream_as_sample", 2210767741L), hostObject.objectPtr, stream.hostObject)

}

object AudioServer {
  /** Class metadata for Gd[AudioServer] lifetime management and casting. */
  given GodotClass[AudioServer] with {
    def className = "AudioServer"
    def isRefCounted = false
    def wrap(o: GodotObject): AudioServer = new AudioServer {}.withHost(o.objectPtr)
    def unwrap(t: AudioServer): GodotObject = t.hostObject
  }

  /** The process-global AudioServer singleton instance. */
  def singleton: AudioServer = new AudioServer {}
    .withHost(Godot.interface.global_get_singleton(
      StringNames.cached("AudioServer").ptr))
}
