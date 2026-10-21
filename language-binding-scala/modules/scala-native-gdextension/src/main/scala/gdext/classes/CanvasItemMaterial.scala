package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `CanvasItemMaterial`, extends `Material`. */
abstract class CanvasItemMaterial extends Material {
  override def godotClassName: String = "CanvasItemMaterial"

  /** CanvasItemMaterial.set_blend_mode */
  final def setBlendMode(blend_mode: Long): Unit = {
    if (gdext.classes.CanvasItemMaterial.mb_set_blend_mode == null) gdext.classes.CanvasItemMaterial.mb_set_blend_mode = MethodBind.get("CanvasItemMaterial", "set_blend_mode", 1786054936L)
    Ptrcall.callVoid1(gdext.classes.CanvasItemMaterial.mb_set_blend_mode, livePtr, blend_mode)
  }

  /** CanvasItemMaterial.get_blend_mode */
  final def getBlendMode(): Long = {
    if (gdext.classes.CanvasItemMaterial.mb_get_blend_mode == null) gdext.classes.CanvasItemMaterial.mb_get_blend_mode = MethodBind.get("CanvasItemMaterial", "get_blend_mode", 3318684035L)
    Ptrcall.call0[Long](gdext.classes.CanvasItemMaterial.mb_get_blend_mode, livePtr)
  }

  /** CanvasItemMaterial.set_light_mode */
  final def setLightMode(light_mode: Long): Unit = {
    if (gdext.classes.CanvasItemMaterial.mb_set_light_mode == null) gdext.classes.CanvasItemMaterial.mb_set_light_mode = MethodBind.get("CanvasItemMaterial", "set_light_mode", 628074070L)
    Ptrcall.callVoid1(gdext.classes.CanvasItemMaterial.mb_set_light_mode, livePtr, light_mode)
  }

  /** CanvasItemMaterial.get_light_mode */
  final def getLightMode(): Long = {
    if (gdext.classes.CanvasItemMaterial.mb_get_light_mode == null) gdext.classes.CanvasItemMaterial.mb_get_light_mode = MethodBind.get("CanvasItemMaterial", "get_light_mode", 3863292382L)
    Ptrcall.call0[Long](gdext.classes.CanvasItemMaterial.mb_get_light_mode, livePtr)
  }

  /** CanvasItemMaterial.set_particles_animation */
  final def setParticlesAnimation(particles_anim: Boolean): Unit = {
    if (gdext.classes.CanvasItemMaterial.mb_set_particles_animation == null) gdext.classes.CanvasItemMaterial.mb_set_particles_animation = MethodBind.get("CanvasItemMaterial", "set_particles_animation", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CanvasItemMaterial.mb_set_particles_animation, livePtr, particles_anim)
  }

  /** CanvasItemMaterial.get_particles_animation */
  final def getParticlesAnimation(): Boolean = {
    if (gdext.classes.CanvasItemMaterial.mb_get_particles_animation == null) gdext.classes.CanvasItemMaterial.mb_get_particles_animation = MethodBind.get("CanvasItemMaterial", "get_particles_animation", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CanvasItemMaterial.mb_get_particles_animation, livePtr)
  }

  /** CanvasItemMaterial.set_particles_anim_h_frames */
  final def setParticlesAnimHFrames(frames: Long): Unit = {
    if (gdext.classes.CanvasItemMaterial.mb_set_particles_anim_h_frames == null) gdext.classes.CanvasItemMaterial.mb_set_particles_anim_h_frames = MethodBind.get("CanvasItemMaterial", "set_particles_anim_h_frames", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.CanvasItemMaterial.mb_set_particles_anim_h_frames, livePtr, frames)
  }

  /** CanvasItemMaterial.get_particles_anim_h_frames */
  final def getParticlesAnimHFrames(): Long = {
    if (gdext.classes.CanvasItemMaterial.mb_get_particles_anim_h_frames == null) gdext.classes.CanvasItemMaterial.mb_get_particles_anim_h_frames = MethodBind.get("CanvasItemMaterial", "get_particles_anim_h_frames", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.CanvasItemMaterial.mb_get_particles_anim_h_frames, livePtr)
  }

  /** CanvasItemMaterial.set_particles_anim_v_frames */
  final def setParticlesAnimVFrames(frames: Long): Unit = {
    if (gdext.classes.CanvasItemMaterial.mb_set_particles_anim_v_frames == null) gdext.classes.CanvasItemMaterial.mb_set_particles_anim_v_frames = MethodBind.get("CanvasItemMaterial", "set_particles_anim_v_frames", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.CanvasItemMaterial.mb_set_particles_anim_v_frames, livePtr, frames)
  }

  /** CanvasItemMaterial.get_particles_anim_v_frames */
  final def getParticlesAnimVFrames(): Long = {
    if (gdext.classes.CanvasItemMaterial.mb_get_particles_anim_v_frames == null) gdext.classes.CanvasItemMaterial.mb_get_particles_anim_v_frames = MethodBind.get("CanvasItemMaterial", "get_particles_anim_v_frames", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.CanvasItemMaterial.mb_get_particles_anim_v_frames, livePtr)
  }

  /** CanvasItemMaterial.set_particles_anim_loop */
  final def setParticlesAnimLoop(loop: Boolean): Unit = {
    if (gdext.classes.CanvasItemMaterial.mb_set_particles_anim_loop == null) gdext.classes.CanvasItemMaterial.mb_set_particles_anim_loop = MethodBind.get("CanvasItemMaterial", "set_particles_anim_loop", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CanvasItemMaterial.mb_set_particles_anim_loop, livePtr, loop)
  }

  /** CanvasItemMaterial.get_particles_anim_loop */
  final def getParticlesAnimLoop(): Boolean = {
    if (gdext.classes.CanvasItemMaterial.mb_get_particles_anim_loop == null) gdext.classes.CanvasItemMaterial.mb_get_particles_anim_loop = MethodBind.get("CanvasItemMaterial", "get_particles_anim_loop", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CanvasItemMaterial.mb_get_particles_anim_loop, livePtr)
  }

}

object CanvasItemMaterial {
  private[classes] var mb_set_blend_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_blend_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_light_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_light_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_particles_animation: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_particles_animation: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_particles_anim_h_frames: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_particles_anim_h_frames: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_particles_anim_v_frames: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_particles_anim_v_frames: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_particles_anim_loop: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_particles_anim_loop: GDExtensionMethodBindPtr = null
}
