package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `DirAccess`, extends `RefCounted`. */
abstract class DirAccess extends RefCounted {
  override def godotClassName: String = "DirAccess"

  /** DirAccess.list_dir_begin */
  final def listDirBegin(): gdext.classes.Error = {
    if (gdext.classes.DirAccess.mb_list_dir_begin == null) gdext.classes.DirAccess.mb_list_dir_begin = MethodBind.get("DirAccess", "list_dir_begin", 166280745L)
    gdext.classes.Error(Ptrcall.call0[Long](gdext.classes.DirAccess.mb_list_dir_begin, livePtr))
  }

  /** DirAccess.get_next */
  final def getNext(): String = {
    if (gdext.classes.DirAccess.mb_get_next == null) gdext.classes.DirAccess.mb_get_next = MethodBind.get("DirAccess", "get_next", 2841200299L)
    Ptrcall.call0[String](gdext.classes.DirAccess.mb_get_next, livePtr)
  }

  /** DirAccess.current_is_dir */
  final def currentIsDir(): Boolean = {
    if (gdext.classes.DirAccess.mb_current_is_dir == null) gdext.classes.DirAccess.mb_current_is_dir = MethodBind.get("DirAccess", "current_is_dir", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.DirAccess.mb_current_is_dir, livePtr)
  }

  /** DirAccess.list_dir_end */
  final def listDirEnd(): Unit = {
    if (gdext.classes.DirAccess.mb_list_dir_end == null) gdext.classes.DirAccess.mb_list_dir_end = MethodBind.get("DirAccess", "list_dir_end", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.DirAccess.mb_list_dir_end, livePtr)
  }

  /** DirAccess.get_current_drive */
  final def getCurrentDrive(): Long = {
    if (gdext.classes.DirAccess.mb_get_current_drive == null) gdext.classes.DirAccess.mb_get_current_drive = MethodBind.get("DirAccess", "get_current_drive", 2455072627L)
    Ptrcall.call0[Long](gdext.classes.DirAccess.mb_get_current_drive, livePtr)
  }

  /** DirAccess.change_dir */
  final def changeDir(toDir: String): gdext.classes.Error = {
    if (gdext.classes.DirAccess.mb_change_dir == null) gdext.classes.DirAccess.mb_change_dir = MethodBind.get("DirAccess", "change_dir", 166001499L)
    gdext.classes.Error(Ptrcall.call1[String, Long](gdext.classes.DirAccess.mb_change_dir, livePtr, toDir))
  }

  /** DirAccess.get_current_dir */
  final def getCurrentDir(includeDrive: Boolean = true): String = {
    if (gdext.classes.DirAccess.mb_get_current_dir == null) gdext.classes.DirAccess.mb_get_current_dir = MethodBind.get("DirAccess", "get_current_dir", 1287308131L)
    Ptrcall.call1[Boolean, String](gdext.classes.DirAccess.mb_get_current_dir, livePtr, includeDrive)
  }

  /** DirAccess.make_dir */
  final def makeDir(path: String): gdext.classes.Error = {
    if (gdext.classes.DirAccess.mb_make_dir == null) gdext.classes.DirAccess.mb_make_dir = MethodBind.get("DirAccess", "make_dir", 166001499L)
    gdext.classes.Error(Ptrcall.call1[String, Long](gdext.classes.DirAccess.mb_make_dir, livePtr, path))
  }

  /** DirAccess.make_dir_recursive */
  final def makeDirRecursive(path: String): gdext.classes.Error = {
    if (gdext.classes.DirAccess.mb_make_dir_recursive == null) gdext.classes.DirAccess.mb_make_dir_recursive = MethodBind.get("DirAccess", "make_dir_recursive", 166001499L)
    gdext.classes.Error(Ptrcall.call1[String, Long](gdext.classes.DirAccess.mb_make_dir_recursive, livePtr, path))
  }

  /** DirAccess.file_exists */
  final def fileExists(path: String): Boolean = {
    if (gdext.classes.DirAccess.mb_file_exists == null) gdext.classes.DirAccess.mb_file_exists = MethodBind.get("DirAccess", "file_exists", 2323990056L)
    Ptrcall.call1[String, Boolean](gdext.classes.DirAccess.mb_file_exists, livePtr, path)
  }

