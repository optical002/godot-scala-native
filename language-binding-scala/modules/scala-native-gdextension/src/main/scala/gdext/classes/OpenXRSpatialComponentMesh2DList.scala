package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRSpatialComponentMesh2DList`, extends `OpenXRSpatialComponentData`. */
abstract class OpenXRSpatialComponentMesh2DList extends OpenXRSpatialComponentData {
  override def godotClassName: String = "OpenXRSpatialComponentMesh2DList"

  /** OpenXRSpatialComponentMesh2DList.get_transform */
  final def getTransform(index: Long): gdext.builtin.Transform3D =
    Ptrcall.call1[Long, gdext.builtin.Transform3D](MethodBind.get("OpenXRSpatialComponentMesh2DList", "get_transform", 1965739696L), hostObject.objectPtr, index)

}
