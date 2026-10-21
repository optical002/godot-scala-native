package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `MeshInstance2D`, extends `Node2D`. */
abstract class MeshInstance2D extends Node2D {
  override def godotClassName: String = "MeshInstance2D"

  /** MeshInstance2D.set_mesh */
  final def setMesh(mesh: Mesh): Unit = {
    if (gdext.classes.MeshInstance2D.mb_set_mesh == null) gdext.classes.MeshInstance2D.mb_set_mesh = MethodBind.get("MeshInstance2D", "set_mesh", 194775623L)
    Ptrcall.callVoid1(gdext.classes.MeshInstance2D.mb_set_mesh, livePtr, Wrappers.handle(mesh))
  }

  /** MeshInstance2D.get_mesh. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getMesh(): Mesh = {
    if (gdext.classes.MeshInstance2D.mb_get_mesh == null) gdext.classes.MeshInstance2D.mb_get_mesh = MethodBind.get("MeshInstance2D", "get_mesh", 1808005922L)
    Wrappers.owned[Mesh](Ptrcall.call0[Long](gdext.classes.MeshInstance2D.mb_get_mesh, livePtr))
  }

  /** MeshInstance2D.set_texture */
  final def setTexture(texture: Texture2D): Unit = {
    if (gdext.classes.MeshInstance2D.mb_set_texture == null) gdext.classes.MeshInstance2D.mb_set_texture = MethodBind.get("MeshInstance2D", "set_texture", 4051416890L)
    Ptrcall.callVoid1(gdext.classes.MeshInstance2D.mb_set_texture, livePtr, Wrappers.handle(texture))
  }

  /** MeshInstance2D.get_texture. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getTexture(): Texture2D = {
    if (gdext.classes.MeshInstance2D.mb_get_texture == null) gdext.classes.MeshInstance2D.mb_get_texture = MethodBind.get("MeshInstance2D", "get_texture", 3635182373L)
    Wrappers.owned[Texture2D](Ptrcall.call0[Long](gdext.classes.MeshInstance2D.mb_get_texture, livePtr))
  }

}

object MeshInstance2D {
  private[classes] var mb_set_mesh: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_mesh: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture: GDExtensionMethodBindPtr = null
}
