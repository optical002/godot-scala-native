package gdext.internal.engine

import scala.compiletime.{erasedValue, error}
import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import gdext.Godot
import gdext.builtin.*
import gdext.internal.ffi.types.*

/** Compile-time marshalling for engine method `ptrcall`s.
  *
  * `ptrcall` passes each argument as a pointer to its *native* representation
  * (an int64, a double, a Vector2's 8 bytes, an object pointer, ...) and writes
  * the return value's native representation into a caller-provided buffer.
  *
  * Every method here is `inline` and dispatches on the static type with
  * `erasedValue`, so a call site expands to straight-line code for its exact
  * types: no typeclass instances, no boxing of primitives or `Ptr`-backed
  * opaque types, no heap allocation. Argument and return buffers live on the
  * stack of the (non-inline) calling method.
  */
object Marshal {

  /** Bytes needed for `A`'s native representation. Object returns are read as
    * the pointer's address (`Long`), never as a `Ptr`, so no box is made.
    */
  inline def size[A]: Int = inline erasedValue[A] match {
    case _: Long        => 8
    case _: Int         => 8
    case _: Double      => 8
    case _: Boolean     => 1
    case _: GodotObject => 8
    case _: String      => BuiltinSizes.String
    case _: StringName  => BuiltinSizes.StringName
    case _: Variant     => BuiltinSizes.Variant
    case _: Callable    => BuiltinSizes.Callable
    case _: Vector2     => BuiltinSizes.Vector2
    case _: Vector2i    => BuiltinSizes.Vector2i
    case _: Vector3     => BuiltinSizes.Vector3
    case _: Vector3i    => BuiltinSizes.Vector3i
    case _: Vector4     => BuiltinSizes.Vector4
    case _: Vector4i    => BuiltinSizes.Vector4i
    case _: Color       => BuiltinSizes.Color
    case _: Rect2       => BuiltinSizes.Rect2
    case _: Rect2i      => BuiltinSizes.Rect2i
    case _: Quaternion  => BuiltinSizes.Quaternion
    case _: Plane       => BuiltinSizes.Plane
    case _: AABB        => BuiltinSizes.AABB
    case _: Basis       => BuiltinSizes.Basis
    case _: Transform2D => BuiltinSizes.Transform2D
    case _: Transform3D => BuiltinSizes.Transform3D
    case _: Projection  => BuiltinSizes.Projection
    case _              => error("ptrcall: unsupported type")
  }

  /** Lay `v` down as a ptrcall argument in `b` ([[size]] bytes). A String
    * argument builds a temporary Godot String that [[release]] destroys after
    * the call; every other kind is a plain copy.
    */
  inline def write[A](inline v: A, b: Ptr[Byte]): Unit =
    inline erasedValue[A] match {
      case _: Long =>
        !b.asInstanceOf[Ptr[GDExtensionInt]] = v.asInstanceOf[Long]
      case _: Int =>
        !b.asInstanceOf[Ptr[GDExtensionInt]] = v.asInstanceOf[Int].toLong
      case _: Double  => !b.asInstanceOf[Ptr[CDouble]] = v.asInstanceOf[Double]
      case _: Boolean =>
        !b.asInstanceOf[Ptr[GDExtensionBool]] =
          (if (v.asInstanceOf[Boolean]) 1 else 0).toUByte
      case _: GodotObject =>
        !b.asInstanceOf[Ptr[GDExtensionObjectPtr]] =
          GodotObject.objectPtr(v.asInstanceOf[GodotObject])
      case _: String => GString.writeAt(v.asInstanceOf[String], b.toLong)
      // A StringName / Variant / Callable value is a pointer to its storage;
      // ptrcall wants the storage bytes themselves in the arg buffer.
      case _: StringName =>
        copy(
          v.asInstanceOf[StringName].ptr.asInstanceOf[Ptr[Byte]],
          b,
          BuiltinSizes.StringName
        )
      case _: Variant =>
        copy(
          v.asInstanceOf[Variant].ptr.asInstanceOf[Ptr[Byte]],
          b,
          BuiltinSizes.Variant
        )
      case _: Callable =>
        copy(v.asInstanceOf[Callable].ptr, b, BuiltinSizes.Callable)
      case _: Vector2     => Vector2.writeType(v.asInstanceOf[Vector2], b)
      case _: Vector2i    => Vector2i.writeType(v.asInstanceOf[Vector2i], b)
      case _: Vector3     => Vector3.writeType(v.asInstanceOf[Vector3], b)
      case _: Vector3i    => Vector3i.writeType(v.asInstanceOf[Vector3i], b)
      case _: Vector4     => Vector4.writeType(v.asInstanceOf[Vector4], b)
      case _: Vector4i    => Vector4i.writeType(v.asInstanceOf[Vector4i], b)
      case _: Color       => Color.writeType(v.asInstanceOf[Color], b)
      case _: Rect2       => Rect2.writeType(v.asInstanceOf[Rect2], b)
      case _: Rect2i      => Rect2i.writeType(v.asInstanceOf[Rect2i], b)
      case _: Quaternion  => Quaternion.writeType(v.asInstanceOf[Quaternion], b)
      case _: Plane       => Plane.writeType(v.asInstanceOf[Plane], b)
      case _: AABB        => AABB.writeType(v.asInstanceOf[AABB], b)
      case _: Basis       => Basis.writeType(v.asInstanceOf[Basis], b)
      case _: Transform2D =>
        Transform2D.writeType(v.asInstanceOf[Transform2D], b)
      case _: Transform3D =>
        Transform3D.writeType(v.asInstanceOf[Transform3D], b)
      case _: Projection => Projection.writeType(v.asInstanceOf[Projection], b)
    }