  /** DirAccess.dir_exists */
  final def dirExists(path: String): Boolean = {
    if (gdext.classes.DirAccess.mb_dir_exists == null) gdext.classes.DirAccess.mb_dir_exists = MethodBind.get("DirAccess", "dir_exists", 2323990056L)
    Ptrcall.call1[String, Boolean](gdext.classes.DirAccess.mb_dir_exists, livePtr, path)
  }

  /** DirAccess.get_space_left */
  final def getSpaceLeft(): Long = {
    if (gdext.classes.DirAccess.mb_get_space_left == null) gdext.classes.DirAccess.mb_get_space_left = MethodBind.get("DirAccess", "get_space_left", 2455072627L)
    Ptrcall.call0[Long](gdext.classes.DirAccess.mb_get_space_left, livePtr)
  }

  /** DirAccess.copy */
  final def copy(from: String, to: String, chmodFlags: Long = -1L): gdext.classes.Error = {
    if (gdext.classes.DirAccess.mb_copy == null) gdext.classes.DirAccess.mb_copy = MethodBind.get("DirAccess", "copy", 1063198817L)
    gdext.classes.Error(Ptrcall.call3[String, String, Long, Long](gdext.classes.DirAccess.mb_copy, livePtr, from, to, chmodFlags))
  }

  /** DirAccess.rename */
  final def rename(from: String, to: String): gdext.classes.Error = {
    if (gdext.classes.DirAccess.mb_rename == null) gdext.classes.DirAccess.mb_rename = MethodBind.get("DirAccess", "rename", 852856452L)
    gdext.classes.Error(Ptrcall.call2[String, String, Long](gdext.classes.DirAccess.mb_rename, livePtr, from, to))
  }

  /** DirAccess.remove */
  final def remove(path: String): gdext.classes.Error = {
    if (gdext.classes.DirAccess.mb_remove == null) gdext.classes.DirAccess.mb_remove = MethodBind.get("DirAccess", "remove", 166001499L)
    gdext.classes.Error(Ptrcall.call1[String, Long](gdext.classes.DirAccess.mb_remove, livePtr, path))
  }

  /** DirAccess.is_link */
  final def isLink(path: String): Boolean = {
    if (gdext.classes.DirAccess.mb_is_link == null) gdext.classes.DirAccess.mb_is_link = MethodBind.get("DirAccess", "is_link", 2323990056L)
    Ptrcall.call1[String, Boolean](gdext.classes.DirAccess.mb_is_link, livePtr, path)
  }

  /** DirAccess.read_link */
  final def readLink(path: String): String = {
    if (gdext.classes.DirAccess.mb_read_link == null) gdext.classes.DirAccess.mb_read_link = MethodBind.get("DirAccess", "read_link", 1703090593L)
    Ptrcall.call1[String, String](gdext.classes.DirAccess.mb_read_link, livePtr, path)
  }

  /** DirAccess.create_link */
  final def createLink(source: String, target: String): gdext.classes.Error = {
    if (gdext.classes.DirAccess.mb_create_link == null) gdext.classes.DirAccess.mb_create_link = MethodBind.get("DirAccess", "create_link", 852856452L)
    gdext.classes.Error(Ptrcall.call2[String, String, Long](gdext.classes.DirAccess.mb_create_link, livePtr, source, target))
  }

  /** DirAccess.is_bundle */
  final def isBundle(path: String): Boolean = {
    if (gdext.classes.DirAccess.mb_is_bundle == null) gdext.classes.DirAccess.mb_is_bundle = MethodBind.get("DirAccess", "is_bundle", 3927539163L)
    Ptrcall.call1[String, Boolean](gdext.classes.DirAccess.mb_is_bundle, livePtr, path)
  }

  /** DirAccess.set_include_navigational */
  final def setIncludeNavigational(enable: Boolean): Unit = {
    if (gdext.classes.DirAccess.mb_set_include_navigational == null) gdext.classes.DirAccess.mb_set_include_navigational = MethodBind.get("DirAccess", "set_include_navigational", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.DirAccess.mb_set_include_navigational, livePtr, enable)
  }

  /** DirAccess.get_include_navigational */
  final def getIncludeNavigational(): Boolean = {
    if (gdext.classes.DirAccess.mb_get_include_navigational == null) gdext.classes.DirAccess.mb_get_include_navigational = MethodBind.get("DirAccess", "get_include_navigational", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.DirAccess.mb_get_include_navigational, livePtr)
  }

