package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeParticleMeshEmitter`, extends `VisualShaderNodeParticleEmitter`. */
abstract class VisualShaderNodeParticleMeshEmitter extends VisualShaderNodeParticleEmitter {
  override def godotClassName: String = "VisualShaderNodeParticleMeshEmitter"

  /** VisualShaderNodeParticleMeshEmitter.set_mesh */
  final def setMesh(mesh: Mesh): Unit = {
    if (gdext.classes.VisualShaderNodeParticleMeshEmitter.mb_set_mesh == null) gdext.classes.VisualShaderNodeParticleMeshEmitter.mb_set_mesh = MethodBind.get("VisualShaderNodeParticleMeshEmitter", "set_mesh", 194775623L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeParticleMeshEmitter.mb_set_mesh, livePtr, Wrappers.handle(mesh))
  }

  /** VisualShaderNodeParticleMeshEmitter.get_mesh. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getMesh(): Mesh = {
    if (gdext.classes.VisualShaderNodeParticleMeshEmitter.mb_get_mesh == null) gdext.classes.VisualShaderNodeParticleMeshEmitter.mb_get_mesh = MethodBind.get("VisualShaderNodeParticleMeshEmitter", "get_mesh", 1808005922L)
    Wrappers.owned[Mesh](Ptrcall.call0[Long](gdext.classes.VisualShaderNodeParticleMeshEmitter.mb_get_mesh, livePtr))
  }

  /** VisualShaderNodeParticleMeshEmitter.set_use_all_surfaces */
  final def setUseAllSurfaces(enabled: Boolean): Unit = {
    if (gdext.classes.VisualShaderNodeParticleMeshEmitter.mb_set_use_all_surfaces == null) gdext.classes.VisualShaderNodeParticleMeshEmitter.mb_set_use_all_surfaces = MethodBind.get("VisualShaderNodeParticleMeshEmitter", "set_use_all_surfaces", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeParticleMeshEmitter.mb_set_use_all_surfaces, livePtr, enabled)
  }

  /** VisualShaderNodeParticleMeshEmitter.is_use_all_surfaces */
  final def isUseAllSurfaces(): Boolean = {
    if (gdext.classes.VisualShaderNodeParticleMeshEmitter.mb_is_use_all_surfaces == null) gdext.classes.VisualShaderNodeParticleMeshEmitter.mb_is_use_all_surfaces = MethodBind.get("VisualShaderNodeParticleMeshEmitter", "is_use_all_surfaces", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.VisualShaderNodeParticleMeshEmitter.mb_is_use_all_surfaces, livePtr)
  }

  /** VisualShaderNodeParticleMeshEmitter.set_surface_index */
  final def setSurfaceIndex(surface_index: Long): Unit = {
    if (gdext.classes.VisualShaderNodeParticleMeshEmitter.mb_set_surface_index == null) gdext.classes.VisualShaderNodeParticleMeshEmitter.mb_set_surface_index = MethodBind.get("VisualShaderNodeParticleMeshEmitter", "set_surface_index", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeParticleMeshEmitter.mb_set_surface_index, livePtr, surface_index)
  }

  /** VisualShaderNodeParticleMeshEmitter.get_surface_index */
  final def getSurfaceIndex(): Long = {
    if (gdext.classes.VisualShaderNodeParticleMeshEmitter.mb_get_surface_index == null) gdext.classes.VisualShaderNodeParticleMeshEmitter.mb_get_surface_index = MethodBind.get("VisualShaderNodeParticleMeshEmitter", "get_surface_index", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.VisualShaderNodeParticleMeshEmitter.mb_get_surface_index, livePtr)
  }

}

object VisualShaderNodeParticleMeshEmitter {
  private[classes] var mb_set_mesh: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_mesh: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_use_all_surfaces: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_use_all_surfaces: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_surface_index: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_surface_index: GDExtensionMethodBindPtr = null
}
