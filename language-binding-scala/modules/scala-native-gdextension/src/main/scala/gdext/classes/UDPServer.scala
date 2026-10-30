package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `UDPServer`, extends `RefCounted`. */
abstract class UDPServer extends RefCounted {
  override def godotClassName: String = "UDPServer"

  /** UDPServer.listen */
  final def listen(port: Long, bindAddress: String = "*"): gdext.classes.Error = {
    if (gdext.classes.UDPServer.mb_listen == null) gdext.classes.UDPServer.mb_listen = MethodBind.get("UDPServer", "listen", 3167955072L)
    gdext.classes.Error(Ptrcall.call2[Long, String, Long](gdext.classes.UDPServer.mb_listen, livePtr, port, bindAddress))
  }

  /** UDPServer.poll */
  final def poll(): gdext.classes.Error = {
    if (gdext.classes.UDPServer.mb_poll == null) gdext.classes.UDPServer.mb_poll = MethodBind.get("UDPServer", "poll", 166280745L)
    gdext.classes.Error(Ptrcall.call0[Long](gdext.classes.UDPServer.mb_poll, livePtr))
  }

  /** UDPServer.is_connection_available */
  final def isConnectionAvailable(): Boolean = {
    if (gdext.classes.UDPServer.mb_is_connection_available == null) gdext.classes.UDPServer.mb_is_connection_available = MethodBind.get("UDPServer", "is_connection_available", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.UDPServer.mb_is_connection_available, livePtr)
  }

  /** UDPServer.get_local_port */
  final def getLocalPort(): Long = {
    if (gdext.classes.UDPServer.mb_get_local_port == null) gdext.classes.UDPServer.mb_get_local_port = MethodBind.get("UDPServer", "get_local_port", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.UDPServer.mb_get_local_port, livePtr)
  }

  /** UDPServer.is_listening */
  final def isListening(): Boolean = {
    if (gdext.classes.UDPServer.mb_is_listening == null) gdext.classes.UDPServer.mb_is_listening = MethodBind.get("UDPServer", "is_listening", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.UDPServer.mb_is_listening, livePtr)
  }

  /** UDPServer.take_connection. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def takeConnection(): PacketPeerUDP = {
    if (gdext.classes.UDPServer.mb_take_connection == null) gdext.classes.UDPServer.mb_take_connection = MethodBind.get("UDPServer", "take_connection", 808734560L)
    Wrappers.owned[PacketPeerUDP](Ptrcall.call0[Long](gdext.classes.UDPServer.mb_take_connection, livePtr))
  }

  /** UDPServer.stop */
  final def stop(): Unit = {
    if (gdext.classes.UDPServer.mb_stop == null) gdext.classes.UDPServer.mb_stop = MethodBind.get("UDPServer", "stop", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.UDPServer.mb_stop, livePtr)
  }

  /** UDPServer.set_max_pending_connections */
  final def setMaxPendingConnections(maxPendingConnections: Long): Unit = {
    if (gdext.classes.UDPServer.mb_set_max_pending_connections == null) gdext.classes.UDPServer.mb_set_max_pending_connections = MethodBind.get("UDPServer", "set_max_pending_connections", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.UDPServer.mb_set_max_pending_connections, livePtr, maxPendingConnections)
  }

  /** UDPServer.get_max_pending_connections */
  final def getMaxPendingConnections(): Long = {
    if (gdext.classes.UDPServer.mb_get_max_pending_connections == null) gdext.classes.UDPServer.mb_get_max_pending_connections = MethodBind.get("UDPServer", "get_max_pending_connections", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.UDPServer.mb_get_max_pending_connections, livePtr)
  }

}

object UDPServer {
  private[classes] var mb_listen: GDExtensionMethodBindPtr = null
  private[classes] var mb_poll: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_connection_available: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_local_port: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_listening: GDExtensionMethodBindPtr = null
  private[classes] var mb_take_connection: GDExtensionMethodBindPtr = null
  private[classes] var mb_stop: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_max_pending_connections: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_max_pending_connections: GDExtensionMethodBindPtr = null
}
