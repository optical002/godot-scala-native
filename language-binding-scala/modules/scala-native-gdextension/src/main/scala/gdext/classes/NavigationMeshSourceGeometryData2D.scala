package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `NavigationMeshSourceGeometryData2D`, extends `Resource`. */
abstract class NavigationMeshSourceGeometryData2D extends Resource {
  override def godotClassName: String = "NavigationMeshSourceGeometryData2D"

  /** NavigationMeshSourceGeometryData2D.clear */
  final def clear(): Unit =
    Ptrcall.callVoid0(MethodBind.get("NavigationMeshSourceGeometryData2D", "clear", 3218959716L), hostObject.objectPtr)

  /** NavigationMeshSourceGeometryData2D.has_data */
  final def hasData(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("NavigationMeshSourceGeometryData2D", "has_data", 2240911060L), hostObject.objectPtr)

  /** NavigationMeshSourceGeometryData2D.merge */
  final def merge(other_geometry: NavigationMeshSourceGeometryData2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationMeshSourceGeometryData2D", "merge", 742424872L), hostObject.objectPtr, other_geometry.hostObject)

  /** NavigationMeshSourceGeometryData2D.clear_projected_obstructions */
  final def clearProjectedObstructions(): Unit =
    Ptrcall.callVoid0(MethodBind.get("NavigationMeshSourceGeometryData2D", "clear_projected_obstructions", 3218959716L), hostObject.objectPtr)

  /** NavigationMeshSourceGeometryData2D.get_bounds */
  final def getBounds(): gdext.builtin.Rect2 =
    Ptrcall.call0[gdext.builtin.Rect2](MethodBind.get("NavigationMeshSourceGeometryData2D", "get_bounds", 3248174L), hostObject.objectPtr)

}
