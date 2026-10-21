package gdext.builtin

import scala.scalanative.annotation.alwaysinline
import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import gdext.internal.ffi.types.*
import gdext.internal.ffi.types.GDExtensionVariantType.*
import GodotMath.*

/** Godot's `Vector2`: two single-precision components (8 bytes). The whole
  * engine API is implemented in Scala (ported from `core/math`), so no method
  * calls into the engine. Zero-argument methods take no parentheses.
  */
final case class Vector2(x: Float, y: Float) {
  @alwaysinline def +(o: Vector2): Vector2 = Vector2(x + o.x, y + o.y)
  @alwaysinline def -(o: Vector2): Vector2 = Vector2(x - o.x, y - o.y)
  @alwaysinline def *(o: Vector2): Vector2 = Vector2(x * o.x, y * o.y)
  @alwaysinline def /(o: Vector2): Vector2 = Vector2(x / o.x, y / o.y)
  @alwaysinline def *(s: Float): Vector2 = Vector2(x * s, y * s)
  @alwaysinline def /(s: Float): Vector2 = Vector2(x / s, y / s)
  @alwaysinline def unary_- : Vector2 = Vector2(-x, -y)
  @alwaysinline def unary_+ : Vector2 = this

  /** `Vector2 * Transform2D`: the inverse transform of this point. */
  def *(t: Transform2D): Vector2 = t.xformInv(this)

  def <(o: Vector2): Boolean = if (x == o.x) y < o.y else x < o.x
  def <=(o: Vector2): Boolean = if (x == o.x) y <= o.y else x < o.x
  def >(o: Vector2): Boolean = if (x == o.x) y > o.y else x > o.x
  def >=(o: Vector2): Boolean = if (x == o.x) y >= o.y else x > o.x

  def apply(axis: Int): Float = if (axis == 0) x else y

  @alwaysinline def dot(o: Vector2): Float = x * o.x + y * o.y
  @alwaysinline def cross(o: Vector2): Float = x * o.y - y * o.x
  @alwaysinline def lengthSquared: Float = x * x + y * y
  @alwaysinline def length: Float = sqrt(x * x + y * y)

  def angle: Float = atan2(y, x)
  def angleTo(to: Vector2): Float = atan2(cross(to), dot(to))
  def angleToPoint(to: Vector2): Float = (to - this).angle
  def directionTo(to: Vector2): Vector2 = Vector2(to.x - x, to.y - y).normalized
  def distanceTo(to: Vector2): Float = {
    val dx = x - to.x; val dy = y - to.y
    sqrt(dx * dx + dy * dy)
  }
  def distanceSquaredTo(to: Vector2): Float = {
    val dx = x - to.x; val dy = y - to.y
    dx * dx + dy * dy
  }

  def limitLength(length: Float = 1.0f): Vector2 = {
    val l = this.length
    if (l > 0f && length < l) (this / l) * length else this
  }

  def normalized: Vector2 = {
    val l = x * x + y * y
    if (l != 0f) { val s = sqrt(l); Vector2(x / s, y / s) }
    else this
  }

  def isNormalized: Boolean =
    GodotMath.isEqualApprox(lengthSquared, 1f, UnitEpsilon)
  def isEqualApprox(to: Vector2): Boolean =
    GodotMath.isEqualApprox(x, to.x) && GodotMath.isEqualApprox(y, to.y)
  def isZeroApprox: Boolean =
    GodotMath.isZeroApprox(x) && GodotMath.isZeroApprox(y)
  def isFinite: Boolean = GodotMath.isFinite(x) && GodotMath.isFinite(y)

  def posmod(mod: Float): Vector2 = Vector2(fposmod(x, mod), fposmod(y, mod))
  def posmodv(modv: Vector2): Vector2 =
    Vector2(fposmod(x, modv.x), fposmod(y, modv.y))
  def project(b: Vector2): Vector2 = b * (dot(b) / b.lengthSquared)

  def lerp(to: Vector2, weight: Float): Vector2 =
    Vector2(GodotMath.lerp(x, to.x, weight), GodotMath.lerp(y, to.y, weight))

  def slerp(to: Vector2, weight: Float): Vector2 = {
    val startLengthSq = lengthSquared
    val endLengthSq = to.lengthSquared
    if (startLengthSq == 0f || endLengthSq == 0f) lerp(to, weight)
    else {
      val startLength = sqrt(startLengthSq)
      val resultLength = GodotMath.lerp(startLength, sqrt(endLengthSq), weight)
      val angle = angleTo(to)
      rotated(angle * weight) * (resultLength / startLength)
    }
  }

  def cubicInterpolate(
    b: Vector2,
    preA: Vector2,
    postB: Vector2,
    weight: Float
  ): Vector2 =
    Vector2(
      GodotMath.cubicInterpolate(x, b.x, preA.x, postB.x, weight),
      GodotMath.cubicInterpolate(y, b.y, preA.y, postB.y, weight)
    )

  def cubicInterpolateInTime(
    b: Vector2,
    preA: Vector2,
    postB: Vector2,
    weight: Float,
    bT: Float,
    preAT: Float,
    postBT: Float
  ): Vector2 =
    Vector2(
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
      )
    )

  def bezierInterpolate(
    control1: Vector2,
    control2: Vector2,
    end: Vector2,
    t: Float
  ): Vector2 =
    Vector2(
      GodotMath.bezierInterpolate(x, control1.x, control2.x, end.x, t),
      GodotMath.bezierInterpolate(y, control1.y, control2.y, end.y, t)
    )

  def bezierDerivative(
    control1: Vector2,
    control2: Vector2,
    end: Vector2,
    t: Float
  ): Vector2 =
    Vector2(
      GodotMath.bezierDerivative(x, control1.x, control2.x, end.x, t),
      GodotMath.bezierDerivative(y, control1.y, control2.y, end.y, t)
    )

  def maxAxisIndex: Long = if (x < y) 1L else 0L
  def minAxisIndex: Long = if (x < y) 0L else 1L

  def moveToward(to: Vector2, delta: Float): Vector2 = {
    val vd = to - this
    val len = vd.length
    if (len <= delta || len < CmpEpsilon) to else this + vd / len * delta
  }

  def rotated(angle: Float): Vector2 = {
    val sine = sin(angle)
    val cosi = cos(angle)
    Vector2(x * cosi - y * sine, x * sine + y * cosi)
  }

  def orthogonal: Vector2 = Vector2(y, -x)
  def floor: Vector2 = Vector2(GodotMath.floor(x), GodotMath.floor(y))
  def ceil: Vector2 = Vector2(GodotMath.ceil(x), GodotMath.ceil(y))
  def round: Vector2 = Vector2(GodotMath.round(x), GodotMath.round(y))
  def aspect: Float = x / y

  /** Requires a normalized `n`. */
  def slide(n: Vector2): Vector2 = this - n * dot(n)

  /** Requires a normalized `n`. */
  def bounce(n: Vector2): Vector2 = -reflect(n)

  /** Requires a normalized `line`. */
  def reflect(line: Vector2): Vector2 = line * (2.0f * dot(line)) - this

  def abs: Vector2 = Vector2(math.abs(x), math.abs(y))
  def sign: Vector2 = Vector2(GodotMath.sign(x), GodotMath.sign(y))
  def clamp(min: Vector2, max: Vector2): Vector2 =
    Vector2(GodotMath.clamp(x, min.x, max.x), GodotMath.clamp(y, min.y, max.y))
  def clampf(min: Float, max: Float): Vector2 =
    Vector2(GodotMath.clamp(x, min, max), GodotMath.clamp(y, min, max))
  def snapped(step: Vector2): Vector2 =
    Vector2(GodotMath.snapped(x, step.x), GodotMath.snapped(y, step.y))
  def snappedf(step: Float): Vector2 =
    Vector2(GodotMath.snapped(x, step), GodotMath.snapped(y, step))
  def min(o: Vector2): Vector2 =
    Vector2(if (x < o.x) x else o.x, if (y < o.y) y else o.y)
  def minf(o: Float): Vector2 =
    Vector2(if (x < o) x else o, if (y < o) y else o)
  def max(o: Vector2): Vector2 =
    Vector2(if (x > o.x) x else o.x, if (y > o.y) y else o.y)
  def maxf(o: Float): Vector2 =
    Vector2(if (x > o) x else o, if (y > o) y else o)
}

