package gdext.builtin

import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import scala.scalanative.libc.stdlib
import gdext.Godot
import gdext.internal.ffi.types.*
import gdext.internal.ffi.types.GDExtensionVariantType.*

/** Heap-owned `PackedFloat32Array` / `PackedVector3Array` values. The 16-byte
  * handle lives in malloc'd storage so the value can outlive a call frame; call
  * [[free]] when done (destroys the engine value and releases the storage).
  *
  * Element access goes through the `packed_*_operator_index` interface
  * functions, which return an interior pointer (the non-const variant triggers
  * copy-on-write first). Indices are bounds-checked on the Scala side: the
  * engine returns null for an out-of-range index, and dereferencing that
  * segfaults.
  */
sealed abstract class PackedArray[E] private[builtin] (
  private[gdext] val backing: GDExtensionTypePtr,
  variantType: GDExtensionVariantType
) {
  private var freed = false

  def size: Int = {
    checkLive()
    val out = stackalloc[GDExtensionInt]()
    BuiltinMethods
      .method(variantType, "size", PackedArray.HashSize)
      .apply(backing, null, out.asInstanceOf[GDExtensionTypePtr], 0)
    (!out).toInt
  }

  def resize(n: Int): Unit = {
    checkLive()
    require(n >= 0, s"negative size $n")
    val arg = stackalloc[GDExtensionInt]()
    !arg = n.toLong
    val args = stackalloc[GDExtensionConstTypePtr](1)
    args(0) = arg.asInstanceOf[GDExtensionConstTypePtr]
    val out = stackalloc[GDExtensionInt]()
    BuiltinMethods
      .method(variantType, "resize", PackedArray.HashResize)
      .apply(backing, args, out.asInstanceOf[GDExtensionTypePtr], 1)
  }

  def apply(i: Int): E = readAt(slot(i))
  def update(i: Int, value: E): Unit = writeAt(slot(i), value)
  def isEmpty: Boolean = size == 0
  def iterator: Iterator[E] = Iterator.tabulate(size)(apply)
  def toSeq: Seq[E] = iterator.toSeq

  def free(): Unit =
    if (!freed) {
      freed = true
      VariantConstructors.destructor(variantType)(backing)
      stdlib.free(backing.asInstanceOf[Ptr[Byte]])
    }

  protected def indexPtr(i: Int): Ptr[Byte]
  protected def readAt(p: Ptr[Byte]): E
  protected def writeAt(p: Ptr[Byte], value: E): Unit

  private def slot(i: Int): Ptr[Byte] = {
    checkLive()
    val n = size
    if (i < 0 || i >= n)
      throw new IndexOutOfBoundsException(s"index $i, size $n")
    indexPtr(i)
  }

  private def checkLive(): Unit =
    if (freed) throw new IllegalStateException("packed array used after free()")
}

object PackedArray {
  private[builtin] final val HashSize = 3173160232L
  private[builtin] final val HashResize = 848867239L

  private[builtin] def alloc(
    variantType: GDExtensionVariantType
  ): GDExtensionTypePtr = {
    val buf = stdlib.malloc(16.toCSize).asInstanceOf[GDExtensionTypePtr]
    Godot.interface.variant_get_ptr_constructor(variantType, 0)(buf, null)
    buf
  }

  private[builtin] def allocFromVariant(
    variantType: GDExtensionVariantType,
    variant: GDExtensionVariantPtr
  ): GDExtensionTypePtr = {
    val actual = Godot.interface.variant_get_type(variant)
    if (actual != variantType)
      throw new ClassCastException(
        s"variant holds type ${actual.toInt}, expected packed array type ${variantType.toInt}"
      )
    val buf = stdlib.malloc(16.toCSize).asInstanceOf[GDExtensionTypePtr]
    VariantConstructors.toType(variantType)(buf, variant)
    buf
  }
}

final class PackedFloat32Array private (handle: GDExtensionTypePtr)
    extends PackedArray[Float](
      handle,
      GDEXTENSION_VARIANT_TYPE_PACKED_FLOAT32_ARRAY
    ) {
  protected def indexPtr(i: Int): Ptr[Byte] =
    Godot.interface
      .packed_float32_array_operator_index(backing, i.toLong)
      .asInstanceOf[Ptr[Byte]]
  protected def readAt(p: Ptr[Byte]): Float = !p.asInstanceOf[Ptr[CFloat]]
  protected def writeAt(p: Ptr[Byte], value: Float): Unit =
    !p.asInstanceOf[Ptr[CFloat]] = value
}

