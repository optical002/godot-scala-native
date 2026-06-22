package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `Tweener`, extends `RefCounted`. */
abstract class Tweener extends RefCounted {

}

object Tweener {
  /** Class metadata for Gd[Tweener] lifetime management and casting. */
  given GodotClass[Tweener] with {
    def className = "Tweener"
    def isRefCounted = true
    def wrap(o: GodotObject): Tweener = new Tweener {}.withHost(o.objectPtr)
    def unwrap(t: Tweener): GodotObject = t.hostObject
  }
}
