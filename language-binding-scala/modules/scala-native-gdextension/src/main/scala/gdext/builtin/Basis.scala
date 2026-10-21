package gdext.builtin

// format: off — matrix literals keep their row/column grid, for review against
// Godot's core/math sources.

import scala.scalanative.annotation.alwaysinline
import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import gdext.internal.ffi.types.*
import gdext.internal.ffi.types.GDExtensionVariantType.*
import GodotMath.*

/**
 * Godot's `Basis`: a 3x3 matrix, stored flat so one value is one object.
 *
 * Fields are named by column, as in GDScript: column `x` is
 * `(xx, xy, xz)`, `y` is `(yx, yy, yz)`, `z` is `(zx, zy, zz)`. The engine
 * stores rows, so row 0 is `(xx, yx, zx)`. Euler `order` values follow
 * Godot's `EulerOrder` (0 XYZ, 1 XZY, 2 YXZ, 3 YZX, 4 ZXY, 5 ZYX).
 */
final case class Basis(
  xx: Float, xy: Float, xz: Float,
  yx: Float, yy: Float, yz: Float,
  zx: Float, zy: Float, zz: Float
) {
  // Row-major element access, mirroring `rows[r][c]` in Godot's basis.cpp.
  @alwaysinline private def m00 = xx
  @alwaysinline private def m01 = yx
  @alwaysinline private def m02 = zx
  @alwaysinline private def m10 = xy
  @alwaysinline private def m11 = yy
  @alwaysinline private def m12 = zy
  @alwaysinline private def m20 = xz
  @alwaysinline private def m21 = yz
  @alwaysinline private def m22 = zz

  /** Column `x` (the basis' X axis). */
  def x: Vector3 = Vector3(xx, xy, xz)
  /** Column `y` (the basis' Y axis). */
  def y: Vector3 = Vector3(yx, yy, yz)
  /** Column `z` (the basis' Z axis). */
  def z: Vector3 = Vector3(zx, zy, zz)
  def column(i: Int): Vector3 = if (i == 0) x else if (i == 1) y else z
  def row(i: Int): Vector3 =
    if (i == 0) Vector3(m00, m01, m02)
    else if (i == 1) Vector3(m10, m11, m12)
    else Vector3(m20, m21, m22)

  @alwaysinline def xform(v: Vector3): Vector3 =
    Vector3(
      m00 * v.x + m01 * v.y + m02 * v.z,
      m10 * v.x + m11 * v.y + m12 * v.z,
      m20 * v.x + m21 * v.y + m22 * v.z
    )

  @alwaysinline def xformInv(v: Vector3): Vector3 =
    Vector3(
      m00 * v.x + m10 * v.y + m20 * v.z,
      m01 * v.x + m11 * v.y + m21 * v.z,
      m02 * v.x + m12 * v.y + m22 * v.z
    )

  @alwaysinline def *(v: Vector3): Vector3 = xform(v)

  /** Composition: `o` first, then this. */
  @alwaysinline def *(o: Basis): Basis =
    Basis(
      xx * o.xx + yx * o.xy + zx * o.xz,
      xy * o.xx + yy * o.xy + zy * o.xz,
      xz * o.xx + yz * o.xy + zz * o.xz,
      xx * o.yx + yx * o.yy + zx * o.yz,
      xy * o.yx + yy * o.yy + zy * o.yz,
      xz * o.yx + yz * o.yy + zz * o.yz,
      xx * o.zx + yx * o.zy + zx * o.zz,
      xy * o.zx + yy * o.zy + zy * o.zz,
      xz * o.zx + yz * o.zy + zz * o.zz
    )

  def *(s: Float): Basis = Basis(xx * s, xy * s, xz * s, yx * s, yy * s, yz * s, zx * s, zy * s, zz * s)
  def /(s: Float): Basis = Basis(xx / s, xy / s, xz / s, yx / s, yy / s, yz / s, zx / s, zy / s, zz / s)

  @alwaysinline private def tdotx(a: Float, b: Float, c: Float): Float = m00 * a + m10 * b + m20 * c
  @alwaysinline private def tdoty(a: Float, b: Float, c: Float): Float = m01 * a + m11 * b + m21 * c
  @alwaysinline private def tdotz(a: Float, b: Float, c: Float): Float = m02 * a + m12 * b + m22 * c

  /** Column `x` dotted with `v`. */
  def tdotx(v: Vector3): Float = tdotx(v.x, v.y, v.z)
  /** Column `y` dotted with `v`. */
  def tdoty(v: Vector3): Float = tdoty(v.x, v.y, v.z)
  /** Column `z` dotted with `v`. */
  def tdotz(v: Vector3): Float = tdotz(v.x, v.y, v.z)

  def determinant: Float =
    m00 * (m11 * m22 - m21 * m12) - m10 * (m01 * m22 - m21 * m02) +
      m20 * (m01 * m12 - m11 * m02)

  def inverse: Basis = {
    def cofac(r1: Int, c1: Int, r2: Int, c2: Int): Float = el(r1, c1) * el(r2, c2) - el(r1, c2) * el(r2, c1)
    val co0 = cofac(1, 1, 2, 2)
    val co1 = cofac(1, 2, 2, 0)
    val co2 = cofac(1, 0, 2, 1)
    val det = m00 * co0 + m01 * co1 + m02 * co2
    if (det == 0f) throw new ArithmeticException("Basis.inverse: determinant is zero")
    val s = 1.0f / det
    Basis.rows(
      co0 * s, cofac(0, 2, 2, 1) * s, cofac(0, 1, 1, 2) * s,
      co1 * s, cofac(0, 0, 2, 2) * s, cofac(0, 2, 1, 0) * s,
      co2 * s, cofac(0, 1, 2, 0) * s, cofac(0, 0, 1, 1) * s
    )
  }

  /** Element at row `r`, column `c`. */
  def el(r: Int, c: Int): Float = (r * 3 + c) match {
    case 0 => m00
    case 1 => m01
    case 2 => m02
    case 3 => m10
    case 4 => m11
    case 5 => m12
    case 6 => m20
    case 7 => m21
    case _ => m22
  }

  def transposed: Basis = Basis.rows(m00, m10, m20, m01, m11, m21, m02, m12, m22)

  def orthonormalized: Basis = {
    val nx = x.normalized
    val ny = (y - nx * nx.dot(y)).normalized
    val nz = (z - nx * nx.dot(z) - ny * ny.dot(z)).normalized
    Basis(nx, ny, nz)
  }

  /** Rotate around a normalized `axis` (left-multiplies the rotation). */
  def rotated(axis: Vector3, angle: Float): Basis = Basis(axis, angle) * this

  /** Scale rows: the global-space scale. */
  def scaled(scale: Vector3): Basis =
    Basis.rows(
      m00 * scale.x, m01 * scale.x, m02 * scale.x,
      m10 * scale.y, m11 * scale.y, m12 * scale.y,
      m20 * scale.z, m21 * scale.z, m22 * scale.z
    )

  /** Scale columns: the local-space scale. */
  def scaledLocal(scale: Vector3): Basis = this * Basis.fromScale(scale)

  def getScale: Vector3 = {
    val detSign = sign(determinant)
    Vector3(x.length, y.length, z.length) * detSign
  }

  def getEuler(order: Long = 2L): Vector3 = {
    val epsilon = 0.00000025f
    order match {
      case 0L => // XYZ
        val sy = m02
        if (sy < 1.0f - epsilon) {
          if (sy > -(1.0f - epsilon)) {
            if (m10 == 0f && m01 == 0f && m12 == 0f && m21 == 0f && m11 == 1f)
              Vector3(0f, atan2(m02, m00), 0f)
            else Vector3(atan2(-m12, m22), asin(sy), atan2(-m01, m00))
          } else Vector3(atan2(m21, m11), -Pi / 2.0f, 0f)
        } else Vector3(atan2(m21, m11), Pi / 2.0f, 0f)
      case 1L => // XZY
        val sz = m01
        if (sz < 1.0f - epsilon) {
          if (sz > -(1.0f - epsilon)) Vector3(atan2(m21, m11), atan2(m02, m00), asin(-sz))
          else Vector3(-atan2(m12, m22), 0f, Pi / 2.0f)
        } else Vector3(-atan2(m12, m22), 0f, -Pi / 2.0f)
      case 2L => // YXZ
        val m12v = m12
        if (m12v < 1.0f - epsilon) {
          if (m12v > -(1.0f - epsilon)) {
            if (m10 == 0f && m01 == 0f && m02 == 0f && m20 == 0f && m00 == 1f)
              Vector3(atan2(-m12v, m11), 0f, 0f)
            else Vector3(asin(-m12v), atan2(m02, m22), atan2(m10, m11))
          } else Vector3(Pi * 0.5f, atan2(m01, m00), 0f)
        } else Vector3(-Pi * 0.5f, -atan2(m01, m00), 0f)
      case 3L => // YZX
        val sz = m10
        if (sz < 1.0f - epsilon) {
          if (sz > -(1.0f - epsilon)) Vector3(atan2(-m12, m11), atan2(-m20, m00), asin(sz))
          else Vector3(atan2(m21, m22), 0f, -Pi / 2.0f)
        } else Vector3(atan2(m21, m22), 0f, Pi / 2.0f)
      case 4L => // ZXY
        val sx = m21
        if (sx < 1.0f - epsilon) {
          if (sx > -(1.0f - epsilon)) Vector3(asin(sx), atan2(-m20, m22), atan2(-m01, m11))
          else Vector3(-Pi / 2.0f, atan2(m02, m00), 0f)
        } else Vector3(Pi / 2.0f, atan2(m02, m00), 0f)
      case 5L => // ZYX
        val sy = m20
        if (sy < 1.0f - epsilon) {
          if (sy > -(1.0f - epsilon)) Vector3(atan2(m21, m22), asin(-sy), atan2(m10, m00))
          else Vector3(0f, Pi / 2.0f, -atan2(m01, m11))
        } else Vector3(0f, -Pi / 2.0f, -atan2(m01, m11))
      case _ => throw new IllegalArgumentException(s"invalid Euler order $order")
    }
  }

  def slerp(to: Basis, weight: Float): Basis = {
    val b = Basis(getQuaternion.slerp(to.getQuaternion, weight))
    val s0 = GodotMath.lerp(row(0).length, to.row(0).length, weight)
    val s1 = GodotMath.lerp(row(1).length, to.row(1).length, weight)
    val s2 = GodotMath.lerp(row(2).length, to.row(2).length, weight)
    b.scaled(Vector3(s0, s1, s2))
  }

  def isConformal: Boolean = {
    val xLenSq = x.lengthSquared
    GodotMath.isEqualApprox(xLenSq, y.lengthSquared) &&
    GodotMath.isEqualApprox(xLenSq, z.lengthSquared) &&
    isZeroApprox(x.dot(y)) && isZeroApprox(x.dot(z)) && isZeroApprox(y.dot(z))
  }

  def isEqualApprox(b: Basis): Boolean =
    x.isEqualApprox(b.x) && y.isEqualApprox(b.y) && z.isEqualApprox(b.z)

  def isFinite: Boolean = x.isFinite && y.isFinite && z.isFinite

  /** The rotation as a quaternion; assumes this basis is a pure rotation. */
  def getQuaternion: Quaternion = {
    val trace = m00 + m11 + m22
    if (trace > 0.0f) {
      var s = sqrt(trace + 1.0f)
      val w = s * 0.5f
      s = 0.5f / s
      Quaternion((m21 - m12) * s, (m02 - m20) * s, (m10 - m01) * s, w)
    } else {
      val i =
        if (m00 < m11) { if (m11 < m22) 2 else 1 }
        else { if (m00 < m22) 2 else 0 }
      val j = (i + 1) % 3
      val k = (i + 2) % 3
      var s = sqrt(el(i, i) - el(j, j) - el(k, k) + 1.0f)
      val t = new Array[Float](4)
      t(i) = s * 0.5f
      s = 0.5f / s
      t(3) = (el(k, j) - el(j, k)) * s
      t(j) = (el(j, i) + el(i, j)) * s
      t(k) = (el(k, i) + el(i, k)) * s
      Quaternion(t(0), t(1), t(2), t(3))
    }
  }

  /** The rotation part, with any scale and reflection removed. */
  def getRotationQuaternion: Quaternion = {
    val m = orthonormalized
    val proper = if (m.determinant < 0f) m.scaled(Vector3(-1f, -1f, -1f)) else m
    proper.getQuaternion
  }
}

