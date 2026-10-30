package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OpenXRAnchorTracker`, extends `OpenXRSpatialEntityTracker`. */
abstract class OpenXRAnchorTracker extends OpenXRSpatialEntityTracker {
  override def godotClassName: String = "OpenXRAnchorTracker"

  /** OpenXRAnchorTracker.has_uuid */
  final def hasUuid(): Boolean = {
    if (gdext.classes.OpenXRAnchorTracker.mb_has_uuid == null) gdext.classes.OpenXRAnchorTracker.mb_has_uuid = MethodBind.get("OpenXRAnchorTracker", "has_uuid", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.OpenXRAnchorTracker.mb_has_uuid, livePtr)
  }

  /** OpenXRAnchorTracker.set_uuid */
  final def setUuid(uuid: String): Unit = {
    if (gdext.classes.OpenXRAnchorTracker.mb_set_uuid == null) gdext.classes.OpenXRAnchorTracker.mb_set_uuid = MethodBind.get("OpenXRAnchorTracker", "set_uuid", 83702148L)
    Ptrcall.callVoid1(gdext.classes.OpenXRAnchorTracker.mb_set_uuid, livePtr, uuid)
  }

  /** OpenXRAnchorTracker.get_uuid */
  final def getUuid(): String = {
    if (gdext.classes.OpenXRAnchorTracker.mb_get_uuid == null) gdext.classes.OpenXRAnchorTracker.mb_get_uuid = MethodBind.get("OpenXRAnchorTracker", "get_uuid", 201670096L)
    Ptrcall.call0[String](gdext.classes.OpenXRAnchorTracker.mb_get_uuid, livePtr)
  }

}

object OpenXRAnchorTracker {
  private[classes] var mb_has_uuid: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_uuid: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_uuid: GDExtensionMethodBindPtr = null
}
