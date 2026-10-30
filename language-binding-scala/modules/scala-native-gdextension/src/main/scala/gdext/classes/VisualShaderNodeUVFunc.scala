package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeUVFunc`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeUVFunc extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeUVFunc"

  /** VisualShaderNodeUVFunc.set_function */
  final def setFunction(func: gdext.classes.VisualShaderNodeUVFunc.Function): Unit = {
    if (gdext.classes.VisualShaderNodeUVFunc.mb_set_function == null) gdext.classes.VisualShaderNodeUVFunc.mb_set_function = MethodBind.get("VisualShaderNodeUVFunc", "set_function", 765791915L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeUVFunc.mb_set_function, livePtr, func)
  }

  /** VisualShaderNodeUVFunc.get_function */
  final def getFunction(): gdext.classes.VisualShaderNodeUVFunc.Function = {
    if (gdext.classes.VisualShaderNodeUVFunc.mb_get_function == null) gdext.classes.VisualShaderNodeUVFunc.mb_get_function = MethodBind.get("VisualShaderNodeUVFunc", "get_function", 3772902164L)
    gdext.classes.VisualShaderNodeUVFunc.Function(Ptrcall.call0[Long](gdext.classes.VisualShaderNodeUVFunc.mb_get_function, livePtr))
  }

}

object VisualShaderNodeUVFunc {
  private[classes] var mb_set_function: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_function: GDExtensionMethodBindPtr = null

  /** Godot enum `VisualShaderNodeUVFunc.Function`. */
  opaque type Function <: Long = Long

  object Function {
    final val Panning: Function = 0L.asInstanceOf[Function]
    final val Scaling: Function = 1L.asInstanceOf[Function]
    final val Max: Function = 2L.asInstanceOf[Function]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Function = value.asInstanceOf[Function]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Function] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[Function]]

    extension (self: Function)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Panning"
        case 1L => "Scaling"
        case 2L => "Max"
        case other => other.toString
      }
  }
}
