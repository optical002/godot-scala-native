package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeResizableBase`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeResizableBase extends VisualShaderNode {

  /** VisualShaderNodeResizableBase.set_size */
  final def setSize(size: io.github.optical002.godot.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeResizableBase", "set_size", 743155724L), hostObject.objectPtr, size)

  /** VisualShaderNodeResizableBase.get_size */
  final def getSize(): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector2](MethodBind.get("VisualShaderNodeResizableBase", "get_size", 3341600327L), hostObject.objectPtr)

}

object VisualShaderNodeResizableBase {
  /** Class metadata for Gd[VisualShaderNodeResizableBase] lifetime management and casting. */
  given GodotClass[VisualShaderNodeResizableBase] with {
    def className = "VisualShaderNodeResizableBase"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeResizableBase = new VisualShaderNodeResizableBase {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeResizableBase): GodotObject = t.hostObject
  }
}