  /** Destroy whatever [[write]] built in `b` once the call has returned. */
  inline def release[A](b: Ptr[Byte]): Unit = inline erasedValue[A] match {
    case _: String =>
      VariantConstructors.destructor(
        gdext.internal.ffi.types.GDExtensionVariantType.GDEXTENSION_VARIANT_TYPE_STRING
      )(b)
    case _ => ()
  }

  /** Read a ptrcall return value of type `R` out of `b`. Owned engine values in
    * the buffer (a String's reference, a StringName's reference) are consumed:
    * a String is decoded and destroyed; a StringName is interned through
    * [[StringNames.adopt]], so its storage stays valid for the process.
    */
  inline def read[R](b: Ptr[Byte]): R = inline erasedValue[R] match {
    case _: Long => (!b.asInstanceOf[Ptr[GDExtensionInt]]).asInstanceOf[R]
    case _: Int  => (!b.asInstanceOf[Ptr[GDExtensionInt]]).toInt.asInstanceOf[R]
    case _: Double  => (!b.asInstanceOf[Ptr[CDouble]]).asInstanceOf[R]
    case _: Boolean =>
      ((!b.asInstanceOf[Ptr[GDExtensionBool]]).toInt != 0).asInstanceOf[R]
    case _: GodotObject =>
      GodotObject
        .fromPtr(!b.asInstanceOf[Ptr[GDExtensionObjectPtr]])
        .asInstanceOf[R]
    case _: String      => GString.takeAt(b.toLong).asInstanceOf[R]
    case _: StringName  => StringNames.adopt(b.toLong).asInstanceOf[R]
    case _: Variant     => Variant.copyToHeap(b).asInstanceOf[R]
    case _: Vector2     => Vector2.readType(b).asInstanceOf[R]
    case _: Vector2i    => Vector2i.readType(b).asInstanceOf[R]
    case _: Vector3     => Vector3.readType(b).asInstanceOf[R]
    case _: Vector3i    => Vector3i.readType(b).asInstanceOf[R]
    case _: Vector4     => Vector4.readType(b).asInstanceOf[R]
    case _: Vector4i    => Vector4i.readType(b).asInstanceOf[R]
    case _: Color       => Color.readType(b).asInstanceOf[R]
    case _: Rect2       => Rect2.readType(b).asInstanceOf[R]
    case _: Rect2i      => Rect2i.readType(b).asInstanceOf[R]
    case _: Quaternion  => Quaternion.readType(b).asInstanceOf[R]
    case _: Plane       => Plane.readType(b).asInstanceOf[R]
    case _: AABB        => AABB.readType(b).asInstanceOf[R]
    case _: Basis       => Basis.readType(b).asInstanceOf[R]
    case _: Transform2D => Transform2D.readType(b).asInstanceOf[R]
    case _: Transform3D => Transform3D.readType(b).asInstanceOf[R]
    case _: Projection  => Projection.readType(b).asInstanceOf[R]
  }

  private[gdext] def copy(src: Ptr[Byte], dst: Ptr[Byte], n: Int): Unit = {
    var i = 0
    while (i < n) { dst(i) = src(i); i += 1 }
  }
}

/** Fixed-arity ptrcall dispatchers used by the generated engine wrappers. */
object Ptrcall {

