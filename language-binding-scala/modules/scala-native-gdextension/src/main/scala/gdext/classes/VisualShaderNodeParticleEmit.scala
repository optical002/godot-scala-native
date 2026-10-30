package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeParticleEmit`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeParticleEmit extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeParticleEmit"

  /** VisualShaderNodeParticleEmit.set_flags */
  final def setFlags(flags: gdext.classes.VisualShaderNodeParticleEmit.EmitFlags): Unit = {
    if (gdext.classes.VisualShaderNodeParticleEmit.mb_set_flags == null) gdext.classes.VisualShaderNodeParticleEmit.mb_set_flags = MethodBind.get("VisualShaderNodeParticleEmit", "set_flags", 3960756792L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeParticleEmit.mb_set_flags, livePtr, flags)
  }

  /** VisualShaderNodeParticleEmit.get_flags */
  final def getFlags(): gdext.classes.VisualShaderNodeParticleEmit.EmitFlags = {
    if (gdext.classes.VisualShaderNodeParticleEmit.mb_get_flags == null) gdext.classes.VisualShaderNodeParticleEmit.mb_get_flags = MethodBind.get("VisualShaderNodeParticleEmit", "get_flags", 171277835L)
    gdext.classes.VisualShaderNodeParticleEmit.EmitFlags(Ptrcall.call0[Long](gdext.classes.VisualShaderNodeParticleEmit.mb_get_flags, livePtr))
  }

}

object VisualShaderNodeParticleEmit {
  private[classes] var mb_set_flags: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_flags: GDExtensionMethodBindPtr = null

  /** Godot enum `VisualShaderNodeParticleEmit.EmitFlags`. */
  opaque type EmitFlags <: Long = Long

  object EmitFlags {
    final val Position: EmitFlags = 1L.asInstanceOf[EmitFlags]
    final val RotScale: EmitFlags = 2L.asInstanceOf[EmitFlags]
    final val Velocity: EmitFlags = 4L.asInstanceOf[EmitFlags]
    final val Color: EmitFlags = 8L.asInstanceOf[EmitFlags]
    final val Custom: EmitFlags = 16L.asInstanceOf[EmitFlags]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): EmitFlags = value.asInstanceOf[EmitFlags]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[EmitFlags] = scala.IArray[Long](1L, 2L, 4L, 8L, 16L).asInstanceOf[scala.IArray[EmitFlags]]

    extension (self: EmitFlags)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 1L => "Position"
        case 2L => "RotScale"
        case 4L => "Velocity"
        case 8L => "Color"
        case 16L => "Custom"
        case other => other.toString
      }
  }
}
