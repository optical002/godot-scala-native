package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `PropertyTweener`, extends `Tweener`. */
abstract class PropertyTweener extends Tweener {
  override def godotClassName: String = "PropertyTweener"

  /** PropertyTweener.from_current. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def fromCurrent(): PropertyTweener = {
    if (gdext.classes.PropertyTweener.mb_from_current == null) gdext.classes.PropertyTweener.mb_from_current = MethodBind.get("PropertyTweener", "from_current", 4279177709L)
    Wrappers.owned[PropertyTweener](Ptrcall.call0[Long](gdext.classes.PropertyTweener.mb_from_current, livePtr))
  }

  /** PropertyTweener.as_relative. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def asRelative(): PropertyTweener = {
    if (gdext.classes.PropertyTweener.mb_as_relative == null) gdext.classes.PropertyTweener.mb_as_relative = MethodBind.get("PropertyTweener", "as_relative", 4279177709L)
    Wrappers.owned[PropertyTweener](Ptrcall.call0[Long](gdext.classes.PropertyTweener.mb_as_relative, livePtr))
  }

  /** PropertyTweener.set_trans. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def setTrans(trans: Long): PropertyTweener = {
    if (gdext.classes.PropertyTweener.mb_set_trans == null) gdext.classes.PropertyTweener.mb_set_trans = MethodBind.get("PropertyTweener", "set_trans", 1899107404L)
    Wrappers.owned[PropertyTweener](Ptrcall.call1[Long, Long](gdext.classes.PropertyTweener.mb_set_trans, livePtr, trans))
  }

  /** PropertyTweener.set_ease. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def setEase(ease: Long): PropertyTweener = {
    if (gdext.classes.PropertyTweener.mb_set_ease == null) gdext.classes.PropertyTweener.mb_set_ease = MethodBind.get("PropertyTweener", "set_ease", 1080455622L)
    Wrappers.owned[PropertyTweener](Ptrcall.call1[Long, Long](gdext.classes.PropertyTweener.mb_set_ease, livePtr, ease))
  }

  /** PropertyTweener.set_delay. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def setDelay(delay: Double): PropertyTweener = {
    if (gdext.classes.PropertyTweener.mb_set_delay == null) gdext.classes.PropertyTweener.mb_set_delay = MethodBind.get("PropertyTweener", "set_delay", 2171559331L)
    Wrappers.owned[PropertyTweener](Ptrcall.call1[Double, Long](gdext.classes.PropertyTweener.mb_set_delay, livePtr, delay))
  }

}

object PropertyTweener {
  private[classes] var mb_from_current: GDExtensionMethodBindPtr = null
  private[classes] var mb_as_relative: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_trans: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_ease: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_delay: GDExtensionMethodBindPtr = null
}
