package gdext.register

import scala.scalanative.unsafe.*
import scala.scalanative.runtime.Intrinsics
import scala.scalanative.runtime.{fromRawPtr, toRawPtr}

/**
 * Encodes the small integer tokens that [[ClassRegistry]] hands to Godot as
 * opaque `CVoidPtr`s (class_userdata, instance pointer) and back.
 *
 * We deliberately stuff an *integer id* into the pointer slot rather than a
 * real Scala-object address: the Scala objects are kept alive by the registry,
 * and the GC never has to chase a fabricated pointer. Conversion is via the
 * Scala Native intrinsics for raw-pointer/word casts.
 */
object Tokens {
  /** Pack a token id into a void pointer slot. */
  def toPtr(id: Long): CVoidPtr =
    fromRawPtr[Byte](Intrinsics.castLongToRawPtr(id))

  /** Unpack a token id from a void pointer slot. */
  def fromPtr(p: CVoidPtr): Long =
    Intrinsics.castRawPtrToLong(toRawPtr(p))
}
