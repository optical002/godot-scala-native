package gdext.engine

import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import gdext.Godot
import gdext.builtin.*
import gdext.codegen.gdextensioninterface.types.*

/**
 * Marshalling for engine method `ptrcall`s.
 *
 * Unlike the Variant path (Phase 1), `ptrcall` passes each argument as a
 * pointer to its *native* representation (an int64, a double, an 8-byte
 * Vector2, an object pointer, ...) and writes the return value's native
 * representation into a caller-provided buffer. This is the fast path Godot
 * uses for statically-typed calls, and the default the generated engine-class
 * wrappers use. Vararg / Variant-typed methods fall back to the call path
 * (added alongside this when first needed).
 *
 * [[PtrArg]] knows how to lay a Scala value down as a ptrcall argument;
 * [[PtrRet]] knows how to read a return value back and how big its buffer is.
 */
trait PtrArg[A] {
  /** Bytes needed for this argument's native representation. */
  def size: Int
  /** Write `value` into `buf` (exactly [[size]] bytes). */
  def write(value: A, buf: Ptr[Byte]): Unit
}

trait PtrRet[A] {
  def size: Int
  def read(buf: Ptr[Byte]): A
}

object PtrArg {
  def apply[A](using p: PtrArg[A]): PtrArg[A] = p

  given PtrArg[Long] with {
    def size = 8
    def write(v: Long, b: Ptr[Byte]) = !b.asInstanceOf[Ptr[GDExtensionInt]] = v
  }
  given PtrArg[Int] with {
    def size = 8 // engine ints are int64 on the ptrcall boundary
    def write(v: Int, b: Ptr[Byte]) = !b.asInstanceOf[Ptr[GDExtensionInt]] = v.toLong
  }
  given PtrArg[Boolean] with {
    def size = 1
    def write(v: Boolean, b: Ptr[Byte]) =
      !b.asInstanceOf[Ptr[GDExtensionBool]] = (if (v) 1 else 0).toUByte
  }
  given PtrArg[Double] with {
    def size = 8
    def write(v: Double, b: Ptr[Byte]) = !b.asInstanceOf[Ptr[CDouble]] = v
  }
  given PtrArg[Vector2] with {
    def size = BuiltinSizes.Vector2
    def write(v: Vector2, b: Ptr[Byte]) = Vector2.writeType(v, b)
  }
  given PtrArg[Color] with {
    def size = BuiltinSizes.Color
    def write(v: Color, b: Ptr[Byte]) = Color.writeType(v, b)
  }
  /**
   * String arguments: the buffer holds an 8-byte Godot String handle built
   * from the Scala value. NOTE: this currently leaks the constructed String's
   * reference once per call (there is no post-call hook in the fixed-arity
   * dispatchers to destroy it). A follow-up should give Ptrcall a cleanup pass;
   * tracked as a known Phase 2 limitation.
   */
  given PtrArg[String] with {
    def size = BuiltinSizes.String
    def write(v: String, b: Ptr[Byte]) = { GString.from(v, b); () }
  }
  /** Object arguments are passed as a pointer to the object pointer. */
  given PtrArg[GodotObject] with {
    def size = sizeof[Ptr[Byte]].toInt
    def write(v: GodotObject, b: Ptr[Byte]) =
      !b.asInstanceOf[Ptr[GDExtensionObjectPtr]] = v.objectPtr
  }

  /**
   * StringName arguments: the buffer holds the 8-byte interned handle. Callers
   * typically pass a cached handle (`StringNames.cached(...)`); the handle is
   * borrowed for the duration of the call (no copy, no destroy).
   */
  given PtrArg[StringName] with {
    def size = BuiltinSizes.StringName
    def write(v: StringName, b: Ptr[Byte]) =
      !b.asInstanceOf[Ptr[GDExtensionStringNamePtr]] = v.ptr
  }

  /**
   * Callable arguments: the buffer holds the 16-byte Callable value, copied from
   * the caller-built storage (a Callable is an inline builtin, not a handle).
   */
  given PtrArg[Callable] with {
    def size = BuiltinSizes.Callable
    def write(v: Callable, b: Ptr[Byte]) = {
      val src = v.ptr
      var i = 0
      while (i < BuiltinSizes.Callable) { b(i) = src(i); i += 1 }
    }
  }

