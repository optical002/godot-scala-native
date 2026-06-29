package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `PacketPeer`, extends `RefCounted`. */
abstract class PacketPeer extends RefCounted {
  override def godotClassName: String = "PacketPeer"

  /** PacketPeer.get_packet_error */
  final def getPacketError(): Long =
    Ptrcall.call0[Long](MethodBind.get("PacketPeer", "get_packet_error", 3185525595L), hostObject.objectPtr)

  /** PacketPeer.get_available_packet_count */
  final def getAvailablePacketCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("PacketPeer", "get_available_packet_count", 3905245786L), hostObject.objectPtr)

  /** PacketPeer.get_encode_buffer_max_size */
  final def getEncodeBufferMaxSize(): Long =
    Ptrcall.call0[Long](MethodBind.get("PacketPeer", "get_encode_buffer_max_size", 3905245786L), hostObject.objectPtr)

  /** PacketPeer.set_encode_buffer_max_size */
  final def setEncodeBufferMaxSize(max_size: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("PacketPeer", "set_encode_buffer_max_size", 1286410249L), hostObject.objectPtr, max_size)

}
