package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OpenXRSpatialComponentPolygon2DList`, extends `OpenXRSpatialComponentData`. */
abstract class OpenXRSpatialComponentPolygon2DList extends OpenXRSpatialComponentData {
  override def godotClassName: String = "OpenXRSpatialComponentPolygon2DList"

  /** OpenXRSpatialComponentPolygon2DList.get_transform */
  final def getTransform(index: Long): gdext.builtin.Transform3D = {
    if (gdext.classes.OpenXRSpatialComponentPolygon2DList.mb_get_transform == null) gdext.classes.OpenXRSpatialComponentPolygon2DList.mb_get_transform = MethodBind.get("OpenXRSpatialComponentPolygon2DList", "get_transform", 1965739696L)
    Ptrcall.call1[Long, gdext.builtin.Transform3D](gdext.classes.OpenXRSpatialComponentPolygon2DList.mb_get_transform, livePtr, index)
  }

}

object OpenXRSpatialComponentPolygon2DList {
  private[classes] var mb_get_transform: GDExtensionMethodBindPtr = null
}
