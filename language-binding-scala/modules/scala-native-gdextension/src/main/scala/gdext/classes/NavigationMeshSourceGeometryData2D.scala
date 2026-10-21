package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `NavigationMeshSourceGeometryData2D`, extends `Resource`. */
abstract class NavigationMeshSourceGeometryData2D extends Resource {
  override def godotClassName: String = "NavigationMeshSourceGeometryData2D"

  /** NavigationMeshSourceGeometryData2D.clear */
  final def clear(): Unit = {
    if (gdext.classes.NavigationMeshSourceGeometryData2D.mb_clear == null) gdext.classes.NavigationMeshSourceGeometryData2D.mb_clear = MethodBind.get("NavigationMeshSourceGeometryData2D", "clear", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.NavigationMeshSourceGeometryData2D.mb_clear, livePtr)
  }

  /** NavigationMeshSourceGeometryData2D.has_data */
  final def hasData(): Boolean = {
    if (gdext.classes.NavigationMeshSourceGeometryData2D.mb_has_data == null) gdext.classes.NavigationMeshSourceGeometryData2D.mb_has_data = MethodBind.get("NavigationMeshSourceGeometryData2D", "has_data", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.NavigationMeshSourceGeometryData2D.mb_has_data, livePtr)
  }

  /** NavigationMeshSourceGeometryData2D.merge */
  final def merge(other_geometry: NavigationMeshSourceGeometryData2D): Unit = {
    if (gdext.classes.NavigationMeshSourceGeometryData2D.mb_merge == null) gdext.classes.NavigationMeshSourceGeometryData2D.mb_merge = MethodBind.get("NavigationMeshSourceGeometryData2D", "merge", 742424872L)
    Ptrcall.callVoid1(gdext.classes.NavigationMeshSourceGeometryData2D.mb_merge, livePtr, Wrappers.handle(other_geometry))
  }

  /** NavigationMeshSourceGeometryData2D.clear_projected_obstructions */
  final def clearProjectedObstructions(): Unit = {
    if (gdext.classes.NavigationMeshSourceGeometryData2D.mb_clear_projected_obstructions == null) gdext.classes.NavigationMeshSourceGeometryData2D.mb_clear_projected_obstructions = MethodBind.get("NavigationMeshSourceGeometryData2D", "clear_projected_obstructions", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.NavigationMeshSourceGeometryData2D.mb_clear_projected_obstructions, livePtr)
  }

  /** NavigationMeshSourceGeometryData2D.get_bounds */
  final def getBounds(): gdext.builtin.Rect2 = {
    if (gdext.classes.NavigationMeshSourceGeometryData2D.mb_get_bounds == null) gdext.classes.NavigationMeshSourceGeometryData2D.mb_get_bounds = MethodBind.get("NavigationMeshSourceGeometryData2D", "get_bounds", 3248174L)
    Ptrcall.call0[gdext.builtin.Rect2](gdext.classes.NavigationMeshSourceGeometryData2D.mb_get_bounds, livePtr)
  }

}

object NavigationMeshSourceGeometryData2D {
  private[classes] var mb_clear: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_data: GDExtensionMethodBindPtr = null
  private[classes] var mb_merge: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_projected_obstructions: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bounds: GDExtensionMethodBindPtr = null
}
