package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `ZIPReader`, extends `RefCounted`. */
abstract class ZIPReader extends RefCounted {
  override def godotClassName: String = "ZIPReader"

  /** ZIPReader.open */
  final def open(path: String): gdext.classes.Error = {
    if (gdext.classes.ZIPReader.mb_open == null) gdext.classes.ZIPReader.mb_open = MethodBind.get("ZIPReader", "open", 166001499L)
    gdext.classes.Error(Ptrcall.call1[String, Long](gdext.classes.ZIPReader.mb_open, livePtr, path))
  }

  /** ZIPReader.close */
  final def close(): gdext.classes.Error = {
    if (gdext.classes.ZIPReader.mb_close == null) gdext.classes.ZIPReader.mb_close = MethodBind.get("ZIPReader", "close", 166280745L)
    gdext.classes.Error(Ptrcall.call0[Long](gdext.classes.ZIPReader.mb_close, livePtr))
  }

  /** ZIPReader.file_exists */
  final def fileExists(path: String, caseSensitive: Boolean = true): Boolean = {
    if (gdext.classes.ZIPReader.mb_file_exists == null) gdext.classes.ZIPReader.mb_file_exists = MethodBind.get("ZIPReader", "file_exists", 35364943L)
    Ptrcall.call2[String, Boolean, Boolean](gdext.classes.ZIPReader.mb_file_exists, livePtr, path, caseSensitive)
  }

  /** ZIPReader.get_compression_level */
  final def getCompressionLevel(path: String, caseSensitive: Boolean = true): Long = {
    if (gdext.classes.ZIPReader.mb_get_compression_level == null) gdext.classes.ZIPReader.mb_get_compression_level = MethodBind.get("ZIPReader", "get_compression_level", 3694577386L)
    Ptrcall.call2[String, Boolean, Long](gdext.classes.ZIPReader.mb_get_compression_level, livePtr, path, caseSensitive)
  }

}

object ZIPReader {
  private[classes] var mb_open: GDExtensionMethodBindPtr = null
  private[classes] var mb_close: GDExtensionMethodBindPtr = null
  private[classes] var mb_file_exists: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_compression_level: GDExtensionMethodBindPtr = null
}
