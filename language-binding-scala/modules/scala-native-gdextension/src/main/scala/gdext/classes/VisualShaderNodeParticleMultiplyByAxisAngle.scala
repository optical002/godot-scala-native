package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeParticleMultiplyByAxisAngle`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeParticleMultiplyByAxisAngle extends VisualShaderNode {

  /** VisualShaderNodeParticleMultiplyByAxisAngle.set_degrees_mode */
  final def setDegreesMode(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeParticleMultiplyByAxisAngle", "set_degrees_mode", 2586408642L), hostObject.objectPtr, enabled)

  /** VisualShaderNodeParticleMultiplyByAxisAngle.is_degrees_mode */
  final def isDegreesMode(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("VisualShaderNodeParticleMultiplyByAxisAngle", "is_degrees_mode", 36873697L), hostObject.objectPtr)

}

object VisualShaderNodeParticleMultiplyByAxisAngle {
  /** Class metadata for Gd[VisualShaderNodeParticleMultiplyByAxisAngle] lifetime management and casting. */
  given GodotClass[VisualShaderNodeParticleMultiplyByAxisAngle] with {
    def className = "VisualShaderNodeParticleMultiplyByAxisAngle"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeParticleMultiplyByAxisAngle = new VisualShaderNodeParticleMultiplyByAxisAngle {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeParticleMultiplyByAxisAngle): GodotObject = t.hostObject
  }
}
