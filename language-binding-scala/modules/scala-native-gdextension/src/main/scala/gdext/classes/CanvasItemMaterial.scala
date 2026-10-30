package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `CanvasItemMaterial`, extends `Material`. */
abstract class CanvasItemMaterial extends Material {
  override def godotClassName: String = "CanvasItemMaterial"

  /** CanvasItemMaterial.set_blend_mode */
  final def setBlendMode(blendMode: gdext.classes.CanvasItemMaterial.BlendMode): Unit = {
    if (gdext.classes.CanvasItemMaterial.mb_set_blend_mode == null) gdext.classes.CanvasItemMaterial.mb_set_blend_mode = MethodBind.get("CanvasItemMaterial", "set_blend_mode", 1786054936L)
    Ptrcall.callVoid1(gdext.classes.CanvasItemMaterial.mb_set_blend_mode, livePtr, blendMode)
  }

  /** CanvasItemMaterial.get_blend_mode */
  final def getBlendMode(): gdext.classes.CanvasItemMaterial.BlendMode = {
    if (gdext.classes.CanvasItemMaterial.mb_get_blend_mode == null) gdext.classes.CanvasItemMaterial.mb_get_blend_mode = MethodBind.get("CanvasItemMaterial", "get_blend_mode", 3318684035L)
    gdext.classes.CanvasItemMaterial.BlendMode(Ptrcall.call0[Long](gdext.classes.CanvasItemMaterial.mb_get_blend_mode, livePtr))
  }

  /** CanvasItemMaterial.set_light_mode */
  final def setLightMode(lightMode: gdext.classes.CanvasItemMaterial.LightMode): Unit = {
    if (gdext.classes.CanvasItemMaterial.mb_set_light_mode == null) gdext.classes.CanvasItemMaterial.mb_set_light_mode = MethodBind.get("CanvasItemMaterial", "set_light_mode", 628074070L)
    Ptrcall.callVoid1(gdext.classes.CanvasItemMaterial.mb_set_light_mode, livePtr, lightMode)
  }

  /** CanvasItemMaterial.get_light_mode */
  final def getLightMode(): gdext.classes.CanvasItemMaterial.LightMode = {
    if (gdext.classes.CanvasItemMaterial.mb_get_light_mode == null) gdext.classes.CanvasItemMaterial.mb_get_light_mode = MethodBind.get("CanvasItemMaterial", "get_light_mode", 3863292382L)
    gdext.classes.CanvasItemMaterial.LightMode(Ptrcall.call0[Long](gdext.classes.CanvasItemMaterial.mb_get_light_mode, livePtr))
  }

  /** CanvasItemMaterial.set_particles_animation */
  final def setParticlesAnimation(particlesAnim: Boolean): Unit = {
    if (gdext.classes.CanvasItemMaterial.mb_set_particles_animation == null) gdext.classes.CanvasItemMaterial.mb_set_particles_animation = MethodBind.get("CanvasItemMaterial", "set_particles_animation", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CanvasItemMaterial.mb_set_particles_animation, livePtr, particlesAnim)
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

  /** Godot enum `CanvasItemMaterial.BlendMode`. */
  opaque type BlendMode <: Long = Long

  object BlendMode {
    final val Mix: BlendMode = 0L.asInstanceOf[BlendMode]
    final val Add: BlendMode = 1L.asInstanceOf[BlendMode]
    final val Sub: BlendMode = 2L.asInstanceOf[BlendMode]
    final val Mul: BlendMode = 3L.asInstanceOf[BlendMode]
    final val PremultAlpha: BlendMode = 4L.asInstanceOf[BlendMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): BlendMode = value.asInstanceOf[BlendMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[BlendMode] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L).asInstanceOf[scala.IArray[BlendMode]]

    extension (self: BlendMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Mix"
        case 1L => "Add"
        case 2L => "Sub"
        case 3L => "Mul"
        case 4L => "PremultAlpha"
        case other => other.toString
      }
  }

  /** Godot enum `CanvasItemMaterial.LightMode`. */
  opaque type LightMode <: Long = Long

  object LightMode {
    final val Normal: LightMode = 0L.asInstanceOf[LightMode]
    final val Unshaded: LightMode = 1L.asInstanceOf[LightMode]
    final val LightOnly: LightMode = 2L.asInstanceOf[LightMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): LightMode = value.asInstanceOf[LightMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[LightMode] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[LightMode]]

    extension (self: LightMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Normal"
        case 1L => "Unshaded"
        case 2L => "LightOnly"
        case other => other.toString
      }
  }
}
