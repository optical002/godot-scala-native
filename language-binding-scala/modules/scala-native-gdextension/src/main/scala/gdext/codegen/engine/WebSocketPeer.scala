package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `WebSocketPeer`, extends `PacketPeer`. */
abstract class WebSocketPeer extends PacketPeer {

  /** WebSocketPeer.connect_to_url */
  final def connectToUrl(url: String, tls_client_options: TLSOptions): Long =
    Ptrcall.call2[String, GodotObject, Long](MethodBind.get("WebSocketPeer", "connect_to_url", 1966198364L), hostObject.objectPtr, url, tls_client_options.hostObject)

  /** WebSocketPeer.accept_stream */
  final def acceptStream(stream: StreamPeer): Long =
    Ptrcall.call1[GodotObject, Long](MethodBind.get("WebSocketPeer", "accept_stream", 255125695L), hostObject.objectPtr, stream.hostObject)

  /** WebSocketPeer.send_text */
  final def sendText(message: String): Long =
    Ptrcall.call1[String, Long](MethodBind.get("WebSocketPeer", "send_text", 166001499L), hostObject.objectPtr, message)

  /** WebSocketPeer.was_string_packet */
  final def wasStringPacket(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("WebSocketPeer", "was_string_packet", 36873697L), hostObject.objectPtr)

  /** WebSocketPeer.poll */
  final def poll(): Unit =
    Ptrcall.callVoid0(MethodBind.get("WebSocketPeer", "poll", 3218959716L), hostObject.objectPtr)

  /** WebSocketPeer.close */
  final def close(code: Long, reason: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("WebSocketPeer", "close", 1047156615L), hostObject.objectPtr, code, reason)

  /** WebSocketPeer.get_connected_host */
  final def getConnectedHost(): String =
    Ptrcall.call0[String](MethodBind.get("WebSocketPeer", "get_connected_host", 201670096L), hostObject.objectPtr)

  /** WebSocketPeer.get_connected_port */
  final def getConnectedPort(): Long =
    Ptrcall.call0[Long](MethodBind.get("WebSocketPeer", "get_connected_port", 3905245786L), hostObject.objectPtr)

  /** WebSocketPeer.get_selected_protocol */
  final def getSelectedProtocol(): String =
    Ptrcall.call0[String](MethodBind.get("WebSocketPeer", "get_selected_protocol", 201670096L), hostObject.objectPtr)

  /** WebSocketPeer.get_requested_url */
  final def getRequestedUrl(): String =
    Ptrcall.call0[String](MethodBind.get("WebSocketPeer", "get_requested_url", 201670096L), hostObject.objectPtr)

  /** WebSocketPeer.set_no_delay */
  final def setNoDelay(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("WebSocketPeer", "set_no_delay", 2586408642L), hostObject.objectPtr, enabled)

  /** WebSocketPeer.get_current_outbound_buffered_amount */
  final def getCurrentOutboundBufferedAmount(): Long =
    Ptrcall.call0[Long](MethodBind.get("WebSocketPeer", "get_current_outbound_buffered_amount", 3905245786L), hostObject.objectPtr)

  /** WebSocketPeer.get_ready_state */
  final def getReadyState(): Long =
    Ptrcall.call0[Long](MethodBind.get("WebSocketPeer", "get_ready_state", 346482985L), hostObject.objectPtr)

  /** WebSocketPeer.get_close_code */
  final def getCloseCode(): Long =
    Ptrcall.call0[Long](MethodBind.get("WebSocketPeer", "get_close_code", 3905245786L), hostObject.objectPtr)

  /** WebSocketPeer.get_close_reason */
  final def getCloseReason(): String =
    Ptrcall.call0[String](MethodBind.get("WebSocketPeer", "get_close_reason", 201670096L), hostObject.objectPtr)

  /** WebSocketPeer.get_inbound_buffer_size */
  final def getInboundBufferSize(): Long =
    Ptrcall.call0[Long](MethodBind.get("WebSocketPeer", "get_inbound_buffer_size", 3905245786L), hostObject.objectPtr)

  /** WebSocketPeer.set_inbound_buffer_size */
  final def setInboundBufferSize(buffer_size: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("WebSocketPeer", "set_inbound_buffer_size", 1286410249L), hostObject.objectPtr, buffer_size)

  /** WebSocketPeer.get_outbound_buffer_size */
  final def getOutboundBufferSize(): Long =
    Ptrcall.call0[Long](MethodBind.get("WebSocketPeer", "get_outbound_buffer_size", 3905245786L), hostObject.objectPtr)

  /** WebSocketPeer.set_outbound_buffer_size */
  final def setOutboundBufferSize(buffer_size: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("WebSocketPeer", "set_outbound_buffer_size", 1286410249L), hostObject.objectPtr, buffer_size)

  /** WebSocketPeer.set_max_queued_packets */
  final def setMaxQueuedPackets(buffer_size: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("WebSocketPeer", "set_max_queued_packets", 1286410249L), hostObject.objectPtr, buffer_size)

  /** WebSocketPeer.get_max_queued_packets */
  final def getMaxQueuedPackets(): Long =
    Ptrcall.call0[Long](MethodBind.get("WebSocketPeer", "get_max_queued_packets", 3905245786L), hostObject.objectPtr)

  /** WebSocketPeer.set_heartbeat_interval */
  final def setHeartbeatInterval(interval: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("WebSocketPeer", "set_heartbeat_interval", 373806689L), hostObject.objectPtr, interval)

  /** WebSocketPeer.get_heartbeat_interval */
  final def getHeartbeatInterval(): Double =
    Ptrcall.call0[Double](MethodBind.get("WebSocketPeer", "get_heartbeat_interval", 1740695150L), hostObject.objectPtr)

}

object WebSocketPeer {
  /** Class metadata for Gd[WebSocketPeer] lifetime management and casting. */
  given GodotClass[WebSocketPeer] with {
    def className = "WebSocketPeer"
    def isRefCounted = true
    def wrap(o: GodotObject): WebSocketPeer = new WebSocketPeer {}.withHost(o.objectPtr)
    def unwrap(t: WebSocketPeer): GodotObject = t.hostObject
  }
}
