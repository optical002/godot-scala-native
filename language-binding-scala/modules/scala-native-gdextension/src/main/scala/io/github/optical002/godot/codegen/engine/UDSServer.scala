package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `UDSServer`, extends `SocketServer`. */
abstract class UDSServer extends SocketServer {

  /** UDSServer.listen */
  final def listen(path: String): Long =
    Ptrcall.call1[String, Long](MethodBind.get("UDSServer", "listen", 166001499L), hostObject.objectPtr, path)

  /** UDSServer.take_connection */
  final def takeConnection(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("UDSServer", "take_connection", 1623851112L), hostObject.objectPtr)

}

object UDSServer {
  /** Class metadata for Gd[UDSServer] lifetime management and casting. */
  given GodotClass[UDSServer] with {
    def className = "UDSServer"
    def isRefCounted = true
    def wrap(o: GodotObject): UDSServer = new UDSServer {}.withHost(o.objectPtr)
    def unwrap(t: UDSServer): GodotObject = t.hostObject
  }
}
