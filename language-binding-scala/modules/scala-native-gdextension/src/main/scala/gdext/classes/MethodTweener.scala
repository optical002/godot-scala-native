package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `MethodTweener`, extends `Tweener`. */
abstract class MethodTweener extends Tweener {
  override def godotClassName: String = "MethodTweener"

  /** MethodTweener.set_delay */
  final def setDelay(delay: Double): GodotObject =
    Ptrcall.call1[Double, GodotObject](MethodBind.get("MethodTweener", "set_delay", 266477812L), hostObject.objectPtr, delay)

  /** MethodTweener.set_trans */
  final def setTrans(trans: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("MethodTweener", "set_trans", 3740975367L), hostObject.objectPtr, trans)

  /** MethodTweener.set_ease */
  final def setEase(ease: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("MethodTweener", "set_ease", 315540545L), hostObject.objectPtr, ease)

}
