package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeFloatFunc`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeFloatFunc extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeFloatFunc"

  /** VisualShaderNodeFloatFunc.set_function */
  final def setFunction(func: gdext.classes.VisualShaderNodeFloatFunc.Function): Unit = {
    if (gdext.classes.VisualShaderNodeFloatFunc.mb_set_function == null) gdext.classes.VisualShaderNodeFloatFunc.mb_set_function = MethodBind.get("VisualShaderNodeFloatFunc", "set_function", 536026177L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeFloatFunc.mb_set_function, livePtr, func)
  }

  /** VisualShaderNodeFloatFunc.get_function */
  final def getFunction(): gdext.classes.VisualShaderNodeFloatFunc.Function = {
    if (gdext.classes.VisualShaderNodeFloatFunc.mb_get_function == null) gdext.classes.VisualShaderNodeFloatFunc.mb_get_function = MethodBind.get("VisualShaderNodeFloatFunc", "get_function", 2033948868L)
    gdext.classes.VisualShaderNodeFloatFunc.Function(Ptrcall.call0[Long](gdext.classes.VisualShaderNodeFloatFunc.mb_get_function, livePtr))
  }

}

object VisualShaderNodeFloatFunc {
  private[classes] var mb_set_function: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_function: GDExtensionMethodBindPtr = null

  /** Godot enum `VisualShaderNodeFloatFunc.Function`. */
  opaque type Function <: Long = Long

  object Function {
    final val Sin: Function = 0L.asInstanceOf[Function]
    final val Cos: Function = 1L.asInstanceOf[Function]
    final val Tan: Function = 2L.asInstanceOf[Function]
    final val Asin: Function = 3L.asInstanceOf[Function]
    final val Acos: Function = 4L.asInstanceOf[Function]
    final val Atan: Function = 5L.asInstanceOf[Function]
    final val Sinh: Function = 6L.asInstanceOf[Function]
    final val Cosh: Function = 7L.asInstanceOf[Function]
    final val Tanh: Function = 8L.asInstanceOf[Function]
    final val Log: Function = 9L.asInstanceOf[Function]
    final val Exp: Function = 10L.asInstanceOf[Function]
    final val Sqrt: Function = 11L.asInstanceOf[Function]
    final val Abs: Function = 12L.asInstanceOf[Function]
    final val Sign: Function = 13L.asInstanceOf[Function]
    final val Floor: Function = 14L.asInstanceOf[Function]
    final val Round: Function = 15L.asInstanceOf[Function]
    final val Ceil: Function = 16L.asInstanceOf[Function]
    final val Fract: Function = 17L.asInstanceOf[Function]
    final val Saturate: Function = 18L.asInstanceOf[Function]
    final val Negate: Function = 19L.asInstanceOf[Function]
    final val Acosh: Function = 20L.asInstanceOf[Function]
    final val Asinh: Function = 21L.asInstanceOf[Function]
    final val Atanh: Function = 22L.asInstanceOf[Function]
    final val Degrees: Function = 23L.asInstanceOf[Function]
    final val Exp2: Function = 24L.asInstanceOf[Function]
    final val InverseSqrt: Function = 25L.asInstanceOf[Function]
    final val Log2: Function = 26L.asInstanceOf[Function]
    final val Radians: Function = 27L.asInstanceOf[Function]
    final val Reciprocal: Function = 28L.asInstanceOf[Function]
    final val Roundeven: Function = 29L.asInstanceOf[Function]
    final val Trunc: Function = 30L.asInstanceOf[Function]
    final val Oneminus: Function = 31L.asInstanceOf[Function]
    final val Max: Function = 32L.asInstanceOf[Function]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Function = value.asInstanceOf[Function]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Function] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 11L, 12L, 13L, 14L, 15L, 16L, 17L, 18L, 19L, 20L, 21L, 22L, 23L, 24L, 25L, 26L, 27L, 28L, 29L, 30L, 31L, 32L).asInstanceOf[scala.IArray[Function]]

    extension (self: Function)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Sin"
        case 1L => "Cos"
        case 2L => "Tan"
        case 3L => "Asin"
        case 4L => "Acos"
        case 5L => "Atan"
        case 6L => "Sinh"
        case 7L => "Cosh"
        case 8L => "Tanh"
        case 9L => "Log"
        case 10L => "Exp"
        case 11L => "Sqrt"
        case 12L => "Abs"
        case 13L => "Sign"
        case 14L => "Floor"
        case 15L => "Round"
        case 16L => "Ceil"
        case 17L => "Fract"
        case 18L => "Saturate"
        case 19L => "Negate"
        case 20L => "Acosh"
        case 21L => "Asinh"
        case 22L => "Atanh"
        case 23L => "Degrees"
        case 24L => "Exp2"
        case 25L => "InverseSqrt"
        case 26L => "Log2"
        case 27L => "Radians"
        case 28L => "Reciprocal"
        case 29L => "Roundeven"
        case 30L => "Trunc"
        case 31L => "Oneminus"
        case 32L => "Max"
        case other => other.toString
      }
  }
}
