package io.github.optical002.godot.builtin

import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import io.github.optical002.godot.codegen.gdextensioninterface.types.*
import io.github.optical002.godot.codegen.gdextensioninterface.types.GDExtensionVariantType.*

/**
 * Godot's `Vector2` — two 32-bit float components, 8 bytes total
 * ([[BuiltinSizes.Vector2]]).
 *
 * Note the components are single-precision (`CFloat`) even in the `float_64`
 * build configuration: the `_64` there refers to integer/pointer width, while
 * vector components stay `real_t` = `float`. This is why the size is 8, not 16.
 *
 * A Scala value type; it marshals to/from a Variant via the cached per-type
 * constructors. This is the representative pattern for every fixed-layout math
 * builtin (Vector3/4, Rect2, Color, Transform*, Basis, ...); the remaining
 * types are mechanical and intended to be generated from `extension_api.json`
 * in a later codegen pass.
 */
final case class Vector2(x: Float, y: Float)

object Vector2 {
  /** Write the raw 8-byte layout into a type buffer. */
  private[godot] def writeType(v: Vector2, p: GDExtensionTypePtr): Unit = {
    val f = p.asInstanceOf[Ptr[CFloat]]
    f(0) = v.x
    f(1) = v.y
  }

  /** Read a Vector2 from a raw 8-byte type buffer. */
  private[godot] def readType(p: GDExtensionTypePtr): Vector2 = {
    val f = p.asInstanceOf[Ptr[CFloat]]
    Vector2(f(0), f(1))
  }

  given ToVariant[Vector2] = (value, dest) => {
    val buf = stackalloc[Byte](BuiltinSizes.Vector2.toCSize)
    writeType(value, buf)
    VariantConstructors.fromType(GDEXTENSION_VARIANT_TYPE_VECTOR2)(dest, buf)
  }

  given FromVariant[Vector2] = (variant) => {
    val buf = stackalloc[Byte](BuiltinSizes.Vector2.toCSize)
    VariantConstructors.toType(GDEXTENSION_VARIANT_TYPE_VECTOR2)(buf, variant)
    readType(buf)
  }
}
