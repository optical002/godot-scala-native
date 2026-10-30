package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeVectorFunc`, extends `VisualShaderNodeVectorBase`. */
abstract class VisualShaderNodeVectorFunc extends VisualShaderNodeVectorBase {
  override def godotClassName: String = "VisualShaderNodeVectorFunc"

  /** VisualShaderNodeVectorFunc.set_function */
  final def setFunction(func: gdext.classes.VisualShaderNodeVectorFunc.Function): Unit = {
    if (gdext.classes.VisualShaderNodeVectorFunc.mb_set_function == null) gdext.classes.VisualShaderNodeVectorFunc.mb_set_function = MethodBind.get("VisualShaderNodeVectorFunc", "set_function", 629964457L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeVectorFunc.mb_set_function, livePtr, func)
  }

  /** VisualShaderNodeVectorFunc.get_function */
  final def getFunction(): gdext.classes.VisualShaderNodeVectorFunc.Function = {
    if (gdext.classes.VisualShaderNodeVectorFunc.mb_get_function == null) gdext.classes.VisualShaderNodeVectorFunc.mb_get_function = MethodBind.get("VisualShaderNodeVectorFunc", "get_function", 4047776843L)
    gdext.classes.VisualShaderNodeVectorFunc.Function(Ptrcall.call0[Long](gdext.classes.VisualShaderNodeVectorFunc.mb_get_function, livePtr))
  }

}

object VisualShaderNodeVectorFunc {
  private[classes] var mb_set_function: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_function: GDExtensionMethodBindPtr = null

  /** Godot enum `VisualShaderNodeVectorFunc.Function`. */
  opaque type Function <: Long = Long

  object Function {
    final val Normalize: Function = 0L.asInstanceOf[Function]
    final val Saturate: Function = 1L.asInstanceOf[Function]
    final val Negate: Function = 2L.asInstanceOf[Function]
    final val Reciprocal: Function = 3L.asInstanceOf[Function]
    final val Abs: Function = 4L.asInstanceOf[Function]
    final val Acos: Function = 5L.asInstanceOf[Function]
    final val Acosh: Function = 6L.asInstanceOf[Function]
    final val Asin: Function = 7L.asInstanceOf[Function]
    final val Asinh: Function = 8L.asInstanceOf[Function]
    final val Atan: Function = 9L.asInstanceOf[Function]
    final val Atanh: Function = 10L.asInstanceOf[Function]
    final val Ceil: Function = 11L.asInstanceOf[Function]
    final val Cos: Function = 12L.asInstanceOf[Function]
    final val Cosh: Function = 13L.asInstanceOf[Function]
    final val Degrees: Function = 14L.asInstanceOf[Function]
    final val Exp: Function = 15L.asInstanceOf[Function]
    final val Exp2: Function = 16L.asInstanceOf[Function]
    final val Floor: Function = 17L.asInstanceOf[Function]
    final val Fract: Function = 18L.asInstanceOf[Function]
    final val InverseSqrt: Function = 19L.asInstanceOf[Function]
    final val Log: Function = 20L.asInstanceOf[Function]
    final val Log2: Function = 21L.asInstanceOf[Function]
    final val Radians: Function = 22L.asInstanceOf[Function]
    final val Round: Function = 23L.asInstanceOf[Function]
    final val Roundeven: Function = 24L.asInstanceOf[Function]
    final val Sign: Function = 25L.asInstanceOf[Function]
    final val Sin: Function = 26L.asInstanceOf[Function]
    final val Sinh: Function = 27L.asInstanceOf[Function]
    final val Sqrt: Function = 28L.asInstanceOf[Function]
    final val Tan: Function = 29L.asInstanceOf[Function]
    final val Tanh: Function = 30L.asInstanceOf[Function]
    final val Trunc: Function = 31L.asInstanceOf[Function]
    final val Oneminus: Function = 32L.asInstanceOf[Function]
    final val Max: Function = 33L.asInstanceOf[Function]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Function = value.asInstanceOf[Function]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Function] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 11L, 12L, 13L, 14L, 15L, 16L, 17L, 18L, 19L, 20L, 21L, 22L, 23L, 24L, 25L, 26L, 27L, 28L, 29L, 30L, 31L, 32L, 33L).asInstanceOf[scala.IArray[Function]]

    extension (self: Function)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Normalize"
        case 1L => "Saturate"
        case 2L => "Negate"
        case 3L => "Reciprocal"
        case 4L => "Abs"
        case 5L => "Acos"
        case 6L => "Acosh"
        case 7L => "Asin"
        case 8L => "Asinh"
        case 9L => "Atan"
        case 10L => "Atanh"
        case 11L => "Ceil"
        case 12L => "Cos"
        case 13L => "Cosh"
        case 14L => "Degrees"
        case 15L => "Exp"
        case 16L => "Exp2"
        case 17L => "Floor"
        case 18L => "Fract"
        case 19L => "InverseSqrt"
        case 20L => "Log"
        case 21L => "Log2"
        case 22L => "Radians"
        case 23L => "Round"
        case 24L => "Roundeven"
        case 25L => "Sign"
        case 26L => "Sin"
        case 27L => "Sinh"
        case 28L => "Sqrt"
        case 29L => "Tan"
        case 30L => "Tanh"
        case 31L => "Trunc"
        case 32L => "Oneminus"
        case 33L => "Max"
        case other => other.toString
      }
  }
}
