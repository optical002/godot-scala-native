package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `GPUParticlesAttractorBox3D`, extends `GPUParticlesAttractor3D`. */
abstract class GPUParticlesAttractorBox3D extends GPUParticlesAttractor3D {
  override def godotClassName: String = "GPUParticlesAttractorBox3D"

  /** GPUParticlesAttractorBox3D.set_size */
  final def setSize(size: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticlesAttractorBox3D", "set_size", 3460891852L), hostObject.objectPtr, size)

  /** GPUParticlesAttractorBox3D.get_size */
  final def getSize(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("GPUParticlesAttractorBox3D", "get_size", 3360562783L), hostObject.objectPtr)

}
