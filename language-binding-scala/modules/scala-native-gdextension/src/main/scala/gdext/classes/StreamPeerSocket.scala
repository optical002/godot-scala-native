package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `StreamPeerSocket`, extends `StreamPeer`. */
abstract class StreamPeerSocket extends StreamPeer {
  override def godotClassName: String = "StreamPeerSocket"

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
