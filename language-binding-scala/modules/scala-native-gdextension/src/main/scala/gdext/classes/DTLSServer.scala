package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `DTLSServer`, extends `RefCounted`. */
abstract class DTLSServer extends RefCounted {
  override def godotClassName: String = "DTLSServer"

  /** DTLSServer.setup */
  final def setup(server_options: TLSOptions): Long = {
    if (gdext.classes.DTLSServer.mb_setup == null) gdext.classes.DTLSServer.mb_setup = MethodBind.get("DTLSServer", "setup", 1262296096L)
    Ptrcall.call1[GodotObject, Long](gdext.classes.DTLSServer.mb_setup, livePtr, Wrappers.handle(server_options))
  }

  /** DTLSServer.take_connection. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def takeConnection(udp_peer: PacketPeerUDP): PacketPeerDTLS = {
    if (gdext.classes.DTLSServer.mb_take_connection == null) gdext.classes.DTLSServer.mb_take_connection = MethodBind.get("DTLSServer", "take_connection", 3946580474L)
    Wrappers.owned[PacketPeerDTLS](Ptrcall.call1[GodotObject, Long](gdext.classes.DTLSServer.mb_take_connection, livePtr, Wrappers.handle(udp_peer)))
  }

}

object DTLSServer {
  private[classes] var mb_setup: GDExtensionMethodBindPtr = null
  private[classes] var mb_take_connection: GDExtensionMethodBindPtr = null
}
