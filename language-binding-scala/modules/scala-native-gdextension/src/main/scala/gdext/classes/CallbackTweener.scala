package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `CallbackTweener`, extends `Tweener`. */
abstract class CallbackTweener extends Tweener {
  override def godotClassName: String = "CallbackTweener"

  /** CallbackTweener.set_delay */
  final def setDelay(delay: Double): GodotObject =
    Ptrcall.call1[Double, GodotObject](MethodBind.get("CallbackTweener", "set_delay", 3008182292L), hostObject.objectPtr, delay)

}
