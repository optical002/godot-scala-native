package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeCurveXYZTexture`, extends `VisualShaderNodeResizableBase`. */
abstract class VisualShaderNodeCurveXYZTexture extends VisualShaderNodeResizableBase {

  /** VisualShaderNodeCurveXYZTexture.set_texture */
  final def setTexture(texture: CurveXYZTexture): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeCurveXYZTexture", "set_texture", 8031783L), hostObject.objectPtr, texture.hostObject)

  /** VisualShaderNodeCurveXYZTexture.get_texture */
  final def getTexture(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("VisualShaderNodeCurveXYZTexture", "get_texture", 1950275015L), hostObject.objectPtr)

}

object VisualShaderNodeCurveXYZTexture {
  /** Class metadata for Gd[VisualShaderNodeCurveXYZTexture] lifetime management and casting. */
  given GodotClass[VisualShaderNodeCurveXYZTexture] with {
    def className = "VisualShaderNodeCurveXYZTexture"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeCurveXYZTexture = new VisualShaderNodeCurveXYZTexture {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeCurveXYZTexture): GodotObject = t.hostObject
  }
}
