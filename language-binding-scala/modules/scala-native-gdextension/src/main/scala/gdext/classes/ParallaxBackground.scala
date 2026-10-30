package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `ParallaxBackground`, extends `CanvasLayer`. */
abstract class ParallaxBackground extends CanvasLayer {
  override def godotClassName: String = "ParallaxBackground"

  /** ParallaxBackground.set_scroll_offset */
  final def setScrollOffset(offset: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.ParallaxBackground.mb_set_scroll_offset == null) gdext.classes.ParallaxBackground.mb_set_scroll_offset = MethodBind.get("ParallaxBackground", "set_scroll_offset", 743155724L)
    Ptrcall.callVoid1(gdext.classes.ParallaxBackground.mb_set_scroll_offset, livePtr, offset)
  }

  /** ParallaxBackground.get_scroll_offset */
  final def getScrollOffset(): gdext.builtin.Vector2 = {
    if (gdext.classes.ParallaxBackground.mb_get_scroll_offset == null) gdext.classes.ParallaxBackground.mb_get_scroll_offset = MethodBind.get("ParallaxBackground", "get_scroll_offset", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.ParallaxBackground.mb_get_scroll_offset, livePtr)
  }

  /** ParallaxBackground.set_scroll_base_offset */
  final def setScrollBaseOffset(offset: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.ParallaxBackground.mb_set_scroll_base_offset == null) gdext.classes.ParallaxBackground.mb_set_scroll_base_offset = MethodBind.get("ParallaxBackground", "set_scroll_base_offset", 743155724L)
    Ptrcall.callVoid1(gdext.classes.ParallaxBackground.mb_set_scroll_base_offset, livePtr, offset)
  }

  /** ParallaxBackground.get_scroll_base_offset */
  final def getScrollBaseOffset(): gdext.builtin.Vector2 = {
    if (gdext.classes.ParallaxBackground.mb_get_scroll_base_offset == null) gdext.classes.ParallaxBackground.mb_get_scroll_base_offset = MethodBind.get("ParallaxBackground", "get_scroll_base_offset", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.ParallaxBackground.mb_get_scroll_base_offset, livePtr)
  }

  /** ParallaxBackground.set_scroll_base_scale */
  final def setScrollBaseScale(scale: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.ParallaxBackground.mb_set_scroll_base_scale == null) gdext.classes.ParallaxBackground.mb_set_scroll_base_scale = MethodBind.get("ParallaxBackground", "set_scroll_base_scale", 743155724L)
    Ptrcall.callVoid1(gdext.classes.ParallaxBackground.mb_set_scroll_base_scale, livePtr, scale)
  }

  /** ParallaxBackground.get_scroll_base_scale */
  final def getScrollBaseScale(): gdext.builtin.Vector2 = {
    if (gdext.classes.ParallaxBackground.mb_get_scroll_base_scale == null) gdext.classes.ParallaxBackground.mb_get_scroll_base_scale = MethodBind.get("ParallaxBackground", "get_scroll_base_scale", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.ParallaxBackground.mb_get_scroll_base_scale, livePtr)
  }

  /** ParallaxBackground.set_limit_begin */
  final def setLimitBegin(offset: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.ParallaxBackground.mb_set_limit_begin == null) gdext.classes.ParallaxBackground.mb_set_limit_begin = MethodBind.get("ParallaxBackground", "set_limit_begin", 743155724L)
    Ptrcall.callVoid1(gdext.classes.ParallaxBackground.mb_set_limit_begin, livePtr, offset)
  }

  /** ParallaxBackground.get_limit_begin */
  final def getLimitBegin(): gdext.builtin.Vector2 = {
    if (gdext.classes.ParallaxBackground.mb_get_limit_begin == null) gdext.classes.ParallaxBackground.mb_get_limit_begin = MethodBind.get("ParallaxBackground", "get_limit_begin", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.ParallaxBackground.mb_get_limit_begin, livePtr)
  }

  /** ParallaxBackground.set_limit_end */
  final def setLimitEnd(offset: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.ParallaxBackground.mb_set_limit_end == null) gdext.classes.ParallaxBackground.mb_set_limit_end = MethodBind.get("ParallaxBackground", "set_limit_end", 743155724L)
    Ptrcall.callVoid1(gdext.classes.ParallaxBackground.mb_set_limit_end, livePtr, offset)
  }

  /** ParallaxBackground.get_limit_end */
  final def getLimitEnd(): gdext.builtin.Vector2 = {
    if (gdext.classes.ParallaxBackground.mb_get_limit_end == null) gdext.classes.ParallaxBackground.mb_get_limit_end = MethodBind.get("ParallaxBackground", "get_limit_end", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.ParallaxBackground.mb_get_limit_end, livePtr)
  }

  /** ParallaxBackground.set_ignore_camera_zoom */
  final def setIgnoreCameraZoom(ignore: Boolean): Unit = {
    if (gdext.classes.ParallaxBackground.mb_set_ignore_camera_zoom == null) gdext.classes.ParallaxBackground.mb_set_ignore_camera_zoom = MethodBind.get("ParallaxBackground", "set_ignore_camera_zoom", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.ParallaxBackground.mb_set_ignore_camera_zoom, livePtr, ignore)
  }

  /** ParallaxBackground.is_ignore_camera_zoom */
  final def isIgnoreCameraZoom(): Boolean = {
    if (gdext.classes.ParallaxBackground.mb_is_ignore_camera_zoom == null) gdext.classes.ParallaxBackground.mb_is_ignore_camera_zoom = MethodBind.get("ParallaxBackground", "is_ignore_camera_zoom", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.ParallaxBackground.mb_is_ignore_camera_zoom, livePtr)
  }

}

object ParallaxBackground {
  private[classes] var mb_set_scroll_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_scroll_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_scroll_base_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_scroll_base_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_scroll_base_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_scroll_base_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_limit_begin: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_limit_begin: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_limit_end: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_limit_end: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_ignore_camera_zoom: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_ignore_camera_zoom: GDExtensionMethodBindPtr = null
}
