package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `AnimationNodeSub2`, extends `AnimationNodeSync`. */
abstract class AnimationNodeSub2 extends AnimationNodeSync {

}

object AnimationNodeSub2 {
  /** Class metadata for Gd[AnimationNodeSub2] lifetime management and casting. */
  given GodotClass[AnimationNodeSub2] with {
    def className = "AnimationNodeSub2"
    def isRefCounted = true
    def wrap(o: GodotObject): AnimationNodeSub2 = new AnimationNodeSub2 {}.withHost(o.objectPtr)
    def unwrap(t: AnimationNodeSub2): GodotObject = t.hostObject
  }
}
