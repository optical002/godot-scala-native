package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `AnimationNodeAdd2`, extends `AnimationNodeSync`. */
abstract class AnimationNodeAdd2 extends AnimationNodeSync {

}

object AnimationNodeAdd2 {
  /** Class metadata for Gd[AnimationNodeAdd2] lifetime management and casting. */
  given GodotClass[AnimationNodeAdd2] with {
    def className = "AnimationNodeAdd2"
    def isRefCounted = true
    def wrap(o: GodotObject): AnimationNodeAdd2 = new AnimationNodeAdd2 {}.withHost(o.objectPtr)
    def unwrap(t: AnimationNodeAdd2): GodotObject = t.hostObject
  }
}
