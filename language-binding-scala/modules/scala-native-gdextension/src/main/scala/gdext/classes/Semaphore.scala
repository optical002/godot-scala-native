package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Semaphore`, extends `RefCounted`. */
abstract class Semaphore extends RefCounted {
  override def godotClassName: String = "Semaphore"

  /** Semaphore.try_wait */
  final def tryWait(): Boolean = {
    if (gdext.classes.Semaphore.mb_try_wait == null) gdext.classes.Semaphore.mb_try_wait = MethodBind.get("Semaphore", "try_wait", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.Semaphore.mb_try_wait, livePtr)
  }

  /** Semaphore.post */
  final def post(count: Long = 1L): Unit = {
    if (gdext.classes.Semaphore.mb_post == null) gdext.classes.Semaphore.mb_post = MethodBind.get("Semaphore", "post", 1667783136L)
    Ptrcall.callVoid1(gdext.classes.Semaphore.mb_post, livePtr, count)
  }

}

object Semaphore {
  private[classes] var mb_try_wait: GDExtensionMethodBindPtr = null
  private[classes] var mb_post: GDExtensionMethodBindPtr = null
}
