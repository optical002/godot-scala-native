package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `CallbackTweener`, extends `Tweener`. */
abstract class CallbackTweener extends Tweener {
  override def godotClassName: String = "CallbackTweener"

  /** CallbackTweener.set_delay. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def setDelay(delay: Double): CallbackTweener = {
    if (gdext.classes.CallbackTweener.mb_set_delay == null) gdext.classes.CallbackTweener.mb_set_delay = MethodBind.get("CallbackTweener", "set_delay", 3008182292L)
    Wrappers.owned[CallbackTweener](Ptrcall.call1[Double, Long](gdext.classes.CallbackTweener.mb_set_delay, livePtr, delay))
  }

}

object CallbackTweener {
  private[classes] var mb_set_delay: GDExtensionMethodBindPtr = null
}
