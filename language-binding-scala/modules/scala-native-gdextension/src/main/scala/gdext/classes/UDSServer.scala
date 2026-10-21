package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `UDSServer`, extends `SocketServer`. */
abstract class UDSServer extends SocketServer {
  override def godotClassName: String = "UDSServer"

  /** UDSServer.listen */
  final def listen(path: String): Long = {
    if (gdext.classes.UDSServer.mb_listen == null) gdext.classes.UDSServer.mb_listen = MethodBind.get("UDSServer", "listen", 166001499L)
    Ptrcall.call1[String, Long](gdext.classes.UDSServer.mb_listen, livePtr, path)
  }

  /** UDSServer.take_connection. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def takeConnection(): StreamPeerUDS = {
    if (gdext.classes.UDSServer.mb_take_connection == null) gdext.classes.UDSServer.mb_take_connection = MethodBind.get("UDSServer", "take_connection", 1623851112L)
    Wrappers.owned[StreamPeerUDS](Ptrcall.call0[Long](gdext.classes.UDSServer.mb_take_connection, livePtr))
  }

}

object UDSServer {
  private[classes] var mb_listen: GDExtensionMethodBindPtr = null
  private[classes] var mb_take_connection: GDExtensionMethodBindPtr = null
}
