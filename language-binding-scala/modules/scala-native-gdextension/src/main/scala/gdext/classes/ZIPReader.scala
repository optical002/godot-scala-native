package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `ZIPReader`, extends `RefCounted`. */
abstract class ZIPReader extends RefCounted {

  /** ZIPReader.open */
  final def open(path: String): Long =
    Ptrcall.call1[String, Long](MethodBind.get("ZIPReader", "open", 166001499L), hostObject.objectPtr, path)

  /** ZIPReader.close */
  final def close(): Long =
    Ptrcall.call0[Long](MethodBind.get("ZIPReader", "close", 166280745L), hostObject.objectPtr)

  /** ZIPReader.file_exists */
  final def fileExists(path: String, case_sensitive: Boolean): Boolean =
    Ptrcall.call2[String, Boolean, Boolean](MethodBind.get("ZIPReader", "file_exists", 35364943L), hostObject.objectPtr, path, case_sensitive)

  /** ZIPReader.get_compression_level */
  final def getCompressionLevel(path: String, case_sensitive: Boolean): Long =
    Ptrcall.call2[String, Boolean, Long](MethodBind.get("ZIPReader", "get_compression_level", 3694577386L), hostObject.objectPtr, path, case_sensitive)

}

object ZIPReader {
  /** Class metadata for Gd[ZIPReader] lifetime management and casting. */
  given GodotClass[ZIPReader] with {
    def className = "ZIPReader"
    def isRefCounted = true
    def wrap(o: GodotObject): ZIPReader = new ZIPReader {}.withHost(o.objectPtr)
    def unwrap(t: ZIPReader): GodotObject = t.hostObject
  }
}
