package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `InputEventMagnifyGesture`, extends `InputEventGesture`. */
abstract class InputEventMagnifyGesture extends InputEventGesture {
  override def godotClassName: String = "InputEventMagnifyGesture"

  /** InputEventMagnifyGesture.set_factor */
  final def setFactor(factor: Double): Unit = {
    if (gdext.classes.InputEventMagnifyGesture.mb_set_factor == null) gdext.classes.InputEventMagnifyGesture.mb_set_factor = MethodBind.get("InputEventMagnifyGesture", "set_factor", 373806689L)
    Ptrcall.callVoid1(gdext.classes.InputEventMagnifyGesture.mb_set_factor, livePtr, factor)
  }

  /** InputEventMagnifyGesture.get_factor */
  final def getFactor(): Double = {
    if (gdext.classes.InputEventMagnifyGesture.mb_get_factor == null) gdext.classes.InputEventMagnifyGesture.mb_get_factor = MethodBind.get("InputEventMagnifyGesture", "get_factor", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.InputEventMagnifyGesture.mb_get_factor, livePtr)
  }

}

object InputEventMagnifyGesture {
  private[classes] var mb_set_factor: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_factor: GDExtensionMethodBindPtr = null
}
