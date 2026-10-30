package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeTransformFunc`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeTransformFunc extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeTransformFunc"

  /** VisualShaderNodeTransformFunc.set_function */
  final def setFunction(func: gdext.classes.VisualShaderNodeTransformFunc.Function): Unit = {
    if (gdext.classes.VisualShaderNodeTransformFunc.mb_set_function == null) gdext.classes.VisualShaderNodeTransformFunc.mb_set_function = MethodBind.get("VisualShaderNodeTransformFunc", "set_function", 2900990409L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeTransformFunc.mb_set_function, livePtr, func)
  }

  /** VisualShaderNodeTransformFunc.get_function */
  final def getFunction(): gdext.classes.VisualShaderNodeTransformFunc.Function = {
    if (gdext.classes.VisualShaderNodeTransformFunc.mb_get_function == null) gdext.classes.VisualShaderNodeTransformFunc.mb_get_function = MethodBind.get("VisualShaderNodeTransformFunc", "get_function", 2839926569L)
    gdext.classes.VisualShaderNodeTransformFunc.Function(Ptrcall.call0[Long](gdext.classes.VisualShaderNodeTransformFunc.mb_get_function, livePtr))
  }

}

object VisualShaderNodeTransformFunc {
  private[classes] var mb_set_function: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_function: GDExtensionMethodBindPtr = null

  /** Godot enum `VisualShaderNodeTransformFunc.Function`. */
  opaque type Function <: Long = Long

  object Function {
    final val Inverse: Function = 0L.asInstanceOf[Function]
    final val Transpose: Function = 1L.asInstanceOf[Function]
    final val Max: Function = 2L.asInstanceOf[Function]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Function = value.asInstanceOf[Function]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Function] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[Function]]

    extension (self: Function)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Inverse"
        case 1L => "Transpose"
        case 2L => "Max"
        case other => other.toString
      }
  }
}
