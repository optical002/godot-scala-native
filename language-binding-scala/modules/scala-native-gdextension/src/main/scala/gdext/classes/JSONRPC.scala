package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `JSONRPC`, extends `Object`. */
abstract class JSONRPC extends Object {
  override def godotClassName: String = "JSONRPC"

  /** JSONRPC.process_string */
  final def processString(action: String): String =
    Ptrcall.call1[String, String](MethodBind.get("JSONRPC", "process_string", 1703090593L), hostObject.objectPtr, action)

}
