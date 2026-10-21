package gdext.builtin

// format: off — matrix literals keep their row/column grid, for review against
// Godot's core/math sources.

import scala.scalanative.annotation.alwaysinline
import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import gdext.internal.ffi.types.*
import gdext.internal.ffi.types.GDExtensionVariantType.*

/**
 * Godot's `Transform3D`: a [[Basis]] plus an `origin`, stored flat (12
 * floats) so one value is one object. Basis fields are named by column as in
 * [[Basis]]; `ox, oy, oz` is the origin. `basis` and `origin` build views on
 * demand.
 */
final case class Transform3D(
  xx: Float, xy: Float, xz: Float,
  yx: Float, yy: Float, yz: Float,
  zx: Float, zy: Float, zz: Float,
  ox: Float, oy: Float, oz: Float
) {
  def basis: Basis = Basis(xx, xy, xz, yx, yy, yz, zx, zy, zz)
  def origin: Vector3 = Vector3(ox, oy, oz)

  @alwaysinline def xform(v: Vector3): Vector3 =
    Vector3(
      xx * v.x + yx * v.y + zx * v.z + ox,
      xy * v.x + yy * v.y + zy * v.z + oy,
      xz * v.x + yz * v.y + zz * v.z + oz
    )

  @alwaysinline def xformInv(v: Vector3): Vector3 = {
    val px = v.x - ox; val py = v.y - oy; val pz = v.z - oz
    Vector3(
      xx * px + xy * py + xz * pz,
      yx * px + yy * py + yz * pz,
      zx * px + zy * py + zz * pz
    )
  }

  @alwaysinline def *(v: Vector3): Vector3 = xform(v)

  /** Composition: `t` first, then this. Written on the flat fields so no
    * intermediate `Basis`/`Vector3` is built. */
  @alwaysinline def *(t: Transform3D): Transform3D =
    Transform3D(
      xx * t.xx + yx * t.xy + zx * t.xz,
      xy * t.xx + yy * t.xy + zy * t.xz,
      xz * t.xx + yz * t.xy + zz * t.xz,
      xx * t.yx + yx * t.yy + zx * t.yz,
      xy * t.yx + yy * t.yy + zy * t.yz,
      xz * t.yx + yz * t.yy + zz * t.yz,
      xx * t.zx + yx * t.zy + zx * t.zz,
      xy * t.zx + yy * t.zy + zy * t.zz,
      xz * t.zx + yz * t.zy + zz * t.zz,
      xx * t.ox + yx * t.oy + zx * t.oz + ox,
      xy * t.ox + yy * t.oy + zy * t.oz + oy,
      xz * t.ox + yz * t.oy + zz * t.oz + oz
    )

  def *(s: Float): Transform3D =
    Transform3D(xx * s, xy * s, xz * s, yx * s, yy * s, yz * s, zx * s, zy * s, zz * s, ox * s, oy * s, oz * s)
  def /(s: Float): Transform3D =
    Transform3D(xx / s, xy / s, xz / s, yx / s, yy / s, yz / s, zx / s, zy / s, zz / s, ox / s, oy / s, oz / s)

  def *(plane: Plane): Plane = {
    val bInvT = basis.inverse.transposed
    val point = xform(plane.normal * plane.d)
    val normal = bInvT.xform(plane.normal).normalized
    Plane(normal, normal.dot(point))
  }

  def xformInv(plane: Plane): Plane = {
    val inv = affineInverse
    val point = inv.xform(plane.normal * plane.d)
    val normal = basis.transposed.xform(plane.normal).normalized
    Plane(normal, normal.dot(point))
  }

  def *(aabb: AABB): AABB = {
    val min = aabb.position
    val max = aabb.position + aabb.size
    val b = basis
    var tminX = ox; var tmaxX = ox
    var tminY = oy; var tmaxY = oy
    var tminZ = oz; var tmaxZ = oz
    var j = 0
    while (j < 3) {
      val mn = min(j); val mx = max(j)
      var e = b.el(0, j) * mn; var f = b.el(0, j) * mx
      if (e < f) { tminX += e; tmaxX += f } else { tminX += f; tmaxX += e }
      e = b.el(1, j) * mn; f = b.el(1, j) * mx
      if (e < f) { tminY += e; tmaxY += f } else { tminY += f; tmaxY += e }
      e = b.el(2, j) * mn; f = b.el(2, j) * mx
      if (e < f) { tminZ += e; tmaxZ += f } else { tminZ += f; tmaxZ += e }
      j += 1
    }
    AABB(Vector3(tminX, tminY, tminZ), Vector3(tmaxX - tminX, tmaxY - tminY, tmaxZ - tminZ))
  }

  def xformInv(aabb: AABB): AABB = {
    val p = aabb.position; val s = aabb.size
    var ret = AABB(xformInv(Vector3(p.x + s.x, p.y + s.y, p.z + s.z)), Vector3.ZERO)
    var i = 1
    while (i < 8) {
      val v = Vector3(
        if ((i & 4) == 0) p.x + s.x else p.x,
        if ((i & 2) == 0) p.y + s.y else p.y,
        if ((i & 1) == 0) p.z + s.z else p.z
      )
      ret = ret.expand(xformInv(v))
      i += 1
    }
    ret
  }

  def inverse: Transform3D = {
    val b = basis.transposed
    Transform3D(b, b.xform(-origin))
  }

  def affineInverse: Transform3D = {
    val b = basis.inverse
    Transform3D(b, b.xform(-origin))
  }

  def orthonormalized: Transform3D = Transform3D(basis.orthonormalized, origin)

  /** Rotate around a normalized `axis` in parent space (left-multiplies). */
  def rotated(axis: Vector3, angle: Float): Transform3D = {
    val r = Basis(axis, angle)
    Transform3D(r * basis, r.xform(origin))
  }

  /** Rotate around a normalized `axis` in local space (right-multiplies). */
  def rotatedLocal(axis: Vector3, angle: Float): Transform3D =
    Transform3D(basis * Basis(axis, angle), origin)

  def scaled(scale: Vector3): Transform3D = Transform3D(basis.scaled(scale), origin * scale)
  def scaledLocal(scale: Vector3): Transform3D = Transform3D(basis.scaledLocal(scale), origin)
  def translated(offset: Vector3): Transform3D = Transform3D(basis, origin + offset)
  def translatedLocal(offset: Vector3): Transform3D =
    Transform3D(basis, origin + basis.xform(offset))

  def lookingAt(
    target: Vector3,
    up: Vector3 = Vector3(0f, 1f, 0f),
    useModelFront: Boolean = false
  ): Transform3D =
    Transform3D(Basis.lookingAt(target - origin, up, useModelFront), origin)

  def interpolateWith(xform: Transform3D, weight: Float): Transform3D = {
    val srcB = basis
    val dstB = xform.basis
    val rot = srcB.getRotationQuaternion.slerp(dstB.getRotationQuaternion, weight).normalized
    val scale = srcB.getScale.lerp(dstB.getScale, weight)
    Transform3D(Basis(rot) * Basis.fromScale(scale), origin.lerp(xform.origin, weight))
  }

  def isEqualApprox(xform: Transform3D): Boolean =
    basis.isEqualApprox(xform.basis) && origin.isEqualApprox(xform.origin)

  def isFinite: Boolean = basis.isFinite && origin.isFinite
}

