package gdext.builtin

import scala.scalanative.annotation.alwaysinline
import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import gdext.internal.ffi.types.*
import gdext.internal.ffi.types.GDExtensionVariantType.*

/** Godot's `Vector2i`: two 32-bit integer components (8 bytes). */
final case class Vector2i(x: Int, y: Int) {
  @alwaysinline def +(o: Vector2i): Vector2i = Vector2i(x + o.x, y + o.y)
  @alwaysinline def -(o: Vector2i): Vector2i = Vector2i(x - o.x, y - o.y)
  @alwaysinline def *(o: Vector2i): Vector2i = Vector2i(x * o.x, y * o.y)
  @alwaysinline def /(o: Vector2i): Vector2i = Vector2i(x / o.x, y / o.y)
  @alwaysinline def %(o: Vector2i): Vector2i = Vector2i(x % o.x, y % o.y)
  @alwaysinline def *(s: Int): Vector2i = Vector2i(x * s, y * s)
  @alwaysinline def /(s: Int): Vector2i = Vector2i(x / s, y / s)
  @alwaysinline def %(s: Int): Vector2i = Vector2i(x % s, y % s)
  @alwaysinline def *(s: Float): Vector2 = Vector2(x * s, y * s)
  @alwaysinline def /(s: Float): Vector2 = Vector2(x / s, y / s)
  @alwaysinline def unary_- : Vector2i = Vector2i(-x, -y)
  @alwaysinline def unary_+ : Vector2i = this

  def <(o: Vector2i): Boolean = if (x == o.x) y < o.y else x < o.x
  def <=(o: Vector2i): Boolean = if (x == o.x) y <= o.y else x < o.x
  def >(o: Vector2i): Boolean = if (x == o.x) y > o.y else x > o.x
  def >=(o: Vector2i): Boolean = if (x == o.x) y >= o.y else x > o.x

  def apply(axis: Int): Int = if (axis == 0) x else y

  def aspect: Float = x.toFloat / y.toFloat
  def maxAxisIndex: Long = if (x < y) 1L else 0L
  def minAxisIndex: Long = if (x < y) 0L else 1L

  def lengthSquared: Long = x.toLong * x + y.toLong * y
  def length: Float = math.sqrt(lengthSquared.toDouble).toFloat
  def distanceSquaredTo(to: Vector2i): Long = (to - this).lengthSquared
  def distanceTo(to: Vector2i): Float = (to - this).length

  def sign: Vector2i = Vector2i(GodotMath.sign(x), GodotMath.sign(y))
  def abs: Vector2i = Vector2i(math.abs(x), math.abs(y))
  def clamp(min: Vector2i, max: Vector2i): Vector2i =
    Vector2i(GodotMath.clamp(x, min.x, max.x), GodotMath.clamp(y, min.y, max.y))
  def clampi(min: Long, max: Long): Vector2i =
    Vector2i(
      GodotMath.clamp(x, min.toInt, max.toInt),
      GodotMath.clamp(y, min.toInt, max.toInt)
    )
  def snapped(step: Vector2i): Vector2i =
    Vector2i(GodotMath.snapped(x, step.x), GodotMath.snapped(y, step.y))
  def snappedi(step: Long): Vector2i =
    Vector2i(GodotMath.snapped(x, step.toInt), GodotMath.snapped(y, step.toInt))
  def min(o: Vector2i): Vector2i = Vector2i(math.min(x, o.x), math.min(y, o.y))
  def mini(o: Long): Vector2i =
    Vector2i(math.min(x, o.toInt), math.min(y, o.toInt))
  def max(o: Vector2i): Vector2i = Vector2i(math.max(x, o.x), math.max(y, o.y))
  def maxi(o: Long): Vector2i =
    Vector2i(math.max(x, o.toInt), math.max(y, o.toInt))
}

object Vector2i {
  val ZERO: Vector2i = Vector2i(0, 0)
  val ONE: Vector2i = Vector2i(1, 1)
  val MIN: Vector2i = Vector2i(Int.MinValue, Int.MinValue)
  val MAX: Vector2i = Vector2i(Int.MaxValue, Int.MaxValue)
  val LEFT: Vector2i = Vector2i(-1, 0)
  val RIGHT: Vector2i = Vector2i(1, 0)
  val UP: Vector2i = Vector2i(0, -1)
  val DOWN: Vector2i = Vector2i(0, 1)

  def apply(): Vector2i = ZERO

  /** Truncates toward zero, like Godot's `Vector2i(Vector2)`. */
  def apply(v: Vector2): Vector2i = Vector2i(v.x.toInt, v.y.toInt)

  private[gdext] inline def writeType(
    v: Vector2i,
    p: GDExtensionTypePtr
  ): Unit = {
    val f = p.asInstanceOf[Ptr[CInt]]
    f(0) = v.x; f(1) = v.y
  }

  private[gdext] inline def readType(p: GDExtensionTypePtr): Vector2i = {
    val f = p.asInstanceOf[Ptr[CInt]]
    Vector2i(f(0), f(1))
  }

  given ToVariant[Vector2i] = (value, dest) => {
    val buf = stackalloc[Byte](BuiltinSizes.Vector2i.toCSize)
    writeType(value, buf)
    VariantConstructors.fromType(GDEXTENSION_VARIANT_TYPE_VECTOR2I)(dest, buf)
  }

  given FromVariant[Vector2i] = variant => {
    val buf = stackalloc[Byte](BuiltinSizes.Vector2i.toCSize)
    VariantConstructors.toType(GDEXTENSION_VARIANT_TYPE_VECTOR2I)(buf, variant)
    readType(buf)
  }
}
