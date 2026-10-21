package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeTexture2DArray`, extends `VisualShaderNodeSample3D`. */
abstract class VisualShaderNodeTexture2DArray extends VisualShaderNodeSample3D {
  override def godotClassName: String = "VisualShaderNodeTexture2DArray"

  /** VisualShaderNodeTexture2DArray.set_texture_array */
  final def setTextureArray(value: TextureLayered): Unit = {
    if (gdext.classes.VisualShaderNodeTexture2DArray.mb_set_texture_array == null) gdext.classes.VisualShaderNodeTexture2DArray.mb_set_texture_array = MethodBind.get("VisualShaderNodeTexture2DArray", "set_texture_array", 1278366092L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeTexture2DArray.mb_set_texture_array, livePtr, Wrappers.handle(value))
  }

  /** VisualShaderNodeTexture2DArray.get_texture_array. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getTextureArray(): TextureLayered = {
    if (gdext.classes.VisualShaderNodeTexture2DArray.mb_get_texture_array == null) gdext.classes.VisualShaderNodeTexture2DArray.mb_get_texture_array = MethodBind.get("VisualShaderNodeTexture2DArray", "get_texture_array", 3984243839L)
    Wrappers.owned[TextureLayered](Ptrcall.call0[Long](gdext.classes.VisualShaderNodeTexture2DArray.mb_get_texture_array, livePtr))
  }

}

object VisualShaderNodeTexture2DArray {
  private[classes] var mb_set_texture_array: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture_array: GDExtensionMethodBindPtr = null
}
