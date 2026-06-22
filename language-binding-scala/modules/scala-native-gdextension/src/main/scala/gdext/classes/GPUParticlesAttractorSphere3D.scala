package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `GPUParticlesAttractorSphere3D`, extends `GPUParticlesAttractor3D`. */
abstract class GPUParticlesAttractorSphere3D extends GPUParticlesAttractor3D {

  /** GPUParticlesAttractorSphere3D.set_radius */
  final def setRadius(radius: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticlesAttractorSphere3D", "set_radius", 373806689L), hostObject.objectPtr, radius)

  /** GPUParticlesAttractorSphere3D.get_radius */
  final def getRadius(): Double =
    Ptrcall.call0[Double](MethodBind.get("GPUParticlesAttractorSphere3D", "get_radius", 1740695150L), hostObject.objectPtr)

}

object GPUParticlesAttractorSphere3D {
  /** Class metadata for Gd[GPUParticlesAttractorSphere3D] lifetime management and casting. */
  given GodotClass[GPUParticlesAttractorSphere3D] with {
    def className = "GPUParticlesAttractorSphere3D"
    def isRefCounted = false
    def wrap(o: GodotObject): GPUParticlesAttractorSphere3D = new GPUParticlesAttractorSphere3D {}.withHost(o.objectPtr)
    def unwrap(t: GPUParticlesAttractorSphere3D): GodotObject = t.hostObject
  }
}
