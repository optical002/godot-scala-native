package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AudioStreamPlaylist`, extends `AudioStream`. */
abstract class AudioStreamPlaylist extends AudioStream {
  override def godotClassName: String = "AudioStreamPlaylist"

  /** AudioStreamPlaylist.set_stream_count */
  final def setStreamCount(stream_count: Long): Unit = {
    if (gdext.classes.AudioStreamPlaylist.mb_set_stream_count == null) gdext.classes.AudioStreamPlaylist.mb_set_stream_count = MethodBind.get("AudioStreamPlaylist", "set_stream_count", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamPlaylist.mb_set_stream_count, livePtr, stream_count)
  }

  /** AudioStreamPlaylist.get_stream_count */
  final def getStreamCount(): Long = {
    if (gdext.classes.AudioStreamPlaylist.mb_get_stream_count == null) gdext.classes.AudioStreamPlaylist.mb_get_stream_count = MethodBind.get("AudioStreamPlaylist", "get_stream_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.AudioStreamPlaylist.mb_get_stream_count, livePtr)
  }

  /** AudioStreamPlaylist.get_bpm */
  final def getBpm(): Double = {
    if (gdext.classes.AudioStreamPlaylist.mb_get_bpm == null) gdext.classes.AudioStreamPlaylist.mb_get_bpm = MethodBind.get("AudioStreamPlaylist", "get_bpm", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioStreamPlaylist.mb_get_bpm, livePtr)
  }

  /** AudioStreamPlaylist.set_list_stream */
  final def setListStream(stream_index: Long, audio_stream: AudioStream): Unit = {
    if (gdext.classes.AudioStreamPlaylist.mb_set_list_stream == null) gdext.classes.AudioStreamPlaylist.mb_set_list_stream = MethodBind.get("AudioStreamPlaylist", "set_list_stream", 111075094L)
    Ptrcall.callVoid2(gdext.classes.AudioStreamPlaylist.mb_set_list_stream, livePtr, stream_index, Wrappers.handle(audio_stream))
  }

  /** AudioStreamPlaylist.get_list_stream. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getListStream(stream_index: Long): AudioStream = {
    if (gdext.classes.AudioStreamPlaylist.mb_get_list_stream == null) gdext.classes.AudioStreamPlaylist.mb_get_list_stream = MethodBind.get("AudioStreamPlaylist", "get_list_stream", 2739380747L)
    Wrappers.owned[AudioStream](Ptrcall.call1[Long, Long](gdext.classes.AudioStreamPlaylist.mb_get_list_stream, livePtr, stream_index))
  }

  /** AudioStreamPlaylist.set_shuffle */
  final def setShuffle(shuffle: Boolean): Unit = {
    if (gdext.classes.AudioStreamPlaylist.mb_set_shuffle == null) gdext.classes.AudioStreamPlaylist.mb_set_shuffle = MethodBind.get("AudioStreamPlaylist", "set_shuffle", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamPlaylist.mb_set_shuffle, livePtr, shuffle)
  }

  /** AudioStreamPlaylist.get_shuffle */
  final def getShuffle(): Boolean = {
    if (gdext.classes.AudioStreamPlaylist.mb_get_shuffle == null) gdext.classes.AudioStreamPlaylist.mb_get_shuffle = MethodBind.get("AudioStreamPlaylist", "get_shuffle", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.AudioStreamPlaylist.mb_get_shuffle, livePtr)
  }

  /** AudioStreamPlaylist.set_fade_time */
  final def setFadeTime(dec: Double): Unit = {
    if (gdext.classes.AudioStreamPlaylist.mb_set_fade_time == null) gdext.classes.AudioStreamPlaylist.mb_set_fade_time = MethodBind.get("AudioStreamPlaylist", "set_fade_time", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamPlaylist.mb_set_fade_time, livePtr, dec)
  }

  /** AudioStreamPlaylist.get_fade_time */
  final def getFadeTime(): Double = {
    if (gdext.classes.AudioStreamPlaylist.mb_get_fade_time == null) gdext.classes.AudioStreamPlaylist.mb_get_fade_time = MethodBind.get("AudioStreamPlaylist", "get_fade_time", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioStreamPlaylist.mb_get_fade_time, livePtr)
  }

  /** AudioStreamPlaylist.set_loop */
  final def setLoop(loop: Boolean): Unit = {
    if (gdext.classes.AudioStreamPlaylist.mb_set_loop == null) gdext.classes.AudioStreamPlaylist.mb_set_loop = MethodBind.get("AudioStreamPlaylist", "set_loop", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamPlaylist.mb_set_loop, livePtr, loop)
  }

  /** AudioStreamPlaylist.has_loop */
  final def hasLoop(): Boolean = {
    if (gdext.classes.AudioStreamPlaylist.mb_has_loop == null) gdext.classes.AudioStreamPlaylist.mb_has_loop = MethodBind.get("AudioStreamPlaylist", "has_loop", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.AudioStreamPlaylist.mb_has_loop, livePtr)
  }

}

object AudioStreamPlaylist {
  private[classes] var mb_set_stream_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_stream_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bpm: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_list_stream: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_list_stream: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_shuffle: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_shuffle: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_fade_time: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fade_time: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_loop: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_loop: GDExtensionMethodBindPtr = null
}
