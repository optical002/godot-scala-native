package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OpenXRSpatialComponentMesh3DList`, extends `OpenXRSpatialComponentData`. */
abstract class OpenXRSpatialComponentMesh3DList extends OpenXRSpatialComponentData {
  override def godotClassName: String = "OpenXRSpatialComponentMesh3DList"

  /** OpenXRSpatialComponentMesh3DList.get_transform */
  final def getTransform(index: Long): gdext.builtin.Transform3D = {
    if (gdext.classes.OpenXRSpatialComponentMesh3DList.mb_get_transform == null) gdext.classes.OpenXRSpatialComponentMesh3DList.mb_get_transform = MethodBind.get("OpenXRSpatialComponentMesh3DList", "get_transform", 1965739696L)
    Ptrcall.call1[Long, gdext.builtin.Transform3D](gdext.classes.OpenXRSpatialComponentMesh3DList.mb_get_transform, livePtr, index)
  }

  /** OpenXRSpatialComponentMesh3DList.get_mesh. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getMesh(index: Long): Mesh = {
    if (gdext.classes.OpenXRSpatialComponentMesh3DList.mb_get_mesh == null) gdext.classes.OpenXRSpatialComponentMesh3DList.mb_get_mesh = MethodBind.get("OpenXRSpatialComponentMesh3DList", "get_mesh", 1576363275L)
    Wrappers.owned[Mesh](Ptrcall.call1[Long, Long](gdext.classes.OpenXRSpatialComponentMesh3DList.mb_get_mesh, livePtr, index))
  }

}

object OpenXRSpatialComponentMesh3DList {
  private[classes] var mb_get_transform: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_mesh: GDExtensionMethodBindPtr = null
}
