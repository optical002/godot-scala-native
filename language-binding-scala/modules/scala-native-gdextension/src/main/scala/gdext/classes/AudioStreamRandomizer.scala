package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AudioStreamRandomizer`, extends `AudioStream`. */
abstract class AudioStreamRandomizer extends AudioStream {
  override def godotClassName: String = "AudioStreamRandomizer"

  /** AudioStreamRandomizer.add_stream */
  final def addStream(index: Long, stream: AudioStream, weight: Double): Unit = {
    if (gdext.classes.AudioStreamRandomizer.mb_add_stream == null) gdext.classes.AudioStreamRandomizer.mb_add_stream = MethodBind.get("AudioStreamRandomizer", "add_stream", 1892018854L)
    Ptrcall.callVoid3(gdext.classes.AudioStreamRandomizer.mb_add_stream, livePtr, index, Wrappers.handle(stream), weight)
  }

  /** AudioStreamRandomizer.move_stream */
  final def moveStream(index_from: Long, index_to: Long): Unit = {
    if (gdext.classes.AudioStreamRandomizer.mb_move_stream == null) gdext.classes.AudioStreamRandomizer.mb_move_stream = MethodBind.get("AudioStreamRandomizer", "move_stream", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.AudioStreamRandomizer.mb_move_stream, livePtr, index_from, index_to)
  }

  /** AudioStreamRandomizer.remove_stream */
  final def removeStream(index: Long): Unit = {
    if (gdext.classes.AudioStreamRandomizer.mb_remove_stream == null) gdext.classes.AudioStreamRandomizer.mb_remove_stream = MethodBind.get("AudioStreamRandomizer", "remove_stream", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamRandomizer.mb_remove_stream, livePtr, index)
  }

  /** AudioStreamRandomizer.set_stream */
  final def setStream(index: Long, stream: AudioStream): Unit = {
    if (gdext.classes.AudioStreamRandomizer.mb_set_stream == null) gdext.classes.AudioStreamRandomizer.mb_set_stream = MethodBind.get("AudioStreamRandomizer", "set_stream", 111075094L)
    Ptrcall.callVoid2(gdext.classes.AudioStreamRandomizer.mb_set_stream, livePtr, index, Wrappers.handle(stream))
  }

  /** AudioStreamRandomizer.get_stream. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getStream(index: Long): AudioStream = {
    if (gdext.classes.AudioStreamRandomizer.mb_get_stream == null) gdext.classes.AudioStreamRandomizer.mb_get_stream = MethodBind.get("AudioStreamRandomizer", "get_stream", 2739380747L)
    Wrappers.owned[AudioStream](Ptrcall.call1[Long, Long](gdext.classes.AudioStreamRandomizer.mb_get_stream, livePtr, index))
  }

  /** AudioStreamRandomizer.set_stream_probability_weight */
  final def setStreamProbabilityWeight(index: Long, weight: Double): Unit = {
    if (gdext.classes.AudioStreamRandomizer.mb_set_stream_probability_weight == null) gdext.classes.AudioStreamRandomizer.mb_set_stream_probability_weight = MethodBind.get("AudioStreamRandomizer", "set_stream_probability_weight", 1602489585L)
    Ptrcall.callVoid2(gdext.classes.AudioStreamRandomizer.mb_set_stream_probability_weight, livePtr, index, weight)
  }

  /** AudioStreamRandomizer.get_stream_probability_weight */
  final def getStreamProbabilityWeight(index: Long): Double = {
    if (gdext.classes.AudioStreamRandomizer.mb_get_stream_probability_weight == null) gdext.classes.AudioStreamRandomizer.mb_get_stream_probability_weight = MethodBind.get("AudioStreamRandomizer", "get_stream_probability_weight", 2339986948L)
    Ptrcall.call1[Long, Double](gdext.classes.AudioStreamRandomizer.mb_get_stream_probability_weight, livePtr, index)
  }

  /** AudioStreamRandomizer.set_streams_count */
  final def setStreamsCount(count: Long): Unit = {
    if (gdext.classes.AudioStreamRandomizer.mb_set_streams_count == null) gdext.classes.AudioStreamRandomizer.mb_set_streams_count = MethodBind.get("AudioStreamRandomizer", "set_streams_count", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamRandomizer.mb_set_streams_count, livePtr, count)
  }

  /** AudioStreamRandomizer.get_streams_count */
  final def getStreamsCount(): Long = {
    if (gdext.classes.AudioStreamRandomizer.mb_get_streams_count == null) gdext.classes.AudioStreamRandomizer.mb_get_streams_count = MethodBind.get("AudioStreamRandomizer", "get_streams_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.AudioStreamRandomizer.mb_get_streams_count, livePtr)
  }

  /** AudioStreamRandomizer.set_random_pitch */
  final def setRandomPitch(scale: Double): Unit = {
    if (gdext.classes.AudioStreamRandomizer.mb_set_random_pitch == null) gdext.classes.AudioStreamRandomizer.mb_set_random_pitch = MethodBind.get("AudioStreamRandomizer", "set_random_pitch", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamRandomizer.mb_set_random_pitch, livePtr, scale)
  }

  /** AudioStreamRandomizer.get_random_pitch */
  final def getRandomPitch(): Double = {
    if (gdext.classes.AudioStreamRandomizer.mb_get_random_pitch == null) gdext.classes.AudioStreamRandomizer.mb_get_random_pitch = MethodBind.get("AudioStreamRandomizer", "get_random_pitch", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioStreamRandomizer.mb_get_random_pitch, livePtr)
  }

  /** AudioStreamRandomizer.set_random_pitch_semitones */
  final def setRandomPitchSemitones(semitones: Double): Unit = {
    if (gdext.classes.AudioStreamRandomizer.mb_set_random_pitch_semitones == null) gdext.classes.AudioStreamRandomizer.mb_set_random_pitch_semitones = MethodBind.get("AudioStreamRandomizer", "set_random_pitch_semitones", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamRandomizer.mb_set_random_pitch_semitones, livePtr, semitones)
  }

  /** AudioStreamRandomizer.get_random_pitch_semitones */
  final def getRandomPitchSemitones(): Double = {
    if (gdext.classes.AudioStreamRandomizer.mb_get_random_pitch_semitones == null) gdext.classes.AudioStreamRandomizer.mb_get_random_pitch_semitones = MethodBind.get("AudioStreamRandomizer", "get_random_pitch_semitones", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioStreamRandomizer.mb_get_random_pitch_semitones, livePtr)
  }

  /** AudioStreamRandomizer.set_random_volume_offset_db */
  final def setRandomVolumeOffsetDb(db_offset: Double): Unit = {
    if (gdext.classes.AudioStreamRandomizer.mb_set_random_volume_offset_db == null) gdext.classes.AudioStreamRandomizer.mb_set_random_volume_offset_db = MethodBind.get("AudioStreamRandomizer", "set_random_volume_offset_db", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamRandomizer.mb_set_random_volume_offset_db, livePtr, db_offset)
  }

  /** AudioStreamRandomizer.get_random_volume_offset_db */
  final def getRandomVolumeOffsetDb(): Double = {
    if (gdext.classes.AudioStreamRandomizer.mb_get_random_volume_offset_db == null) gdext.classes.AudioStreamRandomizer.mb_get_random_volume_offset_db = MethodBind.get("AudioStreamRandomizer", "get_random_volume_offset_db", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioStreamRandomizer.mb_get_random_volume_offset_db, livePtr)
  }

  /** AudioStreamRandomizer.set_playback_mode */
  final def setPlaybackMode(mode: Long): Unit = {
    if (gdext.classes.AudioStreamRandomizer.mb_set_playback_mode == null) gdext.classes.AudioStreamRandomizer.mb_set_playback_mode = MethodBind.get("AudioStreamRandomizer", "set_playback_mode", 3950967023L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamRandomizer.mb_set_playback_mode, livePtr, mode)
  }

  /** AudioStreamRandomizer.get_playback_mode */
  final def getPlaybackMode(): Long = {
    if (gdext.classes.AudioStreamRandomizer.mb_get_playback_mode == null) gdext.classes.AudioStreamRandomizer.mb_get_playback_mode = MethodBind.get("AudioStreamRandomizer", "get_playback_mode", 3943055077L)
    Ptrcall.call0[Long](gdext.classes.AudioStreamRandomizer.mb_get_playback_mode, livePtr)
  }

}

object AudioStreamRandomizer {
  private[classes] var mb_add_stream: GDExtensionMethodBindPtr = null
  private[classes] var mb_move_stream: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_stream: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_stream: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_stream: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_stream_probability_weight: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_stream_probability_weight: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_streams_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_streams_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_random_pitch: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_random_pitch: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_random_pitch_semitones: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_random_pitch_semitones: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_random_volume_offset_db: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_random_volume_offset_db: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_playback_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_playback_mode: GDExtensionMethodBindPtr = null
}
