package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `StreamPeer`, extends `RefCounted`. */
abstract class StreamPeer extends RefCounted {

  /** StreamPeer.get_available_bytes */
  final def getAvailableBytes(): Long =
    Ptrcall.call0[Long](MethodBind.get("StreamPeer", "get_available_bytes", 3905245786L), hostObject.objectPtr)

  /** StreamPeer.set_big_endian */
  final def setBigEndian(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("StreamPeer", "set_big_endian", 2586408642L), hostObject.objectPtr, enable)

  /** StreamPeer.is_big_endian_enabled */
  final def isBigEndianEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("StreamPeer", "is_big_endian_enabled", 36873697L), hostObject.objectPtr)

  /** StreamPeer.put_8 */
  final def put8(value: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("StreamPeer", "put_8", 1286410249L), hostObject.objectPtr, value)

  /** StreamPeer.put_u8 */
  final def putU8(value: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("StreamPeer", "put_u8", 1286410249L), hostObject.objectPtr, value)

  /** StreamPeer.put_16 */
  final def put16(value: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("StreamPeer", "put_16", 1286410249L), hostObject.objectPtr, value)

  /** StreamPeer.put_u16 */
  final def putU16(value: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("StreamPeer", "put_u16", 1286410249L), hostObject.objectPtr, value)

  /** StreamPeer.put_32 */
  final def put32(value: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("StreamPeer", "put_32", 1286410249L), hostObject.objectPtr, value)

  /** StreamPeer.put_u32 */
  final def putU32(value: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("StreamPeer", "put_u32", 1286410249L), hostObject.objectPtr, value)

  /** StreamPeer.put_64 */
  final def put64(value: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("StreamPeer", "put_64", 1286410249L), hostObject.objectPtr, value)

  /** StreamPeer.put_u64 */
  final def putU64(value: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("StreamPeer", "put_u64", 1286410249L), hostObject.objectPtr, value)

  /** StreamPeer.put_half */
  final def putHalf(value: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("StreamPeer", "put_half", 373806689L), hostObject.objectPtr, value)

  /** StreamPeer.put_float */
  final def putFloat(value: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("StreamPeer", "put_float", 373806689L), hostObject.objectPtr, value)

  /** StreamPeer.put_double */
  final def putDouble(value: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("StreamPeer", "put_double", 373806689L), hostObject.objectPtr, value)

  /** StreamPeer.put_string */
  final def putString(value: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("StreamPeer", "put_string", 83702148L), hostObject.objectPtr, value)

  /** StreamPeer.put_utf8_string */
  final def putUtf8String(value: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("StreamPeer", "put_utf8_string", 83702148L), hostObject.objectPtr, value)

  /** StreamPeer.get_8 */
  final def get8(): Long =
    Ptrcall.call0[Long](MethodBind.get("StreamPeer", "get_8", 2455072627L), hostObject.objectPtr)

  /** StreamPeer.get_u8 */
  final def getU8(): Long =
    Ptrcall.call0[Long](MethodBind.get("StreamPeer", "get_u8", 2455072627L), hostObject.objectPtr)

  /** StreamPeer.get_16 */
  final def get16(): Long =
    Ptrcall.call0[Long](MethodBind.get("StreamPeer", "get_16", 2455072627L), hostObject.objectPtr)

  /** StreamPeer.get_u16 */
  final def getU16(): Long =
    Ptrcall.call0[Long](MethodBind.get("StreamPeer", "get_u16", 2455072627L), hostObject.objectPtr)

  /** StreamPeer.get_32 */
  final def get32(): Long =
    Ptrcall.call0[Long](MethodBind.get("StreamPeer", "get_32", 2455072627L), hostObject.objectPtr)

  /** StreamPeer.get_u32 */
  final def getU32(): Long =
    Ptrcall.call0[Long](MethodBind.get("StreamPeer", "get_u32", 2455072627L), hostObject.objectPtr)

  /** StreamPeer.get_64 */
  final def get64(): Long =
    Ptrcall.call0[Long](MethodBind.get("StreamPeer", "get_64", 2455072627L), hostObject.objectPtr)

  /** StreamPeer.get_u64 */
  final def getU64(): Long =
    Ptrcall.call0[Long](MethodBind.get("StreamPeer", "get_u64", 2455072627L), hostObject.objectPtr)

  /** StreamPeer.get_half */
  final def getHalf(): Double =
    Ptrcall.call0[Double](MethodBind.get("StreamPeer", "get_half", 191475506L), hostObject.objectPtr)

  /** StreamPeer.get_float */
  final def getFloat(): Double =
    Ptrcall.call0[Double](MethodBind.get("StreamPeer", "get_float", 191475506L), hostObject.objectPtr)

  /** StreamPeer.get_double */
  final def getDouble(): Double =
    Ptrcall.call0[Double](MethodBind.get("StreamPeer", "get_double", 191475506L), hostObject.objectPtr)

  /** StreamPeer.get_string */
  final def getString(bytes: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("StreamPeer", "get_string", 2309358862L), hostObject.objectPtr, bytes)

  /** StreamPeer.get_utf8_string */
  final def getUtf8String(bytes: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("StreamPeer", "get_utf8_string", 2309358862L), hostObject.objectPtr, bytes)

}

object StreamPeer {
  /** Class metadata for Gd[StreamPeer] lifetime management and casting. */
  given GodotClass[StreamPeer] with {
    def className = "StreamPeer"
    def isRefCounted = true
    def wrap(o: GodotObject): StreamPeer = new StreamPeer {}.withHost(o.objectPtr)
    def unwrap(t: StreamPeer): GodotObject = t.hostObject
  }
}
