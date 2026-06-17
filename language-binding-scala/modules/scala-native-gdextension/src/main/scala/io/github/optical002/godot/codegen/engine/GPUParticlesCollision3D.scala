package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `GPUParticlesCollision3D`, extends `VisualInstance3D`. */
abstract class GPUParticlesCollision3D extends VisualInstance3D {

  /** GPUParticlesCollision3D.set_cull_mask */
  final def setCullMask(mask: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticlesCollision3D", "set_cull_mask", 1286410249L), hostObject.objectPtr, mask)

  /** GPUParticlesCollision3D.get_cull_mask */
  final def getCullMask(): Long =
    Ptrcall.call0[Long](MethodBind.get("GPUParticlesCollision3D", "get_cull_mask", 3905245786L), hostObject.objectPtr)

}

object GPUParticlesCollision3D {
  /** Class metadata for Gd[GPUParticlesCollision3D] lifetime management and casting. */
  given GodotClass[GPUParticlesCollision3D] with {
    def className = "GPUParticlesCollision3D"
    def isRefCounted = false
    def wrap(o: GodotObject): GPUParticlesCollision3D = new GPUParticlesCollision3D {}.withHost(o.objectPtr)
    def unwrap(t: GPUParticlesCollision3D): GodotObject = t.hostObject
  }
}
