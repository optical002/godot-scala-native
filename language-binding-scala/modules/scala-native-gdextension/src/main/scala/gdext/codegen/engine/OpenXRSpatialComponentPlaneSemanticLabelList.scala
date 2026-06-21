package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRSpatialComponentPlaneSemanticLabelList`, extends `OpenXRSpatialComponentData`. */
abstract class OpenXRSpatialComponentPlaneSemanticLabelList extends OpenXRSpatialComponentData {

  /** OpenXRSpatialComponentPlaneSemanticLabelList.get_plane_semantic_label */
  final def getPlaneSemanticLabel(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("OpenXRSpatialComponentPlaneSemanticLabelList", "get_plane_semantic_label", 1889332427L), hostObject.objectPtr, index)

}

object OpenXRSpatialComponentPlaneSemanticLabelList {
  /** Class metadata for Gd[OpenXRSpatialComponentPlaneSemanticLabelList] lifetime management and casting. */
  given GodotClass[OpenXRSpatialComponentPlaneSemanticLabelList] with {
    def className = "OpenXRSpatialComponentPlaneSemanticLabelList"
    def isRefCounted = true
    def wrap(o: GodotObject): OpenXRSpatialComponentPlaneSemanticLabelList = new OpenXRSpatialComponentPlaneSemanticLabelList {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRSpatialComponentPlaneSemanticLabelList): GodotObject = t.hostObject
  }
}
