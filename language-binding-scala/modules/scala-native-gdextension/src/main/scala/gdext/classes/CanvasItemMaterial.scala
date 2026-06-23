package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `CanvasItemMaterial`, extends `Material`. */
abstract class CanvasItemMaterial extends Material {

  /** CanvasItemMaterial.set_blend_mode */
  final def setBlendMode(blend_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CanvasItemMaterial", "set_blend_mode", 1786054936L), hostObject.objectPtr, blend_mode)

  /** CanvasItemMaterial.get_blend_mode */
  final def getBlendMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("CanvasItemMaterial", "get_blend_mode", 3318684035L), hostObject.objectPtr)

  /** CanvasItemMaterial.set_light_mode */
  final def setLightMode(light_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CanvasItemMaterial", "set_light_mode", 628074070L), hostObject.objectPtr, light_mode)

  /** CanvasItemMaterial.get_light_mode */
  final def getLightMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("CanvasItemMaterial", "get_light_mode", 3863292382L), hostObject.objectPtr)

  /** CanvasItemMaterial.set_particles_animation */
  final def setParticlesAnimation(particles_anim: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CanvasItemMaterial", "set_particles_animation", 2586408642L), hostObject.objectPtr, particles_anim)

  /** CanvasItemMaterial.get_particles_animation */
  final def getParticlesAnimation(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CanvasItemMaterial", "get_particles_animation", 36873697L), hostObject.objectPtr)

  /** CanvasItemMaterial.set_particles_anim_h_frames */
  final def setParticlesAnimHFrames(frames: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CanvasItemMaterial", "set_particles_anim_h_frames", 1286410249L), hostObject.objectPtr, frames)

  /** CanvasItemMaterial.get_particles_anim_h_frames */
  final def getParticlesAnimHFrames(): Long =
    Ptrcall.call0[Long](MethodBind.get("CanvasItemMaterial", "get_particles_anim_h_frames", 3905245786L), hostObject.objectPtr)

  /** CanvasItemMaterial.set_particles_anim_v_frames */
  final def setParticlesAnimVFrames(frames: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CanvasItemMaterial", "set_particles_anim_v_frames", 1286410249L), hostObject.objectPtr, frames)

  /** CanvasItemMaterial.get_particles_anim_v_frames */
  final def getParticlesAnimVFrames(): Long =
    Ptrcall.call0[Long](MethodBind.get("CanvasItemMaterial", "get_particles_anim_v_frames", 3905245786L), hostObject.objectPtr)

  /** CanvasItemMaterial.set_particles_anim_loop */
  final def setParticlesAnimLoop(loop: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CanvasItemMaterial", "set_particles_anim_loop", 2586408642L), hostObject.objectPtr, loop)

  /** CanvasItemMaterial.get_particles_anim_loop */
  final def getParticlesAnimLoop(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CanvasItemMaterial", "get_particles_anim_loop", 36873697L), hostObject.objectPtr)

}

object CanvasItemMaterial {
  /** Class metadata for Gd[CanvasItemMaterial] lifetime management and casting. */
  given GodotClass[CanvasItemMaterial] with {
    def className = "CanvasItemMaterial"
    def isRefCounted = true
    def wrap(o: GodotObject): CanvasItemMaterial = new CanvasItemMaterial {}.withHost(o.objectPtr)
    def unwrap(t: CanvasItemMaterial): GodotObject = t.hostObject
  }
}
