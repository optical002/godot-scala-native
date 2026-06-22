package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `FileAccess`, extends `RefCounted`. */
abstract class FileAccess extends RefCounted {

  /** FileAccess.resize */
  final def resize(length: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("FileAccess", "resize", 844576869L), hostObject.objectPtr, length)

  /** FileAccess.flush */
  final def flush(): Unit =
    Ptrcall.callVoid0(MethodBind.get("FileAccess", "flush", 3218959716L), hostObject.objectPtr)

  /** FileAccess.get_path */
  final def getPath(): String =
    Ptrcall.call0[String](MethodBind.get("FileAccess", "get_path", 201670096L), hostObject.objectPtr)

  /** FileAccess.get_path_absolute */
  final def getPathAbsolute(): String =
    Ptrcall.call0[String](MethodBind.get("FileAccess", "get_path_absolute", 201670096L), hostObject.objectPtr)

  /** FileAccess.is_open */
  final def isOpen(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("FileAccess", "is_open", 36873697L), hostObject.objectPtr)

  /** FileAccess.seek */
  final def seek(position: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("FileAccess", "seek", 1286410249L), hostObject.objectPtr, position)

  /** FileAccess.seek_end */
  final def seekEnd(position: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("FileAccess", "seek_end", 1995695955L), hostObject.objectPtr, position)

  /** FileAccess.get_position */
  final def getPosition(): Long =
    Ptrcall.call0[Long](MethodBind.get("FileAccess", "get_position", 3905245786L), hostObject.objectPtr)

  /** FileAccess.get_length */
  final def getLength(): Long =
    Ptrcall.call0[Long](MethodBind.get("FileAccess", "get_length", 3905245786L), hostObject.objectPtr)

  /** FileAccess.eof_reached */
  final def eofReached(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("FileAccess", "eof_reached", 36873697L), hostObject.objectPtr)

  /** FileAccess.get_8 */
  final def get8(): Long =
    Ptrcall.call0[Long](MethodBind.get("FileAccess", "get_8", 3905245786L), hostObject.objectPtr)

  /** FileAccess.get_16 */
  final def get16(): Long =
    Ptrcall.call0[Long](MethodBind.get("FileAccess", "get_16", 3905245786L), hostObject.objectPtr)

  /** FileAccess.get_32 */
  final def get32(): Long =
    Ptrcall.call0[Long](MethodBind.get("FileAccess", "get_32", 3905245786L), hostObject.objectPtr)

  /** FileAccess.get_64 */
  final def get64(): Long =
    Ptrcall.call0[Long](MethodBind.get("FileAccess", "get_64", 3905245786L), hostObject.objectPtr)

  /** FileAccess.get_half */
  final def getHalf(): Double =
    Ptrcall.call0[Double](MethodBind.get("FileAccess", "get_half", 1740695150L), hostObject.objectPtr)

  /** FileAccess.get_float */
  final def getFloat(): Double =
    Ptrcall.call0[Double](MethodBind.get("FileAccess", "get_float", 1740695150L), hostObject.objectPtr)

  /** FileAccess.get_double */
  final def getDouble(): Double =
    Ptrcall.call0[Double](MethodBind.get("FileAccess", "get_double", 1740695150L), hostObject.objectPtr)

  /** FileAccess.get_real */
  final def getReal(): Double =
    Ptrcall.call0[Double](MethodBind.get("FileAccess", "get_real", 1740695150L), hostObject.objectPtr)

  /** FileAccess.get_line */
  final def getLine(): String =
    Ptrcall.call0[String](MethodBind.get("FileAccess", "get_line", 201670096L), hostObject.objectPtr)

  /** FileAccess.get_as_text */
  final def getAsText(): String =
    Ptrcall.call0[String](MethodBind.get("FileAccess", "get_as_text", 201670096L), hostObject.objectPtr)

  /** FileAccess.is_big_endian */
  final def isBigEndian(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("FileAccess", "is_big_endian", 36873697L), hostObject.objectPtr)

  /** FileAccess.set_big_endian */
  final def setBigEndian(big_endian: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("FileAccess", "set_big_endian", 2586408642L), hostObject.objectPtr, big_endian)

  /** FileAccess.get_error */
  final def getError(): Long =
    Ptrcall.call0[Long](MethodBind.get("FileAccess", "get_error", 3185525595L), hostObject.objectPtr)

  /** FileAccess.store_8 */
  final def store8(value: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("FileAccess", "store_8", 3067735520L), hostObject.objectPtr, value)

  /** FileAccess.store_16 */
  final def store16(value: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("FileAccess", "store_16", 3067735520L), hostObject.objectPtr, value)

  /** FileAccess.store_32 */
  final def store32(value: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("FileAccess", "store_32", 3067735520L), hostObject.objectPtr, value)

  /** FileAccess.store_64 */
  final def store64(value: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("FileAccess", "store_64", 3067735520L), hostObject.objectPtr, value)

  /** FileAccess.store_half */
  final def storeHalf(value: Double): Boolean =
    Ptrcall.call1[Double, Boolean](MethodBind.get("FileAccess", "store_half", 330693286L), hostObject.objectPtr, value)

  /** FileAccess.store_float */
  final def storeFloat(value: Double): Boolean =
    Ptrcall.call1[Double, Boolean](MethodBind.get("FileAccess", "store_float", 330693286L), hostObject.objectPtr, value)

  /** FileAccess.store_double */
  final def storeDouble(value: Double): Boolean =
    Ptrcall.call1[Double, Boolean](MethodBind.get("FileAccess", "store_double", 330693286L), hostObject.objectPtr, value)

  /** FileAccess.store_real */
  final def storeReal(value: Double): Boolean =
    Ptrcall.call1[Double, Boolean](MethodBind.get("FileAccess", "store_real", 330693286L), hostObject.objectPtr, value)

  /** FileAccess.store_line */
  final def storeLine(line: String): Boolean =
    Ptrcall.call1[String, Boolean](MethodBind.get("FileAccess", "store_line", 2323990056L), hostObject.objectPtr, line)

  /** FileAccess.store_string */
  final def storeString(string: String): Boolean =
    Ptrcall.call1[String, Boolean](MethodBind.get("FileAccess", "store_string", 2323990056L), hostObject.objectPtr, string)

  /** FileAccess.store_pascal_string */
  final def storePascalString(string: String): Boolean =
    Ptrcall.call1[String, Boolean](MethodBind.get("FileAccess", "store_pascal_string", 2323990056L), hostObject.objectPtr, string)

  /** FileAccess.get_pascal_string */
  final def getPascalString(): String =
    Ptrcall.call0[String](MethodBind.get("FileAccess", "get_pascal_string", 2841200299L), hostObject.objectPtr)

  /** FileAccess.close */
  final def close(): Unit =
    Ptrcall.callVoid0(MethodBind.get("FileAccess", "close", 3218959716L), hostObject.objectPtr)

}

object FileAccess {
  /** Class metadata for Gd[FileAccess] lifetime management and casting. */
  given GodotClass[FileAccess] with {
    def className = "FileAccess"
    def isRefCounted = true
    def wrap(o: GodotObject): FileAccess = new FileAccess {}.withHost(o.objectPtr)
    def unwrap(t: FileAccess): GodotObject = t.hostObject
  }
}
