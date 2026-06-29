package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeCurveXYZTexture`, extends `VisualShaderNodeResizableBase`. */
abstract class VisualShaderNodeCurveXYZTexture extends VisualShaderNodeResizableBase {
  override def godotClassName: String = "VisualShaderNodeCurveXYZTexture"

  /** VisualShaderNodeCurveXYZTexture.set_texture */
  final def setTexture(texture: CurveXYZTexture): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeCurveXYZTexture", "set_texture", 8031783L), hostObject.objectPtr, texture.hostObject)

  /** VisualShaderNodeCurveXYZTexture.get_texture */
  final def getTexture(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("VisualShaderNodeCurveXYZTexture", "get_texture", 1950275015L), hostObject.objectPtr)

}
