package io.github.optical002.godot.builtin

import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import io.github.optical002.godot.Godot
import io.github.optical002.godot.codegen.gdextensioninterface.types.*
import io.github.optical002.godot.codegen.gdextensioninterface.types.GDExtensionVariantType.*

/**
 * Godot's `String` (named `GString` to avoid clashing with `scala.String`).
 *
 * Physically an 8-byte ([[BuiltinSizes.String]]) reference-counted handle. We
 * build one from a Scala `String` via the UTF-8 interface function, and read it
 * back with the two-call length-probe pattern Godot's C API uses
 * (`string_to_utf8_chars(self, null, 0)` returns the byte length).
 *
 * Strings are reference-counted, so a constructed GString must be [[destroy]]ed
 * when no longer needed; [[GString.scope]] does this automatically.
 */
opaque type GString = GDExtensionStringPtr

object GString {
  extension (s: GString) {
    def ptr: GDExtensionStringPtr = s

    /** Release the underlying Godot String's reference. */
    def destroy(): Unit =
      VariantConstructors.destructor(GDEXTENSION_VARIANT_TYPE_STRING)(s)

    /** Decode this Godot String into a Scala `String` (UTF-8). */
    def toScala: String = {
      val len = Godot.interface.string_to_utf8_chars(s, null, 0).toInt
      if (len <= 0) ""
      else {
        val buf = stackalloc[CChar](len.toCSize)
        Godot.interface.string_to_utf8_chars(s, buf, len.toLong)
        // string_to_utf8_chars does not null-terminate; decode exactly len bytes.
        val bytes = new Array[Byte](len)
        var i = 0
        while (i < len) { bytes(i) = buf(i); i += 1 }
        new String(bytes, java.nio.charset.StandardCharsets.UTF_8)
      }
    }
  }

  /** Wrap an existing engine String pointer without copying. */
  def fromPtr(p: GDExtensionStringPtr): GString = p

  /** Construct a Godot String from a Scala `String` into caller storage. */
  def from(value: String, dest: GDExtensionStringPtr): GString = {
    Zone.acquire { implicit z =>
      Godot.interface.string_new_with_utf8_chars(dest, toCString(value))
    }
    dest
  }

  /**
   * Run `body` with a stack-allocated Godot String built from `value`; the
   * String is destroyed on exit.
   */
  inline def scope[R](value: String)(body: GString => R): R = {
    val buf = stackalloc[Byte](BuiltinSizes.String.toCSize)
    val s = from(value, buf)
    try body(s)
    finally s.destroy()
  }
}
