package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `SocketServer`, extends `RefCounted`. */
abstract class SocketServer extends RefCounted {

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

object SocketServer {
  /** Class metadata for Gd[SocketServer] lifetime management and casting. */
  given GodotClass[SocketServer] with {
    def className = "SocketServer"
    def isRefCounted = true
    def wrap(o: GodotObject): SocketServer = new SocketServer {}.withHost(o.objectPtr)
    def unwrap(t: SocketServer): GodotObject = t.hostObject
  }
}
