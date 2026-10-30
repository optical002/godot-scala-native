package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `XRTracker`, extends `RefCounted`. */
abstract class XRTracker extends RefCounted {
  override def godotClassName: String = "XRTracker"

  /** XRTracker.get_tracker_type */
  final def getTrackerType(): gdext.classes.XRServer.TrackerType = {
    if (gdext.classes.XRTracker.mb_get_tracker_type == null) gdext.classes.XRTracker.mb_get_tracker_type = MethodBind.get("XRTracker", "get_tracker_type", 2784508102L)
    gdext.classes.XRServer.TrackerType(Ptrcall.call0[Long](gdext.classes.XRTracker.mb_get_tracker_type, livePtr))
  }

  /** XRTracker.set_tracker_type */
  final def setTrackerType(`type`: gdext.classes.XRServer.TrackerType): Unit = {
    if (gdext.classes.XRTracker.mb_set_tracker_type == null) gdext.classes.XRTracker.mb_set_tracker_type = MethodBind.get("XRTracker", "set_tracker_type", 3055763575L)
    Ptrcall.callVoid1(gdext.classes.XRTracker.mb_set_tracker_type, livePtr, `type`)
  }

  /** XRTracker.get_tracker_name */
  final def getTrackerName(): String = {
    if (gdext.classes.XRTracker.mb_get_tracker_name == null) gdext.classes.XRTracker.mb_get_tracker_name = MethodBind.get("XRTracker", "get_tracker_name", 2002593661L)
    Ptrcall.call0[SnArg](gdext.classes.XRTracker.mb_get_tracker_name, livePtr)
  }

  /** XRTracker.set_tracker_name */
  final def setTrackerName(name: String): Unit = {
    if (gdext.classes.XRTracker.mb_set_tracker_name == null) gdext.classes.XRTracker.mb_set_tracker_name = MethodBind.get("XRTracker", "set_tracker_name", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.XRTracker.mb_set_tracker_name, livePtr, SnArg(name))
  }

  /** XRTracker.get_tracker_desc */
  final def getTrackerDesc(): String = {
    if (gdext.classes.XRTracker.mb_get_tracker_desc == null) gdext.classes.XRTracker.mb_get_tracker_desc = MethodBind.get("XRTracker", "get_tracker_desc", 201670096L)
    Ptrcall.call0[String](gdext.classes.XRTracker.mb_get_tracker_desc, livePtr)
  }

  /** XRTracker.set_tracker_desc */
  final def setTrackerDesc(description: String): Unit = {
    if (gdext.classes.XRTracker.mb_set_tracker_desc == null) gdext.classes.XRTracker.mb_set_tracker_desc = MethodBind.get("XRTracker", "set_tracker_desc", 83702148L)
    Ptrcall.callVoid1(gdext.classes.XRTracker.mb_set_tracker_desc, livePtr, description)
  }

}

object XRTracker {
  private[classes] var mb_get_tracker_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tracker_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tracker_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tracker_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tracker_desc: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tracker_desc: GDExtensionMethodBindPtr = null
}
