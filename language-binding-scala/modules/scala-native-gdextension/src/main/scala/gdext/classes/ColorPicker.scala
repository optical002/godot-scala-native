package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `ColorPicker`, extends `VBoxContainer`. */
abstract class ColorPicker extends VBoxContainer {
  override def godotClassName: String = "ColorPicker"

  /** ColorPicker.set_pick_color */
  final def setPickColor(color: gdext.builtin.Color): Unit = {
    if (gdext.classes.ColorPicker.mb_set_pick_color == null) gdext.classes.ColorPicker.mb_set_pick_color = MethodBind.get("ColorPicker", "set_pick_color", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.ColorPicker.mb_set_pick_color, livePtr, color)
  }

  /** ColorPicker.get_pick_color */
  final def getPickColor(): gdext.builtin.Color = {
    if (gdext.classes.ColorPicker.mb_get_pick_color == null) gdext.classes.ColorPicker.mb_get_pick_color = MethodBind.get("ColorPicker", "get_pick_color", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.ColorPicker.mb_get_pick_color, livePtr)
  }

  /** ColorPicker.set_deferred_mode */
  final def setDeferredMode(mode: Boolean): Unit = {
    if (gdext.classes.ColorPicker.mb_set_deferred_mode == null) gdext.classes.ColorPicker.mb_set_deferred_mode = MethodBind.get("ColorPicker", "set_deferred_mode", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.ColorPicker.mb_set_deferred_mode, livePtr, mode)
  }

  /** ColorPicker.is_deferred_mode */
  final def isDeferredMode(): Boolean = {
    if (gdext.classes.ColorPicker.mb_is_deferred_mode == null) gdext.classes.ColorPicker.mb_is_deferred_mode = MethodBind.get("ColorPicker", "is_deferred_mode", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.ColorPicker.mb_is_deferred_mode, livePtr)
  }

  /** ColorPicker.set_color_mode */
  final def setColorMode(colorMode: gdext.classes.ColorPicker.ColorModeType): Unit = {
    if (gdext.classes.ColorPicker.mb_set_color_mode == null) gdext.classes.ColorPicker.mb_set_color_mode = MethodBind.get("ColorPicker", "set_color_mode", 1579114136L)
    Ptrcall.callVoid1(gdext.classes.ColorPicker.mb_set_color_mode, livePtr, colorMode)
  }

  /** ColorPicker.get_color_mode */
  final def getColorMode(): gdext.classes.ColorPicker.ColorModeType = {
    if (gdext.classes.ColorPicker.mb_get_color_mode == null) gdext.classes.ColorPicker.mb_get_color_mode = MethodBind.get("ColorPicker", "get_color_mode", 392907674L)
    gdext.classes.ColorPicker.ColorModeType(Ptrcall.call0[Long](gdext.classes.ColorPicker.mb_get_color_mode, livePtr))
  }

  /** ColorPicker.set_edit_alpha */
  final def setEditAlpha(show: Boolean): Unit = {
    if (gdext.classes.ColorPicker.mb_set_edit_alpha == null) gdext.classes.ColorPicker.mb_set_edit_alpha = MethodBind.get("ColorPicker", "set_edit_alpha", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.ColorPicker.mb_set_edit_alpha, livePtr, show)
  }

  /** ColorPicker.is_editing_alpha */
  final def isEditingAlpha(): Boolean = {
    if (gdext.classes.ColorPicker.mb_is_editing_alpha == null) gdext.classes.ColorPicker.mb_is_editing_alpha = MethodBind.get("ColorPicker", "is_editing_alpha", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.ColorPicker.mb_is_editing_alpha, livePtr)
  }

  /** ColorPicker.set_edit_intensity */
  final def setEditIntensity(show: Boolean): Unit = {
    if (gdext.classes.ColorPicker.mb_set_edit_intensity == null) gdext.classes.ColorPicker.mb_set_edit_intensity = MethodBind.get("ColorPicker", "set_edit_intensity", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.ColorPicker.mb_set_edit_intensity, livePtr, show)
  }

  /** ColorPicker.is_editing_intensity */
  final def isEditingIntensity(): Boolean = {
    if (gdext.classes.ColorPicker.mb_is_editing_intensity == null) gdext.classes.ColorPicker.mb_is_editing_intensity = MethodBind.get("ColorPicker", "is_editing_intensity", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.ColorPicker.mb_is_editing_intensity, livePtr)
  }

  /** ColorPicker.set_can_add_swatches */
  final def setCanAddSwatches(enabled: Boolean): Unit = {
    if (gdext.classes.ColorPicker.mb_set_can_add_swatches == null) gdext.classes.ColorPicker.mb_set_can_add_swatches = MethodBind.get("ColorPicker", "set_can_add_swatches", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.ColorPicker.mb_set_can_add_swatches, livePtr, enabled)
  }

