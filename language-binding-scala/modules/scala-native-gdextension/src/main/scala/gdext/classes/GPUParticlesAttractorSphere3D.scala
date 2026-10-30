package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `GPUParticlesAttractorSphere3D`, extends `GPUParticlesAttractor3D`. */
abstract class GPUParticlesAttractorSphere3D extends GPUParticlesAttractor3D {
  override def godotClassName: String = "GPUParticlesAttractorSphere3D"

  /** GPUParticlesAttractorSphere3D.set_radius */
  final def setRadius(radius: Double): Unit = {
    if (gdext.classes.GPUParticlesAttractorSphere3D.mb_set_radius == null) gdext.classes.GPUParticlesAttractorSphere3D.mb_set_radius = MethodBind.get("GPUParticlesAttractorSphere3D", "set_radius", 373806689L)
    Ptrcall.callVoid1(gdext.classes.GPUParticlesAttractorSphere3D.mb_set_radius, livePtr, radius)
  }

  /** GPUParticlesAttractorSphere3D.get_radius */
  final def getRadius(): Double = {
    if (gdext.classes.GPUParticlesAttractorSphere3D.mb_get_radius == null) gdext.classes.GPUParticlesAttractorSphere3D.mb_get_radius = MethodBind.get("GPUParticlesAttractorSphere3D", "get_radius", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.GPUParticlesAttractorSphere3D.mb_get_radius, livePtr)
  }

}

object GPUParticlesAttractorSphere3D {
  private[classes] var mb_set_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_radius: GDExtensionMethodBindPtr = null
}
