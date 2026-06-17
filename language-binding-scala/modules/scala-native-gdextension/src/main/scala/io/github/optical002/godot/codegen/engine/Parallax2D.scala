package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `Parallax2D`, extends `Node2D`. */
abstract class Parallax2D extends Node2D {

  /** Parallax2D.set_scroll_scale */
  final def setScrollScale(scale: io.github.optical002.godot.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("Parallax2D", "set_scroll_scale", 743155724L), hostObject.objectPtr, scale)

  /** Parallax2D.get_scroll_scale */
  final def getScrollScale(): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector2](MethodBind.get("Parallax2D", "get_scroll_scale", 3341600327L), hostObject.objectPtr)

  /** Parallax2D.set_repeat_size */
  final def setRepeatSize(repeat_size: io.github.optical002.godot.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("Parallax2D", "set_repeat_size", 743155724L), hostObject.objectPtr, repeat_size)

  /** Parallax2D.get_repeat_size */
  final def getRepeatSize(): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector2](MethodBind.get("Parallax2D", "get_repeat_size", 3341600327L), hostObject.objectPtr)

  /** Parallax2D.set_repeat_times */
  final def setRepeatTimes(repeat_times: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Parallax2D", "set_repeat_times", 1286410249L), hostObject.objectPtr, repeat_times)

  /** Parallax2D.get_repeat_times */
  final def getRepeatTimes(): Long =
    Ptrcall.call0[Long](MethodBind.get("Parallax2D", "get_repeat_times", 3905245786L), hostObject.objectPtr)

  /** Parallax2D.set_autoscroll */
  final def setAutoscroll(autoscroll: io.github.optical002.godot.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("Parallax2D", "set_autoscroll", 743155724L), hostObject.objectPtr, autoscroll)

  /** Parallax2D.get_autoscroll */
  final def getAutoscroll(): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector2](MethodBind.get("Parallax2D", "get_autoscroll", 3341600327L), hostObject.objectPtr)

  /** Parallax2D.set_scroll_offset */
  final def setScrollOffset(offset: io.github.optical002.godot.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("Parallax2D", "set_scroll_offset", 743155724L), hostObject.objectPtr, offset)

  /** Parallax2D.get_scroll_offset */
  final def getScrollOffset(): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector2](MethodBind.get("Parallax2D", "get_scroll_offset", 3341600327L), hostObject.objectPtr)

  /** Parallax2D.set_screen_offset */
  final def setScreenOffset(offset: io.github.optical002.godot.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("Parallax2D", "set_screen_offset", 743155724L), hostObject.objectPtr, offset)

  /** Parallax2D.get_screen_offset */
  final def getScreenOffset(): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector2](MethodBind.get("Parallax2D", "get_screen_offset", 3341600327L), hostObject.objectPtr)

  /** Parallax2D.set_limit_begin */
  final def setLimitBegin(offset: io.github.optical002.godot.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("Parallax2D", "set_limit_begin", 743155724L), hostObject.objectPtr, offset)

  /** Parallax2D.get_limit_begin */
  final def getLimitBegin(): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector2](MethodBind.get("Parallax2D", "get_limit_begin", 3341600327L), hostObject.objectPtr)

  /** Parallax2D.set_limit_end */
  final def setLimitEnd(offset: io.github.optical002.godot.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("Parallax2D", "set_limit_end", 743155724L), hostObject.objectPtr, offset)

  /** Parallax2D.get_limit_end */
  final def getLimitEnd(): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector2](MethodBind.get("Parallax2D", "get_limit_end", 3341600327L), hostObject.objectPtr)

  /** Parallax2D.set_follow_viewport */
  final def setFollowViewport(follow: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Parallax2D", "set_follow_viewport", 2586408642L), hostObject.objectPtr, follow)

  /** Parallax2D.get_follow_viewport */
  final def getFollowViewport(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Parallax2D", "get_follow_viewport", 2240911060L), hostObject.objectPtr)

  /** Parallax2D.set_ignore_camera_scroll */
  final def setIgnoreCameraScroll(ignore: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Parallax2D", "set_ignore_camera_scroll", 2586408642L), hostObject.objectPtr, ignore)

  /** Parallax2D.is_ignore_camera_scroll */
  final def isIgnoreCameraScroll(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Parallax2D", "is_ignore_camera_scroll", 2240911060L), hostObject.objectPtr)

}

object Parallax2D {
  /** Class metadata for Gd[Parallax2D] lifetime management and casting. */
  given GodotClass[Parallax2D] with {
    def className = "Parallax2D"
    def isRefCounted = false
    def wrap(o: GodotObject): Parallax2D = new Parallax2D {}.withHost(o.objectPtr)
    def unwrap(t: Parallax2D): GodotObject = t.hostObject
  }
}
