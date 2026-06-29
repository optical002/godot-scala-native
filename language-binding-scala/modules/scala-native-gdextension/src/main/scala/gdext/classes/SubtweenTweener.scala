package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `SubtweenTweener`, extends `Tweener`. */
abstract class SubtweenTweener extends Tweener {
  override def godotClassName: String = "SubtweenTweener"

  /** SubtweenTweener.set_delay */
  final def setDelay(delay: Double): GodotObject =
    Ptrcall.call1[Double, GodotObject](MethodBind.get("SubtweenTweener", "set_delay", 449181780L), hostObject.objectPtr, delay)

}
