package gdext.builtin

import scala.scalanative.annotation.alwaysinline
import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import gdext.internal.ffi.types.*
import gdext.internal.ffi.types.GDExtensionVariantType.*
import GodotMath.*

/** Godot's `Quaternion`: a rotation as `(x, y, z, w)` (16 bytes). */
final case class Quaternion(x: Float, y: Float, z: Float, w: Float) {
  @alwaysinline def +(o: Quaternion): Quaternion =
    Quaternion(x + o.x, y + o.y, z + o.z, w + o.w)
  @alwaysinline def -(o: Quaternion): Quaternion =
    Quaternion(x - o.x, y - o.y, z - o.z, w - o.w)
  @alwaysinline def *(s: Float): Quaternion =
    Quaternion(x * s, y * s, z * s, w * s)
  @alwaysinline def /(s: Float): Quaternion = this * (1.0f / s)
  @alwaysinline def unary_- : Quaternion = Quaternion(-x, -y, -z, -w)
  @alwaysinline def unary_+ : Quaternion = this

  def *(q: Quaternion): Quaternion =
    Quaternion(
      w * q.x + x * q.w + y * q.z - z * q.y,
      w * q.y + y * q.w + z * q.x - x * q.z,
      w * q.z + z * q.w + x * q.y - y * q.x,
      w * q.w - x * q.x - y * q.y - z * q.z
    )

  /** Rotate `v` (assumes a normalized quaternion). */
  def xform(v: Vector3): Vector3 = {
    val u = Vector3(x, y, z)
    val uv = u.cross(v)
    v + ((uv * w) + u.cross(uv)) * 2f
  }

  def xformInv(v: Vector3): Vector3 = inverse.xform(v)

  @alwaysinline def *(v: Vector3): Vector3 = xform(v)

  @alwaysinline def dot(o: Quaternion): Float =
    x * o.x + y * o.y + z * o.z + w * o.w
  @alwaysinline def lengthSquared: Float = dot(this)
  def length: Float = sqrt(lengthSquared)
  def normalized: Quaternion = this / length
  def isNormalized: Boolean =
    GodotMath.isEqualApprox(lengthSquared, 1f, UnitEpsilon)

  def isEqualApprox(to: Quaternion): Boolean =
    GodotMath.isEqualApprox(x, to.x) && GodotMath.isEqualApprox(y, to.y) &&
      GodotMath.isEqualApprox(z, to.z) && GodotMath.isEqualApprox(w, to.w)
  def isFinite: Boolean =
    GodotMath.isFinite(x) && GodotMath.isFinite(y) && GodotMath.isFinite(z) &&
      GodotMath.isFinite(w)

  def inverse: Quaternion = Quaternion(-x, -y, -z, w)

  def log: Quaternion = {
    val v = getAxis * getAngle
    Quaternion(v.x, v.y, v.z, 0f)
  }

  def exp: Quaternion = {
    val v = Vector3(x, y, z)
    val theta = v.length
    val n = v.normalized
    if (theta < CmpEpsilon || !n.isNormalized) Quaternion(0f, 0f, 0f, 1f)
    else Quaternion(n, theta)
  }

  def angleTo(to: Quaternion): Float = {
    val d = dot(to)
    acos(GodotMath.clamp(d * d * 2f - 1f, -1f, 1f))
  }

  def slerp(to: Quaternion, weight: Float): Quaternion = {
    var cosom = dot(to)
    val to1 = if (cosom < 0.0f) { cosom = -cosom; -to }
    else to
    var scale0 = 1.0f - weight
    var scale1 = weight
    if (1.0f - cosom > CmpEpsilon) {
      val omega = acos(cosom)
      val sinom = sin(omega)
      scale0 = (math.sin((1.0 - weight) * omega) / sinom).toFloat
      scale1 = sin(weight * omega) / sinom
    }
    Quaternion(
      scale0 * x + scale1 * to1.x,
      scale0 * y + scale1 * to1.y,
      scale0 * z + scale1 * to1.z,
      scale0 * w + scale1 * to1.w
    )
  }

  def slerpni(to: Quaternion, weight: Float): Quaternion = {
    val d = dot(to)
    if (math.abs(d) > 0.9999f) this
    else {
      val theta = acos(d)
      val sinT = 1.0f / sin(theta)
      val newFactor = sin(weight * theta) * sinT
      val invFactor = sin((1.0f - weight) * theta) * sinT
      Quaternion(
        invFactor * x + newFactor * to.x,
        invFactor * y + newFactor * to.y,
        invFactor * z + newFactor * to.z,
        invFactor * w + newFactor * to.w
      )
    }
  }

  def sphericalCubicInterpolate(
    b: Quaternion,
    preA: Quaternion,
    postB: Quaternion,
    weight: Float
  ): Quaternion =
    sphericalCubic(
      b,
      preA,
      postB,
      weight,
      (f, t, p, q) => cubicInterpolate(f, t, p, q, weight)
    )

  def sphericalCubicInterpolateInTime(
    b: Quaternion,
    preA: Quaternion,
    postB: Quaternion,
    weight: Float,
    bT: Float,
    preAT: Float,
    postBT: Float
  ): Quaternion =
    sphericalCubic(
      b,
      preA,
      postB,
      weight,
      (f, t, p, q) =>
        cubicInterpolateInTime(f, t, p, q, weight, bT, preAT, postBT)
    )

  private def sphericalCubic(
    b: Quaternion,
    preA: Quaternion,
    postB: Quaternion,
    weight: Float,
    interp: (Float, Float, Float, Float) => Float
  ): Quaternion = {
    def signbit(f: Float): Boolean =
      (java.lang.Float.floatToRawIntBits(f) & 0x80000000) != 0
    val fromQ = Basis(this).getRotationQuaternion
    var preQ = Basis(preA).getRotationQuaternion
    var toQ = Basis(b).getRotationQuaternion
    var postQ = Basis(postB).getRotationQuaternion
    // Flip quaternions to the shortest path if necessary.
    if (signbit(fromQ.dot(preQ))) preQ = -preQ
    val flip2 = signbit(fromQ.dot(toQ))
    if (flip2) toQ = -toQ
    val flip3 = if (flip2) toQ.dot(postQ) <= 0f else signbit(toQ.dot(postQ))
    if (flip3) postQ = -postQ

    // Exponential map in fromQ space.
    var lnFrom = Quaternion(0f, 0f, 0f, 0f)
    var lnTo = (fromQ.inverse * toQ).log
    var lnPre = (fromQ.inverse * preQ).log
    var lnPost = (fromQ.inverse * postQ).log
    var ln = Quaternion(
      interp(lnFrom.x, lnTo.x, lnPre.x, lnPost.x),
      interp(lnFrom.y, lnTo.y, lnPre.y, lnPost.y),
      interp(lnFrom.z, lnTo.z, lnPre.z, lnPost.z),
      0f
    )
    val q1 = fromQ * ln.exp

    // Exponential map in toQ space.
    lnFrom = (toQ.inverse * fromQ).log
    lnTo = Quaternion(0f, 0f, 0f, 0f)
    lnPre = (toQ.inverse * preQ).log
    lnPost = (toQ.inverse * postQ).log
    ln = Quaternion(
      interp(lnFrom.x, lnTo.x, lnPre.x, lnPost.x),
      interp(lnFrom.y, lnTo.y, lnPre.y, lnPost.y),
      interp(lnFrom.z, lnTo.z, lnPre.z, lnPost.z),
      0f
    )
    val q2 = toQ * ln.exp

    // Blend to cancel the error from the exponential map's ambiguity.
    q1.slerp(q2, weight)
  }

  def getEuler(order: Long = 2L): Vector3 = Basis(this).getEuler(order)

  def getAxis: Vector3 =
    if (math.abs(w) > 1f - CmpEpsilon) Vector3(x, y, z)
    else {
      val r = 1f / sqrt(1f - w * w)
      Vector3(x * r, y * r, z * r)
    }

  def getAngle: Float = 2f * acos(w)
}

