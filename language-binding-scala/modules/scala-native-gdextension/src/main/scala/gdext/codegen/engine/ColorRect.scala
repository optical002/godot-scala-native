package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `ColorRect`, extends `Control`. */
abstract class ColorRect extends Control {

  /** ColorRect.set_color */
  final def setColor(color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("ColorRect", "set_color", 2920490490L), hostObject.objectPtr, color)

  /** ColorRect.get_color */
  final def getColor(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("ColorRect", "get_color", 3444240500L), hostObject.objectPtr)

}

object ColorRect {
  /** Class metadata for Gd[ColorRect] lifetime management and casting. */
  given GodotClass[ColorRect] with {
    def className = "ColorRect"
    def isRefCounted = false
    def wrap(o: GodotObject): ColorRect = new ColorRect {}.withHost(o.objectPtr)
    def unwrap(t: ColorRect): GodotObject = t.hostObject
  }
}
