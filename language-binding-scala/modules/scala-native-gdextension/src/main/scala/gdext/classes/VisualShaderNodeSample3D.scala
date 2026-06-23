package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeSample3D`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeSample3D extends VisualShaderNode {

  /** VisualShaderNodeSample3D.set_source */
  final def setSource(value: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeSample3D", "set_source", 3315130991L), hostObject.objectPtr, value)

  /** VisualShaderNodeSample3D.get_source */
  final def getSource(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeSample3D", "get_source", 1079494121L), hostObject.objectPtr)

}

object VisualShaderNodeSample3D {
  /** Class metadata for Gd[VisualShaderNodeSample3D] lifetime management and casting. */
  given GodotClass[VisualShaderNodeSample3D] with {
    def className = "VisualShaderNodeSample3D"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeSample3D = new VisualShaderNodeSample3D {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeSample3D): GodotObject = t.hostObject
  }
}
