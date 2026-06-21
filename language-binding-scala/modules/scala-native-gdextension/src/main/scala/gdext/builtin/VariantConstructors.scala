package gdext.builtin

import scala.scalanative.unsigned.*
import gdext.Godot
import gdext.codegen.gdextensioninterface.types.*

/**
 * Caches the engine's per-type Variant constructor functions.
 *
 * `get_variant_from_type_constructor` / `..._to_type_constructor` are
 * relatively expensive lookups, but the function pointer they return is stable
 * for the lifetime of the process. gdext caches these in a table indexed by
 * variant type; we do the same.
 *
 * Variant type tags are small contiguous integers (NIL=0 .. MAX), so a flat
 * array indexed by the tag is the natural cache. The cache is populated lazily
 * on first use of each type and never invalidated.
 */
object VariantConstructors {
  // GDEXTENSION_VARIANT_TYPE_VARIANT_MAX is the largest tag; size the tables to
  // comfortably cover it without depending on the exact constant value.
  private final val TableSize = 64

  private val fromTypeCache =
    new Array[GDExtensionVariantFromTypeConstructorFunc](TableSize)
  private val toTypeCache =
    new Array[GDExtensionTypeFromVariantConstructorFunc](TableSize)
  private val destructorCache =
    new Array[GDExtensionPtrDestructor](TableSize)

  /** Constructor that writes a Variant of `t` from a raw type pointer. */
  def fromType(
    t: GDExtensionVariantType
  ): GDExtensionVariantFromTypeConstructorFunc = {
    val idx = t.toInt
    val cached = fromTypeCache(idx)
    if (cached != null) cached
    else {
      val fn = Godot.interface.get_variant_from_type_constructor(t)
      fromTypeCache(idx) = fn
      fn
    }
  }

  /** Constructor that writes a raw type value from a Variant of `t`. */
  def toType(
    t: GDExtensionVariantType
  ): GDExtensionTypeFromVariantConstructorFunc = {
    val idx = t.toInt
    val cached = toTypeCache(idx)
    if (cached != null) cached
    else {
      val fn = Godot.interface.get_variant_to_type_constructor(t)
      toTypeCache(idx) = fn
      fn
    }
  }

  /** Destructor that releases a raw builtin value of type `t` in place. */
  def destructor(t: GDExtensionVariantType): GDExtensionPtrDestructor = {
    val idx = t.toInt
    val cached = destructorCache(idx)
    if (cached != null) cached
    else {
      val fn = Godot.interface.variant_get_ptr_destructor(t)
      destructorCache(idx) = fn
      fn
    }
  }
}
