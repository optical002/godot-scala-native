package gdext.register

import gdext.builtin.{Arr, Dict, ToVariant, FromVariant}
import gdext.engine.*
import gdext.classes.{Node, PackedScene, Resource}

/**
 * The "zero value" for an exportable type — what a registered class's
 * constructor parameter is initialised to when the user does **not** write an
 * explicit default. Godot constructs instances with no arguments, so every
 * primary-ctor param needs *some* value; this typeclass supplies the natural
 * empty/null one per type, so a game class can declare
 *
 * {{{ final class Player(var projectile: Gd[Projectile]) extends Node2D }}}
 *
 * with no `= Gd.nullOf`. The `@gdexport` macro's instance factory summons a
 * `DefaultValue[A]` for any param lacking a user default (see Register.scala);
 * an explicit `= ...` always takes precedence. Mirrors the supported export
 * types in [[ExportType]] / [[RefLeaf]].
 */
trait DefaultValue[A] { def default: A }

object DefaultValue {
  def apply[A](using d: DefaultValue[A]): DefaultValue[A] = d
  def of[A](a: => A): DefaultValue[A] = new DefaultValue[A] { def default = a }

  // --- primitives ---------------------------------------------------------
  given DefaultValue[Long]    = of(0L)
  given DefaultValue[Int]     = of(0)
  given DefaultValue[Double]  = of(0.0)
  given DefaultValue[Float]   = of(0.0f)
  given DefaultValue[Boolean] = of(false)
  given DefaultValue[String]  = of("")

  // --- reference optionality ---------------------------------------------
  given optDefault[A]: DefaultValue[Option[A]] = of(None)
  given reqDefault[A]: DefaultValue[Required[A]] = of(Required.unassigned[A])

  // --- wrapped references -------------------------------------------------
  given gdDefault[T](using GodotClass[T]): DefaultValue[Gd[T]] =
    of(Gd.nullOf[T])
  given tresDefault[T](using GodotClass[T]): DefaultValue[Tres[T]] =
    of(Tres.unassigned[T])
  given tscnDefault[T](using GodotClass[T], GodotClass[PackedScene]): DefaultValue[Tscn[T]] =
    of(Tscn.unassigned[T])

  // --- bare node/resource shorthand (== Required, null at runtime) --------
  given bareNodeDefault[T <: Node](using cls: GodotClass[T]): DefaultValue[T] =
    of(cls.wrap(GodotObject.fromPtr(null)))
  given bareResourceDefault[T <: Resource](using cls: GodotClass[T]): DefaultValue[T] =
    of(cls.wrap(GodotObject.fromPtr(null)))

  // --- typed dictionary ---------------------------------------------------
  given dictDefault[K, V](using
    ToVariant[K], FromVariant[K], ToVariant[V], FromVariant[V]
  ): DefaultValue[Dict[K, V]] = of(Dict.empty[K, V])

  // --- typed array --------------------------------------------------------
  // Build a Godot-typed Array (element type from ExportType[A]) so the inspector
  // defaults added rows to the element's zero value (e.g. "") not <null>.
  given arrDefault[A](using
    et: ExportType[A], tv: ToVariant[A], fv: FromVariant[A]
  ): DefaultValue[Arr[A]] =
    of(Arr.emptyTyped[A](et.variantType, et.className))
}
