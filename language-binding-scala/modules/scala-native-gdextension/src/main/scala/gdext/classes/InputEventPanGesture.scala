package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `InputEventPanGesture`, extends `InputEventGesture`. */
abstract class InputEventPanGesture extends InputEventGesture {
  override def godotClassName: String = "InputEventPanGesture"

  /** InputEventPanGesture.set_delta */
  final def setDelta(delta: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.InputEventPanGesture.mb_set_delta == null) gdext.classes.InputEventPanGesture.mb_set_delta = MethodBind.get("InputEventPanGesture", "set_delta", 743155724L)
    Ptrcall.callVoid1(gdext.classes.InputEventPanGesture.mb_set_delta, livePtr, delta)
  }

  /** InputEventPanGesture.get_delta */
  final def getDelta(): gdext.builtin.Vector2 = {
    if (gdext.classes.InputEventPanGesture.mb_get_delta == null) gdext.classes.InputEventPanGesture.mb_get_delta = MethodBind.get("InputEventPanGesture", "get_delta", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.InputEventPanGesture.mb_get_delta, livePtr)
  }

}

object InputEventPanGesture {
  private[classes] var mb_set_delta: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_delta: GDExtensionMethodBindPtr = null
}
