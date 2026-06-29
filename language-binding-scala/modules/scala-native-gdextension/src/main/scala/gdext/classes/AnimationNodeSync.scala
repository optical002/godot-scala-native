package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `AnimationNodeSync`, extends `AnimationNode`. */
abstract class AnimationNodeSync extends AnimationNode {
  override def godotClassName: String = "AnimationNodeSync"

  /** AnimationNodeSync.set_use_sync */
  final def setUseSync(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationNodeSync", "set_use_sync", 2586408642L), hostObject.objectPtr, enable)

  /** AnimationNodeSync.is_using_sync */
  final def isUsingSync(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AnimationNodeSync", "is_using_sync", 36873697L), hostObject.objectPtr)

}
