package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeParticleMultiplyByAxisAngle`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeParticleMultiplyByAxisAngle extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeParticleMultiplyByAxisAngle"

  /** VisualShaderNodeParticleMultiplyByAxisAngle.set_degrees_mode */
  final def setDegreesMode(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeParticleMultiplyByAxisAngle", "set_degrees_mode", 2586408642L), hostObject.objectPtr, enabled)

  /** VisualShaderNodeParticleMultiplyByAxisAngle.is_degrees_mode */
  final def isDegreesMode(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("VisualShaderNodeParticleMultiplyByAxisAngle", "is_degrees_mode", 36873697L), hostObject.objectPtr)

}
