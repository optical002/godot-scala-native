package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRSpatialComponentAnchorList`, extends `OpenXRSpatialComponentData`. */
abstract class OpenXRSpatialComponentAnchorList extends OpenXRSpatialComponentData {

  /** OpenXRSpatialComponentAnchorList.get_entity_pose */
  final def getEntityPose(index: Long): gdext.builtin.Transform3D =
    Ptrcall.call1[Long, gdext.builtin.Transform3D](MethodBind.get("OpenXRSpatialComponentAnchorList", "get_entity_pose", 1965739696L), hostObject.objectPtr, index)

}

object OpenXRSpatialComponentAnchorList {
  /** Class metadata for Gd[OpenXRSpatialComponentAnchorList] lifetime management and casting. */
  given GodotClass[OpenXRSpatialComponentAnchorList] with {
    def className = "OpenXRSpatialComponentAnchorList"
    def isRefCounted = true
    def wrap(o: GodotObject): OpenXRSpatialComponentAnchorList = new OpenXRSpatialComponentAnchorList {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRSpatialComponentAnchorList): GodotObject = t.hostObject
  }
}
