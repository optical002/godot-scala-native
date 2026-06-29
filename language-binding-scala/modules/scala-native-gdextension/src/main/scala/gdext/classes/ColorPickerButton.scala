package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `ColorPickerButton`, extends `Button`. */
abstract class ColorPickerButton extends Button {
  override def godotClassName: String = "ColorPickerButton"

  /** ColorPickerButton.set_pick_color */
  final def setPickColor(color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("ColorPickerButton", "set_pick_color", 2920490490L), hostObject.objectPtr, color)

  /** ColorPickerButton.get_pick_color */
  final def getPickColor(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("ColorPickerButton", "get_pick_color", 3444240500L), hostObject.objectPtr)

  /** ColorPickerButton.get_picker */
  final def getPicker(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("ColorPickerButton", "get_picker", 331835996L), hostObject.objectPtr)

  /** ColorPickerButton.get_popup */
  final def getPopup(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("ColorPickerButton", "get_popup", 1322440207L), hostObject.objectPtr)

  /** ColorPickerButton.set_edit_alpha */
  final def setEditAlpha(show: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("ColorPickerButton", "set_edit_alpha", 2586408642L), hostObject.objectPtr, show)

  /** ColorPickerButton.is_editing_alpha */
  final def isEditingAlpha(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("ColorPickerButton", "is_editing_alpha", 36873697L), hostObject.objectPtr)

  /** ColorPickerButton.set_edit_intensity */
  final def setEditIntensity(show: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("ColorPickerButton", "set_edit_intensity", 2586408642L), hostObject.objectPtr, show)

  /** ColorPickerButton.is_editing_intensity */
  final def isEditingIntensity(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("ColorPickerButton", "is_editing_intensity", 36873697L), hostObject.objectPtr)

}
