package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRMarkerTracker`, extends `OpenXRSpatialEntityTracker`. */
abstract class OpenXRMarkerTracker extends OpenXRSpatialEntityTracker {
  override def godotClassName: String = "OpenXRMarkerTracker"

  /** OpenXRMarkerTracker.set_bounds_size */
  final def setBoundsSize(bounds_size: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRMarkerTracker", "set_bounds_size", 743155724L), hostObject.objectPtr, bounds_size)

  /** OpenXRMarkerTracker.get_bounds_size */
  final def getBoundsSize(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("OpenXRMarkerTracker", "get_bounds_size", 3341600327L), hostObject.objectPtr)

  /** OpenXRMarkerTracker.set_marker_type */
  final def setMarkerType(marker_type: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRMarkerTracker", "set_marker_type", 2156241362L), hostObject.objectPtr, marker_type)

  /** OpenXRMarkerTracker.get_marker_type */
  final def getMarkerType(): Long =
    Ptrcall.call0[Long](MethodBind.get("OpenXRMarkerTracker", "get_marker_type", 612702862L), hostObject.objectPtr)

  /** OpenXRMarkerTracker.set_marker_id */
  final def setMarkerId(marker_id: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRMarkerTracker", "set_marker_id", 1286410249L), hostObject.objectPtr, marker_id)

  /** OpenXRMarkerTracker.get_marker_id */
  final def getMarkerId(): Long =
    Ptrcall.call0[Long](MethodBind.get("OpenXRMarkerTracker", "get_marker_id", 3905245786L), hostObject.objectPtr)

}
