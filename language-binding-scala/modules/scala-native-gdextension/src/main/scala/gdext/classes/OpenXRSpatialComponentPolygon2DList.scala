package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRSpatialComponentPolygon2DList`, extends `OpenXRSpatialComponentData`. */
abstract class OpenXRSpatialComponentPolygon2DList extends OpenXRSpatialComponentData {

  /** OpenXRSpatialComponentPolygon2DList.get_transform */
  final def getTransform(index: Long): gdext.builtin.Transform3D =
    Ptrcall.call1[Long, gdext.builtin.Transform3D](MethodBind.get("OpenXRSpatialComponentPolygon2DList", "get_transform", 1965739696L), hostObject.objectPtr, index)

}

object OpenXRSpatialComponentPolygon2DList {
  /** Class metadata for Gd[OpenXRSpatialComponentPolygon2DList] lifetime management and casting. */
  given GodotClass[OpenXRSpatialComponentPolygon2DList] with {
    def className = "OpenXRSpatialComponentPolygon2DList"
    def isRefCounted = true
    def wrap(o: GodotObject): OpenXRSpatialComponentPolygon2DList = new OpenXRSpatialComponentPolygon2DList {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRSpatialComponentPolygon2DList): GodotObject = t.hostObject
  }
}
