package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeParticleEmitter`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeParticleEmitter extends VisualShaderNode {

  /** VisualShaderNodeParticleEmitter.set_mode_2d */
  final def setMode2d(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeParticleEmitter", "set_mode_2d", 2586408642L), hostObject.objectPtr, enabled)

  /** VisualShaderNodeParticleEmitter.is_mode_2d */
  final def isMode2d(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("VisualShaderNodeParticleEmitter", "is_mode_2d", 36873697L), hostObject.objectPtr)

}

object VisualShaderNodeParticleEmitter {
  /** Class metadata for Gd[VisualShaderNodeParticleEmitter] lifetime management and casting. */
  given GodotClass[VisualShaderNodeParticleEmitter] with {
    def className = "VisualShaderNodeParticleEmitter"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeParticleEmitter = new VisualShaderNodeParticleEmitter {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeParticleEmitter): GodotObject = t.hostObject
  }
}
