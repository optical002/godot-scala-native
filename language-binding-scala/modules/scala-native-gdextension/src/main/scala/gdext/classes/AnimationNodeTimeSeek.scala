package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `AnimationNodeTimeSeek`, extends `AnimationNode`. */
abstract class AnimationNodeTimeSeek extends AnimationNode {

  /** AnimationNodeTimeSeek.set_explicit_elapse */
  final def setExplicitElapse(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationNodeTimeSeek", "set_explicit_elapse", 2586408642L), hostObject.objectPtr, enable)

  /** AnimationNodeTimeSeek.is_explicit_elapse */
  final def isExplicitElapse(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AnimationNodeTimeSeek", "is_explicit_elapse", 36873697L), hostObject.objectPtr)

}

object AnimationNodeTimeSeek {
  /** Class metadata for Gd[AnimationNodeTimeSeek] lifetime management and casting. */
  given GodotClass[AnimationNodeTimeSeek] with {
    def className = "AnimationNodeTimeSeek"
    def isRefCounted = true
    def wrap(o: GodotObject): AnimationNodeTimeSeek = new AnimationNodeTimeSeek {}.withHost(o.objectPtr)
    def unwrap(t: AnimationNodeTimeSeek): GodotObject = t.hostObject
  }
}
