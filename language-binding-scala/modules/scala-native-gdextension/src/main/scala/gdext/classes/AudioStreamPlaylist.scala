package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioStreamPlaylist`, extends `AudioStream`. */
abstract class AudioStreamPlaylist extends AudioStream {

  /** AudioStreamPlaylist.set_stream_count */
  final def setStreamCount(stream_count: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamPlaylist", "set_stream_count", 1286410249L), hostObject.objectPtr, stream_count)

  /** AudioStreamPlaylist.get_stream_count */
  final def getStreamCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("AudioStreamPlaylist", "get_stream_count", 3905245786L), hostObject.objectPtr)

  /** AudioStreamPlaylist.get_bpm */
  final def getBpm(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioStreamPlaylist", "get_bpm", 1740695150L), hostObject.objectPtr)

  /** AudioStreamPlaylist.set_list_stream */
  final def setListStream(stream_index: Long, audio_stream: AudioStream): Unit =
    Ptrcall.callVoid2(MethodBind.get("AudioStreamPlaylist", "set_list_stream", 111075094L), hostObject.objectPtr, stream_index, audio_stream.hostObject)

  /** AudioStreamPlaylist.get_list_stream */
  final def getListStream(stream_index: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("AudioStreamPlaylist", "get_list_stream", 2739380747L), hostObject.objectPtr, stream_index)

  /** AudioStreamPlaylist.set_shuffle */
  final def setShuffle(shuffle: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamPlaylist", "set_shuffle", 2586408642L), hostObject.objectPtr, shuffle)

  /** AudioStreamPlaylist.get_shuffle */
  final def getShuffle(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AudioStreamPlaylist", "get_shuffle", 36873697L), hostObject.objectPtr)

  /** AudioStreamPlaylist.set_fade_time */
  final def setFadeTime(dec: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamPlaylist", "set_fade_time", 373806689L), hostObject.objectPtr, dec)

  /** AudioStreamPlaylist.get_fade_time */
  final def getFadeTime(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioStreamPlaylist", "get_fade_time", 1740695150L), hostObject.objectPtr)

  /** AudioStreamPlaylist.set_loop */
  final def setLoop(loop: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamPlaylist", "set_loop", 2586408642L), hostObject.objectPtr, loop)

  /** AudioStreamPlaylist.has_loop */
  final def hasLoop(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AudioStreamPlaylist", "has_loop", 36873697L), hostObject.objectPtr)

}

object AudioStreamPlaylist {
  /** Class metadata for Gd[AudioStreamPlaylist] lifetime management and casting. */
  given GodotClass[AudioStreamPlaylist] with {
    def className = "AudioStreamPlaylist"
    def isRefCounted = true
    def wrap(o: GodotObject): AudioStreamPlaylist = new AudioStreamPlaylist {}.withHost(o.objectPtr)
    def unwrap(t: AudioStreamPlaylist): GodotObject = t.hostObject
  }
}