  // Inline so the stack buffers never cross a method boundary: Scala Native
  // boxes a `Ptr` passed to a non-inlined method (one heap object each).
  private[gdext] inline def invoke(
    bind: GDExtensionMethodBindPtr,
    instance: GDExtensionObjectPtr,
    args: Ptr[GDExtensionConstTypePtr],
    ret: GDExtensionTypePtr
  ): Unit = {
    if (bind == null) unboundMethod()
    Godot.interface.object_method_bind_ptrcall(bind, instance, args, ret)
  }

  private def unboundMethod(): Nothing =
    throw new IllegalStateException(
      "engine method bind not found (hash mismatch?)"
    )

  inline def callVoid0(
    bind: GDExtensionMethodBindPtr,
    instance: GDExtensionObjectPtr
  ): Unit =
    invoke(bind, instance, null, null)

  inline def call0[R](
    bind: GDExtensionMethodBindPtr,
    instance: GDExtensionObjectPtr
  ): R = {
    val r = stackalloc[Byte](Marshal.size[R].toCSize)
    invoke(bind, instance, null, r)
    Marshal.read[R](r)
  }

  inline def callVoid1[A1](
    bind: GDExtensionMethodBindPtr,
    instance: GDExtensionObjectPtr,
    inline a1: A1
  ): Unit = {
    val b1 = stackalloc[Byte](Marshal.size[A1].toCSize);
    Marshal.write[A1](a1, b1)
    val args = stackalloc[GDExtensionConstTypePtr](1)
    args(0) = b1
    invoke(bind, instance, args, null)
    Marshal.release[A1](b1)
  }

  inline def call1[A1, R](
    bind: GDExtensionMethodBindPtr,
    instance: GDExtensionObjectPtr,
    inline a1: A1
  ): R = {
    val b1 = stackalloc[Byte](Marshal.size[A1].toCSize);
    Marshal.write[A1](a1, b1)
    val args = stackalloc[GDExtensionConstTypePtr](1)
    args(0) = b1
    val r = stackalloc[Byte](Marshal.size[R].toCSize)
    invoke(bind, instance, args, r)
    Marshal.release[A1](b1)
    Marshal.read[R](r)
  }

  inline def callVoid2[A1, A2](
    bind: GDExtensionMethodBindPtr,
    instance: GDExtensionObjectPtr,
    inline a1: A1,
    inline a2: A2
  ): Unit = {
    val b1 = stackalloc[Byte](Marshal.size[A1].toCSize);
    Marshal.write[A1](a1, b1)
    val b2 = stackalloc[Byte](Marshal.size[A2].toCSize);
    Marshal.write[A2](a2, b2)
    val args = stackalloc[GDExtensionConstTypePtr](2)
    args(0) = b1; args(1) = b2
    invoke(bind, instance, args, null)
    Marshal.release[A1](b1); Marshal.release[A2](b2)
  }

  inline def call2[A1, A2, R](
    bind: GDExtensionMethodBindPtr,
    instance: GDExtensionObjectPtr,
    inline a1: A1,
    inline a2: A2
  ): R = {
    val b1 = stackalloc[Byte](Marshal.size[A1].toCSize);
    Marshal.write[A1](a1, b1)
    val b2 = stackalloc[Byte](Marshal.size[A2].toCSize);
    Marshal.write[A2](a2, b2)
    val args = stackalloc[GDExtensionConstTypePtr](2)
    args(0) = b1; args(1) = b2
    val r = stackalloc[Byte](Marshal.size[R].toCSize)
    invoke(bind, instance, args, r)
    Marshal.release[A1](b1); Marshal.release[A2](b2)
    Marshal.read[R](r)
  }

  inline def callVoid3[A1, A2, A3](
    bind: GDExtensionMethodBindPtr,
    instance: GDExtensionObjectPtr,
    inline a1: A1,
    inline a2: A2,
    inline a3: A3
  ): Unit = {
    val b1 = stackalloc[Byte](Marshal.size[A1].toCSize);
    Marshal.write[A1](a1, b1)
    val b2 = stackalloc[Byte](Marshal.size[A2].toCSize);
    Marshal.write[A2](a2, b2)
    val b3 = stackalloc[Byte](Marshal.size[A3].toCSize);
    Marshal.write[A3](a3, b3)
    val args = stackalloc[GDExtensionConstTypePtr](3)
    args(0) = b1; args(1) = b2; args(2) = b3
    invoke(bind, instance, args, null)
    Marshal.release[A1](b1); Marshal.release[A2](b2); Marshal.release[A3](b3)
  }

