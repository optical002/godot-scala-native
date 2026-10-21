package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `NavigationMeshSourceGeometryData3D`, extends `Resource`. */
abstract class NavigationMeshSourceGeometryData3D extends Resource {
  override def godotClassName: String = "NavigationMeshSourceGeometryData3D"

  /** NavigationMeshSourceGeometryData3D.clear */
  final def clear(): Unit = {
    if (gdext.classes.NavigationMeshSourceGeometryData3D.mb_clear == null) gdext.classes.NavigationMeshSourceGeometryData3D.mb_clear = MethodBind.get("NavigationMeshSourceGeometryData3D", "clear", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.NavigationMeshSourceGeometryData3D.mb_clear, livePtr)
  }

  /** NavigationMeshSourceGeometryData3D.has_data */
  final def hasData(): Boolean = {
    if (gdext.classes.NavigationMeshSourceGeometryData3D.mb_has_data == null) gdext.classes.NavigationMeshSourceGeometryData3D.mb_has_data = MethodBind.get("NavigationMeshSourceGeometryData3D", "has_data", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.NavigationMeshSourceGeometryData3D.mb_has_data, livePtr)
  }

  /** NavigationMeshSourceGeometryData3D.add_mesh */
  final def addMesh(mesh: Mesh, xform: gdext.builtin.Transform3D): Unit = {
    if (gdext.classes.NavigationMeshSourceGeometryData3D.mb_add_mesh == null) gdext.classes.NavigationMeshSourceGeometryData3D.mb_add_mesh = MethodBind.get("NavigationMeshSourceGeometryData3D", "add_mesh", 975462459L)
    Ptrcall.callVoid2(gdext.classes.NavigationMeshSourceGeometryData3D.mb_add_mesh, livePtr, Wrappers.handle(mesh), xform)
  }

  /** NavigationMeshSourceGeometryData3D.merge */
  final def merge(other_geometry: NavigationMeshSourceGeometryData3D): Unit = {
    if (gdext.classes.NavigationMeshSourceGeometryData3D.mb_merge == null) gdext.classes.NavigationMeshSourceGeometryData3D.mb_merge = MethodBind.get("NavigationMeshSourceGeometryData3D", "merge", 655828145L)
    Ptrcall.callVoid1(gdext.classes.NavigationMeshSourceGeometryData3D.mb_merge, livePtr, Wrappers.handle(other_geometry))
  }

  /** NavigationMeshSourceGeometryData3D.clear_projected_obstructions */
  final def clearProjectedObstructions(): Unit = {
    if (gdext.classes.NavigationMeshSourceGeometryData3D.mb_clear_projected_obstructions == null) gdext.classes.NavigationMeshSourceGeometryData3D.mb_clear_projected_obstructions = MethodBind.get("NavigationMeshSourceGeometryData3D", "clear_projected_obstructions", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.NavigationMeshSourceGeometryData3D.mb_clear_projected_obstructions, livePtr)
  }

  /** NavigationMeshSourceGeometryData3D.get_bounds */
  final def getBounds(): gdext.builtin.AABB = {
    if (gdext.classes.NavigationMeshSourceGeometryData3D.mb_get_bounds == null) gdext.classes.NavigationMeshSourceGeometryData3D.mb_get_bounds = MethodBind.get("NavigationMeshSourceGeometryData3D", "get_bounds", 1021181044L)
    Ptrcall.call0[gdext.builtin.AABB](gdext.classes.NavigationMeshSourceGeometryData3D.mb_get_bounds, livePtr)
  }

}

object NavigationMeshSourceGeometryData3D {
  private[classes] var mb_clear: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_data: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_mesh: GDExtensionMethodBindPtr = null
  private[classes] var mb_merge: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_projected_obstructions: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bounds: GDExtensionMethodBindPtr = null
}
