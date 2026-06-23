package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `GPUParticlesAttractor3D`, extends `VisualInstance3D`. */
abstract class GPUParticlesAttractor3D extends VisualInstance3D {

  /** GPUParticlesAttractor3D.set_cull_mask */
  final def setCullMask(mask: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticlesAttractor3D", "set_cull_mask", 1286410249L), hostObject.objectPtr, mask)

  /** GPUParticlesAttractor3D.get_cull_mask */
  final def getCullMask(): Long =
    Ptrcall.call0[Long](MethodBind.get("GPUParticlesAttractor3D", "get_cull_mask", 3905245786L), hostObject.objectPtr)

  /** GPUParticlesAttractor3D.set_strength */
  final def setStrength(strength: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticlesAttractor3D", "set_strength", 373806689L), hostObject.objectPtr, strength)

  /** GPUParticlesAttractor3D.get_strength */
  final def getStrength(): Double =
    Ptrcall.call0[Double](MethodBind.get("GPUParticlesAttractor3D", "get_strength", 1740695150L), hostObject.objectPtr)

  /** GPUParticlesAttractor3D.set_attenuation */
  final def setAttenuation(attenuation: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticlesAttractor3D", "set_attenuation", 373806689L), hostObject.objectPtr, attenuation)

  /** GPUParticlesAttractor3D.get_attenuation */
  final def getAttenuation(): Double =
    Ptrcall.call0[Double](MethodBind.get("GPUParticlesAttractor3D", "get_attenuation", 1740695150L), hostObject.objectPtr)

  /** GPUParticlesAttractor3D.set_directionality */
  final def setDirectionality(amount: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticlesAttractor3D", "set_directionality", 373806689L), hostObject.objectPtr, amount)

  /** GPUParticlesAttractor3D.get_directionality */
  final def getDirectionality(): Double =
    Ptrcall.call0[Double](MethodBind.get("GPUParticlesAttractor3D", "get_directionality", 1740695150L), hostObject.objectPtr)

}

object GPUParticlesAttractor3D {
  /** Class metadata for Gd[GPUParticlesAttractor3D] lifetime management and casting. */
  given GodotClass[GPUParticlesAttractor3D] with {
    def className = "GPUParticlesAttractor3D"
    def isRefCounted = false
    def wrap(o: GodotObject): GPUParticlesAttractor3D = new GPUParticlesAttractor3D {}.withHost(o.objectPtr)
    def unwrap(t: GPUParticlesAttractor3D): GodotObject = t.hostObject
  }
}
