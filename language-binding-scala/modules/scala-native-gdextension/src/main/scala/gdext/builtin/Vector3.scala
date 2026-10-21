package gdext.builtin

import scala.scalanative.annotation.alwaysinline
import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import gdext.internal.ffi.types.*
import gdext.internal.ffi.types.GDExtensionVariantType.*
import GodotMath.*

/** Godot's `Vector3`: three single-precision components (12 bytes). The whole
  * engine API is implemented in Scala (ported from `core/math`).
  */
final case class Vector3(x: Float, y: Float, z: Float) {
  @alwaysinline def +(o: Vector3): Vector3 = Vector3(x + o.x, y + o.y, z + o.z)
  @alwaysinline def -(o: Vector3): Vector3 = Vector3(x - o.x, y - o.y, z - o.z)
  @alwaysinline def *(o: Vector3): Vector3 = Vector3(x * o.x, y * o.y, z * o.z)
  @alwaysinline def /(o: Vector3): Vector3 = Vector3(x / o.x, y / o.y, z / o.z)
  @alwaysinline def *(s: Float): Vector3 = Vector3(x * s, y * s, z * s)
  @alwaysinline def /(s: Float): Vector3 = Vector3(x / s, y / s, z / s)
  @alwaysinline def unary_- : Vector3 = Vector3(-x, -y, -z)
  @alwaysinline def unary_+ : Vector3 = this

  /** `Vector3 * Basis`: the inverse (transposed) rotation of this vector. */
  def *(b: Basis): Vector3 = b.xformInv(this)

  /** `Vector3 * Quaternion`: the inverse rotation of this vector. */
  def *(q: Quaternion): Vector3 = q.xformInv(this)

  /** `Vector3 * Transform3D`: the inverse transform of this point. */
  def *(t: Transform3D): Vector3 = t.xformInv(this)

  def <(o: Vector3): Boolean =
    if (x == o.x) { if (y == o.y) z < o.z else y < o.y }
    else x < o.x
  def <=(o: Vector3): Boolean =
    if (x == o.x) { if (y == o.y) z <= o.z else y < o.y }
    else x < o.x
  def >(o: Vector3): Boolean =
    if (x == o.x) { if (y == o.y) z > o.z else y > o.y }
    else x > o.x
  def >=(o: Vector3): Boolean =
    if (x == o.x) { if (y == o.y) z >= o.z else y > o.y }
    else x > o.x

  def apply(axis: Int): Float = if (axis == 0) x else if (axis == 1) y else z

  @alwaysinline def dot(o: Vector3): Float = x * o.x + y * o.y + z * o.z
  @alwaysinline def cross(o: Vector3): Vector3 =
    Vector3(y * o.z - z * o.y, z * o.x - x * o.z, x * o.y - y * o.x)
  @alwaysinline def lengthSquared: Float = x * x + y * y + z * z
  @alwaysinline def length: Float = sqrt(x * x + y * y + z * z)

  def minAxisIndex: Long =
    if (x < y) { if (x < z) 0L else 2L }
    else { if (y < z) 1L else 2L }
  def maxAxisIndex: Long =
    if (x < y) { if (y < z) 2L else 1L }
    else { if (x < z) 2L else 0L }

  def angleTo(to: Vector3): Float = atan2(cross(to).length, dot(to))

  def signedAngleTo(to: Vector3, axis: Vector3): Float = {
    val crossTo = cross(to)
    val unsignedAngle = atan2(crossTo.length, dot(to))
    if (crossTo.dot(axis) < 0f) -unsignedAngle else unsignedAngle
  }

  def directionTo(to: Vector3): Vector3 =
    Vector3(to.x - x, to.y - y, to.z - z).normalized
  def distanceTo(to: Vector3): Float = (to - this).length
  def distanceSquaredTo(to: Vector3): Float = (to - this).lengthSquared

  def limitLength(length: Float = 1.0f): Vector3 = {
    val l = this.length
    if (l > 0f && length < l) (this / l) * length else this
  }

  def normalized: Vector3 = {
    val l = lengthSquared
    if (l == 0f) Vector3(0f, 0f, 0f)
    else { val s = sqrt(l); Vector3(x / s, y / s, z / s) }
  }

  def isNormalized: Boolean =
    GodotMath.isEqualApprox(lengthSquared, 1f, UnitEpsilon)
  def isEqualApprox(to: Vector3): Boolean =
    GodotMath.isEqualApprox(x, to.x) && GodotMath.isEqualApprox(y, to.y) &&
      GodotMath.isEqualApprox(z, to.z)
  def isZeroApprox: Boolean =
    GodotMath.isZeroApprox(x) && GodotMath.isZeroApprox(y) && GodotMath
      .isZeroApprox(z)
  def isFinite: Boolean =
    GodotMath.isFinite(x) && GodotMath.isFinite(y) && GodotMath.isFinite(z)

  def inverse: Vector3 = Vector3(1.0f / x, 1.0f / y, 1.0f / z)

  def clamp(min: Vector3, max: Vector3): Vector3 =
    Vector3(
      GodotMath.clamp(x, min.x, max.x),
      GodotMath.clamp(y, min.y, max.y),
      GodotMath.clamp(z, min.z, max.z)
    )
  def clampf(min: Float, max: Float): Vector3 =
    Vector3(
      GodotMath.clamp(x, min, max),
      GodotMath.clamp(y, min, max),
      GodotMath.clamp(z, min, max)
    )
  def snapped(step: Vector3): Vector3 =
    Vector3(
      GodotMath.snapped(x, step.x),
      GodotMath.snapped(y, step.y),
      GodotMath.snapped(z, step.z)
    )
  def snappedf(step: Float): Vector3 =
    Vector3(
      GodotMath.snapped(x, step),
      GodotMath.snapped(y, step),
      GodotMath.snapped(z, step)
    )

  /** Rotate around a normalized `axis` by `angle` radians. */
  def rotated(axis: Vector3, angle: Float): Vector3 =
    Basis(axis, angle).xform(this)

  def lerp(to: Vector3, weight: Float): Vector3 =
    Vector3(
      GodotMath.lerp(x, to.x, weight),
      GodotMath.lerp(y, to.y, weight),
      GodotMath.lerp(z, to.z, weight)
    )

  def slerp(to: Vector3, weight: Float): Vector3 = {
    val startLengthSq = lengthSquared
    val endLengthSq = to.lengthSquared
    if (startLengthSq == 0f || endLengthSq == 0f) lerp(to, weight)
    else {
      val axis = cross(to)
      val axisLengthSq = axis.lengthSquared
      if (axisLengthSq == 0f) lerp(to, weight)
      else {
        val unitAxis = axis / sqrt(axisLengthSq)
        val startLength = sqrt(startLengthSq)
        val resultLength =
          GodotMath.lerp(startLength, sqrt(endLengthSq), weight)
        val angle = angleTo(to)
        rotated(unitAxis, angle * weight) * (resultLength / startLength)
      }
    }
  }

  def cubicInterpolate(
    b: Vector3,
    preA: Vector3,
    postB: Vector3,
    weight: Float
  ): Vector3 =
    Vector3(
      GodotMath.cubicInterpolate(x, b.x, preA.x, postB.x, weight),
      GodotMath.cubicInterpolate(y, b.y, preA.y, postB.y, weight),
      GodotMath.cubicInterpolate(z, b.z, preA.z, postB.z, weight)
    )

  def cubicInterpolateInTime(
    b: Vector3,
    preA: Vector3,
    postB: Vector3,
    weight: Float,
    bT: Float,
    preAT: Float,
    postBT: Float
  ): Vector3 =
    Vector3(
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
      )
    )

  def bezierInterpolate(
    control1: Vector3,
    control2: Vector3,
    end: Vector3,
    t: Float
  ): Vector3 =
    Vector3(
      GodotMath.bezierInterpolate(x, control1.x, control2.x, end.x, t),
      GodotMath.bezierInterpolate(y, control1.y, control2.y, end.y, t),
      GodotMath.bezierInterpolate(z, control1.z, control2.z, end.z, t)
    )

  def bezierDerivative(
    control1: Vector3,
    control2: Vector3,
    end: Vector3,
    t: Float
  ): Vector3 =
    Vector3(
      GodotMath.bezierDerivative(x, control1.x, control2.x, end.x, t),
      GodotMath.bezierDerivative(y, control1.y, control2.y, end.y, t),
      GodotMath.bezierDerivative(z, control1.z, control2.z, end.z, t)
    )

  def moveToward(to: Vector3, delta: Float): Vector3 = {
    val vd = to - this
    val len = vd.length
    if (len <= delta || len < CmpEpsilon) to else this + vd / len * delta
  }

  /** The outer product: the Basis whose rows are `this(i) * with`. */
  def outer(o: Vector3): Basis =
    Basis.fromRows(o * x, o * y, o * z)

  def abs: Vector3 = Vector3(math.abs(x), math.abs(y), math.abs(z))
  def floor: Vector3 =
    Vector3(GodotMath.floor(x), GodotMath.floor(y), GodotMath.floor(z))
  def ceil: Vector3 =
    Vector3(GodotMath.ceil(x), GodotMath.ceil(y), GodotMath.ceil(z))
  def round: Vector3 =
    Vector3(GodotMath.round(x), GodotMath.round(y), GodotMath.round(z))
  def posmod(mod: Float): Vector3 =
    Vector3(fposmod(x, mod), fposmod(y, mod), fposmod(z, mod))
  def posmodv(modv: Vector3): Vector3 =
    Vector3(fposmod(x, modv.x), fposmod(y, modv.y), fposmod(z, modv.z))
  def project(b: Vector3): Vector3 = b * (dot(b) / b.lengthSquared)

  /** Requires a normalized `n`. */
  def slide(n: Vector3): Vector3 = this - n * dot(n)

  /** Requires a normalized `n`. */
  def bounce(n: Vector3): Vector3 = -reflect(n)

  /** Requires a normalized `n`. */
  def reflect(n: Vector3): Vector3 = n * (2.0f * dot(n)) - this

  def sign: Vector3 =
    Vector3(GodotMath.sign(x), GodotMath.sign(y), GodotMath.sign(z))

  def octahedronEncode: Vector2 = {
    val n = this / (math.abs(x) + math.abs(y) + math.abs(z))
    var ox = n.x
    var oy = n.y
    if (n.z < 0.0f) {
      ox = (1.0f - math.abs(n.y)) * (if (n.x >= 0.0f) 1.0f else -1.0f)
      oy = (1.0f - math.abs(n.x)) * (if (n.y >= 0.0f) 1.0f else -1.0f)
    }
    Vector2(ox * 0.5f + 0.5f, oy * 0.5f + 0.5f)
  }

  def min(o: Vector3): Vector3 =
    Vector3(
      if (x < o.x) x else o.x,
      if (y < o.y) y else o.y,
      if (z < o.z) z else o.z
    )
  def minf(o: Float): Vector3 =
    Vector3(if (x < o) x else o, if (y < o) y else o, if (z < o) z else o)
  def max(o: Vector3): Vector3 =
    Vector3(
      if (x > o.x) x else o.x,
      if (y > o.y) y else o.y,
      if (z > o.z) z else o.z
    )
  def maxf(o: Float): Vector3 =
    Vector3(if (x > o) x else o, if (y > o) y else o, if (z > o) z else o)

  /** A unit vector perpendicular to this one (C++ `get_any_perpendicular`). */
  def anyPerpendicular: Vector3 =
    cross(
      if (math.abs(x) <= math.abs(y) && math.abs(x) <= math.abs(z))
        Vector3(1f, 0f, 0f)
      else Vector3(0f, 1f, 0f)
    ).normalized
}

