package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeParticleMeshEmitter`, extends `VisualShaderNodeParticleEmitter`. */
abstract class VisualShaderNodeParticleMeshEmitter extends VisualShaderNodeParticleEmitter {

  /** VisualShaderNodeParticleMeshEmitter.set_mesh */
  final def setMesh(mesh: Mesh): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeParticleMeshEmitter", "set_mesh", 194775623L), hostObject.objectPtr, mesh.hostObject)

  /** VisualShaderNodeParticleMeshEmitter.get_mesh */
  final def getMesh(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("VisualShaderNodeParticleMeshEmitter", "get_mesh", 1808005922L), hostObject.objectPtr)

  /** VisualShaderNodeParticleMeshEmitter.set_use_all_surfaces */
  final def setUseAllSurfaces(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeParticleMeshEmitter", "set_use_all_surfaces", 2586408642L), hostObject.objectPtr, enabled)

  /** VisualShaderNodeParticleMeshEmitter.is_use_all_surfaces */
  final def isUseAllSurfaces(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("VisualShaderNodeParticleMeshEmitter", "is_use_all_surfaces", 36873697L), hostObject.objectPtr)

  /** VisualShaderNodeParticleMeshEmitter.set_surface_index */
  final def setSurfaceIndex(surface_index: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeParticleMeshEmitter", "set_surface_index", 1286410249L), hostObject.objectPtr, surface_index)

  /** VisualShaderNodeParticleMeshEmitter.get_surface_index */
  final def getSurfaceIndex(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeParticleMeshEmitter", "get_surface_index", 3905245786L), hostObject.objectPtr)

}

object VisualShaderNodeParticleMeshEmitter {
  /** Class metadata for Gd[VisualShaderNodeParticleMeshEmitter] lifetime management and casting. */
  given GodotClass[VisualShaderNodeParticleMeshEmitter] with {
    def className = "VisualShaderNodeParticleMeshEmitter"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeParticleMeshEmitter = new VisualShaderNodeParticleMeshEmitter {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeParticleMeshEmitter): GodotObject = t.hostObject
  }
}
