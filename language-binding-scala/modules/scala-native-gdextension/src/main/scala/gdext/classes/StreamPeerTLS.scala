package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `StreamPeerTLS`, extends `StreamPeer`. */
abstract class StreamPeerTLS extends StreamPeer {
  override def godotClassName: String = "StreamPeerTLS"

  /** StreamPeerTLS.poll */
  final def poll(): Unit =
    Ptrcall.callVoid0(MethodBind.get("StreamPeerTLS", "poll", 3218959716L), hostObject.objectPtr)

  /** StreamPeerTLS.accept_stream */
  final def acceptStream(stream: StreamPeer, server_options: TLSOptions): Long =
    Ptrcall.call2[GodotObject, GodotObject, Long](MethodBind.get("StreamPeerTLS", "accept_stream", 4292689651L), hostObject.objectPtr, stream.hostObject, server_options.hostObject)

  /** StreamPeerTLS.connect_to_stream */
  final def connectToStream(stream: StreamPeer, common_name: String, client_options: TLSOptions): Long =
    Ptrcall.call3[GodotObject, String, GodotObject, Long](MethodBind.get("StreamPeerTLS", "connect_to_stream", 57169517L), hostObject.objectPtr, stream.hostObject, common_name, client_options.hostObject)

  /** StreamPeerTLS.get_status */
  final def getStatus(): Long =
    Ptrcall.call0[Long](MethodBind.get("StreamPeerTLS", "get_status", 1128380576L), hostObject.objectPtr)

  /** StreamPeerTLS.get_stream */
  final def getStream(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("StreamPeerTLS", "get_stream", 2741655269L), hostObject.objectPtr)

  /** StreamPeerTLS.disconnect_from_stream */
  final def disconnectFromStream(): Unit =
    Ptrcall.callVoid0(MethodBind.get("StreamPeerTLS", "disconnect_from_stream", 3218959716L), hostObject.objectPtr)

}
