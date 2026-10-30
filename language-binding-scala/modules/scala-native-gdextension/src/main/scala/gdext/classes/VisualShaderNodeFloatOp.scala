package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeFloatOp`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeFloatOp extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeFloatOp"

  /** VisualShaderNodeFloatOp.set_operator */
  final def setOperator(op: gdext.classes.VisualShaderNodeFloatOp.Operator): Unit = {
    if (gdext.classes.VisualShaderNodeFloatOp.mb_set_operator == null) gdext.classes.VisualShaderNodeFloatOp.mb_set_operator = MethodBind.get("VisualShaderNodeFloatOp", "set_operator", 2488468047L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeFloatOp.mb_set_operator, livePtr, op)
  }

  /** VisualShaderNodeFloatOp.get_operator */
  final def getOperator(): gdext.classes.VisualShaderNodeFloatOp.Operator = {
    if (gdext.classes.VisualShaderNodeFloatOp.mb_get_operator == null) gdext.classes.VisualShaderNodeFloatOp.mb_get_operator = MethodBind.get("VisualShaderNodeFloatOp", "get_operator", 1867979390L)
    gdext.classes.VisualShaderNodeFloatOp.Operator(Ptrcall.call0[Long](gdext.classes.VisualShaderNodeFloatOp.mb_get_operator, livePtr))
  }

}

object VisualShaderNodeFloatOp {
  private[classes] var mb_set_operator: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_operator: GDExtensionMethodBindPtr = null

  /** Godot enum `VisualShaderNodeFloatOp.Operator`. */
  opaque type Operator <: Long = Long

  object Operator {
    final val Add: Operator = 0L.asInstanceOf[Operator]
    final val Sub: Operator = 1L.asInstanceOf[Operator]
    final val Mul: Operator = 2L.asInstanceOf[Operator]
    final val Div: Operator = 3L.asInstanceOf[Operator]
    final val Mod: Operator = 4L.asInstanceOf[Operator]
    final val Pow: Operator = 5L.asInstanceOf[Operator]
    final val Max: Operator = 6L.asInstanceOf[Operator]
    final val Min: Operator = 7L.asInstanceOf[Operator]
    final val Atan2: Operator = 8L.asInstanceOf[Operator]
    final val Step: Operator = 9L.asInstanceOf[Operator]
    final val EnumSize: Operator = 10L.asInstanceOf[Operator]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Operator = value.asInstanceOf[Operator]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Operator] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L).asInstanceOf[scala.IArray[Operator]]

    extension (self: Operator)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Add"
        case 1L => "Sub"
        case 2L => "Mul"
        case 3L => "Div"
        case 4L => "Mod"
        case 5L => "Pow"
        case 6L => "Max"
        case 7L => "Min"
        case 8L => "Atan2"
        case 9L => "Step"
        case 10L => "EnumSize"
        case other => other.toString
      }
  }
}
