package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `MultiMeshInstance3D`, extends `GeometryInstance3D`. */
abstract class MultiMeshInstance3D extends GeometryInstance3D {
  override def godotClassName: String = "MultiMeshInstance3D"

  /** MultiMeshInstance3D.set_multimesh */
  final def setMultimesh(multimesh: MultiMesh): Unit = {
    if (gdext.classes.MultiMeshInstance3D.mb_set_multimesh == null) gdext.classes.MultiMeshInstance3D.mb_set_multimesh = MethodBind.get("MultiMeshInstance3D", "set_multimesh", 2246127404L)
    Ptrcall.callVoid1(gdext.classes.MultiMeshInstance3D.mb_set_multimesh, livePtr, Wrappers.handle(multimesh))
  }

  /** MultiMeshInstance3D.get_multimesh. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getMultimesh(): MultiMesh = {
    if (gdext.classes.MultiMeshInstance3D.mb_get_multimesh == null) gdext.classes.MultiMeshInstance3D.mb_get_multimesh = MethodBind.get("MultiMeshInstance3D", "get_multimesh", 1385450523L)
    Wrappers.owned[MultiMesh](Ptrcall.call0[Long](gdext.classes.MultiMeshInstance3D.mb_get_multimesh, livePtr))
  }

}

object MultiMeshInstance3D {
  private[classes] var mb_set_multimesh: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_multimesh: GDExtensionMethodBindPtr = null
}
