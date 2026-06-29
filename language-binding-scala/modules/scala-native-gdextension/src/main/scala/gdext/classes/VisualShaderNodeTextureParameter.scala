package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeTextureParameter`, extends `VisualShaderNodeParameter`. */
abstract class VisualShaderNodeTextureParameter extends VisualShaderNodeParameter {
  override def godotClassName: String = "VisualShaderNodeTextureParameter"

  /** VisualShaderNodeTextureParameter.set_texture_type */
  final def setTextureType(`type`: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeTextureParameter", "set_texture_type", 2227296876L), hostObject.objectPtr, `type`)

  /** VisualShaderNodeTextureParameter.get_texture_type */
  final def getTextureType(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeTextureParameter", "get_texture_type", 367922070L), hostObject.objectPtr)

  /** VisualShaderNodeTextureParameter.set_color_default */
  final def setColorDefault(color: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeTextureParameter", "set_color_default", 4217624432L), hostObject.objectPtr, color)

  /** VisualShaderNodeTextureParameter.get_color_default */
  final def getColorDefault(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeTextureParameter", "get_color_default", 3837060134L), hostObject.objectPtr)

  /** VisualShaderNodeTextureParameter.set_texture_filter */
  final def setTextureFilter(filter: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeTextureParameter", "set_texture_filter", 2147684752L), hostObject.objectPtr, filter)

  /** VisualShaderNodeTextureParameter.get_texture_filter */
  final def getTextureFilter(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeTextureParameter", "get_texture_filter", 4184490817L), hostObject.objectPtr)

  /** VisualShaderNodeTextureParameter.set_texture_repeat */
  final def setTextureRepeat(repeat: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeTextureParameter", "set_texture_repeat", 2036143070L), hostObject.objectPtr, repeat)

  /** VisualShaderNodeTextureParameter.get_texture_repeat */
  final def getTextureRepeat(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeTextureParameter", "get_texture_repeat", 1690132794L), hostObject.objectPtr)

  /** VisualShaderNodeTextureParameter.set_texture_source */
  final def setTextureSource(source: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeTextureParameter", "set_texture_source", 1212687372L), hostObject.objectPtr, source)

  /** VisualShaderNodeTextureParameter.get_texture_source */
  final def getTextureSource(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeTextureParameter", "get_texture_source", 2039092262L), hostObject.objectPtr)

}
