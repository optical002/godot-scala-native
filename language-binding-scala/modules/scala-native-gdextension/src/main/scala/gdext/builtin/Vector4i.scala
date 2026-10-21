package gdext.builtin

import scala.scalanative.annotation.alwaysinline
import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import gdext.internal.ffi.types.*
import gdext.internal.ffi.types.GDExtensionVariantType.*

/** Godot's `Vector4i`: four 32-bit integer components (16 bytes). */
final case class Vector4i(x: Int, y: Int, z: Int, w: Int) {
  @alwaysinline def +(o: Vector4i): Vector4i =
    Vector4i(x + o.x, y + o.y, z + o.z, w + o.w)
  @alwaysinline def -(o: Vector4i): Vector4i =
    Vector4i(x - o.x, y - o.y, z - o.z, w - o.w)
  @alwaysinline def *(o: Vector4i): Vector4i =
    Vector4i(x * o.x, y * o.y, z * o.z, w * o.w)
  @alwaysinline def /(o: Vector4i): Vector4i =
    Vector4i(x / o.x, y / o.y, z / o.z, w / o.w)
  @alwaysinline def %(o: Vector4i): Vector4i =
    Vector4i(x % o.x, y % o.y, z % o.z, w % o.w)
  @alwaysinline def *(s: Int): Vector4i = Vector4i(x * s, y * s, z * s, w * s)
  @alwaysinline def /(s: Int): Vector4i = Vector4i(x / s, y / s, z / s, w / s)
  @alwaysinline def %(s: Int): Vector4i = Vector4i(x % s, y % s, z % s, w % s)
  @alwaysinline def *(s: Float): Vector4 = Vector4(x * s, y * s, z * s, w * s)
  @alwaysinline def /(s: Float): Vector4 = Vector4(x / s, y / s, z / s, w / s)
  @alwaysinline def unary_- : Vector4i = Vector4i(-x, -y, -z, -w)
  @alwaysinline def unary_+ : Vector4i = this

  def <(o: Vector4i): Boolean =
    if (x == o.x) {
      if (y == o.y) { if (z == o.z) w < o.w else z < o.z }
      else y < o.y
    } else x < o.x
  def <=(o: Vector4i): Boolean =
    if (x == o.x) {
      if (y == o.y) { if (z == o.z) w <= o.w else z < o.z }
      else y < o.y
    } else x < o.x
  def >(o: Vector4i): Boolean =
    if (x == o.x) {
      if (y == o.y) { if (z == o.z) w > o.w else z > o.z }
      else y > o.y
    } else x > o.x
  def >=(o: Vector4i): Boolean =
    if (x == o.x) {
      if (y == o.y) { if (z == o.z) w >= o.w else z > o.z }
      else y > o.y
    } else x > o.x

  def apply(axis: Int): Int =
    if (axis == 0) x else if (axis == 1) y else if (axis == 2) z else w

  def minAxisIndex: Long = {
    var idx = 0; var v = x
    var i = 1
    while (i < 4) { if (apply(i) < v) { idx = i; v = apply(i) }; i += 1 }
    idx.toLong
  }
  def maxAxisIndex: Long = {
    var idx = 0; var v = x
    var i = 1
    while (i < 4) { if (apply(i) > v) { idx = i; v = apply(i) }; i += 1 }
    idx.toLong
  }

  def lengthSquared: Long =
    x.toLong * x + y.toLong * y + z.toLong * z + w.toLong * w
  def length: Float = math.sqrt(lengthSquared.toDouble).toFloat
  def distanceSquaredTo(to: Vector4i): Long = (to - this).lengthSquared
  def distanceTo(to: Vector4i): Float = (to - this).length

  def sign: Vector4i =
    Vector4i(
      GodotMath.sign(x),
      GodotMath.sign(y),
      GodotMath.sign(z),
      GodotMath.sign(w)
    )
  def abs: Vector4i =
    Vector4i(math.abs(x), math.abs(y), math.abs(z), math.abs(w))
  def clamp(min: Vector4i, max: Vector4i): Vector4i =
    Vector4i(
      GodotMath.clamp(x, min.x, max.x),
      GodotMath.clamp(y, min.y, max.y),
      GodotMath.clamp(z, min.z, max.z),
      GodotMath.clamp(w, min.w, max.w)
    )
  def clampi(min: Long, max: Long): Vector4i =
    Vector4i(
      GodotMath.clamp(x, min.toInt, max.toInt),
      GodotMath.clamp(y, min.toInt, max.toInt),
      GodotMath.clamp(z, min.toInt, max.toInt),
      GodotMath.clamp(w, min.toInt, max.toInt)
    )
  def snapped(step: Vector4i): Vector4i =
    Vector4i(
      GodotMath.snapped(x, step.x),
      GodotMath.snapped(y, step.y),
      GodotMath.snapped(z, step.z),
      GodotMath.snapped(w, step.w)
    )
  def snappedi(step: Long): Vector4i =
    Vector4i(
      GodotMath.snapped(x, step.toInt),
      GodotMath.snapped(y, step.toInt),
      GodotMath.snapped(z, step.toInt),
      GodotMath.snapped(w, step.toInt)
    )
  def min(o: Vector4i): Vector4i =
    Vector4i(
      math.min(x, o.x),
      math.min(y, o.y),
      math.min(z, o.z),
      math.min(w, o.w)
    )
  def mini(o: Long): Vector4i =
    Vector4i(
      math.min(x, o.toInt),
      math.min(y, o.toInt),
      math.min(z, o.toInt),
      math.min(w, o.toInt)
    )
  def max(o: Vector4i): Vector4i =
    Vector4i(
      math.max(x, o.x),
      math.max(y, o.y),
      math.max(z, o.z),
      math.max(w, o.w)
    )
  def maxi(o: Long): Vector4i =
    Vector4i(
      math.max(x, o.toInt),
      math.max(y, o.toInt),
      math.max(z, o.toInt),
      math.max(w, o.toInt)
    )
}

