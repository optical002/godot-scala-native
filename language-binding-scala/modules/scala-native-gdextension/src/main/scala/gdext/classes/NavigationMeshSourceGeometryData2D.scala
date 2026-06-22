package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `NavigationMeshSourceGeometryData2D`, extends `Resource`. */
abstract class NavigationMeshSourceGeometryData2D extends Resource {

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

object NavigationMeshSourceGeometryData2D {
  /** Class metadata for Gd[NavigationMeshSourceGeometryData2D] lifetime management and casting. */
  given GodotClass[NavigationMeshSourceGeometryData2D] with {
    def className = "NavigationMeshSourceGeometryData2D"
    def isRefCounted = true
    def wrap(o: GodotObject): NavigationMeshSourceGeometryData2D = new NavigationMeshSourceGeometryData2D {}.withHost(o.objectPtr)
    def unwrap(t: NavigationMeshSourceGeometryData2D): GodotObject = t.hostObject
  }
}
