package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorFileSystemDirectory`, extends `Object`. */
abstract class EditorFileSystemDirectory extends Object {

  /** EditorFileSystemDirectory.get_subdir_count */
  final def getSubdirCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("EditorFileSystemDirectory", "get_subdir_count", 3905245786L), hostObject.objectPtr)

  /** EditorFileSystemDirectory.get_subdir */
  final def getSubdir(idx: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("EditorFileSystemDirectory", "get_subdir", 2330964164L), hostObject.objectPtr, idx)

  /** EditorFileSystemDirectory.get_file_count */
  final def getFileCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("EditorFileSystemDirectory", "get_file_count", 3905245786L), hostObject.objectPtr)

  /** EditorFileSystemDirectory.get_file */
  final def getFile(idx: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("EditorFileSystemDirectory", "get_file", 844755477L), hostObject.objectPtr, idx)

  /** EditorFileSystemDirectory.get_file_path */
  final def getFilePath(idx: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("EditorFileSystemDirectory", "get_file_path", 844755477L), hostObject.objectPtr, idx)

  /** EditorFileSystemDirectory.get_file_type */
  final def getFileType(idx: Long): gdext.builtin.StringName =
    Ptrcall.call1[Long, gdext.builtin.StringName](MethodBind.get("EditorFileSystemDirectory", "get_file_type", 659327637L), hostObject.objectPtr, idx)

  /** EditorFileSystemDirectory.get_file_script_class_name */
  final def getFileScriptClassName(idx: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("EditorFileSystemDirectory", "get_file_script_class_name", 844755477L), hostObject.objectPtr, idx)

  /** EditorFileSystemDirectory.get_file_script_class_extends */
  final def getFileScriptClassExtends(idx: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("EditorFileSystemDirectory", "get_file_script_class_extends", 844755477L), hostObject.objectPtr, idx)

  /** EditorFileSystemDirectory.get_file_import_is_valid */
  final def getFileImportIsValid(idx: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("EditorFileSystemDirectory", "get_file_import_is_valid", 1116898809L), hostObject.objectPtr, idx)

  /** EditorFileSystemDirectory.get_name */
  final def getName(): String =
    Ptrcall.call0[String](MethodBind.get("EditorFileSystemDirectory", "get_name", 2841200299L), hostObject.objectPtr)

  /** EditorFileSystemDirectory.get_path */
  final def getPath(): String =
    Ptrcall.call0[String](MethodBind.get("EditorFileSystemDirectory", "get_path", 201670096L), hostObject.objectPtr)

  /** EditorFileSystemDirectory.get_parent */
  final def getParent(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("EditorFileSystemDirectory", "get_parent", 842323275L), hostObject.objectPtr)

  /** EditorFileSystemDirectory.find_file_index */
  final def findFileIndex(name: String): Long =
    Ptrcall.call1[String, Long](MethodBind.get("EditorFileSystemDirectory", "find_file_index", 1321353865L), hostObject.objectPtr, name)

  /** EditorFileSystemDirectory.find_dir_index */
  final def findDirIndex(name: String): Long =
    Ptrcall.call1[String, Long](MethodBind.get("EditorFileSystemDirectory", "find_dir_index", 1321353865L), hostObject.objectPtr, name)

}

object EditorFileSystemDirectory {
  /** Class metadata for Gd[EditorFileSystemDirectory] lifetime management and casting. */
  given GodotClass[EditorFileSystemDirectory] with {
    def className = "EditorFileSystemDirectory"
    def isRefCounted = false
    def wrap(o: GodotObject): EditorFileSystemDirectory = new EditorFileSystemDirectory {}.withHost(o.objectPtr)
    def unwrap(t: EditorFileSystemDirectory): GodotObject = t.hostObject
  }
}
