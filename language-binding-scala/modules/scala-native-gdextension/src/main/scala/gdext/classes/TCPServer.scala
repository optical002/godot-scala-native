package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `TCPServer`, extends `SocketServer`. */
abstract class TCPServer extends SocketServer {
  override def godotClassName: String = "TCPServer"

  /** TCPServer.listen */
  final def listen(port: Long, bindAddress: String = "*"): gdext.classes.Error = {
    if (gdext.classes.TCPServer.mb_listen == null) gdext.classes.TCPServer.mb_listen = MethodBind.get("TCPServer", "listen", 3167955072L)
    gdext.classes.Error(Ptrcall.call2[Long, String, Long](gdext.classes.TCPServer.mb_listen, livePtr, port, bindAddress))
  }

  /** TCPServer.get_local_port */
  final def getLocalPort(): Long = {
    if (gdext.classes.TCPServer.mb_get_local_port == null) gdext.classes.TCPServer.mb_get_local_port = MethodBind.get("TCPServer", "get_local_port", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.TCPServer.mb_get_local_port, livePtr)
  }

  /** TCPServer.take_connection. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def takeConnection(): StreamPeerTCP = {
    if (gdext.classes.TCPServer.mb_take_connection == null) gdext.classes.TCPServer.mb_take_connection = MethodBind.get("TCPServer", "take_connection", 30545006L)
    Wrappers.owned[StreamPeerTCP](Ptrcall.call0[Long](gdext.classes.TCPServer.mb_take_connection, livePtr))
  }

}

object TCPServer {
  private[classes] var mb_listen: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_local_port: GDExtensionMethodBindPtr = null
  private[classes] var mb_take_connection: GDExtensionMethodBindPtr = null
}
