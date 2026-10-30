package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `FileAccess`, extends `RefCounted`. */
abstract class FileAccess extends RefCounted {
  override def godotClassName: String = "FileAccess"

  /** FileAccess.resize */
  final def resize(length: Long): gdext.classes.Error = {
    if (gdext.classes.FileAccess.mb_resize == null) gdext.classes.FileAccess.mb_resize = MethodBind.get("FileAccess", "resize", 844576869L)
    gdext.classes.Error(Ptrcall.call1[Long, Long](gdext.classes.FileAccess.mb_resize, livePtr, length))
  }

  /** FileAccess.flush */
  final def flush(): Unit = {
    if (gdext.classes.FileAccess.mb_flush == null) gdext.classes.FileAccess.mb_flush = MethodBind.get("FileAccess", "flush", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.FileAccess.mb_flush, livePtr)
  }

  /** FileAccess.get_path */
  final def getPath(): String = {
    if (gdext.classes.FileAccess.mb_get_path == null) gdext.classes.FileAccess.mb_get_path = MethodBind.get("FileAccess", "get_path", 201670096L)
    Ptrcall.call0[String](gdext.classes.FileAccess.mb_get_path, livePtr)
  }

  /** FileAccess.get_path_absolute */
  final def getPathAbsolute(): String = {
    if (gdext.classes.FileAccess.mb_get_path_absolute == null) gdext.classes.FileAccess.mb_get_path_absolute = MethodBind.get("FileAccess", "get_path_absolute", 201670096L)
    Ptrcall.call0[String](gdext.classes.FileAccess.mb_get_path_absolute, livePtr)
  }

  /** FileAccess.is_open */
  final def isOpen(): Boolean = {
    if (gdext.classes.FileAccess.mb_is_open == null) gdext.classes.FileAccess.mb_is_open = MethodBind.get("FileAccess", "is_open", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.FileAccess.mb_is_open, livePtr)
  }

  /** FileAccess.seek */
  final def seek(position: Long): Unit = {
    if (gdext.classes.FileAccess.mb_seek == null) gdext.classes.FileAccess.mb_seek = MethodBind.get("FileAccess", "seek", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.FileAccess.mb_seek, livePtr, position)
  }

  /** FileAccess.seek_end */
  final def seekEnd(position: Long = 0L): Unit = {
    if (gdext.classes.FileAccess.mb_seek_end == null) gdext.classes.FileAccess.mb_seek_end = MethodBind.get("FileAccess", "seek_end", 1995695955L)
    Ptrcall.callVoid1(gdext.classes.FileAccess.mb_seek_end, livePtr, position)
  }

  /** FileAccess.get_position */
  final def getPosition(): Long = {
    if (gdext.classes.FileAccess.mb_get_position == null) gdext.classes.FileAccess.mb_get_position = MethodBind.get("FileAccess", "get_position", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.FileAccess.mb_get_position, livePtr)
  }

  /** FileAccess.get_length */
  final def getLength(): Long = {
    if (gdext.classes.FileAccess.mb_get_length == null) gdext.classes.FileAccess.mb_get_length = MethodBind.get("FileAccess", "get_length", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.FileAccess.mb_get_length, livePtr)
  }

  /** FileAccess.eof_reached */
  final def eofReached(): Boolean = {
    if (gdext.classes.FileAccess.mb_eof_reached == null) gdext.classes.FileAccess.mb_eof_reached = MethodBind.get("FileAccess", "eof_reached", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.FileAccess.mb_eof_reached, livePtr)
  }

  /** FileAccess.get_8 */
  final def get8(): Long = {
    if (gdext.classes.FileAccess.mb_get_8 == null) gdext.classes.FileAccess.mb_get_8 = MethodBind.get("FileAccess", "get_8", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.FileAccess.mb_get_8, livePtr)
  }

  /** FileAccess.get_16 */
  final def get16(): Long = {
    if (gdext.classes.FileAccess.mb_get_16 == null) gdext.classes.FileAccess.mb_get_16 = MethodBind.get("FileAccess", "get_16", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.FileAccess.mb_get_16, livePtr)
  }

  /** FileAccess.get_32 */
  final def get32(): Long = {
    if (gdext.classes.FileAccess.mb_get_32 == null) gdext.classes.FileAccess.mb_get_32 = MethodBind.get("FileAccess", "get_32", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.FileAccess.mb_get_32, livePtr)
  }

