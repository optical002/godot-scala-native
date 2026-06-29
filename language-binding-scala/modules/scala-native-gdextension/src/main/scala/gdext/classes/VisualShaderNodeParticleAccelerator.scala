package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeParticleAccelerator`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeParticleAccelerator extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeParticleAccelerator"

  /** VisualShaderNodeParticleAccelerator.set_mode */
  final def setMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeParticleAccelerator", "set_mode", 3457585749L), hostObject.objectPtr, mode)

  /** VisualShaderNodeParticleAccelerator.get_mode */
  final def getMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeParticleAccelerator", "get_mode", 2660365633L), hostObject.objectPtr)

}
