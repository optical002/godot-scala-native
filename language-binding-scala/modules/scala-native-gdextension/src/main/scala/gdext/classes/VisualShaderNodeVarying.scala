package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeVarying`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeVarying extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeVarying"

  /** VisualShaderNodeVarying.set_varying_name */
  final def setVaryingName(name: String): Unit = {
    if (gdext.classes.VisualShaderNodeVarying.mb_set_varying_name == null) gdext.classes.VisualShaderNodeVarying.mb_set_varying_name = MethodBind.get("VisualShaderNodeVarying", "set_varying_name", 83702148L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeVarying.mb_set_varying_name, livePtr, name)
  }

  /** VisualShaderNodeVarying.get_varying_name */
  final def getVaryingName(): String = {
    if (gdext.classes.VisualShaderNodeVarying.mb_get_varying_name == null) gdext.classes.VisualShaderNodeVarying.mb_get_varying_name = MethodBind.get("VisualShaderNodeVarying", "get_varying_name", 201670096L)
    Ptrcall.call0[String](gdext.classes.VisualShaderNodeVarying.mb_get_varying_name, livePtr)
  }

  /** VisualShaderNodeVarying.set_varying_type */
  final def setVaryingType(`type`: gdext.classes.VisualShader.VaryingType): Unit = {
    if (gdext.classes.VisualShaderNodeVarying.mb_set_varying_type == null) gdext.classes.VisualShaderNodeVarying.mb_set_varying_type = MethodBind.get("VisualShaderNodeVarying", "set_varying_type", 3565867981L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeVarying.mb_set_varying_type, livePtr, `type`)
  }

  /** VisualShaderNodeVarying.get_varying_type */
  final def getVaryingType(): gdext.classes.VisualShader.VaryingType = {
    if (gdext.classes.VisualShaderNodeVarying.mb_get_varying_type == null) gdext.classes.VisualShaderNodeVarying.mb_get_varying_type = MethodBind.get("VisualShaderNodeVarying", "get_varying_type", 523183580L)
    gdext.classes.VisualShader.VaryingType(Ptrcall.call0[Long](gdext.classes.VisualShaderNodeVarying.mb_get_varying_type, livePtr))
  }

}

object VisualShaderNodeVarying {
  private[classes] var mb_set_varying_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_varying_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_varying_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_varying_type: GDExtensionMethodBindPtr = null
}
