package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `WebRTCDataChannel`, extends `PacketPeer`. */
abstract class WebRTCDataChannel extends PacketPeer {

  /** WebRTCDataChannel.poll */
  final def poll(): Long =
    Ptrcall.call0[Long](MethodBind.get("WebRTCDataChannel", "poll", 166280745L), hostObject.objectPtr)

  /** WebRTCDataChannel.close */
  final def close(): Unit =
    Ptrcall.callVoid0(MethodBind.get("WebRTCDataChannel", "close", 3218959716L), hostObject.objectPtr)

  /** WebRTCDataChannel.was_string_packet */
  final def wasStringPacket(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("WebRTCDataChannel", "was_string_packet", 36873697L), hostObject.objectPtr)

  /** WebRTCDataChannel.set_write_mode */
  final def setWriteMode(write_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("WebRTCDataChannel", "set_write_mode", 1999768052L), hostObject.objectPtr, write_mode)

  /** WebRTCDataChannel.get_write_mode */
  final def getWriteMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("WebRTCDataChannel", "get_write_mode", 2848495172L), hostObject.objectPtr)

  /** WebRTCDataChannel.get_ready_state */
  final def getReadyState(): Long =
    Ptrcall.call0[Long](MethodBind.get("WebRTCDataChannel", "get_ready_state", 3501143017L), hostObject.objectPtr)

  /** WebRTCDataChannel.get_label */
  final def getLabel(): String =
    Ptrcall.call0[String](MethodBind.get("WebRTCDataChannel", "get_label", 201670096L), hostObject.objectPtr)

  /** WebRTCDataChannel.is_ordered */
  final def isOrdered(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("WebRTCDataChannel", "is_ordered", 36873697L), hostObject.objectPtr)

  /** WebRTCDataChannel.get_id */
  final def getId(): Long =
    Ptrcall.call0[Long](MethodBind.get("WebRTCDataChannel", "get_id", 3905245786L), hostObject.objectPtr)

  /** WebRTCDataChannel.get_max_packet_life_time */
  final def getMaxPacketLifeTime(): Long =
    Ptrcall.call0[Long](MethodBind.get("WebRTCDataChannel", "get_max_packet_life_time", 3905245786L), hostObject.objectPtr)

  /** WebRTCDataChannel.get_max_retransmits */
  final def getMaxRetransmits(): Long =
    Ptrcall.call0[Long](MethodBind.get("WebRTCDataChannel", "get_max_retransmits", 3905245786L), hostObject.objectPtr)

  /** WebRTCDataChannel.get_protocol */
  final def getProtocol(): String =
    Ptrcall.call0[String](MethodBind.get("WebRTCDataChannel", "get_protocol", 201670096L), hostObject.objectPtr)

  /** WebRTCDataChannel.is_negotiated */
  final def isNegotiated(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("WebRTCDataChannel", "is_negotiated", 36873697L), hostObject.objectPtr)

  /** WebRTCDataChannel.get_buffered_amount */
  final def getBufferedAmount(): Long =
    Ptrcall.call0[Long](MethodBind.get("WebRTCDataChannel", "get_buffered_amount", 3905245786L), hostObject.objectPtr)

}

object WebRTCDataChannel {
  /** Class metadata for Gd[WebRTCDataChannel] lifetime management and casting. */
  given GodotClass[WebRTCDataChannel] with {
    def className = "WebRTCDataChannel"
    def isRefCounted = true
    def wrap(o: GodotObject): WebRTCDataChannel = new WebRTCDataChannel {}.withHost(o.objectPtr)
    def unwrap(t: WebRTCDataChannel): GodotObject = t.hostObject
  }
}