object Basis {
  val IDENTITY: Basis = Basis(1f, 0f, 0f, 0f, 1f, 0f, 0f, 0f, 1f)
  val FLIP_X: Basis = Basis(-1f, 0f, 0f, 0f, 1f, 0f, 0f, 0f, 1f)
  val FLIP_Y: Basis = Basis(1f, 0f, 0f, 0f, -1f, 0f, 0f, 0f, 1f)
  val FLIP_Z: Basis = Basis(1f, 0f, 0f, 0f, 1f, 0f, 0f, 0f, -1f)

  @deprecated("use Basis.IDENTITY", "0.1.9")
  def identity: Basis = IDENTITY

  def apply(): Basis = IDENTITY

  /** The basis with columns (axes) `x`, `y`, `z`. */
  def apply(x: Vector3, y: Vector3, z: Vector3): Basis =
    Basis(x.x, x.y, x.z, y.x, y.y, y.z, z.x, z.y, z.z)

  /** The basis with rows `r0`, `r1`, `r2` (the engine's storage order). */
  def fromRows(r0: Vector3, r1: Vector3, r2: Vector3): Basis =
    rows(r0.x, r0.y, r0.z, r1.x, r1.y, r1.z, r2.x, r2.y, r2.z)

  /** Row-major element constructor, as Godot's `Basis(9 floats)`. */
  def rows(
    a00: Float, a01: Float, a02: Float,
    a10: Float, a11: Float, a12: Float,
    a20: Float, a21: Float, a22: Float
  ): Basis = Basis(a00, a10, a20, a01, a11, a21, a02, a12, a22)