  // Fixed-layout math builtins (see MathBuiltins.scala / Vector2 / Color).
  given PtrArg[Vector2i] with {
    def size = BuiltinSizes.Vector2i
    def write(v: Vector2i, b: Ptr[Byte]) = Vector2i.writeType(v, b)
  }
  given PtrArg[Vector3] with {
    def size = BuiltinSizes.Vector3
    def write(v: Vector3, b: Ptr[Byte]) = Vector3.writeType(v, b)
  }
  given PtrArg[Vector3i] with {
    def size = BuiltinSizes.Vector3i
    def write(v: Vector3i, b: Ptr[Byte]) = Vector3i.writeType(v, b)
  }
  given PtrArg[Vector4] with {
    def size = BuiltinSizes.Vector4
    def write(v: Vector4, b: Ptr[Byte]) = Vector4.writeType(v, b)
  }
  given PtrArg[Vector4i] with {
    def size = BuiltinSizes.Vector4i
    def write(v: Vector4i, b: Ptr[Byte]) = Vector4i.writeType(v, b)
  }
  given PtrArg[Rect2] with {
    def size = BuiltinSizes.Rect2
    def write(v: Rect2, b: Ptr[Byte]) = Rect2.writeType(v, b)
  }
  given PtrArg[Rect2i] with {
    def size = BuiltinSizes.Rect2i
    def write(v: Rect2i, b: Ptr[Byte]) = Rect2i.writeType(v, b)
  }
  given PtrArg[Quaternion] with {
    def size = BuiltinSizes.Quaternion
    def write(v: Quaternion, b: Ptr[Byte]) = Quaternion.writeType(v, b)
  }
  given PtrArg[Plane] with {
    def size = BuiltinSizes.Plane
    def write(v: Plane, b: Ptr[Byte]) = Plane.writeType(v, b)
  }
  given PtrArg[AABB] with {
    def size = BuiltinSizes.AABB
    def write(v: AABB, b: Ptr[Byte]) = AABB.writeType(v, b)
  }
  given PtrArg[Basis] with {
    def size = BuiltinSizes.Basis
    def write(v: Basis, b: Ptr[Byte]) = Basis.writeType(v, b)
  }
  given PtrArg[Transform2D] with {
    def size = BuiltinSizes.Transform2D
    def write(v: Transform2D, b: Ptr[Byte]) = Transform2D.writeType(v, b)
  }
  given PtrArg[Transform3D] with {
    def size = BuiltinSizes.Transform3D
    def write(v: Transform3D, b: Ptr[Byte]) = Transform3D.writeType(v, b)
  }
  given PtrArg[Projection] with {
    def size = BuiltinSizes.Projection
    def write(v: Projection, b: Ptr[Byte]) = Projection.writeType(v, b)
  }
}

object PtrRet {
  def apply[A](using p: PtrRet[A]): PtrRet[A] = p

  given PtrRet[Long] with {
    def size = 8
    def read(b: Ptr[Byte]) = !b.asInstanceOf[Ptr[GDExtensionInt]]
  }
  given PtrRet[Int] with {
    def size = 8
    def read(b: Ptr[Byte]) = (!b.asInstanceOf[Ptr[GDExtensionInt]]).toInt
  }
  given PtrRet[Boolean] with {
    def size = 1
    def read(b: Ptr[Byte]) = (!b.asInstanceOf[Ptr[GDExtensionBool]]).toInt != 0
  }
  given PtrRet[Double] with {
    def size = 8
    def read(b: Ptr[Byte]) = !b.asInstanceOf[Ptr[CDouble]]
  }
  given PtrRet[Vector2] with {
    def size = BuiltinSizes.Vector2
    def read(b: Ptr[Byte]) = Vector2.readType(b)
  }
  given PtrRet[Color] with {
    def size = BuiltinSizes.Color
    def read(b: Ptr[Byte]) = Color.readType(b)
  }
  /** Object returns: the buffer holds an object pointer. */
  given PtrRet[GodotObject] with {
    def size = sizeof[Ptr[Byte]].toInt
    def read(b: Ptr[Byte]) =
      GodotObject.fromPtr(!b.asInstanceOf[Ptr[GDExtensionObjectPtr]])
  }
  /**
   * String returns: the buffer holds an 8-byte Godot String handle. We decode
   * it to a Scala String and release the engine String's reference.
   */
  given PtrRet[String] with {
    def size = BuiltinSizes.String
    def read(b: Ptr[Byte]) = {
      val s = GString.fromPtr(b)
      val out = s.toScala
      s.destroy()
      out
    }
  }

