package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `AnimationRootNode`, extends `AnimationNode`. */
abstract class AnimationRootNode extends AnimationNode {

}

object AnimationRootNode {
  /** Class metadata for Gd[AnimationRootNode] lifetime management and casting. */
  given GodotClass[AnimationRootNode] with {
    def className = "AnimationRootNode"
    def isRefCounted = true
    def wrap(o: GodotObject): AnimationRootNode = new AnimationRootNode {}.withHost(o.objectPtr)
    def unwrap(t: AnimationRootNode): GodotObject = t.hostObject
  }
}
