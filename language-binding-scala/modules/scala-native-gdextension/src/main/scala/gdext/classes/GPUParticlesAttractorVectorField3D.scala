package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `GPUParticlesAttractorVectorField3D`, extends `GPUParticlesAttractor3D`. */
abstract class GPUParticlesAttractorVectorField3D extends GPUParticlesAttractor3D {

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

object GPUParticlesAttractorVectorField3D {
  /** Class metadata for Gd[GPUParticlesAttractorVectorField3D] lifetime management and casting. */
  given GodotClass[GPUParticlesAttractorVectorField3D] with {
    def className = "GPUParticlesAttractorVectorField3D"
    def isRefCounted = false
    def wrap(o: GodotObject): GPUParticlesAttractorVectorField3D = new GPUParticlesAttractorVectorField3D {}.withHost(o.objectPtr)
    def unwrap(t: GPUParticlesAttractorVectorField3D): GodotObject = t.hostObject
  }
}