object Transform3D {
  val IDENTITY: Transform3D = Transform3D(Basis.IDENTITY, Vector3.ZERO)
  val FLIP_X: Transform3D = Transform3D(Basis.FLIP_X, Vector3.ZERO)
  val FLIP_Y: Transform3D = Transform3D(Basis.FLIP_Y, Vector3.ZERO)
  val FLIP_Z: Transform3D = Transform3D(Basis.FLIP_Z, Vector3.ZERO)

  @deprecated("use Transform3D.IDENTITY", "0.1.9")
  def identity: Transform3D = IDENTITY

  def apply(): Transform3D = IDENTITY

  def apply(basis: Basis, origin: Vector3): Transform3D =
    Transform3D(
      basis.xx, basis.xy, basis.xz,
      basis.yx, basis.yy, basis.yz,
      basis.zx, basis.zy, basis.zz,
      origin.x, origin.y, origin.z
    )

  def apply(xAxis: Vector3, yAxis: Vector3, zAxis: Vector3, origin: Vector3): Transform3D =
    Transform3D(Basis(xAxis, yAxis, zAxis), origin)

  /** The affine part of a projection matrix. */
  def apply(p: Projection): Transform3D =
    Transform3D(
      p.xx, p.xy, p.xz,
      p.yx, p.yy, p.yz,
      p.zx, p.zy, p.zz,
      p.wx, p.wy, p.wz
    )

  private[gdext] inline def writeType(t: Transform3D, p: GDExtensionTypePtr): Unit = {
    val f = p.asInstanceOf[Ptr[CFloat]]
    f(0) = t.xx; f(1) = t.yx; f(2) = t.zx
    f(3) = t.xy; f(4) = t.yy; f(5) = t.zy
    f(6) = t.xz; f(7) = t.yz; f(8) = t.zz
    f(9) = t.ox; f(10) = t.oy; f(11) = t.oz
  }

  private[gdext] inline def readType(p: GDExtensionTypePtr): Transform3D = {
    val f = p.asInstanceOf[Ptr[CFloat]]
    Transform3D(f(0), f(3), f(6), f(1), f(4), f(7), f(2), f(5), f(8), f(9), f(10), f(11))
  }

  given ToVariant[Transform3D] = (value, dest) => {
    val buf = stackalloc[Byte](BuiltinSizes.Transform3D.toCSize)
    writeType(value, buf)
    VariantConstructors.fromType(GDEXTENSION_VARIANT_TYPE_TRANSFORM3D)(dest, buf)
  }

  given FromVariant[Transform3D] = variant => {
    val buf = stackalloc[Byte](BuiltinSizes.Transform3D.toCSize)
    VariantConstructors.toType(GDEXTENSION_VARIANT_TYPE_TRANSFORM3D)(buf, variant)
    readType(buf)
  }
}
