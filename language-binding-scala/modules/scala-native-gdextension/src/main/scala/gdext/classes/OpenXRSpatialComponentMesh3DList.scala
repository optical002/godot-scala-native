package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRSpatialComponentMesh3DList`, extends `OpenXRSpatialComponentData`. */
abstract class OpenXRSpatialComponentMesh3DList extends OpenXRSpatialComponentData {
  override def godotClassName: String = "OpenXRSpatialComponentMesh3DList"

  /** OpenXRSpatialComponentMesh3DList.get_transform */
  final def getTransform(index: Long): gdext.builtin.Transform3D =
    Ptrcall.call1[Long, gdext.builtin.Transform3D](MethodBind.get("OpenXRSpatialComponentMesh3DList", "get_transform", 1965739696L), hostObject.objectPtr, index)

  /** OpenXRSpatialComponentMesh3DList.get_mesh */
  final def getMesh(index: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("OpenXRSpatialComponentMesh3DList", "get_mesh", 1576363275L), hostObject.objectPtr, index)

}
