package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `ButtonGroup`, extends `Resource`. */
abstract class ButtonGroup extends Resource {
  override def godotClassName: String = "ButtonGroup"

  /** ButtonGroup.get_pressed_button */
  final def getPressedButton(): BaseButton = {
    if (gdext.classes.ButtonGroup.mb_get_pressed_button == null) gdext.classes.ButtonGroup.mb_get_pressed_button = MethodBind.get("ButtonGroup", "get_pressed_button", 3886434893L)
    Wrappers.borrowed[BaseButton](Ptrcall.call0[Long](gdext.classes.ButtonGroup.mb_get_pressed_button, livePtr))
  }

  /** ButtonGroup.set_allow_unpress */
  final def setAllowUnpress(enabled: Boolean): Unit = {
    if (gdext.classes.ButtonGroup.mb_set_allow_unpress == null) gdext.classes.ButtonGroup.mb_set_allow_unpress = MethodBind.get("ButtonGroup", "set_allow_unpress", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.ButtonGroup.mb_set_allow_unpress, livePtr, enabled)
  }

  /** ButtonGroup.is_allow_unpress */
  final def isAllowUnpress(): Boolean = {
    if (gdext.classes.ButtonGroup.mb_is_allow_unpress == null) gdext.classes.ButtonGroup.mb_is_allow_unpress = MethodBind.get("ButtonGroup", "is_allow_unpress", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.ButtonGroup.mb_is_allow_unpress, livePtr)
  }

}

object ButtonGroup {
  private[classes] var mb_get_pressed_button: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_allow_unpress: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_allow_unpress: GDExtensionMethodBindPtr = null
}
