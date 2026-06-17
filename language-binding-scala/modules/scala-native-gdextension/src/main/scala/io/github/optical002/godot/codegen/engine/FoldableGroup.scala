package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `FoldableGroup`, extends `Resource`. */
abstract class FoldableGroup extends Resource {

  /** FoldableGroup.get_expanded_container */
  final def getExpandedContainer(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("FoldableGroup", "get_expanded_container", 1427441056L), hostObject.objectPtr)

  /** FoldableGroup.set_allow_folding_all */
  final def setAllowFoldingAll(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("FoldableGroup", "set_allow_folding_all", 2586408642L), hostObject.objectPtr, enabled)

  /** FoldableGroup.is_allow_folding_all */
  final def isAllowFoldingAll(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("FoldableGroup", "is_allow_folding_all", 36873697L), hostObject.objectPtr)

}

object FoldableGroup {
  /** Class metadata for Gd[FoldableGroup] lifetime management and casting. */
  given GodotClass[FoldableGroup] with {
    def className = "FoldableGroup"
    def isRefCounted = true
    def wrap(o: GodotObject): FoldableGroup = new FoldableGroup {}.withHost(o.objectPtr)
    def unwrap(t: FoldableGroup): GodotObject = t.hostObject
  }
}
