package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeParticleEmitter`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeParticleEmitter extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeParticleEmitter"

  /** VisualShaderNodeParticleEmitter.set_mode_2d */
  final def setMode2d(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeParticleEmitter", "set_mode_2d", 2586408642L), hostObject.objectPtr, enabled)

  /** VisualShaderNodeParticleEmitter.is_mode_2d */
  final def isMode2d(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("VisualShaderNodeParticleEmitter", "is_mode_2d", 36873697L), hostObject.objectPtr)

}
