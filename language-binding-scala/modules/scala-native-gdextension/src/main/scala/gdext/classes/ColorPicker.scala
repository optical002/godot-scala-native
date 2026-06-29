package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `ColorPicker`, extends `VBoxContainer`. */
abstract class ColorPicker extends VBoxContainer {
  override def godotClassName: String = "ColorPicker"

  /** ColorPicker.set_pick_color */
  final def setPickColor(color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("ColorPicker", "set_pick_color", 2920490490L), hostObject.objectPtr, color)

  /** ColorPicker.get_pick_color */
  final def getPickColor(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("ColorPicker", "get_pick_color", 3444240500L), hostObject.objectPtr)

  /** ColorPicker.set_deferred_mode */
  final def setDeferredMode(mode: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("ColorPicker", "set_deferred_mode", 2586408642L), hostObject.objectPtr, mode)

  /** ColorPicker.is_deferred_mode */
  final def isDeferredMode(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("ColorPicker", "is_deferred_mode", 36873697L), hostObject.objectPtr)

  /** ColorPicker.set_color_mode */
  final def setColorMode(color_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("ColorPicker", "set_color_mode", 1579114136L), hostObject.objectPtr, color_mode)

  /** ColorPicker.get_color_mode */
  final def getColorMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("ColorPicker", "get_color_mode", 392907674L), hostObject.objectPtr)

  /** ColorPicker.set_edit_alpha */
  final def setEditAlpha(show: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("ColorPicker", "set_edit_alpha", 2586408642L), hostObject.objectPtr, show)

  /** ColorPicker.is_editing_alpha */
  final def isEditingAlpha(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("ColorPicker", "is_editing_alpha", 36873697L), hostObject.objectPtr)

  /** ColorPicker.set_edit_intensity */
  final def setEditIntensity(show: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("ColorPicker", "set_edit_intensity", 2586408642L), hostObject.objectPtr, show)

  /** ColorPicker.is_editing_intensity */
  final def isEditingIntensity(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("ColorPicker", "is_editing_intensity", 36873697L), hostObject.objectPtr)

  /** ColorPicker.set_can_add_swatches */
  final def setCanAddSwatches(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("ColorPicker", "set_can_add_swatches", 2586408642L), hostObject.objectPtr, enabled)

  /** ColorPicker.are_swatches_enabled */
  final def areSwatchesEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("ColorPicker", "are_swatches_enabled", 36873697L), hostObject.objectPtr)

  /** ColorPicker.set_presets_visible */
  final def setPresetsVisible(visible: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("ColorPicker", "set_presets_visible", 2586408642L), hostObject.objectPtr, visible)

  /** ColorPicker.are_presets_visible */
  final def arePresetsVisible(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("ColorPicker", "are_presets_visible", 36873697L), hostObject.objectPtr)

  /** ColorPicker.set_modes_visible */
  final def setModesVisible(visible: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("ColorPicker", "set_modes_visible", 2586408642L), hostObject.objectPtr, visible)

  /** ColorPicker.are_modes_visible */
  final def areModesVisible(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("ColorPicker", "are_modes_visible", 36873697L), hostObject.objectPtr)

  /** ColorPicker.set_sampler_visible */
  final def setSamplerVisible(visible: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("ColorPicker", "set_sampler_visible", 2586408642L), hostObject.objectPtr, visible)

  /** ColorPicker.is_sampler_visible */
  final def isSamplerVisible(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("ColorPicker", "is_sampler_visible", 36873697L), hostObject.objectPtr)

  /** ColorPicker.set_sliders_visible */
  final def setSlidersVisible(visible: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("ColorPicker", "set_sliders_visible", 2586408642L), hostObject.objectPtr, visible)

  /** ColorPicker.are_sliders_visible */
  final def areSlidersVisible(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("ColorPicker", "are_sliders_visible", 36873697L), hostObject.objectPtr)

  /** ColorPicker.set_hex_visible */
  final def setHexVisible(visible: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("ColorPicker", "set_hex_visible", 2586408642L), hostObject.objectPtr, visible)

  /** ColorPicker.is_hex_visible */
  final def isHexVisible(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("ColorPicker", "is_hex_visible", 36873697L), hostObject.objectPtr)

  /** ColorPicker.add_preset */
  final def addPreset(color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("ColorPicker", "add_preset", 2920490490L), hostObject.objectPtr, color)

  /** ColorPicker.erase_preset */
  final def erasePreset(color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("ColorPicker", "erase_preset", 2920490490L), hostObject.objectPtr, color)

  /** ColorPicker.add_recent_preset */
  final def addRecentPreset(color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("ColorPicker", "add_recent_preset", 2920490490L), hostObject.objectPtr, color)

  /** ColorPicker.erase_recent_preset */
  final def eraseRecentPreset(color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("ColorPicker", "erase_recent_preset", 2920490490L), hostObject.objectPtr, color)

  /** ColorPicker.set_picker_shape */
  final def setPickerShape(shape: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("ColorPicker", "set_picker_shape", 3981373861L), hostObject.objectPtr, shape)

  /** ColorPicker.get_picker_shape */
  final def getPickerShape(): Long =
    Ptrcall.call0[Long](MethodBind.get("ColorPicker", "get_picker_shape", 1143229889L), hostObject.objectPtr)

}
