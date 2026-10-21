package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `PacketPeerStream`, extends `PacketPeer`. */
abstract class PacketPeerStream extends PacketPeer {
  override def godotClassName: String = "PacketPeerStream"

  /** PacketPeerStream.set_stream_peer */
  final def setStreamPeer(peer: StreamPeer): Unit = {
    if (gdext.classes.PacketPeerStream.mb_set_stream_peer == null) gdext.classes.PacketPeerStream.mb_set_stream_peer = MethodBind.get("PacketPeerStream", "set_stream_peer", 3281897016L)
    Ptrcall.callVoid1(gdext.classes.PacketPeerStream.mb_set_stream_peer, livePtr, Wrappers.handle(peer))
  }

  /** PacketPeerStream.get_stream_peer. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getStreamPeer(): StreamPeer = {
    if (gdext.classes.PacketPeerStream.mb_get_stream_peer == null) gdext.classes.PacketPeerStream.mb_get_stream_peer = MethodBind.get("PacketPeerStream", "get_stream_peer", 2741655269L)
    Wrappers.owned[StreamPeer](Ptrcall.call0[Long](gdext.classes.PacketPeerStream.mb_get_stream_peer, livePtr))
  }

  /** PacketPeerStream.set_input_buffer_max_size */
  final def setInputBufferMaxSize(max_size_bytes: Long): Unit = {
    if (gdext.classes.PacketPeerStream.mb_set_input_buffer_max_size == null) gdext.classes.PacketPeerStream.mb_set_input_buffer_max_size = MethodBind.get("PacketPeerStream", "set_input_buffer_max_size", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.PacketPeerStream.mb_set_input_buffer_max_size, livePtr, max_size_bytes)
  }

  /** PacketPeerStream.set_output_buffer_max_size */
  final def setOutputBufferMaxSize(max_size_bytes: Long): Unit = {
    if (gdext.classes.PacketPeerStream.mb_set_output_buffer_max_size == null) gdext.classes.PacketPeerStream.mb_set_output_buffer_max_size = MethodBind.get("PacketPeerStream", "set_output_buffer_max_size", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.PacketPeerStream.mb_set_output_buffer_max_size, livePtr, max_size_bytes)
  }

  /** PacketPeerStream.get_input_buffer_max_size */
  final def getInputBufferMaxSize(): Long = {
    if (gdext.classes.PacketPeerStream.mb_get_input_buffer_max_size == null) gdext.classes.PacketPeerStream.mb_get_input_buffer_max_size = MethodBind.get("PacketPeerStream", "get_input_buffer_max_size", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.PacketPeerStream.mb_get_input_buffer_max_size, livePtr)
  }

  /** PacketPeerStream.get_output_buffer_max_size */
  final def getOutputBufferMaxSize(): Long = {
    if (gdext.classes.PacketPeerStream.mb_get_output_buffer_max_size == null) gdext.classes.PacketPeerStream.mb_get_output_buffer_max_size = MethodBind.get("PacketPeerStream", "get_output_buffer_max_size", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.PacketPeerStream.mb_get_output_buffer_max_size, livePtr)
  }

}

object PacketPeerStream {
  private[classes] var mb_set_stream_peer: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_stream_peer: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_input_buffer_max_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_output_buffer_max_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_input_buffer_max_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_output_buffer_max_size: GDExtensionMethodBindPtr = null
}
