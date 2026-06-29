package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `PacketPeerStream`, extends `PacketPeer`. */
abstract class PacketPeerStream extends PacketPeer {
  override def godotClassName: String = "PacketPeerStream"

  /** PacketPeerStream.set_stream_peer */
  final def setStreamPeer(peer: StreamPeer): Unit =
    Ptrcall.callVoid1(MethodBind.get("PacketPeerStream", "set_stream_peer", 3281897016L), hostObject.objectPtr, peer.hostObject)

  /** PacketPeerStream.get_stream_peer */
  final def getStreamPeer(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("PacketPeerStream", "get_stream_peer", 2741655269L), hostObject.objectPtr)

  /** PacketPeerStream.set_input_buffer_max_size */
  final def setInputBufferMaxSize(max_size_bytes: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("PacketPeerStream", "set_input_buffer_max_size", 1286410249L), hostObject.objectPtr, max_size_bytes)

  /** PacketPeerStream.set_output_buffer_max_size */
  final def setOutputBufferMaxSize(max_size_bytes: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("PacketPeerStream", "set_output_buffer_max_size", 1286410249L), hostObject.objectPtr, max_size_bytes)

  /** PacketPeerStream.get_input_buffer_max_size */
  final def getInputBufferMaxSize(): Long =
    Ptrcall.call0[Long](MethodBind.get("PacketPeerStream", "get_input_buffer_max_size", 3905245786L), hostObject.objectPtr)

  /** PacketPeerStream.get_output_buffer_max_size */
  final def getOutputBufferMaxSize(): Long =
    Ptrcall.call0[Long](MethodBind.get("PacketPeerStream", "get_output_buffer_max_size", 3905245786L), hostObject.objectPtr)

}
