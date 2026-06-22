package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `ReferenceRect`, extends `Control`. */
abstract class ReferenceRect extends Control {

  /** ReferenceRect.get_border_color */
  final def getBorderColor(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("ReferenceRect", "get_border_color", 3444240500L), hostObject.objectPtr)

  /** ReferenceRect.set_border_color */
  final def setBorderColor(color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("ReferenceRect", "set_border_color", 2920490490L), hostObject.objectPtr, color)

  /** ReferenceRect.get_border_width */
  final def getBorderWidth(): Double =
    Ptrcall.call0[Double](MethodBind.get("ReferenceRect", "get_border_width", 1740695150L), hostObject.objectPtr)

  /** ReferenceRect.set_border_width */
  final def setBorderWidth(width: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("ReferenceRect", "set_border_width", 373806689L), hostObject.objectPtr, width)

  /** ReferenceRect.get_editor_only */
  final def getEditorOnly(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("ReferenceRect", "get_editor_only", 36873697L), hostObject.objectPtr)

  /** ReferenceRect.set_editor_only */
  final def setEditorOnly(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("ReferenceRect", "set_editor_only", 2586408642L), hostObject.objectPtr, enabled)

}

object ReferenceRect {
  /** Class metadata for Gd[ReferenceRect] lifetime management and casting. */
  given GodotClass[ReferenceRect] with {
    def className = "ReferenceRect"
    def isRefCounted = false
    def wrap(o: GodotObject): ReferenceRect = new ReferenceRect {}.withHost(o.objectPtr)
    def unwrap(t: ReferenceRect): GodotObject = t.hostObject
  }
}
