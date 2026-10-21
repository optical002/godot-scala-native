package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `FoldableGroup`, extends `Resource`. */
abstract class FoldableGroup extends Resource {
  override def godotClassName: String = "FoldableGroup"

  /** FoldableGroup.get_expanded_container */
  final def getExpandedContainer(): FoldableContainer = {
    if (gdext.classes.FoldableGroup.mb_get_expanded_container == null) gdext.classes.FoldableGroup.mb_get_expanded_container = MethodBind.get("FoldableGroup", "get_expanded_container", 1427441056L)
    Wrappers.borrowed[FoldableContainer](Ptrcall.call0[Long](gdext.classes.FoldableGroup.mb_get_expanded_container, livePtr))
  }

  /** FoldableGroup.set_allow_folding_all */
  final def setAllowFoldingAll(enabled: Boolean): Unit = {
    if (gdext.classes.FoldableGroup.mb_set_allow_folding_all == null) gdext.classes.FoldableGroup.mb_set_allow_folding_all = MethodBind.get("FoldableGroup", "set_allow_folding_all", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.FoldableGroup.mb_set_allow_folding_all, livePtr, enabled)
  }

  /** FoldableGroup.is_allow_folding_all */
  final def isAllowFoldingAll(): Boolean = {
    if (gdext.classes.FoldableGroup.mb_is_allow_folding_all == null) gdext.classes.FoldableGroup.mb_is_allow_folding_all = MethodBind.get("FoldableGroup", "is_allow_folding_all", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.FoldableGroup.mb_is_allow_folding_all, livePtr)
  }

}

object FoldableGroup {
  private[classes] var mb_get_expanded_container: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_allow_folding_all: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_allow_folding_all: GDExtensionMethodBindPtr = null
}
