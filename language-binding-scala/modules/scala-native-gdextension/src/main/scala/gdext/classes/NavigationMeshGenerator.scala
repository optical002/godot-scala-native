package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `NavigationMeshGenerator`, extends `Object`. */
abstract class NavigationMeshGenerator extends Object {

  /** NavigationMeshGenerator.bake */
  final def bake(navigation_mesh: NavigationMesh, root_node: Node): Unit =
    Ptrcall.callVoid2(MethodBind.get("NavigationMeshGenerator", "bake", 1401173477L), hostObject.objectPtr, navigation_mesh.hostObject, root_node.hostObject)

  /** NavigationMeshGenerator.clear */
  final def clear(navigation_mesh: NavigationMesh): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationMeshGenerator", "clear", 2923361153L), hostObject.objectPtr, navigation_mesh.hostObject)

}

object NavigationMeshGenerator {
  /** Class metadata for Gd[NavigationMeshGenerator] lifetime management and casting. */
  given GodotClass[NavigationMeshGenerator] with {
    def className = "NavigationMeshGenerator"
    def isRefCounted = false
    def wrap(o: GodotObject): NavigationMeshGenerator = new NavigationMeshGenerator {}.withHost(o.objectPtr)
    def unwrap(t: NavigationMeshGenerator): GodotObject = t.hostObject
  }

  /** The process-global NavigationMeshGenerator singleton instance. */
  def singleton: NavigationMeshGenerator = new NavigationMeshGenerator {}
    .withHost(Godot.interface.global_get_singleton(
      StringNames.cached("NavigationMeshGenerator").ptr))
}
