package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeTexture`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeTexture extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeTexture"

  /** VisualShaderNodeTexture.set_source */
  final def setSource(value: Long): Unit = {
    if (gdext.classes.VisualShaderNodeTexture.mb_set_source == null) gdext.classes.VisualShaderNodeTexture.mb_set_source = MethodBind.get("VisualShaderNodeTexture", "set_source", 905262939L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeTexture.mb_set_source, livePtr, value)
  }

  /** VisualShaderNodeTexture.get_source */
  final def getSource(): Long = {
    if (gdext.classes.VisualShaderNodeTexture.mb_get_source == null) gdext.classes.VisualShaderNodeTexture.mb_get_source = MethodBind.get("VisualShaderNodeTexture", "get_source", 2896297444L)
    Ptrcall.call0[Long](gdext.classes.VisualShaderNodeTexture.mb_get_source, livePtr)
  }

  /** VisualShaderNodeTexture.set_texture */
  final def setTexture(value: Texture2D): Unit = {
    if (gdext.classes.VisualShaderNodeTexture.mb_set_texture == null) gdext.classes.VisualShaderNodeTexture.mb_set_texture = MethodBind.get("VisualShaderNodeTexture", "set_texture", 4051416890L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeTexture.mb_set_texture, livePtr, Wrappers.handle(value))
  }

  /** VisualShaderNodeTexture.get_texture. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getTexture(): Texture2D = {
    if (gdext.classes.VisualShaderNodeTexture.mb_get_texture == null) gdext.classes.VisualShaderNodeTexture.mb_get_texture = MethodBind.get("VisualShaderNodeTexture", "get_texture", 3635182373L)
    Wrappers.owned[Texture2D](Ptrcall.call0[Long](gdext.classes.VisualShaderNodeTexture.mb_get_texture, livePtr))
  }

  /** VisualShaderNodeTexture.set_texture_type */
  final def setTextureType(value: Long): Unit = {
    if (gdext.classes.VisualShaderNodeTexture.mb_set_texture_type == null) gdext.classes.VisualShaderNodeTexture.mb_set_texture_type = MethodBind.get("VisualShaderNodeTexture", "set_texture_type", 986314081L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeTexture.mb_set_texture_type, livePtr, value)
  }

  /** VisualShaderNodeTexture.get_texture_type */
  final def getTextureType(): Long = {
    if (gdext.classes.VisualShaderNodeTexture.mb_get_texture_type == null) gdext.classes.VisualShaderNodeTexture.mb_get_texture_type = MethodBind.get("VisualShaderNodeTexture", "get_texture_type", 3290430153L)
    Ptrcall.call0[Long](gdext.classes.VisualShaderNodeTexture.mb_get_texture_type, livePtr)
  }

}

object VisualShaderNodeTexture {
  private[classes] var mb_set_source: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_source: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_texture_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture_type: GDExtensionMethodBindPtr = null
}
