package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `EditorFileSystem`, extends `Node`. */
abstract class EditorFileSystem extends Node {
  override def godotClassName: String = "EditorFileSystem"

  /** EditorFileSystem.get_filesystem */
  final def getFilesystem(): EditorFileSystemDirectory = {
    if (gdext.classes.EditorFileSystem.mb_get_filesystem == null) gdext.classes.EditorFileSystem.mb_get_filesystem = MethodBind.get("EditorFileSystem", "get_filesystem", 842323275L)
    Wrappers.borrowed[EditorFileSystemDirectory](Ptrcall.call0[Long](gdext.classes.EditorFileSystem.mb_get_filesystem, livePtr))
  }

  /** EditorFileSystem.is_scanning */
  final def isScanning(): Boolean = {
    if (gdext.classes.EditorFileSystem.mb_is_scanning == null) gdext.classes.EditorFileSystem.mb_is_scanning = MethodBind.get("EditorFileSystem", "is_scanning", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.EditorFileSystem.mb_is_scanning, livePtr)
  }

  /** EditorFileSystem.get_scanning_progress */
  final def getScanningProgress(): Double = {
    if (gdext.classes.EditorFileSystem.mb_get_scanning_progress == null) gdext.classes.EditorFileSystem.mb_get_scanning_progress = MethodBind.get("EditorFileSystem", "get_scanning_progress", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.EditorFileSystem.mb_get_scanning_progress, livePtr)
  }

  /** EditorFileSystem.scan */
  final def scan(): Unit = {
    if (gdext.classes.EditorFileSystem.mb_scan == null) gdext.classes.EditorFileSystem.mb_scan = MethodBind.get("EditorFileSystem", "scan", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.EditorFileSystem.mb_scan, livePtr)
  }

  /** EditorFileSystem.scan_sources */
  final def scanSources(): Unit = {
    if (gdext.classes.EditorFileSystem.mb_scan_sources == null) gdext.classes.EditorFileSystem.mb_scan_sources = MethodBind.get("EditorFileSystem", "scan_sources", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.EditorFileSystem.mb_scan_sources, livePtr)
  }

  /** EditorFileSystem.update_file */
  final def updateFile(path: String): Unit = {
    if (gdext.classes.EditorFileSystem.mb_update_file == null) gdext.classes.EditorFileSystem.mb_update_file = MethodBind.get("EditorFileSystem", "update_file", 83702148L)
    Ptrcall.callVoid1(gdext.classes.EditorFileSystem.mb_update_file, livePtr, path)
  }

  /** EditorFileSystem.get_filesystem_path */
  final def getFilesystemPath(path: String): EditorFileSystemDirectory = {
    if (gdext.classes.EditorFileSystem.mb_get_filesystem_path == null) gdext.classes.EditorFileSystem.mb_get_filesystem_path = MethodBind.get("EditorFileSystem", "get_filesystem_path", 3188521125L)
    Wrappers.borrowed[EditorFileSystemDirectory](Ptrcall.call1[String, Long](gdext.classes.EditorFileSystem.mb_get_filesystem_path, livePtr, path))
  }

  /** EditorFileSystem.get_file_type */
  final def getFileType(path: String): String = {
    if (gdext.classes.EditorFileSystem.mb_get_file_type == null) gdext.classes.EditorFileSystem.mb_get_file_type = MethodBind.get("EditorFileSystem", "get_file_type", 3135753539L)
    Ptrcall.call1[String, String](gdext.classes.EditorFileSystem.mb_get_file_type, livePtr, path)
  }

}

object EditorFileSystem {
  private[classes] var mb_get_filesystem: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_scanning: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_scanning_progress: GDExtensionMethodBindPtr = null
  private[classes] var mb_scan: GDExtensionMethodBindPtr = null
  private[classes] var mb_scan_sources: GDExtensionMethodBindPtr = null
  private[classes] var mb_update_file: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_filesystem_path: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_file_type: GDExtensionMethodBindPtr = null
}
