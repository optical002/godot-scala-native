package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `PCKPacker`, extends `RefCounted`. */
abstract class PCKPacker extends RefCounted {
  override def godotClassName: String = "PCKPacker"

  /** PCKPacker.pck_start */
  final def pckStart(pck_path: String, alignment: Long, key: String, encrypt_directory: Boolean): Long =
    Ptrcall.call4[String, Long, String, Boolean, Long](MethodBind.get("PCKPacker", "pck_start", 508410629L), hostObject.objectPtr, pck_path, alignment, key, encrypt_directory)

  /** PCKPacker.add_file */
  final def addFile(target_path: String, source_path: String, encrypt: Boolean): Long =
    Ptrcall.call3[String, String, Boolean, Long](MethodBind.get("PCKPacker", "add_file", 2215643711L), hostObject.objectPtr, target_path, source_path, encrypt)

  /** PCKPacker.add_file_removal */
  final def addFileRemoval(target_path: String): Long =
    Ptrcall.call1[String, Long](MethodBind.get("PCKPacker", "add_file_removal", 166001499L), hostObject.objectPtr, target_path)

  /** PCKPacker.flush */
  final def flush(verbose: Boolean): Long =
    Ptrcall.call1[Boolean, Long](MethodBind.get("PCKPacker", "flush", 1633102583L), hostObject.objectPtr, verbose)

}
