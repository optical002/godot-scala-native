package gdext.builtin

// format: off — matrix literals keep their row/column grid, for review against
// Godot's core/math sources.

import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import gdext.internal.ffi.types.*
import gdext.internal.ffi.types.GDExtensionVariantType.*
import GodotMath.*

/**
 * Godot's `Projection`: a 4x4 matrix of columns `x, y, z, w` (each a
 * [[Vector4]]), stored flat (16 floats) so one value is one object. Field
 * `xy` is column x, component y. Plane indices for [[getProjectionPlane]]:
 * 0 near, 1 far, 2 left, 3 top, 4 right, 5 bottom.
 */
final case class Projection(
  xx: Float, xy: Float, xz: Float, xw: Float,
  yx: Float, yy: Float, yz: Float, yw: Float,
  zx: Float, zy: Float, zz: Float, zw: Float,
  wx: Float, wy: Float, wz: Float, ww: Float
) {
  def x: Vector4 = Vector4(xx, xy, xz, xw)
  def y: Vector4 = Vector4(yx, yy, yz, yw)
  def z: Vector4 = Vector4(zx, zy, zz, zw)
  def w: Vector4 = Vector4(wx, wy, wz, ww)

  /** The 16 elements in column-major order, as C++ `&columns[0][0]`. */
  def toArray: Array[Float] =
    Array(xx, xy, xz, xw, yx, yy, yz, yw, zx, zy, zz, zw, wx, wy, wz, ww)

  /** Element `columns[c][r]`. */
  def el(c: Int, r: Int): Float = (c * 4 + r) match {
    case 0  => xx; case 1  => xy; case 2  => xz; case 3  => xw
    case 4  => yx; case 5  => yy; case 6  => yz; case 7  => yw
    case 8  => zx; case 9  => zy; case 10 => zz; case 11 => zw
    case 12 => wx; case 13 => wy; case 14 => wz; case _  => ww
  }

  def xform(v: Vector4): Vector4 =
    Vector4(
      xx * v.x + yx * v.y + zx * v.z + wx * v.w,
      xy * v.x + yy * v.y + zy * v.z + wy * v.w,
      xz * v.x + yz * v.y + zz * v.z + wz * v.w,
      xw * v.x + yw * v.y + zw * v.z + ww * v.w
    )

  def xformInv(v: Vector4): Vector4 =
    Vector4(
      xx * v.x + xy * v.y + xz * v.z + xw * v.w,
      yx * v.x + yy * v.y + yz * v.z + yw * v.w,
      zx * v.x + zy * v.y + zz * v.z + zw * v.w,
      wx * v.x + wy * v.y + wz * v.z + ww * v.w
    )

  /** Project a point (homogeneous divide by w). */
  def xform(v: Vector3): Vector3 = {
    val rx = xx * v.x + yx * v.y + zx * v.z + wx
    val ry = xy * v.x + yy * v.y + zy * v.z + wy
    val rz = xz * v.x + yz * v.y + zz * v.z + wz
    val rw = xw * v.x + yw * v.y + zw * v.z + ww
    Vector3(rx / rw, ry / rw, rz / rw)
  }

  def *(v: Vector4): Vector4 = xform(v)

  def *(o: Projection): Projection = {
    val a = toArray
    val b = o.toArray
    val r = new Array[Float](16)
    var j = 0
    while (j < 4) {
      var i = 0
      while (i < 4) {
        var ab = 0f
        var k = 0
        while (k < 4) { ab += a(k * 4 + i) * b(j * 4 + k); k += 1 }
        r(j * 4 + i) = ab
        i += 1
      }
      j += 1
    }
    Projection.fromArray(r)
  }

  def determinant: Float = {
    val m = toArray
    def c(i: Int, j: Int) = m(i * 4 + j)
    c(0, 3) * c(1, 2) * c(2, 1) * c(3, 0) - c(0, 2) * c(1, 3) * c(2, 1) * c(3, 0) -
      c(0, 3) * c(1, 1) * c(2, 2) * c(3, 0) + c(0, 1) * c(1, 3) * c(2, 2) * c(3, 0) +
      c(0, 2) * c(1, 1) * c(2, 3) * c(3, 0) - c(0, 1) * c(1, 2) * c(2, 3) * c(3, 0) -
      c(0, 3) * c(1, 2) * c(2, 0) * c(3, 1) + c(0, 2) * c(1, 3) * c(2, 0) * c(3, 1) +
      c(0, 3) * c(1, 0) * c(2, 2) * c(3, 1) - c(0, 0) * c(1, 3) * c(2, 2) * c(3, 1) -
      c(0, 2) * c(1, 0) * c(2, 3) * c(3, 1) + c(0, 0) * c(1, 2) * c(2, 3) * c(3, 1) +
      c(0, 3) * c(1, 1) * c(2, 0) * c(3, 2) - c(0, 1) * c(1, 3) * c(2, 0) * c(3, 2) -
      c(0, 3) * c(1, 0) * c(2, 1) * c(3, 2) + c(0, 0) * c(1, 3) * c(2, 1) * c(3, 2) +
      c(0, 1) * c(1, 0) * c(2, 3) * c(3, 2) - c(0, 0) * c(1, 1) * c(2, 3) * c(3, 2) -
      c(0, 2) * c(1, 1) * c(2, 0) * c(3, 3) + c(0, 1) * c(1, 2) * c(2, 0) * c(3, 3) +
      c(0, 2) * c(1, 0) * c(2, 1) * c(3, 3) - c(0, 0) * c(1, 2) * c(2, 1) * c(3, 3) -
      c(0, 1) * c(1, 0) * c(2, 2) * c(3, 3) + c(0, 0) * c(1, 1) * c(2, 2) * c(3, 3)
  }

  def inverse: Projection = {
    val m = toArray
    val inv = new Array[Float](16)
    inv(0) = m(5) * m(10) * m(15) - m(5) * m(11) * m(14) - m(9) * m(6) * m(15) +
      m(9) * m(7) * m(14) + m(13) * m(6) * m(11) - m(13) * m(7) * m(10)
    inv(4) = -m(4) * m(10) * m(15) + m(4) * m(11) * m(14) + m(8) * m(6) * m(15) -
      m(8) * m(7) * m(14) - m(12) * m(6) * m(11) + m(12) * m(7) * m(10)
    inv(8) = m(4) * m(9) * m(15) - m(4) * m(11) * m(13) - m(8) * m(5) * m(15) +
      m(8) * m(7) * m(13) + m(12) * m(5) * m(11) - m(12) * m(7) * m(9)
    inv(12) = -m(4) * m(9) * m(14) + m(4) * m(10) * m(13) + m(8) * m(5) * m(14) -
      m(8) * m(6) * m(13) - m(12) * m(5) * m(10) + m(12) * m(6) * m(9)
    inv(1) = -m(1) * m(10) * m(15) + m(1) * m(11) * m(14) + m(9) * m(2) * m(15) -
      m(9) * m(3) * m(14) - m(13) * m(2) * m(11) + m(13) * m(3) * m(10)
    inv(5) = m(0) * m(10) * m(15) - m(0) * m(11) * m(14) - m(8) * m(2) * m(15) +
      m(8) * m(3) * m(14) + m(12) * m(2) * m(11) - m(12) * m(3) * m(10)
    inv(9) = -m(0) * m(9) * m(15) + m(0) * m(11) * m(13) + m(8) * m(1) * m(15) -
      m(8) * m(3) * m(13) - m(12) * m(1) * m(11) + m(12) * m(3) * m(9)
    inv(13) = m(0) * m(9) * m(14) - m(0) * m(10) * m(13) - m(8) * m(1) * m(14) +
      m(8) * m(2) * m(13) + m(12) * m(1) * m(10) - m(12) * m(2) * m(9)
    inv(2) = m(1) * m(6) * m(15) - m(1) * m(7) * m(14) - m(5) * m(2) * m(15) +
      m(5) * m(3) * m(14) + m(13) * m(2) * m(7) - m(13) * m(3) * m(6)
    inv(6) = -m(0) * m(6) * m(15) + m(0) * m(7) * m(14) + m(4) * m(2) * m(15) -
      m(4) * m(3) * m(14) - m(12) * m(2) * m(7) + m(12) * m(3) * m(6)
    inv(10) = m(0) * m(5) * m(15) - m(0) * m(7) * m(13) - m(4) * m(1) * m(15) +
      m(4) * m(3) * m(13) + m(12) * m(1) * m(7) - m(12) * m(3) * m(5)
    inv(14) = -m(0) * m(5) * m(14) + m(0) * m(6) * m(13) + m(4) * m(1) * m(14) -
      m(4) * m(2) * m(13) - m(12) * m(1) * m(6) + m(12) * m(2) * m(5)
    inv(3) = -m(1) * m(6) * m(11) + m(1) * m(7) * m(10) + m(5) * m(2) * m(11) -
      m(5) * m(3) * m(10) - m(9) * m(2) * m(7) + m(9) * m(3) * m(6)
    inv(7) = m(0) * m(6) * m(11) - m(0) * m(7) * m(10) - m(4) * m(2) * m(11) +
      m(4) * m(3) * m(10) + m(8) * m(2) * m(7) - m(8) * m(3) * m(6)
    inv(11) = -m(0) * m(5) * m(11) + m(0) * m(7) * m(9) + m(4) * m(1) * m(11) -
      m(4) * m(3) * m(9) - m(8) * m(1) * m(7) + m(8) * m(3) * m(5)
    inv(15) = m(0) * m(5) * m(10) - m(0) * m(6) * m(9) - m(4) * m(1) * m(10) +
      m(4) * m(2) * m(9) + m(8) * m(1) * m(6) - m(8) * m(2) * m(5)
    val det = m(0) * inv(0) + m(1) * inv(4) + m(2) * inv(8) + m(3) * inv(12)
    val s = 1.0f / det
    var i = 0
    while (i < 16) { inv(i) = inv(i) * s; i += 1 }
    Projection.fromArray(inv)
  }

  def perspectiveZnearAdjusted(newZnear: Float): Projection = {
    val zfar = getZFar
    val deltaZ = zfar - newZnear
    val m = toArray
    m(10) = -(zfar + newZnear) / deltaZ
    m(14) = -2 * newZnear * zfar / deltaZ
    Projection.fromArray(m)
  }

  def getProjectionPlane(plane: Long): Plane = {
    val m = toArray
    val p = plane match {
      case 0L => Plane(m(3) + m(2), m(7) + m(6), m(11) + m(10), m(15) + m(14))
      case 1L => Plane(m(3) - m(2), m(7) - m(6), m(11) - m(10), m(15) - m(14))
      case 2L => Plane(m(3) + m(0), m(7) + m(4), m(11) + m(8), m(15) + m(12))
      case 3L => Plane(m(3) - m(1), m(7) - m(5), m(11) - m(9), m(15) - m(13))
      case 4L => Plane(m(3) - m(0), m(7) - m(4), m(11) - m(8), m(15) - m(12))
      case 5L => Plane(m(3) + m(1), m(7) + m(5), m(11) + m(9), m(15) + m(13))
      case _  => throw new IllegalArgumentException(s"invalid projection plane $plane")
    }
    Plane(-p.normal, p.d).normalized
  }

  def flippedY: Projection =
    Projection(xx, xy, xz, xw, -yx, -yy, -yz, -yw, zx, zy, zz, zw, wx, wy, wz, ww)

  def jitterOffseted(offset: Vector2): Projection =
    Projection(xx, xy, xz, xw, yx, yy, yz, yw, zx, zy, zz, zw, wx + offset.x, wy + offset.y, wz, ww)

  def getZFar: Float = {
    val m = toArray
    val p = Plane(m(3) - m(2), m(7) - m(6), m(11) - m(10), m(15) - m(14))
    Plane(-p.normal, p.d).normalized.d
  }

  def getZNear: Float = {
    val m = toArray
    Plane(m(3) + m(2), m(7) + m(6), m(11) + m(10), -m(15) - m(14)).normalized.d
  }

  def getAspect: Float = {
    val he = getViewportHalfExtents
    he.x / he.y
  }

  def getFov: Float = {
    val m = toArray
    val right = Plane(m(3) - m(0), m(7) - m(4), m(11) - m(8), -m(15) + m(12)).normalized
    if (m(8) == 0f && m(9) == 0f)
      (radToDeg(math.acos(math.abs(right.normal.x).toDouble)) * 2.0).toFloat
    else {
      val left = Plane(m(3) + m(0), m(7) + m(4), m(11) + m(8), m(15) + m(12)).normalized
      (radToDeg(math.acos(math.abs(left.normal.x).toDouble)) +
        radToDeg(math.acos(math.abs(right.normal.x).toDouble))).toFloat
    }
  }

  def isOrthogonal: Boolean = zw == 0.0f

  def getViewportHalfExtents: Vector2 = {
    val m = toArray
    val near = Plane(m(3) + m(2), m(7) + m(6), m(11) + m(10), -m(15) - m(14)).normalized
    halfExtents(near, m)
  }

  def getFarPlaneHalfExtents: Vector2 = {
    val m = toArray
    val p = Plane(m(3) - m(2), m(7) - m(6), m(11) - m(10), m(15) - m(14))
    val far = Plane(-p.normal, p.d).normalized
    halfExtents(far, m)
  }

  private def halfExtents(plane: Plane, m: Array[Float]): Vector2 = {
    val right = Plane(m(3) - m(0), m(7) - m(4), m(11) - m(8), -m(15) + m(12)).normalized
    val top = Plane(m(3) - m(1), m(7) - m(5), m(11) - m(9), -m(15) + m(13)).normalized
    val res = plane.intersect3(right, top).getOrElse(Vector3.ZERO)
    Vector2(res.x, res.y)
  }

  def getPixelsPerMeter(forPixelWidth: Long): Long =
    (forPixelWidth / (getViewportHalfExtents.x * 2.0)).toInt.toLong

  def getLodMultiplier: Float =
    if (isOrthogonal) getViewportHalfExtents.x
    else {
      val zn = getZNear
      val width = getViewportHalfExtents.x * 2.0f
      1.0f / (zn / width)
    }
}

