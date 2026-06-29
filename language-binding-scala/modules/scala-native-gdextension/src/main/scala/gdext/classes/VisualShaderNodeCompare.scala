package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeCompare`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeCompare extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeCompare"

  /** VisualShaderNodeCompare.set_comparison_type */
  final def setComparisonType(`type`: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeCompare", "set_comparison_type", 516558320L), hostObject.objectPtr, `type`)

  /** VisualShaderNodeCompare.get_comparison_type */
  final def getComparisonType(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeCompare", "get_comparison_type", 3495315961L), hostObject.objectPtr)

  /** VisualShaderNodeCompare.set_function */
  final def setFunction(func: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeCompare", "set_function", 2370951349L), hostObject.objectPtr, func)

  /** VisualShaderNodeCompare.get_function */
  final def getFunction(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeCompare", "get_function", 4089164265L), hostObject.objectPtr)

  /** VisualShaderNodeCompare.set_condition */
  final def setCondition(condition: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeCompare", "set_condition", 918742392L), hostObject.objectPtr, condition)

  /** VisualShaderNodeCompare.get_condition */
  final def getCondition(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeCompare", "get_condition", 3281078941L), hostObject.objectPtr)

}
