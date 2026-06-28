package gdext.classes

import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*

import gdext.Godot
import gdext.builtin.{Arr, BuiltinSizes, StringName, Variant}
import gdext.internal.engine.{Gd, MethodBind, Ptrcall}
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

extension (self: Area3D)
  /** `Area3D.get_overlapping_bodies()` — returns the `PhysicsBody3D`s currently
    * overlapping this area (as `Arr[Gd[Node3D]]`). The generator skips it (typed
    * Array return). */
  def getOverlappingBodies(): Arr[Gd[Node3D]] = {
    val bind = MethodBind.get("Area3D", "get_overlapping_bodies", 3995934104L)
    // Array return: an 8-byte Array handle written into the buffer.
    val retBuf = stackalloc[Byte](BuiltinSizes.Array.toUInt)
    Godot.interface.object_method_bind_ptrcall(
      bind,
      self.hostObject.objectPtr,
      null,
      retBuf
    )
    Arr.fromHandle[Gd[Node3D]](retBuf.asInstanceOf[GDExtensionTypePtr])
  }
