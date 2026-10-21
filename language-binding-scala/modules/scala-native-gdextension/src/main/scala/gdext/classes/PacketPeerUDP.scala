package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `PacketPeerUDP`, extends `PacketPeer`. */
abstract class PacketPeerUDP extends PacketPeer {
  override def godotClassName: String = "PacketPeerUDP"

  /** PacketPeerUDP.bind */
  final def bind(port: Long, bind_address: String, recv_buf_size: Long): Long = {
    if (gdext.classes.PacketPeerUDP.mb_bind == null) gdext.classes.PacketPeerUDP.mb_bind = MethodBind.get("PacketPeerUDP", "bind", 4051239242L)
    Ptrcall.call3[Long, String, Long, Long](gdext.classes.PacketPeerUDP.mb_bind, livePtr, port, bind_address, recv_buf_size)
  }

  /** PacketPeerUDP.close */
  final def close(): Unit = {
    if (gdext.classes.PacketPeerUDP.mb_close == null) gdext.classes.PacketPeerUDP.mb_close = MethodBind.get("PacketPeerUDP", "close", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.PacketPeerUDP.mb_close, livePtr)
  }

  /** PacketPeerUDP.is_bound */
  final def isBound(): Boolean = {
    if (gdext.classes.PacketPeerUDP.mb_is_bound == null) gdext.classes.PacketPeerUDP.mb_is_bound = MethodBind.get("PacketPeerUDP", "is_bound", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.PacketPeerUDP.mb_is_bound, livePtr)
  }

  /** PacketPeerUDP.connect_to_host */
  final def connectToHost(host: String, port: Long): Long = {
    if (gdext.classes.PacketPeerUDP.mb_connect_to_host == null) gdext.classes.PacketPeerUDP.mb_connect_to_host = MethodBind.get("PacketPeerUDP", "connect_to_host", 993915709L)
    Ptrcall.call2[String, Long, Long](gdext.classes.PacketPeerUDP.mb_connect_to_host, livePtr, host, port)
  }

  /** PacketPeerUDP.is_socket_connected */
  final def isSocketConnected(): Boolean = {
    if (gdext.classes.PacketPeerUDP.mb_is_socket_connected == null) gdext.classes.PacketPeerUDP.mb_is_socket_connected = MethodBind.get("PacketPeerUDP", "is_socket_connected", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.PacketPeerUDP.mb_is_socket_connected, livePtr)
  }

  /** PacketPeerUDP.get_packet_ip */
  final def getPacketIp(): String = {
    if (gdext.classes.PacketPeerUDP.mb_get_packet_ip == null) gdext.classes.PacketPeerUDP.mb_get_packet_ip = MethodBind.get("PacketPeerUDP", "get_packet_ip", 201670096L)
    Ptrcall.call0[String](gdext.classes.PacketPeerUDP.mb_get_packet_ip, livePtr)
  }

  /** PacketPeerUDP.get_packet_port */
  final def getPacketPort(): Long = {
    if (gdext.classes.PacketPeerUDP.mb_get_packet_port == null) gdext.classes.PacketPeerUDP.mb_get_packet_port = MethodBind.get("PacketPeerUDP", "get_packet_port", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.PacketPeerUDP.mb_get_packet_port, livePtr)
  }

  /** PacketPeerUDP.get_local_port */
  final def getLocalPort(): Long = {
    if (gdext.classes.PacketPeerUDP.mb_get_local_port == null) gdext.classes.PacketPeerUDP.mb_get_local_port = MethodBind.get("PacketPeerUDP", "get_local_port", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.PacketPeerUDP.mb_get_local_port, livePtr)
  }

  /** PacketPeerUDP.set_dest_address */
  final def setDestAddress(host: String, port: Long): Long = {
    if (gdext.classes.PacketPeerUDP.mb_set_dest_address == null) gdext.classes.PacketPeerUDP.mb_set_dest_address = MethodBind.get("PacketPeerUDP", "set_dest_address", 993915709L)
    Ptrcall.call2[String, Long, Long](gdext.classes.PacketPeerUDP.mb_set_dest_address, livePtr, host, port)
  }

  /** PacketPeerUDP.set_broadcast_enabled */
  final def setBroadcastEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.PacketPeerUDP.mb_set_broadcast_enabled == null) gdext.classes.PacketPeerUDP.mb_set_broadcast_enabled = MethodBind.get("PacketPeerUDP", "set_broadcast_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.PacketPeerUDP.mb_set_broadcast_enabled, livePtr, enabled)
  }

  /** PacketPeerUDP.join_multicast_group */
  final def joinMulticastGroup(multicast_address: String, interface_name: String): Long = {
    if (gdext.classes.PacketPeerUDP.mb_join_multicast_group == null) gdext.classes.PacketPeerUDP.mb_join_multicast_group = MethodBind.get("PacketPeerUDP", "join_multicast_group", 852856452L)
    Ptrcall.call2[String, String, Long](gdext.classes.PacketPeerUDP.mb_join_multicast_group, livePtr, multicast_address, interface_name)
  }

  /** PacketPeerUDP.leave_multicast_group */
  final def leaveMulticastGroup(multicast_address: String, interface_name: String): Long = {
    if (gdext.classes.PacketPeerUDP.mb_leave_multicast_group == null) gdext.classes.PacketPeerUDP.mb_leave_multicast_group = MethodBind.get("PacketPeerUDP", "leave_multicast_group", 852856452L)
    Ptrcall.call2[String, String, Long](gdext.classes.PacketPeerUDP.mb_leave_multicast_group, livePtr, multicast_address, interface_name)
  }

}

object PacketPeerUDP {
  private[classes] var mb_bind: GDExtensionMethodBindPtr = null
  private[classes] var mb_close: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_bound: GDExtensionMethodBindPtr = null
  private[classes] var mb_connect_to_host: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_socket_connected: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_packet_ip: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_packet_port: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_local_port: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_dest_address: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_broadcast_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_join_multicast_group: GDExtensionMethodBindPtr = null
  private[classes] var mb_leave_multicast_group: GDExtensionMethodBindPtr = null
}
