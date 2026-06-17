package io.github.optical002.godot.builtin

import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import io.github.optical002.godot.codegen.gdextensioninterface.types.*
import io.github.optical002.godot.codegen.gdextensioninterface.types.GDExtensionVariantType.*

/**
 * The fixed-layout math builtins beyond [[Vector2]]/[[Color]] (which keep their
 * own files as the representative pattern). Each is a Scala value type that
 * marshals to/from its raw native blob via `writeType`/`readType` (used by
 * `Ptrcall` for engine method calls) and to/from a Variant via the cached
 * per-type constructors (used by property/method registration).
 *
 * Sizes are pinned in [[BuiltinSizes]]. Components are single precision
 * (`CFloat`) in the default `float_64` build — the `_64` is integer/pointer
 * width, not `real_t` — except the `*i` integer vectors, which are `CInt`.
 * Grouped here because they are mechanical and small; a later codegen pass is
 * expected to generate them from `extension_api.json`.
 */

// --- integer vectors --------------------------------------------------------

final case class Vector2i(x: Int, y: Int)
object Vector2i {
  private[godot] def writeType(v: Vector2i, p: GDExtensionTypePtr): Unit = {
    val i = p.asInstanceOf[Ptr[CInt]]; i(0) = v.x; i(1) = v.y
  }
  private[godot] def readType(p: GDExtensionTypePtr): Vector2i = {
    val i = p.asInstanceOf[Ptr[CInt]]; Vector2i(i(0), i(1))
  }
  given ToVariant[Vector2i] = (value, dest) => {
    val buf = stackalloc[Byte](BuiltinSizes.Vector2i.toCSize)
    writeType(value, buf)
    VariantConstructors.fromType(GDEXTENSION_VARIANT_TYPE_VECTOR2I)(dest, buf)
  }
  given FromVariant[Vector2i] = (variant) => {
    val buf = stackalloc[Byte](BuiltinSizes.Vector2i.toCSize)
    VariantConstructors.toType(GDEXTENSION_VARIANT_TYPE_VECTOR2I)(buf, variant)
    readType(buf)
  }
}

final case class Vector3i(x: Int, y: Int, z: Int)
object Vector3i {
  private[godot] def writeType(v: Vector3i, p: GDExtensionTypePtr): Unit = {
    val i = p.asInstanceOf[Ptr[CInt]]; i(0) = v.x; i(1) = v.y; i(2) = v.z
  }
  private[godot] def readType(p: GDExtensionTypePtr): Vector3i = {
    val i = p.asInstanceOf[Ptr[CInt]]; Vector3i(i(0), i(1), i(2))
  }
  given ToVariant[Vector3i] = (value, dest) => {
    val buf = stackalloc[Byte](BuiltinSizes.Vector3i.toCSize)
    writeType(value, buf)
    VariantConstructors.fromType(GDEXTENSION_VARIANT_TYPE_VECTOR3I)(dest, buf)
  }
  given FromVariant[Vector3i] = (variant) => {
    val buf = stackalloc[Byte](BuiltinSizes.Vector3i.toCSize)
    VariantConstructors.toType(GDEXTENSION_VARIANT_TYPE_VECTOR3I)(buf, variant)
    readType(buf)
  }
}

final case class Vector4i(x: Int, y: Int, z: Int, w: Int)
object Vector4i {
  private[godot] def writeType(v: Vector4i, p: GDExtensionTypePtr): Unit = {
    val i = p.asInstanceOf[Ptr[CInt]]
    i(0) = v.x; i(1) = v.y; i(2) = v.z; i(3) = v.w
  }
  private[godot] def readType(p: GDExtensionTypePtr): Vector4i = {
    val i = p.asInstanceOf[Ptr[CInt]]; Vector4i(i(0), i(1), i(2), i(3))
  }
  given ToVariant[Vector4i] = (value, dest) => {
    val buf = stackalloc[Byte](BuiltinSizes.Vector4i.toCSize)
    writeType(value, buf)
    VariantConstructors.fromType(GDEXTENSION_VARIANT_TYPE_VECTOR4I)(dest, buf)
  }
  given FromVariant[Vector4i] = (variant) => {
    val buf = stackalloc[Byte](BuiltinSizes.Vector4i.toCSize)
    VariantConstructors.toType(GDEXTENSION_VARIANT_TYPE_VECTOR4I)(buf, variant)
    readType(buf)
  }
}

// --- float vectors ----------------------------------------------------------

