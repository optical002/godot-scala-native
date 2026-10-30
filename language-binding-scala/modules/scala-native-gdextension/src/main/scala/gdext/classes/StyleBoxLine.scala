package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `StyleBoxLine`, extends `StyleBox`. */
abstract class StyleBoxLine extends StyleBox {
  override def godotClassName: String = "StyleBoxLine"

  /** StyleBoxLine.set_color */
  final def setColor(color: gdext.builtin.Color): Unit = {
    if (gdext.classes.StyleBoxLine.mb_set_color == null) gdext.classes.StyleBoxLine.mb_set_color = MethodBind.get("StyleBoxLine", "set_color", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.StyleBoxLine.mb_set_color, livePtr, color)
  }

  /** StyleBoxLine.get_color */
  final def getColor(): gdext.builtin.Color = {
    if (gdext.classes.StyleBoxLine.mb_get_color == null) gdext.classes.StyleBoxLine.mb_get_color = MethodBind.get("StyleBoxLine", "get_color", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.StyleBoxLine.mb_get_color, livePtr)
  }

  /** StyleBoxLine.set_thickness */
  final def setThickness(thickness: Long): Unit = {
    if (gdext.classes.StyleBoxLine.mb_set_thickness == null) gdext.classes.StyleBoxLine.mb_set_thickness = MethodBind.get("StyleBoxLine", "set_thickness", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.StyleBoxLine.mb_set_thickness, livePtr, thickness)
  }

  /** StyleBoxLine.get_thickness */
  final def getThickness(): Long = {
    if (gdext.classes.StyleBoxLine.mb_get_thickness == null) gdext.classes.StyleBoxLine.mb_get_thickness = MethodBind.get("StyleBoxLine", "get_thickness", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.StyleBoxLine.mb_get_thickness, livePtr)
  }

  /** StyleBoxLine.set_grow_begin */
  final def setGrowBegin(offset: Double): Unit = {
    if (gdext.classes.StyleBoxLine.mb_set_grow_begin == null) gdext.classes.StyleBoxLine.mb_set_grow_begin = MethodBind.get("StyleBoxLine", "set_grow_begin", 373806689L)
    Ptrcall.callVoid1(gdext.classes.StyleBoxLine.mb_set_grow_begin, livePtr, offset)
  }

  /** StyleBoxLine.get_grow_begin */
  final def getGrowBegin(): Double = {
    if (gdext.classes.StyleBoxLine.mb_get_grow_begin == null) gdext.classes.StyleBoxLine.mb_get_grow_begin = MethodBind.get("StyleBoxLine", "get_grow_begin", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.StyleBoxLine.mb_get_grow_begin, livePtr)
  }

  /** StyleBoxLine.set_grow_end */
  final def setGrowEnd(offset: Double): Unit = {
    if (gdext.classes.StyleBoxLine.mb_set_grow_end == null) gdext.classes.StyleBoxLine.mb_set_grow_end = MethodBind.get("StyleBoxLine", "set_grow_end", 373806689L)
    Ptrcall.callVoid1(gdext.classes.StyleBoxLine.mb_set_grow_end, livePtr, offset)
  }

  /** StyleBoxLine.get_grow_end */
  final def getGrowEnd(): Double = {
    if (gdext.classes.StyleBoxLine.mb_get_grow_end == null) gdext.classes.StyleBoxLine.mb_get_grow_end = MethodBind.get("StyleBoxLine", "get_grow_end", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.StyleBoxLine.mb_get_grow_end, livePtr)
  }

  /** StyleBoxLine.set_vertical */
  final def setVertical(vertical: Boolean): Unit = {
    if (gdext.classes.StyleBoxLine.mb_set_vertical == null) gdext.classes.StyleBoxLine.mb_set_vertical = MethodBind.get("StyleBoxLine", "set_vertical", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.StyleBoxLine.mb_set_vertical, livePtr, vertical)
  }

  /** StyleBoxLine.is_vertical */
  final def isVertical(): Boolean = {
    if (gdext.classes.StyleBoxLine.mb_is_vertical == null) gdext.classes.StyleBoxLine.mb_is_vertical = MethodBind.get("StyleBoxLine", "is_vertical", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.StyleBoxLine.mb_is_vertical, livePtr)
  }

}

object StyleBoxLine {
  private[classes] var mb_set_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_thickness: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_thickness: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_grow_begin: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_grow_begin: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_grow_end: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_grow_end: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_vertical: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_vertical: GDExtensionMethodBindPtr = null
}
