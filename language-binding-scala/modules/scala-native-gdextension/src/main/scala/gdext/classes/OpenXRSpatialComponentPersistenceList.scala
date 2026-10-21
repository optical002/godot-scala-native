package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OpenXRSpatialComponentPersistenceList`, extends `OpenXRSpatialComponentData`. */
abstract class OpenXRSpatialComponentPersistenceList extends OpenXRSpatialComponentData {
  override def godotClassName: String = "OpenXRSpatialComponentPersistenceList"

  /** OpenXRSpatialComponentPersistenceList.get_persistent_uuid */
  final def getPersistentUuid(index: Long): String = {
    if (gdext.classes.OpenXRSpatialComponentPersistenceList.mb_get_persistent_uuid == null) gdext.classes.OpenXRSpatialComponentPersistenceList.mb_get_persistent_uuid = MethodBind.get("OpenXRSpatialComponentPersistenceList", "get_persistent_uuid", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.OpenXRSpatialComponentPersistenceList.mb_get_persistent_uuid, livePtr, index)
  }

  /** OpenXRSpatialComponentPersistenceList.get_persistent_state */
  final def getPersistentState(index: Long): Long = {
    if (gdext.classes.OpenXRSpatialComponentPersistenceList.mb_get_persistent_state == null) gdext.classes.OpenXRSpatialComponentPersistenceList.mb_get_persistent_state = MethodBind.get("OpenXRSpatialComponentPersistenceList", "get_persistent_state", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.OpenXRSpatialComponentPersistenceList.mb_get_persistent_state, livePtr, index)
  }

}

object OpenXRSpatialComponentPersistenceList {
  private[classes] var mb_get_persistent_uuid: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_persistent_state: GDExtensionMethodBindPtr = null
}
