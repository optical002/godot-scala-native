package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeColorFunc`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeColorFunc extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeColorFunc"

  /** VisualShaderNodeColorFunc.set_function */
  final def setFunction(func: gdext.classes.VisualShaderNodeColorFunc.Function): Unit = {
    if (gdext.classes.VisualShaderNodeColorFunc.mb_set_function == null) gdext.classes.VisualShaderNodeColorFunc.mb_set_function = MethodBind.get("VisualShaderNodeColorFunc", "set_function", 3973396138L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeColorFunc.mb_set_function, livePtr, func)
  }

  /** VisualShaderNodeColorFunc.get_function */
  final def getFunction(): gdext.classes.VisualShaderNodeColorFunc.Function = {
    if (gdext.classes.VisualShaderNodeColorFunc.mb_get_function == null) gdext.classes.VisualShaderNodeColorFunc.mb_get_function = MethodBind.get("VisualShaderNodeColorFunc", "get_function", 554863321L)
    gdext.classes.VisualShaderNodeColorFunc.Function(Ptrcall.call0[Long](gdext.classes.VisualShaderNodeColorFunc.mb_get_function, livePtr))
  }

}

object VisualShaderNodeColorFunc {
  private[classes] var mb_set_function: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_function: GDExtensionMethodBindPtr = null

  /** Godot enum `VisualShaderNodeColorFunc.Function`. */
  opaque type Function <: Long = Long

  object Function {
    final val Grayscale: Function = 0L.asInstanceOf[Function]
    final val Hsv2rgb: Function = 1L.asInstanceOf[Function]
    final val Rgb2hsv: Function = 2L.asInstanceOf[Function]
    final val Sepia: Function = 3L.asInstanceOf[Function]
    final val LinearToSrgb: Function = 4L.asInstanceOf[Function]
    final val SrgbToLinear: Function = 5L.asInstanceOf[Function]
    final val Max: Function = 6L.asInstanceOf[Function]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Function = value.asInstanceOf[Function]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Function] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L).asInstanceOf[scala.IArray[Function]]

    extension (self: Function)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Grayscale"
        case 1L => "Hsv2rgb"
        case 2L => "Rgb2hsv"
        case 3L => "Sepia"
        case 4L => "LinearToSrgb"
        case 5L => "SrgbToLinear"
        case 6L => "Max"
        case other => other.toString
      }
  }
}
