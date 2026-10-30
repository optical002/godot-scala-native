package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `PCKPacker`, extends `RefCounted`. */
abstract class PCKPacker extends RefCounted {
  override def godotClassName: String = "PCKPacker"

  /** PCKPacker.pck_start */
  final def pckStart(pckPath: String, alignment: Long = 32L, key: String = "0000000000000000000000000000000000000000000000000000000000000000", encryptDirectory: Boolean = false): gdext.classes.Error = {
    if (gdext.classes.PCKPacker.mb_pck_start == null) gdext.classes.PCKPacker.mb_pck_start = MethodBind.get("PCKPacker", "pck_start", 508410629L)
    gdext.classes.Error(Ptrcall.call4[String, Long, String, Boolean, Long](gdext.classes.PCKPacker.mb_pck_start, livePtr, pckPath, alignment, key, encryptDirectory))
  }

  /** PCKPacker.add_file */
  final def addFile(targetPath: String, sourcePath: String, encrypt: Boolean = false): gdext.classes.Error = {
    if (gdext.classes.PCKPacker.mb_add_file == null) gdext.classes.PCKPacker.mb_add_file = MethodBind.get("PCKPacker", "add_file", 2215643711L)
    gdext.classes.Error(Ptrcall.call3[String, String, Boolean, Long](gdext.classes.PCKPacker.mb_add_file, livePtr, targetPath, sourcePath, encrypt))
  }

  /** PCKPacker.add_file_removal */
  final def addFileRemoval(targetPath: String): gdext.classes.Error = {
    if (gdext.classes.PCKPacker.mb_add_file_removal == null) gdext.classes.PCKPacker.mb_add_file_removal = MethodBind.get("PCKPacker", "add_file_removal", 166001499L)
    gdext.classes.Error(Ptrcall.call1[String, Long](gdext.classes.PCKPacker.mb_add_file_removal, livePtr, targetPath))
  }

  /** PCKPacker.flush */
  final def flush(verbose: Boolean = false): gdext.classes.Error = {
    if (gdext.classes.PCKPacker.mb_flush == null) gdext.classes.PCKPacker.mb_flush = MethodBind.get("PCKPacker", "flush", 1633102583L)
    gdext.classes.Error(Ptrcall.call1[Boolean, Long](gdext.classes.PCKPacker.mb_flush, livePtr, verbose))
  }

}

object PCKPacker {
  private[classes] var mb_pck_start: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_file: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_file_removal: GDExtensionMethodBindPtr = null
  private[classes] var mb_flush: GDExtensionMethodBindPtr = null
}
