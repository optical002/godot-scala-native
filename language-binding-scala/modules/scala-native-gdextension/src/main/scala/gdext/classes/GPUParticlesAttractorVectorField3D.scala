package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `GPUParticlesAttractorVectorField3D`, extends `GPUParticlesAttractor3D`. */
abstract class GPUParticlesAttractorVectorField3D extends GPUParticlesAttractor3D {
  override def godotClassName: String = "GPUParticlesAttractorVectorField3D"

  /** GPUParticlesAttractorVectorField3D.set_size */
  final def setSize(size: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticlesAttractorVectorField3D", "set_size", 3460891852L), hostObject.objectPtr, size)

  /** GPUParticlesAttractorVectorField3D.get_size */
  final def getSize(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("GPUParticlesAttractorVectorField3D", "get_size", 3360562783L), hostObject.objectPtr)

  /** GPUParticlesAttractorVectorField3D.set_texture */
  final def setTexture(texture: Texture3D): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticlesAttractorVectorField3D", "set_texture", 1188404210L), hostObject.objectPtr, texture.hostObject)

  /** GPUParticlesAttractorVectorField3D.get_texture */
  final def getTexture(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("GPUParticlesAttractorVectorField3D", "get_texture", 373985333L), hostObject.objectPtr)

}
