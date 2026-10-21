package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `WebSocketMultiplayerPeer`, extends `MultiplayerPeer`. */
abstract class WebSocketMultiplayerPeer extends MultiplayerPeer {
  override def godotClassName: String = "WebSocketMultiplayerPeer"

  /** WebSocketMultiplayerPeer.create_client */
  final def createClient(url: String, tls_client_options: TLSOptions): Long = {
    if (gdext.classes.WebSocketMultiplayerPeer.mb_create_client == null) gdext.classes.WebSocketMultiplayerPeer.mb_create_client = MethodBind.get("WebSocketMultiplayerPeer", "create_client", 1966198364L)
    Ptrcall.call2[String, GodotObject, Long](gdext.classes.WebSocketMultiplayerPeer.mb_create_client, livePtr, url, Wrappers.handle(tls_client_options))
  }

  /** WebSocketMultiplayerPeer.create_server */
  final def createServer(port: Long, bind_address: String, tls_server_options: TLSOptions): Long = {
    if (gdext.classes.WebSocketMultiplayerPeer.mb_create_server == null) gdext.classes.WebSocketMultiplayerPeer.mb_create_server = MethodBind.get("WebSocketMultiplayerPeer", "create_server", 2400822951L)
    Ptrcall.call3[Long, String, GodotObject, Long](gdext.classes.WebSocketMultiplayerPeer.mb_create_server, livePtr, port, bind_address, Wrappers.handle(tls_server_options))
  }

  /** WebSocketMultiplayerPeer.get_peer. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getPeer(peer_id: Long): WebSocketPeer = {
    if (gdext.classes.WebSocketMultiplayerPeer.mb_get_peer == null) gdext.classes.WebSocketMultiplayerPeer.mb_get_peer = MethodBind.get("WebSocketMultiplayerPeer", "get_peer", 1381378851L)
    Wrappers.owned[WebSocketPeer](Ptrcall.call1[Long, Long](gdext.classes.WebSocketMultiplayerPeer.mb_get_peer, livePtr, peer_id))
  }

  /** WebSocketMultiplayerPeer.get_peer_address */
  final def getPeerAddress(id: Long): String = {
    if (gdext.classes.WebSocketMultiplayerPeer.mb_get_peer_address == null) gdext.classes.WebSocketMultiplayerPeer.mb_get_peer_address = MethodBind.get("WebSocketMultiplayerPeer", "get_peer_address", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.WebSocketMultiplayerPeer.mb_get_peer_address, livePtr, id)
  }

  /** WebSocketMultiplayerPeer.get_peer_port */
  final def getPeerPort(id: Long): Long = {
    if (gdext.classes.WebSocketMultiplayerPeer.mb_get_peer_port == null) gdext.classes.WebSocketMultiplayerPeer.mb_get_peer_port = MethodBind.get("WebSocketMultiplayerPeer", "get_peer_port", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.WebSocketMultiplayerPeer.mb_get_peer_port, livePtr, id)
  }

  /** WebSocketMultiplayerPeer.get_inbound_buffer_size */
  final def getInboundBufferSize(): Long = {
    if (gdext.classes.WebSocketMultiplayerPeer.mb_get_inbound_buffer_size == null) gdext.classes.WebSocketMultiplayerPeer.mb_get_inbound_buffer_size = MethodBind.get("WebSocketMultiplayerPeer", "get_inbound_buffer_size", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.WebSocketMultiplayerPeer.mb_get_inbound_buffer_size, livePtr)
  }

  /** WebSocketMultiplayerPeer.set_inbound_buffer_size */
  final def setInboundBufferSize(buffer_size: Long): Unit = {
    if (gdext.classes.WebSocketMultiplayerPeer.mb_set_inbound_buffer_size == null) gdext.classes.WebSocketMultiplayerPeer.mb_set_inbound_buffer_size = MethodBind.get("WebSocketMultiplayerPeer", "set_inbound_buffer_size", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.WebSocketMultiplayerPeer.mb_set_inbound_buffer_size, livePtr, buffer_size)
  }

  /** WebSocketMultiplayerPeer.get_outbound_buffer_size */
  final def getOutboundBufferSize(): Long = {
    if (gdext.classes.WebSocketMultiplayerPeer.mb_get_outbound_buffer_size == null) gdext.classes.WebSocketMultiplayerPeer.mb_get_outbound_buffer_size = MethodBind.get("WebSocketMultiplayerPeer", "get_outbound_buffer_size", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.WebSocketMultiplayerPeer.mb_get_outbound_buffer_size, livePtr)
  }

  /** WebSocketMultiplayerPeer.set_outbound_buffer_size */
  final def setOutboundBufferSize(buffer_size: Long): Unit = {
    if (gdext.classes.WebSocketMultiplayerPeer.mb_set_outbound_buffer_size == null) gdext.classes.WebSocketMultiplayerPeer.mb_set_outbound_buffer_size = MethodBind.get("WebSocketMultiplayerPeer", "set_outbound_buffer_size", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.WebSocketMultiplayerPeer.mb_set_outbound_buffer_size, livePtr, buffer_size)
  }

  /** WebSocketMultiplayerPeer.get_handshake_timeout */
  final def getHandshakeTimeout(): Double = {
    if (gdext.classes.WebSocketMultiplayerPeer.mb_get_handshake_timeout == null) gdext.classes.WebSocketMultiplayerPeer.mb_get_handshake_timeout = MethodBind.get("WebSocketMultiplayerPeer", "get_handshake_timeout", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.WebSocketMultiplayerPeer.mb_get_handshake_timeout, livePtr)
  }

  /** WebSocketMultiplayerPeer.set_handshake_timeout */
  final def setHandshakeTimeout(timeout: Double): Unit = {
    if (gdext.classes.WebSocketMultiplayerPeer.mb_set_handshake_timeout == null) gdext.classes.WebSocketMultiplayerPeer.mb_set_handshake_timeout = MethodBind.get("WebSocketMultiplayerPeer", "set_handshake_timeout", 373806689L)
    Ptrcall.callVoid1(gdext.classes.WebSocketMultiplayerPeer.mb_set_handshake_timeout, livePtr, timeout)
  }

  /** WebSocketMultiplayerPeer.set_max_queued_packets */
  final def setMaxQueuedPackets(max_queued_packets: Long): Unit = {
    if (gdext.classes.WebSocketMultiplayerPeer.mb_set_max_queued_packets == null) gdext.classes.WebSocketMultiplayerPeer.mb_set_max_queued_packets = MethodBind.get("WebSocketMultiplayerPeer", "set_max_queued_packets", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.WebSocketMultiplayerPeer.mb_set_max_queued_packets, livePtr, max_queued_packets)
  }

  /** WebSocketMultiplayerPeer.get_max_queued_packets */
  final def getMaxQueuedPackets(): Long = {
    if (gdext.classes.WebSocketMultiplayerPeer.mb_get_max_queued_packets == null) gdext.classes.WebSocketMultiplayerPeer.mb_get_max_queued_packets = MethodBind.get("WebSocketMultiplayerPeer", "get_max_queued_packets", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.WebSocketMultiplayerPeer.mb_get_max_queued_packets, livePtr)
  }

}

object WebSocketMultiplayerPeer {
  private[classes] var mb_create_client: GDExtensionMethodBindPtr = null
  private[classes] var mb_create_server: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_peer: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_peer_address: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_peer_port: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_inbound_buffer_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_inbound_buffer_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_outbound_buffer_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_outbound_buffer_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_handshake_timeout: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_handshake_timeout: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_max_queued_packets: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_max_queued_packets: GDExtensionMethodBindPtr = null
}
