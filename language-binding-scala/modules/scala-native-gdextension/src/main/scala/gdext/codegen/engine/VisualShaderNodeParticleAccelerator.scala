package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeParticleAccelerator`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeParticleAccelerator extends VisualShaderNode {

  /** VisualShaderNodeParticleAccelerator.set_mode */
  final def setMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeParticleAccelerator", "set_mode", 3457585749L), hostObject.objectPtr, mode)

  /** VisualShaderNodeParticleAccelerator.get_mode */
  final def getMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeParticleAccelerator", "get_mode", 2660365633L), hostObject.objectPtr)

}

object VisualShaderNodeParticleAccelerator {
  /** Class metadata for Gd[VisualShaderNodeParticleAccelerator] lifetime management and casting. */
  given GodotClass[VisualShaderNodeParticleAccelerator] with {
    def className = "VisualShaderNodeParticleAccelerator"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeParticleAccelerator = new VisualShaderNodeParticleAccelerator {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeParticleAccelerator): GodotObject = t.hostObject
  }
}