  /** Rotation of `angle` radians around a normalized `axis`. */
  def apply(axis: Vector3, angle: Float): Basis = {
    val axisSq = Vector3(axis.x * axis.x, axis.y * axis.y, axis.z * axis.z)
    val cosine = cos(angle)
    val sine = sin(angle)
    val t = 1f - cosine
    val xyzt1 = axis.x * axis.y * t
    val zyxs1 = axis.z * sine
    val xyzt2 = axis.x * axis.z * t
    val zyxs2 = axis.y * sine
    val xyzt3 = axis.y * axis.z * t
    val zyxs3 = axis.x * sine
    rows(
      axisSq.x + cosine * (1.0f - axisSq.x), xyzt1 - zyxs1, xyzt2 + zyxs2,
      xyzt1 + zyxs1, axisSq.y + cosine * (1.0f - axisSq.y), xyzt3 - zyxs3,
      xyzt2 - zyxs2, xyzt3 + zyxs3, axisSq.z + cosine * (1.0f - axisSq.z)
    )
  }

  /** The rotation `q` (need not be normalized). */
  def apply(q: Quaternion): Basis = {
    val d = q.lengthSquared
    val s = 2.0f / d
    val xs = q.x * s; val ys = q.y * s; val zs = q.z * s
    val wx = q.w * xs; val wy = q.w * ys; val wz = q.w * zs
    val xx = q.x * xs; val xy = q.x * ys; val xz = q.x * zs
    val yy = q.y * ys; val yz = q.y * zs; val zz = q.z * zs
    rows(
      1.0f - (yy + zz), xy - wz, xz + wy,
      xy + wz, 1.0f - (xx + zz), yz - wx,
      xz - wy, yz + wx, 1.0f - (xx + yy)
    )
  }

