package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeIs`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeIs extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeIs"

  /** VisualShaderNodeIs.set_function */
  final def setFunction(func: gdext.classes.VisualShaderNodeIs.Function): Unit = {
    if (gdext.classes.VisualShaderNodeIs.mb_set_function == null) gdext.classes.VisualShaderNodeIs.mb_set_function = MethodBind.get("VisualShaderNodeIs", "set_function", 1438374690L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeIs.mb_set_function, livePtr, func)
  }

  /** VisualShaderNodeIs.get_function */
  final def getFunction(): gdext.classes.VisualShaderNodeIs.Function = {
    if (gdext.classes.VisualShaderNodeIs.mb_get_function == null) gdext.classes.VisualShaderNodeIs.mb_get_function = MethodBind.get("VisualShaderNodeIs", "get_function", 580678557L)
    gdext.classes.VisualShaderNodeIs.Function(Ptrcall.call0[Long](gdext.classes.VisualShaderNodeIs.mb_get_function, livePtr))
  }

}

object VisualShaderNodeIs {
  private[classes] var mb_set_function: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_function: GDExtensionMethodBindPtr = null

  /** Godot enum `VisualShaderNodeIs.Function`. */
  opaque type Function <: Long = Long

  object Function {
    final val IsInf: Function = 0L.asInstanceOf[Function]
    final val IsNan: Function = 1L.asInstanceOf[Function]
    final val Max: Function = 2L.asInstanceOf[Function]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Function = value.asInstanceOf[Function]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Function] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[Function]]

    extension (self: Function)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "IsInf"
        case 1L => "IsNan"
        case 2L => "Max"
        case other => other.toString
      }
  }
}
