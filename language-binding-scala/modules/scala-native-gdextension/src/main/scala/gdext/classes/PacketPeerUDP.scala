package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `PacketPeerUDP`, extends `PacketPeer`. */
abstract class PacketPeerUDP extends PacketPeer {
  override def godotClassName: String = "PacketPeerUDP"

  /** PacketPeerUDP.bind */
  final def bind(port: Long, bind_address: String, recv_buf_size: Long): Long =
    Ptrcall.call3[Long, String, Long, Long](MethodBind.get("PacketPeerUDP", "bind", 4051239242L), hostObject.objectPtr, port, bind_address, recv_buf_size)

  /** PacketPeerUDP.close */
  final def close(): Unit =
    Ptrcall.callVoid0(MethodBind.get("PacketPeerUDP", "close", 3218959716L), hostObject.objectPtr)

  /** PacketPeerUDP.is_bound */
  final def isBound(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("PacketPeerUDP", "is_bound", 36873697L), hostObject.objectPtr)

  /** PacketPeerUDP.connect_to_host */
  final def connectToHost(host: String, port: Long): Long =
    Ptrcall.call2[String, Long, Long](MethodBind.get("PacketPeerUDP", "connect_to_host", 993915709L), hostObject.objectPtr, host, port)

  /** PacketPeerUDP.is_socket_connected */
  final def isSocketConnected(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("PacketPeerUDP", "is_socket_connected", 36873697L), hostObject.objectPtr)

  /** PacketPeerUDP.get_packet_ip */
  final def getPacketIp(): String =
    Ptrcall.call0[String](MethodBind.get("PacketPeerUDP", "get_packet_ip", 201670096L), hostObject.objectPtr)

  /** PacketPeerUDP.get_packet_port */
  final def getPacketPort(): Long =
    Ptrcall.call0[Long](MethodBind.get("PacketPeerUDP", "get_packet_port", 3905245786L), hostObject.objectPtr)

  /** PacketPeerUDP.get_local_port */
  final def getLocalPort(): Long =
    Ptrcall.call0[Long](MethodBind.get("PacketPeerUDP", "get_local_port", 3905245786L), hostObject.objectPtr)

  /** PacketPeerUDP.set_dest_address */
  final def setDestAddress(host: String, port: Long): Long =
    Ptrcall.call2[String, Long, Long](MethodBind.get("PacketPeerUDP", "set_dest_address", 993915709L), hostObject.objectPtr, host, port)

  /** PacketPeerUDP.set_broadcast_enabled */
  final def setBroadcastEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("PacketPeerUDP", "set_broadcast_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** PacketPeerUDP.join_multicast_group */
  final def joinMulticastGroup(multicast_address: String, interface_name: String): Long =
    Ptrcall.call2[String, String, Long](MethodBind.get("PacketPeerUDP", "join_multicast_group", 852856452L), hostObject.objectPtr, multicast_address, interface_name)

  /** PacketPeerUDP.leave_multicast_group */
  final def leaveMulticastGroup(multicast_address: String, interface_name: String): Long =
    Ptrcall.call2[String, String, Long](MethodBind.get("PacketPeerUDP", "leave_multicast_group", 852856452L), hostObject.objectPtr, multicast_address, interface_name)

}