final case class Vector3(x: Float, y: Float, z: Float)
object Vector3 {
  private[godot] def writeType(v: Vector3, p: GDExtensionTypePtr): Unit = {
    val f = p.asInstanceOf[Ptr[CFloat]]; f(0) = v.x; f(1) = v.y; f(2) = v.z
  }
  private[godot] def readType(p: GDExtensionTypePtr): Vector3 = {
    val f = p.asInstanceOf[Ptr[CFloat]]; Vector3(f(0), f(1), f(2))
  }
  given ToVariant[Vector3] = (value, dest) => {
    val buf = stackalloc[Byte](BuiltinSizes.Vector3.toCSize)
    writeType(value, buf)
    VariantConstructors.fromType(GDEXTENSION_VARIANT_TYPE_VECTOR3)(dest, buf)
  }
  given FromVariant[Vector3] = (variant) => {
    val buf = stackalloc[Byte](BuiltinSizes.Vector3.toCSize)
    VariantConstructors.toType(GDEXTENSION_VARIANT_TYPE_VECTOR3)(buf, variant)
    readType(buf)
  }
}

final case class Vector4(x: Float, y: Float, z: Float, w: Float)
object Vector4 {
  private[godot] def writeType(v: Vector4, p: GDExtensionTypePtr): Unit = {
    val f = p.asInstanceOf[Ptr[CFloat]]
    f(0) = v.x; f(1) = v.y; f(2) = v.z; f(3) = v.w
  }
  private[godot] def readType(p: GDExtensionTypePtr): Vector4 = {
    val f = p.asInstanceOf[Ptr[CFloat]]; Vector4(f(0), f(1), f(2), f(3))
  }
  given ToVariant[Vector4] = (value, dest) => {
    val buf = stackalloc[Byte](BuiltinSizes.Vector4.toCSize)
    writeType(value, buf)
    VariantConstructors.fromType(GDEXTENSION_VARIANT_TYPE_VECTOR4)(dest, buf)
  }
  given FromVariant[Vector4] = (variant) => {
    val buf = stackalloc[Byte](BuiltinSizes.Vector4.toCSize)
    VariantConstructors.toType(GDEXTENSION_VARIANT_TYPE_VECTOR4)(buf, variant)
    readType(buf)
  }
}

// --- rects ------------------------------------------------------------------

final case class Rect2(position: Vector2, size: Vector2)
object Rect2 {
  private[godot] def writeType(r: Rect2, p: GDExtensionTypePtr): Unit = {
    val f = p.asInstanceOf[Ptr[CFloat]]
    f(0) = r.position.x; f(1) = r.position.y; f(2) = r.size.x; f(3) = r.size.y
  }
  private[godot] def readType(p: GDExtensionTypePtr): Rect2 = {
    val f = p.asInstanceOf[Ptr[CFloat]]
    Rect2(Vector2(f(0), f(1)), Vector2(f(2), f(3)))
  }
  given ToVariant[Rect2] = (value, dest) => {
    val buf = stackalloc[Byte](BuiltinSizes.Rect2.toCSize)
    writeType(value, buf)
    VariantConstructors.fromType(GDEXTENSION_VARIANT_TYPE_RECT2)(dest, buf)
  }
  given FromVariant[Rect2] = (variant) => {
    val buf = stackalloc[Byte](BuiltinSizes.Rect2.toCSize)
    VariantConstructors.toType(GDEXTENSION_VARIANT_TYPE_RECT2)(buf, variant)
    readType(buf)
  }
}

final case class Rect2i(position: Vector2i, size: Vector2i)
object Rect2i {
  private[godot] def writeType(r: Rect2i, p: GDExtensionTypePtr): Unit = {
    val i = p.asInstanceOf[Ptr[CInt]]
    i(0) = r.position.x; i(1) = r.position.y; i(2) = r.size.x; i(3) = r.size.y
  }
  private[godot] def readType(p: GDExtensionTypePtr): Rect2i = {
    val i = p.asInstanceOf[Ptr[CInt]]
    Rect2i(Vector2i(i(0), i(1)), Vector2i(i(2), i(3)))
  }
  given ToVariant[Rect2i] = (value, dest) => {
    val buf = stackalloc[Byte](BuiltinSizes.Rect2i.toCSize)
    writeType(value, buf)
    VariantConstructors.fromType(GDEXTENSION_VARIANT_TYPE_RECT2I)(dest, buf)
  }
  given FromVariant[Rect2i] = (variant) => {
    val buf = stackalloc[Byte](BuiltinSizes.Rect2i.toCSize)
    VariantConstructors.toType(GDEXTENSION_VARIANT_TYPE_RECT2I)(buf, variant)
    readType(buf)
  }
}

// --- quaternion / plane -----------------------------------------------------

