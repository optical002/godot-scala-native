package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeParticleRandomness`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeParticleRandomness extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeParticleRandomness"

  /** VisualShaderNodeParticleRandomness.set_op_type */
  final def setOpType(`type`: gdext.classes.VisualShaderNodeParticleRandomness.OpType): Unit = {
    if (gdext.classes.VisualShaderNodeParticleRandomness.mb_set_op_type == null) gdext.classes.VisualShaderNodeParticleRandomness.mb_set_op_type = MethodBind.get("VisualShaderNodeParticleRandomness", "set_op_type", 2060089061L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeParticleRandomness.mb_set_op_type, livePtr, `type`)
  }

  /** VisualShaderNodeParticleRandomness.get_op_type */
  final def getOpType(): gdext.classes.VisualShaderNodeParticleRandomness.OpType = {
    if (gdext.classes.VisualShaderNodeParticleRandomness.mb_get_op_type == null) gdext.classes.VisualShaderNodeParticleRandomness.mb_get_op_type = MethodBind.get("VisualShaderNodeParticleRandomness", "get_op_type", 3597061078L)
    gdext.classes.VisualShaderNodeParticleRandomness.OpType(Ptrcall.call0[Long](gdext.classes.VisualShaderNodeParticleRandomness.mb_get_op_type, livePtr))
  }

}

object VisualShaderNodeParticleRandomness {
  private[classes] var mb_set_op_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_op_type: GDExtensionMethodBindPtr = null

  /** Godot enum `VisualShaderNodeParticleRandomness.OpType`. */
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