  inline def call3[A1, A2, A3, R](
    bind: GDExtensionMethodBindPtr,
    instance: GDExtensionObjectPtr,
    inline a1: A1,
    inline a2: A2,
    inline a3: A3
  ): R = {
    val b1 = stackalloc[Byte](Marshal.size[A1].toCSize);
    Marshal.write[A1](a1, b1)
    val b2 = stackalloc[Byte](Marshal.size[A2].toCSize);
    Marshal.write[A2](a2, b2)
    val b3 = stackalloc[Byte](Marshal.size[A3].toCSize);
    Marshal.write[A3](a3, b3)
    val args = stackalloc[GDExtensionConstTypePtr](3)
    args(0) = b1; args(1) = b2; args(2) = b3
    val r = stackalloc[Byte](Marshal.size[R].toCSize)
    invoke(bind, instance, args, r)
    Marshal.release[A1](b1); Marshal.release[A2](b2); Marshal.release[A3](b3)
    Marshal.read[R](r)
  }

  inline def callVoid4[A1, A2, A3, A4](
    bind: GDExtensionMethodBindPtr,
    instance: GDExtensionObjectPtr,
    inline a1: A1,
    inline a2: A2,
    inline a3: A3,
    inline a4: A4
  ): Unit = {
    val b1 = stackalloc[Byte](Marshal.size[A1].toCSize);
    Marshal.write[A1](a1, b1)
    val b2 = stackalloc[Byte](Marshal.size[A2].toCSize);
    Marshal.write[A2](a2, b2)
    val b3 = stackalloc[Byte](Marshal.size[A3].toCSize);
    Marshal.write[A3](a3, b3)
    val b4 = stackalloc[Byte](Marshal.size[A4].toCSize);
    Marshal.write[A4](a4, b4)
    val args = stackalloc[GDExtensionConstTypePtr](4)
    args(0) = b1; args(1) = b2; args(2) = b3; args(3) = b4
    invoke(bind, instance, args, null)
    Marshal.release[A1](b1); Marshal.release[A2](b2); Marshal.release[A3](b3)
    Marshal.release[A4](b4)
  }

  inline def call4[A1, A2, A3, A4, R](
    bind: GDExtensionMethodBindPtr,
    instance: GDExtensionObjectPtr,
    inline a1: A1,
    inline a2: A2,
    inline a3: A3,
    inline a4: A4
  ): R = {
    val b1 = stackalloc[Byte](Marshal.size[A1].toCSize);
    Marshal.write[A1](a1, b1)
    val b2 = stackalloc[Byte](Marshal.size[A2].toCSize);
    Marshal.write[A2](a2, b2)
    val b3 = stackalloc[Byte](Marshal.size[A3].toCSize);
    Marshal.write[A3](a3, b3)
    val b4 = stackalloc[Byte](Marshal.size[A4].toCSize);
    Marshal.write[A4](a4, b4)
    val args = stackalloc[GDExtensionConstTypePtr](4)
    args(0) = b1; args(1) = b2; args(2) = b3; args(3) = b4
    val r = stackalloc[Byte](Marshal.size[R].toCSize)
    invoke(bind, instance, args, r)
    Marshal.release[A1](b1); Marshal.release[A2](b2); Marshal.release[A3](b3)
    Marshal.release[A4](b4)
    Marshal.read[R](r)
  }

  inline def callVoid5[A1, A2, A3, A4, A5](
    bind: GDExtensionMethodBindPtr,
    instance: GDExtensionObjectPtr,
    inline a1: A1,
    inline a2: A2,
    inline a3: A3,
    inline a4: A4,
    inline a5: A5
  ): Unit = {
    val b1 = stackalloc[Byte](Marshal.size[A1].toCSize);
    Marshal.write[A1](a1, b1)
    val b2 = stackalloc[Byte](Marshal.size[A2].toCSize);
    Marshal.write[A2](a2, b2)
    val b3 = stackalloc[Byte](Marshal.size[A3].toCSize);
    Marshal.write[A3](a3, b3)
    val b4 = stackalloc[Byte](Marshal.size[A4].toCSize);
    Marshal.write[A4](a4, b4)
    val b5 = stackalloc[Byte](Marshal.size[A5].toCSize);
    Marshal.write[A5](a5, b5)
    val args = stackalloc[GDExtensionConstTypePtr](5)
    args(0) = b1; args(1) = b2; args(2) = b3; args(3) = b4; args(4) = b5
    invoke(bind, instance, args, null)
    Marshal.release[A1](b1); Marshal.release[A2](b2); Marshal.release[A3](b3)
    Marshal.release[A4](b4); Marshal.release[A5](b5)
  }

