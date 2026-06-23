package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `JSONRPC`, extends `Object`. */
abstract class JSONRPC extends Object {

  /** JSONRPC.process_string */
  final def processString(action: String): String =
    Ptrcall.call1[String, String](MethodBind.get("JSONRPC", "process_string", 1703090593L), hostObject.objectPtr, action)

}

object JSONRPC {
  /** Class metadata for Gd[JSONRPC] lifetime management and casting. */
  given GodotClass[JSONRPC] with {
    def className = "JSONRPC"
    def isRefCounted = false
    def wrap(o: GodotObject): JSONRPC = new JSONRPC {}.withHost(o.objectPtr)
    def unwrap(t: JSONRPC): GodotObject = t.hostObject
  }
}
