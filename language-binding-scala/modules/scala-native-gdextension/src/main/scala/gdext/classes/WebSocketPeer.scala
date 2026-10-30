package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `WebSocketPeer`, extends `PacketPeer`. */
abstract class WebSocketPeer extends PacketPeer {
  override def godotClassName: String = "WebSocketPeer"

  /** WebSocketPeer.connect_to_url */
  final def connectToUrl(url: String, tlsClientOptions: TLSOptions = null): gdext.classes.Error = {
    if (gdext.classes.WebSocketPeer.mb_connect_to_url == null) gdext.classes.WebSocketPeer.mb_connect_to_url = MethodBind.get("WebSocketPeer", "connect_to_url", 1966198364L)
    gdext.classes.Error(Ptrcall.call2[String, GodotObject, Long](gdext.classes.WebSocketPeer.mb_connect_to_url, livePtr, url, Wrappers.handle(tlsClientOptions)))
  }

  /** WebSocketPeer.accept_stream */
  final def acceptStream(stream: StreamPeer): gdext.classes.Error = {
    if (gdext.classes.WebSocketPeer.mb_accept_stream == null) gdext.classes.WebSocketPeer.mb_accept_stream = MethodBind.get("WebSocketPeer", "accept_stream", 255125695L)
    gdext.classes.Error(Ptrcall.call1[GodotObject, Long](gdext.classes.WebSocketPeer.mb_accept_stream, livePtr, Wrappers.handle(stream)))
  }

  /** WebSocketPeer.send_text */
  final def sendText(message: String): gdext.classes.Error = {
    if (gdext.classes.WebSocketPeer.mb_send_text == null) gdext.classes.WebSocketPeer.mb_send_text = MethodBind.get("WebSocketPeer", "send_text", 166001499L)
    gdext.classes.Error(Ptrcall.call1[String, Long](gdext.classes.WebSocketPeer.mb_send_text, livePtr, message))
  }

  /** WebSocketPeer.was_string_packet */
  final def wasStringPacket(): Boolean = {
    if (gdext.classes.WebSocketPeer.mb_was_string_packet == null) gdext.classes.WebSocketPeer.mb_was_string_packet = MethodBind.get("WebSocketPeer", "was_string_packet", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.WebSocketPeer.mb_was_string_packet, livePtr)
  }

  /** WebSocketPeer.poll */
  final def poll(): Unit = {
    if (gdext.classes.WebSocketPeer.mb_poll == null) gdext.classes.WebSocketPeer.mb_poll = MethodBind.get("WebSocketPeer", "poll", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.WebSocketPeer.mb_poll, livePtr)
  }

  /** WebSocketPeer.close */
  final def close(code: Long = 1000L, reason: String = ""): Unit = {
    if (gdext.classes.WebSocketPeer.mb_close == null) gdext.classes.WebSocketPeer.mb_close = MethodBind.get("WebSocketPeer", "close", 1047156615L)
    Ptrcall.callVoid2(gdext.classes.WebSocketPeer.mb_close, livePtr, code, reason)
  }

  /** WebSocketPeer.get_connected_host */
  final def getConnectedHost(): String = {
    if (gdext.classes.WebSocketPeer.mb_get_connected_host == null) gdext.classes.WebSocketPeer.mb_get_connected_host = MethodBind.get("WebSocketPeer", "get_connected_host", 201670096L)
    Ptrcall.call0[String](gdext.classes.WebSocketPeer.mb_get_connected_host, livePtr)
  }

  /** WebSocketPeer.get_connected_port */
  final def getConnectedPort(): Long = {
    if (gdext.classes.WebSocketPeer.mb_get_connected_port == null) gdext.classes.WebSocketPeer.mb_get_connected_port = MethodBind.get("WebSocketPeer", "get_connected_port", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.WebSocketPeer.mb_get_connected_port, livePtr)
  }

  /** WebSocketPeer.get_selected_protocol */
  final def getSelectedProtocol(): String = {
    if (gdext.classes.WebSocketPeer.mb_get_selected_protocol == null) gdext.classes.WebSocketPeer.mb_get_selected_protocol = MethodBind.get("WebSocketPeer", "get_selected_protocol", 201670096L)
    Ptrcall.call0[String](gdext.classes.WebSocketPeer.mb_get_selected_protocol, livePtr)
  }

