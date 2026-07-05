package gdext.builtin

import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import gdext.internal.ffi.types.*
import gdext.internal.ffi.types.GDExtensionVariantType.*

/**
 * Godot's `Vector2` — two 32-bit float components, 8 bytes total
 * ([[BuiltinSizes.Vector2]]).
 *
 * Note the components are single-precision (`CFloat`) even in the `float_64`
 * build configuration: the `_64` there refers to integer/pointer width, while
 * vector components stay `real_t` = `float`. This is why the size is 8, not 16.
 *
 * A Scala value type; it marshals to/from a Variant via the cached per-type
 * constructors. This is the representative pattern for every fixed-layout math
 * builtin (Vector3/4, Rect2, Color, Transform*, Basis, ...); the remaining
 * types are mechanical and intended to be generated from `extension_api.json`
 * in a later codegen pass.
 */
final case class Vector2(x: Float, y: Float) {
  def +(o: Vector2): Vector2 = Vector2(x + o.x, y + o.y)
  def -(o: Vector2): Vector2 = Vector2(x - o.x, y - o.y)
  def *(s: Float): Vector2 = Vector2(x * s, y * s)
  def lengthSquared: Float = x * x + y * y
  def length: Float = math.sqrt(lengthSquared.toDouble).toFloat

  def moveToward(to: Vector2, delta: Float): Vector2 = {
    val diff = to - this
    val len = diff.length
    if (len <= delta || len < 1e-6f) to
    else this + diff * (delta / len)
  }
}

object Vector2 {
  val zero: Vector2 = Vector2(0.0f, 0.0f)

  /** Write the raw 8-byte layout into a type buffer. */
  private[gdext] def writeType(v: Vector2, p: GDExtensionTypePtr): Unit = {
    val f = p.asInstanceOf[Ptr[CFloat]]
    f(0) = v.x
    f(1) = v.y
  }

  /** Read a Vector2 from a raw 8-byte type buffer. */
  private[gdext] def readType(p: GDExtensionTypePtr): Vector2 = {
    val f = p.asInstanceOf[Ptr[CFloat]]
    Vector2(f(0), f(1))
  }

  given ToVariant[Vector2] = (value, dest) => {
    val buf = stackalloc[Byte](BuiltinSizes.Vector2.toCSize)
    writeType(value, buf)
    VariantConstructors.fromType(GDEXTENSION_VARIANT_TYPE_VECTOR2)(dest, buf)
  }

  given FromVariant[Vector2] = (variant) => {
    val buf = stackalloc[Byte](BuiltinSizes.Vector2.toCSize)
    VariantConstructors.toType(GDEXTENSION_VARIANT_TYPE_VECTOR2)(buf, variant)
    readType(buf)
  }
}
