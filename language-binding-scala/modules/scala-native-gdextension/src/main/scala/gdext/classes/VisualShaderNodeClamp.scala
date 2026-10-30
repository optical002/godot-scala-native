package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeClamp`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeClamp extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeClamp"

  /** VisualShaderNodeClamp.set_op_type */
  final def setOpType(opType: gdext.classes.VisualShaderNodeClamp.OpType): Unit = {
    if (gdext.classes.VisualShaderNodeClamp.mb_set_op_type == null) gdext.classes.VisualShaderNodeClamp.mb_set_op_type = MethodBind.get("VisualShaderNodeClamp", "set_op_type", 405010749L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeClamp.mb_set_op_type, livePtr, opType)
  }

  /** VisualShaderNodeClamp.get_op_type */
  final def getOpType(): gdext.classes.VisualShaderNodeClamp.OpType = {
    if (gdext.classes.VisualShaderNodeClamp.mb_get_op_type == null) gdext.classes.VisualShaderNodeClamp.mb_get_op_type = MethodBind.get("VisualShaderNodeClamp", "get_op_type", 233276050L)
    gdext.classes.VisualShaderNodeClamp.OpType(Ptrcall.call0[Long](gdext.classes.VisualShaderNodeClamp.mb_get_op_type, livePtr))
  }

}

object VisualShaderNodeClamp {
  private[classes] var mb_set_op_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_op_type: GDExtensionMethodBindPtr = null

  /** Godot enum `VisualShaderNodeClamp.OpType`. */
  opaque type OpType <: Long = Long

  object OpType {
    final val Float: OpType = 0L.asInstanceOf[OpType]
    final val Int: OpType = 1L.asInstanceOf[OpType]
    final val Uint: OpType = 2L.asInstanceOf[OpType]
    final val Vector2d: OpType = 3L.asInstanceOf[OpType]
    final val Vector3d: OpType = 4L.asInstanceOf[OpType]
    final val Vector4d: OpType = 5L.asInstanceOf[OpType]
    final val Max: OpType = 6L.asInstanceOf[OpType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): OpType = value.asInstanceOf[OpType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[OpType] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L).asInstanceOf[scala.IArray[OpType]]

    extension (self: OpType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Float"
        case 1L => "Int"
        case 2L => "Uint"
        case 3L => "Vector2d"
        case 4L => "Vector3d"
        case 5L => "Vector4d"
        case 6L => "Max"
        case other => other.toString
      }
  }
}
