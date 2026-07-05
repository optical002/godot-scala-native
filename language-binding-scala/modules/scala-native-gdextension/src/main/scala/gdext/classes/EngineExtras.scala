package gdext.classes

import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*

import gdext.Godot
import gdext.builtin.{Arr, BuiltinSizes, FromVariant, StringName, StringNames, ToVariant, Variant}
import gdext.internal.engine.{MethodBind, Ptrcall}
import gdext.internal.ffi.types.*

/** Hand-written engine-method wrappers for methods the interface generator
  * skips because their arg/return types (`Variant`, typed `Array`) aren't in its
  * supported set. These mirror the generated wrappers' shape (resolve a
  * `MethodBind` by class/name/hash, then ptrcall against `hostObject`).
  *
  * Hashes come from `gdextension/extension_api.json`.
  */

extension (self: Object)
  /** `Object.set(property, value)` — generic property write (Variant-typed). */
  def set(property: StringName, value: Variant): Unit =
    Ptrcall.callVoid2[StringName, Variant](
      MethodBind.get("Object", "set", 3776071444L),
      self.hostObject.objectPtr,
      property,
      value
    )

  /** `Object.get(property)` — generic property read (returns a Variant the
    * caller must `destroy()` when done). */
  def get(property: StringName): Variant =
    Ptrcall.call1[StringName, Variant](
      MethodBind.get("Object", "get", 2760726917L),
      self.hostObject.objectPtr,
      property
    )

  /** [[get]] decoded straight to `A`; the intermediate Variant is destroyed
    * here, so no manual `get -> to -> destroy` dance at the call site. */
  def getAs[A](property: StringName)(using FromVariant[A]): A = {
    val v = self.get(property)
    try v.to[A]
    finally v.destroy()
  }

  /** [[set]] from a plain Scala value; the Variant round-trip (build, write,
    * destroy) is handled here. */
  def set[A](property: StringName, value: A)(using ToVariant[A]): Unit =
    Variant.scope(value)(v => self.set(property, v))

  /** `Object.connect(signal, callable, flags)` — connect a built-in (or
    * `@signal`) signal to a `Callable` (typically `Callable(self, "method")`).
    * Returns the engine `Error` code as a `Long`. The generator skips it
    * (Callable arg). */
  def connect(signal: StringName, callable: gdext.builtin.Callable, flags: Long): Long =
    Ptrcall.call3[StringName, gdext.builtin.Callable, Long, Long](
      MethodBind.get("Object", "connect", 1518946055L),
      self.hostObject.objectPtr,
      signal,
      callable,
      flags
    )

  /** Connect `signal` on this object to `target.method` (a registered `@func`).
    * Builds the `Callable(target, method)` and connects it. */
  def connectMethod(signal: StringName, target: Object, method: StringName): Long = {
    val buf = stackalloc[Byte](gdext.builtin.BuiltinSizes.Callable.toUInt)
    val callable = gdext.builtin.Callable.of(target.hostObject.objectPtr, method, buf)
    self.connect(signal, callable, 0L)
  }

  /** Connect a named built-in [[SignalName]] to `target.method`. */
  def connectMethod(signal: SignalName, target: Object, method: StringName): Long =
    self.connectMethod(StringNames.cached(signal.godotName), target, method)

  /** Connect `signal` on this object directly to a Scala closure — no registered
    * `@func` method needed. The closure is held alive (via a custom
    * [[gdext.internal.engine.CustomCallable]]) for as long as the connection
    * exists, and dropped when Godot frees the Callable on disconnect. */
  def connect(signal: StringName, handler: () => Unit): Long = {
    val buf = stackalloc[Byte](gdext.builtin.BuiltinSizes.Callable.toUInt)
    val callable = gdext.internal.engine.CustomCallable.of(handler, buf)
    self.connect(signal, callable, 0L)
  }

  /** Connect a named built-in [[SignalName]] directly to a Scala closure. */
  def connect(signal: SignalName, handler: () => Unit): Long =
    self.connect(StringNames.cached(signal.godotName), handler)

extension (self: AnimationTree)
  /** The root state machine's playback object (the tree's `parameters/playback`
    * property), typed — no hardcoded property string or Variant handling at the
    * call site. */
  def stateMachinePlayback: AnimationNodeStateMachinePlayback =
    self.getAs[AnimationNodeStateMachinePlayback](StringNames.cached("parameters/playback"))

  /** Cached `parameters/<part>/<part>/...` property path for [[get]]/[[set]] on
    * this tree (e.g. `tree.paramPath(state, "Blend2/blend_amount")`). */
  def paramPath(parts: String*): StringName =
    StringNames.cached(parts.mkString("parameters/", "/", ""))

  /** [[paramPath]] to one of a OneShot node's [[OneShotParam]] parameters. */
  def paramPath(state: String, node: String, param: OneShotParam): StringName =
    self.paramPath(state, node, param.godotName)

/** `AnimationNodeOneShot.OneShotRequest` values, for driving a OneShot node's
  * `request` parameter through [[set]] (the enum isn't surfaced by the
  * generated wrappers). */
object OneShotRequest {
  final val None = 0L
  final val Fire = 1L
  final val Abort = 2L
  final val FadeOut = 3L
}

/** The runtime parameters an `AnimationNodeOneShot` exposes under
  * `parameters/<state>/<node>/`, so OneShot property paths can be built without
  * hardcoded strings (see the [[paramPath]] overload taking one of these).
  * `Request` is written with an [[OneShotRequest]] value; `Active` reads the
  * one-shot's playing state. */
enum OneShotParam(val godotName: String) {
  case Request extends OneShotParam("request")
  case Active extends OneShotParam("active")
  case InternalActive extends OneShotParam("internal_active")
  case FadeInRemaining extends OneShotParam("fade_in_remaining")
  case FadeOutRemaining extends OneShotParam("fade_out_remaining")
  case TimeToRestart extends OneShotParam("time_to_restart")
}

extension (self: Area3D)
  /** `Area3D.get_overlapping_bodies()` — returns the `PhysicsBody3D`s currently
    * overlapping this area (as `Arr[Node3D]`). The generator skips it (typed
    * Array return). */
  def getOverlappingBodies(): Arr[Node3D] = {
    val bind = MethodBind.get("Area3D", "get_overlapping_bodies", 3995934104L)
    // Array return: an 8-byte Array handle written into the buffer.
    val retBuf = stackalloc[Byte](BuiltinSizes.Array.toUInt)
    Godot.interface.object_method_bind_ptrcall(
      bind,
      self.hostObject.objectPtr,
      null,
      retBuf
    )
    Arr.fromHandle[Node3D](retBuf.asInstanceOf[GDExtensionTypePtr])
  }

extension (self: PackedScene)
  /** Instantiate this scene and add its root (typed as `T`) as a child of
    * `parent`, returning the root. Equivalent to wrapping the scene in a
    * `Tscn[T]` and calling its parenting `instantiate`; the typed convenience a
    * `@export var scene: Tscn[T]` already gives, but for a `PackedScene` value
    * resolved at runtime (e.g. from a prefab lookup). */
  def instantiateAsChild[T <: gdext.internal.register.GodotScriptClass](
    parent: Node
  )(using gdext.internal.engine.ClassMeta[T]): T =
    gdext.internal.engine.Tscn[T](self).instantiate(parent)
