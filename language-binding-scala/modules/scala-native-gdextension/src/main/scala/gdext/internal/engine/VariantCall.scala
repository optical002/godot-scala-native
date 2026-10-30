package gdext.internal.engine

import gdext.internal.StringNames
import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import scala.scalanative.libc.stdlib
import gdext.Godot
import gdext.builtin.*
import gdext.internal.ffi.types.*
import gdext.internal.ffi.types.GDExtensionVariantType.*

/** A heap-held Variant, for dynamic engine calls outside the typed API (test
  * harnesses comparing the Scala math library with the engine's). Release with
  * `close()`.
  */
final class Dyn private[engine] (private[engine] val ptr: Ptr[Byte])
    extends AutoCloseable {
  private var closed = false

  def variantType: Int = Godot.interface.variant_get_type(ptr).toInt
  def isNil: Boolean = variantType == GDEXTENSION_VARIANT_TYPE_NIL.toInt
  def as[A](using fv: FromVariant[A]): A = fv.fromVariant(ptr)

  def close(): Unit =
    if (!closed) {
      closed = true
      Godot.interface.variant_destroy(ptr)
      stdlib.free(ptr)
    }
}

object Dyn {
  private[engine] def alloc(): Dyn = {
    val p = stdlib.malloc(BuiltinSizes.Variant.toCSize).asInstanceOf[Ptr[Byte]]
    Godot.interface.variant_new_nil(p)
    new Dyn(p)
  }

  /** A NIL Variant (the right operand of a unary operator). */
  def nil(): Dyn = alloc()

  def of[A](value: A)(using tv: ToVariant[A]): Dyn = {
    val d = alloc()
    Godot.interface.variant_destroy(d.ptr)
    tv.toVariant(value, d.ptr)
    d
  }
}

/** Dynamic (Variant) engine calls: methods, statics, operators, members. */
object VariantCall {

  /** Godot `Variant::Operator` numbers for [[evaluate]]. */
  object Op {
    final val Equal = 0
    final val NotEqual = 1
    final val Less = 2
    final val LessEqual = 3
    final val Greater = 4
    final val GreaterEqual = 5
    final val Add = 6
    final val Subtract = 7
    final val Multiply = 8
    final val Divide = 9
    final val Negate = 10
    final val Positive = 11
    final val Module = 12
  }

  private def argv(args: Seq[Dyn]): Ptr[GDExtensionConstVariantPtr] = {
    val a = stdlib
      .malloc((8L * math.max(args.size, 1)).toCSize)
      .asInstanceOf[Ptr[GDExtensionConstVariantPtr]]
    var i = 0
    while (i < args.size) { a(i) = args(i).ptr; i += 1 }
    a
  }

  private def check(err: Ptr[GDExtensionCallError], what: String): Unit = {
    val code = (!err).error.toInt
    if (code != 0)
      throw new IllegalStateException(s"$what failed (call error $code)")
  }

  /** `self.method(args...)`. */
  def call(self: Dyn, method: String, args: Dyn*): Dyn = {
    val ret = Dyn.alloc()
    Godot.interface.variant_destroy(ret.ptr)
    val a = argv(args)
    val err = stackalloc[GDExtensionCallError]()
    Godot.interface.variant_call(
      self.ptr,
      StringNames.cached(method).ptr,
      a,
      args.size.toLong,
      ret.ptr,
      err
    )
    stdlib.free(a.asInstanceOf[Ptr[Byte]])
    check(err, method)
    ret
  }

  /** `Type.method(args...)`, where `Type` is the Variant type of `sample`. */
  def callStatic(sample: Dyn, method: String, args: Dyn*): Dyn = {
    val ret = Dyn.alloc()
    Godot.interface.variant_destroy(ret.ptr)
    val a = argv(args)
    val err = stackalloc[GDExtensionCallError]()
    Godot.interface.variant_call_static(
      Godot.interface.variant_get_type(sample.ptr),
      StringNames.cached(method).ptr,
      a,
      args.size.toLong,
      ret.ptr,
      err
    )
    stdlib.free(a.asInstanceOf[Ptr[Byte]])
    check(err, method)
    ret
  }

  /** `a <op> b` (pass `a` as `b` for unary operators). */
  def evaluate(op: Int, a: Dyn, b: Dyn): Dyn = {
    val ret = Dyn.alloc()
    Godot.interface.variant_destroy(ret.ptr)
    val valid = stackalloc[GDExtensionBool]()
    Godot.interface.variant_evaluate(op.toUInt, a.ptr, b.ptr, ret.ptr, valid)
    if ((!valid).toInt == 0)
      throw new IllegalStateException(s"operator $op is not valid here")
    ret
  }

  /** `self.member`. */
  def getNamed(self: Dyn, member: String): Dyn = {
    val ret = Dyn.alloc()
    Godot.interface.variant_destroy(ret.ptr)
    val valid = stackalloc[GDExtensionBool]()
    Godot.interface.variant_get_named(
      self.ptr,
      StringNames.cached(member).ptr,
      ret.ptr,
      valid
    )
    if ((!valid).toInt == 0)
      throw new IllegalStateException(s"no member '$member'")
    ret
  }
}
