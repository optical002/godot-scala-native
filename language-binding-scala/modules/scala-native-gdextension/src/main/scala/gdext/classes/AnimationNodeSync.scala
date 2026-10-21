package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AnimationNodeSync`, extends `AnimationNode`. */
abstract class AnimationNodeSync extends AnimationNode {
  override def godotClassName: String = "AnimationNodeSync"

  /** AnimationNodeSync.set_use_sync */
  final def setUseSync(enable: Boolean): Unit = {
    if (gdext.classes.AnimationNodeSync.mb_set_use_sync == null) gdext.classes.AnimationNodeSync.mb_set_use_sync = MethodBind.get("AnimationNodeSync", "set_use_sync", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.AnimationNodeSync.mb_set_use_sync, livePtr, enable)
  }

  /** AnimationNodeSync.is_using_sync */
  final def isUsingSync(): Boolean = {
    if (gdext.classes.AnimationNodeSync.mb_is_using_sync == null) gdext.classes.AnimationNodeSync.mb_is_using_sync = MethodBind.get("AnimationNodeSync", "is_using_sync", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.AnimationNodeSync.mb_is_using_sync, livePtr)
  }

}

object AnimationNodeSync {
  private[classes] var mb_set_use_sync: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_using_sync: GDExtensionMethodBindPtr = null
}
