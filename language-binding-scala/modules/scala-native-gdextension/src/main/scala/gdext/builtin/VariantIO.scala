package gdext.builtin

import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import gdext.internal.Addr
import gdext.internal.ffi.types.*
import gdext.internal.ffi.types.GDExtensionVariantType.*

/** Primitive Variant reads and writes at `Long` addresses, for the registration
  * trampolines: no `Ptr` crosses a method boundary and no primitive is boxed,
  * so a call allocates nothing. Internal: public only because inlined
  * registration code in game projects references it.
  */
object VariantIO {

  def writeLong(dest: Long, v: Long): Unit = {
    val b = stackalloc[GDExtensionInt]()
    !b = v
    VariantConstructors.fromType(GDEXTENSION_VARIANT_TYPE_INT)(
      Addr.ptr[Byte](dest),
      b.asInstanceOf[Ptr[Byte]]
    )
  }

  def writeDouble(dest: Long, v: Double): Unit = {
    val b = stackalloc[CDouble]()
    !b = v
    VariantConstructors.fromType(GDEXTENSION_VARIANT_TYPE_FLOAT)(
      Addr.ptr[Byte](dest),
      b.asInstanceOf[Ptr[Byte]]
    )
  }

  def writeBool(dest: Long, v: Boolean): Unit = {
    val b = stackalloc[Byte]()
    !b = (if (v) 1 else 0).toByte
    VariantConstructors.fromType(GDEXTENSION_VARIANT_TYPE_BOOL)(
      Addr.ptr[Byte](dest),
      b
    )
  }

  def readLong(src: Long): Long = {
    val b = stackalloc[GDExtensionInt]()
    VariantConstructors.toType(GDEXTENSION_VARIANT_TYPE_INT)(
      b.asInstanceOf[Ptr[Byte]],
      Addr.ptr[Byte](src)
    )
    !b
  }

  def readDouble(src: Long): Double = {
    val b = stackalloc[CDouble]()
    VariantConstructors.toType(GDEXTENSION_VARIANT_TYPE_FLOAT)(
      b.asInstanceOf[Ptr[Byte]],
      Addr.ptr[Byte](src)
    )
    !b
  }

  def readBool(src: Long): Boolean = {
    val b = stackalloc[Byte]()
    VariantConstructors.toType(GDEXTENSION_VARIANT_TYPE_BOOL)(
      b,
      Addr.ptr[Byte](src)
    )
    !b != 0
  }
}
