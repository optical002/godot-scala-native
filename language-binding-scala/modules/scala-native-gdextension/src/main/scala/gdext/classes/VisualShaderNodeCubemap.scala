package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeCubemap`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeCubemap extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeCubemap"

  /** VisualShaderNodeCubemap.set_source */
  final def setSource(value: Long): Unit = {
    if (gdext.classes.VisualShaderNodeCubemap.mb_set_source == null) gdext.classes.VisualShaderNodeCubemap.mb_set_source = MethodBind.get("VisualShaderNodeCubemap", "set_source", 1625400621L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeCubemap.mb_set_source, livePtr, value)
  }

  /** VisualShaderNodeCubemap.get_source */
  final def getSource(): Long = {
    if (gdext.classes.VisualShaderNodeCubemap.mb_get_source == null) gdext.classes.VisualShaderNodeCubemap.mb_get_source = MethodBind.get("VisualShaderNodeCubemap", "get_source", 2222048781L)
    Ptrcall.call0[Long](gdext.classes.VisualShaderNodeCubemap.mb_get_source, livePtr)
  }

  /** VisualShaderNodeCubemap.set_cube_map */
  final def setCubeMap(value: TextureLayered): Unit = {
    if (gdext.classes.VisualShaderNodeCubemap.mb_set_cube_map == null) gdext.classes.VisualShaderNodeCubemap.mb_set_cube_map = MethodBind.get("VisualShaderNodeCubemap", "set_cube_map", 1278366092L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeCubemap.mb_set_cube_map, livePtr, Wrappers.handle(value))
  }

  /** VisualShaderNodeCubemap.get_cube_map. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getCubeMap(): TextureLayered = {
    if (gdext.classes.VisualShaderNodeCubemap.mb_get_cube_map == null) gdext.classes.VisualShaderNodeCubemap.mb_get_cube_map = MethodBind.get("VisualShaderNodeCubemap", "get_cube_map", 3984243839L)
    Wrappers.owned[TextureLayered](Ptrcall.call0[Long](gdext.classes.VisualShaderNodeCubemap.mb_get_cube_map, livePtr))
  }

  /** VisualShaderNodeCubemap.set_texture_type */
  final def setTextureType(value: Long): Unit = {
    if (gdext.classes.VisualShaderNodeCubemap.mb_set_texture_type == null) gdext.classes.VisualShaderNodeCubemap.mb_set_texture_type = MethodBind.get("VisualShaderNodeCubemap", "set_texture_type", 1899718876L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeCubemap.mb_set_texture_type, livePtr, value)
  }

  /** VisualShaderNodeCubemap.get_texture_type */
  final def getTextureType(): Long = {
    if (gdext.classes.VisualShaderNodeCubemap.mb_get_texture_type == null) gdext.classes.VisualShaderNodeCubemap.mb_get_texture_type = MethodBind.get("VisualShaderNodeCubemap", "get_texture_type", 3356498888L)
    Ptrcall.call0[Long](gdext.classes.VisualShaderNodeCubemap.mb_get_texture_type, livePtr)
  }

}

object VisualShaderNodeCubemap {
  private[classes] var mb_set_source: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_source: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_cube_map: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_cube_map: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_texture_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture_type: GDExtensionMethodBindPtr = null
}