  /** ColorPicker.are_swatches_enabled */
  final def areSwatchesEnabled(): Boolean = {
    if (gdext.classes.ColorPicker.mb_are_swatches_enabled == null) gdext.classes.ColorPicker.mb_are_swatches_enabled = MethodBind.get("ColorPicker", "are_swatches_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.ColorPicker.mb_are_swatches_enabled, livePtr)
  }

  /** ColorPicker.set_presets_visible */
  final def setPresetsVisible(visible: Boolean): Unit = {
    if (gdext.classes.ColorPicker.mb_set_presets_visible == null) gdext.classes.ColorPicker.mb_set_presets_visible = MethodBind.get("ColorPicker", "set_presets_visible", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.ColorPicker.mb_set_presets_visible, livePtr, visible)
  }

  /** ColorPicker.are_presets_visible */
  final def arePresetsVisible(): Boolean = {
    if (gdext.classes.ColorPicker.mb_are_presets_visible == null) gdext.classes.ColorPicker.mb_are_presets_visible = MethodBind.get("ColorPicker", "are_presets_visible", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.ColorPicker.mb_are_presets_visible, livePtr)
  }

  /** ColorPicker.set_modes_visible */
  final def setModesVisible(visible: Boolean): Unit = {
    if (gdext.classes.ColorPicker.mb_set_modes_visible == null) gdext.classes.ColorPicker.mb_set_modes_visible = MethodBind.get("ColorPicker", "set_modes_visible", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.ColorPicker.mb_set_modes_visible, livePtr, visible)
  }

  /** ColorPicker.are_modes_visible */
  final def areModesVisible(): Boolean = {
    if (gdext.classes.ColorPicker.mb_are_modes_visible == null) gdext.classes.ColorPicker.mb_are_modes_visible = MethodBind.get("ColorPicker", "are_modes_visible", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.ColorPicker.mb_are_modes_visible, livePtr)
  }

  /** ColorPicker.set_sampler_visible */
  final def setSamplerVisible(visible: Boolean): Unit = {
    if (gdext.classes.ColorPicker.mb_set_sampler_visible == null) gdext.classes.ColorPicker.mb_set_sampler_visible = MethodBind.get("ColorPicker", "set_sampler_visible", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.ColorPicker.mb_set_sampler_visible, livePtr, visible)
  }

  /** ColorPicker.is_sampler_visible */
  final def isSamplerVisible(): Boolean = {
    if (gdext.classes.ColorPicker.mb_is_sampler_visible == null) gdext.classes.ColorPicker.mb_is_sampler_visible = MethodBind.get("ColorPicker", "is_sampler_visible", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.ColorPicker.mb_is_sampler_visible, livePtr)
  }

  /** ColorPicker.set_sliders_visible */
  final def setSlidersVisible(visible: Boolean): Unit = {
    if (gdext.classes.ColorPicker.mb_set_sliders_visible == null) gdext.classes.ColorPicker.mb_set_sliders_visible = MethodBind.get("ColorPicker", "set_sliders_visible", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.ColorPicker.mb_set_sliders_visible, livePtr, visible)
  }

  /** ColorPicker.are_sliders_visible */
  final def areSlidersVisible(): Boolean = {
    if (gdext.classes.ColorPicker.mb_are_sliders_visible == null) gdext.classes.ColorPicker.mb_are_sliders_visible = MethodBind.get("ColorPicker", "are_sliders_visible", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.ColorPicker.mb_are_sliders_visible, livePtr)
  }

  /** ColorPicker.set_hex_visible */
  final def setHexVisible(visible: Boolean): Unit = {
    if (gdext.classes.ColorPicker.mb_set_hex_visible == null) gdext.classes.ColorPicker.mb_set_hex_visible = MethodBind.get("ColorPicker", "set_hex_visible", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.ColorPicker.mb_set_hex_visible, livePtr, visible)
  }

  /** ColorPicker.is_hex_visible */
  final def isHexVisible(): Boolean = {
    if (gdext.classes.ColorPicker.mb_is_hex_visible == null) gdext.classes.ColorPicker.mb_is_hex_visible = MethodBind.get("ColorPicker", "is_hex_visible", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.ColorPicker.mb_is_hex_visible, livePtr)
  }

  /** ColorPicker.add_preset */
  final def addPreset(color: gdext.builtin.Color): Unit = {
    if (gdext.classes.ColorPicker.mb_add_preset == null) gdext.classes.ColorPicker.mb_add_preset = MethodBind.get("ColorPicker", "add_preset", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.ColorPicker.mb_add_preset, livePtr, color)
  }

  /** ColorPicker.erase_preset */
  final def erasePreset(color: gdext.builtin.Color): Unit = {
    if (gdext.classes.ColorPicker.mb_erase_preset == null) gdext.classes.ColorPicker.mb_erase_preset = MethodBind.get("ColorPicker", "erase_preset", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.ColorPicker.mb_erase_preset, livePtr, color)
  }

  /** ColorPicker.add_recent_preset */
  final def addRecentPreset(color: gdext.builtin.Color): Unit = {
    if (gdext.classes.ColorPicker.mb_add_recent_preset == null) gdext.classes.ColorPicker.mb_add_recent_preset = MethodBind.get("ColorPicker", "add_recent_preset", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.ColorPicker.mb_add_recent_preset, livePtr, color)
  }

  /** ColorPicker.erase_recent_preset */
  final def eraseRecentPreset(color: gdext.builtin.Color): Unit = {
    if (gdext.classes.ColorPicker.mb_erase_recent_preset == null) gdext.classes.ColorPicker.mb_erase_recent_preset = MethodBind.get("ColorPicker", "erase_recent_preset", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.ColorPicker.mb_erase_recent_preset, livePtr, color)
  }

  /** ColorPicker.set_picker_shape */
  final def setPickerShape(shape: gdext.classes.ColorPicker.PickerShapeType): Unit = {
    if (gdext.classes.ColorPicker.mb_set_picker_shape == null) gdext.classes.ColorPicker.mb_set_picker_shape = MethodBind.get("ColorPicker", "set_picker_shape", 3981373861L)
    Ptrcall.callVoid1(gdext.classes.ColorPicker.mb_set_picker_shape, livePtr, shape)
  }

  /** ColorPicker.get_picker_shape */
  final def getPickerShape(): gdext.classes.ColorPicker.PickerShapeType = {
    if (gdext.classes.ColorPicker.mb_get_picker_shape == null) gdext.classes.ColorPicker.mb_get_picker_shape = MethodBind.get("ColorPicker", "get_picker_shape", 1143229889L)
    gdext.classes.ColorPicker.PickerShapeType(Ptrcall.call0[Long](gdext.classes.ColorPicker.mb_get_picker_shape, livePtr))
  }

}

object ColorPicker {
  private[classes] var mb_set_pick_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_pick_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_deferred_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_deferred_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_color_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_color_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_edit_alpha: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_editing_alpha: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_edit_intensity: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_editing_intensity: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_can_add_swatches: GDExtensionMethodBindPtr = null
  private[classes] var mb_are_swatches_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_presets_visible: GDExtensionMethodBindPtr = null
  private[classes] var mb_are_presets_visible: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_modes_visible: GDExtensionMethodBindPtr = null
  private[classes] var mb_are_modes_visible: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_sampler_visible: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_sampler_visible: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_sliders_visible: GDExtensionMethodBindPtr = null
  private[classes] var mb_are_sliders_visible: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_hex_visible: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_hex_visible: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_preset: GDExtensionMethodBindPtr = null
  private[classes] var mb_erase_preset: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_recent_preset: GDExtensionMethodBindPtr = null
  private[classes] var mb_erase_recent_preset: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_picker_shape: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_picker_shape: GDExtensionMethodBindPtr = null

