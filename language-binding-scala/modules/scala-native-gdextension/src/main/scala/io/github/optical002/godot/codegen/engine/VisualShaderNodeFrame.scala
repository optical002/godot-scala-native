package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeFrame`, extends `VisualShaderNodeResizableBase`. */
abstract class VisualShaderNodeFrame extends VisualShaderNodeResizableBase {

  /** VisualShaderNodeFrame.set_title */
  final def setTitle(title: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeFrame", "set_title", 83702148L), hostObject.objectPtr, title)

  /** VisualShaderNodeFrame.get_title */
  final def getTitle(): String =
    Ptrcall.call0[String](MethodBind.get("VisualShaderNodeFrame", "get_title", 201670096L), hostObject.objectPtr)

  /** VisualShaderNodeFrame.set_tint_color_enabled */
  final def setTintColorEnabled(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeFrame", "set_tint_color_enabled", 2586408642L), hostObject.objectPtr, enable)

  /** VisualShaderNodeFrame.is_tint_color_enabled */
  final def isTintColorEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("VisualShaderNodeFrame", "is_tint_color_enabled", 36873697L), hostObject.objectPtr)

  /** VisualShaderNodeFrame.set_tint_color */
  final def setTintColor(color: io.github.optical002.godot.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeFrame", "set_tint_color", 2920490490L), hostObject.objectPtr, color)

  /** VisualShaderNodeFrame.get_tint_color */
  final def getTintColor(): io.github.optical002.godot.builtin.Color =
    Ptrcall.call0[io.github.optical002.godot.builtin.Color](MethodBind.get("VisualShaderNodeFrame", "get_tint_color", 3444240500L), hostObject.objectPtr)

  /** VisualShaderNodeFrame.set_autoshrink_enabled */
  final def setAutoshrinkEnabled(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeFrame", "set_autoshrink_enabled", 2586408642L), hostObject.objectPtr, enable)

  /** VisualShaderNodeFrame.is_autoshrink_enabled */
  final def isAutoshrinkEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("VisualShaderNodeFrame", "is_autoshrink_enabled", 36873697L), hostObject.objectPtr)

  /** VisualShaderNodeFrame.add_attached_node */
  final def addAttachedNode(node: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeFrame", "add_attached_node", 1286410249L), hostObject.objectPtr, node)

  /** VisualShaderNodeFrame.remove_attached_node */
  final def removeAttachedNode(node: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeFrame", "remove_attached_node", 1286410249L), hostObject.objectPtr, node)

}

object VisualShaderNodeFrame {
  /** Class metadata for Gd[VisualShaderNodeFrame] lifetime management and casting. */
  given GodotClass[VisualShaderNodeFrame] with {
    def className = "VisualShaderNodeFrame"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeFrame = new VisualShaderNodeFrame {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeFrame): GodotObject = t.hostObject
  }
}
