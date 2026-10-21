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
 * Godot's `Transform2D`: columns `x = (xx, xy)`, `y = (yx, yy)` and
 * `origin = (ox, oy)`, stored flat (6 floats) so one value is one object.
 */
final case class Transform2D(xx: Float, xy: Float, yx: Float, yy: Float, ox: Float, oy: Float) {
  def x: Vector2 = Vector2(xx, xy)
  def y: Vector2 = Vector2(yx, yy)
  def origin: Vector2 = Vector2(ox, oy)

  @alwaysinline private def tdotx(v: Vector2): Float = xx * v.x + yx * v.y
  @alwaysinline private def tdoty(v: Vector2): Float = xy * v.x + yy * v.y

  @alwaysinline def basisXform(v: Vector2): Vector2 = Vector2(tdotx(v), tdoty(v))
  @alwaysinline def basisXformInv(v: Vector2): Vector2 =
    Vector2(xx * v.x + xy * v.y, yx * v.x + yy * v.y)
  @alwaysinline def xform(v: Vector2): Vector2 = Vector2(tdotx(v) + ox, tdoty(v) + oy)
  @alwaysinline def xformInv(v: Vector2): Vector2 = basisXformInv(Vector2(v.x - ox, v.y - oy))

  @alwaysinline def *(v: Vector2): Vector2 = xform(v)

  /** Composition: `t` first, then this. */
  @alwaysinline def *(t: Transform2D): Transform2D =
    Transform2D(
      xx * t.xx + yx * t.xy,
      xy * t.xx + yy * t.xy,
      xx * t.yx + yx * t.yy,
      xy * t.yx + yy * t.yy,
      xx * t.ox + yx * t.oy + ox,
      xy * t.ox + yy * t.oy + oy
    )

  def *(s: Float): Transform2D = Transform2D(xx * s, xy * s, yx * s, yy * s, ox * s, oy * s)
  def /(s: Float): Transform2D = Transform2D(xx / s, xy / s, yx / s, yy / s, ox / s, oy / s)

  def *(rect: Rect2): Rect2 = {
    val xs = x * rect.size.x
    val ys = y * rect.size.y
    val pos = xform(rect.position)
    Rect2(pos, Vector2.ZERO).expand(pos + xs).expand(pos + ys).expand(pos + xs + ys)
  }

  def xformInv(rect: Rect2): Rect2 = {
    val p = rect.position; val s = rect.size
    Rect2(xformInv(p), Vector2.ZERO)
      .expand(xformInv(Vector2(p.x, p.y + s.y)))
      .expand(xformInv(Vector2(p.x + s.x, p.y + s.y)))
      .expand(xformInv(Vector2(p.x + s.x, p.y)))
  }

  def determinant: Float = xx * yy - xy * yx

  /** The inverse of an orthonormal transform. */
  def inverse: Transform2D = {
    val t = Transform2D(xx, yx, xy, yy, 0f, 0f)
    val o = t.basisXform(-origin)
    Transform2D(t.xx, t.xy, t.yx, t.yy, o.x, o.y)
  }

  def affineInverse: Transform2D = {
    val det = determinant
    if (det == 0f) throw new ArithmeticException("Transform2D.affineInverse: determinant is zero")
    val idet = 1.0f / det
    val t = Transform2D(yy * idet, xy * -idet, yx * -idet, xx * idet, 0f, 0f)
    val o = t.basisXform(-origin)
    Transform2D(t.xx, t.xy, t.yx, t.yy, o.x, o.y)
  }

  def getRotation: Float = atan2(xy, xx)
  def getOrigin: Vector2 = origin

  def getScale: Vector2 = {
    val detSign = sign(determinant)
    Vector2(x.length, detSign * y.length)
  }

  def getSkew: Float = {
    val det = determinant
    acos(x.normalized.dot(y.normalized * sign(det))) - Pi * 0.5f
  }

  def orthonormalized: Transform2D = {
    val nx = x.normalized
    val ny = (y - nx * nx.dot(y)).normalized
    Transform2D(nx, ny, origin)
  }

  /** Rotate in parent space (left-multiplies). */
  def rotated(angle: Float): Transform2D = Transform2D(angle, Vector2.ZERO) * this
  /** Rotate in local space (right-multiplies). */
  def rotatedLocal(angle: Float): Transform2D = this * Transform2D(angle, Vector2.ZERO)

  def scaled(scale: Vector2): Transform2D =
    Transform2D(xx * scale.x, xy * scale.y, yx * scale.x, yy * scale.y, ox * scale.x, oy * scale.y)

  def scaledLocal(scale: Vector2): Transform2D = Transform2D(x * scale.x, y * scale.y, origin)

  def translated(offset: Vector2): Transform2D = Transform2D(x, y, origin + offset)
  def translatedLocal(offset: Vector2): Transform2D = Transform2D(x, y, origin + basisXform(offset))

  def interpolateWith(xform: Transform2D, weight: Float): Transform2D =
    Transform2D(
      lerpAngle(getRotation, xform.getRotation, weight),
      getScale.lerp(xform.getScale, weight),
      lerpAngle(getSkew, xform.getSkew, weight),
      origin.lerp(xform.origin, weight)
    )

  def isConformal: Boolean =
    (GodotMath.isEqualApprox(xx, yy) && GodotMath.isEqualApprox(xy, -yx)) ||
      (GodotMath.isEqualApprox(xx, -yy) && GodotMath.isEqualApprox(xy, yx))

  def isEqualApprox(xform: Transform2D): Boolean =
    x.isEqualApprox(xform.x) && y.isEqualApprox(xform.y) && origin.isEqualApprox(xform.origin)

  def isFinite: Boolean = x.isFinite && y.isFinite && origin.isFinite

  def lookingAt(target: Vector2 = Vector2(0f, 0f)): Transform2D = {
    val ret = Transform2D(getRotation, origin)
    val targetPosition = affineInverse.xform(target)
    ret.withRotation(ret.getRotation + (targetPosition * getScale).angle)
  }

  /** This transform with its rotation replaced, keeping its scale. */
  def withRotation(rotation: Float): Transform2D = {
    val scale = getScale
    val cr = cos(rotation); val sr = sin(rotation)
    val nx = Vector2(cr, sr).normalized * scale.x
    val ny = Vector2(-sr, cr).normalized * scale.y
    Transform2D(nx, ny, origin)
  }
}