object Vector3 {
  val ZERO: Vector3 = Vector3(0f, 0f, 0f)
  val ONE: Vector3 = Vector3(1f, 1f, 1f)
  val INF: Vector3 =
    Vector3(
      Float.PositiveInfinity,
      Float.PositiveInfinity,
      Float.PositiveInfinity
    )
  val LEFT: Vector3 = Vector3(-1f, 0f, 0f)
  val RIGHT: Vector3 = Vector3(1f, 0f, 0f)
  val UP: Vector3 = Vector3(0f, 1f, 0f)
  val DOWN: Vector3 = Vector3(0f, -1f, 0f)
  val FORWARD: Vector3 = Vector3(0f, 0f, -1f)
  val BACK: Vector3 = Vector3(0f, 0f, 1f)
  val MODEL_LEFT: Vector3 = Vector3(1f, 0f, 0f)
  val MODEL_RIGHT: Vector3 = Vector3(-1f, 0f, 0f)
  val MODEL_TOP: Vector3 = Vector3(0f, 1f, 0f)
  val MODEL_BOTTOM: Vector3 = Vector3(0f, -1f, 0f)
  val MODEL_FRONT: Vector3 = Vector3(0f, 0f, 1f)
  val MODEL_REAR: Vector3 = Vector3(0f, 0f, -1f)

