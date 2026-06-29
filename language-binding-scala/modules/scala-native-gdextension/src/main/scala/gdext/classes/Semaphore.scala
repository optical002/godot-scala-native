package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `Semaphore`, extends `RefCounted`. */
abstract class Semaphore extends RefCounted {
  override def godotClassName: String = "Semaphore"

  /** Semaphore.try_wait */
  final def tryWait(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Semaphore", "try_wait", 2240911060L), hostObject.objectPtr)

  /** Semaphore.post */
  final def post(count: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Semaphore", "post", 1667783136L), hostObject.objectPtr, count)

}
