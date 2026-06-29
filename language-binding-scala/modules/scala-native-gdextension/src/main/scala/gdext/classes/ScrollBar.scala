package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `ScrollBar`, extends `Range`. */
abstract class ScrollBar extends Range {
  override def godotClassName: String = "ScrollBar"

  /** ScrollBar.set_custom_step */
  final def setCustomStep(step: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("ScrollBar", "set_custom_step", 373806689L), hostObject.objectPtr, step)

  /** ScrollBar.get_custom_step */
  final def getCustomStep(): Double =
    Ptrcall.call0[Double](MethodBind.get("ScrollBar", "get_custom_step", 1740695150L), hostObject.objectPtr)

}
