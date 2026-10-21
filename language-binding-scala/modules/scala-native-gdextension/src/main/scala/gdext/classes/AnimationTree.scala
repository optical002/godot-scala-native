package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AnimationTree`, extends `AnimationMixer`. */
abstract class AnimationTree extends AnimationMixer {
  override def godotClassName: String = "AnimationTree"

  /** AnimationTree.set_tree_root */
  final def setTreeRoot(animation_node: AnimationRootNode): Unit = {
    if (gdext.classes.AnimationTree.mb_set_tree_root == null) gdext.classes.AnimationTree.mb_set_tree_root = MethodBind.get("AnimationTree", "set_tree_root", 2581683800L)
    Ptrcall.callVoid1(gdext.classes.AnimationTree.mb_set_tree_root, livePtr, Wrappers.handle(animation_node))
  }

  /** AnimationTree.get_tree_root. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getTreeRoot(): AnimationRootNode = {
    if (gdext.classes.AnimationTree.mb_get_tree_root == null) gdext.classes.AnimationTree.mb_get_tree_root = MethodBind.get("AnimationTree", "get_tree_root", 4110384712L)
    Wrappers.owned[AnimationRootNode](Ptrcall.call0[Long](gdext.classes.AnimationTree.mb_get_tree_root, livePtr))
  }

  /** AnimationTree.set_process_callback */
  final def setProcessCallback(mode: Long): Unit = {
    if (gdext.classes.AnimationTree.mb_set_process_callback == null) gdext.classes.AnimationTree.mb_set_process_callback = MethodBind.get("AnimationTree", "set_process_callback", 1723352826L)
    Ptrcall.callVoid1(gdext.classes.AnimationTree.mb_set_process_callback, livePtr, mode)
  }

  /** AnimationTree.get_process_callback */
  final def getProcessCallback(): Long = {
    if (gdext.classes.AnimationTree.mb_get_process_callback == null) gdext.classes.AnimationTree.mb_get_process_callback = MethodBind.get("AnimationTree", "get_process_callback", 891317132L)
    Ptrcall.call0[Long](gdext.classes.AnimationTree.mb_get_process_callback, livePtr)
  }

}

object AnimationTree {
  private[classes] var mb_set_tree_root: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tree_root: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_process_callback: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_process_callback: GDExtensionMethodBindPtr = null
}
