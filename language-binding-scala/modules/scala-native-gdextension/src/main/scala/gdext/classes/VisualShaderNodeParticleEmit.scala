package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeParticleEmit`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeParticleEmit extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeParticleEmit"

  /** VisualShaderNodeParticleEmit.set_flags */
  final def setFlags(flags: Long): Unit = {
    if (gdext.classes.VisualShaderNodeParticleEmit.mb_set_flags == null) gdext.classes.VisualShaderNodeParticleEmit.mb_set_flags = MethodBind.get("VisualShaderNodeParticleEmit", "set_flags", 3960756792L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeParticleEmit.mb_set_flags, livePtr, flags)
  }

  /** VisualShaderNodeParticleEmit.get_flags */
  final def getFlags(): Long = {
    if (gdext.classes.VisualShaderNodeParticleEmit.mb_get_flags == null) gdext.classes.VisualShaderNodeParticleEmit.mb_get_flags = MethodBind.get("VisualShaderNodeParticleEmit", "get_flags", 171277835L)
    Ptrcall.call0[Long](gdext.classes.VisualShaderNodeParticleEmit.mb_get_flags, livePtr)
  }

}

object VisualShaderNodeParticleEmit {
  private[classes] var mb_set_flags: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_flags: GDExtensionMethodBindPtr = null
}