  inline def call5[A1, A2, A3, A4, A5, R](
    bind: GDExtensionMethodBindPtr,
    instance: GDExtensionObjectPtr,
    inline a1: A1,
    inline a2: A2,
    inline a3: A3,
    inline a4: A4,
    inline a5: A5
  ): R = {
    val b1 = stackalloc[Byte](Marshal.size[A1].toCSize);
    Marshal.write[A1](a1, b1)
    val b2 = stackalloc[Byte](Marshal.size[A2].toCSize);
    Marshal.write[A2](a2, b2)
    val b3 = stackalloc[Byte](Marshal.size[A3].toCSize);
    Marshal.write[A3](a3, b3)
    val b4 = stackalloc[Byte](Marshal.size[A4].toCSize);
    Marshal.write[A4](a4, b4)
    val b5 = stackalloc[Byte](Marshal.size[A5].toCSize);
    Marshal.write[A5](a5, b5)
    val args = stackalloc[GDExtensionConstTypePtr](5)
    args(0) = b1; args(1) = b2; args(2) = b3; args(3) = b4; args(4) = b5
    val r = stackalloc[Byte](Marshal.size[R].toCSize)
    invoke(bind, instance, args, r)
    Marshal.release[A1](b1); Marshal.release[A2](b2); Marshal.release[A3](b3)
    Marshal.release[A4](b4); Marshal.release[A5](b5)
    Marshal.read[R](r)
  }

  inline def callVoid6[A1, A2, A3, A4, A5, A6](
    bind: GDExtensionMethodBindPtr,
    instance: GDExtensionObjectPtr,
    inline a1: A1,
    inline a2: A2,
    inline a3: A3,
    inline a4: A4,
    inline a5: A5,
    inline a6: A6
  ): Unit = {
    val b1 = stackalloc[Byte](Marshal.size[A1].toCSize);
    Marshal.write[A1](a1, b1)
    val b2 = stackalloc[Byte](Marshal.size[A2].toCSize);
    Marshal.write[A2](a2, b2)
    val b3 = stackalloc[Byte](Marshal.size[A3].toCSize);
    Marshal.write[A3](a3, b3)
    val b4 = stackalloc[Byte](Marshal.size[A4].toCSize);
    Marshal.write[A4](a4, b4)
    val b5 = stackalloc[Byte](Marshal.size[A5].toCSize);
    Marshal.write[A5](a5, b5)
    val b6 = stackalloc[Byte](Marshal.size[A6].toCSize);
    Marshal.write[A6](a6, b6)
    val args = stackalloc[GDExtensionConstTypePtr](6)
    args(0) = b1; args(1) = b2; args(2) = b3; args(3) = b4; args(4) = b5
    args(5) = b6
    invoke(bind, instance, args, null)
    Marshal.release[A1](b1); Marshal.release[A2](b2); Marshal.release[A3](b3)
    Marshal.release[A4](b4); Marshal.release[A5](b5); Marshal.release[A6](b6)
  }

  inline def call6[A1, A2, A3, A4, A5, A6, R](
    bind: GDExtensionMethodBindPtr,
    instance: GDExtensionObjectPtr,
    inline a1: A1,
    inline a2: A2,
    inline a3: A3,
    inline a4: A4,
    inline a5: A5,
    inline a6: A6
  ): R = {
    val b1 = stackalloc[Byte](Marshal.size[A1].toCSize);
    Marshal.write[A1](a1, b1)
    val b2 = stackalloc[Byte](Marshal.size[A2].toCSize);
    Marshal.write[A2](a2, b2)
    val b3 = stackalloc[Byte](Marshal.size[A3].toCSize);
    Marshal.write[A3](a3, b3)
    val b4 = stackalloc[Byte](Marshal.size[A4].toCSize);
    Marshal.write[A4](a4, b4)
    val b5 = stackalloc[Byte](Marshal.size[A5].toCSize);
    Marshal.write[A5](a5, b5)
    val b6 = stackalloc[Byte](Marshal.size[A6].toCSize);
    Marshal.write[A6](a6, b6)
    val args = stackalloc[GDExtensionConstTypePtr](6)
    args(0) = b1; args(1) = b2; args(2) = b3; args(3) = b4; args(4) = b5
    args(5) = b6
    val r = stackalloc[Byte](Marshal.size[R].toCSize)
    invoke(bind, instance, args, r)
    Marshal.release[A1](b1); Marshal.release[A2](b2); Marshal.release[A3](b3)
    Marshal.release[A4](b4); Marshal.release[A5](b5); Marshal.release[A6](b6)
    Marshal.read[R](r)
  }
}
