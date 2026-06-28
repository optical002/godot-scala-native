package gdext.internal.engine

import gdext.Godot
import gdext.builtin.StringNames
import gdext.internal.ffi.types.*

/**
 * A smart pointer to a Godot object of class `T` — the Scala analogue of
 * gdext's `Gd<T>`.
 *
 * `Gd[T]` is how user code holds engine objects. It carries the raw handle plus
 * the [[GodotClass]] evidence needed to manage lifetime and cast. There are two
 * lifetime regimes, selected by `GodotClass[T].isRefCounted`:
 *
 *  - **Manually-managed** (`Object`/`Node` subtree): the object lives until
 *    something frees it. [[free]] calls `object_destroy`. Nodes added to the
 *    scene tree are owned by their parent, so you typically do NOT free those.
 *
 *  - **Reference-counted** (`RefCounted` subtree, e.g. `Resource`): the object
 *    is freed when its refcount hits zero. A `Gd[T]` holding one represents one
 *    reference; [[unref]] drops it. Scala has no deterministic destructor, so
 *    this is explicit (a `java.lang.ref.Cleaner` hook can be added later to
 *    approximate `Drop`). Construct-time referencing is handled by
 *    [[Gd.fromConstructed]].
 *
 * A null `Gd[T]` ([[isNull]]) is the failed-cast / absent sentinel.
 */
final class Gd[T] private (
  private val handle: GDExtensionObjectPtr,
  private[engine] val cls: GodotClass[T]
) {

  /** The raw object handle. */
  def objectPtr: GDExtensionObjectPtr = handle

  /** The typed wrapper for direct method calls (`gd.get.setPosition(...)`). */
  def get: T = cls.wrap(GodotObject.fromPtr(handle))

  def isNull: Boolean = handle == null

  /** Godot's stable instance id for this object (0 if null). */
  def instanceId: Long =
    if (isNull) 0L
    else Godot.interface.object_get_instance_id(handle).toLong

  /** Godot's stable instance id as a typed [[InstanceId]] (null sentinel if
    * null). Prefer this over [[instanceId]] when handing the id to identity-keyed
    * APIs. */
  def instanceIdTyped: InstanceId =
    if (isNull) InstanceId.none else InstanceId.fromI64(instanceId)

  /**
   * Free a manually-managed object via `object_destroy`. No-op (with a warning
   * path later) for reference-counted objects — use [[unref]] for those.
   */
  def free(): Unit =
    if (!isNull && !cls.isRefCounted)
      Godot.interface.object_destroy(handle)

  /** Drop one reference on a reference-counted object (frees at zero). */
  def unref(): Unit =
    if (!isNull && cls.isRefCounted)
      Gd.callRefMethod(handle, "unreference")

  /**
   * Take one strong reference on a reference-counted object, keeping it alive
   * for as long as this `Gd[T]` is held. No-op for manually-managed objects
   * (nodes), which are not refcounted.
   *
   * This is what makes a long-lived `Gd[T]`/`Tres[T]` over a Resource behave
   * like gdext's `Gd<T>`: holding the smart pointer holds a reference. The
   * binding calls this when a Resource handle is read out of an OBJECT Variant
   * to be stored in an export field — otherwise, once Godot drops the loader's
   * temporary reference, the resource's refcount hits zero and it is freed,
   * leaving the export pointing at a dangling/reused handle.
   */
  def reference(): Gd[T] = {
    if (!isNull && cls.isRefCounted)
      Gd.callRefMethod(handle, "reference")
    this
  }

  /**
   * Cast to a (super- or sub-) class `U`. Returns a null `Gd[U]` if the object
   * is not actually a `U`. Uses `object_cast_to` with `U`'s class tag.
   */
  def cast[U](using target: GodotClass[U]): Gd[U] = {
    if (isNull) Gd.nullOf[U]
    else {
      val tag = ClassTags.tag(target.className)
      val casted = Godot.interface.object_cast_to(handle, tag)
      if (casted == null) Gd.nullOf[U]
      else new Gd[U](casted, target)
    }
  }

  override def toString: String =
    if (isNull) s"Gd[${cls.className}](null)"
    else s"Gd[${cls.className}]#$instanceId"
}

object Gd {
  import gdext.builtin.{ToVariant, FromVariant}

  /** Wrap a raw handle with explicit class evidence (no ownership change). */
  def fromHandle[T](
    handle: GDExtensionObjectPtr
  )(using cls: GodotClass[T]): Gd[T] =
    new Gd[T](handle, cls)

  /**
   * OBJECT-Variant marshalling for a live object reference, so a `Gd[T]` can be
   * a [[gdext.builtin.Dict]] key or value. A null handle
   * round-trips as an empty (NIL) object Variant.
   */
  given toVariant[T]: ToVariant[Gd[T]] =
    (value, dest) => ObjectVariant.write(value.objectPtr, dest)
  given fromVariant[T](using GodotClass[T]): FromVariant[Gd[T]] =
    v => Gd.fromHandle[T](ObjectVariant.read(v))

  /** A null `Gd[T]`. */
  def nullOf[T](using cls: GodotClass[T]): Gd[T] = new Gd[T](null, cls)

  /**
   * Construct a brand-new engine object of class `T` and take ownership.
   *
   * For reference-counted classes this initialises the reference
   * (`init_ref`) so the returned `Gd[T]` holds the first reference.
   */
  def newInstance[T](using cls: GodotClass[T]): Gd[T] = {
    val handle = Godot.interface.classdb_construct_object2(
      StringNames.cached(cls.className).ptr
    )
    if (cls.isRefCounted && handle != null)
      callRefMethod(handle, "init_ref")
    new Gd[T](handle, cls)
  }

  // RefCounted.init_ref / reference / unreference all share this hash (same
  // signature: () -> bool). Resolved by name, so the shared hash is fine.
  private final val RefMethodHash = 2240911060L

  private[engine] def callRefMethod(
    handle: GDExtensionObjectPtr,
    name: String
  ): Unit = {
    val bind = MethodBind.get("RefCounted", name, RefMethodHash)
    if (bind != null) Ptrcall.call0[Boolean](bind, handle)
  }
}
