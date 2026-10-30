package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeVectorBase`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeVectorBase extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeVectorBase"

  /** VisualShaderNodeVectorBase.set_op_type */
  final def setOpType(`type`: gdext.classes.VisualShaderNodeVectorBase.OpType): Unit = {
    if (gdext.classes.VisualShaderNodeVectorBase.mb_set_op_type == null) gdext.classes.VisualShaderNodeVectorBase.mb_set_op_type = MethodBind.get("VisualShaderNodeVectorBase", "set_op_type", 1692596998L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeVectorBase.mb_set_op_type, livePtr, `type`)
  }

  /** VisualShaderNodeVectorBase.get_op_type */
  final def getOpType(): gdext.classes.VisualShaderNodeVectorBase.OpType = {
    if (gdext.classes.VisualShaderNodeVectorBase.mb_get_op_type == null) gdext.classes.VisualShaderNodeVectorBase.mb_get_op_type = MethodBind.get("VisualShaderNodeVectorBase", "get_op_type", 2568738462L)
    gdext.classes.VisualShaderNodeVectorBase.OpType(Ptrcall.call0[Long](gdext.classes.VisualShaderNodeVectorBase.mb_get_op_type, livePtr))
  }

}

object VisualShaderNodeVectorBase {
  private[classes] var mb_set_op_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_op_type: GDExtensionMethodBindPtr = null

  /** Godot enum `VisualShaderNodeVectorBase.OpType`. */
  opaque type OpType <: Long = Long

  object OpType {
    final val Vector2d: OpType = 0L.asInstanceOf[OpType]
    final val Vector3d: OpType = 1L.asInstanceOf[OpType]
    final val Vector4d: OpType = 2L.asInstanceOf[OpType]
    final val Max: OpType = 3L.asInstanceOf[OpType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): OpType = value.asInstanceOf[OpType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[OpType] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[OpType]]

    extension (self: OpType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Vector2d"
        case 1L => "Vector3d"
        case 2L => "Vector4d"
        case 3L => "Max"
        case other => other.toString
      }
  }
}
