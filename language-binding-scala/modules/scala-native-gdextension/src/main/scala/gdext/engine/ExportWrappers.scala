package gdext.engine

import gdext.codegen.engine.PackedScene

/**
 * Export wrapper types used to give exported reference fields precise meaning.
 *
 * For reference exports (nodes/resources/scenes) the optionality is explicit:
 *   - `Option[X]`   — may be empty; the editor allows leaving it unassigned.
 *   - `Required[X]` — intended to be assigned; runtime access via [[get]] throws
 *     if it is still unassigned. Bare `X` (no wrapper) is treated as `Required`.
 *
 * The asset kind is chosen by the inner type:
 *   - `Gd[T]`   — a live node/object reference.
 *   - `Tres[T]` — a typed Resource reference.
 *   - `Tscn[T]` — a PackedScene whose root node is `T` (typed instantiation).
 */

/** A reference that is meant to be assigned; [[get]] throws if unassigned. */
final class Required[A] private (val toOption: Option[A]) {
  def isAssigned: Boolean = toOption.isDefined
  def get: A =
    toOption.getOrElse(
      throw new NoSuchElementException("Required export is unassigned")
    )
  override def toString: String =
    toOption.fold("Required(unassigned)")(v => s"Required($v)")
}
object Required {
  def apply[A](value: A): Required[A] = new Required(Some(value))
  def unassigned[A]: Required[A] = new Required(None)
}

/** A typed Resource reference (export hint RESOURCE_TYPE = `T`). */
final class Tres[T] private[engine] (val raw: Gd[T]) {
  def isAssigned: Boolean = !raw.isNull
  def get: Gd[T] = raw
  def toOption: Option[Gd[T]] = if (raw.isNull) None else Some(raw)
}
object Tres {
  import gdext.builtin.{ToVariant, FromVariant}

  def apply[T](g: Gd[T]): Tres[T] = new Tres(g)
  def unassigned[T](using cls: GodotClass[T]): Tres[T] = new Tres(Gd.nullOf[T])

  /**
   * OBJECT-Variant marshalling for a typed resource reference, so a `Tres[T]`
   * can be a [[gdext.builtin.Dict]] key or value. A null
   * `raw` round-trips as an empty (NIL) object Variant.
   */
  given toVariant[T]: ToVariant[Tres[T]] =
    (value, dest) => ObjectVariant.write(value.raw.objectPtr, dest)
  given fromVariant[T](using GodotClass[T]): FromVariant[Tres[T]] =
    v => Tres(Gd.fromHandle[T](ObjectVariant.read(v)))
}

/**
 * A PackedScene typed by its root node type `T`. Editor-side filtering to scenes
 * whose root is `T` is provided by the inspector plugin (Phase E); here the type
 * gives a typed [[instantiate]] and a runtime root-type check.
 */
final class Tscn[T] private[engine] (val raw: Gd[PackedScene])(using
  rootCls: GodotClass[T]
) {
  def isAssigned: Boolean = !raw.isNull

  /** The required root node type's class name (the editor filter target). */
  def rootClassName: String = rootCls.className

  /**
   * Instantiate the scene and return its root as `Gd[T]`. Returns a null `Gd[T]`
   * if unassigned or if the actual root is not a `T` (runtime root-type guard).
   */
  def instantiate(): Gd[T] =
    if (raw.isNull) Gd.nullOf[T]
    else Gd.fromHandle[T](raw.get.instantiate(0L).objectPtr).cast[T]
}
object Tscn {
  def apply[T](packed: Gd[PackedScene])(using GodotClass[T]): Tscn[T] =
    new Tscn[T](packed)
  def unassigned[T](using GodotClass[T], GodotClass[PackedScene]): Tscn[T] =
    new Tscn[T](Gd.nullOf[PackedScene])
}
