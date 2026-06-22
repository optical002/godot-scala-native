package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeResizableBase`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeResizableBase extends VisualShaderNode {

  /** VisualShaderNodeResizableBase.set_size */
  final def setSize(size: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeResizableBase", "set_size", 743155724L), hostObject.objectPtr, size)

  /** VisualShaderNodeResizableBase.get_size */
  final def getSize(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("VisualShaderNodeResizableBase", "get_size", 3341600327L), hostObject.objectPtr)

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
