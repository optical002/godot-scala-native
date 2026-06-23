package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `StyleBox`, extends `Resource`. */
abstract class StyleBox extends Resource {

  /** StyleBox.get_minimum_size */
  final def getMinimumSize(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("StyleBox", "get_minimum_size", 3341600327L), hostObject.objectPtr)

  /** StyleBox.set_content_margin */
  final def setContentMargin(margin: Long, offset: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("StyleBox", "set_content_margin", 4290182280L), hostObject.objectPtr, margin, offset)

  /** StyleBox.set_content_margin_all */
  final def setContentMarginAll(offset: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("StyleBox", "set_content_margin_all", 373806689L), hostObject.objectPtr, offset)

  /** StyleBox.get_content_margin */
  final def getContentMargin(margin: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("StyleBox", "get_content_margin", 2869120046L), hostObject.objectPtr, margin)

  /** StyleBox.get_margin */
  final def getMargin(margin: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("StyleBox", "get_margin", 2869120046L), hostObject.objectPtr, margin)

  /** StyleBox.get_offset */
  final def getOffset(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("StyleBox", "get_offset", 3341600327L), hostObject.objectPtr)

  /** StyleBox.get_current_item_drawn */
  final def getCurrentItemDrawn(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("StyleBox", "get_current_item_drawn", 3213695180L), hostObject.objectPtr)

  /** StyleBox.test_mask */
  final def testMask(point: gdext.builtin.Vector2, rect: gdext.builtin.Rect2): Boolean =
    Ptrcall.call2[gdext.builtin.Vector2, gdext.builtin.Rect2, Boolean](MethodBind.get("StyleBox", "test_mask", 3735564539L), hostObject.objectPtr, point, rect)

}

object StyleBox {
  /** Class metadata for Gd[StyleBox] lifetime management and casting. */
  given GodotClass[StyleBox] with {
    def className = "StyleBox"
    def isRefCounted = true
    def wrap(o: GodotObject): StyleBox = new StyleBox {}.withHost(o.objectPtr)
    def unwrap(t: StyleBox): GodotObject = t.hostObject
  }
}