object Transform2D {
  val IDENTITY: Transform2D = Transform2D(1f, 0f, 0f, 1f, 0f, 0f)
  val FLIP_X: Transform2D = Transform2D(-1f, 0f, 0f, 1f, 0f, 0f)
  val FLIP_Y: Transform2D = Transform2D(1f, 0f, 0f, -1f, 0f, 0f)

  def apply(): Transform2D = IDENTITY

  def apply(x: Vector2, y: Vector2, origin: Vector2): Transform2D =
    Transform2D(x.x, x.y, y.x, y.y, origin.x, origin.y)

  def apply(rotation: Float, position: Vector2): Transform2D = {
    val cr = cos(rotation); val sr = sin(rotation)
    Transform2D(cr, sr, -sr, cr, position.x, position.y)
  }

  def apply(rotation: Float, scale: Vector2, skew: Float, position: Vector2): Transform2D =
    Transform2D(
      cos(rotation) * scale.x,
      sin(rotation) * scale.x,
      -sin(rotation + skew) * scale.y,
      cos(rotation + skew) * scale.y,
      position.x,
      position.y
    )

  private[gdext] inline def writeType(t: Transform2D, p: GDExtensionTypePtr): Unit = {
    val f = p.asInstanceOf[Ptr[CFloat]]
    f(0) = t.xx; f(1) = t.xy; f(2) = t.yx; f(3) = t.yy; f(4) = t.ox; f(5) = t.oy
  }

  private[gdext] inline def readType(p: GDExtensionTypePtr): Transform2D = {
    val f = p.asInstanceOf[Ptr[CFloat]]
    Transform2D(f(0), f(1), f(2), f(3), f(4), f(5))
  }

  given ToVariant[Transform2D] = (value, dest) => {
    val buf = stackalloc[Byte](BuiltinSizes.Transform2D.toCSize)
    writeType(value, buf)
    VariantConstructors.fromType(GDEXTENSION_VARIANT_TYPE_TRANSFORM2D)(dest, buf)
  }

  given FromVariant[Transform2D] = variant => {
    val buf = stackalloc[Byte](BuiltinSizes.Transform2D.toCSize)
    VariantConstructors.toType(GDEXTENSION_VARIANT_TYPE_TRANSFORM2D)(buf, variant)
    readType(buf)
  }
}
