package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `BoxContainer`, extends `Container`. */
abstract class BoxContainer extends Container {
  override def godotClassName: String = "BoxContainer"

  /** BoxContainer.add_spacer */
  final def addSpacer(begin: Boolean): Control = {
    if (gdext.classes.BoxContainer.mb_add_spacer == null) gdext.classes.BoxContainer.mb_add_spacer = MethodBind.get("BoxContainer", "add_spacer", 1326660695L)
    Wrappers.borrowed[Control](Ptrcall.call1[Boolean, Long](gdext.classes.BoxContainer.mb_add_spacer, livePtr, begin))
  }

  /** BoxContainer.set_alignment */
  final def setAlignment(alignment: Long): Unit = {
    if (gdext.classes.BoxContainer.mb_set_alignment == null) gdext.classes.BoxContainer.mb_set_alignment = MethodBind.get("BoxContainer", "set_alignment", 2456745134L)
    Ptrcall.callVoid1(gdext.classes.BoxContainer.mb_set_alignment, livePtr, alignment)
  }

  /** BoxContainer.get_alignment */
  final def getAlignment(): Long = {
    if (gdext.classes.BoxContainer.mb_get_alignment == null) gdext.classes.BoxContainer.mb_get_alignment = MethodBind.get("BoxContainer", "get_alignment", 1915476527L)
    Ptrcall.call0[Long](gdext.classes.BoxContainer.mb_get_alignment, livePtr)
  }

  /** BoxContainer.set_vertical */
  final def setVertical(vertical: Boolean): Unit = {
    if (gdext.classes.BoxContainer.mb_set_vertical == null) gdext.classes.BoxContainer.mb_set_vertical = MethodBind.get("BoxContainer", "set_vertical", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.BoxContainer.mb_set_vertical, livePtr, vertical)
  }

  /** BoxContainer.is_vertical */
  final def isVertical(): Boolean = {
    if (gdext.classes.BoxContainer.mb_is_vertical == null) gdext.classes.BoxContainer.mb_is_vertical = MethodBind.get("BoxContainer", "is_vertical", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.BoxContainer.mb_is_vertical, livePtr)
  }

}

object BoxContainer {
  private[classes] var mb_add_spacer: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_alignment: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_alignment: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_vertical: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_vertical: GDExtensionMethodBindPtr = null
}
