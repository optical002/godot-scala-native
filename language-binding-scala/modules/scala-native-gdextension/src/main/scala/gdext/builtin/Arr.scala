package gdext.builtin

import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import scala.scalanative.libc.stdlib
import gdext.codegen.gdextensioninterface.types.*
import gdext.codegen.gdextensioninterface.types.GDExtensionVariantType.*

/**
 * A typed view over Godot's [[GArray]] — `Arr[A]`. Elements marshal through the
 * [[ToVariant]]/[[FromVariant]] seam, so any builtin- or (where a given exists)
 * object-convertible `A` works. The sibling of [[Dict]] for sequences.
 *
 * The backing 8-byte Array handle is heap-owned so an `Arr` can live in a class
 * field (an exported property) for the object's lifetime. As with the rest of
 * the binding, freeing is explicit / process-lifetime (Phase 4 lifetimes).
 */
final class Arr[A] private[builtin] (
  private[builtin] val backing: GDExtensionTypePtr
)(using
  tv: ToVariant[A],
  fv: FromVariant[A]
) {
  private def array: GArray = GArray.fromPtr(backing)

  def append(value: A): Unit = array.pushBack(value)
  def apply(i: Int): A = array.get[A](i)
  def size: Int = array.size
}

object Arr {
  /** A new, empty `Arr[A]` with a heap-owned backing handle. */
  def empty[A](using ToVariant[A], FromVariant[A]): Arr[A] = {
    val buf = stdlib
      .malloc(BuiltinSizes.Array.toCSize)
      .asInstanceOf[GDExtensionTypePtr]
    GArray.empty(buf)
    new Arr(buf)
  }

  /**
   * A new, empty Godot-**typed** `Arr[A]` — the backing Array carries its element
   * type, so the inspector fills added rows with the type default (e.g. `""`)
   * rather than `<null>`. `elemType`/`className` come from the field's
   * `ExportType[A]` at the call site (see `DefaultValue.arrDefault`).
   */
  def emptyTyped[A](
    elemType: GDExtensionVariantType,
    className: String
  )(using ToVariant[A], FromVariant[A]): Arr[A] = {
    val buf = stdlib
      .malloc(BuiltinSizes.Array.toCSize)
      .asInstanceOf[GDExtensionTypePtr]
    GArray.emptyTyped(buf, elemType, className)
    new Arr(buf)
  }

  given toVariant[A]: ToVariant[Arr[A]] =
    (value: Arr[A], dest: GDExtensionVariantPtr) =>
      VariantConstructors
        .fromType(GDEXTENSION_VARIANT_TYPE_ARRAY)(dest, value.backing)

  given fromVariant[A](using
    ToVariant[A],
    FromVariant[A]
  ): FromVariant[Arr[A]] = (variant: GDExtensionVariantPtr) => {
    val buf = stdlib
      .malloc(BuiltinSizes.Array.toCSize)
      .asInstanceOf[GDExtensionTypePtr]
    VariantConstructors.toType(GDEXTENSION_VARIANT_TYPE_ARRAY)(buf, variant)
    new Arr(buf)
  }
}
