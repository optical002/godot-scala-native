package io.github.optical002.godot.builtin

import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import io.github.optical002.godot.codegen.gdextensioninterface.types.*
import io.github.optical002.godot.codegen.gdextensioninterface.types.GDExtensionVariantType.*

/**
 * Godot's `Color` — four 32-bit float channels (r, g, b, a), 16 bytes
 * ([[BuiltinSizes.Color]]).
 *
 * Godot's `Color` exposes many derived accessors (`r8`, `h`, `ok_hsl_*`), but
 * only r/g/b/a are stored; the rest are computed engine-side. We model only the
 * stored layout here. Same marshalling pattern as [[Vector2]].
 */
final case class Color(r: Float, g: Float, b: Float, a: Float = 1.0f)

object Color {
  private[builtin] def writeType(c: Color, p: GDExtensionTypePtr): Unit = {
    val f = p.asInstanceOf[Ptr[CFloat]]
    f(0) = c.r; f(1) = c.g; f(2) = c.b; f(3) = c.a
  }

  private[builtin] def readType(p: GDExtensionTypePtr): Color = {
    val f = p.asInstanceOf[Ptr[CFloat]]
    Color(f(0), f(1), f(2), f(3))
  }

  given ToVariant[Color] = (value, dest) => {
    val buf = stackalloc[Byte](BuiltinSizes.Color.toCSize)
    writeType(value, buf)
    VariantConstructors.fromType(GDEXTENSION_VARIANT_TYPE_COLOR)(dest, buf)
  }

  given FromVariant[Color] = (variant) => {
    val buf = stackalloc[Byte](BuiltinSizes.Color.toCSize)
    VariantConstructors.toType(GDEXTENSION_VARIANT_TYPE_COLOR)(buf, variant)
    readType(buf)
  }
}
