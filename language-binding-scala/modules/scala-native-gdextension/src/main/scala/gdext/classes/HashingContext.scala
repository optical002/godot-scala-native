package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `HashingContext`, extends `RefCounted`. */
abstract class HashingContext extends RefCounted {
  override def godotClassName: String = "HashingContext"

  /** HashingContext.start */
  final def start(`type`: Long): Long = {
    if (gdext.classes.HashingContext.mb_start == null) gdext.classes.HashingContext.mb_start = MethodBind.get("HashingContext", "start", 3940338335L)
    Ptrcall.call1[Long, Long](gdext.classes.HashingContext.mb_start, livePtr, `type`)
  }

}

object HashingContext {
  private[classes] var mb_start: GDExtensionMethodBindPtr = null
}
