package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `StreamPeerGZIP`, extends `StreamPeer`. */
abstract class StreamPeerGZIP extends StreamPeer {

  /** StreamPeerGZIP.start_compression */
  final def startCompression(use_deflate: Boolean, buffer_size: Long): Long =
    Ptrcall.call2[Boolean, Long, Long](MethodBind.get("StreamPeerGZIP", "start_compression", 781582770L), hostObject.objectPtr, use_deflate, buffer_size)

  /** StreamPeerGZIP.start_decompression */
  final def startDecompression(use_deflate: Boolean, buffer_size: Long): Long =
    Ptrcall.call2[Boolean, Long, Long](MethodBind.get("StreamPeerGZIP", "start_decompression", 781582770L), hostObject.objectPtr, use_deflate, buffer_size)

  /** StreamPeerGZIP.finish */
  final def finish(): Long =
    Ptrcall.call0[Long](MethodBind.get("StreamPeerGZIP", "finish", 166280745L), hostObject.objectPtr)

  /** StreamPeerGZIP.clear */
  final def clear(): Unit =
    Ptrcall.callVoid0(MethodBind.get("StreamPeerGZIP", "clear", 3218959716L), hostObject.objectPtr)

}

object StreamPeerGZIP {
  /** Class metadata for Gd[StreamPeerGZIP] lifetime management and casting. */
  given GodotClass[StreamPeerGZIP] with {
    def className = "StreamPeerGZIP"
    def isRefCounted = true
    def wrap(o: GodotObject): StreamPeerGZIP = new StreamPeerGZIP {}.withHost(o.objectPtr)
    def unwrap(t: StreamPeerGZIP): GodotObject = t.hostObject
  }
}
