package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `StyleBox`, extends `Resource`. */
abstract class StyleBox extends Resource {
  override def godotClassName: String = "StyleBox"

  /** StyleBox.get_minimum_size */
  final def getMinimumSize(): gdext.builtin.Vector2 = {
    if (gdext.classes.StyleBox.mb_get_minimum_size == null) gdext.classes.StyleBox.mb_get_minimum_size = MethodBind.get("StyleBox", "get_minimum_size", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.StyleBox.mb_get_minimum_size, livePtr)
  }

  /** StyleBox.set_content_margin */
  final def setContentMargin(margin: Long, offset: Double): Unit = {
    if (gdext.classes.StyleBox.mb_set_content_margin == null) gdext.classes.StyleBox.mb_set_content_margin = MethodBind.get("StyleBox", "set_content_margin", 4290182280L)
    Ptrcall.callVoid2(gdext.classes.StyleBox.mb_set_content_margin, livePtr, margin, offset)
  }

  /** StyleBox.set_content_margin_all */
  final def setContentMarginAll(offset: Double): Unit = {
    if (gdext.classes.StyleBox.mb_set_content_margin_all == null) gdext.classes.StyleBox.mb_set_content_margin_all = MethodBind.get("StyleBox", "set_content_margin_all", 373806689L)
    Ptrcall.callVoid1(gdext.classes.StyleBox.mb_set_content_margin_all, livePtr, offset)
  }

  /** StyleBox.get_content_margin */
  final def getContentMargin(margin: Long): Double = {
    if (gdext.classes.StyleBox.mb_get_content_margin == null) gdext.classes.StyleBox.mb_get_content_margin = MethodBind.get("StyleBox", "get_content_margin", 2869120046L)
    Ptrcall.call1[Long, Double](gdext.classes.StyleBox.mb_get_content_margin, livePtr, margin)
  }

  /** StyleBox.get_margin */
  final def getMargin(margin: Long): Double = {
    if (gdext.classes.StyleBox.mb_get_margin == null) gdext.classes.StyleBox.mb_get_margin = MethodBind.get("StyleBox", "get_margin", 2869120046L)
    Ptrcall.call1[Long, Double](gdext.classes.StyleBox.mb_get_margin, livePtr, margin)
  }

  /** StyleBox.get_offset */
  final def getOffset(): gdext.builtin.Vector2 = {
    if (gdext.classes.StyleBox.mb_get_offset == null) gdext.classes.StyleBox.mb_get_offset = MethodBind.get("StyleBox", "get_offset", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.StyleBox.mb_get_offset, livePtr)
  }

  /** StyleBox.get_current_item_drawn */
  final def getCurrentItemDrawn(): CanvasItem = {
    if (gdext.classes.StyleBox.mb_get_current_item_drawn == null) gdext.classes.StyleBox.mb_get_current_item_drawn = MethodBind.get("StyleBox", "get_current_item_drawn", 3213695180L)
    Wrappers.borrowed[CanvasItem](Ptrcall.call0[Long](gdext.classes.StyleBox.mb_get_current_item_drawn, livePtr))
  }

  /** StyleBox.test_mask */
  final def testMask(point: gdext.builtin.Vector2, rect: gdext.builtin.Rect2): Boolean = {
    if (gdext.classes.StyleBox.mb_test_mask == null) gdext.classes.StyleBox.mb_test_mask = MethodBind.get("StyleBox", "test_mask", 3735564539L)
    Ptrcall.call2[gdext.builtin.Vector2, gdext.builtin.Rect2, Boolean](gdext.classes.StyleBox.mb_test_mask, livePtr, point, rect)
  }

}

object StyleBox {
  private[classes] var mb_get_minimum_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_content_margin: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_content_margin_all: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_content_margin: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_margin: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_current_item_drawn: GDExtensionMethodBindPtr = null
  private[classes] var mb_test_mask: GDExtensionMethodBindPtr = null
}
