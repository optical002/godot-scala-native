package gdext.builtin

import scala.scalanative.annotation.alwaysinline
import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import gdext.internal.ffi.types.*
import gdext.internal.ffi.types.GDExtensionVariantType.*

/** Godot's `Vector3i`: three 32-bit integer components (12 bytes). */
final case class Vector3i(x: Int, y: Int, z: Int) {
  @alwaysinline def +(o: Vector3i): Vector3i =
    Vector3i(x + o.x, y + o.y, z + o.z)
  @alwaysinline def -(o: Vector3i): Vector3i =
    Vector3i(x - o.x, y - o.y, z - o.z)
  @alwaysinline def *(o: Vector3i): Vector3i =
    Vector3i(x * o.x, y * o.y, z * o.z)
  @alwaysinline def /(o: Vector3i): Vector3i =
    Vector3i(x / o.x, y / o.y, z / o.z)
  @alwaysinline def %(o: Vector3i): Vector3i =
    Vector3i(x % o.x, y % o.y, z % o.z)
  @alwaysinline def *(s: Int): Vector3i = Vector3i(x * s, y * s, z * s)
  @alwaysinline def /(s: Int): Vector3i = Vector3i(x / s, y / s, z / s)
  @alwaysinline def %(s: Int): Vector3i = Vector3i(x % s, y % s, z % s)
  @alwaysinline def *(s: Float): Vector3 = Vector3(x * s, y * s, z * s)
  @alwaysinline def /(s: Float): Vector3 = Vector3(x / s, y / s, z / s)
  @alwaysinline def unary_- : Vector3i = Vector3i(-x, -y, -z)
  @alwaysinline def unary_+ : Vector3i = this

  def <(o: Vector3i): Boolean =
    if (x == o.x) { if (y == o.y) z < o.z else y < o.y }
    else x < o.x
  def <=(o: Vector3i): Boolean =
    if (x == o.x) { if (y == o.y) z <= o.z else y < o.y }
    else x < o.x
  def >(o: Vector3i): Boolean =
    if (x == o.x) { if (y == o.y) z > o.z else y > o.y }
    else x > o.x
  def >=(o: Vector3i): Boolean =
    if (x == o.x) { if (y == o.y) z >= o.z else y > o.y }
    else x > o.x

  def apply(axis: Int): Int = if (axis == 0) x else if (axis == 1) y else z

  def minAxisIndex: Long =
    if (x < y) { if (x < z) 0L else 2L }
    else { if (y < z) 1L else 2L }
  def maxAxisIndex: Long =
    if (x < y) { if (y < z) 2L else 1L }
    else { if (x < z) 2L else 0L }

  def lengthSquared: Long = x.toLong * x + y.toLong * y + z.toLong * z
  def length: Float = math.sqrt(lengthSquared.toDouble).toFloat
  def distanceSquaredTo(to: Vector3i): Long = (to - this).lengthSquared
  def distanceTo(to: Vector3i): Float = (to - this).length

  def sign: Vector3i =
    Vector3i(GodotMath.sign(x), GodotMath.sign(y), GodotMath.sign(z))
  def abs: Vector3i = Vector3i(math.abs(x), math.abs(y), math.abs(z))
  def clamp(min: Vector3i, max: Vector3i): Vector3i =
    Vector3i(
      GodotMath.clamp(x, min.x, max.x),
      GodotMath.clamp(y, min.y, max.y),
      GodotMath.clamp(z, min.z, max.z)
    )
  def clampi(min: Long, max: Long): Vector3i =
    Vector3i(
      GodotMath.clamp(x, min.toInt, max.toInt),
      GodotMath.clamp(y, min.toInt, max.toInt),
      GodotMath.clamp(z, min.toInt, max.toInt)
    )
  def snapped(step: Vector3i): Vector3i =
    Vector3i(
      GodotMath.snapped(x, step.x),
      GodotMath.snapped(y, step.y),
      GodotMath.snapped(z, step.z)
    )
  def snappedi(step: Long): Vector3i =
    Vector3i(
      GodotMath.snapped(x, step.toInt),
      GodotMath.snapped(y, step.toInt),
      GodotMath.snapped(z, step.toInt)
    )
  def min(o: Vector3i): Vector3i =
    Vector3i(math.min(x, o.x), math.min(y, o.y), math.min(z, o.z))
  def mini(o: Long): Vector3i =
    Vector3i(math.min(x, o.toInt), math.min(y, o.toInt), math.min(z, o.toInt))
  def max(o: Vector3i): Vector3i =
    Vector3i(math.max(x, o.x), math.max(y, o.y), math.max(z, o.z))
  def maxi(o: Long): Vector3i =
    Vector3i(math.max(x, o.toInt), math.max(y, o.toInt), math.max(z, o.toInt))
}

object Vector3i {
  val ZERO: Vector3i = Vector3i(0, 0, 0)
  val ONE: Vector3i = Vector3i(1, 1, 1)
  val MIN: Vector3i = Vector3i(Int.MinValue, Int.MinValue, Int.MinValue)
  val MAX: Vector3i = Vector3i(Int.MaxValue, Int.MaxValue, Int.MaxValue)
  val LEFT: Vector3i = Vector3i(-1, 0, 0)
  val RIGHT: Vector3i = Vector3i(1, 0, 0)
  val UP: Vector3i = Vector3i(0, 1, 0)
  val DOWN: Vector3i = Vector3i(0, -1, 0)
  val FORWARD: Vector3i = Vector3i(0, 0, -1)
  val BACK: Vector3i = Vector3i(0, 0, 1)

  def apply(): Vector3i = ZERO

  /** Truncates toward zero, like Godot's `Vector3i(Vector3)`. */
  def apply(v: Vector3): Vector3i = Vector3i(v.x.toInt, v.y.toInt, v.z.toInt)

  private[gdext] inline def writeType(
    v: Vector3i,
    p: GDExtensionTypePtr
  ): Unit = {
    val f = p.asInstanceOf[Ptr[CInt]]
    f(0) = v.x; f(1) = v.y; f(2) = v.z
  }

  private[gdext] inline def readType(p: GDExtensionTypePtr): Vector3i = {
    val f = p.asInstanceOf[Ptr[CInt]]
    Vector3i(f(0), f(1), f(2))
  }

  given ToVariant[Vector3i] = (value, dest) => {
    val buf = stackalloc[Byte](BuiltinSizes.Vector3i.toCSize)
    writeType(value, buf)
    VariantConstructors.fromType(GDEXTENSION_VARIANT_TYPE_VECTOR3I)(dest, buf)
  }

  given FromVariant[Vector3i] = variant => {
    val buf = stackalloc[Byte](BuiltinSizes.Vector3i.toCSize)
    VariantConstructors.toType(GDEXTENSION_VARIANT_TYPE_VECTOR3I)(buf, variant)
    readType(buf)
  }
}