  @deprecated("use Vector3.ZERO", "0.1.9")
  def zero: Vector3 = ZERO

  def apply(): Vector3 = ZERO
  def apply(v: Vector3i): Vector3 =
    Vector3(v.x.toFloat, v.y.toFloat, v.z.toFloat)

  def octahedronDecode(uv: Vector2): Vector3 = {
    val fx = uv.x * 2.0f - 1.0f
    val fy = uv.y * 2.0f - 1.0f
    var nx = fx
    var ny = fy
    val nz = 1.0f - math.abs(fx) - math.abs(fy)
    val t = GodotMath.clamp(-nz, 0.0f, 1.0f)
    nx += (if (nx >= 0f) -t else t)
    ny += (if (ny >= 0f) -t else t)
    Vector3(nx, ny, nz).normalized
  }

  private[gdext] inline def writeType(
    v: Vector3,
    p: GDExtensionTypePtr
  ): Unit = {
    val f = p.asInstanceOf[Ptr[CFloat]]
    f(0) = v.x; f(1) = v.y; f(2) = v.z
  }

  private[gdext] inline def readType(p: GDExtensionTypePtr): Vector3 = {
    val f = p.asInstanceOf[Ptr[CFloat]]
    Vector3(f(0), f(1), f(2))
  }

  given ToVariant[Vector3] = (value, dest) => {
    val buf = stackalloc[Byte](BuiltinSizes.Vector3.toCSize)
    writeType(value, buf)
    VariantConstructors.fromType(GDEXTENSION_VARIANT_TYPE_VECTOR3)(dest, buf)
  }

  given FromVariant[Vector3] = variant => {
    val buf = stackalloc[Byte](BuiltinSizes.Vector3.toCSize)
    VariantConstructors.toType(GDEXTENSION_VARIANT_TYPE_VECTOR3)(buf, variant)
    readType(buf)
  }
}