object Projection {
  val IDENTITY: Projection =
    Projection(1f, 0f, 0f, 0f, 0f, 1f, 0f, 0f, 0f, 0f, 1f, 0f, 0f, 0f, 0f, 1f)
  val ZERO: Projection =
    Projection(0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f)

  def apply(): Projection = IDENTITY

  def apply(x: Vector4, y: Vector4, z: Vector4, w: Vector4): Projection =
    Projection(x.x, x.y, x.z, x.w, y.x, y.y, y.z, y.w, z.x, z.y, z.z, z.w, w.x, w.y, w.z, w.w)

  def apply(t: Transform3D): Projection =
    Projection(
      t.xx, t.xy, t.xz, 0f,
      t.yx, t.yy, t.yz, 0f,
      t.zx, t.zy, t.zz, 0f,
      t.ox, t.oy, t.oz, 1f
    )

  /** From 16 elements in column-major order. */
  def fromArray(m: Array[Float]): Projection =
    Projection(m(0), m(1), m(2), m(3), m(4), m(5), m(6), m(7), m(8), m(9), m(10), m(11), m(12), m(13), m(14), m(15))

  def createDepthCorrection(flipY: Boolean): Projection =
    Projection(
      1f, 0f, 0f, 0f,
      0f, if (flipY) -1f else 1f, 0f, 0f,
      0f, 0f, -0.5f, 0f,
      0f, 0f, 0.5f, 1f
    )

