package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeMultiplyAdd`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeMultiplyAdd extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeMultiplyAdd"

  /** VisualShaderNodeMultiplyAdd.set_op_type */
  final def setOpType(`type`: gdext.classes.VisualShaderNodeMultiplyAdd.OpType): Unit = {
    if (gdext.classes.VisualShaderNodeMultiplyAdd.mb_set_op_type == null) gdext.classes.VisualShaderNodeMultiplyAdd.mb_set_op_type = MethodBind.get("VisualShaderNodeMultiplyAdd", "set_op_type", 1409862380L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeMultiplyAdd.mb_set_op_type, livePtr, `type`)
  }

  /** VisualShaderNodeMultiplyAdd.get_op_type */
  final def getOpType(): gdext.classes.VisualShaderNodeMultiplyAdd.OpType = {
    if (gdext.classes.VisualShaderNodeMultiplyAdd.mb_get_op_type == null) gdext.classes.VisualShaderNodeMultiplyAdd.mb_get_op_type = MethodBind.get("VisualShaderNodeMultiplyAdd", "get_op_type", 2823201991L)
    gdext.classes.VisualShaderNodeMultiplyAdd.OpType(Ptrcall.call0[Long](gdext.classes.VisualShaderNodeMultiplyAdd.mb_get_op_type, livePtr))
  }

}

object VisualShaderNodeMultiplyAdd {
  private[classes] var mb_set_op_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_op_type: GDExtensionMethodBindPtr = null

  /** Godot enum `VisualShaderNodeMultiplyAdd.OpType`. */
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
}
