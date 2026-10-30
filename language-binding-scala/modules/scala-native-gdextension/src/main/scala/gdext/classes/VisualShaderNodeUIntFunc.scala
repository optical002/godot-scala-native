package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeUIntFunc`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeUIntFunc extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeUIntFunc"

  /** VisualShaderNodeUIntFunc.set_function */
  final def setFunction(func: gdext.classes.VisualShaderNodeUIntFunc.Function): Unit = {
    if (gdext.classes.VisualShaderNodeUIntFunc.mb_set_function == null) gdext.classes.VisualShaderNodeUIntFunc.mb_set_function = MethodBind.get("VisualShaderNodeUIntFunc", "set_function", 2273148961L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeUIntFunc.mb_set_function, livePtr, func)
  }

  /** VisualShaderNodeUIntFunc.get_function */
  final def getFunction(): gdext.classes.VisualShaderNodeUIntFunc.Function = {
    if (gdext.classes.VisualShaderNodeUIntFunc.mb_get_function == null) gdext.classes.VisualShaderNodeUIntFunc.mb_get_function = MethodBind.get("VisualShaderNodeUIntFunc", "get_function", 4187123296L)
    gdext.classes.VisualShaderNodeUIntFunc.Function(Ptrcall.call0[Long](gdext.classes.VisualShaderNodeUIntFunc.mb_get_function, livePtr))
  }

}

object VisualShaderNodeUIntFunc {
  private[classes] var mb_set_function: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_function: GDExtensionMethodBindPtr = null

  /** Godot enum `VisualShaderNodeUIntFunc.Function`. */
  opaque type Function <: Long = Long

  object Function {
    final val Negate: Function = 0L.asInstanceOf[Function]
    final val BitwiseNot: Function = 1L.asInstanceOf[Function]
    final val Max: Function = 2L.asInstanceOf[Function]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Function = value.asInstanceOf[Function]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Function] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[Function]]

    extension (self: Function)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Negate"
        case 1L => "BitwiseNot"
        case 2L => "Max"
        case other => other.toString
      }
  }
}