  /**
   * StringName returns: the buffer holds the 8-byte handle. NOTE: this borrows
   * the returned handle without taking a destroy pass; rare among engine
   * methods, tracked with the same Phase-2 cleanup caveat as `PtrArg[String]`.
   */
  given PtrRet[StringName] with {
    def size = BuiltinSizes.StringName
    def read(b: Ptr[Byte]) =
      StringName.fromPtr(!b.asInstanceOf[Ptr[GDExtensionStringNamePtr]])
  }

  // Fixed-layout math builtins (see MathBuiltins.scala / Vector2 / Color).
  given PtrRet[Vector2i] with {
    def size = BuiltinSizes.Vector2i
    def read(b: Ptr[Byte]) = Vector2i.readType(b)
  }
  given PtrRet[Vector3] with {
    def size = BuiltinSizes.Vector3
    def read(b: Ptr[Byte]) = Vector3.readType(b)
  }
  given PtrRet[Vector3i] with {
    def size = BuiltinSizes.Vector3i
    def read(b: Ptr[Byte]) = Vector3i.readType(b)
  }
  given PtrRet[Vector4] with {
    def size = BuiltinSizes.Vector4
    def read(b: Ptr[Byte]) = Vector4.readType(b)
  }
  given PtrRet[Vector4i] with {
    def size = BuiltinSizes.Vector4i
    def read(b: Ptr[Byte]) = Vector4i.readType(b)
  }
  given PtrRet[Rect2] with {
    def size = BuiltinSizes.Rect2
    def read(b: Ptr[Byte]) = Rect2.readType(b)
  }
  given PtrRet[Rect2i] with {
    def size = BuiltinSizes.Rect2i
    def read(b: Ptr[Byte]) = Rect2i.readType(b)
  }
  given PtrRet[Quaternion] with {
    def size = BuiltinSizes.Quaternion
    def read(b: Ptr[Byte]) = Quaternion.readType(b)
  }
  given PtrRet[Plane] with {
    def size = BuiltinSizes.Plane
    def read(b: Ptr[Byte]) = Plane.readType(b)
  }
  given PtrRet[AABB] with {
    def size = BuiltinSizes.AABB
    def read(b: Ptr[Byte]) = AABB.readType(b)
  }
  given PtrRet[Basis] with {
    def size = BuiltinSizes.Basis
    def read(b: Ptr[Byte]) = Basis.readType(b)
  }
  given PtrRet[Transform2D] with {
    def size = BuiltinSizes.Transform2D
    def read(b: Ptr[Byte]) = Transform2D.readType(b)
  }
  given PtrRet[Transform3D] with {
    def size = BuiltinSizes.Transform3D
    def read(b: Ptr[Byte]) = Transform3D.readType(b)
  }
  given PtrRet[Projection] with {
    def size = BuiltinSizes.Projection
    def read(b: Ptr[Byte]) = Projection.readType(b)
  }
}

/** Fixed-arity ptrcall dispatchers used by the generated engine wrappers. */
object Ptrcall {

  /** A method with no return value (`r_ret = null`). */
  def callVoid0(
    bind: GDExtensionMethodBindPtr,
    instance: GDExtensionObjectPtr
  ): Unit =
    Godot.interface.object_method_bind_ptrcall(bind, instance, null, null)