  /** WebSocketPeer.get_requested_url */
  final def getRequestedUrl(): String = {
    if (gdext.classes.WebSocketPeer.mb_get_requested_url == null) gdext.classes.WebSocketPeer.mb_get_requested_url = MethodBind.get("WebSocketPeer", "get_requested_url", 201670096L)
    Ptrcall.call0[String](gdext.classes.WebSocketPeer.mb_get_requested_url, livePtr)
  }

  /** WebSocketPeer.set_no_delay */
  final def setNoDelay(enabled: Boolean): Unit = {
    if (gdext.classes.WebSocketPeer.mb_set_no_delay == null) gdext.classes.WebSocketPeer.mb_set_no_delay = MethodBind.get("WebSocketPeer", "set_no_delay", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.WebSocketPeer.mb_set_no_delay, livePtr, enabled)
  }

  /** WebSocketPeer.get_current_outbound_buffered_amount */
  final def getCurrentOutboundBufferedAmount(): Long = {
    if (gdext.classes.WebSocketPeer.mb_get_current_outbound_buffered_amount == null) gdext.classes.WebSocketPeer.mb_get_current_outbound_buffered_amount = MethodBind.get("WebSocketPeer", "get_current_outbound_buffered_amount", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.WebSocketPeer.mb_get_current_outbound_buffered_amount, livePtr)
  }

  /** WebSocketPeer.get_ready_state */
  final def getReadyState(): gdext.classes.WebSocketPeer.State = {
    if (gdext.classes.WebSocketPeer.mb_get_ready_state == null) gdext.classes.WebSocketPeer.mb_get_ready_state = MethodBind.get("WebSocketPeer", "get_ready_state", 346482985L)
    gdext.classes.WebSocketPeer.State(Ptrcall.call0[Long](gdext.classes.WebSocketPeer.mb_get_ready_state, livePtr))
  }

  /** WebSocketPeer.get_close_code */
  final def getCloseCode(): Long = {
    if (gdext.classes.WebSocketPeer.mb_get_close_code == null) gdext.classes.WebSocketPeer.mb_get_close_code = MethodBind.get("WebSocketPeer", "get_close_code", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.WebSocketPeer.mb_get_close_code, livePtr)
  }

  /** WebSocketPeer.get_close_reason */
  final def getCloseReason(): String = {
    if (gdext.classes.WebSocketPeer.mb_get_close_reason == null) gdext.classes.WebSocketPeer.mb_get_close_reason = MethodBind.get("WebSocketPeer", "get_close_reason", 201670096L)
    Ptrcall.call0[String](gdext.classes.WebSocketPeer.mb_get_close_reason, livePtr)
  }

  /** WebSocketPeer.get_inbound_buffer_size */
  final def getInboundBufferSize(): Long = {
    if (gdext.classes.WebSocketPeer.mb_get_inbound_buffer_size == null) gdext.classes.WebSocketPeer.mb_get_inbound_buffer_size = MethodBind.get("WebSocketPeer", "get_inbound_buffer_size", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.WebSocketPeer.mb_get_inbound_buffer_size, livePtr)
  }

  /** WebSocketPeer.set_inbound_buffer_size */
  final def setInboundBufferSize(bufferSize: Long): Unit = {
    if (gdext.classes.WebSocketPeer.mb_set_inbound_buffer_size == null) gdext.classes.WebSocketPeer.mb_set_inbound_buffer_size = MethodBind.get("WebSocketPeer", "set_inbound_buffer_size", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.WebSocketPeer.mb_set_inbound_buffer_size, livePtr, bufferSize)
  }

  /** WebSocketPeer.get_outbound_buffer_size */
  final def getOutboundBufferSize(): Long = {
    if (gdext.classes.WebSocketPeer.mb_get_outbound_buffer_size == null) gdext.classes.WebSocketPeer.mb_get_outbound_buffer_size = MethodBind.get("WebSocketPeer", "get_outbound_buffer_size", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.WebSocketPeer.mb_get_outbound_buffer_size, livePtr)
  }

