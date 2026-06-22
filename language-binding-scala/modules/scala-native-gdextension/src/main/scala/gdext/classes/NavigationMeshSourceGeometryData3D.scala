package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `NavigationMeshSourceGeometryData3D`, extends `Resource`. */
abstract class NavigationMeshSourceGeometryData3D extends Resource {

  /** NavigationMeshSourceGeometryData3D.clear */
  final def clear(): Unit =
    Ptrcall.callVoid0(MethodBind.get("NavigationMeshSourceGeometryData3D", "clear", 3218959716L), hostObject.objectPtr)

  /** NavigationMeshSourceGeometryData3D.has_data */
  final def hasData(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("NavigationMeshSourceGeometryData3D", "has_data", 2240911060L), hostObject.objectPtr)

  /** NavigationMeshSourceGeometryData3D.add_mesh */
  final def addMesh(mesh: Mesh, xform: gdext.builtin.Transform3D): Unit =
    Ptrcall.callVoid2(MethodBind.get("NavigationMeshSourceGeometryData3D", "add_mesh", 975462459L), hostObject.objectPtr, mesh.hostObject, xform)

  /** NavigationMeshSourceGeometryData3D.merge */
  final def merge(other_geometry: NavigationMeshSourceGeometryData3D): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationMeshSourceGeometryData3D", "merge", 655828145L), hostObject.objectPtr, other_geometry.hostObject)

  /** NavigationMeshSourceGeometryData3D.clear_projected_obstructions */
  final def clearProjectedObstructions(): Unit =
    Ptrcall.callVoid0(MethodBind.get("NavigationMeshSourceGeometryData3D", "clear_projected_obstructions", 3218959716L), hostObject.objectPtr)

  /** NavigationMeshSourceGeometryData3D.get_bounds */
  final def getBounds(): gdext.builtin.AABB =
    Ptrcall.call0[gdext.builtin.AABB](MethodBind.get("NavigationMeshSourceGeometryData3D", "get_bounds", 1021181044L), hostObject.objectPtr)

}

object NavigationMeshSourceGeometryData3D {
  /** Class metadata for Gd[NavigationMeshSourceGeometryData3D] lifetime management and casting. */
  given GodotClass[NavigationMeshSourceGeometryData3D] with {
    def className = "NavigationMeshSourceGeometryData3D"
    def isRefCounted = true
    def wrap(o: GodotObject): NavigationMeshSourceGeometryData3D = new NavigationMeshSourceGeometryData3D {}.withHost(o.objectPtr)
    def unwrap(t: NavigationMeshSourceGeometryData3D): GodotObject = t.hostObject
  }
}
