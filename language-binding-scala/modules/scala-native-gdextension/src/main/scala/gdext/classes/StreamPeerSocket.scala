package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `StreamPeerSocket`, extends `StreamPeer`. */
abstract class StreamPeerSocket extends StreamPeer {

  /** StreamPeerSocket.poll */
  final def poll(): Long =
    Ptrcall.call0[Long](MethodBind.get("StreamPeerSocket", "poll", 166280745L), hostObject.objectPtr)

  /** StreamPeerSocket.get_status */
  final def getStatus(): Long =
    Ptrcall.call0[Long](MethodBind.get("StreamPeerSocket", "get_status", 1156122502L), hostObject.objectPtr)

  /** StreamPeerSocket.disconnect_from_host */
  final def disconnectFromHost(): Unit =
    Ptrcall.callVoid0(MethodBind.get("StreamPeerSocket", "disconnect_from_host", 3218959716L), hostObject.objectPtr)

}

object StreamPeerSocket {
  /** Class metadata for Gd[StreamPeerSocket] lifetime management and casting. */
  given GodotClass[StreamPeerSocket] with {
    def className = "StreamPeerSocket"
    def isRefCounted = true
    def wrap(o: GodotObject): StreamPeerSocket = new StreamPeerSocket {}.withHost(o.objectPtr)
    def unwrap(t: StreamPeerSocket): GodotObject = t.hostObject
  }
}
