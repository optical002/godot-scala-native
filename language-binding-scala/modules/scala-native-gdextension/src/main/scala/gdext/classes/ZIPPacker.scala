package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `ZIPPacker`, extends `RefCounted`. */
abstract class ZIPPacker extends RefCounted {
  override def godotClassName: String = "ZIPPacker"

  /** ZIPPacker.open */
  final def open(path: String, append: Long): Long =
    Ptrcall.call2[String, Long, Long](MethodBind.get("ZIPPacker", "open", 1936816515L), hostObject.objectPtr, path, append)

  /** ZIPPacker.set_compression_level */
  final def setCompressionLevel(compression_level: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("ZIPPacker", "set_compression_level", 1286410249L), hostObject.objectPtr, compression_level)

  /** ZIPPacker.get_compression_level */
  final def getCompressionLevel(): Long =
    Ptrcall.call0[Long](MethodBind.get("ZIPPacker", "get_compression_level", 3905245786L), hostObject.objectPtr)

  /** ZIPPacker.start_file */
  final def startFile(path: String): Long =
    Ptrcall.call1[String, Long](MethodBind.get("ZIPPacker", "start_file", 166001499L), hostObject.objectPtr, path)

  /** ZIPPacker.close_file */
  final def closeFile(): Long =
    Ptrcall.call0[Long](MethodBind.get("ZIPPacker", "close_file", 166280745L), hostObject.objectPtr)

  /** ZIPPacker.close */
  final def close(): Long =
    Ptrcall.call0[Long](MethodBind.get("ZIPPacker", "close", 166280745L), hostObject.objectPtr)

}
