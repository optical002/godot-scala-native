package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `AnimationNodeTimeSeek`, extends `AnimationNode`. */
abstract class AnimationNodeTimeSeek extends AnimationNode {
  override def godotClassName: String = "AnimationNodeTimeSeek"

  /** AnimationNodeTimeSeek.set_explicit_elapse */
  final def setExplicitElapse(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationNodeTimeSeek", "set_explicit_elapse", 2586408642L), hostObject.objectPtr, enable)

  /** AnimationNodeTimeSeek.is_explicit_elapse */
  final def isExplicitElapse(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AnimationNodeTimeSeek", "is_explicit_elapse", 36873697L), hostObject.objectPtr)

}
