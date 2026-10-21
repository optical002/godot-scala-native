package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `SubtweenTweener`, extends `Tweener`. */
abstract class SubtweenTweener extends Tweener {
  override def godotClassName: String = "SubtweenTweener"

  /** SubtweenTweener.set_delay. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def setDelay(delay: Double): SubtweenTweener = {
    if (gdext.classes.SubtweenTweener.mb_set_delay == null) gdext.classes.SubtweenTweener.mb_set_delay = MethodBind.get("SubtweenTweener", "set_delay", 449181780L)
    Wrappers.owned[SubtweenTweener](Ptrcall.call1[Double, Long](gdext.classes.SubtweenTweener.mb_set_delay, livePtr, delay))
  }

}

object SubtweenTweener {
  private[classes] var mb_set_delay: GDExtensionMethodBindPtr = null
}
