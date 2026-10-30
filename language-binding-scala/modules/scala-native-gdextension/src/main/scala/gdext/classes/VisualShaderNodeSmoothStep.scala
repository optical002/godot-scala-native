package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeSmoothStep`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeSmoothStep extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeSmoothStep"

  /** VisualShaderNodeSmoothStep.set_op_type */
  final def setOpType(opType: gdext.classes.VisualShaderNodeSmoothStep.OpType): Unit = {
    if (gdext.classes.VisualShaderNodeSmoothStep.mb_set_op_type == null) gdext.classes.VisualShaderNodeSmoothStep.mb_set_op_type = MethodBind.get("VisualShaderNodeSmoothStep", "set_op_type", 2427426148L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeSmoothStep.mb_set_op_type, livePtr, opType)
  }

  /** VisualShaderNodeSmoothStep.get_op_type */
  final def getOpType(): gdext.classes.VisualShaderNodeSmoothStep.OpType = {
    if (gdext.classes.VisualShaderNodeSmoothStep.mb_get_op_type == null) gdext.classes.VisualShaderNodeSmoothStep.mb_get_op_type = MethodBind.get("VisualShaderNodeSmoothStep", "get_op_type", 359640855L)
    gdext.classes.VisualShaderNodeSmoothStep.OpType(Ptrcall.call0[Long](gdext.classes.VisualShaderNodeSmoothStep.mb_get_op_type, livePtr))
  }

}

object VisualShaderNodeSmoothStep {
  private[classes] var mb_set_op_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_op_type: GDExtensionMethodBindPtr = null

  /** Godot enum `VisualShaderNodeSmoothStep.OpType`. */
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
