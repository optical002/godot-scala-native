package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `StreamPeerSocket`, extends `StreamPeer`. */
abstract class StreamPeerSocket extends StreamPeer {
  override def godotClassName: String = "StreamPeerSocket"

  /** StreamPeerSocket.poll */
  final def poll(): Long = {
    if (gdext.classes.StreamPeerSocket.mb_poll == null) gdext.classes.StreamPeerSocket.mb_poll = MethodBind.get("StreamPeerSocket", "poll", 166280745L)
    Ptrcall.call0[Long](gdext.classes.StreamPeerSocket.mb_poll, livePtr)
  }

  /** StreamPeerSocket.get_status */
  final def getStatus(): Long = {
    if (gdext.classes.StreamPeerSocket.mb_get_status == null) gdext.classes.StreamPeerSocket.mb_get_status = MethodBind.get("StreamPeerSocket", "get_status", 1156122502L)
    Ptrcall.call0[Long](gdext.classes.StreamPeerSocket.mb_get_status, livePtr)
  }

  /** StreamPeerSocket.disconnect_from_host */
  final def disconnectFromHost(): Unit = {
    if (gdext.classes.StreamPeerSocket.mb_disconnect_from_host == null) gdext.classes.StreamPeerSocket.mb_disconnect_from_host = MethodBind.get("StreamPeerSocket", "disconnect_from_host", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.StreamPeerSocket.mb_disconnect_from_host, livePtr)
  }

}

object StreamPeerSocket {
  private[classes] var mb_poll: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_status: GDExtensionMethodBindPtr = null
  private[classes] var mb_disconnect_from_host: GDExtensionMethodBindPtr = null
}
