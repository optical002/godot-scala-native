package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Control`, extends `CanvasItem`. */
abstract class Control extends CanvasItem {
  override def godotClassName: String = "Control"

  /** Control.accept_event */
  final def acceptEvent(): Unit = {
    if (gdext.classes.Control.mb_accept_event == null) gdext.classes.Control.mb_accept_event = MethodBind.get("Control", "accept_event", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Control.mb_accept_event, livePtr)
  }

  /** Control.get_minimum_size */
  final def getMinimumSize(): gdext.builtin.Vector2 = {
    if (gdext.classes.Control.mb_get_minimum_size == null) gdext.classes.Control.mb_get_minimum_size = MethodBind.get("Control", "get_minimum_size", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.Control.mb_get_minimum_size, livePtr)
  }

  /** Control.get_combined_minimum_size */
  final def getCombinedMinimumSize(): gdext.builtin.Vector2 = {
    if (gdext.classes.Control.mb_get_combined_minimum_size == null) gdext.classes.Control.mb_get_combined_minimum_size = MethodBind.get("Control", "get_combined_minimum_size", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.Control.mb_get_combined_minimum_size, livePtr)
  }

  /** Control.set_anchors_preset */
  final def setAnchorsPreset(preset: gdext.classes.Control.LayoutPreset, keepOffsets: Boolean = false): Unit = {
    if (gdext.classes.Control.mb_set_anchors_preset == null) gdext.classes.Control.mb_set_anchors_preset = MethodBind.get("Control", "set_anchors_preset", 509135270L)
    Ptrcall.callVoid2(gdext.classes.Control.mb_set_anchors_preset, livePtr, preset, keepOffsets)
  }

  /** Control.set_offsets_preset */
  final def setOffsetsPreset(preset: gdext.classes.Control.LayoutPreset, resizeMode: gdext.classes.Control.LayoutPresetMode = gdext.classes.Control.LayoutPresetMode(0L), margin: Long = 0L): Unit = {
    if (gdext.classes.Control.mb_set_offsets_preset == null) gdext.classes.Control.mb_set_offsets_preset = MethodBind.get("Control", "set_offsets_preset", 3724524307L)
    Ptrcall.callVoid3(gdext.classes.Control.mb_set_offsets_preset, livePtr, preset, resizeMode, margin)
  }

  /** Control.set_anchors_and_offsets_preset */
  final def setAnchorsAndOffsetsPreset(preset: gdext.classes.Control.LayoutPreset, resizeMode: gdext.classes.Control.LayoutPresetMode = gdext.classes.Control.LayoutPresetMode(0L), margin: Long = 0L): Unit = {
    if (gdext.classes.Control.mb_set_anchors_and_offsets_preset == null) gdext.classes.Control.mb_set_anchors_and_offsets_preset = MethodBind.get("Control", "set_anchors_and_offsets_preset", 3724524307L)
    Ptrcall.callVoid3(gdext.classes.Control.mb_set_anchors_and_offsets_preset, livePtr, preset, resizeMode, margin)
  }

  /** Control.set_anchor */
  final def setAnchor(side: gdext.classes.Side, anchor: Double, keepOffset: Boolean = false, pushOppositeAnchor: Boolean = true): Unit = {
    if (gdext.classes.Control.mb_set_anchor == null) gdext.classes.Control.mb_set_anchor = MethodBind.get("Control", "set_anchor", 2302782885L)
    Ptrcall.callVoid4(gdext.classes.Control.mb_set_anchor, livePtr, side, anchor, keepOffset, pushOppositeAnchor)
  }

  /** Control.get_anchor */
  final def getAnchor(side: gdext.classes.Side): Double = {
    if (gdext.classes.Control.mb_get_anchor == null) gdext.classes.Control.mb_get_anchor = MethodBind.get("Control", "get_anchor", 2869120046L)
    Ptrcall.call1[Long, Double](gdext.classes.Control.mb_get_anchor, livePtr, side)
  }

  /** Control.set_offset */
  final def setOffset(side: gdext.classes.Side, offset: Double): Unit = {
    if (gdext.classes.Control.mb_set_offset == null) gdext.classes.Control.mb_set_offset = MethodBind.get("Control", "set_offset", 4290182280L)
    Ptrcall.callVoid2(gdext.classes.Control.mb_set_offset, livePtr, side, offset)
  }

  /** Control.get_offset */
  final def getOffset(offset: gdext.classes.Side): Double = {
    if (gdext.classes.Control.mb_get_offset == null) gdext.classes.Control.mb_get_offset = MethodBind.get("Control", "get_offset", 2869120046L)
    Ptrcall.call1[Long, Double](gdext.classes.Control.mb_get_offset, livePtr, offset)
  }

  /** Control.set_anchor_and_offset */
  final def setAnchorAndOffset(side: gdext.classes.Side, anchor: Double, offset: Double, pushOppositeAnchor: Boolean = false): Unit = {
    if (gdext.classes.Control.mb_set_anchor_and_offset == null) gdext.classes.Control.mb_set_anchor_and_offset = MethodBind.get("Control", "set_anchor_and_offset", 4031722181L)
    Ptrcall.callVoid4(gdext.classes.Control.mb_set_anchor_and_offset, livePtr, side, anchor, offset, pushOppositeAnchor)
  }

  /** Control.set_begin */
  final def setBegin(position: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.Control.mb_set_begin == null) gdext.classes.Control.mb_set_begin = MethodBind.get("Control", "set_begin", 743155724L)
    Ptrcall.callVoid1(gdext.classes.Control.mb_set_begin, livePtr, position)
  }

  /** Control.set_end */
  final def setEnd(position: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.Control.mb_set_end == null) gdext.classes.Control.mb_set_end = MethodBind.get("Control", "set_end", 743155724L)
    Ptrcall.callVoid1(gdext.classes.Control.mb_set_end, livePtr, position)
  }

  /** Control.set_position */
  final def setPosition(position: gdext.builtin.Vector2, keepOffsets: Boolean = false): Unit = {
    if (gdext.classes.Control.mb_set_position == null) gdext.classes.Control.mb_set_position = MethodBind.get("Control", "set_position", 2436320129L)
    Ptrcall.callVoid2(gdext.classes.Control.mb_set_position, livePtr, position, keepOffsets)
  }

  /** Control.set_size */
  final def setSize(size: gdext.builtin.Vector2, keepOffsets: Boolean = false): Unit = {
    if (gdext.classes.Control.mb_set_size == null) gdext.classes.Control.mb_set_size = MethodBind.get("Control", "set_size", 2436320129L)
    Ptrcall.callVoid2(gdext.classes.Control.mb_set_size, livePtr, size, keepOffsets)
  }

  /** Control.reset_size */
  final def resetSize(): Unit = {
    if (gdext.classes.Control.mb_reset_size == null) gdext.classes.Control.mb_reset_size = MethodBind.get("Control", "reset_size", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Control.mb_reset_size, livePtr)
  }

  /** Control.set_custom_minimum_size */
  final def setCustomMinimumSize(size: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.Control.mb_set_custom_minimum_size == null) gdext.classes.Control.mb_set_custom_minimum_size = MethodBind.get("Control", "set_custom_minimum_size", 743155724L)
    Ptrcall.callVoid1(gdext.classes.Control.mb_set_custom_minimum_size, livePtr, size)
  }

  /** Control.set_global_position */
  final def setGlobalPosition(position: gdext.builtin.Vector2, keepOffsets: Boolean = false): Unit = {
    if (gdext.classes.Control.mb_set_global_position == null) gdext.classes.Control.mb_set_global_position = MethodBind.get("Control", "set_global_position", 2436320129L)
    Ptrcall.callVoid2(gdext.classes.Control.mb_set_global_position, livePtr, position, keepOffsets)
  }

  /** Control.set_rotation */
  final def setRotation(radians: Double): Unit = {
    if (gdext.classes.Control.mb_set_rotation == null) gdext.classes.Control.mb_set_rotation = MethodBind.get("Control", "set_rotation", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Control.mb_set_rotation, livePtr, radians)
  }

  /** Control.set_rotation_degrees */
  final def setRotationDegrees(degrees: Double): Unit = {
    if (gdext.classes.Control.mb_set_rotation_degrees == null) gdext.classes.Control.mb_set_rotation_degrees = MethodBind.get("Control", "set_rotation_degrees", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Control.mb_set_rotation_degrees, livePtr, degrees)
  }

  /** Control.set_scale */
  final def setScale(scale: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.Control.mb_set_scale == null) gdext.classes.Control.mb_set_scale = MethodBind.get("Control", "set_scale", 743155724L)
    Ptrcall.callVoid1(gdext.classes.Control.mb_set_scale, livePtr, scale)
  }

  /** Control.set_pivot_offset */
  final def setPivotOffset(pivotOffset: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.Control.mb_set_pivot_offset == null) gdext.classes.Control.mb_set_pivot_offset = MethodBind.get("Control", "set_pivot_offset", 743155724L)
    Ptrcall.callVoid1(gdext.classes.Control.mb_set_pivot_offset, livePtr, pivotOffset)
  }

  /** Control.set_pivot_offset_ratio */
  final def setPivotOffsetRatio(ratio: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.Control.mb_set_pivot_offset_ratio == null) gdext.classes.Control.mb_set_pivot_offset_ratio = MethodBind.get("Control", "set_pivot_offset_ratio", 743155724L)
    Ptrcall.callVoid1(gdext.classes.Control.mb_set_pivot_offset_ratio, livePtr, ratio)
  }

  /** Control.get_begin */
  final def getBegin(): gdext.builtin.Vector2 = {
    if (gdext.classes.Control.mb_get_begin == null) gdext.classes.Control.mb_get_begin = MethodBind.get("Control", "get_begin", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.Control.mb_get_begin, livePtr)
  }

  /** Control.get_end */
  final def getEnd(): gdext.builtin.Vector2 = {
    if (gdext.classes.Control.mb_get_end == null) gdext.classes.Control.mb_get_end = MethodBind.get("Control", "get_end", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.Control.mb_get_end, livePtr)
  }

  /** Control.get_position */
  final def getPosition(): gdext.builtin.Vector2 = {
    if (gdext.classes.Control.mb_get_position == null) gdext.classes.Control.mb_get_position = MethodBind.get("Control", "get_position", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.Control.mb_get_position, livePtr)
  }

  /** Control.get_size */
  final def getSize(): gdext.builtin.Vector2 = {
    if (gdext.classes.Control.mb_get_size == null) gdext.classes.Control.mb_get_size = MethodBind.get("Control", "get_size", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.Control.mb_get_size, livePtr)
  }

  /** Control.get_rotation */
  final def getRotation(): Double = {
    if (gdext.classes.Control.mb_get_rotation == null) gdext.classes.Control.mb_get_rotation = MethodBind.get("Control", "get_rotation", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Control.mb_get_rotation, livePtr)
  }

  /** Control.get_rotation_degrees */
  final def getRotationDegrees(): Double = {
    if (gdext.classes.Control.mb_get_rotation_degrees == null) gdext.classes.Control.mb_get_rotation_degrees = MethodBind.get("Control", "get_rotation_degrees", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Control.mb_get_rotation_degrees, livePtr)
  }

  /** Control.get_scale */
  final def getScale(): gdext.builtin.Vector2 = {
    if (gdext.classes.Control.mb_get_scale == null) gdext.classes.Control.mb_get_scale = MethodBind.get("Control", "get_scale", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.Control.mb_get_scale, livePtr)
  }

  /** Control.get_pivot_offset */
  final def getPivotOffset(): gdext.builtin.Vector2 = {
    if (gdext.classes.Control.mb_get_pivot_offset == null) gdext.classes.Control.mb_get_pivot_offset = MethodBind.get("Control", "get_pivot_offset", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.Control.mb_get_pivot_offset, livePtr)
  }

  /** Control.get_pivot_offset_ratio */
  final def getPivotOffsetRatio(): gdext.builtin.Vector2 = {
    if (gdext.classes.Control.mb_get_pivot_offset_ratio == null) gdext.classes.Control.mb_get_pivot_offset_ratio = MethodBind.get("Control", "get_pivot_offset_ratio", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.Control.mb_get_pivot_offset_ratio, livePtr)
  }

  /** Control.get_combined_pivot_offset */
  final def getCombinedPivotOffset(): gdext.builtin.Vector2 = {
    if (gdext.classes.Control.mb_get_combined_pivot_offset == null) gdext.classes.Control.mb_get_combined_pivot_offset = MethodBind.get("Control", "get_combined_pivot_offset", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.Control.mb_get_combined_pivot_offset, livePtr)
  }

  /** Control.get_custom_minimum_size */
  final def getCustomMinimumSize(): gdext.builtin.Vector2 = {
    if (gdext.classes.Control.mb_get_custom_minimum_size == null) gdext.classes.Control.mb_get_custom_minimum_size = MethodBind.get("Control", "get_custom_minimum_size", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.Control.mb_get_custom_minimum_size, livePtr)
  }

  /** Control.get_parent_area_size */
  final def getParentAreaSize(): gdext.builtin.Vector2 = {
    if (gdext.classes.Control.mb_get_parent_area_size == null) gdext.classes.Control.mb_get_parent_area_size = MethodBind.get("Control", "get_parent_area_size", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.Control.mb_get_parent_area_size, livePtr)
  }

  /** Control.get_global_position */
  final def getGlobalPosition(): gdext.builtin.Vector2 = {
    if (gdext.classes.Control.mb_get_global_position == null) gdext.classes.Control.mb_get_global_position = MethodBind.get("Control", "get_global_position", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.Control.mb_get_global_position, livePtr)
  }

  /** Control.get_screen_position */
  final def getScreenPosition(): gdext.builtin.Vector2 = {
    if (gdext.classes.Control.mb_get_screen_position == null) gdext.classes.Control.mb_get_screen_position = MethodBind.get("Control", "get_screen_position", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.Control.mb_get_screen_position, livePtr)
  }

  /** Control.get_rect */
  final def getRect(): gdext.builtin.Rect2 = {
    if (gdext.classes.Control.mb_get_rect == null) gdext.classes.Control.mb_get_rect = MethodBind.get("Control", "get_rect", 1639390495L)
    Ptrcall.call0[gdext.builtin.Rect2](gdext.classes.Control.mb_get_rect, livePtr)
  }

  /** Control.get_global_rect */
  final def getGlobalRect(): gdext.builtin.Rect2 = {
    if (gdext.classes.Control.mb_get_global_rect == null) gdext.classes.Control.mb_get_global_rect = MethodBind.get("Control", "get_global_rect", 1639390495L)
    Ptrcall.call0[gdext.builtin.Rect2](gdext.classes.Control.mb_get_global_rect, livePtr)
  }

  /** Control.set_focus_mode */
  final def setFocusMode(mode: gdext.classes.Control.FocusMode): Unit = {
    if (gdext.classes.Control.mb_set_focus_mode == null) gdext.classes.Control.mb_set_focus_mode = MethodBind.get("Control", "set_focus_mode", 3232914922L)
    Ptrcall.callVoid1(gdext.classes.Control.mb_set_focus_mode, livePtr, mode)
  }

  /** Control.get_focus_mode */
  final def getFocusMode(): gdext.classes.Control.FocusMode = {
    if (gdext.classes.Control.mb_get_focus_mode == null) gdext.classes.Control.mb_get_focus_mode = MethodBind.get("Control", "get_focus_mode", 2132829277L)
    gdext.classes.Control.FocusMode(Ptrcall.call0[Long](gdext.classes.Control.mb_get_focus_mode, livePtr))
  }

  /** Control.get_focus_mode_with_override */
  final def getFocusModeWithOverride(): gdext.classes.Control.FocusMode = {
    if (gdext.classes.Control.mb_get_focus_mode_with_override == null) gdext.classes.Control.mb_get_focus_mode_with_override = MethodBind.get("Control", "get_focus_mode_with_override", 2132829277L)
    gdext.classes.Control.FocusMode(Ptrcall.call0[Long](gdext.classes.Control.mb_get_focus_mode_with_override, livePtr))
  }

  /** Control.set_focus_behavior_recursive */
  final def setFocusBehaviorRecursive(focusBehaviorRecursive: gdext.classes.Control.FocusBehaviorRecursive): Unit = {
    if (gdext.classes.Control.mb_set_focus_behavior_recursive == null) gdext.classes.Control.mb_set_focus_behavior_recursive = MethodBind.get("Control", "set_focus_behavior_recursive", 4256832521L)
    Ptrcall.callVoid1(gdext.classes.Control.mb_set_focus_behavior_recursive, livePtr, focusBehaviorRecursive)
  }

  /** Control.get_focus_behavior_recursive */
  final def getFocusBehaviorRecursive(): gdext.classes.Control.FocusBehaviorRecursive = {
    if (gdext.classes.Control.mb_get_focus_behavior_recursive == null) gdext.classes.Control.mb_get_focus_behavior_recursive = MethodBind.get("Control", "get_focus_behavior_recursive", 2435707181L)
    gdext.classes.Control.FocusBehaviorRecursive(Ptrcall.call0[Long](gdext.classes.Control.mb_get_focus_behavior_recursive, livePtr))
  }

  /** Control.has_focus */
  final def hasFocus(ignoreHiddenFocus: Boolean = false): Boolean = {
    if (gdext.classes.Control.mb_has_focus == null) gdext.classes.Control.mb_has_focus = MethodBind.get("Control", "has_focus", 3302206351L)
    Ptrcall.call1[Boolean, Boolean](gdext.classes.Control.mb_has_focus, livePtr, ignoreHiddenFocus)
  }

  /** Control.grab_focus */
  final def grabFocus(hideFocus: Boolean = false): Unit = {
    if (gdext.classes.Control.mb_grab_focus == null) gdext.classes.Control.mb_grab_focus = MethodBind.get("Control", "grab_focus", 107499316L)
    Ptrcall.callVoid1(gdext.classes.Control.mb_grab_focus, livePtr, hideFocus)
  }

  /** Control.release_focus */
  final def releaseFocus(): Unit = {
    if (gdext.classes.Control.mb_release_focus == null) gdext.classes.Control.mb_release_focus = MethodBind.get("Control", "release_focus", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Control.mb_release_focus, livePtr)
  }

  /** Control.find_prev_valid_focus */
  final def findPrevValidFocus(): Control = {
    if (gdext.classes.Control.mb_find_prev_valid_focus == null) gdext.classes.Control.mb_find_prev_valid_focus = MethodBind.get("Control", "find_prev_valid_focus", 2783021301L)
    Wrappers.borrowed[Control](Ptrcall.call0[Long](gdext.classes.Control.mb_find_prev_valid_focus, livePtr))
  }

  /** Control.find_next_valid_focus */
  final def findNextValidFocus(): Control = {
    if (gdext.classes.Control.mb_find_next_valid_focus == null) gdext.classes.Control.mb_find_next_valid_focus = MethodBind.get("Control", "find_next_valid_focus", 2783021301L)
    Wrappers.borrowed[Control](Ptrcall.call0[Long](gdext.classes.Control.mb_find_next_valid_focus, livePtr))
  }

  /** Control.find_valid_focus_neighbor */
  final def findValidFocusNeighbor(side: gdext.classes.Side): Control = {
    if (gdext.classes.Control.mb_find_valid_focus_neighbor == null) gdext.classes.Control.mb_find_valid_focus_neighbor = MethodBind.get("Control", "find_valid_focus_neighbor", 1543910170L)
    Wrappers.borrowed[Control](Ptrcall.call1[Long, Long](gdext.classes.Control.mb_find_valid_focus_neighbor, livePtr, side))
  }

  /** Control.set_h_size_flags */
  final def setHSizeFlags(flags: gdext.classes.Control.SizeFlags): Unit = {
    if (gdext.classes.Control.mb_set_h_size_flags == null) gdext.classes.Control.mb_set_h_size_flags = MethodBind.get("Control", "set_h_size_flags", 394851643L)
    Ptrcall.callVoid1(gdext.classes.Control.mb_set_h_size_flags, livePtr, flags.asInstanceOf[Long])
  }

  /** Control.get_h_size_flags */
  final def getHSizeFlags(): gdext.classes.Control.SizeFlags = {
    if (gdext.classes.Control.mb_get_h_size_flags == null) gdext.classes.Control.mb_get_h_size_flags = MethodBind.get("Control", "get_h_size_flags", 3781367401L)
    gdext.classes.Control.SizeFlags(Ptrcall.call0[Long](gdext.classes.Control.mb_get_h_size_flags, livePtr))
  }

  /** Control.set_stretch_ratio */
  final def setStretchRatio(ratio: Double): Unit = {
    if (gdext.classes.Control.mb_set_stretch_ratio == null) gdext.classes.Control.mb_set_stretch_ratio = MethodBind.get("Control", "set_stretch_ratio", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Control.mb_set_stretch_ratio, livePtr, ratio)
  }

  /** Control.get_stretch_ratio */
  final def getStretchRatio(): Double = {
    if (gdext.classes.Control.mb_get_stretch_ratio == null) gdext.classes.Control.mb_get_stretch_ratio = MethodBind.get("Control", "get_stretch_ratio", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Control.mb_get_stretch_ratio, livePtr)
  }

  /** Control.set_v_size_flags */
  final def setVSizeFlags(flags: gdext.classes.Control.SizeFlags): Unit = {
    if (gdext.classes.Control.mb_set_v_size_flags == null) gdext.classes.Control.mb_set_v_size_flags = MethodBind.get("Control", "set_v_size_flags", 394851643L)
    Ptrcall.callVoid1(gdext.classes.Control.mb_set_v_size_flags, livePtr, flags.asInstanceOf[Long])
  }

  /** Control.get_v_size_flags */
  final def getVSizeFlags(): gdext.classes.Control.SizeFlags = {
    if (gdext.classes.Control.mb_get_v_size_flags == null) gdext.classes.Control.mb_get_v_size_flags = MethodBind.get("Control", "get_v_size_flags", 3781367401L)
    gdext.classes.Control.SizeFlags(Ptrcall.call0[Long](gdext.classes.Control.mb_get_v_size_flags, livePtr))
  }

  /** Control.set_theme */
  final def setTheme(theme: Theme): Unit = {
    if (gdext.classes.Control.mb_set_theme == null) gdext.classes.Control.mb_set_theme = MethodBind.get("Control", "set_theme", 2326690814L)
    Ptrcall.callVoid1(gdext.classes.Control.mb_set_theme, livePtr, Wrappers.handle(theme))
  }

  /** Control.get_theme. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getTheme(): Theme = {
    if (gdext.classes.Control.mb_get_theme == null) gdext.classes.Control.mb_get_theme = MethodBind.get("Control", "get_theme", 3846893731L)
    Wrappers.owned[Theme](Ptrcall.call0[Long](gdext.classes.Control.mb_get_theme, livePtr))
  }

  /** Control.set_theme_type_variation */
  final def setThemeTypeVariation(themeType: String): Unit = {
    if (gdext.classes.Control.mb_set_theme_type_variation == null) gdext.classes.Control.mb_set_theme_type_variation = MethodBind.get("Control", "set_theme_type_variation", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.Control.mb_set_theme_type_variation, livePtr, SnArg(themeType))
  }

  /** Control.get_theme_type_variation */
  final def getThemeTypeVariation(): String = {
    if (gdext.classes.Control.mb_get_theme_type_variation == null) gdext.classes.Control.mb_get_theme_type_variation = MethodBind.get("Control", "get_theme_type_variation", 2002593661L)
    Ptrcall.call0[SnArg](gdext.classes.Control.mb_get_theme_type_variation, livePtr)
  }

  /** Control.begin_bulk_theme_override */
  final def beginBulkThemeOverride(): Unit = {
    if (gdext.classes.Control.mb_begin_bulk_theme_override == null) gdext.classes.Control.mb_begin_bulk_theme_override = MethodBind.get("Control", "begin_bulk_theme_override", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Control.mb_begin_bulk_theme_override, livePtr)
  }

  /** Control.end_bulk_theme_override */
  final def endBulkThemeOverride(): Unit = {
    if (gdext.classes.Control.mb_end_bulk_theme_override == null) gdext.classes.Control.mb_end_bulk_theme_override = MethodBind.get("Control", "end_bulk_theme_override", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Control.mb_end_bulk_theme_override, livePtr)
  }

  /** Control.add_theme_icon_override */
  final def addThemeIconOverride(name: String, texture: Texture2D): Unit = {
    if (gdext.classes.Control.mb_add_theme_icon_override == null) gdext.classes.Control.mb_add_theme_icon_override = MethodBind.get("Control", "add_theme_icon_override", 1373065600L)
    Ptrcall.callVoid2(gdext.classes.Control.mb_add_theme_icon_override, livePtr, SnArg(name), Wrappers.handle(texture))
  }

  /** Control.add_theme_stylebox_override */
  final def addThemeStyleboxOverride(name: String, stylebox: StyleBox): Unit = {
    if (gdext.classes.Control.mb_add_theme_stylebox_override == null) gdext.classes.Control.mb_add_theme_stylebox_override = MethodBind.get("Control", "add_theme_stylebox_override", 4188838905L)
    Ptrcall.callVoid2(gdext.classes.Control.mb_add_theme_stylebox_override, livePtr, SnArg(name), Wrappers.handle(stylebox))
  }

  /** Control.add_theme_font_override */
  final def addThemeFontOverride(name: String, font: Font): Unit = {
    if (gdext.classes.Control.mb_add_theme_font_override == null) gdext.classes.Control.mb_add_theme_font_override = MethodBind.get("Control", "add_theme_font_override", 3518018674L)
    Ptrcall.callVoid2(gdext.classes.Control.mb_add_theme_font_override, livePtr, SnArg(name), Wrappers.handle(font))
  }

  /** Control.add_theme_font_size_override */
  final def addThemeFontSizeOverride(name: String, fontSize: Long): Unit = {
    if (gdext.classes.Control.mb_add_theme_font_size_override == null) gdext.classes.Control.mb_add_theme_font_size_override = MethodBind.get("Control", "add_theme_font_size_override", 2415702435L)
    Ptrcall.callVoid2(gdext.classes.Control.mb_add_theme_font_size_override, livePtr, SnArg(name), fontSize)
  }

  /** Control.add_theme_color_override */
  final def addThemeColorOverride(name: String, color: gdext.builtin.Color): Unit = {
    if (gdext.classes.Control.mb_add_theme_color_override == null) gdext.classes.Control.mb_add_theme_color_override = MethodBind.get("Control", "add_theme_color_override", 4260178595L)
    Ptrcall.callVoid2(gdext.classes.Control.mb_add_theme_color_override, livePtr, SnArg(name), color)
  }

  /** Control.add_theme_constant_override */
  final def addThemeConstantOverride(name: String, constant: Long): Unit = {
    if (gdext.classes.Control.mb_add_theme_constant_override == null) gdext.classes.Control.mb_add_theme_constant_override = MethodBind.get("Control", "add_theme_constant_override", 2415702435L)
    Ptrcall.callVoid2(gdext.classes.Control.mb_add_theme_constant_override, livePtr, SnArg(name), constant)
  }

  /** Control.remove_theme_icon_override */
  final def removeThemeIconOverride(name: String): Unit = {
    if (gdext.classes.Control.mb_remove_theme_icon_override == null) gdext.classes.Control.mb_remove_theme_icon_override = MethodBind.get("Control", "remove_theme_icon_override", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.Control.mb_remove_theme_icon_override, livePtr, SnArg(name))
  }

  /** Control.remove_theme_stylebox_override */
  final def removeThemeStyleboxOverride(name: String): Unit = {
    if (gdext.classes.Control.mb_remove_theme_stylebox_override == null) gdext.classes.Control.mb_remove_theme_stylebox_override = MethodBind.get("Control", "remove_theme_stylebox_override", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.Control.mb_remove_theme_stylebox_override, livePtr, SnArg(name))
  }

  /** Control.remove_theme_font_override */
  final def removeThemeFontOverride(name: String): Unit = {
    if (gdext.classes.Control.mb_remove_theme_font_override == null) gdext.classes.Control.mb_remove_theme_font_override = MethodBind.get("Control", "remove_theme_font_override", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.Control.mb_remove_theme_font_override, livePtr, SnArg(name))
  }

  /** Control.remove_theme_font_size_override */
  final def removeThemeFontSizeOverride(name: String): Unit = {
    if (gdext.classes.Control.mb_remove_theme_font_size_override == null) gdext.classes.Control.mb_remove_theme_font_size_override = MethodBind.get("Control", "remove_theme_font_size_override", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.Control.mb_remove_theme_font_size_override, livePtr, SnArg(name))
  }

  /** Control.remove_theme_color_override */
  final def removeThemeColorOverride(name: String): Unit = {
    if (gdext.classes.Control.mb_remove_theme_color_override == null) gdext.classes.Control.mb_remove_theme_color_override = MethodBind.get("Control", "remove_theme_color_override", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.Control.mb_remove_theme_color_override, livePtr, SnArg(name))
  }

  /** Control.remove_theme_constant_override */
  final def removeThemeConstantOverride(name: String): Unit = {
    if (gdext.classes.Control.mb_remove_theme_constant_override == null) gdext.classes.Control.mb_remove_theme_constant_override = MethodBind.get("Control", "remove_theme_constant_override", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.Control.mb_remove_theme_constant_override, livePtr, SnArg(name))
  }

  /** Control.get_theme_icon. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getThemeIcon(name: String, themeType: String = ""): Texture2D = {
    if (gdext.classes.Control.mb_get_theme_icon == null) gdext.classes.Control.mb_get_theme_icon = MethodBind.get("Control", "get_theme_icon", 3163973443L)
    Wrappers.owned[Texture2D](Ptrcall.call2[SnArg, SnArg, Long](gdext.classes.Control.mb_get_theme_icon, livePtr, SnArg(name), SnArg(themeType)))
  }

  /** Control.get_theme_stylebox. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getThemeStylebox(name: String, themeType: String = ""): StyleBox = {
    if (gdext.classes.Control.mb_get_theme_stylebox == null) gdext.classes.Control.mb_get_theme_stylebox = MethodBind.get("Control", "get_theme_stylebox", 604739069L)
    Wrappers.owned[StyleBox](Ptrcall.call2[SnArg, SnArg, Long](gdext.classes.Control.mb_get_theme_stylebox, livePtr, SnArg(name), SnArg(themeType)))
  }

  /** Control.get_theme_font. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getThemeFont(name: String, themeType: String = ""): Font = {
    if (gdext.classes.Control.mb_get_theme_font == null) gdext.classes.Control.mb_get_theme_font = MethodBind.get("Control", "get_theme_font", 2826986490L)
    Wrappers.owned[Font](Ptrcall.call2[SnArg, SnArg, Long](gdext.classes.Control.mb_get_theme_font, livePtr, SnArg(name), SnArg(themeType)))
  }

  /** Control.get_theme_font_size */
  final def getThemeFontSize(name: String, themeType: String = ""): Long = {
    if (gdext.classes.Control.mb_get_theme_font_size == null) gdext.classes.Control.mb_get_theme_font_size = MethodBind.get("Control", "get_theme_font_size", 1327056374L)
    Ptrcall.call2[SnArg, SnArg, Long](gdext.classes.Control.mb_get_theme_font_size, livePtr, SnArg(name), SnArg(themeType))
  }

  /** Control.get_theme_color */
  final def getThemeColor(name: String, themeType: String = ""): gdext.builtin.Color = {
    if (gdext.classes.Control.mb_get_theme_color == null) gdext.classes.Control.mb_get_theme_color = MethodBind.get("Control", "get_theme_color", 2798751242L)
    Ptrcall.call2[SnArg, SnArg, gdext.builtin.Color](gdext.classes.Control.mb_get_theme_color, livePtr, SnArg(name), SnArg(themeType))
  }

  /** Control.get_theme_constant */
  final def getThemeConstant(name: String, themeType: String = ""): Long = {
    if (gdext.classes.Control.mb_get_theme_constant == null) gdext.classes.Control.mb_get_theme_constant = MethodBind.get("Control", "get_theme_constant", 1327056374L)
    Ptrcall.call2[SnArg, SnArg, Long](gdext.classes.Control.mb_get_theme_constant, livePtr, SnArg(name), SnArg(themeType))
  }

  /** Control.has_theme_icon_override */
  final def hasThemeIconOverride(name: String): Boolean = {
    if (gdext.classes.Control.mb_has_theme_icon_override == null) gdext.classes.Control.mb_has_theme_icon_override = MethodBind.get("Control", "has_theme_icon_override", 2619796661L)
    Ptrcall.call1[SnArg, Boolean](gdext.classes.Control.mb_has_theme_icon_override, livePtr, SnArg(name))
  }

  /** Control.has_theme_stylebox_override */
  final def hasThemeStyleboxOverride(name: String): Boolean = {
    if (gdext.classes.Control.mb_has_theme_stylebox_override == null) gdext.classes.Control.mb_has_theme_stylebox_override = MethodBind.get("Control", "has_theme_stylebox_override", 2619796661L)
    Ptrcall.call1[SnArg, Boolean](gdext.classes.Control.mb_has_theme_stylebox_override, livePtr, SnArg(name))
  }

  /** Control.has_theme_font_override */
  final def hasThemeFontOverride(name: String): Boolean = {
    if (gdext.classes.Control.mb_has_theme_font_override == null) gdext.classes.Control.mb_has_theme_font_override = MethodBind.get("Control", "has_theme_font_override", 2619796661L)
    Ptrcall.call1[SnArg, Boolean](gdext.classes.Control.mb_has_theme_font_override, livePtr, SnArg(name))
  }

  /** Control.has_theme_font_size_override */
  final def hasThemeFontSizeOverride(name: String): Boolean = {
    if (gdext.classes.Control.mb_has_theme_font_size_override == null) gdext.classes.Control.mb_has_theme_font_size_override = MethodBind.get("Control", "has_theme_font_size_override", 2619796661L)
    Ptrcall.call1[SnArg, Boolean](gdext.classes.Control.mb_has_theme_font_size_override, livePtr, SnArg(name))
  }

  /** Control.has_theme_color_override */
  final def hasThemeColorOverride(name: String): Boolean = {
    if (gdext.classes.Control.mb_has_theme_color_override == null) gdext.classes.Control.mb_has_theme_color_override = MethodBind.get("Control", "has_theme_color_override", 2619796661L)
    Ptrcall.call1[SnArg, Boolean](gdext.classes.Control.mb_has_theme_color_override, livePtr, SnArg(name))
  }

  /** Control.has_theme_constant_override */
  final def hasThemeConstantOverride(name: String): Boolean = {
    if (gdext.classes.Control.mb_has_theme_constant_override == null) gdext.classes.Control.mb_has_theme_constant_override = MethodBind.get("Control", "has_theme_constant_override", 2619796661L)
    Ptrcall.call1[SnArg, Boolean](gdext.classes.Control.mb_has_theme_constant_override, livePtr, SnArg(name))
  }

  /** Control.has_theme_icon */
  final def hasThemeIcon(name: String, themeType: String = ""): Boolean = {
    if (gdext.classes.Control.mb_has_theme_icon == null) gdext.classes.Control.mb_has_theme_icon = MethodBind.get("Control", "has_theme_icon", 866386512L)
    Ptrcall.call2[SnArg, SnArg, Boolean](gdext.classes.Control.mb_has_theme_icon, livePtr, SnArg(name), SnArg(themeType))
  }

  /** Control.has_theme_stylebox */
  final def hasThemeStylebox(name: String, themeType: String = ""): Boolean = {
    if (gdext.classes.Control.mb_has_theme_stylebox == null) gdext.classes.Control.mb_has_theme_stylebox = MethodBind.get("Control", "has_theme_stylebox", 866386512L)
    Ptrcall.call2[SnArg, SnArg, Boolean](gdext.classes.Control.mb_has_theme_stylebox, livePtr, SnArg(name), SnArg(themeType))
  }

  /** Control.has_theme_font */
  final def hasThemeFont(name: String, themeType: String = ""): Boolean = {
    if (gdext.classes.Control.mb_has_theme_font == null) gdext.classes.Control.mb_has_theme_font = MethodBind.get("Control", "has_theme_font", 866386512L)
    Ptrcall.call2[SnArg, SnArg, Boolean](gdext.classes.Control.mb_has_theme_font, livePtr, SnArg(name), SnArg(themeType))
  }

  /** Control.has_theme_font_size */
  final def hasThemeFontSize(name: String, themeType: String = ""): Boolean = {
    if (gdext.classes.Control.mb_has_theme_font_size == null) gdext.classes.Control.mb_has_theme_font_size = MethodBind.get("Control", "has_theme_font_size", 866386512L)
    Ptrcall.call2[SnArg, SnArg, Boolean](gdext.classes.Control.mb_has_theme_font_size, livePtr, SnArg(name), SnArg(themeType))
  }

  /** Control.has_theme_color */
  final def hasThemeColor(name: String, themeType: String = ""): Boolean = {
    if (gdext.classes.Control.mb_has_theme_color == null) gdext.classes.Control.mb_has_theme_color = MethodBind.get("Control", "has_theme_color", 866386512L)
    Ptrcall.call2[SnArg, SnArg, Boolean](gdext.classes.Control.mb_has_theme_color, livePtr, SnArg(name), SnArg(themeType))
  }

  /** Control.has_theme_constant */
  final def hasThemeConstant(name: String, themeType: String = ""): Boolean = {
    if (gdext.classes.Control.mb_has_theme_constant == null) gdext.classes.Control.mb_has_theme_constant = MethodBind.get("Control", "has_theme_constant", 866386512L)
    Ptrcall.call2[SnArg, SnArg, Boolean](gdext.classes.Control.mb_has_theme_constant, livePtr, SnArg(name), SnArg(themeType))
  }

  /** Control.get_theme_default_base_scale */
  final def getThemeDefaultBaseScale(): Double = {
    if (gdext.classes.Control.mb_get_theme_default_base_scale == null) gdext.classes.Control.mb_get_theme_default_base_scale = MethodBind.get("Control", "get_theme_default_base_scale", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Control.mb_get_theme_default_base_scale, livePtr)
  }

  /** Control.get_theme_default_font. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getThemeDefaultFont(): Font = {
    if (gdext.classes.Control.mb_get_theme_default_font == null) gdext.classes.Control.mb_get_theme_default_font = MethodBind.get("Control", "get_theme_default_font", 3229501585L)
    Wrappers.owned[Font](Ptrcall.call0[Long](gdext.classes.Control.mb_get_theme_default_font, livePtr))
  }

  /** Control.get_theme_default_font_size */
  final def getThemeDefaultFontSize(): Long = {
    if (gdext.classes.Control.mb_get_theme_default_font_size == null) gdext.classes.Control.mb_get_theme_default_font_size = MethodBind.get("Control", "get_theme_default_font_size", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Control.mb_get_theme_default_font_size, livePtr)
  }

  /** Control.get_parent_control */
  final def getParentControl(): Control = {
    if (gdext.classes.Control.mb_get_parent_control == null) gdext.classes.Control.mb_get_parent_control = MethodBind.get("Control", "get_parent_control", 2783021301L)
    Wrappers.borrowed[Control](Ptrcall.call0[Long](gdext.classes.Control.mb_get_parent_control, livePtr))
  }

  /** Control.set_h_grow_direction */
  final def setHGrowDirection(direction: gdext.classes.Control.GrowDirection): Unit = {
    if (gdext.classes.Control.mb_set_h_grow_direction == null) gdext.classes.Control.mb_set_h_grow_direction = MethodBind.get("Control", "set_h_grow_direction", 2022385301L)
    Ptrcall.callVoid1(gdext.classes.Control.mb_set_h_grow_direction, livePtr, direction)
  }

  /** Control.get_h_grow_direction */
  final def getHGrowDirection(): gdext.classes.Control.GrowDirection = {
    if (gdext.classes.Control.mb_get_h_grow_direction == null) gdext.classes.Control.mb_get_h_grow_direction = MethodBind.get("Control", "get_h_grow_direction", 3635610155L)
    gdext.classes.Control.GrowDirection(Ptrcall.call0[Long](gdext.classes.Control.mb_get_h_grow_direction, livePtr))
  }

  /** Control.set_v_grow_direction */
  final def setVGrowDirection(direction: gdext.classes.Control.GrowDirection): Unit = {
    if (gdext.classes.Control.mb_set_v_grow_direction == null) gdext.classes.Control.mb_set_v_grow_direction = MethodBind.get("Control", "set_v_grow_direction", 2022385301L)
    Ptrcall.callVoid1(gdext.classes.Control.mb_set_v_grow_direction, livePtr, direction)
  }

  /** Control.get_v_grow_direction */
  final def getVGrowDirection(): gdext.classes.Control.GrowDirection = {
    if (gdext.classes.Control.mb_get_v_grow_direction == null) gdext.classes.Control.mb_get_v_grow_direction = MethodBind.get("Control", "get_v_grow_direction", 3635610155L)
    gdext.classes.Control.GrowDirection(Ptrcall.call0[Long](gdext.classes.Control.mb_get_v_grow_direction, livePtr))
  }

  /** Control.set_tooltip_auto_translate_mode */
  final def setTooltipAutoTranslateMode(mode: gdext.classes.Node.AutoTranslateMode): Unit = {
    if (gdext.classes.Control.mb_set_tooltip_auto_translate_mode == null) gdext.classes.Control.mb_set_tooltip_auto_translate_mode = MethodBind.get("Control", "set_tooltip_auto_translate_mode", 776149714L)
    Ptrcall.callVoid1(gdext.classes.Control.mb_set_tooltip_auto_translate_mode, livePtr, mode)
  }

  /** Control.get_tooltip_auto_translate_mode */
  final def getTooltipAutoTranslateMode(): gdext.classes.Node.AutoTranslateMode = {
    if (gdext.classes.Control.mb_get_tooltip_auto_translate_mode == null) gdext.classes.Control.mb_get_tooltip_auto_translate_mode = MethodBind.get("Control", "get_tooltip_auto_translate_mode", 2498906432L)
    gdext.classes.Node.AutoTranslateMode(Ptrcall.call0[Long](gdext.classes.Control.mb_get_tooltip_auto_translate_mode, livePtr))
  }

  /** Control.set_tooltip_text */
  final def setTooltipText(hint: String): Unit = {
    if (gdext.classes.Control.mb_set_tooltip_text == null) gdext.classes.Control.mb_set_tooltip_text = MethodBind.get("Control", "set_tooltip_text", 83702148L)
    Ptrcall.callVoid1(gdext.classes.Control.mb_set_tooltip_text, livePtr, hint)
  }

  /** Control.get_tooltip_text */
  final def getTooltipText(): String = {
    if (gdext.classes.Control.mb_get_tooltip_text == null) gdext.classes.Control.mb_get_tooltip_text = MethodBind.get("Control", "get_tooltip_text", 201670096L)
    Ptrcall.call0[String](gdext.classes.Control.mb_get_tooltip_text, livePtr)
  }

  /** Control.get_tooltip */
  final def getTooltip(atPosition: gdext.builtin.Vector2 = gdext.builtin.Vector2(0f, 0f)): String = {
    if (gdext.classes.Control.mb_get_tooltip == null) gdext.classes.Control.mb_get_tooltip = MethodBind.get("Control", "get_tooltip", 2895288280L)
    Ptrcall.call1[gdext.builtin.Vector2, String](gdext.classes.Control.mb_get_tooltip, livePtr, atPosition)
  }

  /** Control.set_default_cursor_shape */
  final def setDefaultCursorShape(shape: gdext.classes.Control.CursorShape): Unit = {
    if (gdext.classes.Control.mb_set_default_cursor_shape == null) gdext.classes.Control.mb_set_default_cursor_shape = MethodBind.get("Control", "set_default_cursor_shape", 217062046L)
    Ptrcall.callVoid1(gdext.classes.Control.mb_set_default_cursor_shape, livePtr, shape)
  }

  /** Control.get_default_cursor_shape */
  final def getDefaultCursorShape(): gdext.classes.Control.CursorShape = {
    if (gdext.classes.Control.mb_get_default_cursor_shape == null) gdext.classes.Control.mb_get_default_cursor_shape = MethodBind.get("Control", "get_default_cursor_shape", 2359535750L)
    gdext.classes.Control.CursorShape(Ptrcall.call0[Long](gdext.classes.Control.mb_get_default_cursor_shape, livePtr))
  }

  /** Control.get_cursor_shape */
  final def getCursorShape(position: gdext.builtin.Vector2 = gdext.builtin.Vector2(0f, 0f)): gdext.classes.Control.CursorShape = {
    if (gdext.classes.Control.mb_get_cursor_shape == null) gdext.classes.Control.mb_get_cursor_shape = MethodBind.get("Control", "get_cursor_shape", 1395773853L)
    gdext.classes.Control.CursorShape(Ptrcall.call1[gdext.builtin.Vector2, Long](gdext.classes.Control.mb_get_cursor_shape, livePtr, position))
  }

  /** Control.accessibility_drag */
  final def accessibilityDrag(): Unit = {
    if (gdext.classes.Control.mb_accessibility_drag == null) gdext.classes.Control.mb_accessibility_drag = MethodBind.get("Control", "accessibility_drag", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Control.mb_accessibility_drag, livePtr)
  }

  /** Control.accessibility_drop */
  final def accessibilityDrop(): Unit = {
    if (gdext.classes.Control.mb_accessibility_drop == null) gdext.classes.Control.mb_accessibility_drop = MethodBind.get("Control", "accessibility_drop", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Control.mb_accessibility_drop, livePtr)
  }

  /** Control.set_accessibility_name */
  final def setAccessibilityName(name: String): Unit = {
    if (gdext.classes.Control.mb_set_accessibility_name == null) gdext.classes.Control.mb_set_accessibility_name = MethodBind.get("Control", "set_accessibility_name", 83702148L)
    Ptrcall.callVoid1(gdext.classes.Control.mb_set_accessibility_name, livePtr, name)
  }

  /** Control.get_accessibility_name */
  final def getAccessibilityName(): String = {
    if (gdext.classes.Control.mb_get_accessibility_name == null) gdext.classes.Control.mb_get_accessibility_name = MethodBind.get("Control", "get_accessibility_name", 201670096L)
    Ptrcall.call0[String](gdext.classes.Control.mb_get_accessibility_name, livePtr)
  }

  /** Control.set_accessibility_description */
  final def setAccessibilityDescription(description: String): Unit = {
    if (gdext.classes.Control.mb_set_accessibility_description == null) gdext.classes.Control.mb_set_accessibility_description = MethodBind.get("Control", "set_accessibility_description", 83702148L)
    Ptrcall.callVoid1(gdext.classes.Control.mb_set_accessibility_description, livePtr, description)
  }

  /** Control.get_accessibility_description */
  final def getAccessibilityDescription(): String = {
    if (gdext.classes.Control.mb_get_accessibility_description == null) gdext.classes.Control.mb_get_accessibility_description = MethodBind.get("Control", "get_accessibility_description", 201670096L)
    Ptrcall.call0[String](gdext.classes.Control.mb_get_accessibility_description, livePtr)
  }

  /** Control.set_accessibility_live */
  final def setAccessibilityLive(mode: gdext.classes.DisplayServer.AccessibilityLiveMode): Unit = {
    if (gdext.classes.Control.mb_set_accessibility_live == null) gdext.classes.Control.mb_set_accessibility_live = MethodBind.get("Control", "set_accessibility_live", 1720261470L)
    Ptrcall.callVoid1(gdext.classes.Control.mb_set_accessibility_live, livePtr, mode)
  }

  /** Control.get_accessibility_live */
  final def getAccessibilityLive(): gdext.classes.DisplayServer.AccessibilityLiveMode = {
    if (gdext.classes.Control.mb_get_accessibility_live == null) gdext.classes.Control.mb_get_accessibility_live = MethodBind.get("Control", "get_accessibility_live", 3311037003L)
    gdext.classes.DisplayServer.AccessibilityLiveMode(Ptrcall.call0[Long](gdext.classes.Control.mb_get_accessibility_live, livePtr))
  }

  /** Control.set_mouse_filter */
  final def setMouseFilter(filter: gdext.classes.Control.MouseFilter): Unit = {
    if (gdext.classes.Control.mb_set_mouse_filter == null) gdext.classes.Control.mb_set_mouse_filter = MethodBind.get("Control", "set_mouse_filter", 3891156122L)
    Ptrcall.callVoid1(gdext.classes.Control.mb_set_mouse_filter, livePtr, filter)
  }

  /** Control.get_mouse_filter */
  final def getMouseFilter(): gdext.classes.Control.MouseFilter = {
    if (gdext.classes.Control.mb_get_mouse_filter == null) gdext.classes.Control.mb_get_mouse_filter = MethodBind.get("Control", "get_mouse_filter", 1572545674L)
    gdext.classes.Control.MouseFilter(Ptrcall.call0[Long](gdext.classes.Control.mb_get_mouse_filter, livePtr))
  }

  /** Control.get_mouse_filter_with_override */
  final def getMouseFilterWithOverride(): gdext.classes.Control.MouseFilter = {
    if (gdext.classes.Control.mb_get_mouse_filter_with_override == null) gdext.classes.Control.mb_get_mouse_filter_with_override = MethodBind.get("Control", "get_mouse_filter_with_override", 1572545674L)
    gdext.classes.Control.MouseFilter(Ptrcall.call0[Long](gdext.classes.Control.mb_get_mouse_filter_with_override, livePtr))
  }

  /** Control.set_mouse_behavior_recursive */
  final def setMouseBehaviorRecursive(mouseBehaviorRecursive: gdext.classes.Control.MouseBehaviorRecursive): Unit = {
    if (gdext.classes.Control.mb_set_mouse_behavior_recursive == null) gdext.classes.Control.mb_set_mouse_behavior_recursive = MethodBind.get("Control", "set_mouse_behavior_recursive", 849284636L)
    Ptrcall.callVoid1(gdext.classes.Control.mb_set_mouse_behavior_recursive, livePtr, mouseBehaviorRecursive)
  }

  /** Control.get_mouse_behavior_recursive */
  final def getMouseBehaviorRecursive(): gdext.classes.Control.MouseBehaviorRecursive = {
    if (gdext.classes.Control.mb_get_mouse_behavior_recursive == null) gdext.classes.Control.mb_get_mouse_behavior_recursive = MethodBind.get("Control", "get_mouse_behavior_recursive", 3779367402L)
    gdext.classes.Control.MouseBehaviorRecursive(Ptrcall.call0[Long](gdext.classes.Control.mb_get_mouse_behavior_recursive, livePtr))
  }

  /** Control.set_force_pass_scroll_events */
  final def setForcePassScrollEvents(forcePassScrollEvents: Boolean): Unit = {
    if (gdext.classes.Control.mb_set_force_pass_scroll_events == null) gdext.classes.Control.mb_set_force_pass_scroll_events = MethodBind.get("Control", "set_force_pass_scroll_events", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Control.mb_set_force_pass_scroll_events, livePtr, forcePassScrollEvents)
  }

  /** Control.is_force_pass_scroll_events */
  final def isForcePassScrollEvents(): Boolean = {
    if (gdext.classes.Control.mb_is_force_pass_scroll_events == null) gdext.classes.Control.mb_is_force_pass_scroll_events = MethodBind.get("Control", "is_force_pass_scroll_events", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Control.mb_is_force_pass_scroll_events, livePtr)
  }

  /** Control.set_clip_contents */
  final def setClipContents(enable: Boolean): Unit = {
    if (gdext.classes.Control.mb_set_clip_contents == null) gdext.classes.Control.mb_set_clip_contents = MethodBind.get("Control", "set_clip_contents", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Control.mb_set_clip_contents, livePtr, enable)
  }

  /** Control.is_clipping_contents */
  final def isClippingContents(): Boolean = {
    if (gdext.classes.Control.mb_is_clipping_contents == null) gdext.classes.Control.mb_is_clipping_contents = MethodBind.get("Control", "is_clipping_contents", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.Control.mb_is_clipping_contents, livePtr)
  }

  /** Control.grab_click_focus */
  final def grabClickFocus(): Unit = {
    if (gdext.classes.Control.mb_grab_click_focus == null) gdext.classes.Control.mb_grab_click_focus = MethodBind.get("Control", "grab_click_focus", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Control.mb_grab_click_focus, livePtr)
  }

  /** Control.set_drag_preview */
  final def setDragPreview(control: Control): Unit = {
    if (gdext.classes.Control.mb_set_drag_preview == null) gdext.classes.Control.mb_set_drag_preview = MethodBind.get("Control", "set_drag_preview", 1496901182L)
    Ptrcall.callVoid1(gdext.classes.Control.mb_set_drag_preview, livePtr, Wrappers.handle(control))
  }

  /** Control.is_drag_successful */
  final def isDragSuccessful(): Boolean = {
    if (gdext.classes.Control.mb_is_drag_successful == null) gdext.classes.Control.mb_is_drag_successful = MethodBind.get("Control", "is_drag_successful", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Control.mb_is_drag_successful, livePtr)
  }

  /** Control.warp_mouse */
  final def warpMouse(position: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.Control.mb_warp_mouse == null) gdext.classes.Control.mb_warp_mouse = MethodBind.get("Control", "warp_mouse", 743155724L)
    Ptrcall.callVoid1(gdext.classes.Control.mb_warp_mouse, livePtr, position)
  }

  /** Control.set_shortcut_context */
  final def setShortcutContext(node: Node): Unit = {
    if (gdext.classes.Control.mb_set_shortcut_context == null) gdext.classes.Control.mb_set_shortcut_context = MethodBind.get("Control", "set_shortcut_context", 1078189570L)
    Ptrcall.callVoid1(gdext.classes.Control.mb_set_shortcut_context, livePtr, Wrappers.handle(node))
  }

  /** Control.get_shortcut_context */
  final def getShortcutContext(): Node = {
    if (gdext.classes.Control.mb_get_shortcut_context == null) gdext.classes.Control.mb_get_shortcut_context = MethodBind.get("Control", "get_shortcut_context", 3160264692L)
    Wrappers.borrowed[Node](Ptrcall.call0[Long](gdext.classes.Control.mb_get_shortcut_context, livePtr))
  }

  /** Control.update_minimum_size */
  final def updateMinimumSize(): Unit = {
    if (gdext.classes.Control.mb_update_minimum_size == null) gdext.classes.Control.mb_update_minimum_size = MethodBind.get("Control", "update_minimum_size", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Control.mb_update_minimum_size, livePtr)
  }

  /** Control.set_layout_direction */
  final def setLayoutDirection(direction: gdext.classes.Control.LayoutDirection): Unit = {
    if (gdext.classes.Control.mb_set_layout_direction == null) gdext.classes.Control.mb_set_layout_direction = MethodBind.get("Control", "set_layout_direction", 3310692370L)
    Ptrcall.callVoid1(gdext.classes.Control.mb_set_layout_direction, livePtr, direction)
  }

  /** Control.get_layout_direction */
  final def getLayoutDirection(): gdext.classes.Control.LayoutDirection = {
    if (gdext.classes.Control.mb_get_layout_direction == null) gdext.classes.Control.mb_get_layout_direction = MethodBind.get("Control", "get_layout_direction", 1546772008L)
    gdext.classes.Control.LayoutDirection(Ptrcall.call0[Long](gdext.classes.Control.mb_get_layout_direction, livePtr))
  }

  /** Control.is_layout_rtl */
  final def isLayoutRtl(): Boolean = {
    if (gdext.classes.Control.mb_is_layout_rtl == null) gdext.classes.Control.mb_is_layout_rtl = MethodBind.get("Control", "is_layout_rtl", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Control.mb_is_layout_rtl, livePtr)
  }

  /** Control.set_auto_translate */
  final def setAutoTranslate(enable: Boolean): Unit = {
    if (gdext.classes.Control.mb_set_auto_translate == null) gdext.classes.Control.mb_set_auto_translate = MethodBind.get("Control", "set_auto_translate", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Control.mb_set_auto_translate, livePtr, enable)
  }

  /** Control.is_auto_translating */
  final def isAutoTranslating(): Boolean = {
    if (gdext.classes.Control.mb_is_auto_translating == null) gdext.classes.Control.mb_is_auto_translating = MethodBind.get("Control", "is_auto_translating", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Control.mb_is_auto_translating, livePtr)
  }

  /** Control.set_localize_numeral_system */
  final def setLocalizeNumeralSystem(enable: Boolean): Unit = {
    if (gdext.classes.Control.mb_set_localize_numeral_system == null) gdext.classes.Control.mb_set_localize_numeral_system = MethodBind.get("Control", "set_localize_numeral_system", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Control.mb_set_localize_numeral_system, livePtr, enable)
  }

  /** Control.is_localizing_numeral_system */
  final def isLocalizingNumeralSystem(): Boolean = {
    if (gdext.classes.Control.mb_is_localizing_numeral_system == null) gdext.classes.Control.mb_is_localizing_numeral_system = MethodBind.get("Control", "is_localizing_numeral_system", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Control.mb_is_localizing_numeral_system, livePtr)
  }

}

object Control {
  private[classes] var mb_accept_event: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_minimum_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_combined_minimum_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_anchors_preset: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_offsets_preset: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_anchors_and_offsets_preset: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_anchor: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_anchor: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_anchor_and_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_begin: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_end: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_reset_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_custom_minimum_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_global_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_rotation: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_rotation_degrees: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_pivot_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_pivot_offset_ratio: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_begin: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_end: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_rotation: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_rotation_degrees: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_pivot_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_pivot_offset_ratio: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_combined_pivot_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_custom_minimum_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_parent_area_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_global_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_screen_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_rect: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_global_rect: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_focus_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_focus_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_focus_mode_with_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_focus_behavior_recursive: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_focus_behavior_recursive: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_focus: GDExtensionMethodBindPtr = null
  private[classes] var mb_grab_focus: GDExtensionMethodBindPtr = null
  private[classes] var mb_release_focus: GDExtensionMethodBindPtr = null
  private[classes] var mb_find_prev_valid_focus: GDExtensionMethodBindPtr = null
  private[classes] var mb_find_next_valid_focus: GDExtensionMethodBindPtr = null
  private[classes] var mb_find_valid_focus_neighbor: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_h_size_flags: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_h_size_flags: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_stretch_ratio: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_stretch_ratio: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_v_size_flags: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_v_size_flags: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_theme: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_theme: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_theme_type_variation: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_theme_type_variation: GDExtensionMethodBindPtr = null
  private[classes] var mb_begin_bulk_theme_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_end_bulk_theme_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_theme_icon_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_theme_stylebox_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_theme_font_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_theme_font_size_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_theme_color_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_theme_constant_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_theme_icon_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_theme_stylebox_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_theme_font_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_theme_font_size_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_theme_color_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_theme_constant_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_theme_icon: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_theme_stylebox: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_theme_font: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_theme_font_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_theme_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_theme_constant: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_theme_icon_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_theme_stylebox_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_theme_font_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_theme_font_size_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_theme_color_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_theme_constant_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_theme_icon: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_theme_stylebox: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_theme_font: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_theme_font_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_theme_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_theme_constant: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_theme_default_base_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_theme_default_font: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_theme_default_font_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_parent_control: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_h_grow_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_h_grow_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_v_grow_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_v_grow_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tooltip_auto_translate_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tooltip_auto_translate_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tooltip_text: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tooltip_text: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tooltip: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_default_cursor_shape: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_default_cursor_shape: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_cursor_shape: GDExtensionMethodBindPtr = null
  private[classes] var mb_accessibility_drag: GDExtensionMethodBindPtr = null
  private[classes] var mb_accessibility_drop: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_accessibility_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_accessibility_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_accessibility_description: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_accessibility_description: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_accessibility_live: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_accessibility_live: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_mouse_filter: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_mouse_filter: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_mouse_filter_with_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_mouse_behavior_recursive: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_mouse_behavior_recursive: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_force_pass_scroll_events: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_force_pass_scroll_events: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_clip_contents: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_clipping_contents: GDExtensionMethodBindPtr = null
  private[classes] var mb_grab_click_focus: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_drag_preview: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_drag_successful: GDExtensionMethodBindPtr = null
  private[classes] var mb_warp_mouse: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_shortcut_context: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_shortcut_context: GDExtensionMethodBindPtr = null
  private[classes] var mb_update_minimum_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_layout_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_layout_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_layout_rtl: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_auto_translate: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_auto_translating: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_localize_numeral_system: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_localizing_numeral_system: GDExtensionMethodBindPtr = null

  /** Godot enum `Control.FocusMode`. */
  opaque type FocusMode <: Long = Long

  object FocusMode {
    final val None: FocusMode = 0L.asInstanceOf[FocusMode]
    final val Click: FocusMode = 1L.asInstanceOf[FocusMode]
    final val All: FocusMode = 2L.asInstanceOf[FocusMode]
    final val Accessibility: FocusMode = 3L.asInstanceOf[FocusMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): FocusMode = value.asInstanceOf[FocusMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[FocusMode] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[FocusMode]]

    extension (self: FocusMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "None"
        case 1L => "Click"
        case 2L => "All"
        case 3L => "Accessibility"
        case other => other.toString
      }
  }

  /** Godot enum `Control.FocusBehaviorRecursive`. */
  opaque type FocusBehaviorRecursive <: Long = Long

  object FocusBehaviorRecursive {
    final val Inherited: FocusBehaviorRecursive = 0L.asInstanceOf[FocusBehaviorRecursive]
    final val Disabled: FocusBehaviorRecursive = 1L.asInstanceOf[FocusBehaviorRecursive]
    final val Enabled: FocusBehaviorRecursive = 2L.asInstanceOf[FocusBehaviorRecursive]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): FocusBehaviorRecursive = value.asInstanceOf[FocusBehaviorRecursive]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[FocusBehaviorRecursive] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[FocusBehaviorRecursive]]

    extension (self: FocusBehaviorRecursive)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Inherited"
        case 1L => "Disabled"
        case 2L => "Enabled"
        case other => other.toString
      }
  }

  /** Godot enum `Control.MouseBehaviorRecursive`. */
  opaque type MouseBehaviorRecursive <: Long = Long

  object MouseBehaviorRecursive {
    final val Inherited: MouseBehaviorRecursive = 0L.asInstanceOf[MouseBehaviorRecursive]
    final val Disabled: MouseBehaviorRecursive = 1L.asInstanceOf[MouseBehaviorRecursive]
    final val Enabled: MouseBehaviorRecursive = 2L.asInstanceOf[MouseBehaviorRecursive]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): MouseBehaviorRecursive = value.asInstanceOf[MouseBehaviorRecursive]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[MouseBehaviorRecursive] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[MouseBehaviorRecursive]]

    extension (self: MouseBehaviorRecursive)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Inherited"
        case 1L => "Disabled"
        case 2L => "Enabled"
        case other => other.toString
      }
  }

  /** Godot enum `Control.CursorShape`. */
  opaque type CursorShape <: Long = Long

  object CursorShape {
    final val Arrow: CursorShape = 0L.asInstanceOf[CursorShape]
    final val Ibeam: CursorShape = 1L.asInstanceOf[CursorShape]
    final val PointingHand: CursorShape = 2L.asInstanceOf[CursorShape]
    final val Cross: CursorShape = 3L.asInstanceOf[CursorShape]
    final val Wait: CursorShape = 4L.asInstanceOf[CursorShape]
    final val Busy: CursorShape = 5L.asInstanceOf[CursorShape]
    final val Drag: CursorShape = 6L.asInstanceOf[CursorShape]
    final val CanDrop: CursorShape = 7L.asInstanceOf[CursorShape]
    final val Forbidden: CursorShape = 8L.asInstanceOf[CursorShape]
    final val Vsize: CursorShape = 9L.asInstanceOf[CursorShape]
    final val Hsize: CursorShape = 10L.asInstanceOf[CursorShape]
    final val Bdiagsize: CursorShape = 11L.asInstanceOf[CursorShape]
    final val Fdiagsize: CursorShape = 12L.asInstanceOf[CursorShape]
    final val Move: CursorShape = 13L.asInstanceOf[CursorShape]
    final val Vsplit: CursorShape = 14L.asInstanceOf[CursorShape]
    final val Hsplit: CursorShape = 15L.asInstanceOf[CursorShape]
    final val Help: CursorShape = 16L.asInstanceOf[CursorShape]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): CursorShape = value.asInstanceOf[CursorShape]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[CursorShape] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 11L, 12L, 13L, 14L, 15L, 16L).asInstanceOf[scala.IArray[CursorShape]]

    extension (self: CursorShape)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Arrow"
        case 1L => "Ibeam"
        case 2L => "PointingHand"
        case 3L => "Cross"
        case 4L => "Wait"
        case 5L => "Busy"
        case 6L => "Drag"
        case 7L => "CanDrop"
        case 8L => "Forbidden"
        case 9L => "Vsize"
        case 10L => "Hsize"
        case 11L => "Bdiagsize"
        case 12L => "Fdiagsize"
        case 13L => "Move"
        case 14L => "Vsplit"
        case 15L => "Hsplit"
        case 16L => "Help"
        case other => other.toString
      }
  }

  /** Godot enum `Control.LayoutPreset`. */
  opaque type LayoutPreset <: Long = Long

  object LayoutPreset {
    final val TopLeft: LayoutPreset = 0L.asInstanceOf[LayoutPreset]
    final val TopRight: LayoutPreset = 1L.asInstanceOf[LayoutPreset]
    final val BottomLeft: LayoutPreset = 2L.asInstanceOf[LayoutPreset]
    final val BottomRight: LayoutPreset = 3L.asInstanceOf[LayoutPreset]
    final val CenterLeft: LayoutPreset = 4L.asInstanceOf[LayoutPreset]
    final val CenterTop: LayoutPreset = 5L.asInstanceOf[LayoutPreset]
    final val CenterRight: LayoutPreset = 6L.asInstanceOf[LayoutPreset]
    final val CenterBottom: LayoutPreset = 7L.asInstanceOf[LayoutPreset]
    final val Center: LayoutPreset = 8L.asInstanceOf[LayoutPreset]
    final val LeftWide: LayoutPreset = 9L.asInstanceOf[LayoutPreset]
    final val TopWide: LayoutPreset = 10L.asInstanceOf[LayoutPreset]
    final val RightWide: LayoutPreset = 11L.asInstanceOf[LayoutPreset]
    final val BottomWide: LayoutPreset = 12L.asInstanceOf[LayoutPreset]
    final val VcenterWide: LayoutPreset = 13L.asInstanceOf[LayoutPreset]
    final val HcenterWide: LayoutPreset = 14L.asInstanceOf[LayoutPreset]
    final val FullRect: LayoutPreset = 15L.asInstanceOf[LayoutPreset]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): LayoutPreset = value.asInstanceOf[LayoutPreset]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[LayoutPreset] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 11L, 12L, 13L, 14L, 15L).asInstanceOf[scala.IArray[LayoutPreset]]

    extension (self: LayoutPreset)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "TopLeft"
        case 1L => "TopRight"
        case 2L => "BottomLeft"
        case 3L => "BottomRight"
        case 4L => "CenterLeft"
        case 5L => "CenterTop"
        case 6L => "CenterRight"
        case 7L => "CenterBottom"
        case 8L => "Center"
        case 9L => "LeftWide"
        case 10L => "TopWide"
        case 11L => "RightWide"
        case 12L => "BottomWide"
        case 13L => "VcenterWide"
        case 14L => "HcenterWide"
        case 15L => "FullRect"
        case other => other.toString
      }
  }

  /** Godot enum `Control.LayoutPresetMode`. */
  opaque type LayoutPresetMode <: Long = Long

  object LayoutPresetMode {
    final val Minsize: LayoutPresetMode = 0L.asInstanceOf[LayoutPresetMode]
    final val KeepWidth: LayoutPresetMode = 1L.asInstanceOf[LayoutPresetMode]
    final val KeepHeight: LayoutPresetMode = 2L.asInstanceOf[LayoutPresetMode]
    final val KeepSize: LayoutPresetMode = 3L.asInstanceOf[LayoutPresetMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): LayoutPresetMode = value.asInstanceOf[LayoutPresetMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[LayoutPresetMode] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[LayoutPresetMode]]

    extension (self: LayoutPresetMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Minsize"
        case 1L => "KeepWidth"
        case 2L => "KeepHeight"
        case 3L => "KeepSize"
        case other => other.toString
      }
  }

  /** Godot bitfield `Control.SizeFlags`. */
  opaque type SizeFlags = Long

  object SizeFlags {
    final val ShrinkBegin: SizeFlags = 0L.asInstanceOf[SizeFlags]
    final val Fill: SizeFlags = 1L.asInstanceOf[SizeFlags]
    final val Expand: SizeFlags = 2L.asInstanceOf[SizeFlags]
    final val ExpandFill: SizeFlags = 3L.asInstanceOf[SizeFlags]
    final val ShrinkCenter: SizeFlags = 4L.asInstanceOf[SizeFlags]
    final val ShrinkEnd: SizeFlags = 8L.asInstanceOf[SizeFlags]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): SizeFlags = value.asInstanceOf[SizeFlags]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[SizeFlags] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 8L).asInstanceOf[scala.IArray[SizeFlags]]

    extension (self: SizeFlags)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "ShrinkBegin"
        case 1L => "Fill"
        case 2L => "Expand"
        case 3L => "ExpandFill"
        case 4L => "ShrinkCenter"
        case 8L => "ShrinkEnd"
        case other => other.toString
      }
    extension (self: SizeFlags) {
      inline def value: Long = self.asInstanceOf[Long]
      inline def |(other: SizeFlags): SizeFlags = (self.value | other.value).asInstanceOf[SizeFlags]
      inline def &(other: SizeFlags): SizeFlags = (self.value & other.value).asInstanceOf[SizeFlags]
      /** Every bit of `flag` is set. */
      inline def has(flag: SizeFlags): Boolean = (self.value & flag.value) == flag.value
    }
  }

  /** Godot enum `Control.MouseFilter`. */
  opaque type MouseFilter <: Long = Long

  object MouseFilter {
    final val Stop: MouseFilter = 0L.asInstanceOf[MouseFilter]
    final val Pass: MouseFilter = 1L.asInstanceOf[MouseFilter]
    final val Ignore: MouseFilter = 2L.asInstanceOf[MouseFilter]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): MouseFilter = value.asInstanceOf[MouseFilter]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[MouseFilter] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[MouseFilter]]

    extension (self: MouseFilter)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Stop"
        case 1L => "Pass"
        case 2L => "Ignore"
        case other => other.toString
      }
  }

  /** Godot enum `Control.GrowDirection`. */
  opaque type GrowDirection <: Long = Long

  object GrowDirection {
    final val Begin: GrowDirection = 0L.asInstanceOf[GrowDirection]
    final val End: GrowDirection = 1L.asInstanceOf[GrowDirection]
    final val Both: GrowDirection = 2L.asInstanceOf[GrowDirection]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): GrowDirection = value.asInstanceOf[GrowDirection]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[GrowDirection] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[GrowDirection]]

    extension (self: GrowDirection)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Begin"
        case 1L => "End"
        case 2L => "Both"
        case other => other.toString
      }
  }

  /** Godot enum `Control.Anchor`. */
  opaque type Anchor <: Long = Long

  object Anchor {
    final val Begin: Anchor = 0L.asInstanceOf[Anchor]
    final val End: Anchor = 1L.asInstanceOf[Anchor]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Anchor = value.asInstanceOf[Anchor]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Anchor] = scala.IArray[Long](0L, 1L).asInstanceOf[scala.IArray[Anchor]]

    extension (self: Anchor)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Begin"
        case 1L => "End"
        case other => other.toString
      }
  }

  /** Godot enum `Control.LayoutDirection`. */
  opaque type LayoutDirection <: Long = Long

  object LayoutDirection {
    final val Inherited: LayoutDirection = 0L.asInstanceOf[LayoutDirection]
    final val ApplicationLocale: LayoutDirection = 1L.asInstanceOf[LayoutDirection]
    final val Ltr: LayoutDirection = 2L.asInstanceOf[LayoutDirection]
    final val Rtl: LayoutDirection = 3L.asInstanceOf[LayoutDirection]
    final val SystemLocale: LayoutDirection = 4L.asInstanceOf[LayoutDirection]
    final val Max: LayoutDirection = 5L.asInstanceOf[LayoutDirection]
    final val Locale: LayoutDirection = 1L.asInstanceOf[LayoutDirection]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): LayoutDirection = value.asInstanceOf[LayoutDirection]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[LayoutDirection] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L).asInstanceOf[scala.IArray[LayoutDirection]]

    extension (self: LayoutDirection)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Inherited"
        case 1L => "ApplicationLocale"
        case 2L => "Ltr"
        case 3L => "Rtl"
        case 4L => "SystemLocale"
        case 5L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `Control.TextDirection`. */
  opaque type TextDirection <: Long = Long

  object TextDirection {
    final val Inherited: TextDirection = 3L.asInstanceOf[TextDirection]
    final val Auto: TextDirection = 0L.asInstanceOf[TextDirection]
    final val Ltr: TextDirection = 1L.asInstanceOf[TextDirection]
    final val Rtl: TextDirection = 2L.asInstanceOf[TextDirection]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): TextDirection = value.asInstanceOf[TextDirection]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[TextDirection] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[TextDirection]]

    extension (self: TextDirection)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Auto"
        case 1L => "Ltr"
        case 2L => "Rtl"
        case 3L => "Inherited"
        case other => other.toString
      }
  }
}