object Vector4i {
  val ZERO: Vector4i = Vector4i(0, 0, 0, 0)
  val ONE: Vector4i = Vector4i(1, 1, 1, 1)
  val MIN: Vector4i =
    Vector4i(Int.MinValue, Int.MinValue, Int.MinValue, Int.MinValue)
  val MAX: Vector4i =
    Vector4i(Int.MaxValue, Int.MaxValue, Int.MaxValue, Int.MaxValue)

  def apply(): Vector4i = ZERO

  /** Truncates toward zero, like Godot's `Vector4i(Vector4)`. */
  def apply(v: Vector4): Vector4i =
    Vector4i(v.x.toInt, v.y.toInt, v.z.toInt, v.w.toInt)

  private[gdext] inline def writeType(
    v: Vector4i,
    p: GDExtensionTypePtr
  ): Unit = {
    val f = p.asInstanceOf[Ptr[CInt]]
    f(0) = v.x; f(1) = v.y; f(2) = v.z; f(3) = v.w
  }

  private[gdext] inline def readType(p: GDExtensionTypePtr): Vector4i = {
    val f = p.asInstanceOf[Ptr[CInt]]
    Vector4i(f(0), f(1), f(2), f(3))
  }

  given ToVariant[Vector4i] = (value, dest) => {
    val buf = stackalloc[Byte](BuiltinSizes.Vector4i.toCSize)
    writeType(value, buf)
    VariantConstructors.fromType(GDEXTENSION_VARIANT_TYPE_VECTOR4I)(dest, buf)
  }

  given FromVariant[Vector4i] = variant => {
    val buf = stackalloc[Byte](BuiltinSizes.Vector4i.toCSize)
    VariantConstructors.toType(GDEXTENSION_VARIANT_TYPE_VECTOR4I)(buf, variant)
    readType(buf)
  }
}
