package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `DTLSServer`, extends `RefCounted`. */
abstract class DTLSServer extends RefCounted {
  override def godotClassName: String = "DTLSServer"

  /** DTLSServer.setup */
  final def setup(server_options: TLSOptions): Long =
    Ptrcall.call1[GodotObject, Long](MethodBind.get("DTLSServer", "setup", 1262296096L), hostObject.objectPtr, server_options.hostObject)

  /** DTLSServer.take_connection */
  final def takeConnection(udp_peer: PacketPeerUDP): GodotObject =
    Ptrcall.call1[GodotObject, GodotObject](MethodBind.get("DTLSServer", "take_connection", 3946580474L), hostObject.objectPtr, udp_peer.hostObject)

}
