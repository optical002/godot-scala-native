package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `GPUParticlesCollisionBox3D`, extends `GPUParticlesCollision3D`. */
abstract class GPUParticlesCollisionBox3D extends GPUParticlesCollision3D {

  /** GPUParticlesCollisionBox3D.set_size */
  final def setSize(size: io.github.optical002.godot.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticlesCollisionBox3D", "set_size", 3460891852L), hostObject.objectPtr, size)

  /** GPUParticlesCollisionBox3D.get_size */
  final def getSize(): io.github.optical002.godot.builtin.Vector3 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector3](MethodBind.get("GPUParticlesCollisionBox3D", "get_size", 3360562783L), hostObject.objectPtr)

}

object GPUParticlesCollisionBox3D {
  /** Class metadata for Gd[GPUParticlesCollisionBox3D] lifetime management and casting. */
  given GodotClass[GPUParticlesCollisionBox3D] with {
    def className = "GPUParticlesCollisionBox3D"
    def isRefCounted = false
    def wrap(o: GodotObject): GPUParticlesCollisionBox3D = new GPUParticlesCollisionBox3D {}.withHost(o.objectPtr)
    def unwrap(t: GPUParticlesCollisionBox3D): GodotObject = t.hostObject
  }
}
