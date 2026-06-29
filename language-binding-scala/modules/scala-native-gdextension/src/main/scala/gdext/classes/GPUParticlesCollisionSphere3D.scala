package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `GPUParticlesCollisionSphere3D`, extends `GPUParticlesCollision3D`. */
abstract class GPUParticlesCollisionSphere3D extends GPUParticlesCollision3D {
  override def godotClassName: String = "GPUParticlesCollisionSphere3D"

  /** GPUParticlesCollisionSphere3D.set_radius */
  final def setRadius(radius: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticlesCollisionSphere3D", "set_radius", 373806689L), hostObject.objectPtr, radius)

  /** GPUParticlesCollisionSphere3D.get_radius */
  final def getRadius(): Double =
    Ptrcall.call0[Double](MethodBind.get("GPUParticlesCollisionSphere3D", "get_radius", 1740695150L), hostObject.objectPtr)

}
