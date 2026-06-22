package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeTexture2DArray`, extends `VisualShaderNodeSample3D`. */
abstract class VisualShaderNodeTexture2DArray extends VisualShaderNodeSample3D {

  /** VisualShaderNodeTexture2DArray.set_texture_array */
  final def setTextureArray(value: TextureLayered): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeTexture2DArray", "set_texture_array", 1278366092L), hostObject.objectPtr, value.hostObject)

  /** VisualShaderNodeTexture2DArray.get_texture_array */
  final def getTextureArray(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("VisualShaderNodeTexture2DArray", "get_texture_array", 3984243839L), hostObject.objectPtr)

}

object VisualShaderNodeTexture2DArray {
  /** Class metadata for Gd[VisualShaderNodeTexture2DArray] lifetime management and casting. */
  given GodotClass[VisualShaderNodeTexture2DArray] with {
    def className = "VisualShaderNodeTexture2DArray"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeTexture2DArray = new VisualShaderNodeTexture2DArray {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeTexture2DArray): GodotObject = t.hostObject
  }
}
