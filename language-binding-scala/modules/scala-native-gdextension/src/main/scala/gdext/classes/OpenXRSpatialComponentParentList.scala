package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRSpatialComponentParentList`, extends `OpenXRSpatialComponentData`. */
abstract class OpenXRSpatialComponentParentList extends OpenXRSpatialComponentData {

}

object OpenXRSpatialComponentParentList {
  /** Class metadata for Gd[OpenXRSpatialComponentParentList] lifetime management and casting. */
  given GodotClass[OpenXRSpatialComponentParentList] with {
    def className = "OpenXRSpatialComponentParentList"
    def isRefCounted = true
    def wrap(o: GodotObject): OpenXRSpatialComponentParentList = new OpenXRSpatialComponentParentList {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRSpatialComponentParentList): GodotObject = t.hostObject
  }
}
