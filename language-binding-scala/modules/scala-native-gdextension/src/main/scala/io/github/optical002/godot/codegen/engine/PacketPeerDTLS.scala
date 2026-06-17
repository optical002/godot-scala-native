package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `PacketPeerDTLS`, extends `PacketPeer`. */
abstract class PacketPeerDTLS extends PacketPeer {

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

object PacketPeerDTLS {
  /** Class metadata for Gd[PacketPeerDTLS] lifetime management and casting. */
  given GodotClass[PacketPeerDTLS] with {
    def className = "PacketPeerDTLS"
    def isRefCounted = true
    def wrap(o: GodotObject): PacketPeerDTLS = new PacketPeerDTLS {}.withHost(o.objectPtr)
    def unwrap(t: PacketPeerDTLS): GodotObject = t.hostObject
  }
}
