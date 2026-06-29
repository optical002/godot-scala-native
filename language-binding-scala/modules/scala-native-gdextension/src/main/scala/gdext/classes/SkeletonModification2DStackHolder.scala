package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `SkeletonModification2DStackHolder`, extends `SkeletonModification2D`. */
abstract class SkeletonModification2DStackHolder extends SkeletonModification2D {
  override def godotClassName: String = "SkeletonModification2DStackHolder"

  /** SkeletonModification2DStackHolder.set_held_modification_stack */
  final def setHeldModificationStack(held_modification_stack: SkeletonModificationStack2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("SkeletonModification2DStackHolder", "set_held_modification_stack", 3907307132L), hostObject.objectPtr, held_modification_stack.hostObject)

  /** SkeletonModification2DStackHolder.get_held_modification_stack */
  final def getHeldModificationStack(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("SkeletonModification2DStackHolder", "get_held_modification_stack", 2107508396L), hostObject.objectPtr)

}
