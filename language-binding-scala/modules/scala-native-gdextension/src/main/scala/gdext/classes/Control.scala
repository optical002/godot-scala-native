package gdext.classes

import gdext.Godot
import gdext.builtin.*
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
  final def setAnchorsPreset(preset: Long, keep_offsets: Boolean): Unit = {
    if (gdext.classes.Control.mb_set_anchors_preset == null) gdext.classes.Control.mb_set_anchors_preset = MethodBind.get("Control", "set_anchors_preset", 509135270L)
    Ptrcall.callVoid2(gdext.classes.Control.mb_set_anchors_preset, livePtr, preset, keep_offsets)
  }

  /** Control.set_offsets_preset */
  final def setOffsetsPreset(preset: Long, resize_mode: Long, margin: Long): Unit = {
    if (gdext.classes.Control.mb_set_offsets_preset == null) gdext.classes.Control.mb_set_offsets_preset = MethodBind.get("Control", "set_offsets_preset", 3724524307L)
    Ptrcall.callVoid3(gdext.classes.Control.mb_set_offsets_preset, livePtr, preset, resize_mode, margin)
  }

  /** Control.set_anchors_and_offsets_preset */
  final def setAnchorsAndOffsetsPreset(preset: Long, resize_mode: Long, margin: Long): Unit = {
    if (gdext.classes.Control.mb_set_anchors_and_offsets_preset == null) gdext.classes.Control.mb_set_anchors_and_offsets_preset = MethodBind.get("Control", "set_anchors_and_offsets_preset", 3724524307L)
    Ptrcall.callVoid3(gdext.classes.Control.mb_set_anchors_and_offsets_preset, livePtr, preset, resize_mode, margin)
  }

  /** Control.set_anchor */
  final def setAnchor(side: Long, anchor: Double, keep_offset: Boolean, push_opposite_anchor: Boolean): Unit = {
    if (gdext.classes.Control.mb_set_anchor == null) gdext.classes.Control.mb_set_anchor = MethodBind.get("Control", "set_anchor", 2302782885L)
    Ptrcall.callVoid4(gdext.classes.Control.mb_set_anchor, livePtr, side, anchor, keep_offset, push_opposite_anchor)
  }

  /** Control.get_anchor */
  final def getAnchor(side: Long): Double = {
    if (gdext.classes.Control.mb_get_anchor == null) gdext.classes.Control.mb_get_anchor = MethodBind.get("Control", "get_anchor", 2869120046L)
    Ptrcall.call1[Long, Double](gdext.classes.Control.mb_get_anchor, livePtr, side)
  }

  /** Control.set_offset */
  final def setOffset(side: Long, offset: Double): Unit = {
    if (gdext.classes.Control.mb_set_offset == null) gdext.classes.Control.mb_set_offset = MethodBind.get("Control", "set_offset", 4290182280L)
    Ptrcall.callVoid2(gdext.classes.Control.mb_set_offset, livePtr, side, offset)
  }

  /** Control.get_offset */
  final def getOffset(offset: Long): Double = {
    if (gdext.classes.Control.mb_get_offset == null) gdext.classes.Control.mb_get_offset = MethodBind.get("Control", "get_offset", 2869120046L)
    Ptrcall.call1[Long, Double](gdext.classes.Control.mb_get_offset, livePtr, offset)
  }

  /** Control.set_anchor_and_offset */
  final def setAnchorAndOffset(side: Long, anchor: Double, offset: Double, push_opposite_anchor: Boolean): Unit = {
    if (gdext.classes.Control.mb_set_anchor_and_offset == null) gdext.classes.Control.mb_set_anchor_and_offset = MethodBind.get("Control", "set_anchor_and_offset", 4031722181L)
    Ptrcall.callVoid4(gdext.classes.Control.mb_set_anchor_and_offset, livePtr, side, anchor, offset, push_opposite_anchor)
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
  final def setPosition(position: gdext.builtin.Vector2, keep_offsets: Boolean): Unit = {
    if (gdext.classes.Control.mb_set_position == null) gdext.classes.Control.mb_set_position = MethodBind.get("Control", "set_position", 2436320129L)
    Ptrcall.callVoid2(gdext.classes.Control.mb_set_position, livePtr, position, keep_offsets)
  }

  /** Control.set_size */
  final def setSize(size: gdext.builtin.Vector2, keep_offsets: Boolean): Unit = {
    if (gdext.classes.Control.mb_set_size == null) gdext.classes.Control.mb_set_size = MethodBind.get("Control", "set_size", 2436320129L)
    Ptrcall.callVoid2(gdext.classes.Control.mb_set_size, livePtr, size, keep_offsets)
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
  final def setGlobalPosition(position: gdext.builtin.Vector2, keep_offsets: Boolean): Unit = {
    if (gdext.classes.Control.mb_set_global_position == null) gdext.classes.Control.mb_set_global_position = MethodBind.get("Control", "set_global_position", 2436320129L)
    Ptrcall.callVoid2(gdext.classes.Control.mb_set_global_position, livePtr, position, keep_offsets)
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
  final def setPivotOffset(pivot_offset: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.Control.mb_set_pivot_offset == null) gdext.classes.Control.mb_set_pivot_offset = MethodBind.get("Control", "set_pivot_offset", 743155724L)
    Ptrcall.callVoid1(gdext.classes.Control.mb_set_pivot_offset, livePtr, pivot_offset)
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
  final def setFocusMode(mode: Long): Unit = {
    if (gdext.classes.Control.mb_set_focus_mode == null) gdext.classes.Control.mb_set_focus_mode = MethodBind.get("Control", "set_focus_mode", 3232914922L)
    Ptrcall.callVoid1(gdext.classes.Control.mb_set_focus_mode, livePtr, mode)
  }

  /** Control.get_focus_mode */
  final def getFocusMode(): Long = {
    if (gdext.classes.Control.mb_get_focus_mode == null) gdext.classes.Control.mb_get_focus_mode = MethodBind.get("Control", "get_focus_mode", 2132829277L)
    Ptrcall.call0[Long](gdext.classes.Control.mb_get_focus_mode, livePtr)
  }

  /** Control.get_focus_mode_with_override */
  final def getFocusModeWithOverride(): Long = {
    if (gdext.classes.Control.mb_get_focus_mode_with_override == null) gdext.classes.Control.mb_get_focus_mode_with_override = MethodBind.get("Control", "get_focus_mode_with_override", 2132829277L)
    Ptrcall.call0[Long](gdext.classes.Control.mb_get_focus_mode_with_override, livePtr)
  }

  /** Control.set_focus_behavior_recursive */
  final def setFocusBehaviorRecursive(focus_behavior_recursive: Long): Unit = {
    if (gdext.classes.Control.mb_set_focus_behavior_recursive == null) gdext.classes.Control.mb_set_focus_behavior_recursive = MethodBind.get("Control", "set_focus_behavior_recursive", 4256832521L)
    Ptrcall.callVoid1(gdext.classes.Control.mb_set_focus_behavior_recursive, livePtr, focus_behavior_recursive)
  }

  /** Control.get_focus_behavior_recursive */
  final def getFocusBehaviorRecursive(): Long = {
    if (gdext.classes.Control.mb_get_focus_behavior_recursive == null) gdext.classes.Control.mb_get_focus_behavior_recursive = MethodBind.get("Control", "get_focus_behavior_recursive", 2435707181L)
    Ptrcall.call0[Long](gdext.classes.Control.mb_get_focus_behavior_recursive, livePtr)
  }

  /** Control.has_focus */
  final def hasFocus(ignore_hidden_focus: Boolean): Boolean = {
    if (gdext.classes.Control.mb_has_focus == null) gdext.classes.Control.mb_has_focus = MethodBind.get("Control", "has_focus", 3302206351L)
    Ptrcall.call1[Boolean, Boolean](gdext.classes.Control.mb_has_focus, livePtr, ignore_hidden_focus)
  }

  /** Control.grab_focus */
  final def grabFocus(hide_focus: Boolean): Unit = {
    if (gdext.classes.Control.mb_grab_focus == null) gdext.classes.Control.mb_grab_focus = MethodBind.get("Control", "grab_focus", 107499316L)
    Ptrcall.callVoid1(gdext.classes.Control.mb_grab_focus, livePtr, hide_focus)
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
  final def findValidFocusNeighbor(side: Long): Control = {
    if (gdext.classes.Control.mb_find_valid_focus_neighbor == null) gdext.classes.Control.mb_find_valid_focus_neighbor = MethodBind.get("Control", "find_valid_focus_neighbor", 1543910170L)
    Wrappers.borrowed[Control](Ptrcall.call1[Long, Long](gdext.classes.Control.mb_find_valid_focus_neighbor, livePtr, side))
  }

  /** Control.set_h_size_flags */
  final def setHSizeFlags(flags: Long): Unit = {
    if (gdext.classes.Control.mb_set_h_size_flags == null) gdext.classes.Control.mb_set_h_size_flags = MethodBind.get("Control", "set_h_size_flags", 394851643L)
    Ptrcall.callVoid1(gdext.classes.Control.mb_set_h_size_flags, livePtr, flags)
  }

  /** Control.get_h_size_flags */
  final def getHSizeFlags(): Long = {
    if (gdext.classes.Control.mb_get_h_size_flags == null) gdext.classes.Control.mb_get_h_size_flags = MethodBind.get("Control", "get_h_size_flags", 3781367401L)
    Ptrcall.call0[Long](gdext.classes.Control.mb_get_h_size_flags, livePtr)
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
  final def setVSizeFlags(flags: Long): Unit = {
    if (gdext.classes.Control.mb_set_v_size_flags == null) gdext.classes.Control.mb_set_v_size_flags = MethodBind.get("Control", "set_v_size_flags", 394851643L)
    Ptrcall.callVoid1(gdext.classes.Control.mb_set_v_size_flags, livePtr, flags)
  }

  /** Control.get_v_size_flags */
  final def getVSizeFlags(): Long = {
    if (gdext.classes.Control.mb_get_v_size_flags == null) gdext.classes.Control.mb_get_v_size_flags = MethodBind.get("Control", "get_v_size_flags", 3781367401L)
    Ptrcall.call0[Long](gdext.classes.Control.mb_get_v_size_flags, livePtr)
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
  final def setThemeTypeVariation(theme_type: gdext.builtin.StringName): Unit = {
    if (gdext.classes.Control.mb_set_theme_type_variation == null) gdext.classes.Control.mb_set_theme_type_variation = MethodBind.get("Control", "set_theme_type_variation", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.Control.mb_set_theme_type_variation, livePtr, theme_type)
  }

  /** Control.get_theme_type_variation */
  final def getThemeTypeVariation(): gdext.builtin.StringName = {
    if (gdext.classes.Control.mb_get_theme_type_variation == null) gdext.classes.Control.mb_get_theme_type_variation = MethodBind.get("Control", "get_theme_type_variation", 2002593661L)
    Ptrcall.call0[gdext.builtin.StringName](gdext.classes.Control.mb_get_theme_type_variation, livePtr)
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
  final def addThemeIconOverride(name: gdext.builtin.StringName, texture: Texture2D): Unit = {
    if (gdext.classes.Control.mb_add_theme_icon_override == null) gdext.classes.Control.mb_add_theme_icon_override = MethodBind.get("Control", "add_theme_icon_override", 1373065600L)
    Ptrcall.callVoid2(gdext.classes.Control.mb_add_theme_icon_override, livePtr, name, Wrappers.handle(texture))
  }

  /** Control.add_theme_stylebox_override */
  final def addThemeStyleboxOverride(name: gdext.builtin.StringName, stylebox: StyleBox): Unit = {
    if (gdext.classes.Control.mb_add_theme_stylebox_override == null) gdext.classes.Control.mb_add_theme_stylebox_override = MethodBind.get("Control", "add_theme_stylebox_override", 4188838905L)
    Ptrcall.callVoid2(gdext.classes.Control.mb_add_theme_stylebox_override, livePtr, name, Wrappers.handle(stylebox))
  }

  /** Control.add_theme_font_override */
  final def addThemeFontOverride(name: gdext.builtin.StringName, font: Font): Unit = {
    if (gdext.classes.Control.mb_add_theme_font_override == null) gdext.classes.Control.mb_add_theme_font_override = MethodBind.get("Control", "add_theme_font_override", 3518018674L)
    Ptrcall.callVoid2(gdext.classes.Control.mb_add_theme_font_override, livePtr, name, Wrappers.handle(font))
  }

  /** Control.add_theme_font_size_override */
  final def addThemeFontSizeOverride(name: gdext.builtin.StringName, font_size: Long): Unit = {
    if (gdext.classes.Control.mb_add_theme_font_size_override == null) gdext.classes.Control.mb_add_theme_font_size_override = MethodBind.get("Control", "add_theme_font_size_override", 2415702435L)
    Ptrcall.callVoid2(gdext.classes.Control.mb_add_theme_font_size_override, livePtr, name, font_size)
  }

  /** Control.add_theme_color_override */
  final def addThemeColorOverride(name: gdext.builtin.StringName, color: gdext.builtin.Color): Unit = {
    if (gdext.classes.Control.mb_add_theme_color_override == null) gdext.classes.Control.mb_add_theme_color_override = MethodBind.get("Control", "add_theme_color_override", 4260178595L)
    Ptrcall.callVoid2(gdext.classes.Control.mb_add_theme_color_override, livePtr, name, color)
  }

  /** Control.add_theme_constant_override */
  final def addThemeConstantOverride(name: gdext.builtin.StringName, constant: Long): Unit = {
    if (gdext.classes.Control.mb_add_theme_constant_override == null) gdext.classes.Control.mb_add_theme_constant_override = MethodBind.get("Control", "add_theme_constant_override", 2415702435L)
    Ptrcall.callVoid2(gdext.classes.Control.mb_add_theme_constant_override, livePtr, name, constant)
  }

  /** Control.remove_theme_icon_override */
  final def removeThemeIconOverride(name: gdext.builtin.StringName): Unit = {
    if (gdext.classes.Control.mb_remove_theme_icon_override == null) gdext.classes.Control.mb_remove_theme_icon_override = MethodBind.get("Control", "remove_theme_icon_override", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.Control.mb_remove_theme_icon_override, livePtr, name)
  }

  /** Control.remove_theme_stylebox_override */
  final def removeThemeStyleboxOverride(name: gdext.builtin.StringName): Unit = {
    if (gdext.classes.Control.mb_remove_theme_stylebox_override == null) gdext.classes.Control.mb_remove_theme_stylebox_override = MethodBind.get("Control", "remove_theme_stylebox_override", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.Control.mb_remove_theme_stylebox_override, livePtr, name)
  }

  /** Control.remove_theme_font_override */
  final def removeThemeFontOverride(name: gdext.builtin.StringName): Unit = {
    if (gdext.classes.Control.mb_remove_theme_font_override == null) gdext.classes.Control.mb_remove_theme_font_override = MethodBind.get("Control", "remove_theme_font_override", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.Control.mb_remove_theme_font_override, livePtr, name)
  }

  /** Control.remove_theme_font_size_override */
  final def removeThemeFontSizeOverride(name: gdext.builtin.StringName): Unit = {
    if (gdext.classes.Control.mb_remove_theme_font_size_override == null) gdext.classes.Control.mb_remove_theme_font_size_override = MethodBind.get("Control", "remove_theme_font_size_override", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.Control.mb_remove_theme_font_size_override, livePtr, name)
  }

  /** Control.remove_theme_color_override */
  final def removeThemeColorOverride(name: gdext.builtin.StringName): Unit = {
    if (gdext.classes.Control.mb_remove_theme_color_override == null) gdext.classes.Control.mb_remove_theme_color_override = MethodBind.get("Control", "remove_theme_color_override", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.Control.mb_remove_theme_color_override, livePtr, name)
  }

  /** Control.remove_theme_constant_override */
  final def removeThemeConstantOverride(name: gdext.builtin.StringName): Unit = {
    if (gdext.classes.Control.mb_remove_theme_constant_override == null) gdext.classes.Control.mb_remove_theme_constant_override = MethodBind.get("Control", "remove_theme_constant_override", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.Control.mb_remove_theme_constant_override, livePtr, name)
  }

  /** Control.get_theme_icon. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getThemeIcon(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Texture2D = {
    if (gdext.classes.Control.mb_get_theme_icon == null) gdext.classes.Control.mb_get_theme_icon = MethodBind.get("Control", "get_theme_icon", 3163973443L)
    Wrappers.owned[Texture2D](Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, Long](gdext.classes.Control.mb_get_theme_icon, livePtr, name, theme_type))
  }

  /** Control.get_theme_stylebox. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getThemeStylebox(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): StyleBox = {
    if (gdext.classes.Control.mb_get_theme_stylebox == null) gdext.classes.Control.mb_get_theme_stylebox = MethodBind.get("Control", "get_theme_stylebox", 604739069L)
    Wrappers.owned[StyleBox](Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, Long](gdext.classes.Control.mb_get_theme_stylebox, livePtr, name, theme_type))
  }

  /** Control.get_theme_font. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getThemeFont(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Font = {
    if (gdext.classes.Control.mb_get_theme_font == null) gdext.classes.Control.mb_get_theme_font = MethodBind.get("Control", "get_theme_font", 2826986490L)
    Wrappers.owned[Font](Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, Long](gdext.classes.Control.mb_get_theme_font, livePtr, name, theme_type))
  }

  /** Control.get_theme_font_size */
  final def getThemeFontSize(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Long = {
    if (gdext.classes.Control.mb_get_theme_font_size == null) gdext.classes.Control.mb_get_theme_font_size = MethodBind.get("Control", "get_theme_font_size", 1327056374L)
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, Long](gdext.classes.Control.mb_get_theme_font_size, livePtr, name, theme_type)
  }

  /** Control.get_theme_color */
  final def getThemeColor(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): gdext.builtin.Color = {
    if (gdext.classes.Control.mb_get_theme_color == null) gdext.classes.Control.mb_get_theme_color = MethodBind.get("Control", "get_theme_color", 2798751242L)
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, gdext.builtin.Color](gdext.classes.Control.mb_get_theme_color, livePtr, name, theme_type)
  }

  /** Control.get_theme_constant */
  final def getThemeConstant(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Long = {
    if (gdext.classes.Control.mb_get_theme_constant == null) gdext.classes.Control.mb_get_theme_constant = MethodBind.get("Control", "get_theme_constant", 1327056374L)
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, Long](gdext.classes.Control.mb_get_theme_constant, livePtr, name, theme_type)
  }

  /** Control.has_theme_icon_override */
  final def hasThemeIconOverride(name: gdext.builtin.StringName): Boolean = {
    if (gdext.classes.Control.mb_has_theme_icon_override == null) gdext.classes.Control.mb_has_theme_icon_override = MethodBind.get("Control", "has_theme_icon_override", 2619796661L)
    Ptrcall.call1[gdext.builtin.StringName, Boolean](gdext.classes.Control.mb_has_theme_icon_override, livePtr, name)
  }

  /** Control.has_theme_stylebox_override */
  final def hasThemeStyleboxOverride(name: gdext.builtin.StringName): Boolean = {
    if (gdext.classes.Control.mb_has_theme_stylebox_override == null) gdext.classes.Control.mb_has_theme_stylebox_override = MethodBind.get("Control", "has_theme_stylebox_override", 2619796661L)
    Ptrcall.call1[gdext.builtin.StringName, Boolean](gdext.classes.Control.mb_has_theme_stylebox_override, livePtr, name)
  }

  /** Control.has_theme_font_override */
  final def hasThemeFontOverride(name: gdext.builtin.StringName): Boolean = {
    if (gdext.classes.Control.mb_has_theme_font_override == null) gdext.classes.Control.mb_has_theme_font_override = MethodBind.get("Control", "has_theme_font_override", 2619796661L)
    Ptrcall.call1[gdext.builtin.StringName, Boolean](gdext.classes.Control.mb_has_theme_font_override, livePtr, name)
  }

  /** Control.has_theme_font_size_override */
  final def hasThemeFontSizeOverride(name: gdext.builtin.StringName): Boolean = {
    if (gdext.classes.Control.mb_has_theme_font_size_override == null) gdext.classes.Control.mb_has_theme_font_size_override = MethodBind.get("Control", "has_theme_font_size_override", 2619796661L)
    Ptrcall.call1[gdext.builtin.StringName, Boolean](gdext.classes.Control.mb_has_theme_font_size_override, livePtr, name)
  }

  /** Control.has_theme_color_override */
  final def hasThemeColorOverride(name: gdext.builtin.StringName): Boolean = {
    if (gdext.classes.Control.mb_has_theme_color_override == null) gdext.classes.Control.mb_has_theme_color_override = MethodBind.get("Control", "has_theme_color_override", 2619796661L)
    Ptrcall.call1[gdext.builtin.StringName, Boolean](gdext.classes.Control.mb_has_theme_color_override, livePtr, name)
  }

  /** Control.has_theme_constant_override */
  final def hasThemeConstantOverride(name: gdext.builtin.StringName): Boolean = {
    if (gdext.classes.Control.mb_has_theme_constant_override == null) gdext.classes.Control.mb_has_theme_constant_override = MethodBind.get("Control", "has_theme_constant_override", 2619796661L)
    Ptrcall.call1[gdext.builtin.StringName, Boolean](gdext.classes.Control.mb_has_theme_constant_override, livePtr, name)
  }

  /** Control.has_theme_icon */
  final def hasThemeIcon(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Boolean = {
    if (gdext.classes.Control.mb_has_theme_icon == null) gdext.classes.Control.mb_has_theme_icon = MethodBind.get("Control", "has_theme_icon", 866386512L)
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, Boolean](gdext.classes.Control.mb_has_theme_icon, livePtr, name, theme_type)
  }

  /** Control.has_theme_stylebox */
  final def hasThemeStylebox(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Boolean = {
    if (gdext.classes.Control.mb_has_theme_stylebox == null) gdext.classes.Control.mb_has_theme_stylebox = MethodBind.get("Control", "has_theme_stylebox", 866386512L)
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, Boolean](gdext.classes.Control.mb_has_theme_stylebox, livePtr, name, theme_type)
  }

  /** Control.has_theme_font */
  final def hasThemeFont(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Boolean = {
    if (gdext.classes.Control.mb_has_theme_font == null) gdext.classes.Control.mb_has_theme_font = MethodBind.get("Control", "has_theme_font", 866386512L)
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, Boolean](gdext.classes.Control.mb_has_theme_font, livePtr, name, theme_type)
  }

  /** Control.has_theme_font_size */
  final def hasThemeFontSize(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Boolean = {
    if (gdext.classes.Control.mb_has_theme_font_size == null) gdext.classes.Control.mb_has_theme_font_size = MethodBind.get("Control", "has_theme_font_size", 866386512L)
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, Boolean](gdext.classes.Control.mb_has_theme_font_size, livePtr, name, theme_type)
  }

  /** Control.has_theme_color */
  final def hasThemeColor(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Boolean = {
    if (gdext.classes.Control.mb_has_theme_color == null) gdext.classes.Control.mb_has_theme_color = MethodBind.get("Control", "has_theme_color", 866386512L)
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, Boolean](gdext.classes.Control.mb_has_theme_color, livePtr, name, theme_type)
  }

  /** Control.has_theme_constant */
  final def hasThemeConstant(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Boolean = {
    if (gdext.classes.Control.mb_has_theme_constant == null) gdext.classes.Control.mb_has_theme_constant = MethodBind.get("Control", "has_theme_constant", 866386512L)
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, Boolean](gdext.classes.Control.mb_has_theme_constant, livePtr, name, theme_type)
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
  final def setHGrowDirection(direction: Long): Unit = {
    if (gdext.classes.Control.mb_set_h_grow_direction == null) gdext.classes.Control.mb_set_h_grow_direction = MethodBind.get("Control", "set_h_grow_direction", 2022385301L)
    Ptrcall.callVoid1(gdext.classes.Control.mb_set_h_grow_direction, livePtr, direction)
  }

  /** Control.get_h_grow_direction */
  final def getHGrowDirection(): Long = {
    if (gdext.classes.Control.mb_get_h_grow_direction == null) gdext.classes.Control.mb_get_h_grow_direction = MethodBind.get("Control", "get_h_grow_direction", 3635610155L)
    Ptrcall.call0[Long](gdext.classes.Control.mb_get_h_grow_direction, livePtr)
  }

  /** Control.set_v_grow_direction */
  final def setVGrowDirection(direction: Long): Unit = {
    if (gdext.classes.Control.mb_set_v_grow_direction == null) gdext.classes.Control.mb_set_v_grow_direction = MethodBind.get("Control", "set_v_grow_direction", 2022385301L)
    Ptrcall.callVoid1(gdext.classes.Control.mb_set_v_grow_direction, livePtr, direction)
  }

  /** Control.get_v_grow_direction */
  final def getVGrowDirection(): Long = {
    if (gdext.classes.Control.mb_get_v_grow_direction == null) gdext.classes.Control.mb_get_v_grow_direction = MethodBind.get("Control", "get_v_grow_direction", 3635610155L)
    Ptrcall.call0[Long](gdext.classes.Control.mb_get_v_grow_direction, livePtr)
  }

  /** Control.set_tooltip_auto_translate_mode */
  final def setTooltipAutoTranslateMode(mode: Long): Unit = {
    if (gdext.classes.Control.mb_set_tooltip_auto_translate_mode == null) gdext.classes.Control.mb_set_tooltip_auto_translate_mode = MethodBind.get("Control", "set_tooltip_auto_translate_mode", 776149714L)
    Ptrcall.callVoid1(gdext.classes.Control.mb_set_tooltip_auto_translate_mode, livePtr, mode)
  }

  /** Control.get_tooltip_auto_translate_mode */
  final def getTooltipAutoTranslateMode(): Long = {
    if (gdext.classes.Control.mb_get_tooltip_auto_translate_mode == null) gdext.classes.Control.mb_get_tooltip_auto_translate_mode = MethodBind.get("Control", "get_tooltip_auto_translate_mode", 2498906432L)
    Ptrcall.call0[Long](gdext.classes.Control.mb_get_tooltip_auto_translate_mode, livePtr)
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
  final def getTooltip(at_position: gdext.builtin.Vector2): String = {
    if (gdext.classes.Control.mb_get_tooltip == null) gdext.classes.Control.mb_get_tooltip = MethodBind.get("Control", "get_tooltip", 2895288280L)
    Ptrcall.call1[gdext.builtin.Vector2, String](gdext.classes.Control.mb_get_tooltip, livePtr, at_position)
  }

  /** Control.set_default_cursor_shape */
  final def setDefaultCursorShape(shape: Long): Unit = {
    if (gdext.classes.Control.mb_set_default_cursor_shape == null) gdext.classes.Control.mb_set_default_cursor_shape = MethodBind.get("Control", "set_default_cursor_shape", 217062046L)
    Ptrcall.callVoid1(gdext.classes.Control.mb_set_default_cursor_shape, livePtr, shape)
  }

  /** Control.get_default_cursor_shape */
  final def getDefaultCursorShape(): Long = {
    if (gdext.classes.Control.mb_get_default_cursor_shape == null) gdext.classes.Control.mb_get_default_cursor_shape = MethodBind.get("Control", "get_default_cursor_shape", 2359535750L)
    Ptrcall.call0[Long](gdext.classes.Control.mb_get_default_cursor_shape, livePtr)
  }

  /** Control.get_cursor_shape */
  final def getCursorShape(position: gdext.builtin.Vector2): Long = {
    if (gdext.classes.Control.mb_get_cursor_shape == null) gdext.classes.Control.mb_get_cursor_shape = MethodBind.get("Control", "get_cursor_shape", 1395773853L)
    Ptrcall.call1[gdext.builtin.Vector2, Long](gdext.classes.Control.mb_get_cursor_shape, livePtr, position)
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
  final def setAccessibilityLive(mode: Long): Unit = {
    if (gdext.classes.Control.mb_set_accessibility_live == null) gdext.classes.Control.mb_set_accessibility_live = MethodBind.get("Control", "set_accessibility_live", 1720261470L)
    Ptrcall.callVoid1(gdext.classes.Control.mb_set_accessibility_live, livePtr, mode)
  }

  /** Control.get_accessibility_live */
  final def getAccessibilityLive(): Long = {
    if (gdext.classes.Control.mb_get_accessibility_live == null) gdext.classes.Control.mb_get_accessibility_live = MethodBind.get("Control", "get_accessibility_live", 3311037003L)
    Ptrcall.call0[Long](gdext.classes.Control.mb_get_accessibility_live, livePtr)
  }

  /** Control.set_mouse_filter */
  final def setMouseFilter(filter: Long): Unit = {
    if (gdext.classes.Control.mb_set_mouse_filter == null) gdext.classes.Control.mb_set_mouse_filter = MethodBind.get("Control", "set_mouse_filter", 3891156122L)
    Ptrcall.callVoid1(gdext.classes.Control.mb_set_mouse_filter, livePtr, filter)
  }

  /** Control.get_mouse_filter */
  final def getMouseFilter(): Long = {
    if (gdext.classes.Control.mb_get_mouse_filter == null) gdext.classes.Control.mb_get_mouse_filter = MethodBind.get("Control", "get_mouse_filter", 1572545674L)
    Ptrcall.call0[Long](gdext.classes.Control.mb_get_mouse_filter, livePtr)
  }

  /** Control.get_mouse_filter_with_override */
  final def getMouseFilterWithOverride(): Long = {
    if (gdext.classes.Control.mb_get_mouse_filter_with_override == null) gdext.classes.Control.mb_get_mouse_filter_with_override = MethodBind.get("Control", "get_mouse_filter_with_override", 1572545674L)
    Ptrcall.call0[Long](gdext.classes.Control.mb_get_mouse_filter_with_override, livePtr)
  }

  /** Control.set_mouse_behavior_recursive */
  final def setMouseBehaviorRecursive(mouse_behavior_recursive: Long): Unit = {
    if (gdext.classes.Control.mb_set_mouse_behavior_recursive == null) gdext.classes.Control.mb_set_mouse_behavior_recursive = MethodBind.get("Control", "set_mouse_behavior_recursive", 849284636L)
    Ptrcall.callVoid1(gdext.classes.Control.mb_set_mouse_behavior_recursive, livePtr, mouse_behavior_recursive)
  }

  /** Control.get_mouse_behavior_recursive */
  final def getMouseBehaviorRecursive(): Long = {
    if (gdext.classes.Control.mb_get_mouse_behavior_recursive == null) gdext.classes.Control.mb_get_mouse_behavior_recursive = MethodBind.get("Control", "get_mouse_behavior_recursive", 3779367402L)
    Ptrcall.call0[Long](gdext.classes.Control.mb_get_mouse_behavior_recursive, livePtr)
  }

  /** Control.set_force_pass_scroll_events */
  final def setForcePassScrollEvents(force_pass_scroll_events: Boolean): Unit = {
    if (gdext.classes.Control.mb_set_force_pass_scroll_events == null) gdext.classes.Control.mb_set_force_pass_scroll_events = MethodBind.get("Control", "set_force_pass_scroll_events", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Control.mb_set_force_pass_scroll_events, livePtr, force_pass_scroll_events)
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
  final def setLayoutDirection(direction: Long): Unit = {
    if (gdext.classes.Control.mb_set_layout_direction == null) gdext.classes.Control.mb_set_layout_direction = MethodBind.get("Control", "set_layout_direction", 3310692370L)
    Ptrcall.callVoid1(gdext.classes.Control.mb_set_layout_direction, livePtr, direction)
  }

  /** Control.get_layout_direction */
  final def getLayoutDirection(): Long = {
    if (gdext.classes.Control.mb_get_layout_direction == null) gdext.classes.Control.mb_get_layout_direction = MethodBind.get("Control", "get_layout_direction", 1546772008L)
    Ptrcall.call0[Long](gdext.classes.Control.mb_get_layout_direction, livePtr)
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
}
