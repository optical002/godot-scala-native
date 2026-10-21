package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AudioStreamSynchronized`, extends `AudioStream`. */
abstract class AudioStreamSynchronized extends AudioStream {
  override def godotClassName: String = "AudioStreamSynchronized"

  /** AudioStreamSynchronized.set_stream_count */
  final def setStreamCount(stream_count: Long): Unit = {
    if (gdext.classes.AudioStreamSynchronized.mb_set_stream_count == null) gdext.classes.AudioStreamSynchronized.mb_set_stream_count = MethodBind.get("AudioStreamSynchronized", "set_stream_count", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamSynchronized.mb_set_stream_count, livePtr, stream_count)
  }

  /** AudioStreamSynchronized.get_stream_count */
  final def getStreamCount(): Long = {
    if (gdext.classes.AudioStreamSynchronized.mb_get_stream_count == null) gdext.classes.AudioStreamSynchronized.mb_get_stream_count = MethodBind.get("AudioStreamSynchronized", "get_stream_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.AudioStreamSynchronized.mb_get_stream_count, livePtr)
  }

  /** AudioStreamSynchronized.set_sync_stream */
  final def setSyncStream(stream_index: Long, audio_stream: AudioStream): Unit = {
    if (gdext.classes.AudioStreamSynchronized.mb_set_sync_stream == null) gdext.classes.AudioStreamSynchronized.mb_set_sync_stream = MethodBind.get("AudioStreamSynchronized", "set_sync_stream", 111075094L)
    Ptrcall.callVoid2(gdext.classes.AudioStreamSynchronized.mb_set_sync_stream, livePtr, stream_index, Wrappers.handle(audio_stream))
  }

  /** AudioStreamSynchronized.get_sync_stream. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getSyncStream(stream_index: Long): AudioStream = {
    if (gdext.classes.AudioStreamSynchronized.mb_get_sync_stream == null) gdext.classes.AudioStreamSynchronized.mb_get_sync_stream = MethodBind.get("AudioStreamSynchronized", "get_sync_stream", 2739380747L)
    Wrappers.owned[AudioStream](Ptrcall.call1[Long, Long](gdext.classes.AudioStreamSynchronized.mb_get_sync_stream, livePtr, stream_index))
  }

  /** AudioStreamSynchronized.set_sync_stream_volume */
  final def setSyncStreamVolume(stream_index: Long, volume_db: Double): Unit = {
    if (gdext.classes.AudioStreamSynchronized.mb_set_sync_stream_volume == null) gdext.classes.AudioStreamSynchronized.mb_set_sync_stream_volume = MethodBind.get("AudioStreamSynchronized", "set_sync_stream_volume", 1602489585L)
    Ptrcall.callVoid2(gdext.classes.AudioStreamSynchronized.mb_set_sync_stream_volume, livePtr, stream_index, volume_db)
  }

  /** AudioStreamSynchronized.get_sync_stream_volume */
  final def getSyncStreamVolume(stream_index: Long): Double = {
    if (gdext.classes.AudioStreamSynchronized.mb_get_sync_stream_volume == null) gdext.classes.AudioStreamSynchronized.mb_get_sync_stream_volume = MethodBind.get("AudioStreamSynchronized", "get_sync_stream_volume", 2339986948L)
    Ptrcall.call1[Long, Double](gdext.classes.AudioStreamSynchronized.mb_get_sync_stream_volume, livePtr, stream_index)
  }

}

object AudioStreamSynchronized {
  private[classes] var mb_set_stream_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_stream_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_sync_stream: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_sync_stream: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_sync_stream_volume: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_sync_stream_volume: GDExtensionMethodBindPtr = null
}
