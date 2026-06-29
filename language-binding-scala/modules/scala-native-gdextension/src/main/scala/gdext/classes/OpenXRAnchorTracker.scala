package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRAnchorTracker`, extends `OpenXRSpatialEntityTracker`. */
abstract class OpenXRAnchorTracker extends OpenXRSpatialEntityTracker {
  override def godotClassName: String = "OpenXRAnchorTracker"

  /** OpenXRAnchorTracker.has_uuid */
  final def hasUuid(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("OpenXRAnchorTracker", "has_uuid", 36873697L), hostObject.objectPtr)

  /** OpenXRAnchorTracker.set_uuid */
  final def setUuid(uuid: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRAnchorTracker", "set_uuid", 83702148L), hostObject.objectPtr, uuid)

  /** OpenXRAnchorTracker.get_uuid */
  final def getUuid(): String =
    Ptrcall.call0[String](MethodBind.get("OpenXRAnchorTracker", "get_uuid", 201670096L), hostObject.objectPtr)

}