final case class Quaternion(x: Float, y: Float, z: Float, w: Float)
object Quaternion {
  private[godot] def writeType(q: Quaternion, p: GDExtensionTypePtr): Unit = {
    val f = p.asInstanceOf[Ptr[CFloat]]
    f(0) = q.x; f(1) = q.y; f(2) = q.z; f(3) = q.w
  }
  private[godot] def readType(p: GDExtensionTypePtr): Quaternion = {
    val f = p.asInstanceOf[Ptr[CFloat]]; Quaternion(f(0), f(1), f(2), f(3))
  }
  given ToVariant[Quaternion] = (value, dest) => {
    val buf = stackalloc[Byte](BuiltinSizes.Quaternion.toCSize)
    writeType(value, buf)
    VariantConstructors.fromType(GDEXTENSION_VARIANT_TYPE_QUATERNION)(dest, buf)
  }
  given FromVariant[Quaternion] = (variant) => {
    val buf = stackalloc[Byte](BuiltinSizes.Quaternion.toCSize)
    VariantConstructors.toType(GDEXTENSION_VARIANT_TYPE_QUATERNION)(buf, variant)
    readType(buf)
  }
}

/** Plane: a unit normal `(x, y, z)` and distance `d`. */
final case class Plane(x: Float, y: Float, z: Float, d: Float)
object Plane {
  private[godot] def writeType(pl: Plane, p: GDExtensionTypePtr): Unit = {
    val f = p.asInstanceOf[Ptr[CFloat]]
    f(0) = pl.x; f(1) = pl.y; f(2) = pl.z; f(3) = pl.d
  }
  private[godot] def readType(p: GDExtensionTypePtr): Plane = {
    val f = p.asInstanceOf[Ptr[CFloat]]; Plane(f(0), f(1), f(2), f(3))
  }
  given ToVariant[Plane] = (value, dest) => {
    val buf = stackalloc[Byte](BuiltinSizes.Plane.toCSize)
    writeType(value, buf)
    VariantConstructors.fromType(GDEXTENSION_VARIANT_TYPE_PLANE)(dest, buf)
  }
  given FromVariant[Plane] = (variant) => {
    val buf = stackalloc[Byte](BuiltinSizes.Plane.toCSize)
    VariantConstructors.toType(GDEXTENSION_VARIANT_TYPE_PLANE)(buf, variant)
    readType(buf)
  }
}

// --- aabb / basis / transforms / projection ---------------------------------

/** AABB: a `position` corner and a `size` extent. */
final case class AABB(position: Vector3, size: Vector3)
object AABB {
  private[godot] def writeType(a: AABB, p: GDExtensionTypePtr): Unit = {
    val f = p.asInstanceOf[Ptr[CFloat]]
    f(0) = a.position.x; f(1) = a.position.y; f(2) = a.position.z
    f(3) = a.size.x; f(4) = a.size.y; f(5) = a.size.z
  }
  private[godot] def readType(p: GDExtensionTypePtr): AABB = {
    val f = p.asInstanceOf[Ptr[CFloat]]
    AABB(Vector3(f(0), f(1), f(2)), Vector3(f(3), f(4), f(5)))
  }
  given ToVariant[AABB] = (value, dest) => {
    val buf = stackalloc[Byte](BuiltinSizes.AABB.toCSize)
    writeType(value, buf)
    VariantConstructors.fromType(GDEXTENSION_VARIANT_TYPE_AABB)(dest, buf)
  }
  given FromVariant[AABB] = (variant) => {
    val buf = stackalloc[Byte](BuiltinSizes.AABB.toCSize)
    VariantConstructors.toType(GDEXTENSION_VARIANT_TYPE_AABB)(buf, variant)
    readType(buf)
  }
}

/** Basis: a 3x3 matrix stored as three Vector3 rows. */
final case class Basis(row0: Vector3, row1: Vector3, row2: Vector3)
object Basis {
  private[godot] def writeType(b: Basis, p: GDExtensionTypePtr): Unit = {
    val f = p.asInstanceOf[Ptr[CFloat]]
    f(0) = b.row0.x; f(1) = b.row0.y; f(2) = b.row0.z
    f(3) = b.row1.x; f(4) = b.row1.y; f(5) = b.row1.z
    f(6) = b.row2.x; f(7) = b.row2.y; f(8) = b.row2.z
  }
  private[godot] def readType(p: GDExtensionTypePtr): Basis = {
    val f = p.asInstanceOf[Ptr[CFloat]]
    Basis(
      Vector3(f(0), f(1), f(2)),
      Vector3(f(3), f(4), f(5)),
      Vector3(f(6), f(7), f(8))
    )
  }
  given ToVariant[Basis] = (value, dest) => {
    val buf = stackalloc[Byte](BuiltinSizes.Basis.toCSize)
    writeType(value, buf)
    VariantConstructors.fromType(GDEXTENSION_VARIANT_TYPE_BASIS)(dest, buf)
  }
  given FromVariant[Basis] = (variant) => {
    val buf = stackalloc[Byte](BuiltinSizes.Basis.toCSize)
    VariantConstructors.toType(GDEXTENSION_VARIANT_TYPE_BASIS)(buf, variant)
    readType(buf)
  }
}

