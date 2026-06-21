package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `ScrollBar`, extends `Range`. */
abstract class ScrollBar extends Range {

  /** ScrollBar.set_custom_step */
  final def setCustomStep(step: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("ScrollBar", "set_custom_step", 373806689L), hostObject.objectPtr, step)

  /** ScrollBar.get_custom_step */
  final def getCustomStep(): Double =
    Ptrcall.call0[Double](MethodBind.get("ScrollBar", "get_custom_step", 1740695150L), hostObject.objectPtr)

}

object ScrollBar {
  /** Class metadata for Gd[ScrollBar] lifetime management and casting. */
  given GodotClass[ScrollBar] with {
    def className = "ScrollBar"
    def isRefCounted = false
    def wrap(o: GodotObject): ScrollBar = new ScrollBar {}.withHost(o.objectPtr)
    def unwrap(t: ScrollBar): GodotObject = t.hostObject
  }
}
