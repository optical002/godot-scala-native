package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `PacketPeerDTLS`, extends `PacketPeer`. */
abstract class PacketPeerDTLS extends PacketPeer {
  override def godotClassName: String = "PacketPeerDTLS"

  /** PacketPeerDTLS.poll */
  final def poll(): Unit =
    Ptrcall.callVoid0(MethodBind.get("PacketPeerDTLS", "poll", 3218959716L), hostObject.objectPtr)

  /** PacketPeerDTLS.connect_to_peer */
  final def connectToPeer(packet_peer: PacketPeerUDP, hostname: String, client_options: TLSOptions): Long =
    Ptrcall.call3[GodotObject, String, GodotObject, Long](MethodBind.get("PacketPeerDTLS", "connect_to_peer", 2880188099L), hostObject.objectPtr, packet_peer.hostObject, hostname, client_options.hostObject)

  /** PacketPeerDTLS.get_status */
  final def getStatus(): Long =
    Ptrcall.call0[Long](MethodBind.get("PacketPeerDTLS", "get_status", 3248654679L), hostObject.objectPtr)

  /** PacketPeerDTLS.disconnect_from_peer */
  final def disconnectFromPeer(): Unit =
    Ptrcall.callVoid0(MethodBind.get("PacketPeerDTLS", "disconnect_from_peer", 3218959716L), hostObject.objectPtr)

}