  def createLightAtlasRect(rect: Rect2): Projection =
    Projection(
      rect.size.x, 0f, 0f, 0f,
      0f, rect.size.y, 0f, 0f,
      0f, 0f, 1f, 0f,
      rect.position.x, rect.position.y, 0f, 1f
    )

  def createPerspective(
    fovy: Float,
    aspect: Float,
    zNear: Float,
    zFar: Float,
    flipFov: Boolean = false
  ): Projection = {
    val fovyDeg = if (flipFov) getFovy(fovy, 1.0f / aspect) else fovy
    val radians = degToRad(fovyDeg / 2.0)
    val deltaZ = zFar - zNear
    val sine = math.sin(radians).toFloat
    if (deltaZ == 0f || sine == 0f || aspect == 0f) IDENTITY
    else {
      val cotangent = (math.cos(radians) / sine).toFloat
      Projection(
        cotangent / aspect, 0f, 0f, 0f,
        0f, cotangent, 0f, 0f,
        0f, 0f, -(zFar + zNear) / deltaZ, -1f,
        0f, 0f, -2 * zNear * zFar / deltaZ, 0f
      )
    }
  }

  def createPerspectiveHmd(
    fovy: Float,
    aspect: Float,
    zNear: Float,
    zFar: Float,
    flipFov: Boolean,
    eye: Long,
    intraocularDist: Float,
    convergenceDist: Float
  ): Projection = {
    val fovyDeg = if (flipFov) getFovy(fovy, 1.0f / aspect) else fovy
    val ymax = (zNear * math.tan(degToRad(fovyDeg / 2.0))).toFloat
    val xmax = ymax * aspect
    val frustumshift = ((intraocularDist / 2.0) * zNear / convergenceDist).toFloat
    val (left, right, modeltranslation) = eye match {
      case 1L => (-xmax + frustumshift, xmax + frustumshift, intraocularDist / 2.0f)
      case 2L => (-xmax - frustumshift, xmax - frustumshift, -intraocularDist / 2.0f)
      case _  => (-xmax, xmax, 0.0f)
    }
    val cm = IDENTITY.copy(wx = modeltranslation)
    createFrustum(left, right, -ymax, ymax, zNear, zFar) * cm
  }