object PackedFloat32Array {
  def empty(): PackedFloat32Array =
    new PackedFloat32Array(
      PackedArray.alloc(GDEXTENSION_VARIANT_TYPE_PACKED_FLOAT32_ARRAY)
    )

  def ofSize(n: Int): PackedFloat32Array = {
    val a = empty()
    a.resize(n)
    a
  }

  given ToVariant[PackedFloat32Array] = (value, dest) =>
    VariantConstructors.fromType(GDEXTENSION_VARIANT_TYPE_PACKED_FLOAT32_ARRAY)(
      dest,
      value.backing
    )

  given FromVariant[PackedFloat32Array] = variant =>
    new PackedFloat32Array(
      PackedArray.allocFromVariant(
        GDEXTENSION_VARIANT_TYPE_PACKED_FLOAT32_ARRAY,
        variant
      )
    )
}

final class PackedVector3Array private (handle: GDExtensionTypePtr)
    extends PackedArray[Vector3](
      handle,
      GDEXTENSION_VARIANT_TYPE_PACKED_VECTOR3_ARRAY
    ) {
  protected def indexPtr(i: Int): Ptr[Byte] =
    Godot.interface
      .packed_vector3_array_operator_index(backing, i.toLong)
      .asInstanceOf[Ptr[Byte]]
  protected def readAt(p: Ptr[Byte]): Vector3 = Vector3.readType(p)
  protected def writeAt(p: Ptr[Byte], value: Vector3): Unit =
    Vector3.writeType(value, p)
}

object PackedVector3Array {
  def empty(): PackedVector3Array =
    new PackedVector3Array(
      PackedArray.alloc(GDEXTENSION_VARIANT_TYPE_PACKED_VECTOR3_ARRAY)
    )

  def ofSize(n: Int): PackedVector3Array = {
    val a = empty()
    a.resize(n)
    a
  }

  given ToVariant[PackedVector3Array] = (value, dest) =>
    VariantConstructors.fromType(GDEXTENSION_VARIANT_TYPE_PACKED_VECTOR3_ARRAY)(
      dest,
      value.backing
    )

  given FromVariant[PackedVector3Array] = variant =>
    new PackedVector3Array(
      PackedArray.allocFromVariant(
        GDEXTENSION_VARIANT_TYPE_PACKED_VECTOR3_ARRAY,
        variant
      )
    )
}

final class PackedInt32Array private (handle: GDExtensionTypePtr)
    extends PackedArray[Int](
      handle,
      GDEXTENSION_VARIANT_TYPE_PACKED_INT32_ARRAY
    ) {
  protected def indexPtr(i: Int): Ptr[Byte] =
    Godot.interface
      .packed_int32_array_operator_index(backing, i.toLong)
      .asInstanceOf[Ptr[Byte]]
  protected def readAt(p: Ptr[Byte]): Int = !p.asInstanceOf[Ptr[CInt]]
  protected def writeAt(p: Ptr[Byte], value: Int): Unit =
    !p.asInstanceOf[Ptr[CInt]] = value
}

object PackedInt32Array {
  def empty(): PackedInt32Array =
    new PackedInt32Array(
      PackedArray.alloc(GDEXTENSION_VARIANT_TYPE_PACKED_INT32_ARRAY)
    )

  def ofSize(n: Int): PackedInt32Array = {
    val a = empty()
    a.resize(n)
    a
  }

  given ToVariant[PackedInt32Array] = (value, dest) =>
    VariantConstructors
      .fromType(GDEXTENSION_VARIANT_TYPE_PACKED_INT32_ARRAY)(
        dest,
        value.backing
      )

  given FromVariant[PackedInt32Array] = variant =>
    new PackedInt32Array(
      PackedArray.allocFromVariant(
        GDEXTENSION_VARIANT_TYPE_PACKED_INT32_ARRAY,
        variant
      )
    )
}
