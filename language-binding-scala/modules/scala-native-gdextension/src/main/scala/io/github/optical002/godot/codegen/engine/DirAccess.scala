package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `DirAccess`, extends `RefCounted`. */
abstract class DirAccess extends RefCounted {

  /** DirAccess.list_dir_begin */
  final def listDirBegin(): Long =
    Ptrcall.call0[Long](MethodBind.get("DirAccess", "list_dir_begin", 166280745L), hostObject.objectPtr)

  /** DirAccess.get_next */
  final def getNext(): String =
    Ptrcall.call0[String](MethodBind.get("DirAccess", "get_next", 2841200299L), hostObject.objectPtr)

  /** DirAccess.current_is_dir */
  final def currentIsDir(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("DirAccess", "current_is_dir", 36873697L), hostObject.objectPtr)

  /** DirAccess.list_dir_end */
  final def listDirEnd(): Unit =
    Ptrcall.callVoid0(MethodBind.get("DirAccess", "list_dir_end", 3218959716L), hostObject.objectPtr)

  /** DirAccess.get_current_drive */
  final def getCurrentDrive(): Long =
    Ptrcall.call0[Long](MethodBind.get("DirAccess", "get_current_drive", 2455072627L), hostObject.objectPtr)

  /** DirAccess.change_dir */
  final def changeDir(to_dir: String): Long =
    Ptrcall.call1[String, Long](MethodBind.get("DirAccess", "change_dir", 166001499L), hostObject.objectPtr, to_dir)

  /** DirAccess.get_current_dir */
  final def getCurrentDir(include_drive: Boolean): String =
    Ptrcall.call1[Boolean, String](MethodBind.get("DirAccess", "get_current_dir", 1287308131L), hostObject.objectPtr, include_drive)

  /** DirAccess.make_dir */
  final def makeDir(path: String): Long =
    Ptrcall.call1[String, Long](MethodBind.get("DirAccess", "make_dir", 166001499L), hostObject.objectPtr, path)

  /** DirAccess.make_dir_recursive */
  final def makeDirRecursive(path: String): Long =
    Ptrcall.call1[String, Long](MethodBind.get("DirAccess", "make_dir_recursive", 166001499L), hostObject.objectPtr, path)

  /** DirAccess.file_exists */
  final def fileExists(path: String): Boolean =
    Ptrcall.call1[String, Boolean](MethodBind.get("DirAccess", "file_exists", 2323990056L), hostObject.objectPtr, path)

  /** DirAccess.dir_exists */
  final def dirExists(path: String): Boolean =
    Ptrcall.call1[String, Boolean](MethodBind.get("DirAccess", "dir_exists", 2323990056L), hostObject.objectPtr, path)

  /** DirAccess.get_space_left */
  final def getSpaceLeft(): Long =
    Ptrcall.call0[Long](MethodBind.get("DirAccess", "get_space_left", 2455072627L), hostObject.objectPtr)

  /** DirAccess.copy */
  final def copy(from: String, to: String, chmod_flags: Long): Long =
    Ptrcall.call3[String, String, Long, Long](MethodBind.get("DirAccess", "copy", 1063198817L), hostObject.objectPtr, from, to, chmod_flags)

  /** DirAccess.rename */
  final def rename(from: String, to: String): Long =
    Ptrcall.call2[String, String, Long](MethodBind.get("DirAccess", "rename", 852856452L), hostObject.objectPtr, from, to)

  /** DirAccess.remove */
  final def remove(path: String): Long =
    Ptrcall.call1[String, Long](MethodBind.get("DirAccess", "remove", 166001499L), hostObject.objectPtr, path)

  /** DirAccess.is_link */
  final def isLink(path: String): Boolean =
    Ptrcall.call1[String, Boolean](MethodBind.get("DirAccess", "is_link", 2323990056L), hostObject.objectPtr, path)

  /** DirAccess.read_link */
  final def readLink(path: String): String =
    Ptrcall.call1[String, String](MethodBind.get("DirAccess", "read_link", 1703090593L), hostObject.objectPtr, path)

  /** DirAccess.create_link */
  final def createLink(source: String, target: String): Long =
    Ptrcall.call2[String, String, Long](MethodBind.get("DirAccess", "create_link", 852856452L), hostObject.objectPtr, source, target)

  /** DirAccess.is_bundle */
  final def isBundle(path: String): Boolean =
    Ptrcall.call1[String, Boolean](MethodBind.get("DirAccess", "is_bundle", 3927539163L), hostObject.objectPtr, path)

  /** DirAccess.set_include_navigational */
  final def setIncludeNavigational(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("DirAccess", "set_include_navigational", 2586408642L), hostObject.objectPtr, enable)

  /** DirAccess.get_include_navigational */
  final def getIncludeNavigational(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("DirAccess", "get_include_navigational", 36873697L), hostObject.objectPtr)

  /** DirAccess.set_include_hidden */
  final def setIncludeHidden(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("DirAccess", "set_include_hidden", 2586408642L), hostObject.objectPtr, enable)

  /** DirAccess.get_include_hidden */
  final def getIncludeHidden(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("DirAccess", "get_include_hidden", 36873697L), hostObject.objectPtr)

  /** DirAccess.get_filesystem_type */
  final def getFilesystemType(): String =
    Ptrcall.call0[String](MethodBind.get("DirAccess", "get_filesystem_type", 201670096L), hostObject.objectPtr)

  /** DirAccess.is_case_sensitive */
  final def isCaseSensitive(path: String): Boolean =
    Ptrcall.call1[String, Boolean](MethodBind.get("DirAccess", "is_case_sensitive", 3927539163L), hostObject.objectPtr, path)

  /** DirAccess.is_equivalent */
  final def isEquivalent(path_a: String, path_b: String): Boolean =
    Ptrcall.call2[String, String, Boolean](MethodBind.get("DirAccess", "is_equivalent", 820780508L), hostObject.objectPtr, path_a, path_b)

}

object DirAccess {
  /** Class metadata for Gd[DirAccess] lifetime management and casting. */
  given GodotClass[DirAccess] with {
    def className = "DirAccess"
    def isRefCounted = true
    def wrap(o: GodotObject): DirAccess = new DirAccess {}.withHost(o.objectPtr)
    def unwrap(t: DirAccess): GodotObject = t.hostObject
  }
}
