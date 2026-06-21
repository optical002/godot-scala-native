package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `GPUParticlesAttractorBox3D`, extends `GPUParticlesAttractor3D`. */
abstract class GPUParticlesAttractorBox3D extends GPUParticlesAttractor3D {

  /** GPUParticlesAttractorBox3D.set_size */
  final def setSize(size: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticlesAttractorBox3D", "set_size", 3460891852L), hostObject.objectPtr, size)

  /** GPUParticlesAttractorBox3D.get_size */
  final def getSize(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("GPUParticlesAttractorBox3D", "get_size", 3360562783L), hostObject.objectPtr)

}

object GPUParticlesAttractorBox3D {
  /** Class metadata for Gd[GPUParticlesAttractorBox3D] lifetime management and casting. */
  given GodotClass[GPUParticlesAttractorBox3D] with {
    def className = "GPUParticlesAttractorBox3D"
    def isRefCounted = false
    def wrap(o: GodotObject): GPUParticlesAttractorBox3D = new GPUParticlesAttractorBox3D {}.withHost(o.objectPtr)
    def unwrap(t: GPUParticlesAttractorBox3D): GodotObject = t.hostObject
  }
}
