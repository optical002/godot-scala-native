package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `EditorFileSystemDirectory`, extends `Object`. */
abstract class EditorFileSystemDirectory extends Object {
  override def godotClassName: String = "EditorFileSystemDirectory"

  /** EditorFileSystemDirectory.get_subdir_count */
  final def getSubdirCount(): Long = {
    if (gdext.classes.EditorFileSystemDirectory.mb_get_subdir_count == null) gdext.classes.EditorFileSystemDirectory.mb_get_subdir_count = MethodBind.get("EditorFileSystemDirectory", "get_subdir_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.EditorFileSystemDirectory.mb_get_subdir_count, livePtr)
  }

  /** EditorFileSystemDirectory.get_subdir */
  final def getSubdir(idx: Long): EditorFileSystemDirectory = {
    if (gdext.classes.EditorFileSystemDirectory.mb_get_subdir == null) gdext.classes.EditorFileSystemDirectory.mb_get_subdir = MethodBind.get("EditorFileSystemDirectory", "get_subdir", 2330964164L)
    Wrappers.borrowed[EditorFileSystemDirectory](Ptrcall.call1[Long, Long](gdext.classes.EditorFileSystemDirectory.mb_get_subdir, livePtr, idx))
  }

  /** EditorFileSystemDirectory.get_file_count */
  final def getFileCount(): Long = {
    if (gdext.classes.EditorFileSystemDirectory.mb_get_file_count == null) gdext.classes.EditorFileSystemDirectory.mb_get_file_count = MethodBind.get("EditorFileSystemDirectory", "get_file_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.EditorFileSystemDirectory.mb_get_file_count, livePtr)
  }

  /** EditorFileSystemDirectory.get_file */
  final def getFile(idx: Long): String = {
    if (gdext.classes.EditorFileSystemDirectory.mb_get_file == null) gdext.classes.EditorFileSystemDirectory.mb_get_file = MethodBind.get("EditorFileSystemDirectory", "get_file", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.EditorFileSystemDirectory.mb_get_file, livePtr, idx)
  }

  /** EditorFileSystemDirectory.get_file_path */
  final def getFilePath(idx: Long): String = {
    if (gdext.classes.EditorFileSystemDirectory.mb_get_file_path == null) gdext.classes.EditorFileSystemDirectory.mb_get_file_path = MethodBind.get("EditorFileSystemDirectory", "get_file_path", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.EditorFileSystemDirectory.mb_get_file_path, livePtr, idx)
  }

  /** EditorFileSystemDirectory.get_file_type */
  final def getFileType(idx: Long): String = {
    if (gdext.classes.EditorFileSystemDirectory.mb_get_file_type == null) gdext.classes.EditorFileSystemDirectory.mb_get_file_type = MethodBind.get("EditorFileSystemDirectory", "get_file_type", 659327637L)
    Ptrcall.call1[Long, SnArg](gdext.classes.EditorFileSystemDirectory.mb_get_file_type, livePtr, idx)
  }

  /** EditorFileSystemDirectory.get_file_script_class_name */
  final def getFileScriptClassName(idx: Long): String = {
    if (gdext.classes.EditorFileSystemDirectory.mb_get_file_script_class_name == null) gdext.classes.EditorFileSystemDirectory.mb_get_file_script_class_name = MethodBind.get("EditorFileSystemDirectory", "get_file_script_class_name", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.EditorFileSystemDirectory.mb_get_file_script_class_name, livePtr, idx)
  }

  /** EditorFileSystemDirectory.get_file_script_class_extends */
  final def getFileScriptClassExtends(idx: Long): String = {
    if (gdext.classes.EditorFileSystemDirectory.mb_get_file_script_class_extends == null) gdext.classes.EditorFileSystemDirectory.mb_get_file_script_class_extends = MethodBind.get("EditorFileSystemDirectory", "get_file_script_class_extends", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.EditorFileSystemDirectory.mb_get_file_script_class_extends, livePtr, idx)
  }

  /** EditorFileSystemDirectory.get_file_import_is_valid */
  final def getFileImportIsValid(idx: Long): Boolean = {
    if (gdext.classes.EditorFileSystemDirectory.mb_get_file_import_is_valid == null) gdext.classes.EditorFileSystemDirectory.mb_get_file_import_is_valid = MethodBind.get("EditorFileSystemDirectory", "get_file_import_is_valid", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.EditorFileSystemDirectory.mb_get_file_import_is_valid, livePtr, idx)
  }

  /** EditorFileSystemDirectory.get_name */
  final def getName(): String = {
    if (gdext.classes.EditorFileSystemDirectory.mb_get_name == null) gdext.classes.EditorFileSystemDirectory.mb_get_name = MethodBind.get("EditorFileSystemDirectory", "get_name", 2841200299L)
    Ptrcall.call0[String](gdext.classes.EditorFileSystemDirectory.mb_get_name, livePtr)
  }

  /** EditorFileSystemDirectory.get_path */
  final def getPath(): String = {
    if (gdext.classes.EditorFileSystemDirectory.mb_get_path == null) gdext.classes.EditorFileSystemDirectory.mb_get_path = MethodBind.get("EditorFileSystemDirectory", "get_path", 201670096L)
    Ptrcall.call0[String](gdext.classes.EditorFileSystemDirectory.mb_get_path, livePtr)
  }

  /** EditorFileSystemDirectory.get_parent */
  final def getParent(): EditorFileSystemDirectory = {
    if (gdext.classes.EditorFileSystemDirectory.mb_get_parent == null) gdext.classes.EditorFileSystemDirectory.mb_get_parent = MethodBind.get("EditorFileSystemDirectory", "get_parent", 842323275L)
    Wrappers.borrowed[EditorFileSystemDirectory](Ptrcall.call0[Long](gdext.classes.EditorFileSystemDirectory.mb_get_parent, livePtr))
  }

  /** EditorFileSystemDirectory.find_file_index */
  final def findFileIndex(name: String): Long = {
    if (gdext.classes.EditorFileSystemDirectory.mb_find_file_index == null) gdext.classes.EditorFileSystemDirectory.mb_find_file_index = MethodBind.get("EditorFileSystemDirectory", "find_file_index", 1321353865L)
    Ptrcall.call1[String, Long](gdext.classes.EditorFileSystemDirectory.mb_find_file_index, livePtr, name)
  }

  /** EditorFileSystemDirectory.find_dir_index */
  final def findDirIndex(name: String): Long = {
    if (gdext.classes.EditorFileSystemDirectory.mb_find_dir_index == null) gdext.classes.EditorFileSystemDirectory.mb_find_dir_index = MethodBind.get("EditorFileSystemDirectory", "find_dir_index", 1321353865L)
    Ptrcall.call1[String, Long](gdext.classes.EditorFileSystemDirectory.mb_find_dir_index, livePtr, name)
  }

}

object EditorFileSystemDirectory {
  private[classes] var mb_get_subdir_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_subdir: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_file_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_file: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_file_path: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_file_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_file_script_class_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_file_script_class_extends: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_file_import_is_valid: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_path: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_parent: GDExtensionMethodBindPtr = null
  private[classes] var mb_find_file_index: GDExtensionMethodBindPtr = null
  private[classes] var mb_find_dir_index: GDExtensionMethodBindPtr = null
}
