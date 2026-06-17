package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `GPUParticlesCollisionSDF3D`, extends `GPUParticlesCollision3D`. */
abstract class GPUParticlesCollisionSDF3D extends GPUParticlesCollision3D {

  /** GPUParticlesCollisionSDF3D.set_size */
  final def setSize(size: io.github.optical002.godot.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticlesCollisionSDF3D", "set_size", 3460891852L), hostObject.objectPtr, size)

  /** GPUParticlesCollisionSDF3D.get_size */
  final def getSize(): io.github.optical002.godot.builtin.Vector3 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector3](MethodBind.get("GPUParticlesCollisionSDF3D", "get_size", 3360562783L), hostObject.objectPtr)

  /** GPUParticlesCollisionSDF3D.set_resolution */
  final def setResolution(resolution: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticlesCollisionSDF3D", "set_resolution", 1155629297L), hostObject.objectPtr, resolution)

  /** GPUParticlesCollisionSDF3D.get_resolution */
  final def getResolution(): Long =
    Ptrcall.call0[Long](MethodBind.get("GPUParticlesCollisionSDF3D", "get_resolution", 2919555867L), hostObject.objectPtr)

  /** GPUParticlesCollisionSDF3D.set_texture */
  final def setTexture(texture: Texture3D): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticlesCollisionSDF3D", "set_texture", 1188404210L), hostObject.objectPtr, texture.hostObject)

  /** GPUParticlesCollisionSDF3D.get_texture */
  final def getTexture(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("GPUParticlesCollisionSDF3D", "get_texture", 373985333L), hostObject.objectPtr)

  /** GPUParticlesCollisionSDF3D.set_thickness */
  final def setThickness(thickness: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticlesCollisionSDF3D", "set_thickness", 373806689L), hostObject.objectPtr, thickness)

  /** GPUParticlesCollisionSDF3D.get_thickness */
  final def getThickness(): Double =
    Ptrcall.call0[Double](MethodBind.get("GPUParticlesCollisionSDF3D", "get_thickness", 1740695150L), hostObject.objectPtr)

  /** GPUParticlesCollisionSDF3D.set_bake_mask */
  final def setBakeMask(mask: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticlesCollisionSDF3D", "set_bake_mask", 1286410249L), hostObject.objectPtr, mask)

  /** GPUParticlesCollisionSDF3D.get_bake_mask */
  final def getBakeMask(): Long =
    Ptrcall.call0[Long](MethodBind.get("GPUParticlesCollisionSDF3D", "get_bake_mask", 3905245786L), hostObject.objectPtr)

  /** GPUParticlesCollisionSDF3D.set_bake_mask_value */
  final def setBakeMaskValue(layer_number: Long, value: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("GPUParticlesCollisionSDF3D", "set_bake_mask_value", 300928843L), hostObject.objectPtr, layer_number, value)

  /** GPUParticlesCollisionSDF3D.get_bake_mask_value */
  final def getBakeMaskValue(layer_number: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("GPUParticlesCollisionSDF3D", "get_bake_mask_value", 1116898809L), hostObject.objectPtr, layer_number)

}

object GPUParticlesCollisionSDF3D {
  /** Class metadata for Gd[GPUParticlesCollisionSDF3D] lifetime management and casting. */
  given GodotClass[GPUParticlesCollisionSDF3D] with {
    def className = "GPUParticlesCollisionSDF3D"
    def isRefCounted = false
    def wrap(o: GodotObject): GPUParticlesCollisionSDF3D = new GPUParticlesCollisionSDF3D {}.withHost(o.objectPtr)
    def unwrap(t: GPUParticlesCollisionSDF3D): GodotObject = t.hostObject
  }
}