  /** FileAccess.get_64 */
  final def get64(): Long = {
    if (gdext.classes.FileAccess.mb_get_64 == null) gdext.classes.FileAccess.mb_get_64 = MethodBind.get("FileAccess", "get_64", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.FileAccess.mb_get_64, livePtr)
  }

  /** FileAccess.get_half */
  final def getHalf(): Double = {
    if (gdext.classes.FileAccess.mb_get_half == null) gdext.classes.FileAccess.mb_get_half = MethodBind.get("FileAccess", "get_half", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.FileAccess.mb_get_half, livePtr)
  }

  /** FileAccess.get_float */
  final def getFloat(): Double = {
    if (gdext.classes.FileAccess.mb_get_float == null) gdext.classes.FileAccess.mb_get_float = MethodBind.get("FileAccess", "get_float", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.FileAccess.mb_get_float, livePtr)
  }

  /** FileAccess.get_double */
  final def getDouble(): Double = {
    if (gdext.classes.FileAccess.mb_get_double == null) gdext.classes.FileAccess.mb_get_double = MethodBind.get("FileAccess", "get_double", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.FileAccess.mb_get_double, livePtr)
  }

  /** FileAccess.get_real */
  final def getReal(): Double = {
    if (gdext.classes.FileAccess.mb_get_real == null) gdext.classes.FileAccess.mb_get_real = MethodBind.get("FileAccess", "get_real", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.FileAccess.mb_get_real, livePtr)
  }

  /** FileAccess.get_line */
  final def getLine(): String = {
    if (gdext.classes.FileAccess.mb_get_line == null) gdext.classes.FileAccess.mb_get_line = MethodBind.get("FileAccess", "get_line", 201670096L)
    Ptrcall.call0[String](gdext.classes.FileAccess.mb_get_line, livePtr)
  }

  /** FileAccess.get_as_text */
  final def getAsText(): String = {
    if (gdext.classes.FileAccess.mb_get_as_text == null) gdext.classes.FileAccess.mb_get_as_text = MethodBind.get("FileAccess", "get_as_text", 201670096L)
    Ptrcall.call0[String](gdext.classes.FileAccess.mb_get_as_text, livePtr)
  }

  /** FileAccess.is_big_endian */
  final def isBigEndian(): Boolean = {
    if (gdext.classes.FileAccess.mb_is_big_endian == null) gdext.classes.FileAccess.mb_is_big_endian = MethodBind.get("FileAccess", "is_big_endian", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.FileAccess.mb_is_big_endian, livePtr)
  }

  /** FileAccess.set_big_endian */
  final def setBigEndian(bigEndian: Boolean): Unit = {
    if (gdext.classes.FileAccess.mb_set_big_endian == null) gdext.classes.FileAccess.mb_set_big_endian = MethodBind.get("FileAccess", "set_big_endian", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.FileAccess.mb_set_big_endian, livePtr, bigEndian)
  }

  /** FileAccess.get_error */
  final def getError(): gdext.classes.Error = {
    if (gdext.classes.FileAccess.mb_get_error == null) gdext.classes.FileAccess.mb_get_error = MethodBind.get("FileAccess", "get_error", 3185525595L)
    gdext.classes.Error(Ptrcall.call0[Long](gdext.classes.FileAccess.mb_get_error, livePtr))
  }

  /** FileAccess.store_8 */
  final def store8(value: Long): Boolean = {
    if (gdext.classes.FileAccess.mb_store_8 == null) gdext.classes.FileAccess.mb_store_8 = MethodBind.get("FileAccess", "store_8", 3067735520L)
    Ptrcall.call1[Long, Boolean](gdext.classes.FileAccess.mb_store_8, livePtr, value)
  }

  /** FileAccess.store_16 */
  final def store16(value: Long): Boolean = {
    if (gdext.classes.FileAccess.mb_store_16 == null) gdext.classes.FileAccess.mb_store_16 = MethodBind.get("FileAccess", "store_16", 3067735520L)
    Ptrcall.call1[Long, Boolean](gdext.classes.FileAccess.mb_store_16, livePtr, value)
  }

