package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeTexture3D`, extends `VisualShaderNodeSample3D`. */
abstract class VisualShaderNodeTexture3D extends VisualShaderNodeSample3D {

  /** VisualShaderNodeTexture3D.set_texture */
  final def setTexture(value: Texture3D): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeTexture3D", "set_texture", 1188404210L), hostObject.objectPtr, value.hostObject)

  /** VisualShaderNodeTexture3D.get_texture */
  final def getTexture(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("VisualShaderNodeTexture3D", "get_texture", 373985333L), hostObject.objectPtr)

}

object VisualShaderNodeTexture3D {
  /** Class metadata for Gd[VisualShaderNodeTexture3D] lifetime management and casting. */
  given GodotClass[VisualShaderNodeTexture3D] with {
    def className = "VisualShaderNodeTexture3D"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeTexture3D = new VisualShaderNodeTexture3D {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeTexture3D): GodotObject = t.hostObject
  }
}
