package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeCompare`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeCompare extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeCompare"

  /** VisualShaderNodeCompare.set_comparison_type */
  final def setComparisonType(`type`: Long): Unit = {
    if (gdext.classes.VisualShaderNodeCompare.mb_set_comparison_type == null) gdext.classes.VisualShaderNodeCompare.mb_set_comparison_type = MethodBind.get("VisualShaderNodeCompare", "set_comparison_type", 516558320L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeCompare.mb_set_comparison_type, livePtr, `type`)
  }

  /** VisualShaderNodeCompare.get_comparison_type */
  final def getComparisonType(): Long = {
    if (gdext.classes.VisualShaderNodeCompare.mb_get_comparison_type == null) gdext.classes.VisualShaderNodeCompare.mb_get_comparison_type = MethodBind.get("VisualShaderNodeCompare", "get_comparison_type", 3495315961L)
    Ptrcall.call0[Long](gdext.classes.VisualShaderNodeCompare.mb_get_comparison_type, livePtr)
  }

  /** VisualShaderNodeCompare.set_function */
  final def setFunction(func: Long): Unit = {
    if (gdext.classes.VisualShaderNodeCompare.mb_set_function == null) gdext.classes.VisualShaderNodeCompare.mb_set_function = MethodBind.get("VisualShaderNodeCompare", "set_function", 2370951349L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeCompare.mb_set_function, livePtr, func)
  }

  /** VisualShaderNodeCompare.get_function */
  final def getFunction(): Long = {
    if (gdext.classes.VisualShaderNodeCompare.mb_get_function == null) gdext.classes.VisualShaderNodeCompare.mb_get_function = MethodBind.get("VisualShaderNodeCompare", "get_function", 4089164265L)
    Ptrcall.call0[Long](gdext.classes.VisualShaderNodeCompare.mb_get_function, livePtr)
  }

  /** VisualShaderNodeCompare.set_condition */
  final def setCondition(condition: Long): Unit = {
    if (gdext.classes.VisualShaderNodeCompare.mb_set_condition == null) gdext.classes.VisualShaderNodeCompare.mb_set_condition = MethodBind.get("VisualShaderNodeCompare", "set_condition", 918742392L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeCompare.mb_set_condition, livePtr, condition)
  }

  /** VisualShaderNodeCompare.get_condition */
  final def getCondition(): Long = {
    if (gdext.classes.VisualShaderNodeCompare.mb_get_condition == null) gdext.classes.VisualShaderNodeCompare.mb_get_condition = MethodBind.get("VisualShaderNodeCompare", "get_condition", 3281078941L)
    Ptrcall.call0[Long](gdext.classes.VisualShaderNodeCompare.mb_get_condition, livePtr)
  }

}

object VisualShaderNodeCompare {
  private[classes] var mb_set_comparison_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_comparison_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_function: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_function: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_condition: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_condition: GDExtensionMethodBindPtr = null
}
