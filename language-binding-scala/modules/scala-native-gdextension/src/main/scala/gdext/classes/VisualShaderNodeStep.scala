package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeStep`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeStep extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeStep"

  /** VisualShaderNodeStep.set_op_type */
  final def setOpType(opType: gdext.classes.VisualShaderNodeStep.OpType): Unit = {
    if (gdext.classes.VisualShaderNodeStep.mb_set_op_type == null) gdext.classes.VisualShaderNodeStep.mb_set_op_type = MethodBind.get("VisualShaderNodeStep", "set_op_type", 715172489L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeStep.mb_set_op_type, livePtr, opType)
  }

  /** VisualShaderNodeStep.get_op_type */
  final def getOpType(): gdext.classes.VisualShaderNodeStep.OpType = {
    if (gdext.classes.VisualShaderNodeStep.mb_get_op_type == null) gdext.classes.VisualShaderNodeStep.mb_get_op_type = MethodBind.get("VisualShaderNodeStep", "get_op_type", 3274022781L)
    gdext.classes.VisualShaderNodeStep.OpType(Ptrcall.call0[Long](gdext.classes.VisualShaderNodeStep.mb_get_op_type, livePtr))
  }

}

object VisualShaderNodeStep {
  private[classes] var mb_set_op_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_op_type: GDExtensionMethodBindPtr = null

  /** Godot enum `VisualShaderNodeStep.OpType`. */
  opaque type OpType <: Long = Long

  object OpType {
    final val Scalar: OpType = 0L.asInstanceOf[OpType]
    final val Vector2d: OpType = 1L.asInstanceOf[OpType]
    final val Vector2dScalar: OpType = 2L.asInstanceOf[OpType]
    final val Vector3d: OpType = 3L.asInstanceOf[OpType]
    final val Vector3dScalar: OpType = 4L.asInstanceOf[OpType]
    final val Vector4d: OpType = 5L.asInstanceOf[OpType]
    final val Vector4dScalar: OpType = 6L.asInstanceOf[OpType]
    final val Max: OpType = 7L.asInstanceOf[OpType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): OpType = value.asInstanceOf[OpType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[OpType] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L).asInstanceOf[scala.IArray[OpType]]

    extension (self: OpType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Scalar"
        case 1L => "Vector2d"
        case 2L => "Vector2dScalar"
        case 3L => "Vector3d"
        case 4L => "Vector3dScalar"
        case 5L => "Vector4d"
        case 6L => "Vector4dScalar"
        case 7L => "Max"
        case other => other.toString
      }
  }
}