/** Transform2D: three Vector2 columns `(x, y, origin)`. */
final case class Transform2D(x: Vector2, y: Vector2, origin: Vector2)
object Transform2D {
  private[godot] def writeType(t: Transform2D, p: GDExtensionTypePtr): Unit = {
    val f = p.asInstanceOf[Ptr[CFloat]]
    f(0) = t.x.x; f(1) = t.x.y
    f(2) = t.y.x; f(3) = t.y.y
    f(4) = t.origin.x; f(5) = t.origin.y
  }
  private[godot] def readType(p: GDExtensionTypePtr): Transform2D = {
    val f = p.asInstanceOf[Ptr[CFloat]]
    Transform2D(Vector2(f(0), f(1)), Vector2(f(2), f(3)), Vector2(f(4), f(5)))
  }
  given ToVariant[Transform2D] = (value, dest) => {
    val buf = stackalloc[Byte](BuiltinSizes.Transform2D.toCSize)
    writeType(value, buf)
    VariantConstructors.fromType(GDEXTENSION_VARIANT_TYPE_TRANSFORM2D)(dest, buf)
  }
  given FromVariant[Transform2D] = (variant) => {
    val buf = stackalloc[Byte](BuiltinSizes.Transform2D.toCSize)
    VariantConstructors.toType(GDEXTENSION_VARIANT_TYPE_TRANSFORM2D)(buf, variant)
    readType(buf)
  }
}

/** Transform3D: a [[Basis]] and a Vector3 origin. */
final case class Transform3D(basis: Basis, origin: Vector3)
object Transform3D {
  private[godot] def writeType(t: Transform3D, p: GDExtensionTypePtr): Unit = {
    Basis.writeType(t.basis, p)
    val f = p.asInstanceOf[Ptr[CFloat]]
    f(9) = t.origin.x; f(10) = t.origin.y; f(11) = t.origin.z
  }
  private[godot] def readType(p: GDExtensionTypePtr): Transform3D = {
    val b = Basis.readType(p)
    val f = p.asInstanceOf[Ptr[CFloat]]
    Transform3D(b, Vector3(f(9), f(10), f(11)))
  }
  given ToVariant[Transform3D] = (value, dest) => {
    val buf = stackalloc[Byte](BuiltinSizes.Transform3D.toCSize)
    writeType(value, buf)
    VariantConstructors.fromType(GDEXTENSION_VARIANT_TYPE_TRANSFORM3D)(dest, buf)
  }
  given FromVariant[Transform3D] = (variant) => {
    val buf = stackalloc[Byte](BuiltinSizes.Transform3D.toCSize)
    VariantConstructors.toType(GDEXTENSION_VARIANT_TYPE_TRANSFORM3D)(buf, variant)
    readType(buf)
  }
}

/** Projection: a 4x4 matrix stored as four Vector4 columns. */
final case class Projection(x: Vector4, y: Vector4, z: Vector4, w: Vector4)
object Projection {
  private[godot] def writeType(pr: Projection, p: GDExtensionTypePtr): Unit = {
    val f = p.asInstanceOf[Ptr[CFloat]]
    f(0) = pr.x.x; f(1) = pr.x.y; f(2) = pr.x.z; f(3) = pr.x.w
    f(4) = pr.y.x; f(5) = pr.y.y; f(6) = pr.y.z; f(7) = pr.y.w
    f(8) = pr.z.x; f(9) = pr.z.y; f(10) = pr.z.z; f(11) = pr.z.w
    f(12) = pr.w.x; f(13) = pr.w.y; f(14) = pr.w.z; f(15) = pr.w.w
  }
  private[godot] def readType(p: GDExtensionTypePtr): Projection = {
    val f = p.asInstanceOf[Ptr[CFloat]]
    Projection(
      Vector4(f(0), f(1), f(2), f(3)),
      Vector4(f(4), f(5), f(6), f(7)),
      Vector4(f(8), f(9), f(10), f(11)),
      Vector4(f(12), f(13), f(14), f(15))
    )
  }
  given ToVariant[Projection] = (value, dest) => {
    val buf = stackalloc[Byte](BuiltinSizes.Projection.toCSize)
    writeType(value, buf)
    VariantConstructors.fromType(GDEXTENSION_VARIANT_TYPE_PROJECTION)(dest, buf)
  }
  given FromVariant[Projection] = (variant) => {
    val buf = stackalloc[Byte](BuiltinSizes.Projection.toCSize)
    VariantConstructors.toType(GDEXTENSION_VARIANT_TYPE_PROJECTION)(buf, variant)
    readType(buf)
  }
}
