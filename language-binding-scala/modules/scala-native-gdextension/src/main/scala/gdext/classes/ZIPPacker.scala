package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `ZIPPacker`, extends `RefCounted`. */
abstract class ZIPPacker extends RefCounted {
  override def godotClassName: String = "ZIPPacker"

  /** ZIPPacker.open */
  final def open(path: String, append: gdext.classes.ZIPPacker.ZipAppend = gdext.classes.ZIPPacker.ZipAppend(0L)): gdext.classes.Error = {
    if (gdext.classes.ZIPPacker.mb_open == null) gdext.classes.ZIPPacker.mb_open = MethodBind.get("ZIPPacker", "open", 1936816515L)
    gdext.classes.Error(Ptrcall.call2[String, Long, Long](gdext.classes.ZIPPacker.mb_open, livePtr, path, append))
  }

  /** ZIPPacker.set_compression_level */
  final def setCompressionLevel(compressionLevel: Long): Unit = {
    if (gdext.classes.ZIPPacker.mb_set_compression_level == null) gdext.classes.ZIPPacker.mb_set_compression_level = MethodBind.get("ZIPPacker", "set_compression_level", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.ZIPPacker.mb_set_compression_level, livePtr, compressionLevel)
  }

  /** ZIPPacker.get_compression_level */
  final def getCompressionLevel(): Long = {
    if (gdext.classes.ZIPPacker.mb_get_compression_level == null) gdext.classes.ZIPPacker.mb_get_compression_level = MethodBind.get("ZIPPacker", "get_compression_level", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.ZIPPacker.mb_get_compression_level, livePtr)
  }

  /** ZIPPacker.start_file */
  final def startFile(path: String): gdext.classes.Error = {
    if (gdext.classes.ZIPPacker.mb_start_file == null) gdext.classes.ZIPPacker.mb_start_file = MethodBind.get("ZIPPacker", "start_file", 166001499L)
    gdext.classes.Error(Ptrcall.call1[String, Long](gdext.classes.ZIPPacker.mb_start_file, livePtr, path))
  }

  /** ZIPPacker.close_file */
  final def closeFile(): gdext.classes.Error = {
    if (gdext.classes.ZIPPacker.mb_close_file == null) gdext.classes.ZIPPacker.mb_close_file = MethodBind.get("ZIPPacker", "close_file", 166280745L)
    gdext.classes.Error(Ptrcall.call0[Long](gdext.classes.ZIPPacker.mb_close_file, livePtr))
  }

  /** ZIPPacker.close */
  final def close(): gdext.classes.Error = {
    if (gdext.classes.ZIPPacker.mb_close == null) gdext.classes.ZIPPacker.mb_close = MethodBind.get("ZIPPacker", "close", 166280745L)
    gdext.classes.Error(Ptrcall.call0[Long](gdext.classes.ZIPPacker.mb_close, livePtr))
  }

}

object ZIPPacker {
  private[classes] var mb_open: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_compression_level: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_compression_level: GDExtensionMethodBindPtr = null
  private[classes] var mb_start_file: GDExtensionMethodBindPtr = null
  private[classes] var mb_close_file: GDExtensionMethodBindPtr = null
  private[classes] var mb_close: GDExtensionMethodBindPtr = null

  /** Godot enum `ZIPPacker.ZipAppend`. */
  opaque type ZipAppend <: Long = Long

  object ZipAppend {
    final val Create: ZipAppend = 0L.asInstanceOf[ZipAppend]
    final val Createafter: ZipAppend = 1L.asInstanceOf[ZipAppend]
    final val Addinzip: ZipAppend = 2L.asInstanceOf[ZipAppend]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ZipAppend = value.asInstanceOf[ZipAppend]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ZipAppend] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[ZipAppend]]

    extension (self: ZipAppend)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Create"
        case 1L => "Createafter"
        case 2L => "Addinzip"
        case other => other.toString
      }
  }

  /** Godot enum `ZIPPacker.CompressionLevel`. */
  opaque type CompressionLevel <: Long = Long

  object CompressionLevel {
    final val Default: CompressionLevel = -1L.asInstanceOf[CompressionLevel]
    final val None: CompressionLevel = 0L.asInstanceOf[CompressionLevel]
    final val Fast: CompressionLevel = 1L.asInstanceOf[CompressionLevel]
    final val Best: CompressionLevel = 9L.asInstanceOf[CompressionLevel]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): CompressionLevel = value.asInstanceOf[CompressionLevel]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[CompressionLevel] = scala.IArray[Long](-1L, 0L, 1L, 9L).asInstanceOf[scala.IArray[CompressionLevel]]

    extension (self: CompressionLevel)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case -1L => "Default"
        case 0L => "None"
        case 1L => "Fast"
        case 9L => "Best"
        case other => other.toString
      }
  }
}
