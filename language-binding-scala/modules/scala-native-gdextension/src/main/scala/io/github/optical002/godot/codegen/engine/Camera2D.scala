package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `Camera2D`, extends `Node2D`. */
abstract class Camera2D extends Node2D {

  /** Camera2D.set_offset */
  final def setOffset(offset: io.github.optical002.godot.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("Camera2D", "set_offset", 743155724L), hostObject.objectPtr, offset)

  /** Camera2D.get_offset */
  final def getOffset(): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector2](MethodBind.get("Camera2D", "get_offset", 3341600327L), hostObject.objectPtr)

  /** Camera2D.set_anchor_mode */
  final def setAnchorMode(anchor_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Camera2D", "set_anchor_mode", 2050398218L), hostObject.objectPtr, anchor_mode)

  /** Camera2D.get_anchor_mode */
  final def getAnchorMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("Camera2D", "get_anchor_mode", 155978067L), hostObject.objectPtr)

  /** Camera2D.set_ignore_rotation */
  final def setIgnoreRotation(ignore: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Camera2D", "set_ignore_rotation", 2586408642L), hostObject.objectPtr, ignore)

  /** Camera2D.is_ignoring_rotation */
  final def isIgnoringRotation(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Camera2D", "is_ignoring_rotation", 36873697L), hostObject.objectPtr)

  /** Camera2D.set_process_callback */
  final def setProcessCallback(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Camera2D", "set_process_callback", 4201947462L), hostObject.objectPtr, mode)

  /** Camera2D.get_process_callback */
  final def getProcessCallback(): Long =
    Ptrcall.call0[Long](MethodBind.get("Camera2D", "get_process_callback", 2325344499L), hostObject.objectPtr)

  /** Camera2D.set_enabled */
  final def setEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Camera2D", "set_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** Camera2D.is_enabled */
  final def isEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Camera2D", "is_enabled", 36873697L), hostObject.objectPtr)

  /** Camera2D.make_current */
  final def makeCurrent(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Camera2D", "make_current", 3218959716L), hostObject.objectPtr)

  /** Camera2D.is_current */
  final def isCurrent(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Camera2D", "is_current", 36873697L), hostObject.objectPtr)

  /** Camera2D.set_limit_enabled */
  final def setLimitEnabled(limit_enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Camera2D", "set_limit_enabled", 2586408642L), hostObject.objectPtr, limit_enabled)

  /** Camera2D.is_limit_enabled */
  final def isLimitEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Camera2D", "is_limit_enabled", 36873697L), hostObject.objectPtr)

  /** Camera2D.set_limit */
  final def setLimit(margin: Long, limit: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("Camera2D", "set_limit", 437707142L), hostObject.objectPtr, margin, limit)

  /** Camera2D.get_limit */
  final def getLimit(margin: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("Camera2D", "get_limit", 1983885014L), hostObject.objectPtr, margin)

  /** Camera2D.set_limit_smoothing_enabled */
  final def setLimitSmoothingEnabled(limit_smoothing_enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Camera2D", "set_limit_smoothing_enabled", 2586408642L), hostObject.objectPtr, limit_smoothing_enabled)

  /** Camera2D.is_limit_smoothing_enabled */
  final def isLimitSmoothingEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Camera2D", "is_limit_smoothing_enabled", 36873697L), hostObject.objectPtr)

  /** Camera2D.set_drag_vertical_enabled */
  final def setDragVerticalEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Camera2D", "set_drag_vertical_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** Camera2D.is_drag_vertical_enabled */
  final def isDragVerticalEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Camera2D", "is_drag_vertical_enabled", 36873697L), hostObject.objectPtr)

  /** Camera2D.set_drag_horizontal_enabled */
  final def setDragHorizontalEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Camera2D", "set_drag_horizontal_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** Camera2D.is_drag_horizontal_enabled */
  final def isDragHorizontalEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Camera2D", "is_drag_horizontal_enabled", 36873697L), hostObject.objectPtr)

  /** Camera2D.set_drag_vertical_offset */
  final def setDragVerticalOffset(offset: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Camera2D", "set_drag_vertical_offset", 373806689L), hostObject.objectPtr, offset)

  /** Camera2D.get_drag_vertical_offset */
  final def getDragVerticalOffset(): Double =
    Ptrcall.call0[Double](MethodBind.get("Camera2D", "get_drag_vertical_offset", 1740695150L), hostObject.objectPtr)

  /** Camera2D.set_drag_horizontal_offset */
  final def setDragHorizontalOffset(offset: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Camera2D", "set_drag_horizontal_offset", 373806689L), hostObject.objectPtr, offset)

  /** Camera2D.get_drag_horizontal_offset */
  final def getDragHorizontalOffset(): Double =
    Ptrcall.call0[Double](MethodBind.get("Camera2D", "get_drag_horizontal_offset", 1740695150L), hostObject.objectPtr)

  /** Camera2D.set_drag_margin */
  final def setDragMargin(margin: Long, drag_margin: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("Camera2D", "set_drag_margin", 4290182280L), hostObject.objectPtr, margin, drag_margin)

  /** Camera2D.get_drag_margin */
  final def getDragMargin(margin: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("Camera2D", "get_drag_margin", 2869120046L), hostObject.objectPtr, margin)

  /** Camera2D.get_target_position */
  final def getTargetPosition(): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector2](MethodBind.get("Camera2D", "get_target_position", 3341600327L), hostObject.objectPtr)

  /** Camera2D.get_screen_center_position */
  final def getScreenCenterPosition(): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector2](MethodBind.get("Camera2D", "get_screen_center_position", 3341600327L), hostObject.objectPtr)

  /** Camera2D.get_screen_rotation */
  final def getScreenRotation(): Double =
    Ptrcall.call0[Double](MethodBind.get("Camera2D", "get_screen_rotation", 1740695150L), hostObject.objectPtr)

  /** Camera2D.set_zoom */
  final def setZoom(zoom: io.github.optical002.godot.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("Camera2D", "set_zoom", 743155724L), hostObject.objectPtr, zoom)

  /** Camera2D.get_zoom */
  final def getZoom(): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector2](MethodBind.get("Camera2D", "get_zoom", 3341600327L), hostObject.objectPtr)

  /** Camera2D.set_custom_viewport */
  final def setCustomViewport(viewport: Node): Unit =
    Ptrcall.callVoid1(MethodBind.get("Camera2D", "set_custom_viewport", 1078189570L), hostObject.objectPtr, viewport.hostObject)

  /** Camera2D.get_custom_viewport */
  final def getCustomViewport(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Camera2D", "get_custom_viewport", 3160264692L), hostObject.objectPtr)

  /** Camera2D.set_position_smoothing_speed */
  final def setPositionSmoothingSpeed(position_smoothing_speed: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Camera2D", "set_position_smoothing_speed", 373806689L), hostObject.objectPtr, position_smoothing_speed)

  /** Camera2D.get_position_smoothing_speed */
  final def getPositionSmoothingSpeed(): Double =
    Ptrcall.call0[Double](MethodBind.get("Camera2D", "get_position_smoothing_speed", 1740695150L), hostObject.objectPtr)

  /** Camera2D.set_position_smoothing_enabled */
  final def setPositionSmoothingEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Camera2D", "set_position_smoothing_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** Camera2D.is_position_smoothing_enabled */
  final def isPositionSmoothingEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Camera2D", "is_position_smoothing_enabled", 36873697L), hostObject.objectPtr)

  /** Camera2D.set_rotation_smoothing_enabled */
  final def setRotationSmoothingEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Camera2D", "set_rotation_smoothing_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** Camera2D.is_rotation_smoothing_enabled */
  final def isRotationSmoothingEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Camera2D", "is_rotation_smoothing_enabled", 36873697L), hostObject.objectPtr)

  /** Camera2D.set_rotation_smoothing_speed */
  final def setRotationSmoothingSpeed(speed: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Camera2D", "set_rotation_smoothing_speed", 373806689L), hostObject.objectPtr, speed)

  /** Camera2D.get_rotation_smoothing_speed */
  final def getRotationSmoothingSpeed(): Double =
    Ptrcall.call0[Double](MethodBind.get("Camera2D", "get_rotation_smoothing_speed", 1740695150L), hostObject.objectPtr)

  /** Camera2D.force_update_scroll */
  final def forceUpdateScroll(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Camera2D", "force_update_scroll", 3218959716L), hostObject.objectPtr)

  /** Camera2D.reset_smoothing */
  final def resetSmoothing(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Camera2D", "reset_smoothing", 3218959716L), hostObject.objectPtr)

  /** Camera2D.align */
  final def align(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Camera2D", "align", 3218959716L), hostObject.objectPtr)

  /** Camera2D.set_screen_drawing_enabled */
  final def setScreenDrawingEnabled(screen_drawing_enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Camera2D", "set_screen_drawing_enabled", 2586408642L), hostObject.objectPtr, screen_drawing_enabled)

  /** Camera2D.is_screen_drawing_enabled */
  final def isScreenDrawingEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Camera2D", "is_screen_drawing_enabled", 36873697L), hostObject.objectPtr)

  /** Camera2D.set_limit_drawing_enabled */
  final def setLimitDrawingEnabled(limit_drawing_enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Camera2D", "set_limit_drawing_enabled", 2586408642L), hostObject.objectPtr, limit_drawing_enabled)

  /** Camera2D.is_limit_drawing_enabled */
  final def isLimitDrawingEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Camera2D", "is_limit_drawing_enabled", 36873697L), hostObject.objectPtr)

  /** Camera2D.set_margin_drawing_enabled */
  final def setMarginDrawingEnabled(margin_drawing_enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Camera2D", "set_margin_drawing_enabled", 2586408642L), hostObject.objectPtr, margin_drawing_enabled)

  /** Camera2D.is_margin_drawing_enabled */
  final def isMarginDrawingEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Camera2D", "is_margin_drawing_enabled", 36873697L), hostObject.objectPtr)

}

object Camera2D {
  /** Class metadata for Gd[Camera2D] lifetime management and casting. */
  given GodotClass[Camera2D] with {
    def className = "Camera2D"
    def isRefCounted = false
    def wrap(o: GodotObject): Camera2D = new Camera2D {}.withHost(o.objectPtr)
    def unwrap(t: Camera2D): GodotObject = t.hostObject
  }
}
