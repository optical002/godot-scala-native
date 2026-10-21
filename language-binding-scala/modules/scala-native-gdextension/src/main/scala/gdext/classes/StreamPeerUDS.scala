package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `StreamPeerUDS`, extends `StreamPeerSocket`. */
abstract class StreamPeerUDS extends StreamPeerSocket {
  override def godotClassName: String = "StreamPeerUDS"

  /** StreamPeerUDS.bind */
  final def bind(path: String): Long = {
    if (gdext.classes.StreamPeerUDS.mb_bind == null) gdext.classes.StreamPeerUDS.mb_bind = MethodBind.get("StreamPeerUDS", "bind", 166001499L)
    Ptrcall.call1[String, Long](gdext.classes.StreamPeerUDS.mb_bind, livePtr, path)
  }

  /** StreamPeerUDS.connect_to_host */
  final def connectToHost(path: String): Long = {
    if (gdext.classes.StreamPeerUDS.mb_connect_to_host == null) gdext.classes.StreamPeerUDS.mb_connect_to_host = MethodBind.get("StreamPeerUDS", "connect_to_host", 166001499L)
    Ptrcall.call1[String, Long](gdext.classes.StreamPeerUDS.mb_connect_to_host, livePtr, path)
  }

  /** StreamPeerUDS.get_connected_path */
  final def getConnectedPath(): String = {
    if (gdext.classes.StreamPeerUDS.mb_get_connected_path == null) gdext.classes.StreamPeerUDS.mb_get_connected_path = MethodBind.get("StreamPeerUDS", "get_connected_path", 201670096L)
    Ptrcall.call0[String](gdext.classes.StreamPeerUDS.mb_get_connected_path, livePtr)
  }

}

object StreamPeerUDS {
  private[classes] var mb_bind: GDExtensionMethodBindPtr = null
  private[classes] var mb_connect_to_host: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_connected_path: GDExtensionMethodBindPtr = null
}
