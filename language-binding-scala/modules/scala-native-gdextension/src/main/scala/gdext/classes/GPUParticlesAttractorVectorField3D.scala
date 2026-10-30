package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `GPUParticlesAttractorVectorField3D`, extends `GPUParticlesAttractor3D`. */
abstract class GPUParticlesAttractorVectorField3D extends GPUParticlesAttractor3D {
  override def godotClassName: String = "GPUParticlesAttractorVectorField3D"

  /** GPUParticlesAttractorVectorField3D.set_size */
  final def setSize(size: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.GPUParticlesAttractorVectorField3D.mb_set_size == null) gdext.classes.GPUParticlesAttractorVectorField3D.mb_set_size = MethodBind.get("GPUParticlesAttractorVectorField3D", "set_size", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.GPUParticlesAttractorVectorField3D.mb_set_size, livePtr, size)
  }

  /** GPUParticlesAttractorVectorField3D.get_size */
  final def getSize(): gdext.builtin.Vector3 = {
    if (gdext.classes.GPUParticlesAttractorVectorField3D.mb_get_size == null) gdext.classes.GPUParticlesAttractorVectorField3D.mb_get_size = MethodBind.get("GPUParticlesAttractorVectorField3D", "get_size", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.GPUParticlesAttractorVectorField3D.mb_get_size, livePtr)
  }

  /** GPUParticlesAttractorVectorField3D.set_texture */
  final def setTexture(texture: Texture3D): Unit = {
    if (gdext.classes.GPUParticlesAttractorVectorField3D.mb_set_texture == null) gdext.classes.GPUParticlesAttractorVectorField3D.mb_set_texture = MethodBind.get("GPUParticlesAttractorVectorField3D", "set_texture", 1188404210L)
    Ptrcall.callVoid1(gdext.classes.GPUParticlesAttractorVectorField3D.mb_set_texture, livePtr, Wrappers.handle(texture))
  }

  /** GPUParticlesAttractorVectorField3D.get_texture. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getTexture(): Texture3D = {
    if (gdext.classes.GPUParticlesAttractorVectorField3D.mb_get_texture == null) gdext.classes.GPUParticlesAttractorVectorField3D.mb_get_texture = MethodBind.get("GPUParticlesAttractorVectorField3D", "get_texture", 373985333L)
    Wrappers.owned[Texture3D](Ptrcall.call0[Long](gdext.classes.GPUParticlesAttractorVectorField3D.mb_get_texture, livePtr))
  }

}

object GPUParticlesAttractorVectorField3D {
  private[classes] var mb_set_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture: GDExtensionMethodBindPtr = null
}
