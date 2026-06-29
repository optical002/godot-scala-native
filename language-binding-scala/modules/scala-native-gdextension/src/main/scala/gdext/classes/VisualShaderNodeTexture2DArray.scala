package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeTexture2DArray`, extends `VisualShaderNodeSample3D`. */
abstract class VisualShaderNodeTexture2DArray extends VisualShaderNodeSample3D {
  override def godotClassName: String = "VisualShaderNodeTexture2DArray"

  /** VisualShaderNodeTexture2DArray.set_texture_array */
  final def setTextureArray(value: TextureLayered): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeTexture2DArray", "set_texture_array", 1278366092L), hostObject.objectPtr, value.hostObject)

  /** VisualShaderNodeTexture2DArray.get_texture_array */
  final def getTextureArray(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("VisualShaderNodeTexture2DArray", "get_texture_array", 3984243839L), hostObject.objectPtr)

}