  /** DirAccess.set_include_hidden */
  final def setIncludeHidden(enable: Boolean): Unit = {
    if (gdext.classes.DirAccess.mb_set_include_hidden == null) gdext.classes.DirAccess.mb_set_include_hidden = MethodBind.get("DirAccess", "set_include_hidden", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.DirAccess.mb_set_include_hidden, livePtr, enable)
  }

  /** DirAccess.get_include_hidden */
  final def getIncludeHidden(): Boolean = {
    if (gdext.classes.DirAccess.mb_get_include_hidden == null) gdext.classes.DirAccess.mb_get_include_hidden = MethodBind.get("DirAccess", "get_include_hidden", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.DirAccess.mb_get_include_hidden, livePtr)
  }

  /** DirAccess.get_filesystem_type */
  final def getFilesystemType(): String = {
    if (gdext.classes.DirAccess.mb_get_filesystem_type == null) gdext.classes.DirAccess.mb_get_filesystem_type = MethodBind.get("DirAccess", "get_filesystem_type", 201670096L)
    Ptrcall.call0[String](gdext.classes.DirAccess.mb_get_filesystem_type, livePtr)
  }

  /** DirAccess.is_case_sensitive */
  final def isCaseSensitive(path: String): Boolean = {
    if (gdext.classes.DirAccess.mb_is_case_sensitive == null) gdext.classes.DirAccess.mb_is_case_sensitive = MethodBind.get("DirAccess", "is_case_sensitive", 3927539163L)
    Ptrcall.call1[String, Boolean](gdext.classes.DirAccess.mb_is_case_sensitive, livePtr, path)
  }

  /** DirAccess.is_equivalent */
  final def isEquivalent(pathA: String, pathB: String): Boolean = {
    if (gdext.classes.DirAccess.mb_is_equivalent == null) gdext.classes.DirAccess.mb_is_equivalent = MethodBind.get("DirAccess", "is_equivalent", 820780508L)
    Ptrcall.call2[String, String, Boolean](gdext.classes.DirAccess.mb_is_equivalent, livePtr, pathA, pathB)
  }

}

object DirAccess {
  private[classes] var mb_open: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_open_error: GDExtensionMethodBindPtr = null
  private[classes] var mb_create_temp: GDExtensionMethodBindPtr = null
  private[classes] var mb_list_dir_begin: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_next: GDExtensionMethodBindPtr = null
  private[classes] var mb_current_is_dir: GDExtensionMethodBindPtr = null
  private[classes] var mb_list_dir_end: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_drive_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_drive_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_current_drive: GDExtensionMethodBindPtr = null
  private[classes] var mb_change_dir: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_current_dir: GDExtensionMethodBindPtr = null
  private[classes] var mb_make_dir: GDExtensionMethodBindPtr = null
  private[classes] var mb_make_dir_absolute: GDExtensionMethodBindPtr = null
  private[classes] var mb_make_dir_recursive: GDExtensionMethodBindPtr = null
  private[classes] var mb_make_dir_recursive_absolute: GDExtensionMethodBindPtr = null
  private[classes] var mb_file_exists: GDExtensionMethodBindPtr = null
  private[classes] var mb_dir_exists: GDExtensionMethodBindPtr = null
  private[classes] var mb_dir_exists_absolute: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_space_left: GDExtensionMethodBindPtr = null
  private[classes] var mb_copy: GDExtensionMethodBindPtr = null
  private[classes] var mb_copy_absolute: GDExtensionMethodBindPtr = null
  private[classes] var mb_rename: GDExtensionMethodBindPtr = null
  private[classes] var mb_rename_absolute: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_absolute: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_link: GDExtensionMethodBindPtr = null
  private[classes] var mb_read_link: GDExtensionMethodBindPtr = null
  private[classes] var mb_create_link: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_bundle: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_include_navigational: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_include_navigational: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_include_hidden: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_include_hidden: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_filesystem_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_case_sensitive: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_equivalent: GDExtensionMethodBindPtr = null

