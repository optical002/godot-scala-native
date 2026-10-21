package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AnimationNodeTimeSeek`, extends `AnimationNode`. */
abstract class AnimationNodeTimeSeek extends AnimationNode {
  override def godotClassName: String = "AnimationNodeTimeSeek"

  /** AnimationNodeTimeSeek.set_explicit_elapse */
  final def setExplicitElapse(enable: Boolean): Unit = {
    if (gdext.classes.AnimationNodeTimeSeek.mb_set_explicit_elapse == null) gdext.classes.AnimationNodeTimeSeek.mb_set_explicit_elapse = MethodBind.get("AnimationNodeTimeSeek", "set_explicit_elapse", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.AnimationNodeTimeSeek.mb_set_explicit_elapse, livePtr, enable)
  }

  /** AnimationNodeTimeSeek.is_explicit_elapse */
  final def isExplicitElapse(): Boolean = {
    if (gdext.classes.AnimationNodeTimeSeek.mb_is_explicit_elapse == null) gdext.classes.AnimationNodeTimeSeek.mb_is_explicit_elapse = MethodBind.get("AnimationNodeTimeSeek", "is_explicit_elapse", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.AnimationNodeTimeSeek.mb_is_explicit_elapse, livePtr)
  }

}

object AnimationNodeTimeSeek {
  private[classes] var mb_set_explicit_elapse: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_explicit_elapse: GDExtensionMethodBindPtr = null
}
