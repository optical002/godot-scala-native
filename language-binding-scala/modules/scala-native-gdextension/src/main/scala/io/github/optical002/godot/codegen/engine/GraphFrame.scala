package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `GraphFrame`, extends `GraphElement`. */
abstract class GraphFrame extends GraphElement {

  /** GraphFrame.set_title */
  final def setTitle(title: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("GraphFrame", "set_title", 83702148L), hostObject.objectPtr, title)

  /** GraphFrame.get_title */
  final def getTitle(): String =
    Ptrcall.call0[String](MethodBind.get("GraphFrame", "get_title", 201670096L), hostObject.objectPtr)

  /** GraphFrame.get_titlebar_hbox */
  final def getTitlebarHbox(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("GraphFrame", "get_titlebar_hbox", 3590609951L), hostObject.objectPtr)

  /** GraphFrame.set_autoshrink_enabled */
  final def setAutoshrinkEnabled(shrink: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("GraphFrame", "set_autoshrink_enabled", 2586408642L), hostObject.objectPtr, shrink)

  /** GraphFrame.is_autoshrink_enabled */
  final def isAutoshrinkEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("GraphFrame", "is_autoshrink_enabled", 36873697L), hostObject.objectPtr)

  /** GraphFrame.set_autoshrink_margin */
  final def setAutoshrinkMargin(autoshrink_margin: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GraphFrame", "set_autoshrink_margin", 1286410249L), hostObject.objectPtr, autoshrink_margin)

  /** GraphFrame.get_autoshrink_margin */
  final def getAutoshrinkMargin(): Long =
    Ptrcall.call0[Long](MethodBind.get("GraphFrame", "get_autoshrink_margin", 3905245786L), hostObject.objectPtr)

  /** GraphFrame.set_drag_margin */
  final def setDragMargin(drag_margin: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GraphFrame", "set_drag_margin", 1286410249L), hostObject.objectPtr, drag_margin)

  /** GraphFrame.get_drag_margin */
  final def getDragMargin(): Long =
    Ptrcall.call0[Long](MethodBind.get("GraphFrame", "get_drag_margin", 3905245786L), hostObject.objectPtr)

  /** GraphFrame.set_tint_color_enabled */
  final def setTintColorEnabled(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("GraphFrame", "set_tint_color_enabled", 2586408642L), hostObject.objectPtr, enable)

  /** GraphFrame.is_tint_color_enabled */
  final def isTintColorEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("GraphFrame", "is_tint_color_enabled", 36873697L), hostObject.objectPtr)

  /** GraphFrame.set_tint_color */
  final def setTintColor(color: io.github.optical002.godot.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("GraphFrame", "set_tint_color", 2920490490L), hostObject.objectPtr, color)

  /** GraphFrame.get_tint_color */
  final def getTintColor(): io.github.optical002.godot.builtin.Color =
    Ptrcall.call0[io.github.optical002.godot.builtin.Color](MethodBind.get("GraphFrame", "get_tint_color", 3444240500L), hostObject.objectPtr)

}

object GraphFrame {
  /** Class metadata for Gd[GraphFrame] lifetime management and casting. */
  given GodotClass[GraphFrame] with {
    def className = "GraphFrame"
    def isRefCounted = false
    def wrap(o: GodotObject): GraphFrame = new GraphFrame {}.withHost(o.objectPtr)
    def unwrap(t: GraphFrame): GodotObject = t.hostObject
  }
}
