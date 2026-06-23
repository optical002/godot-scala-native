package gdext.internal.register

import gdext.builtin.*
import gdext.internal.engine.*
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

  // --- math value types ---------------------------------------------------
  // Natural zero for each fixed-layout math builtin, so they can be used as a
  // bare `var` ctor param (auto-export) with no explicit `= ...`. Mirrors the
  // exportable math types in [[ExportType]].
  private val v2  = Vector2(0f, 0f)
  private val v2i = Vector2i(0, 0)
  private val v3  = Vector3(0f, 0f, 0f)
  private val v3i = Vector3i(0, 0, 0)
  private val v4  = Vector4(0f, 0f, 0f, 0f)
  given DefaultValue[Color]       = of(Color(0f, 0f, 0f, 1f))
  given DefaultValue[Vector2]     = of(v2)
  given DefaultValue[Vector2i]    = of(v2i)
  given DefaultValue[Vector3]     = of(v3)
  given DefaultValue[Vector3i]    = of(v3i)
  given DefaultValue[Vector4]     = of(v4)
  given DefaultValue[Vector4i]    = of(Vector4i(0, 0, 0, 0))
  given DefaultValue[Rect2]       = of(Rect2(v2, v2))
  given DefaultValue[Rect2i]      = of(Rect2i(v2i, v2i))
  given DefaultValue[Quaternion]  = of(Quaternion(0f, 0f, 0f, 1f))
  given DefaultValue[Plane]       = of(Plane(0f, 0f, 0f, 0f))
  given DefaultValue[AABB]        = of(AABB(v3, v3))
  // Identity basis / transforms — Godot's own defaults for these properties.
  private val identityBasis = Basis(Vector3(1f, 0f, 0f), Vector3(0f, 1f, 0f), Vector3(0f, 0f, 1f))
  given DefaultValue[Basis]       = of(identityBasis)
  given DefaultValue[Transform2D] = of(Transform2D(Vector2(1f, 0f), Vector2(0f, 1f), v2))
  given DefaultValue[Transform3D] = of(Transform3D(identityBasis, v3))
  given DefaultValue[Projection]  = of(Projection(
    Vector4(1f, 0f, 0f, 0f), Vector4(0f, 1f, 0f, 0f),
    Vector4(0f, 0f, 1f, 0f), Vector4(0f, 0f, 0f, 1f)
  ))

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
