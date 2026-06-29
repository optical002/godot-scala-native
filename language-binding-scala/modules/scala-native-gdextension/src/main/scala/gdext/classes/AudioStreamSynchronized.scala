package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioStreamSynchronized`, extends `AudioStream`. */
abstract class AudioStreamSynchronized extends AudioStream {
  override def godotClassName: String = "AudioStreamSynchronized"

  /** AudioStreamSynchronized.set_stream_count */
  final def setStreamCount(stream_count: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamSynchronized", "set_stream_count", 1286410249L), hostObject.objectPtr, stream_count)

  /** AudioStreamSynchronized.get_stream_count */
  final def getStreamCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("AudioStreamSynchronized", "get_stream_count", 3905245786L), hostObject.objectPtr)

  /** AudioStreamSynchronized.set_sync_stream */
  final def setSyncStream(stream_index: Long, audio_stream: AudioStream): Unit =
    Ptrcall.callVoid2(MethodBind.get("AudioStreamSynchronized", "set_sync_stream", 111075094L), hostObject.objectPtr, stream_index, audio_stream.hostObject)

  /** AudioStreamSynchronized.get_sync_stream */
  final def getSyncStream(stream_index: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("AudioStreamSynchronized", "get_sync_stream", 2739380747L), hostObject.objectPtr, stream_index)

  /** AudioStreamSynchronized.set_sync_stream_volume */
  final def setSyncStreamVolume(stream_index: Long, volume_db: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("AudioStreamSynchronized", "set_sync_stream_volume", 1602489585L), hostObject.objectPtr, stream_index, volume_db)

  /** AudioStreamSynchronized.get_sync_stream_volume */
  final def getSyncStreamVolume(stream_index: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("AudioStreamSynchronized", "get_sync_stream_volume", 2339986948L), hostObject.objectPtr, stream_index)

}
