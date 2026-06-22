package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `AnimationNodeBlend2`, extends `AnimationNodeSync`. */
abstract class AnimationNodeBlend2 extends AnimationNodeSync {

}

object AnimationNodeBlend2 {
  /** Class metadata for Gd[AnimationNodeBlend2] lifetime management and casting. */
  given GodotClass[AnimationNodeBlend2] with {
    def className = "AnimationNodeBlend2"
    def isRefCounted = true
    def wrap(o: GodotObject): AnimationNodeBlend2 = new AnimationNodeBlend2 {}.withHost(o.objectPtr)
    def unwrap(t: AnimationNodeBlend2): GodotObject = t.hostObject
  }
}
