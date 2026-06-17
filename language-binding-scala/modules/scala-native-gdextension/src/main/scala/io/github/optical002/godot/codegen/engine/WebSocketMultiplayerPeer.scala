package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `WebSocketMultiplayerPeer`, extends `MultiplayerPeer`. */
abstract class WebSocketMultiplayerPeer extends MultiplayerPeer {

  /** WebSocketMultiplayerPeer.create_client */
  final def createClient(url: String, tls_client_options: TLSOptions): Long =
    Ptrcall.call2[String, GodotObject, Long](MethodBind.get("WebSocketMultiplayerPeer", "create_client", 1966198364L), hostObject.objectPtr, url, tls_client_options.hostObject)

  /** WebSocketMultiplayerPeer.create_server */
  final def createServer(port: Long, bind_address: String, tls_server_options: TLSOptions): Long =
    Ptrcall.call3[Long, String, GodotObject, Long](MethodBind.get("WebSocketMultiplayerPeer", "create_server", 2400822951L), hostObject.objectPtr, port, bind_address, tls_server_options.hostObject)

  /** WebSocketMultiplayerPeer.get_peer */
  final def getPeer(peer_id: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("WebSocketMultiplayerPeer", "get_peer", 1381378851L), hostObject.objectPtr, peer_id)

  /** WebSocketMultiplayerPeer.get_peer_address */
  final def getPeerAddress(id: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("WebSocketMultiplayerPeer", "get_peer_address", 844755477L), hostObject.objectPtr, id)

  /** WebSocketMultiplayerPeer.get_peer_port */
  final def getPeerPort(id: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("WebSocketMultiplayerPeer", "get_peer_port", 923996154L), hostObject.objectPtr, id)

  /** WebSocketMultiplayerPeer.get_inbound_buffer_size */
  final def getInboundBufferSize(): Long =
    Ptrcall.call0[Long](MethodBind.get("WebSocketMultiplayerPeer", "get_inbound_buffer_size", 3905245786L), hostObject.objectPtr)

  /** WebSocketMultiplayerPeer.set_inbound_buffer_size */
  final def setInboundBufferSize(buffer_size: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("WebSocketMultiplayerPeer", "set_inbound_buffer_size", 1286410249L), hostObject.objectPtr, buffer_size)

  /** WebSocketMultiplayerPeer.get_outbound_buffer_size */
  final def getOutboundBufferSize(): Long =
    Ptrcall.call0[Long](MethodBind.get("WebSocketMultiplayerPeer", "get_outbound_buffer_size", 3905245786L), hostObject.objectPtr)

  /** WebSocketMultiplayerPeer.set_outbound_buffer_size */
  final def setOutboundBufferSize(buffer_size: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("WebSocketMultiplayerPeer", "set_outbound_buffer_size", 1286410249L), hostObject.objectPtr, buffer_size)

  /** WebSocketMultiplayerPeer.get_handshake_timeout */
  final def getHandshakeTimeout(): Double =
    Ptrcall.call0[Double](MethodBind.get("WebSocketMultiplayerPeer", "get_handshake_timeout", 1740695150L), hostObject.objectPtr)

  /** WebSocketMultiplayerPeer.set_handshake_timeout */
  final def setHandshakeTimeout(timeout: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("WebSocketMultiplayerPeer", "set_handshake_timeout", 373806689L), hostObject.objectPtr, timeout)

  /** WebSocketMultiplayerPeer.set_max_queued_packets */
  final def setMaxQueuedPackets(max_queued_packets: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("WebSocketMultiplayerPeer", "set_max_queued_packets", 1286410249L), hostObject.objectPtr, max_queued_packets)

  /** WebSocketMultiplayerPeer.get_max_queued_packets */
  final def getMaxQueuedPackets(): Long =
    Ptrcall.call0[Long](MethodBind.get("WebSocketMultiplayerPeer", "get_max_queued_packets", 3905245786L), hostObject.objectPtr)

}

object WebSocketMultiplayerPeer {
  /** Class metadata for Gd[WebSocketMultiplayerPeer] lifetime management and casting. */
  given GodotClass[WebSocketMultiplayerPeer] with {
    def className = "WebSocketMultiplayerPeer"
    def isRefCounted = true
    def wrap(o: GodotObject): WebSocketMultiplayerPeer = new WebSocketMultiplayerPeer {}.withHost(o.objectPtr)
    def unwrap(t: WebSocketMultiplayerPeer): GodotObject = t.hostObject
  }
}