  def call0[R](
    bind: GDExtensionMethodBindPtr,
    instance: GDExtensionObjectPtr
  )(using ret: PtrRet[R]): R = {
    val retBuf = stackalloc[Byte](ret.size.toCSize)
    Godot.interface.object_method_bind_ptrcall(
      bind,
      instance,
      null,
      retBuf
    )
    ret.read(retBuf)
  }

  def callVoid1[A1](
    bind: GDExtensionMethodBindPtr,
    instance: GDExtensionObjectPtr,
    a1: A1
  )(using p1: PtrArg[A1]): Unit = {
    val b1 = stackalloc[Byte](p1.size.toCSize)
    p1.write(a1, b1)
    val args = stackalloc[GDExtensionConstTypePtr](1)
    args(0) = b1
    Godot.interface.object_method_bind_ptrcall(bind, instance, args, null)
  }

  def call1[A1, R](
    bind: GDExtensionMethodBindPtr,
    instance: GDExtensionObjectPtr,
    a1: A1
  )(using p1: PtrArg[A1], ret: PtrRet[R]): R = {
    val b1 = stackalloc[Byte](p1.size.toCSize)
    p1.write(a1, b1)
    val args = stackalloc[GDExtensionConstTypePtr](1)
    args(0) = b1
    val retBuf = stackalloc[Byte](ret.size.toCSize)
    Godot.interface.object_method_bind_ptrcall(bind, instance, args, retBuf)
    ret.read(retBuf)
  }

  def callVoid2[A1, A2](
    bind: GDExtensionMethodBindPtr,
    instance: GDExtensionObjectPtr,
    a1: A1,
    a2: A2
  )(using p1: PtrArg[A1], p2: PtrArg[A2]): Unit = {
    val b1 = stackalloc[Byte](p1.size.toCSize); p1.write(a1, b1)
    val b2 = stackalloc[Byte](p2.size.toCSize); p2.write(a2, b2)
    val args = stackalloc[GDExtensionConstTypePtr](2)
    args(0) = b1; args(1) = b2
    Godot.interface.object_method_bind_ptrcall(bind, instance, args, null)
  }

  def call2[A1, A2, R](
    bind: GDExtensionMethodBindPtr,
    instance: GDExtensionObjectPtr,
    a1: A1,
    a2: A2
  )(using p1: PtrArg[A1], p2: PtrArg[A2], ret: PtrRet[R]): R = {
    val b1 = stackalloc[Byte](p1.size.toCSize); p1.write(a1, b1)
    val b2 = stackalloc[Byte](p2.size.toCSize); p2.write(a2, b2)
    val args = stackalloc[GDExtensionConstTypePtr](2)
    args(0) = b1; args(1) = b2
    val retBuf = stackalloc[Byte](ret.size.toCSize)
    Godot.interface.object_method_bind_ptrcall(bind, instance, args, retBuf)
    ret.read(retBuf)
  }

  def callVoid3[A1, A2, A3](
    bind: GDExtensionMethodBindPtr,
    instance: GDExtensionObjectPtr,
    a1: A1,
    a2: A2,
    a3: A3
  )(using p1: PtrArg[A1], p2: PtrArg[A2], p3: PtrArg[A3]): Unit = {
    val b1 = stackalloc[Byte](p1.size.toCSize); p1.write(a1, b1)
    val b2 = stackalloc[Byte](p2.size.toCSize); p2.write(a2, b2)
    val b3 = stackalloc[Byte](p3.size.toCSize); p3.write(a3, b3)
    val args = stackalloc[GDExtensionConstTypePtr](3)
    args(0) = b1; args(1) = b2; args(2) = b3
    Godot.interface.object_method_bind_ptrcall(bind, instance, args, null)
  }

