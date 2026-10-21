package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `MultiplayerPeer`, extends `PacketPeer`. */
abstract class MultiplayerPeer extends PacketPeer {
  override def godotClassName: String = "MultiplayerPeer"

  /** MultiplayerPeer.set_transfer_channel */
  final def setTransferChannel(channel: Long): Unit = {
    if (gdext.classes.MultiplayerPeer.mb_set_transfer_channel == null) gdext.classes.MultiplayerPeer.mb_set_transfer_channel = MethodBind.get("MultiplayerPeer", "set_transfer_channel", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.MultiplayerPeer.mb_set_transfer_channel, livePtr, channel)
  }

  /** MultiplayerPeer.get_transfer_channel */
  final def getTransferChannel(): Long = {
    if (gdext.classes.MultiplayerPeer.mb_get_transfer_channel == null) gdext.classes.MultiplayerPeer.mb_get_transfer_channel = MethodBind.get("MultiplayerPeer", "get_transfer_channel", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.MultiplayerPeer.mb_get_transfer_channel, livePtr)
  }

  /** MultiplayerPeer.set_transfer_mode */
  final def setTransferMode(mode: Long): Unit = {
    if (gdext.classes.MultiplayerPeer.mb_set_transfer_mode == null) gdext.classes.MultiplayerPeer.mb_set_transfer_mode = MethodBind.get("MultiplayerPeer", "set_transfer_mode", 950411049L)
    Ptrcall.callVoid1(gdext.classes.MultiplayerPeer.mb_set_transfer_mode, livePtr, mode)
  }

  /** MultiplayerPeer.get_transfer_mode */
  final def getTransferMode(): Long = {
    if (gdext.classes.MultiplayerPeer.mb_get_transfer_mode == null) gdext.classes.MultiplayerPeer.mb_get_transfer_mode = MethodBind.get("MultiplayerPeer", "get_transfer_mode", 3369852622L)
    Ptrcall.call0[Long](gdext.classes.MultiplayerPeer.mb_get_transfer_mode, livePtr)
  }

  /** MultiplayerPeer.set_target_peer */
  final def setTargetPeer(id: Long): Unit = {
    if (gdext.classes.MultiplayerPeer.mb_set_target_peer == null) gdext.classes.MultiplayerPeer.mb_set_target_peer = MethodBind.get("MultiplayerPeer", "set_target_peer", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.MultiplayerPeer.mb_set_target_peer, livePtr, id)
  }

  /** MultiplayerPeer.get_packet_peer */
  final def getPacketPeer(): Long = {
    if (gdext.classes.MultiplayerPeer.mb_get_packet_peer == null) gdext.classes.MultiplayerPeer.mb_get_packet_peer = MethodBind.get("MultiplayerPeer", "get_packet_peer", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.MultiplayerPeer.mb_get_packet_peer, livePtr)
  }

  /** MultiplayerPeer.get_packet_channel */
  final def getPacketChannel(): Long = {
    if (gdext.classes.MultiplayerPeer.mb_get_packet_channel == null) gdext.classes.MultiplayerPeer.mb_get_packet_channel = MethodBind.get("MultiplayerPeer", "get_packet_channel", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.MultiplayerPeer.mb_get_packet_channel, livePtr)
  }

  /** MultiplayerPeer.get_packet_mode */
  final def getPacketMode(): Long = {
    if (gdext.classes.MultiplayerPeer.mb_get_packet_mode == null) gdext.classes.MultiplayerPeer.mb_get_packet_mode = MethodBind.get("MultiplayerPeer", "get_packet_mode", 3369852622L)
    Ptrcall.call0[Long](gdext.classes.MultiplayerPeer.mb_get_packet_mode, livePtr)
  }

  /** MultiplayerPeer.poll */
  final def poll(): Unit = {
    if (gdext.classes.MultiplayerPeer.mb_poll == null) gdext.classes.MultiplayerPeer.mb_poll = MethodBind.get("MultiplayerPeer", "poll", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.MultiplayerPeer.mb_poll, livePtr)
  }

