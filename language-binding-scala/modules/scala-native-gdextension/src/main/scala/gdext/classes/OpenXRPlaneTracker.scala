package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OpenXRPlaneTracker`, extends `OpenXRSpatialEntityTracker`. */
abstract class OpenXRPlaneTracker extends OpenXRSpatialEntityTracker {
  override def godotClassName: String = "OpenXRPlaneTracker"

  /** OpenXRPlaneTracker.set_bounds_size */
  final def setBoundsSize(boundsSize: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.OpenXRPlaneTracker.mb_set_bounds_size == null) gdext.classes.OpenXRPlaneTracker.mb_set_bounds_size = MethodBind.get("OpenXRPlaneTracker", "set_bounds_size", 743155724L)
    Ptrcall.callVoid1(gdext.classes.OpenXRPlaneTracker.mb_set_bounds_size, livePtr, boundsSize)
  }

  /** OpenXRPlaneTracker.get_bounds_size */
  final def getBoundsSize(): gdext.builtin.Vector2 = {
    if (gdext.classes.OpenXRPlaneTracker.mb_get_bounds_size == null) gdext.classes.OpenXRPlaneTracker.mb_get_bounds_size = MethodBind.get("OpenXRPlaneTracker", "get_bounds_size", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.OpenXRPlaneTracker.mb_get_bounds_size, livePtr)
  }

  /** OpenXRPlaneTracker.set_plane_alignment */
  final def setPlaneAlignment(planeAlignment: gdext.classes.OpenXRSpatialComponentPlaneAlignmentList.PlaneAlignment): Unit = {
    if (gdext.classes.OpenXRPlaneTracker.mb_set_plane_alignment == null) gdext.classes.OpenXRPlaneTracker.mb_set_plane_alignment = MethodBind.get("OpenXRPlaneTracker", "set_plane_alignment", 1214382230L)
    Ptrcall.callVoid1(gdext.classes.OpenXRPlaneTracker.mb_set_plane_alignment, livePtr, planeAlignment)
  }

  /** OpenXRPlaneTracker.get_plane_alignment */
  final def getPlaneAlignment(): gdext.classes.OpenXRSpatialComponentPlaneAlignmentList.PlaneAlignment = {
    if (gdext.classes.OpenXRPlaneTracker.mb_get_plane_alignment == null) gdext.classes.OpenXRPlaneTracker.mb_get_plane_alignment = MethodBind.get("OpenXRPlaneTracker", "get_plane_alignment", 845541441L)
    gdext.classes.OpenXRSpatialComponentPlaneAlignmentList.PlaneAlignment(Ptrcall.call0[Long](gdext.classes.OpenXRPlaneTracker.mb_get_plane_alignment, livePtr))
  }

  /** OpenXRPlaneTracker.set_plane_label */
  final def setPlaneLabel(planeLabel: String): Unit = {
    if (gdext.classes.OpenXRPlaneTracker.mb_set_plane_label == null) gdext.classes.OpenXRPlaneTracker.mb_set_plane_label = MethodBind.get("OpenXRPlaneTracker", "set_plane_label", 83702148L)
    Ptrcall.callVoid1(gdext.classes.OpenXRPlaneTracker.mb_set_plane_label, livePtr, planeLabel)
  }

  /** OpenXRPlaneTracker.get_plane_label */
  final def getPlaneLabel(): String = {
    if (gdext.classes.OpenXRPlaneTracker.mb_get_plane_label == null) gdext.classes.OpenXRPlaneTracker.mb_get_plane_label = MethodBind.get("OpenXRPlaneTracker", "get_plane_label", 201670096L)
    Ptrcall.call0[String](gdext.classes.OpenXRPlaneTracker.mb_get_plane_label, livePtr)
  }

  /** OpenXRPlaneTracker.clear_mesh_data */
  final def clearMeshData(): Unit = {
    if (gdext.classes.OpenXRPlaneTracker.mb_clear_mesh_data == null) gdext.classes.OpenXRPlaneTracker.mb_clear_mesh_data = MethodBind.get("OpenXRPlaneTracker", "clear_mesh_data", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.OpenXRPlaneTracker.mb_clear_mesh_data, livePtr)
  }

  /** OpenXRPlaneTracker.get_mesh_offset */
  final def getMeshOffset(): gdext.builtin.Transform3D = {
    if (gdext.classes.OpenXRPlaneTracker.mb_get_mesh_offset == null) gdext.classes.OpenXRPlaneTracker.mb_get_mesh_offset = MethodBind.get("OpenXRPlaneTracker", "get_mesh_offset", 3229777777L)
    Ptrcall.call0[gdext.builtin.Transform3D](gdext.classes.OpenXRPlaneTracker.mb_get_mesh_offset, livePtr)
  }

  /** OpenXRPlaneTracker.get_mesh. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getMesh(): Mesh = {
    if (gdext.classes.OpenXRPlaneTracker.mb_get_mesh == null) gdext.classes.OpenXRPlaneTracker.mb_get_mesh = MethodBind.get("OpenXRPlaneTracker", "get_mesh", 4081188045L)
    Wrappers.owned[Mesh](Ptrcall.call0[Long](gdext.classes.OpenXRPlaneTracker.mb_get_mesh, livePtr))
  }

  /** OpenXRPlaneTracker.get_shape. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getShape(thickness: Double = 0.01): Shape3D = {
    if (gdext.classes.OpenXRPlaneTracker.mb_get_shape == null) gdext.classes.OpenXRPlaneTracker.mb_get_shape = MethodBind.get("OpenXRPlaneTracker", "get_shape", 3358509884L)
    Wrappers.owned[Shape3D](Ptrcall.call1[Double, Long](gdext.classes.OpenXRPlaneTracker.mb_get_shape, livePtr, thickness))
  }

}

object OpenXRPlaneTracker {
  private[classes] var mb_set_bounds_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bounds_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_plane_alignment: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_plane_alignment: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_plane_label: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_plane_label: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_mesh_data: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_mesh_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_mesh: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_shape: GDExtensionMethodBindPtr = null
}
