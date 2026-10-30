package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `SocketServer`, extends `RefCounted`. */
abstract class SocketServer extends RefCounted {
  override def godotClassName: String = "SocketServer"

  /** SocketServer.is_connection_available */
  final def isConnectionAvailable(): Boolean = {
    if (gdext.classes.SocketServer.mb_is_connection_available == null) gdext.classes.SocketServer.mb_is_connection_available = MethodBind.get("SocketServer", "is_connection_available", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.SocketServer.mb_is_connection_available, livePtr)
  }

  /** SocketServer.is_listening */
  final def isListening(): Boolean = {
    if (gdext.classes.SocketServer.mb_is_listening == null) gdext.classes.SocketServer.mb_is_listening = MethodBind.get("SocketServer", "is_listening", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.SocketServer.mb_is_listening, livePtr)
  }

  /** SocketServer.stop */
  final def stop(): Unit = {
    if (gdext.classes.SocketServer.mb_stop == null) gdext.classes.SocketServer.mb_stop = MethodBind.get("SocketServer", "stop", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.SocketServer.mb_stop, livePtr)
  }

  /** SocketServer.take_socket_connection. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def takeSocketConnection(): StreamPeerSocket = {
    if (gdext.classes.SocketServer.mb_take_socket_connection == null) gdext.classes.SocketServer.mb_take_socket_connection = MethodBind.get("SocketServer", "take_socket_connection", 1883962599L)
    Wrappers.owned[StreamPeerSocket](Ptrcall.call0[Long](gdext.classes.SocketServer.mb_take_socket_connection, livePtr))
  }

}

object SocketServer {
  private[classes] var mb_is_connection_available: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_listening: GDExtensionMethodBindPtr = null
  private[classes] var mb_stop: GDExtensionMethodBindPtr = null
  private[classes] var mb_take_socket_connection: GDExtensionMethodBindPtr = null
}
