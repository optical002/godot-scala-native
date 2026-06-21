package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `Semaphore`, extends `RefCounted`. */
abstract class Semaphore extends RefCounted {

  /** Semaphore.try_wait */
  final def tryWait(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Semaphore", "try_wait", 2240911060L), hostObject.objectPtr)

  /** Semaphore.post */
  final def post(count: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Semaphore", "post", 1667783136L), hostObject.objectPtr, count)

}

object Semaphore {
  /** Class metadata for Gd[Semaphore] lifetime management and casting. */
  given GodotClass[Semaphore] with {
    def className = "Semaphore"
    def isRefCounted = true
    def wrap(o: GodotObject): Semaphore = new Semaphore {}.withHost(o.objectPtr)
    def unwrap(t: Semaphore): GodotObject = t.hostObject
  }
}
