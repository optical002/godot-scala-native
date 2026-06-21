package gdext.builtin

import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import scala.scalanative.libc.stdlib
import gdext.codegen.gdextensioninterface.types.*
import gdext.codegen.gdextensioninterface.types.GDExtensionVariantType.*

/**
 * A typed view over Godot's [[Dictionary]] — `Dict[K, V]`. Keys and values
 * marshal through the [[ToVariant]]/[[FromVariant]] seam, so any builtin- or
 * (where a given exists) object-convertible `K`/`V` works.
 *
 * The backing 8-byte Dictionary handle is heap-owned so a `Dict` can live in a
 * class field (an exported property) for the object's lifetime. As with the rest
 * of the binding, freeing is explicit / process-lifetime (Phase 4 lifetimes).
 */
final class Dict[K, V] private[builtin] (
  private[builtin] val backing: GDExtensionTypePtr
)(using
  tk: ToVariant[K],
  fk: FromVariant[K],
  tv: ToVariant[V],
  fv: FromVariant[V]
) {
  private def dict: Dictionary = Dictionary.fromPtr(backing)

  def put(key: K, value: V): Unit = dict.put(key, value)
  def apply(key: K): V = dict.get[K, V](key)
  def size: Int = dict.size
}

object Dict {
  /** A new, empty `Dict[K, V]` with a heap-owned backing handle. */
  def empty[K, V](using
    ToVariant[K],
    FromVariant[K],
    ToVariant[V],
    FromVariant[V]
  ): Dict[K, V] = {
    val buf = stdlib
      .malloc(BuiltinSizes.Dictionary.toCSize)
      .asInstanceOf[GDExtensionTypePtr]
    Dictionary.empty(buf)
    new Dict(buf)
  }

  given toVariant[K, V]: ToVariant[Dict[K, V]] =
    (value: Dict[K, V], dest: GDExtensionVariantPtr) =>
      VariantConstructors
        .fromType(GDEXTENSION_VARIANT_TYPE_DICTIONARY)(dest, value.backing)

  given fromVariant[K, V](using
    ToVariant[K],
    FromVariant[K],
    ToVariant[V],
    FromVariant[V]
  ): FromVariant[Dict[K, V]] = (variant: GDExtensionVariantPtr) => {
    val buf = stdlib
      .malloc(BuiltinSizes.Dictionary.toCSize)
      .asInstanceOf[GDExtensionTypePtr]
    VariantConstructors.toType(GDEXTENSION_VARIANT_TYPE_DICTIONARY)(buf, variant)
    new Dict(buf)
  }
}
