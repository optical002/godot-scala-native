package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `GPUParticlesAttractor3D`, extends `VisualInstance3D`. */
abstract class GPUParticlesAttractor3D extends VisualInstance3D {
  override def godotClassName: String = "GPUParticlesAttractor3D"

  /** GPUParticlesAttractor3D.set_cull_mask */
  final def setCullMask(mask: Long): Unit = {
    if (gdext.classes.GPUParticlesAttractor3D.mb_set_cull_mask == null) gdext.classes.GPUParticlesAttractor3D.mb_set_cull_mask = MethodBind.get("GPUParticlesAttractor3D", "set_cull_mask", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GPUParticlesAttractor3D.mb_set_cull_mask, livePtr, mask)
  }

  /** GPUParticlesAttractor3D.get_cull_mask */
  final def getCullMask(): Long = {
    if (gdext.classes.GPUParticlesAttractor3D.mb_get_cull_mask == null) gdext.classes.GPUParticlesAttractor3D.mb_get_cull_mask = MethodBind.get("GPUParticlesAttractor3D", "get_cull_mask", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.GPUParticlesAttractor3D.mb_get_cull_mask, livePtr)
  }

  /** GPUParticlesAttractor3D.set_strength */
  final def setStrength(strength: Double): Unit = {
    if (gdext.classes.GPUParticlesAttractor3D.mb_set_strength == null) gdext.classes.GPUParticlesAttractor3D.mb_set_strength = MethodBind.get("GPUParticlesAttractor3D", "set_strength", 373806689L)
    Ptrcall.callVoid1(gdext.classes.GPUParticlesAttractor3D.mb_set_strength, livePtr, strength)
  }

  /** GPUParticlesAttractor3D.get_strength */
  final def getStrength(): Double = {
    if (gdext.classes.GPUParticlesAttractor3D.mb_get_strength == null) gdext.classes.GPUParticlesAttractor3D.mb_get_strength = MethodBind.get("GPUParticlesAttractor3D", "get_strength", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.GPUParticlesAttractor3D.mb_get_strength, livePtr)
  }

  /** GPUParticlesAttractor3D.set_attenuation */
  final def setAttenuation(attenuation: Double): Unit = {
    if (gdext.classes.GPUParticlesAttractor3D.mb_set_attenuation == null) gdext.classes.GPUParticlesAttractor3D.mb_set_attenuation = MethodBind.get("GPUParticlesAttractor3D", "set_attenuation", 373806689L)
    Ptrcall.callVoid1(gdext.classes.GPUParticlesAttractor3D.mb_set_attenuation, livePtr, attenuation)
  }

  /** GPUParticlesAttractor3D.get_attenuation */
  final def getAttenuation(): Double = {
    if (gdext.classes.GPUParticlesAttractor3D.mb_get_attenuation == null) gdext.classes.GPUParticlesAttractor3D.mb_get_attenuation = MethodBind.get("GPUParticlesAttractor3D", "get_attenuation", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.GPUParticlesAttractor3D.mb_get_attenuation, livePtr)
  }

  /** GPUParticlesAttractor3D.set_directionality */
  final def setDirectionality(amount: Double): Unit = {
    if (gdext.classes.GPUParticlesAttractor3D.mb_set_directionality == null) gdext.classes.GPUParticlesAttractor3D.mb_set_directionality = MethodBind.get("GPUParticlesAttractor3D", "set_directionality", 373806689L)
    Ptrcall.callVoid1(gdext.classes.GPUParticlesAttractor3D.mb_set_directionality, livePtr, amount)
  }

  /** GPUParticlesAttractor3D.get_directionality */
  final def getDirectionality(): Double = {
    if (gdext.classes.GPUParticlesAttractor3D.mb_get_directionality == null) gdext.classes.GPUParticlesAttractor3D.mb_get_directionality = MethodBind.get("GPUParticlesAttractor3D", "get_directionality", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.GPUParticlesAttractor3D.mb_get_directionality, livePtr)
  }

}

object GPUParticlesAttractor3D {
  private[classes] var mb_set_cull_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_cull_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_strength: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_strength: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_attenuation: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_attenuation: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_directionality: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_directionality: GDExtensionMethodBindPtr = null
}
