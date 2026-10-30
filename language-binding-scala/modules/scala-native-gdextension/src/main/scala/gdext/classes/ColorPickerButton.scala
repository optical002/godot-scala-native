package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `ColorPickerButton`, extends `Button`. */
abstract class ColorPickerButton extends Button {
  override def godotClassName: String = "ColorPickerButton"

  /** ColorPickerButton.set_pick_color */
  final def setPickColor(color: gdext.builtin.Color): Unit = {
    if (gdext.classes.ColorPickerButton.mb_set_pick_color == null) gdext.classes.ColorPickerButton.mb_set_pick_color = MethodBind.get("ColorPickerButton", "set_pick_color", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.ColorPickerButton.mb_set_pick_color, livePtr, color)
  }

  /** ColorPickerButton.get_pick_color */
  final def getPickColor(): gdext.builtin.Color = {
    if (gdext.classes.ColorPickerButton.mb_get_pick_color == null) gdext.classes.ColorPickerButton.mb_get_pick_color = MethodBind.get("ColorPickerButton", "get_pick_color", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.ColorPickerButton.mb_get_pick_color, livePtr)
  }

  /** ColorPickerButton.get_picker */
  final def getPicker(): ColorPicker = {
    if (gdext.classes.ColorPickerButton.mb_get_picker == null) gdext.classes.ColorPickerButton.mb_get_picker = MethodBind.get("ColorPickerButton", "get_picker", 331835996L)
    Wrappers.borrowed[ColorPicker](Ptrcall.call0[Long](gdext.classes.ColorPickerButton.mb_get_picker, livePtr))
  }

  /** ColorPickerButton.get_popup */
  final def getPopup(): PopupPanel = {
    if (gdext.classes.ColorPickerButton.mb_get_popup == null) gdext.classes.ColorPickerButton.mb_get_popup = MethodBind.get("ColorPickerButton", "get_popup", 1322440207L)
    Wrappers.borrowed[PopupPanel](Ptrcall.call0[Long](gdext.classes.ColorPickerButton.mb_get_popup, livePtr))
  }

  /** ColorPickerButton.set_edit_alpha */
  final def setEditAlpha(show: Boolean): Unit = {
    if (gdext.classes.ColorPickerButton.mb_set_edit_alpha == null) gdext.classes.ColorPickerButton.mb_set_edit_alpha = MethodBind.get("ColorPickerButton", "set_edit_alpha", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.ColorPickerButton.mb_set_edit_alpha, livePtr, show)
  }

  /** ColorPickerButton.is_editing_alpha */
  final def isEditingAlpha(): Boolean = {
    if (gdext.classes.ColorPickerButton.mb_is_editing_alpha == null) gdext.classes.ColorPickerButton.mb_is_editing_alpha = MethodBind.get("ColorPickerButton", "is_editing_alpha", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.ColorPickerButton.mb_is_editing_alpha, livePtr)
  }

  /** ColorPickerButton.set_edit_intensity */
  final def setEditIntensity(show: Boolean): Unit = {
    if (gdext.classes.ColorPickerButton.mb_set_edit_intensity == null) gdext.classes.ColorPickerButton.mb_set_edit_intensity = MethodBind.get("ColorPickerButton", "set_edit_intensity", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.ColorPickerButton.mb_set_edit_intensity, livePtr, show)
  }

  /** ColorPickerButton.is_editing_intensity */
  final def isEditingIntensity(): Boolean = {
    if (gdext.classes.ColorPickerButton.mb_is_editing_intensity == null) gdext.classes.ColorPickerButton.mb_is_editing_intensity = MethodBind.get("ColorPickerButton", "is_editing_intensity", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.ColorPickerButton.mb_is_editing_intensity, livePtr)
  }

}

object ColorPickerButton {
  private[classes] var mb_set_pick_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_pick_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_picker: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_popup: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_edit_alpha: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_editing_alpha: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_edit_intensity: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_editing_intensity: GDExtensionMethodBindPtr = null
}
