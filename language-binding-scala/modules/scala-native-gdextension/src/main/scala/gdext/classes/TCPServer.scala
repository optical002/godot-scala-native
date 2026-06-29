package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `TCPServer`, extends `SocketServer`. */
abstract class TCPServer extends SocketServer {
  override def godotClassName: String = "TCPServer"

  /** TCPServer.listen */
  final def listen(port: Long, bind_address: String): Long =
    Ptrcall.call2[Long, String, Long](MethodBind.get("TCPServer", "listen", 3167955072L), hostObject.objectPtr, port, bind_address)

  /** TCPServer.get_local_port */
  final def getLocalPort(): Long =
    Ptrcall.call0[Long](MethodBind.get("TCPServer", "get_local_port", 3905245786L), hostObject.objectPtr)

  /** TCPServer.take_connection */
  final def takeConnection(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("TCPServer", "take_connection", 30545006L), hostObject.objectPtr)

}
