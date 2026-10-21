package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `StreamPeer`, extends `RefCounted`. */
abstract class StreamPeer extends RefCounted {
  override def godotClassName: String = "StreamPeer"

  /** StreamPeer.get_available_bytes */
  final def getAvailableBytes(): Long = {
    if (gdext.classes.StreamPeer.mb_get_available_bytes == null) gdext.classes.StreamPeer.mb_get_available_bytes = MethodBind.get("StreamPeer", "get_available_bytes", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.StreamPeer.mb_get_available_bytes, livePtr)
  }

  /** StreamPeer.set_big_endian */
  final def setBigEndian(enable: Boolean): Unit = {
    if (gdext.classes.StreamPeer.mb_set_big_endian == null) gdext.classes.StreamPeer.mb_set_big_endian = MethodBind.get("StreamPeer", "set_big_endian", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.StreamPeer.mb_set_big_endian, livePtr, enable)
  }

  /** StreamPeer.is_big_endian_enabled */
  final def isBigEndianEnabled(): Boolean = {
    if (gdext.classes.StreamPeer.mb_is_big_endian_enabled == null) gdext.classes.StreamPeer.mb_is_big_endian_enabled = MethodBind.get("StreamPeer", "is_big_endian_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.StreamPeer.mb_is_big_endian_enabled, livePtr)
  }

  /** StreamPeer.put_8 */
  final def put8(value: Long): Unit = {
    if (gdext.classes.StreamPeer.mb_put_8 == null) gdext.classes.StreamPeer.mb_put_8 = MethodBind.get("StreamPeer", "put_8", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.StreamPeer.mb_put_8, livePtr, value)
  }

  /** StreamPeer.put_u8 */
  final def putU8(value: Long): Unit = {
    if (gdext.classes.StreamPeer.mb_put_u8 == null) gdext.classes.StreamPeer.mb_put_u8 = MethodBind.get("StreamPeer", "put_u8", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.StreamPeer.mb_put_u8, livePtr, value)
  }

  /** StreamPeer.put_16 */
  final def put16(value: Long): Unit = {
    if (gdext.classes.StreamPeer.mb_put_16 == null) gdext.classes.StreamPeer.mb_put_16 = MethodBind.get("StreamPeer", "put_16", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.StreamPeer.mb_put_16, livePtr, value)
  }

  /** StreamPeer.put_u16 */
  final def putU16(value: Long): Unit = {
    if (gdext.classes.StreamPeer.mb_put_u16 == null) gdext.classes.StreamPeer.mb_put_u16 = MethodBind.get("StreamPeer", "put_u16", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.StreamPeer.mb_put_u16, livePtr, value)
  }

  /** StreamPeer.put_32 */
  final def put32(value: Long): Unit = {
    if (gdext.classes.StreamPeer.mb_put_32 == null) gdext.classes.StreamPeer.mb_put_32 = MethodBind.get("StreamPeer", "put_32", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.StreamPeer.mb_put_32, livePtr, value)
  }

  /** StreamPeer.put_u32 */
  final def putU32(value: Long): Unit = {
    if (gdext.classes.StreamPeer.mb_put_u32 == null) gdext.classes.StreamPeer.mb_put_u32 = MethodBind.get("StreamPeer", "put_u32", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.StreamPeer.mb_put_u32, livePtr, value)
  }

  /** StreamPeer.put_64 */
  final def put64(value: Long): Unit = {
    if (gdext.classes.StreamPeer.mb_put_64 == null) gdext.classes.StreamPeer.mb_put_64 = MethodBind.get("StreamPeer", "put_64", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.StreamPeer.mb_put_64, livePtr, value)
  }

  /** StreamPeer.put_u64 */
  final def putU64(value: Long): Unit = {
    if (gdext.classes.StreamPeer.mb_put_u64 == null) gdext.classes.StreamPeer.mb_put_u64 = MethodBind.get("StreamPeer", "put_u64", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.StreamPeer.mb_put_u64, livePtr, value)
  }

  /** StreamPeer.put_half */
  final def putHalf(value: Double): Unit = {
    if (gdext.classes.StreamPeer.mb_put_half == null) gdext.classes.StreamPeer.mb_put_half = MethodBind.get("StreamPeer", "put_half", 373806689L)
    Ptrcall.callVoid1(gdext.classes.StreamPeer.mb_put_half, livePtr, value)
  }

  /** StreamPeer.put_float */
  final def putFloat(value: Double): Unit = {
    if (gdext.classes.StreamPeer.mb_put_float == null) gdext.classes.StreamPeer.mb_put_float = MethodBind.get("StreamPeer", "put_float", 373806689L)
    Ptrcall.callVoid1(gdext.classes.StreamPeer.mb_put_float, livePtr, value)
  }

  /** StreamPeer.put_double */
  final def putDouble(value: Double): Unit = {
    if (gdext.classes.StreamPeer.mb_put_double == null) gdext.classes.StreamPeer.mb_put_double = MethodBind.get("StreamPeer", "put_double", 373806689L)
    Ptrcall.callVoid1(gdext.classes.StreamPeer.mb_put_double, livePtr, value)
  }

  /** StreamPeer.put_string */
  final def putString(value: String): Unit = {
    if (gdext.classes.StreamPeer.mb_put_string == null) gdext.classes.StreamPeer.mb_put_string = MethodBind.get("StreamPeer", "put_string", 83702148L)
    Ptrcall.callVoid1(gdext.classes.StreamPeer.mb_put_string, livePtr, value)
  }

  /** StreamPeer.put_utf8_string */
  final def putUtf8String(value: String): Unit = {
    if (gdext.classes.StreamPeer.mb_put_utf8_string == null) gdext.classes.StreamPeer.mb_put_utf8_string = MethodBind.get("StreamPeer", "put_utf8_string", 83702148L)
    Ptrcall.callVoid1(gdext.classes.StreamPeer.mb_put_utf8_string, livePtr, value)
  }

  /** StreamPeer.get_8 */
  final def get8(): Long = {
    if (gdext.classes.StreamPeer.mb_get_8 == null) gdext.classes.StreamPeer.mb_get_8 = MethodBind.get("StreamPeer", "get_8", 2455072627L)
    Ptrcall.call0[Long](gdext.classes.StreamPeer.mb_get_8, livePtr)
  }

  /** StreamPeer.get_u8 */
  final def getU8(): Long = {
    if (gdext.classes.StreamPeer.mb_get_u8 == null) gdext.classes.StreamPeer.mb_get_u8 = MethodBind.get("StreamPeer", "get_u8", 2455072627L)
    Ptrcall.call0[Long](gdext.classes.StreamPeer.mb_get_u8, livePtr)
  }

  /** StreamPeer.get_16 */
  final def get16(): Long = {
    if (gdext.classes.StreamPeer.mb_get_16 == null) gdext.classes.StreamPeer.mb_get_16 = MethodBind.get("StreamPeer", "get_16", 2455072627L)
    Ptrcall.call0[Long](gdext.classes.StreamPeer.mb_get_16, livePtr)
  }

  /** StreamPeer.get_u16 */
  final def getU16(): Long = {
    if (gdext.classes.StreamPeer.mb_get_u16 == null) gdext.classes.StreamPeer.mb_get_u16 = MethodBind.get("StreamPeer", "get_u16", 2455072627L)
    Ptrcall.call0[Long](gdext.classes.StreamPeer.mb_get_u16, livePtr)
  }

  /** StreamPeer.get_32 */
  final def get32(): Long = {
    if (gdext.classes.StreamPeer.mb_get_32 == null) gdext.classes.StreamPeer.mb_get_32 = MethodBind.get("StreamPeer", "get_32", 2455072627L)
    Ptrcall.call0[Long](gdext.classes.StreamPeer.mb_get_32, livePtr)
  }

  /** StreamPeer.get_u32 */
  final def getU32(): Long = {
    if (gdext.classes.StreamPeer.mb_get_u32 == null) gdext.classes.StreamPeer.mb_get_u32 = MethodBind.get("StreamPeer", "get_u32", 2455072627L)
    Ptrcall.call0[Long](gdext.classes.StreamPeer.mb_get_u32, livePtr)
  }

  /** StreamPeer.get_64 */
  final def get64(): Long = {
    if (gdext.classes.StreamPeer.mb_get_64 == null) gdext.classes.StreamPeer.mb_get_64 = MethodBind.get("StreamPeer", "get_64", 2455072627L)
    Ptrcall.call0[Long](gdext.classes.StreamPeer.mb_get_64, livePtr)
  }

  /** StreamPeer.get_u64 */
  final def getU64(): Long = {
    if (gdext.classes.StreamPeer.mb_get_u64 == null) gdext.classes.StreamPeer.mb_get_u64 = MethodBind.get("StreamPeer", "get_u64", 2455072627L)
    Ptrcall.call0[Long](gdext.classes.StreamPeer.mb_get_u64, livePtr)
  }

  /** StreamPeer.get_half */
  final def getHalf(): Double = {
    if (gdext.classes.StreamPeer.mb_get_half == null) gdext.classes.StreamPeer.mb_get_half = MethodBind.get("StreamPeer", "get_half", 191475506L)
    Ptrcall.call0[Double](gdext.classes.StreamPeer.mb_get_half, livePtr)
  }

  /** StreamPeer.get_float */
  final def getFloat(): Double = {
    if (gdext.classes.StreamPeer.mb_get_float == null) gdext.classes.StreamPeer.mb_get_float = MethodBind.get("StreamPeer", "get_float", 191475506L)
    Ptrcall.call0[Double](gdext.classes.StreamPeer.mb_get_float, livePtr)
  }

  /** StreamPeer.get_double */
  final def getDouble(): Double = {
    if (gdext.classes.StreamPeer.mb_get_double == null) gdext.classes.StreamPeer.mb_get_double = MethodBind.get("StreamPeer", "get_double", 191475506L)
    Ptrcall.call0[Double](gdext.classes.StreamPeer.mb_get_double, livePtr)
  }

  /** StreamPeer.get_string */
  final def getString(bytes: Long): String = {
    if (gdext.classes.StreamPeer.mb_get_string == null) gdext.classes.StreamPeer.mb_get_string = MethodBind.get("StreamPeer", "get_string", 2309358862L)
    Ptrcall.call1[Long, String](gdext.classes.StreamPeer.mb_get_string, livePtr, bytes)
  }

  /** StreamPeer.get_utf8_string */
  final def getUtf8String(bytes: Long): String = {
    if (gdext.classes.StreamPeer.mb_get_utf8_string == null) gdext.classes.StreamPeer.mb_get_utf8_string = MethodBind.get("StreamPeer", "get_utf8_string", 2309358862L)
    Ptrcall.call1[Long, String](gdext.classes.StreamPeer.mb_get_utf8_string, livePtr, bytes)
  }

}

object StreamPeer {
  private[classes] var mb_get_available_bytes: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_big_endian: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_big_endian_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_put_8: GDExtensionMethodBindPtr = null
  private[classes] var mb_put_u8: GDExtensionMethodBindPtr = null
  private[classes] var mb_put_16: GDExtensionMethodBindPtr = null
  private[classes] var mb_put_u16: GDExtensionMethodBindPtr = null
  private[classes] var mb_put_32: GDExtensionMethodBindPtr = null
  private[classes] var mb_put_u32: GDExtensionMethodBindPtr = null
  private[classes] var mb_put_64: GDExtensionMethodBindPtr = null
  private[classes] var mb_put_u64: GDExtensionMethodBindPtr = null
  private[classes] var mb_put_half: GDExtensionMethodBindPtr = null
  private[classes] var mb_put_float: GDExtensionMethodBindPtr = null
  private[classes] var mb_put_double: GDExtensionMethodBindPtr = null
  private[classes] var mb_put_string: GDExtensionMethodBindPtr = null
  private[classes] var mb_put_utf8_string: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_8: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_u8: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_16: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_u16: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_32: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_u32: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_64: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_u64: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_half: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_float: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_double: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_string: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_utf8_string: GDExtensionMethodBindPtr = null
}
