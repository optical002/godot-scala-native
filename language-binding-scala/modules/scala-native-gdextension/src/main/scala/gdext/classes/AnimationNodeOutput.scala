package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `AnimationNodeOutput`, extends `AnimationNode`. */
abstract class AnimationNodeOutput extends AnimationNode {

}

object AnimationNodeOutput {
  /** Class metadata for Gd[AnimationNodeOutput] lifetime management and casting. */
  given GodotClass[AnimationNodeOutput] with {
    def className = "AnimationNodeOutput"
    def isRefCounted = true
    def wrap(o: GodotObject): AnimationNodeOutput = new AnimationNodeOutput {}.withHost(o.objectPtr)
    def unwrap(t: AnimationNodeOutput): GodotObject = t.hostObject
  }
}
