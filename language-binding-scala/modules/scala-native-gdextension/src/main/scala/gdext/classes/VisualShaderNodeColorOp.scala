package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeColorOp`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeColorOp extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeColorOp"

  /** VisualShaderNodeColorOp.set_operator */
  final def setOperator(op: gdext.classes.VisualShaderNodeColorOp.Operator): Unit = {
    if (gdext.classes.VisualShaderNodeColorOp.mb_set_operator == null) gdext.classes.VisualShaderNodeColorOp.mb_set_operator = MethodBind.get("VisualShaderNodeColorOp", "set_operator", 4260370673L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeColorOp.mb_set_operator, livePtr, op)
  }

  /** VisualShaderNodeColorOp.get_operator */
  final def getOperator(): gdext.classes.VisualShaderNodeColorOp.Operator = {
    if (gdext.classes.VisualShaderNodeColorOp.mb_get_operator == null) gdext.classes.VisualShaderNodeColorOp.mb_get_operator = MethodBind.get("VisualShaderNodeColorOp", "get_operator", 1950956529L)
    gdext.classes.VisualShaderNodeColorOp.Operator(Ptrcall.call0[Long](gdext.classes.VisualShaderNodeColorOp.mb_get_operator, livePtr))
  }

}

object VisualShaderNodeColorOp {
  private[classes] var mb_set_operator: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_operator: GDExtensionMethodBindPtr = null

  /** Godot enum `VisualShaderNodeColorOp.Operator`. */
  opaque type Operator <: Long = Long

  object Operator {
    final val Screen: Operator = 0L.asInstanceOf[Operator]
    final val Difference: Operator = 1L.asInstanceOf[Operator]
    final val Darken: Operator = 2L.asInstanceOf[Operator]
    final val Lighten: Operator = 3L.asInstanceOf[Operator]
    final val Overlay: Operator = 4L.asInstanceOf[Operator]
    final val Dodge: Operator = 5L.asInstanceOf[Operator]
    final val Burn: Operator = 6L.asInstanceOf[Operator]
    final val SoftLight: Operator = 7L.asInstanceOf[Operator]
    final val HardLight: Operator = 8L.asInstanceOf[Operator]
    final val Max: Operator = 9L.asInstanceOf[Operator]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Operator = value.asInstanceOf[Operator]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Operator] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L).asInstanceOf[scala.IArray[Operator]]

    extension (self: Operator)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Screen"
        case 1L => "Difference"
        case 2L => "Darken"
        case 3L => "Lighten"
        case 4L => "Overlay"
        case 5L => "Dodge"
        case 6L => "Burn"
        case 7L => "SoftLight"
        case 8L => "HardLight"
        case 9L => "Max"
        case other => other.toString
      }
  }
}
