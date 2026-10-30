package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OpenXRMarkerTracker`, extends `OpenXRSpatialEntityTracker`. */
abstract class OpenXRMarkerTracker extends OpenXRSpatialEntityTracker {
  override def godotClassName: String = "OpenXRMarkerTracker"

  /** OpenXRMarkerTracker.set_bounds_size */
  final def setBoundsSize(boundsSize: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.OpenXRMarkerTracker.mb_set_bounds_size == null) gdext.classes.OpenXRMarkerTracker.mb_set_bounds_size = MethodBind.get("OpenXRMarkerTracker", "set_bounds_size", 743155724L)
    Ptrcall.callVoid1(gdext.classes.OpenXRMarkerTracker.mb_set_bounds_size, livePtr, boundsSize)
  }

  /** OpenXRMarkerTracker.get_bounds_size */
  final def getBoundsSize(): gdext.builtin.Vector2 = {
    if (gdext.classes.OpenXRMarkerTracker.mb_get_bounds_size == null) gdext.classes.OpenXRMarkerTracker.mb_get_bounds_size = MethodBind.get("OpenXRMarkerTracker", "get_bounds_size", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.OpenXRMarkerTracker.mb_get_bounds_size, livePtr)
  }

  /** OpenXRMarkerTracker.set_marker_type */
  final def setMarkerType(markerType: gdext.classes.OpenXRSpatialComponentMarkerList.MarkerType): Unit = {
    if (gdext.classes.OpenXRMarkerTracker.mb_set_marker_type == null) gdext.classes.OpenXRMarkerTracker.mb_set_marker_type = MethodBind.get("OpenXRMarkerTracker", "set_marker_type", 2156241362L)
    Ptrcall.callVoid1(gdext.classes.OpenXRMarkerTracker.mb_set_marker_type, livePtr, markerType)
  }

  /** OpenXRMarkerTracker.get_marker_type */
  final def getMarkerType(): gdext.classes.OpenXRSpatialComponentMarkerList.MarkerType = {
    if (gdext.classes.OpenXRMarkerTracker.mb_get_marker_type == null) gdext.classes.OpenXRMarkerTracker.mb_get_marker_type = MethodBind.get("OpenXRMarkerTracker", "get_marker_type", 612702862L)
    gdext.classes.OpenXRSpatialComponentMarkerList.MarkerType(Ptrcall.call0[Long](gdext.classes.OpenXRMarkerTracker.mb_get_marker_type, livePtr))
  }

  /** OpenXRMarkerTracker.set_marker_id */
  final def setMarkerId(markerId: Long): Unit = {
    if (gdext.classes.OpenXRMarkerTracker.mb_set_marker_id == null) gdext.classes.OpenXRMarkerTracker.mb_set_marker_id = MethodBind.get("OpenXRMarkerTracker", "set_marker_id", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.OpenXRMarkerTracker.mb_set_marker_id, livePtr, markerId)
  }

  /** OpenXRMarkerTracker.get_marker_id */
  final def getMarkerId(): Long = {
    if (gdext.classes.OpenXRMarkerTracker.mb_get_marker_id == null) gdext.classes.OpenXRMarkerTracker.mb_get_marker_id = MethodBind.get("OpenXRMarkerTracker", "get_marker_id", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.OpenXRMarkerTracker.mb_get_marker_id, livePtr)
  }

}

object OpenXRMarkerTracker {
  private[classes] var mb_set_bounds_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bounds_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_marker_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_marker_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_marker_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_marker_id: GDExtensionMethodBindPtr = null
}
