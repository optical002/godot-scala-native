package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Shader`, extends `Resource`. */
abstract class Shader extends Resource {
  override def godotClassName: String = "Shader"

  /** Shader.get_mode */
  final def getMode(): Long = {
    if (gdext.classes.Shader.mb_get_mode == null) gdext.classes.Shader.mb_get_mode = MethodBind.get("Shader", "get_mode", 3392948163L)
    Ptrcall.call0[Long](gdext.classes.Shader.mb_get_mode, livePtr)
  }

  /** Shader.set_code */
  final def setCode(code: String): Unit = {
    if (gdext.classes.Shader.mb_set_code == null) gdext.classes.Shader.mb_set_code = MethodBind.get("Shader", "set_code", 83702148L)
    Ptrcall.callVoid1(gdext.classes.Shader.mb_set_code, livePtr, code)
  }

  /** Shader.get_code */
  final def getCode(): String = {
    if (gdext.classes.Shader.mb_get_code == null) gdext.classes.Shader.mb_get_code = MethodBind.get("Shader", "get_code", 201670096L)
    Ptrcall.call0[String](gdext.classes.Shader.mb_get_code, livePtr)
  }

  /** Shader.set_default_texture_parameter */
  final def setDefaultTextureParameter(name: gdext.builtin.StringName, texture: Texture, index: Long): Unit = {
    if (gdext.classes.Shader.mb_set_default_texture_parameter == null) gdext.classes.Shader.mb_set_default_texture_parameter = MethodBind.get("Shader", "set_default_texture_parameter", 3850209648L)
    Ptrcall.callVoid3(gdext.classes.Shader.mb_set_default_texture_parameter, livePtr, name, Wrappers.handle(texture), index)
  }

  /** Shader.get_default_texture_parameter. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getDefaultTextureParameter(name: gdext.builtin.StringName, index: Long): Texture = {
    if (gdext.classes.Shader.mb_get_default_texture_parameter == null) gdext.classes.Shader.mb_get_default_texture_parameter = MethodBind.get("Shader", "get_default_texture_parameter", 4213877425L)
    Wrappers.owned[Texture](Ptrcall.call2[gdext.builtin.StringName, Long, Long](gdext.classes.Shader.mb_get_default_texture_parameter, livePtr, name, index))
  }

  /** Shader.inspect_native_shader_code */
  final def inspectNativeShaderCode(): Unit = {
    if (gdext.classes.Shader.mb_inspect_native_shader_code == null) gdext.classes.Shader.mb_inspect_native_shader_code = MethodBind.get("Shader", "inspect_native_shader_code", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Shader.mb_inspect_native_shader_code, livePtr)
  }

}

object Shader {
  private[classes] var mb_get_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_code: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_code: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_default_texture_parameter: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_default_texture_parameter: GDExtensionMethodBindPtr = null
  private[classes] var mb_inspect_native_shader_code: GDExtensionMethodBindPtr = null
}
