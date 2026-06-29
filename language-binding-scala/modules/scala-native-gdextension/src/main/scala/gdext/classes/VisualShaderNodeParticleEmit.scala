package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeParticleEmit`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeParticleEmit extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeParticleEmit"

  /** VisualShaderNodeParticleEmit.set_flags */
  final def setFlags(flags: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeParticleEmit", "set_flags", 3960756792L), hostObject.objectPtr, flags)

  /** VisualShaderNodeParticleEmit.get_flags */
  final def getFlags(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeParticleEmit", "get_flags", 171277835L), hostObject.objectPtr)

}
