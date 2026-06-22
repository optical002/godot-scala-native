package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `AnimationTree`, extends `AnimationMixer`. */
abstract class AnimationTree extends AnimationMixer {

  /** AnimationTree.set_tree_root */
  final def setTreeRoot(animation_node: AnimationRootNode): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationTree", "set_tree_root", 2581683800L), hostObject.objectPtr, animation_node.hostObject)

  /** AnimationTree.get_tree_root */
  final def getTreeRoot(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("AnimationTree", "get_tree_root", 4110384712L), hostObject.objectPtr)

  /** AnimationTree.set_process_callback */
  final def setProcessCallback(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationTree", "set_process_callback", 1723352826L), hostObject.objectPtr, mode)

  /** AnimationTree.get_process_callback */
  final def getProcessCallback(): Long =
    Ptrcall.call0[Long](MethodBind.get("AnimationTree", "get_process_callback", 891317132L), hostObject.objectPtr)

}

object AnimationTree {
  /** Class metadata for Gd[AnimationTree] lifetime management and casting. */
  given GodotClass[AnimationTree] with {
    def className = "AnimationTree"
    def isRefCounted = false
    def wrap(o: GodotObject): AnimationTree = new AnimationTree {}.withHost(o.objectPtr)
    def unwrap(t: AnimationTree): GodotObject = t.hostObject
  }
}
