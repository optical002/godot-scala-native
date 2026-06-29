package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeVarying`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeVarying extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeVarying"

  /** VisualShaderNodeVarying.set_varying_name */
  final def setVaryingName(name: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeVarying", "set_varying_name", 83702148L), hostObject.objectPtr, name)

  /** VisualShaderNodeVarying.get_varying_name */
  final def getVaryingName(): String =
    Ptrcall.call0[String](MethodBind.get("VisualShaderNodeVarying", "get_varying_name", 201670096L), hostObject.objectPtr)

  /** VisualShaderNodeVarying.set_varying_type */
  final def setVaryingType(`type`: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeVarying", "set_varying_type", 3565867981L), hostObject.objectPtr, `type`)

  /** VisualShaderNodeVarying.get_varying_type */
  final def getVaryingType(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeVarying", "get_varying_type", 523183580L), hostObject.objectPtr)

}
