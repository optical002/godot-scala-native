package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRSpatialComponentPersistenceList`, extends `OpenXRSpatialComponentData`. */
abstract class OpenXRSpatialComponentPersistenceList extends OpenXRSpatialComponentData {
  override def godotClassName: String = "OpenXRSpatialComponentPersistenceList"

  /** OpenXRSpatialComponentPersistenceList.get_persistent_uuid */
  final def getPersistentUuid(index: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("OpenXRSpatialComponentPersistenceList", "get_persistent_uuid", 844755477L), hostObject.objectPtr, index)

  /** OpenXRSpatialComponentPersistenceList.get_persistent_state */
  final def getPersistentState(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("OpenXRSpatialComponentPersistenceList", "get_persistent_state", 923996154L), hostObject.objectPtr, index)

}
