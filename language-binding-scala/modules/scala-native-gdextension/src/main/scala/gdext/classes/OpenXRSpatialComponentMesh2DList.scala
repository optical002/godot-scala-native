package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OpenXRSpatialComponentMesh2DList`, extends `OpenXRSpatialComponentData`. */
abstract class OpenXRSpatialComponentMesh2DList extends OpenXRSpatialComponentData {
  override def godotClassName: String = "OpenXRSpatialComponentMesh2DList"

  /** OpenXRSpatialComponentMesh2DList.get_transform */
  final def getTransform(index: Long): gdext.builtin.Transform3D = {
    if (gdext.classes.OpenXRSpatialComponentMesh2DList.mb_get_transform == null) gdext.classes.OpenXRSpatialComponentMesh2DList.mb_get_transform = MethodBind.get("OpenXRSpatialComponentMesh2DList", "get_transform", 1965739696L)
    Ptrcall.call1[Long, gdext.builtin.Transform3D](gdext.classes.OpenXRSpatialComponentMesh2DList.mb_get_transform, livePtr, index)
  }

}

object OpenXRSpatialComponentMesh2DList {
  private[classes] var mb_get_transform: GDExtensionMethodBindPtr = null
}
