package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `GPUParticlesCollisionSphere3D`, extends `GPUParticlesCollision3D`. */
abstract class GPUParticlesCollisionSphere3D extends GPUParticlesCollision3D {

  /** GPUParticlesCollisionSphere3D.set_radius */
  final def setRadius(radius: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticlesCollisionSphere3D", "set_radius", 373806689L), hostObject.objectPtr, radius)

  /** GPUParticlesCollisionSphere3D.get_radius */
  final def getRadius(): Double =
    Ptrcall.call0[Double](MethodBind.get("GPUParticlesCollisionSphere3D", "get_radius", 1740695150L), hostObject.objectPtr)

}

object GPUParticlesCollisionSphere3D {
  /** Class metadata for Gd[GPUParticlesCollisionSphere3D] lifetime management and casting. */
  given GodotClass[GPUParticlesCollisionSphere3D] with {
    def className = "GPUParticlesCollisionSphere3D"
    def isRefCounted = false
    def wrap(o: GodotObject): GPUParticlesCollisionSphere3D = new GPUParticlesCollisionSphere3D {}.withHost(o.objectPtr)
    def unwrap(t: GPUParticlesCollisionSphere3D): GodotObject = t.hostObject
  }
}
