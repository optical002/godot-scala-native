package gdext.internal.register

import gdext.Godot
import gdext.builtin.StringNames
import gdext.internal.engine.{GodotObject, InstanceId, ClassMeta, ClassTags, MethodBind, Ptrcall}
import gdext.classes.InputEvent
import gdext.internal.ffi.types.*

/**
 * Root base for everything in the engine class hierarchy.
 *
 * Generated engine classes extend this (transitively via `Object`), and user
 * classes extend an engine class (`class Player extends Node2D`). It carries the
 * engine-object handle every instance is backed by, the lifetime operations
 * (`free`/`unref`/`reference`/`cast`), the overridable engine virtuals, and the
 * small plumbing the generated wrappers and registration use.
 *
 * Since every wrapper IS a handle-carrying object, there is no separate smart
 * pointer: you hold an engine object as its plain wrapper type (`Node2D`,
 * `PlayerStats`) and call these methods directly on it. A `null` reference is the
 * absent / failed-cast sentinel.
 *
 * Two ways an instance gets its handle:
 *  - a **user class** is constructed by Godot via the create callback, which
 *    calls [[setHostObject]];
 *  - a wrapper around a **fetched** object (e.g. from a `ClassMeta.fromHandle` or
 *    a singleton) is built then handed a handle via [[withHost]].
 */
abstract class GodotScriptClass {

  private var _hostObject: GDExtensionObjectPtr = null

  /** The Godot class name for this instance. Engine wrappers override with the
    * baked literal; user classes fall back to their Scala simple name (which is
    * how registration names them). */
  def godotClassName: String = getClass.getSimpleName

  /** The engine-side object handle for this instance. */
  final def hostObject: GodotObject = GodotObject.fromPtr(_hostObject)

  /** The raw handle, as the engine pointer type (used by generated methods). */
  private[gdext] def hostPtr: GDExtensionObjectPtr = _hostObject

  private[register] def setHostObject(o: GDExtensionObjectPtr): Unit =
    _hostObject = o

  /** Set the handle and return `this` (fluent, for wrapping fetched objects). */
  final def withHost(o: GDExtensionObjectPtr): this.type = {
    _hostObject = o
    this
  }

  /** True if this object is reference-counted (`RefCounted` subtree, e.g. a
    * `Resource`) vs manually-managed (`Object`/`Node` subtree). Drives the
    * lifetime methods below. */
  final def isRefCounted: Boolean =
    this.isInstanceOf[gdext.classes.RefCounted]

  /** This object's stable Godot [[InstanceId]] (the null sentinel if unbound).
    * Mirrors `Object.get_instance_id`, but typed — pass it to APIs that key off a
    * node's identity. */
  final def instanceId: InstanceId =
    if (_hostObject == null) InstanceId.none
    else InstanceId.fromI64(Godot.interface.object_get_instance_id(_hostObject).toLong)

  /**
   * Free a manually-managed object via `object_destroy`. No-op for
   * reference-counted objects — use [[unref]] for those.
   */
  def free(): Unit =
    if (_hostObject != null && !isRefCounted)
      Godot.interface.object_destroy(_hostObject)

  /** Drop one reference on a reference-counted object (frees at zero). */
  def unref(): Unit =
    if (_hostObject != null && isRefCounted)
      GodotScriptClass.callRefMethod(_hostObject, "unreference")

  /**
   * Take one strong reference on a reference-counted object, keeping it alive for
   * as long as this wrapper is held. No-op for manually-managed objects (nodes).
   * Returns `this` for fluent use. (Named `refInc` rather than `reference` to
   * avoid clashing with the generated `RefCounted.reference(): Boolean` engine
   * method.)
   *
   * The binding calls this when a Resource handle is read out of an OBJECT
   * Variant to be stored in an export field — otherwise, once Godot drops the
   * loader's temporary reference, the resource's refcount hits zero and it is
   * freed, leaving the export pointing at a dangling/reused handle.
   */
  def refInc(): this.type = {
    if (_hostObject != null && isRefCounted)
      GodotScriptClass.callRefMethod(_hostObject, "reference")
    this
  }

