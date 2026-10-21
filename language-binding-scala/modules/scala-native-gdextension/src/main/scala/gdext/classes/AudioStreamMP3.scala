package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AudioStreamMP3`, extends `AudioStream`. */
abstract class AudioStreamMP3 extends AudioStream {
  override def godotClassName: String = "AudioStreamMP3"

  /** AudioStreamMP3.set_loop */
  final def setLoop(enable: Boolean): Unit = {
    if (gdext.classes.AudioStreamMP3.mb_set_loop == null) gdext.classes.AudioStreamMP3.mb_set_loop = MethodBind.get("AudioStreamMP3", "set_loop", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamMP3.mb_set_loop, livePtr, enable)
  }

  /** AudioStreamMP3.has_loop */
  final def hasLoop(): Boolean = {
    if (gdext.classes.AudioStreamMP3.mb_has_loop == null) gdext.classes.AudioStreamMP3.mb_has_loop = MethodBind.get("AudioStreamMP3", "has_loop", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.AudioStreamMP3.mb_has_loop, livePtr)
  }

  /** AudioStreamMP3.set_loop_offset */
  final def setLoopOffset(seconds: Double): Unit = {
    if (gdext.classes.AudioStreamMP3.mb_set_loop_offset == null) gdext.classes.AudioStreamMP3.mb_set_loop_offset = MethodBind.get("AudioStreamMP3", "set_loop_offset", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamMP3.mb_set_loop_offset, livePtr, seconds)
  }

  /** AudioStreamMP3.get_loop_offset */
  final def getLoopOffset(): Double = {
    if (gdext.classes.AudioStreamMP3.mb_get_loop_offset == null) gdext.classes.AudioStreamMP3.mb_get_loop_offset = MethodBind.get("AudioStreamMP3", "get_loop_offset", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioStreamMP3.mb_get_loop_offset, livePtr)
  }

  /** AudioStreamMP3.set_bpm */
  final def setBpm(bpm: Double): Unit = {
    if (gdext.classes.AudioStreamMP3.mb_set_bpm == null) gdext.classes.AudioStreamMP3.mb_set_bpm = MethodBind.get("AudioStreamMP3", "set_bpm", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamMP3.mb_set_bpm, livePtr, bpm)
  }

  /** AudioStreamMP3.get_bpm */
  final def getBpm(): Double = {
    if (gdext.classes.AudioStreamMP3.mb_get_bpm == null) gdext.classes.AudioStreamMP3.mb_get_bpm = MethodBind.get("AudioStreamMP3", "get_bpm", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioStreamMP3.mb_get_bpm, livePtr)
  }

  /** AudioStreamMP3.set_beat_count */
  final def setBeatCount(count: Long): Unit = {
    if (gdext.classes.AudioStreamMP3.mb_set_beat_count == null) gdext.classes.AudioStreamMP3.mb_set_beat_count = MethodBind.get("AudioStreamMP3", "set_beat_count", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamMP3.mb_set_beat_count, livePtr, count)
  }

  /** AudioStreamMP3.get_beat_count */
  final def getBeatCount(): Long = {
    if (gdext.classes.AudioStreamMP3.mb_get_beat_count == null) gdext.classes.AudioStreamMP3.mb_get_beat_count = MethodBind.get("AudioStreamMP3", "get_beat_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.AudioStreamMP3.mb_get_beat_count, livePtr)
  }

  /** AudioStreamMP3.set_bar_beats */
  final def setBarBeats(count: Long): Unit = {
    if (gdext.classes.AudioStreamMP3.mb_set_bar_beats == null) gdext.classes.AudioStreamMP3.mb_set_bar_beats = MethodBind.get("AudioStreamMP3", "set_bar_beats", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamMP3.mb_set_bar_beats, livePtr, count)
  }

  /** AudioStreamMP3.get_bar_beats */
  final def getBarBeats(): Long = {
    if (gdext.classes.AudioStreamMP3.mb_get_bar_beats == null) gdext.classes.AudioStreamMP3.mb_get_bar_beats = MethodBind.get("AudioStreamMP3", "get_bar_beats", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.AudioStreamMP3.mb_get_bar_beats, livePtr)
  }

}

object AudioStreamMP3 {
  private[classes] var mb_load_from_file: GDExtensionMethodBindPtr = null
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

  /** AudioStreamMP3.load_from_file. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def loadFromFile(path: String): AudioStreamMP3 = {
    if (gdext.classes.AudioStreamMP3.mb_load_from_file == null) gdext.classes.AudioStreamMP3.mb_load_from_file = MethodBind.get("AudioStreamMP3", "load_from_file", 4238362998L)
    Wrappers.owned[AudioStreamMP3](Ptrcall.call1[String, Long](gdext.classes.AudioStreamMP3.mb_load_from_file, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr], path))
  }
}
