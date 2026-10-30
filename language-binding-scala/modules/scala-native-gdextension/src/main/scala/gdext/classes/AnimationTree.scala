package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AnimationTree`, extends `AnimationMixer`. */
abstract class AnimationTree extends AnimationMixer {
  override def godotClassName: String = "AnimationTree"

  /** AnimationTree.set_tree_root */
  final def setTreeRoot(animationNode: AnimationRootNode): Unit = {
    if (gdext.classes.AnimationTree.mb_set_tree_root == null) gdext.classes.AnimationTree.mb_set_tree_root = MethodBind.get("AnimationTree", "set_tree_root", 2581683800L)
    Ptrcall.callVoid1(gdext.classes.AnimationTree.mb_set_tree_root, livePtr, Wrappers.handle(animationNode))
  }

  /** AnimationTree.get_tree_root. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getTreeRoot(): AnimationRootNode = {
    if (gdext.classes.AnimationTree.mb_get_tree_root == null) gdext.classes.AnimationTree.mb_get_tree_root = MethodBind.get("AnimationTree", "get_tree_root", 4110384712L)
    Wrappers.owned[AnimationRootNode](Ptrcall.call0[Long](gdext.classes.AnimationTree.mb_get_tree_root, livePtr))
  }

  /** AnimationTree.set_process_callback */
  final def setProcessCallback(mode: gdext.classes.AnimationTree.AnimationProcessCallback): Unit = {
    if (gdext.classes.AnimationTree.mb_set_process_callback == null) gdext.classes.AnimationTree.mb_set_process_callback = MethodBind.get("AnimationTree", "set_process_callback", 1723352826L)
    Ptrcall.callVoid1(gdext.classes.AnimationTree.mb_set_process_callback, livePtr, mode)
  }

  /** AnimationTree.get_process_callback */
  final def getProcessCallback(): gdext.classes.AnimationTree.AnimationProcessCallback = {
    if (gdext.classes.AnimationTree.mb_get_process_callback == null) gdext.classes.AnimationTree.mb_get_process_callback = MethodBind.get("AnimationTree", "get_process_callback", 891317132L)
    gdext.classes.AnimationTree.AnimationProcessCallback(Ptrcall.call0[Long](gdext.classes.AnimationTree.mb_get_process_callback, livePtr))
  }

}

object AnimationTree {
  private[classes] var mb_set_tree_root: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tree_root: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_process_callback: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_process_callback: GDExtensionMethodBindPtr = null

  /** Godot enum `AnimationTree.AnimationProcessCallback`. */
  opaque type AnimationProcessCallback <: Long = Long

  object AnimationProcessCallback {
    final val Physics: AnimationProcessCallback = 0L.asInstanceOf[AnimationProcessCallback]
    final val Idle: AnimationProcessCallback = 1L.asInstanceOf[AnimationProcessCallback]
    final val Manual: AnimationProcessCallback = 2L.asInstanceOf[AnimationProcessCallback]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): AnimationProcessCallback = value.asInstanceOf[AnimationProcessCallback]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[AnimationProcessCallback] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[AnimationProcessCallback]]

    extension (self: AnimationProcessCallback)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Physics"
        case 1L => "Idle"
        case 2L => "Manual"
        case other => other.toString
      }
  }
}