  def createForHmd(
    eye: Long,
    aspect: Float,
    intraocularDist: Float,
    displayWidth: Float,
    displayToLens: Float,
    oversample: Float,
    zNear: Float,
    zFar: Float
  ): Projection = {
    var f1 = ((intraocularDist * 0.5) / displayToLens).toFloat
    var f2 = (((displayWidth - intraocularDist) * 0.5) / displayToLens).toFloat
    var f3 = ((displayWidth / 4.0) / displayToLens).toFloat
    val add = (((f1 + f2) * (oversample - 1.0)) / 2.0).toFloat
    f1 += add
    f2 += add
    f3 *= oversample
    f3 /= aspect
    eye match {
      case 1L => createFrustum(-f2 * zNear, f1 * zNear, -f3 * zNear, f3 * zNear, zNear, zFar)
      case 2L => createFrustum(-f1 * zNear, f2 * zNear, -f3 * zNear, f3 * zNear, zNear, zFar)
      case _  => IDENTITY
    }
  }

  def createOrthogonal(
    left: Float,
    right: Float,
    bottom: Float,
    top: Float,
    zNear: Float,
    zFar: Float
  ): Projection =
    Projection(
      (2.0 / (right - left)).toFloat, 0f, 0f, 0f,
      0f, (2.0 / (top - bottom)).toFloat, 0f, 0f,
      0f, 0f, (-2.0 / (zFar - zNear)).toFloat, 0f,
      -((right + left) / (right - left)),
      -((top + bottom) / (top - bottom)),
      -((zFar + zNear) / (zFar - zNear)),
      1f
    )

