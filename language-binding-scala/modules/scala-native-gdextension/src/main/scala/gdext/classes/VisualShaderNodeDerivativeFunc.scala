package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeDerivativeFunc`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeDerivativeFunc extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeDerivativeFunc"

  /** VisualShaderNodeDerivativeFunc.set_op_type */
  final def setOpType(`type`: gdext.classes.VisualShaderNodeDerivativeFunc.OpType): Unit = {
    if (gdext.classes.VisualShaderNodeDerivativeFunc.mb_set_op_type == null) gdext.classes.VisualShaderNodeDerivativeFunc.mb_set_op_type = MethodBind.get("VisualShaderNodeDerivativeFunc", "set_op_type", 377800221L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeDerivativeFunc.mb_set_op_type, livePtr, `type`)
  }

  /** VisualShaderNodeDerivativeFunc.get_op_type */
  final def getOpType(): gdext.classes.VisualShaderNodeDerivativeFunc.OpType = {
    if (gdext.classes.VisualShaderNodeDerivativeFunc.mb_get_op_type == null) gdext.classes.VisualShaderNodeDerivativeFunc.mb_get_op_type = MethodBind.get("VisualShaderNodeDerivativeFunc", "get_op_type", 3997800514L)
    gdext.classes.VisualShaderNodeDerivativeFunc.OpType(Ptrcall.call0[Long](gdext.classes.VisualShaderNodeDerivativeFunc.mb_get_op_type, livePtr))
  }

  /** VisualShaderNodeDerivativeFunc.set_function */
  final def setFunction(func: gdext.classes.VisualShaderNodeDerivativeFunc.Function): Unit = {
    if (gdext.classes.VisualShaderNodeDerivativeFunc.mb_set_function == null) gdext.classes.VisualShaderNodeDerivativeFunc.mb_set_function = MethodBind.get("VisualShaderNodeDerivativeFunc", "set_function", 1944704156L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeDerivativeFunc.mb_set_function, livePtr, func)
  }

  /** VisualShaderNodeDerivativeFunc.get_function */
  final def getFunction(): gdext.classes.VisualShaderNodeDerivativeFunc.Function = {
    if (gdext.classes.VisualShaderNodeDerivativeFunc.mb_get_function == null) gdext.classes.VisualShaderNodeDerivativeFunc.mb_get_function = MethodBind.get("VisualShaderNodeDerivativeFunc", "get_function", 2389093396L)
    gdext.classes.VisualShaderNodeDerivativeFunc.Function(Ptrcall.call0[Long](gdext.classes.VisualShaderNodeDerivativeFunc.mb_get_function, livePtr))
  }

  /** VisualShaderNodeDerivativeFunc.set_precision */
  final def setPrecision(precision: gdext.classes.VisualShaderNodeDerivativeFunc.Precision): Unit = {
    if (gdext.classes.VisualShaderNodeDerivativeFunc.mb_set_precision == null) gdext.classes.VisualShaderNodeDerivativeFunc.mb_set_precision = MethodBind.get("VisualShaderNodeDerivativeFunc", "set_precision", 797270566L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeDerivativeFunc.mb_set_precision, livePtr, precision)
  }

  /** VisualShaderNodeDerivativeFunc.get_precision */
  final def getPrecision(): gdext.classes.VisualShaderNodeDerivativeFunc.Precision = {
    if (gdext.classes.VisualShaderNodeDerivativeFunc.mb_get_precision == null) gdext.classes.VisualShaderNodeDerivativeFunc.mb_get_precision = MethodBind.get("VisualShaderNodeDerivativeFunc", "get_precision", 3822547323L)
    gdext.classes.VisualShaderNodeDerivativeFunc.Precision(Ptrcall.call0[Long](gdext.classes.VisualShaderNodeDerivativeFunc.mb_get_precision, livePtr))
  }

}

object VisualShaderNodeDerivativeFunc {
  private[classes] var mb_set_op_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_op_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_function: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_function: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_precision: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_precision: GDExtensionMethodBindPtr = null

  /** Godot enum `VisualShaderNodeDerivativeFunc.OpType`. */
  opaque type OpType <: Long = Long

  object OpType {
    final val Scalar: OpType = 0L.asInstanceOf[OpType]
    final val Vector2d: OpType = 1L.asInstanceOf[OpType]
    final val Vector3d: OpType = 2L.asInstanceOf[OpType]
    final val Vector4d: OpType = 3L.asInstanceOf[OpType]
    final val Max: OpType = 4L.asInstanceOf[OpType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): OpType = value.asInstanceOf[OpType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[OpType] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L).asInstanceOf[scala.IArray[OpType]]

    extension (self: OpType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Scalar"
        case 1L => "Vector2d"
        case 2L => "Vector3d"
        case 3L => "Vector4d"
        case 4L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `VisualShaderNodeDerivativeFunc.Function`. */
  opaque type Function <: Long = Long

  object Function {
    final val Sum: Function = 0L.asInstanceOf[Function]
    final val X: Function = 1L.asInstanceOf[Function]
    final val Y: Function = 2L.asInstanceOf[Function]
    final val Max: Function = 3L.asInstanceOf[Function]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Function = value.asInstanceOf[Function]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Function] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[Function]]

    extension (self: Function)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Sum"
        case 1L => "X"
        case 2L => "Y"
        case 3L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `VisualShaderNodeDerivativeFunc.Precision`. */
  opaque type Precision <: Long = Long

  object Precision {
    final val None: Precision = 0L.asInstanceOf[Precision]
    final val Coarse: Precision = 1L.asInstanceOf[Precision]
    final val Fine: Precision = 2L.asInstanceOf[Precision]
    final val Max: Precision = 3L.asInstanceOf[Precision]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Precision = value.asInstanceOf[Precision]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Precision] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[Precision]]

    extension (self: Precision)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "None"
        case 1L => "Coarse"
        case 2L => "Fine"
        case 3L => "Max"
        case other => other.toString
      }
  }
}
