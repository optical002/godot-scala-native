package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Camera2D`, extends `Node2D`. */
abstract class Camera2D extends Node2D {
  override def godotClassName: String = "Camera2D"

  /** Camera2D.set_offset */
  final def setOffset(offset: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.Camera2D.mb_set_offset == null) gdext.classes.Camera2D.mb_set_offset = MethodBind.get("Camera2D", "set_offset", 743155724L)
    Ptrcall.callVoid1(gdext.classes.Camera2D.mb_set_offset, livePtr, offset)
  }

  /** Camera2D.get_offset */
  final def getOffset(): gdext.builtin.Vector2 = {
    if (gdext.classes.Camera2D.mb_get_offset == null) gdext.classes.Camera2D.mb_get_offset = MethodBind.get("Camera2D", "get_offset", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.Camera2D.mb_get_offset, livePtr)
  }

  /** Camera2D.set_anchor_mode */
  final def setAnchorMode(anchor_mode: Long): Unit = {
    if (gdext.classes.Camera2D.mb_set_anchor_mode == null) gdext.classes.Camera2D.mb_set_anchor_mode = MethodBind.get("Camera2D", "set_anchor_mode", 2050398218L)
    Ptrcall.callVoid1(gdext.classes.Camera2D.mb_set_anchor_mode, livePtr, anchor_mode)
  }

  /** Camera2D.get_anchor_mode */
  final def getAnchorMode(): Long = {
    if (gdext.classes.Camera2D.mb_get_anchor_mode == null) gdext.classes.Camera2D.mb_get_anchor_mode = MethodBind.get("Camera2D", "get_anchor_mode", 155978067L)
    Ptrcall.call0[Long](gdext.classes.Camera2D.mb_get_anchor_mode, livePtr)
  }

  /** Camera2D.set_ignore_rotation */
  final def setIgnoreRotation(ignore: Boolean): Unit = {
    if (gdext.classes.Camera2D.mb_set_ignore_rotation == null) gdext.classes.Camera2D.mb_set_ignore_rotation = MethodBind.get("Camera2D", "set_ignore_rotation", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Camera2D.mb_set_ignore_rotation, livePtr, ignore)
  }

  /** Camera2D.is_ignoring_rotation */
  final def isIgnoringRotation(): Boolean = {
    if (gdext.classes.Camera2D.mb_is_ignoring_rotation == null) gdext.classes.Camera2D.mb_is_ignoring_rotation = MethodBind.get("Camera2D", "is_ignoring_rotation", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Camera2D.mb_is_ignoring_rotation, livePtr)
  }

  /** Camera2D.set_process_callback */
  final def setProcessCallback(mode: Long): Unit = {
    if (gdext.classes.Camera2D.mb_set_process_callback == null) gdext.classes.Camera2D.mb_set_process_callback = MethodBind.get("Camera2D", "set_process_callback", 4201947462L)
    Ptrcall.callVoid1(gdext.classes.Camera2D.mb_set_process_callback, livePtr, mode)
  }

  /** Camera2D.get_process_callback */
  final def getProcessCallback(): Long = {
    if (gdext.classes.Camera2D.mb_get_process_callback == null) gdext.classes.Camera2D.mb_get_process_callback = MethodBind.get("Camera2D", "get_process_callback", 2325344499L)
    Ptrcall.call0[Long](gdext.classes.Camera2D.mb_get_process_callback, livePtr)
  }

  /** Camera2D.set_enabled */
  final def setEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.Camera2D.mb_set_enabled == null) gdext.classes.Camera2D.mb_set_enabled = MethodBind.get("Camera2D", "set_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Camera2D.mb_set_enabled, livePtr, enabled)
  }

  /** Camera2D.is_enabled */
  final def isEnabled(): Boolean = {
    if (gdext.classes.Camera2D.mb_is_enabled == null) gdext.classes.Camera2D.mb_is_enabled = MethodBind.get("Camera2D", "is_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Camera2D.mb_is_enabled, livePtr)
  }

  /** Camera2D.make_current */
  final def makeCurrent(): Unit = {
    if (gdext.classes.Camera2D.mb_make_current == null) gdext.classes.Camera2D.mb_make_current = MethodBind.get("Camera2D", "make_current", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Camera2D.mb_make_current, livePtr)
  }

  /** Camera2D.is_current */
  final def isCurrent(): Boolean = {
    if (gdext.classes.Camera2D.mb_is_current == null) gdext.classes.Camera2D.mb_is_current = MethodBind.get("Camera2D", "is_current", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Camera2D.mb_is_current, livePtr)
  }

  /** Camera2D.set_limit_enabled */
  final def setLimitEnabled(limit_enabled: Boolean): Unit = {
    if (gdext.classes.Camera2D.mb_set_limit_enabled == null) gdext.classes.Camera2D.mb_set_limit_enabled = MethodBind.get("Camera2D", "set_limit_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Camera2D.mb_set_limit_enabled, livePtr, limit_enabled)
  }

  /** Camera2D.is_limit_enabled */
  final def isLimitEnabled(): Boolean = {
    if (gdext.classes.Camera2D.mb_is_limit_enabled == null) gdext.classes.Camera2D.mb_is_limit_enabled = MethodBind.get("Camera2D", "is_limit_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Camera2D.mb_is_limit_enabled, livePtr)
  }

  /** Camera2D.set_limit */
  final def setLimit(margin: Long, limit: Long): Unit = {
    if (gdext.classes.Camera2D.mb_set_limit == null) gdext.classes.Camera2D.mb_set_limit = MethodBind.get("Camera2D", "set_limit", 437707142L)
    Ptrcall.callVoid2(gdext.classes.Camera2D.mb_set_limit, livePtr, margin, limit)
  }

  /** Camera2D.get_limit */
  final def getLimit(margin: Long): Long = {
    if (gdext.classes.Camera2D.mb_get_limit == null) gdext.classes.Camera2D.mb_get_limit = MethodBind.get("Camera2D", "get_limit", 1983885014L)
    Ptrcall.call1[Long, Long](gdext.classes.Camera2D.mb_get_limit, livePtr, margin)
  }

  /** Camera2D.set_limit_smoothing_enabled */
  final def setLimitSmoothingEnabled(limit_smoothing_enabled: Boolean): Unit = {
    if (gdext.classes.Camera2D.mb_set_limit_smoothing_enabled == null) gdext.classes.Camera2D.mb_set_limit_smoothing_enabled = MethodBind.get("Camera2D", "set_limit_smoothing_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Camera2D.mb_set_limit_smoothing_enabled, livePtr, limit_smoothing_enabled)
  }

  /** Camera2D.is_limit_smoothing_enabled */
  final def isLimitSmoothingEnabled(): Boolean = {
    if (gdext.classes.Camera2D.mb_is_limit_smoothing_enabled == null) gdext.classes.Camera2D.mb_is_limit_smoothing_enabled = MethodBind.get("Camera2D", "is_limit_smoothing_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Camera2D.mb_is_limit_smoothing_enabled, livePtr)
  }

  /** Camera2D.set_drag_vertical_enabled */
  final def setDragVerticalEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.Camera2D.mb_set_drag_vertical_enabled == null) gdext.classes.Camera2D.mb_set_drag_vertical_enabled = MethodBind.get("Camera2D", "set_drag_vertical_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Camera2D.mb_set_drag_vertical_enabled, livePtr, enabled)
  }

  /** Camera2D.is_drag_vertical_enabled */
  final def isDragVerticalEnabled(): Boolean = {
    if (gdext.classes.Camera2D.mb_is_drag_vertical_enabled == null) gdext.classes.Camera2D.mb_is_drag_vertical_enabled = MethodBind.get("Camera2D", "is_drag_vertical_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Camera2D.mb_is_drag_vertical_enabled, livePtr)
  }

  /** Camera2D.set_drag_horizontal_enabled */
  final def setDragHorizontalEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.Camera2D.mb_set_drag_horizontal_enabled == null) gdext.classes.Camera2D.mb_set_drag_horizontal_enabled = MethodBind.get("Camera2D", "set_drag_horizontal_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Camera2D.mb_set_drag_horizontal_enabled, livePtr, enabled)
  }

  /** Camera2D.is_drag_horizontal_enabled */
  final def isDragHorizontalEnabled(): Boolean = {
    if (gdext.classes.Camera2D.mb_is_drag_horizontal_enabled == null) gdext.classes.Camera2D.mb_is_drag_horizontal_enabled = MethodBind.get("Camera2D", "is_drag_horizontal_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Camera2D.mb_is_drag_horizontal_enabled, livePtr)
  }

  /** Camera2D.set_drag_vertical_offset */
  final def setDragVerticalOffset(offset: Double): Unit = {
    if (gdext.classes.Camera2D.mb_set_drag_vertical_offset == null) gdext.classes.Camera2D.mb_set_drag_vertical_offset = MethodBind.get("Camera2D", "set_drag_vertical_offset", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Camera2D.mb_set_drag_vertical_offset, livePtr, offset)
  }

  /** Camera2D.get_drag_vertical_offset */
  final def getDragVerticalOffset(): Double = {
    if (gdext.classes.Camera2D.mb_get_drag_vertical_offset == null) gdext.classes.Camera2D.mb_get_drag_vertical_offset = MethodBind.get("Camera2D", "get_drag_vertical_offset", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Camera2D.mb_get_drag_vertical_offset, livePtr)
  }

  /** Camera2D.set_drag_horizontal_offset */
  final def setDragHorizontalOffset(offset: Double): Unit = {
    if (gdext.classes.Camera2D.mb_set_drag_horizontal_offset == null) gdext.classes.Camera2D.mb_set_drag_horizontal_offset = MethodBind.get("Camera2D", "set_drag_horizontal_offset", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Camera2D.mb_set_drag_horizontal_offset, livePtr, offset)
  }

  /** Camera2D.get_drag_horizontal_offset */
  final def getDragHorizontalOffset(): Double = {
    if (gdext.classes.Camera2D.mb_get_drag_horizontal_offset == null) gdext.classes.Camera2D.mb_get_drag_horizontal_offset = MethodBind.get("Camera2D", "get_drag_horizontal_offset", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Camera2D.mb_get_drag_horizontal_offset, livePtr)
  }

  /** Camera2D.set_drag_margin */
  final def setDragMargin(margin: Long, drag_margin: Double): Unit = {
    if (gdext.classes.Camera2D.mb_set_drag_margin == null) gdext.classes.Camera2D.mb_set_drag_margin = MethodBind.get("Camera2D", "set_drag_margin", 4290182280L)
    Ptrcall.callVoid2(gdext.classes.Camera2D.mb_set_drag_margin, livePtr, margin, drag_margin)
  }

  /** Camera2D.get_drag_margin */
  final def getDragMargin(margin: Long): Double = {
    if (gdext.classes.Camera2D.mb_get_drag_margin == null) gdext.classes.Camera2D.mb_get_drag_margin = MethodBind.get("Camera2D", "get_drag_margin", 2869120046L)
    Ptrcall.call1[Long, Double](gdext.classes.Camera2D.mb_get_drag_margin, livePtr, margin)
  }

  /** Camera2D.get_target_position */
  final def getTargetPosition(): gdext.builtin.Vector2 = {
    if (gdext.classes.Camera2D.mb_get_target_position == null) gdext.classes.Camera2D.mb_get_target_position = MethodBind.get("Camera2D", "get_target_position", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.Camera2D.mb_get_target_position, livePtr)
  }

  /** Camera2D.get_screen_center_position */
  final def getScreenCenterPosition(): gdext.builtin.Vector2 = {
    if (gdext.classes.Camera2D.mb_get_screen_center_position == null) gdext.classes.Camera2D.mb_get_screen_center_position = MethodBind.get("Camera2D", "get_screen_center_position", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.Camera2D.mb_get_screen_center_position, livePtr)
  }

  /** Camera2D.get_screen_rotation */
  final def getScreenRotation(): Double = {
    if (gdext.classes.Camera2D.mb_get_screen_rotation == null) gdext.classes.Camera2D.mb_get_screen_rotation = MethodBind.get("Camera2D", "get_screen_rotation", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Camera2D.mb_get_screen_rotation, livePtr)
  }

  /** Camera2D.set_zoom */
  final def setZoom(zoom: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.Camera2D.mb_set_zoom == null) gdext.classes.Camera2D.mb_set_zoom = MethodBind.get("Camera2D", "set_zoom", 743155724L)
    Ptrcall.callVoid1(gdext.classes.Camera2D.mb_set_zoom, livePtr, zoom)
  }

  /** Camera2D.get_zoom */
  final def getZoom(): gdext.builtin.Vector2 = {
    if (gdext.classes.Camera2D.mb_get_zoom == null) gdext.classes.Camera2D.mb_get_zoom = MethodBind.get("Camera2D", "get_zoom", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.Camera2D.mb_get_zoom, livePtr)
  }

  /** Camera2D.set_custom_viewport */
  final def setCustomViewport(viewport: Node): Unit = {
    if (gdext.classes.Camera2D.mb_set_custom_viewport == null) gdext.classes.Camera2D.mb_set_custom_viewport = MethodBind.get("Camera2D", "set_custom_viewport", 1078189570L)
    Ptrcall.callVoid1(gdext.classes.Camera2D.mb_set_custom_viewport, livePtr, Wrappers.handle(viewport))
  }

  /** Camera2D.get_custom_viewport */
  final def getCustomViewport(): Node = {
    if (gdext.classes.Camera2D.mb_get_custom_viewport == null) gdext.classes.Camera2D.mb_get_custom_viewport = MethodBind.get("Camera2D", "get_custom_viewport", 3160264692L)
    Wrappers.borrowed[Node](Ptrcall.call0[Long](gdext.classes.Camera2D.mb_get_custom_viewport, livePtr))
  }

  /** Camera2D.set_position_smoothing_speed */
  final def setPositionSmoothingSpeed(position_smoothing_speed: Double): Unit = {
    if (gdext.classes.Camera2D.mb_set_position_smoothing_speed == null) gdext.classes.Camera2D.mb_set_position_smoothing_speed = MethodBind.get("Camera2D", "set_position_smoothing_speed", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Camera2D.mb_set_position_smoothing_speed, livePtr, position_smoothing_speed)
  }

  /** Camera2D.get_position_smoothing_speed */
  final def getPositionSmoothingSpeed(): Double = {
    if (gdext.classes.Camera2D.mb_get_position_smoothing_speed == null) gdext.classes.Camera2D.mb_get_position_smoothing_speed = MethodBind.get("Camera2D", "get_position_smoothing_speed", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Camera2D.mb_get_position_smoothing_speed, livePtr)
  }

  /** Camera2D.set_position_smoothing_enabled */
  final def setPositionSmoothingEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.Camera2D.mb_set_position_smoothing_enabled == null) gdext.classes.Camera2D.mb_set_position_smoothing_enabled = MethodBind.get("Camera2D", "set_position_smoothing_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Camera2D.mb_set_position_smoothing_enabled, livePtr, enabled)
  }

  /** Camera2D.is_position_smoothing_enabled */
  final def isPositionSmoothingEnabled(): Boolean = {
    if (gdext.classes.Camera2D.mb_is_position_smoothing_enabled == null) gdext.classes.Camera2D.mb_is_position_smoothing_enabled = MethodBind.get("Camera2D", "is_position_smoothing_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Camera2D.mb_is_position_smoothing_enabled, livePtr)
  }

  /** Camera2D.set_rotation_smoothing_enabled */
  final def setRotationSmoothingEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.Camera2D.mb_set_rotation_smoothing_enabled == null) gdext.classes.Camera2D.mb_set_rotation_smoothing_enabled = MethodBind.get("Camera2D", "set_rotation_smoothing_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Camera2D.mb_set_rotation_smoothing_enabled, livePtr, enabled)
  }

  /** Camera2D.is_rotation_smoothing_enabled */
  final def isRotationSmoothingEnabled(): Boolean = {
    if (gdext.classes.Camera2D.mb_is_rotation_smoothing_enabled == null) gdext.classes.Camera2D.mb_is_rotation_smoothing_enabled = MethodBind.get("Camera2D", "is_rotation_smoothing_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Camera2D.mb_is_rotation_smoothing_enabled, livePtr)
  }

  /** Camera2D.set_rotation_smoothing_speed */
  final def setRotationSmoothingSpeed(speed: Double): Unit = {
    if (gdext.classes.Camera2D.mb_set_rotation_smoothing_speed == null) gdext.classes.Camera2D.mb_set_rotation_smoothing_speed = MethodBind.get("Camera2D", "set_rotation_smoothing_speed", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Camera2D.mb_set_rotation_smoothing_speed, livePtr, speed)
  }

  /** Camera2D.get_rotation_smoothing_speed */
  final def getRotationSmoothingSpeed(): Double = {
    if (gdext.classes.Camera2D.mb_get_rotation_smoothing_speed == null) gdext.classes.Camera2D.mb_get_rotation_smoothing_speed = MethodBind.get("Camera2D", "get_rotation_smoothing_speed", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Camera2D.mb_get_rotation_smoothing_speed, livePtr)
  }

  /** Camera2D.force_update_scroll */
  final def forceUpdateScroll(): Unit = {
    if (gdext.classes.Camera2D.mb_force_update_scroll == null) gdext.classes.Camera2D.mb_force_update_scroll = MethodBind.get("Camera2D", "force_update_scroll", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Camera2D.mb_force_update_scroll, livePtr)
  }

  /** Camera2D.reset_smoothing */
  final def resetSmoothing(): Unit = {
    if (gdext.classes.Camera2D.mb_reset_smoothing == null) gdext.classes.Camera2D.mb_reset_smoothing = MethodBind.get("Camera2D", "reset_smoothing", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Camera2D.mb_reset_smoothing, livePtr)
  }

  /** Camera2D.align */
  final def align(): Unit = {
    if (gdext.classes.Camera2D.mb_align == null) gdext.classes.Camera2D.mb_align = MethodBind.get("Camera2D", "align", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Camera2D.mb_align, livePtr)
  }

  /** Camera2D.set_screen_drawing_enabled */
  final def setScreenDrawingEnabled(screen_drawing_enabled: Boolean): Unit = {
    if (gdext.classes.Camera2D.mb_set_screen_drawing_enabled == null) gdext.classes.Camera2D.mb_set_screen_drawing_enabled = MethodBind.get("Camera2D", "set_screen_drawing_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Camera2D.mb_set_screen_drawing_enabled, livePtr, screen_drawing_enabled)
  }

  /** Camera2D.is_screen_drawing_enabled */
  final def isScreenDrawingEnabled(): Boolean = {
    if (gdext.classes.Camera2D.mb_is_screen_drawing_enabled == null) gdext.classes.Camera2D.mb_is_screen_drawing_enabled = MethodBind.get("Camera2D", "is_screen_drawing_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Camera2D.mb_is_screen_drawing_enabled, livePtr)
  }

  /** Camera2D.set_limit_drawing_enabled */
  final def setLimitDrawingEnabled(limit_drawing_enabled: Boolean): Unit = {
    if (gdext.classes.Camera2D.mb_set_limit_drawing_enabled == null) gdext.classes.Camera2D.mb_set_limit_drawing_enabled = MethodBind.get("Camera2D", "set_limit_drawing_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Camera2D.mb_set_limit_drawing_enabled, livePtr, limit_drawing_enabled)
  }

  /** Camera2D.is_limit_drawing_enabled */
  final def isLimitDrawingEnabled(): Boolean = {
    if (gdext.classes.Camera2D.mb_is_limit_drawing_enabled == null) gdext.classes.Camera2D.mb_is_limit_drawing_enabled = MethodBind.get("Camera2D", "is_limit_drawing_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Camera2D.mb_is_limit_drawing_enabled, livePtr)
  }

  /** Camera2D.set_margin_drawing_enabled */
  final def setMarginDrawingEnabled(margin_drawing_enabled: Boolean): Unit = {
    if (gdext.classes.Camera2D.mb_set_margin_drawing_enabled == null) gdext.classes.Camera2D.mb_set_margin_drawing_enabled = MethodBind.get("Camera2D", "set_margin_drawing_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Camera2D.mb_set_margin_drawing_enabled, livePtr, margin_drawing_enabled)
  }

  /** Camera2D.is_margin_drawing_enabled */
  final def isMarginDrawingEnabled(): Boolean = {
    if (gdext.classes.Camera2D.mb_is_margin_drawing_enabled == null) gdext.classes.Camera2D.mb_is_margin_drawing_enabled = MethodBind.get("Camera2D", "is_margin_drawing_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Camera2D.mb_is_margin_drawing_enabled, livePtr)
  }

}

object Camera2D {
  private[classes] var mb_set_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_anchor_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_anchor_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_ignore_rotation: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_ignoring_rotation: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_process_callback: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_process_callback: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_make_current: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_current: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_limit_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_limit_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_limit: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_limit: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_limit_smoothing_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_limit_smoothing_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_drag_vertical_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_drag_vertical_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_drag_horizontal_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_drag_horizontal_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_drag_vertical_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_drag_vertical_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_drag_horizontal_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_drag_horizontal_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_drag_margin: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_drag_margin: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_target_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_screen_center_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_screen_rotation: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_zoom: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_zoom: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_custom_viewport: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_custom_viewport: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_position_smoothing_speed: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_position_smoothing_speed: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_position_smoothing_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_position_smoothing_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_rotation_smoothing_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_rotation_smoothing_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_rotation_smoothing_speed: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_rotation_smoothing_speed: GDExtensionMethodBindPtr = null
  private[classes] var mb_force_update_scroll: GDExtensionMethodBindPtr = null
  private[classes] var mb_reset_smoothing: GDExtensionMethodBindPtr = null
  private[classes] var mb_align: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_screen_drawing_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_screen_drawing_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_limit_drawing_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_limit_drawing_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_margin_drawing_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_margin_drawing_enabled: GDExtensionMethodBindPtr = null
}
