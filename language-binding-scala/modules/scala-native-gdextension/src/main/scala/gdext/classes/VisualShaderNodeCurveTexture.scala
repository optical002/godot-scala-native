package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeCurveTexture`, extends `VisualShaderNodeResizableBase`. */
abstract class VisualShaderNodeCurveTexture extends VisualShaderNodeResizableBase {

  /** VisualShaderNodeCurveTexture.set_texture */
  final def setTexture(texture: CurveTexture): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeCurveTexture", "set_texture", 181872837L), hostObject.objectPtr, texture.hostObject)

  /** VisualShaderNodeCurveTexture.get_texture */
  final def getTexture(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("VisualShaderNodeCurveTexture", "get_texture", 2800800579L), hostObject.objectPtr)

}

object VisualShaderNodeCurveTexture {
  /** Class metadata for Gd[VisualShaderNodeCurveTexture] lifetime management and casting. */
  given GodotClass[VisualShaderNodeCurveTexture] with {
    def className = "VisualShaderNodeCurveTexture"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeCurveTexture = new VisualShaderNodeCurveTexture {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeCurveTexture): GodotObject = t.hostObject
  }
}
