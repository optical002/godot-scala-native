package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `StreamPeerUDS`, extends `StreamPeerSocket`. */
abstract class StreamPeerUDS extends StreamPeerSocket {
  override def godotClassName: String = "StreamPeerUDS"

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