  def call3[A1, A2, A3, R](
    bind: GDExtensionMethodBindPtr,
    instance: GDExtensionObjectPtr,
    a1: A1,
    a2: A2,
    a3: A3
  )(using p1: PtrArg[A1], p2: PtrArg[A2], p3: PtrArg[A3], ret: PtrRet[R]): R = {
    val b1 = stackalloc[Byte](p1.size.toCSize); p1.write(a1, b1)
    val b2 = stackalloc[Byte](p2.size.toCSize); p2.write(a2, b2)
    val b3 = stackalloc[Byte](p3.size.toCSize); p3.write(a3, b3)
    val args = stackalloc[GDExtensionConstTypePtr](3)
    args(0) = b1; args(1) = b2; args(2) = b3
    val retBuf = stackalloc[Byte](ret.size.toCSize)
    Godot.interface.object_method_bind_ptrcall(bind, instance, args, retBuf)
    ret.read(retBuf)
  }

  def callVoid4[A1, A2, A3, A4](
    bind: GDExtensionMethodBindPtr,
    instance: GDExtensionObjectPtr,
    a1: A1,
    a2: A2,
    a3: A3,
    a4: A4
  )(using p1: PtrArg[A1], p2: PtrArg[A2], p3: PtrArg[A3], p4: PtrArg[A4]): Unit = {
    val b1 = stackalloc[Byte](p1.size.toCSize); p1.write(a1, b1)
    val b2 = stackalloc[Byte](p2.size.toCSize); p2.write(a2, b2)
    val b3 = stackalloc[Byte](p3.size.toCSize); p3.write(a3, b3)
    val b4 = stackalloc[Byte](p4.size.toCSize); p4.write(a4, b4)
    val args = stackalloc[GDExtensionConstTypePtr](4)
    args(0) = b1; args(1) = b2; args(2) = b3; args(3) = b4
    Godot.interface.object_method_bind_ptrcall(bind, instance, args, null)
  }

  def call4[A1, A2, A3, A4, R](
    bind: GDExtensionMethodBindPtr,
    instance: GDExtensionObjectPtr,
    a1: A1,
    a2: A2,
    a3: A3,
    a4: A4
  )(using
    p1: PtrArg[A1],
    p2: PtrArg[A2],
    p3: PtrArg[A3],
    p4: PtrArg[A4],
    ret: PtrRet[R]
  ): R = {
    val b1 = stackalloc[Byte](p1.size.toCSize); p1.write(a1, b1)
    val b2 = stackalloc[Byte](p2.size.toCSize); p2.write(a2, b2)
    val b3 = stackalloc[Byte](p3.size.toCSize); p3.write(a3, b3)
    val b4 = stackalloc[Byte](p4.size.toCSize); p4.write(a4, b4)
    val args = stackalloc[GDExtensionConstTypePtr](4)
    args(0) = b1; args(1) = b2; args(2) = b3; args(3) = b4
    val retBuf = stackalloc[Byte](ret.size.toCSize)
    Godot.interface.object_method_bind_ptrcall(bind, instance, args, retBuf)
    ret.read(retBuf)
  }

  def callVoid5[A1, A2, A3, A4, A5](
    bind: GDExtensionMethodBindPtr,
    instance: GDExtensionObjectPtr,
    a1: A1,
    a2: A2,
    a3: A3,
    a4: A4,
    a5: A5
  )(using
    p1: PtrArg[A1],
    p2: PtrArg[A2],
    p3: PtrArg[A3],
    p4: PtrArg[A4],
    p5: PtrArg[A5]
  ): Unit = {
    val b1 = stackalloc[Byte](p1.size.toCSize); p1.write(a1, b1)
    val b2 = stackalloc[Byte](p2.size.toCSize); p2.write(a2, b2)
    val b3 = stackalloc[Byte](p3.size.toCSize); p3.write(a3, b3)
    val b4 = stackalloc[Byte](p4.size.toCSize); p4.write(a4, b4)
    val b5 = stackalloc[Byte](p5.size.toCSize); p5.write(a5, b5)
    val args = stackalloc[GDExtensionConstTypePtr](5)
    args(0) = b1; args(1) = b2; args(2) = b3; args(3) = b4; args(4) = b5
    Godot.interface.object_method_bind_ptrcall(bind, instance, args, null)
  }

