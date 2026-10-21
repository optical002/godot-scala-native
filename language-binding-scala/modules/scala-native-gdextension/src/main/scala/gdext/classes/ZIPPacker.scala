package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `ZIPPacker`, extends `RefCounted`. */
abstract class ZIPPacker extends RefCounted {
  override def godotClassName: String = "ZIPPacker"

  /** ZIPPacker.open */
  final def open(path: String, append: Long): Long = {
    if (gdext.classes.ZIPPacker.mb_open == null) gdext.classes.ZIPPacker.mb_open = MethodBind.get("ZIPPacker", "open", 1936816515L)
    Ptrcall.call2[String, Long, Long](gdext.classes.ZIPPacker.mb_open, livePtr, path, append)
  }

  /** ZIPPacker.set_compression_level */
  final def setCompressionLevel(compression_level: Long): Unit = {
    if (gdext.classes.ZIPPacker.mb_set_compression_level == null) gdext.classes.ZIPPacker.mb_set_compression_level = MethodBind.get("ZIPPacker", "set_compression_level", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.ZIPPacker.mb_set_compression_level, livePtr, compression_level)
  }

  /** ZIPPacker.get_compression_level */
  final def getCompressionLevel(): Long = {
    if (gdext.classes.ZIPPacker.mb_get_compression_level == null) gdext.classes.ZIPPacker.mb_get_compression_level = MethodBind.get("ZIPPacker", "get_compression_level", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.ZIPPacker.mb_get_compression_level, livePtr)
  }

  /** ZIPPacker.start_file */
  final def startFile(path: String): Long = {
    if (gdext.classes.ZIPPacker.mb_start_file == null) gdext.classes.ZIPPacker.mb_start_file = MethodBind.get("ZIPPacker", "start_file", 166001499L)
    Ptrcall.call1[String, Long](gdext.classes.ZIPPacker.mb_start_file, livePtr, path)
  }

  /** ZIPPacker.close_file */
  final def closeFile(): Long = {
    if (gdext.classes.ZIPPacker.mb_close_file == null) gdext.classes.ZIPPacker.mb_close_file = MethodBind.get("ZIPPacker", "close_file", 166280745L)
    Ptrcall.call0[Long](gdext.classes.ZIPPacker.mb_close_file, livePtr)
  }

  /** ZIPPacker.close */
  final def close(): Long = {
    if (gdext.classes.ZIPPacker.mb_close == null) gdext.classes.ZIPPacker.mb_close = MethodBind.get("ZIPPacker", "close", 166280745L)
    Ptrcall.call0[Long](gdext.classes.ZIPPacker.mb_close, livePtr)
  }

}

object ZIPPacker {
  private[classes] var mb_open: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_compression_level: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_compression_level: GDExtensionMethodBindPtr = null
  private[classes] var mb_start_file: GDExtensionMethodBindPtr = null
  private[classes] var mb_close_file: GDExtensionMethodBindPtr = null
  private[classes] var mb_close: GDExtensionMethodBindPtr = null
}
