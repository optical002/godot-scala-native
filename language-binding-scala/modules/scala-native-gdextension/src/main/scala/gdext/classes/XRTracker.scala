package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `XRTracker`, extends `RefCounted`. */
abstract class XRTracker extends RefCounted {
  override def godotClassName: String = "XRTracker"

  /** XRTracker.get_tracker_type */
  final def getTrackerType(): Long =
    Ptrcall.call0[Long](MethodBind.get("XRTracker", "get_tracker_type", 2784508102L), hostObject.objectPtr)

  /** XRTracker.set_tracker_type */
  final def setTrackerType(`type`: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("XRTracker", "set_tracker_type", 3055763575L), hostObject.objectPtr, `type`)

  /** XRTracker.get_tracker_name */
  final def getTrackerName(): gdext.builtin.StringName =
    Ptrcall.call0[gdext.builtin.StringName](MethodBind.get("XRTracker", "get_tracker_name", 2002593661L), hostObject.objectPtr)

  /** XRTracker.set_tracker_name */
  final def setTrackerName(name: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("XRTracker", "set_tracker_name", 3304788590L), hostObject.objectPtr, name)

  /** XRTracker.get_tracker_desc */
  final def getTrackerDesc(): String =
    Ptrcall.call0[String](MethodBind.get("XRTracker", "get_tracker_desc", 201670096L), hostObject.objectPtr)

  /** XRTracker.set_tracker_desc */
  final def setTrackerDesc(description: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("XRTracker", "set_tracker_desc", 83702148L), hostObject.objectPtr, description)

}