  /**
   * Cast to a (super- or sub-) class `U`. Returns `null` if the object is not
   * actually a `U`. Uses `object_cast_to` with `U`'s class tag — a real engine
   * type check, not a Scala cast.
   */
  def cast[U <: GodotScriptClass](using meta: ClassMeta[U]): U =
    if (_hostObject == null) null.asInstanceOf[U]
    else {
      val tag = ClassTags.tag(meta.className)
      val casted = Godot.interface.object_cast_to(_hostObject, tag)
      if (casted == null) null.asInstanceOf[U]
      else meta.fromHandle(casted)
    }

  // --- overridable engine virtuals (no-op defaults) ---------------------

  /** Called when the node enters the scene tree and is ready. */
  def _ready(): Unit = ()

  /** Called every rendered frame; `delta` is seconds since the last frame. */
  def _process(delta: Double): Unit = ()

  /** Called every physics frame; `delta` is the fixed physics step. */
  def _physics_process(delta: Double): Unit = ()

  // --- input virtuals (Node) --------------------------------------------
  // Each receives the engine `InputEvent` directly as its wrapper type (a
  // borrowed handle; the binding does not free it). Dispatch is wired in
  // ClassRegistration alongside the other node virtuals.

  /** Called for every unhandled-or-not input event (`Node._input`). */
  def _input(event: InputEvent): Unit = ()

  /** Called for shortcut input before `_unhandled_input` (`Node._shortcut_input`). */
  def _shortcut_input(event: InputEvent): Unit = ()

  /** Called for input not consumed by the UI (`Node._unhandled_input`). */
  def _unhandled_input(event: InputEvent): Unit = ()

  /** Called for unhandled key input (`Node._unhandled_key_input`). */
  def _unhandled_key_input(event: InputEvent): Unit = ()

  // --- editor virtuals (EditorPlugin / EditorInspectorPlugin / EditorProperty)
  // No-op defaults; only the binding's editor classes override these. Dispatch
  // for them is wired in ClassRegistration alongside the node virtuals.

  /** EditorPlugin/Node: entered the (editor) tree. */
  def _enter_tree(): Unit = ()

  /** EditorPlugin/Node: leaving the (editor) tree. */
  def _exit_tree(): Unit = ()

  /** EditorInspectorPlugin: can this plugin handle `obj`'s inspector? */
  def _can_handle(obj: GodotObject): Boolean = false

  /**
   * EditorInspectorPlugin: inspect one property. Return true to take it over
   * (after calling addPropertyEditor), false to let the default editor render.
   */
  def _parse_property(
    obj: GodotObject,
    varType: Long,
    name: String,
    hintType: Long,
    hintString: String,
    usage: Long,
    wide: Boolean
  ): Boolean = false

  /** EditorProperty: refresh the widget from the edited property's value. */
  def _update_property(): Unit = ()
}

object GodotScriptClass {
  import gdext.builtin.{ToVariant, FromVariant}
  import gdext.internal.engine.ObjectVariant

  // RefCounted.init_ref / reference / unreference all share this hash (same
  // signature: () -> bool). Resolved by name, so the shared hash is fine.
  private final val RefMethodHash = 2240911060L

  private[gdext] def callRefMethod(
    handle: GDExtensionObjectPtr,
    name: String
  ): Unit = {
    val bind = MethodBind.get("RefCounted", name, RefMethodHash)
    if (bind != null) Ptrcall.call0[Boolean](bind, handle)
  }

  /**
   * OBJECT-Variant marshalling for a live engine reference, so an engine object
   * held as its plain wrapper type can be a [[gdext.builtin.Dict]] /
   * [[gdext.builtin.Arr]] element. A null reference round-trips as an empty (NIL)
   * object Variant. These givens live in this base companion so implicit search
   * finds them for any `T <: GodotScriptClass` (every engine/user class) without
   * an import. The `from` side preserves instance identity and takes a reference
   * for RefCounted payloads.
   */
  given toVariant[T <: GodotScriptClass]: ToVariant[T] =
    (value, dest) =>
      ObjectVariant.write(if (value == null) null else value.hostPtr, dest)

  given fromVariant[T <: GodotScriptClass](using meta: ClassMeta[T]): FromVariant[T] =
    v => {
      val handle = ObjectVariant.read(v)
      val wrapped = meta.fromHandle(handle)
      if (wrapped != null) wrapped.refInc() else wrapped
    }
}
