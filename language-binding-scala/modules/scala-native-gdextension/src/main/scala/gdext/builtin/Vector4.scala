package gdext.builtin

import scala.scalanative.annotation.alwaysinline
import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import gdext.internal.ffi.types.*
import gdext.internal.ffi.types.GDExtensionVariantType.*
import GodotMath.*

/** Godot's `Vector4`: four single-precision components (16 bytes). */
final case class Vector4(x: Float, y: Float, z: Float, w: Float) {
  @alwaysinline def +(o: Vector4): Vector4 =
    Vector4(x + o.x, y + o.y, z + o.z, w + o.w)
  @alwaysinline def -(o: Vector4): Vector4 =
    Vector4(x - o.x, y - o.y, z - o.z, w - o.w)
  @alwaysinline def *(o: Vector4): Vector4 =
    Vector4(x * o.x, y * o.y, z * o.z, w * o.w)
  @alwaysinline def /(o: Vector4): Vector4 =
    Vector4(x / o.x, y / o.y, z / o.z, w / o.w)
  @alwaysinline def *(s: Float): Vector4 = Vector4(x * s, y * s, z * s, w * s)
  @alwaysinline def /(s: Float): Vector4 = Vector4(x / s, y / s, z / s, w / s)
  @alwaysinline def unary_- : Vector4 = Vector4(-x, -y, -z, -w)
  @alwaysinline def unary_+ : Vector4 = this

  /** `Vector4 * Projection`: the inverse (transposed) transform. */
  def *(p: Projection): Vector4 = p.xformInv(this)

  def <(o: Vector4): Boolean =
    if (x == o.x) {
      if (y == o.y) { if (z == o.z) w < o.w else z < o.z }
      else y < o.y
    } else x < o.x
  def <=(o: Vector4): Boolean =
    if (x == o.x) {
      if (y == o.y) { if (z == o.z) w <= o.w else z < o.z }
      else y < o.y
    } else x < o.x
  def >(o: Vector4): Boolean =
    if (x == o.x) {
      if (y == o.y) { if (z == o.z) w > o.w else z > o.z }
      else y > o.y
    } else x > o.x
  def >=(o: Vector4): Boolean =
    if (x == o.x) {
      if (y == o.y) { if (z == o.z) w >= o.w else z > o.z }
      else y > o.y
    } else x > o.x

  def apply(axis: Int): Float =
    if (axis == 0) x else if (axis == 1) y else if (axis == 2) z else w

  @alwaysinline def dot(o: Vector4): Float =
    x * o.x + y * o.y + z * o.z + w * o.w
  @alwaysinline def lengthSquared: Float = dot(this)
  @alwaysinline def length: Float = sqrt(lengthSquared)

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

  def abs: Vector4 = Vector4(math.abs(x), math.abs(y), math.abs(z), math.abs(w))
  def sign: Vector4 =
    Vector4(
      GodotMath.sign(x),
      GodotMath.sign(y),
      GodotMath.sign(z),
      GodotMath.sign(w)
    )
  def floor: Vector4 =
    Vector4(
      GodotMath.floor(x),
      GodotMath.floor(y),
      GodotMath.floor(z),
      GodotMath.floor(w)
    )
  def ceil: Vector4 =
    Vector4(
      GodotMath.ceil(x),
      GodotMath.ceil(y),
      GodotMath.ceil(z),
      GodotMath.ceil(w)
    )
  def round: Vector4 =
    Vector4(
      GodotMath.round(x),
      GodotMath.round(y),
      GodotMath.round(z),
      GodotMath.round(w)
    )

  def lerp(to: Vector4, weight: Float): Vector4 =
    Vector4(
      GodotMath.lerp(x, to.x, weight),
      GodotMath.lerp(y, to.y, weight),
      GodotMath.lerp(z, to.z, weight),
      GodotMath.lerp(w, to.w, weight)
    )

  def cubicInterpolate(
    b: Vector4,
    preA: Vector4,
    postB: Vector4,
    weight: Float
  ): Vector4 =
    Vector4(
      GodotMath.cubicInterpolate(x, b.x, preA.x, postB.x, weight),
      GodotMath.cubicInterpolate(y, b.y, preA.y, postB.y, weight),
      GodotMath.cubicInterpolate(z, b.z, preA.z, postB.z, weight),
      GodotMath.cubicInterpolate(w, b.w, preA.w, postB.w, weight)
    )

  def cubicInterpolateInTime(
    b: Vector4,
    preA: Vector4,
    postB: Vector4,
    weight: Float,
    bT: Float,
    preAT: Float,
    postBT: Float
  ): Vector4 =
    Vector4(
      GodotMath.cubicInterpolateInTime(
        x,
        b.x,
        preA.x,
        postB.x,
        weight,
        bT,
        preAT,
        postBT
      ),
      GodotMath.cubicInterpolateInTime(
        y,
        b.y,
        preA.y,
        postB.y,
        weight,
        bT,
        preAT,
        postBT
      ),
      GodotMath.cubicInterpolateInTime(
        z,
        b.z,
        preA.z,
        postB.z,
        weight,
        bT,
        preAT,
        postBT
      ),
      GodotMath.cubicInterpolateInTime(
        w,
        b.w,
        preA.w,
        postB.w,
        weight,
        bT,
        preAT,
        postBT
      )
    )

  def posmod(mod: Float): Vector4 =
    Vector4(fposmod(x, mod), fposmod(y, mod), fposmod(z, mod), fposmod(w, mod))
  def posmodv(modv: Vector4): Vector4 =
    Vector4(
      fposmod(x, modv.x),
      fposmod(y, modv.y),
      fposmod(z, modv.z),
      fposmod(w, modv.w)
    )
  def snapped(step: Vector4): Vector4 =
    Vector4(
      GodotMath.snapped(x, step.x),
      GodotMath.snapped(y, step.y),
      GodotMath.snapped(z, step.z),
      GodotMath.snapped(w, step.w)
    )
  def snappedf(step: Float): Vector4 =
    Vector4(
      GodotMath.snapped(x, step),
      GodotMath.snapped(y, step),
      GodotMath.snapped(z, step),
      GodotMath.snapped(w, step)
    )
  def clamp(min: Vector4, max: Vector4): Vector4 =
    Vector4(
      GodotMath.clamp(x, min.x, max.x),
      GodotMath.clamp(y, min.y, max.y),
      GodotMath.clamp(z, min.z, max.z),
      GodotMath.clamp(w, min.w, max.w)
    )
  def clampf(min: Float, max: Float): Vector4 =
    Vector4(
      GodotMath.clamp(x, min, max),
      GodotMath.clamp(y, min, max),
      GodotMath.clamp(z, min, max),
      GodotMath.clamp(w, min, max)
    )

  def normalized: Vector4 = {
    val l = lengthSquared
    if (l == 0f) Vector4(0f, 0f, 0f, 0f)
    else { val s = sqrt(l); Vector4(x / s, y / s, z / s, w / s) }
  }

  def isNormalized: Boolean =
    GodotMath.isEqualApprox(lengthSquared, 1f, UnitEpsilon)
  def directionTo(to: Vector4): Vector4 = (to - this).normalized
  def distanceTo(to: Vector4): Float = (to - this).length
  def distanceSquaredTo(to: Vector4): Float = (to - this).lengthSquared
  def inverse: Vector4 = Vector4(1.0f / x, 1.0f / y, 1.0f / z, 1.0f / w)

  def isEqualApprox(to: Vector4): Boolean =
    GodotMath.isEqualApprox(x, to.x) && GodotMath.isEqualApprox(y, to.y) &&
      GodotMath.isEqualApprox(z, to.z) && GodotMath.isEqualApprox(w, to.w)
  def isZeroApprox: Boolean =
    GodotMath.isZeroApprox(x) && GodotMath.isZeroApprox(y) &&
      GodotMath.isZeroApprox(z) && GodotMath.isZeroApprox(w)
  def isFinite: Boolean =
    GodotMath.isFinite(x) && GodotMath.isFinite(y) && GodotMath.isFinite(z) &&
      GodotMath.isFinite(w)

  def min(o: Vector4): Vector4 =
    Vector4(
      if (x < o.x) x else o.x,
      if (y < o.y) y else o.y,
      if (z < o.z) z else o.z,
      if (w < o.w) w else o.w
    )
  def minf(o: Float): Vector4 =
    Vector4(
      if (x < o) x else o,
      if (y < o) y else o,
      if (z < o) z else o,
      if (w < o) w else o
    )
  def max(o: Vector4): Vector4 =
    Vector4(
      if (x > o.x) x else o.x,
      if (y > o.y) y else o.y,
      if (z > o.z) z else o.z,
      if (w > o.w) w else o.w
    )
  def maxf(o: Float): Vector4 =
    Vector4(
      if (x > o) x else o,
      if (y > o) y else o,
      if (z > o) z else o,
      if (w > o) w else o
    )
}

