package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `MultiplayerPeer`, extends `PacketPeer`. */
abstract class MultiplayerPeer extends PacketPeer {

  /** MultiplayerPeer.set_transfer_channel */
  final def setTransferChannel(channel: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("MultiplayerPeer", "set_transfer_channel", 1286410249L), hostObject.objectPtr, channel)

  /** MultiplayerPeer.get_transfer_channel */
  final def getTransferChannel(): Long =
    Ptrcall.call0[Long](MethodBind.get("MultiplayerPeer", "get_transfer_channel", 3905245786L), hostObject.objectPtr)

  /** MultiplayerPeer.set_transfer_mode */
  final def setTransferMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("MultiplayerPeer", "set_transfer_mode", 950411049L), hostObject.objectPtr, mode)

  /** MultiplayerPeer.get_transfer_mode */
  final def getTransferMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("MultiplayerPeer", "get_transfer_mode", 3369852622L), hostObject.objectPtr)

  /** MultiplayerPeer.set_target_peer */
  final def setTargetPeer(id: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("MultiplayerPeer", "set_target_peer", 1286410249L), hostObject.objectPtr, id)

  /** MultiplayerPeer.get_packet_peer */
  final def getPacketPeer(): Long =
    Ptrcall.call0[Long](MethodBind.get("MultiplayerPeer", "get_packet_peer", 3905245786L), hostObject.objectPtr)

  /** MultiplayerPeer.get_packet_channel */
  final def getPacketChannel(): Long =
    Ptrcall.call0[Long](MethodBind.get("MultiplayerPeer", "get_packet_channel", 3905245786L), hostObject.objectPtr)

  /** MultiplayerPeer.get_packet_mode */
  final def getPacketMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("MultiplayerPeer", "get_packet_mode", 3369852622L), hostObject.objectPtr)

  /** MultiplayerPeer.poll */
  final def poll(): Unit =
    Ptrcall.callVoid0(MethodBind.get("MultiplayerPeer", "poll", 3218959716L), hostObject.objectPtr)

  /** MultiplayerPeer.close */
  final def close(): Unit =
    Ptrcall.callVoid0(MethodBind.get("MultiplayerPeer", "close", 3218959716L), hostObject.objectPtr)

  /** MultiplayerPeer.disconnect_peer */
  final def disconnectPeer(peer: Long, force: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("MultiplayerPeer", "disconnect_peer", 4023243586L), hostObject.objectPtr, peer, force)

  /** MultiplayerPeer.get_connection_status */
  final def getConnectionStatus(): Long =
    Ptrcall.call0[Long](MethodBind.get("MultiplayerPeer", "get_connection_status", 2147374275L), hostObject.objectPtr)

  /** MultiplayerPeer.get_unique_id */
  final def getUniqueId(): Long =
    Ptrcall.call0[Long](MethodBind.get("MultiplayerPeer", "get_unique_id", 3905245786L), hostObject.objectPtr)

  /** MultiplayerPeer.generate_unique_id */
  final def generateUniqueId(): Long =
    Ptrcall.call0[Long](MethodBind.get("MultiplayerPeer", "generate_unique_id", 3905245786L), hostObject.objectPtr)

  /** MultiplayerPeer.set_refuse_new_connections */
  final def setRefuseNewConnections(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("MultiplayerPeer", "set_refuse_new_connections", 2586408642L), hostObject.objectPtr, enable)

  /** MultiplayerPeer.is_refusing_new_connections */
  final def isRefusingNewConnections(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("MultiplayerPeer", "is_refusing_new_connections", 36873697L), hostObject.objectPtr)

  /** MultiplayerPeer.is_server_relay_supported */
  final def isServerRelaySupported(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("MultiplayerPeer", "is_server_relay_supported", 36873697L), hostObject.objectPtr)

}

object MultiplayerPeer {
  /** Class metadata for Gd[MultiplayerPeer] lifetime management and casting. */
  given GodotClass[MultiplayerPeer] with {
    def className = "MultiplayerPeer"
    def isRefCounted = true
    def wrap(o: GodotObject): MultiplayerPeer = new MultiplayerPeer {}.withHost(o.objectPtr)
    def unwrap(t: MultiplayerPeer): GodotObject = t.hostObject
  }
}