object Vector2 {
  val ZERO: Vector2 = Vector2(0f, 0f)
  val ONE: Vector2 = Vector2(1f, 1f)
  val INF: Vector2 = Vector2(Float.PositiveInfinity, Float.PositiveInfinity)
  val LEFT: Vector2 = Vector2(-1f, 0f)
  val RIGHT: Vector2 = Vector2(1f, 0f)
  val UP: Vector2 = Vector2(0f, -1f)
  val DOWN: Vector2 = Vector2(0f, 1f)

  @deprecated("use Vector2.ZERO", "0.1.9")
  def zero: Vector2 = ZERO

  def apply(): Vector2 = ZERO
  def apply(v: Vector2i): Vector2 = Vector2(v.x.toFloat, v.y.toFloat)

  def fromAngle(angle: Float): Vector2 = Vector2(cos(angle), sin(angle))

  private[gdext] inline def writeType(
    v: Vector2,
    p: GDExtensionTypePtr
  ): Unit = {
    val f = p.asInstanceOf[Ptr[CFloat]]
    f(0) = v.x; f(1) = v.y
  }

  private[gdext] inline def readType(p: GDExtensionTypePtr): Vector2 = {
    val f = p.asInstanceOf[Ptr[CFloat]]
    Vector2(f(0), f(1))
  }

  given ToVariant[Vector2] = (value, dest) => {
    val buf = stackalloc[Byte](BuiltinSizes.Vector2.toCSize)
    writeType(value, buf)
    VariantConstructors.fromType(GDEXTENSION_VARIANT_TYPE_VECTOR2)(dest, buf)
  }

  given FromVariant[Vector2] = variant => {
    val buf = stackalloc[Byte](BuiltinSizes.Vector2.toCSize)
    VariantConstructors.toType(GDEXTENSION_VARIANT_TYPE_VECTOR2)(buf, variant)
    readType(buf)
  }
}
