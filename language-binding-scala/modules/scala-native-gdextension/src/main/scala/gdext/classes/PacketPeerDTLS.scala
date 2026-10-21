package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `PacketPeerDTLS`, extends `PacketPeer`. */
abstract class PacketPeerDTLS extends PacketPeer {
  override def godotClassName: String = "PacketPeerDTLS"

  /** PacketPeerDTLS.poll */
  final def poll(): Unit = {
    if (gdext.classes.PacketPeerDTLS.mb_poll == null) gdext.classes.PacketPeerDTLS.mb_poll = MethodBind.get("PacketPeerDTLS", "poll", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.PacketPeerDTLS.mb_poll, livePtr)
  }

  /** PacketPeerDTLS.connect_to_peer */
  final def connectToPeer(packet_peer: PacketPeerUDP, hostname: String, client_options: TLSOptions): Long = {
    if (gdext.classes.PacketPeerDTLS.mb_connect_to_peer == null) gdext.classes.PacketPeerDTLS.mb_connect_to_peer = MethodBind.get("PacketPeerDTLS", "connect_to_peer", 2880188099L)
    Ptrcall.call3[GodotObject, String, GodotObject, Long](gdext.classes.PacketPeerDTLS.mb_connect_to_peer, livePtr, Wrappers.handle(packet_peer), hostname, Wrappers.handle(client_options))
  }

  /** PacketPeerDTLS.get_status */
  final def getStatus(): Long = {
    if (gdext.classes.PacketPeerDTLS.mb_get_status == null) gdext.classes.PacketPeerDTLS.mb_get_status = MethodBind.get("PacketPeerDTLS", "get_status", 3248654679L)
    Ptrcall.call0[Long](gdext.classes.PacketPeerDTLS.mb_get_status, livePtr)
  }

  /** PacketPeerDTLS.disconnect_from_peer */
  final def disconnectFromPeer(): Unit = {
    if (gdext.classes.PacketPeerDTLS.mb_disconnect_from_peer == null) gdext.classes.PacketPeerDTLS.mb_disconnect_from_peer = MethodBind.get("PacketPeerDTLS", "disconnect_from_peer", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.PacketPeerDTLS.mb_disconnect_from_peer, livePtr)
  }

}

object PacketPeerDTLS {
  private[classes] var mb_poll: GDExtensionMethodBindPtr = null
  private[classes] var mb_connect_to_peer: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_status: GDExtensionMethodBindPtr = null
  private[classes] var mb_disconnect_from_peer: GDExtensionMethodBindPtr = null
}
