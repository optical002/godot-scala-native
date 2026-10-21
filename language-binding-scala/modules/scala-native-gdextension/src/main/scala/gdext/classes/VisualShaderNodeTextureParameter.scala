package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeTextureParameter`, extends `VisualShaderNodeParameter`. */
abstract class VisualShaderNodeTextureParameter extends VisualShaderNodeParameter {
  override def godotClassName: String = "VisualShaderNodeTextureParameter"

  /** VisualShaderNodeTextureParameter.set_texture_type */
  final def setTextureType(`type`: Long): Unit = {
    if (gdext.classes.VisualShaderNodeTextureParameter.mb_set_texture_type == null) gdext.classes.VisualShaderNodeTextureParameter.mb_set_texture_type = MethodBind.get("VisualShaderNodeTextureParameter", "set_texture_type", 2227296876L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeTextureParameter.mb_set_texture_type, livePtr, `type`)
  }

  /** VisualShaderNodeTextureParameter.get_texture_type */
  final def getTextureType(): Long = {
    if (gdext.classes.VisualShaderNodeTextureParameter.mb_get_texture_type == null) gdext.classes.VisualShaderNodeTextureParameter.mb_get_texture_type = MethodBind.get("VisualShaderNodeTextureParameter", "get_texture_type", 367922070L)
    Ptrcall.call0[Long](gdext.classes.VisualShaderNodeTextureParameter.mb_get_texture_type, livePtr)
  }

  /** VisualShaderNodeTextureParameter.set_color_default */
  final def setColorDefault(color: Long): Unit = {
    if (gdext.classes.VisualShaderNodeTextureParameter.mb_set_color_default == null) gdext.classes.VisualShaderNodeTextureParameter.mb_set_color_default = MethodBind.get("VisualShaderNodeTextureParameter", "set_color_default", 4217624432L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeTextureParameter.mb_set_color_default, livePtr, color)
  }

  /** VisualShaderNodeTextureParameter.get_color_default */
  final def getColorDefault(): Long = {
    if (gdext.classes.VisualShaderNodeTextureParameter.mb_get_color_default == null) gdext.classes.VisualShaderNodeTextureParameter.mb_get_color_default = MethodBind.get("VisualShaderNodeTextureParameter", "get_color_default", 3837060134L)
    Ptrcall.call0[Long](gdext.classes.VisualShaderNodeTextureParameter.mb_get_color_default, livePtr)
  }

  /** VisualShaderNodeTextureParameter.set_texture_filter */
  final def setTextureFilter(filter: Long): Unit = {
    if (gdext.classes.VisualShaderNodeTextureParameter.mb_set_texture_filter == null) gdext.classes.VisualShaderNodeTextureParameter.mb_set_texture_filter = MethodBind.get("VisualShaderNodeTextureParameter", "set_texture_filter", 2147684752L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeTextureParameter.mb_set_texture_filter, livePtr, filter)
  }

  /** VisualShaderNodeTextureParameter.get_texture_filter */
  final def getTextureFilter(): Long = {
    if (gdext.classes.VisualShaderNodeTextureParameter.mb_get_texture_filter == null) gdext.classes.VisualShaderNodeTextureParameter.mb_get_texture_filter = MethodBind.get("VisualShaderNodeTextureParameter", "get_texture_filter", 4184490817L)
    Ptrcall.call0[Long](gdext.classes.VisualShaderNodeTextureParameter.mb_get_texture_filter, livePtr)
  }

  /** VisualShaderNodeTextureParameter.set_texture_repeat */
  final def setTextureRepeat(repeat: Long): Unit = {
    if (gdext.classes.VisualShaderNodeTextureParameter.mb_set_texture_repeat == null) gdext.classes.VisualShaderNodeTextureParameter.mb_set_texture_repeat = MethodBind.get("VisualShaderNodeTextureParameter", "set_texture_repeat", 2036143070L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeTextureParameter.mb_set_texture_repeat, livePtr, repeat)
  }

  /** VisualShaderNodeTextureParameter.get_texture_repeat */
  final def getTextureRepeat(): Long = {
    if (gdext.classes.VisualShaderNodeTextureParameter.mb_get_texture_repeat == null) gdext.classes.VisualShaderNodeTextureParameter.mb_get_texture_repeat = MethodBind.get("VisualShaderNodeTextureParameter", "get_texture_repeat", 1690132794L)
    Ptrcall.call0[Long](gdext.classes.VisualShaderNodeTextureParameter.mb_get_texture_repeat, livePtr)
  }

  /** VisualShaderNodeTextureParameter.set_texture_source */
  final def setTextureSource(source: Long): Unit = {
    if (gdext.classes.VisualShaderNodeTextureParameter.mb_set_texture_source == null) gdext.classes.VisualShaderNodeTextureParameter.mb_set_texture_source = MethodBind.get("VisualShaderNodeTextureParameter", "set_texture_source", 1212687372L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeTextureParameter.mb_set_texture_source, livePtr, source)
  }

  /** VisualShaderNodeTextureParameter.get_texture_source */
  final def getTextureSource(): Long = {
    if (gdext.classes.VisualShaderNodeTextureParameter.mb_get_texture_source == null) gdext.classes.VisualShaderNodeTextureParameter.mb_get_texture_source = MethodBind.get("VisualShaderNodeTextureParameter", "get_texture_source", 2039092262L)
    Ptrcall.call0[Long](gdext.classes.VisualShaderNodeTextureParameter.mb_get_texture_source, livePtr)
  }

}

object VisualShaderNodeTextureParameter {
  private[classes] var mb_set_texture_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_color_default: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_color_default: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_texture_filter: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture_filter: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_texture_repeat: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture_repeat: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_texture_source: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture_source: GDExtensionMethodBindPtr = null
}