  /** WebSocketPeer.set_outbound_buffer_size */
  final def setOutboundBufferSize(bufferSize: Long): Unit = {
    if (gdext.classes.WebSocketPeer.mb_set_outbound_buffer_size == null) gdext.classes.WebSocketPeer.mb_set_outbound_buffer_size = MethodBind.get("WebSocketPeer", "set_outbound_buffer_size", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.WebSocketPeer.mb_set_outbound_buffer_size, livePtr, bufferSize)
  }

  /** WebSocketPeer.set_max_queued_packets */
  final def setMaxQueuedPackets(bufferSize: Long): Unit = {
    if (gdext.classes.WebSocketPeer.mb_set_max_queued_packets == null) gdext.classes.WebSocketPeer.mb_set_max_queued_packets = MethodBind.get("WebSocketPeer", "set_max_queued_packets", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.WebSocketPeer.mb_set_max_queued_packets, livePtr, bufferSize)
  }

  /** WebSocketPeer.get_max_queued_packets */
  final def getMaxQueuedPackets(): Long = {
    if (gdext.classes.WebSocketPeer.mb_get_max_queued_packets == null) gdext.classes.WebSocketPeer.mb_get_max_queued_packets = MethodBind.get("WebSocketPeer", "get_max_queued_packets", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.WebSocketPeer.mb_get_max_queued_packets, livePtr)
  }

  /** WebSocketPeer.set_heartbeat_interval */
  final def setHeartbeatInterval(interval: Double): Unit = {
    if (gdext.classes.WebSocketPeer.mb_set_heartbeat_interval == null) gdext.classes.WebSocketPeer.mb_set_heartbeat_interval = MethodBind.get("WebSocketPeer", "set_heartbeat_interval", 373806689L)
    Ptrcall.callVoid1(gdext.classes.WebSocketPeer.mb_set_heartbeat_interval, livePtr, interval)
  }

  /** WebSocketPeer.get_heartbeat_interval */
  final def getHeartbeatInterval(): Double = {
    if (gdext.classes.WebSocketPeer.mb_get_heartbeat_interval == null) gdext.classes.WebSocketPeer.mb_get_heartbeat_interval = MethodBind.get("WebSocketPeer", "get_heartbeat_interval", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.WebSocketPeer.mb_get_heartbeat_interval, livePtr)
  }

}

object WebSocketPeer {
  private[classes] var mb_connect_to_url: GDExtensionMethodBindPtr = null
  private[classes] var mb_accept_stream: GDExtensionMethodBindPtr = null
  private[classes] var mb_send_text: GDExtensionMethodBindPtr = null
  private[classes] var mb_was_string_packet: GDExtensionMethodBindPtr = null
  private[classes] var mb_poll: GDExtensionMethodBindPtr = null
  private[classes] var mb_close: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_connected_host: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_connected_port: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_selected_protocol: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_requested_url: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_no_delay: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_current_outbound_buffered_amount: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_ready_state: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_close_code: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_close_reason: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_inbound_buffer_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_inbound_buffer_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_outbound_buffer_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_outbound_buffer_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_max_queued_packets: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_max_queued_packets: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_heartbeat_interval: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_heartbeat_interval: GDExtensionMethodBindPtr = null

  /** Godot enum `WebSocketPeer.WriteMode`. */
  opaque type WriteMode <: Long = Long

  object WriteMode {
    final val Text: WriteMode = 0L.asInstanceOf[WriteMode]
    final val Binary: WriteMode = 1L.asInstanceOf[WriteMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): WriteMode = value.asInstanceOf[WriteMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[WriteMode] = scala.IArray[Long](0L, 1L).asInstanceOf[scala.IArray[WriteMode]]

    extension (self: WriteMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Text"
        case 1L => "Binary"
        case other => other.toString
      }
  }

  /** Godot enum `WebSocketPeer.State`. */
  opaque type State <: Long = Long

  object State {
    final val Connecting: State = 0L.asInstanceOf[State]
    final val Open: State = 1L.asInstanceOf[State]
    final val Closing: State = 2L.asInstanceOf[State]
    final val Closed: State = 3L.asInstanceOf[State]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): State = value.asInstanceOf[State]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[State] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[State]]

    extension (self: State)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Connecting"
        case 1L => "Open"
        case 2L => "Closing"
        case 3L => "Closed"
        case other => other.toString
      }
  }
}
