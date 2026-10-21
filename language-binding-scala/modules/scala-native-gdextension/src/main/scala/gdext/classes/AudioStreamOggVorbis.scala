package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AudioStreamOggVorbis`, extends `AudioStream`. */
abstract class AudioStreamOggVorbis extends AudioStream {
  override def godotClassName: String = "AudioStreamOggVorbis"

  /** AudioStreamOggVorbis.set_packet_sequence */
  final def setPacketSequence(packet_sequence: OggPacketSequence): Unit = {
    if (gdext.classes.AudioStreamOggVorbis.mb_set_packet_sequence == null) gdext.classes.AudioStreamOggVorbis.mb_set_packet_sequence = MethodBind.get("AudioStreamOggVorbis", "set_packet_sequence", 438882457L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamOggVorbis.mb_set_packet_sequence, livePtr, Wrappers.handle(packet_sequence))
  }

  /** AudioStreamOggVorbis.get_packet_sequence. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getPacketSequence(): OggPacketSequence = {
    if (gdext.classes.AudioStreamOggVorbis.mb_get_packet_sequence == null) gdext.classes.AudioStreamOggVorbis.mb_get_packet_sequence = MethodBind.get("AudioStreamOggVorbis", "get_packet_sequence", 2801636033L)
    Wrappers.owned[OggPacketSequence](Ptrcall.call0[Long](gdext.classes.AudioStreamOggVorbis.mb_get_packet_sequence, livePtr))
  }

  /** AudioStreamOggVorbis.set_loop */
  final def setLoop(enable: Boolean): Unit = {
    if (gdext.classes.AudioStreamOggVorbis.mb_set_loop == null) gdext.classes.AudioStreamOggVorbis.mb_set_loop = MethodBind.get("AudioStreamOggVorbis", "set_loop", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamOggVorbis.mb_set_loop, livePtr, enable)
  }

  /** AudioStreamOggVorbis.has_loop */
  final def hasLoop(): Boolean = {
    if (gdext.classes.AudioStreamOggVorbis.mb_has_loop == null) gdext.classes.AudioStreamOggVorbis.mb_has_loop = MethodBind.get("AudioStreamOggVorbis", "has_loop", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.AudioStreamOggVorbis.mb_has_loop, livePtr)
  }

  /** AudioStreamOggVorbis.set_loop_offset */
  final def setLoopOffset(seconds: Double): Unit = {
    if (gdext.classes.AudioStreamOggVorbis.mb_set_loop_offset == null) gdext.classes.AudioStreamOggVorbis.mb_set_loop_offset = MethodBind.get("AudioStreamOggVorbis", "set_loop_offset", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamOggVorbis.mb_set_loop_offset, livePtr, seconds)
  }

  /** AudioStreamOggVorbis.get_loop_offset */
  final def getLoopOffset(): Double = {
    if (gdext.classes.AudioStreamOggVorbis.mb_get_loop_offset == null) gdext.classes.AudioStreamOggVorbis.mb_get_loop_offset = MethodBind.get("AudioStreamOggVorbis", "get_loop_offset", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioStreamOggVorbis.mb_get_loop_offset, livePtr)
  }

  /** AudioStreamOggVorbis.set_bpm */
  final def setBpm(bpm: Double): Unit = {
    if (gdext.classes.AudioStreamOggVorbis.mb_set_bpm == null) gdext.classes.AudioStreamOggVorbis.mb_set_bpm = MethodBind.get("AudioStreamOggVorbis", "set_bpm", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamOggVorbis.mb_set_bpm, livePtr, bpm)
  }

  /** AudioStreamOggVorbis.get_bpm */
  final def getBpm(): Double = {
    if (gdext.classes.AudioStreamOggVorbis.mb_get_bpm == null) gdext.classes.AudioStreamOggVorbis.mb_get_bpm = MethodBind.get("AudioStreamOggVorbis", "get_bpm", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioStreamOggVorbis.mb_get_bpm, livePtr)
  }

  /** AudioStreamOggVorbis.set_beat_count */
  final def setBeatCount(count: Long): Unit = {
    if (gdext.classes.AudioStreamOggVorbis.mb_set_beat_count == null) gdext.classes.AudioStreamOggVorbis.mb_set_beat_count = MethodBind.get("AudioStreamOggVorbis", "set_beat_count", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamOggVorbis.mb_set_beat_count, livePtr, count)
  }

  /** AudioStreamOggVorbis.get_beat_count */
  final def getBeatCount(): Long = {
    if (gdext.classes.AudioStreamOggVorbis.mb_get_beat_count == null) gdext.classes.AudioStreamOggVorbis.mb_get_beat_count = MethodBind.get("AudioStreamOggVorbis", "get_beat_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.AudioStreamOggVorbis.mb_get_beat_count, livePtr)
  }

  /** AudioStreamOggVorbis.set_bar_beats */
  final def setBarBeats(count: Long): Unit = {
    if (gdext.classes.AudioStreamOggVorbis.mb_set_bar_beats == null) gdext.classes.AudioStreamOggVorbis.mb_set_bar_beats = MethodBind.get("AudioStreamOggVorbis", "set_bar_beats", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamOggVorbis.mb_set_bar_beats, livePtr, count)
  }

  /** AudioStreamOggVorbis.get_bar_beats */
  final def getBarBeats(): Long = {
    if (gdext.classes.AudioStreamOggVorbis.mb_get_bar_beats == null) gdext.classes.AudioStreamOggVorbis.mb_get_bar_beats = MethodBind.get("AudioStreamOggVorbis", "get_bar_beats", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.AudioStreamOggVorbis.mb_get_bar_beats, livePtr)
  }

}

object AudioStreamOggVorbis {
  private[classes] var mb_load_from_file: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_packet_sequence: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_packet_sequence: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_loop: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_loop: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_loop_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_loop_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bpm: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bpm: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_beat_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_beat_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bar_beats: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bar_beats: GDExtensionMethodBindPtr = null

  /** AudioStreamOggVorbis.load_from_file. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def loadFromFile(path: String): AudioStreamOggVorbis = {
    if (gdext.classes.AudioStreamOggVorbis.mb_load_from_file == null) gdext.classes.AudioStreamOggVorbis.mb_load_from_file = MethodBind.get("AudioStreamOggVorbis", "load_from_file", 797568536L)
    Wrappers.owned[AudioStreamOggVorbis](Ptrcall.call1[String, Long](gdext.classes.AudioStreamOggVorbis.mb_load_from_file, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr], path))
  }
}
