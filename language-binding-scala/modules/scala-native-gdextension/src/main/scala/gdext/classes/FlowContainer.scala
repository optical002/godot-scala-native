package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `FlowContainer`, extends `Container`. */
abstract class FlowContainer extends Container {
  override def godotClassName: String = "FlowContainer"

  /** FlowContainer.get_line_count */
  final def getLineCount(): Long = {
    if (gdext.classes.FlowContainer.mb_get_line_count == null) gdext.classes.FlowContainer.mb_get_line_count = MethodBind.get("FlowContainer", "get_line_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.FlowContainer.mb_get_line_count, livePtr)
  }

  /** FlowContainer.set_alignment */
  final def setAlignment(alignment: Long): Unit = {
    if (gdext.classes.FlowContainer.mb_set_alignment == null) gdext.classes.FlowContainer.mb_set_alignment = MethodBind.get("FlowContainer", "set_alignment", 575250951L)
    Ptrcall.callVoid1(gdext.classes.FlowContainer.mb_set_alignment, livePtr, alignment)
  }

  /** FlowContainer.get_alignment */
  final def getAlignment(): Long = {
    if (gdext.classes.FlowContainer.mb_get_alignment == null) gdext.classes.FlowContainer.mb_get_alignment = MethodBind.get("FlowContainer", "get_alignment", 3749743559L)
    Ptrcall.call0[Long](gdext.classes.FlowContainer.mb_get_alignment, livePtr)
  }

  /** FlowContainer.set_last_wrap_alignment */
  final def setLastWrapAlignment(last_wrap_alignment: Long): Unit = {
    if (gdext.classes.FlowContainer.mb_set_last_wrap_alignment == null) gdext.classes.FlowContainer.mb_set_last_wrap_alignment = MethodBind.get("FlowContainer", "set_last_wrap_alignment", 2899697495L)
    Ptrcall.callVoid1(gdext.classes.FlowContainer.mb_set_last_wrap_alignment, livePtr, last_wrap_alignment)
  }

  /** FlowContainer.get_last_wrap_alignment */
  final def getLastWrapAlignment(): Long = {
    if (gdext.classes.FlowContainer.mb_get_last_wrap_alignment == null) gdext.classes.FlowContainer.mb_get_last_wrap_alignment = MethodBind.get("FlowContainer", "get_last_wrap_alignment", 3743456014L)
    Ptrcall.call0[Long](gdext.classes.FlowContainer.mb_get_last_wrap_alignment, livePtr)
  }

  /** FlowContainer.set_vertical */
  final def setVertical(vertical: Boolean): Unit = {
    if (gdext.classes.FlowContainer.mb_set_vertical == null) gdext.classes.FlowContainer.mb_set_vertical = MethodBind.get("FlowContainer", "set_vertical", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.FlowContainer.mb_set_vertical, livePtr, vertical)
  }

  /** FlowContainer.is_vertical */
  final def isVertical(): Boolean = {
    if (gdext.classes.FlowContainer.mb_is_vertical == null) gdext.classes.FlowContainer.mb_is_vertical = MethodBind.get("FlowContainer", "is_vertical", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.FlowContainer.mb_is_vertical, livePtr)
  }

  /** FlowContainer.set_reverse_fill */
  final def setReverseFill(reverse_fill: Boolean): Unit = {
    if (gdext.classes.FlowContainer.mb_set_reverse_fill == null) gdext.classes.FlowContainer.mb_set_reverse_fill = MethodBind.get("FlowContainer", "set_reverse_fill", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.FlowContainer.mb_set_reverse_fill, livePtr, reverse_fill)
  }

  /** FlowContainer.is_reverse_fill */
  final def isReverseFill(): Boolean = {
    if (gdext.classes.FlowContainer.mb_is_reverse_fill == null) gdext.classes.FlowContainer.mb_is_reverse_fill = MethodBind.get("FlowContainer", "is_reverse_fill", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.FlowContainer.mb_is_reverse_fill, livePtr)
  }

}

object FlowContainer {
  private[classes] var mb_get_line_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_alignment: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_alignment: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_last_wrap_alignment: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_last_wrap_alignment: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_vertical: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_vertical: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_reverse_fill: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_reverse_fill: GDExtensionMethodBindPtr = null
}
