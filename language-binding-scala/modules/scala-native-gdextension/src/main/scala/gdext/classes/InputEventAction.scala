package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `InputEventAction`, extends `InputEvent`. */
abstract class InputEventAction extends InputEvent {
  override def godotClassName: String = "InputEventAction"

  /** InputEventAction.set_action */
  final def setAction(action: gdext.builtin.StringName): Unit = {
    if (gdext.classes.InputEventAction.mb_set_action == null) gdext.classes.InputEventAction.mb_set_action = MethodBind.get("InputEventAction", "set_action", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.InputEventAction.mb_set_action, livePtr, action)
  }

  /** InputEventAction.get_action */
  final def getAction(): gdext.builtin.StringName = {
    if (gdext.classes.InputEventAction.mb_get_action == null) gdext.classes.InputEventAction.mb_get_action = MethodBind.get("InputEventAction", "get_action", 2002593661L)
    Ptrcall.call0[gdext.builtin.StringName](gdext.classes.InputEventAction.mb_get_action, livePtr)
  }

  /** InputEventAction.set_pressed */
  final def setPressed(pressed: Boolean): Unit = {
    if (gdext.classes.InputEventAction.mb_set_pressed == null) gdext.classes.InputEventAction.mb_set_pressed = MethodBind.get("InputEventAction", "set_pressed", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.InputEventAction.mb_set_pressed, livePtr, pressed)
  }

  /** InputEventAction.set_strength */
  final def setStrength(strength: Double): Unit = {
    if (gdext.classes.InputEventAction.mb_set_strength == null) gdext.classes.InputEventAction.mb_set_strength = MethodBind.get("InputEventAction", "set_strength", 373806689L)
    Ptrcall.callVoid1(gdext.classes.InputEventAction.mb_set_strength, livePtr, strength)
  }

  /** InputEventAction.get_strength */
  final def getStrength(): Double = {
    if (gdext.classes.InputEventAction.mb_get_strength == null) gdext.classes.InputEventAction.mb_get_strength = MethodBind.get("InputEventAction", "get_strength", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.InputEventAction.mb_get_strength, livePtr)
  }

  /** InputEventAction.set_event_index */
  final def setEventIndex(index: Long): Unit = {
    if (gdext.classes.InputEventAction.mb_set_event_index == null) gdext.classes.InputEventAction.mb_set_event_index = MethodBind.get("InputEventAction", "set_event_index", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.InputEventAction.mb_set_event_index, livePtr, index)
  }

  /** InputEventAction.get_event_index */
  final def getEventIndex(): Long = {
    if (gdext.classes.InputEventAction.mb_get_event_index == null) gdext.classes.InputEventAction.mb_get_event_index = MethodBind.get("InputEventAction", "get_event_index", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.InputEventAction.mb_get_event_index, livePtr)
  }

}

object InputEventAction {
  private[classes] var mb_set_action: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_action: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_pressed: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_strength: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_strength: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_event_index: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_event_index: GDExtensionMethodBindPtr = null
}
