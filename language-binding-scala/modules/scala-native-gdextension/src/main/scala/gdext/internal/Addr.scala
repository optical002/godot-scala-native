package gdext.internal

import scala.scalanative.runtime.{Intrinsics, fromRawPtr}
import scala.scalanative.unsafe.Ptr

/** Pointers as plain `Long` addresses. Scala Native heap-allocates a box for a
  * `Ptr` passed to (or returned from) a method that is not inlined, so the hot
  * path hands addresses across such calls and rebuilds the `Ptr` locally.
  */
object Addr {
  inline def ptr[T](address: Long): Ptr[T] =
    fromRawPtr[T](Intrinsics.castLongToRawPtr(address))
}