  /** Godot enum `ColorPicker.ColorModeType`. */
  opaque type ColorModeType <: Long = Long

  object ColorModeType {
    final val Rgb: ColorModeType = 0L.asInstanceOf[ColorModeType]
    final val Hsv: ColorModeType = 1L.asInstanceOf[ColorModeType]
    final val Raw: ColorModeType = 2L.asInstanceOf[ColorModeType]
    final val Linear: ColorModeType = 2L.asInstanceOf[ColorModeType]
    final val Okhsl: ColorModeType = 3L.asInstanceOf[ColorModeType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ColorModeType = value.asInstanceOf[ColorModeType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ColorModeType] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[ColorModeType]]

    extension (self: ColorModeType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Rgb"
        case 1L => "Hsv"
        case 2L => "Raw"
        case 3L => "Okhsl"
        case other => other.toString
      }
  }

  /** Godot enum `ColorPicker.PickerShapeType`. */
  opaque type PickerShapeType <: Long = Long

  object PickerShapeType {
    final val HsvRectangle: PickerShapeType = 0L.asInstanceOf[PickerShapeType]
    final val HsvWheel: PickerShapeType = 1L.asInstanceOf[PickerShapeType]
    final val VhsCircle: PickerShapeType = 2L.asInstanceOf[PickerShapeType]
    final val OkhslCircle: PickerShapeType = 3L.asInstanceOf[PickerShapeType]
    final val None: PickerShapeType = 4L.asInstanceOf[PickerShapeType]
    final val OkHsRectangle: PickerShapeType = 5L.asInstanceOf[PickerShapeType]
    final val OkHlRectangle: PickerShapeType = 6L.asInstanceOf[PickerShapeType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): PickerShapeType = value.asInstanceOf[PickerShapeType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[PickerShapeType] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L).asInstanceOf[scala.IArray[PickerShapeType]]

    extension (self: PickerShapeType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "HsvRectangle"
        case 1L => "HsvWheel"
        case 2L => "VhsCircle"
        case 3L => "OkhslCircle"
        case 4L => "None"
        case 5L => "OkHsRectangle"
        case 6L => "OkHlRectangle"
        case other => other.toString
      }
  }
}
