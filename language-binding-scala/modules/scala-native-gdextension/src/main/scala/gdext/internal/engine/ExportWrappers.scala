package gdext.internal.engine

import gdext.classes.PackedScene
import gdext.internal.register.GodotScriptClass

/**
 * Export wrapper types used to give exported reference fields precise meaning.
 *
 * An engine reference is now held as its plain wrapper type `T` (a
 * `GodotScriptClass`), so these wrappers carry that value directly (a `null`
 * reference is the absent sentinel):
 *   - `Option[X]`   — may be empty; the editor allows leaving it unassigned.
 *   - `Required[X]` — intended to be assigned; runtime access via [[get]] throws
 *     if it is still unassigned. Bare `X` (no wrapper) is treated as `Required`.
 *
 * The asset kind is chosen by the inner type:
 *   - bare `T <: Node`     — a live node/object reference.
 *   - `Tres[T]`            — a typed Resource reference.
 *   - `Tscn[T]`            — a PackedScene whose root node is `T`.
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

/** A typed Resource reference (export hint RESOURCE_TYPE = `T`). Holds the bare
  * resource wrapper directly; a `null` `raw` is unassigned. */
final class Tres[T <: GodotScriptClass] private[engine] (val raw: T) {
  def isAssigned: Boolean = raw != null
  def get: T = raw
  def toOption: Option[T] = if (raw == null) None else Some(raw)
}
object Tres {
  import gdext.builtin.{ToVariant, FromVariant}

  def apply[T <: GodotScriptClass](value: T): Tres[T] = new Tres(value)
  def unassigned[T <: GodotScriptClass]: Tres[T] = new Tres(null.asInstanceOf[T])

  /**
   * OBJECT-Variant marshalling for a typed resource reference, so a `Tres[T]`
   * can be a [[gdext.builtin.Dict]] key or value. A null `raw` round-trips as an
   * empty (NIL) object Variant.
   */
  given toVariant[T <: GodotScriptClass]: ToVariant[Tres[T]] =
    (value, dest) =>
      ObjectVariant.write(
        if (value.raw == null) null else value.raw.hostPtr,
        dest
      )
  given fromVariant[T <: GodotScriptClass](using meta: ClassMeta[T]): FromVariant[Tres[T]] =
    v => {
      val handle = ObjectVariant.read(v)
      val wrapped = meta.fromHandle(handle)
      if (wrapped != null) wrapped.refInc()
      Tres(wrapped)
    }
}

/**
 * A PackedScene typed by its root node type `T`. Editor-side filtering to scenes
 * whose root is `T` is provided by the inspector plugin; here the type gives a
 * typed [[instantiate]] and a runtime root-type check.
 */
final class Tscn[T <: GodotScriptClass] private[engine] (val raw: PackedScene)(using
  rootMeta: ClassMeta[T]
) {
  def isAssigned: Boolean = raw != null

  /** The required root node type's class name (the editor filter target). */
  def rootClassName: String = rootMeta.className

  /**
   * Instantiate the scene and return its root as `T`. Returns `null` if
   * unassigned or if the actual root is not a `T` (runtime root-type guard).
   */
  def instantiate(): T =
    if (raw == null) null.asInstanceOf[T]
    else {
      val root = raw.instantiate(0L)
      // `root` is a GodotObject handle; wrap then cast to the declared root type.
      rootMeta.fromHandle(root.objectPtr).cast[T]
    }

  /**
   * Instantiate the scene and add its root as a child of `parent`, returning the
   * root as `T`. `T` must be a node type (so its root can be parented); a null
   * parent or unassigned scene yields `null`.
   */
  def instantiate(parent: gdext.classes.Node): T = {
    val child = instantiate()
    if (child != null && parent != null)
      child match {
        case n: gdext.classes.Node => parent.addChild(n, false, 0L)
        case _                     => ()
      }
    child
  }
}
object Tscn {
  def apply[T <: GodotScriptClass](packed: PackedScene)(using ClassMeta[T]): Tscn[T] =
    new Tscn[T](packed)
  def unassigned[T <: GodotScriptClass](using ClassMeta[T]): Tscn[T] =
    new Tscn[T](null.asInstanceOf[PackedScene])
}
