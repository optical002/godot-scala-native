package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `IntervalTweener`, extends `Tweener`. */
abstract class IntervalTweener extends Tweener {

}

object IntervalTweener {
  /** Class metadata for Gd[IntervalTweener] lifetime management and casting. */
  given GodotClass[IntervalTweener] with {
    def className = "IntervalTweener"
    def isRefCounted = true
    def wrap(o: GodotObject): IntervalTweener = new IntervalTweener {}.withHost(o.objectPtr)
    def unwrap(t: IntervalTweener): GodotObject = t.hostObject
  }
}
