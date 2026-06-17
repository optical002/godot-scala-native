package io.github.optical002.godot.engine

import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.codegen.gdextensioninterface.types.*

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
}
