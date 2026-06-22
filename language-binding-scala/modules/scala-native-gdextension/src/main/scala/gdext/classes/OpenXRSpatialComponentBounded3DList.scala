package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRSpatialComponentBounded3DList`, extends `OpenXRSpatialComponentData`. */
abstract class OpenXRSpatialComponentBounded3DList extends OpenXRSpatialComponentData {

  /** OpenXRSpatialComponentBounded3DList.get_center_pose */
  final def getCenterPose(index: Long): gdext.builtin.Transform3D =
    Ptrcall.call1[Long, gdext.builtin.Transform3D](MethodBind.get("OpenXRSpatialComponentBounded3DList", "get_center_pose", 1965739696L), hostObject.objectPtr, index)

  /** OpenXRSpatialComponentBounded3DList.get_size */
  final def getSize(index: Long): gdext.builtin.Vector3 =
    Ptrcall.call1[Long, gdext.builtin.Vector3](MethodBind.get("OpenXRSpatialComponentBounded3DList", "get_size", 711720468L), hostObject.objectPtr, index)

}

object OpenXRSpatialComponentBounded3DList {
  /** Class metadata for Gd[OpenXRSpatialComponentBounded3DList] lifetime management and casting. */
  given GodotClass[OpenXRSpatialComponentBounded3DList] with {
    def className = "OpenXRSpatialComponentBounded3DList"
    def isRefCounted = true
    def wrap(o: GodotObject): OpenXRSpatialComponentBounded3DList = new OpenXRSpatialComponentBounded3DList {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRSpatialComponentBounded3DList): GodotObject = t.hostObject
  }
}
