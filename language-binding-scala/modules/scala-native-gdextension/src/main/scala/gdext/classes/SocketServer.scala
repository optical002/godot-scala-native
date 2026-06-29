package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `SocketServer`, extends `RefCounted`. */
abstract class SocketServer extends RefCounted {
  override def godotClassName: String = "SocketServer"

  /** SocketServer.is_connection_available */
  final def isConnectionAvailable(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("SocketServer", "is_connection_available", 36873697L), hostObject.objectPtr)

  /** SocketServer.is_listening */
  final def isListening(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("SocketServer", "is_listening", 36873697L), hostObject.objectPtr)

  /** SocketServer.stop */
  final def stop(): Unit =
    Ptrcall.callVoid0(MethodBind.get("SocketServer", "stop", 3218959716L), hostObject.objectPtr)

  /** SocketServer.take_socket_connection */
  final def takeSocketConnection(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("SocketServer", "take_socket_connection", 1883962599L), hostObject.objectPtr)

}
