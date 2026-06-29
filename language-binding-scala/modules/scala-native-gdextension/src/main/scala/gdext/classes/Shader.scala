package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `Shader`, extends `Resource`. */
abstract class Shader extends Resource {
  override def godotClassName: String = "Shader"

  /** Shader.get_mode */
  final def getMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("Shader", "get_mode", 3392948163L), hostObject.objectPtr)

  /** Shader.set_code */
  final def setCode(code: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("Shader", "set_code", 83702148L), hostObject.objectPtr, code)

  /** Shader.get_code */
  final def getCode(): String =
    Ptrcall.call0[String](MethodBind.get("Shader", "get_code", 201670096L), hostObject.objectPtr)

  /** Shader.set_default_texture_parameter */
  final def setDefaultTextureParameter(name: gdext.builtin.StringName, texture: Texture, index: Long): Unit =
    Ptrcall.callVoid3(MethodBind.get("Shader", "set_default_texture_parameter", 3850209648L), hostObject.objectPtr, name, texture.hostObject, index)

  /** Shader.get_default_texture_parameter */
  final def getDefaultTextureParameter(name: gdext.builtin.StringName, index: Long): GodotObject =
    Ptrcall.call2[gdext.builtin.StringName, Long, GodotObject](MethodBind.get("Shader", "get_default_texture_parameter", 4213877425L), hostObject.objectPtr, name, index)

  /** Shader.inspect_native_shader_code */
  final def inspectNativeShaderCode(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Shader", "inspect_native_shader_code", 3218959716L), hostObject.objectPtr)

}
