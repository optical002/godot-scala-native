package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `SkeletonModification2DStackHolder`, extends `SkeletonModification2D`. */
abstract class SkeletonModification2DStackHolder extends SkeletonModification2D {

  /** SkeletonModification2DStackHolder.set_held_modification_stack */
  final def setHeldModificationStack(held_modification_stack: SkeletonModificationStack2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("SkeletonModification2DStackHolder", "set_held_modification_stack", 3907307132L), hostObject.objectPtr, held_modification_stack.hostObject)

  /** SkeletonModification2DStackHolder.get_held_modification_stack */
  final def getHeldModificationStack(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("SkeletonModification2DStackHolder", "get_held_modification_stack", 2107508396L), hostObject.objectPtr)

}

object SkeletonModification2DStackHolder {
  /** Class metadata for Gd[SkeletonModification2DStackHolder] lifetime management and casting. */
  given GodotClass[SkeletonModification2DStackHolder] with {
    def className = "SkeletonModification2DStackHolder"
    def isRefCounted = true
    def wrap(o: GodotObject): SkeletonModification2DStackHolder = new SkeletonModification2DStackHolder {}.withHost(o.objectPtr)
    def unwrap(t: SkeletonModification2DStackHolder): GodotObject = t.hostObject
  }
}
