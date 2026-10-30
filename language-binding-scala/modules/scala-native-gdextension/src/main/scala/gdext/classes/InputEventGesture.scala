package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `InputEventGesture`, extends `InputEventWithModifiers`. */
abstract class InputEventGesture extends InputEventWithModifiers {
  override def godotClassName: String = "InputEventGesture"

  /** InputEventGesture.set_position */
  final def setPosition(position: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.InputEventGesture.mb_set_position == null) gdext.classes.InputEventGesture.mb_set_position = MethodBind.get("InputEventGesture", "set_position", 743155724L)
    Ptrcall.callVoid1(gdext.classes.InputEventGesture.mb_set_position, livePtr, position)
  }

  /** InputEventGesture.get_position */
  final def getPosition(): gdext.builtin.Vector2 = {
    if (gdext.classes.InputEventGesture.mb_get_position == null) gdext.classes.InputEventGesture.mb_get_position = MethodBind.get("InputEventGesture", "get_position", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.InputEventGesture.mb_get_position, livePtr)
  }

}

object InputEventGesture {
  private[classes] var mb_set_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_position: GDExtensionMethodBindPtr = null
}