object Vector4 {
  val ZERO: Vector4 = Vector4(0f, 0f, 0f, 0f)
  val ONE: Vector4 = Vector4(1f, 1f, 1f, 1f)
  val INF: Vector4 = Vector4(
    Float.PositiveInfinity,
    Float.PositiveInfinity,
    Float.PositiveInfinity,
    Float.PositiveInfinity
  )

  def apply(): Vector4 = ZERO
  def apply(v: Vector4i): Vector4 =
    Vector4(v.x.toFloat, v.y.toFloat, v.z.toFloat, v.w.toFloat)

  private[gdext] inline def writeType(
    v: Vector4,
    p: GDExtensionTypePtr
  ): Unit = {
    val f = p.asInstanceOf[Ptr[CFloat]]
    f(0) = v.x; f(1) = v.y; f(2) = v.z; f(3) = v.w
  }

  private[gdext] inline def readType(p: GDExtensionTypePtr): Vector4 = {
    val f = p.asInstanceOf[Ptr[CFloat]]
    Vector4(f(0), f(1), f(2), f(3))
  }

  given ToVariant[Vector4] = (value, dest) => {
    val buf = stackalloc[Byte](BuiltinSizes.Vector4.toCSize)
    writeType(value, buf)
    VariantConstructors.fromType(GDEXTENSION_VARIANT_TYPE_VECTOR4)(dest, buf)
  }

  given FromVariant[Vector4] = variant => {
    val buf = stackalloc[Byte](BuiltinSizes.Vector4.toCSize)
    VariantConstructors.toType(GDEXTENSION_VARIANT_TYPE_VECTOR4)(buf, variant)
    readType(buf)
  }
}