object Quaternion {
  val IDENTITY: Quaternion = Quaternion(0f, 0f, 0f, 1f)

  def apply(): Quaternion = IDENTITY

  /** Rotation of `angle` radians around `axis` (normalized internally). */
  def apply(axis: Vector3, angle: Float): Quaternion = {
    val d = axis.length
    if (d == 0f) Quaternion(0f, 0f, 0f, 0f)
    else {
      val s = sin(angle * 0.5f) / d
      Quaternion(axis.x * s, axis.y * s, axis.z * s, cos(angle * 0.5f))
    }
  }

  /** The shortest arc rotating `arcFrom` onto `arcTo`. */
  def apply(arcFrom: Vector3, arcTo: Vector3): Quaternion = {
    val n0 = arcFrom.normalized
    val n1 = arcTo.normalized
    val d = n0.dot(n1)
    if (math.abs(d) > 1.0f - CmpEpsilon) {
      if (d >= 0f) IDENTITY
      else { val a = n0.anyPerpendicular; Quaternion(a.x, a.y, a.z, 0f) }
    } else {
      val c = n0.cross(n1)
      val s = sqrt((1.0f + d) * 2.0f)
      val rs = 1.0f / s
      Quaternion(c.x * rs, c.y * rs, c.z * rs, s * 0.5f)
    }
  }

  /** The rotation of a pure-rotation basis. */
  def apply(b: Basis): Quaternion = b.getQuaternion

  /** From YXZ Euler angles. */
  def fromEuler(euler: Vector3): Quaternion = {
    val halfA1 = euler.y * 0.5f
    val halfA2 = euler.x * 0.5f
    val halfA3 = euler.z * 0.5f
    val cosA1 = cos(halfA1); val sinA1 = sin(halfA1)
    val cosA2 = cos(halfA2); val sinA2 = sin(halfA2)
    val cosA3 = cos(halfA3); val sinA3 = sin(halfA3)
    Quaternion(
      sinA1 * cosA2 * sinA3 + cosA1 * sinA2 * cosA3,
      sinA1 * cosA2 * cosA3 - cosA1 * sinA2 * sinA3,
      -sinA1 * sinA2 * cosA3 + cosA1 * cosA2 * sinA3,
      sinA1 * sinA2 * sinA3 + cosA1 * cosA2 * cosA3
    )
  }

  private[gdext] inline def writeType(
    q: Quaternion,
    p: GDExtensionTypePtr
  ): Unit = {
    val f = p.asInstanceOf[Ptr[CFloat]]
    f(0) = q.x; f(1) = q.y; f(2) = q.z; f(3) = q.w
  }

  private[gdext] inline def readType(p: GDExtensionTypePtr): Quaternion = {
    val f = p.asInstanceOf[Ptr[CFloat]]
    Quaternion(f(0), f(1), f(2), f(3))
  }

  given ToVariant[Quaternion] = (value, dest) => {
    val buf = stackalloc[Byte](BuiltinSizes.Quaternion.toCSize)
    writeType(value, buf)
    VariantConstructors.fromType(GDEXTENSION_VARIANT_TYPE_QUATERNION)(dest, buf)
  }

  given FromVariant[Quaternion] = variant => {
    val buf = stackalloc[Byte](BuiltinSizes.Quaternion.toCSize)
    VariantConstructors.toType(GDEXTENSION_VARIANT_TYPE_QUATERNION)(
      buf,
      variant
    )
    readType(buf)
  }
}
