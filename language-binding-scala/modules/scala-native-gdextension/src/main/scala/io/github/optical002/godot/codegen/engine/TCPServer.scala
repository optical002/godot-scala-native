package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `TCPServer`, extends `SocketServer`. */
abstract class TCPServer extends SocketServer {

  /** TCPServer.listen */
  final def listen(port: Long, bind_address: String): Long =
    Ptrcall.call2[Long, String, Long](MethodBind.get("TCPServer", "listen", 3167955072L), hostObject.objectPtr, port, bind_address)

  /** TCPServer.get_local_port */
  final def getLocalPort(): Long =
    Ptrcall.call0[Long](MethodBind.get("TCPServer", "get_local_port", 3905245786L), hostObject.objectPtr)

  /** TCPServer.take_connection */
  final def takeConnection(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("TCPServer", "take_connection", 30545006L), hostObject.objectPtr)

}

object TCPServer {
  /** Class metadata for Gd[TCPServer] lifetime management and casting. */
  given GodotClass[TCPServer] with {
    def className = "TCPServer"
    def isRefCounted = true
    def wrap(o: GodotObject): TCPServer = new TCPServer {}.withHost(o.objectPtr)
    def unwrap(t: TCPServer): GodotObject = t.hostObject
  }
}
