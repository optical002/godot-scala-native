package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `ParallaxBackground`, extends `CanvasLayer`. */
abstract class ParallaxBackground extends CanvasLayer {

  /** ParallaxBackground.set_scroll_offset */
  final def setScrollOffset(offset: io.github.optical002.godot.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("ParallaxBackground", "set_scroll_offset", 743155724L), hostObject.objectPtr, offset)

  /** ParallaxBackground.get_scroll_offset */
  final def getScrollOffset(): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector2](MethodBind.get("ParallaxBackground", "get_scroll_offset", 3341600327L), hostObject.objectPtr)

  /** ParallaxBackground.set_scroll_base_offset */
  final def setScrollBaseOffset(offset: io.github.optical002.godot.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("ParallaxBackground", "set_scroll_base_offset", 743155724L), hostObject.objectPtr, offset)

  /** ParallaxBackground.get_scroll_base_offset */
  final def getScrollBaseOffset(): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector2](MethodBind.get("ParallaxBackground", "get_scroll_base_offset", 3341600327L), hostObject.objectPtr)

  /** ParallaxBackground.set_scroll_base_scale */
  final def setScrollBaseScale(scale: io.github.optical002.godot.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("ParallaxBackground", "set_scroll_base_scale", 743155724L), hostObject.objectPtr, scale)

  /** ParallaxBackground.get_scroll_base_scale */
  final def getScrollBaseScale(): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector2](MethodBind.get("ParallaxBackground", "get_scroll_base_scale", 3341600327L), hostObject.objectPtr)

  /** ParallaxBackground.set_limit_begin */
  final def setLimitBegin(offset: io.github.optical002.godot.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("ParallaxBackground", "set_limit_begin", 743155724L), hostObject.objectPtr, offset)

  /** ParallaxBackground.get_limit_begin */
  final def getLimitBegin(): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector2](MethodBind.get("ParallaxBackground", "get_limit_begin", 3341600327L), hostObject.objectPtr)

  /** ParallaxBackground.set_limit_end */
  final def setLimitEnd(offset: io.github.optical002.godot.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("ParallaxBackground", "set_limit_end", 743155724L), hostObject.objectPtr, offset)

  /** ParallaxBackground.get_limit_end */
  final def getLimitEnd(): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector2](MethodBind.get("ParallaxBackground", "get_limit_end", 3341600327L), hostObject.objectPtr)

  /** ParallaxBackground.set_ignore_camera_zoom */
  final def setIgnoreCameraZoom(ignore: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("ParallaxBackground", "set_ignore_camera_zoom", 2586408642L), hostObject.objectPtr, ignore)

  /** ParallaxBackground.is_ignore_camera_zoom */
  final def isIgnoreCameraZoom(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("ParallaxBackground", "is_ignore_camera_zoom", 2240911060L), hostObject.objectPtr)

}

object ParallaxBackground {
  /** Class metadata for Gd[ParallaxBackground] lifetime management and casting. */
  given GodotClass[ParallaxBackground] with {
    def className = "ParallaxBackground"
    def isRefCounted = false
    def wrap(o: GodotObject): ParallaxBackground = new ParallaxBackground {}.withHost(o.objectPtr)
    def unwrap(t: ParallaxBackground): GodotObject = t.hostObject
  }
}