  /** FileAccess.store_32 */
  final def store32(value: Long): Boolean = {
    if (gdext.classes.FileAccess.mb_store_32 == null) gdext.classes.FileAccess.mb_store_32 = MethodBind.get("FileAccess", "store_32", 3067735520L)
    Ptrcall.call1[Long, Boolean](gdext.classes.FileAccess.mb_store_32, livePtr, value)
  }

  /** FileAccess.store_64 */
  final def store64(value: Long): Boolean = {
    if (gdext.classes.FileAccess.mb_store_64 == null) gdext.classes.FileAccess.mb_store_64 = MethodBind.get("FileAccess", "store_64", 3067735520L)
    Ptrcall.call1[Long, Boolean](gdext.classes.FileAccess.mb_store_64, livePtr, value)
  }

  /** FileAccess.store_half */
  final def storeHalf(value: Double): Boolean = {
    if (gdext.classes.FileAccess.mb_store_half == null) gdext.classes.FileAccess.mb_store_half = MethodBind.get("FileAccess", "store_half", 330693286L)
    Ptrcall.call1[Double, Boolean](gdext.classes.FileAccess.mb_store_half, livePtr, value)
  }

  /** FileAccess.store_float */
  final def storeFloat(value: Double): Boolean = {
    if (gdext.classes.FileAccess.mb_store_float == null) gdext.classes.FileAccess.mb_store_float = MethodBind.get("FileAccess", "store_float", 330693286L)
    Ptrcall.call1[Double, Boolean](gdext.classes.FileAccess.mb_store_float, livePtr, value)
  }

  /** FileAccess.store_double */
  final def storeDouble(value: Double): Boolean = {
    if (gdext.classes.FileAccess.mb_store_double == null) gdext.classes.FileAccess.mb_store_double = MethodBind.get("FileAccess", "store_double", 330693286L)
    Ptrcall.call1[Double, Boolean](gdext.classes.FileAccess.mb_store_double, livePtr, value)
  }

  /** FileAccess.store_real */
  final def storeReal(value: Double): Boolean = {
    if (gdext.classes.FileAccess.mb_store_real == null) gdext.classes.FileAccess.mb_store_real = MethodBind.get("FileAccess", "store_real", 330693286L)
    Ptrcall.call1[Double, Boolean](gdext.classes.FileAccess.mb_store_real, livePtr, value)
  }

  /** FileAccess.store_line */
  final def storeLine(line: String): Boolean = {
    if (gdext.classes.FileAccess.mb_store_line == null) gdext.classes.FileAccess.mb_store_line = MethodBind.get("FileAccess", "store_line", 2323990056L)
    Ptrcall.call1[String, Boolean](gdext.classes.FileAccess.mb_store_line, livePtr, line)
  }

  /** FileAccess.store_string */
  final def storeString(string: String): Boolean = {
    if (gdext.classes.FileAccess.mb_store_string == null) gdext.classes.FileAccess.mb_store_string = MethodBind.get("FileAccess", "store_string", 2323990056L)
    Ptrcall.call1[String, Boolean](gdext.classes.FileAccess.mb_store_string, livePtr, string)
  }

  /** FileAccess.store_pascal_string */
  final def storePascalString(string: String): Boolean = {
    if (gdext.classes.FileAccess.mb_store_pascal_string == null) gdext.classes.FileAccess.mb_store_pascal_string = MethodBind.get("FileAccess", "store_pascal_string", 2323990056L)
    Ptrcall.call1[String, Boolean](gdext.classes.FileAccess.mb_store_pascal_string, livePtr, string)
  }

  /** FileAccess.get_pascal_string */
  final def getPascalString(): String = {
    if (gdext.classes.FileAccess.mb_get_pascal_string == null) gdext.classes.FileAccess.mb_get_pascal_string = MethodBind.get("FileAccess", "get_pascal_string", 2841200299L)
    Ptrcall.call0[String](gdext.classes.FileAccess.mb_get_pascal_string, livePtr)
  }

  /** FileAccess.close */
  final def close(): Unit = {
    if (gdext.classes.FileAccess.mb_close == null) gdext.classes.FileAccess.mb_close = MethodBind.get("FileAccess", "close", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.FileAccess.mb_close, livePtr)
  }

}

