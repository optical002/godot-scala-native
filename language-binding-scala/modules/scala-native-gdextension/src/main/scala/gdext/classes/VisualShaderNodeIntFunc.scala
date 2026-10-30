package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeIntFunc`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeIntFunc extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeIntFunc"

  /** VisualShaderNodeIntFunc.set_function */
  final def setFunction(func: gdext.classes.VisualShaderNodeIntFunc.Function): Unit = {
    if (gdext.classes.VisualShaderNodeIntFunc.mb_set_function == null) gdext.classes.VisualShaderNodeIntFunc.mb_set_function = MethodBind.get("VisualShaderNodeIntFunc", "set_function", 424195284L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeIntFunc.mb_set_function, livePtr, func)
  }

  /** VisualShaderNodeIntFunc.get_function */
  final def getFunction(): gdext.classes.VisualShaderNodeIntFunc.Function = {
    if (gdext.classes.VisualShaderNodeIntFunc.mb_get_function == null) gdext.classes.VisualShaderNodeIntFunc.mb_get_function = MethodBind.get("VisualShaderNodeIntFunc", "get_function", 2753496911L)
    gdext.classes.VisualShaderNodeIntFunc.Function(Ptrcall.call0[Long](gdext.classes.VisualShaderNodeIntFunc.mb_get_function, livePtr))
  }

}

object VisualShaderNodeIntFunc {
  private[classes] var mb_set_function: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_function: GDExtensionMethodBindPtr = null

  /** Godot enum `VisualShaderNodeIntFunc.Function`. */
  opaque type Function <: Long = Long

  object Function {
    final val Abs: Function = 0L.asInstanceOf[Function]
    final val Negate: Function = 1L.asInstanceOf[Function]
    final val Sign: Function = 2L.asInstanceOf[Function]
    final val BitwiseNot: Function = 3L.asInstanceOf[Function]
    final val Max: Function = 4L.asInstanceOf[Function]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Function = value.asInstanceOf[Function]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Function] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L).asInstanceOf[scala.IArray[Function]]

    extension (self: Function)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Abs"
        case 1L => "Negate"
        case 2L => "Sign"
        case 3L => "BitwiseNot"
        case 4L => "Max"
        case other => other.toString
      }
  }
}