  def createOrthogonalAspect(
    size: Float,
    aspect: Float,
    zNear: Float,
    zFar: Float,
    flipFov: Boolean = false
  ): Projection = {
    val s = if (!flipFov) size * aspect else size
    createOrthogonal(-s / 2, s / 2, -s / aspect / 2, s / aspect / 2, zNear, zFar)
  }

  def createFrustum(
    left: Float,
    right: Float,
    bottom: Float,
    top: Float,
    zNear: Float,
    zFar: Float
  ): Projection = {
    val x = 2 * zNear / (right - left)
    val y = 2 * zNear / (top - bottom)
    val a = (right + left) / (right - left)
    val b = (top + bottom) / (top - bottom)
    val c = -(zFar + zNear) / (zFar - zNear)
    val d = -2 * zFar * zNear / (zFar - zNear)
    Projection(x, 0f, 0f, 0f, 0f, y, 0f, 0f, a, b, c, -1f, 0f, 0f, d, 0f)
  }

  def createFrustumAspect(
    size: Float,
    aspect: Float,
    offset: Vector2,
    zNear: Float,
    zFar: Float,
    flipFov: Boolean = false
  ): Projection = {
    val s = if (!flipFov) size * aspect else size
    createFrustum(
      -s / 2 + offset.x,
      s / 2 + offset.x,
      -s / aspect / 2 + offset.y,
      s / aspect / 2 + offset.y,
      zNear,
      zFar
    )
  }

