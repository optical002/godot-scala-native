package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `InputEventFromWindow`, extends `InputEvent`. */
abstract class InputEventFromWindow extends InputEvent {
  override def godotClassName: String = "InputEventFromWindow"

  /** InputEventFromWindow.set_window_id */
  final def setWindowId(id: Long): Unit = {
    if (gdext.classes.InputEventFromWindow.mb_set_window_id == null) gdext.classes.InputEventFromWindow.mb_set_window_id = MethodBind.get("InputEventFromWindow", "set_window_id", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.InputEventFromWindow.mb_set_window_id, livePtr, id)
  }

  /** InputEventFromWindow.get_window_id */
  final def getWindowId(): Long = {
    if (gdext.classes.InputEventFromWindow.mb_get_window_id == null) gdext.classes.InputEventFromWindow.mb_get_window_id = MethodBind.get("InputEventFromWindow", "get_window_id", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.InputEventFromWindow.mb_get_window_id, livePtr)
  }

}

object InputEventFromWindow {
  private[classes] var mb_set_window_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_window_id: GDExtensionMethodBindPtr = null
}
