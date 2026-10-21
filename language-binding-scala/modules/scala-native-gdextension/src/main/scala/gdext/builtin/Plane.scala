package gdext.builtin

import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import gdext.internal.ffi.types.*
import gdext.internal.ffi.types.GDExtensionVariantType.*
import GodotMath.*

/** Godot's `Plane`: a `normal` and the distance `d` from the origin (16 bytes).
  */
final case class Plane(normal: Vector3, d: Float) {
  def x: Float = normal.x
  def y: Float = normal.y
  def z: Float = normal.z

  def unary_- : Plane = Plane(-normal, -d)
  def unary_+ : Plane = this

  /** `Plane * Transform3D`: the inverse transform of this plane. */
  def *(t: Transform3D): Plane = t.xformInv(this)

  def normalized: Plane = {
    val l = normal.length
    if (l == 0f) Plane(Vector3.ZERO, 0f) else Plane(normal / l, d / l)
  }

  def getCenter: Vector3 = normal * d

  def isEqualApprox(toPlane: Plane): Boolean =
    normal
      .isEqualApprox(toPlane.normal) && GodotMath.isEqualApprox(d, toPlane.d)
  def isFinite: Boolean = normal.isFinite && GodotMath.isFinite(d)

  def isPointOver(point: Vector3): Boolean = normal.dot(point) > d
  def distanceTo(point: Vector3): Float = normal.dot(point) - d
  def hasPoint(point: Vector3, tolerance: Float = 0.00001f): Boolean =
    math.abs(normal.dot(point) - d) <= tolerance
  def project(point: Vector3): Vector3 = point - normal * distanceTo(point)

  /** The point where this plane and `b` and `c` meet, if they do. */
  def intersect3(b: Plane, c: Plane): Option[Vector3] = {
    val denom = normal.cross(b.normal).dot(c.normal)
    if (isZeroApprox(denom)) None
    else
      Some(
        ((b.normal.cross(c.normal) * d) + (c.normal.cross(normal) * b.d) +
          (normal.cross(b.normal) * c.d)) / denom
      )
  }

  /** Where the ray from `from` along `dir` hits this plane, if it does. */
  def intersectsRay(from: Vector3, dir: Vector3): Option[Vector3] = {
    val den = normal.dot(dir)
    if (isZeroApprox(den)) None
    else {
      val dist = (normal.dot(from) - d) / den
      if (dist > CmpEpsilon) None else Some(from + dir * -dist)
    }
  }

  /** Where the segment `from`-`to` crosses this plane, if it does. */
  def intersectsSegment(from: Vector3, to: Vector3): Option[Vector3] = {
    val segment = from - to
    val den = normal.dot(segment)
    if (isZeroApprox(den)) None
    else {
      val dist = (normal.dot(from) - d) / den
      if (dist < -CmpEpsilon || dist > 1.0f + CmpEpsilon) None
      else Some(from + segment * -dist)
    }
  }
}

object Plane {
  val PLANE_YZ: Plane = Plane(Vector3(1f, 0f, 0f), 0f)
  val PLANE_XZ: Plane = Plane(Vector3(0f, 1f, 0f), 0f)
  val PLANE_XY: Plane = Plane(Vector3(0f, 0f, 1f), 0f)

  def apply(): Plane = Plane(Vector3.ZERO, 0f)
  def apply(normal: Vector3): Plane = Plane(normal, 0f)
  def apply(a: Float, b: Float, c: Float, d: Float): Plane =
    Plane(Vector3(a, b, c), d)

  /** The plane through `point` with `normal`. */
  def apply(normal: Vector3, point: Vector3): Plane =
    Plane(normal, normal.dot(point))

  /** The plane through three points, wound clockwise. */
  def apply(point1: Vector3, point2: Vector3, point3: Vector3): Plane = {
    val n = (point1 - point3).cross(point1 - point2).normalized
    Plane(n, n.dot(point1))
  }

  private[gdext] inline def writeType(
    pl: Plane,
    p: GDExtensionTypePtr
  ): Unit = {
    val f = p.asInstanceOf[Ptr[CFloat]]
    f(0) = pl.normal.x; f(1) = pl.normal.y; f(2) = pl.normal.z; f(3) = pl.d
  }

  private[gdext] inline def readType(p: GDExtensionTypePtr): Plane = {
    val f = p.asInstanceOf[Ptr[CFloat]]
    Plane(Vector3(f(0), f(1), f(2)), f(3))
  }

  given ToVariant[Plane] = (value, dest) => {
    val buf = stackalloc[Byte](BuiltinSizes.Plane.toCSize)
    writeType(value, buf)
    VariantConstructors.fromType(GDEXTENSION_VARIANT_TYPE_PLANE)(dest, buf)
  }

  given FromVariant[Plane] = variant => {
    val buf = stackalloc[Byte](BuiltinSizes.Plane.toCSize)
    VariantConstructors.toType(GDEXTENSION_VARIANT_TYPE_PLANE)(buf, variant)
    readType(buf)
  }
}
