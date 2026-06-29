package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `MissingResource`, extends `Resource`. */
abstract class MissingResource extends Resource {
  override def godotClassName: String = "MissingResource"

  /** MissingResource.set_original_class */
  final def setOriginalClass(name: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("MissingResource", "set_original_class", 83702148L), hostObject.objectPtr, name)

  /** MissingResource.get_original_class */
  final def getOriginalClass(): String =
    Ptrcall.call0[String](MethodBind.get("MissingResource", "get_original_class", 201670096L), hostObject.objectPtr)

  /** MissingResource.set_recording_properties */
  final def setRecordingProperties(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("MissingResource", "set_recording_properties", 2586408642L), hostObject.objectPtr, enable)

  /** MissingResource.is_recording_properties */
  final def isRecordingProperties(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("MissingResource", "is_recording_properties", 36873697L), hostObject.objectPtr)

}
