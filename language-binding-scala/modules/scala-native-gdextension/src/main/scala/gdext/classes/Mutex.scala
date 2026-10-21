package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Mutex`, extends `RefCounted`. */
abstract class Mutex extends RefCounted {
  override def godotClassName: String = "Mutex"

  /** Mutex.lock */
  final def lock(): Unit = {
    if (gdext.classes.Mutex.mb_lock == null) gdext.classes.Mutex.mb_lock = MethodBind.get("Mutex", "lock", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Mutex.mb_lock, livePtr)
  }

  /** Mutex.try_lock */
  final def tryLock(): Boolean = {
    if (gdext.classes.Mutex.mb_try_lock == null) gdext.classes.Mutex.mb_try_lock = MethodBind.get("Mutex", "try_lock", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.Mutex.mb_try_lock, livePtr)
  }

  /** Mutex.unlock */
  final def unlock(): Unit = {
    if (gdext.classes.Mutex.mb_unlock == null) gdext.classes.Mutex.mb_unlock = MethodBind.get("Mutex", "unlock", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Mutex.mb_unlock, livePtr)
  }

}

object Mutex {
  private[classes] var mb_lock: GDExtensionMethodBindPtr = null
  private[classes] var mb_try_lock: GDExtensionMethodBindPtr = null
  private[classes] var mb_unlock: GDExtensionMethodBindPtr = null
}
