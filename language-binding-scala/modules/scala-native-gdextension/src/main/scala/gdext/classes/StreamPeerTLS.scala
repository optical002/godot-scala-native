package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `StreamPeerTLS`, extends `StreamPeer`. */
abstract class StreamPeerTLS extends StreamPeer {
  override def godotClassName: String = "StreamPeerTLS"

  /** StreamPeerTLS.poll */
  final def poll(): Unit = {
    if (gdext.classes.StreamPeerTLS.mb_poll == null) gdext.classes.StreamPeerTLS.mb_poll = MethodBind.get("StreamPeerTLS", "poll", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.StreamPeerTLS.mb_poll, livePtr)
  }

  /** StreamPeerTLS.accept_stream */
  final def acceptStream(stream: StreamPeer, server_options: TLSOptions): Long = {
    if (gdext.classes.StreamPeerTLS.mb_accept_stream == null) gdext.classes.StreamPeerTLS.mb_accept_stream = MethodBind.get("StreamPeerTLS", "accept_stream", 4292689651L)
    Ptrcall.call2[GodotObject, GodotObject, Long](gdext.classes.StreamPeerTLS.mb_accept_stream, livePtr, Wrappers.handle(stream), Wrappers.handle(server_options))
  }

  /** StreamPeerTLS.connect_to_stream */
  final def connectToStream(stream: StreamPeer, common_name: String, client_options: TLSOptions): Long = {
    if (gdext.classes.StreamPeerTLS.mb_connect_to_stream == null) gdext.classes.StreamPeerTLS.mb_connect_to_stream = MethodBind.get("StreamPeerTLS", "connect_to_stream", 57169517L)
    Ptrcall.call3[GodotObject, String, GodotObject, Long](gdext.classes.StreamPeerTLS.mb_connect_to_stream, livePtr, Wrappers.handle(stream), common_name, Wrappers.handle(client_options))
  }

  /** StreamPeerTLS.get_status */
  final def getStatus(): Long = {
    if (gdext.classes.StreamPeerTLS.mb_get_status == null) gdext.classes.StreamPeerTLS.mb_get_status = MethodBind.get("StreamPeerTLS", "get_status", 1128380576L)
    Ptrcall.call0[Long](gdext.classes.StreamPeerTLS.mb_get_status, livePtr)
  }

  /** StreamPeerTLS.get_stream. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getStream(): StreamPeer = {
    if (gdext.classes.StreamPeerTLS.mb_get_stream == null) gdext.classes.StreamPeerTLS.mb_get_stream = MethodBind.get("StreamPeerTLS", "get_stream", 2741655269L)
    Wrappers.owned[StreamPeer](Ptrcall.call0[Long](gdext.classes.StreamPeerTLS.mb_get_stream, livePtr))
  }

  /** StreamPeerTLS.disconnect_from_stream */
  final def disconnectFromStream(): Unit = {
    if (gdext.classes.StreamPeerTLS.mb_disconnect_from_stream == null) gdext.classes.StreamPeerTLS.mb_disconnect_from_stream = MethodBind.get("StreamPeerTLS", "disconnect_from_stream", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.StreamPeerTLS.mb_disconnect_from_stream, livePtr)
  }

}

object StreamPeerTLS {
  private[classes] var mb_poll: GDExtensionMethodBindPtr = null
  private[classes] var mb_accept_stream: GDExtensionMethodBindPtr = null
  private[classes] var mb_connect_to_stream: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_status: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_stream: GDExtensionMethodBindPtr = null
  private[classes] var mb_disconnect_from_stream: GDExtensionMethodBindPtr = null
}
