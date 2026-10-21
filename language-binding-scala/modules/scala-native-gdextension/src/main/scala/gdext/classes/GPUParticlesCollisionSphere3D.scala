package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `GPUParticlesCollisionSphere3D`, extends `GPUParticlesCollision3D`. */
abstract class GPUParticlesCollisionSphere3D extends GPUParticlesCollision3D {
  override def godotClassName: String = "GPUParticlesCollisionSphere3D"

  /** GPUParticlesCollisionSphere3D.set_radius */
  final def setRadius(radius: Double): Unit = {
    if (gdext.classes.GPUParticlesCollisionSphere3D.mb_set_radius == null) gdext.classes.GPUParticlesCollisionSphere3D.mb_set_radius = MethodBind.get("GPUParticlesCollisionSphere3D", "set_radius", 373806689L)
    Ptrcall.callVoid1(gdext.classes.GPUParticlesCollisionSphere3D.mb_set_radius, livePtr, radius)
  }

  /** GPUParticlesCollisionSphere3D.get_radius */
  final def getRadius(): Double = {
    if (gdext.classes.GPUParticlesCollisionSphere3D.mb_get_radius == null) gdext.classes.GPUParticlesCollisionSphere3D.mb_get_radius = MethodBind.get("GPUParticlesCollisionSphere3D", "get_radius", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.GPUParticlesCollisionSphere3D.mb_get_radius, livePtr)
  }

}

object GPUParticlesCollisionSphere3D {
  private[classes] var mb_set_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_radius: GDExtensionMethodBindPtr = null
}
