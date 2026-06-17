package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `GPUParticlesAttractorBox3D`, extends `GPUParticlesAttractor3D`. */
abstract class GPUParticlesAttractorBox3D extends GPUParticlesAttractor3D {

  /** GPUParticlesAttractorBox3D.set_size */
  final def setSize(size: io.github.optical002.godot.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticlesAttractorBox3D", "set_size", 3460891852L), hostObject.objectPtr, size)

  /** GPUParticlesAttractorBox3D.get_size */
  final def getSize(): io.github.optical002.godot.builtin.Vector3 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector3](MethodBind.get("GPUParticlesAttractorBox3D", "get_size", 3360562783L), hostObject.objectPtr)

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