  /** MultiplayerPeer.close */
  final def close(): Unit = {
    if (gdext.classes.MultiplayerPeer.mb_close == null) gdext.classes.MultiplayerPeer.mb_close = MethodBind.get("MultiplayerPeer", "close", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.MultiplayerPeer.mb_close, livePtr)
  }

  /** MultiplayerPeer.disconnect_peer */
  final def disconnectPeer(peer: Long, force: Boolean): Unit = {
    if (gdext.classes.MultiplayerPeer.mb_disconnect_peer == null) gdext.classes.MultiplayerPeer.mb_disconnect_peer = MethodBind.get("MultiplayerPeer", "disconnect_peer", 4023243586L)
    Ptrcall.callVoid2(gdext.classes.MultiplayerPeer.mb_disconnect_peer, livePtr, peer, force)
  }

  /** MultiplayerPeer.get_connection_status */
  final def getConnectionStatus(): Long = {
    if (gdext.classes.MultiplayerPeer.mb_get_connection_status == null) gdext.classes.MultiplayerPeer.mb_get_connection_status = MethodBind.get("MultiplayerPeer", "get_connection_status", 2147374275L)
    Ptrcall.call0[Long](gdext.classes.MultiplayerPeer.mb_get_connection_status, livePtr)
  }

  /** MultiplayerPeer.get_unique_id */
  final def getUniqueId(): Long = {
    if (gdext.classes.MultiplayerPeer.mb_get_unique_id == null) gdext.classes.MultiplayerPeer.mb_get_unique_id = MethodBind.get("MultiplayerPeer", "get_unique_id", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.MultiplayerPeer.mb_get_unique_id, livePtr)
  }

  /** MultiplayerPeer.generate_unique_id */
  final def generateUniqueId(): Long = {
    if (gdext.classes.MultiplayerPeer.mb_generate_unique_id == null) gdext.classes.MultiplayerPeer.mb_generate_unique_id = MethodBind.get("MultiplayerPeer", "generate_unique_id", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.MultiplayerPeer.mb_generate_unique_id, livePtr)
  }

  /** MultiplayerPeer.set_refuse_new_connections */
  final def setRefuseNewConnections(enable: Boolean): Unit = {
    if (gdext.classes.MultiplayerPeer.mb_set_refuse_new_connections == null) gdext.classes.MultiplayerPeer.mb_set_refuse_new_connections = MethodBind.get("MultiplayerPeer", "set_refuse_new_connections", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.MultiplayerPeer.mb_set_refuse_new_connections, livePtr, enable)
  }

  /** MultiplayerPeer.is_refusing_new_connections */
  final def isRefusingNewConnections(): Boolean = {
    if (gdext.classes.MultiplayerPeer.mb_is_refusing_new_connections == null) gdext.classes.MultiplayerPeer.mb_is_refusing_new_connections = MethodBind.get("MultiplayerPeer", "is_refusing_new_connections", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.MultiplayerPeer.mb_is_refusing_new_connections, livePtr)
  }

  /** MultiplayerPeer.is_server_relay_supported */
  final def isServerRelaySupported(): Boolean = {
    if (gdext.classes.MultiplayerPeer.mb_is_server_relay_supported == null) gdext.classes.MultiplayerPeer.mb_is_server_relay_supported = MethodBind.get("MultiplayerPeer", "is_server_relay_supported", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.MultiplayerPeer.mb_is_server_relay_supported, livePtr)
  }

}

object MultiplayerPeer {
  private[classes] var mb_set_transfer_channel: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_transfer_channel: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_transfer_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_transfer_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_target_peer: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_packet_peer: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_packet_channel: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_packet_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_poll: GDExtensionMethodBindPtr = null
  private[classes] var mb_close: GDExtensionMethodBindPtr = null
  private[classes] var mb_disconnect_peer: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_connection_status: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_unique_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_generate_unique_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_refuse_new_connections: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_refusing_new_connections: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_server_relay_supported: GDExtensionMethodBindPtr = null
}
