package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Parallax2D`, extends `Node2D`. */
abstract class Parallax2D extends Node2D {
  override def godotClassName: String = "Parallax2D"

  /** Parallax2D.set_scroll_scale */
  final def setScrollScale(scale: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.Parallax2D.mb_set_scroll_scale == null) gdext.classes.Parallax2D.mb_set_scroll_scale = MethodBind.get("Parallax2D", "set_scroll_scale", 743155724L)
    Ptrcall.callVoid1(gdext.classes.Parallax2D.mb_set_scroll_scale, livePtr, scale)
  }

  /** Parallax2D.get_scroll_scale */
  final def getScrollScale(): gdext.builtin.Vector2 = {
    if (gdext.classes.Parallax2D.mb_get_scroll_scale == null) gdext.classes.Parallax2D.mb_get_scroll_scale = MethodBind.get("Parallax2D", "get_scroll_scale", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.Parallax2D.mb_get_scroll_scale, livePtr)
  }

  /** Parallax2D.set_repeat_size */
  final def setRepeatSize(repeat_size: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.Parallax2D.mb_set_repeat_size == null) gdext.classes.Parallax2D.mb_set_repeat_size = MethodBind.get("Parallax2D", "set_repeat_size", 743155724L)
    Ptrcall.callVoid1(gdext.classes.Parallax2D.mb_set_repeat_size, livePtr, repeat_size)
  }

  /** Parallax2D.get_repeat_size */
  final def getRepeatSize(): gdext.builtin.Vector2 = {
    if (gdext.classes.Parallax2D.mb_get_repeat_size == null) gdext.classes.Parallax2D.mb_get_repeat_size = MethodBind.get("Parallax2D", "get_repeat_size", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.Parallax2D.mb_get_repeat_size, livePtr)
  }

  /** Parallax2D.set_repeat_times */
  final def setRepeatTimes(repeat_times: Long): Unit = {
    if (gdext.classes.Parallax2D.mb_set_repeat_times == null) gdext.classes.Parallax2D.mb_set_repeat_times = MethodBind.get("Parallax2D", "set_repeat_times", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Parallax2D.mb_set_repeat_times, livePtr, repeat_times)
  }

  /** Parallax2D.get_repeat_times */
  final def getRepeatTimes(): Long = {
    if (gdext.classes.Parallax2D.mb_get_repeat_times == null) gdext.classes.Parallax2D.mb_get_repeat_times = MethodBind.get("Parallax2D", "get_repeat_times", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Parallax2D.mb_get_repeat_times, livePtr)
  }

  /** Parallax2D.set_autoscroll */
  final def setAutoscroll(autoscroll: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.Parallax2D.mb_set_autoscroll == null) gdext.classes.Parallax2D.mb_set_autoscroll = MethodBind.get("Parallax2D", "set_autoscroll", 743155724L)
    Ptrcall.callVoid1(gdext.classes.Parallax2D.mb_set_autoscroll, livePtr, autoscroll)
  }

  /** Parallax2D.get_autoscroll */
  final def getAutoscroll(): gdext.builtin.Vector2 = {
    if (gdext.classes.Parallax2D.mb_get_autoscroll == null) gdext.classes.Parallax2D.mb_get_autoscroll = MethodBind.get("Parallax2D", "get_autoscroll", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.Parallax2D.mb_get_autoscroll, livePtr)
  }

  /** Parallax2D.set_scroll_offset */
  final def setScrollOffset(offset: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.Parallax2D.mb_set_scroll_offset == null) gdext.classes.Parallax2D.mb_set_scroll_offset = MethodBind.get("Parallax2D", "set_scroll_offset", 743155724L)
    Ptrcall.callVoid1(gdext.classes.Parallax2D.mb_set_scroll_offset, livePtr, offset)
  }

  /** Parallax2D.get_scroll_offset */
  final def getScrollOffset(): gdext.builtin.Vector2 = {
    if (gdext.classes.Parallax2D.mb_get_scroll_offset == null) gdext.classes.Parallax2D.mb_get_scroll_offset = MethodBind.get("Parallax2D", "get_scroll_offset", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.Parallax2D.mb_get_scroll_offset, livePtr)
  }

  /** Parallax2D.set_screen_offset */
  final def setScreenOffset(offset: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.Parallax2D.mb_set_screen_offset == null) gdext.classes.Parallax2D.mb_set_screen_offset = MethodBind.get("Parallax2D", "set_screen_offset", 743155724L)
    Ptrcall.callVoid1(gdext.classes.Parallax2D.mb_set_screen_offset, livePtr, offset)
  }

  /** Parallax2D.get_screen_offset */
  final def getScreenOffset(): gdext.builtin.Vector2 = {
    if (gdext.classes.Parallax2D.mb_get_screen_offset == null) gdext.classes.Parallax2D.mb_get_screen_offset = MethodBind.get("Parallax2D", "get_screen_offset", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.Parallax2D.mb_get_screen_offset, livePtr)
  }

  /** Parallax2D.set_limit_begin */
  final def setLimitBegin(offset: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.Parallax2D.mb_set_limit_begin == null) gdext.classes.Parallax2D.mb_set_limit_begin = MethodBind.get("Parallax2D", "set_limit_begin", 743155724L)
    Ptrcall.callVoid1(gdext.classes.Parallax2D.mb_set_limit_begin, livePtr, offset)
  }

  /** Parallax2D.get_limit_begin */
  final def getLimitBegin(): gdext.builtin.Vector2 = {
    if (gdext.classes.Parallax2D.mb_get_limit_begin == null) gdext.classes.Parallax2D.mb_get_limit_begin = MethodBind.get("Parallax2D", "get_limit_begin", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.Parallax2D.mb_get_limit_begin, livePtr)
  }

  /** Parallax2D.set_limit_end */
  final def setLimitEnd(offset: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.Parallax2D.mb_set_limit_end == null) gdext.classes.Parallax2D.mb_set_limit_end = MethodBind.get("Parallax2D", "set_limit_end", 743155724L)
    Ptrcall.callVoid1(gdext.classes.Parallax2D.mb_set_limit_end, livePtr, offset)
  }

  /** Parallax2D.get_limit_end */
  final def getLimitEnd(): gdext.builtin.Vector2 = {
    if (gdext.classes.Parallax2D.mb_get_limit_end == null) gdext.classes.Parallax2D.mb_get_limit_end = MethodBind.get("Parallax2D", "get_limit_end", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.Parallax2D.mb_get_limit_end, livePtr)
  }

  /** Parallax2D.set_follow_viewport */
  final def setFollowViewport(follow: Boolean): Unit = {
    if (gdext.classes.Parallax2D.mb_set_follow_viewport == null) gdext.classes.Parallax2D.mb_set_follow_viewport = MethodBind.get("Parallax2D", "set_follow_viewport", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Parallax2D.mb_set_follow_viewport, livePtr, follow)
  }

  /** Parallax2D.get_follow_viewport */
  final def getFollowViewport(): Boolean = {
    if (gdext.classes.Parallax2D.mb_get_follow_viewport == null) gdext.classes.Parallax2D.mb_get_follow_viewport = MethodBind.get("Parallax2D", "get_follow_viewport", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.Parallax2D.mb_get_follow_viewport, livePtr)
  }

  /** Parallax2D.set_ignore_camera_scroll */
  final def setIgnoreCameraScroll(ignore: Boolean): Unit = {
    if (gdext.classes.Parallax2D.mb_set_ignore_camera_scroll == null) gdext.classes.Parallax2D.mb_set_ignore_camera_scroll = MethodBind.get("Parallax2D", "set_ignore_camera_scroll", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Parallax2D.mb_set_ignore_camera_scroll, livePtr, ignore)
  }

  /** Parallax2D.is_ignore_camera_scroll */
  final def isIgnoreCameraScroll(): Boolean = {
    if (gdext.classes.Parallax2D.mb_is_ignore_camera_scroll == null) gdext.classes.Parallax2D.mb_is_ignore_camera_scroll = MethodBind.get("Parallax2D", "is_ignore_camera_scroll", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.Parallax2D.mb_is_ignore_camera_scroll, livePtr)
  }

}

object Parallax2D {
  private[classes] var mb_set_scroll_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_scroll_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_repeat_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_repeat_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_repeat_times: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_repeat_times: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_autoscroll: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_autoscroll: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_scroll_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_scroll_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_screen_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_screen_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_limit_begin: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_limit_begin: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_limit_end: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_limit_end: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_follow_viewport: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_follow_viewport: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_ignore_camera_scroll: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_ignore_camera_scroll: GDExtensionMethodBindPtr = null
}
