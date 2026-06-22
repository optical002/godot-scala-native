package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `StreamPeerUDS`, extends `StreamPeerSocket`. */
abstract class StreamPeerUDS extends StreamPeerSocket {

  /** StreamPeerUDS.bind */
  final def bind(path: String): Long =
    Ptrcall.call1[String, Long](MethodBind.get("StreamPeerUDS", "bind", 166001499L), hostObject.objectPtr, path)

  /** StreamPeerUDS.connect_to_host */
  final def connectToHost(path: String): Long =
    Ptrcall.call1[String, Long](MethodBind.get("StreamPeerUDS", "connect_to_host", 166001499L), hostObject.objectPtr, path)

  /** StreamPeerUDS.get_connected_path */
  final def getConnectedPath(): String =
    Ptrcall.call0[String](MethodBind.get("StreamPeerUDS", "get_connected_path", 201670096L), hostObject.objectPtr)

}

object StreamPeerUDS {
  /** Class metadata for Gd[StreamPeerUDS] lifetime management and casting. */
  given GodotClass[StreamPeerUDS] with {
    def className = "StreamPeerUDS"
    def isRefCounted = true
    def wrap(o: GodotObject): StreamPeerUDS = new StreamPeerUDS {}.withHost(o.objectPtr)
    def unwrap(t: StreamPeerUDS): GodotObject = t.hostObject
  }
}
