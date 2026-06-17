package io.github.optical002.godot.engine

import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.codegen.gdextensioninterface.types.*
import io.github.optical002.godot.codegen.gdextensioninterface.types.GDExtensionVariantType.*

/**
 * Marshalling for OBJECT-typed Variants (node / resource / scene references).
 *
 * Unlike value builtins, the "type pointer" for an OBJECT is a pointer to the
 * 8-byte engine object handle. We write/read that handle through the cached
 * per-type Variant constructors, exactly as [[ToVariant]]'s `fromBuiltin` does
 * for value types. A null handle round-trips as a NIL/empty object Variant.
 */
object ObjectVariant {

  /** Build an OBJECT Variant in `dest` from a raw object handle (may be null). */
  def write(handle: GDExtensionObjectPtr, dest: GDExtensionVariantPtr): Unit = {
    val buf = stackalloc[Byte](sizeof[Ptr[Byte]])
    !buf.asInstanceOf[Ptr[GDExtensionObjectPtr]] = handle
    VariantConstructors.fromType(GDEXTENSION_VARIANT_TYPE_OBJECT)(dest, buf)
  }

  /** Read the raw object handle out of an OBJECT Variant (null if empty). */
  def read(variant: GDExtensionVariantPtr): GDExtensionObjectPtr = {
    val buf = stackalloc[Byte](sizeof[Ptr[Byte]])
    VariantConstructors.toType(GDEXTENSION_VARIANT_TYPE_OBJECT)(buf, variant)
    !buf.asInstanceOf[Ptr[GDExtensionObjectPtr]]
  }
}