  def call5[A1, A2, A3, A4, A5, R](
    bind: GDExtensionMethodBindPtr,
    instance: GDExtensionObjectPtr,
    a1: A1,
    a2: A2,
    a3: A3,
    a4: A4,
    a5: A5
  )(using
    p1: PtrArg[A1],
    p2: PtrArg[A2],
    p3: PtrArg[A3],
    p4: PtrArg[A4],
    p5: PtrArg[A5],
    ret: PtrRet[R]
  ): R = {
    val b1 = stackalloc[Byte](p1.size.toCSize); p1.write(a1, b1)
    val b2 = stackalloc[Byte](p2.size.toCSize); p2.write(a2, b2)
    val b3 = stackalloc[Byte](p3.size.toCSize); p3.write(a3, b3)
    val b4 = stackalloc[Byte](p4.size.toCSize); p4.write(a4, b4)
    val b5 = stackalloc[Byte](p5.size.toCSize); p5.write(a5, b5)
    val args = stackalloc[GDExtensionConstTypePtr](5)
    args(0) = b1; args(1) = b2; args(2) = b3; args(3) = b4; args(4) = b5
    val retBuf = stackalloc[Byte](ret.size.toCSize)
    Godot.interface.object_method_bind_ptrcall(bind, instance, args, retBuf)
    ret.read(retBuf)
  }

  def callVoid6[A1, A2, A3, A4, A5, A6](
    bind: GDExtensionMethodBindPtr,
    instance: GDExtensionObjectPtr,
    a1: A1,
    a2: A2,
    a3: A3,
    a4: A4,
    a5: A5,
    a6: A6
  )(using
    p1: PtrArg[A1],
    p2: PtrArg[A2],
    p3: PtrArg[A3],
    p4: PtrArg[A4],
    p5: PtrArg[A5],
    p6: PtrArg[A6]
  ): Unit = {
    val b1 = stackalloc[Byte](p1.size.toCSize); p1.write(a1, b1)
    val b2 = stackalloc[Byte](p2.size.toCSize); p2.write(a2, b2)
    val b3 = stackalloc[Byte](p3.size.toCSize); p3.write(a3, b3)
    val b4 = stackalloc[Byte](p4.size.toCSize); p4.write(a4, b4)
    val b5 = stackalloc[Byte](p5.size.toCSize); p5.write(a5, b5)
    val b6 = stackalloc[Byte](p6.size.toCSize); p6.write(a6, b6)
    val args = stackalloc[GDExtensionConstTypePtr](6)
    args(0) = b1; args(1) = b2; args(2) = b3; args(3) = b4; args(4) = b5
    args(5) = b6
    Godot.interface.object_method_bind_ptrcall(bind, instance, args, null)
  }

  def call6[A1, A2, A3, A4, A5, A6, R](
    bind: GDExtensionMethodBindPtr,
    instance: GDExtensionObjectPtr,
    a1: A1,
    a2: A2,
    a3: A3,
    a4: A4,
    a5: A5,
    a6: A6
  )(using
    p1: PtrArg[A1],
    p2: PtrArg[A2],
    p3: PtrArg[A3],
    p4: PtrArg[A4],
    p5: PtrArg[A5],
    p6: PtrArg[A6],
    ret: PtrRet[R]
  ): R = {
    val b1 = stackalloc[Byte](p1.size.toCSize); p1.write(a1, b1)
    val b2 = stackalloc[Byte](p2.size.toCSize); p2.write(a2, b2)
    val b3 = stackalloc[Byte](p3.size.toCSize); p3.write(a3, b3)
    val b4 = stackalloc[Byte](p4.size.toCSize); p4.write(a4, b4)
    val b5 = stackalloc[Byte](p5.size.toCSize); p5.write(a5, b5)
    val b6 = stackalloc[Byte](p6.size.toCSize); p6.write(a6, b6)
    val args = stackalloc[GDExtensionConstTypePtr](6)
    args(0) = b1; args(1) = b2; args(2) = b3; args(3) = b4; args(4) = b5
    args(5) = b6
    val retBuf = stackalloc[Byte](ret.size.toCSize)
    Godot.interface.object_method_bind_ptrcall(bind, instance, args, retBuf)
    ret.read(retBuf)
  }
}
