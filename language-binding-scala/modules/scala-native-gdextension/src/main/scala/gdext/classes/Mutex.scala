package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `Mutex`, extends `RefCounted`. */
abstract class Mutex extends RefCounted {
  override def godotClassName: String = "Mutex"

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
