package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeIntOp`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeIntOp extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeIntOp"

  /** VisualShaderNodeIntOp.set_operator */
  final def setOperator(op: gdext.classes.VisualShaderNodeIntOp.Operator): Unit = {
    if (gdext.classes.VisualShaderNodeIntOp.mb_set_operator == null) gdext.classes.VisualShaderNodeIntOp.mb_set_operator = MethodBind.get("VisualShaderNodeIntOp", "set_operator", 1677909323L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeIntOp.mb_set_operator, livePtr, op)
  }

  /** VisualShaderNodeIntOp.get_operator */
  final def getOperator(): gdext.classes.VisualShaderNodeIntOp.Operator = {
    if (gdext.classes.VisualShaderNodeIntOp.mb_get_operator == null) gdext.classes.VisualShaderNodeIntOp.mb_get_operator = MethodBind.get("VisualShaderNodeIntOp", "get_operator", 1236987913L)
    gdext.classes.VisualShaderNodeIntOp.Operator(Ptrcall.call0[Long](gdext.classes.VisualShaderNodeIntOp.mb_get_operator, livePtr))
  }

}

object VisualShaderNodeIntOp {
  private[classes] var mb_set_operator: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_operator: GDExtensionMethodBindPtr = null

  /** Godot enum `VisualShaderNodeIntOp.Operator`. */
  opaque type Operator <: Long = Long

  object Operator {
    final val Add: Operator = 0L.asInstanceOf[Operator]
    final val Sub: Operator = 1L.asInstanceOf[Operator]
    final val Mul: Operator = 2L.asInstanceOf[Operator]
    final val Div: Operator = 3L.asInstanceOf[Operator]
    final val Mod: Operator = 4L.asInstanceOf[Operator]
    final val Max: Operator = 5L.asInstanceOf[Operator]
    final val Min: Operator = 6L.asInstanceOf[Operator]
    final val BitwiseAnd: Operator = 7L.asInstanceOf[Operator]
    final val BitwiseOr: Operator = 8L.asInstanceOf[Operator]
    final val BitwiseXor: Operator = 9L.asInstanceOf[Operator]
    final val BitwiseLeftShift: Operator = 10L.asInstanceOf[Operator]
    final val BitwiseRightShift: Operator = 11L.asInstanceOf[Operator]
    final val EnumSize: Operator = 12L.asInstanceOf[Operator]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Operator = value.asInstanceOf[Operator]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Operator] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 11L, 12L).asInstanceOf[scala.IArray[Operator]]

    extension (self: Operator)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Add"
        case 1L => "Sub"
        case 2L => "Mul"
        case 3L => "Div"
        case 4L => "Mod"
        case 5L => "Max"
        case 6L => "Min"
        case 7L => "BitwiseAnd"
        case 8L => "BitwiseOr"
        case 9L => "BitwiseXor"
        case 10L => "BitwiseLeftShift"
        case 11L => "BitwiseRightShift"
        case 12L => "EnumSize"
        case other => other.toString
      }
  }
}