  def fromScale(scale: Vector3): Basis =
    rows(scale.x, 0f, 0f, 0f, scale.y, 0f, 0f, 0f, scale.z)

  def fromEuler(euler: Vector3, order: Long = 2L): Basis = {
    var c = cos(euler.x); var s = sin(euler.x)
    val xmat = rows(1f, 0f, 0f, 0f, c, -s, 0f, s, c)
    c = cos(euler.y); s = sin(euler.y)
    val ymat = rows(c, 0f, s, 0f, 1f, 0f, -s, 0f, c)
    c = cos(euler.z); s = sin(euler.z)
    val zmat = rows(c, -s, 0f, s, c, 0f, 0f, 0f, 1f)
    order match {
      case 0L => xmat * (ymat * zmat)
      case 1L => xmat * zmat * ymat
      case 2L => ymat * xmat * zmat
      case 3L => ymat * zmat * xmat
      case 4L => zmat * xmat * ymat
      case 5L => zmat * ymat * xmat
      case _  => throw new IllegalArgumentException(s"invalid Euler order $order")
    }
  }

  /**
   * A basis whose -Z (or +Z with `useModelFront`) points at `target`, with
   * +Y as close to `up` as possible.
   */
  def lookingAt(
    target: Vector3,
    up: Vector3 = Vector3(0f, 1f, 0f),
    useModelFront: Boolean = false
  ): Basis = {
    val z0 = target.normalized
    val z = if (useModelFront) z0 else -z0
    var x = up.cross(z)
    if (x.isZeroApprox) x = up.anyPerpendicular
    x = x.normalized
    val y = z.cross(x)
    Basis(x, y, z)
  }

  private[gdext] inline def writeType(b: Basis, p: GDExtensionTypePtr): Unit = {
    val f = p.asInstanceOf[Ptr[CFloat]]
    f(0) = b.xx; f(1) = b.yx; f(2) = b.zx
    f(3) = b.xy; f(4) = b.yy; f(5) = b.zy
    f(6) = b.xz; f(7) = b.yz; f(8) = b.zz
  }

  private[gdext] inline def readType(p: GDExtensionTypePtr): Basis = {
    val f = p.asInstanceOf[Ptr[CFloat]]
    rows(f(0), f(1), f(2), f(3), f(4), f(5), f(6), f(7), f(8))
  }

  given ToVariant[Basis] = (value, dest) => {
    val buf = stackalloc[Byte](BuiltinSizes.Basis.toCSize)
    writeType(value, buf)
    VariantConstructors.fromType(GDEXTENSION_VARIANT_TYPE_BASIS)(dest, buf)
  }

  given FromVariant[Basis] = variant => {
    val buf = stackalloc[Byte](BuiltinSizes.Basis.toCSize)
    VariantConstructors.toType(GDEXTENSION_VARIANT_TYPE_BASIS)(buf, variant)
    readType(buf)
  }
}
