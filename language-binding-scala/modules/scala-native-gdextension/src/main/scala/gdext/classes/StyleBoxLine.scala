package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `StyleBoxLine`, extends `StyleBox`. */
abstract class StyleBoxLine extends StyleBox {

  /** StyleBoxLine.set_color */
  final def setColor(color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("StyleBoxLine", "set_color", 2920490490L), hostObject.objectPtr, color)

  /** StyleBoxLine.get_color */
  final def getColor(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("StyleBoxLine", "get_color", 3444240500L), hostObject.objectPtr)

  /** StyleBoxLine.set_thickness */
  final def setThickness(thickness: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("StyleBoxLine", "set_thickness", 1286410249L), hostObject.objectPtr, thickness)

  /** StyleBoxLine.get_thickness */
  final def getThickness(): Long =
    Ptrcall.call0[Long](MethodBind.get("StyleBoxLine", "get_thickness", 3905245786L), hostObject.objectPtr)

  /** StyleBoxLine.set_grow_begin */
  final def setGrowBegin(offset: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("StyleBoxLine", "set_grow_begin", 373806689L), hostObject.objectPtr, offset)

  /** StyleBoxLine.get_grow_begin */
  final def getGrowBegin(): Double =
    Ptrcall.call0[Double](MethodBind.get("StyleBoxLine", "get_grow_begin", 1740695150L), hostObject.objectPtr)

  /** StyleBoxLine.set_grow_end */
  final def setGrowEnd(offset: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("StyleBoxLine", "set_grow_end", 373806689L), hostObject.objectPtr, offset)

  /** StyleBoxLine.get_grow_end */
  final def getGrowEnd(): Double =
    Ptrcall.call0[Double](MethodBind.get("StyleBoxLine", "get_grow_end", 1740695150L), hostObject.objectPtr)

  /** StyleBoxLine.set_vertical */
  final def setVertical(vertical: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("StyleBoxLine", "set_vertical", 2586408642L), hostObject.objectPtr, vertical)

  /** StyleBoxLine.is_vertical */
  final def isVertical(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("StyleBoxLine", "is_vertical", 36873697L), hostObject.objectPtr)

}

object StyleBoxLine {
  /** Class metadata for Gd[StyleBoxLine] lifetime management and casting. */
  given GodotClass[StyleBoxLine] with {
    def className = "StyleBoxLine"
    def isRefCounted = true
    def wrap(o: GodotObject): StyleBoxLine = new StyleBoxLine {}.withHost(o.objectPtr)
    def unwrap(t: StyleBoxLine): GodotObject = t.hostObject
  }
}
