package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `MethodTweener`, extends `Tweener`. */
abstract class MethodTweener extends Tweener {
  override def godotClassName: String = "MethodTweener"

  /** MethodTweener.set_delay. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def setDelay(delay: Double): MethodTweener = {
    if (gdext.classes.MethodTweener.mb_set_delay == null) gdext.classes.MethodTweener.mb_set_delay = MethodBind.get("MethodTweener", "set_delay", 266477812L)
    Wrappers.owned[MethodTweener](Ptrcall.call1[Double, Long](gdext.classes.MethodTweener.mb_set_delay, livePtr, delay))
  }

  /** MethodTweener.set_trans. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def setTrans(trans: gdext.classes.Tween.TransitionType): MethodTweener = {
    if (gdext.classes.MethodTweener.mb_set_trans == null) gdext.classes.MethodTweener.mb_set_trans = MethodBind.get("MethodTweener", "set_trans", 3740975367L)
    Wrappers.owned[MethodTweener](Ptrcall.call1[Long, Long](gdext.classes.MethodTweener.mb_set_trans, livePtr, trans))
  }

  /** MethodTweener.set_ease. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def setEase(ease: gdext.classes.Tween.EaseType): MethodTweener = {
    if (gdext.classes.MethodTweener.mb_set_ease == null) gdext.classes.MethodTweener.mb_set_ease = MethodBind.get("MethodTweener", "set_ease", 315540545L)
    Wrappers.owned[MethodTweener](Ptrcall.call1[Long, Long](gdext.classes.MethodTweener.mb_set_ease, livePtr, ease))
  }

}

object MethodTweener {
  private[classes] var mb_set_delay: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_trans: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_ease: GDExtensionMethodBindPtr = null
}
