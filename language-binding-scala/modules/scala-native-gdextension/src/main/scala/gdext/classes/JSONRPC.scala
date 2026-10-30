package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
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

  /** Godot enum `JSONRPC.ErrorCode`. */
  opaque type ErrorCode <: Long = Long

  object ErrorCode {
    final val ParseError: ErrorCode = -32700L.asInstanceOf[ErrorCode]
    final val InvalidRequest: ErrorCode = -32600L.asInstanceOf[ErrorCode]
    final val MethodNotFound: ErrorCode = -32601L.asInstanceOf[ErrorCode]
    final val InvalidParams: ErrorCode = -32602L.asInstanceOf[ErrorCode]
    final val InternalError: ErrorCode = -32603L.asInstanceOf[ErrorCode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ErrorCode = value.asInstanceOf[ErrorCode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ErrorCode] = scala.IArray[Long](-32700L, -32603L, -32602L, -32601L, -32600L).asInstanceOf[scala.IArray[ErrorCode]]

    extension (self: ErrorCode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case -32700L => "ParseError"
        case -32603L => "InternalError"
        case -32602L => "InvalidParams"
        case -32601L => "MethodNotFound"
        case -32600L => "InvalidRequest"
        case other => other.toString
      }
  }
}