object FileAccess {
  private[classes] var mb_open: GDExtensionMethodBindPtr = null
  private[classes] var mb_open_encrypted_with_pass: GDExtensionMethodBindPtr = null
  private[classes] var mb_open_compressed: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_open_error: GDExtensionMethodBindPtr = null
  private[classes] var mb_create_temp: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_file_as_string: GDExtensionMethodBindPtr = null
  private[classes] var mb_resize: GDExtensionMethodBindPtr = null
  private[classes] var mb_flush: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_path: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_path_absolute: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_open: GDExtensionMethodBindPtr = null
  private[classes] var mb_seek: GDExtensionMethodBindPtr = null
  private[classes] var mb_seek_end: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_eof_reached: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_8: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_16: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_32: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_64: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_half: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_float: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_double: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_real: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_line: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_as_text: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_md5: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_sha256: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_big_endian: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_big_endian: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_error: GDExtensionMethodBindPtr = null
  private[classes] var mb_store_8: GDExtensionMethodBindPtr = null
  private[classes] var mb_store_16: GDExtensionMethodBindPtr = null
  private[classes] var mb_store_32: GDExtensionMethodBindPtr = null
  private[classes] var mb_store_64: GDExtensionMethodBindPtr = null
  private[classes] var mb_store_half: GDExtensionMethodBindPtr = null
  private[classes] var mb_store_float: GDExtensionMethodBindPtr = null
  private[classes] var mb_store_double: GDExtensionMethodBindPtr = null
  private[classes] var mb_store_real: GDExtensionMethodBindPtr = null
  private[classes] var mb_store_line: GDExtensionMethodBindPtr = null
  private[classes] var mb_store_string: GDExtensionMethodBindPtr = null
  private[classes] var mb_store_pascal_string: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_pascal_string: GDExtensionMethodBindPtr = null
  private[classes] var mb_close: GDExtensionMethodBindPtr = null
  private[classes] var mb_file_exists: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_modified_time: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_access_time: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_unix_permissions: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_unix_permissions: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_hidden_attribute: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_hidden_attribute: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_read_only_attribute: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_read_only_attribute: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_extended_attribute_string: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_extended_attribute_string: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_extended_attribute: GDExtensionMethodBindPtr = null

