package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `MissingResource`, extends `Resource`. */
abstract class MissingResource extends Resource {
  override def godotClassName: String = "MissingResource"

  /** MissingResource.set_original_class */
  final def setOriginalClass(name: String): Unit = {
    if (gdext.classes.MissingResource.mb_set_original_class == null) gdext.classes.MissingResource.mb_set_original_class = MethodBind.get("MissingResource", "set_original_class", 83702148L)
    Ptrcall.callVoid1(gdext.classes.MissingResource.mb_set_original_class, livePtr, name)
  }

  /** MissingResource.get_original_class */
  final def getOriginalClass(): String = {
    if (gdext.classes.MissingResource.mb_get_original_class == null) gdext.classes.MissingResource.mb_get_original_class = MethodBind.get("MissingResource", "get_original_class", 201670096L)
    Ptrcall.call0[String](gdext.classes.MissingResource.mb_get_original_class, livePtr)
  }

  /** MissingResource.set_recording_properties */
  final def setRecordingProperties(enable: Boolean): Unit = {
    if (gdext.classes.MissingResource.mb_set_recording_properties == null) gdext.classes.MissingResource.mb_set_recording_properties = MethodBind.get("MissingResource", "set_recording_properties", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.MissingResource.mb_set_recording_properties, livePtr, enable)
  }

  /** MissingResource.is_recording_properties */
  final def isRecordingProperties(): Boolean = {
    if (gdext.classes.MissingResource.mb_is_recording_properties == null) gdext.classes.MissingResource.mb_is_recording_properties = MethodBind.get("MissingResource", "is_recording_properties", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.MissingResource.mb_is_recording_properties, livePtr)
  }

}

object MissingResource {
  private[classes] var mb_set_original_class: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_original_class: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_recording_properties: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_recording_properties: GDExtensionMethodBindPtr = null
}
