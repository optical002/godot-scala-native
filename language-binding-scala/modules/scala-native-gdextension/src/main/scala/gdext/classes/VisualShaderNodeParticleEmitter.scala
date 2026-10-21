package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeParticleEmitter`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeParticleEmitter extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeParticleEmitter"

  /** VisualShaderNodeParticleEmitter.set_mode_2d */
  final def setMode2d(enabled: Boolean): Unit = {
    if (gdext.classes.VisualShaderNodeParticleEmitter.mb_set_mode_2d == null) gdext.classes.VisualShaderNodeParticleEmitter.mb_set_mode_2d = MethodBind.get("VisualShaderNodeParticleEmitter", "set_mode_2d", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeParticleEmitter.mb_set_mode_2d, livePtr, enabled)
  }

  /** VisualShaderNodeParticleEmitter.is_mode_2d */
  final def isMode2d(): Boolean = {
    if (gdext.classes.VisualShaderNodeParticleEmitter.mb_is_mode_2d == null) gdext.classes.VisualShaderNodeParticleEmitter.mb_is_mode_2d = MethodBind.get("VisualShaderNodeParticleEmitter", "is_mode_2d", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.VisualShaderNodeParticleEmitter.mb_is_mode_2d, livePtr)
  }

}

object VisualShaderNodeParticleEmitter {
  private[classes] var mb_set_mode_2d: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_mode_2d: GDExtensionMethodBindPtr = null
}
