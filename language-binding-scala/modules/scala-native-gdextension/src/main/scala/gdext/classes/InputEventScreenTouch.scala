package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `InputEventScreenTouch`, extends `InputEventFromWindow`. */
abstract class InputEventScreenTouch extends InputEventFromWindow {
  override def godotClassName: String = "InputEventScreenTouch"

  /** InputEventScreenTouch.set_index */
  final def setIndex(index: Long): Unit = {
    if (gdext.classes.InputEventScreenTouch.mb_set_index == null) gdext.classes.InputEventScreenTouch.mb_set_index = MethodBind.get("InputEventScreenTouch", "set_index", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.InputEventScreenTouch.mb_set_index, livePtr, index)
  }

  /** InputEventScreenTouch.get_index */
  final def getIndex(): Long = {
    if (gdext.classes.InputEventScreenTouch.mb_get_index == null) gdext.classes.InputEventScreenTouch.mb_get_index = MethodBind.get("InputEventScreenTouch", "get_index", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.InputEventScreenTouch.mb_get_index, livePtr)
  }

  /** InputEventScreenTouch.set_position */
  final def setPosition(position: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.InputEventScreenTouch.mb_set_position == null) gdext.classes.InputEventScreenTouch.mb_set_position = MethodBind.get("InputEventScreenTouch", "set_position", 743155724L)
    Ptrcall.callVoid1(gdext.classes.InputEventScreenTouch.mb_set_position, livePtr, position)
  }

  /** InputEventScreenTouch.get_position */
  final def getPosition(): gdext.builtin.Vector2 = {
    if (gdext.classes.InputEventScreenTouch.mb_get_position == null) gdext.classes.InputEventScreenTouch.mb_get_position = MethodBind.get("InputEventScreenTouch", "get_position", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.InputEventScreenTouch.mb_get_position, livePtr)
  }

  /** InputEventScreenTouch.set_pressed */
  final def setPressed(pressed: Boolean): Unit = {
    if (gdext.classes.InputEventScreenTouch.mb_set_pressed == null) gdext.classes.InputEventScreenTouch.mb_set_pressed = MethodBind.get("InputEventScreenTouch", "set_pressed", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.InputEventScreenTouch.mb_set_pressed, livePtr, pressed)
  }

  /** InputEventScreenTouch.set_canceled */
  final def setCanceled(canceled: Boolean): Unit = {
    if (gdext.classes.InputEventScreenTouch.mb_set_canceled == null) gdext.classes.InputEventScreenTouch.mb_set_canceled = MethodBind.get("InputEventScreenTouch", "set_canceled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.InputEventScreenTouch.mb_set_canceled, livePtr, canceled)
  }

  /** InputEventScreenTouch.set_double_tap */
  final def setDoubleTap(doubleTap: Boolean): Unit = {
    if (gdext.classes.InputEventScreenTouch.mb_set_double_tap == null) gdext.classes.InputEventScreenTouch.mb_set_double_tap = MethodBind.get("InputEventScreenTouch", "set_double_tap", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.InputEventScreenTouch.mb_set_double_tap, livePtr, doubleTap)
  }

  /** InputEventScreenTouch.is_double_tap */
  final def isDoubleTap(): Boolean = {
    if (gdext.classes.InputEventScreenTouch.mb_is_double_tap == null) gdext.classes.InputEventScreenTouch.mb_is_double_tap = MethodBind.get("InputEventScreenTouch", "is_double_tap", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.InputEventScreenTouch.mb_is_double_tap, livePtr)
  }

}

object InputEventScreenTouch {
  private[classes] var mb_set_index: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_index: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_pressed: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_canceled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_double_tap: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_double_tap: GDExtensionMethodBindPtr = null
}
