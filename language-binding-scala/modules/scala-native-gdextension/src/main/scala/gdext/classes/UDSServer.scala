package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `UDSServer`, extends `SocketServer`. */
abstract class UDSServer extends SocketServer {
  override def godotClassName: String = "UDSServer"

  /** UDSServer.listen */
  final def listen(path: String): Long =
    Ptrcall.call1[String, Long](MethodBind.get("UDSServer", "listen", 166001499L), hostObject.objectPtr, path)

  /** UDSServer.take_connection */
  final def takeConnection(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("UDSServer", "take_connection", 1623851112L), hostObject.objectPtr)

}
