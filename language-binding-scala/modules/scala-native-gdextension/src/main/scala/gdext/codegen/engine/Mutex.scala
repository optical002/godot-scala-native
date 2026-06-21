package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `Mutex`, extends `RefCounted`. */
abstract class Mutex extends RefCounted {

  /** Mutex.lock */
  final def lock(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Mutex", "lock", 3218959716L), hostObject.objectPtr)

  /** Mutex.try_lock */
  final def tryLock(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Mutex", "try_lock", 2240911060L), hostObject.objectPtr)

  /** Mutex.unlock */
  final def unlock(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Mutex", "unlock", 3218959716L), hostObject.objectPtr)

}

object Mutex {
  /** Class metadata for Gd[Mutex] lifetime management and casting. */
  given GodotClass[Mutex] with {
    def className = "Mutex"
    def isRefCounted = true
    def wrap(o: GodotObject): Mutex = new Mutex {}.withHost(o.objectPtr)
    def unwrap(t: Mutex): GodotObject = t.hostObject
  }
}
