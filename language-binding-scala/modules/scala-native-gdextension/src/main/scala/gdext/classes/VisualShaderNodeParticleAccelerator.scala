package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeParticleAccelerator`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeParticleAccelerator extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeParticleAccelerator"

  /** VisualShaderNodeParticleAccelerator.set_mode */
  final def setMode(mode: gdext.classes.VisualShaderNodeParticleAccelerator.Mode): Unit = {
    if (gdext.classes.VisualShaderNodeParticleAccelerator.mb_set_mode == null) gdext.classes.VisualShaderNodeParticleAccelerator.mb_set_mode = MethodBind.get("VisualShaderNodeParticleAccelerator", "set_mode", 3457585749L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeParticleAccelerator.mb_set_mode, livePtr, mode)
  }

  /** VisualShaderNodeParticleAccelerator.get_mode */
  final def getMode(): gdext.classes.VisualShaderNodeParticleAccelerator.Mode = {
    if (gdext.classes.VisualShaderNodeParticleAccelerator.mb_get_mode == null) gdext.classes.VisualShaderNodeParticleAccelerator.mb_get_mode = MethodBind.get("VisualShaderNodeParticleAccelerator", "get_mode", 2660365633L)
    gdext.classes.VisualShaderNodeParticleAccelerator.Mode(Ptrcall.call0[Long](gdext.classes.VisualShaderNodeParticleAccelerator.mb_get_mode, livePtr))
  }

}

object VisualShaderNodeParticleAccelerator {
  private[classes] var mb_set_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_mode: GDExtensionMethodBindPtr = null

  /** Godot enum `VisualShaderNodeParticleAccelerator.Mode`. */
  opaque type Mode <: Long = Long

  object Mode {
    final val Linear: Mode = 0L.asInstanceOf[Mode]
    final val Radial: Mode = 1L.asInstanceOf[Mode]
    final val Tangential: Mode = 2L.asInstanceOf[Mode]
    final val Max: Mode = 3L.asInstanceOf[Mode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Mode = value.asInstanceOf[Mode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Mode] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[Mode]]

    extension (self: Mode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Linear"
        case 1L => "Radial"
        case 2L => "Tangential"
        case 3L => "Max"
        case other => other.toString
      }
  }
}
