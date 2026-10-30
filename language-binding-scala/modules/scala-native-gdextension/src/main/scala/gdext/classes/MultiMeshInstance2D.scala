package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `MultiMeshInstance2D`, extends `Node2D`. */
abstract class MultiMeshInstance2D extends Node2D {
  override def godotClassName: String = "MultiMeshInstance2D"

  /** MultiMeshInstance2D.set_multimesh */
  final def setMultimesh(multimesh: MultiMesh): Unit = {
    if (gdext.classes.MultiMeshInstance2D.mb_set_multimesh == null) gdext.classes.MultiMeshInstance2D.mb_set_multimesh = MethodBind.get("MultiMeshInstance2D", "set_multimesh", 2246127404L)
    Ptrcall.callVoid1(gdext.classes.MultiMeshInstance2D.mb_set_multimesh, livePtr, Wrappers.handle(multimesh))
  }

  /** MultiMeshInstance2D.get_multimesh. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getMultimesh(): MultiMesh = {
    if (gdext.classes.MultiMeshInstance2D.mb_get_multimesh == null) gdext.classes.MultiMeshInstance2D.mb_get_multimesh = MethodBind.get("MultiMeshInstance2D", "get_multimesh", 1385450523L)
    Wrappers.owned[MultiMesh](Ptrcall.call0[Long](gdext.classes.MultiMeshInstance2D.mb_get_multimesh, livePtr))
  }

  /** MultiMeshInstance2D.set_texture */
  final def setTexture(texture: Texture2D): Unit = {
    if (gdext.classes.MultiMeshInstance2D.mb_set_texture == null) gdext.classes.MultiMeshInstance2D.mb_set_texture = MethodBind.get("MultiMeshInstance2D", "set_texture", 4051416890L)
    Ptrcall.callVoid1(gdext.classes.MultiMeshInstance2D.mb_set_texture, livePtr, Wrappers.handle(texture))
  }

  /** MultiMeshInstance2D.get_texture. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getTexture(): Texture2D = {
    if (gdext.classes.MultiMeshInstance2D.mb_get_texture == null) gdext.classes.MultiMeshInstance2D.mb_get_texture = MethodBind.get("MultiMeshInstance2D", "get_texture", 3635182373L)
    Wrappers.owned[Texture2D](Ptrcall.call0[Long](gdext.classes.MultiMeshInstance2D.mb_get_texture, livePtr))
  }

}

object MultiMeshInstance2D {
  private[classes] var mb_set_multimesh: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_multimesh: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture: GDExtensionMethodBindPtr = null
}
