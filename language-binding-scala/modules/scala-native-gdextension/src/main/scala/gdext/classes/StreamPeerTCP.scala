package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `StreamPeerTCP`, extends `StreamPeerSocket`. */
abstract class StreamPeerTCP extends StreamPeerSocket {
  override def godotClassName: String = "StreamPeerTCP"

  /** StreamPeerTCP.bind */
  final def bind(port: Long, host: String = "*"): gdext.classes.Error = {
    if (gdext.classes.StreamPeerTCP.mb_bind == null) gdext.classes.StreamPeerTCP.mb_bind = MethodBind.get("StreamPeerTCP", "bind", 3167955072L)
    gdext.classes.Error(Ptrcall.call2[Long, String, Long](gdext.classes.StreamPeerTCP.mb_bind, livePtr, port, host))
  }

  /** StreamPeerTCP.connect_to_host */
  final def connectToHost(host: String, port: Long): gdext.classes.Error = {
    if (gdext.classes.StreamPeerTCP.mb_connect_to_host == null) gdext.classes.StreamPeerTCP.mb_connect_to_host = MethodBind.get("StreamPeerTCP", "connect_to_host", 993915709L)
    gdext.classes.Error(Ptrcall.call2[String, Long, Long](gdext.classes.StreamPeerTCP.mb_connect_to_host, livePtr, host, port))
  }

  /** StreamPeerTCP.get_connected_host */
  final def getConnectedHost(): String = {
    if (gdext.classes.StreamPeerTCP.mb_get_connected_host == null) gdext.classes.StreamPeerTCP.mb_get_connected_host = MethodBind.get("StreamPeerTCP", "get_connected_host", 201670096L)
    Ptrcall.call0[String](gdext.classes.StreamPeerTCP.mb_get_connected_host, livePtr)
  }

  /** StreamPeerTCP.get_connected_port */
  final def getConnectedPort(): Long = {
    if (gdext.classes.StreamPeerTCP.mb_get_connected_port == null) gdext.classes.StreamPeerTCP.mb_get_connected_port = MethodBind.get("StreamPeerTCP", "get_connected_port", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.StreamPeerTCP.mb_get_connected_port, livePtr)
  }

  /** StreamPeerTCP.get_local_port */
  final def getLocalPort(): Long = {
    if (gdext.classes.StreamPeerTCP.mb_get_local_port == null) gdext.classes.StreamPeerTCP.mb_get_local_port = MethodBind.get("StreamPeerTCP", "get_local_port", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.StreamPeerTCP.mb_get_local_port, livePtr)
  }

  /** StreamPeerTCP.set_no_delay */
  final def setNoDelay(enabled: Boolean): Unit = {
    if (gdext.classes.StreamPeerTCP.mb_set_no_delay == null) gdext.classes.StreamPeerTCP.mb_set_no_delay = MethodBind.get("StreamPeerTCP", "set_no_delay", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.StreamPeerTCP.mb_set_no_delay, livePtr, enabled)
  }

}

object StreamPeerTCP {
  private[classes] var mb_bind: GDExtensionMethodBindPtr = null
  private[classes] var mb_connect_to_host: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_connected_host: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_connected_port: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_local_port: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_no_delay: GDExtensionMethodBindPtr = null
}
