package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRSpatialComponentPersistenceList`, extends `OpenXRSpatialComponentData`. */
abstract class OpenXRSpatialComponentPersistenceList extends OpenXRSpatialComponentData {

  /** OpenXRSpatialComponentPersistenceList.get_persistent_uuid */
  final def getPersistentUuid(index: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("OpenXRSpatialComponentPersistenceList", "get_persistent_uuid", 844755477L), hostObject.objectPtr, index)

  /** OpenXRSpatialComponentPersistenceList.get_persistent_state */
  final def getPersistentState(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("OpenXRSpatialComponentPersistenceList", "get_persistent_state", 923996154L), hostObject.objectPtr, index)

}

object OpenXRSpatialComponentPersistenceList {
  /** Class metadata for Gd[OpenXRSpatialComponentPersistenceList] lifetime management and casting. */
  given GodotClass[OpenXRSpatialComponentPersistenceList] with {
    def className = "OpenXRSpatialComponentPersistenceList"
    def isRefCounted = true
    def wrap(o: GodotObject): OpenXRSpatialComponentPersistenceList = new OpenXRSpatialComponentPersistenceList {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRSpatialComponentPersistenceList): GodotObject = t.hostObject
  }
}