  /** DirAccess.open. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def open(path: String): DirAccess = {
    if (gdext.classes.DirAccess.mb_open == null) gdext.classes.DirAccess.mb_open = MethodBind.get("DirAccess", "open", 1923528528L)
    Wrappers.owned[DirAccess](Ptrcall.call1[String, Long](gdext.classes.DirAccess.mb_open, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr], path))
  }

  /** DirAccess.get_open_error */
  final def getOpenError(): gdext.classes.Error = {
    if (gdext.classes.DirAccess.mb_get_open_error == null) gdext.classes.DirAccess.mb_get_open_error = MethodBind.get("DirAccess", "get_open_error", 166280745L)
    gdext.classes.Error(Ptrcall.call0[Long](gdext.classes.DirAccess.mb_get_open_error, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr]))
  }

  /** DirAccess.create_temp. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def createTemp(prefix: String = "", keep: Boolean = false): DirAccess = {
    if (gdext.classes.DirAccess.mb_create_temp == null) gdext.classes.DirAccess.mb_create_temp = MethodBind.get("DirAccess", "create_temp", 812913566L)
    Wrappers.owned[DirAccess](Ptrcall.call2[String, Boolean, Long](gdext.classes.DirAccess.mb_create_temp, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr], prefix, keep))
  }

  /** DirAccess.get_drive_count */
  final def getDriveCount(): Long = {
    if (gdext.classes.DirAccess.mb_get_drive_count == null) gdext.classes.DirAccess.mb_get_drive_count = MethodBind.get("DirAccess", "get_drive_count", 2455072627L)
    Ptrcall.call0[Long](gdext.classes.DirAccess.mb_get_drive_count, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr])
  }

  /** DirAccess.get_drive_name */
  final def getDriveName(idx: Long): String = {
    if (gdext.classes.DirAccess.mb_get_drive_name == null) gdext.classes.DirAccess.mb_get_drive_name = MethodBind.get("DirAccess", "get_drive_name", 990163283L)
    Ptrcall.call1[Long, String](gdext.classes.DirAccess.mb_get_drive_name, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr], idx)
  }

  /** DirAccess.make_dir_absolute */
  final def makeDirAbsolute(path: String): gdext.classes.Error = {
    if (gdext.classes.DirAccess.mb_make_dir_absolute == null) gdext.classes.DirAccess.mb_make_dir_absolute = MethodBind.get("DirAccess", "make_dir_absolute", 166001499L)
    gdext.classes.Error(Ptrcall.call1[String, Long](gdext.classes.DirAccess.mb_make_dir_absolute, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr], path))
  }

  /** DirAccess.make_dir_recursive_absolute */
  final def makeDirRecursiveAbsolute(path: String): gdext.classes.Error = {
    if (gdext.classes.DirAccess.mb_make_dir_recursive_absolute == null) gdext.classes.DirAccess.mb_make_dir_recursive_absolute = MethodBind.get("DirAccess", "make_dir_recursive_absolute", 166001499L)
    gdext.classes.Error(Ptrcall.call1[String, Long](gdext.classes.DirAccess.mb_make_dir_recursive_absolute, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr], path))
  }

  /** DirAccess.dir_exists_absolute */
  final def dirExistsAbsolute(path: String): Boolean = {
    if (gdext.classes.DirAccess.mb_dir_exists_absolute == null) gdext.classes.DirAccess.mb_dir_exists_absolute = MethodBind.get("DirAccess", "dir_exists_absolute", 2323990056L)
    Ptrcall.call1[String, Boolean](gdext.classes.DirAccess.mb_dir_exists_absolute, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr], path)
  }

  /** DirAccess.copy_absolute */
  final def copyAbsolute(from: String, to: String, chmodFlags: Long = -1L): gdext.classes.Error = {
    if (gdext.classes.DirAccess.mb_copy_absolute == null) gdext.classes.DirAccess.mb_copy_absolute = MethodBind.get("DirAccess", "copy_absolute", 1063198817L)
    gdext.classes.Error(Ptrcall.call3[String, String, Long, Long](gdext.classes.DirAccess.mb_copy_absolute, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr], from, to, chmodFlags))
  }

  /** DirAccess.rename_absolute */
  final def renameAbsolute(from: String, to: String): gdext.classes.Error = {
    if (gdext.classes.DirAccess.mb_rename_absolute == null) gdext.classes.DirAccess.mb_rename_absolute = MethodBind.get("DirAccess", "rename_absolute", 852856452L)
    gdext.classes.Error(Ptrcall.call2[String, String, Long](gdext.classes.DirAccess.mb_rename_absolute, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr], from, to))
  }

  /** DirAccess.remove_absolute */
  final def removeAbsolute(path: String): gdext.classes.Error = {
    if (gdext.classes.DirAccess.mb_remove_absolute == null) gdext.classes.DirAccess.mb_remove_absolute = MethodBind.get("DirAccess", "remove_absolute", 166001499L)
    gdext.classes.Error(Ptrcall.call1[String, Long](gdext.classes.DirAccess.mb_remove_absolute, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr], path))
  }
}
