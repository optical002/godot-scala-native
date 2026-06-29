package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `GPUParticlesAttractorSphere3D`, extends `GPUParticlesAttractor3D`. */
abstract class GPUParticlesAttractorSphere3D extends GPUParticlesAttractor3D {
  override def godotClassName: String = "GPUParticlesAttractorSphere3D"

  /** GPUParticlesAttractorSphere3D.set_radius */
  final def setRadius(radius: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticlesAttractorSphere3D", "set_radius", 373806689L), hostObject.objectPtr, radius)

  /** GPUParticlesAttractorSphere3D.get_radius */
  final def getRadius(): Double =
    Ptrcall.call0[Double](MethodBind.get("GPUParticlesAttractorSphere3D", "get_radius", 1740695150L), hostObject.objectPtr)

}
