package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeParameter`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeParameter extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeParameter"

  /** VisualShaderNodeParameter.set_parameter_name */
  final def setParameterName(name: String): Unit = {
    if (gdext.classes.VisualShaderNodeParameter.mb_set_parameter_name == null) gdext.classes.VisualShaderNodeParameter.mb_set_parameter_name = MethodBind.get("VisualShaderNodeParameter", "set_parameter_name", 83702148L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeParameter.mb_set_parameter_name, livePtr, name)
  }

  /** VisualShaderNodeParameter.get_parameter_name */
  final def getParameterName(): String = {
    if (gdext.classes.VisualShaderNodeParameter.mb_get_parameter_name == null) gdext.classes.VisualShaderNodeParameter.mb_get_parameter_name = MethodBind.get("VisualShaderNodeParameter", "get_parameter_name", 201670096L)
    Ptrcall.call0[String](gdext.classes.VisualShaderNodeParameter.mb_get_parameter_name, livePtr)
  }

  /** VisualShaderNodeParameter.set_qualifier */
  final def setQualifier(qualifier: Long): Unit = {
    if (gdext.classes.VisualShaderNodeParameter.mb_set_qualifier == null) gdext.classes.VisualShaderNodeParameter.mb_set_qualifier = MethodBind.get("VisualShaderNodeParameter", "set_qualifier", 1276489447L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeParameter.mb_set_qualifier, livePtr, qualifier)
  }

  /** VisualShaderNodeParameter.get_qualifier */
  final def getQualifier(): Long = {
    if (gdext.classes.VisualShaderNodeParameter.mb_get_qualifier == null) gdext.classes.VisualShaderNodeParameter.mb_get_qualifier = MethodBind.get("VisualShaderNodeParameter", "get_qualifier", 3558406205L)
    Ptrcall.call0[Long](gdext.classes.VisualShaderNodeParameter.mb_get_qualifier, livePtr)
  }

  /** VisualShaderNodeParameter.set_instance_index */
  final def setInstanceIndex(instance_index: Long): Unit = {
    if (gdext.classes.VisualShaderNodeParameter.mb_set_instance_index == null) gdext.classes.VisualShaderNodeParameter.mb_set_instance_index = MethodBind.get("VisualShaderNodeParameter", "set_instance_index", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeParameter.mb_set_instance_index, livePtr, instance_index)
  }

  /** VisualShaderNodeParameter.get_instance_index */
  final def getInstanceIndex(): Long = {
    if (gdext.classes.VisualShaderNodeParameter.mb_get_instance_index == null) gdext.classes.VisualShaderNodeParameter.mb_get_instance_index = MethodBind.get("VisualShaderNodeParameter", "get_instance_index", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.VisualShaderNodeParameter.mb_get_instance_index, livePtr)
  }

}

object VisualShaderNodeParameter {
  private[classes] var mb_set_parameter_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_parameter_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_qualifier: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_qualifier: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_instance_index: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_instance_index: GDExtensionMethodBindPtr = null
}
