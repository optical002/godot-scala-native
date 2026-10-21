package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `SkeletonModification2DStackHolder`, extends `SkeletonModification2D`. */
abstract class SkeletonModification2DStackHolder extends SkeletonModification2D {
  override def godotClassName: String = "SkeletonModification2DStackHolder"

  /** SkeletonModification2DStackHolder.set_held_modification_stack */
  final def setHeldModificationStack(held_modification_stack: SkeletonModificationStack2D): Unit = {
    if (gdext.classes.SkeletonModification2DStackHolder.mb_set_held_modification_stack == null) gdext.classes.SkeletonModification2DStackHolder.mb_set_held_modification_stack = MethodBind.get("SkeletonModification2DStackHolder", "set_held_modification_stack", 3907307132L)
    Ptrcall.callVoid1(gdext.classes.SkeletonModification2DStackHolder.mb_set_held_modification_stack, livePtr, Wrappers.handle(held_modification_stack))
  }

  /** SkeletonModification2DStackHolder.get_held_modification_stack. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getHeldModificationStack(): SkeletonModificationStack2D = {
    if (gdext.classes.SkeletonModification2DStackHolder.mb_get_held_modification_stack == null) gdext.classes.SkeletonModification2DStackHolder.mb_get_held_modification_stack = MethodBind.get("SkeletonModification2DStackHolder", "get_held_modification_stack", 2107508396L)
    Wrappers.owned[SkeletonModificationStack2D](Ptrcall.call0[Long](gdext.classes.SkeletonModification2DStackHolder.mb_get_held_modification_stack, livePtr))
  }

}

object SkeletonModification2DStackHolder {
  private[classes] var mb_set_held_modification_stack: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_held_modification_stack: GDExtensionMethodBindPtr = null
}
