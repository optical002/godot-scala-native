package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `GPUParticlesCollision3D`, extends `VisualInstance3D`. */
abstract class GPUParticlesCollision3D extends VisualInstance3D {
  override def godotClassName: String = "GPUParticlesCollision3D"

  /** GPUParticlesCollision3D.set_cull_mask */
  final def setCullMask(mask: Long): Unit = {
    if (gdext.classes.GPUParticlesCollision3D.mb_set_cull_mask == null) gdext.classes.GPUParticlesCollision3D.mb_set_cull_mask = MethodBind.get("GPUParticlesCollision3D", "set_cull_mask", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GPUParticlesCollision3D.mb_set_cull_mask, livePtr, mask)
  }

  /** GPUParticlesCollision3D.get_cull_mask */
  final def getCullMask(): Long = {
    if (gdext.classes.GPUParticlesCollision3D.mb_get_cull_mask == null) gdext.classes.GPUParticlesCollision3D.mb_get_cull_mask = MethodBind.get("GPUParticlesCollision3D", "get_cull_mask", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.GPUParticlesCollision3D.mb_get_cull_mask, livePtr)
  }

}

object GPUParticlesCollision3D {
  private[classes] var mb_set_cull_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_cull_mask: GDExtensionMethodBindPtr = null
}
