package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeParameter`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeParameter extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeParameter"

  /** VisualShaderNodeParameter.set_parameter_name */
  final def setParameterName(name: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeParameter", "set_parameter_name", 83702148L), hostObject.objectPtr, name)

  /** VisualShaderNodeParameter.get_parameter_name */
  final def getParameterName(): String =
    Ptrcall.call0[String](MethodBind.get("VisualShaderNodeParameter", "get_parameter_name", 201670096L), hostObject.objectPtr)

  /** VisualShaderNodeParameter.set_qualifier */
  final def setQualifier(qualifier: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeParameter", "set_qualifier", 1276489447L), hostObject.objectPtr, qualifier)

  /** VisualShaderNodeParameter.get_qualifier */
  final def getQualifier(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeParameter", "get_qualifier", 3558406205L), hostObject.objectPtr)

  /** VisualShaderNodeParameter.set_instance_index */
  final def setInstanceIndex(instance_index: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeParameter", "set_instance_index", 1286410249L), hostObject.objectPtr, instance_index)

  /** VisualShaderNodeParameter.get_instance_index */
  final def getInstanceIndex(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeParameter", "get_instance_index", 3905245786L), hostObject.objectPtr)

}
