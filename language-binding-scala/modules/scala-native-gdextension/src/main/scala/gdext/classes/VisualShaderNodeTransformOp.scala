package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeTransformOp`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeTransformOp extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeTransformOp"

  /** VisualShaderNodeTransformOp.set_operator */
  final def setOperator(op: gdext.classes.VisualShaderNodeTransformOp.Operator): Unit = {
    if (gdext.classes.VisualShaderNodeTransformOp.mb_set_operator == null) gdext.classes.VisualShaderNodeTransformOp.mb_set_operator = MethodBind.get("VisualShaderNodeTransformOp", "set_operator", 2287310733L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeTransformOp.mb_set_operator, livePtr, op)
  }

  /** VisualShaderNodeTransformOp.get_operator */
  final def getOperator(): gdext.classes.VisualShaderNodeTransformOp.Operator = {
    if (gdext.classes.VisualShaderNodeTransformOp.mb_get_operator == null) gdext.classes.VisualShaderNodeTransformOp.mb_get_operator = MethodBind.get("VisualShaderNodeTransformOp", "get_operator", 1238663601L)
    gdext.classes.VisualShaderNodeTransformOp.Operator(Ptrcall.call0[Long](gdext.classes.VisualShaderNodeTransformOp.mb_get_operator, livePtr))
  }

}

object VisualShaderNodeTransformOp {
  private[classes] var mb_set_operator: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_operator: GDExtensionMethodBindPtr = null

  /** Godot enum `VisualShaderNodeTransformOp.Operator`. */
  opaque type Operator <: Long = Long

  object Operator {
    final val Axb: Operator = 0L.asInstanceOf[Operator]
    final val Bxa: Operator = 1L.asInstanceOf[Operator]
    final val AxbComp: Operator = 2L.asInstanceOf[Operator]
    final val BxaComp: Operator = 3L.asInstanceOf[Operator]
    final val Add: Operator = 4L.asInstanceOf[Operator]
    final val AMinusB: Operator = 5L.asInstanceOf[Operator]
    final val BMinusA: Operator = 6L.asInstanceOf[Operator]
    final val ADivB: Operator = 7L.asInstanceOf[Operator]
    final val BDivA: Operator = 8L.asInstanceOf[Operator]
    final val Max: Operator = 9L.asInstanceOf[Operator]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Operator = value.asInstanceOf[Operator]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Operator] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L).asInstanceOf[scala.IArray[Operator]]

    extension (self: Operator)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Axb"
        case 1L => "Bxa"
        case 2L => "AxbComp"
        case 3L => "BxaComp"
        case 4L => "Add"
        case 5L => "AMinusB"
        case 6L => "BMinusA"
        case 7L => "ADivB"
        case 8L => "BDivA"
        case 9L => "Max"
        case other => other.toString
      }
  }
}
