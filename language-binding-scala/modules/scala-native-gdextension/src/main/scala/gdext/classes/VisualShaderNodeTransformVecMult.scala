package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeTransformVecMult`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeTransformVecMult extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeTransformVecMult"

  /** VisualShaderNodeTransformVecMult.set_operator */
  final def setOperator(op: gdext.classes.VisualShaderNodeTransformVecMult.Operator): Unit = {
    if (gdext.classes.VisualShaderNodeTransformVecMult.mb_set_operator == null) gdext.classes.VisualShaderNodeTransformVecMult.mb_set_operator = MethodBind.get("VisualShaderNodeTransformVecMult", "set_operator", 1785665912L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeTransformVecMult.mb_set_operator, livePtr, op)
  }

  /** VisualShaderNodeTransformVecMult.get_operator */
  final def getOperator(): gdext.classes.VisualShaderNodeTransformVecMult.Operator = {
    if (gdext.classes.VisualShaderNodeTransformVecMult.mb_get_operator == null) gdext.classes.VisualShaderNodeTransformVecMult.mb_get_operator = MethodBind.get("VisualShaderNodeTransformVecMult", "get_operator", 1622088722L)
    gdext.classes.VisualShaderNodeTransformVecMult.Operator(Ptrcall.call0[Long](gdext.classes.VisualShaderNodeTransformVecMult.mb_get_operator, livePtr))
  }

}

object VisualShaderNodeTransformVecMult {
  private[classes] var mb_set_operator: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_operator: GDExtensionMethodBindPtr = null

  /** Godot enum `VisualShaderNodeTransformVecMult.Operator`. */
  opaque type Operator <: Long = Long

  object Operator {
    final val Axb: Operator = 0L.asInstanceOf[Operator]
    final val Bxa: Operator = 1L.asInstanceOf[Operator]
    final val Op3x3Axb: Operator = 2L.asInstanceOf[Operator]
    final val Op3x3Bxa: Operator = 3L.asInstanceOf[Operator]
    final val Max: Operator = 4L.asInstanceOf[Operator]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Operator = value.asInstanceOf[Operator]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Operator] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L).asInstanceOf[scala.IArray[Operator]]

    extension (self: Operator)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Axb"
        case 1L => "Bxa"
        case 2L => "Op3x3Axb"
        case 3L => "Op3x3Bxa"
        case 4L => "Max"
        case other => other.toString
      }
  }
}
