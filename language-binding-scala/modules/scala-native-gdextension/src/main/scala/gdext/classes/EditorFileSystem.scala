package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorFileSystem`, extends `Node`. */
abstract class EditorFileSystem extends Node {
  override def godotClassName: String = "EditorFileSystem"

  /** EditorFileSystem.get_filesystem */
  final def getFilesystem(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("EditorFileSystem", "get_filesystem", 842323275L), hostObject.objectPtr)

  /** EditorFileSystem.is_scanning */
  final def isScanning(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("EditorFileSystem", "is_scanning", 36873697L), hostObject.objectPtr)

  /** EditorFileSystem.get_scanning_progress */
  final def getScanningProgress(): Double =
    Ptrcall.call0[Double](MethodBind.get("EditorFileSystem", "get_scanning_progress", 1740695150L), hostObject.objectPtr)

  /** EditorFileSystem.scan */
  final def scan(): Unit =
    Ptrcall.callVoid0(MethodBind.get("EditorFileSystem", "scan", 3218959716L), hostObject.objectPtr)

  /** EditorFileSystem.scan_sources */
  final def scanSources(): Unit =
    Ptrcall.callVoid0(MethodBind.get("EditorFileSystem", "scan_sources", 3218959716L), hostObject.objectPtr)

  /** EditorFileSystem.update_file */
  final def updateFile(path: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorFileSystem", "update_file", 83702148L), hostObject.objectPtr, path)

  /** EditorFileSystem.get_filesystem_path */
  final def getFilesystemPath(path: String): GodotObject =
    Ptrcall.call1[String, GodotObject](MethodBind.get("EditorFileSystem", "get_filesystem_path", 3188521125L), hostObject.objectPtr, path)

  /** EditorFileSystem.get_file_type */
  final def getFileType(path: String): String =
    Ptrcall.call1[String, String](MethodBind.get("EditorFileSystem", "get_file_type", 3135753539L), hostObject.objectPtr, path)

}
