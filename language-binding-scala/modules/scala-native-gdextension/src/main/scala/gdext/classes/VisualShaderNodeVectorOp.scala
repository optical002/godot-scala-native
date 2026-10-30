package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeVectorOp`, extends `VisualShaderNodeVectorBase`. */
abstract class VisualShaderNodeVectorOp extends VisualShaderNodeVectorBase {
  override def godotClassName: String = "VisualShaderNodeVectorOp"

  /** VisualShaderNodeVectorOp.set_operator */
  final def setOperator(op: gdext.classes.VisualShaderNodeVectorOp.Operator): Unit = {
    if (gdext.classes.VisualShaderNodeVectorOp.mb_set_operator == null) gdext.classes.VisualShaderNodeVectorOp.mb_set_operator = MethodBind.get("VisualShaderNodeVectorOp", "set_operator", 3371507302L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeVectorOp.mb_set_operator, livePtr, op)
  }

  /** VisualShaderNodeVectorOp.get_operator */
  final def getOperator(): gdext.classes.VisualShaderNodeVectorOp.Operator = {
    if (gdext.classes.VisualShaderNodeVectorOp.mb_get_operator == null) gdext.classes.VisualShaderNodeVectorOp.mb_get_operator = MethodBind.get("VisualShaderNodeVectorOp", "get_operator", 11793929L)
    gdext.classes.VisualShaderNodeVectorOp.Operator(Ptrcall.call0[Long](gdext.classes.VisualShaderNodeVectorOp.mb_get_operator, livePtr))
  }

}

object VisualShaderNodeVectorOp {
  private[classes] var mb_set_operator: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_operator: GDExtensionMethodBindPtr = null

  /** Godot enum `VisualShaderNodeVectorOp.Operator`. */
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
    final val Cross: Operator = 8L.asInstanceOf[Operator]
    final val Atan2: Operator = 9L.asInstanceOf[Operator]
    final val Reflect: Operator = 10L.asInstanceOf[Operator]
    final val Step: Operator = 11L.asInstanceOf[Operator]
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
        case 5L => "Pow"
        case 6L => "Max"
        case 7L => "Min"
        case 8L => "Cross"
        case 9L => "Atan2"
        case 10L => "Reflect"
        case 11L => "Step"
        case 12L => "EnumSize"
        case other => other.toString
      }
  }
}
