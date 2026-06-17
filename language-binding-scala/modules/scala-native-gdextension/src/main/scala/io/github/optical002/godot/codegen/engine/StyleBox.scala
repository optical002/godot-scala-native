package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `StyleBox`, extends `Resource`. */
abstract class StyleBox extends Resource {

  /** StyleBox.get_minimum_size */
  final def getMinimumSize(): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector2](MethodBind.get("StyleBox", "get_minimum_size", 3341600327L), hostObject.objectPtr)

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
  final def getOffset(): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector2](MethodBind.get("StyleBox", "get_offset", 3341600327L), hostObject.objectPtr)

  /** StyleBox.get_current_item_drawn */
  final def getCurrentItemDrawn(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("StyleBox", "get_current_item_drawn", 3213695180L), hostObject.objectPtr)

  /** StyleBox.test_mask */
  final def testMask(point: io.github.optical002.godot.builtin.Vector2, rect: io.github.optical002.godot.builtin.Rect2): Boolean =
    Ptrcall.call2[io.github.optical002.godot.builtin.Vector2, io.github.optical002.godot.builtin.Rect2, Boolean](MethodBind.get("StyleBox", "test_mask", 3735564539L), hostObject.objectPtr, point, rect)

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
