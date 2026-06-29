package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `ParallaxBackground`, extends `CanvasLayer`. */
abstract class ParallaxBackground extends CanvasLayer {
  override def godotClassName: String = "ParallaxBackground"

  /** ParallaxBackground.set_scroll_offset */
  final def setScrollOffset(offset: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("ParallaxBackground", "set_scroll_offset", 743155724L), hostObject.objectPtr, offset)

  /** ParallaxBackground.get_scroll_offset */
  final def getScrollOffset(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("ParallaxBackground", "get_scroll_offset", 3341600327L), hostObject.objectPtr)

  /** ParallaxBackground.set_scroll_base_offset */
  final def setScrollBaseOffset(offset: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("ParallaxBackground", "set_scroll_base_offset", 743155724L), hostObject.objectPtr, offset)

  /** ParallaxBackground.get_scroll_base_offset */
  final def getScrollBaseOffset(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("ParallaxBackground", "get_scroll_base_offset", 3341600327L), hostObject.objectPtr)

  /** ParallaxBackground.set_scroll_base_scale */
  final def setScrollBaseScale(scale: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("ParallaxBackground", "set_scroll_base_scale", 743155724L), hostObject.objectPtr, scale)

  /** ParallaxBackground.get_scroll_base_scale */
  final def getScrollBaseScale(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("ParallaxBackground", "get_scroll_base_scale", 3341600327L), hostObject.objectPtr)

  /** ParallaxBackground.set_limit_begin */
  final def setLimitBegin(offset: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("ParallaxBackground", "set_limit_begin", 743155724L), hostObject.objectPtr, offset)

  /** ParallaxBackground.get_limit_begin */
  final def getLimitBegin(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("ParallaxBackground", "get_limit_begin", 3341600327L), hostObject.objectPtr)

  /** ParallaxBackground.set_limit_end */
  final def setLimitEnd(offset: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("ParallaxBackground", "set_limit_end", 743155724L), hostObject.objectPtr, offset)

  /** ParallaxBackground.get_limit_end */
  final def getLimitEnd(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("ParallaxBackground", "get_limit_end", 3341600327L), hostObject.objectPtr)

  /** ParallaxBackground.set_ignore_camera_zoom */
  final def setIgnoreCameraZoom(ignore: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("ParallaxBackground", "set_ignore_camera_zoom", 2586408642L), hostObject.objectPtr, ignore)

  /** ParallaxBackground.is_ignore_camera_zoom */
  final def isIgnoreCameraZoom(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("ParallaxBackground", "is_ignore_camera_zoom", 2240911060L), hostObject.objectPtr)

}
