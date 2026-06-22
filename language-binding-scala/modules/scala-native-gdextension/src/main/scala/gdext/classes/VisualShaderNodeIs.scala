package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeIs`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeIs extends VisualShaderNode {

  /** VisualShaderNodeIs.set_function */
  final def setFunction(func: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeIs", "set_function", 1438374690L), hostObject.objectPtr, func)

  /** VisualShaderNodeIs.get_function */
  final def getFunction(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeIs", "get_function", 580678557L), hostObject.objectPtr)

}

object VisualShaderNodeIs {
  /** Class metadata for Gd[VisualShaderNodeIs] lifetime management and casting. */
  given GodotClass[VisualShaderNodeIs] with {
    def className = "VisualShaderNodeIs"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeIs = new VisualShaderNodeIs {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeIs): GodotObject = t.hostObject
  }
}
