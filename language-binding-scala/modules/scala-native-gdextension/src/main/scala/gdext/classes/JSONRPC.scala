package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `JSONRPC`, extends `Object`. */
abstract class JSONRPC extends Object {
  override def godotClassName: String = "JSONRPC"

  /** JSONRPC.process_string */
  final def processString(action: String): String = {
    if (gdext.classes.JSONRPC.mb_process_string == null) gdext.classes.JSONRPC.mb_process_string = MethodBind.get("JSONRPC", "process_string", 1703090593L)
    Ptrcall.call1[String, String](gdext.classes.JSONRPC.mb_process_string, livePtr, action)
  }

}

object JSONRPC {
  private[classes] var mb_process_string: GDExtensionMethodBindPtr = null
}
