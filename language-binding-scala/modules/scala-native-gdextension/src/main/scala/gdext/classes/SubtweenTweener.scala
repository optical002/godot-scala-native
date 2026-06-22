package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `SubtweenTweener`, extends `Tweener`. */
abstract class SubtweenTweener extends Tweener {

  /** SubtweenTweener.set_delay */
  final def setDelay(delay: Double): GodotObject =
    Ptrcall.call1[Double, GodotObject](MethodBind.get("SubtweenTweener", "set_delay", 449181780L), hostObject.objectPtr, delay)

}

object SubtweenTweener {
  /** Class metadata for Gd[SubtweenTweener] lifetime management and casting. */
  given GodotClass[SubtweenTweener] with {
    def className = "SubtweenTweener"
    def isRefCounted = true
    def wrap(o: GodotObject): SubtweenTweener = new SubtweenTweener {}.withHost(o.objectPtr)
    def unwrap(t: SubtweenTweener): GodotObject = t.hostObject
  }
}
