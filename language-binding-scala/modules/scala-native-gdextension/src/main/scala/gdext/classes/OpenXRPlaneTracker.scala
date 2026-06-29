package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRPlaneTracker`, extends `OpenXRSpatialEntityTracker`. */
abstract class OpenXRPlaneTracker extends OpenXRSpatialEntityTracker {
  override def godotClassName: String = "OpenXRPlaneTracker"

  /** OpenXRPlaneTracker.set_bounds_size */
  final def setBoundsSize(bounds_size: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRPlaneTracker", "set_bounds_size", 743155724L), hostObject.objectPtr, bounds_size)

  /** OpenXRPlaneTracker.get_bounds_size */
  final def getBoundsSize(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("OpenXRPlaneTracker", "get_bounds_size", 3341600327L), hostObject.objectPtr)

  /** OpenXRPlaneTracker.set_plane_alignment */
  final def setPlaneAlignment(plane_alignment: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRPlaneTracker", "set_plane_alignment", 1214382230L), hostObject.objectPtr, plane_alignment)

  /** OpenXRPlaneTracker.get_plane_alignment */
  final def getPlaneAlignment(): Long =
    Ptrcall.call0[Long](MethodBind.get("OpenXRPlaneTracker", "get_plane_alignment", 845541441L), hostObject.objectPtr)

  /** OpenXRPlaneTracker.set_plane_label */
  final def setPlaneLabel(plane_label: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRPlaneTracker", "set_plane_label", 83702148L), hostObject.objectPtr, plane_label)

  /** OpenXRPlaneTracker.get_plane_label */
  final def getPlaneLabel(): String =
    Ptrcall.call0[String](MethodBind.get("OpenXRPlaneTracker", "get_plane_label", 201670096L), hostObject.objectPtr)

  /** OpenXRPlaneTracker.clear_mesh_data */
  final def clearMeshData(): Unit =
    Ptrcall.callVoid0(MethodBind.get("OpenXRPlaneTracker", "clear_mesh_data", 3218959716L), hostObject.objectPtr)

  /** OpenXRPlaneTracker.get_mesh_offset */
  final def getMeshOffset(): gdext.builtin.Transform3D =
    Ptrcall.call0[gdext.builtin.Transform3D](MethodBind.get("OpenXRPlaneTracker", "get_mesh_offset", 3229777777L), hostObject.objectPtr)

  /** OpenXRPlaneTracker.get_mesh */
  final def getMesh(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("OpenXRPlaneTracker", "get_mesh", 4081188045L), hostObject.objectPtr)

  /** OpenXRPlaneTracker.get_shape */
  final def getShape(thickness: Double): GodotObject =
    Ptrcall.call1[Double, GodotObject](MethodBind.get("OpenXRPlaneTracker", "get_shape", 3358509884L), hostObject.objectPtr, thickness)

}