  def createFitAabb(aabb: AABB): Projection = {
    val min = aabb.position
    val max = aabb.position + aabb.size
    Projection(
      2 / (max.x - min.x), 0f, 0f, 0f,
      0f, 2 / (max.y - min.y), 0f, 0f,
      0f, 0f, 2 / (max.z - min.z), 0f,
      -(max.x + min.x) / (max.x - min.x),
      -(max.y + min.y) / (max.y - min.y),
      -(max.z + min.z) / (max.z - min.z),
      1f
    )
  }

  def getFovy(fovx: Float, aspect: Float): Float =
    radToDeg(math.atan(aspect * math.tan(degToRad(fovx) * 0.5)) * 2.0).toFloat

  private[gdext] inline def writeType(pr: Projection, p: GDExtensionTypePtr): Unit = {
    val f = p.asInstanceOf[Ptr[CFloat]]
    f(0) = pr.xx; f(1) = pr.xy; f(2) = pr.xz; f(3) = pr.xw
    f(4) = pr.yx; f(5) = pr.yy; f(6) = pr.yz; f(7) = pr.yw
    f(8) = pr.zx; f(9) = pr.zy; f(10) = pr.zz; f(11) = pr.zw
    f(12) = pr.wx; f(13) = pr.wy; f(14) = pr.wz; f(15) = pr.ww
  }

  private[gdext] inline def readType(p: GDExtensionTypePtr): Projection = {
    val f = p.asInstanceOf[Ptr[CFloat]]
    Projection(
      f(0), f(1), f(2), f(3), f(4), f(5), f(6), f(7),
      f(8), f(9), f(10), f(11), f(12), f(13), f(14), f(15)
    )
  }

  given ToVariant[Projection] = (value, dest) => {
    val buf = stackalloc[Byte](BuiltinSizes.Projection.toCSize)
    writeType(value, buf)
    VariantConstructors.fromType(GDEXTENSION_VARIANT_TYPE_PROJECTION)(dest, buf)
  }

  given FromVariant[Projection] = variant => {
    val buf = stackalloc[Byte](BuiltinSizes.Projection.toCSize)
    VariantConstructors.toType(GDEXTENSION_VARIANT_TYPE_PROJECTION)(buf, variant)
    readType(buf)
  }
}
