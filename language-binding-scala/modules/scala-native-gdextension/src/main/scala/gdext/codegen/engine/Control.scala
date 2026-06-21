package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `Control`, extends `CanvasItem`. */
abstract class Control extends CanvasItem {

  /** Control.accept_event */
  final def acceptEvent(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Control", "accept_event", 3218959716L), hostObject.objectPtr)

  /** Control.get_minimum_size */
  final def getMinimumSize(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("Control", "get_minimum_size", 3341600327L), hostObject.objectPtr)

  /** Control.get_combined_minimum_size */
  final def getCombinedMinimumSize(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("Control", "get_combined_minimum_size", 3341600327L), hostObject.objectPtr)

  /** Control.set_anchors_preset */
  final def setAnchorsPreset(preset: Long, keep_offsets: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("Control", "set_anchors_preset", 509135270L), hostObject.objectPtr, preset, keep_offsets)

  /** Control.set_offsets_preset */
  final def setOffsetsPreset(preset: Long, resize_mode: Long, margin: Long): Unit =
    Ptrcall.callVoid3(MethodBind.get("Control", "set_offsets_preset", 3724524307L), hostObject.objectPtr, preset, resize_mode, margin)

  /** Control.set_anchors_and_offsets_preset */
  final def setAnchorsAndOffsetsPreset(preset: Long, resize_mode: Long, margin: Long): Unit =
    Ptrcall.callVoid3(MethodBind.get("Control", "set_anchors_and_offsets_preset", 3724524307L), hostObject.objectPtr, preset, resize_mode, margin)

  /** Control.set_anchor */
  final def setAnchor(side: Long, anchor: Double, keep_offset: Boolean, push_opposite_anchor: Boolean): Unit =
    Ptrcall.callVoid4(MethodBind.get("Control", "set_anchor", 2302782885L), hostObject.objectPtr, side, anchor, keep_offset, push_opposite_anchor)

  /** Control.get_anchor */
  final def getAnchor(side: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("Control", "get_anchor", 2869120046L), hostObject.objectPtr, side)

  /** Control.set_offset */
  final def setOffset(side: Long, offset: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("Control", "set_offset", 4290182280L), hostObject.objectPtr, side, offset)

  /** Control.get_offset */
  final def getOffset(offset: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("Control", "get_offset", 2869120046L), hostObject.objectPtr, offset)

  /** Control.set_anchor_and_offset */
  final def setAnchorAndOffset(side: Long, anchor: Double, offset: Double, push_opposite_anchor: Boolean): Unit =
    Ptrcall.callVoid4(MethodBind.get("Control", "set_anchor_and_offset", 4031722181L), hostObject.objectPtr, side, anchor, offset, push_opposite_anchor)

  /** Control.set_begin */
  final def setBegin(position: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("Control", "set_begin", 743155724L), hostObject.objectPtr, position)

  /** Control.set_end */
  final def setEnd(position: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("Control", "set_end", 743155724L), hostObject.objectPtr, position)

  /** Control.set_position */
  final def setPosition(position: gdext.builtin.Vector2, keep_offsets: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("Control", "set_position", 2436320129L), hostObject.objectPtr, position, keep_offsets)

  /** Control.set_size */
  final def setSize(size: gdext.builtin.Vector2, keep_offsets: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("Control", "set_size", 2436320129L), hostObject.objectPtr, size, keep_offsets)

  /** Control.reset_size */
  final def resetSize(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Control", "reset_size", 3218959716L), hostObject.objectPtr)

  /** Control.set_custom_minimum_size */
  final def setCustomMinimumSize(size: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("Control", "set_custom_minimum_size", 743155724L), hostObject.objectPtr, size)

  /** Control.set_global_position */
  final def setGlobalPosition(position: gdext.builtin.Vector2, keep_offsets: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("Control", "set_global_position", 2436320129L), hostObject.objectPtr, position, keep_offsets)

  /** Control.set_rotation */
  final def setRotation(radians: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Control", "set_rotation", 373806689L), hostObject.objectPtr, radians)

  /** Control.set_rotation_degrees */
  final def setRotationDegrees(degrees: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Control", "set_rotation_degrees", 373806689L), hostObject.objectPtr, degrees)

  /** Control.set_scale */
  final def setScale(scale: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("Control", "set_scale", 743155724L), hostObject.objectPtr, scale)

  /** Control.set_pivot_offset */
  final def setPivotOffset(pivot_offset: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("Control", "set_pivot_offset", 743155724L), hostObject.objectPtr, pivot_offset)

  /** Control.set_pivot_offset_ratio */
  final def setPivotOffsetRatio(ratio: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("Control", "set_pivot_offset_ratio", 743155724L), hostObject.objectPtr, ratio)

  /** Control.get_begin */
  final def getBegin(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("Control", "get_begin", 3341600327L), hostObject.objectPtr)

  /** Control.get_end */
  final def getEnd(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("Control", "get_end", 3341600327L), hostObject.objectPtr)

  /** Control.get_position */
  final def getPosition(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("Control", "get_position", 3341600327L), hostObject.objectPtr)

  /** Control.get_size */
  final def getSize(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("Control", "get_size", 3341600327L), hostObject.objectPtr)

  /** Control.get_rotation */
  final def getRotation(): Double =
    Ptrcall.call0[Double](MethodBind.get("Control", "get_rotation", 1740695150L), hostObject.objectPtr)

  /** Control.get_rotation_degrees */
  final def getRotationDegrees(): Double =
    Ptrcall.call0[Double](MethodBind.get("Control", "get_rotation_degrees", 1740695150L), hostObject.objectPtr)

  /** Control.get_scale */
  final def getScale(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("Control", "get_scale", 3341600327L), hostObject.objectPtr)

  /** Control.get_pivot_offset */
  final def getPivotOffset(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("Control", "get_pivot_offset", 3341600327L), hostObject.objectPtr)

  /** Control.get_pivot_offset_ratio */
  final def getPivotOffsetRatio(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("Control", "get_pivot_offset_ratio", 3341600327L), hostObject.objectPtr)

  /** Control.get_combined_pivot_offset */
  final def getCombinedPivotOffset(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("Control", "get_combined_pivot_offset", 3341600327L), hostObject.objectPtr)

  /** Control.get_custom_minimum_size */
  final def getCustomMinimumSize(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("Control", "get_custom_minimum_size", 3341600327L), hostObject.objectPtr)

  /** Control.get_parent_area_size */
  final def getParentAreaSize(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("Control", "get_parent_area_size", 3341600327L), hostObject.objectPtr)

  /** Control.get_global_position */
  final def getGlobalPosition(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("Control", "get_global_position", 3341600327L), hostObject.objectPtr)

  /** Control.get_screen_position */
  final def getScreenPosition(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("Control", "get_screen_position", 3341600327L), hostObject.objectPtr)

  /** Control.get_rect */
  final def getRect(): gdext.builtin.Rect2 =
    Ptrcall.call0[gdext.builtin.Rect2](MethodBind.get("Control", "get_rect", 1639390495L), hostObject.objectPtr)

  /** Control.get_global_rect */
  final def getGlobalRect(): gdext.builtin.Rect2 =
    Ptrcall.call0[gdext.builtin.Rect2](MethodBind.get("Control", "get_global_rect", 1639390495L), hostObject.objectPtr)

  /** Control.set_focus_mode */
  final def setFocusMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Control", "set_focus_mode", 3232914922L), hostObject.objectPtr, mode)

  /** Control.get_focus_mode */
  final def getFocusMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("Control", "get_focus_mode", 2132829277L), hostObject.objectPtr)

  /** Control.get_focus_mode_with_override */
  final def getFocusModeWithOverride(): Long =
    Ptrcall.call0[Long](MethodBind.get("Control", "get_focus_mode_with_override", 2132829277L), hostObject.objectPtr)

  /** Control.set_focus_behavior_recursive */
  final def setFocusBehaviorRecursive(focus_behavior_recursive: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Control", "set_focus_behavior_recursive", 4256832521L), hostObject.objectPtr, focus_behavior_recursive)

  /** Control.get_focus_behavior_recursive */
  final def getFocusBehaviorRecursive(): Long =
    Ptrcall.call0[Long](MethodBind.get("Control", "get_focus_behavior_recursive", 2435707181L), hostObject.objectPtr)

  /** Control.has_focus */
  final def hasFocus(ignore_hidden_focus: Boolean): Boolean =
    Ptrcall.call1[Boolean, Boolean](MethodBind.get("Control", "has_focus", 3302206351L), hostObject.objectPtr, ignore_hidden_focus)

  /** Control.grab_focus */
  final def grabFocus(hide_focus: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Control", "grab_focus", 107499316L), hostObject.objectPtr, hide_focus)

  /** Control.release_focus */
  final def releaseFocus(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Control", "release_focus", 3218959716L), hostObject.objectPtr)

  /** Control.find_prev_valid_focus */
  final def findPrevValidFocus(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Control", "find_prev_valid_focus", 2783021301L), hostObject.objectPtr)

  /** Control.find_next_valid_focus */
  final def findNextValidFocus(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Control", "find_next_valid_focus", 2783021301L), hostObject.objectPtr)

  /** Control.find_valid_focus_neighbor */
  final def findValidFocusNeighbor(side: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("Control", "find_valid_focus_neighbor", 1543910170L), hostObject.objectPtr, side)

  /** Control.set_h_size_flags */
  final def setHSizeFlags(flags: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Control", "set_h_size_flags", 394851643L), hostObject.objectPtr, flags)

  /** Control.get_h_size_flags */
  final def getHSizeFlags(): Long =
    Ptrcall.call0[Long](MethodBind.get("Control", "get_h_size_flags", 3781367401L), hostObject.objectPtr)

  /** Control.set_stretch_ratio */
  final def setStretchRatio(ratio: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Control", "set_stretch_ratio", 373806689L), hostObject.objectPtr, ratio)

  /** Control.get_stretch_ratio */
  final def getStretchRatio(): Double =
    Ptrcall.call0[Double](MethodBind.get("Control", "get_stretch_ratio", 1740695150L), hostObject.objectPtr)

  /** Control.set_v_size_flags */
  final def setVSizeFlags(flags: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Control", "set_v_size_flags", 394851643L), hostObject.objectPtr, flags)

  /** Control.get_v_size_flags */
  final def getVSizeFlags(): Long =
    Ptrcall.call0[Long](MethodBind.get("Control", "get_v_size_flags", 3781367401L), hostObject.objectPtr)

  /** Control.set_theme */
  final def setTheme(theme: Theme): Unit =
    Ptrcall.callVoid1(MethodBind.get("Control", "set_theme", 2326690814L), hostObject.objectPtr, theme.hostObject)

  /** Control.get_theme */
  final def getTheme(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Control", "get_theme", 3846893731L), hostObject.objectPtr)

  /** Control.set_theme_type_variation */
  final def setThemeTypeVariation(theme_type: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("Control", "set_theme_type_variation", 3304788590L), hostObject.objectPtr, theme_type)

  /** Control.get_theme_type_variation */
  final def getThemeTypeVariation(): gdext.builtin.StringName =
    Ptrcall.call0[gdext.builtin.StringName](MethodBind.get("Control", "get_theme_type_variation", 2002593661L), hostObject.objectPtr)

  /** Control.begin_bulk_theme_override */
  final def beginBulkThemeOverride(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Control", "begin_bulk_theme_override", 3218959716L), hostObject.objectPtr)

  /** Control.end_bulk_theme_override */
  final def endBulkThemeOverride(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Control", "end_bulk_theme_override", 3218959716L), hostObject.objectPtr)

  /** Control.add_theme_icon_override */
  final def addThemeIconOverride(name: gdext.builtin.StringName, texture: Texture2D): Unit =
    Ptrcall.callVoid2(MethodBind.get("Control", "add_theme_icon_override", 1373065600L), hostObject.objectPtr, name, texture.hostObject)

  /** Control.add_theme_stylebox_override */
  final def addThemeStyleboxOverride(name: gdext.builtin.StringName, stylebox: StyleBox): Unit =
    Ptrcall.callVoid2(MethodBind.get("Control", "add_theme_stylebox_override", 4188838905L), hostObject.objectPtr, name, stylebox.hostObject)

  /** Control.add_theme_font_override */
  final def addThemeFontOverride(name: gdext.builtin.StringName, font: Font): Unit =
    Ptrcall.callVoid2(MethodBind.get("Control", "add_theme_font_override", 3518018674L), hostObject.objectPtr, name, font.hostObject)

  /** Control.add_theme_font_size_override */
  final def addThemeFontSizeOverride(name: gdext.builtin.StringName, font_size: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("Control", "add_theme_font_size_override", 2415702435L), hostObject.objectPtr, name, font_size)

  /** Control.add_theme_color_override */
  final def addThemeColorOverride(name: gdext.builtin.StringName, color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid2(MethodBind.get("Control", "add_theme_color_override", 4260178595L), hostObject.objectPtr, name, color)

  /** Control.add_theme_constant_override */
  final def addThemeConstantOverride(name: gdext.builtin.StringName, constant: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("Control", "add_theme_constant_override", 2415702435L), hostObject.objectPtr, name, constant)

  /** Control.remove_theme_icon_override */
  final def removeThemeIconOverride(name: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("Control", "remove_theme_icon_override", 3304788590L), hostObject.objectPtr, name)

  /** Control.remove_theme_stylebox_override */
  final def removeThemeStyleboxOverride(name: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("Control", "remove_theme_stylebox_override", 3304788590L), hostObject.objectPtr, name)

  /** Control.remove_theme_font_override */
  final def removeThemeFontOverride(name: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("Control", "remove_theme_font_override", 3304788590L), hostObject.objectPtr, name)

  /** Control.remove_theme_font_size_override */
  final def removeThemeFontSizeOverride(name: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("Control", "remove_theme_font_size_override", 3304788590L), hostObject.objectPtr, name)

  /** Control.remove_theme_color_override */
  final def removeThemeColorOverride(name: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("Control", "remove_theme_color_override", 3304788590L), hostObject.objectPtr, name)

  /** Control.remove_theme_constant_override */
  final def removeThemeConstantOverride(name: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("Control", "remove_theme_constant_override", 3304788590L), hostObject.objectPtr, name)

  /** Control.get_theme_icon */
  final def getThemeIcon(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): GodotObject =
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, GodotObject](MethodBind.get("Control", "get_theme_icon", 3163973443L), hostObject.objectPtr, name, theme_type)

  /** Control.get_theme_stylebox */
  final def getThemeStylebox(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): GodotObject =
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, GodotObject](MethodBind.get("Control", "get_theme_stylebox", 604739069L), hostObject.objectPtr, name, theme_type)

  /** Control.get_theme_font */
  final def getThemeFont(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): GodotObject =
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, GodotObject](MethodBind.get("Control", "get_theme_font", 2826986490L), hostObject.objectPtr, name, theme_type)

  /** Control.get_theme_font_size */
  final def getThemeFontSize(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Long =
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, Long](MethodBind.get("Control", "get_theme_font_size", 1327056374L), hostObject.objectPtr, name, theme_type)

  /** Control.get_theme_color */
  final def getThemeColor(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): gdext.builtin.Color =
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, gdext.builtin.Color](MethodBind.get("Control", "get_theme_color", 2798751242L), hostObject.objectPtr, name, theme_type)

  /** Control.get_theme_constant */
  final def getThemeConstant(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Long =
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, Long](MethodBind.get("Control", "get_theme_constant", 1327056374L), hostObject.objectPtr, name, theme_type)

  /** Control.has_theme_icon_override */
  final def hasThemeIconOverride(name: gdext.builtin.StringName): Boolean =
    Ptrcall.call1[gdext.builtin.StringName, Boolean](MethodBind.get("Control", "has_theme_icon_override", 2619796661L), hostObject.objectPtr, name)

  /** Control.has_theme_stylebox_override */
  final def hasThemeStyleboxOverride(name: gdext.builtin.StringName): Boolean =
    Ptrcall.call1[gdext.builtin.StringName, Boolean](MethodBind.get("Control", "has_theme_stylebox_override", 2619796661L), hostObject.objectPtr, name)

  /** Control.has_theme_font_override */
  final def hasThemeFontOverride(name: gdext.builtin.StringName): Boolean =
    Ptrcall.call1[gdext.builtin.StringName, Boolean](MethodBind.get("Control", "has_theme_font_override", 2619796661L), hostObject.objectPtr, name)

  /** Control.has_theme_font_size_override */
  final def hasThemeFontSizeOverride(name: gdext.builtin.StringName): Boolean =
    Ptrcall.call1[gdext.builtin.StringName, Boolean](MethodBind.get("Control", "has_theme_font_size_override", 2619796661L), hostObject.objectPtr, name)

  /** Control.has_theme_color_override */
  final def hasThemeColorOverride(name: gdext.builtin.StringName): Boolean =
    Ptrcall.call1[gdext.builtin.StringName, Boolean](MethodBind.get("Control", "has_theme_color_override", 2619796661L), hostObject.objectPtr, name)

  /** Control.has_theme_constant_override */
  final def hasThemeConstantOverride(name: gdext.builtin.StringName): Boolean =
    Ptrcall.call1[gdext.builtin.StringName, Boolean](MethodBind.get("Control", "has_theme_constant_override", 2619796661L), hostObject.objectPtr, name)

  /** Control.has_theme_icon */
  final def hasThemeIcon(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Boolean =
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, Boolean](MethodBind.get("Control", "has_theme_icon", 866386512L), hostObject.objectPtr, name, theme_type)

  /** Control.has_theme_stylebox */
  final def hasThemeStylebox(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Boolean =
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, Boolean](MethodBind.get("Control", "has_theme_stylebox", 866386512L), hostObject.objectPtr, name, theme_type)

  /** Control.has_theme_font */
  final def hasThemeFont(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Boolean =
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, Boolean](MethodBind.get("Control", "has_theme_font", 866386512L), hostObject.objectPtr, name, theme_type)

  /** Control.has_theme_font_size */
  final def hasThemeFontSize(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Boolean =
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, Boolean](MethodBind.get("Control", "has_theme_font_size", 866386512L), hostObject.objectPtr, name, theme_type)

  /** Control.has_theme_color */
  final def hasThemeColor(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Boolean =
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, Boolean](MethodBind.get("Control", "has_theme_color", 866386512L), hostObject.objectPtr, name, theme_type)

  /** Control.has_theme_constant */
  final def hasThemeConstant(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Boolean =
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, Boolean](MethodBind.get("Control", "has_theme_constant", 866386512L), hostObject.objectPtr, name, theme_type)

  /** Control.get_theme_default_base_scale */
  final def getThemeDefaultBaseScale(): Double =
    Ptrcall.call0[Double](MethodBind.get("Control", "get_theme_default_base_scale", 1740695150L), hostObject.objectPtr)

  /** Control.get_theme_default_font */
  final def getThemeDefaultFont(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Control", "get_theme_default_font", 3229501585L), hostObject.objectPtr)

  /** Control.get_theme_default_font_size */
  final def getThemeDefaultFontSize(): Long =
    Ptrcall.call0[Long](MethodBind.get("Control", "get_theme_default_font_size", 3905245786L), hostObject.objectPtr)

  /** Control.get_parent_control */
  final def getParentControl(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Control", "get_parent_control", 2783021301L), hostObject.objectPtr)

  /** Control.set_h_grow_direction */
  final def setHGrowDirection(direction: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Control", "set_h_grow_direction", 2022385301L), hostObject.objectPtr, direction)

  /** Control.get_h_grow_direction */
  final def getHGrowDirection(): Long =
    Ptrcall.call0[Long](MethodBind.get("Control", "get_h_grow_direction", 3635610155L), hostObject.objectPtr)

  /** Control.set_v_grow_direction */
  final def setVGrowDirection(direction: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Control", "set_v_grow_direction", 2022385301L), hostObject.objectPtr, direction)

  /** Control.get_v_grow_direction */
  final def getVGrowDirection(): Long =
    Ptrcall.call0[Long](MethodBind.get("Control", "get_v_grow_direction", 3635610155L), hostObject.objectPtr)

  /** Control.set_tooltip_auto_translate_mode */
  final def setTooltipAutoTranslateMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Control", "set_tooltip_auto_translate_mode", 776149714L), hostObject.objectPtr, mode)

  /** Control.get_tooltip_auto_translate_mode */
  final def getTooltipAutoTranslateMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("Control", "get_tooltip_auto_translate_mode", 2498906432L), hostObject.objectPtr)

  /** Control.set_tooltip_text */
  final def setTooltipText(hint: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("Control", "set_tooltip_text", 83702148L), hostObject.objectPtr, hint)

  /** Control.get_tooltip_text */
  final def getTooltipText(): String =
    Ptrcall.call0[String](MethodBind.get("Control", "get_tooltip_text", 201670096L), hostObject.objectPtr)

  /** Control.get_tooltip */
  final def getTooltip(at_position: gdext.builtin.Vector2): String =
    Ptrcall.call1[gdext.builtin.Vector2, String](MethodBind.get("Control", "get_tooltip", 2895288280L), hostObject.objectPtr, at_position)

  /** Control.set_default_cursor_shape */
  final def setDefaultCursorShape(shape: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Control", "set_default_cursor_shape", 217062046L), hostObject.objectPtr, shape)

  /** Control.get_default_cursor_shape */
  final def getDefaultCursorShape(): Long =
    Ptrcall.call0[Long](MethodBind.get("Control", "get_default_cursor_shape", 2359535750L), hostObject.objectPtr)

  /** Control.get_cursor_shape */
  final def getCursorShape(position: gdext.builtin.Vector2): Long =
    Ptrcall.call1[gdext.builtin.Vector2, Long](MethodBind.get("Control", "get_cursor_shape", 1395773853L), hostObject.objectPtr, position)

  /** Control.accessibility_drag */
  final def accessibilityDrag(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Control", "accessibility_drag", 3218959716L), hostObject.objectPtr)

  /** Control.accessibility_drop */
  final def accessibilityDrop(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Control", "accessibility_drop", 3218959716L), hostObject.objectPtr)

  /** Control.set_accessibility_name */
  final def setAccessibilityName(name: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("Control", "set_accessibility_name", 83702148L), hostObject.objectPtr, name)

  /** Control.get_accessibility_name */
  final def getAccessibilityName(): String =
    Ptrcall.call0[String](MethodBind.get("Control", "get_accessibility_name", 201670096L), hostObject.objectPtr)

  /** Control.set_accessibility_description */
  final def setAccessibilityDescription(description: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("Control", "set_accessibility_description", 83702148L), hostObject.objectPtr, description)

  /** Control.get_accessibility_description */
  final def getAccessibilityDescription(): String =
    Ptrcall.call0[String](MethodBind.get("Control", "get_accessibility_description", 201670096L), hostObject.objectPtr)

  /** Control.set_accessibility_live */
  final def setAccessibilityLive(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Control", "set_accessibility_live", 1720261470L), hostObject.objectPtr, mode)

  /** Control.get_accessibility_live */
  final def getAccessibilityLive(): Long =
    Ptrcall.call0[Long](MethodBind.get("Control", "get_accessibility_live", 3311037003L), hostObject.objectPtr)

  /** Control.set_mouse_filter */
  final def setMouseFilter(filter: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Control", "set_mouse_filter", 3891156122L), hostObject.objectPtr, filter)

  /** Control.get_mouse_filter */
  final def getMouseFilter(): Long =
    Ptrcall.call0[Long](MethodBind.get("Control", "get_mouse_filter", 1572545674L), hostObject.objectPtr)

  /** Control.get_mouse_filter_with_override */
  final def getMouseFilterWithOverride(): Long =
    Ptrcall.call0[Long](MethodBind.get("Control", "get_mouse_filter_with_override", 1572545674L), hostObject.objectPtr)

  /** Control.set_mouse_behavior_recursive */
  final def setMouseBehaviorRecursive(mouse_behavior_recursive: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Control", "set_mouse_behavior_recursive", 849284636L), hostObject.objectPtr, mouse_behavior_recursive)

  /** Control.get_mouse_behavior_recursive */
  final def getMouseBehaviorRecursive(): Long =
    Ptrcall.call0[Long](MethodBind.get("Control", "get_mouse_behavior_recursive", 3779367402L), hostObject.objectPtr)

  /** Control.set_force_pass_scroll_events */
  final def setForcePassScrollEvents(force_pass_scroll_events: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Control", "set_force_pass_scroll_events", 2586408642L), hostObject.objectPtr, force_pass_scroll_events)

  /** Control.is_force_pass_scroll_events */
  final def isForcePassScrollEvents(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Control", "is_force_pass_scroll_events", 36873697L), hostObject.objectPtr)

  /** Control.set_clip_contents */
  final def setClipContents(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Control", "set_clip_contents", 2586408642L), hostObject.objectPtr, enable)

  /** Control.is_clipping_contents */
  final def isClippingContents(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Control", "is_clipping_contents", 2240911060L), hostObject.objectPtr)

  /** Control.grab_click_focus */
  final def grabClickFocus(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Control", "grab_click_focus", 3218959716L), hostObject.objectPtr)

  /** Control.set_drag_preview */
  final def setDragPreview(control: Control): Unit =
    Ptrcall.callVoid1(MethodBind.get("Control", "set_drag_preview", 1496901182L), hostObject.objectPtr, control.hostObject)

  /** Control.is_drag_successful */
  final def isDragSuccessful(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Control", "is_drag_successful", 36873697L), hostObject.objectPtr)

  /** Control.warp_mouse */
  final def warpMouse(position: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("Control", "warp_mouse", 743155724L), hostObject.objectPtr, position)

  /** Control.set_shortcut_context */
  final def setShortcutContext(node: Node): Unit =
    Ptrcall.callVoid1(MethodBind.get("Control", "set_shortcut_context", 1078189570L), hostObject.objectPtr, node.hostObject)

  /** Control.get_shortcut_context */
  final def getShortcutContext(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Control", "get_shortcut_context", 3160264692L), hostObject.objectPtr)

  /** Control.update_minimum_size */
  final def updateMinimumSize(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Control", "update_minimum_size", 3218959716L), hostObject.objectPtr)

  /** Control.set_layout_direction */
  final def setLayoutDirection(direction: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Control", "set_layout_direction", 3310692370L), hostObject.objectPtr, direction)

  /** Control.get_layout_direction */
  final def getLayoutDirection(): Long =
    Ptrcall.call0[Long](MethodBind.get("Control", "get_layout_direction", 1546772008L), hostObject.objectPtr)

  /** Control.is_layout_rtl */
  final def isLayoutRtl(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Control", "is_layout_rtl", 36873697L), hostObject.objectPtr)

  /** Control.set_auto_translate */
  final def setAutoTranslate(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Control", "set_auto_translate", 2586408642L), hostObject.objectPtr, enable)

  /** Control.is_auto_translating */
  final def isAutoTranslating(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Control", "is_auto_translating", 36873697L), hostObject.objectPtr)

  /** Control.set_localize_numeral_system */
  final def setLocalizeNumeralSystem(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Control", "set_localize_numeral_system", 2586408642L), hostObject.objectPtr, enable)

  /** Control.is_localizing_numeral_system */
  final def isLocalizingNumeralSystem(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Control", "is_localizing_numeral_system", 36873697L), hostObject.objectPtr)

}

object Control {
  /** Class metadata for Gd[Control] lifetime management and casting. */
  given GodotClass[Control] with {
    def className = "Control"
    def isRefCounted = false
    def wrap(o: GodotObject): Control = new Control {}.withHost(o.objectPtr)
    def unwrap(t: Control): GodotObject = t.hostObject
  }
}
