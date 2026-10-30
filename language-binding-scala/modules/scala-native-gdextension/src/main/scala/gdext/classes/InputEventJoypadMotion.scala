package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `InputEventJoypadMotion`, extends `InputEvent`. */
abstract class InputEventJoypadMotion extends InputEvent {
  override def godotClassName: String = "InputEventJoypadMotion"

  /** InputEventJoypadMotion.set_axis */
  final def setAxis(axis: gdext.classes.JoyAxis): Unit = {
    if (gdext.classes.InputEventJoypadMotion.mb_set_axis == null) gdext.classes.InputEventJoypadMotion.mb_set_axis = MethodBind.get("InputEventJoypadMotion", "set_axis", 1332685170L)
    Ptrcall.callVoid1(gdext.classes.InputEventJoypadMotion.mb_set_axis, livePtr, axis)
  }

  /** InputEventJoypadMotion.get_axis */
  final def getAxis(): gdext.classes.JoyAxis = {
    if (gdext.classes.InputEventJoypadMotion.mb_get_axis == null) gdext.classes.InputEventJoypadMotion.mb_get_axis = MethodBind.get("InputEventJoypadMotion", "get_axis", 4019121683L)
    gdext.classes.JoyAxis(Ptrcall.call0[Long](gdext.classes.InputEventJoypadMotion.mb_get_axis, livePtr))
  }

  /** InputEventJoypadMotion.set_axis_value */
  final def setAxisValue(axisValue: Double): Unit = {
    if (gdext.classes.InputEventJoypadMotion.mb_set_axis_value == null) gdext.classes.InputEventJoypadMotion.mb_set_axis_value = MethodBind.get("InputEventJoypadMotion", "set_axis_value", 373806689L)
    Ptrcall.callVoid1(gdext.classes.InputEventJoypadMotion.mb_set_axis_value, livePtr, axisValue)
  }

  /** InputEventJoypadMotion.get_axis_value */
  final def getAxisValue(): Double = {
    if (gdext.classes.InputEventJoypadMotion.mb_get_axis_value == null) gdext.classes.InputEventJoypadMotion.mb_get_axis_value = MethodBind.get("InputEventJoypadMotion", "get_axis_value", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.InputEventJoypadMotion.mb_get_axis_value, livePtr)
  }

}

object InputEventJoypadMotion {
  private[classes] var mb_set_axis: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_axis: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_axis_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_axis_value: GDExtensionMethodBindPtr = null
}