  /** FileAccess.open. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def open(path: String, flags: gdext.classes.FileAccess.ModeFlags): FileAccess = {
    if (gdext.classes.FileAccess.mb_open == null) gdext.classes.FileAccess.mb_open = MethodBind.get("FileAccess", "open", 1247358404L)
    Wrappers.owned[FileAccess](Ptrcall.call2[String, Long, Long](gdext.classes.FileAccess.mb_open, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr], path, flags))
  }

  /** FileAccess.open_encrypted_with_pass. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def openEncryptedWithPass(path: String, modeFlags: gdext.classes.FileAccess.ModeFlags, pass: String): FileAccess = {
    if (gdext.classes.FileAccess.mb_open_encrypted_with_pass == null) gdext.classes.FileAccess.mb_open_encrypted_with_pass = MethodBind.get("FileAccess", "open_encrypted_with_pass", 790283377L)
    Wrappers.owned[FileAccess](Ptrcall.call3[String, Long, String, Long](gdext.classes.FileAccess.mb_open_encrypted_with_pass, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr], path, modeFlags, pass))
  }

  /** FileAccess.open_compressed. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def openCompressed(path: String, modeFlags: gdext.classes.FileAccess.ModeFlags, compressionMode: gdext.classes.FileAccess.CompressionMode = gdext.classes.FileAccess.CompressionMode(0L)): FileAccess = {
    if (gdext.classes.FileAccess.mb_open_compressed == null) gdext.classes.FileAccess.mb_open_compressed = MethodBind.get("FileAccess", "open_compressed", 3686439335L)
    Wrappers.owned[FileAccess](Ptrcall.call3[String, Long, Long, Long](gdext.classes.FileAccess.mb_open_compressed, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr], path, modeFlags, compressionMode))
  }

  /** FileAccess.get_open_error */
  final def getOpenError(): gdext.classes.Error = {
    if (gdext.classes.FileAccess.mb_get_open_error == null) gdext.classes.FileAccess.mb_get_open_error = MethodBind.get("FileAccess", "get_open_error", 166280745L)
    gdext.classes.Error(Ptrcall.call0[Long](gdext.classes.FileAccess.mb_get_open_error, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr]))
  }

  /** FileAccess.create_temp. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def createTemp(modeFlags: gdext.classes.FileAccess.ModeFlags, prefix: String = "", extension: String = "", keep: Boolean = false): FileAccess = {
    if (gdext.classes.FileAccess.mb_create_temp == null) gdext.classes.FileAccess.mb_create_temp = MethodBind.get("FileAccess", "create_temp", 171914364L)
    Wrappers.owned[FileAccess](Ptrcall.call4[Long, String, String, Boolean, Long](gdext.classes.FileAccess.mb_create_temp, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr], modeFlags, prefix, extension, keep))
  }

  /** FileAccess.get_file_as_string */
  final def getFileAsString(path: String): String = {
    if (gdext.classes.FileAccess.mb_get_file_as_string == null) gdext.classes.FileAccess.mb_get_file_as_string = MethodBind.get("FileAccess", "get_file_as_string", 1703090593L)
    Ptrcall.call1[String, String](gdext.classes.FileAccess.mb_get_file_as_string, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr], path)
  }

  /** FileAccess.get_md5 */
  final def getMd5(path: String): String = {
    if (gdext.classes.FileAccess.mb_get_md5 == null) gdext.classes.FileAccess.mb_get_md5 = MethodBind.get("FileAccess", "get_md5", 1703090593L)
    Ptrcall.call1[String, String](gdext.classes.FileAccess.mb_get_md5, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr], path)
  }

  /** FileAccess.get_sha256 */
  final def getSha256(path: String): String = {
    if (gdext.classes.FileAccess.mb_get_sha256 == null) gdext.classes.FileAccess.mb_get_sha256 = MethodBind.get("FileAccess", "get_sha256", 1703090593L)
    Ptrcall.call1[String, String](gdext.classes.FileAccess.mb_get_sha256, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr], path)
  }

  /** FileAccess.file_exists */
  final def fileExists(path: String): Boolean = {
    if (gdext.classes.FileAccess.mb_file_exists == null) gdext.classes.FileAccess.mb_file_exists = MethodBind.get("FileAccess", "file_exists", 2323990056L)
    Ptrcall.call1[String, Boolean](gdext.classes.FileAccess.mb_file_exists, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr], path)
  }

  /** FileAccess.get_modified_time */
  final def getModifiedTime(file: String): Long = {
    if (gdext.classes.FileAccess.mb_get_modified_time == null) gdext.classes.FileAccess.mb_get_modified_time = MethodBind.get("FileAccess", "get_modified_time", 1597066294L)
    Ptrcall.call1[String, Long](gdext.classes.FileAccess.mb_get_modified_time, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr], file)
  }

  /** FileAccess.get_access_time */
  final def getAccessTime(file: String): Long = {
    if (gdext.classes.FileAccess.mb_get_access_time == null) gdext.classes.FileAccess.mb_get_access_time = MethodBind.get("FileAccess", "get_access_time", 1597066294L)
    Ptrcall.call1[String, Long](gdext.classes.FileAccess.mb_get_access_time, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr], file)
  }

  /** FileAccess.get_size */
  final def getSize(file: String): Long = {
    if (gdext.classes.FileAccess.mb_get_size == null) gdext.classes.FileAccess.mb_get_size = MethodBind.get("FileAccess", "get_size", 1597066294L)
    Ptrcall.call1[String, Long](gdext.classes.FileAccess.mb_get_size, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr], file)
  }

  /** FileAccess.get_unix_permissions */
  final def getUnixPermissions(file: String): gdext.classes.FileAccess.UnixPermissionFlags = {
    if (gdext.classes.FileAccess.mb_get_unix_permissions == null) gdext.classes.FileAccess.mb_get_unix_permissions = MethodBind.get("FileAccess", "get_unix_permissions", 524341837L)
    gdext.classes.FileAccess.UnixPermissionFlags(Ptrcall.call1[String, Long](gdext.classes.FileAccess.mb_get_unix_permissions, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr], file))
  }

  /** FileAccess.set_unix_permissions */
  final def setUnixPermissions(file: String, permissions: gdext.classes.FileAccess.UnixPermissionFlags): gdext.classes.Error = {
    if (gdext.classes.FileAccess.mb_set_unix_permissions == null) gdext.classes.FileAccess.mb_set_unix_permissions = MethodBind.get("FileAccess", "set_unix_permissions", 846038644L)
    gdext.classes.Error(Ptrcall.call2[String, Long, Long](gdext.classes.FileAccess.mb_set_unix_permissions, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr], file, permissions.asInstanceOf[Long]))
  }

  /** FileAccess.get_hidden_attribute */
  final def getHiddenAttribute(file: String): Boolean = {
    if (gdext.classes.FileAccess.mb_get_hidden_attribute == null) gdext.classes.FileAccess.mb_get_hidden_attribute = MethodBind.get("FileAccess", "get_hidden_attribute", 2323990056L)
    Ptrcall.call1[String, Boolean](gdext.classes.FileAccess.mb_get_hidden_attribute, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr], file)
  }

  /** FileAccess.set_hidden_attribute */
  final def setHiddenAttribute(file: String, hidden: Boolean): gdext.classes.Error = {
    if (gdext.classes.FileAccess.mb_set_hidden_attribute == null) gdext.classes.FileAccess.mb_set_hidden_attribute = MethodBind.get("FileAccess", "set_hidden_attribute", 2892558115L)
    gdext.classes.Error(Ptrcall.call2[String, Boolean, Long](gdext.classes.FileAccess.mb_set_hidden_attribute, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr], file, hidden))
  }

  /** FileAccess.set_read_only_attribute */
  final def setReadOnlyAttribute(file: String, ro: Boolean): gdext.classes.Error = {
    if (gdext.classes.FileAccess.mb_set_read_only_attribute == null) gdext.classes.FileAccess.mb_set_read_only_attribute = MethodBind.get("FileAccess", "set_read_only_attribute", 2892558115L)
    gdext.classes.Error(Ptrcall.call2[String, Boolean, Long](gdext.classes.FileAccess.mb_set_read_only_attribute, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr], file, ro))
  }

  /** FileAccess.get_read_only_attribute */
  final def getReadOnlyAttribute(file: String): Boolean = {
    if (gdext.classes.FileAccess.mb_get_read_only_attribute == null) gdext.classes.FileAccess.mb_get_read_only_attribute = MethodBind.get("FileAccess", "get_read_only_attribute", 2323990056L)
    Ptrcall.call1[String, Boolean](gdext.classes.FileAccess.mb_get_read_only_attribute, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr], file)
  }

  /** FileAccess.get_extended_attribute_string */
  final def getExtendedAttributeString(file: String, attributeName: String): String = {
    if (gdext.classes.FileAccess.mb_get_extended_attribute_string == null) gdext.classes.FileAccess.mb_get_extended_attribute_string = MethodBind.get("FileAccess", "get_extended_attribute_string", 1218461987L)
    Ptrcall.call2[String, String, String](gdext.classes.FileAccess.mb_get_extended_attribute_string, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr], file, attributeName)
  }

  /** FileAccess.set_extended_attribute_string */
  final def setExtendedAttributeString(file: String, attributeName: String, data: String): gdext.classes.Error = {
    if (gdext.classes.FileAccess.mb_set_extended_attribute_string == null) gdext.classes.FileAccess.mb_set_extended_attribute_string = MethodBind.get("FileAccess", "set_extended_attribute_string", 699024349L)
    gdext.classes.Error(Ptrcall.call3[String, String, String, Long](gdext.classes.FileAccess.mb_set_extended_attribute_string, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr], file, attributeName, data))
  }

  /** FileAccess.remove_extended_attribute */
  final def removeExtendedAttribute(file: String, attributeName: String): gdext.classes.Error = {
    if (gdext.classes.FileAccess.mb_remove_extended_attribute == null) gdext.classes.FileAccess.mb_remove_extended_attribute = MethodBind.get("FileAccess", "remove_extended_attribute", 852856452L)
    gdext.classes.Error(Ptrcall.call2[String, String, Long](gdext.classes.FileAccess.mb_remove_extended_attribute, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr], file, attributeName))
  }

  /** Godot enum `FileAccess.ModeFlags`. */
  opaque type ModeFlags <: Long = Long

  object ModeFlags {
    final val Read: ModeFlags = 1L.asInstanceOf[ModeFlags]
    final val Write: ModeFlags = 2L.asInstanceOf[ModeFlags]
    final val ReadWrite: ModeFlags = 3L.asInstanceOf[ModeFlags]
    final val WriteRead: ModeFlags = 7L.asInstanceOf[ModeFlags]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ModeFlags = value.asInstanceOf[ModeFlags]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ModeFlags] = scala.IArray[Long](1L, 2L, 3L, 7L).asInstanceOf[scala.IArray[ModeFlags]]

    extension (self: ModeFlags)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 1L => "Read"
        case 2L => "Write"
        case 3L => "ReadWrite"
        case 7L => "WriteRead"
        case other => other.toString
      }
  }

  /** Godot enum `FileAccess.CompressionMode`. */
  opaque type CompressionMode <: Long = Long

  object CompressionMode {
    final val Fastlz: CompressionMode = 0L.asInstanceOf[CompressionMode]
    final val Deflate: CompressionMode = 1L.asInstanceOf[CompressionMode]
    final val Zstd: CompressionMode = 2L.asInstanceOf[CompressionMode]
    final val Gzip: CompressionMode = 3L.asInstanceOf[CompressionMode]
    final val Brotli: CompressionMode = 4L.asInstanceOf[CompressionMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): CompressionMode = value.asInstanceOf[CompressionMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[CompressionMode] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L).asInstanceOf[scala.IArray[CompressionMode]]

    extension (self: CompressionMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Fastlz"
        case 1L => "Deflate"
        case 2L => "Zstd"
        case 3L => "Gzip"
        case 4L => "Brotli"
        case other => other.toString
      }
  }

  /** Godot bitfield `FileAccess.UnixPermissionFlags`. */
  opaque type UnixPermissionFlags = Long

  object UnixPermissionFlags {
    final val ReadOwner: UnixPermissionFlags = 256L.asInstanceOf[UnixPermissionFlags]
    final val WriteOwner: UnixPermissionFlags = 128L.asInstanceOf[UnixPermissionFlags]
    final val ExecuteOwner: UnixPermissionFlags = 64L.asInstanceOf[UnixPermissionFlags]
    final val ReadGroup: UnixPermissionFlags = 32L.asInstanceOf[UnixPermissionFlags]
    final val WriteGroup: UnixPermissionFlags = 16L.asInstanceOf[UnixPermissionFlags]
    final val ExecuteGroup: UnixPermissionFlags = 8L.asInstanceOf[UnixPermissionFlags]
    final val ReadOther: UnixPermissionFlags = 4L.asInstanceOf[UnixPermissionFlags]
    final val WriteOther: UnixPermissionFlags = 2L.asInstanceOf[UnixPermissionFlags]
    final val ExecuteOther: UnixPermissionFlags = 1L.asInstanceOf[UnixPermissionFlags]
    final val SetUserId: UnixPermissionFlags = 2048L.asInstanceOf[UnixPermissionFlags]
    final val SetGroupId: UnixPermissionFlags = 1024L.asInstanceOf[UnixPermissionFlags]
    final val RestrictedDelete: UnixPermissionFlags = 512L.asInstanceOf[UnixPermissionFlags]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): UnixPermissionFlags = value.asInstanceOf[UnixPermissionFlags]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[UnixPermissionFlags] = scala.IArray[Long](1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L).asInstanceOf[scala.IArray[UnixPermissionFlags]]

    extension (self: UnixPermissionFlags)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 1L => "ExecuteOther"
        case 2L => "WriteOther"
        case 4L => "ReadOther"
        case 8L => "ExecuteGroup"
        case 16L => "WriteGroup"
        case 32L => "ReadGroup"
        case 64L => "ExecuteOwner"
        case 128L => "WriteOwner"
        case 256L => "ReadOwner"
        case 512L => "RestrictedDelete"
        case 1024L => "SetGroupId"
        case 2048L => "SetUserId"
        case other => other.toString
      }
    extension (self: UnixPermissionFlags) {
      inline def value: Long = self.asInstanceOf[Long]
      inline def |(other: UnixPermissionFlags): UnixPermissionFlags = (self.value | other.value).asInstanceOf[UnixPermissionFlags]
      inline def &(other: UnixPermissionFlags): UnixPermissionFlags = (self.value & other.value).asInstanceOf[UnixPermissionFlags]
      /** Every bit of `flag` is set. */
      inline def has(flag: UnixPermissionFlags): Boolean = (self.value & flag.value) == flag.value
    }
  }
}
