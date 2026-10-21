package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `PacketPeer`, extends `RefCounted`. */
abstract class PacketPeer extends RefCounted {
  override def godotClassName: String = "PacketPeer"

  /** PacketPeer.get_packet_error */
  final def getPacketError(): Long = {
    if (gdext.classes.PacketPeer.mb_get_packet_error == null) gdext.classes.PacketPeer.mb_get_packet_error = MethodBind.get("PacketPeer", "get_packet_error", 3185525595L)
    Ptrcall.call0[Long](gdext.classes.PacketPeer.mb_get_packet_error, livePtr)
  }

  /** PacketPeer.get_available_packet_count */
  final def getAvailablePacketCount(): Long = {
    if (gdext.classes.PacketPeer.mb_get_available_packet_count == null) gdext.classes.PacketPeer.mb_get_available_packet_count = MethodBind.get("PacketPeer", "get_available_packet_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.PacketPeer.mb_get_available_packet_count, livePtr)
  }

  /** PacketPeer.get_encode_buffer_max_size */
  final def getEncodeBufferMaxSize(): Long = {
    if (gdext.classes.PacketPeer.mb_get_encode_buffer_max_size == null) gdext.classes.PacketPeer.mb_get_encode_buffer_max_size = MethodBind.get("PacketPeer", "get_encode_buffer_max_size", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.PacketPeer.mb_get_encode_buffer_max_size, livePtr)
  }

  /** PacketPeer.set_encode_buffer_max_size */
  final def setEncodeBufferMaxSize(max_size: Long): Unit = {
    if (gdext.classes.PacketPeer.mb_set_encode_buffer_max_size == null) gdext.classes.PacketPeer.mb_set_encode_buffer_max_size = MethodBind.get("PacketPeer", "set_encode_buffer_max_size", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.PacketPeer.mb_set_encode_buffer_max_size, livePtr, max_size)
  }

}

object PacketPeer {
  private[classes] var mb_get_packet_error: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_available_packet_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_encode_buffer_max_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_encode_buffer_max_size: GDExtensionMethodBindPtr = null
}
