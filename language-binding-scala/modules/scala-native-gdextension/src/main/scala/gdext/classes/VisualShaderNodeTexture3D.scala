package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeTexture3D`, extends `VisualShaderNodeSample3D`. */
abstract class VisualShaderNodeTexture3D extends VisualShaderNodeSample3D {
  override def godotClassName: String = "VisualShaderNodeTexture3D"

  /** VisualShaderNodeTexture3D.set_texture */
  final def setTexture(value: Texture3D): Unit = {
    if (gdext.classes.VisualShaderNodeTexture3D.mb_set_texture == null) gdext.classes.VisualShaderNodeTexture3D.mb_set_texture = MethodBind.get("VisualShaderNodeTexture3D", "set_texture", 1188404210L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeTexture3D.mb_set_texture, livePtr, Wrappers.handle(value))
  }

  /** VisualShaderNodeTexture3D.get_texture. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getTexture(): Texture3D = {
    if (gdext.classes.VisualShaderNodeTexture3D.mb_get_texture == null) gdext.classes.VisualShaderNodeTexture3D.mb_get_texture = MethodBind.get("VisualShaderNodeTexture3D", "get_texture", 373985333L)
    Wrappers.owned[Texture3D](Ptrcall.call0[Long](gdext.classes.VisualShaderNodeTexture3D.mb_get_texture, livePtr))
  }

}

object VisualShaderNodeTexture3D {
  private[classes] var mb_set_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture: GDExtensionMethodBindPtr = null
}
