package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `UDPServer`, extends `RefCounted`. */
abstract class UDPServer extends RefCounted {

  /** UDPServer.listen */
  final def listen(port: Long, bind_address: String): Long =
    Ptrcall.call2[Long, String, Long](MethodBind.get("UDPServer", "listen", 3167955072L), hostObject.objectPtr, port, bind_address)

  /** UDPServer.poll */
  final def poll(): Long =
    Ptrcall.call0[Long](MethodBind.get("UDPServer", "poll", 166280745L), hostObject.objectPtr)

  /** UDPServer.is_connection_available */
  final def isConnectionAvailable(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("UDPServer", "is_connection_available", 36873697L), hostObject.objectPtr)

  /** UDPServer.get_local_port */
  final def getLocalPort(): Long =
    Ptrcall.call0[Long](MethodBind.get("UDPServer", "get_local_port", 3905245786L), hostObject.objectPtr)

  /** UDPServer.is_listening */
  final def isListening(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("UDPServer", "is_listening", 36873697L), hostObject.objectPtr)

  /** UDPServer.take_connection */
  final def takeConnection(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("UDPServer", "take_connection", 808734560L), hostObject.objectPtr)

  /** UDPServer.stop */
  final def stop(): Unit =
    Ptrcall.callVoid0(MethodBind.get("UDPServer", "stop", 3218959716L), hostObject.objectPtr)

  /** UDPServer.set_max_pending_connections */
  final def setMaxPendingConnections(max_pending_connections: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("UDPServer", "set_max_pending_connections", 1286410249L), hostObject.objectPtr, max_pending_connections)

  /** UDPServer.get_max_pending_connections */
  final def getMaxPendingConnections(): Long =
    Ptrcall.call0[Long](MethodBind.get("UDPServer", "get_max_pending_connections", 3905245786L), hostObject.objectPtr)

}

object UDPServer {
  /** Class metadata for Gd[UDPServer] lifetime management and casting. */
  given GodotClass[UDPServer] with {
    def className = "UDPServer"
    def isRefCounted = true
    def wrap(o: GodotObject): UDPServer = new UDPServer {}.withHost(o.objectPtr)
    def unwrap(t: UDPServer): GodotObject = t.hostObject
  }
}
